/**
 */
package shipyardV4;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shipyard Spec</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link shipyardV4.ShipyardSpec#getShipyardSpec <em>Shipyard Spec</em>}</li>
 * </ul>
 *
 * @see shipyardV4.ShipyardV4Package#getShipyardSpec()
 * @model
 * @generated
 */
public interface ShipyardSpec extends EObject {
	/**
	 * Returns the value of the '<em><b>Shipyard Spec</b></em>' containment reference list.
	 * The list contents are of type {@link shipyardV4.ShipyardSpecPropertiesAbstract}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shipyard Spec</em>' containment reference list.
	 * @see shipyardV4.ShipyardV4Package#getShipyardSpec_ShipyardSpec()
	 * @model containment="true"
	 * @generated
	 */
	EList<ShipyardSpecPropertiesAbstract> getShipyardSpec();

} // ShipyardSpec
