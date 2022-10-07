package org.imt.k3tdl.k3dsa;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.xbase.lib.ExclusiveRange;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.etsi.mts.tdl.Member;

@Aspect(className = Member.class)
@SuppressWarnings("all")
public class MemberAspect {
  public static EStructuralFeature getMatchedFeature(final Member _self, final EObject rootElement) {
    final org.imt.k3tdl.k3dsa.MemberAspectMemberAspectProperties _self_ = org.imt.k3tdl.k3dsa.MemberAspectMemberAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# EStructuralFeature getMatchedFeature(EObject)
    if (_self instanceof org.etsi.mts.tdl.Member){
    	result = org.imt.k3tdl.k3dsa.MemberAspect._privk3_getMatchedFeature(_self_, (org.etsi.mts.tdl.Member)_self,rootElement);
    };
    return (org.eclipse.emf.ecore.EStructuralFeature)result;
  }

  public static String getValidName(final Member _self) {
    final org.imt.k3tdl.k3dsa.MemberAspectMemberAspectProperties _self_ = org.imt.k3tdl.k3dsa.MemberAspectMemberAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# String getValidName()
    if (_self instanceof org.etsi.mts.tdl.Member){
    	result = org.imt.k3tdl.k3dsa.MemberAspect._privk3_getValidName(_self_, (org.etsi.mts.tdl.Member)_self);
    };
    return (java.lang.String)result;
  }

  public static boolean isDynamicMember(final Member _self) {
    final org.imt.k3tdl.k3dsa.MemberAspectMemberAspectProperties _self_ = org.imt.k3tdl.k3dsa.MemberAspectMemberAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# boolean isDynamicMember()
    if (_self instanceof org.etsi.mts.tdl.Member){
    	result = org.imt.k3tdl.k3dsa.MemberAspect._privk3_isDynamicMember(_self_, (org.etsi.mts.tdl.Member)_self);
    };
    return (boolean)result;
  }

  protected static EStructuralFeature _privk3_getMatchedFeature(final MemberAspectMemberAspectProperties _self_, final Member _self, final EObject rootElement) {
    final Function1<EStructuralFeature, Boolean> _function = new Function1<EStructuralFeature, Boolean>() {
      public Boolean apply(final EStructuralFeature f) {
        return Boolean.valueOf(f.getName().equals(MemberAspect.getValidName(_self)));
      }
    };
    final EStructuralFeature matchedFeature = IterableExtensions.<EStructuralFeature>findFirst(rootElement.eClass().getEAllStructuralFeatures(), _function);
    return matchedFeature;
  }

  protected static String _privk3_getValidName(final MemberAspectMemberAspectProperties _self_, final Member _self) {
    String tdlName = _self.getName();
    boolean _startsWith = _self.getName().startsWith("_");
    if (_startsWith) {
      return tdlName.substring(1);
    }
    return tdlName;
  }

  protected static boolean _privk3_isDynamicMember(final MemberAspectMemberAspectProperties _self_, final Member _self) {
    int _size = _self.getAnnotation().size();
    ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _size, true);
    for (final Integer j : _doubleDotLessThan) {
      {
        final String annotation = _self.getAnnotation().get((j).intValue()).getKey().getName().toString();
        if ((annotation.contains("dynamic") || annotation.contains("aspect"))) {
          return true;
        }
      }
    }
    return false;
  }
}
