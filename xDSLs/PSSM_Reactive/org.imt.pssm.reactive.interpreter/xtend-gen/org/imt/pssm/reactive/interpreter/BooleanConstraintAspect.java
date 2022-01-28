package org.imt.pssm.reactive.interpreter;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.imt.pssm.reactive.model.statemachines.BooleanBinaryExpression;
import org.imt.pssm.reactive.model.statemachines.BooleanConstraint;
import org.imt.pssm.reactive.model.statemachines.BooleanExpression;
import org.imt.pssm.reactive.model.statemachines.BooleanUnaryExpression;
import org.imt.pssm.reactive.model.statemachines.EventOccurrence;

@Aspect(className = BooleanConstraint.class)
@SuppressWarnings("all")
public class BooleanConstraintAspect extends ConstraintAspect {
  protected static boolean evaluate(final BooleanConstraint _self, final EventOccurrence eventOccurrence) {
    final org.imt.pssm.reactive.interpreter.BooleanConstraintAspectBooleanConstraintAspectProperties _self_ = org.imt.pssm.reactive.interpreter.BooleanConstraintAspectBooleanConstraintAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# boolean evaluate(EventOccurrence)
    if (_self instanceof org.imt.pssm.reactive.model.statemachines.BooleanConstraint){
    	result = org.imt.pssm.reactive.interpreter.BooleanConstraintAspect._privk3_evaluate(_self_, (org.imt.pssm.reactive.model.statemachines.BooleanConstraint)_self,eventOccurrence);
    };
    return (boolean)result;
  }
  
  protected static boolean _privk3_evaluate(final BooleanConstraintAspectBooleanConstraintAspectProperties _self_, final BooleanConstraint _self, final EventOccurrence eventOccurrence) {
    BooleanExpression _expression = _self.getExpression();
    if ((_expression instanceof BooleanUnaryExpression)) {
      BooleanExpression _expression_1 = _self.getExpression();
      return BooleanUnaryExpressionAspect.evaluate(((BooleanUnaryExpression) _expression_1), eventOccurrence);
    } else {
      BooleanExpression _expression_2 = _self.getExpression();
      if ((_expression_2 instanceof BooleanBinaryExpression)) {
        BooleanExpression _expression_3 = _self.getExpression();
        return BooleanBinaryExpressionAspect.evaluate(((BooleanBinaryExpression) _expression_3));
      }
    }
    return false;
  }
}
