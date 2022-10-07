package minijava.semantics;

import java.util.Map;
import xminiJava.Value;

@SuppressWarnings("all")
public class ValueAspectValueAspectContext {
  public static final ValueAspectValueAspectContext INSTANCE = new ValueAspectValueAspectContext();

  public static ValueAspectValueAspectProperties getSelf(final Value _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new minijava.semantics.ValueAspectValueAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<Value, ValueAspectValueAspectProperties> map = new java.util.WeakHashMap<xminiJava.Value, minijava.semantics.ValueAspectValueAspectProperties>();

  public Map<Value, ValueAspectValueAspectProperties> getMap() {
    return map;
  }
}
