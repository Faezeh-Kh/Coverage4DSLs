/**
 */
package xminiJava;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>New Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xminiJava.NewCall#getNew <em>New</em>}</li>
 * </ul>
 *
 * @see xminiJava.XminiJavaPackage#getNewCall()
 * @model annotation="aspect"
 * @generated
 */
public interface NewCall extends Call {
	/**
	 * Returns the value of the '<em><b>New</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New</em>' reference.
	 * @see #setNew(NewObject)
	 * @see xminiJava.XminiJavaPackage#getNewCall_New()
	 * @model required="true"
	 * @generated
	 */
	NewObject getNew();

	/**
	 * Sets the value of the '{@link xminiJava.NewCall#getNew <em>New</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New</em>' reference.
	 * @see #getNew()
	 * @generated
	 */
	void setNew(NewObject value);

} // NewCall
