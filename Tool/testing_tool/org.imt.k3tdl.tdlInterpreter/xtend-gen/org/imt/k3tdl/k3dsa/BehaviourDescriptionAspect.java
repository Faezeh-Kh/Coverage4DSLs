package org.imt.k3tdl.k3dsa;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.etsi.mts.tdl.BehaviourDescription;

@Aspect(className = BehaviourDescription.class)
@SuppressWarnings("all")
public class BehaviourDescriptionAspect {
  public static boolean callBehavior(final BehaviourDescription _self) {
    final org.imt.k3tdl.k3dsa.BehaviourDescriptionAspectBehaviourDescriptionAspectProperties _self_ = org.imt.k3tdl.k3dsa.BehaviourDescriptionAspectBehaviourDescriptionAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# boolean callBehavior()
    if (_self instanceof org.etsi.mts.tdl.BehaviourDescription){
    	result = org.imt.k3tdl.k3dsa.BehaviourDescriptionAspect._privk3_callBehavior(_self_, (org.etsi.mts.tdl.BehaviourDescription)_self);
    };
    return (boolean)result;
  }

  protected static boolean _privk3_callBehavior(final BehaviourDescriptionAspectBehaviourDescriptionAspectProperties _self_, final BehaviourDescription _self) {
    return BehaviourAspect.performBehavior(_self.getBehaviour());
  }
}
