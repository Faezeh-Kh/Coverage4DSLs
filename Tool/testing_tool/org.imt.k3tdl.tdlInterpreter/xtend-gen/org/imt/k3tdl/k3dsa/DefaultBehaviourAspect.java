package org.imt.k3tdl.k3dsa;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.etsi.mts.tdl.DefaultBehaviour;

@Aspect(className = DefaultBehaviour.class)
@SuppressWarnings("all")
public class DefaultBehaviourAspect extends ExceptionalBehaviourAspect {
  @OverrideAspectMethod
  public static boolean performBehavior(final DefaultBehaviour _self) {
    final org.imt.k3tdl.k3dsa.DefaultBehaviourAspectDefaultBehaviourAspectProperties _self_ = org.imt.k3tdl.k3dsa.DefaultBehaviourAspectDefaultBehaviourAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# boolean performBehavior()
    if (_self instanceof org.etsi.mts.tdl.DefaultBehaviour){
    	result = org.imt.k3tdl.k3dsa.DefaultBehaviourAspect._privk3_performBehavior(_self_, (org.etsi.mts.tdl.DefaultBehaviour)_self);
    };
    return (boolean)result;
  }

  private static boolean super_performBehavior(final DefaultBehaviour _self) {
    final org.imt.k3tdl.k3dsa.ExceptionalBehaviourAspectExceptionalBehaviourAspectProperties _self_ = org.imt.k3tdl.k3dsa.ExceptionalBehaviourAspectExceptionalBehaviourAspectContext.getSelf(_self);
    return  org.imt.k3tdl.k3dsa.ExceptionalBehaviourAspect._privk3_performBehavior(_self_, _self);
  }

  protected static boolean _privk3_performBehavior(final DefaultBehaviourAspectDefaultBehaviourAspectProperties _self_, final DefaultBehaviour _self) {
    return BlockAspect.traverseBlock(_self.getBlock());
  }
}
