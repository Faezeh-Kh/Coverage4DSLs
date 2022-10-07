package arduino.semantics;

import arduino.InfraRedSensor;
import java.util.Map;

@SuppressWarnings("all")
public class InfraRedSensorAspectInfraRedSensorAspectContext {
  public static final InfraRedSensorAspectInfraRedSensorAspectContext INSTANCE = new InfraRedSensorAspectInfraRedSensorAspectContext();

  public static InfraRedSensorAspectInfraRedSensorAspectProperties getSelf(final InfraRedSensor _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new arduino.semantics.InfraRedSensorAspectInfraRedSensorAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<InfraRedSensor, InfraRedSensorAspectInfraRedSensorAspectProperties> map = new java.util.WeakHashMap<arduino.InfraRedSensor, arduino.semantics.InfraRedSensorAspectInfraRedSensorAspectProperties>();

  public Map<InfraRedSensor, InfraRedSensorAspectInfraRedSensorAspectProperties> getMap() {
    return map;
  }
}
