package minijava.semantics;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import xminiJava.ArrayAccess;
import xminiJava.ArrayInstance;
import xminiJava.ArrayRefValue;
import xminiJava.IntegerValue;
import xminiJava.State;
import xminiJava.Value;

@Aspect(className = ArrayAccess.class)
@SuppressWarnings("all")
public class ArrayAccessAspect extends ExpressionAspect {
  @OverrideAspectMethod
  public static Value evaluateExpression(final ArrayAccess _self, final State state) {
    final minijava.semantics.ArrayAccessAspectArrayAccessAspectProperties _self_ = minijava.semantics.ArrayAccessAspectArrayAccessAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Value evaluateExpression(State)
    if (_self instanceof xminiJava.ArrayAccess){
    	result = minijava.semantics.ArrayAccessAspect._privk3_evaluateExpression(_self_, (xminiJava.ArrayAccess)_self,state);
    };
    return (xminiJava.Value)result;
  }

  private static Value super_evaluateExpression(final ArrayAccess _self, final State state) {
    final minijava.semantics.ExpressionAspectExpressionAspectProperties _self_ = minijava.semantics.ExpressionAspectExpressionAspectContext.getSelf(_self);
    return  minijava.semantics.ExpressionAspect._privk3_evaluateExpression(_self_, _self,state);
  }

  protected static Value _privk3_evaluateExpression(final ArrayAccessAspectArrayAccessAspectProperties _self_, final ArrayAccess _self, final State state) {
    Value _evaluateExpression = ExpressionAspect.evaluateExpression(_self.getObject(), state);
    final ArrayInstance array = ((ArrayRefValue) _evaluateExpression).getInstance();
    Value _evaluateExpression_1 = ExpressionAspect.evaluateExpression(_self.getIndex(), state);
    final int index = ((IntegerValue) _evaluateExpression_1).getValue();
    return ValueAspect.copy(array.getValue().get(index));
  }
}
