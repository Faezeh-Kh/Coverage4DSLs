package minijava.semantics;

import java.util.Map;
import xminiJava.BooleanValue;

@SuppressWarnings("all")
public class BooleanValueAspectBooleanValueAspectContext {
  public static final BooleanValueAspectBooleanValueAspectContext INSTANCE = new BooleanValueAspectBooleanValueAspectContext();

  public static BooleanValueAspectBooleanValueAspectProperties getSelf(final BooleanValue _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new minijava.semantics.BooleanValueAspectBooleanValueAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<BooleanValue, BooleanValueAspectBooleanValueAspectProperties> map = new java.util.WeakHashMap<xminiJava.BooleanValue, minijava.semantics.BooleanValueAspectBooleanValueAspectProperties>();

  public Map<BooleanValue, BooleanValueAspectBooleanValueAspectProperties> getMap() {
    return map;
  }
}
