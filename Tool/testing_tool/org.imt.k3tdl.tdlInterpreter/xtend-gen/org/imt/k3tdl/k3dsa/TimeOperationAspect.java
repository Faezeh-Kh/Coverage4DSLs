package org.imt.k3tdl.k3dsa;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.etsi.mts.tdl.TimeOperation;

@Aspect(className = TimeOperation.class)
@SuppressWarnings("all")
public class TimeOperationAspect extends AtomicBehaviourAspect {
  @OverrideAspectMethod
  public static boolean performBehavior(final TimeOperation _self) {
    final org.imt.k3tdl.k3dsa.TimeOperationAspectTimeOperationAspectProperties _self_ = org.imt.k3tdl.k3dsa.TimeOperationAspectTimeOperationAspectContext.getSelf(_self);
    Object result = null;
    	// BeginInjectInto org.imt.k3tdl.k3dsa.TimeOperationAspect#boolean performBehavior() from org.imt.k3tdl.k3dsa.WaitAspect
    		if (_self instanceof org.etsi.mts.tdl.Wait){
    			result = org.imt.k3tdl.k3dsa.WaitAspect.performBehavior((org.etsi.mts.tdl.Wait)_self);
    		} else
    		// EndInjectInto org.imt.k3tdl.k3dsa.TimeOperationAspect#boolean performBehavior() from org.imt.k3tdl.k3dsa.WaitAspect
    	// BeginInjectInto org.imt.k3tdl.k3dsa.TimeOperationAspect#boolean performBehavior() from org.imt.k3tdl.k3dsa.QuiescenceAspect
    		if (_self instanceof org.etsi.mts.tdl.Quiescence){
    			result = org.imt.k3tdl.k3dsa.QuiescenceAspect.performBehavior((org.etsi.mts.tdl.Quiescence)_self);
    		} else
    		// EndInjectInto org.imt.k3tdl.k3dsa.TimeOperationAspect#boolean performBehavior() from org.imt.k3tdl.k3dsa.QuiescenceAspect
    // #DispatchPointCut_before# boolean performBehavior()
    if (_self instanceof org.etsi.mts.tdl.TimeOperation){
    	result = org.imt.k3tdl.k3dsa.TimeOperationAspect._privk3_performBehavior(_self_, (org.etsi.mts.tdl.TimeOperation)_self);
    };
    return (boolean)result;
  }

  private static boolean super_performBehavior(final TimeOperation _self) {
    final org.imt.k3tdl.k3dsa.AtomicBehaviourAspectAtomicBehaviourAspectProperties _self_ = org.imt.k3tdl.k3dsa.AtomicBehaviourAspectAtomicBehaviourAspectContext.getSelf(_self);
    return  org.imt.k3tdl.k3dsa.AtomicBehaviourAspect._privk3_performBehavior(_self_, _self);
  }

  protected static boolean _privk3_performBehavior(final TimeOperationAspectTimeOperationAspectProperties _self_, final TimeOperation _self) {
    return false;
  }
}
