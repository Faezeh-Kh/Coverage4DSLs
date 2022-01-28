package org.imt.pssm.reactive.interpreter;

import java.util.Map;
import org.imt.pssm.reactive.model.statemachines.Vertex;

@SuppressWarnings("all")
public class VertexAspectVertexAspectContext {
  public static final VertexAspectVertexAspectContext INSTANCE = new VertexAspectVertexAspectContext();
  
  public static VertexAspectVertexAspectProperties getSelf(final Vertex _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.imt.pssm.reactive.interpreter.VertexAspectVertexAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Vertex, VertexAspectVertexAspectProperties> map = new java.util.WeakHashMap<org.imt.pssm.reactive.model.statemachines.Vertex, org.imt.pssm.reactive.interpreter.VertexAspectVertexAspectProperties>();
  
  public Map<Vertex, VertexAspectVertexAspectProperties> getMap() {
    return map;
  }
}
