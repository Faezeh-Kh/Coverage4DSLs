package minijava.semantics;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.Iterator;
import xminiJava.Block;
import xminiJava.Frame;
import xminiJava.State;
import xminiJava.Statement;

@Aspect(className = Block.class)
@SuppressWarnings("all")
public class BlockAspect extends StatementAspect {
  public static void evaluateStatementKeepContext(final Block _self, final State state) {
    final minijava.semantics.BlockAspectBlockAspectProperties _self_ = minijava.semantics.BlockAspectBlockAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void evaluateStatementKeepContext(State)
    if (_self instanceof xminiJava.Block){
    	minijava.semantics.BlockAspect._privk3_evaluateStatementKeepContext(_self_, (xminiJava.Block)_self,state);
    };
  }

  @OverrideAspectMethod
  public static void evaluateStatement(final Block _self, final State state) {
    final minijava.semantics.BlockAspectBlockAspectProperties _self_ = minijava.semantics.BlockAspectBlockAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void evaluateStatement(State)
    if (_self instanceof xminiJava.Block){
    	minijava.semantics.BlockAspect._privk3_evaluateStatement(_self_, (xminiJava.Block)_self,state);
    };
  }

  protected static void _privk3_evaluateStatementKeepContext(final BlockAspectBlockAspectProperties _self_, final Block _self, final State state) {
    StateAspect.pushNewContext(state);
    final Frame currentFrame = StateAspect.findCurrentFrame(state);
    Iterator<Statement> i = _self.getStatements().iterator();
    while ((i.hasNext() && (currentFrame.getReturnValue() == null))) {
      StatementAspect.evaluateStatement(i.next(), state);
    }
  }

  private static void super_evaluateStatement(final Block _self, final State state) {
    final minijava.semantics.StatementAspectStatementAspectProperties _self_ = minijava.semantics.StatementAspectStatementAspectContext.getSelf(_self);
     minijava.semantics.StatementAspect._privk3_evaluateStatement(_self_, _self,state);
  }

  protected static void _privk3_evaluateStatement(final BlockAspectBlockAspectProperties _self_, final Block _self, final State state) {
    BlockAspect.evaluateStatementKeepContext(_self, state);
    StateAspect.popCurrentContext(state);
  }
}
