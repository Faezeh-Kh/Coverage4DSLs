package org.imt.xminijava.interpreter;

import java.util.Map;
import org.imt.minijava.xminiJava.IfStatement;

@SuppressWarnings("all")
public class IfStatementAspectIfStatementAspectContext {
  public static final IfStatementAspectIfStatementAspectContext INSTANCE = new IfStatementAspectIfStatementAspectContext();
  
  public static IfStatementAspectIfStatementAspectProperties getSelf(final IfStatement _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.imt.xminijava.interpreter.IfStatementAspectIfStatementAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<IfStatement, IfStatementAspectIfStatementAspectProperties> map = new java.util.WeakHashMap<org.imt.minijava.xminiJava.IfStatement, org.imt.xminijava.interpreter.IfStatementAspectIfStatementAspectProperties>();
  
  public Map<IfStatement, IfStatementAspectIfStatementAspectProperties> getMap() {
    return map;
  }
}
