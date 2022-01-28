package org.imt.arduino.reactive.interpreter;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.imt.arduino.reactive.arduino.BluetoothTransceiver;
import org.imt.arduino.reactive.arduino.BooleanExpression;
import org.imt.arduino.reactive.arduino.Expression;
import org.imt.arduino.reactive.arduino.IntegerExpression;
import org.imt.arduino.reactive.arduino.ModuleAssignment;
import org.imt.arduino.reactive.arduino.Pin;

@Aspect(className = ModuleAssignment.class)
@SuppressWarnings("all")
public class ModuleAssignment_ExecutableAspect extends ModuleInstruction_ExecutableAspect {
  @Step
  @OverrideAspectMethod
  public static void execute(final ModuleAssignment _self) {
    final org.imt.arduino.reactive.interpreter.ModuleAssignment_ExecutableAspectModuleAssignmentAspectProperties _self_ = org.imt.arduino.reactive.interpreter.ModuleAssignment_ExecutableAspectModuleAssignmentAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void execute()
    if (_self instanceof org.imt.arduino.reactive.arduino.ModuleAssignment){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			org.imt.arduino.reactive.interpreter.ModuleAssignment_ExecutableAspect._privk3_execute(_self_, (org.imt.arduino.reactive.arduino.ModuleAssignment)_self);
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {_self}, command, "ModuleAssignment", "execute");
    	} else {
    		command.execute();
    	}
    	;
    };
  }
  
  private static void super_execute(final ModuleAssignment _self) {
    final org.imt.arduino.reactive.interpreter.ModuleInstruction_ExecutableAspectModuleInstructionAspectProperties _self_ = org.imt.arduino.reactive.interpreter.ModuleInstruction_ExecutableAspectModuleInstructionAspectContext.getSelf(_self);
     org.imt.arduino.reactive.interpreter.ModuleInstruction_ExecutableAspect._privk3_execute(_self_, _self);
  }
  
  protected static void _privk3_execute(final ModuleAssignment_ExecutableAspectModuleAssignmentAspectProperties _self_, final ModuleAssignment _self) {
    final Pin pin = Instruction_UtilitesAspect.getPin(_self, _self.getModule());
    final int previousValue = pin.getLevel();
    Expression _operand = _self.getOperand();
    if ((_operand instanceof IntegerExpression)) {
      Object _evaluate = Expression_EvaluableAspect.evaluate(_self.getOperand());
      pin.setLevel((((Integer) _evaluate)).intValue());
    }
    Expression _operand_1 = _self.getOperand();
    if ((_operand_1 instanceof BooleanExpression)) {
      Object _evaluate_1 = Expression_EvaluableAspect.evaluate(_self.getOperand());
      if ((((Boolean) _evaluate_1)).booleanValue()) {
        pin.setLevel((Pin_EvaluableAspect.HIGH).intValue());
      } else {
        pin.setLevel((Pin_EvaluableAspect.LOW).intValue());
      }
    }
    int _level = pin.getLevel();
    boolean _notEquals = (_level != previousValue);
    if (_notEquals) {
      Pin_EvaluableAspect.changeLevel(pin);
    }
    org.imt.arduino.reactive.arduino.Module _module = _self.getModule();
    if ((_module instanceof BluetoothTransceiver)) {
      org.imt.arduino.reactive.arduino.Module _module_1 = _self.getModule();
      BluetoothTransceiver_PushAspect.dataToSend(((BluetoothTransceiver) _module_1)).add(Integer.valueOf(pin.getLevel()));
      org.imt.arduino.reactive.arduino.Module _module_2 = _self.getModule();
      BluetoothTransceiver_PushAspect.push(((BluetoothTransceiver) _module_2));
    }
  }
}
