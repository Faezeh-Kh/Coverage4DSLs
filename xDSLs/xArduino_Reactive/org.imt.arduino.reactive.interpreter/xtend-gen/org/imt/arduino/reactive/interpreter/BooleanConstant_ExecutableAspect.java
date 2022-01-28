package org.imt.arduino.reactive.interpreter;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.imt.arduino.reactive.arduino.BooleanConstant;

@Aspect(className = BooleanConstant.class)
@SuppressWarnings("all")
public class BooleanConstant_ExecutableAspect extends Expression_EvaluableAspect {
  @OverrideAspectMethod
  public static Object evaluate(final BooleanConstant _self) {
    final org.imt.arduino.reactive.interpreter.BooleanConstant_ExecutableAspectBooleanConstantAspectProperties _self_ = org.imt.arduino.reactive.interpreter.BooleanConstant_ExecutableAspectBooleanConstantAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Object evaluate()
    if (_self instanceof org.imt.arduino.reactive.arduino.BooleanConstant){
    	result = org.imt.arduino.reactive.interpreter.BooleanConstant_ExecutableAspect._privk3_evaluate(_self_, (org.imt.arduino.reactive.arduino.BooleanConstant)_self);
    };
    return (java.lang.Object)result;
  }
  
  private static Object super_evaluate(final BooleanConstant _self) {
    final org.imt.arduino.reactive.interpreter.Expression_EvaluableAspectExpressionAspectProperties _self_ = org.imt.arduino.reactive.interpreter.Expression_EvaluableAspectExpressionAspectContext.getSelf(_self);
    return  org.imt.arduino.reactive.interpreter.Expression_EvaluableAspect._privk3_evaluate(_self_, _self);
  }
  
  protected static Object _privk3_evaluate(final BooleanConstant_ExecutableAspectBooleanConstantAspectProperties _self_, final BooleanConstant _self) {
    return Boolean.valueOf(_self.isValue());
  }
}
