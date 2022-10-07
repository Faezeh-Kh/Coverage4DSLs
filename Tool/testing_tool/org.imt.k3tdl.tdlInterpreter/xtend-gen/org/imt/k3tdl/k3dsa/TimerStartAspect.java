package org.imt.k3tdl.k3dsa;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.etsi.mts.tdl.TimerStart;

@Aspect(className = TimerStart.class)
@SuppressWarnings("all")
public class TimerStartAspect extends TimerOperationAspect {
  @Step
  @OverrideAspectMethod
  public static boolean performBehavior(final TimerStart _self) {
    final org.imt.k3tdl.k3dsa.TimerStartAspectTimerStartAspectProperties _self_ = org.imt.k3tdl.k3dsa.TimerStartAspectTimerStartAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# boolean performBehavior()
    if (_self instanceof org.etsi.mts.tdl.TimerStart){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			addToResult(org.imt.k3tdl.k3dsa.TimerStartAspect._privk3_performBehavior(_self_, (org.etsi.mts.tdl.TimerStart)_self));
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {_self}, command, "TimerStart", "performBehavior");
    	} else {
    		command.execute();
    	}
    	result = command.getResult();
    	;
    };
    return (boolean)result;
  }

  private static boolean super_performBehavior(final TimerStart _self) {
    final org.imt.k3tdl.k3dsa.TimerOperationAspectTimerOperationAspectProperties _self_ = org.imt.k3tdl.k3dsa.TimerOperationAspectTimerOperationAspectContext.getSelf(_self);
    return  org.imt.k3tdl.k3dsa.TimerOperationAspect._privk3_performBehavior(_self_, _self);
  }

  protected static boolean _privk3_performBehavior(final TimerStartAspectTimerStartAspectProperties _self_, final TimerStart _self) {
    return false;
  }
}
