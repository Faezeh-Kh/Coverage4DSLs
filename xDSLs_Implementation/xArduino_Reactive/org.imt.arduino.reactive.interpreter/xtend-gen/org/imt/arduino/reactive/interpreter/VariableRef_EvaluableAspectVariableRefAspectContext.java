package org.imt.arduino.reactive.interpreter;

import java.util.Map;
import org.imt.arduino.reactive.arduino.VariableRef;

@SuppressWarnings("all")
public class VariableRef_EvaluableAspectVariableRefAspectContext {
  public static final VariableRef_EvaluableAspectVariableRefAspectContext INSTANCE = new VariableRef_EvaluableAspectVariableRefAspectContext();
  
  public static VariableRef_EvaluableAspectVariableRefAspectProperties getSelf(final VariableRef _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.imt.arduino.reactive.interpreter.VariableRef_EvaluableAspectVariableRefAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<VariableRef, VariableRef_EvaluableAspectVariableRefAspectProperties> map = new java.util.WeakHashMap<org.imt.arduino.reactive.arduino.VariableRef, org.imt.arduino.reactive.interpreter.VariableRef_EvaluableAspectVariableRefAspectProperties>();
  
  public Map<VariableRef, VariableRef_EvaluableAspectVariableRefAspectProperties> getMap() {
    return map;
  }
}
