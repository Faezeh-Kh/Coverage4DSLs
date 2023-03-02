/**
 */
package shipyardV4;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shipyard Spec Stages Items</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link shipyardV4.ShipyardSpecStagesItems#getItems <em>Items</em>}</li>
 * </ul>
 *
 * @see shipyardV4.ShipyardV4Package#getShipyardSpecStagesItems()
 * @model
 * @generated
 */
public interface ShipyardSpecStagesItems extends EObject {
	/**
	 * Returns the value of the '<em><b>Items</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Items</em>' containment reference.
	 * @see #setItems(Stage)
	 * @see shipyardV4.ShipyardV4Package#getShipyardSpecStagesItems_Items()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Stage getItems();

	/**
	 * Sets the value of the '{@link shipyardV4.ShipyardSpecStagesItems#getItems <em>Items</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Items</em>' containment reference.
	 * @see #getItems()
	 * @generated
	 */
	void setItems(Stage value);

} // ShipyardSpecStagesItems
