package org.imt.k3tdl.k3dsa;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.ArrayList;
import java.util.Collection;
import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.ExclusiveRange;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.etsi.mts.tdl.DataInstance;
import org.etsi.mts.tdl.DataInstanceUse;
import org.etsi.mts.tdl.DataUse;
import org.etsi.mts.tdl.Member;
import org.etsi.mts.tdl.ParameterBinding;
import org.etsi.mts.tdl.StructuredDataInstance;
import org.imt.tdl.testResult.TDLTestResultUtil;

@Aspect(className = DataInstanceUse.class)
@SuppressWarnings("all")
public class DataInstanceUseAspect extends StaticDataUseAspect {
  public static EObject getMatchedMUTElement(final DataInstanceUse _self, final Resource MUTResource, final boolean isAssertion, final String DSLPath) {
    final org.imt.k3tdl.k3dsa.DataInstanceUseAspectDataInstanceUseAspectProperties _self_ = org.imt.k3tdl.k3dsa.DataInstanceUseAspectDataInstanceUseAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# EObject getMatchedMUTElement(Resource,boolean,String)
    if (_self instanceof org.etsi.mts.tdl.DataInstanceUse){
    	result = org.imt.k3tdl.k3dsa.DataInstanceUseAspect._privk3_getMatchedMUTElement(_self_, (org.etsi.mts.tdl.DataInstanceUse)_self,MUTResource,isAssertion,DSLPath);
    };
    return (org.eclipse.emf.ecore.EObject)result;
  }

  public static EObject getMatchedMUTElement(final DataInstanceUse _self, final ArrayList<EObject> rootElement, final Resource MUTResource, final boolean isAssertion, final String DSLPath) {
    final org.imt.k3tdl.k3dsa.DataInstanceUseAspectDataInstanceUseAspectProperties _self_ = org.imt.k3tdl.k3dsa.DataInstanceUseAspectDataInstanceUseAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# EObject getMatchedMUTElement(ArrayList<EObject>,Resource,boolean,String)
    if (_self instanceof org.etsi.mts.tdl.DataInstanceUse){
    	result = org.imt.k3tdl.k3dsa.DataInstanceUseAspect._privk3_getMatchedMUTElement(_self_, (org.etsi.mts.tdl.DataInstanceUse)_self,rootElement,MUTResource,isAssertion,DSLPath);
    };
    return (org.eclipse.emf.ecore.EObject)result;
  }

  public static String isMatchedParametrizedElement(final DataInstanceUse _self, final EObject rootElement, final Resource MUTResource, final boolean isAssertion, final String DSLPath) {
    final org.imt.k3tdl.k3dsa.DataInstanceUseAspectDataInstanceUseAspectProperties _self_ = org.imt.k3tdl.k3dsa.DataInstanceUseAspectDataInstanceUseAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# String isMatchedParametrizedElement(EObject,Resource,boolean,String)
    if (_self instanceof org.etsi.mts.tdl.DataInstanceUse){
    	result = org.imt.k3tdl.k3dsa.DataInstanceUseAspect._privk3_isMatchedParametrizedElement(_self_, (org.etsi.mts.tdl.DataInstanceUse)_self,rootElement,MUTResource,isAssertion,DSLPath);
    };
    return (java.lang.String)result;
  }

  public static String setMatchedMUTElement(final DataInstanceUse _self, final Resource MUTResource, final String DSLPath) {
    final org.imt.k3tdl.k3dsa.DataInstanceUseAspectDataInstanceUseAspectProperties _self_ = org.imt.k3tdl.k3dsa.DataInstanceUseAspectDataInstanceUseAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# String setMatchedMUTElement(Resource,String)
    if (_self instanceof org.etsi.mts.tdl.DataInstanceUse){
    	result = org.imt.k3tdl.k3dsa.DataInstanceUseAspect._privk3_setMatchedMUTElement(_self_, (org.etsi.mts.tdl.DataInstanceUse)_self,MUTResource,DSLPath);
    };
    return (java.lang.String)result;
  }

  public static String setMatchedMUTElement(final DataInstanceUse _self, final EObject matchedObject, final Resource MUTResource, final String DSLPath) {
    final org.imt.k3tdl.k3dsa.DataInstanceUseAspectDataInstanceUseAspectProperties _self_ = org.imt.k3tdl.k3dsa.DataInstanceUseAspectDataInstanceUseAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# String setMatchedMUTElement(EObject,Resource,String)
    if (_self instanceof org.etsi.mts.tdl.DataInstanceUse){
    	result = org.imt.k3tdl.k3dsa.DataInstanceUseAspect._privk3_setMatchedMUTElement(_self_, (org.etsi.mts.tdl.DataInstanceUse)_self,matchedObject,MUTResource,DSLPath);
    };
    return (java.lang.String)result;
  }

  public static EObject createEObject(final DataInstanceUse _self, final Resource MUTResource, final boolean isAssertion, final String DSLPath) {
    final org.imt.k3tdl.k3dsa.DataInstanceUseAspectDataInstanceUseAspectProperties _self_ = org.imt.k3tdl.k3dsa.DataInstanceUseAspectDataInstanceUseAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# EObject createEObject(Resource,boolean,String)
    if (_self instanceof org.etsi.mts.tdl.DataInstanceUse){
    	result = org.imt.k3tdl.k3dsa.DataInstanceUseAspect._privk3_createEObject(_self_, (org.etsi.mts.tdl.DataInstanceUse)_self,MUTResource,isAssertion,DSLPath);
    };
    return (org.eclipse.emf.ecore.EObject)result;
  }

  @OverrideAspectMethod
  public static String assertEquals(final DataInstanceUse _self, final Resource MUTResource, final Object featureValue, final Boolean isAssertion, final String DSLPath) {
    final org.imt.k3tdl.k3dsa.DataInstanceUseAspectDataInstanceUseAspectProperties _self_ = org.imt.k3tdl.k3dsa.DataInstanceUseAspectDataInstanceUseAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# String assertEquals(Resource,Object,Boolean,String)
    if (_self instanceof org.etsi.mts.tdl.DataInstanceUse){
    	result = org.imt.k3tdl.k3dsa.DataInstanceUseAspect._privk3_assertEquals(_self_, (org.etsi.mts.tdl.DataInstanceUse)_self,MUTResource,featureValue,isAssertion,DSLPath);
    };
    return (java.lang.String)result;
  }

  @OverrideAspectMethod
  public static String updateData(final DataInstanceUse _self, final Resource MUTResource, final EObject object, final EStructuralFeature matchedFeature, final String DSLPath) {
    final org.imt.k3tdl.k3dsa.DataInstanceUseAspectDataInstanceUseAspectProperties _self_ = org.imt.k3tdl.k3dsa.DataInstanceUseAspectDataInstanceUseAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# String updateData(Resource,EObject,EStructuralFeature,String)
    if (_self instanceof org.etsi.mts.tdl.DataInstanceUse){
    	result = org.imt.k3tdl.k3dsa.DataInstanceUseAspect._privk3_updateData(_self_, (org.etsi.mts.tdl.DataInstanceUse)_self,MUTResource,object,matchedFeature,DSLPath);
    };
    return (java.lang.String)result;
  }

  protected static EObject _privk3_getMatchedMUTElement(final DataInstanceUseAspectDataInstanceUseAspectProperties _self_, final DataInstanceUse _self, final Resource MUTResource, final boolean isAssertion, final String DSLPath) {
    ArrayList<EObject> rootElement = new ArrayList<EObject>();
    boolean _isConcreteEcoreType = DataTypeAspect.isConcreteEcoreType(_self.getDataInstance().getDataType(), DSLPath);
    boolean _not = (!_isConcreteEcoreType);
    if (_not) {
      String _name = _self.getDataInstance().getName();
      String _plus = ("The " + _name);
      String _plus_1 = (_plus + " element is abstract");
      InputOutput.<String>println(_plus_1);
      DataInstance _dataInstance = _self.getDataInstance();
      String _name_1 = _self.getDataInstance().getName();
      String _plus_2 = ((TDLTestResultUtil.FAIL + ": The ") + _name_1);
      String _plus_3 = (_plus_2 + " element is abstract");
      DataInstanceAspect.info(_dataInstance, _plus_3);
      return null;
    }
    final String dataTypeName = DataTypeAspect.getValidName(_self.getDataInstance().getDataType());
    rootElement.add(MUTResource.getContents().get(0));
    boolean _equals = rootElement.get(0).eClass().getName().equals(dataTypeName);
    boolean _not_1 = (!_equals);
    if (_not_1) {
      EObject container = rootElement.get(0);
      rootElement.remove(0);
      final Function1<EObject, Boolean> _function = new Function1<EObject, Boolean>() {
        public Boolean apply(final EObject object) {
          return Boolean.valueOf(object.eClass().getName().equals(dataTypeName));
        }
      };
      rootElement.addAll(IteratorExtensions.<EObject>toList(IteratorExtensions.<EObject>filter(container.eAllContents(), _function)));
    }
    return DataInstanceUseAspect.getMatchedMUTElement(_self, rootElement, MUTResource, isAssertion, DSLPath);
  }

  protected static EObject _privk3_getMatchedMUTElement(final DataInstanceUseAspectDataInstanceUseAspectProperties _self_, final DataInstanceUse _self, final ArrayList<EObject> rootElement, final Resource MUTResource, final boolean isAssertion, final String DSLPath) {
    ArrayList<EObject> containers = new ArrayList<EObject>();
    EObject matchedElement = null;
    DataInstance _dataInstance = _self.getDataInstance();
    if ((_dataInstance instanceof StructuredDataInstance)) {
      DataInstance _dataInstance_1 = _self.getDataInstance();
      final StructuredDataInstance dataIns = ((StructuredDataInstance) _dataInstance_1);
      int _size = dataIns.getMemberAssignment().size();
      boolean _greaterThan = (_size > 0);
      if (_greaterThan) {
        matchedElement = StructuredDataInstanceAspect.getMatchedMUTElement(dataIns, rootElement, MUTResource, isAssertion, DSLPath);
        if ((matchedElement == null)) {
          DataInstance _dataInstance_2 = _self.getDataInstance();
          String _name = dataIns.getName();
          String _plus = ((TDLTestResultUtil.FAIL + ": There is no MUT element matched with ") + _name);
          DataInstanceAspect.info(_dataInstance_2, _plus);
          return null;
        }
      }
      containers = StructuredDataInstanceAspect.matchedElements(dataIns);
    }
    int _size_1 = containers.size();
    ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _size_1, true);
    for (final Integer i : _doubleDotLessThan) {
      {
        DataInstance _dataInstance_3 = _self.getDataInstance();
        DataInstanceAspect.info(_dataInstance_3, DataInstanceUseAspect.isMatchedParametrizedElement(_self, containers.get((i).intValue()), MUTResource, isAssertion, DSLPath));
        boolean _contains = DataInstanceAspect.info(_self.getDataInstance()).contains(TDLTestResultUtil.PASS);
        if (_contains) {
          return containers.get((i).intValue());
        }
      }
    }
    return null;
  }

  protected static String _privk3_isMatchedParametrizedElement(final DataInstanceUseAspectDataInstanceUseAspectProperties _self_, final DataInstanceUse _self, final EObject rootElement, final Resource MUTResource, final boolean isAssertion, final String DSLPath) {
    int _size = _self.getArgument().size();
    ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _size, true);
    for (final Integer i : _doubleDotLessThan) {
      {
        final ParameterBinding parameterBinding = _self.getArgument().get((i).intValue());
        final String status = ParameterBindingAspect.isMatchedParameter(parameterBinding, rootElement, MUTResource, Boolean.valueOf(isAssertion), DSLPath);
        boolean _contains = status.contains(TDLTestResultUtil.FAIL);
        if (_contains) {
          return status;
        }
      }
    }
    return TDLTestResultUtil.PASS;
  }

  protected static String _privk3_setMatchedMUTElement(final DataInstanceUseAspectDataInstanceUseAspectProperties _self_, final DataInstanceUse _self, final Resource MUTResource, final String DSLPath) {
    String _xblockexpression = null;
    {
      EObject matchedObject = DataInstanceUseAspect.getMatchedMUTElement(_self, MUTResource, false, DSLPath);
      if ((matchedObject == null)) {
        InputOutput.<String>println("There is no matched object in the model under test");
        String _name = _self.getDataInstance().getName();
        return ((TDLTestResultUtil.FAIL + ": There is no MUT element matched with ") + _name);
      }
      _xblockexpression = DataInstanceUseAspect.setMatchedMUTElement(_self, matchedObject, MUTResource, DSLPath);
    }
    return _xblockexpression;
  }

  protected static String _privk3_setMatchedMUTElement(final DataInstanceUseAspectDataInstanceUseAspectProperties _self_, final DataInstanceUse _self, final EObject matchedObject, final Resource MUTResource, final String DSLPath) {
    String status = "";
    DataInstance _dataInstance = _self.getDataInstance();
    if ((_dataInstance instanceof StructuredDataInstance)) {
      DataInstance _dataInstance_1 = _self.getDataInstance();
      final StructuredDataInstance dataIns = ((StructuredDataInstance) _dataInstance_1);
      status = StructuredDataInstanceAspect.setMatchedMUTElement(dataIns, matchedObject, MUTResource, DSLPath);
      boolean _contains = status.contains(TDLTestResultUtil.FAIL);
      if (_contains) {
        return status;
      }
    }
    int _size = _self.getArgument().size();
    ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _size, true);
    for (final Integer i : _doubleDotLessThan) {
      {
        ParameterBinding parameterBinding = _self.getArgument().get((i).intValue());
        if ((DataTypeAspect.isDynamicType(parameterBinding.getParameter().getDataType()) || MemberAspect.isDynamicMember(((Member) parameterBinding.getParameter())))) {
          status = ParameterBindingAspect.setMatchedParameter(parameterBinding, matchedObject, MUTResource, DSLPath);
        } else {
          DataUse _dataUse = parameterBinding.getDataUse();
          if ((_dataUse instanceof DataInstanceUse)) {
            DataUse _dataUse_1 = parameterBinding.getDataUse();
            final DataInstanceUse data = ((DataInstanceUse) _dataUse_1);
            Boolean _hasItems = ParameterBindingAspect.hasItems(parameterBinding);
            if ((_hasItems).booleanValue()) {
              int _size_1 = data.getItem().size();
              ExclusiveRange _doubleDotLessThan_1 = new ExclusiveRange(0, _size_1, true);
              for (final Integer j : _doubleDotLessThan_1) {
                {
                  DataUse _get = data.getItem().get((j).intValue());
                  final DataInstanceUse item = ((DataInstanceUse) _get);
                  final EObject rootObject = DataInstanceUseAspect.getMatchedMUTElement(item, MUTResource, false, DSLPath);
                  DataUse _get_1 = data.getItem().get((j).intValue());
                  status = DataInstanceUseAspect.setMatchedMUTElement(((DataInstanceUse) _get_1), rootObject, MUTResource, DSLPath);
                  boolean _contains_1 = status.contains(TDLTestResultUtil.FAIL);
                  if (_contains_1) {
                    return status;
                  }
                }
              }
            } else {
              final EObject rootObject = DataInstanceUseAspect.getMatchedMUTElement(data, MUTResource, false, DSLPath);
              status = DataInstanceUseAspect.setMatchedMUTElement(data, rootObject, MUTResource, DSLPath);
              boolean _contains_1 = status.contains(TDLTestResultUtil.FAIL);
              if (_contains_1) {
                return status;
              }
            }
          }
        }
        boolean _contains_2 = status.contains(TDLTestResultUtil.FAIL);
        if (_contains_2) {
          return status;
        }
      }
    }
    return status;
  }

  protected static EObject _privk3_createEObject(final DataInstanceUseAspectDataInstanceUseAspectProperties _self_, final DataInstanceUse _self, final Resource MUTResource, final boolean isAssertion, final String DSLPath) {
    final ModelEObjectCreator objectCreator = new ModelEObjectCreator();
    final EObject eobject = objectCreator.createEObject(_self, MUTResource, isAssertion, DSLPath);
    return eobject;
  }

  private static String super_assertEquals(final DataInstanceUse _self, final Resource MUTResource, final Object featureValue, final Boolean isAssertion, final String DSLPath) {
    final org.imt.k3tdl.k3dsa.StaticDataUseAspectStaticDataUseAspectProperties _self_ = org.imt.k3tdl.k3dsa.StaticDataUseAspectStaticDataUseAspectContext.getSelf(_self);
    return  org.imt.k3tdl.k3dsa.StaticDataUseAspect._privk3_assertEquals(_self_, _self,MUTResource,featureValue,isAssertion,DSLPath);
  }

  protected static String _privk3_assertEquals(final DataInstanceUseAspectDataInstanceUseAspectProperties _self_, final DataInstanceUse _self, final Resource MUTResource, final Object featureValue, final Boolean isAssertion, final String DSLPath) {
    ArrayList<EObject> rootObjects = new ArrayList<EObject>();
    if ((featureValue instanceof EList)) {
      rootObjects.addAll(((Collection<? extends EObject>)featureValue));
    } else {
      if ((featureValue instanceof EObject)) {
        rootObjects.add(((EObject) featureValue));
      }
    }
    final ArrayList<EObject> matchedObjects = new ArrayList<EObject>();
    String expectedData = "";
    String mutData = "";
    if (((_self.getItem() != null) && (_self.getItem().size() > 0))) {
      mutData = TDLTestResultUtil.getInstance().getDataAsString(((EList<?>) featureValue));
      int _size = _self.getItem().size();
      ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _size, true);
      for (final Integer i : _doubleDotLessThan) {
        {
          DataUse _get = _self.getItem().get((i).intValue());
          final EObject matchedObject = DataInstanceUseAspect.getMatchedMUTElement(((DataInstanceUse) _get), rootObjects, MUTResource, (isAssertion).booleanValue(), DSLPath);
          matchedObjects.add(matchedObject);
          String _expectedData = expectedData;
          DataUse _get_1 = _self.getItem().get((i).intValue());
          String _name = ((DataInstanceUse) _get_1).getDataInstance().getName();
          String _plus = (_name + ", ");
          expectedData = (_expectedData + _plus);
        }
      }
      int _length = expectedData.length();
      int _minus = (_length - 2);
      String _substring = expectedData.substring(0, _minus);
      String _plus = ("[" + _substring);
      String _plus_1 = (_plus + "]");
      expectedData = _plus_1;
      if ((mutData.equals("[]") && (!StringExtensions.isNullOrEmpty(expectedData)))) {
        return (((TDLTestResultUtil.FAIL + ": The expected data is: ") + expectedData) + ", but the current data is NULL");
      }
      if ((isAssertion).booleanValue()) {
        boolean _equals = ((EList<?>) featureValue).equals(matchedObjects);
        if (_equals) {
          return (TDLTestResultUtil.PASS + ": The expected data is equal to the current data");
        }
      } else {
        boolean _containsAll = ((EList<?>) featureValue).containsAll(matchedObjects);
        if (_containsAll) {
          return (TDLTestResultUtil.PASS + ": The expected data contains the current data");
        }
      }
      return ((((TDLTestResultUtil.FAIL + ": The expected data is: ") + expectedData) + ", but the current data is: ") + mutData);
    } else {
      final EObject matchedObject = DataInstanceUseAspect.getMatchedMUTElement(_self, rootObjects, MUTResource, (isAssertion).booleanValue(), DSLPath);
      if ((matchedObject == null)) {
        expectedData = _self.getDataInstance().getName();
      } else {
        String _eObjectLabelProvider = TDLTestResultUtil.getInstance().eObjectLabelProvider(((EObject) matchedObject));
        String _plus_2 = ("[" + _eObjectLabelProvider);
        String _plus_3 = (_plus_2 + "]");
        expectedData = _plus_3;
      }
      if ((featureValue instanceof EList)) {
        if (((matchedObject != null) && ((EList<?>) featureValue).contains(matchedObject))) {
          return (TDLTestResultUtil.PASS + ": The expected data contains in the current data");
        }
        String _dataAsString = TDLTestResultUtil.getInstance().getDataAsString(((EList<?>) featureValue));
        String _plus_4 = ("[" + _dataAsString);
        String _plus_5 = (_plus_4 + "]");
        mutData = _plus_5;
      } else {
        if ((featureValue instanceof EObject)) {
          if (((matchedObject != null) && ((EObject) featureValue).equals(matchedObject))) {
            return (TDLTestResultUtil.PASS + ": The expected data is equal to the current data");
          }
          String _eObjectLabelProvider_1 = TDLTestResultUtil.getInstance().eObjectLabelProvider(((EObject) featureValue));
          String _plus_6 = ("[" + _eObjectLabelProvider_1);
          String _plus_7 = (_plus_6 + "]");
          mutData = _plus_7;
        }
      }
      return ((((TDLTestResultUtil.FAIL + ": The expected data is: ") + expectedData) + ", but the current data is: ") + mutData);
    }
  }

  private static String super_updateData(final DataInstanceUse _self, final Resource MUTResource, final EObject object, final EStructuralFeature matchedFeature, final String DSLPath) {
    final org.imt.k3tdl.k3dsa.StaticDataUseAspectStaticDataUseAspectProperties _self_ = org.imt.k3tdl.k3dsa.StaticDataUseAspectStaticDataUseAspectContext.getSelf(_self);
    return  org.imt.k3tdl.k3dsa.StaticDataUseAspect._privk3_updateData(_self_, _self,MUTResource,object,matchedFeature,DSLPath);
  }

  protected static String _privk3_updateData(final DataInstanceUseAspectDataInstanceUseAspectProperties _self_, final DataInstanceUse _self, final Resource MUTResource, final EObject object, final EStructuralFeature matchedFeature, final String DSLPath) {
    if (((_self.getItem() != null) && (_self.getItem().size() > 0))) {
      final TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(object);
      try {
        CommandStack _commandStack = domain.getCommandStack();
        _commandStack.execute(new RecordingCommand(domain) {
          protected void doExecute() {
            ArrayList<EObject> rootElements = new ArrayList<EObject>();
            rootElements.add(object);
            final ArrayList<EObject> matchedObjects = new ArrayList<EObject>();
            int _size = _self.getItem().size();
            ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _size, true);
            for (final Integer i : _doubleDotLessThan) {
              {
                DataUse _get = _self.getItem().get((i).intValue());
                final DataInstanceUse item = ((DataInstanceUse) _get);
                final EObject matchedObject = DataInstanceUseAspect.getMatchedMUTElement(item, rootElements, MUTResource, false, DSLPath);
                if ((matchedObject == null)) {
                  String _name = item.getDataInstance().getName();
                  String _plus = ("There is no " + _name);
                  String _plus_1 = (_plus + " property in the MUT");
                  InputOutput.<String>println(_plus_1);
                } else {
                  DataInstanceUseAspect.setMatchedMUTElement(_self, matchedObject, MUTResource, DSLPath);
                  matchedObjects.add(matchedObject);
                }
              }
            }
            int _size_1 = matchedObjects.size();
            int _size_2 = _self.getItem().size();
            boolean _equals = (_size_1 == _size_2);
            if (_equals) {
              object.eSet(matchedFeature, matchedObjects);
            }
          }
        });
      } catch (final Throwable _t) {
        if (_t instanceof IllegalArgumentException) {
          String _name = matchedFeature.getName();
          String _plus = ("FAIL: The new value cannot be set for the " + _name);
          String _plus_1 = (_plus + " property of the MUT");
          InputOutput.<String>println(_plus_1);
          String _name_1 = matchedFeature.getName();
          String _plus_2 = ((TDLTestResultUtil.FAIL + ": The new value cannot be set for the ") + _name_1);
          return (_plus_2 + " property of the MUT");
        } else if (_t instanceof NullPointerException) {
          ArrayList<EObject> rootElements = new ArrayList<EObject>();
          rootElements.add(object);
          final ArrayList<EObject> matchedObjects = new ArrayList<EObject>();
          int _size = _self.getItem().size();
          ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _size, true);
          for (final Integer i : _doubleDotLessThan) {
            {
              DataUse _get = _self.getItem().get((i).intValue());
              final DataInstanceUse item = ((DataInstanceUse) _get);
              final EObject matchedObject = DataInstanceUseAspect.getMatchedMUTElement(item, rootElements, MUTResource, false, DSLPath);
              if ((matchedObject == null)) {
                String _name_2 = item.getDataInstance().getName();
                String _plus_3 = ("There is no " + _name_2);
                String _plus_4 = (_plus_3 + " property in the MUT");
                InputOutput.<String>println(_plus_4);
              } else {
                DataInstanceUseAspect.setMatchedMUTElement(_self, matchedObject, MUTResource, DSLPath);
                matchedObjects.add(matchedObject);
              }
            }
          }
          int _size_1 = matchedObjects.size();
          int _size_2 = _self.getItem().size();
          boolean _equals = (_size_1 == _size_2);
          if (_equals) {
            object.eSet(matchedFeature, matchedObjects);
          }
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      }
    } else {
      final EObject matchedObject = DataInstanceUseAspect.getMatchedMUTElement(_self, MUTResource, false, DSLPath);
      if ((matchedObject == null)) {
        String _name = _self.getDataInstance().getName();
        String _plus = ("There is no " + _name);
        String _plus_1 = (_plus + " property in the MUT");
        InputOutput.<String>println(_plus_1);
        String _name_1 = _self.getDataInstance().getName();
        return ((TDLTestResultUtil.FAIL + ": There is no MUT element matched with ") + _name_1);
      }
      try {
        final TransactionalEditingDomain domain_1 = TransactionUtil.getEditingDomain(object);
        CommandStack _commandStack = domain_1.getCommandStack();
        _commandStack.execute(new RecordingCommand(domain_1) {
          protected void doExecute() {
            ArrayList<EObject> rootElements = new ArrayList<EObject>();
            rootElements.add(object);
            final EObject matchedObject = DataInstanceUseAspect.getMatchedMUTElement(_self, MUTResource, false, DSLPath);
            DataInstanceUseAspect.setMatchedMUTElement(_self, matchedObject, MUTResource, DSLPath);
            boolean _isMany = matchedFeature.isMany();
            if (_isMany) {
              final ArrayList<EObject> matchedObjects = new ArrayList<EObject>();
              matchedObjects.add(matchedObject);
              object.eSet(matchedFeature, matchedObjects);
            } else {
              object.eSet(matchedFeature, matchedObject);
            }
          }
        });
      } catch (final Throwable _t) {
        if (_t instanceof IllegalArgumentException) {
          String _name_2 = matchedFeature.getName();
          String _plus_2 = ("New value cannot be set for the " + _name_2);
          String _plus_3 = (_plus_2 + " property of the MUT");
          InputOutput.<String>println(_plus_3);
          String _name_3 = matchedFeature.getName();
          String _plus_4 = ((TDLTestResultUtil.FAIL + ": New value cannot be set for the ") + _name_3);
          return (_plus_4 + " property of the MUT");
        } else if (_t instanceof NullPointerException) {
          ArrayList<EObject> rootElements = new ArrayList<EObject>();
          rootElements.add(object);
          DataInstanceUseAspect.setMatchedMUTElement(_self, matchedObject, MUTResource, DSLPath);
          boolean _isMany = matchedFeature.isMany();
          if (_isMany) {
            final ArrayList<EObject> matchedObjects = new ArrayList<EObject>();
            matchedObjects.add(matchedObject);
            object.eSet(matchedFeature, matchedObjects);
          } else {
            object.eSet(matchedFeature, matchedObject);
          }
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      }
    }
    String _name_2 = matchedFeature.getName();
    String _plus_2 = ((TDLTestResultUtil.PASS + ": New value is set for the ") + _name_2);
    return (_plus_2 + " property of the MUT");
  }
}
