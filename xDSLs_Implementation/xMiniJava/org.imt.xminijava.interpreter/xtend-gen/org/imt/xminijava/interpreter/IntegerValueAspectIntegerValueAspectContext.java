package org.imt.xminijava.interpreter;

import java.util.Map;
import org.imt.minijava.xminiJava.IntegerValue;

@SuppressWarnings("all")
public class IntegerValueAspectIntegerValueAspectContext {
  public static final IntegerValueAspectIntegerValueAspectContext INSTANCE = new IntegerValueAspectIntegerValueAspectContext();
  
  public static IntegerValueAspectIntegerValueAspectProperties getSelf(final IntegerValue _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.imt.xminijava.interpreter.IntegerValueAspectIntegerValueAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<IntegerValue, IntegerValueAspectIntegerValueAspectProperties> map = new java.util.WeakHashMap<org.imt.minijava.xminiJava.IntegerValue, org.imt.xminijava.interpreter.IntegerValueAspectIntegerValueAspectProperties>();
  
  public Map<IntegerValue, IntegerValueAspectIntegerValueAspectProperties> getMap() {
    return map;
  }
}
