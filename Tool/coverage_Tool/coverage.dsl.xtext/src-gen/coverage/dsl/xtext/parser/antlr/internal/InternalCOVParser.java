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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'DomainSpecificCoverage'", "'{'", "'Import'", "'metamodel'", "','", "'}'", "'Context'", "'true'", "'false'", "'Ignore'", "'ignoreSubtypes'", "'CoverageOfReferenced'", "'reference'", "'CoverageByContent'", "'containmentReference'", "'multiplicity'", "'ConditionalIgnore'", "'condition'", "'containerType'", "'('", "')'", "'ALL'", "'ONE'", "'INCLUSION'", "'EXCLUSION'"
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
    // InternalCOV.g:72:1: ruleDomainSpecificCoverage returns [EObject current=null] : (otherlv_0= 'DomainSpecificCoverage' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'Import' otherlv_4= 'metamodel' ( ( ruleEString ) ) ( (lv_contexts_6_0= ruleContext ) ) (otherlv_7= ',' ( (lv_contexts_8_0= ruleContext ) ) )* otherlv_9= '}' ) ;
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
            // InternalCOV.g:78:2: ( (otherlv_0= 'DomainSpecificCoverage' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'Import' otherlv_4= 'metamodel' ( ( ruleEString ) ) ( (lv_contexts_6_0= ruleContext ) ) (otherlv_7= ',' ( (lv_contexts_8_0= ruleContext ) ) )* otherlv_9= '}' ) )
            // InternalCOV.g:79:2: (otherlv_0= 'DomainSpecificCoverage' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'Import' otherlv_4= 'metamodel' ( ( ruleEString ) ) ( (lv_contexts_6_0= ruleContext ) ) (otherlv_7= ',' ( (lv_contexts_8_0= ruleContext ) ) )* otherlv_9= '}' )
            {
            // InternalCOV.g:79:2: (otherlv_0= 'DomainSpecificCoverage' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'Import' otherlv_4= 'metamodel' ( ( ruleEString ) ) ( (lv_contexts_6_0= ruleContext ) ) (otherlv_7= ',' ( (lv_contexts_8_0= ruleContext ) ) )* otherlv_9= '}' )
            // InternalCOV.g:80:3: otherlv_0= 'DomainSpecificCoverage' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'Import' otherlv_4= 'metamodel' ( ( ruleEString ) ) ( (lv_contexts_6_0= ruleContext ) ) (otherlv_7= ',' ( (lv_contexts_8_0= ruleContext ) ) )* otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDomainSpecificCoverageAccess().getDomainSpecificCoverageKeyword_0());
            		
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
    // InternalCOV.g:224:1: ruleContext returns [EObject current=null] : (otherlv_0= 'Context' ( ( ruleEString ) ) otherlv_2= '{' ( ( (lv_rules_3_0= ruleRule ) ) (otherlv_4= ',' ( (lv_rules_5_0= ruleRule ) ) )* )? otherlv_6= '}' ) ;
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
            // InternalCOV.g:230:2: ( (otherlv_0= 'Context' ( ( ruleEString ) ) otherlv_2= '{' ( ( (lv_rules_3_0= ruleRule ) ) (otherlv_4= ',' ( (lv_rules_5_0= ruleRule ) ) )* )? otherlv_6= '}' ) )
            // InternalCOV.g:231:2: (otherlv_0= 'Context' ( ( ruleEString ) ) otherlv_2= '{' ( ( (lv_rules_3_0= ruleRule ) ) (otherlv_4= ',' ( (lv_rules_5_0= ruleRule ) ) )* )? otherlv_6= '}' )
            {
            // InternalCOV.g:231:2: (otherlv_0= 'Context' ( ( ruleEString ) ) otherlv_2= '{' ( ( (lv_rules_3_0= ruleRule ) ) (otherlv_4= ',' ( (lv_rules_5_0= ruleRule ) ) )* )? otherlv_6= '}' )
            // InternalCOV.g:232:3: otherlv_0= 'Context' ( ( ruleEString ) ) otherlv_2= '{' ( ( (lv_rules_3_0= ruleRule ) ) (otherlv_4= ',' ( (lv_rules_5_0= ruleRule ) ) )* )? otherlv_6= '}'
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

            if ( (LA4_0==20||LA4_0==22||LA4_0==24||LA4_0==27) ) {
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
    // InternalCOV.g:317:1: ruleRule returns [EObject current=null] : (this_Ignore_0= ruleIgnore | this_CoverageOfReferenced_1= ruleCoverageOfReferenced | this_CoverageByContent_2= ruleCoverageByContent | this_ConditionalIgnore_3= ruleConditionalIgnore ) ;
    public final EObject ruleRule() throws RecognitionException {
        EObject current = null;

        EObject this_Ignore_0 = null;

        EObject this_CoverageOfReferenced_1 = null;

        EObject this_CoverageByContent_2 = null;

        EObject this_ConditionalIgnore_3 = null;



        	enterRule();

        try {
            // InternalCOV.g:323:2: ( (this_Ignore_0= ruleIgnore | this_CoverageOfReferenced_1= ruleCoverageOfReferenced | this_CoverageByContent_2= ruleCoverageByContent | this_ConditionalIgnore_3= ruleConditionalIgnore ) )
            // InternalCOV.g:324:2: (this_Ignore_0= ruleIgnore | this_CoverageOfReferenced_1= ruleCoverageOfReferenced | this_CoverageByContent_2= ruleCoverageByContent | this_ConditionalIgnore_3= ruleConditionalIgnore )
            {
            // InternalCOV.g:324:2: (this_Ignore_0= ruleIgnore | this_CoverageOfReferenced_1= ruleCoverageOfReferenced | this_CoverageByContent_2= ruleCoverageByContent | this_ConditionalIgnore_3= ruleConditionalIgnore )
            int alt5=4;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt5=1;
                }
                break;
            case 22:
                {
                alt5=2;
                }
                break;
            case 24:
                {
                alt5=3;
                }
                break;
            case 27:
                {
                alt5=4;
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
                    // InternalCOV.g:352:3: this_ConditionalIgnore_3= ruleConditionalIgnore
                    {

                    			newCompositeNode(grammarAccess.getRuleAccess().getConditionalIgnoreParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_ConditionalIgnore_3=ruleConditionalIgnore();

                    state._fsp--;


                    			current = this_ConditionalIgnore_3;
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
    // InternalCOV.g:364:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // InternalCOV.g:364:48: (iv_ruleEBoolean= ruleEBoolean EOF )
            // InternalCOV.g:365:2: iv_ruleEBoolean= ruleEBoolean EOF
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
    // InternalCOV.g:371:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalCOV.g:377:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalCOV.g:378:2: (kw= 'true' | kw= 'false' )
            {
            // InternalCOV.g:378:2: (kw= 'true' | kw= 'false' )
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
                    // InternalCOV.g:379:3: kw= 'true'
                    {
                    kw=(Token)match(input,18,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalCOV.g:385:3: kw= 'false'
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
    // InternalCOV.g:394:1: entryRuleIgnore returns [EObject current=null] : iv_ruleIgnore= ruleIgnore EOF ;
    public final EObject entryRuleIgnore() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIgnore = null;


        try {
            // InternalCOV.g:394:47: (iv_ruleIgnore= ruleIgnore EOF )
            // InternalCOV.g:395:2: iv_ruleIgnore= ruleIgnore EOF
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
    // InternalCOV.g:401:1: ruleIgnore returns [EObject current=null] : ( () otherlv_1= 'Ignore' otherlv_2= '{' (otherlv_3= 'ignoreSubtypes' ( (lv_ignoreSubtypes_4_0= ruleEBoolean ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleIgnore() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_ignoreSubtypes_4_0 = null;



        	enterRule();

        try {
            // InternalCOV.g:407:2: ( ( () otherlv_1= 'Ignore' otherlv_2= '{' (otherlv_3= 'ignoreSubtypes' ( (lv_ignoreSubtypes_4_0= ruleEBoolean ) ) )? otherlv_5= '}' ) )
            // InternalCOV.g:408:2: ( () otherlv_1= 'Ignore' otherlv_2= '{' (otherlv_3= 'ignoreSubtypes' ( (lv_ignoreSubtypes_4_0= ruleEBoolean ) ) )? otherlv_5= '}' )
            {
            // InternalCOV.g:408:2: ( () otherlv_1= 'Ignore' otherlv_2= '{' (otherlv_3= 'ignoreSubtypes' ( (lv_ignoreSubtypes_4_0= ruleEBoolean ) ) )? otherlv_5= '}' )
            // InternalCOV.g:409:3: () otherlv_1= 'Ignore' otherlv_2= '{' (otherlv_3= 'ignoreSubtypes' ( (lv_ignoreSubtypes_4_0= ruleEBoolean ) ) )? otherlv_5= '}'
            {
            // InternalCOV.g:409:3: ()
            // InternalCOV.g:410:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIgnoreAccess().getIgnoreAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,20,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getIgnoreAccess().getIgnoreKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getIgnoreAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalCOV.g:424:3: (otherlv_3= 'ignoreSubtypes' ( (lv_ignoreSubtypes_4_0= ruleEBoolean ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==21) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalCOV.g:425:4: otherlv_3= 'ignoreSubtypes' ( (lv_ignoreSubtypes_4_0= ruleEBoolean ) )
                    {
                    otherlv_3=(Token)match(input,21,FOLLOW_12); 

                    				newLeafNode(otherlv_3, grammarAccess.getIgnoreAccess().getIgnoreSubtypesKeyword_3_0());
                    			
                    // InternalCOV.g:429:4: ( (lv_ignoreSubtypes_4_0= ruleEBoolean ) )
                    // InternalCOV.g:430:5: (lv_ignoreSubtypes_4_0= ruleEBoolean )
                    {
                    // InternalCOV.g:430:5: (lv_ignoreSubtypes_4_0= ruleEBoolean )
                    // InternalCOV.g:431:6: lv_ignoreSubtypes_4_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getIgnoreAccess().getIgnoreSubtypesEBooleanParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_13);
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

            otherlv_5=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getIgnoreAccess().getRightCurlyBracketKeyword_4());
            		

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


    // $ANTLR start "entryRuleCoverageOfReferenced"
    // InternalCOV.g:457:1: entryRuleCoverageOfReferenced returns [EObject current=null] : iv_ruleCoverageOfReferenced= ruleCoverageOfReferenced EOF ;
    public final EObject entryRuleCoverageOfReferenced() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCoverageOfReferenced = null;


        try {
            // InternalCOV.g:457:61: (iv_ruleCoverageOfReferenced= ruleCoverageOfReferenced EOF )
            // InternalCOV.g:458:2: iv_ruleCoverageOfReferenced= ruleCoverageOfReferenced EOF
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
    // InternalCOV.g:464:1: ruleCoverageOfReferenced returns [EObject current=null] : (otherlv_0= 'CoverageOfReferenced' otherlv_1= '{' otherlv_2= 'reference' ( ( ruleEString ) ) otherlv_4= '}' ) ;
    public final EObject ruleCoverageOfReferenced() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalCOV.g:470:2: ( (otherlv_0= 'CoverageOfReferenced' otherlv_1= '{' otherlv_2= 'reference' ( ( ruleEString ) ) otherlv_4= '}' ) )
            // InternalCOV.g:471:2: (otherlv_0= 'CoverageOfReferenced' otherlv_1= '{' otherlv_2= 'reference' ( ( ruleEString ) ) otherlv_4= '}' )
            {
            // InternalCOV.g:471:2: (otherlv_0= 'CoverageOfReferenced' otherlv_1= '{' otherlv_2= 'reference' ( ( ruleEString ) ) otherlv_4= '}' )
            // InternalCOV.g:472:3: otherlv_0= 'CoverageOfReferenced' otherlv_1= '{' otherlv_2= 'reference' ( ( ruleEString ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getCoverageOfReferencedAccess().getCoverageOfReferencedKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getCoverageOfReferencedAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getCoverageOfReferencedAccess().getReferenceKeyword_2());
            		
            // InternalCOV.g:484:3: ( ( ruleEString ) )
            // InternalCOV.g:485:4: ( ruleEString )
            {
            // InternalCOV.g:485:4: ( ruleEString )
            // InternalCOV.g:486:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCoverageOfReferencedRule());
            					}
            				

            					newCompositeNode(grammarAccess.getCoverageOfReferencedAccess().getReferenceEReferenceCrossReference_3_0());
            				
            pushFollow(FOLLOW_13);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getCoverageOfReferencedAccess().getRightCurlyBracketKeyword_4());
            		

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
    // InternalCOV.g:508:1: entryRuleCoverageByContent returns [EObject current=null] : iv_ruleCoverageByContent= ruleCoverageByContent EOF ;
    public final EObject entryRuleCoverageByContent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCoverageByContent = null;


        try {
            // InternalCOV.g:508:58: (iv_ruleCoverageByContent= ruleCoverageByContent EOF )
            // InternalCOV.g:509:2: iv_ruleCoverageByContent= ruleCoverageByContent EOF
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
    // InternalCOV.g:515:1: ruleCoverageByContent returns [EObject current=null] : (otherlv_0= 'CoverageByContent' otherlv_1= '{' otherlv_2= 'containmentReference' ( ( ruleEString ) ) otherlv_4= 'multiplicity' ( (lv_multiplicity_5_0= ruleCoveredContents ) ) otherlv_6= '}' ) ;
    public final EObject ruleCoverageByContent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Enumerator lv_multiplicity_5_0 = null;



        	enterRule();

        try {
            // InternalCOV.g:521:2: ( (otherlv_0= 'CoverageByContent' otherlv_1= '{' otherlv_2= 'containmentReference' ( ( ruleEString ) ) otherlv_4= 'multiplicity' ( (lv_multiplicity_5_0= ruleCoveredContents ) ) otherlv_6= '}' ) )
            // InternalCOV.g:522:2: (otherlv_0= 'CoverageByContent' otherlv_1= '{' otherlv_2= 'containmentReference' ( ( ruleEString ) ) otherlv_4= 'multiplicity' ( (lv_multiplicity_5_0= ruleCoveredContents ) ) otherlv_6= '}' )
            {
            // InternalCOV.g:522:2: (otherlv_0= 'CoverageByContent' otherlv_1= '{' otherlv_2= 'containmentReference' ( ( ruleEString ) ) otherlv_4= 'multiplicity' ( (lv_multiplicity_5_0= ruleCoveredContents ) ) otherlv_6= '}' )
            // InternalCOV.g:523:3: otherlv_0= 'CoverageByContent' otherlv_1= '{' otherlv_2= 'containmentReference' ( ( ruleEString ) ) otherlv_4= 'multiplicity' ( (lv_multiplicity_5_0= ruleCoveredContents ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getCoverageByContentAccess().getCoverageByContentKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getCoverageByContentAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getCoverageByContentAccess().getContainmentReferenceKeyword_2());
            		
            // InternalCOV.g:535:3: ( ( ruleEString ) )
            // InternalCOV.g:536:4: ( ruleEString )
            {
            // InternalCOV.g:536:4: ( ruleEString )
            // InternalCOV.g:537:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCoverageByContentRule());
            					}
            				

            					newCompositeNode(grammarAccess.getCoverageByContentAccess().getContainmentReferenceEReferenceCrossReference_3_0());
            				
            pushFollow(FOLLOW_16);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,26,FOLLOW_17); 

            			newLeafNode(otherlv_4, grammarAccess.getCoverageByContentAccess().getMultiplicityKeyword_4());
            		
            // InternalCOV.g:555:3: ( (lv_multiplicity_5_0= ruleCoveredContents ) )
            // InternalCOV.g:556:4: (lv_multiplicity_5_0= ruleCoveredContents )
            {
            // InternalCOV.g:556:4: (lv_multiplicity_5_0= ruleCoveredContents )
            // InternalCOV.g:557:5: lv_multiplicity_5_0= ruleCoveredContents
            {

            					newCompositeNode(grammarAccess.getCoverageByContentAccess().getMultiplicityCoveredContentsEnumRuleCall_5_0());
            				
            pushFollow(FOLLOW_13);
            lv_multiplicity_5_0=ruleCoveredContents();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCoverageByContentRule());
            					}
            					set(
            						current,
            						"multiplicity",
            						lv_multiplicity_5_0,
            						"coverage.dsl.xtext.COV.CoveredContents");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getCoverageByContentAccess().getRightCurlyBracketKeyword_6());
            		

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


    // $ANTLR start "entryRuleConditionalIgnore"
    // InternalCOV.g:582:1: entryRuleConditionalIgnore returns [EObject current=null] : iv_ruleConditionalIgnore= ruleConditionalIgnore EOF ;
    public final EObject entryRuleConditionalIgnore() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionalIgnore = null;


        try {
            // InternalCOV.g:582:58: (iv_ruleConditionalIgnore= ruleConditionalIgnore EOF )
            // InternalCOV.g:583:2: iv_ruleConditionalIgnore= ruleConditionalIgnore EOF
            {
             newCompositeNode(grammarAccess.getConditionalIgnoreRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConditionalIgnore=ruleConditionalIgnore();

            state._fsp--;

             current =iv_ruleConditionalIgnore; 
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
    // $ANTLR end "entryRuleConditionalIgnore"


    // $ANTLR start "ruleConditionalIgnore"
    // InternalCOV.g:589:1: ruleConditionalIgnore returns [EObject current=null] : (otherlv_0= 'ConditionalIgnore' otherlv_1= '{' otherlv_2= 'condition' ( (lv_condition_3_0= ruleConditionType ) ) otherlv_4= 'containerType' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' otherlv_10= '}' ) ;
    public final EObject ruleConditionalIgnore() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Enumerator lv_condition_3_0 = null;



        	enterRule();

        try {
            // InternalCOV.g:595:2: ( (otherlv_0= 'ConditionalIgnore' otherlv_1= '{' otherlv_2= 'condition' ( (lv_condition_3_0= ruleConditionType ) ) otherlv_4= 'containerType' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' otherlv_10= '}' ) )
            // InternalCOV.g:596:2: (otherlv_0= 'ConditionalIgnore' otherlv_1= '{' otherlv_2= 'condition' ( (lv_condition_3_0= ruleConditionType ) ) otherlv_4= 'containerType' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' otherlv_10= '}' )
            {
            // InternalCOV.g:596:2: (otherlv_0= 'ConditionalIgnore' otherlv_1= '{' otherlv_2= 'condition' ( (lv_condition_3_0= ruleConditionType ) ) otherlv_4= 'containerType' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' otherlv_10= '}' )
            // InternalCOV.g:597:3: otherlv_0= 'ConditionalIgnore' otherlv_1= '{' otherlv_2= 'condition' ( (lv_condition_3_0= ruleConditionType ) ) otherlv_4= 'containerType' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getConditionalIgnoreAccess().getConditionalIgnoreKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getConditionalIgnoreAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,28,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getConditionalIgnoreAccess().getConditionKeyword_2());
            		
            // InternalCOV.g:609:3: ( (lv_condition_3_0= ruleConditionType ) )
            // InternalCOV.g:610:4: (lv_condition_3_0= ruleConditionType )
            {
            // InternalCOV.g:610:4: (lv_condition_3_0= ruleConditionType )
            // InternalCOV.g:611:5: lv_condition_3_0= ruleConditionType
            {

            					newCompositeNode(grammarAccess.getConditionalIgnoreAccess().getConditionConditionTypeEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_20);
            lv_condition_3_0=ruleConditionType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConditionalIgnoreRule());
            					}
            					set(
            						current,
            						"condition",
            						lv_condition_3_0,
            						"coverage.dsl.xtext.COV.ConditionType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,29,FOLLOW_21); 

            			newLeafNode(otherlv_4, grammarAccess.getConditionalIgnoreAccess().getContainerTypeKeyword_4());
            		
            otherlv_5=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getConditionalIgnoreAccess().getLeftParenthesisKeyword_5());
            		
            // InternalCOV.g:636:3: ( ( ruleEString ) )
            // InternalCOV.g:637:4: ( ruleEString )
            {
            // InternalCOV.g:637:4: ( ruleEString )
            // InternalCOV.g:638:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConditionalIgnoreRule());
            					}
            				

            					newCompositeNode(grammarAccess.getConditionalIgnoreAccess().getContainerTypeEClassCrossReference_6_0());
            				
            pushFollow(FOLLOW_22);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCOV.g:652:3: (otherlv_7= ',' ( ( ruleEString ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==15) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalCOV.g:653:4: otherlv_7= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_7=(Token)match(input,15,FOLLOW_3); 

            	    				newLeafNode(otherlv_7, grammarAccess.getConditionalIgnoreAccess().getCommaKeyword_7_0());
            	    			
            	    // InternalCOV.g:657:4: ( ( ruleEString ) )
            	    // InternalCOV.g:658:5: ( ruleEString )
            	    {
            	    // InternalCOV.g:658:5: ( ruleEString )
            	    // InternalCOV.g:659:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getConditionalIgnoreRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getConditionalIgnoreAccess().getContainerTypeEClassCrossReference_7_1_0());
            	    					
            	    pushFollow(FOLLOW_22);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_9=(Token)match(input,31,FOLLOW_13); 

            			newLeafNode(otherlv_9, grammarAccess.getConditionalIgnoreAccess().getRightParenthesisKeyword_8());
            		
            otherlv_10=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getConditionalIgnoreAccess().getRightCurlyBracketKeyword_9());
            		

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
    // $ANTLR end "ruleConditionalIgnore"


    // $ANTLR start "ruleCoveredContents"
    // InternalCOV.g:686:1: ruleCoveredContents returns [Enumerator current=null] : ( (enumLiteral_0= 'ALL' ) | (enumLiteral_1= 'ONE' ) ) ;
    public final Enumerator ruleCoveredContents() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalCOV.g:692:2: ( ( (enumLiteral_0= 'ALL' ) | (enumLiteral_1= 'ONE' ) ) )
            // InternalCOV.g:693:2: ( (enumLiteral_0= 'ALL' ) | (enumLiteral_1= 'ONE' ) )
            {
            // InternalCOV.g:693:2: ( (enumLiteral_0= 'ALL' ) | (enumLiteral_1= 'ONE' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==32) ) {
                alt9=1;
            }
            else if ( (LA9_0==33) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalCOV.g:694:3: (enumLiteral_0= 'ALL' )
                    {
                    // InternalCOV.g:694:3: (enumLiteral_0= 'ALL' )
                    // InternalCOV.g:695:4: enumLiteral_0= 'ALL'
                    {
                    enumLiteral_0=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getCoveredContentsAccess().getALLEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getCoveredContentsAccess().getALLEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalCOV.g:702:3: (enumLiteral_1= 'ONE' )
                    {
                    // InternalCOV.g:702:3: (enumLiteral_1= 'ONE' )
                    // InternalCOV.g:703:4: enumLiteral_1= 'ONE'
                    {
                    enumLiteral_1=(Token)match(input,33,FOLLOW_2); 

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


    // $ANTLR start "ruleConditionType"
    // InternalCOV.g:713:1: ruleConditionType returns [Enumerator current=null] : ( (enumLiteral_0= 'INCLUSION' ) | (enumLiteral_1= 'EXCLUSION' ) ) ;
    public final Enumerator ruleConditionType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalCOV.g:719:2: ( ( (enumLiteral_0= 'INCLUSION' ) | (enumLiteral_1= 'EXCLUSION' ) ) )
            // InternalCOV.g:720:2: ( (enumLiteral_0= 'INCLUSION' ) | (enumLiteral_1= 'EXCLUSION' ) )
            {
            // InternalCOV.g:720:2: ( (enumLiteral_0= 'INCLUSION' ) | (enumLiteral_1= 'EXCLUSION' ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==34) ) {
                alt10=1;
            }
            else if ( (LA10_0==35) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalCOV.g:721:3: (enumLiteral_0= 'INCLUSION' )
                    {
                    // InternalCOV.g:721:3: (enumLiteral_0= 'INCLUSION' )
                    // InternalCOV.g:722:4: enumLiteral_0= 'INCLUSION'
                    {
                    enumLiteral_0=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getConditionTypeAccess().getINCLUSIONEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getConditionTypeAccess().getINCLUSIONEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalCOV.g:729:3: (enumLiteral_1= 'EXCLUSION' )
                    {
                    // InternalCOV.g:729:3: (enumLiteral_1= 'EXCLUSION' )
                    // InternalCOV.g:730:4: enumLiteral_1= 'EXCLUSION'
                    {
                    enumLiteral_1=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getConditionTypeAccess().getEXCLUSIONEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getConditionTypeAccess().getEXCLUSIONEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleConditionType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000009510000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000009500000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000210000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000080008000L});

}