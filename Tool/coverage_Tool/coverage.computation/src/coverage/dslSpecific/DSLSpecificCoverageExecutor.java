package coverage.dslSpecific;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
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
import DSLSpecificCoverage.Ignore;
import DSLSpecificCoverage.LimitationType;
import DSLSpecificCoverage.LimitedIgnore;
import DSLSpecificCoverage.Rule;
import coverage.computation.TDLCoverageUtil;
import coverage.computation.TDLTestCaseCoverage;
import coverage.utilities.OCLInterpreter;

public class DSLSpecificCoverageExecutor {

	private TDLTestCaseCoverage testCaseCoverage;
	private Set<String> coverableClasses;
	private List<EObject> allModelObjects;
	private HashMap<Context, List<EObject>> coverageContext_eobjects = new HashMap<>();
	
	DSLSpecificBranchCoverage branchCoverageRunner;
	public boolean hasBranchCoverage;
	private HashMap<BranchSpecification, List<EObject>> branchingRule_contextObjects = new HashMap<>();
	
	private List<String> tcObjectCoverageStatus;
	private List<String> tcObjectCoverageStatus_pv;
	double tcCoveragePercentage;
	
	public DSLSpecificCoverageExecutor (TDLTestCaseCoverage testCaseCoverage) {
		this.testCaseCoverage = testCaseCoverage;
		allModelObjects = testCaseCoverage.getAllModelObjects();
		coverableClasses = new HashSet<>(TDLCoverageUtil.getInstance().getCoverableClasses());
	}
	
	public void runDSLSpecificCoverage(DomainSpecificCoverage coverageRuleset) {
		//the initial coverage status is the one computed by the trace
		tcObjectCoverageStatus = new ArrayList<>(testCaseCoverage.getTcObjectCoverageStatusByTrace());
		
		//finding eobjects of each context
		setCoverageContext_objects(coverageRuleset);
				
		//apply domain specific coverage while the coverage matrix changes
		boolean isCoverageMatrixChanged = true;
		while (isCoverageMatrixChanged) {
			tcObjectCoverageStatus_pv = new ArrayList<>(tcObjectCoverageStatus);
			coverageContext_eobjects.entrySet().stream()
				.filter(entry -> !entry.getValue().isEmpty())
				.forEach(entry -> applyCoverageRules(entry.getKey().getRules(), entry.getValue()));
			isCoverageMatrixChanged = !Objects.equals(tcObjectCoverageStatus_pv, tcObjectCoverageStatus);
		}
		findNotCoverableObjects();
		tcCoveragePercentage = testCaseCoverage.computeCoveragePercentage(tcObjectCoverageStatus,coverageRuleset.getName());
		
		//if there are branchSpecification rules, compute branch coverage
		if (!branchingRule_contextObjects.isEmpty()) {
			hasBranchCoverage = true;
			branchCoverageRunner = new DSLSpecificBranchCoverage(this);
			branchCoverageRunner.runBranchCoverageComputation();
		}
	}
	
	public double getTcCoveragePercentage() {
		return tcCoveragePercentage;
	}

	private void setCoverageContext_objects(DomainSpecificCoverage coverageRuleset) {
		coverageContext_eobjects= new HashMap<>();
		coverageRuleset.getContexts().forEach(c -> coverageContext_eobjects.put(c, new ArrayList<>()));
		//find the eobjects related to the rule's context
		for (Entry<Context,List<EObject>> entry:coverageContext_eobjects.entrySet()) {
			String contextName = entry.getKey().getMetaclass().getName();
			entry.getValue().addAll(allModelObjects.stream()
					.filter(o -> isContextInstance(contextName, o))
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
						setObjectCoverage(refObject, getObjectCoverage(object));
					}
					else if (referencedObject instanceof EObjectContainmentEList<?> refObjects) {
						refObjects.forEach(o -> setObjectCoverage((EObject) o, getObjectCoverage(object)));
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
			setObjectCoverage(object, getObjectCoverage(containee));
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
			containeeCoverage = getObjectCoverage((EObject) containee);
			if (containeeCoverage == TDLCoverageUtil.COVERED) {
				break;
			}
		}
		setObjectCoverage(((EObject) containedObjects.get(0)).eContainer(), containeeCoverage);
	}
	
	private void coverContainerIfAllContaineeCovered(EObjectContainmentEList<?> containedObjects) {
		int CoveredContentsCounter = 0;
		for (Object containee:containedObjects) {
			String containeeCoverage = getObjectCoverage((EObject) containee);
			if (containeeCoverage == TDLCoverageUtil.COVERED) {
				CoveredContentsCounter++;
			}
		}
		if (CoveredContentsCounter == containedObjects.size()) {
			setObjectCoverage(((EObject) containedObjects.get(0)).eContainer(), TDLCoverageUtil.COVERED);
		}
	}
	
	private void runLimitedIgnoreRule(LimitedIgnore rule, EObject object) {
		if (rule.getType() == LimitationType.CONTAINED_BY) {
			//ignore EObjects contained by one of the ContainerType classes
			if (rule.getContainerMetaclass().stream().
				anyMatch(c -> c.getName().equals(object.eContainer().eClass().getName()))) {
				setObjectNotCoverable(object);
			}
		}
		else if (rule.getType() == LimitationType.NOT_CONTAINED_BY) {
			//ignore EObjects that are not contained by any of the ContainerType classes
			if (!rule.getContainerMetaclass().stream().
				anyMatch(c -> c.getName().equals(object.eContainer().eClass().getName()))) {
				setObjectNotCoverable(object);
			}
		}
	}
	
	private void runIgnoreRule(Ignore rule, EObject object) {
		if (!rule.isIgnoreSubtypes() && !object.eClass().getName().equals(
				((Context) rule.eContainer()).getMetaclass().getName())) {
			return;
		}
		setObjectNotCoverable(object);
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
	
	public String getObjectCoverage(EObject object) {
		int objectIndex = allModelObjects.indexOf(object);
		if (objectIndex != -1){
			return tcObjectCoverageStatus.get(objectIndex);
		}
		return null;
	}
	
	public void setObjectCoverage(EObject object, String coverageStatus) {
		int objectIndex = allModelObjects.indexOf(object);
		if (objectIndex != -1) {
			if (tcObjectCoverageStatus.get(objectIndex) != TDLCoverageUtil.COVERED){
				tcObjectCoverageStatus.set(objectIndex, coverageStatus);
			}
		}
	}
	
	public void setObjectNotCoverable(EObject object) {
		int objectIndex = allModelObjects.indexOf(object);
		if (objectIndex != -1){
			tcObjectCoverageStatus.set(objectIndex, TDLCoverageUtil.NOSTATUS);
		}
	}
	
	//if not-covered eobjects are of the not-coverable types, set their status as not-coverable
	private void findNotCoverableObjects() {
		for (int i=0; i<tcObjectCoverageStatus.size(); i++) {
			if (tcObjectCoverageStatus.get(i) == TDLCoverageUtil.NOT_COVERED &&
					!coverableClasses.contains(allModelObjects.get(i).eClass().getName())) {
				tcObjectCoverageStatus.set(i, TDLCoverageUtil.NOSTATUS);
			}
		}
	}
	
	public boolean isClassCoverable(EClass clazz) {
		return coverableClasses.contains(clazz.getName());
	}
	
	//add a class and all of its sub classes
	public void addCoverableClass(EClass clazz) {
		if (!coverableClasses.contains(clazz.getName())) {
			coverableClasses.add(clazz.getName());
			List<String> notCoverableSubClasses = TDLCoverageUtil.getInstance()
					.getMetamodelRootElement().getEClassifiers().stream()
					.filter(c -> c instanceof EClass).map(c -> (EClass) c)
					.filter(c -> c.getEAllSuperTypes().stream().
							filter(sc -> sc.getName().equals(clazz.getName())).findAny().isPresent() 
							&& !coverableClasses.contains(c.getName())).
					map (c -> c.getName()).collect(Collectors.toList());
				coverableClasses.addAll(notCoverableSubClasses);
		}
	}
	
	public void removeCoverableClass(EClass clazz) {
		if (coverableClasses.contains(clazz.getName())) {
			coverableClasses.remove(clazz.getName());
		}
	}
	
	//remove a class and all of its sub classes
	public void removeCoverableClass_subClass(EClass clazz) {
		if (coverableClasses.contains(clazz.getName())) {
			coverableClasses.remove(clazz.getName());
			List<String> coverableSubClasses = TDLCoverageUtil.getInstance()
					.getMetamodelRootElement().getEClassifiers().stream()
					.filter(c -> c instanceof EClass).map(c -> (EClass) c)
					.filter(c -> c.getEAllSuperTypes().stream().
							filter(sc -> sc.getName().equals(clazz.getName())).findAny().isPresent() 
							&& coverableClasses.contains(c.getName())).
					map (c -> c.getName()).collect(Collectors.toList());
				coverableClasses.removeAll(coverableSubClasses);
		}
	}

	public TDLTestCaseCoverage getTestCaseCoverage() {
		return testCaseCoverage;
	}

	public Set<String> getCoverableClasses() {
		return coverableClasses;
	}

	public List<EObject> getAllModelObjects() {
		return allModelObjects;
	}

	public HashMap<Context, List<EObject>> getCoverageContext_eobjects() {
		return coverageContext_eobjects;
	}

	public HashMap<BranchSpecification, List<EObject>> getBranchingRule_contextObjects() {
		return branchingRule_contextObjects;
	}

	public List<String> getTcObjectCoverageStatus() {
		return tcObjectCoverageStatus;
	}

	public double getTcBranchCoveragePercentage() {
		return branchCoverageRunner.getTcBranchCoveragePercentage();
	}

	public List<String> getTcBranchCoverageStatus() {
		return branchCoverageRunner.getTcBranchCoverageStatus();
	}

	public List<EObject> getBranchingObjects() {
		return branchCoverageRunner.getBranchObjects();
	}
	
	
	
}