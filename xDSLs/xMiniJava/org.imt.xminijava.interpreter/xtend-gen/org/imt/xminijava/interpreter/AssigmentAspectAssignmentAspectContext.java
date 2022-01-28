package org.imt.xminijava.interpreter;

import java.util.Map;
import org.imt.minijava.xminiJava.Assignment;

@SuppressWarnings("all")
public class AssigmentAspectAssignmentAspectContext {
  public static final AssigmentAspectAssignmentAspectContext INSTANCE = new AssigmentAspectAssignmentAspectContext();
  
  public static AssigmentAspectAssignmentAspectProperties getSelf(final Assignment _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.imt.xminijava.interpreter.AssigmentAspectAssignmentAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Assignment, AssigmentAspectAssignmentAspectProperties> map = new java.util.WeakHashMap<org.imt.minijava.xminiJava.Assignment, org.imt.xminijava.interpreter.AssigmentAspectAssignmentAspectProperties>();
  
  public Map<Assignment, AssigmentAspectAssignmentAspectProperties> getMap() {
    return map;
  }
}
