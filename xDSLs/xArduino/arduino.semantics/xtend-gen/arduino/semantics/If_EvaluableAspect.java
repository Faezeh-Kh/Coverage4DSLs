package arduino.semantics;

import arduino.BooleanExpression;
import arduino.If;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;

@Aspect(className = If.class)
@SuppressWarnings("all")
public class If_EvaluableAspect extends Control_EvaluableAspect {
  @OverrideAspectMethod
  public static Boolean evaluate(final If _self) {
    final arduino.semantics.If_EvaluableAspectIfAspectProperties _self_ = arduino.semantics.If_EvaluableAspectIfAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Boolean evaluate()
    if (_self instanceof arduino.If){
    	result = arduino.semantics.If_EvaluableAspect._privk3_evaluate(_self_, (arduino.If)_self);
    };
    return (java.lang.Boolean)result;
  }

  private static Boolean super_evaluate(final If _self) {
    final arduino.semantics.Control_EvaluableAspectControlAspectProperties _self_ = arduino.semantics.Control_EvaluableAspectControlAspectContext.getSelf(_self);
    return  arduino.semantics.Control_EvaluableAspect._privk3_evaluate(_self_, _self);
  }

  protected static Boolean _privk3_evaluate(final If_EvaluableAspectIfAspectProperties _self_, final If _self) {
    Boolean resCond = Boolean.valueOf(false);
    BooleanExpression _condition = _self.getCondition();
    if ((_condition instanceof BooleanExpression)) {
      Object _evaluate = Expression_EvaluableAspect.evaluate(_self.getCondition());
      resCond = ((Boolean) _evaluate);
    }
    return resCond;
  }
}
