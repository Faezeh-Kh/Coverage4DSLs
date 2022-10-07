package minijava.semantics;

import com.google.common.base.Objects;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.eclipse.emf.ecore.EClass;
import xminiJava.TypeRef;

@Aspect(className = TypeRef.class)
@SuppressWarnings("all")
public class TypeRefAspect {
  public static boolean compare(final TypeRef _self, final TypeRef other) {
    final minijava.semantics.TypeRefAspectTypeRefAspectProperties _self_ = minijava.semantics.TypeRefAspectTypeRefAspectContext.getSelf(_self);
    Object result = null;
    	// BeginInjectInto minijava.semantics.TypeRefAspect#boolean compare(TypeRef) from minijava.semantics.ClassRefAspect
    		if (_self instanceof xminiJava.ClassRef){
    			result = minijava.semantics.ClassRefAspect.compare((xminiJava.ClassRef)_self,other);
    		} else
    		// EndInjectInto minijava.semantics.TypeRefAspect#boolean compare(TypeRef) from minijava.semantics.ClassRefAspect
    // #DispatchPointCut_before# boolean compare(TypeRef)
    if (_self instanceof xminiJava.TypeRef){
    	result = minijava.semantics.TypeRefAspect._privk3_compare(_self_, (xminiJava.TypeRef)_self,other);
    };
    return (boolean)result;
  }

  protected static boolean _privk3_compare(final TypeRefAspectTypeRefAspectProperties _self_, final TypeRef _self, final TypeRef other) {
    EClass _eClass = _self.eClass();
    EClass _eClass_1 = other.eClass();
    return Objects.equal(_eClass, _eClass_1);
  }
}
