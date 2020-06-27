package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object wafregional {
  type Action                        = String
  type ActivatedRules                = js.Array[ActivatedRule]
  type ByteMatchSetSummaries         = js.Array[ByteMatchSetSummary]
  type ByteMatchSetUpdates           = js.Array[ByteMatchSetUpdate]
  type ByteMatchTargetString         = js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type ByteMatchTuples               = js.Array[ByteMatchTuple]
  type ChangeToken                   = String
  type Country                       = String
  type ExcludedRules                 = js.Array[ExcludedRule]
  type GeoMatchConstraints           = js.Array[GeoMatchConstraint]
  type GeoMatchSetSummaries          = js.Array[GeoMatchSetSummary]
  type GeoMatchSetUpdates            = js.Array[GeoMatchSetUpdate]
  type GetSampledRequestsMaxItems    = Double
  type HTTPHeaders                   = js.Array[HTTPHeader]
  type HTTPMethod                    = String
  type HTTPVersion                   = String
  type HeaderName                    = String
  type HeaderValue                   = String
  type IPSetDescriptorValue          = String
  type IPSetDescriptors              = js.Array[IPSetDescriptor]
  type IPSetSummaries                = js.Array[IPSetSummary]
  type IPSetUpdates                  = js.Array[IPSetUpdate]
  type IPString                      = String
  type LogDestinationConfigs         = js.Array[ResourceArn]
  type LoggingConfigurations         = js.Array[LoggingConfiguration]
  type ManagedKey                    = String
  type ManagedKeys                   = js.Array[ManagedKey]
  type MatchFieldData                = String
  type MetricName                    = String
  type Negated                       = Boolean
  type NextMarker                    = String
  type PaginationLimit               = Int
  type PolicyString                  = String
  type PopulationSize                = Double
  type Predicates                    = js.Array[Predicate]
  type RateLimit                     = Double
  type RedactedFields                = js.Array[FieldToMatch]
  type RegexMatchSetSummaries        = js.Array[RegexMatchSetSummary]
  type RegexMatchSetUpdates          = js.Array[RegexMatchSetUpdate]
  type RegexMatchTuples              = js.Array[RegexMatchTuple]
  type RegexPatternSetSummaries      = js.Array[RegexPatternSetSummary]
  type RegexPatternSetUpdates        = js.Array[RegexPatternSetUpdate]
  type RegexPatternString            = String
  type RegexPatternStrings           = js.Array[RegexPatternString]
  type ResourceArn                   = String
  type ResourceArns                  = js.Array[ResourceArn]
  type ResourceId                    = String
  type ResourceName                  = String
  type RuleGroupSummaries            = js.Array[RuleGroupSummary]
  type RuleGroupUpdates              = js.Array[RuleGroupUpdate]
  type RulePriority                  = Int
  type RuleSummaries                 = js.Array[RuleSummary]
  type RuleUpdates                   = js.Array[RuleUpdate]
  type SampleWeight                  = Double
  type SampledHTTPRequests           = js.Array[SampledHTTPRequest]
  type Size                          = Double
  type SizeConstraintSetSummaries    = js.Array[SizeConstraintSetSummary]
  type SizeConstraintSetUpdates      = js.Array[SizeConstraintSetUpdate]
  type SizeConstraints               = js.Array[SizeConstraint]
  type SqlInjectionMatchSetSummaries = js.Array[SqlInjectionMatchSetSummary]
  type SqlInjectionMatchSetUpdates   = js.Array[SqlInjectionMatchSetUpdate]
  type SqlInjectionMatchTuples       = js.Array[SqlInjectionMatchTuple]
  type SubscribedRuleGroupSummaries  = js.Array[SubscribedRuleGroupSummary]
  type TagKey                        = String
  type TagKeyList                    = js.Array[TagKey]
  type TagList                       = js.Array[Tag]
  type TagValue                      = String
  type Timestamp                     = js.Date
  type URIString                     = String
  type WebACLSummaries               = js.Array[WebACLSummary]
  type WebACLUpdates                 = js.Array[WebACLUpdate]
  type XssMatchSetSummaries          = js.Array[XssMatchSetSummary]
  type XssMatchSetUpdates            = js.Array[XssMatchSetUpdate]
  type XssMatchTuples                = js.Array[XssMatchTuple]

  implicit final class WAFRegionalOps(private val service: WAFRegional) extends AnyVal {

    @inline def associateWebACLFuture(params: AssociateWebACLRequest): Future[AssociateWebACLResponse] =
      service.associateWebACL(params).promise().toFuture
    @inline def createByteMatchSetFuture(params: CreateByteMatchSetRequest): Future[CreateByteMatchSetResponse] =
      service.createByteMatchSet(params).promise().toFuture
    @inline def createGeoMatchSetFuture(params: CreateGeoMatchSetRequest): Future[CreateGeoMatchSetResponse] =
      service.createGeoMatchSet(params).promise().toFuture
    @inline def createIPSetFuture(params: CreateIPSetRequest): Future[CreateIPSetResponse] =
      service.createIPSet(params).promise().toFuture
    @inline def createRateBasedRuleFuture(params: CreateRateBasedRuleRequest): Future[CreateRateBasedRuleResponse] =
      service.createRateBasedRule(params).promise().toFuture
    @inline def createRegexMatchSetFuture(params: CreateRegexMatchSetRequest): Future[CreateRegexMatchSetResponse] =
      service.createRegexMatchSet(params).promise().toFuture
    @inline def createRegexPatternSetFuture(
        params: CreateRegexPatternSetRequest
    ): Future[CreateRegexPatternSetResponse] = service.createRegexPatternSet(params).promise().toFuture
    @inline def createRuleFuture(params: CreateRuleRequest): Future[CreateRuleResponse] =
      service.createRule(params).promise().toFuture
    @inline def createRuleGroupFuture(params: CreateRuleGroupRequest): Future[CreateRuleGroupResponse] =
      service.createRuleGroup(params).promise().toFuture
    @inline def createSizeConstraintSetFuture(
        params: CreateSizeConstraintSetRequest
    ): Future[CreateSizeConstraintSetResponse] = service.createSizeConstraintSet(params).promise().toFuture
    @inline def createSqlInjectionMatchSetFuture(
        params: CreateSqlInjectionMatchSetRequest
    ): Future[CreateSqlInjectionMatchSetResponse] = service.createSqlInjectionMatchSet(params).promise().toFuture
    @inline def createWebACLFuture(params: CreateWebACLRequest): Future[CreateWebACLResponse] =
      service.createWebACL(params).promise().toFuture
    @inline def createXssMatchSetFuture(params: CreateXssMatchSetRequest): Future[CreateXssMatchSetResponse] =
      service.createXssMatchSet(params).promise().toFuture
    @inline def deleteByteMatchSetFuture(params: DeleteByteMatchSetRequest): Future[DeleteByteMatchSetResponse] =
      service.deleteByteMatchSet(params).promise().toFuture
    @inline def deleteGeoMatchSetFuture(params: DeleteGeoMatchSetRequest): Future[DeleteGeoMatchSetResponse] =
      service.deleteGeoMatchSet(params).promise().toFuture
    @inline def deleteIPSetFuture(params: DeleteIPSetRequest): Future[DeleteIPSetResponse] =
      service.deleteIPSet(params).promise().toFuture
    @inline def deleteLoggingConfigurationFuture(
        params: DeleteLoggingConfigurationRequest
    ): Future[DeleteLoggingConfigurationResponse] = service.deleteLoggingConfiguration(params).promise().toFuture
    @inline def deletePermissionPolicyFuture(
        params: DeletePermissionPolicyRequest
    ): Future[DeletePermissionPolicyResponse] = service.deletePermissionPolicy(params).promise().toFuture
    @inline def deleteRateBasedRuleFuture(params: DeleteRateBasedRuleRequest): Future[DeleteRateBasedRuleResponse] =
      service.deleteRateBasedRule(params).promise().toFuture
    @inline def deleteRegexMatchSetFuture(params: DeleteRegexMatchSetRequest): Future[DeleteRegexMatchSetResponse] =
      service.deleteRegexMatchSet(params).promise().toFuture
    @inline def deleteRegexPatternSetFuture(
        params: DeleteRegexPatternSetRequest
    ): Future[DeleteRegexPatternSetResponse] = service.deleteRegexPatternSet(params).promise().toFuture
    @inline def deleteRuleFuture(params: DeleteRuleRequest): Future[DeleteRuleResponse] =
      service.deleteRule(params).promise().toFuture
    @inline def deleteRuleGroupFuture(params: DeleteRuleGroupRequest): Future[DeleteRuleGroupResponse] =
      service.deleteRuleGroup(params).promise().toFuture
    @inline def deleteSizeConstraintSetFuture(
        params: DeleteSizeConstraintSetRequest
    ): Future[DeleteSizeConstraintSetResponse] = service.deleteSizeConstraintSet(params).promise().toFuture
    @inline def deleteSqlInjectionMatchSetFuture(
        params: DeleteSqlInjectionMatchSetRequest
    ): Future[DeleteSqlInjectionMatchSetResponse] = service.deleteSqlInjectionMatchSet(params).promise().toFuture
    @inline def deleteWebACLFuture(params: DeleteWebACLRequest): Future[DeleteWebACLResponse] =
      service.deleteWebACL(params).promise().toFuture
    @inline def deleteXssMatchSetFuture(params: DeleteXssMatchSetRequest): Future[DeleteXssMatchSetResponse] =
      service.deleteXssMatchSet(params).promise().toFuture
    @inline def disassociateWebACLFuture(params: DisassociateWebACLRequest): Future[DisassociateWebACLResponse] =
      service.disassociateWebACL(params).promise().toFuture
    @inline def getByteMatchSetFuture(params: GetByteMatchSetRequest): Future[GetByteMatchSetResponse] =
      service.getByteMatchSet(params).promise().toFuture
    @inline def getChangeTokenFuture(params: GetChangeTokenRequest): Future[GetChangeTokenResponse] =
      service.getChangeToken(params).promise().toFuture
    @inline def getChangeTokenStatusFuture(params: GetChangeTokenStatusRequest): Future[GetChangeTokenStatusResponse] =
      service.getChangeTokenStatus(params).promise().toFuture
    @inline def getGeoMatchSetFuture(params: GetGeoMatchSetRequest): Future[GetGeoMatchSetResponse] =
      service.getGeoMatchSet(params).promise().toFuture
    @inline def getIPSetFuture(params: GetIPSetRequest): Future[GetIPSetResponse] =
      service.getIPSet(params).promise().toFuture
    @inline def getLoggingConfigurationFuture(
        params: GetLoggingConfigurationRequest
    ): Future[GetLoggingConfigurationResponse] = service.getLoggingConfiguration(params).promise().toFuture
    @inline def getPermissionPolicyFuture(params: GetPermissionPolicyRequest): Future[GetPermissionPolicyResponse] =
      service.getPermissionPolicy(params).promise().toFuture
    @inline def getRateBasedRuleFuture(params: GetRateBasedRuleRequest): Future[GetRateBasedRuleResponse] =
      service.getRateBasedRule(params).promise().toFuture
    @inline def getRateBasedRuleManagedKeysFuture(
        params: GetRateBasedRuleManagedKeysRequest
    ): Future[GetRateBasedRuleManagedKeysResponse] = service.getRateBasedRuleManagedKeys(params).promise().toFuture
    @inline def getRegexMatchSetFuture(params: GetRegexMatchSetRequest): Future[GetRegexMatchSetResponse] =
      service.getRegexMatchSet(params).promise().toFuture
    @inline def getRegexPatternSetFuture(params: GetRegexPatternSetRequest): Future[GetRegexPatternSetResponse] =
      service.getRegexPatternSet(params).promise().toFuture
    @inline def getRuleFuture(params: GetRuleRequest): Future[GetRuleResponse] =
      service.getRule(params).promise().toFuture
    @inline def getRuleGroupFuture(params: GetRuleGroupRequest): Future[GetRuleGroupResponse] =
      service.getRuleGroup(params).promise().toFuture
    @inline def getSampledRequestsFuture(params: GetSampledRequestsRequest): Future[GetSampledRequestsResponse] =
      service.getSampledRequests(params).promise().toFuture
    @inline def getSizeConstraintSetFuture(params: GetSizeConstraintSetRequest): Future[GetSizeConstraintSetResponse] =
      service.getSizeConstraintSet(params).promise().toFuture
    @inline def getSqlInjectionMatchSetFuture(
        params: GetSqlInjectionMatchSetRequest
    ): Future[GetSqlInjectionMatchSetResponse] = service.getSqlInjectionMatchSet(params).promise().toFuture
    @inline def getWebACLForResourceFuture(params: GetWebACLForResourceRequest): Future[GetWebACLForResourceResponse] =
      service.getWebACLForResource(params).promise().toFuture
    @inline def getWebACLFuture(params: GetWebACLRequest): Future[GetWebACLResponse] =
      service.getWebACL(params).promise().toFuture
    @inline def getXssMatchSetFuture(params: GetXssMatchSetRequest): Future[GetXssMatchSetResponse] =
      service.getXssMatchSet(params).promise().toFuture
    @inline def listActivatedRulesInRuleGroupFuture(
        params: ListActivatedRulesInRuleGroupRequest
    ): Future[ListActivatedRulesInRuleGroupResponse] = service.listActivatedRulesInRuleGroup(params).promise().toFuture
    @inline def listByteMatchSetsFuture(params: ListByteMatchSetsRequest): Future[ListByteMatchSetsResponse] =
      service.listByteMatchSets(params).promise().toFuture
    @inline def listGeoMatchSetsFuture(params: ListGeoMatchSetsRequest): Future[ListGeoMatchSetsResponse] =
      service.listGeoMatchSets(params).promise().toFuture
    @inline def listIPSetsFuture(params: ListIPSetsRequest): Future[ListIPSetsResponse] =
      service.listIPSets(params).promise().toFuture
    @inline def listLoggingConfigurationsFuture(
        params: ListLoggingConfigurationsRequest
    ): Future[ListLoggingConfigurationsResponse] = service.listLoggingConfigurations(params).promise().toFuture
    @inline def listRateBasedRulesFuture(params: ListRateBasedRulesRequest): Future[ListRateBasedRulesResponse] =
      service.listRateBasedRules(params).promise().toFuture
    @inline def listRegexMatchSetsFuture(params: ListRegexMatchSetsRequest): Future[ListRegexMatchSetsResponse] =
      service.listRegexMatchSets(params).promise().toFuture
    @inline def listRegexPatternSetsFuture(params: ListRegexPatternSetsRequest): Future[ListRegexPatternSetsResponse] =
      service.listRegexPatternSets(params).promise().toFuture
    @inline def listResourcesForWebACLFuture(
        params: ListResourcesForWebACLRequest
    ): Future[ListResourcesForWebACLResponse] = service.listResourcesForWebACL(params).promise().toFuture
    @inline def listRuleGroupsFuture(params: ListRuleGroupsRequest): Future[ListRuleGroupsResponse] =
      service.listRuleGroups(params).promise().toFuture
    @inline def listRulesFuture(params: ListRulesRequest): Future[ListRulesResponse] =
      service.listRules(params).promise().toFuture
    @inline def listSizeConstraintSetsFuture(
        params: ListSizeConstraintSetsRequest
    ): Future[ListSizeConstraintSetsResponse] = service.listSizeConstraintSets(params).promise().toFuture
    @inline def listSqlInjectionMatchSetsFuture(
        params: ListSqlInjectionMatchSetsRequest
    ): Future[ListSqlInjectionMatchSetsResponse] = service.listSqlInjectionMatchSets(params).promise().toFuture
    @inline def listSubscribedRuleGroupsFuture(
        params: ListSubscribedRuleGroupsRequest
    ): Future[ListSubscribedRuleGroupsResponse] = service.listSubscribedRuleGroups(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] =
      service.listTagsForResource(params).promise().toFuture
    @inline def listWebACLsFuture(params: ListWebACLsRequest): Future[ListWebACLsResponse] =
      service.listWebACLs(params).promise().toFuture
    @inline def listXssMatchSetsFuture(params: ListXssMatchSetsRequest): Future[ListXssMatchSetsResponse] =
      service.listXssMatchSets(params).promise().toFuture
    @inline def putLoggingConfigurationFuture(
        params: PutLoggingConfigurationRequest
    ): Future[PutLoggingConfigurationResponse] = service.putLoggingConfiguration(params).promise().toFuture
    @inline def putPermissionPolicyFuture(params: PutPermissionPolicyRequest): Future[PutPermissionPolicyResponse] =
      service.putPermissionPolicy(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] =
      service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] =
      service.untagResource(params).promise().toFuture
    @inline def updateByteMatchSetFuture(params: UpdateByteMatchSetRequest): Future[UpdateByteMatchSetResponse] =
      service.updateByteMatchSet(params).promise().toFuture
    @inline def updateGeoMatchSetFuture(params: UpdateGeoMatchSetRequest): Future[UpdateGeoMatchSetResponse] =
      service.updateGeoMatchSet(params).promise().toFuture
    @inline def updateIPSetFuture(params: UpdateIPSetRequest): Future[UpdateIPSetResponse] =
      service.updateIPSet(params).promise().toFuture
    @inline def updateRateBasedRuleFuture(params: UpdateRateBasedRuleRequest): Future[UpdateRateBasedRuleResponse] =
      service.updateRateBasedRule(params).promise().toFuture
    @inline def updateRegexMatchSetFuture(params: UpdateRegexMatchSetRequest): Future[UpdateRegexMatchSetResponse] =
      service.updateRegexMatchSet(params).promise().toFuture
    @inline def updateRegexPatternSetFuture(
        params: UpdateRegexPatternSetRequest
    ): Future[UpdateRegexPatternSetResponse] = service.updateRegexPatternSet(params).promise().toFuture
    @inline def updateRuleFuture(params: UpdateRuleRequest): Future[UpdateRuleResponse] =
      service.updateRule(params).promise().toFuture
    @inline def updateRuleGroupFuture(params: UpdateRuleGroupRequest): Future[UpdateRuleGroupResponse] =
      service.updateRuleGroup(params).promise().toFuture
    @inline def updateSizeConstraintSetFuture(
        params: UpdateSizeConstraintSetRequest
    ): Future[UpdateSizeConstraintSetResponse] = service.updateSizeConstraintSet(params).promise().toFuture
    @inline def updateSqlInjectionMatchSetFuture(
        params: UpdateSqlInjectionMatchSetRequest
    ): Future[UpdateSqlInjectionMatchSetResponse] = service.updateSqlInjectionMatchSet(params).promise().toFuture
    @inline def updateWebACLFuture(params: UpdateWebACLRequest): Future[UpdateWebACLResponse] =
      service.updateWebACL(params).promise().toFuture
    @inline def updateXssMatchSetFuture(params: UpdateXssMatchSetRequest): Future[UpdateXssMatchSetResponse] =
      service.updateXssMatchSet(params).promise().toFuture
  }
}

package wafregional {
  @js.native
  @JSImport("aws-sdk", "WAFRegional")
  class WAFRegional() extends js.Object {
    def this(config: AWSConfig) = this()

    def associateWebACL(params: AssociateWebACLRequest): Request[AssociateWebACLResponse]                   = js.native
    def createByteMatchSet(params: CreateByteMatchSetRequest): Request[CreateByteMatchSetResponse]          = js.native
    def createGeoMatchSet(params: CreateGeoMatchSetRequest): Request[CreateGeoMatchSetResponse]             = js.native
    def createIPSet(params: CreateIPSetRequest): Request[CreateIPSetResponse]                               = js.native
    def createRateBasedRule(params: CreateRateBasedRuleRequest): Request[CreateRateBasedRuleResponse]       = js.native
    def createRegexMatchSet(params: CreateRegexMatchSetRequest): Request[CreateRegexMatchSetResponse]       = js.native
    def createRegexPatternSet(params: CreateRegexPatternSetRequest): Request[CreateRegexPatternSetResponse] = js.native
    def createRule(params: CreateRuleRequest): Request[CreateRuleResponse]                                  = js.native
    def createRuleGroup(params: CreateRuleGroupRequest): Request[CreateRuleGroupResponse]                   = js.native
    def createSizeConstraintSet(params: CreateSizeConstraintSetRequest): Request[CreateSizeConstraintSetResponse] =
      js.native
    def createSqlInjectionMatchSet(
        params: CreateSqlInjectionMatchSetRequest
    ): Request[CreateSqlInjectionMatchSetResponse]                                                 = js.native
    def createWebACL(params: CreateWebACLRequest): Request[CreateWebACLResponse]                   = js.native
    def createXssMatchSet(params: CreateXssMatchSetRequest): Request[CreateXssMatchSetResponse]    = js.native
    def deleteByteMatchSet(params: DeleteByteMatchSetRequest): Request[DeleteByteMatchSetResponse] = js.native
    def deleteGeoMatchSet(params: DeleteGeoMatchSetRequest): Request[DeleteGeoMatchSetResponse]    = js.native
    def deleteIPSet(params: DeleteIPSetRequest): Request[DeleteIPSetResponse]                      = js.native
    def deleteLoggingConfiguration(
        params: DeleteLoggingConfigurationRequest
    ): Request[DeleteLoggingConfigurationResponse] = js.native
    def deletePermissionPolicy(params: DeletePermissionPolicyRequest): Request[DeletePermissionPolicyResponse] =
      js.native
    def deleteRateBasedRule(params: DeleteRateBasedRuleRequest): Request[DeleteRateBasedRuleResponse]       = js.native
    def deleteRegexMatchSet(params: DeleteRegexMatchSetRequest): Request[DeleteRegexMatchSetResponse]       = js.native
    def deleteRegexPatternSet(params: DeleteRegexPatternSetRequest): Request[DeleteRegexPatternSetResponse] = js.native
    def deleteRule(params: DeleteRuleRequest): Request[DeleteRuleResponse]                                  = js.native
    def deleteRuleGroup(params: DeleteRuleGroupRequest): Request[DeleteRuleGroupResponse]                   = js.native
    def deleteSizeConstraintSet(params: DeleteSizeConstraintSetRequest): Request[DeleteSizeConstraintSetResponse] =
      js.native
    def deleteSqlInjectionMatchSet(
        params: DeleteSqlInjectionMatchSetRequest
    ): Request[DeleteSqlInjectionMatchSetResponse]                                                       = js.native
    def deleteWebACL(params: DeleteWebACLRequest): Request[DeleteWebACLResponse]                         = js.native
    def deleteXssMatchSet(params: DeleteXssMatchSetRequest): Request[DeleteXssMatchSetResponse]          = js.native
    def disassociateWebACL(params: DisassociateWebACLRequest): Request[DisassociateWebACLResponse]       = js.native
    def getByteMatchSet(params: GetByteMatchSetRequest): Request[GetByteMatchSetResponse]                = js.native
    def getChangeToken(params: GetChangeTokenRequest): Request[GetChangeTokenResponse]                   = js.native
    def getChangeTokenStatus(params: GetChangeTokenStatusRequest): Request[GetChangeTokenStatusResponse] = js.native
    def getGeoMatchSet(params: GetGeoMatchSetRequest): Request[GetGeoMatchSetResponse]                   = js.native
    def getIPSet(params: GetIPSetRequest): Request[GetIPSetResponse]                                     = js.native
    def getLoggingConfiguration(params: GetLoggingConfigurationRequest): Request[GetLoggingConfigurationResponse] =
      js.native
    def getPermissionPolicy(params: GetPermissionPolicyRequest): Request[GetPermissionPolicyResponse] = js.native
    def getRateBasedRule(params: GetRateBasedRuleRequest): Request[GetRateBasedRuleResponse]          = js.native
    def getRateBasedRuleManagedKeys(
        params: GetRateBasedRuleManagedKeysRequest
    ): Request[GetRateBasedRuleManagedKeysResponse]                                                      = js.native
    def getRegexMatchSet(params: GetRegexMatchSetRequest): Request[GetRegexMatchSetResponse]             = js.native
    def getRegexPatternSet(params: GetRegexPatternSetRequest): Request[GetRegexPatternSetResponse]       = js.native
    def getRule(params: GetRuleRequest): Request[GetRuleResponse]                                        = js.native
    def getRuleGroup(params: GetRuleGroupRequest): Request[GetRuleGroupResponse]                         = js.native
    def getSampledRequests(params: GetSampledRequestsRequest): Request[GetSampledRequestsResponse]       = js.native
    def getSizeConstraintSet(params: GetSizeConstraintSetRequest): Request[GetSizeConstraintSetResponse] = js.native
    def getSqlInjectionMatchSet(params: GetSqlInjectionMatchSetRequest): Request[GetSqlInjectionMatchSetResponse] =
      js.native
    def getWebACL(params: GetWebACLRequest): Request[GetWebACLResponse]                                  = js.native
    def getWebACLForResource(params: GetWebACLForResourceRequest): Request[GetWebACLForResourceResponse] = js.native
    def getXssMatchSet(params: GetXssMatchSetRequest): Request[GetXssMatchSetResponse]                   = js.native
    def listActivatedRulesInRuleGroup(
        params: ListActivatedRulesInRuleGroupRequest
    ): Request[ListActivatedRulesInRuleGroupResponse]                                           = js.native
    def listByteMatchSets(params: ListByteMatchSetsRequest): Request[ListByteMatchSetsResponse] = js.native
    def listGeoMatchSets(params: ListGeoMatchSetsRequest): Request[ListGeoMatchSetsResponse]    = js.native
    def listIPSets(params: ListIPSetsRequest): Request[ListIPSetsResponse]                      = js.native
    def listLoggingConfigurations(
        params: ListLoggingConfigurationsRequest
    ): Request[ListLoggingConfigurationsResponse]                                                        = js.native
    def listRateBasedRules(params: ListRateBasedRulesRequest): Request[ListRateBasedRulesResponse]       = js.native
    def listRegexMatchSets(params: ListRegexMatchSetsRequest): Request[ListRegexMatchSetsResponse]       = js.native
    def listRegexPatternSets(params: ListRegexPatternSetsRequest): Request[ListRegexPatternSetsResponse] = js.native
    def listResourcesForWebACL(params: ListResourcesForWebACLRequest): Request[ListResourcesForWebACLResponse] =
      js.native
    def listRuleGroups(params: ListRuleGroupsRequest): Request[ListRuleGroupsResponse] = js.native
    def listRules(params: ListRulesRequest): Request[ListRulesResponse]                = js.native
    def listSizeConstraintSets(params: ListSizeConstraintSetsRequest): Request[ListSizeConstraintSetsResponse] =
      js.native
    def listSqlInjectionMatchSets(
        params: ListSqlInjectionMatchSetsRequest
    ): Request[ListSqlInjectionMatchSetsResponse] = js.native
    def listSubscribedRuleGroups(params: ListSubscribedRuleGroupsRequest): Request[ListSubscribedRuleGroupsResponse] =
      js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def listWebACLs(params: ListWebACLsRequest): Request[ListWebACLsResponse]                         = js.native
    def listXssMatchSets(params: ListXssMatchSetsRequest): Request[ListXssMatchSetsResponse]          = js.native
    def putLoggingConfiguration(params: PutLoggingConfigurationRequest): Request[PutLoggingConfigurationResponse] =
      js.native
    def putPermissionPolicy(params: PutPermissionPolicyRequest): Request[PutPermissionPolicyResponse]       = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse]                               = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse]                         = js.native
    def updateByteMatchSet(params: UpdateByteMatchSetRequest): Request[UpdateByteMatchSetResponse]          = js.native
    def updateGeoMatchSet(params: UpdateGeoMatchSetRequest): Request[UpdateGeoMatchSetResponse]             = js.native
    def updateIPSet(params: UpdateIPSetRequest): Request[UpdateIPSetResponse]                               = js.native
    def updateRateBasedRule(params: UpdateRateBasedRuleRequest): Request[UpdateRateBasedRuleResponse]       = js.native
    def updateRegexMatchSet(params: UpdateRegexMatchSetRequest): Request[UpdateRegexMatchSetResponse]       = js.native
    def updateRegexPatternSet(params: UpdateRegexPatternSetRequest): Request[UpdateRegexPatternSetResponse] = js.native
    def updateRule(params: UpdateRuleRequest): Request[UpdateRuleResponse]                                  = js.native
    def updateRuleGroup(params: UpdateRuleGroupRequest): Request[UpdateRuleGroupResponse]                   = js.native
    def updateSizeConstraintSet(params: UpdateSizeConstraintSetRequest): Request[UpdateSizeConstraintSetResponse] =
      js.native
    def updateSqlInjectionMatchSet(
        params: UpdateSqlInjectionMatchSetRequest
    ): Request[UpdateSqlInjectionMatchSetResponse]                                              = js.native
    def updateWebACL(params: UpdateWebACLRequest): Request[UpdateWebACLResponse]                = js.native
    def updateXssMatchSet(params: UpdateXssMatchSetRequest): Request[UpdateXssMatchSetResponse] = js.native
  }

  /**
    * The <code>ActivatedRule</code> object in an <a>UpdateWebACL</a> request specifies a <code>Rule</code> that you want to insert or delete, the priority of the <code>Rule</code> in the <code>WebACL</code>, and the action that you want AWS WAF to take when a web request matches the <code>Rule</code> (<code>ALLOW</code>, <code>BLOCK</code>, or <code>COUNT</code>).
    *  To specify whether to insert or delete a <code>Rule</code>, use the <code>Action</code> parameter in the <a>WebACLUpdate</a> data type.
    */
  @js.native
  @Factory
  trait ActivatedRule extends js.Object {
    var Priority: RulePriority
    var RuleId: ResourceId
    var Action: js.UndefOr[WafAction]
    var ExcludedRules: js.UndefOr[ExcludedRules]
    var OverrideAction: js.UndefOr[WafOverrideAction]
    var Type: js.UndefOr[WafRuleType]
  }

  @js.native
  @Factory
  trait AssociateWebACLRequest extends js.Object {
    var ResourceArn: ResourceArn
    var WebACLId: ResourceId
  }

  @js.native
  @Factory
  trait AssociateWebACLResponse extends js.Object {}

  /**
    * In a <a>GetByteMatchSet</a> request, <code>ByteMatchSet</code> is a complex type that contains the <code>ByteMatchSetId</code> and <code>Name</code> of a <code>ByteMatchSet</code>, and the values that you specified when you updated the <code>ByteMatchSet</code>.
    *  A complex type that contains <code>ByteMatchTuple</code> objects, which specify the parts of web requests that you want AWS WAF to inspect and the values that you want AWS WAF to search for. If a <code>ByteMatchSet</code> contains more than one <code>ByteMatchTuple</code> object, a request needs to match the settings in only one <code>ByteMatchTuple</code> to be considered a match.
    */
  @js.native
  @Factory
  trait ByteMatchSet extends js.Object {
    var ByteMatchSetId: ResourceId
    var ByteMatchTuples: ByteMatchTuples
    var Name: js.UndefOr[ResourceName]
  }

  /**
    * Returned by <a>ListByteMatchSets</a>. Each <code>ByteMatchSetSummary</code> object includes the <code>Name</code> and <code>ByteMatchSetId</code> for one <a>ByteMatchSet</a>.
    */
  @js.native
  @Factory
  trait ByteMatchSetSummary extends js.Object {
    var ByteMatchSetId: ResourceId
    var Name: ResourceName
  }

  /**
    * In an <a>UpdateByteMatchSet</a> request, <code>ByteMatchSetUpdate</code> specifies whether to insert or delete a <a>ByteMatchTuple</a> and includes the settings for the <code>ByteMatchTuple</code>.
    */
  @js.native
  @Factory
  trait ByteMatchSetUpdate extends js.Object {
    var Action: ChangeAction
    var ByteMatchTuple: ByteMatchTuple
  }

  /**
    * The bytes (typically a string that corresponds with ASCII characters) that you want AWS WAF to search for in web requests, the location in requests that you want AWS WAF to search, and other settings.
    */
  @js.native
  @Factory
  trait ByteMatchTuple extends js.Object {
    var FieldToMatch: FieldToMatch
    var PositionalConstraint: PositionalConstraint
    var TargetString: ByteMatchTargetString
    var TextTransformation: TextTransformation
  }

  @js.native
  sealed trait ChangeAction extends js.Any
  object ChangeAction extends js.Object {
    val INSERT = "INSERT".asInstanceOf[ChangeAction]
    val DELETE = "DELETE".asInstanceOf[ChangeAction]

    val values = js.Object.freeze(js.Array(INSERT, DELETE))
  }

  @js.native
  sealed trait ChangeTokenStatus extends js.Any
  object ChangeTokenStatus extends js.Object {
    val PROVISIONED = "PROVISIONED".asInstanceOf[ChangeTokenStatus]
    val PENDING     = "PENDING".asInstanceOf[ChangeTokenStatus]
    val INSYNC      = "INSYNC".asInstanceOf[ChangeTokenStatus]

    val values = js.Object.freeze(js.Array(PROVISIONED, PENDING, INSYNC))
  }

  @js.native
  sealed trait ComparisonOperator extends js.Any
  object ComparisonOperator extends js.Object {
    val EQ = "EQ".asInstanceOf[ComparisonOperator]
    val NE = "NE".asInstanceOf[ComparisonOperator]
    val LE = "LE".asInstanceOf[ComparisonOperator]
    val LT = "LT".asInstanceOf[ComparisonOperator]
    val GE = "GE".asInstanceOf[ComparisonOperator]
    val GT = "GT".asInstanceOf[ComparisonOperator]

    val values = js.Object.freeze(js.Array(EQ, NE, LE, LT, GE, GT))
  }

  @js.native
  @Factory
  trait CreateByteMatchSetRequest extends js.Object {
    var ChangeToken: ChangeToken
    var Name: ResourceName
  }

  @js.native
  @Factory
  trait CreateByteMatchSetResponse extends js.Object {
    var ByteMatchSet: js.UndefOr[ByteMatchSet]
    var ChangeToken: js.UndefOr[ChangeToken]
  }

  @js.native
  @Factory
  trait CreateGeoMatchSetRequest extends js.Object {
    var ChangeToken: ChangeToken
    var Name: ResourceName
  }

  @js.native
  @Factory
  trait CreateGeoMatchSetResponse extends js.Object {
    var ChangeToken: js.UndefOr[ChangeToken]
    var GeoMatchSet: js.UndefOr[GeoMatchSet]
  }

  @js.native
  @Factory
  trait CreateIPSetRequest extends js.Object {
    var ChangeToken: ChangeToken
    var Name: ResourceName
  }

  @js.native
  @Factory
  trait CreateIPSetResponse extends js.Object {
    var ChangeToken: js.UndefOr[ChangeToken]
    var IPSet: js.UndefOr[IPSet]
  }

  @js.native
  @Factory
  trait CreateRateBasedRuleRequest extends js.Object {
    var ChangeToken: ChangeToken
    var MetricName: MetricName
    var Name: ResourceName
    var RateKey: RateKey
    var RateLimit: RateLimit
    var Tags: js.UndefOr[TagList]
  }

  @js.native
  @Factory
  trait CreateRateBasedRuleResponse extends js.Object {
    var ChangeToken: js.UndefOr[ChangeToken]
    var Rule: js.UndefOr[RateBasedRule]
  }

  @js.native
  @Factory
  trait CreateRegexMatchSetRequest extends js.Object {
    var ChangeToken: ChangeToken
    var Name: ResourceName
  }

  @js.native
  @Factory
  trait CreateRegexMatchSetResponse extends js.Object {
    var ChangeToken: js.UndefOr[ChangeToken]
    var RegexMatchSet: js.UndefOr[RegexMatchSet]
  }

  @js.native
  @Factory
  trait CreateRegexPatternSetRequest extends js.Object {
    var ChangeToken: ChangeToken
    var Name: ResourceName
  }

  @js.native
  @Factory
  trait CreateRegexPatternSetResponse extends js.Object {
    var ChangeToken: js.UndefOr[ChangeToken]
    var RegexPatternSet: js.UndefOr[RegexPatternSet]
  }

  @js.native
  @Factory
  trait CreateRuleGroupRequest extends js.Object {
    var ChangeToken: ChangeToken
    var MetricName: MetricName
    var Name: ResourceName
    var Tags: js.UndefOr[TagList]
  }

  @js.native
  @Factory
  trait CreateRuleGroupResponse extends js.Object {
    var ChangeToken: js.UndefOr[ChangeToken]
    var RuleGroup: js.UndefOr[RuleGroup]
  }

  @js.native
  @Factory
  trait CreateRuleRequest extends js.Object {
    var ChangeToken: ChangeToken
    var MetricName: MetricName
    var Name: ResourceName
    var Tags: js.UndefOr[TagList]
  }

  @js.native
  @Factory
  trait CreateRuleResponse extends js.Object {
    var ChangeToken: js.UndefOr[ChangeToken]
    var Rule: js.UndefOr[Rule]
  }

  @js.native
  @Factory
  trait CreateSizeConstraintSetRequest extends js.Object {
    var ChangeToken: ChangeToken
    var Name: ResourceName
  }

  @js.native
  @Factory
  trait CreateSizeConstraintSetResponse extends js.Object {
    var ChangeToken: js.UndefOr[ChangeToken]
    var SizeConstraintSet: js.UndefOr[SizeConstraintSet]
  }

  /**
    * A request to create a <a>SqlInjectionMatchSet</a>.
    */
  @js.native
  @Factory
  trait CreateSqlInjectionMatchSetRequest extends js.Object {
    var ChangeToken: ChangeToken
    var Name: ResourceName
  }

  /**
    * The response to a <code>CreateSqlInjectionMatchSet</code> request.
    */
  @js.native
  @Factory
  trait CreateSqlInjectionMatchSetResponse extends js.Object {
    var ChangeToken: js.UndefOr[ChangeToken]
    var SqlInjectionMatchSet: js.UndefOr[SqlInjectionMatchSet]
  }

  @js.native
  @Factory
  trait CreateWebACLRequest extends js.Object {
    var ChangeToken: ChangeToken
    var DefaultAction: WafAction
    var MetricName: MetricName
    var Name: ResourceName
    var Tags: js.UndefOr[TagList]
  }

  @js.native
  @Factory
  trait CreateWebACLResponse extends js.Object {
    var ChangeToken: js.UndefOr[ChangeToken]
    var WebACL: js.UndefOr[WebACL]
  }

  /**
    * A request to create an <a>XssMatchSet</a>.
    */
  @js.native
  @Factory
  trait CreateXssMatchSetRequest extends js.Object {
    var ChangeToken: ChangeToken
    var Name: ResourceName
  }

  /**
    * The response to a <code>CreateXssMatchSet</code> request.
    */
  @js.native
  @Factory
  trait CreateXssMatchSetResponse extends js.Object {
    var ChangeToken: js.UndefOr[ChangeToken]
    var XssMatchSet: js.UndefOr[XssMatchSet]
  }

  @js.native
  @Factory
  trait DeleteByteMatchSetRequest extends js.Object {
    var ByteMatchSetId: ResourceId
    var ChangeToken: ChangeToken
  }

  @js.native
  @Factory
  trait DeleteByteMatchSetResponse extends js.Object {
    var ChangeToken: js.UndefOr[ChangeToken]
  }

  @js.native
  @Factory
  trait DeleteGeoMatchSetRequest extends js.Object {
    var ChangeToken: ChangeToken
    var GeoMatchSetId: ResourceId
  }

  @js.native
  @Factory
  trait DeleteGeoMatchSetResponse extends js.Object {
    var ChangeToken: js.UndefOr[ChangeToken]
  }

  @js.native
  @Factory
  trait DeleteIPSetRequest extends js.Object {
    var ChangeToken: ChangeToken
    var IPSetId: ResourceId
  }

  @js.native
  @Factory
  trait DeleteIPSetResponse extends js.Object {
    var ChangeToken: js.UndefOr[ChangeToken]
  }

  @js.native
  @Factory
  trait DeleteLoggingConfigurationRequest extends js.Object {
    var ResourceArn: ResourceArn
  }

  @js.native
  @Factory
  trait DeleteLoggingConfigurationResponse extends js.Object {}

  @js.native
  @Factory
  trait DeletePermissionPolicyRequest extends js.Object {
    var ResourceArn: ResourceArn
  }

  @js.native
  @Factory
  trait DeletePermissionPolicyResponse extends js.Object {}

  @js.native
  @Factory
  trait DeleteRateBasedRuleRequest extends js.Object {
    var ChangeToken: ChangeToken
    var RuleId: ResourceId
  }

  @js.native
  @Factory
  trait DeleteRateBasedRuleResponse extends js.Object {
    var ChangeToken: js.UndefOr[ChangeToken]
  }

  @js.native
  @Factory
  trait DeleteRegexMatchSetRequest extends js.Object {
    var ChangeToken: ChangeToken
    var RegexMatchSetId: ResourceId
  }

  @js.native
  @Factory
  trait DeleteRegexMatchSetResponse extends js.Object {
    var ChangeToken: js.UndefOr[ChangeToken]
  }

  @js.native
  @Factory
  trait DeleteRegexPatternSetRequest extends js.Object {
    var ChangeToken: ChangeToken
    var RegexPatternSetId: ResourceId
  }

  @js.native
  @Factory
  trait DeleteRegexPatternSetResponse extends js.Object {
    var ChangeToken: js.UndefOr[ChangeToken]
  }

  @js.native
  @Factory
  trait DeleteRuleGroupRequest extends js.Object {
    var ChangeToken: ChangeToken
    var RuleGroupId: ResourceId
  }

  @js.native
  @Factory
  trait DeleteRuleGroupResponse extends js.Object {
    var ChangeToken: js.UndefOr[ChangeToken]
  }

  @js.native
  @Factory
  trait DeleteRuleRequest extends js.Object {
    var ChangeToken: ChangeToken
    var RuleId: ResourceId
  }

  @js.native
  @Factory
  trait DeleteRuleResponse extends js.Object {
    var ChangeToken: js.UndefOr[ChangeToken]
  }

  @js.native
  @Factory
  trait DeleteSizeConstraintSetRequest extends js.Object {
    var ChangeToken: ChangeToken
    var SizeConstraintSetId: ResourceId
  }

  @js.native
  @Factory
  trait DeleteSizeConstraintSetResponse extends js.Object {
    var ChangeToken: js.UndefOr[ChangeToken]
  }

  /**
    * A request to delete a <a>SqlInjectionMatchSet</a> from AWS WAF.
    */
  @js.native
  @Factory
  trait DeleteSqlInjectionMatchSetRequest extends js.Object {
    var ChangeToken: ChangeToken
    var SqlInjectionMatchSetId: ResourceId
  }

  /**
    * The response to a request to delete a <a>SqlInjectionMatchSet</a> from AWS WAF.
    */
  @js.native
  @Factory
  trait DeleteSqlInjectionMatchSetResponse extends js.Object {
    var ChangeToken: js.UndefOr[ChangeToken]
  }

  @js.native
  @Factory
  trait DeleteWebACLRequest extends js.Object {
    var ChangeToken: ChangeToken
    var WebACLId: ResourceId
  }

  @js.native
  @Factory
  trait DeleteWebACLResponse extends js.Object {
    var ChangeToken: js.UndefOr[ChangeToken]
  }

  /**
    * A request to delete an <a>XssMatchSet</a> from AWS WAF.
    */
  @js.native
  @Factory
  trait DeleteXssMatchSetRequest extends js.Object {
    var ChangeToken: ChangeToken
    var XssMatchSetId: ResourceId
  }

  /**
    * The response to a request to delete an <a>XssMatchSet</a> from AWS WAF.
    */
  @js.native
  @Factory
  trait DeleteXssMatchSetResponse extends js.Object {
    var ChangeToken: js.UndefOr[ChangeToken]
  }

  @js.native
  @Factory
  trait DisassociateWebACLRequest extends js.Object {
    var ResourceArn: ResourceArn
  }

  @js.native
  @Factory
  trait DisassociateWebACLResponse extends js.Object {}

  /**
    * The rule to exclude from a rule group. This is applicable only when the <code>ActivatedRule</code> refers to a <code>RuleGroup</code>. The rule must belong to the <code>RuleGroup</code> that is specified by the <code>ActivatedRule</code>.
    */
  @js.native
  @Factory
  trait ExcludedRule extends js.Object {
    var RuleId: ResourceId
  }

  /**
    * Specifies where in a web request to look for <code>TargetString</code>.
    */
  @js.native
  @Factory
  trait FieldToMatch extends js.Object {
    var Type: MatchFieldType
    var Data: js.UndefOr[MatchFieldData]
  }

  /**
    * The country from which web requests originate that you want AWS WAF to search for.
    */
  @js.native
  @Factory
  trait GeoMatchConstraint extends js.Object {
    var Type: GeoMatchConstraintType
    var Value: GeoMatchConstraintValue
  }

  @js.native
  sealed trait GeoMatchConstraintType extends js.Any
  object GeoMatchConstraintType extends js.Object {
    val Country = "Country".asInstanceOf[GeoMatchConstraintType]

    val values = js.Object.freeze(js.Array(Country))
  }

  @js.native
  sealed trait GeoMatchConstraintValue extends js.Any
  object GeoMatchConstraintValue extends js.Object {
    val AF = "AF".asInstanceOf[GeoMatchConstraintValue]
    val AX = "AX".asInstanceOf[GeoMatchConstraintValue]
    val AL = "AL".asInstanceOf[GeoMatchConstraintValue]
    val DZ = "DZ".asInstanceOf[GeoMatchConstraintValue]
    val AS = "AS".asInstanceOf[GeoMatchConstraintValue]
    val AD = "AD".asInstanceOf[GeoMatchConstraintValue]
    val AO = "AO".asInstanceOf[GeoMatchConstraintValue]
    val AI = "AI".asInstanceOf[GeoMatchConstraintValue]
    val AQ = "AQ".asInstanceOf[GeoMatchConstraintValue]
    val AG = "AG".asInstanceOf[GeoMatchConstraintValue]
    val AR = "AR".asInstanceOf[GeoMatchConstraintValue]
    val AM = "AM".asInstanceOf[GeoMatchConstraintValue]
    val AW = "AW".asInstanceOf[GeoMatchConstraintValue]
    val AU = "AU".asInstanceOf[GeoMatchConstraintValue]
    val AT = "AT".asInstanceOf[GeoMatchConstraintValue]
    val AZ = "AZ".asInstanceOf[GeoMatchConstraintValue]
    val BS = "BS".asInstanceOf[GeoMatchConstraintValue]
    val BH = "BH".asInstanceOf[GeoMatchConstraintValue]
    val BD = "BD".asInstanceOf[GeoMatchConstraintValue]
    val BB = "BB".asInstanceOf[GeoMatchConstraintValue]
    val BY = "BY".asInstanceOf[GeoMatchConstraintValue]
    val BE = "BE".asInstanceOf[GeoMatchConstraintValue]
    val BZ = "BZ".asInstanceOf[GeoMatchConstraintValue]
    val BJ = "BJ".asInstanceOf[GeoMatchConstraintValue]
    val BM = "BM".asInstanceOf[GeoMatchConstraintValue]
    val BT = "BT".asInstanceOf[GeoMatchConstraintValue]
    val BO = "BO".asInstanceOf[GeoMatchConstraintValue]
    val BQ = "BQ".asInstanceOf[GeoMatchConstraintValue]
    val BA = "BA".asInstanceOf[GeoMatchConstraintValue]
    val BW = "BW".asInstanceOf[GeoMatchConstraintValue]
    val BV = "BV".asInstanceOf[GeoMatchConstraintValue]
    val BR = "BR".asInstanceOf[GeoMatchConstraintValue]
    val IO = "IO".asInstanceOf[GeoMatchConstraintValue]
    val BN = "BN".asInstanceOf[GeoMatchConstraintValue]
    val BG = "BG".asInstanceOf[GeoMatchConstraintValue]
    val BF = "BF".asInstanceOf[GeoMatchConstraintValue]
    val BI = "BI".asInstanceOf[GeoMatchConstraintValue]
    val KH = "KH".asInstanceOf[GeoMatchConstraintValue]
    val CM = "CM".asInstanceOf[GeoMatchConstraintValue]
    val CA = "CA".asInstanceOf[GeoMatchConstraintValue]
    val CV = "CV".asInstanceOf[GeoMatchConstraintValue]
    val KY = "KY".asInstanceOf[GeoMatchConstraintValue]
    val CF = "CF".asInstanceOf[GeoMatchConstraintValue]
    val TD = "TD".asInstanceOf[GeoMatchConstraintValue]
    val CL = "CL".asInstanceOf[GeoMatchConstraintValue]
    val CN = "CN".asInstanceOf[GeoMatchConstraintValue]
    val CX = "CX".asInstanceOf[GeoMatchConstraintValue]
    val CC = "CC".asInstanceOf[GeoMatchConstraintValue]
    val CO = "CO".asInstanceOf[GeoMatchConstraintValue]
    val KM = "KM".asInstanceOf[GeoMatchConstraintValue]
    val CG = "CG".asInstanceOf[GeoMatchConstraintValue]
    val CD = "CD".asInstanceOf[GeoMatchConstraintValue]
    val CK = "CK".asInstanceOf[GeoMatchConstraintValue]
    val CR = "CR".asInstanceOf[GeoMatchConstraintValue]
    val CI = "CI".asInstanceOf[GeoMatchConstraintValue]
    val HR = "HR".asInstanceOf[GeoMatchConstraintValue]
    val CU = "CU".asInstanceOf[GeoMatchConstraintValue]
    val CW = "CW".asInstanceOf[GeoMatchConstraintValue]
    val CY = "CY".asInstanceOf[GeoMatchConstraintValue]
    val CZ = "CZ".asInstanceOf[GeoMatchConstraintValue]
    val DK = "DK".asInstanceOf[GeoMatchConstraintValue]
    val DJ = "DJ".asInstanceOf[GeoMatchConstraintValue]
    val DM = "DM".asInstanceOf[GeoMatchConstraintValue]
    val DO = "DO".asInstanceOf[GeoMatchConstraintValue]
    val EC = "EC".asInstanceOf[GeoMatchConstraintValue]
    val EG = "EG".asInstanceOf[GeoMatchConstraintValue]
    val SV = "SV".asInstanceOf[GeoMatchConstraintValue]
    val GQ = "GQ".asInstanceOf[GeoMatchConstraintValue]
    val ER = "ER".asInstanceOf[GeoMatchConstraintValue]
    val EE = "EE".asInstanceOf[GeoMatchConstraintValue]
    val ET = "ET".asInstanceOf[GeoMatchConstraintValue]
    val FK = "FK".asInstanceOf[GeoMatchConstraintValue]
    val FO = "FO".asInstanceOf[GeoMatchConstraintValue]
    val FJ = "FJ".asInstanceOf[GeoMatchConstraintValue]
    val FI = "FI".asInstanceOf[GeoMatchConstraintValue]
    val FR = "FR".asInstanceOf[GeoMatchConstraintValue]
    val GF = "GF".asInstanceOf[GeoMatchConstraintValue]
    val PF = "PF".asInstanceOf[GeoMatchConstraintValue]
    val TF = "TF".asInstanceOf[GeoMatchConstraintValue]
    val GA = "GA".asInstanceOf[GeoMatchConstraintValue]
    val GM = "GM".asInstanceOf[GeoMatchConstraintValue]
    val GE = "GE".asInstanceOf[GeoMatchConstraintValue]
    val DE = "DE".asInstanceOf[GeoMatchConstraintValue]
    val GH = "GH".asInstanceOf[GeoMatchConstraintValue]
    val GI = "GI".asInstanceOf[GeoMatchConstraintValue]
    val GR = "GR".asInstanceOf[GeoMatchConstraintValue]
    val GL = "GL".asInstanceOf[GeoMatchConstraintValue]
    val GD = "GD".asInstanceOf[GeoMatchConstraintValue]
    val GP = "GP".asInstanceOf[GeoMatchConstraintValue]
    val GU = "GU".asInstanceOf[GeoMatchConstraintValue]
    val GT = "GT".asInstanceOf[GeoMatchConstraintValue]
    val GG = "GG".asInstanceOf[GeoMatchConstraintValue]
    val GN = "GN".asInstanceOf[GeoMatchConstraintValue]
    val GW = "GW".asInstanceOf[GeoMatchConstraintValue]
    val GY = "GY".asInstanceOf[GeoMatchConstraintValue]
    val HT = "HT".asInstanceOf[GeoMatchConstraintValue]
    val HM = "HM".asInstanceOf[GeoMatchConstraintValue]
    val VA = "VA".asInstanceOf[GeoMatchConstraintValue]
    val HN = "HN".asInstanceOf[GeoMatchConstraintValue]
    val HK = "HK".asInstanceOf[GeoMatchConstraintValue]
    val HU = "HU".asInstanceOf[GeoMatchConstraintValue]
    val IS = "IS".asInstanceOf[GeoMatchConstraintValue]
    val IN = "IN".asInstanceOf[GeoMatchConstraintValue]
    val ID = "ID".asInstanceOf[GeoMatchConstraintValue]
    val IR = "IR".asInstanceOf[GeoMatchConstraintValue]
    val IQ = "IQ".asInstanceOf[GeoMatchConstraintValue]
    val IE = "IE".asInstanceOf[GeoMatchConstraintValue]
    val IM = "IM".asInstanceOf[GeoMatchConstraintValue]
    val IL = "IL".asInstanceOf[GeoMatchConstraintValue]
    val IT = "IT".asInstanceOf[GeoMatchConstraintValue]
    val JM = "JM".asInstanceOf[GeoMatchConstraintValue]
    val JP = "JP".asInstanceOf[GeoMatchConstraintValue]
    val JE = "JE".asInstanceOf[GeoMatchConstraintValue]
    val JO = "JO".asInstanceOf[GeoMatchConstraintValue]
    val KZ = "KZ".asInstanceOf[GeoMatchConstraintValue]
    val KE = "KE".asInstanceOf[GeoMatchConstraintValue]
    val KI = "KI".asInstanceOf[GeoMatchConstraintValue]
    val KP = "KP".asInstanceOf[GeoMatchConstraintValue]
    val KR = "KR".asInstanceOf[GeoMatchConstraintValue]
    val KW = "KW".asInstanceOf[GeoMatchConstraintValue]
    val KG = "KG".asInstanceOf[GeoMatchConstraintValue]
    val LA = "LA".asInstanceOf[GeoMatchConstraintValue]
    val LV = "LV".asInstanceOf[GeoMatchConstraintValue]
    val LB = "LB".asInstanceOf[GeoMatchConstraintValue]
    val LS = "LS".asInstanceOf[GeoMatchConstraintValue]
    val LR = "LR".asInstanceOf[GeoMatchConstraintValue]
    val LY = "LY".asInstanceOf[GeoMatchConstraintValue]
    val LI = "LI".asInstanceOf[GeoMatchConstraintValue]
    val LT = "LT".asInstanceOf[GeoMatchConstraintValue]
    val LU = "LU".asInstanceOf[GeoMatchConstraintValue]
    val MO = "MO".asInstanceOf[GeoMatchConstraintValue]
    val MK = "MK".asInstanceOf[GeoMatchConstraintValue]
    val MG = "MG".asInstanceOf[GeoMatchConstraintValue]
    val MW = "MW".asInstanceOf[GeoMatchConstraintValue]
    val MY = "MY".asInstanceOf[GeoMatchConstraintValue]
    val MV = "MV".asInstanceOf[GeoMatchConstraintValue]
    val ML = "ML".asInstanceOf[GeoMatchConstraintValue]
    val MT = "MT".asInstanceOf[GeoMatchConstraintValue]
    val MH = "MH".asInstanceOf[GeoMatchConstraintValue]
    val MQ = "MQ".asInstanceOf[GeoMatchConstraintValue]
    val MR = "MR".asInstanceOf[GeoMatchConstraintValue]
    val MU = "MU".asInstanceOf[GeoMatchConstraintValue]
    val YT = "YT".asInstanceOf[GeoMatchConstraintValue]
    val MX = "MX".asInstanceOf[GeoMatchConstraintValue]
    val FM = "FM".asInstanceOf[GeoMatchConstraintValue]
    val MD = "MD".asInstanceOf[GeoMatchConstraintValue]
    val MC = "MC".asInstanceOf[GeoMatchConstraintValue]
    val MN = "MN".asInstanceOf[GeoMatchConstraintValue]
    val ME = "ME".asInstanceOf[GeoMatchConstraintValue]
    val MS = "MS".asInstanceOf[GeoMatchConstraintValue]
    val MA = "MA".asInstanceOf[GeoMatchConstraintValue]
    val MZ = "MZ".asInstanceOf[GeoMatchConstraintValue]
    val MM = "MM".asInstanceOf[GeoMatchConstraintValue]
    val NA = "NA".asInstanceOf[GeoMatchConstraintValue]
    val NR = "NR".asInstanceOf[GeoMatchConstraintValue]
    val NP = "NP".asInstanceOf[GeoMatchConstraintValue]
    val NL = "NL".asInstanceOf[GeoMatchConstraintValue]
    val NC = "NC".asInstanceOf[GeoMatchConstraintValue]
    val NZ = "NZ".asInstanceOf[GeoMatchConstraintValue]
    val NI = "NI".asInstanceOf[GeoMatchConstraintValue]
    val NE = "NE".asInstanceOf[GeoMatchConstraintValue]
    val NG = "NG".asInstanceOf[GeoMatchConstraintValue]
    val NU = "NU".asInstanceOf[GeoMatchConstraintValue]
    val NF = "NF".asInstanceOf[GeoMatchConstraintValue]
    val MP = "MP".asInstanceOf[GeoMatchConstraintValue]
    val NO = "NO".asInstanceOf[GeoMatchConstraintValue]
    val OM = "OM".asInstanceOf[GeoMatchConstraintValue]
    val PK = "PK".asInstanceOf[GeoMatchConstraintValue]
    val PW = "PW".asInstanceOf[GeoMatchConstraintValue]
    val PS = "PS".asInstanceOf[GeoMatchConstraintValue]
    val PA = "PA".asInstanceOf[GeoMatchConstraintValue]
    val PG = "PG".asInstanceOf[GeoMatchConstraintValue]
    val PY = "PY".asInstanceOf[GeoMatchConstraintValue]
    val PE = "PE".asInstanceOf[GeoMatchConstraintValue]
    val PH = "PH".asInstanceOf[GeoMatchConstraintValue]
    val PN = "PN".asInstanceOf[GeoMatchConstraintValue]
    val PL = "PL".asInstanceOf[GeoMatchConstraintValue]
    val PT = "PT".asInstanceOf[GeoMatchConstraintValue]
    val PR = "PR".asInstanceOf[GeoMatchConstraintValue]
    val QA = "QA".asInstanceOf[GeoMatchConstraintValue]
    val RE = "RE".asInstanceOf[GeoMatchConstraintValue]
    val RO = "RO".asInstanceOf[GeoMatchConstraintValue]
    val RU = "RU".asInstanceOf[GeoMatchConstraintValue]
    val RW = "RW".asInstanceOf[GeoMatchConstraintValue]
    val BL = "BL".asInstanceOf[GeoMatchConstraintValue]
    val SH = "SH".asInstanceOf[GeoMatchConstraintValue]
    val KN = "KN".asInstanceOf[GeoMatchConstraintValue]
    val LC = "LC".asInstanceOf[GeoMatchConstraintValue]
    val MF = "MF".asInstanceOf[GeoMatchConstraintValue]
    val PM = "PM".asInstanceOf[GeoMatchConstraintValue]
    val VC = "VC".asInstanceOf[GeoMatchConstraintValue]
    val WS = "WS".asInstanceOf[GeoMatchConstraintValue]
    val SM = "SM".asInstanceOf[GeoMatchConstraintValue]
    val ST = "ST".asInstanceOf[GeoMatchConstraintValue]
    val SA = "SA".asInstanceOf[GeoMatchConstraintValue]
    val SN = "SN".asInstanceOf[GeoMatchConstraintValue]
    val RS = "RS".asInstanceOf[GeoMatchConstraintValue]
    val SC = "SC".asInstanceOf[GeoMatchConstraintValue]
    val SL = "SL".asInstanceOf[GeoMatchConstraintValue]
    val SG = "SG".asInstanceOf[GeoMatchConstraintValue]
    val SX = "SX".asInstanceOf[GeoMatchConstraintValue]
    val SK = "SK".asInstanceOf[GeoMatchConstraintValue]
    val SI = "SI".asInstanceOf[GeoMatchConstraintValue]
    val SB = "SB".asInstanceOf[GeoMatchConstraintValue]
    val SO = "SO".asInstanceOf[GeoMatchConstraintValue]
    val ZA = "ZA".asInstanceOf[GeoMatchConstraintValue]
    val GS = "GS".asInstanceOf[GeoMatchConstraintValue]
    val SS = "SS".asInstanceOf[GeoMatchConstraintValue]
    val ES = "ES".asInstanceOf[GeoMatchConstraintValue]
    val LK = "LK".asInstanceOf[GeoMatchConstraintValue]
    val SD = "SD".asInstanceOf[GeoMatchConstraintValue]
    val SR = "SR".asInstanceOf[GeoMatchConstraintValue]
    val SJ = "SJ".asInstanceOf[GeoMatchConstraintValue]
    val SZ = "SZ".asInstanceOf[GeoMatchConstraintValue]
    val SE = "SE".asInstanceOf[GeoMatchConstraintValue]
    val CH = "CH".asInstanceOf[GeoMatchConstraintValue]
    val SY = "SY".asInstanceOf[GeoMatchConstraintValue]
    val TW = "TW".asInstanceOf[GeoMatchConstraintValue]
    val TJ = "TJ".asInstanceOf[GeoMatchConstraintValue]
    val TZ = "TZ".asInstanceOf[GeoMatchConstraintValue]
    val TH = "TH".asInstanceOf[GeoMatchConstraintValue]
    val TL = "TL".asInstanceOf[GeoMatchConstraintValue]
    val TG = "TG".asInstanceOf[GeoMatchConstraintValue]
    val TK = "TK".asInstanceOf[GeoMatchConstraintValue]
    val TO = "TO".asInstanceOf[GeoMatchConstraintValue]
    val TT = "TT".asInstanceOf[GeoMatchConstraintValue]
    val TN = "TN".asInstanceOf[GeoMatchConstraintValue]
    val TR = "TR".asInstanceOf[GeoMatchConstraintValue]
    val TM = "TM".asInstanceOf[GeoMatchConstraintValue]
    val TC = "TC".asInstanceOf[GeoMatchConstraintValue]
    val TV = "TV".asInstanceOf[GeoMatchConstraintValue]
    val UG = "UG".asInstanceOf[GeoMatchConstraintValue]
    val UA = "UA".asInstanceOf[GeoMatchConstraintValue]
    val AE = "AE".asInstanceOf[GeoMatchConstraintValue]
    val GB = "GB".asInstanceOf[GeoMatchConstraintValue]
    val US = "US".asInstanceOf[GeoMatchConstraintValue]
    val UM = "UM".asInstanceOf[GeoMatchConstraintValue]
    val UY = "UY".asInstanceOf[GeoMatchConstraintValue]
    val UZ = "UZ".asInstanceOf[GeoMatchConstraintValue]
    val VU = "VU".asInstanceOf[GeoMatchConstraintValue]
    val VE = "VE".asInstanceOf[GeoMatchConstraintValue]
    val VN = "VN".asInstanceOf[GeoMatchConstraintValue]
    val VG = "VG".asInstanceOf[GeoMatchConstraintValue]
    val VI = "VI".asInstanceOf[GeoMatchConstraintValue]
    val WF = "WF".asInstanceOf[GeoMatchConstraintValue]
    val EH = "EH".asInstanceOf[GeoMatchConstraintValue]
    val YE = "YE".asInstanceOf[GeoMatchConstraintValue]
    val ZM = "ZM".asInstanceOf[GeoMatchConstraintValue]
    val ZW = "ZW".asInstanceOf[GeoMatchConstraintValue]

    val values = js.Object.freeze(
      js.Array(
        AF,
        AX,
        AL,
        DZ,
        AS,
        AD,
        AO,
        AI,
        AQ,
        AG,
        AR,
        AM,
        AW,
        AU,
        AT,
        AZ,
        BS,
        BH,
        BD,
        BB,
        BY,
        BE,
        BZ,
        BJ,
        BM,
        BT,
        BO,
        BQ,
        BA,
        BW,
        BV,
        BR,
        IO,
        BN,
        BG,
        BF,
        BI,
        KH,
        CM,
        CA,
        CV,
        KY,
        CF,
        TD,
        CL,
        CN,
        CX,
        CC,
        CO,
        KM,
        CG,
        CD,
        CK,
        CR,
        CI,
        HR,
        CU,
        CW,
        CY,
        CZ,
        DK,
        DJ,
        DM,
        DO,
        EC,
        EG,
        SV,
        GQ,
        ER,
        EE,
        ET,
        FK,
        FO,
        FJ,
        FI,
        FR,
        GF,
        PF,
        TF,
        GA,
        GM,
        GE,
        DE,
        GH,
        GI,
        GR,
        GL,
        GD,
        GP,
        GU,
        GT,
        GG,
        GN,
        GW,
        GY,
        HT,
        HM,
        VA,
        HN,
        HK,
        HU,
        IS,
        IN,
        ID,
        IR,
        IQ,
        IE,
        IM,
        IL,
        IT,
        JM,
        JP,
        JE,
        JO,
        KZ,
        KE,
        KI,
        KP,
        KR,
        KW,
        KG,
        LA,
        LV,
        LB,
        LS,
        LR,
        LY,
        LI,
        LT,
        LU,
        MO,
        MK,
        MG,
        MW,
        MY,
        MV,
        ML,
        MT,
        MH,
        MQ,
        MR,
        MU,
        YT,
        MX,
        FM,
        MD,
        MC,
        MN,
        ME,
        MS,
        MA,
        MZ,
        MM,
        NA,
        NR,
        NP,
        NL,
        NC,
        NZ,
        NI,
        NE,
        NG,
        NU,
        NF,
        MP,
        NO,
        OM,
        PK,
        PW,
        PS,
        PA,
        PG,
        PY,
        PE,
        PH,
        PN,
        PL,
        PT,
        PR,
        QA,
        RE,
        RO,
        RU,
        RW,
        BL,
        SH,
        KN,
        LC,
        MF,
        PM,
        VC,
        WS,
        SM,
        ST,
        SA,
        SN,
        RS,
        SC,
        SL,
        SG,
        SX,
        SK,
        SI,
        SB,
        SO,
        ZA,
        GS,
        SS,
        ES,
        LK,
        SD,
        SR,
        SJ,
        SZ,
        SE,
        CH,
        SY,
        TW,
        TJ,
        TZ,
        TH,
        TL,
        TG,
        TK,
        TO,
        TT,
        TN,
        TR,
        TM,
        TC,
        TV,
        UG,
        UA,
        AE,
        GB,
        US,
        UM,
        UY,
        UZ,
        VU,
        VE,
        VN,
        VG,
        VI,
        WF,
        EH,
        YE,
        ZM,
        ZW
      )
    )
  }

  /**
    * Contains one or more countries that AWS WAF will search for.
    */
  @js.native
  @Factory
  trait GeoMatchSet extends js.Object {
    var GeoMatchConstraints: GeoMatchConstraints
    var GeoMatchSetId: ResourceId
    var Name: js.UndefOr[ResourceName]
  }

  /**
    * Contains the identifier and the name of the <code>GeoMatchSet</code>.
    */
  @js.native
  @Factory
  trait GeoMatchSetSummary extends js.Object {
    var GeoMatchSetId: ResourceId
    var Name: ResourceName
  }

  /**
    * Specifies the type of update to perform to an <a>GeoMatchSet</a> with <a>UpdateGeoMatchSet</a>.
    */
  @js.native
  @Factory
  trait GeoMatchSetUpdate extends js.Object {
    var Action: ChangeAction
    var GeoMatchConstraint: GeoMatchConstraint
  }

  @js.native
  @Factory
  trait GetByteMatchSetRequest extends js.Object {
    var ByteMatchSetId: ResourceId
  }

  @js.native
  @Factory
  trait GetByteMatchSetResponse extends js.Object {
    var ByteMatchSet: js.UndefOr[ByteMatchSet]
  }

  @js.native
  @Factory
  trait GetChangeTokenRequest extends js.Object {}

  @js.native
  @Factory
  trait GetChangeTokenResponse extends js.Object {
    var ChangeToken: js.UndefOr[ChangeToken]
  }

  @js.native
  @Factory
  trait GetChangeTokenStatusRequest extends js.Object {
    var ChangeToken: ChangeToken
  }

  @js.native
  @Factory
  trait GetChangeTokenStatusResponse extends js.Object {
    var ChangeTokenStatus: js.UndefOr[ChangeTokenStatus]
  }

  @js.native
  @Factory
  trait GetGeoMatchSetRequest extends js.Object {
    var GeoMatchSetId: ResourceId
  }

  @js.native
  @Factory
  trait GetGeoMatchSetResponse extends js.Object {
    var GeoMatchSet: js.UndefOr[GeoMatchSet]
  }

  @js.native
  @Factory
  trait GetIPSetRequest extends js.Object {
    var IPSetId: ResourceId
  }

  @js.native
  @Factory
  trait GetIPSetResponse extends js.Object {
    var IPSet: js.UndefOr[IPSet]
  }

  @js.native
  @Factory
  trait GetLoggingConfigurationRequest extends js.Object {
    var ResourceArn: ResourceArn
  }

  @js.native
  @Factory
  trait GetLoggingConfigurationResponse extends js.Object {
    var LoggingConfiguration: js.UndefOr[LoggingConfiguration]
  }

  @js.native
  @Factory
  trait GetPermissionPolicyRequest extends js.Object {
    var ResourceArn: ResourceArn
  }

  @js.native
  @Factory
  trait GetPermissionPolicyResponse extends js.Object {
    var Policy: js.UndefOr[PolicyString]
  }

  @js.native
  @Factory
  trait GetRateBasedRuleManagedKeysRequest extends js.Object {
    var RuleId: ResourceId
    var NextMarker: js.UndefOr[NextMarker]
  }

  @js.native
  @Factory
  trait GetRateBasedRuleManagedKeysResponse extends js.Object {
    var ManagedKeys: js.UndefOr[ManagedKeys]
    var NextMarker: js.UndefOr[NextMarker]
  }

  @js.native
  @Factory
  trait GetRateBasedRuleRequest extends js.Object {
    var RuleId: ResourceId
  }

  @js.native
  @Factory
  trait GetRateBasedRuleResponse extends js.Object {
    var Rule: js.UndefOr[RateBasedRule]
  }

  @js.native
  @Factory
  trait GetRegexMatchSetRequest extends js.Object {
    var RegexMatchSetId: ResourceId
  }

  @js.native
  @Factory
  trait GetRegexMatchSetResponse extends js.Object {
    var RegexMatchSet: js.UndefOr[RegexMatchSet]
  }

  @js.native
  @Factory
  trait GetRegexPatternSetRequest extends js.Object {
    var RegexPatternSetId: ResourceId
  }

  @js.native
  @Factory
  trait GetRegexPatternSetResponse extends js.Object {
    var RegexPatternSet: js.UndefOr[RegexPatternSet]
  }

  @js.native
  @Factory
  trait GetRuleGroupRequest extends js.Object {
    var RuleGroupId: ResourceId
  }

  @js.native
  @Factory
  trait GetRuleGroupResponse extends js.Object {
    var RuleGroup: js.UndefOr[RuleGroup]
  }

  @js.native
  @Factory
  trait GetRuleRequest extends js.Object {
    var RuleId: ResourceId
  }

  @js.native
  @Factory
  trait GetRuleResponse extends js.Object {
    var Rule: js.UndefOr[Rule]
  }

  @js.native
  @Factory
  trait GetSampledRequestsRequest extends js.Object {
    var MaxItems: GetSampledRequestsMaxItems
    var RuleId: ResourceId
    var TimeWindow: TimeWindow
    var WebAclId: ResourceId
  }

  @js.native
  @Factory
  trait GetSampledRequestsResponse extends js.Object {
    var PopulationSize: js.UndefOr[PopulationSize]
    var SampledRequests: js.UndefOr[SampledHTTPRequests]
    var TimeWindow: js.UndefOr[TimeWindow]
  }

  @js.native
  @Factory
  trait GetSizeConstraintSetRequest extends js.Object {
    var SizeConstraintSetId: ResourceId
  }

  @js.native
  @Factory
  trait GetSizeConstraintSetResponse extends js.Object {
    var SizeConstraintSet: js.UndefOr[SizeConstraintSet]
  }

  /**
    * A request to get a <a>SqlInjectionMatchSet</a>.
    */
  @js.native
  @Factory
  trait GetSqlInjectionMatchSetRequest extends js.Object {
    var SqlInjectionMatchSetId: ResourceId
  }

  /**
    * The response to a <a>GetSqlInjectionMatchSet</a> request.
    */
  @js.native
  @Factory
  trait GetSqlInjectionMatchSetResponse extends js.Object {
    var SqlInjectionMatchSet: js.UndefOr[SqlInjectionMatchSet]
  }

  @js.native
  @Factory
  trait GetWebACLForResourceRequest extends js.Object {
    var ResourceArn: ResourceArn
  }

  @js.native
  @Factory
  trait GetWebACLForResourceResponse extends js.Object {
    var WebACLSummary: js.UndefOr[WebACLSummary]
  }

  @js.native
  @Factory
  trait GetWebACLRequest extends js.Object {
    var WebACLId: ResourceId
  }

  @js.native
  @Factory
  trait GetWebACLResponse extends js.Object {
    var WebACL: js.UndefOr[WebACL]
  }

  /**
    * A request to get an <a>XssMatchSet</a>.
    */
  @js.native
  @Factory
  trait GetXssMatchSetRequest extends js.Object {
    var XssMatchSetId: ResourceId
  }

  /**
    * The response to a <a>GetXssMatchSet</a> request.
    */
  @js.native
  @Factory
  trait GetXssMatchSetResponse extends js.Object {
    var XssMatchSet: js.UndefOr[XssMatchSet]
  }

  /**
    * The response from a <a>GetSampledRequests</a> request includes an <code>HTTPHeader</code> complex type that appears as <code>Headers</code> in the response syntax. <code>HTTPHeader</code> contains the names and values of all of the headers that appear in one of the web requests that were returned by <code>GetSampledRequests</code>.
    */
  @js.native
  @Factory
  trait HTTPHeader extends js.Object {
    var Name: js.UndefOr[HeaderName]
    var Value: js.UndefOr[HeaderValue]
  }

  /**
    * The response from a <a>GetSampledRequests</a> request includes an <code>HTTPRequest</code> complex type that appears as <code>Request</code> in the response syntax. <code>HTTPRequest</code> contains information about one of the web requests that were returned by <code>GetSampledRequests</code>.
    */
  @js.native
  @Factory
  trait HTTPRequest extends js.Object {
    var ClientIP: js.UndefOr[IPString]
    var Country: js.UndefOr[Country]
    var HTTPVersion: js.UndefOr[HTTPVersion]
    var Headers: js.UndefOr[HTTPHeaders]
    var Method: js.UndefOr[HTTPMethod]
    var URI: js.UndefOr[URIString]
  }

  /**
    * Contains one or more IP addresses or blocks of IP addresses specified in Classless Inter-Domain Routing (CIDR) notation. AWS WAF supports IPv4 address ranges: /8 and any range between /16 through /32. AWS WAF supports IPv6 address ranges: /24, /32, /48, /56, /64, and /128.
    *  To specify an individual IP address, you specify the four-part IP address followed by a <code>/32</code>, for example, 192.0.2.0/32. To block a range of IP addresses, you can specify /8 or any range between /16 through /32 (for IPv4) or /24, /32, /48, /56, /64, or /128 (for IPv6). For more information about CIDR notation, see the Wikipedia entry [[https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing|Classless Inter-Domain Routing]].
    */
  @js.native
  @Factory
  trait IPSet extends js.Object {
    var IPSetDescriptors: IPSetDescriptors
    var IPSetId: ResourceId
    var Name: js.UndefOr[ResourceName]
  }

  /**
    * Specifies the IP address type (<code>IPV4</code> or <code>IPV6</code>) and the IP address range (in CIDR format) that web requests originate from.
    */
  @js.native
  @Factory
  trait IPSetDescriptor extends js.Object {
    var Type: IPSetDescriptorType
    var Value: IPSetDescriptorValue
  }

  @js.native
  sealed trait IPSetDescriptorType extends js.Any
  object IPSetDescriptorType extends js.Object {
    val IPV4 = "IPV4".asInstanceOf[IPSetDescriptorType]
    val IPV6 = "IPV6".asInstanceOf[IPSetDescriptorType]

    val values = js.Object.freeze(js.Array(IPV4, IPV6))
  }

  /**
    * Contains the identifier and the name of the <code>IPSet</code>.
    */
  @js.native
  @Factory
  trait IPSetSummary extends js.Object {
    var IPSetId: ResourceId
    var Name: ResourceName
  }

  /**
    * Specifies the type of update to perform to an <a>IPSet</a> with <a>UpdateIPSet</a>.
    */
  @js.native
  @Factory
  trait IPSetUpdate extends js.Object {
    var Action: ChangeAction
    var IPSetDescriptor: IPSetDescriptor
  }

  @js.native
  @Factory
  trait ListActivatedRulesInRuleGroupRequest extends js.Object {
    var Limit: js.UndefOr[PaginationLimit]
    var NextMarker: js.UndefOr[NextMarker]
    var RuleGroupId: js.UndefOr[ResourceId]
  }

  @js.native
  @Factory
  trait ListActivatedRulesInRuleGroupResponse extends js.Object {
    var ActivatedRules: js.UndefOr[ActivatedRules]
    var NextMarker: js.UndefOr[NextMarker]
  }

  @js.native
  @Factory
  trait ListByteMatchSetsRequest extends js.Object {
    var Limit: js.UndefOr[PaginationLimit]
    var NextMarker: js.UndefOr[NextMarker]
  }

  @js.native
  @Factory
  trait ListByteMatchSetsResponse extends js.Object {
    var ByteMatchSets: js.UndefOr[ByteMatchSetSummaries]
    var NextMarker: js.UndefOr[NextMarker]
  }

  @js.native
  @Factory
  trait ListGeoMatchSetsRequest extends js.Object {
    var Limit: js.UndefOr[PaginationLimit]
    var NextMarker: js.UndefOr[NextMarker]
  }

  @js.native
  @Factory
  trait ListGeoMatchSetsResponse extends js.Object {
    var GeoMatchSets: js.UndefOr[GeoMatchSetSummaries]
    var NextMarker: js.UndefOr[NextMarker]
  }

  @js.native
  @Factory
  trait ListIPSetsRequest extends js.Object {
    var Limit: js.UndefOr[PaginationLimit]
    var NextMarker: js.UndefOr[NextMarker]
  }

  @js.native
  @Factory
  trait ListIPSetsResponse extends js.Object {
    var IPSets: js.UndefOr[IPSetSummaries]
    var NextMarker: js.UndefOr[NextMarker]
  }

  @js.native
  @Factory
  trait ListLoggingConfigurationsRequest extends js.Object {
    var Limit: js.UndefOr[PaginationLimit]
    var NextMarker: js.UndefOr[NextMarker]
  }

  @js.native
  @Factory
  trait ListLoggingConfigurationsResponse extends js.Object {
    var LoggingConfigurations: js.UndefOr[LoggingConfigurations]
    var NextMarker: js.UndefOr[NextMarker]
  }

  @js.native
  @Factory
  trait ListRateBasedRulesRequest extends js.Object {
    var Limit: js.UndefOr[PaginationLimit]
    var NextMarker: js.UndefOr[NextMarker]
  }

  @js.native
  @Factory
  trait ListRateBasedRulesResponse extends js.Object {
    var NextMarker: js.UndefOr[NextMarker]
    var Rules: js.UndefOr[RuleSummaries]
  }

  @js.native
  @Factory
  trait ListRegexMatchSetsRequest extends js.Object {
    var Limit: js.UndefOr[PaginationLimit]
    var NextMarker: js.UndefOr[NextMarker]
  }

  @js.native
  @Factory
  trait ListRegexMatchSetsResponse extends js.Object {
    var NextMarker: js.UndefOr[NextMarker]
    var RegexMatchSets: js.UndefOr[RegexMatchSetSummaries]
  }

  @js.native
  @Factory
  trait ListRegexPatternSetsRequest extends js.Object {
    var Limit: js.UndefOr[PaginationLimit]
    var NextMarker: js.UndefOr[NextMarker]
  }

  @js.native
  @Factory
  trait ListRegexPatternSetsResponse extends js.Object {
    var NextMarker: js.UndefOr[NextMarker]
    var RegexPatternSets: js.UndefOr[RegexPatternSetSummaries]
  }

  @js.native
  @Factory
  trait ListResourcesForWebACLRequest extends js.Object {
    var WebACLId: ResourceId
    var ResourceType: js.UndefOr[ResourceType]
  }

  @js.native
  @Factory
  trait ListResourcesForWebACLResponse extends js.Object {
    var ResourceArns: js.UndefOr[ResourceArns]
  }

  @js.native
  @Factory
  trait ListRuleGroupsRequest extends js.Object {
    var Limit: js.UndefOr[PaginationLimit]
    var NextMarker: js.UndefOr[NextMarker]
  }

  @js.native
  @Factory
  trait ListRuleGroupsResponse extends js.Object {
    var NextMarker: js.UndefOr[NextMarker]
    var RuleGroups: js.UndefOr[RuleGroupSummaries]
  }

  @js.native
  @Factory
  trait ListRulesRequest extends js.Object {
    var Limit: js.UndefOr[PaginationLimit]
    var NextMarker: js.UndefOr[NextMarker]
  }

  @js.native
  @Factory
  trait ListRulesResponse extends js.Object {
    var NextMarker: js.UndefOr[NextMarker]
    var Rules: js.UndefOr[RuleSummaries]
  }

  @js.native
  @Factory
  trait ListSizeConstraintSetsRequest extends js.Object {
    var Limit: js.UndefOr[PaginationLimit]
    var NextMarker: js.UndefOr[NextMarker]
  }

  @js.native
  @Factory
  trait ListSizeConstraintSetsResponse extends js.Object {
    var NextMarker: js.UndefOr[NextMarker]
    var SizeConstraintSets: js.UndefOr[SizeConstraintSetSummaries]
  }

  /**
    * A request to list the <a>SqlInjectionMatchSet</a> objects created by the current AWS account.
    */
  @js.native
  @Factory
  trait ListSqlInjectionMatchSetsRequest extends js.Object {
    var Limit: js.UndefOr[PaginationLimit]
    var NextMarker: js.UndefOr[NextMarker]
  }

  /**
    * The response to a <a>ListSqlInjectionMatchSets</a> request.
    */
  @js.native
  @Factory
  trait ListSqlInjectionMatchSetsResponse extends js.Object {
    var NextMarker: js.UndefOr[NextMarker]
    var SqlInjectionMatchSets: js.UndefOr[SqlInjectionMatchSetSummaries]
  }

  @js.native
  @Factory
  trait ListSubscribedRuleGroupsRequest extends js.Object {
    var Limit: js.UndefOr[PaginationLimit]
    var NextMarker: js.UndefOr[NextMarker]
  }

  @js.native
  @Factory
  trait ListSubscribedRuleGroupsResponse extends js.Object {
    var NextMarker: js.UndefOr[NextMarker]
    var RuleGroups: js.UndefOr[SubscribedRuleGroupSummaries]
  }

  @js.native
  @Factory
  trait ListTagsForResourceRequest extends js.Object {
    var ResourceARN: ResourceArn
    var Limit: js.UndefOr[PaginationLimit]
    var NextMarker: js.UndefOr[NextMarker]
  }

  @js.native
  @Factory
  trait ListTagsForResourceResponse extends js.Object {
    var NextMarker: js.UndefOr[NextMarker]
    var TagInfoForResource: js.UndefOr[TagInfoForResource]
  }

  @js.native
  @Factory
  trait ListWebACLsRequest extends js.Object {
    var Limit: js.UndefOr[PaginationLimit]
    var NextMarker: js.UndefOr[NextMarker]
  }

  @js.native
  @Factory
  trait ListWebACLsResponse extends js.Object {
    var NextMarker: js.UndefOr[NextMarker]
    var WebACLs: js.UndefOr[WebACLSummaries]
  }

  /**
    * A request to list the <a>XssMatchSet</a> objects created by the current AWS account.
    */
  @js.native
  @Factory
  trait ListXssMatchSetsRequest extends js.Object {
    var Limit: js.UndefOr[PaginationLimit]
    var NextMarker: js.UndefOr[NextMarker]
  }

  /**
    * The response to a <a>ListXssMatchSets</a> request.
    */
  @js.native
  @Factory
  trait ListXssMatchSetsResponse extends js.Object {
    var NextMarker: js.UndefOr[NextMarker]
    var XssMatchSets: js.UndefOr[XssMatchSetSummaries]
  }

  /**
    * The Amazon Kinesis Data Firehose, <code>RedactedFields</code> information, and the web ACL Amazon Resource Name (ARN).
    */
  @js.native
  @Factory
  trait LoggingConfiguration extends js.Object {
    var LogDestinationConfigs: LogDestinationConfigs
    var ResourceArn: ResourceArn
    var RedactedFields: js.UndefOr[RedactedFields]
  }

  @js.native
  sealed trait MatchFieldType extends js.Any
  object MatchFieldType extends js.Object {
    val URI              = "URI".asInstanceOf[MatchFieldType]
    val QUERY_STRING     = "QUERY_STRING".asInstanceOf[MatchFieldType]
    val HEADER           = "HEADER".asInstanceOf[MatchFieldType]
    val METHOD           = "METHOD".asInstanceOf[MatchFieldType]
    val BODY             = "BODY".asInstanceOf[MatchFieldType]
    val SINGLE_QUERY_ARG = "SINGLE_QUERY_ARG".asInstanceOf[MatchFieldType]
    val ALL_QUERY_ARGS   = "ALL_QUERY_ARGS".asInstanceOf[MatchFieldType]

    val values = js.Object.freeze(js.Array(URI, QUERY_STRING, HEADER, METHOD, BODY, SINGLE_QUERY_ARG, ALL_QUERY_ARGS))
  }

  @js.native
  sealed trait PositionalConstraint extends js.Any
  object PositionalConstraint extends js.Object {
    val EXACTLY       = "EXACTLY".asInstanceOf[PositionalConstraint]
    val STARTS_WITH   = "STARTS_WITH".asInstanceOf[PositionalConstraint]
    val ENDS_WITH     = "ENDS_WITH".asInstanceOf[PositionalConstraint]
    val CONTAINS      = "CONTAINS".asInstanceOf[PositionalConstraint]
    val CONTAINS_WORD = "CONTAINS_WORD".asInstanceOf[PositionalConstraint]

    val values = js.Object.freeze(js.Array(EXACTLY, STARTS_WITH, ENDS_WITH, CONTAINS, CONTAINS_WORD))
  }

  /**
    * Specifies the <a>ByteMatchSet</a>, <a>IPSet</a>, <a>SqlInjectionMatchSet</a>, <a>XssMatchSet</a>, <a>RegexMatchSet</a>, <a>GeoMatchSet</a>, and <a>SizeConstraintSet</a> objects that you want to add to a <code>Rule</code> and, for each object, indicates whether you want to negate the settings, for example, requests that do NOT originate from the IP address 192.0.2.44.
    */
  @js.native
  @Factory
  trait Predicate extends js.Object {
    var DataId: ResourceId
    var Negated: Negated
    var Type: PredicateType
  }

  @js.native
  sealed trait PredicateType extends js.Any
  object PredicateType extends js.Object {
    val IPMatch           = "IPMatch".asInstanceOf[PredicateType]
    val ByteMatch         = "ByteMatch".asInstanceOf[PredicateType]
    val SqlInjectionMatch = "SqlInjectionMatch".asInstanceOf[PredicateType]
    val GeoMatch          = "GeoMatch".asInstanceOf[PredicateType]
    val SizeConstraint    = "SizeConstraint".asInstanceOf[PredicateType]
    val XssMatch          = "XssMatch".asInstanceOf[PredicateType]
    val RegexMatch        = "RegexMatch".asInstanceOf[PredicateType]

    val values =
      js.Object.freeze(js.Array(IPMatch, ByteMatch, SqlInjectionMatch, GeoMatch, SizeConstraint, XssMatch, RegexMatch))
  }

  @js.native
  @Factory
  trait PutLoggingConfigurationRequest extends js.Object {
    var LoggingConfiguration: LoggingConfiguration
  }

  @js.native
  @Factory
  trait PutLoggingConfigurationResponse extends js.Object {
    var LoggingConfiguration: js.UndefOr[LoggingConfiguration]
  }

  @js.native
  @Factory
  trait PutPermissionPolicyRequest extends js.Object {
    var Policy: PolicyString
    var ResourceArn: ResourceArn
  }

  @js.native
  @Factory
  trait PutPermissionPolicyResponse extends js.Object {}

  /**
    * A <code>RateBasedRule</code> is identical to a regular <a>Rule</a>, with one addition: a <code>RateBasedRule</code> counts the number of requests that arrive from a specified IP address every five minutes. For example, based on recent requests that you've seen from an attacker, you might create a <code>RateBasedRule</code> that includes the following conditions:
    * * The requests come from 192.0.2.44.
    *  * They contain the value <code>BadBot</code> in the <code>User-Agent</code> header.
    * In the rule, you also define the rate limit as 15,000.
    *  Requests that meet both of these conditions and exceed 15,000 requests every five minutes trigger the rule's action (block or count), which is defined in the web ACL.
    */
  @js.native
  @Factory
  trait RateBasedRule extends js.Object {
    var MatchPredicates: Predicates
    var RateKey: RateKey
    var RateLimit: RateLimit
    var RuleId: ResourceId
    var MetricName: js.UndefOr[MetricName]
    var Name: js.UndefOr[ResourceName]
  }

  @js.native
  sealed trait RateKey extends js.Any
  object RateKey extends js.Object {
    val IP = "IP".asInstanceOf[RateKey]

    val values = js.Object.freeze(js.Array(IP))
  }

  /**
    * In a <a>GetRegexMatchSet</a> request, <code>RegexMatchSet</code> is a complex type that contains the <code>RegexMatchSetId</code> and <code>Name</code> of a <code>RegexMatchSet</code>, and the values that you specified when you updated the <code>RegexMatchSet</code>.
    *  The values are contained in a <code>RegexMatchTuple</code> object, which specify the parts of web requests that you want AWS WAF to inspect and the values that you want AWS WAF to search for. If a <code>RegexMatchSet</code> contains more than one <code>RegexMatchTuple</code> object, a request needs to match the settings in only one <code>ByteMatchTuple</code> to be considered a match.
    */
  @js.native
  @Factory
  trait RegexMatchSet extends js.Object {
    var Name: js.UndefOr[ResourceName]
    var RegexMatchSetId: js.UndefOr[ResourceId]
    var RegexMatchTuples: js.UndefOr[RegexMatchTuples]
  }

  /**
    * Returned by <a>ListRegexMatchSets</a>. Each <code>RegexMatchSetSummary</code> object includes the <code>Name</code> and <code>RegexMatchSetId</code> for one <a>RegexMatchSet</a>.
    */
  @js.native
  @Factory
  trait RegexMatchSetSummary extends js.Object {
    var Name: ResourceName
    var RegexMatchSetId: ResourceId
  }

  /**
    * In an <a>UpdateRegexMatchSet</a> request, <code>RegexMatchSetUpdate</code> specifies whether to insert or delete a <a>RegexMatchTuple</a> and includes the settings for the <code>RegexMatchTuple</code>.
    */
  @js.native
  @Factory
  trait RegexMatchSetUpdate extends js.Object {
    var Action: ChangeAction
    var RegexMatchTuple: RegexMatchTuple
  }

  /**
    * The regular expression pattern that you want AWS WAF to search for in web requests, the location in requests that you want AWS WAF to search, and other settings. Each <code>RegexMatchTuple</code> object contains:
    * * The part of a web request that you want AWS WAF to inspect, such as a query string or the value of the <code>User-Agent</code> header.
    *  * The identifier of the pattern (a regular expression) that you want AWS WAF to look for. For more information, see <a>RegexPatternSet</a>.
    *  * Whether to perform any conversions on the request, such as converting it to lowercase, before inspecting it for the specified string.
    */
  @js.native
  @Factory
  trait RegexMatchTuple extends js.Object {
    var FieldToMatch: FieldToMatch
    var RegexPatternSetId: ResourceId
    var TextTransformation: TextTransformation
  }

  /**
    * The <code>RegexPatternSet</code> specifies the regular expression (regex) pattern that you want AWS WAF to search for, such as <code>B[a@]dB[o0]t</code>. You can then configure AWS WAF to reject those requests.
    */
  @js.native
  @Factory
  trait RegexPatternSet extends js.Object {
    var RegexPatternSetId: ResourceId
    var RegexPatternStrings: RegexPatternStrings
    var Name: js.UndefOr[ResourceName]
  }

  /**
    * Returned by <a>ListRegexPatternSets</a>. Each <code>RegexPatternSetSummary</code> object includes the <code>Name</code> and <code>RegexPatternSetId</code> for one <a>RegexPatternSet</a>.
    */
  @js.native
  @Factory
  trait RegexPatternSetSummary extends js.Object {
    var Name: ResourceName
    var RegexPatternSetId: ResourceId
  }

  /**
    * In an <a>UpdateRegexPatternSet</a> request, <code>RegexPatternSetUpdate</code> specifies whether to insert or delete a <code>RegexPatternString</code> and includes the settings for the <code>RegexPatternString</code>.
    */
  @js.native
  @Factory
  trait RegexPatternSetUpdate extends js.Object {
    var Action: ChangeAction
    var RegexPatternString: RegexPatternString
  }

  @js.native
  sealed trait ResourceType extends js.Any
  object ResourceType extends js.Object {
    val APPLICATION_LOAD_BALANCER = "APPLICATION_LOAD_BALANCER".asInstanceOf[ResourceType]
    val API_GATEWAY               = "API_GATEWAY".asInstanceOf[ResourceType]

    val values = js.Object.freeze(js.Array(APPLICATION_LOAD_BALANCER, API_GATEWAY))
  }

  /**
    * A combination of <a>ByteMatchSet</a>, <a>IPSet</a>, and/or <a>SqlInjectionMatchSet</a> objects that identify the web requests that you want to allow, block, or count. For example, you might create a <code>Rule</code> that includes the following predicates:
    * * An <code>IPSet</code> that causes AWS WAF to search for web requests that originate from the IP address <code>192.0.2.44</code>
    *  * A <code>ByteMatchSet</code> that causes AWS WAF to search for web requests for which the value of the <code>User-Agent</code> header is <code>BadBot</code>.
    * To match the settings in this <code>Rule</code>, a request must originate from <code>192.0.2.44</code> AND include a <code>User-Agent</code> header for which the value is <code>BadBot</code>.
    */
  @js.native
  @Factory
  trait Rule extends js.Object {
    var Predicates: Predicates
    var RuleId: ResourceId
    var MetricName: js.UndefOr[MetricName]
    var Name: js.UndefOr[ResourceName]
  }

  /**
    * A collection of predefined rules that you can add to a web ACL.
    *  Rule groups are subject to the following limits:
    * * Three rule groups per account. You can request an increase to this limit by contacting customer support.
    *  * One rule group per web ACL.
    *  * Ten rules per rule group.
    */
  @js.native
  @Factory
  trait RuleGroup extends js.Object {
    var RuleGroupId: ResourceId
    var MetricName: js.UndefOr[MetricName]
    var Name: js.UndefOr[ResourceName]
  }

  /**
    * Contains the identifier and the friendly name or description of the <code>RuleGroup</code>.
    */
  @js.native
  @Factory
  trait RuleGroupSummary extends js.Object {
    var Name: ResourceName
    var RuleGroupId: ResourceId
  }

  /**
    * Specifies an <code>ActivatedRule</code> and indicates whether you want to add it to a <code>RuleGroup</code> or delete it from a <code>RuleGroup</code>.
    */
  @js.native
  @Factory
  trait RuleGroupUpdate extends js.Object {
    var Action: ChangeAction
    var ActivatedRule: ActivatedRule
  }

  /**
    * Contains the identifier and the friendly name or description of the <code>Rule</code>.
    */
  @js.native
  @Factory
  trait RuleSummary extends js.Object {
    var Name: ResourceName
    var RuleId: ResourceId
  }

  /**
    * Specifies a <code>Predicate</code> (such as an <code>IPSet</code>) and indicates whether you want to add it to a <code>Rule</code> or delete it from a <code>Rule</code>.
    */
  @js.native
  @Factory
  trait RuleUpdate extends js.Object {
    var Action: ChangeAction
    var Predicate: Predicate
  }

  /**
    * The response from a <a>GetSampledRequests</a> request includes a <code>SampledHTTPRequests</code> complex type that appears as <code>SampledRequests</code> in the response syntax. <code>SampledHTTPRequests</code> contains one <code>SampledHTTPRequest</code> object for each web request that is returned by <code>GetSampledRequests</code>.
    */
  @js.native
  @Factory
  trait SampledHTTPRequest extends js.Object {
    var Request: HTTPRequest
    var Weight: SampleWeight
    var Action: js.UndefOr[Action]
    var RuleWithinRuleGroup: js.UndefOr[ResourceId]
    var Timestamp: js.UndefOr[Timestamp]
  }

  /**
    * Specifies a constraint on the size of a part of the web request. AWS WAF uses the <code>Size</code>, <code>ComparisonOperator</code>, and <code>FieldToMatch</code> to build an expression in the form of "<code>Size</code> <code>ComparisonOperator</code> size in bytes of <code>FieldToMatch</code>". If that expression is true, the <code>SizeConstraint</code> is considered to match.
    */
  @js.native
  @Factory
  trait SizeConstraint extends js.Object {
    var ComparisonOperator: ComparisonOperator
    var FieldToMatch: FieldToMatch
    var Size: Size
    var TextTransformation: TextTransformation
  }

  /**
    * A complex type that contains <code>SizeConstraint</code> objects, which specify the parts of web requests that you want AWS WAF to inspect the size of. If a <code>SizeConstraintSet</code> contains more than one <code>SizeConstraint</code> object, a request only needs to match one constraint to be considered a match.
    */
  @js.native
  @Factory
  trait SizeConstraintSet extends js.Object {
    var SizeConstraintSetId: ResourceId
    var SizeConstraints: SizeConstraints
    var Name: js.UndefOr[ResourceName]
  }

  /**
    * The <code>Id</code> and <code>Name</code> of a <code>SizeConstraintSet</code>.
    */
  @js.native
  @Factory
  trait SizeConstraintSetSummary extends js.Object {
    var Name: ResourceName
    var SizeConstraintSetId: ResourceId
  }

  /**
    * Specifies the part of a web request that you want to inspect the size of and indicates whether you want to add the specification to a <a>SizeConstraintSet</a> or delete it from a <code>SizeConstraintSet</code>.
    */
  @js.native
  @Factory
  trait SizeConstraintSetUpdate extends js.Object {
    var Action: ChangeAction
    var SizeConstraint: SizeConstraint
  }

  /**
    * A complex type that contains <code>SqlInjectionMatchTuple</code> objects, which specify the parts of web requests that you want AWS WAF to inspect for snippets of malicious SQL code and, if you want AWS WAF to inspect a header, the name of the header. If a <code>SqlInjectionMatchSet</code> contains more than one <code>SqlInjectionMatchTuple</code> object, a request needs to include snippets of SQL code in only one of the specified parts of the request to be considered a match.
    */
  @js.native
  @Factory
  trait SqlInjectionMatchSet extends js.Object {
    var SqlInjectionMatchSetId: ResourceId
    var SqlInjectionMatchTuples: SqlInjectionMatchTuples
    var Name: js.UndefOr[ResourceName]
  }

  /**
    * The <code>Id</code> and <code>Name</code> of a <code>SqlInjectionMatchSet</code>.
    */
  @js.native
  @Factory
  trait SqlInjectionMatchSetSummary extends js.Object {
    var Name: ResourceName
    var SqlInjectionMatchSetId: ResourceId
  }

  /**
    * Specifies the part of a web request that you want to inspect for snippets of malicious SQL code and indicates whether you want to add the specification to a <a>SqlInjectionMatchSet</a> or delete it from a <code>SqlInjectionMatchSet</code>.
    */
  @js.native
  @Factory
  trait SqlInjectionMatchSetUpdate extends js.Object {
    var Action: ChangeAction
    var SqlInjectionMatchTuple: SqlInjectionMatchTuple
  }

  /**
    * Specifies the part of a web request that you want AWS WAF to inspect for snippets of malicious SQL code and, if you want AWS WAF to inspect a header, the name of the header.
    */
  @js.native
  @Factory
  trait SqlInjectionMatchTuple extends js.Object {
    var FieldToMatch: FieldToMatch
    var TextTransformation: TextTransformation
  }

  /**
    * A summary of the rule groups you are subscribed to.
    */
  @js.native
  @Factory
  trait SubscribedRuleGroupSummary extends js.Object {
    var MetricName: MetricName
    var Name: ResourceName
    var RuleGroupId: ResourceId
  }

  @js.native
  @Factory
  trait Tag extends js.Object {
    var Key: js.UndefOr[TagKey]
    var Value: js.UndefOr[TagValue]
  }

  @js.native
  @Factory
  trait TagInfoForResource extends js.Object {
    var ResourceARN: js.UndefOr[ResourceArn]
    var TagList: js.UndefOr[TagList]
  }

  @js.native
  @Factory
  trait TagResourceRequest extends js.Object {
    var ResourceARN: ResourceArn
    var Tags: TagList
  }

  @js.native
  @Factory
  trait TagResourceResponse extends js.Object {}

  @js.native
  sealed trait TextTransformation extends js.Any
  object TextTransformation extends js.Object {
    val NONE                 = "NONE".asInstanceOf[TextTransformation]
    val COMPRESS_WHITE_SPACE = "COMPRESS_WHITE_SPACE".asInstanceOf[TextTransformation]
    val HTML_ENTITY_DECODE   = "HTML_ENTITY_DECODE".asInstanceOf[TextTransformation]
    val LOWERCASE            = "LOWERCASE".asInstanceOf[TextTransformation]
    val CMD_LINE             = "CMD_LINE".asInstanceOf[TextTransformation]
    val URL_DECODE           = "URL_DECODE".asInstanceOf[TextTransformation]

    val values =
      js.Object.freeze(js.Array(NONE, COMPRESS_WHITE_SPACE, HTML_ENTITY_DECODE, LOWERCASE, CMD_LINE, URL_DECODE))
  }

  /**
    * In a <a>GetSampledRequests</a> request, the <code>StartTime</code> and <code>EndTime</code> objects specify the time range for which you want AWS WAF to return a sample of web requests.
    *  In a <a>GetSampledRequests</a> response, the <code>StartTime</code> and <code>EndTime</code> objects specify the time range for which AWS WAF actually returned a sample of web requests. AWS WAF gets the specified number of requests from among the first 5,000 requests that your AWS resource receives during the specified time period. If your resource receives more than 5,000 requests during that period, AWS WAF stops sampling after the 5,000th request. In that case, <code>EndTime</code> is the time that AWS WAF received the 5,000th request.
    */
  @js.native
  @Factory
  trait TimeWindow extends js.Object {
    var EndTime: Timestamp
    var StartTime: Timestamp
  }

  @js.native
  @Factory
  trait UntagResourceRequest extends js.Object {
    var ResourceARN: ResourceArn
    var TagKeys: TagKeyList
  }

  @js.native
  @Factory
  trait UntagResourceResponse extends js.Object {}

  @js.native
  @Factory
  trait UpdateByteMatchSetRequest extends js.Object {
    var ByteMatchSetId: ResourceId
    var ChangeToken: ChangeToken
    var Updates: ByteMatchSetUpdates
  }

  @js.native
  @Factory
  trait UpdateByteMatchSetResponse extends js.Object {
    var ChangeToken: js.UndefOr[ChangeToken]
  }

  @js.native
  @Factory
  trait UpdateGeoMatchSetRequest extends js.Object {
    var ChangeToken: ChangeToken
    var GeoMatchSetId: ResourceId
    var Updates: GeoMatchSetUpdates
  }

  @js.native
  @Factory
  trait UpdateGeoMatchSetResponse extends js.Object {
    var ChangeToken: js.UndefOr[ChangeToken]
  }

  @js.native
  @Factory
  trait UpdateIPSetRequest extends js.Object {
    var ChangeToken: ChangeToken
    var IPSetId: ResourceId
    var Updates: IPSetUpdates
  }

  @js.native
  @Factory
  trait UpdateIPSetResponse extends js.Object {
    var ChangeToken: js.UndefOr[ChangeToken]
  }

  @js.native
  @Factory
  trait UpdateRateBasedRuleRequest extends js.Object {
    var ChangeToken: ChangeToken
    var RateLimit: RateLimit
    var RuleId: ResourceId
    var Updates: RuleUpdates
  }

  @js.native
  @Factory
  trait UpdateRateBasedRuleResponse extends js.Object {
    var ChangeToken: js.UndefOr[ChangeToken]
  }

  @js.native
  @Factory
  trait UpdateRegexMatchSetRequest extends js.Object {
    var ChangeToken: ChangeToken
    var RegexMatchSetId: ResourceId
    var Updates: RegexMatchSetUpdates
  }

  @js.native
  @Factory
  trait UpdateRegexMatchSetResponse extends js.Object {
    var ChangeToken: js.UndefOr[ChangeToken]
  }

  @js.native
  @Factory
  trait UpdateRegexPatternSetRequest extends js.Object {
    var ChangeToken: ChangeToken
    var RegexPatternSetId: ResourceId
    var Updates: RegexPatternSetUpdates
  }

  @js.native
  @Factory
  trait UpdateRegexPatternSetResponse extends js.Object {
    var ChangeToken: js.UndefOr[ChangeToken]
  }

  @js.native
  @Factory
  trait UpdateRuleGroupRequest extends js.Object {
    var ChangeToken: ChangeToken
    var RuleGroupId: ResourceId
    var Updates: RuleGroupUpdates
  }

  @js.native
  @Factory
  trait UpdateRuleGroupResponse extends js.Object {
    var ChangeToken: js.UndefOr[ChangeToken]
  }

  @js.native
  @Factory
  trait UpdateRuleRequest extends js.Object {
    var ChangeToken: ChangeToken
    var RuleId: ResourceId
    var Updates: RuleUpdates
  }

  @js.native
  @Factory
  trait UpdateRuleResponse extends js.Object {
    var ChangeToken: js.UndefOr[ChangeToken]
  }

  @js.native
  @Factory
  trait UpdateSizeConstraintSetRequest extends js.Object {
    var ChangeToken: ChangeToken
    var SizeConstraintSetId: ResourceId
    var Updates: SizeConstraintSetUpdates
  }

  @js.native
  @Factory
  trait UpdateSizeConstraintSetResponse extends js.Object {
    var ChangeToken: js.UndefOr[ChangeToken]
  }

  /**
    * A request to update a <a>SqlInjectionMatchSet</a>.
    */
  @js.native
  @Factory
  trait UpdateSqlInjectionMatchSetRequest extends js.Object {
    var ChangeToken: ChangeToken
    var SqlInjectionMatchSetId: ResourceId
    var Updates: SqlInjectionMatchSetUpdates
  }

  /**
    * The response to an <a>UpdateSqlInjectionMatchSets</a> request.
    */
  @js.native
  @Factory
  trait UpdateSqlInjectionMatchSetResponse extends js.Object {
    var ChangeToken: js.UndefOr[ChangeToken]
  }

  @js.native
  @Factory
  trait UpdateWebACLRequest extends js.Object {
    var ChangeToken: ChangeToken
    var WebACLId: ResourceId
    var DefaultAction: js.UndefOr[WafAction]
    var Updates: js.UndefOr[WebACLUpdates]
  }

  @js.native
  @Factory
  trait UpdateWebACLResponse extends js.Object {
    var ChangeToken: js.UndefOr[ChangeToken]
  }

  /**
    * A request to update an <a>XssMatchSet</a>.
    */
  @js.native
  @Factory
  trait UpdateXssMatchSetRequest extends js.Object {
    var ChangeToken: ChangeToken
    var Updates: XssMatchSetUpdates
    var XssMatchSetId: ResourceId
  }

  /**
    * The response to an <a>UpdateXssMatchSets</a> request.
    */
  @js.native
  @Factory
  trait UpdateXssMatchSetResponse extends js.Object {
    var ChangeToken: js.UndefOr[ChangeToken]
  }

  /**
    * For the action that is associated with a rule in a <code>WebACL</code>, specifies the action that you want AWS WAF to perform when a web request matches all of the conditions in a rule. For the default action in a <code>WebACL</code>, specifies the action that you want AWS WAF to take when a web request doesn't match all of the conditions in any of the rules in a <code>WebACL</code>.
    */
  @js.native
  @Factory
  trait WafAction extends js.Object {
    var Type: WafActionType
  }

  @js.native
  sealed trait WafActionType extends js.Any
  object WafActionType extends js.Object {
    val BLOCK = "BLOCK".asInstanceOf[WafActionType]
    val ALLOW = "ALLOW".asInstanceOf[WafActionType]
    val COUNT = "COUNT".asInstanceOf[WafActionType]

    val values = js.Object.freeze(js.Array(BLOCK, ALLOW, COUNT))
  }

  /**
    * The action to take if any rule within the <code>RuleGroup</code> matches a request.
    */
  @js.native
  @Factory
  trait WafOverrideAction extends js.Object {
    var Type: WafOverrideActionType
  }

  @js.native
  sealed trait WafOverrideActionType extends js.Any
  object WafOverrideActionType extends js.Object {
    val NONE  = "NONE".asInstanceOf[WafOverrideActionType]
    val COUNT = "COUNT".asInstanceOf[WafOverrideActionType]

    val values = js.Object.freeze(js.Array(NONE, COUNT))
  }

  @js.native
  sealed trait WafRuleType extends js.Any
  object WafRuleType extends js.Object {
    val REGULAR    = "REGULAR".asInstanceOf[WafRuleType]
    val RATE_BASED = "RATE_BASED".asInstanceOf[WafRuleType]
    val GROUP      = "GROUP".asInstanceOf[WafRuleType]

    val values = js.Object.freeze(js.Array(REGULAR, RATE_BASED, GROUP))
  }

  /**
    * Contains the <code>Rules</code> that identify the requests that you want to allow, block, or count. In a <code>WebACL</code>, you also specify a default action (<code>ALLOW</code> or <code>BLOCK</code>), and the action for each <code>Rule</code> that you add to a <code>WebACL</code>, for example, block requests from specified IP addresses or block requests from specified referrers. You also associate the <code>WebACL</code> with a CloudFront distribution to identify the requests that you want AWS WAF to filter. If you add more than one <code>Rule</code> to a <code>WebACL</code>, a request needs to match only one of the specifications to be allowed, blocked, or counted. For more information, see <a>UpdateWebACL</a>.
    */
  @js.native
  @Factory
  trait WebACL extends js.Object {
    var DefaultAction: WafAction
    var Rules: ActivatedRules
    var WebACLId: ResourceId
    var MetricName: js.UndefOr[MetricName]
    var Name: js.UndefOr[ResourceName]
    var WebACLArn: js.UndefOr[ResourceArn]
  }

  /**
    * Contains the identifier and the name or description of the <a>WebACL</a>.
    */
  @js.native
  @Factory
  trait WebACLSummary extends js.Object {
    var Name: ResourceName
    var WebACLId: ResourceId
  }

  /**
    * Specifies whether to insert a <code>Rule</code> into or delete a <code>Rule</code> from a <code>WebACL</code>.
    */
  @js.native
  @Factory
  trait WebACLUpdate extends js.Object {
    var Action: ChangeAction
    var ActivatedRule: ActivatedRule
  }

  /**
    * A complex type that contains <code>XssMatchTuple</code> objects, which specify the parts of web requests that you want AWS WAF to inspect for cross-site scripting attacks and, if you want AWS WAF to inspect a header, the name of the header. If a <code>XssMatchSet</code> contains more than one <code>XssMatchTuple</code> object, a request needs to include cross-site scripting attacks in only one of the specified parts of the request to be considered a match.
    */
  @js.native
  @Factory
  trait XssMatchSet extends js.Object {
    var XssMatchSetId: ResourceId
    var XssMatchTuples: XssMatchTuples
    var Name: js.UndefOr[ResourceName]
  }

  /**
    * The <code>Id</code> and <code>Name</code> of an <code>XssMatchSet</code>.
    */
  @js.native
  @Factory
  trait XssMatchSetSummary extends js.Object {
    var Name: ResourceName
    var XssMatchSetId: ResourceId
  }

  /**
    * Specifies the part of a web request that you want to inspect for cross-site scripting attacks and indicates whether you want to add the specification to an <a>XssMatchSet</a> or delete it from an <code>XssMatchSet</code>.
    */
  @js.native
  @Factory
  trait XssMatchSetUpdate extends js.Object {
    var Action: ChangeAction
    var XssMatchTuple: XssMatchTuple
  }

  /**
    * Specifies the part of a web request that you want AWS WAF to inspect for cross-site scripting attacks and, if you want AWS WAF to inspect a header, the name of the header.
    */
  @js.native
  @Factory
  trait XssMatchTuple extends js.Object {
    var FieldToMatch: FieldToMatch
    var TextTransformation: TextTransformation
  }
}
