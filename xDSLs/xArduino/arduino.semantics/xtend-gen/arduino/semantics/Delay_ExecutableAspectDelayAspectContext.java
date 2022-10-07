package arduino.semantics;

import arduino.Delay;
import java.util.Map;

@SuppressWarnings("all")
public class Delay_ExecutableAspectDelayAspectContext {
  public static final Delay_ExecutableAspectDelayAspectContext INSTANCE = new Delay_ExecutableAspectDelayAspectContext();

  public static Delay_ExecutableAspectDelayAspectProperties getSelf(final Delay _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new arduino.semantics.Delay_ExecutableAspectDelayAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<Delay, Delay_ExecutableAspectDelayAspectProperties> map = new java.util.WeakHashMap<arduino.Delay, arduino.semantics.Delay_ExecutableAspectDelayAspectProperties>();

  public Map<Delay, Delay_ExecutableAspectDelayAspectProperties> getMap() {
    return map;
  }
}
