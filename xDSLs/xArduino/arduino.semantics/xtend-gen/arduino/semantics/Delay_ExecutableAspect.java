package arduino.semantics;

import arduino.Delay;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.Step;

@Aspect(className = Delay.class)
@SuppressWarnings("all")
public class Delay_ExecutableAspect extends Utilities_ExecutableAspect {
  @Step
  @OverrideAspectMethod
  public static void execute(final Delay _self) {
    final arduino.semantics.Delay_ExecutableAspectDelayAspectProperties _self_ = arduino.semantics.Delay_ExecutableAspectDelayAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void execute()
    if (_self instanceof arduino.Delay){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			arduino.semantics.Delay_ExecutableAspect._privk3_execute(_self_, (arduino.Delay)_self);
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {_self}, command, "Delay", "execute");
    	} else {
    		command.execute();
    	}
    	;
    };
  }

  private static void super_execute(final Delay _self) {
    final arduino.semantics.Utilities_ExecutableAspectUtilitiesAspectProperties _self_ = arduino.semantics.Utilities_ExecutableAspectUtilitiesAspectContext.getSelf(_self);
     arduino.semantics.Utilities_ExecutableAspect._privk3_execute(_self_, _self);
  }

  protected static void _privk3_execute(final Delay_ExecutableAspectDelayAspectProperties _self_, final Delay _self) {
  }
}
