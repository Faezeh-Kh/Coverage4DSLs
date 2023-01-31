/**
 */
package tll;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Area</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tll.Area#getComponent <em>Component</em>}</li>
 *   <li>{@link tll.Area#getItemGen <em>Item Gen</em>}</li>
 *   <li>{@link tll.Area#getStore <em>Store</em>}</li>
 *   <li>{@link tll.Area#getBuffer <em>Buffer</em>}</li>
 *   <li>{@link tll.Area#getItem <em>Item</em>}</li>
 *   <li>{@link tll.Area#getLog <em>Log</em>}</li>
 * </ul>
 *
 * @see tll.TllPackage#getArea()
 * @model
 * @generated
 */
public interface Area extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Component</b></em>' containment reference list.
	 * The list contents are of type {@link tll.Component}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component</em>' containment reference list.
	 * @see tll.TllPackage#getArea_Component()
	 * @model containment="true"
	 * @generated
	 */
	EList<Component> getComponent();

	/**
	 * Returns the value of the '<em><b>Item Gen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Item Gen</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item Gen</em>' containment reference.
	 * @see #setItemGen(ItemGenerator)
	 * @see tll.TllPackage#getArea_ItemGen()
	 * @model containment="true"
	 * @generated
	 */
	ItemGenerator getItemGen();

	/**
	 * Sets the value of the '{@link tll.Area#getItemGen <em>Item Gen</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item Gen</em>' containment reference.
	 * @see #getItemGen()
	 * @generated
	 */
	void setItemGen(ItemGenerator value);

	/**
	 * Returns the value of the '<em><b>Store</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Store</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Store</em>' reference.
	 * @see #setStore(StorageQueue)
	 * @see tll.TllPackage#getArea_Store()
	 * @model
	 * @generated
	 */
	StorageQueue getStore();

	/**
	 * Sets the value of the '{@link tll.Area#getStore <em>Store</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Store</em>' reference.
	 * @see #getStore()
	 * @generated
	 */
	void setStore(StorageQueue value);

	/**
	 * Returns the value of the '<em><b>Buffer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Buffer</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Buffer</em>' reference.
	 * @see #setBuffer(WaitingQueue)
	 * @see tll.TllPackage#getArea_Buffer()
	 * @model
	 * @generated
	 */
	WaitingQueue getBuffer();

	/**
	 * Sets the value of the '{@link tll.Area#getBuffer <em>Buffer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Buffer</em>' reference.
	 * @see #getBuffer()
	 * @generated
	 */
	void setBuffer(WaitingQueue value);

	/**
	 * Returns the value of the '<em><b>Item</b></em>' containment reference list.
	 * The list contents are of type {@link tll.Item}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Item</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item</em>' containment reference list.
	 * @see tll.TllPackage#getArea_Item()
	 * @model containment="true"
	 * @generated
	 */
	EList<Item> getItem();

	/**
	 * Returns the value of the '<em><b>Log</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Log</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Log</em>' attribute list.
	 * @see tll.TllPackage#getArea_Log()
	 * @model
	 * @generated
	 */
	EList<String> getLog();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void start();

} // Area
