/**
 */
package shipyardV4;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sequence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link shipyardV4.Sequence#getSequence <em>Sequence</em>}</li>
 *   <li>{@link shipyardV4.Sequence#getSimulatedResult <em>Simulated Result</em>}</li>
 * </ul>
 *
 * @see shipyardV4.ShipyardV4Package#getSequence()
 * @model
 * @generated
 */
public interface Sequence extends EObject {
	/**
	 * Returns the value of the '<em><b>Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link shipyardV4.SequencePropertiesAbstract}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequence</em>' containment reference list.
	 * @see shipyardV4.ShipyardV4Package#getSequence_Sequence()
	 * @model containment="true"
	 * @generated
	 */
	EList<SequencePropertiesAbstract> getSequence();

	/**
	 * Returns the value of the '<em><b>Simulated Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simulated Result</em>' attribute.
	 * @see #setSimulatedResult(String)
	 * @see shipyardV4.ShipyardV4Package#getSequence_SimulatedResult()
	 * @model annotation="aspect"
	 * @generated
	 */
	String getSimulatedResult();

	/**
	 * Sets the value of the '{@link shipyardV4.Sequence#getSimulatedResult <em>Simulated Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Simulated Result</em>' attribute.
	 * @see #getSimulatedResult()
	 * @generated
	 */
	void setSimulatedResult(String value);	

} // Sequence
