package arduino.semantics;

import arduino.PushButton;
import java.util.Map;

@SuppressWarnings("all")
public class PushButtonAspectPushButtonAspectContext {
  public static final PushButtonAspectPushButtonAspectContext INSTANCE = new PushButtonAspectPushButtonAspectContext();

  public static PushButtonAspectPushButtonAspectProperties getSelf(final PushButton _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new arduino.semantics.PushButtonAspectPushButtonAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<PushButton, PushButtonAspectPushButtonAspectProperties> map = new java.util.WeakHashMap<arduino.PushButton, arduino.semantics.PushButtonAspectPushButtonAspectProperties>();

  public Map<PushButton, PushButtonAspectPushButtonAspectProperties> getMap() {
    return map;
  }
}
