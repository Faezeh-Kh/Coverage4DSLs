package org.imt.xminijava.interpreter;

import java.util.Map;
import org.imt.minijava.xminiJava.Context;

@SuppressWarnings("all")
public class ContextAspectContextAspectContext {
  public static final ContextAspectContextAspectContext INSTANCE = new ContextAspectContextAspectContext();
  
  public static ContextAspectContextAspectProperties getSelf(final Context _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.imt.xminijava.interpreter.ContextAspectContextAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Context, ContextAspectContextAspectProperties> map = new java.util.WeakHashMap<org.imt.minijava.xminiJava.Context, org.imt.xminijava.interpreter.ContextAspectContextAspectProperties>();
  
  public Map<Context, ContextAspectContextAspectProperties> getMap() {
    return map;
  }
}
