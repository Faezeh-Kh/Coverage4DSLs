package org.imt.xminijava.interpreter;

import java.util.Map;
import org.imt.minijava.xminiJava.Method;

@SuppressWarnings("all")
public class MethodSortofStatementAspectMethodAspectContext {
  public static final MethodSortofStatementAspectMethodAspectContext INSTANCE = new MethodSortofStatementAspectMethodAspectContext();
  
  public static MethodSortofStatementAspectMethodAspectProperties getSelf(final Method _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.imt.xminijava.interpreter.MethodSortofStatementAspectMethodAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Method, MethodSortofStatementAspectMethodAspectProperties> map = new java.util.WeakHashMap<org.imt.minijava.xminiJava.Method, org.imt.xminijava.interpreter.MethodSortofStatementAspectMethodAspectProperties>();
  
  public Map<Method, MethodSortofStatementAspectMethodAspectProperties> getMap() {
    return map;
  }
}
