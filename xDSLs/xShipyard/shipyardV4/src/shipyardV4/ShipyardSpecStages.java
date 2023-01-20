/**
 */
package shipyardV4;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shipyard Spec Stages</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link shipyardV4.ShipyardSpecStages#getStages <em>Stages</em>}</li>
 * </ul>
 *
 * @see shipyardV4.ShipyardV4Package#getShipyardSpecStages()
 * @model
 * @generated
 */
public interface ShipyardSpecStages extends ShipyardSpecPropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>Stages</b></em>' containment reference list.
	 * The list contents are of type {@link shipyardV4.ShipyardSpecStagesItems}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stages</em>' containment reference list.
	 * @see shipyardV4.ShipyardV4Package#getShipyardSpecStages_Stages()
	 * @model containment="true"
	 * @generated
	 */
	EList<ShipyardSpecStagesItems> getStages();

} // ShipyardSpecStages
