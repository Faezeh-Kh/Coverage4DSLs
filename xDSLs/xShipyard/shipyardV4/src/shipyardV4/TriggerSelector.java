/**
 */
package shipyardV4;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trigger Selector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link shipyardV4.TriggerSelector#getSelector <em>Selector</em>}</li>
 * </ul>
 *
 * @see shipyardV4.ShipyardV4Package#getTriggerSelector()
 * @model
 * @generated
 */
public interface TriggerSelector extends TriggerPropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>Selector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selector</em>' containment reference.
	 * @see #setSelector(Selector)
	 * @see shipyardV4.ShipyardV4Package#getTriggerSelector_Selector()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Selector getSelector();

	/**
	 * Sets the value of the '{@link shipyardV4.TriggerSelector#getSelector <em>Selector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selector</em>' containment reference.
	 * @see #getSelector()
	 * @generated
	 */
	void setSelector(Selector value);

} // TriggerSelector
