/**
 */
package arduino;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Variable Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link arduino.BooleanVariableRef#getVariable <em>Variable</em>}</li>
 * </ul>
 *
 * @see arduino.ArduinoPackage#getBooleanVariableRef()
 * @model
 * @generated
 */
public interface BooleanVariableRef extends VariableRef, BooleanExpression {
	/**
	 * Returns the value of the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' reference.
	 * @see #setVariable(BooleanVariable)
	 * @see arduino.ArduinoPackage#getBooleanVariableRef_Variable()
	 * @model required="true"
	 * @generated
	 */
	BooleanVariable getVariable();

	/**
	 * Sets the value of the '{@link arduino.BooleanVariableRef#getVariable <em>Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' reference.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(BooleanVariable value);

} // BooleanVariableRef
