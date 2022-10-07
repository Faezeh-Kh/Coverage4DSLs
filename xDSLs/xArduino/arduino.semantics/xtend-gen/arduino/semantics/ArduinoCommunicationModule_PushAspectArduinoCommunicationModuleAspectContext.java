package arduino.semantics;

import arduino.ArduinoCommunicationModule;
import java.util.Map;

@SuppressWarnings("all")
public class ArduinoCommunicationModule_PushAspectArduinoCommunicationModuleAspectContext {
  public static final ArduinoCommunicationModule_PushAspectArduinoCommunicationModuleAspectContext INSTANCE = new ArduinoCommunicationModule_PushAspectArduinoCommunicationModuleAspectContext();

  public static ArduinoCommunicationModule_PushAspectArduinoCommunicationModuleAspectProperties getSelf(final ArduinoCommunicationModule _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new arduino.semantics.ArduinoCommunicationModule_PushAspectArduinoCommunicationModuleAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<ArduinoCommunicationModule, ArduinoCommunicationModule_PushAspectArduinoCommunicationModuleAspectProperties> map = new java.util.WeakHashMap<arduino.ArduinoCommunicationModule, arduino.semantics.ArduinoCommunicationModule_PushAspectArduinoCommunicationModuleAspectProperties>();

  public Map<ArduinoCommunicationModule, ArduinoCommunicationModule_PushAspectArduinoCommunicationModuleAspectProperties> getMap() {
    return map;
  }
}
