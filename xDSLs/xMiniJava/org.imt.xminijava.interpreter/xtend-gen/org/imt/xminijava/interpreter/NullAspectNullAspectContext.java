package org.imt.xminijava.interpreter;

import java.util.Map;
import org.imt.minijava.xminiJava.Null;

@SuppressWarnings("all")
public class NullAspectNullAspectContext {
  public static final NullAspectNullAspectContext INSTANCE = new NullAspectNullAspectContext();
  
  public static NullAspectNullAspectProperties getSelf(final Null _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.imt.xminijava.interpreter.NullAspectNullAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Null, NullAspectNullAspectProperties> map = new java.util.WeakHashMap<org.imt.minijava.xminiJava.Null, org.imt.xminijava.interpreter.NullAspectNullAspectProperties>();
  
  public Map<Null, NullAspectNullAspectProperties> getMap() {
    return map;
  }
}
