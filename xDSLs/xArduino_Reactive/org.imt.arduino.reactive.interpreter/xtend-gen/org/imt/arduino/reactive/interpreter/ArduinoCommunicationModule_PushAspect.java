package org.imt.arduino.reactive.interpreter;

import fr.inria.diverse.k3.al.annotationprocessor.Abstract;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.imt.arduino.reactive.arduino.ArduinoCommunicationModule;

@Aspect(className = ArduinoCommunicationModule.class)
@SuppressWarnings("all")
public abstract class ArduinoCommunicationModule_PushAspect {
  @Abstract
  public static void push(final ArduinoCommunicationModule _self) {
    final org.imt.arduino.reactive.interpreter.ArduinoCommunicationModule_PushAspectArduinoCommunicationModuleAspectProperties _self_ = org.imt.arduino.reactive.interpreter.ArduinoCommunicationModule_PushAspectArduinoCommunicationModuleAspectContext.getSelf(_self);
    	// BeginInjectInto org.imt.arduino.reactive.interpreter.ArduinoCommunicationModule_PushAspect#void push() from org.imt.arduino.reactive.interpreter.BluetoothTransceiver_PushAspect
    		if (_self instanceof org.imt.arduino.reactive.arduino.BluetoothTransceiver){
    			org.imt.arduino.reactive.interpreter.BluetoothTransceiver_PushAspect.push((org.imt.arduino.reactive.arduino.BluetoothTransceiver)_self);
    		} else
    		// EndInjectInto org.imt.arduino.reactive.interpreter.ArduinoCommunicationModule_PushAspect#void push() from org.imt.arduino.reactive.interpreter.BluetoothTransceiver_PushAspect
    // #DispatchPointCut_before# void push()
    if (_self instanceof org.imt.arduino.reactive.arduino.ArduinoCommunicationModule){
    	org.imt.arduino.reactive.interpreter.ArduinoCommunicationModule_PushAspect._privk3_push(_self_, (org.imt.arduino.reactive.arduino.ArduinoCommunicationModule)_self);
    };
  }
  
  protected static void _privk3_push(final ArduinoCommunicationModule_PushAspectArduinoCommunicationModuleAspectProperties _self_, final ArduinoCommunicationModule _self) {
    throw new java.lang.RuntimeException("Not implemented");
  }
}
