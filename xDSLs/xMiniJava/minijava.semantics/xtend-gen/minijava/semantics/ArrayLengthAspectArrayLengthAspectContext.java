package minijava.semantics;

import java.util.Map;
import xminiJava.ArrayLength;

@SuppressWarnings("all")
public class ArrayLengthAspectArrayLengthAspectContext {
  public static final ArrayLengthAspectArrayLengthAspectContext INSTANCE = new ArrayLengthAspectArrayLengthAspectContext();

  public static ArrayLengthAspectArrayLengthAspectProperties getSelf(final ArrayLength _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new minijava.semantics.ArrayLengthAspectArrayLengthAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<ArrayLength, ArrayLengthAspectArrayLengthAspectProperties> map = new java.util.WeakHashMap<xminiJava.ArrayLength, minijava.semantics.ArrayLengthAspectArrayLengthAspectProperties>();

  public Map<ArrayLength, ArrayLengthAspectArrayLengthAspectProperties> getMap() {
    return map;
  }
}
