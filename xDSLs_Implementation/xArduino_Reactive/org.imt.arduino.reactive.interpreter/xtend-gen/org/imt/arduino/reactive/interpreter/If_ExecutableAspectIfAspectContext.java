package org.imt.arduino.reactive.interpreter;

import java.util.Map;
import org.imt.arduino.reactive.arduino.If;

@SuppressWarnings("all")
public class If_ExecutableAspectIfAspectContext {
  public static final If_ExecutableAspectIfAspectContext INSTANCE = new If_ExecutableAspectIfAspectContext();
  
  public static If_ExecutableAspectIfAspectProperties getSelf(final If _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.imt.arduino.reactive.interpreter.If_ExecutableAspectIfAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<If, If_ExecutableAspectIfAspectProperties> map = new java.util.WeakHashMap<org.imt.arduino.reactive.arduino.If, org.imt.arduino.reactive.interpreter.If_ExecutableAspectIfAspectProperties>();
  
  public Map<If, If_ExecutableAspectIfAspectProperties> getMap() {
    return map;
  }
}
