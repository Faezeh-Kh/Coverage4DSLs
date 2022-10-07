package org.imt.k3tdl.k3dsa;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.etsi.mts.tdl.OptionalBehaviour;

@Aspect(className = OptionalBehaviour.class)
@SuppressWarnings("all")
public class OptionalBehaviourAspect extends SingleCombinedBehaviourAspect {
  @OverrideAspectMethod
  public static boolean performBehavior(final OptionalBehaviour _self) {
    final org.imt.k3tdl.k3dsa.OptionalBehaviourAspectOptionalBehaviourAspectProperties _self_ = org.imt.k3tdl.k3dsa.OptionalBehaviourAspectOptionalBehaviourAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# boolean performBehavior()
    if (_self instanceof org.etsi.mts.tdl.OptionalBehaviour){
    	result = org.imt.k3tdl.k3dsa.OptionalBehaviourAspect._privk3_performBehavior(_self_, (org.etsi.mts.tdl.OptionalBehaviour)_self);
    };
    return (boolean)result;
  }

  private static boolean super_performBehavior(final OptionalBehaviour _self) {
    final org.imt.k3tdl.k3dsa.SingleCombinedBehaviourAspectSingleCombinedBehaviourAspectProperties _self_ = org.imt.k3tdl.k3dsa.SingleCombinedBehaviourAspectSingleCombinedBehaviourAspectContext.getSelf(_self);
    return  org.imt.k3tdl.k3dsa.SingleCombinedBehaviourAspect._privk3_performBehavior(_self_, _self);
  }

  protected static boolean _privk3_performBehavior(final OptionalBehaviourAspectOptionalBehaviourAspectProperties _self_, final OptionalBehaviour _self) {
    return BlockAspect.traverseBlock(_self.getBlock());
  }
}
