package arduino.semantics;

import arduino.Control;
import java.util.Map;

@SuppressWarnings("all")
public class Control_EvaluableAspectControlAspectContext {
  public static final Control_EvaluableAspectControlAspectContext INSTANCE = new Control_EvaluableAspectControlAspectContext();

  public static Control_EvaluableAspectControlAspectProperties getSelf(final Control _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new arduino.semantics.Control_EvaluableAspectControlAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<Control, Control_EvaluableAspectControlAspectProperties> map = new java.util.WeakHashMap<arduino.Control, arduino.semantics.Control_EvaluableAspectControlAspectProperties>();

  public Map<Control, Control_EvaluableAspectControlAspectProperties> getMap() {
    return map;
  }
}
