package org.imt.k3tdl.k3dsa;

import java.util.Map;
import org.etsi.mts.tdl.Member;

@SuppressWarnings("all")
public class MemberAspectMemberAspectContext {
  public static final MemberAspectMemberAspectContext INSTANCE = new MemberAspectMemberAspectContext();

  public static MemberAspectMemberAspectProperties getSelf(final Member _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.imt.k3tdl.k3dsa.MemberAspectMemberAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<Member, MemberAspectMemberAspectProperties> map = new java.util.WeakHashMap<org.etsi.mts.tdl.Member, org.imt.k3tdl.k3dsa.MemberAspectMemberAspectProperties>();

  public Map<Member, MemberAspectMemberAspectProperties> getMap() {
    return map;
  }
}
