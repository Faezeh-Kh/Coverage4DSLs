package org.imt.xminijava.interpreter;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.imt.minijava.xminiJava.ArrayAccess;
import org.imt.minijava.xminiJava.ArrayInstance;
import org.imt.minijava.xminiJava.ArrayRefValue;
import org.imt.minijava.xminiJava.IntegerValue;
import org.imt.minijava.xminiJava.State;
import org.imt.minijava.xminiJava.Value;

@Aspect(className = ArrayAccess.class)
@SuppressWarnings("all")
public class ArrayAccessAspect extends ExpressionAspect {
  @OverrideAspectMethod
  public static Value evaluateExpression(final ArrayAccess _self, final State state) {
    final org.imt.xminijava.interpreter.ArrayAccessAspectArrayAccessAspectProperties _self_ = org.imt.xminijava.interpreter.ArrayAccessAspectArrayAccessAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Value evaluateExpression(State)
    if (_self instanceof org.imt.minijava.xminiJava.ArrayAccess){
    	result = org.imt.xminijava.interpreter.ArrayAccessAspect._privk3_evaluateExpression(_self_, (org.imt.minijava.xminiJava.ArrayAccess)_self,state);
    };
    return (org.imt.minijava.xminiJava.Value)result;
  }
  
  private static Value super_evaluateExpression(final ArrayAccess _self, final State state) {
    final org.imt.xminijava.interpreter.ExpressionAspectExpressionAspectProperties _self_ = org.imt.xminijava.interpreter.ExpressionAspectExpressionAspectContext.getSelf(_self);
    return  org.imt.xminijava.interpreter.ExpressionAspect._privk3_evaluateExpression(_self_, _self,state);
  }
  
  protected static Value _privk3_evaluateExpression(final ArrayAccessAspectArrayAccessAspectProperties _self_, final ArrayAccess _self, final State state) {
    Value _evaluateExpression = ExpressionAspect.evaluateExpression(_self.getObject(), state);
    final ArrayInstance array = ((ArrayRefValue) _evaluateExpression).getInstance();
    Value _evaluateExpression_1 = ExpressionAspect.evaluateExpression(_self.getIndex(), state);
    final int index = ((IntegerValue) _evaluateExpression_1).getValue();
    return ValueAspect.copy(array.getValue().get(index));
  }
}
