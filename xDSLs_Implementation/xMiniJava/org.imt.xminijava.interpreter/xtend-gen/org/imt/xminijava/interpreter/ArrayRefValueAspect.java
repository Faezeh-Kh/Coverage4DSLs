package org.imt.xminijava.interpreter;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.imt.minijava.xminiJava.ArrayRefValue;
import org.imt.minijava.xminiJava.Value;
import org.imt.minijava.xminiJava.XminiJavaFactory;

@Aspect(className = ArrayRefValue.class)
@SuppressWarnings("all")
public class ArrayRefValueAspect extends ValueAspect {
  @OverrideAspectMethod
  public static Value copy(final ArrayRefValue _self) {
    final org.imt.xminijava.interpreter.ArrayRefValueAspectArrayRefValueAspectProperties _self_ = org.imt.xminijava.interpreter.ArrayRefValueAspectArrayRefValueAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Value copy()
    if (_self instanceof org.imt.minijava.xminiJava.ArrayRefValue){
    	result = org.imt.xminijava.interpreter.ArrayRefValueAspect._privk3_copy(_self_, (org.imt.minijava.xminiJava.ArrayRefValue)_self);
    };
    return (org.imt.minijava.xminiJava.Value)result;
  }
  
  private static Value super_copy(final ArrayRefValue _self) {
    final org.imt.xminijava.interpreter.ValueAspectValueAspectProperties _self_ = org.imt.xminijava.interpreter.ValueAspectValueAspectContext.getSelf(_self);
    return  org.imt.xminijava.interpreter.ValueAspect._privk3_copy(_self_, _self);
  }
  
  protected static Value _privk3_copy(final ArrayRefValueAspectArrayRefValueAspectProperties _self_, final ArrayRefValue _self) {
    ArrayRefValue _createArrayRefValue = XminiJavaFactory.eINSTANCE.createArrayRefValue();
    final Procedure1<ArrayRefValue> _function = (ArrayRefValue it) -> {
      it.setInstance(_self.getInstance());
    };
    return ObjectExtensions.<ArrayRefValue>operator_doubleArrow(_createArrayRefValue, _function);
  }
}
