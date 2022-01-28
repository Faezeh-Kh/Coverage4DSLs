package org.imt.arduino.reactive.interpreter;

import java.util.Map;
import org.imt.arduino.reactive.arduino.IntegerConstant;

@SuppressWarnings("all")
public class IntegerConstant_ExecutableAspectIntegerConstantAspectContext {
  public static final IntegerConstant_ExecutableAspectIntegerConstantAspectContext INSTANCE = new IntegerConstant_ExecutableAspectIntegerConstantAspectContext();
  
  public static IntegerConstant_ExecutableAspectIntegerConstantAspectProperties getSelf(final IntegerConstant _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.imt.arduino.reactive.interpreter.IntegerConstant_ExecutableAspectIntegerConstantAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<IntegerConstant, IntegerConstant_ExecutableAspectIntegerConstantAspectProperties> map = new java.util.WeakHashMap<org.imt.arduino.reactive.arduino.IntegerConstant, org.imt.arduino.reactive.interpreter.IntegerConstant_ExecutableAspectIntegerConstantAspectProperties>();
  
  public Map<IntegerConstant, IntegerConstant_ExecutableAspectIntegerConstantAspectProperties> getMap() {
    return map;
  }
}
