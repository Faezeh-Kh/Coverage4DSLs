package org.imt.arduino.reactive.interpreter;

import java.util.Map;
import org.imt.arduino.reactive.arduino.BluetoothTransceiver;

@SuppressWarnings("all")
public class BluetoothTransceiver_PushAspectBluetoothTransceiverAspectContext {
  public static final BluetoothTransceiver_PushAspectBluetoothTransceiverAspectContext INSTANCE = new BluetoothTransceiver_PushAspectBluetoothTransceiverAspectContext();
  
  public static BluetoothTransceiver_PushAspectBluetoothTransceiverAspectProperties getSelf(final BluetoothTransceiver _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.imt.arduino.reactive.interpreter.BluetoothTransceiver_PushAspectBluetoothTransceiverAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<BluetoothTransceiver, BluetoothTransceiver_PushAspectBluetoothTransceiverAspectProperties> map = new java.util.WeakHashMap<org.imt.arduino.reactive.arduino.BluetoothTransceiver, org.imt.arduino.reactive.interpreter.BluetoothTransceiver_PushAspectBluetoothTransceiverAspectProperties>();
  
  public Map<BluetoothTransceiver, BluetoothTransceiver_PushAspectBluetoothTransceiverAspectProperties> getMap() {
    return map;
  }
}
