package org.imt.arduino.reactive.interpreter;

import java.util.Map;
import org.imt.arduino.reactive.arduino.Repeat;

@SuppressWarnings("all")
public class Repeat_ExecutableAspectRepeatAspectContext {
  public static final Repeat_ExecutableAspectRepeatAspectContext INSTANCE = new Repeat_ExecutableAspectRepeatAspectContext();
  
  public static Repeat_ExecutableAspectRepeatAspectProperties getSelf(final Repeat _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.imt.arduino.reactive.interpreter.Repeat_ExecutableAspectRepeatAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Repeat, Repeat_ExecutableAspectRepeatAspectProperties> map = new java.util.WeakHashMap<org.imt.arduino.reactive.arduino.Repeat, org.imt.arduino.reactive.interpreter.Repeat_ExecutableAspectRepeatAspectProperties>();
  
  public Map<Repeat, Repeat_ExecutableAspectRepeatAspectProperties> getMap() {
    return map;
  }
}
