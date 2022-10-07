package pssm.semantics;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import statemachines.EventOccurrence;
import statemachines.IntegerConstraint;

@Aspect(className = IntegerConstraint.class)
@SuppressWarnings("all")
public class IntegerConstraintAspect extends ConstraintAspect {
  protected static boolean evaluate(final IntegerConstraint _self, final EventOccurrence eventOccurrence) {
    final pssm.semantics.IntegerConstraintAspectIntegerConstraintAspectProperties _self_ = pssm.semantics.IntegerConstraintAspectIntegerConstraintAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# boolean evaluate(EventOccurrence)
    if (_self instanceof statemachines.IntegerConstraint){
    	result = pssm.semantics.IntegerConstraintAspect._privk3_evaluate(_self_, (statemachines.IntegerConstraint)_self,eventOccurrence);
    };
    return (boolean)result;
  }
  
  protected static boolean _privk3_evaluate(final IntegerConstraintAspectIntegerConstraintAspectProperties _self_, final IntegerConstraint _self, final EventOccurrence eventOccurrence) {
    return IntegerComparisonExpressionAspect.evaluate(_self.getExpression());
  }
}
