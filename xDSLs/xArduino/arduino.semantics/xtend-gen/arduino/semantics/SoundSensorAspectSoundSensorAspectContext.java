package arduino.semantics;

import arduino.SoundSensor;
import java.util.Map;

@SuppressWarnings("all")
public class SoundSensorAspectSoundSensorAspectContext {
  public static final SoundSensorAspectSoundSensorAspectContext INSTANCE = new SoundSensorAspectSoundSensorAspectContext();

  public static SoundSensorAspectSoundSensorAspectProperties getSelf(final SoundSensor _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new arduino.semantics.SoundSensorAspectSoundSensorAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<SoundSensor, SoundSensorAspectSoundSensorAspectProperties> map = new java.util.WeakHashMap<arduino.SoundSensor, arduino.semantics.SoundSensorAspectSoundSensorAspectProperties>();

  public Map<SoundSensor, SoundSensorAspectSoundSensorAspectProperties> getMap() {
    return map;
  }
}
