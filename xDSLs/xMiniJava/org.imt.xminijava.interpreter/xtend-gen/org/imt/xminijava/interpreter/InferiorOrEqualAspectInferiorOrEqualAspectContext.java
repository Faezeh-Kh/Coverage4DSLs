package org.imt.xminijava.interpreter;

import java.util.Map;
import org.imt.minijava.xminiJava.InferiorOrEqual;

@SuppressWarnings("all")
public class InferiorOrEqualAspectInferiorOrEqualAspectContext {
  public static final InferiorOrEqualAspectInferiorOrEqualAspectContext INSTANCE = new InferiorOrEqualAspectInferiorOrEqualAspectContext();
  
  public static InferiorOrEqualAspectInferiorOrEqualAspectProperties getSelf(final InferiorOrEqual _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.imt.xminijava.interpreter.InferiorOrEqualAspectInferiorOrEqualAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<InferiorOrEqual, InferiorOrEqualAspectInferiorOrEqualAspectProperties> map = new java.util.WeakHashMap<org.imt.minijava.xminiJava.InferiorOrEqual, org.imt.xminijava.interpreter.InferiorOrEqualAspectInferiorOrEqualAspectProperties>();
  
  public Map<InferiorOrEqual, InferiorOrEqualAspectInferiorOrEqualAspectProperties> getMap() {
    return map;
  }
}
