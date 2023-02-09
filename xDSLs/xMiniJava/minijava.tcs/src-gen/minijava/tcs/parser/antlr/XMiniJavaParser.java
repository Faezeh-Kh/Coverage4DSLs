/*
 * generated by Xtext 2.27.0
 */
package minijava.tcs.parser.antlr;

import com.google.inject.Inject;
import minijava.tcs.parser.antlr.internal.InternalXMiniJavaParser;
import minijava.tcs.services.XMiniJavaGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class XMiniJavaParser extends AbstractAntlrParser {

	@Inject
	private XMiniJavaGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalXMiniJavaParser createParser(XtextTokenStream stream) {
		return new InternalXMiniJavaParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Program";
	}

	public XMiniJavaGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(XMiniJavaGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
