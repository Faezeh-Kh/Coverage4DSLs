package org.imt.xminijava.interpreter;

import java.util.Map;
import org.imt.minijava.xminiJava.ArrayLength;

@SuppressWarnings("all")
public class ArrayLengthAspectArrayLengthAspectContext {
  public static final ArrayLengthAspectArrayLengthAspectContext INSTANCE = new ArrayLengthAspectArrayLengthAspectContext();
  
  public static ArrayLengthAspectArrayLengthAspectProperties getSelf(final ArrayLength _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.imt.xminijava.interpreter.ArrayLengthAspectArrayLengthAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<ArrayLength, ArrayLengthAspectArrayLengthAspectProperties> map = new java.util.WeakHashMap<org.imt.minijava.xminiJava.ArrayLength, org.imt.xminijava.interpreter.ArrayLengthAspectArrayLengthAspectProperties>();
  
  public Map<ArrayLength, ArrayLengthAspectArrayLengthAspectProperties> getMap() {
    return map;
  }
}
