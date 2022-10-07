package arduino.semantics;

import arduino.VariableAssignment;
import java.util.Map;

@SuppressWarnings("all")
public class VariableAssignment_ExecutableAspectVariableAssignmentAspectContext {
  public static final VariableAssignment_ExecutableAspectVariableAssignmentAspectContext INSTANCE = new VariableAssignment_ExecutableAspectVariableAssignmentAspectContext();

  public static VariableAssignment_ExecutableAspectVariableAssignmentAspectProperties getSelf(final VariableAssignment _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new arduino.semantics.VariableAssignment_ExecutableAspectVariableAssignmentAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<VariableAssignment, VariableAssignment_ExecutableAspectVariableAssignmentAspectProperties> map = new java.util.WeakHashMap<arduino.VariableAssignment, arduino.semantics.VariableAssignment_ExecutableAspectVariableAssignmentAspectProperties>();

  public Map<VariableAssignment, VariableAssignment_ExecutableAspectVariableAssignmentAspectProperties> getMap() {
    return map;
  }
}
