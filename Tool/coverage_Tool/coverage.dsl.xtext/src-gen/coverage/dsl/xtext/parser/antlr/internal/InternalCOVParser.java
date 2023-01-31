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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'ruleset'", "'{'", "'import'", "'metamodel'", "','", "'}'", "'context'", "'true'", "'false'", "'when'", "'ignore'", "'('", "'subtypes'", "')'", "'description'", "'ignoreif'", "'covers'", "'covered'", "'iscovered'", "'branch'", "'else'", "'ALL'", "'ONE'", "'containedBy'", "'notContainedBy'"
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
    // InternalCOV.g:72:1: ruleDomainSpecificCoverage returns [EObject current=null] : (otherlv_0= 'ruleset' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'import' otherlv_4= 'metamodel' ( ( ruleEString ) ) (otherlv_6= 'import' otherlv_7= 'ruleset' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* )? ( (lv_contexts_11_0= ruleContext ) ) (otherlv_12= ',' ( (lv_contexts_13_0= ruleContext ) ) )* otherlv_14= '}' ) ;
    public final EObject ruleDomainSpecificCoverage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_contexts_11_0 = null;

        EObject lv_contexts_13_0 = null;



        	enterRule();

        try {
            // InternalCOV.g:78:2: ( (otherlv_0= 'ruleset' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'import' otherlv_4= 'metamodel' ( ( ruleEString ) ) (otherlv_6= 'import' otherlv_7= 'ruleset' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* )? ( (lv_contexts_11_0= ruleContext ) ) (otherlv_12= ',' ( (lv_contexts_13_0= ruleContext ) ) )* otherlv_14= '}' ) )
            // InternalCOV.g:79:2: (otherlv_0= 'ruleset' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'import' otherlv_4= 'metamodel' ( ( ruleEString ) ) (otherlv_6= 'import' otherlv_7= 'ruleset' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* )? ( (lv_contexts_11_0= ruleContext ) ) (otherlv_12= ',' ( (lv_contexts_13_0= ruleContext ) ) )* otherlv_14= '}' )
            {
            // InternalCOV.g:79:2: (otherlv_0= 'ruleset' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'import' otherlv_4= 'metamodel' ( ( ruleEString ) ) (otherlv_6= 'import' otherlv_7= 'ruleset' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* )? ( (lv_contexts_11_0= ruleContext ) ) (otherlv_12= ',' ( (lv_contexts_13_0= ruleContext ) ) )* otherlv_14= '}' )
            // InternalCOV.g:80:3: otherlv_0= 'ruleset' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'import' otherlv_4= 'metamodel' ( ( ruleEString ) ) (otherlv_6= 'import' otherlv_7= 'ruleset' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* )? ( (lv_contexts_11_0= ruleContext ) ) (otherlv_12= ',' ( (lv_contexts_13_0= ruleContext ) ) )* otherlv_14= '}'
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

            // InternalCOV.g:131:3: (otherlv_6= 'import' otherlv_7= 'ruleset' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalCOV.g:132:4: otherlv_6= 'import' otherlv_7= 'ruleset' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )*
                    {
                    otherlv_6=(Token)match(input,13,FOLLOW_8); 

                    				newLeafNode(otherlv_6, grammarAccess.getDomainSpecificCoverageAccess().getImportKeyword_6_0());
                    			
                    otherlv_7=(Token)match(input,11,FOLLOW_3); 

                    				newLeafNode(otherlv_7, grammarAccess.getDomainSpecificCoverageAccess().getRulesetKeyword_6_1());
                    			
                    // InternalCOV.g:140:4: ( ( ruleEString ) )
                    // InternalCOV.g:141:5: ( ruleEString )
                    {
                    // InternalCOV.g:141:5: ( ruleEString )
                    // InternalCOV.g:142:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDomainSpecificCoverageRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getDomainSpecificCoverageAccess().getImportsDomainSpecificCoverageCrossReference_6_2_0());
                    					
                    pushFollow(FOLLOW_9);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCOV.g:156:4: (otherlv_9= ',' ( ( ruleEString ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==15) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalCOV.g:157:5: otherlv_9= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_9=(Token)match(input,15,FOLLOW_3); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getDomainSpecificCoverageAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalCOV.g:161:5: ( ( ruleEString ) )
                    	    // InternalCOV.g:162:6: ( ruleEString )
                    	    {
                    	    // InternalCOV.g:162:6: ( ruleEString )
                    	    // InternalCOV.g:163:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getDomainSpecificCoverageRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getDomainSpecificCoverageAccess().getImportsDomainSpecificCoverageCrossReference_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalCOV.g:179:3: ( (lv_contexts_11_0= ruleContext ) )
            // InternalCOV.g:180:4: (lv_contexts_11_0= ruleContext )
            {
            // InternalCOV.g:180:4: (lv_contexts_11_0= ruleContext )
            // InternalCOV.g:181:5: lv_contexts_11_0= ruleContext
            {

            					newCompositeNode(grammarAccess.getDomainSpecificCoverageAccess().getContextsContextParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_10);
            lv_contexts_11_0=ruleContext();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDomainSpecificCoverageRule());
            					}
            					add(
            						current,
            						"contexts",
            						lv_contexts_11_0,
            						"coverage.dsl.xtext.COV.Context");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCOV.g:198:3: (otherlv_12= ',' ( (lv_contexts_13_0= ruleContext ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==15) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalCOV.g:199:4: otherlv_12= ',' ( (lv_contexts_13_0= ruleContext ) )
            	    {
            	    otherlv_12=(Token)match(input,15,FOLLOW_7); 

            	    				newLeafNode(otherlv_12, grammarAccess.getDomainSpecificCoverageAccess().getCommaKeyword_8_0());
            	    			
            	    // InternalCOV.g:203:4: ( (lv_contexts_13_0= ruleContext ) )
            	    // InternalCOV.g:204:5: (lv_contexts_13_0= ruleContext )
            	    {
            	    // InternalCOV.g:204:5: (lv_contexts_13_0= ruleContext )
            	    // InternalCOV.g:205:6: lv_contexts_13_0= ruleContext
            	    {

            	    						newCompositeNode(grammarAccess.getDomainSpecificCoverageAccess().getContextsContextParserRuleCall_8_1_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_contexts_13_0=ruleContext();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getDomainSpecificCoverageRule());
            	    						}
            	    						add(
            	    							current,
            	    							"contexts",
            	    							lv_contexts_13_0,
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

            otherlv_14=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getDomainSpecificCoverageAccess().getRightCurlyBracketKeyword_9());
            		

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
    // InternalCOV.g:231:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalCOV.g:231:47: (iv_ruleEString= ruleEString EOF )
            // InternalCOV.g:232:2: iv_ruleEString= ruleEString EOF
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
    // InternalCOV.g:238:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalCOV.g:244:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalCOV.g:245:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalCOV.g:245:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalCOV.g:246:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalCOV.g:254:3: this_ID_1= RULE_ID
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
    // InternalCOV.g:265:1: entryRuleContext returns [EObject current=null] : iv_ruleContext= ruleContext EOF ;
    public final EObject entryRuleContext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContext = null;


        try {
            // InternalCOV.g:265:48: (iv_ruleContext= ruleContext EOF )
            // InternalCOV.g:266:2: iv_ruleContext= ruleContext EOF
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
    // InternalCOV.g:272:1: ruleContext returns [EObject current=null] : (otherlv_0= 'context' ( ( ruleEString ) ) otherlv_2= '{' ( ( (lv_rules_3_0= ruleRule ) ) (otherlv_4= ',' ( (lv_rules_5_0= ruleRule ) ) )* )? otherlv_6= '}' ) ;
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
            // InternalCOV.g:278:2: ( (otherlv_0= 'context' ( ( ruleEString ) ) otherlv_2= '{' ( ( (lv_rules_3_0= ruleRule ) ) (otherlv_4= ',' ( (lv_rules_5_0= ruleRule ) ) )* )? otherlv_6= '}' ) )
            // InternalCOV.g:279:2: (otherlv_0= 'context' ( ( ruleEString ) ) otherlv_2= '{' ( ( (lv_rules_3_0= ruleRule ) ) (otherlv_4= ',' ( (lv_rules_5_0= ruleRule ) ) )* )? otherlv_6= '}' )
            {
            // InternalCOV.g:279:2: (otherlv_0= 'context' ( ( ruleEString ) ) otherlv_2= '{' ( ( (lv_rules_3_0= ruleRule ) ) (otherlv_4= ',' ( (lv_rules_5_0= ruleRule ) ) )* )? otherlv_6= '}' )
            // InternalCOV.g:280:3: otherlv_0= 'context' ( ( ruleEString ) ) otherlv_2= '{' ( ( (lv_rules_3_0= ruleRule ) ) (otherlv_4= ',' ( (lv_rules_5_0= ruleRule ) ) )* )? otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getContextAccess().getContextKeyword_0());
            		
            // InternalCOV.g:284:3: ( ( ruleEString ) )
            // InternalCOV.g:285:4: ( ruleEString )
            {
            // InternalCOV.g:285:4: ( ruleEString )
            // InternalCOV.g:286:5: ruleEString
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

            otherlv_2=(Token)match(input,12,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getContextAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalCOV.g:304:3: ( ( (lv_rules_3_0= ruleRule ) ) (otherlv_4= ',' ( (lv_rules_5_0= ruleRule ) ) )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==12||(LA6_0>=20 && LA6_0<=21)||(LA6_0>=26 && LA6_0<=28)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalCOV.g:305:4: ( (lv_rules_3_0= ruleRule ) ) (otherlv_4= ',' ( (lv_rules_5_0= ruleRule ) ) )*
                    {
                    // InternalCOV.g:305:4: ( (lv_rules_3_0= ruleRule ) )
                    // InternalCOV.g:306:5: (lv_rules_3_0= ruleRule )
                    {
                    // InternalCOV.g:306:5: (lv_rules_3_0= ruleRule )
                    // InternalCOV.g:307:6: lv_rules_3_0= ruleRule
                    {

                    						newCompositeNode(grammarAccess.getContextAccess().getRulesRuleParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_10);
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

                    // InternalCOV.g:324:4: (otherlv_4= ',' ( (lv_rules_5_0= ruleRule ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==15) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalCOV.g:325:5: otherlv_4= ',' ( (lv_rules_5_0= ruleRule ) )
                    	    {
                    	    otherlv_4=(Token)match(input,15,FOLLOW_12); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getContextAccess().getCommaKeyword_3_1_0());
                    	    				
                    	    // InternalCOV.g:329:5: ( (lv_rules_5_0= ruleRule ) )
                    	    // InternalCOV.g:330:6: (lv_rules_5_0= ruleRule )
                    	    {
                    	    // InternalCOV.g:330:6: (lv_rules_5_0= ruleRule )
                    	    // InternalCOV.g:331:7: lv_rules_5_0= ruleRule
                    	    {

                    	    							newCompositeNode(grammarAccess.getContextAccess().getRulesRuleParserRuleCall_3_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
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
                    	    break loop5;
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
    // InternalCOV.g:358:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // InternalCOV.g:358:45: (iv_ruleRule= ruleRule EOF )
            // InternalCOV.g:359:2: iv_ruleRule= ruleRule EOF
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
    // InternalCOV.g:365:1: ruleRule returns [EObject current=null] : (this_Ignore_0= ruleIgnore | this_LimitedIgnore_1= ruleLimitedIgnore | this_CoverageOfReferenced_2= ruleCoverageOfReferenced | this_CoverageByContent_3= ruleCoverageByContent | this_BranchSpecification_4= ruleBranchSpecification ) ;
    public final EObject ruleRule() throws RecognitionException {
        EObject current = null;

        EObject this_Ignore_0 = null;

        EObject this_LimitedIgnore_1 = null;

        EObject this_CoverageOfReferenced_2 = null;

        EObject this_CoverageByContent_3 = null;

        EObject this_BranchSpecification_4 = null;



        	enterRule();

        try {
            // InternalCOV.g:371:2: ( (this_Ignore_0= ruleIgnore | this_LimitedIgnore_1= ruleLimitedIgnore | this_CoverageOfReferenced_2= ruleCoverageOfReferenced | this_CoverageByContent_3= ruleCoverageByContent | this_BranchSpecification_4= ruleBranchSpecification ) )
            // InternalCOV.g:372:2: (this_Ignore_0= ruleIgnore | this_LimitedIgnore_1= ruleLimitedIgnore | this_CoverageOfReferenced_2= ruleCoverageOfReferenced | this_CoverageByContent_3= ruleCoverageByContent | this_BranchSpecification_4= ruleBranchSpecification )
            {
            // InternalCOV.g:372:2: (this_Ignore_0= ruleIgnore | this_LimitedIgnore_1= ruleLimitedIgnore | this_CoverageOfReferenced_2= ruleCoverageOfReferenced | this_CoverageByContent_3= ruleCoverageByContent | this_BranchSpecification_4= ruleBranchSpecification )
            int alt7=5;
            switch ( input.LA(1) ) {
            case 20:
                {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==RULE_STRING) ) {
                    switch ( input.LA(3) ) {
                    case 12:
                        {
                        alt7=5;
                        }
                        break;
                    case 21:
                        {
                        alt7=1;
                        }
                        break;
                    case 26:
                        {
                        alt7=2;
                        }
                        break;
                    case 27:
                        {
                        alt7=3;
                        }
                        break;
                    case 28:
                        {
                        alt7=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 7, input);

                        throw nvae;
                    }

                }
                else if ( (LA7_1==RULE_ID) ) {
                    switch ( input.LA(3) ) {
                    case 28:
                        {
                        alt7=4;
                        }
                        break;
                    case 12:
                        {
                        alt7=5;
                        }
                        break;
                    case 21:
                        {
                        alt7=1;
                        }
                        break;
                    case 26:
                        {
                        alt7=2;
                        }
                        break;
                    case 27:
                        {
                        alt7=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 8, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }
                }
                break;
            case 21:
                {
                alt7=1;
                }
                break;
            case 26:
                {
                alt7=2;
                }
                break;
            case 27:
                {
                alt7=3;
                }
                break;
            case 28:
                {
                alt7=4;
                }
                break;
            case 12:
                {
                alt7=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalCOV.g:373:3: this_Ignore_0= ruleIgnore
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
                    // InternalCOV.g:382:3: this_LimitedIgnore_1= ruleLimitedIgnore
                    {

                    			newCompositeNode(grammarAccess.getRuleAccess().getLimitedIgnoreParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_LimitedIgnore_1=ruleLimitedIgnore();

                    state._fsp--;


                    			current = this_LimitedIgnore_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalCOV.g:391:3: this_CoverageOfReferenced_2= ruleCoverageOfReferenced
                    {

                    			newCompositeNode(grammarAccess.getRuleAccess().getCoverageOfReferencedParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_CoverageOfReferenced_2=ruleCoverageOfReferenced();

                    state._fsp--;


                    			current = this_CoverageOfReferenced_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalCOV.g:400:3: this_CoverageByContent_3= ruleCoverageByContent
                    {

                    			newCompositeNode(grammarAccess.getRuleAccess().getCoverageByContentParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_CoverageByContent_3=ruleCoverageByContent();

                    state._fsp--;


                    			current = this_CoverageByContent_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalCOV.g:409:3: this_BranchSpecification_4= ruleBranchSpecification
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
    // InternalCOV.g:421:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // InternalCOV.g:421:48: (iv_ruleEBoolean= ruleEBoolean EOF )
            // InternalCOV.g:422:2: iv_ruleEBoolean= ruleEBoolean EOF
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
    // InternalCOV.g:428:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalCOV.g:434:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalCOV.g:435:2: (kw= 'true' | kw= 'false' )
            {
            // InternalCOV.g:435:2: (kw= 'true' | kw= 'false' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==18) ) {
                alt8=1;
            }
            else if ( (LA8_0==19) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalCOV.g:436:3: kw= 'true'
                    {
                    kw=(Token)match(input,18,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalCOV.g:442:3: kw= 'false'
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
    // InternalCOV.g:451:1: entryRuleIgnore returns [EObject current=null] : iv_ruleIgnore= ruleIgnore EOF ;
    public final EObject entryRuleIgnore() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIgnore = null;


        try {
            // InternalCOV.g:451:47: (iv_ruleIgnore= ruleIgnore EOF )
            // InternalCOV.g:452:2: iv_ruleIgnore= ruleIgnore EOF
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
    // InternalCOV.g:458:1: ruleIgnore returns [EObject current=null] : ( () (otherlv_1= 'when' ( (lv_condition_2_0= ruleCondition ) ) )? otherlv_3= 'ignore' otherlv_4= '(' (otherlv_5= 'subtypes' ( (lv_ignoreSubtypes_6_0= ruleEBoolean ) ) )? otherlv_7= ')' (otherlv_8= 'description' ( (lv_description_9_0= ruleEString ) ) )? ) ;
    public final EObject ruleIgnore() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_condition_2_0 = null;

        AntlrDatatypeRuleToken lv_ignoreSubtypes_6_0 = null;

        AntlrDatatypeRuleToken lv_description_9_0 = null;



        	enterRule();

        try {
            // InternalCOV.g:464:2: ( ( () (otherlv_1= 'when' ( (lv_condition_2_0= ruleCondition ) ) )? otherlv_3= 'ignore' otherlv_4= '(' (otherlv_5= 'subtypes' ( (lv_ignoreSubtypes_6_0= ruleEBoolean ) ) )? otherlv_7= ')' (otherlv_8= 'description' ( (lv_description_9_0= ruleEString ) ) )? ) )
            // InternalCOV.g:465:2: ( () (otherlv_1= 'when' ( (lv_condition_2_0= ruleCondition ) ) )? otherlv_3= 'ignore' otherlv_4= '(' (otherlv_5= 'subtypes' ( (lv_ignoreSubtypes_6_0= ruleEBoolean ) ) )? otherlv_7= ')' (otherlv_8= 'description' ( (lv_description_9_0= ruleEString ) ) )? )
            {
            // InternalCOV.g:465:2: ( () (otherlv_1= 'when' ( (lv_condition_2_0= ruleCondition ) ) )? otherlv_3= 'ignore' otherlv_4= '(' (otherlv_5= 'subtypes' ( (lv_ignoreSubtypes_6_0= ruleEBoolean ) ) )? otherlv_7= ')' (otherlv_8= 'description' ( (lv_description_9_0= ruleEString ) ) )? )
            // InternalCOV.g:466:3: () (otherlv_1= 'when' ( (lv_condition_2_0= ruleCondition ) ) )? otherlv_3= 'ignore' otherlv_4= '(' (otherlv_5= 'subtypes' ( (lv_ignoreSubtypes_6_0= ruleEBoolean ) ) )? otherlv_7= ')' (otherlv_8= 'description' ( (lv_description_9_0= ruleEString ) ) )?
            {
            // InternalCOV.g:466:3: ()
            // InternalCOV.g:467:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIgnoreAccess().getIgnoreAction_0(),
            					current);
            			

            }

            // InternalCOV.g:473:3: (otherlv_1= 'when' ( (lv_condition_2_0= ruleCondition ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==20) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalCOV.g:474:4: otherlv_1= 'when' ( (lv_condition_2_0= ruleCondition ) )
                    {
                    otherlv_1=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getIgnoreAccess().getWhenKeyword_1_0());
                    			
                    // InternalCOV.g:478:4: ( (lv_condition_2_0= ruleCondition ) )
                    // InternalCOV.g:479:5: (lv_condition_2_0= ruleCondition )
                    {
                    // InternalCOV.g:479:5: (lv_condition_2_0= ruleCondition )
                    // InternalCOV.g:480:6: lv_condition_2_0= ruleCondition
                    {

                    						newCompositeNode(grammarAccess.getIgnoreAccess().getConditionConditionParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_condition_2_0=ruleCondition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIgnoreRule());
                    						}
                    						set(
                    							current,
                    							"condition",
                    							lv_condition_2_0,
                    							"coverage.dsl.xtext.COV.Condition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,21,FOLLOW_14); 

            			newLeafNode(otherlv_3, grammarAccess.getIgnoreAccess().getIgnoreKeyword_2());
            		
            otherlv_4=(Token)match(input,22,FOLLOW_15); 

            			newLeafNode(otherlv_4, grammarAccess.getIgnoreAccess().getLeftParenthesisKeyword_3());
            		
            // InternalCOV.g:506:3: (otherlv_5= 'subtypes' ( (lv_ignoreSubtypes_6_0= ruleEBoolean ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==23) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalCOV.g:507:4: otherlv_5= 'subtypes' ( (lv_ignoreSubtypes_6_0= ruleEBoolean ) )
                    {
                    otherlv_5=(Token)match(input,23,FOLLOW_16); 

                    				newLeafNode(otherlv_5, grammarAccess.getIgnoreAccess().getSubtypesKeyword_4_0());
                    			
                    // InternalCOV.g:511:4: ( (lv_ignoreSubtypes_6_0= ruleEBoolean ) )
                    // InternalCOV.g:512:5: (lv_ignoreSubtypes_6_0= ruleEBoolean )
                    {
                    // InternalCOV.g:512:5: (lv_ignoreSubtypes_6_0= ruleEBoolean )
                    // InternalCOV.g:513:6: lv_ignoreSubtypes_6_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getIgnoreAccess().getIgnoreSubtypesEBooleanParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_ignoreSubtypes_6_0=ruleEBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIgnoreRule());
                    						}
                    						set(
                    							current,
                    							"ignoreSubtypes",
                    							lv_ignoreSubtypes_6_0,
                    							"coverage.dsl.xtext.COV.EBoolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,24,FOLLOW_18); 

            			newLeafNode(otherlv_7, grammarAccess.getIgnoreAccess().getRightParenthesisKeyword_5());
            		
            // InternalCOV.g:535:3: (otherlv_8= 'description' ( (lv_description_9_0= ruleEString ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==25) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalCOV.g:536:4: otherlv_8= 'description' ( (lv_description_9_0= ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,25,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getIgnoreAccess().getDescriptionKeyword_6_0());
                    			
                    // InternalCOV.g:540:4: ( (lv_description_9_0= ruleEString ) )
                    // InternalCOV.g:541:5: (lv_description_9_0= ruleEString )
                    {
                    // InternalCOV.g:541:5: (lv_description_9_0= ruleEString )
                    // InternalCOV.g:542:6: lv_description_9_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getIgnoreAccess().getDescriptionEStringParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_description_9_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIgnoreRule());
                    						}
                    						set(
                    							current,
                    							"description",
                    							lv_description_9_0,
                    							"coverage.dsl.xtext.COV.EString");
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
    // InternalCOV.g:564:1: entryRuleLimitedIgnore returns [EObject current=null] : iv_ruleLimitedIgnore= ruleLimitedIgnore EOF ;
    public final EObject entryRuleLimitedIgnore() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLimitedIgnore = null;


        try {
            // InternalCOV.g:564:54: (iv_ruleLimitedIgnore= ruleLimitedIgnore EOF )
            // InternalCOV.g:565:2: iv_ruleLimitedIgnore= ruleLimitedIgnore EOF
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
    // InternalCOV.g:571:1: ruleLimitedIgnore returns [EObject current=null] : ( () (otherlv_1= 'when' ( (lv_condition_2_0= ruleCondition ) ) )? otherlv_3= 'ignoreif' ( (lv_type_4_0= ruleLimitationType ) ) ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* (otherlv_8= 'description' ( (lv_description_9_0= ruleEString ) ) )? ) ;
    public final EObject ruleLimitedIgnore() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_condition_2_0 = null;

        Enumerator lv_type_4_0 = null;

        AntlrDatatypeRuleToken lv_description_9_0 = null;



        	enterRule();

        try {
            // InternalCOV.g:577:2: ( ( () (otherlv_1= 'when' ( (lv_condition_2_0= ruleCondition ) ) )? otherlv_3= 'ignoreif' ( (lv_type_4_0= ruleLimitationType ) ) ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* (otherlv_8= 'description' ( (lv_description_9_0= ruleEString ) ) )? ) )
            // InternalCOV.g:578:2: ( () (otherlv_1= 'when' ( (lv_condition_2_0= ruleCondition ) ) )? otherlv_3= 'ignoreif' ( (lv_type_4_0= ruleLimitationType ) ) ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* (otherlv_8= 'description' ( (lv_description_9_0= ruleEString ) ) )? )
            {
            // InternalCOV.g:578:2: ( () (otherlv_1= 'when' ( (lv_condition_2_0= ruleCondition ) ) )? otherlv_3= 'ignoreif' ( (lv_type_4_0= ruleLimitationType ) ) ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* (otherlv_8= 'description' ( (lv_description_9_0= ruleEString ) ) )? )
            // InternalCOV.g:579:3: () (otherlv_1= 'when' ( (lv_condition_2_0= ruleCondition ) ) )? otherlv_3= 'ignoreif' ( (lv_type_4_0= ruleLimitationType ) ) ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* (otherlv_8= 'description' ( (lv_description_9_0= ruleEString ) ) )?
            {
            // InternalCOV.g:579:3: ()
            // InternalCOV.g:580:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLimitedIgnoreAccess().getLimitedIgnoreAction_0(),
            					current);
            			

            }

            // InternalCOV.g:586:3: (otherlv_1= 'when' ( (lv_condition_2_0= ruleCondition ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==20) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalCOV.g:587:4: otherlv_1= 'when' ( (lv_condition_2_0= ruleCondition ) )
                    {
                    otherlv_1=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getLimitedIgnoreAccess().getWhenKeyword_1_0());
                    			
                    // InternalCOV.g:591:4: ( (lv_condition_2_0= ruleCondition ) )
                    // InternalCOV.g:592:5: (lv_condition_2_0= ruleCondition )
                    {
                    // InternalCOV.g:592:5: (lv_condition_2_0= ruleCondition )
                    // InternalCOV.g:593:6: lv_condition_2_0= ruleCondition
                    {

                    						newCompositeNode(grammarAccess.getLimitedIgnoreAccess().getConditionConditionParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_19);
                    lv_condition_2_0=ruleCondition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLimitedIgnoreRule());
                    						}
                    						set(
                    							current,
                    							"condition",
                    							lv_condition_2_0,
                    							"coverage.dsl.xtext.COV.Condition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,26,FOLLOW_20); 

            			newLeafNode(otherlv_3, grammarAccess.getLimitedIgnoreAccess().getIgnoreifKeyword_2());
            		
            // InternalCOV.g:615:3: ( (lv_type_4_0= ruleLimitationType ) )
            // InternalCOV.g:616:4: (lv_type_4_0= ruleLimitationType )
            {
            // InternalCOV.g:616:4: (lv_type_4_0= ruleLimitationType )
            // InternalCOV.g:617:5: lv_type_4_0= ruleLimitationType
            {

            					newCompositeNode(grammarAccess.getLimitedIgnoreAccess().getTypeLimitationTypeEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_3);
            lv_type_4_0=ruleLimitationType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLimitedIgnoreRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_4_0,
            						"coverage.dsl.xtext.COV.LimitationType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCOV.g:634:3: ( ( ruleEString ) )
            // InternalCOV.g:635:4: ( ruleEString )
            {
            // InternalCOV.g:635:4: ( ruleEString )
            // InternalCOV.g:636:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLimitedIgnoreRule());
            					}
            				

            					newCompositeNode(grammarAccess.getLimitedIgnoreAccess().getContainerMetaclassEClassCrossReference_4_0());
            				
            pushFollow(FOLLOW_21);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCOV.g:650:3: (otherlv_6= ',' ( ( ruleEString ) ) )*
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
            	    // InternalCOV.g:651:4: otherlv_6= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_6=(Token)match(input,15,FOLLOW_3); 

            	    				newLeafNode(otherlv_6, grammarAccess.getLimitedIgnoreAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalCOV.g:655:4: ( ( ruleEString ) )
            	    // InternalCOV.g:656:5: ( ruleEString )
            	    {
            	    // InternalCOV.g:656:5: ( ruleEString )
            	    // InternalCOV.g:657:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getLimitedIgnoreRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getLimitedIgnoreAccess().getContainerMetaclassEClassCrossReference_5_1_0());
            	    					
            	    pushFollow(FOLLOW_21);
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

            // InternalCOV.g:672:3: (otherlv_8= 'description' ( (lv_description_9_0= ruleEString ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==25) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalCOV.g:673:4: otherlv_8= 'description' ( (lv_description_9_0= ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,25,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getLimitedIgnoreAccess().getDescriptionKeyword_6_0());
                    			
                    // InternalCOV.g:677:4: ( (lv_description_9_0= ruleEString ) )
                    // InternalCOV.g:678:5: (lv_description_9_0= ruleEString )
                    {
                    // InternalCOV.g:678:5: (lv_description_9_0= ruleEString )
                    // InternalCOV.g:679:6: lv_description_9_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getLimitedIgnoreAccess().getDescriptionEStringParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_description_9_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLimitedIgnoreRule());
                    						}
                    						set(
                    							current,
                    							"description",
                    							lv_description_9_0,
                    							"coverage.dsl.xtext.COV.EString");
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
    // InternalCOV.g:701:1: entryRuleCoverageOfReferenced returns [EObject current=null] : iv_ruleCoverageOfReferenced= ruleCoverageOfReferenced EOF ;
    public final EObject entryRuleCoverageOfReferenced() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCoverageOfReferenced = null;


        try {
            // InternalCOV.g:701:61: (iv_ruleCoverageOfReferenced= ruleCoverageOfReferenced EOF )
            // InternalCOV.g:702:2: iv_ruleCoverageOfReferenced= ruleCoverageOfReferenced EOF
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
    // InternalCOV.g:708:1: ruleCoverageOfReferenced returns [EObject current=null] : ( () (otherlv_1= 'when' ( (lv_condition_2_0= ruleCondition ) ) )? otherlv_3= 'covers' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* (otherlv_7= 'description' ( (lv_description_8_0= ruleEString ) ) )? ) ;
    public final EObject ruleCoverageOfReferenced() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_condition_2_0 = null;

        AntlrDatatypeRuleToken lv_description_8_0 = null;



        	enterRule();

        try {
            // InternalCOV.g:714:2: ( ( () (otherlv_1= 'when' ( (lv_condition_2_0= ruleCondition ) ) )? otherlv_3= 'covers' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* (otherlv_7= 'description' ( (lv_description_8_0= ruleEString ) ) )? ) )
            // InternalCOV.g:715:2: ( () (otherlv_1= 'when' ( (lv_condition_2_0= ruleCondition ) ) )? otherlv_3= 'covers' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* (otherlv_7= 'description' ( (lv_description_8_0= ruleEString ) ) )? )
            {
            // InternalCOV.g:715:2: ( () (otherlv_1= 'when' ( (lv_condition_2_0= ruleCondition ) ) )? otherlv_3= 'covers' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* (otherlv_7= 'description' ( (lv_description_8_0= ruleEString ) ) )? )
            // InternalCOV.g:716:3: () (otherlv_1= 'when' ( (lv_condition_2_0= ruleCondition ) ) )? otherlv_3= 'covers' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* (otherlv_7= 'description' ( (lv_description_8_0= ruleEString ) ) )?
            {
            // InternalCOV.g:716:3: ()
            // InternalCOV.g:717:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCoverageOfReferencedAccess().getCoverageOfReferencedAction_0(),
            					current);
            			

            }

            // InternalCOV.g:723:3: (otherlv_1= 'when' ( (lv_condition_2_0= ruleCondition ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==20) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalCOV.g:724:4: otherlv_1= 'when' ( (lv_condition_2_0= ruleCondition ) )
                    {
                    otherlv_1=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getCoverageOfReferencedAccess().getWhenKeyword_1_0());
                    			
                    // InternalCOV.g:728:4: ( (lv_condition_2_0= ruleCondition ) )
                    // InternalCOV.g:729:5: (lv_condition_2_0= ruleCondition )
                    {
                    // InternalCOV.g:729:5: (lv_condition_2_0= ruleCondition )
                    // InternalCOV.g:730:6: lv_condition_2_0= ruleCondition
                    {

                    						newCompositeNode(grammarAccess.getCoverageOfReferencedAccess().getConditionConditionParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_22);
                    lv_condition_2_0=ruleCondition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCoverageOfReferencedRule());
                    						}
                    						set(
                    							current,
                    							"condition",
                    							lv_condition_2_0,
                    							"coverage.dsl.xtext.COV.Condition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getCoverageOfReferencedAccess().getCoversKeyword_2());
            		
            // InternalCOV.g:752:3: ( ( ruleEString ) )
            // InternalCOV.g:753:4: ( ruleEString )
            {
            // InternalCOV.g:753:4: ( ruleEString )
            // InternalCOV.g:754:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCoverageOfReferencedRule());
            					}
            				

            					newCompositeNode(grammarAccess.getCoverageOfReferencedAccess().getReferenceEReferenceCrossReference_3_0());
            				
            pushFollow(FOLLOW_21);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCOV.g:768:3: (otherlv_5= ',' ( ( ruleEString ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==15) ) {
                    int LA16_2 = input.LA(2);

                    if ( ((LA16_2>=RULE_STRING && LA16_2<=RULE_ID)) ) {
                        alt16=1;
                    }


                }


                switch (alt16) {
            	case 1 :
            	    // InternalCOV.g:769:4: otherlv_5= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_5=(Token)match(input,15,FOLLOW_3); 

            	    				newLeafNode(otherlv_5, grammarAccess.getCoverageOfReferencedAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalCOV.g:773:4: ( ( ruleEString ) )
            	    // InternalCOV.g:774:5: ( ruleEString )
            	    {
            	    // InternalCOV.g:774:5: ( ruleEString )
            	    // InternalCOV.g:775:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getCoverageOfReferencedRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getCoverageOfReferencedAccess().getReferenceEReferenceCrossReference_4_1_0());
            	    					
            	    pushFollow(FOLLOW_21);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            // InternalCOV.g:790:3: (otherlv_7= 'description' ( (lv_description_8_0= ruleEString ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==25) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalCOV.g:791:4: otherlv_7= 'description' ( (lv_description_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,25,FOLLOW_3); 

                    				newLeafNode(otherlv_7, grammarAccess.getCoverageOfReferencedAccess().getDescriptionKeyword_5_0());
                    			
                    // InternalCOV.g:795:4: ( (lv_description_8_0= ruleEString ) )
                    // InternalCOV.g:796:5: (lv_description_8_0= ruleEString )
                    {
                    // InternalCOV.g:796:5: (lv_description_8_0= ruleEString )
                    // InternalCOV.g:797:6: lv_description_8_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getCoverageOfReferencedAccess().getDescriptionEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_description_8_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCoverageOfReferencedRule());
                    						}
                    						set(
                    							current,
                    							"description",
                    							lv_description_8_0,
                    							"coverage.dsl.xtext.COV.EString");
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
    // InternalCOV.g:819:1: entryRuleCoverageByContent returns [EObject current=null] : iv_ruleCoverageByContent= ruleCoverageByContent EOF ;
    public final EObject entryRuleCoverageByContent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCoverageByContent = null;


        try {
            // InternalCOV.g:819:58: (iv_ruleCoverageByContent= ruleCoverageByContent EOF )
            // InternalCOV.g:820:2: iv_ruleCoverageByContent= ruleCoverageByContent EOF
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
    // InternalCOV.g:826:1: ruleCoverageByContent returns [EObject current=null] : ( () (otherlv_1= 'when' ( (lv_condition_2_0= ruleCondition ) ) )? otherlv_3= 'covered' otherlv_4= 'when' ( (lv_multiplicity_5_0= ruleCoveredContents ) ) ( ( ruleEString ) ) otherlv_7= 'iscovered' (otherlv_8= 'description' ( (lv_description_9_0= ruleEString ) ) )? ) ;
    public final EObject ruleCoverageByContent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_condition_2_0 = null;

        Enumerator lv_multiplicity_5_0 = null;

        AntlrDatatypeRuleToken lv_description_9_0 = null;



        	enterRule();

        try {
            // InternalCOV.g:832:2: ( ( () (otherlv_1= 'when' ( (lv_condition_2_0= ruleCondition ) ) )? otherlv_3= 'covered' otherlv_4= 'when' ( (lv_multiplicity_5_0= ruleCoveredContents ) ) ( ( ruleEString ) ) otherlv_7= 'iscovered' (otherlv_8= 'description' ( (lv_description_9_0= ruleEString ) ) )? ) )
            // InternalCOV.g:833:2: ( () (otherlv_1= 'when' ( (lv_condition_2_0= ruleCondition ) ) )? otherlv_3= 'covered' otherlv_4= 'when' ( (lv_multiplicity_5_0= ruleCoveredContents ) ) ( ( ruleEString ) ) otherlv_7= 'iscovered' (otherlv_8= 'description' ( (lv_description_9_0= ruleEString ) ) )? )
            {
            // InternalCOV.g:833:2: ( () (otherlv_1= 'when' ( (lv_condition_2_0= ruleCondition ) ) )? otherlv_3= 'covered' otherlv_4= 'when' ( (lv_multiplicity_5_0= ruleCoveredContents ) ) ( ( ruleEString ) ) otherlv_7= 'iscovered' (otherlv_8= 'description' ( (lv_description_9_0= ruleEString ) ) )? )
            // InternalCOV.g:834:3: () (otherlv_1= 'when' ( (lv_condition_2_0= ruleCondition ) ) )? otherlv_3= 'covered' otherlv_4= 'when' ( (lv_multiplicity_5_0= ruleCoveredContents ) ) ( ( ruleEString ) ) otherlv_7= 'iscovered' (otherlv_8= 'description' ( (lv_description_9_0= ruleEString ) ) )?
            {
            // InternalCOV.g:834:3: ()
            // InternalCOV.g:835:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCoverageByContentAccess().getCoverageByContentAction_0(),
            					current);
            			

            }

            // InternalCOV.g:841:3: (otherlv_1= 'when' ( (lv_condition_2_0= ruleCondition ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==20) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalCOV.g:842:4: otherlv_1= 'when' ( (lv_condition_2_0= ruleCondition ) )
                    {
                    otherlv_1=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getCoverageByContentAccess().getWhenKeyword_1_0());
                    			
                    // InternalCOV.g:846:4: ( (lv_condition_2_0= ruleCondition ) )
                    // InternalCOV.g:847:5: (lv_condition_2_0= ruleCondition )
                    {
                    // InternalCOV.g:847:5: (lv_condition_2_0= ruleCondition )
                    // InternalCOV.g:848:6: lv_condition_2_0= ruleCondition
                    {

                    						newCompositeNode(grammarAccess.getCoverageByContentAccess().getConditionConditionParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_condition_2_0=ruleCondition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCoverageByContentRule());
                    						}
                    						set(
                    							current,
                    							"condition",
                    							lv_condition_2_0,
                    							"coverage.dsl.xtext.COV.Condition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,28,FOLLOW_24); 

            			newLeafNode(otherlv_3, grammarAccess.getCoverageByContentAccess().getCoveredKeyword_2());
            		
            otherlv_4=(Token)match(input,20,FOLLOW_25); 

            			newLeafNode(otherlv_4, grammarAccess.getCoverageByContentAccess().getWhenKeyword_3());
            		
            // InternalCOV.g:874:3: ( (lv_multiplicity_5_0= ruleCoveredContents ) )
            // InternalCOV.g:875:4: (lv_multiplicity_5_0= ruleCoveredContents )
            {
            // InternalCOV.g:875:4: (lv_multiplicity_5_0= ruleCoveredContents )
            // InternalCOV.g:876:5: lv_multiplicity_5_0= ruleCoveredContents
            {

            					newCompositeNode(grammarAccess.getCoverageByContentAccess().getMultiplicityCoveredContentsEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_3);
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

            // InternalCOV.g:893:3: ( ( ruleEString ) )
            // InternalCOV.g:894:4: ( ruleEString )
            {
            // InternalCOV.g:894:4: ( ruleEString )
            // InternalCOV.g:895:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCoverageByContentRule());
            					}
            				

            					newCompositeNode(grammarAccess.getCoverageByContentAccess().getContainmentReferenceEReferenceCrossReference_5_0());
            				
            pushFollow(FOLLOW_26);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,29,FOLLOW_18); 

            			newLeafNode(otherlv_7, grammarAccess.getCoverageByContentAccess().getIscoveredKeyword_6());
            		
            // InternalCOV.g:913:3: (otherlv_8= 'description' ( (lv_description_9_0= ruleEString ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==25) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalCOV.g:914:4: otherlv_8= 'description' ( (lv_description_9_0= ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,25,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getCoverageByContentAccess().getDescriptionKeyword_7_0());
                    			
                    // InternalCOV.g:918:4: ( (lv_description_9_0= ruleEString ) )
                    // InternalCOV.g:919:5: (lv_description_9_0= ruleEString )
                    {
                    // InternalCOV.g:919:5: (lv_description_9_0= ruleEString )
                    // InternalCOV.g:920:6: lv_description_9_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getCoverageByContentAccess().getDescriptionEStringParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_description_9_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCoverageByContentRule());
                    						}
                    						set(
                    							current,
                    							"description",
                    							lv_description_9_0,
                    							"coverage.dsl.xtext.COV.EString");
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
    // InternalCOV.g:942:1: entryRuleBranchSpecification returns [EObject current=null] : iv_ruleBranchSpecification= ruleBranchSpecification EOF ;
    public final EObject entryRuleBranchSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBranchSpecification = null;


        try {
            // InternalCOV.g:942:60: (iv_ruleBranchSpecification= ruleBranchSpecification EOF )
            // InternalCOV.g:943:2: iv_ruleBranchSpecification= ruleBranchSpecification EOF
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
    // InternalCOV.g:949:1: ruleBranchSpecification returns [EObject current=null] : ( () (otherlv_1= 'when' ( (lv_condition_2_0= ruleCondition ) ) )? otherlv_3= '{' ( (lv_branches_4_0= ruleBranch ) ) (otherlv_5= ',' ( (lv_branches_6_0= ruleBranch ) ) )* (otherlv_7= 'description' ( (lv_description_8_0= ruleEString ) ) )? otherlv_9= '}' ) ;
    public final EObject ruleBranchSpecification() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_condition_2_0 = null;

        EObject lv_branches_4_0 = null;

        EObject lv_branches_6_0 = null;

        AntlrDatatypeRuleToken lv_description_8_0 = null;



        	enterRule();

        try {
            // InternalCOV.g:955:2: ( ( () (otherlv_1= 'when' ( (lv_condition_2_0= ruleCondition ) ) )? otherlv_3= '{' ( (lv_branches_4_0= ruleBranch ) ) (otherlv_5= ',' ( (lv_branches_6_0= ruleBranch ) ) )* (otherlv_7= 'description' ( (lv_description_8_0= ruleEString ) ) )? otherlv_9= '}' ) )
            // InternalCOV.g:956:2: ( () (otherlv_1= 'when' ( (lv_condition_2_0= ruleCondition ) ) )? otherlv_3= '{' ( (lv_branches_4_0= ruleBranch ) ) (otherlv_5= ',' ( (lv_branches_6_0= ruleBranch ) ) )* (otherlv_7= 'description' ( (lv_description_8_0= ruleEString ) ) )? otherlv_9= '}' )
            {
            // InternalCOV.g:956:2: ( () (otherlv_1= 'when' ( (lv_condition_2_0= ruleCondition ) ) )? otherlv_3= '{' ( (lv_branches_4_0= ruleBranch ) ) (otherlv_5= ',' ( (lv_branches_6_0= ruleBranch ) ) )* (otherlv_7= 'description' ( (lv_description_8_0= ruleEString ) ) )? otherlv_9= '}' )
            // InternalCOV.g:957:3: () (otherlv_1= 'when' ( (lv_condition_2_0= ruleCondition ) ) )? otherlv_3= '{' ( (lv_branches_4_0= ruleBranch ) ) (otherlv_5= ',' ( (lv_branches_6_0= ruleBranch ) ) )* (otherlv_7= 'description' ( (lv_description_8_0= ruleEString ) ) )? otherlv_9= '}'
            {
            // InternalCOV.g:957:3: ()
            // InternalCOV.g:958:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBranchSpecificationAccess().getBranchSpecificationAction_0(),
            					current);
            			

            }

            // InternalCOV.g:964:3: (otherlv_1= 'when' ( (lv_condition_2_0= ruleCondition ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==20) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalCOV.g:965:4: otherlv_1= 'when' ( (lv_condition_2_0= ruleCondition ) )
                    {
                    otherlv_1=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getBranchSpecificationAccess().getWhenKeyword_1_0());
                    			
                    // InternalCOV.g:969:4: ( (lv_condition_2_0= ruleCondition ) )
                    // InternalCOV.g:970:5: (lv_condition_2_0= ruleCondition )
                    {
                    // InternalCOV.g:970:5: (lv_condition_2_0= ruleCondition )
                    // InternalCOV.g:971:6: lv_condition_2_0= ruleCondition
                    {

                    						newCompositeNode(grammarAccess.getBranchSpecificationAccess().getConditionConditionParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_4);
                    lv_condition_2_0=ruleCondition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBranchSpecificationRule());
                    						}
                    						set(
                    							current,
                    							"condition",
                    							lv_condition_2_0,
                    							"coverage.dsl.xtext.COV.Condition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,12,FOLLOW_27); 

            			newLeafNode(otherlv_3, grammarAccess.getBranchSpecificationAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalCOV.g:993:3: ( (lv_branches_4_0= ruleBranch ) )
            // InternalCOV.g:994:4: (lv_branches_4_0= ruleBranch )
            {
            // InternalCOV.g:994:4: (lv_branches_4_0= ruleBranch )
            // InternalCOV.g:995:5: lv_branches_4_0= ruleBranch
            {

            					newCompositeNode(grammarAccess.getBranchSpecificationAccess().getBranchesBranchParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_28);
            lv_branches_4_0=ruleBranch();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBranchSpecificationRule());
            					}
            					add(
            						current,
            						"branches",
            						lv_branches_4_0,
            						"coverage.dsl.xtext.COV.Branch");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCOV.g:1012:3: (otherlv_5= ',' ( (lv_branches_6_0= ruleBranch ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==15) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalCOV.g:1013:4: otherlv_5= ',' ( (lv_branches_6_0= ruleBranch ) )
            	    {
            	    otherlv_5=(Token)match(input,15,FOLLOW_27); 

            	    				newLeafNode(otherlv_5, grammarAccess.getBranchSpecificationAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalCOV.g:1017:4: ( (lv_branches_6_0= ruleBranch ) )
            	    // InternalCOV.g:1018:5: (lv_branches_6_0= ruleBranch )
            	    {
            	    // InternalCOV.g:1018:5: (lv_branches_6_0= ruleBranch )
            	    // InternalCOV.g:1019:6: lv_branches_6_0= ruleBranch
            	    {

            	    						newCompositeNode(grammarAccess.getBranchSpecificationAccess().getBranchesBranchParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_28);
            	    lv_branches_6_0=ruleBranch();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getBranchSpecificationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"branches",
            	    							lv_branches_6_0,
            	    							"coverage.dsl.xtext.COV.Branch");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            // InternalCOV.g:1037:3: (otherlv_7= 'description' ( (lv_description_8_0= ruleEString ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==25) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalCOV.g:1038:4: otherlv_7= 'description' ( (lv_description_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,25,FOLLOW_3); 

                    				newLeafNode(otherlv_7, grammarAccess.getBranchSpecificationAccess().getDescriptionKeyword_5_0());
                    			
                    // InternalCOV.g:1042:4: ( (lv_description_8_0= ruleEString ) )
                    // InternalCOV.g:1043:5: (lv_description_8_0= ruleEString )
                    {
                    // InternalCOV.g:1043:5: (lv_description_8_0= ruleEString )
                    // InternalCOV.g:1044:6: lv_description_8_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getBranchSpecificationAccess().getDescriptionEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_29);
                    lv_description_8_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBranchSpecificationRule());
                    						}
                    						set(
                    							current,
                    							"description",
                    							lv_description_8_0,
                    							"coverage.dsl.xtext.COV.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getBranchSpecificationAccess().getRightCurlyBracketKeyword_6());
            		

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
    // InternalCOV.g:1070:1: entryRuleBranch returns [EObject current=null] : iv_ruleBranch= ruleBranch EOF ;
    public final EObject entryRuleBranch() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBranch = null;


        try {
            // InternalCOV.g:1070:47: (iv_ruleBranch= ruleBranch EOF )
            // InternalCOV.g:1071:2: iv_ruleBranch= ruleBranch EOF
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
    // InternalCOV.g:1077:1: ruleBranch returns [EObject current=null] : (this_ExplicitBranch_0= ruleExplicitBranch | this_ImplicitBranch_1= ruleImplicitBranch ) ;
    public final EObject ruleBranch() throws RecognitionException {
        EObject current = null;

        EObject this_ExplicitBranch_0 = null;

        EObject this_ImplicitBranch_1 = null;



        	enterRule();

        try {
            // InternalCOV.g:1083:2: ( (this_ExplicitBranch_0= ruleExplicitBranch | this_ImplicitBranch_1= ruleImplicitBranch ) )
            // InternalCOV.g:1084:2: (this_ExplicitBranch_0= ruleExplicitBranch | this_ImplicitBranch_1= ruleImplicitBranch )
            {
            // InternalCOV.g:1084:2: (this_ExplicitBranch_0= ruleExplicitBranch | this_ImplicitBranch_1= ruleImplicitBranch )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==30) ) {
                int LA23_1 = input.LA(2);

                if ( (LA23_1==31) ) {
                    alt23=2;
                }
                else if ( ((LA23_1>=RULE_STRING && LA23_1<=RULE_ID)) ) {
                    alt23=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 23, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalCOV.g:1085:3: this_ExplicitBranch_0= ruleExplicitBranch
                    {

                    			newCompositeNode(grammarAccess.getBranchAccess().getExplicitBranchParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExplicitBranch_0=ruleExplicitBranch();

                    state._fsp--;


                    			current = this_ExplicitBranch_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalCOV.g:1094:3: this_ImplicitBranch_1= ruleImplicitBranch
                    {

                    			newCompositeNode(grammarAccess.getBranchAccess().getImplicitBranchParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ImplicitBranch_1=ruleImplicitBranch();

                    state._fsp--;


                    			current = this_ImplicitBranch_1;
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
    // $ANTLR end "ruleBranch"


    // $ANTLR start "entryRuleExplicitBranch"
    // InternalCOV.g:1106:1: entryRuleExplicitBranch returns [EObject current=null] : iv_ruleExplicitBranch= ruleExplicitBranch EOF ;
    public final EObject entryRuleExplicitBranch() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExplicitBranch = null;


        try {
            // InternalCOV.g:1106:55: (iv_ruleExplicitBranch= ruleExplicitBranch EOF )
            // InternalCOV.g:1107:2: iv_ruleExplicitBranch= ruleExplicitBranch EOF
            {
             newCompositeNode(grammarAccess.getExplicitBranchRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExplicitBranch=ruleExplicitBranch();

            state._fsp--;

             current =iv_ruleExplicitBranch; 
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
    // $ANTLR end "entryRuleExplicitBranch"


    // $ANTLR start "ruleExplicitBranch"
    // InternalCOV.g:1113:1: ruleExplicitBranch returns [EObject current=null] : (otherlv_0= 'branch' ( (lv_OCLQuery_1_0= ruleEString ) ) ) ;
    public final EObject ruleExplicitBranch() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_OCLQuery_1_0 = null;



        	enterRule();

        try {
            // InternalCOV.g:1119:2: ( (otherlv_0= 'branch' ( (lv_OCLQuery_1_0= ruleEString ) ) ) )
            // InternalCOV.g:1120:2: (otherlv_0= 'branch' ( (lv_OCLQuery_1_0= ruleEString ) ) )
            {
            // InternalCOV.g:1120:2: (otherlv_0= 'branch' ( (lv_OCLQuery_1_0= ruleEString ) ) )
            // InternalCOV.g:1121:3: otherlv_0= 'branch' ( (lv_OCLQuery_1_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getExplicitBranchAccess().getBranchKeyword_0());
            		
            // InternalCOV.g:1125:3: ( (lv_OCLQuery_1_0= ruleEString ) )
            // InternalCOV.g:1126:4: (lv_OCLQuery_1_0= ruleEString )
            {
            // InternalCOV.g:1126:4: (lv_OCLQuery_1_0= ruleEString )
            // InternalCOV.g:1127:5: lv_OCLQuery_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getExplicitBranchAccess().getOCLQueryEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_OCLQuery_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExplicitBranchRule());
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
    // $ANTLR end "ruleExplicitBranch"


    // $ANTLR start "entryRuleImplicitBranch"
    // InternalCOV.g:1148:1: entryRuleImplicitBranch returns [EObject current=null] : iv_ruleImplicitBranch= ruleImplicitBranch EOF ;
    public final EObject entryRuleImplicitBranch() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplicitBranch = null;


        try {
            // InternalCOV.g:1148:55: (iv_ruleImplicitBranch= ruleImplicitBranch EOF )
            // InternalCOV.g:1149:2: iv_ruleImplicitBranch= ruleImplicitBranch EOF
            {
             newCompositeNode(grammarAccess.getImplicitBranchRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImplicitBranch=ruleImplicitBranch();

            state._fsp--;

             current =iv_ruleImplicitBranch; 
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
    // $ANTLR end "entryRuleImplicitBranch"


    // $ANTLR start "ruleImplicitBranch"
    // InternalCOV.g:1155:1: ruleImplicitBranch returns [EObject current=null] : ( () otherlv_1= 'branch' otherlv_2= 'else' ) ;
    public final EObject ruleImplicitBranch() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalCOV.g:1161:2: ( ( () otherlv_1= 'branch' otherlv_2= 'else' ) )
            // InternalCOV.g:1162:2: ( () otherlv_1= 'branch' otherlv_2= 'else' )
            {
            // InternalCOV.g:1162:2: ( () otherlv_1= 'branch' otherlv_2= 'else' )
            // InternalCOV.g:1163:3: () otherlv_1= 'branch' otherlv_2= 'else'
            {
            // InternalCOV.g:1163:3: ()
            // InternalCOV.g:1164:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getImplicitBranchAccess().getImplicitBranchAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,30,FOLLOW_30); 

            			newLeafNode(otherlv_1, grammarAccess.getImplicitBranchAccess().getBranchKeyword_1());
            		
            otherlv_2=(Token)match(input,31,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getImplicitBranchAccess().getElseKeyword_2());
            		

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
    // $ANTLR end "ruleImplicitBranch"


    // $ANTLR start "entryRuleCondition"
    // InternalCOV.g:1182:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalCOV.g:1182:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalCOV.g:1183:2: iv_ruleCondition= ruleCondition EOF
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
    // InternalCOV.g:1189:1: ruleCondition returns [EObject current=null] : ( (lv_OCLConstraint_0_0= ruleEString ) ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_OCLConstraint_0_0 = null;



        	enterRule();

        try {
            // InternalCOV.g:1195:2: ( ( (lv_OCLConstraint_0_0= ruleEString ) ) )
            // InternalCOV.g:1196:2: ( (lv_OCLConstraint_0_0= ruleEString ) )
            {
            // InternalCOV.g:1196:2: ( (lv_OCLConstraint_0_0= ruleEString ) )
            // InternalCOV.g:1197:3: (lv_OCLConstraint_0_0= ruleEString )
            {
            // InternalCOV.g:1197:3: (lv_OCLConstraint_0_0= ruleEString )
            // InternalCOV.g:1198:4: lv_OCLConstraint_0_0= ruleEString
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
    // InternalCOV.g:1218:1: ruleCoveredContents returns [Enumerator current=null] : ( (enumLiteral_0= 'ALL' ) | (enumLiteral_1= 'ONE' ) ) ;
    public final Enumerator ruleCoveredContents() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalCOV.g:1224:2: ( ( (enumLiteral_0= 'ALL' ) | (enumLiteral_1= 'ONE' ) ) )
            // InternalCOV.g:1225:2: ( (enumLiteral_0= 'ALL' ) | (enumLiteral_1= 'ONE' ) )
            {
            // InternalCOV.g:1225:2: ( (enumLiteral_0= 'ALL' ) | (enumLiteral_1= 'ONE' ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==32) ) {
                alt24=1;
            }
            else if ( (LA24_0==33) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalCOV.g:1226:3: (enumLiteral_0= 'ALL' )
                    {
                    // InternalCOV.g:1226:3: (enumLiteral_0= 'ALL' )
                    // InternalCOV.g:1227:4: enumLiteral_0= 'ALL'
                    {
                    enumLiteral_0=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getCoveredContentsAccess().getALLEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getCoveredContentsAccess().getALLEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalCOV.g:1234:3: (enumLiteral_1= 'ONE' )
                    {
                    // InternalCOV.g:1234:3: (enumLiteral_1= 'ONE' )
                    // InternalCOV.g:1235:4: enumLiteral_1= 'ONE'
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


    // $ANTLR start "ruleLimitationType"
    // InternalCOV.g:1245:1: ruleLimitationType returns [Enumerator current=null] : ( (enumLiteral_0= 'containedBy' ) | (enumLiteral_1= 'notContainedBy' ) ) ;
    public final Enumerator ruleLimitationType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalCOV.g:1251:2: ( ( (enumLiteral_0= 'containedBy' ) | (enumLiteral_1= 'notContainedBy' ) ) )
            // InternalCOV.g:1252:2: ( (enumLiteral_0= 'containedBy' ) | (enumLiteral_1= 'notContainedBy' ) )
            {
            // InternalCOV.g:1252:2: ( (enumLiteral_0= 'containedBy' ) | (enumLiteral_1= 'notContainedBy' ) )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==34) ) {
                alt25=1;
            }
            else if ( (LA25_0==35) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalCOV.g:1253:3: (enumLiteral_0= 'containedBy' )
                    {
                    // InternalCOV.g:1253:3: (enumLiteral_0= 'containedBy' )
                    // InternalCOV.g:1254:4: enumLiteral_0= 'containedBy'
                    {
                    enumLiteral_0=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getLimitationTypeAccess().getContainedByEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getLimitationTypeAccess().getContainedByEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalCOV.g:1261:3: (enumLiteral_1= 'notContainedBy' )
                    {
                    // InternalCOV.g:1261:3: (enumLiteral_1= 'notContainedBy' )
                    // InternalCOV.g:1262:4: enumLiteral_1= 'notContainedBy'
                    {
                    enumLiteral_1=(Token)match(input,35,FOLLOW_2); 

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
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000000000002A000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x000000001C311000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x000000001C301000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000002008002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000002018000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000080000000L});

}