package org.imt.k3tdl.k3dsa;

import com.google.common.base.Objects;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.etsi.mts.tdl.LiteralValueUse;
import org.imt.tdl.testResult.TDLTestResultUtil;

@Aspect(className = LiteralValueUse.class)
@SuppressWarnings("all")
public class LiteralValueUseAspect extends StaticDataUseAspect {
  public static Object getPrimitiveValue(final LiteralValueUse _self, final String primitiveTypeName) {
    final org.imt.k3tdl.k3dsa.LiteralValueUseAspectLiteralValueUseAspectProperties _self_ = org.imt.k3tdl.k3dsa.LiteralValueUseAspectLiteralValueUseAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Object getPrimitiveValue(String)
    if (_self instanceof org.etsi.mts.tdl.LiteralValueUse){
    	result = org.imt.k3tdl.k3dsa.LiteralValueUseAspect._privk3_getPrimitiveValue(_self_, (org.etsi.mts.tdl.LiteralValueUse)_self,primitiveTypeName);
    };
    return (java.lang.Object)result;
  }

  @OverrideAspectMethod
  public static String assertEquals(final LiteralValueUse _self, final Object featureValue) {
    final org.imt.k3tdl.k3dsa.LiteralValueUseAspectLiteralValueUseAspectProperties _self_ = org.imt.k3tdl.k3dsa.LiteralValueUseAspectLiteralValueUseAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# String assertEquals(Object)
    if (_self instanceof org.etsi.mts.tdl.LiteralValueUse){
    	result = org.imt.k3tdl.k3dsa.LiteralValueUseAspect._privk3_assertEquals(_self_, (org.etsi.mts.tdl.LiteralValueUse)_self,featureValue);
    };
    return (java.lang.String)result;
  }

  @OverrideAspectMethod
  public static String updateData(final LiteralValueUse _self, final EObject object, final EStructuralFeature matchedFeature) {
    final org.imt.k3tdl.k3dsa.LiteralValueUseAspectLiteralValueUseAspectProperties _self_ = org.imt.k3tdl.k3dsa.LiteralValueUseAspectLiteralValueUseAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# String updateData(EObject,EStructuralFeature)
    if (_self instanceof org.etsi.mts.tdl.LiteralValueUse){
    	result = org.imt.k3tdl.k3dsa.LiteralValueUseAspect._privk3_updateData(_self_, (org.etsi.mts.tdl.LiteralValueUse)_self,object,matchedFeature);
    };
    return (java.lang.String)result;
  }

  protected static Object _privk3_getPrimitiveValue(final LiteralValueUseAspectLiteralValueUseAspectProperties _self_, final LiteralValueUse _self, final String primitiveTypeName) {
    String parameterValue = _self.getValue();
    if ((parameterValue.startsWith("\"") || parameterValue.startsWith("\'"))) {
      int _length = parameterValue.length();
      int _minus = (_length - 1);
      parameterValue = parameterValue.substring(1, _minus);
    }
    if ((primitiveTypeName.equals("EInt") || primitiveTypeName.equals("EIntegerObject"))) {
      return Integer.valueOf(Integer.parseInt(parameterValue));
    } else {
      if ((primitiveTypeName.equals("EBoolean") || primitiveTypeName.equals("EBooleanObject"))) {
        return Boolean.valueOf(Boolean.parseBoolean(parameterValue));
      } else {
        boolean _equals = primitiveTypeName.equals("EString");
        if (_equals) {
          return parameterValue;
        }
      }
    }
    return null;
  }

  private static String super_assertEquals(final LiteralValueUse _self, final Object featureValue) {
    final org.imt.k3tdl.k3dsa.StaticDataUseAspectStaticDataUseAspectProperties _self_ = org.imt.k3tdl.k3dsa.StaticDataUseAspectStaticDataUseAspectContext.getSelf(_self);
    return  org.imt.k3tdl.k3dsa.StaticDataUseAspect._privk3_assertEquals(_self_, _self,featureValue);
  }

  protected static String _privk3_assertEquals(final LiteralValueUseAspectLiteralValueUseAspectProperties _self_, final LiteralValueUse _self, final Object featureValue) {
    String parameterValue = _self.getValue();
    if ((parameterValue.startsWith("\"") || parameterValue.startsWith("\'"))) {
      int _length = parameterValue.length();
      int _minus = (_length - 1);
      parameterValue = parameterValue.substring(1, _minus);
    }
    if (((featureValue == null) && (Objects.equal(parameterValue, "null") || StringExtensions.isNullOrEmpty(parameterValue)))) {
      return (TDLTestResultUtil.PASS + ": The expected data is equal to the current data");
    } else {
      boolean _equals = featureValue.toString().equals(parameterValue);
      if (_equals) {
        return (TDLTestResultUtil.PASS + ": The expected data is equal to the current data");
      }
    }
    return ((((TDLTestResultUtil.FAIL + ": The expected data is: ") + parameterValue) + ", but the current data is: ") + featureValue);
  }

  private static String super_updateData(final LiteralValueUse _self, final EObject object, final EStructuralFeature matchedFeature) {
    final org.imt.k3tdl.k3dsa.StaticDataUseAspectStaticDataUseAspectProperties _self_ = org.imt.k3tdl.k3dsa.StaticDataUseAspectStaticDataUseAspectContext.getSelf(_self);
    return  org.imt.k3tdl.k3dsa.StaticDataUseAspect._privk3_updateData(_self_, _self,object,matchedFeature);
  }

  protected static String _privk3_updateData(final LiteralValueUseAspectLiteralValueUseAspectProperties _self_, final LiteralValueUse _self, final EObject object, final EStructuralFeature matchedFeature) {
    final TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(object);
    try {
      CommandStack _commandStack = domain.getCommandStack();
      _commandStack.execute(new RecordingCommand(domain) {
        protected void doExecute() {
          String parameterValue = _self.getValue();
          if ((parameterValue.startsWith("\"") || parameterValue.startsWith("\'"))) {
            int _length = parameterValue.length();
            int _minus = (_length - 1);
            parameterValue = parameterValue.substring(1, _minus);
          }
          if ((matchedFeature.getEType().getName().equals("EInt") || matchedFeature.getEType().getName().equals("EIntegerObject"))) {
            object.eSet(matchedFeature, Integer.valueOf(Integer.parseInt(parameterValue)));
          } else {
            if ((matchedFeature.getEType().getName().equals("EBoolean") || matchedFeature.getEType().getName().equals("EBooleanObject"))) {
              object.eSet(matchedFeature, Boolean.valueOf(Boolean.parseBoolean(parameterValue)));
            } else {
              object.eSet(matchedFeature, parameterValue);
            }
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
        String parameterValue = _self.getValue();
        if ((parameterValue.startsWith("\"") || parameterValue.startsWith("\'"))) {
          int _length = parameterValue.length();
          int _minus = (_length - 1);
          parameterValue = parameterValue.substring(1, _minus);
        }
        if ((matchedFeature.getEType().getName().equals("EInt") || matchedFeature.getEType().getName().equals("EIntegerObject"))) {
          object.eSet(matchedFeature, Integer.valueOf(Integer.parseInt(parameterValue)));
        } else {
          if ((matchedFeature.getEType().getName().equals("EBoolean") || matchedFeature.getEType().getName().equals("EBooleanObject"))) {
            object.eSet(matchedFeature, Boolean.valueOf(Boolean.parseBoolean(parameterValue)));
          } else {
            object.eSet(matchedFeature, parameterValue);
          }
        }
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
    String _name = matchedFeature.getName();
    String _plus = ((TDLTestResultUtil.PASS + ": New value is set for the ") + _name);
    return (_plus + " property of the MUT");
  }
}
