/**
 */
package shipyardV4;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link shipyardV4.TaskProperties#getProperties <em>Properties</em>}</li>
 * </ul>
 *
 * @see shipyardV4.ShipyardV4Package#getTaskProperties()
 * @model
 * @generated
 */
public interface TaskProperties extends TaskPropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
	 * The list contents are of type {@link shipyardV4.TaskPropertiesPropertiesAbstract}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference list.
	 * @see shipyardV4.ShipyardV4Package#getTaskProperties_Properties()
	 * @model containment="true"
	 * @generated
	 */
	EList<TaskPropertiesPropertiesAbstract> getProperties();

} // TaskProperties
