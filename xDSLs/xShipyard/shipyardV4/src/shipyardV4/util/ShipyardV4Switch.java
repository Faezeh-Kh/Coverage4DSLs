/**
 */
package shipyardV4.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import shipyardV4.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see shipyardV4.ShipyardV4Package
 * @generated
 */
public class ShipyardV4Switch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ShipyardV4Package modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShipyardV4Switch() {
		if (modelPackage == null) {
			modelPackage = ShipyardV4Package.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ShipyardV4Package.SHIPYARD_V4_ROOT: {
				ShipyardV4Root shipyardV4Root = (ShipyardV4Root)theEObject;
				T result = caseShipyardV4Root(shipyardV4Root);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ShipyardV4Package.METADATA: {
				Metadata metadata = (Metadata)theEObject;
				T result = caseMetadata(metadata);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ShipyardV4Package.SELECTOR: {
				Selector selector = (Selector)theEObject;
				T result = caseSelector(selector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ShipyardV4Package.SEQUENCE: {
				Sequence sequence = (Sequence)theEObject;
				T result = caseSequence(sequence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ShipyardV4Package.SHIPYARD: {
				Shipyard shipyard = (Shipyard)theEObject;
				T result = caseShipyard(shipyard);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ShipyardV4Package.SHIPYARD_SPEC: {
				ShipyardSpec shipyardSpec = (ShipyardSpec)theEObject;
				T result = caseShipyardSpec(shipyardSpec);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ShipyardV4Package.STAGE: {
				Stage stage = (Stage)theEObject;
				T result = caseStage(stage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ShipyardV4Package.TASK: {
				Task task = (Task)theEObject;
				T result = caseTask(task);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ShipyardV4Package.TRIGGER: {
				Trigger trigger = (Trigger)theEObject;
				T result = caseTrigger(trigger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ShipyardV4Package.METADATA_NAME: {
				MetadataName metadataName = (MetadataName)theEObject;
				T result = caseMetadataName(metadataName);
				if (result == null) result = caseMetadataPropertiesAbstract(metadataName);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ShipyardV4Package.SELECTOR_MATCH: {
				SelectorMatch selectorMatch = (SelectorMatch)theEObject;
				T result = caseSelectorMatch(selectorMatch);
				if (result == null) result = caseSelectorPropertiesAbstract(selectorMatch);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ShipyardV4Package.SEQUENCE_NAME: {
				SequenceName sequenceName = (SequenceName)theEObject;
				T result = caseSequenceName(sequenceName);
				if (result == null) result = caseSequencePropertiesAbstract(sequenceName);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ShipyardV4Package.SEQUENCE_TRIGGERED_ON: {
				SequenceTriggeredOn sequenceTriggeredOn = (SequenceTriggeredOn)theEObject;
				T result = caseSequenceTriggeredOn(sequenceTriggeredOn);
				if (result == null) result = caseSequencePropertiesAbstract(sequenceTriggeredOn);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ShipyardV4Package.SEQUENCE_TASKS: {
				SequenceTasks sequenceTasks = (SequenceTasks)theEObject;
				T result = caseSequenceTasks(sequenceTasks);
				if (result == null) result = caseSequencePropertiesAbstract(sequenceTasks);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ShipyardV4Package.SHIPYARD_API_VERSION: {
				ShipyardApiVersion shipyardApiVersion = (ShipyardApiVersion)theEObject;
				T result = caseShipyardApiVersion(shipyardApiVersion);
				if (result == null) result = caseShipyardPropertiesAbstract(shipyardApiVersion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ShipyardV4Package.SHIPYARD_KIND: {
				ShipyardKind shipyardKind = (ShipyardKind)theEObject;
				T result = caseShipyardKind(shipyardKind);
				if (result == null) result = caseShipyardPropertiesAbstract(shipyardKind);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ShipyardV4Package.SHIPYARD_METADATA: {
				ShipyardMetadata shipyardMetadata = (ShipyardMetadata)theEObject;
				T result = caseShipyardMetadata(shipyardMetadata);
				if (result == null) result = caseShipyardPropertiesAbstract(shipyardMetadata);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ShipyardV4Package.SHIPYARD_SPEC1: {
				ShipyardSpec1 shipyardSpec1 = (ShipyardSpec1)theEObject;
				T result = caseShipyardSpec1(shipyardSpec1);
				if (result == null) result = caseShipyardPropertiesAbstract(shipyardSpec1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ShipyardV4Package.SHIPYARD_SPEC_STAGES: {
				ShipyardSpecStages shipyardSpecStages = (ShipyardSpecStages)theEObject;
				T result = caseShipyardSpecStages(shipyardSpecStages);
				if (result == null) result = caseShipyardSpecPropertiesAbstract(shipyardSpecStages);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ShipyardV4Package.STAGE_NAME: {
				StageName stageName = (StageName)theEObject;
				T result = caseStageName(stageName);
				if (result == null) result = caseStagePropertiesAbstract(stageName);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ShipyardV4Package.STAGE_SEQUENCES: {
				StageSequences stageSequences = (StageSequences)theEObject;
				T result = caseStageSequences(stageSequences);
				if (result == null) result = caseStagePropertiesAbstract(stageSequences);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ShipyardV4Package.TASK_NAME: {
				TaskName taskName = (TaskName)theEObject;
				T result = caseTaskName(taskName);
				if (result == null) result = caseTaskPropertiesAbstract(taskName);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ShipyardV4Package.TASK_PROPERTIES: {
				TaskProperties taskProperties = (TaskProperties)theEObject;
				T result = caseTaskProperties(taskProperties);
				if (result == null) result = caseTaskPropertiesAbstract(taskProperties);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ShipyardV4Package.TRIGGER_EVENT: {
				TriggerEvent triggerEvent = (TriggerEvent)theEObject;
				T result = caseTriggerEvent(triggerEvent);
				if (result == null) result = caseTriggerPropertiesAbstract(triggerEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ShipyardV4Package.TRIGGER_SELECTOR: {
				TriggerSelector triggerSelector = (TriggerSelector)theEObject;
				T result = caseTriggerSelector(triggerSelector);
				if (result == null) result = caseTriggerPropertiesAbstract(triggerSelector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ShipyardV4Package.SELECTOR_MATCH_PATTERN_PROPERTIES0: {
				SelectorMatchPatternProperties0 selectorMatchPatternProperties0 = (SelectorMatchPatternProperties0)theEObject;
				T result = caseSelectorMatchPatternProperties0(selectorMatchPatternProperties0);
				if (result == null) result = caseSelectorMatchPropertiesAbstract(selectorMatchPatternProperties0);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ShipyardV4Package.TASK_PROPERTIES_ADDITIONAL_PROPERTIES: {
				TaskPropertiesAdditionalProperties taskPropertiesAdditionalProperties = (TaskPropertiesAdditionalProperties)theEObject;
				T result = caseTaskPropertiesAdditionalProperties(taskPropertiesAdditionalProperties);
				if (result == null) result = caseTaskPropertiesPropertiesAbstract(taskPropertiesAdditionalProperties);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ShipyardV4Package.SEQUENCE_TRIGGERED_ON_ITEMS: {
				SequenceTriggeredOnItems sequenceTriggeredOnItems = (SequenceTriggeredOnItems)theEObject;
				T result = caseSequenceTriggeredOnItems(sequenceTriggeredOnItems);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ShipyardV4Package.SEQUENCE_TASKS_ITEMS: {
				SequenceTasksItems sequenceTasksItems = (SequenceTasksItems)theEObject;
				T result = caseSequenceTasksItems(sequenceTasksItems);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ShipyardV4Package.SHIPYARD_SPEC_STAGES_ITEMS: {
				ShipyardSpecStagesItems shipyardSpecStagesItems = (ShipyardSpecStagesItems)theEObject;
				T result = caseShipyardSpecStagesItems(shipyardSpecStagesItems);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ShipyardV4Package.STAGE_SEQUENCES_ITEMS: {
				StageSequencesItems stageSequencesItems = (StageSequencesItems)theEObject;
				T result = caseStageSequencesItems(stageSequencesItems);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ShipyardV4Package.METADATA_PROPERTIES_ABSTRACT: {
				MetadataPropertiesAbstract metadataPropertiesAbstract = (MetadataPropertiesAbstract)theEObject;
				T result = caseMetadataPropertiesAbstract(metadataPropertiesAbstract);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ShipyardV4Package.SELECTOR_PROPERTIES_ABSTRACT: {
				SelectorPropertiesAbstract selectorPropertiesAbstract = (SelectorPropertiesAbstract)theEObject;
				T result = caseSelectorPropertiesAbstract(selectorPropertiesAbstract);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ShipyardV4Package.SEQUENCE_PROPERTIES_ABSTRACT: {
				SequencePropertiesAbstract sequencePropertiesAbstract = (SequencePropertiesAbstract)theEObject;
				T result = caseSequencePropertiesAbstract(sequencePropertiesAbstract);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ShipyardV4Package.SHIPYARD_PROPERTIES_ABSTRACT: {
				ShipyardPropertiesAbstract shipyardPropertiesAbstract = (ShipyardPropertiesAbstract)theEObject;
				T result = caseShipyardPropertiesAbstract(shipyardPropertiesAbstract);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ShipyardV4Package.SHIPYARD_SPEC_PROPERTIES_ABSTRACT: {
				ShipyardSpecPropertiesAbstract shipyardSpecPropertiesAbstract = (ShipyardSpecPropertiesAbstract)theEObject;
				T result = caseShipyardSpecPropertiesAbstract(shipyardSpecPropertiesAbstract);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ShipyardV4Package.STAGE_PROPERTIES_ABSTRACT: {
				StagePropertiesAbstract stagePropertiesAbstract = (StagePropertiesAbstract)theEObject;
				T result = caseStagePropertiesAbstract(stagePropertiesAbstract);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ShipyardV4Package.TASK_PROPERTIES_ABSTRACT: {
				TaskPropertiesAbstract taskPropertiesAbstract = (TaskPropertiesAbstract)theEObject;
				T result = caseTaskPropertiesAbstract(taskPropertiesAbstract);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ShipyardV4Package.TRIGGER_PROPERTIES_ABSTRACT: {
				TriggerPropertiesAbstract triggerPropertiesAbstract = (TriggerPropertiesAbstract)theEObject;
				T result = caseTriggerPropertiesAbstract(triggerPropertiesAbstract);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ShipyardV4Package.SELECTOR_MATCH_PROPERTIES_ABSTRACT: {
				SelectorMatchPropertiesAbstract selectorMatchPropertiesAbstract = (SelectorMatchPropertiesAbstract)theEObject;
				T result = caseSelectorMatchPropertiesAbstract(selectorMatchPropertiesAbstract);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ShipyardV4Package.TASK_PROPERTIES_PROPERTIES_ABSTRACT: {
				TaskPropertiesPropertiesAbstract taskPropertiesPropertiesAbstract = (TaskPropertiesPropertiesAbstract)theEObject;
				T result = caseTaskPropertiesPropertiesAbstract(taskPropertiesPropertiesAbstract);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseShipyardV4Root(ShipyardV4Root object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Metadata</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Metadata</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMetadata(Metadata object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Selector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Selector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSelector(Selector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sequence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sequence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSequence(Sequence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Shipyard</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Shipyard</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseShipyard(Shipyard object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Shipyard Spec</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Shipyard Spec</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseShipyardSpec(ShipyardSpec object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStage(Stage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTask(Task object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trigger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrigger(Trigger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Metadata Name</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Metadata Name</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMetadataName(MetadataName object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Selector Match</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Selector Match</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSelectorMatch(SelectorMatch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sequence Name</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sequence Name</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSequenceName(SequenceName object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sequence Triggered On</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sequence Triggered On</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSequenceTriggeredOn(SequenceTriggeredOn object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sequence Tasks</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sequence Tasks</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSequenceTasks(SequenceTasks object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Shipyard Api Version</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Shipyard Api Version</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseShipyardApiVersion(ShipyardApiVersion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Shipyard Kind</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Shipyard Kind</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseShipyardKind(ShipyardKind object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Shipyard Metadata</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Shipyard Metadata</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseShipyardMetadata(ShipyardMetadata object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Shipyard Spec1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Shipyard Spec1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseShipyardSpec1(ShipyardSpec1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Shipyard Spec Stages</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Shipyard Spec Stages</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseShipyardSpecStages(ShipyardSpecStages object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stage Name</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stage Name</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStageName(StageName object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stage Sequences</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stage Sequences</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStageSequences(StageSequences object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task Name</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task Name</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTaskName(TaskName object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task Properties</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task Properties</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTaskProperties(TaskProperties object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trigger Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trigger Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTriggerEvent(TriggerEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trigger Selector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trigger Selector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTriggerSelector(TriggerSelector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Selector Match Pattern Properties0</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Selector Match Pattern Properties0</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSelectorMatchPatternProperties0(SelectorMatchPatternProperties0 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task Properties Additional Properties</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task Properties Additional Properties</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTaskPropertiesAdditionalProperties(TaskPropertiesAdditionalProperties object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sequence Triggered On Items</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sequence Triggered On Items</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSequenceTriggeredOnItems(SequenceTriggeredOnItems object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sequence Tasks Items</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sequence Tasks Items</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSequenceTasksItems(SequenceTasksItems object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Shipyard Spec Stages Items</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Shipyard Spec Stages Items</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseShipyardSpecStagesItems(ShipyardSpecStagesItems object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stage Sequences Items</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stage Sequences Items</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStageSequencesItems(StageSequencesItems object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Metadata Properties Abstract</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Metadata Properties Abstract</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMetadataPropertiesAbstract(MetadataPropertiesAbstract object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Selector Properties Abstract</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Selector Properties Abstract</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSelectorPropertiesAbstract(SelectorPropertiesAbstract object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sequence Properties Abstract</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sequence Properties Abstract</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSequencePropertiesAbstract(SequencePropertiesAbstract object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Shipyard Properties Abstract</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Shipyard Properties Abstract</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseShipyardPropertiesAbstract(ShipyardPropertiesAbstract object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Shipyard Spec Properties Abstract</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Shipyard Spec Properties Abstract</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseShipyardSpecPropertiesAbstract(ShipyardSpecPropertiesAbstract object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stage Properties Abstract</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stage Properties Abstract</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStagePropertiesAbstract(StagePropertiesAbstract object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task Properties Abstract</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task Properties Abstract</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTaskPropertiesAbstract(TaskPropertiesAbstract object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trigger Properties Abstract</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trigger Properties Abstract</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTriggerPropertiesAbstract(TriggerPropertiesAbstract object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Selector Match Properties Abstract</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Selector Match Properties Abstract</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSelectorMatchPropertiesAbstract(SelectorMatchPropertiesAbstract object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task Properties Properties Abstract</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task Properties Properties Abstract</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTaskPropertiesPropertiesAbstract(TaskPropertiesPropertiesAbstract object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ShipyardV4Switch
