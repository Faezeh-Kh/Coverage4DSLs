package pssm.semantics;

import java.util.Map;
import statemachines.Behavior;

@SuppressWarnings("all")
public class BehaviorAspectBehaviorAspectContext {
  public static final BehaviorAspectBehaviorAspectContext INSTANCE = new BehaviorAspectBehaviorAspectContext();
  
  public static BehaviorAspectBehaviorAspectProperties getSelf(final Behavior _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new pssm.semantics.BehaviorAspectBehaviorAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Behavior, BehaviorAspectBehaviorAspectProperties> map = new java.util.WeakHashMap<statemachines.Behavior, pssm.semantics.BehaviorAspectBehaviorAspectProperties>();
  
  public Map<Behavior, BehaviorAspectBehaviorAspectProperties> getMap() {
    return map;
  }
}
