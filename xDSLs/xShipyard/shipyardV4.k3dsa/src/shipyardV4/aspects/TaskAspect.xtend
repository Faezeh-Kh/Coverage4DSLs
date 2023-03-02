package shipyardV4.aspects

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.Step
import shipyardV4.Task
import shipyardV4.aspects.utils.ShipyardOperationalSemanticsUtils
import shipyardV4.TaskName

@Aspect(className=Task)
class TaskAspect {
	public String result;
	@Step												
	def void fireTask() {
		
		var taskName = _self.task.filter[s | s instanceof TaskName].get(0) as TaskName
		println("Fire task: " + taskName.name);
		
		if(_self.simulatedResult !== null){
			if(_self.simulatedResult.equals(ShipyardOperationalSemanticsUtils.RESULT_FAILED)){
				_self.result=ShipyardOperationalSemanticsUtils.RESULT_FAILED;
			}else if(_self.simulatedResult.equals(ShipyardOperationalSemanticsUtils.RESULT_WARNING)){
				_self.result=ShipyardOperationalSemanticsUtils.RESULT_WARNING;
			}else {
				_self.result=ShipyardOperationalSemanticsUtils.RESULT_PASS;
			}
		}else{
			_self.result=ShipyardOperationalSemanticsUtils.RESULT_PASS;
			_self.simulatedResult = _self.result
		}	
		println("Task simulation result is: " + _self.simulatedResult);	
	}
}