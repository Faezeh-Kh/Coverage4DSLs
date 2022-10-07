package minijava.semantics;

import java.util.Map;
import xminiJava.Multiplication;

@SuppressWarnings("all")
public class MultiplicationAspectMultiplicationAspectContext {
  public static final MultiplicationAspectMultiplicationAspectContext INSTANCE = new MultiplicationAspectMultiplicationAspectContext();

  public static MultiplicationAspectMultiplicationAspectProperties getSelf(final Multiplication _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new minijava.semantics.MultiplicationAspectMultiplicationAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<Multiplication, MultiplicationAspectMultiplicationAspectProperties> map = new java.util.WeakHashMap<xminiJava.Multiplication, minijava.semantics.MultiplicationAspectMultiplicationAspectProperties>();

  public Map<Multiplication, MultiplicationAspectMultiplicationAspectProperties> getMap() {
    return map;
  }
}
