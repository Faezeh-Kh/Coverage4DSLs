package org.imt.xminijava.interpreter;

import java.util.Map;
import org.imt.minijava.xminiJava.And;

@SuppressWarnings("all")
public class AndAspectAndAspectContext {
  public static final AndAspectAndAspectContext INSTANCE = new AndAspectAndAspectContext();
  
  public static AndAspectAndAspectProperties getSelf(final And _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.imt.xminijava.interpreter.AndAspectAndAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<And, AndAspectAndAspectProperties> map = new java.util.WeakHashMap<org.imt.minijava.xminiJava.And, org.imt.xminijava.interpreter.AndAspectAndAspectProperties>();
  
  public Map<And, AndAspectAndAspectProperties> getMap() {
    return map;
  }
}
