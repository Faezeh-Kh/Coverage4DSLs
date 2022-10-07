package org.imt.k3tdl.k3dsa;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.etsi.mts.tdl.Quiescence;

@Aspect(className = Quiescence.class)
@SuppressWarnings("all")
public class QuiescenceAspect extends TimeOperationAspect {
  @Step
  @OverrideAspectMethod
  public static boolean performBehavior(final Quiescence _self) {
    final org.imt.k3tdl.k3dsa.QuiescenceAspectQuiescenceAspectProperties _self_ = org.imt.k3tdl.k3dsa.QuiescenceAspectQuiescenceAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# boolean performBehavior()
    if (_self instanceof org.etsi.mts.tdl.Quiescence){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			addToResult(org.imt.k3tdl.k3dsa.QuiescenceAspect._privk3_performBehavior(_self_, (org.etsi.mts.tdl.Quiescence)_self));
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {_self}, command, "Quiescence", "performBehavior");
    	} else {
    		command.execute();
    	}
    	result = command.getResult();
    	;
    };
    return (boolean)result;
  }

  private static boolean super_performBehavior(final Quiescence _self) {
    final org.imt.k3tdl.k3dsa.TimeOperationAspectTimeOperationAspectProperties _self_ = org.imt.k3tdl.k3dsa.TimeOperationAspectTimeOperationAspectContext.getSelf(_self);
    return  org.imt.k3tdl.k3dsa.TimeOperationAspect._privk3_performBehavior(_self_, _self);
  }

  protected static boolean _privk3_performBehavior(final QuiescenceAspectQuiescenceAspectProperties _self_, final Quiescence _self) {
    return false;
  }
}
