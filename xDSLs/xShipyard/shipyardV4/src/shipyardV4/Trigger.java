/**
 */
package shipyardV4;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link shipyardV4.Trigger#getTrigger <em>Trigger</em>}</li>
 * </ul>
 *
 * @see shipyardV4.ShipyardV4Package#getTrigger()
 * @model
 * @generated
 */
public interface Trigger extends EObject {
	/**
	 * Returns the value of the '<em><b>Trigger</b></em>' containment reference list.
	 * The list contents are of type {@link shipyardV4.TriggerPropertiesAbstract}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trigger</em>' containment reference list.
	 * @see shipyardV4.ShipyardV4Package#getTrigger_Trigger()
	 * @model containment="true"
	 * @generated
	 */
	EList<TriggerPropertiesAbstract> getTrigger();

} // Trigger
