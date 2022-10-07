package arduino.semantics;

import arduino.ArduinoCommunicationModule;
import fr.inria.diverse.k3.al.annotationprocessor.Abstract;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;

@Aspect(className = ArduinoCommunicationModule.class)
@SuppressWarnings("all")
public abstract class ArduinoCommunicationModule_PushAspect {
  @Abstract
  public static void push(final ArduinoCommunicationModule _self) {
    final arduino.semantics.ArduinoCommunicationModule_PushAspectArduinoCommunicationModuleAspectProperties _self_ = arduino.semantics.ArduinoCommunicationModule_PushAspectArduinoCommunicationModuleAspectContext.getSelf(_self);
    	// BeginInjectInto arduino.semantics.ArduinoCommunicationModule_PushAspect#void push() from arduino.semantics.BluetoothTransceiver_PushAspect
    		if (_self instanceof arduino.BluetoothTransceiver){
    			arduino.semantics.BluetoothTransceiver_PushAspect.push((arduino.BluetoothTransceiver)_self);
    		} else
    		// EndInjectInto arduino.semantics.ArduinoCommunicationModule_PushAspect#void push() from arduino.semantics.BluetoothTransceiver_PushAspect
    // #DispatchPointCut_before# void push()
    if (_self instanceof arduino.ArduinoCommunicationModule){
    	arduino.semantics.ArduinoCommunicationModule_PushAspect._privk3_push(_self_, (arduino.ArduinoCommunicationModule)_self);
    };
  }

  protected static void _privk3_push(final ArduinoCommunicationModule_PushAspectArduinoCommunicationModuleAspectProperties _self_, final ArduinoCommunicationModule _self) {
    throw new java.lang.RuntimeException("Not implemented");
  }
}
