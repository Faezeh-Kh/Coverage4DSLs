package coverage.dslSpecific;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;

import DSLSpecificCoverage.BranchSpecification;
import DSLSpecificCoverage.Condition;
import DSLSpecificCoverage.Context;
import DSLSpecificCoverage.CoverageByContent;
import DSLSpecificCoverage.CoverageOfReferenced;
import DSLSpecificCoverage.CoveredContents;
import DSLSpecificCoverage.DomainSpecificCoverage;
import DSLSpecificCoverage.ExclusionRule;
import DSLSpecificCoverage.Ignore;
import DSLSpecificCoverage.InclusionRule;
import DSLSpecificCoverage.LimitationType;
import DSLSpecificCoverage.LimitedIgnore;
import DSLSpecificCoverage.Rule;
import coverage.computation.TDLCoverageUtil;
import coverage.computation.TDLTestCaseCoverage;
import coverage.computation.TestCoverageReport;
import coverage.utilities.OCLInterpreter;

public class DSLSpecificCoverageExecutor {

	private TDLTestCaseCoverage testCaseCoverage;
	
	private DomainSpecificCoverage coverageRuleset;
	private HashMap<Context, List<EObject>> coverageContext_eobjects = new HashMap<>();
	
	private TestCoverageReport tcDslSpecificCoverageReport;
	private List<TestCoverageReport> tcCoverageReports = new ArrayList<>();
	
	private HashMap<BranchSpecification, List<EObject>> branchingRule_contextObjects = new HashMap<>();
	
	public DSLSpecificCoverageExecutor (TDLTestCaseCoverage testCaseCoverage, DomainSpecificCoverage coverageRuleset) {
		this.testCaseCoverage = testCaseCoverage;
		this.coverageRuleset = coverageRuleset;
	}
	
	public void runDSLSpecificCoverage() {
		String coverageTitle = TDLCoverageUtil.DSLSPECIFICCOVERAGE + "_" + coverageRuleset.getName();
		tcDslSpecificCoverageReport = new TestCoverageReport(coverageTitle);
		tcDslSpecificCoverageReport.setCoverableClasses(TDLCoverageUtil.getInstance().getCoverableClasses());
		tcDslSpecificCoverageReport.setObjects(testCaseCoverage.getAllModelObjects());
		
		//the initial coverage status is the one computed by the trace
		tcDslSpecificCoverageReport.setObjectCoverageStatus(testCaseCoverage.getTcObjectCoverageStatusByTrace());

		//finding eobjects of each context
		setCoverageContext_objects(coverageRuleset);
		coverageRuleset.getImports().forEach(crs -> setCoverageContext_objects(crs));
		
		//apply domain specific coverage while the coverage matrix changes
		boolean isCoverageMatrixChanged = true;
		while (isCoverageMatrixChanged) {
			List<String> objectCoverageStatus_pv = new ArrayList<>(tcDslSpecificCoverageReport.getObjectCoverageStatus());
			coverageContext_eobjects.entrySet().stream()
				.filter(entry -> !entry.getValue().isEmpty())
				.forEach(entry -> applyCoverageRules(entry.getKey().getRules(), entry.getValue()));
			isCoverageMatrixChanged = !Objects.equals(objectCoverageStatus_pv, tcDslSpecificCoverageReport.getObjectCoverageStatus());
		}
		tcDslSpecificCoverageReport.findNotCoverableObjects();
		tcDslSpecificCoverageReport.computeCoveragePercentage();
		if (hasGenericRules()) {
			tcDslSpecificCoverageReport.printCoverageResult(testCaseCoverage.getTestCaseName());
			tcCoverageReports.add(tcDslSpecificCoverageReport);
		}
		
		//if there are branchSpecification rules, compute branch coverage
		if (!branchingRule_contextObjects.isEmpty()) {
			tcCoverageReports.add((new DSLSpecificBranchCoverage(this)).runBranchCoverageComputation());
		}
	}

	private boolean hasGenericRules() {
		for (Context context:coverageRuleset.getContexts()) {
			if (context.getRules().stream().anyMatch(r -> 
				r instanceof InclusionRule || r instanceof ExclusionRule)) {
				return true;
			}
		}
		return false;
	}

	private void setCoverageContext_objects(DomainSpecificCoverage coverageRuleset) {
		coverageContext_eobjects= new HashMap<>();
		for (Context context : coverageRuleset.getContexts()) {
			if (coverageContext_eobjects.get(context) == null) {
				coverageContext_eobjects.put(context, new ArrayList<>());
			}
			coverageContext_eobjects.get(context).addAll(
					testCaseCoverage.getAllModelObjects().stream()
					.filter(o -> isContextInstance(context.getMetaclass().getName(), o))
					.toList());
		}
	}
	
	private boolean isContextInstance(String contextName, EObject object) {
		String objectTypeName = object.eClass().getName();
		if (objectTypeName.equals(contextName) ||
				object.eClass().getEAllSuperTypes().stream().
					filter(st -> st.getName().equals(contextName)).findAny().isPresent()) {
			return true;
		}
		return false;
	}
	
	//apply all the rules on the object (NOTE: rule's context = object type)
	public void applyCoverageRules(EList<Rule> rules, List<EObject> eObjects) {
		for (Rule rule:rules) {
			if (rule instanceof Ignore ignoreRule) {
				updateCoverableClasses(ignoreRule);
				eObjects.stream().filter(object -> isRuleConditionSatisfied(rule.getCondition(), object))
					.forEach(object -> runIgnoreRule(ignoreRule, object));
			}
			else if (rule instanceof LimitedIgnore limitedIgnoreRule) {
				eObjects.stream().filter(object -> isRuleConditionSatisfied(rule.getCondition(), object))
					.forEach(object -> runLimitedIgnoreRule(limitedIgnoreRule, object));
			}
			else if (rule instanceof CoverageOfReferenced refRule) {
				updateCoverableClasses(refRule);
				eObjects.stream().filter(object -> isRuleConditionSatisfied(rule.getCondition(), object))
					.forEach(object -> inferReferenceCoverage(refRule, object));
			}
			else if (rule instanceof CoverageByContent containmentRule) {
				updateCoverableClasses(containmentRule);
				eObjects.stream().filter(object -> isRuleConditionSatisfied(rule.getCondition(), object))
					.forEach(object -> inferContainerCoverage(containmentRule, object));
			}
			else if (rule instanceof BranchSpecification branchRule) {
				if (branchingRule_contextObjects.get(branchRule) == null) {
					branchingRule_contextObjects.put(branchRule, new ArrayList<>());
				}
				branchingRule_contextObjects.get(branchRule).addAll(
						eObjects.stream().filter(object -> 
							isRuleConditionSatisfied(rule.getCondition(), object)).toList());
			}
		}
	}
	
	private void updateCoverableClasses(CoverageByContent rule) {
		addCoverableClass(((Context) rule.eContainer()).getMetaclass());
	}

	private void updateCoverableClasses(CoverageOfReferenced rule) {
		rule.getReference().stream().forEach(r -> addCoverableClass((EClass) r.getEType()));
	}
	
	private void updateCoverableClasses(Ignore rule) {
		if (rule.isIgnoreSubtypes()) {
			removeCoverableClass_subClass(((Context) rule.eContainer()).getMetaclass());
		}
		else {
			removeCoverableClass(((Context) rule.eContainer()).getMetaclass());
		}
	}

	private void inferReferenceCoverage(CoverageOfReferenced r, EObject object) {
		for (EReference reference:r.getReference()) {
			EReference ref = (EReference) getMatchedFeature(object, reference.getName());
			if (ref != null) {
				Object referencedObject = object.eGet(ref);
				if (referencedObject != null) { 
					if (referencedObject instanceof EObject refObject) {
						tcDslSpecificCoverageReport.setObjectCoverage(refObject
								, tcDslSpecificCoverageReport.getObjectCoverage(object));
					}
					else if (referencedObject instanceof EObjectContainmentEList<?> refObjects) {
						refObjects.forEach(o -> tcDslSpecificCoverageReport.setObjectCoverage((EObject) o
								, tcDslSpecificCoverageReport.getObjectCoverage(object)));
					}
				}
			}
		}
	}

	private void inferContainerCoverage(CoverageByContent r, EObject object) {
		EReference ref = (EReference) getMatchedFeature(object, r.getContainmentReference().getName());
		if (ref == null) { return;}
		
		Object containedObject = object.eGet(ref);
		if (containedObject == null) { return; }
		
		if (containedObject instanceof EObject containee) {
			tcDslSpecificCoverageReport.setObjectCoverage(object
					, tcDslSpecificCoverageReport.getObjectCoverage(containee));
		}
		else if (containedObject instanceof EObjectContainmentEList<?> containees) {
			//if several objects are contained, set coverage based on the rule's multiplicity
			if (r.getMultiplicity() == CoveredContents.ONE) {
				coverContainerIfOneContaineeCovered(containees);
			}
			else {
				coverContainerIfAllContaineeCovered(containees);
			}
		}
	}
	
	private void coverContainerIfOneContaineeCovered(EObjectContainmentEList<?> containedObjects) {
		String containeeCoverage = TDLCoverageUtil.NOT_COVERED;
		for (Object containee:containedObjects) {
			containeeCoverage = tcDslSpecificCoverageReport.getObjectCoverage((EObject) containee);
			if (containeeCoverage == TDLCoverageUtil.COVERED) {
				break;
			}
		}
		tcDslSpecificCoverageReport.setObjectCoverage(((EObject) containedObjects.get(0)).eContainer()
				, containeeCoverage);
	}
	
	private void coverContainerIfAllContaineeCovered(EObjectContainmentEList<?> containedObjects) {
		int CoveredContentsCounter = 0;
		for (Object containee:containedObjects) {
			String containeeCoverage = tcDslSpecificCoverageReport.getObjectCoverage((EObject) containee);
			if (containeeCoverage == TDLCoverageUtil.COVERED) {
				CoveredContentsCounter++;
			}
		}
		if (CoveredContentsCounter == containedObjects.size()) {
			tcDslSpecificCoverageReport.setObjectCoverage(((EObject) containedObjects.get(0)).eContainer()
					, TDLCoverageUtil.COVERED);
		}
	}
	
	private void runLimitedIgnoreRule(LimitedIgnore rule, EObject object) {
		if (rule.getType() == LimitationType.CONTAINED_BY) {
			//ignore EObjects contained by one of the ContainerType classes
			if (rule.getContainerMetaclass().stream().
				anyMatch(c -> c.getName().equals(object.eContainer().eClass().getName()))) {
				tcDslSpecificCoverageReport.setObjectNotCoverable(object);
			}
		}
		else if (rule.getType() == LimitationType.NOT_CONTAINED_BY) {
			//ignore EObjects that are not contained by any of the ContainerType classes
			if (!rule.getContainerMetaclass().stream().
				anyMatch(c -> c.getName().equals(object.eContainer().eClass().getName()))) {
				tcDslSpecificCoverageReport.setObjectNotCoverable(object);
			}
		}
	}
	
	private void runIgnoreRule(Ignore rule, EObject object) {
		if (!rule.isIgnoreSubtypes() && !object.eClass().getName().equals(
				((Context) rule.eContainer()).getMetaclass().getName())) {
			return;
		}
		tcDslSpecificCoverageReport.setObjectNotCoverable(object);
	}
	
	private EStructuralFeature getMatchedFeature(EObject rootElement, String featureName){
		EStructuralFeature matchedFeature = rootElement.eClass().getEAllStructuralFeatures().stream().
				filter(f -> f.getName().equals(featureName)).findFirst().get();
		return matchedFeature;
	}
	
	private boolean isRuleConditionSatisfied(Condition condition, EObject object) {
		if (condition == null) {
			return true;
		}
		return (new OCLInterpreter()).isConstraintSatisfied(object, condition.getOCLConstraint());
	}
	
	public boolean isClassCoverable(EClass clazz) {
		return tcDslSpecificCoverageReport.getCoverableClasses().contains(clazz.getName());
	}
	
	//add a class and all of its sub classes
	public void addCoverableClass(EClass clazz) {
		if (!tcDslSpecificCoverageReport.getCoverableClasses().contains(clazz.getName())) {
			tcDslSpecificCoverageReport.getCoverableClasses().add(clazz.getName());
			List<String> notCoverableSubClasses = TDLCoverageUtil.getInstance()
					.getMetamodelRootElement().getEClassifiers().stream()
					.filter(c -> c instanceof EClass).map(c -> (EClass) c)
					.filter(c -> c.getEAllSuperTypes().stream().
							filter(sc -> sc.getName().equals(clazz.getName())).findAny().isPresent() 
							&& !tcDslSpecificCoverageReport.getCoverableClasses().contains(c.getName())).
					map (c -> c.getName()).collect(Collectors.toList());
			tcDslSpecificCoverageReport.getCoverableClasses().addAll(notCoverableSubClasses);
		}
	}
	
	public void removeCoverableClass(EClass clazz) {
		if (tcDslSpecificCoverageReport.getCoverableClasses().contains(clazz.getName())) {
			tcDslSpecificCoverageReport.getCoverableClasses().remove(clazz.getName());
		}
	}
	
	//remove a class and all of its sub classes
	public void removeCoverableClass_subClass(EClass clazz) {
		if (tcDslSpecificCoverageReport.getCoverableClasses().contains(clazz.getName())) {
			tcDslSpecificCoverageReport.getCoverableClasses().remove(clazz.getName());
			List<String> coverableSubClasses = TDLCoverageUtil.getInstance()
					.getMetamodelRootElement().getEClassifiers().stream()
					.filter(c -> c instanceof EClass).map(c -> (EClass) c)
					.filter(c -> c.getEAllSuperTypes().stream().
							filter(sc -> sc.getName().equals(clazz.getName())).findAny().isPresent() 
							&& tcDslSpecificCoverageReport.getCoverableClasses().contains(c.getName())).
					map (c -> c.getName()).collect(Collectors.toList());
			tcDslSpecificCoverageReport.getCoverableClasses().removeAll(coverableSubClasses);
		}
	}

	public TDLTestCaseCoverage getTestCaseCoverage() {
		return testCaseCoverage;
	}

	public Set<String> getCoverableClasses() {
		return tcDslSpecificCoverageReport.getCoverableClasses();
	}

	public List<EObject> getAllModelObjects() {
		return tcDslSpecificCoverageReport.getObjects();
	}

	public HashMap<Context, List<EObject>> getCoverageContext_eobjects() {
		return coverageContext_eobjects;
	}

	public HashMap<BranchSpecification, List<EObject>> getBranchingRule_contextObjects() {
		return branchingRule_contextObjects;
	}

	public List<String> getTcObjectCoverageStatus() {
		return tcDslSpecificCoverageReport.getObjectCoverageStatus();
	}

	public String getObjectCoverage(EObject object) {
		return tcDslSpecificCoverageReport.getObjectCoverage(object);
	}
	
	public TestCoverageReport getTcDslSpecificCoverageReport(String coverageType) {
		try {
			return tcCoverageReports.stream()
					.filter(r -> r.getReportTitle().equals(coverageType))
					.findFirst().get();
		}catch (NoSuchElementException e) {
			return null;
		}
	}

	public List<TestCoverageReport> getTcCoverageReports() {
		return tcCoverageReports;
	}
	
	
}