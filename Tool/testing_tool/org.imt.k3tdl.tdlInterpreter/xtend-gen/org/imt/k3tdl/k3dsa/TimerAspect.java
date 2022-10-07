package org.imt.k3tdl.k3dsa;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.etsi.mts.tdl.Timer;

@Aspect(className = Timer.class)
@SuppressWarnings("all")
public class TimerAspect {
  public static void op(final Timer _self) {
    final org.imt.k3tdl.k3dsa.TimerAspectTimerAspectProperties _self_ = org.imt.k3tdl.k3dsa.TimerAspectTimerAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void op()
    if (_self instanceof org.etsi.mts.tdl.Timer){
    	org.imt.k3tdl.k3dsa.TimerAspect._privk3_op(_self_, (org.etsi.mts.tdl.Timer)_self);
    };
  }

  protected static void _privk3_op(final TimerAspectTimerAspectProperties _self_, final Timer _self) {
  }
}
