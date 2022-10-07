package org.imt.k3tdl.k3dsa;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.etsi.mts.tdl.ConditionalBehaviour;

@Aspect(className = ConditionalBehaviour.class)
@SuppressWarnings("all")
public class ConditionalBehaviourAspect extends MultipleCombinedBehaviourAspect {
  @OverrideAspectMethod
  public static boolean performBehavior(final ConditionalBehaviour _self) {
    final org.imt.k3tdl.k3dsa.ConditionalBehaviourAspectConditionalBehaviourAspectProperties _self_ = org.imt.k3tdl.k3dsa.ConditionalBehaviourAspectConditionalBehaviourAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# boolean performBehavior()
    if (_self instanceof org.etsi.mts.tdl.ConditionalBehaviour){
    	result = org.imt.k3tdl.k3dsa.ConditionalBehaviourAspect._privk3_performBehavior(_self_, (org.etsi.mts.tdl.ConditionalBehaviour)_self);
    };
    return (boolean)result;
  }

  private static boolean super_performBehavior(final ConditionalBehaviour _self) {
    final org.imt.k3tdl.k3dsa.MultipleCombinedBehaviourAspectMultipleCombinedBehaviourAspectProperties _self_ = org.imt.k3tdl.k3dsa.MultipleCombinedBehaviourAspectMultipleCombinedBehaviourAspectContext.getSelf(_self);
    return  org.imt.k3tdl.k3dsa.MultipleCombinedBehaviourAspect._privk3_performBehavior(_self_, _self);
  }

  protected static boolean _privk3_performBehavior(final ConditionalBehaviourAspectConditionalBehaviourAspectProperties _self_, final ConditionalBehaviour _self) {
    return false;
  }
}
