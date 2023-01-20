/**
 */
package shipyardV4.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import shipyardV4.SequenceTriggeredOn;
import shipyardV4.SequenceTriggeredOnItems;
import shipyardV4.ShipyardV4Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sequence Triggered On</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link shipyardV4.impl.SequenceTriggeredOnImpl#getTriggeredOn <em>Triggered On</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SequenceTriggeredOnImpl extends SequencePropertiesAbstractImpl implements SequenceTriggeredOn {
	/**
	 * The cached value of the '{@link #getTriggeredOn() <em>Triggered On</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriggeredOn()
	 * @generated
	 * @ordered
	 */
	protected EList<SequenceTriggeredOnItems> triggeredOn;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SequenceTriggeredOnImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ShipyardV4Package.Literals.SEQUENCE_TRIGGERED_ON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SequenceTriggeredOnItems> getTriggeredOn() {
		if (triggeredOn == null) {
			triggeredOn = new EObjectContainmentEList<SequenceTriggeredOnItems>(SequenceTriggeredOnItems.class, this, ShipyardV4Package.SEQUENCE_TRIGGERED_ON__TRIGGERED_ON);
		}
		return triggeredOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ShipyardV4Package.SEQUENCE_TRIGGERED_ON__TRIGGERED_ON:
				return ((InternalEList<?>)getTriggeredOn()).basicRemove(otherEnd, msgs);
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
			case ShipyardV4Package.SEQUENCE_TRIGGERED_ON__TRIGGERED_ON:
				return getTriggeredOn();
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
			case ShipyardV4Package.SEQUENCE_TRIGGERED_ON__TRIGGERED_ON:
				getTriggeredOn().clear();
				getTriggeredOn().addAll((Collection<? extends SequenceTriggeredOnItems>)newValue);
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
			case ShipyardV4Package.SEQUENCE_TRIGGERED_ON__TRIGGERED_ON:
				getTriggeredOn().clear();
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
			case ShipyardV4Package.SEQUENCE_TRIGGERED_ON__TRIGGERED_ON:
				return triggeredOn != null && !triggeredOn.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SequenceTriggeredOnImpl
