package org.imt.k3tdl.k3dsa;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.etsi.mts.tdl.ActionBehaviour;

@Aspect(className = ActionBehaviour.class)
@SuppressWarnings("all")
public class ActionBehaviourAspect extends AtomicBehaviourAspect {
  @OverrideAspectMethod
  public static boolean performBehavior(final ActionBehaviour _self) {
    final org.imt.k3tdl.k3dsa.ActionBehaviourAspectActionBehaviourAspectProperties _self_ = org.imt.k3tdl.k3dsa.ActionBehaviourAspectActionBehaviourAspectContext.getSelf(_self);
    Object result = null;
    	// BeginInjectInto org.imt.k3tdl.k3dsa.ActionBehaviourAspect#boolean performBehavior() from org.imt.k3tdl.k3dsa.ActionReferenceAspect
    		if (_self instanceof org.etsi.mts.tdl.ActionReference){
    			result = org.imt.k3tdl.k3dsa.ActionReferenceAspect.performBehavior((org.etsi.mts.tdl.ActionReference)_self);
    		} else
    		// EndInjectInto org.imt.k3tdl.k3dsa.ActionBehaviourAspect#boolean performBehavior() from org.imt.k3tdl.k3dsa.ActionReferenceAspect
    	// BeginInjectInto org.imt.k3tdl.k3dsa.ActionBehaviourAspect#boolean performBehavior() from org.imt.k3tdl.k3dsa.AssertionAspect
    		if (_self instanceof org.etsi.mts.tdl.Assertion){
    			result = org.imt.k3tdl.k3dsa.AssertionAspect.performBehavior((org.etsi.mts.tdl.Assertion)_self);
    		} else
    		// EndInjectInto org.imt.k3tdl.k3dsa.ActionBehaviourAspect#boolean performBehavior() from org.imt.k3tdl.k3dsa.AssertionAspect
    	// BeginInjectInto org.imt.k3tdl.k3dsa.ActionBehaviourAspect#boolean performBehavior() from org.imt.k3tdl.k3dsa.InlineActionAspect
    		if (_self instanceof org.etsi.mts.tdl.InlineAction){
    			result = org.imt.k3tdl.k3dsa.InlineActionAspect.performBehavior((org.etsi.mts.tdl.InlineAction)_self);
    		} else
    		// EndInjectInto org.imt.k3tdl.k3dsa.ActionBehaviourAspect#boolean performBehavior() from org.imt.k3tdl.k3dsa.InlineActionAspect
    // #DispatchPointCut_before# boolean performBehavior()
    if (_self instanceof org.etsi.mts.tdl.ActionBehaviour){
    	result = org.imt.k3tdl.k3dsa.ActionBehaviourAspect._privk3_performBehavior(_self_, (org.etsi.mts.tdl.ActionBehaviour)_self);
    };
    return (boolean)result;
  }

  private static boolean super_performBehavior(final ActionBehaviour _self) {
    final org.imt.k3tdl.k3dsa.AtomicBehaviourAspectAtomicBehaviourAspectProperties _self_ = org.imt.k3tdl.k3dsa.AtomicBehaviourAspectAtomicBehaviourAspectContext.getSelf(_self);
    return  org.imt.k3tdl.k3dsa.AtomicBehaviourAspect._privk3_performBehavior(_self_, _self);
  }

  protected static boolean _privk3_performBehavior(final ActionBehaviourAspectActionBehaviourAspectProperties _self_, final ActionBehaviour _self) {
    return false;
  }
}
