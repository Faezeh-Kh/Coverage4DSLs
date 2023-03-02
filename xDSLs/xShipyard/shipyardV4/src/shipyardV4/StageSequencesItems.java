/**
 */
package shipyardV4;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stage Sequences Items</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link shipyardV4.StageSequencesItems#getItems <em>Items</em>}</li>
 * </ul>
 *
 * @see shipyardV4.ShipyardV4Package#getStageSequencesItems()
 * @model
 * @generated
 */
public interface StageSequencesItems extends EObject {
	/**
	 * Returns the value of the '<em><b>Items</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Items</em>' containment reference.
	 * @see #setItems(Sequence)
	 * @see shipyardV4.ShipyardV4Package#getStageSequencesItems_Items()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Sequence getItems();

	/**
	 * Sets the value of the '{@link shipyardV4.StageSequencesItems#getItems <em>Items</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Items</em>' containment reference.
	 * @see #getItems()
	 * @generated
	 */
	void setItems(Sequence value);

} // StageSequencesItems
