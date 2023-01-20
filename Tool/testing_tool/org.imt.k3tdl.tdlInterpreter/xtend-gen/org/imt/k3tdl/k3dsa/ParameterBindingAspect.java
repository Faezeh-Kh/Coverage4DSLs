package org.imt.k3tdl.k3dsa;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.etsi.mts.tdl.DataInstanceUse;
import org.etsi.mts.tdl.DataUse;
import org.etsi.mts.tdl.Member;
import org.etsi.mts.tdl.Parameter;
import org.etsi.mts.tdl.ParameterBinding;
import org.imt.tdl.testResult.TDLTestResultUtil;

@Aspect(className = ParameterBinding.class)
@SuppressWarnings("all")
public class ParameterBindingAspect {
  public static String isMatchedParameter(final ParameterBinding _self, final EObject rootElement, final Resource MUTResource, final Boolean isAssertion, final String DSLPath) {
    final org.imt.k3tdl.k3dsa.ParameterBindingAspectParameterBindingAspectProperties _self_ = org.imt.k3tdl.k3dsa.ParameterBindingAspectParameterBindingAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# String isMatchedParameter(EObject,Resource,Boolean,String)
    if (_self instanceof org.etsi.mts.tdl.ParameterBinding){
    	result = org.imt.k3tdl.k3dsa.ParameterBindingAspect._privk3_isMatchedParameter(_self_, (org.etsi.mts.tdl.ParameterBinding)_self,rootElement,MUTResource,isAssertion,DSLPath);
    };
    return (java.lang.String)result;
  }

  public static String setMatchedParameter(final ParameterBinding _self, final EObject rootElement, final Resource MUTResource, final String DSLPath) {
    final org.imt.k3tdl.k3dsa.ParameterBindingAspectParameterBindingAspectProperties _self_ = org.imt.k3tdl.k3dsa.ParameterBindingAspectParameterBindingAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# String setMatchedParameter(EObject,Resource,String)
    if (_self instanceof org.etsi.mts.tdl.ParameterBinding){
    	result = org.imt.k3tdl.k3dsa.ParameterBindingAspect._privk3_setMatchedParameter(_self_, (org.etsi.mts.tdl.ParameterBinding)_self,rootElement,MUTResource,DSLPath);
    };
    return (java.lang.String)result;
  }

  public static Boolean hasItems(final ParameterBinding _self) {
    final org.imt.k3tdl.k3dsa.ParameterBindingAspectParameterBindingAspectProperties _self_ = org.imt.k3tdl.k3dsa.ParameterBindingAspectParameterBindingAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Boolean hasItems()
    if (_self instanceof org.etsi.mts.tdl.ParameterBinding){
    	result = org.imt.k3tdl.k3dsa.ParameterBindingAspect._privk3_hasItems(_self_, (org.etsi.mts.tdl.ParameterBinding)_self);
    };
    return (java.lang.Boolean)result;
  }

  protected static String _privk3_isMatchedParameter(final ParameterBindingAspectParameterBindingAspectProperties _self_, final ParameterBinding _self, final EObject rootElement, final Resource MUTResource, final Boolean isAssertion, final String DSLPath) {
    Parameter _parameter = _self.getParameter();
    final EStructuralFeature matchedFeature = MemberAspect.getMatchedFeature(((Member) _parameter), rootElement);
    if ((matchedFeature == null)) {
      String _name = _self.getParameter().getName();
      return ((TDLTestResultUtil.FAIL + ": There is no MUT element matched with ") + _name);
    }
    final Object featureValue = rootElement.eGet(matchedFeature);
    if (((!(isAssertion).booleanValue()) && MemberAspect.isDynamicMember(((Member) _self.getParameter())))) {
      return TDLTestResultUtil.PASS;
    }
    DataUse _dataUse = _self.getDataUse();
    if ((_dataUse instanceof DataInstanceUse)) {
      return DataUseAspect.assertEquals(_self.getDataUse(), MUTResource, featureValue, isAssertion, DSLPath);
    }
    return DataUseAspect.assertEquals(_self.getDataUse(), featureValue);
  }

  protected static String _privk3_setMatchedParameter(final ParameterBindingAspectParameterBindingAspectProperties _self_, final ParameterBinding _self, final EObject rootElement, final Resource MUTResource, final String DSLPath) {
    Parameter _parameter = _self.getParameter();
    final EStructuralFeature matchedFeature = MemberAspect.getMatchedFeature(((Member) _parameter), rootElement);
    DataUse _dataUse = _self.getDataUse();
    if ((_dataUse instanceof DataInstanceUse)) {
      return DataUseAspect.updateData(_self.getDataUse(), MUTResource, rootElement, matchedFeature, DSLPath);
    }
    return DataUseAspect.updateData(_self.getDataUse(), rootElement, matchedFeature);
  }

  protected static Boolean _privk3_hasItems(final ParameterBindingAspectParameterBindingAspectProperties _self_, final ParameterBinding _self) {
    DataUse _dataUse = _self.getDataUse();
    final DataInstanceUse data = ((DataInstanceUse) _dataUse);
    if (((data.getItem() != null) && (data.getItem().size() > 0))) {
      return Boolean.valueOf(true);
    }
    return Boolean.valueOf(false);
  }
}
