/**
 */
package DSLSpecificCoverage.util;

import DSLSpecificCoverage.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see DSLSpecificCoverage.DSLSpecificCoveragePackage
 * @generated
 */
public class DSLSpecificCoverageSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DSLSpecificCoveragePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DSLSpecificCoverageSwitch() {
		if (modelPackage == null) {
			modelPackage = DSLSpecificCoveragePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case DSLSpecificCoveragePackage.DOMAIN_SPECIFIC_COVERAGE: {
				DomainSpecificCoverage domainSpecificCoverage = (DomainSpecificCoverage)theEObject;
				T result = caseDomainSpecificCoverage(domainSpecificCoverage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DSLSpecificCoveragePackage.IMPORT: {
				Import import_ = (Import)theEObject;
				T result = caseImport(import_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DSLSpecificCoveragePackage.CONTEXT: {
				Context context = (Context)theEObject;
				T result = caseContext(context);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DSLSpecificCoveragePackage.RULE: {
				Rule rule = (Rule)theEObject;
				T result = caseRule(rule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DSLSpecificCoveragePackage.INCLUSION_RULE: {
				InclusionRule inclusionRule = (InclusionRule)theEObject;
				T result = caseInclusionRule(inclusionRule);
				if (result == null) result = caseRule(inclusionRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DSLSpecificCoveragePackage.EXCLUSION_RULE: {
				ExclusionRule exclusionRule = (ExclusionRule)theEObject;
				T result = caseExclusionRule(exclusionRule);
				if (result == null) result = caseRule(exclusionRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DSLSpecificCoveragePackage.COVERAGE_OF_REFERENCED: {
				CoverageOfReferenced coverageOfReferenced = (CoverageOfReferenced)theEObject;
				T result = caseCoverageOfReferenced(coverageOfReferenced);
				if (result == null) result = caseInclusionRule(coverageOfReferenced);
				if (result == null) result = caseRule(coverageOfReferenced);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DSLSpecificCoveragePackage.COVERAGE_BY_CONTENT: {
				CoverageByContent coverageByContent = (CoverageByContent)theEObject;
				T result = caseCoverageByContent(coverageByContent);
				if (result == null) result = caseInclusionRule(coverageByContent);
				if (result == null) result = caseRule(coverageByContent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DSLSpecificCoveragePackage.IGNORE: {
				Ignore ignore = (Ignore)theEObject;
				T result = caseIgnore(ignore);
				if (result == null) result = caseExclusionRule(ignore);
				if (result == null) result = caseRule(ignore);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DSLSpecificCoveragePackage.LIMITED_IGNORE: {
				LimitedIgnore limitedIgnore = (LimitedIgnore)theEObject;
				T result = caseLimitedIgnore(limitedIgnore);
				if (result == null) result = caseExclusionRule(limitedIgnore);
				if (result == null) result = caseRule(limitedIgnore);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DSLSpecificCoveragePackage.BRANCH_SPECIFICATION: {
				BranchSpecification branchSpecification = (BranchSpecification)theEObject;
				T result = caseBranchSpecification(branchSpecification);
				if (result == null) result = caseRule(branchSpecification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DSLSpecificCoveragePackage.EXPLICIT_BRANCH: {
				ExplicitBranch explicitBranch = (ExplicitBranch)theEObject;
				T result = caseExplicitBranch(explicitBranch);
				if (result == null) result = caseBranch(explicitBranch);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DSLSpecificCoveragePackage.CONDITION: {
				Condition condition = (Condition)theEObject;
				T result = caseCondition(condition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DSLSpecificCoveragePackage.IMPLICIT_BRANCH: {
				ImplicitBranch implicitBranch = (ImplicitBranch)theEObject;
				T result = caseImplicitBranch(implicitBranch);
				if (result == null) result = caseBranch(implicitBranch);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DSLSpecificCoveragePackage.BRANCH: {
				Branch branch = (Branch)theEObject;
				T result = caseBranch(branch);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Domain Specific Coverage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain Specific Coverage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDomainSpecificCoverage(DomainSpecificCoverage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Import</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Import</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImport(Import object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContext(Context object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRule(Rule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inclusion Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inclusion Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInclusionRule(InclusionRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exclusion Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exclusion Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExclusionRule(ExclusionRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Coverage Of Referenced</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Coverage Of Referenced</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCoverageOfReferenced(CoverageOfReferenced object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Coverage By Content</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Coverage By Content</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCoverageByContent(CoverageByContent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ignore</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ignore</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIgnore(Ignore object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Limited Ignore</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Limited Ignore</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLimitedIgnore(LimitedIgnore object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Branch Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Branch Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBranchSpecification(BranchSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Explicit Branch</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Explicit Branch</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExplicitBranch(ExplicitBranch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCondition(Condition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Implicit Branch</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Implicit Branch</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImplicitBranch(ImplicitBranch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Branch</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Branch</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBranch(Branch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //DSLSpecificCoverageSwitch
