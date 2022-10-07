package org.imt.k3tdl.k3dsa;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.etsi.mts.tdl.LocalExpression;
import org.etsi.mts.tdl.UnboundedLoopBehaviour;

@Aspect(className = UnboundedLoopBehaviour.class)
@SuppressWarnings("all")
public class UnBoundedLoopBehaviourAspect extends SingleCombinedBehaviourAspect {
  @OverrideAspectMethod
  public static boolean performBehavior(final UnboundedLoopBehaviour _self) {
    final org.imt.k3tdl.k3dsa.UnBoundedLoopBehaviourAspectUnboundedLoopBehaviourAspectProperties _self_ = org.imt.k3tdl.k3dsa.UnBoundedLoopBehaviourAspectUnboundedLoopBehaviourAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# boolean performBehavior()
    if (_self instanceof org.etsi.mts.tdl.UnboundedLoopBehaviour){
    	result = org.imt.k3tdl.k3dsa.UnBoundedLoopBehaviourAspect._privk3_performBehavior(_self_, (org.etsi.mts.tdl.UnboundedLoopBehaviour)_self);
    };
    return (boolean)result;
  }

  private static boolean super_performBehavior(final UnboundedLoopBehaviour _self) {
    final org.imt.k3tdl.k3dsa.SingleCombinedBehaviourAspectSingleCombinedBehaviourAspectProperties _self_ = org.imt.k3tdl.k3dsa.SingleCombinedBehaviourAspectSingleCombinedBehaviourAspectContext.getSelf(_self);
    return  org.imt.k3tdl.k3dsa.SingleCombinedBehaviourAspect._privk3_performBehavior(_self_, _self);
  }

  protected static boolean _privk3_performBehavior(final UnBoundedLoopBehaviourAspectUnboundedLoopBehaviourAspectProperties _self_, final UnboundedLoopBehaviour _self) {
    boolean result = true;
    int _size = _self.getBlock().getGuard().size();
    boolean _greaterThan = (_size > 0);
    if (_greaterThan) {
      final LocalExpression guard = _self.getBlock().getGuard().get(0);
      while (ExpressionAspect.validateExpression(guard)) {
        {
          result = BlockAspect.traverseBlock(_self.getBlock());
          if ((!result)) {
            return false;
          }
        }
      }
    } else {
    }
    return true;
  }
}
