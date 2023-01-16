package pssm.semantics;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import statemachines.EventOccurrence;
import statemachines.OperationBehavior;

@Aspect(className = OperationBehavior.class)
@SuppressWarnings("all")
public class OperationBehaviorAspect extends BehaviorAspect {
  @Step
  @OverrideAspectMethod
  protected static void execute(final OperationBehavior _self, final EventOccurrence eventOccurrence) {
    final pssm.semantics.OperationBehaviorAspectOperationBehaviorAspectProperties _self_ = pssm.semantics.OperationBehaviorAspectOperationBehaviorAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void execute(EventOccurrence)
    if (_self instanceof statemachines.OperationBehavior){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			pssm.semantics.OperationBehaviorAspect._privk3_execute(_self_, (statemachines.OperationBehavior)_self,eventOccurrence);
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
    final pssm.semantics.BehaviorAspectBehaviorAspectProperties _self_ = pssm.semantics.BehaviorAspectBehaviorAspectContext.getSelf(_self);
     pssm.semantics.BehaviorAspect._privk3_execute(_self_, _self,eventOccurrence);
  }

  protected static void _privk3_execute(final OperationBehaviorAspectOperationBehaviorAspectProperties _self_, final OperationBehavior _self, final EventOccurrence eventOccurrence) {
  }
}
