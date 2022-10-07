package minijava.semantics;

import java.util.Map;
import xminiJava.Context;

@SuppressWarnings("all")
public class ContextAspectContextAspectContext {
  public static final ContextAspectContextAspectContext INSTANCE = new ContextAspectContextAspectContext();

  public static ContextAspectContextAspectProperties getSelf(final Context _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new minijava.semantics.ContextAspectContextAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<Context, ContextAspectContextAspectProperties> map = new java.util.WeakHashMap<xminiJava.Context, minijava.semantics.ContextAspectContextAspectProperties>();

  public Map<Context, ContextAspectContextAspectProperties> getMap() {
    return map;
  }
}
