/**
 */
package tll.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import tll.Component;
import tll.Item;
import tll.TllPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tll.impl.ComponentImpl#getHosts <em>Hosts</em>}</li>
 *   <li>{@link tll.impl.ComponentImpl#getProcessingTime <em>Processing Time</em>}</li>
 *   <li>{@link tll.impl.ComponentImpl#getUncertainty <em>Uncertainty</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ComponentImpl extends NamedElementImpl implements Component {
	/**
	 * The cached value of the '{@link #getHosts() <em>Hosts</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHosts()
	 * @generated
	 * @ordered
	 */
	protected Item hosts;

	/**
	 * The default value of the '{@link #getProcessingTime() <em>Processing Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessingTime()
	 * @generated
	 * @ordered
	 */
	protected static final int PROCESSING_TIME_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getProcessingTime() <em>Processing Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessingTime()
	 * @generated
	 * @ordered
	 */
	protected int processingTime = PROCESSING_TIME_EDEFAULT;
	/**
	 * The default value of the '{@link #getUncertainty() <em>Uncertainty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUncertainty()
	 * @generated
	 * @ordered
	 */
	protected static final int UNCERTAINTY_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getUncertainty() <em>Uncertainty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUncertainty()
	 * @generated
	 * @ordered
	 */
	protected int uncertainty = UNCERTAINTY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TllPackage.Literals.COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Item getHosts() {
		if (hosts != null && hosts.eIsProxy()) {
			InternalEObject oldHosts = (InternalEObject)hosts;
			hosts = (Item)eResolveProxy(oldHosts);
			if (hosts != oldHosts) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TllPackage.COMPONENT__HOSTS, oldHosts, hosts));
			}
		}
		return hosts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Item basicGetHosts() {
		return hosts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHosts(Item newHosts, NotificationChain msgs) {
		Item oldHosts = hosts;
		hosts = newHosts;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TllPackage.COMPONENT__HOSTS, oldHosts, newHosts);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHosts(Item newHosts) {
		if (newHosts != hosts) {
			NotificationChain msgs = null;
			if (hosts != null)
				msgs = ((InternalEObject)hosts).eInverseRemove(this, TllPackage.ITEM__LOCATION, Item.class, msgs);
			if (newHosts != null)
				msgs = ((InternalEObject)newHosts).eInverseAdd(this, TllPackage.ITEM__LOCATION, Item.class, msgs);
			msgs = basicSetHosts(newHosts, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TllPackage.COMPONENT__HOSTS, newHosts, newHosts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getProcessingTime() {
		return processingTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcessingTime(int newProcessingTime) {
		int oldProcessingTime = processingTime;
		processingTime = newProcessingTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TllPackage.COMPONENT__PROCESSING_TIME, oldProcessingTime, processingTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getUncertainty() {
		return uncertainty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUncertainty(int newUncertainty) {
		int oldUncertainty = uncertainty;
		uncertainty = newUncertainty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TllPackage.COMPONENT__UNCERTAINTY, oldUncertainty, uncertainty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void do_() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TllPackage.COMPONENT__HOSTS:
				if (hosts != null)
					msgs = ((InternalEObject)hosts).eInverseRemove(this, TllPackage.ITEM__LOCATION, Item.class, msgs);
				return basicSetHosts((Item)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TllPackage.COMPONENT__HOSTS:
				return basicSetHosts(null, msgs);
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
			case TllPackage.COMPONENT__HOSTS:
				if (resolve) return getHosts();
				return basicGetHosts();
			case TllPackage.COMPONENT__PROCESSING_TIME:
				return getProcessingTime();
			case TllPackage.COMPONENT__UNCERTAINTY:
				return getUncertainty();
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
			case TllPackage.COMPONENT__HOSTS:
				setHosts((Item)newValue);
				return;
			case TllPackage.COMPONENT__PROCESSING_TIME:
				setProcessingTime((Integer)newValue);
				return;
			case TllPackage.COMPONENT__UNCERTAINTY:
				setUncertainty((Integer)newValue);
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
			case TllPackage.COMPONENT__HOSTS:
				setHosts((Item)null);
				return;
			case TllPackage.COMPONENT__PROCESSING_TIME:
				setProcessingTime(PROCESSING_TIME_EDEFAULT);
				return;
			case TllPackage.COMPONENT__UNCERTAINTY:
				setUncertainty(UNCERTAINTY_EDEFAULT);
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
			case TllPackage.COMPONENT__HOSTS:
				return hosts != null;
			case TllPackage.COMPONENT__PROCESSING_TIME:
				return processingTime != PROCESSING_TIME_EDEFAULT;
			case TllPackage.COMPONENT__UNCERTAINTY:
				return uncertainty != UNCERTAINTY_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case TllPackage.COMPONENT___DO_:
				do_();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (processingTime: ");
		result.append(processingTime);
		result.append(", uncertainty: ");
		result.append(uncertainty);
		result.append(')');
		return result.toString();
	}

} //ComponentImpl
