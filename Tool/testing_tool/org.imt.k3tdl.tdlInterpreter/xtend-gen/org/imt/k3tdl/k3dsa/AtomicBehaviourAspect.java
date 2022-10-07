package org.imt.k3tdl.k3dsa;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.etsi.mts.tdl.AtomicBehaviour;

@Aspect(className = AtomicBehaviour.class)
@SuppressWarnings("all")
public class AtomicBehaviourAspect extends BehaviourAspect {
  @OverrideAspectMethod
  public static boolean performBehavior(final AtomicBehaviour _self) {
    final org.imt.k3tdl.k3dsa.AtomicBehaviourAspectAtomicBehaviourAspectProperties _self_ = org.imt.k3tdl.k3dsa.AtomicBehaviourAspectAtomicBehaviourAspectContext.getSelf(_self);
    Object result = null;
    	// BeginInjectInto org.imt.k3tdl.k3dsa.AtomicBehaviourAspect#boolean performBehavior() from org.imt.k3tdl.k3dsa.ActionReferenceAspect
    		if (_self instanceof org.etsi.mts.tdl.ActionReference){
    			result = org.imt.k3tdl.k3dsa.ActionReferenceAspect.performBehavior((org.etsi.mts.tdl.ActionReference)_self);
    		} else
    		// EndInjectInto org.imt.k3tdl.k3dsa.AtomicBehaviourAspect#boolean performBehavior() from org.imt.k3tdl.k3dsa.ActionReferenceAspect
    	// BeginInjectInto org.imt.k3tdl.k3dsa.AtomicBehaviourAspect#boolean performBehavior() from org.imt.k3tdl.k3dsa.TimeOutAspect
    		if (_self instanceof org.etsi.mts.tdl.TimeOut){
    			result = org.imt.k3tdl.k3dsa.TimeOutAspect.performBehavior((org.etsi.mts.tdl.TimeOut)_self);
    		} else
    		// EndInjectInto org.imt.k3tdl.k3dsa.AtomicBehaviourAspect#boolean performBehavior() from org.imt.k3tdl.k3dsa.TimeOutAspect
    	// BeginInjectInto org.imt.k3tdl.k3dsa.AtomicBehaviourAspect#boolean performBehavior() from org.imt.k3tdl.k3dsa.TimerStopAspect
    		if (_self instanceof org.etsi.mts.tdl.TimerStop){
    			result = org.imt.k3tdl.k3dsa.TimerStopAspect.performBehavior((org.etsi.mts.tdl.TimerStop)_self);
    		} else
    		// EndInjectInto org.imt.k3tdl.k3dsa.AtomicBehaviourAspect#boolean performBehavior() from org.imt.k3tdl.k3dsa.TimerStopAspect
    	// BeginInjectInto org.imt.k3tdl.k3dsa.AtomicBehaviourAspect#boolean performBehavior() from org.imt.k3tdl.k3dsa.ProcedureCallAspect
    		if (_self instanceof org.etsi.mts.tdl.ProcedureCall){
    			result = org.imt.k3tdl.k3dsa.ProcedureCallAspect.performBehavior((org.etsi.mts.tdl.ProcedureCall)_self);
    		} else
    		// EndInjectInto org.imt.k3tdl.k3dsa.AtomicBehaviourAspect#boolean performBehavior() from org.imt.k3tdl.k3dsa.ProcedureCallAspect
    	// BeginInjectInto org.imt.k3tdl.k3dsa.AtomicBehaviourAspect#boolean performBehavior() from org.imt.k3tdl.k3dsa.BreakAspect
    		if (_self instanceof org.etsi.mts.tdl.Break){
    			result = org.imt.k3tdl.k3dsa.BreakAspect.performBehavior((org.etsi.mts.tdl.Break)_self);
    		} else
    		// EndInjectInto org.imt.k3tdl.k3dsa.AtomicBehaviourAspect#boolean performBehavior() from org.imt.k3tdl.k3dsa.BreakAspect
    	// BeginInjectInto org.imt.k3tdl.k3dsa.AtomicBehaviourAspect#boolean performBehavior() from org.imt.k3tdl.k3dsa.TestDescriptionReferenceAspect
    		if (_self instanceof org.etsi.mts.tdl.TestDescriptionReference){
    			result = org.imt.k3tdl.k3dsa.TestDescriptionReferenceAspect.performBehavior((org.etsi.mts.tdl.TestDescriptionReference)_self);
    		} else
    		// EndInjectInto org.imt.k3tdl.k3dsa.AtomicBehaviourAspect#boolean performBehavior() from org.imt.k3tdl.k3dsa.TestDescriptionReferenceAspect
    	// BeginInjectInto org.imt.k3tdl.k3dsa.AtomicBehaviourAspect#boolean performBehavior() from org.imt.k3tdl.k3dsa.TimerStartAspect
    		if (_self instanceof org.etsi.mts.tdl.TimerStart){
    			result = org.imt.k3tdl.k3dsa.TimerStartAspect.performBehavior((org.etsi.mts.tdl.TimerStart)_self);
    		} else
    		// EndInjectInto org.imt.k3tdl.k3dsa.AtomicBehaviourAspect#boolean performBehavior() from org.imt.k3tdl.k3dsa.TimerStartAspect
    	// BeginInjectInto org.imt.k3tdl.k3dsa.AtomicBehaviourAspect#boolean performBehavior() from org.imt.k3tdl.k3dsa.QuiescenceAspect
    		if (_self instanceof org.etsi.mts.tdl.Quiescence){
    			result = org.imt.k3tdl.k3dsa.QuiescenceAspect.performBehavior((org.etsi.mts.tdl.Quiescence)_self);
    		} else
    		// EndInjectInto org.imt.k3tdl.k3dsa.AtomicBehaviourAspect#boolean performBehavior() from org.imt.k3tdl.k3dsa.QuiescenceAspect
    	// BeginInjectInto org.imt.k3tdl.k3dsa.AtomicBehaviourAspect#boolean performBehavior() from org.imt.k3tdl.k3dsa.ActionBehaviourAspect
    		if (_self instanceof org.etsi.mts.tdl.ActionBehaviour){
    			result = org.imt.k3tdl.k3dsa.ActionBehaviourAspect.performBehavior((org.etsi.mts.tdl.ActionBehaviour)_self);
    		} else
    		// EndInjectInto org.imt.k3tdl.k3dsa.AtomicBehaviourAspect#boolean performBehavior() from org.imt.k3tdl.k3dsa.ActionBehaviourAspect
    	// BeginInjectInto org.imt.k3tdl.k3dsa.AtomicBehaviourAspect#boolean performBehavior() from org.imt.k3tdl.k3dsa.TimerOperationAspect
    		if (_self instanceof org.etsi.mts.tdl.TimerOperation){
    			result = org.imt.k3tdl.k3dsa.TimerOperationAspect.performBehavior((org.etsi.mts.tdl.TimerOperation)_self);
    		} else
    		// EndInjectInto org.imt.k3tdl.k3dsa.AtomicBehaviourAspect#boolean performBehavior() from org.imt.k3tdl.k3dsa.TimerOperationAspect
    	// BeginInjectInto org.imt.k3tdl.k3dsa.AtomicBehaviourAspect#boolean performBehavior() from org.imt.k3tdl.k3dsa.StopAspect
    		if (_self instanceof org.etsi.mts.tdl.Stop){
    			result = org.imt.k3tdl.k3dsa.StopAspect.performBehavior((org.etsi.mts.tdl.Stop)_self);
    		} else
    		// EndInjectInto org.imt.k3tdl.k3dsa.AtomicBehaviourAspect#boolean performBehavior() from org.imt.k3tdl.k3dsa.StopAspect
    	// BeginInjectInto org.imt.k3tdl.k3dsa.AtomicBehaviourAspect#boolean performBehavior() from org.imt.k3tdl.k3dsa.AssignmentAspect
    		if (_self instanceof org.etsi.mts.tdl.Assignment){
    			result = org.imt.k3tdl.k3dsa.AssignmentAspect.performBehavior((org.etsi.mts.tdl.Assignment)_self);
    		} else
    		// EndInjectInto org.imt.k3tdl.k3dsa.AtomicBehaviourAspect#boolean performBehavior() from org.imt.k3tdl.k3dsa.AssignmentAspect
    	// BeginInjectInto org.imt.k3tdl.k3dsa.AtomicBehaviourAspect#boolean performBehavior() from org.imt.k3tdl.k3dsa.AssertionAspect
    		if (_self instanceof org.etsi.mts.tdl.Assertion){
    			result = org.imt.k3tdl.k3dsa.AssertionAspect.performBehavior((org.etsi.mts.tdl.Assertion)_self);
    		} else
    		// EndInjectInto org.imt.k3tdl.k3dsa.AtomicBehaviourAspect#boolean performBehavior() from org.imt.k3tdl.k3dsa.AssertionAspect
    	// BeginInjectInto org.imt.k3tdl.k3dsa.AtomicBehaviourAspect#boolean performBehavior() from org.imt.k3tdl.k3dsa.VerdictAssignmentAspect
    		if (_self instanceof org.etsi.mts.tdl.VerdictAssignment){
    			result = org.imt.k3tdl.k3dsa.VerdictAssignmentAspect.performBehavior((org.etsi.mts.tdl.VerdictAssignment)_self);
    		} else
    		// EndInjectInto org.imt.k3tdl.k3dsa.AtomicBehaviourAspect#boolean performBehavior() from org.imt.k3tdl.k3dsa.VerdictAssignmentAspect
    	// BeginInjectInto org.imt.k3tdl.k3dsa.AtomicBehaviourAspect#boolean performBehavior() from org.imt.k3tdl.k3dsa.TimeOperationAspect
    		if (_self instanceof org.etsi.mts.tdl.TimeOperation){
    			result = org.imt.k3tdl.k3dsa.TimeOperationAspect.performBehavior((org.etsi.mts.tdl.TimeOperation)_self);
    		} else
    		// EndInjectInto org.imt.k3tdl.k3dsa.AtomicBehaviourAspect#boolean performBehavior() from org.imt.k3tdl.k3dsa.TimeOperationAspect
    	// BeginInjectInto org.imt.k3tdl.k3dsa.AtomicBehaviourAspect#boolean performBehavior() from org.imt.k3tdl.k3dsa.InlineActionAspect
    		if (_self instanceof org.etsi.mts.tdl.InlineAction){
    			result = org.imt.k3tdl.k3dsa.InlineActionAspect.performBehavior((org.etsi.mts.tdl.InlineAction)_self);
    		} else
    		// EndInjectInto org.imt.k3tdl.k3dsa.AtomicBehaviourAspect#boolean performBehavior() from org.imt.k3tdl.k3dsa.InlineActionAspect
    	// BeginInjectInto org.imt.k3tdl.k3dsa.AtomicBehaviourAspect#boolean performBehavior() from org.imt.k3tdl.k3dsa.InteractoinAspect
    		if (_self instanceof org.etsi.mts.tdl.Interaction){
    			result = org.imt.k3tdl.k3dsa.InteractoinAspect.performBehavior((org.etsi.mts.tdl.Interaction)_self);
    		} else
    		// EndInjectInto org.imt.k3tdl.k3dsa.AtomicBehaviourAspect#boolean performBehavior() from org.imt.k3tdl.k3dsa.InteractoinAspect
    	// BeginInjectInto org.imt.k3tdl.k3dsa.AtomicBehaviourAspect#boolean performBehavior() from org.imt.k3tdl.k3dsa.WaitAspect
    		if (_self instanceof org.etsi.mts.tdl.Wait){
    			result = org.imt.k3tdl.k3dsa.WaitAspect.performBehavior((org.etsi.mts.tdl.Wait)_self);
    		} else
    		// EndInjectInto org.imt.k3tdl.k3dsa.AtomicBehaviourAspect#boolean performBehavior() from org.imt.k3tdl.k3dsa.WaitAspect
    	// BeginInjectInto org.imt.k3tdl.k3dsa.AtomicBehaviourAspect#boolean performBehavior() from org.imt.k3tdl.k3dsa.MessageAspect
    		if (_self instanceof org.etsi.mts.tdl.Message){
    			result = org.imt.k3tdl.k3dsa.MessageAspect.performBehavior((org.etsi.mts.tdl.Message)_self);
    		} else
    		// EndInjectInto org.imt.k3tdl.k3dsa.AtomicBehaviourAspect#boolean performBehavior() from org.imt.k3tdl.k3dsa.MessageAspect
    // #DispatchPointCut_before# boolean performBehavior()
    if (_self instanceof org.etsi.mts.tdl.AtomicBehaviour){
    	result = org.imt.k3tdl.k3dsa.AtomicBehaviourAspect._privk3_performBehavior(_self_, (org.etsi.mts.tdl.AtomicBehaviour)_self);
    };
    return (boolean)result;
  }

  private static boolean super_performBehavior(final AtomicBehaviour _self) {
    final org.imt.k3tdl.k3dsa.BehaviourAspectBehaviourAspectProperties _self_ = org.imt.k3tdl.k3dsa.BehaviourAspectBehaviourAspectContext.getSelf(_self);
    return  org.imt.k3tdl.k3dsa.BehaviourAspect._privk3_performBehavior(_self_, _self);
  }

  protected static boolean _privk3_performBehavior(final AtomicBehaviourAspectAtomicBehaviourAspectProperties _self_, final AtomicBehaviour _self) {
    return false;
  }
}
