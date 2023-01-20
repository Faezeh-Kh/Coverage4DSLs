package org.imt.k3tdl.k3dsa;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.etsi.mts.tdl.DataInstanceUse;
import org.etsi.mts.tdl.DataUse;
import org.etsi.mts.tdl.MemberAssignment;
import org.imt.tdl.testResult.TDLTestResultUtil;

@Aspect(className = MemberAssignment.class)
@SuppressWarnings("all")
public class MemberAssignmentAspect {
  public static String isMatchedMember(final MemberAssignment _self, final EObject rootElement, final Resource MUTResource, final Boolean isAssertion, final String DSLPath) {
    final org.imt.k3tdl.k3dsa.MemberAssignmentAspectMemberAssignmentAspectProperties _self_ = org.imt.k3tdl.k3dsa.MemberAssignmentAspectMemberAssignmentAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# String isMatchedMember(EObject,Resource,Boolean,String)
    if (_self instanceof org.etsi.mts.tdl.MemberAssignment){
    	result = org.imt.k3tdl.k3dsa.MemberAssignmentAspect._privk3_isMatchedMember(_self_, (org.etsi.mts.tdl.MemberAssignment)_self,rootElement,MUTResource,isAssertion,DSLPath);
    };
    return (java.lang.String)result;
  }

  public static String setMatchedMember(final MemberAssignment _self, final EObject rootElement, final Resource MUTResource, final String DSLPath) {
    final org.imt.k3tdl.k3dsa.MemberAssignmentAspectMemberAssignmentAspectProperties _self_ = org.imt.k3tdl.k3dsa.MemberAssignmentAspectMemberAssignmentAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# String setMatchedMember(EObject,Resource,String)
    if (_self instanceof org.etsi.mts.tdl.MemberAssignment){
    	result = org.imt.k3tdl.k3dsa.MemberAssignmentAspect._privk3_setMatchedMember(_self_, (org.etsi.mts.tdl.MemberAssignment)_self,rootElement,MUTResource,DSLPath);
    };
    return (java.lang.String)result;
  }

  public static Boolean hasItems(final MemberAssignment _self) {
    final org.imt.k3tdl.k3dsa.MemberAssignmentAspectMemberAssignmentAspectProperties _self_ = org.imt.k3tdl.k3dsa.MemberAssignmentAspectMemberAssignmentAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Boolean hasItems()
    if (_self instanceof org.etsi.mts.tdl.MemberAssignment){
    	result = org.imt.k3tdl.k3dsa.MemberAssignmentAspect._privk3_hasItems(_self_, (org.etsi.mts.tdl.MemberAssignment)_self);
    };
    return (java.lang.Boolean)result;
  }

  protected static String _privk3_isMatchedMember(final MemberAssignmentAspectMemberAssignmentAspectProperties _self_, final MemberAssignment _self, final EObject rootElement, final Resource MUTResource, final Boolean isAssertion, final String DSLPath) {
    final EStructuralFeature matchedFeature = MemberAspect.getMatchedFeature(_self.getMember(), rootElement);
    if ((matchedFeature == null)) {
      String _name = _self.getMember().getName();
      return ((TDLTestResultUtil.FAIL + ": There is no MUT element matched with ") + _name);
    }
    final Object featureValue = rootElement.eGet(matchedFeature);
    if (((!(isAssertion).booleanValue()) && MemberAspect.isDynamicMember(_self.getMember()))) {
      return TDLTestResultUtil.PASS;
    }
    DataUse _memberSpec = _self.getMemberSpec();
    if ((_memberSpec instanceof DataInstanceUse)) {
      return DataUseAspect.assertEquals(_self.getMemberSpec(), MUTResource, featureValue, isAssertion, DSLPath);
    }
    return DataUseAspect.assertEquals(_self.getMemberSpec(), featureValue);
  }

  protected static String _privk3_setMatchedMember(final MemberAssignmentAspectMemberAssignmentAspectProperties _self_, final MemberAssignment _self, final EObject rootElement, final Resource MUTResource, final String DSLPath) {
    final EStructuralFeature matchedFeature = MemberAspect.getMatchedFeature(_self.getMember(), rootElement);
    DataUse _memberSpec = _self.getMemberSpec();
    if ((_memberSpec instanceof DataInstanceUse)) {
      return DataUseAspect.updateData(_self.getMemberSpec(), MUTResource, rootElement, matchedFeature, DSLPath);
    }
    return DataUseAspect.updateData(_self.getMemberSpec(), rootElement, matchedFeature);
  }

  protected static Boolean _privk3_hasItems(final MemberAssignmentAspectMemberAssignmentAspectProperties _self_, final MemberAssignment _self) {
    DataUse _memberSpec = _self.getMemberSpec();
    final DataInstanceUse data = ((DataInstanceUse) _memberSpec);
    if (((data.getItem() != null) && (data.getItem().size() > 0))) {
      return Boolean.valueOf(true);
    }
    return Boolean.valueOf(false);
  }
}
