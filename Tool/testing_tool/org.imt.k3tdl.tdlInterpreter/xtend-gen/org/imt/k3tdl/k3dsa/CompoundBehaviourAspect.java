package org.imt.k3tdl.k3dsa;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.etsi.mts.tdl.CompoundBehaviour;

@Aspect(className = CompoundBehaviour.class)
@SuppressWarnings("all")
public class CompoundBehaviourAspect extends SingleCombinedBehaviourAspect {
  @OverrideAspectMethod
  public static boolean performBehavior(final CompoundBehaviour _self) {
    final org.imt.k3tdl.k3dsa.CompoundBehaviourAspectCompoundBehaviourAspectProperties _self_ = org.imt.k3tdl.k3dsa.CompoundBehaviourAspectCompoundBehaviourAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# boolean performBehavior()
    if (_self instanceof org.etsi.mts.tdl.CompoundBehaviour){
    	result = org.imt.k3tdl.k3dsa.CompoundBehaviourAspect._privk3_performBehavior(_self_, (org.etsi.mts.tdl.CompoundBehaviour)_self);
    };
    return (boolean)result;
  }

  private static boolean super_performBehavior(final CompoundBehaviour _self) {
    final org.imt.k3tdl.k3dsa.SingleCombinedBehaviourAspectSingleCombinedBehaviourAspectProperties _self_ = org.imt.k3tdl.k3dsa.SingleCombinedBehaviourAspectSingleCombinedBehaviourAspectContext.getSelf(_self);
    return  org.imt.k3tdl.k3dsa.SingleCombinedBehaviourAspect._privk3_performBehavior(_self_, _self);
  }

  protected static boolean _privk3_performBehavior(final CompoundBehaviourAspectCompoundBehaviourAspectProperties _self_, final CompoundBehaviour _self) {
    return BlockAspect.traverseBlock(_self.getBlock());
  }
}
