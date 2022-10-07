package org.imt.k3tdl.k3dsa;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.etsi.mts.tdl.ExceptionalBehaviour;

@Aspect(className = ExceptionalBehaviour.class)
@SuppressWarnings("all")
public class ExceptionalBehaviourAspect extends BehaviourAspect {
  @OverrideAspectMethod
  public static boolean performBehavior(final ExceptionalBehaviour _self) {
    final org.imt.k3tdl.k3dsa.ExceptionalBehaviourAspectExceptionalBehaviourAspectProperties _self_ = org.imt.k3tdl.k3dsa.ExceptionalBehaviourAspectExceptionalBehaviourAspectContext.getSelf(_self);
    Object result = null;
    	// BeginInjectInto org.imt.k3tdl.k3dsa.ExceptionalBehaviourAspect#boolean performBehavior() from org.imt.k3tdl.k3dsa.InterruptBehaviourAspect
    		if (_self instanceof org.etsi.mts.tdl.InterruptBehaviour){
    			result = org.imt.k3tdl.k3dsa.InterruptBehaviourAspect.performBehavior((org.etsi.mts.tdl.InterruptBehaviour)_self);
    		} else
    		// EndInjectInto org.imt.k3tdl.k3dsa.ExceptionalBehaviourAspect#boolean performBehavior() from org.imt.k3tdl.k3dsa.InterruptBehaviourAspect
    	// BeginInjectInto org.imt.k3tdl.k3dsa.ExceptionalBehaviourAspect#boolean performBehavior() from org.imt.k3tdl.k3dsa.DefaultBehaviourAspect
    		if (_self instanceof org.etsi.mts.tdl.DefaultBehaviour){
    			result = org.imt.k3tdl.k3dsa.DefaultBehaviourAspect.performBehavior((org.etsi.mts.tdl.DefaultBehaviour)_self);
    		} else
    		// EndInjectInto org.imt.k3tdl.k3dsa.ExceptionalBehaviourAspect#boolean performBehavior() from org.imt.k3tdl.k3dsa.DefaultBehaviourAspect
    // #DispatchPointCut_before# boolean performBehavior()
    if (_self instanceof org.etsi.mts.tdl.ExceptionalBehaviour){
    	result = org.imt.k3tdl.k3dsa.ExceptionalBehaviourAspect._privk3_performBehavior(_self_, (org.etsi.mts.tdl.ExceptionalBehaviour)_self);
    };
    return (boolean)result;
  }

  private static boolean super_performBehavior(final ExceptionalBehaviour _self) {
    final org.imt.k3tdl.k3dsa.BehaviourAspectBehaviourAspectProperties _self_ = org.imt.k3tdl.k3dsa.BehaviourAspectBehaviourAspectContext.getSelf(_self);
    return  org.imt.k3tdl.k3dsa.BehaviourAspect._privk3_performBehavior(_self_, _self);
  }

  protected static boolean _privk3_performBehavior(final ExceptionalBehaviourAspectExceptionalBehaviourAspectProperties _self_, final ExceptionalBehaviour _self) {
    return false;
  }
}
