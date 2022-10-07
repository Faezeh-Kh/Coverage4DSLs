package org.imt.k3tdl.k3dsa;

import java.util.Map;
import org.etsi.mts.tdl.MemberAssignment;

@SuppressWarnings("all")
public class MemberAssignmentAspectMemberAssignmentAspectContext {
  public static final MemberAssignmentAspectMemberAssignmentAspectContext INSTANCE = new MemberAssignmentAspectMemberAssignmentAspectContext();

  public static MemberAssignmentAspectMemberAssignmentAspectProperties getSelf(final MemberAssignment _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.imt.k3tdl.k3dsa.MemberAssignmentAspectMemberAssignmentAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<MemberAssignment, MemberAssignmentAspectMemberAssignmentAspectProperties> map = new java.util.WeakHashMap<org.etsi.mts.tdl.MemberAssignment, org.imt.k3tdl.k3dsa.MemberAssignmentAspectMemberAssignmentAspectProperties>();

  public Map<MemberAssignment, MemberAssignmentAspectMemberAssignmentAspectProperties> getMap() {
    return map;
  }
}
