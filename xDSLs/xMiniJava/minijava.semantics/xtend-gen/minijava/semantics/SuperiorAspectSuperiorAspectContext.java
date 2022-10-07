package minijava.semantics;

import java.util.Map;
import xminiJava.Superior;

@SuppressWarnings("all")
public class SuperiorAspectSuperiorAspectContext {
  public static final SuperiorAspectSuperiorAspectContext INSTANCE = new SuperiorAspectSuperiorAspectContext();

  public static SuperiorAspectSuperiorAspectProperties getSelf(final Superior _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new minijava.semantics.SuperiorAspectSuperiorAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<Superior, SuperiorAspectSuperiorAspectProperties> map = new java.util.WeakHashMap<xminiJava.Superior, minijava.semantics.SuperiorAspectSuperiorAspectProperties>();

  public Map<Superior, SuperiorAspectSuperiorAspectProperties> getMap() {
    return map;
  }
}
