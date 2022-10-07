package minijava.semantics;

import java.util.Map;
import xminiJava.SymbolRef;

@SuppressWarnings("all")
public class SymbolRefAspectSymbolRefAspectContext {
  public static final SymbolRefAspectSymbolRefAspectContext INSTANCE = new SymbolRefAspectSymbolRefAspectContext();

  public static SymbolRefAspectSymbolRefAspectProperties getSelf(final SymbolRef _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new minijava.semantics.SymbolRefAspectSymbolRefAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<SymbolRef, SymbolRefAspectSymbolRefAspectProperties> map = new java.util.WeakHashMap<xminiJava.SymbolRef, minijava.semantics.SymbolRefAspectSymbolRefAspectProperties>();

  public Map<SymbolRef, SymbolRefAspectSymbolRefAspectProperties> getMap() {
    return map;
  }
}
