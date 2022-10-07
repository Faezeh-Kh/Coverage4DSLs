package arduino.semantics;

import arduino.Block;
import arduino.If;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.Step;

@Aspect(className = If.class)
@SuppressWarnings("all")
public class If_ExecutableAspect extends Control_ExecutableAspect {
  @Step
  @OverrideAspectMethod
  public static void execute(final If _self) {
    final arduino.semantics.If_ExecutableAspectIfAspectProperties _self_ = arduino.semantics.If_ExecutableAspectIfAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void execute()
    if (_self instanceof arduino.If){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			arduino.semantics.If_ExecutableAspect._privk3_execute(_self_, (arduino.If)_self);
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {_self}, command, "If", "execute");
    	} else {
    		command.execute();
    	}
    	;
    };
  }

  private static void super_execute(final If _self) {
    final arduino.semantics.Control_ExecutableAspectControlAspectProperties _self_ = arduino.semantics.Control_ExecutableAspectControlAspectContext.getSelf(_self);
     arduino.semantics.Control_ExecutableAspect._privk3_execute(_self_, _self);
  }

  protected static void _privk3_execute(final If_ExecutableAspectIfAspectProperties _self_, final If _self) {
    Boolean _evaluate = If_EvaluableAspect.evaluate(_self);
    if ((_evaluate).booleanValue()) {
      Block_ExecutableAspect.execute(_self.getBlock());
    } else {
      Block _elseBlock = _self.getElseBlock();
      boolean _tripleNotEquals = (_elseBlock != null);
      if (_tripleNotEquals) {
        Block_ExecutableAspect.execute(_self.getElseBlock());
      }
    }
  }
}
