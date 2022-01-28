package org.imt.xminijava.interpreter;

import java.util.Map;
import org.imt.minijava.xminiJava.ForStatement;

@SuppressWarnings("all")
public class ForStatementAspectForStatementAspectContext {
  public static final ForStatementAspectForStatementAspectContext INSTANCE = new ForStatementAspectForStatementAspectContext();
  
  public static ForStatementAspectForStatementAspectProperties getSelf(final ForStatement _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.imt.xminijava.interpreter.ForStatementAspectForStatementAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<ForStatement, ForStatementAspectForStatementAspectProperties> map = new java.util.WeakHashMap<org.imt.minijava.xminiJava.ForStatement, org.imt.xminijava.interpreter.ForStatementAspectForStatementAspectProperties>();
  
  public Map<ForStatement, ForStatementAspectForStatementAspectProperties> getMap() {
    return map;
  }
}
