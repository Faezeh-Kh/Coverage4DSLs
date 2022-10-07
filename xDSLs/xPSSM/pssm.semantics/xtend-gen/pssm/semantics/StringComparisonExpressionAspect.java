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
import statemachines.SignalEventOccurrence;
import statemachines.StateMachine;
import statemachines.StringAttribute;
import statemachines.StringAttributeValue;
import statemachines.StringComparisonExpression;
import statemachines.StringComparisonOperator;
import statemachines.StringConstraint;
import statemachines.Transition;

@Aspect(className = StringComparisonExpression.class)
@SuppressWarnings("all")
public class StringComparisonExpressionAspect {
  public static boolean evaluate(final StringComparisonExpression _self) {
    final pssm.semantics.StringComparisonExpressionAspectStringComparisonExpressionAspectProperties _self_ = pssm.semantics.StringComparisonExpressionAspectStringComparisonExpressionAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# boolean evaluate()
    if (_self instanceof statemachines.StringComparisonExpression){
    	result = pssm.semantics.StringComparisonExpressionAspect._privk3_evaluate(_self_, (statemachines.StringComparisonExpression)_self);
    };
    return (boolean)result;
  }
  
  protected static boolean _privk3_evaluate(final StringComparisonExpressionAspectStringComparisonExpressionAspectProperties _self_, final StringComparisonExpression _self) {
    final StringAttribute operand1 = _self.getOperand1();
    final StringAttribute operand2 = _self.getOperand2();
    String operand1value = null;
    String operand2value = null;
    boolean operand1found = false;
    boolean operand2found = false;
    EObject _eContainer = _self.eContainer();
    EObject _eContainer_1 = ((StringConstraint) _eContainer).eContainer();
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
              return Boolean.valueOf(((v instanceof StringAttributeValue) && Objects.equal(((StringAttributeValue) v).getAttribute(), operand1)));
            }
          };
          final AttributeValue eventAttributeValue = IterableExtensions.<AttributeValue>findFirst(values, _function);
          if ((eventAttributeValue != null)) {
            operand1value = ((StringAttributeValue) eventAttributeValue).getValue();
            operand1found = true;
          }
        }
        if ((!operand2found)) {
          final Function1<AttributeValue, Boolean> _function_1 = new Function1<AttributeValue, Boolean>() {
            public Boolean apply(final AttributeValue v) {
              return Boolean.valueOf(((v instanceof StringAttributeValue) && Objects.equal(((StringAttributeValue) v).getAttribute(), operand2)));
            }
          };
          final AttributeValue eventAttributeValue_1 = IterableExtensions.<AttributeValue>findFirst(values, _function_1);
          if ((eventAttributeValue_1 != null)) {
            operand2value = ((StringAttributeValue) eventAttributeValue_1).getValue();
            operand2found = true;
          }
        }
        if ((operand1found && operand2found)) {
          i = (-1);
        }
      }
    }
    StringComparisonOperator _operator = _self.getOperator();
    boolean _equals = Objects.equal(_operator, StringComparisonOperator.EQUALS);
    if (_equals) {
      return operand1value.equals(operand2value);
    } else {
      StringComparisonOperator _operator_1 = _self.getOperator();
      boolean _equals_1 = Objects.equal(_operator_1, StringComparisonOperator.NOT_EQUALS);
      if (_equals_1) {
        boolean _equals_2 = operand1value.equals(operand2value);
        return (!_equals_2);
      }
    }
    return false;
  }
}
