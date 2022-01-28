package org.imt.arduino.reactive.interpreter;

import java.util.Map;
import org.imt.arduino.reactive.arduino.Control;

@SuppressWarnings("all")
public class Control_ExecutableAspectControlAspectContext {
  public static final Control_ExecutableAspectControlAspectContext INSTANCE = new Control_ExecutableAspectControlAspectContext();
  
  public static Control_ExecutableAspectControlAspectProperties getSelf(final Control _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.imt.arduino.reactive.interpreter.Control_ExecutableAspectControlAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Control, Control_ExecutableAspectControlAspectProperties> map = new java.util.WeakHashMap<org.imt.arduino.reactive.arduino.Control, org.imt.arduino.reactive.interpreter.Control_ExecutableAspectControlAspectProperties>();
  
  public Map<Control, Control_ExecutableAspectControlAspectProperties> getMap() {
    return map;
  }
}
