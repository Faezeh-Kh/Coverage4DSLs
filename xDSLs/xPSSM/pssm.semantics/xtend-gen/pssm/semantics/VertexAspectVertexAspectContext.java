package pssm.semantics;

import java.util.Map;
import statemachines.Vertex;

@SuppressWarnings("all")
public class VertexAspectVertexAspectContext {
  public static final VertexAspectVertexAspectContext INSTANCE = new VertexAspectVertexAspectContext();

  public static VertexAspectVertexAspectProperties getSelf(final Vertex _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new pssm.semantics.VertexAspectVertexAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<Vertex, VertexAspectVertexAspectProperties> map = new java.util.WeakHashMap<statemachines.Vertex, pssm.semantics.VertexAspectVertexAspectProperties>();

  public Map<Vertex, VertexAspectVertexAspectProperties> getMap() {
    return map;
  }
}
