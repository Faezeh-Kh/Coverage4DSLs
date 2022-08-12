/**
 */
package statemachines;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Signal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link statemachines.Signal#getAttributes <em>Attributes</em>}</li>
 * </ul>
 *
 * @see statemachines.StatemachinesPackage#getSignal()
 * @model
 * @generated
 */
public interface Signal extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link statemachines.Attribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see statemachines.StatemachinesPackage#getSignal_Attributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attribute> getAttributes();

} // Signal
