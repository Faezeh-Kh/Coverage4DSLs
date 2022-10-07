package minijava.semantics;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import xminiJava.Null;
import xminiJava.State;
import xminiJava.Value;
import xminiJava.XminiJavaFactory;

@Aspect(className = Null.class)
@SuppressWarnings("all")
public class NullAspect extends ExpressionAspect {
  @OverrideAspectMethod
  public static Value evaluateExpression(final Null _self, final State state) {
    final minijava.semantics.NullAspectNullAspectProperties _self_ = minijava.semantics.NullAspectNullAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Value evaluateExpression(State)
    if (_self instanceof xminiJava.Null){
    	result = minijava.semantics.NullAspect._privk3_evaluateExpression(_self_, (xminiJava.Null)_self,state);
    };
    return (xminiJava.Value)result;
  }

  private static Value super_evaluateExpression(final Null _self, final State state) {
    final minijava.semantics.ExpressionAspectExpressionAspectProperties _self_ = minijava.semantics.ExpressionAspectExpressionAspectContext.getSelf(_self);
    return  minijava.semantics.ExpressionAspect._privk3_evaluateExpression(_self_, _self,state);
  }

  protected static Value _privk3_evaluateExpression(final NullAspectNullAspectProperties _self_, final Null _self, final State state) {
    return XminiJavaFactory.eINSTANCE.createNullValue();
  }
}
