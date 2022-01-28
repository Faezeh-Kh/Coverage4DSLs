package org.imt.pssm.reactive.interpreter;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.imt.pssm.reactive.model.statemachines.Constraint;
import org.imt.pssm.reactive.model.statemachines.EventOccurrence;

@Aspect(className = Constraint.class)
@SuppressWarnings("all")
public class ConstraintAspect {
  protected static boolean evaluate(final Constraint _self, final EventOccurrence eventOccurrence) {
    final org.imt.pssm.reactive.interpreter.ConstraintAspectConstraintAspectProperties _self_ = org.imt.pssm.reactive.interpreter.ConstraintAspectConstraintAspectContext.getSelf(_self);
    Object result = null;
    	// BeginInjectInto org.imt.pssm.reactive.interpreter.ConstraintAspect#boolean evaluate(EventOccurrence) from org.imt.pssm.reactive.interpreter.BooleanConstraintAspect
    		if (_self instanceof org.imt.pssm.reactive.model.statemachines.BooleanConstraint){
    			result = org.imt.pssm.reactive.interpreter.BooleanConstraintAspect.evaluate((org.imt.pssm.reactive.model.statemachines.BooleanConstraint)_self,eventOccurrence);
    		} else
    		// EndInjectInto org.imt.pssm.reactive.interpreter.ConstraintAspect#boolean evaluate(EventOccurrence) from org.imt.pssm.reactive.interpreter.BooleanConstraintAspect
    	// BeginInjectInto org.imt.pssm.reactive.interpreter.ConstraintAspect#boolean evaluate(EventOccurrence) from org.imt.pssm.reactive.interpreter.StringConstraintAspect
    		if (_self instanceof org.imt.pssm.reactive.model.statemachines.StringConstraint){
    			result = org.imt.pssm.reactive.interpreter.StringConstraintAspect.evaluate((org.imt.pssm.reactive.model.statemachines.StringConstraint)_self,eventOccurrence);
    		} else
    		// EndInjectInto org.imt.pssm.reactive.interpreter.ConstraintAspect#boolean evaluate(EventOccurrence) from org.imt.pssm.reactive.interpreter.StringConstraintAspect
    	// BeginInjectInto org.imt.pssm.reactive.interpreter.ConstraintAspect#boolean evaluate(EventOccurrence) from org.imt.pssm.reactive.interpreter.IntegerConstraintAspect
    		if (_self instanceof org.imt.pssm.reactive.model.statemachines.IntegerConstraint){
    			result = org.imt.pssm.reactive.interpreter.IntegerConstraintAspect.evaluate((org.imt.pssm.reactive.model.statemachines.IntegerConstraint)_self,eventOccurrence);
    		} else
    		// EndInjectInto org.imt.pssm.reactive.interpreter.ConstraintAspect#boolean evaluate(EventOccurrence) from org.imt.pssm.reactive.interpreter.IntegerConstraintAspect
    // #DispatchPointCut_before# boolean evaluate(EventOccurrence)
    if (_self instanceof org.imt.pssm.reactive.model.statemachines.Constraint){
    	result = org.imt.pssm.reactive.interpreter.ConstraintAspect._privk3_evaluate(_self_, (org.imt.pssm.reactive.model.statemachines.Constraint)_self,eventOccurrence);
    };
    return (boolean)result;
  }
  
  protected static boolean _privk3_evaluate(final ConstraintAspectConstraintAspectProperties _self_, final Constraint _self, final EventOccurrence eventOccurrence) {
    return false;
  }
}
