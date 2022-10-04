package arduino.behavioralinterface;

import static org.eclipse.gemoc.executionframework.event.manager.IImplementationRelationship.loadBehavioralInterface;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.gemoc.executionframework.behavioralinterface.behavioralInterface.BehavioralInterface;
import org.eclipse.gemoc.executionframework.behavioralinterface.behavioralInterface.Event;
import org.eclipse.gemoc.executionframework.event.manager.SimpleImplementationRelationship;

public class ArduinoImplementationRelationship extends SimpleImplementationRelationship {
	
	private static Map<String, String> computeEventToMethodMap() {
		final Map<String, String> result = new HashMap<>();
		//Accepted rules
		result.put("run", "arduino.semantics.SketchAspect.execute");
		result.put("button_pressed", "arduino.semantics.PushButtonAspect.press");
		result.put("button_released", "arduino.semantics.PushButtonAspect.release");
		result.put("IRSensor_detected", "arduino.semantics.InfraRedSensorAspect.detect");
		result.put("IRSensor_notDetected", "arduino.semantics.InfraRedSensorAspect.notDetect");
		result.put("soundSensor_detected", "arduino.semantics.SoundSensorAspect.detect");
		//Exposed rules
		result.put("pin_level_changed", "arduino.DigitalPin.changeLevel");
		return result;
	}
	private static Set<String> computeRunToCompletionMap(List<Event> events) {
		final Set<String> result = new HashSet<>();
//		result.add("arduino.semantics.SketchAspect.execute");
//		result.add("arduino.semantics.PushButtonAspect.press");
//		result.add("arduino.semantics.PushButtonAspect.release");
//		result.add("arduino.semantics.InfraRedSensorAspect.detect");
//		result.add("arduino.semantics.InfraRedSensorAspect.notDetect");
//		result.add("arduino.semantics.SoundSensorAspect.detect");
		return result;
	}
	public ArduinoImplementationRelationship() {
		this(loadBehavioralInterface("platform:/plugin/arduino.behavioralinterface/Arduino.bi"));
	}

	public ArduinoImplementationRelationship(BehavioralInterface behavioralInterface) {
		//TODO: we manually set the name of the DSL as the last argument but it has to be the rule executor
		super(behavioralInterface, computeRunToCompletionMap(behavioralInterface.getEvents()), computeEventToMethodMap(), "ArduinoDSL");
	}
}
