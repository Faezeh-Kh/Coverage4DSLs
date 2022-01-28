package org.imt.arduino.reactive.interpreter;

import java.util.Map;
import org.imt.arduino.reactive.arduino.BooleanVariable;

@SuppressWarnings("all")
public class BooleanVariable_EvaluableAspectBooleanVariableAspectContext {
  public static final BooleanVariable_EvaluableAspectBooleanVariableAspectContext INSTANCE = new BooleanVariable_EvaluableAspectBooleanVariableAspectContext();
  
  public static BooleanVariable_EvaluableAspectBooleanVariableAspectProperties getSelf(final BooleanVariable _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.imt.arduino.reactive.interpreter.BooleanVariable_EvaluableAspectBooleanVariableAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<BooleanVariable, BooleanVariable_EvaluableAspectBooleanVariableAspectProperties> map = new java.util.WeakHashMap<org.imt.arduino.reactive.arduino.BooleanVariable, org.imt.arduino.reactive.interpreter.BooleanVariable_EvaluableAspectBooleanVariableAspectProperties>();
  
  public Map<BooleanVariable, BooleanVariable_EvaluableAspectBooleanVariableAspectProperties> getMap() {
    return map;
  }
}
