/*
 * generated by Xtext 2.28.0
 */
package coverage.dsl.xtext.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import coverage.dsl.xtext.ide.contentassist.antlr.internal.InternalCOVParser;
import coverage.dsl.xtext.services.COVGrammarAccess;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class COVParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(COVGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, COVGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
			builder.put(grammarAccess.getRuleAccess().getAlternatives(), "rule__Rule__Alternatives");
			builder.put(grammarAccess.getEBooleanAccess().getAlternatives(), "rule__EBoolean__Alternatives");
			builder.put(grammarAccess.getBranchAccess().getAlternatives(), "rule__Branch__Alternatives");
			builder.put(grammarAccess.getCoveredContentsAccess().getAlternatives(), "rule__CoveredContents__Alternatives");
			builder.put(grammarAccess.getLimitationTypeAccess().getAlternatives(), "rule__LimitationType__Alternatives");
			builder.put(grammarAccess.getDomainSpecificCoverageAccess().getGroup(), "rule__DomainSpecificCoverage__Group__0");
			builder.put(grammarAccess.getDomainSpecificCoverageAccess().getGroup_6(), "rule__DomainSpecificCoverage__Group_6__0");
			builder.put(grammarAccess.getDomainSpecificCoverageAccess().getGroup_6_3(), "rule__DomainSpecificCoverage__Group_6_3__0");
			builder.put(grammarAccess.getDomainSpecificCoverageAccess().getGroup_8(), "rule__DomainSpecificCoverage__Group_8__0");
			builder.put(grammarAccess.getContextAccess().getGroup(), "rule__Context__Group__0");
			builder.put(grammarAccess.getContextAccess().getGroup_3(), "rule__Context__Group_3__0");
			builder.put(grammarAccess.getContextAccess().getGroup_3_1(), "rule__Context__Group_3_1__0");
			builder.put(grammarAccess.getIgnoreAccess().getGroup(), "rule__Ignore__Group__0");
			builder.put(grammarAccess.getIgnoreAccess().getGroup_1(), "rule__Ignore__Group_1__0");
			builder.put(grammarAccess.getIgnoreAccess().getGroup_4(), "rule__Ignore__Group_4__0");
			builder.put(grammarAccess.getIgnoreAccess().getGroup_6(), "rule__Ignore__Group_6__0");
			builder.put(grammarAccess.getLimitedIgnoreAccess().getGroup(), "rule__LimitedIgnore__Group__0");
			builder.put(grammarAccess.getLimitedIgnoreAccess().getGroup_1(), "rule__LimitedIgnore__Group_1__0");
			builder.put(grammarAccess.getLimitedIgnoreAccess().getGroup_5(), "rule__LimitedIgnore__Group_5__0");
			builder.put(grammarAccess.getLimitedIgnoreAccess().getGroup_6(), "rule__LimitedIgnore__Group_6__0");
			builder.put(grammarAccess.getCoverageOfReferencedAccess().getGroup(), "rule__CoverageOfReferenced__Group__0");
			builder.put(grammarAccess.getCoverageOfReferencedAccess().getGroup_1(), "rule__CoverageOfReferenced__Group_1__0");
			builder.put(grammarAccess.getCoverageOfReferencedAccess().getGroup_4(), "rule__CoverageOfReferenced__Group_4__0");
			builder.put(grammarAccess.getCoverageOfReferencedAccess().getGroup_5(), "rule__CoverageOfReferenced__Group_5__0");
			builder.put(grammarAccess.getCoverageByContentAccess().getGroup(), "rule__CoverageByContent__Group__0");
			builder.put(grammarAccess.getCoverageByContentAccess().getGroup_1(), "rule__CoverageByContent__Group_1__0");
			builder.put(grammarAccess.getCoverageByContentAccess().getGroup_7(), "rule__CoverageByContent__Group_7__0");
			builder.put(grammarAccess.getBranchSpecificationAccess().getGroup(), "rule__BranchSpecification__Group__0");
			builder.put(grammarAccess.getBranchSpecificationAccess().getGroup_1(), "rule__BranchSpecification__Group_1__0");
			builder.put(grammarAccess.getBranchSpecificationAccess().getGroup_4(), "rule__BranchSpecification__Group_4__0");
			builder.put(grammarAccess.getBranchSpecificationAccess().getGroup_5(), "rule__BranchSpecification__Group_5__0");
			builder.put(grammarAccess.getExplicitBranchAccess().getGroup(), "rule__ExplicitBranch__Group__0");
			builder.put(grammarAccess.getImplicitBranchAccess().getGroup(), "rule__ImplicitBranch__Group__0");
			builder.put(grammarAccess.getDomainSpecificCoverageAccess().getNameAssignment_1(), "rule__DomainSpecificCoverage__NameAssignment_1");
			builder.put(grammarAccess.getDomainSpecificCoverageAccess().getMetamodelAssignment_5(), "rule__DomainSpecificCoverage__MetamodelAssignment_5");
			builder.put(grammarAccess.getDomainSpecificCoverageAccess().getImportsAssignment_6_2(), "rule__DomainSpecificCoverage__ImportsAssignment_6_2");
			builder.put(grammarAccess.getDomainSpecificCoverageAccess().getImportsAssignment_6_3_1(), "rule__DomainSpecificCoverage__ImportsAssignment_6_3_1");
			builder.put(grammarAccess.getDomainSpecificCoverageAccess().getContextsAssignment_7(), "rule__DomainSpecificCoverage__ContextsAssignment_7");
			builder.put(grammarAccess.getDomainSpecificCoverageAccess().getContextsAssignment_8_1(), "rule__DomainSpecificCoverage__ContextsAssignment_8_1");
			builder.put(grammarAccess.getContextAccess().getMetaclassAssignment_1(), "rule__Context__MetaclassAssignment_1");
			builder.put(grammarAccess.getContextAccess().getRulesAssignment_3_0(), "rule__Context__RulesAssignment_3_0");
			builder.put(grammarAccess.getContextAccess().getRulesAssignment_3_1_1(), "rule__Context__RulesAssignment_3_1_1");
			builder.put(grammarAccess.getIgnoreAccess().getConditionAssignment_1_1(), "rule__Ignore__ConditionAssignment_1_1");
			builder.put(grammarAccess.getIgnoreAccess().getIgnoreSubtypesAssignment_4_1(), "rule__Ignore__IgnoreSubtypesAssignment_4_1");
			builder.put(grammarAccess.getIgnoreAccess().getDescriptionAssignment_6_1(), "rule__Ignore__DescriptionAssignment_6_1");
			builder.put(grammarAccess.getLimitedIgnoreAccess().getConditionAssignment_1_1(), "rule__LimitedIgnore__ConditionAssignment_1_1");
			builder.put(grammarAccess.getLimitedIgnoreAccess().getTypeAssignment_3(), "rule__LimitedIgnore__TypeAssignment_3");
			builder.put(grammarAccess.getLimitedIgnoreAccess().getContainerMetaclassAssignment_4(), "rule__LimitedIgnore__ContainerMetaclassAssignment_4");
			builder.put(grammarAccess.getLimitedIgnoreAccess().getContainerMetaclassAssignment_5_1(), "rule__LimitedIgnore__ContainerMetaclassAssignment_5_1");
			builder.put(grammarAccess.getLimitedIgnoreAccess().getDescriptionAssignment_6_1(), "rule__LimitedIgnore__DescriptionAssignment_6_1");
			builder.put(grammarAccess.getCoverageOfReferencedAccess().getConditionAssignment_1_1(), "rule__CoverageOfReferenced__ConditionAssignment_1_1");
			builder.put(grammarAccess.getCoverageOfReferencedAccess().getReferenceAssignment_3(), "rule__CoverageOfReferenced__ReferenceAssignment_3");
			builder.put(grammarAccess.getCoverageOfReferencedAccess().getReferenceAssignment_4_1(), "rule__CoverageOfReferenced__ReferenceAssignment_4_1");
			builder.put(grammarAccess.getCoverageOfReferencedAccess().getDescriptionAssignment_5_1(), "rule__CoverageOfReferenced__DescriptionAssignment_5_1");
			builder.put(grammarAccess.getCoverageByContentAccess().getConditionAssignment_1_1(), "rule__CoverageByContent__ConditionAssignment_1_1");
			builder.put(grammarAccess.getCoverageByContentAccess().getMultiplicityAssignment_4(), "rule__CoverageByContent__MultiplicityAssignment_4");
			builder.put(grammarAccess.getCoverageByContentAccess().getContainmentReferenceAssignment_5(), "rule__CoverageByContent__ContainmentReferenceAssignment_5");
			builder.put(grammarAccess.getCoverageByContentAccess().getDescriptionAssignment_7_1(), "rule__CoverageByContent__DescriptionAssignment_7_1");
			builder.put(grammarAccess.getBranchSpecificationAccess().getConditionAssignment_1_1(), "rule__BranchSpecification__ConditionAssignment_1_1");
			builder.put(grammarAccess.getBranchSpecificationAccess().getBranchesAssignment_3(), "rule__BranchSpecification__BranchesAssignment_3");
			builder.put(grammarAccess.getBranchSpecificationAccess().getBranchesAssignment_4_1(), "rule__BranchSpecification__BranchesAssignment_4_1");
			builder.put(grammarAccess.getBranchSpecificationAccess().getDescriptionAssignment_5_1(), "rule__BranchSpecification__DescriptionAssignment_5_1");
			builder.put(grammarAccess.getExplicitBranchAccess().getOCLQueryAssignment_1(), "rule__ExplicitBranch__OCLQueryAssignment_1");
			builder.put(grammarAccess.getConditionAccess().getOCLConstraintAssignment(), "rule__Condition__OCLConstraintAssignment");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private COVGrammarAccess grammarAccess;

	@Override
	protected InternalCOVParser createParser() {
		InternalCOVParser result = new InternalCOVParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public COVGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(COVGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
