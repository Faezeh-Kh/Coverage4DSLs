package coverage.dslSpecific;

import java.util.HashMap;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;

import DSLSpecificCoverage.BinaryCondition;
import DSLSpecificCoverage.BinaryOperator;
import DSLSpecificCoverage.BranchSpecification;
import DSLSpecificCoverage.Condition;
import DSLSpecificCoverage.LimitationType;
import DSLSpecificCoverage.LimitedIgnore;
import DSLSpecificCoverage.Context;
import DSLSpecificCoverage.CoverageByContent;
import DSLSpecificCoverage.CoverageOfReferenced;
import DSLSpecificCoverage.CoveredContents;
import DSLSpecificCoverage.Ignore;
import DSLSpecificCoverage.Rule;
import DSLSpecificCoverage.UnaryCondition;
import DSLSpecificCoverage.UnaryOperator;
import coverage.computation.TDLCoverageUtil;
import coverage.computation.TDLTestCaseCoverage;
import coverage.utilities.OCLInterpreter;

public class DSLSpecificCoverageExecutor {

	private TDLTestCaseCoverage testCaseCoverage;
	private HashMap<BranchSpecification, List<EObject>> branchingRule_contextObjects = new HashMap<>();
	
	public DSLSpecificCoverageExecutor (TDLTestCaseCoverage testCaseCoverage) {
		this.testCaseCoverage = testCaseCoverage;
	}
	//apply all the rules on the object (NOTE: rule's context = object type)
	public void applyCoverageRules(EList<Rule> rules, List<EObject> eObjects) {
		for (Rule rule:rules) {
			if (rule instanceof CoverageOfReferenced) {
				updateCoverableClasses((CoverageOfReferenced) rule);
				eObjects.stream().filter(object -> isRuleConditionSatisfied(rule.getCondition(), object))
					.forEach(object -> inferReferenceCoverage((CoverageOfReferenced) rule, object));
			}
			else if (rule instanceof CoverageByContent) {
				updateCoverableClasses((CoverageByContent) rule);
				eObjects.stream().filter(object -> isRuleConditionSatisfied(rule.getCondition(), object))
					.forEach(object -> inferContainerCoverage((CoverageByContent) rule, object));
			}
			else if (rule instanceof LimitedIgnore) {
				eObjects.stream().filter(object -> isRuleConditionSatisfied(rule.getCondition(), object))
					.forEach(object -> runLimitedIgnoreRule((LimitedIgnore) rule, object));
			}
			else if (rule instanceof Ignore) {
				updateCoverableClasses((Ignore) rule);
				eObjects.stream().filter(object -> isRuleConditionSatisfied(rule.getCondition(), object))
					.forEach(object -> runIgnoreRule((Ignore) rule, object));
			}
			else if (rule instanceof BranchSpecification) {
				List<EObject> eObjectsSatisfyingCondition = eObjects.stream()
						.filter(object -> isRuleConditionSatisfied(rule.getCondition(), object))
						.toList();
				branchingRule_contextObjects.put((BranchSpecification) rule, eObjectsSatisfyingCondition);
				//TODO: check if the eObjectsSatisfyingCondition is not cleared in each iteration
			}
		}
	}
	
	private void updateCoverableClasses(CoverageByContent rule) {
		addCoverableClass(((Context) rule.eContainer()).getMetaclass());
	}

	private void updateCoverableClasses(CoverageOfReferenced rule) {
		rule.getReference().stream().forEach(r -> 
			TDLCoverageUtil.getInstance().addCoverableClass(
				(EClass) r.getEType()));
		
	}
	
	private void updateCoverableClasses(Ignore rule) {
		if (rule.isIgnoreSubtypes()) {
			TDLCoverageUtil.getInstance().removeCoverableClass_subClass(
					((Context) rule.eContainer()).getMetaclass());
		}
		else {
			TDLCoverageUtil.getInstance().removeCoverableClass(
					((Context) rule.eContainer()).getMetaclass());
		}
	}
	
	private void addCoverableClass(EClass c) {
		TDLCoverageUtil.getInstance().addCoverableClass(c);
	}

	private void inferReferenceCoverage(CoverageOfReferenced r, EObject object) {
		for (EReference reference:r.getReference()) {
			EReference ref = (EReference) getMatchedFeature(object, reference.getName());
			if (ref != null) {
				Object referencedObject = object.eGet(ref);
				if (referencedObject != null) { 
					if (referencedObject instanceof EObject) {
						testCaseCoverage.setObjectCoverage(
								(EObject) referencedObject, testCaseCoverage.getObjectCoverage(object));
					}
					else if (referencedObject instanceof EObjectContainmentEList<?>) {
						((EObjectContainmentEList<?>) referencedObject).
							forEach(o -> testCaseCoverage.setObjectCoverage(
									(EObject) o, testCaseCoverage.getObjectCoverage(object)));
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
		
		if (containedObject instanceof EObject) {
			EObject containee = (EObject) containedObject;
			testCaseCoverage.setObjectCoverage(
					object, testCaseCoverage.getObjectCoverage(containee));
		}
		else if (containedObject instanceof EObjectContainmentEList<?>) {
			//if several objects are contained, set coverage based on the rule's multiplicity
			if (r.getMultiplicity() == CoveredContents.ONE) {
				coverContainerIfOneContaineeCovered((EObjectContainmentEList<?>) containedObject);
			}
			else {
				coverContainerIfAllContaineeCovered((EObjectContainmentEList<?>) containedObject);
			}
		}
	}
	
	private void coverContainerIfOneContaineeCovered(EObjectContainmentEList<?> containedObjects) {
		String containeeCoverage = TDLCoverageUtil.NOT_COVERED;
		for (Object containee:containedObjects) {
			containeeCoverage = testCaseCoverage.getObjectCoverage((EObject) containee);
			if (containeeCoverage == TDLCoverageUtil.COVERED) {
				break;
			}
		}
		testCaseCoverage.setObjectCoverage(
				((EObject) containedObjects.get(0)).eContainer(), containeeCoverage);
	}
	
	private void coverContainerIfAllContaineeCovered(EObjectContainmentEList<?> containedObjects) {
		int CoveredContentsCounter = 0;
		for (Object containee:containedObjects) {
			String containeeCoverage = testCaseCoverage.getObjectCoverage((EObject) containee);
			if (containeeCoverage == TDLCoverageUtil.COVERED) {
				CoveredContentsCounter++;
			}
		}
		if (CoveredContentsCounter == containedObjects.size()) {
			testCaseCoverage.setObjectCoverage(((EObject) containedObjects.get(0)).eContainer(), TDLCoverageUtil.COVERED);
		}
	}
	
	private void runLimitedIgnoreRule(LimitedIgnore rule, EObject object) {
		if (rule.getType() == LimitationType.CONTAINED_BY) {
			//ignore EObjects contained by one of the ContainerType classes
			if (rule.getContainerMetaclass().stream().
				anyMatch(c -> c.getName().equals(object.eContainer().eClass().getName()))) {
				testCaseCoverage.setObjectNotCoverable(object);
			}
		}
		else if (rule.getType() == LimitationType.NOT_CONTAINED_BY) {
			//ignore EObjects that are not contained by any of the ContainerType classes
			if (!rule.getContainerMetaclass().stream().
				anyMatch(c -> c.getName().equals(object.eContainer().eClass().getName()))) {
				testCaseCoverage.setObjectNotCoverable(object);
			}
		}
	}
	
	private void runIgnoreRule(Ignore rule, EObject object) {
		if (!rule.isIgnoreSubtypes() && !object.eClass().getName().equals(
				((Context) rule.eContainer()).getMetaclass().getName())) {
			return;
		}
		testCaseCoverage.setObjectNotCoverable(object);
	}
	
	private EStructuralFeature getMatchedFeature(EObject rootElement, String featureName){
		EStructuralFeature matchedFeature = rootElement.eClass().getEAllStructuralFeatures().stream().
				filter(f -> f.getName().equals(featureName)).findFirst().get();
		return matchedFeature;
	}
	
	private boolean isRuleConditionSatisfied(EList<Condition> conditions, EObject object) {
		boolean result = false;
		for (int i=0; i<conditions.size(); i++) {
			Condition condition = conditions.get(i);
			result = evaluateCondition(condition, object);
			if (condition instanceof BinaryCondition bcondition) {
				//for binaryConditions, evaluate the next condition
				boolean result2 = evaluateCondition(conditions.get(++i), object);
				if (bcondition.getOperator() == BinaryOperator.AND) {
					result = result & result2;
				}else if (bcondition.getOperator() == BinaryOperator.OR) {
					result = result || result2;
				}
			}
		}
		return result;
	}
	
	private boolean evaluateCondition(Condition condition, EObject object) {
		OCLInterpreter oclRunner = new OCLInterpreter();
		String constraint = condition.getConstraint();
		constraint = constraint.substring(1, constraint.length()-1);
		boolean result = oclRunner.isConstraintSatisfied(object, constraint);
		if (condition instanceof UnaryCondition ucondition 
				&& ucondition.getOperator() == UnaryOperator.NOT) {
			return !result;
		}
		return result;
	}
	
	public boolean hasBranchSpecificationRule() {
		return branchingRule_contextObjects.size() == 0 ? false : true;
	}
	
	public void runBranchCoverageRules() {
		DSLSpecificBranchCoverage branchCoverageExecutor = new DSLSpecificBranchCoverage(branchingRule_contextObjects);
		branchCoverageExecutor.runBranchCoverageComputation(testCaseCoverage);
	}
}