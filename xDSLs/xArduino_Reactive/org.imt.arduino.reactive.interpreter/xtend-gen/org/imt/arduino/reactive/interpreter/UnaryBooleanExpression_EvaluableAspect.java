package org.imt.arduino.reactive.interpreter;

import com.google.common.base.Objects;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.imt.arduino.reactive.arduino.UnaryBooleanExpression;
import org.imt.arduino.reactive.arduino.UnaryBooleanOperatorKind;

@Aspect(className = UnaryBooleanExpression.class)
@SuppressWarnings("all")
public class UnaryBooleanExpression_EvaluableAspect extends Expression_EvaluableAspect {
  public static Object evaluate(final UnaryBooleanExpression _self) {
    final org.imt.arduino.reactive.interpreter.UnaryBooleanExpression_EvaluableAspectUnaryBooleanExpressionAspectProperties _self_ = org.imt.arduino.reactive.interpreter.UnaryBooleanExpression_EvaluableAspectUnaryBooleanExpressionAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Object evaluate()
    if (_self instanceof org.imt.arduino.reactive.arduino.UnaryBooleanExpression){
    	result = org.imt.arduino.reactive.interpreter.UnaryBooleanExpression_EvaluableAspect._privk3_evaluate(_self_, (org.imt.arduino.reactive.arduino.UnaryBooleanExpression)_self);
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
