package minijava.semantics

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.InitializeModel
import fr.inria.diverse.k3.al.annotationprocessor.Main
import fr.inria.diverse.k3.al.annotationprocessor.Step
import java.util.List
import xminiJava.ArrayTypeRef
import xminiJava.Method
import xminiJava.XminiJavaFactory
import xminiJava.Program
import xminiJava.State
import xminiJava.StringTypeRef
import static extension minijava.semantics.BlockAspect.*;

@Aspect(className=Program)
class ProgramAspect {

	@Main
	@Step
	def void main() {
		_self.execute
	}
	
	@InitializeModel
	def void initialize(List<String> args) {
		val main = _self.classes.map[members].flatten.filter(Method).findFirst [
			it.name == "main" && it.static && it.params.size == 1 && it.params.head.typeRef instanceof ArrayTypeRef &&
				(it.params.head.typeRef as ArrayTypeRef).typeRef instanceof StringTypeRef
		]

		if (main !== null) {

			// Prepare args array
			val argsArray = XminiJavaFactory::eINSTANCE.createArrayInstance
			argsArray.size = args.size
			for (arg : args) {
				val stringVal = XminiJavaFactory::eINSTANCE.createStringValue => [value = arg]
				argsArray.value.add(stringVal)
			}

			// Prepare binding for args param
			val argsBinding = XminiJavaFactory::eINSTANCE.createSymbolBinding => [
				symbol = main.params.head
				value = XminiJavaFactory::eINSTANCE.createArrayRefValue => [
					instance = argsArray
				]
			]

			// Prepare root context with args binding
			val rootCont = XminiJavaFactory::eINSTANCE.createContext
			rootCont.bindings.add(argsBinding)

			// Prepare initial state
			 
			val state = XminiJavaFactory::eINSTANCE.createState => [
				outputStream = XminiJavaFactory::eINSTANCE.createOutputStream
				rootFrame = XminiJavaFactory::eINSTANCE.createFrame => [
					rootContext = rootCont
				]
			]
			state.arraysHeap.add(argsArray)
			_self.state = state

		} else
			throw new RuntimeException("No main method found.")
	}

	def State execute() {
		
		val main = _self.classes.map[members].flatten.filter(Method).findFirst [
			it.name == "main" && it.static && it.params.size == 1 && it.params.head.typeRef instanceof ArrayTypeRef &&
				(it.params.head.typeRef as ArrayTypeRef).typeRef instanceof StringTypeRef
		]
		// Start the main method
		main.body.evaluateStatementKeepContext(_self.state)
		return _self.state
	}

}
