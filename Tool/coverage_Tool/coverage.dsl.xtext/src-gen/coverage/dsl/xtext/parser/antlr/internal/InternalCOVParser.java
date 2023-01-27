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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'ruleset'", "'{'", "'import'", "'metamodel'", "','", "'}'", "'context'", "'true'", "'false'", "'ignore'", "'('", "'subtypes'", "')'", "'description'", "'condition'", "'ignoreif'", "'covers'", "'covered'", "'when'", "'iscovered'", "'has'", "'branches'", "'queryBranch'", "'ALL'", "'ONE'", "'containedBy'", "'notContainedBy'"
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
    // InternalCOV.g:72:1: ruleDomainSpecificCoverage returns [EObject current=null] : (otherlv_0= 'ruleset' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'import' otherlv_4= 'metamodel' ( ( ruleEString ) ) ( (lv_contexts_6_0= ruleContext ) ) (otherlv_7= ',' ( (lv_contexts_8_0= ruleContext ) ) )* otherlv_9= '}' ) ;
    public final EObject ruleDomainSpecificCoverage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_contexts_6_0 = null;

        EObject lv_contexts_8_0 = null;



        	enterRule();

        try {
            // InternalCOV.g:78:2: ( (otherlv_0= 'ruleset' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'import' otherlv_4= 'metamodel' ( ( ruleEString ) ) ( (lv_contexts_6_0= ruleContext ) ) (otherlv_7= ',' ( (lv_contexts_8_0= ruleContext ) ) )* otherlv_9= '}' ) )
            // InternalCOV.g:79:2: (otherlv_0= 'ruleset' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'import' otherlv_4= 'metamodel' ( ( ruleEString ) ) ( (lv_contexts_6_0= ruleContext ) ) (otherlv_7= ',' ( (lv_contexts_8_0= ruleContext ) ) )* otherlv_9= '}' )
            {
            // InternalCOV.g:79:2: (otherlv_0= 'ruleset' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'import' otherlv_4= 'metamodel' ( ( ruleEString ) ) ( (lv_contexts_6_0= ruleContext ) ) (otherlv_7= ',' ( (lv_contexts_8_0= ruleContext ) ) )* otherlv_9= '}' )
            // InternalCOV.g:80:3: otherlv_0= 'ruleset' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'import' otherlv_4= 'metamodel' ( ( ruleEString ) ) ( (lv_contexts_6_0= ruleContext ) ) (otherlv_7= ',' ( (lv_contexts_8_0= ruleContext ) ) )* otherlv_9= '}'
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

            // InternalCOV.g:131:3: ( (lv_contexts_6_0= ruleContext ) )
            // InternalCOV.g:132:4: (lv_contexts_6_0= ruleContext )
            {
            // InternalCOV.g:132:4: (lv_contexts_6_0= ruleContext )
            // InternalCOV.g:133:5: lv_contexts_6_0= ruleContext
            {

            					newCompositeNode(grammarAccess.getDomainSpecificCoverageAccess().getContextsContextParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_8);
            lv_contexts_6_0=ruleContext();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDomainSpecificCoverageRule());
            					}
            					add(
            						current,
            						"contexts",
            						lv_contexts_6_0,
            						"coverage.dsl.xtext.COV.Context");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCOV.g:150:3: (otherlv_7= ',' ( (lv_contexts_8_0= ruleContext ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalCOV.g:151:4: otherlv_7= ',' ( (lv_contexts_8_0= ruleContext ) )
            	    {
            	    otherlv_7=(Token)match(input,15,FOLLOW_7); 

            	    				newLeafNode(otherlv_7, grammarAccess.getDomainSpecificCoverageAccess().getCommaKeyword_7_0());
            	    			
            	    // InternalCOV.g:155:4: ( (lv_contexts_8_0= ruleContext ) )
            	    // InternalCOV.g:156:5: (lv_contexts_8_0= ruleContext )
            	    {
            	    // InternalCOV.g:156:5: (lv_contexts_8_0= ruleContext )
            	    // InternalCOV.g:157:6: lv_contexts_8_0= ruleContext
            	    {

            	    						newCompositeNode(grammarAccess.getDomainSpecificCoverageAccess().getContextsContextParserRuleCall_7_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_contexts_8_0=ruleContext();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getDomainSpecificCoverageRule());
            	    						}
            	    						add(
            	    							current,
            	    							"contexts",
            	    							lv_contexts_8_0,
            	    							"coverage.dsl.xtext.COV.Context");
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


    // $ANTLR start "entryRuleEString"
    // InternalCOV.g:183:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalCOV.g:183:47: (iv_ruleEString= ruleEString EOF )
            // InternalCOV.g:184:2: iv_ruleEString= ruleEString EOF
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
    // InternalCOV.g:190:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalCOV.g:196:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalCOV.g:197:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalCOV.g:197:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
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
                    // InternalCOV.g:198:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalCOV.g:206:3: this_ID_1= RULE_ID
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
    // InternalCOV.g:217:1: entryRuleContext returns [EObject current=null] : iv_ruleContext= ruleContext EOF ;
    public final EObject entryRuleContext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContext = null;


        try {
            // InternalCOV.g:217:48: (iv_ruleContext= ruleContext EOF )
            // InternalCOV.g:218:2: iv_ruleContext= ruleContext EOF
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
    // InternalCOV.g:224:1: ruleContext returns [EObject current=null] : (otherlv_0= 'context' ( ( ruleEString ) ) otherlv_2= '{' ( ( (lv_rules_3_0= ruleRule ) ) (otherlv_4= ',' ( (lv_rules_5_0= ruleRule ) ) )* )? otherlv_6= '}' ) ;
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
            // InternalCOV.g:230:2: ( (otherlv_0= 'context' ( ( ruleEString ) ) otherlv_2= '{' ( ( (lv_rules_3_0= ruleRule ) ) (otherlv_4= ',' ( (lv_rules_5_0= ruleRule ) ) )* )? otherlv_6= '}' ) )
            // InternalCOV.g:231:2: (otherlv_0= 'context' ( ( ruleEString ) ) otherlv_2= '{' ( ( (lv_rules_3_0= ruleRule ) ) (otherlv_4= ',' ( (lv_rules_5_0= ruleRule ) ) )* )? otherlv_6= '}' )
            {
            // InternalCOV.g:231:2: (otherlv_0= 'context' ( ( ruleEString ) ) otherlv_2= '{' ( ( (lv_rules_3_0= ruleRule ) ) (otherlv_4= ',' ( (lv_rules_5_0= ruleRule ) ) )* )? otherlv_6= '}' )
            // InternalCOV.g:232:3: otherlv_0= 'context' ( ( ruleEString ) ) otherlv_2= '{' ( ( (lv_rules_3_0= ruleRule ) ) (otherlv_4= ',' ( (lv_rules_5_0= ruleRule ) ) )* )? otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getContextAccess().getContextKeyword_0());
            		
            // InternalCOV.g:236:3: ( ( ruleEString ) )
            // InternalCOV.g:237:4: ( ruleEString )
            {
            // InternalCOV.g:237:4: ( ruleEString )
            // InternalCOV.g:238:5: ruleEString
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

            otherlv_2=(Token)match(input,12,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getContextAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalCOV.g:256:3: ( ( (lv_rules_3_0= ruleRule ) ) (otherlv_4= ',' ( (lv_rules_5_0= ruleRule ) ) )* )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==20||(LA4_0>=26 && LA4_0<=28)||LA4_0==31) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalCOV.g:257:4: ( (lv_rules_3_0= ruleRule ) ) (otherlv_4= ',' ( (lv_rules_5_0= ruleRule ) ) )*
                    {
                    // InternalCOV.g:257:4: ( (lv_rules_3_0= ruleRule ) )
                    // InternalCOV.g:258:5: (lv_rules_3_0= ruleRule )
                    {
                    // InternalCOV.g:258:5: (lv_rules_3_0= ruleRule )
                    // InternalCOV.g:259:6: lv_rules_3_0= ruleRule
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

                    // InternalCOV.g:276:4: (otherlv_4= ',' ( (lv_rules_5_0= ruleRule ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==15) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalCOV.g:277:5: otherlv_4= ',' ( (lv_rules_5_0= ruleRule ) )
                    	    {
                    	    otherlv_4=(Token)match(input,15,FOLLOW_10); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getContextAccess().getCommaKeyword_3_1_0());
                    	    				
                    	    // InternalCOV.g:281:5: ( (lv_rules_5_0= ruleRule ) )
                    	    // InternalCOV.g:282:6: (lv_rules_5_0= ruleRule )
                    	    {
                    	    // InternalCOV.g:282:6: (lv_rules_5_0= ruleRule )
                    	    // InternalCOV.g:283:7: lv_rules_5_0= ruleRule
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
                    	    break loop3;
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
    // InternalCOV.g:310:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // InternalCOV.g:310:45: (iv_ruleRule= ruleRule EOF )
            // InternalCOV.g:311:2: iv_ruleRule= ruleRule EOF
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
    // InternalCOV.g:317:1: ruleRule returns [EObject current=null] : (this_Ignore_0= ruleIgnore | this_CoverageOfReferenced_1= ruleCoverageOfReferenced | this_CoverageByContent_2= ruleCoverageByContent | this_LimitedIgnore_3= ruleLimitedIgnore | this_BranchSpecification_4= ruleBranchSpecification ) ;
    public final EObject ruleRule() throws RecognitionException {
        EObject current = null;

        EObject this_Ignore_0 = null;

        EObject this_CoverageOfReferenced_1 = null;

        EObject this_CoverageByContent_2 = null;

        EObject this_LimitedIgnore_3 = null;

        EObject this_BranchSpecification_4 = null;



        	enterRule();

        try {
            // InternalCOV.g:323:2: ( (this_Ignore_0= ruleIgnore | this_CoverageOfReferenced_1= ruleCoverageOfReferenced | this_CoverageByContent_2= ruleCoverageByContent | this_LimitedIgnore_3= ruleLimitedIgnore | this_BranchSpecification_4= ruleBranchSpecification ) )
            // InternalCOV.g:324:2: (this_Ignore_0= ruleIgnore | this_CoverageOfReferenced_1= ruleCoverageOfReferenced | this_CoverageByContent_2= ruleCoverageByContent | this_LimitedIgnore_3= ruleLimitedIgnore | this_BranchSpecification_4= ruleBranchSpecification )
            {
            // InternalCOV.g:324:2: (this_Ignore_0= ruleIgnore | this_CoverageOfReferenced_1= ruleCoverageOfReferenced | this_CoverageByContent_2= ruleCoverageByContent | this_LimitedIgnore_3= ruleLimitedIgnore | this_BranchSpecification_4= ruleBranchSpecification )
            int alt5=5;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt5=1;
                }
                break;
            case 27:
                {
                alt5=2;
                }
                break;
            case 28:
                {
                alt5=3;
                }
                break;
            case 26:
                {
                alt5=4;
                }
                break;
            case 31:
                {
                alt5=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalCOV.g:325:3: this_Ignore_0= ruleIgnore
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
                    // InternalCOV.g:334:3: this_CoverageOfReferenced_1= ruleCoverageOfReferenced
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
                    // InternalCOV.g:343:3: this_CoverageByContent_2= ruleCoverageByContent
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
                    // InternalCOV.g:352:3: this_LimitedIgnore_3= ruleLimitedIgnore
                    {

                    			newCompositeNode(grammarAccess.getRuleAccess().getLimitedIgnoreParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_LimitedIgnore_3=ruleLimitedIgnore();

                    state._fsp--;


                    			current = this_LimitedIgnore_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalCOV.g:361:3: this_BranchSpecification_4= ruleBranchSpecification
                    {

                    			newCompositeNode(grammarAccess.getRuleAccess().getBranchSpecificationParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_BranchSpecification_4=ruleBranchSpecification();

                    state._fsp--;


                    			current = this_BranchSpecification_4;
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
    // InternalCOV.g:373:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // InternalCOV.g:373:48: (iv_ruleEBoolean= ruleEBoolean EOF )
            // InternalCOV.g:374:2: iv_ruleEBoolean= ruleEBoolean EOF
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
    // InternalCOV.g:380:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalCOV.g:386:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalCOV.g:387:2: (kw= 'true' | kw= 'false' )
            {
            // InternalCOV.g:387:2: (kw= 'true' | kw= 'false' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            else if ( (LA6_0==19) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalCOV.g:388:3: kw= 'true'
                    {
                    kw=(Token)match(input,18,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalCOV.g:394:3: kw= 'false'
                    {
                    kw=(Token)match(input,19,FOLLOW_2); 

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
    // InternalCOV.g:403:1: entryRuleIgnore returns [EObject current=null] : iv_ruleIgnore= ruleIgnore EOF ;
    public final EObject entryRuleIgnore() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIgnore = null;


        try {
            // InternalCOV.g:403:47: (iv_ruleIgnore= ruleIgnore EOF )
            // InternalCOV.g:404:2: iv_ruleIgnore= ruleIgnore EOF
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
    // InternalCOV.g:410:1: ruleIgnore returns [EObject current=null] : ( () otherlv_1= 'ignore' otherlv_2= '(' (otherlv_3= 'subtypes' ( (lv_ignoreSubtypes_4_0= ruleEBoolean ) ) )? otherlv_5= ')' (otherlv_6= 'description' ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= 'condition' ( (lv_condition_9_0= ruleCondition ) ) )? ) ;
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
            // InternalCOV.g:416:2: ( ( () otherlv_1= 'ignore' otherlv_2= '(' (otherlv_3= 'subtypes' ( (lv_ignoreSubtypes_4_0= ruleEBoolean ) ) )? otherlv_5= ')' (otherlv_6= 'description' ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= 'condition' ( (lv_condition_9_0= ruleCondition ) ) )? ) )
            // InternalCOV.g:417:2: ( () otherlv_1= 'ignore' otherlv_2= '(' (otherlv_3= 'subtypes' ( (lv_ignoreSubtypes_4_0= ruleEBoolean ) ) )? otherlv_5= ')' (otherlv_6= 'description' ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= 'condition' ( (lv_condition_9_0= ruleCondition ) ) )? )
            {
            // InternalCOV.g:417:2: ( () otherlv_1= 'ignore' otherlv_2= '(' (otherlv_3= 'subtypes' ( (lv_ignoreSubtypes_4_0= ruleEBoolean ) ) )? otherlv_5= ')' (otherlv_6= 'description' ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= 'condition' ( (lv_condition_9_0= ruleCondition ) ) )? )
            // InternalCOV.g:418:3: () otherlv_1= 'ignore' otherlv_2= '(' (otherlv_3= 'subtypes' ( (lv_ignoreSubtypes_4_0= ruleEBoolean ) ) )? otherlv_5= ')' (otherlv_6= 'description' ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= 'condition' ( (lv_condition_9_0= ruleCondition ) ) )?
            {
            // InternalCOV.g:418:3: ()
            // InternalCOV.g:419:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIgnoreAccess().getIgnoreAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,20,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getIgnoreAccess().getIgnoreKeyword_1());
            		
            otherlv_2=(Token)match(input,21,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getIgnoreAccess().getLeftParenthesisKeyword_2());
            		
            // InternalCOV.g:433:3: (otherlv_3= 'subtypes' ( (lv_ignoreSubtypes_4_0= ruleEBoolean ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==22) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalCOV.g:434:4: otherlv_3= 'subtypes' ( (lv_ignoreSubtypes_4_0= ruleEBoolean ) )
                    {
                    otherlv_3=(Token)match(input,22,FOLLOW_13); 

                    				newLeafNode(otherlv_3, grammarAccess.getIgnoreAccess().getSubtypesKeyword_3_0());
                    			
                    // InternalCOV.g:438:4: ( (lv_ignoreSubtypes_4_0= ruleEBoolean ) )
                    // InternalCOV.g:439:5: (lv_ignoreSubtypes_4_0= ruleEBoolean )
                    {
                    // InternalCOV.g:439:5: (lv_ignoreSubtypes_4_0= ruleEBoolean )
                    // InternalCOV.g:440:6: lv_ignoreSubtypes_4_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getIgnoreAccess().getIgnoreSubtypesEBooleanParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_14);
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

            otherlv_5=(Token)match(input,23,FOLLOW_15); 

            			newLeafNode(otherlv_5, grammarAccess.getIgnoreAccess().getRightParenthesisKeyword_4());
            		
            // InternalCOV.g:462:3: (otherlv_6= 'description' ( (lv_description_7_0= ruleEString ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==24) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalCOV.g:463:4: otherlv_6= 'description' ( (lv_description_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,24,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getIgnoreAccess().getDescriptionKeyword_5_0());
                    			
                    // InternalCOV.g:467:4: ( (lv_description_7_0= ruleEString ) )
                    // InternalCOV.g:468:5: (lv_description_7_0= ruleEString )
                    {
                    // InternalCOV.g:468:5: (lv_description_7_0= ruleEString )
                    // InternalCOV.g:469:6: lv_description_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getIgnoreAccess().getDescriptionEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_16);
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

            // InternalCOV.g:487:3: (otherlv_8= 'condition' ( (lv_condition_9_0= ruleCondition ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==25) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalCOV.g:488:4: otherlv_8= 'condition' ( (lv_condition_9_0= ruleCondition ) )
                    {
                    otherlv_8=(Token)match(input,25,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getIgnoreAccess().getConditionKeyword_6_0());
                    			
                    // InternalCOV.g:492:4: ( (lv_condition_9_0= ruleCondition ) )
                    // InternalCOV.g:493:5: (lv_condition_9_0= ruleCondition )
                    {
                    // InternalCOV.g:493:5: (lv_condition_9_0= ruleCondition )
                    // InternalCOV.g:494:6: lv_condition_9_0= ruleCondition
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
    // InternalCOV.g:516:1: entryRuleLimitedIgnore returns [EObject current=null] : iv_ruleLimitedIgnore= ruleLimitedIgnore EOF ;
    public final EObject entryRuleLimitedIgnore() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLimitedIgnore = null;


        try {
            // InternalCOV.g:516:54: (iv_ruleLimitedIgnore= ruleLimitedIgnore EOF )
            // InternalCOV.g:517:2: iv_ruleLimitedIgnore= ruleLimitedIgnore EOF
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
    // InternalCOV.g:523:1: ruleLimitedIgnore returns [EObject current=null] : (otherlv_0= 'ignoreif' ( (lv_type_1_0= ruleLimitationType ) ) ( ( ruleEString ) ) (otherlv_3= ',' ( ( ruleEString ) ) )* (otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) ) )? (otherlv_7= 'condition' ( (lv_condition_8_0= ruleCondition ) ) )? ) ;
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
            // InternalCOV.g:529:2: ( (otherlv_0= 'ignoreif' ( (lv_type_1_0= ruleLimitationType ) ) ( ( ruleEString ) ) (otherlv_3= ',' ( ( ruleEString ) ) )* (otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) ) )? (otherlv_7= 'condition' ( (lv_condition_8_0= ruleCondition ) ) )? ) )
            // InternalCOV.g:530:2: (otherlv_0= 'ignoreif' ( (lv_type_1_0= ruleLimitationType ) ) ( ( ruleEString ) ) (otherlv_3= ',' ( ( ruleEString ) ) )* (otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) ) )? (otherlv_7= 'condition' ( (lv_condition_8_0= ruleCondition ) ) )? )
            {
            // InternalCOV.g:530:2: (otherlv_0= 'ignoreif' ( (lv_type_1_0= ruleLimitationType ) ) ( ( ruleEString ) ) (otherlv_3= ',' ( ( ruleEString ) ) )* (otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) ) )? (otherlv_7= 'condition' ( (lv_condition_8_0= ruleCondition ) ) )? )
            // InternalCOV.g:531:3: otherlv_0= 'ignoreif' ( (lv_type_1_0= ruleLimitationType ) ) ( ( ruleEString ) ) (otherlv_3= ',' ( ( ruleEString ) ) )* (otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) ) )? (otherlv_7= 'condition' ( (lv_condition_8_0= ruleCondition ) ) )?
            {
            otherlv_0=(Token)match(input,26,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getLimitedIgnoreAccess().getIgnoreifKeyword_0());
            		
            // InternalCOV.g:535:3: ( (lv_type_1_0= ruleLimitationType ) )
            // InternalCOV.g:536:4: (lv_type_1_0= ruleLimitationType )
            {
            // InternalCOV.g:536:4: (lv_type_1_0= ruleLimitationType )
            // InternalCOV.g:537:5: lv_type_1_0= ruleLimitationType
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

            // InternalCOV.g:554:3: ( ( ruleEString ) )
            // InternalCOV.g:555:4: ( ruleEString )
            {
            // InternalCOV.g:555:4: ( ruleEString )
            // InternalCOV.g:556:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLimitedIgnoreRule());
            					}
            				

            					newCompositeNode(grammarAccess.getLimitedIgnoreAccess().getContainerMetaclassEClassCrossReference_2_0());
            				
            pushFollow(FOLLOW_18);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCOV.g:570:3: (otherlv_3= ',' ( ( ruleEString ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==15) ) {
                    int LA10_2 = input.LA(2);

                    if ( ((LA10_2>=RULE_STRING && LA10_2<=RULE_ID)) ) {
                        alt10=1;
                    }


                }


                switch (alt10) {
            	case 1 :
            	    // InternalCOV.g:571:4: otherlv_3= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_3=(Token)match(input,15,FOLLOW_3); 

            	    				newLeafNode(otherlv_3, grammarAccess.getLimitedIgnoreAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalCOV.g:575:4: ( ( ruleEString ) )
            	    // InternalCOV.g:576:5: ( ruleEString )
            	    {
            	    // InternalCOV.g:576:5: ( ruleEString )
            	    // InternalCOV.g:577:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getLimitedIgnoreRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getLimitedIgnoreAccess().getContainerMetaclassEClassCrossReference_3_1_0());
            	    					
            	    pushFollow(FOLLOW_18);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // InternalCOV.g:592:3: (otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==24) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalCOV.g:593:4: otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,24,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getLimitedIgnoreAccess().getDescriptionKeyword_4_0());
                    			
                    // InternalCOV.g:597:4: ( (lv_description_6_0= ruleEString ) )
                    // InternalCOV.g:598:5: (lv_description_6_0= ruleEString )
                    {
                    // InternalCOV.g:598:5: (lv_description_6_0= ruleEString )
                    // InternalCOV.g:599:6: lv_description_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getLimitedIgnoreAccess().getDescriptionEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_16);
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

            // InternalCOV.g:617:3: (otherlv_7= 'condition' ( (lv_condition_8_0= ruleCondition ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==25) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalCOV.g:618:4: otherlv_7= 'condition' ( (lv_condition_8_0= ruleCondition ) )
                    {
                    otherlv_7=(Token)match(input,25,FOLLOW_3); 

                    				newLeafNode(otherlv_7, grammarAccess.getLimitedIgnoreAccess().getConditionKeyword_5_0());
                    			
                    // InternalCOV.g:622:4: ( (lv_condition_8_0= ruleCondition ) )
                    // InternalCOV.g:623:5: (lv_condition_8_0= ruleCondition )
                    {
                    // InternalCOV.g:623:5: (lv_condition_8_0= ruleCondition )
                    // InternalCOV.g:624:6: lv_condition_8_0= ruleCondition
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
    // InternalCOV.g:646:1: entryRuleCoverageOfReferenced returns [EObject current=null] : iv_ruleCoverageOfReferenced= ruleCoverageOfReferenced EOF ;
    public final EObject entryRuleCoverageOfReferenced() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCoverageOfReferenced = null;


        try {
            // InternalCOV.g:646:61: (iv_ruleCoverageOfReferenced= ruleCoverageOfReferenced EOF )
            // InternalCOV.g:647:2: iv_ruleCoverageOfReferenced= ruleCoverageOfReferenced EOF
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
    // InternalCOV.g:653:1: ruleCoverageOfReferenced returns [EObject current=null] : (otherlv_0= 'covers' ( ( ruleEString ) ) (otherlv_2= ',' ( ( ruleEString ) ) )* (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? (otherlv_6= 'condition' ( (lv_condition_7_0= ruleCondition ) ) )? ) ;
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
            // InternalCOV.g:659:2: ( (otherlv_0= 'covers' ( ( ruleEString ) ) (otherlv_2= ',' ( ( ruleEString ) ) )* (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? (otherlv_6= 'condition' ( (lv_condition_7_0= ruleCondition ) ) )? ) )
            // InternalCOV.g:660:2: (otherlv_0= 'covers' ( ( ruleEString ) ) (otherlv_2= ',' ( ( ruleEString ) ) )* (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? (otherlv_6= 'condition' ( (lv_condition_7_0= ruleCondition ) ) )? )
            {
            // InternalCOV.g:660:2: (otherlv_0= 'covers' ( ( ruleEString ) ) (otherlv_2= ',' ( ( ruleEString ) ) )* (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? (otherlv_6= 'condition' ( (lv_condition_7_0= ruleCondition ) ) )? )
            // InternalCOV.g:661:3: otherlv_0= 'covers' ( ( ruleEString ) ) (otherlv_2= ',' ( ( ruleEString ) ) )* (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? (otherlv_6= 'condition' ( (lv_condition_7_0= ruleCondition ) ) )?
            {
            otherlv_0=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCoverageOfReferencedAccess().getCoversKeyword_0());
            		
            // InternalCOV.g:665:3: ( ( ruleEString ) )
            // InternalCOV.g:666:4: ( ruleEString )
            {
            // InternalCOV.g:666:4: ( ruleEString )
            // InternalCOV.g:667:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCoverageOfReferencedRule());
            					}
            				

            					newCompositeNode(grammarAccess.getCoverageOfReferencedAccess().getReferenceEReferenceCrossReference_1_0());
            				
            pushFollow(FOLLOW_18);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCOV.g:681:3: (otherlv_2= ',' ( ( ruleEString ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==15) ) {
                    int LA13_2 = input.LA(2);

                    if ( ((LA13_2>=RULE_STRING && LA13_2<=RULE_ID)) ) {
                        alt13=1;
                    }


                }


                switch (alt13) {
            	case 1 :
            	    // InternalCOV.g:682:4: otherlv_2= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_2=(Token)match(input,15,FOLLOW_3); 

            	    				newLeafNode(otherlv_2, grammarAccess.getCoverageOfReferencedAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalCOV.g:686:4: ( ( ruleEString ) )
            	    // InternalCOV.g:687:5: ( ruleEString )
            	    {
            	    // InternalCOV.g:687:5: ( ruleEString )
            	    // InternalCOV.g:688:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getCoverageOfReferencedRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getCoverageOfReferencedAccess().getReferenceEReferenceCrossReference_2_1_0());
            	    					
            	    pushFollow(FOLLOW_18);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            // InternalCOV.g:703:3: (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==24) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalCOV.g:704:4: otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,24,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getCoverageOfReferencedAccess().getDescriptionKeyword_3_0());
                    			
                    // InternalCOV.g:708:4: ( (lv_description_5_0= ruleEString ) )
                    // InternalCOV.g:709:5: (lv_description_5_0= ruleEString )
                    {
                    // InternalCOV.g:709:5: (lv_description_5_0= ruleEString )
                    // InternalCOV.g:710:6: lv_description_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getCoverageOfReferencedAccess().getDescriptionEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_16);
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

            // InternalCOV.g:728:3: (otherlv_6= 'condition' ( (lv_condition_7_0= ruleCondition ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==25) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalCOV.g:729:4: otherlv_6= 'condition' ( (lv_condition_7_0= ruleCondition ) )
                    {
                    otherlv_6=(Token)match(input,25,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getCoverageOfReferencedAccess().getConditionKeyword_4_0());
                    			
                    // InternalCOV.g:733:4: ( (lv_condition_7_0= ruleCondition ) )
                    // InternalCOV.g:734:5: (lv_condition_7_0= ruleCondition )
                    {
                    // InternalCOV.g:734:5: (lv_condition_7_0= ruleCondition )
                    // InternalCOV.g:735:6: lv_condition_7_0= ruleCondition
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
    // InternalCOV.g:757:1: entryRuleCoverageByContent returns [EObject current=null] : iv_ruleCoverageByContent= ruleCoverageByContent EOF ;
    public final EObject entryRuleCoverageByContent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCoverageByContent = null;


        try {
            // InternalCOV.g:757:58: (iv_ruleCoverageByContent= ruleCoverageByContent EOF )
            // InternalCOV.g:758:2: iv_ruleCoverageByContent= ruleCoverageByContent EOF
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
    // InternalCOV.g:764:1: ruleCoverageByContent returns [EObject current=null] : (otherlv_0= 'covered' otherlv_1= 'when' ( (lv_multiplicity_2_0= ruleCoveredContents ) ) ( ( ruleEString ) ) otherlv_4= 'iscovered' (otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) ) )? (otherlv_7= 'condition' ( (lv_condition_8_0= ruleCondition ) ) )? ) ;
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
            // InternalCOV.g:770:2: ( (otherlv_0= 'covered' otherlv_1= 'when' ( (lv_multiplicity_2_0= ruleCoveredContents ) ) ( ( ruleEString ) ) otherlv_4= 'iscovered' (otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) ) )? (otherlv_7= 'condition' ( (lv_condition_8_0= ruleCondition ) ) )? ) )
            // InternalCOV.g:771:2: (otherlv_0= 'covered' otherlv_1= 'when' ( (lv_multiplicity_2_0= ruleCoveredContents ) ) ( ( ruleEString ) ) otherlv_4= 'iscovered' (otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) ) )? (otherlv_7= 'condition' ( (lv_condition_8_0= ruleCondition ) ) )? )
            {
            // InternalCOV.g:771:2: (otherlv_0= 'covered' otherlv_1= 'when' ( (lv_multiplicity_2_0= ruleCoveredContents ) ) ( ( ruleEString ) ) otherlv_4= 'iscovered' (otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) ) )? (otherlv_7= 'condition' ( (lv_condition_8_0= ruleCondition ) ) )? )
            // InternalCOV.g:772:3: otherlv_0= 'covered' otherlv_1= 'when' ( (lv_multiplicity_2_0= ruleCoveredContents ) ) ( ( ruleEString ) ) otherlv_4= 'iscovered' (otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) ) )? (otherlv_7= 'condition' ( (lv_condition_8_0= ruleCondition ) ) )?
            {
            otherlv_0=(Token)match(input,28,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getCoverageByContentAccess().getCoveredKeyword_0());
            		
            otherlv_1=(Token)match(input,29,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getCoverageByContentAccess().getWhenKeyword_1());
            		
            // InternalCOV.g:780:3: ( (lv_multiplicity_2_0= ruleCoveredContents ) )
            // InternalCOV.g:781:4: (lv_multiplicity_2_0= ruleCoveredContents )
            {
            // InternalCOV.g:781:4: (lv_multiplicity_2_0= ruleCoveredContents )
            // InternalCOV.g:782:5: lv_multiplicity_2_0= ruleCoveredContents
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

            // InternalCOV.g:799:3: ( ( ruleEString ) )
            // InternalCOV.g:800:4: ( ruleEString )
            {
            // InternalCOV.g:800:4: ( ruleEString )
            // InternalCOV.g:801:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCoverageByContentRule());
            					}
            				

            					newCompositeNode(grammarAccess.getCoverageByContentAccess().getContainmentReferenceEReferenceCrossReference_3_0());
            				
            pushFollow(FOLLOW_21);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,30,FOLLOW_15); 

            			newLeafNode(otherlv_4, grammarAccess.getCoverageByContentAccess().getIscoveredKeyword_4());
            		
            // InternalCOV.g:819:3: (otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==24) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalCOV.g:820:4: otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,24,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getCoverageByContentAccess().getDescriptionKeyword_5_0());
                    			
                    // InternalCOV.g:824:4: ( (lv_description_6_0= ruleEString ) )
                    // InternalCOV.g:825:5: (lv_description_6_0= ruleEString )
                    {
                    // InternalCOV.g:825:5: (lv_description_6_0= ruleEString )
                    // InternalCOV.g:826:6: lv_description_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getCoverageByContentAccess().getDescriptionEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_16);
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

            // InternalCOV.g:844:3: (otherlv_7= 'condition' ( (lv_condition_8_0= ruleCondition ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==25) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalCOV.g:845:4: otherlv_7= 'condition' ( (lv_condition_8_0= ruleCondition ) )
                    {
                    otherlv_7=(Token)match(input,25,FOLLOW_3); 

                    				newLeafNode(otherlv_7, grammarAccess.getCoverageByContentAccess().getConditionKeyword_6_0());
                    			
                    // InternalCOV.g:849:4: ( (lv_condition_8_0= ruleCondition ) )
                    // InternalCOV.g:850:5: (lv_condition_8_0= ruleCondition )
                    {
                    // InternalCOV.g:850:5: (lv_condition_8_0= ruleCondition )
                    // InternalCOV.g:851:6: lv_condition_8_0= ruleCondition
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
    // InternalCOV.g:873:1: entryRuleBranchSpecification returns [EObject current=null] : iv_ruleBranchSpecification= ruleBranchSpecification EOF ;
    public final EObject entryRuleBranchSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBranchSpecification = null;


        try {
            // InternalCOV.g:873:60: (iv_ruleBranchSpecification= ruleBranchSpecification EOF )
            // InternalCOV.g:874:2: iv_ruleBranchSpecification= ruleBranchSpecification EOF
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
    // InternalCOV.g:880:1: ruleBranchSpecification returns [EObject current=null] : (otherlv_0= 'has' otherlv_1= 'branches' otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) ) )? (otherlv_5= 'condition' ( (lv_condition_6_0= ruleCondition ) ) )? ( (lv_branches_7_0= ruleBranch ) ) (otherlv_8= ',' ( (lv_branches_9_0= ruleBranch ) ) )* otherlv_10= '}' ) ;
    public final EObject ruleBranchSpecification() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_description_4_0 = null;

        EObject lv_condition_6_0 = null;

        EObject lv_branches_7_0 = null;

        EObject lv_branches_9_0 = null;



        	enterRule();

        try {
            // InternalCOV.g:886:2: ( (otherlv_0= 'has' otherlv_1= 'branches' otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) ) )? (otherlv_5= 'condition' ( (lv_condition_6_0= ruleCondition ) ) )? ( (lv_branches_7_0= ruleBranch ) ) (otherlv_8= ',' ( (lv_branches_9_0= ruleBranch ) ) )* otherlv_10= '}' ) )
            // InternalCOV.g:887:2: (otherlv_0= 'has' otherlv_1= 'branches' otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) ) )? (otherlv_5= 'condition' ( (lv_condition_6_0= ruleCondition ) ) )? ( (lv_branches_7_0= ruleBranch ) ) (otherlv_8= ',' ( (lv_branches_9_0= ruleBranch ) ) )* otherlv_10= '}' )
            {
            // InternalCOV.g:887:2: (otherlv_0= 'has' otherlv_1= 'branches' otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) ) )? (otherlv_5= 'condition' ( (lv_condition_6_0= ruleCondition ) ) )? ( (lv_branches_7_0= ruleBranch ) ) (otherlv_8= ',' ( (lv_branches_9_0= ruleBranch ) ) )* otherlv_10= '}' )
            // InternalCOV.g:888:3: otherlv_0= 'has' otherlv_1= 'branches' otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) ) )? (otherlv_5= 'condition' ( (lv_condition_6_0= ruleCondition ) ) )? ( (lv_branches_7_0= ruleBranch ) ) (otherlv_8= ',' ( (lv_branches_9_0= ruleBranch ) ) )* otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_22); 

            			newLeafNode(otherlv_0, grammarAccess.getBranchSpecificationAccess().getHasKeyword_0());
            		
            otherlv_1=(Token)match(input,32,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getBranchSpecificationAccess().getBranchesKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_23); 

            			newLeafNode(otherlv_2, grammarAccess.getBranchSpecificationAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalCOV.g:900:3: (otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==24) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalCOV.g:901:4: otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,24,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getBranchSpecificationAccess().getDescriptionKeyword_3_0());
                    			
                    // InternalCOV.g:905:4: ( (lv_description_4_0= ruleEString ) )
                    // InternalCOV.g:906:5: (lv_description_4_0= ruleEString )
                    {
                    // InternalCOV.g:906:5: (lv_description_4_0= ruleEString )
                    // InternalCOV.g:907:6: lv_description_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getBranchSpecificationAccess().getDescriptionEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_description_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBranchSpecificationRule());
                    						}
                    						set(
                    							current,
                    							"description",
                    							lv_description_4_0,
                    							"coverage.dsl.xtext.COV.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCOV.g:925:3: (otherlv_5= 'condition' ( (lv_condition_6_0= ruleCondition ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==25) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalCOV.g:926:4: otherlv_5= 'condition' ( (lv_condition_6_0= ruleCondition ) )
                    {
                    otherlv_5=(Token)match(input,25,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getBranchSpecificationAccess().getConditionKeyword_4_0());
                    			
                    // InternalCOV.g:930:4: ( (lv_condition_6_0= ruleCondition ) )
                    // InternalCOV.g:931:5: (lv_condition_6_0= ruleCondition )
                    {
                    // InternalCOV.g:931:5: (lv_condition_6_0= ruleCondition )
                    // InternalCOV.g:932:6: lv_condition_6_0= ruleCondition
                    {

                    						newCompositeNode(grammarAccess.getBranchSpecificationAccess().getConditionConditionParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_condition_6_0=ruleCondition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBranchSpecificationRule());
                    						}
                    						set(
                    							current,
                    							"condition",
                    							lv_condition_6_0,
                    							"coverage.dsl.xtext.COV.Condition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCOV.g:950:3: ( (lv_branches_7_0= ruleBranch ) )
            // InternalCOV.g:951:4: (lv_branches_7_0= ruleBranch )
            {
            // InternalCOV.g:951:4: (lv_branches_7_0= ruleBranch )
            // InternalCOV.g:952:5: lv_branches_7_0= ruleBranch
            {

            					newCompositeNode(grammarAccess.getBranchSpecificationAccess().getBranchesBranchParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_8);
            lv_branches_7_0=ruleBranch();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBranchSpecificationRule());
            					}
            					add(
            						current,
            						"branches",
            						lv_branches_7_0,
            						"coverage.dsl.xtext.COV.Branch");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCOV.g:969:3: (otherlv_8= ',' ( (lv_branches_9_0= ruleBranch ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==15) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalCOV.g:970:4: otherlv_8= ',' ( (lv_branches_9_0= ruleBranch ) )
            	    {
            	    otherlv_8=(Token)match(input,15,FOLLOW_23); 

            	    				newLeafNode(otherlv_8, grammarAccess.getBranchSpecificationAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalCOV.g:974:4: ( (lv_branches_9_0= ruleBranch ) )
            	    // InternalCOV.g:975:5: (lv_branches_9_0= ruleBranch )
            	    {
            	    // InternalCOV.g:975:5: (lv_branches_9_0= ruleBranch )
            	    // InternalCOV.g:976:6: lv_branches_9_0= ruleBranch
            	    {

            	    						newCompositeNode(grammarAccess.getBranchSpecificationAccess().getBranchesBranchParserRuleCall_6_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_branches_9_0=ruleBranch();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getBranchSpecificationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"branches",
            	    							lv_branches_9_0,
            	    							"coverage.dsl.xtext.COV.Branch");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            otherlv_10=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getBranchSpecificationAccess().getRightCurlyBracketKeyword_7());
            		

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
    // InternalCOV.g:1002:1: entryRuleBranch returns [EObject current=null] : iv_ruleBranch= ruleBranch EOF ;
    public final EObject entryRuleBranch() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBranch = null;


        try {
            // InternalCOV.g:1002:47: (iv_ruleBranch= ruleBranch EOF )
            // InternalCOV.g:1003:2: iv_ruleBranch= ruleBranch EOF
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
    // InternalCOV.g:1009:1: ruleBranch returns [EObject current=null] : (otherlv_0= 'queryBranch' ( (lv_OCLQuery_1_0= ruleEString ) ) ) ;
    public final EObject ruleBranch() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_OCLQuery_1_0 = null;



        	enterRule();

        try {
            // InternalCOV.g:1015:2: ( (otherlv_0= 'queryBranch' ( (lv_OCLQuery_1_0= ruleEString ) ) ) )
            // InternalCOV.g:1016:2: (otherlv_0= 'queryBranch' ( (lv_OCLQuery_1_0= ruleEString ) ) )
            {
            // InternalCOV.g:1016:2: (otherlv_0= 'queryBranch' ( (lv_OCLQuery_1_0= ruleEString ) ) )
            // InternalCOV.g:1017:3: otherlv_0= 'queryBranch' ( (lv_OCLQuery_1_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,33,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getBranchAccess().getQueryBranchKeyword_0());
            		
            // InternalCOV.g:1021:3: ( (lv_OCLQuery_1_0= ruleEString ) )
            // InternalCOV.g:1022:4: (lv_OCLQuery_1_0= ruleEString )
            {
            // InternalCOV.g:1022:4: (lv_OCLQuery_1_0= ruleEString )
            // InternalCOV.g:1023:5: lv_OCLQuery_1_0= ruleEString
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
    // InternalCOV.g:1044:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalCOV.g:1044:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalCOV.g:1045:2: iv_ruleCondition= ruleCondition EOF
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
    // InternalCOV.g:1051:1: ruleCondition returns [EObject current=null] : ( (lv_OCLConstraint_0_0= ruleEString ) ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_OCLConstraint_0_0 = null;



        	enterRule();

        try {
            // InternalCOV.g:1057:2: ( ( (lv_OCLConstraint_0_0= ruleEString ) ) )
            // InternalCOV.g:1058:2: ( (lv_OCLConstraint_0_0= ruleEString ) )
            {
            // InternalCOV.g:1058:2: ( (lv_OCLConstraint_0_0= ruleEString ) )
            // InternalCOV.g:1059:3: (lv_OCLConstraint_0_0= ruleEString )
            {
            // InternalCOV.g:1059:3: (lv_OCLConstraint_0_0= ruleEString )
            // InternalCOV.g:1060:4: lv_OCLConstraint_0_0= ruleEString
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
    // InternalCOV.g:1080:1: ruleCoveredContents returns [Enumerator current=null] : ( (enumLiteral_0= 'ALL' ) | (enumLiteral_1= 'ONE' ) ) ;
    public final Enumerator ruleCoveredContents() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalCOV.g:1086:2: ( ( (enumLiteral_0= 'ALL' ) | (enumLiteral_1= 'ONE' ) ) )
            // InternalCOV.g:1087:2: ( (enumLiteral_0= 'ALL' ) | (enumLiteral_1= 'ONE' ) )
            {
            // InternalCOV.g:1087:2: ( (enumLiteral_0= 'ALL' ) | (enumLiteral_1= 'ONE' ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==34) ) {
                alt21=1;
            }
            else if ( (LA21_0==35) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalCOV.g:1088:3: (enumLiteral_0= 'ALL' )
                    {
                    // InternalCOV.g:1088:3: (enumLiteral_0= 'ALL' )
                    // InternalCOV.g:1089:4: enumLiteral_0= 'ALL'
                    {
                    enumLiteral_0=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getCoveredContentsAccess().getALLEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getCoveredContentsAccess().getALLEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalCOV.g:1096:3: (enumLiteral_1= 'ONE' )
                    {
                    // InternalCOV.g:1096:3: (enumLiteral_1= 'ONE' )
                    // InternalCOV.g:1097:4: enumLiteral_1= 'ONE'
                    {
                    enumLiteral_1=(Token)match(input,35,FOLLOW_2); 

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
    // InternalCOV.g:1107:1: ruleLimitationType returns [Enumerator current=null] : ( (enumLiteral_0= 'containedBy' ) | (enumLiteral_1= 'notContainedBy' ) ) ;
    public final Enumerator ruleLimitationType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalCOV.g:1113:2: ( ( (enumLiteral_0= 'containedBy' ) | (enumLiteral_1= 'notContainedBy' ) ) )
            // InternalCOV.g:1114:2: ( (enumLiteral_0= 'containedBy' ) | (enumLiteral_1= 'notContainedBy' ) )
            {
            // InternalCOV.g:1114:2: ( (enumLiteral_0= 'containedBy' ) | (enumLiteral_1= 'notContainedBy' ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==36) ) {
                alt22=1;
            }
            else if ( (LA22_0==37) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalCOV.g:1115:3: (enumLiteral_0= 'containedBy' )
                    {
                    // InternalCOV.g:1115:3: (enumLiteral_0= 'containedBy' )
                    // InternalCOV.g:1116:4: enumLiteral_0= 'containedBy'
                    {
                    enumLiteral_0=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getLimitationTypeAccess().getContainedByEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getLimitationTypeAccess().getContainedByEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalCOV.g:1123:3: (enumLiteral_1= 'notContainedBy' )
                    {
                    // InternalCOV.g:1123:3: (enumLiteral_1= 'notContainedBy' )
                    // InternalCOV.g:1124:4: enumLiteral_1= 'notContainedBy'
                    {
                    enumLiteral_1=(Token)match(input,37,FOLLOW_2); 

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
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000000009C110000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000000009C100000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000003000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000003000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000003008002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000203000000L});

}