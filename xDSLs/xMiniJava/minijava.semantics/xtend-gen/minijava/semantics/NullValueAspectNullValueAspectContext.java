package minijava.semantics;

import java.util.Map;
import xminiJava.NullValue;

@SuppressWarnings("all")
public class NullValueAspectNullValueAspectContext {
  public static final NullValueAspectNullValueAspectContext INSTANCE = new NullValueAspectNullValueAspectContext();

  public static NullValueAspectNullValueAspectProperties getSelf(final NullValue _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new minijava.semantics.NullValueAspectNullValueAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<NullValue, NullValueAspectNullValueAspectProperties> map = new java.util.WeakHashMap<xminiJava.NullValue, minijava.semantics.NullValueAspectNullValueAspectProperties>();

  public Map<NullValue, NullValueAspectNullValueAspectProperties> getMap() {
    return map;
  }
}
