package org.imt.arduino.reactive.interpreter;

import java.util.Map;
import org.imt.arduino.reactive.arduino.Delay;

@SuppressWarnings("all")
public class Delay_ExecutableAspectDelayAspectContext {
  public static final Delay_ExecutableAspectDelayAspectContext INSTANCE = new Delay_ExecutableAspectDelayAspectContext();
  
  public static Delay_ExecutableAspectDelayAspectProperties getSelf(final Delay _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.imt.arduino.reactive.interpreter.Delay_ExecutableAspectDelayAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Delay, Delay_ExecutableAspectDelayAspectProperties> map = new java.util.WeakHashMap<org.imt.arduino.reactive.arduino.Delay, org.imt.arduino.reactive.interpreter.Delay_ExecutableAspectDelayAspectProperties>();
  
  public Map<Delay, Delay_ExecutableAspectDelayAspectProperties> getMap() {
    return map;
  }
}
