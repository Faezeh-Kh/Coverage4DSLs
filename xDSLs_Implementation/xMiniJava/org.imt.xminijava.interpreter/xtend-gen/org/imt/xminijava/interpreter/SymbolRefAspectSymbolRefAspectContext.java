package org.imt.xminijava.interpreter;

import java.util.Map;
import org.imt.minijava.xminiJava.SymbolRef;

@SuppressWarnings("all")
public class SymbolRefAspectSymbolRefAspectContext {
  public static final SymbolRefAspectSymbolRefAspectContext INSTANCE = new SymbolRefAspectSymbolRefAspectContext();
  
  public static SymbolRefAspectSymbolRefAspectProperties getSelf(final SymbolRef _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.imt.xminijava.interpreter.SymbolRefAspectSymbolRefAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<SymbolRef, SymbolRefAspectSymbolRefAspectProperties> map = new java.util.WeakHashMap<org.imt.minijava.xminiJava.SymbolRef, org.imt.xminijava.interpreter.SymbolRefAspectSymbolRefAspectProperties>();
  
  public Map<SymbolRef, SymbolRefAspectSymbolRefAspectProperties> getMap() {
    return map;
  }
}
