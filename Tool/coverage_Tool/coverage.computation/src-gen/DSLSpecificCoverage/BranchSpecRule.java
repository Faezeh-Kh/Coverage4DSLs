/**
 */
package DSLSpecificCoverage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Branch Spec Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link DSLSpecificCoverage.BranchSpecRule#getTrueBranch <em>True Branch</em>}</li>
 *   <li>{@link DSLSpecificCoverage.BranchSpecRule#getFalseBranch <em>False Branch</em>}</li>
 * </ul>
 *
 * @see DSLSpecificCoverage.DSLSpecificCoveragePackage#getBranchSpecRule()
 * @model
 * @generated
 */
public interface BranchSpecRule extends SpecializationRule {
	/**
	 * Returns the value of the '<em><b>True Branch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>True Branch</em>' attribute.
	 * @see #setTrueBranch(String)
	 * @see DSLSpecificCoverage.DSLSpecificCoveragePackage#getBranchSpecRule_TrueBranch()
	 * @model required="true"
	 * @generated
	 */
	String getTrueBranch();

	/**
	 * Sets the value of the '{@link DSLSpecificCoverage.BranchSpecRule#getTrueBranch <em>True Branch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>True Branch</em>' attribute.
	 * @see #getTrueBranch()
	 * @generated
	 */
	void setTrueBranch(String value);

	/**
	 * Returns the value of the '<em><b>False Branch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>False Branch</em>' attribute.
	 * @see #setFalseBranch(String)
	 * @see DSLSpecificCoverage.DSLSpecificCoveragePackage#getBranchSpecRule_FalseBranch()
	 * @model
	 * @generated
	 */
	String getFalseBranch();

	/**
	 * Sets the value of the '{@link DSLSpecificCoverage.BranchSpecRule#getFalseBranch <em>False Branch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>False Branch</em>' attribute.
	 * @see #getFalseBranch()
	 * @generated
	 */
	void setFalseBranch(String value);

} // BranchSpecRule
