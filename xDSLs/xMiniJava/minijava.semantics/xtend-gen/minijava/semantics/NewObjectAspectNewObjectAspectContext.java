package minijava.semantics;

import java.util.Map;
import xminiJava.NewObject;

@SuppressWarnings("all")
public class NewObjectAspectNewObjectAspectContext {
  public static final NewObjectAspectNewObjectAspectContext INSTANCE = new NewObjectAspectNewObjectAspectContext();

  public static NewObjectAspectNewObjectAspectProperties getSelf(final NewObject _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new minijava.semantics.NewObjectAspectNewObjectAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<NewObject, NewObjectAspectNewObjectAspectProperties> map = new java.util.WeakHashMap<xminiJava.NewObject, minijava.semantics.NewObjectAspectNewObjectAspectProperties>();

  public Map<NewObject, NewObjectAspectNewObjectAspectProperties> getMap() {
    return map;
  }
}
