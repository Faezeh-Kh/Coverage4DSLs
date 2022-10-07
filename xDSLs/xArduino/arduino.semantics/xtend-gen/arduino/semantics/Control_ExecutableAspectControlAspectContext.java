package arduino.semantics;

import arduino.Control;
import java.util.Map;

@SuppressWarnings("all")
public class Control_ExecutableAspectControlAspectContext {
  public static final Control_ExecutableAspectControlAspectContext INSTANCE = new Control_ExecutableAspectControlAspectContext();

  public static Control_ExecutableAspectControlAspectProperties getSelf(final Control _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new arduino.semantics.Control_ExecutableAspectControlAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<Control, Control_ExecutableAspectControlAspectProperties> map = new java.util.WeakHashMap<arduino.Control, arduino.semantics.Control_ExecutableAspectControlAspectProperties>();

  public Map<Control, Control_ExecutableAspectControlAspectProperties> getMap() {
    return map;
  }
}
