package minijava.semantics;

import java.util.Map;
import xminiJava.This;

@SuppressWarnings("all")
public class ThisAspectThisAspectContext {
  public static final ThisAspectThisAspectContext INSTANCE = new ThisAspectThisAspectContext();

  public static ThisAspectThisAspectProperties getSelf(final This _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new minijava.semantics.ThisAspectThisAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<This, ThisAspectThisAspectProperties> map = new java.util.WeakHashMap<xminiJava.This, minijava.semantics.ThisAspectThisAspectProperties>();

  public Map<This, ThisAspectThisAspectProperties> getMap() {
    return map;
  }
}
