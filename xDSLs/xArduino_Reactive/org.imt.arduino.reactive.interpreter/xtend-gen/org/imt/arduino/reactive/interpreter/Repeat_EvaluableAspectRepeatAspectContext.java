package org.imt.arduino.reactive.interpreter;

import java.util.Map;
import org.imt.arduino.reactive.arduino.Repeat;

@SuppressWarnings("all")
public class Repeat_EvaluableAspectRepeatAspectContext {
  public static final Repeat_EvaluableAspectRepeatAspectContext INSTANCE = new Repeat_EvaluableAspectRepeatAspectContext();
  
  public static Repeat_EvaluableAspectRepeatAspectProperties getSelf(final Repeat _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.imt.arduino.reactive.interpreter.Repeat_EvaluableAspectRepeatAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Repeat, Repeat_EvaluableAspectRepeatAspectProperties> map = new java.util.WeakHashMap<org.imt.arduino.reactive.arduino.Repeat, org.imt.arduino.reactive.interpreter.Repeat_EvaluableAspectRepeatAspectProperties>();
  
  public Map<Repeat, Repeat_EvaluableAspectRepeatAspectProperties> getMap() {
    return map;
  }
}
