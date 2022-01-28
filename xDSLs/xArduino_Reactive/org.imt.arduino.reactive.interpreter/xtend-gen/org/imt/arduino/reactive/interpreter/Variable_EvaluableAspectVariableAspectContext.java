package org.imt.arduino.reactive.interpreter;

import java.util.Map;
import org.imt.arduino.reactive.arduino.Variable;

@SuppressWarnings("all")
public class Variable_EvaluableAspectVariableAspectContext {
  public static final Variable_EvaluableAspectVariableAspectContext INSTANCE = new Variable_EvaluableAspectVariableAspectContext();
  
  public static Variable_EvaluableAspectVariableAspectProperties getSelf(final Variable _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.imt.arduino.reactive.interpreter.Variable_EvaluableAspectVariableAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Variable, Variable_EvaluableAspectVariableAspectProperties> map = new java.util.WeakHashMap<org.imt.arduino.reactive.arduino.Variable, org.imt.arduino.reactive.interpreter.Variable_EvaluableAspectVariableAspectProperties>();
  
  public Map<Variable, Variable_EvaluableAspectVariableAspectProperties> getMap() {
    return map;
  }
}
