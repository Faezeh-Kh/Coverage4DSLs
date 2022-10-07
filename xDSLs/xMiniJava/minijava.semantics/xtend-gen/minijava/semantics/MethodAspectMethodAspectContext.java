package minijava.semantics;

import java.util.Map;
import xminiJava.Method;

@SuppressWarnings("all")
public class MethodAspectMethodAspectContext {
  public static final MethodAspectMethodAspectContext INSTANCE = new MethodAspectMethodAspectContext();

  public static MethodAspectMethodAspectProperties getSelf(final Method _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new minijava.semantics.MethodAspectMethodAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<Method, MethodAspectMethodAspectProperties> map = new java.util.WeakHashMap<xminiJava.Method, minijava.semantics.MethodAspectMethodAspectProperties>();

  public Map<Method, MethodAspectMethodAspectProperties> getMap() {
    return map;
  }
}
