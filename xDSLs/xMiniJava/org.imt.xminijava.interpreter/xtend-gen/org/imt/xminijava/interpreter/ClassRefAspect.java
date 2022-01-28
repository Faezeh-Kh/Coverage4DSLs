package org.imt.xminijava.interpreter;

import com.google.common.base.Objects;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.imt.minijava.xminiJava.ClassRef;
import org.imt.minijava.xminiJava.TypeDeclaration;
import org.imt.minijava.xminiJava.TypeRef;

@Aspect(className = ClassRef.class)
@SuppressWarnings("all")
public class ClassRefAspect extends TypeRefAspect {
  @OverrideAspectMethod
  public static boolean compare(final ClassRef _self, final TypeRef other) {
    final org.imt.xminijava.interpreter.ClassRefAspectClassRefAspectProperties _self_ = org.imt.xminijava.interpreter.ClassRefAspectClassRefAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# boolean compare(TypeRef)
    if (_self instanceof org.imt.minijava.xminiJava.ClassRef){
    	result = org.imt.xminijava.interpreter.ClassRefAspect._privk3_compare(_self_, (org.imt.minijava.xminiJava.ClassRef)_self,other);
    };
    return (boolean)result;
  }
  
  private static boolean super_compare(final ClassRef _self, final TypeRef other) {
    final org.imt.xminijava.interpreter.TypeRefAspectTypeRefAspectProperties _self_ = org.imt.xminijava.interpreter.TypeRefAspectTypeRefAspectContext.getSelf(_self);
    return  org.imt.xminijava.interpreter.TypeRefAspect._privk3_compare(_self_, _self,other);
  }
  
  protected static boolean _privk3_compare(final ClassRefAspectClassRefAspectProperties _self_, final ClassRef _self, final TypeRef other) {
    if ((other instanceof ClassRef)) {
      TypeDeclaration _referencedClass = _self.getReferencedClass();
      TypeDeclaration _referencedClass_1 = ((ClassRef)other).getReferencedClass();
      return Objects.equal(_referencedClass, _referencedClass_1);
    } else {
      return false;
    }
  }
}
