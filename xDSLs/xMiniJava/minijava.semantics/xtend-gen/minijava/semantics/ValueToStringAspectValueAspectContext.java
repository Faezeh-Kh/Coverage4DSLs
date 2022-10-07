package minijava.semantics;

import java.util.Map;
import xminiJava.Value;

@SuppressWarnings("all")
public class ValueToStringAspectValueAspectContext {
  public static final ValueToStringAspectValueAspectContext INSTANCE = new ValueToStringAspectValueAspectContext();

  public static ValueToStringAspectValueAspectProperties getSelf(final Value _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new minijava.semantics.ValueToStringAspectValueAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<Value, ValueToStringAspectValueAspectProperties> map = new java.util.WeakHashMap<xminiJava.Value, minijava.semantics.ValueToStringAspectValueAspectProperties>();

  public Map<Value, ValueToStringAspectValueAspectProperties> getMap() {
    return map;
  }
}
