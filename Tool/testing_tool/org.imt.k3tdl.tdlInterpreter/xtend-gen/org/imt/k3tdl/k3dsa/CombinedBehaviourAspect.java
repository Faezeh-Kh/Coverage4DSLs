package org.imt.k3tdl.k3dsa;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.etsi.mts.tdl.CombinedBehaviour;

@Aspect(className = CombinedBehaviour.class)
@SuppressWarnings("all")
public class CombinedBehaviourAspect extends BehaviourAspect {
  @OverrideAspectMethod
  public static boolean performBehavior(final CombinedBehaviour _self) {
    final org.imt.k3tdl.k3dsa.CombinedBehaviourAspectCombinedBehaviourAspectProperties _self_ = org.imt.k3tdl.k3dsa.CombinedBehaviourAspectCombinedBehaviourAspectContext.getSelf(_self);
    Object result = null;
    	// BeginInjectInto org.imt.k3tdl.k3dsa.CombinedBehaviourAspect#boolean performBehavior() from org.imt.k3tdl.k3dsa.UnBoundedLoopBehaviourAspect
    		if (_self instanceof org.etsi.mts.tdl.UnboundedLoopBehaviour){
    			result = org.imt.k3tdl.k3dsa.UnBoundedLoopBehaviourAspect.performBehavior((org.etsi.mts.tdl.UnboundedLoopBehaviour)_self);
    		} else
    		// EndInjectInto org.imt.k3tdl.k3dsa.CombinedBehaviourAspect#boolean performBehavior() from org.imt.k3tdl.k3dsa.UnBoundedLoopBehaviourAspect
    	// BeginInjectInto org.imt.k3tdl.k3dsa.CombinedBehaviourAspect#boolean performBehavior() from org.imt.k3tdl.k3dsa.MultipleCombinedBehaviourAspect
    		if (_self instanceof org.etsi.mts.tdl.MultipleCombinedBehaviour){
    			result = org.imt.k3tdl.k3dsa.MultipleCombinedBehaviourAspect.performBehavior((org.etsi.mts.tdl.MultipleCombinedBehaviour)_self);
    		} else
    		// EndInjectInto org.imt.k3tdl.k3dsa.CombinedBehaviourAspect#boolean performBehavior() from org.imt.k3tdl.k3dsa.MultipleCombinedBehaviourAspect
    	// BeginInjectInto org.imt.k3tdl.k3dsa.CombinedBehaviourAspect#boolean performBehavior() from org.imt.k3tdl.k3dsa.BoundedLoopBehaviourAspect
    		if (_self instanceof org.etsi.mts.tdl.BoundedLoopBehaviour){
    			result = org.imt.k3tdl.k3dsa.BoundedLoopBehaviourAspect.performBehavior((org.etsi.mts.tdl.BoundedLoopBehaviour)_self);
    		} else
    		// EndInjectInto org.imt.k3tdl.k3dsa.CombinedBehaviourAspect#boolean performBehavior() from org.imt.k3tdl.k3dsa.BoundedLoopBehaviourAspect
    	// BeginInjectInto org.imt.k3tdl.k3dsa.CombinedBehaviourAspect#boolean performBehavior() from org.imt.k3tdl.k3dsa.AlternativeBehaviourAspect
    		if (_self instanceof org.etsi.mts.tdl.AlternativeBehaviour){
    			result = org.imt.k3tdl.k3dsa.AlternativeBehaviourAspect.performBehavior((org.etsi.mts.tdl.AlternativeBehaviour)_self);
    		} else
    		// EndInjectInto org.imt.k3tdl.k3dsa.CombinedBehaviourAspect#boolean performBehavior() from org.imt.k3tdl.k3dsa.AlternativeBehaviourAspect
    	// BeginInjectInto org.imt.k3tdl.k3dsa.CombinedBehaviourAspect#boolean performBehavior() from org.imt.k3tdl.k3dsa.SingleCombinedBehaviourAspect
    		if (_self instanceof org.etsi.mts.tdl.SingleCombinedBehaviour){
    			result = org.imt.k3tdl.k3dsa.SingleCombinedBehaviourAspect.performBehavior((org.etsi.mts.tdl.SingleCombinedBehaviour)_self);
    		} else
    		// EndInjectInto org.imt.k3tdl.k3dsa.CombinedBehaviourAspect#boolean performBehavior() from org.imt.k3tdl.k3dsa.SingleCombinedBehaviourAspect
    	// BeginInjectInto org.imt.k3tdl.k3dsa.CombinedBehaviourAspect#boolean performBehavior() from org.imt.k3tdl.k3dsa.OptionalBehaviourAspect
    		if (_self instanceof org.etsi.mts.tdl.OptionalBehaviour){
    			result = org.imt.k3tdl.k3dsa.OptionalBehaviourAspect.performBehavior((org.etsi.mts.tdl.OptionalBehaviour)_self);
    		} else
    		// EndInjectInto org.imt.k3tdl.k3dsa.CombinedBehaviourAspect#boolean performBehavior() from org.imt.k3tdl.k3dsa.OptionalBehaviourAspect
    	// BeginInjectInto org.imt.k3tdl.k3dsa.CombinedBehaviourAspect#boolean performBehavior() from org.imt.k3tdl.k3dsa.CompoundBehaviourAspect
    		if (_self instanceof org.etsi.mts.tdl.CompoundBehaviour){
    			result = org.imt.k3tdl.k3dsa.CompoundBehaviourAspect.performBehavior((org.etsi.mts.tdl.CompoundBehaviour)_self);
    		} else
    		// EndInjectInto org.imt.k3tdl.k3dsa.CombinedBehaviourAspect#boolean performBehavior() from org.imt.k3tdl.k3dsa.CompoundBehaviourAspect
    	// BeginInjectInto org.imt.k3tdl.k3dsa.CombinedBehaviourAspect#boolean performBehavior() from org.imt.k3tdl.k3dsa.ParallelBehaviourAspect
    		if (_self instanceof org.etsi.mts.tdl.ParallelBehaviour){
    			result = org.imt.k3tdl.k3dsa.ParallelBehaviourAspect.performBehavior((org.etsi.mts.tdl.ParallelBehaviour)_self);
    		} else
    		// EndInjectInto org.imt.k3tdl.k3dsa.CombinedBehaviourAspect#boolean performBehavior() from org.imt.k3tdl.k3dsa.ParallelBehaviourAspect
    	// BeginInjectInto org.imt.k3tdl.k3dsa.CombinedBehaviourAspect#boolean performBehavior() from org.imt.k3tdl.k3dsa.ConditionalBehaviourAspect
    		if (_self instanceof org.etsi.mts.tdl.ConditionalBehaviour){
    			result = org.imt.k3tdl.k3dsa.ConditionalBehaviourAspect.performBehavior((org.etsi.mts.tdl.ConditionalBehaviour)_self);
    		} else
    		// EndInjectInto org.imt.k3tdl.k3dsa.CombinedBehaviourAspect#boolean performBehavior() from org.imt.k3tdl.k3dsa.ConditionalBehaviourAspect
    // #DispatchPointCut_before# boolean performBehavior()
    if (_self instanceof org.etsi.mts.tdl.CombinedBehaviour){
    	result = org.imt.k3tdl.k3dsa.CombinedBehaviourAspect._privk3_performBehavior(_self_, (org.etsi.mts.tdl.CombinedBehaviour)_self);
    };
    return (boolean)result;
  }

  private static boolean super_performBehavior(final CombinedBehaviour _self) {
    final org.imt.k3tdl.k3dsa.BehaviourAspectBehaviourAspectProperties _self_ = org.imt.k3tdl.k3dsa.BehaviourAspectBehaviourAspectContext.getSelf(_self);
    return  org.imt.k3tdl.k3dsa.BehaviourAspect._privk3_performBehavior(_self_, _self);
  }

  protected static boolean _privk3_performBehavior(final CombinedBehaviourAspectCombinedBehaviourAspectProperties _self_, final CombinedBehaviour _self) {
    return false;
  }
}
