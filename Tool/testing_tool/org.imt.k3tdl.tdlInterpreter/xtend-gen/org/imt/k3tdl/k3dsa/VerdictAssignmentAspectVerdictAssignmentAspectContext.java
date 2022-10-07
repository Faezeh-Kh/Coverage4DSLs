package org.imt.k3tdl.k3dsa;

import java.util.Map;
import org.etsi.mts.tdl.VerdictAssignment;

@SuppressWarnings("all")
public class VerdictAssignmentAspectVerdictAssignmentAspectContext {
  public static final VerdictAssignmentAspectVerdictAssignmentAspectContext INSTANCE = new VerdictAssignmentAspectVerdictAssignmentAspectContext();

  public static VerdictAssignmentAspectVerdictAssignmentAspectProperties getSelf(final VerdictAssignment _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.imt.k3tdl.k3dsa.VerdictAssignmentAspectVerdictAssignmentAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<VerdictAssignment, VerdictAssignmentAspectVerdictAssignmentAspectProperties> map = new java.util.WeakHashMap<org.etsi.mts.tdl.VerdictAssignment, org.imt.k3tdl.k3dsa.VerdictAssignmentAspectVerdictAssignmentAspectProperties>();

  public Map<VerdictAssignment, VerdictAssignmentAspectVerdictAssignmentAspectProperties> getMap() {
    return map;
  }
}
