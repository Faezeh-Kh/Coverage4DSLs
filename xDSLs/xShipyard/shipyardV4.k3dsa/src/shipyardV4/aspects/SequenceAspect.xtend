package shipyardV4.aspects

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import shipyardV4.Sequence
import fr.inria.diverse.k3.al.annotationprocessor.Step
import shipyardV4.ShipyardV4Root
import org.eclipse.emf.ecore.util.EcoreUtil
import java.util.Collection
import shipyardV4.Task
import shipyard.common.utils.ShipyardUtils
import java.util.Iterator
import shipyardV4.aspects.utils.ShipyardOperationalSemanticsUtils
import shipyardV4.Trigger

import static extension shipyardV4.aspects.ShipyardV4RootAspect.*
import static extension shipyardV4.aspects.TaskAspect.*
import static extension shipyardV4.aspects.TriggerAspect.*
import shipyardV4.SequenceName

@Aspect(className=Sequence)
class SequenceAspect {
	
	public String result = null;
	
	@Step												
	def void step() {
		var sequenceName = _self.sequence.filter[s | s instanceof SequenceName].get(0) as SequenceName
		println("Step Sequence: " + sequenceName.name);
		var ShipyardV4Root shipyardV4Root = EcoreUtil.getRootContainer(_self) as ShipyardV4Root;
		
		/**
		 * Execute all tasks in the sequence
		 * Once a task failed, all the following ones inside the sequence will be skipped
		 */
		val Collection<Task> tasks = ShipyardUtils.getTasks(_self);
		val Iterator<Task> taskIterator = tasks.iterator;
		var continue = true;
		while (taskIterator.hasNext && continue) {
			var Task task = taskIterator.next;
			shipyardV4Root.currentTask=task;
			task.fireTask;	
			if(ShipyardOperationalSemanticsUtils.RESULT_FAILED.equals(task.result)){
		    	_self.result=ShipyardOperationalSemanticsUtils.RESULT_FAILED;
		    	continue=false;
		    }else if (ShipyardOperationalSemanticsUtils.RESULT_WARNING.equals(task.result)) {
		    	_self.result=ShipyardOperationalSemanticsUtils.RESULT_WARNING;
		    }
		}	
		shipyardV4Root.currentTask=null;// To quit the cursor from the last task of the sequence		

		/**
	     * Check executed Sequence result
	     */
	    if (_self.simulatedResult !== null){
	    	if (_self.simulatedResult.equals(ShipyardOperationalSemanticsUtils.RESULT_FAILED)){
	    		_self.result=ShipyardOperationalSemanticsUtils.RESULT_FAILED;
	    	}else if(_self.simulatedResult.equals(ShipyardOperationalSemanticsUtils.RESULT_WARNING)
	    		&& !_self.result.equals(ShipyardOperationalSemanticsUtils.RESULT_FAILED)){
	    		_self.result=ShipyardOperationalSemanticsUtils.RESULT_WARNING;
	    	}else if(_self.result === null){// we skip the passedSequence as deprecated 
					_self.result=ShipyardOperationalSemanticsUtils.RESULT_PASS
			}
	    }else if (_self.result===null){ // case No execution environment on input
			_self.result=ShipyardOperationalSemanticsUtils.RESULT_PASS;
		}

		/**
		 * Process Triggers
		 */
		var String sequenceFinishedEvent =ShipyardUtils.getFinishedSequenceEvent(_self);
		
		var  triggers = shipyardV4Root.eventStringTriggerMap.get(sequenceFinishedEvent);
    	if(triggers !== null){
		    for (Trigger trigger : triggers){
		    	trigger.fireTrigger();
		    }
	    
	    }
	}
}
