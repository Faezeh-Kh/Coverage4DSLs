/**
 */
package shipyardV4;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trigger Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link shipyardV4.TriggerEvent#getEvent <em>Event</em>}</li>
 * </ul>
 *
 * @see shipyardV4.ShipyardV4Package#getTriggerEvent()
 * @model
 * @generated
 */
public interface TriggerEvent extends TriggerPropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event</em>' attribute.
	 * @see #setEvent(String)
	 * @see shipyardV4.ShipyardV4Package#getTriggerEvent_Event()
	 * @model required="true"
	 * @generated
	 */
	String getEvent();

	/**
	 * Sets the value of the '{@link shipyardV4.TriggerEvent#getEvent <em>Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event</em>' attribute.
	 * @see #getEvent()
	 * @generated
	 */
	void setEvent(String value);

} // TriggerEvent
