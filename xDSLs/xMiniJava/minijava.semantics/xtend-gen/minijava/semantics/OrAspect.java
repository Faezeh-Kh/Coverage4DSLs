package minijava.semantics;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import xminiJava.BooleanValue;
import xminiJava.Or;
import xminiJava.State;
import xminiJava.Value;
import xminiJava.XminiJavaFactory;

@Aspect(className = Or.class)
@SuppressWarnings("all")
public class OrAspect extends ExpressionAspect {
  @OverrideAspectMethod
  public static Value evaluateExpression(final Or _self, final State state) {
    final minijava.semantics.OrAspectOrAspectProperties _self_ = minijava.semantics.OrAspectOrAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Value evaluateExpression(State)
    if (_self instanceof xminiJava.Or){
    	result = minijava.semantics.OrAspect._privk3_evaluateExpression(_self_, (xminiJava.Or)_self,state);
    };
    return (xminiJava.Value)result;
  }

  private static Value super_evaluateExpression(final Or _self, final State state) {
    final minijava.semantics.ExpressionAspectExpressionAspectProperties _self_ = minijava.semantics.ExpressionAspectExpressionAspectContext.getSelf(_self);
    return  minijava.semantics.ExpressionAspect._privk3_evaluateExpression(_self_, _self,state);
  }

  protected static Value _privk3_evaluateExpression(final OrAspectOrAspectProperties _self_, final Or _self, final State state) {
    final Value left = ExpressionAspect.evaluateExpression(_self.getLeft(), state);
    final Value right = ExpressionAspect.evaluateExpression(_self.getRight(), state);
    if ((left instanceof BooleanValue)) {
      if ((right instanceof BooleanValue)) {
        BooleanValue _createBooleanValue = XminiJavaFactory.eINSTANCE.createBooleanValue();
        final Procedure1<BooleanValue> _function = new Procedure1<BooleanValue>() {
          public void apply(final BooleanValue it) {
            it.setValue((((BooleanValue)left).isValue() || ((BooleanValue)right).isValue()));
          }
        };
        return ObjectExtensions.<BooleanValue>operator_doubleArrow(_createBooleanValue, _function);
      }
    }
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Unsupported or operands: ");
    _builder.append(left);
    _builder.append(" || ");
    _builder.append(right);
    _builder.append(".");
    throw new RuntimeException(_builder.toString());
  }
}
