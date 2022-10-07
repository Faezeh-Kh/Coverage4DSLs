package arduino.semantics;

import arduino.BooleanConstant;
import java.util.Map;

@SuppressWarnings("all")
public class BooleanConstant_ExecutableAspectBooleanConstantAspectContext {
  public static final BooleanConstant_ExecutableAspectBooleanConstantAspectContext INSTANCE = new BooleanConstant_ExecutableAspectBooleanConstantAspectContext();

  public static BooleanConstant_ExecutableAspectBooleanConstantAspectProperties getSelf(final BooleanConstant _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new arduino.semantics.BooleanConstant_ExecutableAspectBooleanConstantAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<BooleanConstant, BooleanConstant_ExecutableAspectBooleanConstantAspectProperties> map = new java.util.WeakHashMap<arduino.BooleanConstant, arduino.semantics.BooleanConstant_ExecutableAspectBooleanConstantAspectProperties>();

  public Map<BooleanConstant, BooleanConstant_ExecutableAspectBooleanConstantAspectProperties> getMap() {
    return map;
  }
}
