package org.imt.k3tdl.k3dsa;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.ExclusiveRange;
import org.etsi.mts.tdl.Behaviour;
import org.etsi.mts.tdl.Block;
import org.etsi.mts.tdl.Stop;

@Aspect(className = Block.class)
@SuppressWarnings("all")
public class BlockAspect {
  public static boolean traverseBlock(final Block _self) {
    final org.imt.k3tdl.k3dsa.BlockAspectBlockAspectProperties _self_ = org.imt.k3tdl.k3dsa.BlockAspectBlockAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# boolean traverseBlock()
    if (_self instanceof org.etsi.mts.tdl.Block){
    	result = org.imt.k3tdl.k3dsa.BlockAspect._privk3_traverseBlock(_self_, (org.etsi.mts.tdl.Block)_self);
    };
    return (boolean)result;
  }

  protected static boolean _privk3_traverseBlock(final BlockAspectBlockAspectProperties _self_, final Block _self) {
    boolean canExecute = true;
    int _size = _self.getGuard().size();
    boolean _greaterThan = (_size > 0);
    if (_greaterThan) {
      try {
        int _size_1 = _self.getGuard().size();
        ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _size_1, true);
        for (final Integer i : _doubleDotLessThan) {
          {
            canExecute = ExpressionAspect.validateExpression(_self.getGuard().get((i).intValue()));
            if ((!canExecute)) {
              throw new InterruptedException();
            }
          }
        }
      } catch (final Throwable _t) {
        if (_t instanceof InterruptedException) {
          return false;
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      }
    }
    boolean result = true;
    EList<Behaviour> _behaviour = _self.getBehaviour();
    for (final Behaviour b : _behaviour) {
      {
        result = BehaviourAspect.performBehavior(b);
        if ((!result)) {
          return false;
        }
        if ((b instanceof Stop)) {
          return true;
        }
      }
    }
    return true;
  }
}
