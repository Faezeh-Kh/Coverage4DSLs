/**
 */
package DSLSpecificCoverage;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Branch</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link DSLSpecificCoverage.Branch#getOCLQuery <em>OCL Query</em>}</li>
 * </ul>
 *
 * @see DSLSpecificCoverage.DSLSpecificCoveragePackage#getBranch()
 * @model
 * @generated
 */
public interface Branch extends EObject {
	/**
	 * Returns the value of the '<em><b>OCL Query</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>OCL Query</em>' attribute.
	 * @see #setOCLQuery(String)
	 * @see DSLSpecificCoverage.DSLSpecificCoveragePackage#getBranch_OCLQuery()
	 * @model
	 * @generated
	 */
	String getOCLQuery();

	/**
	 * Sets the value of the '{@link DSLSpecificCoverage.Branch#getOCLQuery <em>OCL Query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>OCL Query</em>' attribute.
	 * @see #getOCLQuery()
	 * @generated
	 */
	void setOCLQuery(String value);

} // Branch
