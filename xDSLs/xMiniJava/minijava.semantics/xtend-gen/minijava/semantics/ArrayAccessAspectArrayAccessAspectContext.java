package minijava.semantics;

import java.util.Map;
import xminiJava.ArrayAccess;

@SuppressWarnings("all")
public class ArrayAccessAspectArrayAccessAspectContext {
  public static final ArrayAccessAspectArrayAccessAspectContext INSTANCE = new ArrayAccessAspectArrayAccessAspectContext();

  public static ArrayAccessAspectArrayAccessAspectProperties getSelf(final ArrayAccess _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new minijava.semantics.ArrayAccessAspectArrayAccessAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<ArrayAccess, ArrayAccessAspectArrayAccessAspectProperties> map = new java.util.WeakHashMap<xminiJava.ArrayAccess, minijava.semantics.ArrayAccessAspectArrayAccessAspectProperties>();

  public Map<ArrayAccess, ArrayAccessAspectArrayAccessAspectProperties> getMap() {
    return map;
  }
}
