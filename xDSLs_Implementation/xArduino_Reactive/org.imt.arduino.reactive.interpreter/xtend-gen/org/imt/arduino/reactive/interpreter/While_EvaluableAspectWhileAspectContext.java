package org.imt.arduino.reactive.interpreter;

import java.util.Map;
import org.imt.arduino.reactive.arduino.While;

@SuppressWarnings("all")
public class While_EvaluableAspectWhileAspectContext {
  public static final While_EvaluableAspectWhileAspectContext INSTANCE = new While_EvaluableAspectWhileAspectContext();
  
  public static While_EvaluableAspectWhileAspectProperties getSelf(final While _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.imt.arduino.reactive.interpreter.While_EvaluableAspectWhileAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<While, While_EvaluableAspectWhileAspectProperties> map = new java.util.WeakHashMap<org.imt.arduino.reactive.arduino.While, org.imt.arduino.reactive.interpreter.While_EvaluableAspectWhileAspectProperties>();
  
  public Map<While, While_EvaluableAspectWhileAspectProperties> getMap() {
    return map;
  }
}
