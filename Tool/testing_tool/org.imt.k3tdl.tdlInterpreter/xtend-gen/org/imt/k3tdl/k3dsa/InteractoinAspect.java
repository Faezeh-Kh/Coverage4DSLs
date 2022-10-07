package org.imt.k3tdl.k3dsa;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.etsi.mts.tdl.Interaction;

@Aspect(className = Interaction.class)
@SuppressWarnings("all")
public class InteractoinAspect extends AtomicBehaviourAspect {
  @Step
  @OverrideAspectMethod
  public static boolean performBehavior(final Interaction _self) {
    final org.imt.k3tdl.k3dsa.InteractoinAspectInteractionAspectProperties _self_ = org.imt.k3tdl.k3dsa.InteractoinAspectInteractionAspectContext.getSelf(_self);
    Object result = null;
    	// BeginInjectInto org.imt.k3tdl.k3dsa.InteractoinAspect#boolean performBehavior() from org.imt.k3tdl.k3dsa.ProcedureCallAspect
    		if (_self instanceof org.etsi.mts.tdl.ProcedureCall){
    			result = org.imt.k3tdl.k3dsa.ProcedureCallAspect.performBehavior((org.etsi.mts.tdl.ProcedureCall)_self);
    		} else
    		// EndInjectInto org.imt.k3tdl.k3dsa.InteractoinAspect#boolean performBehavior() from org.imt.k3tdl.k3dsa.ProcedureCallAspect
    	// BeginInjectInto org.imt.k3tdl.k3dsa.InteractoinAspect#boolean performBehavior() from org.imt.k3tdl.k3dsa.MessageAspect
    		if (_self instanceof org.etsi.mts.tdl.Message){
    			result = org.imt.k3tdl.k3dsa.MessageAspect.performBehavior((org.etsi.mts.tdl.Message)_self);
    		} else
    		// EndInjectInto org.imt.k3tdl.k3dsa.InteractoinAspect#boolean performBehavior() from org.imt.k3tdl.k3dsa.MessageAspect
    // #DispatchPointCut_before# boolean performBehavior()
    if (_self instanceof org.etsi.mts.tdl.Interaction){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			addToResult(org.imt.k3tdl.k3dsa.InteractoinAspect._privk3_performBehavior(_self_, (org.etsi.mts.tdl.Interaction)_self));
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {_self}, command, "Interaction", "performBehavior");
    	} else {
    		command.execute();
    	}
    	result = command.getResult();
    	;
    };
    return (boolean)result;
  }

  private static boolean super_performBehavior(final Interaction _self) {
    final org.imt.k3tdl.k3dsa.AtomicBehaviourAspectAtomicBehaviourAspectProperties _self_ = org.imt.k3tdl.k3dsa.AtomicBehaviourAspectAtomicBehaviourAspectContext.getSelf(_self);
    return  org.imt.k3tdl.k3dsa.AtomicBehaviourAspect._privk3_performBehavior(_self_, _self);
  }

  protected static boolean _privk3_performBehavior(final InteractoinAspectInteractionAspectProperties _self_, final Interaction _self) {
    return false;
  }
}
