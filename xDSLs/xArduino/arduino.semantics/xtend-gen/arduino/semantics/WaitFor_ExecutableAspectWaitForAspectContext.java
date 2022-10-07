package arduino.semantics;

import arduino.WaitFor;
import java.util.Map;

@SuppressWarnings("all")
public class WaitFor_ExecutableAspectWaitForAspectContext {
  public static final WaitFor_ExecutableAspectWaitForAspectContext INSTANCE = new WaitFor_ExecutableAspectWaitForAspectContext();

  public static WaitFor_ExecutableAspectWaitForAspectProperties getSelf(final WaitFor _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new arduino.semantics.WaitFor_ExecutableAspectWaitForAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<WaitFor, WaitFor_ExecutableAspectWaitForAspectProperties> map = new java.util.WeakHashMap<arduino.WaitFor, arduino.semantics.WaitFor_ExecutableAspectWaitForAspectProperties>();

  public Map<WaitFor, WaitFor_ExecutableAspectWaitForAspectProperties> getMap() {
    return map;
  }
}
