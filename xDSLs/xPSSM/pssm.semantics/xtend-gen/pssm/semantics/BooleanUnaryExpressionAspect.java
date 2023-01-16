package pssm.semantics;

import com.google.common.base.Objects;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import java.util.ArrayList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import statemachines.AttributeValue;
import statemachines.BooleanAttribute;
import statemachines.BooleanAttributeValue;
import statemachines.BooleanUnaryExpression;
import statemachines.BooleanUnaryOperator;
import statemachines.CallEventOccurrence;
import statemachines.EventOccurrence;
import statemachines.SignalEventOccurrence;

@Aspect(className = BooleanUnaryExpression.class)
@SuppressWarnings("all")
public class BooleanUnaryExpressionAspect {
  public static boolean evaluate(final BooleanUnaryExpression _self, final EventOccurrence eventOccurrence) {
    final pssm.semantics.BooleanUnaryExpressionAspectBooleanUnaryExpressionAspectProperties _self_ = pssm.semantics.BooleanUnaryExpressionAspectBooleanUnaryExpressionAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# boolean evaluate(EventOccurrence)
    if (_self instanceof statemachines.BooleanUnaryExpression){
    	result = pssm.semantics.BooleanUnaryExpressionAspect._privk3_evaluate(_self_, (statemachines.BooleanUnaryExpression)_self,eventOccurrence);
    };
    return (boolean)result;
  }

  protected static boolean _privk3_evaluate(final BooleanUnaryExpressionAspectBooleanUnaryExpressionAspectProperties _self_, final BooleanUnaryExpression _self, final EventOccurrence eventOccurrence) {
    final BooleanAttribute operand = _self.getOperand();
    if ((operand == null)) {
      return true;
    }
    ArrayList<AttributeValue> _xifexpression = null;
    if ((eventOccurrence instanceof SignalEventOccurrence)) {
      EList<AttributeValue> _attributeValues = ((SignalEventOccurrence)eventOccurrence).getAttributeValues();
      _xifexpression = new ArrayList<AttributeValue>(_attributeValues);
    } else {
      ArrayList<AttributeValue> _xifexpression_1 = null;
      if ((eventOccurrence instanceof CallEventOccurrence)) {
        ArrayList<AttributeValue> _xblockexpression = null;
        {
          EList<AttributeValue> _inParameterValues = ((CallEventOccurrence)eventOccurrence).getInParameterValues();
          final ArrayList<AttributeValue> result = new ArrayList<AttributeValue>(_inParameterValues);
          result.addAll(((CallEventOccurrence)eventOccurrence).getOutParameterValues());
          result.add(((CallEventOccurrence)eventOccurrence).getReturnValue());
          _xblockexpression = result;
        }
        _xifexpression_1 = _xblockexpression;
      }
      _xifexpression = _xifexpression_1;
    }
    final ArrayList<AttributeValue> values = _xifexpression;
    final Function1<AttributeValue, Boolean> _function = new Function1<AttributeValue, Boolean>() {
      public Boolean apply(final AttributeValue v) {
        return Boolean.valueOf(((v instanceof BooleanAttributeValue) && 
          Objects.equal(((BooleanAttributeValue) v).getAttribute(), operand)));
      }
    };
    AttributeValue _findFirst = IterableExtensions.<AttributeValue>findFirst(values, _function);
    final BooleanAttributeValue eventAttributeValue = ((BooleanAttributeValue) _findFirst);
    if ((eventAttributeValue == null)) {
      return false;
    } else {
      if ((Objects.equal(_self.getOperator(), BooleanUnaryOperator.TRUE) && ((eventAttributeValue.getValue()).booleanValue() == true))) {
        return true;
      } else {
        if ((Objects.equal(_self.getOperator(), BooleanUnaryOperator.FALSE) && ((eventAttributeValue.getValue()).booleanValue() == false))) {
          return false;
        }
      }
    }
    return false;
  }
}
