package arduino.semantics;

import java.util.Map;

@SuppressWarnings("all")
public class ModuleAspectModuleAspectContext {
  public static final ModuleAspectModuleAspectContext INSTANCE = new ModuleAspectModuleAspectContext();

  public static ModuleAspectModuleAspectProperties getSelf(final arduino.Module _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new arduino.semantics.ModuleAspectModuleAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<arduino.Module, ModuleAspectModuleAspectProperties> map = new java.util.WeakHashMap<arduino.Module, arduino.semantics.ModuleAspectModuleAspectProperties>();

  public Map<arduino.Module, ModuleAspectModuleAspectProperties> getMap() {
    return map;
  }
}
