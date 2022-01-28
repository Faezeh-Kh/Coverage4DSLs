package org.imt.arduino.reactive.interpreter;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.imt.arduino.reactive.arduino.Block;
import org.imt.arduino.reactive.arduino.If;

@Aspect(className = If.class)
@SuppressWarnings("all")
public class If_ExecutableAspect extends Control_ExecutableAspect {
  @Step
  @OverrideAspectMethod
  public static void execute(final If _self) {
    final org.imt.arduino.reactive.interpreter.If_ExecutableAspectIfAspectProperties _self_ = org.imt.arduino.reactive.interpreter.If_ExecutableAspectIfAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void execute()
    if (_self instanceof org.imt.arduino.reactive.arduino.If){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			org.imt.arduino.reactive.interpreter.If_ExecutableAspect._privk3_execute(_self_, (org.imt.arduino.reactive.arduino.If)_self);
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
    final org.imt.arduino.reactive.interpreter.Control_ExecutableAspectControlAspectProperties _self_ = org.imt.arduino.reactive.interpreter.Control_ExecutableAspectControlAspectContext.getSelf(_self);
     org.imt.arduino.reactive.interpreter.Control_ExecutableAspect._privk3_execute(_self_, _self);
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
