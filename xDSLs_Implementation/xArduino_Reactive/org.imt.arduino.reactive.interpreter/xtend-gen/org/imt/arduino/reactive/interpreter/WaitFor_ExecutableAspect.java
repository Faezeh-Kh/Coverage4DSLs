package org.imt.arduino.reactive.interpreter;

import com.google.common.base.Objects;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.imt.arduino.reactive.arduino.ChangeType;
import org.imt.arduino.reactive.arduino.WaitFor;

@Aspect(className = WaitFor.class)
@SuppressWarnings("all")
public class WaitFor_ExecutableAspect extends Utilities_ExecutableAspect {
  @Step
  @OverrideAspectMethod
  public static void execute(final WaitFor _self) {
    final org.imt.arduino.reactive.interpreter.WaitFor_ExecutableAspectWaitForAspectProperties _self_ = org.imt.arduino.reactive.interpreter.WaitFor_ExecutableAspectWaitForAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void execute()
    if (_self instanceof org.imt.arduino.reactive.arduino.WaitFor){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			org.imt.arduino.reactive.interpreter.WaitFor_ExecutableAspect._privk3_execute(_self_, (org.imt.arduino.reactive.arduino.WaitFor)_self);
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {_self}, command, "WaitFor", "execute");
    	} else {
    		command.execute();
    	}
    	;
    };
  }
  
  private static boolean isValidated(final WaitFor _self) {
    final org.imt.arduino.reactive.interpreter.WaitFor_ExecutableAspectWaitForAspectProperties _self_ = org.imt.arduino.reactive.interpreter.WaitFor_ExecutableAspectWaitForAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# boolean isValidated()
    if (_self instanceof org.imt.arduino.reactive.arduino.WaitFor){
    	result = org.imt.arduino.reactive.interpreter.WaitFor_ExecutableAspect._privk3_isValidated(_self_, (org.imt.arduino.reactive.arduino.WaitFor)_self);
    };
    return (boolean)result;
  }
  
  private static void loop(final WaitFor _self) {
    final org.imt.arduino.reactive.interpreter.WaitFor_ExecutableAspectWaitForAspectProperties _self_ = org.imt.arduino.reactive.interpreter.WaitFor_ExecutableAspectWaitForAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void loop()
    if (_self instanceof org.imt.arduino.reactive.arduino.WaitFor){
    	org.imt.arduino.reactive.interpreter.WaitFor_ExecutableAspect._privk3_loop(_self_, (org.imt.arduino.reactive.arduino.WaitFor)_self);
    };
  }
  
  public static void setActivated(final WaitFor _self) {
    final org.imt.arduino.reactive.interpreter.WaitFor_ExecutableAspectWaitForAspectProperties _self_ = org.imt.arduino.reactive.interpreter.WaitFor_ExecutableAspectWaitForAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void setActivated()
    if (_self instanceof org.imt.arduino.reactive.arduino.WaitFor){
    	org.imt.arduino.reactive.interpreter.WaitFor_ExecutableAspect._privk3_setActivated(_self_, (org.imt.arduino.reactive.arduino.WaitFor)_self);
    };
  }
  
  private static boolean waiting(final WaitFor _self) {
    final org.imt.arduino.reactive.interpreter.WaitFor_ExecutableAspectWaitForAspectProperties _self_ = org.imt.arduino.reactive.interpreter.WaitFor_ExecutableAspectWaitForAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# boolean waiting()
    if (_self instanceof org.imt.arduino.reactive.arduino.WaitFor){
    	result = org.imt.arduino.reactive.interpreter.WaitFor_ExecutableAspect._privk3_waiting(_self_, (org.imt.arduino.reactive.arduino.WaitFor)_self);
    };
    return (boolean)result;
  }
  
  private static void waiting(final WaitFor _self, final boolean waiting) {
    final org.imt.arduino.reactive.interpreter.WaitFor_ExecutableAspectWaitForAspectProperties _self_ = org.imt.arduino.reactive.interpreter.WaitFor_ExecutableAspectWaitForAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void waiting(boolean)
    if (_self instanceof org.imt.arduino.reactive.arduino.WaitFor){
    	org.imt.arduino.reactive.interpreter.WaitFor_ExecutableAspect._privk3_waiting(_self_, (org.imt.arduino.reactive.arduino.WaitFor)_self,waiting);
    };
  }
  
  private static boolean moduleActivated(final WaitFor _self) {
    final org.imt.arduino.reactive.interpreter.WaitFor_ExecutableAspectWaitForAspectProperties _self_ = org.imt.arduino.reactive.interpreter.WaitFor_ExecutableAspectWaitForAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# boolean moduleActivated()
    if (_self instanceof org.imt.arduino.reactive.arduino.WaitFor){
    	result = org.imt.arduino.reactive.interpreter.WaitFor_ExecutableAspect._privk3_moduleActivated(_self_, (org.imt.arduino.reactive.arduino.WaitFor)_self);
    };
    return (boolean)result;
  }
  
  private static void moduleActivated(final WaitFor _self, final boolean moduleActivated) {
    final org.imt.arduino.reactive.interpreter.WaitFor_ExecutableAspectWaitForAspectProperties _self_ = org.imt.arduino.reactive.interpreter.WaitFor_ExecutableAspectWaitForAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void moduleActivated(boolean)
    if (_self instanceof org.imt.arduino.reactive.arduino.WaitFor){
    	org.imt.arduino.reactive.interpreter.WaitFor_ExecutableAspect._privk3_moduleActivated(_self_, (org.imt.arduino.reactive.arduino.WaitFor)_self,moduleActivated);
    };
  }
  
  private static int value(final WaitFor _self) {
    final org.imt.arduino.reactive.interpreter.WaitFor_ExecutableAspectWaitForAspectProperties _self_ = org.imt.arduino.reactive.interpreter.WaitFor_ExecutableAspectWaitForAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# int value()
    if (_self instanceof org.imt.arduino.reactive.arduino.WaitFor){
    	result = org.imt.arduino.reactive.interpreter.WaitFor_ExecutableAspect._privk3_value(_self_, (org.imt.arduino.reactive.arduino.WaitFor)_self);
    };
    return (int)result;
  }
  
  private static void value(final WaitFor _self, final int value) {
    final org.imt.arduino.reactive.interpreter.WaitFor_ExecutableAspectWaitForAspectProperties _self_ = org.imt.arduino.reactive.interpreter.WaitFor_ExecutableAspectWaitForAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void value(int)
    if (_self instanceof org.imt.arduino.reactive.arduino.WaitFor){
    	org.imt.arduino.reactive.interpreter.WaitFor_ExecutableAspect._privk3_value(_self_, (org.imt.arduino.reactive.arduino.WaitFor)_self,value);
    };
  }
  
  private static void super_execute(final WaitFor _self) {
    final org.imt.arduino.reactive.interpreter.Utilities_ExecutableAspectUtilitiesAspectProperties _self_ = org.imt.arduino.reactive.interpreter.Utilities_ExecutableAspectUtilitiesAspectContext.getSelf(_self);
     org.imt.arduino.reactive.interpreter.Utilities_ExecutableAspect._privk3_execute(_self_, _self);
  }
  
  protected static void _privk3_execute(final WaitFor_ExecutableAspectWaitForAspectProperties _self_, final WaitFor _self) {
    WaitFor_ExecutableAspect.value(_self, _self.getPin().getLevel());
    WaitFor_ExecutableAspect.waiting(_self, true);
    while ((!WaitFor_ExecutableAspect.isValidated(_self))) {
      {
        WaitFor_ExecutableAspect.moduleActivated(_self, false);
        WaitFor_ExecutableAspect.loop(_self);
      }
    }
    boolean _isValidated = WaitFor_ExecutableAspect.isValidated(_self);
    if (_isValidated) {
      WaitFor_ExecutableAspect.moduleActivated(_self, false);
      WaitFor_ExecutableAspect.waiting(_self, false);
      return;
    }
    WaitFor_ExecutableAspect.moduleActivated(_self, false);
    WaitFor_ExecutableAspect.waiting(_self, false);
  }
  
  protected static boolean _privk3_isValidated(final WaitFor_ExecutableAspectWaitForAspectProperties _self_, final WaitFor _self) {
    ChangeType _mode = _self.getMode();
    boolean _equals = Objects.equal(_mode, ChangeType.CHANGE);
    if (_equals) {
      int _value = WaitFor_ExecutableAspect.value(_self);
      int _level = _self.getPin().getLevel();
      return (_value != _level);
    } else {
      ChangeType _mode_1 = _self.getMode();
      boolean _equals_1 = Objects.equal(_mode_1, ChangeType.RISING);
      if (_equals_1) {
        int _value_1 = WaitFor_ExecutableAspect.value(_self);
        int _level_1 = _self.getPin().getLevel();
        return (_value_1 < _level_1);
      } else {
        ChangeType _mode_2 = _self.getMode();
        boolean _equals_2 = Objects.equal(_mode_2, ChangeType.FALLING);
        if (_equals_2) {
          int _value_2 = WaitFor_ExecutableAspect.value(_self);
          int _level_2 = _self.getPin().getLevel();
          return (_value_2 > _level_2);
        } else {
          return false;
        }
      }
    }
  }
  
  protected static void _privk3_loop(final WaitFor_ExecutableAspectWaitForAspectProperties _self_, final WaitFor _self) {
    try {
      Thread.sleep(10);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  protected static void _privk3_setActivated(final WaitFor_ExecutableAspectWaitForAspectProperties _self_, final WaitFor _self) {
    boolean _waiting = WaitFor_ExecutableAspect.waiting(_self);
    if (_waiting) {
      WaitFor_ExecutableAspect.moduleActivated(_self, true);
    }
  }
  
  protected static boolean _privk3_waiting(final WaitFor_ExecutableAspectWaitForAspectProperties _self_, final WaitFor _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("isWaiting") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (boolean) ret;
    				}		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.waiting;
  }
  
  protected static void _privk3_waiting(final WaitFor_ExecutableAspectWaitForAspectProperties _self_, final WaitFor _self, final boolean waiting) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setWaiting")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, waiting);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.waiting = waiting;
    }
  }
  
  protected static boolean _privk3_moduleActivated(final WaitFor_ExecutableAspectWaitForAspectProperties _self_, final WaitFor _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("isModuleActivated") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (boolean) ret;
    				}		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.moduleActivated;
  }
  
  protected static void _privk3_moduleActivated(final WaitFor_ExecutableAspectWaitForAspectProperties _self_, final WaitFor _self, final boolean moduleActivated) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setModuleActivated")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, moduleActivated);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.moduleActivated = moduleActivated;
    }
  }
  
  protected static int _privk3_value(final WaitFor_ExecutableAspectWaitForAspectProperties _self_, final WaitFor _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getValue") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (int) ret;
    				}		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.value;
  }
  
  protected static void _privk3_value(final WaitFor_ExecutableAspectWaitForAspectProperties _self_, final WaitFor _self, final int value) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setValue")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, value);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.value = value;
    }
  }
}
