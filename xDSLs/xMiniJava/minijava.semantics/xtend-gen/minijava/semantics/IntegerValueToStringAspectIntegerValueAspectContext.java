package minijava.semantics;

import java.util.Map;
import xminiJava.IntegerValue;

@SuppressWarnings("all")
public class IntegerValueToStringAspectIntegerValueAspectContext {
  public static final IntegerValueToStringAspectIntegerValueAspectContext INSTANCE = new IntegerValueToStringAspectIntegerValueAspectContext();

  public static IntegerValueToStringAspectIntegerValueAspectProperties getSelf(final IntegerValue _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new minijava.semantics.IntegerValueToStringAspectIntegerValueAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<IntegerValue, IntegerValueToStringAspectIntegerValueAspectProperties> map = new java.util.WeakHashMap<xminiJava.IntegerValue, minijava.semantics.IntegerValueToStringAspectIntegerValueAspectProperties>();

  public Map<IntegerValue, IntegerValueToStringAspectIntegerValueAspectProperties> getMap() {
    return map;
  }
}
