package org.imt.k3tdl.k3dsa;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.etsi.mts.tdl.PeriodicBehaviour;

@Aspect(className = PeriodicBehaviour.class)
@SuppressWarnings("all")
public class PeriodicBehaviourAspect extends BehaviourAspect {
  @OverrideAspectMethod
  public static boolean performBehavior(final PeriodicBehaviour _self) {
    final org.imt.k3tdl.k3dsa.PeriodicBehaviourAspectPeriodicBehaviourAspectProperties _self_ = org.imt.k3tdl.k3dsa.PeriodicBehaviourAspectPeriodicBehaviourAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# boolean performBehavior()
    if (_self instanceof org.etsi.mts.tdl.PeriodicBehaviour){
    	result = org.imt.k3tdl.k3dsa.PeriodicBehaviourAspect._privk3_performBehavior(_self_, (org.etsi.mts.tdl.PeriodicBehaviour)_self);
    };
    return (boolean)result;
  }

  private static boolean super_performBehavior(final PeriodicBehaviour _self) {
    final org.imt.k3tdl.k3dsa.BehaviourAspectBehaviourAspectProperties _self_ = org.imt.k3tdl.k3dsa.BehaviourAspectBehaviourAspectContext.getSelf(_self);
    return  org.imt.k3tdl.k3dsa.BehaviourAspect._privk3_performBehavior(_self_, _self);
  }

  protected static boolean _privk3_performBehavior(final PeriodicBehaviourAspectPeriodicBehaviourAspectProperties _self_, final PeriodicBehaviour _self) {
    return BlockAspect.traverseBlock(_self.getBlock());
  }
}
