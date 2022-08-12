/**
 */
package xminiJava;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xminiJava.TypeDeclaration#getAccessLevel <em>Access Level</em>}</li>
 *   <li>{@link xminiJava.TypeDeclaration#getImplements <em>Implements</em>}</li>
 *   <li>{@link xminiJava.TypeDeclaration#getMembers <em>Members</em>}</li>
 * </ul>
 *
 * @see xminiJava.XminiJavaPackage#getTypeDeclaration()
 * @model
 * @generated
 */
public interface TypeDeclaration extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Access Level</b></em>' attribute.
	 * The literals are from the enumeration {@link xminiJava.AccessLevel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access Level</em>' attribute.
	 * @see xminiJava.AccessLevel
	 * @see #setAccessLevel(AccessLevel)
	 * @see xminiJava.XminiJavaPackage#getTypeDeclaration_AccessLevel()
	 * @model
	 * @generated
	 */
	AccessLevel getAccessLevel();

	/**
	 * Sets the value of the '{@link xminiJava.TypeDeclaration#getAccessLevel <em>Access Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Level</em>' attribute.
	 * @see xminiJava.AccessLevel
	 * @see #getAccessLevel()
	 * @generated
	 */
	void setAccessLevel(AccessLevel value);

	/**
	 * Returns the value of the '<em><b>Implements</b></em>' reference list.
	 * The list contents are of type {@link xminiJava.Interface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implements</em>' reference list.
	 * @see xminiJava.XminiJavaPackage#getTypeDeclaration_Implements()
	 * @model
	 * @generated
	 */
	EList<Interface> getImplements();

	/**
	 * Returns the value of the '<em><b>Members</b></em>' containment reference list.
	 * The list contents are of type {@link xminiJava.Member}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Members</em>' containment reference list.
	 * @see xminiJava.XminiJavaPackage#getTypeDeclaration_Members()
	 * @model containment="true"
	 * @generated
	 */
	EList<Member> getMembers();

} // TypeDeclaration
