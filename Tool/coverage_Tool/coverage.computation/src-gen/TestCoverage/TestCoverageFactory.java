/**
 */
package TestCoverage;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see TestCoverage.TestCoveragePackage
 * @generated
 */
public interface TestCoverageFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TestCoverageFactory eINSTANCE = TestCoverage.impl.TestCoverageFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Test Suite Coverage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Test Suite Coverage</em>'.
	 * @generated
	 */
	TestSuiteCoverage createTestSuiteCoverage();

	/**
	 * Returns a new object of class '<em>Test Case Coverage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Test Case Coverage</em>'.
	 * @generated
	 */
	TestCaseCoverage createTestCaseCoverage();

	/**
	 * Returns a new object of class '<em>Model Object Coverage Status</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model Object Coverage Status</em>'.
	 * @generated
	 */
	ModelObjectCoverageStatus createModelObjectCoverageStatus();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TestCoveragePackage getTestCoveragePackage();

} //TestCoverageFactory
