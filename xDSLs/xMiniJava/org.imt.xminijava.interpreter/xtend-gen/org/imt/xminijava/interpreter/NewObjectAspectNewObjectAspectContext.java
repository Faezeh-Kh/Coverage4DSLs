package org.imt.xminijava.interpreter;

import java.util.Map;
import org.imt.minijava.xminiJava.NewObject;

@SuppressWarnings("all")
public class NewObjectAspectNewObjectAspectContext {
  public static final NewObjectAspectNewObjectAspectContext INSTANCE = new NewObjectAspectNewObjectAspectContext();
  
  public static NewObjectAspectNewObjectAspectProperties getSelf(final NewObject _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.imt.xminijava.interpreter.NewObjectAspectNewObjectAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<NewObject, NewObjectAspectNewObjectAspectProperties> map = new java.util.WeakHashMap<org.imt.minijava.xminiJava.NewObject, org.imt.xminijava.interpreter.NewObjectAspectNewObjectAspectProperties>();
  
  public Map<NewObject, NewObjectAspectNewObjectAspectProperties> getMap() {
    return map;
  }
}
