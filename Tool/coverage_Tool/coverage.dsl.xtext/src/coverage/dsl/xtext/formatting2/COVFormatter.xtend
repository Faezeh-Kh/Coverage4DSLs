/*
 * generated by Xtext 2.26.0
 */
package coverage.dsl.xtext.formatting2

import DSLSpecificCoverage.Context
import DSLSpecificCoverage.DomainSpecificCoverage
import com.google.inject.Inject
import coverage.dsl.xtext.services.COVGrammarAccess
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument

class COVFormatter extends AbstractFormatter2 {
	
	@Inject extension COVGrammarAccess

	def dispatch void format(DomainSpecificCoverage domainSpecificCoverage, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (metric : domainSpecificCoverage.coverageMetrics) {
			metric.format
		}
	}

	def dispatch void format(Context context, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (rule : context.rules) {
			rule.format
		}
	}
	
}
