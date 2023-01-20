/**
 */
package shipyardV4;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link shipyardV4.Stage#getStage <em>Stage</em>}</li>
 * </ul>
 *
 * @see shipyardV4.ShipyardV4Package#getStage()
 * @model
 * @generated
 */
public interface Stage extends EObject {
	/**
	 * Returns the value of the '<em><b>Stage</b></em>' containment reference list.
	 * The list contents are of type {@link shipyardV4.StagePropertiesAbstract}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stage</em>' containment reference list.
	 * @see shipyardV4.ShipyardV4Package#getStage_Stage()
	 * @model containment="true"
	 * @generated
	 */
	EList<StagePropertiesAbstract> getStage();

} // Stage
