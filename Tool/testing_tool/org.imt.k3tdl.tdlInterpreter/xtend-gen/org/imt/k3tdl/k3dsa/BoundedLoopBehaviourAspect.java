package org.imt.k3tdl.k3dsa;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.eclipse.xtext.xbase.lib.ExclusiveRange;
import org.etsi.mts.tdl.BoundedLoopBehaviour;

@Aspect(className = BoundedLoopBehaviour.class)
@SuppressWarnings("all")
public class BoundedLoopBehaviourAspect extends SingleCombinedBehaviourAspect {
  @OverrideAspectMethod
  public static boolean performBehavior(final BoundedLoopBehaviour _self) {
    final org.imt.k3tdl.k3dsa.BoundedLoopBehaviourAspectBoundedLoopBehaviourAspectProperties _self_ = org.imt.k3tdl.k3dsa.BoundedLoopBehaviourAspectBoundedLoopBehaviourAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# boolean performBehavior()
    if (_self instanceof org.etsi.mts.tdl.BoundedLoopBehaviour){
    	result = org.imt.k3tdl.k3dsa.BoundedLoopBehaviourAspect._privk3_performBehavior(_self_, (org.etsi.mts.tdl.BoundedLoopBehaviour)_self);
    };
    return (boolean)result;
  }

  private static boolean super_performBehavior(final BoundedLoopBehaviour _self) {
    final org.imt.k3tdl.k3dsa.SingleCombinedBehaviourAspectSingleCombinedBehaviourAspectProperties _self_ = org.imt.k3tdl.k3dsa.SingleCombinedBehaviourAspectSingleCombinedBehaviourAspectContext.getSelf(_self);
    return  org.imt.k3tdl.k3dsa.SingleCombinedBehaviourAspect._privk3_performBehavior(_self_, _self);
  }

  protected static boolean _privk3_performBehavior(final BoundedLoopBehaviourAspectBoundedLoopBehaviourAspectProperties _self_, final BoundedLoopBehaviour _self) {
    boolean result = true;
    int _numIteration = ExpressionAspect.getNumIteration(_self.getNumIteration().get(0));
    ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _numIteration, true);
    for (final Integer i : _doubleDotLessThan) {
      {
        result = BlockAspect.traverseBlock(_self.getBlock());
        if ((!result)) {
          return false;
        }
      }
    }
    return true;
  }
}
