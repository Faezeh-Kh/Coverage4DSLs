package org.imt.xminijava.interpreter;

import java.util.Map;
import org.imt.minijava.xminiJava.Equality;

@SuppressWarnings("all")
public class EqualityAspectEqualityAspectContext {
  public static final EqualityAspectEqualityAspectContext INSTANCE = new EqualityAspectEqualityAspectContext();
  
  public static EqualityAspectEqualityAspectProperties getSelf(final Equality _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.imt.xminijava.interpreter.EqualityAspectEqualityAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Equality, EqualityAspectEqualityAspectProperties> map = new java.util.WeakHashMap<org.imt.minijava.xminiJava.Equality, org.imt.xminijava.interpreter.EqualityAspectEqualityAspectProperties>();
  
  public Map<Equality, EqualityAspectEqualityAspectProperties> getMap() {
    return map;
  }
}
