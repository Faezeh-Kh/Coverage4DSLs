package org.imt.arduino.reactive.interpreter;

import java.util.Map;
import org.imt.arduino.reactive.arduino.ArduinoCommunicationModule;

@SuppressWarnings("all")
public class ArduinoCommunicationModule_PushAspectArduinoCommunicationModuleAspectContext {
  public static final ArduinoCommunicationModule_PushAspectArduinoCommunicationModuleAspectContext INSTANCE = new ArduinoCommunicationModule_PushAspectArduinoCommunicationModuleAspectContext();
  
  public static ArduinoCommunicationModule_PushAspectArduinoCommunicationModuleAspectProperties getSelf(final ArduinoCommunicationModule _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.imt.arduino.reactive.interpreter.ArduinoCommunicationModule_PushAspectArduinoCommunicationModuleAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<ArduinoCommunicationModule, ArduinoCommunicationModule_PushAspectArduinoCommunicationModuleAspectProperties> map = new java.util.WeakHashMap<org.imt.arduino.reactive.arduino.ArduinoCommunicationModule, org.imt.arduino.reactive.interpreter.ArduinoCommunicationModule_PushAspectArduinoCommunicationModuleAspectProperties>();
  
  public Map<ArduinoCommunicationModule, ArduinoCommunicationModule_PushAspectArduinoCommunicationModuleAspectProperties> getMap() {
    return map;
  }
}
