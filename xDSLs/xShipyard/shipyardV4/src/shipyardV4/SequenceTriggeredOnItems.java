/**
 */
package shipyardV4;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sequence Triggered On Items</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link shipyardV4.SequenceTriggeredOnItems#getItems <em>Items</em>}</li>
 * </ul>
 *
 * @see shipyardV4.ShipyardV4Package#getSequenceTriggeredOnItems()
 * @model
 * @generated
 */
public interface SequenceTriggeredOnItems extends EObject {
	/**
	 * Returns the value of the '<em><b>Items</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Items</em>' containment reference.
	 * @see #setItems(Trigger)
	 * @see shipyardV4.ShipyardV4Package#getSequenceTriggeredOnItems_Items()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Trigger getItems();

	/**
	 * Sets the value of the '{@link shipyardV4.SequenceTriggeredOnItems#getItems <em>Items</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Items</em>' containment reference.
	 * @see #getItems()
	 * @generated
	 */
	void setItems(Trigger value);

} // SequenceTriggeredOnItems
