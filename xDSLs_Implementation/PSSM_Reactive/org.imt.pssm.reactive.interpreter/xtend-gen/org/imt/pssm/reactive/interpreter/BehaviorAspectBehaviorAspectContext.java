package org.imt.pssm.reactive.interpreter;

import java.util.Map;
import org.imt.pssm.reactive.model.statemachines.Behavior;

@SuppressWarnings("all")
public class BehaviorAspectBehaviorAspectContext {
  public static final BehaviorAspectBehaviorAspectContext INSTANCE = new BehaviorAspectBehaviorAspectContext();
  
  public static BehaviorAspectBehaviorAspectProperties getSelf(final Behavior _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.imt.pssm.reactive.interpreter.BehaviorAspectBehaviorAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Behavior, BehaviorAspectBehaviorAspectProperties> map = new java.util.WeakHashMap<org.imt.pssm.reactive.model.statemachines.Behavior, org.imt.pssm.reactive.interpreter.BehaviorAspectBehaviorAspectProperties>();
  
  public Map<Behavior, BehaviorAspectBehaviorAspectProperties> getMap() {
    return map;
  }
}
