package minijava.semantics;

import java.util.Map;
import xminiJava.BooleanValue;

@SuppressWarnings("all")
public class BooleanValueToStringAspectBooleanValueAspectContext {
  public static final BooleanValueToStringAspectBooleanValueAspectContext INSTANCE = new BooleanValueToStringAspectBooleanValueAspectContext();

  public static BooleanValueToStringAspectBooleanValueAspectProperties getSelf(final BooleanValue _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new minijava.semantics.BooleanValueToStringAspectBooleanValueAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<BooleanValue, BooleanValueToStringAspectBooleanValueAspectProperties> map = new java.util.WeakHashMap<xminiJava.BooleanValue, minijava.semantics.BooleanValueToStringAspectBooleanValueAspectProperties>();

  public Map<BooleanValue, BooleanValueToStringAspectBooleanValueAspectProperties> getMap() {
    return map;
  }
}
