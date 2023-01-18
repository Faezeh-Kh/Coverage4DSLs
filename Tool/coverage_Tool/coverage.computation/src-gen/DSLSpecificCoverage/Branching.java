/**
 */
package DSLSpecificCoverage;

import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Branching</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link DSLSpecificCoverage.Branching#getTrueBranch <em>True Branch</em>}</li>
 *   <li>{@link DSLSpecificCoverage.Branching#getFalseBranch <em>False Branch</em>}</li>
 * </ul>
 *
 * @see DSLSpecificCoverage.DSLSpecificCoveragePackage#getBranching()
 * @model
 * @generated
 */
public interface Branching extends SpecializationRule {
	/**
	 * Returns the value of the '<em><b>True Branch</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>True Branch</em>' reference.
	 * @see #setTrueBranch(EReference)
	 * @see DSLSpecificCoverage.DSLSpecificCoveragePackage#getBranching_TrueBranch()
	 * @model required="true"
	 * @generated
	 */
	EReference getTrueBranch();

	/**
	 * Sets the value of the '{@link DSLSpecificCoverage.Branching#getTrueBranch <em>True Branch</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>True Branch</em>' reference.
	 * @see #getTrueBranch()
	 * @generated
	 */
	void setTrueBranch(EReference value);

	/**
	 * Returns the value of the '<em><b>False Branch</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>False Branch</em>' reference.
	 * @see #setFalseBranch(EReference)
	 * @see DSLSpecificCoverage.DSLSpecificCoveragePackage#getBranching_FalseBranch()
	 * @model
	 * @generated
	 */
	EReference getFalseBranch();

	/**
	 * Sets the value of the '{@link DSLSpecificCoverage.Branching#getFalseBranch <em>False Branch</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>False Branch</em>' reference.
	 * @see #getFalseBranch()
	 * @generated
	 */
	void setFalseBranch(EReference value);

} // Branching
