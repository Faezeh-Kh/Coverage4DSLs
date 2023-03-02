/**
 */
package shipyardV4;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link shipyardV4.Task#getTask <em>Task</em>}</li>
 *   <li>{@link shipyardV4.Task#getSimulatedResult <em>Simulated Result</em>}</li>
 * </ul>
 *
 * @see shipyardV4.ShipyardV4Package#getTask()
 * @model
 * @generated
 */
public interface Task extends EObject {
	/**
	 * Returns the value of the '<em><b>Task</b></em>' containment reference list.
	 * The list contents are of type {@link shipyardV4.TaskPropertiesAbstract}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task</em>' containment reference list.
	 * @see shipyardV4.ShipyardV4Package#getTask_Task()
	 * @model containment="true"
	 * @generated
	 */
	EList<TaskPropertiesAbstract> getTask();

	/**
	 * Returns the value of the '<em><b>Simulated Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simulated Result</em>' attribute.
	 * @see #setSimulatedResult(String)
	 * @see shipyardV4.ShipyardV4Package#getTask_SimulatedResult()
	 * @model annotation="aspect"
	 * @generated
	 */
	String getSimulatedResult();

	/**
	 * Sets the value of the '{@link shipyardV4.Task#getSimulatedResult <em>Simulated Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Simulated Result</em>' attribute.
	 * @see #getSimulatedResult()
	 * @generated
	 */
	void setSimulatedResult(String value);

} // Task
