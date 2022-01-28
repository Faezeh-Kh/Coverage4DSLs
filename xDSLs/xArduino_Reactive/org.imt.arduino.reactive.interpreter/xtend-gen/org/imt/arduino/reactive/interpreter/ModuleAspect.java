package org.imt.arduino.reactive.interpreter;

import com.google.common.base.Objects;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.imt.arduino.reactive.arduino.AnalogPin;
import org.imt.arduino.reactive.arduino.ArduinoAnalogModule;
import org.imt.arduino.reactive.arduino.ArduinoBoard;
import org.imt.arduino.reactive.arduino.ArduinoDigitalModule;
import org.imt.arduino.reactive.arduino.Board;
import org.imt.arduino.reactive.arduino.DigitalPin;
import org.imt.arduino.reactive.arduino.Pin;
import org.imt.arduino.reactive.arduino.Project;

@Aspect(className = org.imt.arduino.reactive.arduino.Module.class)
@SuppressWarnings("all")
public class ModuleAspect {
  @Step
  public static void execute(final org.imt.arduino.reactive.arduino.Module _self) {
    final org.imt.arduino.reactive.interpreter.ModuleAspectModuleAspectProperties _self_ = org.imt.arduino.reactive.interpreter.ModuleAspectModuleAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void execute()
    if (_self instanceof org.imt.arduino.reactive.arduino.Module){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			org.imt.arduino.reactive.interpreter.ModuleAspect._privk3_execute(_self_, (org.imt.arduino.reactive.arduino.Module)_self);
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {_self}, command, "Module", "execute");
    	} else {
    		command.execute();
    	}
    	;
    };
  }
  
  protected static Project getProject(final org.imt.arduino.reactive.arduino.Module _self) {
    final org.imt.arduino.reactive.interpreter.ModuleAspectModuleAspectProperties _self_ = org.imt.arduino.reactive.interpreter.ModuleAspectModuleAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Project getProject()
    if (_self instanceof org.imt.arduino.reactive.arduino.Module){
    	result = org.imt.arduino.reactive.interpreter.ModuleAspect._privk3_getProject(_self_, (org.imt.arduino.reactive.arduino.Module)_self);
    };
    return (org.imt.arduino.reactive.arduino.Project)result;
  }
  
  protected static Pin getPin(final org.imt.arduino.reactive.arduino.Module _self) {
    final org.imt.arduino.reactive.interpreter.ModuleAspectModuleAspectProperties _self_ = org.imt.arduino.reactive.interpreter.ModuleAspectModuleAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Pin getPin()
    if (_self instanceof org.imt.arduino.reactive.arduino.Module){
    	result = org.imt.arduino.reactive.interpreter.ModuleAspect._privk3_getPin(_self_, (org.imt.arduino.reactive.arduino.Module)_self);
    };
    return (org.imt.arduino.reactive.arduino.Pin)result;
  }
  
  protected static void _privk3_execute(final ModuleAspectModuleAspectProperties _self_, final org.imt.arduino.reactive.arduino.Module _self) {
  }
  
  protected static Project _privk3_getProject(final ModuleAspectModuleAspectProperties _self_, final org.imt.arduino.reactive.arduino.Module _self) {
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
  
  protected static Pin _privk3_getPin(final ModuleAspectModuleAspectProperties _self_, final org.imt.arduino.reactive.arduino.Module _self) {
    Pin pin = null;
    final Project project = ModuleAspect.getProject(_self);
    EList<Board> _boards = project.getBoards();
    for (final Board board : _boards) {
      if (((board != null) && (board instanceof ArduinoBoard))) {
        ArduinoBoard arduinoBoard = ((ArduinoBoard) board);
        EList<AnalogPin> _analogPins = arduinoBoard.getAnalogPins();
        for (final AnalogPin analogPin : _analogPins) {
          ArduinoAnalogModule _module = analogPin.getModule();
          boolean _equals = Objects.equal(_module, _self);
          if (_equals) {
            return analogPin;
          }
        }
        EList<DigitalPin> _digitalPins = arduinoBoard.getDigitalPins();
        for (final DigitalPin digitalPin : _digitalPins) {
          ArduinoDigitalModule _module_1 = digitalPin.getModule();
          boolean _equals_1 = Objects.equal(_module_1, _self);
          if (_equals_1) {
            return digitalPin;
          }
        }
      }
    }
    return pin;
  }
}
