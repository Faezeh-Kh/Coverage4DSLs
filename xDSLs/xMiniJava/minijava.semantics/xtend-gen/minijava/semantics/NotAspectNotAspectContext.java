package minijava.semantics;

import java.util.Map;
import xminiJava.Not;

@SuppressWarnings("all")
public class NotAspectNotAspectContext {
  public static final NotAspectNotAspectContext INSTANCE = new NotAspectNotAspectContext();

  public static NotAspectNotAspectProperties getSelf(final Not _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new minijava.semantics.NotAspectNotAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<Not, NotAspectNotAspectProperties> map = new java.util.WeakHashMap<xminiJava.Not, minijava.semantics.NotAspectNotAspectProperties>();

  public Map<Not, NotAspectNotAspectProperties> getMap() {
    return map;
  }
}
