package arduino.semantics;

import arduino.IntegerConstant;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;

@Aspect(className = IntegerConstant.class)
@SuppressWarnings("all")
public class IntegerConstant_ExecutableAspect extends Expression_EvaluableAspect {
  @OverrideAspectMethod
  public static Object evaluate(final IntegerConstant _self) {
    final arduino.semantics.IntegerConstant_ExecutableAspectIntegerConstantAspectProperties _self_ = arduino.semantics.IntegerConstant_ExecutableAspectIntegerConstantAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Object evaluate()
    if (_self instanceof arduino.IntegerConstant){
    	result = arduino.semantics.IntegerConstant_ExecutableAspect._privk3_evaluate(_self_, (arduino.IntegerConstant)_self);
    };
    return (java.lang.Object)result;
  }

  private static Object super_evaluate(final IntegerConstant _self) {
    final arduino.semantics.Expression_EvaluableAspectExpressionAspectProperties _self_ = arduino.semantics.Expression_EvaluableAspectExpressionAspectContext.getSelf(_self);
    return  arduino.semantics.Expression_EvaluableAspect._privk3_evaluate(_self_, _self);
  }

  protected static Object _privk3_evaluate(final IntegerConstant_ExecutableAspectIntegerConstantAspectProperties _self_, final IntegerConstant _self) {
    return Integer.valueOf(_self.getValue());
  }
}
