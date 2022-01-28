package org.imt.xminijava.interpreter;

import java.util.Map;
import org.imt.minijava.xminiJava.BooleanValue;

@SuppressWarnings("all")
public class BooleanValueToStringAspectBooleanValueAspectContext {
  public static final BooleanValueToStringAspectBooleanValueAspectContext INSTANCE = new BooleanValueToStringAspectBooleanValueAspectContext();
  
  public static BooleanValueToStringAspectBooleanValueAspectProperties getSelf(final BooleanValue _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.imt.xminijava.interpreter.BooleanValueToStringAspectBooleanValueAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<BooleanValue, BooleanValueToStringAspectBooleanValueAspectProperties> map = new java.util.WeakHashMap<org.imt.minijava.xminiJava.BooleanValue, org.imt.xminijava.interpreter.BooleanValueToStringAspectBooleanValueAspectProperties>();
  
  public Map<BooleanValue, BooleanValueToStringAspectBooleanValueAspectProperties> getMap() {
    return map;
  }
}
