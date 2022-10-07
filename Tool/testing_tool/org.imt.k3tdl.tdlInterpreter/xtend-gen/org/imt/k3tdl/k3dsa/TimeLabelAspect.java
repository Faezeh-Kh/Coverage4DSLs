package org.imt.k3tdl.k3dsa;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.etsi.mts.tdl.TimeLabel;

@Aspect(className = TimeLabel.class)
@SuppressWarnings("all")
public class TimeLabelAspect {
  public static void op(final TimeLabel _self) {
    final org.imt.k3tdl.k3dsa.TimeLabelAspectTimeLabelAspectProperties _self_ = org.imt.k3tdl.k3dsa.TimeLabelAspectTimeLabelAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void op()
    if (_self instanceof org.etsi.mts.tdl.TimeLabel){
    	org.imt.k3tdl.k3dsa.TimeLabelAspect._privk3_op(_self_, (org.etsi.mts.tdl.TimeLabel)_self);
    };
  }

  protected static void _privk3_op(final TimeLabelAspectTimeLabelAspectProperties _self_, final TimeLabel _self) {
  }
}
