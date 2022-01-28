package org.imt.xminijava.interpreter;

import com.google.common.base.Objects;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.eclipse.emf.ecore.EClass;
import org.imt.minijava.xminiJava.TypeRef;

@Aspect(className = TypeRef.class)
@SuppressWarnings("all")
public class TypeRefAspect {
  public static boolean compare(final TypeRef _self, final TypeRef other) {
    final org.imt.xminijava.interpreter.TypeRefAspectTypeRefAspectProperties _self_ = org.imt.xminijava.interpreter.TypeRefAspectTypeRefAspectContext.getSelf(_self);
    Object result = null;
    	// BeginInjectInto org.imt.xminijava.interpreter.TypeRefAspect#boolean compare(TypeRef) from org.imt.xminijava.interpreter.ClassRefAspect
    		if (_self instanceof org.imt.minijava.xminiJava.ClassRef){
    			result = org.imt.xminijava.interpreter.ClassRefAspect.compare((org.imt.minijava.xminiJava.ClassRef)_self,other);
    		} else
    		// EndInjectInto org.imt.xminijava.interpreter.TypeRefAspect#boolean compare(TypeRef) from org.imt.xminijava.interpreter.ClassRefAspect
    // #DispatchPointCut_before# boolean compare(TypeRef)
    if (_self instanceof org.imt.minijava.xminiJava.TypeRef){
    	result = org.imt.xminijava.interpreter.TypeRefAspect._privk3_compare(_self_, (org.imt.minijava.xminiJava.TypeRef)_self,other);
    };
    return (boolean)result;
  }
  
  protected static boolean _privk3_compare(final TypeRefAspectTypeRefAspectProperties _self_, final TypeRef _self, final TypeRef other) {
    EClass _eClass = _self.eClass();
    EClass _eClass_1 = other.eClass();
    return Objects.equal(_eClass, _eClass_1);
  }
}
