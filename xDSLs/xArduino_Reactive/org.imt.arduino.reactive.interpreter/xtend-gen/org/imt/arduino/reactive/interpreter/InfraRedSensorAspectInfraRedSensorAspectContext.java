package org.imt.arduino.reactive.interpreter;

import java.util.Map;
import org.imt.arduino.reactive.arduino.InfraRedSensor;

@SuppressWarnings("all")
public class InfraRedSensorAspectInfraRedSensorAspectContext {
  public static final InfraRedSensorAspectInfraRedSensorAspectContext INSTANCE = new InfraRedSensorAspectInfraRedSensorAspectContext();
  
  public static InfraRedSensorAspectInfraRedSensorAspectProperties getSelf(final InfraRedSensor _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.imt.arduino.reactive.interpreter.InfraRedSensorAspectInfraRedSensorAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<InfraRedSensor, InfraRedSensorAspectInfraRedSensorAspectProperties> map = new java.util.WeakHashMap<org.imt.arduino.reactive.arduino.InfraRedSensor, org.imt.arduino.reactive.interpreter.InfraRedSensorAspectInfraRedSensorAspectProperties>();
  
  public Map<InfraRedSensor, InfraRedSensorAspectInfraRedSensorAspectProperties> getMap() {
    return map;
  }
}
