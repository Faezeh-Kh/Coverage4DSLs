package pssm.semantics;

import java.util.Map;
import statemachines.OperationBehavior;

@SuppressWarnings("all")
public class OperationBehaviorAspectOperationBehaviorAspectContext {
  public static final OperationBehaviorAspectOperationBehaviorAspectContext INSTANCE = new OperationBehaviorAspectOperationBehaviorAspectContext();
  
  public static OperationBehaviorAspectOperationBehaviorAspectProperties getSelf(final OperationBehavior _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new pssm.semantics.OperationBehaviorAspectOperationBehaviorAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<OperationBehavior, OperationBehaviorAspectOperationBehaviorAspectProperties> map = new java.util.WeakHashMap<statemachines.OperationBehavior, pssm.semantics.OperationBehaviorAspectOperationBehaviorAspectProperties>();
  
  public Map<OperationBehavior, OperationBehaviorAspectOperationBehaviorAspectProperties> getMap() {
    return map;
  }
}
