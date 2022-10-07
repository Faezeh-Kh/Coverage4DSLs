package minijava.semantics;

import java.util.Map;
import xminiJava.ClassRef;

@SuppressWarnings("all")
public class ClassRefAspectClassRefAspectContext {
  public static final ClassRefAspectClassRefAspectContext INSTANCE = new ClassRefAspectClassRefAspectContext();

  public static ClassRefAspectClassRefAspectProperties getSelf(final ClassRef _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new minijava.semantics.ClassRefAspectClassRefAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<ClassRef, ClassRefAspectClassRefAspectProperties> map = new java.util.WeakHashMap<xminiJava.ClassRef, minijava.semantics.ClassRefAspectClassRefAspectProperties>();

  public Map<ClassRef, ClassRefAspectClassRefAspectProperties> getMap() {
    return map;
  }
}
