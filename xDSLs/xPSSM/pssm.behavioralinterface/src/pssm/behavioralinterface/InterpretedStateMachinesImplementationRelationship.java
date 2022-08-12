package pssm.behavioralinterface;


import static org.eclipse.gemoc.executionframework.event.manager.IImplementationRelationship.loadBehavioralInterface;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.eclipse.gemoc.executionframework.behavioralinterface.behavioralInterface.BehavioralInterface;
import org.eclipse.gemoc.executionframework.event.manager.SimpleImplementationRelationship;

public class InterpretedStateMachinesImplementationRelationship extends SimpleImplementationRelationship {

	private static Map<String, String> computeEventToMethodMap() {
		final Map<String, String> result = new HashMap<>();
		result.put("run", "pssm.semantics.StateMachineAspect.run");
		result.put("signal_received", "pssm.semantics.StateMachineAspect.eventOccurrenceReceived");
		result.put("callOperation_received", "pssm.semantics.StateMachineAspect.eventOccurrenceReceived");
		result.put("behavior_executed", "statemachines.Behavior.execute");
		return result;
	}
	
	private static Set<String> computeRunToCompletionMap() {
		final Set<String> result = new HashSet<>();
		result.add("pssm.semantics.StateMachineAspect.run");
		result.add("pssm.semantics.StateMachineAspect.eventOccurrenceReceived");
		return result;
	}

	public InterpretedStateMachinesImplementationRelationship() {
		this((BehavioralInterface) loadBehavioralInterface(
				"platform:/plugin/pssm.behavioralinterface/pssmInterface.bi"));
	}

	public InterpretedStateMachinesImplementationRelationship(BehavioralInterface behavioralInterface) {
		//TODO: we manually set the name of the DSL as the last argument but it has to be the rule executor
		super(behavioralInterface, computeRunToCompletionMap(), computeEventToMethodMap(), "PSSMDSL");
	}
}
