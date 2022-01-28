package org.imt.arduino.reactive.interpreter;

import java.util.Map;
import org.imt.arduino.reactive.arduino.WaitFor;

@SuppressWarnings("all")
public class WaitFor_ExecutableAspectWaitForAspectContext {
  public static final WaitFor_ExecutableAspectWaitForAspectContext INSTANCE = new WaitFor_ExecutableAspectWaitForAspectContext();
  
  public static WaitFor_ExecutableAspectWaitForAspectProperties getSelf(final WaitFor _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.imt.arduino.reactive.interpreter.WaitFor_ExecutableAspectWaitForAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<WaitFor, WaitFor_ExecutableAspectWaitForAspectProperties> map = new java.util.WeakHashMap<org.imt.arduino.reactive.arduino.WaitFor, org.imt.arduino.reactive.interpreter.WaitFor_ExecutableAspectWaitForAspectProperties>();
  
  public Map<WaitFor, WaitFor_ExecutableAspectWaitForAspectProperties> getMap() {
    return map;
  }
}
