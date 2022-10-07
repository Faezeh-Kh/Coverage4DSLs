package arduino.semantics;

import arduino.While;
import java.util.Map;

@SuppressWarnings("all")
public class While_ExecutableAspectWhileAspectContext {
  public static final While_ExecutableAspectWhileAspectContext INSTANCE = new While_ExecutableAspectWhileAspectContext();

  public static While_ExecutableAspectWhileAspectProperties getSelf(final While _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new arduino.semantics.While_ExecutableAspectWhileAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<While, While_ExecutableAspectWhileAspectProperties> map = new java.util.WeakHashMap<arduino.While, arduino.semantics.While_ExecutableAspectWhileAspectProperties>();

  public Map<While, While_ExecutableAspectWhileAspectProperties> getMap() {
    return map;
  }
}
