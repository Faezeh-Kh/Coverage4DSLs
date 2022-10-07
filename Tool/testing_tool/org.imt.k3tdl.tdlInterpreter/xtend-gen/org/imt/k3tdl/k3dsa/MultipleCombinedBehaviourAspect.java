package org.imt.k3tdl.k3dsa;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.etsi.mts.tdl.MultipleCombinedBehaviour;

@Aspect(className = MultipleCombinedBehaviour.class)
@SuppressWarnings("all")
public class MultipleCombinedBehaviourAspect extends CombinedBehaviourAspect {
  @OverrideAspectMethod
  public static boolean performBehavior(final MultipleCombinedBehaviour _self) {
    final org.imt.k3tdl.k3dsa.MultipleCombinedBehaviourAspectMultipleCombinedBehaviourAspectProperties _self_ = org.imt.k3tdl.k3dsa.MultipleCombinedBehaviourAspectMultipleCombinedBehaviourAspectContext.getSelf(_self);
    Object result = null;
    	// BeginInjectInto org.imt.k3tdl.k3dsa.MultipleCombinedBehaviourAspect#boolean performBehavior() from org.imt.k3tdl.k3dsa.AlternativeBehaviourAspect
    		if (_self instanceof org.etsi.mts.tdl.AlternativeBehaviour){
    			result = org.imt.k3tdl.k3dsa.AlternativeBehaviourAspect.performBehavior((org.etsi.mts.tdl.AlternativeBehaviour)_self);
    		} else
    		// EndInjectInto org.imt.k3tdl.k3dsa.MultipleCombinedBehaviourAspect#boolean performBehavior() from org.imt.k3tdl.k3dsa.AlternativeBehaviourAspect
    	// BeginInjectInto org.imt.k3tdl.k3dsa.MultipleCombinedBehaviourAspect#boolean performBehavior() from org.imt.k3tdl.k3dsa.ParallelBehaviourAspect
    		if (_self instanceof org.etsi.mts.tdl.ParallelBehaviour){
    			result = org.imt.k3tdl.k3dsa.ParallelBehaviourAspect.performBehavior((org.etsi.mts.tdl.ParallelBehaviour)_self);
    		} else
    		// EndInjectInto org.imt.k3tdl.k3dsa.MultipleCombinedBehaviourAspect#boolean performBehavior() from org.imt.k3tdl.k3dsa.ParallelBehaviourAspect
    	// BeginInjectInto org.imt.k3tdl.k3dsa.MultipleCombinedBehaviourAspect#boolean performBehavior() from org.imt.k3tdl.k3dsa.ConditionalBehaviourAspect
    		if (_self instanceof org.etsi.mts.tdl.ConditionalBehaviour){
    			result = org.imt.k3tdl.k3dsa.ConditionalBehaviourAspect.performBehavior((org.etsi.mts.tdl.ConditionalBehaviour)_self);
    		} else
    		// EndInjectInto org.imt.k3tdl.k3dsa.MultipleCombinedBehaviourAspect#boolean performBehavior() from org.imt.k3tdl.k3dsa.ConditionalBehaviourAspect
    // #DispatchPointCut_before# boolean performBehavior()
    if (_self instanceof org.etsi.mts.tdl.MultipleCombinedBehaviour){
    	result = org.imt.k3tdl.k3dsa.MultipleCombinedBehaviourAspect._privk3_performBehavior(_self_, (org.etsi.mts.tdl.MultipleCombinedBehaviour)_self);
    };
    return (boolean)result;
  }

  private static boolean super_performBehavior(final MultipleCombinedBehaviour _self) {
    final org.imt.k3tdl.k3dsa.CombinedBehaviourAspectCombinedBehaviourAspectProperties _self_ = org.imt.k3tdl.k3dsa.CombinedBehaviourAspectCombinedBehaviourAspectContext.getSelf(_self);
    return  org.imt.k3tdl.k3dsa.CombinedBehaviourAspect._privk3_performBehavior(_self_, _self);
  }

  protected static boolean _privk3_performBehavior(final MultipleCombinedBehaviourAspectMultipleCombinedBehaviourAspectProperties _self_, final MultipleCombinedBehaviour _self) {
    return false;
  }
}
