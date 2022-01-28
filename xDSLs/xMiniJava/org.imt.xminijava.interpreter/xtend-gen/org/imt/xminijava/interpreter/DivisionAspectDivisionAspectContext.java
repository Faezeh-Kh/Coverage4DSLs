package org.imt.xminijava.interpreter;

import java.util.Map;
import org.imt.minijava.xminiJava.Division;

@SuppressWarnings("all")
public class DivisionAspectDivisionAspectContext {
  public static final DivisionAspectDivisionAspectContext INSTANCE = new DivisionAspectDivisionAspectContext();
  
  public static DivisionAspectDivisionAspectProperties getSelf(final Division _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.imt.xminijava.interpreter.DivisionAspectDivisionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Division, DivisionAspectDivisionAspectProperties> map = new java.util.WeakHashMap<org.imt.minijava.xminiJava.Division, org.imt.xminijava.interpreter.DivisionAspectDivisionAspectProperties>();
  
  public Map<Division, DivisionAspectDivisionAspectProperties> getMap() {
    return map;
  }
}
