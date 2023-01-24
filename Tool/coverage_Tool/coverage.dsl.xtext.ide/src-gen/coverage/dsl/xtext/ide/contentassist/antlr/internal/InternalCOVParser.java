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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'NOT'", "'true'", "'false'", "'AND'", "'OR'", "'ALL'", "'ONE'", "'containedBy'", "'notContainedBy'", "'ruleset'", "'{'", "'import'", "'metamodel'", "'}'", "','", "'context'", "'ignore'", "'('", "')'", "'subtypes'", "'description'", "'condition'", "'ignoreif'", "'covers'", "'covered'", "'when'", "'iscovered'", "'has'", "'branches'", "'queryBranch'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
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
    public static final int T__40=40;
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
    // InternalCOV.g:312:1: ruleBranch : ( ( rule__Branch__Group__0 ) ) ;
    public final void ruleBranch() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:316:2: ( ( ( rule__Branch__Group__0 ) ) )
            // InternalCOV.g:317:2: ( ( rule__Branch__Group__0 ) )
            {
            // InternalCOV.g:317:2: ( ( rule__Branch__Group__0 ) )
            // InternalCOV.g:318:3: ( rule__Branch__Group__0 )
            {
             before(grammarAccess.getBranchAccess().getGroup()); 
            // InternalCOV.g:319:3: ( rule__Branch__Group__0 )
            // InternalCOV.g:319:4: rule__Branch__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Branch__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBranchAccess().getGroup()); 

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


    // $ANTLR start "entryRuleCondition"
    // InternalCOV.g:328:1: entryRuleCondition : ruleCondition EOF ;
    public final void entryRuleCondition() throws RecognitionException {
        try {
            // InternalCOV.g:329:1: ( ruleCondition EOF )
            // InternalCOV.g:330:1: ruleCondition EOF
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
    // InternalCOV.g:337:1: ruleCondition : ( ( rule__Condition__Alternatives ) ) ;
    public final void ruleCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:341:2: ( ( ( rule__Condition__Alternatives ) ) )
            // InternalCOV.g:342:2: ( ( rule__Condition__Alternatives ) )
            {
            // InternalCOV.g:342:2: ( ( rule__Condition__Alternatives ) )
            // InternalCOV.g:343:3: ( rule__Condition__Alternatives )
            {
             before(grammarAccess.getConditionAccess().getAlternatives()); 
            // InternalCOV.g:344:3: ( rule__Condition__Alternatives )
            // InternalCOV.g:344:4: rule__Condition__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Condition__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getAlternatives()); 

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


    // $ANTLR start "entryRuleUnaryCondition"
    // InternalCOV.g:353:1: entryRuleUnaryCondition : ruleUnaryCondition EOF ;
    public final void entryRuleUnaryCondition() throws RecognitionException {
        try {
            // InternalCOV.g:354:1: ( ruleUnaryCondition EOF )
            // InternalCOV.g:355:1: ruleUnaryCondition EOF
            {
             before(grammarAccess.getUnaryConditionRule()); 
            pushFollow(FOLLOW_1);
            ruleUnaryCondition();

            state._fsp--;

             after(grammarAccess.getUnaryConditionRule()); 
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
    // $ANTLR end "entryRuleUnaryCondition"


    // $ANTLR start "ruleUnaryCondition"
    // InternalCOV.g:362:1: ruleUnaryCondition : ( ( rule__UnaryCondition__Group__0 ) ) ;
    public final void ruleUnaryCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:366:2: ( ( ( rule__UnaryCondition__Group__0 ) ) )
            // InternalCOV.g:367:2: ( ( rule__UnaryCondition__Group__0 ) )
            {
            // InternalCOV.g:367:2: ( ( rule__UnaryCondition__Group__0 ) )
            // InternalCOV.g:368:3: ( rule__UnaryCondition__Group__0 )
            {
             before(grammarAccess.getUnaryConditionAccess().getGroup()); 
            // InternalCOV.g:369:3: ( rule__UnaryCondition__Group__0 )
            // InternalCOV.g:369:4: rule__UnaryCondition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__UnaryCondition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUnaryConditionAccess().getGroup()); 

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
    // $ANTLR end "ruleUnaryCondition"


    // $ANTLR start "entryRuleBinaryCondition"
    // InternalCOV.g:378:1: entryRuleBinaryCondition : ruleBinaryCondition EOF ;
    public final void entryRuleBinaryCondition() throws RecognitionException {
        try {
            // InternalCOV.g:379:1: ( ruleBinaryCondition EOF )
            // InternalCOV.g:380:1: ruleBinaryCondition EOF
            {
             before(grammarAccess.getBinaryConditionRule()); 
            pushFollow(FOLLOW_1);
            ruleBinaryCondition();

            state._fsp--;

             after(grammarAccess.getBinaryConditionRule()); 
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
    // $ANTLR end "entryRuleBinaryCondition"


    // $ANTLR start "ruleBinaryCondition"
    // InternalCOV.g:387:1: ruleBinaryCondition : ( ( rule__BinaryCondition__Group__0 ) ) ;
    public final void ruleBinaryCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:391:2: ( ( ( rule__BinaryCondition__Group__0 ) ) )
            // InternalCOV.g:392:2: ( ( rule__BinaryCondition__Group__0 ) )
            {
            // InternalCOV.g:392:2: ( ( rule__BinaryCondition__Group__0 ) )
            // InternalCOV.g:393:3: ( rule__BinaryCondition__Group__0 )
            {
             before(grammarAccess.getBinaryConditionAccess().getGroup()); 
            // InternalCOV.g:394:3: ( rule__BinaryCondition__Group__0 )
            // InternalCOV.g:394:4: rule__BinaryCondition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BinaryCondition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBinaryConditionAccess().getGroup()); 

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
    // $ANTLR end "ruleBinaryCondition"


    // $ANTLR start "ruleBinaryOperator"
    // InternalCOV.g:403:1: ruleBinaryOperator : ( ( rule__BinaryOperator__Alternatives ) ) ;
    public final void ruleBinaryOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:407:1: ( ( ( rule__BinaryOperator__Alternatives ) ) )
            // InternalCOV.g:408:2: ( ( rule__BinaryOperator__Alternatives ) )
            {
            // InternalCOV.g:408:2: ( ( rule__BinaryOperator__Alternatives ) )
            // InternalCOV.g:409:3: ( rule__BinaryOperator__Alternatives )
            {
             before(grammarAccess.getBinaryOperatorAccess().getAlternatives()); 
            // InternalCOV.g:410:3: ( rule__BinaryOperator__Alternatives )
            // InternalCOV.g:410:4: rule__BinaryOperator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__BinaryOperator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBinaryOperatorAccess().getAlternatives()); 

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
    // $ANTLR end "ruleBinaryOperator"


    // $ANTLR start "ruleUnaryOperator"
    // InternalCOV.g:419:1: ruleUnaryOperator : ( ( 'NOT' ) ) ;
    public final void ruleUnaryOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:423:1: ( ( ( 'NOT' ) ) )
            // InternalCOV.g:424:2: ( ( 'NOT' ) )
            {
            // InternalCOV.g:424:2: ( ( 'NOT' ) )
            // InternalCOV.g:425:3: ( 'NOT' )
            {
             before(grammarAccess.getUnaryOperatorAccess().getNOTEnumLiteralDeclaration()); 
            // InternalCOV.g:426:3: ( 'NOT' )
            // InternalCOV.g:426:4: 'NOT'
            {
            match(input,11,FOLLOW_2); 

            }

             after(grammarAccess.getUnaryOperatorAccess().getNOTEnumLiteralDeclaration()); 

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
    // $ANTLR end "ruleUnaryOperator"


    // $ANTLR start "ruleCoveredContents"
    // InternalCOV.g:435:1: ruleCoveredContents : ( ( rule__CoveredContents__Alternatives ) ) ;
    public final void ruleCoveredContents() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:439:1: ( ( ( rule__CoveredContents__Alternatives ) ) )
            // InternalCOV.g:440:2: ( ( rule__CoveredContents__Alternatives ) )
            {
            // InternalCOV.g:440:2: ( ( rule__CoveredContents__Alternatives ) )
            // InternalCOV.g:441:3: ( rule__CoveredContents__Alternatives )
            {
             before(grammarAccess.getCoveredContentsAccess().getAlternatives()); 
            // InternalCOV.g:442:3: ( rule__CoveredContents__Alternatives )
            // InternalCOV.g:442:4: rule__CoveredContents__Alternatives
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
    // InternalCOV.g:451:1: ruleLimitationType : ( ( rule__LimitationType__Alternatives ) ) ;
    public final void ruleLimitationType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:455:1: ( ( ( rule__LimitationType__Alternatives ) ) )
            // InternalCOV.g:456:2: ( ( rule__LimitationType__Alternatives ) )
            {
            // InternalCOV.g:456:2: ( ( rule__LimitationType__Alternatives ) )
            // InternalCOV.g:457:3: ( rule__LimitationType__Alternatives )
            {
             before(grammarAccess.getLimitationTypeAccess().getAlternatives()); 
            // InternalCOV.g:458:3: ( rule__LimitationType__Alternatives )
            // InternalCOV.g:458:4: rule__LimitationType__Alternatives
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
    // InternalCOV.g:466:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:470:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalCOV.g:471:2: ( RULE_STRING )
                    {
                    // InternalCOV.g:471:2: ( RULE_STRING )
                    // InternalCOV.g:472:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCOV.g:477:2: ( RULE_ID )
                    {
                    // InternalCOV.g:477:2: ( RULE_ID )
                    // InternalCOV.g:478:3: RULE_ID
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
    // InternalCOV.g:487:1: rule__Rule__Alternatives : ( ( ruleIgnore ) | ( ruleCoverageOfReferenced ) | ( ruleCoverageByContent ) | ( ruleLimitedIgnore ) | ( ruleBranchSpecification ) );
    public final void rule__Rule__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:491:1: ( ( ruleIgnore ) | ( ruleCoverageOfReferenced ) | ( ruleCoverageByContent ) | ( ruleLimitedIgnore ) | ( ruleBranchSpecification ) )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt2=1;
                }
                break;
            case 34:
                {
                alt2=2;
                }
                break;
            case 35:
                {
                alt2=3;
                }
                break;
            case 33:
                {
                alt2=4;
                }
                break;
            case 38:
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
                    // InternalCOV.g:492:2: ( ruleIgnore )
                    {
                    // InternalCOV.g:492:2: ( ruleIgnore )
                    // InternalCOV.g:493:3: ruleIgnore
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
                    // InternalCOV.g:498:2: ( ruleCoverageOfReferenced )
                    {
                    // InternalCOV.g:498:2: ( ruleCoverageOfReferenced )
                    // InternalCOV.g:499:3: ruleCoverageOfReferenced
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
                    // InternalCOV.g:504:2: ( ruleCoverageByContent )
                    {
                    // InternalCOV.g:504:2: ( ruleCoverageByContent )
                    // InternalCOV.g:505:3: ruleCoverageByContent
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
                    // InternalCOV.g:510:2: ( ruleLimitedIgnore )
                    {
                    // InternalCOV.g:510:2: ( ruleLimitedIgnore )
                    // InternalCOV.g:511:3: ruleLimitedIgnore
                    {
                     before(grammarAccess.getRuleAccess().getLimitedIgnoreParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleLimitedIgnore();

                    state._fsp--;

                     after(grammarAccess.getRuleAccess().getLimitedIgnoreParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalCOV.g:516:2: ( ruleBranchSpecification )
                    {
                    // InternalCOV.g:516:2: ( ruleBranchSpecification )
                    // InternalCOV.g:517:3: ruleBranchSpecification
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
    // InternalCOV.g:526:1: rule__EBoolean__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__EBoolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:530:1: ( ( 'true' ) | ( 'false' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==12) ) {
                alt3=1;
            }
            else if ( (LA3_0==13) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalCOV.g:531:2: ( 'true' )
                    {
                    // InternalCOV.g:531:2: ( 'true' )
                    // InternalCOV.g:532:3: 'true'
                    {
                     before(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCOV.g:537:2: ( 'false' )
                    {
                    // InternalCOV.g:537:2: ( 'false' )
                    // InternalCOV.g:538:3: 'false'
                    {
                     before(grammarAccess.getEBooleanAccess().getFalseKeyword_1()); 
                    match(input,13,FOLLOW_2); 
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


    // $ANTLR start "rule__Condition__Alternatives"
    // InternalCOV.g:547:1: rule__Condition__Alternatives : ( ( ruleUnaryCondition ) | ( ruleBinaryCondition ) );
    public final void rule__Condition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:551:1: ( ( ruleUnaryCondition ) | ( ruleBinaryCondition ) )
            int alt4=2;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt4=1;
                }
                break;
            case RULE_STRING:
                {
                int LA4_2 = input.LA(2);

                if ( ((LA4_2>=14 && LA4_2<=15)) ) {
                    alt4=2;
                }
                else if ( (LA4_2==EOF||(LA4_2>=RULE_STRING && LA4_2<=RULE_ID)||LA4_2==11||(LA4_2>=24 && LA4_2<=25)||LA4_2==40) ) {
                    alt4=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                int LA4_3 = input.LA(2);

                if ( (LA4_3==EOF||(LA4_3>=RULE_STRING && LA4_3<=RULE_ID)||LA4_3==11||(LA4_3>=24 && LA4_3<=25)||LA4_3==40) ) {
                    alt4=1;
                }
                else if ( ((LA4_3>=14 && LA4_3<=15)) ) {
                    alt4=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalCOV.g:552:2: ( ruleUnaryCondition )
                    {
                    // InternalCOV.g:552:2: ( ruleUnaryCondition )
                    // InternalCOV.g:553:3: ruleUnaryCondition
                    {
                     before(grammarAccess.getConditionAccess().getUnaryConditionParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleUnaryCondition();

                    state._fsp--;

                     after(grammarAccess.getConditionAccess().getUnaryConditionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCOV.g:558:2: ( ruleBinaryCondition )
                    {
                    // InternalCOV.g:558:2: ( ruleBinaryCondition )
                    // InternalCOV.g:559:3: ruleBinaryCondition
                    {
                     before(grammarAccess.getConditionAccess().getBinaryConditionParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleBinaryCondition();

                    state._fsp--;

                     after(grammarAccess.getConditionAccess().getBinaryConditionParserRuleCall_1()); 

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
    // $ANTLR end "rule__Condition__Alternatives"


    // $ANTLR start "rule__BinaryOperator__Alternatives"
    // InternalCOV.g:568:1: rule__BinaryOperator__Alternatives : ( ( ( 'AND' ) ) | ( ( 'OR' ) ) );
    public final void rule__BinaryOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:572:1: ( ( ( 'AND' ) ) | ( ( 'OR' ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==14) ) {
                alt5=1;
            }
            else if ( (LA5_0==15) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalCOV.g:573:2: ( ( 'AND' ) )
                    {
                    // InternalCOV.g:573:2: ( ( 'AND' ) )
                    // InternalCOV.g:574:3: ( 'AND' )
                    {
                     before(grammarAccess.getBinaryOperatorAccess().getANDEnumLiteralDeclaration_0()); 
                    // InternalCOV.g:575:3: ( 'AND' )
                    // InternalCOV.g:575:4: 'AND'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getBinaryOperatorAccess().getANDEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCOV.g:579:2: ( ( 'OR' ) )
                    {
                    // InternalCOV.g:579:2: ( ( 'OR' ) )
                    // InternalCOV.g:580:3: ( 'OR' )
                    {
                     before(grammarAccess.getBinaryOperatorAccess().getOREnumLiteralDeclaration_1()); 
                    // InternalCOV.g:581:3: ( 'OR' )
                    // InternalCOV.g:581:4: 'OR'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getBinaryOperatorAccess().getOREnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__BinaryOperator__Alternatives"


    // $ANTLR start "rule__CoveredContents__Alternatives"
    // InternalCOV.g:589:1: rule__CoveredContents__Alternatives : ( ( ( 'ALL' ) ) | ( ( 'ONE' ) ) );
    public final void rule__CoveredContents__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:593:1: ( ( ( 'ALL' ) ) | ( ( 'ONE' ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==16) ) {
                alt6=1;
            }
            else if ( (LA6_0==17) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalCOV.g:594:2: ( ( 'ALL' ) )
                    {
                    // InternalCOV.g:594:2: ( ( 'ALL' ) )
                    // InternalCOV.g:595:3: ( 'ALL' )
                    {
                     before(grammarAccess.getCoveredContentsAccess().getALLEnumLiteralDeclaration_0()); 
                    // InternalCOV.g:596:3: ( 'ALL' )
                    // InternalCOV.g:596:4: 'ALL'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getCoveredContentsAccess().getALLEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCOV.g:600:2: ( ( 'ONE' ) )
                    {
                    // InternalCOV.g:600:2: ( ( 'ONE' ) )
                    // InternalCOV.g:601:3: ( 'ONE' )
                    {
                     before(grammarAccess.getCoveredContentsAccess().getONEEnumLiteralDeclaration_1()); 
                    // InternalCOV.g:602:3: ( 'ONE' )
                    // InternalCOV.g:602:4: 'ONE'
                    {
                    match(input,17,FOLLOW_2); 

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
    // InternalCOV.g:610:1: rule__LimitationType__Alternatives : ( ( ( 'containedBy' ) ) | ( ( 'notContainedBy' ) ) );
    public final void rule__LimitationType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:614:1: ( ( ( 'containedBy' ) ) | ( ( 'notContainedBy' ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            else if ( (LA7_0==19) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalCOV.g:615:2: ( ( 'containedBy' ) )
                    {
                    // InternalCOV.g:615:2: ( ( 'containedBy' ) )
                    // InternalCOV.g:616:3: ( 'containedBy' )
                    {
                     before(grammarAccess.getLimitationTypeAccess().getContainedByEnumLiteralDeclaration_0()); 
                    // InternalCOV.g:617:3: ( 'containedBy' )
                    // InternalCOV.g:617:4: 'containedBy'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getLimitationTypeAccess().getContainedByEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCOV.g:621:2: ( ( 'notContainedBy' ) )
                    {
                    // InternalCOV.g:621:2: ( ( 'notContainedBy' ) )
                    // InternalCOV.g:622:3: ( 'notContainedBy' )
                    {
                     before(grammarAccess.getLimitationTypeAccess().getNotContainedByEnumLiteralDeclaration_1()); 
                    // InternalCOV.g:623:3: ( 'notContainedBy' )
                    // InternalCOV.g:623:4: 'notContainedBy'
                    {
                    match(input,19,FOLLOW_2); 

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
    // InternalCOV.g:631:1: rule__DomainSpecificCoverage__Group__0 : rule__DomainSpecificCoverage__Group__0__Impl rule__DomainSpecificCoverage__Group__1 ;
    public final void rule__DomainSpecificCoverage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:635:1: ( rule__DomainSpecificCoverage__Group__0__Impl rule__DomainSpecificCoverage__Group__1 )
            // InternalCOV.g:636:2: rule__DomainSpecificCoverage__Group__0__Impl rule__DomainSpecificCoverage__Group__1
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
    // InternalCOV.g:643:1: rule__DomainSpecificCoverage__Group__0__Impl : ( 'ruleset' ) ;
    public final void rule__DomainSpecificCoverage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:647:1: ( ( 'ruleset' ) )
            // InternalCOV.g:648:1: ( 'ruleset' )
            {
            // InternalCOV.g:648:1: ( 'ruleset' )
            // InternalCOV.g:649:2: 'ruleset'
            {
             before(grammarAccess.getDomainSpecificCoverageAccess().getRulesetKeyword_0()); 
            match(input,20,FOLLOW_2); 
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
    // InternalCOV.g:658:1: rule__DomainSpecificCoverage__Group__1 : rule__DomainSpecificCoverage__Group__1__Impl rule__DomainSpecificCoverage__Group__2 ;
    public final void rule__DomainSpecificCoverage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:662:1: ( rule__DomainSpecificCoverage__Group__1__Impl rule__DomainSpecificCoverage__Group__2 )
            // InternalCOV.g:663:2: rule__DomainSpecificCoverage__Group__1__Impl rule__DomainSpecificCoverage__Group__2
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
    // InternalCOV.g:670:1: rule__DomainSpecificCoverage__Group__1__Impl : ( ( rule__DomainSpecificCoverage__NameAssignment_1 ) ) ;
    public final void rule__DomainSpecificCoverage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:674:1: ( ( ( rule__DomainSpecificCoverage__NameAssignment_1 ) ) )
            // InternalCOV.g:675:1: ( ( rule__DomainSpecificCoverage__NameAssignment_1 ) )
            {
            // InternalCOV.g:675:1: ( ( rule__DomainSpecificCoverage__NameAssignment_1 ) )
            // InternalCOV.g:676:2: ( rule__DomainSpecificCoverage__NameAssignment_1 )
            {
             before(grammarAccess.getDomainSpecificCoverageAccess().getNameAssignment_1()); 
            // InternalCOV.g:677:2: ( rule__DomainSpecificCoverage__NameAssignment_1 )
            // InternalCOV.g:677:3: rule__DomainSpecificCoverage__NameAssignment_1
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
    // InternalCOV.g:685:1: rule__DomainSpecificCoverage__Group__2 : rule__DomainSpecificCoverage__Group__2__Impl rule__DomainSpecificCoverage__Group__3 ;
    public final void rule__DomainSpecificCoverage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:689:1: ( rule__DomainSpecificCoverage__Group__2__Impl rule__DomainSpecificCoverage__Group__3 )
            // InternalCOV.g:690:2: rule__DomainSpecificCoverage__Group__2__Impl rule__DomainSpecificCoverage__Group__3
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
    // InternalCOV.g:697:1: rule__DomainSpecificCoverage__Group__2__Impl : ( '{' ) ;
    public final void rule__DomainSpecificCoverage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:701:1: ( ( '{' ) )
            // InternalCOV.g:702:1: ( '{' )
            {
            // InternalCOV.g:702:1: ( '{' )
            // InternalCOV.g:703:2: '{'
            {
             before(grammarAccess.getDomainSpecificCoverageAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,21,FOLLOW_2); 
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
    // InternalCOV.g:712:1: rule__DomainSpecificCoverage__Group__3 : rule__DomainSpecificCoverage__Group__3__Impl rule__DomainSpecificCoverage__Group__4 ;
    public final void rule__DomainSpecificCoverage__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:716:1: ( rule__DomainSpecificCoverage__Group__3__Impl rule__DomainSpecificCoverage__Group__4 )
            // InternalCOV.g:717:2: rule__DomainSpecificCoverage__Group__3__Impl rule__DomainSpecificCoverage__Group__4
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
    // InternalCOV.g:724:1: rule__DomainSpecificCoverage__Group__3__Impl : ( 'import' ) ;
    public final void rule__DomainSpecificCoverage__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:728:1: ( ( 'import' ) )
            // InternalCOV.g:729:1: ( 'import' )
            {
            // InternalCOV.g:729:1: ( 'import' )
            // InternalCOV.g:730:2: 'import'
            {
             before(grammarAccess.getDomainSpecificCoverageAccess().getImportKeyword_3()); 
            match(input,22,FOLLOW_2); 
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
    // InternalCOV.g:739:1: rule__DomainSpecificCoverage__Group__4 : rule__DomainSpecificCoverage__Group__4__Impl rule__DomainSpecificCoverage__Group__5 ;
    public final void rule__DomainSpecificCoverage__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:743:1: ( rule__DomainSpecificCoverage__Group__4__Impl rule__DomainSpecificCoverage__Group__5 )
            // InternalCOV.g:744:2: rule__DomainSpecificCoverage__Group__4__Impl rule__DomainSpecificCoverage__Group__5
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
    // InternalCOV.g:751:1: rule__DomainSpecificCoverage__Group__4__Impl : ( 'metamodel' ) ;
    public final void rule__DomainSpecificCoverage__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:755:1: ( ( 'metamodel' ) )
            // InternalCOV.g:756:1: ( 'metamodel' )
            {
            // InternalCOV.g:756:1: ( 'metamodel' )
            // InternalCOV.g:757:2: 'metamodel'
            {
             before(grammarAccess.getDomainSpecificCoverageAccess().getMetamodelKeyword_4()); 
            match(input,23,FOLLOW_2); 
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
    // InternalCOV.g:766:1: rule__DomainSpecificCoverage__Group__5 : rule__DomainSpecificCoverage__Group__5__Impl rule__DomainSpecificCoverage__Group__6 ;
    public final void rule__DomainSpecificCoverage__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:770:1: ( rule__DomainSpecificCoverage__Group__5__Impl rule__DomainSpecificCoverage__Group__6 )
            // InternalCOV.g:771:2: rule__DomainSpecificCoverage__Group__5__Impl rule__DomainSpecificCoverage__Group__6
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
    // InternalCOV.g:778:1: rule__DomainSpecificCoverage__Group__5__Impl : ( ( rule__DomainSpecificCoverage__MetamodelAssignment_5 ) ) ;
    public final void rule__DomainSpecificCoverage__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:782:1: ( ( ( rule__DomainSpecificCoverage__MetamodelAssignment_5 ) ) )
            // InternalCOV.g:783:1: ( ( rule__DomainSpecificCoverage__MetamodelAssignment_5 ) )
            {
            // InternalCOV.g:783:1: ( ( rule__DomainSpecificCoverage__MetamodelAssignment_5 ) )
            // InternalCOV.g:784:2: ( rule__DomainSpecificCoverage__MetamodelAssignment_5 )
            {
             before(grammarAccess.getDomainSpecificCoverageAccess().getMetamodelAssignment_5()); 
            // InternalCOV.g:785:2: ( rule__DomainSpecificCoverage__MetamodelAssignment_5 )
            // InternalCOV.g:785:3: rule__DomainSpecificCoverage__MetamodelAssignment_5
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
    // InternalCOV.g:793:1: rule__DomainSpecificCoverage__Group__6 : rule__DomainSpecificCoverage__Group__6__Impl rule__DomainSpecificCoverage__Group__7 ;
    public final void rule__DomainSpecificCoverage__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:797:1: ( rule__DomainSpecificCoverage__Group__6__Impl rule__DomainSpecificCoverage__Group__7 )
            // InternalCOV.g:798:2: rule__DomainSpecificCoverage__Group__6__Impl rule__DomainSpecificCoverage__Group__7
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
    // InternalCOV.g:805:1: rule__DomainSpecificCoverage__Group__6__Impl : ( ( rule__DomainSpecificCoverage__ContextsAssignment_6 ) ) ;
    public final void rule__DomainSpecificCoverage__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:809:1: ( ( ( rule__DomainSpecificCoverage__ContextsAssignment_6 ) ) )
            // InternalCOV.g:810:1: ( ( rule__DomainSpecificCoverage__ContextsAssignment_6 ) )
            {
            // InternalCOV.g:810:1: ( ( rule__DomainSpecificCoverage__ContextsAssignment_6 ) )
            // InternalCOV.g:811:2: ( rule__DomainSpecificCoverage__ContextsAssignment_6 )
            {
             before(grammarAccess.getDomainSpecificCoverageAccess().getContextsAssignment_6()); 
            // InternalCOV.g:812:2: ( rule__DomainSpecificCoverage__ContextsAssignment_6 )
            // InternalCOV.g:812:3: rule__DomainSpecificCoverage__ContextsAssignment_6
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
    // InternalCOV.g:820:1: rule__DomainSpecificCoverage__Group__7 : rule__DomainSpecificCoverage__Group__7__Impl rule__DomainSpecificCoverage__Group__8 ;
    public final void rule__DomainSpecificCoverage__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:824:1: ( rule__DomainSpecificCoverage__Group__7__Impl rule__DomainSpecificCoverage__Group__8 )
            // InternalCOV.g:825:2: rule__DomainSpecificCoverage__Group__7__Impl rule__DomainSpecificCoverage__Group__8
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
    // InternalCOV.g:832:1: rule__DomainSpecificCoverage__Group__7__Impl : ( ( rule__DomainSpecificCoverage__Group_7__0 )* ) ;
    public final void rule__DomainSpecificCoverage__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:836:1: ( ( ( rule__DomainSpecificCoverage__Group_7__0 )* ) )
            // InternalCOV.g:837:1: ( ( rule__DomainSpecificCoverage__Group_7__0 )* )
            {
            // InternalCOV.g:837:1: ( ( rule__DomainSpecificCoverage__Group_7__0 )* )
            // InternalCOV.g:838:2: ( rule__DomainSpecificCoverage__Group_7__0 )*
            {
             before(grammarAccess.getDomainSpecificCoverageAccess().getGroup_7()); 
            // InternalCOV.g:839:2: ( rule__DomainSpecificCoverage__Group_7__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==25) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalCOV.g:839:3: rule__DomainSpecificCoverage__Group_7__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__DomainSpecificCoverage__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // InternalCOV.g:847:1: rule__DomainSpecificCoverage__Group__8 : rule__DomainSpecificCoverage__Group__8__Impl ;
    public final void rule__DomainSpecificCoverage__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:851:1: ( rule__DomainSpecificCoverage__Group__8__Impl )
            // InternalCOV.g:852:2: rule__DomainSpecificCoverage__Group__8__Impl
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
    // InternalCOV.g:858:1: rule__DomainSpecificCoverage__Group__8__Impl : ( '}' ) ;
    public final void rule__DomainSpecificCoverage__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:862:1: ( ( '}' ) )
            // InternalCOV.g:863:1: ( '}' )
            {
            // InternalCOV.g:863:1: ( '}' )
            // InternalCOV.g:864:2: '}'
            {
             before(grammarAccess.getDomainSpecificCoverageAccess().getRightCurlyBracketKeyword_8()); 
            match(input,24,FOLLOW_2); 
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
    // InternalCOV.g:874:1: rule__DomainSpecificCoverage__Group_7__0 : rule__DomainSpecificCoverage__Group_7__0__Impl rule__DomainSpecificCoverage__Group_7__1 ;
    public final void rule__DomainSpecificCoverage__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:878:1: ( rule__DomainSpecificCoverage__Group_7__0__Impl rule__DomainSpecificCoverage__Group_7__1 )
            // InternalCOV.g:879:2: rule__DomainSpecificCoverage__Group_7__0__Impl rule__DomainSpecificCoverage__Group_7__1
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
    // InternalCOV.g:886:1: rule__DomainSpecificCoverage__Group_7__0__Impl : ( ',' ) ;
    public final void rule__DomainSpecificCoverage__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:890:1: ( ( ',' ) )
            // InternalCOV.g:891:1: ( ',' )
            {
            // InternalCOV.g:891:1: ( ',' )
            // InternalCOV.g:892:2: ','
            {
             before(grammarAccess.getDomainSpecificCoverageAccess().getCommaKeyword_7_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalCOV.g:901:1: rule__DomainSpecificCoverage__Group_7__1 : rule__DomainSpecificCoverage__Group_7__1__Impl ;
    public final void rule__DomainSpecificCoverage__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:905:1: ( rule__DomainSpecificCoverage__Group_7__1__Impl )
            // InternalCOV.g:906:2: rule__DomainSpecificCoverage__Group_7__1__Impl
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
    // InternalCOV.g:912:1: rule__DomainSpecificCoverage__Group_7__1__Impl : ( ( rule__DomainSpecificCoverage__ContextsAssignment_7_1 ) ) ;
    public final void rule__DomainSpecificCoverage__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:916:1: ( ( ( rule__DomainSpecificCoverage__ContextsAssignment_7_1 ) ) )
            // InternalCOV.g:917:1: ( ( rule__DomainSpecificCoverage__ContextsAssignment_7_1 ) )
            {
            // InternalCOV.g:917:1: ( ( rule__DomainSpecificCoverage__ContextsAssignment_7_1 ) )
            // InternalCOV.g:918:2: ( rule__DomainSpecificCoverage__ContextsAssignment_7_1 )
            {
             before(grammarAccess.getDomainSpecificCoverageAccess().getContextsAssignment_7_1()); 
            // InternalCOV.g:919:2: ( rule__DomainSpecificCoverage__ContextsAssignment_7_1 )
            // InternalCOV.g:919:3: rule__DomainSpecificCoverage__ContextsAssignment_7_1
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
    // InternalCOV.g:928:1: rule__Context__Group__0 : rule__Context__Group__0__Impl rule__Context__Group__1 ;
    public final void rule__Context__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:932:1: ( rule__Context__Group__0__Impl rule__Context__Group__1 )
            // InternalCOV.g:933:2: rule__Context__Group__0__Impl rule__Context__Group__1
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
    // InternalCOV.g:940:1: rule__Context__Group__0__Impl : ( 'context' ) ;
    public final void rule__Context__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:944:1: ( ( 'context' ) )
            // InternalCOV.g:945:1: ( 'context' )
            {
            // InternalCOV.g:945:1: ( 'context' )
            // InternalCOV.g:946:2: 'context'
            {
             before(grammarAccess.getContextAccess().getContextKeyword_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalCOV.g:955:1: rule__Context__Group__1 : rule__Context__Group__1__Impl rule__Context__Group__2 ;
    public final void rule__Context__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:959:1: ( rule__Context__Group__1__Impl rule__Context__Group__2 )
            // InternalCOV.g:960:2: rule__Context__Group__1__Impl rule__Context__Group__2
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
    // InternalCOV.g:967:1: rule__Context__Group__1__Impl : ( ( rule__Context__MetaclassAssignment_1 ) ) ;
    public final void rule__Context__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:971:1: ( ( ( rule__Context__MetaclassAssignment_1 ) ) )
            // InternalCOV.g:972:1: ( ( rule__Context__MetaclassAssignment_1 ) )
            {
            // InternalCOV.g:972:1: ( ( rule__Context__MetaclassAssignment_1 ) )
            // InternalCOV.g:973:2: ( rule__Context__MetaclassAssignment_1 )
            {
             before(grammarAccess.getContextAccess().getMetaclassAssignment_1()); 
            // InternalCOV.g:974:2: ( rule__Context__MetaclassAssignment_1 )
            // InternalCOV.g:974:3: rule__Context__MetaclassAssignment_1
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
    // InternalCOV.g:982:1: rule__Context__Group__2 : rule__Context__Group__2__Impl rule__Context__Group__3 ;
    public final void rule__Context__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:986:1: ( rule__Context__Group__2__Impl rule__Context__Group__3 )
            // InternalCOV.g:987:2: rule__Context__Group__2__Impl rule__Context__Group__3
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
    // InternalCOV.g:994:1: rule__Context__Group__2__Impl : ( '{' ) ;
    public final void rule__Context__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:998:1: ( ( '{' ) )
            // InternalCOV.g:999:1: ( '{' )
            {
            // InternalCOV.g:999:1: ( '{' )
            // InternalCOV.g:1000:2: '{'
            {
             before(grammarAccess.getContextAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,21,FOLLOW_2); 
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
    // InternalCOV.g:1009:1: rule__Context__Group__3 : rule__Context__Group__3__Impl rule__Context__Group__4 ;
    public final void rule__Context__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1013:1: ( rule__Context__Group__3__Impl rule__Context__Group__4 )
            // InternalCOV.g:1014:2: rule__Context__Group__3__Impl rule__Context__Group__4
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
    // InternalCOV.g:1021:1: rule__Context__Group__3__Impl : ( ( rule__Context__Group_3__0 )? ) ;
    public final void rule__Context__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1025:1: ( ( ( rule__Context__Group_3__0 )? ) )
            // InternalCOV.g:1026:1: ( ( rule__Context__Group_3__0 )? )
            {
            // InternalCOV.g:1026:1: ( ( rule__Context__Group_3__0 )? )
            // InternalCOV.g:1027:2: ( rule__Context__Group_3__0 )?
            {
             before(grammarAccess.getContextAccess().getGroup_3()); 
            // InternalCOV.g:1028:2: ( rule__Context__Group_3__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==27||(LA9_0>=33 && LA9_0<=35)||LA9_0==38) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalCOV.g:1028:3: rule__Context__Group_3__0
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
    // InternalCOV.g:1036:1: rule__Context__Group__4 : rule__Context__Group__4__Impl ;
    public final void rule__Context__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1040:1: ( rule__Context__Group__4__Impl )
            // InternalCOV.g:1041:2: rule__Context__Group__4__Impl
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
    // InternalCOV.g:1047:1: rule__Context__Group__4__Impl : ( '}' ) ;
    public final void rule__Context__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1051:1: ( ( '}' ) )
            // InternalCOV.g:1052:1: ( '}' )
            {
            // InternalCOV.g:1052:1: ( '}' )
            // InternalCOV.g:1053:2: '}'
            {
             before(grammarAccess.getContextAccess().getRightCurlyBracketKeyword_4()); 
            match(input,24,FOLLOW_2); 
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
    // InternalCOV.g:1063:1: rule__Context__Group_3__0 : rule__Context__Group_3__0__Impl rule__Context__Group_3__1 ;
    public final void rule__Context__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1067:1: ( rule__Context__Group_3__0__Impl rule__Context__Group_3__1 )
            // InternalCOV.g:1068:2: rule__Context__Group_3__0__Impl rule__Context__Group_3__1
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
    // InternalCOV.g:1075:1: rule__Context__Group_3__0__Impl : ( ( rule__Context__RulesAssignment_3_0 ) ) ;
    public final void rule__Context__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1079:1: ( ( ( rule__Context__RulesAssignment_3_0 ) ) )
            // InternalCOV.g:1080:1: ( ( rule__Context__RulesAssignment_3_0 ) )
            {
            // InternalCOV.g:1080:1: ( ( rule__Context__RulesAssignment_3_0 ) )
            // InternalCOV.g:1081:2: ( rule__Context__RulesAssignment_3_0 )
            {
             before(grammarAccess.getContextAccess().getRulesAssignment_3_0()); 
            // InternalCOV.g:1082:2: ( rule__Context__RulesAssignment_3_0 )
            // InternalCOV.g:1082:3: rule__Context__RulesAssignment_3_0
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
    // InternalCOV.g:1090:1: rule__Context__Group_3__1 : rule__Context__Group_3__1__Impl ;
    public final void rule__Context__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1094:1: ( rule__Context__Group_3__1__Impl )
            // InternalCOV.g:1095:2: rule__Context__Group_3__1__Impl
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
    // InternalCOV.g:1101:1: rule__Context__Group_3__1__Impl : ( ( rule__Context__Group_3_1__0 )* ) ;
    public final void rule__Context__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1105:1: ( ( ( rule__Context__Group_3_1__0 )* ) )
            // InternalCOV.g:1106:1: ( ( rule__Context__Group_3_1__0 )* )
            {
            // InternalCOV.g:1106:1: ( ( rule__Context__Group_3_1__0 )* )
            // InternalCOV.g:1107:2: ( rule__Context__Group_3_1__0 )*
            {
             before(grammarAccess.getContextAccess().getGroup_3_1()); 
            // InternalCOV.g:1108:2: ( rule__Context__Group_3_1__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==25) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalCOV.g:1108:3: rule__Context__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Context__Group_3_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // InternalCOV.g:1117:1: rule__Context__Group_3_1__0 : rule__Context__Group_3_1__0__Impl rule__Context__Group_3_1__1 ;
    public final void rule__Context__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1121:1: ( rule__Context__Group_3_1__0__Impl rule__Context__Group_3_1__1 )
            // InternalCOV.g:1122:2: rule__Context__Group_3_1__0__Impl rule__Context__Group_3_1__1
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
    // InternalCOV.g:1129:1: rule__Context__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__Context__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1133:1: ( ( ',' ) )
            // InternalCOV.g:1134:1: ( ',' )
            {
            // InternalCOV.g:1134:1: ( ',' )
            // InternalCOV.g:1135:2: ','
            {
             before(grammarAccess.getContextAccess().getCommaKeyword_3_1_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalCOV.g:1144:1: rule__Context__Group_3_1__1 : rule__Context__Group_3_1__1__Impl ;
    public final void rule__Context__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1148:1: ( rule__Context__Group_3_1__1__Impl )
            // InternalCOV.g:1149:2: rule__Context__Group_3_1__1__Impl
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
    // InternalCOV.g:1155:1: rule__Context__Group_3_1__1__Impl : ( ( rule__Context__RulesAssignment_3_1_1 ) ) ;
    public final void rule__Context__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1159:1: ( ( ( rule__Context__RulesAssignment_3_1_1 ) ) )
            // InternalCOV.g:1160:1: ( ( rule__Context__RulesAssignment_3_1_1 ) )
            {
            // InternalCOV.g:1160:1: ( ( rule__Context__RulesAssignment_3_1_1 ) )
            // InternalCOV.g:1161:2: ( rule__Context__RulesAssignment_3_1_1 )
            {
             before(grammarAccess.getContextAccess().getRulesAssignment_3_1_1()); 
            // InternalCOV.g:1162:2: ( rule__Context__RulesAssignment_3_1_1 )
            // InternalCOV.g:1162:3: rule__Context__RulesAssignment_3_1_1
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
    // InternalCOV.g:1171:1: rule__Ignore__Group__0 : rule__Ignore__Group__0__Impl rule__Ignore__Group__1 ;
    public final void rule__Ignore__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1175:1: ( rule__Ignore__Group__0__Impl rule__Ignore__Group__1 )
            // InternalCOV.g:1176:2: rule__Ignore__Group__0__Impl rule__Ignore__Group__1
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
    // InternalCOV.g:1183:1: rule__Ignore__Group__0__Impl : ( () ) ;
    public final void rule__Ignore__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1187:1: ( ( () ) )
            // InternalCOV.g:1188:1: ( () )
            {
            // InternalCOV.g:1188:1: ( () )
            // InternalCOV.g:1189:2: ()
            {
             before(grammarAccess.getIgnoreAccess().getIgnoreAction_0()); 
            // InternalCOV.g:1190:2: ()
            // InternalCOV.g:1190:3: 
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
    // InternalCOV.g:1198:1: rule__Ignore__Group__1 : rule__Ignore__Group__1__Impl rule__Ignore__Group__2 ;
    public final void rule__Ignore__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1202:1: ( rule__Ignore__Group__1__Impl rule__Ignore__Group__2 )
            // InternalCOV.g:1203:2: rule__Ignore__Group__1__Impl rule__Ignore__Group__2
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
    // InternalCOV.g:1210:1: rule__Ignore__Group__1__Impl : ( 'ignore' ) ;
    public final void rule__Ignore__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1214:1: ( ( 'ignore' ) )
            // InternalCOV.g:1215:1: ( 'ignore' )
            {
            // InternalCOV.g:1215:1: ( 'ignore' )
            // InternalCOV.g:1216:2: 'ignore'
            {
             before(grammarAccess.getIgnoreAccess().getIgnoreKeyword_1()); 
            match(input,27,FOLLOW_2); 
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
    // InternalCOV.g:1225:1: rule__Ignore__Group__2 : rule__Ignore__Group__2__Impl rule__Ignore__Group__3 ;
    public final void rule__Ignore__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1229:1: ( rule__Ignore__Group__2__Impl rule__Ignore__Group__3 )
            // InternalCOV.g:1230:2: rule__Ignore__Group__2__Impl rule__Ignore__Group__3
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
    // InternalCOV.g:1237:1: rule__Ignore__Group__2__Impl : ( '(' ) ;
    public final void rule__Ignore__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1241:1: ( ( '(' ) )
            // InternalCOV.g:1242:1: ( '(' )
            {
            // InternalCOV.g:1242:1: ( '(' )
            // InternalCOV.g:1243:2: '('
            {
             before(grammarAccess.getIgnoreAccess().getLeftParenthesisKeyword_2()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getIgnoreAccess().getLeftParenthesisKeyword_2()); 

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
    // InternalCOV.g:1252:1: rule__Ignore__Group__3 : rule__Ignore__Group__3__Impl rule__Ignore__Group__4 ;
    public final void rule__Ignore__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1256:1: ( rule__Ignore__Group__3__Impl rule__Ignore__Group__4 )
            // InternalCOV.g:1257:2: rule__Ignore__Group__3__Impl rule__Ignore__Group__4
            {
            pushFollow(FOLLOW_15);
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
    // InternalCOV.g:1264:1: rule__Ignore__Group__3__Impl : ( ( rule__Ignore__Group_3__0 )? ) ;
    public final void rule__Ignore__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1268:1: ( ( ( rule__Ignore__Group_3__0 )? ) )
            // InternalCOV.g:1269:1: ( ( rule__Ignore__Group_3__0 )? )
            {
            // InternalCOV.g:1269:1: ( ( rule__Ignore__Group_3__0 )? )
            // InternalCOV.g:1270:2: ( rule__Ignore__Group_3__0 )?
            {
             before(grammarAccess.getIgnoreAccess().getGroup_3()); 
            // InternalCOV.g:1271:2: ( rule__Ignore__Group_3__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==30) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalCOV.g:1271:3: rule__Ignore__Group_3__0
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
    // InternalCOV.g:1279:1: rule__Ignore__Group__4 : rule__Ignore__Group__4__Impl rule__Ignore__Group__5 ;
    public final void rule__Ignore__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1283:1: ( rule__Ignore__Group__4__Impl rule__Ignore__Group__5 )
            // InternalCOV.g:1284:2: rule__Ignore__Group__4__Impl rule__Ignore__Group__5
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
    // InternalCOV.g:1291:1: rule__Ignore__Group__4__Impl : ( ')' ) ;
    public final void rule__Ignore__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1295:1: ( ( ')' ) )
            // InternalCOV.g:1296:1: ( ')' )
            {
            // InternalCOV.g:1296:1: ( ')' )
            // InternalCOV.g:1297:2: ')'
            {
             before(grammarAccess.getIgnoreAccess().getRightParenthesisKeyword_4()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getIgnoreAccess().getRightParenthesisKeyword_4()); 

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
    // InternalCOV.g:1306:1: rule__Ignore__Group__5 : rule__Ignore__Group__5__Impl rule__Ignore__Group__6 ;
    public final void rule__Ignore__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1310:1: ( rule__Ignore__Group__5__Impl rule__Ignore__Group__6 )
            // InternalCOV.g:1311:2: rule__Ignore__Group__5__Impl rule__Ignore__Group__6
            {
            pushFollow(FOLLOW_16);
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
    // InternalCOV.g:1318:1: rule__Ignore__Group__5__Impl : ( ( rule__Ignore__Group_5__0 )? ) ;
    public final void rule__Ignore__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1322:1: ( ( ( rule__Ignore__Group_5__0 )? ) )
            // InternalCOV.g:1323:1: ( ( rule__Ignore__Group_5__0 )? )
            {
            // InternalCOV.g:1323:1: ( ( rule__Ignore__Group_5__0 )? )
            // InternalCOV.g:1324:2: ( rule__Ignore__Group_5__0 )?
            {
             before(grammarAccess.getIgnoreAccess().getGroup_5()); 
            // InternalCOV.g:1325:2: ( rule__Ignore__Group_5__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==31) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalCOV.g:1325:3: rule__Ignore__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Ignore__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIgnoreAccess().getGroup_5()); 

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
    // InternalCOV.g:1333:1: rule__Ignore__Group__6 : rule__Ignore__Group__6__Impl ;
    public final void rule__Ignore__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1337:1: ( rule__Ignore__Group__6__Impl )
            // InternalCOV.g:1338:2: rule__Ignore__Group__6__Impl
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
    // InternalCOV.g:1344:1: rule__Ignore__Group__6__Impl : ( ( rule__Ignore__Group_6__0 )? ) ;
    public final void rule__Ignore__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1348:1: ( ( ( rule__Ignore__Group_6__0 )? ) )
            // InternalCOV.g:1349:1: ( ( rule__Ignore__Group_6__0 )? )
            {
            // InternalCOV.g:1349:1: ( ( rule__Ignore__Group_6__0 )? )
            // InternalCOV.g:1350:2: ( rule__Ignore__Group_6__0 )?
            {
             before(grammarAccess.getIgnoreAccess().getGroup_6()); 
            // InternalCOV.g:1351:2: ( rule__Ignore__Group_6__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==32) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalCOV.g:1351:3: rule__Ignore__Group_6__0
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


    // $ANTLR start "rule__Ignore__Group_3__0"
    // InternalCOV.g:1360:1: rule__Ignore__Group_3__0 : rule__Ignore__Group_3__0__Impl rule__Ignore__Group_3__1 ;
    public final void rule__Ignore__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1364:1: ( rule__Ignore__Group_3__0__Impl rule__Ignore__Group_3__1 )
            // InternalCOV.g:1365:2: rule__Ignore__Group_3__0__Impl rule__Ignore__Group_3__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalCOV.g:1372:1: rule__Ignore__Group_3__0__Impl : ( 'subtypes' ) ;
    public final void rule__Ignore__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1376:1: ( ( 'subtypes' ) )
            // InternalCOV.g:1377:1: ( 'subtypes' )
            {
            // InternalCOV.g:1377:1: ( 'subtypes' )
            // InternalCOV.g:1378:2: 'subtypes'
            {
             before(grammarAccess.getIgnoreAccess().getSubtypesKeyword_3_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getIgnoreAccess().getSubtypesKeyword_3_0()); 

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
    // InternalCOV.g:1387:1: rule__Ignore__Group_3__1 : rule__Ignore__Group_3__1__Impl ;
    public final void rule__Ignore__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1391:1: ( rule__Ignore__Group_3__1__Impl )
            // InternalCOV.g:1392:2: rule__Ignore__Group_3__1__Impl
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
    // InternalCOV.g:1398:1: rule__Ignore__Group_3__1__Impl : ( ( rule__Ignore__IgnoreSubtypesAssignment_3_1 ) ) ;
    public final void rule__Ignore__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1402:1: ( ( ( rule__Ignore__IgnoreSubtypesAssignment_3_1 ) ) )
            // InternalCOV.g:1403:1: ( ( rule__Ignore__IgnoreSubtypesAssignment_3_1 ) )
            {
            // InternalCOV.g:1403:1: ( ( rule__Ignore__IgnoreSubtypesAssignment_3_1 ) )
            // InternalCOV.g:1404:2: ( rule__Ignore__IgnoreSubtypesAssignment_3_1 )
            {
             before(grammarAccess.getIgnoreAccess().getIgnoreSubtypesAssignment_3_1()); 
            // InternalCOV.g:1405:2: ( rule__Ignore__IgnoreSubtypesAssignment_3_1 )
            // InternalCOV.g:1405:3: rule__Ignore__IgnoreSubtypesAssignment_3_1
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


    // $ANTLR start "rule__Ignore__Group_5__0"
    // InternalCOV.g:1414:1: rule__Ignore__Group_5__0 : rule__Ignore__Group_5__0__Impl rule__Ignore__Group_5__1 ;
    public final void rule__Ignore__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1418:1: ( rule__Ignore__Group_5__0__Impl rule__Ignore__Group_5__1 )
            // InternalCOV.g:1419:2: rule__Ignore__Group_5__0__Impl rule__Ignore__Group_5__1
            {
            pushFollow(FOLLOW_3);
            rule__Ignore__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ignore__Group_5__1();

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
    // $ANTLR end "rule__Ignore__Group_5__0"


    // $ANTLR start "rule__Ignore__Group_5__0__Impl"
    // InternalCOV.g:1426:1: rule__Ignore__Group_5__0__Impl : ( 'description' ) ;
    public final void rule__Ignore__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1430:1: ( ( 'description' ) )
            // InternalCOV.g:1431:1: ( 'description' )
            {
            // InternalCOV.g:1431:1: ( 'description' )
            // InternalCOV.g:1432:2: 'description'
            {
             before(grammarAccess.getIgnoreAccess().getDescriptionKeyword_5_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getIgnoreAccess().getDescriptionKeyword_5_0()); 

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
    // $ANTLR end "rule__Ignore__Group_5__0__Impl"


    // $ANTLR start "rule__Ignore__Group_5__1"
    // InternalCOV.g:1441:1: rule__Ignore__Group_5__1 : rule__Ignore__Group_5__1__Impl ;
    public final void rule__Ignore__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1445:1: ( rule__Ignore__Group_5__1__Impl )
            // InternalCOV.g:1446:2: rule__Ignore__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Ignore__Group_5__1__Impl();

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
    // $ANTLR end "rule__Ignore__Group_5__1"


    // $ANTLR start "rule__Ignore__Group_5__1__Impl"
    // InternalCOV.g:1452:1: rule__Ignore__Group_5__1__Impl : ( ( rule__Ignore__DescriptionAssignment_5_1 ) ) ;
    public final void rule__Ignore__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1456:1: ( ( ( rule__Ignore__DescriptionAssignment_5_1 ) ) )
            // InternalCOV.g:1457:1: ( ( rule__Ignore__DescriptionAssignment_5_1 ) )
            {
            // InternalCOV.g:1457:1: ( ( rule__Ignore__DescriptionAssignment_5_1 ) )
            // InternalCOV.g:1458:2: ( rule__Ignore__DescriptionAssignment_5_1 )
            {
             before(grammarAccess.getIgnoreAccess().getDescriptionAssignment_5_1()); 
            // InternalCOV.g:1459:2: ( rule__Ignore__DescriptionAssignment_5_1 )
            // InternalCOV.g:1459:3: rule__Ignore__DescriptionAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Ignore__DescriptionAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getIgnoreAccess().getDescriptionAssignment_5_1()); 

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
    // $ANTLR end "rule__Ignore__Group_5__1__Impl"


    // $ANTLR start "rule__Ignore__Group_6__0"
    // InternalCOV.g:1468:1: rule__Ignore__Group_6__0 : rule__Ignore__Group_6__0__Impl rule__Ignore__Group_6__1 ;
    public final void rule__Ignore__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1472:1: ( rule__Ignore__Group_6__0__Impl rule__Ignore__Group_6__1 )
            // InternalCOV.g:1473:2: rule__Ignore__Group_6__0__Impl rule__Ignore__Group_6__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalCOV.g:1480:1: rule__Ignore__Group_6__0__Impl : ( 'condition' ) ;
    public final void rule__Ignore__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1484:1: ( ( 'condition' ) )
            // InternalCOV.g:1485:1: ( 'condition' )
            {
            // InternalCOV.g:1485:1: ( 'condition' )
            // InternalCOV.g:1486:2: 'condition'
            {
             before(grammarAccess.getIgnoreAccess().getConditionKeyword_6_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getIgnoreAccess().getConditionKeyword_6_0()); 

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
    // InternalCOV.g:1495:1: rule__Ignore__Group_6__1 : rule__Ignore__Group_6__1__Impl rule__Ignore__Group_6__2 ;
    public final void rule__Ignore__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1499:1: ( rule__Ignore__Group_6__1__Impl rule__Ignore__Group_6__2 )
            // InternalCOV.g:1500:2: rule__Ignore__Group_6__1__Impl rule__Ignore__Group_6__2
            {
            pushFollow(FOLLOW_18);
            rule__Ignore__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ignore__Group_6__2();

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
    // InternalCOV.g:1507:1: rule__Ignore__Group_6__1__Impl : ( ( rule__Ignore__ConditionAssignment_6_1 ) ) ;
    public final void rule__Ignore__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1511:1: ( ( ( rule__Ignore__ConditionAssignment_6_1 ) ) )
            // InternalCOV.g:1512:1: ( ( rule__Ignore__ConditionAssignment_6_1 ) )
            {
            // InternalCOV.g:1512:1: ( ( rule__Ignore__ConditionAssignment_6_1 ) )
            // InternalCOV.g:1513:2: ( rule__Ignore__ConditionAssignment_6_1 )
            {
             before(grammarAccess.getIgnoreAccess().getConditionAssignment_6_1()); 
            // InternalCOV.g:1514:2: ( rule__Ignore__ConditionAssignment_6_1 )
            // InternalCOV.g:1514:3: rule__Ignore__ConditionAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Ignore__ConditionAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getIgnoreAccess().getConditionAssignment_6_1()); 

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


    // $ANTLR start "rule__Ignore__Group_6__2"
    // InternalCOV.g:1522:1: rule__Ignore__Group_6__2 : rule__Ignore__Group_6__2__Impl ;
    public final void rule__Ignore__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1526:1: ( rule__Ignore__Group_6__2__Impl )
            // InternalCOV.g:1527:2: rule__Ignore__Group_6__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Ignore__Group_6__2__Impl();

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
    // $ANTLR end "rule__Ignore__Group_6__2"


    // $ANTLR start "rule__Ignore__Group_6__2__Impl"
    // InternalCOV.g:1533:1: rule__Ignore__Group_6__2__Impl : ( ( rule__Ignore__ConditionAssignment_6_2 )* ) ;
    public final void rule__Ignore__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1537:1: ( ( ( rule__Ignore__ConditionAssignment_6_2 )* ) )
            // InternalCOV.g:1538:1: ( ( rule__Ignore__ConditionAssignment_6_2 )* )
            {
            // InternalCOV.g:1538:1: ( ( rule__Ignore__ConditionAssignment_6_2 )* )
            // InternalCOV.g:1539:2: ( rule__Ignore__ConditionAssignment_6_2 )*
            {
             before(grammarAccess.getIgnoreAccess().getConditionAssignment_6_2()); 
            // InternalCOV.g:1540:2: ( rule__Ignore__ConditionAssignment_6_2 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=RULE_STRING && LA14_0<=RULE_ID)||LA14_0==11) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalCOV.g:1540:3: rule__Ignore__ConditionAssignment_6_2
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__Ignore__ConditionAssignment_6_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getIgnoreAccess().getConditionAssignment_6_2()); 

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
    // $ANTLR end "rule__Ignore__Group_6__2__Impl"


    // $ANTLR start "rule__LimitedIgnore__Group__0"
    // InternalCOV.g:1549:1: rule__LimitedIgnore__Group__0 : rule__LimitedIgnore__Group__0__Impl rule__LimitedIgnore__Group__1 ;
    public final void rule__LimitedIgnore__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1553:1: ( rule__LimitedIgnore__Group__0__Impl rule__LimitedIgnore__Group__1 )
            // InternalCOV.g:1554:2: rule__LimitedIgnore__Group__0__Impl rule__LimitedIgnore__Group__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalCOV.g:1561:1: rule__LimitedIgnore__Group__0__Impl : ( 'ignoreif' ) ;
    public final void rule__LimitedIgnore__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1565:1: ( ( 'ignoreif' ) )
            // InternalCOV.g:1566:1: ( 'ignoreif' )
            {
            // InternalCOV.g:1566:1: ( 'ignoreif' )
            // InternalCOV.g:1567:2: 'ignoreif'
            {
             before(grammarAccess.getLimitedIgnoreAccess().getIgnoreifKeyword_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getLimitedIgnoreAccess().getIgnoreifKeyword_0()); 

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
    // $ANTLR end "rule__LimitedIgnore__Group__0__Impl"


    // $ANTLR start "rule__LimitedIgnore__Group__1"
    // InternalCOV.g:1576:1: rule__LimitedIgnore__Group__1 : rule__LimitedIgnore__Group__1__Impl rule__LimitedIgnore__Group__2 ;
    public final void rule__LimitedIgnore__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1580:1: ( rule__LimitedIgnore__Group__1__Impl rule__LimitedIgnore__Group__2 )
            // InternalCOV.g:1581:2: rule__LimitedIgnore__Group__1__Impl rule__LimitedIgnore__Group__2
            {
            pushFollow(FOLLOW_3);
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
    // InternalCOV.g:1588:1: rule__LimitedIgnore__Group__1__Impl : ( ( rule__LimitedIgnore__TypeAssignment_1 ) ) ;
    public final void rule__LimitedIgnore__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1592:1: ( ( ( rule__LimitedIgnore__TypeAssignment_1 ) ) )
            // InternalCOV.g:1593:1: ( ( rule__LimitedIgnore__TypeAssignment_1 ) )
            {
            // InternalCOV.g:1593:1: ( ( rule__LimitedIgnore__TypeAssignment_1 ) )
            // InternalCOV.g:1594:2: ( rule__LimitedIgnore__TypeAssignment_1 )
            {
             before(grammarAccess.getLimitedIgnoreAccess().getTypeAssignment_1()); 
            // InternalCOV.g:1595:2: ( rule__LimitedIgnore__TypeAssignment_1 )
            // InternalCOV.g:1595:3: rule__LimitedIgnore__TypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__LimitedIgnore__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLimitedIgnoreAccess().getTypeAssignment_1()); 

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
    // InternalCOV.g:1603:1: rule__LimitedIgnore__Group__2 : rule__LimitedIgnore__Group__2__Impl rule__LimitedIgnore__Group__3 ;
    public final void rule__LimitedIgnore__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1607:1: ( rule__LimitedIgnore__Group__2__Impl rule__LimitedIgnore__Group__3 )
            // InternalCOV.g:1608:2: rule__LimitedIgnore__Group__2__Impl rule__LimitedIgnore__Group__3
            {
            pushFollow(FOLLOW_21);
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
    // InternalCOV.g:1615:1: rule__LimitedIgnore__Group__2__Impl : ( ( rule__LimitedIgnore__ContainerMetaclassAssignment_2 ) ) ;
    public final void rule__LimitedIgnore__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1619:1: ( ( ( rule__LimitedIgnore__ContainerMetaclassAssignment_2 ) ) )
            // InternalCOV.g:1620:1: ( ( rule__LimitedIgnore__ContainerMetaclassAssignment_2 ) )
            {
            // InternalCOV.g:1620:1: ( ( rule__LimitedIgnore__ContainerMetaclassAssignment_2 ) )
            // InternalCOV.g:1621:2: ( rule__LimitedIgnore__ContainerMetaclassAssignment_2 )
            {
             before(grammarAccess.getLimitedIgnoreAccess().getContainerMetaclassAssignment_2()); 
            // InternalCOV.g:1622:2: ( rule__LimitedIgnore__ContainerMetaclassAssignment_2 )
            // InternalCOV.g:1622:3: rule__LimitedIgnore__ContainerMetaclassAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__LimitedIgnore__ContainerMetaclassAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLimitedIgnoreAccess().getContainerMetaclassAssignment_2()); 

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
    // InternalCOV.g:1630:1: rule__LimitedIgnore__Group__3 : rule__LimitedIgnore__Group__3__Impl rule__LimitedIgnore__Group__4 ;
    public final void rule__LimitedIgnore__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1634:1: ( rule__LimitedIgnore__Group__3__Impl rule__LimitedIgnore__Group__4 )
            // InternalCOV.g:1635:2: rule__LimitedIgnore__Group__3__Impl rule__LimitedIgnore__Group__4
            {
            pushFollow(FOLLOW_21);
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
    // InternalCOV.g:1642:1: rule__LimitedIgnore__Group__3__Impl : ( ( rule__LimitedIgnore__Group_3__0 )* ) ;
    public final void rule__LimitedIgnore__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1646:1: ( ( ( rule__LimitedIgnore__Group_3__0 )* ) )
            // InternalCOV.g:1647:1: ( ( rule__LimitedIgnore__Group_3__0 )* )
            {
            // InternalCOV.g:1647:1: ( ( rule__LimitedIgnore__Group_3__0 )* )
            // InternalCOV.g:1648:2: ( rule__LimitedIgnore__Group_3__0 )*
            {
             before(grammarAccess.getLimitedIgnoreAccess().getGroup_3()); 
            // InternalCOV.g:1649:2: ( rule__LimitedIgnore__Group_3__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==25) ) {
                    int LA15_2 = input.LA(2);

                    if ( ((LA15_2>=RULE_STRING && LA15_2<=RULE_ID)) ) {
                        alt15=1;
                    }


                }


                switch (alt15) {
            	case 1 :
            	    // InternalCOV.g:1649:3: rule__LimitedIgnore__Group_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__LimitedIgnore__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getLimitedIgnoreAccess().getGroup_3()); 

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
    // InternalCOV.g:1657:1: rule__LimitedIgnore__Group__4 : rule__LimitedIgnore__Group__4__Impl rule__LimitedIgnore__Group__5 ;
    public final void rule__LimitedIgnore__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1661:1: ( rule__LimitedIgnore__Group__4__Impl rule__LimitedIgnore__Group__5 )
            // InternalCOV.g:1662:2: rule__LimitedIgnore__Group__4__Impl rule__LimitedIgnore__Group__5
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
    // InternalCOV.g:1669:1: rule__LimitedIgnore__Group__4__Impl : ( ( rule__LimitedIgnore__Group_4__0 )? ) ;
    public final void rule__LimitedIgnore__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1673:1: ( ( ( rule__LimitedIgnore__Group_4__0 )? ) )
            // InternalCOV.g:1674:1: ( ( rule__LimitedIgnore__Group_4__0 )? )
            {
            // InternalCOV.g:1674:1: ( ( rule__LimitedIgnore__Group_4__0 )? )
            // InternalCOV.g:1675:2: ( rule__LimitedIgnore__Group_4__0 )?
            {
             before(grammarAccess.getLimitedIgnoreAccess().getGroup_4()); 
            // InternalCOV.g:1676:2: ( rule__LimitedIgnore__Group_4__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==31) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalCOV.g:1676:3: rule__LimitedIgnore__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LimitedIgnore__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLimitedIgnoreAccess().getGroup_4()); 

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
    // InternalCOV.g:1684:1: rule__LimitedIgnore__Group__5 : rule__LimitedIgnore__Group__5__Impl ;
    public final void rule__LimitedIgnore__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1688:1: ( rule__LimitedIgnore__Group__5__Impl )
            // InternalCOV.g:1689:2: rule__LimitedIgnore__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LimitedIgnore__Group__5__Impl();

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
    // InternalCOV.g:1695:1: rule__LimitedIgnore__Group__5__Impl : ( ( rule__LimitedIgnore__Group_5__0 )? ) ;
    public final void rule__LimitedIgnore__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1699:1: ( ( ( rule__LimitedIgnore__Group_5__0 )? ) )
            // InternalCOV.g:1700:1: ( ( rule__LimitedIgnore__Group_5__0 )? )
            {
            // InternalCOV.g:1700:1: ( ( rule__LimitedIgnore__Group_5__0 )? )
            // InternalCOV.g:1701:2: ( rule__LimitedIgnore__Group_5__0 )?
            {
             before(grammarAccess.getLimitedIgnoreAccess().getGroup_5()); 
            // InternalCOV.g:1702:2: ( rule__LimitedIgnore__Group_5__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==32) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalCOV.g:1702:3: rule__LimitedIgnore__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LimitedIgnore__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

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


    // $ANTLR start "rule__LimitedIgnore__Group_3__0"
    // InternalCOV.g:1711:1: rule__LimitedIgnore__Group_3__0 : rule__LimitedIgnore__Group_3__0__Impl rule__LimitedIgnore__Group_3__1 ;
    public final void rule__LimitedIgnore__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1715:1: ( rule__LimitedIgnore__Group_3__0__Impl rule__LimitedIgnore__Group_3__1 )
            // InternalCOV.g:1716:2: rule__LimitedIgnore__Group_3__0__Impl rule__LimitedIgnore__Group_3__1
            {
            pushFollow(FOLLOW_3);
            rule__LimitedIgnore__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LimitedIgnore__Group_3__1();

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
    // $ANTLR end "rule__LimitedIgnore__Group_3__0"


    // $ANTLR start "rule__LimitedIgnore__Group_3__0__Impl"
    // InternalCOV.g:1723:1: rule__LimitedIgnore__Group_3__0__Impl : ( ',' ) ;
    public final void rule__LimitedIgnore__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1727:1: ( ( ',' ) )
            // InternalCOV.g:1728:1: ( ',' )
            {
            // InternalCOV.g:1728:1: ( ',' )
            // InternalCOV.g:1729:2: ','
            {
             before(grammarAccess.getLimitedIgnoreAccess().getCommaKeyword_3_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getLimitedIgnoreAccess().getCommaKeyword_3_0()); 

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
    // $ANTLR end "rule__LimitedIgnore__Group_3__0__Impl"


    // $ANTLR start "rule__LimitedIgnore__Group_3__1"
    // InternalCOV.g:1738:1: rule__LimitedIgnore__Group_3__1 : rule__LimitedIgnore__Group_3__1__Impl ;
    public final void rule__LimitedIgnore__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1742:1: ( rule__LimitedIgnore__Group_3__1__Impl )
            // InternalCOV.g:1743:2: rule__LimitedIgnore__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LimitedIgnore__Group_3__1__Impl();

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
    // $ANTLR end "rule__LimitedIgnore__Group_3__1"


    // $ANTLR start "rule__LimitedIgnore__Group_3__1__Impl"
    // InternalCOV.g:1749:1: rule__LimitedIgnore__Group_3__1__Impl : ( ( rule__LimitedIgnore__ContainerMetaclassAssignment_3_1 ) ) ;
    public final void rule__LimitedIgnore__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1753:1: ( ( ( rule__LimitedIgnore__ContainerMetaclassAssignment_3_1 ) ) )
            // InternalCOV.g:1754:1: ( ( rule__LimitedIgnore__ContainerMetaclassAssignment_3_1 ) )
            {
            // InternalCOV.g:1754:1: ( ( rule__LimitedIgnore__ContainerMetaclassAssignment_3_1 ) )
            // InternalCOV.g:1755:2: ( rule__LimitedIgnore__ContainerMetaclassAssignment_3_1 )
            {
             before(grammarAccess.getLimitedIgnoreAccess().getContainerMetaclassAssignment_3_1()); 
            // InternalCOV.g:1756:2: ( rule__LimitedIgnore__ContainerMetaclassAssignment_3_1 )
            // InternalCOV.g:1756:3: rule__LimitedIgnore__ContainerMetaclassAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__LimitedIgnore__ContainerMetaclassAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getLimitedIgnoreAccess().getContainerMetaclassAssignment_3_1()); 

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
    // $ANTLR end "rule__LimitedIgnore__Group_3__1__Impl"


    // $ANTLR start "rule__LimitedIgnore__Group_4__0"
    // InternalCOV.g:1765:1: rule__LimitedIgnore__Group_4__0 : rule__LimitedIgnore__Group_4__0__Impl rule__LimitedIgnore__Group_4__1 ;
    public final void rule__LimitedIgnore__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1769:1: ( rule__LimitedIgnore__Group_4__0__Impl rule__LimitedIgnore__Group_4__1 )
            // InternalCOV.g:1770:2: rule__LimitedIgnore__Group_4__0__Impl rule__LimitedIgnore__Group_4__1
            {
            pushFollow(FOLLOW_3);
            rule__LimitedIgnore__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LimitedIgnore__Group_4__1();

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
    // $ANTLR end "rule__LimitedIgnore__Group_4__0"


    // $ANTLR start "rule__LimitedIgnore__Group_4__0__Impl"
    // InternalCOV.g:1777:1: rule__LimitedIgnore__Group_4__0__Impl : ( 'description' ) ;
    public final void rule__LimitedIgnore__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1781:1: ( ( 'description' ) )
            // InternalCOV.g:1782:1: ( 'description' )
            {
            // InternalCOV.g:1782:1: ( 'description' )
            // InternalCOV.g:1783:2: 'description'
            {
             before(grammarAccess.getLimitedIgnoreAccess().getDescriptionKeyword_4_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getLimitedIgnoreAccess().getDescriptionKeyword_4_0()); 

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
    // $ANTLR end "rule__LimitedIgnore__Group_4__0__Impl"


    // $ANTLR start "rule__LimitedIgnore__Group_4__1"
    // InternalCOV.g:1792:1: rule__LimitedIgnore__Group_4__1 : rule__LimitedIgnore__Group_4__1__Impl ;
    public final void rule__LimitedIgnore__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1796:1: ( rule__LimitedIgnore__Group_4__1__Impl )
            // InternalCOV.g:1797:2: rule__LimitedIgnore__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LimitedIgnore__Group_4__1__Impl();

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
    // $ANTLR end "rule__LimitedIgnore__Group_4__1"


    // $ANTLR start "rule__LimitedIgnore__Group_4__1__Impl"
    // InternalCOV.g:1803:1: rule__LimitedIgnore__Group_4__1__Impl : ( ( rule__LimitedIgnore__DescriptionAssignment_4_1 ) ) ;
    public final void rule__LimitedIgnore__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1807:1: ( ( ( rule__LimitedIgnore__DescriptionAssignment_4_1 ) ) )
            // InternalCOV.g:1808:1: ( ( rule__LimitedIgnore__DescriptionAssignment_4_1 ) )
            {
            // InternalCOV.g:1808:1: ( ( rule__LimitedIgnore__DescriptionAssignment_4_1 ) )
            // InternalCOV.g:1809:2: ( rule__LimitedIgnore__DescriptionAssignment_4_1 )
            {
             before(grammarAccess.getLimitedIgnoreAccess().getDescriptionAssignment_4_1()); 
            // InternalCOV.g:1810:2: ( rule__LimitedIgnore__DescriptionAssignment_4_1 )
            // InternalCOV.g:1810:3: rule__LimitedIgnore__DescriptionAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__LimitedIgnore__DescriptionAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getLimitedIgnoreAccess().getDescriptionAssignment_4_1()); 

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
    // $ANTLR end "rule__LimitedIgnore__Group_4__1__Impl"


    // $ANTLR start "rule__LimitedIgnore__Group_5__0"
    // InternalCOV.g:1819:1: rule__LimitedIgnore__Group_5__0 : rule__LimitedIgnore__Group_5__0__Impl rule__LimitedIgnore__Group_5__1 ;
    public final void rule__LimitedIgnore__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1823:1: ( rule__LimitedIgnore__Group_5__0__Impl rule__LimitedIgnore__Group_5__1 )
            // InternalCOV.g:1824:2: rule__LimitedIgnore__Group_5__0__Impl rule__LimitedIgnore__Group_5__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalCOV.g:1831:1: rule__LimitedIgnore__Group_5__0__Impl : ( 'condition' ) ;
    public final void rule__LimitedIgnore__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1835:1: ( ( 'condition' ) )
            // InternalCOV.g:1836:1: ( 'condition' )
            {
            // InternalCOV.g:1836:1: ( 'condition' )
            // InternalCOV.g:1837:2: 'condition'
            {
             before(grammarAccess.getLimitedIgnoreAccess().getConditionKeyword_5_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getLimitedIgnoreAccess().getConditionKeyword_5_0()); 

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
    // InternalCOV.g:1846:1: rule__LimitedIgnore__Group_5__1 : rule__LimitedIgnore__Group_5__1__Impl rule__LimitedIgnore__Group_5__2 ;
    public final void rule__LimitedIgnore__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1850:1: ( rule__LimitedIgnore__Group_5__1__Impl rule__LimitedIgnore__Group_5__2 )
            // InternalCOV.g:1851:2: rule__LimitedIgnore__Group_5__1__Impl rule__LimitedIgnore__Group_5__2
            {
            pushFollow(FOLLOW_18);
            rule__LimitedIgnore__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LimitedIgnore__Group_5__2();

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
    // InternalCOV.g:1858:1: rule__LimitedIgnore__Group_5__1__Impl : ( ( rule__LimitedIgnore__ConditionAssignment_5_1 ) ) ;
    public final void rule__LimitedIgnore__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1862:1: ( ( ( rule__LimitedIgnore__ConditionAssignment_5_1 ) ) )
            // InternalCOV.g:1863:1: ( ( rule__LimitedIgnore__ConditionAssignment_5_1 ) )
            {
            // InternalCOV.g:1863:1: ( ( rule__LimitedIgnore__ConditionAssignment_5_1 ) )
            // InternalCOV.g:1864:2: ( rule__LimitedIgnore__ConditionAssignment_5_1 )
            {
             before(grammarAccess.getLimitedIgnoreAccess().getConditionAssignment_5_1()); 
            // InternalCOV.g:1865:2: ( rule__LimitedIgnore__ConditionAssignment_5_1 )
            // InternalCOV.g:1865:3: rule__LimitedIgnore__ConditionAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__LimitedIgnore__ConditionAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getLimitedIgnoreAccess().getConditionAssignment_5_1()); 

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


    // $ANTLR start "rule__LimitedIgnore__Group_5__2"
    // InternalCOV.g:1873:1: rule__LimitedIgnore__Group_5__2 : rule__LimitedIgnore__Group_5__2__Impl ;
    public final void rule__LimitedIgnore__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1877:1: ( rule__LimitedIgnore__Group_5__2__Impl )
            // InternalCOV.g:1878:2: rule__LimitedIgnore__Group_5__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LimitedIgnore__Group_5__2__Impl();

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
    // $ANTLR end "rule__LimitedIgnore__Group_5__2"


    // $ANTLR start "rule__LimitedIgnore__Group_5__2__Impl"
    // InternalCOV.g:1884:1: rule__LimitedIgnore__Group_5__2__Impl : ( ( rule__LimitedIgnore__ConditionAssignment_5_2 )* ) ;
    public final void rule__LimitedIgnore__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1888:1: ( ( ( rule__LimitedIgnore__ConditionAssignment_5_2 )* ) )
            // InternalCOV.g:1889:1: ( ( rule__LimitedIgnore__ConditionAssignment_5_2 )* )
            {
            // InternalCOV.g:1889:1: ( ( rule__LimitedIgnore__ConditionAssignment_5_2 )* )
            // InternalCOV.g:1890:2: ( rule__LimitedIgnore__ConditionAssignment_5_2 )*
            {
             before(grammarAccess.getLimitedIgnoreAccess().getConditionAssignment_5_2()); 
            // InternalCOV.g:1891:2: ( rule__LimitedIgnore__ConditionAssignment_5_2 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=RULE_STRING && LA18_0<=RULE_ID)||LA18_0==11) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalCOV.g:1891:3: rule__LimitedIgnore__ConditionAssignment_5_2
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__LimitedIgnore__ConditionAssignment_5_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getLimitedIgnoreAccess().getConditionAssignment_5_2()); 

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
    // $ANTLR end "rule__LimitedIgnore__Group_5__2__Impl"


    // $ANTLR start "rule__CoverageOfReferenced__Group__0"
    // InternalCOV.g:1900:1: rule__CoverageOfReferenced__Group__0 : rule__CoverageOfReferenced__Group__0__Impl rule__CoverageOfReferenced__Group__1 ;
    public final void rule__CoverageOfReferenced__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1904:1: ( rule__CoverageOfReferenced__Group__0__Impl rule__CoverageOfReferenced__Group__1 )
            // InternalCOV.g:1905:2: rule__CoverageOfReferenced__Group__0__Impl rule__CoverageOfReferenced__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalCOV.g:1912:1: rule__CoverageOfReferenced__Group__0__Impl : ( 'covers' ) ;
    public final void rule__CoverageOfReferenced__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1916:1: ( ( 'covers' ) )
            // InternalCOV.g:1917:1: ( 'covers' )
            {
            // InternalCOV.g:1917:1: ( 'covers' )
            // InternalCOV.g:1918:2: 'covers'
            {
             before(grammarAccess.getCoverageOfReferencedAccess().getCoversKeyword_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getCoverageOfReferencedAccess().getCoversKeyword_0()); 

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
    // InternalCOV.g:1927:1: rule__CoverageOfReferenced__Group__1 : rule__CoverageOfReferenced__Group__1__Impl rule__CoverageOfReferenced__Group__2 ;
    public final void rule__CoverageOfReferenced__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1931:1: ( rule__CoverageOfReferenced__Group__1__Impl rule__CoverageOfReferenced__Group__2 )
            // InternalCOV.g:1932:2: rule__CoverageOfReferenced__Group__1__Impl rule__CoverageOfReferenced__Group__2
            {
            pushFollow(FOLLOW_21);
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
    // InternalCOV.g:1939:1: rule__CoverageOfReferenced__Group__1__Impl : ( ( rule__CoverageOfReferenced__ReferenceAssignment_1 ) ) ;
    public final void rule__CoverageOfReferenced__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1943:1: ( ( ( rule__CoverageOfReferenced__ReferenceAssignment_1 ) ) )
            // InternalCOV.g:1944:1: ( ( rule__CoverageOfReferenced__ReferenceAssignment_1 ) )
            {
            // InternalCOV.g:1944:1: ( ( rule__CoverageOfReferenced__ReferenceAssignment_1 ) )
            // InternalCOV.g:1945:2: ( rule__CoverageOfReferenced__ReferenceAssignment_1 )
            {
             before(grammarAccess.getCoverageOfReferencedAccess().getReferenceAssignment_1()); 
            // InternalCOV.g:1946:2: ( rule__CoverageOfReferenced__ReferenceAssignment_1 )
            // InternalCOV.g:1946:3: rule__CoverageOfReferenced__ReferenceAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__CoverageOfReferenced__ReferenceAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCoverageOfReferencedAccess().getReferenceAssignment_1()); 

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
    // InternalCOV.g:1954:1: rule__CoverageOfReferenced__Group__2 : rule__CoverageOfReferenced__Group__2__Impl rule__CoverageOfReferenced__Group__3 ;
    public final void rule__CoverageOfReferenced__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1958:1: ( rule__CoverageOfReferenced__Group__2__Impl rule__CoverageOfReferenced__Group__3 )
            // InternalCOV.g:1959:2: rule__CoverageOfReferenced__Group__2__Impl rule__CoverageOfReferenced__Group__3
            {
            pushFollow(FOLLOW_21);
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
    // InternalCOV.g:1966:1: rule__CoverageOfReferenced__Group__2__Impl : ( ( rule__CoverageOfReferenced__Group_2__0 )* ) ;
    public final void rule__CoverageOfReferenced__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1970:1: ( ( ( rule__CoverageOfReferenced__Group_2__0 )* ) )
            // InternalCOV.g:1971:1: ( ( rule__CoverageOfReferenced__Group_2__0 )* )
            {
            // InternalCOV.g:1971:1: ( ( rule__CoverageOfReferenced__Group_2__0 )* )
            // InternalCOV.g:1972:2: ( rule__CoverageOfReferenced__Group_2__0 )*
            {
             before(grammarAccess.getCoverageOfReferencedAccess().getGroup_2()); 
            // InternalCOV.g:1973:2: ( rule__CoverageOfReferenced__Group_2__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==25) ) {
                    int LA19_2 = input.LA(2);

                    if ( ((LA19_2>=RULE_STRING && LA19_2<=RULE_ID)) ) {
                        alt19=1;
                    }


                }


                switch (alt19) {
            	case 1 :
            	    // InternalCOV.g:1973:3: rule__CoverageOfReferenced__Group_2__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__CoverageOfReferenced__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getCoverageOfReferencedAccess().getGroup_2()); 

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
    // InternalCOV.g:1981:1: rule__CoverageOfReferenced__Group__3 : rule__CoverageOfReferenced__Group__3__Impl rule__CoverageOfReferenced__Group__4 ;
    public final void rule__CoverageOfReferenced__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1985:1: ( rule__CoverageOfReferenced__Group__3__Impl rule__CoverageOfReferenced__Group__4 )
            // InternalCOV.g:1986:2: rule__CoverageOfReferenced__Group__3__Impl rule__CoverageOfReferenced__Group__4
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
    // InternalCOV.g:1993:1: rule__CoverageOfReferenced__Group__3__Impl : ( ( rule__CoverageOfReferenced__Group_3__0 )? ) ;
    public final void rule__CoverageOfReferenced__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1997:1: ( ( ( rule__CoverageOfReferenced__Group_3__0 )? ) )
            // InternalCOV.g:1998:1: ( ( rule__CoverageOfReferenced__Group_3__0 )? )
            {
            // InternalCOV.g:1998:1: ( ( rule__CoverageOfReferenced__Group_3__0 )? )
            // InternalCOV.g:1999:2: ( rule__CoverageOfReferenced__Group_3__0 )?
            {
             before(grammarAccess.getCoverageOfReferencedAccess().getGroup_3()); 
            // InternalCOV.g:2000:2: ( rule__CoverageOfReferenced__Group_3__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==31) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalCOV.g:2000:3: rule__CoverageOfReferenced__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CoverageOfReferenced__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCoverageOfReferencedAccess().getGroup_3()); 

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
    // InternalCOV.g:2008:1: rule__CoverageOfReferenced__Group__4 : rule__CoverageOfReferenced__Group__4__Impl ;
    public final void rule__CoverageOfReferenced__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2012:1: ( rule__CoverageOfReferenced__Group__4__Impl )
            // InternalCOV.g:2013:2: rule__CoverageOfReferenced__Group__4__Impl
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
    // InternalCOV.g:2019:1: rule__CoverageOfReferenced__Group__4__Impl : ( ( rule__CoverageOfReferenced__Group_4__0 )? ) ;
    public final void rule__CoverageOfReferenced__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2023:1: ( ( ( rule__CoverageOfReferenced__Group_4__0 )? ) )
            // InternalCOV.g:2024:1: ( ( rule__CoverageOfReferenced__Group_4__0 )? )
            {
            // InternalCOV.g:2024:1: ( ( rule__CoverageOfReferenced__Group_4__0 )? )
            // InternalCOV.g:2025:2: ( rule__CoverageOfReferenced__Group_4__0 )?
            {
             before(grammarAccess.getCoverageOfReferencedAccess().getGroup_4()); 
            // InternalCOV.g:2026:2: ( rule__CoverageOfReferenced__Group_4__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==32) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalCOV.g:2026:3: rule__CoverageOfReferenced__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CoverageOfReferenced__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

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


    // $ANTLR start "rule__CoverageOfReferenced__Group_2__0"
    // InternalCOV.g:2035:1: rule__CoverageOfReferenced__Group_2__0 : rule__CoverageOfReferenced__Group_2__0__Impl rule__CoverageOfReferenced__Group_2__1 ;
    public final void rule__CoverageOfReferenced__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2039:1: ( rule__CoverageOfReferenced__Group_2__0__Impl rule__CoverageOfReferenced__Group_2__1 )
            // InternalCOV.g:2040:2: rule__CoverageOfReferenced__Group_2__0__Impl rule__CoverageOfReferenced__Group_2__1
            {
            pushFollow(FOLLOW_3);
            rule__CoverageOfReferenced__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CoverageOfReferenced__Group_2__1();

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
    // $ANTLR end "rule__CoverageOfReferenced__Group_2__0"


    // $ANTLR start "rule__CoverageOfReferenced__Group_2__0__Impl"
    // InternalCOV.g:2047:1: rule__CoverageOfReferenced__Group_2__0__Impl : ( ',' ) ;
    public final void rule__CoverageOfReferenced__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2051:1: ( ( ',' ) )
            // InternalCOV.g:2052:1: ( ',' )
            {
            // InternalCOV.g:2052:1: ( ',' )
            // InternalCOV.g:2053:2: ','
            {
             before(grammarAccess.getCoverageOfReferencedAccess().getCommaKeyword_2_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getCoverageOfReferencedAccess().getCommaKeyword_2_0()); 

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
    // $ANTLR end "rule__CoverageOfReferenced__Group_2__0__Impl"


    // $ANTLR start "rule__CoverageOfReferenced__Group_2__1"
    // InternalCOV.g:2062:1: rule__CoverageOfReferenced__Group_2__1 : rule__CoverageOfReferenced__Group_2__1__Impl ;
    public final void rule__CoverageOfReferenced__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2066:1: ( rule__CoverageOfReferenced__Group_2__1__Impl )
            // InternalCOV.g:2067:2: rule__CoverageOfReferenced__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CoverageOfReferenced__Group_2__1__Impl();

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
    // $ANTLR end "rule__CoverageOfReferenced__Group_2__1"


    // $ANTLR start "rule__CoverageOfReferenced__Group_2__1__Impl"
    // InternalCOV.g:2073:1: rule__CoverageOfReferenced__Group_2__1__Impl : ( ( rule__CoverageOfReferenced__ReferenceAssignment_2_1 ) ) ;
    public final void rule__CoverageOfReferenced__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2077:1: ( ( ( rule__CoverageOfReferenced__ReferenceAssignment_2_1 ) ) )
            // InternalCOV.g:2078:1: ( ( rule__CoverageOfReferenced__ReferenceAssignment_2_1 ) )
            {
            // InternalCOV.g:2078:1: ( ( rule__CoverageOfReferenced__ReferenceAssignment_2_1 ) )
            // InternalCOV.g:2079:2: ( rule__CoverageOfReferenced__ReferenceAssignment_2_1 )
            {
             before(grammarAccess.getCoverageOfReferencedAccess().getReferenceAssignment_2_1()); 
            // InternalCOV.g:2080:2: ( rule__CoverageOfReferenced__ReferenceAssignment_2_1 )
            // InternalCOV.g:2080:3: rule__CoverageOfReferenced__ReferenceAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__CoverageOfReferenced__ReferenceAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getCoverageOfReferencedAccess().getReferenceAssignment_2_1()); 

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
    // $ANTLR end "rule__CoverageOfReferenced__Group_2__1__Impl"


    // $ANTLR start "rule__CoverageOfReferenced__Group_3__0"
    // InternalCOV.g:2089:1: rule__CoverageOfReferenced__Group_3__0 : rule__CoverageOfReferenced__Group_3__0__Impl rule__CoverageOfReferenced__Group_3__1 ;
    public final void rule__CoverageOfReferenced__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2093:1: ( rule__CoverageOfReferenced__Group_3__0__Impl rule__CoverageOfReferenced__Group_3__1 )
            // InternalCOV.g:2094:2: rule__CoverageOfReferenced__Group_3__0__Impl rule__CoverageOfReferenced__Group_3__1
            {
            pushFollow(FOLLOW_3);
            rule__CoverageOfReferenced__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CoverageOfReferenced__Group_3__1();

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
    // $ANTLR end "rule__CoverageOfReferenced__Group_3__0"


    // $ANTLR start "rule__CoverageOfReferenced__Group_3__0__Impl"
    // InternalCOV.g:2101:1: rule__CoverageOfReferenced__Group_3__0__Impl : ( 'description' ) ;
    public final void rule__CoverageOfReferenced__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2105:1: ( ( 'description' ) )
            // InternalCOV.g:2106:1: ( 'description' )
            {
            // InternalCOV.g:2106:1: ( 'description' )
            // InternalCOV.g:2107:2: 'description'
            {
             before(grammarAccess.getCoverageOfReferencedAccess().getDescriptionKeyword_3_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getCoverageOfReferencedAccess().getDescriptionKeyword_3_0()); 

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
    // $ANTLR end "rule__CoverageOfReferenced__Group_3__0__Impl"


    // $ANTLR start "rule__CoverageOfReferenced__Group_3__1"
    // InternalCOV.g:2116:1: rule__CoverageOfReferenced__Group_3__1 : rule__CoverageOfReferenced__Group_3__1__Impl ;
    public final void rule__CoverageOfReferenced__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2120:1: ( rule__CoverageOfReferenced__Group_3__1__Impl )
            // InternalCOV.g:2121:2: rule__CoverageOfReferenced__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CoverageOfReferenced__Group_3__1__Impl();

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
    // $ANTLR end "rule__CoverageOfReferenced__Group_3__1"


    // $ANTLR start "rule__CoverageOfReferenced__Group_3__1__Impl"
    // InternalCOV.g:2127:1: rule__CoverageOfReferenced__Group_3__1__Impl : ( ( rule__CoverageOfReferenced__DescriptionAssignment_3_1 ) ) ;
    public final void rule__CoverageOfReferenced__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2131:1: ( ( ( rule__CoverageOfReferenced__DescriptionAssignment_3_1 ) ) )
            // InternalCOV.g:2132:1: ( ( rule__CoverageOfReferenced__DescriptionAssignment_3_1 ) )
            {
            // InternalCOV.g:2132:1: ( ( rule__CoverageOfReferenced__DescriptionAssignment_3_1 ) )
            // InternalCOV.g:2133:2: ( rule__CoverageOfReferenced__DescriptionAssignment_3_1 )
            {
             before(grammarAccess.getCoverageOfReferencedAccess().getDescriptionAssignment_3_1()); 
            // InternalCOV.g:2134:2: ( rule__CoverageOfReferenced__DescriptionAssignment_3_1 )
            // InternalCOV.g:2134:3: rule__CoverageOfReferenced__DescriptionAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__CoverageOfReferenced__DescriptionAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getCoverageOfReferencedAccess().getDescriptionAssignment_3_1()); 

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
    // $ANTLR end "rule__CoverageOfReferenced__Group_3__1__Impl"


    // $ANTLR start "rule__CoverageOfReferenced__Group_4__0"
    // InternalCOV.g:2143:1: rule__CoverageOfReferenced__Group_4__0 : rule__CoverageOfReferenced__Group_4__0__Impl rule__CoverageOfReferenced__Group_4__1 ;
    public final void rule__CoverageOfReferenced__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2147:1: ( rule__CoverageOfReferenced__Group_4__0__Impl rule__CoverageOfReferenced__Group_4__1 )
            // InternalCOV.g:2148:2: rule__CoverageOfReferenced__Group_4__0__Impl rule__CoverageOfReferenced__Group_4__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalCOV.g:2155:1: rule__CoverageOfReferenced__Group_4__0__Impl : ( 'condition' ) ;
    public final void rule__CoverageOfReferenced__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2159:1: ( ( 'condition' ) )
            // InternalCOV.g:2160:1: ( 'condition' )
            {
            // InternalCOV.g:2160:1: ( 'condition' )
            // InternalCOV.g:2161:2: 'condition'
            {
             before(grammarAccess.getCoverageOfReferencedAccess().getConditionKeyword_4_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getCoverageOfReferencedAccess().getConditionKeyword_4_0()); 

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
    // InternalCOV.g:2170:1: rule__CoverageOfReferenced__Group_4__1 : rule__CoverageOfReferenced__Group_4__1__Impl rule__CoverageOfReferenced__Group_4__2 ;
    public final void rule__CoverageOfReferenced__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2174:1: ( rule__CoverageOfReferenced__Group_4__1__Impl rule__CoverageOfReferenced__Group_4__2 )
            // InternalCOV.g:2175:2: rule__CoverageOfReferenced__Group_4__1__Impl rule__CoverageOfReferenced__Group_4__2
            {
            pushFollow(FOLLOW_18);
            rule__CoverageOfReferenced__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CoverageOfReferenced__Group_4__2();

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
    // InternalCOV.g:2182:1: rule__CoverageOfReferenced__Group_4__1__Impl : ( ( rule__CoverageOfReferenced__ConditionAssignment_4_1 ) ) ;
    public final void rule__CoverageOfReferenced__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2186:1: ( ( ( rule__CoverageOfReferenced__ConditionAssignment_4_1 ) ) )
            // InternalCOV.g:2187:1: ( ( rule__CoverageOfReferenced__ConditionAssignment_4_1 ) )
            {
            // InternalCOV.g:2187:1: ( ( rule__CoverageOfReferenced__ConditionAssignment_4_1 ) )
            // InternalCOV.g:2188:2: ( rule__CoverageOfReferenced__ConditionAssignment_4_1 )
            {
             before(grammarAccess.getCoverageOfReferencedAccess().getConditionAssignment_4_1()); 
            // InternalCOV.g:2189:2: ( rule__CoverageOfReferenced__ConditionAssignment_4_1 )
            // InternalCOV.g:2189:3: rule__CoverageOfReferenced__ConditionAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__CoverageOfReferenced__ConditionAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getCoverageOfReferencedAccess().getConditionAssignment_4_1()); 

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


    // $ANTLR start "rule__CoverageOfReferenced__Group_4__2"
    // InternalCOV.g:2197:1: rule__CoverageOfReferenced__Group_4__2 : rule__CoverageOfReferenced__Group_4__2__Impl ;
    public final void rule__CoverageOfReferenced__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2201:1: ( rule__CoverageOfReferenced__Group_4__2__Impl )
            // InternalCOV.g:2202:2: rule__CoverageOfReferenced__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CoverageOfReferenced__Group_4__2__Impl();

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
    // $ANTLR end "rule__CoverageOfReferenced__Group_4__2"


    // $ANTLR start "rule__CoverageOfReferenced__Group_4__2__Impl"
    // InternalCOV.g:2208:1: rule__CoverageOfReferenced__Group_4__2__Impl : ( ( rule__CoverageOfReferenced__ConditionAssignment_4_2 )* ) ;
    public final void rule__CoverageOfReferenced__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2212:1: ( ( ( rule__CoverageOfReferenced__ConditionAssignment_4_2 )* ) )
            // InternalCOV.g:2213:1: ( ( rule__CoverageOfReferenced__ConditionAssignment_4_2 )* )
            {
            // InternalCOV.g:2213:1: ( ( rule__CoverageOfReferenced__ConditionAssignment_4_2 )* )
            // InternalCOV.g:2214:2: ( rule__CoverageOfReferenced__ConditionAssignment_4_2 )*
            {
             before(grammarAccess.getCoverageOfReferencedAccess().getConditionAssignment_4_2()); 
            // InternalCOV.g:2215:2: ( rule__CoverageOfReferenced__ConditionAssignment_4_2 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=RULE_STRING && LA22_0<=RULE_ID)||LA22_0==11) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalCOV.g:2215:3: rule__CoverageOfReferenced__ConditionAssignment_4_2
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__CoverageOfReferenced__ConditionAssignment_4_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getCoverageOfReferencedAccess().getConditionAssignment_4_2()); 

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
    // $ANTLR end "rule__CoverageOfReferenced__Group_4__2__Impl"


    // $ANTLR start "rule__CoverageByContent__Group__0"
    // InternalCOV.g:2224:1: rule__CoverageByContent__Group__0 : rule__CoverageByContent__Group__0__Impl rule__CoverageByContent__Group__1 ;
    public final void rule__CoverageByContent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2228:1: ( rule__CoverageByContent__Group__0__Impl rule__CoverageByContent__Group__1 )
            // InternalCOV.g:2229:2: rule__CoverageByContent__Group__0__Impl rule__CoverageByContent__Group__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalCOV.g:2236:1: rule__CoverageByContent__Group__0__Impl : ( 'covered' ) ;
    public final void rule__CoverageByContent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2240:1: ( ( 'covered' ) )
            // InternalCOV.g:2241:1: ( 'covered' )
            {
            // InternalCOV.g:2241:1: ( 'covered' )
            // InternalCOV.g:2242:2: 'covered'
            {
             before(grammarAccess.getCoverageByContentAccess().getCoveredKeyword_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getCoverageByContentAccess().getCoveredKeyword_0()); 

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
    // InternalCOV.g:2251:1: rule__CoverageByContent__Group__1 : rule__CoverageByContent__Group__1__Impl rule__CoverageByContent__Group__2 ;
    public final void rule__CoverageByContent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2255:1: ( rule__CoverageByContent__Group__1__Impl rule__CoverageByContent__Group__2 )
            // InternalCOV.g:2256:2: rule__CoverageByContent__Group__1__Impl rule__CoverageByContent__Group__2
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
    // InternalCOV.g:2263:1: rule__CoverageByContent__Group__1__Impl : ( 'when' ) ;
    public final void rule__CoverageByContent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2267:1: ( ( 'when' ) )
            // InternalCOV.g:2268:1: ( 'when' )
            {
            // InternalCOV.g:2268:1: ( 'when' )
            // InternalCOV.g:2269:2: 'when'
            {
             before(grammarAccess.getCoverageByContentAccess().getWhenKeyword_1()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getCoverageByContentAccess().getWhenKeyword_1()); 

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
    // InternalCOV.g:2278:1: rule__CoverageByContent__Group__2 : rule__CoverageByContent__Group__2__Impl rule__CoverageByContent__Group__3 ;
    public final void rule__CoverageByContent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2282:1: ( rule__CoverageByContent__Group__2__Impl rule__CoverageByContent__Group__3 )
            // InternalCOV.g:2283:2: rule__CoverageByContent__Group__2__Impl rule__CoverageByContent__Group__3
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
    // InternalCOV.g:2290:1: rule__CoverageByContent__Group__2__Impl : ( ( rule__CoverageByContent__MultiplicityAssignment_2 ) ) ;
    public final void rule__CoverageByContent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2294:1: ( ( ( rule__CoverageByContent__MultiplicityAssignment_2 ) ) )
            // InternalCOV.g:2295:1: ( ( rule__CoverageByContent__MultiplicityAssignment_2 ) )
            {
            // InternalCOV.g:2295:1: ( ( rule__CoverageByContent__MultiplicityAssignment_2 ) )
            // InternalCOV.g:2296:2: ( rule__CoverageByContent__MultiplicityAssignment_2 )
            {
             before(grammarAccess.getCoverageByContentAccess().getMultiplicityAssignment_2()); 
            // InternalCOV.g:2297:2: ( rule__CoverageByContent__MultiplicityAssignment_2 )
            // InternalCOV.g:2297:3: rule__CoverageByContent__MultiplicityAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__CoverageByContent__MultiplicityAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCoverageByContentAccess().getMultiplicityAssignment_2()); 

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
    // InternalCOV.g:2305:1: rule__CoverageByContent__Group__3 : rule__CoverageByContent__Group__3__Impl rule__CoverageByContent__Group__4 ;
    public final void rule__CoverageByContent__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2309:1: ( rule__CoverageByContent__Group__3__Impl rule__CoverageByContent__Group__4 )
            // InternalCOV.g:2310:2: rule__CoverageByContent__Group__3__Impl rule__CoverageByContent__Group__4
            {
            pushFollow(FOLLOW_24);
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
    // InternalCOV.g:2317:1: rule__CoverageByContent__Group__3__Impl : ( ( rule__CoverageByContent__ContainmentReferenceAssignment_3 ) ) ;
    public final void rule__CoverageByContent__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2321:1: ( ( ( rule__CoverageByContent__ContainmentReferenceAssignment_3 ) ) )
            // InternalCOV.g:2322:1: ( ( rule__CoverageByContent__ContainmentReferenceAssignment_3 ) )
            {
            // InternalCOV.g:2322:1: ( ( rule__CoverageByContent__ContainmentReferenceAssignment_3 ) )
            // InternalCOV.g:2323:2: ( rule__CoverageByContent__ContainmentReferenceAssignment_3 )
            {
             before(grammarAccess.getCoverageByContentAccess().getContainmentReferenceAssignment_3()); 
            // InternalCOV.g:2324:2: ( rule__CoverageByContent__ContainmentReferenceAssignment_3 )
            // InternalCOV.g:2324:3: rule__CoverageByContent__ContainmentReferenceAssignment_3
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
    // InternalCOV.g:2332:1: rule__CoverageByContent__Group__4 : rule__CoverageByContent__Group__4__Impl rule__CoverageByContent__Group__5 ;
    public final void rule__CoverageByContent__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2336:1: ( rule__CoverageByContent__Group__4__Impl rule__CoverageByContent__Group__5 )
            // InternalCOV.g:2337:2: rule__CoverageByContent__Group__4__Impl rule__CoverageByContent__Group__5
            {
            pushFollow(FOLLOW_16);
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
    // InternalCOV.g:2344:1: rule__CoverageByContent__Group__4__Impl : ( 'iscovered' ) ;
    public final void rule__CoverageByContent__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2348:1: ( ( 'iscovered' ) )
            // InternalCOV.g:2349:1: ( 'iscovered' )
            {
            // InternalCOV.g:2349:1: ( 'iscovered' )
            // InternalCOV.g:2350:2: 'iscovered'
            {
             before(grammarAccess.getCoverageByContentAccess().getIscoveredKeyword_4()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getCoverageByContentAccess().getIscoveredKeyword_4()); 

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
    // InternalCOV.g:2359:1: rule__CoverageByContent__Group__5 : rule__CoverageByContent__Group__5__Impl rule__CoverageByContent__Group__6 ;
    public final void rule__CoverageByContent__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2363:1: ( rule__CoverageByContent__Group__5__Impl rule__CoverageByContent__Group__6 )
            // InternalCOV.g:2364:2: rule__CoverageByContent__Group__5__Impl rule__CoverageByContent__Group__6
            {
            pushFollow(FOLLOW_16);
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
    // InternalCOV.g:2371:1: rule__CoverageByContent__Group__5__Impl : ( ( rule__CoverageByContent__Group_5__0 )? ) ;
    public final void rule__CoverageByContent__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2375:1: ( ( ( rule__CoverageByContent__Group_5__0 )? ) )
            // InternalCOV.g:2376:1: ( ( rule__CoverageByContent__Group_5__0 )? )
            {
            // InternalCOV.g:2376:1: ( ( rule__CoverageByContent__Group_5__0 )? )
            // InternalCOV.g:2377:2: ( rule__CoverageByContent__Group_5__0 )?
            {
             before(grammarAccess.getCoverageByContentAccess().getGroup_5()); 
            // InternalCOV.g:2378:2: ( rule__CoverageByContent__Group_5__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==31) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalCOV.g:2378:3: rule__CoverageByContent__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CoverageByContent__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCoverageByContentAccess().getGroup_5()); 

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
    // InternalCOV.g:2386:1: rule__CoverageByContent__Group__6 : rule__CoverageByContent__Group__6__Impl ;
    public final void rule__CoverageByContent__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2390:1: ( rule__CoverageByContent__Group__6__Impl )
            // InternalCOV.g:2391:2: rule__CoverageByContent__Group__6__Impl
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
    // InternalCOV.g:2397:1: rule__CoverageByContent__Group__6__Impl : ( ( rule__CoverageByContent__Group_6__0 )? ) ;
    public final void rule__CoverageByContent__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2401:1: ( ( ( rule__CoverageByContent__Group_6__0 )? ) )
            // InternalCOV.g:2402:1: ( ( rule__CoverageByContent__Group_6__0 )? )
            {
            // InternalCOV.g:2402:1: ( ( rule__CoverageByContent__Group_6__0 )? )
            // InternalCOV.g:2403:2: ( rule__CoverageByContent__Group_6__0 )?
            {
             before(grammarAccess.getCoverageByContentAccess().getGroup_6()); 
            // InternalCOV.g:2404:2: ( rule__CoverageByContent__Group_6__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==32) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalCOV.g:2404:3: rule__CoverageByContent__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CoverageByContent__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCoverageByContentAccess().getGroup_6()); 

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


    // $ANTLR start "rule__CoverageByContent__Group_5__0"
    // InternalCOV.g:2413:1: rule__CoverageByContent__Group_5__0 : rule__CoverageByContent__Group_5__0__Impl rule__CoverageByContent__Group_5__1 ;
    public final void rule__CoverageByContent__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2417:1: ( rule__CoverageByContent__Group_5__0__Impl rule__CoverageByContent__Group_5__1 )
            // InternalCOV.g:2418:2: rule__CoverageByContent__Group_5__0__Impl rule__CoverageByContent__Group_5__1
            {
            pushFollow(FOLLOW_3);
            rule__CoverageByContent__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CoverageByContent__Group_5__1();

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
    // $ANTLR end "rule__CoverageByContent__Group_5__0"


    // $ANTLR start "rule__CoverageByContent__Group_5__0__Impl"
    // InternalCOV.g:2425:1: rule__CoverageByContent__Group_5__0__Impl : ( 'description' ) ;
    public final void rule__CoverageByContent__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2429:1: ( ( 'description' ) )
            // InternalCOV.g:2430:1: ( 'description' )
            {
            // InternalCOV.g:2430:1: ( 'description' )
            // InternalCOV.g:2431:2: 'description'
            {
             before(grammarAccess.getCoverageByContentAccess().getDescriptionKeyword_5_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getCoverageByContentAccess().getDescriptionKeyword_5_0()); 

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
    // $ANTLR end "rule__CoverageByContent__Group_5__0__Impl"


    // $ANTLR start "rule__CoverageByContent__Group_5__1"
    // InternalCOV.g:2440:1: rule__CoverageByContent__Group_5__1 : rule__CoverageByContent__Group_5__1__Impl ;
    public final void rule__CoverageByContent__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2444:1: ( rule__CoverageByContent__Group_5__1__Impl )
            // InternalCOV.g:2445:2: rule__CoverageByContent__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CoverageByContent__Group_5__1__Impl();

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
    // $ANTLR end "rule__CoverageByContent__Group_5__1"


    // $ANTLR start "rule__CoverageByContent__Group_5__1__Impl"
    // InternalCOV.g:2451:1: rule__CoverageByContent__Group_5__1__Impl : ( ( rule__CoverageByContent__DescriptionAssignment_5_1 ) ) ;
    public final void rule__CoverageByContent__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2455:1: ( ( ( rule__CoverageByContent__DescriptionAssignment_5_1 ) ) )
            // InternalCOV.g:2456:1: ( ( rule__CoverageByContent__DescriptionAssignment_5_1 ) )
            {
            // InternalCOV.g:2456:1: ( ( rule__CoverageByContent__DescriptionAssignment_5_1 ) )
            // InternalCOV.g:2457:2: ( rule__CoverageByContent__DescriptionAssignment_5_1 )
            {
             before(grammarAccess.getCoverageByContentAccess().getDescriptionAssignment_5_1()); 
            // InternalCOV.g:2458:2: ( rule__CoverageByContent__DescriptionAssignment_5_1 )
            // InternalCOV.g:2458:3: rule__CoverageByContent__DescriptionAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__CoverageByContent__DescriptionAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getCoverageByContentAccess().getDescriptionAssignment_5_1()); 

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
    // $ANTLR end "rule__CoverageByContent__Group_5__1__Impl"


    // $ANTLR start "rule__CoverageByContent__Group_6__0"
    // InternalCOV.g:2467:1: rule__CoverageByContent__Group_6__0 : rule__CoverageByContent__Group_6__0__Impl rule__CoverageByContent__Group_6__1 ;
    public final void rule__CoverageByContent__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2471:1: ( rule__CoverageByContent__Group_6__0__Impl rule__CoverageByContent__Group_6__1 )
            // InternalCOV.g:2472:2: rule__CoverageByContent__Group_6__0__Impl rule__CoverageByContent__Group_6__1
            {
            pushFollow(FOLLOW_18);
            rule__CoverageByContent__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CoverageByContent__Group_6__1();

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
    // $ANTLR end "rule__CoverageByContent__Group_6__0"


    // $ANTLR start "rule__CoverageByContent__Group_6__0__Impl"
    // InternalCOV.g:2479:1: rule__CoverageByContent__Group_6__0__Impl : ( 'condition' ) ;
    public final void rule__CoverageByContent__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2483:1: ( ( 'condition' ) )
            // InternalCOV.g:2484:1: ( 'condition' )
            {
            // InternalCOV.g:2484:1: ( 'condition' )
            // InternalCOV.g:2485:2: 'condition'
            {
             before(grammarAccess.getCoverageByContentAccess().getConditionKeyword_6_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getCoverageByContentAccess().getConditionKeyword_6_0()); 

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
    // $ANTLR end "rule__CoverageByContent__Group_6__0__Impl"


    // $ANTLR start "rule__CoverageByContent__Group_6__1"
    // InternalCOV.g:2494:1: rule__CoverageByContent__Group_6__1 : rule__CoverageByContent__Group_6__1__Impl rule__CoverageByContent__Group_6__2 ;
    public final void rule__CoverageByContent__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2498:1: ( rule__CoverageByContent__Group_6__1__Impl rule__CoverageByContent__Group_6__2 )
            // InternalCOV.g:2499:2: rule__CoverageByContent__Group_6__1__Impl rule__CoverageByContent__Group_6__2
            {
            pushFollow(FOLLOW_18);
            rule__CoverageByContent__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CoverageByContent__Group_6__2();

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
    // $ANTLR end "rule__CoverageByContent__Group_6__1"


    // $ANTLR start "rule__CoverageByContent__Group_6__1__Impl"
    // InternalCOV.g:2506:1: rule__CoverageByContent__Group_6__1__Impl : ( ( rule__CoverageByContent__ConditionAssignment_6_1 ) ) ;
    public final void rule__CoverageByContent__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2510:1: ( ( ( rule__CoverageByContent__ConditionAssignment_6_1 ) ) )
            // InternalCOV.g:2511:1: ( ( rule__CoverageByContent__ConditionAssignment_6_1 ) )
            {
            // InternalCOV.g:2511:1: ( ( rule__CoverageByContent__ConditionAssignment_6_1 ) )
            // InternalCOV.g:2512:2: ( rule__CoverageByContent__ConditionAssignment_6_1 )
            {
             before(grammarAccess.getCoverageByContentAccess().getConditionAssignment_6_1()); 
            // InternalCOV.g:2513:2: ( rule__CoverageByContent__ConditionAssignment_6_1 )
            // InternalCOV.g:2513:3: rule__CoverageByContent__ConditionAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__CoverageByContent__ConditionAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getCoverageByContentAccess().getConditionAssignment_6_1()); 

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
    // $ANTLR end "rule__CoverageByContent__Group_6__1__Impl"


    // $ANTLR start "rule__CoverageByContent__Group_6__2"
    // InternalCOV.g:2521:1: rule__CoverageByContent__Group_6__2 : rule__CoverageByContent__Group_6__2__Impl ;
    public final void rule__CoverageByContent__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2525:1: ( rule__CoverageByContent__Group_6__2__Impl )
            // InternalCOV.g:2526:2: rule__CoverageByContent__Group_6__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CoverageByContent__Group_6__2__Impl();

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
    // $ANTLR end "rule__CoverageByContent__Group_6__2"


    // $ANTLR start "rule__CoverageByContent__Group_6__2__Impl"
    // InternalCOV.g:2532:1: rule__CoverageByContent__Group_6__2__Impl : ( ( rule__CoverageByContent__ConditionAssignment_6_2 )* ) ;
    public final void rule__CoverageByContent__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2536:1: ( ( ( rule__CoverageByContent__ConditionAssignment_6_2 )* ) )
            // InternalCOV.g:2537:1: ( ( rule__CoverageByContent__ConditionAssignment_6_2 )* )
            {
            // InternalCOV.g:2537:1: ( ( rule__CoverageByContent__ConditionAssignment_6_2 )* )
            // InternalCOV.g:2538:2: ( rule__CoverageByContent__ConditionAssignment_6_2 )*
            {
             before(grammarAccess.getCoverageByContentAccess().getConditionAssignment_6_2()); 
            // InternalCOV.g:2539:2: ( rule__CoverageByContent__ConditionAssignment_6_2 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=RULE_STRING && LA25_0<=RULE_ID)||LA25_0==11) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalCOV.g:2539:3: rule__CoverageByContent__ConditionAssignment_6_2
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__CoverageByContent__ConditionAssignment_6_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getCoverageByContentAccess().getConditionAssignment_6_2()); 

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
    // $ANTLR end "rule__CoverageByContent__Group_6__2__Impl"


    // $ANTLR start "rule__BranchSpecification__Group__0"
    // InternalCOV.g:2548:1: rule__BranchSpecification__Group__0 : rule__BranchSpecification__Group__0__Impl rule__BranchSpecification__Group__1 ;
    public final void rule__BranchSpecification__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2552:1: ( rule__BranchSpecification__Group__0__Impl rule__BranchSpecification__Group__1 )
            // InternalCOV.g:2553:2: rule__BranchSpecification__Group__0__Impl rule__BranchSpecification__Group__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalCOV.g:2560:1: rule__BranchSpecification__Group__0__Impl : ( 'has' ) ;
    public final void rule__BranchSpecification__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2564:1: ( ( 'has' ) )
            // InternalCOV.g:2565:1: ( 'has' )
            {
            // InternalCOV.g:2565:1: ( 'has' )
            // InternalCOV.g:2566:2: 'has'
            {
             before(grammarAccess.getBranchSpecificationAccess().getHasKeyword_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getBranchSpecificationAccess().getHasKeyword_0()); 

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
    // $ANTLR end "rule__BranchSpecification__Group__0__Impl"


    // $ANTLR start "rule__BranchSpecification__Group__1"
    // InternalCOV.g:2575:1: rule__BranchSpecification__Group__1 : rule__BranchSpecification__Group__1__Impl rule__BranchSpecification__Group__2 ;
    public final void rule__BranchSpecification__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2579:1: ( rule__BranchSpecification__Group__1__Impl rule__BranchSpecification__Group__2 )
            // InternalCOV.g:2580:2: rule__BranchSpecification__Group__1__Impl rule__BranchSpecification__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalCOV.g:2587:1: rule__BranchSpecification__Group__1__Impl : ( 'branches' ) ;
    public final void rule__BranchSpecification__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2591:1: ( ( 'branches' ) )
            // InternalCOV.g:2592:1: ( 'branches' )
            {
            // InternalCOV.g:2592:1: ( 'branches' )
            // InternalCOV.g:2593:2: 'branches'
            {
             before(grammarAccess.getBranchSpecificationAccess().getBranchesKeyword_1()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getBranchSpecificationAccess().getBranchesKeyword_1()); 

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
    // InternalCOV.g:2602:1: rule__BranchSpecification__Group__2 : rule__BranchSpecification__Group__2__Impl rule__BranchSpecification__Group__3 ;
    public final void rule__BranchSpecification__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2606:1: ( rule__BranchSpecification__Group__2__Impl rule__BranchSpecification__Group__3 )
            // InternalCOV.g:2607:2: rule__BranchSpecification__Group__2__Impl rule__BranchSpecification__Group__3
            {
            pushFollow(FOLLOW_26);
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
    // InternalCOV.g:2614:1: rule__BranchSpecification__Group__2__Impl : ( '{' ) ;
    public final void rule__BranchSpecification__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2618:1: ( ( '{' ) )
            // InternalCOV.g:2619:1: ( '{' )
            {
            // InternalCOV.g:2619:1: ( '{' )
            // InternalCOV.g:2620:2: '{'
            {
             before(grammarAccess.getBranchSpecificationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,21,FOLLOW_2); 
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
    // InternalCOV.g:2629:1: rule__BranchSpecification__Group__3 : rule__BranchSpecification__Group__3__Impl rule__BranchSpecification__Group__4 ;
    public final void rule__BranchSpecification__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2633:1: ( rule__BranchSpecification__Group__3__Impl rule__BranchSpecification__Group__4 )
            // InternalCOV.g:2634:2: rule__BranchSpecification__Group__3__Impl rule__BranchSpecification__Group__4
            {
            pushFollow(FOLLOW_26);
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
    // InternalCOV.g:2641:1: rule__BranchSpecification__Group__3__Impl : ( ( rule__BranchSpecification__Group_3__0 )? ) ;
    public final void rule__BranchSpecification__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2645:1: ( ( ( rule__BranchSpecification__Group_3__0 )? ) )
            // InternalCOV.g:2646:1: ( ( rule__BranchSpecification__Group_3__0 )? )
            {
            // InternalCOV.g:2646:1: ( ( rule__BranchSpecification__Group_3__0 )? )
            // InternalCOV.g:2647:2: ( rule__BranchSpecification__Group_3__0 )?
            {
             before(grammarAccess.getBranchSpecificationAccess().getGroup_3()); 
            // InternalCOV.g:2648:2: ( rule__BranchSpecification__Group_3__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==31) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalCOV.g:2648:3: rule__BranchSpecification__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BranchSpecification__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBranchSpecificationAccess().getGroup_3()); 

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
    // InternalCOV.g:2656:1: rule__BranchSpecification__Group__4 : rule__BranchSpecification__Group__4__Impl rule__BranchSpecification__Group__5 ;
    public final void rule__BranchSpecification__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2660:1: ( rule__BranchSpecification__Group__4__Impl rule__BranchSpecification__Group__5 )
            // InternalCOV.g:2661:2: rule__BranchSpecification__Group__4__Impl rule__BranchSpecification__Group__5
            {
            pushFollow(FOLLOW_26);
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
    // InternalCOV.g:2668:1: rule__BranchSpecification__Group__4__Impl : ( ( rule__BranchSpecification__Group_4__0 )? ) ;
    public final void rule__BranchSpecification__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2672:1: ( ( ( rule__BranchSpecification__Group_4__0 )? ) )
            // InternalCOV.g:2673:1: ( ( rule__BranchSpecification__Group_4__0 )? )
            {
            // InternalCOV.g:2673:1: ( ( rule__BranchSpecification__Group_4__0 )? )
            // InternalCOV.g:2674:2: ( rule__BranchSpecification__Group_4__0 )?
            {
             before(grammarAccess.getBranchSpecificationAccess().getGroup_4()); 
            // InternalCOV.g:2675:2: ( rule__BranchSpecification__Group_4__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==32) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalCOV.g:2675:3: rule__BranchSpecification__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BranchSpecification__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

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
    // InternalCOV.g:2683:1: rule__BranchSpecification__Group__5 : rule__BranchSpecification__Group__5__Impl rule__BranchSpecification__Group__6 ;
    public final void rule__BranchSpecification__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2687:1: ( rule__BranchSpecification__Group__5__Impl rule__BranchSpecification__Group__6 )
            // InternalCOV.g:2688:2: rule__BranchSpecification__Group__5__Impl rule__BranchSpecification__Group__6
            {
            pushFollow(FOLLOW_8);
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
    // InternalCOV.g:2695:1: rule__BranchSpecification__Group__5__Impl : ( ( rule__BranchSpecification__BranchesAssignment_5 ) ) ;
    public final void rule__BranchSpecification__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2699:1: ( ( ( rule__BranchSpecification__BranchesAssignment_5 ) ) )
            // InternalCOV.g:2700:1: ( ( rule__BranchSpecification__BranchesAssignment_5 ) )
            {
            // InternalCOV.g:2700:1: ( ( rule__BranchSpecification__BranchesAssignment_5 ) )
            // InternalCOV.g:2701:2: ( rule__BranchSpecification__BranchesAssignment_5 )
            {
             before(grammarAccess.getBranchSpecificationAccess().getBranchesAssignment_5()); 
            // InternalCOV.g:2702:2: ( rule__BranchSpecification__BranchesAssignment_5 )
            // InternalCOV.g:2702:3: rule__BranchSpecification__BranchesAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__BranchSpecification__BranchesAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getBranchSpecificationAccess().getBranchesAssignment_5()); 

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
    // InternalCOV.g:2710:1: rule__BranchSpecification__Group__6 : rule__BranchSpecification__Group__6__Impl rule__BranchSpecification__Group__7 ;
    public final void rule__BranchSpecification__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2714:1: ( rule__BranchSpecification__Group__6__Impl rule__BranchSpecification__Group__7 )
            // InternalCOV.g:2715:2: rule__BranchSpecification__Group__6__Impl rule__BranchSpecification__Group__7
            {
            pushFollow(FOLLOW_8);
            rule__BranchSpecification__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BranchSpecification__Group__7();

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
    // InternalCOV.g:2722:1: rule__BranchSpecification__Group__6__Impl : ( ( rule__BranchSpecification__Group_6__0 )* ) ;
    public final void rule__BranchSpecification__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2726:1: ( ( ( rule__BranchSpecification__Group_6__0 )* ) )
            // InternalCOV.g:2727:1: ( ( rule__BranchSpecification__Group_6__0 )* )
            {
            // InternalCOV.g:2727:1: ( ( rule__BranchSpecification__Group_6__0 )* )
            // InternalCOV.g:2728:2: ( rule__BranchSpecification__Group_6__0 )*
            {
             before(grammarAccess.getBranchSpecificationAccess().getGroup_6()); 
            // InternalCOV.g:2729:2: ( rule__BranchSpecification__Group_6__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==25) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalCOV.g:2729:3: rule__BranchSpecification__Group_6__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__BranchSpecification__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getBranchSpecificationAccess().getGroup_6()); 

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


    // $ANTLR start "rule__BranchSpecification__Group__7"
    // InternalCOV.g:2737:1: rule__BranchSpecification__Group__7 : rule__BranchSpecification__Group__7__Impl ;
    public final void rule__BranchSpecification__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2741:1: ( rule__BranchSpecification__Group__7__Impl )
            // InternalCOV.g:2742:2: rule__BranchSpecification__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BranchSpecification__Group__7__Impl();

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
    // $ANTLR end "rule__BranchSpecification__Group__7"


    // $ANTLR start "rule__BranchSpecification__Group__7__Impl"
    // InternalCOV.g:2748:1: rule__BranchSpecification__Group__7__Impl : ( '}' ) ;
    public final void rule__BranchSpecification__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2752:1: ( ( '}' ) )
            // InternalCOV.g:2753:1: ( '}' )
            {
            // InternalCOV.g:2753:1: ( '}' )
            // InternalCOV.g:2754:2: '}'
            {
             before(grammarAccess.getBranchSpecificationAccess().getRightCurlyBracketKeyword_7()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getBranchSpecificationAccess().getRightCurlyBracketKeyword_7()); 

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
    // $ANTLR end "rule__BranchSpecification__Group__7__Impl"


    // $ANTLR start "rule__BranchSpecification__Group_3__0"
    // InternalCOV.g:2764:1: rule__BranchSpecification__Group_3__0 : rule__BranchSpecification__Group_3__0__Impl rule__BranchSpecification__Group_3__1 ;
    public final void rule__BranchSpecification__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2768:1: ( rule__BranchSpecification__Group_3__0__Impl rule__BranchSpecification__Group_3__1 )
            // InternalCOV.g:2769:2: rule__BranchSpecification__Group_3__0__Impl rule__BranchSpecification__Group_3__1
            {
            pushFollow(FOLLOW_3);
            rule__BranchSpecification__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BranchSpecification__Group_3__1();

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
    // $ANTLR end "rule__BranchSpecification__Group_3__0"


    // $ANTLR start "rule__BranchSpecification__Group_3__0__Impl"
    // InternalCOV.g:2776:1: rule__BranchSpecification__Group_3__0__Impl : ( 'description' ) ;
    public final void rule__BranchSpecification__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2780:1: ( ( 'description' ) )
            // InternalCOV.g:2781:1: ( 'description' )
            {
            // InternalCOV.g:2781:1: ( 'description' )
            // InternalCOV.g:2782:2: 'description'
            {
             before(grammarAccess.getBranchSpecificationAccess().getDescriptionKeyword_3_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getBranchSpecificationAccess().getDescriptionKeyword_3_0()); 

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
    // $ANTLR end "rule__BranchSpecification__Group_3__0__Impl"


    // $ANTLR start "rule__BranchSpecification__Group_3__1"
    // InternalCOV.g:2791:1: rule__BranchSpecification__Group_3__1 : rule__BranchSpecification__Group_3__1__Impl ;
    public final void rule__BranchSpecification__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2795:1: ( rule__BranchSpecification__Group_3__1__Impl )
            // InternalCOV.g:2796:2: rule__BranchSpecification__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BranchSpecification__Group_3__1__Impl();

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
    // $ANTLR end "rule__BranchSpecification__Group_3__1"


    // $ANTLR start "rule__BranchSpecification__Group_3__1__Impl"
    // InternalCOV.g:2802:1: rule__BranchSpecification__Group_3__1__Impl : ( ( rule__BranchSpecification__DescriptionAssignment_3_1 ) ) ;
    public final void rule__BranchSpecification__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2806:1: ( ( ( rule__BranchSpecification__DescriptionAssignment_3_1 ) ) )
            // InternalCOV.g:2807:1: ( ( rule__BranchSpecification__DescriptionAssignment_3_1 ) )
            {
            // InternalCOV.g:2807:1: ( ( rule__BranchSpecification__DescriptionAssignment_3_1 ) )
            // InternalCOV.g:2808:2: ( rule__BranchSpecification__DescriptionAssignment_3_1 )
            {
             before(grammarAccess.getBranchSpecificationAccess().getDescriptionAssignment_3_1()); 
            // InternalCOV.g:2809:2: ( rule__BranchSpecification__DescriptionAssignment_3_1 )
            // InternalCOV.g:2809:3: rule__BranchSpecification__DescriptionAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__BranchSpecification__DescriptionAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getBranchSpecificationAccess().getDescriptionAssignment_3_1()); 

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
    // $ANTLR end "rule__BranchSpecification__Group_3__1__Impl"


    // $ANTLR start "rule__BranchSpecification__Group_4__0"
    // InternalCOV.g:2818:1: rule__BranchSpecification__Group_4__0 : rule__BranchSpecification__Group_4__0__Impl rule__BranchSpecification__Group_4__1 ;
    public final void rule__BranchSpecification__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2822:1: ( rule__BranchSpecification__Group_4__0__Impl rule__BranchSpecification__Group_4__1 )
            // InternalCOV.g:2823:2: rule__BranchSpecification__Group_4__0__Impl rule__BranchSpecification__Group_4__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalCOV.g:2830:1: rule__BranchSpecification__Group_4__0__Impl : ( 'condition' ) ;
    public final void rule__BranchSpecification__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2834:1: ( ( 'condition' ) )
            // InternalCOV.g:2835:1: ( 'condition' )
            {
            // InternalCOV.g:2835:1: ( 'condition' )
            // InternalCOV.g:2836:2: 'condition'
            {
             before(grammarAccess.getBranchSpecificationAccess().getConditionKeyword_4_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getBranchSpecificationAccess().getConditionKeyword_4_0()); 

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
    // InternalCOV.g:2845:1: rule__BranchSpecification__Group_4__1 : rule__BranchSpecification__Group_4__1__Impl rule__BranchSpecification__Group_4__2 ;
    public final void rule__BranchSpecification__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2849:1: ( rule__BranchSpecification__Group_4__1__Impl rule__BranchSpecification__Group_4__2 )
            // InternalCOV.g:2850:2: rule__BranchSpecification__Group_4__1__Impl rule__BranchSpecification__Group_4__2
            {
            pushFollow(FOLLOW_18);
            rule__BranchSpecification__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BranchSpecification__Group_4__2();

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
    // InternalCOV.g:2857:1: rule__BranchSpecification__Group_4__1__Impl : ( ( rule__BranchSpecification__ConditionAssignment_4_1 ) ) ;
    public final void rule__BranchSpecification__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2861:1: ( ( ( rule__BranchSpecification__ConditionAssignment_4_1 ) ) )
            // InternalCOV.g:2862:1: ( ( rule__BranchSpecification__ConditionAssignment_4_1 ) )
            {
            // InternalCOV.g:2862:1: ( ( rule__BranchSpecification__ConditionAssignment_4_1 ) )
            // InternalCOV.g:2863:2: ( rule__BranchSpecification__ConditionAssignment_4_1 )
            {
             before(grammarAccess.getBranchSpecificationAccess().getConditionAssignment_4_1()); 
            // InternalCOV.g:2864:2: ( rule__BranchSpecification__ConditionAssignment_4_1 )
            // InternalCOV.g:2864:3: rule__BranchSpecification__ConditionAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__BranchSpecification__ConditionAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getBranchSpecificationAccess().getConditionAssignment_4_1()); 

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


    // $ANTLR start "rule__BranchSpecification__Group_4__2"
    // InternalCOV.g:2872:1: rule__BranchSpecification__Group_4__2 : rule__BranchSpecification__Group_4__2__Impl ;
    public final void rule__BranchSpecification__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2876:1: ( rule__BranchSpecification__Group_4__2__Impl )
            // InternalCOV.g:2877:2: rule__BranchSpecification__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BranchSpecification__Group_4__2__Impl();

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
    // $ANTLR end "rule__BranchSpecification__Group_4__2"


    // $ANTLR start "rule__BranchSpecification__Group_4__2__Impl"
    // InternalCOV.g:2883:1: rule__BranchSpecification__Group_4__2__Impl : ( ( rule__BranchSpecification__ConditionAssignment_4_2 )* ) ;
    public final void rule__BranchSpecification__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2887:1: ( ( ( rule__BranchSpecification__ConditionAssignment_4_2 )* ) )
            // InternalCOV.g:2888:1: ( ( rule__BranchSpecification__ConditionAssignment_4_2 )* )
            {
            // InternalCOV.g:2888:1: ( ( rule__BranchSpecification__ConditionAssignment_4_2 )* )
            // InternalCOV.g:2889:2: ( rule__BranchSpecification__ConditionAssignment_4_2 )*
            {
             before(grammarAccess.getBranchSpecificationAccess().getConditionAssignment_4_2()); 
            // InternalCOV.g:2890:2: ( rule__BranchSpecification__ConditionAssignment_4_2 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( ((LA29_0>=RULE_STRING && LA29_0<=RULE_ID)||LA29_0==11) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalCOV.g:2890:3: rule__BranchSpecification__ConditionAssignment_4_2
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__BranchSpecification__ConditionAssignment_4_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

             after(grammarAccess.getBranchSpecificationAccess().getConditionAssignment_4_2()); 

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
    // $ANTLR end "rule__BranchSpecification__Group_4__2__Impl"


    // $ANTLR start "rule__BranchSpecification__Group_6__0"
    // InternalCOV.g:2899:1: rule__BranchSpecification__Group_6__0 : rule__BranchSpecification__Group_6__0__Impl rule__BranchSpecification__Group_6__1 ;
    public final void rule__BranchSpecification__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2903:1: ( rule__BranchSpecification__Group_6__0__Impl rule__BranchSpecification__Group_6__1 )
            // InternalCOV.g:2904:2: rule__BranchSpecification__Group_6__0__Impl rule__BranchSpecification__Group_6__1
            {
            pushFollow(FOLLOW_26);
            rule__BranchSpecification__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BranchSpecification__Group_6__1();

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
    // $ANTLR end "rule__BranchSpecification__Group_6__0"


    // $ANTLR start "rule__BranchSpecification__Group_6__0__Impl"
    // InternalCOV.g:2911:1: rule__BranchSpecification__Group_6__0__Impl : ( ',' ) ;
    public final void rule__BranchSpecification__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2915:1: ( ( ',' ) )
            // InternalCOV.g:2916:1: ( ',' )
            {
            // InternalCOV.g:2916:1: ( ',' )
            // InternalCOV.g:2917:2: ','
            {
             before(grammarAccess.getBranchSpecificationAccess().getCommaKeyword_6_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getBranchSpecificationAccess().getCommaKeyword_6_0()); 

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
    // $ANTLR end "rule__BranchSpecification__Group_6__0__Impl"


    // $ANTLR start "rule__BranchSpecification__Group_6__1"
    // InternalCOV.g:2926:1: rule__BranchSpecification__Group_6__1 : rule__BranchSpecification__Group_6__1__Impl ;
    public final void rule__BranchSpecification__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2930:1: ( rule__BranchSpecification__Group_6__1__Impl )
            // InternalCOV.g:2931:2: rule__BranchSpecification__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BranchSpecification__Group_6__1__Impl();

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
    // $ANTLR end "rule__BranchSpecification__Group_6__1"


    // $ANTLR start "rule__BranchSpecification__Group_6__1__Impl"
    // InternalCOV.g:2937:1: rule__BranchSpecification__Group_6__1__Impl : ( ( rule__BranchSpecification__BranchesAssignment_6_1 ) ) ;
    public final void rule__BranchSpecification__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2941:1: ( ( ( rule__BranchSpecification__BranchesAssignment_6_1 ) ) )
            // InternalCOV.g:2942:1: ( ( rule__BranchSpecification__BranchesAssignment_6_1 ) )
            {
            // InternalCOV.g:2942:1: ( ( rule__BranchSpecification__BranchesAssignment_6_1 ) )
            // InternalCOV.g:2943:2: ( rule__BranchSpecification__BranchesAssignment_6_1 )
            {
             before(grammarAccess.getBranchSpecificationAccess().getBranchesAssignment_6_1()); 
            // InternalCOV.g:2944:2: ( rule__BranchSpecification__BranchesAssignment_6_1 )
            // InternalCOV.g:2944:3: rule__BranchSpecification__BranchesAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__BranchSpecification__BranchesAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getBranchSpecificationAccess().getBranchesAssignment_6_1()); 

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
    // $ANTLR end "rule__BranchSpecification__Group_6__1__Impl"


    // $ANTLR start "rule__Branch__Group__0"
    // InternalCOV.g:2953:1: rule__Branch__Group__0 : rule__Branch__Group__0__Impl rule__Branch__Group__1 ;
    public final void rule__Branch__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2957:1: ( rule__Branch__Group__0__Impl rule__Branch__Group__1 )
            // InternalCOV.g:2958:2: rule__Branch__Group__0__Impl rule__Branch__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Branch__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Branch__Group__1();

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
    // $ANTLR end "rule__Branch__Group__0"


    // $ANTLR start "rule__Branch__Group__0__Impl"
    // InternalCOV.g:2965:1: rule__Branch__Group__0__Impl : ( 'queryBranch' ) ;
    public final void rule__Branch__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2969:1: ( ( 'queryBranch' ) )
            // InternalCOV.g:2970:1: ( 'queryBranch' )
            {
            // InternalCOV.g:2970:1: ( 'queryBranch' )
            // InternalCOV.g:2971:2: 'queryBranch'
            {
             before(grammarAccess.getBranchAccess().getQueryBranchKeyword_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getBranchAccess().getQueryBranchKeyword_0()); 

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
    // $ANTLR end "rule__Branch__Group__0__Impl"


    // $ANTLR start "rule__Branch__Group__1"
    // InternalCOV.g:2980:1: rule__Branch__Group__1 : rule__Branch__Group__1__Impl ;
    public final void rule__Branch__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2984:1: ( rule__Branch__Group__1__Impl )
            // InternalCOV.g:2985:2: rule__Branch__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Branch__Group__1__Impl();

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
    // $ANTLR end "rule__Branch__Group__1"


    // $ANTLR start "rule__Branch__Group__1__Impl"
    // InternalCOV.g:2991:1: rule__Branch__Group__1__Impl : ( ( rule__Branch__QueryAssignment_1 ) ) ;
    public final void rule__Branch__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2995:1: ( ( ( rule__Branch__QueryAssignment_1 ) ) )
            // InternalCOV.g:2996:1: ( ( rule__Branch__QueryAssignment_1 ) )
            {
            // InternalCOV.g:2996:1: ( ( rule__Branch__QueryAssignment_1 ) )
            // InternalCOV.g:2997:2: ( rule__Branch__QueryAssignment_1 )
            {
             before(grammarAccess.getBranchAccess().getQueryAssignment_1()); 
            // InternalCOV.g:2998:2: ( rule__Branch__QueryAssignment_1 )
            // InternalCOV.g:2998:3: rule__Branch__QueryAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Branch__QueryAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBranchAccess().getQueryAssignment_1()); 

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
    // $ANTLR end "rule__Branch__Group__1__Impl"


    // $ANTLR start "rule__UnaryCondition__Group__0"
    // InternalCOV.g:3007:1: rule__UnaryCondition__Group__0 : rule__UnaryCondition__Group__0__Impl rule__UnaryCondition__Group__1 ;
    public final void rule__UnaryCondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3011:1: ( rule__UnaryCondition__Group__0__Impl rule__UnaryCondition__Group__1 )
            // InternalCOV.g:3012:2: rule__UnaryCondition__Group__0__Impl rule__UnaryCondition__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__UnaryCondition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnaryCondition__Group__1();

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
    // $ANTLR end "rule__UnaryCondition__Group__0"


    // $ANTLR start "rule__UnaryCondition__Group__0__Impl"
    // InternalCOV.g:3019:1: rule__UnaryCondition__Group__0__Impl : ( ( rule__UnaryCondition__OperatorAssignment_0 )? ) ;
    public final void rule__UnaryCondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3023:1: ( ( ( rule__UnaryCondition__OperatorAssignment_0 )? ) )
            // InternalCOV.g:3024:1: ( ( rule__UnaryCondition__OperatorAssignment_0 )? )
            {
            // InternalCOV.g:3024:1: ( ( rule__UnaryCondition__OperatorAssignment_0 )? )
            // InternalCOV.g:3025:2: ( rule__UnaryCondition__OperatorAssignment_0 )?
            {
             before(grammarAccess.getUnaryConditionAccess().getOperatorAssignment_0()); 
            // InternalCOV.g:3026:2: ( rule__UnaryCondition__OperatorAssignment_0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==11) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalCOV.g:3026:3: rule__UnaryCondition__OperatorAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__UnaryCondition__OperatorAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getUnaryConditionAccess().getOperatorAssignment_0()); 

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
    // $ANTLR end "rule__UnaryCondition__Group__0__Impl"


    // $ANTLR start "rule__UnaryCondition__Group__1"
    // InternalCOV.g:3034:1: rule__UnaryCondition__Group__1 : rule__UnaryCondition__Group__1__Impl ;
    public final void rule__UnaryCondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3038:1: ( rule__UnaryCondition__Group__1__Impl )
            // InternalCOV.g:3039:2: rule__UnaryCondition__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UnaryCondition__Group__1__Impl();

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
    // $ANTLR end "rule__UnaryCondition__Group__1"


    // $ANTLR start "rule__UnaryCondition__Group__1__Impl"
    // InternalCOV.g:3045:1: rule__UnaryCondition__Group__1__Impl : ( ( rule__UnaryCondition__ConstraintAssignment_1 ) ) ;
    public final void rule__UnaryCondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3049:1: ( ( ( rule__UnaryCondition__ConstraintAssignment_1 ) ) )
            // InternalCOV.g:3050:1: ( ( rule__UnaryCondition__ConstraintAssignment_1 ) )
            {
            // InternalCOV.g:3050:1: ( ( rule__UnaryCondition__ConstraintAssignment_1 ) )
            // InternalCOV.g:3051:2: ( rule__UnaryCondition__ConstraintAssignment_1 )
            {
             before(grammarAccess.getUnaryConditionAccess().getConstraintAssignment_1()); 
            // InternalCOV.g:3052:2: ( rule__UnaryCondition__ConstraintAssignment_1 )
            // InternalCOV.g:3052:3: rule__UnaryCondition__ConstraintAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__UnaryCondition__ConstraintAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getUnaryConditionAccess().getConstraintAssignment_1()); 

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
    // $ANTLR end "rule__UnaryCondition__Group__1__Impl"


    // $ANTLR start "rule__BinaryCondition__Group__0"
    // InternalCOV.g:3061:1: rule__BinaryCondition__Group__0 : rule__BinaryCondition__Group__0__Impl rule__BinaryCondition__Group__1 ;
    public final void rule__BinaryCondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3065:1: ( rule__BinaryCondition__Group__0__Impl rule__BinaryCondition__Group__1 )
            // InternalCOV.g:3066:2: rule__BinaryCondition__Group__0__Impl rule__BinaryCondition__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__BinaryCondition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BinaryCondition__Group__1();

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
    // $ANTLR end "rule__BinaryCondition__Group__0"


    // $ANTLR start "rule__BinaryCondition__Group__0__Impl"
    // InternalCOV.g:3073:1: rule__BinaryCondition__Group__0__Impl : ( ( rule__BinaryCondition__ConstraintAssignment_0 ) ) ;
    public final void rule__BinaryCondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3077:1: ( ( ( rule__BinaryCondition__ConstraintAssignment_0 ) ) )
            // InternalCOV.g:3078:1: ( ( rule__BinaryCondition__ConstraintAssignment_0 ) )
            {
            // InternalCOV.g:3078:1: ( ( rule__BinaryCondition__ConstraintAssignment_0 ) )
            // InternalCOV.g:3079:2: ( rule__BinaryCondition__ConstraintAssignment_0 )
            {
             before(grammarAccess.getBinaryConditionAccess().getConstraintAssignment_0()); 
            // InternalCOV.g:3080:2: ( rule__BinaryCondition__ConstraintAssignment_0 )
            // InternalCOV.g:3080:3: rule__BinaryCondition__ConstraintAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__BinaryCondition__ConstraintAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getBinaryConditionAccess().getConstraintAssignment_0()); 

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
    // $ANTLR end "rule__BinaryCondition__Group__0__Impl"


    // $ANTLR start "rule__BinaryCondition__Group__1"
    // InternalCOV.g:3088:1: rule__BinaryCondition__Group__1 : rule__BinaryCondition__Group__1__Impl ;
    public final void rule__BinaryCondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3092:1: ( rule__BinaryCondition__Group__1__Impl )
            // InternalCOV.g:3093:2: rule__BinaryCondition__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BinaryCondition__Group__1__Impl();

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
    // $ANTLR end "rule__BinaryCondition__Group__1"


    // $ANTLR start "rule__BinaryCondition__Group__1__Impl"
    // InternalCOV.g:3099:1: rule__BinaryCondition__Group__1__Impl : ( ( rule__BinaryCondition__OperatorAssignment_1 ) ) ;
    public final void rule__BinaryCondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3103:1: ( ( ( rule__BinaryCondition__OperatorAssignment_1 ) ) )
            // InternalCOV.g:3104:1: ( ( rule__BinaryCondition__OperatorAssignment_1 ) )
            {
            // InternalCOV.g:3104:1: ( ( rule__BinaryCondition__OperatorAssignment_1 ) )
            // InternalCOV.g:3105:2: ( rule__BinaryCondition__OperatorAssignment_1 )
            {
             before(grammarAccess.getBinaryConditionAccess().getOperatorAssignment_1()); 
            // InternalCOV.g:3106:2: ( rule__BinaryCondition__OperatorAssignment_1 )
            // InternalCOV.g:3106:3: rule__BinaryCondition__OperatorAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__BinaryCondition__OperatorAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBinaryConditionAccess().getOperatorAssignment_1()); 

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
    // $ANTLR end "rule__BinaryCondition__Group__1__Impl"


    // $ANTLR start "rule__DomainSpecificCoverage__NameAssignment_1"
    // InternalCOV.g:3115:1: rule__DomainSpecificCoverage__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__DomainSpecificCoverage__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3119:1: ( ( ruleEString ) )
            // InternalCOV.g:3120:2: ( ruleEString )
            {
            // InternalCOV.g:3120:2: ( ruleEString )
            // InternalCOV.g:3121:3: ruleEString
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
    // InternalCOV.g:3130:1: rule__DomainSpecificCoverage__MetamodelAssignment_5 : ( ( ruleEString ) ) ;
    public final void rule__DomainSpecificCoverage__MetamodelAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3134:1: ( ( ( ruleEString ) ) )
            // InternalCOV.g:3135:2: ( ( ruleEString ) )
            {
            // InternalCOV.g:3135:2: ( ( ruleEString ) )
            // InternalCOV.g:3136:3: ( ruleEString )
            {
             before(grammarAccess.getDomainSpecificCoverageAccess().getMetamodelEPackageCrossReference_5_0()); 
            // InternalCOV.g:3137:3: ( ruleEString )
            // InternalCOV.g:3138:4: ruleEString
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
    // InternalCOV.g:3149:1: rule__DomainSpecificCoverage__ContextsAssignment_6 : ( ruleContext ) ;
    public final void rule__DomainSpecificCoverage__ContextsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3153:1: ( ( ruleContext ) )
            // InternalCOV.g:3154:2: ( ruleContext )
            {
            // InternalCOV.g:3154:2: ( ruleContext )
            // InternalCOV.g:3155:3: ruleContext
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
    // InternalCOV.g:3164:1: rule__DomainSpecificCoverage__ContextsAssignment_7_1 : ( ruleContext ) ;
    public final void rule__DomainSpecificCoverage__ContextsAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3168:1: ( ( ruleContext ) )
            // InternalCOV.g:3169:2: ( ruleContext )
            {
            // InternalCOV.g:3169:2: ( ruleContext )
            // InternalCOV.g:3170:3: ruleContext
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
    // InternalCOV.g:3179:1: rule__Context__MetaclassAssignment_1 : ( ( ruleEString ) ) ;
    public final void rule__Context__MetaclassAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3183:1: ( ( ( ruleEString ) ) )
            // InternalCOV.g:3184:2: ( ( ruleEString ) )
            {
            // InternalCOV.g:3184:2: ( ( ruleEString ) )
            // InternalCOV.g:3185:3: ( ruleEString )
            {
             before(grammarAccess.getContextAccess().getMetaclassEClassCrossReference_1_0()); 
            // InternalCOV.g:3186:3: ( ruleEString )
            // InternalCOV.g:3187:4: ruleEString
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
    // InternalCOV.g:3198:1: rule__Context__RulesAssignment_3_0 : ( ruleRule ) ;
    public final void rule__Context__RulesAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3202:1: ( ( ruleRule ) )
            // InternalCOV.g:3203:2: ( ruleRule )
            {
            // InternalCOV.g:3203:2: ( ruleRule )
            // InternalCOV.g:3204:3: ruleRule
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
    // InternalCOV.g:3213:1: rule__Context__RulesAssignment_3_1_1 : ( ruleRule ) ;
    public final void rule__Context__RulesAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3217:1: ( ( ruleRule ) )
            // InternalCOV.g:3218:2: ( ruleRule )
            {
            // InternalCOV.g:3218:2: ( ruleRule )
            // InternalCOV.g:3219:3: ruleRule
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
    // InternalCOV.g:3228:1: rule__Ignore__IgnoreSubtypesAssignment_3_1 : ( ruleEBoolean ) ;
    public final void rule__Ignore__IgnoreSubtypesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3232:1: ( ( ruleEBoolean ) )
            // InternalCOV.g:3233:2: ( ruleEBoolean )
            {
            // InternalCOV.g:3233:2: ( ruleEBoolean )
            // InternalCOV.g:3234:3: ruleEBoolean
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


    // $ANTLR start "rule__Ignore__DescriptionAssignment_5_1"
    // InternalCOV.g:3243:1: rule__Ignore__DescriptionAssignment_5_1 : ( ruleEString ) ;
    public final void rule__Ignore__DescriptionAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3247:1: ( ( ruleEString ) )
            // InternalCOV.g:3248:2: ( ruleEString )
            {
            // InternalCOV.g:3248:2: ( ruleEString )
            // InternalCOV.g:3249:3: ruleEString
            {
             before(grammarAccess.getIgnoreAccess().getDescriptionEStringParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getIgnoreAccess().getDescriptionEStringParserRuleCall_5_1_0()); 

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
    // $ANTLR end "rule__Ignore__DescriptionAssignment_5_1"


    // $ANTLR start "rule__Ignore__ConditionAssignment_6_1"
    // InternalCOV.g:3258:1: rule__Ignore__ConditionAssignment_6_1 : ( ruleCondition ) ;
    public final void rule__Ignore__ConditionAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3262:1: ( ( ruleCondition ) )
            // InternalCOV.g:3263:2: ( ruleCondition )
            {
            // InternalCOV.g:3263:2: ( ruleCondition )
            // InternalCOV.g:3264:3: ruleCondition
            {
             before(grammarAccess.getIgnoreAccess().getConditionConditionParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getIgnoreAccess().getConditionConditionParserRuleCall_6_1_0()); 

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
    // $ANTLR end "rule__Ignore__ConditionAssignment_6_1"


    // $ANTLR start "rule__Ignore__ConditionAssignment_6_2"
    // InternalCOV.g:3273:1: rule__Ignore__ConditionAssignment_6_2 : ( ruleCondition ) ;
    public final void rule__Ignore__ConditionAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3277:1: ( ( ruleCondition ) )
            // InternalCOV.g:3278:2: ( ruleCondition )
            {
            // InternalCOV.g:3278:2: ( ruleCondition )
            // InternalCOV.g:3279:3: ruleCondition
            {
             before(grammarAccess.getIgnoreAccess().getConditionConditionParserRuleCall_6_2_0()); 
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getIgnoreAccess().getConditionConditionParserRuleCall_6_2_0()); 

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
    // $ANTLR end "rule__Ignore__ConditionAssignment_6_2"


    // $ANTLR start "rule__LimitedIgnore__TypeAssignment_1"
    // InternalCOV.g:3288:1: rule__LimitedIgnore__TypeAssignment_1 : ( ruleLimitationType ) ;
    public final void rule__LimitedIgnore__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3292:1: ( ( ruleLimitationType ) )
            // InternalCOV.g:3293:2: ( ruleLimitationType )
            {
            // InternalCOV.g:3293:2: ( ruleLimitationType )
            // InternalCOV.g:3294:3: ruleLimitationType
            {
             before(grammarAccess.getLimitedIgnoreAccess().getTypeLimitationTypeEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLimitationType();

            state._fsp--;

             after(grammarAccess.getLimitedIgnoreAccess().getTypeLimitationTypeEnumRuleCall_1_0()); 

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
    // $ANTLR end "rule__LimitedIgnore__TypeAssignment_1"


    // $ANTLR start "rule__LimitedIgnore__ContainerMetaclassAssignment_2"
    // InternalCOV.g:3303:1: rule__LimitedIgnore__ContainerMetaclassAssignment_2 : ( ( ruleEString ) ) ;
    public final void rule__LimitedIgnore__ContainerMetaclassAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3307:1: ( ( ( ruleEString ) ) )
            // InternalCOV.g:3308:2: ( ( ruleEString ) )
            {
            // InternalCOV.g:3308:2: ( ( ruleEString ) )
            // InternalCOV.g:3309:3: ( ruleEString )
            {
             before(grammarAccess.getLimitedIgnoreAccess().getContainerMetaclassEClassCrossReference_2_0()); 
            // InternalCOV.g:3310:3: ( ruleEString )
            // InternalCOV.g:3311:4: ruleEString
            {
             before(grammarAccess.getLimitedIgnoreAccess().getContainerMetaclassEClassEStringParserRuleCall_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getLimitedIgnoreAccess().getContainerMetaclassEClassEStringParserRuleCall_2_0_1()); 

            }

             after(grammarAccess.getLimitedIgnoreAccess().getContainerMetaclassEClassCrossReference_2_0()); 

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
    // $ANTLR end "rule__LimitedIgnore__ContainerMetaclassAssignment_2"


    // $ANTLR start "rule__LimitedIgnore__ContainerMetaclassAssignment_3_1"
    // InternalCOV.g:3322:1: rule__LimitedIgnore__ContainerMetaclassAssignment_3_1 : ( ( ruleEString ) ) ;
    public final void rule__LimitedIgnore__ContainerMetaclassAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3326:1: ( ( ( ruleEString ) ) )
            // InternalCOV.g:3327:2: ( ( ruleEString ) )
            {
            // InternalCOV.g:3327:2: ( ( ruleEString ) )
            // InternalCOV.g:3328:3: ( ruleEString )
            {
             before(grammarAccess.getLimitedIgnoreAccess().getContainerMetaclassEClassCrossReference_3_1_0()); 
            // InternalCOV.g:3329:3: ( ruleEString )
            // InternalCOV.g:3330:4: ruleEString
            {
             before(grammarAccess.getLimitedIgnoreAccess().getContainerMetaclassEClassEStringParserRuleCall_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getLimitedIgnoreAccess().getContainerMetaclassEClassEStringParserRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getLimitedIgnoreAccess().getContainerMetaclassEClassCrossReference_3_1_0()); 

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
    // $ANTLR end "rule__LimitedIgnore__ContainerMetaclassAssignment_3_1"


    // $ANTLR start "rule__LimitedIgnore__DescriptionAssignment_4_1"
    // InternalCOV.g:3341:1: rule__LimitedIgnore__DescriptionAssignment_4_1 : ( ruleEString ) ;
    public final void rule__LimitedIgnore__DescriptionAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3345:1: ( ( ruleEString ) )
            // InternalCOV.g:3346:2: ( ruleEString )
            {
            // InternalCOV.g:3346:2: ( ruleEString )
            // InternalCOV.g:3347:3: ruleEString
            {
             before(grammarAccess.getLimitedIgnoreAccess().getDescriptionEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getLimitedIgnoreAccess().getDescriptionEStringParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__LimitedIgnore__DescriptionAssignment_4_1"


    // $ANTLR start "rule__LimitedIgnore__ConditionAssignment_5_1"
    // InternalCOV.g:3356:1: rule__LimitedIgnore__ConditionAssignment_5_1 : ( ruleCondition ) ;
    public final void rule__LimitedIgnore__ConditionAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3360:1: ( ( ruleCondition ) )
            // InternalCOV.g:3361:2: ( ruleCondition )
            {
            // InternalCOV.g:3361:2: ( ruleCondition )
            // InternalCOV.g:3362:3: ruleCondition
            {
             before(grammarAccess.getLimitedIgnoreAccess().getConditionConditionParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getLimitedIgnoreAccess().getConditionConditionParserRuleCall_5_1_0()); 

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
    // $ANTLR end "rule__LimitedIgnore__ConditionAssignment_5_1"


    // $ANTLR start "rule__LimitedIgnore__ConditionAssignment_5_2"
    // InternalCOV.g:3371:1: rule__LimitedIgnore__ConditionAssignment_5_2 : ( ruleCondition ) ;
    public final void rule__LimitedIgnore__ConditionAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3375:1: ( ( ruleCondition ) )
            // InternalCOV.g:3376:2: ( ruleCondition )
            {
            // InternalCOV.g:3376:2: ( ruleCondition )
            // InternalCOV.g:3377:3: ruleCondition
            {
             before(grammarAccess.getLimitedIgnoreAccess().getConditionConditionParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getLimitedIgnoreAccess().getConditionConditionParserRuleCall_5_2_0()); 

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
    // $ANTLR end "rule__LimitedIgnore__ConditionAssignment_5_2"


    // $ANTLR start "rule__CoverageOfReferenced__ReferenceAssignment_1"
    // InternalCOV.g:3386:1: rule__CoverageOfReferenced__ReferenceAssignment_1 : ( ( ruleEString ) ) ;
    public final void rule__CoverageOfReferenced__ReferenceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3390:1: ( ( ( ruleEString ) ) )
            // InternalCOV.g:3391:2: ( ( ruleEString ) )
            {
            // InternalCOV.g:3391:2: ( ( ruleEString ) )
            // InternalCOV.g:3392:3: ( ruleEString )
            {
             before(grammarAccess.getCoverageOfReferencedAccess().getReferenceEReferenceCrossReference_1_0()); 
            // InternalCOV.g:3393:3: ( ruleEString )
            // InternalCOV.g:3394:4: ruleEString
            {
             before(grammarAccess.getCoverageOfReferencedAccess().getReferenceEReferenceEStringParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCoverageOfReferencedAccess().getReferenceEReferenceEStringParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getCoverageOfReferencedAccess().getReferenceEReferenceCrossReference_1_0()); 

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
    // $ANTLR end "rule__CoverageOfReferenced__ReferenceAssignment_1"


    // $ANTLR start "rule__CoverageOfReferenced__ReferenceAssignment_2_1"
    // InternalCOV.g:3405:1: rule__CoverageOfReferenced__ReferenceAssignment_2_1 : ( ( ruleEString ) ) ;
    public final void rule__CoverageOfReferenced__ReferenceAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3409:1: ( ( ( ruleEString ) ) )
            // InternalCOV.g:3410:2: ( ( ruleEString ) )
            {
            // InternalCOV.g:3410:2: ( ( ruleEString ) )
            // InternalCOV.g:3411:3: ( ruleEString )
            {
             before(grammarAccess.getCoverageOfReferencedAccess().getReferenceEReferenceCrossReference_2_1_0()); 
            // InternalCOV.g:3412:3: ( ruleEString )
            // InternalCOV.g:3413:4: ruleEString
            {
             before(grammarAccess.getCoverageOfReferencedAccess().getReferenceEReferenceEStringParserRuleCall_2_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCoverageOfReferencedAccess().getReferenceEReferenceEStringParserRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getCoverageOfReferencedAccess().getReferenceEReferenceCrossReference_2_1_0()); 

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
    // $ANTLR end "rule__CoverageOfReferenced__ReferenceAssignment_2_1"


    // $ANTLR start "rule__CoverageOfReferenced__DescriptionAssignment_3_1"
    // InternalCOV.g:3424:1: rule__CoverageOfReferenced__DescriptionAssignment_3_1 : ( ruleEString ) ;
    public final void rule__CoverageOfReferenced__DescriptionAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3428:1: ( ( ruleEString ) )
            // InternalCOV.g:3429:2: ( ruleEString )
            {
            // InternalCOV.g:3429:2: ( ruleEString )
            // InternalCOV.g:3430:3: ruleEString
            {
             before(grammarAccess.getCoverageOfReferencedAccess().getDescriptionEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCoverageOfReferencedAccess().getDescriptionEStringParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__CoverageOfReferenced__DescriptionAssignment_3_1"


    // $ANTLR start "rule__CoverageOfReferenced__ConditionAssignment_4_1"
    // InternalCOV.g:3439:1: rule__CoverageOfReferenced__ConditionAssignment_4_1 : ( ruleCondition ) ;
    public final void rule__CoverageOfReferenced__ConditionAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3443:1: ( ( ruleCondition ) )
            // InternalCOV.g:3444:2: ( ruleCondition )
            {
            // InternalCOV.g:3444:2: ( ruleCondition )
            // InternalCOV.g:3445:3: ruleCondition
            {
             before(grammarAccess.getCoverageOfReferencedAccess().getConditionConditionParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getCoverageOfReferencedAccess().getConditionConditionParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__CoverageOfReferenced__ConditionAssignment_4_1"


    // $ANTLR start "rule__CoverageOfReferenced__ConditionAssignment_4_2"
    // InternalCOV.g:3454:1: rule__CoverageOfReferenced__ConditionAssignment_4_2 : ( ruleCondition ) ;
    public final void rule__CoverageOfReferenced__ConditionAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3458:1: ( ( ruleCondition ) )
            // InternalCOV.g:3459:2: ( ruleCondition )
            {
            // InternalCOV.g:3459:2: ( ruleCondition )
            // InternalCOV.g:3460:3: ruleCondition
            {
             before(grammarAccess.getCoverageOfReferencedAccess().getConditionConditionParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getCoverageOfReferencedAccess().getConditionConditionParserRuleCall_4_2_0()); 

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
    // $ANTLR end "rule__CoverageOfReferenced__ConditionAssignment_4_2"


    // $ANTLR start "rule__CoverageByContent__MultiplicityAssignment_2"
    // InternalCOV.g:3469:1: rule__CoverageByContent__MultiplicityAssignment_2 : ( ruleCoveredContents ) ;
    public final void rule__CoverageByContent__MultiplicityAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3473:1: ( ( ruleCoveredContents ) )
            // InternalCOV.g:3474:2: ( ruleCoveredContents )
            {
            // InternalCOV.g:3474:2: ( ruleCoveredContents )
            // InternalCOV.g:3475:3: ruleCoveredContents
            {
             before(grammarAccess.getCoverageByContentAccess().getMultiplicityCoveredContentsEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleCoveredContents();

            state._fsp--;

             after(grammarAccess.getCoverageByContentAccess().getMultiplicityCoveredContentsEnumRuleCall_2_0()); 

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
    // $ANTLR end "rule__CoverageByContent__MultiplicityAssignment_2"


    // $ANTLR start "rule__CoverageByContent__ContainmentReferenceAssignment_3"
    // InternalCOV.g:3484:1: rule__CoverageByContent__ContainmentReferenceAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__CoverageByContent__ContainmentReferenceAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3488:1: ( ( ( ruleEString ) ) )
            // InternalCOV.g:3489:2: ( ( ruleEString ) )
            {
            // InternalCOV.g:3489:2: ( ( ruleEString ) )
            // InternalCOV.g:3490:3: ( ruleEString )
            {
             before(grammarAccess.getCoverageByContentAccess().getContainmentReferenceEReferenceCrossReference_3_0()); 
            // InternalCOV.g:3491:3: ( ruleEString )
            // InternalCOV.g:3492:4: ruleEString
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


    // $ANTLR start "rule__CoverageByContent__DescriptionAssignment_5_1"
    // InternalCOV.g:3503:1: rule__CoverageByContent__DescriptionAssignment_5_1 : ( ruleEString ) ;
    public final void rule__CoverageByContent__DescriptionAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3507:1: ( ( ruleEString ) )
            // InternalCOV.g:3508:2: ( ruleEString )
            {
            // InternalCOV.g:3508:2: ( ruleEString )
            // InternalCOV.g:3509:3: ruleEString
            {
             before(grammarAccess.getCoverageByContentAccess().getDescriptionEStringParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCoverageByContentAccess().getDescriptionEStringParserRuleCall_5_1_0()); 

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
    // $ANTLR end "rule__CoverageByContent__DescriptionAssignment_5_1"


    // $ANTLR start "rule__CoverageByContent__ConditionAssignment_6_1"
    // InternalCOV.g:3518:1: rule__CoverageByContent__ConditionAssignment_6_1 : ( ruleCondition ) ;
    public final void rule__CoverageByContent__ConditionAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3522:1: ( ( ruleCondition ) )
            // InternalCOV.g:3523:2: ( ruleCondition )
            {
            // InternalCOV.g:3523:2: ( ruleCondition )
            // InternalCOV.g:3524:3: ruleCondition
            {
             before(grammarAccess.getCoverageByContentAccess().getConditionConditionParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getCoverageByContentAccess().getConditionConditionParserRuleCall_6_1_0()); 

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
    // $ANTLR end "rule__CoverageByContent__ConditionAssignment_6_1"


    // $ANTLR start "rule__CoverageByContent__ConditionAssignment_6_2"
    // InternalCOV.g:3533:1: rule__CoverageByContent__ConditionAssignment_6_2 : ( ruleCondition ) ;
    public final void rule__CoverageByContent__ConditionAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3537:1: ( ( ruleCondition ) )
            // InternalCOV.g:3538:2: ( ruleCondition )
            {
            // InternalCOV.g:3538:2: ( ruleCondition )
            // InternalCOV.g:3539:3: ruleCondition
            {
             before(grammarAccess.getCoverageByContentAccess().getConditionConditionParserRuleCall_6_2_0()); 
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getCoverageByContentAccess().getConditionConditionParserRuleCall_6_2_0()); 

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
    // $ANTLR end "rule__CoverageByContent__ConditionAssignment_6_2"


    // $ANTLR start "rule__BranchSpecification__DescriptionAssignment_3_1"
    // InternalCOV.g:3548:1: rule__BranchSpecification__DescriptionAssignment_3_1 : ( ruleEString ) ;
    public final void rule__BranchSpecification__DescriptionAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3552:1: ( ( ruleEString ) )
            // InternalCOV.g:3553:2: ( ruleEString )
            {
            // InternalCOV.g:3553:2: ( ruleEString )
            // InternalCOV.g:3554:3: ruleEString
            {
             before(grammarAccess.getBranchSpecificationAccess().getDescriptionEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBranchSpecificationAccess().getDescriptionEStringParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__BranchSpecification__DescriptionAssignment_3_1"


    // $ANTLR start "rule__BranchSpecification__ConditionAssignment_4_1"
    // InternalCOV.g:3563:1: rule__BranchSpecification__ConditionAssignment_4_1 : ( ruleCondition ) ;
    public final void rule__BranchSpecification__ConditionAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3567:1: ( ( ruleCondition ) )
            // InternalCOV.g:3568:2: ( ruleCondition )
            {
            // InternalCOV.g:3568:2: ( ruleCondition )
            // InternalCOV.g:3569:3: ruleCondition
            {
             before(grammarAccess.getBranchSpecificationAccess().getConditionConditionParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getBranchSpecificationAccess().getConditionConditionParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__BranchSpecification__ConditionAssignment_4_1"


    // $ANTLR start "rule__BranchSpecification__ConditionAssignment_4_2"
    // InternalCOV.g:3578:1: rule__BranchSpecification__ConditionAssignment_4_2 : ( ruleCondition ) ;
    public final void rule__BranchSpecification__ConditionAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3582:1: ( ( ruleCondition ) )
            // InternalCOV.g:3583:2: ( ruleCondition )
            {
            // InternalCOV.g:3583:2: ( ruleCondition )
            // InternalCOV.g:3584:3: ruleCondition
            {
             before(grammarAccess.getBranchSpecificationAccess().getConditionConditionParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getBranchSpecificationAccess().getConditionConditionParserRuleCall_4_2_0()); 

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
    // $ANTLR end "rule__BranchSpecification__ConditionAssignment_4_2"


    // $ANTLR start "rule__BranchSpecification__BranchesAssignment_5"
    // InternalCOV.g:3593:1: rule__BranchSpecification__BranchesAssignment_5 : ( ruleBranch ) ;
    public final void rule__BranchSpecification__BranchesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3597:1: ( ( ruleBranch ) )
            // InternalCOV.g:3598:2: ( ruleBranch )
            {
            // InternalCOV.g:3598:2: ( ruleBranch )
            // InternalCOV.g:3599:3: ruleBranch
            {
             before(grammarAccess.getBranchSpecificationAccess().getBranchesBranchParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleBranch();

            state._fsp--;

             after(grammarAccess.getBranchSpecificationAccess().getBranchesBranchParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__BranchSpecification__BranchesAssignment_5"


    // $ANTLR start "rule__BranchSpecification__BranchesAssignment_6_1"
    // InternalCOV.g:3608:1: rule__BranchSpecification__BranchesAssignment_6_1 : ( ruleBranch ) ;
    public final void rule__BranchSpecification__BranchesAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3612:1: ( ( ruleBranch ) )
            // InternalCOV.g:3613:2: ( ruleBranch )
            {
            // InternalCOV.g:3613:2: ( ruleBranch )
            // InternalCOV.g:3614:3: ruleBranch
            {
             before(grammarAccess.getBranchSpecificationAccess().getBranchesBranchParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBranch();

            state._fsp--;

             after(grammarAccess.getBranchSpecificationAccess().getBranchesBranchParserRuleCall_6_1_0()); 

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
    // $ANTLR end "rule__BranchSpecification__BranchesAssignment_6_1"


    // $ANTLR start "rule__Branch__QueryAssignment_1"
    // InternalCOV.g:3623:1: rule__Branch__QueryAssignment_1 : ( ruleEString ) ;
    public final void rule__Branch__QueryAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3627:1: ( ( ruleEString ) )
            // InternalCOV.g:3628:2: ( ruleEString )
            {
            // InternalCOV.g:3628:2: ( ruleEString )
            // InternalCOV.g:3629:3: ruleEString
            {
             before(grammarAccess.getBranchAccess().getQueryEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBranchAccess().getQueryEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Branch__QueryAssignment_1"


    // $ANTLR start "rule__UnaryCondition__OperatorAssignment_0"
    // InternalCOV.g:3638:1: rule__UnaryCondition__OperatorAssignment_0 : ( ruleUnaryOperator ) ;
    public final void rule__UnaryCondition__OperatorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3642:1: ( ( ruleUnaryOperator ) )
            // InternalCOV.g:3643:2: ( ruleUnaryOperator )
            {
            // InternalCOV.g:3643:2: ( ruleUnaryOperator )
            // InternalCOV.g:3644:3: ruleUnaryOperator
            {
             before(grammarAccess.getUnaryConditionAccess().getOperatorUnaryOperatorEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleUnaryOperator();

            state._fsp--;

             after(grammarAccess.getUnaryConditionAccess().getOperatorUnaryOperatorEnumRuleCall_0_0()); 

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
    // $ANTLR end "rule__UnaryCondition__OperatorAssignment_0"


    // $ANTLR start "rule__UnaryCondition__ConstraintAssignment_1"
    // InternalCOV.g:3653:1: rule__UnaryCondition__ConstraintAssignment_1 : ( ruleEString ) ;
    public final void rule__UnaryCondition__ConstraintAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3657:1: ( ( ruleEString ) )
            // InternalCOV.g:3658:2: ( ruleEString )
            {
            // InternalCOV.g:3658:2: ( ruleEString )
            // InternalCOV.g:3659:3: ruleEString
            {
             before(grammarAccess.getUnaryConditionAccess().getConstraintEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getUnaryConditionAccess().getConstraintEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__UnaryCondition__ConstraintAssignment_1"


    // $ANTLR start "rule__BinaryCondition__ConstraintAssignment_0"
    // InternalCOV.g:3668:1: rule__BinaryCondition__ConstraintAssignment_0 : ( ruleEString ) ;
    public final void rule__BinaryCondition__ConstraintAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3672:1: ( ( ruleEString ) )
            // InternalCOV.g:3673:2: ( ruleEString )
            {
            // InternalCOV.g:3673:2: ( ruleEString )
            // InternalCOV.g:3674:3: ruleEString
            {
             before(grammarAccess.getBinaryConditionAccess().getConstraintEStringParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBinaryConditionAccess().getConstraintEStringParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__BinaryCondition__ConstraintAssignment_0"


    // $ANTLR start "rule__BinaryCondition__OperatorAssignment_1"
    // InternalCOV.g:3683:1: rule__BinaryCondition__OperatorAssignment_1 : ( ruleBinaryOperator ) ;
    public final void rule__BinaryCondition__OperatorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3687:1: ( ( ruleBinaryOperator ) )
            // InternalCOV.g:3688:2: ( ruleBinaryOperator )
            {
            // InternalCOV.g:3688:2: ( ruleBinaryOperator )
            // InternalCOV.g:3689:3: ruleBinaryOperator
            {
             before(grammarAccess.getBinaryConditionAccess().getOperatorBinaryOperatorEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBinaryOperator();

            state._fsp--;

             after(grammarAccess.getBinaryConditionAccess().getOperatorBinaryOperatorEnumRuleCall_1_0()); 

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
    // $ANTLR end "rule__BinaryCondition__OperatorAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000004E09000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000004E08000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000830L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000832L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000182000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000010180000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x000000000000C000L});

}