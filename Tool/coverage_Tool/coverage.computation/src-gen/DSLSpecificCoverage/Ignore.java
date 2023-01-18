/**
 */
package DSLSpecificCoverage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ignore</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link DSLSpecificCoverage.Ignore#isIgnoreSubtypes <em>Ignore Subtypes</em>}</li>
 * </ul>
 *
 * @see DSLSpecificCoverage.DSLSpecificCoveragePackage#getIgnore()
 * @model
 * @generated
 */
public interface Ignore extends ExclusionRule {
	/**
	 * Returns the value of the '<em><b>Ignore Subtypes</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ignore Subtypes</em>' attribute.
	 * @see #setIgnoreSubtypes(boolean)
	 * @see DSLSpecificCoverage.DSLSpecificCoveragePackage#getIgnore_IgnoreSubtypes()
	 * @model default="true"
	 * @generated
	 */
	boolean isIgnoreSubtypes();

	/**
	 * Sets the value of the '{@link DSLSpecificCoverage.Ignore#isIgnoreSubtypes <em>Ignore Subtypes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ignore Subtypes</em>' attribute.
	 * @see #isIgnoreSubtypes()
	 * @generated
	 */
	void setIgnoreSubtypes(boolean value);

} // Ignore
