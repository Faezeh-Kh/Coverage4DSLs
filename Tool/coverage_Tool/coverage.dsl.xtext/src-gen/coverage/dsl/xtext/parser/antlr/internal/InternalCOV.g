/*
 * generated by Xtext 2.28.0
 */
grammar InternalCOV;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package coverage.dsl.xtext.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleDomainSpecificCoverage
entryRuleDomainSpecificCoverage returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDomainSpecificCoverageRule()); }
	iv_ruleDomainSpecificCoverage=ruleDomainSpecificCoverage
	{ $current=$iv_ruleDomainSpecificCoverage.current; }
	EOF;

// Rule DomainSpecificCoverage
ruleDomainSpecificCoverage returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='DomainSpecificCoverage'
		{
			newLeafNode(otherlv_0, grammarAccess.getDomainSpecificCoverageAccess().getDomainSpecificCoverageKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getDomainSpecificCoverageAccess().getNameEStringParserRuleCall_1_0());
				}
				lv_name_1_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDomainSpecificCoverageRule());
					}
					set(
						$current,
						"name",
						lv_name_1_0,
						"coverage.dsl.xtext.COV.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getDomainSpecificCoverageAccess().getLeftCurlyBracketKeyword_2());
		}
		otherlv_3='Import'
		{
			newLeafNode(otherlv_3, grammarAccess.getDomainSpecificCoverageAccess().getImportKeyword_3());
		}
		otherlv_4='metamodel'
		{
			newLeafNode(otherlv_4, grammarAccess.getDomainSpecificCoverageAccess().getMetamodelKeyword_4());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDomainSpecificCoverageRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getDomainSpecificCoverageAccess().getMetamodelEPackageCrossReference_5_0());
				}
				ruleEString
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getDomainSpecificCoverageAccess().getContextsContextParserRuleCall_6_0());
				}
				lv_contexts_6_0=ruleContext
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDomainSpecificCoverageRule());
					}
					add(
						$current,
						"contexts",
						lv_contexts_6_0,
						"coverage.dsl.xtext.COV.Context");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_7=','
			{
				newLeafNode(otherlv_7, grammarAccess.getDomainSpecificCoverageAccess().getCommaKeyword_7_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getDomainSpecificCoverageAccess().getContextsContextParserRuleCall_7_1_0());
					}
					lv_contexts_8_0=ruleContext
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getDomainSpecificCoverageRule());
						}
						add(
							$current,
							"contexts",
							lv_contexts_8_0,
							"coverage.dsl.xtext.COV.Context");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		otherlv_9='}'
		{
			newLeafNode(otherlv_9, grammarAccess.getDomainSpecificCoverageAccess().getRightCurlyBracketKeyword_8());
		}
	)
;

// Entry rule entryRuleEString
entryRuleEString returns [String current=null]:
	{ newCompositeNode(grammarAccess.getEStringRule()); }
	iv_ruleEString=ruleEString
	{ $current=$iv_ruleEString.current.getText(); }
	EOF;

// Rule EString
ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_STRING_0=RULE_STRING
		{
			$current.merge(this_STRING_0);
		}
		{
			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
		}
		    |
		this_ID_1=RULE_ID
		{
			$current.merge(this_ID_1);
		}
		{
			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
		}
	)
;

// Entry rule entryRuleContext
entryRuleContext returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getContextRule()); }
	iv_ruleContext=ruleContext
	{ $current=$iv_ruleContext.current; }
	EOF;

// Rule Context
ruleContext returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Context'
		{
			newLeafNode(otherlv_0, grammarAccess.getContextAccess().getContextKeyword_0());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getContextRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getContextAccess().getMetaclassEClassCrossReference_1_0());
				}
				ruleEString
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getContextAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getContextAccess().getRulesRuleParserRuleCall_3_0_0());
					}
					lv_rules_3_0=ruleRule
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getContextRule());
						}
						add(
							$current,
							"rules",
							lv_rules_3_0,
							"coverage.dsl.xtext.COV.Rule");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_4=','
				{
					newLeafNode(otherlv_4, grammarAccess.getContextAccess().getCommaKeyword_3_1_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getContextAccess().getRulesRuleParserRuleCall_3_1_1_0());
						}
						lv_rules_5_0=ruleRule
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getContextRule());
							}
							add(
								$current,
								"rules",
								lv_rules_5_0,
								"coverage.dsl.xtext.COV.Rule");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
		)?
		otherlv_6='}'
		{
			newLeafNode(otherlv_6, grammarAccess.getContextAccess().getRightCurlyBracketKeyword_4());
		}
	)
;

// Entry rule entryRuleRule
entryRuleRule returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRuleRule()); }
	iv_ruleRule=ruleRule
	{ $current=$iv_ruleRule.current; }
	EOF;

// Rule Rule
ruleRule returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getRuleAccess().getIgnoreParserRuleCall_0());
		}
		this_Ignore_0=ruleIgnore
		{
			$current = $this_Ignore_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getRuleAccess().getCoverageOfReferencedParserRuleCall_1());
		}
		this_CoverageOfReferenced_1=ruleCoverageOfReferenced
		{
			$current = $this_CoverageOfReferenced_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getRuleAccess().getCoverageByContentParserRuleCall_2());
		}
		this_CoverageByContent_2=ruleCoverageByContent
		{
			$current = $this_CoverageByContent_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getRuleAccess().getConditionalIgnoreParserRuleCall_3());
		}
		this_ConditionalIgnore_3=ruleConditionalIgnore
		{
			$current = $this_ConditionalIgnore_3.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleEBoolean
entryRuleEBoolean returns [String current=null]:
	{ newCompositeNode(grammarAccess.getEBooleanRule()); }
	iv_ruleEBoolean=ruleEBoolean
	{ $current=$iv_ruleEBoolean.current.getText(); }
	EOF;

// Rule EBoolean
ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='true'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0());
		}
		    |
		kw='false'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getEBooleanAccess().getFalseKeyword_1());
		}
	)
;

// Entry rule entryRuleIgnore
entryRuleIgnore returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getIgnoreRule()); }
	iv_ruleIgnore=ruleIgnore
	{ $current=$iv_ruleIgnore.current; }
	EOF;

// Rule Ignore
ruleIgnore returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getIgnoreAccess().getIgnoreAction_0(),
					$current);
			}
		)
		otherlv_1='Ignore'
		{
			newLeafNode(otherlv_1, grammarAccess.getIgnoreAccess().getIgnoreKeyword_1());
		}
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getIgnoreAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			otherlv_3='ignoreSubtypes'
			{
				newLeafNode(otherlv_3, grammarAccess.getIgnoreAccess().getIgnoreSubtypesKeyword_3_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getIgnoreAccess().getIgnoreSubtypesEBooleanParserRuleCall_3_1_0());
					}
					lv_ignoreSubtypes_4_0=ruleEBoolean
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getIgnoreRule());
						}
						set(
							$current,
							"ignoreSubtypes",
							lv_ignoreSubtypes_4_0,
							"coverage.dsl.xtext.COV.EBoolean");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		otherlv_5='}'
		{
			newLeafNode(otherlv_5, grammarAccess.getIgnoreAccess().getRightCurlyBracketKeyword_4());
		}
	)
;

// Entry rule entryRuleCoverageOfReferenced
entryRuleCoverageOfReferenced returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCoverageOfReferencedRule()); }
	iv_ruleCoverageOfReferenced=ruleCoverageOfReferenced
	{ $current=$iv_ruleCoverageOfReferenced.current; }
	EOF;

// Rule CoverageOfReferenced
ruleCoverageOfReferenced returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='CoverageOfReferenced'
		{
			newLeafNode(otherlv_0, grammarAccess.getCoverageOfReferencedAccess().getCoverageOfReferencedKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getCoverageOfReferencedAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='reference'
		{
			newLeafNode(otherlv_2, grammarAccess.getCoverageOfReferencedAccess().getReferenceKeyword_2());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCoverageOfReferencedRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getCoverageOfReferencedAccess().getReferenceEReferenceCrossReference_3_0());
				}
				ruleEString
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_4='}'
		{
			newLeafNode(otherlv_4, grammarAccess.getCoverageOfReferencedAccess().getRightCurlyBracketKeyword_4());
		}
	)
;

// Entry rule entryRuleCoverageByContent
entryRuleCoverageByContent returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCoverageByContentRule()); }
	iv_ruleCoverageByContent=ruleCoverageByContent
	{ $current=$iv_ruleCoverageByContent.current; }
	EOF;

// Rule CoverageByContent
ruleCoverageByContent returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='CoverageByContent'
		{
			newLeafNode(otherlv_0, grammarAccess.getCoverageByContentAccess().getCoverageByContentKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getCoverageByContentAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='containmentReference'
		{
			newLeafNode(otherlv_2, grammarAccess.getCoverageByContentAccess().getContainmentReferenceKeyword_2());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCoverageByContentRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getCoverageByContentAccess().getContainmentReferenceEReferenceCrossReference_3_0());
				}
				ruleEString
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_4='multiplicity'
		{
			newLeafNode(otherlv_4, grammarAccess.getCoverageByContentAccess().getMultiplicityKeyword_4());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getCoverageByContentAccess().getMultiplicityCoveredContentsEnumRuleCall_5_0());
				}
				lv_multiplicity_5_0=ruleCoveredContents
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCoverageByContentRule());
					}
					set(
						$current,
						"multiplicity",
						lv_multiplicity_5_0,
						"coverage.dsl.xtext.COV.CoveredContents");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_6='}'
		{
			newLeafNode(otherlv_6, grammarAccess.getCoverageByContentAccess().getRightCurlyBracketKeyword_6());
		}
	)
;

// Entry rule entryRuleConditionalIgnore
entryRuleConditionalIgnore returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getConditionalIgnoreRule()); }
	iv_ruleConditionalIgnore=ruleConditionalIgnore
	{ $current=$iv_ruleConditionalIgnore.current; }
	EOF;

// Rule ConditionalIgnore
ruleConditionalIgnore returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='ConditionalIgnore'
		{
			newLeafNode(otherlv_0, grammarAccess.getConditionalIgnoreAccess().getConditionalIgnoreKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getConditionalIgnoreAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='condition'
		{
			newLeafNode(otherlv_2, grammarAccess.getConditionalIgnoreAccess().getConditionKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getConditionalIgnoreAccess().getConditionConditionTypeEnumRuleCall_3_0());
				}
				lv_condition_3_0=ruleConditionType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getConditionalIgnoreRule());
					}
					set(
						$current,
						"condition",
						lv_condition_3_0,
						"coverage.dsl.xtext.COV.ConditionType");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_4='containerType'
		{
			newLeafNode(otherlv_4, grammarAccess.getConditionalIgnoreAccess().getContainerTypeKeyword_4());
		}
		otherlv_5='('
		{
			newLeafNode(otherlv_5, grammarAccess.getConditionalIgnoreAccess().getLeftParenthesisKeyword_5());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getConditionalIgnoreRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getConditionalIgnoreAccess().getContainerTypeEClassCrossReference_6_0());
				}
				ruleEString
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_7=','
			{
				newLeafNode(otherlv_7, grammarAccess.getConditionalIgnoreAccess().getCommaKeyword_7_0());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getConditionalIgnoreRule());
						}
					}
					{
						newCompositeNode(grammarAccess.getConditionalIgnoreAccess().getContainerTypeEClassCrossReference_7_1_0());
					}
					ruleEString
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		otherlv_9=')'
		{
			newLeafNode(otherlv_9, grammarAccess.getConditionalIgnoreAccess().getRightParenthesisKeyword_8());
		}
		otherlv_10='}'
		{
			newLeafNode(otherlv_10, grammarAccess.getConditionalIgnoreAccess().getRightCurlyBracketKeyword_9());
		}
	)
;

// Rule CoveredContents
ruleCoveredContents returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='ALL'
			{
				$current = grammarAccess.getCoveredContentsAccess().getALLEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getCoveredContentsAccess().getALLEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='ONE'
			{
				$current = grammarAccess.getCoveredContentsAccess().getONEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getCoveredContentsAccess().getONEEnumLiteralDeclaration_1());
			}
		)
	)
;

// Rule ConditionType
ruleConditionType returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='INCLUSION'
			{
				$current = grammarAccess.getConditionTypeAccess().getINCLUSIONEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getConditionTypeAccess().getINCLUSIONEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='EXCLUSION'
			{
				$current = grammarAccess.getConditionTypeAccess().getEXCLUSIONEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getConditionTypeAccess().getEXCLUSIONEnumLiteralDeclaration_1());
			}
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
