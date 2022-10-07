package minijava.semantics;

import java.util.Map;
import xminiJava.ObjectRefValue;

@SuppressWarnings("all")
public class ObjectRefValueToStringAspectObjectRefValueAspectContext {
  public static final ObjectRefValueToStringAspectObjectRefValueAspectContext INSTANCE = new ObjectRefValueToStringAspectObjectRefValueAspectContext();

  public static ObjectRefValueToStringAspectObjectRefValueAspectProperties getSelf(final ObjectRefValue _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new minijava.semantics.ObjectRefValueToStringAspectObjectRefValueAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<ObjectRefValue, ObjectRefValueToStringAspectObjectRefValueAspectProperties> map = new java.util.WeakHashMap<xminiJava.ObjectRefValue, minijava.semantics.ObjectRefValueToStringAspectObjectRefValueAspectProperties>();

  public Map<ObjectRefValue, ObjectRefValueToStringAspectObjectRefValueAspectProperties> getMap() {
    return map;
  }
}
