package org.imt.k3tdl.k3dsa;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import java.util.Optional;
import java.util.function.Predicate;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.gemoc.dsl.Dsl;
import org.eclipse.gemoc.dsl.Entry;
import org.eclipse.xtext.xbase.lib.ExclusiveRange;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.etsi.mts.tdl.Annotation;
import org.etsi.mts.tdl.DataType;
import org.etsi.mts.tdl.Member;
import org.etsi.mts.tdl.StructuredDataType;

@Aspect(className = DataType.class)
@SuppressWarnings("all")
public class DataTypeAspect {
  public static boolean isDynamicType(final DataType _self) {
    final org.imt.k3tdl.k3dsa.DataTypeAspectDataTypeAspectProperties _self_ = org.imt.k3tdl.k3dsa.DataTypeAspectDataTypeAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# boolean isDynamicType()
    if (_self instanceof org.etsi.mts.tdl.DataType){
    	result = org.imt.k3tdl.k3dsa.DataTypeAspect._privk3_isDynamicType(_self_, (org.etsi.mts.tdl.DataType)_self);
    };
    return (boolean)result;
  }

  public static boolean isConcreteEcoreType(final DataType _self, final String DSLPath) {
    final org.imt.k3tdl.k3dsa.DataTypeAspectDataTypeAspectProperties _self_ = org.imt.k3tdl.k3dsa.DataTypeAspectDataTypeAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# boolean isConcreteEcoreType(String)
    if (_self instanceof org.etsi.mts.tdl.DataType){
    	result = org.imt.k3tdl.k3dsa.DataTypeAspect._privk3_isConcreteEcoreType(_self_, (org.etsi.mts.tdl.DataType)_self,DSLPath);
    };
    return (boolean)result;
  }

  public static boolean isAcceptedEvent(final DataType _self, final String DSLPath) {
    final org.imt.k3tdl.k3dsa.DataTypeAspectDataTypeAspectProperties _self_ = org.imt.k3tdl.k3dsa.DataTypeAspectDataTypeAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# boolean isAcceptedEvent(String)
    if (_self instanceof org.etsi.mts.tdl.DataType){
    	result = org.imt.k3tdl.k3dsa.DataTypeAspect._privk3_isAcceptedEvent(_self_, (org.etsi.mts.tdl.DataType)_self,DSLPath);
    };
    return (boolean)result;
  }

  public static boolean isExposedEvent(final DataType _self, final String DSLPath) {
    final org.imt.k3tdl.k3dsa.DataTypeAspectDataTypeAspectProperties _self_ = org.imt.k3tdl.k3dsa.DataTypeAspectDataTypeAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# boolean isExposedEvent(String)
    if (_self instanceof org.etsi.mts.tdl.DataType){
    	result = org.imt.k3tdl.k3dsa.DataTypeAspect._privk3_isExposedEvent(_self_, (org.etsi.mts.tdl.DataType)_self,DSLPath);
    };
    return (boolean)result;
  }

  public static String getValidName(final DataType _self) {
    final org.imt.k3tdl.k3dsa.DataTypeAspectDataTypeAspectProperties _self_ = org.imt.k3tdl.k3dsa.DataTypeAspectDataTypeAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# String getValidName()
    if (_self instanceof org.etsi.mts.tdl.DataType){
    	result = org.imt.k3tdl.k3dsa.DataTypeAspect._privk3_getValidName(_self_, (org.etsi.mts.tdl.DataType)_self);
    };
    return (java.lang.String)result;
  }

  protected static boolean _privk3_isDynamicType(final DataTypeAspectDataTypeAspectProperties _self_, final DataType _self) {
    if ((_self instanceof StructuredDataType)) {
      final StructuredDataType type = ((StructuredDataType) _self);
      int _size = type.getAnnotation().size();
      ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _size, true);
      for (final Integer i : _doubleDotLessThan) {
        {
          final String annotation = type.getAnnotation().get((i).intValue()).getKey().getName().toString();
          if ((annotation.contains("dynamic") || annotation.contains("aspect"))) {
            return true;
          }
        }
      }
      int _size_1 = type.getMember().size();
      ExclusiveRange _doubleDotLessThan_1 = new ExclusiveRange(0, _size_1, true);
      for (final Integer i_1 : _doubleDotLessThan_1) {
        {
          final Member m = type.getMember().get((i_1).intValue());
          int _size_2 = m.getAnnotation().size();
          ExclusiveRange _doubleDotLessThan_2 = new ExclusiveRange(0, _size_2, true);
          for (final Integer j : _doubleDotLessThan_2) {
            {
              final String annotation = m.getAnnotation().get((j).intValue()).getKey().getName().toString();
              if ((annotation.contains("dynamic") || annotation.contains("aspect"))) {
                return true;
              }
            }
          }
        }
      }
    }
    return false;
  }

  protected static boolean _privk3_isConcreteEcoreType(final DataTypeAspectDataTypeAspectProperties _self_, final DataType _self, final String DSLPath) {
    Resource dslRes = new ResourceSetImpl().getResource(URI.createURI(DSLPath), true);
    EObject _get = dslRes.getContents().get(0);
    Dsl dsl = ((Dsl) _get);
    Entry _entry = dsl.getEntry("ecore");
    boolean _tripleNotEquals = (_entry != null);
    if (_tripleNotEquals) {
      String metamodelPath = dsl.getEntry("ecore").getValue().replaceFirst("resource", "plugin");
      Resource metamodelRes = new ResourceSetImpl().getResource(URI.createURI(metamodelPath), true);
      EObject _get_1 = metamodelRes.getContents().get(0);
      EPackage metamodelRootElement = ((EPackage) _get_1);
      final Function1<EClassifier, Boolean> _function = new Function1<EClassifier, Boolean>() {
        public Boolean apply(final EClassifier c) {
          return Boolean.valueOf((c.getName().equals(DataTypeAspect.getValidName(_self)) && (!c.eClass().isAbstract())));
        }
      };
      return IterableExtensions.<EClassifier>exists(metamodelRootElement.getEClassifiers(), _function);
    }
    return false;
  }

  protected static boolean _privk3_isAcceptedEvent(final DataTypeAspectDataTypeAspectProperties _self_, final DataType _self, final String DSLPath) {
    final Predicate<Annotation> _function = new Predicate<Annotation>() {
      public boolean test(final Annotation a) {
        return a.getKey().getName().equals("AcceptedEvent");
      }
    };
    final Optional<Annotation> annotation = _self.getAnnotation().stream().filter(_function).findFirst();
    return annotation.isPresent();
  }

  protected static boolean _privk3_isExposedEvent(final DataTypeAspectDataTypeAspectProperties _self_, final DataType _self, final String DSLPath) {
    final Predicate<Annotation> _function = new Predicate<Annotation>() {
      public boolean test(final Annotation a) {
        return a.getKey().getName().equals("ExposedEvent");
      }
    };
    final Optional<Annotation> annotation = _self.getAnnotation().stream().filter(_function).findFirst();
    return annotation.isPresent();
  }

  protected static String _privk3_getValidName(final DataTypeAspectDataTypeAspectProperties _self_, final DataType _self) {
    String tdlName = _self.getName();
    boolean _startsWith = _self.getName().startsWith("_");
    if (_startsWith) {
      return tdlName.substring(1);
    }
    return tdlName;
  }
}
