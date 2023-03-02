/**
 */
package tll.impl;

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import tll.Area;
import tll.SimConfig;
import tll.TllPackage;
import tll.store.ModelStore;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tll.impl.SystemImpl#getArea <em>Area</em>}</li>
 *   <li>{@link tll.impl.SystemImpl#getSimconfig <em>Simconfig</em>}</li>
 *   <li>{@link tll.impl.SystemImpl#getLog <em>Log</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SystemImpl extends NamedElementImpl implements tll.System {
	/**
	 * The cached value of the '{@link #getArea() <em>Area</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArea()
	 * @generated
	 * @ordered
	 */
	protected EList<Area> area;

	/**
	 * The cached value of the '{@link #getSimconfig() <em>Simconfig</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimconfig()
	 * @generated
	 * @ordered
	 */
	protected SimConfig simconfig;

	/**
	 * The cached value of the '{@link #getLog() <em>Log</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLog()
	 * @generated
	 * @ordered
	 */
	protected EList<String> log;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TllPackage.Literals.SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Area> getArea() {
		if (area == null) {
			area = new EObjectContainmentEList<Area>(Area.class, this, TllPackage.SYSTEM__AREA);
		}
		return area;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimConfig getSimconfig() {
		return simconfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSimconfig(SimConfig newSimconfig, NotificationChain msgs) {
		SimConfig oldSimconfig = simconfig;
		simconfig = newSimconfig;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TllPackage.SYSTEM__SIMCONFIG, oldSimconfig, newSimconfig);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSimconfig(SimConfig newSimconfig) {
		if (newSimconfig != simconfig) {
			NotificationChain msgs = null;
			if (simconfig != null)
				msgs = ((InternalEObject)simconfig).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TllPackage.SYSTEM__SIMCONFIG, null, msgs);
			if (newSimconfig != null)
				msgs = ((InternalEObject)newSimconfig).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TllPackage.SYSTEM__SIMCONFIG, null, msgs);
			msgs = basicSetSimconfig(newSimconfig, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TllPackage.SYSTEM__SIMCONFIG, newSimconfig, newSimconfig));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getLog() {
		if (log == null) {
			log = new EDataTypeUniqueEList<String>(String.class, this, TllPackage.SYSTEM__LOG);
		}
		return log;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public void simulate() {
		System.out.println("Start SIM");
		
		this.getArea().stream().forEach(element -> element.start());
		
		System.out.println("End SIM");
		
		new ModelStore().store(this, "model/simulationOutput/simOutput.xmi");
		try{
		    PrintWriter writer = new PrintWriter("model/simulationOutput/log.csv", "UTF-8");
		    List<String> l = new ArrayList<String>();
		    for(Area a : this.getArea()){
		    	l.addAll(a.getLog());
		    }
		    for(String x : l){
		    	writer.println(x);
		    }
		    writer.close();
		} catch (IOException e) {
		   // do something
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TllPackage.SYSTEM__AREA:
				return ((InternalEList<?>)getArea()).basicRemove(otherEnd, msgs);
			case TllPackage.SYSTEM__SIMCONFIG:
				return basicSetSimconfig(null, msgs);
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
			case TllPackage.SYSTEM__AREA:
				return getArea();
			case TllPackage.SYSTEM__SIMCONFIG:
				return getSimconfig();
			case TllPackage.SYSTEM__LOG:
				return getLog();
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
			case TllPackage.SYSTEM__AREA:
				getArea().clear();
				getArea().addAll((Collection<? extends Area>)newValue);
				return;
			case TllPackage.SYSTEM__SIMCONFIG:
				setSimconfig((SimConfig)newValue);
				return;
			case TllPackage.SYSTEM__LOG:
				getLog().clear();
				getLog().addAll((Collection<? extends String>)newValue);
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
			case TllPackage.SYSTEM__AREA:
				getArea().clear();
				return;
			case TllPackage.SYSTEM__SIMCONFIG:
				setSimconfig((SimConfig)null);
				return;
			case TllPackage.SYSTEM__LOG:
				getLog().clear();
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
			case TllPackage.SYSTEM__AREA:
				return area != null && !area.isEmpty();
			case TllPackage.SYSTEM__SIMCONFIG:
				return simconfig != null;
			case TllPackage.SYSTEM__LOG:
				return log != null && !log.isEmpty();
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
			case TllPackage.SYSTEM___SIMULATE:
				simulate();
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
		result.append(" (log: ");
		result.append(log);
		result.append(')');
		return result.toString();
	}

} //SystemImpl
