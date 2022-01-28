package org.imt.xminijava.interpreter;

import java.util.Map;
import org.imt.minijava.xminiJava.Inequality;

@SuppressWarnings("all")
public class InequalityAspectInequalityAspectContext {
  public static final InequalityAspectInequalityAspectContext INSTANCE = new InequalityAspectInequalityAspectContext();
  
  public static InequalityAspectInequalityAspectProperties getSelf(final Inequality _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.imt.xminijava.interpreter.InequalityAspectInequalityAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Inequality, InequalityAspectInequalityAspectProperties> map = new java.util.WeakHashMap<org.imt.minijava.xminiJava.Inequality, org.imt.xminijava.interpreter.InequalityAspectInequalityAspectProperties>();
  
  public Map<Inequality, InequalityAspectInequalityAspectProperties> getMap() {
    return map;
  }
}
