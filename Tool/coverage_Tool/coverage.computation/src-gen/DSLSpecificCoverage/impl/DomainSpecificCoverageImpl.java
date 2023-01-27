/**
 */
package DSLSpecificCoverage.impl;

import DSLSpecificCoverage.CoverageMetric;
import DSLSpecificCoverage.DSLSpecificCoveragePackage;
import DSLSpecificCoverage.DomainSpecificCoverage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Domain Specific Coverage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link DSLSpecificCoverage.impl.DomainSpecificCoverageImpl#getName <em>Name</em>}</li>
 *   <li>{@link DSLSpecificCoverage.impl.DomainSpecificCoverageImpl#getMetamodel <em>Metamodel</em>}</li>
 *   <li>{@link DSLSpecificCoverage.impl.DomainSpecificCoverageImpl#getCoverageMetrics <em>Coverage Metrics</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DomainSpecificCoverageImpl extends MinimalEObjectImpl.Container implements DomainSpecificCoverage {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMetamodel() <em>Metamodel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetamodel()
	 * @generated
	 * @ordered
	 */
	protected EPackage metamodel;

	/**
	 * The cached value of the '{@link #getCoverageMetrics() <em>Coverage Metrics</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoverageMetrics()
	 * @generated
	 * @ordered
	 */
	protected EList<CoverageMetric> coverageMetrics;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainSpecificCoverageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DSLSpecificCoveragePackage.Literals.DOMAIN_SPECIFIC_COVERAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DSLSpecificCoveragePackage.DOMAIN_SPECIFIC_COVERAGE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EPackage getMetamodel() {
		if (metamodel != null && metamodel.eIsProxy()) {
			InternalEObject oldMetamodel = (InternalEObject)metamodel;
			metamodel = (EPackage)eResolveProxy(oldMetamodel);
			if (metamodel != oldMetamodel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DSLSpecificCoveragePackage.DOMAIN_SPECIFIC_COVERAGE__METAMODEL, oldMetamodel, metamodel));
			}
		}
		return metamodel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EPackage basicGetMetamodel() {
		return metamodel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetamodel(EPackage newMetamodel) {
		EPackage oldMetamodel = metamodel;
		metamodel = newMetamodel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DSLSpecificCoveragePackage.DOMAIN_SPECIFIC_COVERAGE__METAMODEL, oldMetamodel, metamodel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CoverageMetric> getCoverageMetrics() {
		if (coverageMetrics == null) {
			coverageMetrics = new EObjectContainmentEList<CoverageMetric>(CoverageMetric.class, this, DSLSpecificCoveragePackage.DOMAIN_SPECIFIC_COVERAGE__COVERAGE_METRICS);
		}
		return coverageMetrics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DSLSpecificCoveragePackage.DOMAIN_SPECIFIC_COVERAGE__COVERAGE_METRICS:
				return ((InternalEList<?>)getCoverageMetrics()).basicRemove(otherEnd, msgs);
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
			case DSLSpecificCoveragePackage.DOMAIN_SPECIFIC_COVERAGE__NAME:
				return getName();
			case DSLSpecificCoveragePackage.DOMAIN_SPECIFIC_COVERAGE__METAMODEL:
				if (resolve) return getMetamodel();
				return basicGetMetamodel();
			case DSLSpecificCoveragePackage.DOMAIN_SPECIFIC_COVERAGE__COVERAGE_METRICS:
				return getCoverageMetrics();
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
			case DSLSpecificCoveragePackage.DOMAIN_SPECIFIC_COVERAGE__NAME:
				setName((String)newValue);
				return;
			case DSLSpecificCoveragePackage.DOMAIN_SPECIFIC_COVERAGE__METAMODEL:
				setMetamodel((EPackage)newValue);
				return;
			case DSLSpecificCoveragePackage.DOMAIN_SPECIFIC_COVERAGE__COVERAGE_METRICS:
				getCoverageMetrics().clear();
				getCoverageMetrics().addAll((Collection<? extends CoverageMetric>)newValue);
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
			case DSLSpecificCoveragePackage.DOMAIN_SPECIFIC_COVERAGE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DSLSpecificCoveragePackage.DOMAIN_SPECIFIC_COVERAGE__METAMODEL:
				setMetamodel((EPackage)null);
				return;
			case DSLSpecificCoveragePackage.DOMAIN_SPECIFIC_COVERAGE__COVERAGE_METRICS:
				getCoverageMetrics().clear();
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
			case DSLSpecificCoveragePackage.DOMAIN_SPECIFIC_COVERAGE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DSLSpecificCoveragePackage.DOMAIN_SPECIFIC_COVERAGE__METAMODEL:
				return metamodel != null;
			case DSLSpecificCoveragePackage.DOMAIN_SPECIFIC_COVERAGE__COVERAGE_METRICS:
				return coverageMetrics != null && !coverageMetrics.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //DomainSpecificCoverageImpl
