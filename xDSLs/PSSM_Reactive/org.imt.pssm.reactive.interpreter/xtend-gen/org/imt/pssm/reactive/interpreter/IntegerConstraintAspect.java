package org.imt.pssm.reactive.interpreter;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.imt.pssm.reactive.model.statemachines.EventOccurrence;
import org.imt.pssm.reactive.model.statemachines.IntegerConstraint;

@Aspect(className = IntegerConstraint.class)
@SuppressWarnings("all")
public class IntegerConstraintAspect extends ConstraintAspect {
  protected static boolean evaluate(final IntegerConstraint _self, final EventOccurrence eventOccurrence) {
    final org.imt.pssm.reactive.interpreter.IntegerConstraintAspectIntegerConstraintAspectProperties _self_ = org.imt.pssm.reactive.interpreter.IntegerConstraintAspectIntegerConstraintAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# boolean evaluate(EventOccurrence)
    if (_self instanceof org.imt.pssm.reactive.model.statemachines.IntegerConstraint){
    	result = org.imt.pssm.reactive.interpreter.IntegerConstraintAspect._privk3_evaluate(_self_, (org.imt.pssm.reactive.model.statemachines.IntegerConstraint)_self,eventOccurrence);
    };
    return (boolean)result;
  }
  
  protected static boolean _privk3_evaluate(final IntegerConstraintAspectIntegerConstraintAspectProperties _self_, final IntegerConstraint _self, final EventOccurrence eventOccurrence) {
    return IntegerComparisonExpressionAspect.evaluate(_self.getExpression());
  }
}
