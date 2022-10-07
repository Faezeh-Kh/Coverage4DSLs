package arduino.semantics;

import arduino.Pin;
import java.util.Map;

@SuppressWarnings("all")
public class Pin_EvaluableAspectPinAspectContext {
  public static final Pin_EvaluableAspectPinAspectContext INSTANCE = new Pin_EvaluableAspectPinAspectContext();

  public static Pin_EvaluableAspectPinAspectProperties getSelf(final Pin _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new arduino.semantics.Pin_EvaluableAspectPinAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<Pin, Pin_EvaluableAspectPinAspectProperties> map = new java.util.WeakHashMap<arduino.Pin, arduino.semantics.Pin_EvaluableAspectPinAspectProperties>();

  public Map<Pin, Pin_EvaluableAspectPinAspectProperties> getMap() {
    return map;
  }
}
