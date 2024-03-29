/**
 */
package xminiJava;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Member</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xminiJava.Member#getAccess <em>Access</em>}</li>
 * </ul>
 *
 * @see xminiJava.XminiJavaPackage#getMember()
 * @model
 * @generated
 */
public interface Member extends TypedDeclaration {
	/**
	 * Returns the value of the '<em><b>Access</b></em>' attribute.
	 * The literals are from the enumeration {@link xminiJava.AccessLevel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access</em>' attribute.
	 * @see xminiJava.AccessLevel
	 * @see #setAccess(AccessLevel)
	 * @see xminiJava.XminiJavaPackage#getMember_Access()
	 * @model
	 * @generated
	 */
	AccessLevel getAccess();

	/**
	 * Sets the value of the '{@link xminiJava.Member#getAccess <em>Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access</em>' attribute.
	 * @see xminiJava.AccessLevel
	 * @see #getAccess()
	 * @generated
	 */
	void setAccess(AccessLevel value);

} // Member
