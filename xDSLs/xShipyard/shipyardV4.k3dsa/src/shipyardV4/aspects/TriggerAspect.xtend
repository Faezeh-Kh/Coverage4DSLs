package shipyardV4.aspects

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.Step
import org.eclipse.emf.ecore.util.EcoreUtil
import shipyard.common.utils.ShipyardUtils
import shipyardV4.Sequence
import shipyardV4.ShipyardV4Root
import shipyardV4.Task
import shipyardV4.Trigger
import shipyardV4.aspects.utils.ShipyardOperationalSemanticsUtils

import static extension shipyardV4.aspects.SequenceAspect.*
import static extension shipyardV4.aspects.TaskAspect.*

@Aspect(className=Trigger)
class TriggerAspect {
	@Step												
	def void fireTrigger() {
		println("Fire: " + _self.toString);
			
		var ShipyardV4Root shipyardV4Root = EcoreUtil.getRootContainer(_self) as ShipyardV4Root;
		var event = ShipyardUtils.getEventStringByTrigger(_self);
		var finishedSequencePathName = event.substring(0, event.lastIndexOf(".") );
		var Sequence finishedSequence = ShipyardUtils.getSequenceByPath(shipyardV4Root, finishedSequencePathName);
		var selectorMatchPatternProperties0 = ShipyardUtils.getSelectorMatchPatternProperties0ByTrigger(_self);
		var String result = null;
		var Task finishedTask = null;
		if (selectorMatchPatternProperties0!==null){ // Condition on trigger specified
			 result = selectorMatchPatternProperties0.patternProperties0.toString;
			 var key =selectorMatchPatternProperties0.key;
			 var String[] splittedKey = key.split("\\.");
			 if (splittedKey.length>1){// is triggered by a task
			 	finishedTask = ShipyardUtils.getTaskWithName(finishedSequence, splittedKey.get(0));
			 	if((result.equals(finishedTask.result))){
					ShipyardUtils.getSequenceByTrigger(_self).step()
				}
			 }else if((result.equals(finishedSequence.result))){// is triggered by a sequence
				ShipyardUtils.getSequenceByTrigger(_self).step()
			 }
		}else{// Condition on trigger not specified
			if(finishedSequence.result.equals(ShipyardOperationalSemanticsUtils.RESULT_PASS)){
				ShipyardUtils.getSequenceByTrigger(_self).step()
			}
		}
	}
}