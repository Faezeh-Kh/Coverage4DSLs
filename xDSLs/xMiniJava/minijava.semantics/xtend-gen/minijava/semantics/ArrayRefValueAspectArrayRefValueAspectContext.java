package minijava.semantics;

import java.util.Map;
import xminiJava.ArrayRefValue;

@SuppressWarnings("all")
public class ArrayRefValueAspectArrayRefValueAspectContext {
  public static final ArrayRefValueAspectArrayRefValueAspectContext INSTANCE = new ArrayRefValueAspectArrayRefValueAspectContext();

  public static ArrayRefValueAspectArrayRefValueAspectProperties getSelf(final ArrayRefValue _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new minijava.semantics.ArrayRefValueAspectArrayRefValueAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<ArrayRefValue, ArrayRefValueAspectArrayRefValueAspectProperties> map = new java.util.WeakHashMap<xminiJava.ArrayRefValue, minijava.semantics.ArrayRefValueAspectArrayRefValueAspectProperties>();

  public Map<ArrayRefValue, ArrayRefValueAspectArrayRefValueAspectProperties> getMap() {
    return map;
  }
}
