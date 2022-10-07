package org.imt.k3tdl.k3dsa;

import com.google.common.base.Objects;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import java.util.Arrays;
import java.util.function.Predicate;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.etsi.mts.tdl.Annotation;
import org.etsi.mts.tdl.ComponentInstance;
import org.etsi.mts.tdl.Connection;
import org.etsi.mts.tdl.GateReference;
import org.etsi.mts.tdl.TestConfiguration;
import org.imt.tdl.configuration.EngineFactory;

@Aspect(className = TestConfiguration.class)
@SuppressWarnings("all")
public class TestConfigurationAspect {
  public static void activateConfiguration(final TestConfiguration _self, final EngineFactory launcher) {
    final org.imt.k3tdl.k3dsa.TestConfigurationAspectTestConfigurationAspectProperties _self_ = org.imt.k3tdl.k3dsa.TestConfigurationAspectTestConfigurationAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void activateConfiguration(EngineFactory)
    if (_self instanceof org.etsi.mts.tdl.TestConfiguration){
    	org.imt.k3tdl.k3dsa.TestConfigurationAspect._privk3_activateConfiguration(_self_, (org.etsi.mts.tdl.TestConfiguration)_self,launcher);
    };
  }

  public static void activateConfiguration(final TestConfiguration _self, final EngineFactory launcher, final String MUTPath) {
    final org.imt.k3tdl.k3dsa.TestConfigurationAspectTestConfigurationAspectProperties _self_ = org.imt.k3tdl.k3dsa.TestConfigurationAspectTestConfigurationAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void activateConfiguration(EngineFactory,String)
    if (_self instanceof org.etsi.mts.tdl.TestConfiguration){
    	org.imt.k3tdl.k3dsa.TestConfigurationAspect._privk3_activateConfiguration(_self_, (org.etsi.mts.tdl.TestConfiguration)_self,launcher,MUTPath);
    };
  }

  public static String getDSLPath(final TestConfiguration _self, final String DSLName) {
    final org.imt.k3tdl.k3dsa.TestConfigurationAspectTestConfigurationAspectProperties _self_ = org.imt.k3tdl.k3dsa.TestConfigurationAspectTestConfigurationAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# String getDSLPath(String)
    if (_self instanceof org.etsi.mts.tdl.TestConfiguration){
    	result = org.imt.k3tdl.k3dsa.TestConfigurationAspect._privk3_getDSLPath(_self_, (org.etsi.mts.tdl.TestConfiguration)_self,DSLName);
    };
    return (java.lang.String)result;
  }

  private static final String GENERIC_GATE = "genericGate";

  private static final String REACTIVE_GATE = "reactiveGate";

  private static final String OCL_GATE = "oclGate";

  public static void setUpLauncher(final TestConfiguration _self, final EngineFactory launcher) {
    final org.imt.k3tdl.k3dsa.TestConfigurationAspectTestConfigurationAspectProperties _self_ = org.imt.k3tdl.k3dsa.TestConfigurationAspectTestConfigurationAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void setUpLauncher(EngineFactory)
    if (_self instanceof org.etsi.mts.tdl.TestConfiguration){
    	org.imt.k3tdl.k3dsa.TestConfigurationAspect._privk3_setUpLauncher(_self_, (org.etsi.mts.tdl.TestConfiguration)_self,launcher);
    };
  }

  public static String stopModelExecutionEngine(final TestConfiguration _self, final EngineFactory launcher) {
    final org.imt.k3tdl.k3dsa.TestConfigurationAspectTestConfigurationAspectProperties _self_ = org.imt.k3tdl.k3dsa.TestConfigurationAspectTestConfigurationAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# String stopModelExecutionEngine(EngineFactory)
    if (_self instanceof org.etsi.mts.tdl.TestConfiguration){
    	result = org.imt.k3tdl.k3dsa.TestConfigurationAspect._privk3_stopModelExecutionEngine(_self_, (org.etsi.mts.tdl.TestConfiguration)_self,launcher);
    };
    return (java.lang.String)result;
  }

  public static String MUTPath(final TestConfiguration _self) {
    final org.imt.k3tdl.k3dsa.TestConfigurationAspectTestConfigurationAspectProperties _self_ = org.imt.k3tdl.k3dsa.TestConfigurationAspectTestConfigurationAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# String MUTPath()
    if (_self instanceof org.etsi.mts.tdl.TestConfiguration){
    	result = org.imt.k3tdl.k3dsa.TestConfigurationAspect._privk3_MUTPath(_self_, (org.etsi.mts.tdl.TestConfiguration)_self);
    };
    return (java.lang.String)result;
  }

  public static void MUTPath(final TestConfiguration _self, final String MUTPath) {
    final org.imt.k3tdl.k3dsa.TestConfigurationAspectTestConfigurationAspectProperties _self_ = org.imt.k3tdl.k3dsa.TestConfigurationAspectTestConfigurationAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void MUTPath(String)
    if (_self instanceof org.etsi.mts.tdl.TestConfiguration){
    	org.imt.k3tdl.k3dsa.TestConfigurationAspect._privk3_MUTPath(_self_, (org.etsi.mts.tdl.TestConfiguration)_self,MUTPath);
    };
  }

  public static String DSLPath(final TestConfiguration _self) {
    final org.imt.k3tdl.k3dsa.TestConfigurationAspectTestConfigurationAspectProperties _self_ = org.imt.k3tdl.k3dsa.TestConfigurationAspectTestConfigurationAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# String DSLPath()
    if (_self instanceof org.etsi.mts.tdl.TestConfiguration){
    	result = org.imt.k3tdl.k3dsa.TestConfigurationAspect._privk3_DSLPath(_self_, (org.etsi.mts.tdl.TestConfiguration)_self);
    };
    return (java.lang.String)result;
  }

  public static void DSLPath(final TestConfiguration _self, final String DSLPath) {
    final org.imt.k3tdl.k3dsa.TestConfigurationAspectTestConfigurationAspectProperties _self_ = org.imt.k3tdl.k3dsa.TestConfigurationAspectTestConfigurationAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void DSLPath(String)
    if (_self instanceof org.etsi.mts.tdl.TestConfiguration){
    	org.imt.k3tdl.k3dsa.TestConfigurationAspect._privk3_DSLPath(_self_, (org.etsi.mts.tdl.TestConfiguration)_self,DSLPath);
    };
  }

  protected static void _privk3_activateConfiguration(final TestConfigurationAspectTestConfigurationAspectProperties _self_, final TestConfiguration _self, final EngineFactory launcher) {
    final Function1<ComponentInstance, Boolean> _function = new Function1<ComponentInstance, Boolean>() {
      public Boolean apply(final ComponentInstance ci) {
        return Boolean.valueOf(ci.getRole().toString().equals("SUT"));
      }
    };
    final ComponentInstance sutComponent = ((ComponentInstance[])Conversions.unwrapArray(IterableExtensions.<ComponentInstance>filter(_self.getComponentInstance(), _function), ComponentInstance.class))[0];
    EList<Annotation> _annotation = sutComponent.getAnnotation();
    for (final Annotation a : _annotation) {
      boolean _equals = a.getKey().getName().equals("MUTPath");
      if (_equals) {
        String _value = a.getValue();
        int _length = a.getValue().length();
        int _minus = (_length - 1);
        TestConfigurationAspect.MUTPath(_self, _value.substring(1, _minus));
        launcher.setMUTPath(TestConfigurationAspect.MUTPath(_self));
      } else {
        boolean _equals_1 = a.getKey().getName().equals("DSLName");
        if (_equals_1) {
          String _value_1 = a.getValue();
          int _length_1 = a.getValue().length();
          int _minus_1 = (_length_1 - 1);
          final String DSLName = _value_1.substring(1, _minus_1);
          TestConfigurationAspect.DSLPath(_self, TestConfigurationAspect.getDSLPath(_self, DSLName));
          launcher.setDSLPath(TestConfigurationAspect.DSLPath(_self));
        }
      }
    }
    TestConfigurationAspect.setUpLauncher(_self, launcher);
  }

  protected static void _privk3_activateConfiguration(final TestConfigurationAspectTestConfigurationAspectProperties _self_, final TestConfiguration _self, final EngineFactory launcher, final String MUTPath) {
    TestConfigurationAspect.MUTPath(_self, MUTPath);
    launcher.setMUTPath(TestConfigurationAspect.MUTPath(_self));
    final Function1<ComponentInstance, Boolean> _function = new Function1<ComponentInstance, Boolean>() {
      public Boolean apply(final ComponentInstance ci) {
        String _string = ci.getRole().toString();
        return Boolean.valueOf(Objects.equal(_string, "SUT"));
      }
    };
    EList<Annotation> _annotation = (((ComponentInstance[])Conversions.unwrapArray(IterableExtensions.<ComponentInstance>filter(_self.getComponentInstance(), _function), ComponentInstance.class))[0]).getAnnotation();
    for (final Annotation a : _annotation) {
      String _name = a.getKey().getName();
      boolean _equals = Objects.equal(_name, "DSLName");
      if (_equals) {
        String _value = a.getValue();
        int _length = a.getValue().length();
        int _minus = (_length - 1);
        final String DSLName = _value.substring(1, _minus);
        TestConfigurationAspect.DSLPath(_self, TestConfigurationAspect.getDSLPath(_self, DSLName));
        launcher.setDSLPath(TestConfigurationAspect.DSLPath(_self));
      }
    }
    TestConfigurationAspect.setUpLauncher(_self, launcher);
  }

  protected static String _privk3_getDSLPath(final TestConfigurationAspectTestConfigurationAspectProperties _self_, final TestConfiguration _self, final String DSLName) {
    final Predicate<IConfigurationElement> _function = new Predicate<IConfigurationElement>() {
      public boolean test(final IConfigurationElement l) {
        return (l.getAttribute("xdsmlFilePath").endsWith(".dsl") && l.getAttribute("name").equals(DSLName));
      }
    };
    final IConfigurationElement language = Arrays.<IConfigurationElement>asList(
      Platform.getExtensionRegistry().getConfigurationElementsFor("org.eclipse.gemoc.gemoc_language_workbench.xdsml")).stream().filter(_function).findFirst().orElse(null);
    if ((language != null)) {
      String xdsmlFilePath = language.getAttribute("xdsmlFilePath");
      boolean _startsWith = xdsmlFilePath.startsWith("platform:/plugin");
      boolean _not = (!_startsWith);
      if (_not) {
        xdsmlFilePath = ("platform:/plugin" + xdsmlFilePath);
      }
      return xdsmlFilePath;
    }
    return null;
  }

  protected static void _privk3_setUpLauncher(final TestConfigurationAspectTestConfigurationAspectProperties _self_, final TestConfiguration _self, final EngineFactory launcher) {
    try {
      final Function1<Connection, Boolean> _function = new Function1<Connection, Boolean>() {
        public Boolean apply(final Connection c) {
          final Function1<GateReference, Boolean> _function = new Function1<GateReference, Boolean>() {
            public Boolean apply(final GateReference g) {
              return Boolean.valueOf(g.getGate().getName().equals(TestConfigurationAspect.GENERIC_GATE));
            }
          };
          return Boolean.valueOf(IterableExtensions.<GateReference>exists(c.getEndPoint(), _function));
        }
      };
      boolean _exists = IterableExtensions.<Connection>exists(_self.getConnection(), _function);
      if (_exists) {
        launcher.setUp(EngineFactory.GENERIC);
      }
      final Function1<Connection, Boolean> _function_1 = new Function1<Connection, Boolean>() {
        public Boolean apply(final Connection c) {
          final Function1<GateReference, Boolean> _function = new Function1<GateReference, Boolean>() {
            public Boolean apply(final GateReference g) {
              return Boolean.valueOf(g.getGate().getName().equals(TestConfigurationAspect.REACTIVE_GATE));
            }
          };
          return Boolean.valueOf(IterableExtensions.<GateReference>exists(c.getEndPoint(), _function));
        }
      };
      boolean _exists_1 = IterableExtensions.<Connection>exists(_self.getConnection(), _function_1);
      if (_exists_1) {
        launcher.setUp(EngineFactory.DSL_SPECIFIC);
      }
      final Function1<Connection, Boolean> _function_2 = new Function1<Connection, Boolean>() {
        public Boolean apply(final Connection c) {
          final Function1<GateReference, Boolean> _function = new Function1<GateReference, Boolean>() {
            public Boolean apply(final GateReference g) {
              return Boolean.valueOf(g.getGate().getName().equals(TestConfigurationAspect.OCL_GATE));
            }
          };
          return Boolean.valueOf(IterableExtensions.<GateReference>exists(c.getEndPoint(), _function));
        }
      };
      boolean _exists_2 = IterableExtensions.<Connection>exists(_self.getConnection(), _function_2);
      if (_exists_2) {
        launcher.setUp(EngineFactory.OCL);
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  protected static String _privk3_stopModelExecutionEngine(final TestConfigurationAspectTestConfigurationAspectProperties _self_, final TestConfiguration _self, final EngineFactory launcher) {
    final Function1<Connection, Boolean> _function = new Function1<Connection, Boolean>() {
      public Boolean apply(final Connection c) {
        final Function1<GateReference, Boolean> _function = new Function1<GateReference, Boolean>() {
          public Boolean apply(final GateReference g) {
            return Boolean.valueOf(g.getGate().getName().equals(TestConfigurationAspect.REACTIVE_GATE));
          }
        };
        return Boolean.valueOf(IterableExtensions.<GateReference>exists(c.getEndPoint(), _function));
      }
    };
    boolean _exists = IterableExtensions.<Connection>exists(_self.getConnection(), _function);
    if (_exists) {
      return launcher.executeDSLSpecificCommand("STOP", null, null);
    }
    return null;
  }

  protected static String _privk3_MUTPath(final TestConfigurationAspectTestConfigurationAspectProperties _self_, final TestConfiguration _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getMUTPath") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (java.lang.String) ret;
    				} else {
    					return null;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.MUTPath;
  }

  protected static void _privk3_MUTPath(final TestConfigurationAspectTestConfigurationAspectProperties _self_, final TestConfiguration _self, final String MUTPath) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setMUTPath")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, MUTPath);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.MUTPath = MUTPath;
    }
  }

  protected static String _privk3_DSLPath(final TestConfigurationAspectTestConfigurationAspectProperties _self_, final TestConfiguration _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getDSLPath") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (java.lang.String) ret;
    				} else {
    					return null;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.DSLPath;
  }

  protected static void _privk3_DSLPath(final TestConfigurationAspectTestConfigurationAspectProperties _self_, final TestConfiguration _self, final String DSLPath) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setDSLPath")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, DSLPath);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.DSLPath = DSLPath;
    }
  }
}
