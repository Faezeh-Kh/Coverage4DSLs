/**
 */
package statemachines;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link statemachines.StateMachine#getRegions <em>Regions</em>}</li>
 * </ul>
 *
 * @see statemachines.StatemachinesPackage#getStateMachine()
 * @model
 * @generated
 */
public interface StateMachine extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Regions</b></em>' containment reference list.
	 * The list contents are of type {@link statemachines.Region}.
	 * It is bidirectional and its opposite is '{@link statemachines.Region#getStateMachine <em>State Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Regions</em>' containment reference list.
	 * @see statemachines.StatemachinesPackage#getStateMachine_Regions()
	 * @see statemachines.Region#getStateMachine
	 * @model opposite="stateMachine" containment="true" required="true"
	 * @generated
	 */
	EList<Region> getRegions();

} // StateMachine
