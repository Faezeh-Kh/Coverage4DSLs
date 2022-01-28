package org.imt.pssm.reactive.interpreter;

import com.google.common.base.Objects;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import java.util.ArrayList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.imt.pssm.reactive.model.statemachines.AttributeValue;
import org.imt.pssm.reactive.model.statemachines.BooleanAttribute;
import org.imt.pssm.reactive.model.statemachines.BooleanAttributeValue;
import org.imt.pssm.reactive.model.statemachines.BooleanBinaryExpression;
import org.imt.pssm.reactive.model.statemachines.BooleanBinaryOperator;
import org.imt.pssm.reactive.model.statemachines.BooleanConstraint;
import org.imt.pssm.reactive.model.statemachines.CallEventOccurrence;
import org.imt.pssm.reactive.model.statemachines.EventOccurrence;
import org.imt.pssm.reactive.model.statemachines.SignalEventOccurrence;
import org.imt.pssm.reactive.model.statemachines.StateMachine;
import org.imt.pssm.reactive.model.statemachines.Transition;

@Aspect(className = BooleanBinaryExpression.class)
@SuppressWarnings("all")
public class BooleanBinaryExpressionAspect {
  public static boolean evaluate(final BooleanBinaryExpression _self) {
    final org.imt.pssm.reactive.interpreter.BooleanBinaryExpressionAspectBooleanBinaryExpressionAspectProperties _self_ = org.imt.pssm.reactive.interpreter.BooleanBinaryExpressionAspectBooleanBinaryExpressionAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# boolean evaluate()
    if (_self instanceof org.imt.pssm.reactive.model.statemachines.BooleanBinaryExpression){
    	result = org.imt.pssm.reactive.interpreter.BooleanBinaryExpressionAspect._privk3_evaluate(_self_, (org.imt.pssm.reactive.model.statemachines.BooleanBinaryExpression)_self);
    };
    return (boolean)result;
  }
  
  protected static boolean _privk3_evaluate(final BooleanBinaryExpressionAspectBooleanBinaryExpressionAspectProperties _self_, final BooleanBinaryExpression _self) {
    final BooleanAttribute operand1 = _self.getOperand1();
    final BooleanAttribute operand2 = _self.getOperand2();
    Boolean operand1value = null;
    Boolean operand2value = null;
    boolean operand1found = false;
    boolean operand2found = false;
    EObject _eContainer = _self.eContainer();
    EObject _eContainer_1 = ((BooleanConstraint) _eContainer).eContainer();
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
          final Function1<AttributeValue, Boolean> _function = (AttributeValue v) -> {
            return Boolean.valueOf(((v instanceof BooleanAttributeValue) && Objects.equal(((BooleanAttributeValue) v).getAttribute(), operand1)));
          };
          final AttributeValue eventAttributeValue = IterableExtensions.<AttributeValue>findFirst(values, _function);
          if ((eventAttributeValue != null)) {
            operand1value = ((BooleanAttributeValue) eventAttributeValue).getValue();
            operand1found = true;
          }
        }
        if ((!operand2found)) {
          final Function1<AttributeValue, Boolean> _function_1 = (AttributeValue v) -> {
            return Boolean.valueOf(((v instanceof BooleanAttributeValue) && Objects.equal(((BooleanAttributeValue) v).getAttribute(), operand2)));
          };
          final AttributeValue eventAttributeValue_1 = IterableExtensions.<AttributeValue>findFirst(values, _function_1);
          if ((eventAttributeValue_1 != null)) {
            operand2value = ((BooleanAttributeValue) eventAttributeValue_1).getValue();
            operand2found = true;
          }
        }
        if ((operand1found && operand2found)) {
          i = (-1);
        }
      }
    }
    BooleanBinaryOperator _operator = _self.getOperator();
    boolean _equals = Objects.equal(_operator, BooleanBinaryOperator.AND);
    if (_equals) {
      return ((operand1value).booleanValue() && (operand2value).booleanValue());
    } else {
      BooleanBinaryOperator _operator_1 = _self.getOperator();
      boolean _equals_1 = Objects.equal(_operator_1, BooleanBinaryOperator.OR);
      if (_equals_1) {
        return ((operand1value).booleanValue() || (operand2value).booleanValue());
      }
    }
    return false;
  }
}
