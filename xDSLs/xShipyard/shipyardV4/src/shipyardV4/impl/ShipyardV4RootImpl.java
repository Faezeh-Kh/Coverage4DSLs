/**
 */
package shipyardV4.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import shipyardV4.Sequence;
import shipyardV4.Shipyard;
import shipyardV4.ShipyardV4Package;
import shipyardV4.ShipyardV4Root;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link shipyardV4.impl.ShipyardV4RootImpl#getShipyardV4Root <em>Shipyard V4 Root</em>}</li>
 *   <li>{@link shipyardV4.impl.ShipyardV4RootImpl#getInitialSequence <em>Initial Sequence</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ShipyardV4RootImpl extends MinimalEObjectImpl.Container implements ShipyardV4Root {
	/**
	 * The cached value of the '{@link #getShipyardV4Root() <em>Shipyard V4 Root</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShipyardV4Root()
	 * @generated
	 * @ordered
	 */
	protected Shipyard shipyardV4Root;

	/**
	 * The cached value of the '{@link #getInitialSequence() <em>Initial Sequence</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialSequence()
	 * @generated
	 * @ordered
	 */
	protected Sequence initialSequence;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ShipyardV4RootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ShipyardV4Package.Literals.SHIPYARD_V4_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Shipyard getShipyardV4Root() {
		return shipyardV4Root;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetShipyardV4Root(Shipyard newShipyardV4Root, NotificationChain msgs) {
		Shipyard oldShipyardV4Root = shipyardV4Root;
		shipyardV4Root = newShipyardV4Root;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ShipyardV4Package.SHIPYARD_V4_ROOT__SHIPYARD_V4_ROOT, oldShipyardV4Root, newShipyardV4Root);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShipyardV4Root(Shipyard newShipyardV4Root) {
		if (newShipyardV4Root != shipyardV4Root) {
			NotificationChain msgs = null;
			if (shipyardV4Root != null)
				msgs = ((InternalEObject)shipyardV4Root).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ShipyardV4Package.SHIPYARD_V4_ROOT__SHIPYARD_V4_ROOT, null, msgs);
			if (newShipyardV4Root != null)
				msgs = ((InternalEObject)newShipyardV4Root).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ShipyardV4Package.SHIPYARD_V4_ROOT__SHIPYARD_V4_ROOT, null, msgs);
			msgs = basicSetShipyardV4Root(newShipyardV4Root, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShipyardV4Package.SHIPYARD_V4_ROOT__SHIPYARD_V4_ROOT, newShipyardV4Root, newShipyardV4Root));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sequence getInitialSequence() {
		if (initialSequence != null && initialSequence.eIsProxy()) {
			InternalEObject oldInitialSequence = (InternalEObject)initialSequence;
			initialSequence = (Sequence)eResolveProxy(oldInitialSequence);
			if (initialSequence != oldInitialSequence) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ShipyardV4Package.SHIPYARD_V4_ROOT__INITIAL_SEQUENCE, oldInitialSequence, initialSequence));
			}
		}
		return initialSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sequence basicGetInitialSequence() {
		return initialSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialSequence(Sequence newInitialSequence) {
		Sequence oldInitialSequence = initialSequence;
		initialSequence = newInitialSequence;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShipyardV4Package.SHIPYARD_V4_ROOT__INITIAL_SEQUENCE, oldInitialSequence, initialSequence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ShipyardV4Package.SHIPYARD_V4_ROOT__SHIPYARD_V4_ROOT:
				return basicSetShipyardV4Root(null, msgs);
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
			case ShipyardV4Package.SHIPYARD_V4_ROOT__SHIPYARD_V4_ROOT:
				return getShipyardV4Root();
			case ShipyardV4Package.SHIPYARD_V4_ROOT__INITIAL_SEQUENCE:
				if (resolve) return getInitialSequence();
				return basicGetInitialSequence();
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
			case ShipyardV4Package.SHIPYARD_V4_ROOT__SHIPYARD_V4_ROOT:
				setShipyardV4Root((Shipyard)newValue);
				return;
			case ShipyardV4Package.SHIPYARD_V4_ROOT__INITIAL_SEQUENCE:
				setInitialSequence((Sequence)newValue);
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
			case ShipyardV4Package.SHIPYARD_V4_ROOT__SHIPYARD_V4_ROOT:
				setShipyardV4Root((Shipyard)null);
				return;
			case ShipyardV4Package.SHIPYARD_V4_ROOT__INITIAL_SEQUENCE:
				setInitialSequence((Sequence)null);
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
			case ShipyardV4Package.SHIPYARD_V4_ROOT__SHIPYARD_V4_ROOT:
				return shipyardV4Root != null;
			case ShipyardV4Package.SHIPYARD_V4_ROOT__INITIAL_SEQUENCE:
				return initialSequence != null;
		}
		return super.eIsSet(featureID);
	}

} //ShipyardV4RootImpl
