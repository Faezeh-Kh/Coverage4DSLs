/**
 */
package minitl.impl;

import java.util.Collection;

import minitl.Binding;
import minitl.ObjectTemplate;
import minitl.Rule;
import minitl.minitlPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object Template</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link minitl.impl.ObjectTemplateImpl#getBindings <em>Bindings</em>}</li>
 *   <li>{@link minitl.impl.ObjectTemplateImpl#getType <em>Type</em>}</li>
 *   <li>{@link minitl.impl.ObjectTemplateImpl#getRule <em>Rule</em>}</li>
 *   <li>{@link minitl.impl.ObjectTemplateImpl#getCurrentObject <em>Current Object</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ObjectTemplateImpl extends NamedElementImpl implements ObjectTemplate {
	/**
	 * The cached value of the '{@link #getBindings() <em>Bindings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBindings()
	 * @generated
	 * @ordered
	 */
	protected EList<Binding> bindings;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected EClass type;

	/**
	 * The default value of the '{@link #getCurrentObject() <em>Current Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentObject()
	 * @generated
	 * @ordered
	 */
	protected static final EObject CURRENT_OBJECT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCurrentObject() <em>Current Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentObject()
	 * @generated
	 * @ordered
	 */
	protected EObject currentObject = CURRENT_OBJECT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectTemplateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return minitlPackage.Literals.OBJECT_TEMPLATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Binding> getBindings() {
		if (bindings == null) {
			bindings = new EObjectContainmentWithInverseEList<Binding>(Binding.class, this,
					minitlPackage.OBJECT_TEMPLATE__BINDINGS, minitlPackage.BINDING__OBJECT_TEMPLATE);
		}
		return bindings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject) type;
			type = (EClass) eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, minitlPackage.OBJECT_TEMPLATE__TYPE,
							oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(EClass newType) {
		EClass oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, minitlPackage.OBJECT_TEMPLATE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rule getRule() {
		if (eContainerFeatureID() != minitlPackage.OBJECT_TEMPLATE__RULE)
			return null;
		return (Rule) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRule(Rule newRule, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newRule, minitlPackage.OBJECT_TEMPLATE__RULE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRule(Rule newRule) {
		if (newRule != eInternalContainer()
				|| (eContainerFeatureID() != minitlPackage.OBJECT_TEMPLATE__RULE && newRule != null)) {
			if (EcoreUtil.isAncestor(this, newRule))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newRule != null)
				msgs = ((InternalEObject) newRule).eInverseAdd(this, minitlPackage.RULE__OBJECT_TEMPLATES, Rule.class,
						msgs);
			msgs = basicSetRule(newRule, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, minitlPackage.OBJECT_TEMPLATE__RULE, newRule,
					newRule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getCurrentObject() {
		return currentObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentObject(EObject newCurrentObject) {
		EObject oldCurrentObject = currentObject;
		currentObject = newCurrentObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, minitlPackage.OBJECT_TEMPLATE__CURRENT_OBJECT,
					oldCurrentObject, currentObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case minitlPackage.OBJECT_TEMPLATE__BINDINGS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getBindings()).basicAdd(otherEnd, msgs);
		case minitlPackage.OBJECT_TEMPLATE__RULE:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetRule((Rule) otherEnd, msgs);
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
		case minitlPackage.OBJECT_TEMPLATE__BINDINGS:
			return ((InternalEList<?>) getBindings()).basicRemove(otherEnd, msgs);
		case minitlPackage.OBJECT_TEMPLATE__RULE:
			return basicSetRule(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
		case minitlPackage.OBJECT_TEMPLATE__RULE:
			return eInternalContainer().eInverseRemove(this, minitlPackage.RULE__OBJECT_TEMPLATES, Rule.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case minitlPackage.OBJECT_TEMPLATE__BINDINGS:
			return getBindings();
		case minitlPackage.OBJECT_TEMPLATE__TYPE:
			if (resolve)
				return getType();
			return basicGetType();
		case minitlPackage.OBJECT_TEMPLATE__RULE:
			return getRule();
		case minitlPackage.OBJECT_TEMPLATE__CURRENT_OBJECT:
			return getCurrentObject();
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
		case minitlPackage.OBJECT_TEMPLATE__BINDINGS:
			getBindings().clear();
			getBindings().addAll((Collection<? extends Binding>) newValue);
			return;
		case minitlPackage.OBJECT_TEMPLATE__TYPE:
			setType((EClass) newValue);
			return;
		case minitlPackage.OBJECT_TEMPLATE__RULE:
			setRule((Rule) newValue);
			return;
		case minitlPackage.OBJECT_TEMPLATE__CURRENT_OBJECT:
			setCurrentObject((EObject) newValue);
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
		case minitlPackage.OBJECT_TEMPLATE__BINDINGS:
			getBindings().clear();
			return;
		case minitlPackage.OBJECT_TEMPLATE__TYPE:
			setType((EClass) null);
			return;
		case minitlPackage.OBJECT_TEMPLATE__RULE:
			setRule((Rule) null);
			return;
		case minitlPackage.OBJECT_TEMPLATE__CURRENT_OBJECT:
			setCurrentObject(CURRENT_OBJECT_EDEFAULT);
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
		case minitlPackage.OBJECT_TEMPLATE__BINDINGS:
			return bindings != null && !bindings.isEmpty();
		case minitlPackage.OBJECT_TEMPLATE__TYPE:
			return type != null;
		case minitlPackage.OBJECT_TEMPLATE__RULE:
			return getRule() != null;
		case minitlPackage.OBJECT_TEMPLATE__CURRENT_OBJECT:
			return CURRENT_OBJECT_EDEFAULT == null ? currentObject != null
					: !CURRENT_OBJECT_EDEFAULT.equals(currentObject);
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
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (currentObject: ");
		result.append(currentObject);
		result.append(')');
		return result.toString();
	}

} //ObjectTemplateImpl
