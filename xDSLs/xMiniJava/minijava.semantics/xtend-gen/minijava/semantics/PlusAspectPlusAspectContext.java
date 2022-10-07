package minijava.semantics;

import java.util.Map;
import xminiJava.Plus;

@SuppressWarnings("all")
public class PlusAspectPlusAspectContext {
  public static final PlusAspectPlusAspectContext INSTANCE = new PlusAspectPlusAspectContext();

  public static PlusAspectPlusAspectProperties getSelf(final Plus _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new minijava.semantics.PlusAspectPlusAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<Plus, PlusAspectPlusAspectProperties> map = new java.util.WeakHashMap<xminiJava.Plus, minijava.semantics.PlusAspectPlusAspectProperties>();

  public Map<Plus, PlusAspectPlusAspectProperties> getMap() {
    return map;
  }
}
