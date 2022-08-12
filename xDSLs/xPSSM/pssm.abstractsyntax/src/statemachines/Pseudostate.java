/**
 */
package statemachines;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pseudostate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link statemachines.Pseudostate#getKind <em>Kind</em>}</li>
 *   <li>{@link statemachines.Pseudostate#getState <em>State</em>}</li>
 * </ul>
 *
 * @see statemachines.StatemachinesPackage#getPseudostate()
 * @model
 * @generated
 */
public interface Pseudostate extends Vertex {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link statemachines.PseudostateKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see statemachines.PseudostateKind
	 * @see #setKind(PseudostateKind)
	 * @see statemachines.StatemachinesPackage#getPseudostate_Kind()
	 * @model required="true"
	 * @generated
	 */
	PseudostateKind getKind();

	/**
	 * Sets the value of the '{@link statemachines.Pseudostate#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see statemachines.PseudostateKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(PseudostateKind value);

	/**
	 * Returns the value of the '<em><b>State</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link statemachines.State#getConnectionPoint <em>Connection Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' container reference.
	 * @see #setState(State)
	 * @see statemachines.StatemachinesPackage#getPseudostate_State()
	 * @see statemachines.State#getConnectionPoint
	 * @model opposite="connectionPoint" transient="false"
	 * @generated
	 */
	State getState();

	/**
	 * Sets the value of the '{@link statemachines.Pseudostate#getState <em>State</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' container reference.
	 * @see #getState()
	 * @generated
	 */
	void setState(State value);

} // Pseudostate
