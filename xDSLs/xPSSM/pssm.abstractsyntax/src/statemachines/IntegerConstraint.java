/**
 */
package statemachines;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Integer Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link statemachines.IntegerConstraint#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see statemachines.StatemachinesPackage#getIntegerConstraint()
 * @model
 * @generated
 */
public interface IntegerConstraint extends Constraint {
	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference.
	 * @see #setExpression(IntegerComparisonExpression)
	 * @see statemachines.StatemachinesPackage#getIntegerConstraint_Expression()
	 * @model containment="true" required="true"
	 * @generated
	 */
	IntegerComparisonExpression getExpression();

	/**
	 * Sets the value of the '{@link statemachines.IntegerConstraint#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' containment reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(IntegerComparisonExpression value);

} // IntegerConstraint
