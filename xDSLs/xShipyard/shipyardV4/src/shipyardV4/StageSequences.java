/**
 */
package shipyardV4;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stage Sequences</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link shipyardV4.StageSequences#getSequences <em>Sequences</em>}</li>
 * </ul>
 *
 * @see shipyardV4.ShipyardV4Package#getStageSequences()
 * @model
 * @generated
 */
public interface StageSequences extends StagePropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>Sequences</b></em>' containment reference list.
	 * The list contents are of type {@link shipyardV4.StageSequencesItems}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequences</em>' containment reference list.
	 * @see shipyardV4.ShipyardV4Package#getStageSequences_Sequences()
	 * @model containment="true"
	 * @generated
	 */
	EList<StageSequencesItems> getSequences();

} // StageSequences
