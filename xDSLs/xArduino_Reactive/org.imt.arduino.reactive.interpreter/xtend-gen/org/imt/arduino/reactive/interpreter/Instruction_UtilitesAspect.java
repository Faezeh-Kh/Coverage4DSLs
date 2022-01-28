package org.imt.arduino.reactive.interpreter;

import com.google.common.base.Objects;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.imt.arduino.reactive.arduino.AnalogPin;
import org.imt.arduino.reactive.arduino.ArduinoAnalogModule;
import org.imt.arduino.reactive.arduino.ArduinoBoard;
import org.imt.arduino.reactive.arduino.ArduinoDigitalModule;
import org.imt.arduino.reactive.arduino.Board;
import org.imt.arduino.reactive.arduino.DigitalPin;
import org.imt.arduino.reactive.arduino.Instruction;
import org.imt.arduino.reactive.arduino.Pin;
import org.imt.arduino.reactive.arduino.Project;

@Aspect(className = Instruction.class)
@SuppressWarnings("all")
public class Instruction_UtilitesAspect {
  private static Project getProject(final Instruction _self, final org.imt.arduino.reactive.arduino.Module module) {
    final org.imt.arduino.reactive.interpreter.Instruction_UtilitesAspectInstructionAspectProperties _self_ = org.imt.arduino.reactive.interpreter.Instruction_UtilitesAspectInstructionAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Project getProject(Module)
    if (_self instanceof org.imt.arduino.reactive.arduino.Instruction){
    	result = org.imt.arduino.reactive.interpreter.Instruction_UtilitesAspect._privk3_getProject(_self_, (org.imt.arduino.reactive.arduino.Instruction)_self,module);
    };
    return (org.imt.arduino.reactive.arduino.Project)result;
  }
  
  protected static Pin getPin(final Instruction _self, final org.imt.arduino.reactive.arduino.Module module) {
    final org.imt.arduino.reactive.interpreter.Instruction_UtilitesAspectInstructionAspectProperties _self_ = org.imt.arduino.reactive.interpreter.Instruction_UtilitesAspectInstructionAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Pin getPin(Module)
    if (_self instanceof org.imt.arduino.reactive.arduino.Instruction){
    	result = org.imt.arduino.reactive.interpreter.Instruction_UtilitesAspect._privk3_getPin(_self_, (org.imt.arduino.reactive.arduino.Instruction)_self,module);
    };
    return (org.imt.arduino.reactive.arduino.Pin)result;
  }
  
  protected static Project _privk3_getProject(final Instruction_UtilitesAspectInstructionAspectProperties _self_, final Instruction _self, final org.imt.arduino.reactive.arduino.Module module) {
    Project project = null;
    EObject current = _self.eContainer();
    while ((current != null)) {
      {
        if ((current instanceof Project)) {
          project = ((Project) current);
          return project;
        }
        current = current.eContainer();
      }
    }
    return project;
  }
  
  protected static Pin _privk3_getPin(final Instruction_UtilitesAspectInstructionAspectProperties _self_, final Instruction _self, final org.imt.arduino.reactive.arduino.Module module) {
    Pin pin = null;
    final Project project = Instruction_UtilitesAspect.getProject(_self, module);
    EList<Board> _boards = project.getBoards();
    for (final Board board : _boards) {
      if (((board != null) && (board instanceof ArduinoBoard))) {
        ArduinoBoard arduinoBoard = ((ArduinoBoard) board);
        EList<AnalogPin> _analogPins = arduinoBoard.getAnalogPins();
        for (final AnalogPin analogPin : _analogPins) {
          ArduinoAnalogModule _module = analogPin.getModule();
          boolean _equals = Objects.equal(_module, module);
          if (_equals) {
            return analogPin;
          }
        }
        EList<DigitalPin> _digitalPins = arduinoBoard.getDigitalPins();
        for (final DigitalPin digitalPin : _digitalPins) {
          ArduinoDigitalModule _module_1 = digitalPin.getModule();
          boolean _equals_1 = Objects.equal(_module_1, module);
          if (_equals_1) {
            return digitalPin;
          }
        }
      }
    }
    return pin;
  }
}
