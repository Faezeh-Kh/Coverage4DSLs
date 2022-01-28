package org.imt.arduino.reactive.interpreter;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.eclipse.emf.ecore.EObject;
import org.imt.arduino.reactive.arduino.Expression;
import org.imt.arduino.reactive.arduino.Instruction;

@Aspect(className = Expression.class)
@SuppressWarnings("all")
public abstract class Expression_EvaluableAspect {
  protected static Instruction getInstruction(final Expression _self) {
    final org.imt.arduino.reactive.interpreter.Expression_EvaluableAspectExpressionAspectProperties _self_ = org.imt.arduino.reactive.interpreter.Expression_EvaluableAspectExpressionAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Instruction getInstruction()
    if (_self instanceof org.imt.arduino.reactive.arduino.Expression){
    	result = org.imt.arduino.reactive.interpreter.Expression_EvaluableAspect._privk3_getInstruction(_self_, (org.imt.arduino.reactive.arduino.Expression)_self);
    };
    return (org.imt.arduino.reactive.arduino.Instruction)result;
  }
  
  public static Object evaluate(final Expression _self) {
    final org.imt.arduino.reactive.interpreter.Expression_EvaluableAspectExpressionAspectProperties _self_ = org.imt.arduino.reactive.interpreter.Expression_EvaluableAspectExpressionAspectContext.getSelf(_self);
    Object result = null;
    	// BeginInjectInto org.imt.arduino.reactive.interpreter.Expression_EvaluableAspect#Object evaluate() from org.imt.arduino.reactive.interpreter.BinaryBooleanExpression_EvaluableAspect
    		if (_self instanceof org.imt.arduino.reactive.arduino.BinaryBooleanExpression){
    			result = org.imt.arduino.reactive.interpreter.BinaryBooleanExpression_EvaluableAspect.evaluate((org.imt.arduino.reactive.arduino.BinaryBooleanExpression)_self);
    		} else
    		// EndInjectInto org.imt.arduino.reactive.interpreter.Expression_EvaluableAspect#Object evaluate() from org.imt.arduino.reactive.interpreter.BinaryBooleanExpression_EvaluableAspect
    	// BeginInjectInto org.imt.arduino.reactive.interpreter.Expression_EvaluableAspect#Object evaluate() from org.imt.arduino.reactive.interpreter.Constant_EvaluableAspect
    		if (_self instanceof org.imt.arduino.reactive.arduino.Constant){
    			result = org.imt.arduino.reactive.interpreter.Constant_EvaluableAspect.evaluate((org.imt.arduino.reactive.arduino.Constant)_self);
    		} else
    		// EndInjectInto org.imt.arduino.reactive.interpreter.Expression_EvaluableAspect#Object evaluate() from org.imt.arduino.reactive.interpreter.Constant_EvaluableAspect
    	// BeginInjectInto org.imt.arduino.reactive.interpreter.Expression_EvaluableAspect#Object evaluate() from org.imt.arduino.reactive.interpreter.BooleanConstant_ExecutableAspect
    		if (_self instanceof org.imt.arduino.reactive.arduino.BooleanConstant){
    			result = org.imt.arduino.reactive.interpreter.BooleanConstant_ExecutableAspect.evaluate((org.imt.arduino.reactive.arduino.BooleanConstant)_self);
    		} else
    		// EndInjectInto org.imt.arduino.reactive.interpreter.Expression_EvaluableAspect#Object evaluate() from org.imt.arduino.reactive.interpreter.BooleanConstant_ExecutableAspect
    	// BeginInjectInto org.imt.arduino.reactive.interpreter.Expression_EvaluableAspect#Object evaluate() from org.imt.arduino.reactive.interpreter.UnaryBooleanExpression_EvaluableAspect
    		if (_self instanceof org.imt.arduino.reactive.arduino.UnaryBooleanExpression){
    			result = org.imt.arduino.reactive.interpreter.UnaryBooleanExpression_EvaluableAspect.evaluate((org.imt.arduino.reactive.arduino.UnaryBooleanExpression)_self);
    		} else
    		// EndInjectInto org.imt.arduino.reactive.interpreter.Expression_EvaluableAspect#Object evaluate() from org.imt.arduino.reactive.interpreter.UnaryBooleanExpression_EvaluableAspect
    	// BeginInjectInto org.imt.arduino.reactive.interpreter.Expression_EvaluableAspect#Object evaluate() from org.imt.arduino.reactive.interpreter.IntegerConstant_ExecutableAspect
    		if (_self instanceof org.imt.arduino.reactive.arduino.IntegerConstant){
    			result = org.imt.arduino.reactive.interpreter.IntegerConstant_ExecutableAspect.evaluate((org.imt.arduino.reactive.arduino.IntegerConstant)_self);
    		} else
    		// EndInjectInto org.imt.arduino.reactive.interpreter.Expression_EvaluableAspect#Object evaluate() from org.imt.arduino.reactive.interpreter.IntegerConstant_ExecutableAspect
    	// BeginInjectInto org.imt.arduino.reactive.interpreter.Expression_EvaluableAspect#Object evaluate() from org.imt.arduino.reactive.interpreter.BooleanModuleGet_ExecutableAspect
    		if (_self instanceof org.imt.arduino.reactive.arduino.BooleanModuleGet){
    			result = org.imt.arduino.reactive.interpreter.BooleanModuleGet_ExecutableAspect.evaluate((org.imt.arduino.reactive.arduino.BooleanModuleGet)_self);
    		} else
    		// EndInjectInto org.imt.arduino.reactive.interpreter.Expression_EvaluableAspect#Object evaluate() from org.imt.arduino.reactive.interpreter.BooleanModuleGet_ExecutableAspect
    	// BeginInjectInto org.imt.arduino.reactive.interpreter.Expression_EvaluableAspect#Object evaluate() from org.imt.arduino.reactive.interpreter.VariableRef_EvaluableAspect
    		if (_self instanceof org.imt.arduino.reactive.arduino.VariableRef){
    			result = org.imt.arduino.reactive.interpreter.VariableRef_EvaluableAspect.evaluate((org.imt.arduino.reactive.arduino.VariableRef)_self);
    		} else
    		// EndInjectInto org.imt.arduino.reactive.interpreter.Expression_EvaluableAspect#Object evaluate() from org.imt.arduino.reactive.interpreter.VariableRef_EvaluableAspect
    	// BeginInjectInto org.imt.arduino.reactive.interpreter.Expression_EvaluableAspect#Object evaluate() from org.imt.arduino.reactive.interpreter.BinaryIntegerExpression_EvaluableAspect
    		if (_self instanceof org.imt.arduino.reactive.arduino.BinaryIntegerExpression){
    			result = org.imt.arduino.reactive.interpreter.BinaryIntegerExpression_EvaluableAspect.evaluate((org.imt.arduino.reactive.arduino.BinaryIntegerExpression)_self);
    		} else
    		// EndInjectInto org.imt.arduino.reactive.interpreter.Expression_EvaluableAspect#Object evaluate() from org.imt.arduino.reactive.interpreter.BinaryIntegerExpression_EvaluableAspect
    	// BeginInjectInto org.imt.arduino.reactive.interpreter.Expression_EvaluableAspect#Object evaluate() from org.imt.arduino.reactive.interpreter.IntegerModuleGet_ExecutableAspect
    		if (_self instanceof org.imt.arduino.reactive.arduino.IntegerModuleGet){
    			result = org.imt.arduino.reactive.interpreter.IntegerModuleGet_ExecutableAspect.evaluate((org.imt.arduino.reactive.arduino.IntegerModuleGet)_self);
    		} else
    		// EndInjectInto org.imt.arduino.reactive.interpreter.Expression_EvaluableAspect#Object evaluate() from org.imt.arduino.reactive.interpreter.IntegerModuleGet_ExecutableAspect
    // #DispatchPointCut_before# Object evaluate()
    if (_self instanceof org.imt.arduino.reactive.arduino.Expression){
    	result = org.imt.arduino.reactive.interpreter.Expression_EvaluableAspect._privk3_evaluate(_self_, (org.imt.arduino.reactive.arduino.Expression)_self);
    };
    return (java.lang.Object)result;
  }
  
  protected static Instruction _privk3_getInstruction(final Expression_EvaluableAspectExpressionAspectProperties _self_, final Expression _self) {
    Instruction instruction = null;
    EObject current = _self.eContainer();
    while ((current != null)) {
      {
        if ((current instanceof Instruction)) {
          instruction = ((Instruction) current);
          return instruction;
        }
        current = current.eContainer();
      }
    }
    return instruction;
  }
  
  protected static Object _privk3_evaluate(final Expression_EvaluableAspectExpressionAspectProperties _self_, final Expression _self) {
    return null;
  }
}
