/**
 */
package DSLSpecificCoverage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain Specific Coverage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link DSLSpecificCoverage.DomainSpecificCoverage#getName <em>Name</em>}</li>
 *   <li>{@link DSLSpecificCoverage.DomainSpecificCoverage#getMetamodel <em>Metamodel</em>}</li>
 *   <li>{@link DSLSpecificCoverage.DomainSpecificCoverage#getContexts <em>Contexts</em>}</li>
 *   <li>{@link DSLSpecificCoverage.DomainSpecificCoverage#getImports <em>Imports</em>}</li>
 * </ul>
 *
 * @see DSLSpecificCoverage.DSLSpecificCoveragePackage#getDomainSpecificCoverage()
 * @model
 * @generated
 */
public interface DomainSpecificCoverage extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see DSLSpecificCoverage.DSLSpecificCoveragePackage#getDomainSpecificCoverage_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link DSLSpecificCoverage.DomainSpecificCoverage#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Metamodel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metamodel</em>' reference.
	 * @see #setMetamodel(EPackage)
	 * @see DSLSpecificCoverage.DSLSpecificCoveragePackage#getDomainSpecificCoverage_Metamodel()
	 * @model
	 * @generated
	 */
	EPackage getMetamodel();

	/**
	 * Sets the value of the '{@link DSLSpecificCoverage.DomainSpecificCoverage#getMetamodel <em>Metamodel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metamodel</em>' reference.
	 * @see #getMetamodel()
	 * @generated
	 */
	void setMetamodel(EPackage value);

	/**
	 * Returns the value of the '<em><b>Contexts</b></em>' containment reference list.
	 * The list contents are of type {@link DSLSpecificCoverage.Context}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contexts</em>' containment reference list.
	 * @see DSLSpecificCoverage.DSLSpecificCoveragePackage#getDomainSpecificCoverage_Contexts()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<Context> getContexts();

	/**
	 * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
	 * The list contents are of type {@link DSLSpecificCoverage.Import}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imports</em>' containment reference list.
	 * @see DSLSpecificCoverage.DSLSpecificCoveragePackage#getDomainSpecificCoverage_Imports()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<Import> getImports();

} // DomainSpecificCoverage
