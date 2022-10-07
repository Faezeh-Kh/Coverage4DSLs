package minijava.semantics;

import java.util.Map;
import xminiJava.And;

@SuppressWarnings("all")
public class AndAspectAndAspectContext {
  public static final AndAspectAndAspectContext INSTANCE = new AndAspectAndAspectContext();

  public static AndAspectAndAspectProperties getSelf(final And _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new minijava.semantics.AndAspectAndAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<And, AndAspectAndAspectProperties> map = new java.util.WeakHashMap<xminiJava.And, minijava.semantics.AndAspectAndAspectProperties>();

  public Map<And, AndAspectAndAspectProperties> getMap() {
    return map;
  }
}
