package org.imt.xminijava.interpreter;

import java.util.Map;
import org.imt.minijava.xminiJava.IntegerValue;

@SuppressWarnings("all")
public class IntegerValueToStringAspectIntegerValueAspectContext {
  public static final IntegerValueToStringAspectIntegerValueAspectContext INSTANCE = new IntegerValueToStringAspectIntegerValueAspectContext();
  
  public static IntegerValueToStringAspectIntegerValueAspectProperties getSelf(final IntegerValue _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.imt.xminijava.interpreter.IntegerValueToStringAspectIntegerValueAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<IntegerValue, IntegerValueToStringAspectIntegerValueAspectProperties> map = new java.util.WeakHashMap<org.imt.minijava.xminiJava.IntegerValue, org.imt.xminijava.interpreter.IntegerValueToStringAspectIntegerValueAspectProperties>();
  
  public Map<IntegerValue, IntegerValueToStringAspectIntegerValueAspectProperties> getMap() {
    return map;
  }
}
