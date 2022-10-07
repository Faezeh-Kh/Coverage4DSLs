package org.imt.k3tdl.k3dsa;

import com.google.common.base.Objects;
import coverage.computation.TDLCoverageUtil;
import coverage.computation.TDLTestSuiteCoverage;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.InitializeModel;
import fr.inria.diverse.k3.al.annotationprocessor.Main;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.etsi.mts.tdl.PackageableElement;
import org.etsi.mts.tdl.TestDescription;
import org.imt.tdl.testResult.TDLTestCaseResult;
import org.imt.tdl.testResult.TDLTestResultUtil;
import org.imt.tdl.testResult.TDLTestSuiteResult;

@Aspect(className = org.etsi.mts.tdl.Package.class)
@SuppressWarnings("all")
public class PackageAspect {
  @Step
  @InitializeModel
  public static void initializeModel(final org.etsi.mts.tdl.Package _self, final EList<String> args) {
    final org.imt.k3tdl.k3dsa.PackageAspectPackageAspectProperties _self_ = org.imt.k3tdl.k3dsa.PackageAspectPackageAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void initializeModel(EList<String>)
    if (_self instanceof org.etsi.mts.tdl.Package){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			org.imt.k3tdl.k3dsa.PackageAspect._privk3_initializeModel(_self_, (org.etsi.mts.tdl.Package)_self,args);
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {args}, command, "Package", "initializeModel");
    	} else {
    		command.execute();
    	}
    	;
    };
  }

  @Step
  @Main
  public static void main(final org.etsi.mts.tdl.Package _self) {
    final org.imt.k3tdl.k3dsa.PackageAspectPackageAspectProperties _self_ = org.imt.k3tdl.k3dsa.PackageAspectPackageAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void main()
    if (_self instanceof org.etsi.mts.tdl.Package){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			org.imt.k3tdl.k3dsa.PackageAspect._privk3_main(_self_, (org.etsi.mts.tdl.Package)_self);
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {_self}, command, "Package", "main");
    	} else {
    		command.execute();
    	}
    	;
    };
  }

  public static TDLTestSuiteResult executeTestSuite(final org.etsi.mts.tdl.Package _self) {
    final org.imt.k3tdl.k3dsa.PackageAspectPackageAspectProperties _self_ = org.imt.k3tdl.k3dsa.PackageAspectPackageAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# TDLTestSuiteResult executeTestSuite()
    if (_self instanceof org.etsi.mts.tdl.Package){
    	result = org.imt.k3tdl.k3dsa.PackageAspect._privk3_executeTestSuite(_self_, (org.etsi.mts.tdl.Package)_self);
    };
    return (org.imt.tdl.testResult.TDLTestSuiteResult)result;
  }

  private static List<TestDescription> testcases(final org.etsi.mts.tdl.Package _self) {
    final org.imt.k3tdl.k3dsa.PackageAspectPackageAspectProperties _self_ = org.imt.k3tdl.k3dsa.PackageAspectPackageAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# List<TestDescription> testcases()
    if (_self instanceof org.etsi.mts.tdl.Package){
    	result = org.imt.k3tdl.k3dsa.PackageAspect._privk3_testcases(_self_, (org.etsi.mts.tdl.Package)_self);
    };
    return (java.util.List<org.etsi.mts.tdl.TestDescription>)result;
  }

  private static void testcases(final org.etsi.mts.tdl.Package _self, final List<TestDescription> testcases) {
    final org.imt.k3tdl.k3dsa.PackageAspectPackageAspectProperties _self_ = org.imt.k3tdl.k3dsa.PackageAspectPackageAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void testcases(List<TestDescription>)
    if (_self instanceof org.etsi.mts.tdl.Package){
    	org.imt.k3tdl.k3dsa.PackageAspect._privk3_testcases(_self_, (org.etsi.mts.tdl.Package)_self,testcases);
    };
  }

  private static TDLTestSuiteResult testSuiteResult(final org.etsi.mts.tdl.Package _self) {
    final org.imt.k3tdl.k3dsa.PackageAspectPackageAspectProperties _self_ = org.imt.k3tdl.k3dsa.PackageAspectPackageAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# TDLTestSuiteResult testSuiteResult()
    if (_self instanceof org.etsi.mts.tdl.Package){
    	result = org.imt.k3tdl.k3dsa.PackageAspect._privk3_testSuiteResult(_self_, (org.etsi.mts.tdl.Package)_self);
    };
    return (org.imt.tdl.testResult.TDLTestSuiteResult)result;
  }

  private static void testSuiteResult(final org.etsi.mts.tdl.Package _self, final TDLTestSuiteResult testSuiteResult) {
    final org.imt.k3tdl.k3dsa.PackageAspectPackageAspectProperties _self_ = org.imt.k3tdl.k3dsa.PackageAspectPackageAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void testSuiteResult(TDLTestSuiteResult)
    if (_self instanceof org.etsi.mts.tdl.Package){
    	org.imt.k3tdl.k3dsa.PackageAspect._privk3_testSuiteResult(_self_, (org.etsi.mts.tdl.Package)_self,testSuiteResult);
    };
  }

  private static TDLTestSuiteCoverage testSuiteCoverage(final org.etsi.mts.tdl.Package _self) {
    final org.imt.k3tdl.k3dsa.PackageAspectPackageAspectProperties _self_ = org.imt.k3tdl.k3dsa.PackageAspectPackageAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# TDLTestSuiteCoverage testSuiteCoverage()
    if (_self instanceof org.etsi.mts.tdl.Package){
    	result = org.imt.k3tdl.k3dsa.PackageAspect._privk3_testSuiteCoverage(_self_, (org.etsi.mts.tdl.Package)_self);
    };
    return (coverage.computation.TDLTestSuiteCoverage)result;
  }

  private static void testSuiteCoverage(final org.etsi.mts.tdl.Package _self, final TDLTestSuiteCoverage testSuiteCoverage) {
    final org.imt.k3tdl.k3dsa.PackageAspectPackageAspectProperties _self_ = org.imt.k3tdl.k3dsa.PackageAspectPackageAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void testSuiteCoverage(TDLTestSuiteCoverage)
    if (_self instanceof org.etsi.mts.tdl.Package){
    	org.imt.k3tdl.k3dsa.PackageAspect._privk3_testSuiteCoverage(_self_, (org.etsi.mts.tdl.Package)_self,testSuiteCoverage);
    };
  }

  protected static void _privk3_initializeModel(final PackageAspectPackageAspectProperties _self_, final org.etsi.mts.tdl.Package _self, final EList<String> args) {
    final Function1<PackageableElement, Boolean> _function = new Function1<PackageableElement, Boolean>() {
      public Boolean apply(final PackageableElement p) {
        return Boolean.valueOf((p instanceof TestDescription));
      }
    };
    Iterable<PackageableElement> _filter = IterableExtensions.<PackageableElement>filter(_self.getPackagedElement(), _function);
    for (final Object o : _filter) {
      PackageAspect.testcases(_self).add(((TestDescription) o));
    }
    int _size = PackageAspect.testcases(_self).size();
    boolean _equals = (_size == 0);
    if (_equals) {
      String _name = _self.getName();
      String _plus = ("There is no test case in the package " + _name);
      String _plus_1 = (_plus + "to be executed");
      InputOutput.<String>println(_plus_1);
    }
  }

  protected static void _privk3_main(final PackageAspectPackageAspectProperties _self_, final org.etsi.mts.tdl.Package _self) {
    try {
      PackageAspect.executeTestSuite(_self);
    } catch (final Throwable _t) {
      if (_t instanceof TDLRuntimeException) {
        final TDLRuntimeException nt = (TDLRuntimeException)_t;
        String _message = nt.getMessage();
        String _plus = ("Stopped due " + _message);
        InputOutput.<String>println(_plus);
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }

  protected static TDLTestSuiteResult _privk3_executeTestSuite(final PackageAspectPackageAspectProperties _self_, final org.etsi.mts.tdl.Package _self) {
    TDLTestSuiteResult _testSuiteResult = PackageAspect.testSuiteResult(_self);
    _testSuiteResult.setTestSuite(_self);
    TDLTestSuiteCoverage _testSuiteCoverage = PackageAspect.testSuiteCoverage(_self);
    _testSuiteCoverage.setTestSuite(_self);
    List<TestDescription> _testcases = PackageAspect.testcases(_self);
    for (final TestDescription testCase : _testcases) {
      {
        final TDLTestCaseResult testCaseResult = TestDescriptionAspect.executeTestCase(testCase);
        PackageAspect.testSuiteResult(_self).addResult(testCaseResult);
        String _value = testCaseResult.getValue();
        boolean _notEquals = (!Objects.equal(_value, TDLTestResultUtil.INCONCLUSIVE));
        if (_notEquals) {
          PackageAspect.testSuiteCoverage(_self).addTCCoverage(TestDescriptionAspect.testCaseCoverage(testCase));
        }
        InputOutput.println();
      }
    }
    TDLTestResultUtil _instance = TDLTestResultUtil.getInstance();
    _instance.setTestSuiteResult(PackageAspect.testSuiteResult(_self));
    TDLCoverageUtil _instance_1 = TDLCoverageUtil.getInstance();
    _instance_1.setTestSuiteCoverage(PackageAspect.testSuiteCoverage(_self));
    TDLCoverageUtil _instance_2 = TDLCoverageUtil.getInstance();
    _instance_2.setDSLPath(TestConfigurationAspect.DSLPath(PackageAspect.testcases(_self).get(0).getTestConfiguration()));
    InputOutput.<String>println("Test suite execution has been finished successfully.");
    return PackageAspect.testSuiteResult(_self);
  }

  protected static List<TestDescription> _privk3_testcases(final PackageAspectPackageAspectProperties _self_, final org.etsi.mts.tdl.Package _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getTestcases") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (java.util.List) ret;
    				} else {
    					return null;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.testcases;
  }

  protected static void _privk3_testcases(final PackageAspectPackageAspectProperties _self_, final org.etsi.mts.tdl.Package _self, final List<TestDescription> testcases) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setTestcases")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, testcases);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.testcases = testcases;
    }
  }

  protected static TDLTestSuiteResult _privk3_testSuiteResult(final PackageAspectPackageAspectProperties _self_, final org.etsi.mts.tdl.Package _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getTestSuiteResult") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (org.imt.tdl.testResult.TDLTestSuiteResult) ret;
    				} else {
    					return null;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.testSuiteResult;
  }

  protected static void _privk3_testSuiteResult(final PackageAspectPackageAspectProperties _self_, final org.etsi.mts.tdl.Package _self, final TDLTestSuiteResult testSuiteResult) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setTestSuiteResult")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, testSuiteResult);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.testSuiteResult = testSuiteResult;
    }
  }

  protected static TDLTestSuiteCoverage _privk3_testSuiteCoverage(final PackageAspectPackageAspectProperties _self_, final org.etsi.mts.tdl.Package _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getTestSuiteCoverage") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (coverage.computation.TDLTestSuiteCoverage) ret;
    				} else {
    					return null;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.testSuiteCoverage;
  }

  protected static void _privk3_testSuiteCoverage(final PackageAspectPackageAspectProperties _self_, final org.etsi.mts.tdl.Package _self, final TDLTestSuiteCoverage testSuiteCoverage) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setTestSuiteCoverage")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, testSuiteCoverage);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.testSuiteCoverage = testSuiteCoverage;
    }
  }
}
