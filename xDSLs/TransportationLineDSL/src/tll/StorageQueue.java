/**
 */
package tll;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Storage Queue</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tll.StorageQueue#getFinalItems <em>Final Items</em>}</li>
 *   <li>{@link tll.StorageQueue#getExit <em>Exit</em>}</li>
 * </ul>
 *
 * @see tll.TllPackage#getStorageQueue()
 * @model
 * @generated
 */
public interface StorageQueue extends Component {
	/**
	 * Returns the value of the '<em><b>Final Items</b></em>' containment reference list.
	 * The list contents are of type {@link tll.Item}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Final Items</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Final Items</em>' containment reference list.
	 * @see tll.TllPackage#getStorageQueue_FinalItems()
	 * @model containment="true"
	 * @generated
	 */
	EList<Item> getFinalItems();

	/**
	 * Returns the value of the '<em><b>Exit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exit</em>' reference.
	 * @see #setExit(Turntable)
	 * @see tll.TllPackage#getStorageQueue_Exit()
	 * @model required="true"
	 * @generated
	 */
	Turntable getExit();

	/**
	 * Sets the value of the '{@link tll.StorageQueue#getExit <em>Exit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exit</em>' reference.
	 * @see #getExit()
	 * @generated
	 */
	void setExit(Turntable value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void do_();

} // StorageQueue
