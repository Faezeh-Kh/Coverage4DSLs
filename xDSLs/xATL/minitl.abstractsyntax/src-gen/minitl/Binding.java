/**
 */
package minitl;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link minitl.Binding#getFeature <em>Feature</em>}</li>
 *   <li>{@link minitl.Binding#getValue <em>Value</em>}</li>
 *   <li>{@link minitl.Binding#getObjectTemplate <em>Object Template</em>}</li>
 * </ul>
 *
 * @see minitl.minitlPackage#getBinding()
 * @model
 * @generated
 */
public interface Binding extends EObject {
	/**
	 * Returns the value of the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature</em>' reference.
	 * @see #setFeature(EStructuralFeature)
	 * @see minitl.minitlPackage#getBinding_Feature()
	 * @model required="true"
	 * @generated
	 */
	EStructuralFeature getFeature();

	/**
	 * Sets the value of the '{@link minitl.Binding#getFeature <em>Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature</em>' reference.
	 * @see #getFeature()
	 * @generated
	 */
	void setFeature(EStructuralFeature value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(Value)
	 * @see minitl.minitlPackage#getBinding_Value()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Value getValue();

	/**
	 * Sets the value of the '{@link minitl.Binding#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Value value);

	/**
	 * Returns the value of the '<em><b>Object Template</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link minitl.ObjectTemplate#getBindings <em>Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Template</em>' container reference.
	 * @see #setObjectTemplate(ObjectTemplate)
	 * @see minitl.minitlPackage#getBinding_ObjectTemplate()
	 * @see minitl.ObjectTemplate#getBindings
	 * @model opposite="bindings" required="true" transient="false"
	 * @generated
	 */
	ObjectTemplate getObjectTemplate();

	/**
	 * Sets the value of the '{@link minitl.Binding#getObjectTemplate <em>Object Template</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object Template</em>' container reference.
	 * @see #getObjectTemplate()
	 * @generated
	 */
	void setObjectTemplate(ObjectTemplate value);

} // Binding
