package org.imt.xminijava.interpreter;

import java.util.Map;
import org.imt.minijava.xminiJava.Not;

@SuppressWarnings("all")
public class NotAspectNotAspectContext {
  public static final NotAspectNotAspectContext INSTANCE = new NotAspectNotAspectContext();
  
  public static NotAspectNotAspectProperties getSelf(final Not _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.imt.xminijava.interpreter.NotAspectNotAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Not, NotAspectNotAspectProperties> map = new java.util.WeakHashMap<org.imt.minijava.xminiJava.Not, org.imt.xminijava.interpreter.NotAspectNotAspectProperties>();
  
  public Map<Not, NotAspectNotAspectProperties> getMap() {
    return map;
  }
}
