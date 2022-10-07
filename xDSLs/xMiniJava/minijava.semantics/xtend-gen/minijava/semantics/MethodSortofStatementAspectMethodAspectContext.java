package minijava.semantics;

import java.util.Map;
import xminiJava.Method;

@SuppressWarnings("all")
public class MethodSortofStatementAspectMethodAspectContext {
  public static final MethodSortofStatementAspectMethodAspectContext INSTANCE = new MethodSortofStatementAspectMethodAspectContext();

  public static MethodSortofStatementAspectMethodAspectProperties getSelf(final Method _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new minijava.semantics.MethodSortofStatementAspectMethodAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<Method, MethodSortofStatementAspectMethodAspectProperties> map = new java.util.WeakHashMap<xminiJava.Method, minijava.semantics.MethodSortofStatementAspectMethodAspectProperties>();

  public Map<Method, MethodSortofStatementAspectMethodAspectProperties> getMap() {
    return map;
  }
}
