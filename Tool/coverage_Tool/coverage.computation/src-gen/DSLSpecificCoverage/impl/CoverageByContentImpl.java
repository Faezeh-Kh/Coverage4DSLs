/**
 */
package DSLSpecificCoverage.impl;

import DSLSpecificCoverage.CoverageByContent;
import DSLSpecificCoverage.CoveredContents;
import DSLSpecificCoverage.DSLSpecificCoveragePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Coverage By Content</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link DSLSpecificCoverage.impl.CoverageByContentImpl#getContainmentReference <em>Containment Reference</em>}</li>
 *   <li>{@link DSLSpecificCoverage.impl.CoverageByContentImpl#getMultiplicity <em>Multiplicity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CoverageByContentImpl extends InclusionRuleImpl implements CoverageByContent {
	/**
	 * The cached value of the '{@link #getContainmentReference() <em>Containment Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainmentReference()
	 * @generated
	 * @ordered
	 */
	protected EReference containmentReference;

	/**
	 * The default value of the '{@link #getMultiplicity() <em>Multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplicity()
	 * @generated
	 * @ordered
	 */
	protected static final CoveredContents MULTIPLICITY_EDEFAULT = CoveredContents.ALL;

	/**
	 * The cached value of the '{@link #getMultiplicity() <em>Multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplicity()
	 * @generated
	 * @ordered
	 */
	protected CoveredContents multiplicity = MULTIPLICITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoverageByContentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DSLSpecificCoveragePackage.Literals.COVERAGE_BY_CONTENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContainmentReference() {
		if (containmentReference != null && containmentReference.eIsProxy()) {
			InternalEObject oldContainmentReference = (InternalEObject)containmentReference;
			containmentReference = (EReference)eResolveProxy(oldContainmentReference);
			if (containmentReference != oldContainmentReference) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DSLSpecificCoveragePackage.COVERAGE_BY_CONTENT__CONTAINMENT_REFERENCE, oldContainmentReference, containmentReference));
			}
		}
		return containmentReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference basicGetContainmentReference() {
		return containmentReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainmentReference(EReference newContainmentReference) {
		EReference oldContainmentReference = containmentReference;
		containmentReference = newContainmentReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DSLSpecificCoveragePackage.COVERAGE_BY_CONTENT__CONTAINMENT_REFERENCE, oldContainmentReference, containmentReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoveredContents getMultiplicity() {
		return multiplicity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiplicity(CoveredContents newMultiplicity) {
		CoveredContents oldMultiplicity = multiplicity;
		multiplicity = newMultiplicity == null ? MULTIPLICITY_EDEFAULT : newMultiplicity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DSLSpecificCoveragePackage.COVERAGE_BY_CONTENT__MULTIPLICITY, oldMultiplicity, multiplicity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DSLSpecificCoveragePackage.COVERAGE_BY_CONTENT__CONTAINMENT_REFERENCE:
				if (resolve) return getContainmentReference();
				return basicGetContainmentReference();
			case DSLSpecificCoveragePackage.COVERAGE_BY_CONTENT__MULTIPLICITY:
				return getMultiplicity();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DSLSpecificCoveragePackage.COVERAGE_BY_CONTENT__CONTAINMENT_REFERENCE:
				setContainmentReference((EReference)newValue);
				return;
			case DSLSpecificCoveragePackage.COVERAGE_BY_CONTENT__MULTIPLICITY:
				setMultiplicity((CoveredContents)newValue);
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
			case DSLSpecificCoveragePackage.COVERAGE_BY_CONTENT__CONTAINMENT_REFERENCE:
				setContainmentReference((EReference)null);
				return;
			case DSLSpecificCoveragePackage.COVERAGE_BY_CONTENT__MULTIPLICITY:
				setMultiplicity(MULTIPLICITY_EDEFAULT);
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
			case DSLSpecificCoveragePackage.COVERAGE_BY_CONTENT__CONTAINMENT_REFERENCE:
				return containmentReference != null;
			case DSLSpecificCoveragePackage.COVERAGE_BY_CONTENT__MULTIPLICITY:
				return multiplicity != MULTIPLICITY_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (multiplicity: ");
		result.append(multiplicity);
		result.append(')');
		return result.toString();
	}

} //CoverageByContentImpl
