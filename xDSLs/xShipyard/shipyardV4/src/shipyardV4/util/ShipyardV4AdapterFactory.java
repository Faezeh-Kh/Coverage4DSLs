/**
 */
package shipyardV4.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import shipyardV4.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see shipyardV4.ShipyardV4Package
 * @generated
 */
public class ShipyardV4AdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ShipyardV4Package modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShipyardV4AdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ShipyardV4Package.eINSTANCE;
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
	protected ShipyardV4Switch<Adapter> modelSwitch =
		new ShipyardV4Switch<Adapter>() {
			@Override
			public Adapter caseShipyardV4Root(ShipyardV4Root object) {
				return createShipyardV4RootAdapter();
			}
			@Override
			public Adapter caseMetadata(Metadata object) {
				return createMetadataAdapter();
			}
			@Override
			public Adapter caseSelector(Selector object) {
				return createSelectorAdapter();
			}
			@Override
			public Adapter caseSequence(Sequence object) {
				return createSequenceAdapter();
			}
			@Override
			public Adapter caseShipyard(Shipyard object) {
				return createShipyardAdapter();
			}
			@Override
			public Adapter caseShipyardSpec(ShipyardSpec object) {
				return createShipyardSpecAdapter();
			}
			@Override
			public Adapter caseStage(Stage object) {
				return createStageAdapter();
			}
			@Override
			public Adapter caseTask(Task object) {
				return createTaskAdapter();
			}
			@Override
			public Adapter caseTrigger(Trigger object) {
				return createTriggerAdapter();
			}
			@Override
			public Adapter caseMetadataName(MetadataName object) {
				return createMetadataNameAdapter();
			}
			@Override
			public Adapter caseSelectorMatch(SelectorMatch object) {
				return createSelectorMatchAdapter();
			}
			@Override
			public Adapter caseSequenceName(SequenceName object) {
				return createSequenceNameAdapter();
			}
			@Override
			public Adapter caseSequenceTriggeredOn(SequenceTriggeredOn object) {
				return createSequenceTriggeredOnAdapter();
			}
			@Override
			public Adapter caseSequenceTasks(SequenceTasks object) {
				return createSequenceTasksAdapter();
			}
			@Override
			public Adapter caseShipyardApiVersion(ShipyardApiVersion object) {
				return createShipyardApiVersionAdapter();
			}
			@Override
			public Adapter caseShipyardKind(ShipyardKind object) {
				return createShipyardKindAdapter();
			}
			@Override
			public Adapter caseShipyardMetadata(ShipyardMetadata object) {
				return createShipyardMetadataAdapter();
			}
			@Override
			public Adapter caseShipyardSpec1(ShipyardSpec1 object) {
				return createShipyardSpec1Adapter();
			}
			@Override
			public Adapter caseShipyardSpecStages(ShipyardSpecStages object) {
				return createShipyardSpecStagesAdapter();
			}
			@Override
			public Adapter caseStageName(StageName object) {
				return createStageNameAdapter();
			}
			@Override
			public Adapter caseStageSequences(StageSequences object) {
				return createStageSequencesAdapter();
			}
			@Override
			public Adapter caseTaskName(TaskName object) {
				return createTaskNameAdapter();
			}
			@Override
			public Adapter caseTaskProperties(TaskProperties object) {
				return createTaskPropertiesAdapter();
			}
			@Override
			public Adapter caseTriggerEvent(TriggerEvent object) {
				return createTriggerEventAdapter();
			}
			@Override
			public Adapter caseTriggerSelector(TriggerSelector object) {
				return createTriggerSelectorAdapter();
			}
			@Override
			public Adapter caseSelectorMatchPatternProperties0(SelectorMatchPatternProperties0 object) {
				return createSelectorMatchPatternProperties0Adapter();
			}
			@Override
			public Adapter caseTaskPropertiesAdditionalProperties(TaskPropertiesAdditionalProperties object) {
				return createTaskPropertiesAdditionalPropertiesAdapter();
			}
			@Override
			public Adapter caseSequenceTriggeredOnItems(SequenceTriggeredOnItems object) {
				return createSequenceTriggeredOnItemsAdapter();
			}
			@Override
			public Adapter caseSequenceTasksItems(SequenceTasksItems object) {
				return createSequenceTasksItemsAdapter();
			}
			@Override
			public Adapter caseShipyardSpecStagesItems(ShipyardSpecStagesItems object) {
				return createShipyardSpecStagesItemsAdapter();
			}
			@Override
			public Adapter caseStageSequencesItems(StageSequencesItems object) {
				return createStageSequencesItemsAdapter();
			}
			@Override
			public Adapter caseMetadataPropertiesAbstract(MetadataPropertiesAbstract object) {
				return createMetadataPropertiesAbstractAdapter();
			}
			@Override
			public Adapter caseSelectorPropertiesAbstract(SelectorPropertiesAbstract object) {
				return createSelectorPropertiesAbstractAdapter();
			}
			@Override
			public Adapter caseSequencePropertiesAbstract(SequencePropertiesAbstract object) {
				return createSequencePropertiesAbstractAdapter();
			}
			@Override
			public Adapter caseShipyardPropertiesAbstract(ShipyardPropertiesAbstract object) {
				return createShipyardPropertiesAbstractAdapter();
			}
			@Override
			public Adapter caseShipyardSpecPropertiesAbstract(ShipyardSpecPropertiesAbstract object) {
				return createShipyardSpecPropertiesAbstractAdapter();
			}
			@Override
			public Adapter caseStagePropertiesAbstract(StagePropertiesAbstract object) {
				return createStagePropertiesAbstractAdapter();
			}
			@Override
			public Adapter caseTaskPropertiesAbstract(TaskPropertiesAbstract object) {
				return createTaskPropertiesAbstractAdapter();
			}
			@Override
			public Adapter caseTriggerPropertiesAbstract(TriggerPropertiesAbstract object) {
				return createTriggerPropertiesAbstractAdapter();
			}
			@Override
			public Adapter caseSelectorMatchPropertiesAbstract(SelectorMatchPropertiesAbstract object) {
				return createSelectorMatchPropertiesAbstractAdapter();
			}
			@Override
			public Adapter caseTaskPropertiesPropertiesAbstract(TaskPropertiesPropertiesAbstract object) {
				return createTaskPropertiesPropertiesAbstractAdapter();
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
	 * Creates a new adapter for an object of class '{@link shipyardV4.ShipyardV4Root <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see shipyardV4.ShipyardV4Root
	 * @generated
	 */
	public Adapter createShipyardV4RootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link shipyardV4.Metadata <em>Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see shipyardV4.Metadata
	 * @generated
	 */
	public Adapter createMetadataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link shipyardV4.Selector <em>Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see shipyardV4.Selector
	 * @generated
	 */
	public Adapter createSelectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link shipyardV4.Sequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see shipyardV4.Sequence
	 * @generated
	 */
	public Adapter createSequenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link shipyardV4.Shipyard <em>Shipyard</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see shipyardV4.Shipyard
	 * @generated
	 */
	public Adapter createShipyardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link shipyardV4.ShipyardSpec <em>Shipyard Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see shipyardV4.ShipyardSpec
	 * @generated
	 */
	public Adapter createShipyardSpecAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link shipyardV4.Stage <em>Stage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see shipyardV4.Stage
	 * @generated
	 */
	public Adapter createStageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link shipyardV4.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see shipyardV4.Task
	 * @generated
	 */
	public Adapter createTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link shipyardV4.Trigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see shipyardV4.Trigger
	 * @generated
	 */
	public Adapter createTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link shipyardV4.MetadataName <em>Metadata Name</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see shipyardV4.MetadataName
	 * @generated
	 */
	public Adapter createMetadataNameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link shipyardV4.SelectorMatch <em>Selector Match</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see shipyardV4.SelectorMatch
	 * @generated
	 */
	public Adapter createSelectorMatchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link shipyardV4.SequenceName <em>Sequence Name</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see shipyardV4.SequenceName
	 * @generated
	 */
	public Adapter createSequenceNameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link shipyardV4.SequenceTriggeredOn <em>Sequence Triggered On</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see shipyardV4.SequenceTriggeredOn
	 * @generated
	 */
	public Adapter createSequenceTriggeredOnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link shipyardV4.SequenceTasks <em>Sequence Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see shipyardV4.SequenceTasks
	 * @generated
	 */
	public Adapter createSequenceTasksAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link shipyardV4.ShipyardApiVersion <em>Shipyard Api Version</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see shipyardV4.ShipyardApiVersion
	 * @generated
	 */
	public Adapter createShipyardApiVersionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link shipyardV4.ShipyardKind <em>Shipyard Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see shipyardV4.ShipyardKind
	 * @generated
	 */
	public Adapter createShipyardKindAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link shipyardV4.ShipyardMetadata <em>Shipyard Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see shipyardV4.ShipyardMetadata
	 * @generated
	 */
	public Adapter createShipyardMetadataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link shipyardV4.ShipyardSpec1 <em>Shipyard Spec1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see shipyardV4.ShipyardSpec1
	 * @generated
	 */
	public Adapter createShipyardSpec1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link shipyardV4.ShipyardSpecStages <em>Shipyard Spec Stages</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see shipyardV4.ShipyardSpecStages
	 * @generated
	 */
	public Adapter createShipyardSpecStagesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link shipyardV4.StageName <em>Stage Name</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see shipyardV4.StageName
	 * @generated
	 */
	public Adapter createStageNameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link shipyardV4.StageSequences <em>Stage Sequences</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see shipyardV4.StageSequences
	 * @generated
	 */
	public Adapter createStageSequencesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link shipyardV4.TaskName <em>Task Name</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see shipyardV4.TaskName
	 * @generated
	 */
	public Adapter createTaskNameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link shipyardV4.TaskProperties <em>Task Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see shipyardV4.TaskProperties
	 * @generated
	 */
	public Adapter createTaskPropertiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link shipyardV4.TriggerEvent <em>Trigger Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see shipyardV4.TriggerEvent
	 * @generated
	 */
	public Adapter createTriggerEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link shipyardV4.TriggerSelector <em>Trigger Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see shipyardV4.TriggerSelector
	 * @generated
	 */
	public Adapter createTriggerSelectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link shipyardV4.SelectorMatchPatternProperties0 <em>Selector Match Pattern Properties0</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see shipyardV4.SelectorMatchPatternProperties0
	 * @generated
	 */
	public Adapter createSelectorMatchPatternProperties0Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link shipyardV4.TaskPropertiesAdditionalProperties <em>Task Properties Additional Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see shipyardV4.TaskPropertiesAdditionalProperties
	 * @generated
	 */
	public Adapter createTaskPropertiesAdditionalPropertiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link shipyardV4.SequenceTriggeredOnItems <em>Sequence Triggered On Items</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see shipyardV4.SequenceTriggeredOnItems
	 * @generated
	 */
	public Adapter createSequenceTriggeredOnItemsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link shipyardV4.SequenceTasksItems <em>Sequence Tasks Items</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see shipyardV4.SequenceTasksItems
	 * @generated
	 */
	public Adapter createSequenceTasksItemsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link shipyardV4.ShipyardSpecStagesItems <em>Shipyard Spec Stages Items</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see shipyardV4.ShipyardSpecStagesItems
	 * @generated
	 */
	public Adapter createShipyardSpecStagesItemsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link shipyardV4.StageSequencesItems <em>Stage Sequences Items</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see shipyardV4.StageSequencesItems
	 * @generated
	 */
	public Adapter createStageSequencesItemsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link shipyardV4.MetadataPropertiesAbstract <em>Metadata Properties Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see shipyardV4.MetadataPropertiesAbstract
	 * @generated
	 */
	public Adapter createMetadataPropertiesAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link shipyardV4.SelectorPropertiesAbstract <em>Selector Properties Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see shipyardV4.SelectorPropertiesAbstract
	 * @generated
	 */
	public Adapter createSelectorPropertiesAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link shipyardV4.SequencePropertiesAbstract <em>Sequence Properties Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see shipyardV4.SequencePropertiesAbstract
	 * @generated
	 */
	public Adapter createSequencePropertiesAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link shipyardV4.ShipyardPropertiesAbstract <em>Shipyard Properties Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see shipyardV4.ShipyardPropertiesAbstract
	 * @generated
	 */
	public Adapter createShipyardPropertiesAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link shipyardV4.ShipyardSpecPropertiesAbstract <em>Shipyard Spec Properties Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see shipyardV4.ShipyardSpecPropertiesAbstract
	 * @generated
	 */
	public Adapter createShipyardSpecPropertiesAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link shipyardV4.StagePropertiesAbstract <em>Stage Properties Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see shipyardV4.StagePropertiesAbstract
	 * @generated
	 */
	public Adapter createStagePropertiesAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link shipyardV4.TaskPropertiesAbstract <em>Task Properties Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see shipyardV4.TaskPropertiesAbstract
	 * @generated
	 */
	public Adapter createTaskPropertiesAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link shipyardV4.TriggerPropertiesAbstract <em>Trigger Properties Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see shipyardV4.TriggerPropertiesAbstract
	 * @generated
	 */
	public Adapter createTriggerPropertiesAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link shipyardV4.SelectorMatchPropertiesAbstract <em>Selector Match Properties Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see shipyardV4.SelectorMatchPropertiesAbstract
	 * @generated
	 */
	public Adapter createSelectorMatchPropertiesAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link shipyardV4.TaskPropertiesPropertiesAbstract <em>Task Properties Properties Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see shipyardV4.TaskPropertiesPropertiesAbstract
	 * @generated
	 */
	public Adapter createTaskPropertiesPropertiesAbstractAdapter() {
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

} //ShipyardV4AdapterFactory
