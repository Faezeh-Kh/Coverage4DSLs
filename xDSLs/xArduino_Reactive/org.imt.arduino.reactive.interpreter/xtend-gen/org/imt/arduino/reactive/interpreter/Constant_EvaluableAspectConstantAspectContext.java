package org.imt.arduino.reactive.interpreter;

import java.util.Map;
import org.imt.arduino.reactive.arduino.Constant;

@SuppressWarnings("all")
public class Constant_EvaluableAspectConstantAspectContext {
  public static final Constant_EvaluableAspectConstantAspectContext INSTANCE = new Constant_EvaluableAspectConstantAspectContext();
  
  public static Constant_EvaluableAspectConstantAspectProperties getSelf(final Constant _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.imt.arduino.reactive.interpreter.Constant_EvaluableAspectConstantAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Constant, Constant_EvaluableAspectConstantAspectProperties> map = new java.util.WeakHashMap<org.imt.arduino.reactive.arduino.Constant, org.imt.arduino.reactive.interpreter.Constant_EvaluableAspectConstantAspectProperties>();
  
  public Map<Constant, Constant_EvaluableAspectConstantAspectProperties> getMap() {
    return map;
  }
}
