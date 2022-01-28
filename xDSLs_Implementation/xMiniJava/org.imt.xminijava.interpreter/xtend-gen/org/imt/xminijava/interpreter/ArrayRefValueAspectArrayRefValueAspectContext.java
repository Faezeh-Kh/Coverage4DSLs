package org.imt.xminijava.interpreter;

import java.util.Map;
import org.imt.minijava.xminiJava.ArrayRefValue;

@SuppressWarnings("all")
public class ArrayRefValueAspectArrayRefValueAspectContext {
  public static final ArrayRefValueAspectArrayRefValueAspectContext INSTANCE = new ArrayRefValueAspectArrayRefValueAspectContext();
  
  public static ArrayRefValueAspectArrayRefValueAspectProperties getSelf(final ArrayRefValue _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.imt.xminijava.interpreter.ArrayRefValueAspectArrayRefValueAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<ArrayRefValue, ArrayRefValueAspectArrayRefValueAspectProperties> map = new java.util.WeakHashMap<org.imt.minijava.xminiJava.ArrayRefValue, org.imt.xminijava.interpreter.ArrayRefValueAspectArrayRefValueAspectProperties>();
  
  public Map<ArrayRefValue, ArrayRefValueAspectArrayRefValueAspectProperties> getMap() {
    return map;
  }
}
