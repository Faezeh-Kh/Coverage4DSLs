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

import shipyardV4.Shipyard;
import shipyardV4.ShipyardPropertiesAbstract;
import shipyardV4.ShipyardV4Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Shipyard</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link shipyardV4.impl.ShipyardImpl#getShipyard <em>Shipyard</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ShipyardImpl extends MinimalEObjectImpl.Container implements Shipyard {
	/**
	 * The cached value of the '{@link #getShipyard() <em>Shipyard</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShipyard()
	 * @generated
	 * @ordered
	 */
	protected EList<ShipyardPropertiesAbstract> shipyard;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ShipyardImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ShipyardV4Package.Literals.SHIPYARD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ShipyardPropertiesAbstract> getShipyard() {
		if (shipyard == null) {
			shipyard = new EObjectContainmentEList<ShipyardPropertiesAbstract>(ShipyardPropertiesAbstract.class, this, ShipyardV4Package.SHIPYARD__SHIPYARD);
		}
		return shipyard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ShipyardV4Package.SHIPYARD__SHIPYARD:
				return ((InternalEList<?>)getShipyard()).basicRemove(otherEnd, msgs);
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
			case ShipyardV4Package.SHIPYARD__SHIPYARD:
				return getShipyard();
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
			case ShipyardV4Package.SHIPYARD__SHIPYARD:
				getShipyard().clear();
				getShipyard().addAll((Collection<? extends ShipyardPropertiesAbstract>)newValue);
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
			case ShipyardV4Package.SHIPYARD__SHIPYARD:
				getShipyard().clear();
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
			case ShipyardV4Package.SHIPYARD__SHIPYARD:
				return shipyard != null && !shipyard.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ShipyardImpl
