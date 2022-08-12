/**
 */
package statemachines;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link statemachines.BooleanConstraint#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see statemachines.StatemachinesPackage#getBooleanConstraint()
 * @model
 * @generated
 */
public interface BooleanConstraint extends Constraint {
	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference.
	 * @see #setExpression(BooleanExpression)
	 * @see statemachines.StatemachinesPackage#getBooleanConstraint_Expression()
	 * @model containment="true" required="true"
	 * @generated
	 */
	BooleanExpression getExpression();

	/**
	 * Sets the value of the '{@link statemachines.BooleanConstraint#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' containment reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(BooleanExpression value);

} // BooleanConstraint
