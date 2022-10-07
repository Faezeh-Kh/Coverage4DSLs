package arduino.semantics;

import arduino.BooleanModuleGet;
import java.util.Map;

@SuppressWarnings("all")
public class BooleanModuleGet_ExecutableAspectBooleanModuleGetAspectContext {
  public static final BooleanModuleGet_ExecutableAspectBooleanModuleGetAspectContext INSTANCE = new BooleanModuleGet_ExecutableAspectBooleanModuleGetAspectContext();

  public static BooleanModuleGet_ExecutableAspectBooleanModuleGetAspectProperties getSelf(final BooleanModuleGet _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new arduino.semantics.BooleanModuleGet_ExecutableAspectBooleanModuleGetAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<BooleanModuleGet, BooleanModuleGet_ExecutableAspectBooleanModuleGetAspectProperties> map = new java.util.WeakHashMap<arduino.BooleanModuleGet, arduino.semantics.BooleanModuleGet_ExecutableAspectBooleanModuleGetAspectProperties>();

  public Map<BooleanModuleGet, BooleanModuleGet_ExecutableAspectBooleanModuleGetAspectProperties> getMap() {
    return map;
  }
}
