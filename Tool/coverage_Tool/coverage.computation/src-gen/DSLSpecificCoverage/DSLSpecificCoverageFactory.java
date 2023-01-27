/**
 */
package DSLSpecificCoverage;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see DSLSpecificCoverage.DSLSpecificCoveragePackage
 * @generated
 */
public interface DSLSpecificCoverageFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DSLSpecificCoverageFactory eINSTANCE = DSLSpecificCoverage.impl.DSLSpecificCoverageFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Domain Specific Coverage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Domain Specific Coverage</em>'.
	 * @generated
	 */
	DomainSpecificCoverage createDomainSpecificCoverage();

	/**
	 * Returns a new object of class '<em>Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Context</em>'.
	 * @generated
	 */
	Context createContext();

	/**
	 * Returns a new object of class '<em>Coverage Of Referenced</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Coverage Of Referenced</em>'.
	 * @generated
	 */
	CoverageOfReferenced createCoverageOfReferenced();

	/**
	 * Returns a new object of class '<em>Coverage By Content</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Coverage By Content</em>'.
	 * @generated
	 */
	CoverageByContent createCoverageByContent();

	/**
	 * Returns a new object of class '<em>Ignore</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ignore</em>'.
	 * @generated
	 */
	Ignore createIgnore();

	/**
	 * Returns a new object of class '<em>Limited Ignore</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Limited Ignore</em>'.
	 * @generated
	 */
	LimitedIgnore createLimitedIgnore();

	/**
	 * Returns a new object of class '<em>Branch Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Branch Specification</em>'.
	 * @generated
	 */
	BranchSpecification createBranchSpecification();

	/**
	 * Returns a new object of class '<em>Branch</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Branch</em>'.
	 * @generated
	 */
	Branch createBranch();

	/**
	 * Returns a new object of class '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Condition</em>'.
	 * @generated
	 */
	Condition createCondition();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DSLSpecificCoveragePackage getDSLSpecificCoveragePackage();

} //DSLSpecificCoverageFactory
