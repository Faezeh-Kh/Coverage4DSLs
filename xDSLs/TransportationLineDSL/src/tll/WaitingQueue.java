/**
 */
package tll;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Waiting Queue</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tll.WaitingQueue#getBufferedItems <em>Buffered Items</em>}</li>
 *   <li>{@link tll.WaitingQueue#getEntry <em>Entry</em>}</li>
 * </ul>
 *
 * @see tll.TllPackage#getWaitingQueue()
 * @model
 * @generated
 */
public interface WaitingQueue extends Component {
	/**
	 * Returns the value of the '<em><b>Buffered Items</b></em>' containment reference list.
	 * The list contents are of type {@link tll.Item}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Buffered Items</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Buffered Items</em>' containment reference list.
	 * @see tll.TllPackage#getWaitingQueue_BufferedItems()
	 * @model containment="true"
	 * @generated
	 */
	EList<Item> getBufferedItems();

	/**
	 * Returns the value of the '<em><b>Entry</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entry</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entry</em>' reference.
	 * @see #setEntry(Turntable)
	 * @see tll.TllPackage#getWaitingQueue_Entry()
	 * @model required="true"
	 * @generated
	 */
	Turntable getEntry();

	/**
	 * Sets the value of the '{@link tll.WaitingQueue#getEntry <em>Entry</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entry</em>' reference.
	 * @see #getEntry()
	 * @generated
	 */
	void setEntry(Turntable value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void do_();

} // WaitingQueue
