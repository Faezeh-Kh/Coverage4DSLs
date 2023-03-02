/**
 */
package shipyardV4;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shipyard</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link shipyardV4.Shipyard#getShipyard <em>Shipyard</em>}</li>
 * </ul>
 *
 * @see shipyardV4.ShipyardV4Package#getShipyard()
 * @model
 * @generated
 */
public interface Shipyard extends EObject {
	/**
	 * Returns the value of the '<em><b>Shipyard</b></em>' containment reference list.
	 * The list contents are of type {@link shipyardV4.ShipyardPropertiesAbstract}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shipyard</em>' containment reference list.
	 * @see shipyardV4.ShipyardV4Package#getShipyard_Shipyard()
	 * @model containment="true"
	 * @generated
	 */
	EList<ShipyardPropertiesAbstract> getShipyard();

} // Shipyard
