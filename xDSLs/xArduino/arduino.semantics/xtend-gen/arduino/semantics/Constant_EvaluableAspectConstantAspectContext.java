package arduino.semantics;

import arduino.Constant;
import java.util.Map;

@SuppressWarnings("all")
public class Constant_EvaluableAspectConstantAspectContext {
  public static final Constant_EvaluableAspectConstantAspectContext INSTANCE = new Constant_EvaluableAspectConstantAspectContext();

  public static Constant_EvaluableAspectConstantAspectProperties getSelf(final Constant _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new arduino.semantics.Constant_EvaluableAspectConstantAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<Constant, Constant_EvaluableAspectConstantAspectProperties> map = new java.util.WeakHashMap<arduino.Constant, arduino.semantics.Constant_EvaluableAspectConstantAspectProperties>();

  public Map<Constant, Constant_EvaluableAspectConstantAspectProperties> getMap() {
    return map;
  }
}
