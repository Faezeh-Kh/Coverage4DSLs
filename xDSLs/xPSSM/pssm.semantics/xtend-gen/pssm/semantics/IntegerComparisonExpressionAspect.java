package pssm.semantics;

import com.google.common.base.Objects;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import java.util.ArrayList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import statemachines.AttributeValue;
import statemachines.CallEventOccurrence;
import statemachines.EventOccurrence;
import statemachines.IntegerAttribute;
import statemachines.IntegerAttributeValue;
import statemachines.IntegerComparisonExpression;
import statemachines.IntegerComparisonOperator;
import statemachines.IntegerConstraint;
import statemachines.SignalEventOccurrence;
import statemachines.StateMachine;
import statemachines.Transition;

@Aspect(className = IntegerComparisonExpression.class)
@SuppressWarnings("all")
public class IntegerComparisonExpressionAspect {
  public static boolean evaluate(final IntegerComparisonExpression _self) {
    final pssm.semantics.IntegerComparisonExpressionAspectIntegerComparisonExpressionAspectProperties _self_ = pssm.semantics.IntegerComparisonExpressionAspectIntegerComparisonExpressionAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# boolean evaluate()
    if (_self instanceof statemachines.IntegerComparisonExpression){
    	result = pssm.semantics.IntegerComparisonExpressionAspect._privk3_evaluate(_self_, (statemachines.IntegerComparisonExpression)_self);
    };
    return (boolean)result;
  }

  protected static boolean _privk3_evaluate(final IntegerComparisonExpressionAspectIntegerComparisonExpressionAspectProperties _self_, final IntegerComparisonExpression _self) {
    final IntegerAttribute operand1 = _self.getOperand1();
    final IntegerAttribute operand2 = _self.getOperand2();
    int operand1value = 0;
    int operand2value = 0;
    boolean operand1found = false;
    boolean operand2found = false;
    EObject _eContainer = _self.eContainer();
    EObject _eContainer_1 = ((IntegerConstraint) _eContainer).eContainer();
    final StateMachine stateMachine = TransitionAspect.getRootStateMachine(((Transition) _eContainer_1));
    ArrayList<AttributeValue> values = new ArrayList<AttributeValue>();
    for (int i = (StateMachineAspect.receivedEvents(stateMachine).size() - 1); (i >= 0); i--) {
      {
        final EventOccurrence eventOcc = StateMachineAspect.receivedEvents(stateMachine).get(i);
        if ((eventOcc instanceof SignalEventOccurrence)) {
          values.addAll(((SignalEventOccurrence)eventOcc).getAttributeValues());
        } else {
          if ((eventOcc instanceof CallEventOccurrence)) {
            EList<AttributeValue> _inParameterValues = ((CallEventOccurrence)eventOcc).getInParameterValues();
            final ArrayList<AttributeValue> result = new ArrayList<AttributeValue>(_inParameterValues);
            result.addAll(((CallEventOccurrence)eventOcc).getOutParameterValues());
            result.add(((CallEventOccurrence)eventOcc).getReturnValue());
            values.addAll(result);
          }
        }
        if ((!operand1found)) {
          final Function1<AttributeValue, Boolean> _function = new Function1<AttributeValue, Boolean>() {
            public Boolean apply(final AttributeValue v) {
              return Boolean.valueOf(((v instanceof IntegerAttributeValue) && Objects.equal(((IntegerAttributeValue) v).getAttribute(), operand1)));
            }
          };
          final AttributeValue eventAttributeValue = IterableExtensions.<AttributeValue>findFirst(values, _function);
          if ((eventAttributeValue != null)) {
            operand1value = (((IntegerAttributeValue) eventAttributeValue).getValue()).intValue();
            operand1found = true;
          }
        }
        if ((!operand2found)) {
          final Function1<AttributeValue, Boolean> _function_1 = new Function1<AttributeValue, Boolean>() {
            public Boolean apply(final AttributeValue v) {
              return Boolean.valueOf(((v instanceof IntegerAttributeValue) && Objects.equal(((IntegerAttributeValue) v).getAttribute(), operand2)));
            }
          };
          final AttributeValue eventAttributeValue_1 = IterableExtensions.<AttributeValue>findFirst(values, _function_1);
          if ((eventAttributeValue_1 != null)) {
            operand2value = (((IntegerAttributeValue) eventAttributeValue_1).getValue()).intValue();
            operand2found = true;
          }
        }
        if ((operand1found && operand2found)) {
          i = (-1);
        }
      }
    }
    IntegerComparisonOperator _operator = _self.getOperator();
    boolean _equals = Objects.equal(_operator, IntegerComparisonOperator.GREATER);
    if (_equals) {
      return (operand1value > operand2value);
    } else {
      IntegerComparisonOperator _operator_1 = _self.getOperator();
      boolean _equals_1 = Objects.equal(_operator_1, IntegerComparisonOperator.GREATER_EQUALS);
      if (_equals_1) {
        return (operand1value >= operand2value);
      } else {
        IntegerComparisonOperator _operator_2 = _self.getOperator();
        boolean _equals_2 = Objects.equal(_operator_2, IntegerComparisonOperator.EQUALS);
        if (_equals_2) {
          return (operand1value == operand2value);
        } else {
          IntegerComparisonOperator _operator_3 = _self.getOperator();
          boolean _equals_3 = Objects.equal(_operator_3, IntegerComparisonOperator.NOT_EQUALS);
          if (_equals_3) {
            return (operand1value != operand2value);
          } else {
            IntegerComparisonOperator _operator_4 = _self.getOperator();
            boolean _equals_4 = Objects.equal(_operator_4, IntegerComparisonOperator.SMALLER_EQUALS);
            if (_equals_4) {
              return (operand1value <= operand2value);
            } else {
              IntegerComparisonOperator _operator_5 = _self.getOperator();
              boolean _equals_5 = Objects.equal(_operator_5, IntegerComparisonOperator.SMALLER);
              if (_equals_5) {
                return (operand1value < operand2value);
              }
            }
          }
        }
      }
    }
    return false;
  }
}
