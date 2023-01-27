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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'true'", "'false'", "'ALL'", "'ONE'", "'containedBy'", "'notContainedBy'", "'ruleset'", "'{'", "'import'", "'metamodel'", "'}'", "','", "'context'", "'ignore'", "'('", "')'", "'subtypes'", "'description'", "'condition'", "'ignoreif'", "'covers'", "'covered'", "'when'", "'iscovered'", "'has'", "'branches'", "'queryBranch'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
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
    // InternalCOV.g:337:1: ruleCondition : ( ( rule__Condition__OCLConstraintAssignment ) ) ;
    public final void ruleCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:341:2: ( ( ( rule__Condition__OCLConstraintAssignment ) ) )
            // InternalCOV.g:342:2: ( ( rule__Condition__OCLConstraintAssignment ) )
            {
            // InternalCOV.g:342:2: ( ( rule__Condition__OCLConstraintAssignment ) )
            // InternalCOV.g:343:3: ( rule__Condition__OCLConstraintAssignment )
            {
             before(grammarAccess.getConditionAccess().getOCLConstraintAssignment()); 
            // InternalCOV.g:344:3: ( rule__Condition__OCLConstraintAssignment )
            // InternalCOV.g:344:4: rule__Condition__OCLConstraintAssignment
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
    // InternalCOV.g:353:1: ruleCoveredContents : ( ( rule__CoveredContents__Alternatives ) ) ;
    public final void ruleCoveredContents() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:357:1: ( ( ( rule__CoveredContents__Alternatives ) ) )
            // InternalCOV.g:358:2: ( ( rule__CoveredContents__Alternatives ) )
            {
            // InternalCOV.g:358:2: ( ( rule__CoveredContents__Alternatives ) )
            // InternalCOV.g:359:3: ( rule__CoveredContents__Alternatives )
            {
             before(grammarAccess.getCoveredContentsAccess().getAlternatives()); 
            // InternalCOV.g:360:3: ( rule__CoveredContents__Alternatives )
            // InternalCOV.g:360:4: rule__CoveredContents__Alternatives
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
    // InternalCOV.g:369:1: ruleLimitationType : ( ( rule__LimitationType__Alternatives ) ) ;
    public final void ruleLimitationType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:373:1: ( ( ( rule__LimitationType__Alternatives ) ) )
            // InternalCOV.g:374:2: ( ( rule__LimitationType__Alternatives ) )
            {
            // InternalCOV.g:374:2: ( ( rule__LimitationType__Alternatives ) )
            // InternalCOV.g:375:3: ( rule__LimitationType__Alternatives )
            {
             before(grammarAccess.getLimitationTypeAccess().getAlternatives()); 
            // InternalCOV.g:376:3: ( rule__LimitationType__Alternatives )
            // InternalCOV.g:376:4: rule__LimitationType__Alternatives
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
    // InternalCOV.g:384:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:388:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalCOV.g:389:2: ( RULE_STRING )
                    {
                    // InternalCOV.g:389:2: ( RULE_STRING )
                    // InternalCOV.g:390:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCOV.g:395:2: ( RULE_ID )
                    {
                    // InternalCOV.g:395:2: ( RULE_ID )
                    // InternalCOV.g:396:3: RULE_ID
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
    // InternalCOV.g:405:1: rule__Rule__Alternatives : ( ( ruleIgnore ) | ( ruleCoverageOfReferenced ) | ( ruleCoverageByContent ) | ( ruleLimitedIgnore ) | ( ruleBranchSpecification ) );
    public final void rule__Rule__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:409:1: ( ( ruleIgnore ) | ( ruleCoverageOfReferenced ) | ( ruleCoverageByContent ) | ( ruleLimitedIgnore ) | ( ruleBranchSpecification ) )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt2=1;
                }
                break;
            case 31:
                {
                alt2=2;
                }
                break;
            case 32:
                {
                alt2=3;
                }
                break;
            case 30:
                {
                alt2=4;
                }
                break;
            case 35:
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
                    // InternalCOV.g:410:2: ( ruleIgnore )
                    {
                    // InternalCOV.g:410:2: ( ruleIgnore )
                    // InternalCOV.g:411:3: ruleIgnore
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
                    // InternalCOV.g:416:2: ( ruleCoverageOfReferenced )
                    {
                    // InternalCOV.g:416:2: ( ruleCoverageOfReferenced )
                    // InternalCOV.g:417:3: ruleCoverageOfReferenced
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
                    // InternalCOV.g:422:2: ( ruleCoverageByContent )
                    {
                    // InternalCOV.g:422:2: ( ruleCoverageByContent )
                    // InternalCOV.g:423:3: ruleCoverageByContent
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
                    // InternalCOV.g:428:2: ( ruleLimitedIgnore )
                    {
                    // InternalCOV.g:428:2: ( ruleLimitedIgnore )
                    // InternalCOV.g:429:3: ruleLimitedIgnore
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
                    // InternalCOV.g:434:2: ( ruleBranchSpecification )
                    {
                    // InternalCOV.g:434:2: ( ruleBranchSpecification )
                    // InternalCOV.g:435:3: ruleBranchSpecification
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
    // InternalCOV.g:444:1: rule__EBoolean__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__EBoolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:448:1: ( ( 'true' ) | ( 'false' ) )
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
                    // InternalCOV.g:449:2: ( 'true' )
                    {
                    // InternalCOV.g:449:2: ( 'true' )
                    // InternalCOV.g:450:3: 'true'
                    {
                     before(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCOV.g:455:2: ( 'false' )
                    {
                    // InternalCOV.g:455:2: ( 'false' )
                    // InternalCOV.g:456:3: 'false'
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
    // InternalCOV.g:465:1: rule__CoveredContents__Alternatives : ( ( ( 'ALL' ) ) | ( ( 'ONE' ) ) );
    public final void rule__CoveredContents__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:469:1: ( ( ( 'ALL' ) ) | ( ( 'ONE' ) ) )
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
                    // InternalCOV.g:470:2: ( ( 'ALL' ) )
                    {
                    // InternalCOV.g:470:2: ( ( 'ALL' ) )
                    // InternalCOV.g:471:3: ( 'ALL' )
                    {
                     before(grammarAccess.getCoveredContentsAccess().getALLEnumLiteralDeclaration_0()); 
                    // InternalCOV.g:472:3: ( 'ALL' )
                    // InternalCOV.g:472:4: 'ALL'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getCoveredContentsAccess().getALLEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCOV.g:476:2: ( ( 'ONE' ) )
                    {
                    // InternalCOV.g:476:2: ( ( 'ONE' ) )
                    // InternalCOV.g:477:3: ( 'ONE' )
                    {
                     before(grammarAccess.getCoveredContentsAccess().getONEEnumLiteralDeclaration_1()); 
                    // InternalCOV.g:478:3: ( 'ONE' )
                    // InternalCOV.g:478:4: 'ONE'
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
    // InternalCOV.g:486:1: rule__LimitationType__Alternatives : ( ( ( 'containedBy' ) ) | ( ( 'notContainedBy' ) ) );
    public final void rule__LimitationType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:490:1: ( ( ( 'containedBy' ) ) | ( ( 'notContainedBy' ) ) )
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
                    // InternalCOV.g:491:2: ( ( 'containedBy' ) )
                    {
                    // InternalCOV.g:491:2: ( ( 'containedBy' ) )
                    // InternalCOV.g:492:3: ( 'containedBy' )
                    {
                     before(grammarAccess.getLimitationTypeAccess().getContainedByEnumLiteralDeclaration_0()); 
                    // InternalCOV.g:493:3: ( 'containedBy' )
                    // InternalCOV.g:493:4: 'containedBy'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getLimitationTypeAccess().getContainedByEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCOV.g:497:2: ( ( 'notContainedBy' ) )
                    {
                    // InternalCOV.g:497:2: ( ( 'notContainedBy' ) )
                    // InternalCOV.g:498:3: ( 'notContainedBy' )
                    {
                     before(grammarAccess.getLimitationTypeAccess().getNotContainedByEnumLiteralDeclaration_1()); 
                    // InternalCOV.g:499:3: ( 'notContainedBy' )
                    // InternalCOV.g:499:4: 'notContainedBy'
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
    // InternalCOV.g:507:1: rule__DomainSpecificCoverage__Group__0 : rule__DomainSpecificCoverage__Group__0__Impl rule__DomainSpecificCoverage__Group__1 ;
    public final void rule__DomainSpecificCoverage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:511:1: ( rule__DomainSpecificCoverage__Group__0__Impl rule__DomainSpecificCoverage__Group__1 )
            // InternalCOV.g:512:2: rule__DomainSpecificCoverage__Group__0__Impl rule__DomainSpecificCoverage__Group__1
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
    // InternalCOV.g:519:1: rule__DomainSpecificCoverage__Group__0__Impl : ( 'ruleset' ) ;
    public final void rule__DomainSpecificCoverage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:523:1: ( ( 'ruleset' ) )
            // InternalCOV.g:524:1: ( 'ruleset' )
            {
            // InternalCOV.g:524:1: ( 'ruleset' )
            // InternalCOV.g:525:2: 'ruleset'
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
    // InternalCOV.g:534:1: rule__DomainSpecificCoverage__Group__1 : rule__DomainSpecificCoverage__Group__1__Impl rule__DomainSpecificCoverage__Group__2 ;
    public final void rule__DomainSpecificCoverage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:538:1: ( rule__DomainSpecificCoverage__Group__1__Impl rule__DomainSpecificCoverage__Group__2 )
            // InternalCOV.g:539:2: rule__DomainSpecificCoverage__Group__1__Impl rule__DomainSpecificCoverage__Group__2
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
    // InternalCOV.g:546:1: rule__DomainSpecificCoverage__Group__1__Impl : ( ( rule__DomainSpecificCoverage__NameAssignment_1 ) ) ;
    public final void rule__DomainSpecificCoverage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:550:1: ( ( ( rule__DomainSpecificCoverage__NameAssignment_1 ) ) )
            // InternalCOV.g:551:1: ( ( rule__DomainSpecificCoverage__NameAssignment_1 ) )
            {
            // InternalCOV.g:551:1: ( ( rule__DomainSpecificCoverage__NameAssignment_1 ) )
            // InternalCOV.g:552:2: ( rule__DomainSpecificCoverage__NameAssignment_1 )
            {
             before(grammarAccess.getDomainSpecificCoverageAccess().getNameAssignment_1()); 
            // InternalCOV.g:553:2: ( rule__DomainSpecificCoverage__NameAssignment_1 )
            // InternalCOV.g:553:3: rule__DomainSpecificCoverage__NameAssignment_1
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
    // InternalCOV.g:561:1: rule__DomainSpecificCoverage__Group__2 : rule__DomainSpecificCoverage__Group__2__Impl rule__DomainSpecificCoverage__Group__3 ;
    public final void rule__DomainSpecificCoverage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:565:1: ( rule__DomainSpecificCoverage__Group__2__Impl rule__DomainSpecificCoverage__Group__3 )
            // InternalCOV.g:566:2: rule__DomainSpecificCoverage__Group__2__Impl rule__DomainSpecificCoverage__Group__3
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
    // InternalCOV.g:573:1: rule__DomainSpecificCoverage__Group__2__Impl : ( '{' ) ;
    public final void rule__DomainSpecificCoverage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:577:1: ( ( '{' ) )
            // InternalCOV.g:578:1: ( '{' )
            {
            // InternalCOV.g:578:1: ( '{' )
            // InternalCOV.g:579:2: '{'
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
    // InternalCOV.g:588:1: rule__DomainSpecificCoverage__Group__3 : rule__DomainSpecificCoverage__Group__3__Impl rule__DomainSpecificCoverage__Group__4 ;
    public final void rule__DomainSpecificCoverage__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:592:1: ( rule__DomainSpecificCoverage__Group__3__Impl rule__DomainSpecificCoverage__Group__4 )
            // InternalCOV.g:593:2: rule__DomainSpecificCoverage__Group__3__Impl rule__DomainSpecificCoverage__Group__4
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
    // InternalCOV.g:600:1: rule__DomainSpecificCoverage__Group__3__Impl : ( 'import' ) ;
    public final void rule__DomainSpecificCoverage__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:604:1: ( ( 'import' ) )
            // InternalCOV.g:605:1: ( 'import' )
            {
            // InternalCOV.g:605:1: ( 'import' )
            // InternalCOV.g:606:2: 'import'
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
    // InternalCOV.g:615:1: rule__DomainSpecificCoverage__Group__4 : rule__DomainSpecificCoverage__Group__4__Impl rule__DomainSpecificCoverage__Group__5 ;
    public final void rule__DomainSpecificCoverage__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:619:1: ( rule__DomainSpecificCoverage__Group__4__Impl rule__DomainSpecificCoverage__Group__5 )
            // InternalCOV.g:620:2: rule__DomainSpecificCoverage__Group__4__Impl rule__DomainSpecificCoverage__Group__5
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
    // InternalCOV.g:627:1: rule__DomainSpecificCoverage__Group__4__Impl : ( 'metamodel' ) ;
    public final void rule__DomainSpecificCoverage__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:631:1: ( ( 'metamodel' ) )
            // InternalCOV.g:632:1: ( 'metamodel' )
            {
            // InternalCOV.g:632:1: ( 'metamodel' )
            // InternalCOV.g:633:2: 'metamodel'
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
    // InternalCOV.g:642:1: rule__DomainSpecificCoverage__Group__5 : rule__DomainSpecificCoverage__Group__5__Impl rule__DomainSpecificCoverage__Group__6 ;
    public final void rule__DomainSpecificCoverage__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:646:1: ( rule__DomainSpecificCoverage__Group__5__Impl rule__DomainSpecificCoverage__Group__6 )
            // InternalCOV.g:647:2: rule__DomainSpecificCoverage__Group__5__Impl rule__DomainSpecificCoverage__Group__6
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
    // InternalCOV.g:654:1: rule__DomainSpecificCoverage__Group__5__Impl : ( ( rule__DomainSpecificCoverage__MetamodelAssignment_5 ) ) ;
    public final void rule__DomainSpecificCoverage__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:658:1: ( ( ( rule__DomainSpecificCoverage__MetamodelAssignment_5 ) ) )
            // InternalCOV.g:659:1: ( ( rule__DomainSpecificCoverage__MetamodelAssignment_5 ) )
            {
            // InternalCOV.g:659:1: ( ( rule__DomainSpecificCoverage__MetamodelAssignment_5 ) )
            // InternalCOV.g:660:2: ( rule__DomainSpecificCoverage__MetamodelAssignment_5 )
            {
             before(grammarAccess.getDomainSpecificCoverageAccess().getMetamodelAssignment_5()); 
            // InternalCOV.g:661:2: ( rule__DomainSpecificCoverage__MetamodelAssignment_5 )
            // InternalCOV.g:661:3: rule__DomainSpecificCoverage__MetamodelAssignment_5
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
    // InternalCOV.g:669:1: rule__DomainSpecificCoverage__Group__6 : rule__DomainSpecificCoverage__Group__6__Impl rule__DomainSpecificCoverage__Group__7 ;
    public final void rule__DomainSpecificCoverage__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:673:1: ( rule__DomainSpecificCoverage__Group__6__Impl rule__DomainSpecificCoverage__Group__7 )
            // InternalCOV.g:674:2: rule__DomainSpecificCoverage__Group__6__Impl rule__DomainSpecificCoverage__Group__7
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
    // InternalCOV.g:681:1: rule__DomainSpecificCoverage__Group__6__Impl : ( ( rule__DomainSpecificCoverage__ContextsAssignment_6 ) ) ;
    public final void rule__DomainSpecificCoverage__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:685:1: ( ( ( rule__DomainSpecificCoverage__ContextsAssignment_6 ) ) )
            // InternalCOV.g:686:1: ( ( rule__DomainSpecificCoverage__ContextsAssignment_6 ) )
            {
            // InternalCOV.g:686:1: ( ( rule__DomainSpecificCoverage__ContextsAssignment_6 ) )
            // InternalCOV.g:687:2: ( rule__DomainSpecificCoverage__ContextsAssignment_6 )
            {
             before(grammarAccess.getDomainSpecificCoverageAccess().getContextsAssignment_6()); 
            // InternalCOV.g:688:2: ( rule__DomainSpecificCoverage__ContextsAssignment_6 )
            // InternalCOV.g:688:3: rule__DomainSpecificCoverage__ContextsAssignment_6
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
    // InternalCOV.g:696:1: rule__DomainSpecificCoverage__Group__7 : rule__DomainSpecificCoverage__Group__7__Impl rule__DomainSpecificCoverage__Group__8 ;
    public final void rule__DomainSpecificCoverage__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:700:1: ( rule__DomainSpecificCoverage__Group__7__Impl rule__DomainSpecificCoverage__Group__8 )
            // InternalCOV.g:701:2: rule__DomainSpecificCoverage__Group__7__Impl rule__DomainSpecificCoverage__Group__8
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
    // InternalCOV.g:708:1: rule__DomainSpecificCoverage__Group__7__Impl : ( ( rule__DomainSpecificCoverage__Group_7__0 )* ) ;
    public final void rule__DomainSpecificCoverage__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:712:1: ( ( ( rule__DomainSpecificCoverage__Group_7__0 )* ) )
            // InternalCOV.g:713:1: ( ( rule__DomainSpecificCoverage__Group_7__0 )* )
            {
            // InternalCOV.g:713:1: ( ( rule__DomainSpecificCoverage__Group_7__0 )* )
            // InternalCOV.g:714:2: ( rule__DomainSpecificCoverage__Group_7__0 )*
            {
             before(grammarAccess.getDomainSpecificCoverageAccess().getGroup_7()); 
            // InternalCOV.g:715:2: ( rule__DomainSpecificCoverage__Group_7__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==22) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalCOV.g:715:3: rule__DomainSpecificCoverage__Group_7__0
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
    // InternalCOV.g:723:1: rule__DomainSpecificCoverage__Group__8 : rule__DomainSpecificCoverage__Group__8__Impl ;
    public final void rule__DomainSpecificCoverage__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:727:1: ( rule__DomainSpecificCoverage__Group__8__Impl )
            // InternalCOV.g:728:2: rule__DomainSpecificCoverage__Group__8__Impl
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
    // InternalCOV.g:734:1: rule__DomainSpecificCoverage__Group__8__Impl : ( '}' ) ;
    public final void rule__DomainSpecificCoverage__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:738:1: ( ( '}' ) )
            // InternalCOV.g:739:1: ( '}' )
            {
            // InternalCOV.g:739:1: ( '}' )
            // InternalCOV.g:740:2: '}'
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
    // InternalCOV.g:750:1: rule__DomainSpecificCoverage__Group_7__0 : rule__DomainSpecificCoverage__Group_7__0__Impl rule__DomainSpecificCoverage__Group_7__1 ;
    public final void rule__DomainSpecificCoverage__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:754:1: ( rule__DomainSpecificCoverage__Group_7__0__Impl rule__DomainSpecificCoverage__Group_7__1 )
            // InternalCOV.g:755:2: rule__DomainSpecificCoverage__Group_7__0__Impl rule__DomainSpecificCoverage__Group_7__1
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
    // InternalCOV.g:762:1: rule__DomainSpecificCoverage__Group_7__0__Impl : ( ',' ) ;
    public final void rule__DomainSpecificCoverage__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:766:1: ( ( ',' ) )
            // InternalCOV.g:767:1: ( ',' )
            {
            // InternalCOV.g:767:1: ( ',' )
            // InternalCOV.g:768:2: ','
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
    // InternalCOV.g:777:1: rule__DomainSpecificCoverage__Group_7__1 : rule__DomainSpecificCoverage__Group_7__1__Impl ;
    public final void rule__DomainSpecificCoverage__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:781:1: ( rule__DomainSpecificCoverage__Group_7__1__Impl )
            // InternalCOV.g:782:2: rule__DomainSpecificCoverage__Group_7__1__Impl
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
    // InternalCOV.g:788:1: rule__DomainSpecificCoverage__Group_7__1__Impl : ( ( rule__DomainSpecificCoverage__ContextsAssignment_7_1 ) ) ;
    public final void rule__DomainSpecificCoverage__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:792:1: ( ( ( rule__DomainSpecificCoverage__ContextsAssignment_7_1 ) ) )
            // InternalCOV.g:793:1: ( ( rule__DomainSpecificCoverage__ContextsAssignment_7_1 ) )
            {
            // InternalCOV.g:793:1: ( ( rule__DomainSpecificCoverage__ContextsAssignment_7_1 ) )
            // InternalCOV.g:794:2: ( rule__DomainSpecificCoverage__ContextsAssignment_7_1 )
            {
             before(grammarAccess.getDomainSpecificCoverageAccess().getContextsAssignment_7_1()); 
            // InternalCOV.g:795:2: ( rule__DomainSpecificCoverage__ContextsAssignment_7_1 )
            // InternalCOV.g:795:3: rule__DomainSpecificCoverage__ContextsAssignment_7_1
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
    // InternalCOV.g:804:1: rule__Context__Group__0 : rule__Context__Group__0__Impl rule__Context__Group__1 ;
    public final void rule__Context__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:808:1: ( rule__Context__Group__0__Impl rule__Context__Group__1 )
            // InternalCOV.g:809:2: rule__Context__Group__0__Impl rule__Context__Group__1
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
    // InternalCOV.g:816:1: rule__Context__Group__0__Impl : ( 'context' ) ;
    public final void rule__Context__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:820:1: ( ( 'context' ) )
            // InternalCOV.g:821:1: ( 'context' )
            {
            // InternalCOV.g:821:1: ( 'context' )
            // InternalCOV.g:822:2: 'context'
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
    // InternalCOV.g:831:1: rule__Context__Group__1 : rule__Context__Group__1__Impl rule__Context__Group__2 ;
    public final void rule__Context__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:835:1: ( rule__Context__Group__1__Impl rule__Context__Group__2 )
            // InternalCOV.g:836:2: rule__Context__Group__1__Impl rule__Context__Group__2
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
    // InternalCOV.g:843:1: rule__Context__Group__1__Impl : ( ( rule__Context__MetaclassAssignment_1 ) ) ;
    public final void rule__Context__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:847:1: ( ( ( rule__Context__MetaclassAssignment_1 ) ) )
            // InternalCOV.g:848:1: ( ( rule__Context__MetaclassAssignment_1 ) )
            {
            // InternalCOV.g:848:1: ( ( rule__Context__MetaclassAssignment_1 ) )
            // InternalCOV.g:849:2: ( rule__Context__MetaclassAssignment_1 )
            {
             before(grammarAccess.getContextAccess().getMetaclassAssignment_1()); 
            // InternalCOV.g:850:2: ( rule__Context__MetaclassAssignment_1 )
            // InternalCOV.g:850:3: rule__Context__MetaclassAssignment_1
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
    // InternalCOV.g:858:1: rule__Context__Group__2 : rule__Context__Group__2__Impl rule__Context__Group__3 ;
    public final void rule__Context__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:862:1: ( rule__Context__Group__2__Impl rule__Context__Group__3 )
            // InternalCOV.g:863:2: rule__Context__Group__2__Impl rule__Context__Group__3
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
    // InternalCOV.g:870:1: rule__Context__Group__2__Impl : ( '{' ) ;
    public final void rule__Context__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:874:1: ( ( '{' ) )
            // InternalCOV.g:875:1: ( '{' )
            {
            // InternalCOV.g:875:1: ( '{' )
            // InternalCOV.g:876:2: '{'
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
    // InternalCOV.g:885:1: rule__Context__Group__3 : rule__Context__Group__3__Impl rule__Context__Group__4 ;
    public final void rule__Context__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:889:1: ( rule__Context__Group__3__Impl rule__Context__Group__4 )
            // InternalCOV.g:890:2: rule__Context__Group__3__Impl rule__Context__Group__4
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
    // InternalCOV.g:897:1: rule__Context__Group__3__Impl : ( ( rule__Context__Group_3__0 )? ) ;
    public final void rule__Context__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:901:1: ( ( ( rule__Context__Group_3__0 )? ) )
            // InternalCOV.g:902:1: ( ( rule__Context__Group_3__0 )? )
            {
            // InternalCOV.g:902:1: ( ( rule__Context__Group_3__0 )? )
            // InternalCOV.g:903:2: ( rule__Context__Group_3__0 )?
            {
             before(grammarAccess.getContextAccess().getGroup_3()); 
            // InternalCOV.g:904:2: ( rule__Context__Group_3__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==24||(LA7_0>=30 && LA7_0<=32)||LA7_0==35) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalCOV.g:904:3: rule__Context__Group_3__0
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
    // InternalCOV.g:912:1: rule__Context__Group__4 : rule__Context__Group__4__Impl ;
    public final void rule__Context__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:916:1: ( rule__Context__Group__4__Impl )
            // InternalCOV.g:917:2: rule__Context__Group__4__Impl
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
    // InternalCOV.g:923:1: rule__Context__Group__4__Impl : ( '}' ) ;
    public final void rule__Context__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:927:1: ( ( '}' ) )
            // InternalCOV.g:928:1: ( '}' )
            {
            // InternalCOV.g:928:1: ( '}' )
            // InternalCOV.g:929:2: '}'
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
    // InternalCOV.g:939:1: rule__Context__Group_3__0 : rule__Context__Group_3__0__Impl rule__Context__Group_3__1 ;
    public final void rule__Context__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:943:1: ( rule__Context__Group_3__0__Impl rule__Context__Group_3__1 )
            // InternalCOV.g:944:2: rule__Context__Group_3__0__Impl rule__Context__Group_3__1
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
    // InternalCOV.g:951:1: rule__Context__Group_3__0__Impl : ( ( rule__Context__RulesAssignment_3_0 ) ) ;
    public final void rule__Context__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:955:1: ( ( ( rule__Context__RulesAssignment_3_0 ) ) )
            // InternalCOV.g:956:1: ( ( rule__Context__RulesAssignment_3_0 ) )
            {
            // InternalCOV.g:956:1: ( ( rule__Context__RulesAssignment_3_0 ) )
            // InternalCOV.g:957:2: ( rule__Context__RulesAssignment_3_0 )
            {
             before(grammarAccess.getContextAccess().getRulesAssignment_3_0()); 
            // InternalCOV.g:958:2: ( rule__Context__RulesAssignment_3_0 )
            // InternalCOV.g:958:3: rule__Context__RulesAssignment_3_0
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
    // InternalCOV.g:966:1: rule__Context__Group_3__1 : rule__Context__Group_3__1__Impl ;
    public final void rule__Context__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:970:1: ( rule__Context__Group_3__1__Impl )
            // InternalCOV.g:971:2: rule__Context__Group_3__1__Impl
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
    // InternalCOV.g:977:1: rule__Context__Group_3__1__Impl : ( ( rule__Context__Group_3_1__0 )* ) ;
    public final void rule__Context__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:981:1: ( ( ( rule__Context__Group_3_1__0 )* ) )
            // InternalCOV.g:982:1: ( ( rule__Context__Group_3_1__0 )* )
            {
            // InternalCOV.g:982:1: ( ( rule__Context__Group_3_1__0 )* )
            // InternalCOV.g:983:2: ( rule__Context__Group_3_1__0 )*
            {
             before(grammarAccess.getContextAccess().getGroup_3_1()); 
            // InternalCOV.g:984:2: ( rule__Context__Group_3_1__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==22) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalCOV.g:984:3: rule__Context__Group_3_1__0
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
    // InternalCOV.g:993:1: rule__Context__Group_3_1__0 : rule__Context__Group_3_1__0__Impl rule__Context__Group_3_1__1 ;
    public final void rule__Context__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:997:1: ( rule__Context__Group_3_1__0__Impl rule__Context__Group_3_1__1 )
            // InternalCOV.g:998:2: rule__Context__Group_3_1__0__Impl rule__Context__Group_3_1__1
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
    // InternalCOV.g:1005:1: rule__Context__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__Context__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1009:1: ( ( ',' ) )
            // InternalCOV.g:1010:1: ( ',' )
            {
            // InternalCOV.g:1010:1: ( ',' )
            // InternalCOV.g:1011:2: ','
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
    // InternalCOV.g:1020:1: rule__Context__Group_3_1__1 : rule__Context__Group_3_1__1__Impl ;
    public final void rule__Context__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1024:1: ( rule__Context__Group_3_1__1__Impl )
            // InternalCOV.g:1025:2: rule__Context__Group_3_1__1__Impl
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
    // InternalCOV.g:1031:1: rule__Context__Group_3_1__1__Impl : ( ( rule__Context__RulesAssignment_3_1_1 ) ) ;
    public final void rule__Context__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1035:1: ( ( ( rule__Context__RulesAssignment_3_1_1 ) ) )
            // InternalCOV.g:1036:1: ( ( rule__Context__RulesAssignment_3_1_1 ) )
            {
            // InternalCOV.g:1036:1: ( ( rule__Context__RulesAssignment_3_1_1 ) )
            // InternalCOV.g:1037:2: ( rule__Context__RulesAssignment_3_1_1 )
            {
             before(grammarAccess.getContextAccess().getRulesAssignment_3_1_1()); 
            // InternalCOV.g:1038:2: ( rule__Context__RulesAssignment_3_1_1 )
            // InternalCOV.g:1038:3: rule__Context__RulesAssignment_3_1_1
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
    // InternalCOV.g:1047:1: rule__Ignore__Group__0 : rule__Ignore__Group__0__Impl rule__Ignore__Group__1 ;
    public final void rule__Ignore__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1051:1: ( rule__Ignore__Group__0__Impl rule__Ignore__Group__1 )
            // InternalCOV.g:1052:2: rule__Ignore__Group__0__Impl rule__Ignore__Group__1
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
    // InternalCOV.g:1059:1: rule__Ignore__Group__0__Impl : ( () ) ;
    public final void rule__Ignore__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1063:1: ( ( () ) )
            // InternalCOV.g:1064:1: ( () )
            {
            // InternalCOV.g:1064:1: ( () )
            // InternalCOV.g:1065:2: ()
            {
             before(grammarAccess.getIgnoreAccess().getIgnoreAction_0()); 
            // InternalCOV.g:1066:2: ()
            // InternalCOV.g:1066:3: 
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
    // InternalCOV.g:1074:1: rule__Ignore__Group__1 : rule__Ignore__Group__1__Impl rule__Ignore__Group__2 ;
    public final void rule__Ignore__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1078:1: ( rule__Ignore__Group__1__Impl rule__Ignore__Group__2 )
            // InternalCOV.g:1079:2: rule__Ignore__Group__1__Impl rule__Ignore__Group__2
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
    // InternalCOV.g:1086:1: rule__Ignore__Group__1__Impl : ( 'ignore' ) ;
    public final void rule__Ignore__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1090:1: ( ( 'ignore' ) )
            // InternalCOV.g:1091:1: ( 'ignore' )
            {
            // InternalCOV.g:1091:1: ( 'ignore' )
            // InternalCOV.g:1092:2: 'ignore'
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
    // InternalCOV.g:1101:1: rule__Ignore__Group__2 : rule__Ignore__Group__2__Impl rule__Ignore__Group__3 ;
    public final void rule__Ignore__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1105:1: ( rule__Ignore__Group__2__Impl rule__Ignore__Group__3 )
            // InternalCOV.g:1106:2: rule__Ignore__Group__2__Impl rule__Ignore__Group__3
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
    // InternalCOV.g:1113:1: rule__Ignore__Group__2__Impl : ( '(' ) ;
    public final void rule__Ignore__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1117:1: ( ( '(' ) )
            // InternalCOV.g:1118:1: ( '(' )
            {
            // InternalCOV.g:1118:1: ( '(' )
            // InternalCOV.g:1119:2: '('
            {
             before(grammarAccess.getIgnoreAccess().getLeftParenthesisKeyword_2()); 
            match(input,25,FOLLOW_2); 
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
    // InternalCOV.g:1128:1: rule__Ignore__Group__3 : rule__Ignore__Group__3__Impl rule__Ignore__Group__4 ;
    public final void rule__Ignore__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1132:1: ( rule__Ignore__Group__3__Impl rule__Ignore__Group__4 )
            // InternalCOV.g:1133:2: rule__Ignore__Group__3__Impl rule__Ignore__Group__4
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
    // InternalCOV.g:1140:1: rule__Ignore__Group__3__Impl : ( ( rule__Ignore__Group_3__0 )? ) ;
    public final void rule__Ignore__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1144:1: ( ( ( rule__Ignore__Group_3__0 )? ) )
            // InternalCOV.g:1145:1: ( ( rule__Ignore__Group_3__0 )? )
            {
            // InternalCOV.g:1145:1: ( ( rule__Ignore__Group_3__0 )? )
            // InternalCOV.g:1146:2: ( rule__Ignore__Group_3__0 )?
            {
             before(grammarAccess.getIgnoreAccess().getGroup_3()); 
            // InternalCOV.g:1147:2: ( rule__Ignore__Group_3__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==27) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalCOV.g:1147:3: rule__Ignore__Group_3__0
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
    // InternalCOV.g:1155:1: rule__Ignore__Group__4 : rule__Ignore__Group__4__Impl rule__Ignore__Group__5 ;
    public final void rule__Ignore__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1159:1: ( rule__Ignore__Group__4__Impl rule__Ignore__Group__5 )
            // InternalCOV.g:1160:2: rule__Ignore__Group__4__Impl rule__Ignore__Group__5
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
    // InternalCOV.g:1167:1: rule__Ignore__Group__4__Impl : ( ')' ) ;
    public final void rule__Ignore__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1171:1: ( ( ')' ) )
            // InternalCOV.g:1172:1: ( ')' )
            {
            // InternalCOV.g:1172:1: ( ')' )
            // InternalCOV.g:1173:2: ')'
            {
             before(grammarAccess.getIgnoreAccess().getRightParenthesisKeyword_4()); 
            match(input,26,FOLLOW_2); 
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
    // InternalCOV.g:1182:1: rule__Ignore__Group__5 : rule__Ignore__Group__5__Impl rule__Ignore__Group__6 ;
    public final void rule__Ignore__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1186:1: ( rule__Ignore__Group__5__Impl rule__Ignore__Group__6 )
            // InternalCOV.g:1187:2: rule__Ignore__Group__5__Impl rule__Ignore__Group__6
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
    // InternalCOV.g:1194:1: rule__Ignore__Group__5__Impl : ( ( rule__Ignore__Group_5__0 )? ) ;
    public final void rule__Ignore__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1198:1: ( ( ( rule__Ignore__Group_5__0 )? ) )
            // InternalCOV.g:1199:1: ( ( rule__Ignore__Group_5__0 )? )
            {
            // InternalCOV.g:1199:1: ( ( rule__Ignore__Group_5__0 )? )
            // InternalCOV.g:1200:2: ( rule__Ignore__Group_5__0 )?
            {
             before(grammarAccess.getIgnoreAccess().getGroup_5()); 
            // InternalCOV.g:1201:2: ( rule__Ignore__Group_5__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==28) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalCOV.g:1201:3: rule__Ignore__Group_5__0
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
    // InternalCOV.g:1209:1: rule__Ignore__Group__6 : rule__Ignore__Group__6__Impl ;
    public final void rule__Ignore__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1213:1: ( rule__Ignore__Group__6__Impl )
            // InternalCOV.g:1214:2: rule__Ignore__Group__6__Impl
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
    // InternalCOV.g:1220:1: rule__Ignore__Group__6__Impl : ( ( rule__Ignore__Group_6__0 )? ) ;
    public final void rule__Ignore__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1224:1: ( ( ( rule__Ignore__Group_6__0 )? ) )
            // InternalCOV.g:1225:1: ( ( rule__Ignore__Group_6__0 )? )
            {
            // InternalCOV.g:1225:1: ( ( rule__Ignore__Group_6__0 )? )
            // InternalCOV.g:1226:2: ( rule__Ignore__Group_6__0 )?
            {
             before(grammarAccess.getIgnoreAccess().getGroup_6()); 
            // InternalCOV.g:1227:2: ( rule__Ignore__Group_6__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==29) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalCOV.g:1227:3: rule__Ignore__Group_6__0
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
    // InternalCOV.g:1236:1: rule__Ignore__Group_3__0 : rule__Ignore__Group_3__0__Impl rule__Ignore__Group_3__1 ;
    public final void rule__Ignore__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1240:1: ( rule__Ignore__Group_3__0__Impl rule__Ignore__Group_3__1 )
            // InternalCOV.g:1241:2: rule__Ignore__Group_3__0__Impl rule__Ignore__Group_3__1
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
    // InternalCOV.g:1248:1: rule__Ignore__Group_3__0__Impl : ( 'subtypes' ) ;
    public final void rule__Ignore__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1252:1: ( ( 'subtypes' ) )
            // InternalCOV.g:1253:1: ( 'subtypes' )
            {
            // InternalCOV.g:1253:1: ( 'subtypes' )
            // InternalCOV.g:1254:2: 'subtypes'
            {
             before(grammarAccess.getIgnoreAccess().getSubtypesKeyword_3_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalCOV.g:1263:1: rule__Ignore__Group_3__1 : rule__Ignore__Group_3__1__Impl ;
    public final void rule__Ignore__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1267:1: ( rule__Ignore__Group_3__1__Impl )
            // InternalCOV.g:1268:2: rule__Ignore__Group_3__1__Impl
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
    // InternalCOV.g:1274:1: rule__Ignore__Group_3__1__Impl : ( ( rule__Ignore__IgnoreSubtypesAssignment_3_1 ) ) ;
    public final void rule__Ignore__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1278:1: ( ( ( rule__Ignore__IgnoreSubtypesAssignment_3_1 ) ) )
            // InternalCOV.g:1279:1: ( ( rule__Ignore__IgnoreSubtypesAssignment_3_1 ) )
            {
            // InternalCOV.g:1279:1: ( ( rule__Ignore__IgnoreSubtypesAssignment_3_1 ) )
            // InternalCOV.g:1280:2: ( rule__Ignore__IgnoreSubtypesAssignment_3_1 )
            {
             before(grammarAccess.getIgnoreAccess().getIgnoreSubtypesAssignment_3_1()); 
            // InternalCOV.g:1281:2: ( rule__Ignore__IgnoreSubtypesAssignment_3_1 )
            // InternalCOV.g:1281:3: rule__Ignore__IgnoreSubtypesAssignment_3_1
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
    // InternalCOV.g:1290:1: rule__Ignore__Group_5__0 : rule__Ignore__Group_5__0__Impl rule__Ignore__Group_5__1 ;
    public final void rule__Ignore__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1294:1: ( rule__Ignore__Group_5__0__Impl rule__Ignore__Group_5__1 )
            // InternalCOV.g:1295:2: rule__Ignore__Group_5__0__Impl rule__Ignore__Group_5__1
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
    // InternalCOV.g:1302:1: rule__Ignore__Group_5__0__Impl : ( 'description' ) ;
    public final void rule__Ignore__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1306:1: ( ( 'description' ) )
            // InternalCOV.g:1307:1: ( 'description' )
            {
            // InternalCOV.g:1307:1: ( 'description' )
            // InternalCOV.g:1308:2: 'description'
            {
             before(grammarAccess.getIgnoreAccess().getDescriptionKeyword_5_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalCOV.g:1317:1: rule__Ignore__Group_5__1 : rule__Ignore__Group_5__1__Impl ;
    public final void rule__Ignore__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1321:1: ( rule__Ignore__Group_5__1__Impl )
            // InternalCOV.g:1322:2: rule__Ignore__Group_5__1__Impl
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
    // InternalCOV.g:1328:1: rule__Ignore__Group_5__1__Impl : ( ( rule__Ignore__DescriptionAssignment_5_1 ) ) ;
    public final void rule__Ignore__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1332:1: ( ( ( rule__Ignore__DescriptionAssignment_5_1 ) ) )
            // InternalCOV.g:1333:1: ( ( rule__Ignore__DescriptionAssignment_5_1 ) )
            {
            // InternalCOV.g:1333:1: ( ( rule__Ignore__DescriptionAssignment_5_1 ) )
            // InternalCOV.g:1334:2: ( rule__Ignore__DescriptionAssignment_5_1 )
            {
             before(grammarAccess.getIgnoreAccess().getDescriptionAssignment_5_1()); 
            // InternalCOV.g:1335:2: ( rule__Ignore__DescriptionAssignment_5_1 )
            // InternalCOV.g:1335:3: rule__Ignore__DescriptionAssignment_5_1
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
    // InternalCOV.g:1344:1: rule__Ignore__Group_6__0 : rule__Ignore__Group_6__0__Impl rule__Ignore__Group_6__1 ;
    public final void rule__Ignore__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1348:1: ( rule__Ignore__Group_6__0__Impl rule__Ignore__Group_6__1 )
            // InternalCOV.g:1349:2: rule__Ignore__Group_6__0__Impl rule__Ignore__Group_6__1
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
    // InternalCOV.g:1356:1: rule__Ignore__Group_6__0__Impl : ( 'condition' ) ;
    public final void rule__Ignore__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1360:1: ( ( 'condition' ) )
            // InternalCOV.g:1361:1: ( 'condition' )
            {
            // InternalCOV.g:1361:1: ( 'condition' )
            // InternalCOV.g:1362:2: 'condition'
            {
             before(grammarAccess.getIgnoreAccess().getConditionKeyword_6_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalCOV.g:1371:1: rule__Ignore__Group_6__1 : rule__Ignore__Group_6__1__Impl ;
    public final void rule__Ignore__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1375:1: ( rule__Ignore__Group_6__1__Impl )
            // InternalCOV.g:1376:2: rule__Ignore__Group_6__1__Impl
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
    // InternalCOV.g:1382:1: rule__Ignore__Group_6__1__Impl : ( ( rule__Ignore__ConditionAssignment_6_1 ) ) ;
    public final void rule__Ignore__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1386:1: ( ( ( rule__Ignore__ConditionAssignment_6_1 ) ) )
            // InternalCOV.g:1387:1: ( ( rule__Ignore__ConditionAssignment_6_1 ) )
            {
            // InternalCOV.g:1387:1: ( ( rule__Ignore__ConditionAssignment_6_1 ) )
            // InternalCOV.g:1388:2: ( rule__Ignore__ConditionAssignment_6_1 )
            {
             before(grammarAccess.getIgnoreAccess().getConditionAssignment_6_1()); 
            // InternalCOV.g:1389:2: ( rule__Ignore__ConditionAssignment_6_1 )
            // InternalCOV.g:1389:3: rule__Ignore__ConditionAssignment_6_1
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


    // $ANTLR start "rule__LimitedIgnore__Group__0"
    // InternalCOV.g:1398:1: rule__LimitedIgnore__Group__0 : rule__LimitedIgnore__Group__0__Impl rule__LimitedIgnore__Group__1 ;
    public final void rule__LimitedIgnore__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1402:1: ( rule__LimitedIgnore__Group__0__Impl rule__LimitedIgnore__Group__1 )
            // InternalCOV.g:1403:2: rule__LimitedIgnore__Group__0__Impl rule__LimitedIgnore__Group__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalCOV.g:1410:1: rule__LimitedIgnore__Group__0__Impl : ( 'ignoreif' ) ;
    public final void rule__LimitedIgnore__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1414:1: ( ( 'ignoreif' ) )
            // InternalCOV.g:1415:1: ( 'ignoreif' )
            {
            // InternalCOV.g:1415:1: ( 'ignoreif' )
            // InternalCOV.g:1416:2: 'ignoreif'
            {
             before(grammarAccess.getLimitedIgnoreAccess().getIgnoreifKeyword_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalCOV.g:1425:1: rule__LimitedIgnore__Group__1 : rule__LimitedIgnore__Group__1__Impl rule__LimitedIgnore__Group__2 ;
    public final void rule__LimitedIgnore__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1429:1: ( rule__LimitedIgnore__Group__1__Impl rule__LimitedIgnore__Group__2 )
            // InternalCOV.g:1430:2: rule__LimitedIgnore__Group__1__Impl rule__LimitedIgnore__Group__2
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
    // InternalCOV.g:1437:1: rule__LimitedIgnore__Group__1__Impl : ( ( rule__LimitedIgnore__TypeAssignment_1 ) ) ;
    public final void rule__LimitedIgnore__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1441:1: ( ( ( rule__LimitedIgnore__TypeAssignment_1 ) ) )
            // InternalCOV.g:1442:1: ( ( rule__LimitedIgnore__TypeAssignment_1 ) )
            {
            // InternalCOV.g:1442:1: ( ( rule__LimitedIgnore__TypeAssignment_1 ) )
            // InternalCOV.g:1443:2: ( rule__LimitedIgnore__TypeAssignment_1 )
            {
             before(grammarAccess.getLimitedIgnoreAccess().getTypeAssignment_1()); 
            // InternalCOV.g:1444:2: ( rule__LimitedIgnore__TypeAssignment_1 )
            // InternalCOV.g:1444:3: rule__LimitedIgnore__TypeAssignment_1
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
    // InternalCOV.g:1452:1: rule__LimitedIgnore__Group__2 : rule__LimitedIgnore__Group__2__Impl rule__LimitedIgnore__Group__3 ;
    public final void rule__LimitedIgnore__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1456:1: ( rule__LimitedIgnore__Group__2__Impl rule__LimitedIgnore__Group__3 )
            // InternalCOV.g:1457:2: rule__LimitedIgnore__Group__2__Impl rule__LimitedIgnore__Group__3
            {
            pushFollow(FOLLOW_19);
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
    // InternalCOV.g:1464:1: rule__LimitedIgnore__Group__2__Impl : ( ( rule__LimitedIgnore__ContainerMetaclassAssignment_2 ) ) ;
    public final void rule__LimitedIgnore__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1468:1: ( ( ( rule__LimitedIgnore__ContainerMetaclassAssignment_2 ) ) )
            // InternalCOV.g:1469:1: ( ( rule__LimitedIgnore__ContainerMetaclassAssignment_2 ) )
            {
            // InternalCOV.g:1469:1: ( ( rule__LimitedIgnore__ContainerMetaclassAssignment_2 ) )
            // InternalCOV.g:1470:2: ( rule__LimitedIgnore__ContainerMetaclassAssignment_2 )
            {
             before(grammarAccess.getLimitedIgnoreAccess().getContainerMetaclassAssignment_2()); 
            // InternalCOV.g:1471:2: ( rule__LimitedIgnore__ContainerMetaclassAssignment_2 )
            // InternalCOV.g:1471:3: rule__LimitedIgnore__ContainerMetaclassAssignment_2
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
    // InternalCOV.g:1479:1: rule__LimitedIgnore__Group__3 : rule__LimitedIgnore__Group__3__Impl rule__LimitedIgnore__Group__4 ;
    public final void rule__LimitedIgnore__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1483:1: ( rule__LimitedIgnore__Group__3__Impl rule__LimitedIgnore__Group__4 )
            // InternalCOV.g:1484:2: rule__LimitedIgnore__Group__3__Impl rule__LimitedIgnore__Group__4
            {
            pushFollow(FOLLOW_19);
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
    // InternalCOV.g:1491:1: rule__LimitedIgnore__Group__3__Impl : ( ( rule__LimitedIgnore__Group_3__0 )* ) ;
    public final void rule__LimitedIgnore__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1495:1: ( ( ( rule__LimitedIgnore__Group_3__0 )* ) )
            // InternalCOV.g:1496:1: ( ( rule__LimitedIgnore__Group_3__0 )* )
            {
            // InternalCOV.g:1496:1: ( ( rule__LimitedIgnore__Group_3__0 )* )
            // InternalCOV.g:1497:2: ( rule__LimitedIgnore__Group_3__0 )*
            {
             before(grammarAccess.getLimitedIgnoreAccess().getGroup_3()); 
            // InternalCOV.g:1498:2: ( rule__LimitedIgnore__Group_3__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==22) ) {
                    int LA12_2 = input.LA(2);

                    if ( ((LA12_2>=RULE_STRING && LA12_2<=RULE_ID)) ) {
                        alt12=1;
                    }


                }


                switch (alt12) {
            	case 1 :
            	    // InternalCOV.g:1498:3: rule__LimitedIgnore__Group_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__LimitedIgnore__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // InternalCOV.g:1506:1: rule__LimitedIgnore__Group__4 : rule__LimitedIgnore__Group__4__Impl rule__LimitedIgnore__Group__5 ;
    public final void rule__LimitedIgnore__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1510:1: ( rule__LimitedIgnore__Group__4__Impl rule__LimitedIgnore__Group__5 )
            // InternalCOV.g:1511:2: rule__LimitedIgnore__Group__4__Impl rule__LimitedIgnore__Group__5
            {
            pushFollow(FOLLOW_19);
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
    // InternalCOV.g:1518:1: rule__LimitedIgnore__Group__4__Impl : ( ( rule__LimitedIgnore__Group_4__0 )? ) ;
    public final void rule__LimitedIgnore__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1522:1: ( ( ( rule__LimitedIgnore__Group_4__0 )? ) )
            // InternalCOV.g:1523:1: ( ( rule__LimitedIgnore__Group_4__0 )? )
            {
            // InternalCOV.g:1523:1: ( ( rule__LimitedIgnore__Group_4__0 )? )
            // InternalCOV.g:1524:2: ( rule__LimitedIgnore__Group_4__0 )?
            {
             before(grammarAccess.getLimitedIgnoreAccess().getGroup_4()); 
            // InternalCOV.g:1525:2: ( rule__LimitedIgnore__Group_4__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==28) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalCOV.g:1525:3: rule__LimitedIgnore__Group_4__0
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
    // InternalCOV.g:1533:1: rule__LimitedIgnore__Group__5 : rule__LimitedIgnore__Group__5__Impl ;
    public final void rule__LimitedIgnore__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1537:1: ( rule__LimitedIgnore__Group__5__Impl )
            // InternalCOV.g:1538:2: rule__LimitedIgnore__Group__5__Impl
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
    // InternalCOV.g:1544:1: rule__LimitedIgnore__Group__5__Impl : ( ( rule__LimitedIgnore__Group_5__0 )? ) ;
    public final void rule__LimitedIgnore__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1548:1: ( ( ( rule__LimitedIgnore__Group_5__0 )? ) )
            // InternalCOV.g:1549:1: ( ( rule__LimitedIgnore__Group_5__0 )? )
            {
            // InternalCOV.g:1549:1: ( ( rule__LimitedIgnore__Group_5__0 )? )
            // InternalCOV.g:1550:2: ( rule__LimitedIgnore__Group_5__0 )?
            {
             before(grammarAccess.getLimitedIgnoreAccess().getGroup_5()); 
            // InternalCOV.g:1551:2: ( rule__LimitedIgnore__Group_5__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==29) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalCOV.g:1551:3: rule__LimitedIgnore__Group_5__0
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
    // InternalCOV.g:1560:1: rule__LimitedIgnore__Group_3__0 : rule__LimitedIgnore__Group_3__0__Impl rule__LimitedIgnore__Group_3__1 ;
    public final void rule__LimitedIgnore__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1564:1: ( rule__LimitedIgnore__Group_3__0__Impl rule__LimitedIgnore__Group_3__1 )
            // InternalCOV.g:1565:2: rule__LimitedIgnore__Group_3__0__Impl rule__LimitedIgnore__Group_3__1
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
    // InternalCOV.g:1572:1: rule__LimitedIgnore__Group_3__0__Impl : ( ',' ) ;
    public final void rule__LimitedIgnore__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1576:1: ( ( ',' ) )
            // InternalCOV.g:1577:1: ( ',' )
            {
            // InternalCOV.g:1577:1: ( ',' )
            // InternalCOV.g:1578:2: ','
            {
             before(grammarAccess.getLimitedIgnoreAccess().getCommaKeyword_3_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalCOV.g:1587:1: rule__LimitedIgnore__Group_3__1 : rule__LimitedIgnore__Group_3__1__Impl ;
    public final void rule__LimitedIgnore__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1591:1: ( rule__LimitedIgnore__Group_3__1__Impl )
            // InternalCOV.g:1592:2: rule__LimitedIgnore__Group_3__1__Impl
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
    // InternalCOV.g:1598:1: rule__LimitedIgnore__Group_3__1__Impl : ( ( rule__LimitedIgnore__ContainerMetaclassAssignment_3_1 ) ) ;
    public final void rule__LimitedIgnore__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1602:1: ( ( ( rule__LimitedIgnore__ContainerMetaclassAssignment_3_1 ) ) )
            // InternalCOV.g:1603:1: ( ( rule__LimitedIgnore__ContainerMetaclassAssignment_3_1 ) )
            {
            // InternalCOV.g:1603:1: ( ( rule__LimitedIgnore__ContainerMetaclassAssignment_3_1 ) )
            // InternalCOV.g:1604:2: ( rule__LimitedIgnore__ContainerMetaclassAssignment_3_1 )
            {
             before(grammarAccess.getLimitedIgnoreAccess().getContainerMetaclassAssignment_3_1()); 
            // InternalCOV.g:1605:2: ( rule__LimitedIgnore__ContainerMetaclassAssignment_3_1 )
            // InternalCOV.g:1605:3: rule__LimitedIgnore__ContainerMetaclassAssignment_3_1
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
    // InternalCOV.g:1614:1: rule__LimitedIgnore__Group_4__0 : rule__LimitedIgnore__Group_4__0__Impl rule__LimitedIgnore__Group_4__1 ;
    public final void rule__LimitedIgnore__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1618:1: ( rule__LimitedIgnore__Group_4__0__Impl rule__LimitedIgnore__Group_4__1 )
            // InternalCOV.g:1619:2: rule__LimitedIgnore__Group_4__0__Impl rule__LimitedIgnore__Group_4__1
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
    // InternalCOV.g:1626:1: rule__LimitedIgnore__Group_4__0__Impl : ( 'description' ) ;
    public final void rule__LimitedIgnore__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1630:1: ( ( 'description' ) )
            // InternalCOV.g:1631:1: ( 'description' )
            {
            // InternalCOV.g:1631:1: ( 'description' )
            // InternalCOV.g:1632:2: 'description'
            {
             before(grammarAccess.getLimitedIgnoreAccess().getDescriptionKeyword_4_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalCOV.g:1641:1: rule__LimitedIgnore__Group_4__1 : rule__LimitedIgnore__Group_4__1__Impl ;
    public final void rule__LimitedIgnore__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1645:1: ( rule__LimitedIgnore__Group_4__1__Impl )
            // InternalCOV.g:1646:2: rule__LimitedIgnore__Group_4__1__Impl
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
    // InternalCOV.g:1652:1: rule__LimitedIgnore__Group_4__1__Impl : ( ( rule__LimitedIgnore__DescriptionAssignment_4_1 ) ) ;
    public final void rule__LimitedIgnore__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1656:1: ( ( ( rule__LimitedIgnore__DescriptionAssignment_4_1 ) ) )
            // InternalCOV.g:1657:1: ( ( rule__LimitedIgnore__DescriptionAssignment_4_1 ) )
            {
            // InternalCOV.g:1657:1: ( ( rule__LimitedIgnore__DescriptionAssignment_4_1 ) )
            // InternalCOV.g:1658:2: ( rule__LimitedIgnore__DescriptionAssignment_4_1 )
            {
             before(grammarAccess.getLimitedIgnoreAccess().getDescriptionAssignment_4_1()); 
            // InternalCOV.g:1659:2: ( rule__LimitedIgnore__DescriptionAssignment_4_1 )
            // InternalCOV.g:1659:3: rule__LimitedIgnore__DescriptionAssignment_4_1
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
    // InternalCOV.g:1668:1: rule__LimitedIgnore__Group_5__0 : rule__LimitedIgnore__Group_5__0__Impl rule__LimitedIgnore__Group_5__1 ;
    public final void rule__LimitedIgnore__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1672:1: ( rule__LimitedIgnore__Group_5__0__Impl rule__LimitedIgnore__Group_5__1 )
            // InternalCOV.g:1673:2: rule__LimitedIgnore__Group_5__0__Impl rule__LimitedIgnore__Group_5__1
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
    // InternalCOV.g:1680:1: rule__LimitedIgnore__Group_5__0__Impl : ( 'condition' ) ;
    public final void rule__LimitedIgnore__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1684:1: ( ( 'condition' ) )
            // InternalCOV.g:1685:1: ( 'condition' )
            {
            // InternalCOV.g:1685:1: ( 'condition' )
            // InternalCOV.g:1686:2: 'condition'
            {
             before(grammarAccess.getLimitedIgnoreAccess().getConditionKeyword_5_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalCOV.g:1695:1: rule__LimitedIgnore__Group_5__1 : rule__LimitedIgnore__Group_5__1__Impl ;
    public final void rule__LimitedIgnore__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1699:1: ( rule__LimitedIgnore__Group_5__1__Impl )
            // InternalCOV.g:1700:2: rule__LimitedIgnore__Group_5__1__Impl
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
    // InternalCOV.g:1706:1: rule__LimitedIgnore__Group_5__1__Impl : ( ( rule__LimitedIgnore__ConditionAssignment_5_1 ) ) ;
    public final void rule__LimitedIgnore__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1710:1: ( ( ( rule__LimitedIgnore__ConditionAssignment_5_1 ) ) )
            // InternalCOV.g:1711:1: ( ( rule__LimitedIgnore__ConditionAssignment_5_1 ) )
            {
            // InternalCOV.g:1711:1: ( ( rule__LimitedIgnore__ConditionAssignment_5_1 ) )
            // InternalCOV.g:1712:2: ( rule__LimitedIgnore__ConditionAssignment_5_1 )
            {
             before(grammarAccess.getLimitedIgnoreAccess().getConditionAssignment_5_1()); 
            // InternalCOV.g:1713:2: ( rule__LimitedIgnore__ConditionAssignment_5_1 )
            // InternalCOV.g:1713:3: rule__LimitedIgnore__ConditionAssignment_5_1
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


    // $ANTLR start "rule__CoverageOfReferenced__Group__0"
    // InternalCOV.g:1722:1: rule__CoverageOfReferenced__Group__0 : rule__CoverageOfReferenced__Group__0__Impl rule__CoverageOfReferenced__Group__1 ;
    public final void rule__CoverageOfReferenced__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1726:1: ( rule__CoverageOfReferenced__Group__0__Impl rule__CoverageOfReferenced__Group__1 )
            // InternalCOV.g:1727:2: rule__CoverageOfReferenced__Group__0__Impl rule__CoverageOfReferenced__Group__1
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
    // InternalCOV.g:1734:1: rule__CoverageOfReferenced__Group__0__Impl : ( 'covers' ) ;
    public final void rule__CoverageOfReferenced__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1738:1: ( ( 'covers' ) )
            // InternalCOV.g:1739:1: ( 'covers' )
            {
            // InternalCOV.g:1739:1: ( 'covers' )
            // InternalCOV.g:1740:2: 'covers'
            {
             before(grammarAccess.getCoverageOfReferencedAccess().getCoversKeyword_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalCOV.g:1749:1: rule__CoverageOfReferenced__Group__1 : rule__CoverageOfReferenced__Group__1__Impl rule__CoverageOfReferenced__Group__2 ;
    public final void rule__CoverageOfReferenced__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1753:1: ( rule__CoverageOfReferenced__Group__1__Impl rule__CoverageOfReferenced__Group__2 )
            // InternalCOV.g:1754:2: rule__CoverageOfReferenced__Group__1__Impl rule__CoverageOfReferenced__Group__2
            {
            pushFollow(FOLLOW_19);
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
    // InternalCOV.g:1761:1: rule__CoverageOfReferenced__Group__1__Impl : ( ( rule__CoverageOfReferenced__ReferenceAssignment_1 ) ) ;
    public final void rule__CoverageOfReferenced__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1765:1: ( ( ( rule__CoverageOfReferenced__ReferenceAssignment_1 ) ) )
            // InternalCOV.g:1766:1: ( ( rule__CoverageOfReferenced__ReferenceAssignment_1 ) )
            {
            // InternalCOV.g:1766:1: ( ( rule__CoverageOfReferenced__ReferenceAssignment_1 ) )
            // InternalCOV.g:1767:2: ( rule__CoverageOfReferenced__ReferenceAssignment_1 )
            {
             before(grammarAccess.getCoverageOfReferencedAccess().getReferenceAssignment_1()); 
            // InternalCOV.g:1768:2: ( rule__CoverageOfReferenced__ReferenceAssignment_1 )
            // InternalCOV.g:1768:3: rule__CoverageOfReferenced__ReferenceAssignment_1
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
    // InternalCOV.g:1776:1: rule__CoverageOfReferenced__Group__2 : rule__CoverageOfReferenced__Group__2__Impl rule__CoverageOfReferenced__Group__3 ;
    public final void rule__CoverageOfReferenced__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1780:1: ( rule__CoverageOfReferenced__Group__2__Impl rule__CoverageOfReferenced__Group__3 )
            // InternalCOV.g:1781:2: rule__CoverageOfReferenced__Group__2__Impl rule__CoverageOfReferenced__Group__3
            {
            pushFollow(FOLLOW_19);
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
    // InternalCOV.g:1788:1: rule__CoverageOfReferenced__Group__2__Impl : ( ( rule__CoverageOfReferenced__Group_2__0 )* ) ;
    public final void rule__CoverageOfReferenced__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1792:1: ( ( ( rule__CoverageOfReferenced__Group_2__0 )* ) )
            // InternalCOV.g:1793:1: ( ( rule__CoverageOfReferenced__Group_2__0 )* )
            {
            // InternalCOV.g:1793:1: ( ( rule__CoverageOfReferenced__Group_2__0 )* )
            // InternalCOV.g:1794:2: ( rule__CoverageOfReferenced__Group_2__0 )*
            {
             before(grammarAccess.getCoverageOfReferencedAccess().getGroup_2()); 
            // InternalCOV.g:1795:2: ( rule__CoverageOfReferenced__Group_2__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==22) ) {
                    int LA15_2 = input.LA(2);

                    if ( ((LA15_2>=RULE_STRING && LA15_2<=RULE_ID)) ) {
                        alt15=1;
                    }


                }


                switch (alt15) {
            	case 1 :
            	    // InternalCOV.g:1795:3: rule__CoverageOfReferenced__Group_2__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__CoverageOfReferenced__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // InternalCOV.g:1803:1: rule__CoverageOfReferenced__Group__3 : rule__CoverageOfReferenced__Group__3__Impl rule__CoverageOfReferenced__Group__4 ;
    public final void rule__CoverageOfReferenced__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1807:1: ( rule__CoverageOfReferenced__Group__3__Impl rule__CoverageOfReferenced__Group__4 )
            // InternalCOV.g:1808:2: rule__CoverageOfReferenced__Group__3__Impl rule__CoverageOfReferenced__Group__4
            {
            pushFollow(FOLLOW_19);
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
    // InternalCOV.g:1815:1: rule__CoverageOfReferenced__Group__3__Impl : ( ( rule__CoverageOfReferenced__Group_3__0 )? ) ;
    public final void rule__CoverageOfReferenced__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1819:1: ( ( ( rule__CoverageOfReferenced__Group_3__0 )? ) )
            // InternalCOV.g:1820:1: ( ( rule__CoverageOfReferenced__Group_3__0 )? )
            {
            // InternalCOV.g:1820:1: ( ( rule__CoverageOfReferenced__Group_3__0 )? )
            // InternalCOV.g:1821:2: ( rule__CoverageOfReferenced__Group_3__0 )?
            {
             before(grammarAccess.getCoverageOfReferencedAccess().getGroup_3()); 
            // InternalCOV.g:1822:2: ( rule__CoverageOfReferenced__Group_3__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==28) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalCOV.g:1822:3: rule__CoverageOfReferenced__Group_3__0
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
    // InternalCOV.g:1830:1: rule__CoverageOfReferenced__Group__4 : rule__CoverageOfReferenced__Group__4__Impl ;
    public final void rule__CoverageOfReferenced__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1834:1: ( rule__CoverageOfReferenced__Group__4__Impl )
            // InternalCOV.g:1835:2: rule__CoverageOfReferenced__Group__4__Impl
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
    // InternalCOV.g:1841:1: rule__CoverageOfReferenced__Group__4__Impl : ( ( rule__CoverageOfReferenced__Group_4__0 )? ) ;
    public final void rule__CoverageOfReferenced__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1845:1: ( ( ( rule__CoverageOfReferenced__Group_4__0 )? ) )
            // InternalCOV.g:1846:1: ( ( rule__CoverageOfReferenced__Group_4__0 )? )
            {
            // InternalCOV.g:1846:1: ( ( rule__CoverageOfReferenced__Group_4__0 )? )
            // InternalCOV.g:1847:2: ( rule__CoverageOfReferenced__Group_4__0 )?
            {
             before(grammarAccess.getCoverageOfReferencedAccess().getGroup_4()); 
            // InternalCOV.g:1848:2: ( rule__CoverageOfReferenced__Group_4__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==29) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalCOV.g:1848:3: rule__CoverageOfReferenced__Group_4__0
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
    // InternalCOV.g:1857:1: rule__CoverageOfReferenced__Group_2__0 : rule__CoverageOfReferenced__Group_2__0__Impl rule__CoverageOfReferenced__Group_2__1 ;
    public final void rule__CoverageOfReferenced__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1861:1: ( rule__CoverageOfReferenced__Group_2__0__Impl rule__CoverageOfReferenced__Group_2__1 )
            // InternalCOV.g:1862:2: rule__CoverageOfReferenced__Group_2__0__Impl rule__CoverageOfReferenced__Group_2__1
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
    // InternalCOV.g:1869:1: rule__CoverageOfReferenced__Group_2__0__Impl : ( ',' ) ;
    public final void rule__CoverageOfReferenced__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1873:1: ( ( ',' ) )
            // InternalCOV.g:1874:1: ( ',' )
            {
            // InternalCOV.g:1874:1: ( ',' )
            // InternalCOV.g:1875:2: ','
            {
             before(grammarAccess.getCoverageOfReferencedAccess().getCommaKeyword_2_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalCOV.g:1884:1: rule__CoverageOfReferenced__Group_2__1 : rule__CoverageOfReferenced__Group_2__1__Impl ;
    public final void rule__CoverageOfReferenced__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1888:1: ( rule__CoverageOfReferenced__Group_2__1__Impl )
            // InternalCOV.g:1889:2: rule__CoverageOfReferenced__Group_2__1__Impl
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
    // InternalCOV.g:1895:1: rule__CoverageOfReferenced__Group_2__1__Impl : ( ( rule__CoverageOfReferenced__ReferenceAssignment_2_1 ) ) ;
    public final void rule__CoverageOfReferenced__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1899:1: ( ( ( rule__CoverageOfReferenced__ReferenceAssignment_2_1 ) ) )
            // InternalCOV.g:1900:1: ( ( rule__CoverageOfReferenced__ReferenceAssignment_2_1 ) )
            {
            // InternalCOV.g:1900:1: ( ( rule__CoverageOfReferenced__ReferenceAssignment_2_1 ) )
            // InternalCOV.g:1901:2: ( rule__CoverageOfReferenced__ReferenceAssignment_2_1 )
            {
             before(grammarAccess.getCoverageOfReferencedAccess().getReferenceAssignment_2_1()); 
            // InternalCOV.g:1902:2: ( rule__CoverageOfReferenced__ReferenceAssignment_2_1 )
            // InternalCOV.g:1902:3: rule__CoverageOfReferenced__ReferenceAssignment_2_1
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
    // InternalCOV.g:1911:1: rule__CoverageOfReferenced__Group_3__0 : rule__CoverageOfReferenced__Group_3__0__Impl rule__CoverageOfReferenced__Group_3__1 ;
    public final void rule__CoverageOfReferenced__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1915:1: ( rule__CoverageOfReferenced__Group_3__0__Impl rule__CoverageOfReferenced__Group_3__1 )
            // InternalCOV.g:1916:2: rule__CoverageOfReferenced__Group_3__0__Impl rule__CoverageOfReferenced__Group_3__1
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
    // InternalCOV.g:1923:1: rule__CoverageOfReferenced__Group_3__0__Impl : ( 'description' ) ;
    public final void rule__CoverageOfReferenced__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1927:1: ( ( 'description' ) )
            // InternalCOV.g:1928:1: ( 'description' )
            {
            // InternalCOV.g:1928:1: ( 'description' )
            // InternalCOV.g:1929:2: 'description'
            {
             before(grammarAccess.getCoverageOfReferencedAccess().getDescriptionKeyword_3_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalCOV.g:1938:1: rule__CoverageOfReferenced__Group_3__1 : rule__CoverageOfReferenced__Group_3__1__Impl ;
    public final void rule__CoverageOfReferenced__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1942:1: ( rule__CoverageOfReferenced__Group_3__1__Impl )
            // InternalCOV.g:1943:2: rule__CoverageOfReferenced__Group_3__1__Impl
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
    // InternalCOV.g:1949:1: rule__CoverageOfReferenced__Group_3__1__Impl : ( ( rule__CoverageOfReferenced__DescriptionAssignment_3_1 ) ) ;
    public final void rule__CoverageOfReferenced__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1953:1: ( ( ( rule__CoverageOfReferenced__DescriptionAssignment_3_1 ) ) )
            // InternalCOV.g:1954:1: ( ( rule__CoverageOfReferenced__DescriptionAssignment_3_1 ) )
            {
            // InternalCOV.g:1954:1: ( ( rule__CoverageOfReferenced__DescriptionAssignment_3_1 ) )
            // InternalCOV.g:1955:2: ( rule__CoverageOfReferenced__DescriptionAssignment_3_1 )
            {
             before(grammarAccess.getCoverageOfReferencedAccess().getDescriptionAssignment_3_1()); 
            // InternalCOV.g:1956:2: ( rule__CoverageOfReferenced__DescriptionAssignment_3_1 )
            // InternalCOV.g:1956:3: rule__CoverageOfReferenced__DescriptionAssignment_3_1
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
    // InternalCOV.g:1965:1: rule__CoverageOfReferenced__Group_4__0 : rule__CoverageOfReferenced__Group_4__0__Impl rule__CoverageOfReferenced__Group_4__1 ;
    public final void rule__CoverageOfReferenced__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1969:1: ( rule__CoverageOfReferenced__Group_4__0__Impl rule__CoverageOfReferenced__Group_4__1 )
            // InternalCOV.g:1970:2: rule__CoverageOfReferenced__Group_4__0__Impl rule__CoverageOfReferenced__Group_4__1
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
    // InternalCOV.g:1977:1: rule__CoverageOfReferenced__Group_4__0__Impl : ( 'condition' ) ;
    public final void rule__CoverageOfReferenced__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1981:1: ( ( 'condition' ) )
            // InternalCOV.g:1982:1: ( 'condition' )
            {
            // InternalCOV.g:1982:1: ( 'condition' )
            // InternalCOV.g:1983:2: 'condition'
            {
             before(grammarAccess.getCoverageOfReferencedAccess().getConditionKeyword_4_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalCOV.g:1992:1: rule__CoverageOfReferenced__Group_4__1 : rule__CoverageOfReferenced__Group_4__1__Impl ;
    public final void rule__CoverageOfReferenced__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1996:1: ( rule__CoverageOfReferenced__Group_4__1__Impl )
            // InternalCOV.g:1997:2: rule__CoverageOfReferenced__Group_4__1__Impl
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
    // InternalCOV.g:2003:1: rule__CoverageOfReferenced__Group_4__1__Impl : ( ( rule__CoverageOfReferenced__ConditionAssignment_4_1 ) ) ;
    public final void rule__CoverageOfReferenced__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2007:1: ( ( ( rule__CoverageOfReferenced__ConditionAssignment_4_1 ) ) )
            // InternalCOV.g:2008:1: ( ( rule__CoverageOfReferenced__ConditionAssignment_4_1 ) )
            {
            // InternalCOV.g:2008:1: ( ( rule__CoverageOfReferenced__ConditionAssignment_4_1 ) )
            // InternalCOV.g:2009:2: ( rule__CoverageOfReferenced__ConditionAssignment_4_1 )
            {
             before(grammarAccess.getCoverageOfReferencedAccess().getConditionAssignment_4_1()); 
            // InternalCOV.g:2010:2: ( rule__CoverageOfReferenced__ConditionAssignment_4_1 )
            // InternalCOV.g:2010:3: rule__CoverageOfReferenced__ConditionAssignment_4_1
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


    // $ANTLR start "rule__CoverageByContent__Group__0"
    // InternalCOV.g:2019:1: rule__CoverageByContent__Group__0 : rule__CoverageByContent__Group__0__Impl rule__CoverageByContent__Group__1 ;
    public final void rule__CoverageByContent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2023:1: ( rule__CoverageByContent__Group__0__Impl rule__CoverageByContent__Group__1 )
            // InternalCOV.g:2024:2: rule__CoverageByContent__Group__0__Impl rule__CoverageByContent__Group__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalCOV.g:2031:1: rule__CoverageByContent__Group__0__Impl : ( 'covered' ) ;
    public final void rule__CoverageByContent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2035:1: ( ( 'covered' ) )
            // InternalCOV.g:2036:1: ( 'covered' )
            {
            // InternalCOV.g:2036:1: ( 'covered' )
            // InternalCOV.g:2037:2: 'covered'
            {
             before(grammarAccess.getCoverageByContentAccess().getCoveredKeyword_0()); 
            match(input,32,FOLLOW_2); 
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
    // InternalCOV.g:2046:1: rule__CoverageByContent__Group__1 : rule__CoverageByContent__Group__1__Impl rule__CoverageByContent__Group__2 ;
    public final void rule__CoverageByContent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2050:1: ( rule__CoverageByContent__Group__1__Impl rule__CoverageByContent__Group__2 )
            // InternalCOV.g:2051:2: rule__CoverageByContent__Group__1__Impl rule__CoverageByContent__Group__2
            {
            pushFollow(FOLLOW_21);
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
    // InternalCOV.g:2058:1: rule__CoverageByContent__Group__1__Impl : ( 'when' ) ;
    public final void rule__CoverageByContent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2062:1: ( ( 'when' ) )
            // InternalCOV.g:2063:1: ( 'when' )
            {
            // InternalCOV.g:2063:1: ( 'when' )
            // InternalCOV.g:2064:2: 'when'
            {
             before(grammarAccess.getCoverageByContentAccess().getWhenKeyword_1()); 
            match(input,33,FOLLOW_2); 
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
    // InternalCOV.g:2073:1: rule__CoverageByContent__Group__2 : rule__CoverageByContent__Group__2__Impl rule__CoverageByContent__Group__3 ;
    public final void rule__CoverageByContent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2077:1: ( rule__CoverageByContent__Group__2__Impl rule__CoverageByContent__Group__3 )
            // InternalCOV.g:2078:2: rule__CoverageByContent__Group__2__Impl rule__CoverageByContent__Group__3
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
    // InternalCOV.g:2085:1: rule__CoverageByContent__Group__2__Impl : ( ( rule__CoverageByContent__MultiplicityAssignment_2 ) ) ;
    public final void rule__CoverageByContent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2089:1: ( ( ( rule__CoverageByContent__MultiplicityAssignment_2 ) ) )
            // InternalCOV.g:2090:1: ( ( rule__CoverageByContent__MultiplicityAssignment_2 ) )
            {
            // InternalCOV.g:2090:1: ( ( rule__CoverageByContent__MultiplicityAssignment_2 ) )
            // InternalCOV.g:2091:2: ( rule__CoverageByContent__MultiplicityAssignment_2 )
            {
             before(grammarAccess.getCoverageByContentAccess().getMultiplicityAssignment_2()); 
            // InternalCOV.g:2092:2: ( rule__CoverageByContent__MultiplicityAssignment_2 )
            // InternalCOV.g:2092:3: rule__CoverageByContent__MultiplicityAssignment_2
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
    // InternalCOV.g:2100:1: rule__CoverageByContent__Group__3 : rule__CoverageByContent__Group__3__Impl rule__CoverageByContent__Group__4 ;
    public final void rule__CoverageByContent__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2104:1: ( rule__CoverageByContent__Group__3__Impl rule__CoverageByContent__Group__4 )
            // InternalCOV.g:2105:2: rule__CoverageByContent__Group__3__Impl rule__CoverageByContent__Group__4
            {
            pushFollow(FOLLOW_22);
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
    // InternalCOV.g:2112:1: rule__CoverageByContent__Group__3__Impl : ( ( rule__CoverageByContent__ContainmentReferenceAssignment_3 ) ) ;
    public final void rule__CoverageByContent__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2116:1: ( ( ( rule__CoverageByContent__ContainmentReferenceAssignment_3 ) ) )
            // InternalCOV.g:2117:1: ( ( rule__CoverageByContent__ContainmentReferenceAssignment_3 ) )
            {
            // InternalCOV.g:2117:1: ( ( rule__CoverageByContent__ContainmentReferenceAssignment_3 ) )
            // InternalCOV.g:2118:2: ( rule__CoverageByContent__ContainmentReferenceAssignment_3 )
            {
             before(grammarAccess.getCoverageByContentAccess().getContainmentReferenceAssignment_3()); 
            // InternalCOV.g:2119:2: ( rule__CoverageByContent__ContainmentReferenceAssignment_3 )
            // InternalCOV.g:2119:3: rule__CoverageByContent__ContainmentReferenceAssignment_3
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
    // InternalCOV.g:2127:1: rule__CoverageByContent__Group__4 : rule__CoverageByContent__Group__4__Impl rule__CoverageByContent__Group__5 ;
    public final void rule__CoverageByContent__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2131:1: ( rule__CoverageByContent__Group__4__Impl rule__CoverageByContent__Group__5 )
            // InternalCOV.g:2132:2: rule__CoverageByContent__Group__4__Impl rule__CoverageByContent__Group__5
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
    // InternalCOV.g:2139:1: rule__CoverageByContent__Group__4__Impl : ( 'iscovered' ) ;
    public final void rule__CoverageByContent__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2143:1: ( ( 'iscovered' ) )
            // InternalCOV.g:2144:1: ( 'iscovered' )
            {
            // InternalCOV.g:2144:1: ( 'iscovered' )
            // InternalCOV.g:2145:2: 'iscovered'
            {
             before(grammarAccess.getCoverageByContentAccess().getIscoveredKeyword_4()); 
            match(input,34,FOLLOW_2); 
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
    // InternalCOV.g:2154:1: rule__CoverageByContent__Group__5 : rule__CoverageByContent__Group__5__Impl rule__CoverageByContent__Group__6 ;
    public final void rule__CoverageByContent__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2158:1: ( rule__CoverageByContent__Group__5__Impl rule__CoverageByContent__Group__6 )
            // InternalCOV.g:2159:2: rule__CoverageByContent__Group__5__Impl rule__CoverageByContent__Group__6
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
    // InternalCOV.g:2166:1: rule__CoverageByContent__Group__5__Impl : ( ( rule__CoverageByContent__Group_5__0 )? ) ;
    public final void rule__CoverageByContent__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2170:1: ( ( ( rule__CoverageByContent__Group_5__0 )? ) )
            // InternalCOV.g:2171:1: ( ( rule__CoverageByContent__Group_5__0 )? )
            {
            // InternalCOV.g:2171:1: ( ( rule__CoverageByContent__Group_5__0 )? )
            // InternalCOV.g:2172:2: ( rule__CoverageByContent__Group_5__0 )?
            {
             before(grammarAccess.getCoverageByContentAccess().getGroup_5()); 
            // InternalCOV.g:2173:2: ( rule__CoverageByContent__Group_5__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==28) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalCOV.g:2173:3: rule__CoverageByContent__Group_5__0
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
    // InternalCOV.g:2181:1: rule__CoverageByContent__Group__6 : rule__CoverageByContent__Group__6__Impl ;
    public final void rule__CoverageByContent__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2185:1: ( rule__CoverageByContent__Group__6__Impl )
            // InternalCOV.g:2186:2: rule__CoverageByContent__Group__6__Impl
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
    // InternalCOV.g:2192:1: rule__CoverageByContent__Group__6__Impl : ( ( rule__CoverageByContent__Group_6__0 )? ) ;
    public final void rule__CoverageByContent__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2196:1: ( ( ( rule__CoverageByContent__Group_6__0 )? ) )
            // InternalCOV.g:2197:1: ( ( rule__CoverageByContent__Group_6__0 )? )
            {
            // InternalCOV.g:2197:1: ( ( rule__CoverageByContent__Group_6__0 )? )
            // InternalCOV.g:2198:2: ( rule__CoverageByContent__Group_6__0 )?
            {
             before(grammarAccess.getCoverageByContentAccess().getGroup_6()); 
            // InternalCOV.g:2199:2: ( rule__CoverageByContent__Group_6__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==29) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalCOV.g:2199:3: rule__CoverageByContent__Group_6__0
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
    // InternalCOV.g:2208:1: rule__CoverageByContent__Group_5__0 : rule__CoverageByContent__Group_5__0__Impl rule__CoverageByContent__Group_5__1 ;
    public final void rule__CoverageByContent__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2212:1: ( rule__CoverageByContent__Group_5__0__Impl rule__CoverageByContent__Group_5__1 )
            // InternalCOV.g:2213:2: rule__CoverageByContent__Group_5__0__Impl rule__CoverageByContent__Group_5__1
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
    // InternalCOV.g:2220:1: rule__CoverageByContent__Group_5__0__Impl : ( 'description' ) ;
    public final void rule__CoverageByContent__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2224:1: ( ( 'description' ) )
            // InternalCOV.g:2225:1: ( 'description' )
            {
            // InternalCOV.g:2225:1: ( 'description' )
            // InternalCOV.g:2226:2: 'description'
            {
             before(grammarAccess.getCoverageByContentAccess().getDescriptionKeyword_5_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalCOV.g:2235:1: rule__CoverageByContent__Group_5__1 : rule__CoverageByContent__Group_5__1__Impl ;
    public final void rule__CoverageByContent__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2239:1: ( rule__CoverageByContent__Group_5__1__Impl )
            // InternalCOV.g:2240:2: rule__CoverageByContent__Group_5__1__Impl
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
    // InternalCOV.g:2246:1: rule__CoverageByContent__Group_5__1__Impl : ( ( rule__CoverageByContent__DescriptionAssignment_5_1 ) ) ;
    public final void rule__CoverageByContent__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2250:1: ( ( ( rule__CoverageByContent__DescriptionAssignment_5_1 ) ) )
            // InternalCOV.g:2251:1: ( ( rule__CoverageByContent__DescriptionAssignment_5_1 ) )
            {
            // InternalCOV.g:2251:1: ( ( rule__CoverageByContent__DescriptionAssignment_5_1 ) )
            // InternalCOV.g:2252:2: ( rule__CoverageByContent__DescriptionAssignment_5_1 )
            {
             before(grammarAccess.getCoverageByContentAccess().getDescriptionAssignment_5_1()); 
            // InternalCOV.g:2253:2: ( rule__CoverageByContent__DescriptionAssignment_5_1 )
            // InternalCOV.g:2253:3: rule__CoverageByContent__DescriptionAssignment_5_1
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
    // InternalCOV.g:2262:1: rule__CoverageByContent__Group_6__0 : rule__CoverageByContent__Group_6__0__Impl rule__CoverageByContent__Group_6__1 ;
    public final void rule__CoverageByContent__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2266:1: ( rule__CoverageByContent__Group_6__0__Impl rule__CoverageByContent__Group_6__1 )
            // InternalCOV.g:2267:2: rule__CoverageByContent__Group_6__0__Impl rule__CoverageByContent__Group_6__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalCOV.g:2274:1: rule__CoverageByContent__Group_6__0__Impl : ( 'condition' ) ;
    public final void rule__CoverageByContent__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2278:1: ( ( 'condition' ) )
            // InternalCOV.g:2279:1: ( 'condition' )
            {
            // InternalCOV.g:2279:1: ( 'condition' )
            // InternalCOV.g:2280:2: 'condition'
            {
             before(grammarAccess.getCoverageByContentAccess().getConditionKeyword_6_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalCOV.g:2289:1: rule__CoverageByContent__Group_6__1 : rule__CoverageByContent__Group_6__1__Impl ;
    public final void rule__CoverageByContent__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2293:1: ( rule__CoverageByContent__Group_6__1__Impl )
            // InternalCOV.g:2294:2: rule__CoverageByContent__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CoverageByContent__Group_6__1__Impl();

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
    // InternalCOV.g:2300:1: rule__CoverageByContent__Group_6__1__Impl : ( ( rule__CoverageByContent__ConditionAssignment_6_1 ) ) ;
    public final void rule__CoverageByContent__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2304:1: ( ( ( rule__CoverageByContent__ConditionAssignment_6_1 ) ) )
            // InternalCOV.g:2305:1: ( ( rule__CoverageByContent__ConditionAssignment_6_1 ) )
            {
            // InternalCOV.g:2305:1: ( ( rule__CoverageByContent__ConditionAssignment_6_1 ) )
            // InternalCOV.g:2306:2: ( rule__CoverageByContent__ConditionAssignment_6_1 )
            {
             before(grammarAccess.getCoverageByContentAccess().getConditionAssignment_6_1()); 
            // InternalCOV.g:2307:2: ( rule__CoverageByContent__ConditionAssignment_6_1 )
            // InternalCOV.g:2307:3: rule__CoverageByContent__ConditionAssignment_6_1
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


    // $ANTLR start "rule__BranchSpecification__Group__0"
    // InternalCOV.g:2316:1: rule__BranchSpecification__Group__0 : rule__BranchSpecification__Group__0__Impl rule__BranchSpecification__Group__1 ;
    public final void rule__BranchSpecification__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2320:1: ( rule__BranchSpecification__Group__0__Impl rule__BranchSpecification__Group__1 )
            // InternalCOV.g:2321:2: rule__BranchSpecification__Group__0__Impl rule__BranchSpecification__Group__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalCOV.g:2328:1: rule__BranchSpecification__Group__0__Impl : ( 'has' ) ;
    public final void rule__BranchSpecification__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2332:1: ( ( 'has' ) )
            // InternalCOV.g:2333:1: ( 'has' )
            {
            // InternalCOV.g:2333:1: ( 'has' )
            // InternalCOV.g:2334:2: 'has'
            {
             before(grammarAccess.getBranchSpecificationAccess().getHasKeyword_0()); 
            match(input,35,FOLLOW_2); 
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
    // InternalCOV.g:2343:1: rule__BranchSpecification__Group__1 : rule__BranchSpecification__Group__1__Impl rule__BranchSpecification__Group__2 ;
    public final void rule__BranchSpecification__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2347:1: ( rule__BranchSpecification__Group__1__Impl rule__BranchSpecification__Group__2 )
            // InternalCOV.g:2348:2: rule__BranchSpecification__Group__1__Impl rule__BranchSpecification__Group__2
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
    // InternalCOV.g:2355:1: rule__BranchSpecification__Group__1__Impl : ( 'branches' ) ;
    public final void rule__BranchSpecification__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2359:1: ( ( 'branches' ) )
            // InternalCOV.g:2360:1: ( 'branches' )
            {
            // InternalCOV.g:2360:1: ( 'branches' )
            // InternalCOV.g:2361:2: 'branches'
            {
             before(grammarAccess.getBranchSpecificationAccess().getBranchesKeyword_1()); 
            match(input,36,FOLLOW_2); 
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
    // InternalCOV.g:2370:1: rule__BranchSpecification__Group__2 : rule__BranchSpecification__Group__2__Impl rule__BranchSpecification__Group__3 ;
    public final void rule__BranchSpecification__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2374:1: ( rule__BranchSpecification__Group__2__Impl rule__BranchSpecification__Group__3 )
            // InternalCOV.g:2375:2: rule__BranchSpecification__Group__2__Impl rule__BranchSpecification__Group__3
            {
            pushFollow(FOLLOW_24);
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
    // InternalCOV.g:2382:1: rule__BranchSpecification__Group__2__Impl : ( '{' ) ;
    public final void rule__BranchSpecification__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2386:1: ( ( '{' ) )
            // InternalCOV.g:2387:1: ( '{' )
            {
            // InternalCOV.g:2387:1: ( '{' )
            // InternalCOV.g:2388:2: '{'
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
    // InternalCOV.g:2397:1: rule__BranchSpecification__Group__3 : rule__BranchSpecification__Group__3__Impl rule__BranchSpecification__Group__4 ;
    public final void rule__BranchSpecification__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2401:1: ( rule__BranchSpecification__Group__3__Impl rule__BranchSpecification__Group__4 )
            // InternalCOV.g:2402:2: rule__BranchSpecification__Group__3__Impl rule__BranchSpecification__Group__4
            {
            pushFollow(FOLLOW_24);
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
    // InternalCOV.g:2409:1: rule__BranchSpecification__Group__3__Impl : ( ( rule__BranchSpecification__Group_3__0 )? ) ;
    public final void rule__BranchSpecification__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2413:1: ( ( ( rule__BranchSpecification__Group_3__0 )? ) )
            // InternalCOV.g:2414:1: ( ( rule__BranchSpecification__Group_3__0 )? )
            {
            // InternalCOV.g:2414:1: ( ( rule__BranchSpecification__Group_3__0 )? )
            // InternalCOV.g:2415:2: ( rule__BranchSpecification__Group_3__0 )?
            {
             before(grammarAccess.getBranchSpecificationAccess().getGroup_3()); 
            // InternalCOV.g:2416:2: ( rule__BranchSpecification__Group_3__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==28) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalCOV.g:2416:3: rule__BranchSpecification__Group_3__0
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
    // InternalCOV.g:2424:1: rule__BranchSpecification__Group__4 : rule__BranchSpecification__Group__4__Impl rule__BranchSpecification__Group__5 ;
    public final void rule__BranchSpecification__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2428:1: ( rule__BranchSpecification__Group__4__Impl rule__BranchSpecification__Group__5 )
            // InternalCOV.g:2429:2: rule__BranchSpecification__Group__4__Impl rule__BranchSpecification__Group__5
            {
            pushFollow(FOLLOW_24);
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
    // InternalCOV.g:2436:1: rule__BranchSpecification__Group__4__Impl : ( ( rule__BranchSpecification__Group_4__0 )? ) ;
    public final void rule__BranchSpecification__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2440:1: ( ( ( rule__BranchSpecification__Group_4__0 )? ) )
            // InternalCOV.g:2441:1: ( ( rule__BranchSpecification__Group_4__0 )? )
            {
            // InternalCOV.g:2441:1: ( ( rule__BranchSpecification__Group_4__0 )? )
            // InternalCOV.g:2442:2: ( rule__BranchSpecification__Group_4__0 )?
            {
             before(grammarAccess.getBranchSpecificationAccess().getGroup_4()); 
            // InternalCOV.g:2443:2: ( rule__BranchSpecification__Group_4__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==29) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalCOV.g:2443:3: rule__BranchSpecification__Group_4__0
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
    // InternalCOV.g:2451:1: rule__BranchSpecification__Group__5 : rule__BranchSpecification__Group__5__Impl rule__BranchSpecification__Group__6 ;
    public final void rule__BranchSpecification__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2455:1: ( rule__BranchSpecification__Group__5__Impl rule__BranchSpecification__Group__6 )
            // InternalCOV.g:2456:2: rule__BranchSpecification__Group__5__Impl rule__BranchSpecification__Group__6
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
    // InternalCOV.g:2463:1: rule__BranchSpecification__Group__5__Impl : ( ( rule__BranchSpecification__BranchesAssignment_5 ) ) ;
    public final void rule__BranchSpecification__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2467:1: ( ( ( rule__BranchSpecification__BranchesAssignment_5 ) ) )
            // InternalCOV.g:2468:1: ( ( rule__BranchSpecification__BranchesAssignment_5 ) )
            {
            // InternalCOV.g:2468:1: ( ( rule__BranchSpecification__BranchesAssignment_5 ) )
            // InternalCOV.g:2469:2: ( rule__BranchSpecification__BranchesAssignment_5 )
            {
             before(grammarAccess.getBranchSpecificationAccess().getBranchesAssignment_5()); 
            // InternalCOV.g:2470:2: ( rule__BranchSpecification__BranchesAssignment_5 )
            // InternalCOV.g:2470:3: rule__BranchSpecification__BranchesAssignment_5
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
    // InternalCOV.g:2478:1: rule__BranchSpecification__Group__6 : rule__BranchSpecification__Group__6__Impl rule__BranchSpecification__Group__7 ;
    public final void rule__BranchSpecification__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2482:1: ( rule__BranchSpecification__Group__6__Impl rule__BranchSpecification__Group__7 )
            // InternalCOV.g:2483:2: rule__BranchSpecification__Group__6__Impl rule__BranchSpecification__Group__7
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
    // InternalCOV.g:2490:1: rule__BranchSpecification__Group__6__Impl : ( ( rule__BranchSpecification__Group_6__0 )* ) ;
    public final void rule__BranchSpecification__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2494:1: ( ( ( rule__BranchSpecification__Group_6__0 )* ) )
            // InternalCOV.g:2495:1: ( ( rule__BranchSpecification__Group_6__0 )* )
            {
            // InternalCOV.g:2495:1: ( ( rule__BranchSpecification__Group_6__0 )* )
            // InternalCOV.g:2496:2: ( rule__BranchSpecification__Group_6__0 )*
            {
             before(grammarAccess.getBranchSpecificationAccess().getGroup_6()); 
            // InternalCOV.g:2497:2: ( rule__BranchSpecification__Group_6__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==22) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalCOV.g:2497:3: rule__BranchSpecification__Group_6__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__BranchSpecification__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
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
    // InternalCOV.g:2505:1: rule__BranchSpecification__Group__7 : rule__BranchSpecification__Group__7__Impl ;
    public final void rule__BranchSpecification__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2509:1: ( rule__BranchSpecification__Group__7__Impl )
            // InternalCOV.g:2510:2: rule__BranchSpecification__Group__7__Impl
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
    // InternalCOV.g:2516:1: rule__BranchSpecification__Group__7__Impl : ( '}' ) ;
    public final void rule__BranchSpecification__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2520:1: ( ( '}' ) )
            // InternalCOV.g:2521:1: ( '}' )
            {
            // InternalCOV.g:2521:1: ( '}' )
            // InternalCOV.g:2522:2: '}'
            {
             before(grammarAccess.getBranchSpecificationAccess().getRightCurlyBracketKeyword_7()); 
            match(input,21,FOLLOW_2); 
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
    // InternalCOV.g:2532:1: rule__BranchSpecification__Group_3__0 : rule__BranchSpecification__Group_3__0__Impl rule__BranchSpecification__Group_3__1 ;
    public final void rule__BranchSpecification__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2536:1: ( rule__BranchSpecification__Group_3__0__Impl rule__BranchSpecification__Group_3__1 )
            // InternalCOV.g:2537:2: rule__BranchSpecification__Group_3__0__Impl rule__BranchSpecification__Group_3__1
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
    // InternalCOV.g:2544:1: rule__BranchSpecification__Group_3__0__Impl : ( 'description' ) ;
    public final void rule__BranchSpecification__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2548:1: ( ( 'description' ) )
            // InternalCOV.g:2549:1: ( 'description' )
            {
            // InternalCOV.g:2549:1: ( 'description' )
            // InternalCOV.g:2550:2: 'description'
            {
             before(grammarAccess.getBranchSpecificationAccess().getDescriptionKeyword_3_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalCOV.g:2559:1: rule__BranchSpecification__Group_3__1 : rule__BranchSpecification__Group_3__1__Impl ;
    public final void rule__BranchSpecification__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2563:1: ( rule__BranchSpecification__Group_3__1__Impl )
            // InternalCOV.g:2564:2: rule__BranchSpecification__Group_3__1__Impl
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
    // InternalCOV.g:2570:1: rule__BranchSpecification__Group_3__1__Impl : ( ( rule__BranchSpecification__DescriptionAssignment_3_1 ) ) ;
    public final void rule__BranchSpecification__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2574:1: ( ( ( rule__BranchSpecification__DescriptionAssignment_3_1 ) ) )
            // InternalCOV.g:2575:1: ( ( rule__BranchSpecification__DescriptionAssignment_3_1 ) )
            {
            // InternalCOV.g:2575:1: ( ( rule__BranchSpecification__DescriptionAssignment_3_1 ) )
            // InternalCOV.g:2576:2: ( rule__BranchSpecification__DescriptionAssignment_3_1 )
            {
             before(grammarAccess.getBranchSpecificationAccess().getDescriptionAssignment_3_1()); 
            // InternalCOV.g:2577:2: ( rule__BranchSpecification__DescriptionAssignment_3_1 )
            // InternalCOV.g:2577:3: rule__BranchSpecification__DescriptionAssignment_3_1
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
    // InternalCOV.g:2586:1: rule__BranchSpecification__Group_4__0 : rule__BranchSpecification__Group_4__0__Impl rule__BranchSpecification__Group_4__1 ;
    public final void rule__BranchSpecification__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2590:1: ( rule__BranchSpecification__Group_4__0__Impl rule__BranchSpecification__Group_4__1 )
            // InternalCOV.g:2591:2: rule__BranchSpecification__Group_4__0__Impl rule__BranchSpecification__Group_4__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalCOV.g:2598:1: rule__BranchSpecification__Group_4__0__Impl : ( 'condition' ) ;
    public final void rule__BranchSpecification__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2602:1: ( ( 'condition' ) )
            // InternalCOV.g:2603:1: ( 'condition' )
            {
            // InternalCOV.g:2603:1: ( 'condition' )
            // InternalCOV.g:2604:2: 'condition'
            {
             before(grammarAccess.getBranchSpecificationAccess().getConditionKeyword_4_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalCOV.g:2613:1: rule__BranchSpecification__Group_4__1 : rule__BranchSpecification__Group_4__1__Impl ;
    public final void rule__BranchSpecification__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2617:1: ( rule__BranchSpecification__Group_4__1__Impl )
            // InternalCOV.g:2618:2: rule__BranchSpecification__Group_4__1__Impl
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
    // InternalCOV.g:2624:1: rule__BranchSpecification__Group_4__1__Impl : ( ( rule__BranchSpecification__ConditionAssignment_4_1 ) ) ;
    public final void rule__BranchSpecification__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2628:1: ( ( ( rule__BranchSpecification__ConditionAssignment_4_1 ) ) )
            // InternalCOV.g:2629:1: ( ( rule__BranchSpecification__ConditionAssignment_4_1 ) )
            {
            // InternalCOV.g:2629:1: ( ( rule__BranchSpecification__ConditionAssignment_4_1 ) )
            // InternalCOV.g:2630:2: ( rule__BranchSpecification__ConditionAssignment_4_1 )
            {
             before(grammarAccess.getBranchSpecificationAccess().getConditionAssignment_4_1()); 
            // InternalCOV.g:2631:2: ( rule__BranchSpecification__ConditionAssignment_4_1 )
            // InternalCOV.g:2631:3: rule__BranchSpecification__ConditionAssignment_4_1
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


    // $ANTLR start "rule__BranchSpecification__Group_6__0"
    // InternalCOV.g:2640:1: rule__BranchSpecification__Group_6__0 : rule__BranchSpecification__Group_6__0__Impl rule__BranchSpecification__Group_6__1 ;
    public final void rule__BranchSpecification__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2644:1: ( rule__BranchSpecification__Group_6__0__Impl rule__BranchSpecification__Group_6__1 )
            // InternalCOV.g:2645:2: rule__BranchSpecification__Group_6__0__Impl rule__BranchSpecification__Group_6__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalCOV.g:2652:1: rule__BranchSpecification__Group_6__0__Impl : ( ',' ) ;
    public final void rule__BranchSpecification__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2656:1: ( ( ',' ) )
            // InternalCOV.g:2657:1: ( ',' )
            {
            // InternalCOV.g:2657:1: ( ',' )
            // InternalCOV.g:2658:2: ','
            {
             before(grammarAccess.getBranchSpecificationAccess().getCommaKeyword_6_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalCOV.g:2667:1: rule__BranchSpecification__Group_6__1 : rule__BranchSpecification__Group_6__1__Impl ;
    public final void rule__BranchSpecification__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2671:1: ( rule__BranchSpecification__Group_6__1__Impl )
            // InternalCOV.g:2672:2: rule__BranchSpecification__Group_6__1__Impl
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
    // InternalCOV.g:2678:1: rule__BranchSpecification__Group_6__1__Impl : ( ( rule__BranchSpecification__BranchesAssignment_6_1 ) ) ;
    public final void rule__BranchSpecification__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2682:1: ( ( ( rule__BranchSpecification__BranchesAssignment_6_1 ) ) )
            // InternalCOV.g:2683:1: ( ( rule__BranchSpecification__BranchesAssignment_6_1 ) )
            {
            // InternalCOV.g:2683:1: ( ( rule__BranchSpecification__BranchesAssignment_6_1 ) )
            // InternalCOV.g:2684:2: ( rule__BranchSpecification__BranchesAssignment_6_1 )
            {
             before(grammarAccess.getBranchSpecificationAccess().getBranchesAssignment_6_1()); 
            // InternalCOV.g:2685:2: ( rule__BranchSpecification__BranchesAssignment_6_1 )
            // InternalCOV.g:2685:3: rule__BranchSpecification__BranchesAssignment_6_1
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
    // InternalCOV.g:2694:1: rule__Branch__Group__0 : rule__Branch__Group__0__Impl rule__Branch__Group__1 ;
    public final void rule__Branch__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2698:1: ( rule__Branch__Group__0__Impl rule__Branch__Group__1 )
            // InternalCOV.g:2699:2: rule__Branch__Group__0__Impl rule__Branch__Group__1
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
    // InternalCOV.g:2706:1: rule__Branch__Group__0__Impl : ( 'queryBranch' ) ;
    public final void rule__Branch__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2710:1: ( ( 'queryBranch' ) )
            // InternalCOV.g:2711:1: ( 'queryBranch' )
            {
            // InternalCOV.g:2711:1: ( 'queryBranch' )
            // InternalCOV.g:2712:2: 'queryBranch'
            {
             before(grammarAccess.getBranchAccess().getQueryBranchKeyword_0()); 
            match(input,37,FOLLOW_2); 
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
    // InternalCOV.g:2721:1: rule__Branch__Group__1 : rule__Branch__Group__1__Impl ;
    public final void rule__Branch__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2725:1: ( rule__Branch__Group__1__Impl )
            // InternalCOV.g:2726:2: rule__Branch__Group__1__Impl
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
    // InternalCOV.g:2732:1: rule__Branch__Group__1__Impl : ( ( rule__Branch__OCLQueryAssignment_1 ) ) ;
    public final void rule__Branch__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2736:1: ( ( ( rule__Branch__OCLQueryAssignment_1 ) ) )
            // InternalCOV.g:2737:1: ( ( rule__Branch__OCLQueryAssignment_1 ) )
            {
            // InternalCOV.g:2737:1: ( ( rule__Branch__OCLQueryAssignment_1 ) )
            // InternalCOV.g:2738:2: ( rule__Branch__OCLQueryAssignment_1 )
            {
             before(grammarAccess.getBranchAccess().getOCLQueryAssignment_1()); 
            // InternalCOV.g:2739:2: ( rule__Branch__OCLQueryAssignment_1 )
            // InternalCOV.g:2739:3: rule__Branch__OCLQueryAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Branch__OCLQueryAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBranchAccess().getOCLQueryAssignment_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__DomainSpecificCoverage__NameAssignment_1"
    // InternalCOV.g:2748:1: rule__DomainSpecificCoverage__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__DomainSpecificCoverage__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2752:1: ( ( ruleEString ) )
            // InternalCOV.g:2753:2: ( ruleEString )
            {
            // InternalCOV.g:2753:2: ( ruleEString )
            // InternalCOV.g:2754:3: ruleEString
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
    // InternalCOV.g:2763:1: rule__DomainSpecificCoverage__MetamodelAssignment_5 : ( ( ruleEString ) ) ;
    public final void rule__DomainSpecificCoverage__MetamodelAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2767:1: ( ( ( ruleEString ) ) )
            // InternalCOV.g:2768:2: ( ( ruleEString ) )
            {
            // InternalCOV.g:2768:2: ( ( ruleEString ) )
            // InternalCOV.g:2769:3: ( ruleEString )
            {
             before(grammarAccess.getDomainSpecificCoverageAccess().getMetamodelEPackageCrossReference_5_0()); 
            // InternalCOV.g:2770:3: ( ruleEString )
            // InternalCOV.g:2771:4: ruleEString
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
    // InternalCOV.g:2782:1: rule__DomainSpecificCoverage__ContextsAssignment_6 : ( ruleContext ) ;
    public final void rule__DomainSpecificCoverage__ContextsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2786:1: ( ( ruleContext ) )
            // InternalCOV.g:2787:2: ( ruleContext )
            {
            // InternalCOV.g:2787:2: ( ruleContext )
            // InternalCOV.g:2788:3: ruleContext
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
    // InternalCOV.g:2797:1: rule__DomainSpecificCoverage__ContextsAssignment_7_1 : ( ruleContext ) ;
    public final void rule__DomainSpecificCoverage__ContextsAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2801:1: ( ( ruleContext ) )
            // InternalCOV.g:2802:2: ( ruleContext )
            {
            // InternalCOV.g:2802:2: ( ruleContext )
            // InternalCOV.g:2803:3: ruleContext
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
    // InternalCOV.g:2812:1: rule__Context__MetaclassAssignment_1 : ( ( ruleEString ) ) ;
    public final void rule__Context__MetaclassAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2816:1: ( ( ( ruleEString ) ) )
            // InternalCOV.g:2817:2: ( ( ruleEString ) )
            {
            // InternalCOV.g:2817:2: ( ( ruleEString ) )
            // InternalCOV.g:2818:3: ( ruleEString )
            {
             before(grammarAccess.getContextAccess().getMetaclassEClassCrossReference_1_0()); 
            // InternalCOV.g:2819:3: ( ruleEString )
            // InternalCOV.g:2820:4: ruleEString
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
    // InternalCOV.g:2831:1: rule__Context__RulesAssignment_3_0 : ( ruleRule ) ;
    public final void rule__Context__RulesAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2835:1: ( ( ruleRule ) )
            // InternalCOV.g:2836:2: ( ruleRule )
            {
            // InternalCOV.g:2836:2: ( ruleRule )
            // InternalCOV.g:2837:3: ruleRule
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
    // InternalCOV.g:2846:1: rule__Context__RulesAssignment_3_1_1 : ( ruleRule ) ;
    public final void rule__Context__RulesAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2850:1: ( ( ruleRule ) )
            // InternalCOV.g:2851:2: ( ruleRule )
            {
            // InternalCOV.g:2851:2: ( ruleRule )
            // InternalCOV.g:2852:3: ruleRule
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
    // InternalCOV.g:2861:1: rule__Ignore__IgnoreSubtypesAssignment_3_1 : ( ruleEBoolean ) ;
    public final void rule__Ignore__IgnoreSubtypesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2865:1: ( ( ruleEBoolean ) )
            // InternalCOV.g:2866:2: ( ruleEBoolean )
            {
            // InternalCOV.g:2866:2: ( ruleEBoolean )
            // InternalCOV.g:2867:3: ruleEBoolean
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
    // InternalCOV.g:2876:1: rule__Ignore__DescriptionAssignment_5_1 : ( ruleEString ) ;
    public final void rule__Ignore__DescriptionAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2880:1: ( ( ruleEString ) )
            // InternalCOV.g:2881:2: ( ruleEString )
            {
            // InternalCOV.g:2881:2: ( ruleEString )
            // InternalCOV.g:2882:3: ruleEString
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
    // InternalCOV.g:2891:1: rule__Ignore__ConditionAssignment_6_1 : ( ruleCondition ) ;
    public final void rule__Ignore__ConditionAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2895:1: ( ( ruleCondition ) )
            // InternalCOV.g:2896:2: ( ruleCondition )
            {
            // InternalCOV.g:2896:2: ( ruleCondition )
            // InternalCOV.g:2897:3: ruleCondition
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


    // $ANTLR start "rule__LimitedIgnore__TypeAssignment_1"
    // InternalCOV.g:2906:1: rule__LimitedIgnore__TypeAssignment_1 : ( ruleLimitationType ) ;
    public final void rule__LimitedIgnore__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2910:1: ( ( ruleLimitationType ) )
            // InternalCOV.g:2911:2: ( ruleLimitationType )
            {
            // InternalCOV.g:2911:2: ( ruleLimitationType )
            // InternalCOV.g:2912:3: ruleLimitationType
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
    // InternalCOV.g:2921:1: rule__LimitedIgnore__ContainerMetaclassAssignment_2 : ( ( ruleEString ) ) ;
    public final void rule__LimitedIgnore__ContainerMetaclassAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2925:1: ( ( ( ruleEString ) ) )
            // InternalCOV.g:2926:2: ( ( ruleEString ) )
            {
            // InternalCOV.g:2926:2: ( ( ruleEString ) )
            // InternalCOV.g:2927:3: ( ruleEString )
            {
             before(grammarAccess.getLimitedIgnoreAccess().getContainerMetaclassEClassCrossReference_2_0()); 
            // InternalCOV.g:2928:3: ( ruleEString )
            // InternalCOV.g:2929:4: ruleEString
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
    // InternalCOV.g:2940:1: rule__LimitedIgnore__ContainerMetaclassAssignment_3_1 : ( ( ruleEString ) ) ;
    public final void rule__LimitedIgnore__ContainerMetaclassAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2944:1: ( ( ( ruleEString ) ) )
            // InternalCOV.g:2945:2: ( ( ruleEString ) )
            {
            // InternalCOV.g:2945:2: ( ( ruleEString ) )
            // InternalCOV.g:2946:3: ( ruleEString )
            {
             before(grammarAccess.getLimitedIgnoreAccess().getContainerMetaclassEClassCrossReference_3_1_0()); 
            // InternalCOV.g:2947:3: ( ruleEString )
            // InternalCOV.g:2948:4: ruleEString
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
    // InternalCOV.g:2959:1: rule__LimitedIgnore__DescriptionAssignment_4_1 : ( ruleEString ) ;
    public final void rule__LimitedIgnore__DescriptionAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2963:1: ( ( ruleEString ) )
            // InternalCOV.g:2964:2: ( ruleEString )
            {
            // InternalCOV.g:2964:2: ( ruleEString )
            // InternalCOV.g:2965:3: ruleEString
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
    // InternalCOV.g:2974:1: rule__LimitedIgnore__ConditionAssignment_5_1 : ( ruleCondition ) ;
    public final void rule__LimitedIgnore__ConditionAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2978:1: ( ( ruleCondition ) )
            // InternalCOV.g:2979:2: ( ruleCondition )
            {
            // InternalCOV.g:2979:2: ( ruleCondition )
            // InternalCOV.g:2980:3: ruleCondition
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


    // $ANTLR start "rule__CoverageOfReferenced__ReferenceAssignment_1"
    // InternalCOV.g:2989:1: rule__CoverageOfReferenced__ReferenceAssignment_1 : ( ( ruleEString ) ) ;
    public final void rule__CoverageOfReferenced__ReferenceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2993:1: ( ( ( ruleEString ) ) )
            // InternalCOV.g:2994:2: ( ( ruleEString ) )
            {
            // InternalCOV.g:2994:2: ( ( ruleEString ) )
            // InternalCOV.g:2995:3: ( ruleEString )
            {
             before(grammarAccess.getCoverageOfReferencedAccess().getReferenceEReferenceCrossReference_1_0()); 
            // InternalCOV.g:2996:3: ( ruleEString )
            // InternalCOV.g:2997:4: ruleEString
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
    // InternalCOV.g:3008:1: rule__CoverageOfReferenced__ReferenceAssignment_2_1 : ( ( ruleEString ) ) ;
    public final void rule__CoverageOfReferenced__ReferenceAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3012:1: ( ( ( ruleEString ) ) )
            // InternalCOV.g:3013:2: ( ( ruleEString ) )
            {
            // InternalCOV.g:3013:2: ( ( ruleEString ) )
            // InternalCOV.g:3014:3: ( ruleEString )
            {
             before(grammarAccess.getCoverageOfReferencedAccess().getReferenceEReferenceCrossReference_2_1_0()); 
            // InternalCOV.g:3015:3: ( ruleEString )
            // InternalCOV.g:3016:4: ruleEString
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
    // InternalCOV.g:3027:1: rule__CoverageOfReferenced__DescriptionAssignment_3_1 : ( ruleEString ) ;
    public final void rule__CoverageOfReferenced__DescriptionAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3031:1: ( ( ruleEString ) )
            // InternalCOV.g:3032:2: ( ruleEString )
            {
            // InternalCOV.g:3032:2: ( ruleEString )
            // InternalCOV.g:3033:3: ruleEString
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
    // InternalCOV.g:3042:1: rule__CoverageOfReferenced__ConditionAssignment_4_1 : ( ruleCondition ) ;
    public final void rule__CoverageOfReferenced__ConditionAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3046:1: ( ( ruleCondition ) )
            // InternalCOV.g:3047:2: ( ruleCondition )
            {
            // InternalCOV.g:3047:2: ( ruleCondition )
            // InternalCOV.g:3048:3: ruleCondition
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


    // $ANTLR start "rule__CoverageByContent__MultiplicityAssignment_2"
    // InternalCOV.g:3057:1: rule__CoverageByContent__MultiplicityAssignment_2 : ( ruleCoveredContents ) ;
    public final void rule__CoverageByContent__MultiplicityAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3061:1: ( ( ruleCoveredContents ) )
            // InternalCOV.g:3062:2: ( ruleCoveredContents )
            {
            // InternalCOV.g:3062:2: ( ruleCoveredContents )
            // InternalCOV.g:3063:3: ruleCoveredContents
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
    // InternalCOV.g:3072:1: rule__CoverageByContent__ContainmentReferenceAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__CoverageByContent__ContainmentReferenceAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3076:1: ( ( ( ruleEString ) ) )
            // InternalCOV.g:3077:2: ( ( ruleEString ) )
            {
            // InternalCOV.g:3077:2: ( ( ruleEString ) )
            // InternalCOV.g:3078:3: ( ruleEString )
            {
             before(grammarAccess.getCoverageByContentAccess().getContainmentReferenceEReferenceCrossReference_3_0()); 
            // InternalCOV.g:3079:3: ( ruleEString )
            // InternalCOV.g:3080:4: ruleEString
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
    // InternalCOV.g:3091:1: rule__CoverageByContent__DescriptionAssignment_5_1 : ( ruleEString ) ;
    public final void rule__CoverageByContent__DescriptionAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3095:1: ( ( ruleEString ) )
            // InternalCOV.g:3096:2: ( ruleEString )
            {
            // InternalCOV.g:3096:2: ( ruleEString )
            // InternalCOV.g:3097:3: ruleEString
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
    // InternalCOV.g:3106:1: rule__CoverageByContent__ConditionAssignment_6_1 : ( ruleCondition ) ;
    public final void rule__CoverageByContent__ConditionAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3110:1: ( ( ruleCondition ) )
            // InternalCOV.g:3111:2: ( ruleCondition )
            {
            // InternalCOV.g:3111:2: ( ruleCondition )
            // InternalCOV.g:3112:3: ruleCondition
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


    // $ANTLR start "rule__BranchSpecification__DescriptionAssignment_3_1"
    // InternalCOV.g:3121:1: rule__BranchSpecification__DescriptionAssignment_3_1 : ( ruleEString ) ;
    public final void rule__BranchSpecification__DescriptionAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3125:1: ( ( ruleEString ) )
            // InternalCOV.g:3126:2: ( ruleEString )
            {
            // InternalCOV.g:3126:2: ( ruleEString )
            // InternalCOV.g:3127:3: ruleEString
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
    // InternalCOV.g:3136:1: rule__BranchSpecification__ConditionAssignment_4_1 : ( ruleCondition ) ;
    public final void rule__BranchSpecification__ConditionAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3140:1: ( ( ruleCondition ) )
            // InternalCOV.g:3141:2: ( ruleCondition )
            {
            // InternalCOV.g:3141:2: ( ruleCondition )
            // InternalCOV.g:3142:3: ruleCondition
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


    // $ANTLR start "rule__BranchSpecification__BranchesAssignment_5"
    // InternalCOV.g:3151:1: rule__BranchSpecification__BranchesAssignment_5 : ( ruleBranch ) ;
    public final void rule__BranchSpecification__BranchesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3155:1: ( ( ruleBranch ) )
            // InternalCOV.g:3156:2: ( ruleBranch )
            {
            // InternalCOV.g:3156:2: ( ruleBranch )
            // InternalCOV.g:3157:3: ruleBranch
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
    // InternalCOV.g:3166:1: rule__BranchSpecification__BranchesAssignment_6_1 : ( ruleBranch ) ;
    public final void rule__BranchSpecification__BranchesAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3170:1: ( ( ruleBranch ) )
            // InternalCOV.g:3171:2: ( ruleBranch )
            {
            // InternalCOV.g:3171:2: ( ruleBranch )
            // InternalCOV.g:3172:3: ruleBranch
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


    // $ANTLR start "rule__Branch__OCLQueryAssignment_1"
    // InternalCOV.g:3181:1: rule__Branch__OCLQueryAssignment_1 : ( ruleEString ) ;
    public final void rule__Branch__OCLQueryAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3185:1: ( ( ruleEString ) )
            // InternalCOV.g:3186:2: ( ruleEString )
            {
            // InternalCOV.g:3186:2: ( ruleEString )
            // InternalCOV.g:3187:3: ruleEString
            {
             before(grammarAccess.getBranchAccess().getOCLQueryEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBranchAccess().getOCLQueryEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Branch__OCLQueryAssignment_1"


    // $ANTLR start "rule__Condition__OCLConstraintAssignment"
    // InternalCOV.g:3196:1: rule__Condition__OCLConstraintAssignment : ( ruleEString ) ;
    public final void rule__Condition__OCLConstraintAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3200:1: ( ( ruleEString ) )
            // InternalCOV.g:3201:2: ( ruleEString )
            {
            // InternalCOV.g:3201:2: ( ruleEString )
            // InternalCOV.g:3202:3: ruleEString
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
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000009C1200000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000009C1000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000030400000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000002030000000L});

}