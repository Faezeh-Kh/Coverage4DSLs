package org.imt.pssm.reactive.interpreter;

import java.util.Map;
import org.imt.pssm.reactive.model.statemachines.StateMachine;

@SuppressWarnings("all")
public class StateMachineAspectStateMachineAspectContext {
  public static final StateMachineAspectStateMachineAspectContext INSTANCE = new StateMachineAspectStateMachineAspectContext();
  
  public static StateMachineAspectStateMachineAspectProperties getSelf(final StateMachine _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.imt.pssm.reactive.interpreter.StateMachineAspectStateMachineAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<StateMachine, StateMachineAspectStateMachineAspectProperties> map = new java.util.WeakHashMap<org.imt.pssm.reactive.model.statemachines.StateMachine, org.imt.pssm.reactive.interpreter.StateMachineAspectStateMachineAspectProperties>();
  
  public Map<StateMachine, StateMachineAspectStateMachineAspectProperties> getMap() {
    return map;
  }
}
