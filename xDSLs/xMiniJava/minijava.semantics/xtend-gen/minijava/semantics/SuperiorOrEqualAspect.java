package minijava.semantics;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import xminiJava.BooleanValue;
import xminiJava.IntegerValue;
import xminiJava.State;
import xminiJava.SuperiorOrEqual;
import xminiJava.Value;
import xminiJava.XminiJavaFactory;

@Aspect(className = SuperiorOrEqual.class)
@SuppressWarnings("all")
public class SuperiorOrEqualAspect extends ExpressionAspect {
  @OverrideAspectMethod
  public static Value evaluateExpression(final SuperiorOrEqual _self, final State state) {
    final minijava.semantics.SuperiorOrEqualAspectSuperiorOrEqualAspectProperties _self_ = minijava.semantics.SuperiorOrEqualAspectSuperiorOrEqualAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Value evaluateExpression(State)
    if (_self instanceof xminiJava.SuperiorOrEqual){
    	result = minijava.semantics.SuperiorOrEqualAspect._privk3_evaluateExpression(_self_, (xminiJava.SuperiorOrEqual)_self,state);
    };
    return (xminiJava.Value)result;
  }

  private static Value super_evaluateExpression(final SuperiorOrEqual _self, final State state) {
    final minijava.semantics.ExpressionAspectExpressionAspectProperties _self_ = minijava.semantics.ExpressionAspectExpressionAspectContext.getSelf(_self);
    return  minijava.semantics.ExpressionAspect._privk3_evaluateExpression(_self_, _self,state);
  }

  protected static Value _privk3_evaluateExpression(final SuperiorOrEqualAspectSuperiorOrEqualAspectProperties _self_, final SuperiorOrEqual _self, final State state) {
    Value _evaluateExpression = ExpressionAspect.evaluateExpression(_self.getLeft(), state);
    final int left = ((IntegerValue) _evaluateExpression).getValue();
    Value _evaluateExpression_1 = ExpressionAspect.evaluateExpression(_self.getRight(), state);
    final int right = ((IntegerValue) _evaluateExpression_1).getValue();
    BooleanValue _createBooleanValue = XminiJavaFactory.eINSTANCE.createBooleanValue();
    final Procedure1<BooleanValue> _function = new Procedure1<BooleanValue>() {
      public void apply(final BooleanValue it) {
        it.setValue((left >= right));
      }
    };
    return ObjectExtensions.<BooleanValue>operator_doubleArrow(_createBooleanValue, _function);
  }
}
