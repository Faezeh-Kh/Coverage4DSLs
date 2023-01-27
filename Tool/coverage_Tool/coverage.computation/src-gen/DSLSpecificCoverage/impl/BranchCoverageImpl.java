/**
 */
package DSLSpecificCoverage.impl;

import DSLSpecificCoverage.BranchCoverage;
import DSLSpecificCoverage.BranchSpecification;
import DSLSpecificCoverage.DSLSpecificCoveragePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Branch Coverage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link DSLSpecificCoverage.impl.BranchCoverageImpl#getBranchSpecifications <em>Branch Specifications</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BranchCoverageImpl extends CoverageMetricImpl implements BranchCoverage {
	/**
	 * The cached value of the '{@link #getBranchSpecifications() <em>Branch Specifications</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBranchSpecifications()
	 * @generated
	 * @ordered
	 */
	protected EList<BranchSpecification> branchSpecifications;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BranchCoverageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DSLSpecificCoveragePackage.Literals.BRANCH_COVERAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BranchSpecification> getBranchSpecifications() {
		if (branchSpecifications == null) {
			branchSpecifications = new EObjectContainmentEList<BranchSpecification>(BranchSpecification.class, this, DSLSpecificCoveragePackage.BRANCH_COVERAGE__BRANCH_SPECIFICATIONS);
		}
		return branchSpecifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DSLSpecificCoveragePackage.BRANCH_COVERAGE__BRANCH_SPECIFICATIONS:
				return ((InternalEList<?>)getBranchSpecifications()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DSLSpecificCoveragePackage.BRANCH_COVERAGE__BRANCH_SPECIFICATIONS:
				return getBranchSpecifications();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DSLSpecificCoveragePackage.BRANCH_COVERAGE__BRANCH_SPECIFICATIONS:
				getBranchSpecifications().clear();
				getBranchSpecifications().addAll((Collection<? extends BranchSpecification>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case DSLSpecificCoveragePackage.BRANCH_COVERAGE__BRANCH_SPECIFICATIONS:
				getBranchSpecifications().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DSLSpecificCoveragePackage.BRANCH_COVERAGE__BRANCH_SPECIFICATIONS:
				return branchSpecifications != null && !branchSpecifications.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BranchCoverageImpl
