/**
 */
package DSLSpecificCoverage;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Branch Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link DSLSpecificCoverage.BranchSpecification#getBranches <em>Branches</em>}</li>
 * </ul>
 *
 * @see DSLSpecificCoverage.DSLSpecificCoveragePackage#getBranchSpecification()
 * @model
 * @generated
 */
public interface BranchSpecification extends Rule {
	/**
	 * Returns the value of the '<em><b>Branches</b></em>' containment reference list.
	 * The list contents are of type {@link DSLSpecificCoverage.Branch}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Branches</em>' containment reference list.
	 * @see DSLSpecificCoverage.DSLSpecificCoveragePackage#getBranchSpecification_Branches()
	 * @model containment="true"
	 * @generated
	 */
	EList<Branch> getBranches();

} // BranchSpecification
