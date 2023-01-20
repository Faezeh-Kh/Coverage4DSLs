/**
 */
package shipyardV4;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link shipyardV4.ShipyardV4Root#getShipyardV4Root <em>Shipyard V4 Root</em>}</li>
 *   <li>{@link shipyardV4.ShipyardV4Root#getInitialSequence <em>Initial Sequence</em>}</li>
 * </ul>
 *
 * @see shipyardV4.ShipyardV4Package#getShipyardV4Root()
 * @model
 * @generated
 */
public interface ShipyardV4Root extends EObject {
	/**
	 * Returns the value of the '<em><b>Shipyard V4 Root</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shipyard V4 Root</em>' containment reference.
	 * @see #setShipyardV4Root(Shipyard)
	 * @see shipyardV4.ShipyardV4Package#getShipyardV4Root_ShipyardV4Root()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Shipyard getShipyardV4Root();

	/**
	 * Sets the value of the '{@link shipyardV4.ShipyardV4Root#getShipyardV4Root <em>Shipyard V4 Root</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shipyard V4 Root</em>' containment reference.
	 * @see #getShipyardV4Root()
	 * @generated
	 */
	void setShipyardV4Root(Shipyard value);

	/**
	 * Returns the value of the '<em><b>Initial Sequence</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Sequence</em>' reference.
	 * @see #setInitialSequence(Sequence)
	 * @see shipyardV4.ShipyardV4Package#getShipyardV4Root_InitialSequence()
	 * @model annotation="aspect"
	 * @generated
	 */
	Sequence getInitialSequence();

	/**
	 * Sets the value of the '{@link shipyardV4.ShipyardV4Root#getInitialSequence <em>Initial Sequence</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Sequence</em>' reference.
	 * @see #getInitialSequence()
	 * @generated
	 */
	void setInitialSequence(Sequence value);

} // ShipyardV4Root
