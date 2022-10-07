package org.imt.k3tdl.k3dsa;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.etsi.mts.tdl.TestDescriptionReference;

@Aspect(className = TestDescriptionReference.class)
@SuppressWarnings("all")
public class TestDescriptionReferenceAspect extends AtomicBehaviourAspect {
  @Step
  @OverrideAspectMethod
  public static boolean performBehavior(final TestDescriptionReference _self) {
    final org.imt.k3tdl.k3dsa.TestDescriptionReferenceAspectTestDescriptionReferenceAspectProperties _self_ = org.imt.k3tdl.k3dsa.TestDescriptionReferenceAspectTestDescriptionReferenceAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# boolean performBehavior()
    if (_self instanceof org.etsi.mts.tdl.TestDescriptionReference){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			addToResult(org.imt.k3tdl.k3dsa.TestDescriptionReferenceAspect._privk3_performBehavior(_self_, (org.etsi.mts.tdl.TestDescriptionReference)_self));
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {_self}, command, "TestDescriptionReference", "performBehavior");
    	} else {
    		command.execute();
    	}
    	result = command.getResult();
    	;
    };
    return (boolean)result;
  }

  private static boolean super_performBehavior(final TestDescriptionReference _self) {
    final org.imt.k3tdl.k3dsa.AtomicBehaviourAspectAtomicBehaviourAspectProperties _self_ = org.imt.k3tdl.k3dsa.AtomicBehaviourAspectAtomicBehaviourAspectContext.getSelf(_self);
    return  org.imt.k3tdl.k3dsa.AtomicBehaviourAspect._privk3_performBehavior(_self_, _self);
  }

  protected static boolean _privk3_performBehavior(final TestDescriptionReferenceAspectTestDescriptionReferenceAspectProperties _self_, final TestDescriptionReference _self) {
    return false;
  }
}
