package org.imt.xminijava.interpreter;

import java.util.Map;
import org.imt.minijava.xminiJava.Or;

@SuppressWarnings("all")
public class OrAspectOrAspectContext {
  public static final OrAspectOrAspectContext INSTANCE = new OrAspectOrAspectContext();
  
  public static OrAspectOrAspectProperties getSelf(final Or _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.imt.xminijava.interpreter.OrAspectOrAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Or, OrAspectOrAspectProperties> map = new java.util.WeakHashMap<org.imt.minijava.xminiJava.Or, org.imt.xminijava.interpreter.OrAspectOrAspectProperties>();
  
  public Map<Or, OrAspectOrAspectProperties> getMap() {
    return map;
  }
}
