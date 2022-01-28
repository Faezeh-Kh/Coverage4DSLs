package org.imt.xminijava.interpreter;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.imt.minijava.xminiJava.State;
import org.imt.minijava.xminiJava.SymbolRef;
import org.imt.minijava.xminiJava.Value;

@Aspect(className = SymbolRef.class)
@SuppressWarnings("all")
public class SymbolRefAspect extends ExpressionAspect {
  @OverrideAspectMethod
  public static Value evaluateExpression(final SymbolRef _self, final State state) {
    final org.imt.xminijava.interpreter.SymbolRefAspectSymbolRefAspectProperties _self_ = org.imt.xminijava.interpreter.SymbolRefAspectSymbolRefAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Value evaluateExpression(State)
    if (_self instanceof org.imt.minijava.xminiJava.SymbolRef){
    	result = org.imt.xminijava.interpreter.SymbolRefAspect._privk3_evaluateExpression(_self_, (org.imt.minijava.xminiJava.SymbolRef)_self,state);
    };
    return (org.imt.minijava.xminiJava.Value)result;
  }
  
  private static Value super_evaluateExpression(final SymbolRef _self, final State state) {
    final org.imt.xminijava.interpreter.ExpressionAspectExpressionAspectProperties _self_ = org.imt.xminijava.interpreter.ExpressionAspectExpressionAspectContext.getSelf(_self);
    return  org.imt.xminijava.interpreter.ExpressionAspect._privk3_evaluateExpression(_self_, _self,state);
  }
  
  protected static Value _privk3_evaluateExpression(final SymbolRefAspectSymbolRefAspectProperties _self_, final SymbolRef _self, final State state) {
    return ValueAspect.copy(ContextAspect.findBinding(StateAspect.findCurrentContext(state), _self.getSymbol()).getValue());
  }
}
