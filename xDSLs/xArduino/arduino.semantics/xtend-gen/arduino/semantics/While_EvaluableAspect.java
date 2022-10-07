package arduino.semantics;

import arduino.While;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;

@Aspect(className = While.class)
@SuppressWarnings("all")
public class While_EvaluableAspect extends Control_EvaluableAspect {
  @OverrideAspectMethod
  public static Boolean evaluate(final While _self) {
    final arduino.semantics.While_EvaluableAspectWhileAspectProperties _self_ = arduino.semantics.While_EvaluableAspectWhileAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Boolean evaluate()
    if (_self instanceof arduino.While){
    	result = arduino.semantics.While_EvaluableAspect._privk3_evaluate(_self_, (arduino.While)_self);
    };
    return (java.lang.Boolean)result;
  }

  private static Boolean super_evaluate(final While _self) {
    final arduino.semantics.Control_EvaluableAspectControlAspectProperties _self_ = arduino.semantics.Control_EvaluableAspectControlAspectContext.getSelf(_self);
    return  arduino.semantics.Control_EvaluableAspect._privk3_evaluate(_self_, _self);
  }

  protected static Boolean _privk3_evaluate(final While_EvaluableAspectWhileAspectProperties _self_, final While _self) {
    Object _evaluate = Expression_EvaluableAspect.evaluate(_self.getCondition());
    Boolean resCond = ((Boolean) _evaluate);
    return resCond;
  }
}
