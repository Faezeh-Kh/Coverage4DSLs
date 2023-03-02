/**
 */
package shipyardV4.impl;

import jsonMetaschemaMM.JsonDocument;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import shipyardV4.ShipyardV4Package;
import shipyardV4.TaskPropertiesAdditionalProperties;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task Properties Additional Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link shipyardV4.impl.TaskPropertiesAdditionalPropertiesImpl#getKey <em>Key</em>}</li>
 *   <li>{@link shipyardV4.impl.TaskPropertiesAdditionalPropertiesImpl#getAdditionalProperties <em>Additional Properties</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TaskPropertiesAdditionalPropertiesImpl extends TaskPropertiesPropertiesAbstractImpl implements TaskPropertiesAdditionalProperties {
	/**
	 * The default value of the '{@link #getKey() <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey()
	 * @generated
	 * @ordered
	 */
	protected static final String KEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKey() <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey()
	 * @generated
	 * @ordered
	 */
	protected String key = KEY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAdditionalProperties() <em>Additional Properties</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalProperties()
	 * @generated
	 * @ordered
	 */
	protected JsonDocument additionalProperties;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskPropertiesAdditionalPropertiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ShipyardV4Package.Literals.TASK_PROPERTIES_ADDITIONAL_PROPERTIES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getKey() {
		return key;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKey(String newKey) {
		String oldKey = key;
		key = newKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShipyardV4Package.TASK_PROPERTIES_ADDITIONAL_PROPERTIES__KEY, oldKey, key));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JsonDocument getAdditionalProperties() {
		if (additionalProperties != null && additionalProperties.eIsProxy()) {
			InternalEObject oldAdditionalProperties = (InternalEObject)additionalProperties;
			additionalProperties = (JsonDocument)eResolveProxy(oldAdditionalProperties);
			if (additionalProperties != oldAdditionalProperties) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ShipyardV4Package.TASK_PROPERTIES_ADDITIONAL_PROPERTIES__ADDITIONAL_PROPERTIES, oldAdditionalProperties, additionalProperties));
			}
		}
		return additionalProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JsonDocument basicGetAdditionalProperties() {
		return additionalProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdditionalProperties(JsonDocument newAdditionalProperties) {
		JsonDocument oldAdditionalProperties = additionalProperties;
		additionalProperties = newAdditionalProperties;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShipyardV4Package.TASK_PROPERTIES_ADDITIONAL_PROPERTIES__ADDITIONAL_PROPERTIES, oldAdditionalProperties, additionalProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ShipyardV4Package.TASK_PROPERTIES_ADDITIONAL_PROPERTIES__KEY:
				return getKey();
			case ShipyardV4Package.TASK_PROPERTIES_ADDITIONAL_PROPERTIES__ADDITIONAL_PROPERTIES:
				if (resolve) return getAdditionalProperties();
				return basicGetAdditionalProperties();
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
			case ShipyardV4Package.TASK_PROPERTIES_ADDITIONAL_PROPERTIES__KEY:
				setKey((String)newValue);
				return;
			case ShipyardV4Package.TASK_PROPERTIES_ADDITIONAL_PROPERTIES__ADDITIONAL_PROPERTIES:
				setAdditionalProperties((JsonDocument)newValue);
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
			case ShipyardV4Package.TASK_PROPERTIES_ADDITIONAL_PROPERTIES__KEY:
				setKey(KEY_EDEFAULT);
				return;
			case ShipyardV4Package.TASK_PROPERTIES_ADDITIONAL_PROPERTIES__ADDITIONAL_PROPERTIES:
				setAdditionalProperties((JsonDocument)null);
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
			case ShipyardV4Package.TASK_PROPERTIES_ADDITIONAL_PROPERTIES__KEY:
				return KEY_EDEFAULT == null ? key != null : !KEY_EDEFAULT.equals(key);
			case ShipyardV4Package.TASK_PROPERTIES_ADDITIONAL_PROPERTIES__ADDITIONAL_PROPERTIES:
				return additionalProperties != null;
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
		result.append(" (key: ");
		result.append(key);
		result.append(')');
		return result.toString();
	}

} //TaskPropertiesAdditionalPropertiesImpl
