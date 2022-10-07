package minijava.semantics;

import java.util.Map;
import xminiJava.Inferior;

@SuppressWarnings("all")
public class InferiorAspectInferiorAspectContext {
  public static final InferiorAspectInferiorAspectContext INSTANCE = new InferiorAspectInferiorAspectContext();

  public static InferiorAspectInferiorAspectProperties getSelf(final Inferior _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new minijava.semantics.InferiorAspectInferiorAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<Inferior, InferiorAspectInferiorAspectProperties> map = new java.util.WeakHashMap<xminiJava.Inferior, minijava.semantics.InferiorAspectInferiorAspectProperties>();

  public Map<Inferior, InferiorAspectInferiorAspectProperties> getMap() {
    return map;
  }
}
