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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'true'", "'false'", "'ALL'", "'ONE'", "'containedBy'", "'notContainedBy'", "'ruleset'", "'{'", "'import'", "'metamodel'", "'}'", "','", "'ModelElementCoverageRuleset'", "'BranchCoverageRuleset'", "'context'", "'ignore'", "'('", "')'", "'subtypes'", "'description'", "'condition'", "'ignoreif'", "'covers'", "'covered'", "'when'", "'iscovered'", "'has'", "'branches'", "'queryBranch'"
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


    // $ANTLR start "entryRuleCoverageMetric"
    // InternalCOV.g:78:1: entryRuleCoverageMetric : ruleCoverageMetric EOF ;
    public final void entryRuleCoverageMetric() throws RecognitionException {
        try {
            // InternalCOV.g:79:1: ( ruleCoverageMetric EOF )
            // InternalCOV.g:80:1: ruleCoverageMetric EOF
            {
             before(grammarAccess.getCoverageMetricRule()); 
            pushFollow(FOLLOW_1);
            ruleCoverageMetric();

            state._fsp--;

             after(grammarAccess.getCoverageMetricRule()); 
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
    // $ANTLR end "entryRuleCoverageMetric"


    // $ANTLR start "ruleCoverageMetric"
    // InternalCOV.g:87:1: ruleCoverageMetric : ( ( rule__CoverageMetric__Alternatives ) ) ;
    public final void ruleCoverageMetric() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:91:2: ( ( ( rule__CoverageMetric__Alternatives ) ) )
            // InternalCOV.g:92:2: ( ( rule__CoverageMetric__Alternatives ) )
            {
            // InternalCOV.g:92:2: ( ( rule__CoverageMetric__Alternatives ) )
            // InternalCOV.g:93:3: ( rule__CoverageMetric__Alternatives )
            {
             before(grammarAccess.getCoverageMetricAccess().getAlternatives()); 
            // InternalCOV.g:94:3: ( rule__CoverageMetric__Alternatives )
            // InternalCOV.g:94:4: rule__CoverageMetric__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__CoverageMetric__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCoverageMetricAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCoverageMetric"


    // $ANTLR start "entryRuleModelElementCoverage"
    // InternalCOV.g:103:1: entryRuleModelElementCoverage : ruleModelElementCoverage EOF ;
    public final void entryRuleModelElementCoverage() throws RecognitionException {
        try {
            // InternalCOV.g:104:1: ( ruleModelElementCoverage EOF )
            // InternalCOV.g:105:1: ruleModelElementCoverage EOF
            {
             before(grammarAccess.getModelElementCoverageRule()); 
            pushFollow(FOLLOW_1);
            ruleModelElementCoverage();

            state._fsp--;

             after(grammarAccess.getModelElementCoverageRule()); 
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
    // $ANTLR end "entryRuleModelElementCoverage"


    // $ANTLR start "ruleModelElementCoverage"
    // InternalCOV.g:112:1: ruleModelElementCoverage : ( ( rule__ModelElementCoverage__Group__0 ) ) ;
    public final void ruleModelElementCoverage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:116:2: ( ( ( rule__ModelElementCoverage__Group__0 ) ) )
            // InternalCOV.g:117:2: ( ( rule__ModelElementCoverage__Group__0 ) )
            {
            // InternalCOV.g:117:2: ( ( rule__ModelElementCoverage__Group__0 ) )
            // InternalCOV.g:118:3: ( rule__ModelElementCoverage__Group__0 )
            {
             before(grammarAccess.getModelElementCoverageAccess().getGroup()); 
            // InternalCOV.g:119:3: ( rule__ModelElementCoverage__Group__0 )
            // InternalCOV.g:119:4: rule__ModelElementCoverage__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ModelElementCoverage__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelElementCoverageAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModelElementCoverage"


    // $ANTLR start "entryRuleBranchCoverage"
    // InternalCOV.g:128:1: entryRuleBranchCoverage : ruleBranchCoverage EOF ;
    public final void entryRuleBranchCoverage() throws RecognitionException {
        try {
            // InternalCOV.g:129:1: ( ruleBranchCoverage EOF )
            // InternalCOV.g:130:1: ruleBranchCoverage EOF
            {
             before(grammarAccess.getBranchCoverageRule()); 
            pushFollow(FOLLOW_1);
            ruleBranchCoverage();

            state._fsp--;

             after(grammarAccess.getBranchCoverageRule()); 
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
    // $ANTLR end "entryRuleBranchCoverage"


    // $ANTLR start "ruleBranchCoverage"
    // InternalCOV.g:137:1: ruleBranchCoverage : ( ( rule__BranchCoverage__Group__0 ) ) ;
    public final void ruleBranchCoverage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:141:2: ( ( ( rule__BranchCoverage__Group__0 ) ) )
            // InternalCOV.g:142:2: ( ( rule__BranchCoverage__Group__0 ) )
            {
            // InternalCOV.g:142:2: ( ( rule__BranchCoverage__Group__0 ) )
            // InternalCOV.g:143:3: ( rule__BranchCoverage__Group__0 )
            {
             before(grammarAccess.getBranchCoverageAccess().getGroup()); 
            // InternalCOV.g:144:3: ( rule__BranchCoverage__Group__0 )
            // InternalCOV.g:144:4: rule__BranchCoverage__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BranchCoverage__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBranchCoverageAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBranchCoverage"


    // $ANTLR start "entryRuleEString"
    // InternalCOV.g:153:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalCOV.g:154:1: ( ruleEString EOF )
            // InternalCOV.g:155:1: ruleEString EOF
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
    // InternalCOV.g:162:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:166:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalCOV.g:167:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalCOV.g:167:2: ( ( rule__EString__Alternatives ) )
            // InternalCOV.g:168:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalCOV.g:169:3: ( rule__EString__Alternatives )
            // InternalCOV.g:169:4: rule__EString__Alternatives
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
    // InternalCOV.g:178:1: entryRuleContext : ruleContext EOF ;
    public final void entryRuleContext() throws RecognitionException {
        try {
            // InternalCOV.g:179:1: ( ruleContext EOF )
            // InternalCOV.g:180:1: ruleContext EOF
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
    // InternalCOV.g:187:1: ruleContext : ( ( rule__Context__Group__0 ) ) ;
    public final void ruleContext() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:191:2: ( ( ( rule__Context__Group__0 ) ) )
            // InternalCOV.g:192:2: ( ( rule__Context__Group__0 ) )
            {
            // InternalCOV.g:192:2: ( ( rule__Context__Group__0 ) )
            // InternalCOV.g:193:3: ( rule__Context__Group__0 )
            {
             before(grammarAccess.getContextAccess().getGroup()); 
            // InternalCOV.g:194:3: ( rule__Context__Group__0 )
            // InternalCOV.g:194:4: rule__Context__Group__0
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
    // InternalCOV.g:203:1: entryRuleRule : ruleRule EOF ;
    public final void entryRuleRule() throws RecognitionException {
        try {
            // InternalCOV.g:204:1: ( ruleRule EOF )
            // InternalCOV.g:205:1: ruleRule EOF
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
    // InternalCOV.g:212:1: ruleRule : ( ( rule__Rule__Alternatives ) ) ;
    public final void ruleRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:216:2: ( ( ( rule__Rule__Alternatives ) ) )
            // InternalCOV.g:217:2: ( ( rule__Rule__Alternatives ) )
            {
            // InternalCOV.g:217:2: ( ( rule__Rule__Alternatives ) )
            // InternalCOV.g:218:3: ( rule__Rule__Alternatives )
            {
             before(grammarAccess.getRuleAccess().getAlternatives()); 
            // InternalCOV.g:219:3: ( rule__Rule__Alternatives )
            // InternalCOV.g:219:4: rule__Rule__Alternatives
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
    // InternalCOV.g:228:1: entryRuleEBoolean : ruleEBoolean EOF ;
    public final void entryRuleEBoolean() throws RecognitionException {
        try {
            // InternalCOV.g:229:1: ( ruleEBoolean EOF )
            // InternalCOV.g:230:1: ruleEBoolean EOF
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
    // InternalCOV.g:237:1: ruleEBoolean : ( ( rule__EBoolean__Alternatives ) ) ;
    public final void ruleEBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:241:2: ( ( ( rule__EBoolean__Alternatives ) ) )
            // InternalCOV.g:242:2: ( ( rule__EBoolean__Alternatives ) )
            {
            // InternalCOV.g:242:2: ( ( rule__EBoolean__Alternatives ) )
            // InternalCOV.g:243:3: ( rule__EBoolean__Alternatives )
            {
             before(grammarAccess.getEBooleanAccess().getAlternatives()); 
            // InternalCOV.g:244:3: ( rule__EBoolean__Alternatives )
            // InternalCOV.g:244:4: rule__EBoolean__Alternatives
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
    // InternalCOV.g:253:1: entryRuleIgnore : ruleIgnore EOF ;
    public final void entryRuleIgnore() throws RecognitionException {
        try {
            // InternalCOV.g:254:1: ( ruleIgnore EOF )
            // InternalCOV.g:255:1: ruleIgnore EOF
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
    // InternalCOV.g:262:1: ruleIgnore : ( ( rule__Ignore__Group__0 ) ) ;
    public final void ruleIgnore() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:266:2: ( ( ( rule__Ignore__Group__0 ) ) )
            // InternalCOV.g:267:2: ( ( rule__Ignore__Group__0 ) )
            {
            // InternalCOV.g:267:2: ( ( rule__Ignore__Group__0 ) )
            // InternalCOV.g:268:3: ( rule__Ignore__Group__0 )
            {
             before(grammarAccess.getIgnoreAccess().getGroup()); 
            // InternalCOV.g:269:3: ( rule__Ignore__Group__0 )
            // InternalCOV.g:269:4: rule__Ignore__Group__0
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
    // InternalCOV.g:278:1: entryRuleLimitedIgnore : ruleLimitedIgnore EOF ;
    public final void entryRuleLimitedIgnore() throws RecognitionException {
        try {
            // InternalCOV.g:279:1: ( ruleLimitedIgnore EOF )
            // InternalCOV.g:280:1: ruleLimitedIgnore EOF
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
    // InternalCOV.g:287:1: ruleLimitedIgnore : ( ( rule__LimitedIgnore__Group__0 ) ) ;
    public final void ruleLimitedIgnore() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:291:2: ( ( ( rule__LimitedIgnore__Group__0 ) ) )
            // InternalCOV.g:292:2: ( ( rule__LimitedIgnore__Group__0 ) )
            {
            // InternalCOV.g:292:2: ( ( rule__LimitedIgnore__Group__0 ) )
            // InternalCOV.g:293:3: ( rule__LimitedIgnore__Group__0 )
            {
             before(grammarAccess.getLimitedIgnoreAccess().getGroup()); 
            // InternalCOV.g:294:3: ( rule__LimitedIgnore__Group__0 )
            // InternalCOV.g:294:4: rule__LimitedIgnore__Group__0
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
    // InternalCOV.g:303:1: entryRuleCoverageOfReferenced : ruleCoverageOfReferenced EOF ;
    public final void entryRuleCoverageOfReferenced() throws RecognitionException {
        try {
            // InternalCOV.g:304:1: ( ruleCoverageOfReferenced EOF )
            // InternalCOV.g:305:1: ruleCoverageOfReferenced EOF
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
    // InternalCOV.g:312:1: ruleCoverageOfReferenced : ( ( rule__CoverageOfReferenced__Group__0 ) ) ;
    public final void ruleCoverageOfReferenced() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:316:2: ( ( ( rule__CoverageOfReferenced__Group__0 ) ) )
            // InternalCOV.g:317:2: ( ( rule__CoverageOfReferenced__Group__0 ) )
            {
            // InternalCOV.g:317:2: ( ( rule__CoverageOfReferenced__Group__0 ) )
            // InternalCOV.g:318:3: ( rule__CoverageOfReferenced__Group__0 )
            {
             before(grammarAccess.getCoverageOfReferencedAccess().getGroup()); 
            // InternalCOV.g:319:3: ( rule__CoverageOfReferenced__Group__0 )
            // InternalCOV.g:319:4: rule__CoverageOfReferenced__Group__0
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
    // InternalCOV.g:328:1: entryRuleCoverageByContent : ruleCoverageByContent EOF ;
    public final void entryRuleCoverageByContent() throws RecognitionException {
        try {
            // InternalCOV.g:329:1: ( ruleCoverageByContent EOF )
            // InternalCOV.g:330:1: ruleCoverageByContent EOF
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
    // InternalCOV.g:337:1: ruleCoverageByContent : ( ( rule__CoverageByContent__Group__0 ) ) ;
    public final void ruleCoverageByContent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:341:2: ( ( ( rule__CoverageByContent__Group__0 ) ) )
            // InternalCOV.g:342:2: ( ( rule__CoverageByContent__Group__0 ) )
            {
            // InternalCOV.g:342:2: ( ( rule__CoverageByContent__Group__0 ) )
            // InternalCOV.g:343:3: ( rule__CoverageByContent__Group__0 )
            {
             before(grammarAccess.getCoverageByContentAccess().getGroup()); 
            // InternalCOV.g:344:3: ( rule__CoverageByContent__Group__0 )
            // InternalCOV.g:344:4: rule__CoverageByContent__Group__0
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
    // InternalCOV.g:353:1: entryRuleBranchSpecification : ruleBranchSpecification EOF ;
    public final void entryRuleBranchSpecification() throws RecognitionException {
        try {
            // InternalCOV.g:354:1: ( ruleBranchSpecification EOF )
            // InternalCOV.g:355:1: ruleBranchSpecification EOF
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
    // InternalCOV.g:362:1: ruleBranchSpecification : ( ( rule__BranchSpecification__Group__0 ) ) ;
    public final void ruleBranchSpecification() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:366:2: ( ( ( rule__BranchSpecification__Group__0 ) ) )
            // InternalCOV.g:367:2: ( ( rule__BranchSpecification__Group__0 ) )
            {
            // InternalCOV.g:367:2: ( ( rule__BranchSpecification__Group__0 ) )
            // InternalCOV.g:368:3: ( rule__BranchSpecification__Group__0 )
            {
             before(grammarAccess.getBranchSpecificationAccess().getGroup()); 
            // InternalCOV.g:369:3: ( rule__BranchSpecification__Group__0 )
            // InternalCOV.g:369:4: rule__BranchSpecification__Group__0
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
    // InternalCOV.g:378:1: entryRuleBranch : ruleBranch EOF ;
    public final void entryRuleBranch() throws RecognitionException {
        try {
            // InternalCOV.g:379:1: ( ruleBranch EOF )
            // InternalCOV.g:380:1: ruleBranch EOF
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
    // InternalCOV.g:387:1: ruleBranch : ( ( rule__Branch__Group__0 ) ) ;
    public final void ruleBranch() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:391:2: ( ( ( rule__Branch__Group__0 ) ) )
            // InternalCOV.g:392:2: ( ( rule__Branch__Group__0 ) )
            {
            // InternalCOV.g:392:2: ( ( rule__Branch__Group__0 ) )
            // InternalCOV.g:393:3: ( rule__Branch__Group__0 )
            {
             before(grammarAccess.getBranchAccess().getGroup()); 
            // InternalCOV.g:394:3: ( rule__Branch__Group__0 )
            // InternalCOV.g:394:4: rule__Branch__Group__0
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
    // InternalCOV.g:403:1: entryRuleCondition : ruleCondition EOF ;
    public final void entryRuleCondition() throws RecognitionException {
        try {
            // InternalCOV.g:404:1: ( ruleCondition EOF )
            // InternalCOV.g:405:1: ruleCondition EOF
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
    // InternalCOV.g:412:1: ruleCondition : ( ( rule__Condition__OCLConstraintAssignment ) ) ;
    public final void ruleCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:416:2: ( ( ( rule__Condition__OCLConstraintAssignment ) ) )
            // InternalCOV.g:417:2: ( ( rule__Condition__OCLConstraintAssignment ) )
            {
            // InternalCOV.g:417:2: ( ( rule__Condition__OCLConstraintAssignment ) )
            // InternalCOV.g:418:3: ( rule__Condition__OCLConstraintAssignment )
            {
             before(grammarAccess.getConditionAccess().getOCLConstraintAssignment()); 
            // InternalCOV.g:419:3: ( rule__Condition__OCLConstraintAssignment )
            // InternalCOV.g:419:4: rule__Condition__OCLConstraintAssignment
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
    // InternalCOV.g:428:1: ruleCoveredContents : ( ( rule__CoveredContents__Alternatives ) ) ;
    public final void ruleCoveredContents() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:432:1: ( ( ( rule__CoveredContents__Alternatives ) ) )
            // InternalCOV.g:433:2: ( ( rule__CoveredContents__Alternatives ) )
            {
            // InternalCOV.g:433:2: ( ( rule__CoveredContents__Alternatives ) )
            // InternalCOV.g:434:3: ( rule__CoveredContents__Alternatives )
            {
             before(grammarAccess.getCoveredContentsAccess().getAlternatives()); 
            // InternalCOV.g:435:3: ( rule__CoveredContents__Alternatives )
            // InternalCOV.g:435:4: rule__CoveredContents__Alternatives
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
    // InternalCOV.g:444:1: ruleLimitationType : ( ( rule__LimitationType__Alternatives ) ) ;
    public final void ruleLimitationType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:448:1: ( ( ( rule__LimitationType__Alternatives ) ) )
            // InternalCOV.g:449:2: ( ( rule__LimitationType__Alternatives ) )
            {
            // InternalCOV.g:449:2: ( ( rule__LimitationType__Alternatives ) )
            // InternalCOV.g:450:3: ( rule__LimitationType__Alternatives )
            {
             before(grammarAccess.getLimitationTypeAccess().getAlternatives()); 
            // InternalCOV.g:451:3: ( rule__LimitationType__Alternatives )
            // InternalCOV.g:451:4: rule__LimitationType__Alternatives
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


    // $ANTLR start "rule__CoverageMetric__Alternatives"
    // InternalCOV.g:459:1: rule__CoverageMetric__Alternatives : ( ( ruleModelElementCoverage ) | ( ruleBranchCoverage ) );
    public final void rule__CoverageMetric__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:463:1: ( ( ruleModelElementCoverage ) | ( ruleBranchCoverage ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==23) ) {
                alt1=1;
            }
            else if ( (LA1_0==24) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalCOV.g:464:2: ( ruleModelElementCoverage )
                    {
                    // InternalCOV.g:464:2: ( ruleModelElementCoverage )
                    // InternalCOV.g:465:3: ruleModelElementCoverage
                    {
                     before(grammarAccess.getCoverageMetricAccess().getModelElementCoverageParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleModelElementCoverage();

                    state._fsp--;

                     after(grammarAccess.getCoverageMetricAccess().getModelElementCoverageParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCOV.g:470:2: ( ruleBranchCoverage )
                    {
                    // InternalCOV.g:470:2: ( ruleBranchCoverage )
                    // InternalCOV.g:471:3: ruleBranchCoverage
                    {
                     before(grammarAccess.getCoverageMetricAccess().getBranchCoverageParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleBranchCoverage();

                    state._fsp--;

                     after(grammarAccess.getCoverageMetricAccess().getBranchCoverageParserRuleCall_1()); 

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
    // $ANTLR end "rule__CoverageMetric__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalCOV.g:480:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:484:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalCOV.g:485:2: ( RULE_STRING )
                    {
                    // InternalCOV.g:485:2: ( RULE_STRING )
                    // InternalCOV.g:486:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCOV.g:491:2: ( RULE_ID )
                    {
                    // InternalCOV.g:491:2: ( RULE_ID )
                    // InternalCOV.g:492:3: RULE_ID
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
    // InternalCOV.g:501:1: rule__Rule__Alternatives : ( ( ruleIgnore ) | ( ruleCoverageOfReferenced ) | ( ruleCoverageByContent ) | ( ruleLimitedIgnore ) );
    public final void rule__Rule__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:505:1: ( ( ruleIgnore ) | ( ruleCoverageOfReferenced ) | ( ruleCoverageByContent ) | ( ruleLimitedIgnore ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt3=1;
                }
                break;
            case 33:
                {
                alt3=2;
                }
                break;
            case 34:
                {
                alt3=3;
                }
                break;
            case 32:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalCOV.g:506:2: ( ruleIgnore )
                    {
                    // InternalCOV.g:506:2: ( ruleIgnore )
                    // InternalCOV.g:507:3: ruleIgnore
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
                    // InternalCOV.g:512:2: ( ruleCoverageOfReferenced )
                    {
                    // InternalCOV.g:512:2: ( ruleCoverageOfReferenced )
                    // InternalCOV.g:513:3: ruleCoverageOfReferenced
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
                    // InternalCOV.g:518:2: ( ruleCoverageByContent )
                    {
                    // InternalCOV.g:518:2: ( ruleCoverageByContent )
                    // InternalCOV.g:519:3: ruleCoverageByContent
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
                    // InternalCOV.g:524:2: ( ruleLimitedIgnore )
                    {
                    // InternalCOV.g:524:2: ( ruleLimitedIgnore )
                    // InternalCOV.g:525:3: ruleLimitedIgnore
                    {
                     before(grammarAccess.getRuleAccess().getLimitedIgnoreParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleLimitedIgnore();

                    state._fsp--;

                     after(grammarAccess.getRuleAccess().getLimitedIgnoreParserRuleCall_3()); 

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
    // InternalCOV.g:534:1: rule__EBoolean__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__EBoolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:538:1: ( ( 'true' ) | ( 'false' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==11) ) {
                alt4=1;
            }
            else if ( (LA4_0==12) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalCOV.g:539:2: ( 'true' )
                    {
                    // InternalCOV.g:539:2: ( 'true' )
                    // InternalCOV.g:540:3: 'true'
                    {
                     before(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCOV.g:545:2: ( 'false' )
                    {
                    // InternalCOV.g:545:2: ( 'false' )
                    // InternalCOV.g:546:3: 'false'
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
    // InternalCOV.g:555:1: rule__CoveredContents__Alternatives : ( ( ( 'ALL' ) ) | ( ( 'ONE' ) ) );
    public final void rule__CoveredContents__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:559:1: ( ( ( 'ALL' ) ) | ( ( 'ONE' ) ) )
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
                    // InternalCOV.g:560:2: ( ( 'ALL' ) )
                    {
                    // InternalCOV.g:560:2: ( ( 'ALL' ) )
                    // InternalCOV.g:561:3: ( 'ALL' )
                    {
                     before(grammarAccess.getCoveredContentsAccess().getALLEnumLiteralDeclaration_0()); 
                    // InternalCOV.g:562:3: ( 'ALL' )
                    // InternalCOV.g:562:4: 'ALL'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getCoveredContentsAccess().getALLEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCOV.g:566:2: ( ( 'ONE' ) )
                    {
                    // InternalCOV.g:566:2: ( ( 'ONE' ) )
                    // InternalCOV.g:567:3: ( 'ONE' )
                    {
                     before(grammarAccess.getCoveredContentsAccess().getONEEnumLiteralDeclaration_1()); 
                    // InternalCOV.g:568:3: ( 'ONE' )
                    // InternalCOV.g:568:4: 'ONE'
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
    // InternalCOV.g:576:1: rule__LimitationType__Alternatives : ( ( ( 'containedBy' ) ) | ( ( 'notContainedBy' ) ) );
    public final void rule__LimitationType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:580:1: ( ( ( 'containedBy' ) ) | ( ( 'notContainedBy' ) ) )
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
                    // InternalCOV.g:581:2: ( ( 'containedBy' ) )
                    {
                    // InternalCOV.g:581:2: ( ( 'containedBy' ) )
                    // InternalCOV.g:582:3: ( 'containedBy' )
                    {
                     before(grammarAccess.getLimitationTypeAccess().getContainedByEnumLiteralDeclaration_0()); 
                    // InternalCOV.g:583:3: ( 'containedBy' )
                    // InternalCOV.g:583:4: 'containedBy'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getLimitationTypeAccess().getContainedByEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCOV.g:587:2: ( ( 'notContainedBy' ) )
                    {
                    // InternalCOV.g:587:2: ( ( 'notContainedBy' ) )
                    // InternalCOV.g:588:3: ( 'notContainedBy' )
                    {
                     before(grammarAccess.getLimitationTypeAccess().getNotContainedByEnumLiteralDeclaration_1()); 
                    // InternalCOV.g:589:3: ( 'notContainedBy' )
                    // InternalCOV.g:589:4: 'notContainedBy'
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
    // InternalCOV.g:597:1: rule__DomainSpecificCoverage__Group__0 : rule__DomainSpecificCoverage__Group__0__Impl rule__DomainSpecificCoverage__Group__1 ;
    public final void rule__DomainSpecificCoverage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:601:1: ( rule__DomainSpecificCoverage__Group__0__Impl rule__DomainSpecificCoverage__Group__1 )
            // InternalCOV.g:602:2: rule__DomainSpecificCoverage__Group__0__Impl rule__DomainSpecificCoverage__Group__1
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
    // InternalCOV.g:609:1: rule__DomainSpecificCoverage__Group__0__Impl : ( 'ruleset' ) ;
    public final void rule__DomainSpecificCoverage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:613:1: ( ( 'ruleset' ) )
            // InternalCOV.g:614:1: ( 'ruleset' )
            {
            // InternalCOV.g:614:1: ( 'ruleset' )
            // InternalCOV.g:615:2: 'ruleset'
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
    // InternalCOV.g:624:1: rule__DomainSpecificCoverage__Group__1 : rule__DomainSpecificCoverage__Group__1__Impl rule__DomainSpecificCoverage__Group__2 ;
    public final void rule__DomainSpecificCoverage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:628:1: ( rule__DomainSpecificCoverage__Group__1__Impl rule__DomainSpecificCoverage__Group__2 )
            // InternalCOV.g:629:2: rule__DomainSpecificCoverage__Group__1__Impl rule__DomainSpecificCoverage__Group__2
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
    // InternalCOV.g:636:1: rule__DomainSpecificCoverage__Group__1__Impl : ( ( rule__DomainSpecificCoverage__NameAssignment_1 ) ) ;
    public final void rule__DomainSpecificCoverage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:640:1: ( ( ( rule__DomainSpecificCoverage__NameAssignment_1 ) ) )
            // InternalCOV.g:641:1: ( ( rule__DomainSpecificCoverage__NameAssignment_1 ) )
            {
            // InternalCOV.g:641:1: ( ( rule__DomainSpecificCoverage__NameAssignment_1 ) )
            // InternalCOV.g:642:2: ( rule__DomainSpecificCoverage__NameAssignment_1 )
            {
             before(grammarAccess.getDomainSpecificCoverageAccess().getNameAssignment_1()); 
            // InternalCOV.g:643:2: ( rule__DomainSpecificCoverage__NameAssignment_1 )
            // InternalCOV.g:643:3: rule__DomainSpecificCoverage__NameAssignment_1
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
    // InternalCOV.g:651:1: rule__DomainSpecificCoverage__Group__2 : rule__DomainSpecificCoverage__Group__2__Impl rule__DomainSpecificCoverage__Group__3 ;
    public final void rule__DomainSpecificCoverage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:655:1: ( rule__DomainSpecificCoverage__Group__2__Impl rule__DomainSpecificCoverage__Group__3 )
            // InternalCOV.g:656:2: rule__DomainSpecificCoverage__Group__2__Impl rule__DomainSpecificCoverage__Group__3
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
    // InternalCOV.g:663:1: rule__DomainSpecificCoverage__Group__2__Impl : ( '{' ) ;
    public final void rule__DomainSpecificCoverage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:667:1: ( ( '{' ) )
            // InternalCOV.g:668:1: ( '{' )
            {
            // InternalCOV.g:668:1: ( '{' )
            // InternalCOV.g:669:2: '{'
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
    // InternalCOV.g:678:1: rule__DomainSpecificCoverage__Group__3 : rule__DomainSpecificCoverage__Group__3__Impl rule__DomainSpecificCoverage__Group__4 ;
    public final void rule__DomainSpecificCoverage__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:682:1: ( rule__DomainSpecificCoverage__Group__3__Impl rule__DomainSpecificCoverage__Group__4 )
            // InternalCOV.g:683:2: rule__DomainSpecificCoverage__Group__3__Impl rule__DomainSpecificCoverage__Group__4
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
    // InternalCOV.g:690:1: rule__DomainSpecificCoverage__Group__3__Impl : ( 'import' ) ;
    public final void rule__DomainSpecificCoverage__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:694:1: ( ( 'import' ) )
            // InternalCOV.g:695:1: ( 'import' )
            {
            // InternalCOV.g:695:1: ( 'import' )
            // InternalCOV.g:696:2: 'import'
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
    // InternalCOV.g:705:1: rule__DomainSpecificCoverage__Group__4 : rule__DomainSpecificCoverage__Group__4__Impl rule__DomainSpecificCoverage__Group__5 ;
    public final void rule__DomainSpecificCoverage__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:709:1: ( rule__DomainSpecificCoverage__Group__4__Impl rule__DomainSpecificCoverage__Group__5 )
            // InternalCOV.g:710:2: rule__DomainSpecificCoverage__Group__4__Impl rule__DomainSpecificCoverage__Group__5
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
    // InternalCOV.g:717:1: rule__DomainSpecificCoverage__Group__4__Impl : ( 'metamodel' ) ;
    public final void rule__DomainSpecificCoverage__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:721:1: ( ( 'metamodel' ) )
            // InternalCOV.g:722:1: ( 'metamodel' )
            {
            // InternalCOV.g:722:1: ( 'metamodel' )
            // InternalCOV.g:723:2: 'metamodel'
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
    // InternalCOV.g:732:1: rule__DomainSpecificCoverage__Group__5 : rule__DomainSpecificCoverage__Group__5__Impl rule__DomainSpecificCoverage__Group__6 ;
    public final void rule__DomainSpecificCoverage__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:736:1: ( rule__DomainSpecificCoverage__Group__5__Impl rule__DomainSpecificCoverage__Group__6 )
            // InternalCOV.g:737:2: rule__DomainSpecificCoverage__Group__5__Impl rule__DomainSpecificCoverage__Group__6
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
    // InternalCOV.g:744:1: rule__DomainSpecificCoverage__Group__5__Impl : ( ( rule__DomainSpecificCoverage__MetamodelAssignment_5 ) ) ;
    public final void rule__DomainSpecificCoverage__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:748:1: ( ( ( rule__DomainSpecificCoverage__MetamodelAssignment_5 ) ) )
            // InternalCOV.g:749:1: ( ( rule__DomainSpecificCoverage__MetamodelAssignment_5 ) )
            {
            // InternalCOV.g:749:1: ( ( rule__DomainSpecificCoverage__MetamodelAssignment_5 ) )
            // InternalCOV.g:750:2: ( rule__DomainSpecificCoverage__MetamodelAssignment_5 )
            {
             before(grammarAccess.getDomainSpecificCoverageAccess().getMetamodelAssignment_5()); 
            // InternalCOV.g:751:2: ( rule__DomainSpecificCoverage__MetamodelAssignment_5 )
            // InternalCOV.g:751:3: rule__DomainSpecificCoverage__MetamodelAssignment_5
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
    // InternalCOV.g:759:1: rule__DomainSpecificCoverage__Group__6 : rule__DomainSpecificCoverage__Group__6__Impl rule__DomainSpecificCoverage__Group__7 ;
    public final void rule__DomainSpecificCoverage__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:763:1: ( rule__DomainSpecificCoverage__Group__6__Impl rule__DomainSpecificCoverage__Group__7 )
            // InternalCOV.g:764:2: rule__DomainSpecificCoverage__Group__6__Impl rule__DomainSpecificCoverage__Group__7
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
    // InternalCOV.g:771:1: rule__DomainSpecificCoverage__Group__6__Impl : ( ( rule__DomainSpecificCoverage__CoverageMetricsAssignment_6 ) ) ;
    public final void rule__DomainSpecificCoverage__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:775:1: ( ( ( rule__DomainSpecificCoverage__CoverageMetricsAssignment_6 ) ) )
            // InternalCOV.g:776:1: ( ( rule__DomainSpecificCoverage__CoverageMetricsAssignment_6 ) )
            {
            // InternalCOV.g:776:1: ( ( rule__DomainSpecificCoverage__CoverageMetricsAssignment_6 ) )
            // InternalCOV.g:777:2: ( rule__DomainSpecificCoverage__CoverageMetricsAssignment_6 )
            {
             before(grammarAccess.getDomainSpecificCoverageAccess().getCoverageMetricsAssignment_6()); 
            // InternalCOV.g:778:2: ( rule__DomainSpecificCoverage__CoverageMetricsAssignment_6 )
            // InternalCOV.g:778:3: rule__DomainSpecificCoverage__CoverageMetricsAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__DomainSpecificCoverage__CoverageMetricsAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getDomainSpecificCoverageAccess().getCoverageMetricsAssignment_6()); 

            }


            }

        }
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
    // InternalCOV.g:786:1: rule__DomainSpecificCoverage__Group__7 : rule__DomainSpecificCoverage__Group__7__Impl rule__DomainSpecificCoverage__Group__8 ;
    public final void rule__DomainSpecificCoverage__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:790:1: ( rule__DomainSpecificCoverage__Group__7__Impl rule__DomainSpecificCoverage__Group__8 )
            // InternalCOV.g:791:2: rule__DomainSpecificCoverage__Group__7__Impl rule__DomainSpecificCoverage__Group__8
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
    // InternalCOV.g:798:1: rule__DomainSpecificCoverage__Group__7__Impl : ( ( rule__DomainSpecificCoverage__Group_7__0 )* ) ;
    public final void rule__DomainSpecificCoverage__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:802:1: ( ( ( rule__DomainSpecificCoverage__Group_7__0 )* ) )
            // InternalCOV.g:803:1: ( ( rule__DomainSpecificCoverage__Group_7__0 )* )
            {
            // InternalCOV.g:803:1: ( ( rule__DomainSpecificCoverage__Group_7__0 )* )
            // InternalCOV.g:804:2: ( rule__DomainSpecificCoverage__Group_7__0 )*
            {
             before(grammarAccess.getDomainSpecificCoverageAccess().getGroup_7()); 
            // InternalCOV.g:805:2: ( rule__DomainSpecificCoverage__Group_7__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==22) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalCOV.g:805:3: rule__DomainSpecificCoverage__Group_7__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__DomainSpecificCoverage__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // InternalCOV.g:813:1: rule__DomainSpecificCoverage__Group__8 : rule__DomainSpecificCoverage__Group__8__Impl ;
    public final void rule__DomainSpecificCoverage__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:817:1: ( rule__DomainSpecificCoverage__Group__8__Impl )
            // InternalCOV.g:818:2: rule__DomainSpecificCoverage__Group__8__Impl
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
    // InternalCOV.g:824:1: rule__DomainSpecificCoverage__Group__8__Impl : ( '}' ) ;
    public final void rule__DomainSpecificCoverage__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:828:1: ( ( '}' ) )
            // InternalCOV.g:829:1: ( '}' )
            {
            // InternalCOV.g:829:1: ( '}' )
            // InternalCOV.g:830:2: '}'
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
    // InternalCOV.g:840:1: rule__DomainSpecificCoverage__Group_7__0 : rule__DomainSpecificCoverage__Group_7__0__Impl rule__DomainSpecificCoverage__Group_7__1 ;
    public final void rule__DomainSpecificCoverage__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:844:1: ( rule__DomainSpecificCoverage__Group_7__0__Impl rule__DomainSpecificCoverage__Group_7__1 )
            // InternalCOV.g:845:2: rule__DomainSpecificCoverage__Group_7__0__Impl rule__DomainSpecificCoverage__Group_7__1
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
    // InternalCOV.g:852:1: rule__DomainSpecificCoverage__Group_7__0__Impl : ( ',' ) ;
    public final void rule__DomainSpecificCoverage__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:856:1: ( ( ',' ) )
            // InternalCOV.g:857:1: ( ',' )
            {
            // InternalCOV.g:857:1: ( ',' )
            // InternalCOV.g:858:2: ','
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
    // InternalCOV.g:867:1: rule__DomainSpecificCoverage__Group_7__1 : rule__DomainSpecificCoverage__Group_7__1__Impl ;
    public final void rule__DomainSpecificCoverage__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:871:1: ( rule__DomainSpecificCoverage__Group_7__1__Impl )
            // InternalCOV.g:872:2: rule__DomainSpecificCoverage__Group_7__1__Impl
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
    // InternalCOV.g:878:1: rule__DomainSpecificCoverage__Group_7__1__Impl : ( ( rule__DomainSpecificCoverage__CoverageMetricsAssignment_7_1 ) ) ;
    public final void rule__DomainSpecificCoverage__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:882:1: ( ( ( rule__DomainSpecificCoverage__CoverageMetricsAssignment_7_1 ) ) )
            // InternalCOV.g:883:1: ( ( rule__DomainSpecificCoverage__CoverageMetricsAssignment_7_1 ) )
            {
            // InternalCOV.g:883:1: ( ( rule__DomainSpecificCoverage__CoverageMetricsAssignment_7_1 ) )
            // InternalCOV.g:884:2: ( rule__DomainSpecificCoverage__CoverageMetricsAssignment_7_1 )
            {
             before(grammarAccess.getDomainSpecificCoverageAccess().getCoverageMetricsAssignment_7_1()); 
            // InternalCOV.g:885:2: ( rule__DomainSpecificCoverage__CoverageMetricsAssignment_7_1 )
            // InternalCOV.g:885:3: rule__DomainSpecificCoverage__CoverageMetricsAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__DomainSpecificCoverage__CoverageMetricsAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getDomainSpecificCoverageAccess().getCoverageMetricsAssignment_7_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__ModelElementCoverage__Group__0"
    // InternalCOV.g:894:1: rule__ModelElementCoverage__Group__0 : rule__ModelElementCoverage__Group__0__Impl rule__ModelElementCoverage__Group__1 ;
    public final void rule__ModelElementCoverage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:898:1: ( rule__ModelElementCoverage__Group__0__Impl rule__ModelElementCoverage__Group__1 )
            // InternalCOV.g:899:2: rule__ModelElementCoverage__Group__0__Impl rule__ModelElementCoverage__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__ModelElementCoverage__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModelElementCoverage__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelElementCoverage__Group__0"


    // $ANTLR start "rule__ModelElementCoverage__Group__0__Impl"
    // InternalCOV.g:906:1: rule__ModelElementCoverage__Group__0__Impl : ( 'ModelElementCoverageRuleset' ) ;
    public final void rule__ModelElementCoverage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:910:1: ( ( 'ModelElementCoverageRuleset' ) )
            // InternalCOV.g:911:1: ( 'ModelElementCoverageRuleset' )
            {
            // InternalCOV.g:911:1: ( 'ModelElementCoverageRuleset' )
            // InternalCOV.g:912:2: 'ModelElementCoverageRuleset'
            {
             before(grammarAccess.getModelElementCoverageAccess().getModelElementCoverageRulesetKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getModelElementCoverageAccess().getModelElementCoverageRulesetKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelElementCoverage__Group__0__Impl"


    // $ANTLR start "rule__ModelElementCoverage__Group__1"
    // InternalCOV.g:921:1: rule__ModelElementCoverage__Group__1 : rule__ModelElementCoverage__Group__1__Impl rule__ModelElementCoverage__Group__2 ;
    public final void rule__ModelElementCoverage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:925:1: ( rule__ModelElementCoverage__Group__1__Impl rule__ModelElementCoverage__Group__2 )
            // InternalCOV.g:926:2: rule__ModelElementCoverage__Group__1__Impl rule__ModelElementCoverage__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__ModelElementCoverage__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModelElementCoverage__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelElementCoverage__Group__1"


    // $ANTLR start "rule__ModelElementCoverage__Group__1__Impl"
    // InternalCOV.g:933:1: rule__ModelElementCoverage__Group__1__Impl : ( '{' ) ;
    public final void rule__ModelElementCoverage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:937:1: ( ( '{' ) )
            // InternalCOV.g:938:1: ( '{' )
            {
            // InternalCOV.g:938:1: ( '{' )
            // InternalCOV.g:939:2: '{'
            {
             before(grammarAccess.getModelElementCoverageAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getModelElementCoverageAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelElementCoverage__Group__1__Impl"


    // $ANTLR start "rule__ModelElementCoverage__Group__2"
    // InternalCOV.g:948:1: rule__ModelElementCoverage__Group__2 : rule__ModelElementCoverage__Group__2__Impl rule__ModelElementCoverage__Group__3 ;
    public final void rule__ModelElementCoverage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:952:1: ( rule__ModelElementCoverage__Group__2__Impl rule__ModelElementCoverage__Group__3 )
            // InternalCOV.g:953:2: rule__ModelElementCoverage__Group__2__Impl rule__ModelElementCoverage__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__ModelElementCoverage__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModelElementCoverage__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelElementCoverage__Group__2"


    // $ANTLR start "rule__ModelElementCoverage__Group__2__Impl"
    // InternalCOV.g:960:1: rule__ModelElementCoverage__Group__2__Impl : ( ( rule__ModelElementCoverage__ContextsAssignment_2 ) ) ;
    public final void rule__ModelElementCoverage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:964:1: ( ( ( rule__ModelElementCoverage__ContextsAssignment_2 ) ) )
            // InternalCOV.g:965:1: ( ( rule__ModelElementCoverage__ContextsAssignment_2 ) )
            {
            // InternalCOV.g:965:1: ( ( rule__ModelElementCoverage__ContextsAssignment_2 ) )
            // InternalCOV.g:966:2: ( rule__ModelElementCoverage__ContextsAssignment_2 )
            {
             before(grammarAccess.getModelElementCoverageAccess().getContextsAssignment_2()); 
            // InternalCOV.g:967:2: ( rule__ModelElementCoverage__ContextsAssignment_2 )
            // InternalCOV.g:967:3: rule__ModelElementCoverage__ContextsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ModelElementCoverage__ContextsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getModelElementCoverageAccess().getContextsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelElementCoverage__Group__2__Impl"


    // $ANTLR start "rule__ModelElementCoverage__Group__3"
    // InternalCOV.g:975:1: rule__ModelElementCoverage__Group__3 : rule__ModelElementCoverage__Group__3__Impl rule__ModelElementCoverage__Group__4 ;
    public final void rule__ModelElementCoverage__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:979:1: ( rule__ModelElementCoverage__Group__3__Impl rule__ModelElementCoverage__Group__4 )
            // InternalCOV.g:980:2: rule__ModelElementCoverage__Group__3__Impl rule__ModelElementCoverage__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__ModelElementCoverage__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModelElementCoverage__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelElementCoverage__Group__3"


    // $ANTLR start "rule__ModelElementCoverage__Group__3__Impl"
    // InternalCOV.g:987:1: rule__ModelElementCoverage__Group__3__Impl : ( ( rule__ModelElementCoverage__Group_3__0 )* ) ;
    public final void rule__ModelElementCoverage__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:991:1: ( ( ( rule__ModelElementCoverage__Group_3__0 )* ) )
            // InternalCOV.g:992:1: ( ( rule__ModelElementCoverage__Group_3__0 )* )
            {
            // InternalCOV.g:992:1: ( ( rule__ModelElementCoverage__Group_3__0 )* )
            // InternalCOV.g:993:2: ( rule__ModelElementCoverage__Group_3__0 )*
            {
             before(grammarAccess.getModelElementCoverageAccess().getGroup_3()); 
            // InternalCOV.g:994:2: ( rule__ModelElementCoverage__Group_3__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==22) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalCOV.g:994:3: rule__ModelElementCoverage__Group_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__ModelElementCoverage__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getModelElementCoverageAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelElementCoverage__Group__3__Impl"


    // $ANTLR start "rule__ModelElementCoverage__Group__4"
    // InternalCOV.g:1002:1: rule__ModelElementCoverage__Group__4 : rule__ModelElementCoverage__Group__4__Impl ;
    public final void rule__ModelElementCoverage__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1006:1: ( rule__ModelElementCoverage__Group__4__Impl )
            // InternalCOV.g:1007:2: rule__ModelElementCoverage__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ModelElementCoverage__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelElementCoverage__Group__4"


    // $ANTLR start "rule__ModelElementCoverage__Group__4__Impl"
    // InternalCOV.g:1013:1: rule__ModelElementCoverage__Group__4__Impl : ( '}' ) ;
    public final void rule__ModelElementCoverage__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1017:1: ( ( '}' ) )
            // InternalCOV.g:1018:1: ( '}' )
            {
            // InternalCOV.g:1018:1: ( '}' )
            // InternalCOV.g:1019:2: '}'
            {
             before(grammarAccess.getModelElementCoverageAccess().getRightCurlyBracketKeyword_4()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getModelElementCoverageAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelElementCoverage__Group__4__Impl"


    // $ANTLR start "rule__ModelElementCoverage__Group_3__0"
    // InternalCOV.g:1029:1: rule__ModelElementCoverage__Group_3__0 : rule__ModelElementCoverage__Group_3__0__Impl rule__ModelElementCoverage__Group_3__1 ;
    public final void rule__ModelElementCoverage__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1033:1: ( rule__ModelElementCoverage__Group_3__0__Impl rule__ModelElementCoverage__Group_3__1 )
            // InternalCOV.g:1034:2: rule__ModelElementCoverage__Group_3__0__Impl rule__ModelElementCoverage__Group_3__1
            {
            pushFollow(FOLLOW_10);
            rule__ModelElementCoverage__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModelElementCoverage__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelElementCoverage__Group_3__0"


    // $ANTLR start "rule__ModelElementCoverage__Group_3__0__Impl"
    // InternalCOV.g:1041:1: rule__ModelElementCoverage__Group_3__0__Impl : ( ',' ) ;
    public final void rule__ModelElementCoverage__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1045:1: ( ( ',' ) )
            // InternalCOV.g:1046:1: ( ',' )
            {
            // InternalCOV.g:1046:1: ( ',' )
            // InternalCOV.g:1047:2: ','
            {
             before(grammarAccess.getModelElementCoverageAccess().getCommaKeyword_3_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getModelElementCoverageAccess().getCommaKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelElementCoverage__Group_3__0__Impl"


    // $ANTLR start "rule__ModelElementCoverage__Group_3__1"
    // InternalCOV.g:1056:1: rule__ModelElementCoverage__Group_3__1 : rule__ModelElementCoverage__Group_3__1__Impl ;
    public final void rule__ModelElementCoverage__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1060:1: ( rule__ModelElementCoverage__Group_3__1__Impl )
            // InternalCOV.g:1061:2: rule__ModelElementCoverage__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ModelElementCoverage__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelElementCoverage__Group_3__1"


    // $ANTLR start "rule__ModelElementCoverage__Group_3__1__Impl"
    // InternalCOV.g:1067:1: rule__ModelElementCoverage__Group_3__1__Impl : ( ( rule__ModelElementCoverage__ContextsAssignment_3_1 ) ) ;
    public final void rule__ModelElementCoverage__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1071:1: ( ( ( rule__ModelElementCoverage__ContextsAssignment_3_1 ) ) )
            // InternalCOV.g:1072:1: ( ( rule__ModelElementCoverage__ContextsAssignment_3_1 ) )
            {
            // InternalCOV.g:1072:1: ( ( rule__ModelElementCoverage__ContextsAssignment_3_1 ) )
            // InternalCOV.g:1073:2: ( rule__ModelElementCoverage__ContextsAssignment_3_1 )
            {
             before(grammarAccess.getModelElementCoverageAccess().getContextsAssignment_3_1()); 
            // InternalCOV.g:1074:2: ( rule__ModelElementCoverage__ContextsAssignment_3_1 )
            // InternalCOV.g:1074:3: rule__ModelElementCoverage__ContextsAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ModelElementCoverage__ContextsAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getModelElementCoverageAccess().getContextsAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelElementCoverage__Group_3__1__Impl"


    // $ANTLR start "rule__BranchCoverage__Group__0"
    // InternalCOV.g:1083:1: rule__BranchCoverage__Group__0 : rule__BranchCoverage__Group__0__Impl rule__BranchCoverage__Group__1 ;
    public final void rule__BranchCoverage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1087:1: ( rule__BranchCoverage__Group__0__Impl rule__BranchCoverage__Group__1 )
            // InternalCOV.g:1088:2: rule__BranchCoverage__Group__0__Impl rule__BranchCoverage__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__BranchCoverage__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BranchCoverage__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BranchCoverage__Group__0"


    // $ANTLR start "rule__BranchCoverage__Group__0__Impl"
    // InternalCOV.g:1095:1: rule__BranchCoverage__Group__0__Impl : ( 'BranchCoverageRuleset' ) ;
    public final void rule__BranchCoverage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1099:1: ( ( 'BranchCoverageRuleset' ) )
            // InternalCOV.g:1100:1: ( 'BranchCoverageRuleset' )
            {
            // InternalCOV.g:1100:1: ( 'BranchCoverageRuleset' )
            // InternalCOV.g:1101:2: 'BranchCoverageRuleset'
            {
             before(grammarAccess.getBranchCoverageAccess().getBranchCoverageRulesetKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getBranchCoverageAccess().getBranchCoverageRulesetKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BranchCoverage__Group__0__Impl"


    // $ANTLR start "rule__BranchCoverage__Group__1"
    // InternalCOV.g:1110:1: rule__BranchCoverage__Group__1 : rule__BranchCoverage__Group__1__Impl rule__BranchCoverage__Group__2 ;
    public final void rule__BranchCoverage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1114:1: ( rule__BranchCoverage__Group__1__Impl rule__BranchCoverage__Group__2 )
            // InternalCOV.g:1115:2: rule__BranchCoverage__Group__1__Impl rule__BranchCoverage__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__BranchCoverage__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BranchCoverage__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BranchCoverage__Group__1"


    // $ANTLR start "rule__BranchCoverage__Group__1__Impl"
    // InternalCOV.g:1122:1: rule__BranchCoverage__Group__1__Impl : ( '{' ) ;
    public final void rule__BranchCoverage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1126:1: ( ( '{' ) )
            // InternalCOV.g:1127:1: ( '{' )
            {
            // InternalCOV.g:1127:1: ( '{' )
            // InternalCOV.g:1128:2: '{'
            {
             before(grammarAccess.getBranchCoverageAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getBranchCoverageAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BranchCoverage__Group__1__Impl"


    // $ANTLR start "rule__BranchCoverage__Group__2"
    // InternalCOV.g:1137:1: rule__BranchCoverage__Group__2 : rule__BranchCoverage__Group__2__Impl rule__BranchCoverage__Group__3 ;
    public final void rule__BranchCoverage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1141:1: ( rule__BranchCoverage__Group__2__Impl rule__BranchCoverage__Group__3 )
            // InternalCOV.g:1142:2: rule__BranchCoverage__Group__2__Impl rule__BranchCoverage__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__BranchCoverage__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BranchCoverage__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BranchCoverage__Group__2"


    // $ANTLR start "rule__BranchCoverage__Group__2__Impl"
    // InternalCOV.g:1149:1: rule__BranchCoverage__Group__2__Impl : ( ( rule__BranchCoverage__Group_2__0 )? ) ;
    public final void rule__BranchCoverage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1153:1: ( ( ( rule__BranchCoverage__Group_2__0 )? ) )
            // InternalCOV.g:1154:1: ( ( rule__BranchCoverage__Group_2__0 )? )
            {
            // InternalCOV.g:1154:1: ( ( rule__BranchCoverage__Group_2__0 )? )
            // InternalCOV.g:1155:2: ( rule__BranchCoverage__Group_2__0 )?
            {
             before(grammarAccess.getBranchCoverageAccess().getGroup_2()); 
            // InternalCOV.g:1156:2: ( rule__BranchCoverage__Group_2__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==25) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalCOV.g:1156:3: rule__BranchCoverage__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BranchCoverage__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBranchCoverageAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BranchCoverage__Group__2__Impl"


    // $ANTLR start "rule__BranchCoverage__Group__3"
    // InternalCOV.g:1164:1: rule__BranchCoverage__Group__3 : rule__BranchCoverage__Group__3__Impl rule__BranchCoverage__Group__4 ;
    public final void rule__BranchCoverage__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1168:1: ( rule__BranchCoverage__Group__3__Impl rule__BranchCoverage__Group__4 )
            // InternalCOV.g:1169:2: rule__BranchCoverage__Group__3__Impl rule__BranchCoverage__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__BranchCoverage__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BranchCoverage__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BranchCoverage__Group__3"


    // $ANTLR start "rule__BranchCoverage__Group__3__Impl"
    // InternalCOV.g:1176:1: rule__BranchCoverage__Group__3__Impl : ( ( rule__BranchCoverage__BranchSpecificationsAssignment_3 ) ) ;
    public final void rule__BranchCoverage__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1180:1: ( ( ( rule__BranchCoverage__BranchSpecificationsAssignment_3 ) ) )
            // InternalCOV.g:1181:1: ( ( rule__BranchCoverage__BranchSpecificationsAssignment_3 ) )
            {
            // InternalCOV.g:1181:1: ( ( rule__BranchCoverage__BranchSpecificationsAssignment_3 ) )
            // InternalCOV.g:1182:2: ( rule__BranchCoverage__BranchSpecificationsAssignment_3 )
            {
             before(grammarAccess.getBranchCoverageAccess().getBranchSpecificationsAssignment_3()); 
            // InternalCOV.g:1183:2: ( rule__BranchCoverage__BranchSpecificationsAssignment_3 )
            // InternalCOV.g:1183:3: rule__BranchCoverage__BranchSpecificationsAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__BranchCoverage__BranchSpecificationsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getBranchCoverageAccess().getBranchSpecificationsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BranchCoverage__Group__3__Impl"


    // $ANTLR start "rule__BranchCoverage__Group__4"
    // InternalCOV.g:1191:1: rule__BranchCoverage__Group__4 : rule__BranchCoverage__Group__4__Impl rule__BranchCoverage__Group__5 ;
    public final void rule__BranchCoverage__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1195:1: ( rule__BranchCoverage__Group__4__Impl rule__BranchCoverage__Group__5 )
            // InternalCOV.g:1196:2: rule__BranchCoverage__Group__4__Impl rule__BranchCoverage__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__BranchCoverage__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BranchCoverage__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BranchCoverage__Group__4"


    // $ANTLR start "rule__BranchCoverage__Group__4__Impl"
    // InternalCOV.g:1203:1: rule__BranchCoverage__Group__4__Impl : ( ( rule__BranchCoverage__Group_4__0 )* ) ;
    public final void rule__BranchCoverage__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1207:1: ( ( ( rule__BranchCoverage__Group_4__0 )* ) )
            // InternalCOV.g:1208:1: ( ( rule__BranchCoverage__Group_4__0 )* )
            {
            // InternalCOV.g:1208:1: ( ( rule__BranchCoverage__Group_4__0 )* )
            // InternalCOV.g:1209:2: ( rule__BranchCoverage__Group_4__0 )*
            {
             before(grammarAccess.getBranchCoverageAccess().getGroup_4()); 
            // InternalCOV.g:1210:2: ( rule__BranchCoverage__Group_4__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==22) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalCOV.g:1210:3: rule__BranchCoverage__Group_4__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__BranchCoverage__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getBranchCoverageAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BranchCoverage__Group__4__Impl"


    // $ANTLR start "rule__BranchCoverage__Group__5"
    // InternalCOV.g:1218:1: rule__BranchCoverage__Group__5 : rule__BranchCoverage__Group__5__Impl ;
    public final void rule__BranchCoverage__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1222:1: ( rule__BranchCoverage__Group__5__Impl )
            // InternalCOV.g:1223:2: rule__BranchCoverage__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BranchCoverage__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BranchCoverage__Group__5"


    // $ANTLR start "rule__BranchCoverage__Group__5__Impl"
    // InternalCOV.g:1229:1: rule__BranchCoverage__Group__5__Impl : ( '}' ) ;
    public final void rule__BranchCoverage__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1233:1: ( ( '}' ) )
            // InternalCOV.g:1234:1: ( '}' )
            {
            // InternalCOV.g:1234:1: ( '}' )
            // InternalCOV.g:1235:2: '}'
            {
             before(grammarAccess.getBranchCoverageAccess().getRightCurlyBracketKeyword_5()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getBranchCoverageAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BranchCoverage__Group__5__Impl"


    // $ANTLR start "rule__BranchCoverage__Group_2__0"
    // InternalCOV.g:1245:1: rule__BranchCoverage__Group_2__0 : rule__BranchCoverage__Group_2__0__Impl rule__BranchCoverage__Group_2__1 ;
    public final void rule__BranchCoverage__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1249:1: ( rule__BranchCoverage__Group_2__0__Impl rule__BranchCoverage__Group_2__1 )
            // InternalCOV.g:1250:2: rule__BranchCoverage__Group_2__0__Impl rule__BranchCoverage__Group_2__1
            {
            pushFollow(FOLLOW_12);
            rule__BranchCoverage__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BranchCoverage__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BranchCoverage__Group_2__0"


    // $ANTLR start "rule__BranchCoverage__Group_2__0__Impl"
    // InternalCOV.g:1257:1: rule__BranchCoverage__Group_2__0__Impl : ( ( rule__BranchCoverage__ContextsAssignment_2_0 ) ) ;
    public final void rule__BranchCoverage__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1261:1: ( ( ( rule__BranchCoverage__ContextsAssignment_2_0 ) ) )
            // InternalCOV.g:1262:1: ( ( rule__BranchCoverage__ContextsAssignment_2_0 ) )
            {
            // InternalCOV.g:1262:1: ( ( rule__BranchCoverage__ContextsAssignment_2_0 ) )
            // InternalCOV.g:1263:2: ( rule__BranchCoverage__ContextsAssignment_2_0 )
            {
             before(grammarAccess.getBranchCoverageAccess().getContextsAssignment_2_0()); 
            // InternalCOV.g:1264:2: ( rule__BranchCoverage__ContextsAssignment_2_0 )
            // InternalCOV.g:1264:3: rule__BranchCoverage__ContextsAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__BranchCoverage__ContextsAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getBranchCoverageAccess().getContextsAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BranchCoverage__Group_2__0__Impl"


    // $ANTLR start "rule__BranchCoverage__Group_2__1"
    // InternalCOV.g:1272:1: rule__BranchCoverage__Group_2__1 : rule__BranchCoverage__Group_2__1__Impl ;
    public final void rule__BranchCoverage__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1276:1: ( rule__BranchCoverage__Group_2__1__Impl )
            // InternalCOV.g:1277:2: rule__BranchCoverage__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BranchCoverage__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BranchCoverage__Group_2__1"


    // $ANTLR start "rule__BranchCoverage__Group_2__1__Impl"
    // InternalCOV.g:1283:1: rule__BranchCoverage__Group_2__1__Impl : ( ( rule__BranchCoverage__Group_2_1__0 )* ) ;
    public final void rule__BranchCoverage__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1287:1: ( ( ( rule__BranchCoverage__Group_2_1__0 )* ) )
            // InternalCOV.g:1288:1: ( ( rule__BranchCoverage__Group_2_1__0 )* )
            {
            // InternalCOV.g:1288:1: ( ( rule__BranchCoverage__Group_2_1__0 )* )
            // InternalCOV.g:1289:2: ( rule__BranchCoverage__Group_2_1__0 )*
            {
             before(grammarAccess.getBranchCoverageAccess().getGroup_2_1()); 
            // InternalCOV.g:1290:2: ( rule__BranchCoverage__Group_2_1__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==22) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalCOV.g:1290:3: rule__BranchCoverage__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__BranchCoverage__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getBranchCoverageAccess().getGroup_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BranchCoverage__Group_2__1__Impl"


    // $ANTLR start "rule__BranchCoverage__Group_2_1__0"
    // InternalCOV.g:1299:1: rule__BranchCoverage__Group_2_1__0 : rule__BranchCoverage__Group_2_1__0__Impl rule__BranchCoverage__Group_2_1__1 ;
    public final void rule__BranchCoverage__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1303:1: ( rule__BranchCoverage__Group_2_1__0__Impl rule__BranchCoverage__Group_2_1__1 )
            // InternalCOV.g:1304:2: rule__BranchCoverage__Group_2_1__0__Impl rule__BranchCoverage__Group_2_1__1
            {
            pushFollow(FOLLOW_10);
            rule__BranchCoverage__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BranchCoverage__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BranchCoverage__Group_2_1__0"


    // $ANTLR start "rule__BranchCoverage__Group_2_1__0__Impl"
    // InternalCOV.g:1311:1: rule__BranchCoverage__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__BranchCoverage__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1315:1: ( ( ',' ) )
            // InternalCOV.g:1316:1: ( ',' )
            {
            // InternalCOV.g:1316:1: ( ',' )
            // InternalCOV.g:1317:2: ','
            {
             before(grammarAccess.getBranchCoverageAccess().getCommaKeyword_2_1_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getBranchCoverageAccess().getCommaKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BranchCoverage__Group_2_1__0__Impl"


    // $ANTLR start "rule__BranchCoverage__Group_2_1__1"
    // InternalCOV.g:1326:1: rule__BranchCoverage__Group_2_1__1 : rule__BranchCoverage__Group_2_1__1__Impl ;
    public final void rule__BranchCoverage__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1330:1: ( rule__BranchCoverage__Group_2_1__1__Impl )
            // InternalCOV.g:1331:2: rule__BranchCoverage__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BranchCoverage__Group_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BranchCoverage__Group_2_1__1"


    // $ANTLR start "rule__BranchCoverage__Group_2_1__1__Impl"
    // InternalCOV.g:1337:1: rule__BranchCoverage__Group_2_1__1__Impl : ( ( rule__BranchCoverage__ContextsAssignment_2_1_1 ) ) ;
    public final void rule__BranchCoverage__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1341:1: ( ( ( rule__BranchCoverage__ContextsAssignment_2_1_1 ) ) )
            // InternalCOV.g:1342:1: ( ( rule__BranchCoverage__ContextsAssignment_2_1_1 ) )
            {
            // InternalCOV.g:1342:1: ( ( rule__BranchCoverage__ContextsAssignment_2_1_1 ) )
            // InternalCOV.g:1343:2: ( rule__BranchCoverage__ContextsAssignment_2_1_1 )
            {
             before(grammarAccess.getBranchCoverageAccess().getContextsAssignment_2_1_1()); 
            // InternalCOV.g:1344:2: ( rule__BranchCoverage__ContextsAssignment_2_1_1 )
            // InternalCOV.g:1344:3: rule__BranchCoverage__ContextsAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__BranchCoverage__ContextsAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getBranchCoverageAccess().getContextsAssignment_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BranchCoverage__Group_2_1__1__Impl"


    // $ANTLR start "rule__BranchCoverage__Group_4__0"
    // InternalCOV.g:1353:1: rule__BranchCoverage__Group_4__0 : rule__BranchCoverage__Group_4__0__Impl rule__BranchCoverage__Group_4__1 ;
    public final void rule__BranchCoverage__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1357:1: ( rule__BranchCoverage__Group_4__0__Impl rule__BranchCoverage__Group_4__1 )
            // InternalCOV.g:1358:2: rule__BranchCoverage__Group_4__0__Impl rule__BranchCoverage__Group_4__1
            {
            pushFollow(FOLLOW_11);
            rule__BranchCoverage__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BranchCoverage__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BranchCoverage__Group_4__0"


    // $ANTLR start "rule__BranchCoverage__Group_4__0__Impl"
    // InternalCOV.g:1365:1: rule__BranchCoverage__Group_4__0__Impl : ( ',' ) ;
    public final void rule__BranchCoverage__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1369:1: ( ( ',' ) )
            // InternalCOV.g:1370:1: ( ',' )
            {
            // InternalCOV.g:1370:1: ( ',' )
            // InternalCOV.g:1371:2: ','
            {
             before(grammarAccess.getBranchCoverageAccess().getCommaKeyword_4_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getBranchCoverageAccess().getCommaKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BranchCoverage__Group_4__0__Impl"


    // $ANTLR start "rule__BranchCoverage__Group_4__1"
    // InternalCOV.g:1380:1: rule__BranchCoverage__Group_4__1 : rule__BranchCoverage__Group_4__1__Impl ;
    public final void rule__BranchCoverage__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1384:1: ( rule__BranchCoverage__Group_4__1__Impl )
            // InternalCOV.g:1385:2: rule__BranchCoverage__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BranchCoverage__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BranchCoverage__Group_4__1"


    // $ANTLR start "rule__BranchCoverage__Group_4__1__Impl"
    // InternalCOV.g:1391:1: rule__BranchCoverage__Group_4__1__Impl : ( ( rule__BranchCoverage__BranchSpecificationsAssignment_4_1 ) ) ;
    public final void rule__BranchCoverage__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1395:1: ( ( ( rule__BranchCoverage__BranchSpecificationsAssignment_4_1 ) ) )
            // InternalCOV.g:1396:1: ( ( rule__BranchCoverage__BranchSpecificationsAssignment_4_1 ) )
            {
            // InternalCOV.g:1396:1: ( ( rule__BranchCoverage__BranchSpecificationsAssignment_4_1 ) )
            // InternalCOV.g:1397:2: ( rule__BranchCoverage__BranchSpecificationsAssignment_4_1 )
            {
             before(grammarAccess.getBranchCoverageAccess().getBranchSpecificationsAssignment_4_1()); 
            // InternalCOV.g:1398:2: ( rule__BranchCoverage__BranchSpecificationsAssignment_4_1 )
            // InternalCOV.g:1398:3: rule__BranchCoverage__BranchSpecificationsAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__BranchCoverage__BranchSpecificationsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getBranchCoverageAccess().getBranchSpecificationsAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BranchCoverage__Group_4__1__Impl"


    // $ANTLR start "rule__Context__Group__0"
    // InternalCOV.g:1407:1: rule__Context__Group__0 : rule__Context__Group__0__Impl rule__Context__Group__1 ;
    public final void rule__Context__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1411:1: ( rule__Context__Group__0__Impl rule__Context__Group__1 )
            // InternalCOV.g:1412:2: rule__Context__Group__0__Impl rule__Context__Group__1
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
    // InternalCOV.g:1419:1: rule__Context__Group__0__Impl : ( 'context' ) ;
    public final void rule__Context__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1423:1: ( ( 'context' ) )
            // InternalCOV.g:1424:1: ( 'context' )
            {
            // InternalCOV.g:1424:1: ( 'context' )
            // InternalCOV.g:1425:2: 'context'
            {
             before(grammarAccess.getContextAccess().getContextKeyword_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalCOV.g:1434:1: rule__Context__Group__1 : rule__Context__Group__1__Impl rule__Context__Group__2 ;
    public final void rule__Context__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1438:1: ( rule__Context__Group__1__Impl rule__Context__Group__2 )
            // InternalCOV.g:1439:2: rule__Context__Group__1__Impl rule__Context__Group__2
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
    // InternalCOV.g:1446:1: rule__Context__Group__1__Impl : ( ( rule__Context__MetaclassAssignment_1 ) ) ;
    public final void rule__Context__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1450:1: ( ( ( rule__Context__MetaclassAssignment_1 ) ) )
            // InternalCOV.g:1451:1: ( ( rule__Context__MetaclassAssignment_1 ) )
            {
            // InternalCOV.g:1451:1: ( ( rule__Context__MetaclassAssignment_1 ) )
            // InternalCOV.g:1452:2: ( rule__Context__MetaclassAssignment_1 )
            {
             before(grammarAccess.getContextAccess().getMetaclassAssignment_1()); 
            // InternalCOV.g:1453:2: ( rule__Context__MetaclassAssignment_1 )
            // InternalCOV.g:1453:3: rule__Context__MetaclassAssignment_1
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
    // InternalCOV.g:1461:1: rule__Context__Group__2 : rule__Context__Group__2__Impl rule__Context__Group__3 ;
    public final void rule__Context__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1465:1: ( rule__Context__Group__2__Impl rule__Context__Group__3 )
            // InternalCOV.g:1466:2: rule__Context__Group__2__Impl rule__Context__Group__3
            {
            pushFollow(FOLLOW_13);
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
    // InternalCOV.g:1473:1: rule__Context__Group__2__Impl : ( '{' ) ;
    public final void rule__Context__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1477:1: ( ( '{' ) )
            // InternalCOV.g:1478:1: ( '{' )
            {
            // InternalCOV.g:1478:1: ( '{' )
            // InternalCOV.g:1479:2: '{'
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
    // InternalCOV.g:1488:1: rule__Context__Group__3 : rule__Context__Group__3__Impl rule__Context__Group__4 ;
    public final void rule__Context__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1492:1: ( rule__Context__Group__3__Impl rule__Context__Group__4 )
            // InternalCOV.g:1493:2: rule__Context__Group__3__Impl rule__Context__Group__4
            {
            pushFollow(FOLLOW_13);
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
    // InternalCOV.g:1500:1: rule__Context__Group__3__Impl : ( ( rule__Context__Group_3__0 )? ) ;
    public final void rule__Context__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1504:1: ( ( ( rule__Context__Group_3__0 )? ) )
            // InternalCOV.g:1505:1: ( ( rule__Context__Group_3__0 )? )
            {
            // InternalCOV.g:1505:1: ( ( rule__Context__Group_3__0 )? )
            // InternalCOV.g:1506:2: ( rule__Context__Group_3__0 )?
            {
             before(grammarAccess.getContextAccess().getGroup_3()); 
            // InternalCOV.g:1507:2: ( rule__Context__Group_3__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==26||(LA12_0>=32 && LA12_0<=34)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalCOV.g:1507:3: rule__Context__Group_3__0
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
    // InternalCOV.g:1515:1: rule__Context__Group__4 : rule__Context__Group__4__Impl ;
    public final void rule__Context__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1519:1: ( rule__Context__Group__4__Impl )
            // InternalCOV.g:1520:2: rule__Context__Group__4__Impl
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
    // InternalCOV.g:1526:1: rule__Context__Group__4__Impl : ( '}' ) ;
    public final void rule__Context__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1530:1: ( ( '}' ) )
            // InternalCOV.g:1531:1: ( '}' )
            {
            // InternalCOV.g:1531:1: ( '}' )
            // InternalCOV.g:1532:2: '}'
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
    // InternalCOV.g:1542:1: rule__Context__Group_3__0 : rule__Context__Group_3__0__Impl rule__Context__Group_3__1 ;
    public final void rule__Context__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1546:1: ( rule__Context__Group_3__0__Impl rule__Context__Group_3__1 )
            // InternalCOV.g:1547:2: rule__Context__Group_3__0__Impl rule__Context__Group_3__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalCOV.g:1554:1: rule__Context__Group_3__0__Impl : ( ( rule__Context__RulesAssignment_3_0 ) ) ;
    public final void rule__Context__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1558:1: ( ( ( rule__Context__RulesAssignment_3_0 ) ) )
            // InternalCOV.g:1559:1: ( ( rule__Context__RulesAssignment_3_0 ) )
            {
            // InternalCOV.g:1559:1: ( ( rule__Context__RulesAssignment_3_0 ) )
            // InternalCOV.g:1560:2: ( rule__Context__RulesAssignment_3_0 )
            {
             before(grammarAccess.getContextAccess().getRulesAssignment_3_0()); 
            // InternalCOV.g:1561:2: ( rule__Context__RulesAssignment_3_0 )
            // InternalCOV.g:1561:3: rule__Context__RulesAssignment_3_0
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
    // InternalCOV.g:1569:1: rule__Context__Group_3__1 : rule__Context__Group_3__1__Impl ;
    public final void rule__Context__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1573:1: ( rule__Context__Group_3__1__Impl )
            // InternalCOV.g:1574:2: rule__Context__Group_3__1__Impl
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
    // InternalCOV.g:1580:1: rule__Context__Group_3__1__Impl : ( ( rule__Context__Group_3_1__0 )* ) ;
    public final void rule__Context__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1584:1: ( ( ( rule__Context__Group_3_1__0 )* ) )
            // InternalCOV.g:1585:1: ( ( rule__Context__Group_3_1__0 )* )
            {
            // InternalCOV.g:1585:1: ( ( rule__Context__Group_3_1__0 )* )
            // InternalCOV.g:1586:2: ( rule__Context__Group_3_1__0 )*
            {
             before(grammarAccess.getContextAccess().getGroup_3_1()); 
            // InternalCOV.g:1587:2: ( rule__Context__Group_3_1__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==22) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalCOV.g:1587:3: rule__Context__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Context__Group_3_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // InternalCOV.g:1596:1: rule__Context__Group_3_1__0 : rule__Context__Group_3_1__0__Impl rule__Context__Group_3_1__1 ;
    public final void rule__Context__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1600:1: ( rule__Context__Group_3_1__0__Impl rule__Context__Group_3_1__1 )
            // InternalCOV.g:1601:2: rule__Context__Group_3_1__0__Impl rule__Context__Group_3_1__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalCOV.g:1608:1: rule__Context__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__Context__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1612:1: ( ( ',' ) )
            // InternalCOV.g:1613:1: ( ',' )
            {
            // InternalCOV.g:1613:1: ( ',' )
            // InternalCOV.g:1614:2: ','
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
    // InternalCOV.g:1623:1: rule__Context__Group_3_1__1 : rule__Context__Group_3_1__1__Impl ;
    public final void rule__Context__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1627:1: ( rule__Context__Group_3_1__1__Impl )
            // InternalCOV.g:1628:2: rule__Context__Group_3_1__1__Impl
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
    // InternalCOV.g:1634:1: rule__Context__Group_3_1__1__Impl : ( ( rule__Context__RulesAssignment_3_1_1 ) ) ;
    public final void rule__Context__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1638:1: ( ( ( rule__Context__RulesAssignment_3_1_1 ) ) )
            // InternalCOV.g:1639:1: ( ( rule__Context__RulesAssignment_3_1_1 ) )
            {
            // InternalCOV.g:1639:1: ( ( rule__Context__RulesAssignment_3_1_1 ) )
            // InternalCOV.g:1640:2: ( rule__Context__RulesAssignment_3_1_1 )
            {
             before(grammarAccess.getContextAccess().getRulesAssignment_3_1_1()); 
            // InternalCOV.g:1641:2: ( rule__Context__RulesAssignment_3_1_1 )
            // InternalCOV.g:1641:3: rule__Context__RulesAssignment_3_1_1
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
    // InternalCOV.g:1650:1: rule__Ignore__Group__0 : rule__Ignore__Group__0__Impl rule__Ignore__Group__1 ;
    public final void rule__Ignore__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1654:1: ( rule__Ignore__Group__0__Impl rule__Ignore__Group__1 )
            // InternalCOV.g:1655:2: rule__Ignore__Group__0__Impl rule__Ignore__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalCOV.g:1662:1: rule__Ignore__Group__0__Impl : ( () ) ;
    public final void rule__Ignore__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1666:1: ( ( () ) )
            // InternalCOV.g:1667:1: ( () )
            {
            // InternalCOV.g:1667:1: ( () )
            // InternalCOV.g:1668:2: ()
            {
             before(grammarAccess.getIgnoreAccess().getIgnoreAction_0()); 
            // InternalCOV.g:1669:2: ()
            // InternalCOV.g:1669:3: 
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
    // InternalCOV.g:1677:1: rule__Ignore__Group__1 : rule__Ignore__Group__1__Impl rule__Ignore__Group__2 ;
    public final void rule__Ignore__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1681:1: ( rule__Ignore__Group__1__Impl rule__Ignore__Group__2 )
            // InternalCOV.g:1682:2: rule__Ignore__Group__1__Impl rule__Ignore__Group__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalCOV.g:1689:1: rule__Ignore__Group__1__Impl : ( 'ignore' ) ;
    public final void rule__Ignore__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1693:1: ( ( 'ignore' ) )
            // InternalCOV.g:1694:1: ( 'ignore' )
            {
            // InternalCOV.g:1694:1: ( 'ignore' )
            // InternalCOV.g:1695:2: 'ignore'
            {
             before(grammarAccess.getIgnoreAccess().getIgnoreKeyword_1()); 
            match(input,26,FOLLOW_2); 
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
    // InternalCOV.g:1704:1: rule__Ignore__Group__2 : rule__Ignore__Group__2__Impl rule__Ignore__Group__3 ;
    public final void rule__Ignore__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1708:1: ( rule__Ignore__Group__2__Impl rule__Ignore__Group__3 )
            // InternalCOV.g:1709:2: rule__Ignore__Group__2__Impl rule__Ignore__Group__3
            {
            pushFollow(FOLLOW_17);
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
    // InternalCOV.g:1716:1: rule__Ignore__Group__2__Impl : ( '(' ) ;
    public final void rule__Ignore__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1720:1: ( ( '(' ) )
            // InternalCOV.g:1721:1: ( '(' )
            {
            // InternalCOV.g:1721:1: ( '(' )
            // InternalCOV.g:1722:2: '('
            {
             before(grammarAccess.getIgnoreAccess().getLeftParenthesisKeyword_2()); 
            match(input,27,FOLLOW_2); 
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
    // InternalCOV.g:1731:1: rule__Ignore__Group__3 : rule__Ignore__Group__3__Impl rule__Ignore__Group__4 ;
    public final void rule__Ignore__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1735:1: ( rule__Ignore__Group__3__Impl rule__Ignore__Group__4 )
            // InternalCOV.g:1736:2: rule__Ignore__Group__3__Impl rule__Ignore__Group__4
            {
            pushFollow(FOLLOW_17);
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
    // InternalCOV.g:1743:1: rule__Ignore__Group__3__Impl : ( ( rule__Ignore__Group_3__0 )? ) ;
    public final void rule__Ignore__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1747:1: ( ( ( rule__Ignore__Group_3__0 )? ) )
            // InternalCOV.g:1748:1: ( ( rule__Ignore__Group_3__0 )? )
            {
            // InternalCOV.g:1748:1: ( ( rule__Ignore__Group_3__0 )? )
            // InternalCOV.g:1749:2: ( rule__Ignore__Group_3__0 )?
            {
             before(grammarAccess.getIgnoreAccess().getGroup_3()); 
            // InternalCOV.g:1750:2: ( rule__Ignore__Group_3__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==29) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalCOV.g:1750:3: rule__Ignore__Group_3__0
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
    // InternalCOV.g:1758:1: rule__Ignore__Group__4 : rule__Ignore__Group__4__Impl rule__Ignore__Group__5 ;
    public final void rule__Ignore__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1762:1: ( rule__Ignore__Group__4__Impl rule__Ignore__Group__5 )
            // InternalCOV.g:1763:2: rule__Ignore__Group__4__Impl rule__Ignore__Group__5
            {
            pushFollow(FOLLOW_18);
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
    // InternalCOV.g:1770:1: rule__Ignore__Group__4__Impl : ( ')' ) ;
    public final void rule__Ignore__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1774:1: ( ( ')' ) )
            // InternalCOV.g:1775:1: ( ')' )
            {
            // InternalCOV.g:1775:1: ( ')' )
            // InternalCOV.g:1776:2: ')'
            {
             before(grammarAccess.getIgnoreAccess().getRightParenthesisKeyword_4()); 
            match(input,28,FOLLOW_2); 
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
    // InternalCOV.g:1785:1: rule__Ignore__Group__5 : rule__Ignore__Group__5__Impl rule__Ignore__Group__6 ;
    public final void rule__Ignore__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1789:1: ( rule__Ignore__Group__5__Impl rule__Ignore__Group__6 )
            // InternalCOV.g:1790:2: rule__Ignore__Group__5__Impl rule__Ignore__Group__6
            {
            pushFollow(FOLLOW_18);
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
    // InternalCOV.g:1797:1: rule__Ignore__Group__5__Impl : ( ( rule__Ignore__Group_5__0 )? ) ;
    public final void rule__Ignore__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1801:1: ( ( ( rule__Ignore__Group_5__0 )? ) )
            // InternalCOV.g:1802:1: ( ( rule__Ignore__Group_5__0 )? )
            {
            // InternalCOV.g:1802:1: ( ( rule__Ignore__Group_5__0 )? )
            // InternalCOV.g:1803:2: ( rule__Ignore__Group_5__0 )?
            {
             before(grammarAccess.getIgnoreAccess().getGroup_5()); 
            // InternalCOV.g:1804:2: ( rule__Ignore__Group_5__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==30) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalCOV.g:1804:3: rule__Ignore__Group_5__0
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
    // InternalCOV.g:1812:1: rule__Ignore__Group__6 : rule__Ignore__Group__6__Impl ;
    public final void rule__Ignore__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1816:1: ( rule__Ignore__Group__6__Impl )
            // InternalCOV.g:1817:2: rule__Ignore__Group__6__Impl
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
    // InternalCOV.g:1823:1: rule__Ignore__Group__6__Impl : ( ( rule__Ignore__Group_6__0 )? ) ;
    public final void rule__Ignore__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1827:1: ( ( ( rule__Ignore__Group_6__0 )? ) )
            // InternalCOV.g:1828:1: ( ( rule__Ignore__Group_6__0 )? )
            {
            // InternalCOV.g:1828:1: ( ( rule__Ignore__Group_6__0 )? )
            // InternalCOV.g:1829:2: ( rule__Ignore__Group_6__0 )?
            {
             before(grammarAccess.getIgnoreAccess().getGroup_6()); 
            // InternalCOV.g:1830:2: ( rule__Ignore__Group_6__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==31) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalCOV.g:1830:3: rule__Ignore__Group_6__0
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
    // InternalCOV.g:1839:1: rule__Ignore__Group_3__0 : rule__Ignore__Group_3__0__Impl rule__Ignore__Group_3__1 ;
    public final void rule__Ignore__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1843:1: ( rule__Ignore__Group_3__0__Impl rule__Ignore__Group_3__1 )
            // InternalCOV.g:1844:2: rule__Ignore__Group_3__0__Impl rule__Ignore__Group_3__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalCOV.g:1851:1: rule__Ignore__Group_3__0__Impl : ( 'subtypes' ) ;
    public final void rule__Ignore__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1855:1: ( ( 'subtypes' ) )
            // InternalCOV.g:1856:1: ( 'subtypes' )
            {
            // InternalCOV.g:1856:1: ( 'subtypes' )
            // InternalCOV.g:1857:2: 'subtypes'
            {
             before(grammarAccess.getIgnoreAccess().getSubtypesKeyword_3_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalCOV.g:1866:1: rule__Ignore__Group_3__1 : rule__Ignore__Group_3__1__Impl ;
    public final void rule__Ignore__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1870:1: ( rule__Ignore__Group_3__1__Impl )
            // InternalCOV.g:1871:2: rule__Ignore__Group_3__1__Impl
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
    // InternalCOV.g:1877:1: rule__Ignore__Group_3__1__Impl : ( ( rule__Ignore__IgnoreSubtypesAssignment_3_1 ) ) ;
    public final void rule__Ignore__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1881:1: ( ( ( rule__Ignore__IgnoreSubtypesAssignment_3_1 ) ) )
            // InternalCOV.g:1882:1: ( ( rule__Ignore__IgnoreSubtypesAssignment_3_1 ) )
            {
            // InternalCOV.g:1882:1: ( ( rule__Ignore__IgnoreSubtypesAssignment_3_1 ) )
            // InternalCOV.g:1883:2: ( rule__Ignore__IgnoreSubtypesAssignment_3_1 )
            {
             before(grammarAccess.getIgnoreAccess().getIgnoreSubtypesAssignment_3_1()); 
            // InternalCOV.g:1884:2: ( rule__Ignore__IgnoreSubtypesAssignment_3_1 )
            // InternalCOV.g:1884:3: rule__Ignore__IgnoreSubtypesAssignment_3_1
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
    // InternalCOV.g:1893:1: rule__Ignore__Group_5__0 : rule__Ignore__Group_5__0__Impl rule__Ignore__Group_5__1 ;
    public final void rule__Ignore__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1897:1: ( rule__Ignore__Group_5__0__Impl rule__Ignore__Group_5__1 )
            // InternalCOV.g:1898:2: rule__Ignore__Group_5__0__Impl rule__Ignore__Group_5__1
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
    // InternalCOV.g:1905:1: rule__Ignore__Group_5__0__Impl : ( 'description' ) ;
    public final void rule__Ignore__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1909:1: ( ( 'description' ) )
            // InternalCOV.g:1910:1: ( 'description' )
            {
            // InternalCOV.g:1910:1: ( 'description' )
            // InternalCOV.g:1911:2: 'description'
            {
             before(grammarAccess.getIgnoreAccess().getDescriptionKeyword_5_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalCOV.g:1920:1: rule__Ignore__Group_5__1 : rule__Ignore__Group_5__1__Impl ;
    public final void rule__Ignore__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1924:1: ( rule__Ignore__Group_5__1__Impl )
            // InternalCOV.g:1925:2: rule__Ignore__Group_5__1__Impl
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
    // InternalCOV.g:1931:1: rule__Ignore__Group_5__1__Impl : ( ( rule__Ignore__DescriptionAssignment_5_1 ) ) ;
    public final void rule__Ignore__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1935:1: ( ( ( rule__Ignore__DescriptionAssignment_5_1 ) ) )
            // InternalCOV.g:1936:1: ( ( rule__Ignore__DescriptionAssignment_5_1 ) )
            {
            // InternalCOV.g:1936:1: ( ( rule__Ignore__DescriptionAssignment_5_1 ) )
            // InternalCOV.g:1937:2: ( rule__Ignore__DescriptionAssignment_5_1 )
            {
             before(grammarAccess.getIgnoreAccess().getDescriptionAssignment_5_1()); 
            // InternalCOV.g:1938:2: ( rule__Ignore__DescriptionAssignment_5_1 )
            // InternalCOV.g:1938:3: rule__Ignore__DescriptionAssignment_5_1
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
    // InternalCOV.g:1947:1: rule__Ignore__Group_6__0 : rule__Ignore__Group_6__0__Impl rule__Ignore__Group_6__1 ;
    public final void rule__Ignore__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1951:1: ( rule__Ignore__Group_6__0__Impl rule__Ignore__Group_6__1 )
            // InternalCOV.g:1952:2: rule__Ignore__Group_6__0__Impl rule__Ignore__Group_6__1
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
    // InternalCOV.g:1959:1: rule__Ignore__Group_6__0__Impl : ( 'condition' ) ;
    public final void rule__Ignore__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1963:1: ( ( 'condition' ) )
            // InternalCOV.g:1964:1: ( 'condition' )
            {
            // InternalCOV.g:1964:1: ( 'condition' )
            // InternalCOV.g:1965:2: 'condition'
            {
             before(grammarAccess.getIgnoreAccess().getConditionKeyword_6_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalCOV.g:1974:1: rule__Ignore__Group_6__1 : rule__Ignore__Group_6__1__Impl ;
    public final void rule__Ignore__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1978:1: ( rule__Ignore__Group_6__1__Impl )
            // InternalCOV.g:1979:2: rule__Ignore__Group_6__1__Impl
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
    // InternalCOV.g:1985:1: rule__Ignore__Group_6__1__Impl : ( ( rule__Ignore__ConditionAssignment_6_1 ) ) ;
    public final void rule__Ignore__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1989:1: ( ( ( rule__Ignore__ConditionAssignment_6_1 ) ) )
            // InternalCOV.g:1990:1: ( ( rule__Ignore__ConditionAssignment_6_1 ) )
            {
            // InternalCOV.g:1990:1: ( ( rule__Ignore__ConditionAssignment_6_1 ) )
            // InternalCOV.g:1991:2: ( rule__Ignore__ConditionAssignment_6_1 )
            {
             before(grammarAccess.getIgnoreAccess().getConditionAssignment_6_1()); 
            // InternalCOV.g:1992:2: ( rule__Ignore__ConditionAssignment_6_1 )
            // InternalCOV.g:1992:3: rule__Ignore__ConditionAssignment_6_1
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
    // InternalCOV.g:2001:1: rule__LimitedIgnore__Group__0 : rule__LimitedIgnore__Group__0__Impl rule__LimitedIgnore__Group__1 ;
    public final void rule__LimitedIgnore__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2005:1: ( rule__LimitedIgnore__Group__0__Impl rule__LimitedIgnore__Group__1 )
            // InternalCOV.g:2006:2: rule__LimitedIgnore__Group__0__Impl rule__LimitedIgnore__Group__1
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
    // InternalCOV.g:2013:1: rule__LimitedIgnore__Group__0__Impl : ( 'ignoreif' ) ;
    public final void rule__LimitedIgnore__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2017:1: ( ( 'ignoreif' ) )
            // InternalCOV.g:2018:1: ( 'ignoreif' )
            {
            // InternalCOV.g:2018:1: ( 'ignoreif' )
            // InternalCOV.g:2019:2: 'ignoreif'
            {
             before(grammarAccess.getLimitedIgnoreAccess().getIgnoreifKeyword_0()); 
            match(input,32,FOLLOW_2); 
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
    // InternalCOV.g:2028:1: rule__LimitedIgnore__Group__1 : rule__LimitedIgnore__Group__1__Impl rule__LimitedIgnore__Group__2 ;
    public final void rule__LimitedIgnore__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2032:1: ( rule__LimitedIgnore__Group__1__Impl rule__LimitedIgnore__Group__2 )
            // InternalCOV.g:2033:2: rule__LimitedIgnore__Group__1__Impl rule__LimitedIgnore__Group__2
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
    // InternalCOV.g:2040:1: rule__LimitedIgnore__Group__1__Impl : ( ( rule__LimitedIgnore__TypeAssignment_1 ) ) ;
    public final void rule__LimitedIgnore__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2044:1: ( ( ( rule__LimitedIgnore__TypeAssignment_1 ) ) )
            // InternalCOV.g:2045:1: ( ( rule__LimitedIgnore__TypeAssignment_1 ) )
            {
            // InternalCOV.g:2045:1: ( ( rule__LimitedIgnore__TypeAssignment_1 ) )
            // InternalCOV.g:2046:2: ( rule__LimitedIgnore__TypeAssignment_1 )
            {
             before(grammarAccess.getLimitedIgnoreAccess().getTypeAssignment_1()); 
            // InternalCOV.g:2047:2: ( rule__LimitedIgnore__TypeAssignment_1 )
            // InternalCOV.g:2047:3: rule__LimitedIgnore__TypeAssignment_1
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
    // InternalCOV.g:2055:1: rule__LimitedIgnore__Group__2 : rule__LimitedIgnore__Group__2__Impl rule__LimitedIgnore__Group__3 ;
    public final void rule__LimitedIgnore__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2059:1: ( rule__LimitedIgnore__Group__2__Impl rule__LimitedIgnore__Group__3 )
            // InternalCOV.g:2060:2: rule__LimitedIgnore__Group__2__Impl rule__LimitedIgnore__Group__3
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
    // InternalCOV.g:2067:1: rule__LimitedIgnore__Group__2__Impl : ( ( rule__LimitedIgnore__ContainerMetaclassAssignment_2 ) ) ;
    public final void rule__LimitedIgnore__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2071:1: ( ( ( rule__LimitedIgnore__ContainerMetaclassAssignment_2 ) ) )
            // InternalCOV.g:2072:1: ( ( rule__LimitedIgnore__ContainerMetaclassAssignment_2 ) )
            {
            // InternalCOV.g:2072:1: ( ( rule__LimitedIgnore__ContainerMetaclassAssignment_2 ) )
            // InternalCOV.g:2073:2: ( rule__LimitedIgnore__ContainerMetaclassAssignment_2 )
            {
             before(grammarAccess.getLimitedIgnoreAccess().getContainerMetaclassAssignment_2()); 
            // InternalCOV.g:2074:2: ( rule__LimitedIgnore__ContainerMetaclassAssignment_2 )
            // InternalCOV.g:2074:3: rule__LimitedIgnore__ContainerMetaclassAssignment_2
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
    // InternalCOV.g:2082:1: rule__LimitedIgnore__Group__3 : rule__LimitedIgnore__Group__3__Impl rule__LimitedIgnore__Group__4 ;
    public final void rule__LimitedIgnore__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2086:1: ( rule__LimitedIgnore__Group__3__Impl rule__LimitedIgnore__Group__4 )
            // InternalCOV.g:2087:2: rule__LimitedIgnore__Group__3__Impl rule__LimitedIgnore__Group__4
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
    // InternalCOV.g:2094:1: rule__LimitedIgnore__Group__3__Impl : ( ( rule__LimitedIgnore__Group_3__0 )* ) ;
    public final void rule__LimitedIgnore__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2098:1: ( ( ( rule__LimitedIgnore__Group_3__0 )* ) )
            // InternalCOV.g:2099:1: ( ( rule__LimitedIgnore__Group_3__0 )* )
            {
            // InternalCOV.g:2099:1: ( ( rule__LimitedIgnore__Group_3__0 )* )
            // InternalCOV.g:2100:2: ( rule__LimitedIgnore__Group_3__0 )*
            {
             before(grammarAccess.getLimitedIgnoreAccess().getGroup_3()); 
            // InternalCOV.g:2101:2: ( rule__LimitedIgnore__Group_3__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==22) ) {
                    int LA17_2 = input.LA(2);

                    if ( ((LA17_2>=RULE_STRING && LA17_2<=RULE_ID)) ) {
                        alt17=1;
                    }


                }


                switch (alt17) {
            	case 1 :
            	    // InternalCOV.g:2101:3: rule__LimitedIgnore__Group_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__LimitedIgnore__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // InternalCOV.g:2109:1: rule__LimitedIgnore__Group__4 : rule__LimitedIgnore__Group__4__Impl rule__LimitedIgnore__Group__5 ;
    public final void rule__LimitedIgnore__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2113:1: ( rule__LimitedIgnore__Group__4__Impl rule__LimitedIgnore__Group__5 )
            // InternalCOV.g:2114:2: rule__LimitedIgnore__Group__4__Impl rule__LimitedIgnore__Group__5
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
    // InternalCOV.g:2121:1: rule__LimitedIgnore__Group__4__Impl : ( ( rule__LimitedIgnore__Group_4__0 )? ) ;
    public final void rule__LimitedIgnore__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2125:1: ( ( ( rule__LimitedIgnore__Group_4__0 )? ) )
            // InternalCOV.g:2126:1: ( ( rule__LimitedIgnore__Group_4__0 )? )
            {
            // InternalCOV.g:2126:1: ( ( rule__LimitedIgnore__Group_4__0 )? )
            // InternalCOV.g:2127:2: ( rule__LimitedIgnore__Group_4__0 )?
            {
             before(grammarAccess.getLimitedIgnoreAccess().getGroup_4()); 
            // InternalCOV.g:2128:2: ( rule__LimitedIgnore__Group_4__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==30) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalCOV.g:2128:3: rule__LimitedIgnore__Group_4__0
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
    // InternalCOV.g:2136:1: rule__LimitedIgnore__Group__5 : rule__LimitedIgnore__Group__5__Impl ;
    public final void rule__LimitedIgnore__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2140:1: ( rule__LimitedIgnore__Group__5__Impl )
            // InternalCOV.g:2141:2: rule__LimitedIgnore__Group__5__Impl
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
    // InternalCOV.g:2147:1: rule__LimitedIgnore__Group__5__Impl : ( ( rule__LimitedIgnore__Group_5__0 )? ) ;
    public final void rule__LimitedIgnore__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2151:1: ( ( ( rule__LimitedIgnore__Group_5__0 )? ) )
            // InternalCOV.g:2152:1: ( ( rule__LimitedIgnore__Group_5__0 )? )
            {
            // InternalCOV.g:2152:1: ( ( rule__LimitedIgnore__Group_5__0 )? )
            // InternalCOV.g:2153:2: ( rule__LimitedIgnore__Group_5__0 )?
            {
             before(grammarAccess.getLimitedIgnoreAccess().getGroup_5()); 
            // InternalCOV.g:2154:2: ( rule__LimitedIgnore__Group_5__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==31) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalCOV.g:2154:3: rule__LimitedIgnore__Group_5__0
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
    // InternalCOV.g:2163:1: rule__LimitedIgnore__Group_3__0 : rule__LimitedIgnore__Group_3__0__Impl rule__LimitedIgnore__Group_3__1 ;
    public final void rule__LimitedIgnore__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2167:1: ( rule__LimitedIgnore__Group_3__0__Impl rule__LimitedIgnore__Group_3__1 )
            // InternalCOV.g:2168:2: rule__LimitedIgnore__Group_3__0__Impl rule__LimitedIgnore__Group_3__1
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
    // InternalCOV.g:2175:1: rule__LimitedIgnore__Group_3__0__Impl : ( ',' ) ;
    public final void rule__LimitedIgnore__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2179:1: ( ( ',' ) )
            // InternalCOV.g:2180:1: ( ',' )
            {
            // InternalCOV.g:2180:1: ( ',' )
            // InternalCOV.g:2181:2: ','
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
    // InternalCOV.g:2190:1: rule__LimitedIgnore__Group_3__1 : rule__LimitedIgnore__Group_3__1__Impl ;
    public final void rule__LimitedIgnore__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2194:1: ( rule__LimitedIgnore__Group_3__1__Impl )
            // InternalCOV.g:2195:2: rule__LimitedIgnore__Group_3__1__Impl
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
    // InternalCOV.g:2201:1: rule__LimitedIgnore__Group_3__1__Impl : ( ( rule__LimitedIgnore__ContainerMetaclassAssignment_3_1 ) ) ;
    public final void rule__LimitedIgnore__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2205:1: ( ( ( rule__LimitedIgnore__ContainerMetaclassAssignment_3_1 ) ) )
            // InternalCOV.g:2206:1: ( ( rule__LimitedIgnore__ContainerMetaclassAssignment_3_1 ) )
            {
            // InternalCOV.g:2206:1: ( ( rule__LimitedIgnore__ContainerMetaclassAssignment_3_1 ) )
            // InternalCOV.g:2207:2: ( rule__LimitedIgnore__ContainerMetaclassAssignment_3_1 )
            {
             before(grammarAccess.getLimitedIgnoreAccess().getContainerMetaclassAssignment_3_1()); 
            // InternalCOV.g:2208:2: ( rule__LimitedIgnore__ContainerMetaclassAssignment_3_1 )
            // InternalCOV.g:2208:3: rule__LimitedIgnore__ContainerMetaclassAssignment_3_1
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
    // InternalCOV.g:2217:1: rule__LimitedIgnore__Group_4__0 : rule__LimitedIgnore__Group_4__0__Impl rule__LimitedIgnore__Group_4__1 ;
    public final void rule__LimitedIgnore__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2221:1: ( rule__LimitedIgnore__Group_4__0__Impl rule__LimitedIgnore__Group_4__1 )
            // InternalCOV.g:2222:2: rule__LimitedIgnore__Group_4__0__Impl rule__LimitedIgnore__Group_4__1
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
    // InternalCOV.g:2229:1: rule__LimitedIgnore__Group_4__0__Impl : ( 'description' ) ;
    public final void rule__LimitedIgnore__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2233:1: ( ( 'description' ) )
            // InternalCOV.g:2234:1: ( 'description' )
            {
            // InternalCOV.g:2234:1: ( 'description' )
            // InternalCOV.g:2235:2: 'description'
            {
             before(grammarAccess.getLimitedIgnoreAccess().getDescriptionKeyword_4_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalCOV.g:2244:1: rule__LimitedIgnore__Group_4__1 : rule__LimitedIgnore__Group_4__1__Impl ;
    public final void rule__LimitedIgnore__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2248:1: ( rule__LimitedIgnore__Group_4__1__Impl )
            // InternalCOV.g:2249:2: rule__LimitedIgnore__Group_4__1__Impl
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
    // InternalCOV.g:2255:1: rule__LimitedIgnore__Group_4__1__Impl : ( ( rule__LimitedIgnore__DescriptionAssignment_4_1 ) ) ;
    public final void rule__LimitedIgnore__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2259:1: ( ( ( rule__LimitedIgnore__DescriptionAssignment_4_1 ) ) )
            // InternalCOV.g:2260:1: ( ( rule__LimitedIgnore__DescriptionAssignment_4_1 ) )
            {
            // InternalCOV.g:2260:1: ( ( rule__LimitedIgnore__DescriptionAssignment_4_1 ) )
            // InternalCOV.g:2261:2: ( rule__LimitedIgnore__DescriptionAssignment_4_1 )
            {
             before(grammarAccess.getLimitedIgnoreAccess().getDescriptionAssignment_4_1()); 
            // InternalCOV.g:2262:2: ( rule__LimitedIgnore__DescriptionAssignment_4_1 )
            // InternalCOV.g:2262:3: rule__LimitedIgnore__DescriptionAssignment_4_1
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
    // InternalCOV.g:2271:1: rule__LimitedIgnore__Group_5__0 : rule__LimitedIgnore__Group_5__0__Impl rule__LimitedIgnore__Group_5__1 ;
    public final void rule__LimitedIgnore__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2275:1: ( rule__LimitedIgnore__Group_5__0__Impl rule__LimitedIgnore__Group_5__1 )
            // InternalCOV.g:2276:2: rule__LimitedIgnore__Group_5__0__Impl rule__LimitedIgnore__Group_5__1
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
    // InternalCOV.g:2283:1: rule__LimitedIgnore__Group_5__0__Impl : ( 'condition' ) ;
    public final void rule__LimitedIgnore__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2287:1: ( ( 'condition' ) )
            // InternalCOV.g:2288:1: ( 'condition' )
            {
            // InternalCOV.g:2288:1: ( 'condition' )
            // InternalCOV.g:2289:2: 'condition'
            {
             before(grammarAccess.getLimitedIgnoreAccess().getConditionKeyword_5_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalCOV.g:2298:1: rule__LimitedIgnore__Group_5__1 : rule__LimitedIgnore__Group_5__1__Impl ;
    public final void rule__LimitedIgnore__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2302:1: ( rule__LimitedIgnore__Group_5__1__Impl )
            // InternalCOV.g:2303:2: rule__LimitedIgnore__Group_5__1__Impl
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
    // InternalCOV.g:2309:1: rule__LimitedIgnore__Group_5__1__Impl : ( ( rule__LimitedIgnore__ConditionAssignment_5_1 ) ) ;
    public final void rule__LimitedIgnore__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2313:1: ( ( ( rule__LimitedIgnore__ConditionAssignment_5_1 ) ) )
            // InternalCOV.g:2314:1: ( ( rule__LimitedIgnore__ConditionAssignment_5_1 ) )
            {
            // InternalCOV.g:2314:1: ( ( rule__LimitedIgnore__ConditionAssignment_5_1 ) )
            // InternalCOV.g:2315:2: ( rule__LimitedIgnore__ConditionAssignment_5_1 )
            {
             before(grammarAccess.getLimitedIgnoreAccess().getConditionAssignment_5_1()); 
            // InternalCOV.g:2316:2: ( rule__LimitedIgnore__ConditionAssignment_5_1 )
            // InternalCOV.g:2316:3: rule__LimitedIgnore__ConditionAssignment_5_1
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
    // InternalCOV.g:2325:1: rule__CoverageOfReferenced__Group__0 : rule__CoverageOfReferenced__Group__0__Impl rule__CoverageOfReferenced__Group__1 ;
    public final void rule__CoverageOfReferenced__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2329:1: ( rule__CoverageOfReferenced__Group__0__Impl rule__CoverageOfReferenced__Group__1 )
            // InternalCOV.g:2330:2: rule__CoverageOfReferenced__Group__0__Impl rule__CoverageOfReferenced__Group__1
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
    // InternalCOV.g:2337:1: rule__CoverageOfReferenced__Group__0__Impl : ( 'covers' ) ;
    public final void rule__CoverageOfReferenced__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2341:1: ( ( 'covers' ) )
            // InternalCOV.g:2342:1: ( 'covers' )
            {
            // InternalCOV.g:2342:1: ( 'covers' )
            // InternalCOV.g:2343:2: 'covers'
            {
             before(grammarAccess.getCoverageOfReferencedAccess().getCoversKeyword_0()); 
            match(input,33,FOLLOW_2); 
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
    // InternalCOV.g:2352:1: rule__CoverageOfReferenced__Group__1 : rule__CoverageOfReferenced__Group__1__Impl rule__CoverageOfReferenced__Group__2 ;
    public final void rule__CoverageOfReferenced__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2356:1: ( rule__CoverageOfReferenced__Group__1__Impl rule__CoverageOfReferenced__Group__2 )
            // InternalCOV.g:2357:2: rule__CoverageOfReferenced__Group__1__Impl rule__CoverageOfReferenced__Group__2
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
    // InternalCOV.g:2364:1: rule__CoverageOfReferenced__Group__1__Impl : ( ( rule__CoverageOfReferenced__ReferenceAssignment_1 ) ) ;
    public final void rule__CoverageOfReferenced__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2368:1: ( ( ( rule__CoverageOfReferenced__ReferenceAssignment_1 ) ) )
            // InternalCOV.g:2369:1: ( ( rule__CoverageOfReferenced__ReferenceAssignment_1 ) )
            {
            // InternalCOV.g:2369:1: ( ( rule__CoverageOfReferenced__ReferenceAssignment_1 ) )
            // InternalCOV.g:2370:2: ( rule__CoverageOfReferenced__ReferenceAssignment_1 )
            {
             before(grammarAccess.getCoverageOfReferencedAccess().getReferenceAssignment_1()); 
            // InternalCOV.g:2371:2: ( rule__CoverageOfReferenced__ReferenceAssignment_1 )
            // InternalCOV.g:2371:3: rule__CoverageOfReferenced__ReferenceAssignment_1
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
    // InternalCOV.g:2379:1: rule__CoverageOfReferenced__Group__2 : rule__CoverageOfReferenced__Group__2__Impl rule__CoverageOfReferenced__Group__3 ;
    public final void rule__CoverageOfReferenced__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2383:1: ( rule__CoverageOfReferenced__Group__2__Impl rule__CoverageOfReferenced__Group__3 )
            // InternalCOV.g:2384:2: rule__CoverageOfReferenced__Group__2__Impl rule__CoverageOfReferenced__Group__3
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
    // InternalCOV.g:2391:1: rule__CoverageOfReferenced__Group__2__Impl : ( ( rule__CoverageOfReferenced__Group_2__0 )* ) ;
    public final void rule__CoverageOfReferenced__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2395:1: ( ( ( rule__CoverageOfReferenced__Group_2__0 )* ) )
            // InternalCOV.g:2396:1: ( ( rule__CoverageOfReferenced__Group_2__0 )* )
            {
            // InternalCOV.g:2396:1: ( ( rule__CoverageOfReferenced__Group_2__0 )* )
            // InternalCOV.g:2397:2: ( rule__CoverageOfReferenced__Group_2__0 )*
            {
             before(grammarAccess.getCoverageOfReferencedAccess().getGroup_2()); 
            // InternalCOV.g:2398:2: ( rule__CoverageOfReferenced__Group_2__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==22) ) {
                    int LA20_2 = input.LA(2);

                    if ( ((LA20_2>=RULE_STRING && LA20_2<=RULE_ID)) ) {
                        alt20=1;
                    }


                }


                switch (alt20) {
            	case 1 :
            	    // InternalCOV.g:2398:3: rule__CoverageOfReferenced__Group_2__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__CoverageOfReferenced__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // InternalCOV.g:2406:1: rule__CoverageOfReferenced__Group__3 : rule__CoverageOfReferenced__Group__3__Impl rule__CoverageOfReferenced__Group__4 ;
    public final void rule__CoverageOfReferenced__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2410:1: ( rule__CoverageOfReferenced__Group__3__Impl rule__CoverageOfReferenced__Group__4 )
            // InternalCOV.g:2411:2: rule__CoverageOfReferenced__Group__3__Impl rule__CoverageOfReferenced__Group__4
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
    // InternalCOV.g:2418:1: rule__CoverageOfReferenced__Group__3__Impl : ( ( rule__CoverageOfReferenced__Group_3__0 )? ) ;
    public final void rule__CoverageOfReferenced__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2422:1: ( ( ( rule__CoverageOfReferenced__Group_3__0 )? ) )
            // InternalCOV.g:2423:1: ( ( rule__CoverageOfReferenced__Group_3__0 )? )
            {
            // InternalCOV.g:2423:1: ( ( rule__CoverageOfReferenced__Group_3__0 )? )
            // InternalCOV.g:2424:2: ( rule__CoverageOfReferenced__Group_3__0 )?
            {
             before(grammarAccess.getCoverageOfReferencedAccess().getGroup_3()); 
            // InternalCOV.g:2425:2: ( rule__CoverageOfReferenced__Group_3__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==30) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalCOV.g:2425:3: rule__CoverageOfReferenced__Group_3__0
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
    // InternalCOV.g:2433:1: rule__CoverageOfReferenced__Group__4 : rule__CoverageOfReferenced__Group__4__Impl ;
    public final void rule__CoverageOfReferenced__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2437:1: ( rule__CoverageOfReferenced__Group__4__Impl )
            // InternalCOV.g:2438:2: rule__CoverageOfReferenced__Group__4__Impl
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
    // InternalCOV.g:2444:1: rule__CoverageOfReferenced__Group__4__Impl : ( ( rule__CoverageOfReferenced__Group_4__0 )? ) ;
    public final void rule__CoverageOfReferenced__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2448:1: ( ( ( rule__CoverageOfReferenced__Group_4__0 )? ) )
            // InternalCOV.g:2449:1: ( ( rule__CoverageOfReferenced__Group_4__0 )? )
            {
            // InternalCOV.g:2449:1: ( ( rule__CoverageOfReferenced__Group_4__0 )? )
            // InternalCOV.g:2450:2: ( rule__CoverageOfReferenced__Group_4__0 )?
            {
             before(grammarAccess.getCoverageOfReferencedAccess().getGroup_4()); 
            // InternalCOV.g:2451:2: ( rule__CoverageOfReferenced__Group_4__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==31) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalCOV.g:2451:3: rule__CoverageOfReferenced__Group_4__0
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
    // InternalCOV.g:2460:1: rule__CoverageOfReferenced__Group_2__0 : rule__CoverageOfReferenced__Group_2__0__Impl rule__CoverageOfReferenced__Group_2__1 ;
    public final void rule__CoverageOfReferenced__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2464:1: ( rule__CoverageOfReferenced__Group_2__0__Impl rule__CoverageOfReferenced__Group_2__1 )
            // InternalCOV.g:2465:2: rule__CoverageOfReferenced__Group_2__0__Impl rule__CoverageOfReferenced__Group_2__1
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
    // InternalCOV.g:2472:1: rule__CoverageOfReferenced__Group_2__0__Impl : ( ',' ) ;
    public final void rule__CoverageOfReferenced__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2476:1: ( ( ',' ) )
            // InternalCOV.g:2477:1: ( ',' )
            {
            // InternalCOV.g:2477:1: ( ',' )
            // InternalCOV.g:2478:2: ','
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
    // InternalCOV.g:2487:1: rule__CoverageOfReferenced__Group_2__1 : rule__CoverageOfReferenced__Group_2__1__Impl ;
    public final void rule__CoverageOfReferenced__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2491:1: ( rule__CoverageOfReferenced__Group_2__1__Impl )
            // InternalCOV.g:2492:2: rule__CoverageOfReferenced__Group_2__1__Impl
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
    // InternalCOV.g:2498:1: rule__CoverageOfReferenced__Group_2__1__Impl : ( ( rule__CoverageOfReferenced__ReferenceAssignment_2_1 ) ) ;
    public final void rule__CoverageOfReferenced__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2502:1: ( ( ( rule__CoverageOfReferenced__ReferenceAssignment_2_1 ) ) )
            // InternalCOV.g:2503:1: ( ( rule__CoverageOfReferenced__ReferenceAssignment_2_1 ) )
            {
            // InternalCOV.g:2503:1: ( ( rule__CoverageOfReferenced__ReferenceAssignment_2_1 ) )
            // InternalCOV.g:2504:2: ( rule__CoverageOfReferenced__ReferenceAssignment_2_1 )
            {
             before(grammarAccess.getCoverageOfReferencedAccess().getReferenceAssignment_2_1()); 
            // InternalCOV.g:2505:2: ( rule__CoverageOfReferenced__ReferenceAssignment_2_1 )
            // InternalCOV.g:2505:3: rule__CoverageOfReferenced__ReferenceAssignment_2_1
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
    // InternalCOV.g:2514:1: rule__CoverageOfReferenced__Group_3__0 : rule__CoverageOfReferenced__Group_3__0__Impl rule__CoverageOfReferenced__Group_3__1 ;
    public final void rule__CoverageOfReferenced__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2518:1: ( rule__CoverageOfReferenced__Group_3__0__Impl rule__CoverageOfReferenced__Group_3__1 )
            // InternalCOV.g:2519:2: rule__CoverageOfReferenced__Group_3__0__Impl rule__CoverageOfReferenced__Group_3__1
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
    // InternalCOV.g:2526:1: rule__CoverageOfReferenced__Group_3__0__Impl : ( 'description' ) ;
    public final void rule__CoverageOfReferenced__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2530:1: ( ( 'description' ) )
            // InternalCOV.g:2531:1: ( 'description' )
            {
            // InternalCOV.g:2531:1: ( 'description' )
            // InternalCOV.g:2532:2: 'description'
            {
             before(grammarAccess.getCoverageOfReferencedAccess().getDescriptionKeyword_3_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalCOV.g:2541:1: rule__CoverageOfReferenced__Group_3__1 : rule__CoverageOfReferenced__Group_3__1__Impl ;
    public final void rule__CoverageOfReferenced__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2545:1: ( rule__CoverageOfReferenced__Group_3__1__Impl )
            // InternalCOV.g:2546:2: rule__CoverageOfReferenced__Group_3__1__Impl
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
    // InternalCOV.g:2552:1: rule__CoverageOfReferenced__Group_3__1__Impl : ( ( rule__CoverageOfReferenced__DescriptionAssignment_3_1 ) ) ;
    public final void rule__CoverageOfReferenced__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2556:1: ( ( ( rule__CoverageOfReferenced__DescriptionAssignment_3_1 ) ) )
            // InternalCOV.g:2557:1: ( ( rule__CoverageOfReferenced__DescriptionAssignment_3_1 ) )
            {
            // InternalCOV.g:2557:1: ( ( rule__CoverageOfReferenced__DescriptionAssignment_3_1 ) )
            // InternalCOV.g:2558:2: ( rule__CoverageOfReferenced__DescriptionAssignment_3_1 )
            {
             before(grammarAccess.getCoverageOfReferencedAccess().getDescriptionAssignment_3_1()); 
            // InternalCOV.g:2559:2: ( rule__CoverageOfReferenced__DescriptionAssignment_3_1 )
            // InternalCOV.g:2559:3: rule__CoverageOfReferenced__DescriptionAssignment_3_1
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
    // InternalCOV.g:2568:1: rule__CoverageOfReferenced__Group_4__0 : rule__CoverageOfReferenced__Group_4__0__Impl rule__CoverageOfReferenced__Group_4__1 ;
    public final void rule__CoverageOfReferenced__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2572:1: ( rule__CoverageOfReferenced__Group_4__0__Impl rule__CoverageOfReferenced__Group_4__1 )
            // InternalCOV.g:2573:2: rule__CoverageOfReferenced__Group_4__0__Impl rule__CoverageOfReferenced__Group_4__1
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
    // InternalCOV.g:2580:1: rule__CoverageOfReferenced__Group_4__0__Impl : ( 'condition' ) ;
    public final void rule__CoverageOfReferenced__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2584:1: ( ( 'condition' ) )
            // InternalCOV.g:2585:1: ( 'condition' )
            {
            // InternalCOV.g:2585:1: ( 'condition' )
            // InternalCOV.g:2586:2: 'condition'
            {
             before(grammarAccess.getCoverageOfReferencedAccess().getConditionKeyword_4_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalCOV.g:2595:1: rule__CoverageOfReferenced__Group_4__1 : rule__CoverageOfReferenced__Group_4__1__Impl ;
    public final void rule__CoverageOfReferenced__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2599:1: ( rule__CoverageOfReferenced__Group_4__1__Impl )
            // InternalCOV.g:2600:2: rule__CoverageOfReferenced__Group_4__1__Impl
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
    // InternalCOV.g:2606:1: rule__CoverageOfReferenced__Group_4__1__Impl : ( ( rule__CoverageOfReferenced__ConditionAssignment_4_1 ) ) ;
    public final void rule__CoverageOfReferenced__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2610:1: ( ( ( rule__CoverageOfReferenced__ConditionAssignment_4_1 ) ) )
            // InternalCOV.g:2611:1: ( ( rule__CoverageOfReferenced__ConditionAssignment_4_1 ) )
            {
            // InternalCOV.g:2611:1: ( ( rule__CoverageOfReferenced__ConditionAssignment_4_1 ) )
            // InternalCOV.g:2612:2: ( rule__CoverageOfReferenced__ConditionAssignment_4_1 )
            {
             before(grammarAccess.getCoverageOfReferencedAccess().getConditionAssignment_4_1()); 
            // InternalCOV.g:2613:2: ( rule__CoverageOfReferenced__ConditionAssignment_4_1 )
            // InternalCOV.g:2613:3: rule__CoverageOfReferenced__ConditionAssignment_4_1
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
    // InternalCOV.g:2622:1: rule__CoverageByContent__Group__0 : rule__CoverageByContent__Group__0__Impl rule__CoverageByContent__Group__1 ;
    public final void rule__CoverageByContent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2626:1: ( rule__CoverageByContent__Group__0__Impl rule__CoverageByContent__Group__1 )
            // InternalCOV.g:2627:2: rule__CoverageByContent__Group__0__Impl rule__CoverageByContent__Group__1
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
    // InternalCOV.g:2634:1: rule__CoverageByContent__Group__0__Impl : ( 'covered' ) ;
    public final void rule__CoverageByContent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2638:1: ( ( 'covered' ) )
            // InternalCOV.g:2639:1: ( 'covered' )
            {
            // InternalCOV.g:2639:1: ( 'covered' )
            // InternalCOV.g:2640:2: 'covered'
            {
             before(grammarAccess.getCoverageByContentAccess().getCoveredKeyword_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalCOV.g:2649:1: rule__CoverageByContent__Group__1 : rule__CoverageByContent__Group__1__Impl rule__CoverageByContent__Group__2 ;
    public final void rule__CoverageByContent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2653:1: ( rule__CoverageByContent__Group__1__Impl rule__CoverageByContent__Group__2 )
            // InternalCOV.g:2654:2: rule__CoverageByContent__Group__1__Impl rule__CoverageByContent__Group__2
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
    // InternalCOV.g:2661:1: rule__CoverageByContent__Group__1__Impl : ( 'when' ) ;
    public final void rule__CoverageByContent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2665:1: ( ( 'when' ) )
            // InternalCOV.g:2666:1: ( 'when' )
            {
            // InternalCOV.g:2666:1: ( 'when' )
            // InternalCOV.g:2667:2: 'when'
            {
             before(grammarAccess.getCoverageByContentAccess().getWhenKeyword_1()); 
            match(input,35,FOLLOW_2); 
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
    // InternalCOV.g:2676:1: rule__CoverageByContent__Group__2 : rule__CoverageByContent__Group__2__Impl rule__CoverageByContent__Group__3 ;
    public final void rule__CoverageByContent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2680:1: ( rule__CoverageByContent__Group__2__Impl rule__CoverageByContent__Group__3 )
            // InternalCOV.g:2681:2: rule__CoverageByContent__Group__2__Impl rule__CoverageByContent__Group__3
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
    // InternalCOV.g:2688:1: rule__CoverageByContent__Group__2__Impl : ( ( rule__CoverageByContent__MultiplicityAssignment_2 ) ) ;
    public final void rule__CoverageByContent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2692:1: ( ( ( rule__CoverageByContent__MultiplicityAssignment_2 ) ) )
            // InternalCOV.g:2693:1: ( ( rule__CoverageByContent__MultiplicityAssignment_2 ) )
            {
            // InternalCOV.g:2693:1: ( ( rule__CoverageByContent__MultiplicityAssignment_2 ) )
            // InternalCOV.g:2694:2: ( rule__CoverageByContent__MultiplicityAssignment_2 )
            {
             before(grammarAccess.getCoverageByContentAccess().getMultiplicityAssignment_2()); 
            // InternalCOV.g:2695:2: ( rule__CoverageByContent__MultiplicityAssignment_2 )
            // InternalCOV.g:2695:3: rule__CoverageByContent__MultiplicityAssignment_2
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
    // InternalCOV.g:2703:1: rule__CoverageByContent__Group__3 : rule__CoverageByContent__Group__3__Impl rule__CoverageByContent__Group__4 ;
    public final void rule__CoverageByContent__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2707:1: ( rule__CoverageByContent__Group__3__Impl rule__CoverageByContent__Group__4 )
            // InternalCOV.g:2708:2: rule__CoverageByContent__Group__3__Impl rule__CoverageByContent__Group__4
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
    // InternalCOV.g:2715:1: rule__CoverageByContent__Group__3__Impl : ( ( rule__CoverageByContent__ContainmentReferenceAssignment_3 ) ) ;
    public final void rule__CoverageByContent__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2719:1: ( ( ( rule__CoverageByContent__ContainmentReferenceAssignment_3 ) ) )
            // InternalCOV.g:2720:1: ( ( rule__CoverageByContent__ContainmentReferenceAssignment_3 ) )
            {
            // InternalCOV.g:2720:1: ( ( rule__CoverageByContent__ContainmentReferenceAssignment_3 ) )
            // InternalCOV.g:2721:2: ( rule__CoverageByContent__ContainmentReferenceAssignment_3 )
            {
             before(grammarAccess.getCoverageByContentAccess().getContainmentReferenceAssignment_3()); 
            // InternalCOV.g:2722:2: ( rule__CoverageByContent__ContainmentReferenceAssignment_3 )
            // InternalCOV.g:2722:3: rule__CoverageByContent__ContainmentReferenceAssignment_3
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
    // InternalCOV.g:2730:1: rule__CoverageByContent__Group__4 : rule__CoverageByContent__Group__4__Impl rule__CoverageByContent__Group__5 ;
    public final void rule__CoverageByContent__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2734:1: ( rule__CoverageByContent__Group__4__Impl rule__CoverageByContent__Group__5 )
            // InternalCOV.g:2735:2: rule__CoverageByContent__Group__4__Impl rule__CoverageByContent__Group__5
            {
            pushFollow(FOLLOW_18);
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
    // InternalCOV.g:2742:1: rule__CoverageByContent__Group__4__Impl : ( 'iscovered' ) ;
    public final void rule__CoverageByContent__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2746:1: ( ( 'iscovered' ) )
            // InternalCOV.g:2747:1: ( 'iscovered' )
            {
            // InternalCOV.g:2747:1: ( 'iscovered' )
            // InternalCOV.g:2748:2: 'iscovered'
            {
             before(grammarAccess.getCoverageByContentAccess().getIscoveredKeyword_4()); 
            match(input,36,FOLLOW_2); 
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
    // InternalCOV.g:2757:1: rule__CoverageByContent__Group__5 : rule__CoverageByContent__Group__5__Impl rule__CoverageByContent__Group__6 ;
    public final void rule__CoverageByContent__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2761:1: ( rule__CoverageByContent__Group__5__Impl rule__CoverageByContent__Group__6 )
            // InternalCOV.g:2762:2: rule__CoverageByContent__Group__5__Impl rule__CoverageByContent__Group__6
            {
            pushFollow(FOLLOW_18);
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
    // InternalCOV.g:2769:1: rule__CoverageByContent__Group__5__Impl : ( ( rule__CoverageByContent__Group_5__0 )? ) ;
    public final void rule__CoverageByContent__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2773:1: ( ( ( rule__CoverageByContent__Group_5__0 )? ) )
            // InternalCOV.g:2774:1: ( ( rule__CoverageByContent__Group_5__0 )? )
            {
            // InternalCOV.g:2774:1: ( ( rule__CoverageByContent__Group_5__0 )? )
            // InternalCOV.g:2775:2: ( rule__CoverageByContent__Group_5__0 )?
            {
             before(grammarAccess.getCoverageByContentAccess().getGroup_5()); 
            // InternalCOV.g:2776:2: ( rule__CoverageByContent__Group_5__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==30) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalCOV.g:2776:3: rule__CoverageByContent__Group_5__0
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
    // InternalCOV.g:2784:1: rule__CoverageByContent__Group__6 : rule__CoverageByContent__Group__6__Impl ;
    public final void rule__CoverageByContent__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2788:1: ( rule__CoverageByContent__Group__6__Impl )
            // InternalCOV.g:2789:2: rule__CoverageByContent__Group__6__Impl
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
    // InternalCOV.g:2795:1: rule__CoverageByContent__Group__6__Impl : ( ( rule__CoverageByContent__Group_6__0 )? ) ;
    public final void rule__CoverageByContent__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2799:1: ( ( ( rule__CoverageByContent__Group_6__0 )? ) )
            // InternalCOV.g:2800:1: ( ( rule__CoverageByContent__Group_6__0 )? )
            {
            // InternalCOV.g:2800:1: ( ( rule__CoverageByContent__Group_6__0 )? )
            // InternalCOV.g:2801:2: ( rule__CoverageByContent__Group_6__0 )?
            {
             before(grammarAccess.getCoverageByContentAccess().getGroup_6()); 
            // InternalCOV.g:2802:2: ( rule__CoverageByContent__Group_6__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==31) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalCOV.g:2802:3: rule__CoverageByContent__Group_6__0
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
    // InternalCOV.g:2811:1: rule__CoverageByContent__Group_5__0 : rule__CoverageByContent__Group_5__0__Impl rule__CoverageByContent__Group_5__1 ;
    public final void rule__CoverageByContent__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2815:1: ( rule__CoverageByContent__Group_5__0__Impl rule__CoverageByContent__Group_5__1 )
            // InternalCOV.g:2816:2: rule__CoverageByContent__Group_5__0__Impl rule__CoverageByContent__Group_5__1
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
    // InternalCOV.g:2823:1: rule__CoverageByContent__Group_5__0__Impl : ( 'description' ) ;
    public final void rule__CoverageByContent__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2827:1: ( ( 'description' ) )
            // InternalCOV.g:2828:1: ( 'description' )
            {
            // InternalCOV.g:2828:1: ( 'description' )
            // InternalCOV.g:2829:2: 'description'
            {
             before(grammarAccess.getCoverageByContentAccess().getDescriptionKeyword_5_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalCOV.g:2838:1: rule__CoverageByContent__Group_5__1 : rule__CoverageByContent__Group_5__1__Impl ;
    public final void rule__CoverageByContent__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2842:1: ( rule__CoverageByContent__Group_5__1__Impl )
            // InternalCOV.g:2843:2: rule__CoverageByContent__Group_5__1__Impl
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
    // InternalCOV.g:2849:1: rule__CoverageByContent__Group_5__1__Impl : ( ( rule__CoverageByContent__DescriptionAssignment_5_1 ) ) ;
    public final void rule__CoverageByContent__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2853:1: ( ( ( rule__CoverageByContent__DescriptionAssignment_5_1 ) ) )
            // InternalCOV.g:2854:1: ( ( rule__CoverageByContent__DescriptionAssignment_5_1 ) )
            {
            // InternalCOV.g:2854:1: ( ( rule__CoverageByContent__DescriptionAssignment_5_1 ) )
            // InternalCOV.g:2855:2: ( rule__CoverageByContent__DescriptionAssignment_5_1 )
            {
             before(grammarAccess.getCoverageByContentAccess().getDescriptionAssignment_5_1()); 
            // InternalCOV.g:2856:2: ( rule__CoverageByContent__DescriptionAssignment_5_1 )
            // InternalCOV.g:2856:3: rule__CoverageByContent__DescriptionAssignment_5_1
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
    // InternalCOV.g:2865:1: rule__CoverageByContent__Group_6__0 : rule__CoverageByContent__Group_6__0__Impl rule__CoverageByContent__Group_6__1 ;
    public final void rule__CoverageByContent__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2869:1: ( rule__CoverageByContent__Group_6__0__Impl rule__CoverageByContent__Group_6__1 )
            // InternalCOV.g:2870:2: rule__CoverageByContent__Group_6__0__Impl rule__CoverageByContent__Group_6__1
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
    // InternalCOV.g:2877:1: rule__CoverageByContent__Group_6__0__Impl : ( 'condition' ) ;
    public final void rule__CoverageByContent__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2881:1: ( ( 'condition' ) )
            // InternalCOV.g:2882:1: ( 'condition' )
            {
            // InternalCOV.g:2882:1: ( 'condition' )
            // InternalCOV.g:2883:2: 'condition'
            {
             before(grammarAccess.getCoverageByContentAccess().getConditionKeyword_6_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalCOV.g:2892:1: rule__CoverageByContent__Group_6__1 : rule__CoverageByContent__Group_6__1__Impl ;
    public final void rule__CoverageByContent__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2896:1: ( rule__CoverageByContent__Group_6__1__Impl )
            // InternalCOV.g:2897:2: rule__CoverageByContent__Group_6__1__Impl
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
    // InternalCOV.g:2903:1: rule__CoverageByContent__Group_6__1__Impl : ( ( rule__CoverageByContent__ConditionAssignment_6_1 ) ) ;
    public final void rule__CoverageByContent__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2907:1: ( ( ( rule__CoverageByContent__ConditionAssignment_6_1 ) ) )
            // InternalCOV.g:2908:1: ( ( rule__CoverageByContent__ConditionAssignment_6_1 ) )
            {
            // InternalCOV.g:2908:1: ( ( rule__CoverageByContent__ConditionAssignment_6_1 ) )
            // InternalCOV.g:2909:2: ( rule__CoverageByContent__ConditionAssignment_6_1 )
            {
             before(grammarAccess.getCoverageByContentAccess().getConditionAssignment_6_1()); 
            // InternalCOV.g:2910:2: ( rule__CoverageByContent__ConditionAssignment_6_1 )
            // InternalCOV.g:2910:3: rule__CoverageByContent__ConditionAssignment_6_1
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
    // InternalCOV.g:2919:1: rule__BranchSpecification__Group__0 : rule__BranchSpecification__Group__0__Impl rule__BranchSpecification__Group__1 ;
    public final void rule__BranchSpecification__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2923:1: ( rule__BranchSpecification__Group__0__Impl rule__BranchSpecification__Group__1 )
            // InternalCOV.g:2924:2: rule__BranchSpecification__Group__0__Impl rule__BranchSpecification__Group__1
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
    // InternalCOV.g:2931:1: rule__BranchSpecification__Group__0__Impl : ( 'has' ) ;
    public final void rule__BranchSpecification__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2935:1: ( ( 'has' ) )
            // InternalCOV.g:2936:1: ( 'has' )
            {
            // InternalCOV.g:2936:1: ( 'has' )
            // InternalCOV.g:2937:2: 'has'
            {
             before(grammarAccess.getBranchSpecificationAccess().getHasKeyword_0()); 
            match(input,37,FOLLOW_2); 
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
    // InternalCOV.g:2946:1: rule__BranchSpecification__Group__1 : rule__BranchSpecification__Group__1__Impl rule__BranchSpecification__Group__2 ;
    public final void rule__BranchSpecification__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2950:1: ( rule__BranchSpecification__Group__1__Impl rule__BranchSpecification__Group__2 )
            // InternalCOV.g:2951:2: rule__BranchSpecification__Group__1__Impl rule__BranchSpecification__Group__2
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
    // InternalCOV.g:2958:1: rule__BranchSpecification__Group__1__Impl : ( 'branches' ) ;
    public final void rule__BranchSpecification__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2962:1: ( ( 'branches' ) )
            // InternalCOV.g:2963:1: ( 'branches' )
            {
            // InternalCOV.g:2963:1: ( 'branches' )
            // InternalCOV.g:2964:2: 'branches'
            {
             before(grammarAccess.getBranchSpecificationAccess().getBranchesKeyword_1()); 
            match(input,38,FOLLOW_2); 
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
    // InternalCOV.g:2973:1: rule__BranchSpecification__Group__2 : rule__BranchSpecification__Group__2__Impl rule__BranchSpecification__Group__3 ;
    public final void rule__BranchSpecification__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2977:1: ( rule__BranchSpecification__Group__2__Impl rule__BranchSpecification__Group__3 )
            // InternalCOV.g:2978:2: rule__BranchSpecification__Group__2__Impl rule__BranchSpecification__Group__3
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
    // InternalCOV.g:2985:1: rule__BranchSpecification__Group__2__Impl : ( '{' ) ;
    public final void rule__BranchSpecification__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2989:1: ( ( '{' ) )
            // InternalCOV.g:2990:1: ( '{' )
            {
            // InternalCOV.g:2990:1: ( '{' )
            // InternalCOV.g:2991:2: '{'
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
    // InternalCOV.g:3000:1: rule__BranchSpecification__Group__3 : rule__BranchSpecification__Group__3__Impl rule__BranchSpecification__Group__4 ;
    public final void rule__BranchSpecification__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3004:1: ( rule__BranchSpecification__Group__3__Impl rule__BranchSpecification__Group__4 )
            // InternalCOV.g:3005:2: rule__BranchSpecification__Group__3__Impl rule__BranchSpecification__Group__4
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
    // InternalCOV.g:3012:1: rule__BranchSpecification__Group__3__Impl : ( ( rule__BranchSpecification__Group_3__0 )? ) ;
    public final void rule__BranchSpecification__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3016:1: ( ( ( rule__BranchSpecification__Group_3__0 )? ) )
            // InternalCOV.g:3017:1: ( ( rule__BranchSpecification__Group_3__0 )? )
            {
            // InternalCOV.g:3017:1: ( ( rule__BranchSpecification__Group_3__0 )? )
            // InternalCOV.g:3018:2: ( rule__BranchSpecification__Group_3__0 )?
            {
             before(grammarAccess.getBranchSpecificationAccess().getGroup_3()); 
            // InternalCOV.g:3019:2: ( rule__BranchSpecification__Group_3__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==30) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalCOV.g:3019:3: rule__BranchSpecification__Group_3__0
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
    // InternalCOV.g:3027:1: rule__BranchSpecification__Group__4 : rule__BranchSpecification__Group__4__Impl rule__BranchSpecification__Group__5 ;
    public final void rule__BranchSpecification__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3031:1: ( rule__BranchSpecification__Group__4__Impl rule__BranchSpecification__Group__5 )
            // InternalCOV.g:3032:2: rule__BranchSpecification__Group__4__Impl rule__BranchSpecification__Group__5
            {
            pushFollow(FOLLOW_27);
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
    // InternalCOV.g:3039:1: rule__BranchSpecification__Group__4__Impl : ( ( rule__BranchSpecification__ContextAssignment_4 ) ) ;
    public final void rule__BranchSpecification__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3043:1: ( ( ( rule__BranchSpecification__ContextAssignment_4 ) ) )
            // InternalCOV.g:3044:1: ( ( rule__BranchSpecification__ContextAssignment_4 ) )
            {
            // InternalCOV.g:3044:1: ( ( rule__BranchSpecification__ContextAssignment_4 ) )
            // InternalCOV.g:3045:2: ( rule__BranchSpecification__ContextAssignment_4 )
            {
             before(grammarAccess.getBranchSpecificationAccess().getContextAssignment_4()); 
            // InternalCOV.g:3046:2: ( rule__BranchSpecification__ContextAssignment_4 )
            // InternalCOV.g:3046:3: rule__BranchSpecification__ContextAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__BranchSpecification__ContextAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getBranchSpecificationAccess().getContextAssignment_4()); 

            }


            }

        }
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
    // InternalCOV.g:3054:1: rule__BranchSpecification__Group__5 : rule__BranchSpecification__Group__5__Impl rule__BranchSpecification__Group__6 ;
    public final void rule__BranchSpecification__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3058:1: ( rule__BranchSpecification__Group__5__Impl rule__BranchSpecification__Group__6 )
            // InternalCOV.g:3059:2: rule__BranchSpecification__Group__5__Impl rule__BranchSpecification__Group__6
            {
            pushFollow(FOLLOW_27);
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
    // InternalCOV.g:3066:1: rule__BranchSpecification__Group__5__Impl : ( ( rule__BranchSpecification__Group_5__0 )? ) ;
    public final void rule__BranchSpecification__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3070:1: ( ( ( rule__BranchSpecification__Group_5__0 )? ) )
            // InternalCOV.g:3071:1: ( ( rule__BranchSpecification__Group_5__0 )? )
            {
            // InternalCOV.g:3071:1: ( ( rule__BranchSpecification__Group_5__0 )? )
            // InternalCOV.g:3072:2: ( rule__BranchSpecification__Group_5__0 )?
            {
             before(grammarAccess.getBranchSpecificationAccess().getGroup_5()); 
            // InternalCOV.g:3073:2: ( rule__BranchSpecification__Group_5__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==31) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalCOV.g:3073:3: rule__BranchSpecification__Group_5__0
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
    // InternalCOV.g:3081:1: rule__BranchSpecification__Group__6 : rule__BranchSpecification__Group__6__Impl rule__BranchSpecification__Group__7 ;
    public final void rule__BranchSpecification__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3085:1: ( rule__BranchSpecification__Group__6__Impl rule__BranchSpecification__Group__7 )
            // InternalCOV.g:3086:2: rule__BranchSpecification__Group__6__Impl rule__BranchSpecification__Group__7
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
    // InternalCOV.g:3093:1: rule__BranchSpecification__Group__6__Impl : ( ( rule__BranchSpecification__BranchesAssignment_6 ) ) ;
    public final void rule__BranchSpecification__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3097:1: ( ( ( rule__BranchSpecification__BranchesAssignment_6 ) ) )
            // InternalCOV.g:3098:1: ( ( rule__BranchSpecification__BranchesAssignment_6 ) )
            {
            // InternalCOV.g:3098:1: ( ( rule__BranchSpecification__BranchesAssignment_6 ) )
            // InternalCOV.g:3099:2: ( rule__BranchSpecification__BranchesAssignment_6 )
            {
             before(grammarAccess.getBranchSpecificationAccess().getBranchesAssignment_6()); 
            // InternalCOV.g:3100:2: ( rule__BranchSpecification__BranchesAssignment_6 )
            // InternalCOV.g:3100:3: rule__BranchSpecification__BranchesAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__BranchSpecification__BranchesAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getBranchSpecificationAccess().getBranchesAssignment_6()); 

            }


            }

        }
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
    // InternalCOV.g:3108:1: rule__BranchSpecification__Group__7 : rule__BranchSpecification__Group__7__Impl rule__BranchSpecification__Group__8 ;
    public final void rule__BranchSpecification__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3112:1: ( rule__BranchSpecification__Group__7__Impl rule__BranchSpecification__Group__8 )
            // InternalCOV.g:3113:2: rule__BranchSpecification__Group__7__Impl rule__BranchSpecification__Group__8
            {
            pushFollow(FOLLOW_8);
            rule__BranchSpecification__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BranchSpecification__Group__8();

            state._fsp--;


            }

        }
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
    // InternalCOV.g:3120:1: rule__BranchSpecification__Group__7__Impl : ( ( rule__BranchSpecification__Group_7__0 )* ) ;
    public final void rule__BranchSpecification__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3124:1: ( ( ( rule__BranchSpecification__Group_7__0 )* ) )
            // InternalCOV.g:3125:1: ( ( rule__BranchSpecification__Group_7__0 )* )
            {
            // InternalCOV.g:3125:1: ( ( rule__BranchSpecification__Group_7__0 )* )
            // InternalCOV.g:3126:2: ( rule__BranchSpecification__Group_7__0 )*
            {
             before(grammarAccess.getBranchSpecificationAccess().getGroup_7()); 
            // InternalCOV.g:3127:2: ( rule__BranchSpecification__Group_7__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==22) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalCOV.g:3127:3: rule__BranchSpecification__Group_7__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__BranchSpecification__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getBranchSpecificationAccess().getGroup_7()); 

            }


            }

        }
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


    // $ANTLR start "rule__BranchSpecification__Group__8"
    // InternalCOV.g:3135:1: rule__BranchSpecification__Group__8 : rule__BranchSpecification__Group__8__Impl ;
    public final void rule__BranchSpecification__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3139:1: ( rule__BranchSpecification__Group__8__Impl )
            // InternalCOV.g:3140:2: rule__BranchSpecification__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BranchSpecification__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BranchSpecification__Group__8"


    // $ANTLR start "rule__BranchSpecification__Group__8__Impl"
    // InternalCOV.g:3146:1: rule__BranchSpecification__Group__8__Impl : ( '}' ) ;
    public final void rule__BranchSpecification__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3150:1: ( ( '}' ) )
            // InternalCOV.g:3151:1: ( '}' )
            {
            // InternalCOV.g:3151:1: ( '}' )
            // InternalCOV.g:3152:2: '}'
            {
             before(grammarAccess.getBranchSpecificationAccess().getRightCurlyBracketKeyword_8()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getBranchSpecificationAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BranchSpecification__Group__8__Impl"


    // $ANTLR start "rule__BranchSpecification__Group_3__0"
    // InternalCOV.g:3162:1: rule__BranchSpecification__Group_3__0 : rule__BranchSpecification__Group_3__0__Impl rule__BranchSpecification__Group_3__1 ;
    public final void rule__BranchSpecification__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3166:1: ( rule__BranchSpecification__Group_3__0__Impl rule__BranchSpecification__Group_3__1 )
            // InternalCOV.g:3167:2: rule__BranchSpecification__Group_3__0__Impl rule__BranchSpecification__Group_3__1
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
    // InternalCOV.g:3174:1: rule__BranchSpecification__Group_3__0__Impl : ( 'description' ) ;
    public final void rule__BranchSpecification__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3178:1: ( ( 'description' ) )
            // InternalCOV.g:3179:1: ( 'description' )
            {
            // InternalCOV.g:3179:1: ( 'description' )
            // InternalCOV.g:3180:2: 'description'
            {
             before(grammarAccess.getBranchSpecificationAccess().getDescriptionKeyword_3_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalCOV.g:3189:1: rule__BranchSpecification__Group_3__1 : rule__BranchSpecification__Group_3__1__Impl ;
    public final void rule__BranchSpecification__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3193:1: ( rule__BranchSpecification__Group_3__1__Impl )
            // InternalCOV.g:3194:2: rule__BranchSpecification__Group_3__1__Impl
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
    // InternalCOV.g:3200:1: rule__BranchSpecification__Group_3__1__Impl : ( ( rule__BranchSpecification__DescriptionAssignment_3_1 ) ) ;
    public final void rule__BranchSpecification__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3204:1: ( ( ( rule__BranchSpecification__DescriptionAssignment_3_1 ) ) )
            // InternalCOV.g:3205:1: ( ( rule__BranchSpecification__DescriptionAssignment_3_1 ) )
            {
            // InternalCOV.g:3205:1: ( ( rule__BranchSpecification__DescriptionAssignment_3_1 ) )
            // InternalCOV.g:3206:2: ( rule__BranchSpecification__DescriptionAssignment_3_1 )
            {
             before(grammarAccess.getBranchSpecificationAccess().getDescriptionAssignment_3_1()); 
            // InternalCOV.g:3207:2: ( rule__BranchSpecification__DescriptionAssignment_3_1 )
            // InternalCOV.g:3207:3: rule__BranchSpecification__DescriptionAssignment_3_1
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


    // $ANTLR start "rule__BranchSpecification__Group_5__0"
    // InternalCOV.g:3216:1: rule__BranchSpecification__Group_5__0 : rule__BranchSpecification__Group_5__0__Impl rule__BranchSpecification__Group_5__1 ;
    public final void rule__BranchSpecification__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3220:1: ( rule__BranchSpecification__Group_5__0__Impl rule__BranchSpecification__Group_5__1 )
            // InternalCOV.g:3221:2: rule__BranchSpecification__Group_5__0__Impl rule__BranchSpecification__Group_5__1
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
    // InternalCOV.g:3228:1: rule__BranchSpecification__Group_5__0__Impl : ( 'condition' ) ;
    public final void rule__BranchSpecification__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3232:1: ( ( 'condition' ) )
            // InternalCOV.g:3233:1: ( 'condition' )
            {
            // InternalCOV.g:3233:1: ( 'condition' )
            // InternalCOV.g:3234:2: 'condition'
            {
             before(grammarAccess.getBranchSpecificationAccess().getConditionKeyword_5_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getBranchSpecificationAccess().getConditionKeyword_5_0()); 

            }


            }

        }
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
    // InternalCOV.g:3243:1: rule__BranchSpecification__Group_5__1 : rule__BranchSpecification__Group_5__1__Impl ;
    public final void rule__BranchSpecification__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3247:1: ( rule__BranchSpecification__Group_5__1__Impl )
            // InternalCOV.g:3248:2: rule__BranchSpecification__Group_5__1__Impl
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
    // InternalCOV.g:3254:1: rule__BranchSpecification__Group_5__1__Impl : ( ( rule__BranchSpecification__ConditionAssignment_5_1 ) ) ;
    public final void rule__BranchSpecification__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3258:1: ( ( ( rule__BranchSpecification__ConditionAssignment_5_1 ) ) )
            // InternalCOV.g:3259:1: ( ( rule__BranchSpecification__ConditionAssignment_5_1 ) )
            {
            // InternalCOV.g:3259:1: ( ( rule__BranchSpecification__ConditionAssignment_5_1 ) )
            // InternalCOV.g:3260:2: ( rule__BranchSpecification__ConditionAssignment_5_1 )
            {
             before(grammarAccess.getBranchSpecificationAccess().getConditionAssignment_5_1()); 
            // InternalCOV.g:3261:2: ( rule__BranchSpecification__ConditionAssignment_5_1 )
            // InternalCOV.g:3261:3: rule__BranchSpecification__ConditionAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__BranchSpecification__ConditionAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getBranchSpecificationAccess().getConditionAssignment_5_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__BranchSpecification__Group_7__0"
    // InternalCOV.g:3270:1: rule__BranchSpecification__Group_7__0 : rule__BranchSpecification__Group_7__0__Impl rule__BranchSpecification__Group_7__1 ;
    public final void rule__BranchSpecification__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3274:1: ( rule__BranchSpecification__Group_7__0__Impl rule__BranchSpecification__Group_7__1 )
            // InternalCOV.g:3275:2: rule__BranchSpecification__Group_7__0__Impl rule__BranchSpecification__Group_7__1
            {
            pushFollow(FOLLOW_27);
            rule__BranchSpecification__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BranchSpecification__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BranchSpecification__Group_7__0"


    // $ANTLR start "rule__BranchSpecification__Group_7__0__Impl"
    // InternalCOV.g:3282:1: rule__BranchSpecification__Group_7__0__Impl : ( ',' ) ;
    public final void rule__BranchSpecification__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3286:1: ( ( ',' ) )
            // InternalCOV.g:3287:1: ( ',' )
            {
            // InternalCOV.g:3287:1: ( ',' )
            // InternalCOV.g:3288:2: ','
            {
             before(grammarAccess.getBranchSpecificationAccess().getCommaKeyword_7_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getBranchSpecificationAccess().getCommaKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BranchSpecification__Group_7__0__Impl"


    // $ANTLR start "rule__BranchSpecification__Group_7__1"
    // InternalCOV.g:3297:1: rule__BranchSpecification__Group_7__1 : rule__BranchSpecification__Group_7__1__Impl ;
    public final void rule__BranchSpecification__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3301:1: ( rule__BranchSpecification__Group_7__1__Impl )
            // InternalCOV.g:3302:2: rule__BranchSpecification__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BranchSpecification__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BranchSpecification__Group_7__1"


    // $ANTLR start "rule__BranchSpecification__Group_7__1__Impl"
    // InternalCOV.g:3308:1: rule__BranchSpecification__Group_7__1__Impl : ( ( rule__BranchSpecification__BranchesAssignment_7_1 ) ) ;
    public final void rule__BranchSpecification__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3312:1: ( ( ( rule__BranchSpecification__BranchesAssignment_7_1 ) ) )
            // InternalCOV.g:3313:1: ( ( rule__BranchSpecification__BranchesAssignment_7_1 ) )
            {
            // InternalCOV.g:3313:1: ( ( rule__BranchSpecification__BranchesAssignment_7_1 ) )
            // InternalCOV.g:3314:2: ( rule__BranchSpecification__BranchesAssignment_7_1 )
            {
             before(grammarAccess.getBranchSpecificationAccess().getBranchesAssignment_7_1()); 
            // InternalCOV.g:3315:2: ( rule__BranchSpecification__BranchesAssignment_7_1 )
            // InternalCOV.g:3315:3: rule__BranchSpecification__BranchesAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__BranchSpecification__BranchesAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getBranchSpecificationAccess().getBranchesAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BranchSpecification__Group_7__1__Impl"


    // $ANTLR start "rule__Branch__Group__0"
    // InternalCOV.g:3324:1: rule__Branch__Group__0 : rule__Branch__Group__0__Impl rule__Branch__Group__1 ;
    public final void rule__Branch__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3328:1: ( rule__Branch__Group__0__Impl rule__Branch__Group__1 )
            // InternalCOV.g:3329:2: rule__Branch__Group__0__Impl rule__Branch__Group__1
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
    // InternalCOV.g:3336:1: rule__Branch__Group__0__Impl : ( 'queryBranch' ) ;
    public final void rule__Branch__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3340:1: ( ( 'queryBranch' ) )
            // InternalCOV.g:3341:1: ( 'queryBranch' )
            {
            // InternalCOV.g:3341:1: ( 'queryBranch' )
            // InternalCOV.g:3342:2: 'queryBranch'
            {
             before(grammarAccess.getBranchAccess().getQueryBranchKeyword_0()); 
            match(input,39,FOLLOW_2); 
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
    // InternalCOV.g:3351:1: rule__Branch__Group__1 : rule__Branch__Group__1__Impl ;
    public final void rule__Branch__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3355:1: ( rule__Branch__Group__1__Impl )
            // InternalCOV.g:3356:2: rule__Branch__Group__1__Impl
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
    // InternalCOV.g:3362:1: rule__Branch__Group__1__Impl : ( ( rule__Branch__OCLQueryAssignment_1 ) ) ;
    public final void rule__Branch__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3366:1: ( ( ( rule__Branch__OCLQueryAssignment_1 ) ) )
            // InternalCOV.g:3367:1: ( ( rule__Branch__OCLQueryAssignment_1 ) )
            {
            // InternalCOV.g:3367:1: ( ( rule__Branch__OCLQueryAssignment_1 ) )
            // InternalCOV.g:3368:2: ( rule__Branch__OCLQueryAssignment_1 )
            {
             before(grammarAccess.getBranchAccess().getOCLQueryAssignment_1()); 
            // InternalCOV.g:3369:2: ( rule__Branch__OCLQueryAssignment_1 )
            // InternalCOV.g:3369:3: rule__Branch__OCLQueryAssignment_1
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
    // InternalCOV.g:3378:1: rule__DomainSpecificCoverage__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__DomainSpecificCoverage__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3382:1: ( ( ruleEString ) )
            // InternalCOV.g:3383:2: ( ruleEString )
            {
            // InternalCOV.g:3383:2: ( ruleEString )
            // InternalCOV.g:3384:3: ruleEString
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
    // InternalCOV.g:3393:1: rule__DomainSpecificCoverage__MetamodelAssignment_5 : ( ( ruleEString ) ) ;
    public final void rule__DomainSpecificCoverage__MetamodelAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3397:1: ( ( ( ruleEString ) ) )
            // InternalCOV.g:3398:2: ( ( ruleEString ) )
            {
            // InternalCOV.g:3398:2: ( ( ruleEString ) )
            // InternalCOV.g:3399:3: ( ruleEString )
            {
             before(grammarAccess.getDomainSpecificCoverageAccess().getMetamodelEPackageCrossReference_5_0()); 
            // InternalCOV.g:3400:3: ( ruleEString )
            // InternalCOV.g:3401:4: ruleEString
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


    // $ANTLR start "rule__DomainSpecificCoverage__CoverageMetricsAssignment_6"
    // InternalCOV.g:3412:1: rule__DomainSpecificCoverage__CoverageMetricsAssignment_6 : ( ruleCoverageMetric ) ;
    public final void rule__DomainSpecificCoverage__CoverageMetricsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3416:1: ( ( ruleCoverageMetric ) )
            // InternalCOV.g:3417:2: ( ruleCoverageMetric )
            {
            // InternalCOV.g:3417:2: ( ruleCoverageMetric )
            // InternalCOV.g:3418:3: ruleCoverageMetric
            {
             before(grammarAccess.getDomainSpecificCoverageAccess().getCoverageMetricsCoverageMetricParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleCoverageMetric();

            state._fsp--;

             after(grammarAccess.getDomainSpecificCoverageAccess().getCoverageMetricsCoverageMetricParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DomainSpecificCoverage__CoverageMetricsAssignment_6"


    // $ANTLR start "rule__DomainSpecificCoverage__CoverageMetricsAssignment_7_1"
    // InternalCOV.g:3427:1: rule__DomainSpecificCoverage__CoverageMetricsAssignment_7_1 : ( ruleCoverageMetric ) ;
    public final void rule__DomainSpecificCoverage__CoverageMetricsAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3431:1: ( ( ruleCoverageMetric ) )
            // InternalCOV.g:3432:2: ( ruleCoverageMetric )
            {
            // InternalCOV.g:3432:2: ( ruleCoverageMetric )
            // InternalCOV.g:3433:3: ruleCoverageMetric
            {
             before(grammarAccess.getDomainSpecificCoverageAccess().getCoverageMetricsCoverageMetricParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCoverageMetric();

            state._fsp--;

             after(grammarAccess.getDomainSpecificCoverageAccess().getCoverageMetricsCoverageMetricParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DomainSpecificCoverage__CoverageMetricsAssignment_7_1"


    // $ANTLR start "rule__ModelElementCoverage__ContextsAssignment_2"
    // InternalCOV.g:3442:1: rule__ModelElementCoverage__ContextsAssignment_2 : ( ruleContext ) ;
    public final void rule__ModelElementCoverage__ContextsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3446:1: ( ( ruleContext ) )
            // InternalCOV.g:3447:2: ( ruleContext )
            {
            // InternalCOV.g:3447:2: ( ruleContext )
            // InternalCOV.g:3448:3: ruleContext
            {
             before(grammarAccess.getModelElementCoverageAccess().getContextsContextParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleContext();

            state._fsp--;

             after(grammarAccess.getModelElementCoverageAccess().getContextsContextParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelElementCoverage__ContextsAssignment_2"


    // $ANTLR start "rule__ModelElementCoverage__ContextsAssignment_3_1"
    // InternalCOV.g:3457:1: rule__ModelElementCoverage__ContextsAssignment_3_1 : ( ruleContext ) ;
    public final void rule__ModelElementCoverage__ContextsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3461:1: ( ( ruleContext ) )
            // InternalCOV.g:3462:2: ( ruleContext )
            {
            // InternalCOV.g:3462:2: ( ruleContext )
            // InternalCOV.g:3463:3: ruleContext
            {
             before(grammarAccess.getModelElementCoverageAccess().getContextsContextParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleContext();

            state._fsp--;

             after(grammarAccess.getModelElementCoverageAccess().getContextsContextParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelElementCoverage__ContextsAssignment_3_1"


    // $ANTLR start "rule__BranchCoverage__ContextsAssignment_2_0"
    // InternalCOV.g:3472:1: rule__BranchCoverage__ContextsAssignment_2_0 : ( ruleContext ) ;
    public final void rule__BranchCoverage__ContextsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3476:1: ( ( ruleContext ) )
            // InternalCOV.g:3477:2: ( ruleContext )
            {
            // InternalCOV.g:3477:2: ( ruleContext )
            // InternalCOV.g:3478:3: ruleContext
            {
             before(grammarAccess.getBranchCoverageAccess().getContextsContextParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleContext();

            state._fsp--;

             after(grammarAccess.getBranchCoverageAccess().getContextsContextParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BranchCoverage__ContextsAssignment_2_0"


    // $ANTLR start "rule__BranchCoverage__ContextsAssignment_2_1_1"
    // InternalCOV.g:3487:1: rule__BranchCoverage__ContextsAssignment_2_1_1 : ( ruleContext ) ;
    public final void rule__BranchCoverage__ContextsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3491:1: ( ( ruleContext ) )
            // InternalCOV.g:3492:2: ( ruleContext )
            {
            // InternalCOV.g:3492:2: ( ruleContext )
            // InternalCOV.g:3493:3: ruleContext
            {
             before(grammarAccess.getBranchCoverageAccess().getContextsContextParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleContext();

            state._fsp--;

             after(grammarAccess.getBranchCoverageAccess().getContextsContextParserRuleCall_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BranchCoverage__ContextsAssignment_2_1_1"


    // $ANTLR start "rule__BranchCoverage__BranchSpecificationsAssignment_3"
    // InternalCOV.g:3502:1: rule__BranchCoverage__BranchSpecificationsAssignment_3 : ( ruleBranchSpecification ) ;
    public final void rule__BranchCoverage__BranchSpecificationsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3506:1: ( ( ruleBranchSpecification ) )
            // InternalCOV.g:3507:2: ( ruleBranchSpecification )
            {
            // InternalCOV.g:3507:2: ( ruleBranchSpecification )
            // InternalCOV.g:3508:3: ruleBranchSpecification
            {
             before(grammarAccess.getBranchCoverageAccess().getBranchSpecificationsBranchSpecificationParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleBranchSpecification();

            state._fsp--;

             after(grammarAccess.getBranchCoverageAccess().getBranchSpecificationsBranchSpecificationParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BranchCoverage__BranchSpecificationsAssignment_3"


    // $ANTLR start "rule__BranchCoverage__BranchSpecificationsAssignment_4_1"
    // InternalCOV.g:3517:1: rule__BranchCoverage__BranchSpecificationsAssignment_4_1 : ( ruleBranchSpecification ) ;
    public final void rule__BranchCoverage__BranchSpecificationsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3521:1: ( ( ruleBranchSpecification ) )
            // InternalCOV.g:3522:2: ( ruleBranchSpecification )
            {
            // InternalCOV.g:3522:2: ( ruleBranchSpecification )
            // InternalCOV.g:3523:3: ruleBranchSpecification
            {
             before(grammarAccess.getBranchCoverageAccess().getBranchSpecificationsBranchSpecificationParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBranchSpecification();

            state._fsp--;

             after(grammarAccess.getBranchCoverageAccess().getBranchSpecificationsBranchSpecificationParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BranchCoverage__BranchSpecificationsAssignment_4_1"


    // $ANTLR start "rule__Context__MetaclassAssignment_1"
    // InternalCOV.g:3532:1: rule__Context__MetaclassAssignment_1 : ( ( ruleEString ) ) ;
    public final void rule__Context__MetaclassAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3536:1: ( ( ( ruleEString ) ) )
            // InternalCOV.g:3537:2: ( ( ruleEString ) )
            {
            // InternalCOV.g:3537:2: ( ( ruleEString ) )
            // InternalCOV.g:3538:3: ( ruleEString )
            {
             before(grammarAccess.getContextAccess().getMetaclassEClassCrossReference_1_0()); 
            // InternalCOV.g:3539:3: ( ruleEString )
            // InternalCOV.g:3540:4: ruleEString
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
    // InternalCOV.g:3551:1: rule__Context__RulesAssignment_3_0 : ( ruleRule ) ;
    public final void rule__Context__RulesAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3555:1: ( ( ruleRule ) )
            // InternalCOV.g:3556:2: ( ruleRule )
            {
            // InternalCOV.g:3556:2: ( ruleRule )
            // InternalCOV.g:3557:3: ruleRule
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
    // InternalCOV.g:3566:1: rule__Context__RulesAssignment_3_1_1 : ( ruleRule ) ;
    public final void rule__Context__RulesAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3570:1: ( ( ruleRule ) )
            // InternalCOV.g:3571:2: ( ruleRule )
            {
            // InternalCOV.g:3571:2: ( ruleRule )
            // InternalCOV.g:3572:3: ruleRule
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
    // InternalCOV.g:3581:1: rule__Ignore__IgnoreSubtypesAssignment_3_1 : ( ruleEBoolean ) ;
    public final void rule__Ignore__IgnoreSubtypesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3585:1: ( ( ruleEBoolean ) )
            // InternalCOV.g:3586:2: ( ruleEBoolean )
            {
            // InternalCOV.g:3586:2: ( ruleEBoolean )
            // InternalCOV.g:3587:3: ruleEBoolean
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
    // InternalCOV.g:3596:1: rule__Ignore__DescriptionAssignment_5_1 : ( ruleEString ) ;
    public final void rule__Ignore__DescriptionAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3600:1: ( ( ruleEString ) )
            // InternalCOV.g:3601:2: ( ruleEString )
            {
            // InternalCOV.g:3601:2: ( ruleEString )
            // InternalCOV.g:3602:3: ruleEString
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
    // InternalCOV.g:3611:1: rule__Ignore__ConditionAssignment_6_1 : ( ruleCondition ) ;
    public final void rule__Ignore__ConditionAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3615:1: ( ( ruleCondition ) )
            // InternalCOV.g:3616:2: ( ruleCondition )
            {
            // InternalCOV.g:3616:2: ( ruleCondition )
            // InternalCOV.g:3617:3: ruleCondition
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
    // InternalCOV.g:3626:1: rule__LimitedIgnore__TypeAssignment_1 : ( ruleLimitationType ) ;
    public final void rule__LimitedIgnore__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3630:1: ( ( ruleLimitationType ) )
            // InternalCOV.g:3631:2: ( ruleLimitationType )
            {
            // InternalCOV.g:3631:2: ( ruleLimitationType )
            // InternalCOV.g:3632:3: ruleLimitationType
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
    // InternalCOV.g:3641:1: rule__LimitedIgnore__ContainerMetaclassAssignment_2 : ( ( ruleEString ) ) ;
    public final void rule__LimitedIgnore__ContainerMetaclassAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3645:1: ( ( ( ruleEString ) ) )
            // InternalCOV.g:3646:2: ( ( ruleEString ) )
            {
            // InternalCOV.g:3646:2: ( ( ruleEString ) )
            // InternalCOV.g:3647:3: ( ruleEString )
            {
             before(grammarAccess.getLimitedIgnoreAccess().getContainerMetaclassEClassCrossReference_2_0()); 
            // InternalCOV.g:3648:3: ( ruleEString )
            // InternalCOV.g:3649:4: ruleEString
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
    // InternalCOV.g:3660:1: rule__LimitedIgnore__ContainerMetaclassAssignment_3_1 : ( ( ruleEString ) ) ;
    public final void rule__LimitedIgnore__ContainerMetaclassAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3664:1: ( ( ( ruleEString ) ) )
            // InternalCOV.g:3665:2: ( ( ruleEString ) )
            {
            // InternalCOV.g:3665:2: ( ( ruleEString ) )
            // InternalCOV.g:3666:3: ( ruleEString )
            {
             before(grammarAccess.getLimitedIgnoreAccess().getContainerMetaclassEClassCrossReference_3_1_0()); 
            // InternalCOV.g:3667:3: ( ruleEString )
            // InternalCOV.g:3668:4: ruleEString
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
    // InternalCOV.g:3679:1: rule__LimitedIgnore__DescriptionAssignment_4_1 : ( ruleEString ) ;
    public final void rule__LimitedIgnore__DescriptionAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3683:1: ( ( ruleEString ) )
            // InternalCOV.g:3684:2: ( ruleEString )
            {
            // InternalCOV.g:3684:2: ( ruleEString )
            // InternalCOV.g:3685:3: ruleEString
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
    // InternalCOV.g:3694:1: rule__LimitedIgnore__ConditionAssignment_5_1 : ( ruleCondition ) ;
    public final void rule__LimitedIgnore__ConditionAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3698:1: ( ( ruleCondition ) )
            // InternalCOV.g:3699:2: ( ruleCondition )
            {
            // InternalCOV.g:3699:2: ( ruleCondition )
            // InternalCOV.g:3700:3: ruleCondition
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
    // InternalCOV.g:3709:1: rule__CoverageOfReferenced__ReferenceAssignment_1 : ( ( ruleEString ) ) ;
    public final void rule__CoverageOfReferenced__ReferenceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3713:1: ( ( ( ruleEString ) ) )
            // InternalCOV.g:3714:2: ( ( ruleEString ) )
            {
            // InternalCOV.g:3714:2: ( ( ruleEString ) )
            // InternalCOV.g:3715:3: ( ruleEString )
            {
             before(grammarAccess.getCoverageOfReferencedAccess().getReferenceEReferenceCrossReference_1_0()); 
            // InternalCOV.g:3716:3: ( ruleEString )
            // InternalCOV.g:3717:4: ruleEString
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
    // InternalCOV.g:3728:1: rule__CoverageOfReferenced__ReferenceAssignment_2_1 : ( ( ruleEString ) ) ;
    public final void rule__CoverageOfReferenced__ReferenceAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3732:1: ( ( ( ruleEString ) ) )
            // InternalCOV.g:3733:2: ( ( ruleEString ) )
            {
            // InternalCOV.g:3733:2: ( ( ruleEString ) )
            // InternalCOV.g:3734:3: ( ruleEString )
            {
             before(grammarAccess.getCoverageOfReferencedAccess().getReferenceEReferenceCrossReference_2_1_0()); 
            // InternalCOV.g:3735:3: ( ruleEString )
            // InternalCOV.g:3736:4: ruleEString
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
    // InternalCOV.g:3747:1: rule__CoverageOfReferenced__DescriptionAssignment_3_1 : ( ruleEString ) ;
    public final void rule__CoverageOfReferenced__DescriptionAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3751:1: ( ( ruleEString ) )
            // InternalCOV.g:3752:2: ( ruleEString )
            {
            // InternalCOV.g:3752:2: ( ruleEString )
            // InternalCOV.g:3753:3: ruleEString
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
    // InternalCOV.g:3762:1: rule__CoverageOfReferenced__ConditionAssignment_4_1 : ( ruleCondition ) ;
    public final void rule__CoverageOfReferenced__ConditionAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3766:1: ( ( ruleCondition ) )
            // InternalCOV.g:3767:2: ( ruleCondition )
            {
            // InternalCOV.g:3767:2: ( ruleCondition )
            // InternalCOV.g:3768:3: ruleCondition
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
    // InternalCOV.g:3777:1: rule__CoverageByContent__MultiplicityAssignment_2 : ( ruleCoveredContents ) ;
    public final void rule__CoverageByContent__MultiplicityAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3781:1: ( ( ruleCoveredContents ) )
            // InternalCOV.g:3782:2: ( ruleCoveredContents )
            {
            // InternalCOV.g:3782:2: ( ruleCoveredContents )
            // InternalCOV.g:3783:3: ruleCoveredContents
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
    // InternalCOV.g:3792:1: rule__CoverageByContent__ContainmentReferenceAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__CoverageByContent__ContainmentReferenceAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3796:1: ( ( ( ruleEString ) ) )
            // InternalCOV.g:3797:2: ( ( ruleEString ) )
            {
            // InternalCOV.g:3797:2: ( ( ruleEString ) )
            // InternalCOV.g:3798:3: ( ruleEString )
            {
             before(grammarAccess.getCoverageByContentAccess().getContainmentReferenceEReferenceCrossReference_3_0()); 
            // InternalCOV.g:3799:3: ( ruleEString )
            // InternalCOV.g:3800:4: ruleEString
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
    // InternalCOV.g:3811:1: rule__CoverageByContent__DescriptionAssignment_5_1 : ( ruleEString ) ;
    public final void rule__CoverageByContent__DescriptionAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3815:1: ( ( ruleEString ) )
            // InternalCOV.g:3816:2: ( ruleEString )
            {
            // InternalCOV.g:3816:2: ( ruleEString )
            // InternalCOV.g:3817:3: ruleEString
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
    // InternalCOV.g:3826:1: rule__CoverageByContent__ConditionAssignment_6_1 : ( ruleCondition ) ;
    public final void rule__CoverageByContent__ConditionAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3830:1: ( ( ruleCondition ) )
            // InternalCOV.g:3831:2: ( ruleCondition )
            {
            // InternalCOV.g:3831:2: ( ruleCondition )
            // InternalCOV.g:3832:3: ruleCondition
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
    // InternalCOV.g:3841:1: rule__BranchSpecification__DescriptionAssignment_3_1 : ( ruleEString ) ;
    public final void rule__BranchSpecification__DescriptionAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3845:1: ( ( ruleEString ) )
            // InternalCOV.g:3846:2: ( ruleEString )
            {
            // InternalCOV.g:3846:2: ( ruleEString )
            // InternalCOV.g:3847:3: ruleEString
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


    // $ANTLR start "rule__BranchSpecification__ContextAssignment_4"
    // InternalCOV.g:3856:1: rule__BranchSpecification__ContextAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__BranchSpecification__ContextAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3860:1: ( ( ( ruleEString ) ) )
            // InternalCOV.g:3861:2: ( ( ruleEString ) )
            {
            // InternalCOV.g:3861:2: ( ( ruleEString ) )
            // InternalCOV.g:3862:3: ( ruleEString )
            {
             before(grammarAccess.getBranchSpecificationAccess().getContextEClassCrossReference_4_0()); 
            // InternalCOV.g:3863:3: ( ruleEString )
            // InternalCOV.g:3864:4: ruleEString
            {
             before(grammarAccess.getBranchSpecificationAccess().getContextEClassEStringParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBranchSpecificationAccess().getContextEClassEStringParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getBranchSpecificationAccess().getContextEClassCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BranchSpecification__ContextAssignment_4"


    // $ANTLR start "rule__BranchSpecification__ConditionAssignment_5_1"
    // InternalCOV.g:3875:1: rule__BranchSpecification__ConditionAssignment_5_1 : ( ruleCondition ) ;
    public final void rule__BranchSpecification__ConditionAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3879:1: ( ( ruleCondition ) )
            // InternalCOV.g:3880:2: ( ruleCondition )
            {
            // InternalCOV.g:3880:2: ( ruleCondition )
            // InternalCOV.g:3881:3: ruleCondition
            {
             before(grammarAccess.getBranchSpecificationAccess().getConditionConditionParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getBranchSpecificationAccess().getConditionConditionParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BranchSpecification__ConditionAssignment_5_1"


    // $ANTLR start "rule__BranchSpecification__BranchesAssignment_6"
    // InternalCOV.g:3890:1: rule__BranchSpecification__BranchesAssignment_6 : ( ruleBranch ) ;
    public final void rule__BranchSpecification__BranchesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3894:1: ( ( ruleBranch ) )
            // InternalCOV.g:3895:2: ( ruleBranch )
            {
            // InternalCOV.g:3895:2: ( ruleBranch )
            // InternalCOV.g:3896:3: ruleBranch
            {
             before(grammarAccess.getBranchSpecificationAccess().getBranchesBranchParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleBranch();

            state._fsp--;

             after(grammarAccess.getBranchSpecificationAccess().getBranchesBranchParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BranchSpecification__BranchesAssignment_6"


    // $ANTLR start "rule__BranchSpecification__BranchesAssignment_7_1"
    // InternalCOV.g:3905:1: rule__BranchSpecification__BranchesAssignment_7_1 : ( ruleBranch ) ;
    public final void rule__BranchSpecification__BranchesAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3909:1: ( ( ruleBranch ) )
            // InternalCOV.g:3910:2: ( ruleBranch )
            {
            // InternalCOV.g:3910:2: ( ruleBranch )
            // InternalCOV.g:3911:3: ruleBranch
            {
             before(grammarAccess.getBranchSpecificationAccess().getBranchesBranchParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBranch();

            state._fsp--;

             after(grammarAccess.getBranchSpecificationAccess().getBranchesBranchParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BranchSpecification__BranchesAssignment_7_1"


    // $ANTLR start "rule__Branch__OCLQueryAssignment_1"
    // InternalCOV.g:3920:1: rule__Branch__OCLQueryAssignment_1 : ( ruleEString ) ;
    public final void rule__Branch__OCLQueryAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3924:1: ( ( ruleEString ) )
            // InternalCOV.g:3925:2: ( ruleEString )
            {
            // InternalCOV.g:3925:2: ( ruleEString )
            // InternalCOV.g:3926:3: ruleEString
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
    // InternalCOV.g:3935:1: rule__Condition__OCLConstraintAssignment : ( ruleEString ) ;
    public final void rule__Condition__OCLConstraintAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3939:1: ( ( ruleEString ) )
            // InternalCOV.g:3940:2: ( ruleEString )
            {
            // InternalCOV.g:3940:2: ( ruleEString )
            // InternalCOV.g:3941:3: ruleEString
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
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000002002000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000704200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000704000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00000000C0400000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000040000030L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000008080000000L});

}