package org.imt.k3tdl.k3dsa;

import com.google.common.base.Objects;
import coverage.computation.TDLTestCaseCoverage;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.etsi.mts.tdl.TestDescription;
import org.imt.tdl.configuration.EngineFactory;
import org.imt.tdl.testResult.TDLTestCaseResult;
import org.imt.tdl.testResult.TDLTestResultUtil;

@Aspect(className = TestDescription.class)
@SuppressWarnings("all")
public class TestDescriptionAspect {
  @Step
  public static TDLTestCaseResult executeTestCase(final TestDescription _self) {
    final org.imt.k3tdl.k3dsa.TestDescriptionAspectTestDescriptionAspectProperties _self_ = org.imt.k3tdl.k3dsa.TestDescriptionAspectTestDescriptionAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# TDLTestCaseResult executeTestCase()
    if (_self instanceof org.etsi.mts.tdl.TestDescription){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			addToResult(org.imt.k3tdl.k3dsa.TestDescriptionAspect._privk3_executeTestCase(_self_, (org.etsi.mts.tdl.TestDescription)_self));
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {_self}, command, "TestDescription", "executeTestCase");
    	} else {
    		command.execute();
    	}
    	result = command.getResult();
    	;
    };
    return (org.imt.tdl.testResult.TDLTestCaseResult)result;
  }

  public static TDLTestCaseResult executeTestCase(final TestDescription _self, final String MUTPath) {
    final org.imt.k3tdl.k3dsa.TestDescriptionAspectTestDescriptionAspectProperties _self_ = org.imt.k3tdl.k3dsa.TestDescriptionAspectTestDescriptionAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# TDLTestCaseResult executeTestCase(String)
    if (_self instanceof org.etsi.mts.tdl.TestDescription){
    	result = org.imt.k3tdl.k3dsa.TestDescriptionAspect._privk3_executeTestCase(_self_, (org.etsi.mts.tdl.TestDescription)_self,MUTPath);
    };
    return (org.imt.tdl.testResult.TDLTestCaseResult)result;
  }

  public static void activateConfiguration(final TestDescription _self) {
    final org.imt.k3tdl.k3dsa.TestDescriptionAspectTestDescriptionAspectProperties _self_ = org.imt.k3tdl.k3dsa.TestDescriptionAspectTestDescriptionAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void activateConfiguration()
    if (_self instanceof org.etsi.mts.tdl.TestDescription){
    	org.imt.k3tdl.k3dsa.TestDescriptionAspect._privk3_activateConfiguration(_self_, (org.etsi.mts.tdl.TestDescription)_self);
    };
  }

  public static void activateConfiguration(final TestDescription _self, final String MUTPath) {
    final org.imt.k3tdl.k3dsa.TestDescriptionAspectTestDescriptionAspectProperties _self_ = org.imt.k3tdl.k3dsa.TestDescriptionAspectTestDescriptionAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void activateConfiguration(String)
    if (_self instanceof org.etsi.mts.tdl.TestDescription){
    	org.imt.k3tdl.k3dsa.TestDescriptionAspect._privk3_activateConfiguration(_self_, (org.etsi.mts.tdl.TestDescription)_self,MUTPath);
    };
  }

  public static TDLTestCaseResult runTestAndReturnResult(final TestDescription _self) {
    final org.imt.k3tdl.k3dsa.TestDescriptionAspectTestDescriptionAspectProperties _self_ = org.imt.k3tdl.k3dsa.TestDescriptionAspectTestDescriptionAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# TDLTestCaseResult runTestAndReturnResult()
    if (_self instanceof org.etsi.mts.tdl.TestDescription){
    	result = org.imt.k3tdl.k3dsa.TestDescriptionAspect._privk3_runTestAndReturnResult(_self_, (org.etsi.mts.tdl.TestDescription)_self);
    };
    return (org.imt.tdl.testResult.TDLTestCaseResult)result;
  }

  public static EngineFactory launcher(final TestDescription _self) {
    final org.imt.k3tdl.k3dsa.TestDescriptionAspectTestDescriptionAspectProperties _self_ = org.imt.k3tdl.k3dsa.TestDescriptionAspectTestDescriptionAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# EngineFactory launcher()
    if (_self instanceof org.etsi.mts.tdl.TestDescription){
    	result = org.imt.k3tdl.k3dsa.TestDescriptionAspect._privk3_launcher(_self_, (org.etsi.mts.tdl.TestDescription)_self);
    };
    return (org.imt.tdl.configuration.EngineFactory)result;
  }

  public static void launcher(final TestDescription _self, final EngineFactory launcher) {
    final org.imt.k3tdl.k3dsa.TestDescriptionAspectTestDescriptionAspectProperties _self_ = org.imt.k3tdl.k3dsa.TestDescriptionAspectTestDescriptionAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void launcher(EngineFactory)
    if (_self instanceof org.etsi.mts.tdl.TestDescription){
    	org.imt.k3tdl.k3dsa.TestDescriptionAspect._privk3_launcher(_self_, (org.etsi.mts.tdl.TestDescription)_self,launcher);
    };
  }

  public static TDLTestCaseResult testCaseResult(final TestDescription _self) {
    final org.imt.k3tdl.k3dsa.TestDescriptionAspectTestDescriptionAspectProperties _self_ = org.imt.k3tdl.k3dsa.TestDescriptionAspectTestDescriptionAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# TDLTestCaseResult testCaseResult()
    if (_self instanceof org.etsi.mts.tdl.TestDescription){
    	result = org.imt.k3tdl.k3dsa.TestDescriptionAspect._privk3_testCaseResult(_self_, (org.etsi.mts.tdl.TestDescription)_self);
    };
    return (org.imt.tdl.testResult.TDLTestCaseResult)result;
  }

  public static void testCaseResult(final TestDescription _self, final TDLTestCaseResult testCaseResult) {
    final org.imt.k3tdl.k3dsa.TestDescriptionAspectTestDescriptionAspectProperties _self_ = org.imt.k3tdl.k3dsa.TestDescriptionAspectTestDescriptionAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void testCaseResult(TDLTestCaseResult)
    if (_self instanceof org.etsi.mts.tdl.TestDescription){
    	org.imt.k3tdl.k3dsa.TestDescriptionAspect._privk3_testCaseResult(_self_, (org.etsi.mts.tdl.TestDescription)_self,testCaseResult);
    };
  }

  public static TDLTestCaseCoverage testCaseCoverage(final TestDescription _self) {
    final org.imt.k3tdl.k3dsa.TestDescriptionAspectTestDescriptionAspectProperties _self_ = org.imt.k3tdl.k3dsa.TestDescriptionAspectTestDescriptionAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# TDLTestCaseCoverage testCaseCoverage()
    if (_self instanceof org.etsi.mts.tdl.TestDescription){
    	result = org.imt.k3tdl.k3dsa.TestDescriptionAspect._privk3_testCaseCoverage(_self_, (org.etsi.mts.tdl.TestDescription)_self);
    };
    return (coverage.computation.TDLTestCaseCoverage)result;
  }

  public static void testCaseCoverage(final TestDescription _self, final TDLTestCaseCoverage testCaseCoverage) {
    final org.imt.k3tdl.k3dsa.TestDescriptionAspectTestDescriptionAspectProperties _self_ = org.imt.k3tdl.k3dsa.TestDescriptionAspectTestDescriptionAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void testCaseCoverage(TDLTestCaseCoverage)
    if (_self instanceof org.etsi.mts.tdl.TestDescription){
    	org.imt.k3tdl.k3dsa.TestDescriptionAspect._privk3_testCaseCoverage(_self_, (org.etsi.mts.tdl.TestDescription)_self,testCaseCoverage);
    };
  }

  protected static TDLTestCaseResult _privk3_executeTestCase(final TestDescriptionAspectTestDescriptionAspectProperties _self_, final TestDescription _self) {
    if ((!TestDescriptionAspect.launcher(_self).launcherIsTuned)) {
      TestDescriptionAspect.activateConfiguration(_self);
    }
    return TestDescriptionAspect.runTestAndReturnResult(_self);
  }

  protected static TDLTestCaseResult _privk3_executeTestCase(final TestDescriptionAspectTestDescriptionAspectProperties _self_, final TestDescription _self, final String MUTPath) {
    TestDescriptionAspect.activateConfiguration(_self, MUTPath);
    final TDLTestCaseResult result = TestDescriptionAspect.runTestAndReturnResult(_self);
    return result;
  }

  protected static void _privk3_activateConfiguration(final TestDescriptionAspectTestDescriptionAspectProperties _self_, final TestDescription _self) {
    TestConfigurationAspect.activateConfiguration(_self.getTestConfiguration(), TestDescriptionAspect.launcher(_self));
  }

  protected static void _privk3_activateConfiguration(final TestDescriptionAspectTestDescriptionAspectProperties _self_, final TestDescription _self, final String MUTPath) {
    EngineFactory _engineFactory = new EngineFactory();
    TestDescriptionAspect.launcher(_self, _engineFactory);
    TDLTestCaseResult _tDLTestCaseResult = new TDLTestCaseResult();
    TestDescriptionAspect.testCaseResult(_self, _tDLTestCaseResult);
    TDLTestCaseCoverage _tDLTestCaseCoverage = new TDLTestCaseCoverage();
    TestDescriptionAspect.testCaseCoverage(_self, _tDLTestCaseCoverage);
    TestConfigurationAspect.activateConfiguration(_self.getTestConfiguration(), TestDescriptionAspect.launcher(_self), MUTPath);
  }

  protected static TDLTestCaseResult _privk3_runTestAndReturnResult(final TestDescriptionAspectTestDescriptionAspectProperties _self_, final TestDescription _self) {
    String _name = _self.getName();
    String _plus = ("Start test case execution: " + _name);
    InputOutput.<String>println(_plus);
    TDLTestCaseResult _testCaseResult = TestDescriptionAspect.testCaseResult(_self);
    _testCaseResult.setTestCase(_self);
    BehaviourDescriptionAspect.callBehavior(_self.getBehaviourDescription());
    final String modelExecutionResult = TestConfigurationAspect.stopModelExecutionEngine(_self.getTestConfiguration(), TestDescriptionAspect.launcher(_self));
    if (((modelExecutionResult != null) && modelExecutionResult.contains(TDLTestResultUtil.FAIL))) {
      TDLTestCaseResult _testCaseResult_1 = TestDescriptionAspect.testCaseResult(_self);
      _testCaseResult_1.setValue(TDLTestResultUtil.FAIL);
      TDLTestCaseResult _testCaseResult_2 = TestDescriptionAspect.testCaseResult(_self);
      int _indexOf = modelExecutionResult.indexOf(":");
      int _plus_1 = (_indexOf + 1);
      _testCaseResult_2.setDescription(modelExecutionResult.substring(_plus_1));
    }
    String _name_1 = _self.getName();
    String _plus_2 = ("Test case " + _name_1);
    String _plus_3 = (_plus_2 + ": ");
    String _value = TestDescriptionAspect.testCaseResult(_self).getValue();
    String _plus_4 = (_plus_3 + _value);
    InputOutput.<String>println(_plus_4);
    String _value_1 = TestDescriptionAspect.testCaseResult(_self).getValue();
    boolean _notEquals = (!Objects.equal(_value_1, TDLTestResultUtil.INCONCLUSIVE));
    if (_notEquals) {
      TDLTestCaseCoverage _testCaseCoverage = TestDescriptionAspect.testCaseCoverage(_self);
      _testCaseCoverage.setTestCase(_self);
      TDLTestCaseCoverage _testCaseCoverage_1 = TestDescriptionAspect.testCaseCoverage(_self);
      _testCaseCoverage_1.setTrace(TestDescriptionAspect.launcher(_self).getExecutionTrace());
      TDLTestCaseCoverage _testCaseCoverage_2 = TestDescriptionAspect.testCaseCoverage(_self);
      _testCaseCoverage_2.setMUTResource(TestDescriptionAspect.launcher(_self).getMUTResource());
    }
    return TestDescriptionAspect.testCaseResult(_self);
  }

  protected static EngineFactory _privk3_launcher(final TestDescriptionAspectTestDescriptionAspectProperties _self_, final TestDescription _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getLauncher") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (org.imt.tdl.configuration.EngineFactory) ret;
    				} else {
    					return null;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.launcher;
  }

  protected static void _privk3_launcher(final TestDescriptionAspectTestDescriptionAspectProperties _self_, final TestDescription _self, final EngineFactory launcher) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setLauncher")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, launcher);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.launcher = launcher;
    }
  }

  protected static TDLTestCaseResult _privk3_testCaseResult(final TestDescriptionAspectTestDescriptionAspectProperties _self_, final TestDescription _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getTestCaseResult") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (org.imt.tdl.testResult.TDLTestCaseResult) ret;
    				} else {
    					return null;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.testCaseResult;
  }

  protected static void _privk3_testCaseResult(final TestDescriptionAspectTestDescriptionAspectProperties _self_, final TestDescription _self, final TDLTestCaseResult testCaseResult) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setTestCaseResult")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, testCaseResult);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.testCaseResult = testCaseResult;
    }
  }

  protected static TDLTestCaseCoverage _privk3_testCaseCoverage(final TestDescriptionAspectTestDescriptionAspectProperties _self_, final TestDescription _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getTestCaseCoverage") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (coverage.computation.TDLTestCaseCoverage) ret;
    				} else {
    					return null;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.testCaseCoverage;
  }

  protected static void _privk3_testCaseCoverage(final TestDescriptionAspectTestDescriptionAspectProperties _self_, final TestDescription _self, final TDLTestCaseCoverage testCaseCoverage) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setTestCaseCoverage")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, testCaseCoverage);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.testCaseCoverage = testCaseCoverage;
    }
  }
}
