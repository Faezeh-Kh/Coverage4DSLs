/**
 */
package TestCoverage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.etsi.mts.tdl.TestDescription;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Case Coverage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TestCoverage.TestCaseCoverage#getTestCase <em>Test Case</em>}</li>
 *   <li>{@link TestCoverage.TestCaseCoverage#getTcObjectCoverageStatus <em>Tc Object Coverage Status</em>}</li>
 *   <li>{@link TestCoverage.TestCaseCoverage#getCoveragePercentage <em>Coverage Percentage</em>}</li>
 * </ul>
 *
 * @see TestCoverage.TestCoveragePackage#getTestCaseCoverage()
 * @model
 * @generated
 */
public interface TestCaseCoverage extends EObject {
	/**
	 * Returns the value of the '<em><b>Test Case</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Case</em>' reference.
	 * @see #setTestCase(TestDescription)
	 * @see TestCoverage.TestCoveragePackage#getTestCaseCoverage_TestCase()
	 * @model required="true"
	 * @generated
	 */
	TestDescription getTestCase();

	/**
	 * Sets the value of the '{@link TestCoverage.TestCaseCoverage#getTestCase <em>Test Case</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Test Case</em>' reference.
	 * @see #getTestCase()
	 * @generated
	 */
	void setTestCase(TestDescription value);

	/**
	 * Returns the value of the '<em><b>Tc Object Coverage Status</b></em>' containment reference list.
	 * The list contents are of type {@link TestCoverage.ModelObjectCoverageStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tc Object Coverage Status</em>' containment reference list.
	 * @see TestCoverage.TestCoveragePackage#getTestCaseCoverage_TcObjectCoverageStatus()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ModelObjectCoverageStatus> getTcObjectCoverageStatus();

	/**
	 * Returns the value of the '<em><b>Coverage Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coverage Percentage</em>' attribute.
	 * @see #setCoveragePercentage(double)
	 * @see TestCoverage.TestCoveragePackage#getTestCaseCoverage_CoveragePercentage()
	 * @model required="true"
	 * @generated
	 */
	double getCoveragePercentage();

	/**
	 * Sets the value of the '{@link TestCoverage.TestCaseCoverage#getCoveragePercentage <em>Coverage Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coverage Percentage</em>' attribute.
	 * @see #getCoveragePercentage()
	 * @generated
	 */
	void setCoveragePercentage(double value);

} // TestCaseCoverage
