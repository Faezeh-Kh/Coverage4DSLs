package minijava.semantics;

import java.util.Map;
import xminiJava.IntConstant;

@SuppressWarnings("all")
public class IntConstantAspectIntConstantAspectContext {
  public static final IntConstantAspectIntConstantAspectContext INSTANCE = new IntConstantAspectIntConstantAspectContext();

  public static IntConstantAspectIntConstantAspectProperties getSelf(final IntConstant _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new minijava.semantics.IntConstantAspectIntConstantAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<IntConstant, IntConstantAspectIntConstantAspectProperties> map = new java.util.WeakHashMap<xminiJava.IntConstant, minijava.semantics.IntConstantAspectIntConstantAspectProperties>();

  public Map<IntConstant, IntConstantAspectIntConstantAspectProperties> getMap() {
    return map;
  }
}
