package shipyardV4.aspects

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.InitializeModel
import fr.inria.diverse.k3.al.annotationprocessor.Main
import fr.inria.diverse.k3.al.annotationprocessor.Step
import java.util.Collection
import java.util.List
import java.util.Map
import shipyard.common.utils.ShipyardUtils
import shipyardV4.ShipyardV4Root
import shipyardV4.Task
import shipyardV4.Trigger

import static extension shipyardV4.aspects.SequenceAspect.*

@Aspect(className=ShipyardV4Root)
class ShipyardV4RootAspect {
	
	public Map<String,Collection<Trigger>> eventStringTriggerMap;
	public Task currentTask = null;

	@Step 												
	@InitializeModel									
	def void initializeModel(List<String> args){
		_self.eventStringTriggerMap = ShipyardUtils.createEventStringTriggerMap(_self);	
	}
	
	@Step	
	@Main												
	def void main() {
		if(_self.initialSequence !== null){
			_self.initialSequence.step();
		}
		else{
			throw new ShipyardRuntimeException("The initial sequence is not defined");
		}
	}	
	
}