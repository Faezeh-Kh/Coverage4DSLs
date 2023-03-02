/**
 */
package shipyardV4;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sequence Triggered On</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link shipyardV4.SequenceTriggeredOn#getTriggeredOn <em>Triggered On</em>}</li>
 * </ul>
 *
 * @see shipyardV4.ShipyardV4Package#getSequenceTriggeredOn()
 * @model
 * @generated
 */
public interface SequenceTriggeredOn extends SequencePropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>Triggered On</b></em>' containment reference list.
	 * The list contents are of type {@link shipyardV4.SequenceTriggeredOnItems}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Triggered On</em>' containment reference list.
	 * @see shipyardV4.ShipyardV4Package#getSequenceTriggeredOn_TriggeredOn()
	 * @model containment="true"
	 * @generated
	 */
	EList<SequenceTriggeredOnItems> getTriggeredOn();

} // SequenceTriggeredOn
