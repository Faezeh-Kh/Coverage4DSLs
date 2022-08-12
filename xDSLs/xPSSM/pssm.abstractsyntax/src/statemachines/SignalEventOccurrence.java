/**
 */
package statemachines;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Signal Event Occurrence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link statemachines.SignalEventOccurrence#getSignal <em>Signal</em>}</li>
 *   <li>{@link statemachines.SignalEventOccurrence#getAttributeValues <em>Attribute Values</em>}</li>
 * </ul>
 *
 * @see statemachines.StatemachinesPackage#getSignalEventOccurrence()
 * @model annotation="aspect"
 * @generated
 */
public interface SignalEventOccurrence extends EventOccurrence {
	/**
	 * Returns the value of the '<em><b>Signal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signal</em>' reference.
	 * @see #setSignal(Signal)
	 * @see statemachines.StatemachinesPackage#getSignalEventOccurrence_Signal()
	 * @model required="true"
	 * @generated
	 */
	Signal getSignal();

	/**
	 * Sets the value of the '{@link statemachines.SignalEventOccurrence#getSignal <em>Signal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signal</em>' reference.
	 * @see #getSignal()
	 * @generated
	 */
	void setSignal(Signal value);

	/**
	 * Returns the value of the '<em><b>Attribute Values</b></em>' containment reference list.
	 * The list contents are of type {@link statemachines.AttributeValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Values</em>' containment reference list.
	 * @see statemachines.StatemachinesPackage#getSignalEventOccurrence_AttributeValues()
	 * @model containment="true"
	 *        annotation="aspect"
	 * @generated
	 */
	EList<AttributeValue> getAttributeValues();

} // SignalEventOccurrence
