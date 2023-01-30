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
    // InternalCOV.g:501:1: rule__Rule__Alternatives : ( ( ruleIgnore ) | ( ruleCoverageOfReferenced ) | ( ruleCoverageByContent ) | ( ruleLimitedIgnore ) | ( ruleBranchSpecification ) );
    public final void rule__Rule__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:505:1: ( ( ruleIgnore ) | ( ruleCoverageOfReferenced ) | ( ruleCoverageByContent ) | ( ruleLimitedIgnore ) | ( ruleBranchSpecification ) )
            int alt3=5;
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
            case 37:
                {
                alt3=5;
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
                case 5 :
                    // InternalCOV.g:530:2: ( ruleBranchSpecification )
                    {
                    // InternalCOV.g:530:2: ( ruleBranchSpecification )
                    // InternalCOV.g:531:3: ruleBranchSpecification
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
    // InternalCOV.g:540:1: rule__EBoolean__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__EBoolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:544:1: ( ( 'true' ) | ( 'false' ) )
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
                    // InternalCOV.g:545:2: ( 'true' )
                    {
                    // InternalCOV.g:545:2: ( 'true' )
                    // InternalCOV.g:546:3: 'true'
                    {
                     before(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCOV.g:551:2: ( 'false' )
                    {
                    // InternalCOV.g:551:2: ( 'false' )
                    // InternalCOV.g:552:3: 'false'
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
    // InternalCOV.g:561:1: rule__CoveredContents__Alternatives : ( ( ( 'ALL' ) ) | ( ( 'ONE' ) ) );
    public final void rule__CoveredContents__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:565:1: ( ( ( 'ALL' ) ) | ( ( 'ONE' ) ) )
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
                    // InternalCOV.g:566:2: ( ( 'ALL' ) )
                    {
                    // InternalCOV.g:566:2: ( ( 'ALL' ) )
                    // InternalCOV.g:567:3: ( 'ALL' )
                    {
                     before(grammarAccess.getCoveredContentsAccess().getALLEnumLiteralDeclaration_0()); 
                    // InternalCOV.g:568:3: ( 'ALL' )
                    // InternalCOV.g:568:4: 'ALL'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getCoveredContentsAccess().getALLEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCOV.g:572:2: ( ( 'ONE' ) )
                    {
                    // InternalCOV.g:572:2: ( ( 'ONE' ) )
                    // InternalCOV.g:573:3: ( 'ONE' )
                    {
                     before(grammarAccess.getCoveredContentsAccess().getONEEnumLiteralDeclaration_1()); 
                    // InternalCOV.g:574:3: ( 'ONE' )
                    // InternalCOV.g:574:4: 'ONE'
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
    // InternalCOV.g:582:1: rule__LimitationType__Alternatives : ( ( ( 'containedBy' ) ) | ( ( 'notContainedBy' ) ) );
    public final void rule__LimitationType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:586:1: ( ( ( 'containedBy' ) ) | ( ( 'notContainedBy' ) ) )
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
                    // InternalCOV.g:587:2: ( ( 'containedBy' ) )
                    {
                    // InternalCOV.g:587:2: ( ( 'containedBy' ) )
                    // InternalCOV.g:588:3: ( 'containedBy' )
                    {
                     before(grammarAccess.getLimitationTypeAccess().getContainedByEnumLiteralDeclaration_0()); 
                    // InternalCOV.g:589:3: ( 'containedBy' )
                    // InternalCOV.g:589:4: 'containedBy'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getLimitationTypeAccess().getContainedByEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCOV.g:593:2: ( ( 'notContainedBy' ) )
                    {
                    // InternalCOV.g:593:2: ( ( 'notContainedBy' ) )
                    // InternalCOV.g:594:3: ( 'notContainedBy' )
                    {
                     before(grammarAccess.getLimitationTypeAccess().getNotContainedByEnumLiteralDeclaration_1()); 
                    // InternalCOV.g:595:3: ( 'notContainedBy' )
                    // InternalCOV.g:595:4: 'notContainedBy'
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
    // InternalCOV.g:603:1: rule__DomainSpecificCoverage__Group__0 : rule__DomainSpecificCoverage__Group__0__Impl rule__DomainSpecificCoverage__Group__1 ;
    public final void rule__DomainSpecificCoverage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:607:1: ( rule__DomainSpecificCoverage__Group__0__Impl rule__DomainSpecificCoverage__Group__1 )
            // InternalCOV.g:608:2: rule__DomainSpecificCoverage__Group__0__Impl rule__DomainSpecificCoverage__Group__1
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
    // InternalCOV.g:615:1: rule__DomainSpecificCoverage__Group__0__Impl : ( 'ruleset' ) ;
    public final void rule__DomainSpecificCoverage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:619:1: ( ( 'ruleset' ) )
            // InternalCOV.g:620:1: ( 'ruleset' )
            {
            // InternalCOV.g:620:1: ( 'ruleset' )
            // InternalCOV.g:621:2: 'ruleset'
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
    // InternalCOV.g:630:1: rule__DomainSpecificCoverage__Group__1 : rule__DomainSpecificCoverage__Group__1__Impl rule__DomainSpecificCoverage__Group__2 ;
    public final void rule__DomainSpecificCoverage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:634:1: ( rule__DomainSpecificCoverage__Group__1__Impl rule__DomainSpecificCoverage__Group__2 )
            // InternalCOV.g:635:2: rule__DomainSpecificCoverage__Group__1__Impl rule__DomainSpecificCoverage__Group__2
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
    // InternalCOV.g:642:1: rule__DomainSpecificCoverage__Group__1__Impl : ( ( rule__DomainSpecificCoverage__NameAssignment_1 ) ) ;
    public final void rule__DomainSpecificCoverage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:646:1: ( ( ( rule__DomainSpecificCoverage__NameAssignment_1 ) ) )
            // InternalCOV.g:647:1: ( ( rule__DomainSpecificCoverage__NameAssignment_1 ) )
            {
            // InternalCOV.g:647:1: ( ( rule__DomainSpecificCoverage__NameAssignment_1 ) )
            // InternalCOV.g:648:2: ( rule__DomainSpecificCoverage__NameAssignment_1 )
            {
             before(grammarAccess.getDomainSpecificCoverageAccess().getNameAssignment_1()); 
            // InternalCOV.g:649:2: ( rule__DomainSpecificCoverage__NameAssignment_1 )
            // InternalCOV.g:649:3: rule__DomainSpecificCoverage__NameAssignment_1
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
    // InternalCOV.g:657:1: rule__DomainSpecificCoverage__Group__2 : rule__DomainSpecificCoverage__Group__2__Impl rule__DomainSpecificCoverage__Group__3 ;
    public final void rule__DomainSpecificCoverage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:661:1: ( rule__DomainSpecificCoverage__Group__2__Impl rule__DomainSpecificCoverage__Group__3 )
            // InternalCOV.g:662:2: rule__DomainSpecificCoverage__Group__2__Impl rule__DomainSpecificCoverage__Group__3
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
    // InternalCOV.g:669:1: rule__DomainSpecificCoverage__Group__2__Impl : ( '{' ) ;
    public final void rule__DomainSpecificCoverage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:673:1: ( ( '{' ) )
            // InternalCOV.g:674:1: ( '{' )
            {
            // InternalCOV.g:674:1: ( '{' )
            // InternalCOV.g:675:2: '{'
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
    // InternalCOV.g:684:1: rule__DomainSpecificCoverage__Group__3 : rule__DomainSpecificCoverage__Group__3__Impl rule__DomainSpecificCoverage__Group__4 ;
    public final void rule__DomainSpecificCoverage__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:688:1: ( rule__DomainSpecificCoverage__Group__3__Impl rule__DomainSpecificCoverage__Group__4 )
            // InternalCOV.g:689:2: rule__DomainSpecificCoverage__Group__3__Impl rule__DomainSpecificCoverage__Group__4
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
    // InternalCOV.g:696:1: rule__DomainSpecificCoverage__Group__3__Impl : ( 'import' ) ;
    public final void rule__DomainSpecificCoverage__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:700:1: ( ( 'import' ) )
            // InternalCOV.g:701:1: ( 'import' )
            {
            // InternalCOV.g:701:1: ( 'import' )
            // InternalCOV.g:702:2: 'import'
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
    // InternalCOV.g:711:1: rule__DomainSpecificCoverage__Group__4 : rule__DomainSpecificCoverage__Group__4__Impl rule__DomainSpecificCoverage__Group__5 ;
    public final void rule__DomainSpecificCoverage__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:715:1: ( rule__DomainSpecificCoverage__Group__4__Impl rule__DomainSpecificCoverage__Group__5 )
            // InternalCOV.g:716:2: rule__DomainSpecificCoverage__Group__4__Impl rule__DomainSpecificCoverage__Group__5
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
    // InternalCOV.g:723:1: rule__DomainSpecificCoverage__Group__4__Impl : ( 'metamodel' ) ;
    public final void rule__DomainSpecificCoverage__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:727:1: ( ( 'metamodel' ) )
            // InternalCOV.g:728:1: ( 'metamodel' )
            {
            // InternalCOV.g:728:1: ( 'metamodel' )
            // InternalCOV.g:729:2: 'metamodel'
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
    // InternalCOV.g:738:1: rule__DomainSpecificCoverage__Group__5 : rule__DomainSpecificCoverage__Group__5__Impl rule__DomainSpecificCoverage__Group__6 ;
    public final void rule__DomainSpecificCoverage__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:742:1: ( rule__DomainSpecificCoverage__Group__5__Impl rule__DomainSpecificCoverage__Group__6 )
            // InternalCOV.g:743:2: rule__DomainSpecificCoverage__Group__5__Impl rule__DomainSpecificCoverage__Group__6
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
    // InternalCOV.g:750:1: rule__DomainSpecificCoverage__Group__5__Impl : ( ( rule__DomainSpecificCoverage__MetamodelAssignment_5 ) ) ;
    public final void rule__DomainSpecificCoverage__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:754:1: ( ( ( rule__DomainSpecificCoverage__MetamodelAssignment_5 ) ) )
            // InternalCOV.g:755:1: ( ( rule__DomainSpecificCoverage__MetamodelAssignment_5 ) )
            {
            // InternalCOV.g:755:1: ( ( rule__DomainSpecificCoverage__MetamodelAssignment_5 ) )
            // InternalCOV.g:756:2: ( rule__DomainSpecificCoverage__MetamodelAssignment_5 )
            {
             before(grammarAccess.getDomainSpecificCoverageAccess().getMetamodelAssignment_5()); 
            // InternalCOV.g:757:2: ( rule__DomainSpecificCoverage__MetamodelAssignment_5 )
            // InternalCOV.g:757:3: rule__DomainSpecificCoverage__MetamodelAssignment_5
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
    // InternalCOV.g:765:1: rule__DomainSpecificCoverage__Group__6 : rule__DomainSpecificCoverage__Group__6__Impl rule__DomainSpecificCoverage__Group__7 ;
    public final void rule__DomainSpecificCoverage__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:769:1: ( rule__DomainSpecificCoverage__Group__6__Impl rule__DomainSpecificCoverage__Group__7 )
            // InternalCOV.g:770:2: rule__DomainSpecificCoverage__Group__6__Impl rule__DomainSpecificCoverage__Group__7
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
    // InternalCOV.g:777:1: rule__DomainSpecificCoverage__Group__6__Impl : ( ( rule__DomainSpecificCoverage__CoverageMetricsAssignment_6 ) ) ;
    public final void rule__DomainSpecificCoverage__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:781:1: ( ( ( rule__DomainSpecificCoverage__CoverageMetricsAssignment_6 ) ) )
            // InternalCOV.g:782:1: ( ( rule__DomainSpecificCoverage__CoverageMetricsAssignment_6 ) )
            {
            // InternalCOV.g:782:1: ( ( rule__DomainSpecificCoverage__CoverageMetricsAssignment_6 ) )
            // InternalCOV.g:783:2: ( rule__DomainSpecificCoverage__CoverageMetricsAssignment_6 )
            {
             before(grammarAccess.getDomainSpecificCoverageAccess().getCoverageMetricsAssignment_6()); 
            // InternalCOV.g:784:2: ( rule__DomainSpecificCoverage__CoverageMetricsAssignment_6 )
            // InternalCOV.g:784:3: rule__DomainSpecificCoverage__CoverageMetricsAssignment_6
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
    // InternalCOV.g:792:1: rule__DomainSpecificCoverage__Group__7 : rule__DomainSpecificCoverage__Group__7__Impl rule__DomainSpecificCoverage__Group__8 ;
    public final void rule__DomainSpecificCoverage__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:796:1: ( rule__DomainSpecificCoverage__Group__7__Impl rule__DomainSpecificCoverage__Group__8 )
            // InternalCOV.g:797:2: rule__DomainSpecificCoverage__Group__7__Impl rule__DomainSpecificCoverage__Group__8
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
    // InternalCOV.g:804:1: rule__DomainSpecificCoverage__Group__7__Impl : ( ( rule__DomainSpecificCoverage__Group_7__0 )* ) ;
    public final void rule__DomainSpecificCoverage__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:808:1: ( ( ( rule__DomainSpecificCoverage__Group_7__0 )* ) )
            // InternalCOV.g:809:1: ( ( rule__DomainSpecificCoverage__Group_7__0 )* )
            {
            // InternalCOV.g:809:1: ( ( rule__DomainSpecificCoverage__Group_7__0 )* )
            // InternalCOV.g:810:2: ( rule__DomainSpecificCoverage__Group_7__0 )*
            {
             before(grammarAccess.getDomainSpecificCoverageAccess().getGroup_7()); 
            // InternalCOV.g:811:2: ( rule__DomainSpecificCoverage__Group_7__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==22) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalCOV.g:811:3: rule__DomainSpecificCoverage__Group_7__0
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
    // InternalCOV.g:819:1: rule__DomainSpecificCoverage__Group__8 : rule__DomainSpecificCoverage__Group__8__Impl ;
    public final void rule__DomainSpecificCoverage__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:823:1: ( rule__DomainSpecificCoverage__Group__8__Impl )
            // InternalCOV.g:824:2: rule__DomainSpecificCoverage__Group__8__Impl
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
    // InternalCOV.g:830:1: rule__DomainSpecificCoverage__Group__8__Impl : ( '}' ) ;
    public final void rule__DomainSpecificCoverage__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:834:1: ( ( '}' ) )
            // InternalCOV.g:835:1: ( '}' )
            {
            // InternalCOV.g:835:1: ( '}' )
            // InternalCOV.g:836:2: '}'
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
    // InternalCOV.g:846:1: rule__DomainSpecificCoverage__Group_7__0 : rule__DomainSpecificCoverage__Group_7__0__Impl rule__DomainSpecificCoverage__Group_7__1 ;
    public final void rule__DomainSpecificCoverage__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:850:1: ( rule__DomainSpecificCoverage__Group_7__0__Impl rule__DomainSpecificCoverage__Group_7__1 )
            // InternalCOV.g:851:2: rule__DomainSpecificCoverage__Group_7__0__Impl rule__DomainSpecificCoverage__Group_7__1
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
    // InternalCOV.g:858:1: rule__DomainSpecificCoverage__Group_7__0__Impl : ( ',' ) ;
    public final void rule__DomainSpecificCoverage__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:862:1: ( ( ',' ) )
            // InternalCOV.g:863:1: ( ',' )
            {
            // InternalCOV.g:863:1: ( ',' )
            // InternalCOV.g:864:2: ','
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
    // InternalCOV.g:873:1: rule__DomainSpecificCoverage__Group_7__1 : rule__DomainSpecificCoverage__Group_7__1__Impl ;
    public final void rule__DomainSpecificCoverage__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:877:1: ( rule__DomainSpecificCoverage__Group_7__1__Impl )
            // InternalCOV.g:878:2: rule__DomainSpecificCoverage__Group_7__1__Impl
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
    // InternalCOV.g:884:1: rule__DomainSpecificCoverage__Group_7__1__Impl : ( ( rule__DomainSpecificCoverage__CoverageMetricsAssignment_7_1 ) ) ;
    public final void rule__DomainSpecificCoverage__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:888:1: ( ( ( rule__DomainSpecificCoverage__CoverageMetricsAssignment_7_1 ) ) )
            // InternalCOV.g:889:1: ( ( rule__DomainSpecificCoverage__CoverageMetricsAssignment_7_1 ) )
            {
            // InternalCOV.g:889:1: ( ( rule__DomainSpecificCoverage__CoverageMetricsAssignment_7_1 ) )
            // InternalCOV.g:890:2: ( rule__DomainSpecificCoverage__CoverageMetricsAssignment_7_1 )
            {
             before(grammarAccess.getDomainSpecificCoverageAccess().getCoverageMetricsAssignment_7_1()); 
            // InternalCOV.g:891:2: ( rule__DomainSpecificCoverage__CoverageMetricsAssignment_7_1 )
            // InternalCOV.g:891:3: rule__DomainSpecificCoverage__CoverageMetricsAssignment_7_1
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
    // InternalCOV.g:900:1: rule__ModelElementCoverage__Group__0 : rule__ModelElementCoverage__Group__0__Impl rule__ModelElementCoverage__Group__1 ;
    public final void rule__ModelElementCoverage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:904:1: ( rule__ModelElementCoverage__Group__0__Impl rule__ModelElementCoverage__Group__1 )
            // InternalCOV.g:905:2: rule__ModelElementCoverage__Group__0__Impl rule__ModelElementCoverage__Group__1
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
    // InternalCOV.g:912:1: rule__ModelElementCoverage__Group__0__Impl : ( 'ModelElementCoverageRuleset' ) ;
    public final void rule__ModelElementCoverage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:916:1: ( ( 'ModelElementCoverageRuleset' ) )
            // InternalCOV.g:917:1: ( 'ModelElementCoverageRuleset' )
            {
            // InternalCOV.g:917:1: ( 'ModelElementCoverageRuleset' )
            // InternalCOV.g:918:2: 'ModelElementCoverageRuleset'
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
    // InternalCOV.g:927:1: rule__ModelElementCoverage__Group__1 : rule__ModelElementCoverage__Group__1__Impl rule__ModelElementCoverage__Group__2 ;
    public final void rule__ModelElementCoverage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:931:1: ( rule__ModelElementCoverage__Group__1__Impl rule__ModelElementCoverage__Group__2 )
            // InternalCOV.g:932:2: rule__ModelElementCoverage__Group__1__Impl rule__ModelElementCoverage__Group__2
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
    // InternalCOV.g:939:1: rule__ModelElementCoverage__Group__1__Impl : ( '{' ) ;
    public final void rule__ModelElementCoverage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:943:1: ( ( '{' ) )
            // InternalCOV.g:944:1: ( '{' )
            {
            // InternalCOV.g:944:1: ( '{' )
            // InternalCOV.g:945:2: '{'
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
    // InternalCOV.g:954:1: rule__ModelElementCoverage__Group__2 : rule__ModelElementCoverage__Group__2__Impl rule__ModelElementCoverage__Group__3 ;
    public final void rule__ModelElementCoverage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:958:1: ( rule__ModelElementCoverage__Group__2__Impl rule__ModelElementCoverage__Group__3 )
            // InternalCOV.g:959:2: rule__ModelElementCoverage__Group__2__Impl rule__ModelElementCoverage__Group__3
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
    // InternalCOV.g:966:1: rule__ModelElementCoverage__Group__2__Impl : ( ( rule__ModelElementCoverage__ContextsAssignment_2 ) ) ;
    public final void rule__ModelElementCoverage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:970:1: ( ( ( rule__ModelElementCoverage__ContextsAssignment_2 ) ) )
            // InternalCOV.g:971:1: ( ( rule__ModelElementCoverage__ContextsAssignment_2 ) )
            {
            // InternalCOV.g:971:1: ( ( rule__ModelElementCoverage__ContextsAssignment_2 ) )
            // InternalCOV.g:972:2: ( rule__ModelElementCoverage__ContextsAssignment_2 )
            {
             before(grammarAccess.getModelElementCoverageAccess().getContextsAssignment_2()); 
            // InternalCOV.g:973:2: ( rule__ModelElementCoverage__ContextsAssignment_2 )
            // InternalCOV.g:973:3: rule__ModelElementCoverage__ContextsAssignment_2
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
    // InternalCOV.g:981:1: rule__ModelElementCoverage__Group__3 : rule__ModelElementCoverage__Group__3__Impl rule__ModelElementCoverage__Group__4 ;
    public final void rule__ModelElementCoverage__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:985:1: ( rule__ModelElementCoverage__Group__3__Impl rule__ModelElementCoverage__Group__4 )
            // InternalCOV.g:986:2: rule__ModelElementCoverage__Group__3__Impl rule__ModelElementCoverage__Group__4
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
    // InternalCOV.g:993:1: rule__ModelElementCoverage__Group__3__Impl : ( ( rule__ModelElementCoverage__Group_3__0 )* ) ;
    public final void rule__ModelElementCoverage__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:997:1: ( ( ( rule__ModelElementCoverage__Group_3__0 )* ) )
            // InternalCOV.g:998:1: ( ( rule__ModelElementCoverage__Group_3__0 )* )
            {
            // InternalCOV.g:998:1: ( ( rule__ModelElementCoverage__Group_3__0 )* )
            // InternalCOV.g:999:2: ( rule__ModelElementCoverage__Group_3__0 )*
            {
             before(grammarAccess.getModelElementCoverageAccess().getGroup_3()); 
            // InternalCOV.g:1000:2: ( rule__ModelElementCoverage__Group_3__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==22) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalCOV.g:1000:3: rule__ModelElementCoverage__Group_3__0
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
    // InternalCOV.g:1008:1: rule__ModelElementCoverage__Group__4 : rule__ModelElementCoverage__Group__4__Impl ;
    public final void rule__ModelElementCoverage__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1012:1: ( rule__ModelElementCoverage__Group__4__Impl )
            // InternalCOV.g:1013:2: rule__ModelElementCoverage__Group__4__Impl
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
    // InternalCOV.g:1019:1: rule__ModelElementCoverage__Group__4__Impl : ( '}' ) ;
    public final void rule__ModelElementCoverage__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1023:1: ( ( '}' ) )
            // InternalCOV.g:1024:1: ( '}' )
            {
            // InternalCOV.g:1024:1: ( '}' )
            // InternalCOV.g:1025:2: '}'
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
    // InternalCOV.g:1035:1: rule__ModelElementCoverage__Group_3__0 : rule__ModelElementCoverage__Group_3__0__Impl rule__ModelElementCoverage__Group_3__1 ;
    public final void rule__ModelElementCoverage__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1039:1: ( rule__ModelElementCoverage__Group_3__0__Impl rule__ModelElementCoverage__Group_3__1 )
            // InternalCOV.g:1040:2: rule__ModelElementCoverage__Group_3__0__Impl rule__ModelElementCoverage__Group_3__1
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
    // InternalCOV.g:1047:1: rule__ModelElementCoverage__Group_3__0__Impl : ( ',' ) ;
    public final void rule__ModelElementCoverage__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1051:1: ( ( ',' ) )
            // InternalCOV.g:1052:1: ( ',' )
            {
            // InternalCOV.g:1052:1: ( ',' )
            // InternalCOV.g:1053:2: ','
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
    // InternalCOV.g:1062:1: rule__ModelElementCoverage__Group_3__1 : rule__ModelElementCoverage__Group_3__1__Impl ;
    public final void rule__ModelElementCoverage__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1066:1: ( rule__ModelElementCoverage__Group_3__1__Impl )
            // InternalCOV.g:1067:2: rule__ModelElementCoverage__Group_3__1__Impl
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
    // InternalCOV.g:1073:1: rule__ModelElementCoverage__Group_3__1__Impl : ( ( rule__ModelElementCoverage__ContextsAssignment_3_1 ) ) ;
    public final void rule__ModelElementCoverage__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1077:1: ( ( ( rule__ModelElementCoverage__ContextsAssignment_3_1 ) ) )
            // InternalCOV.g:1078:1: ( ( rule__ModelElementCoverage__ContextsAssignment_3_1 ) )
            {
            // InternalCOV.g:1078:1: ( ( rule__ModelElementCoverage__ContextsAssignment_3_1 ) )
            // InternalCOV.g:1079:2: ( rule__ModelElementCoverage__ContextsAssignment_3_1 )
            {
             before(grammarAccess.getModelElementCoverageAccess().getContextsAssignment_3_1()); 
            // InternalCOV.g:1080:2: ( rule__ModelElementCoverage__ContextsAssignment_3_1 )
            // InternalCOV.g:1080:3: rule__ModelElementCoverage__ContextsAssignment_3_1
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
    // InternalCOV.g:1089:1: rule__BranchCoverage__Group__0 : rule__BranchCoverage__Group__0__Impl rule__BranchCoverage__Group__1 ;
    public final void rule__BranchCoverage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1093:1: ( rule__BranchCoverage__Group__0__Impl rule__BranchCoverage__Group__1 )
            // InternalCOV.g:1094:2: rule__BranchCoverage__Group__0__Impl rule__BranchCoverage__Group__1
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
    // InternalCOV.g:1101:1: rule__BranchCoverage__Group__0__Impl : ( 'BranchCoverageRuleset' ) ;
    public final void rule__BranchCoverage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1105:1: ( ( 'BranchCoverageRuleset' ) )
            // InternalCOV.g:1106:1: ( 'BranchCoverageRuleset' )
            {
            // InternalCOV.g:1106:1: ( 'BranchCoverageRuleset' )
            // InternalCOV.g:1107:2: 'BranchCoverageRuleset'
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
    // InternalCOV.g:1116:1: rule__BranchCoverage__Group__1 : rule__BranchCoverage__Group__1__Impl rule__BranchCoverage__Group__2 ;
    public final void rule__BranchCoverage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1120:1: ( rule__BranchCoverage__Group__1__Impl rule__BranchCoverage__Group__2 )
            // InternalCOV.g:1121:2: rule__BranchCoverage__Group__1__Impl rule__BranchCoverage__Group__2
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
    // InternalCOV.g:1128:1: rule__BranchCoverage__Group__1__Impl : ( '{' ) ;
    public final void rule__BranchCoverage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1132:1: ( ( '{' ) )
            // InternalCOV.g:1133:1: ( '{' )
            {
            // InternalCOV.g:1133:1: ( '{' )
            // InternalCOV.g:1134:2: '{'
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
    // InternalCOV.g:1143:1: rule__BranchCoverage__Group__2 : rule__BranchCoverage__Group__2__Impl rule__BranchCoverage__Group__3 ;
    public final void rule__BranchCoverage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1147:1: ( rule__BranchCoverage__Group__2__Impl rule__BranchCoverage__Group__3 )
            // InternalCOV.g:1148:2: rule__BranchCoverage__Group__2__Impl rule__BranchCoverage__Group__3
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
    // InternalCOV.g:1155:1: rule__BranchCoverage__Group__2__Impl : ( ( rule__BranchCoverage__Group_2__0 )? ) ;
    public final void rule__BranchCoverage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1159:1: ( ( ( rule__BranchCoverage__Group_2__0 )? ) )
            // InternalCOV.g:1160:1: ( ( rule__BranchCoverage__Group_2__0 )? )
            {
            // InternalCOV.g:1160:1: ( ( rule__BranchCoverage__Group_2__0 )? )
            // InternalCOV.g:1161:2: ( rule__BranchCoverage__Group_2__0 )?
            {
             before(grammarAccess.getBranchCoverageAccess().getGroup_2()); 
            // InternalCOV.g:1162:2: ( rule__BranchCoverage__Group_2__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==25) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalCOV.g:1162:3: rule__BranchCoverage__Group_2__0
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
    // InternalCOV.g:1170:1: rule__BranchCoverage__Group__3 : rule__BranchCoverage__Group__3__Impl ;
    public final void rule__BranchCoverage__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1174:1: ( rule__BranchCoverage__Group__3__Impl )
            // InternalCOV.g:1175:2: rule__BranchCoverage__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BranchCoverage__Group__3__Impl();

            state._fsp--;


            }

        }
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
    // InternalCOV.g:1181:1: rule__BranchCoverage__Group__3__Impl : ( '}' ) ;
    public final void rule__BranchCoverage__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1185:1: ( ( '}' ) )
            // InternalCOV.g:1186:1: ( '}' )
            {
            // InternalCOV.g:1186:1: ( '}' )
            // InternalCOV.g:1187:2: '}'
            {
             before(grammarAccess.getBranchCoverageAccess().getRightCurlyBracketKeyword_3()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getBranchCoverageAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__BranchCoverage__Group_2__0"
    // InternalCOV.g:1197:1: rule__BranchCoverage__Group_2__0 : rule__BranchCoverage__Group_2__0__Impl rule__BranchCoverage__Group_2__1 ;
    public final void rule__BranchCoverage__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1201:1: ( rule__BranchCoverage__Group_2__0__Impl rule__BranchCoverage__Group_2__1 )
            // InternalCOV.g:1202:2: rule__BranchCoverage__Group_2__0__Impl rule__BranchCoverage__Group_2__1
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
    // InternalCOV.g:1209:1: rule__BranchCoverage__Group_2__0__Impl : ( ( rule__BranchCoverage__ContextsAssignment_2_0 ) ) ;
    public final void rule__BranchCoverage__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1213:1: ( ( ( rule__BranchCoverage__ContextsAssignment_2_0 ) ) )
            // InternalCOV.g:1214:1: ( ( rule__BranchCoverage__ContextsAssignment_2_0 ) )
            {
            // InternalCOV.g:1214:1: ( ( rule__BranchCoverage__ContextsAssignment_2_0 ) )
            // InternalCOV.g:1215:2: ( rule__BranchCoverage__ContextsAssignment_2_0 )
            {
             before(grammarAccess.getBranchCoverageAccess().getContextsAssignment_2_0()); 
            // InternalCOV.g:1216:2: ( rule__BranchCoverage__ContextsAssignment_2_0 )
            // InternalCOV.g:1216:3: rule__BranchCoverage__ContextsAssignment_2_0
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
    // InternalCOV.g:1224:1: rule__BranchCoverage__Group_2__1 : rule__BranchCoverage__Group_2__1__Impl ;
    public final void rule__BranchCoverage__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1228:1: ( rule__BranchCoverage__Group_2__1__Impl )
            // InternalCOV.g:1229:2: rule__BranchCoverage__Group_2__1__Impl
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
    // InternalCOV.g:1235:1: rule__BranchCoverage__Group_2__1__Impl : ( ( rule__BranchCoverage__Group_2_1__0 )* ) ;
    public final void rule__BranchCoverage__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1239:1: ( ( ( rule__BranchCoverage__Group_2_1__0 )* ) )
            // InternalCOV.g:1240:1: ( ( rule__BranchCoverage__Group_2_1__0 )* )
            {
            // InternalCOV.g:1240:1: ( ( rule__BranchCoverage__Group_2_1__0 )* )
            // InternalCOV.g:1241:2: ( rule__BranchCoverage__Group_2_1__0 )*
            {
             before(grammarAccess.getBranchCoverageAccess().getGroup_2_1()); 
            // InternalCOV.g:1242:2: ( rule__BranchCoverage__Group_2_1__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==22) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalCOV.g:1242:3: rule__BranchCoverage__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__BranchCoverage__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // InternalCOV.g:1251:1: rule__BranchCoverage__Group_2_1__0 : rule__BranchCoverage__Group_2_1__0__Impl rule__BranchCoverage__Group_2_1__1 ;
    public final void rule__BranchCoverage__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1255:1: ( rule__BranchCoverage__Group_2_1__0__Impl rule__BranchCoverage__Group_2_1__1 )
            // InternalCOV.g:1256:2: rule__BranchCoverage__Group_2_1__0__Impl rule__BranchCoverage__Group_2_1__1
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
    // InternalCOV.g:1263:1: rule__BranchCoverage__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__BranchCoverage__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1267:1: ( ( ',' ) )
            // InternalCOV.g:1268:1: ( ',' )
            {
            // InternalCOV.g:1268:1: ( ',' )
            // InternalCOV.g:1269:2: ','
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
    // InternalCOV.g:1278:1: rule__BranchCoverage__Group_2_1__1 : rule__BranchCoverage__Group_2_1__1__Impl ;
    public final void rule__BranchCoverage__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1282:1: ( rule__BranchCoverage__Group_2_1__1__Impl )
            // InternalCOV.g:1283:2: rule__BranchCoverage__Group_2_1__1__Impl
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
    // InternalCOV.g:1289:1: rule__BranchCoverage__Group_2_1__1__Impl : ( ( rule__BranchCoverage__ContextsAssignment_2_1_1 ) ) ;
    public final void rule__BranchCoverage__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1293:1: ( ( ( rule__BranchCoverage__ContextsAssignment_2_1_1 ) ) )
            // InternalCOV.g:1294:1: ( ( rule__BranchCoverage__ContextsAssignment_2_1_1 ) )
            {
            // InternalCOV.g:1294:1: ( ( rule__BranchCoverage__ContextsAssignment_2_1_1 ) )
            // InternalCOV.g:1295:2: ( rule__BranchCoverage__ContextsAssignment_2_1_1 )
            {
             before(grammarAccess.getBranchCoverageAccess().getContextsAssignment_2_1_1()); 
            // InternalCOV.g:1296:2: ( rule__BranchCoverage__ContextsAssignment_2_1_1 )
            // InternalCOV.g:1296:3: rule__BranchCoverage__ContextsAssignment_2_1_1
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


    // $ANTLR start "rule__Context__Group__0"
    // InternalCOV.g:1305:1: rule__Context__Group__0 : rule__Context__Group__0__Impl rule__Context__Group__1 ;
    public final void rule__Context__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1309:1: ( rule__Context__Group__0__Impl rule__Context__Group__1 )
            // InternalCOV.g:1310:2: rule__Context__Group__0__Impl rule__Context__Group__1
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
    // InternalCOV.g:1317:1: rule__Context__Group__0__Impl : ( 'context' ) ;
    public final void rule__Context__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1321:1: ( ( 'context' ) )
            // InternalCOV.g:1322:1: ( 'context' )
            {
            // InternalCOV.g:1322:1: ( 'context' )
            // InternalCOV.g:1323:2: 'context'
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
    // InternalCOV.g:1332:1: rule__Context__Group__1 : rule__Context__Group__1__Impl rule__Context__Group__2 ;
    public final void rule__Context__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1336:1: ( rule__Context__Group__1__Impl rule__Context__Group__2 )
            // InternalCOV.g:1337:2: rule__Context__Group__1__Impl rule__Context__Group__2
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
    // InternalCOV.g:1344:1: rule__Context__Group__1__Impl : ( ( rule__Context__MetaclassAssignment_1 ) ) ;
    public final void rule__Context__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1348:1: ( ( ( rule__Context__MetaclassAssignment_1 ) ) )
            // InternalCOV.g:1349:1: ( ( rule__Context__MetaclassAssignment_1 ) )
            {
            // InternalCOV.g:1349:1: ( ( rule__Context__MetaclassAssignment_1 ) )
            // InternalCOV.g:1350:2: ( rule__Context__MetaclassAssignment_1 )
            {
             before(grammarAccess.getContextAccess().getMetaclassAssignment_1()); 
            // InternalCOV.g:1351:2: ( rule__Context__MetaclassAssignment_1 )
            // InternalCOV.g:1351:3: rule__Context__MetaclassAssignment_1
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
    // InternalCOV.g:1359:1: rule__Context__Group__2 : rule__Context__Group__2__Impl rule__Context__Group__3 ;
    public final void rule__Context__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1363:1: ( rule__Context__Group__2__Impl rule__Context__Group__3 )
            // InternalCOV.g:1364:2: rule__Context__Group__2__Impl rule__Context__Group__3
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
    // InternalCOV.g:1371:1: rule__Context__Group__2__Impl : ( '{' ) ;
    public final void rule__Context__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1375:1: ( ( '{' ) )
            // InternalCOV.g:1376:1: ( '{' )
            {
            // InternalCOV.g:1376:1: ( '{' )
            // InternalCOV.g:1377:2: '{'
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
    // InternalCOV.g:1386:1: rule__Context__Group__3 : rule__Context__Group__3__Impl rule__Context__Group__4 ;
    public final void rule__Context__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1390:1: ( rule__Context__Group__3__Impl rule__Context__Group__4 )
            // InternalCOV.g:1391:2: rule__Context__Group__3__Impl rule__Context__Group__4
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
    // InternalCOV.g:1398:1: rule__Context__Group__3__Impl : ( ( rule__Context__Group_3__0 )? ) ;
    public final void rule__Context__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1402:1: ( ( ( rule__Context__Group_3__0 )? ) )
            // InternalCOV.g:1403:1: ( ( rule__Context__Group_3__0 )? )
            {
            // InternalCOV.g:1403:1: ( ( rule__Context__Group_3__0 )? )
            // InternalCOV.g:1404:2: ( rule__Context__Group_3__0 )?
            {
             before(grammarAccess.getContextAccess().getGroup_3()); 
            // InternalCOV.g:1405:2: ( rule__Context__Group_3__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==26||(LA11_0>=32 && LA11_0<=34)||LA11_0==37) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalCOV.g:1405:3: rule__Context__Group_3__0
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
    // InternalCOV.g:1413:1: rule__Context__Group__4 : rule__Context__Group__4__Impl ;
    public final void rule__Context__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1417:1: ( rule__Context__Group__4__Impl )
            // InternalCOV.g:1418:2: rule__Context__Group__4__Impl
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
    // InternalCOV.g:1424:1: rule__Context__Group__4__Impl : ( '}' ) ;
    public final void rule__Context__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1428:1: ( ( '}' ) )
            // InternalCOV.g:1429:1: ( '}' )
            {
            // InternalCOV.g:1429:1: ( '}' )
            // InternalCOV.g:1430:2: '}'
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
    // InternalCOV.g:1440:1: rule__Context__Group_3__0 : rule__Context__Group_3__0__Impl rule__Context__Group_3__1 ;
    public final void rule__Context__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1444:1: ( rule__Context__Group_3__0__Impl rule__Context__Group_3__1 )
            // InternalCOV.g:1445:2: rule__Context__Group_3__0__Impl rule__Context__Group_3__1
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
    // InternalCOV.g:1452:1: rule__Context__Group_3__0__Impl : ( ( rule__Context__RulesAssignment_3_0 ) ) ;
    public final void rule__Context__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1456:1: ( ( ( rule__Context__RulesAssignment_3_0 ) ) )
            // InternalCOV.g:1457:1: ( ( rule__Context__RulesAssignment_3_0 ) )
            {
            // InternalCOV.g:1457:1: ( ( rule__Context__RulesAssignment_3_0 ) )
            // InternalCOV.g:1458:2: ( rule__Context__RulesAssignment_3_0 )
            {
             before(grammarAccess.getContextAccess().getRulesAssignment_3_0()); 
            // InternalCOV.g:1459:2: ( rule__Context__RulesAssignment_3_0 )
            // InternalCOV.g:1459:3: rule__Context__RulesAssignment_3_0
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
    // InternalCOV.g:1467:1: rule__Context__Group_3__1 : rule__Context__Group_3__1__Impl ;
    public final void rule__Context__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1471:1: ( rule__Context__Group_3__1__Impl )
            // InternalCOV.g:1472:2: rule__Context__Group_3__1__Impl
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
    // InternalCOV.g:1478:1: rule__Context__Group_3__1__Impl : ( ( rule__Context__Group_3_1__0 )* ) ;
    public final void rule__Context__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1482:1: ( ( ( rule__Context__Group_3_1__0 )* ) )
            // InternalCOV.g:1483:1: ( ( rule__Context__Group_3_1__0 )* )
            {
            // InternalCOV.g:1483:1: ( ( rule__Context__Group_3_1__0 )* )
            // InternalCOV.g:1484:2: ( rule__Context__Group_3_1__0 )*
            {
             before(grammarAccess.getContextAccess().getGroup_3_1()); 
            // InternalCOV.g:1485:2: ( rule__Context__Group_3_1__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==22) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalCOV.g:1485:3: rule__Context__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Context__Group_3_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // InternalCOV.g:1494:1: rule__Context__Group_3_1__0 : rule__Context__Group_3_1__0__Impl rule__Context__Group_3_1__1 ;
    public final void rule__Context__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1498:1: ( rule__Context__Group_3_1__0__Impl rule__Context__Group_3_1__1 )
            // InternalCOV.g:1499:2: rule__Context__Group_3_1__0__Impl rule__Context__Group_3_1__1
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
    // InternalCOV.g:1506:1: rule__Context__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__Context__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1510:1: ( ( ',' ) )
            // InternalCOV.g:1511:1: ( ',' )
            {
            // InternalCOV.g:1511:1: ( ',' )
            // InternalCOV.g:1512:2: ','
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
    // InternalCOV.g:1521:1: rule__Context__Group_3_1__1 : rule__Context__Group_3_1__1__Impl ;
    public final void rule__Context__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1525:1: ( rule__Context__Group_3_1__1__Impl )
            // InternalCOV.g:1526:2: rule__Context__Group_3_1__1__Impl
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
    // InternalCOV.g:1532:1: rule__Context__Group_3_1__1__Impl : ( ( rule__Context__RulesAssignment_3_1_1 ) ) ;
    public final void rule__Context__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1536:1: ( ( ( rule__Context__RulesAssignment_3_1_1 ) ) )
            // InternalCOV.g:1537:1: ( ( rule__Context__RulesAssignment_3_1_1 ) )
            {
            // InternalCOV.g:1537:1: ( ( rule__Context__RulesAssignment_3_1_1 ) )
            // InternalCOV.g:1538:2: ( rule__Context__RulesAssignment_3_1_1 )
            {
             before(grammarAccess.getContextAccess().getRulesAssignment_3_1_1()); 
            // InternalCOV.g:1539:2: ( rule__Context__RulesAssignment_3_1_1 )
            // InternalCOV.g:1539:3: rule__Context__RulesAssignment_3_1_1
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
    // InternalCOV.g:1548:1: rule__Ignore__Group__0 : rule__Ignore__Group__0__Impl rule__Ignore__Group__1 ;
    public final void rule__Ignore__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1552:1: ( rule__Ignore__Group__0__Impl rule__Ignore__Group__1 )
            // InternalCOV.g:1553:2: rule__Ignore__Group__0__Impl rule__Ignore__Group__1
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
    // InternalCOV.g:1560:1: rule__Ignore__Group__0__Impl : ( () ) ;
    public final void rule__Ignore__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1564:1: ( ( () ) )
            // InternalCOV.g:1565:1: ( () )
            {
            // InternalCOV.g:1565:1: ( () )
            // InternalCOV.g:1566:2: ()
            {
             before(grammarAccess.getIgnoreAccess().getIgnoreAction_0()); 
            // InternalCOV.g:1567:2: ()
            // InternalCOV.g:1567:3: 
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
    // InternalCOV.g:1575:1: rule__Ignore__Group__1 : rule__Ignore__Group__1__Impl rule__Ignore__Group__2 ;
    public final void rule__Ignore__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1579:1: ( rule__Ignore__Group__1__Impl rule__Ignore__Group__2 )
            // InternalCOV.g:1580:2: rule__Ignore__Group__1__Impl rule__Ignore__Group__2
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
    // InternalCOV.g:1587:1: rule__Ignore__Group__1__Impl : ( 'ignore' ) ;
    public final void rule__Ignore__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1591:1: ( ( 'ignore' ) )
            // InternalCOV.g:1592:1: ( 'ignore' )
            {
            // InternalCOV.g:1592:1: ( 'ignore' )
            // InternalCOV.g:1593:2: 'ignore'
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
    // InternalCOV.g:1602:1: rule__Ignore__Group__2 : rule__Ignore__Group__2__Impl rule__Ignore__Group__3 ;
    public final void rule__Ignore__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1606:1: ( rule__Ignore__Group__2__Impl rule__Ignore__Group__3 )
            // InternalCOV.g:1607:2: rule__Ignore__Group__2__Impl rule__Ignore__Group__3
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
    // InternalCOV.g:1614:1: rule__Ignore__Group__2__Impl : ( '(' ) ;
    public final void rule__Ignore__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1618:1: ( ( '(' ) )
            // InternalCOV.g:1619:1: ( '(' )
            {
            // InternalCOV.g:1619:1: ( '(' )
            // InternalCOV.g:1620:2: '('
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
    // InternalCOV.g:1629:1: rule__Ignore__Group__3 : rule__Ignore__Group__3__Impl rule__Ignore__Group__4 ;
    public final void rule__Ignore__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1633:1: ( rule__Ignore__Group__3__Impl rule__Ignore__Group__4 )
            // InternalCOV.g:1634:2: rule__Ignore__Group__3__Impl rule__Ignore__Group__4
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
    // InternalCOV.g:1641:1: rule__Ignore__Group__3__Impl : ( ( rule__Ignore__Group_3__0 )? ) ;
    public final void rule__Ignore__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1645:1: ( ( ( rule__Ignore__Group_3__0 )? ) )
            // InternalCOV.g:1646:1: ( ( rule__Ignore__Group_3__0 )? )
            {
            // InternalCOV.g:1646:1: ( ( rule__Ignore__Group_3__0 )? )
            // InternalCOV.g:1647:2: ( rule__Ignore__Group_3__0 )?
            {
             before(grammarAccess.getIgnoreAccess().getGroup_3()); 
            // InternalCOV.g:1648:2: ( rule__Ignore__Group_3__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==29) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalCOV.g:1648:3: rule__Ignore__Group_3__0
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
    // InternalCOV.g:1656:1: rule__Ignore__Group__4 : rule__Ignore__Group__4__Impl rule__Ignore__Group__5 ;
    public final void rule__Ignore__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1660:1: ( rule__Ignore__Group__4__Impl rule__Ignore__Group__5 )
            // InternalCOV.g:1661:2: rule__Ignore__Group__4__Impl rule__Ignore__Group__5
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
    // InternalCOV.g:1668:1: rule__Ignore__Group__4__Impl : ( ')' ) ;
    public final void rule__Ignore__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1672:1: ( ( ')' ) )
            // InternalCOV.g:1673:1: ( ')' )
            {
            // InternalCOV.g:1673:1: ( ')' )
            // InternalCOV.g:1674:2: ')'
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
    // InternalCOV.g:1683:1: rule__Ignore__Group__5 : rule__Ignore__Group__5__Impl rule__Ignore__Group__6 ;
    public final void rule__Ignore__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1687:1: ( rule__Ignore__Group__5__Impl rule__Ignore__Group__6 )
            // InternalCOV.g:1688:2: rule__Ignore__Group__5__Impl rule__Ignore__Group__6
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
    // InternalCOV.g:1695:1: rule__Ignore__Group__5__Impl : ( ( rule__Ignore__Group_5__0 )? ) ;
    public final void rule__Ignore__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1699:1: ( ( ( rule__Ignore__Group_5__0 )? ) )
            // InternalCOV.g:1700:1: ( ( rule__Ignore__Group_5__0 )? )
            {
            // InternalCOV.g:1700:1: ( ( rule__Ignore__Group_5__0 )? )
            // InternalCOV.g:1701:2: ( rule__Ignore__Group_5__0 )?
            {
             before(grammarAccess.getIgnoreAccess().getGroup_5()); 
            // InternalCOV.g:1702:2: ( rule__Ignore__Group_5__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==30) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalCOV.g:1702:3: rule__Ignore__Group_5__0
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
    // InternalCOV.g:1710:1: rule__Ignore__Group__6 : rule__Ignore__Group__6__Impl ;
    public final void rule__Ignore__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1714:1: ( rule__Ignore__Group__6__Impl )
            // InternalCOV.g:1715:2: rule__Ignore__Group__6__Impl
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
    // InternalCOV.g:1721:1: rule__Ignore__Group__6__Impl : ( ( rule__Ignore__Group_6__0 )? ) ;
    public final void rule__Ignore__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1725:1: ( ( ( rule__Ignore__Group_6__0 )? ) )
            // InternalCOV.g:1726:1: ( ( rule__Ignore__Group_6__0 )? )
            {
            // InternalCOV.g:1726:1: ( ( rule__Ignore__Group_6__0 )? )
            // InternalCOV.g:1727:2: ( rule__Ignore__Group_6__0 )?
            {
             before(grammarAccess.getIgnoreAccess().getGroup_6()); 
            // InternalCOV.g:1728:2: ( rule__Ignore__Group_6__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==31) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalCOV.g:1728:3: rule__Ignore__Group_6__0
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
    // InternalCOV.g:1737:1: rule__Ignore__Group_3__0 : rule__Ignore__Group_3__0__Impl rule__Ignore__Group_3__1 ;
    public final void rule__Ignore__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1741:1: ( rule__Ignore__Group_3__0__Impl rule__Ignore__Group_3__1 )
            // InternalCOV.g:1742:2: rule__Ignore__Group_3__0__Impl rule__Ignore__Group_3__1
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
    // InternalCOV.g:1749:1: rule__Ignore__Group_3__0__Impl : ( 'subtypes' ) ;
    public final void rule__Ignore__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1753:1: ( ( 'subtypes' ) )
            // InternalCOV.g:1754:1: ( 'subtypes' )
            {
            // InternalCOV.g:1754:1: ( 'subtypes' )
            // InternalCOV.g:1755:2: 'subtypes'
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
    // InternalCOV.g:1764:1: rule__Ignore__Group_3__1 : rule__Ignore__Group_3__1__Impl ;
    public final void rule__Ignore__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1768:1: ( rule__Ignore__Group_3__1__Impl )
            // InternalCOV.g:1769:2: rule__Ignore__Group_3__1__Impl
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
    // InternalCOV.g:1775:1: rule__Ignore__Group_3__1__Impl : ( ( rule__Ignore__IgnoreSubtypesAssignment_3_1 ) ) ;
    public final void rule__Ignore__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1779:1: ( ( ( rule__Ignore__IgnoreSubtypesAssignment_3_1 ) ) )
            // InternalCOV.g:1780:1: ( ( rule__Ignore__IgnoreSubtypesAssignment_3_1 ) )
            {
            // InternalCOV.g:1780:1: ( ( rule__Ignore__IgnoreSubtypesAssignment_3_1 ) )
            // InternalCOV.g:1781:2: ( rule__Ignore__IgnoreSubtypesAssignment_3_1 )
            {
             before(grammarAccess.getIgnoreAccess().getIgnoreSubtypesAssignment_3_1()); 
            // InternalCOV.g:1782:2: ( rule__Ignore__IgnoreSubtypesAssignment_3_1 )
            // InternalCOV.g:1782:3: rule__Ignore__IgnoreSubtypesAssignment_3_1
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
    // InternalCOV.g:1791:1: rule__Ignore__Group_5__0 : rule__Ignore__Group_5__0__Impl rule__Ignore__Group_5__1 ;
    public final void rule__Ignore__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1795:1: ( rule__Ignore__Group_5__0__Impl rule__Ignore__Group_5__1 )
            // InternalCOV.g:1796:2: rule__Ignore__Group_5__0__Impl rule__Ignore__Group_5__1
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
    // InternalCOV.g:1803:1: rule__Ignore__Group_5__0__Impl : ( 'description' ) ;
    public final void rule__Ignore__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1807:1: ( ( 'description' ) )
            // InternalCOV.g:1808:1: ( 'description' )
            {
            // InternalCOV.g:1808:1: ( 'description' )
            // InternalCOV.g:1809:2: 'description'
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
    // InternalCOV.g:1818:1: rule__Ignore__Group_5__1 : rule__Ignore__Group_5__1__Impl ;
    public final void rule__Ignore__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1822:1: ( rule__Ignore__Group_5__1__Impl )
            // InternalCOV.g:1823:2: rule__Ignore__Group_5__1__Impl
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
    // InternalCOV.g:1829:1: rule__Ignore__Group_5__1__Impl : ( ( rule__Ignore__DescriptionAssignment_5_1 ) ) ;
    public final void rule__Ignore__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1833:1: ( ( ( rule__Ignore__DescriptionAssignment_5_1 ) ) )
            // InternalCOV.g:1834:1: ( ( rule__Ignore__DescriptionAssignment_5_1 ) )
            {
            // InternalCOV.g:1834:1: ( ( rule__Ignore__DescriptionAssignment_5_1 ) )
            // InternalCOV.g:1835:2: ( rule__Ignore__DescriptionAssignment_5_1 )
            {
             before(grammarAccess.getIgnoreAccess().getDescriptionAssignment_5_1()); 
            // InternalCOV.g:1836:2: ( rule__Ignore__DescriptionAssignment_5_1 )
            // InternalCOV.g:1836:3: rule__Ignore__DescriptionAssignment_5_1
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
    // InternalCOV.g:1845:1: rule__Ignore__Group_6__0 : rule__Ignore__Group_6__0__Impl rule__Ignore__Group_6__1 ;
    public final void rule__Ignore__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1849:1: ( rule__Ignore__Group_6__0__Impl rule__Ignore__Group_6__1 )
            // InternalCOV.g:1850:2: rule__Ignore__Group_6__0__Impl rule__Ignore__Group_6__1
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
    // InternalCOV.g:1857:1: rule__Ignore__Group_6__0__Impl : ( 'condition' ) ;
    public final void rule__Ignore__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1861:1: ( ( 'condition' ) )
            // InternalCOV.g:1862:1: ( 'condition' )
            {
            // InternalCOV.g:1862:1: ( 'condition' )
            // InternalCOV.g:1863:2: 'condition'
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
    // InternalCOV.g:1872:1: rule__Ignore__Group_6__1 : rule__Ignore__Group_6__1__Impl ;
    public final void rule__Ignore__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1876:1: ( rule__Ignore__Group_6__1__Impl )
            // InternalCOV.g:1877:2: rule__Ignore__Group_6__1__Impl
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
    // InternalCOV.g:1883:1: rule__Ignore__Group_6__1__Impl : ( ( rule__Ignore__ConditionAssignment_6_1 ) ) ;
    public final void rule__Ignore__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1887:1: ( ( ( rule__Ignore__ConditionAssignment_6_1 ) ) )
            // InternalCOV.g:1888:1: ( ( rule__Ignore__ConditionAssignment_6_1 ) )
            {
            // InternalCOV.g:1888:1: ( ( rule__Ignore__ConditionAssignment_6_1 ) )
            // InternalCOV.g:1889:2: ( rule__Ignore__ConditionAssignment_6_1 )
            {
             before(grammarAccess.getIgnoreAccess().getConditionAssignment_6_1()); 
            // InternalCOV.g:1890:2: ( rule__Ignore__ConditionAssignment_6_1 )
            // InternalCOV.g:1890:3: rule__Ignore__ConditionAssignment_6_1
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
    // InternalCOV.g:1899:1: rule__LimitedIgnore__Group__0 : rule__LimitedIgnore__Group__0__Impl rule__LimitedIgnore__Group__1 ;
    public final void rule__LimitedIgnore__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1903:1: ( rule__LimitedIgnore__Group__0__Impl rule__LimitedIgnore__Group__1 )
            // InternalCOV.g:1904:2: rule__LimitedIgnore__Group__0__Impl rule__LimitedIgnore__Group__1
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
    // InternalCOV.g:1911:1: rule__LimitedIgnore__Group__0__Impl : ( 'ignoreif' ) ;
    public final void rule__LimitedIgnore__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1915:1: ( ( 'ignoreif' ) )
            // InternalCOV.g:1916:1: ( 'ignoreif' )
            {
            // InternalCOV.g:1916:1: ( 'ignoreif' )
            // InternalCOV.g:1917:2: 'ignoreif'
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
    // InternalCOV.g:1926:1: rule__LimitedIgnore__Group__1 : rule__LimitedIgnore__Group__1__Impl rule__LimitedIgnore__Group__2 ;
    public final void rule__LimitedIgnore__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1930:1: ( rule__LimitedIgnore__Group__1__Impl rule__LimitedIgnore__Group__2 )
            // InternalCOV.g:1931:2: rule__LimitedIgnore__Group__1__Impl rule__LimitedIgnore__Group__2
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
    // InternalCOV.g:1938:1: rule__LimitedIgnore__Group__1__Impl : ( ( rule__LimitedIgnore__TypeAssignment_1 ) ) ;
    public final void rule__LimitedIgnore__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1942:1: ( ( ( rule__LimitedIgnore__TypeAssignment_1 ) ) )
            // InternalCOV.g:1943:1: ( ( rule__LimitedIgnore__TypeAssignment_1 ) )
            {
            // InternalCOV.g:1943:1: ( ( rule__LimitedIgnore__TypeAssignment_1 ) )
            // InternalCOV.g:1944:2: ( rule__LimitedIgnore__TypeAssignment_1 )
            {
             before(grammarAccess.getLimitedIgnoreAccess().getTypeAssignment_1()); 
            // InternalCOV.g:1945:2: ( rule__LimitedIgnore__TypeAssignment_1 )
            // InternalCOV.g:1945:3: rule__LimitedIgnore__TypeAssignment_1
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
    // InternalCOV.g:1953:1: rule__LimitedIgnore__Group__2 : rule__LimitedIgnore__Group__2__Impl rule__LimitedIgnore__Group__3 ;
    public final void rule__LimitedIgnore__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1957:1: ( rule__LimitedIgnore__Group__2__Impl rule__LimitedIgnore__Group__3 )
            // InternalCOV.g:1958:2: rule__LimitedIgnore__Group__2__Impl rule__LimitedIgnore__Group__3
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
    // InternalCOV.g:1965:1: rule__LimitedIgnore__Group__2__Impl : ( ( rule__LimitedIgnore__ContainerMetaclassAssignment_2 ) ) ;
    public final void rule__LimitedIgnore__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1969:1: ( ( ( rule__LimitedIgnore__ContainerMetaclassAssignment_2 ) ) )
            // InternalCOV.g:1970:1: ( ( rule__LimitedIgnore__ContainerMetaclassAssignment_2 ) )
            {
            // InternalCOV.g:1970:1: ( ( rule__LimitedIgnore__ContainerMetaclassAssignment_2 ) )
            // InternalCOV.g:1971:2: ( rule__LimitedIgnore__ContainerMetaclassAssignment_2 )
            {
             before(grammarAccess.getLimitedIgnoreAccess().getContainerMetaclassAssignment_2()); 
            // InternalCOV.g:1972:2: ( rule__LimitedIgnore__ContainerMetaclassAssignment_2 )
            // InternalCOV.g:1972:3: rule__LimitedIgnore__ContainerMetaclassAssignment_2
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
    // InternalCOV.g:1980:1: rule__LimitedIgnore__Group__3 : rule__LimitedIgnore__Group__3__Impl rule__LimitedIgnore__Group__4 ;
    public final void rule__LimitedIgnore__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1984:1: ( rule__LimitedIgnore__Group__3__Impl rule__LimitedIgnore__Group__4 )
            // InternalCOV.g:1985:2: rule__LimitedIgnore__Group__3__Impl rule__LimitedIgnore__Group__4
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
    // InternalCOV.g:1992:1: rule__LimitedIgnore__Group__3__Impl : ( ( rule__LimitedIgnore__Group_3__0 )* ) ;
    public final void rule__LimitedIgnore__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1996:1: ( ( ( rule__LimitedIgnore__Group_3__0 )* ) )
            // InternalCOV.g:1997:1: ( ( rule__LimitedIgnore__Group_3__0 )* )
            {
            // InternalCOV.g:1997:1: ( ( rule__LimitedIgnore__Group_3__0 )* )
            // InternalCOV.g:1998:2: ( rule__LimitedIgnore__Group_3__0 )*
            {
             before(grammarAccess.getLimitedIgnoreAccess().getGroup_3()); 
            // InternalCOV.g:1999:2: ( rule__LimitedIgnore__Group_3__0 )*
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
            	    // InternalCOV.g:1999:3: rule__LimitedIgnore__Group_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__LimitedIgnore__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // InternalCOV.g:2007:1: rule__LimitedIgnore__Group__4 : rule__LimitedIgnore__Group__4__Impl rule__LimitedIgnore__Group__5 ;
    public final void rule__LimitedIgnore__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2011:1: ( rule__LimitedIgnore__Group__4__Impl rule__LimitedIgnore__Group__5 )
            // InternalCOV.g:2012:2: rule__LimitedIgnore__Group__4__Impl rule__LimitedIgnore__Group__5
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
    // InternalCOV.g:2019:1: rule__LimitedIgnore__Group__4__Impl : ( ( rule__LimitedIgnore__Group_4__0 )? ) ;
    public final void rule__LimitedIgnore__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2023:1: ( ( ( rule__LimitedIgnore__Group_4__0 )? ) )
            // InternalCOV.g:2024:1: ( ( rule__LimitedIgnore__Group_4__0 )? )
            {
            // InternalCOV.g:2024:1: ( ( rule__LimitedIgnore__Group_4__0 )? )
            // InternalCOV.g:2025:2: ( rule__LimitedIgnore__Group_4__0 )?
            {
             before(grammarAccess.getLimitedIgnoreAccess().getGroup_4()); 
            // InternalCOV.g:2026:2: ( rule__LimitedIgnore__Group_4__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==30) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalCOV.g:2026:3: rule__LimitedIgnore__Group_4__0
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
    // InternalCOV.g:2034:1: rule__LimitedIgnore__Group__5 : rule__LimitedIgnore__Group__5__Impl ;
    public final void rule__LimitedIgnore__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2038:1: ( rule__LimitedIgnore__Group__5__Impl )
            // InternalCOV.g:2039:2: rule__LimitedIgnore__Group__5__Impl
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
    // InternalCOV.g:2045:1: rule__LimitedIgnore__Group__5__Impl : ( ( rule__LimitedIgnore__Group_5__0 )? ) ;
    public final void rule__LimitedIgnore__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2049:1: ( ( ( rule__LimitedIgnore__Group_5__0 )? ) )
            // InternalCOV.g:2050:1: ( ( rule__LimitedIgnore__Group_5__0 )? )
            {
            // InternalCOV.g:2050:1: ( ( rule__LimitedIgnore__Group_5__0 )? )
            // InternalCOV.g:2051:2: ( rule__LimitedIgnore__Group_5__0 )?
            {
             before(grammarAccess.getLimitedIgnoreAccess().getGroup_5()); 
            // InternalCOV.g:2052:2: ( rule__LimitedIgnore__Group_5__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==31) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalCOV.g:2052:3: rule__LimitedIgnore__Group_5__0
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
    // InternalCOV.g:2061:1: rule__LimitedIgnore__Group_3__0 : rule__LimitedIgnore__Group_3__0__Impl rule__LimitedIgnore__Group_3__1 ;
    public final void rule__LimitedIgnore__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2065:1: ( rule__LimitedIgnore__Group_3__0__Impl rule__LimitedIgnore__Group_3__1 )
            // InternalCOV.g:2066:2: rule__LimitedIgnore__Group_3__0__Impl rule__LimitedIgnore__Group_3__1
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
    // InternalCOV.g:2073:1: rule__LimitedIgnore__Group_3__0__Impl : ( ',' ) ;
    public final void rule__LimitedIgnore__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2077:1: ( ( ',' ) )
            // InternalCOV.g:2078:1: ( ',' )
            {
            // InternalCOV.g:2078:1: ( ',' )
            // InternalCOV.g:2079:2: ','
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
    // InternalCOV.g:2088:1: rule__LimitedIgnore__Group_3__1 : rule__LimitedIgnore__Group_3__1__Impl ;
    public final void rule__LimitedIgnore__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2092:1: ( rule__LimitedIgnore__Group_3__1__Impl )
            // InternalCOV.g:2093:2: rule__LimitedIgnore__Group_3__1__Impl
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
    // InternalCOV.g:2099:1: rule__LimitedIgnore__Group_3__1__Impl : ( ( rule__LimitedIgnore__ContainerMetaclassAssignment_3_1 ) ) ;
    public final void rule__LimitedIgnore__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2103:1: ( ( ( rule__LimitedIgnore__ContainerMetaclassAssignment_3_1 ) ) )
            // InternalCOV.g:2104:1: ( ( rule__LimitedIgnore__ContainerMetaclassAssignment_3_1 ) )
            {
            // InternalCOV.g:2104:1: ( ( rule__LimitedIgnore__ContainerMetaclassAssignment_3_1 ) )
            // InternalCOV.g:2105:2: ( rule__LimitedIgnore__ContainerMetaclassAssignment_3_1 )
            {
             before(grammarAccess.getLimitedIgnoreAccess().getContainerMetaclassAssignment_3_1()); 
            // InternalCOV.g:2106:2: ( rule__LimitedIgnore__ContainerMetaclassAssignment_3_1 )
            // InternalCOV.g:2106:3: rule__LimitedIgnore__ContainerMetaclassAssignment_3_1
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
    // InternalCOV.g:2115:1: rule__LimitedIgnore__Group_4__0 : rule__LimitedIgnore__Group_4__0__Impl rule__LimitedIgnore__Group_4__1 ;
    public final void rule__LimitedIgnore__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2119:1: ( rule__LimitedIgnore__Group_4__0__Impl rule__LimitedIgnore__Group_4__1 )
            // InternalCOV.g:2120:2: rule__LimitedIgnore__Group_4__0__Impl rule__LimitedIgnore__Group_4__1
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
    // InternalCOV.g:2127:1: rule__LimitedIgnore__Group_4__0__Impl : ( 'description' ) ;
    public final void rule__LimitedIgnore__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2131:1: ( ( 'description' ) )
            // InternalCOV.g:2132:1: ( 'description' )
            {
            // InternalCOV.g:2132:1: ( 'description' )
            // InternalCOV.g:2133:2: 'description'
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
    // InternalCOV.g:2142:1: rule__LimitedIgnore__Group_4__1 : rule__LimitedIgnore__Group_4__1__Impl ;
    public final void rule__LimitedIgnore__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2146:1: ( rule__LimitedIgnore__Group_4__1__Impl )
            // InternalCOV.g:2147:2: rule__LimitedIgnore__Group_4__1__Impl
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
    // InternalCOV.g:2153:1: rule__LimitedIgnore__Group_4__1__Impl : ( ( rule__LimitedIgnore__DescriptionAssignment_4_1 ) ) ;
    public final void rule__LimitedIgnore__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2157:1: ( ( ( rule__LimitedIgnore__DescriptionAssignment_4_1 ) ) )
            // InternalCOV.g:2158:1: ( ( rule__LimitedIgnore__DescriptionAssignment_4_1 ) )
            {
            // InternalCOV.g:2158:1: ( ( rule__LimitedIgnore__DescriptionAssignment_4_1 ) )
            // InternalCOV.g:2159:2: ( rule__LimitedIgnore__DescriptionAssignment_4_1 )
            {
             before(grammarAccess.getLimitedIgnoreAccess().getDescriptionAssignment_4_1()); 
            // InternalCOV.g:2160:2: ( rule__LimitedIgnore__DescriptionAssignment_4_1 )
            // InternalCOV.g:2160:3: rule__LimitedIgnore__DescriptionAssignment_4_1
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
    // InternalCOV.g:2169:1: rule__LimitedIgnore__Group_5__0 : rule__LimitedIgnore__Group_5__0__Impl rule__LimitedIgnore__Group_5__1 ;
    public final void rule__LimitedIgnore__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2173:1: ( rule__LimitedIgnore__Group_5__0__Impl rule__LimitedIgnore__Group_5__1 )
            // InternalCOV.g:2174:2: rule__LimitedIgnore__Group_5__0__Impl rule__LimitedIgnore__Group_5__1
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
    // InternalCOV.g:2181:1: rule__LimitedIgnore__Group_5__0__Impl : ( 'condition' ) ;
    public final void rule__LimitedIgnore__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2185:1: ( ( 'condition' ) )
            // InternalCOV.g:2186:1: ( 'condition' )
            {
            // InternalCOV.g:2186:1: ( 'condition' )
            // InternalCOV.g:2187:2: 'condition'
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
    // InternalCOV.g:2196:1: rule__LimitedIgnore__Group_5__1 : rule__LimitedIgnore__Group_5__1__Impl ;
    public final void rule__LimitedIgnore__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2200:1: ( rule__LimitedIgnore__Group_5__1__Impl )
            // InternalCOV.g:2201:2: rule__LimitedIgnore__Group_5__1__Impl
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
    // InternalCOV.g:2207:1: rule__LimitedIgnore__Group_5__1__Impl : ( ( rule__LimitedIgnore__ConditionAssignment_5_1 ) ) ;
    public final void rule__LimitedIgnore__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2211:1: ( ( ( rule__LimitedIgnore__ConditionAssignment_5_1 ) ) )
            // InternalCOV.g:2212:1: ( ( rule__LimitedIgnore__ConditionAssignment_5_1 ) )
            {
            // InternalCOV.g:2212:1: ( ( rule__LimitedIgnore__ConditionAssignment_5_1 ) )
            // InternalCOV.g:2213:2: ( rule__LimitedIgnore__ConditionAssignment_5_1 )
            {
             before(grammarAccess.getLimitedIgnoreAccess().getConditionAssignment_5_1()); 
            // InternalCOV.g:2214:2: ( rule__LimitedIgnore__ConditionAssignment_5_1 )
            // InternalCOV.g:2214:3: rule__LimitedIgnore__ConditionAssignment_5_1
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
    // InternalCOV.g:2223:1: rule__CoverageOfReferenced__Group__0 : rule__CoverageOfReferenced__Group__0__Impl rule__CoverageOfReferenced__Group__1 ;
    public final void rule__CoverageOfReferenced__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2227:1: ( rule__CoverageOfReferenced__Group__0__Impl rule__CoverageOfReferenced__Group__1 )
            // InternalCOV.g:2228:2: rule__CoverageOfReferenced__Group__0__Impl rule__CoverageOfReferenced__Group__1
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
    // InternalCOV.g:2235:1: rule__CoverageOfReferenced__Group__0__Impl : ( 'covers' ) ;
    public final void rule__CoverageOfReferenced__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2239:1: ( ( 'covers' ) )
            // InternalCOV.g:2240:1: ( 'covers' )
            {
            // InternalCOV.g:2240:1: ( 'covers' )
            // InternalCOV.g:2241:2: 'covers'
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
    // InternalCOV.g:2250:1: rule__CoverageOfReferenced__Group__1 : rule__CoverageOfReferenced__Group__1__Impl rule__CoverageOfReferenced__Group__2 ;
    public final void rule__CoverageOfReferenced__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2254:1: ( rule__CoverageOfReferenced__Group__1__Impl rule__CoverageOfReferenced__Group__2 )
            // InternalCOV.g:2255:2: rule__CoverageOfReferenced__Group__1__Impl rule__CoverageOfReferenced__Group__2
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
    // InternalCOV.g:2262:1: rule__CoverageOfReferenced__Group__1__Impl : ( ( rule__CoverageOfReferenced__ReferenceAssignment_1 ) ) ;
    public final void rule__CoverageOfReferenced__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2266:1: ( ( ( rule__CoverageOfReferenced__ReferenceAssignment_1 ) ) )
            // InternalCOV.g:2267:1: ( ( rule__CoverageOfReferenced__ReferenceAssignment_1 ) )
            {
            // InternalCOV.g:2267:1: ( ( rule__CoverageOfReferenced__ReferenceAssignment_1 ) )
            // InternalCOV.g:2268:2: ( rule__CoverageOfReferenced__ReferenceAssignment_1 )
            {
             before(grammarAccess.getCoverageOfReferencedAccess().getReferenceAssignment_1()); 
            // InternalCOV.g:2269:2: ( rule__CoverageOfReferenced__ReferenceAssignment_1 )
            // InternalCOV.g:2269:3: rule__CoverageOfReferenced__ReferenceAssignment_1
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
    // InternalCOV.g:2277:1: rule__CoverageOfReferenced__Group__2 : rule__CoverageOfReferenced__Group__2__Impl rule__CoverageOfReferenced__Group__3 ;
    public final void rule__CoverageOfReferenced__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2281:1: ( rule__CoverageOfReferenced__Group__2__Impl rule__CoverageOfReferenced__Group__3 )
            // InternalCOV.g:2282:2: rule__CoverageOfReferenced__Group__2__Impl rule__CoverageOfReferenced__Group__3
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
    // InternalCOV.g:2289:1: rule__CoverageOfReferenced__Group__2__Impl : ( ( rule__CoverageOfReferenced__Group_2__0 )* ) ;
    public final void rule__CoverageOfReferenced__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2293:1: ( ( ( rule__CoverageOfReferenced__Group_2__0 )* ) )
            // InternalCOV.g:2294:1: ( ( rule__CoverageOfReferenced__Group_2__0 )* )
            {
            // InternalCOV.g:2294:1: ( ( rule__CoverageOfReferenced__Group_2__0 )* )
            // InternalCOV.g:2295:2: ( rule__CoverageOfReferenced__Group_2__0 )*
            {
             before(grammarAccess.getCoverageOfReferencedAccess().getGroup_2()); 
            // InternalCOV.g:2296:2: ( rule__CoverageOfReferenced__Group_2__0 )*
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
            	    // InternalCOV.g:2296:3: rule__CoverageOfReferenced__Group_2__0
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
    // InternalCOV.g:2304:1: rule__CoverageOfReferenced__Group__3 : rule__CoverageOfReferenced__Group__3__Impl rule__CoverageOfReferenced__Group__4 ;
    public final void rule__CoverageOfReferenced__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2308:1: ( rule__CoverageOfReferenced__Group__3__Impl rule__CoverageOfReferenced__Group__4 )
            // InternalCOV.g:2309:2: rule__CoverageOfReferenced__Group__3__Impl rule__CoverageOfReferenced__Group__4
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
    // InternalCOV.g:2316:1: rule__CoverageOfReferenced__Group__3__Impl : ( ( rule__CoverageOfReferenced__Group_3__0 )? ) ;
    public final void rule__CoverageOfReferenced__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2320:1: ( ( ( rule__CoverageOfReferenced__Group_3__0 )? ) )
            // InternalCOV.g:2321:1: ( ( rule__CoverageOfReferenced__Group_3__0 )? )
            {
            // InternalCOV.g:2321:1: ( ( rule__CoverageOfReferenced__Group_3__0 )? )
            // InternalCOV.g:2322:2: ( rule__CoverageOfReferenced__Group_3__0 )?
            {
             before(grammarAccess.getCoverageOfReferencedAccess().getGroup_3()); 
            // InternalCOV.g:2323:2: ( rule__CoverageOfReferenced__Group_3__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==30) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalCOV.g:2323:3: rule__CoverageOfReferenced__Group_3__0
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
    // InternalCOV.g:2331:1: rule__CoverageOfReferenced__Group__4 : rule__CoverageOfReferenced__Group__4__Impl ;
    public final void rule__CoverageOfReferenced__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2335:1: ( rule__CoverageOfReferenced__Group__4__Impl )
            // InternalCOV.g:2336:2: rule__CoverageOfReferenced__Group__4__Impl
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
    // InternalCOV.g:2342:1: rule__CoverageOfReferenced__Group__4__Impl : ( ( rule__CoverageOfReferenced__Group_4__0 )? ) ;
    public final void rule__CoverageOfReferenced__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2346:1: ( ( ( rule__CoverageOfReferenced__Group_4__0 )? ) )
            // InternalCOV.g:2347:1: ( ( rule__CoverageOfReferenced__Group_4__0 )? )
            {
            // InternalCOV.g:2347:1: ( ( rule__CoverageOfReferenced__Group_4__0 )? )
            // InternalCOV.g:2348:2: ( rule__CoverageOfReferenced__Group_4__0 )?
            {
             before(grammarAccess.getCoverageOfReferencedAccess().getGroup_4()); 
            // InternalCOV.g:2349:2: ( rule__CoverageOfReferenced__Group_4__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==31) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalCOV.g:2349:3: rule__CoverageOfReferenced__Group_4__0
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
    // InternalCOV.g:2358:1: rule__CoverageOfReferenced__Group_2__0 : rule__CoverageOfReferenced__Group_2__0__Impl rule__CoverageOfReferenced__Group_2__1 ;
    public final void rule__CoverageOfReferenced__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2362:1: ( rule__CoverageOfReferenced__Group_2__0__Impl rule__CoverageOfReferenced__Group_2__1 )
            // InternalCOV.g:2363:2: rule__CoverageOfReferenced__Group_2__0__Impl rule__CoverageOfReferenced__Group_2__1
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
    // InternalCOV.g:2370:1: rule__CoverageOfReferenced__Group_2__0__Impl : ( ',' ) ;
    public final void rule__CoverageOfReferenced__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2374:1: ( ( ',' ) )
            // InternalCOV.g:2375:1: ( ',' )
            {
            // InternalCOV.g:2375:1: ( ',' )
            // InternalCOV.g:2376:2: ','
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
    // InternalCOV.g:2385:1: rule__CoverageOfReferenced__Group_2__1 : rule__CoverageOfReferenced__Group_2__1__Impl ;
    public final void rule__CoverageOfReferenced__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2389:1: ( rule__CoverageOfReferenced__Group_2__1__Impl )
            // InternalCOV.g:2390:2: rule__CoverageOfReferenced__Group_2__1__Impl
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
    // InternalCOV.g:2396:1: rule__CoverageOfReferenced__Group_2__1__Impl : ( ( rule__CoverageOfReferenced__ReferenceAssignment_2_1 ) ) ;
    public final void rule__CoverageOfReferenced__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2400:1: ( ( ( rule__CoverageOfReferenced__ReferenceAssignment_2_1 ) ) )
            // InternalCOV.g:2401:1: ( ( rule__CoverageOfReferenced__ReferenceAssignment_2_1 ) )
            {
            // InternalCOV.g:2401:1: ( ( rule__CoverageOfReferenced__ReferenceAssignment_2_1 ) )
            // InternalCOV.g:2402:2: ( rule__CoverageOfReferenced__ReferenceAssignment_2_1 )
            {
             before(grammarAccess.getCoverageOfReferencedAccess().getReferenceAssignment_2_1()); 
            // InternalCOV.g:2403:2: ( rule__CoverageOfReferenced__ReferenceAssignment_2_1 )
            // InternalCOV.g:2403:3: rule__CoverageOfReferenced__ReferenceAssignment_2_1
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
    // InternalCOV.g:2412:1: rule__CoverageOfReferenced__Group_3__0 : rule__CoverageOfReferenced__Group_3__0__Impl rule__CoverageOfReferenced__Group_3__1 ;
    public final void rule__CoverageOfReferenced__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2416:1: ( rule__CoverageOfReferenced__Group_3__0__Impl rule__CoverageOfReferenced__Group_3__1 )
            // InternalCOV.g:2417:2: rule__CoverageOfReferenced__Group_3__0__Impl rule__CoverageOfReferenced__Group_3__1
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
    // InternalCOV.g:2424:1: rule__CoverageOfReferenced__Group_3__0__Impl : ( 'description' ) ;
    public final void rule__CoverageOfReferenced__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2428:1: ( ( 'description' ) )
            // InternalCOV.g:2429:1: ( 'description' )
            {
            // InternalCOV.g:2429:1: ( 'description' )
            // InternalCOV.g:2430:2: 'description'
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
    // InternalCOV.g:2439:1: rule__CoverageOfReferenced__Group_3__1 : rule__CoverageOfReferenced__Group_3__1__Impl ;
    public final void rule__CoverageOfReferenced__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2443:1: ( rule__CoverageOfReferenced__Group_3__1__Impl )
            // InternalCOV.g:2444:2: rule__CoverageOfReferenced__Group_3__1__Impl
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
    // InternalCOV.g:2450:1: rule__CoverageOfReferenced__Group_3__1__Impl : ( ( rule__CoverageOfReferenced__DescriptionAssignment_3_1 ) ) ;
    public final void rule__CoverageOfReferenced__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2454:1: ( ( ( rule__CoverageOfReferenced__DescriptionAssignment_3_1 ) ) )
            // InternalCOV.g:2455:1: ( ( rule__CoverageOfReferenced__DescriptionAssignment_3_1 ) )
            {
            // InternalCOV.g:2455:1: ( ( rule__CoverageOfReferenced__DescriptionAssignment_3_1 ) )
            // InternalCOV.g:2456:2: ( rule__CoverageOfReferenced__DescriptionAssignment_3_1 )
            {
             before(grammarAccess.getCoverageOfReferencedAccess().getDescriptionAssignment_3_1()); 
            // InternalCOV.g:2457:2: ( rule__CoverageOfReferenced__DescriptionAssignment_3_1 )
            // InternalCOV.g:2457:3: rule__CoverageOfReferenced__DescriptionAssignment_3_1
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
    // InternalCOV.g:2466:1: rule__CoverageOfReferenced__Group_4__0 : rule__CoverageOfReferenced__Group_4__0__Impl rule__CoverageOfReferenced__Group_4__1 ;
    public final void rule__CoverageOfReferenced__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2470:1: ( rule__CoverageOfReferenced__Group_4__0__Impl rule__CoverageOfReferenced__Group_4__1 )
            // InternalCOV.g:2471:2: rule__CoverageOfReferenced__Group_4__0__Impl rule__CoverageOfReferenced__Group_4__1
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
    // InternalCOV.g:2478:1: rule__CoverageOfReferenced__Group_4__0__Impl : ( 'condition' ) ;
    public final void rule__CoverageOfReferenced__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2482:1: ( ( 'condition' ) )
            // InternalCOV.g:2483:1: ( 'condition' )
            {
            // InternalCOV.g:2483:1: ( 'condition' )
            // InternalCOV.g:2484:2: 'condition'
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
    // InternalCOV.g:2493:1: rule__CoverageOfReferenced__Group_4__1 : rule__CoverageOfReferenced__Group_4__1__Impl ;
    public final void rule__CoverageOfReferenced__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2497:1: ( rule__CoverageOfReferenced__Group_4__1__Impl )
            // InternalCOV.g:2498:2: rule__CoverageOfReferenced__Group_4__1__Impl
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
    // InternalCOV.g:2504:1: rule__CoverageOfReferenced__Group_4__1__Impl : ( ( rule__CoverageOfReferenced__ConditionAssignment_4_1 ) ) ;
    public final void rule__CoverageOfReferenced__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2508:1: ( ( ( rule__CoverageOfReferenced__ConditionAssignment_4_1 ) ) )
            // InternalCOV.g:2509:1: ( ( rule__CoverageOfReferenced__ConditionAssignment_4_1 ) )
            {
            // InternalCOV.g:2509:1: ( ( rule__CoverageOfReferenced__ConditionAssignment_4_1 ) )
            // InternalCOV.g:2510:2: ( rule__CoverageOfReferenced__ConditionAssignment_4_1 )
            {
             before(grammarAccess.getCoverageOfReferencedAccess().getConditionAssignment_4_1()); 
            // InternalCOV.g:2511:2: ( rule__CoverageOfReferenced__ConditionAssignment_4_1 )
            // InternalCOV.g:2511:3: rule__CoverageOfReferenced__ConditionAssignment_4_1
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
    // InternalCOV.g:2520:1: rule__CoverageByContent__Group__0 : rule__CoverageByContent__Group__0__Impl rule__CoverageByContent__Group__1 ;
    public final void rule__CoverageByContent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2524:1: ( rule__CoverageByContent__Group__0__Impl rule__CoverageByContent__Group__1 )
            // InternalCOV.g:2525:2: rule__CoverageByContent__Group__0__Impl rule__CoverageByContent__Group__1
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
    // InternalCOV.g:2532:1: rule__CoverageByContent__Group__0__Impl : ( 'covered' ) ;
    public final void rule__CoverageByContent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2536:1: ( ( 'covered' ) )
            // InternalCOV.g:2537:1: ( 'covered' )
            {
            // InternalCOV.g:2537:1: ( 'covered' )
            // InternalCOV.g:2538:2: 'covered'
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
    // InternalCOV.g:2547:1: rule__CoverageByContent__Group__1 : rule__CoverageByContent__Group__1__Impl rule__CoverageByContent__Group__2 ;
    public final void rule__CoverageByContent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2551:1: ( rule__CoverageByContent__Group__1__Impl rule__CoverageByContent__Group__2 )
            // InternalCOV.g:2552:2: rule__CoverageByContent__Group__1__Impl rule__CoverageByContent__Group__2
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
    // InternalCOV.g:2559:1: rule__CoverageByContent__Group__1__Impl : ( 'when' ) ;
    public final void rule__CoverageByContent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2563:1: ( ( 'when' ) )
            // InternalCOV.g:2564:1: ( 'when' )
            {
            // InternalCOV.g:2564:1: ( 'when' )
            // InternalCOV.g:2565:2: 'when'
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
    // InternalCOV.g:2574:1: rule__CoverageByContent__Group__2 : rule__CoverageByContent__Group__2__Impl rule__CoverageByContent__Group__3 ;
    public final void rule__CoverageByContent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2578:1: ( rule__CoverageByContent__Group__2__Impl rule__CoverageByContent__Group__3 )
            // InternalCOV.g:2579:2: rule__CoverageByContent__Group__2__Impl rule__CoverageByContent__Group__3
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
    // InternalCOV.g:2586:1: rule__CoverageByContent__Group__2__Impl : ( ( rule__CoverageByContent__MultiplicityAssignment_2 ) ) ;
    public final void rule__CoverageByContent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2590:1: ( ( ( rule__CoverageByContent__MultiplicityAssignment_2 ) ) )
            // InternalCOV.g:2591:1: ( ( rule__CoverageByContent__MultiplicityAssignment_2 ) )
            {
            // InternalCOV.g:2591:1: ( ( rule__CoverageByContent__MultiplicityAssignment_2 ) )
            // InternalCOV.g:2592:2: ( rule__CoverageByContent__MultiplicityAssignment_2 )
            {
             before(grammarAccess.getCoverageByContentAccess().getMultiplicityAssignment_2()); 
            // InternalCOV.g:2593:2: ( rule__CoverageByContent__MultiplicityAssignment_2 )
            // InternalCOV.g:2593:3: rule__CoverageByContent__MultiplicityAssignment_2
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
    // InternalCOV.g:2601:1: rule__CoverageByContent__Group__3 : rule__CoverageByContent__Group__3__Impl rule__CoverageByContent__Group__4 ;
    public final void rule__CoverageByContent__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2605:1: ( rule__CoverageByContent__Group__3__Impl rule__CoverageByContent__Group__4 )
            // InternalCOV.g:2606:2: rule__CoverageByContent__Group__3__Impl rule__CoverageByContent__Group__4
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
    // InternalCOV.g:2613:1: rule__CoverageByContent__Group__3__Impl : ( ( rule__CoverageByContent__ContainmentReferenceAssignment_3 ) ) ;
    public final void rule__CoverageByContent__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2617:1: ( ( ( rule__CoverageByContent__ContainmentReferenceAssignment_3 ) ) )
            // InternalCOV.g:2618:1: ( ( rule__CoverageByContent__ContainmentReferenceAssignment_3 ) )
            {
            // InternalCOV.g:2618:1: ( ( rule__CoverageByContent__ContainmentReferenceAssignment_3 ) )
            // InternalCOV.g:2619:2: ( rule__CoverageByContent__ContainmentReferenceAssignment_3 )
            {
             before(grammarAccess.getCoverageByContentAccess().getContainmentReferenceAssignment_3()); 
            // InternalCOV.g:2620:2: ( rule__CoverageByContent__ContainmentReferenceAssignment_3 )
            // InternalCOV.g:2620:3: rule__CoverageByContent__ContainmentReferenceAssignment_3
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
    // InternalCOV.g:2628:1: rule__CoverageByContent__Group__4 : rule__CoverageByContent__Group__4__Impl rule__CoverageByContent__Group__5 ;
    public final void rule__CoverageByContent__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2632:1: ( rule__CoverageByContent__Group__4__Impl rule__CoverageByContent__Group__5 )
            // InternalCOV.g:2633:2: rule__CoverageByContent__Group__4__Impl rule__CoverageByContent__Group__5
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
    // InternalCOV.g:2640:1: rule__CoverageByContent__Group__4__Impl : ( 'iscovered' ) ;
    public final void rule__CoverageByContent__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2644:1: ( ( 'iscovered' ) )
            // InternalCOV.g:2645:1: ( 'iscovered' )
            {
            // InternalCOV.g:2645:1: ( 'iscovered' )
            // InternalCOV.g:2646:2: 'iscovered'
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
    // InternalCOV.g:2655:1: rule__CoverageByContent__Group__5 : rule__CoverageByContent__Group__5__Impl rule__CoverageByContent__Group__6 ;
    public final void rule__CoverageByContent__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2659:1: ( rule__CoverageByContent__Group__5__Impl rule__CoverageByContent__Group__6 )
            // InternalCOV.g:2660:2: rule__CoverageByContent__Group__5__Impl rule__CoverageByContent__Group__6
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
    // InternalCOV.g:2667:1: rule__CoverageByContent__Group__5__Impl : ( ( rule__CoverageByContent__Group_5__0 )? ) ;
    public final void rule__CoverageByContent__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2671:1: ( ( ( rule__CoverageByContent__Group_5__0 )? ) )
            // InternalCOV.g:2672:1: ( ( rule__CoverageByContent__Group_5__0 )? )
            {
            // InternalCOV.g:2672:1: ( ( rule__CoverageByContent__Group_5__0 )? )
            // InternalCOV.g:2673:2: ( rule__CoverageByContent__Group_5__0 )?
            {
             before(grammarAccess.getCoverageByContentAccess().getGroup_5()); 
            // InternalCOV.g:2674:2: ( rule__CoverageByContent__Group_5__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==30) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalCOV.g:2674:3: rule__CoverageByContent__Group_5__0
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
    // InternalCOV.g:2682:1: rule__CoverageByContent__Group__6 : rule__CoverageByContent__Group__6__Impl ;
    public final void rule__CoverageByContent__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2686:1: ( rule__CoverageByContent__Group__6__Impl )
            // InternalCOV.g:2687:2: rule__CoverageByContent__Group__6__Impl
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
    // InternalCOV.g:2693:1: rule__CoverageByContent__Group__6__Impl : ( ( rule__CoverageByContent__Group_6__0 )? ) ;
    public final void rule__CoverageByContent__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2697:1: ( ( ( rule__CoverageByContent__Group_6__0 )? ) )
            // InternalCOV.g:2698:1: ( ( rule__CoverageByContent__Group_6__0 )? )
            {
            // InternalCOV.g:2698:1: ( ( rule__CoverageByContent__Group_6__0 )? )
            // InternalCOV.g:2699:2: ( rule__CoverageByContent__Group_6__0 )?
            {
             before(grammarAccess.getCoverageByContentAccess().getGroup_6()); 
            // InternalCOV.g:2700:2: ( rule__CoverageByContent__Group_6__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==31) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalCOV.g:2700:3: rule__CoverageByContent__Group_6__0
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
    // InternalCOV.g:2709:1: rule__CoverageByContent__Group_5__0 : rule__CoverageByContent__Group_5__0__Impl rule__CoverageByContent__Group_5__1 ;
    public final void rule__CoverageByContent__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2713:1: ( rule__CoverageByContent__Group_5__0__Impl rule__CoverageByContent__Group_5__1 )
            // InternalCOV.g:2714:2: rule__CoverageByContent__Group_5__0__Impl rule__CoverageByContent__Group_5__1
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
    // InternalCOV.g:2721:1: rule__CoverageByContent__Group_5__0__Impl : ( 'description' ) ;
    public final void rule__CoverageByContent__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2725:1: ( ( 'description' ) )
            // InternalCOV.g:2726:1: ( 'description' )
            {
            // InternalCOV.g:2726:1: ( 'description' )
            // InternalCOV.g:2727:2: 'description'
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
    // InternalCOV.g:2736:1: rule__CoverageByContent__Group_5__1 : rule__CoverageByContent__Group_5__1__Impl ;
    public final void rule__CoverageByContent__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2740:1: ( rule__CoverageByContent__Group_5__1__Impl )
            // InternalCOV.g:2741:2: rule__CoverageByContent__Group_5__1__Impl
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
    // InternalCOV.g:2747:1: rule__CoverageByContent__Group_5__1__Impl : ( ( rule__CoverageByContent__DescriptionAssignment_5_1 ) ) ;
    public final void rule__CoverageByContent__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2751:1: ( ( ( rule__CoverageByContent__DescriptionAssignment_5_1 ) ) )
            // InternalCOV.g:2752:1: ( ( rule__CoverageByContent__DescriptionAssignment_5_1 ) )
            {
            // InternalCOV.g:2752:1: ( ( rule__CoverageByContent__DescriptionAssignment_5_1 ) )
            // InternalCOV.g:2753:2: ( rule__CoverageByContent__DescriptionAssignment_5_1 )
            {
             before(grammarAccess.getCoverageByContentAccess().getDescriptionAssignment_5_1()); 
            // InternalCOV.g:2754:2: ( rule__CoverageByContent__DescriptionAssignment_5_1 )
            // InternalCOV.g:2754:3: rule__CoverageByContent__DescriptionAssignment_5_1
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
    // InternalCOV.g:2763:1: rule__CoverageByContent__Group_6__0 : rule__CoverageByContent__Group_6__0__Impl rule__CoverageByContent__Group_6__1 ;
    public final void rule__CoverageByContent__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2767:1: ( rule__CoverageByContent__Group_6__0__Impl rule__CoverageByContent__Group_6__1 )
            // InternalCOV.g:2768:2: rule__CoverageByContent__Group_6__0__Impl rule__CoverageByContent__Group_6__1
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
    // InternalCOV.g:2775:1: rule__CoverageByContent__Group_6__0__Impl : ( 'condition' ) ;
    public final void rule__CoverageByContent__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2779:1: ( ( 'condition' ) )
            // InternalCOV.g:2780:1: ( 'condition' )
            {
            // InternalCOV.g:2780:1: ( 'condition' )
            // InternalCOV.g:2781:2: 'condition'
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
    // InternalCOV.g:2790:1: rule__CoverageByContent__Group_6__1 : rule__CoverageByContent__Group_6__1__Impl ;
    public final void rule__CoverageByContent__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2794:1: ( rule__CoverageByContent__Group_6__1__Impl )
            // InternalCOV.g:2795:2: rule__CoverageByContent__Group_6__1__Impl
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
    // InternalCOV.g:2801:1: rule__CoverageByContent__Group_6__1__Impl : ( ( rule__CoverageByContent__ConditionAssignment_6_1 ) ) ;
    public final void rule__CoverageByContent__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2805:1: ( ( ( rule__CoverageByContent__ConditionAssignment_6_1 ) ) )
            // InternalCOV.g:2806:1: ( ( rule__CoverageByContent__ConditionAssignment_6_1 ) )
            {
            // InternalCOV.g:2806:1: ( ( rule__CoverageByContent__ConditionAssignment_6_1 ) )
            // InternalCOV.g:2807:2: ( rule__CoverageByContent__ConditionAssignment_6_1 )
            {
             before(grammarAccess.getCoverageByContentAccess().getConditionAssignment_6_1()); 
            // InternalCOV.g:2808:2: ( rule__CoverageByContent__ConditionAssignment_6_1 )
            // InternalCOV.g:2808:3: rule__CoverageByContent__ConditionAssignment_6_1
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
    // InternalCOV.g:2817:1: rule__BranchSpecification__Group__0 : rule__BranchSpecification__Group__0__Impl rule__BranchSpecification__Group__1 ;
    public final void rule__BranchSpecification__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2821:1: ( rule__BranchSpecification__Group__0__Impl rule__BranchSpecification__Group__1 )
            // InternalCOV.g:2822:2: rule__BranchSpecification__Group__0__Impl rule__BranchSpecification__Group__1
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
    // InternalCOV.g:2829:1: rule__BranchSpecification__Group__0__Impl : ( 'has' ) ;
    public final void rule__BranchSpecification__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2833:1: ( ( 'has' ) )
            // InternalCOV.g:2834:1: ( 'has' )
            {
            // InternalCOV.g:2834:1: ( 'has' )
            // InternalCOV.g:2835:2: 'has'
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
    // InternalCOV.g:2844:1: rule__BranchSpecification__Group__1 : rule__BranchSpecification__Group__1__Impl rule__BranchSpecification__Group__2 ;
    public final void rule__BranchSpecification__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2848:1: ( rule__BranchSpecification__Group__1__Impl rule__BranchSpecification__Group__2 )
            // InternalCOV.g:2849:2: rule__BranchSpecification__Group__1__Impl rule__BranchSpecification__Group__2
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
    // InternalCOV.g:2856:1: rule__BranchSpecification__Group__1__Impl : ( 'branches' ) ;
    public final void rule__BranchSpecification__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2860:1: ( ( 'branches' ) )
            // InternalCOV.g:2861:1: ( 'branches' )
            {
            // InternalCOV.g:2861:1: ( 'branches' )
            // InternalCOV.g:2862:2: 'branches'
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
    // InternalCOV.g:2871:1: rule__BranchSpecification__Group__2 : rule__BranchSpecification__Group__2__Impl rule__BranchSpecification__Group__3 ;
    public final void rule__BranchSpecification__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2875:1: ( rule__BranchSpecification__Group__2__Impl rule__BranchSpecification__Group__3 )
            // InternalCOV.g:2876:2: rule__BranchSpecification__Group__2__Impl rule__BranchSpecification__Group__3
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
    // InternalCOV.g:2883:1: rule__BranchSpecification__Group__2__Impl : ( '{' ) ;
    public final void rule__BranchSpecification__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2887:1: ( ( '{' ) )
            // InternalCOV.g:2888:1: ( '{' )
            {
            // InternalCOV.g:2888:1: ( '{' )
            // InternalCOV.g:2889:2: '{'
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
    // InternalCOV.g:2898:1: rule__BranchSpecification__Group__3 : rule__BranchSpecification__Group__3__Impl rule__BranchSpecification__Group__4 ;
    public final void rule__BranchSpecification__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2902:1: ( rule__BranchSpecification__Group__3__Impl rule__BranchSpecification__Group__4 )
            // InternalCOV.g:2903:2: rule__BranchSpecification__Group__3__Impl rule__BranchSpecification__Group__4
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
    // InternalCOV.g:2910:1: rule__BranchSpecification__Group__3__Impl : ( ( rule__BranchSpecification__Group_3__0 )? ) ;
    public final void rule__BranchSpecification__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2914:1: ( ( ( rule__BranchSpecification__Group_3__0 )? ) )
            // InternalCOV.g:2915:1: ( ( rule__BranchSpecification__Group_3__0 )? )
            {
            // InternalCOV.g:2915:1: ( ( rule__BranchSpecification__Group_3__0 )? )
            // InternalCOV.g:2916:2: ( rule__BranchSpecification__Group_3__0 )?
            {
             before(grammarAccess.getBranchSpecificationAccess().getGroup_3()); 
            // InternalCOV.g:2917:2: ( rule__BranchSpecification__Group_3__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==30) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalCOV.g:2917:3: rule__BranchSpecification__Group_3__0
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
    // InternalCOV.g:2925:1: rule__BranchSpecification__Group__4 : rule__BranchSpecification__Group__4__Impl rule__BranchSpecification__Group__5 ;
    public final void rule__BranchSpecification__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2929:1: ( rule__BranchSpecification__Group__4__Impl rule__BranchSpecification__Group__5 )
            // InternalCOV.g:2930:2: rule__BranchSpecification__Group__4__Impl rule__BranchSpecification__Group__5
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
    // InternalCOV.g:2937:1: rule__BranchSpecification__Group__4__Impl : ( ( rule__BranchSpecification__Group_4__0 )? ) ;
    public final void rule__BranchSpecification__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2941:1: ( ( ( rule__BranchSpecification__Group_4__0 )? ) )
            // InternalCOV.g:2942:1: ( ( rule__BranchSpecification__Group_4__0 )? )
            {
            // InternalCOV.g:2942:1: ( ( rule__BranchSpecification__Group_4__0 )? )
            // InternalCOV.g:2943:2: ( rule__BranchSpecification__Group_4__0 )?
            {
             before(grammarAccess.getBranchSpecificationAccess().getGroup_4()); 
            // InternalCOV.g:2944:2: ( rule__BranchSpecification__Group_4__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==31) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalCOV.g:2944:3: rule__BranchSpecification__Group_4__0
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
    // InternalCOV.g:2952:1: rule__BranchSpecification__Group__5 : rule__BranchSpecification__Group__5__Impl rule__BranchSpecification__Group__6 ;
    public final void rule__BranchSpecification__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2956:1: ( rule__BranchSpecification__Group__5__Impl rule__BranchSpecification__Group__6 )
            // InternalCOV.g:2957:2: rule__BranchSpecification__Group__5__Impl rule__BranchSpecification__Group__6
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
    // InternalCOV.g:2964:1: rule__BranchSpecification__Group__5__Impl : ( ( rule__BranchSpecification__BranchesAssignment_5 ) ) ;
    public final void rule__BranchSpecification__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2968:1: ( ( ( rule__BranchSpecification__BranchesAssignment_5 ) ) )
            // InternalCOV.g:2969:1: ( ( rule__BranchSpecification__BranchesAssignment_5 ) )
            {
            // InternalCOV.g:2969:1: ( ( rule__BranchSpecification__BranchesAssignment_5 ) )
            // InternalCOV.g:2970:2: ( rule__BranchSpecification__BranchesAssignment_5 )
            {
             before(grammarAccess.getBranchSpecificationAccess().getBranchesAssignment_5()); 
            // InternalCOV.g:2971:2: ( rule__BranchSpecification__BranchesAssignment_5 )
            // InternalCOV.g:2971:3: rule__BranchSpecification__BranchesAssignment_5
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
    // InternalCOV.g:2979:1: rule__BranchSpecification__Group__6 : rule__BranchSpecification__Group__6__Impl rule__BranchSpecification__Group__7 ;
    public final void rule__BranchSpecification__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2983:1: ( rule__BranchSpecification__Group__6__Impl rule__BranchSpecification__Group__7 )
            // InternalCOV.g:2984:2: rule__BranchSpecification__Group__6__Impl rule__BranchSpecification__Group__7
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
    // InternalCOV.g:2991:1: rule__BranchSpecification__Group__6__Impl : ( ( rule__BranchSpecification__Group_6__0 )* ) ;
    public final void rule__BranchSpecification__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2995:1: ( ( ( rule__BranchSpecification__Group_6__0 )* ) )
            // InternalCOV.g:2996:1: ( ( rule__BranchSpecification__Group_6__0 )* )
            {
            // InternalCOV.g:2996:1: ( ( rule__BranchSpecification__Group_6__0 )* )
            // InternalCOV.g:2997:2: ( rule__BranchSpecification__Group_6__0 )*
            {
             before(grammarAccess.getBranchSpecificationAccess().getGroup_6()); 
            // InternalCOV.g:2998:2: ( rule__BranchSpecification__Group_6__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==22) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalCOV.g:2998:3: rule__BranchSpecification__Group_6__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__BranchSpecification__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
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
    // InternalCOV.g:3006:1: rule__BranchSpecification__Group__7 : rule__BranchSpecification__Group__7__Impl ;
    public final void rule__BranchSpecification__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3010:1: ( rule__BranchSpecification__Group__7__Impl )
            // InternalCOV.g:3011:2: rule__BranchSpecification__Group__7__Impl
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
    // InternalCOV.g:3017:1: rule__BranchSpecification__Group__7__Impl : ( '}' ) ;
    public final void rule__BranchSpecification__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3021:1: ( ( '}' ) )
            // InternalCOV.g:3022:1: ( '}' )
            {
            // InternalCOV.g:3022:1: ( '}' )
            // InternalCOV.g:3023:2: '}'
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
    // InternalCOV.g:3033:1: rule__BranchSpecification__Group_3__0 : rule__BranchSpecification__Group_3__0__Impl rule__BranchSpecification__Group_3__1 ;
    public final void rule__BranchSpecification__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3037:1: ( rule__BranchSpecification__Group_3__0__Impl rule__BranchSpecification__Group_3__1 )
            // InternalCOV.g:3038:2: rule__BranchSpecification__Group_3__0__Impl rule__BranchSpecification__Group_3__1
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
    // InternalCOV.g:3045:1: rule__BranchSpecification__Group_3__0__Impl : ( 'description' ) ;
    public final void rule__BranchSpecification__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3049:1: ( ( 'description' ) )
            // InternalCOV.g:3050:1: ( 'description' )
            {
            // InternalCOV.g:3050:1: ( 'description' )
            // InternalCOV.g:3051:2: 'description'
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
    // InternalCOV.g:3060:1: rule__BranchSpecification__Group_3__1 : rule__BranchSpecification__Group_3__1__Impl ;
    public final void rule__BranchSpecification__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3064:1: ( rule__BranchSpecification__Group_3__1__Impl )
            // InternalCOV.g:3065:2: rule__BranchSpecification__Group_3__1__Impl
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
    // InternalCOV.g:3071:1: rule__BranchSpecification__Group_3__1__Impl : ( ( rule__BranchSpecification__DescriptionAssignment_3_1 ) ) ;
    public final void rule__BranchSpecification__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3075:1: ( ( ( rule__BranchSpecification__DescriptionAssignment_3_1 ) ) )
            // InternalCOV.g:3076:1: ( ( rule__BranchSpecification__DescriptionAssignment_3_1 ) )
            {
            // InternalCOV.g:3076:1: ( ( rule__BranchSpecification__DescriptionAssignment_3_1 ) )
            // InternalCOV.g:3077:2: ( rule__BranchSpecification__DescriptionAssignment_3_1 )
            {
             before(grammarAccess.getBranchSpecificationAccess().getDescriptionAssignment_3_1()); 
            // InternalCOV.g:3078:2: ( rule__BranchSpecification__DescriptionAssignment_3_1 )
            // InternalCOV.g:3078:3: rule__BranchSpecification__DescriptionAssignment_3_1
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
    // InternalCOV.g:3087:1: rule__BranchSpecification__Group_4__0 : rule__BranchSpecification__Group_4__0__Impl rule__BranchSpecification__Group_4__1 ;
    public final void rule__BranchSpecification__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3091:1: ( rule__BranchSpecification__Group_4__0__Impl rule__BranchSpecification__Group_4__1 )
            // InternalCOV.g:3092:2: rule__BranchSpecification__Group_4__0__Impl rule__BranchSpecification__Group_4__1
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
    // InternalCOV.g:3099:1: rule__BranchSpecification__Group_4__0__Impl : ( 'condition' ) ;
    public final void rule__BranchSpecification__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3103:1: ( ( 'condition' ) )
            // InternalCOV.g:3104:1: ( 'condition' )
            {
            // InternalCOV.g:3104:1: ( 'condition' )
            // InternalCOV.g:3105:2: 'condition'
            {
             before(grammarAccess.getBranchSpecificationAccess().getConditionKeyword_4_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalCOV.g:3114:1: rule__BranchSpecification__Group_4__1 : rule__BranchSpecification__Group_4__1__Impl ;
    public final void rule__BranchSpecification__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3118:1: ( rule__BranchSpecification__Group_4__1__Impl )
            // InternalCOV.g:3119:2: rule__BranchSpecification__Group_4__1__Impl
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
    // InternalCOV.g:3125:1: rule__BranchSpecification__Group_4__1__Impl : ( ( rule__BranchSpecification__ConditionAssignment_4_1 ) ) ;
    public final void rule__BranchSpecification__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3129:1: ( ( ( rule__BranchSpecification__ConditionAssignment_4_1 ) ) )
            // InternalCOV.g:3130:1: ( ( rule__BranchSpecification__ConditionAssignment_4_1 ) )
            {
            // InternalCOV.g:3130:1: ( ( rule__BranchSpecification__ConditionAssignment_4_1 ) )
            // InternalCOV.g:3131:2: ( rule__BranchSpecification__ConditionAssignment_4_1 )
            {
             before(grammarAccess.getBranchSpecificationAccess().getConditionAssignment_4_1()); 
            // InternalCOV.g:3132:2: ( rule__BranchSpecification__ConditionAssignment_4_1 )
            // InternalCOV.g:3132:3: rule__BranchSpecification__ConditionAssignment_4_1
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
    // InternalCOV.g:3141:1: rule__BranchSpecification__Group_6__0 : rule__BranchSpecification__Group_6__0__Impl rule__BranchSpecification__Group_6__1 ;
    public final void rule__BranchSpecification__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3145:1: ( rule__BranchSpecification__Group_6__0__Impl rule__BranchSpecification__Group_6__1 )
            // InternalCOV.g:3146:2: rule__BranchSpecification__Group_6__0__Impl rule__BranchSpecification__Group_6__1
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
    // InternalCOV.g:3153:1: rule__BranchSpecification__Group_6__0__Impl : ( ',' ) ;
    public final void rule__BranchSpecification__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3157:1: ( ( ',' ) )
            // InternalCOV.g:3158:1: ( ',' )
            {
            // InternalCOV.g:3158:1: ( ',' )
            // InternalCOV.g:3159:2: ','
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
    // InternalCOV.g:3168:1: rule__BranchSpecification__Group_6__1 : rule__BranchSpecification__Group_6__1__Impl ;
    public final void rule__BranchSpecification__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3172:1: ( rule__BranchSpecification__Group_6__1__Impl )
            // InternalCOV.g:3173:2: rule__BranchSpecification__Group_6__1__Impl
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
    // InternalCOV.g:3179:1: rule__BranchSpecification__Group_6__1__Impl : ( ( rule__BranchSpecification__BranchesAssignment_6_1 ) ) ;
    public final void rule__BranchSpecification__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3183:1: ( ( ( rule__BranchSpecification__BranchesAssignment_6_1 ) ) )
            // InternalCOV.g:3184:1: ( ( rule__BranchSpecification__BranchesAssignment_6_1 ) )
            {
            // InternalCOV.g:3184:1: ( ( rule__BranchSpecification__BranchesAssignment_6_1 ) )
            // InternalCOV.g:3185:2: ( rule__BranchSpecification__BranchesAssignment_6_1 )
            {
             before(grammarAccess.getBranchSpecificationAccess().getBranchesAssignment_6_1()); 
            // InternalCOV.g:3186:2: ( rule__BranchSpecification__BranchesAssignment_6_1 )
            // InternalCOV.g:3186:3: rule__BranchSpecification__BranchesAssignment_6_1
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
    // InternalCOV.g:3195:1: rule__Branch__Group__0 : rule__Branch__Group__0__Impl rule__Branch__Group__1 ;
    public final void rule__Branch__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3199:1: ( rule__Branch__Group__0__Impl rule__Branch__Group__1 )
            // InternalCOV.g:3200:2: rule__Branch__Group__0__Impl rule__Branch__Group__1
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
    // InternalCOV.g:3207:1: rule__Branch__Group__0__Impl : ( 'queryBranch' ) ;
    public final void rule__Branch__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3211:1: ( ( 'queryBranch' ) )
            // InternalCOV.g:3212:1: ( 'queryBranch' )
            {
            // InternalCOV.g:3212:1: ( 'queryBranch' )
            // InternalCOV.g:3213:2: 'queryBranch'
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
    // InternalCOV.g:3222:1: rule__Branch__Group__1 : rule__Branch__Group__1__Impl ;
    public final void rule__Branch__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3226:1: ( rule__Branch__Group__1__Impl )
            // InternalCOV.g:3227:2: rule__Branch__Group__1__Impl
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
    // InternalCOV.g:3233:1: rule__Branch__Group__1__Impl : ( ( rule__Branch__OCLQueryAssignment_1 ) ) ;
    public final void rule__Branch__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3237:1: ( ( ( rule__Branch__OCLQueryAssignment_1 ) ) )
            // InternalCOV.g:3238:1: ( ( rule__Branch__OCLQueryAssignment_1 ) )
            {
            // InternalCOV.g:3238:1: ( ( rule__Branch__OCLQueryAssignment_1 ) )
            // InternalCOV.g:3239:2: ( rule__Branch__OCLQueryAssignment_1 )
            {
             before(grammarAccess.getBranchAccess().getOCLQueryAssignment_1()); 
            // InternalCOV.g:3240:2: ( rule__Branch__OCLQueryAssignment_1 )
            // InternalCOV.g:3240:3: rule__Branch__OCLQueryAssignment_1
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
    // InternalCOV.g:3249:1: rule__DomainSpecificCoverage__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__DomainSpecificCoverage__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3253:1: ( ( ruleEString ) )
            // InternalCOV.g:3254:2: ( ruleEString )
            {
            // InternalCOV.g:3254:2: ( ruleEString )
            // InternalCOV.g:3255:3: ruleEString
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
    // InternalCOV.g:3264:1: rule__DomainSpecificCoverage__MetamodelAssignment_5 : ( ( ruleEString ) ) ;
    public final void rule__DomainSpecificCoverage__MetamodelAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3268:1: ( ( ( ruleEString ) ) )
            // InternalCOV.g:3269:2: ( ( ruleEString ) )
            {
            // InternalCOV.g:3269:2: ( ( ruleEString ) )
            // InternalCOV.g:3270:3: ( ruleEString )
            {
             before(grammarAccess.getDomainSpecificCoverageAccess().getMetamodelEPackageCrossReference_5_0()); 
            // InternalCOV.g:3271:3: ( ruleEString )
            // InternalCOV.g:3272:4: ruleEString
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
    // InternalCOV.g:3283:1: rule__DomainSpecificCoverage__CoverageMetricsAssignment_6 : ( ruleCoverageMetric ) ;
    public final void rule__DomainSpecificCoverage__CoverageMetricsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3287:1: ( ( ruleCoverageMetric ) )
            // InternalCOV.g:3288:2: ( ruleCoverageMetric )
            {
            // InternalCOV.g:3288:2: ( ruleCoverageMetric )
            // InternalCOV.g:3289:3: ruleCoverageMetric
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
    // InternalCOV.g:3298:1: rule__DomainSpecificCoverage__CoverageMetricsAssignment_7_1 : ( ruleCoverageMetric ) ;
    public final void rule__DomainSpecificCoverage__CoverageMetricsAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3302:1: ( ( ruleCoverageMetric ) )
            // InternalCOV.g:3303:2: ( ruleCoverageMetric )
            {
            // InternalCOV.g:3303:2: ( ruleCoverageMetric )
            // InternalCOV.g:3304:3: ruleCoverageMetric
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
    // InternalCOV.g:3313:1: rule__ModelElementCoverage__ContextsAssignment_2 : ( ruleContext ) ;
    public final void rule__ModelElementCoverage__ContextsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3317:1: ( ( ruleContext ) )
            // InternalCOV.g:3318:2: ( ruleContext )
            {
            // InternalCOV.g:3318:2: ( ruleContext )
            // InternalCOV.g:3319:3: ruleContext
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
    // InternalCOV.g:3328:1: rule__ModelElementCoverage__ContextsAssignment_3_1 : ( ruleContext ) ;
    public final void rule__ModelElementCoverage__ContextsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3332:1: ( ( ruleContext ) )
            // InternalCOV.g:3333:2: ( ruleContext )
            {
            // InternalCOV.g:3333:2: ( ruleContext )
            // InternalCOV.g:3334:3: ruleContext
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
    // InternalCOV.g:3343:1: rule__BranchCoverage__ContextsAssignment_2_0 : ( ruleContext ) ;
    public final void rule__BranchCoverage__ContextsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3347:1: ( ( ruleContext ) )
            // InternalCOV.g:3348:2: ( ruleContext )
            {
            // InternalCOV.g:3348:2: ( ruleContext )
            // InternalCOV.g:3349:3: ruleContext
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
    // InternalCOV.g:3358:1: rule__BranchCoverage__ContextsAssignment_2_1_1 : ( ruleContext ) ;
    public final void rule__BranchCoverage__ContextsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3362:1: ( ( ruleContext ) )
            // InternalCOV.g:3363:2: ( ruleContext )
            {
            // InternalCOV.g:3363:2: ( ruleContext )
            // InternalCOV.g:3364:3: ruleContext
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


    // $ANTLR start "rule__Context__MetaclassAssignment_1"
    // InternalCOV.g:3373:1: rule__Context__MetaclassAssignment_1 : ( ( ruleEString ) ) ;
    public final void rule__Context__MetaclassAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3377:1: ( ( ( ruleEString ) ) )
            // InternalCOV.g:3378:2: ( ( ruleEString ) )
            {
            // InternalCOV.g:3378:2: ( ( ruleEString ) )
            // InternalCOV.g:3379:3: ( ruleEString )
            {
             before(grammarAccess.getContextAccess().getMetaclassEClassCrossReference_1_0()); 
            // InternalCOV.g:3380:3: ( ruleEString )
            // InternalCOV.g:3381:4: ruleEString
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
    // InternalCOV.g:3392:1: rule__Context__RulesAssignment_3_0 : ( ruleRule ) ;
    public final void rule__Context__RulesAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3396:1: ( ( ruleRule ) )
            // InternalCOV.g:3397:2: ( ruleRule )
            {
            // InternalCOV.g:3397:2: ( ruleRule )
            // InternalCOV.g:3398:3: ruleRule
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
    // InternalCOV.g:3407:1: rule__Context__RulesAssignment_3_1_1 : ( ruleRule ) ;
    public final void rule__Context__RulesAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3411:1: ( ( ruleRule ) )
            // InternalCOV.g:3412:2: ( ruleRule )
            {
            // InternalCOV.g:3412:2: ( ruleRule )
            // InternalCOV.g:3413:3: ruleRule
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
    // InternalCOV.g:3422:1: rule__Ignore__IgnoreSubtypesAssignment_3_1 : ( ruleEBoolean ) ;
    public final void rule__Ignore__IgnoreSubtypesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3426:1: ( ( ruleEBoolean ) )
            // InternalCOV.g:3427:2: ( ruleEBoolean )
            {
            // InternalCOV.g:3427:2: ( ruleEBoolean )
            // InternalCOV.g:3428:3: ruleEBoolean
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
    // InternalCOV.g:3437:1: rule__Ignore__DescriptionAssignment_5_1 : ( ruleEString ) ;
    public final void rule__Ignore__DescriptionAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3441:1: ( ( ruleEString ) )
            // InternalCOV.g:3442:2: ( ruleEString )
            {
            // InternalCOV.g:3442:2: ( ruleEString )
            // InternalCOV.g:3443:3: ruleEString
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
    // InternalCOV.g:3452:1: rule__Ignore__ConditionAssignment_6_1 : ( ruleCondition ) ;
    public final void rule__Ignore__ConditionAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3456:1: ( ( ruleCondition ) )
            // InternalCOV.g:3457:2: ( ruleCondition )
            {
            // InternalCOV.g:3457:2: ( ruleCondition )
            // InternalCOV.g:3458:3: ruleCondition
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
    // InternalCOV.g:3467:1: rule__LimitedIgnore__TypeAssignment_1 : ( ruleLimitationType ) ;
    public final void rule__LimitedIgnore__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3471:1: ( ( ruleLimitationType ) )
            // InternalCOV.g:3472:2: ( ruleLimitationType )
            {
            // InternalCOV.g:3472:2: ( ruleLimitationType )
            // InternalCOV.g:3473:3: ruleLimitationType
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
    // InternalCOV.g:3482:1: rule__LimitedIgnore__ContainerMetaclassAssignment_2 : ( ( ruleEString ) ) ;
    public final void rule__LimitedIgnore__ContainerMetaclassAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3486:1: ( ( ( ruleEString ) ) )
            // InternalCOV.g:3487:2: ( ( ruleEString ) )
            {
            // InternalCOV.g:3487:2: ( ( ruleEString ) )
            // InternalCOV.g:3488:3: ( ruleEString )
            {
             before(grammarAccess.getLimitedIgnoreAccess().getContainerMetaclassEClassCrossReference_2_0()); 
            // InternalCOV.g:3489:3: ( ruleEString )
            // InternalCOV.g:3490:4: ruleEString
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
    // InternalCOV.g:3501:1: rule__LimitedIgnore__ContainerMetaclassAssignment_3_1 : ( ( ruleEString ) ) ;
    public final void rule__LimitedIgnore__ContainerMetaclassAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3505:1: ( ( ( ruleEString ) ) )
            // InternalCOV.g:3506:2: ( ( ruleEString ) )
            {
            // InternalCOV.g:3506:2: ( ( ruleEString ) )
            // InternalCOV.g:3507:3: ( ruleEString )
            {
             before(grammarAccess.getLimitedIgnoreAccess().getContainerMetaclassEClassCrossReference_3_1_0()); 
            // InternalCOV.g:3508:3: ( ruleEString )
            // InternalCOV.g:3509:4: ruleEString
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
    // InternalCOV.g:3520:1: rule__LimitedIgnore__DescriptionAssignment_4_1 : ( ruleEString ) ;
    public final void rule__LimitedIgnore__DescriptionAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3524:1: ( ( ruleEString ) )
            // InternalCOV.g:3525:2: ( ruleEString )
            {
            // InternalCOV.g:3525:2: ( ruleEString )
            // InternalCOV.g:3526:3: ruleEString
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
    // InternalCOV.g:3535:1: rule__LimitedIgnore__ConditionAssignment_5_1 : ( ruleCondition ) ;
    public final void rule__LimitedIgnore__ConditionAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3539:1: ( ( ruleCondition ) )
            // InternalCOV.g:3540:2: ( ruleCondition )
            {
            // InternalCOV.g:3540:2: ( ruleCondition )
            // InternalCOV.g:3541:3: ruleCondition
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
    // InternalCOV.g:3550:1: rule__CoverageOfReferenced__ReferenceAssignment_1 : ( ( ruleEString ) ) ;
    public final void rule__CoverageOfReferenced__ReferenceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3554:1: ( ( ( ruleEString ) ) )
            // InternalCOV.g:3555:2: ( ( ruleEString ) )
            {
            // InternalCOV.g:3555:2: ( ( ruleEString ) )
            // InternalCOV.g:3556:3: ( ruleEString )
            {
             before(grammarAccess.getCoverageOfReferencedAccess().getReferenceEReferenceCrossReference_1_0()); 
            // InternalCOV.g:3557:3: ( ruleEString )
            // InternalCOV.g:3558:4: ruleEString
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
    // InternalCOV.g:3569:1: rule__CoverageOfReferenced__ReferenceAssignment_2_1 : ( ( ruleEString ) ) ;
    public final void rule__CoverageOfReferenced__ReferenceAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3573:1: ( ( ( ruleEString ) ) )
            // InternalCOV.g:3574:2: ( ( ruleEString ) )
            {
            // InternalCOV.g:3574:2: ( ( ruleEString ) )
            // InternalCOV.g:3575:3: ( ruleEString )
            {
             before(grammarAccess.getCoverageOfReferencedAccess().getReferenceEReferenceCrossReference_2_1_0()); 
            // InternalCOV.g:3576:3: ( ruleEString )
            // InternalCOV.g:3577:4: ruleEString
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
    // InternalCOV.g:3588:1: rule__CoverageOfReferenced__DescriptionAssignment_3_1 : ( ruleEString ) ;
    public final void rule__CoverageOfReferenced__DescriptionAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3592:1: ( ( ruleEString ) )
            // InternalCOV.g:3593:2: ( ruleEString )
            {
            // InternalCOV.g:3593:2: ( ruleEString )
            // InternalCOV.g:3594:3: ruleEString
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
    // InternalCOV.g:3603:1: rule__CoverageOfReferenced__ConditionAssignment_4_1 : ( ruleCondition ) ;
    public final void rule__CoverageOfReferenced__ConditionAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3607:1: ( ( ruleCondition ) )
            // InternalCOV.g:3608:2: ( ruleCondition )
            {
            // InternalCOV.g:3608:2: ( ruleCondition )
            // InternalCOV.g:3609:3: ruleCondition
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
    // InternalCOV.g:3618:1: rule__CoverageByContent__MultiplicityAssignment_2 : ( ruleCoveredContents ) ;
    public final void rule__CoverageByContent__MultiplicityAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3622:1: ( ( ruleCoveredContents ) )
            // InternalCOV.g:3623:2: ( ruleCoveredContents )
            {
            // InternalCOV.g:3623:2: ( ruleCoveredContents )
            // InternalCOV.g:3624:3: ruleCoveredContents
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
    // InternalCOV.g:3633:1: rule__CoverageByContent__ContainmentReferenceAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__CoverageByContent__ContainmentReferenceAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3637:1: ( ( ( ruleEString ) ) )
            // InternalCOV.g:3638:2: ( ( ruleEString ) )
            {
            // InternalCOV.g:3638:2: ( ( ruleEString ) )
            // InternalCOV.g:3639:3: ( ruleEString )
            {
             before(grammarAccess.getCoverageByContentAccess().getContainmentReferenceEReferenceCrossReference_3_0()); 
            // InternalCOV.g:3640:3: ( ruleEString )
            // InternalCOV.g:3641:4: ruleEString
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
    // InternalCOV.g:3652:1: rule__CoverageByContent__DescriptionAssignment_5_1 : ( ruleEString ) ;
    public final void rule__CoverageByContent__DescriptionAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3656:1: ( ( ruleEString ) )
            // InternalCOV.g:3657:2: ( ruleEString )
            {
            // InternalCOV.g:3657:2: ( ruleEString )
            // InternalCOV.g:3658:3: ruleEString
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
    // InternalCOV.g:3667:1: rule__CoverageByContent__ConditionAssignment_6_1 : ( ruleCondition ) ;
    public final void rule__CoverageByContent__ConditionAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3671:1: ( ( ruleCondition ) )
            // InternalCOV.g:3672:2: ( ruleCondition )
            {
            // InternalCOV.g:3672:2: ( ruleCondition )
            // InternalCOV.g:3673:3: ruleCondition
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
    // InternalCOV.g:3682:1: rule__BranchSpecification__DescriptionAssignment_3_1 : ( ruleEString ) ;
    public final void rule__BranchSpecification__DescriptionAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3686:1: ( ( ruleEString ) )
            // InternalCOV.g:3687:2: ( ruleEString )
            {
            // InternalCOV.g:3687:2: ( ruleEString )
            // InternalCOV.g:3688:3: ruleEString
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
    // InternalCOV.g:3697:1: rule__BranchSpecification__ConditionAssignment_4_1 : ( ruleCondition ) ;
    public final void rule__BranchSpecification__ConditionAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3701:1: ( ( ruleCondition ) )
            // InternalCOV.g:3702:2: ( ruleCondition )
            {
            // InternalCOV.g:3702:2: ( ruleCondition )
            // InternalCOV.g:3703:3: ruleCondition
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
    // InternalCOV.g:3712:1: rule__BranchSpecification__BranchesAssignment_5 : ( ruleBranch ) ;
    public final void rule__BranchSpecification__BranchesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3716:1: ( ( ruleBranch ) )
            // InternalCOV.g:3717:2: ( ruleBranch )
            {
            // InternalCOV.g:3717:2: ( ruleBranch )
            // InternalCOV.g:3718:3: ruleBranch
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
    // InternalCOV.g:3727:1: rule__BranchSpecification__BranchesAssignment_6_1 : ( ruleBranch ) ;
    public final void rule__BranchSpecification__BranchesAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3731:1: ( ( ruleBranch ) )
            // InternalCOV.g:3732:2: ( ruleBranch )
            {
            // InternalCOV.g:3732:2: ( ruleBranch )
            // InternalCOV.g:3733:3: ruleBranch
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
    // InternalCOV.g:3742:1: rule__Branch__OCLQueryAssignment_1 : ( ruleEString ) ;
    public final void rule__Branch__OCLQueryAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3746:1: ( ( ruleEString ) )
            // InternalCOV.g:3747:2: ( ruleEString )
            {
            // InternalCOV.g:3747:2: ( ruleEString )
            // InternalCOV.g:3748:3: ruleEString
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
    // InternalCOV.g:3757:1: rule__Condition__OCLConstraintAssignment : ( ruleEString ) ;
    public final void rule__Condition__OCLConstraintAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3761:1: ( ( ruleEString ) )
            // InternalCOV.g:3762:2: ( ruleEString )
            {
            // InternalCOV.g:3762:2: ( ruleEString )
            // InternalCOV.g:3763:3: ruleEString
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
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000002200000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000002704200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000002704000000L});
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
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x00000080C0000000L});

}