package org.imt.k3tdl.k3dsa;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.etsi.mts.tdl.ProcedureCall;

@Aspect(className = ProcedureCall.class)
@SuppressWarnings("all")
public class ProcedureCallAspect extends InteractoinAspect {
  @Step
  @OverrideAspectMethod
  public static boolean performBehavior(final ProcedureCall _self) {
    final org.imt.k3tdl.k3dsa.ProcedureCallAspectProcedureCallAspectProperties _self_ = org.imt.k3tdl.k3dsa.ProcedureCallAspectProcedureCallAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# boolean performBehavior()
    if (_self instanceof org.etsi.mts.tdl.ProcedureCall){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			addToResult(org.imt.k3tdl.k3dsa.ProcedureCallAspect._privk3_performBehavior(_self_, (org.etsi.mts.tdl.ProcedureCall)_self));
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {_self}, command, "ProcedureCall", "performBehavior");
    	} else {
    		command.execute();
    	}
    	result = command.getResult();
    	;
    };
    return (boolean)result;
  }

  private static boolean super_performBehavior(final ProcedureCall _self) {
    final org.imt.k3tdl.k3dsa.InteractoinAspectInteractionAspectProperties _self_ = org.imt.k3tdl.k3dsa.InteractoinAspectInteractionAspectContext.getSelf(_self);
    return  org.imt.k3tdl.k3dsa.InteractoinAspect._privk3_performBehavior(_self_, _self);
  }

  protected static boolean _privk3_performBehavior(final ProcedureCallAspectProcedureCallAspectProperties _self_, final ProcedureCall _self) {
    return false;
  }
}
