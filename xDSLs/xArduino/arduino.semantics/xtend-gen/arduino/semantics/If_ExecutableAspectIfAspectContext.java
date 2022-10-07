package arduino.semantics;

import arduino.If;
import java.util.Map;

@SuppressWarnings("all")
public class If_ExecutableAspectIfAspectContext {
  public static final If_ExecutableAspectIfAspectContext INSTANCE = new If_ExecutableAspectIfAspectContext();

  public static If_ExecutableAspectIfAspectProperties getSelf(final If _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new arduino.semantics.If_ExecutableAspectIfAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<If, If_ExecutableAspectIfAspectProperties> map = new java.util.WeakHashMap<arduino.If, arduino.semantics.If_ExecutableAspectIfAspectProperties>();

  public Map<If, If_ExecutableAspectIfAspectProperties> getMap() {
    return map;
  }
}
