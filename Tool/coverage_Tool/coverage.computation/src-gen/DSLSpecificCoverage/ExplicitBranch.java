/**
 */
package DSLSpecificCoverage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Explicit Branch</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link DSLSpecificCoverage.ExplicitBranch#getOCLQuery <em>OCL Query</em>}</li>
 * </ul>
 *
 * @see DSLSpecificCoverage.DSLSpecificCoveragePackage#getExplicitBranch()
 * @model
 * @generated
 */
public interface ExplicitBranch extends Branch {
	/**
	 * Returns the value of the '<em><b>OCL Query</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>OCL Query</em>' attribute.
	 * @see #setOCLQuery(String)
	 * @see DSLSpecificCoverage.DSLSpecificCoveragePackage#getExplicitBranch_OCLQuery()
	 * @model required="true"
	 * @generated
	 */
	String getOCLQuery();

	/**
	 * Sets the value of the '{@link DSLSpecificCoverage.ExplicitBranch#getOCLQuery <em>OCL Query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>OCL Query</em>' attribute.
	 * @see #getOCLQuery()
	 * @generated
	 */
	void setOCLQuery(String value);

} // ExplicitBranch
