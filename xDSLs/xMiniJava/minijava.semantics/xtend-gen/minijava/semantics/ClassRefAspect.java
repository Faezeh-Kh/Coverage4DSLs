package minijava.semantics;

import com.google.common.base.Objects;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import xminiJava.ClassRef;
import xminiJava.TypeDeclaration;
import xminiJava.TypeRef;

@Aspect(className = ClassRef.class)
@SuppressWarnings("all")
public class ClassRefAspect extends TypeRefAspect {
  @OverrideAspectMethod
  public static boolean compare(final ClassRef _self, final TypeRef other) {
    final minijava.semantics.ClassRefAspectClassRefAspectProperties _self_ = minijava.semantics.ClassRefAspectClassRefAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# boolean compare(TypeRef)
    if (_self instanceof xminiJava.ClassRef){
    	result = minijava.semantics.ClassRefAspect._privk3_compare(_self_, (xminiJava.ClassRef)_self,other);
    };
    return (boolean)result;
  }

  private static boolean super_compare(final ClassRef _self, final TypeRef other) {
    final minijava.semantics.TypeRefAspectTypeRefAspectProperties _self_ = minijava.semantics.TypeRefAspectTypeRefAspectContext.getSelf(_self);
    return  minijava.semantics.TypeRefAspect._privk3_compare(_self_, _self,other);
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
