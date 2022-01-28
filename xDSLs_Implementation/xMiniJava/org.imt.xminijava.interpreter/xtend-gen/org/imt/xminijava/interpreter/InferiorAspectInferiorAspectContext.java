package org.imt.xminijava.interpreter;

import java.util.Map;
import org.imt.minijava.xminiJava.Inferior;

@SuppressWarnings("all")
public class InferiorAspectInferiorAspectContext {
  public static final InferiorAspectInferiorAspectContext INSTANCE = new InferiorAspectInferiorAspectContext();
  
  public static InferiorAspectInferiorAspectProperties getSelf(final Inferior _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.imt.xminijava.interpreter.InferiorAspectInferiorAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Inferior, InferiorAspectInferiorAspectProperties> map = new java.util.WeakHashMap<org.imt.minijava.xminiJava.Inferior, org.imt.xminijava.interpreter.InferiorAspectInferiorAspectProperties>();
  
  public Map<Inferior, InferiorAspectInferiorAspectProperties> getMap() {
    return map;
  }
}
