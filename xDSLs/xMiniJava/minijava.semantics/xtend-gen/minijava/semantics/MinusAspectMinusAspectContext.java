package minijava.semantics;

import java.util.Map;
import xminiJava.Minus;

@SuppressWarnings("all")
public class MinusAspectMinusAspectContext {
  public static final MinusAspectMinusAspectContext INSTANCE = new MinusAspectMinusAspectContext();

  public static MinusAspectMinusAspectProperties getSelf(final Minus _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new minijava.semantics.MinusAspectMinusAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<Minus, MinusAspectMinusAspectProperties> map = new java.util.WeakHashMap<xminiJava.Minus, minijava.semantics.MinusAspectMinusAspectProperties>();

  public Map<Minus, MinusAspectMinusAspectProperties> getMap() {
    return map;
  }
}
