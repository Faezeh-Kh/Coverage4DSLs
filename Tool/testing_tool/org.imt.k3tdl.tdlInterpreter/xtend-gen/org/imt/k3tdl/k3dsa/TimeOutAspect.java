package org.imt.k3tdl.k3dsa;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.etsi.mts.tdl.TimeOut;

@Aspect(className = TimeOut.class)
@SuppressWarnings("all")
public class TimeOutAspect extends TimerOperationAspect {
  @Step
  @OverrideAspectMethod
  public static boolean performBehavior(final TimeOut _self) {
    final org.imt.k3tdl.k3dsa.TimeOutAspectTimeOutAspectProperties _self_ = org.imt.k3tdl.k3dsa.TimeOutAspectTimeOutAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# boolean performBehavior()
    if (_self instanceof org.etsi.mts.tdl.TimeOut){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			addToResult(org.imt.k3tdl.k3dsa.TimeOutAspect._privk3_performBehavior(_self_, (org.etsi.mts.tdl.TimeOut)_self));
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {_self}, command, "TimeOut", "performBehavior");
    	} else {
    		command.execute();
    	}
    	result = command.getResult();
    	;
    };
    return (boolean)result;
  }

  private static boolean super_performBehavior(final TimeOut _self) {
    final org.imt.k3tdl.k3dsa.TimerOperationAspectTimerOperationAspectProperties _self_ = org.imt.k3tdl.k3dsa.TimerOperationAspectTimerOperationAspectContext.getSelf(_self);
    return  org.imt.k3tdl.k3dsa.TimerOperationAspect._privk3_performBehavior(_self_, _self);
  }

  protected static boolean _privk3_performBehavior(final TimeOutAspectTimeOutAspectProperties _self_, final TimeOut _self) {
    return false;
  }
}
