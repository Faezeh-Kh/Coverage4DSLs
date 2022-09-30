/**
 */
package DSLSpecificCoverage.util;

import DSLSpecificCoverage.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see DSLSpecificCoverage.DSLSpecificCoveragePackage
 * @generated
 */
public class DSLSpecificCoverageAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DSLSpecificCoveragePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DSLSpecificCoverageAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = DSLSpecificCoveragePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DSLSpecificCoverageSwitch<Adapter> modelSwitch =
		new DSLSpecificCoverageSwitch<Adapter>() {
			@Override
			public Adapter caseDomainSpecificCoverage(DomainSpecificCoverage object) {
				return createDomainSpecificCoverageAdapter();
			}
			@Override
			public Adapter caseContext(Context object) {
				return createContextAdapter();
			}
			@Override
			public Adapter caseRule(Rule object) {
				return createRuleAdapter();
			}
			@Override
			public Adapter caseIgnore(Ignore object) {
				return createIgnoreAdapter();
			}
			@Override
			public Adapter caseCoverageOfReferenced(CoverageOfReferenced object) {
				return createCoverageOfReferencedAdapter();
			}
			@Override
			public Adapter caseCoverageByContent(CoverageByContent object) {
				return createCoverageByContentAdapter();
			}
			@Override
			public Adapter caseConditionalIgnore(ConditionalIgnore object) {
				return createConditionalIgnoreAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link DSLSpecificCoverage.DomainSpecificCoverage <em>Domain Specific Coverage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DSLSpecificCoverage.DomainSpecificCoverage
	 * @generated
	 */
	public Adapter createDomainSpecificCoverageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DSLSpecificCoverage.Context <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DSLSpecificCoverage.Context
	 * @generated
	 */
	public Adapter createContextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DSLSpecificCoverage.Rule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DSLSpecificCoverage.Rule
	 * @generated
	 */
	public Adapter createRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DSLSpecificCoverage.Ignore <em>Ignore</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DSLSpecificCoverage.Ignore
	 * @generated
	 */
	public Adapter createIgnoreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DSLSpecificCoverage.CoverageOfReferenced <em>Coverage Of Referenced</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DSLSpecificCoverage.CoverageOfReferenced
	 * @generated
	 */
	public Adapter createCoverageOfReferencedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DSLSpecificCoverage.CoverageByContent <em>Coverage By Content</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DSLSpecificCoverage.CoverageByContent
	 * @generated
	 */
	public Adapter createCoverageByContentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DSLSpecificCoverage.ConditionalIgnore <em>Conditional Ignore</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DSLSpecificCoverage.ConditionalIgnore
	 * @generated
	 */
	public Adapter createConditionalIgnoreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //DSLSpecificCoverageAdapterFactory