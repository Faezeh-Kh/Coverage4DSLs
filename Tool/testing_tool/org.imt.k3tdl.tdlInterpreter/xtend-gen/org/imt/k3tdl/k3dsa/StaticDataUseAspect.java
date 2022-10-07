package org.imt.k3tdl.k3dsa;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.etsi.mts.tdl.StaticDataUse;

@Aspect(className = StaticDataUse.class)
@SuppressWarnings("all")
public class StaticDataUseAspect extends DataUseAspect {
  @OverrideAspectMethod
  public static String assertEquals(final StaticDataUse _self, final Object featureValue) {
    final org.imt.k3tdl.k3dsa.StaticDataUseAspectStaticDataUseAspectProperties _self_ = org.imt.k3tdl.k3dsa.StaticDataUseAspectStaticDataUseAspectContext.getSelf(_self);
    Object result = null;
    	// BeginInjectInto org.imt.k3tdl.k3dsa.StaticDataUseAspect#String assertEquals(Object) from org.imt.k3tdl.k3dsa.LiteralValueUseAspect
    		if (_self instanceof org.etsi.mts.tdl.LiteralValueUse){
    			result = org.imt.k3tdl.k3dsa.LiteralValueUseAspect.assertEquals((org.etsi.mts.tdl.LiteralValueUse)_self,featureValue);
    		} else
    		// EndInjectInto org.imt.k3tdl.k3dsa.StaticDataUseAspect#String assertEquals(Object) from org.imt.k3tdl.k3dsa.LiteralValueUseAspect
    	// BeginInjectInto org.imt.k3tdl.k3dsa.StaticDataUseAspect#String assertEquals(Object) from org.imt.k3tdl.k3dsa.SpecialValueUseAspect
    		if (_self instanceof org.etsi.mts.tdl.SpecialValueUse){
    			result = org.imt.k3tdl.k3dsa.SpecialValueUseAspect.assertEquals((org.etsi.mts.tdl.SpecialValueUse)_self,featureValue);
    		} else
    		// EndInjectInto org.imt.k3tdl.k3dsa.StaticDataUseAspect#String assertEquals(Object) from org.imt.k3tdl.k3dsa.SpecialValueUseAspect
    // #DispatchPointCut_before# String assertEquals(Object)
    if (_self instanceof org.etsi.mts.tdl.StaticDataUse){
    	result = org.imt.k3tdl.k3dsa.StaticDataUseAspect._privk3_assertEquals(_self_, (org.etsi.mts.tdl.StaticDataUse)_self,featureValue);
    };
    return (java.lang.String)result;
  }

  @OverrideAspectMethod
  public static String assertEquals(final StaticDataUse _self, final Resource MUTResource, final Object featureValue, final Boolean isAssertion, final String DSLPath) {
    final org.imt.k3tdl.k3dsa.StaticDataUseAspectStaticDataUseAspectProperties _self_ = org.imt.k3tdl.k3dsa.StaticDataUseAspectStaticDataUseAspectContext.getSelf(_self);
    Object result = null;
    	// BeginInjectInto org.imt.k3tdl.k3dsa.StaticDataUseAspect#String assertEquals(Resource,Object,Boolean,String) from org.imt.k3tdl.k3dsa.DataInstanceUseAspect
    		if (_self instanceof org.etsi.mts.tdl.DataInstanceUse){
    			result = org.imt.k3tdl.k3dsa.DataInstanceUseAspect.assertEquals((org.etsi.mts.tdl.DataInstanceUse)_self,MUTResource,featureValue,isAssertion,DSLPath);
    		} else
    		// EndInjectInto org.imt.k3tdl.k3dsa.StaticDataUseAspect#String assertEquals(Resource,Object,Boolean,String) from org.imt.k3tdl.k3dsa.DataInstanceUseAspect
    // #DispatchPointCut_before# String assertEquals(Resource,Object,Boolean,String)
    if (_self instanceof org.etsi.mts.tdl.StaticDataUse){
    	result = org.imt.k3tdl.k3dsa.StaticDataUseAspect._privk3_assertEquals(_self_, (org.etsi.mts.tdl.StaticDataUse)_self,MUTResource,featureValue,isAssertion,DSLPath);
    };
    return (java.lang.String)result;
  }

  @OverrideAspectMethod
  public static String updateData(final StaticDataUse _self, final EObject object, final EStructuralFeature matchedFeature) {
    final org.imt.k3tdl.k3dsa.StaticDataUseAspectStaticDataUseAspectProperties _self_ = org.imt.k3tdl.k3dsa.StaticDataUseAspectStaticDataUseAspectContext.getSelf(_self);
    Object result = null;
    	// BeginInjectInto org.imt.k3tdl.k3dsa.StaticDataUseAspect#String updateData(EObject,EStructuralFeature) from org.imt.k3tdl.k3dsa.SpecialValueUseAspect
    		if (_self instanceof org.etsi.mts.tdl.SpecialValueUse){
    			result = org.imt.k3tdl.k3dsa.SpecialValueUseAspect.updateData((org.etsi.mts.tdl.SpecialValueUse)_self,object,matchedFeature);
    		} else
    		// EndInjectInto org.imt.k3tdl.k3dsa.StaticDataUseAspect#String updateData(EObject,EStructuralFeature) from org.imt.k3tdl.k3dsa.SpecialValueUseAspect
    	// BeginInjectInto org.imt.k3tdl.k3dsa.StaticDataUseAspect#String updateData(EObject,EStructuralFeature) from org.imt.k3tdl.k3dsa.LiteralValueUseAspect
    		if (_self instanceof org.etsi.mts.tdl.LiteralValueUse){
    			result = org.imt.k3tdl.k3dsa.LiteralValueUseAspect.updateData((org.etsi.mts.tdl.LiteralValueUse)_self,object,matchedFeature);
    		} else
    		// EndInjectInto org.imt.k3tdl.k3dsa.StaticDataUseAspect#String updateData(EObject,EStructuralFeature) from org.imt.k3tdl.k3dsa.LiteralValueUseAspect
    // #DispatchPointCut_before# String updateData(EObject,EStructuralFeature)
    if (_self instanceof org.etsi.mts.tdl.StaticDataUse){
    	result = org.imt.k3tdl.k3dsa.StaticDataUseAspect._privk3_updateData(_self_, (org.etsi.mts.tdl.StaticDataUse)_self,object,matchedFeature);
    };
    return (java.lang.String)result;
  }

  @OverrideAspectMethod
  public static String updateData(final StaticDataUse _self, final Resource MUTResource, final EObject object, final EStructuralFeature matchedFeature, final String DSLPath) {
    final org.imt.k3tdl.k3dsa.StaticDataUseAspectStaticDataUseAspectProperties _self_ = org.imt.k3tdl.k3dsa.StaticDataUseAspectStaticDataUseAspectContext.getSelf(_self);
    Object result = null;
    	// BeginInjectInto org.imt.k3tdl.k3dsa.StaticDataUseAspect#String updateData(Resource,EObject,EStructuralFeature,String) from org.imt.k3tdl.k3dsa.DataInstanceUseAspect
    		if (_self instanceof org.etsi.mts.tdl.DataInstanceUse){
    			result = org.imt.k3tdl.k3dsa.DataInstanceUseAspect.updateData((org.etsi.mts.tdl.DataInstanceUse)_self,MUTResource,object,matchedFeature,DSLPath);
    		} else
    		// EndInjectInto org.imt.k3tdl.k3dsa.StaticDataUseAspect#String updateData(Resource,EObject,EStructuralFeature,String) from org.imt.k3tdl.k3dsa.DataInstanceUseAspect
    // #DispatchPointCut_before# String updateData(Resource,EObject,EStructuralFeature,String)
    if (_self instanceof org.etsi.mts.tdl.StaticDataUse){
    	result = org.imt.k3tdl.k3dsa.StaticDataUseAspect._privk3_updateData(_self_, (org.etsi.mts.tdl.StaticDataUse)_self,MUTResource,object,matchedFeature,DSLPath);
    };
    return (java.lang.String)result;
  }

  private static String super_assertEquals(final StaticDataUse _self, final Object featureValue) {
    final org.imt.k3tdl.k3dsa.DataUseAspectDataUseAspectProperties _self_ = org.imt.k3tdl.k3dsa.DataUseAspectDataUseAspectContext.getSelf(_self);
    return  org.imt.k3tdl.k3dsa.DataUseAspect._privk3_assertEquals(_self_, _self,featureValue);
  }

  protected static String _privk3_assertEquals(final StaticDataUseAspectStaticDataUseAspectProperties _self_, final StaticDataUse _self, final Object featureValue) {
    return "";
  }

  private static String super_assertEquals(final StaticDataUse _self, final Resource MUTResource, final Object featureValue, final Boolean isAssertion, final String DSLPath) {
    final org.imt.k3tdl.k3dsa.DataUseAspectDataUseAspectProperties _self_ = org.imt.k3tdl.k3dsa.DataUseAspectDataUseAspectContext.getSelf(_self);
    return  org.imt.k3tdl.k3dsa.DataUseAspect._privk3_assertEquals(_self_, _self,MUTResource,featureValue,isAssertion,DSLPath);
  }

  protected static String _privk3_assertEquals(final StaticDataUseAspectStaticDataUseAspectProperties _self_, final StaticDataUse _self, final Resource MUTResource, final Object featureValue, final Boolean isAssertion, final String DSLPath) {
    return "";
  }

  private static String super_updateData(final StaticDataUse _self, final EObject object, final EStructuralFeature matchedFeature) {
    final org.imt.k3tdl.k3dsa.DataUseAspectDataUseAspectProperties _self_ = org.imt.k3tdl.k3dsa.DataUseAspectDataUseAspectContext.getSelf(_self);
    return  org.imt.k3tdl.k3dsa.DataUseAspect._privk3_updateData(_self_, _self,object,matchedFeature);
  }

  protected static String _privk3_updateData(final StaticDataUseAspectStaticDataUseAspectProperties _self_, final StaticDataUse _self, final EObject object, final EStructuralFeature matchedFeature) {
    return "";
  }

  private static String super_updateData(final StaticDataUse _self, final Resource MUTResource, final EObject object, final EStructuralFeature matchedFeature, final String DSLPath) {
    final org.imt.k3tdl.k3dsa.DataUseAspectDataUseAspectProperties _self_ = org.imt.k3tdl.k3dsa.DataUseAspectDataUseAspectContext.getSelf(_self);
    return  org.imt.k3tdl.k3dsa.DataUseAspect._privk3_updateData(_self_, _self,MUTResource,object,matchedFeature,DSLPath);
  }

  protected static String _privk3_updateData(final StaticDataUseAspectStaticDataUseAspectProperties _self_, final StaticDataUse _self, final Resource MUTResource, final EObject object, final EStructuralFeature matchedFeature, final String DSLPath) {
    return "";
  }
}
