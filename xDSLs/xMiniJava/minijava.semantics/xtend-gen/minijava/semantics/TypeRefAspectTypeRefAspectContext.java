package minijava.semantics;

import java.util.Map;
import xminiJava.TypeRef;

@SuppressWarnings("all")
public class TypeRefAspectTypeRefAspectContext {
  public static final TypeRefAspectTypeRefAspectContext INSTANCE = new TypeRefAspectTypeRefAspectContext();

  public static TypeRefAspectTypeRefAspectProperties getSelf(final TypeRef _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new minijava.semantics.TypeRefAspectTypeRefAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<TypeRef, TypeRefAspectTypeRefAspectProperties> map = new java.util.WeakHashMap<xminiJava.TypeRef, minijava.semantics.TypeRefAspectTypeRefAspectProperties>();

  public Map<TypeRef, TypeRefAspectTypeRefAspectProperties> getMap() {
    return map;
  }
}
