package org.imt.xminijava.interpreter;

import com.google.common.base.Objects;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.imt.minijava.xminiJava.Parameter;

@Aspect(className = Parameter.class)
@SuppressWarnings("all")
public class ParameterAspect {
  public static boolean compare(final Parameter _self, final Parameter other) {
    final org.imt.xminijava.interpreter.ParameterAspectParameterAspectProperties _self_ = org.imt.xminijava.interpreter.ParameterAspectParameterAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# boolean compare(Parameter)
    if (_self instanceof org.imt.minijava.xminiJava.Parameter){
    	result = org.imt.xminijava.interpreter.ParameterAspect._privk3_compare(_self_, (org.imt.minijava.xminiJava.Parameter)_self,other);
    };
    return (boolean)result;
  }
  
  protected static boolean _privk3_compare(final ParameterAspectParameterAspectProperties _self_, final Parameter _self, final Parameter other) {
    return (Objects.equal(_self.getName(), other.getName()) && TypeRefAspect.compare(_self.getTypeRef(), other.getTypeRef()));
  }
}
