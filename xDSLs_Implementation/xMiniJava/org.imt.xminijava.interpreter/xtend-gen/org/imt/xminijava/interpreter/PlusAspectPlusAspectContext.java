package org.imt.xminijava.interpreter;

import java.util.Map;
import org.imt.minijava.xminiJava.Plus;

@SuppressWarnings("all")
public class PlusAspectPlusAspectContext {
  public static final PlusAspectPlusAspectContext INSTANCE = new PlusAspectPlusAspectContext();
  
  public static PlusAspectPlusAspectProperties getSelf(final Plus _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.imt.xminijava.interpreter.PlusAspectPlusAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Plus, PlusAspectPlusAspectProperties> map = new java.util.WeakHashMap<org.imt.minijava.xminiJava.Plus, org.imt.xminijava.interpreter.PlusAspectPlusAspectProperties>();
  
  public Map<Plus, PlusAspectPlusAspectProperties> getMap() {
    return map;
  }
}
