package org.imt.k3tdl.k3dsa;

import com.google.common.base.Objects;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.ExclusiveRange;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.etsi.mts.tdl.DataInstanceUse;
import org.etsi.mts.tdl.DataUse;
import org.etsi.mts.tdl.GateInstance;
import org.etsi.mts.tdl.LiteralValueUse;
import org.imt.tdl.configuration.EngineFactory;
import org.imt.tdl.testResult.TDLTestResultUtil;

@Aspect(className = GateInstance.class)
@SuppressWarnings("all")
public class GateInstanceAspect {
  private static final String RUN_MODEL = "runModel";

  private static final String RUN_MODEL_ASYNC = "runModelAsynchronous";

  private static final String STOP_EXECUTION = "stopModelExecution";

  private static final String RESET_MODEL = "resetModel";

  private static final String GET_MODEL = "getModelState";

  private static final String OCL_TYPE = "OCL";

  private static final String OCL_GATE = "oclGate";

  private static final String ACCEPTED_EVENT = "ACCEPTED";

  private static final String EXPOSED_EVENT = "EXPOSED";

  public static void setLauncher(final GateInstance _self, final EngineFactory launcher) {
    final org.imt.k3tdl.k3dsa.GateInstanceAspectGateInstanceAspectProperties _self_ = org.imt.k3tdl.k3dsa.GateInstanceAspectGateInstanceAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void setLauncher(EngineFactory)
    if (_self instanceof org.etsi.mts.tdl.GateInstance){
    	org.imt.k3tdl.k3dsa.GateInstanceAspect._privk3_setLauncher(_self_, (org.etsi.mts.tdl.GateInstance)_self,launcher);
    };
  }

  public static String assertArgument(final GateInstance _self, final DataUse argument) {
    final org.imt.k3tdl.k3dsa.GateInstanceAspectGateInstanceAspectProperties _self_ = org.imt.k3tdl.k3dsa.GateInstanceAspectGateInstanceAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# String assertArgument(DataUse)
    if (_self instanceof org.etsi.mts.tdl.GateInstance){
    	result = org.imt.k3tdl.k3dsa.GateInstanceAspect._privk3_assertArgument(_self_, (org.etsi.mts.tdl.GateInstance)_self,argument);
    };
    return (java.lang.String)result;
  }

  public static String sendArgument2sut(final GateInstance _self, final DataUse argument) {
    final org.imt.k3tdl.k3dsa.GateInstanceAspectGateInstanceAspectProperties _self_ = org.imt.k3tdl.k3dsa.GateInstanceAspectGateInstanceAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# String sendArgument2sut(DataUse)
    if (_self instanceof org.etsi.mts.tdl.GateInstance){
    	result = org.imt.k3tdl.k3dsa.GateInstanceAspect._privk3_sendArgument2sut(_self_, (org.etsi.mts.tdl.GateInstance)_self,argument);
    };
    return (java.lang.String)result;
  }

  public static String setModelState(final GateInstance _self, final DataInstanceUse arg) {
    final org.imt.k3tdl.k3dsa.GateInstanceAspectGateInstanceAspectProperties _self_ = org.imt.k3tdl.k3dsa.GateInstanceAspectGateInstanceAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# String setModelState(DataInstanceUse)
    if (_self instanceof org.etsi.mts.tdl.GateInstance){
    	result = org.imt.k3tdl.k3dsa.GateInstanceAspect._privk3_setModelState(_self_, (org.etsi.mts.tdl.GateInstance)_self,arg);
    };
    return (java.lang.String)result;
  }

  public static Map<String, Object> getEventParameters(final GateInstance _self, final DataInstanceUse event, final String eventType) {
    final org.imt.k3tdl.k3dsa.GateInstanceAspectGateInstanceAspectProperties _self_ = org.imt.k3tdl.k3dsa.GateInstanceAspectGateInstanceAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Map<String, Object> getEventParameters(DataInstanceUse,String)
    if (_self instanceof org.etsi.mts.tdl.GateInstance){
    	result = org.imt.k3tdl.k3dsa.GateInstanceAspect._privk3_getEventParameters(_self_, (org.etsi.mts.tdl.GateInstance)_self,event,eventType);
    };
    return (java.util.Map<java.lang.String, java.lang.Object>)result;
  }

  public static String MUTPath(final GateInstance _self) {
    final org.imt.k3tdl.k3dsa.GateInstanceAspectGateInstanceAspectProperties _self_ = org.imt.k3tdl.k3dsa.GateInstanceAspectGateInstanceAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# String MUTPath()
    if (_self instanceof org.etsi.mts.tdl.GateInstance){
    	result = org.imt.k3tdl.k3dsa.GateInstanceAspect._privk3_MUTPath(_self_, (org.etsi.mts.tdl.GateInstance)_self);
    };
    return (java.lang.String)result;
  }

  public static void MUTPath(final GateInstance _self, final String MUTPath) {
    final org.imt.k3tdl.k3dsa.GateInstanceAspectGateInstanceAspectProperties _self_ = org.imt.k3tdl.k3dsa.GateInstanceAspectGateInstanceAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void MUTPath(String)
    if (_self instanceof org.etsi.mts.tdl.GateInstance){
    	org.imt.k3tdl.k3dsa.GateInstanceAspect._privk3_MUTPath(_self_, (org.etsi.mts.tdl.GateInstance)_self,MUTPath);
    };
  }

  public static String DSLPath(final GateInstance _self) {
    final org.imt.k3tdl.k3dsa.GateInstanceAspectGateInstanceAspectProperties _self_ = org.imt.k3tdl.k3dsa.GateInstanceAspectGateInstanceAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# String DSLPath()
    if (_self instanceof org.etsi.mts.tdl.GateInstance){
    	result = org.imt.k3tdl.k3dsa.GateInstanceAspect._privk3_DSLPath(_self_, (org.etsi.mts.tdl.GateInstance)_self);
    };
    return (java.lang.String)result;
  }

  public static void DSLPath(final GateInstance _self, final String DSLPath) {
    final org.imt.k3tdl.k3dsa.GateInstanceAspectGateInstanceAspectProperties _self_ = org.imt.k3tdl.k3dsa.GateInstanceAspectGateInstanceAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void DSLPath(String)
    if (_self instanceof org.etsi.mts.tdl.GateInstance){
    	org.imt.k3tdl.k3dsa.GateInstanceAspect._privk3_DSLPath(_self_, (org.etsi.mts.tdl.GateInstance)_self,DSLPath);
    };
  }

  private static Object receivedOutput(final GateInstance _self) {
    final org.imt.k3tdl.k3dsa.GateInstanceAspectGateInstanceAspectProperties _self_ = org.imt.k3tdl.k3dsa.GateInstanceAspectGateInstanceAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Object receivedOutput()
    if (_self instanceof org.etsi.mts.tdl.GateInstance){
    	result = org.imt.k3tdl.k3dsa.GateInstanceAspect._privk3_receivedOutput(_self_, (org.etsi.mts.tdl.GateInstance)_self);
    };
    return (java.lang.Object)result;
  }

  private static void receivedOutput(final GateInstance _self, final Object receivedOutput) {
    final org.imt.k3tdl.k3dsa.GateInstanceAspectGateInstanceAspectProperties _self_ = org.imt.k3tdl.k3dsa.GateInstanceAspectGateInstanceAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void receivedOutput(Object)
    if (_self instanceof org.etsi.mts.tdl.GateInstance){
    	org.imt.k3tdl.k3dsa.GateInstanceAspect._privk3_receivedOutput(_self_, (org.etsi.mts.tdl.GateInstance)_self,receivedOutput);
    };
  }

  private static Object expectedOutput(final GateInstance _self) {
    final org.imt.k3tdl.k3dsa.GateInstanceAspectGateInstanceAspectProperties _self_ = org.imt.k3tdl.k3dsa.GateInstanceAspectGateInstanceAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Object expectedOutput()
    if (_self instanceof org.etsi.mts.tdl.GateInstance){
    	result = org.imt.k3tdl.k3dsa.GateInstanceAspect._privk3_expectedOutput(_self_, (org.etsi.mts.tdl.GateInstance)_self);
    };
    return (java.lang.Object)result;
  }

  private static void expectedOutput(final GateInstance _self, final Object expectedOutput) {
    final org.imt.k3tdl.k3dsa.GateInstanceAspectGateInstanceAspectProperties _self_ = org.imt.k3tdl.k3dsa.GateInstanceAspectGateInstanceAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void expectedOutput(Object)
    if (_self instanceof org.etsi.mts.tdl.GateInstance){
    	org.imt.k3tdl.k3dsa.GateInstanceAspect._privk3_expectedOutput(_self_, (org.etsi.mts.tdl.GateInstance)_self,expectedOutput);
    };
  }

  private static EngineFactory gateLauncher(final GateInstance _self) {
    final org.imt.k3tdl.k3dsa.GateInstanceAspectGateInstanceAspectProperties _self_ = org.imt.k3tdl.k3dsa.GateInstanceAspectGateInstanceAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# EngineFactory gateLauncher()
    if (_self instanceof org.etsi.mts.tdl.GateInstance){
    	result = org.imt.k3tdl.k3dsa.GateInstanceAspect._privk3_gateLauncher(_self_, (org.etsi.mts.tdl.GateInstance)_self);
    };
    return (org.imt.tdl.configuration.EngineFactory)result;
  }

  private static void gateLauncher(final GateInstance _self, final EngineFactory gateLauncher) {
    final org.imt.k3tdl.k3dsa.GateInstanceAspectGateInstanceAspectProperties _self_ = org.imt.k3tdl.k3dsa.GateInstanceAspectGateInstanceAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void gateLauncher(EngineFactory)
    if (_self instanceof org.etsi.mts.tdl.GateInstance){
    	org.imt.k3tdl.k3dsa.GateInstanceAspect._privk3_gateLauncher(_self_, (org.etsi.mts.tdl.GateInstance)_self,gateLauncher);
    };
  }

  protected static void _privk3_setLauncher(final GateInstanceAspectGateInstanceAspectProperties _self_, final GateInstance _self, final EngineFactory launcher) {
    GateInstanceAspect.gateLauncher(_self, launcher);
  }

  protected static String _privk3_assertArgument(final GateInstanceAspectGateInstanceAspectProperties _self_, final GateInstance _self, final DataUse argument) {
    if ((argument instanceof LiteralValueUse)) {
      String expected = ((LiteralValueUse) argument).getValue();
      int _length = expected.length();
      int _minus = (_length - 1);
      expected = expected.substring(1, _minus);
      GateInstanceAspect.expectedOutput(_self, expected);
      boolean _equals = _self.getName().equals(GateInstanceAspect.OCL_GATE);
      if (_equals) {
        GateInstanceAspect.receivedOutput(_self, GateInstanceAspect.gateLauncher(_self).getOCLResultAsString());
      }
      Object _receivedOutput = GateInstanceAspect.receivedOutput(_self);
      boolean _tripleNotEquals = (_receivedOutput != null);
      if (_tripleNotEquals) {
        int _size = GateInstanceAspect.gateLauncher(_self).getOCLResultAsString().size();
        boolean _equals_1 = (_size == 1);
        if (_equals_1) {
          final String result = GateInstanceAspect.gateLauncher(_self).getOCLResultAsString().get(0);
          int _length_1 = result.length();
          int _minus_1 = (_length_1 - 1);
          GateInstanceAspect.receivedOutput(_self, result.subSequence(1, _minus_1));
        }
        boolean _equals_2 = GateInstanceAspect.receivedOutput(_self).toString().equals(GateInstanceAspect.expectedOutput(_self).toString());
        if (_equals_2) {
          return (TDLTestResultUtil.PASS + ": The expected data is equal to the current data");
        } else {
          String _string = GateInstanceAspect.expectedOutput(_self).toString();
          String _plus = ((TDLTestResultUtil.FAIL + ": The expected data is: ") + _string);
          String _plus_1 = (_plus + 
            ", but the current data is: ");
          String _string_1 = GateInstanceAspect.receivedOutput(_self).toString();
          return (_plus_1 + _string_1);
        }
      } else {
        Object _receivedOutput_1 = GateInstanceAspect.receivedOutput(_self);
        boolean _tripleEquals = (_receivedOutput_1 == null);
        if (_tripleEquals) {
          String _string_2 = GateInstanceAspect.expectedOutput(_self).toString();
          String _plus_2 = ((TDLTestResultUtil.FAIL + ": The expected data is: ") + _string_2);
          return (_plus_2 + 
            ", but the current data is: null");
        } else {
          String _string_3 = GateInstanceAspect.expectedOutput(_self).toString();
          String _plus_3 = ((TDLTestResultUtil.FAIL + ": The expected data is: ") + _string_3);
          String _plus_4 = (_plus_3 + 
            ", but the current data is: ");
          String _string_4 = GateInstanceAspect.receivedOutput(_self).toString();
          return (_plus_4 + _string_4);
        }
      }
    } else {
      if ((argument instanceof DataInstanceUse)) {
        final DataInstanceUse arg = ((DataInstanceUse) argument);
        Resource MUTResource = null;
        Object _receivedOutput_2 = GateInstanceAspect.receivedOutput(_self);
        if ((_receivedOutput_2 instanceof Resource)) {
          Object _receivedOutput_3 = GateInstanceAspect.receivedOutput(_self);
          MUTResource = ((Resource) _receivedOutput_3);
        }
        boolean _equals_3 = _self.getName().equals(GateInstanceAspect.OCL_GATE);
        if (_equals_3) {
          MUTResource = GateInstanceAspect.gateLauncher(_self).getMUTResource();
        } else {
          if ((((arg.getItem() == null) || (arg.getItem().size() <= 0)) && DataTypeAspect.isExposedEvent(arg.getDataInstance().getDataType(), GateInstanceAspect.DSLPath(_self)))) {
            final Map<String, Object> eventParameters = GateInstanceAspect.getEventParameters(_self, arg, GateInstanceAspect.EXPOSED_EVENT);
            if ((eventParameters == null)) {
              return ((TDLTestResultUtil.INCONCLUSIVE + ": The event parameters cannot be neither found in the model under test nor created. \n") + 
                "There must be a syntactical problem in the test data");
            }
            return GateInstanceAspect.gateLauncher(_self).executeDSLSpecificCommand(GateInstanceAspect.EXPOSED_EVENT, DataInstanceAspect.getValidName(arg.getDataInstance()), eventParameters);
          }
        }
        String status = null;
        ArrayList<EObject> matchedMUTElements = new ArrayList<EObject>();
        if (((arg.getItem() != null) && (arg.getItem().size() > 0))) {
          int _size_1 = arg.getItem().size();
          ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _size_1, true);
          for (final Integer i : _doubleDotLessThan) {
            {
              DataUse _get = arg.getItem().get((i).intValue());
              final DataInstanceUse data = ((DataInstanceUse) _get);
              final EObject matchedObject = DataInstanceUseAspect.getMatchedMUTElement(data, ((Resource) MUTResource), true, GateInstanceAspect.DSLPath(_self));
              if ((matchedObject == null)) {
                return DataInstanceAspect.info(data.getDataInstance());
              } else {
                matchedMUTElements.add(matchedObject);
                status = DataInstanceAspect.info(data.getDataInstance());
              }
            }
          }
        } else {
          final DataInstanceUse data = ((DataInstanceUse) arg);
          final EObject matchedObject = DataInstanceUseAspect.getMatchedMUTElement(data, ((Resource) MUTResource), true, GateInstanceAspect.DSLPath(_self));
          if ((matchedObject == null)) {
            return DataInstanceAspect.info(data.getDataInstance());
          } else {
            matchedMUTElements.add(matchedObject);
            status = DataInstanceAspect.info(data.getDataInstance());
          }
        }
        boolean _equals_4 = _self.getName().equals(GateInstanceAspect.OCL_GATE);
        if (_equals_4) {
          final Object[] receivedObjects = ((Object[])Conversions.unwrapArray(GateInstanceAspect.gateLauncher(_self).getOCLResultAsObject(), Object.class));
          boolean _elementsEqual = IterableExtensions.elementsEqual(((Iterable<?>)Conversions.doWrapArray(receivedObjects)), matchedMUTElements);
          if (_elementsEqual) {
            return (TDLTestResultUtil.PASS + ": The expected data is equal to the current data");
          } else {
            String expectedData = TDLTestResultUtil.getInstance().getDataAsString(matchedMUTElements);
            ArrayList<String> _oCLResultAsString = GateInstanceAspect.gateLauncher(_self).getOCLResultAsString();
            return ((((TDLTestResultUtil.FAIL + ": The expected data is: ") + expectedData) + 
              ", but the current data is: ") + _oCLResultAsString);
          }
        } else {
          return status;
        }
      }
    }
    return null;
  }

  protected static String _privk3_sendArgument2sut(final GateInstanceAspectGateInstanceAspectProperties _self_, final GateInstance _self, final DataUse argument) {
    try {
      if ((argument instanceof DataInstanceUse)) {
        DataInstanceUse arg = ((DataInstanceUse) argument);
        if (((arg.getItem() != null) && (arg.getItem().size() > 0))) {
          return GateInstanceAspect.setModelState(_self, arg);
        } else {
          boolean _isConcreteEcoreType = DataTypeAspect.isConcreteEcoreType(arg.getDataInstance().getDataType(), GateInstanceAspect.DSLPath(_self));
          if (_isConcreteEcoreType) {
            return GateInstanceAspect.setModelState(_self, arg);
          } else {
            String _name = arg.getDataInstance().getName();
            boolean _equals = Objects.equal(_name, GateInstanceAspect.RUN_MODEL);
            if (_equals) {
              return GateInstanceAspect.gateLauncher(_self).executeModel(Boolean.valueOf(true));
            } else {
              String _name_1 = arg.getDataInstance().getName();
              boolean _equals_1 = Objects.equal(_name_1, GateInstanceAspect.RUN_MODEL_ASYNC);
              if (_equals_1) {
                return GateInstanceAspect.gateLauncher(_self).executeModel(Boolean.valueOf(false));
              } else {
                String _name_2 = arg.getDataInstance().getName();
                boolean _equals_2 = Objects.equal(_name_2, GateInstanceAspect.STOP_EXECUTION);
                if (_equals_2) {
                  return GateInstanceAspect.gateLauncher(_self).stopAsyncExecution();
                } else {
                  String _name_3 = arg.getDataInstance().getName();
                  boolean _equals_3 = Objects.equal(_name_3, GateInstanceAspect.RESET_MODEL);
                  if (_equals_3) {
                    EngineFactory _gateLauncher = GateInstanceAspect.gateLauncher(_self);
                    _gateLauncher.setMUTResource(
                      new ResourceSetImpl().getResource(URI.createURI(GateInstanceAspect.MUTPath(_self)), true));
                    return (TDLTestResultUtil.PASS + ": The MUT is reset to its initial state");
                  } else {
                    String _name_4 = arg.getDataInstance().getName();
                    boolean _equals_4 = Objects.equal(_name_4, GateInstanceAspect.GET_MODEL);
                    if (_equals_4) {
                      GateInstanceAspect.receivedOutput(_self, GateInstanceAspect.gateLauncher(_self).getMUTResource());
                      return (TDLTestResultUtil.PASS + ": The current state of the MUT is retrieved");
                    } else {
                      String _name_5 = arg.getDataInstance().getDataType().getName();
                      boolean _equals_5 = Objects.equal(_name_5, GateInstanceAspect.OCL_TYPE);
                      if (_equals_5) {
                        DataUse _dataUse = ((DataInstanceUse)argument).getArgument().get(0).getDataUse();
                        LiteralValueUse query = ((LiteralValueUse) _dataUse);
                        return GateInstanceAspect.gateLauncher(_self).executeOCLCommand(query.getValue());
                      } else {
                        boolean _isAcceptedEvent = DataTypeAspect.isAcceptedEvent(arg.getDataInstance().getDataType(), GateInstanceAspect.DSLPath(_self));
                        if (_isAcceptedEvent) {
                          final Map<String, Object> eventParameters = GateInstanceAspect.getEventParameters(_self, arg, GateInstanceAspect.ACCEPTED_EVENT);
                          if ((eventParameters == null)) {
                            return ((TDLTestResultUtil.FAIL + ": The event parameters cannot be neither found in the model under test nor created. \n") + 
                              "There must be a syntactical problem in the test data");
                          }
                          return GateInstanceAspect.gateLauncher(_self).executeDSLSpecificCommand(GateInstanceAspect.ACCEPTED_EVENT, DataInstanceAspect.getValidName(arg.getDataInstance()), eventParameters);
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
        return (TDLTestResultUtil.FAIL + ": Cannot send data to the MUT");
      }
      return (TDLTestResultUtil.FAIL + ": Cannot send data to the MUT");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  protected static String _privk3_setModelState(final GateInstanceAspectGateInstanceAspectProperties _self_, final GateInstance _self, final DataInstanceUse arg) {
    Resource MUTResource = GateInstanceAspect.gateLauncher(_self).getMUTResource();
    String status = null;
    if (((arg.getItem() != null) && (arg.getItem().size() > 0))) {
      int _size = arg.getItem().size();
      ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _size, true);
      for (final Integer i : _doubleDotLessThan) {
        {
          DataUse _get = arg.getItem().get((i).intValue());
          status = DataInstanceUseAspect.setMatchedMUTElement(((DataInstanceUse) _get), MUTResource, GateInstanceAspect.DSLPath(_self));
          boolean _contains = status.contains(TDLTestResultUtil.FAIL);
          if (_contains) {
            return status;
          }
        }
      }
    } else {
      status = DataInstanceUseAspect.setMatchedMUTElement(arg, MUTResource, GateInstanceAspect.DSLPath(_self));
    }
    return status;
  }

  protected static Map<String, Object> _privk3_getEventParameters(final GateInstanceAspectGateInstanceAspectProperties _self_, final GateInstance _self, final DataInstanceUse event, final String eventType) {
    Map<String, Object> parameters = new HashMap<String, Object>();
    int _size = event.getArgument().size();
    ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _size, true);
    for (final Integer i : _doubleDotLessThan) {
      {
        final String argName = event.getArgument().get((i).intValue()).getParameter().getName();
        Object argValue = null;
        DataUse _dataUse = event.getArgument().get((i).intValue()).getDataUse();
        if ((_dataUse instanceof DataInstanceUse)) {
          DataUse _dataUse_1 = event.getArgument().get((i).intValue()).getDataUse();
          final DataInstanceUse argTdlValue = ((DataInstanceUse) _dataUse_1);
          boolean _isAcceptedEvent = DataTypeAspect.isAcceptedEvent(event.getDataInstance().getDataType(), GateInstanceAspect.DSLPath(_self));
          if (_isAcceptedEvent) {
            argValue = DataInstanceUseAspect.getMatchedMUTElement(argTdlValue, GateInstanceAspect.gateLauncher(_self).getMUTResource(), true, GateInstanceAspect.DSLPath(_self));
            if ((argValue == null)) {
              argValue = DataInstanceUseAspect.createEObject(argTdlValue, GateInstanceAspect.gateLauncher(_self).getMUTResource(), true, GateInstanceAspect.DSLPath(_self));
            }
          } else {
            final Resource resource = new ResourceSetImpl().getResource(URI.createURI(GateInstanceAspect.MUTPath(_self)), true);
            argValue = DataInstanceUseAspect.createEObject(argTdlValue, resource, true, GateInstanceAspect.DSLPath(_self));
          }
          if ((argValue == null)) {
            return null;
          }
        } else {
          DataUse _dataUse_2 = event.getArgument().get((i).intValue()).getDataUse();
          if ((_dataUse_2 instanceof LiteralValueUse)) {
            final String tdlParameterTypeName = event.getArgument().get((i).intValue()).getParameter().getDataType().getName();
            DataUse _dataUse_3 = event.getArgument().get((i).intValue()).getDataUse();
            final LiteralValueUse argTdlValue_1 = ((LiteralValueUse) _dataUse_3);
            argValue = LiteralValueUseAspect.getPrimitiveValue(argTdlValue_1, tdlParameterTypeName);
          }
        }
        parameters.put(argName, argValue);
      }
    }
    return parameters;
  }

  protected static String _privk3_MUTPath(final GateInstanceAspectGateInstanceAspectProperties _self_, final GateInstance _self) {
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

  protected static void _privk3_MUTPath(final GateInstanceAspectGateInstanceAspectProperties _self_, final GateInstance _self, final String MUTPath) {
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

  protected static String _privk3_DSLPath(final GateInstanceAspectGateInstanceAspectProperties _self_, final GateInstance _self) {
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

  protected static void _privk3_DSLPath(final GateInstanceAspectGateInstanceAspectProperties _self_, final GateInstance _self, final String DSLPath) {
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

  protected static Object _privk3_receivedOutput(final GateInstanceAspectGateInstanceAspectProperties _self_, final GateInstance _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getReceivedOutput") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (java.lang.Object) ret;
    				} else {
    					return null;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.receivedOutput;
  }

  protected static void _privk3_receivedOutput(final GateInstanceAspectGateInstanceAspectProperties _self_, final GateInstance _self, final Object receivedOutput) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setReceivedOutput")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, receivedOutput);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.receivedOutput = receivedOutput;
    }
  }

  protected static Object _privk3_expectedOutput(final GateInstanceAspectGateInstanceAspectProperties _self_, final GateInstance _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getExpectedOutput") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (java.lang.Object) ret;
    				} else {
    					return null;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.expectedOutput;
  }

  protected static void _privk3_expectedOutput(final GateInstanceAspectGateInstanceAspectProperties _self_, final GateInstance _self, final Object expectedOutput) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setExpectedOutput")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, expectedOutput);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.expectedOutput = expectedOutput;
    }
  }

  protected static EngineFactory _privk3_gateLauncher(final GateInstanceAspectGateInstanceAspectProperties _self_, final GateInstance _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getGateLauncher") &&
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
    return _self_.gateLauncher;
  }

  protected static void _privk3_gateLauncher(final GateInstanceAspectGateInstanceAspectProperties _self_, final GateInstance _self, final EngineFactory gateLauncher) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setGateLauncher")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, gateLauncher);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.gateLauncher = gateLauncher;
    }
  }
}
