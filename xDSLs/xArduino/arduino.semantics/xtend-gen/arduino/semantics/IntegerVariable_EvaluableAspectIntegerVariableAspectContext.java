package arduino.semantics;

import arduino.IntegerVariable;
import java.util.Map;

@SuppressWarnings("all")
public class IntegerVariable_EvaluableAspectIntegerVariableAspectContext {
  public static final IntegerVariable_EvaluableAspectIntegerVariableAspectContext INSTANCE = new IntegerVariable_EvaluableAspectIntegerVariableAspectContext();

  public static IntegerVariable_EvaluableAspectIntegerVariableAspectProperties getSelf(final IntegerVariable _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new arduino.semantics.IntegerVariable_EvaluableAspectIntegerVariableAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<IntegerVariable, IntegerVariable_EvaluableAspectIntegerVariableAspectProperties> map = new java.util.WeakHashMap<arduino.IntegerVariable, arduino.semantics.IntegerVariable_EvaluableAspectIntegerVariableAspectProperties>();

  public Map<IntegerVariable, IntegerVariable_EvaluableAspectIntegerVariableAspectProperties> getMap() {
    return map;
  }
}
