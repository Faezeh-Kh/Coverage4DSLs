/*
 * generated by Xtext 2.9.1
 */
package minitl.tcs.scoping

import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.scoping.Scopes
import org.eclipse.xtext.scoping.IScope
import minitl.BinaryExpression
import minitl.StringValue
import minitl.ObjectTemplateValue
import minitl.FieldAccessValue
import minitl.ObjectTemplate
import minitl.minitlPackage
import minitl.impl.ObjectTemplateImpl
import minitl.impl.BindingImpl
import minitl.impl.FieldAccessValueImpl

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
class MinitlScopeProvider extends AbstractMinitlScopeProvider {

	private def dispatch EClass inferType(BinaryExpression value) {
		return null
	}

	private def dispatch EClass inferType(StringValue value) {
		return null
	}

	private def dispatch EClass inferType(ObjectTemplateValue value) {
		return value.objecttemplate.type
	}

	private def dispatch EClass inferType(FieldAccessValue value) {
		val leftType = inferType(value.object)
		if (leftType != null) {
			if (leftType.EAllStructuralFeatures.contains(value.feature)) {
				val resultType = value.feature.EType
				if (resultType instanceof EClass)
					return resultType as EClass
			}
		}
		return null
	}

	private def IScope scopeObjectTemplateFeatures(ObjectTemplate o) {
		val result = o.type.EAllStructuralFeatures.toSet
//		result.removeAll(o.bindings.map[b|b.feature]) //TODO not working, breaks the non need of FQN
		return Scopes.scopeFor(result)
	}

	override getScope(EObject context, EReference reference) {

		switch (reference) {
			case minitlPackage.Literals.BINDING__FEATURE:
				switch (context) {
					ObjectTemplateImpl:
						return scopeObjectTemplateFeatures(context)
					BindingImpl:
						return scopeObjectTemplateFeatures(context.objectTemplate)
				}
			case minitlPackage.Literals.FIELD_ACCESS_VALUE__FEATURE:
				switch (context) {
					FieldAccessValueImpl: {
						val EClass inferredType = inferType(context.object)
						if (inferredType != null)
							return Scopes.scopeFor(inferredType.EAllStructuralFeatures)
						else
							return Scopes.scopeFor(#{})
					}
				}
		}
		return super.getScope(context, reference)

	}

}
