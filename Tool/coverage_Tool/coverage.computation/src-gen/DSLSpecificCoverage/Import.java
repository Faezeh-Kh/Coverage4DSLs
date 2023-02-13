/**
 */
package DSLSpecificCoverage;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Import</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link DSLSpecificCoverage.Import#getImportedNamespace <em>Imported Namespace</em>}</li>
 *   <li>{@link DSLSpecificCoverage.Import#getImportURI <em>Import URI</em>}</li>
 *   <li>{@link DSLSpecificCoverage.Import#getImportedRuleset <em>Imported Ruleset</em>}</li>
 * </ul>
 *
 * @see DSLSpecificCoverage.DSLSpecificCoveragePackage#getImport()
 * @model
 * @generated
 */
public interface Import extends EObject {
	/**
	 * Returns the value of the '<em><b>Imported Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imported Namespace</em>' attribute.
	 * @see #setImportedNamespace(String)
	 * @see DSLSpecificCoverage.DSLSpecificCoveragePackage#getImport_ImportedNamespace()
	 * @model
	 * @generated
	 */
	String getImportedNamespace();

	/**
	 * Sets the value of the '{@link DSLSpecificCoverage.Import#getImportedNamespace <em>Imported Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Imported Namespace</em>' attribute.
	 * @see #getImportedNamespace()
	 * @generated
	 */
	void setImportedNamespace(String value);

	/**
	 * Returns the value of the '<em><b>Import URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Import URI</em>' attribute.
	 * @see #setImportURI(String)
	 * @see DSLSpecificCoverage.DSLSpecificCoveragePackage#getImport_ImportURI()
	 * @model
	 * @generated
	 */
	String getImportURI();

	/**
	 * Sets the value of the '{@link DSLSpecificCoverage.Import#getImportURI <em>Import URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Import URI</em>' attribute.
	 * @see #getImportURI()
	 * @generated
	 */
	void setImportURI(String value);

	/**
	 * Returns the value of the '<em><b>Imported Ruleset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imported Ruleset</em>' reference.
	 * @see #setImportedRuleset(DomainSpecificCoverage)
	 * @see DSLSpecificCoverage.DSLSpecificCoveragePackage#getImport_ImportedRuleset()
	 * @model
	 * @generated
	 */
	DomainSpecificCoverage getImportedRuleset();

	/**
	 * Sets the value of the '{@link DSLSpecificCoverage.Import#getImportedRuleset <em>Imported Ruleset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Imported Ruleset</em>' reference.
	 * @see #getImportedRuleset()
	 * @generated
	 */
	void setImportedRuleset(DomainSpecificCoverage value);

} // Import
