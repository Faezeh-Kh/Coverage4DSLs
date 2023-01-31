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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'true'", "'false'", "'ALL'", "'ONE'", "'containedBy'", "'notContainedBy'", "'ruleset'", "'{'", "'import'", "'metamodel'", "'}'", "','", "'context'", "'ignore'", "'('", "')'", "'when'", "'subtypes'", "'description'", "'ignoreif'", "'covers'", "'covered'", "'iscovered'", "'branch'", "'else'"
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


    // $ANTLR start "entryRuleLimitedIgnore"
    // InternalCOV.g:203:1: entryRuleLimitedIgnore : ruleLimitedIgnore EOF ;
    public final void entryRuleLimitedIgnore() throws RecognitionException {
        try {
            // InternalCOV.g:204:1: ( ruleLimitedIgnore EOF )
            // InternalCOV.g:205:1: ruleLimitedIgnore EOF
            {
             before(grammarAccess.getLimitedIgnoreRule()); 
            pushFollow(FOLLOW_1);
            ruleLimitedIgnore();

            state._fsp--;

             after(grammarAccess.getLimitedIgnoreRule()); 
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
    // $ANTLR end "entryRuleLimitedIgnore"


    // $ANTLR start "ruleLimitedIgnore"
    // InternalCOV.g:212:1: ruleLimitedIgnore : ( ( rule__LimitedIgnore__Group__0 ) ) ;
    public final void ruleLimitedIgnore() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:216:2: ( ( ( rule__LimitedIgnore__Group__0 ) ) )
            // InternalCOV.g:217:2: ( ( rule__LimitedIgnore__Group__0 ) )
            {
            // InternalCOV.g:217:2: ( ( rule__LimitedIgnore__Group__0 ) )
            // InternalCOV.g:218:3: ( rule__LimitedIgnore__Group__0 )
            {
             before(grammarAccess.getLimitedIgnoreAccess().getGroup()); 
            // InternalCOV.g:219:3: ( rule__LimitedIgnore__Group__0 )
            // InternalCOV.g:219:4: rule__LimitedIgnore__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LimitedIgnore__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLimitedIgnoreAccess().getGroup()); 

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
    // $ANTLR end "ruleLimitedIgnore"


    // $ANTLR start "entryRuleCoverageOfReferenced"
    // InternalCOV.g:228:1: entryRuleCoverageOfReferenced : ruleCoverageOfReferenced EOF ;
    public final void entryRuleCoverageOfReferenced() throws RecognitionException {
        try {
            // InternalCOV.g:229:1: ( ruleCoverageOfReferenced EOF )
            // InternalCOV.g:230:1: ruleCoverageOfReferenced EOF
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
    // InternalCOV.g:237:1: ruleCoverageOfReferenced : ( ( rule__CoverageOfReferenced__Group__0 ) ) ;
    public final void ruleCoverageOfReferenced() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:241:2: ( ( ( rule__CoverageOfReferenced__Group__0 ) ) )
            // InternalCOV.g:242:2: ( ( rule__CoverageOfReferenced__Group__0 ) )
            {
            // InternalCOV.g:242:2: ( ( rule__CoverageOfReferenced__Group__0 ) )
            // InternalCOV.g:243:3: ( rule__CoverageOfReferenced__Group__0 )
            {
             before(grammarAccess.getCoverageOfReferencedAccess().getGroup()); 
            // InternalCOV.g:244:3: ( rule__CoverageOfReferenced__Group__0 )
            // InternalCOV.g:244:4: rule__CoverageOfReferenced__Group__0
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
    // InternalCOV.g:253:1: entryRuleCoverageByContent : ruleCoverageByContent EOF ;
    public final void entryRuleCoverageByContent() throws RecognitionException {
        try {
            // InternalCOV.g:254:1: ( ruleCoverageByContent EOF )
            // InternalCOV.g:255:1: ruleCoverageByContent EOF
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
    // InternalCOV.g:262:1: ruleCoverageByContent : ( ( rule__CoverageByContent__Group__0 ) ) ;
    public final void ruleCoverageByContent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:266:2: ( ( ( rule__CoverageByContent__Group__0 ) ) )
            // InternalCOV.g:267:2: ( ( rule__CoverageByContent__Group__0 ) )
            {
            // InternalCOV.g:267:2: ( ( rule__CoverageByContent__Group__0 ) )
            // InternalCOV.g:268:3: ( rule__CoverageByContent__Group__0 )
            {
             before(grammarAccess.getCoverageByContentAccess().getGroup()); 
            // InternalCOV.g:269:3: ( rule__CoverageByContent__Group__0 )
            // InternalCOV.g:269:4: rule__CoverageByContent__Group__0
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


    // $ANTLR start "entryRuleBranchSpecification"
    // InternalCOV.g:278:1: entryRuleBranchSpecification : ruleBranchSpecification EOF ;
    public final void entryRuleBranchSpecification() throws RecognitionException {
        try {
            // InternalCOV.g:279:1: ( ruleBranchSpecification EOF )
            // InternalCOV.g:280:1: ruleBranchSpecification EOF
            {
             before(grammarAccess.getBranchSpecificationRule()); 
            pushFollow(FOLLOW_1);
            ruleBranchSpecification();

            state._fsp--;

             after(grammarAccess.getBranchSpecificationRule()); 
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
    // $ANTLR end "entryRuleBranchSpecification"


    // $ANTLR start "ruleBranchSpecification"
    // InternalCOV.g:287:1: ruleBranchSpecification : ( ( rule__BranchSpecification__Group__0 ) ) ;
    public final void ruleBranchSpecification() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:291:2: ( ( ( rule__BranchSpecification__Group__0 ) ) )
            // InternalCOV.g:292:2: ( ( rule__BranchSpecification__Group__0 ) )
            {
            // InternalCOV.g:292:2: ( ( rule__BranchSpecification__Group__0 ) )
            // InternalCOV.g:293:3: ( rule__BranchSpecification__Group__0 )
            {
             before(grammarAccess.getBranchSpecificationAccess().getGroup()); 
            // InternalCOV.g:294:3: ( rule__BranchSpecification__Group__0 )
            // InternalCOV.g:294:4: rule__BranchSpecification__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BranchSpecification__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBranchSpecificationAccess().getGroup()); 

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
    // $ANTLR end "ruleBranchSpecification"


    // $ANTLR start "entryRuleBranch"
    // InternalCOV.g:303:1: entryRuleBranch : ruleBranch EOF ;
    public final void entryRuleBranch() throws RecognitionException {
        try {
            // InternalCOV.g:304:1: ( ruleBranch EOF )
            // InternalCOV.g:305:1: ruleBranch EOF
            {
             before(grammarAccess.getBranchRule()); 
            pushFollow(FOLLOW_1);
            ruleBranch();

            state._fsp--;

             after(grammarAccess.getBranchRule()); 
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
    // $ANTLR end "entryRuleBranch"


    // $ANTLR start "ruleBranch"
    // InternalCOV.g:312:1: ruleBranch : ( ( rule__Branch__Alternatives ) ) ;
    public final void ruleBranch() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:316:2: ( ( ( rule__Branch__Alternatives ) ) )
            // InternalCOV.g:317:2: ( ( rule__Branch__Alternatives ) )
            {
            // InternalCOV.g:317:2: ( ( rule__Branch__Alternatives ) )
            // InternalCOV.g:318:3: ( rule__Branch__Alternatives )
            {
             before(grammarAccess.getBranchAccess().getAlternatives()); 
            // InternalCOV.g:319:3: ( rule__Branch__Alternatives )
            // InternalCOV.g:319:4: rule__Branch__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Branch__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBranchAccess().getAlternatives()); 

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
    // $ANTLR end "ruleBranch"


    // $ANTLR start "entryRuleExplicitBranch"
    // InternalCOV.g:328:1: entryRuleExplicitBranch : ruleExplicitBranch EOF ;
    public final void entryRuleExplicitBranch() throws RecognitionException {
        try {
            // InternalCOV.g:329:1: ( ruleExplicitBranch EOF )
            // InternalCOV.g:330:1: ruleExplicitBranch EOF
            {
             before(grammarAccess.getExplicitBranchRule()); 
            pushFollow(FOLLOW_1);
            ruleExplicitBranch();

            state._fsp--;

             after(grammarAccess.getExplicitBranchRule()); 
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
    // $ANTLR end "entryRuleExplicitBranch"


    // $ANTLR start "ruleExplicitBranch"
    // InternalCOV.g:337:1: ruleExplicitBranch : ( ( rule__ExplicitBranch__Group__0 ) ) ;
    public final void ruleExplicitBranch() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:341:2: ( ( ( rule__ExplicitBranch__Group__0 ) ) )
            // InternalCOV.g:342:2: ( ( rule__ExplicitBranch__Group__0 ) )
            {
            // InternalCOV.g:342:2: ( ( rule__ExplicitBranch__Group__0 ) )
            // InternalCOV.g:343:3: ( rule__ExplicitBranch__Group__0 )
            {
             before(grammarAccess.getExplicitBranchAccess().getGroup()); 
            // InternalCOV.g:344:3: ( rule__ExplicitBranch__Group__0 )
            // InternalCOV.g:344:4: rule__ExplicitBranch__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExplicitBranch__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExplicitBranchAccess().getGroup()); 

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
    // $ANTLR end "ruleExplicitBranch"


    // $ANTLR start "entryRuleImplicitBranch"
    // InternalCOV.g:353:1: entryRuleImplicitBranch : ruleImplicitBranch EOF ;
    public final void entryRuleImplicitBranch() throws RecognitionException {
        try {
            // InternalCOV.g:354:1: ( ruleImplicitBranch EOF )
            // InternalCOV.g:355:1: ruleImplicitBranch EOF
            {
             before(grammarAccess.getImplicitBranchRule()); 
            pushFollow(FOLLOW_1);
            ruleImplicitBranch();

            state._fsp--;

             after(grammarAccess.getImplicitBranchRule()); 
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
    // $ANTLR end "entryRuleImplicitBranch"


    // $ANTLR start "ruleImplicitBranch"
    // InternalCOV.g:362:1: ruleImplicitBranch : ( ( rule__ImplicitBranch__Group__0 ) ) ;
    public final void ruleImplicitBranch() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:366:2: ( ( ( rule__ImplicitBranch__Group__0 ) ) )
            // InternalCOV.g:367:2: ( ( rule__ImplicitBranch__Group__0 ) )
            {
            // InternalCOV.g:367:2: ( ( rule__ImplicitBranch__Group__0 ) )
            // InternalCOV.g:368:3: ( rule__ImplicitBranch__Group__0 )
            {
             before(grammarAccess.getImplicitBranchAccess().getGroup()); 
            // InternalCOV.g:369:3: ( rule__ImplicitBranch__Group__0 )
            // InternalCOV.g:369:4: rule__ImplicitBranch__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ImplicitBranch__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImplicitBranchAccess().getGroup()); 

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
    // $ANTLR end "ruleImplicitBranch"


    // $ANTLR start "entryRuleCondition"
    // InternalCOV.g:378:1: entryRuleCondition : ruleCondition EOF ;
    public final void entryRuleCondition() throws RecognitionException {
        try {
            // InternalCOV.g:379:1: ( ruleCondition EOF )
            // InternalCOV.g:380:1: ruleCondition EOF
            {
             before(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_1);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getConditionRule()); 
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
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // InternalCOV.g:387:1: ruleCondition : ( ( rule__Condition__OCLConstraintAssignment ) ) ;
    public final void ruleCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:391:2: ( ( ( rule__Condition__OCLConstraintAssignment ) ) )
            // InternalCOV.g:392:2: ( ( rule__Condition__OCLConstraintAssignment ) )
            {
            // InternalCOV.g:392:2: ( ( rule__Condition__OCLConstraintAssignment ) )
            // InternalCOV.g:393:3: ( rule__Condition__OCLConstraintAssignment )
            {
             before(grammarAccess.getConditionAccess().getOCLConstraintAssignment()); 
            // InternalCOV.g:394:3: ( rule__Condition__OCLConstraintAssignment )
            // InternalCOV.g:394:4: rule__Condition__OCLConstraintAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Condition__OCLConstraintAssignment();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getOCLConstraintAssignment()); 

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
    // $ANTLR end "ruleCondition"


    // $ANTLR start "ruleCoveredContents"
    // InternalCOV.g:403:1: ruleCoveredContents : ( ( rule__CoveredContents__Alternatives ) ) ;
    public final void ruleCoveredContents() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:407:1: ( ( ( rule__CoveredContents__Alternatives ) ) )
            // InternalCOV.g:408:2: ( ( rule__CoveredContents__Alternatives ) )
            {
            // InternalCOV.g:408:2: ( ( rule__CoveredContents__Alternatives ) )
            // InternalCOV.g:409:3: ( rule__CoveredContents__Alternatives )
            {
             before(grammarAccess.getCoveredContentsAccess().getAlternatives()); 
            // InternalCOV.g:410:3: ( rule__CoveredContents__Alternatives )
            // InternalCOV.g:410:4: rule__CoveredContents__Alternatives
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


    // $ANTLR start "ruleLimitationType"
    // InternalCOV.g:419:1: ruleLimitationType : ( ( rule__LimitationType__Alternatives ) ) ;
    public final void ruleLimitationType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:423:1: ( ( ( rule__LimitationType__Alternatives ) ) )
            // InternalCOV.g:424:2: ( ( rule__LimitationType__Alternatives ) )
            {
            // InternalCOV.g:424:2: ( ( rule__LimitationType__Alternatives ) )
            // InternalCOV.g:425:3: ( rule__LimitationType__Alternatives )
            {
             before(grammarAccess.getLimitationTypeAccess().getAlternatives()); 
            // InternalCOV.g:426:3: ( rule__LimitationType__Alternatives )
            // InternalCOV.g:426:4: rule__LimitationType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__LimitationType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLimitationTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleLimitationType"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalCOV.g:434:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:438:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalCOV.g:439:2: ( RULE_STRING )
                    {
                    // InternalCOV.g:439:2: ( RULE_STRING )
                    // InternalCOV.g:440:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCOV.g:445:2: ( RULE_ID )
                    {
                    // InternalCOV.g:445:2: ( RULE_ID )
                    // InternalCOV.g:446:3: RULE_ID
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
    // InternalCOV.g:455:1: rule__Rule__Alternatives : ( ( ruleIgnore ) | ( ruleLimitedIgnore ) | ( ruleCoverageOfReferenced ) | ( ruleCoverageByContent ) | ( ruleBranchSpecification ) );
    public final void rule__Rule__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:459:1: ( ( ruleIgnore ) | ( ruleLimitedIgnore ) | ( ruleCoverageOfReferenced ) | ( ruleCoverageByContent ) | ( ruleBranchSpecification ) )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 27:
                {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==RULE_STRING) ) {
                    switch ( input.LA(3) ) {
                    case 18:
                        {
                        alt2=5;
                        }
                        break;
                    case 24:
                        {
                        alt2=1;
                        }
                        break;
                    case 32:
                        {
                        alt2=4;
                        }
                        break;
                    case 31:
                        {
                        alt2=3;
                        }
                        break;
                    case 30:
                        {
                        alt2=2;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 7, input);

                        throw nvae;
                    }

                }
                else if ( (LA2_1==RULE_ID) ) {
                    switch ( input.LA(3) ) {
                    case 30:
                        {
                        alt2=2;
                        }
                        break;
                    case 18:
                        {
                        alt2=5;
                        }
                        break;
                    case 24:
                        {
                        alt2=1;
                        }
                        break;
                    case 32:
                        {
                        alt2=4;
                        }
                        break;
                    case 31:
                        {
                        alt2=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 8, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
                }
                break;
            case 24:
                {
                alt2=1;
                }
                break;
            case 30:
                {
                alt2=2;
                }
                break;
            case 31:
                {
                alt2=3;
                }
                break;
            case 32:
                {
                alt2=4;
                }
                break;
            case 18:
                {
                alt2=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalCOV.g:460:2: ( ruleIgnore )
                    {
                    // InternalCOV.g:460:2: ( ruleIgnore )
                    // InternalCOV.g:461:3: ruleIgnore
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
                    // InternalCOV.g:466:2: ( ruleLimitedIgnore )
                    {
                    // InternalCOV.g:466:2: ( ruleLimitedIgnore )
                    // InternalCOV.g:467:3: ruleLimitedIgnore
                    {
                     before(grammarAccess.getRuleAccess().getLimitedIgnoreParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleLimitedIgnore();

                    state._fsp--;

                     after(grammarAccess.getRuleAccess().getLimitedIgnoreParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalCOV.g:472:2: ( ruleCoverageOfReferenced )
                    {
                    // InternalCOV.g:472:2: ( ruleCoverageOfReferenced )
                    // InternalCOV.g:473:3: ruleCoverageOfReferenced
                    {
                     before(grammarAccess.getRuleAccess().getCoverageOfReferencedParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleCoverageOfReferenced();

                    state._fsp--;

                     after(grammarAccess.getRuleAccess().getCoverageOfReferencedParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalCOV.g:478:2: ( ruleCoverageByContent )
                    {
                    // InternalCOV.g:478:2: ( ruleCoverageByContent )
                    // InternalCOV.g:479:3: ruleCoverageByContent
                    {
                     before(grammarAccess.getRuleAccess().getCoverageByContentParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleCoverageByContent();

                    state._fsp--;

                     after(grammarAccess.getRuleAccess().getCoverageByContentParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalCOV.g:484:2: ( ruleBranchSpecification )
                    {
                    // InternalCOV.g:484:2: ( ruleBranchSpecification )
                    // InternalCOV.g:485:3: ruleBranchSpecification
                    {
                     before(grammarAccess.getRuleAccess().getBranchSpecificationParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleBranchSpecification();

                    state._fsp--;

                     after(grammarAccess.getRuleAccess().getBranchSpecificationParserRuleCall_4()); 

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
    // InternalCOV.g:494:1: rule__EBoolean__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__EBoolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:498:1: ( ( 'true' ) | ( 'false' ) )
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
                    // InternalCOV.g:499:2: ( 'true' )
                    {
                    // InternalCOV.g:499:2: ( 'true' )
                    // InternalCOV.g:500:3: 'true'
                    {
                     before(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCOV.g:505:2: ( 'false' )
                    {
                    // InternalCOV.g:505:2: ( 'false' )
                    // InternalCOV.g:506:3: 'false'
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


    // $ANTLR start "rule__Branch__Alternatives"
    // InternalCOV.g:515:1: rule__Branch__Alternatives : ( ( ruleExplicitBranch ) | ( ruleImplicitBranch ) );
    public final void rule__Branch__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:519:1: ( ( ruleExplicitBranch ) | ( ruleImplicitBranch ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==34) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==35) ) {
                    alt4=2;
                }
                else if ( ((LA4_1>=RULE_STRING && LA4_1<=RULE_ID)) ) {
                    alt4=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalCOV.g:520:2: ( ruleExplicitBranch )
                    {
                    // InternalCOV.g:520:2: ( ruleExplicitBranch )
                    // InternalCOV.g:521:3: ruleExplicitBranch
                    {
                     before(grammarAccess.getBranchAccess().getExplicitBranchParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleExplicitBranch();

                    state._fsp--;

                     after(grammarAccess.getBranchAccess().getExplicitBranchParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCOV.g:526:2: ( ruleImplicitBranch )
                    {
                    // InternalCOV.g:526:2: ( ruleImplicitBranch )
                    // InternalCOV.g:527:3: ruleImplicitBranch
                    {
                     before(grammarAccess.getBranchAccess().getImplicitBranchParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleImplicitBranch();

                    state._fsp--;

                     after(grammarAccess.getBranchAccess().getImplicitBranchParserRuleCall_1()); 

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
    // $ANTLR end "rule__Branch__Alternatives"


    // $ANTLR start "rule__CoveredContents__Alternatives"
    // InternalCOV.g:536:1: rule__CoveredContents__Alternatives : ( ( ( 'ALL' ) ) | ( ( 'ONE' ) ) );
    public final void rule__CoveredContents__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:540:1: ( ( ( 'ALL' ) ) | ( ( 'ONE' ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==13) ) {
                alt5=1;
            }
            else if ( (LA5_0==14) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalCOV.g:541:2: ( ( 'ALL' ) )
                    {
                    // InternalCOV.g:541:2: ( ( 'ALL' ) )
                    // InternalCOV.g:542:3: ( 'ALL' )
                    {
                     before(grammarAccess.getCoveredContentsAccess().getALLEnumLiteralDeclaration_0()); 
                    // InternalCOV.g:543:3: ( 'ALL' )
                    // InternalCOV.g:543:4: 'ALL'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getCoveredContentsAccess().getALLEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCOV.g:547:2: ( ( 'ONE' ) )
                    {
                    // InternalCOV.g:547:2: ( ( 'ONE' ) )
                    // InternalCOV.g:548:3: ( 'ONE' )
                    {
                     before(grammarAccess.getCoveredContentsAccess().getONEEnumLiteralDeclaration_1()); 
                    // InternalCOV.g:549:3: ( 'ONE' )
                    // InternalCOV.g:549:4: 'ONE'
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


    // $ANTLR start "rule__LimitationType__Alternatives"
    // InternalCOV.g:557:1: rule__LimitationType__Alternatives : ( ( ( 'containedBy' ) ) | ( ( 'notContainedBy' ) ) );
    public final void rule__LimitationType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:561:1: ( ( ( 'containedBy' ) ) | ( ( 'notContainedBy' ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==15) ) {
                alt6=1;
            }
            else if ( (LA6_0==16) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalCOV.g:562:2: ( ( 'containedBy' ) )
                    {
                    // InternalCOV.g:562:2: ( ( 'containedBy' ) )
                    // InternalCOV.g:563:3: ( 'containedBy' )
                    {
                     before(grammarAccess.getLimitationTypeAccess().getContainedByEnumLiteralDeclaration_0()); 
                    // InternalCOV.g:564:3: ( 'containedBy' )
                    // InternalCOV.g:564:4: 'containedBy'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getLimitationTypeAccess().getContainedByEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCOV.g:568:2: ( ( 'notContainedBy' ) )
                    {
                    // InternalCOV.g:568:2: ( ( 'notContainedBy' ) )
                    // InternalCOV.g:569:3: ( 'notContainedBy' )
                    {
                     before(grammarAccess.getLimitationTypeAccess().getNotContainedByEnumLiteralDeclaration_1()); 
                    // InternalCOV.g:570:3: ( 'notContainedBy' )
                    // InternalCOV.g:570:4: 'notContainedBy'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getLimitationTypeAccess().getNotContainedByEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__LimitationType__Alternatives"


    // $ANTLR start "rule__DomainSpecificCoverage__Group__0"
    // InternalCOV.g:578:1: rule__DomainSpecificCoverage__Group__0 : rule__DomainSpecificCoverage__Group__0__Impl rule__DomainSpecificCoverage__Group__1 ;
    public final void rule__DomainSpecificCoverage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:582:1: ( rule__DomainSpecificCoverage__Group__0__Impl rule__DomainSpecificCoverage__Group__1 )
            // InternalCOV.g:583:2: rule__DomainSpecificCoverage__Group__0__Impl rule__DomainSpecificCoverage__Group__1
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
    // InternalCOV.g:590:1: rule__DomainSpecificCoverage__Group__0__Impl : ( 'ruleset' ) ;
    public final void rule__DomainSpecificCoverage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:594:1: ( ( 'ruleset' ) )
            // InternalCOV.g:595:1: ( 'ruleset' )
            {
            // InternalCOV.g:595:1: ( 'ruleset' )
            // InternalCOV.g:596:2: 'ruleset'
            {
             before(grammarAccess.getDomainSpecificCoverageAccess().getRulesetKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getDomainSpecificCoverageAccess().getRulesetKeyword_0()); 

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
    // InternalCOV.g:605:1: rule__DomainSpecificCoverage__Group__1 : rule__DomainSpecificCoverage__Group__1__Impl rule__DomainSpecificCoverage__Group__2 ;
    public final void rule__DomainSpecificCoverage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:609:1: ( rule__DomainSpecificCoverage__Group__1__Impl rule__DomainSpecificCoverage__Group__2 )
            // InternalCOV.g:610:2: rule__DomainSpecificCoverage__Group__1__Impl rule__DomainSpecificCoverage__Group__2
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
    // InternalCOV.g:617:1: rule__DomainSpecificCoverage__Group__1__Impl : ( ( rule__DomainSpecificCoverage__NameAssignment_1 ) ) ;
    public final void rule__DomainSpecificCoverage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:621:1: ( ( ( rule__DomainSpecificCoverage__NameAssignment_1 ) ) )
            // InternalCOV.g:622:1: ( ( rule__DomainSpecificCoverage__NameAssignment_1 ) )
            {
            // InternalCOV.g:622:1: ( ( rule__DomainSpecificCoverage__NameAssignment_1 ) )
            // InternalCOV.g:623:2: ( rule__DomainSpecificCoverage__NameAssignment_1 )
            {
             before(grammarAccess.getDomainSpecificCoverageAccess().getNameAssignment_1()); 
            // InternalCOV.g:624:2: ( rule__DomainSpecificCoverage__NameAssignment_1 )
            // InternalCOV.g:624:3: rule__DomainSpecificCoverage__NameAssignment_1
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
    // InternalCOV.g:632:1: rule__DomainSpecificCoverage__Group__2 : rule__DomainSpecificCoverage__Group__2__Impl rule__DomainSpecificCoverage__Group__3 ;
    public final void rule__DomainSpecificCoverage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:636:1: ( rule__DomainSpecificCoverage__Group__2__Impl rule__DomainSpecificCoverage__Group__3 )
            // InternalCOV.g:637:2: rule__DomainSpecificCoverage__Group__2__Impl rule__DomainSpecificCoverage__Group__3
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
    // InternalCOV.g:644:1: rule__DomainSpecificCoverage__Group__2__Impl : ( '{' ) ;
    public final void rule__DomainSpecificCoverage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:648:1: ( ( '{' ) )
            // InternalCOV.g:649:1: ( '{' )
            {
            // InternalCOV.g:649:1: ( '{' )
            // InternalCOV.g:650:2: '{'
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
    // InternalCOV.g:659:1: rule__DomainSpecificCoverage__Group__3 : rule__DomainSpecificCoverage__Group__3__Impl rule__DomainSpecificCoverage__Group__4 ;
    public final void rule__DomainSpecificCoverage__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:663:1: ( rule__DomainSpecificCoverage__Group__3__Impl rule__DomainSpecificCoverage__Group__4 )
            // InternalCOV.g:664:2: rule__DomainSpecificCoverage__Group__3__Impl rule__DomainSpecificCoverage__Group__4
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
    // InternalCOV.g:671:1: rule__DomainSpecificCoverage__Group__3__Impl : ( 'import' ) ;
    public final void rule__DomainSpecificCoverage__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:675:1: ( ( 'import' ) )
            // InternalCOV.g:676:1: ( 'import' )
            {
            // InternalCOV.g:676:1: ( 'import' )
            // InternalCOV.g:677:2: 'import'
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
    // InternalCOV.g:686:1: rule__DomainSpecificCoverage__Group__4 : rule__DomainSpecificCoverage__Group__4__Impl rule__DomainSpecificCoverage__Group__5 ;
    public final void rule__DomainSpecificCoverage__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:690:1: ( rule__DomainSpecificCoverage__Group__4__Impl rule__DomainSpecificCoverage__Group__5 )
            // InternalCOV.g:691:2: rule__DomainSpecificCoverage__Group__4__Impl rule__DomainSpecificCoverage__Group__5
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
    // InternalCOV.g:698:1: rule__DomainSpecificCoverage__Group__4__Impl : ( 'metamodel' ) ;
    public final void rule__DomainSpecificCoverage__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:702:1: ( ( 'metamodel' ) )
            // InternalCOV.g:703:1: ( 'metamodel' )
            {
            // InternalCOV.g:703:1: ( 'metamodel' )
            // InternalCOV.g:704:2: 'metamodel'
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
    // InternalCOV.g:713:1: rule__DomainSpecificCoverage__Group__5 : rule__DomainSpecificCoverage__Group__5__Impl rule__DomainSpecificCoverage__Group__6 ;
    public final void rule__DomainSpecificCoverage__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:717:1: ( rule__DomainSpecificCoverage__Group__5__Impl rule__DomainSpecificCoverage__Group__6 )
            // InternalCOV.g:718:2: rule__DomainSpecificCoverage__Group__5__Impl rule__DomainSpecificCoverage__Group__6
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
    // InternalCOV.g:725:1: rule__DomainSpecificCoverage__Group__5__Impl : ( ( rule__DomainSpecificCoverage__MetamodelAssignment_5 ) ) ;
    public final void rule__DomainSpecificCoverage__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:729:1: ( ( ( rule__DomainSpecificCoverage__MetamodelAssignment_5 ) ) )
            // InternalCOV.g:730:1: ( ( rule__DomainSpecificCoverage__MetamodelAssignment_5 ) )
            {
            // InternalCOV.g:730:1: ( ( rule__DomainSpecificCoverage__MetamodelAssignment_5 ) )
            // InternalCOV.g:731:2: ( rule__DomainSpecificCoverage__MetamodelAssignment_5 )
            {
             before(grammarAccess.getDomainSpecificCoverageAccess().getMetamodelAssignment_5()); 
            // InternalCOV.g:732:2: ( rule__DomainSpecificCoverage__MetamodelAssignment_5 )
            // InternalCOV.g:732:3: rule__DomainSpecificCoverage__MetamodelAssignment_5
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
    // InternalCOV.g:740:1: rule__DomainSpecificCoverage__Group__6 : rule__DomainSpecificCoverage__Group__6__Impl rule__DomainSpecificCoverage__Group__7 ;
    public final void rule__DomainSpecificCoverage__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:744:1: ( rule__DomainSpecificCoverage__Group__6__Impl rule__DomainSpecificCoverage__Group__7 )
            // InternalCOV.g:745:2: rule__DomainSpecificCoverage__Group__6__Impl rule__DomainSpecificCoverage__Group__7
            {
            pushFollow(FOLLOW_7);
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
    // InternalCOV.g:752:1: rule__DomainSpecificCoverage__Group__6__Impl : ( ( rule__DomainSpecificCoverage__Group_6__0 )? ) ;
    public final void rule__DomainSpecificCoverage__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:756:1: ( ( ( rule__DomainSpecificCoverage__Group_6__0 )? ) )
            // InternalCOV.g:757:1: ( ( rule__DomainSpecificCoverage__Group_6__0 )? )
            {
            // InternalCOV.g:757:1: ( ( rule__DomainSpecificCoverage__Group_6__0 )? )
            // InternalCOV.g:758:2: ( rule__DomainSpecificCoverage__Group_6__0 )?
            {
             before(grammarAccess.getDomainSpecificCoverageAccess().getGroup_6()); 
            // InternalCOV.g:759:2: ( rule__DomainSpecificCoverage__Group_6__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalCOV.g:759:3: rule__DomainSpecificCoverage__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DomainSpecificCoverage__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDomainSpecificCoverageAccess().getGroup_6()); 

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
    // InternalCOV.g:767:1: rule__DomainSpecificCoverage__Group__7 : rule__DomainSpecificCoverage__Group__7__Impl rule__DomainSpecificCoverage__Group__8 ;
    public final void rule__DomainSpecificCoverage__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:771:1: ( rule__DomainSpecificCoverage__Group__7__Impl rule__DomainSpecificCoverage__Group__8 )
            // InternalCOV.g:772:2: rule__DomainSpecificCoverage__Group__7__Impl rule__DomainSpecificCoverage__Group__8
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
    // InternalCOV.g:779:1: rule__DomainSpecificCoverage__Group__7__Impl : ( ( rule__DomainSpecificCoverage__ContextsAssignment_7 ) ) ;
    public final void rule__DomainSpecificCoverage__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:783:1: ( ( ( rule__DomainSpecificCoverage__ContextsAssignment_7 ) ) )
            // InternalCOV.g:784:1: ( ( rule__DomainSpecificCoverage__ContextsAssignment_7 ) )
            {
            // InternalCOV.g:784:1: ( ( rule__DomainSpecificCoverage__ContextsAssignment_7 ) )
            // InternalCOV.g:785:2: ( rule__DomainSpecificCoverage__ContextsAssignment_7 )
            {
             before(grammarAccess.getDomainSpecificCoverageAccess().getContextsAssignment_7()); 
            // InternalCOV.g:786:2: ( rule__DomainSpecificCoverage__ContextsAssignment_7 )
            // InternalCOV.g:786:3: rule__DomainSpecificCoverage__ContextsAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__DomainSpecificCoverage__ContextsAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getDomainSpecificCoverageAccess().getContextsAssignment_7()); 

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
    // InternalCOV.g:794:1: rule__DomainSpecificCoverage__Group__8 : rule__DomainSpecificCoverage__Group__8__Impl rule__DomainSpecificCoverage__Group__9 ;
    public final void rule__DomainSpecificCoverage__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:798:1: ( rule__DomainSpecificCoverage__Group__8__Impl rule__DomainSpecificCoverage__Group__9 )
            // InternalCOV.g:799:2: rule__DomainSpecificCoverage__Group__8__Impl rule__DomainSpecificCoverage__Group__9
            {
            pushFollow(FOLLOW_8);
            rule__DomainSpecificCoverage__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DomainSpecificCoverage__Group__9();

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
    // InternalCOV.g:806:1: rule__DomainSpecificCoverage__Group__8__Impl : ( ( rule__DomainSpecificCoverage__Group_8__0 )* ) ;
    public final void rule__DomainSpecificCoverage__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:810:1: ( ( ( rule__DomainSpecificCoverage__Group_8__0 )* ) )
            // InternalCOV.g:811:1: ( ( rule__DomainSpecificCoverage__Group_8__0 )* )
            {
            // InternalCOV.g:811:1: ( ( rule__DomainSpecificCoverage__Group_8__0 )* )
            // InternalCOV.g:812:2: ( rule__DomainSpecificCoverage__Group_8__0 )*
            {
             before(grammarAccess.getDomainSpecificCoverageAccess().getGroup_8()); 
            // InternalCOV.g:813:2: ( rule__DomainSpecificCoverage__Group_8__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==22) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalCOV.g:813:3: rule__DomainSpecificCoverage__Group_8__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__DomainSpecificCoverage__Group_8__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getDomainSpecificCoverageAccess().getGroup_8()); 

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


    // $ANTLR start "rule__DomainSpecificCoverage__Group__9"
    // InternalCOV.g:821:1: rule__DomainSpecificCoverage__Group__9 : rule__DomainSpecificCoverage__Group__9__Impl ;
    public final void rule__DomainSpecificCoverage__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:825:1: ( rule__DomainSpecificCoverage__Group__9__Impl )
            // InternalCOV.g:826:2: rule__DomainSpecificCoverage__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DomainSpecificCoverage__Group__9__Impl();

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
    // $ANTLR end "rule__DomainSpecificCoverage__Group__9"


    // $ANTLR start "rule__DomainSpecificCoverage__Group__9__Impl"
    // InternalCOV.g:832:1: rule__DomainSpecificCoverage__Group__9__Impl : ( '}' ) ;
    public final void rule__DomainSpecificCoverage__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:836:1: ( ( '}' ) )
            // InternalCOV.g:837:1: ( '}' )
            {
            // InternalCOV.g:837:1: ( '}' )
            // InternalCOV.g:838:2: '}'
            {
             before(grammarAccess.getDomainSpecificCoverageAccess().getRightCurlyBracketKeyword_9()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getDomainSpecificCoverageAccess().getRightCurlyBracketKeyword_9()); 

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
    // $ANTLR end "rule__DomainSpecificCoverage__Group__9__Impl"


    // $ANTLR start "rule__DomainSpecificCoverage__Group_6__0"
    // InternalCOV.g:848:1: rule__DomainSpecificCoverage__Group_6__0 : rule__DomainSpecificCoverage__Group_6__0__Impl rule__DomainSpecificCoverage__Group_6__1 ;
    public final void rule__DomainSpecificCoverage__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:852:1: ( rule__DomainSpecificCoverage__Group_6__0__Impl rule__DomainSpecificCoverage__Group_6__1 )
            // InternalCOV.g:853:2: rule__DomainSpecificCoverage__Group_6__0__Impl rule__DomainSpecificCoverage__Group_6__1
            {
            pushFollow(FOLLOW_10);
            rule__DomainSpecificCoverage__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DomainSpecificCoverage__Group_6__1();

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
    // $ANTLR end "rule__DomainSpecificCoverage__Group_6__0"


    // $ANTLR start "rule__DomainSpecificCoverage__Group_6__0__Impl"
    // InternalCOV.g:860:1: rule__DomainSpecificCoverage__Group_6__0__Impl : ( 'import' ) ;
    public final void rule__DomainSpecificCoverage__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:864:1: ( ( 'import' ) )
            // InternalCOV.g:865:1: ( 'import' )
            {
            // InternalCOV.g:865:1: ( 'import' )
            // InternalCOV.g:866:2: 'import'
            {
             before(grammarAccess.getDomainSpecificCoverageAccess().getImportKeyword_6_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getDomainSpecificCoverageAccess().getImportKeyword_6_0()); 

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
    // $ANTLR end "rule__DomainSpecificCoverage__Group_6__0__Impl"


    // $ANTLR start "rule__DomainSpecificCoverage__Group_6__1"
    // InternalCOV.g:875:1: rule__DomainSpecificCoverage__Group_6__1 : rule__DomainSpecificCoverage__Group_6__1__Impl rule__DomainSpecificCoverage__Group_6__2 ;
    public final void rule__DomainSpecificCoverage__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:879:1: ( rule__DomainSpecificCoverage__Group_6__1__Impl rule__DomainSpecificCoverage__Group_6__2 )
            // InternalCOV.g:880:2: rule__DomainSpecificCoverage__Group_6__1__Impl rule__DomainSpecificCoverage__Group_6__2
            {
            pushFollow(FOLLOW_3);
            rule__DomainSpecificCoverage__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DomainSpecificCoverage__Group_6__2();

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
    // $ANTLR end "rule__DomainSpecificCoverage__Group_6__1"


    // $ANTLR start "rule__DomainSpecificCoverage__Group_6__1__Impl"
    // InternalCOV.g:887:1: rule__DomainSpecificCoverage__Group_6__1__Impl : ( 'ruleset' ) ;
    public final void rule__DomainSpecificCoverage__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:891:1: ( ( 'ruleset' ) )
            // InternalCOV.g:892:1: ( 'ruleset' )
            {
            // InternalCOV.g:892:1: ( 'ruleset' )
            // InternalCOV.g:893:2: 'ruleset'
            {
             before(grammarAccess.getDomainSpecificCoverageAccess().getRulesetKeyword_6_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getDomainSpecificCoverageAccess().getRulesetKeyword_6_1()); 

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
    // $ANTLR end "rule__DomainSpecificCoverage__Group_6__1__Impl"


    // $ANTLR start "rule__DomainSpecificCoverage__Group_6__2"
    // InternalCOV.g:902:1: rule__DomainSpecificCoverage__Group_6__2 : rule__DomainSpecificCoverage__Group_6__2__Impl rule__DomainSpecificCoverage__Group_6__3 ;
    public final void rule__DomainSpecificCoverage__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:906:1: ( rule__DomainSpecificCoverage__Group_6__2__Impl rule__DomainSpecificCoverage__Group_6__3 )
            // InternalCOV.g:907:2: rule__DomainSpecificCoverage__Group_6__2__Impl rule__DomainSpecificCoverage__Group_6__3
            {
            pushFollow(FOLLOW_11);
            rule__DomainSpecificCoverage__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DomainSpecificCoverage__Group_6__3();

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
    // $ANTLR end "rule__DomainSpecificCoverage__Group_6__2"


    // $ANTLR start "rule__DomainSpecificCoverage__Group_6__2__Impl"
    // InternalCOV.g:914:1: rule__DomainSpecificCoverage__Group_6__2__Impl : ( ( rule__DomainSpecificCoverage__ImportsAssignment_6_2 ) ) ;
    public final void rule__DomainSpecificCoverage__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:918:1: ( ( ( rule__DomainSpecificCoverage__ImportsAssignment_6_2 ) ) )
            // InternalCOV.g:919:1: ( ( rule__DomainSpecificCoverage__ImportsAssignment_6_2 ) )
            {
            // InternalCOV.g:919:1: ( ( rule__DomainSpecificCoverage__ImportsAssignment_6_2 ) )
            // InternalCOV.g:920:2: ( rule__DomainSpecificCoverage__ImportsAssignment_6_2 )
            {
             before(grammarAccess.getDomainSpecificCoverageAccess().getImportsAssignment_6_2()); 
            // InternalCOV.g:921:2: ( rule__DomainSpecificCoverage__ImportsAssignment_6_2 )
            // InternalCOV.g:921:3: rule__DomainSpecificCoverage__ImportsAssignment_6_2
            {
            pushFollow(FOLLOW_2);
            rule__DomainSpecificCoverage__ImportsAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getDomainSpecificCoverageAccess().getImportsAssignment_6_2()); 

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
    // $ANTLR end "rule__DomainSpecificCoverage__Group_6__2__Impl"


    // $ANTLR start "rule__DomainSpecificCoverage__Group_6__3"
    // InternalCOV.g:929:1: rule__DomainSpecificCoverage__Group_6__3 : rule__DomainSpecificCoverage__Group_6__3__Impl ;
    public final void rule__DomainSpecificCoverage__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:933:1: ( rule__DomainSpecificCoverage__Group_6__3__Impl )
            // InternalCOV.g:934:2: rule__DomainSpecificCoverage__Group_6__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DomainSpecificCoverage__Group_6__3__Impl();

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
    // $ANTLR end "rule__DomainSpecificCoverage__Group_6__3"


    // $ANTLR start "rule__DomainSpecificCoverage__Group_6__3__Impl"
    // InternalCOV.g:940:1: rule__DomainSpecificCoverage__Group_6__3__Impl : ( ( rule__DomainSpecificCoverage__Group_6_3__0 )* ) ;
    public final void rule__DomainSpecificCoverage__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:944:1: ( ( ( rule__DomainSpecificCoverage__Group_6_3__0 )* ) )
            // InternalCOV.g:945:1: ( ( rule__DomainSpecificCoverage__Group_6_3__0 )* )
            {
            // InternalCOV.g:945:1: ( ( rule__DomainSpecificCoverage__Group_6_3__0 )* )
            // InternalCOV.g:946:2: ( rule__DomainSpecificCoverage__Group_6_3__0 )*
            {
             before(grammarAccess.getDomainSpecificCoverageAccess().getGroup_6_3()); 
            // InternalCOV.g:947:2: ( rule__DomainSpecificCoverage__Group_6_3__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==22) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalCOV.g:947:3: rule__DomainSpecificCoverage__Group_6_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__DomainSpecificCoverage__Group_6_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getDomainSpecificCoverageAccess().getGroup_6_3()); 

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
    // $ANTLR end "rule__DomainSpecificCoverage__Group_6__3__Impl"


    // $ANTLR start "rule__DomainSpecificCoverage__Group_6_3__0"
    // InternalCOV.g:956:1: rule__DomainSpecificCoverage__Group_6_3__0 : rule__DomainSpecificCoverage__Group_6_3__0__Impl rule__DomainSpecificCoverage__Group_6_3__1 ;
    public final void rule__DomainSpecificCoverage__Group_6_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:960:1: ( rule__DomainSpecificCoverage__Group_6_3__0__Impl rule__DomainSpecificCoverage__Group_6_3__1 )
            // InternalCOV.g:961:2: rule__DomainSpecificCoverage__Group_6_3__0__Impl rule__DomainSpecificCoverage__Group_6_3__1
            {
            pushFollow(FOLLOW_3);
            rule__DomainSpecificCoverage__Group_6_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DomainSpecificCoverage__Group_6_3__1();

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
    // $ANTLR end "rule__DomainSpecificCoverage__Group_6_3__0"


    // $ANTLR start "rule__DomainSpecificCoverage__Group_6_3__0__Impl"
    // InternalCOV.g:968:1: rule__DomainSpecificCoverage__Group_6_3__0__Impl : ( ',' ) ;
    public final void rule__DomainSpecificCoverage__Group_6_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:972:1: ( ( ',' ) )
            // InternalCOV.g:973:1: ( ',' )
            {
            // InternalCOV.g:973:1: ( ',' )
            // InternalCOV.g:974:2: ','
            {
             before(grammarAccess.getDomainSpecificCoverageAccess().getCommaKeyword_6_3_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getDomainSpecificCoverageAccess().getCommaKeyword_6_3_0()); 

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
    // $ANTLR end "rule__DomainSpecificCoverage__Group_6_3__0__Impl"


    // $ANTLR start "rule__DomainSpecificCoverage__Group_6_3__1"
    // InternalCOV.g:983:1: rule__DomainSpecificCoverage__Group_6_3__1 : rule__DomainSpecificCoverage__Group_6_3__1__Impl ;
    public final void rule__DomainSpecificCoverage__Group_6_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:987:1: ( rule__DomainSpecificCoverage__Group_6_3__1__Impl )
            // InternalCOV.g:988:2: rule__DomainSpecificCoverage__Group_6_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DomainSpecificCoverage__Group_6_3__1__Impl();

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
    // $ANTLR end "rule__DomainSpecificCoverage__Group_6_3__1"


    // $ANTLR start "rule__DomainSpecificCoverage__Group_6_3__1__Impl"
    // InternalCOV.g:994:1: rule__DomainSpecificCoverage__Group_6_3__1__Impl : ( ( rule__DomainSpecificCoverage__ImportsAssignment_6_3_1 ) ) ;
    public final void rule__DomainSpecificCoverage__Group_6_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:998:1: ( ( ( rule__DomainSpecificCoverage__ImportsAssignment_6_3_1 ) ) )
            // InternalCOV.g:999:1: ( ( rule__DomainSpecificCoverage__ImportsAssignment_6_3_1 ) )
            {
            // InternalCOV.g:999:1: ( ( rule__DomainSpecificCoverage__ImportsAssignment_6_3_1 ) )
            // InternalCOV.g:1000:2: ( rule__DomainSpecificCoverage__ImportsAssignment_6_3_1 )
            {
             before(grammarAccess.getDomainSpecificCoverageAccess().getImportsAssignment_6_3_1()); 
            // InternalCOV.g:1001:2: ( rule__DomainSpecificCoverage__ImportsAssignment_6_3_1 )
            // InternalCOV.g:1001:3: rule__DomainSpecificCoverage__ImportsAssignment_6_3_1
            {
            pushFollow(FOLLOW_2);
            rule__DomainSpecificCoverage__ImportsAssignment_6_3_1();

            state._fsp--;


            }

             after(grammarAccess.getDomainSpecificCoverageAccess().getImportsAssignment_6_3_1()); 

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
    // $ANTLR end "rule__DomainSpecificCoverage__Group_6_3__1__Impl"


    // $ANTLR start "rule__DomainSpecificCoverage__Group_8__0"
    // InternalCOV.g:1010:1: rule__DomainSpecificCoverage__Group_8__0 : rule__DomainSpecificCoverage__Group_8__0__Impl rule__DomainSpecificCoverage__Group_8__1 ;
    public final void rule__DomainSpecificCoverage__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1014:1: ( rule__DomainSpecificCoverage__Group_8__0__Impl rule__DomainSpecificCoverage__Group_8__1 )
            // InternalCOV.g:1015:2: rule__DomainSpecificCoverage__Group_8__0__Impl rule__DomainSpecificCoverage__Group_8__1
            {
            pushFollow(FOLLOW_7);
            rule__DomainSpecificCoverage__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DomainSpecificCoverage__Group_8__1();

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
    // $ANTLR end "rule__DomainSpecificCoverage__Group_8__0"


    // $ANTLR start "rule__DomainSpecificCoverage__Group_8__0__Impl"
    // InternalCOV.g:1022:1: rule__DomainSpecificCoverage__Group_8__0__Impl : ( ',' ) ;
    public final void rule__DomainSpecificCoverage__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1026:1: ( ( ',' ) )
            // InternalCOV.g:1027:1: ( ',' )
            {
            // InternalCOV.g:1027:1: ( ',' )
            // InternalCOV.g:1028:2: ','
            {
             before(grammarAccess.getDomainSpecificCoverageAccess().getCommaKeyword_8_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getDomainSpecificCoverageAccess().getCommaKeyword_8_0()); 

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
    // $ANTLR end "rule__DomainSpecificCoverage__Group_8__0__Impl"


    // $ANTLR start "rule__DomainSpecificCoverage__Group_8__1"
    // InternalCOV.g:1037:1: rule__DomainSpecificCoverage__Group_8__1 : rule__DomainSpecificCoverage__Group_8__1__Impl ;
    public final void rule__DomainSpecificCoverage__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1041:1: ( rule__DomainSpecificCoverage__Group_8__1__Impl )
            // InternalCOV.g:1042:2: rule__DomainSpecificCoverage__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DomainSpecificCoverage__Group_8__1__Impl();

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
    // $ANTLR end "rule__DomainSpecificCoverage__Group_8__1"


    // $ANTLR start "rule__DomainSpecificCoverage__Group_8__1__Impl"
    // InternalCOV.g:1048:1: rule__DomainSpecificCoverage__Group_8__1__Impl : ( ( rule__DomainSpecificCoverage__ContextsAssignment_8_1 ) ) ;
    public final void rule__DomainSpecificCoverage__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1052:1: ( ( ( rule__DomainSpecificCoverage__ContextsAssignment_8_1 ) ) )
            // InternalCOV.g:1053:1: ( ( rule__DomainSpecificCoverage__ContextsAssignment_8_1 ) )
            {
            // InternalCOV.g:1053:1: ( ( rule__DomainSpecificCoverage__ContextsAssignment_8_1 ) )
            // InternalCOV.g:1054:2: ( rule__DomainSpecificCoverage__ContextsAssignment_8_1 )
            {
             before(grammarAccess.getDomainSpecificCoverageAccess().getContextsAssignment_8_1()); 
            // InternalCOV.g:1055:2: ( rule__DomainSpecificCoverage__ContextsAssignment_8_1 )
            // InternalCOV.g:1055:3: rule__DomainSpecificCoverage__ContextsAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__DomainSpecificCoverage__ContextsAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getDomainSpecificCoverageAccess().getContextsAssignment_8_1()); 

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
    // $ANTLR end "rule__DomainSpecificCoverage__Group_8__1__Impl"


    // $ANTLR start "rule__Context__Group__0"
    // InternalCOV.g:1064:1: rule__Context__Group__0 : rule__Context__Group__0__Impl rule__Context__Group__1 ;
    public final void rule__Context__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1068:1: ( rule__Context__Group__0__Impl rule__Context__Group__1 )
            // InternalCOV.g:1069:2: rule__Context__Group__0__Impl rule__Context__Group__1
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
    // InternalCOV.g:1076:1: rule__Context__Group__0__Impl : ( 'context' ) ;
    public final void rule__Context__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1080:1: ( ( 'context' ) )
            // InternalCOV.g:1081:1: ( 'context' )
            {
            // InternalCOV.g:1081:1: ( 'context' )
            // InternalCOV.g:1082:2: 'context'
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
    // InternalCOV.g:1091:1: rule__Context__Group__1 : rule__Context__Group__1__Impl rule__Context__Group__2 ;
    public final void rule__Context__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1095:1: ( rule__Context__Group__1__Impl rule__Context__Group__2 )
            // InternalCOV.g:1096:2: rule__Context__Group__1__Impl rule__Context__Group__2
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
    // InternalCOV.g:1103:1: rule__Context__Group__1__Impl : ( ( rule__Context__MetaclassAssignment_1 ) ) ;
    public final void rule__Context__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1107:1: ( ( ( rule__Context__MetaclassAssignment_1 ) ) )
            // InternalCOV.g:1108:1: ( ( rule__Context__MetaclassAssignment_1 ) )
            {
            // InternalCOV.g:1108:1: ( ( rule__Context__MetaclassAssignment_1 ) )
            // InternalCOV.g:1109:2: ( rule__Context__MetaclassAssignment_1 )
            {
             before(grammarAccess.getContextAccess().getMetaclassAssignment_1()); 
            // InternalCOV.g:1110:2: ( rule__Context__MetaclassAssignment_1 )
            // InternalCOV.g:1110:3: rule__Context__MetaclassAssignment_1
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
    // InternalCOV.g:1118:1: rule__Context__Group__2 : rule__Context__Group__2__Impl rule__Context__Group__3 ;
    public final void rule__Context__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1122:1: ( rule__Context__Group__2__Impl rule__Context__Group__3 )
            // InternalCOV.g:1123:2: rule__Context__Group__2__Impl rule__Context__Group__3
            {
            pushFollow(FOLLOW_12);
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
    // InternalCOV.g:1130:1: rule__Context__Group__2__Impl : ( '{' ) ;
    public final void rule__Context__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1134:1: ( ( '{' ) )
            // InternalCOV.g:1135:1: ( '{' )
            {
            // InternalCOV.g:1135:1: ( '{' )
            // InternalCOV.g:1136:2: '{'
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
    // InternalCOV.g:1145:1: rule__Context__Group__3 : rule__Context__Group__3__Impl rule__Context__Group__4 ;
    public final void rule__Context__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1149:1: ( rule__Context__Group__3__Impl rule__Context__Group__4 )
            // InternalCOV.g:1150:2: rule__Context__Group__3__Impl rule__Context__Group__4
            {
            pushFollow(FOLLOW_12);
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
    // InternalCOV.g:1157:1: rule__Context__Group__3__Impl : ( ( rule__Context__Group_3__0 )? ) ;
    public final void rule__Context__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1161:1: ( ( ( rule__Context__Group_3__0 )? ) )
            // InternalCOV.g:1162:1: ( ( rule__Context__Group_3__0 )? )
            {
            // InternalCOV.g:1162:1: ( ( rule__Context__Group_3__0 )? )
            // InternalCOV.g:1163:2: ( rule__Context__Group_3__0 )?
            {
             before(grammarAccess.getContextAccess().getGroup_3()); 
            // InternalCOV.g:1164:2: ( rule__Context__Group_3__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==18||LA10_0==24||LA10_0==27||(LA10_0>=30 && LA10_0<=32)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalCOV.g:1164:3: rule__Context__Group_3__0
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
    // InternalCOV.g:1172:1: rule__Context__Group__4 : rule__Context__Group__4__Impl ;
    public final void rule__Context__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1176:1: ( rule__Context__Group__4__Impl )
            // InternalCOV.g:1177:2: rule__Context__Group__4__Impl
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
    // InternalCOV.g:1183:1: rule__Context__Group__4__Impl : ( '}' ) ;
    public final void rule__Context__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1187:1: ( ( '}' ) )
            // InternalCOV.g:1188:1: ( '}' )
            {
            // InternalCOV.g:1188:1: ( '}' )
            // InternalCOV.g:1189:2: '}'
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
    // InternalCOV.g:1199:1: rule__Context__Group_3__0 : rule__Context__Group_3__0__Impl rule__Context__Group_3__1 ;
    public final void rule__Context__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1203:1: ( rule__Context__Group_3__0__Impl rule__Context__Group_3__1 )
            // InternalCOV.g:1204:2: rule__Context__Group_3__0__Impl rule__Context__Group_3__1
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
    // InternalCOV.g:1211:1: rule__Context__Group_3__0__Impl : ( ( rule__Context__RulesAssignment_3_0 ) ) ;
    public final void rule__Context__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1215:1: ( ( ( rule__Context__RulesAssignment_3_0 ) ) )
            // InternalCOV.g:1216:1: ( ( rule__Context__RulesAssignment_3_0 ) )
            {
            // InternalCOV.g:1216:1: ( ( rule__Context__RulesAssignment_3_0 ) )
            // InternalCOV.g:1217:2: ( rule__Context__RulesAssignment_3_0 )
            {
             before(grammarAccess.getContextAccess().getRulesAssignment_3_0()); 
            // InternalCOV.g:1218:2: ( rule__Context__RulesAssignment_3_0 )
            // InternalCOV.g:1218:3: rule__Context__RulesAssignment_3_0
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
    // InternalCOV.g:1226:1: rule__Context__Group_3__1 : rule__Context__Group_3__1__Impl ;
    public final void rule__Context__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1230:1: ( rule__Context__Group_3__1__Impl )
            // InternalCOV.g:1231:2: rule__Context__Group_3__1__Impl
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
    // InternalCOV.g:1237:1: rule__Context__Group_3__1__Impl : ( ( rule__Context__Group_3_1__0 )* ) ;
    public final void rule__Context__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1241:1: ( ( ( rule__Context__Group_3_1__0 )* ) )
            // InternalCOV.g:1242:1: ( ( rule__Context__Group_3_1__0 )* )
            {
            // InternalCOV.g:1242:1: ( ( rule__Context__Group_3_1__0 )* )
            // InternalCOV.g:1243:2: ( rule__Context__Group_3_1__0 )*
            {
             before(grammarAccess.getContextAccess().getGroup_3_1()); 
            // InternalCOV.g:1244:2: ( rule__Context__Group_3_1__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==22) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalCOV.g:1244:3: rule__Context__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Context__Group_3_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // InternalCOV.g:1253:1: rule__Context__Group_3_1__0 : rule__Context__Group_3_1__0__Impl rule__Context__Group_3_1__1 ;
    public final void rule__Context__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1257:1: ( rule__Context__Group_3_1__0__Impl rule__Context__Group_3_1__1 )
            // InternalCOV.g:1258:2: rule__Context__Group_3_1__0__Impl rule__Context__Group_3_1__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalCOV.g:1265:1: rule__Context__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__Context__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1269:1: ( ( ',' ) )
            // InternalCOV.g:1270:1: ( ',' )
            {
            // InternalCOV.g:1270:1: ( ',' )
            // InternalCOV.g:1271:2: ','
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
    // InternalCOV.g:1280:1: rule__Context__Group_3_1__1 : rule__Context__Group_3_1__1__Impl ;
    public final void rule__Context__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1284:1: ( rule__Context__Group_3_1__1__Impl )
            // InternalCOV.g:1285:2: rule__Context__Group_3_1__1__Impl
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
    // InternalCOV.g:1291:1: rule__Context__Group_3_1__1__Impl : ( ( rule__Context__RulesAssignment_3_1_1 ) ) ;
    public final void rule__Context__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1295:1: ( ( ( rule__Context__RulesAssignment_3_1_1 ) ) )
            // InternalCOV.g:1296:1: ( ( rule__Context__RulesAssignment_3_1_1 ) )
            {
            // InternalCOV.g:1296:1: ( ( rule__Context__RulesAssignment_3_1_1 ) )
            // InternalCOV.g:1297:2: ( rule__Context__RulesAssignment_3_1_1 )
            {
             before(grammarAccess.getContextAccess().getRulesAssignment_3_1_1()); 
            // InternalCOV.g:1298:2: ( rule__Context__RulesAssignment_3_1_1 )
            // InternalCOV.g:1298:3: rule__Context__RulesAssignment_3_1_1
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
    // InternalCOV.g:1307:1: rule__Ignore__Group__0 : rule__Ignore__Group__0__Impl rule__Ignore__Group__1 ;
    public final void rule__Ignore__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1311:1: ( rule__Ignore__Group__0__Impl rule__Ignore__Group__1 )
            // InternalCOV.g:1312:2: rule__Ignore__Group__0__Impl rule__Ignore__Group__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalCOV.g:1319:1: rule__Ignore__Group__0__Impl : ( () ) ;
    public final void rule__Ignore__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1323:1: ( ( () ) )
            // InternalCOV.g:1324:1: ( () )
            {
            // InternalCOV.g:1324:1: ( () )
            // InternalCOV.g:1325:2: ()
            {
             before(grammarAccess.getIgnoreAccess().getIgnoreAction_0()); 
            // InternalCOV.g:1326:2: ()
            // InternalCOV.g:1326:3: 
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
    // InternalCOV.g:1334:1: rule__Ignore__Group__1 : rule__Ignore__Group__1__Impl rule__Ignore__Group__2 ;
    public final void rule__Ignore__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1338:1: ( rule__Ignore__Group__1__Impl rule__Ignore__Group__2 )
            // InternalCOV.g:1339:2: rule__Ignore__Group__1__Impl rule__Ignore__Group__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalCOV.g:1346:1: rule__Ignore__Group__1__Impl : ( ( rule__Ignore__Group_1__0 )? ) ;
    public final void rule__Ignore__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1350:1: ( ( ( rule__Ignore__Group_1__0 )? ) )
            // InternalCOV.g:1351:1: ( ( rule__Ignore__Group_1__0 )? )
            {
            // InternalCOV.g:1351:1: ( ( rule__Ignore__Group_1__0 )? )
            // InternalCOV.g:1352:2: ( rule__Ignore__Group_1__0 )?
            {
             before(grammarAccess.getIgnoreAccess().getGroup_1()); 
            // InternalCOV.g:1353:2: ( rule__Ignore__Group_1__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==27) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalCOV.g:1353:3: rule__Ignore__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Ignore__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIgnoreAccess().getGroup_1()); 

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
    // InternalCOV.g:1361:1: rule__Ignore__Group__2 : rule__Ignore__Group__2__Impl rule__Ignore__Group__3 ;
    public final void rule__Ignore__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1365:1: ( rule__Ignore__Group__2__Impl rule__Ignore__Group__3 )
            // InternalCOV.g:1366:2: rule__Ignore__Group__2__Impl rule__Ignore__Group__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalCOV.g:1373:1: rule__Ignore__Group__2__Impl : ( 'ignore' ) ;
    public final void rule__Ignore__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1377:1: ( ( 'ignore' ) )
            // InternalCOV.g:1378:1: ( 'ignore' )
            {
            // InternalCOV.g:1378:1: ( 'ignore' )
            // InternalCOV.g:1379:2: 'ignore'
            {
             before(grammarAccess.getIgnoreAccess().getIgnoreKeyword_2()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getIgnoreAccess().getIgnoreKeyword_2()); 

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
    // InternalCOV.g:1388:1: rule__Ignore__Group__3 : rule__Ignore__Group__3__Impl rule__Ignore__Group__4 ;
    public final void rule__Ignore__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1392:1: ( rule__Ignore__Group__3__Impl rule__Ignore__Group__4 )
            // InternalCOV.g:1393:2: rule__Ignore__Group__3__Impl rule__Ignore__Group__4
            {
            pushFollow(FOLLOW_16);
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
    // InternalCOV.g:1400:1: rule__Ignore__Group__3__Impl : ( '(' ) ;
    public final void rule__Ignore__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1404:1: ( ( '(' ) )
            // InternalCOV.g:1405:1: ( '(' )
            {
            // InternalCOV.g:1405:1: ( '(' )
            // InternalCOV.g:1406:2: '('
            {
             before(grammarAccess.getIgnoreAccess().getLeftParenthesisKeyword_3()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getIgnoreAccess().getLeftParenthesisKeyword_3()); 

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
    // InternalCOV.g:1415:1: rule__Ignore__Group__4 : rule__Ignore__Group__4__Impl rule__Ignore__Group__5 ;
    public final void rule__Ignore__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1419:1: ( rule__Ignore__Group__4__Impl rule__Ignore__Group__5 )
            // InternalCOV.g:1420:2: rule__Ignore__Group__4__Impl rule__Ignore__Group__5
            {
            pushFollow(FOLLOW_16);
            rule__Ignore__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ignore__Group__5();

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
    // InternalCOV.g:1427:1: rule__Ignore__Group__4__Impl : ( ( rule__Ignore__Group_4__0 )? ) ;
    public final void rule__Ignore__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1431:1: ( ( ( rule__Ignore__Group_4__0 )? ) )
            // InternalCOV.g:1432:1: ( ( rule__Ignore__Group_4__0 )? )
            {
            // InternalCOV.g:1432:1: ( ( rule__Ignore__Group_4__0 )? )
            // InternalCOV.g:1433:2: ( rule__Ignore__Group_4__0 )?
            {
             before(grammarAccess.getIgnoreAccess().getGroup_4()); 
            // InternalCOV.g:1434:2: ( rule__Ignore__Group_4__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==28) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalCOV.g:1434:3: rule__Ignore__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Ignore__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIgnoreAccess().getGroup_4()); 

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


    // $ANTLR start "rule__Ignore__Group__5"
    // InternalCOV.g:1442:1: rule__Ignore__Group__5 : rule__Ignore__Group__5__Impl rule__Ignore__Group__6 ;
    public final void rule__Ignore__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1446:1: ( rule__Ignore__Group__5__Impl rule__Ignore__Group__6 )
            // InternalCOV.g:1447:2: rule__Ignore__Group__5__Impl rule__Ignore__Group__6
            {
            pushFollow(FOLLOW_17);
            rule__Ignore__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ignore__Group__6();

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
    // $ANTLR end "rule__Ignore__Group__5"


    // $ANTLR start "rule__Ignore__Group__5__Impl"
    // InternalCOV.g:1454:1: rule__Ignore__Group__5__Impl : ( ')' ) ;
    public final void rule__Ignore__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1458:1: ( ( ')' ) )
            // InternalCOV.g:1459:1: ( ')' )
            {
            // InternalCOV.g:1459:1: ( ')' )
            // InternalCOV.g:1460:2: ')'
            {
             before(grammarAccess.getIgnoreAccess().getRightParenthesisKeyword_5()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getIgnoreAccess().getRightParenthesisKeyword_5()); 

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
    // $ANTLR end "rule__Ignore__Group__5__Impl"


    // $ANTLR start "rule__Ignore__Group__6"
    // InternalCOV.g:1469:1: rule__Ignore__Group__6 : rule__Ignore__Group__6__Impl ;
    public final void rule__Ignore__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1473:1: ( rule__Ignore__Group__6__Impl )
            // InternalCOV.g:1474:2: rule__Ignore__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Ignore__Group__6__Impl();

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
    // $ANTLR end "rule__Ignore__Group__6"


    // $ANTLR start "rule__Ignore__Group__6__Impl"
    // InternalCOV.g:1480:1: rule__Ignore__Group__6__Impl : ( ( rule__Ignore__Group_6__0 )? ) ;
    public final void rule__Ignore__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1484:1: ( ( ( rule__Ignore__Group_6__0 )? ) )
            // InternalCOV.g:1485:1: ( ( rule__Ignore__Group_6__0 )? )
            {
            // InternalCOV.g:1485:1: ( ( rule__Ignore__Group_6__0 )? )
            // InternalCOV.g:1486:2: ( rule__Ignore__Group_6__0 )?
            {
             before(grammarAccess.getIgnoreAccess().getGroup_6()); 
            // InternalCOV.g:1487:2: ( rule__Ignore__Group_6__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==29) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalCOV.g:1487:3: rule__Ignore__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Ignore__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIgnoreAccess().getGroup_6()); 

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
    // $ANTLR end "rule__Ignore__Group__6__Impl"


    // $ANTLR start "rule__Ignore__Group_1__0"
    // InternalCOV.g:1496:1: rule__Ignore__Group_1__0 : rule__Ignore__Group_1__0__Impl rule__Ignore__Group_1__1 ;
    public final void rule__Ignore__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1500:1: ( rule__Ignore__Group_1__0__Impl rule__Ignore__Group_1__1 )
            // InternalCOV.g:1501:2: rule__Ignore__Group_1__0__Impl rule__Ignore__Group_1__1
            {
            pushFollow(FOLLOW_3);
            rule__Ignore__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ignore__Group_1__1();

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
    // $ANTLR end "rule__Ignore__Group_1__0"


    // $ANTLR start "rule__Ignore__Group_1__0__Impl"
    // InternalCOV.g:1508:1: rule__Ignore__Group_1__0__Impl : ( 'when' ) ;
    public final void rule__Ignore__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1512:1: ( ( 'when' ) )
            // InternalCOV.g:1513:1: ( 'when' )
            {
            // InternalCOV.g:1513:1: ( 'when' )
            // InternalCOV.g:1514:2: 'when'
            {
             before(grammarAccess.getIgnoreAccess().getWhenKeyword_1_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getIgnoreAccess().getWhenKeyword_1_0()); 

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
    // $ANTLR end "rule__Ignore__Group_1__0__Impl"


    // $ANTLR start "rule__Ignore__Group_1__1"
    // InternalCOV.g:1523:1: rule__Ignore__Group_1__1 : rule__Ignore__Group_1__1__Impl ;
    public final void rule__Ignore__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1527:1: ( rule__Ignore__Group_1__1__Impl )
            // InternalCOV.g:1528:2: rule__Ignore__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Ignore__Group_1__1__Impl();

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
    // $ANTLR end "rule__Ignore__Group_1__1"


    // $ANTLR start "rule__Ignore__Group_1__1__Impl"
    // InternalCOV.g:1534:1: rule__Ignore__Group_1__1__Impl : ( ( rule__Ignore__ConditionAssignment_1_1 ) ) ;
    public final void rule__Ignore__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1538:1: ( ( ( rule__Ignore__ConditionAssignment_1_1 ) ) )
            // InternalCOV.g:1539:1: ( ( rule__Ignore__ConditionAssignment_1_1 ) )
            {
            // InternalCOV.g:1539:1: ( ( rule__Ignore__ConditionAssignment_1_1 ) )
            // InternalCOV.g:1540:2: ( rule__Ignore__ConditionAssignment_1_1 )
            {
             before(grammarAccess.getIgnoreAccess().getConditionAssignment_1_1()); 
            // InternalCOV.g:1541:2: ( rule__Ignore__ConditionAssignment_1_1 )
            // InternalCOV.g:1541:3: rule__Ignore__ConditionAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Ignore__ConditionAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getIgnoreAccess().getConditionAssignment_1_1()); 

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
    // $ANTLR end "rule__Ignore__Group_1__1__Impl"


    // $ANTLR start "rule__Ignore__Group_4__0"
    // InternalCOV.g:1550:1: rule__Ignore__Group_4__0 : rule__Ignore__Group_4__0__Impl rule__Ignore__Group_4__1 ;
    public final void rule__Ignore__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1554:1: ( rule__Ignore__Group_4__0__Impl rule__Ignore__Group_4__1 )
            // InternalCOV.g:1555:2: rule__Ignore__Group_4__0__Impl rule__Ignore__Group_4__1
            {
            pushFollow(FOLLOW_18);
            rule__Ignore__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ignore__Group_4__1();

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
    // $ANTLR end "rule__Ignore__Group_4__0"


    // $ANTLR start "rule__Ignore__Group_4__0__Impl"
    // InternalCOV.g:1562:1: rule__Ignore__Group_4__0__Impl : ( 'subtypes' ) ;
    public final void rule__Ignore__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1566:1: ( ( 'subtypes' ) )
            // InternalCOV.g:1567:1: ( 'subtypes' )
            {
            // InternalCOV.g:1567:1: ( 'subtypes' )
            // InternalCOV.g:1568:2: 'subtypes'
            {
             before(grammarAccess.getIgnoreAccess().getSubtypesKeyword_4_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getIgnoreAccess().getSubtypesKeyword_4_0()); 

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
    // $ANTLR end "rule__Ignore__Group_4__0__Impl"


    // $ANTLR start "rule__Ignore__Group_4__1"
    // InternalCOV.g:1577:1: rule__Ignore__Group_4__1 : rule__Ignore__Group_4__1__Impl ;
    public final void rule__Ignore__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1581:1: ( rule__Ignore__Group_4__1__Impl )
            // InternalCOV.g:1582:2: rule__Ignore__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Ignore__Group_4__1__Impl();

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
    // $ANTLR end "rule__Ignore__Group_4__1"


    // $ANTLR start "rule__Ignore__Group_4__1__Impl"
    // InternalCOV.g:1588:1: rule__Ignore__Group_4__1__Impl : ( ( rule__Ignore__IgnoreSubtypesAssignment_4_1 ) ) ;
    public final void rule__Ignore__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1592:1: ( ( ( rule__Ignore__IgnoreSubtypesAssignment_4_1 ) ) )
            // InternalCOV.g:1593:1: ( ( rule__Ignore__IgnoreSubtypesAssignment_4_1 ) )
            {
            // InternalCOV.g:1593:1: ( ( rule__Ignore__IgnoreSubtypesAssignment_4_1 ) )
            // InternalCOV.g:1594:2: ( rule__Ignore__IgnoreSubtypesAssignment_4_1 )
            {
             before(grammarAccess.getIgnoreAccess().getIgnoreSubtypesAssignment_4_1()); 
            // InternalCOV.g:1595:2: ( rule__Ignore__IgnoreSubtypesAssignment_4_1 )
            // InternalCOV.g:1595:3: rule__Ignore__IgnoreSubtypesAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Ignore__IgnoreSubtypesAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getIgnoreAccess().getIgnoreSubtypesAssignment_4_1()); 

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
    // $ANTLR end "rule__Ignore__Group_4__1__Impl"


    // $ANTLR start "rule__Ignore__Group_6__0"
    // InternalCOV.g:1604:1: rule__Ignore__Group_6__0 : rule__Ignore__Group_6__0__Impl rule__Ignore__Group_6__1 ;
    public final void rule__Ignore__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1608:1: ( rule__Ignore__Group_6__0__Impl rule__Ignore__Group_6__1 )
            // InternalCOV.g:1609:2: rule__Ignore__Group_6__0__Impl rule__Ignore__Group_6__1
            {
            pushFollow(FOLLOW_3);
            rule__Ignore__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ignore__Group_6__1();

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
    // $ANTLR end "rule__Ignore__Group_6__0"


    // $ANTLR start "rule__Ignore__Group_6__0__Impl"
    // InternalCOV.g:1616:1: rule__Ignore__Group_6__0__Impl : ( 'description' ) ;
    public final void rule__Ignore__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1620:1: ( ( 'description' ) )
            // InternalCOV.g:1621:1: ( 'description' )
            {
            // InternalCOV.g:1621:1: ( 'description' )
            // InternalCOV.g:1622:2: 'description'
            {
             before(grammarAccess.getIgnoreAccess().getDescriptionKeyword_6_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getIgnoreAccess().getDescriptionKeyword_6_0()); 

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
    // $ANTLR end "rule__Ignore__Group_6__0__Impl"


    // $ANTLR start "rule__Ignore__Group_6__1"
    // InternalCOV.g:1631:1: rule__Ignore__Group_6__1 : rule__Ignore__Group_6__1__Impl ;
    public final void rule__Ignore__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1635:1: ( rule__Ignore__Group_6__1__Impl )
            // InternalCOV.g:1636:2: rule__Ignore__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Ignore__Group_6__1__Impl();

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
    // $ANTLR end "rule__Ignore__Group_6__1"


    // $ANTLR start "rule__Ignore__Group_6__1__Impl"
    // InternalCOV.g:1642:1: rule__Ignore__Group_6__1__Impl : ( ( rule__Ignore__DescriptionAssignment_6_1 ) ) ;
    public final void rule__Ignore__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1646:1: ( ( ( rule__Ignore__DescriptionAssignment_6_1 ) ) )
            // InternalCOV.g:1647:1: ( ( rule__Ignore__DescriptionAssignment_6_1 ) )
            {
            // InternalCOV.g:1647:1: ( ( rule__Ignore__DescriptionAssignment_6_1 ) )
            // InternalCOV.g:1648:2: ( rule__Ignore__DescriptionAssignment_6_1 )
            {
             before(grammarAccess.getIgnoreAccess().getDescriptionAssignment_6_1()); 
            // InternalCOV.g:1649:2: ( rule__Ignore__DescriptionAssignment_6_1 )
            // InternalCOV.g:1649:3: rule__Ignore__DescriptionAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Ignore__DescriptionAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getIgnoreAccess().getDescriptionAssignment_6_1()); 

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
    // $ANTLR end "rule__Ignore__Group_6__1__Impl"


    // $ANTLR start "rule__LimitedIgnore__Group__0"
    // InternalCOV.g:1658:1: rule__LimitedIgnore__Group__0 : rule__LimitedIgnore__Group__0__Impl rule__LimitedIgnore__Group__1 ;
    public final void rule__LimitedIgnore__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1662:1: ( rule__LimitedIgnore__Group__0__Impl rule__LimitedIgnore__Group__1 )
            // InternalCOV.g:1663:2: rule__LimitedIgnore__Group__0__Impl rule__LimitedIgnore__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__LimitedIgnore__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LimitedIgnore__Group__1();

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
    // $ANTLR end "rule__LimitedIgnore__Group__0"


    // $ANTLR start "rule__LimitedIgnore__Group__0__Impl"
    // InternalCOV.g:1670:1: rule__LimitedIgnore__Group__0__Impl : ( () ) ;
    public final void rule__LimitedIgnore__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1674:1: ( ( () ) )
            // InternalCOV.g:1675:1: ( () )
            {
            // InternalCOV.g:1675:1: ( () )
            // InternalCOV.g:1676:2: ()
            {
             before(grammarAccess.getLimitedIgnoreAccess().getLimitedIgnoreAction_0()); 
            // InternalCOV.g:1677:2: ()
            // InternalCOV.g:1677:3: 
            {
            }

             after(grammarAccess.getLimitedIgnoreAccess().getLimitedIgnoreAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LimitedIgnore__Group__0__Impl"


    // $ANTLR start "rule__LimitedIgnore__Group__1"
    // InternalCOV.g:1685:1: rule__LimitedIgnore__Group__1 : rule__LimitedIgnore__Group__1__Impl rule__LimitedIgnore__Group__2 ;
    public final void rule__LimitedIgnore__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1689:1: ( rule__LimitedIgnore__Group__1__Impl rule__LimitedIgnore__Group__2 )
            // InternalCOV.g:1690:2: rule__LimitedIgnore__Group__1__Impl rule__LimitedIgnore__Group__2
            {
            pushFollow(FOLLOW_19);
            rule__LimitedIgnore__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LimitedIgnore__Group__2();

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
    // $ANTLR end "rule__LimitedIgnore__Group__1"


    // $ANTLR start "rule__LimitedIgnore__Group__1__Impl"
    // InternalCOV.g:1697:1: rule__LimitedIgnore__Group__1__Impl : ( ( rule__LimitedIgnore__Group_1__0 )? ) ;
    public final void rule__LimitedIgnore__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1701:1: ( ( ( rule__LimitedIgnore__Group_1__0 )? ) )
            // InternalCOV.g:1702:1: ( ( rule__LimitedIgnore__Group_1__0 )? )
            {
            // InternalCOV.g:1702:1: ( ( rule__LimitedIgnore__Group_1__0 )? )
            // InternalCOV.g:1703:2: ( rule__LimitedIgnore__Group_1__0 )?
            {
             before(grammarAccess.getLimitedIgnoreAccess().getGroup_1()); 
            // InternalCOV.g:1704:2: ( rule__LimitedIgnore__Group_1__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==27) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalCOV.g:1704:3: rule__LimitedIgnore__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LimitedIgnore__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLimitedIgnoreAccess().getGroup_1()); 

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
    // $ANTLR end "rule__LimitedIgnore__Group__1__Impl"


    // $ANTLR start "rule__LimitedIgnore__Group__2"
    // InternalCOV.g:1712:1: rule__LimitedIgnore__Group__2 : rule__LimitedIgnore__Group__2__Impl rule__LimitedIgnore__Group__3 ;
    public final void rule__LimitedIgnore__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1716:1: ( rule__LimitedIgnore__Group__2__Impl rule__LimitedIgnore__Group__3 )
            // InternalCOV.g:1717:2: rule__LimitedIgnore__Group__2__Impl rule__LimitedIgnore__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__LimitedIgnore__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LimitedIgnore__Group__3();

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
    // $ANTLR end "rule__LimitedIgnore__Group__2"


    // $ANTLR start "rule__LimitedIgnore__Group__2__Impl"
    // InternalCOV.g:1724:1: rule__LimitedIgnore__Group__2__Impl : ( 'ignoreif' ) ;
    public final void rule__LimitedIgnore__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1728:1: ( ( 'ignoreif' ) )
            // InternalCOV.g:1729:1: ( 'ignoreif' )
            {
            // InternalCOV.g:1729:1: ( 'ignoreif' )
            // InternalCOV.g:1730:2: 'ignoreif'
            {
             before(grammarAccess.getLimitedIgnoreAccess().getIgnoreifKeyword_2()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getLimitedIgnoreAccess().getIgnoreifKeyword_2()); 

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
    // $ANTLR end "rule__LimitedIgnore__Group__2__Impl"


    // $ANTLR start "rule__LimitedIgnore__Group__3"
    // InternalCOV.g:1739:1: rule__LimitedIgnore__Group__3 : rule__LimitedIgnore__Group__3__Impl rule__LimitedIgnore__Group__4 ;
    public final void rule__LimitedIgnore__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1743:1: ( rule__LimitedIgnore__Group__3__Impl rule__LimitedIgnore__Group__4 )
            // InternalCOV.g:1744:2: rule__LimitedIgnore__Group__3__Impl rule__LimitedIgnore__Group__4
            {
            pushFollow(FOLLOW_3);
            rule__LimitedIgnore__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LimitedIgnore__Group__4();

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
    // $ANTLR end "rule__LimitedIgnore__Group__3"


    // $ANTLR start "rule__LimitedIgnore__Group__3__Impl"
    // InternalCOV.g:1751:1: rule__LimitedIgnore__Group__3__Impl : ( ( rule__LimitedIgnore__TypeAssignment_3 ) ) ;
    public final void rule__LimitedIgnore__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1755:1: ( ( ( rule__LimitedIgnore__TypeAssignment_3 ) ) )
            // InternalCOV.g:1756:1: ( ( rule__LimitedIgnore__TypeAssignment_3 ) )
            {
            // InternalCOV.g:1756:1: ( ( rule__LimitedIgnore__TypeAssignment_3 ) )
            // InternalCOV.g:1757:2: ( rule__LimitedIgnore__TypeAssignment_3 )
            {
             before(grammarAccess.getLimitedIgnoreAccess().getTypeAssignment_3()); 
            // InternalCOV.g:1758:2: ( rule__LimitedIgnore__TypeAssignment_3 )
            // InternalCOV.g:1758:3: rule__LimitedIgnore__TypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__LimitedIgnore__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getLimitedIgnoreAccess().getTypeAssignment_3()); 

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
    // $ANTLR end "rule__LimitedIgnore__Group__3__Impl"


    // $ANTLR start "rule__LimitedIgnore__Group__4"
    // InternalCOV.g:1766:1: rule__LimitedIgnore__Group__4 : rule__LimitedIgnore__Group__4__Impl rule__LimitedIgnore__Group__5 ;
    public final void rule__LimitedIgnore__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1770:1: ( rule__LimitedIgnore__Group__4__Impl rule__LimitedIgnore__Group__5 )
            // InternalCOV.g:1771:2: rule__LimitedIgnore__Group__4__Impl rule__LimitedIgnore__Group__5
            {
            pushFollow(FOLLOW_21);
            rule__LimitedIgnore__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LimitedIgnore__Group__5();

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
    // $ANTLR end "rule__LimitedIgnore__Group__4"


    // $ANTLR start "rule__LimitedIgnore__Group__4__Impl"
    // InternalCOV.g:1778:1: rule__LimitedIgnore__Group__4__Impl : ( ( rule__LimitedIgnore__ContainerMetaclassAssignment_4 ) ) ;
    public final void rule__LimitedIgnore__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1782:1: ( ( ( rule__LimitedIgnore__ContainerMetaclassAssignment_4 ) ) )
            // InternalCOV.g:1783:1: ( ( rule__LimitedIgnore__ContainerMetaclassAssignment_4 ) )
            {
            // InternalCOV.g:1783:1: ( ( rule__LimitedIgnore__ContainerMetaclassAssignment_4 ) )
            // InternalCOV.g:1784:2: ( rule__LimitedIgnore__ContainerMetaclassAssignment_4 )
            {
             before(grammarAccess.getLimitedIgnoreAccess().getContainerMetaclassAssignment_4()); 
            // InternalCOV.g:1785:2: ( rule__LimitedIgnore__ContainerMetaclassAssignment_4 )
            // InternalCOV.g:1785:3: rule__LimitedIgnore__ContainerMetaclassAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__LimitedIgnore__ContainerMetaclassAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getLimitedIgnoreAccess().getContainerMetaclassAssignment_4()); 

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
    // $ANTLR end "rule__LimitedIgnore__Group__4__Impl"


    // $ANTLR start "rule__LimitedIgnore__Group__5"
    // InternalCOV.g:1793:1: rule__LimitedIgnore__Group__5 : rule__LimitedIgnore__Group__5__Impl rule__LimitedIgnore__Group__6 ;
    public final void rule__LimitedIgnore__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1797:1: ( rule__LimitedIgnore__Group__5__Impl rule__LimitedIgnore__Group__6 )
            // InternalCOV.g:1798:2: rule__LimitedIgnore__Group__5__Impl rule__LimitedIgnore__Group__6
            {
            pushFollow(FOLLOW_21);
            rule__LimitedIgnore__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LimitedIgnore__Group__6();

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
    // $ANTLR end "rule__LimitedIgnore__Group__5"


    // $ANTLR start "rule__LimitedIgnore__Group__5__Impl"
    // InternalCOV.g:1805:1: rule__LimitedIgnore__Group__5__Impl : ( ( rule__LimitedIgnore__Group_5__0 )* ) ;
    public final void rule__LimitedIgnore__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1809:1: ( ( ( rule__LimitedIgnore__Group_5__0 )* ) )
            // InternalCOV.g:1810:1: ( ( rule__LimitedIgnore__Group_5__0 )* )
            {
            // InternalCOV.g:1810:1: ( ( rule__LimitedIgnore__Group_5__0 )* )
            // InternalCOV.g:1811:2: ( rule__LimitedIgnore__Group_5__0 )*
            {
             before(grammarAccess.getLimitedIgnoreAccess().getGroup_5()); 
            // InternalCOV.g:1812:2: ( rule__LimitedIgnore__Group_5__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==22) ) {
                    int LA16_2 = input.LA(2);

                    if ( ((LA16_2>=RULE_STRING && LA16_2<=RULE_ID)) ) {
                        alt16=1;
                    }


                }


                switch (alt16) {
            	case 1 :
            	    // InternalCOV.g:1812:3: rule__LimitedIgnore__Group_5__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__LimitedIgnore__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getLimitedIgnoreAccess().getGroup_5()); 

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
    // $ANTLR end "rule__LimitedIgnore__Group__5__Impl"


    // $ANTLR start "rule__LimitedIgnore__Group__6"
    // InternalCOV.g:1820:1: rule__LimitedIgnore__Group__6 : rule__LimitedIgnore__Group__6__Impl ;
    public final void rule__LimitedIgnore__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1824:1: ( rule__LimitedIgnore__Group__6__Impl )
            // InternalCOV.g:1825:2: rule__LimitedIgnore__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LimitedIgnore__Group__6__Impl();

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
    // $ANTLR end "rule__LimitedIgnore__Group__6"


    // $ANTLR start "rule__LimitedIgnore__Group__6__Impl"
    // InternalCOV.g:1831:1: rule__LimitedIgnore__Group__6__Impl : ( ( rule__LimitedIgnore__Group_6__0 )? ) ;
    public final void rule__LimitedIgnore__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1835:1: ( ( ( rule__LimitedIgnore__Group_6__0 )? ) )
            // InternalCOV.g:1836:1: ( ( rule__LimitedIgnore__Group_6__0 )? )
            {
            // InternalCOV.g:1836:1: ( ( rule__LimitedIgnore__Group_6__0 )? )
            // InternalCOV.g:1837:2: ( rule__LimitedIgnore__Group_6__0 )?
            {
             before(grammarAccess.getLimitedIgnoreAccess().getGroup_6()); 
            // InternalCOV.g:1838:2: ( rule__LimitedIgnore__Group_6__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==29) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalCOV.g:1838:3: rule__LimitedIgnore__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LimitedIgnore__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLimitedIgnoreAccess().getGroup_6()); 

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
    // $ANTLR end "rule__LimitedIgnore__Group__6__Impl"


    // $ANTLR start "rule__LimitedIgnore__Group_1__0"
    // InternalCOV.g:1847:1: rule__LimitedIgnore__Group_1__0 : rule__LimitedIgnore__Group_1__0__Impl rule__LimitedIgnore__Group_1__1 ;
    public final void rule__LimitedIgnore__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1851:1: ( rule__LimitedIgnore__Group_1__0__Impl rule__LimitedIgnore__Group_1__1 )
            // InternalCOV.g:1852:2: rule__LimitedIgnore__Group_1__0__Impl rule__LimitedIgnore__Group_1__1
            {
            pushFollow(FOLLOW_3);
            rule__LimitedIgnore__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LimitedIgnore__Group_1__1();

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
    // $ANTLR end "rule__LimitedIgnore__Group_1__0"


    // $ANTLR start "rule__LimitedIgnore__Group_1__0__Impl"
    // InternalCOV.g:1859:1: rule__LimitedIgnore__Group_1__0__Impl : ( 'when' ) ;
    public final void rule__LimitedIgnore__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1863:1: ( ( 'when' ) )
            // InternalCOV.g:1864:1: ( 'when' )
            {
            // InternalCOV.g:1864:1: ( 'when' )
            // InternalCOV.g:1865:2: 'when'
            {
             before(grammarAccess.getLimitedIgnoreAccess().getWhenKeyword_1_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getLimitedIgnoreAccess().getWhenKeyword_1_0()); 

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
    // $ANTLR end "rule__LimitedIgnore__Group_1__0__Impl"


    // $ANTLR start "rule__LimitedIgnore__Group_1__1"
    // InternalCOV.g:1874:1: rule__LimitedIgnore__Group_1__1 : rule__LimitedIgnore__Group_1__1__Impl ;
    public final void rule__LimitedIgnore__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1878:1: ( rule__LimitedIgnore__Group_1__1__Impl )
            // InternalCOV.g:1879:2: rule__LimitedIgnore__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LimitedIgnore__Group_1__1__Impl();

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
    // $ANTLR end "rule__LimitedIgnore__Group_1__1"


    // $ANTLR start "rule__LimitedIgnore__Group_1__1__Impl"
    // InternalCOV.g:1885:1: rule__LimitedIgnore__Group_1__1__Impl : ( ( rule__LimitedIgnore__ConditionAssignment_1_1 ) ) ;
    public final void rule__LimitedIgnore__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1889:1: ( ( ( rule__LimitedIgnore__ConditionAssignment_1_1 ) ) )
            // InternalCOV.g:1890:1: ( ( rule__LimitedIgnore__ConditionAssignment_1_1 ) )
            {
            // InternalCOV.g:1890:1: ( ( rule__LimitedIgnore__ConditionAssignment_1_1 ) )
            // InternalCOV.g:1891:2: ( rule__LimitedIgnore__ConditionAssignment_1_1 )
            {
             before(grammarAccess.getLimitedIgnoreAccess().getConditionAssignment_1_1()); 
            // InternalCOV.g:1892:2: ( rule__LimitedIgnore__ConditionAssignment_1_1 )
            // InternalCOV.g:1892:3: rule__LimitedIgnore__ConditionAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__LimitedIgnore__ConditionAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getLimitedIgnoreAccess().getConditionAssignment_1_1()); 

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
    // $ANTLR end "rule__LimitedIgnore__Group_1__1__Impl"


    // $ANTLR start "rule__LimitedIgnore__Group_5__0"
    // InternalCOV.g:1901:1: rule__LimitedIgnore__Group_5__0 : rule__LimitedIgnore__Group_5__0__Impl rule__LimitedIgnore__Group_5__1 ;
    public final void rule__LimitedIgnore__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1905:1: ( rule__LimitedIgnore__Group_5__0__Impl rule__LimitedIgnore__Group_5__1 )
            // InternalCOV.g:1906:2: rule__LimitedIgnore__Group_5__0__Impl rule__LimitedIgnore__Group_5__1
            {
            pushFollow(FOLLOW_3);
            rule__LimitedIgnore__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LimitedIgnore__Group_5__1();

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
    // $ANTLR end "rule__LimitedIgnore__Group_5__0"


    // $ANTLR start "rule__LimitedIgnore__Group_5__0__Impl"
    // InternalCOV.g:1913:1: rule__LimitedIgnore__Group_5__0__Impl : ( ',' ) ;
    public final void rule__LimitedIgnore__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1917:1: ( ( ',' ) )
            // InternalCOV.g:1918:1: ( ',' )
            {
            // InternalCOV.g:1918:1: ( ',' )
            // InternalCOV.g:1919:2: ','
            {
             before(grammarAccess.getLimitedIgnoreAccess().getCommaKeyword_5_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getLimitedIgnoreAccess().getCommaKeyword_5_0()); 

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
    // $ANTLR end "rule__LimitedIgnore__Group_5__0__Impl"


    // $ANTLR start "rule__LimitedIgnore__Group_5__1"
    // InternalCOV.g:1928:1: rule__LimitedIgnore__Group_5__1 : rule__LimitedIgnore__Group_5__1__Impl ;
    public final void rule__LimitedIgnore__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1932:1: ( rule__LimitedIgnore__Group_5__1__Impl )
            // InternalCOV.g:1933:2: rule__LimitedIgnore__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LimitedIgnore__Group_5__1__Impl();

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
    // $ANTLR end "rule__LimitedIgnore__Group_5__1"


    // $ANTLR start "rule__LimitedIgnore__Group_5__1__Impl"
    // InternalCOV.g:1939:1: rule__LimitedIgnore__Group_5__1__Impl : ( ( rule__LimitedIgnore__ContainerMetaclassAssignment_5_1 ) ) ;
    public final void rule__LimitedIgnore__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1943:1: ( ( ( rule__LimitedIgnore__ContainerMetaclassAssignment_5_1 ) ) )
            // InternalCOV.g:1944:1: ( ( rule__LimitedIgnore__ContainerMetaclassAssignment_5_1 ) )
            {
            // InternalCOV.g:1944:1: ( ( rule__LimitedIgnore__ContainerMetaclassAssignment_5_1 ) )
            // InternalCOV.g:1945:2: ( rule__LimitedIgnore__ContainerMetaclassAssignment_5_1 )
            {
             before(grammarAccess.getLimitedIgnoreAccess().getContainerMetaclassAssignment_5_1()); 
            // InternalCOV.g:1946:2: ( rule__LimitedIgnore__ContainerMetaclassAssignment_5_1 )
            // InternalCOV.g:1946:3: rule__LimitedIgnore__ContainerMetaclassAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__LimitedIgnore__ContainerMetaclassAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getLimitedIgnoreAccess().getContainerMetaclassAssignment_5_1()); 

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
    // $ANTLR end "rule__LimitedIgnore__Group_5__1__Impl"


    // $ANTLR start "rule__LimitedIgnore__Group_6__0"
    // InternalCOV.g:1955:1: rule__LimitedIgnore__Group_6__0 : rule__LimitedIgnore__Group_6__0__Impl rule__LimitedIgnore__Group_6__1 ;
    public final void rule__LimitedIgnore__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1959:1: ( rule__LimitedIgnore__Group_6__0__Impl rule__LimitedIgnore__Group_6__1 )
            // InternalCOV.g:1960:2: rule__LimitedIgnore__Group_6__0__Impl rule__LimitedIgnore__Group_6__1
            {
            pushFollow(FOLLOW_3);
            rule__LimitedIgnore__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LimitedIgnore__Group_6__1();

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
    // $ANTLR end "rule__LimitedIgnore__Group_6__0"


    // $ANTLR start "rule__LimitedIgnore__Group_6__0__Impl"
    // InternalCOV.g:1967:1: rule__LimitedIgnore__Group_6__0__Impl : ( 'description' ) ;
    public final void rule__LimitedIgnore__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1971:1: ( ( 'description' ) )
            // InternalCOV.g:1972:1: ( 'description' )
            {
            // InternalCOV.g:1972:1: ( 'description' )
            // InternalCOV.g:1973:2: 'description'
            {
             before(grammarAccess.getLimitedIgnoreAccess().getDescriptionKeyword_6_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getLimitedIgnoreAccess().getDescriptionKeyword_6_0()); 

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
    // $ANTLR end "rule__LimitedIgnore__Group_6__0__Impl"


    // $ANTLR start "rule__LimitedIgnore__Group_6__1"
    // InternalCOV.g:1982:1: rule__LimitedIgnore__Group_6__1 : rule__LimitedIgnore__Group_6__1__Impl ;
    public final void rule__LimitedIgnore__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1986:1: ( rule__LimitedIgnore__Group_6__1__Impl )
            // InternalCOV.g:1987:2: rule__LimitedIgnore__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LimitedIgnore__Group_6__1__Impl();

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
    // $ANTLR end "rule__LimitedIgnore__Group_6__1"


    // $ANTLR start "rule__LimitedIgnore__Group_6__1__Impl"
    // InternalCOV.g:1993:1: rule__LimitedIgnore__Group_6__1__Impl : ( ( rule__LimitedIgnore__DescriptionAssignment_6_1 ) ) ;
    public final void rule__LimitedIgnore__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1997:1: ( ( ( rule__LimitedIgnore__DescriptionAssignment_6_1 ) ) )
            // InternalCOV.g:1998:1: ( ( rule__LimitedIgnore__DescriptionAssignment_6_1 ) )
            {
            // InternalCOV.g:1998:1: ( ( rule__LimitedIgnore__DescriptionAssignment_6_1 ) )
            // InternalCOV.g:1999:2: ( rule__LimitedIgnore__DescriptionAssignment_6_1 )
            {
             before(grammarAccess.getLimitedIgnoreAccess().getDescriptionAssignment_6_1()); 
            // InternalCOV.g:2000:2: ( rule__LimitedIgnore__DescriptionAssignment_6_1 )
            // InternalCOV.g:2000:3: rule__LimitedIgnore__DescriptionAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__LimitedIgnore__DescriptionAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getLimitedIgnoreAccess().getDescriptionAssignment_6_1()); 

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
    // $ANTLR end "rule__LimitedIgnore__Group_6__1__Impl"


    // $ANTLR start "rule__CoverageOfReferenced__Group__0"
    // InternalCOV.g:2009:1: rule__CoverageOfReferenced__Group__0 : rule__CoverageOfReferenced__Group__0__Impl rule__CoverageOfReferenced__Group__1 ;
    public final void rule__CoverageOfReferenced__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2013:1: ( rule__CoverageOfReferenced__Group__0__Impl rule__CoverageOfReferenced__Group__1 )
            // InternalCOV.g:2014:2: rule__CoverageOfReferenced__Group__0__Impl rule__CoverageOfReferenced__Group__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalCOV.g:2021:1: rule__CoverageOfReferenced__Group__0__Impl : ( () ) ;
    public final void rule__CoverageOfReferenced__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2025:1: ( ( () ) )
            // InternalCOV.g:2026:1: ( () )
            {
            // InternalCOV.g:2026:1: ( () )
            // InternalCOV.g:2027:2: ()
            {
             before(grammarAccess.getCoverageOfReferencedAccess().getCoverageOfReferencedAction_0()); 
            // InternalCOV.g:2028:2: ()
            // InternalCOV.g:2028:3: 
            {
            }

             after(grammarAccess.getCoverageOfReferencedAccess().getCoverageOfReferencedAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoverageOfReferenced__Group__0__Impl"


    // $ANTLR start "rule__CoverageOfReferenced__Group__1"
    // InternalCOV.g:2036:1: rule__CoverageOfReferenced__Group__1 : rule__CoverageOfReferenced__Group__1__Impl rule__CoverageOfReferenced__Group__2 ;
    public final void rule__CoverageOfReferenced__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2040:1: ( rule__CoverageOfReferenced__Group__1__Impl rule__CoverageOfReferenced__Group__2 )
            // InternalCOV.g:2041:2: rule__CoverageOfReferenced__Group__1__Impl rule__CoverageOfReferenced__Group__2
            {
            pushFollow(FOLLOW_22);
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
    // InternalCOV.g:2048:1: rule__CoverageOfReferenced__Group__1__Impl : ( ( rule__CoverageOfReferenced__Group_1__0 )? ) ;
    public final void rule__CoverageOfReferenced__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2052:1: ( ( ( rule__CoverageOfReferenced__Group_1__0 )? ) )
            // InternalCOV.g:2053:1: ( ( rule__CoverageOfReferenced__Group_1__0 )? )
            {
            // InternalCOV.g:2053:1: ( ( rule__CoverageOfReferenced__Group_1__0 )? )
            // InternalCOV.g:2054:2: ( rule__CoverageOfReferenced__Group_1__0 )?
            {
             before(grammarAccess.getCoverageOfReferencedAccess().getGroup_1()); 
            // InternalCOV.g:2055:2: ( rule__CoverageOfReferenced__Group_1__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==27) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalCOV.g:2055:3: rule__CoverageOfReferenced__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CoverageOfReferenced__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCoverageOfReferencedAccess().getGroup_1()); 

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
    // InternalCOV.g:2063:1: rule__CoverageOfReferenced__Group__2 : rule__CoverageOfReferenced__Group__2__Impl rule__CoverageOfReferenced__Group__3 ;
    public final void rule__CoverageOfReferenced__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2067:1: ( rule__CoverageOfReferenced__Group__2__Impl rule__CoverageOfReferenced__Group__3 )
            // InternalCOV.g:2068:2: rule__CoverageOfReferenced__Group__2__Impl rule__CoverageOfReferenced__Group__3
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
    // InternalCOV.g:2075:1: rule__CoverageOfReferenced__Group__2__Impl : ( 'covers' ) ;
    public final void rule__CoverageOfReferenced__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2079:1: ( ( 'covers' ) )
            // InternalCOV.g:2080:1: ( 'covers' )
            {
            // InternalCOV.g:2080:1: ( 'covers' )
            // InternalCOV.g:2081:2: 'covers'
            {
             before(grammarAccess.getCoverageOfReferencedAccess().getCoversKeyword_2()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getCoverageOfReferencedAccess().getCoversKeyword_2()); 

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
    // InternalCOV.g:2090:1: rule__CoverageOfReferenced__Group__3 : rule__CoverageOfReferenced__Group__3__Impl rule__CoverageOfReferenced__Group__4 ;
    public final void rule__CoverageOfReferenced__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2094:1: ( rule__CoverageOfReferenced__Group__3__Impl rule__CoverageOfReferenced__Group__4 )
            // InternalCOV.g:2095:2: rule__CoverageOfReferenced__Group__3__Impl rule__CoverageOfReferenced__Group__4
            {
            pushFollow(FOLLOW_21);
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
    // InternalCOV.g:2102:1: rule__CoverageOfReferenced__Group__3__Impl : ( ( rule__CoverageOfReferenced__ReferenceAssignment_3 ) ) ;
    public final void rule__CoverageOfReferenced__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2106:1: ( ( ( rule__CoverageOfReferenced__ReferenceAssignment_3 ) ) )
            // InternalCOV.g:2107:1: ( ( rule__CoverageOfReferenced__ReferenceAssignment_3 ) )
            {
            // InternalCOV.g:2107:1: ( ( rule__CoverageOfReferenced__ReferenceAssignment_3 ) )
            // InternalCOV.g:2108:2: ( rule__CoverageOfReferenced__ReferenceAssignment_3 )
            {
             before(grammarAccess.getCoverageOfReferencedAccess().getReferenceAssignment_3()); 
            // InternalCOV.g:2109:2: ( rule__CoverageOfReferenced__ReferenceAssignment_3 )
            // InternalCOV.g:2109:3: rule__CoverageOfReferenced__ReferenceAssignment_3
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
    // InternalCOV.g:2117:1: rule__CoverageOfReferenced__Group__4 : rule__CoverageOfReferenced__Group__4__Impl rule__CoverageOfReferenced__Group__5 ;
    public final void rule__CoverageOfReferenced__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2121:1: ( rule__CoverageOfReferenced__Group__4__Impl rule__CoverageOfReferenced__Group__5 )
            // InternalCOV.g:2122:2: rule__CoverageOfReferenced__Group__4__Impl rule__CoverageOfReferenced__Group__5
            {
            pushFollow(FOLLOW_21);
            rule__CoverageOfReferenced__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CoverageOfReferenced__Group__5();

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
    // InternalCOV.g:2129:1: rule__CoverageOfReferenced__Group__4__Impl : ( ( rule__CoverageOfReferenced__Group_4__0 )* ) ;
    public final void rule__CoverageOfReferenced__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2133:1: ( ( ( rule__CoverageOfReferenced__Group_4__0 )* ) )
            // InternalCOV.g:2134:1: ( ( rule__CoverageOfReferenced__Group_4__0 )* )
            {
            // InternalCOV.g:2134:1: ( ( rule__CoverageOfReferenced__Group_4__0 )* )
            // InternalCOV.g:2135:2: ( rule__CoverageOfReferenced__Group_4__0 )*
            {
             before(grammarAccess.getCoverageOfReferencedAccess().getGroup_4()); 
            // InternalCOV.g:2136:2: ( rule__CoverageOfReferenced__Group_4__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==22) ) {
                    int LA19_2 = input.LA(2);

                    if ( ((LA19_2>=RULE_STRING && LA19_2<=RULE_ID)) ) {
                        alt19=1;
                    }


                }


                switch (alt19) {
            	case 1 :
            	    // InternalCOV.g:2136:3: rule__CoverageOfReferenced__Group_4__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__CoverageOfReferenced__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getCoverageOfReferencedAccess().getGroup_4()); 

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


    // $ANTLR start "rule__CoverageOfReferenced__Group__5"
    // InternalCOV.g:2144:1: rule__CoverageOfReferenced__Group__5 : rule__CoverageOfReferenced__Group__5__Impl ;
    public final void rule__CoverageOfReferenced__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2148:1: ( rule__CoverageOfReferenced__Group__5__Impl )
            // InternalCOV.g:2149:2: rule__CoverageOfReferenced__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CoverageOfReferenced__Group__5__Impl();

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
    // $ANTLR end "rule__CoverageOfReferenced__Group__5"


    // $ANTLR start "rule__CoverageOfReferenced__Group__5__Impl"
    // InternalCOV.g:2155:1: rule__CoverageOfReferenced__Group__5__Impl : ( ( rule__CoverageOfReferenced__Group_5__0 )? ) ;
    public final void rule__CoverageOfReferenced__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2159:1: ( ( ( rule__CoverageOfReferenced__Group_5__0 )? ) )
            // InternalCOV.g:2160:1: ( ( rule__CoverageOfReferenced__Group_5__0 )? )
            {
            // InternalCOV.g:2160:1: ( ( rule__CoverageOfReferenced__Group_5__0 )? )
            // InternalCOV.g:2161:2: ( rule__CoverageOfReferenced__Group_5__0 )?
            {
             before(grammarAccess.getCoverageOfReferencedAccess().getGroup_5()); 
            // InternalCOV.g:2162:2: ( rule__CoverageOfReferenced__Group_5__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==29) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalCOV.g:2162:3: rule__CoverageOfReferenced__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CoverageOfReferenced__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCoverageOfReferencedAccess().getGroup_5()); 

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
    // $ANTLR end "rule__CoverageOfReferenced__Group__5__Impl"


    // $ANTLR start "rule__CoverageOfReferenced__Group_1__0"
    // InternalCOV.g:2171:1: rule__CoverageOfReferenced__Group_1__0 : rule__CoverageOfReferenced__Group_1__0__Impl rule__CoverageOfReferenced__Group_1__1 ;
    public final void rule__CoverageOfReferenced__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2175:1: ( rule__CoverageOfReferenced__Group_1__0__Impl rule__CoverageOfReferenced__Group_1__1 )
            // InternalCOV.g:2176:2: rule__CoverageOfReferenced__Group_1__0__Impl rule__CoverageOfReferenced__Group_1__1
            {
            pushFollow(FOLLOW_3);
            rule__CoverageOfReferenced__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CoverageOfReferenced__Group_1__1();

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
    // $ANTLR end "rule__CoverageOfReferenced__Group_1__0"


    // $ANTLR start "rule__CoverageOfReferenced__Group_1__0__Impl"
    // InternalCOV.g:2183:1: rule__CoverageOfReferenced__Group_1__0__Impl : ( 'when' ) ;
    public final void rule__CoverageOfReferenced__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2187:1: ( ( 'when' ) )
            // InternalCOV.g:2188:1: ( 'when' )
            {
            // InternalCOV.g:2188:1: ( 'when' )
            // InternalCOV.g:2189:2: 'when'
            {
             before(grammarAccess.getCoverageOfReferencedAccess().getWhenKeyword_1_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getCoverageOfReferencedAccess().getWhenKeyword_1_0()); 

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
    // $ANTLR end "rule__CoverageOfReferenced__Group_1__0__Impl"


    // $ANTLR start "rule__CoverageOfReferenced__Group_1__1"
    // InternalCOV.g:2198:1: rule__CoverageOfReferenced__Group_1__1 : rule__CoverageOfReferenced__Group_1__1__Impl ;
    public final void rule__CoverageOfReferenced__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2202:1: ( rule__CoverageOfReferenced__Group_1__1__Impl )
            // InternalCOV.g:2203:2: rule__CoverageOfReferenced__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CoverageOfReferenced__Group_1__1__Impl();

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
    // $ANTLR end "rule__CoverageOfReferenced__Group_1__1"


    // $ANTLR start "rule__CoverageOfReferenced__Group_1__1__Impl"
    // InternalCOV.g:2209:1: rule__CoverageOfReferenced__Group_1__1__Impl : ( ( rule__CoverageOfReferenced__ConditionAssignment_1_1 ) ) ;
    public final void rule__CoverageOfReferenced__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2213:1: ( ( ( rule__CoverageOfReferenced__ConditionAssignment_1_1 ) ) )
            // InternalCOV.g:2214:1: ( ( rule__CoverageOfReferenced__ConditionAssignment_1_1 ) )
            {
            // InternalCOV.g:2214:1: ( ( rule__CoverageOfReferenced__ConditionAssignment_1_1 ) )
            // InternalCOV.g:2215:2: ( rule__CoverageOfReferenced__ConditionAssignment_1_1 )
            {
             before(grammarAccess.getCoverageOfReferencedAccess().getConditionAssignment_1_1()); 
            // InternalCOV.g:2216:2: ( rule__CoverageOfReferenced__ConditionAssignment_1_1 )
            // InternalCOV.g:2216:3: rule__CoverageOfReferenced__ConditionAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__CoverageOfReferenced__ConditionAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getCoverageOfReferencedAccess().getConditionAssignment_1_1()); 

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
    // $ANTLR end "rule__CoverageOfReferenced__Group_1__1__Impl"


    // $ANTLR start "rule__CoverageOfReferenced__Group_4__0"
    // InternalCOV.g:2225:1: rule__CoverageOfReferenced__Group_4__0 : rule__CoverageOfReferenced__Group_4__0__Impl rule__CoverageOfReferenced__Group_4__1 ;
    public final void rule__CoverageOfReferenced__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2229:1: ( rule__CoverageOfReferenced__Group_4__0__Impl rule__CoverageOfReferenced__Group_4__1 )
            // InternalCOV.g:2230:2: rule__CoverageOfReferenced__Group_4__0__Impl rule__CoverageOfReferenced__Group_4__1
            {
            pushFollow(FOLLOW_3);
            rule__CoverageOfReferenced__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CoverageOfReferenced__Group_4__1();

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
    // $ANTLR end "rule__CoverageOfReferenced__Group_4__0"


    // $ANTLR start "rule__CoverageOfReferenced__Group_4__0__Impl"
    // InternalCOV.g:2237:1: rule__CoverageOfReferenced__Group_4__0__Impl : ( ',' ) ;
    public final void rule__CoverageOfReferenced__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2241:1: ( ( ',' ) )
            // InternalCOV.g:2242:1: ( ',' )
            {
            // InternalCOV.g:2242:1: ( ',' )
            // InternalCOV.g:2243:2: ','
            {
             before(grammarAccess.getCoverageOfReferencedAccess().getCommaKeyword_4_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getCoverageOfReferencedAccess().getCommaKeyword_4_0()); 

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
    // $ANTLR end "rule__CoverageOfReferenced__Group_4__0__Impl"


    // $ANTLR start "rule__CoverageOfReferenced__Group_4__1"
    // InternalCOV.g:2252:1: rule__CoverageOfReferenced__Group_4__1 : rule__CoverageOfReferenced__Group_4__1__Impl ;
    public final void rule__CoverageOfReferenced__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2256:1: ( rule__CoverageOfReferenced__Group_4__1__Impl )
            // InternalCOV.g:2257:2: rule__CoverageOfReferenced__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CoverageOfReferenced__Group_4__1__Impl();

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
    // $ANTLR end "rule__CoverageOfReferenced__Group_4__1"


    // $ANTLR start "rule__CoverageOfReferenced__Group_4__1__Impl"
    // InternalCOV.g:2263:1: rule__CoverageOfReferenced__Group_4__1__Impl : ( ( rule__CoverageOfReferenced__ReferenceAssignment_4_1 ) ) ;
    public final void rule__CoverageOfReferenced__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2267:1: ( ( ( rule__CoverageOfReferenced__ReferenceAssignment_4_1 ) ) )
            // InternalCOV.g:2268:1: ( ( rule__CoverageOfReferenced__ReferenceAssignment_4_1 ) )
            {
            // InternalCOV.g:2268:1: ( ( rule__CoverageOfReferenced__ReferenceAssignment_4_1 ) )
            // InternalCOV.g:2269:2: ( rule__CoverageOfReferenced__ReferenceAssignment_4_1 )
            {
             before(grammarAccess.getCoverageOfReferencedAccess().getReferenceAssignment_4_1()); 
            // InternalCOV.g:2270:2: ( rule__CoverageOfReferenced__ReferenceAssignment_4_1 )
            // InternalCOV.g:2270:3: rule__CoverageOfReferenced__ReferenceAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__CoverageOfReferenced__ReferenceAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getCoverageOfReferencedAccess().getReferenceAssignment_4_1()); 

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
    // $ANTLR end "rule__CoverageOfReferenced__Group_4__1__Impl"


    // $ANTLR start "rule__CoverageOfReferenced__Group_5__0"
    // InternalCOV.g:2279:1: rule__CoverageOfReferenced__Group_5__0 : rule__CoverageOfReferenced__Group_5__0__Impl rule__CoverageOfReferenced__Group_5__1 ;
    public final void rule__CoverageOfReferenced__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2283:1: ( rule__CoverageOfReferenced__Group_5__0__Impl rule__CoverageOfReferenced__Group_5__1 )
            // InternalCOV.g:2284:2: rule__CoverageOfReferenced__Group_5__0__Impl rule__CoverageOfReferenced__Group_5__1
            {
            pushFollow(FOLLOW_3);
            rule__CoverageOfReferenced__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CoverageOfReferenced__Group_5__1();

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
    // $ANTLR end "rule__CoverageOfReferenced__Group_5__0"


    // $ANTLR start "rule__CoverageOfReferenced__Group_5__0__Impl"
    // InternalCOV.g:2291:1: rule__CoverageOfReferenced__Group_5__0__Impl : ( 'description' ) ;
    public final void rule__CoverageOfReferenced__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2295:1: ( ( 'description' ) )
            // InternalCOV.g:2296:1: ( 'description' )
            {
            // InternalCOV.g:2296:1: ( 'description' )
            // InternalCOV.g:2297:2: 'description'
            {
             before(grammarAccess.getCoverageOfReferencedAccess().getDescriptionKeyword_5_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getCoverageOfReferencedAccess().getDescriptionKeyword_5_0()); 

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
    // $ANTLR end "rule__CoverageOfReferenced__Group_5__0__Impl"


    // $ANTLR start "rule__CoverageOfReferenced__Group_5__1"
    // InternalCOV.g:2306:1: rule__CoverageOfReferenced__Group_5__1 : rule__CoverageOfReferenced__Group_5__1__Impl ;
    public final void rule__CoverageOfReferenced__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2310:1: ( rule__CoverageOfReferenced__Group_5__1__Impl )
            // InternalCOV.g:2311:2: rule__CoverageOfReferenced__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CoverageOfReferenced__Group_5__1__Impl();

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
    // $ANTLR end "rule__CoverageOfReferenced__Group_5__1"


    // $ANTLR start "rule__CoverageOfReferenced__Group_5__1__Impl"
    // InternalCOV.g:2317:1: rule__CoverageOfReferenced__Group_5__1__Impl : ( ( rule__CoverageOfReferenced__DescriptionAssignment_5_1 ) ) ;
    public final void rule__CoverageOfReferenced__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2321:1: ( ( ( rule__CoverageOfReferenced__DescriptionAssignment_5_1 ) ) )
            // InternalCOV.g:2322:1: ( ( rule__CoverageOfReferenced__DescriptionAssignment_5_1 ) )
            {
            // InternalCOV.g:2322:1: ( ( rule__CoverageOfReferenced__DescriptionAssignment_5_1 ) )
            // InternalCOV.g:2323:2: ( rule__CoverageOfReferenced__DescriptionAssignment_5_1 )
            {
             before(grammarAccess.getCoverageOfReferencedAccess().getDescriptionAssignment_5_1()); 
            // InternalCOV.g:2324:2: ( rule__CoverageOfReferenced__DescriptionAssignment_5_1 )
            // InternalCOV.g:2324:3: rule__CoverageOfReferenced__DescriptionAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__CoverageOfReferenced__DescriptionAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getCoverageOfReferencedAccess().getDescriptionAssignment_5_1()); 

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
    // $ANTLR end "rule__CoverageOfReferenced__Group_5__1__Impl"


    // $ANTLR start "rule__CoverageByContent__Group__0"
    // InternalCOV.g:2333:1: rule__CoverageByContent__Group__0 : rule__CoverageByContent__Group__0__Impl rule__CoverageByContent__Group__1 ;
    public final void rule__CoverageByContent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2337:1: ( rule__CoverageByContent__Group__0__Impl rule__CoverageByContent__Group__1 )
            // InternalCOV.g:2338:2: rule__CoverageByContent__Group__0__Impl rule__CoverageByContent__Group__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalCOV.g:2345:1: rule__CoverageByContent__Group__0__Impl : ( () ) ;
    public final void rule__CoverageByContent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2349:1: ( ( () ) )
            // InternalCOV.g:2350:1: ( () )
            {
            // InternalCOV.g:2350:1: ( () )
            // InternalCOV.g:2351:2: ()
            {
             before(grammarAccess.getCoverageByContentAccess().getCoverageByContentAction_0()); 
            // InternalCOV.g:2352:2: ()
            // InternalCOV.g:2352:3: 
            {
            }

             after(grammarAccess.getCoverageByContentAccess().getCoverageByContentAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoverageByContent__Group__0__Impl"


    // $ANTLR start "rule__CoverageByContent__Group__1"
    // InternalCOV.g:2360:1: rule__CoverageByContent__Group__1 : rule__CoverageByContent__Group__1__Impl rule__CoverageByContent__Group__2 ;
    public final void rule__CoverageByContent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2364:1: ( rule__CoverageByContent__Group__1__Impl rule__CoverageByContent__Group__2 )
            // InternalCOV.g:2365:2: rule__CoverageByContent__Group__1__Impl rule__CoverageByContent__Group__2
            {
            pushFollow(FOLLOW_23);
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
    // InternalCOV.g:2372:1: rule__CoverageByContent__Group__1__Impl : ( ( rule__CoverageByContent__Group_1__0 )? ) ;
    public final void rule__CoverageByContent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2376:1: ( ( ( rule__CoverageByContent__Group_1__0 )? ) )
            // InternalCOV.g:2377:1: ( ( rule__CoverageByContent__Group_1__0 )? )
            {
            // InternalCOV.g:2377:1: ( ( rule__CoverageByContent__Group_1__0 )? )
            // InternalCOV.g:2378:2: ( rule__CoverageByContent__Group_1__0 )?
            {
             before(grammarAccess.getCoverageByContentAccess().getGroup_1()); 
            // InternalCOV.g:2379:2: ( rule__CoverageByContent__Group_1__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==27) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalCOV.g:2379:3: rule__CoverageByContent__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CoverageByContent__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCoverageByContentAccess().getGroup_1()); 

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
    // InternalCOV.g:2387:1: rule__CoverageByContent__Group__2 : rule__CoverageByContent__Group__2__Impl rule__CoverageByContent__Group__3 ;
    public final void rule__CoverageByContent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2391:1: ( rule__CoverageByContent__Group__2__Impl rule__CoverageByContent__Group__3 )
            // InternalCOV.g:2392:2: rule__CoverageByContent__Group__2__Impl rule__CoverageByContent__Group__3
            {
            pushFollow(FOLLOW_24);
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
    // InternalCOV.g:2399:1: rule__CoverageByContent__Group__2__Impl : ( 'covered' ) ;
    public final void rule__CoverageByContent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2403:1: ( ( 'covered' ) )
            // InternalCOV.g:2404:1: ( 'covered' )
            {
            // InternalCOV.g:2404:1: ( 'covered' )
            // InternalCOV.g:2405:2: 'covered'
            {
             before(grammarAccess.getCoverageByContentAccess().getCoveredKeyword_2()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getCoverageByContentAccess().getCoveredKeyword_2()); 

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
    // InternalCOV.g:2414:1: rule__CoverageByContent__Group__3 : rule__CoverageByContent__Group__3__Impl rule__CoverageByContent__Group__4 ;
    public final void rule__CoverageByContent__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2418:1: ( rule__CoverageByContent__Group__3__Impl rule__CoverageByContent__Group__4 )
            // InternalCOV.g:2419:2: rule__CoverageByContent__Group__3__Impl rule__CoverageByContent__Group__4
            {
            pushFollow(FOLLOW_25);
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
    // InternalCOV.g:2426:1: rule__CoverageByContent__Group__3__Impl : ( 'when' ) ;
    public final void rule__CoverageByContent__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2430:1: ( ( 'when' ) )
            // InternalCOV.g:2431:1: ( 'when' )
            {
            // InternalCOV.g:2431:1: ( 'when' )
            // InternalCOV.g:2432:2: 'when'
            {
             before(grammarAccess.getCoverageByContentAccess().getWhenKeyword_3()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getCoverageByContentAccess().getWhenKeyword_3()); 

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
    // InternalCOV.g:2441:1: rule__CoverageByContent__Group__4 : rule__CoverageByContent__Group__4__Impl rule__CoverageByContent__Group__5 ;
    public final void rule__CoverageByContent__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2445:1: ( rule__CoverageByContent__Group__4__Impl rule__CoverageByContent__Group__5 )
            // InternalCOV.g:2446:2: rule__CoverageByContent__Group__4__Impl rule__CoverageByContent__Group__5
            {
            pushFollow(FOLLOW_3);
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
    // InternalCOV.g:2453:1: rule__CoverageByContent__Group__4__Impl : ( ( rule__CoverageByContent__MultiplicityAssignment_4 ) ) ;
    public final void rule__CoverageByContent__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2457:1: ( ( ( rule__CoverageByContent__MultiplicityAssignment_4 ) ) )
            // InternalCOV.g:2458:1: ( ( rule__CoverageByContent__MultiplicityAssignment_4 ) )
            {
            // InternalCOV.g:2458:1: ( ( rule__CoverageByContent__MultiplicityAssignment_4 ) )
            // InternalCOV.g:2459:2: ( rule__CoverageByContent__MultiplicityAssignment_4 )
            {
             before(grammarAccess.getCoverageByContentAccess().getMultiplicityAssignment_4()); 
            // InternalCOV.g:2460:2: ( rule__CoverageByContent__MultiplicityAssignment_4 )
            // InternalCOV.g:2460:3: rule__CoverageByContent__MultiplicityAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__CoverageByContent__MultiplicityAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getCoverageByContentAccess().getMultiplicityAssignment_4()); 

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
    // InternalCOV.g:2468:1: rule__CoverageByContent__Group__5 : rule__CoverageByContent__Group__5__Impl rule__CoverageByContent__Group__6 ;
    public final void rule__CoverageByContent__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2472:1: ( rule__CoverageByContent__Group__5__Impl rule__CoverageByContent__Group__6 )
            // InternalCOV.g:2473:2: rule__CoverageByContent__Group__5__Impl rule__CoverageByContent__Group__6
            {
            pushFollow(FOLLOW_26);
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
    // InternalCOV.g:2480:1: rule__CoverageByContent__Group__5__Impl : ( ( rule__CoverageByContent__ContainmentReferenceAssignment_5 ) ) ;
    public final void rule__CoverageByContent__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2484:1: ( ( ( rule__CoverageByContent__ContainmentReferenceAssignment_5 ) ) )
            // InternalCOV.g:2485:1: ( ( rule__CoverageByContent__ContainmentReferenceAssignment_5 ) )
            {
            // InternalCOV.g:2485:1: ( ( rule__CoverageByContent__ContainmentReferenceAssignment_5 ) )
            // InternalCOV.g:2486:2: ( rule__CoverageByContent__ContainmentReferenceAssignment_5 )
            {
             before(grammarAccess.getCoverageByContentAccess().getContainmentReferenceAssignment_5()); 
            // InternalCOV.g:2487:2: ( rule__CoverageByContent__ContainmentReferenceAssignment_5 )
            // InternalCOV.g:2487:3: rule__CoverageByContent__ContainmentReferenceAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__CoverageByContent__ContainmentReferenceAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getCoverageByContentAccess().getContainmentReferenceAssignment_5()); 

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
    // InternalCOV.g:2495:1: rule__CoverageByContent__Group__6 : rule__CoverageByContent__Group__6__Impl rule__CoverageByContent__Group__7 ;
    public final void rule__CoverageByContent__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2499:1: ( rule__CoverageByContent__Group__6__Impl rule__CoverageByContent__Group__7 )
            // InternalCOV.g:2500:2: rule__CoverageByContent__Group__6__Impl rule__CoverageByContent__Group__7
            {
            pushFollow(FOLLOW_17);
            rule__CoverageByContent__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CoverageByContent__Group__7();

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
    // InternalCOV.g:2507:1: rule__CoverageByContent__Group__6__Impl : ( 'iscovered' ) ;
    public final void rule__CoverageByContent__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2511:1: ( ( 'iscovered' ) )
            // InternalCOV.g:2512:1: ( 'iscovered' )
            {
            // InternalCOV.g:2512:1: ( 'iscovered' )
            // InternalCOV.g:2513:2: 'iscovered'
            {
             before(grammarAccess.getCoverageByContentAccess().getIscoveredKeyword_6()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getCoverageByContentAccess().getIscoveredKeyword_6()); 

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


    // $ANTLR start "rule__CoverageByContent__Group__7"
    // InternalCOV.g:2522:1: rule__CoverageByContent__Group__7 : rule__CoverageByContent__Group__7__Impl ;
    public final void rule__CoverageByContent__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2526:1: ( rule__CoverageByContent__Group__7__Impl )
            // InternalCOV.g:2527:2: rule__CoverageByContent__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CoverageByContent__Group__7__Impl();

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
    // $ANTLR end "rule__CoverageByContent__Group__7"


    // $ANTLR start "rule__CoverageByContent__Group__7__Impl"
    // InternalCOV.g:2533:1: rule__CoverageByContent__Group__7__Impl : ( ( rule__CoverageByContent__Group_7__0 )? ) ;
    public final void rule__CoverageByContent__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2537:1: ( ( ( rule__CoverageByContent__Group_7__0 )? ) )
            // InternalCOV.g:2538:1: ( ( rule__CoverageByContent__Group_7__0 )? )
            {
            // InternalCOV.g:2538:1: ( ( rule__CoverageByContent__Group_7__0 )? )
            // InternalCOV.g:2539:2: ( rule__CoverageByContent__Group_7__0 )?
            {
             before(grammarAccess.getCoverageByContentAccess().getGroup_7()); 
            // InternalCOV.g:2540:2: ( rule__CoverageByContent__Group_7__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==29) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalCOV.g:2540:3: rule__CoverageByContent__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CoverageByContent__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCoverageByContentAccess().getGroup_7()); 

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
    // $ANTLR end "rule__CoverageByContent__Group__7__Impl"


    // $ANTLR start "rule__CoverageByContent__Group_1__0"
    // InternalCOV.g:2549:1: rule__CoverageByContent__Group_1__0 : rule__CoverageByContent__Group_1__0__Impl rule__CoverageByContent__Group_1__1 ;
    public final void rule__CoverageByContent__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2553:1: ( rule__CoverageByContent__Group_1__0__Impl rule__CoverageByContent__Group_1__1 )
            // InternalCOV.g:2554:2: rule__CoverageByContent__Group_1__0__Impl rule__CoverageByContent__Group_1__1
            {
            pushFollow(FOLLOW_3);
            rule__CoverageByContent__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CoverageByContent__Group_1__1();

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
    // $ANTLR end "rule__CoverageByContent__Group_1__0"


    // $ANTLR start "rule__CoverageByContent__Group_1__0__Impl"
    // InternalCOV.g:2561:1: rule__CoverageByContent__Group_1__0__Impl : ( 'when' ) ;
    public final void rule__CoverageByContent__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2565:1: ( ( 'when' ) )
            // InternalCOV.g:2566:1: ( 'when' )
            {
            // InternalCOV.g:2566:1: ( 'when' )
            // InternalCOV.g:2567:2: 'when'
            {
             before(grammarAccess.getCoverageByContentAccess().getWhenKeyword_1_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getCoverageByContentAccess().getWhenKeyword_1_0()); 

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
    // $ANTLR end "rule__CoverageByContent__Group_1__0__Impl"


    // $ANTLR start "rule__CoverageByContent__Group_1__1"
    // InternalCOV.g:2576:1: rule__CoverageByContent__Group_1__1 : rule__CoverageByContent__Group_1__1__Impl ;
    public final void rule__CoverageByContent__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2580:1: ( rule__CoverageByContent__Group_1__1__Impl )
            // InternalCOV.g:2581:2: rule__CoverageByContent__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CoverageByContent__Group_1__1__Impl();

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
    // $ANTLR end "rule__CoverageByContent__Group_1__1"


    // $ANTLR start "rule__CoverageByContent__Group_1__1__Impl"
    // InternalCOV.g:2587:1: rule__CoverageByContent__Group_1__1__Impl : ( ( rule__CoverageByContent__ConditionAssignment_1_1 ) ) ;
    public final void rule__CoverageByContent__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2591:1: ( ( ( rule__CoverageByContent__ConditionAssignment_1_1 ) ) )
            // InternalCOV.g:2592:1: ( ( rule__CoverageByContent__ConditionAssignment_1_1 ) )
            {
            // InternalCOV.g:2592:1: ( ( rule__CoverageByContent__ConditionAssignment_1_1 ) )
            // InternalCOV.g:2593:2: ( rule__CoverageByContent__ConditionAssignment_1_1 )
            {
             before(grammarAccess.getCoverageByContentAccess().getConditionAssignment_1_1()); 
            // InternalCOV.g:2594:2: ( rule__CoverageByContent__ConditionAssignment_1_1 )
            // InternalCOV.g:2594:3: rule__CoverageByContent__ConditionAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__CoverageByContent__ConditionAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getCoverageByContentAccess().getConditionAssignment_1_1()); 

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
    // $ANTLR end "rule__CoverageByContent__Group_1__1__Impl"


    // $ANTLR start "rule__CoverageByContent__Group_7__0"
    // InternalCOV.g:2603:1: rule__CoverageByContent__Group_7__0 : rule__CoverageByContent__Group_7__0__Impl rule__CoverageByContent__Group_7__1 ;
    public final void rule__CoverageByContent__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2607:1: ( rule__CoverageByContent__Group_7__0__Impl rule__CoverageByContent__Group_7__1 )
            // InternalCOV.g:2608:2: rule__CoverageByContent__Group_7__0__Impl rule__CoverageByContent__Group_7__1
            {
            pushFollow(FOLLOW_3);
            rule__CoverageByContent__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CoverageByContent__Group_7__1();

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
    // $ANTLR end "rule__CoverageByContent__Group_7__0"


    // $ANTLR start "rule__CoverageByContent__Group_7__0__Impl"
    // InternalCOV.g:2615:1: rule__CoverageByContent__Group_7__0__Impl : ( 'description' ) ;
    public final void rule__CoverageByContent__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2619:1: ( ( 'description' ) )
            // InternalCOV.g:2620:1: ( 'description' )
            {
            // InternalCOV.g:2620:1: ( 'description' )
            // InternalCOV.g:2621:2: 'description'
            {
             before(grammarAccess.getCoverageByContentAccess().getDescriptionKeyword_7_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getCoverageByContentAccess().getDescriptionKeyword_7_0()); 

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
    // $ANTLR end "rule__CoverageByContent__Group_7__0__Impl"


    // $ANTLR start "rule__CoverageByContent__Group_7__1"
    // InternalCOV.g:2630:1: rule__CoverageByContent__Group_7__1 : rule__CoverageByContent__Group_7__1__Impl ;
    public final void rule__CoverageByContent__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2634:1: ( rule__CoverageByContent__Group_7__1__Impl )
            // InternalCOV.g:2635:2: rule__CoverageByContent__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CoverageByContent__Group_7__1__Impl();

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
    // $ANTLR end "rule__CoverageByContent__Group_7__1"


    // $ANTLR start "rule__CoverageByContent__Group_7__1__Impl"
    // InternalCOV.g:2641:1: rule__CoverageByContent__Group_7__1__Impl : ( ( rule__CoverageByContent__DescriptionAssignment_7_1 ) ) ;
    public final void rule__CoverageByContent__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2645:1: ( ( ( rule__CoverageByContent__DescriptionAssignment_7_1 ) ) )
            // InternalCOV.g:2646:1: ( ( rule__CoverageByContent__DescriptionAssignment_7_1 ) )
            {
            // InternalCOV.g:2646:1: ( ( rule__CoverageByContent__DescriptionAssignment_7_1 ) )
            // InternalCOV.g:2647:2: ( rule__CoverageByContent__DescriptionAssignment_7_1 )
            {
             before(grammarAccess.getCoverageByContentAccess().getDescriptionAssignment_7_1()); 
            // InternalCOV.g:2648:2: ( rule__CoverageByContent__DescriptionAssignment_7_1 )
            // InternalCOV.g:2648:3: rule__CoverageByContent__DescriptionAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__CoverageByContent__DescriptionAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getCoverageByContentAccess().getDescriptionAssignment_7_1()); 

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
    // $ANTLR end "rule__CoverageByContent__Group_7__1__Impl"


    // $ANTLR start "rule__BranchSpecification__Group__0"
    // InternalCOV.g:2657:1: rule__BranchSpecification__Group__0 : rule__BranchSpecification__Group__0__Impl rule__BranchSpecification__Group__1 ;
    public final void rule__BranchSpecification__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2661:1: ( rule__BranchSpecification__Group__0__Impl rule__BranchSpecification__Group__1 )
            // InternalCOV.g:2662:2: rule__BranchSpecification__Group__0__Impl rule__BranchSpecification__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__BranchSpecification__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BranchSpecification__Group__1();

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
    // $ANTLR end "rule__BranchSpecification__Group__0"


    // $ANTLR start "rule__BranchSpecification__Group__0__Impl"
    // InternalCOV.g:2669:1: rule__BranchSpecification__Group__0__Impl : ( () ) ;
    public final void rule__BranchSpecification__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2673:1: ( ( () ) )
            // InternalCOV.g:2674:1: ( () )
            {
            // InternalCOV.g:2674:1: ( () )
            // InternalCOV.g:2675:2: ()
            {
             before(grammarAccess.getBranchSpecificationAccess().getBranchSpecificationAction_0()); 
            // InternalCOV.g:2676:2: ()
            // InternalCOV.g:2676:3: 
            {
            }

             after(grammarAccess.getBranchSpecificationAccess().getBranchSpecificationAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BranchSpecification__Group__0__Impl"


    // $ANTLR start "rule__BranchSpecification__Group__1"
    // InternalCOV.g:2684:1: rule__BranchSpecification__Group__1 : rule__BranchSpecification__Group__1__Impl rule__BranchSpecification__Group__2 ;
    public final void rule__BranchSpecification__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2688:1: ( rule__BranchSpecification__Group__1__Impl rule__BranchSpecification__Group__2 )
            // InternalCOV.g:2689:2: rule__BranchSpecification__Group__1__Impl rule__BranchSpecification__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__BranchSpecification__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BranchSpecification__Group__2();

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
    // $ANTLR end "rule__BranchSpecification__Group__1"


    // $ANTLR start "rule__BranchSpecification__Group__1__Impl"
    // InternalCOV.g:2696:1: rule__BranchSpecification__Group__1__Impl : ( ( rule__BranchSpecification__Group_1__0 )? ) ;
    public final void rule__BranchSpecification__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2700:1: ( ( ( rule__BranchSpecification__Group_1__0 )? ) )
            // InternalCOV.g:2701:1: ( ( rule__BranchSpecification__Group_1__0 )? )
            {
            // InternalCOV.g:2701:1: ( ( rule__BranchSpecification__Group_1__0 )? )
            // InternalCOV.g:2702:2: ( rule__BranchSpecification__Group_1__0 )?
            {
             before(grammarAccess.getBranchSpecificationAccess().getGroup_1()); 
            // InternalCOV.g:2703:2: ( rule__BranchSpecification__Group_1__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==27) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalCOV.g:2703:3: rule__BranchSpecification__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BranchSpecification__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBranchSpecificationAccess().getGroup_1()); 

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
    // $ANTLR end "rule__BranchSpecification__Group__1__Impl"


    // $ANTLR start "rule__BranchSpecification__Group__2"
    // InternalCOV.g:2711:1: rule__BranchSpecification__Group__2 : rule__BranchSpecification__Group__2__Impl rule__BranchSpecification__Group__3 ;
    public final void rule__BranchSpecification__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2715:1: ( rule__BranchSpecification__Group__2__Impl rule__BranchSpecification__Group__3 )
            // InternalCOV.g:2716:2: rule__BranchSpecification__Group__2__Impl rule__BranchSpecification__Group__3
            {
            pushFollow(FOLLOW_27);
            rule__BranchSpecification__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BranchSpecification__Group__3();

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
    // $ANTLR end "rule__BranchSpecification__Group__2"


    // $ANTLR start "rule__BranchSpecification__Group__2__Impl"
    // InternalCOV.g:2723:1: rule__BranchSpecification__Group__2__Impl : ( '{' ) ;
    public final void rule__BranchSpecification__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2727:1: ( ( '{' ) )
            // InternalCOV.g:2728:1: ( '{' )
            {
            // InternalCOV.g:2728:1: ( '{' )
            // InternalCOV.g:2729:2: '{'
            {
             before(grammarAccess.getBranchSpecificationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getBranchSpecificationAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__BranchSpecification__Group__2__Impl"


    // $ANTLR start "rule__BranchSpecification__Group__3"
    // InternalCOV.g:2738:1: rule__BranchSpecification__Group__3 : rule__BranchSpecification__Group__3__Impl rule__BranchSpecification__Group__4 ;
    public final void rule__BranchSpecification__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2742:1: ( rule__BranchSpecification__Group__3__Impl rule__BranchSpecification__Group__4 )
            // InternalCOV.g:2743:2: rule__BranchSpecification__Group__3__Impl rule__BranchSpecification__Group__4
            {
            pushFollow(FOLLOW_28);
            rule__BranchSpecification__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BranchSpecification__Group__4();

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
    // $ANTLR end "rule__BranchSpecification__Group__3"


    // $ANTLR start "rule__BranchSpecification__Group__3__Impl"
    // InternalCOV.g:2750:1: rule__BranchSpecification__Group__3__Impl : ( ( rule__BranchSpecification__BranchesAssignment_3 ) ) ;
    public final void rule__BranchSpecification__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2754:1: ( ( ( rule__BranchSpecification__BranchesAssignment_3 ) ) )
            // InternalCOV.g:2755:1: ( ( rule__BranchSpecification__BranchesAssignment_3 ) )
            {
            // InternalCOV.g:2755:1: ( ( rule__BranchSpecification__BranchesAssignment_3 ) )
            // InternalCOV.g:2756:2: ( rule__BranchSpecification__BranchesAssignment_3 )
            {
             before(grammarAccess.getBranchSpecificationAccess().getBranchesAssignment_3()); 
            // InternalCOV.g:2757:2: ( rule__BranchSpecification__BranchesAssignment_3 )
            // InternalCOV.g:2757:3: rule__BranchSpecification__BranchesAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__BranchSpecification__BranchesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getBranchSpecificationAccess().getBranchesAssignment_3()); 

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
    // $ANTLR end "rule__BranchSpecification__Group__3__Impl"


    // $ANTLR start "rule__BranchSpecification__Group__4"
    // InternalCOV.g:2765:1: rule__BranchSpecification__Group__4 : rule__BranchSpecification__Group__4__Impl rule__BranchSpecification__Group__5 ;
    public final void rule__BranchSpecification__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2769:1: ( rule__BranchSpecification__Group__4__Impl rule__BranchSpecification__Group__5 )
            // InternalCOV.g:2770:2: rule__BranchSpecification__Group__4__Impl rule__BranchSpecification__Group__5
            {
            pushFollow(FOLLOW_28);
            rule__BranchSpecification__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BranchSpecification__Group__5();

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
    // $ANTLR end "rule__BranchSpecification__Group__4"


    // $ANTLR start "rule__BranchSpecification__Group__4__Impl"
    // InternalCOV.g:2777:1: rule__BranchSpecification__Group__4__Impl : ( ( rule__BranchSpecification__Group_4__0 )* ) ;
    public final void rule__BranchSpecification__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2781:1: ( ( ( rule__BranchSpecification__Group_4__0 )* ) )
            // InternalCOV.g:2782:1: ( ( rule__BranchSpecification__Group_4__0 )* )
            {
            // InternalCOV.g:2782:1: ( ( rule__BranchSpecification__Group_4__0 )* )
            // InternalCOV.g:2783:2: ( rule__BranchSpecification__Group_4__0 )*
            {
             before(grammarAccess.getBranchSpecificationAccess().getGroup_4()); 
            // InternalCOV.g:2784:2: ( rule__BranchSpecification__Group_4__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==22) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalCOV.g:2784:3: rule__BranchSpecification__Group_4__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__BranchSpecification__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getBranchSpecificationAccess().getGroup_4()); 

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
    // $ANTLR end "rule__BranchSpecification__Group__4__Impl"


    // $ANTLR start "rule__BranchSpecification__Group__5"
    // InternalCOV.g:2792:1: rule__BranchSpecification__Group__5 : rule__BranchSpecification__Group__5__Impl rule__BranchSpecification__Group__6 ;
    public final void rule__BranchSpecification__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2796:1: ( rule__BranchSpecification__Group__5__Impl rule__BranchSpecification__Group__6 )
            // InternalCOV.g:2797:2: rule__BranchSpecification__Group__5__Impl rule__BranchSpecification__Group__6
            {
            pushFollow(FOLLOW_28);
            rule__BranchSpecification__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BranchSpecification__Group__6();

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
    // $ANTLR end "rule__BranchSpecification__Group__5"


    // $ANTLR start "rule__BranchSpecification__Group__5__Impl"
    // InternalCOV.g:2804:1: rule__BranchSpecification__Group__5__Impl : ( ( rule__BranchSpecification__Group_5__0 )? ) ;
    public final void rule__BranchSpecification__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2808:1: ( ( ( rule__BranchSpecification__Group_5__0 )? ) )
            // InternalCOV.g:2809:1: ( ( rule__BranchSpecification__Group_5__0 )? )
            {
            // InternalCOV.g:2809:1: ( ( rule__BranchSpecification__Group_5__0 )? )
            // InternalCOV.g:2810:2: ( rule__BranchSpecification__Group_5__0 )?
            {
             before(grammarAccess.getBranchSpecificationAccess().getGroup_5()); 
            // InternalCOV.g:2811:2: ( rule__BranchSpecification__Group_5__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==29) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalCOV.g:2811:3: rule__BranchSpecification__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BranchSpecification__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBranchSpecificationAccess().getGroup_5()); 

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
    // $ANTLR end "rule__BranchSpecification__Group__5__Impl"


    // $ANTLR start "rule__BranchSpecification__Group__6"
    // InternalCOV.g:2819:1: rule__BranchSpecification__Group__6 : rule__BranchSpecification__Group__6__Impl ;
    public final void rule__BranchSpecification__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2823:1: ( rule__BranchSpecification__Group__6__Impl )
            // InternalCOV.g:2824:2: rule__BranchSpecification__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BranchSpecification__Group__6__Impl();

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
    // $ANTLR end "rule__BranchSpecification__Group__6"


    // $ANTLR start "rule__BranchSpecification__Group__6__Impl"
    // InternalCOV.g:2830:1: rule__BranchSpecification__Group__6__Impl : ( '}' ) ;
    public final void rule__BranchSpecification__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2834:1: ( ( '}' ) )
            // InternalCOV.g:2835:1: ( '}' )
            {
            // InternalCOV.g:2835:1: ( '}' )
            // InternalCOV.g:2836:2: '}'
            {
             before(grammarAccess.getBranchSpecificationAccess().getRightCurlyBracketKeyword_6()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getBranchSpecificationAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__BranchSpecification__Group__6__Impl"


    // $ANTLR start "rule__BranchSpecification__Group_1__0"
    // InternalCOV.g:2846:1: rule__BranchSpecification__Group_1__0 : rule__BranchSpecification__Group_1__0__Impl rule__BranchSpecification__Group_1__1 ;
    public final void rule__BranchSpecification__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2850:1: ( rule__BranchSpecification__Group_1__0__Impl rule__BranchSpecification__Group_1__1 )
            // InternalCOV.g:2851:2: rule__BranchSpecification__Group_1__0__Impl rule__BranchSpecification__Group_1__1
            {
            pushFollow(FOLLOW_3);
            rule__BranchSpecification__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BranchSpecification__Group_1__1();

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
    // $ANTLR end "rule__BranchSpecification__Group_1__0"


    // $ANTLR start "rule__BranchSpecification__Group_1__0__Impl"
    // InternalCOV.g:2858:1: rule__BranchSpecification__Group_1__0__Impl : ( 'when' ) ;
    public final void rule__BranchSpecification__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2862:1: ( ( 'when' ) )
            // InternalCOV.g:2863:1: ( 'when' )
            {
            // InternalCOV.g:2863:1: ( 'when' )
            // InternalCOV.g:2864:2: 'when'
            {
             before(grammarAccess.getBranchSpecificationAccess().getWhenKeyword_1_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getBranchSpecificationAccess().getWhenKeyword_1_0()); 

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
    // $ANTLR end "rule__BranchSpecification__Group_1__0__Impl"


    // $ANTLR start "rule__BranchSpecification__Group_1__1"
    // InternalCOV.g:2873:1: rule__BranchSpecification__Group_1__1 : rule__BranchSpecification__Group_1__1__Impl ;
    public final void rule__BranchSpecification__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2877:1: ( rule__BranchSpecification__Group_1__1__Impl )
            // InternalCOV.g:2878:2: rule__BranchSpecification__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BranchSpecification__Group_1__1__Impl();

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
    // $ANTLR end "rule__BranchSpecification__Group_1__1"


    // $ANTLR start "rule__BranchSpecification__Group_1__1__Impl"
    // InternalCOV.g:2884:1: rule__BranchSpecification__Group_1__1__Impl : ( ( rule__BranchSpecification__ConditionAssignment_1_1 ) ) ;
    public final void rule__BranchSpecification__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2888:1: ( ( ( rule__BranchSpecification__ConditionAssignment_1_1 ) ) )
            // InternalCOV.g:2889:1: ( ( rule__BranchSpecification__ConditionAssignment_1_1 ) )
            {
            // InternalCOV.g:2889:1: ( ( rule__BranchSpecification__ConditionAssignment_1_1 ) )
            // InternalCOV.g:2890:2: ( rule__BranchSpecification__ConditionAssignment_1_1 )
            {
             before(grammarAccess.getBranchSpecificationAccess().getConditionAssignment_1_1()); 
            // InternalCOV.g:2891:2: ( rule__BranchSpecification__ConditionAssignment_1_1 )
            // InternalCOV.g:2891:3: rule__BranchSpecification__ConditionAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__BranchSpecification__ConditionAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getBranchSpecificationAccess().getConditionAssignment_1_1()); 

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
    // $ANTLR end "rule__BranchSpecification__Group_1__1__Impl"


    // $ANTLR start "rule__BranchSpecification__Group_4__0"
    // InternalCOV.g:2900:1: rule__BranchSpecification__Group_4__0 : rule__BranchSpecification__Group_4__0__Impl rule__BranchSpecification__Group_4__1 ;
    public final void rule__BranchSpecification__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2904:1: ( rule__BranchSpecification__Group_4__0__Impl rule__BranchSpecification__Group_4__1 )
            // InternalCOV.g:2905:2: rule__BranchSpecification__Group_4__0__Impl rule__BranchSpecification__Group_4__1
            {
            pushFollow(FOLLOW_27);
            rule__BranchSpecification__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BranchSpecification__Group_4__1();

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
    // $ANTLR end "rule__BranchSpecification__Group_4__0"


    // $ANTLR start "rule__BranchSpecification__Group_4__0__Impl"
    // InternalCOV.g:2912:1: rule__BranchSpecification__Group_4__0__Impl : ( ',' ) ;
    public final void rule__BranchSpecification__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2916:1: ( ( ',' ) )
            // InternalCOV.g:2917:1: ( ',' )
            {
            // InternalCOV.g:2917:1: ( ',' )
            // InternalCOV.g:2918:2: ','
            {
             before(grammarAccess.getBranchSpecificationAccess().getCommaKeyword_4_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getBranchSpecificationAccess().getCommaKeyword_4_0()); 

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
    // $ANTLR end "rule__BranchSpecification__Group_4__0__Impl"


    // $ANTLR start "rule__BranchSpecification__Group_4__1"
    // InternalCOV.g:2927:1: rule__BranchSpecification__Group_4__1 : rule__BranchSpecification__Group_4__1__Impl ;
    public final void rule__BranchSpecification__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2931:1: ( rule__BranchSpecification__Group_4__1__Impl )
            // InternalCOV.g:2932:2: rule__BranchSpecification__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BranchSpecification__Group_4__1__Impl();

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
    // $ANTLR end "rule__BranchSpecification__Group_4__1"


    // $ANTLR start "rule__BranchSpecification__Group_4__1__Impl"
    // InternalCOV.g:2938:1: rule__BranchSpecification__Group_4__1__Impl : ( ( rule__BranchSpecification__BranchesAssignment_4_1 ) ) ;
    public final void rule__BranchSpecification__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2942:1: ( ( ( rule__BranchSpecification__BranchesAssignment_4_1 ) ) )
            // InternalCOV.g:2943:1: ( ( rule__BranchSpecification__BranchesAssignment_4_1 ) )
            {
            // InternalCOV.g:2943:1: ( ( rule__BranchSpecification__BranchesAssignment_4_1 ) )
            // InternalCOV.g:2944:2: ( rule__BranchSpecification__BranchesAssignment_4_1 )
            {
             before(grammarAccess.getBranchSpecificationAccess().getBranchesAssignment_4_1()); 
            // InternalCOV.g:2945:2: ( rule__BranchSpecification__BranchesAssignment_4_1 )
            // InternalCOV.g:2945:3: rule__BranchSpecification__BranchesAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__BranchSpecification__BranchesAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getBranchSpecificationAccess().getBranchesAssignment_4_1()); 

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
    // $ANTLR end "rule__BranchSpecification__Group_4__1__Impl"


    // $ANTLR start "rule__BranchSpecification__Group_5__0"
    // InternalCOV.g:2954:1: rule__BranchSpecification__Group_5__0 : rule__BranchSpecification__Group_5__0__Impl rule__BranchSpecification__Group_5__1 ;
    public final void rule__BranchSpecification__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2958:1: ( rule__BranchSpecification__Group_5__0__Impl rule__BranchSpecification__Group_5__1 )
            // InternalCOV.g:2959:2: rule__BranchSpecification__Group_5__0__Impl rule__BranchSpecification__Group_5__1
            {
            pushFollow(FOLLOW_3);
            rule__BranchSpecification__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BranchSpecification__Group_5__1();

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
    // $ANTLR end "rule__BranchSpecification__Group_5__0"


    // $ANTLR start "rule__BranchSpecification__Group_5__0__Impl"
    // InternalCOV.g:2966:1: rule__BranchSpecification__Group_5__0__Impl : ( 'description' ) ;
    public final void rule__BranchSpecification__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2970:1: ( ( 'description' ) )
            // InternalCOV.g:2971:1: ( 'description' )
            {
            // InternalCOV.g:2971:1: ( 'description' )
            // InternalCOV.g:2972:2: 'description'
            {
             before(grammarAccess.getBranchSpecificationAccess().getDescriptionKeyword_5_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getBranchSpecificationAccess().getDescriptionKeyword_5_0()); 

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
    // $ANTLR end "rule__BranchSpecification__Group_5__0__Impl"


    // $ANTLR start "rule__BranchSpecification__Group_5__1"
    // InternalCOV.g:2981:1: rule__BranchSpecification__Group_5__1 : rule__BranchSpecification__Group_5__1__Impl ;
    public final void rule__BranchSpecification__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2985:1: ( rule__BranchSpecification__Group_5__1__Impl )
            // InternalCOV.g:2986:2: rule__BranchSpecification__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BranchSpecification__Group_5__1__Impl();

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
    // $ANTLR end "rule__BranchSpecification__Group_5__1"


    // $ANTLR start "rule__BranchSpecification__Group_5__1__Impl"
    // InternalCOV.g:2992:1: rule__BranchSpecification__Group_5__1__Impl : ( ( rule__BranchSpecification__DescriptionAssignment_5_1 ) ) ;
    public final void rule__BranchSpecification__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2996:1: ( ( ( rule__BranchSpecification__DescriptionAssignment_5_1 ) ) )
            // InternalCOV.g:2997:1: ( ( rule__BranchSpecification__DescriptionAssignment_5_1 ) )
            {
            // InternalCOV.g:2997:1: ( ( rule__BranchSpecification__DescriptionAssignment_5_1 ) )
            // InternalCOV.g:2998:2: ( rule__BranchSpecification__DescriptionAssignment_5_1 )
            {
             before(grammarAccess.getBranchSpecificationAccess().getDescriptionAssignment_5_1()); 
            // InternalCOV.g:2999:2: ( rule__BranchSpecification__DescriptionAssignment_5_1 )
            // InternalCOV.g:2999:3: rule__BranchSpecification__DescriptionAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__BranchSpecification__DescriptionAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getBranchSpecificationAccess().getDescriptionAssignment_5_1()); 

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
    // $ANTLR end "rule__BranchSpecification__Group_5__1__Impl"


    // $ANTLR start "rule__ExplicitBranch__Group__0"
    // InternalCOV.g:3008:1: rule__ExplicitBranch__Group__0 : rule__ExplicitBranch__Group__0__Impl rule__ExplicitBranch__Group__1 ;
    public final void rule__ExplicitBranch__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3012:1: ( rule__ExplicitBranch__Group__0__Impl rule__ExplicitBranch__Group__1 )
            // InternalCOV.g:3013:2: rule__ExplicitBranch__Group__0__Impl rule__ExplicitBranch__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ExplicitBranch__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExplicitBranch__Group__1();

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
    // $ANTLR end "rule__ExplicitBranch__Group__0"


    // $ANTLR start "rule__ExplicitBranch__Group__0__Impl"
    // InternalCOV.g:3020:1: rule__ExplicitBranch__Group__0__Impl : ( 'branch' ) ;
    public final void rule__ExplicitBranch__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3024:1: ( ( 'branch' ) )
            // InternalCOV.g:3025:1: ( 'branch' )
            {
            // InternalCOV.g:3025:1: ( 'branch' )
            // InternalCOV.g:3026:2: 'branch'
            {
             before(grammarAccess.getExplicitBranchAccess().getBranchKeyword_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getExplicitBranchAccess().getBranchKeyword_0()); 

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
    // $ANTLR end "rule__ExplicitBranch__Group__0__Impl"


    // $ANTLR start "rule__ExplicitBranch__Group__1"
    // InternalCOV.g:3035:1: rule__ExplicitBranch__Group__1 : rule__ExplicitBranch__Group__1__Impl ;
    public final void rule__ExplicitBranch__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3039:1: ( rule__ExplicitBranch__Group__1__Impl )
            // InternalCOV.g:3040:2: rule__ExplicitBranch__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExplicitBranch__Group__1__Impl();

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
    // $ANTLR end "rule__ExplicitBranch__Group__1"


    // $ANTLR start "rule__ExplicitBranch__Group__1__Impl"
    // InternalCOV.g:3046:1: rule__ExplicitBranch__Group__1__Impl : ( ( rule__ExplicitBranch__OCLQueryAssignment_1 ) ) ;
    public final void rule__ExplicitBranch__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3050:1: ( ( ( rule__ExplicitBranch__OCLQueryAssignment_1 ) ) )
            // InternalCOV.g:3051:1: ( ( rule__ExplicitBranch__OCLQueryAssignment_1 ) )
            {
            // InternalCOV.g:3051:1: ( ( rule__ExplicitBranch__OCLQueryAssignment_1 ) )
            // InternalCOV.g:3052:2: ( rule__ExplicitBranch__OCLQueryAssignment_1 )
            {
             before(grammarAccess.getExplicitBranchAccess().getOCLQueryAssignment_1()); 
            // InternalCOV.g:3053:2: ( rule__ExplicitBranch__OCLQueryAssignment_1 )
            // InternalCOV.g:3053:3: rule__ExplicitBranch__OCLQueryAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ExplicitBranch__OCLQueryAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getExplicitBranchAccess().getOCLQueryAssignment_1()); 

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
    // $ANTLR end "rule__ExplicitBranch__Group__1__Impl"


    // $ANTLR start "rule__ImplicitBranch__Group__0"
    // InternalCOV.g:3062:1: rule__ImplicitBranch__Group__0 : rule__ImplicitBranch__Group__0__Impl rule__ImplicitBranch__Group__1 ;
    public final void rule__ImplicitBranch__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3066:1: ( rule__ImplicitBranch__Group__0__Impl rule__ImplicitBranch__Group__1 )
            // InternalCOV.g:3067:2: rule__ImplicitBranch__Group__0__Impl rule__ImplicitBranch__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__ImplicitBranch__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImplicitBranch__Group__1();

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
    // $ANTLR end "rule__ImplicitBranch__Group__0"


    // $ANTLR start "rule__ImplicitBranch__Group__0__Impl"
    // InternalCOV.g:3074:1: rule__ImplicitBranch__Group__0__Impl : ( () ) ;
    public final void rule__ImplicitBranch__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3078:1: ( ( () ) )
            // InternalCOV.g:3079:1: ( () )
            {
            // InternalCOV.g:3079:1: ( () )
            // InternalCOV.g:3080:2: ()
            {
             before(grammarAccess.getImplicitBranchAccess().getImplicitBranchAction_0()); 
            // InternalCOV.g:3081:2: ()
            // InternalCOV.g:3081:3: 
            {
            }

             after(grammarAccess.getImplicitBranchAccess().getImplicitBranchAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImplicitBranch__Group__0__Impl"


    // $ANTLR start "rule__ImplicitBranch__Group__1"
    // InternalCOV.g:3089:1: rule__ImplicitBranch__Group__1 : rule__ImplicitBranch__Group__1__Impl rule__ImplicitBranch__Group__2 ;
    public final void rule__ImplicitBranch__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3093:1: ( rule__ImplicitBranch__Group__1__Impl rule__ImplicitBranch__Group__2 )
            // InternalCOV.g:3094:2: rule__ImplicitBranch__Group__1__Impl rule__ImplicitBranch__Group__2
            {
            pushFollow(FOLLOW_29);
            rule__ImplicitBranch__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImplicitBranch__Group__2();

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
    // $ANTLR end "rule__ImplicitBranch__Group__1"


    // $ANTLR start "rule__ImplicitBranch__Group__1__Impl"
    // InternalCOV.g:3101:1: rule__ImplicitBranch__Group__1__Impl : ( 'branch' ) ;
    public final void rule__ImplicitBranch__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3105:1: ( ( 'branch' ) )
            // InternalCOV.g:3106:1: ( 'branch' )
            {
            // InternalCOV.g:3106:1: ( 'branch' )
            // InternalCOV.g:3107:2: 'branch'
            {
             before(grammarAccess.getImplicitBranchAccess().getBranchKeyword_1()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getImplicitBranchAccess().getBranchKeyword_1()); 

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
    // $ANTLR end "rule__ImplicitBranch__Group__1__Impl"


    // $ANTLR start "rule__ImplicitBranch__Group__2"
    // InternalCOV.g:3116:1: rule__ImplicitBranch__Group__2 : rule__ImplicitBranch__Group__2__Impl ;
    public final void rule__ImplicitBranch__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3120:1: ( rule__ImplicitBranch__Group__2__Impl )
            // InternalCOV.g:3121:2: rule__ImplicitBranch__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ImplicitBranch__Group__2__Impl();

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
    // $ANTLR end "rule__ImplicitBranch__Group__2"


    // $ANTLR start "rule__ImplicitBranch__Group__2__Impl"
    // InternalCOV.g:3127:1: rule__ImplicitBranch__Group__2__Impl : ( 'else' ) ;
    public final void rule__ImplicitBranch__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3131:1: ( ( 'else' ) )
            // InternalCOV.g:3132:1: ( 'else' )
            {
            // InternalCOV.g:3132:1: ( 'else' )
            // InternalCOV.g:3133:2: 'else'
            {
             before(grammarAccess.getImplicitBranchAccess().getElseKeyword_2()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getImplicitBranchAccess().getElseKeyword_2()); 

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
    // $ANTLR end "rule__ImplicitBranch__Group__2__Impl"


    // $ANTLR start "rule__DomainSpecificCoverage__NameAssignment_1"
    // InternalCOV.g:3143:1: rule__DomainSpecificCoverage__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__DomainSpecificCoverage__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3147:1: ( ( ruleEString ) )
            // InternalCOV.g:3148:2: ( ruleEString )
            {
            // InternalCOV.g:3148:2: ( ruleEString )
            // InternalCOV.g:3149:3: ruleEString
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
    // InternalCOV.g:3158:1: rule__DomainSpecificCoverage__MetamodelAssignment_5 : ( ( ruleEString ) ) ;
    public final void rule__DomainSpecificCoverage__MetamodelAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3162:1: ( ( ( ruleEString ) ) )
            // InternalCOV.g:3163:2: ( ( ruleEString ) )
            {
            // InternalCOV.g:3163:2: ( ( ruleEString ) )
            // InternalCOV.g:3164:3: ( ruleEString )
            {
             before(grammarAccess.getDomainSpecificCoverageAccess().getMetamodelEPackageCrossReference_5_0()); 
            // InternalCOV.g:3165:3: ( ruleEString )
            // InternalCOV.g:3166:4: ruleEString
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


    // $ANTLR start "rule__DomainSpecificCoverage__ImportsAssignment_6_2"
    // InternalCOV.g:3177:1: rule__DomainSpecificCoverage__ImportsAssignment_6_2 : ( ( ruleEString ) ) ;
    public final void rule__DomainSpecificCoverage__ImportsAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3181:1: ( ( ( ruleEString ) ) )
            // InternalCOV.g:3182:2: ( ( ruleEString ) )
            {
            // InternalCOV.g:3182:2: ( ( ruleEString ) )
            // InternalCOV.g:3183:3: ( ruleEString )
            {
             before(grammarAccess.getDomainSpecificCoverageAccess().getImportsDomainSpecificCoverageCrossReference_6_2_0()); 
            // InternalCOV.g:3184:3: ( ruleEString )
            // InternalCOV.g:3185:4: ruleEString
            {
             before(grammarAccess.getDomainSpecificCoverageAccess().getImportsDomainSpecificCoverageEStringParserRuleCall_6_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDomainSpecificCoverageAccess().getImportsDomainSpecificCoverageEStringParserRuleCall_6_2_0_1()); 

            }

             after(grammarAccess.getDomainSpecificCoverageAccess().getImportsDomainSpecificCoverageCrossReference_6_2_0()); 

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
    // $ANTLR end "rule__DomainSpecificCoverage__ImportsAssignment_6_2"


    // $ANTLR start "rule__DomainSpecificCoverage__ImportsAssignment_6_3_1"
    // InternalCOV.g:3196:1: rule__DomainSpecificCoverage__ImportsAssignment_6_3_1 : ( ( ruleEString ) ) ;
    public final void rule__DomainSpecificCoverage__ImportsAssignment_6_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3200:1: ( ( ( ruleEString ) ) )
            // InternalCOV.g:3201:2: ( ( ruleEString ) )
            {
            // InternalCOV.g:3201:2: ( ( ruleEString ) )
            // InternalCOV.g:3202:3: ( ruleEString )
            {
             before(grammarAccess.getDomainSpecificCoverageAccess().getImportsDomainSpecificCoverageCrossReference_6_3_1_0()); 
            // InternalCOV.g:3203:3: ( ruleEString )
            // InternalCOV.g:3204:4: ruleEString
            {
             before(grammarAccess.getDomainSpecificCoverageAccess().getImportsDomainSpecificCoverageEStringParserRuleCall_6_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDomainSpecificCoverageAccess().getImportsDomainSpecificCoverageEStringParserRuleCall_6_3_1_0_1()); 

            }

             after(grammarAccess.getDomainSpecificCoverageAccess().getImportsDomainSpecificCoverageCrossReference_6_3_1_0()); 

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
    // $ANTLR end "rule__DomainSpecificCoverage__ImportsAssignment_6_3_1"


    // $ANTLR start "rule__DomainSpecificCoverage__ContextsAssignment_7"
    // InternalCOV.g:3215:1: rule__DomainSpecificCoverage__ContextsAssignment_7 : ( ruleContext ) ;
    public final void rule__DomainSpecificCoverage__ContextsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3219:1: ( ( ruleContext ) )
            // InternalCOV.g:3220:2: ( ruleContext )
            {
            // InternalCOV.g:3220:2: ( ruleContext )
            // InternalCOV.g:3221:3: ruleContext
            {
             before(grammarAccess.getDomainSpecificCoverageAccess().getContextsContextParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleContext();

            state._fsp--;

             after(grammarAccess.getDomainSpecificCoverageAccess().getContextsContextParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__DomainSpecificCoverage__ContextsAssignment_7"


    // $ANTLR start "rule__DomainSpecificCoverage__ContextsAssignment_8_1"
    // InternalCOV.g:3230:1: rule__DomainSpecificCoverage__ContextsAssignment_8_1 : ( ruleContext ) ;
    public final void rule__DomainSpecificCoverage__ContextsAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3234:1: ( ( ruleContext ) )
            // InternalCOV.g:3235:2: ( ruleContext )
            {
            // InternalCOV.g:3235:2: ( ruleContext )
            // InternalCOV.g:3236:3: ruleContext
            {
             before(grammarAccess.getDomainSpecificCoverageAccess().getContextsContextParserRuleCall_8_1_0()); 
            pushFollow(FOLLOW_2);
            ruleContext();

            state._fsp--;

             after(grammarAccess.getDomainSpecificCoverageAccess().getContextsContextParserRuleCall_8_1_0()); 

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
    // $ANTLR end "rule__DomainSpecificCoverage__ContextsAssignment_8_1"


    // $ANTLR start "rule__Context__MetaclassAssignment_1"
    // InternalCOV.g:3245:1: rule__Context__MetaclassAssignment_1 : ( ( ruleEString ) ) ;
    public final void rule__Context__MetaclassAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3249:1: ( ( ( ruleEString ) ) )
            // InternalCOV.g:3250:2: ( ( ruleEString ) )
            {
            // InternalCOV.g:3250:2: ( ( ruleEString ) )
            // InternalCOV.g:3251:3: ( ruleEString )
            {
             before(grammarAccess.getContextAccess().getMetaclassEClassCrossReference_1_0()); 
            // InternalCOV.g:3252:3: ( ruleEString )
            // InternalCOV.g:3253:4: ruleEString
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
    // InternalCOV.g:3264:1: rule__Context__RulesAssignment_3_0 : ( ruleRule ) ;
    public final void rule__Context__RulesAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3268:1: ( ( ruleRule ) )
            // InternalCOV.g:3269:2: ( ruleRule )
            {
            // InternalCOV.g:3269:2: ( ruleRule )
            // InternalCOV.g:3270:3: ruleRule
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
    // InternalCOV.g:3279:1: rule__Context__RulesAssignment_3_1_1 : ( ruleRule ) ;
    public final void rule__Context__RulesAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3283:1: ( ( ruleRule ) )
            // InternalCOV.g:3284:2: ( ruleRule )
            {
            // InternalCOV.g:3284:2: ( ruleRule )
            // InternalCOV.g:3285:3: ruleRule
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


    // $ANTLR start "rule__Ignore__ConditionAssignment_1_1"
    // InternalCOV.g:3294:1: rule__Ignore__ConditionAssignment_1_1 : ( ruleCondition ) ;
    public final void rule__Ignore__ConditionAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3298:1: ( ( ruleCondition ) )
            // InternalCOV.g:3299:2: ( ruleCondition )
            {
            // InternalCOV.g:3299:2: ( ruleCondition )
            // InternalCOV.g:3300:3: ruleCondition
            {
             before(grammarAccess.getIgnoreAccess().getConditionConditionParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getIgnoreAccess().getConditionConditionParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__Ignore__ConditionAssignment_1_1"


    // $ANTLR start "rule__Ignore__IgnoreSubtypesAssignment_4_1"
    // InternalCOV.g:3309:1: rule__Ignore__IgnoreSubtypesAssignment_4_1 : ( ruleEBoolean ) ;
    public final void rule__Ignore__IgnoreSubtypesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3313:1: ( ( ruleEBoolean ) )
            // InternalCOV.g:3314:2: ( ruleEBoolean )
            {
            // InternalCOV.g:3314:2: ( ruleEBoolean )
            // InternalCOV.g:3315:3: ruleEBoolean
            {
             before(grammarAccess.getIgnoreAccess().getIgnoreSubtypesEBooleanParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getIgnoreAccess().getIgnoreSubtypesEBooleanParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__Ignore__IgnoreSubtypesAssignment_4_1"


    // $ANTLR start "rule__Ignore__DescriptionAssignment_6_1"
    // InternalCOV.g:3324:1: rule__Ignore__DescriptionAssignment_6_1 : ( ruleEString ) ;
    public final void rule__Ignore__DescriptionAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3328:1: ( ( ruleEString ) )
            // InternalCOV.g:3329:2: ( ruleEString )
            {
            // InternalCOV.g:3329:2: ( ruleEString )
            // InternalCOV.g:3330:3: ruleEString
            {
             before(grammarAccess.getIgnoreAccess().getDescriptionEStringParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getIgnoreAccess().getDescriptionEStringParserRuleCall_6_1_0()); 

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
    // $ANTLR end "rule__Ignore__DescriptionAssignment_6_1"


    // $ANTLR start "rule__LimitedIgnore__ConditionAssignment_1_1"
    // InternalCOV.g:3339:1: rule__LimitedIgnore__ConditionAssignment_1_1 : ( ruleCondition ) ;
    public final void rule__LimitedIgnore__ConditionAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3343:1: ( ( ruleCondition ) )
            // InternalCOV.g:3344:2: ( ruleCondition )
            {
            // InternalCOV.g:3344:2: ( ruleCondition )
            // InternalCOV.g:3345:3: ruleCondition
            {
             before(grammarAccess.getLimitedIgnoreAccess().getConditionConditionParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getLimitedIgnoreAccess().getConditionConditionParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__LimitedIgnore__ConditionAssignment_1_1"


    // $ANTLR start "rule__LimitedIgnore__TypeAssignment_3"
    // InternalCOV.g:3354:1: rule__LimitedIgnore__TypeAssignment_3 : ( ruleLimitationType ) ;
    public final void rule__LimitedIgnore__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3358:1: ( ( ruleLimitationType ) )
            // InternalCOV.g:3359:2: ( ruleLimitationType )
            {
            // InternalCOV.g:3359:2: ( ruleLimitationType )
            // InternalCOV.g:3360:3: ruleLimitationType
            {
             before(grammarAccess.getLimitedIgnoreAccess().getTypeLimitationTypeEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleLimitationType();

            state._fsp--;

             after(grammarAccess.getLimitedIgnoreAccess().getTypeLimitationTypeEnumRuleCall_3_0()); 

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
    // $ANTLR end "rule__LimitedIgnore__TypeAssignment_3"


    // $ANTLR start "rule__LimitedIgnore__ContainerMetaclassAssignment_4"
    // InternalCOV.g:3369:1: rule__LimitedIgnore__ContainerMetaclassAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__LimitedIgnore__ContainerMetaclassAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3373:1: ( ( ( ruleEString ) ) )
            // InternalCOV.g:3374:2: ( ( ruleEString ) )
            {
            // InternalCOV.g:3374:2: ( ( ruleEString ) )
            // InternalCOV.g:3375:3: ( ruleEString )
            {
             before(grammarAccess.getLimitedIgnoreAccess().getContainerMetaclassEClassCrossReference_4_0()); 
            // InternalCOV.g:3376:3: ( ruleEString )
            // InternalCOV.g:3377:4: ruleEString
            {
             before(grammarAccess.getLimitedIgnoreAccess().getContainerMetaclassEClassEStringParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getLimitedIgnoreAccess().getContainerMetaclassEClassEStringParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getLimitedIgnoreAccess().getContainerMetaclassEClassCrossReference_4_0()); 

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
    // $ANTLR end "rule__LimitedIgnore__ContainerMetaclassAssignment_4"


    // $ANTLR start "rule__LimitedIgnore__ContainerMetaclassAssignment_5_1"
    // InternalCOV.g:3388:1: rule__LimitedIgnore__ContainerMetaclassAssignment_5_1 : ( ( ruleEString ) ) ;
    public final void rule__LimitedIgnore__ContainerMetaclassAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3392:1: ( ( ( ruleEString ) ) )
            // InternalCOV.g:3393:2: ( ( ruleEString ) )
            {
            // InternalCOV.g:3393:2: ( ( ruleEString ) )
            // InternalCOV.g:3394:3: ( ruleEString )
            {
             before(grammarAccess.getLimitedIgnoreAccess().getContainerMetaclassEClassCrossReference_5_1_0()); 
            // InternalCOV.g:3395:3: ( ruleEString )
            // InternalCOV.g:3396:4: ruleEString
            {
             before(grammarAccess.getLimitedIgnoreAccess().getContainerMetaclassEClassEStringParserRuleCall_5_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getLimitedIgnoreAccess().getContainerMetaclassEClassEStringParserRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getLimitedIgnoreAccess().getContainerMetaclassEClassCrossReference_5_1_0()); 

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
    // $ANTLR end "rule__LimitedIgnore__ContainerMetaclassAssignment_5_1"


    // $ANTLR start "rule__LimitedIgnore__DescriptionAssignment_6_1"
    // InternalCOV.g:3407:1: rule__LimitedIgnore__DescriptionAssignment_6_1 : ( ruleEString ) ;
    public final void rule__LimitedIgnore__DescriptionAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3411:1: ( ( ruleEString ) )
            // InternalCOV.g:3412:2: ( ruleEString )
            {
            // InternalCOV.g:3412:2: ( ruleEString )
            // InternalCOV.g:3413:3: ruleEString
            {
             before(grammarAccess.getLimitedIgnoreAccess().getDescriptionEStringParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getLimitedIgnoreAccess().getDescriptionEStringParserRuleCall_6_1_0()); 

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
    // $ANTLR end "rule__LimitedIgnore__DescriptionAssignment_6_1"


    // $ANTLR start "rule__CoverageOfReferenced__ConditionAssignment_1_1"
    // InternalCOV.g:3422:1: rule__CoverageOfReferenced__ConditionAssignment_1_1 : ( ruleCondition ) ;
    public final void rule__CoverageOfReferenced__ConditionAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3426:1: ( ( ruleCondition ) )
            // InternalCOV.g:3427:2: ( ruleCondition )
            {
            // InternalCOV.g:3427:2: ( ruleCondition )
            // InternalCOV.g:3428:3: ruleCondition
            {
             before(grammarAccess.getCoverageOfReferencedAccess().getConditionConditionParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getCoverageOfReferencedAccess().getConditionConditionParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__CoverageOfReferenced__ConditionAssignment_1_1"


    // $ANTLR start "rule__CoverageOfReferenced__ReferenceAssignment_3"
    // InternalCOV.g:3437:1: rule__CoverageOfReferenced__ReferenceAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__CoverageOfReferenced__ReferenceAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3441:1: ( ( ( ruleEString ) ) )
            // InternalCOV.g:3442:2: ( ( ruleEString ) )
            {
            // InternalCOV.g:3442:2: ( ( ruleEString ) )
            // InternalCOV.g:3443:3: ( ruleEString )
            {
             before(grammarAccess.getCoverageOfReferencedAccess().getReferenceEReferenceCrossReference_3_0()); 
            // InternalCOV.g:3444:3: ( ruleEString )
            // InternalCOV.g:3445:4: ruleEString
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


    // $ANTLR start "rule__CoverageOfReferenced__ReferenceAssignment_4_1"
    // InternalCOV.g:3456:1: rule__CoverageOfReferenced__ReferenceAssignment_4_1 : ( ( ruleEString ) ) ;
    public final void rule__CoverageOfReferenced__ReferenceAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3460:1: ( ( ( ruleEString ) ) )
            // InternalCOV.g:3461:2: ( ( ruleEString ) )
            {
            // InternalCOV.g:3461:2: ( ( ruleEString ) )
            // InternalCOV.g:3462:3: ( ruleEString )
            {
             before(grammarAccess.getCoverageOfReferencedAccess().getReferenceEReferenceCrossReference_4_1_0()); 
            // InternalCOV.g:3463:3: ( ruleEString )
            // InternalCOV.g:3464:4: ruleEString
            {
             before(grammarAccess.getCoverageOfReferencedAccess().getReferenceEReferenceEStringParserRuleCall_4_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCoverageOfReferencedAccess().getReferenceEReferenceEStringParserRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getCoverageOfReferencedAccess().getReferenceEReferenceCrossReference_4_1_0()); 

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
    // $ANTLR end "rule__CoverageOfReferenced__ReferenceAssignment_4_1"


    // $ANTLR start "rule__CoverageOfReferenced__DescriptionAssignment_5_1"
    // InternalCOV.g:3475:1: rule__CoverageOfReferenced__DescriptionAssignment_5_1 : ( ruleEString ) ;
    public final void rule__CoverageOfReferenced__DescriptionAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3479:1: ( ( ruleEString ) )
            // InternalCOV.g:3480:2: ( ruleEString )
            {
            // InternalCOV.g:3480:2: ( ruleEString )
            // InternalCOV.g:3481:3: ruleEString
            {
             before(grammarAccess.getCoverageOfReferencedAccess().getDescriptionEStringParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCoverageOfReferencedAccess().getDescriptionEStringParserRuleCall_5_1_0()); 

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
    // $ANTLR end "rule__CoverageOfReferenced__DescriptionAssignment_5_1"


    // $ANTLR start "rule__CoverageByContent__ConditionAssignment_1_1"
    // InternalCOV.g:3490:1: rule__CoverageByContent__ConditionAssignment_1_1 : ( ruleCondition ) ;
    public final void rule__CoverageByContent__ConditionAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3494:1: ( ( ruleCondition ) )
            // InternalCOV.g:3495:2: ( ruleCondition )
            {
            // InternalCOV.g:3495:2: ( ruleCondition )
            // InternalCOV.g:3496:3: ruleCondition
            {
             before(grammarAccess.getCoverageByContentAccess().getConditionConditionParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getCoverageByContentAccess().getConditionConditionParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__CoverageByContent__ConditionAssignment_1_1"


    // $ANTLR start "rule__CoverageByContent__MultiplicityAssignment_4"
    // InternalCOV.g:3505:1: rule__CoverageByContent__MultiplicityAssignment_4 : ( ruleCoveredContents ) ;
    public final void rule__CoverageByContent__MultiplicityAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3509:1: ( ( ruleCoveredContents ) )
            // InternalCOV.g:3510:2: ( ruleCoveredContents )
            {
            // InternalCOV.g:3510:2: ( ruleCoveredContents )
            // InternalCOV.g:3511:3: ruleCoveredContents
            {
             before(grammarAccess.getCoverageByContentAccess().getMultiplicityCoveredContentsEnumRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleCoveredContents();

            state._fsp--;

             after(grammarAccess.getCoverageByContentAccess().getMultiplicityCoveredContentsEnumRuleCall_4_0()); 

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
    // $ANTLR end "rule__CoverageByContent__MultiplicityAssignment_4"


    // $ANTLR start "rule__CoverageByContent__ContainmentReferenceAssignment_5"
    // InternalCOV.g:3520:1: rule__CoverageByContent__ContainmentReferenceAssignment_5 : ( ( ruleEString ) ) ;
    public final void rule__CoverageByContent__ContainmentReferenceAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3524:1: ( ( ( ruleEString ) ) )
            // InternalCOV.g:3525:2: ( ( ruleEString ) )
            {
            // InternalCOV.g:3525:2: ( ( ruleEString ) )
            // InternalCOV.g:3526:3: ( ruleEString )
            {
             before(grammarAccess.getCoverageByContentAccess().getContainmentReferenceEReferenceCrossReference_5_0()); 
            // InternalCOV.g:3527:3: ( ruleEString )
            // InternalCOV.g:3528:4: ruleEString
            {
             before(grammarAccess.getCoverageByContentAccess().getContainmentReferenceEReferenceEStringParserRuleCall_5_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCoverageByContentAccess().getContainmentReferenceEReferenceEStringParserRuleCall_5_0_1()); 

            }

             after(grammarAccess.getCoverageByContentAccess().getContainmentReferenceEReferenceCrossReference_5_0()); 

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
    // $ANTLR end "rule__CoverageByContent__ContainmentReferenceAssignment_5"


    // $ANTLR start "rule__CoverageByContent__DescriptionAssignment_7_1"
    // InternalCOV.g:3539:1: rule__CoverageByContent__DescriptionAssignment_7_1 : ( ruleEString ) ;
    public final void rule__CoverageByContent__DescriptionAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3543:1: ( ( ruleEString ) )
            // InternalCOV.g:3544:2: ( ruleEString )
            {
            // InternalCOV.g:3544:2: ( ruleEString )
            // InternalCOV.g:3545:3: ruleEString
            {
             before(grammarAccess.getCoverageByContentAccess().getDescriptionEStringParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCoverageByContentAccess().getDescriptionEStringParserRuleCall_7_1_0()); 

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
    // $ANTLR end "rule__CoverageByContent__DescriptionAssignment_7_1"


    // $ANTLR start "rule__BranchSpecification__ConditionAssignment_1_1"
    // InternalCOV.g:3554:1: rule__BranchSpecification__ConditionAssignment_1_1 : ( ruleCondition ) ;
    public final void rule__BranchSpecification__ConditionAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3558:1: ( ( ruleCondition ) )
            // InternalCOV.g:3559:2: ( ruleCondition )
            {
            // InternalCOV.g:3559:2: ( ruleCondition )
            // InternalCOV.g:3560:3: ruleCondition
            {
             before(grammarAccess.getBranchSpecificationAccess().getConditionConditionParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getBranchSpecificationAccess().getConditionConditionParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__BranchSpecification__ConditionAssignment_1_1"


    // $ANTLR start "rule__BranchSpecification__BranchesAssignment_3"
    // InternalCOV.g:3569:1: rule__BranchSpecification__BranchesAssignment_3 : ( ruleBranch ) ;
    public final void rule__BranchSpecification__BranchesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3573:1: ( ( ruleBranch ) )
            // InternalCOV.g:3574:2: ( ruleBranch )
            {
            // InternalCOV.g:3574:2: ( ruleBranch )
            // InternalCOV.g:3575:3: ruleBranch
            {
             before(grammarAccess.getBranchSpecificationAccess().getBranchesBranchParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleBranch();

            state._fsp--;

             after(grammarAccess.getBranchSpecificationAccess().getBranchesBranchParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__BranchSpecification__BranchesAssignment_3"


    // $ANTLR start "rule__BranchSpecification__BranchesAssignment_4_1"
    // InternalCOV.g:3584:1: rule__BranchSpecification__BranchesAssignment_4_1 : ( ruleBranch ) ;
    public final void rule__BranchSpecification__BranchesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3588:1: ( ( ruleBranch ) )
            // InternalCOV.g:3589:2: ( ruleBranch )
            {
            // InternalCOV.g:3589:2: ( ruleBranch )
            // InternalCOV.g:3590:3: ruleBranch
            {
             before(grammarAccess.getBranchSpecificationAccess().getBranchesBranchParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBranch();

            state._fsp--;

             after(grammarAccess.getBranchSpecificationAccess().getBranchesBranchParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__BranchSpecification__BranchesAssignment_4_1"


    // $ANTLR start "rule__BranchSpecification__DescriptionAssignment_5_1"
    // InternalCOV.g:3599:1: rule__BranchSpecification__DescriptionAssignment_5_1 : ( ruleEString ) ;
    public final void rule__BranchSpecification__DescriptionAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3603:1: ( ( ruleEString ) )
            // InternalCOV.g:3604:2: ( ruleEString )
            {
            // InternalCOV.g:3604:2: ( ruleEString )
            // InternalCOV.g:3605:3: ruleEString
            {
             before(grammarAccess.getBranchSpecificationAccess().getDescriptionEStringParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBranchSpecificationAccess().getDescriptionEStringParserRuleCall_5_1_0()); 

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
    // $ANTLR end "rule__BranchSpecification__DescriptionAssignment_5_1"


    // $ANTLR start "rule__ExplicitBranch__OCLQueryAssignment_1"
    // InternalCOV.g:3614:1: rule__ExplicitBranch__OCLQueryAssignment_1 : ( ruleEString ) ;
    public final void rule__ExplicitBranch__OCLQueryAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3618:1: ( ( ruleEString ) )
            // InternalCOV.g:3619:2: ( ruleEString )
            {
            // InternalCOV.g:3619:2: ( ruleEString )
            // InternalCOV.g:3620:3: ruleEString
            {
             before(grammarAccess.getExplicitBranchAccess().getOCLQueryEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getExplicitBranchAccess().getOCLQueryEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__ExplicitBranch__OCLQueryAssignment_1"


    // $ANTLR start "rule__Condition__OCLConstraintAssignment"
    // InternalCOV.g:3629:1: rule__Condition__OCLConstraintAssignment : ( ruleEString ) ;
    public final void rule__Condition__OCLConstraintAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3633:1: ( ( ruleEString ) )
            // InternalCOV.g:3634:2: ( ruleEString )
            {
            // InternalCOV.g:3634:2: ( ruleEString )
            // InternalCOV.g:3635:3: ruleEString
            {
             before(grammarAccess.getConditionAccess().getOCLConstraintEStringParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getConditionAccess().getOCLConstraintEStringParserRuleCall_0()); 

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
    // $ANTLR end "rule__Condition__OCLConstraintAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000880000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000001C9240000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000001C9040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000009000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000014000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000048000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000020400000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000088000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000108000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000020600000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000800000000L});

}