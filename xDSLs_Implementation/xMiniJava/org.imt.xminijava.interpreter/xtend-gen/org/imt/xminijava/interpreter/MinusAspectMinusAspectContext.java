package org.imt.xminijava.interpreter;

import java.util.Map;
import org.imt.minijava.xminiJava.Minus;

@SuppressWarnings("all")
public class MinusAspectMinusAspectContext {
  public static final MinusAspectMinusAspectContext INSTANCE = new MinusAspectMinusAspectContext();
  
  public static MinusAspectMinusAspectProperties getSelf(final Minus _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.imt.xminijava.interpreter.MinusAspectMinusAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Minus, MinusAspectMinusAspectProperties> map = new java.util.WeakHashMap<org.imt.minijava.xminiJava.Minus, org.imt.xminijava.interpreter.MinusAspectMinusAspectProperties>();
  
  public Map<Minus, MinusAspectMinusAspectProperties> getMap() {
    return map;
  }
}
