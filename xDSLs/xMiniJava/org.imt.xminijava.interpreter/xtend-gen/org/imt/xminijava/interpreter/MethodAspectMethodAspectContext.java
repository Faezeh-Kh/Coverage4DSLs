package org.imt.xminijava.interpreter;

import java.util.Map;
import org.imt.minijava.xminiJava.Method;

@SuppressWarnings("all")
public class MethodAspectMethodAspectContext {
  public static final MethodAspectMethodAspectContext INSTANCE = new MethodAspectMethodAspectContext();
  
  public static MethodAspectMethodAspectProperties getSelf(final Method _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.imt.xminijava.interpreter.MethodAspectMethodAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Method, MethodAspectMethodAspectProperties> map = new java.util.WeakHashMap<org.imt.minijava.xminiJava.Method, org.imt.xminijava.interpreter.MethodAspectMethodAspectProperties>();
  
  public Map<Method, MethodAspectMethodAspectProperties> getMap() {
    return map;
  }
}
