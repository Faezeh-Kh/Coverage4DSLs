package org.imt.xminijava.interpreter;

import java.util.Map;
import org.imt.minijava.xminiJava.BooleanValue;

@SuppressWarnings("all")
public class BooleanValueAspectBooleanValueAspectContext {
  public static final BooleanValueAspectBooleanValueAspectContext INSTANCE = new BooleanValueAspectBooleanValueAspectContext();
  
  public static BooleanValueAspectBooleanValueAspectProperties getSelf(final BooleanValue _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.imt.xminijava.interpreter.BooleanValueAspectBooleanValueAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<BooleanValue, BooleanValueAspectBooleanValueAspectProperties> map = new java.util.WeakHashMap<org.imt.minijava.xminiJava.BooleanValue, org.imt.xminijava.interpreter.BooleanValueAspectBooleanValueAspectProperties>();
  
  public Map<BooleanValue, BooleanValueAspectBooleanValueAspectProperties> getMap() {
    return map;
  }
}
