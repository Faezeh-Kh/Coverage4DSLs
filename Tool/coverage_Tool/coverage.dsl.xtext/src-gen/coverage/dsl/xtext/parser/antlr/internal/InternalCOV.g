/*
 * generated by Xtext 2.27.0
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
		otherlv_0='ruleset'
		{
			newLeafNode(otherlv_0, grammarAccess.getDomainSpecificCoverageAccess().getRulesetKeyword_0());
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
		otherlv_3='import'
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
			otherlv_6='import'
			{
				newLeafNode(otherlv_6, grammarAccess.getDomainSpecificCoverageAccess().getImportKeyword_6_0());
			}
			otherlv_7='ruleset'
			{
				newLeafNode(otherlv_7, grammarAccess.getDomainSpecificCoverageAccess().getRulesetKeyword_6_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getDomainSpecificCoverageAccess().getImportsImportParserRuleCall_6_2_0());
					}
					lv_imports_8_0=ruleImport
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getDomainSpecificCoverageRule());
						}
						add(
							$current,
							"imports",
							lv_imports_8_0,
							"coverage.dsl.xtext.COV.Import");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_9=','
				{
					newLeafNode(otherlv_9, grammarAccess.getDomainSpecificCoverageAccess().getCommaKeyword_6_3_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getDomainSpecificCoverageAccess().getImportsImportParserRuleCall_6_3_1_0());
						}
						lv_imports_10_0=ruleImport
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getDomainSpecificCoverageRule());
							}
							add(
								$current,
								"imports",
								lv_imports_10_0,
								"coverage.dsl.xtext.COV.Import");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getDomainSpecificCoverageAccess().getContextsContextParserRuleCall_7_0());
				}
				lv_contexts_11_0=ruleContext
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDomainSpecificCoverageRule());
					}
					add(
						$current,
						"contexts",
						lv_contexts_11_0,
						"coverage.dsl.xtext.COV.Context");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_12=','
			{
				newLeafNode(otherlv_12, grammarAccess.getDomainSpecificCoverageAccess().getCommaKeyword_8_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getDomainSpecificCoverageAccess().getContextsContextParserRuleCall_8_1_0());
					}
					lv_contexts_13_0=ruleContext
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getDomainSpecificCoverageRule());
						}
						add(
							$current,
							"contexts",
							lv_contexts_13_0,
							"coverage.dsl.xtext.COV.Context");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		otherlv_14='}'
		{
			newLeafNode(otherlv_14, grammarAccess.getDomainSpecificCoverageAccess().getRightCurlyBracketKeyword_9());
		}
	)
;

// Entry rule entryRuleImport
entryRuleImport returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getImportRule()); }
	iv_ruleImport=ruleImport
	{ $current=$iv_ruleImport.current; }
	EOF;

// Rule Import
ruleImport returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getImportAccess().getImportAction_0_0(),
						$current);
				}
			)
			(
				otherlv_1='with'
				{
					newLeafNode(otherlv_1, grammarAccess.getImportAccess().getWithKeyword_0_1_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceImportedFQNParserRuleCall_0_1_1_0());
						}
						lv_importedNamespace_2_0=ruleImportedFQN
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getImportRule());
							}
							set(
								$current,
								"importedNamespace",
								lv_importedNamespace_2_0,
								"coverage.dsl.xtext.COV.ImportedFQN");
							afterParserOrEnumRuleCall();
						}
					)
				)
				(
					otherlv_3='from'
					{
						newLeafNode(otherlv_3, grammarAccess.getImportAccess().getFromKeyword_0_1_2_0());
					}
					(
						(
							lv_importURI_4_0=RULE_STRING
							{
								newLeafNode(lv_importURI_4_0, grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_0_1_2_1_0());
							}
							{
								if ($current==null) {
									$current = createModelElement(grammarAccess.getImportRule());
								}
								setWithLastConsumed(
									$current,
									"importURI",
									lv_importURI_4_0,
									"org.eclipse.xtext.common.Terminals.STRING");
							}
						)
					)
				)?
			)
		)
		    |
		(
			otherlv_5='from'
			{
				newLeafNode(otherlv_5, grammarAccess.getImportAccess().getFromKeyword_1_0());
			}
			(
				(
					lv_importURI_6_0=RULE_STRING
					{
						newLeafNode(lv_importURI_6_0, grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_1_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getImportRule());
						}
						setWithLastConsumed(
							$current,
							"importURI",
							lv_importURI_6_0,
							"org.eclipse.xtext.common.Terminals.STRING");
					}
				)
			)
		)
		    |
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getImportRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getImportAccess().getImportedRulesetDomainSpecificCoverageCrossReference_2_0());
				}
				ruleEString
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleQualifiedName
entryRuleQualifiedName returns [String current=null]:
	{ newCompositeNode(grammarAccess.getQualifiedNameRule()); }
	iv_ruleQualifiedName=ruleQualifiedName
	{ $current=$iv_ruleQualifiedName.current.getText(); }
	EOF;

// Rule QualifiedName
ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_ID_0=RULE_ID
		{
			$current.merge(this_ID_0);
		}
		{
			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
		}
		(
			kw='::'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getColonColonKeyword_1_0());
			}
			this_ID_2=RULE_ID
			{
				$current.merge(this_ID_2);
			}
			{
				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
			}
		)*
	)
;

// Entry rule entryRuleImportedFQN
entryRuleImportedFQN returns [String current=null]:
	{ newCompositeNode(grammarAccess.getImportedFQNRule()); }
	iv_ruleImportedFQN=ruleImportedFQN
	{ $current=$iv_ruleImportedFQN.current.getText(); }
	EOF;

// Rule ImportedFQN
ruleImportedFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getImportedFQNAccess().getQualifiedNameParserRuleCall_0());
		}
		this_QualifiedName_0=ruleQualifiedName
		{
			$current.merge(this_QualifiedName_0);
		}
		{
			afterParserOrEnumRuleCall();
		}
		(
			kw='::'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getImportedFQNAccess().getColonColonKeyword_1_0());
			}
			kw='*'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getImportedFQNAccess().getAsteriskKeyword_1_1());
			}
		)?
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
		otherlv_0='context'
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
			newCompositeNode(grammarAccess.getRuleAccess().getLimitedIgnoreParserRuleCall_1());
		}
		this_LimitedIgnore_1=ruleLimitedIgnore
		{
			$current = $this_LimitedIgnore_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getRuleAccess().getCoverageOfReferencedParserRuleCall_2());
		}
		this_CoverageOfReferenced_2=ruleCoverageOfReferenced
		{
			$current = $this_CoverageOfReferenced_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getRuleAccess().getCoverageByContentParserRuleCall_3());
		}
		this_CoverageByContent_3=ruleCoverageByContent
		{
			$current = $this_CoverageByContent_3.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getRuleAccess().getBranchSpecificationParserRuleCall_4());
		}
		this_BranchSpecification_4=ruleBranchSpecification
		{
			$current = $this_BranchSpecification_4.current;
			afterParserOrEnumRuleCall();
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
		(
			otherlv_1='when'
			{
				newLeafNode(otherlv_1, grammarAccess.getIgnoreAccess().getWhenKeyword_1_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getIgnoreAccess().getConditionConditionParserRuleCall_1_1_0());
					}
					lv_condition_2_0=ruleCondition
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getIgnoreRule());
						}
						set(
							$current,
							"condition",
							lv_condition_2_0,
							"coverage.dsl.xtext.COV.Condition");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		otherlv_3='ignore'
		{
			newLeafNode(otherlv_3, grammarAccess.getIgnoreAccess().getIgnoreKeyword_2());
		}
		otherlv_4='('
		{
			newLeafNode(otherlv_4, grammarAccess.getIgnoreAccess().getLeftParenthesisKeyword_3());
		}
		(
			otherlv_5='subtypes'
			{
				newLeafNode(otherlv_5, grammarAccess.getIgnoreAccess().getSubtypesKeyword_4_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getIgnoreAccess().getIgnoreSubtypesEBooleanParserRuleCall_4_1_0());
					}
					lv_ignoreSubtypes_6_0=ruleEBoolean
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getIgnoreRule());
						}
						set(
							$current,
							"ignoreSubtypes",
							lv_ignoreSubtypes_6_0,
							"coverage.dsl.xtext.COV.EBoolean");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		otherlv_7=')'
		{
			newLeafNode(otherlv_7, grammarAccess.getIgnoreAccess().getRightParenthesisKeyword_5());
		}
		(
			otherlv_8='description'
			{
				newLeafNode(otherlv_8, grammarAccess.getIgnoreAccess().getDescriptionKeyword_6_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getIgnoreAccess().getDescriptionEStringParserRuleCall_6_1_0());
					}
					lv_description_9_0=ruleEString
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getIgnoreRule());
						}
						set(
							$current,
							"description",
							lv_description_9_0,
							"coverage.dsl.xtext.COV.EString");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
	)
;

// Entry rule entryRuleLimitedIgnore
entryRuleLimitedIgnore returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getLimitedIgnoreRule()); }
	iv_ruleLimitedIgnore=ruleLimitedIgnore
	{ $current=$iv_ruleLimitedIgnore.current; }
	EOF;

// Rule LimitedIgnore
ruleLimitedIgnore returns [EObject current=null]
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
					grammarAccess.getLimitedIgnoreAccess().getLimitedIgnoreAction_0(),
					$current);
			}
		)
		(
			otherlv_1='when'
			{
				newLeafNode(otherlv_1, grammarAccess.getLimitedIgnoreAccess().getWhenKeyword_1_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getLimitedIgnoreAccess().getConditionConditionParserRuleCall_1_1_0());
					}
					lv_condition_2_0=ruleCondition
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getLimitedIgnoreRule());
						}
						set(
							$current,
							"condition",
							lv_condition_2_0,
							"coverage.dsl.xtext.COV.Condition");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		otherlv_3='ignoreif'
		{
			newLeafNode(otherlv_3, grammarAccess.getLimitedIgnoreAccess().getIgnoreifKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getLimitedIgnoreAccess().getTypeLimitationTypeEnumRuleCall_3_0());
				}
				lv_type_4_0=ruleLimitationType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getLimitedIgnoreRule());
					}
					set(
						$current,
						"type",
						lv_type_4_0,
						"coverage.dsl.xtext.COV.LimitationType");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getLimitedIgnoreRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getLimitedIgnoreAccess().getContainerMetaclassEClassCrossReference_4_0());
				}
				ruleEString
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_6=','
			{
				newLeafNode(otherlv_6, grammarAccess.getLimitedIgnoreAccess().getCommaKeyword_5_0());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getLimitedIgnoreRule());
						}
					}
					{
						newCompositeNode(grammarAccess.getLimitedIgnoreAccess().getContainerMetaclassEClassCrossReference_5_1_0());
					}
					ruleEString
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		(
			otherlv_8='description'
			{
				newLeafNode(otherlv_8, grammarAccess.getLimitedIgnoreAccess().getDescriptionKeyword_6_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getLimitedIgnoreAccess().getDescriptionEStringParserRuleCall_6_1_0());
					}
					lv_description_9_0=ruleEString
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getLimitedIgnoreRule());
						}
						set(
							$current,
							"description",
							lv_description_9_0,
							"coverage.dsl.xtext.COV.EString");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
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
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getCoverageOfReferencedAccess().getCoverageOfReferencedAction_0(),
					$current);
			}
		)
		(
			otherlv_1='when'
			{
				newLeafNode(otherlv_1, grammarAccess.getCoverageOfReferencedAccess().getWhenKeyword_1_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getCoverageOfReferencedAccess().getConditionConditionParserRuleCall_1_1_0());
					}
					lv_condition_2_0=ruleCondition
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getCoverageOfReferencedRule());
						}
						set(
							$current,
							"condition",
							lv_condition_2_0,
							"coverage.dsl.xtext.COV.Condition");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		otherlv_3='covers'
		{
			newLeafNode(otherlv_3, grammarAccess.getCoverageOfReferencedAccess().getCoversKeyword_2());
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
		(
			otherlv_5=','
			{
				newLeafNode(otherlv_5, grammarAccess.getCoverageOfReferencedAccess().getCommaKeyword_4_0());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getCoverageOfReferencedRule());
						}
					}
					{
						newCompositeNode(grammarAccess.getCoverageOfReferencedAccess().getReferenceEReferenceCrossReference_4_1_0());
					}
					ruleEString
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		(
			otherlv_7='description'
			{
				newLeafNode(otherlv_7, grammarAccess.getCoverageOfReferencedAccess().getDescriptionKeyword_5_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getCoverageOfReferencedAccess().getDescriptionEStringParserRuleCall_5_1_0());
					}
					lv_description_8_0=ruleEString
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getCoverageOfReferencedRule());
						}
						set(
							$current,
							"description",
							lv_description_8_0,
							"coverage.dsl.xtext.COV.EString");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
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
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getCoverageByContentAccess().getCoverageByContentAction_0(),
					$current);
			}
		)
		(
			otherlv_1='when'
			{
				newLeafNode(otherlv_1, grammarAccess.getCoverageByContentAccess().getWhenKeyword_1_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getCoverageByContentAccess().getConditionConditionParserRuleCall_1_1_0());
					}
					lv_condition_2_0=ruleCondition
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getCoverageByContentRule());
						}
						set(
							$current,
							"condition",
							lv_condition_2_0,
							"coverage.dsl.xtext.COV.Condition");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		otherlv_3='covered'
		{
			newLeafNode(otherlv_3, grammarAccess.getCoverageByContentAccess().getCoveredKeyword_2());
		}
		otherlv_4='when'
		{
			newLeafNode(otherlv_4, grammarAccess.getCoverageByContentAccess().getWhenKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getCoverageByContentAccess().getMultiplicityCoveredContentsEnumRuleCall_4_0());
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
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCoverageByContentRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getCoverageByContentAccess().getContainmentReferenceEReferenceCrossReference_5_0());
				}
				ruleEString
				{
					afterParserOrEnumRuleCall();
				}
			)
		)?
		otherlv_7='iscovered'
		{
			newLeafNode(otherlv_7, grammarAccess.getCoverageByContentAccess().getIscoveredKeyword_6());
		}
		(
			otherlv_8='description'
			{
				newLeafNode(otherlv_8, grammarAccess.getCoverageByContentAccess().getDescriptionKeyword_7_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getCoverageByContentAccess().getDescriptionEStringParserRuleCall_7_1_0());
					}
					lv_description_9_0=ruleEString
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getCoverageByContentRule());
						}
						set(
							$current,
							"description",
							lv_description_9_0,
							"coverage.dsl.xtext.COV.EString");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
	)
;

// Entry rule entryRuleBranchSpecification
entryRuleBranchSpecification returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getBranchSpecificationRule()); }
	iv_ruleBranchSpecification=ruleBranchSpecification
	{ $current=$iv_ruleBranchSpecification.current; }
	EOF;

// Rule BranchSpecification
ruleBranchSpecification returns [EObject current=null]
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
					grammarAccess.getBranchSpecificationAccess().getBranchSpecificationAction_0(),
					$current);
			}
		)
		(
			otherlv_1='when'
			{
				newLeafNode(otherlv_1, grammarAccess.getBranchSpecificationAccess().getWhenKeyword_1_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getBranchSpecificationAccess().getConditionConditionParserRuleCall_1_1_0());
					}
					lv_condition_2_0=ruleCondition
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getBranchSpecificationRule());
						}
						set(
							$current,
							"condition",
							lv_condition_2_0,
							"coverage.dsl.xtext.COV.Condition");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		otherlv_3='{'
		{
			newLeafNode(otherlv_3, grammarAccess.getBranchSpecificationAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getBranchSpecificationAccess().getBranchesBranchParserRuleCall_3_0());
				}
				lv_branches_4_0=ruleBranch
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getBranchSpecificationRule());
					}
					add(
						$current,
						"branches",
						lv_branches_4_0,
						"coverage.dsl.xtext.COV.Branch");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_5=','
			{
				newLeafNode(otherlv_5, grammarAccess.getBranchSpecificationAccess().getCommaKeyword_4_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getBranchSpecificationAccess().getBranchesBranchParserRuleCall_4_1_0());
					}
					lv_branches_6_0=ruleBranch
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getBranchSpecificationRule());
						}
						add(
							$current,
							"branches",
							lv_branches_6_0,
							"coverage.dsl.xtext.COV.Branch");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		(
			otherlv_7='description'
			{
				newLeafNode(otherlv_7, grammarAccess.getBranchSpecificationAccess().getDescriptionKeyword_5_0());
			}
			(
				(
					lv_description_8_0=RULE_STRING
					{
						newLeafNode(lv_description_8_0, grammarAccess.getBranchSpecificationAccess().getDescriptionSTRINGTerminalRuleCall_5_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getBranchSpecificationRule());
						}
						setWithLastConsumed(
							$current,
							"description",
							lv_description_8_0,
							"org.eclipse.xtext.common.Terminals.STRING");
					}
				)
			)
		)?
		otherlv_9='}'
		{
			newLeafNode(otherlv_9, grammarAccess.getBranchSpecificationAccess().getRightCurlyBracketKeyword_6());
		}
	)
;

// Entry rule entryRuleBranch
entryRuleBranch returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getBranchRule()); }
	iv_ruleBranch=ruleBranch
	{ $current=$iv_ruleBranch.current; }
	EOF;

// Rule Branch
ruleBranch returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getBranchAccess().getImplicitBranchParserRuleCall_0());
		}
		this_ImplicitBranch_0=ruleImplicitBranch
		{
			$current = $this_ImplicitBranch_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getBranchAccess().getExplicitBranchParserRuleCall_1());
		}
		this_ExplicitBranch_1=ruleExplicitBranch
		{
			$current = $this_ExplicitBranch_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleExplicitBranch
entryRuleExplicitBranch returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getExplicitBranchRule()); }
	iv_ruleExplicitBranch=ruleExplicitBranch
	{ $current=$iv_ruleExplicitBranch.current; }
	EOF;

// Rule ExplicitBranch
ruleExplicitBranch returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='branch'
		{
			newLeafNode(otherlv_0, grammarAccess.getExplicitBranchAccess().getBranchKeyword_0());
		}
		(
			(
				lv_OCLQuery_1_0=RULE_STRING
				{
					newLeafNode(lv_OCLQuery_1_0, grammarAccess.getExplicitBranchAccess().getOCLQuerySTRINGTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getExplicitBranchRule());
					}
					setWithLastConsumed(
						$current,
						"OCLQuery",
						lv_OCLQuery_1_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
	)
;

// Entry rule entryRuleImplicitBranch
entryRuleImplicitBranch returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getImplicitBranchRule()); }
	iv_ruleImplicitBranch=ruleImplicitBranch
	{ $current=$iv_ruleImplicitBranch.current; }
	EOF;

// Rule ImplicitBranch
ruleImplicitBranch returns [EObject current=null]
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
					grammarAccess.getImplicitBranchAccess().getImplicitBranchAction_0(),
					$current);
			}
		)
		otherlv_1='branch'
		{
			newLeafNode(otherlv_1, grammarAccess.getImplicitBranchAccess().getBranchKeyword_1());
		}
		otherlv_2='else'
		{
			newLeafNode(otherlv_2, grammarAccess.getImplicitBranchAccess().getElseKeyword_2());
		}
	)
;

// Entry rule entryRuleCondition
entryRuleCondition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getConditionRule()); }
	iv_ruleCondition=ruleCondition
	{ $current=$iv_ruleCondition.current; }
	EOF;

// Rule Condition
ruleCondition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_OCLConstraint_0_0=RULE_STRING
			{
				newLeafNode(lv_OCLConstraint_0_0, grammarAccess.getConditionAccess().getOCLConstraintSTRINGTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getConditionRule());
				}
				setWithLastConsumed(
					$current,
					"OCLConstraint",
					lv_OCLConstraint_0_0,
					"org.eclipse.xtext.common.Terminals.STRING");
			}
		)
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
		    |
		(
			enumLiteral_2='anyContent'
			{
				$current = grammarAccess.getCoveredContentsAccess().getANYEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getCoveredContentsAccess().getANYEnumLiteralDeclaration_2());
			}
		)
	)
;

// Rule LimitationType
ruleLimitationType returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='containedBy'
			{
				$current = grammarAccess.getLimitationTypeAccess().getContainedByEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getLimitationTypeAccess().getContainedByEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='notContainedBy'
			{
				$current = grammarAccess.getLimitationTypeAccess().getNotContainedByEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getLimitationTypeAccess().getNotContainedByEnumLiteralDeclaration_1());
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
