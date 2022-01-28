package org.imt.pssm.reactive.interpreter;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.imt.pssm.reactive.model.statemachines.EventOccurrence;
import org.imt.pssm.reactive.model.statemachines.OperationBehavior;

@Aspect(className = OperationBehavior.class)
@SuppressWarnings("all")
public class OperationBehaviorAspect extends BehaviorAspect {
  @Step
  @OverrideAspectMethod
  protected static void execute(final OperationBehavior _self, final EventOccurrence eventOccurrence) {
    final org.imt.pssm.reactive.interpreter.OperationBehaviorAspectOperationBehaviorAspectProperties _self_ = org.imt.pssm.reactive.interpreter.OperationBehaviorAspectOperationBehaviorAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void execute(EventOccurrence)
    if (_self instanceof org.imt.pssm.reactive.model.statemachines.OperationBehavior){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			org.imt.pssm.reactive.interpreter.OperationBehaviorAspect._privk3_execute(_self_, (org.imt.pssm.reactive.model.statemachines.OperationBehavior)_self,eventOccurrence);
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {eventOccurrence}, command, "OperationBehavior", "execute");
    	} else {
    		command.execute();
    	}
    	;
    };
  }
  
  private static void super_execute(final OperationBehavior _self, final EventOccurrence eventOccurrence) {
    final org.imt.pssm.reactive.interpreter.BehaviorAspectBehaviorAspectProperties _self_ = org.imt.pssm.reactive.interpreter.BehaviorAspectBehaviorAspectContext.getSelf(_self);
     org.imt.pssm.reactive.interpreter.BehaviorAspect._privk3_execute(_self_, _self,eventOccurrence);
  }
  
  protected static void _privk3_execute(final OperationBehaviorAspectOperationBehaviorAspectProperties _self_, final OperationBehavior _self, final EventOccurrence eventOccurrence) {
  }
}
