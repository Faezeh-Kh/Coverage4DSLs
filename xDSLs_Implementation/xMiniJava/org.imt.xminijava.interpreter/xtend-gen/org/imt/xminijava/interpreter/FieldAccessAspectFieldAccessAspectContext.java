package org.imt.xminijava.interpreter;

import java.util.Map;
import org.imt.minijava.xminiJava.FieldAccess;

@SuppressWarnings("all")
public class FieldAccessAspectFieldAccessAspectContext {
  public static final FieldAccessAspectFieldAccessAspectContext INSTANCE = new FieldAccessAspectFieldAccessAspectContext();
  
  public static FieldAccessAspectFieldAccessAspectProperties getSelf(final FieldAccess _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.imt.xminijava.interpreter.FieldAccessAspectFieldAccessAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<FieldAccess, FieldAccessAspectFieldAccessAspectProperties> map = new java.util.WeakHashMap<org.imt.minijava.xminiJava.FieldAccess, org.imt.xminijava.interpreter.FieldAccessAspectFieldAccessAspectProperties>();
  
  public Map<FieldAccess, FieldAccessAspectFieldAccessAspectProperties> getMap() {
    return map;
  }
}
