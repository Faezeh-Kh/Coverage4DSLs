/**
 */
package arduino;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Delay</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link arduino.Delay#getUnit <em>Unit</em>}</li>
 *   <li>{@link arduino.Delay#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see arduino.ArduinoPackage#getDelay()
 * @model
 * @generated
 */
public interface Delay extends Utilities {
	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * The literals are from the enumeration {@link arduino.Time}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see arduino.Time
	 * @see #setUnit(Time)
	 * @see arduino.ArduinoPackage#getDelay_Unit()
	 * @model
	 * @generated
	 */
	Time getUnit();

	/**
	 * Sets the value of the '{@link arduino.Delay#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see arduino.Time
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(Time value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(int)
	 * @see arduino.ArduinoPackage#getDelay_Value()
	 * @model
	 * @generated
	 */
	int getValue();

	/**
	 * Sets the value of the '{@link arduino.Delay#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(int value);

} // Delay
