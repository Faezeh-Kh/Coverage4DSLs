package pssm.semantics;

import java.util.Map;
import statemachines.StateMachine;

@SuppressWarnings("all")
public class StateMachineAspectStateMachineAspectContext {
  public static final StateMachineAspectStateMachineAspectContext INSTANCE = new StateMachineAspectStateMachineAspectContext();

  public static StateMachineAspectStateMachineAspectProperties getSelf(final StateMachine _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new pssm.semantics.StateMachineAspectStateMachineAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<StateMachine, StateMachineAspectStateMachineAspectProperties> map = new java.util.WeakHashMap<statemachines.StateMachine, pssm.semantics.StateMachineAspectStateMachineAspectProperties>();

  public Map<StateMachine, StateMachineAspectStateMachineAspectProperties> getMap() {
    return map;
  }
}
