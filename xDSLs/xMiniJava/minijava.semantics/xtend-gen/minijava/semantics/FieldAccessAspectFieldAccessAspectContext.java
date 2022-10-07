package minijava.semantics;

import java.util.Map;
import xminiJava.FieldAccess;

@SuppressWarnings("all")
public class FieldAccessAspectFieldAccessAspectContext {
  public static final FieldAccessAspectFieldAccessAspectContext INSTANCE = new FieldAccessAspectFieldAccessAspectContext();

  public static FieldAccessAspectFieldAccessAspectProperties getSelf(final FieldAccess _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new minijava.semantics.FieldAccessAspectFieldAccessAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<FieldAccess, FieldAccessAspectFieldAccessAspectProperties> map = new java.util.WeakHashMap<xminiJava.FieldAccess, minijava.semantics.FieldAccessAspectFieldAccessAspectProperties>();

  public Map<FieldAccess, FieldAccessAspectFieldAccessAspectProperties> getMap() {
    return map;
  }
}
