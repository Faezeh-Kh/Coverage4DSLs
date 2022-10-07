package org.imt.k3tdl.k3dsa;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.etsi.mts.tdl.SingleCombinedBehaviour;

@Aspect(className = SingleCombinedBehaviour.class)
@SuppressWarnings("all")
public class SingleCombinedBehaviourAspect extends CombinedBehaviourAspect {
  @OverrideAspectMethod
  public static boolean performBehavior(final SingleCombinedBehaviour _self) {
    final org.imt.k3tdl.k3dsa.SingleCombinedBehaviourAspectSingleCombinedBehaviourAspectProperties _self_ = org.imt.k3tdl.k3dsa.SingleCombinedBehaviourAspectSingleCombinedBehaviourAspectContext.getSelf(_self);
    Object result = null;
    	// BeginInjectInto org.imt.k3tdl.k3dsa.SingleCombinedBehaviourAspect#boolean performBehavior() from org.imt.k3tdl.k3dsa.CompoundBehaviourAspect
    		if (_self instanceof org.etsi.mts.tdl.CompoundBehaviour){
    			result = org.imt.k3tdl.k3dsa.CompoundBehaviourAspect.performBehavior((org.etsi.mts.tdl.CompoundBehaviour)_self);
    		} else
    		// EndInjectInto org.imt.k3tdl.k3dsa.SingleCombinedBehaviourAspect#boolean performBehavior() from org.imt.k3tdl.k3dsa.CompoundBehaviourAspect
    	// BeginInjectInto org.imt.k3tdl.k3dsa.SingleCombinedBehaviourAspect#boolean performBehavior() from org.imt.k3tdl.k3dsa.OptionalBehaviourAspect
    		if (_self instanceof org.etsi.mts.tdl.OptionalBehaviour){
    			result = org.imt.k3tdl.k3dsa.OptionalBehaviourAspect.performBehavior((org.etsi.mts.tdl.OptionalBehaviour)_self);
    		} else
    		// EndInjectInto org.imt.k3tdl.k3dsa.SingleCombinedBehaviourAspect#boolean performBehavior() from org.imt.k3tdl.k3dsa.OptionalBehaviourAspect
    	// BeginInjectInto org.imt.k3tdl.k3dsa.SingleCombinedBehaviourAspect#boolean performBehavior() from org.imt.k3tdl.k3dsa.BoundedLoopBehaviourAspect
    		if (_self instanceof org.etsi.mts.tdl.BoundedLoopBehaviour){
    			result = org.imt.k3tdl.k3dsa.BoundedLoopBehaviourAspect.performBehavior((org.etsi.mts.tdl.BoundedLoopBehaviour)_self);
    		} else
    		// EndInjectInto org.imt.k3tdl.k3dsa.SingleCombinedBehaviourAspect#boolean performBehavior() from org.imt.k3tdl.k3dsa.BoundedLoopBehaviourAspect
    	// BeginInjectInto org.imt.k3tdl.k3dsa.SingleCombinedBehaviourAspect#boolean performBehavior() from org.imt.k3tdl.k3dsa.UnBoundedLoopBehaviourAspect
    		if (_self instanceof org.etsi.mts.tdl.UnboundedLoopBehaviour){
    			result = org.imt.k3tdl.k3dsa.UnBoundedLoopBehaviourAspect.performBehavior((org.etsi.mts.tdl.UnboundedLoopBehaviour)_self);
    		} else
    		// EndInjectInto org.imt.k3tdl.k3dsa.SingleCombinedBehaviourAspect#boolean performBehavior() from org.imt.k3tdl.k3dsa.UnBoundedLoopBehaviourAspect
    // #DispatchPointCut_before# boolean performBehavior()
    if (_self instanceof org.etsi.mts.tdl.SingleCombinedBehaviour){
    	result = org.imt.k3tdl.k3dsa.SingleCombinedBehaviourAspect._privk3_performBehavior(_self_, (org.etsi.mts.tdl.SingleCombinedBehaviour)_self);
    };
    return (boolean)result;
  }

  private static boolean super_performBehavior(final SingleCombinedBehaviour _self) {
    final org.imt.k3tdl.k3dsa.CombinedBehaviourAspectCombinedBehaviourAspectProperties _self_ = org.imt.k3tdl.k3dsa.CombinedBehaviourAspectCombinedBehaviourAspectContext.getSelf(_self);
    return  org.imt.k3tdl.k3dsa.CombinedBehaviourAspect._privk3_performBehavior(_self_, _self);
  }

  protected static boolean _privk3_performBehavior(final SingleCombinedBehaviourAspectSingleCombinedBehaviourAspectProperties _self_, final SingleCombinedBehaviour _self) {
    return BlockAspect.traverseBlock(_self.getBlock());
  }
}
