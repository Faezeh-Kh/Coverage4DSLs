package minijava.semantics;

import java.util.Map;
import xminiJava.IntegerValue;

@SuppressWarnings("all")
public class IntegerValueAspectIntegerValueAspectContext {
  public static final IntegerValueAspectIntegerValueAspectContext INSTANCE = new IntegerValueAspectIntegerValueAspectContext();

  public static IntegerValueAspectIntegerValueAspectProperties getSelf(final IntegerValue _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new minijava.semantics.IntegerValueAspectIntegerValueAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<IntegerValue, IntegerValueAspectIntegerValueAspectProperties> map = new java.util.WeakHashMap<xminiJava.IntegerValue, minijava.semantics.IntegerValueAspectIntegerValueAspectProperties>();

  public Map<IntegerValue, IntegerValueAspectIntegerValueAspectProperties> getMap() {
    return map;
  }
}
