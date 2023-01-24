/**
 */
package DSLSpecificCoverage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binary Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link DSLSpecificCoverage.BinaryCondition#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @see DSLSpecificCoverage.DSLSpecificCoveragePackage#getBinaryCondition()
 * @model
 * @generated
 */
public interface BinaryCondition extends Condition {
	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link DSLSpecificCoverage.BinaryOperator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see DSLSpecificCoverage.BinaryOperator
	 * @see #setOperator(BinaryOperator)
	 * @see DSLSpecificCoverage.DSLSpecificCoveragePackage#getBinaryCondition_Operator()
	 * @model required="true"
	 * @generated
	 */
	BinaryOperator getOperator();

	/**
	 * Sets the value of the '{@link DSLSpecificCoverage.BinaryCondition#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see DSLSpecificCoverage.BinaryOperator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(BinaryOperator value);

} // BinaryCondition
