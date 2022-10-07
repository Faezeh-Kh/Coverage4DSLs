package minijava.semantics;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import xminiJava.IntegerValue;
import xminiJava.Neg;
import xminiJava.State;
import xminiJava.Value;
import xminiJava.XminiJavaFactory;

@Aspect(className = Neg.class)
@SuppressWarnings("all")
public class NegAspect extends ExpressionAspect {
  @OverrideAspectMethod
  public static Value evaluateExpression(final Neg _self, final State state) {
    final minijava.semantics.NegAspectNegAspectProperties _self_ = minijava.semantics.NegAspectNegAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Value evaluateExpression(State)
    if (_self instanceof xminiJava.Neg){
    	result = minijava.semantics.NegAspect._privk3_evaluateExpression(_self_, (xminiJava.Neg)_self,state);
    };
    return (xminiJava.Value)result;
  }

  private static Value super_evaluateExpression(final Neg _self, final State state) {
    final minijava.semantics.ExpressionAspectExpressionAspectProperties _self_ = minijava.semantics.ExpressionAspectExpressionAspectContext.getSelf(_self);
    return  minijava.semantics.ExpressionAspect._privk3_evaluateExpression(_self_, _self,state);
  }

  protected static Value _privk3_evaluateExpression(final NegAspectNegAspectProperties _self_, final Neg _self, final State state) {
    Value _evaluateExpression = ExpressionAspect.evaluateExpression(_self.getExpression(), state);
    final int intabsvalue = ((IntegerValue) _evaluateExpression).getValue();
    IntegerValue _createIntegerValue = XminiJavaFactory.eINSTANCE.createIntegerValue();
    final Procedure1<IntegerValue> _function = new Procedure1<IntegerValue>() {
      public void apply(final IntegerValue it) {
        it.setValue((-intabsvalue));
      }
    };
    return ObjectExtensions.<IntegerValue>operator_doubleArrow(_createIntegerValue, _function);
  }
}
