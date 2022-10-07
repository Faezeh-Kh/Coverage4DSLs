package arduino.semantics;

import arduino.ModuleInstruction;
import java.util.Map;

@SuppressWarnings("all")
public class ModuleInstruction_ExecutableAspectModuleInstructionAspectContext {
  public static final ModuleInstruction_ExecutableAspectModuleInstructionAspectContext INSTANCE = new ModuleInstruction_ExecutableAspectModuleInstructionAspectContext();

  public static ModuleInstruction_ExecutableAspectModuleInstructionAspectProperties getSelf(final ModuleInstruction _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new arduino.semantics.ModuleInstruction_ExecutableAspectModuleInstructionAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<ModuleInstruction, ModuleInstruction_ExecutableAspectModuleInstructionAspectProperties> map = new java.util.WeakHashMap<arduino.ModuleInstruction, arduino.semantics.ModuleInstruction_ExecutableAspectModuleInstructionAspectProperties>();

  public Map<ModuleInstruction, ModuleInstruction_ExecutableAspectModuleInstructionAspectProperties> getMap() {
    return map;
  }
}
