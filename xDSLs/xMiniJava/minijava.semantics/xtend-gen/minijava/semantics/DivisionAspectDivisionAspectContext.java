package minijava.semantics;

import java.util.Map;
import xminiJava.Division;

@SuppressWarnings("all")
public class DivisionAspectDivisionAspectContext {
  public static final DivisionAspectDivisionAspectContext INSTANCE = new DivisionAspectDivisionAspectContext();

  public static DivisionAspectDivisionAspectProperties getSelf(final Division _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new minijava.semantics.DivisionAspectDivisionAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<Division, DivisionAspectDivisionAspectProperties> map = new java.util.WeakHashMap<xminiJava.Division, minijava.semantics.DivisionAspectDivisionAspectProperties>();

  public Map<Division, DivisionAspectDivisionAspectProperties> getMap() {
    return map;
  }
}
