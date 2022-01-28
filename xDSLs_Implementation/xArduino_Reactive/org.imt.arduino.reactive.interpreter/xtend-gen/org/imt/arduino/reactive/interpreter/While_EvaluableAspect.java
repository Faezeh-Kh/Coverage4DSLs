package org.imt.arduino.reactive.interpreter;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.imt.arduino.reactive.arduino.While;

@Aspect(className = While.class)
@SuppressWarnings("all")
public class While_EvaluableAspect extends Control_EvaluableAspect {
  @OverrideAspectMethod
  public static Boolean evaluate(final While _self) {
    final org.imt.arduino.reactive.interpreter.While_EvaluableAspectWhileAspectProperties _self_ = org.imt.arduino.reactive.interpreter.While_EvaluableAspectWhileAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Boolean evaluate()
    if (_self instanceof org.imt.arduino.reactive.arduino.While){
    	result = org.imt.arduino.reactive.interpreter.While_EvaluableAspect._privk3_evaluate(_self_, (org.imt.arduino.reactive.arduino.While)_self);
    };
    return (java.lang.Boolean)result;
  }
  
  private static Boolean super_evaluate(final While _self) {
    final org.imt.arduino.reactive.interpreter.Control_EvaluableAspectControlAspectProperties _self_ = org.imt.arduino.reactive.interpreter.Control_EvaluableAspectControlAspectContext.getSelf(_self);
    return  org.imt.arduino.reactive.interpreter.Control_EvaluableAspect._privk3_evaluate(_self_, _self);
  }
  
  protected static Boolean _privk3_evaluate(final While_EvaluableAspectWhileAspectProperties _self_, final While _self) {
    Object _evaluate = Expression_EvaluableAspect.evaluate(_self.getCondition());
    Boolean resCond = ((Boolean) _evaluate);
    return resCond;
  }
}
