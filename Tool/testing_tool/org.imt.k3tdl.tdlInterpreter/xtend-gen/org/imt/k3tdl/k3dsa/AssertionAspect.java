package org.imt.k3tdl.k3dsa;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.etsi.mts.tdl.Assertion;

@Aspect(className = Assertion.class)
@SuppressWarnings("all")
public class AssertionAspect extends ActionBehaviourAspect {
  @Step
  @OverrideAspectMethod
  public static boolean performBehavior(final Assertion _self) {
    final org.imt.k3tdl.k3dsa.AssertionAspectAssertionAspectProperties _self_ = org.imt.k3tdl.k3dsa.AssertionAspectAssertionAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# boolean performBehavior()
    if (_self instanceof org.etsi.mts.tdl.Assertion){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			addToResult(org.imt.k3tdl.k3dsa.AssertionAspect._privk3_performBehavior(_self_, (org.etsi.mts.tdl.Assertion)_self));
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {_self}, command, "Assertion", "performBehavior");
    	} else {
    		command.execute();
    	}
    	result = command.getResult();
    	;
    };
    return (boolean)result;
  }

  private static boolean super_performBehavior(final Assertion _self) {
    final org.imt.k3tdl.k3dsa.ActionBehaviourAspectActionBehaviourAspectProperties _self_ = org.imt.k3tdl.k3dsa.ActionBehaviourAspectActionBehaviourAspectContext.getSelf(_self);
    return  org.imt.k3tdl.k3dsa.ActionBehaviourAspect._privk3_performBehavior(_self_, _self);
  }

  protected static boolean _privk3_performBehavior(final AssertionAspectAssertionAspectProperties _self_, final Assertion _self) {
    return false;
  }
}
