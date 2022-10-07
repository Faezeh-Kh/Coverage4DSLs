package minijava.semantics;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import xminiJava.IntConstant;
import xminiJava.IntegerValue;
import xminiJava.State;
import xminiJava.Value;
import xminiJava.XminiJavaFactory;

@Aspect(className = IntConstant.class)
@SuppressWarnings("all")
public class IntConstantAspect extends ExpressionAspect {
  @OverrideAspectMethod
  public static Value evaluateExpression(final IntConstant _self, final State state) {
    final minijava.semantics.IntConstantAspectIntConstantAspectProperties _self_ = minijava.semantics.IntConstantAspectIntConstantAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Value evaluateExpression(State)
    if (_self instanceof xminiJava.IntConstant){
    	result = minijava.semantics.IntConstantAspect._privk3_evaluateExpression(_self_, (xminiJava.IntConstant)_self,state);
    };
    return (xminiJava.Value)result;
  }

  private static Value super_evaluateExpression(final IntConstant _self, final State state) {
    final minijava.semantics.ExpressionAspectExpressionAspectProperties _self_ = minijava.semantics.ExpressionAspectExpressionAspectContext.getSelf(_self);
    return  minijava.semantics.ExpressionAspect._privk3_evaluateExpression(_self_, _self,state);
  }

  protected static Value _privk3_evaluateExpression(final IntConstantAspectIntConstantAspectProperties _self_, final IntConstant _self, final State state) {
    IntegerValue _createIntegerValue = XminiJavaFactory.eINSTANCE.createIntegerValue();
    final Procedure1<IntegerValue> _function = new Procedure1<IntegerValue>() {
      public void apply(final IntegerValue it) {
        it.setValue(_self.getValue());
      }
    };
    return ObjectExtensions.<IntegerValue>operator_doubleArrow(_createIntegerValue, _function);
  }
}
