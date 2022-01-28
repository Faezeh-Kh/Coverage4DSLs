package org.imt.arduino.reactive.interpreter;

import java.util.Map;
import org.imt.arduino.reactive.arduino.If;

@SuppressWarnings("all")
public class If_EvaluableAspectIfAspectContext {
  public static final If_EvaluableAspectIfAspectContext INSTANCE = new If_EvaluableAspectIfAspectContext();
  
  public static If_EvaluableAspectIfAspectProperties getSelf(final If _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.imt.arduino.reactive.interpreter.If_EvaluableAspectIfAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<If, If_EvaluableAspectIfAspectProperties> map = new java.util.WeakHashMap<org.imt.arduino.reactive.arduino.If, org.imt.arduino.reactive.interpreter.If_EvaluableAspectIfAspectProperties>();
  
  public Map<If, If_EvaluableAspectIfAspectProperties> getMap() {
    return map;
  }
}
