package org.imt.k3tdl.k3dsa;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.etsi.mts.tdl.Behaviour;

@Aspect(className = Behaviour.class)
@SuppressWarnings("all")
public class BehaviourAspect {
  public static boolean performBehavior(final Behaviour _self) {
    final org.imt.k3tdl.k3dsa.BehaviourAspectBehaviourAspectProperties _self_ = org.imt.k3tdl.k3dsa.BehaviourAspectBehaviourAspectContext.getSelf(_self);
    Object result = null;
    	// BeginInjectInto org.imt.k3tdl.k3dsa.BehaviourAspect#boolean performBehavior() from org.imt.k3tdl.k3dsa.BreakAspect
    		if (_self instanceof org.etsi.mts.tdl.Break){
    			result = org.imt.k3tdl.k3dsa.BreakAspect.performBehavior((org.etsi.mts.tdl.Break)_self);
    		} else
    		// EndInjectInto org.imt.k3tdl.k3dsa.BehaviourAspect#boolean performBehavior() from org.imt.k3tdl.k3dsa.BreakAspect
    	// BeginInjectInto org.imt.k3tdl.k3dsa.BehaviourAspect#boolean performBehavior() from org.imt.k3tdl.k3dsa.ActionReferenceAspect
    		if (_self instanceof org.etsi.mts.tdl.ActionReference){
    			result = org.imt.k3tdl.k3dsa.ActionReferenceAspect.performBehavior((org.etsi.mts.tdl.ActionReference)_self);
    		} else
    		// EndInjectInto org.imt.k3tdl.k3dsa.BehaviourAspect#boolean performBehavior() from org.imt.k3tdl.k3dsa.ActionReferenceAspect
    	// BeginInjectInto org.imt.k3tdl.k3dsa.BehaviourAspect#boolean performBehavior() from org.imt.k3tdl.k3dsa.ParallelBehaviourAspect
    		if (_self instanceof org.etsi.mts.tdl.ParallelBehaviour){
    			result = org.imt.k3tdl.k3dsa.ParallelBehaviourAspect.performBehavior((org.etsi.mts.tdl.ParallelBehaviour)_self);
    		} else
    		// EndInjectInto org.imt.k3tdl.k3dsa.BehaviourAspect#boolean performBehavior() from org.imt.k3tdl.k3dsa.ParallelBehaviourAspect
    	// BeginInjectInto org.imt.k3tdl.k3dsa.BehaviourAspect#boolean performBehavior() from org.imt.k3tdl.k3dsa.VerdictAssignmentAspect
    		if (_self instanceof org.etsi.mts.tdl.VerdictAssignment){
    			result = org.imt.k3tdl.k3dsa.VerdictAssignmentAspect.performBehavior((org.etsi.mts.tdl.VerdictAssignment)_self);
    		} else
    		// EndInjectInto org.imt.k3tdl.k3dsa.BehaviourAspect#boolean performBehavior() from org.imt.k3tdl.k3dsa.VerdictAssignmentAspect
    	// BeginInjectInto org.imt.k3tdl.k3dsa.BehaviourAspect#boolean performBehavior() from org.imt.k3tdl.k3dsa.MultipleCombinedBehaviourAspect
    		if (_self instanceof org.etsi.mts.tdl.MultipleCombinedBehaviour){
    			result = org.imt.k3tdl.k3dsa.MultipleCombinedBehaviourAspect.performBehavior((org.etsi.mts.tdl.MultipleCombinedBehaviour)_self);
    		} else
    		// EndInjectInto org.imt.k3tdl.k3dsa.BehaviourAspect#boolean performBehavior() from org.imt.k3tdl.k3dsa.MultipleCombinedBehaviourAspect
    	// BeginInjectInto org.imt.k3tdl.k3dsa.BehaviourAspect#boolean performBehavior() from org.imt.k3tdl.k3dsa.TimerStopAspect
    		if (_self instanceof org.etsi.mts.tdl.TimerStop){
    			result = org.imt.k3tdl.k3dsa.TimerStopAspect.performBehavior((org.etsi.mts.tdl.TimerStop)_self);
    		} else
    		// EndInjectInto org.imt.k3tdl.k3dsa.BehaviourAspect#boolean performBehavior() from org.imt.k3tdl.k3dsa.TimerStopAspect
    	// BeginInjectInto org.imt.k3tdl.k3dsa.BehaviourAspect#boolean performBehavior() from org.imt.k3tdl.k3dsa.AlternativeBehaviourAspect
    		if (_self instanceof org.etsi.mts.tdl.AlternativeBehaviour){
    			result = org.imt.k3tdl.k3dsa.AlternativeBehaviourAspect.performBehavior((org.etsi.mts.tdl.AlternativeBehaviour)_self);
    		} else
    		// EndInjectInto org.imt.k3tdl.k3dsa.BehaviourAspect#boolean performBehavior() from org.imt.k3tdl.k3dsa.AlternativeBehaviourAspect
    	// BeginInjectInto org.imt.k3tdl.k3dsa.BehaviourAspect#boolean performBehavior() from org.imt.k3tdl.k3dsa.CompoundBehaviourAspect
    		if (_self instanceof org.etsi.mts.tdl.CompoundBehaviour){
    			result = org.imt.k3tdl.k3dsa.CompoundBehaviourAspect.performBehavior((org.etsi.mts.tdl.CompoundBehaviour)_self);
    		} else
    		// EndInjectInto org.imt.k3tdl.k3dsa.BehaviourAspect#boolean performBehavior() from org.imt.k3tdl.k3dsa.CompoundBehaviourAspect
    	// BeginInjectInto org.imt.k3tdl.k3dsa.BehaviourAspect#boolean performBehavior() from org.imt.k3tdl.k3dsa.WaitAspect
    		if (_self instanceof org.etsi.mts.tdl.Wait){
    			result = org.imt.k3tdl.k3dsa.WaitAspect.performBehavior((org.etsi.mts.tdl.Wait)_self);
    		} else
    		// EndInjectInto org.imt.k3tdl.k3dsa.BehaviourAspect#boolean performBehavior() from org.imt.k3tdl.k3dsa.WaitAspect
    	// BeginInjectInto org.imt.k3tdl.k3dsa.BehaviourAspect#boolean performBehavior() from org.imt.k3tdl.k3dsa.InteractoinAspect
    		if (_self instanceof org.etsi.mts.tdl.Interaction){
    			result = org.imt.k3tdl.k3dsa.InteractoinAspect.performBehavior((org.etsi.mts.tdl.Interaction)_self);
    		} else
    		// EndInjectInto org.imt.k3tdl.k3dsa.BehaviourAspect#boolean performBehavior() from org.imt.k3tdl.k3dsa.InteractoinAspect
    	// BeginInjectInto org.imt.k3tdl.k3dsa.BehaviourAspect#boolean performBehavior() from org.imt.k3tdl.k3dsa.StopAspect
    		if (_self instanceof org.etsi.mts.tdl.Stop){
    			result = org.imt.k3tdl.k3dsa.StopAspect.performBehavior((org.etsi.mts.tdl.Stop)_self);
    		} else
    		// EndInjectInto org.imt.k3tdl.k3dsa.BehaviourAspect#boolean performBehavior() from org.imt.k3tdl.k3dsa.StopAspect
    	// BeginInjectInto org.imt.k3tdl.k3dsa.BehaviourAspect#boolean performBehavior() from org.imt.k3tdl.k3dsa.AssertionAspect
    		if (_self instanceof org.etsi.mts.tdl.Assertion){
    			result = org.imt.k3tdl.k3dsa.AssertionAspect.performBehavior((org.etsi.mts.tdl.Assertion)_self);
    		} else
    		// EndInjectInto org.imt.k3tdl.k3dsa.BehaviourAspect#boolean performBehavior() from org.imt.k3tdl.k3dsa.AssertionAspect
    	// BeginInjectInto org.imt.k3tdl.k3dsa.BehaviourAspect#boolean performBehavior() from org.imt.k3tdl.k3dsa.ConditionalBehaviourAspect
    		if (_self instanceof org.etsi.mts.tdl.ConditionalBehaviour){
    			result = org.imt.k3tdl.k3dsa.ConditionalBehaviourAspect.performBehavior((org.etsi.mts.tdl.ConditionalBehaviour)_self);
    		} else
    		// EndInjectInto org.imt.k3tdl.k3dsa.BehaviourAspect#boolean performBehavior() from org.imt.k3tdl.k3dsa.ConditionalBehaviourAspect
    	// BeginInjectInto org.imt.k3tdl.k3dsa.BehaviourAspect#boolean performBehavior() from org.imt.k3tdl.k3dsa.PeriodicBehaviourAspect
    		if (_self instanceof org.etsi.mts.tdl.PeriodicBehaviour){
    			result = org.imt.k3tdl.k3dsa.PeriodicBehaviourAspect.performBehavior((org.etsi.mts.tdl.PeriodicBehaviour)_self);
    		} else
    		// EndInjectInto org.imt.k3tdl.k3dsa.BehaviourAspect#boolean performBehavior() from org.imt.k3tdl.k3dsa.PeriodicBehaviourAspect
    	// BeginInjectInto org.imt.k3tdl.k3dsa.BehaviourAspect#boolean performBehavior() from org.imt.k3tdl.k3dsa.ExceptionalBehaviourAspect
    		if (_self instanceof org.etsi.mts.tdl.ExceptionalBehaviour){
    			result = org.imt.k3tdl.k3dsa.ExceptionalBehaviourAspect.performBehavior((org.etsi.mts.tdl.ExceptionalBehaviour)_self);
    		} else
    		// EndInjectInto org.imt.k3tdl.k3dsa.BehaviourAspect#boolean performBehavior() from org.imt.k3tdl.k3dsa.ExceptionalBehaviourAspect
    	// BeginInjectInto org.imt.k3tdl.k3dsa.BehaviourAspect#boolean performBehavior() from org.imt.k3tdl.k3dsa.MessageAspect
    		if (_self instanceof org.etsi.mts.tdl.Message){
    			result = org.imt.k3tdl.k3dsa.MessageAspect.performBehavior((org.etsi.mts.tdl.Message)_self);
    		} else
    		// EndInjectInto org.imt.k3tdl.k3dsa.BehaviourAspect#boolean performBehavior() from org.imt.k3tdl.k3dsa.MessageAspect
    	// BeginInjectInto org.imt.k3tdl.k3dsa.BehaviourAspect#boolean performBehavior() from org.imt.k3tdl.k3dsa.QuiescenceAspect
    		if (_self instanceof org.etsi.mts.tdl.Quiescence){
    			result = org.imt.k3tdl.k3dsa.QuiescenceAspect.performBehavior((org.etsi.mts.tdl.Quiescence)_self);
    		} else
    		// EndInjectInto org.imt.k3tdl.k3dsa.BehaviourAspect#boolean performBehavior() from org.imt.k3tdl.k3dsa.QuiescenceAspect
    	// BeginInjectInto org.imt.k3tdl.k3dsa.BehaviourAspect#boolean performBehavior() from org.imt.k3tdl.k3dsa.TestDescriptionReferenceAspect
    		if (_self instanceof org.etsi.mts.tdl.TestDescriptionReference){
    			result = org.imt.k3tdl.k3dsa.TestDescriptionReferenceAspect.performBehavior((org.etsi.mts.tdl.TestDescriptionReference)_self);
    		} else
    		// EndInjectInto org.imt.k3tdl.k3dsa.BehaviourAspect#boolean performBehavior() from org.imt.k3tdl.k3dsa.TestDescriptionReferenceAspect
    	// BeginInjectInto org.imt.k3tdl.k3dsa.BehaviourAspect#boolean performBehavior() from org.imt.k3tdl.k3dsa.AssignmentAspect
    		if (_self instanceof org.etsi.mts.tdl.Assignment){
    			result = org.imt.k3tdl.k3dsa.AssignmentAspect.performBehavior((org.etsi.mts.tdl.Assignment)_self);
    		} else
    		// EndInjectInto org.imt.k3tdl.k3dsa.BehaviourAspect#boolean performBehavior() from org.imt.k3tdl.k3dsa.AssignmentAspect
    	// BeginInjectInto org.imt.k3tdl.k3dsa.BehaviourAspect#boolean performBehavior() from org.imt.k3tdl.k3dsa.ProcedureCallAspect
    		if (_self instanceof org.etsi.mts.tdl.ProcedureCall){
    			result = org.imt.k3tdl.k3dsa.ProcedureCallAspect.performBehavior((org.etsi.mts.tdl.ProcedureCall)_self);
    		} else
    		// EndInjectInto org.imt.k3tdl.k3dsa.BehaviourAspect#boolean performBehavior() from org.imt.k3tdl.k3dsa.ProcedureCallAspect
    	// BeginInjectInto org.imt.k3tdl.k3dsa.BehaviourAspect#boolean performBehavior() from org.imt.k3tdl.k3dsa.BoundedLoopBehaviourAspect
    		if (_self instanceof org.etsi.mts.tdl.BoundedLoopBehaviour){
    			result = org.imt.k3tdl.k3dsa.BoundedLoopBehaviourAspect.performBehavior((org.etsi.mts.tdl.BoundedLoopBehaviour)_self);
    		} else
    		// EndInjectInto org.imt.k3tdl.k3dsa.BehaviourAspect#boolean performBehavior() from org.imt.k3tdl.k3dsa.BoundedLoopBehaviourAspect
    	// BeginInjectInto org.imt.k3tdl.k3dsa.BehaviourAspect#boolean performBehavior() from org.imt.k3tdl.k3dsa.SingleCombinedBehaviourAspect
    		if (_self instanceof org.etsi.mts.tdl.SingleCombinedBehaviour){
    			result = org.imt.k3tdl.k3dsa.SingleCombinedBehaviourAspect.performBehavior((org.etsi.mts.tdl.SingleCombinedBehaviour)_self);
    		} else
    		// EndInjectInto org.imt.k3tdl.k3dsa.BehaviourAspect#boolean performBehavior() from org.imt.k3tdl.k3dsa.SingleCombinedBehaviourAspect
    	// BeginInjectInto org.imt.k3tdl.k3dsa.BehaviourAspect#boolean performBehavior() from org.imt.k3tdl.k3dsa.UnBoundedLoopBehaviourAspect
    		if (_self instanceof org.etsi.mts.tdl.UnboundedLoopBehaviour){
    			result = org.imt.k3tdl.k3dsa.UnBoundedLoopBehaviourAspect.performBehavior((org.etsi.mts.tdl.UnboundedLoopBehaviour)_self);
    		} else
    		// EndInjectInto org.imt.k3tdl.k3dsa.BehaviourAspect#boolean performBehavior() from org.imt.k3tdl.k3dsa.UnBoundedLoopBehaviourAspect
    	// BeginInjectInto org.imt.k3tdl.k3dsa.BehaviourAspect#boolean performBehavior() from org.imt.k3tdl.k3dsa.CombinedBehaviourAspect
    		if (_self instanceof org.etsi.mts.tdl.CombinedBehaviour){
    			result = org.imt.k3tdl.k3dsa.CombinedBehaviourAspect.performBehavior((org.etsi.mts.tdl.CombinedBehaviour)_self);
    		} else
    		// EndInjectInto org.imt.k3tdl.k3dsa.BehaviourAspect#boolean performBehavior() from org.imt.k3tdl.k3dsa.CombinedBehaviourAspect
    	// BeginInjectInto org.imt.k3tdl.k3dsa.BehaviourAspect#boolean performBehavior() from org.imt.k3tdl.k3dsa.ActionBehaviourAspect
    		if (_self instanceof org.etsi.mts.tdl.ActionBehaviour){
    			result = org.imt.k3tdl.k3dsa.ActionBehaviourAspect.performBehavior((org.etsi.mts.tdl.ActionBehaviour)_self);
    		} else
    		// EndInjectInto org.imt.k3tdl.k3dsa.BehaviourAspect#boolean performBehavior() from org.imt.k3tdl.k3dsa.ActionBehaviourAspect
    	// BeginInjectInto org.imt.k3tdl.k3dsa.BehaviourAspect#boolean performBehavior() from org.imt.k3tdl.k3dsa.AtomicBehaviourAspect
    		if (_self instanceof org.etsi.mts.tdl.AtomicBehaviour){
    			result = org.imt.k3tdl.k3dsa.AtomicBehaviourAspect.performBehavior((org.etsi.mts.tdl.AtomicBehaviour)_self);
    		} else
    		// EndInjectInto org.imt.k3tdl.k3dsa.BehaviourAspect#boolean performBehavior() from org.imt.k3tdl.k3dsa.AtomicBehaviourAspect
    	// BeginInjectInto org.imt.k3tdl.k3dsa.BehaviourAspect#boolean performBehavior() from org.imt.k3tdl.k3dsa.TimerOperationAspect
    		if (_self instanceof org.etsi.mts.tdl.TimerOperation){
    			result = org.imt.k3tdl.k3dsa.TimerOperationAspect.performBehavior((org.etsi.mts.tdl.TimerOperation)_self);
    		} else
    		// EndInjectInto org.imt.k3tdl.k3dsa.BehaviourAspect#boolean performBehavior() from org.imt.k3tdl.k3dsa.TimerOperationAspect
    	// BeginInjectInto org.imt.k3tdl.k3dsa.BehaviourAspect#boolean performBehavior() from org.imt.k3tdl.k3dsa.TimeOperationAspect
    		if (_self instanceof org.etsi.mts.tdl.TimeOperation){
    			result = org.imt.k3tdl.k3dsa.TimeOperationAspect.performBehavior((org.etsi.mts.tdl.TimeOperation)_self);
    		} else
    		// EndInjectInto org.imt.k3tdl.k3dsa.BehaviourAspect#boolean performBehavior() from org.imt.k3tdl.k3dsa.TimeOperationAspect
    	// BeginInjectInto org.imt.k3tdl.k3dsa.BehaviourAspect#boolean performBehavior() from org.imt.k3tdl.k3dsa.TimerStartAspect
    		if (_self instanceof org.etsi.mts.tdl.TimerStart){
    			result = org.imt.k3tdl.k3dsa.TimerStartAspect.performBehavior((org.etsi.mts.tdl.TimerStart)_self);
    		} else
    		// EndInjectInto org.imt.k3tdl.k3dsa.BehaviourAspect#boolean performBehavior() from org.imt.k3tdl.k3dsa.TimerStartAspect
    	// BeginInjectInto org.imt.k3tdl.k3dsa.BehaviourAspect#boolean performBehavior() from org.imt.k3tdl.k3dsa.DefaultBehaviourAspect
    		if (_self instanceof org.etsi.mts.tdl.DefaultBehaviour){
    			result = org.imt.k3tdl.k3dsa.DefaultBehaviourAspect.performBehavior((org.etsi.mts.tdl.DefaultBehaviour)_self);
    		} else
    		// EndInjectInto org.imt.k3tdl.k3dsa.BehaviourAspect#boolean performBehavior() from org.imt.k3tdl.k3dsa.DefaultBehaviourAspect
    	// BeginInjectInto org.imt.k3tdl.k3dsa.BehaviourAspect#boolean performBehavior() from org.imt.k3tdl.k3dsa.InterruptBehaviourAspect
    		if (_self instanceof org.etsi.mts.tdl.InterruptBehaviour){
    			result = org.imt.k3tdl.k3dsa.InterruptBehaviourAspect.performBehavior((org.etsi.mts.tdl.InterruptBehaviour)_self);
    		} else
    		// EndInjectInto org.imt.k3tdl.k3dsa.BehaviourAspect#boolean performBehavior() from org.imt.k3tdl.k3dsa.InterruptBehaviourAspect
    	// BeginInjectInto org.imt.k3tdl.k3dsa.BehaviourAspect#boolean performBehavior() from org.imt.k3tdl.k3dsa.TimeOutAspect
    		if (_self instanceof org.etsi.mts.tdl.TimeOut){
    			result = org.imt.k3tdl.k3dsa.TimeOutAspect.performBehavior((org.etsi.mts.tdl.TimeOut)_self);
    		} else
    		// EndInjectInto org.imt.k3tdl.k3dsa.BehaviourAspect#boolean performBehavior() from org.imt.k3tdl.k3dsa.TimeOutAspect
    	// BeginInjectInto org.imt.k3tdl.k3dsa.BehaviourAspect#boolean performBehavior() from org.imt.k3tdl.k3dsa.InlineActionAspect
    		if (_self instanceof org.etsi.mts.tdl.InlineAction){
    			result = org.imt.k3tdl.k3dsa.InlineActionAspect.performBehavior((org.etsi.mts.tdl.InlineAction)_self);
    		} else
    		// EndInjectInto org.imt.k3tdl.k3dsa.BehaviourAspect#boolean performBehavior() from org.imt.k3tdl.k3dsa.InlineActionAspect
    	// BeginInjectInto org.imt.k3tdl.k3dsa.BehaviourAspect#boolean performBehavior() from org.imt.k3tdl.k3dsa.OptionalBehaviourAspect
    		if (_self instanceof org.etsi.mts.tdl.OptionalBehaviour){
    			result = org.imt.k3tdl.k3dsa.OptionalBehaviourAspect.performBehavior((org.etsi.mts.tdl.OptionalBehaviour)_self);
    		} else
    		// EndInjectInto org.imt.k3tdl.k3dsa.BehaviourAspect#boolean performBehavior() from org.imt.k3tdl.k3dsa.OptionalBehaviourAspect
    // #DispatchPointCut_before# boolean performBehavior()
    if (_self instanceof org.etsi.mts.tdl.Behaviour){
    	result = org.imt.k3tdl.k3dsa.BehaviourAspect._privk3_performBehavior(_self_, (org.etsi.mts.tdl.Behaviour)_self);
    };
    return (boolean)result;
  }

  public static Behaviour enabledBehaviour(final Behaviour _self) {
    final org.imt.k3tdl.k3dsa.BehaviourAspectBehaviourAspectProperties _self_ = org.imt.k3tdl.k3dsa.BehaviourAspectBehaviourAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Behaviour enabledBehaviour()
    if (_self instanceof org.etsi.mts.tdl.Behaviour){
    	result = org.imt.k3tdl.k3dsa.BehaviourAspect._privk3_enabledBehaviour(_self_, (org.etsi.mts.tdl.Behaviour)_self);
    };
    return (org.etsi.mts.tdl.Behaviour)result;
  }

  public static void enabledBehaviour(final Behaviour _self, final Behaviour enabledBehaviour) {
    final org.imt.k3tdl.k3dsa.BehaviourAspectBehaviourAspectProperties _self_ = org.imt.k3tdl.k3dsa.BehaviourAspectBehaviourAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void enabledBehaviour(Behaviour)
    if (_self instanceof org.etsi.mts.tdl.Behaviour){
    	org.imt.k3tdl.k3dsa.BehaviourAspect._privk3_enabledBehaviour(_self_, (org.etsi.mts.tdl.Behaviour)_self,enabledBehaviour);
    };
  }

  protected static boolean _privk3_performBehavior(final BehaviourAspectBehaviourAspectProperties _self_, final Behaviour _self) {
    BehaviourAspect.enabledBehaviour(_self, _self);
    return false;
  }

  protected static Behaviour _privk3_enabledBehaviour(final BehaviourAspectBehaviourAspectProperties _self_, final Behaviour _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getEnabledBehaviour") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (org.etsi.mts.tdl.Behaviour) ret;
    				} else {
    					return null;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.enabledBehaviour;
  }

  protected static void _privk3_enabledBehaviour(final BehaviourAspectBehaviourAspectProperties _self_, final Behaviour _self, final Behaviour enabledBehaviour) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setEnabledBehaviour")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, enabledBehaviour);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.enabledBehaviour = enabledBehaviour;
    }
  }
}
