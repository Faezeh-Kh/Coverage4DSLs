package org.imt.pssm.reactive.interpreter;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.imt.pssm.reactive.model.statemachines.EventOccurrence;
import org.imt.pssm.reactive.model.statemachines.StringConstraint;

@Aspect(className = StringConstraint.class)
@SuppressWarnings("all")
public class StringConstraintAspect extends ConstraintAspect {
  protected static boolean evaluate(final StringConstraint _self, final EventOccurrence eventOccurrence) {
    final org.imt.pssm.reactive.interpreter.StringConstraintAspectStringConstraintAspectProperties _self_ = org.imt.pssm.reactive.interpreter.StringConstraintAspectStringConstraintAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# boolean evaluate(EventOccurrence)
    if (_self instanceof org.imt.pssm.reactive.model.statemachines.StringConstraint){
    	result = org.imt.pssm.reactive.interpreter.StringConstraintAspect._privk3_evaluate(_self_, (org.imt.pssm.reactive.model.statemachines.StringConstraint)_self,eventOccurrence);
    };
    return (boolean)result;
  }
  
  protected static boolean _privk3_evaluate(final StringConstraintAspectStringConstraintAspectProperties _self_, final StringConstraint _self, final EventOccurrence eventOccurrence) {
    return StringComparisonExpressionAspect.evaluate(_self.getExpression());
  }
}
