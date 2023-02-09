package minijava.tcs.typing

import com.google.inject.Inject

import minijava.tcs.XMiniJavaModelUtil
import xminiJava.TypeDeclaration

import static minijava.tcs.typing.XMiniJavaTypeComputer.*

class XMiniJavaTypeConformance {

	@Inject extension XMiniJavaModelUtil

	def isConformant(TypeDeclaration c1, TypeDeclaration c2) {
		c1 === NULL_TYPE || // null can be assigned to everything
		c1 === c2 || c1.isSubclassOf(c2)
	}

	def isSubclassOf(TypeDeclaration c1, TypeDeclaration c2) {
		c1.classHierarchy.contains(c2)
	}
}
