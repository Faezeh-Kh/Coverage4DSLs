package minijava.semantics;

import java.util.Map;
import xminiJava.StringValue;

@SuppressWarnings("all")
public class StringValueToStringAspectStringValueAspectContext {
  public static final StringValueToStringAspectStringValueAspectContext INSTANCE = new StringValueToStringAspectStringValueAspectContext();

  public static StringValueToStringAspectStringValueAspectProperties getSelf(final StringValue _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new minijava.semantics.StringValueToStringAspectStringValueAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<StringValue, StringValueToStringAspectStringValueAspectProperties> map = new java.util.WeakHashMap<xminiJava.StringValue, minijava.semantics.StringValueToStringAspectStringValueAspectProperties>();

  public Map<StringValue, StringValueToStringAspectStringValueAspectProperties> getMap() {
    return map;
  }
}
