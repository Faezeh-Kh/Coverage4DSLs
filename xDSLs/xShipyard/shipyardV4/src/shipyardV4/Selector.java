/**
 */
package shipyardV4;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Selector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link shipyardV4.Selector#getSelector <em>Selector</em>}</li>
 * </ul>
 *
 * @see shipyardV4.ShipyardV4Package#getSelector()
 * @model
 * @generated
 */
public interface Selector extends EObject {
	/**
	 * Returns the value of the '<em><b>Selector</b></em>' containment reference list.
	 * The list contents are of type {@link shipyardV4.SelectorPropertiesAbstract}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selector</em>' containment reference list.
	 * @see shipyardV4.ShipyardV4Package#getSelector_Selector()
	 * @model containment="true"
	 * @generated
	 */
	EList<SelectorPropertiesAbstract> getSelector();

} // Selector
