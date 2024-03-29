/*
 * generated by Xtext 2.27.0
 */
package coverage.dsl.xtext.parser.antlr;

import com.google.inject.Inject;
import coverage.dsl.xtext.parser.antlr.internal.InternalCOVParser;
import coverage.dsl.xtext.services.COVGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class COVParser extends AbstractAntlrParser {

	@Inject
	private COVGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalCOVParser createParser(XtextTokenStream stream) {
		return new InternalCOVParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "DomainSpecificCoverage";
	}

	public COVGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(COVGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
