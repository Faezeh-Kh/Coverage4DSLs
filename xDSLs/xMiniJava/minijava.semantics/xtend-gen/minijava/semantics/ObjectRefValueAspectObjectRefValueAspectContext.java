package minijava.semantics;

import java.util.Map;
import xminiJava.ObjectRefValue;

@SuppressWarnings("all")
public class ObjectRefValueAspectObjectRefValueAspectContext {
  public static final ObjectRefValueAspectObjectRefValueAspectContext INSTANCE = new ObjectRefValueAspectObjectRefValueAspectContext();

  public static ObjectRefValueAspectObjectRefValueAspectProperties getSelf(final ObjectRefValue _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new minijava.semantics.ObjectRefValueAspectObjectRefValueAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<ObjectRefValue, ObjectRefValueAspectObjectRefValueAspectProperties> map = new java.util.WeakHashMap<xminiJava.ObjectRefValue, minijava.semantics.ObjectRefValueAspectObjectRefValueAspectProperties>();

  public Map<ObjectRefValue, ObjectRefValueAspectObjectRefValueAspectProperties> getMap() {
    return map;
  }
}
