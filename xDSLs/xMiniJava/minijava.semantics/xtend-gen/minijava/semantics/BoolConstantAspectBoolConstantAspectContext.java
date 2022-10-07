package minijava.semantics;

import java.util.Map;
import xminiJava.BoolConstant;

@SuppressWarnings("all")
public class BoolConstantAspectBoolConstantAspectContext {
  public static final BoolConstantAspectBoolConstantAspectContext INSTANCE = new BoolConstantAspectBoolConstantAspectContext();

  public static BoolConstantAspectBoolConstantAspectProperties getSelf(final BoolConstant _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new minijava.semantics.BoolConstantAspectBoolConstantAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<BoolConstant, BoolConstantAspectBoolConstantAspectProperties> map = new java.util.WeakHashMap<xminiJava.BoolConstant, minijava.semantics.BoolConstantAspectBoolConstantAspectProperties>();

  public Map<BoolConstant, BoolConstantAspectBoolConstantAspectProperties> getMap() {
    return map;
  }
}
