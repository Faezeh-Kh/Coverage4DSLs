package minijava.semantics;

import java.util.Map;
import xminiJava.Null;

@SuppressWarnings("all")
public class NullAspectNullAspectContext {
  public static final NullAspectNullAspectContext INSTANCE = new NullAspectNullAspectContext();

  public static NullAspectNullAspectProperties getSelf(final Null _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new minijava.semantics.NullAspectNullAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<Null, NullAspectNullAspectProperties> map = new java.util.WeakHashMap<xminiJava.Null, minijava.semantics.NullAspectNullAspectProperties>();

  public Map<Null, NullAspectNullAspectProperties> getMap() {
    return map;
  }
}
