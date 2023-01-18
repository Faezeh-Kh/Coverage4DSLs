/**
 */
package DSLSpecificCoverage.impl;

import DSLSpecificCoverage.CoverageOfReferenced;
import DSLSpecificCoverage.DSLSpecificCoveragePackage;

import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Coverage Of Referenced</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link DSLSpecificCoverage.impl.CoverageOfReferencedImpl#getReference <em>Reference</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CoverageOfReferencedImpl extends InclusionRuleImpl implements CoverageOfReferenced {
	/**
	 * The cached value of the '{@link #getReference() <em>Reference</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReference()
	 * @generated
	 * @ordered
	 */
	protected EList<EReference> reference;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoverageOfReferencedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DSLSpecificCoveragePackage.Literals.COVERAGE_OF_REFERENCED;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EReference> getReference() {
		if (reference == null) {
			reference = new EObjectResolvingEList<EReference>(EReference.class, this, DSLSpecificCoveragePackage.COVERAGE_OF_REFERENCED__REFERENCE);
		}
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DSLSpecificCoveragePackage.COVERAGE_OF_REFERENCED__REFERENCE:
				return getReference();
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
			case DSLSpecificCoveragePackage.COVERAGE_OF_REFERENCED__REFERENCE:
				getReference().clear();
				getReference().addAll((Collection<? extends EReference>)newValue);
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
			case DSLSpecificCoveragePackage.COVERAGE_OF_REFERENCED__REFERENCE:
				getReference().clear();
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
			case DSLSpecificCoveragePackage.COVERAGE_OF_REFERENCED__REFERENCE:
				return reference != null && !reference.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CoverageOfReferencedImpl
