package org.imt.xminijava.interpreter;

import java.util.Map;
import org.imt.minijava.xminiJava.ArrayAccess;

@SuppressWarnings("all")
public class ArrayAccessAspectArrayAccessAspectContext {
  public static final ArrayAccessAspectArrayAccessAspectContext INSTANCE = new ArrayAccessAspectArrayAccessAspectContext();
  
  public static ArrayAccessAspectArrayAccessAspectProperties getSelf(final ArrayAccess _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.imt.xminijava.interpreter.ArrayAccessAspectArrayAccessAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<ArrayAccess, ArrayAccessAspectArrayAccessAspectProperties> map = new java.util.WeakHashMap<org.imt.minijava.xminiJava.ArrayAccess, org.imt.xminijava.interpreter.ArrayAccessAspectArrayAccessAspectProperties>();
  
  public Map<ArrayAccess, ArrayAccessAspectArrayAccessAspectProperties> getMap() {
    return map;
  }
}
