package minijava.semantics;

import java.util.Map;
import xminiJava.InferiorOrEqual;

@SuppressWarnings("all")
public class InferiorOrEqualAspectInferiorOrEqualAspectContext {
  public static final InferiorOrEqualAspectInferiorOrEqualAspectContext INSTANCE = new InferiorOrEqualAspectInferiorOrEqualAspectContext();

  public static InferiorOrEqualAspectInferiorOrEqualAspectProperties getSelf(final InferiorOrEqual _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new minijava.semantics.InferiorOrEqualAspectInferiorOrEqualAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<InferiorOrEqual, InferiorOrEqualAspectInferiorOrEqualAspectProperties> map = new java.util.WeakHashMap<xminiJava.InferiorOrEqual, minijava.semantics.InferiorOrEqualAspectInferiorOrEqualAspectProperties>();

  public Map<InferiorOrEqual, InferiorOrEqualAspectInferiorOrEqualAspectProperties> getMap() {
    return map;
  }
}
