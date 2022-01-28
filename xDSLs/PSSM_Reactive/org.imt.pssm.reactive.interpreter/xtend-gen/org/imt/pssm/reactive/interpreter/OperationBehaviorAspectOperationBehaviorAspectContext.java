package org.imt.pssm.reactive.interpreter;

import java.util.Map;
import org.imt.pssm.reactive.model.statemachines.OperationBehavior;

@SuppressWarnings("all")
public class OperationBehaviorAspectOperationBehaviorAspectContext {
  public static final OperationBehaviorAspectOperationBehaviorAspectContext INSTANCE = new OperationBehaviorAspectOperationBehaviorAspectContext();
  
  public static OperationBehaviorAspectOperationBehaviorAspectProperties getSelf(final OperationBehavior _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.imt.pssm.reactive.interpreter.OperationBehaviorAspectOperationBehaviorAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<OperationBehavior, OperationBehaviorAspectOperationBehaviorAspectProperties> map = new java.util.WeakHashMap<org.imt.pssm.reactive.model.statemachines.OperationBehavior, org.imt.pssm.reactive.interpreter.OperationBehaviorAspectOperationBehaviorAspectProperties>();
  
  public Map<OperationBehavior, OperationBehaviorAspectOperationBehaviorAspectProperties> getMap() {
    return map;
  }
}
