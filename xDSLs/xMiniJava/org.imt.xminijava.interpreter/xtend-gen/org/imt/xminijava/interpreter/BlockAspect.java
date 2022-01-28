package org.imt.xminijava.interpreter;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.Iterator;
import org.imt.minijava.xminiJava.Block;
import org.imt.minijava.xminiJava.Frame;
import org.imt.minijava.xminiJava.State;
import org.imt.minijava.xminiJava.Statement;

@Aspect(className = Block.class)
@SuppressWarnings("all")
public class BlockAspect extends StatementAspect {
  public static void evaluateStatementKeepContext(final Block _self, final State state) {
    final org.imt.xminijava.interpreter.BlockAspectBlockAspectProperties _self_ = org.imt.xminijava.interpreter.BlockAspectBlockAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void evaluateStatementKeepContext(State)
    if (_self instanceof org.imt.minijava.xminiJava.Block){
    	org.imt.xminijava.interpreter.BlockAspect._privk3_evaluateStatementKeepContext(_self_, (org.imt.minijava.xminiJava.Block)_self,state);
    };
  }
  
  @OverrideAspectMethod
  public static void evaluateStatement(final Block _self, final State state) {
    final org.imt.xminijava.interpreter.BlockAspectBlockAspectProperties _self_ = org.imt.xminijava.interpreter.BlockAspectBlockAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void evaluateStatement(State)
    if (_self instanceof org.imt.minijava.xminiJava.Block){
    	org.imt.xminijava.interpreter.BlockAspect._privk3_evaluateStatement(_self_, (org.imt.minijava.xminiJava.Block)_self,state);
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
    final org.imt.xminijava.interpreter.StatementAspectStatementAspectProperties _self_ = org.imt.xminijava.interpreter.StatementAspectStatementAspectContext.getSelf(_self);
     org.imt.xminijava.interpreter.StatementAspect._privk3_evaluateStatement(_self_, _self,state);
  }
  
  protected static void _privk3_evaluateStatement(final BlockAspectBlockAspectProperties _self_, final Block _self, final State state) {
    BlockAspect.evaluateStatementKeepContext(_self, state);
    StateAspect.popCurrentContext(state);
  }
}
