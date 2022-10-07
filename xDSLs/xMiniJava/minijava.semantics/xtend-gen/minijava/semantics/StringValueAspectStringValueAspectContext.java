package minijava.semantics;

import java.util.Map;
import xminiJava.StringValue;

@SuppressWarnings("all")
public class StringValueAspectStringValueAspectContext {
  public static final StringValueAspectStringValueAspectContext INSTANCE = new StringValueAspectStringValueAspectContext();

  public static StringValueAspectStringValueAspectProperties getSelf(final StringValue _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new minijava.semantics.StringValueAspectStringValueAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<StringValue, StringValueAspectStringValueAspectProperties> map = new java.util.WeakHashMap<xminiJava.StringValue, minijava.semantics.StringValueAspectStringValueAspectProperties>();

  public Map<StringValue, StringValueAspectStringValueAspectProperties> getMap() {
    return map;
  }
}
