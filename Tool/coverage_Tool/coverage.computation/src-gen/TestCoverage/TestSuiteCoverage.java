/**
 */
package TestCoverage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Suite Coverage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TestCoverage.TestSuiteCoverage#getTestSuite <em>Test Suite</em>}</li>
 *   <li>{@link TestCoverage.TestSuiteCoverage#getTestCaseCoverages <em>Test Case Coverages</em>}</li>
 *   <li>{@link TestCoverage.TestSuiteCoverage#getTsObjectCoverageStatus <em>Ts Object Coverage Status</em>}</li>
 *   <li>{@link TestCoverage.TestSuiteCoverage#getCoveragePercentage <em>Coverage Percentage</em>}</li>
 * </ul>
 *
 * @see TestCoverage.TestCoveragePackage#getTestSuiteCoverage()
 * @model
 * @generated
 */
public interface TestSuiteCoverage extends EObject {
	/**
	 * Returns the value of the '<em><b>Test Suite</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Suite</em>' reference.
	 * @see #setTestSuite(org.etsi.mts.tdl.Package)
	 * @see TestCoverage.TestCoveragePackage#getTestSuiteCoverage_TestSuite()
	 * @model required="true"
	 * @generated
	 */
	org.etsi.mts.tdl.Package getTestSuite();

	/**
	 * Sets the value of the '{@link TestCoverage.TestSuiteCoverage#getTestSuite <em>Test Suite</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Test Suite</em>' reference.
	 * @see #getTestSuite()
	 * @generated
	 */
	void setTestSuite(org.etsi.mts.tdl.Package value);

	/**
	 * Returns the value of the '<em><b>Test Case Coverages</b></em>' containment reference list.
	 * The list contents are of type {@link TestCoverage.TestCaseCoverage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Case Coverages</em>' containment reference list.
	 * @see TestCoverage.TestCoveragePackage#getTestSuiteCoverage_TestCaseCoverages()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<TestCaseCoverage> getTestCaseCoverages();

	/**
	 * Returns the value of the '<em><b>Ts Object Coverage Status</b></em>' containment reference list.
	 * The list contents are of type {@link TestCoverage.ModelObjectCoverageStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ts Object Coverage Status</em>' containment reference list.
	 * @see TestCoverage.TestCoveragePackage#getTestSuiteCoverage_TsObjectCoverageStatus()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ModelObjectCoverageStatus> getTsObjectCoverageStatus();

	/**
	 * Returns the value of the '<em><b>Coverage Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coverage Percentage</em>' attribute.
	 * @see #setCoveragePercentage(double)
	 * @see TestCoverage.TestCoveragePackage#getTestSuiteCoverage_CoveragePercentage()
	 * @model required="true"
	 * @generated
	 */
	double getCoveragePercentage();

	/**
	 * Sets the value of the '{@link TestCoverage.TestSuiteCoverage#getCoveragePercentage <em>Coverage Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coverage Percentage</em>' attribute.
	 * @see #getCoveragePercentage()
	 * @generated
	 */
	void setCoveragePercentage(double value);

} // TestSuiteCoverage
