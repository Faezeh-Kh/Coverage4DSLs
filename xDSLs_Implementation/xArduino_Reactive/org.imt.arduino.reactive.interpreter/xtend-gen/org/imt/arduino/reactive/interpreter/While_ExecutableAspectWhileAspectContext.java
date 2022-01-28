package org.imt.arduino.reactive.interpreter;

import java.util.Map;
import org.imt.arduino.reactive.arduino.While;

@SuppressWarnings("all")
public class While_ExecutableAspectWhileAspectContext {
  public static final While_ExecutableAspectWhileAspectContext INSTANCE = new While_ExecutableAspectWhileAspectContext();
  
  public static While_ExecutableAspectWhileAspectProperties getSelf(final While _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.imt.arduino.reactive.interpreter.While_ExecutableAspectWhileAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<While, While_ExecutableAspectWhileAspectProperties> map = new java.util.WeakHashMap<org.imt.arduino.reactive.arduino.While, org.imt.arduino.reactive.interpreter.While_ExecutableAspectWhileAspectProperties>();
  
  public Map<While, While_ExecutableAspectWhileAspectProperties> getMap() {
    return map;
  }
}
