package org.imt.xminijava.interpreter;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.imt.minijava.xminiJava.ObjectRefValue;
import org.imt.minijava.xminiJava.Value;
import org.imt.minijava.xminiJava.XminiJavaFactory;

@Aspect(className = ObjectRefValue.class)
@SuppressWarnings("all")
public class ObjectRefValueAspect extends ValueAspect {
  @OverrideAspectMethod
  public static Value copy(final ObjectRefValue _self) {
    final org.imt.xminijava.interpreter.ObjectRefValueAspectObjectRefValueAspectProperties _self_ = org.imt.xminijava.interpreter.ObjectRefValueAspectObjectRefValueAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Value copy()
    if (_self instanceof org.imt.minijava.xminiJava.ObjectRefValue){
    	result = org.imt.xminijava.interpreter.ObjectRefValueAspect._privk3_copy(_self_, (org.imt.minijava.xminiJava.ObjectRefValue)_self);
    };
    return (org.imt.minijava.xminiJava.Value)result;
  }
  
  private static Value super_copy(final ObjectRefValue _self) {
    final org.imt.xminijava.interpreter.ValueAspectValueAspectProperties _self_ = org.imt.xminijava.interpreter.ValueAspectValueAspectContext.getSelf(_self);
    return  org.imt.xminijava.interpreter.ValueAspect._privk3_copy(_self_, _self);
  }
  
  protected static Value _privk3_copy(final ObjectRefValueAspectObjectRefValueAspectProperties _self_, final ObjectRefValue _self) {
    ObjectRefValue _createObjectRefValue = XminiJavaFactory.eINSTANCE.createObjectRefValue();
    final Procedure1<ObjectRefValue> _function = (ObjectRefValue it) -> {
      it.setInstance(_self.getInstance());
    };
    return ObjectExtensions.<ObjectRefValue>operator_doubleArrow(_createObjectRefValue, _function);
  }
}
