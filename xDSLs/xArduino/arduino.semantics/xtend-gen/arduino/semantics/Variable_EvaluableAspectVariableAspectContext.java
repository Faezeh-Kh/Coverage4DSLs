package arduino.semantics;

import arduino.Variable;
import java.util.Map;

@SuppressWarnings("all")
public class Variable_EvaluableAspectVariableAspectContext {
  public static final Variable_EvaluableAspectVariableAspectContext INSTANCE = new Variable_EvaluableAspectVariableAspectContext();

  public static Variable_EvaluableAspectVariableAspectProperties getSelf(final Variable _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new arduino.semantics.Variable_EvaluableAspectVariableAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<Variable, Variable_EvaluableAspectVariableAspectProperties> map = new java.util.WeakHashMap<arduino.Variable, arduino.semantics.Variable_EvaluableAspectVariableAspectProperties>();

  public Map<Variable, Variable_EvaluableAspectVariableAspectProperties> getMap() {
    return map;
  }
}
