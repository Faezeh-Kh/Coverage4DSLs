package org.imt.arduino.reactive.interpreter;

import java.util.Map;
import org.imt.arduino.reactive.arduino.Utilities;

@SuppressWarnings("all")
public class Utilities_ExecutableAspectUtilitiesAspectContext {
  public static final Utilities_ExecutableAspectUtilitiesAspectContext INSTANCE = new Utilities_ExecutableAspectUtilitiesAspectContext();
  
  public static Utilities_ExecutableAspectUtilitiesAspectProperties getSelf(final Utilities _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.imt.arduino.reactive.interpreter.Utilities_ExecutableAspectUtilitiesAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Utilities, Utilities_ExecutableAspectUtilitiesAspectProperties> map = new java.util.WeakHashMap<org.imt.arduino.reactive.arduino.Utilities, org.imt.arduino.reactive.interpreter.Utilities_ExecutableAspectUtilitiesAspectProperties>();
  
  public Map<Utilities, Utilities_ExecutableAspectUtilitiesAspectProperties> getMap() {
    return map;
  }
}
