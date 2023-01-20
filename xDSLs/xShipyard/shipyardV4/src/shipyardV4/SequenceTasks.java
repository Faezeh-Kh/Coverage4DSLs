/**
 */
package shipyardV4;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sequence Tasks</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link shipyardV4.SequenceTasks#getTasks <em>Tasks</em>}</li>
 * </ul>
 *
 * @see shipyardV4.ShipyardV4Package#getSequenceTasks()
 * @model
 * @generated
 */
public interface SequenceTasks extends SequencePropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>Tasks</b></em>' containment reference list.
	 * The list contents are of type {@link shipyardV4.SequenceTasksItems}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tasks</em>' containment reference list.
	 * @see shipyardV4.ShipyardV4Package#getSequenceTasks_Tasks()
	 * @model containment="true"
	 * @generated
	 */
	EList<SequenceTasksItems> getTasks();

} // SequenceTasks
