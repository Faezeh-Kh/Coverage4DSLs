package org.imt.k3tdl.k3dsa;

import java.util.Map;
import org.etsi.mts.tdl.Quiescence;

@SuppressWarnings("all")
public class QuiescenceAspectQuiescenceAspectContext {
  public static final QuiescenceAspectQuiescenceAspectContext INSTANCE = new QuiescenceAspectQuiescenceAspectContext();

  public static QuiescenceAspectQuiescenceAspectProperties getSelf(final Quiescence _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.imt.k3tdl.k3dsa.QuiescenceAspectQuiescenceAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<Quiescence, QuiescenceAspectQuiescenceAspectProperties> map = new java.util.WeakHashMap<org.etsi.mts.tdl.Quiescence, org.imt.k3tdl.k3dsa.QuiescenceAspectQuiescenceAspectProperties>();

  public Map<Quiescence, QuiescenceAspectQuiescenceAspectProperties> getMap() {
    return map;
  }
}
