package arduino.semantics;

import arduino.While;
import java.util.Map;

@SuppressWarnings("all")
public class While_EvaluableAspectWhileAspectContext {
  public static final While_EvaluableAspectWhileAspectContext INSTANCE = new While_EvaluableAspectWhileAspectContext();

  public static While_EvaluableAspectWhileAspectProperties getSelf(final While _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new arduino.semantics.While_EvaluableAspectWhileAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<While, While_EvaluableAspectWhileAspectProperties> map = new java.util.WeakHashMap<arduino.While, arduino.semantics.While_EvaluableAspectWhileAspectProperties>();

  public Map<While, While_EvaluableAspectWhileAspectProperties> getMap() {
    return map;
  }
}
