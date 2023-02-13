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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'true'", "'false'", "'ALL'", "'ONE'", "'containedBy'", "'notContainedBy'", "'ruleset'", "'{'", "'import'", "'metamodel'", "'}'", "','", "'with'", "';'", "'from'", "'::'", "'*'", "'context'", "'ignore'", "'('", "')'", "'when'", "'subtypes'", "'description'", "'ignoreif'", "'covers'", "'covered'", "'iscovered'", "'branch'", "'else'"
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


    // $ANTLR start "entryRuleImport"
    // InternalCOV.g:78:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // InternalCOV.g:79:1: ( ruleImport EOF )
            // InternalCOV.g:80:1: ruleImport EOF
            {
             before(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_1);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getImportRule()); 
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
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalCOV.g:87:1: ruleImport : ( ( rule__Import__Alternatives ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:91:2: ( ( ( rule__Import__Alternatives ) ) )
            // InternalCOV.g:92:2: ( ( rule__Import__Alternatives ) )
            {
            // InternalCOV.g:92:2: ( ( rule__Import__Alternatives ) )
            // InternalCOV.g:93:3: ( rule__Import__Alternatives )
            {
             before(grammarAccess.getImportAccess().getAlternatives()); 
            // InternalCOV.g:94:3: ( rule__Import__Alternatives )
            // InternalCOV.g:94:4: rule__Import__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Import__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalCOV.g:103:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalCOV.g:104:1: ( ruleQualifiedName EOF )
            // InternalCOV.g:105:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalCOV.g:112:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:116:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalCOV.g:117:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalCOV.g:117:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalCOV.g:118:3: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // InternalCOV.g:119:3: ( rule__QualifiedName__Group__0 )
            // InternalCOV.g:119:4: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleImportedFQN"
    // InternalCOV.g:128:1: entryRuleImportedFQN : ruleImportedFQN EOF ;
    public final void entryRuleImportedFQN() throws RecognitionException {
        try {
            // InternalCOV.g:129:1: ( ruleImportedFQN EOF )
            // InternalCOV.g:130:1: ruleImportedFQN EOF
            {
             before(grammarAccess.getImportedFQNRule()); 
            pushFollow(FOLLOW_1);
            ruleImportedFQN();

            state._fsp--;

             after(grammarAccess.getImportedFQNRule()); 
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
    // $ANTLR end "entryRuleImportedFQN"


    // $ANTLR start "ruleImportedFQN"
    // InternalCOV.g:137:1: ruleImportedFQN : ( ( rule__ImportedFQN__Group__0 ) ) ;
    public final void ruleImportedFQN() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:141:2: ( ( ( rule__ImportedFQN__Group__0 ) ) )
            // InternalCOV.g:142:2: ( ( rule__ImportedFQN__Group__0 ) )
            {
            // InternalCOV.g:142:2: ( ( rule__ImportedFQN__Group__0 ) )
            // InternalCOV.g:143:3: ( rule__ImportedFQN__Group__0 )
            {
             before(grammarAccess.getImportedFQNAccess().getGroup()); 
            // InternalCOV.g:144:3: ( rule__ImportedFQN__Group__0 )
            // InternalCOV.g:144:4: rule__ImportedFQN__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ImportedFQN__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImportedFQNAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImportedFQN"


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
    // InternalCOV.g:387:1: ruleBranch : ( ( rule__Branch__Alternatives ) ) ;
    public final void ruleBranch() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:391:2: ( ( ( rule__Branch__Alternatives ) ) )
            // InternalCOV.g:392:2: ( ( rule__Branch__Alternatives ) )
            {
            // InternalCOV.g:392:2: ( ( rule__Branch__Alternatives ) )
            // InternalCOV.g:393:3: ( rule__Branch__Alternatives )
            {
             before(grammarAccess.getBranchAccess().getAlternatives()); 
            // InternalCOV.g:394:3: ( rule__Branch__Alternatives )
            // InternalCOV.g:394:4: rule__Branch__Alternatives
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
    // InternalCOV.g:403:1: entryRuleExplicitBranch : ruleExplicitBranch EOF ;
    public final void entryRuleExplicitBranch() throws RecognitionException {
        try {
            // InternalCOV.g:404:1: ( ruleExplicitBranch EOF )
            // InternalCOV.g:405:1: ruleExplicitBranch EOF
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
    // InternalCOV.g:412:1: ruleExplicitBranch : ( ( rule__ExplicitBranch__Group__0 ) ) ;
    public final void ruleExplicitBranch() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:416:2: ( ( ( rule__ExplicitBranch__Group__0 ) ) )
            // InternalCOV.g:417:2: ( ( rule__ExplicitBranch__Group__0 ) )
            {
            // InternalCOV.g:417:2: ( ( rule__ExplicitBranch__Group__0 ) )
            // InternalCOV.g:418:3: ( rule__ExplicitBranch__Group__0 )
            {
             before(grammarAccess.getExplicitBranchAccess().getGroup()); 
            // InternalCOV.g:419:3: ( rule__ExplicitBranch__Group__0 )
            // InternalCOV.g:419:4: rule__ExplicitBranch__Group__0
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
    // InternalCOV.g:428:1: entryRuleImplicitBranch : ruleImplicitBranch EOF ;
    public final void entryRuleImplicitBranch() throws RecognitionException {
        try {
            // InternalCOV.g:429:1: ( ruleImplicitBranch EOF )
            // InternalCOV.g:430:1: ruleImplicitBranch EOF
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
    // InternalCOV.g:437:1: ruleImplicitBranch : ( ( rule__ImplicitBranch__Group__0 ) ) ;
    public final void ruleImplicitBranch() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:441:2: ( ( ( rule__ImplicitBranch__Group__0 ) ) )
            // InternalCOV.g:442:2: ( ( rule__ImplicitBranch__Group__0 ) )
            {
            // InternalCOV.g:442:2: ( ( rule__ImplicitBranch__Group__0 ) )
            // InternalCOV.g:443:3: ( rule__ImplicitBranch__Group__0 )
            {
             before(grammarAccess.getImplicitBranchAccess().getGroup()); 
            // InternalCOV.g:444:3: ( rule__ImplicitBranch__Group__0 )
            // InternalCOV.g:444:4: rule__ImplicitBranch__Group__0
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
    // InternalCOV.g:453:1: entryRuleCondition : ruleCondition EOF ;
    public final void entryRuleCondition() throws RecognitionException {
        try {
            // InternalCOV.g:454:1: ( ruleCondition EOF )
            // InternalCOV.g:455:1: ruleCondition EOF
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
    // InternalCOV.g:462:1: ruleCondition : ( ( rule__Condition__OCLConstraintAssignment ) ) ;
    public final void ruleCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:466:2: ( ( ( rule__Condition__OCLConstraintAssignment ) ) )
            // InternalCOV.g:467:2: ( ( rule__Condition__OCLConstraintAssignment ) )
            {
            // InternalCOV.g:467:2: ( ( rule__Condition__OCLConstraintAssignment ) )
            // InternalCOV.g:468:3: ( rule__Condition__OCLConstraintAssignment )
            {
             before(grammarAccess.getConditionAccess().getOCLConstraintAssignment()); 
            // InternalCOV.g:469:3: ( rule__Condition__OCLConstraintAssignment )
            // InternalCOV.g:469:4: rule__Condition__OCLConstraintAssignment
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
    // InternalCOV.g:478:1: ruleCoveredContents : ( ( rule__CoveredContents__Alternatives ) ) ;
    public final void ruleCoveredContents() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:482:1: ( ( ( rule__CoveredContents__Alternatives ) ) )
            // InternalCOV.g:483:2: ( ( rule__CoveredContents__Alternatives ) )
            {
            // InternalCOV.g:483:2: ( ( rule__CoveredContents__Alternatives ) )
            // InternalCOV.g:484:3: ( rule__CoveredContents__Alternatives )
            {
             before(grammarAccess.getCoveredContentsAccess().getAlternatives()); 
            // InternalCOV.g:485:3: ( rule__CoveredContents__Alternatives )
            // InternalCOV.g:485:4: rule__CoveredContents__Alternatives
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
    // InternalCOV.g:494:1: ruleLimitationType : ( ( rule__LimitationType__Alternatives ) ) ;
    public final void ruleLimitationType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:498:1: ( ( ( rule__LimitationType__Alternatives ) ) )
            // InternalCOV.g:499:2: ( ( rule__LimitationType__Alternatives ) )
            {
            // InternalCOV.g:499:2: ( ( rule__LimitationType__Alternatives ) )
            // InternalCOV.g:500:3: ( rule__LimitationType__Alternatives )
            {
             before(grammarAccess.getLimitationTypeAccess().getAlternatives()); 
            // InternalCOV.g:501:3: ( rule__LimitationType__Alternatives )
            // InternalCOV.g:501:4: rule__LimitationType__Alternatives
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


    // $ANTLR start "rule__Import__Alternatives"
    // InternalCOV.g:509:1: rule__Import__Alternatives : ( ( ( rule__Import__Group_0__0 ) ) | ( ( rule__Import__Group_1__0 ) ) | ( ( rule__Import__ImportedRulesetAssignment_2 ) ) );
    public final void rule__Import__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:513:1: ( ( ( rule__Import__Group_0__0 ) ) | ( ( rule__Import__Group_1__0 ) ) | ( ( rule__Import__ImportedRulesetAssignment_2 ) ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt1=1;
                }
                break;
            case 25:
                {
                alt1=2;
                }
                break;
            case RULE_STRING:
            case RULE_ID:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalCOV.g:514:2: ( ( rule__Import__Group_0__0 ) )
                    {
                    // InternalCOV.g:514:2: ( ( rule__Import__Group_0__0 ) )
                    // InternalCOV.g:515:3: ( rule__Import__Group_0__0 )
                    {
                     before(grammarAccess.getImportAccess().getGroup_0()); 
                    // InternalCOV.g:516:3: ( rule__Import__Group_0__0 )
                    // InternalCOV.g:516:4: rule__Import__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Import__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getImportAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCOV.g:520:2: ( ( rule__Import__Group_1__0 ) )
                    {
                    // InternalCOV.g:520:2: ( ( rule__Import__Group_1__0 ) )
                    // InternalCOV.g:521:3: ( rule__Import__Group_1__0 )
                    {
                     before(grammarAccess.getImportAccess().getGroup_1()); 
                    // InternalCOV.g:522:3: ( rule__Import__Group_1__0 )
                    // InternalCOV.g:522:4: rule__Import__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Import__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getImportAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalCOV.g:526:2: ( ( rule__Import__ImportedRulesetAssignment_2 ) )
                    {
                    // InternalCOV.g:526:2: ( ( rule__Import__ImportedRulesetAssignment_2 ) )
                    // InternalCOV.g:527:3: ( rule__Import__ImportedRulesetAssignment_2 )
                    {
                     before(grammarAccess.getImportAccess().getImportedRulesetAssignment_2()); 
                    // InternalCOV.g:528:3: ( rule__Import__ImportedRulesetAssignment_2 )
                    // InternalCOV.g:528:4: rule__Import__ImportedRulesetAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Import__ImportedRulesetAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getImportAccess().getImportedRulesetAssignment_2()); 

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
    // $ANTLR end "rule__Import__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalCOV.g:536:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:540:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalCOV.g:541:2: ( RULE_STRING )
                    {
                    // InternalCOV.g:541:2: ( RULE_STRING )
                    // InternalCOV.g:542:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCOV.g:547:2: ( RULE_ID )
                    {
                    // InternalCOV.g:547:2: ( RULE_ID )
                    // InternalCOV.g:548:3: RULE_ID
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
    // InternalCOV.g:557:1: rule__Rule__Alternatives : ( ( ruleIgnore ) | ( ruleLimitedIgnore ) | ( ruleCoverageOfReferenced ) | ( ruleCoverageByContent ) | ( ruleBranchSpecification ) );
    public final void rule__Rule__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:561:1: ( ( ruleIgnore ) | ( ruleLimitedIgnore ) | ( ruleCoverageOfReferenced ) | ( ruleCoverageByContent ) | ( ruleBranchSpecification ) )
            int alt3=5;
            switch ( input.LA(1) ) {
            case 32:
                {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==RULE_STRING) ) {
                    switch ( input.LA(3) ) {
                    case 18:
                        {
                        alt3=5;
                        }
                        break;
                    case 36:
                        {
                        alt3=3;
                        }
                        break;
                    case 29:
                        {
                        alt3=1;
                        }
                        break;
                    case 37:
                        {
                        alt3=4;
                        }
                        break;
                    case 35:
                        {
                        alt3=2;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 7, input);

                        throw nvae;
                    }

                }
                else if ( (LA3_1==RULE_ID) ) {
                    switch ( input.LA(3) ) {
                    case 36:
                        {
                        alt3=3;
                        }
                        break;
                    case 29:
                        {
                        alt3=1;
                        }
                        break;
                    case 37:
                        {
                        alt3=4;
                        }
                        break;
                    case 35:
                        {
                        alt3=2;
                        }
                        break;
                    case 18:
                        {
                        alt3=5;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 8, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
                }
                break;
            case 29:
                {
                alt3=1;
                }
                break;
            case 35:
                {
                alt3=2;
                }
                break;
            case 36:
                {
                alt3=3;
                }
                break;
            case 37:
                {
                alt3=4;
                }
                break;
            case 18:
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
                    // InternalCOV.g:562:2: ( ruleIgnore )
                    {
                    // InternalCOV.g:562:2: ( ruleIgnore )
                    // InternalCOV.g:563:3: ruleIgnore
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
                    // InternalCOV.g:568:2: ( ruleLimitedIgnore )
                    {
                    // InternalCOV.g:568:2: ( ruleLimitedIgnore )
                    // InternalCOV.g:569:3: ruleLimitedIgnore
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
                    // InternalCOV.g:574:2: ( ruleCoverageOfReferenced )
                    {
                    // InternalCOV.g:574:2: ( ruleCoverageOfReferenced )
                    // InternalCOV.g:575:3: ruleCoverageOfReferenced
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
                    // InternalCOV.g:580:2: ( ruleCoverageByContent )
                    {
                    // InternalCOV.g:580:2: ( ruleCoverageByContent )
                    // InternalCOV.g:581:3: ruleCoverageByContent
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
                    // InternalCOV.g:586:2: ( ruleBranchSpecification )
                    {
                    // InternalCOV.g:586:2: ( ruleBranchSpecification )
                    // InternalCOV.g:587:3: ruleBranchSpecification
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
    // InternalCOV.g:596:1: rule__EBoolean__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__EBoolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:600:1: ( ( 'true' ) | ( 'false' ) )
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
                    // InternalCOV.g:601:2: ( 'true' )
                    {
                    // InternalCOV.g:601:2: ( 'true' )
                    // InternalCOV.g:602:3: 'true'
                    {
                     before(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCOV.g:607:2: ( 'false' )
                    {
                    // InternalCOV.g:607:2: ( 'false' )
                    // InternalCOV.g:608:3: 'false'
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
    // InternalCOV.g:617:1: rule__Branch__Alternatives : ( ( ruleExplicitBranch ) | ( ruleImplicitBranch ) );
    public final void rule__Branch__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:621:1: ( ( ruleExplicitBranch ) | ( ruleImplicitBranch ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==39) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==40) ) {
                    alt5=2;
                }
                else if ( ((LA5_1>=RULE_STRING && LA5_1<=RULE_ID)) ) {
                    alt5=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalCOV.g:622:2: ( ruleExplicitBranch )
                    {
                    // InternalCOV.g:622:2: ( ruleExplicitBranch )
                    // InternalCOV.g:623:3: ruleExplicitBranch
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
                    // InternalCOV.g:628:2: ( ruleImplicitBranch )
                    {
                    // InternalCOV.g:628:2: ( ruleImplicitBranch )
                    // InternalCOV.g:629:3: ruleImplicitBranch
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
    // InternalCOV.g:638:1: rule__CoveredContents__Alternatives : ( ( ( 'ALL' ) ) | ( ( 'ONE' ) ) );
    public final void rule__CoveredContents__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:642:1: ( ( ( 'ALL' ) ) | ( ( 'ONE' ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==13) ) {
                alt6=1;
            }
            else if ( (LA6_0==14) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalCOV.g:643:2: ( ( 'ALL' ) )
                    {
                    // InternalCOV.g:643:2: ( ( 'ALL' ) )
                    // InternalCOV.g:644:3: ( 'ALL' )
                    {
                     before(grammarAccess.getCoveredContentsAccess().getALLEnumLiteralDeclaration_0()); 
                    // InternalCOV.g:645:3: ( 'ALL' )
                    // InternalCOV.g:645:4: 'ALL'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getCoveredContentsAccess().getALLEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCOV.g:649:2: ( ( 'ONE' ) )
                    {
                    // InternalCOV.g:649:2: ( ( 'ONE' ) )
                    // InternalCOV.g:650:3: ( 'ONE' )
                    {
                     before(grammarAccess.getCoveredContentsAccess().getONEEnumLiteralDeclaration_1()); 
                    // InternalCOV.g:651:3: ( 'ONE' )
                    // InternalCOV.g:651:4: 'ONE'
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
    // InternalCOV.g:659:1: rule__LimitationType__Alternatives : ( ( ( 'containedBy' ) ) | ( ( 'notContainedBy' ) ) );
    public final void rule__LimitationType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:663:1: ( ( ( 'containedBy' ) ) | ( ( 'notContainedBy' ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==15) ) {
                alt7=1;
            }
            else if ( (LA7_0==16) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalCOV.g:664:2: ( ( 'containedBy' ) )
                    {
                    // InternalCOV.g:664:2: ( ( 'containedBy' ) )
                    // InternalCOV.g:665:3: ( 'containedBy' )
                    {
                     before(grammarAccess.getLimitationTypeAccess().getContainedByEnumLiteralDeclaration_0()); 
                    // InternalCOV.g:666:3: ( 'containedBy' )
                    // InternalCOV.g:666:4: 'containedBy'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getLimitationTypeAccess().getContainedByEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCOV.g:670:2: ( ( 'notContainedBy' ) )
                    {
                    // InternalCOV.g:670:2: ( ( 'notContainedBy' ) )
                    // InternalCOV.g:671:3: ( 'notContainedBy' )
                    {
                     before(grammarAccess.getLimitationTypeAccess().getNotContainedByEnumLiteralDeclaration_1()); 
                    // InternalCOV.g:672:3: ( 'notContainedBy' )
                    // InternalCOV.g:672:4: 'notContainedBy'
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
    // InternalCOV.g:680:1: rule__DomainSpecificCoverage__Group__0 : rule__DomainSpecificCoverage__Group__0__Impl rule__DomainSpecificCoverage__Group__1 ;
    public final void rule__DomainSpecificCoverage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:684:1: ( rule__DomainSpecificCoverage__Group__0__Impl rule__DomainSpecificCoverage__Group__1 )
            // InternalCOV.g:685:2: rule__DomainSpecificCoverage__Group__0__Impl rule__DomainSpecificCoverage__Group__1
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
    // InternalCOV.g:692:1: rule__DomainSpecificCoverage__Group__0__Impl : ( 'ruleset' ) ;
    public final void rule__DomainSpecificCoverage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:696:1: ( ( 'ruleset' ) )
            // InternalCOV.g:697:1: ( 'ruleset' )
            {
            // InternalCOV.g:697:1: ( 'ruleset' )
            // InternalCOV.g:698:2: 'ruleset'
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
    // InternalCOV.g:707:1: rule__DomainSpecificCoverage__Group__1 : rule__DomainSpecificCoverage__Group__1__Impl rule__DomainSpecificCoverage__Group__2 ;
    public final void rule__DomainSpecificCoverage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:711:1: ( rule__DomainSpecificCoverage__Group__1__Impl rule__DomainSpecificCoverage__Group__2 )
            // InternalCOV.g:712:2: rule__DomainSpecificCoverage__Group__1__Impl rule__DomainSpecificCoverage__Group__2
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
    // InternalCOV.g:719:1: rule__DomainSpecificCoverage__Group__1__Impl : ( ( rule__DomainSpecificCoverage__NameAssignment_1 ) ) ;
    public final void rule__DomainSpecificCoverage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:723:1: ( ( ( rule__DomainSpecificCoverage__NameAssignment_1 ) ) )
            // InternalCOV.g:724:1: ( ( rule__DomainSpecificCoverage__NameAssignment_1 ) )
            {
            // InternalCOV.g:724:1: ( ( rule__DomainSpecificCoverage__NameAssignment_1 ) )
            // InternalCOV.g:725:2: ( rule__DomainSpecificCoverage__NameAssignment_1 )
            {
             before(grammarAccess.getDomainSpecificCoverageAccess().getNameAssignment_1()); 
            // InternalCOV.g:726:2: ( rule__DomainSpecificCoverage__NameAssignment_1 )
            // InternalCOV.g:726:3: rule__DomainSpecificCoverage__NameAssignment_1
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
    // InternalCOV.g:734:1: rule__DomainSpecificCoverage__Group__2 : rule__DomainSpecificCoverage__Group__2__Impl rule__DomainSpecificCoverage__Group__3 ;
    public final void rule__DomainSpecificCoverage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:738:1: ( rule__DomainSpecificCoverage__Group__2__Impl rule__DomainSpecificCoverage__Group__3 )
            // InternalCOV.g:739:2: rule__DomainSpecificCoverage__Group__2__Impl rule__DomainSpecificCoverage__Group__3
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
    // InternalCOV.g:746:1: rule__DomainSpecificCoverage__Group__2__Impl : ( '{' ) ;
    public final void rule__DomainSpecificCoverage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:750:1: ( ( '{' ) )
            // InternalCOV.g:751:1: ( '{' )
            {
            // InternalCOV.g:751:1: ( '{' )
            // InternalCOV.g:752:2: '{'
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
    // InternalCOV.g:761:1: rule__DomainSpecificCoverage__Group__3 : rule__DomainSpecificCoverage__Group__3__Impl rule__DomainSpecificCoverage__Group__4 ;
    public final void rule__DomainSpecificCoverage__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:765:1: ( rule__DomainSpecificCoverage__Group__3__Impl rule__DomainSpecificCoverage__Group__4 )
            // InternalCOV.g:766:2: rule__DomainSpecificCoverage__Group__3__Impl rule__DomainSpecificCoverage__Group__4
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
    // InternalCOV.g:773:1: rule__DomainSpecificCoverage__Group__3__Impl : ( 'import' ) ;
    public final void rule__DomainSpecificCoverage__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:777:1: ( ( 'import' ) )
            // InternalCOV.g:778:1: ( 'import' )
            {
            // InternalCOV.g:778:1: ( 'import' )
            // InternalCOV.g:779:2: 'import'
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
    // InternalCOV.g:788:1: rule__DomainSpecificCoverage__Group__4 : rule__DomainSpecificCoverage__Group__4__Impl rule__DomainSpecificCoverage__Group__5 ;
    public final void rule__DomainSpecificCoverage__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:792:1: ( rule__DomainSpecificCoverage__Group__4__Impl rule__DomainSpecificCoverage__Group__5 )
            // InternalCOV.g:793:2: rule__DomainSpecificCoverage__Group__4__Impl rule__DomainSpecificCoverage__Group__5
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
    // InternalCOV.g:800:1: rule__DomainSpecificCoverage__Group__4__Impl : ( 'metamodel' ) ;
    public final void rule__DomainSpecificCoverage__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:804:1: ( ( 'metamodel' ) )
            // InternalCOV.g:805:1: ( 'metamodel' )
            {
            // InternalCOV.g:805:1: ( 'metamodel' )
            // InternalCOV.g:806:2: 'metamodel'
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
    // InternalCOV.g:815:1: rule__DomainSpecificCoverage__Group__5 : rule__DomainSpecificCoverage__Group__5__Impl rule__DomainSpecificCoverage__Group__6 ;
    public final void rule__DomainSpecificCoverage__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:819:1: ( rule__DomainSpecificCoverage__Group__5__Impl rule__DomainSpecificCoverage__Group__6 )
            // InternalCOV.g:820:2: rule__DomainSpecificCoverage__Group__5__Impl rule__DomainSpecificCoverage__Group__6
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
    // InternalCOV.g:827:1: rule__DomainSpecificCoverage__Group__5__Impl : ( ( rule__DomainSpecificCoverage__MetamodelAssignment_5 ) ) ;
    public final void rule__DomainSpecificCoverage__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:831:1: ( ( ( rule__DomainSpecificCoverage__MetamodelAssignment_5 ) ) )
            // InternalCOV.g:832:1: ( ( rule__DomainSpecificCoverage__MetamodelAssignment_5 ) )
            {
            // InternalCOV.g:832:1: ( ( rule__DomainSpecificCoverage__MetamodelAssignment_5 ) )
            // InternalCOV.g:833:2: ( rule__DomainSpecificCoverage__MetamodelAssignment_5 )
            {
             before(grammarAccess.getDomainSpecificCoverageAccess().getMetamodelAssignment_5()); 
            // InternalCOV.g:834:2: ( rule__DomainSpecificCoverage__MetamodelAssignment_5 )
            // InternalCOV.g:834:3: rule__DomainSpecificCoverage__MetamodelAssignment_5
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
    // InternalCOV.g:842:1: rule__DomainSpecificCoverage__Group__6 : rule__DomainSpecificCoverage__Group__6__Impl rule__DomainSpecificCoverage__Group__7 ;
    public final void rule__DomainSpecificCoverage__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:846:1: ( rule__DomainSpecificCoverage__Group__6__Impl rule__DomainSpecificCoverage__Group__7 )
            // InternalCOV.g:847:2: rule__DomainSpecificCoverage__Group__6__Impl rule__DomainSpecificCoverage__Group__7
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
    // InternalCOV.g:854:1: rule__DomainSpecificCoverage__Group__6__Impl : ( ( rule__DomainSpecificCoverage__Group_6__0 )? ) ;
    public final void rule__DomainSpecificCoverage__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:858:1: ( ( ( rule__DomainSpecificCoverage__Group_6__0 )? ) )
            // InternalCOV.g:859:1: ( ( rule__DomainSpecificCoverage__Group_6__0 )? )
            {
            // InternalCOV.g:859:1: ( ( rule__DomainSpecificCoverage__Group_6__0 )? )
            // InternalCOV.g:860:2: ( rule__DomainSpecificCoverage__Group_6__0 )?
            {
             before(grammarAccess.getDomainSpecificCoverageAccess().getGroup_6()); 
            // InternalCOV.g:861:2: ( rule__DomainSpecificCoverage__Group_6__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==19) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalCOV.g:861:3: rule__DomainSpecificCoverage__Group_6__0
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
    // InternalCOV.g:869:1: rule__DomainSpecificCoverage__Group__7 : rule__DomainSpecificCoverage__Group__7__Impl rule__DomainSpecificCoverage__Group__8 ;
    public final void rule__DomainSpecificCoverage__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:873:1: ( rule__DomainSpecificCoverage__Group__7__Impl rule__DomainSpecificCoverage__Group__8 )
            // InternalCOV.g:874:2: rule__DomainSpecificCoverage__Group__7__Impl rule__DomainSpecificCoverage__Group__8
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
    // InternalCOV.g:881:1: rule__DomainSpecificCoverage__Group__7__Impl : ( ( rule__DomainSpecificCoverage__ContextsAssignment_7 ) ) ;
    public final void rule__DomainSpecificCoverage__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:885:1: ( ( ( rule__DomainSpecificCoverage__ContextsAssignment_7 ) ) )
            // InternalCOV.g:886:1: ( ( rule__DomainSpecificCoverage__ContextsAssignment_7 ) )
            {
            // InternalCOV.g:886:1: ( ( rule__DomainSpecificCoverage__ContextsAssignment_7 ) )
            // InternalCOV.g:887:2: ( rule__DomainSpecificCoverage__ContextsAssignment_7 )
            {
             before(grammarAccess.getDomainSpecificCoverageAccess().getContextsAssignment_7()); 
            // InternalCOV.g:888:2: ( rule__DomainSpecificCoverage__ContextsAssignment_7 )
            // InternalCOV.g:888:3: rule__DomainSpecificCoverage__ContextsAssignment_7
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
    // InternalCOV.g:896:1: rule__DomainSpecificCoverage__Group__8 : rule__DomainSpecificCoverage__Group__8__Impl rule__DomainSpecificCoverage__Group__9 ;
    public final void rule__DomainSpecificCoverage__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:900:1: ( rule__DomainSpecificCoverage__Group__8__Impl rule__DomainSpecificCoverage__Group__9 )
            // InternalCOV.g:901:2: rule__DomainSpecificCoverage__Group__8__Impl rule__DomainSpecificCoverage__Group__9
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
    // InternalCOV.g:908:1: rule__DomainSpecificCoverage__Group__8__Impl : ( ( rule__DomainSpecificCoverage__Group_8__0 )* ) ;
    public final void rule__DomainSpecificCoverage__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:912:1: ( ( ( rule__DomainSpecificCoverage__Group_8__0 )* ) )
            // InternalCOV.g:913:1: ( ( rule__DomainSpecificCoverage__Group_8__0 )* )
            {
            // InternalCOV.g:913:1: ( ( rule__DomainSpecificCoverage__Group_8__0 )* )
            // InternalCOV.g:914:2: ( rule__DomainSpecificCoverage__Group_8__0 )*
            {
             before(grammarAccess.getDomainSpecificCoverageAccess().getGroup_8()); 
            // InternalCOV.g:915:2: ( rule__DomainSpecificCoverage__Group_8__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==22) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalCOV.g:915:3: rule__DomainSpecificCoverage__Group_8__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__DomainSpecificCoverage__Group_8__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // InternalCOV.g:923:1: rule__DomainSpecificCoverage__Group__9 : rule__DomainSpecificCoverage__Group__9__Impl ;
    public final void rule__DomainSpecificCoverage__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:927:1: ( rule__DomainSpecificCoverage__Group__9__Impl )
            // InternalCOV.g:928:2: rule__DomainSpecificCoverage__Group__9__Impl
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
    // InternalCOV.g:934:1: rule__DomainSpecificCoverage__Group__9__Impl : ( '}' ) ;
    public final void rule__DomainSpecificCoverage__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:938:1: ( ( '}' ) )
            // InternalCOV.g:939:1: ( '}' )
            {
            // InternalCOV.g:939:1: ( '}' )
            // InternalCOV.g:940:2: '}'
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
    // InternalCOV.g:950:1: rule__DomainSpecificCoverage__Group_6__0 : rule__DomainSpecificCoverage__Group_6__0__Impl rule__DomainSpecificCoverage__Group_6__1 ;
    public final void rule__DomainSpecificCoverage__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:954:1: ( rule__DomainSpecificCoverage__Group_6__0__Impl rule__DomainSpecificCoverage__Group_6__1 )
            // InternalCOV.g:955:2: rule__DomainSpecificCoverage__Group_6__0__Impl rule__DomainSpecificCoverage__Group_6__1
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
    // InternalCOV.g:962:1: rule__DomainSpecificCoverage__Group_6__0__Impl : ( 'import' ) ;
    public final void rule__DomainSpecificCoverage__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:966:1: ( ( 'import' ) )
            // InternalCOV.g:967:1: ( 'import' )
            {
            // InternalCOV.g:967:1: ( 'import' )
            // InternalCOV.g:968:2: 'import'
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
    // InternalCOV.g:977:1: rule__DomainSpecificCoverage__Group_6__1 : rule__DomainSpecificCoverage__Group_6__1__Impl rule__DomainSpecificCoverage__Group_6__2 ;
    public final void rule__DomainSpecificCoverage__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:981:1: ( rule__DomainSpecificCoverage__Group_6__1__Impl rule__DomainSpecificCoverage__Group_6__2 )
            // InternalCOV.g:982:2: rule__DomainSpecificCoverage__Group_6__1__Impl rule__DomainSpecificCoverage__Group_6__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalCOV.g:989:1: rule__DomainSpecificCoverage__Group_6__1__Impl : ( 'ruleset' ) ;
    public final void rule__DomainSpecificCoverage__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:993:1: ( ( 'ruleset' ) )
            // InternalCOV.g:994:1: ( 'ruleset' )
            {
            // InternalCOV.g:994:1: ( 'ruleset' )
            // InternalCOV.g:995:2: 'ruleset'
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
    // InternalCOV.g:1004:1: rule__DomainSpecificCoverage__Group_6__2 : rule__DomainSpecificCoverage__Group_6__2__Impl rule__DomainSpecificCoverage__Group_6__3 ;
    public final void rule__DomainSpecificCoverage__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1008:1: ( rule__DomainSpecificCoverage__Group_6__2__Impl rule__DomainSpecificCoverage__Group_6__3 )
            // InternalCOV.g:1009:2: rule__DomainSpecificCoverage__Group_6__2__Impl rule__DomainSpecificCoverage__Group_6__3
            {
            pushFollow(FOLLOW_12);
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
    // InternalCOV.g:1016:1: rule__DomainSpecificCoverage__Group_6__2__Impl : ( ( rule__DomainSpecificCoverage__ImportsAssignment_6_2 ) ) ;
    public final void rule__DomainSpecificCoverage__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1020:1: ( ( ( rule__DomainSpecificCoverage__ImportsAssignment_6_2 ) ) )
            // InternalCOV.g:1021:1: ( ( rule__DomainSpecificCoverage__ImportsAssignment_6_2 ) )
            {
            // InternalCOV.g:1021:1: ( ( rule__DomainSpecificCoverage__ImportsAssignment_6_2 ) )
            // InternalCOV.g:1022:2: ( rule__DomainSpecificCoverage__ImportsAssignment_6_2 )
            {
             before(grammarAccess.getDomainSpecificCoverageAccess().getImportsAssignment_6_2()); 
            // InternalCOV.g:1023:2: ( rule__DomainSpecificCoverage__ImportsAssignment_6_2 )
            // InternalCOV.g:1023:3: rule__DomainSpecificCoverage__ImportsAssignment_6_2
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
    // InternalCOV.g:1031:1: rule__DomainSpecificCoverage__Group_6__3 : rule__DomainSpecificCoverage__Group_6__3__Impl ;
    public final void rule__DomainSpecificCoverage__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1035:1: ( rule__DomainSpecificCoverage__Group_6__3__Impl )
            // InternalCOV.g:1036:2: rule__DomainSpecificCoverage__Group_6__3__Impl
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
    // InternalCOV.g:1042:1: rule__DomainSpecificCoverage__Group_6__3__Impl : ( ( rule__DomainSpecificCoverage__Group_6_3__0 )* ) ;
    public final void rule__DomainSpecificCoverage__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1046:1: ( ( ( rule__DomainSpecificCoverage__Group_6_3__0 )* ) )
            // InternalCOV.g:1047:1: ( ( rule__DomainSpecificCoverage__Group_6_3__0 )* )
            {
            // InternalCOV.g:1047:1: ( ( rule__DomainSpecificCoverage__Group_6_3__0 )* )
            // InternalCOV.g:1048:2: ( rule__DomainSpecificCoverage__Group_6_3__0 )*
            {
             before(grammarAccess.getDomainSpecificCoverageAccess().getGroup_6_3()); 
            // InternalCOV.g:1049:2: ( rule__DomainSpecificCoverage__Group_6_3__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==22) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalCOV.g:1049:3: rule__DomainSpecificCoverage__Group_6_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__DomainSpecificCoverage__Group_6_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // InternalCOV.g:1058:1: rule__DomainSpecificCoverage__Group_6_3__0 : rule__DomainSpecificCoverage__Group_6_3__0__Impl rule__DomainSpecificCoverage__Group_6_3__1 ;
    public final void rule__DomainSpecificCoverage__Group_6_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1062:1: ( rule__DomainSpecificCoverage__Group_6_3__0__Impl rule__DomainSpecificCoverage__Group_6_3__1 )
            // InternalCOV.g:1063:2: rule__DomainSpecificCoverage__Group_6_3__0__Impl rule__DomainSpecificCoverage__Group_6_3__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalCOV.g:1070:1: rule__DomainSpecificCoverage__Group_6_3__0__Impl : ( ',' ) ;
    public final void rule__DomainSpecificCoverage__Group_6_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1074:1: ( ( ',' ) )
            // InternalCOV.g:1075:1: ( ',' )
            {
            // InternalCOV.g:1075:1: ( ',' )
            // InternalCOV.g:1076:2: ','
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
    // InternalCOV.g:1085:1: rule__DomainSpecificCoverage__Group_6_3__1 : rule__DomainSpecificCoverage__Group_6_3__1__Impl ;
    public final void rule__DomainSpecificCoverage__Group_6_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1089:1: ( rule__DomainSpecificCoverage__Group_6_3__1__Impl )
            // InternalCOV.g:1090:2: rule__DomainSpecificCoverage__Group_6_3__1__Impl
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
    // InternalCOV.g:1096:1: rule__DomainSpecificCoverage__Group_6_3__1__Impl : ( ( rule__DomainSpecificCoverage__ImportsAssignment_6_3_1 ) ) ;
    public final void rule__DomainSpecificCoverage__Group_6_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1100:1: ( ( ( rule__DomainSpecificCoverage__ImportsAssignment_6_3_1 ) ) )
            // InternalCOV.g:1101:1: ( ( rule__DomainSpecificCoverage__ImportsAssignment_6_3_1 ) )
            {
            // InternalCOV.g:1101:1: ( ( rule__DomainSpecificCoverage__ImportsAssignment_6_3_1 ) )
            // InternalCOV.g:1102:2: ( rule__DomainSpecificCoverage__ImportsAssignment_6_3_1 )
            {
             before(grammarAccess.getDomainSpecificCoverageAccess().getImportsAssignment_6_3_1()); 
            // InternalCOV.g:1103:2: ( rule__DomainSpecificCoverage__ImportsAssignment_6_3_1 )
            // InternalCOV.g:1103:3: rule__DomainSpecificCoverage__ImportsAssignment_6_3_1
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
    // InternalCOV.g:1112:1: rule__DomainSpecificCoverage__Group_8__0 : rule__DomainSpecificCoverage__Group_8__0__Impl rule__DomainSpecificCoverage__Group_8__1 ;
    public final void rule__DomainSpecificCoverage__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1116:1: ( rule__DomainSpecificCoverage__Group_8__0__Impl rule__DomainSpecificCoverage__Group_8__1 )
            // InternalCOV.g:1117:2: rule__DomainSpecificCoverage__Group_8__0__Impl rule__DomainSpecificCoverage__Group_8__1
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
    // InternalCOV.g:1124:1: rule__DomainSpecificCoverage__Group_8__0__Impl : ( ',' ) ;
    public final void rule__DomainSpecificCoverage__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1128:1: ( ( ',' ) )
            // InternalCOV.g:1129:1: ( ',' )
            {
            // InternalCOV.g:1129:1: ( ',' )
            // InternalCOV.g:1130:2: ','
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
    // InternalCOV.g:1139:1: rule__DomainSpecificCoverage__Group_8__1 : rule__DomainSpecificCoverage__Group_8__1__Impl ;
    public final void rule__DomainSpecificCoverage__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1143:1: ( rule__DomainSpecificCoverage__Group_8__1__Impl )
            // InternalCOV.g:1144:2: rule__DomainSpecificCoverage__Group_8__1__Impl
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
    // InternalCOV.g:1150:1: rule__DomainSpecificCoverage__Group_8__1__Impl : ( ( rule__DomainSpecificCoverage__ContextsAssignment_8_1 ) ) ;
    public final void rule__DomainSpecificCoverage__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1154:1: ( ( ( rule__DomainSpecificCoverage__ContextsAssignment_8_1 ) ) )
            // InternalCOV.g:1155:1: ( ( rule__DomainSpecificCoverage__ContextsAssignment_8_1 ) )
            {
            // InternalCOV.g:1155:1: ( ( rule__DomainSpecificCoverage__ContextsAssignment_8_1 ) )
            // InternalCOV.g:1156:2: ( rule__DomainSpecificCoverage__ContextsAssignment_8_1 )
            {
             before(grammarAccess.getDomainSpecificCoverageAccess().getContextsAssignment_8_1()); 
            // InternalCOV.g:1157:2: ( rule__DomainSpecificCoverage__ContextsAssignment_8_1 )
            // InternalCOV.g:1157:3: rule__DomainSpecificCoverage__ContextsAssignment_8_1
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


    // $ANTLR start "rule__Import__Group_0__0"
    // InternalCOV.g:1166:1: rule__Import__Group_0__0 : rule__Import__Group_0__0__Impl rule__Import__Group_0__1 ;
    public final void rule__Import__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1170:1: ( rule__Import__Group_0__0__Impl rule__Import__Group_0__1 )
            // InternalCOV.g:1171:2: rule__Import__Group_0__0__Impl rule__Import__Group_0__1
            {
            pushFollow(FOLLOW_13);
            rule__Import__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Import__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group_0__0"


    // $ANTLR start "rule__Import__Group_0__0__Impl"
    // InternalCOV.g:1178:1: rule__Import__Group_0__0__Impl : ( () ) ;
    public final void rule__Import__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1182:1: ( ( () ) )
            // InternalCOV.g:1183:1: ( () )
            {
            // InternalCOV.g:1183:1: ( () )
            // InternalCOV.g:1184:2: ()
            {
             before(grammarAccess.getImportAccess().getImportAction_0_0()); 
            // InternalCOV.g:1185:2: ()
            // InternalCOV.g:1185:3: 
            {
            }

             after(grammarAccess.getImportAccess().getImportAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group_0__0__Impl"


    // $ANTLR start "rule__Import__Group_0__1"
    // InternalCOV.g:1193:1: rule__Import__Group_0__1 : rule__Import__Group_0__1__Impl ;
    public final void rule__Import__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1197:1: ( rule__Import__Group_0__1__Impl )
            // InternalCOV.g:1198:2: rule__Import__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Import__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group_0__1"


    // $ANTLR start "rule__Import__Group_0__1__Impl"
    // InternalCOV.g:1204:1: rule__Import__Group_0__1__Impl : ( ( rule__Import__Group_0_1__0 ) ) ;
    public final void rule__Import__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1208:1: ( ( ( rule__Import__Group_0_1__0 ) ) )
            // InternalCOV.g:1209:1: ( ( rule__Import__Group_0_1__0 ) )
            {
            // InternalCOV.g:1209:1: ( ( rule__Import__Group_0_1__0 ) )
            // InternalCOV.g:1210:2: ( rule__Import__Group_0_1__0 )
            {
             before(grammarAccess.getImportAccess().getGroup_0_1()); 
            // InternalCOV.g:1211:2: ( rule__Import__Group_0_1__0 )
            // InternalCOV.g:1211:3: rule__Import__Group_0_1__0
            {
            pushFollow(FOLLOW_2);
            rule__Import__Group_0_1__0();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getGroup_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group_0__1__Impl"


    // $ANTLR start "rule__Import__Group_0_1__0"
    // InternalCOV.g:1220:1: rule__Import__Group_0_1__0 : rule__Import__Group_0_1__0__Impl rule__Import__Group_0_1__1 ;
    public final void rule__Import__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1224:1: ( rule__Import__Group_0_1__0__Impl rule__Import__Group_0_1__1 )
            // InternalCOV.g:1225:2: rule__Import__Group_0_1__0__Impl rule__Import__Group_0_1__1
            {
            pushFollow(FOLLOW_14);
            rule__Import__Group_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Import__Group_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group_0_1__0"


    // $ANTLR start "rule__Import__Group_0_1__0__Impl"
    // InternalCOV.g:1232:1: rule__Import__Group_0_1__0__Impl : ( 'with' ) ;
    public final void rule__Import__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1236:1: ( ( 'with' ) )
            // InternalCOV.g:1237:1: ( 'with' )
            {
            // InternalCOV.g:1237:1: ( 'with' )
            // InternalCOV.g:1238:2: 'with'
            {
             before(grammarAccess.getImportAccess().getWithKeyword_0_1_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getImportAccess().getWithKeyword_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group_0_1__0__Impl"


    // $ANTLR start "rule__Import__Group_0_1__1"
    // InternalCOV.g:1247:1: rule__Import__Group_0_1__1 : rule__Import__Group_0_1__1__Impl rule__Import__Group_0_1__2 ;
    public final void rule__Import__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1251:1: ( rule__Import__Group_0_1__1__Impl rule__Import__Group_0_1__2 )
            // InternalCOV.g:1252:2: rule__Import__Group_0_1__1__Impl rule__Import__Group_0_1__2
            {
            pushFollow(FOLLOW_15);
            rule__Import__Group_0_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Import__Group_0_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group_0_1__1"


    // $ANTLR start "rule__Import__Group_0_1__1__Impl"
    // InternalCOV.g:1259:1: rule__Import__Group_0_1__1__Impl : ( ( rule__Import__ImportedNamespaceAssignment_0_1_1 ) ) ;
    public final void rule__Import__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1263:1: ( ( ( rule__Import__ImportedNamespaceAssignment_0_1_1 ) ) )
            // InternalCOV.g:1264:1: ( ( rule__Import__ImportedNamespaceAssignment_0_1_1 ) )
            {
            // InternalCOV.g:1264:1: ( ( rule__Import__ImportedNamespaceAssignment_0_1_1 ) )
            // InternalCOV.g:1265:2: ( rule__Import__ImportedNamespaceAssignment_0_1_1 )
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_0_1_1()); 
            // InternalCOV.g:1266:2: ( rule__Import__ImportedNamespaceAssignment_0_1_1 )
            // InternalCOV.g:1266:3: rule__Import__ImportedNamespaceAssignment_0_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Import__ImportedNamespaceAssignment_0_1_1();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getImportedNamespaceAssignment_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group_0_1__1__Impl"


    // $ANTLR start "rule__Import__Group_0_1__2"
    // InternalCOV.g:1274:1: rule__Import__Group_0_1__2 : rule__Import__Group_0_1__2__Impl rule__Import__Group_0_1__3 ;
    public final void rule__Import__Group_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1278:1: ( rule__Import__Group_0_1__2__Impl rule__Import__Group_0_1__3 )
            // InternalCOV.g:1279:2: rule__Import__Group_0_1__2__Impl rule__Import__Group_0_1__3
            {
            pushFollow(FOLLOW_15);
            rule__Import__Group_0_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Import__Group_0_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group_0_1__2"


    // $ANTLR start "rule__Import__Group_0_1__2__Impl"
    // InternalCOV.g:1286:1: rule__Import__Group_0_1__2__Impl : ( ( rule__Import__Group_0_1_2__0 )? ) ;
    public final void rule__Import__Group_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1290:1: ( ( ( rule__Import__Group_0_1_2__0 )? ) )
            // InternalCOV.g:1291:1: ( ( rule__Import__Group_0_1_2__0 )? )
            {
            // InternalCOV.g:1291:1: ( ( rule__Import__Group_0_1_2__0 )? )
            // InternalCOV.g:1292:2: ( rule__Import__Group_0_1_2__0 )?
            {
             before(grammarAccess.getImportAccess().getGroup_0_1_2()); 
            // InternalCOV.g:1293:2: ( rule__Import__Group_0_1_2__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==25) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalCOV.g:1293:3: rule__Import__Group_0_1_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Import__Group_0_1_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getImportAccess().getGroup_0_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group_0_1__2__Impl"


    // $ANTLR start "rule__Import__Group_0_1__3"
    // InternalCOV.g:1301:1: rule__Import__Group_0_1__3 : rule__Import__Group_0_1__3__Impl ;
    public final void rule__Import__Group_0_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1305:1: ( rule__Import__Group_0_1__3__Impl )
            // InternalCOV.g:1306:2: rule__Import__Group_0_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Import__Group_0_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group_0_1__3"


    // $ANTLR start "rule__Import__Group_0_1__3__Impl"
    // InternalCOV.g:1312:1: rule__Import__Group_0_1__3__Impl : ( ';' ) ;
    public final void rule__Import__Group_0_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1316:1: ( ( ';' ) )
            // InternalCOV.g:1317:1: ( ';' )
            {
            // InternalCOV.g:1317:1: ( ';' )
            // InternalCOV.g:1318:2: ';'
            {
             before(grammarAccess.getImportAccess().getSemicolonKeyword_0_1_3()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getImportAccess().getSemicolonKeyword_0_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group_0_1__3__Impl"


    // $ANTLR start "rule__Import__Group_0_1_2__0"
    // InternalCOV.g:1328:1: rule__Import__Group_0_1_2__0 : rule__Import__Group_0_1_2__0__Impl rule__Import__Group_0_1_2__1 ;
    public final void rule__Import__Group_0_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1332:1: ( rule__Import__Group_0_1_2__0__Impl rule__Import__Group_0_1_2__1 )
            // InternalCOV.g:1333:2: rule__Import__Group_0_1_2__0__Impl rule__Import__Group_0_1_2__1
            {
            pushFollow(FOLLOW_16);
            rule__Import__Group_0_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Import__Group_0_1_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group_0_1_2__0"


    // $ANTLR start "rule__Import__Group_0_1_2__0__Impl"
    // InternalCOV.g:1340:1: rule__Import__Group_0_1_2__0__Impl : ( 'from' ) ;
    public final void rule__Import__Group_0_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1344:1: ( ( 'from' ) )
            // InternalCOV.g:1345:1: ( 'from' )
            {
            // InternalCOV.g:1345:1: ( 'from' )
            // InternalCOV.g:1346:2: 'from'
            {
             before(grammarAccess.getImportAccess().getFromKeyword_0_1_2_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getImportAccess().getFromKeyword_0_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group_0_1_2__0__Impl"


    // $ANTLR start "rule__Import__Group_0_1_2__1"
    // InternalCOV.g:1355:1: rule__Import__Group_0_1_2__1 : rule__Import__Group_0_1_2__1__Impl ;
    public final void rule__Import__Group_0_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1359:1: ( rule__Import__Group_0_1_2__1__Impl )
            // InternalCOV.g:1360:2: rule__Import__Group_0_1_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Import__Group_0_1_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group_0_1_2__1"


    // $ANTLR start "rule__Import__Group_0_1_2__1__Impl"
    // InternalCOV.g:1366:1: rule__Import__Group_0_1_2__1__Impl : ( ( rule__Import__ImportURIAssignment_0_1_2_1 ) ) ;
    public final void rule__Import__Group_0_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1370:1: ( ( ( rule__Import__ImportURIAssignment_0_1_2_1 ) ) )
            // InternalCOV.g:1371:1: ( ( rule__Import__ImportURIAssignment_0_1_2_1 ) )
            {
            // InternalCOV.g:1371:1: ( ( rule__Import__ImportURIAssignment_0_1_2_1 ) )
            // InternalCOV.g:1372:2: ( rule__Import__ImportURIAssignment_0_1_2_1 )
            {
             before(grammarAccess.getImportAccess().getImportURIAssignment_0_1_2_1()); 
            // InternalCOV.g:1373:2: ( rule__Import__ImportURIAssignment_0_1_2_1 )
            // InternalCOV.g:1373:3: rule__Import__ImportURIAssignment_0_1_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Import__ImportURIAssignment_0_1_2_1();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getImportURIAssignment_0_1_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group_0_1_2__1__Impl"


    // $ANTLR start "rule__Import__Group_1__0"
    // InternalCOV.g:1382:1: rule__Import__Group_1__0 : rule__Import__Group_1__0__Impl rule__Import__Group_1__1 ;
    public final void rule__Import__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1386:1: ( rule__Import__Group_1__0__Impl rule__Import__Group_1__1 )
            // InternalCOV.g:1387:2: rule__Import__Group_1__0__Impl rule__Import__Group_1__1
            {
            pushFollow(FOLLOW_16);
            rule__Import__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Import__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group_1__0"


    // $ANTLR start "rule__Import__Group_1__0__Impl"
    // InternalCOV.g:1394:1: rule__Import__Group_1__0__Impl : ( 'from' ) ;
    public final void rule__Import__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1398:1: ( ( 'from' ) )
            // InternalCOV.g:1399:1: ( 'from' )
            {
            // InternalCOV.g:1399:1: ( 'from' )
            // InternalCOV.g:1400:2: 'from'
            {
             before(grammarAccess.getImportAccess().getFromKeyword_1_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getImportAccess().getFromKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group_1__0__Impl"


    // $ANTLR start "rule__Import__Group_1__1"
    // InternalCOV.g:1409:1: rule__Import__Group_1__1 : rule__Import__Group_1__1__Impl rule__Import__Group_1__2 ;
    public final void rule__Import__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1413:1: ( rule__Import__Group_1__1__Impl rule__Import__Group_1__2 )
            // InternalCOV.g:1414:2: rule__Import__Group_1__1__Impl rule__Import__Group_1__2
            {
            pushFollow(FOLLOW_17);
            rule__Import__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Import__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group_1__1"


    // $ANTLR start "rule__Import__Group_1__1__Impl"
    // InternalCOV.g:1421:1: rule__Import__Group_1__1__Impl : ( ( rule__Import__ImportURIAssignment_1_1 ) ) ;
    public final void rule__Import__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1425:1: ( ( ( rule__Import__ImportURIAssignment_1_1 ) ) )
            // InternalCOV.g:1426:1: ( ( rule__Import__ImportURIAssignment_1_1 ) )
            {
            // InternalCOV.g:1426:1: ( ( rule__Import__ImportURIAssignment_1_1 ) )
            // InternalCOV.g:1427:2: ( rule__Import__ImportURIAssignment_1_1 )
            {
             before(grammarAccess.getImportAccess().getImportURIAssignment_1_1()); 
            // InternalCOV.g:1428:2: ( rule__Import__ImportURIAssignment_1_1 )
            // InternalCOV.g:1428:3: rule__Import__ImportURIAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Import__ImportURIAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getImportURIAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group_1__1__Impl"


    // $ANTLR start "rule__Import__Group_1__2"
    // InternalCOV.g:1436:1: rule__Import__Group_1__2 : rule__Import__Group_1__2__Impl ;
    public final void rule__Import__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1440:1: ( rule__Import__Group_1__2__Impl )
            // InternalCOV.g:1441:2: rule__Import__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Import__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group_1__2"


    // $ANTLR start "rule__Import__Group_1__2__Impl"
    // InternalCOV.g:1447:1: rule__Import__Group_1__2__Impl : ( ';' ) ;
    public final void rule__Import__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1451:1: ( ( ';' ) )
            // InternalCOV.g:1452:1: ( ';' )
            {
            // InternalCOV.g:1452:1: ( ';' )
            // InternalCOV.g:1453:2: ';'
            {
             before(grammarAccess.getImportAccess().getSemicolonKeyword_1_2()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getImportAccess().getSemicolonKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group_1__2__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // InternalCOV.g:1463:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1467:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalCOV.g:1468:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // InternalCOV.g:1475:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1479:1: ( ( RULE_ID ) )
            // InternalCOV.g:1480:1: ( RULE_ID )
            {
            // InternalCOV.g:1480:1: ( RULE_ID )
            // InternalCOV.g:1481:2: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // InternalCOV.g:1490:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1494:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalCOV.g:1495:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // InternalCOV.g:1501:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1505:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalCOV.g:1506:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalCOV.g:1506:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalCOV.g:1507:2: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalCOV.g:1508:2: ( rule__QualifiedName__Group_1__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==26) ) {
                    int LA12_2 = input.LA(2);

                    if ( (LA12_2==RULE_ID) ) {
                        alt12=1;
                    }


                }


                switch (alt12) {
            	case 1 :
            	    // InternalCOV.g:1508:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // InternalCOV.g:1517:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1521:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalCOV.g:1522:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_14);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // InternalCOV.g:1529:1: rule__QualifiedName__Group_1__0__Impl : ( '::' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1533:1: ( ( '::' ) )
            // InternalCOV.g:1534:1: ( '::' )
            {
            // InternalCOV.g:1534:1: ( '::' )
            // InternalCOV.g:1535:2: '::'
            {
             before(grammarAccess.getQualifiedNameAccess().getColonColonKeyword_1_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getColonColonKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // InternalCOV.g:1544:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1548:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalCOV.g:1549:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // InternalCOV.g:1555:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1559:1: ( ( RULE_ID ) )
            // InternalCOV.g:1560:1: ( RULE_ID )
            {
            // InternalCOV.g:1560:1: ( RULE_ID )
            // InternalCOV.g:1561:2: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__ImportedFQN__Group__0"
    // InternalCOV.g:1571:1: rule__ImportedFQN__Group__0 : rule__ImportedFQN__Group__0__Impl rule__ImportedFQN__Group__1 ;
    public final void rule__ImportedFQN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1575:1: ( rule__ImportedFQN__Group__0__Impl rule__ImportedFQN__Group__1 )
            // InternalCOV.g:1576:2: rule__ImportedFQN__Group__0__Impl rule__ImportedFQN__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__ImportedFQN__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImportedFQN__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportedFQN__Group__0"


    // $ANTLR start "rule__ImportedFQN__Group__0__Impl"
    // InternalCOV.g:1583:1: rule__ImportedFQN__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__ImportedFQN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1587:1: ( ( ruleQualifiedName ) )
            // InternalCOV.g:1588:1: ( ruleQualifiedName )
            {
            // InternalCOV.g:1588:1: ( ruleQualifiedName )
            // InternalCOV.g:1589:2: ruleQualifiedName
            {
             before(grammarAccess.getImportedFQNAccess().getQualifiedNameParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getImportedFQNAccess().getQualifiedNameParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportedFQN__Group__0__Impl"


    // $ANTLR start "rule__ImportedFQN__Group__1"
    // InternalCOV.g:1598:1: rule__ImportedFQN__Group__1 : rule__ImportedFQN__Group__1__Impl ;
    public final void rule__ImportedFQN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1602:1: ( rule__ImportedFQN__Group__1__Impl )
            // InternalCOV.g:1603:2: rule__ImportedFQN__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ImportedFQN__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportedFQN__Group__1"


    // $ANTLR start "rule__ImportedFQN__Group__1__Impl"
    // InternalCOV.g:1609:1: rule__ImportedFQN__Group__1__Impl : ( ( rule__ImportedFQN__Group_1__0 )? ) ;
    public final void rule__ImportedFQN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1613:1: ( ( ( rule__ImportedFQN__Group_1__0 )? ) )
            // InternalCOV.g:1614:1: ( ( rule__ImportedFQN__Group_1__0 )? )
            {
            // InternalCOV.g:1614:1: ( ( rule__ImportedFQN__Group_1__0 )? )
            // InternalCOV.g:1615:2: ( rule__ImportedFQN__Group_1__0 )?
            {
             before(grammarAccess.getImportedFQNAccess().getGroup_1()); 
            // InternalCOV.g:1616:2: ( rule__ImportedFQN__Group_1__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==26) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalCOV.g:1616:3: rule__ImportedFQN__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ImportedFQN__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getImportedFQNAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportedFQN__Group__1__Impl"


    // $ANTLR start "rule__ImportedFQN__Group_1__0"
    // InternalCOV.g:1625:1: rule__ImportedFQN__Group_1__0 : rule__ImportedFQN__Group_1__0__Impl rule__ImportedFQN__Group_1__1 ;
    public final void rule__ImportedFQN__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1629:1: ( rule__ImportedFQN__Group_1__0__Impl rule__ImportedFQN__Group_1__1 )
            // InternalCOV.g:1630:2: rule__ImportedFQN__Group_1__0__Impl rule__ImportedFQN__Group_1__1
            {
            pushFollow(FOLLOW_20);
            rule__ImportedFQN__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImportedFQN__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportedFQN__Group_1__0"


    // $ANTLR start "rule__ImportedFQN__Group_1__0__Impl"
    // InternalCOV.g:1637:1: rule__ImportedFQN__Group_1__0__Impl : ( '::' ) ;
    public final void rule__ImportedFQN__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1641:1: ( ( '::' ) )
            // InternalCOV.g:1642:1: ( '::' )
            {
            // InternalCOV.g:1642:1: ( '::' )
            // InternalCOV.g:1643:2: '::'
            {
             before(grammarAccess.getImportedFQNAccess().getColonColonKeyword_1_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getImportedFQNAccess().getColonColonKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportedFQN__Group_1__0__Impl"


    // $ANTLR start "rule__ImportedFQN__Group_1__1"
    // InternalCOV.g:1652:1: rule__ImportedFQN__Group_1__1 : rule__ImportedFQN__Group_1__1__Impl ;
    public final void rule__ImportedFQN__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1656:1: ( rule__ImportedFQN__Group_1__1__Impl )
            // InternalCOV.g:1657:2: rule__ImportedFQN__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ImportedFQN__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportedFQN__Group_1__1"


    // $ANTLR start "rule__ImportedFQN__Group_1__1__Impl"
    // InternalCOV.g:1663:1: rule__ImportedFQN__Group_1__1__Impl : ( '*' ) ;
    public final void rule__ImportedFQN__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1667:1: ( ( '*' ) )
            // InternalCOV.g:1668:1: ( '*' )
            {
            // InternalCOV.g:1668:1: ( '*' )
            // InternalCOV.g:1669:2: '*'
            {
             before(grammarAccess.getImportedFQNAccess().getAsteriskKeyword_1_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getImportedFQNAccess().getAsteriskKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportedFQN__Group_1__1__Impl"


    // $ANTLR start "rule__Context__Group__0"
    // InternalCOV.g:1679:1: rule__Context__Group__0 : rule__Context__Group__0__Impl rule__Context__Group__1 ;
    public final void rule__Context__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1683:1: ( rule__Context__Group__0__Impl rule__Context__Group__1 )
            // InternalCOV.g:1684:2: rule__Context__Group__0__Impl rule__Context__Group__1
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
    // InternalCOV.g:1691:1: rule__Context__Group__0__Impl : ( 'context' ) ;
    public final void rule__Context__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1695:1: ( ( 'context' ) )
            // InternalCOV.g:1696:1: ( 'context' )
            {
            // InternalCOV.g:1696:1: ( 'context' )
            // InternalCOV.g:1697:2: 'context'
            {
             before(grammarAccess.getContextAccess().getContextKeyword_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalCOV.g:1706:1: rule__Context__Group__1 : rule__Context__Group__1__Impl rule__Context__Group__2 ;
    public final void rule__Context__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1710:1: ( rule__Context__Group__1__Impl rule__Context__Group__2 )
            // InternalCOV.g:1711:2: rule__Context__Group__1__Impl rule__Context__Group__2
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
    // InternalCOV.g:1718:1: rule__Context__Group__1__Impl : ( ( rule__Context__MetaclassAssignment_1 ) ) ;
    public final void rule__Context__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1722:1: ( ( ( rule__Context__MetaclassAssignment_1 ) ) )
            // InternalCOV.g:1723:1: ( ( rule__Context__MetaclassAssignment_1 ) )
            {
            // InternalCOV.g:1723:1: ( ( rule__Context__MetaclassAssignment_1 ) )
            // InternalCOV.g:1724:2: ( rule__Context__MetaclassAssignment_1 )
            {
             before(grammarAccess.getContextAccess().getMetaclassAssignment_1()); 
            // InternalCOV.g:1725:2: ( rule__Context__MetaclassAssignment_1 )
            // InternalCOV.g:1725:3: rule__Context__MetaclassAssignment_1
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
    // InternalCOV.g:1733:1: rule__Context__Group__2 : rule__Context__Group__2__Impl rule__Context__Group__3 ;
    public final void rule__Context__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1737:1: ( rule__Context__Group__2__Impl rule__Context__Group__3 )
            // InternalCOV.g:1738:2: rule__Context__Group__2__Impl rule__Context__Group__3
            {
            pushFollow(FOLLOW_21);
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
    // InternalCOV.g:1745:1: rule__Context__Group__2__Impl : ( '{' ) ;
    public final void rule__Context__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1749:1: ( ( '{' ) )
            // InternalCOV.g:1750:1: ( '{' )
            {
            // InternalCOV.g:1750:1: ( '{' )
            // InternalCOV.g:1751:2: '{'
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
    // InternalCOV.g:1760:1: rule__Context__Group__3 : rule__Context__Group__3__Impl rule__Context__Group__4 ;
    public final void rule__Context__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1764:1: ( rule__Context__Group__3__Impl rule__Context__Group__4 )
            // InternalCOV.g:1765:2: rule__Context__Group__3__Impl rule__Context__Group__4
            {
            pushFollow(FOLLOW_21);
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
    // InternalCOV.g:1772:1: rule__Context__Group__3__Impl : ( ( rule__Context__Group_3__0 )? ) ;
    public final void rule__Context__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1776:1: ( ( ( rule__Context__Group_3__0 )? ) )
            // InternalCOV.g:1777:1: ( ( rule__Context__Group_3__0 )? )
            {
            // InternalCOV.g:1777:1: ( ( rule__Context__Group_3__0 )? )
            // InternalCOV.g:1778:2: ( rule__Context__Group_3__0 )?
            {
             before(grammarAccess.getContextAccess().getGroup_3()); 
            // InternalCOV.g:1779:2: ( rule__Context__Group_3__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==18||LA14_0==29||LA14_0==32||(LA14_0>=35 && LA14_0<=37)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalCOV.g:1779:3: rule__Context__Group_3__0
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
    // InternalCOV.g:1787:1: rule__Context__Group__4 : rule__Context__Group__4__Impl ;
    public final void rule__Context__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1791:1: ( rule__Context__Group__4__Impl )
            // InternalCOV.g:1792:2: rule__Context__Group__4__Impl
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
    // InternalCOV.g:1798:1: rule__Context__Group__4__Impl : ( '}' ) ;
    public final void rule__Context__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1802:1: ( ( '}' ) )
            // InternalCOV.g:1803:1: ( '}' )
            {
            // InternalCOV.g:1803:1: ( '}' )
            // InternalCOV.g:1804:2: '}'
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
    // InternalCOV.g:1814:1: rule__Context__Group_3__0 : rule__Context__Group_3__0__Impl rule__Context__Group_3__1 ;
    public final void rule__Context__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1818:1: ( rule__Context__Group_3__0__Impl rule__Context__Group_3__1 )
            // InternalCOV.g:1819:2: rule__Context__Group_3__0__Impl rule__Context__Group_3__1
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
    // InternalCOV.g:1826:1: rule__Context__Group_3__0__Impl : ( ( rule__Context__RulesAssignment_3_0 ) ) ;
    public final void rule__Context__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1830:1: ( ( ( rule__Context__RulesAssignment_3_0 ) ) )
            // InternalCOV.g:1831:1: ( ( rule__Context__RulesAssignment_3_0 ) )
            {
            // InternalCOV.g:1831:1: ( ( rule__Context__RulesAssignment_3_0 ) )
            // InternalCOV.g:1832:2: ( rule__Context__RulesAssignment_3_0 )
            {
             before(grammarAccess.getContextAccess().getRulesAssignment_3_0()); 
            // InternalCOV.g:1833:2: ( rule__Context__RulesAssignment_3_0 )
            // InternalCOV.g:1833:3: rule__Context__RulesAssignment_3_0
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
    // InternalCOV.g:1841:1: rule__Context__Group_3__1 : rule__Context__Group_3__1__Impl ;
    public final void rule__Context__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1845:1: ( rule__Context__Group_3__1__Impl )
            // InternalCOV.g:1846:2: rule__Context__Group_3__1__Impl
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
    // InternalCOV.g:1852:1: rule__Context__Group_3__1__Impl : ( ( rule__Context__Group_3_1__0 )* ) ;
    public final void rule__Context__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1856:1: ( ( ( rule__Context__Group_3_1__0 )* ) )
            // InternalCOV.g:1857:1: ( ( rule__Context__Group_3_1__0 )* )
            {
            // InternalCOV.g:1857:1: ( ( rule__Context__Group_3_1__0 )* )
            // InternalCOV.g:1858:2: ( rule__Context__Group_3_1__0 )*
            {
             before(grammarAccess.getContextAccess().getGroup_3_1()); 
            // InternalCOV.g:1859:2: ( rule__Context__Group_3_1__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==22) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalCOV.g:1859:3: rule__Context__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Context__Group_3_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // InternalCOV.g:1868:1: rule__Context__Group_3_1__0 : rule__Context__Group_3_1__0__Impl rule__Context__Group_3_1__1 ;
    public final void rule__Context__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1872:1: ( rule__Context__Group_3_1__0__Impl rule__Context__Group_3_1__1 )
            // InternalCOV.g:1873:2: rule__Context__Group_3_1__0__Impl rule__Context__Group_3_1__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalCOV.g:1880:1: rule__Context__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__Context__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1884:1: ( ( ',' ) )
            // InternalCOV.g:1885:1: ( ',' )
            {
            // InternalCOV.g:1885:1: ( ',' )
            // InternalCOV.g:1886:2: ','
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
    // InternalCOV.g:1895:1: rule__Context__Group_3_1__1 : rule__Context__Group_3_1__1__Impl ;
    public final void rule__Context__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1899:1: ( rule__Context__Group_3_1__1__Impl )
            // InternalCOV.g:1900:2: rule__Context__Group_3_1__1__Impl
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
    // InternalCOV.g:1906:1: rule__Context__Group_3_1__1__Impl : ( ( rule__Context__RulesAssignment_3_1_1 ) ) ;
    public final void rule__Context__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1910:1: ( ( ( rule__Context__RulesAssignment_3_1_1 ) ) )
            // InternalCOV.g:1911:1: ( ( rule__Context__RulesAssignment_3_1_1 ) )
            {
            // InternalCOV.g:1911:1: ( ( rule__Context__RulesAssignment_3_1_1 ) )
            // InternalCOV.g:1912:2: ( rule__Context__RulesAssignment_3_1_1 )
            {
             before(grammarAccess.getContextAccess().getRulesAssignment_3_1_1()); 
            // InternalCOV.g:1913:2: ( rule__Context__RulesAssignment_3_1_1 )
            // InternalCOV.g:1913:3: rule__Context__RulesAssignment_3_1_1
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
    // InternalCOV.g:1922:1: rule__Ignore__Group__0 : rule__Ignore__Group__0__Impl rule__Ignore__Group__1 ;
    public final void rule__Ignore__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1926:1: ( rule__Ignore__Group__0__Impl rule__Ignore__Group__1 )
            // InternalCOV.g:1927:2: rule__Ignore__Group__0__Impl rule__Ignore__Group__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalCOV.g:1934:1: rule__Ignore__Group__0__Impl : ( () ) ;
    public final void rule__Ignore__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1938:1: ( ( () ) )
            // InternalCOV.g:1939:1: ( () )
            {
            // InternalCOV.g:1939:1: ( () )
            // InternalCOV.g:1940:2: ()
            {
             before(grammarAccess.getIgnoreAccess().getIgnoreAction_0()); 
            // InternalCOV.g:1941:2: ()
            // InternalCOV.g:1941:3: 
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
    // InternalCOV.g:1949:1: rule__Ignore__Group__1 : rule__Ignore__Group__1__Impl rule__Ignore__Group__2 ;
    public final void rule__Ignore__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1953:1: ( rule__Ignore__Group__1__Impl rule__Ignore__Group__2 )
            // InternalCOV.g:1954:2: rule__Ignore__Group__1__Impl rule__Ignore__Group__2
            {
            pushFollow(FOLLOW_23);
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
    // InternalCOV.g:1961:1: rule__Ignore__Group__1__Impl : ( ( rule__Ignore__Group_1__0 )? ) ;
    public final void rule__Ignore__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1965:1: ( ( ( rule__Ignore__Group_1__0 )? ) )
            // InternalCOV.g:1966:1: ( ( rule__Ignore__Group_1__0 )? )
            {
            // InternalCOV.g:1966:1: ( ( rule__Ignore__Group_1__0 )? )
            // InternalCOV.g:1967:2: ( rule__Ignore__Group_1__0 )?
            {
             before(grammarAccess.getIgnoreAccess().getGroup_1()); 
            // InternalCOV.g:1968:2: ( rule__Ignore__Group_1__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==32) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalCOV.g:1968:3: rule__Ignore__Group_1__0
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
    // InternalCOV.g:1976:1: rule__Ignore__Group__2 : rule__Ignore__Group__2__Impl rule__Ignore__Group__3 ;
    public final void rule__Ignore__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1980:1: ( rule__Ignore__Group__2__Impl rule__Ignore__Group__3 )
            // InternalCOV.g:1981:2: rule__Ignore__Group__2__Impl rule__Ignore__Group__3
            {
            pushFollow(FOLLOW_24);
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
    // InternalCOV.g:1988:1: rule__Ignore__Group__2__Impl : ( 'ignore' ) ;
    public final void rule__Ignore__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:1992:1: ( ( 'ignore' ) )
            // InternalCOV.g:1993:1: ( 'ignore' )
            {
            // InternalCOV.g:1993:1: ( 'ignore' )
            // InternalCOV.g:1994:2: 'ignore'
            {
             before(grammarAccess.getIgnoreAccess().getIgnoreKeyword_2()); 
            match(input,29,FOLLOW_2); 
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
    // InternalCOV.g:2003:1: rule__Ignore__Group__3 : rule__Ignore__Group__3__Impl rule__Ignore__Group__4 ;
    public final void rule__Ignore__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2007:1: ( rule__Ignore__Group__3__Impl rule__Ignore__Group__4 )
            // InternalCOV.g:2008:2: rule__Ignore__Group__3__Impl rule__Ignore__Group__4
            {
            pushFollow(FOLLOW_25);
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
    // InternalCOV.g:2015:1: rule__Ignore__Group__3__Impl : ( '(' ) ;
    public final void rule__Ignore__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2019:1: ( ( '(' ) )
            // InternalCOV.g:2020:1: ( '(' )
            {
            // InternalCOV.g:2020:1: ( '(' )
            // InternalCOV.g:2021:2: '('
            {
             before(grammarAccess.getIgnoreAccess().getLeftParenthesisKeyword_3()); 
            match(input,30,FOLLOW_2); 
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
    // InternalCOV.g:2030:1: rule__Ignore__Group__4 : rule__Ignore__Group__4__Impl rule__Ignore__Group__5 ;
    public final void rule__Ignore__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2034:1: ( rule__Ignore__Group__4__Impl rule__Ignore__Group__5 )
            // InternalCOV.g:2035:2: rule__Ignore__Group__4__Impl rule__Ignore__Group__5
            {
            pushFollow(FOLLOW_25);
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
    // InternalCOV.g:2042:1: rule__Ignore__Group__4__Impl : ( ( rule__Ignore__Group_4__0 )? ) ;
    public final void rule__Ignore__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2046:1: ( ( ( rule__Ignore__Group_4__0 )? ) )
            // InternalCOV.g:2047:1: ( ( rule__Ignore__Group_4__0 )? )
            {
            // InternalCOV.g:2047:1: ( ( rule__Ignore__Group_4__0 )? )
            // InternalCOV.g:2048:2: ( rule__Ignore__Group_4__0 )?
            {
             before(grammarAccess.getIgnoreAccess().getGroup_4()); 
            // InternalCOV.g:2049:2: ( rule__Ignore__Group_4__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==33) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalCOV.g:2049:3: rule__Ignore__Group_4__0
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
    // InternalCOV.g:2057:1: rule__Ignore__Group__5 : rule__Ignore__Group__5__Impl rule__Ignore__Group__6 ;
    public final void rule__Ignore__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2061:1: ( rule__Ignore__Group__5__Impl rule__Ignore__Group__6 )
            // InternalCOV.g:2062:2: rule__Ignore__Group__5__Impl rule__Ignore__Group__6
            {
            pushFollow(FOLLOW_26);
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
    // InternalCOV.g:2069:1: rule__Ignore__Group__5__Impl : ( ')' ) ;
    public final void rule__Ignore__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2073:1: ( ( ')' ) )
            // InternalCOV.g:2074:1: ( ')' )
            {
            // InternalCOV.g:2074:1: ( ')' )
            // InternalCOV.g:2075:2: ')'
            {
             before(grammarAccess.getIgnoreAccess().getRightParenthesisKeyword_5()); 
            match(input,31,FOLLOW_2); 
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
    // InternalCOV.g:2084:1: rule__Ignore__Group__6 : rule__Ignore__Group__6__Impl ;
    public final void rule__Ignore__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2088:1: ( rule__Ignore__Group__6__Impl )
            // InternalCOV.g:2089:2: rule__Ignore__Group__6__Impl
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
    // InternalCOV.g:2095:1: rule__Ignore__Group__6__Impl : ( ( rule__Ignore__Group_6__0 )? ) ;
    public final void rule__Ignore__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2099:1: ( ( ( rule__Ignore__Group_6__0 )? ) )
            // InternalCOV.g:2100:1: ( ( rule__Ignore__Group_6__0 )? )
            {
            // InternalCOV.g:2100:1: ( ( rule__Ignore__Group_6__0 )? )
            // InternalCOV.g:2101:2: ( rule__Ignore__Group_6__0 )?
            {
             before(grammarAccess.getIgnoreAccess().getGroup_6()); 
            // InternalCOV.g:2102:2: ( rule__Ignore__Group_6__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==34) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalCOV.g:2102:3: rule__Ignore__Group_6__0
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
    // InternalCOV.g:2111:1: rule__Ignore__Group_1__0 : rule__Ignore__Group_1__0__Impl rule__Ignore__Group_1__1 ;
    public final void rule__Ignore__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2115:1: ( rule__Ignore__Group_1__0__Impl rule__Ignore__Group_1__1 )
            // InternalCOV.g:2116:2: rule__Ignore__Group_1__0__Impl rule__Ignore__Group_1__1
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
    // InternalCOV.g:2123:1: rule__Ignore__Group_1__0__Impl : ( 'when' ) ;
    public final void rule__Ignore__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2127:1: ( ( 'when' ) )
            // InternalCOV.g:2128:1: ( 'when' )
            {
            // InternalCOV.g:2128:1: ( 'when' )
            // InternalCOV.g:2129:2: 'when'
            {
             before(grammarAccess.getIgnoreAccess().getWhenKeyword_1_0()); 
            match(input,32,FOLLOW_2); 
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
    // InternalCOV.g:2138:1: rule__Ignore__Group_1__1 : rule__Ignore__Group_1__1__Impl ;
    public final void rule__Ignore__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2142:1: ( rule__Ignore__Group_1__1__Impl )
            // InternalCOV.g:2143:2: rule__Ignore__Group_1__1__Impl
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
    // InternalCOV.g:2149:1: rule__Ignore__Group_1__1__Impl : ( ( rule__Ignore__ConditionAssignment_1_1 ) ) ;
    public final void rule__Ignore__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2153:1: ( ( ( rule__Ignore__ConditionAssignment_1_1 ) ) )
            // InternalCOV.g:2154:1: ( ( rule__Ignore__ConditionAssignment_1_1 ) )
            {
            // InternalCOV.g:2154:1: ( ( rule__Ignore__ConditionAssignment_1_1 ) )
            // InternalCOV.g:2155:2: ( rule__Ignore__ConditionAssignment_1_1 )
            {
             before(grammarAccess.getIgnoreAccess().getConditionAssignment_1_1()); 
            // InternalCOV.g:2156:2: ( rule__Ignore__ConditionAssignment_1_1 )
            // InternalCOV.g:2156:3: rule__Ignore__ConditionAssignment_1_1
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
    // InternalCOV.g:2165:1: rule__Ignore__Group_4__0 : rule__Ignore__Group_4__0__Impl rule__Ignore__Group_4__1 ;
    public final void rule__Ignore__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2169:1: ( rule__Ignore__Group_4__0__Impl rule__Ignore__Group_4__1 )
            // InternalCOV.g:2170:2: rule__Ignore__Group_4__0__Impl rule__Ignore__Group_4__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalCOV.g:2177:1: rule__Ignore__Group_4__0__Impl : ( 'subtypes' ) ;
    public final void rule__Ignore__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2181:1: ( ( 'subtypes' ) )
            // InternalCOV.g:2182:1: ( 'subtypes' )
            {
            // InternalCOV.g:2182:1: ( 'subtypes' )
            // InternalCOV.g:2183:2: 'subtypes'
            {
             before(grammarAccess.getIgnoreAccess().getSubtypesKeyword_4_0()); 
            match(input,33,FOLLOW_2); 
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
    // InternalCOV.g:2192:1: rule__Ignore__Group_4__1 : rule__Ignore__Group_4__1__Impl ;
    public final void rule__Ignore__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2196:1: ( rule__Ignore__Group_4__1__Impl )
            // InternalCOV.g:2197:2: rule__Ignore__Group_4__1__Impl
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
    // InternalCOV.g:2203:1: rule__Ignore__Group_4__1__Impl : ( ( rule__Ignore__IgnoreSubtypesAssignment_4_1 ) ) ;
    public final void rule__Ignore__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2207:1: ( ( ( rule__Ignore__IgnoreSubtypesAssignment_4_1 ) ) )
            // InternalCOV.g:2208:1: ( ( rule__Ignore__IgnoreSubtypesAssignment_4_1 ) )
            {
            // InternalCOV.g:2208:1: ( ( rule__Ignore__IgnoreSubtypesAssignment_4_1 ) )
            // InternalCOV.g:2209:2: ( rule__Ignore__IgnoreSubtypesAssignment_4_1 )
            {
             before(grammarAccess.getIgnoreAccess().getIgnoreSubtypesAssignment_4_1()); 
            // InternalCOV.g:2210:2: ( rule__Ignore__IgnoreSubtypesAssignment_4_1 )
            // InternalCOV.g:2210:3: rule__Ignore__IgnoreSubtypesAssignment_4_1
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
    // InternalCOV.g:2219:1: rule__Ignore__Group_6__0 : rule__Ignore__Group_6__0__Impl rule__Ignore__Group_6__1 ;
    public final void rule__Ignore__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2223:1: ( rule__Ignore__Group_6__0__Impl rule__Ignore__Group_6__1 )
            // InternalCOV.g:2224:2: rule__Ignore__Group_6__0__Impl rule__Ignore__Group_6__1
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
    // InternalCOV.g:2231:1: rule__Ignore__Group_6__0__Impl : ( 'description' ) ;
    public final void rule__Ignore__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2235:1: ( ( 'description' ) )
            // InternalCOV.g:2236:1: ( 'description' )
            {
            // InternalCOV.g:2236:1: ( 'description' )
            // InternalCOV.g:2237:2: 'description'
            {
             before(grammarAccess.getIgnoreAccess().getDescriptionKeyword_6_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalCOV.g:2246:1: rule__Ignore__Group_6__1 : rule__Ignore__Group_6__1__Impl ;
    public final void rule__Ignore__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2250:1: ( rule__Ignore__Group_6__1__Impl )
            // InternalCOV.g:2251:2: rule__Ignore__Group_6__1__Impl
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
    // InternalCOV.g:2257:1: rule__Ignore__Group_6__1__Impl : ( ( rule__Ignore__DescriptionAssignment_6_1 ) ) ;
    public final void rule__Ignore__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2261:1: ( ( ( rule__Ignore__DescriptionAssignment_6_1 ) ) )
            // InternalCOV.g:2262:1: ( ( rule__Ignore__DescriptionAssignment_6_1 ) )
            {
            // InternalCOV.g:2262:1: ( ( rule__Ignore__DescriptionAssignment_6_1 ) )
            // InternalCOV.g:2263:2: ( rule__Ignore__DescriptionAssignment_6_1 )
            {
             before(grammarAccess.getIgnoreAccess().getDescriptionAssignment_6_1()); 
            // InternalCOV.g:2264:2: ( rule__Ignore__DescriptionAssignment_6_1 )
            // InternalCOV.g:2264:3: rule__Ignore__DescriptionAssignment_6_1
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
    // InternalCOV.g:2273:1: rule__LimitedIgnore__Group__0 : rule__LimitedIgnore__Group__0__Impl rule__LimitedIgnore__Group__1 ;
    public final void rule__LimitedIgnore__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2277:1: ( rule__LimitedIgnore__Group__0__Impl rule__LimitedIgnore__Group__1 )
            // InternalCOV.g:2278:2: rule__LimitedIgnore__Group__0__Impl rule__LimitedIgnore__Group__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalCOV.g:2285:1: rule__LimitedIgnore__Group__0__Impl : ( () ) ;
    public final void rule__LimitedIgnore__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2289:1: ( ( () ) )
            // InternalCOV.g:2290:1: ( () )
            {
            // InternalCOV.g:2290:1: ( () )
            // InternalCOV.g:2291:2: ()
            {
             before(grammarAccess.getLimitedIgnoreAccess().getLimitedIgnoreAction_0()); 
            // InternalCOV.g:2292:2: ()
            // InternalCOV.g:2292:3: 
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
    // InternalCOV.g:2300:1: rule__LimitedIgnore__Group__1 : rule__LimitedIgnore__Group__1__Impl rule__LimitedIgnore__Group__2 ;
    public final void rule__LimitedIgnore__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2304:1: ( rule__LimitedIgnore__Group__1__Impl rule__LimitedIgnore__Group__2 )
            // InternalCOV.g:2305:2: rule__LimitedIgnore__Group__1__Impl rule__LimitedIgnore__Group__2
            {
            pushFollow(FOLLOW_28);
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
    // InternalCOV.g:2312:1: rule__LimitedIgnore__Group__1__Impl : ( ( rule__LimitedIgnore__Group_1__0 )? ) ;
    public final void rule__LimitedIgnore__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2316:1: ( ( ( rule__LimitedIgnore__Group_1__0 )? ) )
            // InternalCOV.g:2317:1: ( ( rule__LimitedIgnore__Group_1__0 )? )
            {
            // InternalCOV.g:2317:1: ( ( rule__LimitedIgnore__Group_1__0 )? )
            // InternalCOV.g:2318:2: ( rule__LimitedIgnore__Group_1__0 )?
            {
             before(grammarAccess.getLimitedIgnoreAccess().getGroup_1()); 
            // InternalCOV.g:2319:2: ( rule__LimitedIgnore__Group_1__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==32) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalCOV.g:2319:3: rule__LimitedIgnore__Group_1__0
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
    // InternalCOV.g:2327:1: rule__LimitedIgnore__Group__2 : rule__LimitedIgnore__Group__2__Impl rule__LimitedIgnore__Group__3 ;
    public final void rule__LimitedIgnore__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2331:1: ( rule__LimitedIgnore__Group__2__Impl rule__LimitedIgnore__Group__3 )
            // InternalCOV.g:2332:2: rule__LimitedIgnore__Group__2__Impl rule__LimitedIgnore__Group__3
            {
            pushFollow(FOLLOW_29);
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
    // InternalCOV.g:2339:1: rule__LimitedIgnore__Group__2__Impl : ( 'ignoreif' ) ;
    public final void rule__LimitedIgnore__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2343:1: ( ( 'ignoreif' ) )
            // InternalCOV.g:2344:1: ( 'ignoreif' )
            {
            // InternalCOV.g:2344:1: ( 'ignoreif' )
            // InternalCOV.g:2345:2: 'ignoreif'
            {
             before(grammarAccess.getLimitedIgnoreAccess().getIgnoreifKeyword_2()); 
            match(input,35,FOLLOW_2); 
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
    // InternalCOV.g:2354:1: rule__LimitedIgnore__Group__3 : rule__LimitedIgnore__Group__3__Impl rule__LimitedIgnore__Group__4 ;
    public final void rule__LimitedIgnore__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2358:1: ( rule__LimitedIgnore__Group__3__Impl rule__LimitedIgnore__Group__4 )
            // InternalCOV.g:2359:2: rule__LimitedIgnore__Group__3__Impl rule__LimitedIgnore__Group__4
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
    // InternalCOV.g:2366:1: rule__LimitedIgnore__Group__3__Impl : ( ( rule__LimitedIgnore__TypeAssignment_3 ) ) ;
    public final void rule__LimitedIgnore__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2370:1: ( ( ( rule__LimitedIgnore__TypeAssignment_3 ) ) )
            // InternalCOV.g:2371:1: ( ( rule__LimitedIgnore__TypeAssignment_3 ) )
            {
            // InternalCOV.g:2371:1: ( ( rule__LimitedIgnore__TypeAssignment_3 ) )
            // InternalCOV.g:2372:2: ( rule__LimitedIgnore__TypeAssignment_3 )
            {
             before(grammarAccess.getLimitedIgnoreAccess().getTypeAssignment_3()); 
            // InternalCOV.g:2373:2: ( rule__LimitedIgnore__TypeAssignment_3 )
            // InternalCOV.g:2373:3: rule__LimitedIgnore__TypeAssignment_3
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
    // InternalCOV.g:2381:1: rule__LimitedIgnore__Group__4 : rule__LimitedIgnore__Group__4__Impl rule__LimitedIgnore__Group__5 ;
    public final void rule__LimitedIgnore__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2385:1: ( rule__LimitedIgnore__Group__4__Impl rule__LimitedIgnore__Group__5 )
            // InternalCOV.g:2386:2: rule__LimitedIgnore__Group__4__Impl rule__LimitedIgnore__Group__5
            {
            pushFollow(FOLLOW_30);
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
    // InternalCOV.g:2393:1: rule__LimitedIgnore__Group__4__Impl : ( ( rule__LimitedIgnore__ContainerMetaclassAssignment_4 ) ) ;
    public final void rule__LimitedIgnore__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2397:1: ( ( ( rule__LimitedIgnore__ContainerMetaclassAssignment_4 ) ) )
            // InternalCOV.g:2398:1: ( ( rule__LimitedIgnore__ContainerMetaclassAssignment_4 ) )
            {
            // InternalCOV.g:2398:1: ( ( rule__LimitedIgnore__ContainerMetaclassAssignment_4 ) )
            // InternalCOV.g:2399:2: ( rule__LimitedIgnore__ContainerMetaclassAssignment_4 )
            {
             before(grammarAccess.getLimitedIgnoreAccess().getContainerMetaclassAssignment_4()); 
            // InternalCOV.g:2400:2: ( rule__LimitedIgnore__ContainerMetaclassAssignment_4 )
            // InternalCOV.g:2400:3: rule__LimitedIgnore__ContainerMetaclassAssignment_4
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
    // InternalCOV.g:2408:1: rule__LimitedIgnore__Group__5 : rule__LimitedIgnore__Group__5__Impl rule__LimitedIgnore__Group__6 ;
    public final void rule__LimitedIgnore__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2412:1: ( rule__LimitedIgnore__Group__5__Impl rule__LimitedIgnore__Group__6 )
            // InternalCOV.g:2413:2: rule__LimitedIgnore__Group__5__Impl rule__LimitedIgnore__Group__6
            {
            pushFollow(FOLLOW_30);
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
    // InternalCOV.g:2420:1: rule__LimitedIgnore__Group__5__Impl : ( ( rule__LimitedIgnore__Group_5__0 )* ) ;
    public final void rule__LimitedIgnore__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2424:1: ( ( ( rule__LimitedIgnore__Group_5__0 )* ) )
            // InternalCOV.g:2425:1: ( ( rule__LimitedIgnore__Group_5__0 )* )
            {
            // InternalCOV.g:2425:1: ( ( rule__LimitedIgnore__Group_5__0 )* )
            // InternalCOV.g:2426:2: ( rule__LimitedIgnore__Group_5__0 )*
            {
             before(grammarAccess.getLimitedIgnoreAccess().getGroup_5()); 
            // InternalCOV.g:2427:2: ( rule__LimitedIgnore__Group_5__0 )*
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
            	    // InternalCOV.g:2427:3: rule__LimitedIgnore__Group_5__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__LimitedIgnore__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // InternalCOV.g:2435:1: rule__LimitedIgnore__Group__6 : rule__LimitedIgnore__Group__6__Impl ;
    public final void rule__LimitedIgnore__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2439:1: ( rule__LimitedIgnore__Group__6__Impl )
            // InternalCOV.g:2440:2: rule__LimitedIgnore__Group__6__Impl
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
    // InternalCOV.g:2446:1: rule__LimitedIgnore__Group__6__Impl : ( ( rule__LimitedIgnore__Group_6__0 )? ) ;
    public final void rule__LimitedIgnore__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2450:1: ( ( ( rule__LimitedIgnore__Group_6__0 )? ) )
            // InternalCOV.g:2451:1: ( ( rule__LimitedIgnore__Group_6__0 )? )
            {
            // InternalCOV.g:2451:1: ( ( rule__LimitedIgnore__Group_6__0 )? )
            // InternalCOV.g:2452:2: ( rule__LimitedIgnore__Group_6__0 )?
            {
             before(grammarAccess.getLimitedIgnoreAccess().getGroup_6()); 
            // InternalCOV.g:2453:2: ( rule__LimitedIgnore__Group_6__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==34) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalCOV.g:2453:3: rule__LimitedIgnore__Group_6__0
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
    // InternalCOV.g:2462:1: rule__LimitedIgnore__Group_1__0 : rule__LimitedIgnore__Group_1__0__Impl rule__LimitedIgnore__Group_1__1 ;
    public final void rule__LimitedIgnore__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2466:1: ( rule__LimitedIgnore__Group_1__0__Impl rule__LimitedIgnore__Group_1__1 )
            // InternalCOV.g:2467:2: rule__LimitedIgnore__Group_1__0__Impl rule__LimitedIgnore__Group_1__1
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
    // InternalCOV.g:2474:1: rule__LimitedIgnore__Group_1__0__Impl : ( 'when' ) ;
    public final void rule__LimitedIgnore__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2478:1: ( ( 'when' ) )
            // InternalCOV.g:2479:1: ( 'when' )
            {
            // InternalCOV.g:2479:1: ( 'when' )
            // InternalCOV.g:2480:2: 'when'
            {
             before(grammarAccess.getLimitedIgnoreAccess().getWhenKeyword_1_0()); 
            match(input,32,FOLLOW_2); 
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
    // InternalCOV.g:2489:1: rule__LimitedIgnore__Group_1__1 : rule__LimitedIgnore__Group_1__1__Impl ;
    public final void rule__LimitedIgnore__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2493:1: ( rule__LimitedIgnore__Group_1__1__Impl )
            // InternalCOV.g:2494:2: rule__LimitedIgnore__Group_1__1__Impl
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
    // InternalCOV.g:2500:1: rule__LimitedIgnore__Group_1__1__Impl : ( ( rule__LimitedIgnore__ConditionAssignment_1_1 ) ) ;
    public final void rule__LimitedIgnore__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2504:1: ( ( ( rule__LimitedIgnore__ConditionAssignment_1_1 ) ) )
            // InternalCOV.g:2505:1: ( ( rule__LimitedIgnore__ConditionAssignment_1_1 ) )
            {
            // InternalCOV.g:2505:1: ( ( rule__LimitedIgnore__ConditionAssignment_1_1 ) )
            // InternalCOV.g:2506:2: ( rule__LimitedIgnore__ConditionAssignment_1_1 )
            {
             before(grammarAccess.getLimitedIgnoreAccess().getConditionAssignment_1_1()); 
            // InternalCOV.g:2507:2: ( rule__LimitedIgnore__ConditionAssignment_1_1 )
            // InternalCOV.g:2507:3: rule__LimitedIgnore__ConditionAssignment_1_1
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
    // InternalCOV.g:2516:1: rule__LimitedIgnore__Group_5__0 : rule__LimitedIgnore__Group_5__0__Impl rule__LimitedIgnore__Group_5__1 ;
    public final void rule__LimitedIgnore__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2520:1: ( rule__LimitedIgnore__Group_5__0__Impl rule__LimitedIgnore__Group_5__1 )
            // InternalCOV.g:2521:2: rule__LimitedIgnore__Group_5__0__Impl rule__LimitedIgnore__Group_5__1
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
    // InternalCOV.g:2528:1: rule__LimitedIgnore__Group_5__0__Impl : ( ',' ) ;
    public final void rule__LimitedIgnore__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2532:1: ( ( ',' ) )
            // InternalCOV.g:2533:1: ( ',' )
            {
            // InternalCOV.g:2533:1: ( ',' )
            // InternalCOV.g:2534:2: ','
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
    // InternalCOV.g:2543:1: rule__LimitedIgnore__Group_5__1 : rule__LimitedIgnore__Group_5__1__Impl ;
    public final void rule__LimitedIgnore__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2547:1: ( rule__LimitedIgnore__Group_5__1__Impl )
            // InternalCOV.g:2548:2: rule__LimitedIgnore__Group_5__1__Impl
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
    // InternalCOV.g:2554:1: rule__LimitedIgnore__Group_5__1__Impl : ( ( rule__LimitedIgnore__ContainerMetaclassAssignment_5_1 ) ) ;
    public final void rule__LimitedIgnore__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2558:1: ( ( ( rule__LimitedIgnore__ContainerMetaclassAssignment_5_1 ) ) )
            // InternalCOV.g:2559:1: ( ( rule__LimitedIgnore__ContainerMetaclassAssignment_5_1 ) )
            {
            // InternalCOV.g:2559:1: ( ( rule__LimitedIgnore__ContainerMetaclassAssignment_5_1 ) )
            // InternalCOV.g:2560:2: ( rule__LimitedIgnore__ContainerMetaclassAssignment_5_1 )
            {
             before(grammarAccess.getLimitedIgnoreAccess().getContainerMetaclassAssignment_5_1()); 
            // InternalCOV.g:2561:2: ( rule__LimitedIgnore__ContainerMetaclassAssignment_5_1 )
            // InternalCOV.g:2561:3: rule__LimitedIgnore__ContainerMetaclassAssignment_5_1
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
    // InternalCOV.g:2570:1: rule__LimitedIgnore__Group_6__0 : rule__LimitedIgnore__Group_6__0__Impl rule__LimitedIgnore__Group_6__1 ;
    public final void rule__LimitedIgnore__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2574:1: ( rule__LimitedIgnore__Group_6__0__Impl rule__LimitedIgnore__Group_6__1 )
            // InternalCOV.g:2575:2: rule__LimitedIgnore__Group_6__0__Impl rule__LimitedIgnore__Group_6__1
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
    // InternalCOV.g:2582:1: rule__LimitedIgnore__Group_6__0__Impl : ( 'description' ) ;
    public final void rule__LimitedIgnore__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2586:1: ( ( 'description' ) )
            // InternalCOV.g:2587:1: ( 'description' )
            {
            // InternalCOV.g:2587:1: ( 'description' )
            // InternalCOV.g:2588:2: 'description'
            {
             before(grammarAccess.getLimitedIgnoreAccess().getDescriptionKeyword_6_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalCOV.g:2597:1: rule__LimitedIgnore__Group_6__1 : rule__LimitedIgnore__Group_6__1__Impl ;
    public final void rule__LimitedIgnore__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2601:1: ( rule__LimitedIgnore__Group_6__1__Impl )
            // InternalCOV.g:2602:2: rule__LimitedIgnore__Group_6__1__Impl
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
    // InternalCOV.g:2608:1: rule__LimitedIgnore__Group_6__1__Impl : ( ( rule__LimitedIgnore__DescriptionAssignment_6_1 ) ) ;
    public final void rule__LimitedIgnore__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2612:1: ( ( ( rule__LimitedIgnore__DescriptionAssignment_6_1 ) ) )
            // InternalCOV.g:2613:1: ( ( rule__LimitedIgnore__DescriptionAssignment_6_1 ) )
            {
            // InternalCOV.g:2613:1: ( ( rule__LimitedIgnore__DescriptionAssignment_6_1 ) )
            // InternalCOV.g:2614:2: ( rule__LimitedIgnore__DescriptionAssignment_6_1 )
            {
             before(grammarAccess.getLimitedIgnoreAccess().getDescriptionAssignment_6_1()); 
            // InternalCOV.g:2615:2: ( rule__LimitedIgnore__DescriptionAssignment_6_1 )
            // InternalCOV.g:2615:3: rule__LimitedIgnore__DescriptionAssignment_6_1
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
    // InternalCOV.g:2624:1: rule__CoverageOfReferenced__Group__0 : rule__CoverageOfReferenced__Group__0__Impl rule__CoverageOfReferenced__Group__1 ;
    public final void rule__CoverageOfReferenced__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2628:1: ( rule__CoverageOfReferenced__Group__0__Impl rule__CoverageOfReferenced__Group__1 )
            // InternalCOV.g:2629:2: rule__CoverageOfReferenced__Group__0__Impl rule__CoverageOfReferenced__Group__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalCOV.g:2636:1: rule__CoverageOfReferenced__Group__0__Impl : ( () ) ;
    public final void rule__CoverageOfReferenced__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2640:1: ( ( () ) )
            // InternalCOV.g:2641:1: ( () )
            {
            // InternalCOV.g:2641:1: ( () )
            // InternalCOV.g:2642:2: ()
            {
             before(grammarAccess.getCoverageOfReferencedAccess().getCoverageOfReferencedAction_0()); 
            // InternalCOV.g:2643:2: ()
            // InternalCOV.g:2643:3: 
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
    // InternalCOV.g:2651:1: rule__CoverageOfReferenced__Group__1 : rule__CoverageOfReferenced__Group__1__Impl rule__CoverageOfReferenced__Group__2 ;
    public final void rule__CoverageOfReferenced__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2655:1: ( rule__CoverageOfReferenced__Group__1__Impl rule__CoverageOfReferenced__Group__2 )
            // InternalCOV.g:2656:2: rule__CoverageOfReferenced__Group__1__Impl rule__CoverageOfReferenced__Group__2
            {
            pushFollow(FOLLOW_31);
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
    // InternalCOV.g:2663:1: rule__CoverageOfReferenced__Group__1__Impl : ( ( rule__CoverageOfReferenced__Group_1__0 )? ) ;
    public final void rule__CoverageOfReferenced__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2667:1: ( ( ( rule__CoverageOfReferenced__Group_1__0 )? ) )
            // InternalCOV.g:2668:1: ( ( rule__CoverageOfReferenced__Group_1__0 )? )
            {
            // InternalCOV.g:2668:1: ( ( rule__CoverageOfReferenced__Group_1__0 )? )
            // InternalCOV.g:2669:2: ( rule__CoverageOfReferenced__Group_1__0 )?
            {
             before(grammarAccess.getCoverageOfReferencedAccess().getGroup_1()); 
            // InternalCOV.g:2670:2: ( rule__CoverageOfReferenced__Group_1__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==32) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalCOV.g:2670:3: rule__CoverageOfReferenced__Group_1__0
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
    // InternalCOV.g:2678:1: rule__CoverageOfReferenced__Group__2 : rule__CoverageOfReferenced__Group__2__Impl rule__CoverageOfReferenced__Group__3 ;
    public final void rule__CoverageOfReferenced__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2682:1: ( rule__CoverageOfReferenced__Group__2__Impl rule__CoverageOfReferenced__Group__3 )
            // InternalCOV.g:2683:2: rule__CoverageOfReferenced__Group__2__Impl rule__CoverageOfReferenced__Group__3
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
    // InternalCOV.g:2690:1: rule__CoverageOfReferenced__Group__2__Impl : ( 'covers' ) ;
    public final void rule__CoverageOfReferenced__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2694:1: ( ( 'covers' ) )
            // InternalCOV.g:2695:1: ( 'covers' )
            {
            // InternalCOV.g:2695:1: ( 'covers' )
            // InternalCOV.g:2696:2: 'covers'
            {
             before(grammarAccess.getCoverageOfReferencedAccess().getCoversKeyword_2()); 
            match(input,36,FOLLOW_2); 
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
    // InternalCOV.g:2705:1: rule__CoverageOfReferenced__Group__3 : rule__CoverageOfReferenced__Group__3__Impl rule__CoverageOfReferenced__Group__4 ;
    public final void rule__CoverageOfReferenced__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2709:1: ( rule__CoverageOfReferenced__Group__3__Impl rule__CoverageOfReferenced__Group__4 )
            // InternalCOV.g:2710:2: rule__CoverageOfReferenced__Group__3__Impl rule__CoverageOfReferenced__Group__4
            {
            pushFollow(FOLLOW_30);
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
    // InternalCOV.g:2717:1: rule__CoverageOfReferenced__Group__3__Impl : ( ( rule__CoverageOfReferenced__ReferenceAssignment_3 ) ) ;
    public final void rule__CoverageOfReferenced__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2721:1: ( ( ( rule__CoverageOfReferenced__ReferenceAssignment_3 ) ) )
            // InternalCOV.g:2722:1: ( ( rule__CoverageOfReferenced__ReferenceAssignment_3 ) )
            {
            // InternalCOV.g:2722:1: ( ( rule__CoverageOfReferenced__ReferenceAssignment_3 ) )
            // InternalCOV.g:2723:2: ( rule__CoverageOfReferenced__ReferenceAssignment_3 )
            {
             before(grammarAccess.getCoverageOfReferencedAccess().getReferenceAssignment_3()); 
            // InternalCOV.g:2724:2: ( rule__CoverageOfReferenced__ReferenceAssignment_3 )
            // InternalCOV.g:2724:3: rule__CoverageOfReferenced__ReferenceAssignment_3
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
    // InternalCOV.g:2732:1: rule__CoverageOfReferenced__Group__4 : rule__CoverageOfReferenced__Group__4__Impl rule__CoverageOfReferenced__Group__5 ;
    public final void rule__CoverageOfReferenced__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2736:1: ( rule__CoverageOfReferenced__Group__4__Impl rule__CoverageOfReferenced__Group__5 )
            // InternalCOV.g:2737:2: rule__CoverageOfReferenced__Group__4__Impl rule__CoverageOfReferenced__Group__5
            {
            pushFollow(FOLLOW_30);
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
    // InternalCOV.g:2744:1: rule__CoverageOfReferenced__Group__4__Impl : ( ( rule__CoverageOfReferenced__Group_4__0 )* ) ;
    public final void rule__CoverageOfReferenced__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2748:1: ( ( ( rule__CoverageOfReferenced__Group_4__0 )* ) )
            // InternalCOV.g:2749:1: ( ( rule__CoverageOfReferenced__Group_4__0 )* )
            {
            // InternalCOV.g:2749:1: ( ( rule__CoverageOfReferenced__Group_4__0 )* )
            // InternalCOV.g:2750:2: ( rule__CoverageOfReferenced__Group_4__0 )*
            {
             before(grammarAccess.getCoverageOfReferencedAccess().getGroup_4()); 
            // InternalCOV.g:2751:2: ( rule__CoverageOfReferenced__Group_4__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==22) ) {
                    int LA23_2 = input.LA(2);

                    if ( ((LA23_2>=RULE_STRING && LA23_2<=RULE_ID)) ) {
                        alt23=1;
                    }


                }


                switch (alt23) {
            	case 1 :
            	    // InternalCOV.g:2751:3: rule__CoverageOfReferenced__Group_4__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__CoverageOfReferenced__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
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
    // InternalCOV.g:2759:1: rule__CoverageOfReferenced__Group__5 : rule__CoverageOfReferenced__Group__5__Impl ;
    public final void rule__CoverageOfReferenced__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2763:1: ( rule__CoverageOfReferenced__Group__5__Impl )
            // InternalCOV.g:2764:2: rule__CoverageOfReferenced__Group__5__Impl
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
    // InternalCOV.g:2770:1: rule__CoverageOfReferenced__Group__5__Impl : ( ( rule__CoverageOfReferenced__Group_5__0 )? ) ;
    public final void rule__CoverageOfReferenced__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2774:1: ( ( ( rule__CoverageOfReferenced__Group_5__0 )? ) )
            // InternalCOV.g:2775:1: ( ( rule__CoverageOfReferenced__Group_5__0 )? )
            {
            // InternalCOV.g:2775:1: ( ( rule__CoverageOfReferenced__Group_5__0 )? )
            // InternalCOV.g:2776:2: ( rule__CoverageOfReferenced__Group_5__0 )?
            {
             before(grammarAccess.getCoverageOfReferencedAccess().getGroup_5()); 
            // InternalCOV.g:2777:2: ( rule__CoverageOfReferenced__Group_5__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==34) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalCOV.g:2777:3: rule__CoverageOfReferenced__Group_5__0
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
    // InternalCOV.g:2786:1: rule__CoverageOfReferenced__Group_1__0 : rule__CoverageOfReferenced__Group_1__0__Impl rule__CoverageOfReferenced__Group_1__1 ;
    public final void rule__CoverageOfReferenced__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2790:1: ( rule__CoverageOfReferenced__Group_1__0__Impl rule__CoverageOfReferenced__Group_1__1 )
            // InternalCOV.g:2791:2: rule__CoverageOfReferenced__Group_1__0__Impl rule__CoverageOfReferenced__Group_1__1
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
    // InternalCOV.g:2798:1: rule__CoverageOfReferenced__Group_1__0__Impl : ( 'when' ) ;
    public final void rule__CoverageOfReferenced__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2802:1: ( ( 'when' ) )
            // InternalCOV.g:2803:1: ( 'when' )
            {
            // InternalCOV.g:2803:1: ( 'when' )
            // InternalCOV.g:2804:2: 'when'
            {
             before(grammarAccess.getCoverageOfReferencedAccess().getWhenKeyword_1_0()); 
            match(input,32,FOLLOW_2); 
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
    // InternalCOV.g:2813:1: rule__CoverageOfReferenced__Group_1__1 : rule__CoverageOfReferenced__Group_1__1__Impl ;
    public final void rule__CoverageOfReferenced__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2817:1: ( rule__CoverageOfReferenced__Group_1__1__Impl )
            // InternalCOV.g:2818:2: rule__CoverageOfReferenced__Group_1__1__Impl
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
    // InternalCOV.g:2824:1: rule__CoverageOfReferenced__Group_1__1__Impl : ( ( rule__CoverageOfReferenced__ConditionAssignment_1_1 ) ) ;
    public final void rule__CoverageOfReferenced__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2828:1: ( ( ( rule__CoverageOfReferenced__ConditionAssignment_1_1 ) ) )
            // InternalCOV.g:2829:1: ( ( rule__CoverageOfReferenced__ConditionAssignment_1_1 ) )
            {
            // InternalCOV.g:2829:1: ( ( rule__CoverageOfReferenced__ConditionAssignment_1_1 ) )
            // InternalCOV.g:2830:2: ( rule__CoverageOfReferenced__ConditionAssignment_1_1 )
            {
             before(grammarAccess.getCoverageOfReferencedAccess().getConditionAssignment_1_1()); 
            // InternalCOV.g:2831:2: ( rule__CoverageOfReferenced__ConditionAssignment_1_1 )
            // InternalCOV.g:2831:3: rule__CoverageOfReferenced__ConditionAssignment_1_1
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
    // InternalCOV.g:2840:1: rule__CoverageOfReferenced__Group_4__0 : rule__CoverageOfReferenced__Group_4__0__Impl rule__CoverageOfReferenced__Group_4__1 ;
    public final void rule__CoverageOfReferenced__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2844:1: ( rule__CoverageOfReferenced__Group_4__0__Impl rule__CoverageOfReferenced__Group_4__1 )
            // InternalCOV.g:2845:2: rule__CoverageOfReferenced__Group_4__0__Impl rule__CoverageOfReferenced__Group_4__1
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
    // InternalCOV.g:2852:1: rule__CoverageOfReferenced__Group_4__0__Impl : ( ',' ) ;
    public final void rule__CoverageOfReferenced__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2856:1: ( ( ',' ) )
            // InternalCOV.g:2857:1: ( ',' )
            {
            // InternalCOV.g:2857:1: ( ',' )
            // InternalCOV.g:2858:2: ','
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
    // InternalCOV.g:2867:1: rule__CoverageOfReferenced__Group_4__1 : rule__CoverageOfReferenced__Group_4__1__Impl ;
    public final void rule__CoverageOfReferenced__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2871:1: ( rule__CoverageOfReferenced__Group_4__1__Impl )
            // InternalCOV.g:2872:2: rule__CoverageOfReferenced__Group_4__1__Impl
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
    // InternalCOV.g:2878:1: rule__CoverageOfReferenced__Group_4__1__Impl : ( ( rule__CoverageOfReferenced__ReferenceAssignment_4_1 ) ) ;
    public final void rule__CoverageOfReferenced__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2882:1: ( ( ( rule__CoverageOfReferenced__ReferenceAssignment_4_1 ) ) )
            // InternalCOV.g:2883:1: ( ( rule__CoverageOfReferenced__ReferenceAssignment_4_1 ) )
            {
            // InternalCOV.g:2883:1: ( ( rule__CoverageOfReferenced__ReferenceAssignment_4_1 ) )
            // InternalCOV.g:2884:2: ( rule__CoverageOfReferenced__ReferenceAssignment_4_1 )
            {
             before(grammarAccess.getCoverageOfReferencedAccess().getReferenceAssignment_4_1()); 
            // InternalCOV.g:2885:2: ( rule__CoverageOfReferenced__ReferenceAssignment_4_1 )
            // InternalCOV.g:2885:3: rule__CoverageOfReferenced__ReferenceAssignment_4_1
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
    // InternalCOV.g:2894:1: rule__CoverageOfReferenced__Group_5__0 : rule__CoverageOfReferenced__Group_5__0__Impl rule__CoverageOfReferenced__Group_5__1 ;
    public final void rule__CoverageOfReferenced__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2898:1: ( rule__CoverageOfReferenced__Group_5__0__Impl rule__CoverageOfReferenced__Group_5__1 )
            // InternalCOV.g:2899:2: rule__CoverageOfReferenced__Group_5__0__Impl rule__CoverageOfReferenced__Group_5__1
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
    // InternalCOV.g:2906:1: rule__CoverageOfReferenced__Group_5__0__Impl : ( 'description' ) ;
    public final void rule__CoverageOfReferenced__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2910:1: ( ( 'description' ) )
            // InternalCOV.g:2911:1: ( 'description' )
            {
            // InternalCOV.g:2911:1: ( 'description' )
            // InternalCOV.g:2912:2: 'description'
            {
             before(grammarAccess.getCoverageOfReferencedAccess().getDescriptionKeyword_5_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalCOV.g:2921:1: rule__CoverageOfReferenced__Group_5__1 : rule__CoverageOfReferenced__Group_5__1__Impl ;
    public final void rule__CoverageOfReferenced__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2925:1: ( rule__CoverageOfReferenced__Group_5__1__Impl )
            // InternalCOV.g:2926:2: rule__CoverageOfReferenced__Group_5__1__Impl
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
    // InternalCOV.g:2932:1: rule__CoverageOfReferenced__Group_5__1__Impl : ( ( rule__CoverageOfReferenced__DescriptionAssignment_5_1 ) ) ;
    public final void rule__CoverageOfReferenced__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2936:1: ( ( ( rule__CoverageOfReferenced__DescriptionAssignment_5_1 ) ) )
            // InternalCOV.g:2937:1: ( ( rule__CoverageOfReferenced__DescriptionAssignment_5_1 ) )
            {
            // InternalCOV.g:2937:1: ( ( rule__CoverageOfReferenced__DescriptionAssignment_5_1 ) )
            // InternalCOV.g:2938:2: ( rule__CoverageOfReferenced__DescriptionAssignment_5_1 )
            {
             before(grammarAccess.getCoverageOfReferencedAccess().getDescriptionAssignment_5_1()); 
            // InternalCOV.g:2939:2: ( rule__CoverageOfReferenced__DescriptionAssignment_5_1 )
            // InternalCOV.g:2939:3: rule__CoverageOfReferenced__DescriptionAssignment_5_1
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
    // InternalCOV.g:2948:1: rule__CoverageByContent__Group__0 : rule__CoverageByContent__Group__0__Impl rule__CoverageByContent__Group__1 ;
    public final void rule__CoverageByContent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2952:1: ( rule__CoverageByContent__Group__0__Impl rule__CoverageByContent__Group__1 )
            // InternalCOV.g:2953:2: rule__CoverageByContent__Group__0__Impl rule__CoverageByContent__Group__1
            {
            pushFollow(FOLLOW_32);
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
    // InternalCOV.g:2960:1: rule__CoverageByContent__Group__0__Impl : ( () ) ;
    public final void rule__CoverageByContent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2964:1: ( ( () ) )
            // InternalCOV.g:2965:1: ( () )
            {
            // InternalCOV.g:2965:1: ( () )
            // InternalCOV.g:2966:2: ()
            {
             before(grammarAccess.getCoverageByContentAccess().getCoverageByContentAction_0()); 
            // InternalCOV.g:2967:2: ()
            // InternalCOV.g:2967:3: 
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
    // InternalCOV.g:2975:1: rule__CoverageByContent__Group__1 : rule__CoverageByContent__Group__1__Impl rule__CoverageByContent__Group__2 ;
    public final void rule__CoverageByContent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2979:1: ( rule__CoverageByContent__Group__1__Impl rule__CoverageByContent__Group__2 )
            // InternalCOV.g:2980:2: rule__CoverageByContent__Group__1__Impl rule__CoverageByContent__Group__2
            {
            pushFollow(FOLLOW_32);
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
    // InternalCOV.g:2987:1: rule__CoverageByContent__Group__1__Impl : ( ( rule__CoverageByContent__Group_1__0 )? ) ;
    public final void rule__CoverageByContent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:2991:1: ( ( ( rule__CoverageByContent__Group_1__0 )? ) )
            // InternalCOV.g:2992:1: ( ( rule__CoverageByContent__Group_1__0 )? )
            {
            // InternalCOV.g:2992:1: ( ( rule__CoverageByContent__Group_1__0 )? )
            // InternalCOV.g:2993:2: ( rule__CoverageByContent__Group_1__0 )?
            {
             before(grammarAccess.getCoverageByContentAccess().getGroup_1()); 
            // InternalCOV.g:2994:2: ( rule__CoverageByContent__Group_1__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==32) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalCOV.g:2994:3: rule__CoverageByContent__Group_1__0
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
    // InternalCOV.g:3002:1: rule__CoverageByContent__Group__2 : rule__CoverageByContent__Group__2__Impl rule__CoverageByContent__Group__3 ;
    public final void rule__CoverageByContent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3006:1: ( rule__CoverageByContent__Group__2__Impl rule__CoverageByContent__Group__3 )
            // InternalCOV.g:3007:2: rule__CoverageByContent__Group__2__Impl rule__CoverageByContent__Group__3
            {
            pushFollow(FOLLOW_33);
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
    // InternalCOV.g:3014:1: rule__CoverageByContent__Group__2__Impl : ( 'covered' ) ;
    public final void rule__CoverageByContent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3018:1: ( ( 'covered' ) )
            // InternalCOV.g:3019:1: ( 'covered' )
            {
            // InternalCOV.g:3019:1: ( 'covered' )
            // InternalCOV.g:3020:2: 'covered'
            {
             before(grammarAccess.getCoverageByContentAccess().getCoveredKeyword_2()); 
            match(input,37,FOLLOW_2); 
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
    // InternalCOV.g:3029:1: rule__CoverageByContent__Group__3 : rule__CoverageByContent__Group__3__Impl rule__CoverageByContent__Group__4 ;
    public final void rule__CoverageByContent__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3033:1: ( rule__CoverageByContent__Group__3__Impl rule__CoverageByContent__Group__4 )
            // InternalCOV.g:3034:2: rule__CoverageByContent__Group__3__Impl rule__CoverageByContent__Group__4
            {
            pushFollow(FOLLOW_34);
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
    // InternalCOV.g:3041:1: rule__CoverageByContent__Group__3__Impl : ( 'when' ) ;
    public final void rule__CoverageByContent__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3045:1: ( ( 'when' ) )
            // InternalCOV.g:3046:1: ( 'when' )
            {
            // InternalCOV.g:3046:1: ( 'when' )
            // InternalCOV.g:3047:2: 'when'
            {
             before(grammarAccess.getCoverageByContentAccess().getWhenKeyword_3()); 
            match(input,32,FOLLOW_2); 
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
    // InternalCOV.g:3056:1: rule__CoverageByContent__Group__4 : rule__CoverageByContent__Group__4__Impl rule__CoverageByContent__Group__5 ;
    public final void rule__CoverageByContent__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3060:1: ( rule__CoverageByContent__Group__4__Impl rule__CoverageByContent__Group__5 )
            // InternalCOV.g:3061:2: rule__CoverageByContent__Group__4__Impl rule__CoverageByContent__Group__5
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
    // InternalCOV.g:3068:1: rule__CoverageByContent__Group__4__Impl : ( ( rule__CoverageByContent__MultiplicityAssignment_4 ) ) ;
    public final void rule__CoverageByContent__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3072:1: ( ( ( rule__CoverageByContent__MultiplicityAssignment_4 ) ) )
            // InternalCOV.g:3073:1: ( ( rule__CoverageByContent__MultiplicityAssignment_4 ) )
            {
            // InternalCOV.g:3073:1: ( ( rule__CoverageByContent__MultiplicityAssignment_4 ) )
            // InternalCOV.g:3074:2: ( rule__CoverageByContent__MultiplicityAssignment_4 )
            {
             before(grammarAccess.getCoverageByContentAccess().getMultiplicityAssignment_4()); 
            // InternalCOV.g:3075:2: ( rule__CoverageByContent__MultiplicityAssignment_4 )
            // InternalCOV.g:3075:3: rule__CoverageByContent__MultiplicityAssignment_4
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
    // InternalCOV.g:3083:1: rule__CoverageByContent__Group__5 : rule__CoverageByContent__Group__5__Impl rule__CoverageByContent__Group__6 ;
    public final void rule__CoverageByContent__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3087:1: ( rule__CoverageByContent__Group__5__Impl rule__CoverageByContent__Group__6 )
            // InternalCOV.g:3088:2: rule__CoverageByContent__Group__5__Impl rule__CoverageByContent__Group__6
            {
            pushFollow(FOLLOW_35);
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
    // InternalCOV.g:3095:1: rule__CoverageByContent__Group__5__Impl : ( ( rule__CoverageByContent__ContainmentReferenceAssignment_5 ) ) ;
    public final void rule__CoverageByContent__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3099:1: ( ( ( rule__CoverageByContent__ContainmentReferenceAssignment_5 ) ) )
            // InternalCOV.g:3100:1: ( ( rule__CoverageByContent__ContainmentReferenceAssignment_5 ) )
            {
            // InternalCOV.g:3100:1: ( ( rule__CoverageByContent__ContainmentReferenceAssignment_5 ) )
            // InternalCOV.g:3101:2: ( rule__CoverageByContent__ContainmentReferenceAssignment_5 )
            {
             before(grammarAccess.getCoverageByContentAccess().getContainmentReferenceAssignment_5()); 
            // InternalCOV.g:3102:2: ( rule__CoverageByContent__ContainmentReferenceAssignment_5 )
            // InternalCOV.g:3102:3: rule__CoverageByContent__ContainmentReferenceAssignment_5
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
    // InternalCOV.g:3110:1: rule__CoverageByContent__Group__6 : rule__CoverageByContent__Group__6__Impl rule__CoverageByContent__Group__7 ;
    public final void rule__CoverageByContent__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3114:1: ( rule__CoverageByContent__Group__6__Impl rule__CoverageByContent__Group__7 )
            // InternalCOV.g:3115:2: rule__CoverageByContent__Group__6__Impl rule__CoverageByContent__Group__7
            {
            pushFollow(FOLLOW_26);
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
    // InternalCOV.g:3122:1: rule__CoverageByContent__Group__6__Impl : ( 'iscovered' ) ;
    public final void rule__CoverageByContent__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3126:1: ( ( 'iscovered' ) )
            // InternalCOV.g:3127:1: ( 'iscovered' )
            {
            // InternalCOV.g:3127:1: ( 'iscovered' )
            // InternalCOV.g:3128:2: 'iscovered'
            {
             before(grammarAccess.getCoverageByContentAccess().getIscoveredKeyword_6()); 
            match(input,38,FOLLOW_2); 
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
    // InternalCOV.g:3137:1: rule__CoverageByContent__Group__7 : rule__CoverageByContent__Group__7__Impl ;
    public final void rule__CoverageByContent__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3141:1: ( rule__CoverageByContent__Group__7__Impl )
            // InternalCOV.g:3142:2: rule__CoverageByContent__Group__7__Impl
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
    // InternalCOV.g:3148:1: rule__CoverageByContent__Group__7__Impl : ( ( rule__CoverageByContent__Group_7__0 )? ) ;
    public final void rule__CoverageByContent__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3152:1: ( ( ( rule__CoverageByContent__Group_7__0 )? ) )
            // InternalCOV.g:3153:1: ( ( rule__CoverageByContent__Group_7__0 )? )
            {
            // InternalCOV.g:3153:1: ( ( rule__CoverageByContent__Group_7__0 )? )
            // InternalCOV.g:3154:2: ( rule__CoverageByContent__Group_7__0 )?
            {
             before(grammarAccess.getCoverageByContentAccess().getGroup_7()); 
            // InternalCOV.g:3155:2: ( rule__CoverageByContent__Group_7__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==34) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalCOV.g:3155:3: rule__CoverageByContent__Group_7__0
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
    // InternalCOV.g:3164:1: rule__CoverageByContent__Group_1__0 : rule__CoverageByContent__Group_1__0__Impl rule__CoverageByContent__Group_1__1 ;
    public final void rule__CoverageByContent__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3168:1: ( rule__CoverageByContent__Group_1__0__Impl rule__CoverageByContent__Group_1__1 )
            // InternalCOV.g:3169:2: rule__CoverageByContent__Group_1__0__Impl rule__CoverageByContent__Group_1__1
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
    // InternalCOV.g:3176:1: rule__CoverageByContent__Group_1__0__Impl : ( 'when' ) ;
    public final void rule__CoverageByContent__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3180:1: ( ( 'when' ) )
            // InternalCOV.g:3181:1: ( 'when' )
            {
            // InternalCOV.g:3181:1: ( 'when' )
            // InternalCOV.g:3182:2: 'when'
            {
             before(grammarAccess.getCoverageByContentAccess().getWhenKeyword_1_0()); 
            match(input,32,FOLLOW_2); 
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
    // InternalCOV.g:3191:1: rule__CoverageByContent__Group_1__1 : rule__CoverageByContent__Group_1__1__Impl ;
    public final void rule__CoverageByContent__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3195:1: ( rule__CoverageByContent__Group_1__1__Impl )
            // InternalCOV.g:3196:2: rule__CoverageByContent__Group_1__1__Impl
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
    // InternalCOV.g:3202:1: rule__CoverageByContent__Group_1__1__Impl : ( ( rule__CoverageByContent__ConditionAssignment_1_1 ) ) ;
    public final void rule__CoverageByContent__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3206:1: ( ( ( rule__CoverageByContent__ConditionAssignment_1_1 ) ) )
            // InternalCOV.g:3207:1: ( ( rule__CoverageByContent__ConditionAssignment_1_1 ) )
            {
            // InternalCOV.g:3207:1: ( ( rule__CoverageByContent__ConditionAssignment_1_1 ) )
            // InternalCOV.g:3208:2: ( rule__CoverageByContent__ConditionAssignment_1_1 )
            {
             before(grammarAccess.getCoverageByContentAccess().getConditionAssignment_1_1()); 
            // InternalCOV.g:3209:2: ( rule__CoverageByContent__ConditionAssignment_1_1 )
            // InternalCOV.g:3209:3: rule__CoverageByContent__ConditionAssignment_1_1
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
    // InternalCOV.g:3218:1: rule__CoverageByContent__Group_7__0 : rule__CoverageByContent__Group_7__0__Impl rule__CoverageByContent__Group_7__1 ;
    public final void rule__CoverageByContent__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3222:1: ( rule__CoverageByContent__Group_7__0__Impl rule__CoverageByContent__Group_7__1 )
            // InternalCOV.g:3223:2: rule__CoverageByContent__Group_7__0__Impl rule__CoverageByContent__Group_7__1
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
    // InternalCOV.g:3230:1: rule__CoverageByContent__Group_7__0__Impl : ( 'description' ) ;
    public final void rule__CoverageByContent__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3234:1: ( ( 'description' ) )
            // InternalCOV.g:3235:1: ( 'description' )
            {
            // InternalCOV.g:3235:1: ( 'description' )
            // InternalCOV.g:3236:2: 'description'
            {
             before(grammarAccess.getCoverageByContentAccess().getDescriptionKeyword_7_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalCOV.g:3245:1: rule__CoverageByContent__Group_7__1 : rule__CoverageByContent__Group_7__1__Impl ;
    public final void rule__CoverageByContent__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3249:1: ( rule__CoverageByContent__Group_7__1__Impl )
            // InternalCOV.g:3250:2: rule__CoverageByContent__Group_7__1__Impl
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
    // InternalCOV.g:3256:1: rule__CoverageByContent__Group_7__1__Impl : ( ( rule__CoverageByContent__DescriptionAssignment_7_1 ) ) ;
    public final void rule__CoverageByContent__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3260:1: ( ( ( rule__CoverageByContent__DescriptionAssignment_7_1 ) ) )
            // InternalCOV.g:3261:1: ( ( rule__CoverageByContent__DescriptionAssignment_7_1 ) )
            {
            // InternalCOV.g:3261:1: ( ( rule__CoverageByContent__DescriptionAssignment_7_1 ) )
            // InternalCOV.g:3262:2: ( rule__CoverageByContent__DescriptionAssignment_7_1 )
            {
             before(grammarAccess.getCoverageByContentAccess().getDescriptionAssignment_7_1()); 
            // InternalCOV.g:3263:2: ( rule__CoverageByContent__DescriptionAssignment_7_1 )
            // InternalCOV.g:3263:3: rule__CoverageByContent__DescriptionAssignment_7_1
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
    // InternalCOV.g:3272:1: rule__BranchSpecification__Group__0 : rule__BranchSpecification__Group__0__Impl rule__BranchSpecification__Group__1 ;
    public final void rule__BranchSpecification__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3276:1: ( rule__BranchSpecification__Group__0__Impl rule__BranchSpecification__Group__1 )
            // InternalCOV.g:3277:2: rule__BranchSpecification__Group__0__Impl rule__BranchSpecification__Group__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalCOV.g:3284:1: rule__BranchSpecification__Group__0__Impl : ( () ) ;
    public final void rule__BranchSpecification__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3288:1: ( ( () ) )
            // InternalCOV.g:3289:1: ( () )
            {
            // InternalCOV.g:3289:1: ( () )
            // InternalCOV.g:3290:2: ()
            {
             before(grammarAccess.getBranchSpecificationAccess().getBranchSpecificationAction_0()); 
            // InternalCOV.g:3291:2: ()
            // InternalCOV.g:3291:3: 
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
    // InternalCOV.g:3299:1: rule__BranchSpecification__Group__1 : rule__BranchSpecification__Group__1__Impl rule__BranchSpecification__Group__2 ;
    public final void rule__BranchSpecification__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3303:1: ( rule__BranchSpecification__Group__1__Impl rule__BranchSpecification__Group__2 )
            // InternalCOV.g:3304:2: rule__BranchSpecification__Group__1__Impl rule__BranchSpecification__Group__2
            {
            pushFollow(FOLLOW_22);
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
    // InternalCOV.g:3311:1: rule__BranchSpecification__Group__1__Impl : ( ( rule__BranchSpecification__Group_1__0 )? ) ;
    public final void rule__BranchSpecification__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3315:1: ( ( ( rule__BranchSpecification__Group_1__0 )? ) )
            // InternalCOV.g:3316:1: ( ( rule__BranchSpecification__Group_1__0 )? )
            {
            // InternalCOV.g:3316:1: ( ( rule__BranchSpecification__Group_1__0 )? )
            // InternalCOV.g:3317:2: ( rule__BranchSpecification__Group_1__0 )?
            {
             before(grammarAccess.getBranchSpecificationAccess().getGroup_1()); 
            // InternalCOV.g:3318:2: ( rule__BranchSpecification__Group_1__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==32) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalCOV.g:3318:3: rule__BranchSpecification__Group_1__0
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
    // InternalCOV.g:3326:1: rule__BranchSpecification__Group__2 : rule__BranchSpecification__Group__2__Impl rule__BranchSpecification__Group__3 ;
    public final void rule__BranchSpecification__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3330:1: ( rule__BranchSpecification__Group__2__Impl rule__BranchSpecification__Group__3 )
            // InternalCOV.g:3331:2: rule__BranchSpecification__Group__2__Impl rule__BranchSpecification__Group__3
            {
            pushFollow(FOLLOW_36);
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
    // InternalCOV.g:3338:1: rule__BranchSpecification__Group__2__Impl : ( '{' ) ;
    public final void rule__BranchSpecification__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3342:1: ( ( '{' ) )
            // InternalCOV.g:3343:1: ( '{' )
            {
            // InternalCOV.g:3343:1: ( '{' )
            // InternalCOV.g:3344:2: '{'
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
    // InternalCOV.g:3353:1: rule__BranchSpecification__Group__3 : rule__BranchSpecification__Group__3__Impl rule__BranchSpecification__Group__4 ;
    public final void rule__BranchSpecification__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3357:1: ( rule__BranchSpecification__Group__3__Impl rule__BranchSpecification__Group__4 )
            // InternalCOV.g:3358:2: rule__BranchSpecification__Group__3__Impl rule__BranchSpecification__Group__4
            {
            pushFollow(FOLLOW_37);
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
    // InternalCOV.g:3365:1: rule__BranchSpecification__Group__3__Impl : ( ( rule__BranchSpecification__BranchesAssignment_3 ) ) ;
    public final void rule__BranchSpecification__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3369:1: ( ( ( rule__BranchSpecification__BranchesAssignment_3 ) ) )
            // InternalCOV.g:3370:1: ( ( rule__BranchSpecification__BranchesAssignment_3 ) )
            {
            // InternalCOV.g:3370:1: ( ( rule__BranchSpecification__BranchesAssignment_3 ) )
            // InternalCOV.g:3371:2: ( rule__BranchSpecification__BranchesAssignment_3 )
            {
             before(grammarAccess.getBranchSpecificationAccess().getBranchesAssignment_3()); 
            // InternalCOV.g:3372:2: ( rule__BranchSpecification__BranchesAssignment_3 )
            // InternalCOV.g:3372:3: rule__BranchSpecification__BranchesAssignment_3
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
    // InternalCOV.g:3380:1: rule__BranchSpecification__Group__4 : rule__BranchSpecification__Group__4__Impl rule__BranchSpecification__Group__5 ;
    public final void rule__BranchSpecification__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3384:1: ( rule__BranchSpecification__Group__4__Impl rule__BranchSpecification__Group__5 )
            // InternalCOV.g:3385:2: rule__BranchSpecification__Group__4__Impl rule__BranchSpecification__Group__5
            {
            pushFollow(FOLLOW_37);
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
    // InternalCOV.g:3392:1: rule__BranchSpecification__Group__4__Impl : ( ( rule__BranchSpecification__Group_4__0 )* ) ;
    public final void rule__BranchSpecification__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3396:1: ( ( ( rule__BranchSpecification__Group_4__0 )* ) )
            // InternalCOV.g:3397:1: ( ( rule__BranchSpecification__Group_4__0 )* )
            {
            // InternalCOV.g:3397:1: ( ( rule__BranchSpecification__Group_4__0 )* )
            // InternalCOV.g:3398:2: ( rule__BranchSpecification__Group_4__0 )*
            {
             before(grammarAccess.getBranchSpecificationAccess().getGroup_4()); 
            // InternalCOV.g:3399:2: ( rule__BranchSpecification__Group_4__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==22) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalCOV.g:3399:3: rule__BranchSpecification__Group_4__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__BranchSpecification__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
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
    // InternalCOV.g:3407:1: rule__BranchSpecification__Group__5 : rule__BranchSpecification__Group__5__Impl rule__BranchSpecification__Group__6 ;
    public final void rule__BranchSpecification__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3411:1: ( rule__BranchSpecification__Group__5__Impl rule__BranchSpecification__Group__6 )
            // InternalCOV.g:3412:2: rule__BranchSpecification__Group__5__Impl rule__BranchSpecification__Group__6
            {
            pushFollow(FOLLOW_37);
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
    // InternalCOV.g:3419:1: rule__BranchSpecification__Group__5__Impl : ( ( rule__BranchSpecification__Group_5__0 )? ) ;
    public final void rule__BranchSpecification__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3423:1: ( ( ( rule__BranchSpecification__Group_5__0 )? ) )
            // InternalCOV.g:3424:1: ( ( rule__BranchSpecification__Group_5__0 )? )
            {
            // InternalCOV.g:3424:1: ( ( rule__BranchSpecification__Group_5__0 )? )
            // InternalCOV.g:3425:2: ( rule__BranchSpecification__Group_5__0 )?
            {
             before(grammarAccess.getBranchSpecificationAccess().getGroup_5()); 
            // InternalCOV.g:3426:2: ( rule__BranchSpecification__Group_5__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==34) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalCOV.g:3426:3: rule__BranchSpecification__Group_5__0
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
    // InternalCOV.g:3434:1: rule__BranchSpecification__Group__6 : rule__BranchSpecification__Group__6__Impl ;
    public final void rule__BranchSpecification__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3438:1: ( rule__BranchSpecification__Group__6__Impl )
            // InternalCOV.g:3439:2: rule__BranchSpecification__Group__6__Impl
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
    // InternalCOV.g:3445:1: rule__BranchSpecification__Group__6__Impl : ( '}' ) ;
    public final void rule__BranchSpecification__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3449:1: ( ( '}' ) )
            // InternalCOV.g:3450:1: ( '}' )
            {
            // InternalCOV.g:3450:1: ( '}' )
            // InternalCOV.g:3451:2: '}'
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
    // InternalCOV.g:3461:1: rule__BranchSpecification__Group_1__0 : rule__BranchSpecification__Group_1__0__Impl rule__BranchSpecification__Group_1__1 ;
    public final void rule__BranchSpecification__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3465:1: ( rule__BranchSpecification__Group_1__0__Impl rule__BranchSpecification__Group_1__1 )
            // InternalCOV.g:3466:2: rule__BranchSpecification__Group_1__0__Impl rule__BranchSpecification__Group_1__1
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
    // InternalCOV.g:3473:1: rule__BranchSpecification__Group_1__0__Impl : ( 'when' ) ;
    public final void rule__BranchSpecification__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3477:1: ( ( 'when' ) )
            // InternalCOV.g:3478:1: ( 'when' )
            {
            // InternalCOV.g:3478:1: ( 'when' )
            // InternalCOV.g:3479:2: 'when'
            {
             before(grammarAccess.getBranchSpecificationAccess().getWhenKeyword_1_0()); 
            match(input,32,FOLLOW_2); 
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
    // InternalCOV.g:3488:1: rule__BranchSpecification__Group_1__1 : rule__BranchSpecification__Group_1__1__Impl ;
    public final void rule__BranchSpecification__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3492:1: ( rule__BranchSpecification__Group_1__1__Impl )
            // InternalCOV.g:3493:2: rule__BranchSpecification__Group_1__1__Impl
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
    // InternalCOV.g:3499:1: rule__BranchSpecification__Group_1__1__Impl : ( ( rule__BranchSpecification__ConditionAssignment_1_1 ) ) ;
    public final void rule__BranchSpecification__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3503:1: ( ( ( rule__BranchSpecification__ConditionAssignment_1_1 ) ) )
            // InternalCOV.g:3504:1: ( ( rule__BranchSpecification__ConditionAssignment_1_1 ) )
            {
            // InternalCOV.g:3504:1: ( ( rule__BranchSpecification__ConditionAssignment_1_1 ) )
            // InternalCOV.g:3505:2: ( rule__BranchSpecification__ConditionAssignment_1_1 )
            {
             before(grammarAccess.getBranchSpecificationAccess().getConditionAssignment_1_1()); 
            // InternalCOV.g:3506:2: ( rule__BranchSpecification__ConditionAssignment_1_1 )
            // InternalCOV.g:3506:3: rule__BranchSpecification__ConditionAssignment_1_1
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
    // InternalCOV.g:3515:1: rule__BranchSpecification__Group_4__0 : rule__BranchSpecification__Group_4__0__Impl rule__BranchSpecification__Group_4__1 ;
    public final void rule__BranchSpecification__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3519:1: ( rule__BranchSpecification__Group_4__0__Impl rule__BranchSpecification__Group_4__1 )
            // InternalCOV.g:3520:2: rule__BranchSpecification__Group_4__0__Impl rule__BranchSpecification__Group_4__1
            {
            pushFollow(FOLLOW_36);
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
    // InternalCOV.g:3527:1: rule__BranchSpecification__Group_4__0__Impl : ( ',' ) ;
    public final void rule__BranchSpecification__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3531:1: ( ( ',' ) )
            // InternalCOV.g:3532:1: ( ',' )
            {
            // InternalCOV.g:3532:1: ( ',' )
            // InternalCOV.g:3533:2: ','
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
    // InternalCOV.g:3542:1: rule__BranchSpecification__Group_4__1 : rule__BranchSpecification__Group_4__1__Impl ;
    public final void rule__BranchSpecification__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3546:1: ( rule__BranchSpecification__Group_4__1__Impl )
            // InternalCOV.g:3547:2: rule__BranchSpecification__Group_4__1__Impl
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
    // InternalCOV.g:3553:1: rule__BranchSpecification__Group_4__1__Impl : ( ( rule__BranchSpecification__BranchesAssignment_4_1 ) ) ;
    public final void rule__BranchSpecification__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3557:1: ( ( ( rule__BranchSpecification__BranchesAssignment_4_1 ) ) )
            // InternalCOV.g:3558:1: ( ( rule__BranchSpecification__BranchesAssignment_4_1 ) )
            {
            // InternalCOV.g:3558:1: ( ( rule__BranchSpecification__BranchesAssignment_4_1 ) )
            // InternalCOV.g:3559:2: ( rule__BranchSpecification__BranchesAssignment_4_1 )
            {
             before(grammarAccess.getBranchSpecificationAccess().getBranchesAssignment_4_1()); 
            // InternalCOV.g:3560:2: ( rule__BranchSpecification__BranchesAssignment_4_1 )
            // InternalCOV.g:3560:3: rule__BranchSpecification__BranchesAssignment_4_1
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
    // InternalCOV.g:3569:1: rule__BranchSpecification__Group_5__0 : rule__BranchSpecification__Group_5__0__Impl rule__BranchSpecification__Group_5__1 ;
    public final void rule__BranchSpecification__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3573:1: ( rule__BranchSpecification__Group_5__0__Impl rule__BranchSpecification__Group_5__1 )
            // InternalCOV.g:3574:2: rule__BranchSpecification__Group_5__0__Impl rule__BranchSpecification__Group_5__1
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
    // InternalCOV.g:3581:1: rule__BranchSpecification__Group_5__0__Impl : ( 'description' ) ;
    public final void rule__BranchSpecification__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3585:1: ( ( 'description' ) )
            // InternalCOV.g:3586:1: ( 'description' )
            {
            // InternalCOV.g:3586:1: ( 'description' )
            // InternalCOV.g:3587:2: 'description'
            {
             before(grammarAccess.getBranchSpecificationAccess().getDescriptionKeyword_5_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalCOV.g:3596:1: rule__BranchSpecification__Group_5__1 : rule__BranchSpecification__Group_5__1__Impl ;
    public final void rule__BranchSpecification__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3600:1: ( rule__BranchSpecification__Group_5__1__Impl )
            // InternalCOV.g:3601:2: rule__BranchSpecification__Group_5__1__Impl
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
    // InternalCOV.g:3607:1: rule__BranchSpecification__Group_5__1__Impl : ( ( rule__BranchSpecification__DescriptionAssignment_5_1 ) ) ;
    public final void rule__BranchSpecification__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3611:1: ( ( ( rule__BranchSpecification__DescriptionAssignment_5_1 ) ) )
            // InternalCOV.g:3612:1: ( ( rule__BranchSpecification__DescriptionAssignment_5_1 ) )
            {
            // InternalCOV.g:3612:1: ( ( rule__BranchSpecification__DescriptionAssignment_5_1 ) )
            // InternalCOV.g:3613:2: ( rule__BranchSpecification__DescriptionAssignment_5_1 )
            {
             before(grammarAccess.getBranchSpecificationAccess().getDescriptionAssignment_5_1()); 
            // InternalCOV.g:3614:2: ( rule__BranchSpecification__DescriptionAssignment_5_1 )
            // InternalCOV.g:3614:3: rule__BranchSpecification__DescriptionAssignment_5_1
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
    // InternalCOV.g:3623:1: rule__ExplicitBranch__Group__0 : rule__ExplicitBranch__Group__0__Impl rule__ExplicitBranch__Group__1 ;
    public final void rule__ExplicitBranch__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3627:1: ( rule__ExplicitBranch__Group__0__Impl rule__ExplicitBranch__Group__1 )
            // InternalCOV.g:3628:2: rule__ExplicitBranch__Group__0__Impl rule__ExplicitBranch__Group__1
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
    // InternalCOV.g:3635:1: rule__ExplicitBranch__Group__0__Impl : ( 'branch' ) ;
    public final void rule__ExplicitBranch__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3639:1: ( ( 'branch' ) )
            // InternalCOV.g:3640:1: ( 'branch' )
            {
            // InternalCOV.g:3640:1: ( 'branch' )
            // InternalCOV.g:3641:2: 'branch'
            {
             before(grammarAccess.getExplicitBranchAccess().getBranchKeyword_0()); 
            match(input,39,FOLLOW_2); 
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
    // InternalCOV.g:3650:1: rule__ExplicitBranch__Group__1 : rule__ExplicitBranch__Group__1__Impl ;
    public final void rule__ExplicitBranch__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3654:1: ( rule__ExplicitBranch__Group__1__Impl )
            // InternalCOV.g:3655:2: rule__ExplicitBranch__Group__1__Impl
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
    // InternalCOV.g:3661:1: rule__ExplicitBranch__Group__1__Impl : ( ( rule__ExplicitBranch__OCLQueryAssignment_1 ) ) ;
    public final void rule__ExplicitBranch__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3665:1: ( ( ( rule__ExplicitBranch__OCLQueryAssignment_1 ) ) )
            // InternalCOV.g:3666:1: ( ( rule__ExplicitBranch__OCLQueryAssignment_1 ) )
            {
            // InternalCOV.g:3666:1: ( ( rule__ExplicitBranch__OCLQueryAssignment_1 ) )
            // InternalCOV.g:3667:2: ( rule__ExplicitBranch__OCLQueryAssignment_1 )
            {
             before(grammarAccess.getExplicitBranchAccess().getOCLQueryAssignment_1()); 
            // InternalCOV.g:3668:2: ( rule__ExplicitBranch__OCLQueryAssignment_1 )
            // InternalCOV.g:3668:3: rule__ExplicitBranch__OCLQueryAssignment_1
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
    // InternalCOV.g:3677:1: rule__ImplicitBranch__Group__0 : rule__ImplicitBranch__Group__0__Impl rule__ImplicitBranch__Group__1 ;
    public final void rule__ImplicitBranch__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3681:1: ( rule__ImplicitBranch__Group__0__Impl rule__ImplicitBranch__Group__1 )
            // InternalCOV.g:3682:2: rule__ImplicitBranch__Group__0__Impl rule__ImplicitBranch__Group__1
            {
            pushFollow(FOLLOW_36);
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
    // InternalCOV.g:3689:1: rule__ImplicitBranch__Group__0__Impl : ( () ) ;
    public final void rule__ImplicitBranch__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3693:1: ( ( () ) )
            // InternalCOV.g:3694:1: ( () )
            {
            // InternalCOV.g:3694:1: ( () )
            // InternalCOV.g:3695:2: ()
            {
             before(grammarAccess.getImplicitBranchAccess().getImplicitBranchAction_0()); 
            // InternalCOV.g:3696:2: ()
            // InternalCOV.g:3696:3: 
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
    // InternalCOV.g:3704:1: rule__ImplicitBranch__Group__1 : rule__ImplicitBranch__Group__1__Impl rule__ImplicitBranch__Group__2 ;
    public final void rule__ImplicitBranch__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3708:1: ( rule__ImplicitBranch__Group__1__Impl rule__ImplicitBranch__Group__2 )
            // InternalCOV.g:3709:2: rule__ImplicitBranch__Group__1__Impl rule__ImplicitBranch__Group__2
            {
            pushFollow(FOLLOW_38);
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
    // InternalCOV.g:3716:1: rule__ImplicitBranch__Group__1__Impl : ( 'branch' ) ;
    public final void rule__ImplicitBranch__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3720:1: ( ( 'branch' ) )
            // InternalCOV.g:3721:1: ( 'branch' )
            {
            // InternalCOV.g:3721:1: ( 'branch' )
            // InternalCOV.g:3722:2: 'branch'
            {
             before(grammarAccess.getImplicitBranchAccess().getBranchKeyword_1()); 
            match(input,39,FOLLOW_2); 
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
    // InternalCOV.g:3731:1: rule__ImplicitBranch__Group__2 : rule__ImplicitBranch__Group__2__Impl ;
    public final void rule__ImplicitBranch__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3735:1: ( rule__ImplicitBranch__Group__2__Impl )
            // InternalCOV.g:3736:2: rule__ImplicitBranch__Group__2__Impl
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
    // InternalCOV.g:3742:1: rule__ImplicitBranch__Group__2__Impl : ( 'else' ) ;
    public final void rule__ImplicitBranch__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3746:1: ( ( 'else' ) )
            // InternalCOV.g:3747:1: ( 'else' )
            {
            // InternalCOV.g:3747:1: ( 'else' )
            // InternalCOV.g:3748:2: 'else'
            {
             before(grammarAccess.getImplicitBranchAccess().getElseKeyword_2()); 
            match(input,40,FOLLOW_2); 
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
    // InternalCOV.g:3758:1: rule__DomainSpecificCoverage__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__DomainSpecificCoverage__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3762:1: ( ( ruleEString ) )
            // InternalCOV.g:3763:2: ( ruleEString )
            {
            // InternalCOV.g:3763:2: ( ruleEString )
            // InternalCOV.g:3764:3: ruleEString
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
    // InternalCOV.g:3773:1: rule__DomainSpecificCoverage__MetamodelAssignment_5 : ( ( ruleEString ) ) ;
    public final void rule__DomainSpecificCoverage__MetamodelAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3777:1: ( ( ( ruleEString ) ) )
            // InternalCOV.g:3778:2: ( ( ruleEString ) )
            {
            // InternalCOV.g:3778:2: ( ( ruleEString ) )
            // InternalCOV.g:3779:3: ( ruleEString )
            {
             before(grammarAccess.getDomainSpecificCoverageAccess().getMetamodelEPackageCrossReference_5_0()); 
            // InternalCOV.g:3780:3: ( ruleEString )
            // InternalCOV.g:3781:4: ruleEString
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
    // InternalCOV.g:3792:1: rule__DomainSpecificCoverage__ImportsAssignment_6_2 : ( ruleImport ) ;
    public final void rule__DomainSpecificCoverage__ImportsAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3796:1: ( ( ruleImport ) )
            // InternalCOV.g:3797:2: ( ruleImport )
            {
            // InternalCOV.g:3797:2: ( ruleImport )
            // InternalCOV.g:3798:3: ruleImport
            {
             before(grammarAccess.getDomainSpecificCoverageAccess().getImportsImportParserRuleCall_6_2_0()); 
            pushFollow(FOLLOW_2);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getDomainSpecificCoverageAccess().getImportsImportParserRuleCall_6_2_0()); 

            }


            }

        }
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
    // InternalCOV.g:3807:1: rule__DomainSpecificCoverage__ImportsAssignment_6_3_1 : ( ruleImport ) ;
    public final void rule__DomainSpecificCoverage__ImportsAssignment_6_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3811:1: ( ( ruleImport ) )
            // InternalCOV.g:3812:2: ( ruleImport )
            {
            // InternalCOV.g:3812:2: ( ruleImport )
            // InternalCOV.g:3813:3: ruleImport
            {
             before(grammarAccess.getDomainSpecificCoverageAccess().getImportsImportParserRuleCall_6_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getDomainSpecificCoverageAccess().getImportsImportParserRuleCall_6_3_1_0()); 

            }


            }

        }
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
    // InternalCOV.g:3822:1: rule__DomainSpecificCoverage__ContextsAssignment_7 : ( ruleContext ) ;
    public final void rule__DomainSpecificCoverage__ContextsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3826:1: ( ( ruleContext ) )
            // InternalCOV.g:3827:2: ( ruleContext )
            {
            // InternalCOV.g:3827:2: ( ruleContext )
            // InternalCOV.g:3828:3: ruleContext
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
    // InternalCOV.g:3837:1: rule__DomainSpecificCoverage__ContextsAssignment_8_1 : ( ruleContext ) ;
    public final void rule__DomainSpecificCoverage__ContextsAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3841:1: ( ( ruleContext ) )
            // InternalCOV.g:3842:2: ( ruleContext )
            {
            // InternalCOV.g:3842:2: ( ruleContext )
            // InternalCOV.g:3843:3: ruleContext
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


    // $ANTLR start "rule__Import__ImportedNamespaceAssignment_0_1_1"
    // InternalCOV.g:3852:1: rule__Import__ImportedNamespaceAssignment_0_1_1 : ( ruleImportedFQN ) ;
    public final void rule__Import__ImportedNamespaceAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3856:1: ( ( ruleImportedFQN ) )
            // InternalCOV.g:3857:2: ( ruleImportedFQN )
            {
            // InternalCOV.g:3857:2: ( ruleImportedFQN )
            // InternalCOV.g:3858:3: ruleImportedFQN
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceImportedFQNParserRuleCall_0_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleImportedFQN();

            state._fsp--;

             after(grammarAccess.getImportAccess().getImportedNamespaceImportedFQNParserRuleCall_0_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__ImportedNamespaceAssignment_0_1_1"


    // $ANTLR start "rule__Import__ImportURIAssignment_0_1_2_1"
    // InternalCOV.g:3867:1: rule__Import__ImportURIAssignment_0_1_2_1 : ( RULE_STRING ) ;
    public final void rule__Import__ImportURIAssignment_0_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3871:1: ( ( RULE_STRING ) )
            // InternalCOV.g:3872:2: ( RULE_STRING )
            {
            // InternalCOV.g:3872:2: ( RULE_STRING )
            // InternalCOV.g:3873:3: RULE_STRING
            {
             before(grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_0_1_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_0_1_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__ImportURIAssignment_0_1_2_1"


    // $ANTLR start "rule__Import__ImportURIAssignment_1_1"
    // InternalCOV.g:3882:1: rule__Import__ImportURIAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__Import__ImportURIAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3886:1: ( ( RULE_STRING ) )
            // InternalCOV.g:3887:2: ( RULE_STRING )
            {
            // InternalCOV.g:3887:2: ( RULE_STRING )
            // InternalCOV.g:3888:3: RULE_STRING
            {
             before(grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__ImportURIAssignment_1_1"


    // $ANTLR start "rule__Import__ImportedRulesetAssignment_2"
    // InternalCOV.g:3897:1: rule__Import__ImportedRulesetAssignment_2 : ( ( ruleEString ) ) ;
    public final void rule__Import__ImportedRulesetAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3901:1: ( ( ( ruleEString ) ) )
            // InternalCOV.g:3902:2: ( ( ruleEString ) )
            {
            // InternalCOV.g:3902:2: ( ( ruleEString ) )
            // InternalCOV.g:3903:3: ( ruleEString )
            {
             before(grammarAccess.getImportAccess().getImportedRulesetDomainSpecificCoverageCrossReference_2_0()); 
            // InternalCOV.g:3904:3: ( ruleEString )
            // InternalCOV.g:3905:4: ruleEString
            {
             before(grammarAccess.getImportAccess().getImportedRulesetDomainSpecificCoverageEStringParserRuleCall_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getImportAccess().getImportedRulesetDomainSpecificCoverageEStringParserRuleCall_2_0_1()); 

            }

             after(grammarAccess.getImportAccess().getImportedRulesetDomainSpecificCoverageCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__ImportedRulesetAssignment_2"


    // $ANTLR start "rule__Context__MetaclassAssignment_1"
    // InternalCOV.g:3916:1: rule__Context__MetaclassAssignment_1 : ( ( ruleEString ) ) ;
    public final void rule__Context__MetaclassAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3920:1: ( ( ( ruleEString ) ) )
            // InternalCOV.g:3921:2: ( ( ruleEString ) )
            {
            // InternalCOV.g:3921:2: ( ( ruleEString ) )
            // InternalCOV.g:3922:3: ( ruleEString )
            {
             before(grammarAccess.getContextAccess().getMetaclassEClassCrossReference_1_0()); 
            // InternalCOV.g:3923:3: ( ruleEString )
            // InternalCOV.g:3924:4: ruleEString
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
    // InternalCOV.g:3935:1: rule__Context__RulesAssignment_3_0 : ( ruleRule ) ;
    public final void rule__Context__RulesAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3939:1: ( ( ruleRule ) )
            // InternalCOV.g:3940:2: ( ruleRule )
            {
            // InternalCOV.g:3940:2: ( ruleRule )
            // InternalCOV.g:3941:3: ruleRule
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
    // InternalCOV.g:3950:1: rule__Context__RulesAssignment_3_1_1 : ( ruleRule ) ;
    public final void rule__Context__RulesAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3954:1: ( ( ruleRule ) )
            // InternalCOV.g:3955:2: ( ruleRule )
            {
            // InternalCOV.g:3955:2: ( ruleRule )
            // InternalCOV.g:3956:3: ruleRule
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
    // InternalCOV.g:3965:1: rule__Ignore__ConditionAssignment_1_1 : ( ruleCondition ) ;
    public final void rule__Ignore__ConditionAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3969:1: ( ( ruleCondition ) )
            // InternalCOV.g:3970:2: ( ruleCondition )
            {
            // InternalCOV.g:3970:2: ( ruleCondition )
            // InternalCOV.g:3971:3: ruleCondition
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
    // InternalCOV.g:3980:1: rule__Ignore__IgnoreSubtypesAssignment_4_1 : ( ruleEBoolean ) ;
    public final void rule__Ignore__IgnoreSubtypesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3984:1: ( ( ruleEBoolean ) )
            // InternalCOV.g:3985:2: ( ruleEBoolean )
            {
            // InternalCOV.g:3985:2: ( ruleEBoolean )
            // InternalCOV.g:3986:3: ruleEBoolean
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
    // InternalCOV.g:3995:1: rule__Ignore__DescriptionAssignment_6_1 : ( ruleEString ) ;
    public final void rule__Ignore__DescriptionAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:3999:1: ( ( ruleEString ) )
            // InternalCOV.g:4000:2: ( ruleEString )
            {
            // InternalCOV.g:4000:2: ( ruleEString )
            // InternalCOV.g:4001:3: ruleEString
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
    // InternalCOV.g:4010:1: rule__LimitedIgnore__ConditionAssignment_1_1 : ( ruleCondition ) ;
    public final void rule__LimitedIgnore__ConditionAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:4014:1: ( ( ruleCondition ) )
            // InternalCOV.g:4015:2: ( ruleCondition )
            {
            // InternalCOV.g:4015:2: ( ruleCondition )
            // InternalCOV.g:4016:3: ruleCondition
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
    // InternalCOV.g:4025:1: rule__LimitedIgnore__TypeAssignment_3 : ( ruleLimitationType ) ;
    public final void rule__LimitedIgnore__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:4029:1: ( ( ruleLimitationType ) )
            // InternalCOV.g:4030:2: ( ruleLimitationType )
            {
            // InternalCOV.g:4030:2: ( ruleLimitationType )
            // InternalCOV.g:4031:3: ruleLimitationType
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
    // InternalCOV.g:4040:1: rule__LimitedIgnore__ContainerMetaclassAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__LimitedIgnore__ContainerMetaclassAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:4044:1: ( ( ( ruleEString ) ) )
            // InternalCOV.g:4045:2: ( ( ruleEString ) )
            {
            // InternalCOV.g:4045:2: ( ( ruleEString ) )
            // InternalCOV.g:4046:3: ( ruleEString )
            {
             before(grammarAccess.getLimitedIgnoreAccess().getContainerMetaclassEClassCrossReference_4_0()); 
            // InternalCOV.g:4047:3: ( ruleEString )
            // InternalCOV.g:4048:4: ruleEString
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
    // InternalCOV.g:4059:1: rule__LimitedIgnore__ContainerMetaclassAssignment_5_1 : ( ( ruleEString ) ) ;
    public final void rule__LimitedIgnore__ContainerMetaclassAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:4063:1: ( ( ( ruleEString ) ) )
            // InternalCOV.g:4064:2: ( ( ruleEString ) )
            {
            // InternalCOV.g:4064:2: ( ( ruleEString ) )
            // InternalCOV.g:4065:3: ( ruleEString )
            {
             before(grammarAccess.getLimitedIgnoreAccess().getContainerMetaclassEClassCrossReference_5_1_0()); 
            // InternalCOV.g:4066:3: ( ruleEString )
            // InternalCOV.g:4067:4: ruleEString
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
    // InternalCOV.g:4078:1: rule__LimitedIgnore__DescriptionAssignment_6_1 : ( ruleEString ) ;
    public final void rule__LimitedIgnore__DescriptionAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:4082:1: ( ( ruleEString ) )
            // InternalCOV.g:4083:2: ( ruleEString )
            {
            // InternalCOV.g:4083:2: ( ruleEString )
            // InternalCOV.g:4084:3: ruleEString
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
    // InternalCOV.g:4093:1: rule__CoverageOfReferenced__ConditionAssignment_1_1 : ( ruleCondition ) ;
    public final void rule__CoverageOfReferenced__ConditionAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:4097:1: ( ( ruleCondition ) )
            // InternalCOV.g:4098:2: ( ruleCondition )
            {
            // InternalCOV.g:4098:2: ( ruleCondition )
            // InternalCOV.g:4099:3: ruleCondition
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
    // InternalCOV.g:4108:1: rule__CoverageOfReferenced__ReferenceAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__CoverageOfReferenced__ReferenceAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:4112:1: ( ( ( ruleEString ) ) )
            // InternalCOV.g:4113:2: ( ( ruleEString ) )
            {
            // InternalCOV.g:4113:2: ( ( ruleEString ) )
            // InternalCOV.g:4114:3: ( ruleEString )
            {
             before(grammarAccess.getCoverageOfReferencedAccess().getReferenceEReferenceCrossReference_3_0()); 
            // InternalCOV.g:4115:3: ( ruleEString )
            // InternalCOV.g:4116:4: ruleEString
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
    // InternalCOV.g:4127:1: rule__CoverageOfReferenced__ReferenceAssignment_4_1 : ( ( ruleEString ) ) ;
    public final void rule__CoverageOfReferenced__ReferenceAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:4131:1: ( ( ( ruleEString ) ) )
            // InternalCOV.g:4132:2: ( ( ruleEString ) )
            {
            // InternalCOV.g:4132:2: ( ( ruleEString ) )
            // InternalCOV.g:4133:3: ( ruleEString )
            {
             before(grammarAccess.getCoverageOfReferencedAccess().getReferenceEReferenceCrossReference_4_1_0()); 
            // InternalCOV.g:4134:3: ( ruleEString )
            // InternalCOV.g:4135:4: ruleEString
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
    // InternalCOV.g:4146:1: rule__CoverageOfReferenced__DescriptionAssignment_5_1 : ( ruleEString ) ;
    public final void rule__CoverageOfReferenced__DescriptionAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:4150:1: ( ( ruleEString ) )
            // InternalCOV.g:4151:2: ( ruleEString )
            {
            // InternalCOV.g:4151:2: ( ruleEString )
            // InternalCOV.g:4152:3: ruleEString
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
    // InternalCOV.g:4161:1: rule__CoverageByContent__ConditionAssignment_1_1 : ( ruleCondition ) ;
    public final void rule__CoverageByContent__ConditionAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:4165:1: ( ( ruleCondition ) )
            // InternalCOV.g:4166:2: ( ruleCondition )
            {
            // InternalCOV.g:4166:2: ( ruleCondition )
            // InternalCOV.g:4167:3: ruleCondition
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
    // InternalCOV.g:4176:1: rule__CoverageByContent__MultiplicityAssignment_4 : ( ruleCoveredContents ) ;
    public final void rule__CoverageByContent__MultiplicityAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:4180:1: ( ( ruleCoveredContents ) )
            // InternalCOV.g:4181:2: ( ruleCoveredContents )
            {
            // InternalCOV.g:4181:2: ( ruleCoveredContents )
            // InternalCOV.g:4182:3: ruleCoveredContents
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
    // InternalCOV.g:4191:1: rule__CoverageByContent__ContainmentReferenceAssignment_5 : ( ( ruleEString ) ) ;
    public final void rule__CoverageByContent__ContainmentReferenceAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:4195:1: ( ( ( ruleEString ) ) )
            // InternalCOV.g:4196:2: ( ( ruleEString ) )
            {
            // InternalCOV.g:4196:2: ( ( ruleEString ) )
            // InternalCOV.g:4197:3: ( ruleEString )
            {
             before(grammarAccess.getCoverageByContentAccess().getContainmentReferenceEReferenceCrossReference_5_0()); 
            // InternalCOV.g:4198:3: ( ruleEString )
            // InternalCOV.g:4199:4: ruleEString
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
    // InternalCOV.g:4210:1: rule__CoverageByContent__DescriptionAssignment_7_1 : ( ruleEString ) ;
    public final void rule__CoverageByContent__DescriptionAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:4214:1: ( ( ruleEString ) )
            // InternalCOV.g:4215:2: ( ruleEString )
            {
            // InternalCOV.g:4215:2: ( ruleEString )
            // InternalCOV.g:4216:3: ruleEString
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
    // InternalCOV.g:4225:1: rule__BranchSpecification__ConditionAssignment_1_1 : ( ruleCondition ) ;
    public final void rule__BranchSpecification__ConditionAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:4229:1: ( ( ruleCondition ) )
            // InternalCOV.g:4230:2: ( ruleCondition )
            {
            // InternalCOV.g:4230:2: ( ruleCondition )
            // InternalCOV.g:4231:3: ruleCondition
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
    // InternalCOV.g:4240:1: rule__BranchSpecification__BranchesAssignment_3 : ( ruleBranch ) ;
    public final void rule__BranchSpecification__BranchesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:4244:1: ( ( ruleBranch ) )
            // InternalCOV.g:4245:2: ( ruleBranch )
            {
            // InternalCOV.g:4245:2: ( ruleBranch )
            // InternalCOV.g:4246:3: ruleBranch
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
    // InternalCOV.g:4255:1: rule__BranchSpecification__BranchesAssignment_4_1 : ( ruleBranch ) ;
    public final void rule__BranchSpecification__BranchesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:4259:1: ( ( ruleBranch ) )
            // InternalCOV.g:4260:2: ( ruleBranch )
            {
            // InternalCOV.g:4260:2: ( ruleBranch )
            // InternalCOV.g:4261:3: ruleBranch
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
    // InternalCOV.g:4270:1: rule__BranchSpecification__DescriptionAssignment_5_1 : ( ruleEString ) ;
    public final void rule__BranchSpecification__DescriptionAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:4274:1: ( ( ruleEString ) )
            // InternalCOV.g:4275:2: ( ruleEString )
            {
            // InternalCOV.g:4275:2: ( ruleEString )
            // InternalCOV.g:4276:3: ruleEString
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
    // InternalCOV.g:4285:1: rule__ExplicitBranch__OCLQueryAssignment_1 : ( ruleEString ) ;
    public final void rule__ExplicitBranch__OCLQueryAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:4289:1: ( ( ruleEString ) )
            // InternalCOV.g:4290:2: ( ruleEString )
            {
            // InternalCOV.g:4290:2: ( ruleEString )
            // InternalCOV.g:4291:3: ruleEString
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
    // InternalCOV.g:4300:1: rule__Condition__OCLConstraintAssignment : ( ruleEString ) ;
    public final void rule__Condition__OCLConstraintAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCOV.g:4304:1: ( ( ruleEString ) )
            // InternalCOV.g:4305:2: ( ruleEString )
            {
            // InternalCOV.g:4305:2: ( ruleEString )
            // InternalCOV.g:4306:3: ruleEString
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
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000010080000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000002800030L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000003920240000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000003920040000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000120000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000280000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000900000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000400400000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000001100000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000002100000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000400600000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000010000000000L});

}