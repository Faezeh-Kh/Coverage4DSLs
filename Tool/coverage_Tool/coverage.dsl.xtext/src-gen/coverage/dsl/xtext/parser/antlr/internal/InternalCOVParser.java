package coverage.dsl.xtext.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import coverage.dsl.xtext.services.COVGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCOVParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'ruleset'", "'{'", "'import'", "'metamodel'", "','", "'}'", "'ModelElementCoverageRuleset'", "'BranchCoverageRuleset'", "'context'", "'true'", "'false'", "'ignore'", "'('", "'subtypes'", "')'", "'description'", "'condition'", "'ignoreif'", "'covers'", "'covered'", "'when'", "'iscovered'", "'has'", "'branches'", "'queryBranch'", "'ALL'", "'ONE'", "'containedBy'", "'notContainedBy'"
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

        public InternalCOVParser(TokenStream input, COVGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "DomainSpecificCoverage";
       	}

       	@Override
       	protected COVGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleDomainSpecificCoverage"
    // InternalCOV.g:65:1: entryRuleDomainSpecificCoverage returns [EObject current=null] : iv_ruleDomainSpecificCoverage= ruleDomainSpecificCoverage EOF ;
    public final EObject entryRuleDomainSpecificCoverage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomainSpecificCoverage = null;


        try {
            // InternalCOV.g:65:63: (iv_ruleDomainSpecificCoverage= ruleDomainSpecificCoverage EOF )
            // InternalCOV.g:66:2: iv_ruleDomainSpecificCoverage= ruleDomainSpecificCoverage EOF
            {
             newCompositeNode(grammarAccess.getDomainSpecificCoverageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDomainSpecificCoverage=ruleDomainSpecificCoverage();

            state._fsp--;

             current =iv_ruleDomainSpecificCoverage; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDomainSpecificCoverage"


    // $ANTLR start "ruleDomainSpecificCoverage"
    // InternalCOV.g:72:1: ruleDomainSpecificCoverage returns [EObject current=null] : (otherlv_0= 'ruleset' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'import' otherlv_4= 'metamodel' ( ( ruleEString ) ) ( (lv_coverageMetrics_6_0= ruleCoverageMetric ) ) (otherlv_7= ',' ( (lv_coverageMetrics_8_0= ruleCoverageMetric ) ) )* otherlv_9= '}' ) ;
    public final EObject ruleDomainSpecificCoverage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_coverageMetrics_6_0 = null;

        EObject lv_coverageMetrics_8_0 = null;



        	enterRule();

        try {
            // InternalCOV.g:78:2: ( (otherlv_0= 'ruleset' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'import' otherlv_4= 'metamodel' ( ( ruleEString ) ) ( (lv_coverageMetrics_6_0= ruleCoverageMetric ) ) (otherlv_7= ',' ( (lv_coverageMetrics_8_0= ruleCoverageMetric ) ) )* otherlv_9= '}' ) )
            // InternalCOV.g:79:2: (otherlv_0= 'ruleset' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'import' otherlv_4= 'metamodel' ( ( ruleEString ) ) ( (lv_coverageMetrics_6_0= ruleCoverageMetric ) ) (otherlv_7= ',' ( (lv_coverageMetrics_8_0= ruleCoverageMetric ) ) )* otherlv_9= '}' )
            {
            // InternalCOV.g:79:2: (otherlv_0= 'ruleset' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'import' otherlv_4= 'metamodel' ( ( ruleEString ) ) ( (lv_coverageMetrics_6_0= ruleCoverageMetric ) ) (otherlv_7= ',' ( (lv_coverageMetrics_8_0= ruleCoverageMetric ) ) )* otherlv_9= '}' )
            // InternalCOV.g:80:3: otherlv_0= 'ruleset' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'import' otherlv_4= 'metamodel' ( ( ruleEString ) ) ( (lv_coverageMetrics_6_0= ruleCoverageMetric ) ) (otherlv_7= ',' ( (lv_coverageMetrics_8_0= ruleCoverageMetric ) ) )* otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDomainSpecificCoverageAccess().getRulesetKeyword_0());
            		
            // InternalCOV.g:84:3: ( (lv_name_1_0= ruleEString ) )
            // InternalCOV.g:85:4: (lv_name_1_0= ruleEString )
            {
            // InternalCOV.g:85:4: (lv_name_1_0= ruleEString )
            // InternalCOV.g:86:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDomainSpecificCoverageAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDomainSpecificCoverageRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"coverage.dsl.xtext.COV.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getDomainSpecificCoverageAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getDomainSpecificCoverageAccess().getImportKeyword_3());
            		
            otherlv_4=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getDomainSpecificCoverageAccess().getMetamodelKeyword_4());
            		
            // InternalCOV.g:115:3: ( ( ruleEString ) )
            // InternalCOV.g:116:4: ( ruleEString )
            {
            // InternalCOV.g:116:4: ( ruleEString )
            // InternalCOV.g:117:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDomainSpecificCoverageRule());
            					}
            				

            					newCompositeNode(grammarAccess.getDomainSpecificCoverageAccess().getMetamodelEPackageCrossReference_5_0());
            				
            pushFollow(FOLLOW_7);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCOV.g:131:3: ( (lv_coverageMetrics_6_0= ruleCoverageMetric ) )
            // InternalCOV.g:132:4: (lv_coverageMetrics_6_0= ruleCoverageMetric )
            {
            // InternalCOV.g:132:4: (lv_coverageMetrics_6_0= ruleCoverageMetric )
            // InternalCOV.g:133:5: lv_coverageMetrics_6_0= ruleCoverageMetric
            {

            					newCompositeNode(grammarAccess.getDomainSpecificCoverageAccess().getCoverageMetricsCoverageMetricParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_8);
            lv_coverageMetrics_6_0=ruleCoverageMetric();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDomainSpecificCoverageRule());
            					}
            					add(
            						current,
            						"coverageMetrics",
            						lv_coverageMetrics_6_0,
            						"coverage.dsl.xtext.COV.CoverageMetric");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCOV.g:150:3: (otherlv_7= ',' ( (lv_coverageMetrics_8_0= ruleCoverageMetric ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalCOV.g:151:4: otherlv_7= ',' ( (lv_coverageMetrics_8_0= ruleCoverageMetric ) )
            	    {
            	    otherlv_7=(Token)match(input,15,FOLLOW_7); 

            	    				newLeafNode(otherlv_7, grammarAccess.getDomainSpecificCoverageAccess().getCommaKeyword_7_0());
            	    			
            	    // InternalCOV.g:155:4: ( (lv_coverageMetrics_8_0= ruleCoverageMetric ) )
            	    // InternalCOV.g:156:5: (lv_coverageMetrics_8_0= ruleCoverageMetric )
            	    {
            	    // InternalCOV.g:156:5: (lv_coverageMetrics_8_0= ruleCoverageMetric )
            	    // InternalCOV.g:157:6: lv_coverageMetrics_8_0= ruleCoverageMetric
            	    {

            	    						newCompositeNode(grammarAccess.getDomainSpecificCoverageAccess().getCoverageMetricsCoverageMetricParserRuleCall_7_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_coverageMetrics_8_0=ruleCoverageMetric();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getDomainSpecificCoverageRule());
            	    						}
            	    						add(
            	    							current,
            	    							"coverageMetrics",
            	    							lv_coverageMetrics_8_0,
            	    							"coverage.dsl.xtext.COV.CoverageMetric");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_9=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getDomainSpecificCoverageAccess().getRightCurlyBracketKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDomainSpecificCoverage"


    // $ANTLR start "entryRuleCoverageMetric"
    // InternalCOV.g:183:1: entryRuleCoverageMetric returns [EObject current=null] : iv_ruleCoverageMetric= ruleCoverageMetric EOF ;
    public final EObject entryRuleCoverageMetric() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCoverageMetric = null;


        try {
            // InternalCOV.g:183:55: (iv_ruleCoverageMetric= ruleCoverageMetric EOF )
            // InternalCOV.g:184:2: iv_ruleCoverageMetric= ruleCoverageMetric EOF
            {
             newCompositeNode(grammarAccess.getCoverageMetricRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCoverageMetric=ruleCoverageMetric();

            state._fsp--;

             current =iv_ruleCoverageMetric; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCoverageMetric"


    // $ANTLR start "ruleCoverageMetric"
    // InternalCOV.g:190:1: ruleCoverageMetric returns [EObject current=null] : (this_ModelElementCoverage_0= ruleModelElementCoverage | this_BranchCoverage_1= ruleBranchCoverage ) ;
    public final EObject ruleCoverageMetric() throws RecognitionException {
        EObject current = null;

        EObject this_ModelElementCoverage_0 = null;

        EObject this_BranchCoverage_1 = null;



        	enterRule();

        try {
            // InternalCOV.g:196:2: ( (this_ModelElementCoverage_0= ruleModelElementCoverage | this_BranchCoverage_1= ruleBranchCoverage ) )
            // InternalCOV.g:197:2: (this_ModelElementCoverage_0= ruleModelElementCoverage | this_BranchCoverage_1= ruleBranchCoverage )
            {
            // InternalCOV.g:197:2: (this_ModelElementCoverage_0= ruleModelElementCoverage | this_BranchCoverage_1= ruleBranchCoverage )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==17) ) {
                alt2=1;
            }
            else if ( (LA2_0==18) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalCOV.g:198:3: this_ModelElementCoverage_0= ruleModelElementCoverage
                    {

                    			newCompositeNode(grammarAccess.getCoverageMetricAccess().getModelElementCoverageParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ModelElementCoverage_0=ruleModelElementCoverage();

                    state._fsp--;


                    			current = this_ModelElementCoverage_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalCOV.g:207:3: this_BranchCoverage_1= ruleBranchCoverage
                    {

                    			newCompositeNode(grammarAccess.getCoverageMetricAccess().getBranchCoverageParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_BranchCoverage_1=ruleBranchCoverage();

                    state._fsp--;


                    			current = this_BranchCoverage_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCoverageMetric"


    // $ANTLR start "entryRuleModelElementCoverage"
    // InternalCOV.g:219:1: entryRuleModelElementCoverage returns [EObject current=null] : iv_ruleModelElementCoverage= ruleModelElementCoverage EOF ;
    public final EObject entryRuleModelElementCoverage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelElementCoverage = null;


        try {
            // InternalCOV.g:219:61: (iv_ruleModelElementCoverage= ruleModelElementCoverage EOF )
            // InternalCOV.g:220:2: iv_ruleModelElementCoverage= ruleModelElementCoverage EOF
            {
             newCompositeNode(grammarAccess.getModelElementCoverageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModelElementCoverage=ruleModelElementCoverage();

            state._fsp--;

             current =iv_ruleModelElementCoverage; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModelElementCoverage"


    // $ANTLR start "ruleModelElementCoverage"
    // InternalCOV.g:226:1: ruleModelElementCoverage returns [EObject current=null] : (otherlv_0= 'ModelElementCoverageRuleset' otherlv_1= '{' ( (lv_contexts_2_0= ruleContext ) ) (otherlv_3= ',' ( (lv_contexts_4_0= ruleContext ) ) )* otherlv_5= '}' ) ;
    public final EObject ruleModelElementCoverage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_contexts_2_0 = null;

        EObject lv_contexts_4_0 = null;



        	enterRule();

        try {
            // InternalCOV.g:232:2: ( (otherlv_0= 'ModelElementCoverageRuleset' otherlv_1= '{' ( (lv_contexts_2_0= ruleContext ) ) (otherlv_3= ',' ( (lv_contexts_4_0= ruleContext ) ) )* otherlv_5= '}' ) )
            // InternalCOV.g:233:2: (otherlv_0= 'ModelElementCoverageRuleset' otherlv_1= '{' ( (lv_contexts_2_0= ruleContext ) ) (otherlv_3= ',' ( (lv_contexts_4_0= ruleContext ) ) )* otherlv_5= '}' )
            {
            // InternalCOV.g:233:2: (otherlv_0= 'ModelElementCoverageRuleset' otherlv_1= '{' ( (lv_contexts_2_0= ruleContext ) ) (otherlv_3= ',' ( (lv_contexts_4_0= ruleContext ) ) )* otherlv_5= '}' )
            // InternalCOV.g:234:3: otherlv_0= 'ModelElementCoverageRuleset' otherlv_1= '{' ( (lv_contexts_2_0= ruleContext ) ) (otherlv_3= ',' ( (lv_contexts_4_0= ruleContext ) ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getModelElementCoverageAccess().getModelElementCoverageRulesetKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getModelElementCoverageAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalCOV.g:242:3: ( (lv_contexts_2_0= ruleContext ) )
            // InternalCOV.g:243:4: (lv_contexts_2_0= ruleContext )
            {
            // InternalCOV.g:243:4: (lv_contexts_2_0= ruleContext )
            // InternalCOV.g:244:5: lv_contexts_2_0= ruleContext
            {

            					newCompositeNode(grammarAccess.getModelElementCoverageAccess().getContextsContextParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_8);
            lv_contexts_2_0=ruleContext();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelElementCoverageRule());
            					}
            					add(
            						current,
            						"contexts",
            						lv_contexts_2_0,
            						"coverage.dsl.xtext.COV.Context");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCOV.g:261:3: (otherlv_3= ',' ( (lv_contexts_4_0= ruleContext ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==15) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalCOV.g:262:4: otherlv_3= ',' ( (lv_contexts_4_0= ruleContext ) )
            	    {
            	    otherlv_3=(Token)match(input,15,FOLLOW_9); 

            	    				newLeafNode(otherlv_3, grammarAccess.getModelElementCoverageAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalCOV.g:266:4: ( (lv_contexts_4_0= ruleContext ) )
            	    // InternalCOV.g:267:5: (lv_contexts_4_0= ruleContext )
            	    {
            	    // InternalCOV.g:267:5: (lv_contexts_4_0= ruleContext )
            	    // InternalCOV.g:268:6: lv_contexts_4_0= ruleContext
            	    {

            	    						newCompositeNode(grammarAccess.getModelElementCoverageAccess().getContextsContextParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_contexts_4_0=ruleContext();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getModelElementCoverageRule());
            	    						}
            	    						add(
            	    							current,
            	    							"contexts",
            	    							lv_contexts_4_0,
            	    							"coverage.dsl.xtext.COV.Context");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_5=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getModelElementCoverageAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModelElementCoverage"


    // $ANTLR start "entryRuleBranchCoverage"
    // InternalCOV.g:294:1: entryRuleBranchCoverage returns [EObject current=null] : iv_ruleBranchCoverage= ruleBranchCoverage EOF ;
    public final EObject entryRuleBranchCoverage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBranchCoverage = null;


        try {
            // InternalCOV.g:294:55: (iv_ruleBranchCoverage= ruleBranchCoverage EOF )
            // InternalCOV.g:295:2: iv_ruleBranchCoverage= ruleBranchCoverage EOF
            {
             newCompositeNode(grammarAccess.getBranchCoverageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBranchCoverage=ruleBranchCoverage();

            state._fsp--;

             current =iv_ruleBranchCoverage; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBranchCoverage"


    // $ANTLR start "ruleBranchCoverage"
    // InternalCOV.g:301:1: ruleBranchCoverage returns [EObject current=null] : (otherlv_0= 'BranchCoverageRuleset' otherlv_1= '{' ( ( (lv_contexts_2_0= ruleContext ) ) (otherlv_3= ',' ( (lv_contexts_4_0= ruleContext ) ) )* )? ( (lv_branchSpecifications_5_0= ruleBranchSpecification ) ) (otherlv_6= ',' ( (lv_branchSpecifications_7_0= ruleBranchSpecification ) ) )* otherlv_8= '}' ) ;
    public final EObject ruleBranchCoverage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_contexts_2_0 = null;

        EObject lv_contexts_4_0 = null;

        EObject lv_branchSpecifications_5_0 = null;

        EObject lv_branchSpecifications_7_0 = null;



        	enterRule();

        try {
            // InternalCOV.g:307:2: ( (otherlv_0= 'BranchCoverageRuleset' otherlv_1= '{' ( ( (lv_contexts_2_0= ruleContext ) ) (otherlv_3= ',' ( (lv_contexts_4_0= ruleContext ) ) )* )? ( (lv_branchSpecifications_5_0= ruleBranchSpecification ) ) (otherlv_6= ',' ( (lv_branchSpecifications_7_0= ruleBranchSpecification ) ) )* otherlv_8= '}' ) )
            // InternalCOV.g:308:2: (otherlv_0= 'BranchCoverageRuleset' otherlv_1= '{' ( ( (lv_contexts_2_0= ruleContext ) ) (otherlv_3= ',' ( (lv_contexts_4_0= ruleContext ) ) )* )? ( (lv_branchSpecifications_5_0= ruleBranchSpecification ) ) (otherlv_6= ',' ( (lv_branchSpecifications_7_0= ruleBranchSpecification ) ) )* otherlv_8= '}' )
            {
            // InternalCOV.g:308:2: (otherlv_0= 'BranchCoverageRuleset' otherlv_1= '{' ( ( (lv_contexts_2_0= ruleContext ) ) (otherlv_3= ',' ( (lv_contexts_4_0= ruleContext ) ) )* )? ( (lv_branchSpecifications_5_0= ruleBranchSpecification ) ) (otherlv_6= ',' ( (lv_branchSpecifications_7_0= ruleBranchSpecification ) ) )* otherlv_8= '}' )
            // InternalCOV.g:309:3: otherlv_0= 'BranchCoverageRuleset' otherlv_1= '{' ( ( (lv_contexts_2_0= ruleContext ) ) (otherlv_3= ',' ( (lv_contexts_4_0= ruleContext ) ) )* )? ( (lv_branchSpecifications_5_0= ruleBranchSpecification ) ) (otherlv_6= ',' ( (lv_branchSpecifications_7_0= ruleBranchSpecification ) ) )* otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getBranchCoverageAccess().getBranchCoverageRulesetKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getBranchCoverageAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalCOV.g:317:3: ( ( (lv_contexts_2_0= ruleContext ) ) (otherlv_3= ',' ( (lv_contexts_4_0= ruleContext ) ) )* )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalCOV.g:318:4: ( (lv_contexts_2_0= ruleContext ) ) (otherlv_3= ',' ( (lv_contexts_4_0= ruleContext ) ) )*
                    {
                    // InternalCOV.g:318:4: ( (lv_contexts_2_0= ruleContext ) )
                    // InternalCOV.g:319:5: (lv_contexts_2_0= ruleContext )
                    {
                    // InternalCOV.g:319:5: (lv_contexts_2_0= ruleContext )
                    // InternalCOV.g:320:6: lv_contexts_2_0= ruleContext
                    {

                    						newCompositeNode(grammarAccess.getBranchCoverageAccess().getContextsContextParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_contexts_2_0=ruleContext();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBranchCoverageRule());
                    						}
                    						add(
                    							current,
                    							"contexts",
                    							lv_contexts_2_0,
                    							"coverage.dsl.xtext.COV.Context");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCOV.g:337:4: (otherlv_3= ',' ( (lv_contexts_4_0= ruleContext ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==15) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalCOV.g:338:5: otherlv_3= ',' ( (lv_contexts_4_0= ruleContext ) )
                    	    {
                    	    otherlv_3=(Token)match(input,15,FOLLOW_9); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getBranchCoverageAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalCOV.g:342:5: ( (lv_contexts_4_0= ruleContext ) )
                    	    // InternalCOV.g:343:6: (lv_contexts_4_0= ruleContext )
                    	    {
                    	    // InternalCOV.g:343:6: (lv_contexts_4_0= ruleContext )
                    	    // InternalCOV.g:344:7: lv_contexts_4_0= ruleContext
                    	    {

                    	    							newCompositeNode(grammarAccess.getBranchCoverageAccess().getContextsContextParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_contexts_4_0=ruleContext();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getBranchCoverageRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"contexts",
                    	    								lv_contexts_4_0,
                    	    								"coverage.dsl.xtext.COV.Context");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalCOV.g:363:3: ( (lv_branchSpecifications_5_0= ruleBranchSpecification ) )
            // InternalCOV.g:364:4: (lv_branchSpecifications_5_0= ruleBranchSpecification )
            {
            // InternalCOV.g:364:4: (lv_branchSpecifications_5_0= ruleBranchSpecification )
            // InternalCOV.g:365:5: lv_branchSpecifications_5_0= ruleBranchSpecification
            {

            					newCompositeNode(grammarAccess.getBranchCoverageAccess().getBranchSpecificationsBranchSpecificationParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_8);
            lv_branchSpecifications_5_0=ruleBranchSpecification();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBranchCoverageRule());
            					}
            					add(
            						current,
            						"branchSpecifications",
            						lv_branchSpecifications_5_0,
            						"coverage.dsl.xtext.COV.BranchSpecification");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCOV.g:382:3: (otherlv_6= ',' ( (lv_branchSpecifications_7_0= ruleBranchSpecification ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==15) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalCOV.g:383:4: otherlv_6= ',' ( (lv_branchSpecifications_7_0= ruleBranchSpecification ) )
            	    {
            	    otherlv_6=(Token)match(input,15,FOLLOW_10); 

            	    				newLeafNode(otherlv_6, grammarAccess.getBranchCoverageAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalCOV.g:387:4: ( (lv_branchSpecifications_7_0= ruleBranchSpecification ) )
            	    // InternalCOV.g:388:5: (lv_branchSpecifications_7_0= ruleBranchSpecification )
            	    {
            	    // InternalCOV.g:388:5: (lv_branchSpecifications_7_0= ruleBranchSpecification )
            	    // InternalCOV.g:389:6: lv_branchSpecifications_7_0= ruleBranchSpecification
            	    {

            	    						newCompositeNode(grammarAccess.getBranchCoverageAccess().getBranchSpecificationsBranchSpecificationParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_branchSpecifications_7_0=ruleBranchSpecification();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getBranchCoverageRule());
            	    						}
            	    						add(
            	    							current,
            	    							"branchSpecifications",
            	    							lv_branchSpecifications_7_0,
            	    							"coverage.dsl.xtext.COV.BranchSpecification");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_8=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getBranchCoverageAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBranchCoverage"


    // $ANTLR start "entryRuleEString"
    // InternalCOV.g:415:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalCOV.g:415:47: (iv_ruleEString= ruleEString EOF )
            // InternalCOV.g:416:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalCOV.g:422:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalCOV.g:428:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalCOV.g:429:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalCOV.g:429:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STRING) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_ID) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalCOV.g:430:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalCOV.g:438:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleContext"
    // InternalCOV.g:449:1: entryRuleContext returns [EObject current=null] : iv_ruleContext= ruleContext EOF ;
    public final EObject entryRuleContext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContext = null;


        try {
            // InternalCOV.g:449:48: (iv_ruleContext= ruleContext EOF )
            // InternalCOV.g:450:2: iv_ruleContext= ruleContext EOF
            {
             newCompositeNode(grammarAccess.getContextRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContext=ruleContext();

            state._fsp--;

             current =iv_ruleContext; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleContext"


    // $ANTLR start "ruleContext"
    // InternalCOV.g:456:1: ruleContext returns [EObject current=null] : (otherlv_0= 'context' ( ( ruleEString ) ) otherlv_2= '{' ( ( (lv_rules_3_0= ruleRule ) ) (otherlv_4= ',' ( (lv_rules_5_0= ruleRule ) ) )* )? otherlv_6= '}' ) ;
    public final EObject ruleContext() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_rules_3_0 = null;

        EObject lv_rules_5_0 = null;



        	enterRule();

        try {
            // InternalCOV.g:462:2: ( (otherlv_0= 'context' ( ( ruleEString ) ) otherlv_2= '{' ( ( (lv_rules_3_0= ruleRule ) ) (otherlv_4= ',' ( (lv_rules_5_0= ruleRule ) ) )* )? otherlv_6= '}' ) )
            // InternalCOV.g:463:2: (otherlv_0= 'context' ( ( ruleEString ) ) otherlv_2= '{' ( ( (lv_rules_3_0= ruleRule ) ) (otherlv_4= ',' ( (lv_rules_5_0= ruleRule ) ) )* )? otherlv_6= '}' )
            {
            // InternalCOV.g:463:2: (otherlv_0= 'context' ( ( ruleEString ) ) otherlv_2= '{' ( ( (lv_rules_3_0= ruleRule ) ) (otherlv_4= ',' ( (lv_rules_5_0= ruleRule ) ) )* )? otherlv_6= '}' )
            // InternalCOV.g:464:3: otherlv_0= 'context' ( ( ruleEString ) ) otherlv_2= '{' ( ( (lv_rules_3_0= ruleRule ) ) (otherlv_4= ',' ( (lv_rules_5_0= ruleRule ) ) )* )? otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getContextAccess().getContextKeyword_0());
            		
            // InternalCOV.g:468:3: ( ( ruleEString ) )
            // InternalCOV.g:469:4: ( ruleEString )
            {
            // InternalCOV.g:469:4: ( ruleEString )
            // InternalCOV.g:470:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getContextRule());
            					}
            				

            					newCompositeNode(grammarAccess.getContextAccess().getMetaclassEClassCrossReference_1_0());
            				
            pushFollow(FOLLOW_4);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getContextAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalCOV.g:488:3: ( ( (lv_rules_3_0= ruleRule ) ) (otherlv_4= ',' ( (lv_rules_5_0= ruleRule ) ) )* )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==22||(LA9_0>=28 && LA9_0<=30)) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalCOV.g:489:4: ( (lv_rules_3_0= ruleRule ) ) (otherlv_4= ',' ( (lv_rules_5_0= ruleRule ) ) )*
                    {
                    // InternalCOV.g:489:4: ( (lv_rules_3_0= ruleRule ) )
                    // InternalCOV.g:490:5: (lv_rules_3_0= ruleRule )
                    {
                    // InternalCOV.g:490:5: (lv_rules_3_0= ruleRule )
                    // InternalCOV.g:491:6: lv_rules_3_0= ruleRule
                    {

                    						newCompositeNode(grammarAccess.getContextAccess().getRulesRuleParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_rules_3_0=ruleRule();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getContextRule());
                    						}
                    						add(
                    							current,
                    							"rules",
                    							lv_rules_3_0,
                    							"coverage.dsl.xtext.COV.Rule");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCOV.g:508:4: (otherlv_4= ',' ( (lv_rules_5_0= ruleRule ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==15) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalCOV.g:509:5: otherlv_4= ',' ( (lv_rules_5_0= ruleRule ) )
                    	    {
                    	    otherlv_4=(Token)match(input,15,FOLLOW_13); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getContextAccess().getCommaKeyword_3_1_0());
                    	    				
                    	    // InternalCOV.g:513:5: ( (lv_rules_5_0= ruleRule ) )
                    	    // InternalCOV.g:514:6: (lv_rules_5_0= ruleRule )
                    	    {
                    	    // InternalCOV.g:514:6: (lv_rules_5_0= ruleRule )
                    	    // InternalCOV.g:515:7: lv_rules_5_0= ruleRule
                    	    {

                    	    							newCompositeNode(grammarAccess.getContextAccess().getRulesRuleParserRuleCall_3_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_rules_5_0=ruleRule();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getContextRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"rules",
                    	    								lv_rules_5_0,
                    	    								"coverage.dsl.xtext.COV.Rule");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getContextAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleContext"


    // $ANTLR start "entryRuleRule"
    // InternalCOV.g:542:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // InternalCOV.g:542:45: (iv_ruleRule= ruleRule EOF )
            // InternalCOV.g:543:2: iv_ruleRule= ruleRule EOF
            {
             newCompositeNode(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRule=ruleRule();

            state._fsp--;

             current =iv_ruleRule; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // InternalCOV.g:549:1: ruleRule returns [EObject current=null] : (this_Ignore_0= ruleIgnore | this_CoverageOfReferenced_1= ruleCoverageOfReferenced | this_CoverageByContent_2= ruleCoverageByContent | this_LimitedIgnore_3= ruleLimitedIgnore ) ;
    public final EObject ruleRule() throws RecognitionException {
        EObject current = null;

        EObject this_Ignore_0 = null;

        EObject this_CoverageOfReferenced_1 = null;

        EObject this_CoverageByContent_2 = null;

        EObject this_LimitedIgnore_3 = null;



        	enterRule();

        try {
            // InternalCOV.g:555:2: ( (this_Ignore_0= ruleIgnore | this_CoverageOfReferenced_1= ruleCoverageOfReferenced | this_CoverageByContent_2= ruleCoverageByContent | this_LimitedIgnore_3= ruleLimitedIgnore ) )
            // InternalCOV.g:556:2: (this_Ignore_0= ruleIgnore | this_CoverageOfReferenced_1= ruleCoverageOfReferenced | this_CoverageByContent_2= ruleCoverageByContent | this_LimitedIgnore_3= ruleLimitedIgnore )
            {
            // InternalCOV.g:556:2: (this_Ignore_0= ruleIgnore | this_CoverageOfReferenced_1= ruleCoverageOfReferenced | this_CoverageByContent_2= ruleCoverageByContent | this_LimitedIgnore_3= ruleLimitedIgnore )
            int alt10=4;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt10=1;
                }
                break;
            case 29:
                {
                alt10=2;
                }
                break;
            case 30:
                {
                alt10=3;
                }
                break;
            case 28:
                {
                alt10=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalCOV.g:557:3: this_Ignore_0= ruleIgnore
                    {

                    			newCompositeNode(grammarAccess.getRuleAccess().getIgnoreParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Ignore_0=ruleIgnore();

                    state._fsp--;


                    			current = this_Ignore_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalCOV.g:566:3: this_CoverageOfReferenced_1= ruleCoverageOfReferenced
                    {

                    			newCompositeNode(grammarAccess.getRuleAccess().getCoverageOfReferencedParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_CoverageOfReferenced_1=ruleCoverageOfReferenced();

                    state._fsp--;


                    			current = this_CoverageOfReferenced_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalCOV.g:575:3: this_CoverageByContent_2= ruleCoverageByContent
                    {

                    			newCompositeNode(grammarAccess.getRuleAccess().getCoverageByContentParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_CoverageByContent_2=ruleCoverageByContent();

                    state._fsp--;


                    			current = this_CoverageByContent_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalCOV.g:584:3: this_LimitedIgnore_3= ruleLimitedIgnore
                    {

                    			newCompositeNode(grammarAccess.getRuleAccess().getLimitedIgnoreParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_LimitedIgnore_3=ruleLimitedIgnore();

                    state._fsp--;


                    			current = this_LimitedIgnore_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleEBoolean"
    // InternalCOV.g:596:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // InternalCOV.g:596:48: (iv_ruleEBoolean= ruleEBoolean EOF )
            // InternalCOV.g:597:2: iv_ruleEBoolean= ruleEBoolean EOF
            {
             newCompositeNode(grammarAccess.getEBooleanRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEBoolean=ruleEBoolean();

            state._fsp--;

             current =iv_ruleEBoolean.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEBoolean"


    // $ANTLR start "ruleEBoolean"
    // InternalCOV.g:603:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalCOV.g:609:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalCOV.g:610:2: (kw= 'true' | kw= 'false' )
            {
            // InternalCOV.g:610:2: (kw= 'true' | kw= 'false' )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==20) ) {
                alt11=1;
            }
            else if ( (LA11_0==21) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalCOV.g:611:3: kw= 'true'
                    {
                    kw=(Token)match(input,20,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalCOV.g:617:3: kw= 'false'
                    {
                    kw=(Token)match(input,21,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanAccess().getFalseKeyword_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEBoolean"


    // $ANTLR start "entryRuleIgnore"
    // InternalCOV.g:626:1: entryRuleIgnore returns [EObject current=null] : iv_ruleIgnore= ruleIgnore EOF ;
    public final EObject entryRuleIgnore() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIgnore = null;


        try {
            // InternalCOV.g:626:47: (iv_ruleIgnore= ruleIgnore EOF )
            // InternalCOV.g:627:2: iv_ruleIgnore= ruleIgnore EOF
            {
             newCompositeNode(grammarAccess.getIgnoreRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIgnore=ruleIgnore();

            state._fsp--;

             current =iv_ruleIgnore; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIgnore"


    // $ANTLR start "ruleIgnore"
    // InternalCOV.g:633:1: ruleIgnore returns [EObject current=null] : ( () otherlv_1= 'ignore' otherlv_2= '(' (otherlv_3= 'subtypes' ( (lv_ignoreSubtypes_4_0= ruleEBoolean ) ) )? otherlv_5= ')' (otherlv_6= 'description' ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= 'condition' ( (lv_condition_9_0= ruleCondition ) ) )? ) ;
    public final EObject ruleIgnore() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_ignoreSubtypes_4_0 = null;

        AntlrDatatypeRuleToken lv_description_7_0 = null;

        EObject lv_condition_9_0 = null;



        	enterRule();

        try {
            // InternalCOV.g:639:2: ( ( () otherlv_1= 'ignore' otherlv_2= '(' (otherlv_3= 'subtypes' ( (lv_ignoreSubtypes_4_0= ruleEBoolean ) ) )? otherlv_5= ')' (otherlv_6= 'description' ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= 'condition' ( (lv_condition_9_0= ruleCondition ) ) )? ) )
            // InternalCOV.g:640:2: ( () otherlv_1= 'ignore' otherlv_2= '(' (otherlv_3= 'subtypes' ( (lv_ignoreSubtypes_4_0= ruleEBoolean ) ) )? otherlv_5= ')' (otherlv_6= 'description' ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= 'condition' ( (lv_condition_9_0= ruleCondition ) ) )? )
            {
            // InternalCOV.g:640:2: ( () otherlv_1= 'ignore' otherlv_2= '(' (otherlv_3= 'subtypes' ( (lv_ignoreSubtypes_4_0= ruleEBoolean ) ) )? otherlv_5= ')' (otherlv_6= 'description' ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= 'condition' ( (lv_condition_9_0= ruleCondition ) ) )? )
            // InternalCOV.g:641:3: () otherlv_1= 'ignore' otherlv_2= '(' (otherlv_3= 'subtypes' ( (lv_ignoreSubtypes_4_0= ruleEBoolean ) ) )? otherlv_5= ')' (otherlv_6= 'description' ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= 'condition' ( (lv_condition_9_0= ruleCondition ) ) )?
            {
            // InternalCOV.g:641:3: ()
            // InternalCOV.g:642:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIgnoreAccess().getIgnoreAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,22,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getIgnoreAccess().getIgnoreKeyword_1());
            		
            otherlv_2=(Token)match(input,23,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getIgnoreAccess().getLeftParenthesisKeyword_2());
            		
            // InternalCOV.g:656:3: (otherlv_3= 'subtypes' ( (lv_ignoreSubtypes_4_0= ruleEBoolean ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==24) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalCOV.g:657:4: otherlv_3= 'subtypes' ( (lv_ignoreSubtypes_4_0= ruleEBoolean ) )
                    {
                    otherlv_3=(Token)match(input,24,FOLLOW_16); 

                    				newLeafNode(otherlv_3, grammarAccess.getIgnoreAccess().getSubtypesKeyword_3_0());
                    			
                    // InternalCOV.g:661:4: ( (lv_ignoreSubtypes_4_0= ruleEBoolean ) )
                    // InternalCOV.g:662:5: (lv_ignoreSubtypes_4_0= ruleEBoolean )
                    {
                    // InternalCOV.g:662:5: (lv_ignoreSubtypes_4_0= ruleEBoolean )
                    // InternalCOV.g:663:6: lv_ignoreSubtypes_4_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getIgnoreAccess().getIgnoreSubtypesEBooleanParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_ignoreSubtypes_4_0=ruleEBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIgnoreRule());
                    						}
                    						set(
                    							current,
                    							"ignoreSubtypes",
                    							lv_ignoreSubtypes_4_0,
                    							"coverage.dsl.xtext.COV.EBoolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,25,FOLLOW_18); 

            			newLeafNode(otherlv_5, grammarAccess.getIgnoreAccess().getRightParenthesisKeyword_4());
            		
            // InternalCOV.g:685:3: (otherlv_6= 'description' ( (lv_description_7_0= ruleEString ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==26) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalCOV.g:686:4: otherlv_6= 'description' ( (lv_description_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,26,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getIgnoreAccess().getDescriptionKeyword_5_0());
                    			
                    // InternalCOV.g:690:4: ( (lv_description_7_0= ruleEString ) )
                    // InternalCOV.g:691:5: (lv_description_7_0= ruleEString )
                    {
                    // InternalCOV.g:691:5: (lv_description_7_0= ruleEString )
                    // InternalCOV.g:692:6: lv_description_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getIgnoreAccess().getDescriptionEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_19);
                    lv_description_7_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIgnoreRule());
                    						}
                    						set(
                    							current,
                    							"description",
                    							lv_description_7_0,
                    							"coverage.dsl.xtext.COV.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCOV.g:710:3: (otherlv_8= 'condition' ( (lv_condition_9_0= ruleCondition ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==27) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalCOV.g:711:4: otherlv_8= 'condition' ( (lv_condition_9_0= ruleCondition ) )
                    {
                    otherlv_8=(Token)match(input,27,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getIgnoreAccess().getConditionKeyword_6_0());
                    			
                    // InternalCOV.g:715:4: ( (lv_condition_9_0= ruleCondition ) )
                    // InternalCOV.g:716:5: (lv_condition_9_0= ruleCondition )
                    {
                    // InternalCOV.g:716:5: (lv_condition_9_0= ruleCondition )
                    // InternalCOV.g:717:6: lv_condition_9_0= ruleCondition
                    {

                    						newCompositeNode(grammarAccess.getIgnoreAccess().getConditionConditionParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_condition_9_0=ruleCondition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIgnoreRule());
                    						}
                    						set(
                    							current,
                    							"condition",
                    							lv_condition_9_0,
                    							"coverage.dsl.xtext.COV.Condition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIgnore"


    // $ANTLR start "entryRuleLimitedIgnore"
    // InternalCOV.g:739:1: entryRuleLimitedIgnore returns [EObject current=null] : iv_ruleLimitedIgnore= ruleLimitedIgnore EOF ;
    public final EObject entryRuleLimitedIgnore() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLimitedIgnore = null;


        try {
            // InternalCOV.g:739:54: (iv_ruleLimitedIgnore= ruleLimitedIgnore EOF )
            // InternalCOV.g:740:2: iv_ruleLimitedIgnore= ruleLimitedIgnore EOF
            {
             newCompositeNode(grammarAccess.getLimitedIgnoreRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLimitedIgnore=ruleLimitedIgnore();

            state._fsp--;

             current =iv_ruleLimitedIgnore; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLimitedIgnore"


    // $ANTLR start "ruleLimitedIgnore"
    // InternalCOV.g:746:1: ruleLimitedIgnore returns [EObject current=null] : (otherlv_0= 'ignoreif' ( (lv_type_1_0= ruleLimitationType ) ) ( ( ruleEString ) ) (otherlv_3= ',' ( ( ruleEString ) ) )* (otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) ) )? (otherlv_7= 'condition' ( (lv_condition_8_0= ruleCondition ) ) )? ) ;
    public final EObject ruleLimitedIgnore() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Enumerator lv_type_1_0 = null;

        AntlrDatatypeRuleToken lv_description_6_0 = null;

        EObject lv_condition_8_0 = null;



        	enterRule();

        try {
            // InternalCOV.g:752:2: ( (otherlv_0= 'ignoreif' ( (lv_type_1_0= ruleLimitationType ) ) ( ( ruleEString ) ) (otherlv_3= ',' ( ( ruleEString ) ) )* (otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) ) )? (otherlv_7= 'condition' ( (lv_condition_8_0= ruleCondition ) ) )? ) )
            // InternalCOV.g:753:2: (otherlv_0= 'ignoreif' ( (lv_type_1_0= ruleLimitationType ) ) ( ( ruleEString ) ) (otherlv_3= ',' ( ( ruleEString ) ) )* (otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) ) )? (otherlv_7= 'condition' ( (lv_condition_8_0= ruleCondition ) ) )? )
            {
            // InternalCOV.g:753:2: (otherlv_0= 'ignoreif' ( (lv_type_1_0= ruleLimitationType ) ) ( ( ruleEString ) ) (otherlv_3= ',' ( ( ruleEString ) ) )* (otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) ) )? (otherlv_7= 'condition' ( (lv_condition_8_0= ruleCondition ) ) )? )
            // InternalCOV.g:754:3: otherlv_0= 'ignoreif' ( (lv_type_1_0= ruleLimitationType ) ) ( ( ruleEString ) ) (otherlv_3= ',' ( ( ruleEString ) ) )* (otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) ) )? (otherlv_7= 'condition' ( (lv_condition_8_0= ruleCondition ) ) )?
            {
            otherlv_0=(Token)match(input,28,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getLimitedIgnoreAccess().getIgnoreifKeyword_0());
            		
            // InternalCOV.g:758:3: ( (lv_type_1_0= ruleLimitationType ) )
            // InternalCOV.g:759:4: (lv_type_1_0= ruleLimitationType )
            {
            // InternalCOV.g:759:4: (lv_type_1_0= ruleLimitationType )
            // InternalCOV.g:760:5: lv_type_1_0= ruleLimitationType
            {

            					newCompositeNode(grammarAccess.getLimitedIgnoreAccess().getTypeLimitationTypeEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_type_1_0=ruleLimitationType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLimitedIgnoreRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_1_0,
            						"coverage.dsl.xtext.COV.LimitationType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCOV.g:777:3: ( ( ruleEString ) )
            // InternalCOV.g:778:4: ( ruleEString )
            {
            // InternalCOV.g:778:4: ( ruleEString )
            // InternalCOV.g:779:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLimitedIgnoreRule());
            					}
            				

            					newCompositeNode(grammarAccess.getLimitedIgnoreAccess().getContainerMetaclassEClassCrossReference_2_0());
            				
            pushFollow(FOLLOW_21);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCOV.g:793:3: (otherlv_3= ',' ( ( ruleEString ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==15) ) {
                    int LA15_2 = input.LA(2);

                    if ( ((LA15_2>=RULE_STRING && LA15_2<=RULE_ID)) ) {
                        alt15=1;
                    }


                }


                switch (alt15) {
            	case 1 :
            	    // InternalCOV.g:794:4: otherlv_3= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_3=(Token)match(input,15,FOLLOW_3); 

            	    				newLeafNode(otherlv_3, grammarAccess.getLimitedIgnoreAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalCOV.g:798:4: ( ( ruleEString ) )
            	    // InternalCOV.g:799:5: ( ruleEString )
            	    {
            	    // InternalCOV.g:799:5: ( ruleEString )
            	    // InternalCOV.g:800:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getLimitedIgnoreRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getLimitedIgnoreAccess().getContainerMetaclassEClassCrossReference_3_1_0());
            	    					
            	    pushFollow(FOLLOW_21);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            // InternalCOV.g:815:3: (otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==26) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalCOV.g:816:4: otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,26,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getLimitedIgnoreAccess().getDescriptionKeyword_4_0());
                    			
                    // InternalCOV.g:820:4: ( (lv_description_6_0= ruleEString ) )
                    // InternalCOV.g:821:5: (lv_description_6_0= ruleEString )
                    {
                    // InternalCOV.g:821:5: (lv_description_6_0= ruleEString )
                    // InternalCOV.g:822:6: lv_description_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getLimitedIgnoreAccess().getDescriptionEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_19);
                    lv_description_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLimitedIgnoreRule());
                    						}
                    						set(
                    							current,
                    							"description",
                    							lv_description_6_0,
                    							"coverage.dsl.xtext.COV.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCOV.g:840:3: (otherlv_7= 'condition' ( (lv_condition_8_0= ruleCondition ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==27) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalCOV.g:841:4: otherlv_7= 'condition' ( (lv_condition_8_0= ruleCondition ) )
                    {
                    otherlv_7=(Token)match(input,27,FOLLOW_3); 

                    				newLeafNode(otherlv_7, grammarAccess.getLimitedIgnoreAccess().getConditionKeyword_5_0());
                    			
                    // InternalCOV.g:845:4: ( (lv_condition_8_0= ruleCondition ) )
                    // InternalCOV.g:846:5: (lv_condition_8_0= ruleCondition )
                    {
                    // InternalCOV.g:846:5: (lv_condition_8_0= ruleCondition )
                    // InternalCOV.g:847:6: lv_condition_8_0= ruleCondition
                    {

                    						newCompositeNode(grammarAccess.getLimitedIgnoreAccess().getConditionConditionParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_condition_8_0=ruleCondition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLimitedIgnoreRule());
                    						}
                    						set(
                    							current,
                    							"condition",
                    							lv_condition_8_0,
                    							"coverage.dsl.xtext.COV.Condition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLimitedIgnore"


    // $ANTLR start "entryRuleCoverageOfReferenced"
    // InternalCOV.g:869:1: entryRuleCoverageOfReferenced returns [EObject current=null] : iv_ruleCoverageOfReferenced= ruleCoverageOfReferenced EOF ;
    public final EObject entryRuleCoverageOfReferenced() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCoverageOfReferenced = null;


        try {
            // InternalCOV.g:869:61: (iv_ruleCoverageOfReferenced= ruleCoverageOfReferenced EOF )
            // InternalCOV.g:870:2: iv_ruleCoverageOfReferenced= ruleCoverageOfReferenced EOF
            {
             newCompositeNode(grammarAccess.getCoverageOfReferencedRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCoverageOfReferenced=ruleCoverageOfReferenced();

            state._fsp--;

             current =iv_ruleCoverageOfReferenced; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCoverageOfReferenced"


    // $ANTLR start "ruleCoverageOfReferenced"
    // InternalCOV.g:876:1: ruleCoverageOfReferenced returns [EObject current=null] : (otherlv_0= 'covers' ( ( ruleEString ) ) (otherlv_2= ',' ( ( ruleEString ) ) )* (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? (otherlv_6= 'condition' ( (lv_condition_7_0= ruleCondition ) ) )? ) ;
    public final EObject ruleCoverageOfReferenced() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_description_5_0 = null;

        EObject lv_condition_7_0 = null;



        	enterRule();

        try {
            // InternalCOV.g:882:2: ( (otherlv_0= 'covers' ( ( ruleEString ) ) (otherlv_2= ',' ( ( ruleEString ) ) )* (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? (otherlv_6= 'condition' ( (lv_condition_7_0= ruleCondition ) ) )? ) )
            // InternalCOV.g:883:2: (otherlv_0= 'covers' ( ( ruleEString ) ) (otherlv_2= ',' ( ( ruleEString ) ) )* (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? (otherlv_6= 'condition' ( (lv_condition_7_0= ruleCondition ) ) )? )
            {
            // InternalCOV.g:883:2: (otherlv_0= 'covers' ( ( ruleEString ) ) (otherlv_2= ',' ( ( ruleEString ) ) )* (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? (otherlv_6= 'condition' ( (lv_condition_7_0= ruleCondition ) ) )? )
            // InternalCOV.g:884:3: otherlv_0= 'covers' ( ( ruleEString ) ) (otherlv_2= ',' ( ( ruleEString ) ) )* (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? (otherlv_6= 'condition' ( (lv_condition_7_0= ruleCondition ) ) )?
            {
            otherlv_0=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCoverageOfReferencedAccess().getCoversKeyword_0());
            		
            // InternalCOV.g:888:3: ( ( ruleEString ) )
            // InternalCOV.g:889:4: ( ruleEString )
            {
            // InternalCOV.g:889:4: ( ruleEString )
            // InternalCOV.g:890:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCoverageOfReferencedRule());
            					}
            				

            					newCompositeNode(grammarAccess.getCoverageOfReferencedAccess().getReferenceEReferenceCrossReference_1_0());
            				
            pushFollow(FOLLOW_21);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCOV.g:904:3: (otherlv_2= ',' ( ( ruleEString ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==15) ) {
                    int LA18_2 = input.LA(2);

                    if ( ((LA18_2>=RULE_STRING && LA18_2<=RULE_ID)) ) {
                        alt18=1;
                    }


                }


                switch (alt18) {
            	case 1 :
            	    // InternalCOV.g:905:4: otherlv_2= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_2=(Token)match(input,15,FOLLOW_3); 

            	    				newLeafNode(otherlv_2, grammarAccess.getCoverageOfReferencedAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalCOV.g:909:4: ( ( ruleEString ) )
            	    // InternalCOV.g:910:5: ( ruleEString )
            	    {
            	    // InternalCOV.g:910:5: ( ruleEString )
            	    // InternalCOV.g:911:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getCoverageOfReferencedRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getCoverageOfReferencedAccess().getReferenceEReferenceCrossReference_2_1_0());
            	    					
            	    pushFollow(FOLLOW_21);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            // InternalCOV.g:926:3: (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==26) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalCOV.g:927:4: otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,26,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getCoverageOfReferencedAccess().getDescriptionKeyword_3_0());
                    			
                    // InternalCOV.g:931:4: ( (lv_description_5_0= ruleEString ) )
                    // InternalCOV.g:932:5: (lv_description_5_0= ruleEString )
                    {
                    // InternalCOV.g:932:5: (lv_description_5_0= ruleEString )
                    // InternalCOV.g:933:6: lv_description_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getCoverageOfReferencedAccess().getDescriptionEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_19);
                    lv_description_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCoverageOfReferencedRule());
                    						}
                    						set(
                    							current,
                    							"description",
                    							lv_description_5_0,
                    							"coverage.dsl.xtext.COV.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCOV.g:951:3: (otherlv_6= 'condition' ( (lv_condition_7_0= ruleCondition ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==27) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalCOV.g:952:4: otherlv_6= 'condition' ( (lv_condition_7_0= ruleCondition ) )
                    {
                    otherlv_6=(Token)match(input,27,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getCoverageOfReferencedAccess().getConditionKeyword_4_0());
                    			
                    // InternalCOV.g:956:4: ( (lv_condition_7_0= ruleCondition ) )
                    // InternalCOV.g:957:5: (lv_condition_7_0= ruleCondition )
                    {
                    // InternalCOV.g:957:5: (lv_condition_7_0= ruleCondition )
                    // InternalCOV.g:958:6: lv_condition_7_0= ruleCondition
                    {

                    						newCompositeNode(grammarAccess.getCoverageOfReferencedAccess().getConditionConditionParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_condition_7_0=ruleCondition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCoverageOfReferencedRule());
                    						}
                    						set(
                    							current,
                    							"condition",
                    							lv_condition_7_0,
                    							"coverage.dsl.xtext.COV.Condition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCoverageOfReferenced"


    // $ANTLR start "entryRuleCoverageByContent"
    // InternalCOV.g:980:1: entryRuleCoverageByContent returns [EObject current=null] : iv_ruleCoverageByContent= ruleCoverageByContent EOF ;
    public final EObject entryRuleCoverageByContent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCoverageByContent = null;


        try {
            // InternalCOV.g:980:58: (iv_ruleCoverageByContent= ruleCoverageByContent EOF )
            // InternalCOV.g:981:2: iv_ruleCoverageByContent= ruleCoverageByContent EOF
            {
             newCompositeNode(grammarAccess.getCoverageByContentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCoverageByContent=ruleCoverageByContent();

            state._fsp--;

             current =iv_ruleCoverageByContent; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCoverageByContent"


    // $ANTLR start "ruleCoverageByContent"
    // InternalCOV.g:987:1: ruleCoverageByContent returns [EObject current=null] : (otherlv_0= 'covered' otherlv_1= 'when' ( (lv_multiplicity_2_0= ruleCoveredContents ) ) ( ( ruleEString ) ) otherlv_4= 'iscovered' (otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) ) )? (otherlv_7= 'condition' ( (lv_condition_8_0= ruleCondition ) ) )? ) ;
    public final EObject ruleCoverageByContent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Enumerator lv_multiplicity_2_0 = null;

        AntlrDatatypeRuleToken lv_description_6_0 = null;

        EObject lv_condition_8_0 = null;



        	enterRule();

        try {
            // InternalCOV.g:993:2: ( (otherlv_0= 'covered' otherlv_1= 'when' ( (lv_multiplicity_2_0= ruleCoveredContents ) ) ( ( ruleEString ) ) otherlv_4= 'iscovered' (otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) ) )? (otherlv_7= 'condition' ( (lv_condition_8_0= ruleCondition ) ) )? ) )
            // InternalCOV.g:994:2: (otherlv_0= 'covered' otherlv_1= 'when' ( (lv_multiplicity_2_0= ruleCoveredContents ) ) ( ( ruleEString ) ) otherlv_4= 'iscovered' (otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) ) )? (otherlv_7= 'condition' ( (lv_condition_8_0= ruleCondition ) ) )? )
            {
            // InternalCOV.g:994:2: (otherlv_0= 'covered' otherlv_1= 'when' ( (lv_multiplicity_2_0= ruleCoveredContents ) ) ( ( ruleEString ) ) otherlv_4= 'iscovered' (otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) ) )? (otherlv_7= 'condition' ( (lv_condition_8_0= ruleCondition ) ) )? )
            // InternalCOV.g:995:3: otherlv_0= 'covered' otherlv_1= 'when' ( (lv_multiplicity_2_0= ruleCoveredContents ) ) ( ( ruleEString ) ) otherlv_4= 'iscovered' (otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) ) )? (otherlv_7= 'condition' ( (lv_condition_8_0= ruleCondition ) ) )?
            {
            otherlv_0=(Token)match(input,30,FOLLOW_22); 

            			newLeafNode(otherlv_0, grammarAccess.getCoverageByContentAccess().getCoveredKeyword_0());
            		
            otherlv_1=(Token)match(input,31,FOLLOW_23); 

            			newLeafNode(otherlv_1, grammarAccess.getCoverageByContentAccess().getWhenKeyword_1());
            		
            // InternalCOV.g:1003:3: ( (lv_multiplicity_2_0= ruleCoveredContents ) )
            // InternalCOV.g:1004:4: (lv_multiplicity_2_0= ruleCoveredContents )
            {
            // InternalCOV.g:1004:4: (lv_multiplicity_2_0= ruleCoveredContents )
            // InternalCOV.g:1005:5: lv_multiplicity_2_0= ruleCoveredContents
            {

            					newCompositeNode(grammarAccess.getCoverageByContentAccess().getMultiplicityCoveredContentsEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_multiplicity_2_0=ruleCoveredContents();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCoverageByContentRule());
            					}
            					set(
            						current,
            						"multiplicity",
            						lv_multiplicity_2_0,
            						"coverage.dsl.xtext.COV.CoveredContents");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCOV.g:1022:3: ( ( ruleEString ) )
            // InternalCOV.g:1023:4: ( ruleEString )
            {
            // InternalCOV.g:1023:4: ( ruleEString )
            // InternalCOV.g:1024:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCoverageByContentRule());
            					}
            				

            					newCompositeNode(grammarAccess.getCoverageByContentAccess().getContainmentReferenceEReferenceCrossReference_3_0());
            				
            pushFollow(FOLLOW_24);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,32,FOLLOW_18); 

            			newLeafNode(otherlv_4, grammarAccess.getCoverageByContentAccess().getIscoveredKeyword_4());
            		
            // InternalCOV.g:1042:3: (otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==26) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalCOV.g:1043:4: otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,26,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getCoverageByContentAccess().getDescriptionKeyword_5_0());
                    			
                    // InternalCOV.g:1047:4: ( (lv_description_6_0= ruleEString ) )
                    // InternalCOV.g:1048:5: (lv_description_6_0= ruleEString )
                    {
                    // InternalCOV.g:1048:5: (lv_description_6_0= ruleEString )
                    // InternalCOV.g:1049:6: lv_description_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getCoverageByContentAccess().getDescriptionEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_19);
                    lv_description_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCoverageByContentRule());
                    						}
                    						set(
                    							current,
                    							"description",
                    							lv_description_6_0,
                    							"coverage.dsl.xtext.COV.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCOV.g:1067:3: (otherlv_7= 'condition' ( (lv_condition_8_0= ruleCondition ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==27) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalCOV.g:1068:4: otherlv_7= 'condition' ( (lv_condition_8_0= ruleCondition ) )
                    {
                    otherlv_7=(Token)match(input,27,FOLLOW_3); 

                    				newLeafNode(otherlv_7, grammarAccess.getCoverageByContentAccess().getConditionKeyword_6_0());
                    			
                    // InternalCOV.g:1072:4: ( (lv_condition_8_0= ruleCondition ) )
                    // InternalCOV.g:1073:5: (lv_condition_8_0= ruleCondition )
                    {
                    // InternalCOV.g:1073:5: (lv_condition_8_0= ruleCondition )
                    // InternalCOV.g:1074:6: lv_condition_8_0= ruleCondition
                    {

                    						newCompositeNode(grammarAccess.getCoverageByContentAccess().getConditionConditionParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_condition_8_0=ruleCondition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCoverageByContentRule());
                    						}
                    						set(
                    							current,
                    							"condition",
                    							lv_condition_8_0,
                    							"coverage.dsl.xtext.COV.Condition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCoverageByContent"


    // $ANTLR start "entryRuleBranchSpecification"
    // InternalCOV.g:1096:1: entryRuleBranchSpecification returns [EObject current=null] : iv_ruleBranchSpecification= ruleBranchSpecification EOF ;
    public final EObject entryRuleBranchSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBranchSpecification = null;


        try {
            // InternalCOV.g:1096:60: (iv_ruleBranchSpecification= ruleBranchSpecification EOF )
            // InternalCOV.g:1097:2: iv_ruleBranchSpecification= ruleBranchSpecification EOF
            {
             newCompositeNode(grammarAccess.getBranchSpecificationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBranchSpecification=ruleBranchSpecification();

            state._fsp--;

             current =iv_ruleBranchSpecification; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBranchSpecification"


    // $ANTLR start "ruleBranchSpecification"
    // InternalCOV.g:1103:1: ruleBranchSpecification returns [EObject current=null] : ( ( ( ruleEString ) ) otherlv_1= 'has' otherlv_2= 'branches' otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? (otherlv_6= 'condition' ( (lv_condition_7_0= ruleCondition ) ) )? ( (lv_branches_8_0= ruleBranch ) ) (otherlv_9= ',' ( (lv_branches_10_0= ruleBranch ) ) )* otherlv_11= '}' ) ;
    public final EObject ruleBranchSpecification() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_description_5_0 = null;

        EObject lv_condition_7_0 = null;

        EObject lv_branches_8_0 = null;

        EObject lv_branches_10_0 = null;



        	enterRule();

        try {
            // InternalCOV.g:1109:2: ( ( ( ( ruleEString ) ) otherlv_1= 'has' otherlv_2= 'branches' otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? (otherlv_6= 'condition' ( (lv_condition_7_0= ruleCondition ) ) )? ( (lv_branches_8_0= ruleBranch ) ) (otherlv_9= ',' ( (lv_branches_10_0= ruleBranch ) ) )* otherlv_11= '}' ) )
            // InternalCOV.g:1110:2: ( ( ( ruleEString ) ) otherlv_1= 'has' otherlv_2= 'branches' otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? (otherlv_6= 'condition' ( (lv_condition_7_0= ruleCondition ) ) )? ( (lv_branches_8_0= ruleBranch ) ) (otherlv_9= ',' ( (lv_branches_10_0= ruleBranch ) ) )* otherlv_11= '}' )
            {
            // InternalCOV.g:1110:2: ( ( ( ruleEString ) ) otherlv_1= 'has' otherlv_2= 'branches' otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? (otherlv_6= 'condition' ( (lv_condition_7_0= ruleCondition ) ) )? ( (lv_branches_8_0= ruleBranch ) ) (otherlv_9= ',' ( (lv_branches_10_0= ruleBranch ) ) )* otherlv_11= '}' )
            // InternalCOV.g:1111:3: ( ( ruleEString ) ) otherlv_1= 'has' otherlv_2= 'branches' otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? (otherlv_6= 'condition' ( (lv_condition_7_0= ruleCondition ) ) )? ( (lv_branches_8_0= ruleBranch ) ) (otherlv_9= ',' ( (lv_branches_10_0= ruleBranch ) ) )* otherlv_11= '}'
            {
            // InternalCOV.g:1111:3: ( ( ruleEString ) )
            // InternalCOV.g:1112:4: ( ruleEString )
            {
            // InternalCOV.g:1112:4: ( ruleEString )
            // InternalCOV.g:1113:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBranchSpecificationRule());
            					}
            				

            					newCompositeNode(grammarAccess.getBranchSpecificationAccess().getContextEClassCrossReference_0_0());
            				
            pushFollow(FOLLOW_25);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,33,FOLLOW_26); 

            			newLeafNode(otherlv_1, grammarAccess.getBranchSpecificationAccess().getHasKeyword_1());
            		
            otherlv_2=(Token)match(input,34,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getBranchSpecificationAccess().getBranchesKeyword_2());
            		
            otherlv_3=(Token)match(input,12,FOLLOW_27); 

            			newLeafNode(otherlv_3, grammarAccess.getBranchSpecificationAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalCOV.g:1139:3: (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==26) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalCOV.g:1140:4: otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,26,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getBranchSpecificationAccess().getDescriptionKeyword_4_0());
                    			
                    // InternalCOV.g:1144:4: ( (lv_description_5_0= ruleEString ) )
                    // InternalCOV.g:1145:5: (lv_description_5_0= ruleEString )
                    {
                    // InternalCOV.g:1145:5: (lv_description_5_0= ruleEString )
                    // InternalCOV.g:1146:6: lv_description_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getBranchSpecificationAccess().getDescriptionEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_description_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBranchSpecificationRule());
                    						}
                    						set(
                    							current,
                    							"description",
                    							lv_description_5_0,
                    							"coverage.dsl.xtext.COV.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCOV.g:1164:3: (otherlv_6= 'condition' ( (lv_condition_7_0= ruleCondition ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==27) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalCOV.g:1165:4: otherlv_6= 'condition' ( (lv_condition_7_0= ruleCondition ) )
                    {
                    otherlv_6=(Token)match(input,27,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getBranchSpecificationAccess().getConditionKeyword_5_0());
                    			
                    // InternalCOV.g:1169:4: ( (lv_condition_7_0= ruleCondition ) )
                    // InternalCOV.g:1170:5: (lv_condition_7_0= ruleCondition )
                    {
                    // InternalCOV.g:1170:5: (lv_condition_7_0= ruleCondition )
                    // InternalCOV.g:1171:6: lv_condition_7_0= ruleCondition
                    {

                    						newCompositeNode(grammarAccess.getBranchSpecificationAccess().getConditionConditionParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_condition_7_0=ruleCondition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBranchSpecificationRule());
                    						}
                    						set(
                    							current,
                    							"condition",
                    							lv_condition_7_0,
                    							"coverage.dsl.xtext.COV.Condition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCOV.g:1189:3: ( (lv_branches_8_0= ruleBranch ) )
            // InternalCOV.g:1190:4: (lv_branches_8_0= ruleBranch )
            {
            // InternalCOV.g:1190:4: (lv_branches_8_0= ruleBranch )
            // InternalCOV.g:1191:5: lv_branches_8_0= ruleBranch
            {

            					newCompositeNode(grammarAccess.getBranchSpecificationAccess().getBranchesBranchParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_8);
            lv_branches_8_0=ruleBranch();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBranchSpecificationRule());
            					}
            					add(
            						current,
            						"branches",
            						lv_branches_8_0,
            						"coverage.dsl.xtext.COV.Branch");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCOV.g:1208:3: (otherlv_9= ',' ( (lv_branches_10_0= ruleBranch ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==15) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalCOV.g:1209:4: otherlv_9= ',' ( (lv_branches_10_0= ruleBranch ) )
            	    {
            	    otherlv_9=(Token)match(input,15,FOLLOW_27); 

            	    				newLeafNode(otherlv_9, grammarAccess.getBranchSpecificationAccess().getCommaKeyword_7_0());
            	    			
            	    // InternalCOV.g:1213:4: ( (lv_branches_10_0= ruleBranch ) )
            	    // InternalCOV.g:1214:5: (lv_branches_10_0= ruleBranch )
            	    {
            	    // InternalCOV.g:1214:5: (lv_branches_10_0= ruleBranch )
            	    // InternalCOV.g:1215:6: lv_branches_10_0= ruleBranch
            	    {

            	    						newCompositeNode(grammarAccess.getBranchSpecificationAccess().getBranchesBranchParserRuleCall_7_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_branches_10_0=ruleBranch();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getBranchSpecificationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"branches",
            	    							lv_branches_10_0,
            	    							"coverage.dsl.xtext.COV.Branch");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            otherlv_11=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getBranchSpecificationAccess().getRightCurlyBracketKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBranchSpecification"


    // $ANTLR start "entryRuleBranch"
    // InternalCOV.g:1241:1: entryRuleBranch returns [EObject current=null] : iv_ruleBranch= ruleBranch EOF ;
    public final EObject entryRuleBranch() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBranch = null;


        try {
            // InternalCOV.g:1241:47: (iv_ruleBranch= ruleBranch EOF )
            // InternalCOV.g:1242:2: iv_ruleBranch= ruleBranch EOF
            {
             newCompositeNode(grammarAccess.getBranchRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBranch=ruleBranch();

            state._fsp--;

             current =iv_ruleBranch; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBranch"


    // $ANTLR start "ruleBranch"
    // InternalCOV.g:1248:1: ruleBranch returns [EObject current=null] : (otherlv_0= 'queryBranch' ( (lv_OCLQuery_1_0= ruleEString ) ) ) ;
    public final EObject ruleBranch() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_OCLQuery_1_0 = null;



        	enterRule();

        try {
            // InternalCOV.g:1254:2: ( (otherlv_0= 'queryBranch' ( (lv_OCLQuery_1_0= ruleEString ) ) ) )
            // InternalCOV.g:1255:2: (otherlv_0= 'queryBranch' ( (lv_OCLQuery_1_0= ruleEString ) ) )
            {
            // InternalCOV.g:1255:2: (otherlv_0= 'queryBranch' ( (lv_OCLQuery_1_0= ruleEString ) ) )
            // InternalCOV.g:1256:3: otherlv_0= 'queryBranch' ( (lv_OCLQuery_1_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,35,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getBranchAccess().getQueryBranchKeyword_0());
            		
            // InternalCOV.g:1260:3: ( (lv_OCLQuery_1_0= ruleEString ) )
            // InternalCOV.g:1261:4: (lv_OCLQuery_1_0= ruleEString )
            {
            // InternalCOV.g:1261:4: (lv_OCLQuery_1_0= ruleEString )
            // InternalCOV.g:1262:5: lv_OCLQuery_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getBranchAccess().getOCLQueryEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_OCLQuery_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBranchRule());
            					}
            					set(
            						current,
            						"OCLQuery",
            						lv_OCLQuery_1_0,
            						"coverage.dsl.xtext.COV.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBranch"


    // $ANTLR start "entryRuleCondition"
    // InternalCOV.g:1283:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalCOV.g:1283:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalCOV.g:1284:2: iv_ruleCondition= ruleCondition EOF
            {
             newCompositeNode(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCondition=ruleCondition();

            state._fsp--;

             current =iv_ruleCondition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // InternalCOV.g:1290:1: ruleCondition returns [EObject current=null] : ( (lv_OCLConstraint_0_0= ruleEString ) ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_OCLConstraint_0_0 = null;



        	enterRule();

        try {
            // InternalCOV.g:1296:2: ( ( (lv_OCLConstraint_0_0= ruleEString ) ) )
            // InternalCOV.g:1297:2: ( (lv_OCLConstraint_0_0= ruleEString ) )
            {
            // InternalCOV.g:1297:2: ( (lv_OCLConstraint_0_0= ruleEString ) )
            // InternalCOV.g:1298:3: (lv_OCLConstraint_0_0= ruleEString )
            {
            // InternalCOV.g:1298:3: (lv_OCLConstraint_0_0= ruleEString )
            // InternalCOV.g:1299:4: lv_OCLConstraint_0_0= ruleEString
            {

            				newCompositeNode(grammarAccess.getConditionAccess().getOCLConstraintEStringParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_OCLConstraint_0_0=ruleEString();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getConditionRule());
            				}
            				set(
            					current,
            					"OCLConstraint",
            					lv_OCLConstraint_0_0,
            					"coverage.dsl.xtext.COV.EString");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCondition"


    // $ANTLR start "ruleCoveredContents"
    // InternalCOV.g:1319:1: ruleCoveredContents returns [Enumerator current=null] : ( (enumLiteral_0= 'ALL' ) | (enumLiteral_1= 'ONE' ) ) ;
    public final Enumerator ruleCoveredContents() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalCOV.g:1325:2: ( ( (enumLiteral_0= 'ALL' ) | (enumLiteral_1= 'ONE' ) ) )
            // InternalCOV.g:1326:2: ( (enumLiteral_0= 'ALL' ) | (enumLiteral_1= 'ONE' ) )
            {
            // InternalCOV.g:1326:2: ( (enumLiteral_0= 'ALL' ) | (enumLiteral_1= 'ONE' ) )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==36) ) {
                alt26=1;
            }
            else if ( (LA26_0==37) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalCOV.g:1327:3: (enumLiteral_0= 'ALL' )
                    {
                    // InternalCOV.g:1327:3: (enumLiteral_0= 'ALL' )
                    // InternalCOV.g:1328:4: enumLiteral_0= 'ALL'
                    {
                    enumLiteral_0=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getCoveredContentsAccess().getALLEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getCoveredContentsAccess().getALLEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalCOV.g:1335:3: (enumLiteral_1= 'ONE' )
                    {
                    // InternalCOV.g:1335:3: (enumLiteral_1= 'ONE' )
                    // InternalCOV.g:1336:4: enumLiteral_1= 'ONE'
                    {
                    enumLiteral_1=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getCoveredContentsAccess().getONEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getCoveredContentsAccess().getONEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCoveredContents"


    // $ANTLR start "ruleLimitationType"
    // InternalCOV.g:1346:1: ruleLimitationType returns [Enumerator current=null] : ( (enumLiteral_0= 'containedBy' ) | (enumLiteral_1= 'notContainedBy' ) ) ;
    public final Enumerator ruleLimitationType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalCOV.g:1352:2: ( ( (enumLiteral_0= 'containedBy' ) | (enumLiteral_1= 'notContainedBy' ) ) )
            // InternalCOV.g:1353:2: ( (enumLiteral_0= 'containedBy' ) | (enumLiteral_1= 'notContainedBy' ) )
            {
            // InternalCOV.g:1353:2: ( (enumLiteral_0= 'containedBy' ) | (enumLiteral_1= 'notContainedBy' ) )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==38) ) {
                alt27=1;
            }
            else if ( (LA27_0==39) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // InternalCOV.g:1354:3: (enumLiteral_0= 'containedBy' )
                    {
                    // InternalCOV.g:1354:3: (enumLiteral_0= 'containedBy' )
                    // InternalCOV.g:1355:4: enumLiteral_0= 'containedBy'
                    {
                    enumLiteral_0=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getLimitationTypeAccess().getContainedByEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getLimitationTypeAccess().getContainedByEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalCOV.g:1362:3: (enumLiteral_1= 'notContainedBy' )
                    {
                    // InternalCOV.g:1362:3: (enumLiteral_1= 'notContainedBy' )
                    // InternalCOV.g:1363:4: enumLiteral_1= 'notContainedBy'
                    {
                    enumLiteral_1=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getLimitationTypeAccess().getNotContainedByEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getLimitationTypeAccess().getNotContainedByEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLimitationType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080030L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000088030L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000070410000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000070400000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000000000C000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000000C000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000000000C008002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000003000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x000000080C000000L});

}