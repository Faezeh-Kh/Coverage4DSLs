package org.imt.k3tdl.k3dsa;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.etsi.mts.tdl.TimeConstraint;

@Aspect(className = TimeConstraint.class)
@SuppressWarnings("all")
public class TimeConstraintAspect {
  public static void op(final TimeConstraint _self) {
    final org.imt.k3tdl.k3dsa.TimeConstraintAspectTimeConstraintAspectProperties _self_ = org.imt.k3tdl.k3dsa.TimeConstraintAspectTimeConstraintAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void op()
    if (_self instanceof org.etsi.mts.tdl.TimeConstraint){
    	org.imt.k3tdl.k3dsa.TimeConstraintAspect._privk3_op(_self_, (org.etsi.mts.tdl.TimeConstraint)_self);
    };
  }

  protected static void _privk3_op(final TimeConstraintAspectTimeConstraintAspectProperties _self_, final TimeConstraint _self) {
  }
}
