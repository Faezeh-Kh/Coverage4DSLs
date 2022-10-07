package minijava.semantics;

import java.util.Map;
import xminiJava.Return;

@SuppressWarnings("all")
public class ReturnAspectReturnAspectContext {
  public static final ReturnAspectReturnAspectContext INSTANCE = new ReturnAspectReturnAspectContext();

  public static ReturnAspectReturnAspectProperties getSelf(final Return _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new minijava.semantics.ReturnAspectReturnAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<Return, ReturnAspectReturnAspectProperties> map = new java.util.WeakHashMap<xminiJava.Return, minijava.semantics.ReturnAspectReturnAspectProperties>();

  public Map<Return, ReturnAspectReturnAspectProperties> getMap() {
    return map;
  }
}
