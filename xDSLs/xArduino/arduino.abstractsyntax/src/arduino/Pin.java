/**
 */
package arduino;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pin</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link arduino.Pin#getLevel <em>Level</em>}</li>
 * </ul>
 *
 * @see arduino.ArduinoPackage#getPin()
 * @model abstract="true"
 * @generated
 */
public interface Pin extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level</em>' attribute.
	 * @see #setLevel(int)
	 * @see arduino.ArduinoPackage#getPin_Level()
	 * @model annotation="aspect"
	 * @generated
	 */
	int getLevel();

	/**
	 * Sets the value of the '{@link arduino.Pin#getLevel <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level</em>' attribute.
	 * @see #getLevel()
	 * @generated
	 */
	void setLevel(int value);

} // Pin
