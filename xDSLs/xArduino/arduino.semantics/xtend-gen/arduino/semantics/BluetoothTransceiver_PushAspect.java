package arduino.semantics;

import arduino.BluetoothTransceiver;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;

@Aspect(className = BluetoothTransceiver.class)
@SuppressWarnings("all")
public abstract class BluetoothTransceiver_PushAspect extends ArduinoCommunicationModule_PushAspect {
  @Step
  @OverrideAspectMethod
  public static void push(final BluetoothTransceiver _self) {
    final arduino.semantics.BluetoothTransceiver_PushAspectBluetoothTransceiverAspectProperties _self_ = arduino.semantics.BluetoothTransceiver_PushAspectBluetoothTransceiverAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void push()
    if (_self instanceof arduino.BluetoothTransceiver){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			arduino.semantics.BluetoothTransceiver_PushAspect._privk3_push(_self_, (arduino.BluetoothTransceiver)_self);
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {_self}, command, "BluetoothTransceiver", "push");
    	} else {
    		command.execute();
    	}
    	;
    };
  }

  public static EList<Integer> dataToSend(final BluetoothTransceiver _self) {
    final arduino.semantics.BluetoothTransceiver_PushAspectBluetoothTransceiverAspectProperties _self_ = arduino.semantics.BluetoothTransceiver_PushAspectBluetoothTransceiverAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# EList<Integer> dataToSend()
    if (_self instanceof arduino.BluetoothTransceiver){
    	result = arduino.semantics.BluetoothTransceiver_PushAspect._privk3_dataToSend(_self_, (arduino.BluetoothTransceiver)_self);
    };
    return (org.eclipse.emf.common.util.EList<java.lang.Integer>)result;
  }

  public static void dataToSend(final BluetoothTransceiver _self, final EList<Integer> dataToSend) {
    final arduino.semantics.BluetoothTransceiver_PushAspectBluetoothTransceiverAspectProperties _self_ = arduino.semantics.BluetoothTransceiver_PushAspectBluetoothTransceiverAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void dataToSend(EList<Integer>)
    if (_self instanceof arduino.BluetoothTransceiver){
    	arduino.semantics.BluetoothTransceiver_PushAspect._privk3_dataToSend(_self_, (arduino.BluetoothTransceiver)_self,dataToSend);
    };
  }

  public static EList<Integer> dataReceived(final BluetoothTransceiver _self) {
    final arduino.semantics.BluetoothTransceiver_PushAspectBluetoothTransceiverAspectProperties _self_ = arduino.semantics.BluetoothTransceiver_PushAspectBluetoothTransceiverAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# EList<Integer> dataReceived()
    if (_self instanceof arduino.BluetoothTransceiver){
    	result = arduino.semantics.BluetoothTransceiver_PushAspect._privk3_dataReceived(_self_, (arduino.BluetoothTransceiver)_self);
    };
    return (org.eclipse.emf.common.util.EList<java.lang.Integer>)result;
  }

  public static void dataReceived(final BluetoothTransceiver _self, final EList<Integer> dataReceived) {
    final arduino.semantics.BluetoothTransceiver_PushAspectBluetoothTransceiverAspectProperties _self_ = arduino.semantics.BluetoothTransceiver_PushAspectBluetoothTransceiverAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void dataReceived(EList<Integer>)
    if (_self instanceof arduino.BluetoothTransceiver){
    	arduino.semantics.BluetoothTransceiver_PushAspect._privk3_dataReceived(_self_, (arduino.BluetoothTransceiver)_self,dataReceived);
    };
  }

  protected static void _privk3_push(final BluetoothTransceiver_PushAspectBluetoothTransceiverAspectProperties _self_, final BluetoothTransceiver _self) {
    final Consumer<BluetoothTransceiver> _function = (BluetoothTransceiver t) -> {
      final EList<Integer> l = BluetoothTransceiver_PushAspect.dataReceived(t);
      final Consumer<Integer> _function_1 = (Integer i) -> {
        l.add(i);
      };
      BluetoothTransceiver_PushAspect.dataToSend(_self).forEach(_function_1);
    };
    _self.getConnectedTransceiver().forEach(_function);
    BluetoothTransceiver_PushAspect.dataToSend(_self).clear();
  }

  protected static EList<Integer> _privk3_dataToSend(final BluetoothTransceiver_PushAspectBluetoothTransceiverAspectProperties _self_, final BluetoothTransceiver _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getDataToSend") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (org.eclipse.emf.common.util.EList) ret;
    				} else {
    					return null;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.dataToSend;
  }

  protected static void _privk3_dataToSend(final BluetoothTransceiver_PushAspectBluetoothTransceiverAspectProperties _self_, final BluetoothTransceiver _self, final EList<Integer> dataToSend) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setDataToSend")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, dataToSend);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.dataToSend = dataToSend;
    }
  }

  protected static EList<Integer> _privk3_dataReceived(final BluetoothTransceiver_PushAspectBluetoothTransceiverAspectProperties _self_, final BluetoothTransceiver _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getDataReceived") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (org.eclipse.emf.common.util.EList) ret;
    				} else {
    					return null;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.dataReceived;
  }

  protected static void _privk3_dataReceived(final BluetoothTransceiver_PushAspectBluetoothTransceiverAspectProperties _self_, final BluetoothTransceiver _self, final EList<Integer> dataReceived) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setDataReceived")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, dataReceived);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.dataReceived = dataReceived;
    }
  }
}
