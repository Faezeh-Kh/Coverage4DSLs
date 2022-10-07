package org.imt.k3tdl.k3dsa;

import java.util.Map;
import org.etsi.mts.tdl.Assignment;

@SuppressWarnings("all")
public class AssignmentAspectAssignmentAspectContext {
  public static final AssignmentAspectAssignmentAspectContext INSTANCE = new AssignmentAspectAssignmentAspectContext();

  public static AssignmentAspectAssignmentAspectProperties getSelf(final Assignment _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.imt.k3tdl.k3dsa.AssignmentAspectAssignmentAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<Assignment, AssignmentAspectAssignmentAspectProperties> map = new java.util.WeakHashMap<org.etsi.mts.tdl.Assignment, org.imt.k3tdl.k3dsa.AssignmentAspectAssignmentAspectProperties>();

  public Map<Assignment, AssignmentAspectAssignmentAspectProperties> getMap() {
    return map;
  }
}
