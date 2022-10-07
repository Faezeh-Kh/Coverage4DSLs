package pssm.semantics;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import statemachines.Constraint;
import statemachines.EventOccurrence;

@Aspect(className = Constraint.class)
@SuppressWarnings("all")
public class ConstraintAspect {
  protected static boolean evaluate(final Constraint _self, final EventOccurrence eventOccurrence) {
    final pssm.semantics.ConstraintAspectConstraintAspectProperties _self_ = pssm.semantics.ConstraintAspectConstraintAspectContext.getSelf(_self);
    Object result = null;
    	// BeginInjectInto pssm.semantics.ConstraintAspect#boolean evaluate(EventOccurrence) from pssm.semantics.StringConstraintAspect
    		if (_self instanceof statemachines.StringConstraint){
    			result = pssm.semantics.StringConstraintAspect.evaluate((statemachines.StringConstraint)_self,eventOccurrence);
    		} else
    		// EndInjectInto pssm.semantics.ConstraintAspect#boolean evaluate(EventOccurrence) from pssm.semantics.StringConstraintAspect
    	// BeginInjectInto pssm.semantics.ConstraintAspect#boolean evaluate(EventOccurrence) from pssm.semantics.BooleanConstraintAspect
    		if (_self instanceof statemachines.BooleanConstraint){
    			result = pssm.semantics.BooleanConstraintAspect.evaluate((statemachines.BooleanConstraint)_self,eventOccurrence);
    		} else
    		// EndInjectInto pssm.semantics.ConstraintAspect#boolean evaluate(EventOccurrence) from pssm.semantics.BooleanConstraintAspect
    	// BeginInjectInto pssm.semantics.ConstraintAspect#boolean evaluate(EventOccurrence) from pssm.semantics.IntegerConstraintAspect
    		if (_self instanceof statemachines.IntegerConstraint){
    			result = pssm.semantics.IntegerConstraintAspect.evaluate((statemachines.IntegerConstraint)_self,eventOccurrence);
    		} else
    		// EndInjectInto pssm.semantics.ConstraintAspect#boolean evaluate(EventOccurrence) from pssm.semantics.IntegerConstraintAspect
    // #DispatchPointCut_before# boolean evaluate(EventOccurrence)
    if (_self instanceof statemachines.Constraint){
    	result = pssm.semantics.ConstraintAspect._privk3_evaluate(_self_, (statemachines.Constraint)_self,eventOccurrence);
    };
    return (boolean)result;
  }
  
  protected static boolean _privk3_evaluate(final ConstraintAspectConstraintAspectProperties _self_, final Constraint _self, final EventOccurrence eventOccurrence) {
    return false;
  }
}
