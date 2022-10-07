package minijava.semantics;

import java.util.Map;
import xminiJava.Assignment;

@SuppressWarnings("all")
public class AssigmentAspectAssignmentAspectContext {
  public static final AssigmentAspectAssignmentAspectContext INSTANCE = new AssigmentAspectAssignmentAspectContext();

  public static AssigmentAspectAssignmentAspectProperties getSelf(final Assignment _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new minijava.semantics.AssigmentAspectAssignmentAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<Assignment, AssigmentAspectAssignmentAspectProperties> map = new java.util.WeakHashMap<xminiJava.Assignment, minijava.semantics.AssigmentAspectAssignmentAspectProperties>();

  public Map<Assignment, AssigmentAspectAssignmentAspectProperties> getMap() {
    return map;
  }
}
