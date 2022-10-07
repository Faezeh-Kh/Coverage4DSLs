package org.imt.k3tdl.k3dsa;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.etsi.mts.tdl.SpecialValueUse;
import org.imt.tdl.testResult.TDLTestResultUtil;

@Aspect(className = SpecialValueUse.class)
@SuppressWarnings("all")
public class SpecialValueUseAspect extends StaticDataUseAspect {
  @OverrideAspectMethod
  public static String assertEquals(final SpecialValueUse _self, final Object featureValue) {
    final org.imt.k3tdl.k3dsa.SpecialValueUseAspectSpecialValueUseAspectProperties _self_ = org.imt.k3tdl.k3dsa.SpecialValueUseAspectSpecialValueUseAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# String assertEquals(Object)
    if (_self instanceof org.etsi.mts.tdl.SpecialValueUse){
    	result = org.imt.k3tdl.k3dsa.SpecialValueUseAspect._privk3_assertEquals(_self_, (org.etsi.mts.tdl.SpecialValueUse)_self,featureValue);
    };
    return (java.lang.String)result;
  }

  @OverrideAspectMethod
  public static String updateData(final SpecialValueUse _self, final EObject object, final EStructuralFeature matchedFeature) {
    final org.imt.k3tdl.k3dsa.SpecialValueUseAspectSpecialValueUseAspectProperties _self_ = org.imt.k3tdl.k3dsa.SpecialValueUseAspectSpecialValueUseAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# String updateData(EObject,EStructuralFeature)
    if (_self instanceof org.etsi.mts.tdl.SpecialValueUse){
    	result = org.imt.k3tdl.k3dsa.SpecialValueUseAspect._privk3_updateData(_self_, (org.etsi.mts.tdl.SpecialValueUse)_self,object,matchedFeature);
    };
    return (java.lang.String)result;
  }

  private static String super_assertEquals(final SpecialValueUse _self, final Object featureValue) {
    final org.imt.k3tdl.k3dsa.StaticDataUseAspectStaticDataUseAspectProperties _self_ = org.imt.k3tdl.k3dsa.StaticDataUseAspectStaticDataUseAspectContext.getSelf(_self);
    return  org.imt.k3tdl.k3dsa.StaticDataUseAspect._privk3_assertEquals(_self_, _self,featureValue);
  }

  protected static String _privk3_assertEquals(final SpecialValueUseAspectSpecialValueUseAspectProperties _self_, final SpecialValueUse _self, final Object featureValue) {
    return TDLTestResultUtil.PASS;
  }

  private static String super_updateData(final SpecialValueUse _self, final EObject object, final EStructuralFeature matchedFeature) {
    final org.imt.k3tdl.k3dsa.StaticDataUseAspectStaticDataUseAspectProperties _self_ = org.imt.k3tdl.k3dsa.StaticDataUseAspectStaticDataUseAspectContext.getSelf(_self);
    return  org.imt.k3tdl.k3dsa.StaticDataUseAspect._privk3_updateData(_self_, _self,object,matchedFeature);
  }

  protected static String _privk3_updateData(final SpecialValueUseAspectSpecialValueUseAspectProperties _self_, final SpecialValueUse _self, final EObject object, final EStructuralFeature matchedFeature) {
    return TDLTestResultUtil.PASS;
  }
}
