package arduino.semantics;

import arduino.IntegerModuleGet;
import java.util.Map;

@SuppressWarnings("all")
public class IntegerModuleGet_ExecutableAspectIntegerModuleGetAspectContext {
  public static final IntegerModuleGet_ExecutableAspectIntegerModuleGetAspectContext INSTANCE = new IntegerModuleGet_ExecutableAspectIntegerModuleGetAspectContext();

  public static IntegerModuleGet_ExecutableAspectIntegerModuleGetAspectProperties getSelf(final IntegerModuleGet _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new arduino.semantics.IntegerModuleGet_ExecutableAspectIntegerModuleGetAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<IntegerModuleGet, IntegerModuleGet_ExecutableAspectIntegerModuleGetAspectProperties> map = new java.util.WeakHashMap<arduino.IntegerModuleGet, arduino.semantics.IntegerModuleGet_ExecutableAspectIntegerModuleGetAspectProperties>();

  public Map<IntegerModuleGet, IntegerModuleGet_ExecutableAspectIntegerModuleGetAspectProperties> getMap() {
    return map;
  }
}
