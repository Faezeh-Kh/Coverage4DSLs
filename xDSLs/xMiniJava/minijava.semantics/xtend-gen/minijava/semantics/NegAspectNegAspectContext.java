package minijava.semantics;

import java.util.Map;
import xminiJava.Neg;

@SuppressWarnings("all")
public class NegAspectNegAspectContext {
  public static final NegAspectNegAspectContext INSTANCE = new NegAspectNegAspectContext();

  public static NegAspectNegAspectProperties getSelf(final Neg _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new minijava.semantics.NegAspectNegAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<Neg, NegAspectNegAspectProperties> map = new java.util.WeakHashMap<xminiJava.Neg, minijava.semantics.NegAspectNegAspectProperties>();

  public Map<Neg, NegAspectNegAspectProperties> getMap() {
    return map;
  }
}
