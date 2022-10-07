package org.imt.k3tdl.k3dsa;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.ExclusiveRange;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.etsi.mts.tdl.DataInstance;
import org.etsi.mts.tdl.DataInstanceUse;
import org.etsi.mts.tdl.DataUse;
import org.etsi.mts.tdl.LiteralValueUse;
import org.etsi.mts.tdl.MemberAssignment;
import org.etsi.mts.tdl.ParameterBinding;
import org.etsi.mts.tdl.StructuredDataInstance;

@SuppressWarnings("all")
public class ModelEObjectCreator {
  private Resource MUTResource;

  private EPackage rootEPackage;

  private boolean isAssertion;

  private String DSLPath;

  public EObject createEObject(final DataInstanceUse TDLObject, final Resource MUTResource, final boolean isAssertion, final String DSLPath) {
    this.MUTResource = MUTResource;
    this.isAssertion = isAssertion;
    this.DSLPath = DSLPath;
    this.rootEPackage = MUTResource.getContents().get(0).eClass().getEPackage();
    return this.createEObject(TDLObject);
  }

  public EObject createEObject(final DataInstanceUse TDLObject) {
    final String eclassName = DataTypeAspect.getValidName(TDLObject.getDataInstance().getDataType());
    EClassifier _eClassifier = this.rootEPackage.getEClassifier(eclassName);
    final EClass eobjectType = ((EClass) _eClassifier);
    if ((eobjectType == null)) {
      return null;
    }
    EObject newEObject = this.rootEPackage.getEFactoryInstance().create(eobjectType);
    boolean _setEObjectFeatures = this.setEObjectFeatures(TDLObject, newEObject, eobjectType);
    if (_setEObjectFeatures) {
      return newEObject;
    }
    return null;
  }

  public boolean setEObjectFeatures(final DataInstanceUse TDLObject, final EObject newEObject, final EClass eobjectType) {
    boolean result = true;
    if (((TDLObject.getDataInstance() instanceof StructuredDataInstance) && 
      (((StructuredDataInstance) TDLObject.getDataInstance()).getMemberAssignment().size() > 0))) {
      DataInstance _dataInstance = TDLObject.getDataInstance();
      final StructuredDataInstance dataInstance = ((StructuredDataInstance) _dataInstance);
      EList<MemberAssignment> _memberAssignment = dataInstance.getMemberAssignment();
      for (final MemberAssignment memberAssignment : _memberAssignment) {
        {
          final EStructuralFeature eStructuralFeature = eobjectType.getEStructuralFeature(this.getValidName(memberAssignment.getMember().getName()));
          if ((eStructuralFeature != null)) {
            final DataUse memberValue = memberAssignment.getMemberSpec();
            result = this.setFeatureValue(newEObject, eStructuralFeature, this.getTdlValues(memberValue));
            if ((!result)) {
              return result;
            }
          }
        }
      }
    }
    int _size = TDLObject.getArgument().size();
    ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _size, true);
    for (final Integer i : _doubleDotLessThan) {
      {
        final ParameterBinding parameterBinding = TDLObject.getArgument().get((i).intValue());
        final EStructuralFeature eStructuralFeature = eobjectType.getEStructuralFeature(this.getValidName(parameterBinding.getParameter().getName()));
        if ((eStructuralFeature != null)) {
          final DataUse parameterValue = parameterBinding.getDataUse();
          result = this.setFeatureValue(newEObject, eStructuralFeature, this.getTdlValues(parameterValue));
          if ((!result)) {
            return result;
          }
        }
      }
    }
    return result;
  }

  public List<DataUse> getTdlValues(final DataUse dataUse) {
    List<DataUse> tdlValues = new ArrayList<DataUse>();
    if ((dataUse instanceof DataInstanceUse)) {
      final DataInstanceUse dataInstanceUse = ((DataInstanceUse) dataUse);
      if (((dataInstanceUse.getItem() == null) || (dataInstanceUse.getItem().size() <= 0))) {
        tdlValues.add(dataInstanceUse);
      } else {
        int _size = dataInstanceUse.getItem().size();
        ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _size, true);
        for (final Integer i : _doubleDotLessThan) {
          tdlValues.add(dataInstanceUse.getItem().get((i).intValue()));
        }
      }
    } else {
      if ((dataUse instanceof LiteralValueUse)) {
        tdlValues.add(dataUse);
      }
    }
    return tdlValues;
  }

  public boolean setFeatureValue(final EObject newEObject, final EStructuralFeature feature, final List<DataUse> featureTdlValues) {
    int _size = featureTdlValues.size();
    boolean _equals = (_size == 0);
    if (_equals) {
      return this.setEObjectFeatureValue(newEObject, feature, feature.getDefaultValue());
    } else {
      DataUse _get = featureTdlValues.get(0);
      if ((_get instanceof DataInstanceUse)) {
        List<EObject> featureValues = new ArrayList<EObject>();
        for (final DataUse tdlValue : featureTdlValues) {
          {
            final EObject featureValue = DataInstanceUseAspect.getMatchedMUTElement(((DataInstanceUse) tdlValue), this.MUTResource, this.isAssertion, this.DSLPath);
            if ((featureValue != null)) {
              featureValues.add(featureValue);
            } else {
              featureValues.add(this.createEObject(((DataInstanceUse) tdlValue)));
            }
          }
        }
        boolean _isEmpty = featureValues.isEmpty();
        boolean _not = (!_isEmpty);
        if (_not) {
          boolean _isMany = feature.isMany();
          if (_isMany) {
            return this.setEObjectFeatureValue(newEObject, feature, featureValues);
          } else {
            return this.setEObjectFeatureValue(newEObject, feature, featureValues.get(0));
          }
        }
      } else {
        DataUse _get_1 = featureTdlValues.get(0);
        if ((_get_1 instanceof LiteralValueUse)) {
          if ((feature.getEType().getName().equals("EIntegerObject") || feature.getEType().getName().equals("EInt"))) {
            boolean _isMany_1 = feature.isMany();
            boolean _not_1 = (!_isMany_1);
            if (_not_1) {
              DataUse _get_2 = featureTdlValues.get(0);
              String featureValue = this.getLiteralValue(((LiteralValueUse) _get_2));
              return this.setEObjectFeatureValue(newEObject, feature, Integer.valueOf(Integer.parseInt(featureValue)));
            } else {
              List<Integer> featureValues_1 = new ArrayList<Integer>();
              for (final DataUse tdlValue_1 : featureTdlValues) {
                {
                  String featureValue_1 = this.getLiteralValue(((LiteralValueUse) tdlValue_1));
                  featureValues_1.add(Integer.valueOf(Integer.parseInt(featureValue_1)));
                }
              }
              return this.setEObjectFeatureValue(newEObject, feature, featureValues_1);
            }
          } else {
            if ((feature.getEType().getName().equals("EBooleanObject") || feature.getEType().getName().equals("EBoolean"))) {
              boolean _isMany_2 = feature.isMany();
              boolean _not_2 = (!_isMany_2);
              if (_not_2) {
                DataUse _get_3 = featureTdlValues.get(0);
                String featureValue_1 = this.getLiteralValue(((LiteralValueUse) _get_3));
                return this.setEObjectFeatureValue(newEObject, feature, Boolean.valueOf(Boolean.parseBoolean(featureValue_1)));
              } else {
                List<Boolean> featureValues_2 = new ArrayList<Boolean>();
                for (final DataUse tdlValue_2 : featureTdlValues) {
                  {
                    String featureValue_2 = this.getLiteralValue(((LiteralValueUse) tdlValue_2));
                    featureValues_2.add(Boolean.valueOf(Boolean.parseBoolean(featureValue_2)));
                  }
                }
                return this.setEObjectFeatureValue(newEObject, feature, featureValues_2);
              }
            } else {
              boolean _isMany_3 = feature.isMany();
              boolean _not_3 = (!_isMany_3);
              if (_not_3) {
                DataUse _get_4 = featureTdlValues.get(0);
                String featureValue_2 = this.getLiteralValue(((LiteralValueUse) _get_4));
                return this.setEObjectFeatureValue(newEObject, feature, featureValue_2);
              } else {
                List<String> featureValues_3 = new ArrayList<String>();
                for (final DataUse tdlValue_3 : featureTdlValues) {
                  {
                    String featureValue_3 = this.getLiteralValue(((LiteralValueUse) tdlValue_3));
                    featureValues_3.add(featureValue_3);
                  }
                }
                return this.setEObjectFeatureValue(newEObject, feature, featureValues_3);
              }
            }
          }
        }
      }
    }
    return false;
  }

  public boolean setEObjectFeatureValue(final EObject object, final EStructuralFeature feature, final Object value) {
    try {
      final TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(object);
      CommandStack _commandStack = domain.getCommandStack();
      _commandStack.execute(new RecordingCommand(domain) {
        protected void doExecute() {
          object.eSet(feature, value);
        }
      });
      return true;
    } catch (final Throwable _t) {
      if (_t instanceof IllegalArgumentException) {
        String _name = feature.getName();
        String _plus = ("IllegalArgumentException: New value cannot be set for the " + _name);
        String _plus_1 = (_plus + " property of the MUT");
        InputOutput.<String>println(_plus_1);
        return false;
      } else if (_t instanceof NullPointerException) {
        try {
          object.eSet(feature, value);
          return true;
        } catch (final Throwable _t_1) {
          if (_t_1 instanceof IllegalStateException) {
            String _name_1 = feature.getName();
            String _plus_2 = ("IllegalStateException: New value cannot be set for the " + _name_1);
            String _plus_3 = (_plus_2 + " property of the MUT");
            InputOutput.<String>println(_plus_3);
            return false;
          } else {
            throw Exceptions.sneakyThrow(_t_1);
          }
        }
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }

  public String getLiteralValue(final LiteralValueUse literalValue) {
    String featureValue = literalValue.getValue();
    if ((featureValue.startsWith("\"") || featureValue.startsWith("\'"))) {
      int _length = featureValue.length();
      int _minus = (_length - 1);
      featureValue = featureValue.substring(1, _minus);
    }
    return featureValue;
  }

  public String getValidName(final String name) {
    boolean _startsWith = name.startsWith("_");
    if (_startsWith) {
      return name.substring(1);
    }
    return name;
  }
}
