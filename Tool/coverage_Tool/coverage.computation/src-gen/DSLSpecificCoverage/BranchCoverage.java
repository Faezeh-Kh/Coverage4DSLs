/**
 */
package DSLSpecificCoverage;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Branch Coverage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link DSLSpecificCoverage.BranchCoverage#getBranchSpecifications <em>Branch Specifications</em>}</li>
 * </ul>
 *
 * @see DSLSpecificCoverage.DSLSpecificCoveragePackage#getBranchCoverage()
 * @model
 * @generated
 */
public interface BranchCoverage extends CoverageMetric {
	/**
	 * Returns the value of the '<em><b>Branch Specifications</b></em>' containment reference list.
	 * The list contents are of type {@link DSLSpecificCoverage.BranchSpecification}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Branch Specifications</em>' containment reference list.
	 * @see DSLSpecificCoverage.DSLSpecificCoveragePackage#getBranchCoverage_BranchSpecifications()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<BranchSpecification> getBranchSpecifications();

} // BranchCoverage
