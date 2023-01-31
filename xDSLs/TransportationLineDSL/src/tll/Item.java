/**
 */
package tll;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tll.Item#getStartLocation <em>Start Location</em>}</li>
 *   <li>{@link tll.Item#getLocation <em>Location</em>}</li>
 *   <li>{@link tll.Item#isIsProcessed <em>Is Processed</em>}</li>
 *   <li>{@link tll.Item#getHistory <em>History</em>}</li>
 * </ul>
 *
 * @see tll.TllPackage#getItem()
 * @model
 * @generated
 */
public interface Item extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Start Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Location</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Location</em>' reference.
	 * @see #setStartLocation(Component)
	 * @see tll.TllPackage#getItem_StartLocation()
	 * @model
	 * @generated
	 */
	Component getStartLocation();

	/**
	 * Sets the value of the '{@link tll.Item#getStartLocation <em>Start Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Location</em>' reference.
	 * @see #getStartLocation()
	 * @generated
	 */
	void setStartLocation(Component value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link tll.Component#getHosts <em>Hosts</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' reference.
	 * @see #setLocation(Component)
	 * @see tll.TllPackage#getItem_Location()
	 * @see tll.Component#getHosts
	 * @model opposite="hosts"
	 * @generated
	 */
	Component getLocation();

	/**
	 * Sets the value of the '{@link tll.Item#getLocation <em>Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(Component value);

	/**
	 * Returns the value of the '<em><b>Is Processed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Processed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Processed</em>' attribute.
	 * @see #setIsProcessed(boolean)
	 * @see tll.TllPackage#getItem_IsProcessed()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsProcessed();

	/**
	 * Sets the value of the '{@link tll.Item#isIsProcessed <em>Is Processed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Processed</em>' attribute.
	 * @see #isIsProcessed()
	 * @generated
	 */
	void setIsProcessed(boolean value);

	/**
	 * Returns the value of the '<em><b>History</b></em>' reference list.
	 * The list contents are of type {@link tll.Component}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>History</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>History</em>' reference list.
	 * @see tll.TllPackage#getItem_History()
	 * @model
	 * @generated
	 */
	EList<Component> getHistory();

} // Item
