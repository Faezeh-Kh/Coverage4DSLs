package minijava.tcs.validation

import com.google.inject.Inject

import org.eclipse.emf.ecore.EObject
import xminiJava.AccessLevel
import xminiJava.Class
import xminiJava.Member

import static extension org.eclipse.xtext.EcoreUtil2.*
import minijava.tcs.typing.XMiniJavaTypeConformance

class XMiniJavaAccessibility {

	@Inject extension XMiniJavaTypeConformance

	def isAccessibleFrom(Member member, EObject context) {
		val contextClass = context.getContainerOfType(Class)
		val memberClass = member.getContainerOfType(Class)
		switch (contextClass) {
			case contextClass === memberClass:
				true
			case contextClass.isSubclassOf(memberClass):
				member.access != AccessLevel.PRIVATE
			default:
				member.access == AccessLevel.PUBLIC
		}
	}
}
