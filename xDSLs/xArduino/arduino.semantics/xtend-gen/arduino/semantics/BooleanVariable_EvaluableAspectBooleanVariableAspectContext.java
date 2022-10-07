package arduino.semantics;

import arduino.BooleanVariable;
import java.util.Map;

@SuppressWarnings("all")
public class BooleanVariable_EvaluableAspectBooleanVariableAspectContext {
  public static final BooleanVariable_EvaluableAspectBooleanVariableAspectContext INSTANCE = new BooleanVariable_EvaluableAspectBooleanVariableAspectContext();

  public static BooleanVariable_EvaluableAspectBooleanVariableAspectProperties getSelf(final BooleanVariable _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new arduino.semantics.BooleanVariable_EvaluableAspectBooleanVariableAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<BooleanVariable, BooleanVariable_EvaluableAspectBooleanVariableAspectProperties> map = new java.util.WeakHashMap<arduino.BooleanVariable, arduino.semantics.BooleanVariable_EvaluableAspectBooleanVariableAspectProperties>();

  public Map<BooleanVariable, BooleanVariable_EvaluableAspectBooleanVariableAspectProperties> getMap() {
    return map;
  }
}
