package minijava.semantics;

import java.util.Map;
import xminiJava.Equality;

@SuppressWarnings("all")
public class EqualityAspectEqualityAspectContext {
  public static final EqualityAspectEqualityAspectContext INSTANCE = new EqualityAspectEqualityAspectContext();

  public static EqualityAspectEqualityAspectProperties getSelf(final Equality _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new minijava.semantics.EqualityAspectEqualityAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<Equality, EqualityAspectEqualityAspectProperties> map = new java.util.WeakHashMap<xminiJava.Equality, minijava.semantics.EqualityAspectEqualityAspectProperties>();

  public Map<Equality, EqualityAspectEqualityAspectProperties> getMap() {
    return map;
  }
}
