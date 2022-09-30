package coverage.dsl.xtext.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import coverage.dsl.xtext.services.COVGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCOVParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'true'", "'false'", "'ALL'", "'ONE'", "'INCLUSION'", "'EXCLUSION'", "'DomainSpecificCoverage'", "'{'", "'Import'", "'metamodel'", "'}'", "','", "'Context'", "'Ignore'", "'ignoreSubtypes'", "'CoverageOfReferenced'", "'reference'", "'CoverageByContent'", "'containmentReference'", "'multiplicity'", "'ConditionalIgnore'", "'condition'", "'containerType'", "'('", "')'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalCOVParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalCOVParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalCOVParser.tokenNames; }
    public String getGrammarFileName() { return "InternalCOV.g"; }


    	private COVGrammarAccess grammarAccess;

    	public void setGrammarAccess(COVGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleDomainSpecificCoverage"
    // InternalCOV.g:53:1: entryRuleDomainSpecificCoverage : ruleDomainSpecificCoverage EOF ;
    public final void entryRuleDomainSpecificCoverage() throws RecognitionException {
        try {
            // InternalCOV.g:54:1: ( ruleDomainSpecificCoverage EOF )
            // InternalCOV.g:55:1: ruleDomainSpecificCoverage EOF
            {
             before(grammarAccess.getDomainSpecificCoverageRule()); 
            pushFollow(FOLLOW_1);
            ruleDomainSpecificCoverage();

            state._fsp--;

             after(grammarAccess.getDomainSpecificCoverageRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDomainSpecificCoverage"


    // $ANTLR start "ruleDomainSpecificCoverage"
    // InternalCOV.g:62:1: ruleDomainSpecificCoverage : ( ( rule__DomainSpecificCoverage__Group__0 ) ) ;
    public final void ruleDomainSpecificCoverage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:66:2: ( ( ( rule__DomainSpecificCoverage__Group__0 ) ) )
            // InternalCOV.g:67:2: ( ( rule__DomainSpecificCoverage__Group__0 ) )
            {
            // InternalCOV.g:67:2: ( ( rule__DomainSpecificCoverage__Group__0 ) )
            // InternalCOV.g:68:3: ( rule__DomainSpecificCoverage__Group__0 )
            {
             before(grammarAccess.getDomainSpecificCoverageAccess().getGroup()); 
            // InternalCOV.g:69:3: ( rule__DomainSpecificCoverage__Group__0 )
            // InternalCOV.g:69:4: rule__DomainSpecificCoverage__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DomainSpecificCoverage__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDomainSpecificCoverageAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDomainSpecificCoverage"


    // $ANTLR start "entryRuleEString"
    // InternalCOV.g:78:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalCOV.g:79:1: ( ruleEString EOF )
            // InternalCOV.g:80:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalCOV.g:87:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:91:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalCOV.g:92:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalCOV.g:92:2: ( ( rule__EString__Alternatives ) )
            // InternalCOV.g:93:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalCOV.g:94:3: ( rule__EString__Alternatives )
            // InternalCOV.g:94:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleContext"
    // InternalCOV.g:103:1: entryRuleContext : ruleContext EOF ;
    public final void entryRuleContext() throws RecognitionException {
        try {
            // InternalCOV.g:104:1: ( ruleContext EOF )
            // InternalCOV.g:105:1: ruleContext EOF
            {
             before(grammarAccess.getContextRule()); 
            pushFollow(FOLLOW_1);
            ruleContext();

            state._fsp--;

             after(grammarAccess.getContextRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleContext"


    // $ANTLR start "ruleContext"
    // InternalCOV.g:112:1: ruleContext : ( ( rule__Context__Group__0 ) ) ;
    public final void ruleContext() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:116:2: ( ( ( rule__Context__Group__0 ) ) )
            // InternalCOV.g:117:2: ( ( rule__Context__Group__0 ) )
            {
            // InternalCOV.g:117:2: ( ( rule__Context__Group__0 ) )
            // InternalCOV.g:118:3: ( rule__Context__Group__0 )
            {
             before(grammarAccess.getContextAccess().getGroup()); 
            // InternalCOV.g:119:3: ( rule__Context__Group__0 )
            // InternalCOV.g:119:4: rule__Context__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Context__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getContextAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleContext"


    // $ANTLR start "entryRuleRule"
    // InternalCOV.g:128:1: entryRuleRule : ruleRule EOF ;
    public final void entryRuleRule() throws RecognitionException {
        try {
            // InternalCOV.g:129:1: ( ruleRule EOF )
            // InternalCOV.g:130:1: ruleRule EOF
            {
             before(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getRuleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // InternalCOV.g:137:1: ruleRule : ( ( rule__Rule__Alternatives ) ) ;
    public final void ruleRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:141:2: ( ( ( rule__Rule__Alternatives ) ) )
            // InternalCOV.g:142:2: ( ( rule__Rule__Alternatives ) )
            {
            // InternalCOV.g:142:2: ( ( rule__Rule__Alternatives ) )
            // InternalCOV.g:143:3: ( rule__Rule__Alternatives )
            {
             before(grammarAccess.getRuleAccess().getAlternatives()); 
            // InternalCOV.g:144:3: ( rule__Rule__Alternatives )
            // InternalCOV.g:144:4: rule__Rule__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleEBoolean"
    // InternalCOV.g:153:1: entryRuleEBoolean : ruleEBoolean EOF ;
    public final void entryRuleEBoolean() throws RecognitionException {
        try {
            // InternalCOV.g:154:1: ( ruleEBoolean EOF )
            // InternalCOV.g:155:1: ruleEBoolean EOF
            {
             before(grammarAccess.getEBooleanRule()); 
            pushFollow(FOLLOW_1);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getEBooleanRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEBoolean"


    // $ANTLR start "ruleEBoolean"
    // InternalCOV.g:162:1: ruleEBoolean : ( ( rule__EBoolean__Alternatives ) ) ;
    public final void ruleEBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:166:2: ( ( ( rule__EBoolean__Alternatives ) ) )
            // InternalCOV.g:167:2: ( ( rule__EBoolean__Alternatives ) )
            {
            // InternalCOV.g:167:2: ( ( rule__EBoolean__Alternatives ) )
            // InternalCOV.g:168:3: ( rule__EBoolean__Alternatives )
            {
             before(grammarAccess.getEBooleanAccess().getAlternatives()); 
            // InternalCOV.g:169:3: ( rule__EBoolean__Alternatives )
            // InternalCOV.g:169:4: rule__EBoolean__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EBoolean__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEBooleanAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEBoolean"


    // $ANTLR start "entryRuleIgnore"
    // InternalCOV.g:178:1: entryRuleIgnore : ruleIgnore EOF ;
    public final void entryRuleIgnore() throws RecognitionException {
        try {
            // InternalCOV.g:179:1: ( ruleIgnore EOF )
            // InternalCOV.g:180:1: ruleIgnore EOF
            {
             before(grammarAccess.getIgnoreRule()); 
            pushFollow(FOLLOW_1);
            ruleIgnore();

            state._fsp--;

             after(grammarAccess.getIgnoreRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIgnore"


    // $ANTLR start "ruleIgnore"
    // InternalCOV.g:187:1: ruleIgnore : ( ( rule__Ignore__Group__0 ) ) ;
    public final void ruleIgnore() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:191:2: ( ( ( rule__Ignore__Group__0 ) ) )
            // InternalCOV.g:192:2: ( ( rule__Ignore__Group__0 ) )
            {
            // InternalCOV.g:192:2: ( ( rule__Ignore__Group__0 ) )
            // InternalCOV.g:193:3: ( rule__Ignore__Group__0 )
            {
             before(grammarAccess.getIgnoreAccess().getGroup()); 
            // InternalCOV.g:194:3: ( rule__Ignore__Group__0 )
            // InternalCOV.g:194:4: rule__Ignore__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Ignore__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIgnoreAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIgnore"


    // $ANTLR start "entryRuleCoverageOfReferenced"
    // InternalCOV.g:203:1: entryRuleCoverageOfReferenced : ruleCoverageOfReferenced EOF ;
    public final void entryRuleCoverageOfReferenced() throws RecognitionException {
        try {
            // InternalCOV.g:204:1: ( ruleCoverageOfReferenced EOF )
            // InternalCOV.g:205:1: ruleCoverageOfReferenced EOF
            {
             before(grammarAccess.getCoverageOfReferencedRule()); 
            pushFollow(FOLLOW_1);
            ruleCoverageOfReferenced();

            state._fsp--;

             after(grammarAccess.getCoverageOfReferencedRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCoverageOfReferenced"


    // $ANTLR start "ruleCoverageOfReferenced"
    // InternalCOV.g:212:1: ruleCoverageOfReferenced : ( ( rule__CoverageOfReferenced__Group__0 ) ) ;
    public final void ruleCoverageOfReferenced() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:216:2: ( ( ( rule__CoverageOfReferenced__Group__0 ) ) )
            // InternalCOV.g:217:2: ( ( rule__CoverageOfReferenced__Group__0 ) )
            {
            // InternalCOV.g:217:2: ( ( rule__CoverageOfReferenced__Group__0 ) )
            // InternalCOV.g:218:3: ( rule__CoverageOfReferenced__Group__0 )
            {
             before(grammarAccess.getCoverageOfReferencedAccess().getGroup()); 
            // InternalCOV.g:219:3: ( rule__CoverageOfReferenced__Group__0 )
            // InternalCOV.g:219:4: rule__CoverageOfReferenced__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CoverageOfReferenced__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCoverageOfReferencedAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCoverageOfReferenced"


    // $ANTLR start "entryRuleCoverageByContent"
    // InternalCOV.g:228:1: entryRuleCoverageByContent : ruleCoverageByContent EOF ;
    public final void entryRuleCoverageByContent() throws RecognitionException {
        try {
            // InternalCOV.g:229:1: ( ruleCoverageByContent EOF )
            // InternalCOV.g:230:1: ruleCoverageByContent EOF
            {
             before(grammarAccess.getCoverageByContentRule()); 
            pushFollow(FOLLOW_1);
            ruleCoverageByContent();

            state._fsp--;

             after(grammarAccess.getCoverageByContentRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCoverageByContent"


    // $ANTLR start "ruleCoverageByContent"
    // InternalCOV.g:237:1: ruleCoverageByContent : ( ( rule__CoverageByContent__Group__0 ) ) ;
    public final void ruleCoverageByContent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:241:2: ( ( ( rule__CoverageByContent__Group__0 ) ) )
            // InternalCOV.g:242:2: ( ( rule__CoverageByContent__Group__0 ) )
            {
            // InternalCOV.g:242:2: ( ( rule__CoverageByContent__Group__0 ) )
            // InternalCOV.g:243:3: ( rule__CoverageByContent__Group__0 )
            {
             before(grammarAccess.getCoverageByContentAccess().getGroup()); 
            // InternalCOV.g:244:3: ( rule__CoverageByContent__Group__0 )
            // InternalCOV.g:244:4: rule__CoverageByContent__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CoverageByContent__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCoverageByContentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCoverageByContent"


    // $ANTLR start "entryRuleConditionalIgnore"
    // InternalCOV.g:253:1: entryRuleConditionalIgnore : ruleConditionalIgnore EOF ;
    public final void entryRuleConditionalIgnore() throws RecognitionException {
        try {
            // InternalCOV.g:254:1: ( ruleConditionalIgnore EOF )
            // InternalCOV.g:255:1: ruleConditionalIgnore EOF
            {
             before(grammarAccess.getConditionalIgnoreRule()); 
            pushFollow(FOLLOW_1);
            ruleConditionalIgnore();

            state._fsp--;

             after(grammarAccess.getConditionalIgnoreRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConditionalIgnore"


    // $ANTLR start "ruleConditionalIgnore"
    // InternalCOV.g:262:1: ruleConditionalIgnore : ( ( rule__ConditionalIgnore__Group__0 ) ) ;
    public final void ruleConditionalIgnore() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:266:2: ( ( ( rule__ConditionalIgnore__Group__0 ) ) )
            // InternalCOV.g:267:2: ( ( rule__ConditionalIgnore__Group__0 ) )
            {
            // InternalCOV.g:267:2: ( ( rule__ConditionalIgnore__Group__0 ) )
            // InternalCOV.g:268:3: ( rule__ConditionalIgnore__Group__0 )
            {
             before(grammarAccess.getConditionalIgnoreAccess().getGroup()); 
            // InternalCOV.g:269:3: ( rule__ConditionalIgnore__Group__0 )
            // InternalCOV.g:269:4: rule__ConditionalIgnore__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ConditionalIgnore__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConditionalIgnoreAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConditionalIgnore"


    // $ANTLR start "ruleCoveredContents"
    // InternalCOV.g:278:1: ruleCoveredContents : ( ( rule__CoveredContents__Alternatives ) ) ;
    public final void ruleCoveredContents() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:282:1: ( ( ( rule__CoveredContents__Alternatives ) ) )
            // InternalCOV.g:283:2: ( ( rule__CoveredContents__Alternatives ) )
            {
            // InternalCOV.g:283:2: ( ( rule__CoveredContents__Alternatives ) )
            // InternalCOV.g:284:3: ( rule__CoveredContents__Alternatives )
            {
             before(grammarAccess.getCoveredContentsAccess().getAlternatives()); 
            // InternalCOV.g:285:3: ( rule__CoveredContents__Alternatives )
            // InternalCOV.g:285:4: rule__CoveredContents__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__CoveredContents__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCoveredContentsAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCoveredContents"


    // $ANTLR start "ruleConditionType"
    // InternalCOV.g:294:1: ruleConditionType : ( ( rule__ConditionType__Alternatives ) ) ;
    public final void ruleConditionType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:298:1: ( ( ( rule__ConditionType__Alternatives ) ) )
            // InternalCOV.g:299:2: ( ( rule__ConditionType__Alternatives ) )
            {
            // InternalCOV.g:299:2: ( ( rule__ConditionType__Alternatives ) )
            // InternalCOV.g:300:3: ( rule__ConditionType__Alternatives )
            {
             before(grammarAccess.getConditionTypeAccess().getAlternatives()); 
            // InternalCOV.g:301:3: ( rule__ConditionType__Alternatives )
            // InternalCOV.g:301:4: rule__ConditionType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ConditionType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getConditionTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConditionType"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalCOV.g:309:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:313:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalCOV.g:314:2: ( RULE_STRING )
                    {
                    // InternalCOV.g:314:2: ( RULE_STRING )
                    // InternalCOV.g:315:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCOV.g:320:2: ( RULE_ID )
                    {
                    // InternalCOV.g:320:2: ( RULE_ID )
                    // InternalCOV.g:321:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__Rule__Alternatives"
    // InternalCOV.g:330:1: rule__Rule__Alternatives : ( ( ruleIgnore ) | ( ruleCoverageOfReferenced ) | ( ruleCoverageByContent ) | ( ruleConditionalIgnore ) );
    public final void rule__Rule__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:334:1: ( ( ruleIgnore ) | ( ruleCoverageOfReferenced ) | ( ruleCoverageByContent ) | ( ruleConditionalIgnore ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt2=1;
                }
                break;
            case 26:
                {
                alt2=2;
                }
                break;
            case 28:
                {
                alt2=3;
                }
                break;
            case 31:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalCOV.g:335:2: ( ruleIgnore )
                    {
                    // InternalCOV.g:335:2: ( ruleIgnore )
                    // InternalCOV.g:336:3: ruleIgnore
                    {
                     before(grammarAccess.getRuleAccess().getIgnoreParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleIgnore();

                    state._fsp--;

                     after(grammarAccess.getRuleAccess().getIgnoreParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCOV.g:341:2: ( ruleCoverageOfReferenced )
                    {
                    // InternalCOV.g:341:2: ( ruleCoverageOfReferenced )
                    // InternalCOV.g:342:3: ruleCoverageOfReferenced
                    {
                     before(grammarAccess.getRuleAccess().getCoverageOfReferencedParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleCoverageOfReferenced();

                    state._fsp--;

                     after(grammarAccess.getRuleAccess().getCoverageOfReferencedParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalCOV.g:347:2: ( ruleCoverageByContent )
                    {
                    // InternalCOV.g:347:2: ( ruleCoverageByContent )
                    // InternalCOV.g:348:3: ruleCoverageByContent
                    {
                     before(grammarAccess.getRuleAccess().getCoverageByContentParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleCoverageByContent();

                    state._fsp--;

                     after(grammarAccess.getRuleAccess().getCoverageByContentParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalCOV.g:353:2: ( ruleConditionalIgnore )
                    {
                    // InternalCOV.g:353:2: ( ruleConditionalIgnore )
                    // InternalCOV.g:354:3: ruleConditionalIgnore
                    {
                     before(grammarAccess.getRuleAccess().getConditionalIgnoreParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleConditionalIgnore();

                    state._fsp--;

                     after(grammarAccess.getRuleAccess().getConditionalIgnoreParserRuleCall_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Alternatives"


    // $ANTLR start "rule__EBoolean__Alternatives"
    // InternalCOV.g:363:1: rule__EBoolean__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__EBoolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:367:1: ( ( 'true' ) | ( 'false' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            else if ( (LA3_0==12) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalCOV.g:368:2: ( 'true' )
                    {
                    // InternalCOV.g:368:2: ( 'true' )
                    // InternalCOV.g:369:3: 'true'
                    {
                     before(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCOV.g:374:2: ( 'false' )
                    {
                    // InternalCOV.g:374:2: ( 'false' )
                    // InternalCOV.g:375:3: 'false'
                    {
                     before(grammarAccess.getEBooleanAccess().getFalseKeyword_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getEBooleanAccess().getFalseKeyword_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EBoolean__Alternatives"


    // $ANTLR start "rule__CoveredContents__Alternatives"
    // InternalCOV.g:384:1: rule__CoveredContents__Alternatives : ( ( ( 'ALL' ) ) | ( ( 'ONE' ) ) );
    public final void rule__CoveredContents__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:388:1: ( ( ( 'ALL' ) ) | ( ( 'ONE' ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==13) ) {
                alt4=1;
            }
            else if ( (LA4_0==14) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalCOV.g:389:2: ( ( 'ALL' ) )
                    {
                    // InternalCOV.g:389:2: ( ( 'ALL' ) )
                    // InternalCOV.g:390:3: ( 'ALL' )
                    {
                     before(grammarAccess.getCoveredContentsAccess().getALLEnumLiteralDeclaration_0()); 
                    // InternalCOV.g:391:3: ( 'ALL' )
                    // InternalCOV.g:391:4: 'ALL'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getCoveredContentsAccess().getALLEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCOV.g:395:2: ( ( 'ONE' ) )
                    {
                    // InternalCOV.g:395:2: ( ( 'ONE' ) )
                    // InternalCOV.g:396:3: ( 'ONE' )
                    {
                     before(grammarAccess.getCoveredContentsAccess().getONEEnumLiteralDeclaration_1()); 
                    // InternalCOV.g:397:3: ( 'ONE' )
                    // InternalCOV.g:397:4: 'ONE'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getCoveredContentsAccess().getONEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoveredContents__Alternatives"


    // $ANTLR start "rule__ConditionType__Alternatives"
    // InternalCOV.g:405:1: rule__ConditionType__Alternatives : ( ( ( 'INCLUSION' ) ) | ( ( 'EXCLUSION' ) ) );
    public final void rule__ConditionType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:409:1: ( ( ( 'INCLUSION' ) ) | ( ( 'EXCLUSION' ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            else if ( (LA5_0==16) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalCOV.g:410:2: ( ( 'INCLUSION' ) )
                    {
                    // InternalCOV.g:410:2: ( ( 'INCLUSION' ) )
                    // InternalCOV.g:411:3: ( 'INCLUSION' )
                    {
                     before(grammarAccess.getConditionTypeAccess().getINCLUSIONEnumLiteralDeclaration_0()); 
                    // InternalCOV.g:412:3: ( 'INCLUSION' )
                    // InternalCOV.g:412:4: 'INCLUSION'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getConditionTypeAccess().getINCLUSIONEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCOV.g:416:2: ( ( 'EXCLUSION' ) )
                    {
                    // InternalCOV.g:416:2: ( ( 'EXCLUSION' ) )
                    // InternalCOV.g:417:3: ( 'EXCLUSION' )
                    {
                     before(grammarAccess.getConditionTypeAccess().getEXCLUSIONEnumLiteralDeclaration_1()); 
                    // InternalCOV.g:418:3: ( 'EXCLUSION' )
                    // InternalCOV.g:418:4: 'EXCLUSION'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getConditionTypeAccess().getEXCLUSIONEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionType__Alternatives"


    // $ANTLR start "rule__DomainSpecificCoverage__Group__0"
    // InternalCOV.g:426:1: rule__DomainSpecificCoverage__Group__0 : rule__DomainSpecificCoverage__Group__0__Impl rule__DomainSpecificCoverage__Group__1 ;
    public final void rule__DomainSpecificCoverage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:430:1: ( rule__DomainSpecificCoverage__Group__0__Impl rule__DomainSpecificCoverage__Group__1 )
            // InternalCOV.g:431:2: rule__DomainSpecificCoverage__Group__0__Impl rule__DomainSpecificCoverage__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__DomainSpecificCoverage__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DomainSpecificCoverage__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DomainSpecificCoverage__Group__0"


    // $ANTLR start "rule__DomainSpecificCoverage__Group__0__Impl"
    // InternalCOV.g:438:1: rule__DomainSpecificCoverage__Group__0__Impl : ( 'DomainSpecificCoverage' ) ;
    public final void rule__DomainSpecificCoverage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:442:1: ( ( 'DomainSpecificCoverage' ) )
            // InternalCOV.g:443:1: ( 'DomainSpecificCoverage' )
            {
            // InternalCOV.g:443:1: ( 'DomainSpecificCoverage' )
            // InternalCOV.g:444:2: 'DomainSpecificCoverage'
            {
             before(grammarAccess.getDomainSpecificCoverageAccess().getDomainSpecificCoverageKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getDomainSpecificCoverageAccess().getDomainSpecificCoverageKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DomainSpecificCoverage__Group__0__Impl"


    // $ANTLR start "rule__DomainSpecificCoverage__Group__1"
    // InternalCOV.g:453:1: rule__DomainSpecificCoverage__Group__1 : rule__DomainSpecificCoverage__Group__1__Impl rule__DomainSpecificCoverage__Group__2 ;
    public final void rule__DomainSpecificCoverage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:457:1: ( rule__DomainSpecificCoverage__Group__1__Impl rule__DomainSpecificCoverage__Group__2 )
            // InternalCOV.g:458:2: rule__DomainSpecificCoverage__Group__1__Impl rule__DomainSpecificCoverage__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__DomainSpecificCoverage__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DomainSpecificCoverage__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DomainSpecificCoverage__Group__1"


    // $ANTLR start "rule__DomainSpecificCoverage__Group__1__Impl"
    // InternalCOV.g:465:1: rule__DomainSpecificCoverage__Group__1__Impl : ( ( rule__DomainSpecificCoverage__NameAssignment_1 ) ) ;
    public final void rule__DomainSpecificCoverage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:469:1: ( ( ( rule__DomainSpecificCoverage__NameAssignment_1 ) ) )
            // InternalCOV.g:470:1: ( ( rule__DomainSpecificCoverage__NameAssignment_1 ) )
            {
            // InternalCOV.g:470:1: ( ( rule__DomainSpecificCoverage__NameAssignment_1 ) )
            // InternalCOV.g:471:2: ( rule__DomainSpecificCoverage__NameAssignment_1 )
            {
             before(grammarAccess.getDomainSpecificCoverageAccess().getNameAssignment_1()); 
            // InternalCOV.g:472:2: ( rule__DomainSpecificCoverage__NameAssignment_1 )
            // InternalCOV.g:472:3: rule__DomainSpecificCoverage__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DomainSpecificCoverage__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDomainSpecificCoverageAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DomainSpecificCoverage__Group__1__Impl"


    // $ANTLR start "rule__DomainSpecificCoverage__Group__2"
    // InternalCOV.g:480:1: rule__DomainSpecificCoverage__Group__2 : rule__DomainSpecificCoverage__Group__2__Impl rule__DomainSpecificCoverage__Group__3 ;
    public final void rule__DomainSpecificCoverage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:484:1: ( rule__DomainSpecificCoverage__Group__2__Impl rule__DomainSpecificCoverage__Group__3 )
            // InternalCOV.g:485:2: rule__DomainSpecificCoverage__Group__2__Impl rule__DomainSpecificCoverage__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__DomainSpecificCoverage__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DomainSpecificCoverage__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DomainSpecificCoverage__Group__2"


    // $ANTLR start "rule__DomainSpecificCoverage__Group__2__Impl"
    // InternalCOV.g:492:1: rule__DomainSpecificCoverage__Group__2__Impl : ( '{' ) ;
    public final void rule__DomainSpecificCoverage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:496:1: ( ( '{' ) )
            // InternalCOV.g:497:1: ( '{' )
            {
            // InternalCOV.g:497:1: ( '{' )
            // InternalCOV.g:498:2: '{'
            {
             before(grammarAccess.getDomainSpecificCoverageAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getDomainSpecificCoverageAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DomainSpecificCoverage__Group__2__Impl"


    // $ANTLR start "rule__DomainSpecificCoverage__Group__3"
    // InternalCOV.g:507:1: rule__DomainSpecificCoverage__Group__3 : rule__DomainSpecificCoverage__Group__3__Impl rule__DomainSpecificCoverage__Group__4 ;
    public final void rule__DomainSpecificCoverage__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:511:1: ( rule__DomainSpecificCoverage__Group__3__Impl rule__DomainSpecificCoverage__Group__4 )
            // InternalCOV.g:512:2: rule__DomainSpecificCoverage__Group__3__Impl rule__DomainSpecificCoverage__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__DomainSpecificCoverage__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DomainSpecificCoverage__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DomainSpecificCoverage__Group__3"


    // $ANTLR start "rule__DomainSpecificCoverage__Group__3__Impl"
    // InternalCOV.g:519:1: rule__DomainSpecificCoverage__Group__3__Impl : ( 'Import' ) ;
    public final void rule__DomainSpecificCoverage__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:523:1: ( ( 'Import' ) )
            // InternalCOV.g:524:1: ( 'Import' )
            {
            // InternalCOV.g:524:1: ( 'Import' )
            // InternalCOV.g:525:2: 'Import'
            {
             before(grammarAccess.getDomainSpecificCoverageAccess().getImportKeyword_3()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getDomainSpecificCoverageAccess().getImportKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DomainSpecificCoverage__Group__3__Impl"


    // $ANTLR start "rule__DomainSpecificCoverage__Group__4"
    // InternalCOV.g:534:1: rule__DomainSpecificCoverage__Group__4 : rule__DomainSpecificCoverage__Group__4__Impl rule__DomainSpecificCoverage__Group__5 ;
    public final void rule__DomainSpecificCoverage__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:538:1: ( rule__DomainSpecificCoverage__Group__4__Impl rule__DomainSpecificCoverage__Group__5 )
            // InternalCOV.g:539:2: rule__DomainSpecificCoverage__Group__4__Impl rule__DomainSpecificCoverage__Group__5
            {
            pushFollow(FOLLOW_3);
            rule__DomainSpecificCoverage__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DomainSpecificCoverage__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DomainSpecificCoverage__Group__4"


    // $ANTLR start "rule__DomainSpecificCoverage__Group__4__Impl"
    // InternalCOV.g:546:1: rule__DomainSpecificCoverage__Group__4__Impl : ( 'metamodel' ) ;
    public final void rule__DomainSpecificCoverage__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:550:1: ( ( 'metamodel' ) )
            // InternalCOV.g:551:1: ( 'metamodel' )
            {
            // InternalCOV.g:551:1: ( 'metamodel' )
            // InternalCOV.g:552:2: 'metamodel'
            {
             before(grammarAccess.getDomainSpecificCoverageAccess().getMetamodelKeyword_4()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getDomainSpecificCoverageAccess().getMetamodelKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DomainSpecificCoverage__Group__4__Impl"


    // $ANTLR start "rule__DomainSpecificCoverage__Group__5"
    // InternalCOV.g:561:1: rule__DomainSpecificCoverage__Group__5 : rule__DomainSpecificCoverage__Group__5__Impl rule__DomainSpecificCoverage__Group__6 ;
    public final void rule__DomainSpecificCoverage__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:565:1: ( rule__DomainSpecificCoverage__Group__5__Impl rule__DomainSpecificCoverage__Group__6 )
            // InternalCOV.g:566:2: rule__DomainSpecificCoverage__Group__5__Impl rule__DomainSpecificCoverage__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__DomainSpecificCoverage__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DomainSpecificCoverage__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DomainSpecificCoverage__Group__5"


    // $ANTLR start "rule__DomainSpecificCoverage__Group__5__Impl"
    // InternalCOV.g:573:1: rule__DomainSpecificCoverage__Group__5__Impl : ( ( rule__DomainSpecificCoverage__MetamodelAssignment_5 ) ) ;
    public final void rule__DomainSpecificCoverage__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:577:1: ( ( ( rule__DomainSpecificCoverage__MetamodelAssignment_5 ) ) )
            // InternalCOV.g:578:1: ( ( rule__DomainSpecificCoverage__MetamodelAssignment_5 ) )
            {
            // InternalCOV.g:578:1: ( ( rule__DomainSpecificCoverage__MetamodelAssignment_5 ) )
            // InternalCOV.g:579:2: ( rule__DomainSpecificCoverage__MetamodelAssignment_5 )
            {
             before(grammarAccess.getDomainSpecificCoverageAccess().getMetamodelAssignment_5()); 
            // InternalCOV.g:580:2: ( rule__DomainSpecificCoverage__MetamodelAssignment_5 )
            // InternalCOV.g:580:3: rule__DomainSpecificCoverage__MetamodelAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__DomainSpecificCoverage__MetamodelAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getDomainSpecificCoverageAccess().getMetamodelAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DomainSpecificCoverage__Group__5__Impl"


    // $ANTLR start "rule__DomainSpecificCoverage__Group__6"
    // InternalCOV.g:588:1: rule__DomainSpecificCoverage__Group__6 : rule__DomainSpecificCoverage__Group__6__Impl rule__DomainSpecificCoverage__Group__7 ;
    public final void rule__DomainSpecificCoverage__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:592:1: ( rule__DomainSpecificCoverage__Group__6__Impl rule__DomainSpecificCoverage__Group__7 )
            // InternalCOV.g:593:2: rule__DomainSpecificCoverage__Group__6__Impl rule__DomainSpecificCoverage__Group__7
            {
            pushFollow(FOLLOW_8);
            rule__DomainSpecificCoverage__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DomainSpecificCoverage__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DomainSpecificCoverage__Group__6"


    // $ANTLR start "rule__DomainSpecificCoverage__Group__6__Impl"
    // InternalCOV.g:600:1: rule__DomainSpecificCoverage__Group__6__Impl : ( ( rule__DomainSpecificCoverage__ContextsAssignment_6 ) ) ;
    public final void rule__DomainSpecificCoverage__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:604:1: ( ( ( rule__DomainSpecificCoverage__ContextsAssignment_6 ) ) )
            // InternalCOV.g:605:1: ( ( rule__DomainSpecificCoverage__ContextsAssignment_6 ) )
            {
            // InternalCOV.g:605:1: ( ( rule__DomainSpecificCoverage__ContextsAssignment_6 ) )
            // InternalCOV.g:606:2: ( rule__DomainSpecificCoverage__ContextsAssignment_6 )
            {
             before(grammarAccess.getDomainSpecificCoverageAccess().getContextsAssignment_6()); 
            // InternalCOV.g:607:2: ( rule__DomainSpecificCoverage__ContextsAssignment_6 )
            // InternalCOV.g:607:3: rule__DomainSpecificCoverage__ContextsAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__DomainSpecificCoverage__ContextsAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getDomainSpecificCoverageAccess().getContextsAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DomainSpecificCoverage__Group__6__Impl"


    // $ANTLR start "rule__DomainSpecificCoverage__Group__7"
    // InternalCOV.g:615:1: rule__DomainSpecificCoverage__Group__7 : rule__DomainSpecificCoverage__Group__7__Impl rule__DomainSpecificCoverage__Group__8 ;
    public final void rule__DomainSpecificCoverage__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:619:1: ( rule__DomainSpecificCoverage__Group__7__Impl rule__DomainSpecificCoverage__Group__8 )
            // InternalCOV.g:620:2: rule__DomainSpecificCoverage__Group__7__Impl rule__DomainSpecificCoverage__Group__8
            {
            pushFollow(FOLLOW_8);
            rule__DomainSpecificCoverage__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DomainSpecificCoverage__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DomainSpecificCoverage__Group__7"


    // $ANTLR start "rule__DomainSpecificCoverage__Group__7__Impl"
    // InternalCOV.g:627:1: rule__DomainSpecificCoverage__Group__7__Impl : ( ( rule__DomainSpecificCoverage__Group_7__0 )* ) ;
    public final void rule__DomainSpecificCoverage__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:631:1: ( ( ( rule__DomainSpecificCoverage__Group_7__0 )* ) )
            // InternalCOV.g:632:1: ( ( rule__DomainSpecificCoverage__Group_7__0 )* )
            {
            // InternalCOV.g:632:1: ( ( rule__DomainSpecificCoverage__Group_7__0 )* )
            // InternalCOV.g:633:2: ( rule__DomainSpecificCoverage__Group_7__0 )*
            {
             before(grammarAccess.getDomainSpecificCoverageAccess().getGroup_7()); 
            // InternalCOV.g:634:2: ( rule__DomainSpecificCoverage__Group_7__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==22) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalCOV.g:634:3: rule__DomainSpecificCoverage__Group_7__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__DomainSpecificCoverage__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getDomainSpecificCoverageAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DomainSpecificCoverage__Group__7__Impl"


    // $ANTLR start "rule__DomainSpecificCoverage__Group__8"
    // InternalCOV.g:642:1: rule__DomainSpecificCoverage__Group__8 : rule__DomainSpecificCoverage__Group__8__Impl ;
    public final void rule__DomainSpecificCoverage__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:646:1: ( rule__DomainSpecificCoverage__Group__8__Impl )
            // InternalCOV.g:647:2: rule__DomainSpecificCoverage__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DomainSpecificCoverage__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DomainSpecificCoverage__Group__8"


    // $ANTLR start "rule__DomainSpecificCoverage__Group__8__Impl"
    // InternalCOV.g:653:1: rule__DomainSpecificCoverage__Group__8__Impl : ( '}' ) ;
    public final void rule__DomainSpecificCoverage__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:657:1: ( ( '}' ) )
            // InternalCOV.g:658:1: ( '}' )
            {
            // InternalCOV.g:658:1: ( '}' )
            // InternalCOV.g:659:2: '}'
            {
             before(grammarAccess.getDomainSpecificCoverageAccess().getRightCurlyBracketKeyword_8()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getDomainSpecificCoverageAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DomainSpecificCoverage__Group__8__Impl"


    // $ANTLR start "rule__DomainSpecificCoverage__Group_7__0"
    // InternalCOV.g:669:1: rule__DomainSpecificCoverage__Group_7__0 : rule__DomainSpecificCoverage__Group_7__0__Impl rule__DomainSpecificCoverage__Group_7__1 ;
    public final void rule__DomainSpecificCoverage__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:673:1: ( rule__DomainSpecificCoverage__Group_7__0__Impl rule__DomainSpecificCoverage__Group_7__1 )
            // InternalCOV.g:674:2: rule__DomainSpecificCoverage__Group_7__0__Impl rule__DomainSpecificCoverage__Group_7__1
            {
            pushFollow(FOLLOW_7);
            rule__DomainSpecificCoverage__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DomainSpecificCoverage__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DomainSpecificCoverage__Group_7__0"


    // $ANTLR start "rule__DomainSpecificCoverage__Group_7__0__Impl"
    // InternalCOV.g:681:1: rule__DomainSpecificCoverage__Group_7__0__Impl : ( ',' ) ;
    public final void rule__DomainSpecificCoverage__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:685:1: ( ( ',' ) )
            // InternalCOV.g:686:1: ( ',' )
            {
            // InternalCOV.g:686:1: ( ',' )
            // InternalCOV.g:687:2: ','
            {
             before(grammarAccess.getDomainSpecificCoverageAccess().getCommaKeyword_7_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getDomainSpecificCoverageAccess().getCommaKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DomainSpecificCoverage__Group_7__0__Impl"


    // $ANTLR start "rule__DomainSpecificCoverage__Group_7__1"
    // InternalCOV.g:696:1: rule__DomainSpecificCoverage__Group_7__1 : rule__DomainSpecificCoverage__Group_7__1__Impl ;
    public final void rule__DomainSpecificCoverage__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:700:1: ( rule__DomainSpecificCoverage__Group_7__1__Impl )
            // InternalCOV.g:701:2: rule__DomainSpecificCoverage__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DomainSpecificCoverage__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DomainSpecificCoverage__Group_7__1"


    // $ANTLR start "rule__DomainSpecificCoverage__Group_7__1__Impl"
    // InternalCOV.g:707:1: rule__DomainSpecificCoverage__Group_7__1__Impl : ( ( rule__DomainSpecificCoverage__ContextsAssignment_7_1 ) ) ;
    public final void rule__DomainSpecificCoverage__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:711:1: ( ( ( rule__DomainSpecificCoverage__ContextsAssignment_7_1 ) ) )
            // InternalCOV.g:712:1: ( ( rule__DomainSpecificCoverage__ContextsAssignment_7_1 ) )
            {
            // InternalCOV.g:712:1: ( ( rule__DomainSpecificCoverage__ContextsAssignment_7_1 ) )
            // InternalCOV.g:713:2: ( rule__DomainSpecificCoverage__ContextsAssignment_7_1 )
            {
             before(grammarAccess.getDomainSpecificCoverageAccess().getContextsAssignment_7_1()); 
            // InternalCOV.g:714:2: ( rule__DomainSpecificCoverage__ContextsAssignment_7_1 )
            // InternalCOV.g:714:3: rule__DomainSpecificCoverage__ContextsAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__DomainSpecificCoverage__ContextsAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getDomainSpecificCoverageAccess().getContextsAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DomainSpecificCoverage__Group_7__1__Impl"


    // $ANTLR start "rule__Context__Group__0"
    // InternalCOV.g:723:1: rule__Context__Group__0 : rule__Context__Group__0__Impl rule__Context__Group__1 ;
    public final void rule__Context__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:727:1: ( rule__Context__Group__0__Impl rule__Context__Group__1 )
            // InternalCOV.g:728:2: rule__Context__Group__0__Impl rule__Context__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Context__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Context__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__Group__0"


    // $ANTLR start "rule__Context__Group__0__Impl"
    // InternalCOV.g:735:1: rule__Context__Group__0__Impl : ( 'Context' ) ;
    public final void rule__Context__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:739:1: ( ( 'Context' ) )
            // InternalCOV.g:740:1: ( 'Context' )
            {
            // InternalCOV.g:740:1: ( 'Context' )
            // InternalCOV.g:741:2: 'Context'
            {
             before(grammarAccess.getContextAccess().getContextKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getContextAccess().getContextKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__Group__0__Impl"


    // $ANTLR start "rule__Context__Group__1"
    // InternalCOV.g:750:1: rule__Context__Group__1 : rule__Context__Group__1__Impl rule__Context__Group__2 ;
    public final void rule__Context__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:754:1: ( rule__Context__Group__1__Impl rule__Context__Group__2 )
            // InternalCOV.g:755:2: rule__Context__Group__1__Impl rule__Context__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Context__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Context__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__Group__1"


    // $ANTLR start "rule__Context__Group__1__Impl"
    // InternalCOV.g:762:1: rule__Context__Group__1__Impl : ( ( rule__Context__MetaclassAssignment_1 ) ) ;
    public final void rule__Context__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:766:1: ( ( ( rule__Context__MetaclassAssignment_1 ) ) )
            // InternalCOV.g:767:1: ( ( rule__Context__MetaclassAssignment_1 ) )
            {
            // InternalCOV.g:767:1: ( ( rule__Context__MetaclassAssignment_1 ) )
            // InternalCOV.g:768:2: ( rule__Context__MetaclassAssignment_1 )
            {
             before(grammarAccess.getContextAccess().getMetaclassAssignment_1()); 
            // InternalCOV.g:769:2: ( rule__Context__MetaclassAssignment_1 )
            // InternalCOV.g:769:3: rule__Context__MetaclassAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Context__MetaclassAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getContextAccess().getMetaclassAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__Group__1__Impl"


    // $ANTLR start "rule__Context__Group__2"
    // InternalCOV.g:777:1: rule__Context__Group__2 : rule__Context__Group__2__Impl rule__Context__Group__3 ;
    public final void rule__Context__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:781:1: ( rule__Context__Group__2__Impl rule__Context__Group__3 )
            // InternalCOV.g:782:2: rule__Context__Group__2__Impl rule__Context__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__Context__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Context__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__Group__2"


    // $ANTLR start "rule__Context__Group__2__Impl"
    // InternalCOV.g:789:1: rule__Context__Group__2__Impl : ( '{' ) ;
    public final void rule__Context__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:793:1: ( ( '{' ) )
            // InternalCOV.g:794:1: ( '{' )
            {
            // InternalCOV.g:794:1: ( '{' )
            // InternalCOV.g:795:2: '{'
            {
             before(grammarAccess.getContextAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getContextAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__Group__2__Impl"


    // $ANTLR start "rule__Context__Group__3"
    // InternalCOV.g:804:1: rule__Context__Group__3 : rule__Context__Group__3__Impl rule__Context__Group__4 ;
    public final void rule__Context__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:808:1: ( rule__Context__Group__3__Impl rule__Context__Group__4 )
            // InternalCOV.g:809:2: rule__Context__Group__3__Impl rule__Context__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__Context__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Context__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__Group__3"


    // $ANTLR start "rule__Context__Group__3__Impl"
    // InternalCOV.g:816:1: rule__Context__Group__3__Impl : ( ( rule__Context__Group_3__0 )? ) ;
    public final void rule__Context__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:820:1: ( ( ( rule__Context__Group_3__0 )? ) )
            // InternalCOV.g:821:1: ( ( rule__Context__Group_3__0 )? )
            {
            // InternalCOV.g:821:1: ( ( rule__Context__Group_3__0 )? )
            // InternalCOV.g:822:2: ( rule__Context__Group_3__0 )?
            {
             before(grammarAccess.getContextAccess().getGroup_3()); 
            // InternalCOV.g:823:2: ( rule__Context__Group_3__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==24||LA7_0==26||LA7_0==28||LA7_0==31) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalCOV.g:823:3: rule__Context__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Context__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getContextAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__Group__3__Impl"


    // $ANTLR start "rule__Context__Group__4"
    // InternalCOV.g:831:1: rule__Context__Group__4 : rule__Context__Group__4__Impl ;
    public final void rule__Context__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:835:1: ( rule__Context__Group__4__Impl )
            // InternalCOV.g:836:2: rule__Context__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Context__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__Group__4"


    // $ANTLR start "rule__Context__Group__4__Impl"
    // InternalCOV.g:842:1: rule__Context__Group__4__Impl : ( '}' ) ;
    public final void rule__Context__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:846:1: ( ( '}' ) )
            // InternalCOV.g:847:1: ( '}' )
            {
            // InternalCOV.g:847:1: ( '}' )
            // InternalCOV.g:848:2: '}'
            {
             before(grammarAccess.getContextAccess().getRightCurlyBracketKeyword_4()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getContextAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__Group__4__Impl"


    // $ANTLR start "rule__Context__Group_3__0"
    // InternalCOV.g:858:1: rule__Context__Group_3__0 : rule__Context__Group_3__0__Impl rule__Context__Group_3__1 ;
    public final void rule__Context__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:862:1: ( rule__Context__Group_3__0__Impl rule__Context__Group_3__1 )
            // InternalCOV.g:863:2: rule__Context__Group_3__0__Impl rule__Context__Group_3__1
            {
            pushFollow(FOLLOW_11);
            rule__Context__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Context__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__Group_3__0"


    // $ANTLR start "rule__Context__Group_3__0__Impl"
    // InternalCOV.g:870:1: rule__Context__Group_3__0__Impl : ( ( rule__Context__RulesAssignment_3_0 ) ) ;
    public final void rule__Context__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:874:1: ( ( ( rule__Context__RulesAssignment_3_0 ) ) )
            // InternalCOV.g:875:1: ( ( rule__Context__RulesAssignment_3_0 ) )
            {
            // InternalCOV.g:875:1: ( ( rule__Context__RulesAssignment_3_0 ) )
            // InternalCOV.g:876:2: ( rule__Context__RulesAssignment_3_0 )
            {
             before(grammarAccess.getContextAccess().getRulesAssignment_3_0()); 
            // InternalCOV.g:877:2: ( rule__Context__RulesAssignment_3_0 )
            // InternalCOV.g:877:3: rule__Context__RulesAssignment_3_0
            {
            pushFollow(FOLLOW_2);
            rule__Context__RulesAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getContextAccess().getRulesAssignment_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__Group_3__0__Impl"


    // $ANTLR start "rule__Context__Group_3__1"
    // InternalCOV.g:885:1: rule__Context__Group_3__1 : rule__Context__Group_3__1__Impl ;
    public final void rule__Context__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:889:1: ( rule__Context__Group_3__1__Impl )
            // InternalCOV.g:890:2: rule__Context__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Context__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__Group_3__1"


    // $ANTLR start "rule__Context__Group_3__1__Impl"
    // InternalCOV.g:896:1: rule__Context__Group_3__1__Impl : ( ( rule__Context__Group_3_1__0 )* ) ;
    public final void rule__Context__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:900:1: ( ( ( rule__Context__Group_3_1__0 )* ) )
            // InternalCOV.g:901:1: ( ( rule__Context__Group_3_1__0 )* )
            {
            // InternalCOV.g:901:1: ( ( rule__Context__Group_3_1__0 )* )
            // InternalCOV.g:902:2: ( rule__Context__Group_3_1__0 )*
            {
             before(grammarAccess.getContextAccess().getGroup_3_1()); 
            // InternalCOV.g:903:2: ( rule__Context__Group_3_1__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==22) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalCOV.g:903:3: rule__Context__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Context__Group_3_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getContextAccess().getGroup_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__Group_3__1__Impl"


    // $ANTLR start "rule__Context__Group_3_1__0"
    // InternalCOV.g:912:1: rule__Context__Group_3_1__0 : rule__Context__Group_3_1__0__Impl rule__Context__Group_3_1__1 ;
    public final void rule__Context__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:916:1: ( rule__Context__Group_3_1__0__Impl rule__Context__Group_3_1__1 )
            // InternalCOV.g:917:2: rule__Context__Group_3_1__0__Impl rule__Context__Group_3_1__1
            {
            pushFollow(FOLLOW_12);
            rule__Context__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Context__Group_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__Group_3_1__0"


    // $ANTLR start "rule__Context__Group_3_1__0__Impl"
    // InternalCOV.g:924:1: rule__Context__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__Context__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:928:1: ( ( ',' ) )
            // InternalCOV.g:929:1: ( ',' )
            {
            // InternalCOV.g:929:1: ( ',' )
            // InternalCOV.g:930:2: ','
            {
             before(grammarAccess.getContextAccess().getCommaKeyword_3_1_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getContextAccess().getCommaKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__Group_3_1__0__Impl"


    // $ANTLR start "rule__Context__Group_3_1__1"
    // InternalCOV.g:939:1: rule__Context__Group_3_1__1 : rule__Context__Group_3_1__1__Impl ;
    public final void rule__Context__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:943:1: ( rule__Context__Group_3_1__1__Impl )
            // InternalCOV.g:944:2: rule__Context__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Context__Group_3_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__Group_3_1__1"


    // $ANTLR start "rule__Context__Group_3_1__1__Impl"
    // InternalCOV.g:950:1: rule__Context__Group_3_1__1__Impl : ( ( rule__Context__RulesAssignment_3_1_1 ) ) ;
    public final void rule__Context__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:954:1: ( ( ( rule__Context__RulesAssignment_3_1_1 ) ) )
            // InternalCOV.g:955:1: ( ( rule__Context__RulesAssignment_3_1_1 ) )
            {
            // InternalCOV.g:955:1: ( ( rule__Context__RulesAssignment_3_1_1 ) )
            // InternalCOV.g:956:2: ( rule__Context__RulesAssignment_3_1_1 )
            {
             before(grammarAccess.getContextAccess().getRulesAssignment_3_1_1()); 
            // InternalCOV.g:957:2: ( rule__Context__RulesAssignment_3_1_1 )
            // InternalCOV.g:957:3: rule__Context__RulesAssignment_3_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Context__RulesAssignment_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getContextAccess().getRulesAssignment_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__Group_3_1__1__Impl"


    // $ANTLR start "rule__Ignore__Group__0"
    // InternalCOV.g:966:1: rule__Ignore__Group__0 : rule__Ignore__Group__0__Impl rule__Ignore__Group__1 ;
    public final void rule__Ignore__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:970:1: ( rule__Ignore__Group__0__Impl rule__Ignore__Group__1 )
            // InternalCOV.g:971:2: rule__Ignore__Group__0__Impl rule__Ignore__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Ignore__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ignore__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ignore__Group__0"


    // $ANTLR start "rule__Ignore__Group__0__Impl"
    // InternalCOV.g:978:1: rule__Ignore__Group__0__Impl : ( () ) ;
    public final void rule__Ignore__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:982:1: ( ( () ) )
            // InternalCOV.g:983:1: ( () )
            {
            // InternalCOV.g:983:1: ( () )
            // InternalCOV.g:984:2: ()
            {
             before(grammarAccess.getIgnoreAccess().getIgnoreAction_0()); 
            // InternalCOV.g:985:2: ()
            // InternalCOV.g:985:3: 
            {
            }

             after(grammarAccess.getIgnoreAccess().getIgnoreAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ignore__Group__0__Impl"


    // $ANTLR start "rule__Ignore__Group__1"
    // InternalCOV.g:993:1: rule__Ignore__Group__1 : rule__Ignore__Group__1__Impl rule__Ignore__Group__2 ;
    public final void rule__Ignore__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:997:1: ( rule__Ignore__Group__1__Impl rule__Ignore__Group__2 )
            // InternalCOV.g:998:2: rule__Ignore__Group__1__Impl rule__Ignore__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Ignore__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ignore__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ignore__Group__1"


    // $ANTLR start "rule__Ignore__Group__1__Impl"
    // InternalCOV.g:1005:1: rule__Ignore__Group__1__Impl : ( 'Ignore' ) ;
    public final void rule__Ignore__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1009:1: ( ( 'Ignore' ) )
            // InternalCOV.g:1010:1: ( 'Ignore' )
            {
            // InternalCOV.g:1010:1: ( 'Ignore' )
            // InternalCOV.g:1011:2: 'Ignore'
            {
             before(grammarAccess.getIgnoreAccess().getIgnoreKeyword_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getIgnoreAccess().getIgnoreKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ignore__Group__1__Impl"


    // $ANTLR start "rule__Ignore__Group__2"
    // InternalCOV.g:1020:1: rule__Ignore__Group__2 : rule__Ignore__Group__2__Impl rule__Ignore__Group__3 ;
    public final void rule__Ignore__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1024:1: ( rule__Ignore__Group__2__Impl rule__Ignore__Group__3 )
            // InternalCOV.g:1025:2: rule__Ignore__Group__2__Impl rule__Ignore__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__Ignore__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ignore__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ignore__Group__2"


    // $ANTLR start "rule__Ignore__Group__2__Impl"
    // InternalCOV.g:1032:1: rule__Ignore__Group__2__Impl : ( '{' ) ;
    public final void rule__Ignore__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1036:1: ( ( '{' ) )
            // InternalCOV.g:1037:1: ( '{' )
            {
            // InternalCOV.g:1037:1: ( '{' )
            // InternalCOV.g:1038:2: '{'
            {
             before(grammarAccess.getIgnoreAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getIgnoreAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ignore__Group__2__Impl"


    // $ANTLR start "rule__Ignore__Group__3"
    // InternalCOV.g:1047:1: rule__Ignore__Group__3 : rule__Ignore__Group__3__Impl rule__Ignore__Group__4 ;
    public final void rule__Ignore__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1051:1: ( rule__Ignore__Group__3__Impl rule__Ignore__Group__4 )
            // InternalCOV.g:1052:2: rule__Ignore__Group__3__Impl rule__Ignore__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__Ignore__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ignore__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ignore__Group__3"


    // $ANTLR start "rule__Ignore__Group__3__Impl"
    // InternalCOV.g:1059:1: rule__Ignore__Group__3__Impl : ( ( rule__Ignore__Group_3__0 )? ) ;
    public final void rule__Ignore__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1063:1: ( ( ( rule__Ignore__Group_3__0 )? ) )
            // InternalCOV.g:1064:1: ( ( rule__Ignore__Group_3__0 )? )
            {
            // InternalCOV.g:1064:1: ( ( rule__Ignore__Group_3__0 )? )
            // InternalCOV.g:1065:2: ( rule__Ignore__Group_3__0 )?
            {
             before(grammarAccess.getIgnoreAccess().getGroup_3()); 
            // InternalCOV.g:1066:2: ( rule__Ignore__Group_3__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==25) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalCOV.g:1066:3: rule__Ignore__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Ignore__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIgnoreAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ignore__Group__3__Impl"


    // $ANTLR start "rule__Ignore__Group__4"
    // InternalCOV.g:1074:1: rule__Ignore__Group__4 : rule__Ignore__Group__4__Impl ;
    public final void rule__Ignore__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1078:1: ( rule__Ignore__Group__4__Impl )
            // InternalCOV.g:1079:2: rule__Ignore__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Ignore__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ignore__Group__4"


    // $ANTLR start "rule__Ignore__Group__4__Impl"
    // InternalCOV.g:1085:1: rule__Ignore__Group__4__Impl : ( '}' ) ;
    public final void rule__Ignore__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1089:1: ( ( '}' ) )
            // InternalCOV.g:1090:1: ( '}' )
            {
            // InternalCOV.g:1090:1: ( '}' )
            // InternalCOV.g:1091:2: '}'
            {
             before(grammarAccess.getIgnoreAccess().getRightCurlyBracketKeyword_4()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getIgnoreAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ignore__Group__4__Impl"


    // $ANTLR start "rule__Ignore__Group_3__0"
    // InternalCOV.g:1101:1: rule__Ignore__Group_3__0 : rule__Ignore__Group_3__0__Impl rule__Ignore__Group_3__1 ;
    public final void rule__Ignore__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1105:1: ( rule__Ignore__Group_3__0__Impl rule__Ignore__Group_3__1 )
            // InternalCOV.g:1106:2: rule__Ignore__Group_3__0__Impl rule__Ignore__Group_3__1
            {
            pushFollow(FOLLOW_15);
            rule__Ignore__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ignore__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ignore__Group_3__0"


    // $ANTLR start "rule__Ignore__Group_3__0__Impl"
    // InternalCOV.g:1113:1: rule__Ignore__Group_3__0__Impl : ( 'ignoreSubtypes' ) ;
    public final void rule__Ignore__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1117:1: ( ( 'ignoreSubtypes' ) )
            // InternalCOV.g:1118:1: ( 'ignoreSubtypes' )
            {
            // InternalCOV.g:1118:1: ( 'ignoreSubtypes' )
            // InternalCOV.g:1119:2: 'ignoreSubtypes'
            {
             before(grammarAccess.getIgnoreAccess().getIgnoreSubtypesKeyword_3_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getIgnoreAccess().getIgnoreSubtypesKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ignore__Group_3__0__Impl"


    // $ANTLR start "rule__Ignore__Group_3__1"
    // InternalCOV.g:1128:1: rule__Ignore__Group_3__1 : rule__Ignore__Group_3__1__Impl ;
    public final void rule__Ignore__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1132:1: ( rule__Ignore__Group_3__1__Impl )
            // InternalCOV.g:1133:2: rule__Ignore__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Ignore__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ignore__Group_3__1"


    // $ANTLR start "rule__Ignore__Group_3__1__Impl"
    // InternalCOV.g:1139:1: rule__Ignore__Group_3__1__Impl : ( ( rule__Ignore__IgnoreSubtypesAssignment_3_1 ) ) ;
    public final void rule__Ignore__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1143:1: ( ( ( rule__Ignore__IgnoreSubtypesAssignment_3_1 ) ) )
            // InternalCOV.g:1144:1: ( ( rule__Ignore__IgnoreSubtypesAssignment_3_1 ) )
            {
            // InternalCOV.g:1144:1: ( ( rule__Ignore__IgnoreSubtypesAssignment_3_1 ) )
            // InternalCOV.g:1145:2: ( rule__Ignore__IgnoreSubtypesAssignment_3_1 )
            {
             before(grammarAccess.getIgnoreAccess().getIgnoreSubtypesAssignment_3_1()); 
            // InternalCOV.g:1146:2: ( rule__Ignore__IgnoreSubtypesAssignment_3_1 )
            // InternalCOV.g:1146:3: rule__Ignore__IgnoreSubtypesAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Ignore__IgnoreSubtypesAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getIgnoreAccess().getIgnoreSubtypesAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ignore__Group_3__1__Impl"


    // $ANTLR start "rule__CoverageOfReferenced__Group__0"
    // InternalCOV.g:1155:1: rule__CoverageOfReferenced__Group__0 : rule__CoverageOfReferenced__Group__0__Impl rule__CoverageOfReferenced__Group__1 ;
    public final void rule__CoverageOfReferenced__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1159:1: ( rule__CoverageOfReferenced__Group__0__Impl rule__CoverageOfReferenced__Group__1 )
            // InternalCOV.g:1160:2: rule__CoverageOfReferenced__Group__0__Impl rule__CoverageOfReferenced__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__CoverageOfReferenced__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CoverageOfReferenced__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoverageOfReferenced__Group__0"


    // $ANTLR start "rule__CoverageOfReferenced__Group__0__Impl"
    // InternalCOV.g:1167:1: rule__CoverageOfReferenced__Group__0__Impl : ( 'CoverageOfReferenced' ) ;
    public final void rule__CoverageOfReferenced__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1171:1: ( ( 'CoverageOfReferenced' ) )
            // InternalCOV.g:1172:1: ( 'CoverageOfReferenced' )
            {
            // InternalCOV.g:1172:1: ( 'CoverageOfReferenced' )
            // InternalCOV.g:1173:2: 'CoverageOfReferenced'
            {
             before(grammarAccess.getCoverageOfReferencedAccess().getCoverageOfReferencedKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getCoverageOfReferencedAccess().getCoverageOfReferencedKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoverageOfReferenced__Group__0__Impl"


    // $ANTLR start "rule__CoverageOfReferenced__Group__1"
    // InternalCOV.g:1182:1: rule__CoverageOfReferenced__Group__1 : rule__CoverageOfReferenced__Group__1__Impl rule__CoverageOfReferenced__Group__2 ;
    public final void rule__CoverageOfReferenced__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1186:1: ( rule__CoverageOfReferenced__Group__1__Impl rule__CoverageOfReferenced__Group__2 )
            // InternalCOV.g:1187:2: rule__CoverageOfReferenced__Group__1__Impl rule__CoverageOfReferenced__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__CoverageOfReferenced__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CoverageOfReferenced__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoverageOfReferenced__Group__1"


    // $ANTLR start "rule__CoverageOfReferenced__Group__1__Impl"
    // InternalCOV.g:1194:1: rule__CoverageOfReferenced__Group__1__Impl : ( '{' ) ;
    public final void rule__CoverageOfReferenced__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1198:1: ( ( '{' ) )
            // InternalCOV.g:1199:1: ( '{' )
            {
            // InternalCOV.g:1199:1: ( '{' )
            // InternalCOV.g:1200:2: '{'
            {
             before(grammarAccess.getCoverageOfReferencedAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getCoverageOfReferencedAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoverageOfReferenced__Group__1__Impl"


    // $ANTLR start "rule__CoverageOfReferenced__Group__2"
    // InternalCOV.g:1209:1: rule__CoverageOfReferenced__Group__2 : rule__CoverageOfReferenced__Group__2__Impl rule__CoverageOfReferenced__Group__3 ;
    public final void rule__CoverageOfReferenced__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1213:1: ( rule__CoverageOfReferenced__Group__2__Impl rule__CoverageOfReferenced__Group__3 )
            // InternalCOV.g:1214:2: rule__CoverageOfReferenced__Group__2__Impl rule__CoverageOfReferenced__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__CoverageOfReferenced__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CoverageOfReferenced__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoverageOfReferenced__Group__2"


    // $ANTLR start "rule__CoverageOfReferenced__Group__2__Impl"
    // InternalCOV.g:1221:1: rule__CoverageOfReferenced__Group__2__Impl : ( 'reference' ) ;
    public final void rule__CoverageOfReferenced__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1225:1: ( ( 'reference' ) )
            // InternalCOV.g:1226:1: ( 'reference' )
            {
            // InternalCOV.g:1226:1: ( 'reference' )
            // InternalCOV.g:1227:2: 'reference'
            {
             before(grammarAccess.getCoverageOfReferencedAccess().getReferenceKeyword_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getCoverageOfReferencedAccess().getReferenceKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoverageOfReferenced__Group__2__Impl"


    // $ANTLR start "rule__CoverageOfReferenced__Group__3"
    // InternalCOV.g:1236:1: rule__CoverageOfReferenced__Group__3 : rule__CoverageOfReferenced__Group__3__Impl rule__CoverageOfReferenced__Group__4 ;
    public final void rule__CoverageOfReferenced__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1240:1: ( rule__CoverageOfReferenced__Group__3__Impl rule__CoverageOfReferenced__Group__4 )
            // InternalCOV.g:1241:2: rule__CoverageOfReferenced__Group__3__Impl rule__CoverageOfReferenced__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__CoverageOfReferenced__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CoverageOfReferenced__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoverageOfReferenced__Group__3"


    // $ANTLR start "rule__CoverageOfReferenced__Group__3__Impl"
    // InternalCOV.g:1248:1: rule__CoverageOfReferenced__Group__3__Impl : ( ( rule__CoverageOfReferenced__ReferenceAssignment_3 ) ) ;
    public final void rule__CoverageOfReferenced__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1252:1: ( ( ( rule__CoverageOfReferenced__ReferenceAssignment_3 ) ) )
            // InternalCOV.g:1253:1: ( ( rule__CoverageOfReferenced__ReferenceAssignment_3 ) )
            {
            // InternalCOV.g:1253:1: ( ( rule__CoverageOfReferenced__ReferenceAssignment_3 ) )
            // InternalCOV.g:1254:2: ( rule__CoverageOfReferenced__ReferenceAssignment_3 )
            {
             before(grammarAccess.getCoverageOfReferencedAccess().getReferenceAssignment_3()); 
            // InternalCOV.g:1255:2: ( rule__CoverageOfReferenced__ReferenceAssignment_3 )
            // InternalCOV.g:1255:3: rule__CoverageOfReferenced__ReferenceAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__CoverageOfReferenced__ReferenceAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getCoverageOfReferencedAccess().getReferenceAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoverageOfReferenced__Group__3__Impl"


    // $ANTLR start "rule__CoverageOfReferenced__Group__4"
    // InternalCOV.g:1263:1: rule__CoverageOfReferenced__Group__4 : rule__CoverageOfReferenced__Group__4__Impl ;
    public final void rule__CoverageOfReferenced__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1267:1: ( rule__CoverageOfReferenced__Group__4__Impl )
            // InternalCOV.g:1268:2: rule__CoverageOfReferenced__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CoverageOfReferenced__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoverageOfReferenced__Group__4"


    // $ANTLR start "rule__CoverageOfReferenced__Group__4__Impl"
    // InternalCOV.g:1274:1: rule__CoverageOfReferenced__Group__4__Impl : ( '}' ) ;
    public final void rule__CoverageOfReferenced__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1278:1: ( ( '}' ) )
            // InternalCOV.g:1279:1: ( '}' )
            {
            // InternalCOV.g:1279:1: ( '}' )
            // InternalCOV.g:1280:2: '}'
            {
             before(grammarAccess.getCoverageOfReferencedAccess().getRightCurlyBracketKeyword_4()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getCoverageOfReferencedAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoverageOfReferenced__Group__4__Impl"


    // $ANTLR start "rule__CoverageByContent__Group__0"
    // InternalCOV.g:1290:1: rule__CoverageByContent__Group__0 : rule__CoverageByContent__Group__0__Impl rule__CoverageByContent__Group__1 ;
    public final void rule__CoverageByContent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1294:1: ( rule__CoverageByContent__Group__0__Impl rule__CoverageByContent__Group__1 )
            // InternalCOV.g:1295:2: rule__CoverageByContent__Group__0__Impl rule__CoverageByContent__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__CoverageByContent__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CoverageByContent__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoverageByContent__Group__0"


    // $ANTLR start "rule__CoverageByContent__Group__0__Impl"
    // InternalCOV.g:1302:1: rule__CoverageByContent__Group__0__Impl : ( 'CoverageByContent' ) ;
    public final void rule__CoverageByContent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1306:1: ( ( 'CoverageByContent' ) )
            // InternalCOV.g:1307:1: ( 'CoverageByContent' )
            {
            // InternalCOV.g:1307:1: ( 'CoverageByContent' )
            // InternalCOV.g:1308:2: 'CoverageByContent'
            {
             before(grammarAccess.getCoverageByContentAccess().getCoverageByContentKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getCoverageByContentAccess().getCoverageByContentKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoverageByContent__Group__0__Impl"


    // $ANTLR start "rule__CoverageByContent__Group__1"
    // InternalCOV.g:1317:1: rule__CoverageByContent__Group__1 : rule__CoverageByContent__Group__1__Impl rule__CoverageByContent__Group__2 ;
    public final void rule__CoverageByContent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1321:1: ( rule__CoverageByContent__Group__1__Impl rule__CoverageByContent__Group__2 )
            // InternalCOV.g:1322:2: rule__CoverageByContent__Group__1__Impl rule__CoverageByContent__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__CoverageByContent__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CoverageByContent__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoverageByContent__Group__1"


    // $ANTLR start "rule__CoverageByContent__Group__1__Impl"
    // InternalCOV.g:1329:1: rule__CoverageByContent__Group__1__Impl : ( '{' ) ;
    public final void rule__CoverageByContent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1333:1: ( ( '{' ) )
            // InternalCOV.g:1334:1: ( '{' )
            {
            // InternalCOV.g:1334:1: ( '{' )
            // InternalCOV.g:1335:2: '{'
            {
             before(grammarAccess.getCoverageByContentAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getCoverageByContentAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoverageByContent__Group__1__Impl"


    // $ANTLR start "rule__CoverageByContent__Group__2"
    // InternalCOV.g:1344:1: rule__CoverageByContent__Group__2 : rule__CoverageByContent__Group__2__Impl rule__CoverageByContent__Group__3 ;
    public final void rule__CoverageByContent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1348:1: ( rule__CoverageByContent__Group__2__Impl rule__CoverageByContent__Group__3 )
            // InternalCOV.g:1349:2: rule__CoverageByContent__Group__2__Impl rule__CoverageByContent__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__CoverageByContent__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CoverageByContent__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoverageByContent__Group__2"


    // $ANTLR start "rule__CoverageByContent__Group__2__Impl"
    // InternalCOV.g:1356:1: rule__CoverageByContent__Group__2__Impl : ( 'containmentReference' ) ;
    public final void rule__CoverageByContent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1360:1: ( ( 'containmentReference' ) )
            // InternalCOV.g:1361:1: ( 'containmentReference' )
            {
            // InternalCOV.g:1361:1: ( 'containmentReference' )
            // InternalCOV.g:1362:2: 'containmentReference'
            {
             before(grammarAccess.getCoverageByContentAccess().getContainmentReferenceKeyword_2()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getCoverageByContentAccess().getContainmentReferenceKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoverageByContent__Group__2__Impl"


    // $ANTLR start "rule__CoverageByContent__Group__3"
    // InternalCOV.g:1371:1: rule__CoverageByContent__Group__3 : rule__CoverageByContent__Group__3__Impl rule__CoverageByContent__Group__4 ;
    public final void rule__CoverageByContent__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1375:1: ( rule__CoverageByContent__Group__3__Impl rule__CoverageByContent__Group__4 )
            // InternalCOV.g:1376:2: rule__CoverageByContent__Group__3__Impl rule__CoverageByContent__Group__4
            {
            pushFollow(FOLLOW_19);
            rule__CoverageByContent__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CoverageByContent__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoverageByContent__Group__3"


    // $ANTLR start "rule__CoverageByContent__Group__3__Impl"
    // InternalCOV.g:1383:1: rule__CoverageByContent__Group__3__Impl : ( ( rule__CoverageByContent__ContainmentReferenceAssignment_3 ) ) ;
    public final void rule__CoverageByContent__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1387:1: ( ( ( rule__CoverageByContent__ContainmentReferenceAssignment_3 ) ) )
            // InternalCOV.g:1388:1: ( ( rule__CoverageByContent__ContainmentReferenceAssignment_3 ) )
            {
            // InternalCOV.g:1388:1: ( ( rule__CoverageByContent__ContainmentReferenceAssignment_3 ) )
            // InternalCOV.g:1389:2: ( rule__CoverageByContent__ContainmentReferenceAssignment_3 )
            {
             before(grammarAccess.getCoverageByContentAccess().getContainmentReferenceAssignment_3()); 
            // InternalCOV.g:1390:2: ( rule__CoverageByContent__ContainmentReferenceAssignment_3 )
            // InternalCOV.g:1390:3: rule__CoverageByContent__ContainmentReferenceAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__CoverageByContent__ContainmentReferenceAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getCoverageByContentAccess().getContainmentReferenceAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoverageByContent__Group__3__Impl"


    // $ANTLR start "rule__CoverageByContent__Group__4"
    // InternalCOV.g:1398:1: rule__CoverageByContent__Group__4 : rule__CoverageByContent__Group__4__Impl rule__CoverageByContent__Group__5 ;
    public final void rule__CoverageByContent__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1402:1: ( rule__CoverageByContent__Group__4__Impl rule__CoverageByContent__Group__5 )
            // InternalCOV.g:1403:2: rule__CoverageByContent__Group__4__Impl rule__CoverageByContent__Group__5
            {
            pushFollow(FOLLOW_20);
            rule__CoverageByContent__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CoverageByContent__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoverageByContent__Group__4"


    // $ANTLR start "rule__CoverageByContent__Group__4__Impl"
    // InternalCOV.g:1410:1: rule__CoverageByContent__Group__4__Impl : ( 'multiplicity' ) ;
    public final void rule__CoverageByContent__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1414:1: ( ( 'multiplicity' ) )
            // InternalCOV.g:1415:1: ( 'multiplicity' )
            {
            // InternalCOV.g:1415:1: ( 'multiplicity' )
            // InternalCOV.g:1416:2: 'multiplicity'
            {
             before(grammarAccess.getCoverageByContentAccess().getMultiplicityKeyword_4()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getCoverageByContentAccess().getMultiplicityKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoverageByContent__Group__4__Impl"


    // $ANTLR start "rule__CoverageByContent__Group__5"
    // InternalCOV.g:1425:1: rule__CoverageByContent__Group__5 : rule__CoverageByContent__Group__5__Impl rule__CoverageByContent__Group__6 ;
    public final void rule__CoverageByContent__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1429:1: ( rule__CoverageByContent__Group__5__Impl rule__CoverageByContent__Group__6 )
            // InternalCOV.g:1430:2: rule__CoverageByContent__Group__5__Impl rule__CoverageByContent__Group__6
            {
            pushFollow(FOLLOW_17);
            rule__CoverageByContent__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CoverageByContent__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoverageByContent__Group__5"


    // $ANTLR start "rule__CoverageByContent__Group__5__Impl"
    // InternalCOV.g:1437:1: rule__CoverageByContent__Group__5__Impl : ( ( rule__CoverageByContent__MultiplicityAssignment_5 ) ) ;
    public final void rule__CoverageByContent__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1441:1: ( ( ( rule__CoverageByContent__MultiplicityAssignment_5 ) ) )
            // InternalCOV.g:1442:1: ( ( rule__CoverageByContent__MultiplicityAssignment_5 ) )
            {
            // InternalCOV.g:1442:1: ( ( rule__CoverageByContent__MultiplicityAssignment_5 ) )
            // InternalCOV.g:1443:2: ( rule__CoverageByContent__MultiplicityAssignment_5 )
            {
             before(grammarAccess.getCoverageByContentAccess().getMultiplicityAssignment_5()); 
            // InternalCOV.g:1444:2: ( rule__CoverageByContent__MultiplicityAssignment_5 )
            // InternalCOV.g:1444:3: rule__CoverageByContent__MultiplicityAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__CoverageByContent__MultiplicityAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getCoverageByContentAccess().getMultiplicityAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoverageByContent__Group__5__Impl"


    // $ANTLR start "rule__CoverageByContent__Group__6"
    // InternalCOV.g:1452:1: rule__CoverageByContent__Group__6 : rule__CoverageByContent__Group__6__Impl ;
    public final void rule__CoverageByContent__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1456:1: ( rule__CoverageByContent__Group__6__Impl )
            // InternalCOV.g:1457:2: rule__CoverageByContent__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CoverageByContent__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoverageByContent__Group__6"


    // $ANTLR start "rule__CoverageByContent__Group__6__Impl"
    // InternalCOV.g:1463:1: rule__CoverageByContent__Group__6__Impl : ( '}' ) ;
    public final void rule__CoverageByContent__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1467:1: ( ( '}' ) )
            // InternalCOV.g:1468:1: ( '}' )
            {
            // InternalCOV.g:1468:1: ( '}' )
            // InternalCOV.g:1469:2: '}'
            {
             before(grammarAccess.getCoverageByContentAccess().getRightCurlyBracketKeyword_6()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getCoverageByContentAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoverageByContent__Group__6__Impl"


    // $ANTLR start "rule__ConditionalIgnore__Group__0"
    // InternalCOV.g:1479:1: rule__ConditionalIgnore__Group__0 : rule__ConditionalIgnore__Group__0__Impl rule__ConditionalIgnore__Group__1 ;
    public final void rule__ConditionalIgnore__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1483:1: ( rule__ConditionalIgnore__Group__0__Impl rule__ConditionalIgnore__Group__1 )
            // InternalCOV.g:1484:2: rule__ConditionalIgnore__Group__0__Impl rule__ConditionalIgnore__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__ConditionalIgnore__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConditionalIgnore__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalIgnore__Group__0"


    // $ANTLR start "rule__ConditionalIgnore__Group__0__Impl"
    // InternalCOV.g:1491:1: rule__ConditionalIgnore__Group__0__Impl : ( 'ConditionalIgnore' ) ;
    public final void rule__ConditionalIgnore__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1495:1: ( ( 'ConditionalIgnore' ) )
            // InternalCOV.g:1496:1: ( 'ConditionalIgnore' )
            {
            // InternalCOV.g:1496:1: ( 'ConditionalIgnore' )
            // InternalCOV.g:1497:2: 'ConditionalIgnore'
            {
             before(grammarAccess.getConditionalIgnoreAccess().getConditionalIgnoreKeyword_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getConditionalIgnoreAccess().getConditionalIgnoreKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalIgnore__Group__0__Impl"


    // $ANTLR start "rule__ConditionalIgnore__Group__1"
    // InternalCOV.g:1506:1: rule__ConditionalIgnore__Group__1 : rule__ConditionalIgnore__Group__1__Impl rule__ConditionalIgnore__Group__2 ;
    public final void rule__ConditionalIgnore__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1510:1: ( rule__ConditionalIgnore__Group__1__Impl rule__ConditionalIgnore__Group__2 )
            // InternalCOV.g:1511:2: rule__ConditionalIgnore__Group__1__Impl rule__ConditionalIgnore__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__ConditionalIgnore__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConditionalIgnore__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalIgnore__Group__1"


    // $ANTLR start "rule__ConditionalIgnore__Group__1__Impl"
    // InternalCOV.g:1518:1: rule__ConditionalIgnore__Group__1__Impl : ( '{' ) ;
    public final void rule__ConditionalIgnore__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1522:1: ( ( '{' ) )
            // InternalCOV.g:1523:1: ( '{' )
            {
            // InternalCOV.g:1523:1: ( '{' )
            // InternalCOV.g:1524:2: '{'
            {
             before(grammarAccess.getConditionalIgnoreAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getConditionalIgnoreAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalIgnore__Group__1__Impl"


    // $ANTLR start "rule__ConditionalIgnore__Group__2"
    // InternalCOV.g:1533:1: rule__ConditionalIgnore__Group__2 : rule__ConditionalIgnore__Group__2__Impl rule__ConditionalIgnore__Group__3 ;
    public final void rule__ConditionalIgnore__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1537:1: ( rule__ConditionalIgnore__Group__2__Impl rule__ConditionalIgnore__Group__3 )
            // InternalCOV.g:1538:2: rule__ConditionalIgnore__Group__2__Impl rule__ConditionalIgnore__Group__3
            {
            pushFollow(FOLLOW_22);
            rule__ConditionalIgnore__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConditionalIgnore__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalIgnore__Group__2"


    // $ANTLR start "rule__ConditionalIgnore__Group__2__Impl"
    // InternalCOV.g:1545:1: rule__ConditionalIgnore__Group__2__Impl : ( 'condition' ) ;
    public final void rule__ConditionalIgnore__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1549:1: ( ( 'condition' ) )
            // InternalCOV.g:1550:1: ( 'condition' )
            {
            // InternalCOV.g:1550:1: ( 'condition' )
            // InternalCOV.g:1551:2: 'condition'
            {
             before(grammarAccess.getConditionalIgnoreAccess().getConditionKeyword_2()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getConditionalIgnoreAccess().getConditionKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalIgnore__Group__2__Impl"


    // $ANTLR start "rule__ConditionalIgnore__Group__3"
    // InternalCOV.g:1560:1: rule__ConditionalIgnore__Group__3 : rule__ConditionalIgnore__Group__3__Impl rule__ConditionalIgnore__Group__4 ;
    public final void rule__ConditionalIgnore__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1564:1: ( rule__ConditionalIgnore__Group__3__Impl rule__ConditionalIgnore__Group__4 )
            // InternalCOV.g:1565:2: rule__ConditionalIgnore__Group__3__Impl rule__ConditionalIgnore__Group__4
            {
            pushFollow(FOLLOW_23);
            rule__ConditionalIgnore__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConditionalIgnore__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalIgnore__Group__3"


    // $ANTLR start "rule__ConditionalIgnore__Group__3__Impl"
    // InternalCOV.g:1572:1: rule__ConditionalIgnore__Group__3__Impl : ( ( rule__ConditionalIgnore__ConditionAssignment_3 ) ) ;
    public final void rule__ConditionalIgnore__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1576:1: ( ( ( rule__ConditionalIgnore__ConditionAssignment_3 ) ) )
            // InternalCOV.g:1577:1: ( ( rule__ConditionalIgnore__ConditionAssignment_3 ) )
            {
            // InternalCOV.g:1577:1: ( ( rule__ConditionalIgnore__ConditionAssignment_3 ) )
            // InternalCOV.g:1578:2: ( rule__ConditionalIgnore__ConditionAssignment_3 )
            {
             before(grammarAccess.getConditionalIgnoreAccess().getConditionAssignment_3()); 
            // InternalCOV.g:1579:2: ( rule__ConditionalIgnore__ConditionAssignment_3 )
            // InternalCOV.g:1579:3: rule__ConditionalIgnore__ConditionAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ConditionalIgnore__ConditionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getConditionalIgnoreAccess().getConditionAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalIgnore__Group__3__Impl"


    // $ANTLR start "rule__ConditionalIgnore__Group__4"
    // InternalCOV.g:1587:1: rule__ConditionalIgnore__Group__4 : rule__ConditionalIgnore__Group__4__Impl rule__ConditionalIgnore__Group__5 ;
    public final void rule__ConditionalIgnore__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1591:1: ( rule__ConditionalIgnore__Group__4__Impl rule__ConditionalIgnore__Group__5 )
            // InternalCOV.g:1592:2: rule__ConditionalIgnore__Group__4__Impl rule__ConditionalIgnore__Group__5
            {
            pushFollow(FOLLOW_24);
            rule__ConditionalIgnore__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConditionalIgnore__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalIgnore__Group__4"


    // $ANTLR start "rule__ConditionalIgnore__Group__4__Impl"
    // InternalCOV.g:1599:1: rule__ConditionalIgnore__Group__4__Impl : ( 'containerType' ) ;
    public final void rule__ConditionalIgnore__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1603:1: ( ( 'containerType' ) )
            // InternalCOV.g:1604:1: ( 'containerType' )
            {
            // InternalCOV.g:1604:1: ( 'containerType' )
            // InternalCOV.g:1605:2: 'containerType'
            {
             before(grammarAccess.getConditionalIgnoreAccess().getContainerTypeKeyword_4()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getConditionalIgnoreAccess().getContainerTypeKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalIgnore__Group__4__Impl"


    // $ANTLR start "rule__ConditionalIgnore__Group__5"
    // InternalCOV.g:1614:1: rule__ConditionalIgnore__Group__5 : rule__ConditionalIgnore__Group__5__Impl rule__ConditionalIgnore__Group__6 ;
    public final void rule__ConditionalIgnore__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1618:1: ( rule__ConditionalIgnore__Group__5__Impl rule__ConditionalIgnore__Group__6 )
            // InternalCOV.g:1619:2: rule__ConditionalIgnore__Group__5__Impl rule__ConditionalIgnore__Group__6
            {
            pushFollow(FOLLOW_3);
            rule__ConditionalIgnore__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConditionalIgnore__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalIgnore__Group__5"


    // $ANTLR start "rule__ConditionalIgnore__Group__5__Impl"
    // InternalCOV.g:1626:1: rule__ConditionalIgnore__Group__5__Impl : ( '(' ) ;
    public final void rule__ConditionalIgnore__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1630:1: ( ( '(' ) )
            // InternalCOV.g:1631:1: ( '(' )
            {
            // InternalCOV.g:1631:1: ( '(' )
            // InternalCOV.g:1632:2: '('
            {
             before(grammarAccess.getConditionalIgnoreAccess().getLeftParenthesisKeyword_5()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getConditionalIgnoreAccess().getLeftParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalIgnore__Group__5__Impl"


    // $ANTLR start "rule__ConditionalIgnore__Group__6"
    // InternalCOV.g:1641:1: rule__ConditionalIgnore__Group__6 : rule__ConditionalIgnore__Group__6__Impl rule__ConditionalIgnore__Group__7 ;
    public final void rule__ConditionalIgnore__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1645:1: ( rule__ConditionalIgnore__Group__6__Impl rule__ConditionalIgnore__Group__7 )
            // InternalCOV.g:1646:2: rule__ConditionalIgnore__Group__6__Impl rule__ConditionalIgnore__Group__7
            {
            pushFollow(FOLLOW_25);
            rule__ConditionalIgnore__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConditionalIgnore__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalIgnore__Group__6"


    // $ANTLR start "rule__ConditionalIgnore__Group__6__Impl"
    // InternalCOV.g:1653:1: rule__ConditionalIgnore__Group__6__Impl : ( ( rule__ConditionalIgnore__ContainerTypeAssignment_6 ) ) ;
    public final void rule__ConditionalIgnore__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1657:1: ( ( ( rule__ConditionalIgnore__ContainerTypeAssignment_6 ) ) )
            // InternalCOV.g:1658:1: ( ( rule__ConditionalIgnore__ContainerTypeAssignment_6 ) )
            {
            // InternalCOV.g:1658:1: ( ( rule__ConditionalIgnore__ContainerTypeAssignment_6 ) )
            // InternalCOV.g:1659:2: ( rule__ConditionalIgnore__ContainerTypeAssignment_6 )
            {
             before(grammarAccess.getConditionalIgnoreAccess().getContainerTypeAssignment_6()); 
            // InternalCOV.g:1660:2: ( rule__ConditionalIgnore__ContainerTypeAssignment_6 )
            // InternalCOV.g:1660:3: rule__ConditionalIgnore__ContainerTypeAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__ConditionalIgnore__ContainerTypeAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getConditionalIgnoreAccess().getContainerTypeAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalIgnore__Group__6__Impl"


    // $ANTLR start "rule__ConditionalIgnore__Group__7"
    // InternalCOV.g:1668:1: rule__ConditionalIgnore__Group__7 : rule__ConditionalIgnore__Group__7__Impl rule__ConditionalIgnore__Group__8 ;
    public final void rule__ConditionalIgnore__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1672:1: ( rule__ConditionalIgnore__Group__7__Impl rule__ConditionalIgnore__Group__8 )
            // InternalCOV.g:1673:2: rule__ConditionalIgnore__Group__7__Impl rule__ConditionalIgnore__Group__8
            {
            pushFollow(FOLLOW_25);
            rule__ConditionalIgnore__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConditionalIgnore__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalIgnore__Group__7"


    // $ANTLR start "rule__ConditionalIgnore__Group__7__Impl"
    // InternalCOV.g:1680:1: rule__ConditionalIgnore__Group__7__Impl : ( ( rule__ConditionalIgnore__Group_7__0 )* ) ;
    public final void rule__ConditionalIgnore__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1684:1: ( ( ( rule__ConditionalIgnore__Group_7__0 )* ) )
            // InternalCOV.g:1685:1: ( ( rule__ConditionalIgnore__Group_7__0 )* )
            {
            // InternalCOV.g:1685:1: ( ( rule__ConditionalIgnore__Group_7__0 )* )
            // InternalCOV.g:1686:2: ( rule__ConditionalIgnore__Group_7__0 )*
            {
             before(grammarAccess.getConditionalIgnoreAccess().getGroup_7()); 
            // InternalCOV.g:1687:2: ( rule__ConditionalIgnore__Group_7__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==22) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalCOV.g:1687:3: rule__ConditionalIgnore__Group_7__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__ConditionalIgnore__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getConditionalIgnoreAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalIgnore__Group__7__Impl"


    // $ANTLR start "rule__ConditionalIgnore__Group__8"
    // InternalCOV.g:1695:1: rule__ConditionalIgnore__Group__8 : rule__ConditionalIgnore__Group__8__Impl rule__ConditionalIgnore__Group__9 ;
    public final void rule__ConditionalIgnore__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1699:1: ( rule__ConditionalIgnore__Group__8__Impl rule__ConditionalIgnore__Group__9 )
            // InternalCOV.g:1700:2: rule__ConditionalIgnore__Group__8__Impl rule__ConditionalIgnore__Group__9
            {
            pushFollow(FOLLOW_17);
            rule__ConditionalIgnore__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConditionalIgnore__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalIgnore__Group__8"


    // $ANTLR start "rule__ConditionalIgnore__Group__8__Impl"
    // InternalCOV.g:1707:1: rule__ConditionalIgnore__Group__8__Impl : ( ')' ) ;
    public final void rule__ConditionalIgnore__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1711:1: ( ( ')' ) )
            // InternalCOV.g:1712:1: ( ')' )
            {
            // InternalCOV.g:1712:1: ( ')' )
            // InternalCOV.g:1713:2: ')'
            {
             before(grammarAccess.getConditionalIgnoreAccess().getRightParenthesisKeyword_8()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getConditionalIgnoreAccess().getRightParenthesisKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalIgnore__Group__8__Impl"


    // $ANTLR start "rule__ConditionalIgnore__Group__9"
    // InternalCOV.g:1722:1: rule__ConditionalIgnore__Group__9 : rule__ConditionalIgnore__Group__9__Impl ;
    public final void rule__ConditionalIgnore__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1726:1: ( rule__ConditionalIgnore__Group__9__Impl )
            // InternalCOV.g:1727:2: rule__ConditionalIgnore__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConditionalIgnore__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalIgnore__Group__9"


    // $ANTLR start "rule__ConditionalIgnore__Group__9__Impl"
    // InternalCOV.g:1733:1: rule__ConditionalIgnore__Group__9__Impl : ( '}' ) ;
    public final void rule__ConditionalIgnore__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1737:1: ( ( '}' ) )
            // InternalCOV.g:1738:1: ( '}' )
            {
            // InternalCOV.g:1738:1: ( '}' )
            // InternalCOV.g:1739:2: '}'
            {
             before(grammarAccess.getConditionalIgnoreAccess().getRightCurlyBracketKeyword_9()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getConditionalIgnoreAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalIgnore__Group__9__Impl"


    // $ANTLR start "rule__ConditionalIgnore__Group_7__0"
    // InternalCOV.g:1749:1: rule__ConditionalIgnore__Group_7__0 : rule__ConditionalIgnore__Group_7__0__Impl rule__ConditionalIgnore__Group_7__1 ;
    public final void rule__ConditionalIgnore__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1753:1: ( rule__ConditionalIgnore__Group_7__0__Impl rule__ConditionalIgnore__Group_7__1 )
            // InternalCOV.g:1754:2: rule__ConditionalIgnore__Group_7__0__Impl rule__ConditionalIgnore__Group_7__1
            {
            pushFollow(FOLLOW_3);
            rule__ConditionalIgnore__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConditionalIgnore__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalIgnore__Group_7__0"


    // $ANTLR start "rule__ConditionalIgnore__Group_7__0__Impl"
    // InternalCOV.g:1761:1: rule__ConditionalIgnore__Group_7__0__Impl : ( ',' ) ;
    public final void rule__ConditionalIgnore__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1765:1: ( ( ',' ) )
            // InternalCOV.g:1766:1: ( ',' )
            {
            // InternalCOV.g:1766:1: ( ',' )
            // InternalCOV.g:1767:2: ','
            {
             before(grammarAccess.getConditionalIgnoreAccess().getCommaKeyword_7_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getConditionalIgnoreAccess().getCommaKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalIgnore__Group_7__0__Impl"


    // $ANTLR start "rule__ConditionalIgnore__Group_7__1"
    // InternalCOV.g:1776:1: rule__ConditionalIgnore__Group_7__1 : rule__ConditionalIgnore__Group_7__1__Impl ;
    public final void rule__ConditionalIgnore__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1780:1: ( rule__ConditionalIgnore__Group_7__1__Impl )
            // InternalCOV.g:1781:2: rule__ConditionalIgnore__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConditionalIgnore__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalIgnore__Group_7__1"


    // $ANTLR start "rule__ConditionalIgnore__Group_7__1__Impl"
    // InternalCOV.g:1787:1: rule__ConditionalIgnore__Group_7__1__Impl : ( ( rule__ConditionalIgnore__ContainerTypeAssignment_7_1 ) ) ;
    public final void rule__ConditionalIgnore__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1791:1: ( ( ( rule__ConditionalIgnore__ContainerTypeAssignment_7_1 ) ) )
            // InternalCOV.g:1792:1: ( ( rule__ConditionalIgnore__ContainerTypeAssignment_7_1 ) )
            {
            // InternalCOV.g:1792:1: ( ( rule__ConditionalIgnore__ContainerTypeAssignment_7_1 ) )
            // InternalCOV.g:1793:2: ( rule__ConditionalIgnore__ContainerTypeAssignment_7_1 )
            {
             before(grammarAccess.getConditionalIgnoreAccess().getContainerTypeAssignment_7_1()); 
            // InternalCOV.g:1794:2: ( rule__ConditionalIgnore__ContainerTypeAssignment_7_1 )
            // InternalCOV.g:1794:3: rule__ConditionalIgnore__ContainerTypeAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__ConditionalIgnore__ContainerTypeAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getConditionalIgnoreAccess().getContainerTypeAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalIgnore__Group_7__1__Impl"


    // $ANTLR start "rule__DomainSpecificCoverage__NameAssignment_1"
    // InternalCOV.g:1803:1: rule__DomainSpecificCoverage__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__DomainSpecificCoverage__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1807:1: ( ( ruleEString ) )
            // InternalCOV.g:1808:2: ( ruleEString )
            {
            // InternalCOV.g:1808:2: ( ruleEString )
            // InternalCOV.g:1809:3: ruleEString
            {
             before(grammarAccess.getDomainSpecificCoverageAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDomainSpecificCoverageAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DomainSpecificCoverage__NameAssignment_1"


    // $ANTLR start "rule__DomainSpecificCoverage__MetamodelAssignment_5"
    // InternalCOV.g:1818:1: rule__DomainSpecificCoverage__MetamodelAssignment_5 : ( ( ruleEString ) ) ;
    public final void rule__DomainSpecificCoverage__MetamodelAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1822:1: ( ( ( ruleEString ) ) )
            // InternalCOV.g:1823:2: ( ( ruleEString ) )
            {
            // InternalCOV.g:1823:2: ( ( ruleEString ) )
            // InternalCOV.g:1824:3: ( ruleEString )
            {
             before(grammarAccess.getDomainSpecificCoverageAccess().getMetamodelEPackageCrossReference_5_0()); 
            // InternalCOV.g:1825:3: ( ruleEString )
            // InternalCOV.g:1826:4: ruleEString
            {
             before(grammarAccess.getDomainSpecificCoverageAccess().getMetamodelEPackageEStringParserRuleCall_5_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDomainSpecificCoverageAccess().getMetamodelEPackageEStringParserRuleCall_5_0_1()); 

            }

             after(grammarAccess.getDomainSpecificCoverageAccess().getMetamodelEPackageCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DomainSpecificCoverage__MetamodelAssignment_5"


    // $ANTLR start "rule__DomainSpecificCoverage__ContextsAssignment_6"
    // InternalCOV.g:1837:1: rule__DomainSpecificCoverage__ContextsAssignment_6 : ( ruleContext ) ;
    public final void rule__DomainSpecificCoverage__ContextsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1841:1: ( ( ruleContext ) )
            // InternalCOV.g:1842:2: ( ruleContext )
            {
            // InternalCOV.g:1842:2: ( ruleContext )
            // InternalCOV.g:1843:3: ruleContext
            {
             before(grammarAccess.getDomainSpecificCoverageAccess().getContextsContextParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleContext();

            state._fsp--;

             after(grammarAccess.getDomainSpecificCoverageAccess().getContextsContextParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DomainSpecificCoverage__ContextsAssignment_6"


    // $ANTLR start "rule__DomainSpecificCoverage__ContextsAssignment_7_1"
    // InternalCOV.g:1852:1: rule__DomainSpecificCoverage__ContextsAssignment_7_1 : ( ruleContext ) ;
    public final void rule__DomainSpecificCoverage__ContextsAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1856:1: ( ( ruleContext ) )
            // InternalCOV.g:1857:2: ( ruleContext )
            {
            // InternalCOV.g:1857:2: ( ruleContext )
            // InternalCOV.g:1858:3: ruleContext
            {
             before(grammarAccess.getDomainSpecificCoverageAccess().getContextsContextParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleContext();

            state._fsp--;

             after(grammarAccess.getDomainSpecificCoverageAccess().getContextsContextParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DomainSpecificCoverage__ContextsAssignment_7_1"


    // $ANTLR start "rule__Context__MetaclassAssignment_1"
    // InternalCOV.g:1867:1: rule__Context__MetaclassAssignment_1 : ( ( ruleEString ) ) ;
    public final void rule__Context__MetaclassAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1871:1: ( ( ( ruleEString ) ) )
            // InternalCOV.g:1872:2: ( ( ruleEString ) )
            {
            // InternalCOV.g:1872:2: ( ( ruleEString ) )
            // InternalCOV.g:1873:3: ( ruleEString )
            {
             before(grammarAccess.getContextAccess().getMetaclassEClassCrossReference_1_0()); 
            // InternalCOV.g:1874:3: ( ruleEString )
            // InternalCOV.g:1875:4: ruleEString
            {
             before(grammarAccess.getContextAccess().getMetaclassEClassEStringParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getContextAccess().getMetaclassEClassEStringParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getContextAccess().getMetaclassEClassCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__MetaclassAssignment_1"


    // $ANTLR start "rule__Context__RulesAssignment_3_0"
    // InternalCOV.g:1886:1: rule__Context__RulesAssignment_3_0 : ( ruleRule ) ;
    public final void rule__Context__RulesAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1890:1: ( ( ruleRule ) )
            // InternalCOV.g:1891:2: ( ruleRule )
            {
            // InternalCOV.g:1891:2: ( ruleRule )
            // InternalCOV.g:1892:3: ruleRule
            {
             before(grammarAccess.getContextAccess().getRulesRuleParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_2);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getContextAccess().getRulesRuleParserRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__RulesAssignment_3_0"


    // $ANTLR start "rule__Context__RulesAssignment_3_1_1"
    // InternalCOV.g:1901:1: rule__Context__RulesAssignment_3_1_1 : ( ruleRule ) ;
    public final void rule__Context__RulesAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1905:1: ( ( ruleRule ) )
            // InternalCOV.g:1906:2: ( ruleRule )
            {
            // InternalCOV.g:1906:2: ( ruleRule )
            // InternalCOV.g:1907:3: ruleRule
            {
             before(grammarAccess.getContextAccess().getRulesRuleParserRuleCall_3_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getContextAccess().getRulesRuleParserRuleCall_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__RulesAssignment_3_1_1"


    // $ANTLR start "rule__Ignore__IgnoreSubtypesAssignment_3_1"
    // InternalCOV.g:1916:1: rule__Ignore__IgnoreSubtypesAssignment_3_1 : ( ruleEBoolean ) ;
    public final void rule__Ignore__IgnoreSubtypesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1920:1: ( ( ruleEBoolean ) )
            // InternalCOV.g:1921:2: ( ruleEBoolean )
            {
            // InternalCOV.g:1921:2: ( ruleEBoolean )
            // InternalCOV.g:1922:3: ruleEBoolean
            {
             before(grammarAccess.getIgnoreAccess().getIgnoreSubtypesEBooleanParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getIgnoreAccess().getIgnoreSubtypesEBooleanParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ignore__IgnoreSubtypesAssignment_3_1"


    // $ANTLR start "rule__CoverageOfReferenced__ReferenceAssignment_3"
    // InternalCOV.g:1931:1: rule__CoverageOfReferenced__ReferenceAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__CoverageOfReferenced__ReferenceAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1935:1: ( ( ( ruleEString ) ) )
            // InternalCOV.g:1936:2: ( ( ruleEString ) )
            {
            // InternalCOV.g:1936:2: ( ( ruleEString ) )
            // InternalCOV.g:1937:3: ( ruleEString )
            {
             before(grammarAccess.getCoverageOfReferencedAccess().getReferenceEReferenceCrossReference_3_0()); 
            // InternalCOV.g:1938:3: ( ruleEString )
            // InternalCOV.g:1939:4: ruleEString
            {
             before(grammarAccess.getCoverageOfReferencedAccess().getReferenceEReferenceEStringParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCoverageOfReferencedAccess().getReferenceEReferenceEStringParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getCoverageOfReferencedAccess().getReferenceEReferenceCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoverageOfReferenced__ReferenceAssignment_3"


    // $ANTLR start "rule__CoverageByContent__ContainmentReferenceAssignment_3"
    // InternalCOV.g:1950:1: rule__CoverageByContent__ContainmentReferenceAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__CoverageByContent__ContainmentReferenceAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1954:1: ( ( ( ruleEString ) ) )
            // InternalCOV.g:1955:2: ( ( ruleEString ) )
            {
            // InternalCOV.g:1955:2: ( ( ruleEString ) )
            // InternalCOV.g:1956:3: ( ruleEString )
            {
             before(grammarAccess.getCoverageByContentAccess().getContainmentReferenceEReferenceCrossReference_3_0()); 
            // InternalCOV.g:1957:3: ( ruleEString )
            // InternalCOV.g:1958:4: ruleEString
            {
             before(grammarAccess.getCoverageByContentAccess().getContainmentReferenceEReferenceEStringParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCoverageByContentAccess().getContainmentReferenceEReferenceEStringParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getCoverageByContentAccess().getContainmentReferenceEReferenceCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoverageByContent__ContainmentReferenceAssignment_3"


    // $ANTLR start "rule__CoverageByContent__MultiplicityAssignment_5"
    // InternalCOV.g:1969:1: rule__CoverageByContent__MultiplicityAssignment_5 : ( ruleCoveredContents ) ;
    public final void rule__CoverageByContent__MultiplicityAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1973:1: ( ( ruleCoveredContents ) )
            // InternalCOV.g:1974:2: ( ruleCoveredContents )
            {
            // InternalCOV.g:1974:2: ( ruleCoveredContents )
            // InternalCOV.g:1975:3: ruleCoveredContents
            {
             before(grammarAccess.getCoverageByContentAccess().getMultiplicityCoveredContentsEnumRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleCoveredContents();

            state._fsp--;

             after(grammarAccess.getCoverageByContentAccess().getMultiplicityCoveredContentsEnumRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoverageByContent__MultiplicityAssignment_5"


    // $ANTLR start "rule__ConditionalIgnore__ConditionAssignment_3"
    // InternalCOV.g:1984:1: rule__ConditionalIgnore__ConditionAssignment_3 : ( ruleConditionType ) ;
    public final void rule__ConditionalIgnore__ConditionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1988:1: ( ( ruleConditionType ) )
            // InternalCOV.g:1989:2: ( ruleConditionType )
            {
            // InternalCOV.g:1989:2: ( ruleConditionType )
            // InternalCOV.g:1990:3: ruleConditionType
            {
             before(grammarAccess.getConditionalIgnoreAccess().getConditionConditionTypeEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleConditionType();

            state._fsp--;

             after(grammarAccess.getConditionalIgnoreAccess().getConditionConditionTypeEnumRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalIgnore__ConditionAssignment_3"


    // $ANTLR start "rule__ConditionalIgnore__ContainerTypeAssignment_6"
    // InternalCOV.g:1999:1: rule__ConditionalIgnore__ContainerTypeAssignment_6 : ( ( ruleEString ) ) ;
    public final void rule__ConditionalIgnore__ContainerTypeAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2003:1: ( ( ( ruleEString ) ) )
            // InternalCOV.g:2004:2: ( ( ruleEString ) )
            {
            // InternalCOV.g:2004:2: ( ( ruleEString ) )
            // InternalCOV.g:2005:3: ( ruleEString )
            {
             before(grammarAccess.getConditionalIgnoreAccess().getContainerTypeEClassCrossReference_6_0()); 
            // InternalCOV.g:2006:3: ( ruleEString )
            // InternalCOV.g:2007:4: ruleEString
            {
             before(grammarAccess.getConditionalIgnoreAccess().getContainerTypeEClassEStringParserRuleCall_6_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getConditionalIgnoreAccess().getContainerTypeEClassEStringParserRuleCall_6_0_1()); 

            }

             after(grammarAccess.getConditionalIgnoreAccess().getContainerTypeEClassCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalIgnore__ContainerTypeAssignment_6"


    // $ANTLR start "rule__ConditionalIgnore__ContainerTypeAssignment_7_1"
    // InternalCOV.g:2018:1: rule__ConditionalIgnore__ContainerTypeAssignment_7_1 : ( ( ruleEString ) ) ;
    public final void rule__ConditionalIgnore__ContainerTypeAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2022:1: ( ( ( ruleEString ) ) )
            // InternalCOV.g:2023:2: ( ( ruleEString ) )
            {
            // InternalCOV.g:2023:2: ( ( ruleEString ) )
            // InternalCOV.g:2024:3: ( ruleEString )
            {
             before(grammarAccess.getConditionalIgnoreAccess().getContainerTypeEClassCrossReference_7_1_0()); 
            // InternalCOV.g:2025:3: ( ruleEString )
            // InternalCOV.g:2026:4: ruleEString
            {
             before(grammarAccess.getConditionalIgnoreAccess().getContainerTypeEClassEStringParserRuleCall_7_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getConditionalIgnoreAccess().getContainerTypeEClassEStringParserRuleCall_7_1_0_1()); 

            }

             after(grammarAccess.getConditionalIgnoreAccess().getContainerTypeEClassCrossReference_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalIgnore__ContainerTypeAssignment_7_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000095200000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000095000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000002200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000800400000L});

}