package org.imt.k3tdl.k3dsa;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.etsi.mts.tdl.DataUse;

@Aspect(className = DataUse.class)
@SuppressWarnings("all")
public class DataUseAspect {
  public static String assertEquals(final DataUse _self, final Object featureValue) {
    final org.imt.k3tdl.k3dsa.DataUseAspectDataUseAspectProperties _self_ = org.imt.k3tdl.k3dsa.DataUseAspectDataUseAspectContext.getSelf(_self);
    Object result = null;
    	// BeginInjectInto org.imt.k3tdl.k3dsa.DataUseAspect#String assertEquals(Object) from org.imt.k3tdl.k3dsa.StaticDataUseAspect
    		if (_self instanceof org.etsi.mts.tdl.StaticDataUse){
    			result = org.imt.k3tdl.k3dsa.StaticDataUseAspect.assertEquals((org.etsi.mts.tdl.StaticDataUse)_self,featureValue);
    		} else
    		// EndInjectInto org.imt.k3tdl.k3dsa.DataUseAspect#String assertEquals(Object) from org.imt.k3tdl.k3dsa.StaticDataUseAspect
    	// BeginInjectInto org.imt.k3tdl.k3dsa.DataUseAspect#String assertEquals(Object) from org.imt.k3tdl.k3dsa.LiteralValueUseAspect
    		if (_self instanceof org.etsi.mts.tdl.LiteralValueUse){
    			result = org.imt.k3tdl.k3dsa.LiteralValueUseAspect.assertEquals((org.etsi.mts.tdl.LiteralValueUse)_self,featureValue);
    		} else
    		// EndInjectInto org.imt.k3tdl.k3dsa.DataUseAspect#String assertEquals(Object) from org.imt.k3tdl.k3dsa.LiteralValueUseAspect
    	// BeginInjectInto org.imt.k3tdl.k3dsa.DataUseAspect#String assertEquals(Object) from org.imt.k3tdl.k3dsa.SpecialValueUseAspect
    		if (_self instanceof org.etsi.mts.tdl.SpecialValueUse){
    			result = org.imt.k3tdl.k3dsa.SpecialValueUseAspect.assertEquals((org.etsi.mts.tdl.SpecialValueUse)_self,featureValue);
    		} else
    		// EndInjectInto org.imt.k3tdl.k3dsa.DataUseAspect#String assertEquals(Object) from org.imt.k3tdl.k3dsa.SpecialValueUseAspect
    // #DispatchPointCut_before# String assertEquals(Object)
    if (_self instanceof org.etsi.mts.tdl.DataUse){
    	result = org.imt.k3tdl.k3dsa.DataUseAspect._privk3_assertEquals(_self_, (org.etsi.mts.tdl.DataUse)_self,featureValue);
    };
    return (java.lang.String)result;
  }

  public static String assertEquals(final DataUse _self, final Resource MUTResource, final Object featureValue, final Boolean isAssertion, final String DSLPath) {
    final org.imt.k3tdl.k3dsa.DataUseAspectDataUseAspectProperties _self_ = org.imt.k3tdl.k3dsa.DataUseAspectDataUseAspectContext.getSelf(_self);
    Object result = null;
    	// BeginInjectInto org.imt.k3tdl.k3dsa.DataUseAspect#String assertEquals(Resource,Object,Boolean,String) from org.imt.k3tdl.k3dsa.StaticDataUseAspect
    		if (_self instanceof org.etsi.mts.tdl.StaticDataUse){
    			result = org.imt.k3tdl.k3dsa.StaticDataUseAspect.assertEquals((org.etsi.mts.tdl.StaticDataUse)_self,MUTResource,featureValue,isAssertion,DSLPath);
    		} else
    		// EndInjectInto org.imt.k3tdl.k3dsa.DataUseAspect#String assertEquals(Resource,Object,Boolean,String) from org.imt.k3tdl.k3dsa.StaticDataUseAspect
    	// BeginInjectInto org.imt.k3tdl.k3dsa.DataUseAspect#String assertEquals(Resource,Object,Boolean,String) from org.imt.k3tdl.k3dsa.DataInstanceUseAspect
    		if (_self instanceof org.etsi.mts.tdl.DataInstanceUse){
    			result = org.imt.k3tdl.k3dsa.DataInstanceUseAspect.assertEquals((org.etsi.mts.tdl.DataInstanceUse)_self,MUTResource,featureValue,isAssertion,DSLPath);
    		} else
    		// EndInjectInto org.imt.k3tdl.k3dsa.DataUseAspect#String assertEquals(Resource,Object,Boolean,String) from org.imt.k3tdl.k3dsa.DataInstanceUseAspect
    // #DispatchPointCut_before# String assertEquals(Resource,Object,Boolean,String)
    if (_self instanceof org.etsi.mts.tdl.DataUse){
    	result = org.imt.k3tdl.k3dsa.DataUseAspect._privk3_assertEquals(_self_, (org.etsi.mts.tdl.DataUse)_self,MUTResource,featureValue,isAssertion,DSLPath);
    };
    return (java.lang.String)result;
  }

  public static String updateData(final DataUse _self, final EObject object, final EStructuralFeature matchedFeature) {
    final org.imt.k3tdl.k3dsa.DataUseAspectDataUseAspectProperties _self_ = org.imt.k3tdl.k3dsa.DataUseAspectDataUseAspectContext.getSelf(_self);
    Object result = null;
    	// BeginInjectInto org.imt.k3tdl.k3dsa.DataUseAspect#String updateData(EObject,EStructuralFeature) from org.imt.k3tdl.k3dsa.SpecialValueUseAspect
    		if (_self instanceof org.etsi.mts.tdl.SpecialValueUse){
    			result = org.imt.k3tdl.k3dsa.SpecialValueUseAspect.updateData((org.etsi.mts.tdl.SpecialValueUse)_self,object,matchedFeature);
    		} else
    		// EndInjectInto org.imt.k3tdl.k3dsa.DataUseAspect#String updateData(EObject,EStructuralFeature) from org.imt.k3tdl.k3dsa.SpecialValueUseAspect
    	// BeginInjectInto org.imt.k3tdl.k3dsa.DataUseAspect#String updateData(EObject,EStructuralFeature) from org.imt.k3tdl.k3dsa.StaticDataUseAspect
    		if (_self instanceof org.etsi.mts.tdl.StaticDataUse){
    			result = org.imt.k3tdl.k3dsa.StaticDataUseAspect.updateData((org.etsi.mts.tdl.StaticDataUse)_self,object,matchedFeature);
    		} else
    		// EndInjectInto org.imt.k3tdl.k3dsa.DataUseAspect#String updateData(EObject,EStructuralFeature) from org.imt.k3tdl.k3dsa.StaticDataUseAspect
    	// BeginInjectInto org.imt.k3tdl.k3dsa.DataUseAspect#String updateData(EObject,EStructuralFeature) from org.imt.k3tdl.k3dsa.LiteralValueUseAspect
    		if (_self instanceof org.etsi.mts.tdl.LiteralValueUse){
    			result = org.imt.k3tdl.k3dsa.LiteralValueUseAspect.updateData((org.etsi.mts.tdl.LiteralValueUse)_self,object,matchedFeature);
    		} else
    		// EndInjectInto org.imt.k3tdl.k3dsa.DataUseAspect#String updateData(EObject,EStructuralFeature) from org.imt.k3tdl.k3dsa.LiteralValueUseAspect
    // #DispatchPointCut_before# String updateData(EObject,EStructuralFeature)
    if (_self instanceof org.etsi.mts.tdl.DataUse){
    	result = org.imt.k3tdl.k3dsa.DataUseAspect._privk3_updateData(_self_, (org.etsi.mts.tdl.DataUse)_self,object,matchedFeature);
    };
    return (java.lang.String)result;
  }

  public static String updateData(final DataUse _self, final Resource MUTResource, final EObject object, final EStructuralFeature matchedFeature, final String DSLPath) {
    final org.imt.k3tdl.k3dsa.DataUseAspectDataUseAspectProperties _self_ = org.imt.k3tdl.k3dsa.DataUseAspectDataUseAspectContext.getSelf(_self);
    Object result = null;
    	// BeginInjectInto org.imt.k3tdl.k3dsa.DataUseAspect#String updateData(Resource,EObject,EStructuralFeature,String) from org.imt.k3tdl.k3dsa.DataInstanceUseAspect
    		if (_self instanceof org.etsi.mts.tdl.DataInstanceUse){
    			result = org.imt.k3tdl.k3dsa.DataInstanceUseAspect.updateData((org.etsi.mts.tdl.DataInstanceUse)_self,MUTResource,object,matchedFeature,DSLPath);
    		} else
    		// EndInjectInto org.imt.k3tdl.k3dsa.DataUseAspect#String updateData(Resource,EObject,EStructuralFeature,String) from org.imt.k3tdl.k3dsa.DataInstanceUseAspect
    	// BeginInjectInto org.imt.k3tdl.k3dsa.DataUseAspect#String updateData(Resource,EObject,EStructuralFeature,String) from org.imt.k3tdl.k3dsa.StaticDataUseAspect
    		if (_self instanceof org.etsi.mts.tdl.StaticDataUse){
    			result = org.imt.k3tdl.k3dsa.StaticDataUseAspect.updateData((org.etsi.mts.tdl.StaticDataUse)_self,MUTResource,object,matchedFeature,DSLPath);
    		} else
    		// EndInjectInto org.imt.k3tdl.k3dsa.DataUseAspect#String updateData(Resource,EObject,EStructuralFeature,String) from org.imt.k3tdl.k3dsa.StaticDataUseAspect
    // #DispatchPointCut_before# String updateData(Resource,EObject,EStructuralFeature,String)
    if (_self instanceof org.etsi.mts.tdl.DataUse){
    	result = org.imt.k3tdl.k3dsa.DataUseAspect._privk3_updateData(_self_, (org.etsi.mts.tdl.DataUse)_self,MUTResource,object,matchedFeature,DSLPath);
    };
    return (java.lang.String)result;
  }

  protected static String _privk3_assertEquals(final DataUseAspectDataUseAspectProperties _self_, final DataUse _self, final Object featureValue) {
    return "";
  }

  protected static String _privk3_assertEquals(final DataUseAspectDataUseAspectProperties _self_, final DataUse _self, final Resource MUTResource, final Object featureValue, final Boolean isAssertion, final String DSLPath) {
    return "";
  }

  protected static String _privk3_updateData(final DataUseAspectDataUseAspectProperties _self_, final DataUse _self, final EObject object, final EStructuralFeature matchedFeature) {
    return "";
  }

  protected static String _privk3_updateData(final DataUseAspectDataUseAspectProperties _self_, final DataUse _self, final Resource MUTResource, final EObject object, final EStructuralFeature matchedFeature, final String DSLPath) {
    return "";
  }
}