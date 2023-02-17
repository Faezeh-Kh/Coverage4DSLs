/**
 */
package tll.impl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

import tll.Component;
import tll.Machine;
import tll.TllPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Machine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tll.impl.MachineImpl#getNeighbour <em>Neighbour</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MachineImpl extends ComponentImpl implements Machine {
	/**
	 * The cached value of the '{@link #getNeighbour() <em>Neighbour</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeighbour()
	 * @generated
	 * @ordered
	 */
	protected EList<Component> neighbour;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MachineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TllPackage.Literals.MACHINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Component> getNeighbour() {
		if (neighbour == null) {
			neighbour = new EObjectResolvingEList<Component>(Component.class, this, TllPackage.MACHINE__NEIGHBOUR);
		}
		return neighbour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TllPackage.MACHINE__NEIGHBOUR:
				return getNeighbour();
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
			case TllPackage.MACHINE__NEIGHBOUR:
				getNeighbour().clear();
				getNeighbour().addAll((Collection<? extends Component>)newValue);
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
			case TllPackage.MACHINE__NEIGHBOUR:
				getNeighbour().clear();
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
			case TllPackage.MACHINE__NEIGHBOUR:
				return neighbour != null && !neighbour.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	@Override
	public void do_() {
		//System.out.println("Start transfer " + this.id);
		
		this.getHosts().setIsProcessed(true);
		
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss-ms-SSS");
		String dateString = format.format( new Date() );
		tll.System sys = ((tll.System)EcoreUtil.getRootContainer(this));
		String x = "Item.setIsProcessed(true)-/"+ sys.getId() + "/" +((tll.Area)this.eContainer()).getId() 
		+ "/" + this.getId() +","+this.getHosts().getId()+","+dateString;
		((tll.Area)this.eContainer()).getLog().add(x.toString());
		
		EList<Component> neighbours = this.getNeighbour();
		ArrayList<Component> tempList = new ArrayList<Component>();
		neighbours.forEach(element -> tempList.add(element));

		for(Component neighbour : tempList){
			if(neighbour.getHosts() == null){
				neighbour.setHosts(this.getHosts());
				neighbour.getHosts().getHistory().add(neighbour);
				this.setHosts(null);
				//System.out.println("Transfer from " + this.getId() + " to " + neighbour.getId());
				break;
			}
		}
		
		int randomNum = ThreadLocalRandom.current().nextInt(0, this.uncertainty + 1);
		int actualProcessingTime = (Math.random() <= 0.5) ? this.processingTime + randomNum : this.processingTime - randomNum; 
			
		try {
			TimeUnit.MILLISECONDS.sleep(actualProcessingTime);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		//System.out.println("End transfer " + this.id);
	}
} //MachineImpl
