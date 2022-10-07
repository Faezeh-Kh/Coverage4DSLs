package arduino.semantics;

import arduino.Repeat;
import java.util.Map;

@SuppressWarnings("all")
public class Repeat_EvaluableAspectRepeatAspectContext {
  public static final Repeat_EvaluableAspectRepeatAspectContext INSTANCE = new Repeat_EvaluableAspectRepeatAspectContext();

  public static Repeat_EvaluableAspectRepeatAspectProperties getSelf(final Repeat _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new arduino.semantics.Repeat_EvaluableAspectRepeatAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<Repeat, Repeat_EvaluableAspectRepeatAspectProperties> map = new java.util.WeakHashMap<arduino.Repeat, arduino.semantics.Repeat_EvaluableAspectRepeatAspectProperties>();

  public Map<Repeat, Repeat_EvaluableAspectRepeatAspectProperties> getMap() {
    return map;
  }
}
