package org.imt.arduino.reactive.interpreter;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.imt.arduino.reactive.arduino.IntegerConstant;

@Aspect(className = IntegerConstant.class)
@SuppressWarnings("all")
public class IntegerConstant_ExecutableAspect extends Expression_EvaluableAspect {
  @OverrideAspectMethod
  public static Object evaluate(final IntegerConstant _self) {
    final org.imt.arduino.reactive.interpreter.IntegerConstant_ExecutableAspectIntegerConstantAspectProperties _self_ = org.imt.arduino.reactive.interpreter.IntegerConstant_ExecutableAspectIntegerConstantAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Object evaluate()
    if (_self instanceof org.imt.arduino.reactive.arduino.IntegerConstant){
    	result = org.imt.arduino.reactive.interpreter.IntegerConstant_ExecutableAspect._privk3_evaluate(_self_, (org.imt.arduino.reactive.arduino.IntegerConstant)_self);
    };
    return (java.lang.Object)result;
  }
  
  private static Object super_evaluate(final IntegerConstant _self) {
    final org.imt.arduino.reactive.interpreter.Expression_EvaluableAspectExpressionAspectProperties _self_ = org.imt.arduino.reactive.interpreter.Expression_EvaluableAspectExpressionAspectContext.getSelf(_self);
    return  org.imt.arduino.reactive.interpreter.Expression_EvaluableAspect._privk3_evaluate(_self_, _self);
  }
  
  protected static Object _privk3_evaluate(final IntegerConstant_ExecutableAspectIntegerConstantAspectProperties _self_, final IntegerConstant _self) {
    return Integer.valueOf(_self.getValue());
  }
}
