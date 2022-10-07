package org.imt.k3tdl.k3dsa;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.etsi.mts.tdl.InlineAction;

@Aspect(className = InlineAction.class)
@SuppressWarnings("all")
public class InlineActionAspect extends ActionBehaviourAspect {
  @Step
  @OverrideAspectMethod
  public static boolean performBehavior(final InlineAction _self) {
    final org.imt.k3tdl.k3dsa.InlineActionAspectInlineActionAspectProperties _self_ = org.imt.k3tdl.k3dsa.InlineActionAspectInlineActionAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# boolean performBehavior()
    if (_self instanceof org.etsi.mts.tdl.InlineAction){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			addToResult(org.imt.k3tdl.k3dsa.InlineActionAspect._privk3_performBehavior(_self_, (org.etsi.mts.tdl.InlineAction)_self));
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {_self}, command, "InlineAction", "performBehavior");
    	} else {
    		command.execute();
    	}
    	result = command.getResult();
    	;
    };
    return (boolean)result;
  }

  private static boolean super_performBehavior(final InlineAction _self) {
    final org.imt.k3tdl.k3dsa.ActionBehaviourAspectActionBehaviourAspectProperties _self_ = org.imt.k3tdl.k3dsa.ActionBehaviourAspectActionBehaviourAspectContext.getSelf(_self);
    return  org.imt.k3tdl.k3dsa.ActionBehaviourAspect._privk3_performBehavior(_self_, _self);
  }

  protected static boolean _privk3_performBehavior(final InlineActionAspectInlineActionAspectProperties _self_, final InlineAction _self) {
    return false;
  }
}
