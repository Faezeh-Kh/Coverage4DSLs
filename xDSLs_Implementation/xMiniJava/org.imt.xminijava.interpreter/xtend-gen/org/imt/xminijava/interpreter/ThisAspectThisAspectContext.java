package org.imt.xminijava.interpreter;

import java.util.Map;
import org.imt.minijava.xminiJava.This;

@SuppressWarnings("all")
public class ThisAspectThisAspectContext {
  public static final ThisAspectThisAspectContext INSTANCE = new ThisAspectThisAspectContext();
  
  public static ThisAspectThisAspectProperties getSelf(final This _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.imt.xminijava.interpreter.ThisAspectThisAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<This, ThisAspectThisAspectProperties> map = new java.util.WeakHashMap<org.imt.minijava.xminiJava.This, org.imt.xminijava.interpreter.ThisAspectThisAspectProperties>();
  
  public Map<This, ThisAspectThisAspectProperties> getMap() {
    return map;
  }
}
