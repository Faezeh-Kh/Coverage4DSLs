package org.imt.k3tdl.k3dsa;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.eclipse.emf.common.util.EList;
import org.etsi.mts.tdl.AlternativeBehaviour;
import org.etsi.mts.tdl.Behaviour;
import org.etsi.mts.tdl.Block;

@Aspect(className = AlternativeBehaviour.class)
@SuppressWarnings("all")
public class AlternativeBehaviourAspect extends MultipleCombinedBehaviourAspect {
  @OverrideAspectMethod
  public static boolean performBehavior(final AlternativeBehaviour _self) {
    final org.imt.k3tdl.k3dsa.AlternativeBehaviourAspectAlternativeBehaviourAspectProperties _self_ = org.imt.k3tdl.k3dsa.AlternativeBehaviourAspectAlternativeBehaviourAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# boolean performBehavior()
    if (_self instanceof org.etsi.mts.tdl.AlternativeBehaviour){
    	result = org.imt.k3tdl.k3dsa.AlternativeBehaviourAspect._privk3_performBehavior(_self_, (org.etsi.mts.tdl.AlternativeBehaviour)_self);
    };
    return (boolean)result;
  }

  private static boolean super_performBehavior(final AlternativeBehaviour _self) {
    final org.imt.k3tdl.k3dsa.MultipleCombinedBehaviourAspectMultipleCombinedBehaviourAspectProperties _self_ = org.imt.k3tdl.k3dsa.MultipleCombinedBehaviourAspectMultipleCombinedBehaviourAspectContext.getSelf(_self);
    return  org.imt.k3tdl.k3dsa.MultipleCombinedBehaviourAspect._privk3_performBehavior(_self_, _self);
  }

  protected static boolean _privk3_performBehavior(final AlternativeBehaviourAspectAlternativeBehaviourAspectProperties _self_, final AlternativeBehaviour _self) {
    boolean result = true;
    EList<Block> _block = _self.getBlock();
    for (final Block innerBlock : _block) {
      EList<Behaviour> _behaviour = innerBlock.getBehaviour();
      for (final Behaviour b : _behaviour) {
        {
          BehaviourAspect.enabledBehaviour(_self, b);
          result = BehaviourAspect.performBehavior(b);
          if ((!result)) {
            return result;
          }
        }
      }
    }
    return false;
  }
}
