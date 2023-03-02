/**
 */
package TestCoverage.impl;

import TestCoverage.CoverageStatus;
import TestCoverage.ModelObjectCoverageStatus;
import TestCoverage.TestCoveragePackage;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Object Coverage Status</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link TestCoverage.impl.ModelObjectCoverageStatusImpl#getModelObject <em>Model Object</em>}</li>
 *   <li>{@link TestCoverage.impl.ModelObjectCoverageStatusImpl#getCoverageStatus <em>Coverage Status</em>}</li>
 *   <li>{@link TestCoverage.impl.ModelObjectCoverageStatusImpl#getRelatedObjectCoverageStatus <em>Related Object Coverage Status</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelObjectCoverageStatusImpl extends MinimalEObjectImpl.Container implements ModelObjectCoverageStatus {
	/**
	 * The cached value of the '{@link #getModelObject() <em>Model Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelObject()
	 * @generated
	 * @ordered
	 */
	protected EObject modelObject;

	/**
	 * The default value of the '{@link #getCoverageStatus() <em>Coverage Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoverageStatus()
	 * @generated
	 * @ordered
	 */
	protected static final CoverageStatus COVERAGE_STATUS_EDEFAULT = CoverageStatus.COVERED;

	/**
	 * The cached value of the '{@link #getCoverageStatus() <em>Coverage Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoverageStatus()
	 * @generated
	 * @ordered
	 */
	protected CoverageStatus coverageStatus = COVERAGE_STATUS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRelatedObjectCoverageStatus() <em>Related Object Coverage Status</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedObjectCoverageStatus()
	 * @generated
	 * @ordered
	 */
	protected EList<ModelObjectCoverageStatus> relatedObjectCoverageStatus;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelObjectCoverageStatusImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TestCoveragePackage.Literals.MODEL_OBJECT_COVERAGE_STATUS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getModelObject() {
		if (modelObject != null && modelObject.eIsProxy()) {
			InternalEObject oldModelObject = (InternalEObject)modelObject;
			modelObject = eResolveProxy(oldModelObject);
			if (modelObject != oldModelObject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TestCoveragePackage.MODEL_OBJECT_COVERAGE_STATUS__MODEL_OBJECT, oldModelObject, modelObject));
			}
		}
		return modelObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetModelObject() {
		return modelObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModelObject(EObject newModelObject) {
		EObject oldModelObject = modelObject;
		modelObject = newModelObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestCoveragePackage.MODEL_OBJECT_COVERAGE_STATUS__MODEL_OBJECT, oldModelObject, modelObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoverageStatus getCoverageStatus() {
		return coverageStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoverageStatus(CoverageStatus newCoverageStatus) {
		CoverageStatus oldCoverageStatus = coverageStatus;
		coverageStatus = newCoverageStatus == null ? COVERAGE_STATUS_EDEFAULT : newCoverageStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestCoveragePackage.MODEL_OBJECT_COVERAGE_STATUS__COVERAGE_STATUS, oldCoverageStatus, coverageStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModelObjectCoverageStatus> getRelatedObjectCoverageStatus() {
		if (relatedObjectCoverageStatus == null) {
			relatedObjectCoverageStatus = new EObjectContainmentEList<ModelObjectCoverageStatus>(ModelObjectCoverageStatus.class, this, TestCoveragePackage.MODEL_OBJECT_COVERAGE_STATUS__RELATED_OBJECT_COVERAGE_STATUS);
		}
		return relatedObjectCoverageStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TestCoveragePackage.MODEL_OBJECT_COVERAGE_STATUS__RELATED_OBJECT_COVERAGE_STATUS:
				return ((InternalEList<?>)getRelatedObjectCoverageStatus()).basicRemove(otherEnd, msgs);
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
			case TestCoveragePackage.MODEL_OBJECT_COVERAGE_STATUS__MODEL_OBJECT:
				if (resolve) return getModelObject();
				return basicGetModelObject();
			case TestCoveragePackage.MODEL_OBJECT_COVERAGE_STATUS__COVERAGE_STATUS:
				return getCoverageStatus();
			case TestCoveragePackage.MODEL_OBJECT_COVERAGE_STATUS__RELATED_OBJECT_COVERAGE_STATUS:
				return getRelatedObjectCoverageStatus();
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
			case TestCoveragePackage.MODEL_OBJECT_COVERAGE_STATUS__MODEL_OBJECT:
				setModelObject((EObject)newValue);
				return;
			case TestCoveragePackage.MODEL_OBJECT_COVERAGE_STATUS__COVERAGE_STATUS:
				setCoverageStatus((CoverageStatus)newValue);
				return;
			case TestCoveragePackage.MODEL_OBJECT_COVERAGE_STATUS__RELATED_OBJECT_COVERAGE_STATUS:
				getRelatedObjectCoverageStatus().clear();
				getRelatedObjectCoverageStatus().addAll((Collection<? extends ModelObjectCoverageStatus>)newValue);
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
			case TestCoveragePackage.MODEL_OBJECT_COVERAGE_STATUS__MODEL_OBJECT:
				setModelObject((EObject)null);
				return;
			case TestCoveragePackage.MODEL_OBJECT_COVERAGE_STATUS__COVERAGE_STATUS:
				setCoverageStatus(COVERAGE_STATUS_EDEFAULT);
				return;
			case TestCoveragePackage.MODEL_OBJECT_COVERAGE_STATUS__RELATED_OBJECT_COVERAGE_STATUS:
				getRelatedObjectCoverageStatus().clear();
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
			case TestCoveragePackage.MODEL_OBJECT_COVERAGE_STATUS__MODEL_OBJECT:
				return modelObject != null;
			case TestCoveragePackage.MODEL_OBJECT_COVERAGE_STATUS__COVERAGE_STATUS:
				return coverageStatus != COVERAGE_STATUS_EDEFAULT;
			case TestCoveragePackage.MODEL_OBJECT_COVERAGE_STATUS__RELATED_OBJECT_COVERAGE_STATUS:
				return relatedObjectCoverageStatus != null && !relatedObjectCoverageStatus.isEmpty();
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
		result.append(" (coverageStatus: ");
		result.append(coverageStatus);
		result.append(')');
		return result.toString();
	}

} //ModelObjectCoverageStatusImpl
