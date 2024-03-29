/**
 */
package arduino;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binary Boolean Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link arduino.BinaryBooleanExpression#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @see arduino.ArduinoPackage#getBinaryBooleanExpression()
 * @model
 * @generated
 */
public interface BinaryBooleanExpression extends BinaryExpression, BooleanExpression {
	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link arduino.BinaryBooleanOperatorKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see arduino.BinaryBooleanOperatorKind
	 * @see #setOperator(BinaryBooleanOperatorKind)
	 * @see arduino.ArduinoPackage#getBinaryBooleanExpression_Operator()
	 * @model
	 * @generated
	 */
	BinaryBooleanOperatorKind getOperator();

	/**
	 * Sets the value of the '{@link arduino.BinaryBooleanExpression#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see arduino.BinaryBooleanOperatorKind
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(BinaryBooleanOperatorKind value);

} // BinaryBooleanExpression
