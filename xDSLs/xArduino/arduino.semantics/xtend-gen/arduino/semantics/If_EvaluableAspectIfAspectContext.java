package arduino.semantics;

import arduino.If;
import java.util.Map;

@SuppressWarnings("all")
public class If_EvaluableAspectIfAspectContext {
  public static final If_EvaluableAspectIfAspectContext INSTANCE = new If_EvaluableAspectIfAspectContext();

  public static If_EvaluableAspectIfAspectProperties getSelf(final If _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new arduino.semantics.If_EvaluableAspectIfAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<If, If_EvaluableAspectIfAspectProperties> map = new java.util.WeakHashMap<arduino.If, arduino.semantics.If_EvaluableAspectIfAspectProperties>();

  public Map<If, If_EvaluableAspectIfAspectProperties> getMap() {
    return map;
  }
}
