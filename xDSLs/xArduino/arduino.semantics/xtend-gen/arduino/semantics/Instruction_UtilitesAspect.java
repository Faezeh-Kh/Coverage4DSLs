package arduino.semantics;

import arduino.AnalogPin;
import arduino.ArduinoAnalogModule;
import arduino.ArduinoBoard;
import arduino.ArduinoDigitalModule;
import arduino.Board;
import arduino.DigitalPin;
import arduino.Instruction;
import arduino.Pin;
import arduino.Project;
import com.google.common.base.Objects;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * TODO: adding two new elements to the definition of runtime state as:
 * currentInstruction: keeping the last executed instruction
 * -> hence when receiving an occurrence for any accepted event, we simply run the sketch from the currentInstruction
 * passedTime: the amount of time that must be passed. This value must be set when receiving an occurrence for a new accepted event
 * such as "passedTime(time)"
 * -> hence when executing Delay elements, we used the passedTime to pass the delay time
 */
@Aspect(className = Instruction.class)
@SuppressWarnings("all")
public class Instruction_UtilitesAspect {
  private static Project getProject(final Instruction _self, final arduino.Module module) {
    final arduino.semantics.Instruction_UtilitesAspectInstructionAspectProperties _self_ = arduino.semantics.Instruction_UtilitesAspectInstructionAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Project getProject(Module)
    if (_self instanceof arduino.Instruction){
    	result = arduino.semantics.Instruction_UtilitesAspect._privk3_getProject(_self_, (arduino.Instruction)_self,module);
    };
    return (arduino.Project)result;
  }

  protected static Pin getPin(final Instruction _self, final arduino.Module module) {
    final arduino.semantics.Instruction_UtilitesAspectInstructionAspectProperties _self_ = arduino.semantics.Instruction_UtilitesAspectInstructionAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Pin getPin(Module)
    if (_self instanceof arduino.Instruction){
    	result = arduino.semantics.Instruction_UtilitesAspect._privk3_getPin(_self_, (arduino.Instruction)_self,module);
    };
    return (arduino.Pin)result;
  }

  protected static Project _privk3_getProject(final Instruction_UtilitesAspectInstructionAspectProperties _self_, final Instruction _self, final arduino.Module module) {
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

  protected static Pin _privk3_getPin(final Instruction_UtilitesAspectInstructionAspectProperties _self_, final Instruction _self, final arduino.Module module) {
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
