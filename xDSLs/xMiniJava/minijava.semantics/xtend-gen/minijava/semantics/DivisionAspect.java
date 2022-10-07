package minijava.semantics;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import xminiJava.Division;
import xminiJava.IntegerValue;
import xminiJava.State;
import xminiJava.Value;
import xminiJava.XminiJavaFactory;

@Aspect(className = Division.class)
@SuppressWarnings("all")
public class DivisionAspect extends ExpressionAspect {
  @OverrideAspectMethod
  public static Value evaluateExpression(final Division _self, final State state) {
    final minijava.semantics.DivisionAspectDivisionAspectProperties _self_ = minijava.semantics.DivisionAspectDivisionAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Value evaluateExpression(State)
    if (_self instanceof xminiJava.Division){
    	result = minijava.semantics.DivisionAspect._privk3_evaluateExpression(_self_, (xminiJava.Division)_self,state);
    };
    return (xminiJava.Value)result;
  }

  private static Value super_evaluateExpression(final Division _self, final State state) {
    final minijava.semantics.ExpressionAspectExpressionAspectProperties _self_ = minijava.semantics.ExpressionAspectExpressionAspectContext.getSelf(_self);
    return  minijava.semantics.ExpressionAspect._privk3_evaluateExpression(_self_, _self,state);
  }

  protected static Value _privk3_evaluateExpression(final DivisionAspectDivisionAspectProperties _self_, final Division _self, final State state) {
    Value _evaluateExpression = ExpressionAspect.evaluateExpression(_self.getLeft(), state);
    final int left = ((IntegerValue) _evaluateExpression).getValue();
    Value _evaluateExpression_1 = ExpressionAspect.evaluateExpression(_self.getRight(), state);
    final int right = ((IntegerValue) _evaluateExpression_1).getValue();
    IntegerValue _createIntegerValue = XminiJavaFactory.eINSTANCE.createIntegerValue();
    final Procedure1<IntegerValue> _function = new Procedure1<IntegerValue>() {
      public void apply(final IntegerValue it) {
        it.setValue((left / right));
      }
    };
    return ObjectExtensions.<IntegerValue>operator_doubleArrow(_createIntegerValue, _function);
  }
}
