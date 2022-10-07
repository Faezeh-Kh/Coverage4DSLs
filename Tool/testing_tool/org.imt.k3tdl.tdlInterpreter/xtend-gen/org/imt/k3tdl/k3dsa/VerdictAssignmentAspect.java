package org.imt.k3tdl.k3dsa;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.etsi.mts.tdl.VerdictAssignment;

@Aspect(className = VerdictAssignment.class)
@SuppressWarnings("all")
public class VerdictAssignmentAspect extends AtomicBehaviourAspect {
  @Step
  @OverrideAspectMethod
  public static boolean performBehavior(final VerdictAssignment _self) {
    final org.imt.k3tdl.k3dsa.VerdictAssignmentAspectVerdictAssignmentAspectProperties _self_ = org.imt.k3tdl.k3dsa.VerdictAssignmentAspectVerdictAssignmentAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# boolean performBehavior()
    if (_self instanceof org.etsi.mts.tdl.VerdictAssignment){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			addToResult(org.imt.k3tdl.k3dsa.VerdictAssignmentAspect._privk3_performBehavior(_self_, (org.etsi.mts.tdl.VerdictAssignment)_self));
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {_self}, command, "VerdictAssignment", "performBehavior");
    	} else {
    		command.execute();
    	}
    	result = command.getResult();
    	;
    };
    return (boolean)result;
  }

  private static boolean super_performBehavior(final VerdictAssignment _self) {
    final org.imt.k3tdl.k3dsa.AtomicBehaviourAspectAtomicBehaviourAspectProperties _self_ = org.imt.k3tdl.k3dsa.AtomicBehaviourAspectAtomicBehaviourAspectContext.getSelf(_self);
    return  org.imt.k3tdl.k3dsa.AtomicBehaviourAspect._privk3_performBehavior(_self_, _self);
  }

  protected static boolean _privk3_performBehavior(final VerdictAssignmentAspectVerdictAssignmentAspectProperties _self_, final VerdictAssignment _self) {
    return false;
  }
}
