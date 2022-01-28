package org.imt.xminijava.interpreter;

import java.util.Map;
import org.imt.minijava.xminiJava.TypeRef;

@SuppressWarnings("all")
public class TypeRefAspectTypeRefAspectContext {
  public static final TypeRefAspectTypeRefAspectContext INSTANCE = new TypeRefAspectTypeRefAspectContext();
  
  public static TypeRefAspectTypeRefAspectProperties getSelf(final TypeRef _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.imt.xminijava.interpreter.TypeRefAspectTypeRefAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<TypeRef, TypeRefAspectTypeRefAspectProperties> map = new java.util.WeakHashMap<org.imt.minijava.xminiJava.TypeRef, org.imt.xminijava.interpreter.TypeRefAspectTypeRefAspectProperties>();
  
  public Map<TypeRef, TypeRefAspectTypeRefAspectProperties> getMap() {
    return map;
  }
}
