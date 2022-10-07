package minijava.semantics;

import java.util.Map;
import xminiJava.NewArray;

@SuppressWarnings("all")
public class NewArrayAspectNewArrayAspectContext {
  public static final NewArrayAspectNewArrayAspectContext INSTANCE = new NewArrayAspectNewArrayAspectContext();

  public static NewArrayAspectNewArrayAspectProperties getSelf(final NewArray _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new minijava.semantics.NewArrayAspectNewArrayAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<NewArray, NewArrayAspectNewArrayAspectProperties> map = new java.util.WeakHashMap<xminiJava.NewArray, minijava.semantics.NewArrayAspectNewArrayAspectProperties>();

  public Map<NewArray, NewArrayAspectNewArrayAspectProperties> getMap() {
    return map;
  }
}
