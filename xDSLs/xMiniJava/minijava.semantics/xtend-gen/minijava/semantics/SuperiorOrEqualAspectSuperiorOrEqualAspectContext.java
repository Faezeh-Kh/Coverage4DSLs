package minijava.semantics;

import java.util.Map;
import xminiJava.SuperiorOrEqual;

@SuppressWarnings("all")
public class SuperiorOrEqualAspectSuperiorOrEqualAspectContext {
  public static final SuperiorOrEqualAspectSuperiorOrEqualAspectContext INSTANCE = new SuperiorOrEqualAspectSuperiorOrEqualAspectContext();

  public static SuperiorOrEqualAspectSuperiorOrEqualAspectProperties getSelf(final SuperiorOrEqual _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new minijava.semantics.SuperiorOrEqualAspectSuperiorOrEqualAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<SuperiorOrEqual, SuperiorOrEqualAspectSuperiorOrEqualAspectProperties> map = new java.util.WeakHashMap<xminiJava.SuperiorOrEqual, minijava.semantics.SuperiorOrEqualAspectSuperiorOrEqualAspectProperties>();

  public Map<SuperiorOrEqual, SuperiorOrEqualAspectSuperiorOrEqualAspectProperties> getMap() {
    return map;
  }
}
