package minijava.semantics;

import java.util.Map;
import xminiJava.Or;

@SuppressWarnings("all")
public class OrAspectOrAspectContext {
  public static final OrAspectOrAspectContext INSTANCE = new OrAspectOrAspectContext();

  public static OrAspectOrAspectProperties getSelf(final Or _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new minijava.semantics.OrAspectOrAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<Or, OrAspectOrAspectProperties> map = new java.util.WeakHashMap<xminiJava.Or, minijava.semantics.OrAspectOrAspectProperties>();

  public Map<Or, OrAspectOrAspectProperties> getMap() {
    return map;
  }
}
