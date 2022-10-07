package minijava.semantics;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import xminiJava.State;
import xminiJava.SymbolRef;
import xminiJava.Value;

@Aspect(className = SymbolRef.class)
@SuppressWarnings("all")
public class SymbolRefAspect extends ExpressionAspect {
  @OverrideAspectMethod
  public static Value evaluateExpression(final SymbolRef _self, final State state) {
    final minijava.semantics.SymbolRefAspectSymbolRefAspectProperties _self_ = minijava.semantics.SymbolRefAspectSymbolRefAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Value evaluateExpression(State)
    if (_self instanceof xminiJava.SymbolRef){
    	result = minijava.semantics.SymbolRefAspect._privk3_evaluateExpression(_self_, (xminiJava.SymbolRef)_self,state);
    };
    return (xminiJava.Value)result;
  }

  private static Value super_evaluateExpression(final SymbolRef _self, final State state) {
    final minijava.semantics.ExpressionAspectExpressionAspectProperties _self_ = minijava.semantics.ExpressionAspectExpressionAspectContext.getSelf(_self);
    return  minijava.semantics.ExpressionAspect._privk3_evaluateExpression(_self_, _self,state);
  }

  protected static Value _privk3_evaluateExpression(final SymbolRefAspectSymbolRefAspectProperties _self_, final SymbolRef _self, final State state) {
    return ValueAspect.copy(ContextAspect.findBinding(StateAspect.findCurrentContext(state), _self.getSymbol()).getValue());
  }
}
