package org.imt.xminijava.interpreter;

import java.util.Map;
import org.imt.minijava.xminiJava.Return;

@SuppressWarnings("all")
public class ReturnAspectReturnAspectContext {
  public static final ReturnAspectReturnAspectContext INSTANCE = new ReturnAspectReturnAspectContext();
  
  public static ReturnAspectReturnAspectProperties getSelf(final Return _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.imt.xminijava.interpreter.ReturnAspectReturnAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Return, ReturnAspectReturnAspectProperties> map = new java.util.WeakHashMap<org.imt.minijava.xminiJava.Return, org.imt.xminijava.interpreter.ReturnAspectReturnAspectProperties>();
  
  public Map<Return, ReturnAspectReturnAspectProperties> getMap() {
    return map;
  }
}
