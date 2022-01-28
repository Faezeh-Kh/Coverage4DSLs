package org.imt.arduino.reactive.interpreter;

import java.util.Map;
import org.imt.arduino.reactive.arduino.PushButton;

@SuppressWarnings("all")
public class PushButtonAspectPushButtonAspectContext {
  public static final PushButtonAspectPushButtonAspectContext INSTANCE = new PushButtonAspectPushButtonAspectContext();
  
  public static PushButtonAspectPushButtonAspectProperties getSelf(final PushButton _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.imt.arduino.reactive.interpreter.PushButtonAspectPushButtonAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<PushButton, PushButtonAspectPushButtonAspectProperties> map = new java.util.WeakHashMap<org.imt.arduino.reactive.arduino.PushButton, org.imt.arduino.reactive.interpreter.PushButtonAspectPushButtonAspectProperties>();
  
  public Map<PushButton, PushButtonAspectPushButtonAspectProperties> getMap() {
    return map;
  }
}
