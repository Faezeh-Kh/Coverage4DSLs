package minijava.semantics;

import java.util.Map;
import xminiJava.Inequality;

@SuppressWarnings("all")
public class InequalityAspectInequalityAspectContext {
  public static final InequalityAspectInequalityAspectContext INSTANCE = new InequalityAspectInequalityAspectContext();

  public static InequalityAspectInequalityAspectProperties getSelf(final Inequality _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new minijava.semantics.InequalityAspectInequalityAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<Inequality, InequalityAspectInequalityAspectProperties> map = new java.util.WeakHashMap<xminiJava.Inequality, minijava.semantics.InequalityAspectInequalityAspectProperties>();

  public Map<Inequality, InequalityAspectInequalityAspectProperties> getMap() {
    return map;
  }
}
