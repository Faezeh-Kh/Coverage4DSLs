package org.imt.arduino.reactive.interpreter;

import java.util.Map;
import org.imt.arduino.reactive.arduino.VariableAssignment;

@SuppressWarnings("all")
public class VariableAssignment_ExecutableAspectVariableAssignmentAspectContext {
  public static final VariableAssignment_ExecutableAspectVariableAssignmentAspectContext INSTANCE = new VariableAssignment_ExecutableAspectVariableAssignmentAspectContext();
  
  public static VariableAssignment_ExecutableAspectVariableAssignmentAspectProperties getSelf(final VariableAssignment _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.imt.arduino.reactive.interpreter.VariableAssignment_ExecutableAspectVariableAssignmentAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<VariableAssignment, VariableAssignment_ExecutableAspectVariableAssignmentAspectProperties> map = new java.util.WeakHashMap<org.imt.arduino.reactive.arduino.VariableAssignment, org.imt.arduino.reactive.interpreter.VariableAssignment_ExecutableAspectVariableAssignmentAspectProperties>();
  
  public Map<VariableAssignment, VariableAssignment_ExecutableAspectVariableAssignmentAspectProperties> getMap() {
    return map;
  }
}
