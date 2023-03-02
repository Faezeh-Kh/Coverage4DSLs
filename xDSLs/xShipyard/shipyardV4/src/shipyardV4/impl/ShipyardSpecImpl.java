/**
 */
package shipyardV4.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import shipyardV4.ShipyardSpec;
import shipyardV4.ShipyardSpecPropertiesAbstract;
import shipyardV4.ShipyardV4Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Shipyard Spec</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link shipyardV4.impl.ShipyardSpecImpl#getShipyardSpec <em>Shipyard Spec</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ShipyardSpecImpl extends MinimalEObjectImpl.Container implements ShipyardSpec {
	/**
	 * The cached value of the '{@link #getShipyardSpec() <em>Shipyard Spec</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShipyardSpec()
	 * @generated
	 * @ordered
	 */
	protected EList<ShipyardSpecPropertiesAbstract> shipyardSpec;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ShipyardSpecImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ShipyardV4Package.Literals.SHIPYARD_SPEC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ShipyardSpecPropertiesAbstract> getShipyardSpec() {
		if (shipyardSpec == null) {
			shipyardSpec = new EObjectContainmentEList<ShipyardSpecPropertiesAbstract>(ShipyardSpecPropertiesAbstract.class, this, ShipyardV4Package.SHIPYARD_SPEC__SHIPYARD_SPEC);
		}
		return shipyardSpec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ShipyardV4Package.SHIPYARD_SPEC__SHIPYARD_SPEC:
				return ((InternalEList<?>)getShipyardSpec()).basicRemove(otherEnd, msgs);
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
			case ShipyardV4Package.SHIPYARD_SPEC__SHIPYARD_SPEC:
				return getShipyardSpec();
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
			case ShipyardV4Package.SHIPYARD_SPEC__SHIPYARD_SPEC:
				getShipyardSpec().clear();
				getShipyardSpec().addAll((Collection<? extends ShipyardSpecPropertiesAbstract>)newValue);
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
			case ShipyardV4Package.SHIPYARD_SPEC__SHIPYARD_SPEC:
				getShipyardSpec().clear();
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
			case ShipyardV4Package.SHIPYARD_SPEC__SHIPYARD_SPEC:
				return shipyardSpec != null && !shipyardSpec.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ShipyardSpecImpl
