package pssm.semantics;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import statemachines.EventOccurrence;
import statemachines.StringConstraint;

@Aspect(className = StringConstraint.class)
@SuppressWarnings("all")
public class StringConstraintAspect extends ConstraintAspect {
  protected static boolean evaluate(final StringConstraint _self, final EventOccurrence eventOccurrence) {
    final pssm.semantics.StringConstraintAspectStringConstraintAspectProperties _self_ = pssm.semantics.StringConstraintAspectStringConstraintAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# boolean evaluate(EventOccurrence)
    if (_self instanceof statemachines.StringConstraint){
    	result = pssm.semantics.StringConstraintAspect._privk3_evaluate(_self_, (statemachines.StringConstraint)_self,eventOccurrence);
    };
    return (boolean)result;
  }

  protected static boolean _privk3_evaluate(final StringConstraintAspectStringConstraintAspectProperties _self_, final StringConstraint _self, final EventOccurrence eventOccurrence) {
    return StringComparisonExpressionAspect.evaluate(_self.getExpression());
  }
}
