/**
 */
package DSLSpecificCoverage;

import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Coverage By Content</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link DSLSpecificCoverage.CoverageByContent#getContainmentReference <em>Containment Reference</em>}</li>
 *   <li>{@link DSLSpecificCoverage.CoverageByContent#getMultiplicity <em>Multiplicity</em>}</li>
 * </ul>
 *
 * @see DSLSpecificCoverage.DSLSpecificCoveragePackage#getCoverageByContent()
 * @model
 * @generated
 */
public interface CoverageByContent extends InclusionRule {
	/**
	 * Returns the value of the '<em><b>Containment Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containment Reference</em>' reference.
	 * @see #setContainmentReference(EReference)
	 * @see DSLSpecificCoverage.DSLSpecificCoveragePackage#getCoverageByContent_ContainmentReference()
	 * @model required="true"
	 * @generated
	 */
	EReference getContainmentReference();

	/**
	 * Sets the value of the '{@link DSLSpecificCoverage.CoverageByContent#getContainmentReference <em>Containment Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Containment Reference</em>' reference.
	 * @see #getContainmentReference()
	 * @generated
	 */
	void setContainmentReference(EReference value);

	/**
	 * Returns the value of the '<em><b>Multiplicity</b></em>' attribute.
	 * The literals are from the enumeration {@link DSLSpecificCoverage.CoveredContents}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiplicity</em>' attribute.
	 * @see DSLSpecificCoverage.CoveredContents
	 * @see #setMultiplicity(CoveredContents)
	 * @see DSLSpecificCoverage.DSLSpecificCoveragePackage#getCoverageByContent_Multiplicity()
	 * @model required="true"
	 * @generated
	 */
	CoveredContents getMultiplicity();

	/**
	 * Sets the value of the '{@link DSLSpecificCoverage.CoverageByContent#getMultiplicity <em>Multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiplicity</em>' attribute.
	 * @see DSLSpecificCoverage.CoveredContents
	 * @see #getMultiplicity()
	 * @generated
	 */
	void setMultiplicity(CoveredContents value);

} // CoverageByContent
