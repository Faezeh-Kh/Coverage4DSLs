/**
 */
package statemachines;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link statemachines.Transition#getSource <em>Source</em>}</li>
 *   <li>{@link statemachines.Transition#getTarget <em>Target</em>}</li>
 *   <li>{@link statemachines.Transition#getTriggers <em>Triggers</em>}</li>
 *   <li>{@link statemachines.Transition#getContainer <em>Container</em>}</li>
 *   <li>{@link statemachines.Transition#getKind <em>Kind</em>}</li>
 *   <li>{@link statemachines.Transition#getEffect <em>Effect</em>}</li>
 *   <li>{@link statemachines.Transition#getConstraint <em>Constraint</em>}</li>
 * </ul>
 *
 * @see statemachines.StatemachinesPackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link statemachines.Vertex#getOutgoingTransitions <em>Outgoing Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Vertex)
	 * @see statemachines.StatemachinesPackage#getTransition_Source()
	 * @see statemachines.Vertex#getOutgoingTransitions
	 * @model opposite="outgoingTransitions" required="true"
	 * @generated
	 */
	Vertex getSource();

	/**
	 * Sets the value of the '{@link statemachines.Transition#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Vertex value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link statemachines.Vertex#getIncomingTransitions <em>Incoming Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Vertex)
	 * @see statemachines.StatemachinesPackage#getTransition_Target()
	 * @see statemachines.Vertex#getIncomingTransitions
	 * @model opposite="incomingTransitions" required="true"
	 * @generated
	 */
	Vertex getTarget();

	/**
	 * Sets the value of the '{@link statemachines.Transition#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Vertex value);

	/**
	 * Returns the value of the '<em><b>Triggers</b></em>' containment reference list.
	 * The list contents are of type {@link statemachines.Trigger}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Triggers</em>' containment reference list.
	 * @see statemachines.StatemachinesPackage#getTransition_Triggers()
	 * @model containment="true"
	 * @generated
	 */
	EList<Trigger> getTriggers();

	/**
	 * Returns the value of the '<em><b>Container</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link statemachines.Region#getTransitions <em>Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container</em>' container reference.
	 * @see #setContainer(Region)
	 * @see statemachines.StatemachinesPackage#getTransition_Container()
	 * @see statemachines.Region#getTransitions
	 * @model opposite="transitions" required="true" transient="false"
	 * @generated
	 */
	Region getContainer();

	/**
	 * Sets the value of the '{@link statemachines.Transition#getContainer <em>Container</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container</em>' container reference.
	 * @see #getContainer()
	 * @generated
	 */
	void setContainer(Region value);

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link statemachines.TransitionKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see statemachines.TransitionKind
	 * @see #setKind(TransitionKind)
	 * @see statemachines.StatemachinesPackage#getTransition_Kind()
	 * @model
	 * @generated
	 */
	TransitionKind getKind();

	/**
	 * Sets the value of the '{@link statemachines.Transition#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see statemachines.TransitionKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(TransitionKind value);

	/**
	 * Returns the value of the '<em><b>Effect</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effect</em>' containment reference.
	 * @see #setEffect(Behavior)
	 * @see statemachines.StatemachinesPackage#getTransition_Effect()
	 * @model containment="true"
	 * @generated
	 */
	Behavior getEffect();

	/**
	 * Sets the value of the '{@link statemachines.Transition#getEffect <em>Effect</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Effect</em>' containment reference.
	 * @see #getEffect()
	 * @generated
	 */
	void setEffect(Behavior value);

	/**
	 * Returns the value of the '<em><b>Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraint</em>' containment reference.
	 * @see #setConstraint(Constraint)
	 * @see statemachines.StatemachinesPackage#getTransition_Constraint()
	 * @model containment="true"
	 * @generated
	 */
	Constraint getConstraint();

	/**
	 * Sets the value of the '{@link statemachines.Transition#getConstraint <em>Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraint</em>' containment reference.
	 * @see #getConstraint()
	 * @generated
	 */
	void setConstraint(Constraint value);

} // Transition
