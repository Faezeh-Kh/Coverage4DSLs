/*
 * generated by Xtext 2.28.0
 */
package coverage.dsl.xtext.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.EnumLiteralDeclaration;
import org.eclipse.xtext.EnumRule;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class COVGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class DomainSpecificCoverageElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "coverage.dsl.xtext.COV.DomainSpecificCoverage");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cDomainSpecificCoverageKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameEStringParserRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cImportKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Keyword cMetamodelKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cMetamodelAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final CrossReference cMetamodelEPackageCrossReference_5_0 = (CrossReference)cMetamodelAssignment_5.eContents().get(0);
		private final RuleCall cMetamodelEPackageEStringParserRuleCall_5_0_1 = (RuleCall)cMetamodelEPackageCrossReference_5_0.eContents().get(1);
		private final Assignment cContextsAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cContextsContextParserRuleCall_6_0 = (RuleCall)cContextsAssignment_6.eContents().get(0);
		private final Group cGroup_7 = (Group)cGroup.eContents().get(7);
		private final Keyword cCommaKeyword_7_0 = (Keyword)cGroup_7.eContents().get(0);
		private final Assignment cContextsAssignment_7_1 = (Assignment)cGroup_7.eContents().get(1);
		private final RuleCall cContextsContextParserRuleCall_7_1_0 = (RuleCall)cContextsAssignment_7_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_8 = (Keyword)cGroup.eContents().get(8);
		
		//DomainSpecificCoverage returns DomainSpecificCoverage:
		//    'DomainSpecificCoverage'
		//    name=EString
		//    '{'
		//        'Import' 'metamodel' metamodel=[ecore::EPackage|EString]
		//        contexts+=Context ( "," contexts+=Context)*
		//    '}';
		@Override public ParserRule getRule() { return rule; }
		
		//'DomainSpecificCoverage'
		//name=EString
		//'{'
		//    'Import' 'metamodel' metamodel=[ecore::EPackage|EString]
		//    contexts+=Context ( "," contexts+=Context)*
		//'}'
		public Group getGroup() { return cGroup; }
		
		//'DomainSpecificCoverage'
		public Keyword getDomainSpecificCoverageKeyword_0() { return cDomainSpecificCoverageKeyword_0; }
		
		//name=EString
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//EString
		public RuleCall getNameEStringParserRuleCall_1_0() { return cNameEStringParserRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//'Import'
		public Keyword getImportKeyword_3() { return cImportKeyword_3; }
		
		//'metamodel'
		public Keyword getMetamodelKeyword_4() { return cMetamodelKeyword_4; }
		
		//metamodel=[ecore::EPackage|EString]
		public Assignment getMetamodelAssignment_5() { return cMetamodelAssignment_5; }
		
		//[ecore::EPackage|EString]
		public CrossReference getMetamodelEPackageCrossReference_5_0() { return cMetamodelEPackageCrossReference_5_0; }
		
		//EString
		public RuleCall getMetamodelEPackageEStringParserRuleCall_5_0_1() { return cMetamodelEPackageEStringParserRuleCall_5_0_1; }
		
		//contexts+=Context
		public Assignment getContextsAssignment_6() { return cContextsAssignment_6; }
		
		//Context
		public RuleCall getContextsContextParserRuleCall_6_0() { return cContextsContextParserRuleCall_6_0; }
		
		//( "," contexts+=Context)*
		public Group getGroup_7() { return cGroup_7; }
		
		//","
		public Keyword getCommaKeyword_7_0() { return cCommaKeyword_7_0; }
		
		//contexts+=Context
		public Assignment getContextsAssignment_7_1() { return cContextsAssignment_7_1; }
		
		//Context
		public RuleCall getContextsContextParserRuleCall_7_1_0() { return cContextsContextParserRuleCall_7_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_8() { return cRightCurlyBracketKeyword_8; }
	}
	public class EStringElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "coverage.dsl.xtext.COV.EString");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cSTRINGTerminalRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//EString returns ecore::EString:
		//    STRING | ID;
		@Override public ParserRule getRule() { return rule; }
		
		//STRING | ID
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//STRING
		public RuleCall getSTRINGTerminalRuleCall_0() { return cSTRINGTerminalRuleCall_0; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_1() { return cIDTerminalRuleCall_1; }
	}
	public class ContextElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "coverage.dsl.xtext.COV.Context");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cContextKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cMetaclassAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cMetaclassEClassCrossReference_1_0 = (CrossReference)cMetaclassAssignment_1.eContents().get(0);
		private final RuleCall cMetaclassEClassEStringParserRuleCall_1_0_1 = (RuleCall)cMetaclassEClassCrossReference_1_0.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Assignment cRulesAssignment_3_0 = (Assignment)cGroup_3.eContents().get(0);
		private final RuleCall cRulesRuleParserRuleCall_3_0_0 = (RuleCall)cRulesAssignment_3_0.eContents().get(0);
		private final Group cGroup_3_1 = (Group)cGroup_3.eContents().get(1);
		private final Keyword cCommaKeyword_3_1_0 = (Keyword)cGroup_3_1.eContents().get(0);
		private final Assignment cRulesAssignment_3_1_1 = (Assignment)cGroup_3_1.eContents().get(1);
		private final RuleCall cRulesRuleParserRuleCall_3_1_1_0 = (RuleCall)cRulesAssignment_3_1_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//Context returns Context:
		//    'Context' metaclass=[ecore::EClass|EString]
		//    '{'
		//        (rules+=Rule ( "," rules+=Rule)*)?
		//    '}';
		@Override public ParserRule getRule() { return rule; }
		
		//'Context' metaclass=[ecore::EClass|EString]
		//'{'
		//    (rules+=Rule ( "," rules+=Rule)*)?
		//'}'
		public Group getGroup() { return cGroup; }
		
		//'Context'
		public Keyword getContextKeyword_0() { return cContextKeyword_0; }
		
		//metaclass=[ecore::EClass|EString]
		public Assignment getMetaclassAssignment_1() { return cMetaclassAssignment_1; }
		
		//[ecore::EClass|EString]
		public CrossReference getMetaclassEClassCrossReference_1_0() { return cMetaclassEClassCrossReference_1_0; }
		
		//EString
		public RuleCall getMetaclassEClassEStringParserRuleCall_1_0_1() { return cMetaclassEClassEStringParserRuleCall_1_0_1; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//(rules+=Rule ( "," rules+=Rule)*)?
		public Group getGroup_3() { return cGroup_3; }
		
		//rules+=Rule
		public Assignment getRulesAssignment_3_0() { return cRulesAssignment_3_0; }
		
		//Rule
		public RuleCall getRulesRuleParserRuleCall_3_0_0() { return cRulesRuleParserRuleCall_3_0_0; }
		
		//( "," rules+=Rule)*
		public Group getGroup_3_1() { return cGroup_3_1; }
		
		//","
		public Keyword getCommaKeyword_3_1_0() { return cCommaKeyword_3_1_0; }
		
		//rules+=Rule
		public Assignment getRulesAssignment_3_1_1() { return cRulesAssignment_3_1_1; }
		
		//Rule
		public RuleCall getRulesRuleParserRuleCall_3_1_1_0() { return cRulesRuleParserRuleCall_3_1_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}
	public class RuleElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "coverage.dsl.xtext.COV.Rule");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cIgnoreParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cCoverageOfReferencedParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cCoverageByContentParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cConditionalIgnoreParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		
		//Rule returns Rule:
		//    Ignore | CoverageOfReferenced | CoverageByContent | ConditionalIgnore;
		@Override public ParserRule getRule() { return rule; }
		
		//Ignore | CoverageOfReferenced | CoverageByContent | ConditionalIgnore
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//Ignore
		public RuleCall getIgnoreParserRuleCall_0() { return cIgnoreParserRuleCall_0; }
		
		//CoverageOfReferenced
		public RuleCall getCoverageOfReferencedParserRuleCall_1() { return cCoverageOfReferencedParserRuleCall_1; }
		
		//CoverageByContent
		public RuleCall getCoverageByContentParserRuleCall_2() { return cCoverageByContentParserRuleCall_2; }
		
		//ConditionalIgnore
		public RuleCall getConditionalIgnoreParserRuleCall_3() { return cConditionalIgnoreParserRuleCall_3; }
	}
	public class EBooleanElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "coverage.dsl.xtext.COV.EBoolean");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Keyword cTrueKeyword_0 = (Keyword)cAlternatives.eContents().get(0);
		private final Keyword cFalseKeyword_1 = (Keyword)cAlternatives.eContents().get(1);
		
		//EBoolean returns ecore::EBoolean:
		//    'true' | 'false';
		@Override public ParserRule getRule() { return rule; }
		
		//'true' | 'false'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//'true'
		public Keyword getTrueKeyword_0() { return cTrueKeyword_0; }
		
		//'false'
		public Keyword getFalseKeyword_1() { return cFalseKeyword_1; }
	}
	public class IgnoreElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "coverage.dsl.xtext.COV.Ignore");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cIgnoreAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cIgnoreKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cIgnoreSubtypesKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cIgnoreSubtypesAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cIgnoreSubtypesEBooleanParserRuleCall_3_1_0 = (RuleCall)cIgnoreSubtypesAssignment_3_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//Ignore returns Ignore:
		//    {Ignore}
		//    'Ignore'
		//    '{'
		//        ('ignoreSubtypes' ignoreSubtypes=EBoolean)?
		//    '}';
		@Override public ParserRule getRule() { return rule; }
		
		//{Ignore}
		//'Ignore'
		//'{'
		//    ('ignoreSubtypes' ignoreSubtypes=EBoolean)?
		//'}'
		public Group getGroup() { return cGroup; }
		
		//{Ignore}
		public Action getIgnoreAction_0() { return cIgnoreAction_0; }
		
		//'Ignore'
		public Keyword getIgnoreKeyword_1() { return cIgnoreKeyword_1; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//('ignoreSubtypes' ignoreSubtypes=EBoolean)?
		public Group getGroup_3() { return cGroup_3; }
		
		//'ignoreSubtypes'
		public Keyword getIgnoreSubtypesKeyword_3_0() { return cIgnoreSubtypesKeyword_3_0; }
		
		//ignoreSubtypes=EBoolean
		public Assignment getIgnoreSubtypesAssignment_3_1() { return cIgnoreSubtypesAssignment_3_1; }
		
		//EBoolean
		public RuleCall getIgnoreSubtypesEBooleanParserRuleCall_3_1_0() { return cIgnoreSubtypesEBooleanParserRuleCall_3_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}
	public class CoverageOfReferencedElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "coverage.dsl.xtext.COV.CoverageOfReferenced");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cCoverageOfReferencedKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cReferenceKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cReferenceAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final CrossReference cReferenceEReferenceCrossReference_3_0 = (CrossReference)cReferenceAssignment_3.eContents().get(0);
		private final RuleCall cReferenceEReferenceEStringParserRuleCall_3_0_1 = (RuleCall)cReferenceEReferenceCrossReference_3_0.eContents().get(1);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//CoverageOfReferenced returns CoverageOfReferenced:
		//    'CoverageOfReferenced'
		//    '{'
		//        'reference' reference=[ecore::EReference|EString]
		//    '}';
		@Override public ParserRule getRule() { return rule; }
		
		//'CoverageOfReferenced'
		//'{'
		//    'reference' reference=[ecore::EReference|EString]
		//'}'
		public Group getGroup() { return cGroup; }
		
		//'CoverageOfReferenced'
		public Keyword getCoverageOfReferencedKeyword_0() { return cCoverageOfReferencedKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'reference'
		public Keyword getReferenceKeyword_2() { return cReferenceKeyword_2; }
		
		//reference=[ecore::EReference|EString]
		public Assignment getReferenceAssignment_3() { return cReferenceAssignment_3; }
		
		//[ecore::EReference|EString]
		public CrossReference getReferenceEReferenceCrossReference_3_0() { return cReferenceEReferenceCrossReference_3_0; }
		
		//EString
		public RuleCall getReferenceEReferenceEStringParserRuleCall_3_0_1() { return cReferenceEReferenceEStringParserRuleCall_3_0_1; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}
	public class CoverageByContentElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "coverage.dsl.xtext.COV.CoverageByContent");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cCoverageByContentKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cContainmentReferenceKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cContainmentReferenceAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final CrossReference cContainmentReferenceEReferenceCrossReference_3_0 = (CrossReference)cContainmentReferenceAssignment_3.eContents().get(0);
		private final RuleCall cContainmentReferenceEReferenceEStringParserRuleCall_3_0_1 = (RuleCall)cContainmentReferenceEReferenceCrossReference_3_0.eContents().get(1);
		private final Keyword cMultiplicityKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cMultiplicityAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cMultiplicityCoveredContentsEnumRuleCall_5_0 = (RuleCall)cMultiplicityAssignment_5.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//CoverageByContent returns CoverageByContent:
		//    'CoverageByContent'
		//    '{'
		//        'containmentReference' containmentReference=[ecore::EReference|EString]
		//        'multiplicity' multiplicity=CoveredContents
		//    '}';
		@Override public ParserRule getRule() { return rule; }
		
		//'CoverageByContent'
		//'{'
		//    'containmentReference' containmentReference=[ecore::EReference|EString]
		//    'multiplicity' multiplicity=CoveredContents
		//'}'
		public Group getGroup() { return cGroup; }
		
		//'CoverageByContent'
		public Keyword getCoverageByContentKeyword_0() { return cCoverageByContentKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'containmentReference'
		public Keyword getContainmentReferenceKeyword_2() { return cContainmentReferenceKeyword_2; }
		
		//containmentReference=[ecore::EReference|EString]
		public Assignment getContainmentReferenceAssignment_3() { return cContainmentReferenceAssignment_3; }
		
		//[ecore::EReference|EString]
		public CrossReference getContainmentReferenceEReferenceCrossReference_3_0() { return cContainmentReferenceEReferenceCrossReference_3_0; }
		
		//EString
		public RuleCall getContainmentReferenceEReferenceEStringParserRuleCall_3_0_1() { return cContainmentReferenceEReferenceEStringParserRuleCall_3_0_1; }
		
		//'multiplicity'
		public Keyword getMultiplicityKeyword_4() { return cMultiplicityKeyword_4; }
		
		//multiplicity=CoveredContents
		public Assignment getMultiplicityAssignment_5() { return cMultiplicityAssignment_5; }
		
		//CoveredContents
		public RuleCall getMultiplicityCoveredContentsEnumRuleCall_5_0() { return cMultiplicityCoveredContentsEnumRuleCall_5_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
	}
	public class ConditionalIgnoreElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "coverage.dsl.xtext.COV.ConditionalIgnore");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cConditionalIgnoreKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cConditionKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cConditionAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cConditionConditionTypeEnumRuleCall_3_0 = (RuleCall)cConditionAssignment_3.eContents().get(0);
		private final Keyword cContainerTypeKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Keyword cLeftParenthesisKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cContainerTypeAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final CrossReference cContainerTypeEClassCrossReference_6_0 = (CrossReference)cContainerTypeAssignment_6.eContents().get(0);
		private final RuleCall cContainerTypeEClassEStringParserRuleCall_6_0_1 = (RuleCall)cContainerTypeEClassCrossReference_6_0.eContents().get(1);
		private final Group cGroup_7 = (Group)cGroup.eContents().get(7);
		private final Keyword cCommaKeyword_7_0 = (Keyword)cGroup_7.eContents().get(0);
		private final Assignment cContainerTypeAssignment_7_1 = (Assignment)cGroup_7.eContents().get(1);
		private final CrossReference cContainerTypeEClassCrossReference_7_1_0 = (CrossReference)cContainerTypeAssignment_7_1.eContents().get(0);
		private final RuleCall cContainerTypeEClassEStringParserRuleCall_7_1_0_1 = (RuleCall)cContainerTypeEClassCrossReference_7_1_0.eContents().get(1);
		private final Keyword cRightParenthesisKeyword_8 = (Keyword)cGroup.eContents().get(8);
		private final Keyword cRightCurlyBracketKeyword_9 = (Keyword)cGroup.eContents().get(9);
		
		//ConditionalIgnore returns ConditionalIgnore:
		//    'ConditionalIgnore'
		//    '{'
		//        'condition' condition=ConditionType
		//        'containerType' '(' containerType+=[ecore::EClass|EString] ( "," containerType+=[ecore::EClass|EString])* ')'
		//    '}';
		@Override public ParserRule getRule() { return rule; }
		
		//'ConditionalIgnore'
		//'{'
		//    'condition' condition=ConditionType
		//    'containerType' '(' containerType+=[ecore::EClass|EString] ( "," containerType+=[ecore::EClass|EString])* ')'
		//'}'
		public Group getGroup() { return cGroup; }
		
		//'ConditionalIgnore'
		public Keyword getConditionalIgnoreKeyword_0() { return cConditionalIgnoreKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'condition'
		public Keyword getConditionKeyword_2() { return cConditionKeyword_2; }
		
		//condition=ConditionType
		public Assignment getConditionAssignment_3() { return cConditionAssignment_3; }
		
		//ConditionType
		public RuleCall getConditionConditionTypeEnumRuleCall_3_0() { return cConditionConditionTypeEnumRuleCall_3_0; }
		
		//'containerType'
		public Keyword getContainerTypeKeyword_4() { return cContainerTypeKeyword_4; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_5() { return cLeftParenthesisKeyword_5; }
		
		//containerType+=[ecore::EClass|EString]
		public Assignment getContainerTypeAssignment_6() { return cContainerTypeAssignment_6; }
		
		//[ecore::EClass|EString]
		public CrossReference getContainerTypeEClassCrossReference_6_0() { return cContainerTypeEClassCrossReference_6_0; }
		
		//EString
		public RuleCall getContainerTypeEClassEStringParserRuleCall_6_0_1() { return cContainerTypeEClassEStringParserRuleCall_6_0_1; }
		
		//( "," containerType+=[ecore::EClass|EString])*
		public Group getGroup_7() { return cGroup_7; }
		
		//","
		public Keyword getCommaKeyword_7_0() { return cCommaKeyword_7_0; }
		
		//containerType+=[ecore::EClass|EString]
		public Assignment getContainerTypeAssignment_7_1() { return cContainerTypeAssignment_7_1; }
		
		//[ecore::EClass|EString]
		public CrossReference getContainerTypeEClassCrossReference_7_1_0() { return cContainerTypeEClassCrossReference_7_1_0; }
		
		//EString
		public RuleCall getContainerTypeEClassEStringParserRuleCall_7_1_0_1() { return cContainerTypeEClassEStringParserRuleCall_7_1_0_1; }
		
		//')'
		public Keyword getRightParenthesisKeyword_8() { return cRightParenthesisKeyword_8; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_9() { return cRightCurlyBracketKeyword_9; }
	}
	
	public class CoveredContentsElements extends AbstractElementFinder.AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "coverage.dsl.xtext.COV.CoveredContents");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cALLEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cALLALLKeyword_0_0 = (Keyword)cALLEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cONEEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cONEONEKeyword_1_0 = (Keyword)cONEEnumLiteralDeclaration_1.eContents().get(0);
		
		//enum CoveredContents returns CoveredContents:
		//                ALL = 'ALL' | ONE = 'ONE';
		public EnumRule getRule() { return rule; }
		
		//ALL = 'ALL' | ONE = 'ONE'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//ALL = 'ALL'
		public EnumLiteralDeclaration getALLEnumLiteralDeclaration_0() { return cALLEnumLiteralDeclaration_0; }
		
		//'ALL'
		public Keyword getALLALLKeyword_0_0() { return cALLALLKeyword_0_0; }
		
		//ONE = 'ONE'
		public EnumLiteralDeclaration getONEEnumLiteralDeclaration_1() { return cONEEnumLiteralDeclaration_1; }
		
		//'ONE'
		public Keyword getONEONEKeyword_1_0() { return cONEONEKeyword_1_0; }
	}
	public class ConditionTypeElements extends AbstractElementFinder.AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "coverage.dsl.xtext.COV.ConditionType");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cINCLUSIONEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cINCLUSIONINCLUSIONKeyword_0_0 = (Keyword)cINCLUSIONEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cEXCLUSIONEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cEXCLUSIONEXCLUSIONKeyword_1_0 = (Keyword)cEXCLUSIONEnumLiteralDeclaration_1.eContents().get(0);
		
		//enum ConditionType returns ConditionType:
		//                INCLUSION = 'INCLUSION' | EXCLUSION = 'EXCLUSION';
		public EnumRule getRule() { return rule; }
		
		//INCLUSION = 'INCLUSION' | EXCLUSION = 'EXCLUSION'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//INCLUSION = 'INCLUSION'
		public EnumLiteralDeclaration getINCLUSIONEnumLiteralDeclaration_0() { return cINCLUSIONEnumLiteralDeclaration_0; }
		
		//'INCLUSION'
		public Keyword getINCLUSIONINCLUSIONKeyword_0_0() { return cINCLUSIONINCLUSIONKeyword_0_0; }
		
		//EXCLUSION = 'EXCLUSION'
		public EnumLiteralDeclaration getEXCLUSIONEnumLiteralDeclaration_1() { return cEXCLUSIONEnumLiteralDeclaration_1; }
		
		//'EXCLUSION'
		public Keyword getEXCLUSIONEXCLUSIONKeyword_1_0() { return cEXCLUSIONEXCLUSIONKeyword_1_0; }
	}
	
	private final DomainSpecificCoverageElements pDomainSpecificCoverage;
	private final EStringElements pEString;
	private final ContextElements pContext;
	private final RuleElements pRule;
	private final EBooleanElements pEBoolean;
	private final IgnoreElements pIgnore;
	private final CoverageOfReferencedElements pCoverageOfReferenced;
	private final CoverageByContentElements pCoverageByContent;
	private final ConditionalIgnoreElements pConditionalIgnore;
	private final CoveredContentsElements eCoveredContents;
	private final ConditionTypeElements eConditionType;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public COVGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pDomainSpecificCoverage = new DomainSpecificCoverageElements();
		this.pEString = new EStringElements();
		this.pContext = new ContextElements();
		this.pRule = new RuleElements();
		this.pEBoolean = new EBooleanElements();
		this.pIgnore = new IgnoreElements();
		this.pCoverageOfReferenced = new CoverageOfReferencedElements();
		this.pCoverageByContent = new CoverageByContentElements();
		this.pConditionalIgnore = new ConditionalIgnoreElements();
		this.eCoveredContents = new CoveredContentsElements();
		this.eConditionType = new ConditionTypeElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("coverage.dsl.xtext.COV".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//DomainSpecificCoverage returns DomainSpecificCoverage:
	//    'DomainSpecificCoverage'
	//    name=EString
	//    '{'
	//        'Import' 'metamodel' metamodel=[ecore::EPackage|EString]
	//        contexts+=Context ( "," contexts+=Context)*
	//    '}';
	public DomainSpecificCoverageElements getDomainSpecificCoverageAccess() {
		return pDomainSpecificCoverage;
	}
	
	public ParserRule getDomainSpecificCoverageRule() {
		return getDomainSpecificCoverageAccess().getRule();
	}
	
	//EString returns ecore::EString:
	//    STRING | ID;
	public EStringElements getEStringAccess() {
		return pEString;
	}
	
	public ParserRule getEStringRule() {
		return getEStringAccess().getRule();
	}
	
	//Context returns Context:
	//    'Context' metaclass=[ecore::EClass|EString]
	//    '{'
	//        (rules+=Rule ( "," rules+=Rule)*)?
	//    '}';
	public ContextElements getContextAccess() {
		return pContext;
	}
	
	public ParserRule getContextRule() {
		return getContextAccess().getRule();
	}
	
	//Rule returns Rule:
	//    Ignore | CoverageOfReferenced | CoverageByContent | ConditionalIgnore;
	public RuleElements getRuleAccess() {
		return pRule;
	}
	
	public ParserRule getRuleRule() {
		return getRuleAccess().getRule();
	}
	
	//EBoolean returns ecore::EBoolean:
	//    'true' | 'false';
	public EBooleanElements getEBooleanAccess() {
		return pEBoolean;
	}
	
	public ParserRule getEBooleanRule() {
		return getEBooleanAccess().getRule();
	}
	
	//Ignore returns Ignore:
	//    {Ignore}
	//    'Ignore'
	//    '{'
	//        ('ignoreSubtypes' ignoreSubtypes=EBoolean)?
	//    '}';
	public IgnoreElements getIgnoreAccess() {
		return pIgnore;
	}
	
	public ParserRule getIgnoreRule() {
		return getIgnoreAccess().getRule();
	}
	
	//CoverageOfReferenced returns CoverageOfReferenced:
	//    'CoverageOfReferenced'
	//    '{'
	//        'reference' reference=[ecore::EReference|EString]
	//    '}';
	public CoverageOfReferencedElements getCoverageOfReferencedAccess() {
		return pCoverageOfReferenced;
	}
	
	public ParserRule getCoverageOfReferencedRule() {
		return getCoverageOfReferencedAccess().getRule();
	}
	
	//CoverageByContent returns CoverageByContent:
	//    'CoverageByContent'
	//    '{'
	//        'containmentReference' containmentReference=[ecore::EReference|EString]
	//        'multiplicity' multiplicity=CoveredContents
	//    '}';
	public CoverageByContentElements getCoverageByContentAccess() {
		return pCoverageByContent;
	}
	
	public ParserRule getCoverageByContentRule() {
		return getCoverageByContentAccess().getRule();
	}
	
	//ConditionalIgnore returns ConditionalIgnore:
	//    'ConditionalIgnore'
	//    '{'
	//        'condition' condition=ConditionType
	//        'containerType' '(' containerType+=[ecore::EClass|EString] ( "," containerType+=[ecore::EClass|EString])* ')'
	//    '}';
	public ConditionalIgnoreElements getConditionalIgnoreAccess() {
		return pConditionalIgnore;
	}
	
	public ParserRule getConditionalIgnoreRule() {
		return getConditionalIgnoreAccess().getRule();
	}
	
	//enum CoveredContents returns CoveredContents:
	//                ALL = 'ALL' | ONE = 'ONE';
	public CoveredContentsElements getCoveredContentsAccess() {
		return eCoveredContents;
	}
	
	public EnumRule getCoveredContentsRule() {
		return getCoveredContentsAccess().getRule();
	}
	
	//enum ConditionType returns ConditionType:
	//                INCLUSION = 'INCLUSION' | EXCLUSION = 'EXCLUSION';
	public ConditionTypeElements getConditionTypeAccess() {
		return eConditionType;
	}
	
	public EnumRule getConditionTypeRule() {
		return getConditionTypeAccess().getRule();
	}
	
	//terminal ID: '^'?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt: ('0'..'9')+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//            '"' ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|'"') )* '"' |
	//            "'" ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|"'") )* "'"
	//        ;
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT : '/*' -> '*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT : '//' !('\n'|'\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS         : (' '|'\t'|'\r'|'\n')+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER: .;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}