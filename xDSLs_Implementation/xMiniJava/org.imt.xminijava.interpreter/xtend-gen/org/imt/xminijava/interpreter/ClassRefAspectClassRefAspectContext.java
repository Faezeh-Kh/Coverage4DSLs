package org.imt.xminijava.interpreter;

import java.util.Map;
import org.imt.minijava.xminiJava.ClassRef;

@SuppressWarnings("all")
public class ClassRefAspectClassRefAspectContext {
  public static final ClassRefAspectClassRefAspectContext INSTANCE = new ClassRefAspectClassRefAspectContext();
  
  public static ClassRefAspectClassRefAspectProperties getSelf(final ClassRef _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.imt.xminijava.interpreter.ClassRefAspectClassRefAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<ClassRef, ClassRefAspectClassRefAspectProperties> map = new java.util.WeakHashMap<org.imt.minijava.xminiJava.ClassRef, org.imt.xminijava.interpreter.ClassRefAspectClassRefAspectProperties>();
  
  public Map<ClassRef, ClassRefAspectClassRefAspectProperties> getMap() {
    return map;
  }
}
