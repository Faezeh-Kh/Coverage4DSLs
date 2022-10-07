package arduino.semantics;

import arduino.ModuleAssignment;
import java.util.Map;

@SuppressWarnings("all")
public class ModuleAssignment_ExecutableAspectModuleAssignmentAspectContext {
  public static final ModuleAssignment_ExecutableAspectModuleAssignmentAspectContext INSTANCE = new ModuleAssignment_ExecutableAspectModuleAssignmentAspectContext();

  public static ModuleAssignment_ExecutableAspectModuleAssignmentAspectProperties getSelf(final ModuleAssignment _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new arduino.semantics.ModuleAssignment_ExecutableAspectModuleAssignmentAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<ModuleAssignment, ModuleAssignment_ExecutableAspectModuleAssignmentAspectProperties> map = new java.util.WeakHashMap<arduino.ModuleAssignment, arduino.semantics.ModuleAssignment_ExecutableAspectModuleAssignmentAspectProperties>();

  public Map<ModuleAssignment, ModuleAssignment_ExecutableAspectModuleAssignmentAspectProperties> getMap() {
    return map;
  }
}
