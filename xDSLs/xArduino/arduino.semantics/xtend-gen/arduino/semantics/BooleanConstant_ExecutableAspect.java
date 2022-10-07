package arduino.semantics;

import arduino.BooleanConstant;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;

@Aspect(className = BooleanConstant.class)
@SuppressWarnings("all")
public class BooleanConstant_ExecutableAspect extends Expression_EvaluableAspect {
  @OverrideAspectMethod
  public static Object evaluate(final BooleanConstant _self) {
    final arduino.semantics.BooleanConstant_ExecutableAspectBooleanConstantAspectProperties _self_ = arduino.semantics.BooleanConstant_ExecutableAspectBooleanConstantAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Object evaluate()
    if (_self instanceof arduino.BooleanConstant){
    	result = arduino.semantics.BooleanConstant_ExecutableAspect._privk3_evaluate(_self_, (arduino.BooleanConstant)_self);
    };
    return (java.lang.Object)result;
  }

  private static Object super_evaluate(final BooleanConstant _self) {
    final arduino.semantics.Expression_EvaluableAspectExpressionAspectProperties _self_ = arduino.semantics.Expression_EvaluableAspectExpressionAspectContext.getSelf(_self);
    return  arduino.semantics.Expression_EvaluableAspect._privk3_evaluate(_self_, _self);
  }

  protected static Object _privk3_evaluate(final BooleanConstant_ExecutableAspectBooleanConstantAspectProperties _self_, final BooleanConstant _self) {
    return Boolean.valueOf(_self.isValue());
  }
}
