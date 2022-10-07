package org.imt.k3tdl.k3dsa;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.etsi.mts.tdl.DataUse;
import org.etsi.mts.tdl.LiteralValueUse;
import org.etsi.mts.tdl.Wait;

@Aspect(className = Wait.class)
@SuppressWarnings("all")
public class WaitAspect extends TimeOperationAspect {
  @Step
  @OverrideAspectMethod
  public static boolean performBehavior(final Wait _self) {
    final org.imt.k3tdl.k3dsa.WaitAspectWaitAspectProperties _self_ = org.imt.k3tdl.k3dsa.WaitAspectWaitAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# boolean performBehavior()
    if (_self instanceof org.etsi.mts.tdl.Wait){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			addToResult(org.imt.k3tdl.k3dsa.WaitAspect._privk3_performBehavior(_self_, (org.etsi.mts.tdl.Wait)_self));
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {_self}, command, "Wait", "performBehavior");
    	} else {
    		command.execute();
    	}
    	result = command.getResult();
    	;
    };
    return (boolean)result;
  }

  private static boolean super_performBehavior(final Wait _self) {
    final org.imt.k3tdl.k3dsa.TimeOperationAspectTimeOperationAspectProperties _self_ = org.imt.k3tdl.k3dsa.TimeOperationAspectTimeOperationAspectContext.getSelf(_self);
    return  org.imt.k3tdl.k3dsa.TimeOperationAspect._privk3_performBehavior(_self_, _self);
  }

  protected static boolean _privk3_performBehavior(final WaitAspectWaitAspectProperties _self_, final Wait _self) {
    try {
      DataUse _period = _self.getPeriod();
      if ((_period instanceof LiteralValueUse)) {
        DataUse _period_1 = _self.getPeriod();
        final String delay = ((LiteralValueUse) _period_1).getValue();
        int _length = delay.length();
        int _minus = (_length - 1);
        final long miliSec = Long.parseLong(delay.substring(1, _minus));
        Thread.sleep(miliSec);
      }
      return true;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
