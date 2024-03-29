/**
 */
package arduino;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Digital Pin</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link arduino.DigitalPin#getModule <em>Module</em>}</li>
 * </ul>
 *
 * @see arduino.ArduinoPackage#getDigitalPin()
 * @model
 * @generated
 */
public interface DigitalPin extends Pin {
	/**
	 * Returns the value of the '<em><b>Module</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Module</em>' containment reference.
	 * @see #setModule(ArduinoDigitalModule)
	 * @see arduino.ArduinoPackage#getDigitalPin_Module()
	 * @model containment="true"
	 * @generated
	 */
	ArduinoDigitalModule getModule();

	/**
	 * Sets the value of the '{@link arduino.DigitalPin#getModule <em>Module</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Module</em>' containment reference.
	 * @see #getModule()
	 * @generated
	 */
	void setModule(ArduinoDigitalModule value);

} // DigitalPin
