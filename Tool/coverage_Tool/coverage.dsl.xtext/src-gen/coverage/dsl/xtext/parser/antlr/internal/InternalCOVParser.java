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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'ruleset'", "'{'", "'import'", "'metamodel'", "','", "'}'", "'with'", "'from'", "';'", "'::'", "'*'", "'context'", "'true'", "'false'", "'when'", "'ignore'", "'('", "'subtypes'", "')'", "'description'", "'ignoreif'", "'covers'", "'covered'", "'iscovered'", "'branch'", "'else'", "'ALL'", "'ONE'", "'containedBy'", "'notContainedBy'"
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
    // InternalCOV.g:72:1: ruleDomainSpecificCoverage returns [EObject current=null] : (otherlv_0= 'ruleset' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'import' otherlv_4= 'metamodel' ( ( ruleEString ) ) (otherlv_6= 'import' otherlv_7= 'ruleset' ( (lv_imports_8_0= ruleImport ) ) (otherlv_9= ',' ( (lv_imports_10_0= ruleImport ) ) )* )? ( (lv_contexts_11_0= ruleContext ) ) (otherlv_12= ',' ( (lv_contexts_13_0= ruleContext ) ) )* otherlv_14= '}' ) ;
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

        EObject lv_imports_8_0 = null;

        EObject lv_imports_10_0 = null;

        EObject lv_contexts_11_0 = null;

        EObject lv_contexts_13_0 = null;



        	enterRule();

        try {
            // InternalCOV.g:78:2: ( (otherlv_0= 'ruleset' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'import' otherlv_4= 'metamodel' ( ( ruleEString ) ) (otherlv_6= 'import' otherlv_7= 'ruleset' ( (lv_imports_8_0= ruleImport ) ) (otherlv_9= ',' ( (lv_imports_10_0= ruleImport ) ) )* )? ( (lv_contexts_11_0= ruleContext ) ) (otherlv_12= ',' ( (lv_contexts_13_0= ruleContext ) ) )* otherlv_14= '}' ) )
            // InternalCOV.g:79:2: (otherlv_0= 'ruleset' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'import' otherlv_4= 'metamodel' ( ( ruleEString ) ) (otherlv_6= 'import' otherlv_7= 'ruleset' ( (lv_imports_8_0= ruleImport ) ) (otherlv_9= ',' ( (lv_imports_10_0= ruleImport ) ) )* )? ( (lv_contexts_11_0= ruleContext ) ) (otherlv_12= ',' ( (lv_contexts_13_0= ruleContext ) ) )* otherlv_14= '}' )
            {
            // InternalCOV.g:79:2: (otherlv_0= 'ruleset' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'import' otherlv_4= 'metamodel' ( ( ruleEString ) ) (otherlv_6= 'import' otherlv_7= 'ruleset' ( (lv_imports_8_0= ruleImport ) ) (otherlv_9= ',' ( (lv_imports_10_0= ruleImport ) ) )* )? ( (lv_contexts_11_0= ruleContext ) ) (otherlv_12= ',' ( (lv_contexts_13_0= ruleContext ) ) )* otherlv_14= '}' )
            // InternalCOV.g:80:3: otherlv_0= 'ruleset' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'import' otherlv_4= 'metamodel' ( ( ruleEString ) ) (otherlv_6= 'import' otherlv_7= 'ruleset' ( (lv_imports_8_0= ruleImport ) ) (otherlv_9= ',' ( (lv_imports_10_0= ruleImport ) ) )* )? ( (lv_contexts_11_0= ruleContext ) ) (otherlv_12= ',' ( (lv_contexts_13_0= ruleContext ) ) )* otherlv_14= '}'
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

            // InternalCOV.g:131:3: (otherlv_6= 'import' otherlv_7= 'ruleset' ( (lv_imports_8_0= ruleImport ) ) (otherlv_9= ',' ( (lv_imports_10_0= ruleImport ) ) )* )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalCOV.g:132:4: otherlv_6= 'import' otherlv_7= 'ruleset' ( (lv_imports_8_0= ruleImport ) ) (otherlv_9= ',' ( (lv_imports_10_0= ruleImport ) ) )*
                    {
                    otherlv_6=(Token)match(input,13,FOLLOW_8); 

                    				newLeafNode(otherlv_6, grammarAccess.getDomainSpecificCoverageAccess().getImportKeyword_6_0());
                    			
                    otherlv_7=(Token)match(input,11,FOLLOW_9); 

                    				newLeafNode(otherlv_7, grammarAccess.getDomainSpecificCoverageAccess().getRulesetKeyword_6_1());
                    			
                    // InternalCOV.g:140:4: ( (lv_imports_8_0= ruleImport ) )
                    // InternalCOV.g:141:5: (lv_imports_8_0= ruleImport )
                    {
                    // InternalCOV.g:141:5: (lv_imports_8_0= ruleImport )
                    // InternalCOV.g:142:6: lv_imports_8_0= ruleImport
                    {

                    						newCompositeNode(grammarAccess.getDomainSpecificCoverageAccess().getImportsImportParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_imports_8_0=ruleImport();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDomainSpecificCoverageRule());
                    						}
                    						add(
                    							current,
                    							"imports",
                    							lv_imports_8_0,
                    							"coverage.dsl.xtext.COV.Import");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCOV.g:159:4: (otherlv_9= ',' ( (lv_imports_10_0= ruleImport ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==15) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalCOV.g:160:5: otherlv_9= ',' ( (lv_imports_10_0= ruleImport ) )
                    	    {
                    	    otherlv_9=(Token)match(input,15,FOLLOW_9); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getDomainSpecificCoverageAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalCOV.g:164:5: ( (lv_imports_10_0= ruleImport ) )
                    	    // InternalCOV.g:165:6: (lv_imports_10_0= ruleImport )
                    	    {
                    	    // InternalCOV.g:165:6: (lv_imports_10_0= ruleImport )
                    	    // InternalCOV.g:166:7: lv_imports_10_0= ruleImport
                    	    {

                    	    							newCompositeNode(grammarAccess.getDomainSpecificCoverageAccess().getImportsImportParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_imports_10_0=ruleImport();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getDomainSpecificCoverageRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"imports",
                    	    								lv_imports_10_0,
                    	    								"coverage.dsl.xtext.COV.Import");
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

            // InternalCOV.g:185:3: ( (lv_contexts_11_0= ruleContext ) )
            // InternalCOV.g:186:4: (lv_contexts_11_0= ruleContext )
            {
            // InternalCOV.g:186:4: (lv_contexts_11_0= ruleContext )
            // InternalCOV.g:187:5: lv_contexts_11_0= ruleContext
            {

            					newCompositeNode(grammarAccess.getDomainSpecificCoverageAccess().getContextsContextParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_11);
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

            // InternalCOV.g:204:3: (otherlv_12= ',' ( (lv_contexts_13_0= ruleContext ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==15) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalCOV.g:205:4: otherlv_12= ',' ( (lv_contexts_13_0= ruleContext ) )
            	    {
            	    otherlv_12=(Token)match(input,15,FOLLOW_7); 

            	    				newLeafNode(otherlv_12, grammarAccess.getDomainSpecificCoverageAccess().getCommaKeyword_8_0());
            	    			
            	    // InternalCOV.g:209:4: ( (lv_contexts_13_0= ruleContext ) )
            	    // InternalCOV.g:210:5: (lv_contexts_13_0= ruleContext )
            	    {
            	    // InternalCOV.g:210:5: (lv_contexts_13_0= ruleContext )
            	    // InternalCOV.g:211:6: lv_contexts_13_0= ruleContext
            	    {

            	    						newCompositeNode(grammarAccess.getDomainSpecificCoverageAccess().getContextsContextParserRuleCall_8_1_0());
            	    					
            	    pushFollow(FOLLOW_11);
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


    // $ANTLR start "entryRuleImport"
    // InternalCOV.g:237:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalCOV.g:237:47: (iv_ruleImport= ruleImport EOF )
            // InternalCOV.g:238:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
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
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalCOV.g:244:1: ruleImport returns [EObject current=null] : ( ( () (otherlv_1= 'with' ( (lv_importedNamespace_2_0= ruleImportedFQN ) ) (otherlv_3= 'from' ( (lv_importURI_4_0= RULE_STRING ) ) )? otherlv_5= ';' ) ) | (otherlv_6= 'from' ( (lv_importURI_7_0= RULE_STRING ) ) otherlv_8= ';' ) | ( ( ruleEString ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_importURI_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_importURI_7_0=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_importedNamespace_2_0 = null;



        	enterRule();

        try {
            // InternalCOV.g:250:2: ( ( ( () (otherlv_1= 'with' ( (lv_importedNamespace_2_0= ruleImportedFQN ) ) (otherlv_3= 'from' ( (lv_importURI_4_0= RULE_STRING ) ) )? otherlv_5= ';' ) ) | (otherlv_6= 'from' ( (lv_importURI_7_0= RULE_STRING ) ) otherlv_8= ';' ) | ( ( ruleEString ) ) ) )
            // InternalCOV.g:251:2: ( ( () (otherlv_1= 'with' ( (lv_importedNamespace_2_0= ruleImportedFQN ) ) (otherlv_3= 'from' ( (lv_importURI_4_0= RULE_STRING ) ) )? otherlv_5= ';' ) ) | (otherlv_6= 'from' ( (lv_importURI_7_0= RULE_STRING ) ) otherlv_8= ';' ) | ( ( ruleEString ) ) )
            {
            // InternalCOV.g:251:2: ( ( () (otherlv_1= 'with' ( (lv_importedNamespace_2_0= ruleImportedFQN ) ) (otherlv_3= 'from' ( (lv_importURI_4_0= RULE_STRING ) ) )? otherlv_5= ';' ) ) | (otherlv_6= 'from' ( (lv_importURI_7_0= RULE_STRING ) ) otherlv_8= ';' ) | ( ( ruleEString ) ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt5=1;
                }
                break;
            case 18:
                {
                alt5=2;
                }
                break;
            case RULE_STRING:
            case RULE_ID:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalCOV.g:252:3: ( () (otherlv_1= 'with' ( (lv_importedNamespace_2_0= ruleImportedFQN ) ) (otherlv_3= 'from' ( (lv_importURI_4_0= RULE_STRING ) ) )? otherlv_5= ';' ) )
                    {
                    // InternalCOV.g:252:3: ( () (otherlv_1= 'with' ( (lv_importedNamespace_2_0= ruleImportedFQN ) ) (otherlv_3= 'from' ( (lv_importURI_4_0= RULE_STRING ) ) )? otherlv_5= ';' ) )
                    // InternalCOV.g:253:4: () (otherlv_1= 'with' ( (lv_importedNamespace_2_0= ruleImportedFQN ) ) (otherlv_3= 'from' ( (lv_importURI_4_0= RULE_STRING ) ) )? otherlv_5= ';' )
                    {
                    // InternalCOV.g:253:4: ()
                    // InternalCOV.g:254:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getImportAccess().getImportAction_0_0(),
                    						current);
                    				

                    }

                    // InternalCOV.g:260:4: (otherlv_1= 'with' ( (lv_importedNamespace_2_0= ruleImportedFQN ) ) (otherlv_3= 'from' ( (lv_importURI_4_0= RULE_STRING ) ) )? otherlv_5= ';' )
                    // InternalCOV.g:261:5: otherlv_1= 'with' ( (lv_importedNamespace_2_0= ruleImportedFQN ) ) (otherlv_3= 'from' ( (lv_importURI_4_0= RULE_STRING ) ) )? otherlv_5= ';'
                    {
                    otherlv_1=(Token)match(input,17,FOLLOW_12); 

                    					newLeafNode(otherlv_1, grammarAccess.getImportAccess().getWithKeyword_0_1_0());
                    				
                    // InternalCOV.g:265:5: ( (lv_importedNamespace_2_0= ruleImportedFQN ) )
                    // InternalCOV.g:266:6: (lv_importedNamespace_2_0= ruleImportedFQN )
                    {
                    // InternalCOV.g:266:6: (lv_importedNamespace_2_0= ruleImportedFQN )
                    // InternalCOV.g:267:7: lv_importedNamespace_2_0= ruleImportedFQN
                    {

                    							newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceImportedFQNParserRuleCall_0_1_1_0());
                    						
                    pushFollow(FOLLOW_13);
                    lv_importedNamespace_2_0=ruleImportedFQN();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getImportRule());
                    							}
                    							set(
                    								current,
                    								"importedNamespace",
                    								lv_importedNamespace_2_0,
                    								"coverage.dsl.xtext.COV.ImportedFQN");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalCOV.g:284:5: (otherlv_3= 'from' ( (lv_importURI_4_0= RULE_STRING ) ) )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==18) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // InternalCOV.g:285:6: otherlv_3= 'from' ( (lv_importURI_4_0= RULE_STRING ) )
                            {
                            otherlv_3=(Token)match(input,18,FOLLOW_14); 

                            						newLeafNode(otherlv_3, grammarAccess.getImportAccess().getFromKeyword_0_1_2_0());
                            					
                            // InternalCOV.g:289:6: ( (lv_importURI_4_0= RULE_STRING ) )
                            // InternalCOV.g:290:7: (lv_importURI_4_0= RULE_STRING )
                            {
                            // InternalCOV.g:290:7: (lv_importURI_4_0= RULE_STRING )
                            // InternalCOV.g:291:8: lv_importURI_4_0= RULE_STRING
                            {
                            lv_importURI_4_0=(Token)match(input,RULE_STRING,FOLLOW_15); 

                            								newLeafNode(lv_importURI_4_0, grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_0_1_2_1_0());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getImportRule());
                            								}
                            								setWithLastConsumed(
                            									current,
                            									"importURI",
                            									lv_importURI_4_0,
                            									"org.eclipse.xtext.common.Terminals.STRING");
                            							

                            }


                            }


                            }
                            break;

                    }

                    otherlv_5=(Token)match(input,19,FOLLOW_2); 

                    					newLeafNode(otherlv_5, grammarAccess.getImportAccess().getSemicolonKeyword_0_1_3());
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalCOV.g:315:3: (otherlv_6= 'from' ( (lv_importURI_7_0= RULE_STRING ) ) otherlv_8= ';' )
                    {
                    // InternalCOV.g:315:3: (otherlv_6= 'from' ( (lv_importURI_7_0= RULE_STRING ) ) otherlv_8= ';' )
                    // InternalCOV.g:316:4: otherlv_6= 'from' ( (lv_importURI_7_0= RULE_STRING ) ) otherlv_8= ';'
                    {
                    otherlv_6=(Token)match(input,18,FOLLOW_14); 

                    				newLeafNode(otherlv_6, grammarAccess.getImportAccess().getFromKeyword_1_0());
                    			
                    // InternalCOV.g:320:4: ( (lv_importURI_7_0= RULE_STRING ) )
                    // InternalCOV.g:321:5: (lv_importURI_7_0= RULE_STRING )
                    {
                    // InternalCOV.g:321:5: (lv_importURI_7_0= RULE_STRING )
                    // InternalCOV.g:322:6: lv_importURI_7_0= RULE_STRING
                    {
                    lv_importURI_7_0=(Token)match(input,RULE_STRING,FOLLOW_15); 

                    						newLeafNode(lv_importURI_7_0, grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getImportRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"importURI",
                    							lv_importURI_7_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    otherlv_8=(Token)match(input,19,FOLLOW_2); 

                    				newLeafNode(otherlv_8, grammarAccess.getImportAccess().getSemicolonKeyword_1_2());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalCOV.g:344:3: ( ( ruleEString ) )
                    {
                    // InternalCOV.g:344:3: ( ( ruleEString ) )
                    // InternalCOV.g:345:4: ( ruleEString )
                    {
                    // InternalCOV.g:345:4: ( ruleEString )
                    // InternalCOV.g:346:5: ruleEString
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getImportRule());
                    					}
                    				

                    					newCompositeNode(grammarAccess.getImportAccess().getImportedRulesetDomainSpecificCoverageCrossReference_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    ruleEString();

                    state._fsp--;


                    					afterParserOrEnumRuleCall();
                    				

                    }


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
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalCOV.g:364:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalCOV.g:364:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalCOV.g:365:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalCOV.g:371:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '::' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalCOV.g:377:2: ( (this_ID_0= RULE_ID (kw= '::' this_ID_2= RULE_ID )* ) )
            // InternalCOV.g:378:2: (this_ID_0= RULE_ID (kw= '::' this_ID_2= RULE_ID )* )
            {
            // InternalCOV.g:378:2: (this_ID_0= RULE_ID (kw= '::' this_ID_2= RULE_ID )* )
            // InternalCOV.g:379:3: this_ID_0= RULE_ID (kw= '::' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_16); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalCOV.g:386:3: (kw= '::' this_ID_2= RULE_ID )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==20) ) {
                    int LA6_2 = input.LA(2);

                    if ( (LA6_2==RULE_ID) ) {
                        alt6=1;
                    }


                }


                switch (alt6) {
            	case 1 :
            	    // InternalCOV.g:387:4: kw= '::' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,20,FOLLOW_12); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getColonColonKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_16); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleImportedFQN"
    // InternalCOV.g:404:1: entryRuleImportedFQN returns [String current=null] : iv_ruleImportedFQN= ruleImportedFQN EOF ;
    public final String entryRuleImportedFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleImportedFQN = null;


        try {
            // InternalCOV.g:404:51: (iv_ruleImportedFQN= ruleImportedFQN EOF )
            // InternalCOV.g:405:2: iv_ruleImportedFQN= ruleImportedFQN EOF
            {
             newCompositeNode(grammarAccess.getImportedFQNRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImportedFQN=ruleImportedFQN();

            state._fsp--;

             current =iv_ruleImportedFQN.getText(); 
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
    // $ANTLR end "entryRuleImportedFQN"


    // $ANTLR start "ruleImportedFQN"
    // InternalCOV.g:411:1: ruleImportedFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '::' kw= '*' )? ) ;
    public final AntlrDatatypeRuleToken ruleImportedFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;



        	enterRule();

        try {
            // InternalCOV.g:417:2: ( (this_QualifiedName_0= ruleQualifiedName (kw= '::' kw= '*' )? ) )
            // InternalCOV.g:418:2: (this_QualifiedName_0= ruleQualifiedName (kw= '::' kw= '*' )? )
            {
            // InternalCOV.g:418:2: (this_QualifiedName_0= ruleQualifiedName (kw= '::' kw= '*' )? )
            // InternalCOV.g:419:3: this_QualifiedName_0= ruleQualifiedName (kw= '::' kw= '*' )?
            {

            			newCompositeNode(grammarAccess.getImportedFQNAccess().getQualifiedNameParserRuleCall_0());
            		
            pushFollow(FOLLOW_16);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;


            			current.merge(this_QualifiedName_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalCOV.g:429:3: (kw= '::' kw= '*' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalCOV.g:430:4: kw= '::' kw= '*'
                    {
                    kw=(Token)match(input,20,FOLLOW_17); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getImportedFQNAccess().getColonColonKeyword_1_0());
                    			
                    kw=(Token)match(input,21,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getImportedFQNAccess().getAsteriskKeyword_1_1());
                    			

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
    // $ANTLR end "ruleImportedFQN"


    // $ANTLR start "entryRuleEString"
    // InternalCOV.g:445:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalCOV.g:445:47: (iv_ruleEString= ruleEString EOF )
            // InternalCOV.g:446:2: iv_ruleEString= ruleEString EOF
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
    // InternalCOV.g:452:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalCOV.g:458:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalCOV.g:459:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalCOV.g:459:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_STRING) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_ID) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalCOV.g:460:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalCOV.g:468:3: this_ID_1= RULE_ID
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
    // InternalCOV.g:479:1: entryRuleContext returns [EObject current=null] : iv_ruleContext= ruleContext EOF ;
    public final EObject entryRuleContext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContext = null;


        try {
            // InternalCOV.g:479:48: (iv_ruleContext= ruleContext EOF )
            // InternalCOV.g:480:2: iv_ruleContext= ruleContext EOF
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
    // InternalCOV.g:486:1: ruleContext returns [EObject current=null] : (otherlv_0= 'context' ( ( ruleEString ) ) otherlv_2= '{' ( ( (lv_rules_3_0= ruleRule ) ) (otherlv_4= ',' ( (lv_rules_5_0= ruleRule ) ) )* )? otherlv_6= '}' ) ;
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
            // InternalCOV.g:492:2: ( (otherlv_0= 'context' ( ( ruleEString ) ) otherlv_2= '{' ( ( (lv_rules_3_0= ruleRule ) ) (otherlv_4= ',' ( (lv_rules_5_0= ruleRule ) ) )* )? otherlv_6= '}' ) )
            // InternalCOV.g:493:2: (otherlv_0= 'context' ( ( ruleEString ) ) otherlv_2= '{' ( ( (lv_rules_3_0= ruleRule ) ) (otherlv_4= ',' ( (lv_rules_5_0= ruleRule ) ) )* )? otherlv_6= '}' )
            {
            // InternalCOV.g:493:2: (otherlv_0= 'context' ( ( ruleEString ) ) otherlv_2= '{' ( ( (lv_rules_3_0= ruleRule ) ) (otherlv_4= ',' ( (lv_rules_5_0= ruleRule ) ) )* )? otherlv_6= '}' )
            // InternalCOV.g:494:3: otherlv_0= 'context' ( ( ruleEString ) ) otherlv_2= '{' ( ( (lv_rules_3_0= ruleRule ) ) (otherlv_4= ',' ( (lv_rules_5_0= ruleRule ) ) )* )? otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getContextAccess().getContextKeyword_0());
            		
            // InternalCOV.g:498:3: ( ( ruleEString ) )
            // InternalCOV.g:499:4: ( ruleEString )
            {
            // InternalCOV.g:499:4: ( ruleEString )
            // InternalCOV.g:500:5: ruleEString
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

            otherlv_2=(Token)match(input,12,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getContextAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalCOV.g:518:3: ( ( (lv_rules_3_0= ruleRule ) ) (otherlv_4= ',' ( (lv_rules_5_0= ruleRule ) ) )* )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==12||(LA10_0>=25 && LA10_0<=26)||(LA10_0>=31 && LA10_0<=33)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalCOV.g:519:4: ( (lv_rules_3_0= ruleRule ) ) (otherlv_4= ',' ( (lv_rules_5_0= ruleRule ) ) )*
                    {
                    // InternalCOV.g:519:4: ( (lv_rules_3_0= ruleRule ) )
                    // InternalCOV.g:520:5: (lv_rules_3_0= ruleRule )
                    {
                    // InternalCOV.g:520:5: (lv_rules_3_0= ruleRule )
                    // InternalCOV.g:521:6: lv_rules_3_0= ruleRule
                    {

                    						newCompositeNode(grammarAccess.getContextAccess().getRulesRuleParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_11);
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

                    // InternalCOV.g:538:4: (otherlv_4= ',' ( (lv_rules_5_0= ruleRule ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==15) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalCOV.g:539:5: otherlv_4= ',' ( (lv_rules_5_0= ruleRule ) )
                    	    {
                    	    otherlv_4=(Token)match(input,15,FOLLOW_19); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getContextAccess().getCommaKeyword_3_1_0());
                    	    				
                    	    // InternalCOV.g:543:5: ( (lv_rules_5_0= ruleRule ) )
                    	    // InternalCOV.g:544:6: (lv_rules_5_0= ruleRule )
                    	    {
                    	    // InternalCOV.g:544:6: (lv_rules_5_0= ruleRule )
                    	    // InternalCOV.g:545:7: lv_rules_5_0= ruleRule
                    	    {

                    	    							newCompositeNode(grammarAccess.getContextAccess().getRulesRuleParserRuleCall_3_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
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
                    	    break loop9;
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
    // InternalCOV.g:572:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // InternalCOV.g:572:45: (iv_ruleRule= ruleRule EOF )
            // InternalCOV.g:573:2: iv_ruleRule= ruleRule EOF
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
    // InternalCOV.g:579:1: ruleRule returns [EObject current=null] : (this_Ignore_0= ruleIgnore | this_LimitedIgnore_1= ruleLimitedIgnore | this_CoverageOfReferenced_2= ruleCoverageOfReferenced | this_CoverageByContent_3= ruleCoverageByContent | this_BranchSpecification_4= ruleBranchSpecification ) ;
    public final EObject ruleRule() throws RecognitionException {
        EObject current = null;

        EObject this_Ignore_0 = null;

        EObject this_LimitedIgnore_1 = null;

        EObject this_CoverageOfReferenced_2 = null;

        EObject this_CoverageByContent_3 = null;

        EObject this_BranchSpecification_4 = null;



        	enterRule();

        try {
            // InternalCOV.g:585:2: ( (this_Ignore_0= ruleIgnore | this_LimitedIgnore_1= ruleLimitedIgnore | this_CoverageOfReferenced_2= ruleCoverageOfReferenced | this_CoverageByContent_3= ruleCoverageByContent | this_BranchSpecification_4= ruleBranchSpecification ) )
            // InternalCOV.g:586:2: (this_Ignore_0= ruleIgnore | this_LimitedIgnore_1= ruleLimitedIgnore | this_CoverageOfReferenced_2= ruleCoverageOfReferenced | this_CoverageByContent_3= ruleCoverageByContent | this_BranchSpecification_4= ruleBranchSpecification )
            {
            // InternalCOV.g:586:2: (this_Ignore_0= ruleIgnore | this_LimitedIgnore_1= ruleLimitedIgnore | this_CoverageOfReferenced_2= ruleCoverageOfReferenced | this_CoverageByContent_3= ruleCoverageByContent | this_BranchSpecification_4= ruleBranchSpecification )
            int alt11=5;
            switch ( input.LA(1) ) {
            case 25:
                {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==RULE_STRING) ) {
                    switch ( input.LA(3) ) {
                    case 33:
                        {
                        alt11=4;
                        }
                        break;
                    case 12:
                        {
                        alt11=5;
                        }
                        break;
                    case 26:
                        {
                        alt11=1;
                        }
                        break;
                    case 31:
                        {
                        alt11=2;
                        }
                        break;
                    case 32:
                        {
                        alt11=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 11, 7, input);

                        throw nvae;
                    }

                }
                else if ( (LA11_1==RULE_ID) ) {
                    switch ( input.LA(3) ) {
                    case 33:
                        {
                        alt11=4;
                        }
                        break;
                    case 12:
                        {
                        alt11=5;
                        }
                        break;
                    case 26:
                        {
                        alt11=1;
                        }
                        break;
                    case 31:
                        {
                        alt11=2;
                        }
                        break;
                    case 32:
                        {
                        alt11=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 11, 8, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;
                }
                }
                break;
            case 26:
                {
                alt11=1;
                }
                break;
            case 31:
                {
                alt11=2;
                }
                break;
            case 32:
                {
                alt11=3;
                }
                break;
            case 33:
                {
                alt11=4;
                }
                break;
            case 12:
                {
                alt11=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalCOV.g:587:3: this_Ignore_0= ruleIgnore
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
                    // InternalCOV.g:596:3: this_LimitedIgnore_1= ruleLimitedIgnore
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
                    // InternalCOV.g:605:3: this_CoverageOfReferenced_2= ruleCoverageOfReferenced
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
                    // InternalCOV.g:614:3: this_CoverageByContent_3= ruleCoverageByContent
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
                    // InternalCOV.g:623:3: this_BranchSpecification_4= ruleBranchSpecification
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
    // InternalCOV.g:635:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // InternalCOV.g:635:48: (iv_ruleEBoolean= ruleEBoolean EOF )
            // InternalCOV.g:636:2: iv_ruleEBoolean= ruleEBoolean EOF
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
    // InternalCOV.g:642:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalCOV.g:648:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalCOV.g:649:2: (kw= 'true' | kw= 'false' )
            {
            // InternalCOV.g:649:2: (kw= 'true' | kw= 'false' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==23) ) {
                alt12=1;
            }
            else if ( (LA12_0==24) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalCOV.g:650:3: kw= 'true'
                    {
                    kw=(Token)match(input,23,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalCOV.g:656:3: kw= 'false'
                    {
                    kw=(Token)match(input,24,FOLLOW_2); 

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
    // InternalCOV.g:665:1: entryRuleIgnore returns [EObject current=null] : iv_ruleIgnore= ruleIgnore EOF ;
    public final EObject entryRuleIgnore() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIgnore = null;


        try {
            // InternalCOV.g:665:47: (iv_ruleIgnore= ruleIgnore EOF )
            // InternalCOV.g:666:2: iv_ruleIgnore= ruleIgnore EOF
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
    // InternalCOV.g:672:1: ruleIgnore returns [EObject current=null] : ( () (otherlv_1= 'when' ( (lv_condition_2_0= ruleCondition ) ) )? otherlv_3= 'ignore' otherlv_4= '(' (otherlv_5= 'subtypes' ( (lv_ignoreSubtypes_6_0= ruleEBoolean ) ) )? otherlv_7= ')' (otherlv_8= 'description' ( (lv_description_9_0= ruleEString ) ) )? ) ;
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
            // InternalCOV.g:678:2: ( ( () (otherlv_1= 'when' ( (lv_condition_2_0= ruleCondition ) ) )? otherlv_3= 'ignore' otherlv_4= '(' (otherlv_5= 'subtypes' ( (lv_ignoreSubtypes_6_0= ruleEBoolean ) ) )? otherlv_7= ')' (otherlv_8= 'description' ( (lv_description_9_0= ruleEString ) ) )? ) )
            // InternalCOV.g:679:2: ( () (otherlv_1= 'when' ( (lv_condition_2_0= ruleCondition ) ) )? otherlv_3= 'ignore' otherlv_4= '(' (otherlv_5= 'subtypes' ( (lv_ignoreSubtypes_6_0= ruleEBoolean ) ) )? otherlv_7= ')' (otherlv_8= 'description' ( (lv_description_9_0= ruleEString ) ) )? )
            {
            // InternalCOV.g:679:2: ( () (otherlv_1= 'when' ( (lv_condition_2_0= ruleCondition ) ) )? otherlv_3= 'ignore' otherlv_4= '(' (otherlv_5= 'subtypes' ( (lv_ignoreSubtypes_6_0= ruleEBoolean ) ) )? otherlv_7= ')' (otherlv_8= 'description' ( (lv_description_9_0= ruleEString ) ) )? )
            // InternalCOV.g:680:3: () (otherlv_1= 'when' ( (lv_condition_2_0= ruleCondition ) ) )? otherlv_3= 'ignore' otherlv_4= '(' (otherlv_5= 'subtypes' ( (lv_ignoreSubtypes_6_0= ruleEBoolean ) ) )? otherlv_7= ')' (otherlv_8= 'description' ( (lv_description_9_0= ruleEString ) ) )?
            {
            // InternalCOV.g:680:3: ()
            // InternalCOV.g:681:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIgnoreAccess().getIgnoreAction_0(),
            					current);
            			

            }

            // InternalCOV.g:687:3: (otherlv_1= 'when' ( (lv_condition_2_0= ruleCondition ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==25) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalCOV.g:688:4: otherlv_1= 'when' ( (lv_condition_2_0= ruleCondition ) )
                    {
                    otherlv_1=(Token)match(input,25,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getIgnoreAccess().getWhenKeyword_1_0());
                    			
                    // InternalCOV.g:692:4: ( (lv_condition_2_0= ruleCondition ) )
                    // InternalCOV.g:693:5: (lv_condition_2_0= ruleCondition )
                    {
                    // InternalCOV.g:693:5: (lv_condition_2_0= ruleCondition )
                    // InternalCOV.g:694:6: lv_condition_2_0= ruleCondition
                    {

                    						newCompositeNode(grammarAccess.getIgnoreAccess().getConditionConditionParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_20);
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

            otherlv_3=(Token)match(input,26,FOLLOW_21); 

            			newLeafNode(otherlv_3, grammarAccess.getIgnoreAccess().getIgnoreKeyword_2());
            		
            otherlv_4=(Token)match(input,27,FOLLOW_22); 

            			newLeafNode(otherlv_4, grammarAccess.getIgnoreAccess().getLeftParenthesisKeyword_3());
            		
            // InternalCOV.g:720:3: (otherlv_5= 'subtypes' ( (lv_ignoreSubtypes_6_0= ruleEBoolean ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==28) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalCOV.g:721:4: otherlv_5= 'subtypes' ( (lv_ignoreSubtypes_6_0= ruleEBoolean ) )
                    {
                    otherlv_5=(Token)match(input,28,FOLLOW_23); 

                    				newLeafNode(otherlv_5, grammarAccess.getIgnoreAccess().getSubtypesKeyword_4_0());
                    			
                    // InternalCOV.g:725:4: ( (lv_ignoreSubtypes_6_0= ruleEBoolean ) )
                    // InternalCOV.g:726:5: (lv_ignoreSubtypes_6_0= ruleEBoolean )
                    {
                    // InternalCOV.g:726:5: (lv_ignoreSubtypes_6_0= ruleEBoolean )
                    // InternalCOV.g:727:6: lv_ignoreSubtypes_6_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getIgnoreAccess().getIgnoreSubtypesEBooleanParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_24);
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

            otherlv_7=(Token)match(input,29,FOLLOW_25); 

            			newLeafNode(otherlv_7, grammarAccess.getIgnoreAccess().getRightParenthesisKeyword_5());
            		
            // InternalCOV.g:749:3: (otherlv_8= 'description' ( (lv_description_9_0= ruleEString ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==30) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalCOV.g:750:4: otherlv_8= 'description' ( (lv_description_9_0= ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,30,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getIgnoreAccess().getDescriptionKeyword_6_0());
                    			
                    // InternalCOV.g:754:4: ( (lv_description_9_0= ruleEString ) )
                    // InternalCOV.g:755:5: (lv_description_9_0= ruleEString )
                    {
                    // InternalCOV.g:755:5: (lv_description_9_0= ruleEString )
                    // InternalCOV.g:756:6: lv_description_9_0= ruleEString
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
    // InternalCOV.g:778:1: entryRuleLimitedIgnore returns [EObject current=null] : iv_ruleLimitedIgnore= ruleLimitedIgnore EOF ;
    public final EObject entryRuleLimitedIgnore() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLimitedIgnore = null;


        try {
            // InternalCOV.g:778:54: (iv_ruleLimitedIgnore= ruleLimitedIgnore EOF )
            // InternalCOV.g:779:2: iv_ruleLimitedIgnore= ruleLimitedIgnore EOF
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
    // InternalCOV.g:785:1: ruleLimitedIgnore returns [EObject current=null] : ( () (otherlv_1= 'when' ( (lv_condition_2_0= ruleCondition ) ) )? otherlv_3= 'ignoreif' ( (lv_type_4_0= ruleLimitationType ) ) ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* (otherlv_8= 'description' ( (lv_description_9_0= ruleEString ) ) )? ) ;
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
            // InternalCOV.g:791:2: ( ( () (otherlv_1= 'when' ( (lv_condition_2_0= ruleCondition ) ) )? otherlv_3= 'ignoreif' ( (lv_type_4_0= ruleLimitationType ) ) ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* (otherlv_8= 'description' ( (lv_description_9_0= ruleEString ) ) )? ) )
            // InternalCOV.g:792:2: ( () (otherlv_1= 'when' ( (lv_condition_2_0= ruleCondition ) ) )? otherlv_3= 'ignoreif' ( (lv_type_4_0= ruleLimitationType ) ) ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* (otherlv_8= 'description' ( (lv_description_9_0= ruleEString ) ) )? )
            {
            // InternalCOV.g:792:2: ( () (otherlv_1= 'when' ( (lv_condition_2_0= ruleCondition ) ) )? otherlv_3= 'ignoreif' ( (lv_type_4_0= ruleLimitationType ) ) ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* (otherlv_8= 'description' ( (lv_description_9_0= ruleEString ) ) )? )
            // InternalCOV.g:793:3: () (otherlv_1= 'when' ( (lv_condition_2_0= ruleCondition ) ) )? otherlv_3= 'ignoreif' ( (lv_type_4_0= ruleLimitationType ) ) ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* (otherlv_8= 'description' ( (lv_description_9_0= ruleEString ) ) )?
            {
            // InternalCOV.g:793:3: ()
            // InternalCOV.g:794:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLimitedIgnoreAccess().getLimitedIgnoreAction_0(),
            					current);
            			

            }

            // InternalCOV.g:800:3: (otherlv_1= 'when' ( (lv_condition_2_0= ruleCondition ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==25) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalCOV.g:801:4: otherlv_1= 'when' ( (lv_condition_2_0= ruleCondition ) )
                    {
                    otherlv_1=(Token)match(input,25,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getLimitedIgnoreAccess().getWhenKeyword_1_0());
                    			
                    // InternalCOV.g:805:4: ( (lv_condition_2_0= ruleCondition ) )
                    // InternalCOV.g:806:5: (lv_condition_2_0= ruleCondition )
                    {
                    // InternalCOV.g:806:5: (lv_condition_2_0= ruleCondition )
                    // InternalCOV.g:807:6: lv_condition_2_0= ruleCondition
                    {

                    						newCompositeNode(grammarAccess.getLimitedIgnoreAccess().getConditionConditionParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_26);
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

            otherlv_3=(Token)match(input,31,FOLLOW_27); 

            			newLeafNode(otherlv_3, grammarAccess.getLimitedIgnoreAccess().getIgnoreifKeyword_2());
            		
            // InternalCOV.g:829:3: ( (lv_type_4_0= ruleLimitationType ) )
            // InternalCOV.g:830:4: (lv_type_4_0= ruleLimitationType )
            {
            // InternalCOV.g:830:4: (lv_type_4_0= ruleLimitationType )
            // InternalCOV.g:831:5: lv_type_4_0= ruleLimitationType
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

            // InternalCOV.g:848:3: ( ( ruleEString ) )
            // InternalCOV.g:849:4: ( ruleEString )
            {
            // InternalCOV.g:849:4: ( ruleEString )
            // InternalCOV.g:850:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLimitedIgnoreRule());
            					}
            				

            					newCompositeNode(grammarAccess.getLimitedIgnoreAccess().getContainerMetaclassEClassCrossReference_4_0());
            				
            pushFollow(FOLLOW_28);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCOV.g:864:3: (otherlv_6= ',' ( ( ruleEString ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==15) ) {
                    int LA17_2 = input.LA(2);

                    if ( ((LA17_2>=RULE_STRING && LA17_2<=RULE_ID)) ) {
                        alt17=1;
                    }


                }


                switch (alt17) {
            	case 1 :
            	    // InternalCOV.g:865:4: otherlv_6= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_6=(Token)match(input,15,FOLLOW_3); 

            	    				newLeafNode(otherlv_6, grammarAccess.getLimitedIgnoreAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalCOV.g:869:4: ( ( ruleEString ) )
            	    // InternalCOV.g:870:5: ( ruleEString )
            	    {
            	    // InternalCOV.g:870:5: ( ruleEString )
            	    // InternalCOV.g:871:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getLimitedIgnoreRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getLimitedIgnoreAccess().getContainerMetaclassEClassCrossReference_5_1_0());
            	    					
            	    pushFollow(FOLLOW_28);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            // InternalCOV.g:886:3: (otherlv_8= 'description' ( (lv_description_9_0= ruleEString ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==30) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalCOV.g:887:4: otherlv_8= 'description' ( (lv_description_9_0= ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,30,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getLimitedIgnoreAccess().getDescriptionKeyword_6_0());
                    			
                    // InternalCOV.g:891:4: ( (lv_description_9_0= ruleEString ) )
                    // InternalCOV.g:892:5: (lv_description_9_0= ruleEString )
                    {
                    // InternalCOV.g:892:5: (lv_description_9_0= ruleEString )
                    // InternalCOV.g:893:6: lv_description_9_0= ruleEString
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
    // InternalCOV.g:915:1: entryRuleCoverageOfReferenced returns [EObject current=null] : iv_ruleCoverageOfReferenced= ruleCoverageOfReferenced EOF ;
    public final EObject entryRuleCoverageOfReferenced() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCoverageOfReferenced = null;


        try {
            // InternalCOV.g:915:61: (iv_ruleCoverageOfReferenced= ruleCoverageOfReferenced EOF )
            // InternalCOV.g:916:2: iv_ruleCoverageOfReferenced= ruleCoverageOfReferenced EOF
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
    // InternalCOV.g:922:1: ruleCoverageOfReferenced returns [EObject current=null] : ( () (otherlv_1= 'when' ( (lv_condition_2_0= ruleCondition ) ) )? otherlv_3= 'covers' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* (otherlv_7= 'description' ( (lv_description_8_0= ruleEString ) ) )? ) ;
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
            // InternalCOV.g:928:2: ( ( () (otherlv_1= 'when' ( (lv_condition_2_0= ruleCondition ) ) )? otherlv_3= 'covers' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* (otherlv_7= 'description' ( (lv_description_8_0= ruleEString ) ) )? ) )
            // InternalCOV.g:929:2: ( () (otherlv_1= 'when' ( (lv_condition_2_0= ruleCondition ) ) )? otherlv_3= 'covers' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* (otherlv_7= 'description' ( (lv_description_8_0= ruleEString ) ) )? )
            {
            // InternalCOV.g:929:2: ( () (otherlv_1= 'when' ( (lv_condition_2_0= ruleCondition ) ) )? otherlv_3= 'covers' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* (otherlv_7= 'description' ( (lv_description_8_0= ruleEString ) ) )? )
            // InternalCOV.g:930:3: () (otherlv_1= 'when' ( (lv_condition_2_0= ruleCondition ) ) )? otherlv_3= 'covers' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* (otherlv_7= 'description' ( (lv_description_8_0= ruleEString ) ) )?
            {
            // InternalCOV.g:930:3: ()
            // InternalCOV.g:931:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCoverageOfReferencedAccess().getCoverageOfReferencedAction_0(),
            					current);
            			

            }

            // InternalCOV.g:937:3: (otherlv_1= 'when' ( (lv_condition_2_0= ruleCondition ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==25) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalCOV.g:938:4: otherlv_1= 'when' ( (lv_condition_2_0= ruleCondition ) )
                    {
                    otherlv_1=(Token)match(input,25,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getCoverageOfReferencedAccess().getWhenKeyword_1_0());
                    			
                    // InternalCOV.g:942:4: ( (lv_condition_2_0= ruleCondition ) )
                    // InternalCOV.g:943:5: (lv_condition_2_0= ruleCondition )
                    {
                    // InternalCOV.g:943:5: (lv_condition_2_0= ruleCondition )
                    // InternalCOV.g:944:6: lv_condition_2_0= ruleCondition
                    {

                    						newCompositeNode(grammarAccess.getCoverageOfReferencedAccess().getConditionConditionParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_29);
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

            otherlv_3=(Token)match(input,32,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getCoverageOfReferencedAccess().getCoversKeyword_2());
            		
            // InternalCOV.g:966:3: ( ( ruleEString ) )
            // InternalCOV.g:967:4: ( ruleEString )
            {
            // InternalCOV.g:967:4: ( ruleEString )
            // InternalCOV.g:968:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCoverageOfReferencedRule());
            					}
            				

            					newCompositeNode(grammarAccess.getCoverageOfReferencedAccess().getReferenceEReferenceCrossReference_3_0());
            				
            pushFollow(FOLLOW_28);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCOV.g:982:3: (otherlv_5= ',' ( ( ruleEString ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==15) ) {
                    int LA20_2 = input.LA(2);

                    if ( ((LA20_2>=RULE_STRING && LA20_2<=RULE_ID)) ) {
                        alt20=1;
                    }


                }


                switch (alt20) {
            	case 1 :
            	    // InternalCOV.g:983:4: otherlv_5= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_5=(Token)match(input,15,FOLLOW_3); 

            	    				newLeafNode(otherlv_5, grammarAccess.getCoverageOfReferencedAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalCOV.g:987:4: ( ( ruleEString ) )
            	    // InternalCOV.g:988:5: ( ruleEString )
            	    {
            	    // InternalCOV.g:988:5: ( ruleEString )
            	    // InternalCOV.g:989:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getCoverageOfReferencedRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getCoverageOfReferencedAccess().getReferenceEReferenceCrossReference_4_1_0());
            	    					
            	    pushFollow(FOLLOW_28);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            // InternalCOV.g:1004:3: (otherlv_7= 'description' ( (lv_description_8_0= ruleEString ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==30) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalCOV.g:1005:4: otherlv_7= 'description' ( (lv_description_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,30,FOLLOW_3); 

                    				newLeafNode(otherlv_7, grammarAccess.getCoverageOfReferencedAccess().getDescriptionKeyword_5_0());
                    			
                    // InternalCOV.g:1009:4: ( (lv_description_8_0= ruleEString ) )
                    // InternalCOV.g:1010:5: (lv_description_8_0= ruleEString )
                    {
                    // InternalCOV.g:1010:5: (lv_description_8_0= ruleEString )
                    // InternalCOV.g:1011:6: lv_description_8_0= ruleEString
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
    // InternalCOV.g:1033:1: entryRuleCoverageByContent returns [EObject current=null] : iv_ruleCoverageByContent= ruleCoverageByContent EOF ;
    public final EObject entryRuleCoverageByContent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCoverageByContent = null;


        try {
            // InternalCOV.g:1033:58: (iv_ruleCoverageByContent= ruleCoverageByContent EOF )
            // InternalCOV.g:1034:2: iv_ruleCoverageByContent= ruleCoverageByContent EOF
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
    // InternalCOV.g:1040:1: ruleCoverageByContent returns [EObject current=null] : ( () (otherlv_1= 'when' ( (lv_condition_2_0= ruleCondition ) ) )? otherlv_3= 'covered' otherlv_4= 'when' ( (lv_multiplicity_5_0= ruleCoveredContents ) ) ( ( ruleEString ) ) otherlv_7= 'iscovered' (otherlv_8= 'description' ( (lv_description_9_0= ruleEString ) ) )? ) ;
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
            // InternalCOV.g:1046:2: ( ( () (otherlv_1= 'when' ( (lv_condition_2_0= ruleCondition ) ) )? otherlv_3= 'covered' otherlv_4= 'when' ( (lv_multiplicity_5_0= ruleCoveredContents ) ) ( ( ruleEString ) ) otherlv_7= 'iscovered' (otherlv_8= 'description' ( (lv_description_9_0= ruleEString ) ) )? ) )
            // InternalCOV.g:1047:2: ( () (otherlv_1= 'when' ( (lv_condition_2_0= ruleCondition ) ) )? otherlv_3= 'covered' otherlv_4= 'when' ( (lv_multiplicity_5_0= ruleCoveredContents ) ) ( ( ruleEString ) ) otherlv_7= 'iscovered' (otherlv_8= 'description' ( (lv_description_9_0= ruleEString ) ) )? )
            {
            // InternalCOV.g:1047:2: ( () (otherlv_1= 'when' ( (lv_condition_2_0= ruleCondition ) ) )? otherlv_3= 'covered' otherlv_4= 'when' ( (lv_multiplicity_5_0= ruleCoveredContents ) ) ( ( ruleEString ) ) otherlv_7= 'iscovered' (otherlv_8= 'description' ( (lv_description_9_0= ruleEString ) ) )? )
            // InternalCOV.g:1048:3: () (otherlv_1= 'when' ( (lv_condition_2_0= ruleCondition ) ) )? otherlv_3= 'covered' otherlv_4= 'when' ( (lv_multiplicity_5_0= ruleCoveredContents ) ) ( ( ruleEString ) ) otherlv_7= 'iscovered' (otherlv_8= 'description' ( (lv_description_9_0= ruleEString ) ) )?
            {
            // InternalCOV.g:1048:3: ()
            // InternalCOV.g:1049:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCoverageByContentAccess().getCoverageByContentAction_0(),
            					current);
            			

            }

            // InternalCOV.g:1055:3: (otherlv_1= 'when' ( (lv_condition_2_0= ruleCondition ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==25) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalCOV.g:1056:4: otherlv_1= 'when' ( (lv_condition_2_0= ruleCondition ) )
                    {
                    otherlv_1=(Token)match(input,25,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getCoverageByContentAccess().getWhenKeyword_1_0());
                    			
                    // InternalCOV.g:1060:4: ( (lv_condition_2_0= ruleCondition ) )
                    // InternalCOV.g:1061:5: (lv_condition_2_0= ruleCondition )
                    {
                    // InternalCOV.g:1061:5: (lv_condition_2_0= ruleCondition )
                    // InternalCOV.g:1062:6: lv_condition_2_0= ruleCondition
                    {

                    						newCompositeNode(grammarAccess.getCoverageByContentAccess().getConditionConditionParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_30);
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

            otherlv_3=(Token)match(input,33,FOLLOW_31); 

            			newLeafNode(otherlv_3, grammarAccess.getCoverageByContentAccess().getCoveredKeyword_2());
            		
            otherlv_4=(Token)match(input,25,FOLLOW_32); 

            			newLeafNode(otherlv_4, grammarAccess.getCoverageByContentAccess().getWhenKeyword_3());
            		
            // InternalCOV.g:1088:3: ( (lv_multiplicity_5_0= ruleCoveredContents ) )
            // InternalCOV.g:1089:4: (lv_multiplicity_5_0= ruleCoveredContents )
            {
            // InternalCOV.g:1089:4: (lv_multiplicity_5_0= ruleCoveredContents )
            // InternalCOV.g:1090:5: lv_multiplicity_5_0= ruleCoveredContents
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

            // InternalCOV.g:1107:3: ( ( ruleEString ) )
            // InternalCOV.g:1108:4: ( ruleEString )
            {
            // InternalCOV.g:1108:4: ( ruleEString )
            // InternalCOV.g:1109:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCoverageByContentRule());
            					}
            				

            					newCompositeNode(grammarAccess.getCoverageByContentAccess().getContainmentReferenceEReferenceCrossReference_5_0());
            				
            pushFollow(FOLLOW_33);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,34,FOLLOW_25); 

            			newLeafNode(otherlv_7, grammarAccess.getCoverageByContentAccess().getIscoveredKeyword_6());
            		
            // InternalCOV.g:1127:3: (otherlv_8= 'description' ( (lv_description_9_0= ruleEString ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==30) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalCOV.g:1128:4: otherlv_8= 'description' ( (lv_description_9_0= ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,30,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getCoverageByContentAccess().getDescriptionKeyword_7_0());
                    			
                    // InternalCOV.g:1132:4: ( (lv_description_9_0= ruleEString ) )
                    // InternalCOV.g:1133:5: (lv_description_9_0= ruleEString )
                    {
                    // InternalCOV.g:1133:5: (lv_description_9_0= ruleEString )
                    // InternalCOV.g:1134:6: lv_description_9_0= ruleEString
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
    // InternalCOV.g:1156:1: entryRuleBranchSpecification returns [EObject current=null] : iv_ruleBranchSpecification= ruleBranchSpecification EOF ;
    public final EObject entryRuleBranchSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBranchSpecification = null;


        try {
            // InternalCOV.g:1156:60: (iv_ruleBranchSpecification= ruleBranchSpecification EOF )
            // InternalCOV.g:1157:2: iv_ruleBranchSpecification= ruleBranchSpecification EOF
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
    // InternalCOV.g:1163:1: ruleBranchSpecification returns [EObject current=null] : ( () (otherlv_1= 'when' ( (lv_condition_2_0= ruleCondition ) ) )? otherlv_3= '{' ( (lv_branches_4_0= ruleBranch ) ) (otherlv_5= ',' ( (lv_branches_6_0= ruleBranch ) ) )* (otherlv_7= 'description' ( (lv_description_8_0= ruleEString ) ) )? otherlv_9= '}' ) ;
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
            // InternalCOV.g:1169:2: ( ( () (otherlv_1= 'when' ( (lv_condition_2_0= ruleCondition ) ) )? otherlv_3= '{' ( (lv_branches_4_0= ruleBranch ) ) (otherlv_5= ',' ( (lv_branches_6_0= ruleBranch ) ) )* (otherlv_7= 'description' ( (lv_description_8_0= ruleEString ) ) )? otherlv_9= '}' ) )
            // InternalCOV.g:1170:2: ( () (otherlv_1= 'when' ( (lv_condition_2_0= ruleCondition ) ) )? otherlv_3= '{' ( (lv_branches_4_0= ruleBranch ) ) (otherlv_5= ',' ( (lv_branches_6_0= ruleBranch ) ) )* (otherlv_7= 'description' ( (lv_description_8_0= ruleEString ) ) )? otherlv_9= '}' )
            {
            // InternalCOV.g:1170:2: ( () (otherlv_1= 'when' ( (lv_condition_2_0= ruleCondition ) ) )? otherlv_3= '{' ( (lv_branches_4_0= ruleBranch ) ) (otherlv_5= ',' ( (lv_branches_6_0= ruleBranch ) ) )* (otherlv_7= 'description' ( (lv_description_8_0= ruleEString ) ) )? otherlv_9= '}' )
            // InternalCOV.g:1171:3: () (otherlv_1= 'when' ( (lv_condition_2_0= ruleCondition ) ) )? otherlv_3= '{' ( (lv_branches_4_0= ruleBranch ) ) (otherlv_5= ',' ( (lv_branches_6_0= ruleBranch ) ) )* (otherlv_7= 'description' ( (lv_description_8_0= ruleEString ) ) )? otherlv_9= '}'
            {
            // InternalCOV.g:1171:3: ()
            // InternalCOV.g:1172:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBranchSpecificationAccess().getBranchSpecificationAction_0(),
            					current);
            			

            }

            // InternalCOV.g:1178:3: (otherlv_1= 'when' ( (lv_condition_2_0= ruleCondition ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==25) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalCOV.g:1179:4: otherlv_1= 'when' ( (lv_condition_2_0= ruleCondition ) )
                    {
                    otherlv_1=(Token)match(input,25,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getBranchSpecificationAccess().getWhenKeyword_1_0());
                    			
                    // InternalCOV.g:1183:4: ( (lv_condition_2_0= ruleCondition ) )
                    // InternalCOV.g:1184:5: (lv_condition_2_0= ruleCondition )
                    {
                    // InternalCOV.g:1184:5: (lv_condition_2_0= ruleCondition )
                    // InternalCOV.g:1185:6: lv_condition_2_0= ruleCondition
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

            otherlv_3=(Token)match(input,12,FOLLOW_34); 

            			newLeafNode(otherlv_3, grammarAccess.getBranchSpecificationAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalCOV.g:1207:3: ( (lv_branches_4_0= ruleBranch ) )
            // InternalCOV.g:1208:4: (lv_branches_4_0= ruleBranch )
            {
            // InternalCOV.g:1208:4: (lv_branches_4_0= ruleBranch )
            // InternalCOV.g:1209:5: lv_branches_4_0= ruleBranch
            {

            					newCompositeNode(grammarAccess.getBranchSpecificationAccess().getBranchesBranchParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_35);
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

            // InternalCOV.g:1226:3: (otherlv_5= ',' ( (lv_branches_6_0= ruleBranch ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==15) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalCOV.g:1227:4: otherlv_5= ',' ( (lv_branches_6_0= ruleBranch ) )
            	    {
            	    otherlv_5=(Token)match(input,15,FOLLOW_34); 

            	    				newLeafNode(otherlv_5, grammarAccess.getBranchSpecificationAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalCOV.g:1231:4: ( (lv_branches_6_0= ruleBranch ) )
            	    // InternalCOV.g:1232:5: (lv_branches_6_0= ruleBranch )
            	    {
            	    // InternalCOV.g:1232:5: (lv_branches_6_0= ruleBranch )
            	    // InternalCOV.g:1233:6: lv_branches_6_0= ruleBranch
            	    {

            	    						newCompositeNode(grammarAccess.getBranchSpecificationAccess().getBranchesBranchParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_35);
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
            	    break loop25;
                }
            } while (true);

            // InternalCOV.g:1251:3: (otherlv_7= 'description' ( (lv_description_8_0= ruleEString ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==30) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalCOV.g:1252:4: otherlv_7= 'description' ( (lv_description_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,30,FOLLOW_3); 

                    				newLeafNode(otherlv_7, grammarAccess.getBranchSpecificationAccess().getDescriptionKeyword_5_0());
                    			
                    // InternalCOV.g:1256:4: ( (lv_description_8_0= ruleEString ) )
                    // InternalCOV.g:1257:5: (lv_description_8_0= ruleEString )
                    {
                    // InternalCOV.g:1257:5: (lv_description_8_0= ruleEString )
                    // InternalCOV.g:1258:6: lv_description_8_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getBranchSpecificationAccess().getDescriptionEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_36);
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
    // InternalCOV.g:1284:1: entryRuleBranch returns [EObject current=null] : iv_ruleBranch= ruleBranch EOF ;
    public final EObject entryRuleBranch() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBranch = null;


        try {
            // InternalCOV.g:1284:47: (iv_ruleBranch= ruleBranch EOF )
            // InternalCOV.g:1285:2: iv_ruleBranch= ruleBranch EOF
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
    // InternalCOV.g:1291:1: ruleBranch returns [EObject current=null] : (this_ExplicitBranch_0= ruleExplicitBranch | this_ImplicitBranch_1= ruleImplicitBranch ) ;
    public final EObject ruleBranch() throws RecognitionException {
        EObject current = null;

        EObject this_ExplicitBranch_0 = null;

        EObject this_ImplicitBranch_1 = null;



        	enterRule();

        try {
            // InternalCOV.g:1297:2: ( (this_ExplicitBranch_0= ruleExplicitBranch | this_ImplicitBranch_1= ruleImplicitBranch ) )
            // InternalCOV.g:1298:2: (this_ExplicitBranch_0= ruleExplicitBranch | this_ImplicitBranch_1= ruleImplicitBranch )
            {
            // InternalCOV.g:1298:2: (this_ExplicitBranch_0= ruleExplicitBranch | this_ImplicitBranch_1= ruleImplicitBranch )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==35) ) {
                int LA27_1 = input.LA(2);

                if ( ((LA27_1>=RULE_STRING && LA27_1<=RULE_ID)) ) {
                    alt27=1;
                }
                else if ( (LA27_1==36) ) {
                    alt27=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 27, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // InternalCOV.g:1299:3: this_ExplicitBranch_0= ruleExplicitBranch
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
                    // InternalCOV.g:1308:3: this_ImplicitBranch_1= ruleImplicitBranch
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
    // InternalCOV.g:1320:1: entryRuleExplicitBranch returns [EObject current=null] : iv_ruleExplicitBranch= ruleExplicitBranch EOF ;
    public final EObject entryRuleExplicitBranch() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExplicitBranch = null;


        try {
            // InternalCOV.g:1320:55: (iv_ruleExplicitBranch= ruleExplicitBranch EOF )
            // InternalCOV.g:1321:2: iv_ruleExplicitBranch= ruleExplicitBranch EOF
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
    // InternalCOV.g:1327:1: ruleExplicitBranch returns [EObject current=null] : (otherlv_0= 'branch' ( (lv_OCLQuery_1_0= ruleEString ) ) ) ;
    public final EObject ruleExplicitBranch() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_OCLQuery_1_0 = null;



        	enterRule();

        try {
            // InternalCOV.g:1333:2: ( (otherlv_0= 'branch' ( (lv_OCLQuery_1_0= ruleEString ) ) ) )
            // InternalCOV.g:1334:2: (otherlv_0= 'branch' ( (lv_OCLQuery_1_0= ruleEString ) ) )
            {
            // InternalCOV.g:1334:2: (otherlv_0= 'branch' ( (lv_OCLQuery_1_0= ruleEString ) ) )
            // InternalCOV.g:1335:3: otherlv_0= 'branch' ( (lv_OCLQuery_1_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,35,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getExplicitBranchAccess().getBranchKeyword_0());
            		
            // InternalCOV.g:1339:3: ( (lv_OCLQuery_1_0= ruleEString ) )
            // InternalCOV.g:1340:4: (lv_OCLQuery_1_0= ruleEString )
            {
            // InternalCOV.g:1340:4: (lv_OCLQuery_1_0= ruleEString )
            // InternalCOV.g:1341:5: lv_OCLQuery_1_0= ruleEString
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
    // InternalCOV.g:1362:1: entryRuleImplicitBranch returns [EObject current=null] : iv_ruleImplicitBranch= ruleImplicitBranch EOF ;
    public final EObject entryRuleImplicitBranch() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplicitBranch = null;


        try {
            // InternalCOV.g:1362:55: (iv_ruleImplicitBranch= ruleImplicitBranch EOF )
            // InternalCOV.g:1363:2: iv_ruleImplicitBranch= ruleImplicitBranch EOF
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
    // InternalCOV.g:1369:1: ruleImplicitBranch returns [EObject current=null] : ( () otherlv_1= 'branch' otherlv_2= 'else' ) ;
    public final EObject ruleImplicitBranch() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalCOV.g:1375:2: ( ( () otherlv_1= 'branch' otherlv_2= 'else' ) )
            // InternalCOV.g:1376:2: ( () otherlv_1= 'branch' otherlv_2= 'else' )
            {
            // InternalCOV.g:1376:2: ( () otherlv_1= 'branch' otherlv_2= 'else' )
            // InternalCOV.g:1377:3: () otherlv_1= 'branch' otherlv_2= 'else'
            {
            // InternalCOV.g:1377:3: ()
            // InternalCOV.g:1378:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getImplicitBranchAccess().getImplicitBranchAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,35,FOLLOW_37); 

            			newLeafNode(otherlv_1, grammarAccess.getImplicitBranchAccess().getBranchKeyword_1());
            		
            otherlv_2=(Token)match(input,36,FOLLOW_2); 

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
    // InternalCOV.g:1396:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalCOV.g:1396:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalCOV.g:1397:2: iv_ruleCondition= ruleCondition EOF
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
    // InternalCOV.g:1403:1: ruleCondition returns [EObject current=null] : ( (lv_OCLConstraint_0_0= ruleEString ) ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_OCLConstraint_0_0 = null;



        	enterRule();

        try {
            // InternalCOV.g:1409:2: ( ( (lv_OCLConstraint_0_0= ruleEString ) ) )
            // InternalCOV.g:1410:2: ( (lv_OCLConstraint_0_0= ruleEString ) )
            {
            // InternalCOV.g:1410:2: ( (lv_OCLConstraint_0_0= ruleEString ) )
            // InternalCOV.g:1411:3: (lv_OCLConstraint_0_0= ruleEString )
            {
            // InternalCOV.g:1411:3: (lv_OCLConstraint_0_0= ruleEString )
            // InternalCOV.g:1412:4: lv_OCLConstraint_0_0= ruleEString
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
    // InternalCOV.g:1432:1: ruleCoveredContents returns [Enumerator current=null] : ( (enumLiteral_0= 'ALL' ) | (enumLiteral_1= 'ONE' ) ) ;
    public final Enumerator ruleCoveredContents() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalCOV.g:1438:2: ( ( (enumLiteral_0= 'ALL' ) | (enumLiteral_1= 'ONE' ) ) )
            // InternalCOV.g:1439:2: ( (enumLiteral_0= 'ALL' ) | (enumLiteral_1= 'ONE' ) )
            {
            // InternalCOV.g:1439:2: ( (enumLiteral_0= 'ALL' ) | (enumLiteral_1= 'ONE' ) )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==37) ) {
                alt28=1;
            }
            else if ( (LA28_0==38) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // InternalCOV.g:1440:3: (enumLiteral_0= 'ALL' )
                    {
                    // InternalCOV.g:1440:3: (enumLiteral_0= 'ALL' )
                    // InternalCOV.g:1441:4: enumLiteral_0= 'ALL'
                    {
                    enumLiteral_0=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getCoveredContentsAccess().getALLEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getCoveredContentsAccess().getALLEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalCOV.g:1448:3: (enumLiteral_1= 'ONE' )
                    {
                    // InternalCOV.g:1448:3: (enumLiteral_1= 'ONE' )
                    // InternalCOV.g:1449:4: enumLiteral_1= 'ONE'
                    {
                    enumLiteral_1=(Token)match(input,38,FOLLOW_2); 

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
    // InternalCOV.g:1459:1: ruleLimitationType returns [Enumerator current=null] : ( (enumLiteral_0= 'containedBy' ) | (enumLiteral_1= 'notContainedBy' ) ) ;
    public final Enumerator ruleLimitationType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalCOV.g:1465:2: ( ( (enumLiteral_0= 'containedBy' ) | (enumLiteral_1= 'notContainedBy' ) ) )
            // InternalCOV.g:1466:2: ( (enumLiteral_0= 'containedBy' ) | (enumLiteral_1= 'notContainedBy' ) )
            {
            // InternalCOV.g:1466:2: ( (enumLiteral_0= 'containedBy' ) | (enumLiteral_1= 'notContainedBy' ) )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==39) ) {
                alt29=1;
            }
            else if ( (LA29_0==40) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // InternalCOV.g:1467:3: (enumLiteral_0= 'containedBy' )
                    {
                    // InternalCOV.g:1467:3: (enumLiteral_0= 'containedBy' )
                    // InternalCOV.g:1468:4: enumLiteral_0= 'containedBy'
                    {
                    enumLiteral_0=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getLimitationTypeAccess().getContainedByEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getLimitationTypeAccess().getContainedByEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalCOV.g:1475:3: (enumLiteral_1= 'notContainedBy' )
                    {
                    // InternalCOV.g:1475:3: (enumLiteral_1= 'notContainedBy' )
                    // InternalCOV.g:1476:4: enumLiteral_1= 'notContainedBy'
                    {
                    enumLiteral_1=(Token)match(input,40,FOLLOW_2); 

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
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000402000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000060030L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000000000040A000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000386011000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000386001000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000018000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000040008002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000040018000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000001000000000L});

}