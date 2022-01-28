package org.imt.arduino.reactive.interpreter;

import java.util.Map;

@SuppressWarnings("all")
public class ModuleAspectModuleAspectContext {
  public static final ModuleAspectModuleAspectContext INSTANCE = new ModuleAspectModuleAspectContext();
  
  public static ModuleAspectModuleAspectProperties getSelf(final org.imt.arduino.reactive.arduino.Module _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.imt.arduino.reactive.interpreter.ModuleAspectModuleAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<org.imt.arduino.reactive.arduino.Module, ModuleAspectModuleAspectProperties> map = new java.util.WeakHashMap<org.imt.arduino.reactive.arduino.Module, org.imt.arduino.reactive.interpreter.ModuleAspectModuleAspectProperties>();
  
  public Map<org.imt.arduino.reactive.arduino.Module, ModuleAspectModuleAspectProperties> getMap() {
    return map;
  }
}
