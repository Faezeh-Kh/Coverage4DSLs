package org.imt.k3tdl.k3dsa;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.etsi.mts.tdl.TimerOperation;

@Aspect(className = TimerOperation.class)
@SuppressWarnings("all")
public class TimerOperationAspect extends AtomicBehaviourAspect {
  @OverrideAspectMethod
  public static boolean performBehavior(final TimerOperation _self) {
    final org.imt.k3tdl.k3dsa.TimerOperationAspectTimerOperationAspectProperties _self_ = org.imt.k3tdl.k3dsa.TimerOperationAspectTimerOperationAspectContext.getSelf(_self);
    Object result = null;
    	// BeginInjectInto org.imt.k3tdl.k3dsa.TimerOperationAspect#boolean performBehavior() from org.imt.k3tdl.k3dsa.TimerStartAspect
    		if (_self instanceof org.etsi.mts.tdl.TimerStart){
    			result = org.imt.k3tdl.k3dsa.TimerStartAspect.performBehavior((org.etsi.mts.tdl.TimerStart)_self);
    		} else
    		// EndInjectInto org.imt.k3tdl.k3dsa.TimerOperationAspect#boolean performBehavior() from org.imt.k3tdl.k3dsa.TimerStartAspect
    	// BeginInjectInto org.imt.k3tdl.k3dsa.TimerOperationAspect#boolean performBehavior() from org.imt.k3tdl.k3dsa.TimerStopAspect
    		if (_self instanceof org.etsi.mts.tdl.TimerStop){
    			result = org.imt.k3tdl.k3dsa.TimerStopAspect.performBehavior((org.etsi.mts.tdl.TimerStop)_self);
    		} else
    		// EndInjectInto org.imt.k3tdl.k3dsa.TimerOperationAspect#boolean performBehavior() from org.imt.k3tdl.k3dsa.TimerStopAspect
    	// BeginInjectInto org.imt.k3tdl.k3dsa.TimerOperationAspect#boolean performBehavior() from org.imt.k3tdl.k3dsa.TimeOutAspect
    		if (_self instanceof org.etsi.mts.tdl.TimeOut){
    			result = org.imt.k3tdl.k3dsa.TimeOutAspect.performBehavior((org.etsi.mts.tdl.TimeOut)_self);
    		} else
    		// EndInjectInto org.imt.k3tdl.k3dsa.TimerOperationAspect#boolean performBehavior() from org.imt.k3tdl.k3dsa.TimeOutAspect
    // #DispatchPointCut_before# boolean performBehavior()
    if (_self instanceof org.etsi.mts.tdl.TimerOperation){
    	result = org.imt.k3tdl.k3dsa.TimerOperationAspect._privk3_performBehavior(_self_, (org.etsi.mts.tdl.TimerOperation)_self);
    };
    return (boolean)result;
  }

  private static boolean super_performBehavior(final TimerOperation _self) {
    final org.imt.k3tdl.k3dsa.AtomicBehaviourAspectAtomicBehaviourAspectProperties _self_ = org.imt.k3tdl.k3dsa.AtomicBehaviourAspectAtomicBehaviourAspectContext.getSelf(_self);
    return  org.imt.k3tdl.k3dsa.AtomicBehaviourAspect._privk3_performBehavior(_self_, _self);
  }

  protected static boolean _privk3_performBehavior(final TimerOperationAspectTimerOperationAspectProperties _self_, final TimerOperation _self) {
    return false;
  }
}
