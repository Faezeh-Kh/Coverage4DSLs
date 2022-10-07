package arduino.semantics;

import arduino.Expression;
import arduino.Instruction;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.eclipse.emf.ecore.EObject;

@Aspect(className = Expression.class)
@SuppressWarnings("all")
public abstract class Expression_EvaluableAspect {
  protected static Instruction getInstruction(final Expression _self) {
    final arduino.semantics.Expression_EvaluableAspectExpressionAspectProperties _self_ = arduino.semantics.Expression_EvaluableAspectExpressionAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Instruction getInstruction()
    if (_self instanceof arduino.Expression){
    	result = arduino.semantics.Expression_EvaluableAspect._privk3_getInstruction(_self_, (arduino.Expression)_self);
    };
    return (arduino.Instruction)result;
  }

  public static Object evaluate(final Expression _self) {
    final arduino.semantics.Expression_EvaluableAspectExpressionAspectProperties _self_ = arduino.semantics.Expression_EvaluableAspectExpressionAspectContext.getSelf(_self);
    Object result = null;
    	// BeginInjectInto arduino.semantics.Expression_EvaluableAspect#Object evaluate() from arduino.semantics.VariableRef_EvaluableAspect
    		if (_self instanceof arduino.VariableRef){
    			result = arduino.semantics.VariableRef_EvaluableAspect.evaluate((arduino.VariableRef)_self);
    		} else
    		// EndInjectInto arduino.semantics.Expression_EvaluableAspect#Object evaluate() from arduino.semantics.VariableRef_EvaluableAspect
    	// BeginInjectInto arduino.semantics.Expression_EvaluableAspect#Object evaluate() from arduino.semantics.IntegerConstant_ExecutableAspect
    		if (_self instanceof arduino.IntegerConstant){
    			result = arduino.semantics.IntegerConstant_ExecutableAspect.evaluate((arduino.IntegerConstant)_self);
    		} else
    		// EndInjectInto arduino.semantics.Expression_EvaluableAspect#Object evaluate() from arduino.semantics.IntegerConstant_ExecutableAspect
    	// BeginInjectInto arduino.semantics.Expression_EvaluableAspect#Object evaluate() from arduino.semantics.BinaryIntegerExpression_EvaluableAspect
    		if (_self instanceof arduino.BinaryIntegerExpression){
    			result = arduino.semantics.BinaryIntegerExpression_EvaluableAspect.evaluate((arduino.BinaryIntegerExpression)_self);
    		} else
    		// EndInjectInto arduino.semantics.Expression_EvaluableAspect#Object evaluate() from arduino.semantics.BinaryIntegerExpression_EvaluableAspect
    	// BeginInjectInto arduino.semantics.Expression_EvaluableAspect#Object evaluate() from arduino.semantics.BinaryBooleanExpression_EvaluableAspect
    		if (_self instanceof arduino.BinaryBooleanExpression){
    			result = arduino.semantics.BinaryBooleanExpression_EvaluableAspect.evaluate((arduino.BinaryBooleanExpression)_self);
    		} else
    		// EndInjectInto arduino.semantics.Expression_EvaluableAspect#Object evaluate() from arduino.semantics.BinaryBooleanExpression_EvaluableAspect
    	// BeginInjectInto arduino.semantics.Expression_EvaluableAspect#Object evaluate() from arduino.semantics.IntegerModuleGet_ExecutableAspect
    		if (_self instanceof arduino.IntegerModuleGet){
    			result = arduino.semantics.IntegerModuleGet_ExecutableAspect.evaluate((arduino.IntegerModuleGet)_self);
    		} else
    		// EndInjectInto arduino.semantics.Expression_EvaluableAspect#Object evaluate() from arduino.semantics.IntegerModuleGet_ExecutableAspect
    	// BeginInjectInto arduino.semantics.Expression_EvaluableAspect#Object evaluate() from arduino.semantics.BooleanConstant_ExecutableAspect
    		if (_self instanceof arduino.BooleanConstant){
    			result = arduino.semantics.BooleanConstant_ExecutableAspect.evaluate((arduino.BooleanConstant)_self);
    		} else
    		// EndInjectInto arduino.semantics.Expression_EvaluableAspect#Object evaluate() from arduino.semantics.BooleanConstant_ExecutableAspect
    	// BeginInjectInto arduino.semantics.Expression_EvaluableAspect#Object evaluate() from arduino.semantics.BooleanModuleGet_ExecutableAspect
    		if (_self instanceof arduino.BooleanModuleGet){
    			result = arduino.semantics.BooleanModuleGet_ExecutableAspect.evaluate((arduino.BooleanModuleGet)_self);
    		} else
    		// EndInjectInto arduino.semantics.Expression_EvaluableAspect#Object evaluate() from arduino.semantics.BooleanModuleGet_ExecutableAspect
    	// BeginInjectInto arduino.semantics.Expression_EvaluableAspect#Object evaluate() from arduino.semantics.UnaryBooleanExpression_EvaluableAspect
    		if (_self instanceof arduino.UnaryBooleanExpression){
    			result = arduino.semantics.UnaryBooleanExpression_EvaluableAspect.evaluate((arduino.UnaryBooleanExpression)_self);
    		} else
    		// EndInjectInto arduino.semantics.Expression_EvaluableAspect#Object evaluate() from arduino.semantics.UnaryBooleanExpression_EvaluableAspect
    	// BeginInjectInto arduino.semantics.Expression_EvaluableAspect#Object evaluate() from arduino.semantics.Constant_EvaluableAspect
    		if (_self instanceof arduino.Constant){
    			result = arduino.semantics.Constant_EvaluableAspect.evaluate((arduino.Constant)_self);
    		} else
    		// EndInjectInto arduino.semantics.Expression_EvaluableAspect#Object evaluate() from arduino.semantics.Constant_EvaluableAspect
    // #DispatchPointCut_before# Object evaluate()
    if (_self instanceof arduino.Expression){
    	result = arduino.semantics.Expression_EvaluableAspect._privk3_evaluate(_self_, (arduino.Expression)_self);
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
