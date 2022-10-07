package org.imt.k3tdl.k3dsa;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.etsi.mts.tdl.ParallelBehaviour;

@Aspect(className = ParallelBehaviour.class)
@SuppressWarnings("all")
public class ParallelBehaviourAspect extends MultipleCombinedBehaviourAspect {
  @OverrideAspectMethod
  public static boolean performBehavior(final ParallelBehaviour _self) {
    final org.imt.k3tdl.k3dsa.ParallelBehaviourAspectParallelBehaviourAspectProperties _self_ = org.imt.k3tdl.k3dsa.ParallelBehaviourAspectParallelBehaviourAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# boolean performBehavior()
    if (_self instanceof org.etsi.mts.tdl.ParallelBehaviour){
    	result = org.imt.k3tdl.k3dsa.ParallelBehaviourAspect._privk3_performBehavior(_self_, (org.etsi.mts.tdl.ParallelBehaviour)_self);
    };
    return (boolean)result;
  }

  private static boolean super_performBehavior(final ParallelBehaviour _self) {
    final org.imt.k3tdl.k3dsa.MultipleCombinedBehaviourAspectMultipleCombinedBehaviourAspectProperties _self_ = org.imt.k3tdl.k3dsa.MultipleCombinedBehaviourAspectMultipleCombinedBehaviourAspectContext.getSelf(_self);
    return  org.imt.k3tdl.k3dsa.MultipleCombinedBehaviourAspect._privk3_performBehavior(_self_, _self);
  }

  protected static boolean _privk3_performBehavior(final ParallelBehaviourAspectParallelBehaviourAspectProperties _self_, final ParallelBehaviour _self) {
    return false;
  }
}
