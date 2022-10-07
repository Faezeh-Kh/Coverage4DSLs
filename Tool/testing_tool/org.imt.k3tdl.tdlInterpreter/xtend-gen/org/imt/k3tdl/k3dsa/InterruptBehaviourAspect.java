package org.imt.k3tdl.k3dsa;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.etsi.mts.tdl.InterruptBehaviour;

@Aspect(className = InterruptBehaviour.class)
@SuppressWarnings("all")
public class InterruptBehaviourAspect extends ExceptionalBehaviourAspect {
  @OverrideAspectMethod
  public static boolean performBehavior(final InterruptBehaviour _self) {
    final org.imt.k3tdl.k3dsa.InterruptBehaviourAspectInterruptBehaviourAspectProperties _self_ = org.imt.k3tdl.k3dsa.InterruptBehaviourAspectInterruptBehaviourAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# boolean performBehavior()
    if (_self instanceof org.etsi.mts.tdl.InterruptBehaviour){
    	result = org.imt.k3tdl.k3dsa.InterruptBehaviourAspect._privk3_performBehavior(_self_, (org.etsi.mts.tdl.InterruptBehaviour)_self);
    };
    return (boolean)result;
  }

  private static boolean super_performBehavior(final InterruptBehaviour _self) {
    final org.imt.k3tdl.k3dsa.ExceptionalBehaviourAspectExceptionalBehaviourAspectProperties _self_ = org.imt.k3tdl.k3dsa.ExceptionalBehaviourAspectExceptionalBehaviourAspectContext.getSelf(_self);
    return  org.imt.k3tdl.k3dsa.ExceptionalBehaviourAspect._privk3_performBehavior(_self_, _self);
  }

  protected static boolean _privk3_performBehavior(final InterruptBehaviourAspectInterruptBehaviourAspectProperties _self_, final InterruptBehaviour _self) {
    return BlockAspect.traverseBlock(_self.getBlock());
  }
}
