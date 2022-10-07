package minijava.semantics;

import com.google.common.base.Objects;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import xminiJava.Parameter;

@Aspect(className = Parameter.class)
@SuppressWarnings("all")
public class ParameterAspect {
  public static boolean compare(final Parameter _self, final Parameter other) {
    final minijava.semantics.ParameterAspectParameterAspectProperties _self_ = minijava.semantics.ParameterAspectParameterAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# boolean compare(Parameter)
    if (_self instanceof xminiJava.Parameter){
    	result = minijava.semantics.ParameterAspect._privk3_compare(_self_, (xminiJava.Parameter)_self,other);
    };
    return (boolean)result;
  }

  protected static boolean _privk3_compare(final ParameterAspectParameterAspectProperties _self_, final Parameter _self, final Parameter other) {
    return (Objects.equal(_self.getName(), other.getName()) && TypeRefAspect.compare(_self.getTypeRef(), other.getTypeRef()));
  }
}
