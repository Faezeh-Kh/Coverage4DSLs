package arduino.semantics;

import arduino.UnaryBooleanExpression;
import arduino.UnaryBooleanOperatorKind;
import com.google.common.base.Objects;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;

@Aspect(className = UnaryBooleanExpression.class)
@SuppressWarnings("all")
public class UnaryBooleanExpression_EvaluableAspect extends Expression_EvaluableAspect {
  public static Object evaluate(final UnaryBooleanExpression _self) {
    final arduino.semantics.UnaryBooleanExpression_EvaluableAspectUnaryBooleanExpressionAspectProperties _self_ = arduino.semantics.UnaryBooleanExpression_EvaluableAspectUnaryBooleanExpressionAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Object evaluate()
    if (_self instanceof arduino.UnaryBooleanExpression){
    	result = arduino.semantics.UnaryBooleanExpression_EvaluableAspect._privk3_evaluate(_self_, (arduino.UnaryBooleanExpression)_self);
    };
    return (java.lang.Object)result;
  }

  protected static Object _privk3_evaluate(final UnaryBooleanExpression_EvaluableAspectUnaryBooleanExpressionAspectProperties _self_, final UnaryBooleanExpression _self) {
    UnaryBooleanOperatorKind _operator = _self.getOperator();
    boolean _equals = Objects.equal(_operator, UnaryBooleanOperatorKind.NOT);
    if (_equals) {
      Object _evaluate = Expression_EvaluableAspect.evaluate(_self.getOperand());
      return Boolean.valueOf((!(((Boolean) _evaluate)).booleanValue()));
    }
    return Expression_EvaluableAspect.evaluate(_self.getOperand());
  }
}
