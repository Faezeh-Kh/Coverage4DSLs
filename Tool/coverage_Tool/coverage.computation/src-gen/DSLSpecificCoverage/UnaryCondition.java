/**
 */
package DSLSpecificCoverage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unary Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link DSLSpecificCoverage.UnaryCondition#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @see DSLSpecificCoverage.DSLSpecificCoveragePackage#getUnaryCondition()
 * @model
 * @generated
 */
public interface UnaryCondition extends Condition {
	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link DSLSpecificCoverage.UnaryOperator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see DSLSpecificCoverage.UnaryOperator
	 * @see #setOperator(UnaryOperator)
	 * @see DSLSpecificCoverage.DSLSpecificCoveragePackage#getUnaryCondition_Operator()
	 * @model
	 * @generated
	 */
	UnaryOperator getOperator();

	/**
	 * Sets the value of the '{@link DSLSpecificCoverage.UnaryCondition#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see DSLSpecificCoverage.UnaryOperator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(UnaryOperator value);

} // UnaryCondition
