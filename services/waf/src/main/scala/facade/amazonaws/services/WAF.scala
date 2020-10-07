package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

package object waf {
  type Action = String
  type ActivatedRules = js.Array[ActivatedRule]
  type ByteMatchSetSummaries = js.Array[ByteMatchSetSummary]
  type ByteMatchSetUpdates = js.Array[ByteMatchSetUpdate]
  type ByteMatchTargetString = js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type ByteMatchTuples = js.Array[ByteMatchTuple]
  type ChangeToken = String
  type Country = String
  type ExcludedRules = js.Array[ExcludedRule]
  type GeoMatchConstraints = js.Array[GeoMatchConstraint]
  type GeoMatchSetSummaries = js.Array[GeoMatchSetSummary]
  type GeoMatchSetUpdates = js.Array[GeoMatchSetUpdate]
  type GetSampledRequestsMaxItems = Double
  type HTTPHeaders = js.Array[HTTPHeader]
  type HTTPMethod = String
  type HTTPVersion = String
  type HeaderName = String
  type HeaderValue = String
  type IPSetDescriptorValue = String
  type IPSetDescriptors = js.Array[IPSetDescriptor]
  type IPSetSummaries = js.Array[IPSetSummary]
  type IPSetUpdates = js.Array[IPSetUpdate]
  type IPString = String
  type IgnoreUnsupportedType = Boolean
  type LogDestinationConfigs = js.Array[ResourceArn]
  type LoggingConfigurations = js.Array[LoggingConfiguration]
  type ManagedKey = String
  type ManagedKeys = js.Array[ManagedKey]
  type MatchFieldData = String
  type MetricName = String
  type Negated = Boolean
  type NextMarker = String
  type PaginationLimit = Int
  type PolicyString = String
  type PopulationSize = Double
  type Predicates = js.Array[Predicate]
  type RateLimit = Double
  type RedactedFields = js.Array[FieldToMatch]
  type RegexMatchSetSummaries = js.Array[RegexMatchSetSummary]
  type RegexMatchSetUpdates = js.Array[RegexMatchSetUpdate]
  type RegexMatchTuples = js.Array[RegexMatchTuple]
  type RegexPatternSetSummaries = js.Array[RegexPatternSetSummary]
  type RegexPatternSetUpdates = js.Array[RegexPatternSetUpdate]
  type RegexPatternString = String
  type RegexPatternStrings = js.Array[RegexPatternString]
  type ResourceArn = String
  type ResourceId = String
  type ResourceName = String
  type RuleGroupSummaries = js.Array[RuleGroupSummary]
  type RuleGroupUpdates = js.Array[RuleGroupUpdate]
  type RulePriority = Int
  type RuleSummaries = js.Array[RuleSummary]
  type RuleUpdates = js.Array[RuleUpdate]
  type S3BucketName = String
  type S3ObjectUrl = String
  type SampleWeight = Double
  type SampledHTTPRequests = js.Array[SampledHTTPRequest]
  type Size = Double
  type SizeConstraintSetSummaries = js.Array[SizeConstraintSetSummary]
  type SizeConstraintSetUpdates = js.Array[SizeConstraintSetUpdate]
  type SizeConstraints = js.Array[SizeConstraint]
  type SqlInjectionMatchSetSummaries = js.Array[SqlInjectionMatchSetSummary]
  type SqlInjectionMatchSetUpdates = js.Array[SqlInjectionMatchSetUpdate]
  type SqlInjectionMatchTuples = js.Array[SqlInjectionMatchTuple]
  type SubscribedRuleGroupSummaries = js.Array[SubscribedRuleGroupSummary]
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagList = js.Array[Tag]
  type TagValue = String
  type Timestamp = js.Date
  type URIString = String
  type WebACLSummaries = js.Array[WebACLSummary]
  type WebACLUpdates = js.Array[WebACLUpdate]
  type XssMatchSetSummaries = js.Array[XssMatchSetSummary]
  type XssMatchSetUpdates = js.Array[XssMatchSetUpdate]
  type XssMatchTuples = js.Array[XssMatchTuple]

  implicit final class WAFOps(private val service: WAF) extends AnyVal {

    @inline def createByteMatchSetFuture(params: CreateByteMatchSetRequest): Future[CreateByteMatchSetResponse] = service.createByteMatchSet(params).promise().toFuture
    @inline def createGeoMatchSetFuture(params: CreateGeoMatchSetRequest): Future[CreateGeoMatchSetResponse] = service.createGeoMatchSet(params).promise().toFuture
    @inline def createIPSetFuture(params: CreateIPSetRequest): Future[CreateIPSetResponse] = service.createIPSet(params).promise().toFuture
    @inline def createRateBasedRuleFuture(params: CreateRateBasedRuleRequest): Future[CreateRateBasedRuleResponse] = service.createRateBasedRule(params).promise().toFuture
    @inline def createRegexMatchSetFuture(params: CreateRegexMatchSetRequest): Future[CreateRegexMatchSetResponse] = service.createRegexMatchSet(params).promise().toFuture
    @inline def createRegexPatternSetFuture(params: CreateRegexPatternSetRequest): Future[CreateRegexPatternSetResponse] = service.createRegexPatternSet(params).promise().toFuture
    @inline def createRuleFuture(params: CreateRuleRequest): Future[CreateRuleResponse] = service.createRule(params).promise().toFuture
    @inline def createRuleGroupFuture(params: CreateRuleGroupRequest): Future[CreateRuleGroupResponse] = service.createRuleGroup(params).promise().toFuture
    @inline def createSizeConstraintSetFuture(params: CreateSizeConstraintSetRequest): Future[CreateSizeConstraintSetResponse] = service.createSizeConstraintSet(params).promise().toFuture
    @inline def createSqlInjectionMatchSetFuture(params: CreateSqlInjectionMatchSetRequest): Future[CreateSqlInjectionMatchSetResponse] = service.createSqlInjectionMatchSet(params).promise().toFuture
    @inline def createWebACLFuture(params: CreateWebACLRequest): Future[CreateWebACLResponse] = service.createWebACL(params).promise().toFuture
    @inline def createWebACLMigrationStackFuture(params: CreateWebACLMigrationStackRequest): Future[CreateWebACLMigrationStackResponse] = service.createWebACLMigrationStack(params).promise().toFuture
    @inline def createXssMatchSetFuture(params: CreateXssMatchSetRequest): Future[CreateXssMatchSetResponse] = service.createXssMatchSet(params).promise().toFuture
    @inline def deleteByteMatchSetFuture(params: DeleteByteMatchSetRequest): Future[DeleteByteMatchSetResponse] = service.deleteByteMatchSet(params).promise().toFuture
    @inline def deleteGeoMatchSetFuture(params: DeleteGeoMatchSetRequest): Future[DeleteGeoMatchSetResponse] = service.deleteGeoMatchSet(params).promise().toFuture
    @inline def deleteIPSetFuture(params: DeleteIPSetRequest): Future[DeleteIPSetResponse] = service.deleteIPSet(params).promise().toFuture
    @inline def deleteLoggingConfigurationFuture(params: DeleteLoggingConfigurationRequest): Future[DeleteLoggingConfigurationResponse] = service.deleteLoggingConfiguration(params).promise().toFuture
    @inline def deletePermissionPolicyFuture(params: DeletePermissionPolicyRequest): Future[DeletePermissionPolicyResponse] = service.deletePermissionPolicy(params).promise().toFuture
    @inline def deleteRateBasedRuleFuture(params: DeleteRateBasedRuleRequest): Future[DeleteRateBasedRuleResponse] = service.deleteRateBasedRule(params).promise().toFuture
    @inline def deleteRegexMatchSetFuture(params: DeleteRegexMatchSetRequest): Future[DeleteRegexMatchSetResponse] = service.deleteRegexMatchSet(params).promise().toFuture
    @inline def deleteRegexPatternSetFuture(params: DeleteRegexPatternSetRequest): Future[DeleteRegexPatternSetResponse] = service.deleteRegexPatternSet(params).promise().toFuture
    @inline def deleteRuleFuture(params: DeleteRuleRequest): Future[DeleteRuleResponse] = service.deleteRule(params).promise().toFuture
    @inline def deleteRuleGroupFuture(params: DeleteRuleGroupRequest): Future[DeleteRuleGroupResponse] = service.deleteRuleGroup(params).promise().toFuture
    @inline def deleteSizeConstraintSetFuture(params: DeleteSizeConstraintSetRequest): Future[DeleteSizeConstraintSetResponse] = service.deleteSizeConstraintSet(params).promise().toFuture
    @inline def deleteSqlInjectionMatchSetFuture(params: DeleteSqlInjectionMatchSetRequest): Future[DeleteSqlInjectionMatchSetResponse] = service.deleteSqlInjectionMatchSet(params).promise().toFuture
    @inline def deleteWebACLFuture(params: DeleteWebACLRequest): Future[DeleteWebACLResponse] = service.deleteWebACL(params).promise().toFuture
    @inline def deleteXssMatchSetFuture(params: DeleteXssMatchSetRequest): Future[DeleteXssMatchSetResponse] = service.deleteXssMatchSet(params).promise().toFuture
    @inline def getByteMatchSetFuture(params: GetByteMatchSetRequest): Future[GetByteMatchSetResponse] = service.getByteMatchSet(params).promise().toFuture
    @inline def getChangeTokenFuture(params: GetChangeTokenRequest): Future[GetChangeTokenResponse] = service.getChangeToken(params).promise().toFuture
    @inline def getChangeTokenStatusFuture(params: GetChangeTokenStatusRequest): Future[GetChangeTokenStatusResponse] = service.getChangeTokenStatus(params).promise().toFuture
    @inline def getGeoMatchSetFuture(params: GetGeoMatchSetRequest): Future[GetGeoMatchSetResponse] = service.getGeoMatchSet(params).promise().toFuture
    @inline def getIPSetFuture(params: GetIPSetRequest): Future[GetIPSetResponse] = service.getIPSet(params).promise().toFuture
    @inline def getLoggingConfigurationFuture(params: GetLoggingConfigurationRequest): Future[GetLoggingConfigurationResponse] = service.getLoggingConfiguration(params).promise().toFuture
    @inline def getPermissionPolicyFuture(params: GetPermissionPolicyRequest): Future[GetPermissionPolicyResponse] = service.getPermissionPolicy(params).promise().toFuture
    @inline def getRateBasedRuleFuture(params: GetRateBasedRuleRequest): Future[GetRateBasedRuleResponse] = service.getRateBasedRule(params).promise().toFuture
    @inline def getRateBasedRuleManagedKeysFuture(params: GetRateBasedRuleManagedKeysRequest): Future[GetRateBasedRuleManagedKeysResponse] = service.getRateBasedRuleManagedKeys(params).promise().toFuture
    @inline def getRegexMatchSetFuture(params: GetRegexMatchSetRequest): Future[GetRegexMatchSetResponse] = service.getRegexMatchSet(params).promise().toFuture
    @inline def getRegexPatternSetFuture(params: GetRegexPatternSetRequest): Future[GetRegexPatternSetResponse] = service.getRegexPatternSet(params).promise().toFuture
    @inline def getRuleFuture(params: GetRuleRequest): Future[GetRuleResponse] = service.getRule(params).promise().toFuture
    @inline def getRuleGroupFuture(params: GetRuleGroupRequest): Future[GetRuleGroupResponse] = service.getRuleGroup(params).promise().toFuture
    @inline def getSampledRequestsFuture(params: GetSampledRequestsRequest): Future[GetSampledRequestsResponse] = service.getSampledRequests(params).promise().toFuture
    @inline def getSizeConstraintSetFuture(params: GetSizeConstraintSetRequest): Future[GetSizeConstraintSetResponse] = service.getSizeConstraintSet(params).promise().toFuture
    @inline def getSqlInjectionMatchSetFuture(params: GetSqlInjectionMatchSetRequest): Future[GetSqlInjectionMatchSetResponse] = service.getSqlInjectionMatchSet(params).promise().toFuture
    @inline def getWebACLFuture(params: GetWebACLRequest): Future[GetWebACLResponse] = service.getWebACL(params).promise().toFuture
    @inline def getXssMatchSetFuture(params: GetXssMatchSetRequest): Future[GetXssMatchSetResponse] = service.getXssMatchSet(params).promise().toFuture
    @inline def listActivatedRulesInRuleGroupFuture(params: ListActivatedRulesInRuleGroupRequest): Future[ListActivatedRulesInRuleGroupResponse] = service.listActivatedRulesInRuleGroup(params).promise().toFuture
    @inline def listByteMatchSetsFuture(params: ListByteMatchSetsRequest): Future[ListByteMatchSetsResponse] = service.listByteMatchSets(params).promise().toFuture
    @inline def listGeoMatchSetsFuture(params: ListGeoMatchSetsRequest): Future[ListGeoMatchSetsResponse] = service.listGeoMatchSets(params).promise().toFuture
    @inline def listIPSetsFuture(params: ListIPSetsRequest): Future[ListIPSetsResponse] = service.listIPSets(params).promise().toFuture
    @inline def listLoggingConfigurationsFuture(params: ListLoggingConfigurationsRequest): Future[ListLoggingConfigurationsResponse] = service.listLoggingConfigurations(params).promise().toFuture
    @inline def listRateBasedRulesFuture(params: ListRateBasedRulesRequest): Future[ListRateBasedRulesResponse] = service.listRateBasedRules(params).promise().toFuture
    @inline def listRegexMatchSetsFuture(params: ListRegexMatchSetsRequest): Future[ListRegexMatchSetsResponse] = service.listRegexMatchSets(params).promise().toFuture
    @inline def listRegexPatternSetsFuture(params: ListRegexPatternSetsRequest): Future[ListRegexPatternSetsResponse] = service.listRegexPatternSets(params).promise().toFuture
    @inline def listRuleGroupsFuture(params: ListRuleGroupsRequest): Future[ListRuleGroupsResponse] = service.listRuleGroups(params).promise().toFuture
    @inline def listRulesFuture(params: ListRulesRequest): Future[ListRulesResponse] = service.listRules(params).promise().toFuture
    @inline def listSizeConstraintSetsFuture(params: ListSizeConstraintSetsRequest): Future[ListSizeConstraintSetsResponse] = service.listSizeConstraintSets(params).promise().toFuture
    @inline def listSqlInjectionMatchSetsFuture(params: ListSqlInjectionMatchSetsRequest): Future[ListSqlInjectionMatchSetsResponse] = service.listSqlInjectionMatchSets(params).promise().toFuture
    @inline def listSubscribedRuleGroupsFuture(params: ListSubscribedRuleGroupsRequest): Future[ListSubscribedRuleGroupsResponse] = service.listSubscribedRuleGroups(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] = service.listTagsForResource(params).promise().toFuture
    @inline def listWebACLsFuture(params: ListWebACLsRequest): Future[ListWebACLsResponse] = service.listWebACLs(params).promise().toFuture
    @inline def listXssMatchSetsFuture(params: ListXssMatchSetsRequest): Future[ListXssMatchSetsResponse] = service.listXssMatchSets(params).promise().toFuture
    @inline def putLoggingConfigurationFuture(params: PutLoggingConfigurationRequest): Future[PutLoggingConfigurationResponse] = service.putLoggingConfiguration(params).promise().toFuture
    @inline def putPermissionPolicyFuture(params: PutPermissionPolicyRequest): Future[PutPermissionPolicyResponse] = service.putPermissionPolicy(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] = service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] = service.untagResource(params).promise().toFuture
    @inline def updateByteMatchSetFuture(params: UpdateByteMatchSetRequest): Future[UpdateByteMatchSetResponse] = service.updateByteMatchSet(params).promise().toFuture
    @inline def updateGeoMatchSetFuture(params: UpdateGeoMatchSetRequest): Future[UpdateGeoMatchSetResponse] = service.updateGeoMatchSet(params).promise().toFuture
    @inline def updateIPSetFuture(params: UpdateIPSetRequest): Future[UpdateIPSetResponse] = service.updateIPSet(params).promise().toFuture
    @inline def updateRateBasedRuleFuture(params: UpdateRateBasedRuleRequest): Future[UpdateRateBasedRuleResponse] = service.updateRateBasedRule(params).promise().toFuture
    @inline def updateRegexMatchSetFuture(params: UpdateRegexMatchSetRequest): Future[UpdateRegexMatchSetResponse] = service.updateRegexMatchSet(params).promise().toFuture
    @inline def updateRegexPatternSetFuture(params: UpdateRegexPatternSetRequest): Future[UpdateRegexPatternSetResponse] = service.updateRegexPatternSet(params).promise().toFuture
    @inline def updateRuleFuture(params: UpdateRuleRequest): Future[UpdateRuleResponse] = service.updateRule(params).promise().toFuture
    @inline def updateRuleGroupFuture(params: UpdateRuleGroupRequest): Future[UpdateRuleGroupResponse] = service.updateRuleGroup(params).promise().toFuture
    @inline def updateSizeConstraintSetFuture(params: UpdateSizeConstraintSetRequest): Future[UpdateSizeConstraintSetResponse] = service.updateSizeConstraintSet(params).promise().toFuture
    @inline def updateSqlInjectionMatchSetFuture(params: UpdateSqlInjectionMatchSetRequest): Future[UpdateSqlInjectionMatchSetResponse] = service.updateSqlInjectionMatchSet(params).promise().toFuture
    @inline def updateWebACLFuture(params: UpdateWebACLRequest): Future[UpdateWebACLResponse] = service.updateWebACL(params).promise().toFuture
    @inline def updateXssMatchSetFuture(params: UpdateXssMatchSetRequest): Future[UpdateXssMatchSetResponse] = service.updateXssMatchSet(params).promise().toFuture

  }
}

package waf {
  @js.native
  @JSImport("aws-sdk/clients/waf", JSImport.Namespace, "AWS.WAF")
  class WAF() extends js.Object {
    def this(config: AWSConfig) = this()

    def createByteMatchSet(params: CreateByteMatchSetRequest): Request[CreateByteMatchSetResponse] = js.native
    def createGeoMatchSet(params: CreateGeoMatchSetRequest): Request[CreateGeoMatchSetResponse] = js.native
    def createIPSet(params: CreateIPSetRequest): Request[CreateIPSetResponse] = js.native
    def createRateBasedRule(params: CreateRateBasedRuleRequest): Request[CreateRateBasedRuleResponse] = js.native
    def createRegexMatchSet(params: CreateRegexMatchSetRequest): Request[CreateRegexMatchSetResponse] = js.native
    def createRegexPatternSet(params: CreateRegexPatternSetRequest): Request[CreateRegexPatternSetResponse] = js.native
    def createRule(params: CreateRuleRequest): Request[CreateRuleResponse] = js.native
    def createRuleGroup(params: CreateRuleGroupRequest): Request[CreateRuleGroupResponse] = js.native
    def createSizeConstraintSet(params: CreateSizeConstraintSetRequest): Request[CreateSizeConstraintSetResponse] = js.native
    def createSqlInjectionMatchSet(params: CreateSqlInjectionMatchSetRequest): Request[CreateSqlInjectionMatchSetResponse] = js.native
    def createWebACL(params: CreateWebACLRequest): Request[CreateWebACLResponse] = js.native
    def createWebACLMigrationStack(params: CreateWebACLMigrationStackRequest): Request[CreateWebACLMigrationStackResponse] = js.native
    def createXssMatchSet(params: CreateXssMatchSetRequest): Request[CreateXssMatchSetResponse] = js.native
    def deleteByteMatchSet(params: DeleteByteMatchSetRequest): Request[DeleteByteMatchSetResponse] = js.native
    def deleteGeoMatchSet(params: DeleteGeoMatchSetRequest): Request[DeleteGeoMatchSetResponse] = js.native
    def deleteIPSet(params: DeleteIPSetRequest): Request[DeleteIPSetResponse] = js.native
    def deleteLoggingConfiguration(params: DeleteLoggingConfigurationRequest): Request[DeleteLoggingConfigurationResponse] = js.native
    def deletePermissionPolicy(params: DeletePermissionPolicyRequest): Request[DeletePermissionPolicyResponse] = js.native
    def deleteRateBasedRule(params: DeleteRateBasedRuleRequest): Request[DeleteRateBasedRuleResponse] = js.native
    def deleteRegexMatchSet(params: DeleteRegexMatchSetRequest): Request[DeleteRegexMatchSetResponse] = js.native
    def deleteRegexPatternSet(params: DeleteRegexPatternSetRequest): Request[DeleteRegexPatternSetResponse] = js.native
    def deleteRule(params: DeleteRuleRequest): Request[DeleteRuleResponse] = js.native
    def deleteRuleGroup(params: DeleteRuleGroupRequest): Request[DeleteRuleGroupResponse] = js.native
    def deleteSizeConstraintSet(params: DeleteSizeConstraintSetRequest): Request[DeleteSizeConstraintSetResponse] = js.native
    def deleteSqlInjectionMatchSet(params: DeleteSqlInjectionMatchSetRequest): Request[DeleteSqlInjectionMatchSetResponse] = js.native
    def deleteWebACL(params: DeleteWebACLRequest): Request[DeleteWebACLResponse] = js.native
    def deleteXssMatchSet(params: DeleteXssMatchSetRequest): Request[DeleteXssMatchSetResponse] = js.native
    def getByteMatchSet(params: GetByteMatchSetRequest): Request[GetByteMatchSetResponse] = js.native
    def getChangeToken(params: GetChangeTokenRequest): Request[GetChangeTokenResponse] = js.native
    def getChangeTokenStatus(params: GetChangeTokenStatusRequest): Request[GetChangeTokenStatusResponse] = js.native
    def getGeoMatchSet(params: GetGeoMatchSetRequest): Request[GetGeoMatchSetResponse] = js.native
    def getIPSet(params: GetIPSetRequest): Request[GetIPSetResponse] = js.native
    def getLoggingConfiguration(params: GetLoggingConfigurationRequest): Request[GetLoggingConfigurationResponse] = js.native
    def getPermissionPolicy(params: GetPermissionPolicyRequest): Request[GetPermissionPolicyResponse] = js.native
    def getRateBasedRule(params: GetRateBasedRuleRequest): Request[GetRateBasedRuleResponse] = js.native
    def getRateBasedRuleManagedKeys(params: GetRateBasedRuleManagedKeysRequest): Request[GetRateBasedRuleManagedKeysResponse] = js.native
    def getRegexMatchSet(params: GetRegexMatchSetRequest): Request[GetRegexMatchSetResponse] = js.native
    def getRegexPatternSet(params: GetRegexPatternSetRequest): Request[GetRegexPatternSetResponse] = js.native
    def getRule(params: GetRuleRequest): Request[GetRuleResponse] = js.native
    def getRuleGroup(params: GetRuleGroupRequest): Request[GetRuleGroupResponse] = js.native
    def getSampledRequests(params: GetSampledRequestsRequest): Request[GetSampledRequestsResponse] = js.native
    def getSizeConstraintSet(params: GetSizeConstraintSetRequest): Request[GetSizeConstraintSetResponse] = js.native
    def getSqlInjectionMatchSet(params: GetSqlInjectionMatchSetRequest): Request[GetSqlInjectionMatchSetResponse] = js.native
    def getWebACL(params: GetWebACLRequest): Request[GetWebACLResponse] = js.native
    def getXssMatchSet(params: GetXssMatchSetRequest): Request[GetXssMatchSetResponse] = js.native
    def listActivatedRulesInRuleGroup(params: ListActivatedRulesInRuleGroupRequest): Request[ListActivatedRulesInRuleGroupResponse] = js.native
    def listByteMatchSets(params: ListByteMatchSetsRequest): Request[ListByteMatchSetsResponse] = js.native
    def listGeoMatchSets(params: ListGeoMatchSetsRequest): Request[ListGeoMatchSetsResponse] = js.native
    def listIPSets(params: ListIPSetsRequest): Request[ListIPSetsResponse] = js.native
    def listLoggingConfigurations(params: ListLoggingConfigurationsRequest): Request[ListLoggingConfigurationsResponse] = js.native
    def listRateBasedRules(params: ListRateBasedRulesRequest): Request[ListRateBasedRulesResponse] = js.native
    def listRegexMatchSets(params: ListRegexMatchSetsRequest): Request[ListRegexMatchSetsResponse] = js.native
    def listRegexPatternSets(params: ListRegexPatternSetsRequest): Request[ListRegexPatternSetsResponse] = js.native
    def listRuleGroups(params: ListRuleGroupsRequest): Request[ListRuleGroupsResponse] = js.native
    def listRules(params: ListRulesRequest): Request[ListRulesResponse] = js.native
    def listSizeConstraintSets(params: ListSizeConstraintSetsRequest): Request[ListSizeConstraintSetsResponse] = js.native
    def listSqlInjectionMatchSets(params: ListSqlInjectionMatchSetsRequest): Request[ListSqlInjectionMatchSetsResponse] = js.native
    def listSubscribedRuleGroups(params: ListSubscribedRuleGroupsRequest): Request[ListSubscribedRuleGroupsResponse] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def listWebACLs(params: ListWebACLsRequest): Request[ListWebACLsResponse] = js.native
    def listXssMatchSets(params: ListXssMatchSetsRequest): Request[ListXssMatchSetsResponse] = js.native
    def putLoggingConfiguration(params: PutLoggingConfigurationRequest): Request[PutLoggingConfigurationResponse] = js.native
    def putPermissionPolicy(params: PutPermissionPolicyRequest): Request[PutPermissionPolicyResponse] = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse] = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse] = js.native
    def updateByteMatchSet(params: UpdateByteMatchSetRequest): Request[UpdateByteMatchSetResponse] = js.native
    def updateGeoMatchSet(params: UpdateGeoMatchSetRequest): Request[UpdateGeoMatchSetResponse] = js.native
    def updateIPSet(params: UpdateIPSetRequest): Request[UpdateIPSetResponse] = js.native
    def updateRateBasedRule(params: UpdateRateBasedRuleRequest): Request[UpdateRateBasedRuleResponse] = js.native
    def updateRegexMatchSet(params: UpdateRegexMatchSetRequest): Request[UpdateRegexMatchSetResponse] = js.native
    def updateRegexPatternSet(params: UpdateRegexPatternSetRequest): Request[UpdateRegexPatternSetResponse] = js.native
    def updateRule(params: UpdateRuleRequest): Request[UpdateRuleResponse] = js.native
    def updateRuleGroup(params: UpdateRuleGroupRequest): Request[UpdateRuleGroupResponse] = js.native
    def updateSizeConstraintSet(params: UpdateSizeConstraintSetRequest): Request[UpdateSizeConstraintSetResponse] = js.native
    def updateSqlInjectionMatchSet(params: UpdateSqlInjectionMatchSetRequest): Request[UpdateSqlInjectionMatchSetResponse] = js.native
    def updateWebACL(params: UpdateWebACLRequest): Request[UpdateWebACLResponse] = js.native
    def updateXssMatchSet(params: UpdateXssMatchSetRequest): Request[UpdateXssMatchSetResponse] = js.native
  }

  /** '''Note:'''This is ```AWS WAF Classic``` documentation. For more information, see [[https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html|AWS WAF Classic]] in the developer guide.
    *  ```For the latest version of AWS WAF```, use the AWS WAFV2 API and see the [[https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html|AWS WAF Developer Guide]]. With the latest version, AWS WAF has a single set of endpoints for regional and global use.
    * The <code>ActivatedRule</code> object in an <a>UpdateWebACL</a> request specifies a <code>Rule</code> that you want to insert or delete, the priority of the <code>Rule</code> in the <code>WebACL</code>, and the action that you want AWS WAF to take when a web request matches the <code>Rule</code> (<code>ALLOW</code>, <code>BLOCK</code>, or <code>COUNT</code>).
    *  To specify whether to insert or delete a <code>Rule</code>, use the <code>Action</code> parameter in the <a>WebACLUpdate</a> data type.
    */
  @js.native
  trait ActivatedRule extends js.Object {
    var Priority: RulePriority
    var RuleId: ResourceId
    var Action: js.UndefOr[WafAction]
    var ExcludedRules: js.UndefOr[ExcludedRules]
    var OverrideAction: js.UndefOr[WafOverrideAction]
    var Type: js.UndefOr[WafRuleType]
  }

  object ActivatedRule {
    @inline
    def apply(
        Priority: RulePriority,
        RuleId: ResourceId,
        Action: js.UndefOr[WafAction] = js.undefined,
        ExcludedRules: js.UndefOr[ExcludedRules] = js.undefined,
        OverrideAction: js.UndefOr[WafOverrideAction] = js.undefined,
        Type: js.UndefOr[WafRuleType] = js.undefined
    ): ActivatedRule = {
      val __obj = js.Dynamic.literal(
        "Priority" -> Priority.asInstanceOf[js.Any],
        "RuleId" -> RuleId.asInstanceOf[js.Any]
      )

      Action.foreach(__v => __obj.updateDynamic("Action")(__v.asInstanceOf[js.Any]))
      ExcludedRules.foreach(__v => __obj.updateDynamic("ExcludedRules")(__v.asInstanceOf[js.Any]))
      OverrideAction.foreach(__v => __obj.updateDynamic("OverrideAction")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ActivatedRule]
    }
  }

  /** '''Note:'''This is ```AWS WAF Classic``` documentation. For more information, see [[https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html|AWS WAF Classic]] in the developer guide.
    *  ```For the latest version of AWS WAF```, use the AWS WAFV2 API and see the [[https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html|AWS WAF Developer Guide]]. With the latest version, AWS WAF has a single set of endpoints for regional and global use.
    * In a <a>GetByteMatchSet</a> request, <code>ByteMatchSet</code> is a complex type that contains the <code>ByteMatchSetId</code> and <code>Name</code> of a <code>ByteMatchSet</code>, and the values that you specified when you updated the <code>ByteMatchSet</code>.
    *  A complex type that contains <code>ByteMatchTuple</code> objects, which specify the parts of web requests that you want AWS WAF to inspect and the values that you want AWS WAF to search for. If a <code>ByteMatchSet</code> contains more than one <code>ByteMatchTuple</code> object, a request needs to match the settings in only one <code>ByteMatchTuple</code> to be considered a match.
    */
  @js.native
  trait ByteMatchSet extends js.Object {
    var ByteMatchSetId: ResourceId
    var ByteMatchTuples: ByteMatchTuples
    var Name: js.UndefOr[ResourceName]
  }

  object ByteMatchSet {
    @inline
    def apply(
        ByteMatchSetId: ResourceId,
        ByteMatchTuples: ByteMatchTuples,
        Name: js.UndefOr[ResourceName] = js.undefined
    ): ByteMatchSet = {
      val __obj = js.Dynamic.literal(
        "ByteMatchSetId" -> ByteMatchSetId.asInstanceOf[js.Any],
        "ByteMatchTuples" -> ByteMatchTuples.asInstanceOf[js.Any]
      )

      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ByteMatchSet]
    }
  }

  /** '''Note:'''This is ```AWS WAF Classic``` documentation. For more information, see [[https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html|AWS WAF Classic]] in the developer guide.
    *  ```For the latest version of AWS WAF```, use the AWS WAFV2 API and see the [[https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html|AWS WAF Developer Guide]]. With the latest version, AWS WAF has a single set of endpoints for regional and global use.
    * Returned by <a>ListByteMatchSets</a>. Each <code>ByteMatchSetSummary</code> object includes the <code>Name</code> and <code>ByteMatchSetId</code> for one <a>ByteMatchSet</a>.
    */
  @js.native
  trait ByteMatchSetSummary extends js.Object {
    var ByteMatchSetId: ResourceId
    var Name: ResourceName
  }

  object ByteMatchSetSummary {
    @inline
    def apply(
        ByteMatchSetId: ResourceId,
        Name: ResourceName
    ): ByteMatchSetSummary = {
      val __obj = js.Dynamic.literal(
        "ByteMatchSetId" -> ByteMatchSetId.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ByteMatchSetSummary]
    }
  }

  /** '''Note:'''This is ```AWS WAF Classic``` documentation. For more information, see [[https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html|AWS WAF Classic]] in the developer guide.
    *  ```For the latest version of AWS WAF```, use the AWS WAFV2 API and see the [[https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html|AWS WAF Developer Guide]]. With the latest version, AWS WAF has a single set of endpoints for regional and global use.
    * In an <a>UpdateByteMatchSet</a> request, <code>ByteMatchSetUpdate</code> specifies whether to insert or delete a <a>ByteMatchTuple</a> and includes the settings for the <code>ByteMatchTuple</code>.
    */
  @js.native
  trait ByteMatchSetUpdate extends js.Object {
    var Action: ChangeAction
    var ByteMatchTuple: ByteMatchTuple
  }

  object ByteMatchSetUpdate {
    @inline
    def apply(
        Action: ChangeAction,
        ByteMatchTuple: ByteMatchTuple
    ): ByteMatchSetUpdate = {
      val __obj = js.Dynamic.literal(
        "Action" -> Action.asInstanceOf[js.Any],
        "ByteMatchTuple" -> ByteMatchTuple.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ByteMatchSetUpdate]
    }
  }

  /** '''Note:'''This is ```AWS WAF Classic``` documentation. For more information, see [[https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html|AWS WAF Classic]] in the developer guide.
    *  ```For the latest version of AWS WAF```, use the AWS WAFV2 API and see the [[https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html|AWS WAF Developer Guide]]. With the latest version, AWS WAF has a single set of endpoints for regional and global use.
    * The bytes (typically a string that corresponds with ASCII characters) that you want AWS WAF to search for in web requests, the location in requests that you want AWS WAF to search, and other settings.
    */
  @js.native
  trait ByteMatchTuple extends js.Object {
    var FieldToMatch: FieldToMatch
    var PositionalConstraint: PositionalConstraint
    var TargetString: ByteMatchTargetString
    var TextTransformation: TextTransformation
  }

  object ByteMatchTuple {
    @inline
    def apply(
        FieldToMatch: FieldToMatch,
        PositionalConstraint: PositionalConstraint,
        TargetString: ByteMatchTargetString,
        TextTransformation: TextTransformation
    ): ByteMatchTuple = {
      val __obj = js.Dynamic.literal(
        "FieldToMatch" -> FieldToMatch.asInstanceOf[js.Any],
        "PositionalConstraint" -> PositionalConstraint.asInstanceOf[js.Any],
        "TargetString" -> TargetString.asInstanceOf[js.Any],
        "TextTransformation" -> TextTransformation.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ByteMatchTuple]
    }
  }

  @js.native
  sealed trait ChangeAction extends js.Any
  object ChangeAction {
    val INSERT = "INSERT".asInstanceOf[ChangeAction]
    val DELETE = "DELETE".asInstanceOf[ChangeAction]

    @inline def values = js.Array(INSERT, DELETE)
  }

  @js.native
  sealed trait ChangeTokenStatus extends js.Any
  object ChangeTokenStatus {
    val PROVISIONED = "PROVISIONED".asInstanceOf[ChangeTokenStatus]
    val PENDING = "PENDING".asInstanceOf[ChangeTokenStatus]
    val INSYNC = "INSYNC".asInstanceOf[ChangeTokenStatus]

    @inline def values = js.Array(PROVISIONED, PENDING, INSYNC)
  }

  @js.native
  sealed trait ComparisonOperator extends js.Any
  object ComparisonOperator {
    val EQ = "EQ".asInstanceOf[ComparisonOperator]
    val NE = "NE".asInstanceOf[ComparisonOperator]
    val LE = "LE".asInstanceOf[ComparisonOperator]
    val LT = "LT".asInstanceOf[ComparisonOperator]
    val GE = "GE".asInstanceOf[ComparisonOperator]
    val GT = "GT".asInstanceOf[ComparisonOperator]

    @inline def values = js.Array(EQ, NE, LE, LT, GE, GT)
  }

  @js.native
  trait CreateByteMatchSetRequest extends js.Object {
    var ChangeToken: ChangeToken
    var Name: ResourceName
  }

  object CreateByteMatchSetRequest {
    @inline
    def apply(
        ChangeToken: ChangeToken,
        Name: ResourceName
    ): CreateByteMatchSetRequest = {
      val __obj = js.Dynamic.literal(
        "ChangeToken" -> ChangeToken.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateByteMatchSetRequest]
    }
  }

  @js.native
  trait CreateByteMatchSetResponse extends js.Object {
    var ByteMatchSet: js.UndefOr[ByteMatchSet]
    var ChangeToken: js.UndefOr[ChangeToken]
  }

  object CreateByteMatchSetResponse {
    @inline
    def apply(
        ByteMatchSet: js.UndefOr[ByteMatchSet] = js.undefined,
        ChangeToken: js.UndefOr[ChangeToken] = js.undefined
    ): CreateByteMatchSetResponse = {
      val __obj = js.Dynamic.literal()
      ByteMatchSet.foreach(__v => __obj.updateDynamic("ByteMatchSet")(__v.asInstanceOf[js.Any]))
      ChangeToken.foreach(__v => __obj.updateDynamic("ChangeToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateByteMatchSetResponse]
    }
  }

  @js.native
  trait CreateGeoMatchSetRequest extends js.Object {
    var ChangeToken: ChangeToken
    var Name: ResourceName
  }

  object CreateGeoMatchSetRequest {
    @inline
    def apply(
        ChangeToken: ChangeToken,
        Name: ResourceName
    ): CreateGeoMatchSetRequest = {
      val __obj = js.Dynamic.literal(
        "ChangeToken" -> ChangeToken.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateGeoMatchSetRequest]
    }
  }

  @js.native
  trait CreateGeoMatchSetResponse extends js.Object {
    var ChangeToken: js.UndefOr[ChangeToken]
    var GeoMatchSet: js.UndefOr[GeoMatchSet]
  }

  object CreateGeoMatchSetResponse {
    @inline
    def apply(
        ChangeToken: js.UndefOr[ChangeToken] = js.undefined,
        GeoMatchSet: js.UndefOr[GeoMatchSet] = js.undefined
    ): CreateGeoMatchSetResponse = {
      val __obj = js.Dynamic.literal()
      ChangeToken.foreach(__v => __obj.updateDynamic("ChangeToken")(__v.asInstanceOf[js.Any]))
      GeoMatchSet.foreach(__v => __obj.updateDynamic("GeoMatchSet")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateGeoMatchSetResponse]
    }
  }

  @js.native
  trait CreateIPSetRequest extends js.Object {
    var ChangeToken: ChangeToken
    var Name: ResourceName
  }

  object CreateIPSetRequest {
    @inline
    def apply(
        ChangeToken: ChangeToken,
        Name: ResourceName
    ): CreateIPSetRequest = {
      val __obj = js.Dynamic.literal(
        "ChangeToken" -> ChangeToken.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateIPSetRequest]
    }
  }

  @js.native
  trait CreateIPSetResponse extends js.Object {
    var ChangeToken: js.UndefOr[ChangeToken]
    var IPSet: js.UndefOr[IPSet]
  }

  object CreateIPSetResponse {
    @inline
    def apply(
        ChangeToken: js.UndefOr[ChangeToken] = js.undefined,
        IPSet: js.UndefOr[IPSet] = js.undefined
    ): CreateIPSetResponse = {
      val __obj = js.Dynamic.literal()
      ChangeToken.foreach(__v => __obj.updateDynamic("ChangeToken")(__v.asInstanceOf[js.Any]))
      IPSet.foreach(__v => __obj.updateDynamic("IPSet")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateIPSetResponse]
    }
  }

  @js.native
  trait CreateRateBasedRuleRequest extends js.Object {
    var ChangeToken: ChangeToken
    var MetricName: MetricName
    var Name: ResourceName
    var RateKey: RateKey
    var RateLimit: RateLimit
    var Tags: js.UndefOr[TagList]
  }

  object CreateRateBasedRuleRequest {
    @inline
    def apply(
        ChangeToken: ChangeToken,
        MetricName: MetricName,
        Name: ResourceName,
        RateKey: RateKey,
        RateLimit: RateLimit,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateRateBasedRuleRequest = {
      val __obj = js.Dynamic.literal(
        "ChangeToken" -> ChangeToken.asInstanceOf[js.Any],
        "MetricName" -> MetricName.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
        "RateKey" -> RateKey.asInstanceOf[js.Any],
        "RateLimit" -> RateLimit.asInstanceOf[js.Any]
      )

      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateRateBasedRuleRequest]
    }
  }

  @js.native
  trait CreateRateBasedRuleResponse extends js.Object {
    var ChangeToken: js.UndefOr[ChangeToken]
    var Rule: js.UndefOr[RateBasedRule]
  }

  object CreateRateBasedRuleResponse {
    @inline
    def apply(
        ChangeToken: js.UndefOr[ChangeToken] = js.undefined,
        Rule: js.UndefOr[RateBasedRule] = js.undefined
    ): CreateRateBasedRuleResponse = {
      val __obj = js.Dynamic.literal()
      ChangeToken.foreach(__v => __obj.updateDynamic("ChangeToken")(__v.asInstanceOf[js.Any]))
      Rule.foreach(__v => __obj.updateDynamic("Rule")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateRateBasedRuleResponse]
    }
  }

  @js.native
  trait CreateRegexMatchSetRequest extends js.Object {
    var ChangeToken: ChangeToken
    var Name: ResourceName
  }

  object CreateRegexMatchSetRequest {
    @inline
    def apply(
        ChangeToken: ChangeToken,
        Name: ResourceName
    ): CreateRegexMatchSetRequest = {
      val __obj = js.Dynamic.literal(
        "ChangeToken" -> ChangeToken.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateRegexMatchSetRequest]
    }
  }

  @js.native
  trait CreateRegexMatchSetResponse extends js.Object {
    var ChangeToken: js.UndefOr[ChangeToken]
    var RegexMatchSet: js.UndefOr[RegexMatchSet]
  }

  object CreateRegexMatchSetResponse {
    @inline
    def apply(
        ChangeToken: js.UndefOr[ChangeToken] = js.undefined,
        RegexMatchSet: js.UndefOr[RegexMatchSet] = js.undefined
    ): CreateRegexMatchSetResponse = {
      val __obj = js.Dynamic.literal()
      ChangeToken.foreach(__v => __obj.updateDynamic("ChangeToken")(__v.asInstanceOf[js.Any]))
      RegexMatchSet.foreach(__v => __obj.updateDynamic("RegexMatchSet")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateRegexMatchSetResponse]
    }
  }

  @js.native
  trait CreateRegexPatternSetRequest extends js.Object {
    var ChangeToken: ChangeToken
    var Name: ResourceName
  }

  object CreateRegexPatternSetRequest {
    @inline
    def apply(
        ChangeToken: ChangeToken,
        Name: ResourceName
    ): CreateRegexPatternSetRequest = {
      val __obj = js.Dynamic.literal(
        "ChangeToken" -> ChangeToken.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateRegexPatternSetRequest]
    }
  }

  @js.native
  trait CreateRegexPatternSetResponse extends js.Object {
    var ChangeToken: js.UndefOr[ChangeToken]
    var RegexPatternSet: js.UndefOr[RegexPatternSet]
  }

  object CreateRegexPatternSetResponse {
    @inline
    def apply(
        ChangeToken: js.UndefOr[ChangeToken] = js.undefined,
        RegexPatternSet: js.UndefOr[RegexPatternSet] = js.undefined
    ): CreateRegexPatternSetResponse = {
      val __obj = js.Dynamic.literal()
      ChangeToken.foreach(__v => __obj.updateDynamic("ChangeToken")(__v.asInstanceOf[js.Any]))
      RegexPatternSet.foreach(__v => __obj.updateDynamic("RegexPatternSet")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateRegexPatternSetResponse]
    }
  }

  @js.native
  trait CreateRuleGroupRequest extends js.Object {
    var ChangeToken: ChangeToken
    var MetricName: MetricName
    var Name: ResourceName
    var Tags: js.UndefOr[TagList]
  }

  object CreateRuleGroupRequest {
    @inline
    def apply(
        ChangeToken: ChangeToken,
        MetricName: MetricName,
        Name: ResourceName,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateRuleGroupRequest = {
      val __obj = js.Dynamic.literal(
        "ChangeToken" -> ChangeToken.asInstanceOf[js.Any],
        "MetricName" -> MetricName.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]
      )

      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateRuleGroupRequest]
    }
  }

  @js.native
  trait CreateRuleGroupResponse extends js.Object {
    var ChangeToken: js.UndefOr[ChangeToken]
    var RuleGroup: js.UndefOr[RuleGroup]
  }

  object CreateRuleGroupResponse {
    @inline
    def apply(
        ChangeToken: js.UndefOr[ChangeToken] = js.undefined,
        RuleGroup: js.UndefOr[RuleGroup] = js.undefined
    ): CreateRuleGroupResponse = {
      val __obj = js.Dynamic.literal()
      ChangeToken.foreach(__v => __obj.updateDynamic("ChangeToken")(__v.asInstanceOf[js.Any]))
      RuleGroup.foreach(__v => __obj.updateDynamic("RuleGroup")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateRuleGroupResponse]
    }
  }

  @js.native
  trait CreateRuleRequest extends js.Object {
    var ChangeToken: ChangeToken
    var MetricName: MetricName
    var Name: ResourceName
    var Tags: js.UndefOr[TagList]
  }

  object CreateRuleRequest {
    @inline
    def apply(
        ChangeToken: ChangeToken,
        MetricName: MetricName,
        Name: ResourceName,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateRuleRequest = {
      val __obj = js.Dynamic.literal(
        "ChangeToken" -> ChangeToken.asInstanceOf[js.Any],
        "MetricName" -> MetricName.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]
      )

      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateRuleRequest]
    }
  }

  @js.native
  trait CreateRuleResponse extends js.Object {
    var ChangeToken: js.UndefOr[ChangeToken]
    var Rule: js.UndefOr[Rule]
  }

  object CreateRuleResponse {
    @inline
    def apply(
        ChangeToken: js.UndefOr[ChangeToken] = js.undefined,
        Rule: js.UndefOr[Rule] = js.undefined
    ): CreateRuleResponse = {
      val __obj = js.Dynamic.literal()
      ChangeToken.foreach(__v => __obj.updateDynamic("ChangeToken")(__v.asInstanceOf[js.Any]))
      Rule.foreach(__v => __obj.updateDynamic("Rule")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateRuleResponse]
    }
  }

  @js.native
  trait CreateSizeConstraintSetRequest extends js.Object {
    var ChangeToken: ChangeToken
    var Name: ResourceName
  }

  object CreateSizeConstraintSetRequest {
    @inline
    def apply(
        ChangeToken: ChangeToken,
        Name: ResourceName
    ): CreateSizeConstraintSetRequest = {
      val __obj = js.Dynamic.literal(
        "ChangeToken" -> ChangeToken.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateSizeConstraintSetRequest]
    }
  }

  @js.native
  trait CreateSizeConstraintSetResponse extends js.Object {
    var ChangeToken: js.UndefOr[ChangeToken]
    var SizeConstraintSet: js.UndefOr[SizeConstraintSet]
  }

  object CreateSizeConstraintSetResponse {
    @inline
    def apply(
        ChangeToken: js.UndefOr[ChangeToken] = js.undefined,
        SizeConstraintSet: js.UndefOr[SizeConstraintSet] = js.undefined
    ): CreateSizeConstraintSetResponse = {
      val __obj = js.Dynamic.literal()
      ChangeToken.foreach(__v => __obj.updateDynamic("ChangeToken")(__v.asInstanceOf[js.Any]))
      SizeConstraintSet.foreach(__v => __obj.updateDynamic("SizeConstraintSet")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateSizeConstraintSetResponse]
    }
  }

  /** A request to create a <a>SqlInjectionMatchSet</a>.
    */
  @js.native
  trait CreateSqlInjectionMatchSetRequest extends js.Object {
    var ChangeToken: ChangeToken
    var Name: ResourceName
  }

  object CreateSqlInjectionMatchSetRequest {
    @inline
    def apply(
        ChangeToken: ChangeToken,
        Name: ResourceName
    ): CreateSqlInjectionMatchSetRequest = {
      val __obj = js.Dynamic.literal(
        "ChangeToken" -> ChangeToken.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateSqlInjectionMatchSetRequest]
    }
  }

  /** The response to a <code>CreateSqlInjectionMatchSet</code> request.
    */
  @js.native
  trait CreateSqlInjectionMatchSetResponse extends js.Object {
    var ChangeToken: js.UndefOr[ChangeToken]
    var SqlInjectionMatchSet: js.UndefOr[SqlInjectionMatchSet]
  }

  object CreateSqlInjectionMatchSetResponse {
    @inline
    def apply(
        ChangeToken: js.UndefOr[ChangeToken] = js.undefined,
        SqlInjectionMatchSet: js.UndefOr[SqlInjectionMatchSet] = js.undefined
    ): CreateSqlInjectionMatchSetResponse = {
      val __obj = js.Dynamic.literal()
      ChangeToken.foreach(__v => __obj.updateDynamic("ChangeToken")(__v.asInstanceOf[js.Any]))
      SqlInjectionMatchSet.foreach(__v => __obj.updateDynamic("SqlInjectionMatchSet")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateSqlInjectionMatchSetResponse]
    }
  }

  @js.native
  trait CreateWebACLMigrationStackRequest extends js.Object {
    var IgnoreUnsupportedType: IgnoreUnsupportedType
    var S3BucketName: S3BucketName
    var WebACLId: ResourceId
  }

  object CreateWebACLMigrationStackRequest {
    @inline
    def apply(
        IgnoreUnsupportedType: IgnoreUnsupportedType,
        S3BucketName: S3BucketName,
        WebACLId: ResourceId
    ): CreateWebACLMigrationStackRequest = {
      val __obj = js.Dynamic.literal(
        "IgnoreUnsupportedType" -> IgnoreUnsupportedType.asInstanceOf[js.Any],
        "S3BucketName" -> S3BucketName.asInstanceOf[js.Any],
        "WebACLId" -> WebACLId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateWebACLMigrationStackRequest]
    }
  }

  @js.native
  trait CreateWebACLMigrationStackResponse extends js.Object {
    var S3ObjectUrl: S3ObjectUrl
  }

  object CreateWebACLMigrationStackResponse {
    @inline
    def apply(
        S3ObjectUrl: S3ObjectUrl
    ): CreateWebACLMigrationStackResponse = {
      val __obj = js.Dynamic.literal(
        "S3ObjectUrl" -> S3ObjectUrl.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateWebACLMigrationStackResponse]
    }
  }

  @js.native
  trait CreateWebACLRequest extends js.Object {
    var ChangeToken: ChangeToken
    var DefaultAction: WafAction
    var MetricName: MetricName
    var Name: ResourceName
    var Tags: js.UndefOr[TagList]
  }

  object CreateWebACLRequest {
    @inline
    def apply(
        ChangeToken: ChangeToken,
        DefaultAction: WafAction,
        MetricName: MetricName,
        Name: ResourceName,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateWebACLRequest = {
      val __obj = js.Dynamic.literal(
        "ChangeToken" -> ChangeToken.asInstanceOf[js.Any],
        "DefaultAction" -> DefaultAction.asInstanceOf[js.Any],
        "MetricName" -> MetricName.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]
      )

      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateWebACLRequest]
    }
  }

  @js.native
  trait CreateWebACLResponse extends js.Object {
    var ChangeToken: js.UndefOr[ChangeToken]
    var WebACL: js.UndefOr[WebACL]
  }

  object CreateWebACLResponse {
    @inline
    def apply(
        ChangeToken: js.UndefOr[ChangeToken] = js.undefined,
        WebACL: js.UndefOr[WebACL] = js.undefined
    ): CreateWebACLResponse = {
      val __obj = js.Dynamic.literal()
      ChangeToken.foreach(__v => __obj.updateDynamic("ChangeToken")(__v.asInstanceOf[js.Any]))
      WebACL.foreach(__v => __obj.updateDynamic("WebACL")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateWebACLResponse]
    }
  }

  /** A request to create an <a>XssMatchSet</a>.
    */
  @js.native
  trait CreateXssMatchSetRequest extends js.Object {
    var ChangeToken: ChangeToken
    var Name: ResourceName
  }

  object CreateXssMatchSetRequest {
    @inline
    def apply(
        ChangeToken: ChangeToken,
        Name: ResourceName
    ): CreateXssMatchSetRequest = {
      val __obj = js.Dynamic.literal(
        "ChangeToken" -> ChangeToken.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateXssMatchSetRequest]
    }
  }

  /** The response to a <code>CreateXssMatchSet</code> request.
    */
  @js.native
  trait CreateXssMatchSetResponse extends js.Object {
    var ChangeToken: js.UndefOr[ChangeToken]
    var XssMatchSet: js.UndefOr[XssMatchSet]
  }

  object CreateXssMatchSetResponse {
    @inline
    def apply(
        ChangeToken: js.UndefOr[ChangeToken] = js.undefined,
        XssMatchSet: js.UndefOr[XssMatchSet] = js.undefined
    ): CreateXssMatchSetResponse = {
      val __obj = js.Dynamic.literal()
      ChangeToken.foreach(__v => __obj.updateDynamic("ChangeToken")(__v.asInstanceOf[js.Any]))
      XssMatchSet.foreach(__v => __obj.updateDynamic("XssMatchSet")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateXssMatchSetResponse]
    }
  }

  @js.native
  trait DeleteByteMatchSetRequest extends js.Object {
    var ByteMatchSetId: ResourceId
    var ChangeToken: ChangeToken
  }

  object DeleteByteMatchSetRequest {
    @inline
    def apply(
        ByteMatchSetId: ResourceId,
        ChangeToken: ChangeToken
    ): DeleteByteMatchSetRequest = {
      val __obj = js.Dynamic.literal(
        "ByteMatchSetId" -> ByteMatchSetId.asInstanceOf[js.Any],
        "ChangeToken" -> ChangeToken.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteByteMatchSetRequest]
    }
  }

  @js.native
  trait DeleteByteMatchSetResponse extends js.Object {
    var ChangeToken: js.UndefOr[ChangeToken]
  }

  object DeleteByteMatchSetResponse {
    @inline
    def apply(
        ChangeToken: js.UndefOr[ChangeToken] = js.undefined
    ): DeleteByteMatchSetResponse = {
      val __obj = js.Dynamic.literal()
      ChangeToken.foreach(__v => __obj.updateDynamic("ChangeToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteByteMatchSetResponse]
    }
  }

  @js.native
  trait DeleteGeoMatchSetRequest extends js.Object {
    var ChangeToken: ChangeToken
    var GeoMatchSetId: ResourceId
  }

  object DeleteGeoMatchSetRequest {
    @inline
    def apply(
        ChangeToken: ChangeToken,
        GeoMatchSetId: ResourceId
    ): DeleteGeoMatchSetRequest = {
      val __obj = js.Dynamic.literal(
        "ChangeToken" -> ChangeToken.asInstanceOf[js.Any],
        "GeoMatchSetId" -> GeoMatchSetId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteGeoMatchSetRequest]
    }
  }

  @js.native
  trait DeleteGeoMatchSetResponse extends js.Object {
    var ChangeToken: js.UndefOr[ChangeToken]
  }

  object DeleteGeoMatchSetResponse {
    @inline
    def apply(
        ChangeToken: js.UndefOr[ChangeToken] = js.undefined
    ): DeleteGeoMatchSetResponse = {
      val __obj = js.Dynamic.literal()
      ChangeToken.foreach(__v => __obj.updateDynamic("ChangeToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteGeoMatchSetResponse]
    }
  }

  @js.native
  trait DeleteIPSetRequest extends js.Object {
    var ChangeToken: ChangeToken
    var IPSetId: ResourceId
  }

  object DeleteIPSetRequest {
    @inline
    def apply(
        ChangeToken: ChangeToken,
        IPSetId: ResourceId
    ): DeleteIPSetRequest = {
      val __obj = js.Dynamic.literal(
        "ChangeToken" -> ChangeToken.asInstanceOf[js.Any],
        "IPSetId" -> IPSetId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteIPSetRequest]
    }
  }

  @js.native
  trait DeleteIPSetResponse extends js.Object {
    var ChangeToken: js.UndefOr[ChangeToken]
  }

  object DeleteIPSetResponse {
    @inline
    def apply(
        ChangeToken: js.UndefOr[ChangeToken] = js.undefined
    ): DeleteIPSetResponse = {
      val __obj = js.Dynamic.literal()
      ChangeToken.foreach(__v => __obj.updateDynamic("ChangeToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteIPSetResponse]
    }
  }

  @js.native
  trait DeleteLoggingConfigurationRequest extends js.Object {
    var ResourceArn: ResourceArn
  }

  object DeleteLoggingConfigurationRequest {
    @inline
    def apply(
        ResourceArn: ResourceArn
    ): DeleteLoggingConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteLoggingConfigurationRequest]
    }
  }

  @js.native
  trait DeleteLoggingConfigurationResponse extends js.Object {}

  object DeleteLoggingConfigurationResponse {
    @inline
    def apply(
    ): DeleteLoggingConfigurationResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteLoggingConfigurationResponse]
    }
  }

  @js.native
  trait DeletePermissionPolicyRequest extends js.Object {
    var ResourceArn: ResourceArn
  }

  object DeletePermissionPolicyRequest {
    @inline
    def apply(
        ResourceArn: ResourceArn
    ): DeletePermissionPolicyRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeletePermissionPolicyRequest]
    }
  }

  @js.native
  trait DeletePermissionPolicyResponse extends js.Object {}

  object DeletePermissionPolicyResponse {
    @inline
    def apply(
    ): DeletePermissionPolicyResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeletePermissionPolicyResponse]
    }
  }

  @js.native
  trait DeleteRateBasedRuleRequest extends js.Object {
    var ChangeToken: ChangeToken
    var RuleId: ResourceId
  }

  object DeleteRateBasedRuleRequest {
    @inline
    def apply(
        ChangeToken: ChangeToken,
        RuleId: ResourceId
    ): DeleteRateBasedRuleRequest = {
      val __obj = js.Dynamic.literal(
        "ChangeToken" -> ChangeToken.asInstanceOf[js.Any],
        "RuleId" -> RuleId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteRateBasedRuleRequest]
    }
  }

  @js.native
  trait DeleteRateBasedRuleResponse extends js.Object {
    var ChangeToken: js.UndefOr[ChangeToken]
  }

  object DeleteRateBasedRuleResponse {
    @inline
    def apply(
        ChangeToken: js.UndefOr[ChangeToken] = js.undefined
    ): DeleteRateBasedRuleResponse = {
      val __obj = js.Dynamic.literal()
      ChangeToken.foreach(__v => __obj.updateDynamic("ChangeToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteRateBasedRuleResponse]
    }
  }

  @js.native
  trait DeleteRegexMatchSetRequest extends js.Object {
    var ChangeToken: ChangeToken
    var RegexMatchSetId: ResourceId
  }

  object DeleteRegexMatchSetRequest {
    @inline
    def apply(
        ChangeToken: ChangeToken,
        RegexMatchSetId: ResourceId
    ): DeleteRegexMatchSetRequest = {
      val __obj = js.Dynamic.literal(
        "ChangeToken" -> ChangeToken.asInstanceOf[js.Any],
        "RegexMatchSetId" -> RegexMatchSetId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteRegexMatchSetRequest]
    }
  }

  @js.native
  trait DeleteRegexMatchSetResponse extends js.Object {
    var ChangeToken: js.UndefOr[ChangeToken]
  }

  object DeleteRegexMatchSetResponse {
    @inline
    def apply(
        ChangeToken: js.UndefOr[ChangeToken] = js.undefined
    ): DeleteRegexMatchSetResponse = {
      val __obj = js.Dynamic.literal()
      ChangeToken.foreach(__v => __obj.updateDynamic("ChangeToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteRegexMatchSetResponse]
    }
  }

  @js.native
  trait DeleteRegexPatternSetRequest extends js.Object {
    var ChangeToken: ChangeToken
    var RegexPatternSetId: ResourceId
  }

  object DeleteRegexPatternSetRequest {
    @inline
    def apply(
        ChangeToken: ChangeToken,
        RegexPatternSetId: ResourceId
    ): DeleteRegexPatternSetRequest = {
      val __obj = js.Dynamic.literal(
        "ChangeToken" -> ChangeToken.asInstanceOf[js.Any],
        "RegexPatternSetId" -> RegexPatternSetId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteRegexPatternSetRequest]
    }
  }

  @js.native
  trait DeleteRegexPatternSetResponse extends js.Object {
    var ChangeToken: js.UndefOr[ChangeToken]
  }

  object DeleteRegexPatternSetResponse {
    @inline
    def apply(
        ChangeToken: js.UndefOr[ChangeToken] = js.undefined
    ): DeleteRegexPatternSetResponse = {
      val __obj = js.Dynamic.literal()
      ChangeToken.foreach(__v => __obj.updateDynamic("ChangeToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteRegexPatternSetResponse]
    }
  }

  @js.native
  trait DeleteRuleGroupRequest extends js.Object {
    var ChangeToken: ChangeToken
    var RuleGroupId: ResourceId
  }

  object DeleteRuleGroupRequest {
    @inline
    def apply(
        ChangeToken: ChangeToken,
        RuleGroupId: ResourceId
    ): DeleteRuleGroupRequest = {
      val __obj = js.Dynamic.literal(
        "ChangeToken" -> ChangeToken.asInstanceOf[js.Any],
        "RuleGroupId" -> RuleGroupId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteRuleGroupRequest]
    }
  }

  @js.native
  trait DeleteRuleGroupResponse extends js.Object {
    var ChangeToken: js.UndefOr[ChangeToken]
  }

  object DeleteRuleGroupResponse {
    @inline
    def apply(
        ChangeToken: js.UndefOr[ChangeToken] = js.undefined
    ): DeleteRuleGroupResponse = {
      val __obj = js.Dynamic.literal()
      ChangeToken.foreach(__v => __obj.updateDynamic("ChangeToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteRuleGroupResponse]
    }
  }

  @js.native
  trait DeleteRuleRequest extends js.Object {
    var ChangeToken: ChangeToken
    var RuleId: ResourceId
  }

  object DeleteRuleRequest {
    @inline
    def apply(
        ChangeToken: ChangeToken,
        RuleId: ResourceId
    ): DeleteRuleRequest = {
      val __obj = js.Dynamic.literal(
        "ChangeToken" -> ChangeToken.asInstanceOf[js.Any],
        "RuleId" -> RuleId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteRuleRequest]
    }
  }

  @js.native
  trait DeleteRuleResponse extends js.Object {
    var ChangeToken: js.UndefOr[ChangeToken]
  }

  object DeleteRuleResponse {
    @inline
    def apply(
        ChangeToken: js.UndefOr[ChangeToken] = js.undefined
    ): DeleteRuleResponse = {
      val __obj = js.Dynamic.literal()
      ChangeToken.foreach(__v => __obj.updateDynamic("ChangeToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteRuleResponse]
    }
  }

  @js.native
  trait DeleteSizeConstraintSetRequest extends js.Object {
    var ChangeToken: ChangeToken
    var SizeConstraintSetId: ResourceId
  }

  object DeleteSizeConstraintSetRequest {
    @inline
    def apply(
        ChangeToken: ChangeToken,
        SizeConstraintSetId: ResourceId
    ): DeleteSizeConstraintSetRequest = {
      val __obj = js.Dynamic.literal(
        "ChangeToken" -> ChangeToken.asInstanceOf[js.Any],
        "SizeConstraintSetId" -> SizeConstraintSetId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteSizeConstraintSetRequest]
    }
  }

  @js.native
  trait DeleteSizeConstraintSetResponse extends js.Object {
    var ChangeToken: js.UndefOr[ChangeToken]
  }

  object DeleteSizeConstraintSetResponse {
    @inline
    def apply(
        ChangeToken: js.UndefOr[ChangeToken] = js.undefined
    ): DeleteSizeConstraintSetResponse = {
      val __obj = js.Dynamic.literal()
      ChangeToken.foreach(__v => __obj.updateDynamic("ChangeToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteSizeConstraintSetResponse]
    }
  }

  /** A request to delete a <a>SqlInjectionMatchSet</a> from AWS WAF.
    */
  @js.native
  trait DeleteSqlInjectionMatchSetRequest extends js.Object {
    var ChangeToken: ChangeToken
    var SqlInjectionMatchSetId: ResourceId
  }

  object DeleteSqlInjectionMatchSetRequest {
    @inline
    def apply(
        ChangeToken: ChangeToken,
        SqlInjectionMatchSetId: ResourceId
    ): DeleteSqlInjectionMatchSetRequest = {
      val __obj = js.Dynamic.literal(
        "ChangeToken" -> ChangeToken.asInstanceOf[js.Any],
        "SqlInjectionMatchSetId" -> SqlInjectionMatchSetId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteSqlInjectionMatchSetRequest]
    }
  }

  /** The response to a request to delete a <a>SqlInjectionMatchSet</a> from AWS WAF.
    */
  @js.native
  trait DeleteSqlInjectionMatchSetResponse extends js.Object {
    var ChangeToken: js.UndefOr[ChangeToken]
  }

  object DeleteSqlInjectionMatchSetResponse {
    @inline
    def apply(
        ChangeToken: js.UndefOr[ChangeToken] = js.undefined
    ): DeleteSqlInjectionMatchSetResponse = {
      val __obj = js.Dynamic.literal()
      ChangeToken.foreach(__v => __obj.updateDynamic("ChangeToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteSqlInjectionMatchSetResponse]
    }
  }

  @js.native
  trait DeleteWebACLRequest extends js.Object {
    var ChangeToken: ChangeToken
    var WebACLId: ResourceId
  }

  object DeleteWebACLRequest {
    @inline
    def apply(
        ChangeToken: ChangeToken,
        WebACLId: ResourceId
    ): DeleteWebACLRequest = {
      val __obj = js.Dynamic.literal(
        "ChangeToken" -> ChangeToken.asInstanceOf[js.Any],
        "WebACLId" -> WebACLId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteWebACLRequest]
    }
  }

  @js.native
  trait DeleteWebACLResponse extends js.Object {
    var ChangeToken: js.UndefOr[ChangeToken]
  }

  object DeleteWebACLResponse {
    @inline
    def apply(
        ChangeToken: js.UndefOr[ChangeToken] = js.undefined
    ): DeleteWebACLResponse = {
      val __obj = js.Dynamic.literal()
      ChangeToken.foreach(__v => __obj.updateDynamic("ChangeToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteWebACLResponse]
    }
  }

  /** A request to delete an <a>XssMatchSet</a> from AWS WAF.
    */
  @js.native
  trait DeleteXssMatchSetRequest extends js.Object {
    var ChangeToken: ChangeToken
    var XssMatchSetId: ResourceId
  }

  object DeleteXssMatchSetRequest {
    @inline
    def apply(
        ChangeToken: ChangeToken,
        XssMatchSetId: ResourceId
    ): DeleteXssMatchSetRequest = {
      val __obj = js.Dynamic.literal(
        "ChangeToken" -> ChangeToken.asInstanceOf[js.Any],
        "XssMatchSetId" -> XssMatchSetId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteXssMatchSetRequest]
    }
  }

  /** The response to a request to delete an <a>XssMatchSet</a> from AWS WAF.
    */
  @js.native
  trait DeleteXssMatchSetResponse extends js.Object {
    var ChangeToken: js.UndefOr[ChangeToken]
  }

  object DeleteXssMatchSetResponse {
    @inline
    def apply(
        ChangeToken: js.UndefOr[ChangeToken] = js.undefined
    ): DeleteXssMatchSetResponse = {
      val __obj = js.Dynamic.literal()
      ChangeToken.foreach(__v => __obj.updateDynamic("ChangeToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteXssMatchSetResponse]
    }
  }

  /** '''Note:'''This is ```AWS WAF Classic``` documentation. For more information, see [[https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html|AWS WAF Classic]] in the developer guide.
    *  ```For the latest version of AWS WAF```, use the AWS WAFV2 API and see the [[https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html|AWS WAF Developer Guide]]. With the latest version, AWS WAF has a single set of endpoints for regional and global use.
    * The rule to exclude from a rule group. This is applicable only when the <code>ActivatedRule</code> refers to a <code>RuleGroup</code>. The rule must belong to the <code>RuleGroup</code> that is specified by the <code>ActivatedRule</code>.
    */
  @js.native
  trait ExcludedRule extends js.Object {
    var RuleId: ResourceId
  }

  object ExcludedRule {
    @inline
    def apply(
        RuleId: ResourceId
    ): ExcludedRule = {
      val __obj = js.Dynamic.literal(
        "RuleId" -> RuleId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ExcludedRule]
    }
  }

  /** '''Note:'''This is ```AWS WAF Classic``` documentation. For more information, see [[https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html|AWS WAF Classic]] in the developer guide.
    *  ```For the latest version of AWS WAF```, use the AWS WAFV2 API and see the [[https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html|AWS WAF Developer Guide]]. With the latest version, AWS WAF has a single set of endpoints for regional and global use.
    * Specifies where in a web request to look for <code>TargetString</code>.
    */
  @js.native
  trait FieldToMatch extends js.Object {
    var Type: MatchFieldType
    var Data: js.UndefOr[MatchFieldData]
  }

  object FieldToMatch {
    @inline
    def apply(
        Type: MatchFieldType,
        Data: js.UndefOr[MatchFieldData] = js.undefined
    ): FieldToMatch = {
      val __obj = js.Dynamic.literal(
        "Type" -> Type.asInstanceOf[js.Any]
      )

      Data.foreach(__v => __obj.updateDynamic("Data")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FieldToMatch]
    }
  }

  /** '''Note:'''This is ```AWS WAF Classic``` documentation. For more information, see [[https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html|AWS WAF Classic]] in the developer guide.
    *  ```For the latest version of AWS WAF```, use the AWS WAFV2 API and see the [[https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html|AWS WAF Developer Guide]]. With the latest version, AWS WAF has a single set of endpoints for regional and global use.
    * The country from which web requests originate that you want AWS WAF to search for.
    */
  @js.native
  trait GeoMatchConstraint extends js.Object {
    var Type: GeoMatchConstraintType
    var Value: GeoMatchConstraintValue
  }

  object GeoMatchConstraint {
    @inline
    def apply(
        Type: GeoMatchConstraintType,
        Value: GeoMatchConstraintValue
    ): GeoMatchConstraint = {
      val __obj = js.Dynamic.literal(
        "Type" -> Type.asInstanceOf[js.Any],
        "Value" -> Value.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GeoMatchConstraint]
    }
  }

  @js.native
  sealed trait GeoMatchConstraintType extends js.Any
  object GeoMatchConstraintType {
    val Country = "Country".asInstanceOf[GeoMatchConstraintType]

    @inline def values = js.Array(Country)
  }

  @js.native
  sealed trait GeoMatchConstraintValue extends js.Any
  object GeoMatchConstraintValue {
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

    @inline def values = js.Array(
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
  }

  /** '''Note:'''This is ```AWS WAF Classic``` documentation. For more information, see [[https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html|AWS WAF Classic]] in the developer guide.
    *  ```For the latest version of AWS WAF```, use the AWS WAFV2 API and see the [[https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html|AWS WAF Developer Guide]]. With the latest version, AWS WAF has a single set of endpoints for regional and global use.
    * Contains one or more countries that AWS WAF will search for.
    */
  @js.native
  trait GeoMatchSet extends js.Object {
    var GeoMatchConstraints: GeoMatchConstraints
    var GeoMatchSetId: ResourceId
    var Name: js.UndefOr[ResourceName]
  }

  object GeoMatchSet {
    @inline
    def apply(
        GeoMatchConstraints: GeoMatchConstraints,
        GeoMatchSetId: ResourceId,
        Name: js.UndefOr[ResourceName] = js.undefined
    ): GeoMatchSet = {
      val __obj = js.Dynamic.literal(
        "GeoMatchConstraints" -> GeoMatchConstraints.asInstanceOf[js.Any],
        "GeoMatchSetId" -> GeoMatchSetId.asInstanceOf[js.Any]
      )

      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GeoMatchSet]
    }
  }

  /** '''Note:'''This is ```AWS WAF Classic``` documentation. For more information, see [[https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html|AWS WAF Classic]] in the developer guide.
    *  ```For the latest version of AWS WAF```, use the AWS WAFV2 API and see the [[https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html|AWS WAF Developer Guide]]. With the latest version, AWS WAF has a single set of endpoints for regional and global use.
    * Contains the identifier and the name of the <code>GeoMatchSet</code>.
    */
  @js.native
  trait GeoMatchSetSummary extends js.Object {
    var GeoMatchSetId: ResourceId
    var Name: ResourceName
  }

  object GeoMatchSetSummary {
    @inline
    def apply(
        GeoMatchSetId: ResourceId,
        Name: ResourceName
    ): GeoMatchSetSummary = {
      val __obj = js.Dynamic.literal(
        "GeoMatchSetId" -> GeoMatchSetId.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GeoMatchSetSummary]
    }
  }

  /** '''Note:'''This is ```AWS WAF Classic``` documentation. For more information, see [[https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html|AWS WAF Classic]] in the developer guide.
    *  ```For the latest version of AWS WAF```, use the AWS WAFV2 API and see the [[https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html|AWS WAF Developer Guide]]. With the latest version, AWS WAF has a single set of endpoints for regional and global use.
    * Specifies the type of update to perform to an <a>GeoMatchSet</a> with <a>UpdateGeoMatchSet</a>.
    */
  @js.native
  trait GeoMatchSetUpdate extends js.Object {
    var Action: ChangeAction
    var GeoMatchConstraint: GeoMatchConstraint
  }

  object GeoMatchSetUpdate {
    @inline
    def apply(
        Action: ChangeAction,
        GeoMatchConstraint: GeoMatchConstraint
    ): GeoMatchSetUpdate = {
      val __obj = js.Dynamic.literal(
        "Action" -> Action.asInstanceOf[js.Any],
        "GeoMatchConstraint" -> GeoMatchConstraint.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GeoMatchSetUpdate]
    }
  }

  @js.native
  trait GetByteMatchSetRequest extends js.Object {
    var ByteMatchSetId: ResourceId
  }

  object GetByteMatchSetRequest {
    @inline
    def apply(
        ByteMatchSetId: ResourceId
    ): GetByteMatchSetRequest = {
      val __obj = js.Dynamic.literal(
        "ByteMatchSetId" -> ByteMatchSetId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetByteMatchSetRequest]
    }
  }

  @js.native
  trait GetByteMatchSetResponse extends js.Object {
    var ByteMatchSet: js.UndefOr[ByteMatchSet]
  }

  object GetByteMatchSetResponse {
    @inline
    def apply(
        ByteMatchSet: js.UndefOr[ByteMatchSet] = js.undefined
    ): GetByteMatchSetResponse = {
      val __obj = js.Dynamic.literal()
      ByteMatchSet.foreach(__v => __obj.updateDynamic("ByteMatchSet")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetByteMatchSetResponse]
    }
  }

  @js.native
  trait GetChangeTokenRequest extends js.Object {}

  object GetChangeTokenRequest {
    @inline
    def apply(
    ): GetChangeTokenRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetChangeTokenRequest]
    }
  }

  @js.native
  trait GetChangeTokenResponse extends js.Object {
    var ChangeToken: js.UndefOr[ChangeToken]
  }

  object GetChangeTokenResponse {
    @inline
    def apply(
        ChangeToken: js.UndefOr[ChangeToken] = js.undefined
    ): GetChangeTokenResponse = {
      val __obj = js.Dynamic.literal()
      ChangeToken.foreach(__v => __obj.updateDynamic("ChangeToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetChangeTokenResponse]
    }
  }

  @js.native
  trait GetChangeTokenStatusRequest extends js.Object {
    var ChangeToken: ChangeToken
  }

  object GetChangeTokenStatusRequest {
    @inline
    def apply(
        ChangeToken: ChangeToken
    ): GetChangeTokenStatusRequest = {
      val __obj = js.Dynamic.literal(
        "ChangeToken" -> ChangeToken.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetChangeTokenStatusRequest]
    }
  }

  @js.native
  trait GetChangeTokenStatusResponse extends js.Object {
    var ChangeTokenStatus: js.UndefOr[ChangeTokenStatus]
  }

  object GetChangeTokenStatusResponse {
    @inline
    def apply(
        ChangeTokenStatus: js.UndefOr[ChangeTokenStatus] = js.undefined
    ): GetChangeTokenStatusResponse = {
      val __obj = js.Dynamic.literal()
      ChangeTokenStatus.foreach(__v => __obj.updateDynamic("ChangeTokenStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetChangeTokenStatusResponse]
    }
  }

  @js.native
  trait GetGeoMatchSetRequest extends js.Object {
    var GeoMatchSetId: ResourceId
  }

  object GetGeoMatchSetRequest {
    @inline
    def apply(
        GeoMatchSetId: ResourceId
    ): GetGeoMatchSetRequest = {
      val __obj = js.Dynamic.literal(
        "GeoMatchSetId" -> GeoMatchSetId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetGeoMatchSetRequest]
    }
  }

  @js.native
  trait GetGeoMatchSetResponse extends js.Object {
    var GeoMatchSet: js.UndefOr[GeoMatchSet]
  }

  object GetGeoMatchSetResponse {
    @inline
    def apply(
        GeoMatchSet: js.UndefOr[GeoMatchSet] = js.undefined
    ): GetGeoMatchSetResponse = {
      val __obj = js.Dynamic.literal()
      GeoMatchSet.foreach(__v => __obj.updateDynamic("GeoMatchSet")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetGeoMatchSetResponse]
    }
  }

  @js.native
  trait GetIPSetRequest extends js.Object {
    var IPSetId: ResourceId
  }

  object GetIPSetRequest {
    @inline
    def apply(
        IPSetId: ResourceId
    ): GetIPSetRequest = {
      val __obj = js.Dynamic.literal(
        "IPSetId" -> IPSetId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetIPSetRequest]
    }
  }

  @js.native
  trait GetIPSetResponse extends js.Object {
    var IPSet: js.UndefOr[IPSet]
  }

  object GetIPSetResponse {
    @inline
    def apply(
        IPSet: js.UndefOr[IPSet] = js.undefined
    ): GetIPSetResponse = {
      val __obj = js.Dynamic.literal()
      IPSet.foreach(__v => __obj.updateDynamic("IPSet")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetIPSetResponse]
    }
  }

  @js.native
  trait GetLoggingConfigurationRequest extends js.Object {
    var ResourceArn: ResourceArn
  }

  object GetLoggingConfigurationRequest {
    @inline
    def apply(
        ResourceArn: ResourceArn
    ): GetLoggingConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetLoggingConfigurationRequest]
    }
  }

  @js.native
  trait GetLoggingConfigurationResponse extends js.Object {
    var LoggingConfiguration: js.UndefOr[LoggingConfiguration]
  }

  object GetLoggingConfigurationResponse {
    @inline
    def apply(
        LoggingConfiguration: js.UndefOr[LoggingConfiguration] = js.undefined
    ): GetLoggingConfigurationResponse = {
      val __obj = js.Dynamic.literal()
      LoggingConfiguration.foreach(__v => __obj.updateDynamic("LoggingConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetLoggingConfigurationResponse]
    }
  }

  @js.native
  trait GetPermissionPolicyRequest extends js.Object {
    var ResourceArn: ResourceArn
  }

  object GetPermissionPolicyRequest {
    @inline
    def apply(
        ResourceArn: ResourceArn
    ): GetPermissionPolicyRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetPermissionPolicyRequest]
    }
  }

  @js.native
  trait GetPermissionPolicyResponse extends js.Object {
    var Policy: js.UndefOr[PolicyString]
  }

  object GetPermissionPolicyResponse {
    @inline
    def apply(
        Policy: js.UndefOr[PolicyString] = js.undefined
    ): GetPermissionPolicyResponse = {
      val __obj = js.Dynamic.literal()
      Policy.foreach(__v => __obj.updateDynamic("Policy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetPermissionPolicyResponse]
    }
  }

  @js.native
  trait GetRateBasedRuleManagedKeysRequest extends js.Object {
    var RuleId: ResourceId
    var NextMarker: js.UndefOr[NextMarker]
  }

  object GetRateBasedRuleManagedKeysRequest {
    @inline
    def apply(
        RuleId: ResourceId,
        NextMarker: js.UndefOr[NextMarker] = js.undefined
    ): GetRateBasedRuleManagedKeysRequest = {
      val __obj = js.Dynamic.literal(
        "RuleId" -> RuleId.asInstanceOf[js.Any]
      )

      NextMarker.foreach(__v => __obj.updateDynamic("NextMarker")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetRateBasedRuleManagedKeysRequest]
    }
  }

  @js.native
  trait GetRateBasedRuleManagedKeysResponse extends js.Object {
    var ManagedKeys: js.UndefOr[ManagedKeys]
    var NextMarker: js.UndefOr[NextMarker]
  }

  object GetRateBasedRuleManagedKeysResponse {
    @inline
    def apply(
        ManagedKeys: js.UndefOr[ManagedKeys] = js.undefined,
        NextMarker: js.UndefOr[NextMarker] = js.undefined
    ): GetRateBasedRuleManagedKeysResponse = {
      val __obj = js.Dynamic.literal()
      ManagedKeys.foreach(__v => __obj.updateDynamic("ManagedKeys")(__v.asInstanceOf[js.Any]))
      NextMarker.foreach(__v => __obj.updateDynamic("NextMarker")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetRateBasedRuleManagedKeysResponse]
    }
  }

  @js.native
  trait GetRateBasedRuleRequest extends js.Object {
    var RuleId: ResourceId
  }

  object GetRateBasedRuleRequest {
    @inline
    def apply(
        RuleId: ResourceId
    ): GetRateBasedRuleRequest = {
      val __obj = js.Dynamic.literal(
        "RuleId" -> RuleId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetRateBasedRuleRequest]
    }
  }

  @js.native
  trait GetRateBasedRuleResponse extends js.Object {
    var Rule: js.UndefOr[RateBasedRule]
  }

  object GetRateBasedRuleResponse {
    @inline
    def apply(
        Rule: js.UndefOr[RateBasedRule] = js.undefined
    ): GetRateBasedRuleResponse = {
      val __obj = js.Dynamic.literal()
      Rule.foreach(__v => __obj.updateDynamic("Rule")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetRateBasedRuleResponse]
    }
  }

  @js.native
  trait GetRegexMatchSetRequest extends js.Object {
    var RegexMatchSetId: ResourceId
  }

  object GetRegexMatchSetRequest {
    @inline
    def apply(
        RegexMatchSetId: ResourceId
    ): GetRegexMatchSetRequest = {
      val __obj = js.Dynamic.literal(
        "RegexMatchSetId" -> RegexMatchSetId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetRegexMatchSetRequest]
    }
  }

  @js.native
  trait GetRegexMatchSetResponse extends js.Object {
    var RegexMatchSet: js.UndefOr[RegexMatchSet]
  }

  object GetRegexMatchSetResponse {
    @inline
    def apply(
        RegexMatchSet: js.UndefOr[RegexMatchSet] = js.undefined
    ): GetRegexMatchSetResponse = {
      val __obj = js.Dynamic.literal()
      RegexMatchSet.foreach(__v => __obj.updateDynamic("RegexMatchSet")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetRegexMatchSetResponse]
    }
  }

  @js.native
  trait GetRegexPatternSetRequest extends js.Object {
    var RegexPatternSetId: ResourceId
  }

  object GetRegexPatternSetRequest {
    @inline
    def apply(
        RegexPatternSetId: ResourceId
    ): GetRegexPatternSetRequest = {
      val __obj = js.Dynamic.literal(
        "RegexPatternSetId" -> RegexPatternSetId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetRegexPatternSetRequest]
    }
  }

  @js.native
  trait GetRegexPatternSetResponse extends js.Object {
    var RegexPatternSet: js.UndefOr[RegexPatternSet]
  }

  object GetRegexPatternSetResponse {
    @inline
    def apply(
        RegexPatternSet: js.UndefOr[RegexPatternSet] = js.undefined
    ): GetRegexPatternSetResponse = {
      val __obj = js.Dynamic.literal()
      RegexPatternSet.foreach(__v => __obj.updateDynamic("RegexPatternSet")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetRegexPatternSetResponse]
    }
  }

  @js.native
  trait GetRuleGroupRequest extends js.Object {
    var RuleGroupId: ResourceId
  }

  object GetRuleGroupRequest {
    @inline
    def apply(
        RuleGroupId: ResourceId
    ): GetRuleGroupRequest = {
      val __obj = js.Dynamic.literal(
        "RuleGroupId" -> RuleGroupId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetRuleGroupRequest]
    }
  }

  @js.native
  trait GetRuleGroupResponse extends js.Object {
    var RuleGroup: js.UndefOr[RuleGroup]
  }

  object GetRuleGroupResponse {
    @inline
    def apply(
        RuleGroup: js.UndefOr[RuleGroup] = js.undefined
    ): GetRuleGroupResponse = {
      val __obj = js.Dynamic.literal()
      RuleGroup.foreach(__v => __obj.updateDynamic("RuleGroup")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetRuleGroupResponse]
    }
  }

  @js.native
  trait GetRuleRequest extends js.Object {
    var RuleId: ResourceId
  }

  object GetRuleRequest {
    @inline
    def apply(
        RuleId: ResourceId
    ): GetRuleRequest = {
      val __obj = js.Dynamic.literal(
        "RuleId" -> RuleId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetRuleRequest]
    }
  }

  @js.native
  trait GetRuleResponse extends js.Object {
    var Rule: js.UndefOr[Rule]
  }

  object GetRuleResponse {
    @inline
    def apply(
        Rule: js.UndefOr[Rule] = js.undefined
    ): GetRuleResponse = {
      val __obj = js.Dynamic.literal()
      Rule.foreach(__v => __obj.updateDynamic("Rule")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetRuleResponse]
    }
  }

  @js.native
  trait GetSampledRequestsRequest extends js.Object {
    var MaxItems: GetSampledRequestsMaxItems
    var RuleId: ResourceId
    var TimeWindow: TimeWindow
    var WebAclId: ResourceId
  }

  object GetSampledRequestsRequest {
    @inline
    def apply(
        MaxItems: GetSampledRequestsMaxItems,
        RuleId: ResourceId,
        TimeWindow: TimeWindow,
        WebAclId: ResourceId
    ): GetSampledRequestsRequest = {
      val __obj = js.Dynamic.literal(
        "MaxItems" -> MaxItems.asInstanceOf[js.Any],
        "RuleId" -> RuleId.asInstanceOf[js.Any],
        "TimeWindow" -> TimeWindow.asInstanceOf[js.Any],
        "WebAclId" -> WebAclId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetSampledRequestsRequest]
    }
  }

  @js.native
  trait GetSampledRequestsResponse extends js.Object {
    var PopulationSize: js.UndefOr[PopulationSize]
    var SampledRequests: js.UndefOr[SampledHTTPRequests]
    var TimeWindow: js.UndefOr[TimeWindow]
  }

  object GetSampledRequestsResponse {
    @inline
    def apply(
        PopulationSize: js.UndefOr[PopulationSize] = js.undefined,
        SampledRequests: js.UndefOr[SampledHTTPRequests] = js.undefined,
        TimeWindow: js.UndefOr[TimeWindow] = js.undefined
    ): GetSampledRequestsResponse = {
      val __obj = js.Dynamic.literal()
      PopulationSize.foreach(__v => __obj.updateDynamic("PopulationSize")(__v.asInstanceOf[js.Any]))
      SampledRequests.foreach(__v => __obj.updateDynamic("SampledRequests")(__v.asInstanceOf[js.Any]))
      TimeWindow.foreach(__v => __obj.updateDynamic("TimeWindow")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetSampledRequestsResponse]
    }
  }

  @js.native
  trait GetSizeConstraintSetRequest extends js.Object {
    var SizeConstraintSetId: ResourceId
  }

  object GetSizeConstraintSetRequest {
    @inline
    def apply(
        SizeConstraintSetId: ResourceId
    ): GetSizeConstraintSetRequest = {
      val __obj = js.Dynamic.literal(
        "SizeConstraintSetId" -> SizeConstraintSetId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetSizeConstraintSetRequest]
    }
  }

  @js.native
  trait GetSizeConstraintSetResponse extends js.Object {
    var SizeConstraintSet: js.UndefOr[SizeConstraintSet]
  }

  object GetSizeConstraintSetResponse {
    @inline
    def apply(
        SizeConstraintSet: js.UndefOr[SizeConstraintSet] = js.undefined
    ): GetSizeConstraintSetResponse = {
      val __obj = js.Dynamic.literal()
      SizeConstraintSet.foreach(__v => __obj.updateDynamic("SizeConstraintSet")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetSizeConstraintSetResponse]
    }
  }

  /** A request to get a <a>SqlInjectionMatchSet</a>.
    */
  @js.native
  trait GetSqlInjectionMatchSetRequest extends js.Object {
    var SqlInjectionMatchSetId: ResourceId
  }

  object GetSqlInjectionMatchSetRequest {
    @inline
    def apply(
        SqlInjectionMatchSetId: ResourceId
    ): GetSqlInjectionMatchSetRequest = {
      val __obj = js.Dynamic.literal(
        "SqlInjectionMatchSetId" -> SqlInjectionMatchSetId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetSqlInjectionMatchSetRequest]
    }
  }

  /** The response to a <a>GetSqlInjectionMatchSet</a> request.
    */
  @js.native
  trait GetSqlInjectionMatchSetResponse extends js.Object {
    var SqlInjectionMatchSet: js.UndefOr[SqlInjectionMatchSet]
  }

  object GetSqlInjectionMatchSetResponse {
    @inline
    def apply(
        SqlInjectionMatchSet: js.UndefOr[SqlInjectionMatchSet] = js.undefined
    ): GetSqlInjectionMatchSetResponse = {
      val __obj = js.Dynamic.literal()
      SqlInjectionMatchSet.foreach(__v => __obj.updateDynamic("SqlInjectionMatchSet")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetSqlInjectionMatchSetResponse]
    }
  }

  @js.native
  trait GetWebACLRequest extends js.Object {
    var WebACLId: ResourceId
  }

  object GetWebACLRequest {
    @inline
    def apply(
        WebACLId: ResourceId
    ): GetWebACLRequest = {
      val __obj = js.Dynamic.literal(
        "WebACLId" -> WebACLId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetWebACLRequest]
    }
  }

  @js.native
  trait GetWebACLResponse extends js.Object {
    var WebACL: js.UndefOr[WebACL]
  }

  object GetWebACLResponse {
    @inline
    def apply(
        WebACL: js.UndefOr[WebACL] = js.undefined
    ): GetWebACLResponse = {
      val __obj = js.Dynamic.literal()
      WebACL.foreach(__v => __obj.updateDynamic("WebACL")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetWebACLResponse]
    }
  }

  /** A request to get an <a>XssMatchSet</a>.
    */
  @js.native
  trait GetXssMatchSetRequest extends js.Object {
    var XssMatchSetId: ResourceId
  }

  object GetXssMatchSetRequest {
    @inline
    def apply(
        XssMatchSetId: ResourceId
    ): GetXssMatchSetRequest = {
      val __obj = js.Dynamic.literal(
        "XssMatchSetId" -> XssMatchSetId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetXssMatchSetRequest]
    }
  }

  /** The response to a <a>GetXssMatchSet</a> request.
    */
  @js.native
  trait GetXssMatchSetResponse extends js.Object {
    var XssMatchSet: js.UndefOr[XssMatchSet]
  }

  object GetXssMatchSetResponse {
    @inline
    def apply(
        XssMatchSet: js.UndefOr[XssMatchSet] = js.undefined
    ): GetXssMatchSetResponse = {
      val __obj = js.Dynamic.literal()
      XssMatchSet.foreach(__v => __obj.updateDynamic("XssMatchSet")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetXssMatchSetResponse]
    }
  }

  /** '''Note:'''This is ```AWS WAF Classic``` documentation. For more information, see [[https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html|AWS WAF Classic]] in the developer guide.
    *  ```For the latest version of AWS WAF```, use the AWS WAFV2 API and see the [[https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html|AWS WAF Developer Guide]]. With the latest version, AWS WAF has a single set of endpoints for regional and global use.
    * The response from a <a>GetSampledRequests</a> request includes an <code>HTTPHeader</code> complex type that appears as <code>Headers</code> in the response syntax. <code>HTTPHeader</code> contains the names and values of all of the headers that appear in one of the web requests that were returned by <code>GetSampledRequests</code>.
    */
  @js.native
  trait HTTPHeader extends js.Object {
    var Name: js.UndefOr[HeaderName]
    var Value: js.UndefOr[HeaderValue]
  }

  object HTTPHeader {
    @inline
    def apply(
        Name: js.UndefOr[HeaderName] = js.undefined,
        Value: js.UndefOr[HeaderValue] = js.undefined
    ): HTTPHeader = {
      val __obj = js.Dynamic.literal()
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HTTPHeader]
    }
  }

  /** '''Note:'''This is ```AWS WAF Classic``` documentation. For more information, see [[https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html|AWS WAF Classic]] in the developer guide.
    *  ```For the latest version of AWS WAF```, use the AWS WAFV2 API and see the [[https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html|AWS WAF Developer Guide]]. With the latest version, AWS WAF has a single set of endpoints for regional and global use.
    * The response from a <a>GetSampledRequests</a> request includes an <code>HTTPRequest</code> complex type that appears as <code>Request</code> in the response syntax. <code>HTTPRequest</code> contains information about one of the web requests that were returned by <code>GetSampledRequests</code>.
    */
  @js.native
  trait HTTPRequest extends js.Object {
    var ClientIP: js.UndefOr[IPString]
    var Country: js.UndefOr[Country]
    var HTTPVersion: js.UndefOr[HTTPVersion]
    var Headers: js.UndefOr[HTTPHeaders]
    var Method: js.UndefOr[HTTPMethod]
    var URI: js.UndefOr[URIString]
  }

  object HTTPRequest {
    @inline
    def apply(
        ClientIP: js.UndefOr[IPString] = js.undefined,
        Country: js.UndefOr[Country] = js.undefined,
        HTTPVersion: js.UndefOr[HTTPVersion] = js.undefined,
        Headers: js.UndefOr[HTTPHeaders] = js.undefined,
        Method: js.UndefOr[HTTPMethod] = js.undefined,
        URI: js.UndefOr[URIString] = js.undefined
    ): HTTPRequest = {
      val __obj = js.Dynamic.literal()
      ClientIP.foreach(__v => __obj.updateDynamic("ClientIP")(__v.asInstanceOf[js.Any]))
      Country.foreach(__v => __obj.updateDynamic("Country")(__v.asInstanceOf[js.Any]))
      HTTPVersion.foreach(__v => __obj.updateDynamic("HTTPVersion")(__v.asInstanceOf[js.Any]))
      Headers.foreach(__v => __obj.updateDynamic("Headers")(__v.asInstanceOf[js.Any]))
      Method.foreach(__v => __obj.updateDynamic("Method")(__v.asInstanceOf[js.Any]))
      URI.foreach(__v => __obj.updateDynamic("URI")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HTTPRequest]
    }
  }

  /** '''Note:'''This is ```AWS WAF Classic``` documentation. For more information, see [[https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html|AWS WAF Classic]] in the developer guide.
    *  ```For the latest version of AWS WAF```, use the AWS WAFV2 API and see the [[https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html|AWS WAF Developer Guide]]. With the latest version, AWS WAF has a single set of endpoints for regional and global use.
    * Contains one or more IP addresses or blocks of IP addresses specified in Classless Inter-Domain Routing (CIDR) notation. AWS WAF supports IPv4 address ranges: /8 and any range between /16 through /32. AWS WAF supports IPv6 address ranges: /24, /32, /48, /56, /64, and /128.
    *  To specify an individual IP address, you specify the four-part IP address followed by a <code>/32</code>, for example, 192.0.2.0/32. To block a range of IP addresses, you can specify /8 or any range between /16 through /32 (for IPv4) or /24, /32, /48, /56, /64, or /128 (for IPv6). For more information about CIDR notation, see the Wikipedia entry [[https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing|Classless Inter-Domain Routing]].
    */
  @js.native
  trait IPSet extends js.Object {
    var IPSetDescriptors: IPSetDescriptors
    var IPSetId: ResourceId
    var Name: js.UndefOr[ResourceName]
  }

  object IPSet {
    @inline
    def apply(
        IPSetDescriptors: IPSetDescriptors,
        IPSetId: ResourceId,
        Name: js.UndefOr[ResourceName] = js.undefined
    ): IPSet = {
      val __obj = js.Dynamic.literal(
        "IPSetDescriptors" -> IPSetDescriptors.asInstanceOf[js.Any],
        "IPSetId" -> IPSetId.asInstanceOf[js.Any]
      )

      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[IPSet]
    }
  }

  /** '''Note:'''This is ```AWS WAF Classic``` documentation. For more information, see [[https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html|AWS WAF Classic]] in the developer guide.
    *  ```For the latest version of AWS WAF```, use the AWS WAFV2 API and see the [[https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html|AWS WAF Developer Guide]]. With the latest version, AWS WAF has a single set of endpoints for regional and global use.
    * Specifies the IP address type (<code>IPV4</code> or <code>IPV6</code>) and the IP address range (in CIDR format) that web requests originate from.
    */
  @js.native
  trait IPSetDescriptor extends js.Object {
    var Type: IPSetDescriptorType
    var Value: IPSetDescriptorValue
  }

  object IPSetDescriptor {
    @inline
    def apply(
        Type: IPSetDescriptorType,
        Value: IPSetDescriptorValue
    ): IPSetDescriptor = {
      val __obj = js.Dynamic.literal(
        "Type" -> Type.asInstanceOf[js.Any],
        "Value" -> Value.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[IPSetDescriptor]
    }
  }

  @js.native
  sealed trait IPSetDescriptorType extends js.Any
  object IPSetDescriptorType {
    val IPV4 = "IPV4".asInstanceOf[IPSetDescriptorType]
    val IPV6 = "IPV6".asInstanceOf[IPSetDescriptorType]

    @inline def values = js.Array(IPV4, IPV6)
  }

  /** '''Note:'''This is ```AWS WAF Classic``` documentation. For more information, see [[https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html|AWS WAF Classic]] in the developer guide.
    *  ```For the latest version of AWS WAF```, use the AWS WAFV2 API and see the [[https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html|AWS WAF Developer Guide]]. With the latest version, AWS WAF has a single set of endpoints for regional and global use.
    * Contains the identifier and the name of the <code>IPSet</code>.
    */
  @js.native
  trait IPSetSummary extends js.Object {
    var IPSetId: ResourceId
    var Name: ResourceName
  }

  object IPSetSummary {
    @inline
    def apply(
        IPSetId: ResourceId,
        Name: ResourceName
    ): IPSetSummary = {
      val __obj = js.Dynamic.literal(
        "IPSetId" -> IPSetId.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[IPSetSummary]
    }
  }

  /** '''Note:'''This is ```AWS WAF Classic``` documentation. For more information, see [[https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html|AWS WAF Classic]] in the developer guide.
    *  ```For the latest version of AWS WAF```, use the AWS WAFV2 API and see the [[https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html|AWS WAF Developer Guide]]. With the latest version, AWS WAF has a single set of endpoints for regional and global use.
    * Specifies the type of update to perform to an <a>IPSet</a> with <a>UpdateIPSet</a>.
    */
  @js.native
  trait IPSetUpdate extends js.Object {
    var Action: ChangeAction
    var IPSetDescriptor: IPSetDescriptor
  }

  object IPSetUpdate {
    @inline
    def apply(
        Action: ChangeAction,
        IPSetDescriptor: IPSetDescriptor
    ): IPSetUpdate = {
      val __obj = js.Dynamic.literal(
        "Action" -> Action.asInstanceOf[js.Any],
        "IPSetDescriptor" -> IPSetDescriptor.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[IPSetUpdate]
    }
  }

  @js.native
  trait ListActivatedRulesInRuleGroupRequest extends js.Object {
    var Limit: js.UndefOr[PaginationLimit]
    var NextMarker: js.UndefOr[NextMarker]
    var RuleGroupId: js.UndefOr[ResourceId]
  }

  object ListActivatedRulesInRuleGroupRequest {
    @inline
    def apply(
        Limit: js.UndefOr[PaginationLimit] = js.undefined,
        NextMarker: js.UndefOr[NextMarker] = js.undefined,
        RuleGroupId: js.UndefOr[ResourceId] = js.undefined
    ): ListActivatedRulesInRuleGroupRequest = {
      val __obj = js.Dynamic.literal()
      Limit.foreach(__v => __obj.updateDynamic("Limit")(__v.asInstanceOf[js.Any]))
      NextMarker.foreach(__v => __obj.updateDynamic("NextMarker")(__v.asInstanceOf[js.Any]))
      RuleGroupId.foreach(__v => __obj.updateDynamic("RuleGroupId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListActivatedRulesInRuleGroupRequest]
    }
  }

  @js.native
  trait ListActivatedRulesInRuleGroupResponse extends js.Object {
    var ActivatedRules: js.UndefOr[ActivatedRules]
    var NextMarker: js.UndefOr[NextMarker]
  }

  object ListActivatedRulesInRuleGroupResponse {
    @inline
    def apply(
        ActivatedRules: js.UndefOr[ActivatedRules] = js.undefined,
        NextMarker: js.UndefOr[NextMarker] = js.undefined
    ): ListActivatedRulesInRuleGroupResponse = {
      val __obj = js.Dynamic.literal()
      ActivatedRules.foreach(__v => __obj.updateDynamic("ActivatedRules")(__v.asInstanceOf[js.Any]))
      NextMarker.foreach(__v => __obj.updateDynamic("NextMarker")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListActivatedRulesInRuleGroupResponse]
    }
  }

  @js.native
  trait ListByteMatchSetsRequest extends js.Object {
    var Limit: js.UndefOr[PaginationLimit]
    var NextMarker: js.UndefOr[NextMarker]
  }

  object ListByteMatchSetsRequest {
    @inline
    def apply(
        Limit: js.UndefOr[PaginationLimit] = js.undefined,
        NextMarker: js.UndefOr[NextMarker] = js.undefined
    ): ListByteMatchSetsRequest = {
      val __obj = js.Dynamic.literal()
      Limit.foreach(__v => __obj.updateDynamic("Limit")(__v.asInstanceOf[js.Any]))
      NextMarker.foreach(__v => __obj.updateDynamic("NextMarker")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListByteMatchSetsRequest]
    }
  }

  @js.native
  trait ListByteMatchSetsResponse extends js.Object {
    var ByteMatchSets: js.UndefOr[ByteMatchSetSummaries]
    var NextMarker: js.UndefOr[NextMarker]
  }

  object ListByteMatchSetsResponse {
    @inline
    def apply(
        ByteMatchSets: js.UndefOr[ByteMatchSetSummaries] = js.undefined,
        NextMarker: js.UndefOr[NextMarker] = js.undefined
    ): ListByteMatchSetsResponse = {
      val __obj = js.Dynamic.literal()
      ByteMatchSets.foreach(__v => __obj.updateDynamic("ByteMatchSets")(__v.asInstanceOf[js.Any]))
      NextMarker.foreach(__v => __obj.updateDynamic("NextMarker")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListByteMatchSetsResponse]
    }
  }

  @js.native
  trait ListGeoMatchSetsRequest extends js.Object {
    var Limit: js.UndefOr[PaginationLimit]
    var NextMarker: js.UndefOr[NextMarker]
  }

  object ListGeoMatchSetsRequest {
    @inline
    def apply(
        Limit: js.UndefOr[PaginationLimit] = js.undefined,
        NextMarker: js.UndefOr[NextMarker] = js.undefined
    ): ListGeoMatchSetsRequest = {
      val __obj = js.Dynamic.literal()
      Limit.foreach(__v => __obj.updateDynamic("Limit")(__v.asInstanceOf[js.Any]))
      NextMarker.foreach(__v => __obj.updateDynamic("NextMarker")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListGeoMatchSetsRequest]
    }
  }

  @js.native
  trait ListGeoMatchSetsResponse extends js.Object {
    var GeoMatchSets: js.UndefOr[GeoMatchSetSummaries]
    var NextMarker: js.UndefOr[NextMarker]
  }

  object ListGeoMatchSetsResponse {
    @inline
    def apply(
        GeoMatchSets: js.UndefOr[GeoMatchSetSummaries] = js.undefined,
        NextMarker: js.UndefOr[NextMarker] = js.undefined
    ): ListGeoMatchSetsResponse = {
      val __obj = js.Dynamic.literal()
      GeoMatchSets.foreach(__v => __obj.updateDynamic("GeoMatchSets")(__v.asInstanceOf[js.Any]))
      NextMarker.foreach(__v => __obj.updateDynamic("NextMarker")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListGeoMatchSetsResponse]
    }
  }

  @js.native
  trait ListIPSetsRequest extends js.Object {
    var Limit: js.UndefOr[PaginationLimit]
    var NextMarker: js.UndefOr[NextMarker]
  }

  object ListIPSetsRequest {
    @inline
    def apply(
        Limit: js.UndefOr[PaginationLimit] = js.undefined,
        NextMarker: js.UndefOr[NextMarker] = js.undefined
    ): ListIPSetsRequest = {
      val __obj = js.Dynamic.literal()
      Limit.foreach(__v => __obj.updateDynamic("Limit")(__v.asInstanceOf[js.Any]))
      NextMarker.foreach(__v => __obj.updateDynamic("NextMarker")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListIPSetsRequest]
    }
  }

  @js.native
  trait ListIPSetsResponse extends js.Object {
    var IPSets: js.UndefOr[IPSetSummaries]
    var NextMarker: js.UndefOr[NextMarker]
  }

  object ListIPSetsResponse {
    @inline
    def apply(
        IPSets: js.UndefOr[IPSetSummaries] = js.undefined,
        NextMarker: js.UndefOr[NextMarker] = js.undefined
    ): ListIPSetsResponse = {
      val __obj = js.Dynamic.literal()
      IPSets.foreach(__v => __obj.updateDynamic("IPSets")(__v.asInstanceOf[js.Any]))
      NextMarker.foreach(__v => __obj.updateDynamic("NextMarker")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListIPSetsResponse]
    }
  }

  @js.native
  trait ListLoggingConfigurationsRequest extends js.Object {
    var Limit: js.UndefOr[PaginationLimit]
    var NextMarker: js.UndefOr[NextMarker]
  }

  object ListLoggingConfigurationsRequest {
    @inline
    def apply(
        Limit: js.UndefOr[PaginationLimit] = js.undefined,
        NextMarker: js.UndefOr[NextMarker] = js.undefined
    ): ListLoggingConfigurationsRequest = {
      val __obj = js.Dynamic.literal()
      Limit.foreach(__v => __obj.updateDynamic("Limit")(__v.asInstanceOf[js.Any]))
      NextMarker.foreach(__v => __obj.updateDynamic("NextMarker")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListLoggingConfigurationsRequest]
    }
  }

  @js.native
  trait ListLoggingConfigurationsResponse extends js.Object {
    var LoggingConfigurations: js.UndefOr[LoggingConfigurations]
    var NextMarker: js.UndefOr[NextMarker]
  }

  object ListLoggingConfigurationsResponse {
    @inline
    def apply(
        LoggingConfigurations: js.UndefOr[LoggingConfigurations] = js.undefined,
        NextMarker: js.UndefOr[NextMarker] = js.undefined
    ): ListLoggingConfigurationsResponse = {
      val __obj = js.Dynamic.literal()
      LoggingConfigurations.foreach(__v => __obj.updateDynamic("LoggingConfigurations")(__v.asInstanceOf[js.Any]))
      NextMarker.foreach(__v => __obj.updateDynamic("NextMarker")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListLoggingConfigurationsResponse]
    }
  }

  @js.native
  trait ListRateBasedRulesRequest extends js.Object {
    var Limit: js.UndefOr[PaginationLimit]
    var NextMarker: js.UndefOr[NextMarker]
  }

  object ListRateBasedRulesRequest {
    @inline
    def apply(
        Limit: js.UndefOr[PaginationLimit] = js.undefined,
        NextMarker: js.UndefOr[NextMarker] = js.undefined
    ): ListRateBasedRulesRequest = {
      val __obj = js.Dynamic.literal()
      Limit.foreach(__v => __obj.updateDynamic("Limit")(__v.asInstanceOf[js.Any]))
      NextMarker.foreach(__v => __obj.updateDynamic("NextMarker")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListRateBasedRulesRequest]
    }
  }

  @js.native
  trait ListRateBasedRulesResponse extends js.Object {
    var NextMarker: js.UndefOr[NextMarker]
    var Rules: js.UndefOr[RuleSummaries]
  }

  object ListRateBasedRulesResponse {
    @inline
    def apply(
        NextMarker: js.UndefOr[NextMarker] = js.undefined,
        Rules: js.UndefOr[RuleSummaries] = js.undefined
    ): ListRateBasedRulesResponse = {
      val __obj = js.Dynamic.literal()
      NextMarker.foreach(__v => __obj.updateDynamic("NextMarker")(__v.asInstanceOf[js.Any]))
      Rules.foreach(__v => __obj.updateDynamic("Rules")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListRateBasedRulesResponse]
    }
  }

  @js.native
  trait ListRegexMatchSetsRequest extends js.Object {
    var Limit: js.UndefOr[PaginationLimit]
    var NextMarker: js.UndefOr[NextMarker]
  }

  object ListRegexMatchSetsRequest {
    @inline
    def apply(
        Limit: js.UndefOr[PaginationLimit] = js.undefined,
        NextMarker: js.UndefOr[NextMarker] = js.undefined
    ): ListRegexMatchSetsRequest = {
      val __obj = js.Dynamic.literal()
      Limit.foreach(__v => __obj.updateDynamic("Limit")(__v.asInstanceOf[js.Any]))
      NextMarker.foreach(__v => __obj.updateDynamic("NextMarker")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListRegexMatchSetsRequest]
    }
  }

  @js.native
  trait ListRegexMatchSetsResponse extends js.Object {
    var NextMarker: js.UndefOr[NextMarker]
    var RegexMatchSets: js.UndefOr[RegexMatchSetSummaries]
  }

  object ListRegexMatchSetsResponse {
    @inline
    def apply(
        NextMarker: js.UndefOr[NextMarker] = js.undefined,
        RegexMatchSets: js.UndefOr[RegexMatchSetSummaries] = js.undefined
    ): ListRegexMatchSetsResponse = {
      val __obj = js.Dynamic.literal()
      NextMarker.foreach(__v => __obj.updateDynamic("NextMarker")(__v.asInstanceOf[js.Any]))
      RegexMatchSets.foreach(__v => __obj.updateDynamic("RegexMatchSets")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListRegexMatchSetsResponse]
    }
  }

  @js.native
  trait ListRegexPatternSetsRequest extends js.Object {
    var Limit: js.UndefOr[PaginationLimit]
    var NextMarker: js.UndefOr[NextMarker]
  }

  object ListRegexPatternSetsRequest {
    @inline
    def apply(
        Limit: js.UndefOr[PaginationLimit] = js.undefined,
        NextMarker: js.UndefOr[NextMarker] = js.undefined
    ): ListRegexPatternSetsRequest = {
      val __obj = js.Dynamic.literal()
      Limit.foreach(__v => __obj.updateDynamic("Limit")(__v.asInstanceOf[js.Any]))
      NextMarker.foreach(__v => __obj.updateDynamic("NextMarker")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListRegexPatternSetsRequest]
    }
  }

  @js.native
  trait ListRegexPatternSetsResponse extends js.Object {
    var NextMarker: js.UndefOr[NextMarker]
    var RegexPatternSets: js.UndefOr[RegexPatternSetSummaries]
  }

  object ListRegexPatternSetsResponse {
    @inline
    def apply(
        NextMarker: js.UndefOr[NextMarker] = js.undefined,
        RegexPatternSets: js.UndefOr[RegexPatternSetSummaries] = js.undefined
    ): ListRegexPatternSetsResponse = {
      val __obj = js.Dynamic.literal()
      NextMarker.foreach(__v => __obj.updateDynamic("NextMarker")(__v.asInstanceOf[js.Any]))
      RegexPatternSets.foreach(__v => __obj.updateDynamic("RegexPatternSets")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListRegexPatternSetsResponse]
    }
  }

  @js.native
  trait ListRuleGroupsRequest extends js.Object {
    var Limit: js.UndefOr[PaginationLimit]
    var NextMarker: js.UndefOr[NextMarker]
  }

  object ListRuleGroupsRequest {
    @inline
    def apply(
        Limit: js.UndefOr[PaginationLimit] = js.undefined,
        NextMarker: js.UndefOr[NextMarker] = js.undefined
    ): ListRuleGroupsRequest = {
      val __obj = js.Dynamic.literal()
      Limit.foreach(__v => __obj.updateDynamic("Limit")(__v.asInstanceOf[js.Any]))
      NextMarker.foreach(__v => __obj.updateDynamic("NextMarker")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListRuleGroupsRequest]
    }
  }

  @js.native
  trait ListRuleGroupsResponse extends js.Object {
    var NextMarker: js.UndefOr[NextMarker]
    var RuleGroups: js.UndefOr[RuleGroupSummaries]
  }

  object ListRuleGroupsResponse {
    @inline
    def apply(
        NextMarker: js.UndefOr[NextMarker] = js.undefined,
        RuleGroups: js.UndefOr[RuleGroupSummaries] = js.undefined
    ): ListRuleGroupsResponse = {
      val __obj = js.Dynamic.literal()
      NextMarker.foreach(__v => __obj.updateDynamic("NextMarker")(__v.asInstanceOf[js.Any]))
      RuleGroups.foreach(__v => __obj.updateDynamic("RuleGroups")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListRuleGroupsResponse]
    }
  }

  @js.native
  trait ListRulesRequest extends js.Object {
    var Limit: js.UndefOr[PaginationLimit]
    var NextMarker: js.UndefOr[NextMarker]
  }

  object ListRulesRequest {
    @inline
    def apply(
        Limit: js.UndefOr[PaginationLimit] = js.undefined,
        NextMarker: js.UndefOr[NextMarker] = js.undefined
    ): ListRulesRequest = {
      val __obj = js.Dynamic.literal()
      Limit.foreach(__v => __obj.updateDynamic("Limit")(__v.asInstanceOf[js.Any]))
      NextMarker.foreach(__v => __obj.updateDynamic("NextMarker")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListRulesRequest]
    }
  }

  @js.native
  trait ListRulesResponse extends js.Object {
    var NextMarker: js.UndefOr[NextMarker]
    var Rules: js.UndefOr[RuleSummaries]
  }

  object ListRulesResponse {
    @inline
    def apply(
        NextMarker: js.UndefOr[NextMarker] = js.undefined,
        Rules: js.UndefOr[RuleSummaries] = js.undefined
    ): ListRulesResponse = {
      val __obj = js.Dynamic.literal()
      NextMarker.foreach(__v => __obj.updateDynamic("NextMarker")(__v.asInstanceOf[js.Any]))
      Rules.foreach(__v => __obj.updateDynamic("Rules")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListRulesResponse]
    }
  }

  @js.native
  trait ListSizeConstraintSetsRequest extends js.Object {
    var Limit: js.UndefOr[PaginationLimit]
    var NextMarker: js.UndefOr[NextMarker]
  }

  object ListSizeConstraintSetsRequest {
    @inline
    def apply(
        Limit: js.UndefOr[PaginationLimit] = js.undefined,
        NextMarker: js.UndefOr[NextMarker] = js.undefined
    ): ListSizeConstraintSetsRequest = {
      val __obj = js.Dynamic.literal()
      Limit.foreach(__v => __obj.updateDynamic("Limit")(__v.asInstanceOf[js.Any]))
      NextMarker.foreach(__v => __obj.updateDynamic("NextMarker")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSizeConstraintSetsRequest]
    }
  }

  @js.native
  trait ListSizeConstraintSetsResponse extends js.Object {
    var NextMarker: js.UndefOr[NextMarker]
    var SizeConstraintSets: js.UndefOr[SizeConstraintSetSummaries]
  }

  object ListSizeConstraintSetsResponse {
    @inline
    def apply(
        NextMarker: js.UndefOr[NextMarker] = js.undefined,
        SizeConstraintSets: js.UndefOr[SizeConstraintSetSummaries] = js.undefined
    ): ListSizeConstraintSetsResponse = {
      val __obj = js.Dynamic.literal()
      NextMarker.foreach(__v => __obj.updateDynamic("NextMarker")(__v.asInstanceOf[js.Any]))
      SizeConstraintSets.foreach(__v => __obj.updateDynamic("SizeConstraintSets")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSizeConstraintSetsResponse]
    }
  }

  /** A request to list the <a>SqlInjectionMatchSet</a> objects created by the current AWS account.
    */
  @js.native
  trait ListSqlInjectionMatchSetsRequest extends js.Object {
    var Limit: js.UndefOr[PaginationLimit]
    var NextMarker: js.UndefOr[NextMarker]
  }

  object ListSqlInjectionMatchSetsRequest {
    @inline
    def apply(
        Limit: js.UndefOr[PaginationLimit] = js.undefined,
        NextMarker: js.UndefOr[NextMarker] = js.undefined
    ): ListSqlInjectionMatchSetsRequest = {
      val __obj = js.Dynamic.literal()
      Limit.foreach(__v => __obj.updateDynamic("Limit")(__v.asInstanceOf[js.Any]))
      NextMarker.foreach(__v => __obj.updateDynamic("NextMarker")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSqlInjectionMatchSetsRequest]
    }
  }

  /** The response to a <a>ListSqlInjectionMatchSets</a> request.
    */
  @js.native
  trait ListSqlInjectionMatchSetsResponse extends js.Object {
    var NextMarker: js.UndefOr[NextMarker]
    var SqlInjectionMatchSets: js.UndefOr[SqlInjectionMatchSetSummaries]
  }

  object ListSqlInjectionMatchSetsResponse {
    @inline
    def apply(
        NextMarker: js.UndefOr[NextMarker] = js.undefined,
        SqlInjectionMatchSets: js.UndefOr[SqlInjectionMatchSetSummaries] = js.undefined
    ): ListSqlInjectionMatchSetsResponse = {
      val __obj = js.Dynamic.literal()
      NextMarker.foreach(__v => __obj.updateDynamic("NextMarker")(__v.asInstanceOf[js.Any]))
      SqlInjectionMatchSets.foreach(__v => __obj.updateDynamic("SqlInjectionMatchSets")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSqlInjectionMatchSetsResponse]
    }
  }

  @js.native
  trait ListSubscribedRuleGroupsRequest extends js.Object {
    var Limit: js.UndefOr[PaginationLimit]
    var NextMarker: js.UndefOr[NextMarker]
  }

  object ListSubscribedRuleGroupsRequest {
    @inline
    def apply(
        Limit: js.UndefOr[PaginationLimit] = js.undefined,
        NextMarker: js.UndefOr[NextMarker] = js.undefined
    ): ListSubscribedRuleGroupsRequest = {
      val __obj = js.Dynamic.literal()
      Limit.foreach(__v => __obj.updateDynamic("Limit")(__v.asInstanceOf[js.Any]))
      NextMarker.foreach(__v => __obj.updateDynamic("NextMarker")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSubscribedRuleGroupsRequest]
    }
  }

  @js.native
  trait ListSubscribedRuleGroupsResponse extends js.Object {
    var NextMarker: js.UndefOr[NextMarker]
    var RuleGroups: js.UndefOr[SubscribedRuleGroupSummaries]
  }

  object ListSubscribedRuleGroupsResponse {
    @inline
    def apply(
        NextMarker: js.UndefOr[NextMarker] = js.undefined,
        RuleGroups: js.UndefOr[SubscribedRuleGroupSummaries] = js.undefined
    ): ListSubscribedRuleGroupsResponse = {
      val __obj = js.Dynamic.literal()
      NextMarker.foreach(__v => __obj.updateDynamic("NextMarker")(__v.asInstanceOf[js.Any]))
      RuleGroups.foreach(__v => __obj.updateDynamic("RuleGroups")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSubscribedRuleGroupsResponse]
    }
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var ResourceARN: ResourceArn
    var Limit: js.UndefOr[PaginationLimit]
    var NextMarker: js.UndefOr[NextMarker]
  }

  object ListTagsForResourceRequest {
    @inline
    def apply(
        ResourceARN: ResourceArn,
        Limit: js.UndefOr[PaginationLimit] = js.undefined,
        NextMarker: js.UndefOr[NextMarker] = js.undefined
    ): ListTagsForResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceARN" -> ResourceARN.asInstanceOf[js.Any]
      )

      Limit.foreach(__v => __obj.updateDynamic("Limit")(__v.asInstanceOf[js.Any]))
      NextMarker.foreach(__v => __obj.updateDynamic("NextMarker")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceRequest]
    }
  }

  @js.native
  trait ListTagsForResourceResponse extends js.Object {
    var NextMarker: js.UndefOr[NextMarker]
    var TagInfoForResource: js.UndefOr[TagInfoForResource]
  }

  object ListTagsForResourceResponse {
    @inline
    def apply(
        NextMarker: js.UndefOr[NextMarker] = js.undefined,
        TagInfoForResource: js.UndefOr[TagInfoForResource] = js.undefined
    ): ListTagsForResourceResponse = {
      val __obj = js.Dynamic.literal()
      NextMarker.foreach(__v => __obj.updateDynamic("NextMarker")(__v.asInstanceOf[js.Any]))
      TagInfoForResource.foreach(__v => __obj.updateDynamic("TagInfoForResource")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceResponse]
    }
  }

  @js.native
  trait ListWebACLsRequest extends js.Object {
    var Limit: js.UndefOr[PaginationLimit]
    var NextMarker: js.UndefOr[NextMarker]
  }

  object ListWebACLsRequest {
    @inline
    def apply(
        Limit: js.UndefOr[PaginationLimit] = js.undefined,
        NextMarker: js.UndefOr[NextMarker] = js.undefined
    ): ListWebACLsRequest = {
      val __obj = js.Dynamic.literal()
      Limit.foreach(__v => __obj.updateDynamic("Limit")(__v.asInstanceOf[js.Any]))
      NextMarker.foreach(__v => __obj.updateDynamic("NextMarker")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListWebACLsRequest]
    }
  }

  @js.native
  trait ListWebACLsResponse extends js.Object {
    var NextMarker: js.UndefOr[NextMarker]
    var WebACLs: js.UndefOr[WebACLSummaries]
  }

  object ListWebACLsResponse {
    @inline
    def apply(
        NextMarker: js.UndefOr[NextMarker] = js.undefined,
        WebACLs: js.UndefOr[WebACLSummaries] = js.undefined
    ): ListWebACLsResponse = {
      val __obj = js.Dynamic.literal()
      NextMarker.foreach(__v => __obj.updateDynamic("NextMarker")(__v.asInstanceOf[js.Any]))
      WebACLs.foreach(__v => __obj.updateDynamic("WebACLs")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListWebACLsResponse]
    }
  }

  /** A request to list the <a>XssMatchSet</a> objects created by the current AWS account.
    */
  @js.native
  trait ListXssMatchSetsRequest extends js.Object {
    var Limit: js.UndefOr[PaginationLimit]
    var NextMarker: js.UndefOr[NextMarker]
  }

  object ListXssMatchSetsRequest {
    @inline
    def apply(
        Limit: js.UndefOr[PaginationLimit] = js.undefined,
        NextMarker: js.UndefOr[NextMarker] = js.undefined
    ): ListXssMatchSetsRequest = {
      val __obj = js.Dynamic.literal()
      Limit.foreach(__v => __obj.updateDynamic("Limit")(__v.asInstanceOf[js.Any]))
      NextMarker.foreach(__v => __obj.updateDynamic("NextMarker")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListXssMatchSetsRequest]
    }
  }

  /** The response to a <a>ListXssMatchSets</a> request.
    */
  @js.native
  trait ListXssMatchSetsResponse extends js.Object {
    var NextMarker: js.UndefOr[NextMarker]
    var XssMatchSets: js.UndefOr[XssMatchSetSummaries]
  }

  object ListXssMatchSetsResponse {
    @inline
    def apply(
        NextMarker: js.UndefOr[NextMarker] = js.undefined,
        XssMatchSets: js.UndefOr[XssMatchSetSummaries] = js.undefined
    ): ListXssMatchSetsResponse = {
      val __obj = js.Dynamic.literal()
      NextMarker.foreach(__v => __obj.updateDynamic("NextMarker")(__v.asInstanceOf[js.Any]))
      XssMatchSets.foreach(__v => __obj.updateDynamic("XssMatchSets")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListXssMatchSetsResponse]
    }
  }

  /** '''Note:'''This is ```AWS WAF Classic``` documentation. For more information, see [[https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html|AWS WAF Classic]] in the developer guide.
    *  ```For the latest version of AWS WAF```, use the AWS WAFV2 API and see the [[https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html|AWS WAF Developer Guide]]. With the latest version, AWS WAF has a single set of endpoints for regional and global use.
    * The Amazon Kinesis Data Firehose, <code>RedactedFields</code> information, and the web ACL Amazon Resource Name (ARN).
    */
  @js.native
  trait LoggingConfiguration extends js.Object {
    var LogDestinationConfigs: LogDestinationConfigs
    var ResourceArn: ResourceArn
    var RedactedFields: js.UndefOr[RedactedFields]
  }

  object LoggingConfiguration {
    @inline
    def apply(
        LogDestinationConfigs: LogDestinationConfigs,
        ResourceArn: ResourceArn,
        RedactedFields: js.UndefOr[RedactedFields] = js.undefined
    ): LoggingConfiguration = {
      val __obj = js.Dynamic.literal(
        "LogDestinationConfigs" -> LogDestinationConfigs.asInstanceOf[js.Any],
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any]
      )

      RedactedFields.foreach(__v => __obj.updateDynamic("RedactedFields")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LoggingConfiguration]
    }
  }

  @js.native
  sealed trait MatchFieldType extends js.Any
  object MatchFieldType {
    val URI = "URI".asInstanceOf[MatchFieldType]
    val QUERY_STRING = "QUERY_STRING".asInstanceOf[MatchFieldType]
    val HEADER = "HEADER".asInstanceOf[MatchFieldType]
    val METHOD = "METHOD".asInstanceOf[MatchFieldType]
    val BODY = "BODY".asInstanceOf[MatchFieldType]
    val SINGLE_QUERY_ARG = "SINGLE_QUERY_ARG".asInstanceOf[MatchFieldType]
    val ALL_QUERY_ARGS = "ALL_QUERY_ARGS".asInstanceOf[MatchFieldType]

    @inline def values = js.Array(URI, QUERY_STRING, HEADER, METHOD, BODY, SINGLE_QUERY_ARG, ALL_QUERY_ARGS)
  }

  @js.native
  sealed trait PositionalConstraint extends js.Any
  object PositionalConstraint {
    val EXACTLY = "EXACTLY".asInstanceOf[PositionalConstraint]
    val STARTS_WITH = "STARTS_WITH".asInstanceOf[PositionalConstraint]
    val ENDS_WITH = "ENDS_WITH".asInstanceOf[PositionalConstraint]
    val CONTAINS = "CONTAINS".asInstanceOf[PositionalConstraint]
    val CONTAINS_WORD = "CONTAINS_WORD".asInstanceOf[PositionalConstraint]

    @inline def values = js.Array(EXACTLY, STARTS_WITH, ENDS_WITH, CONTAINS, CONTAINS_WORD)
  }

  /** '''Note:'''This is ```AWS WAF Classic``` documentation. For more information, see [[https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html|AWS WAF Classic]] in the developer guide.
    *  ```For the latest version of AWS WAF```, use the AWS WAFV2 API and see the [[https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html|AWS WAF Developer Guide]]. With the latest version, AWS WAF has a single set of endpoints for regional and global use.
    * Specifies the <a>ByteMatchSet</a>, <a>IPSet</a>, <a>SqlInjectionMatchSet</a>, <a>XssMatchSet</a>, <a>RegexMatchSet</a>, <a>GeoMatchSet</a>, and <a>SizeConstraintSet</a> objects that you want to add to a <code>Rule</code> and, for each object, indicates whether you want to negate the settings, for example, requests that do NOT originate from the IP address 192.0.2.44.
    */
  @js.native
  trait Predicate extends js.Object {
    var DataId: ResourceId
    var Negated: Negated
    var Type: PredicateType
  }

  object Predicate {
    @inline
    def apply(
        DataId: ResourceId,
        Negated: Negated,
        Type: PredicateType
    ): Predicate = {
      val __obj = js.Dynamic.literal(
        "DataId" -> DataId.asInstanceOf[js.Any],
        "Negated" -> Negated.asInstanceOf[js.Any],
        "Type" -> Type.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[Predicate]
    }
  }

  @js.native
  sealed trait PredicateType extends js.Any
  object PredicateType {
    val IPMatch = "IPMatch".asInstanceOf[PredicateType]
    val ByteMatch = "ByteMatch".asInstanceOf[PredicateType]
    val SqlInjectionMatch = "SqlInjectionMatch".asInstanceOf[PredicateType]
    val GeoMatch = "GeoMatch".asInstanceOf[PredicateType]
    val SizeConstraint = "SizeConstraint".asInstanceOf[PredicateType]
    val XssMatch = "XssMatch".asInstanceOf[PredicateType]
    val RegexMatch = "RegexMatch".asInstanceOf[PredicateType]

    @inline def values = js.Array(IPMatch, ByteMatch, SqlInjectionMatch, GeoMatch, SizeConstraint, XssMatch, RegexMatch)
  }

  @js.native
  trait PutLoggingConfigurationRequest extends js.Object {
    var LoggingConfiguration: LoggingConfiguration
  }

  object PutLoggingConfigurationRequest {
    @inline
    def apply(
        LoggingConfiguration: LoggingConfiguration
    ): PutLoggingConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "LoggingConfiguration" -> LoggingConfiguration.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[PutLoggingConfigurationRequest]
    }
  }

  @js.native
  trait PutLoggingConfigurationResponse extends js.Object {
    var LoggingConfiguration: js.UndefOr[LoggingConfiguration]
  }

  object PutLoggingConfigurationResponse {
    @inline
    def apply(
        LoggingConfiguration: js.UndefOr[LoggingConfiguration] = js.undefined
    ): PutLoggingConfigurationResponse = {
      val __obj = js.Dynamic.literal()
      LoggingConfiguration.foreach(__v => __obj.updateDynamic("LoggingConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutLoggingConfigurationResponse]
    }
  }

  @js.native
  trait PutPermissionPolicyRequest extends js.Object {
    var Policy: PolicyString
    var ResourceArn: ResourceArn
  }

  object PutPermissionPolicyRequest {
    @inline
    def apply(
        Policy: PolicyString,
        ResourceArn: ResourceArn
    ): PutPermissionPolicyRequest = {
      val __obj = js.Dynamic.literal(
        "Policy" -> Policy.asInstanceOf[js.Any],
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[PutPermissionPolicyRequest]
    }
  }

  @js.native
  trait PutPermissionPolicyResponse extends js.Object {}

  object PutPermissionPolicyResponse {
    @inline
    def apply(
    ): PutPermissionPolicyResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PutPermissionPolicyResponse]
    }
  }

  /** '''Note:'''This is ```AWS WAF Classic``` documentation. For more information, see [[https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html|AWS WAF Classic]] in the developer guide.
    *  ```For the latest version of AWS WAF```, use the AWS WAFV2 API and see the [[https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html|AWS WAF Developer Guide]]. With the latest version, AWS WAF has a single set of endpoints for regional and global use.
    * A <code>RateBasedRule</code> is identical to a regular <a>Rule</a>, with one addition: a <code>RateBasedRule</code> counts the number of requests that arrive from a specified IP address every five minutes. For example, based on recent requests that you've seen from an attacker, you might create a <code>RateBasedRule</code> that includes the following conditions:
    * * The requests come from 192.0.2.44.
    *  * They contain the value <code>BadBot</code> in the <code>User-Agent</code> header.
    * In the rule, you also define the rate limit as 1,000.
    *  Requests that meet both of these conditions and exceed 1,000 requests every five minutes trigger the rule's action (block or count), which is defined in the web ACL.
    */
  @js.native
  trait RateBasedRule extends js.Object {
    var MatchPredicates: Predicates
    var RateKey: RateKey
    var RateLimit: RateLimit
    var RuleId: ResourceId
    var MetricName: js.UndefOr[MetricName]
    var Name: js.UndefOr[ResourceName]
  }

  object RateBasedRule {
    @inline
    def apply(
        MatchPredicates: Predicates,
        RateKey: RateKey,
        RateLimit: RateLimit,
        RuleId: ResourceId,
        MetricName: js.UndefOr[MetricName] = js.undefined,
        Name: js.UndefOr[ResourceName] = js.undefined
    ): RateBasedRule = {
      val __obj = js.Dynamic.literal(
        "MatchPredicates" -> MatchPredicates.asInstanceOf[js.Any],
        "RateKey" -> RateKey.asInstanceOf[js.Any],
        "RateLimit" -> RateLimit.asInstanceOf[js.Any],
        "RuleId" -> RuleId.asInstanceOf[js.Any]
      )

      MetricName.foreach(__v => __obj.updateDynamic("MetricName")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RateBasedRule]
    }
  }

  @js.native
  sealed trait RateKey extends js.Any
  object RateKey {
    val IP = "IP".asInstanceOf[RateKey]

    @inline def values = js.Array(IP)
  }

  /** '''Note:'''This is ```AWS WAF Classic``` documentation. For more information, see [[https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html|AWS WAF Classic]] in the developer guide.
    *  ```For the latest version of AWS WAF```, use the AWS WAFV2 API and see the [[https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html|AWS WAF Developer Guide]]. With the latest version, AWS WAF has a single set of endpoints for regional and global use.
    * In a <a>GetRegexMatchSet</a> request, <code>RegexMatchSet</code> is a complex type that contains the <code>RegexMatchSetId</code> and <code>Name</code> of a <code>RegexMatchSet</code>, and the values that you specified when you updated the <code>RegexMatchSet</code>.
    *  The values are contained in a <code>RegexMatchTuple</code> object, which specify the parts of web requests that you want AWS WAF to inspect and the values that you want AWS WAF to search for. If a <code>RegexMatchSet</code> contains more than one <code>RegexMatchTuple</code> object, a request needs to match the settings in only one <code>ByteMatchTuple</code> to be considered a match.
    */
  @js.native
  trait RegexMatchSet extends js.Object {
    var Name: js.UndefOr[ResourceName]
    var RegexMatchSetId: js.UndefOr[ResourceId]
    var RegexMatchTuples: js.UndefOr[RegexMatchTuples]
  }

  object RegexMatchSet {
    @inline
    def apply(
        Name: js.UndefOr[ResourceName] = js.undefined,
        RegexMatchSetId: js.UndefOr[ResourceId] = js.undefined,
        RegexMatchTuples: js.UndefOr[RegexMatchTuples] = js.undefined
    ): RegexMatchSet = {
      val __obj = js.Dynamic.literal()
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      RegexMatchSetId.foreach(__v => __obj.updateDynamic("RegexMatchSetId")(__v.asInstanceOf[js.Any]))
      RegexMatchTuples.foreach(__v => __obj.updateDynamic("RegexMatchTuples")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RegexMatchSet]
    }
  }

  /** '''Note:'''This is ```AWS WAF Classic``` documentation. For more information, see [[https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html|AWS WAF Classic]] in the developer guide.
    *  ```For the latest version of AWS WAF```, use the AWS WAFV2 API and see the [[https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html|AWS WAF Developer Guide]]. With the latest version, AWS WAF has a single set of endpoints for regional and global use.
    * Returned by <a>ListRegexMatchSets</a>. Each <code>RegexMatchSetSummary</code> object includes the <code>Name</code> and <code>RegexMatchSetId</code> for one <a>RegexMatchSet</a>.
    */
  @js.native
  trait RegexMatchSetSummary extends js.Object {
    var Name: ResourceName
    var RegexMatchSetId: ResourceId
  }

  object RegexMatchSetSummary {
    @inline
    def apply(
        Name: ResourceName,
        RegexMatchSetId: ResourceId
    ): RegexMatchSetSummary = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "RegexMatchSetId" -> RegexMatchSetId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[RegexMatchSetSummary]
    }
  }

  /** '''Note:'''This is ```AWS WAF Classic``` documentation. For more information, see [[https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html|AWS WAF Classic]] in the developer guide.
    *  ```For the latest version of AWS WAF```, use the AWS WAFV2 API and see the [[https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html|AWS WAF Developer Guide]]. With the latest version, AWS WAF has a single set of endpoints for regional and global use.
    * In an <a>UpdateRegexMatchSet</a> request, <code>RegexMatchSetUpdate</code> specifies whether to insert or delete a <a>RegexMatchTuple</a> and includes the settings for the <code>RegexMatchTuple</code>.
    */
  @js.native
  trait RegexMatchSetUpdate extends js.Object {
    var Action: ChangeAction
    var RegexMatchTuple: RegexMatchTuple
  }

  object RegexMatchSetUpdate {
    @inline
    def apply(
        Action: ChangeAction,
        RegexMatchTuple: RegexMatchTuple
    ): RegexMatchSetUpdate = {
      val __obj = js.Dynamic.literal(
        "Action" -> Action.asInstanceOf[js.Any],
        "RegexMatchTuple" -> RegexMatchTuple.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[RegexMatchSetUpdate]
    }
  }

  /** '''Note:'''This is ```AWS WAF Classic``` documentation. For more information, see [[https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html|AWS WAF Classic]] in the developer guide.
    *  ```For the latest version of AWS WAF```, use the AWS WAFV2 API and see the [[https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html|AWS WAF Developer Guide]]. With the latest version, AWS WAF has a single set of endpoints for regional and global use.
    * The regular expression pattern that you want AWS WAF to search for in web requests, the location in requests that you want AWS WAF to search, and other settings. Each <code>RegexMatchTuple</code> object contains:
    * * The part of a web request that you want AWS WAF to inspect, such as a query string or the value of the <code>User-Agent</code> header.
    *  * The identifier of the pattern (a regular expression) that you want AWS WAF to look for. For more information, see <a>RegexPatternSet</a>.
    *  * Whether to perform any conversions on the request, such as converting it to lowercase, before inspecting it for the specified string.
    */
  @js.native
  trait RegexMatchTuple extends js.Object {
    var FieldToMatch: FieldToMatch
    var RegexPatternSetId: ResourceId
    var TextTransformation: TextTransformation
  }

  object RegexMatchTuple {
    @inline
    def apply(
        FieldToMatch: FieldToMatch,
        RegexPatternSetId: ResourceId,
        TextTransformation: TextTransformation
    ): RegexMatchTuple = {
      val __obj = js.Dynamic.literal(
        "FieldToMatch" -> FieldToMatch.asInstanceOf[js.Any],
        "RegexPatternSetId" -> RegexPatternSetId.asInstanceOf[js.Any],
        "TextTransformation" -> TextTransformation.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[RegexMatchTuple]
    }
  }

  /** '''Note:'''This is ```AWS WAF Classic``` documentation. For more information, see [[https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html|AWS WAF Classic]] in the developer guide.
    *  ```For the latest version of AWS WAF```, use the AWS WAFV2 API and see the [[https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html|AWS WAF Developer Guide]]. With the latest version, AWS WAF has a single set of endpoints for regional and global use.
    * The <code>RegexPatternSet</code> specifies the regular expression (regex) pattern that you want AWS WAF to search for, such as <code>B[a@]dB[o0]t</code>. You can then configure AWS WAF to reject those requests.
    */
  @js.native
  trait RegexPatternSet extends js.Object {
    var RegexPatternSetId: ResourceId
    var RegexPatternStrings: RegexPatternStrings
    var Name: js.UndefOr[ResourceName]
  }

  object RegexPatternSet {
    @inline
    def apply(
        RegexPatternSetId: ResourceId,
        RegexPatternStrings: RegexPatternStrings,
        Name: js.UndefOr[ResourceName] = js.undefined
    ): RegexPatternSet = {
      val __obj = js.Dynamic.literal(
        "RegexPatternSetId" -> RegexPatternSetId.asInstanceOf[js.Any],
        "RegexPatternStrings" -> RegexPatternStrings.asInstanceOf[js.Any]
      )

      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RegexPatternSet]
    }
  }

  /** '''Note:'''This is ```AWS WAF Classic``` documentation. For more information, see [[https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html|AWS WAF Classic]] in the developer guide.
    *  ```For the latest version of AWS WAF```, use the AWS WAFV2 API and see the [[https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html|AWS WAF Developer Guide]]. With the latest version, AWS WAF has a single set of endpoints for regional and global use.
    * Returned by <a>ListRegexPatternSets</a>. Each <code>RegexPatternSetSummary</code> object includes the <code>Name</code> and <code>RegexPatternSetId</code> for one <a>RegexPatternSet</a>.
    */
  @js.native
  trait RegexPatternSetSummary extends js.Object {
    var Name: ResourceName
    var RegexPatternSetId: ResourceId
  }

  object RegexPatternSetSummary {
    @inline
    def apply(
        Name: ResourceName,
        RegexPatternSetId: ResourceId
    ): RegexPatternSetSummary = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "RegexPatternSetId" -> RegexPatternSetId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[RegexPatternSetSummary]
    }
  }

  /** '''Note:'''This is ```AWS WAF Classic``` documentation. For more information, see [[https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html|AWS WAF Classic]] in the developer guide.
    *  ```For the latest version of AWS WAF```, use the AWS WAFV2 API and see the [[https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html|AWS WAF Developer Guide]]. With the latest version, AWS WAF has a single set of endpoints for regional and global use.
    * In an <a>UpdateRegexPatternSet</a> request, <code>RegexPatternSetUpdate</code> specifies whether to insert or delete a <code>RegexPatternString</code> and includes the settings for the <code>RegexPatternString</code>.
    */
  @js.native
  trait RegexPatternSetUpdate extends js.Object {
    var Action: ChangeAction
    var RegexPatternString: RegexPatternString
  }

  object RegexPatternSetUpdate {
    @inline
    def apply(
        Action: ChangeAction,
        RegexPatternString: RegexPatternString
    ): RegexPatternSetUpdate = {
      val __obj = js.Dynamic.literal(
        "Action" -> Action.asInstanceOf[js.Any],
        "RegexPatternString" -> RegexPatternString.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[RegexPatternSetUpdate]
    }
  }

  /** '''Note:'''This is ```AWS WAF Classic``` documentation. For more information, see [[https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html|AWS WAF Classic]] in the developer guide.
    *  ```For the latest version of AWS WAF```, use the AWS WAFV2 API and see the [[https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html|AWS WAF Developer Guide]]. With the latest version, AWS WAF has a single set of endpoints for regional and global use.
    * A combination of <a>ByteMatchSet</a>, <a>IPSet</a>, and/or <a>SqlInjectionMatchSet</a> objects that identify the web requests that you want to allow, block, or count. For example, you might create a <code>Rule</code> that includes the following predicates:
    * * An <code>IPSet</code> that causes AWS WAF to search for web requests that originate from the IP address <code>192.0.2.44</code>
    *  * A <code>ByteMatchSet</code> that causes AWS WAF to search for web requests for which the value of the <code>User-Agent</code> header is <code>BadBot</code>.
    * To match the settings in this <code>Rule</code>, a request must originate from <code>192.0.2.44</code> AND include a <code>User-Agent</code> header for which the value is <code>BadBot</code>.
    */
  @js.native
  trait Rule extends js.Object {
    var Predicates: Predicates
    var RuleId: ResourceId
    var MetricName: js.UndefOr[MetricName]
    var Name: js.UndefOr[ResourceName]
  }

  object Rule {
    @inline
    def apply(
        Predicates: Predicates,
        RuleId: ResourceId,
        MetricName: js.UndefOr[MetricName] = js.undefined,
        Name: js.UndefOr[ResourceName] = js.undefined
    ): Rule = {
      val __obj = js.Dynamic.literal(
        "Predicates" -> Predicates.asInstanceOf[js.Any],
        "RuleId" -> RuleId.asInstanceOf[js.Any]
      )

      MetricName.foreach(__v => __obj.updateDynamic("MetricName")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Rule]
    }
  }

  /** '''Note:'''This is ```AWS WAF Classic``` documentation. For more information, see [[https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html|AWS WAF Classic]] in the developer guide.
    *  ```For the latest version of AWS WAF```, use the AWS WAFV2 API and see the [[https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html|AWS WAF Developer Guide]]. With the latest version, AWS WAF has a single set of endpoints for regional and global use.
    * A collection of predefined rules that you can add to a web ACL.
    *  Rule groups are subject to the following limits:
    * * Three rule groups per account. You can request an increase to this limit by contacting customer support.
    *  * One rule group per web ACL.
    *  * Ten rules per rule group.
    */
  @js.native
  trait RuleGroup extends js.Object {
    var RuleGroupId: ResourceId
    var MetricName: js.UndefOr[MetricName]
    var Name: js.UndefOr[ResourceName]
  }

  object RuleGroup {
    @inline
    def apply(
        RuleGroupId: ResourceId,
        MetricName: js.UndefOr[MetricName] = js.undefined,
        Name: js.UndefOr[ResourceName] = js.undefined
    ): RuleGroup = {
      val __obj = js.Dynamic.literal(
        "RuleGroupId" -> RuleGroupId.asInstanceOf[js.Any]
      )

      MetricName.foreach(__v => __obj.updateDynamic("MetricName")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RuleGroup]
    }
  }

  /** '''Note:'''This is ```AWS WAF Classic``` documentation. For more information, see [[https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html|AWS WAF Classic]] in the developer guide.
    *  ```For the latest version of AWS WAF```, use the AWS WAFV2 API and see the [[https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html|AWS WAF Developer Guide]]. With the latest version, AWS WAF has a single set of endpoints for regional and global use.
    * Contains the identifier and the friendly name or description of the <code>RuleGroup</code>.
    */
  @js.native
  trait RuleGroupSummary extends js.Object {
    var Name: ResourceName
    var RuleGroupId: ResourceId
  }

  object RuleGroupSummary {
    @inline
    def apply(
        Name: ResourceName,
        RuleGroupId: ResourceId
    ): RuleGroupSummary = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "RuleGroupId" -> RuleGroupId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[RuleGroupSummary]
    }
  }

  /** '''Note:'''This is ```AWS WAF Classic``` documentation. For more information, see [[https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html|AWS WAF Classic]] in the developer guide.
    *  ```For the latest version of AWS WAF```, use the AWS WAFV2 API and see the [[https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html|AWS WAF Developer Guide]]. With the latest version, AWS WAF has a single set of endpoints for regional and global use.
    * Specifies an <code>ActivatedRule</code> and indicates whether you want to add it to a <code>RuleGroup</code> or delete it from a <code>RuleGroup</code>.
    */
  @js.native
  trait RuleGroupUpdate extends js.Object {
    var Action: ChangeAction
    var ActivatedRule: ActivatedRule
  }

  object RuleGroupUpdate {
    @inline
    def apply(
        Action: ChangeAction,
        ActivatedRule: ActivatedRule
    ): RuleGroupUpdate = {
      val __obj = js.Dynamic.literal(
        "Action" -> Action.asInstanceOf[js.Any],
        "ActivatedRule" -> ActivatedRule.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[RuleGroupUpdate]
    }
  }

  /** '''Note:'''This is ```AWS WAF Classic``` documentation. For more information, see [[https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html|AWS WAF Classic]] in the developer guide.
    *  ```For the latest version of AWS WAF```, use the AWS WAFV2 API and see the [[https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html|AWS WAF Developer Guide]]. With the latest version, AWS WAF has a single set of endpoints for regional and global use.
    * Contains the identifier and the friendly name or description of the <code>Rule</code>.
    */
  @js.native
  trait RuleSummary extends js.Object {
    var Name: ResourceName
    var RuleId: ResourceId
  }

  object RuleSummary {
    @inline
    def apply(
        Name: ResourceName,
        RuleId: ResourceId
    ): RuleSummary = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "RuleId" -> RuleId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[RuleSummary]
    }
  }

  /** '''Note:'''This is ```AWS WAF Classic``` documentation. For more information, see [[https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html|AWS WAF Classic]] in the developer guide.
    *  ```For the latest version of AWS WAF```, use the AWS WAFV2 API and see the [[https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html|AWS WAF Developer Guide]]. With the latest version, AWS WAF has a single set of endpoints for regional and global use.
    * Specifies a <code>Predicate</code> (such as an <code>IPSet</code>) and indicates whether you want to add it to a <code>Rule</code> or delete it from a <code>Rule</code>.
    */
  @js.native
  trait RuleUpdate extends js.Object {
    var Action: ChangeAction
    var Predicate: Predicate
  }

  object RuleUpdate {
    @inline
    def apply(
        Action: ChangeAction,
        Predicate: Predicate
    ): RuleUpdate = {
      val __obj = js.Dynamic.literal(
        "Action" -> Action.asInstanceOf[js.Any],
        "Predicate" -> Predicate.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[RuleUpdate]
    }
  }

  /** '''Note:'''This is ```AWS WAF Classic``` documentation. For more information, see [[https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html|AWS WAF Classic]] in the developer guide.
    *  ```For the latest version of AWS WAF```, use the AWS WAFV2 API and see the [[https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html|AWS WAF Developer Guide]]. With the latest version, AWS WAF has a single set of endpoints for regional and global use.
    * The response from a <a>GetSampledRequests</a> request includes a <code>SampledHTTPRequests</code> complex type that appears as <code>SampledRequests</code> in the response syntax. <code>SampledHTTPRequests</code> contains one <code>SampledHTTPRequest</code> object for each web request that is returned by <code>GetSampledRequests</code>.
    */
  @js.native
  trait SampledHTTPRequest extends js.Object {
    var Request: HTTPRequest
    var Weight: SampleWeight
    var Action: js.UndefOr[Action]
    var RuleWithinRuleGroup: js.UndefOr[ResourceId]
    var Timestamp: js.UndefOr[Timestamp]
  }

  object SampledHTTPRequest {
    @inline
    def apply(
        Request: HTTPRequest,
        Weight: SampleWeight,
        Action: js.UndefOr[Action] = js.undefined,
        RuleWithinRuleGroup: js.UndefOr[ResourceId] = js.undefined,
        Timestamp: js.UndefOr[Timestamp] = js.undefined
    ): SampledHTTPRequest = {
      val __obj = js.Dynamic.literal(
        "Request" -> Request.asInstanceOf[js.Any],
        "Weight" -> Weight.asInstanceOf[js.Any]
      )

      Action.foreach(__v => __obj.updateDynamic("Action")(__v.asInstanceOf[js.Any]))
      RuleWithinRuleGroup.foreach(__v => __obj.updateDynamic("RuleWithinRuleGroup")(__v.asInstanceOf[js.Any]))
      Timestamp.foreach(__v => __obj.updateDynamic("Timestamp")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SampledHTTPRequest]
    }
  }

  /** '''Note:'''This is ```AWS WAF Classic``` documentation. For more information, see [[https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html|AWS WAF Classic]] in the developer guide.
    *  ```For the latest version of AWS WAF```, use the AWS WAFV2 API and see the [[https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html|AWS WAF Developer Guide]]. With the latest version, AWS WAF has a single set of endpoints for regional and global use.
    * Specifies a constraint on the size of a part of the web request. AWS WAF uses the <code>Size</code>, <code>ComparisonOperator</code>, and <code>FieldToMatch</code> to build an expression in the form of "<code>Size</code> <code>ComparisonOperator</code> size in bytes of <code>FieldToMatch</code>". If that expression is true, the <code>SizeConstraint</code> is considered to match.
    */
  @js.native
  trait SizeConstraint extends js.Object {
    var ComparisonOperator: ComparisonOperator
    var FieldToMatch: FieldToMatch
    var Size: Size
    var TextTransformation: TextTransformation
  }

  object SizeConstraint {
    @inline
    def apply(
        ComparisonOperator: ComparisonOperator,
        FieldToMatch: FieldToMatch,
        Size: Size,
        TextTransformation: TextTransformation
    ): SizeConstraint = {
      val __obj = js.Dynamic.literal(
        "ComparisonOperator" -> ComparisonOperator.asInstanceOf[js.Any],
        "FieldToMatch" -> FieldToMatch.asInstanceOf[js.Any],
        "Size" -> Size.asInstanceOf[js.Any],
        "TextTransformation" -> TextTransformation.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[SizeConstraint]
    }
  }

  /** '''Note:'''This is ```AWS WAF Classic``` documentation. For more information, see [[https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html|AWS WAF Classic]] in the developer guide.
    *  ```For the latest version of AWS WAF```, use the AWS WAFV2 API and see the [[https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html|AWS WAF Developer Guide]]. With the latest version, AWS WAF has a single set of endpoints for regional and global use.
    * A complex type that contains <code>SizeConstraint</code> objects, which specify the parts of web requests that you want AWS WAF to inspect the size of. If a <code>SizeConstraintSet</code> contains more than one <code>SizeConstraint</code> object, a request only needs to match one constraint to be considered a match.
    */
  @js.native
  trait SizeConstraintSet extends js.Object {
    var SizeConstraintSetId: ResourceId
    var SizeConstraints: SizeConstraints
    var Name: js.UndefOr[ResourceName]
  }

  object SizeConstraintSet {
    @inline
    def apply(
        SizeConstraintSetId: ResourceId,
        SizeConstraints: SizeConstraints,
        Name: js.UndefOr[ResourceName] = js.undefined
    ): SizeConstraintSet = {
      val __obj = js.Dynamic.literal(
        "SizeConstraintSetId" -> SizeConstraintSetId.asInstanceOf[js.Any],
        "SizeConstraints" -> SizeConstraints.asInstanceOf[js.Any]
      )

      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SizeConstraintSet]
    }
  }

  /** '''Note:'''This is ```AWS WAF Classic``` documentation. For more information, see [[https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html|AWS WAF Classic]] in the developer guide.
    *  ```For the latest version of AWS WAF```, use the AWS WAFV2 API and see the [[https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html|AWS WAF Developer Guide]]. With the latest version, AWS WAF has a single set of endpoints for regional and global use.
    * The <code>Id</code> and <code>Name</code> of a <code>SizeConstraintSet</code>.
    */
  @js.native
  trait SizeConstraintSetSummary extends js.Object {
    var Name: ResourceName
    var SizeConstraintSetId: ResourceId
  }

  object SizeConstraintSetSummary {
    @inline
    def apply(
        Name: ResourceName,
        SizeConstraintSetId: ResourceId
    ): SizeConstraintSetSummary = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "SizeConstraintSetId" -> SizeConstraintSetId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[SizeConstraintSetSummary]
    }
  }

  /** '''Note:'''This is ```AWS WAF Classic``` documentation. For more information, see [[https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html|AWS WAF Classic]] in the developer guide.
    *  ```For the latest version of AWS WAF```, use the AWS WAFV2 API and see the [[https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html|AWS WAF Developer Guide]]. With the latest version, AWS WAF has a single set of endpoints for regional and global use.
    * Specifies the part of a web request that you want to inspect the size of and indicates whether you want to add the specification to a <a>SizeConstraintSet</a> or delete it from a <code>SizeConstraintSet</code>.
    */
  @js.native
  trait SizeConstraintSetUpdate extends js.Object {
    var Action: ChangeAction
    var SizeConstraint: SizeConstraint
  }

  object SizeConstraintSetUpdate {
    @inline
    def apply(
        Action: ChangeAction,
        SizeConstraint: SizeConstraint
    ): SizeConstraintSetUpdate = {
      val __obj = js.Dynamic.literal(
        "Action" -> Action.asInstanceOf[js.Any],
        "SizeConstraint" -> SizeConstraint.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[SizeConstraintSetUpdate]
    }
  }

  /** '''Note:'''This is ```AWS WAF Classic``` documentation. For more information, see [[https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html|AWS WAF Classic]] in the developer guide.
    *  ```For the latest version of AWS WAF```, use the AWS WAFV2 API and see the [[https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html|AWS WAF Developer Guide]]. With the latest version, AWS WAF has a single set of endpoints for regional and global use.
    * A complex type that contains <code>SqlInjectionMatchTuple</code> objects, which specify the parts of web requests that you want AWS WAF to inspect for snippets of malicious SQL code and, if you want AWS WAF to inspect a header, the name of the header. If a <code>SqlInjectionMatchSet</code> contains more than one <code>SqlInjectionMatchTuple</code> object, a request needs to include snippets of SQL code in only one of the specified parts of the request to be considered a match.
    */
  @js.native
  trait SqlInjectionMatchSet extends js.Object {
    var SqlInjectionMatchSetId: ResourceId
    var SqlInjectionMatchTuples: SqlInjectionMatchTuples
    var Name: js.UndefOr[ResourceName]
  }

  object SqlInjectionMatchSet {
    @inline
    def apply(
        SqlInjectionMatchSetId: ResourceId,
        SqlInjectionMatchTuples: SqlInjectionMatchTuples,
        Name: js.UndefOr[ResourceName] = js.undefined
    ): SqlInjectionMatchSet = {
      val __obj = js.Dynamic.literal(
        "SqlInjectionMatchSetId" -> SqlInjectionMatchSetId.asInstanceOf[js.Any],
        "SqlInjectionMatchTuples" -> SqlInjectionMatchTuples.asInstanceOf[js.Any]
      )

      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SqlInjectionMatchSet]
    }
  }

  /** '''Note:'''This is ```AWS WAF Classic``` documentation. For more information, see [[https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html|AWS WAF Classic]] in the developer guide.
    *  ```For the latest version of AWS WAF```, use the AWS WAFV2 API and see the [[https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html|AWS WAF Developer Guide]]. With the latest version, AWS WAF has a single set of endpoints for regional and global use.
    * The <code>Id</code> and <code>Name</code> of a <code>SqlInjectionMatchSet</code>.
    */
  @js.native
  trait SqlInjectionMatchSetSummary extends js.Object {
    var Name: ResourceName
    var SqlInjectionMatchSetId: ResourceId
  }

  object SqlInjectionMatchSetSummary {
    @inline
    def apply(
        Name: ResourceName,
        SqlInjectionMatchSetId: ResourceId
    ): SqlInjectionMatchSetSummary = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "SqlInjectionMatchSetId" -> SqlInjectionMatchSetId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[SqlInjectionMatchSetSummary]
    }
  }

  /** '''Note:'''This is ```AWS WAF Classic``` documentation. For more information, see [[https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html|AWS WAF Classic]] in the developer guide.
    *  ```For the latest version of AWS WAF```, use the AWS WAFV2 API and see the [[https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html|AWS WAF Developer Guide]]. With the latest version, AWS WAF has a single set of endpoints for regional and global use.
    * Specifies the part of a web request that you want to inspect for snippets of malicious SQL code and indicates whether you want to add the specification to a <a>SqlInjectionMatchSet</a> or delete it from a <code>SqlInjectionMatchSet</code>.
    */
  @js.native
  trait SqlInjectionMatchSetUpdate extends js.Object {
    var Action: ChangeAction
    var SqlInjectionMatchTuple: SqlInjectionMatchTuple
  }

  object SqlInjectionMatchSetUpdate {
    @inline
    def apply(
        Action: ChangeAction,
        SqlInjectionMatchTuple: SqlInjectionMatchTuple
    ): SqlInjectionMatchSetUpdate = {
      val __obj = js.Dynamic.literal(
        "Action" -> Action.asInstanceOf[js.Any],
        "SqlInjectionMatchTuple" -> SqlInjectionMatchTuple.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[SqlInjectionMatchSetUpdate]
    }
  }

  /** '''Note:'''This is ```AWS WAF Classic``` documentation. For more information, see [[https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html|AWS WAF Classic]] in the developer guide.
    *  ```For the latest version of AWS WAF```, use the AWS WAFV2 API and see the [[https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html|AWS WAF Developer Guide]]. With the latest version, AWS WAF has a single set of endpoints for regional and global use.
    * Specifies the part of a web request that you want AWS WAF to inspect for snippets of malicious SQL code and, if you want AWS WAF to inspect a header, the name of the header.
    */
  @js.native
  trait SqlInjectionMatchTuple extends js.Object {
    var FieldToMatch: FieldToMatch
    var TextTransformation: TextTransformation
  }

  object SqlInjectionMatchTuple {
    @inline
    def apply(
        FieldToMatch: FieldToMatch,
        TextTransformation: TextTransformation
    ): SqlInjectionMatchTuple = {
      val __obj = js.Dynamic.literal(
        "FieldToMatch" -> FieldToMatch.asInstanceOf[js.Any],
        "TextTransformation" -> TextTransformation.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[SqlInjectionMatchTuple]
    }
  }

  /** '''Note:'''This is ```AWS WAF Classic``` documentation. For more information, see [[https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html|AWS WAF Classic]] in the developer guide.
    *  ```For the latest version of AWS WAF```, use the AWS WAFV2 API and see the [[https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html|AWS WAF Developer Guide]]. With the latest version, AWS WAF has a single set of endpoints for regional and global use.
    * A summary of the rule groups you are subscribed to.
    */
  @js.native
  trait SubscribedRuleGroupSummary extends js.Object {
    var MetricName: MetricName
    var Name: ResourceName
    var RuleGroupId: ResourceId
  }

  object SubscribedRuleGroupSummary {
    @inline
    def apply(
        MetricName: MetricName,
        Name: ResourceName,
        RuleGroupId: ResourceId
    ): SubscribedRuleGroupSummary = {
      val __obj = js.Dynamic.literal(
        "MetricName" -> MetricName.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
        "RuleGroupId" -> RuleGroupId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[SubscribedRuleGroupSummary]
    }
  }

  /** '''Note:'''This is ```AWS WAF Classic``` documentation. For more information, see [[https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html|AWS WAF Classic]] in the developer guide.
    *  ```For the latest version of AWS WAF```, use the AWS WAFV2 API and see the [[https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html|AWS WAF Developer Guide]]. With the latest version, AWS WAF has a single set of endpoints for regional and global use.
    * A tag associated with an AWS resource. Tags are key:value pairs that you can use to categorize and manage your resources, for purposes like billing. For example, you might set the tag key to "customer" and the value to the customer name or ID. You can specify one or more tags to add to each AWS resource, up to 50 tags for a resource.
    *  Tagging is only available through the API, SDKs, and CLI. You can't manage or view tags through the AWS WAF Classic console. You can tag the AWS resources that you manage through AWS WAF Classic: web ACLs, rule groups, and rules.
    */
  @js.native
  trait Tag extends js.Object {
    var Key: TagKey
    var Value: TagValue
  }

  object Tag {
    @inline
    def apply(
        Key: TagKey,
        Value: TagValue
    ): Tag = {
      val __obj = js.Dynamic.literal(
        "Key" -> Key.asInstanceOf[js.Any],
        "Value" -> Value.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[Tag]
    }
  }

  /** '''Note:'''This is ```AWS WAF Classic``` documentation. For more information, see [[https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html|AWS WAF Classic]] in the developer guide.
    *  ```For the latest version of AWS WAF```, use the AWS WAFV2 API and see the [[https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html|AWS WAF Developer Guide]]. With the latest version, AWS WAF has a single set of endpoints for regional and global use.
    * Information for a tag associated with an AWS resource. Tags are key:value pairs that you can use to categorize and manage your resources, for purposes like billing. For example, you might set the tag key to "customer" and the value to the customer name or ID. You can specify one or more tags to add to each AWS resource, up to 50 tags for a resource.
    *  Tagging is only available through the API, SDKs, and CLI. You can't manage or view tags through the AWS WAF Classic console. You can tag the AWS resources that you manage through AWS WAF Classic: web ACLs, rule groups, and rules.
    */
  @js.native
  trait TagInfoForResource extends js.Object {
    var ResourceARN: js.UndefOr[ResourceArn]
    var TagList: js.UndefOr[TagList]
  }

  object TagInfoForResource {
    @inline
    def apply(
        ResourceARN: js.UndefOr[ResourceArn] = js.undefined,
        TagList: js.UndefOr[TagList] = js.undefined
    ): TagInfoForResource = {
      val __obj = js.Dynamic.literal()
      ResourceARN.foreach(__v => __obj.updateDynamic("ResourceARN")(__v.asInstanceOf[js.Any]))
      TagList.foreach(__v => __obj.updateDynamic("TagList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TagInfoForResource]
    }
  }

  @js.native
  trait TagResourceRequest extends js.Object {
    var ResourceARN: ResourceArn
    var Tags: TagList
  }

  object TagResourceRequest {
    @inline
    def apply(
        ResourceARN: ResourceArn,
        Tags: TagList
    ): TagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceARN" -> ResourceARN.asInstanceOf[js.Any],
        "Tags" -> Tags.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[TagResourceRequest]
    }
  }

  @js.native
  trait TagResourceResponse extends js.Object {}

  object TagResourceResponse {
    @inline
    def apply(
    ): TagResourceResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TagResourceResponse]
    }
  }

  @js.native
  sealed trait TextTransformation extends js.Any
  object TextTransformation {
    val NONE = "NONE".asInstanceOf[TextTransformation]
    val COMPRESS_WHITE_SPACE = "COMPRESS_WHITE_SPACE".asInstanceOf[TextTransformation]
    val HTML_ENTITY_DECODE = "HTML_ENTITY_DECODE".asInstanceOf[TextTransformation]
    val LOWERCASE = "LOWERCASE".asInstanceOf[TextTransformation]
    val CMD_LINE = "CMD_LINE".asInstanceOf[TextTransformation]
    val URL_DECODE = "URL_DECODE".asInstanceOf[TextTransformation]

    @inline def values = js.Array(NONE, COMPRESS_WHITE_SPACE, HTML_ENTITY_DECODE, LOWERCASE, CMD_LINE, URL_DECODE)
  }

  /** '''Note:'''This is ```AWS WAF Classic``` documentation. For more information, see [[https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html|AWS WAF Classic]] in the developer guide.
    *  ```For the latest version of AWS WAF```, use the AWS WAFV2 API and see the [[https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html|AWS WAF Developer Guide]]. With the latest version, AWS WAF has a single set of endpoints for regional and global use.
    * In a <a>GetSampledRequests</a> request, the <code>StartTime</code> and <code>EndTime</code> objects specify the time range for which you want AWS WAF to return a sample of web requests.
    *  You must specify the times in Coordinated Universal Time (UTC) format. UTC format includes the special designator, <code>Z</code>. For example, <code>"2016-09-27T14:50Z"</code>.
    *  In a <a>GetSampledRequests</a> response, the <code>StartTime</code> and <code>EndTime</code> objects specify the time range for which AWS WAF actually returned a sample of web requests. AWS WAF gets the specified number of requests from among the first 5,000 requests that your AWS resource receives during the specified time period. If your resource receives more than 5,000 requests during that period, AWS WAF stops sampling after the 5,000th request. In that case, <code>EndTime</code> is the time that AWS WAF received the 5,000th request.
    */
  @js.native
  trait TimeWindow extends js.Object {
    var EndTime: Timestamp
    var StartTime: Timestamp
  }

  object TimeWindow {
    @inline
    def apply(
        EndTime: Timestamp,
        StartTime: Timestamp
    ): TimeWindow = {
      val __obj = js.Dynamic.literal(
        "EndTime" -> EndTime.asInstanceOf[js.Any],
        "StartTime" -> StartTime.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[TimeWindow]
    }
  }

  @js.native
  trait UntagResourceRequest extends js.Object {
    var ResourceARN: ResourceArn
    var TagKeys: TagKeyList
  }

  object UntagResourceRequest {
    @inline
    def apply(
        ResourceARN: ResourceArn,
        TagKeys: TagKeyList
    ): UntagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceARN" -> ResourceARN.asInstanceOf[js.Any],
        "TagKeys" -> TagKeys.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UntagResourceRequest]
    }
  }

  @js.native
  trait UntagResourceResponse extends js.Object {}

  object UntagResourceResponse {
    @inline
    def apply(
    ): UntagResourceResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UntagResourceResponse]
    }
  }

  @js.native
  trait UpdateByteMatchSetRequest extends js.Object {
    var ByteMatchSetId: ResourceId
    var ChangeToken: ChangeToken
    var Updates: ByteMatchSetUpdates
  }

  object UpdateByteMatchSetRequest {
    @inline
    def apply(
        ByteMatchSetId: ResourceId,
        ChangeToken: ChangeToken,
        Updates: ByteMatchSetUpdates
    ): UpdateByteMatchSetRequest = {
      val __obj = js.Dynamic.literal(
        "ByteMatchSetId" -> ByteMatchSetId.asInstanceOf[js.Any],
        "ChangeToken" -> ChangeToken.asInstanceOf[js.Any],
        "Updates" -> Updates.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateByteMatchSetRequest]
    }
  }

  @js.native
  trait UpdateByteMatchSetResponse extends js.Object {
    var ChangeToken: js.UndefOr[ChangeToken]
  }

  object UpdateByteMatchSetResponse {
    @inline
    def apply(
        ChangeToken: js.UndefOr[ChangeToken] = js.undefined
    ): UpdateByteMatchSetResponse = {
      val __obj = js.Dynamic.literal()
      ChangeToken.foreach(__v => __obj.updateDynamic("ChangeToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateByteMatchSetResponse]
    }
  }

  @js.native
  trait UpdateGeoMatchSetRequest extends js.Object {
    var ChangeToken: ChangeToken
    var GeoMatchSetId: ResourceId
    var Updates: GeoMatchSetUpdates
  }

  object UpdateGeoMatchSetRequest {
    @inline
    def apply(
        ChangeToken: ChangeToken,
        GeoMatchSetId: ResourceId,
        Updates: GeoMatchSetUpdates
    ): UpdateGeoMatchSetRequest = {
      val __obj = js.Dynamic.literal(
        "ChangeToken" -> ChangeToken.asInstanceOf[js.Any],
        "GeoMatchSetId" -> GeoMatchSetId.asInstanceOf[js.Any],
        "Updates" -> Updates.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateGeoMatchSetRequest]
    }
  }

  @js.native
  trait UpdateGeoMatchSetResponse extends js.Object {
    var ChangeToken: js.UndefOr[ChangeToken]
  }

  object UpdateGeoMatchSetResponse {
    @inline
    def apply(
        ChangeToken: js.UndefOr[ChangeToken] = js.undefined
    ): UpdateGeoMatchSetResponse = {
      val __obj = js.Dynamic.literal()
      ChangeToken.foreach(__v => __obj.updateDynamic("ChangeToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateGeoMatchSetResponse]
    }
  }

  @js.native
  trait UpdateIPSetRequest extends js.Object {
    var ChangeToken: ChangeToken
    var IPSetId: ResourceId
    var Updates: IPSetUpdates
  }

  object UpdateIPSetRequest {
    @inline
    def apply(
        ChangeToken: ChangeToken,
        IPSetId: ResourceId,
        Updates: IPSetUpdates
    ): UpdateIPSetRequest = {
      val __obj = js.Dynamic.literal(
        "ChangeToken" -> ChangeToken.asInstanceOf[js.Any],
        "IPSetId" -> IPSetId.asInstanceOf[js.Any],
        "Updates" -> Updates.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateIPSetRequest]
    }
  }

  @js.native
  trait UpdateIPSetResponse extends js.Object {
    var ChangeToken: js.UndefOr[ChangeToken]
  }

  object UpdateIPSetResponse {
    @inline
    def apply(
        ChangeToken: js.UndefOr[ChangeToken] = js.undefined
    ): UpdateIPSetResponse = {
      val __obj = js.Dynamic.literal()
      ChangeToken.foreach(__v => __obj.updateDynamic("ChangeToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateIPSetResponse]
    }
  }

  @js.native
  trait UpdateRateBasedRuleRequest extends js.Object {
    var ChangeToken: ChangeToken
    var RateLimit: RateLimit
    var RuleId: ResourceId
    var Updates: RuleUpdates
  }

  object UpdateRateBasedRuleRequest {
    @inline
    def apply(
        ChangeToken: ChangeToken,
        RateLimit: RateLimit,
        RuleId: ResourceId,
        Updates: RuleUpdates
    ): UpdateRateBasedRuleRequest = {
      val __obj = js.Dynamic.literal(
        "ChangeToken" -> ChangeToken.asInstanceOf[js.Any],
        "RateLimit" -> RateLimit.asInstanceOf[js.Any],
        "RuleId" -> RuleId.asInstanceOf[js.Any],
        "Updates" -> Updates.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateRateBasedRuleRequest]
    }
  }

  @js.native
  trait UpdateRateBasedRuleResponse extends js.Object {
    var ChangeToken: js.UndefOr[ChangeToken]
  }

  object UpdateRateBasedRuleResponse {
    @inline
    def apply(
        ChangeToken: js.UndefOr[ChangeToken] = js.undefined
    ): UpdateRateBasedRuleResponse = {
      val __obj = js.Dynamic.literal()
      ChangeToken.foreach(__v => __obj.updateDynamic("ChangeToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateRateBasedRuleResponse]
    }
  }

  @js.native
  trait UpdateRegexMatchSetRequest extends js.Object {
    var ChangeToken: ChangeToken
    var RegexMatchSetId: ResourceId
    var Updates: RegexMatchSetUpdates
  }

  object UpdateRegexMatchSetRequest {
    @inline
    def apply(
        ChangeToken: ChangeToken,
        RegexMatchSetId: ResourceId,
        Updates: RegexMatchSetUpdates
    ): UpdateRegexMatchSetRequest = {
      val __obj = js.Dynamic.literal(
        "ChangeToken" -> ChangeToken.asInstanceOf[js.Any],
        "RegexMatchSetId" -> RegexMatchSetId.asInstanceOf[js.Any],
        "Updates" -> Updates.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateRegexMatchSetRequest]
    }
  }

  @js.native
  trait UpdateRegexMatchSetResponse extends js.Object {
    var ChangeToken: js.UndefOr[ChangeToken]
  }

  object UpdateRegexMatchSetResponse {
    @inline
    def apply(
        ChangeToken: js.UndefOr[ChangeToken] = js.undefined
    ): UpdateRegexMatchSetResponse = {
      val __obj = js.Dynamic.literal()
      ChangeToken.foreach(__v => __obj.updateDynamic("ChangeToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateRegexMatchSetResponse]
    }
  }

  @js.native
  trait UpdateRegexPatternSetRequest extends js.Object {
    var ChangeToken: ChangeToken
    var RegexPatternSetId: ResourceId
    var Updates: RegexPatternSetUpdates
  }

  object UpdateRegexPatternSetRequest {
    @inline
    def apply(
        ChangeToken: ChangeToken,
        RegexPatternSetId: ResourceId,
        Updates: RegexPatternSetUpdates
    ): UpdateRegexPatternSetRequest = {
      val __obj = js.Dynamic.literal(
        "ChangeToken" -> ChangeToken.asInstanceOf[js.Any],
        "RegexPatternSetId" -> RegexPatternSetId.asInstanceOf[js.Any],
        "Updates" -> Updates.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateRegexPatternSetRequest]
    }
  }

  @js.native
  trait UpdateRegexPatternSetResponse extends js.Object {
    var ChangeToken: js.UndefOr[ChangeToken]
  }

  object UpdateRegexPatternSetResponse {
    @inline
    def apply(
        ChangeToken: js.UndefOr[ChangeToken] = js.undefined
    ): UpdateRegexPatternSetResponse = {
      val __obj = js.Dynamic.literal()
      ChangeToken.foreach(__v => __obj.updateDynamic("ChangeToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateRegexPatternSetResponse]
    }
  }

  @js.native
  trait UpdateRuleGroupRequest extends js.Object {
    var ChangeToken: ChangeToken
    var RuleGroupId: ResourceId
    var Updates: RuleGroupUpdates
  }

  object UpdateRuleGroupRequest {
    @inline
    def apply(
        ChangeToken: ChangeToken,
        RuleGroupId: ResourceId,
        Updates: RuleGroupUpdates
    ): UpdateRuleGroupRequest = {
      val __obj = js.Dynamic.literal(
        "ChangeToken" -> ChangeToken.asInstanceOf[js.Any],
        "RuleGroupId" -> RuleGroupId.asInstanceOf[js.Any],
        "Updates" -> Updates.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateRuleGroupRequest]
    }
  }

  @js.native
  trait UpdateRuleGroupResponse extends js.Object {
    var ChangeToken: js.UndefOr[ChangeToken]
  }

  object UpdateRuleGroupResponse {
    @inline
    def apply(
        ChangeToken: js.UndefOr[ChangeToken] = js.undefined
    ): UpdateRuleGroupResponse = {
      val __obj = js.Dynamic.literal()
      ChangeToken.foreach(__v => __obj.updateDynamic("ChangeToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateRuleGroupResponse]
    }
  }

  @js.native
  trait UpdateRuleRequest extends js.Object {
    var ChangeToken: ChangeToken
    var RuleId: ResourceId
    var Updates: RuleUpdates
  }

  object UpdateRuleRequest {
    @inline
    def apply(
        ChangeToken: ChangeToken,
        RuleId: ResourceId,
        Updates: RuleUpdates
    ): UpdateRuleRequest = {
      val __obj = js.Dynamic.literal(
        "ChangeToken" -> ChangeToken.asInstanceOf[js.Any],
        "RuleId" -> RuleId.asInstanceOf[js.Any],
        "Updates" -> Updates.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateRuleRequest]
    }
  }

  @js.native
  trait UpdateRuleResponse extends js.Object {
    var ChangeToken: js.UndefOr[ChangeToken]
  }

  object UpdateRuleResponse {
    @inline
    def apply(
        ChangeToken: js.UndefOr[ChangeToken] = js.undefined
    ): UpdateRuleResponse = {
      val __obj = js.Dynamic.literal()
      ChangeToken.foreach(__v => __obj.updateDynamic("ChangeToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateRuleResponse]
    }
  }

  @js.native
  trait UpdateSizeConstraintSetRequest extends js.Object {
    var ChangeToken: ChangeToken
    var SizeConstraintSetId: ResourceId
    var Updates: SizeConstraintSetUpdates
  }

  object UpdateSizeConstraintSetRequest {
    @inline
    def apply(
        ChangeToken: ChangeToken,
        SizeConstraintSetId: ResourceId,
        Updates: SizeConstraintSetUpdates
    ): UpdateSizeConstraintSetRequest = {
      val __obj = js.Dynamic.literal(
        "ChangeToken" -> ChangeToken.asInstanceOf[js.Any],
        "SizeConstraintSetId" -> SizeConstraintSetId.asInstanceOf[js.Any],
        "Updates" -> Updates.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateSizeConstraintSetRequest]
    }
  }

  @js.native
  trait UpdateSizeConstraintSetResponse extends js.Object {
    var ChangeToken: js.UndefOr[ChangeToken]
  }

  object UpdateSizeConstraintSetResponse {
    @inline
    def apply(
        ChangeToken: js.UndefOr[ChangeToken] = js.undefined
    ): UpdateSizeConstraintSetResponse = {
      val __obj = js.Dynamic.literal()
      ChangeToken.foreach(__v => __obj.updateDynamic("ChangeToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateSizeConstraintSetResponse]
    }
  }

  /** A request to update a <a>SqlInjectionMatchSet</a>.
    */
  @js.native
  trait UpdateSqlInjectionMatchSetRequest extends js.Object {
    var ChangeToken: ChangeToken
    var SqlInjectionMatchSetId: ResourceId
    var Updates: SqlInjectionMatchSetUpdates
  }

  object UpdateSqlInjectionMatchSetRequest {
    @inline
    def apply(
        ChangeToken: ChangeToken,
        SqlInjectionMatchSetId: ResourceId,
        Updates: SqlInjectionMatchSetUpdates
    ): UpdateSqlInjectionMatchSetRequest = {
      val __obj = js.Dynamic.literal(
        "ChangeToken" -> ChangeToken.asInstanceOf[js.Any],
        "SqlInjectionMatchSetId" -> SqlInjectionMatchSetId.asInstanceOf[js.Any],
        "Updates" -> Updates.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateSqlInjectionMatchSetRequest]
    }
  }

  /** The response to an <a>UpdateSqlInjectionMatchSets</a> request.
    */
  @js.native
  trait UpdateSqlInjectionMatchSetResponse extends js.Object {
    var ChangeToken: js.UndefOr[ChangeToken]
  }

  object UpdateSqlInjectionMatchSetResponse {
    @inline
    def apply(
        ChangeToken: js.UndefOr[ChangeToken] = js.undefined
    ): UpdateSqlInjectionMatchSetResponse = {
      val __obj = js.Dynamic.literal()
      ChangeToken.foreach(__v => __obj.updateDynamic("ChangeToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateSqlInjectionMatchSetResponse]
    }
  }

  @js.native
  trait UpdateWebACLRequest extends js.Object {
    var ChangeToken: ChangeToken
    var WebACLId: ResourceId
    var DefaultAction: js.UndefOr[WafAction]
    var Updates: js.UndefOr[WebACLUpdates]
  }

  object UpdateWebACLRequest {
    @inline
    def apply(
        ChangeToken: ChangeToken,
        WebACLId: ResourceId,
        DefaultAction: js.UndefOr[WafAction] = js.undefined,
        Updates: js.UndefOr[WebACLUpdates] = js.undefined
    ): UpdateWebACLRequest = {
      val __obj = js.Dynamic.literal(
        "ChangeToken" -> ChangeToken.asInstanceOf[js.Any],
        "WebACLId" -> WebACLId.asInstanceOf[js.Any]
      )

      DefaultAction.foreach(__v => __obj.updateDynamic("DefaultAction")(__v.asInstanceOf[js.Any]))
      Updates.foreach(__v => __obj.updateDynamic("Updates")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateWebACLRequest]
    }
  }

  @js.native
  trait UpdateWebACLResponse extends js.Object {
    var ChangeToken: js.UndefOr[ChangeToken]
  }

  object UpdateWebACLResponse {
    @inline
    def apply(
        ChangeToken: js.UndefOr[ChangeToken] = js.undefined
    ): UpdateWebACLResponse = {
      val __obj = js.Dynamic.literal()
      ChangeToken.foreach(__v => __obj.updateDynamic("ChangeToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateWebACLResponse]
    }
  }

  /** A request to update an <a>XssMatchSet</a>.
    */
  @js.native
  trait UpdateXssMatchSetRequest extends js.Object {
    var ChangeToken: ChangeToken
    var Updates: XssMatchSetUpdates
    var XssMatchSetId: ResourceId
  }

  object UpdateXssMatchSetRequest {
    @inline
    def apply(
        ChangeToken: ChangeToken,
        Updates: XssMatchSetUpdates,
        XssMatchSetId: ResourceId
    ): UpdateXssMatchSetRequest = {
      val __obj = js.Dynamic.literal(
        "ChangeToken" -> ChangeToken.asInstanceOf[js.Any],
        "Updates" -> Updates.asInstanceOf[js.Any],
        "XssMatchSetId" -> XssMatchSetId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateXssMatchSetRequest]
    }
  }

  /** The response to an <a>UpdateXssMatchSets</a> request.
    */
  @js.native
  trait UpdateXssMatchSetResponse extends js.Object {
    var ChangeToken: js.UndefOr[ChangeToken]
  }

  object UpdateXssMatchSetResponse {
    @inline
    def apply(
        ChangeToken: js.UndefOr[ChangeToken] = js.undefined
    ): UpdateXssMatchSetResponse = {
      val __obj = js.Dynamic.literal()
      ChangeToken.foreach(__v => __obj.updateDynamic("ChangeToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateXssMatchSetResponse]
    }
  }

  /** '''Note:'''This is ```AWS WAF Classic``` documentation. For more information, see [[https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html|AWS WAF Classic]] in the developer guide.
    *  ```For the latest version of AWS WAF```, use the AWS WAFV2 API and see the [[https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html|AWS WAF Developer Guide]]. With the latest version, AWS WAF has a single set of endpoints for regional and global use.
    * For the action that is associated with a rule in a <code>WebACL</code>, specifies the action that you want AWS WAF to perform when a web request matches all of the conditions in a rule. For the default action in a <code>WebACL</code>, specifies the action that you want AWS WAF to take when a web request doesn't match all of the conditions in any of the rules in a <code>WebACL</code>.
    */
  @js.native
  trait WafAction extends js.Object {
    var Type: WafActionType
  }

  object WafAction {
    @inline
    def apply(
        Type: WafActionType
    ): WafAction = {
      val __obj = js.Dynamic.literal(
        "Type" -> Type.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[WafAction]
    }
  }

  @js.native
  sealed trait WafActionType extends js.Any
  object WafActionType {
    val BLOCK = "BLOCK".asInstanceOf[WafActionType]
    val ALLOW = "ALLOW".asInstanceOf[WafActionType]
    val COUNT = "COUNT".asInstanceOf[WafActionType]

    @inline def values = js.Array(BLOCK, ALLOW, COUNT)
  }

  /** '''Note:'''This is ```AWS WAF Classic``` documentation. For more information, see [[https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html|AWS WAF Classic]] in the developer guide.
    *  ```For the latest version of AWS WAF```, use the AWS WAFV2 API and see the [[https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html|AWS WAF Developer Guide]]. With the latest version, AWS WAF has a single set of endpoints for regional and global use.
    * The action to take if any rule within the <code>RuleGroup</code> matches a request.
    */
  @js.native
  trait WafOverrideAction extends js.Object {
    var Type: WafOverrideActionType
  }

  object WafOverrideAction {
    @inline
    def apply(
        Type: WafOverrideActionType
    ): WafOverrideAction = {
      val __obj = js.Dynamic.literal(
        "Type" -> Type.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[WafOverrideAction]
    }
  }

  @js.native
  sealed trait WafOverrideActionType extends js.Any
  object WafOverrideActionType {
    val NONE = "NONE".asInstanceOf[WafOverrideActionType]
    val COUNT = "COUNT".asInstanceOf[WafOverrideActionType]

    @inline def values = js.Array(NONE, COUNT)
  }

  @js.native
  sealed trait WafRuleType extends js.Any
  object WafRuleType {
    val REGULAR = "REGULAR".asInstanceOf[WafRuleType]
    val RATE_BASED = "RATE_BASED".asInstanceOf[WafRuleType]
    val GROUP = "GROUP".asInstanceOf[WafRuleType]

    @inline def values = js.Array(REGULAR, RATE_BASED, GROUP)
  }

  /** '''Note:'''This is ```AWS WAF Classic``` documentation. For more information, see [[https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html|AWS WAF Classic]] in the developer guide.
    *  ```For the latest version of AWS WAF```, use the AWS WAFV2 API and see the [[https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html|AWS WAF Developer Guide]]. With the latest version, AWS WAF has a single set of endpoints for regional and global use.
    * Contains the <code>Rules</code> that identify the requests that you want to allow, block, or count. In a <code>WebACL</code>, you also specify a default action (<code>ALLOW</code> or <code>BLOCK</code>), and the action for each <code>Rule</code> that you add to a <code>WebACL</code>, for example, block requests from specified IP addresses or block requests from specified referrers. You also associate the <code>WebACL</code> with a CloudFront distribution to identify the requests that you want AWS WAF to filter. If you add more than one <code>Rule</code> to a <code>WebACL</code>, a request needs to match only one of the specifications to be allowed, blocked, or counted. For more information, see <a>UpdateWebACL</a>.
    */
  @js.native
  trait WebACL extends js.Object {
    var DefaultAction: WafAction
    var Rules: ActivatedRules
    var WebACLId: ResourceId
    var MetricName: js.UndefOr[MetricName]
    var Name: js.UndefOr[ResourceName]
    var WebACLArn: js.UndefOr[ResourceArn]
  }

  object WebACL {
    @inline
    def apply(
        DefaultAction: WafAction,
        Rules: ActivatedRules,
        WebACLId: ResourceId,
        MetricName: js.UndefOr[MetricName] = js.undefined,
        Name: js.UndefOr[ResourceName] = js.undefined,
        WebACLArn: js.UndefOr[ResourceArn] = js.undefined
    ): WebACL = {
      val __obj = js.Dynamic.literal(
        "DefaultAction" -> DefaultAction.asInstanceOf[js.Any],
        "Rules" -> Rules.asInstanceOf[js.Any],
        "WebACLId" -> WebACLId.asInstanceOf[js.Any]
      )

      MetricName.foreach(__v => __obj.updateDynamic("MetricName")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      WebACLArn.foreach(__v => __obj.updateDynamic("WebACLArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[WebACL]
    }
  }

  /** '''Note:'''This is ```AWS WAF Classic``` documentation. For more information, see [[https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html|AWS WAF Classic]] in the developer guide.
    *  ```For the latest version of AWS WAF```, use the AWS WAFV2 API and see the [[https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html|AWS WAF Developer Guide]]. With the latest version, AWS WAF has a single set of endpoints for regional and global use.
    * Contains the identifier and the name or description of the <a>WebACL</a>.
    */
  @js.native
  trait WebACLSummary extends js.Object {
    var Name: ResourceName
    var WebACLId: ResourceId
  }

  object WebACLSummary {
    @inline
    def apply(
        Name: ResourceName,
        WebACLId: ResourceId
    ): WebACLSummary = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "WebACLId" -> WebACLId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[WebACLSummary]
    }
  }

  /** '''Note:'''This is ```AWS WAF Classic``` documentation. For more information, see [[https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html|AWS WAF Classic]] in the developer guide.
    *  ```For the latest version of AWS WAF```, use the AWS WAFV2 API and see the [[https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html|AWS WAF Developer Guide]]. With the latest version, AWS WAF has a single set of endpoints for regional and global use.
    * Specifies whether to insert a <code>Rule</code> into or delete a <code>Rule</code> from a <code>WebACL</code>.
    */
  @js.native
  trait WebACLUpdate extends js.Object {
    var Action: ChangeAction
    var ActivatedRule: ActivatedRule
  }

  object WebACLUpdate {
    @inline
    def apply(
        Action: ChangeAction,
        ActivatedRule: ActivatedRule
    ): WebACLUpdate = {
      val __obj = js.Dynamic.literal(
        "Action" -> Action.asInstanceOf[js.Any],
        "ActivatedRule" -> ActivatedRule.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[WebACLUpdate]
    }
  }

  /** '''Note:'''This is ```AWS WAF Classic``` documentation. For more information, see [[https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html|AWS WAF Classic]] in the developer guide.
    *  ```For the latest version of AWS WAF```, use the AWS WAFV2 API and see the [[https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html|AWS WAF Developer Guide]]. With the latest version, AWS WAF has a single set of endpoints for regional and global use.
    * A complex type that contains <code>XssMatchTuple</code> objects, which specify the parts of web requests that you want AWS WAF to inspect for cross-site scripting attacks and, if you want AWS WAF to inspect a header, the name of the header. If a <code>XssMatchSet</code> contains more than one <code>XssMatchTuple</code> object, a request needs to include cross-site scripting attacks in only one of the specified parts of the request to be considered a match.
    */
  @js.native
  trait XssMatchSet extends js.Object {
    var XssMatchSetId: ResourceId
    var XssMatchTuples: XssMatchTuples
    var Name: js.UndefOr[ResourceName]
  }

  object XssMatchSet {
    @inline
    def apply(
        XssMatchSetId: ResourceId,
        XssMatchTuples: XssMatchTuples,
        Name: js.UndefOr[ResourceName] = js.undefined
    ): XssMatchSet = {
      val __obj = js.Dynamic.literal(
        "XssMatchSetId" -> XssMatchSetId.asInstanceOf[js.Any],
        "XssMatchTuples" -> XssMatchTuples.asInstanceOf[js.Any]
      )

      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[XssMatchSet]
    }
  }

  /** '''Note:'''This is ```AWS WAF Classic``` documentation. For more information, see [[https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html|AWS WAF Classic]] in the developer guide.
    *  ```For the latest version of AWS WAF```, use the AWS WAFV2 API and see the [[https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html|AWS WAF Developer Guide]]. With the latest version, AWS WAF has a single set of endpoints for regional and global use.
    * The <code>Id</code> and <code>Name</code> of an <code>XssMatchSet</code>.
    */
  @js.native
  trait XssMatchSetSummary extends js.Object {
    var Name: ResourceName
    var XssMatchSetId: ResourceId
  }

  object XssMatchSetSummary {
    @inline
    def apply(
        Name: ResourceName,
        XssMatchSetId: ResourceId
    ): XssMatchSetSummary = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "XssMatchSetId" -> XssMatchSetId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[XssMatchSetSummary]
    }
  }

  /** '''Note:'''This is ```AWS WAF Classic``` documentation. For more information, see [[https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html|AWS WAF Classic]] in the developer guide.
    *  ```For the latest version of AWS WAF```, use the AWS WAFV2 API and see the [[https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html|AWS WAF Developer Guide]]. With the latest version, AWS WAF has a single set of endpoints for regional and global use.
    * Specifies the part of a web request that you want to inspect for cross-site scripting attacks and indicates whether you want to add the specification to an <a>XssMatchSet</a> or delete it from an <code>XssMatchSet</code>.
    */
  @js.native
  trait XssMatchSetUpdate extends js.Object {
    var Action: ChangeAction
    var XssMatchTuple: XssMatchTuple
  }

  object XssMatchSetUpdate {
    @inline
    def apply(
        Action: ChangeAction,
        XssMatchTuple: XssMatchTuple
    ): XssMatchSetUpdate = {
      val __obj = js.Dynamic.literal(
        "Action" -> Action.asInstanceOf[js.Any],
        "XssMatchTuple" -> XssMatchTuple.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[XssMatchSetUpdate]
    }
  }

  /** '''Note:'''This is ```AWS WAF Classic``` documentation. For more information, see [[https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html|AWS WAF Classic]] in the developer guide.
    *  ```For the latest version of AWS WAF```, use the AWS WAFV2 API and see the [[https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html|AWS WAF Developer Guide]]. With the latest version, AWS WAF has a single set of endpoints for regional and global use.
    * Specifies the part of a web request that you want AWS WAF to inspect for cross-site scripting attacks and, if you want AWS WAF to inspect a header, the name of the header.
    */
  @js.native
  trait XssMatchTuple extends js.Object {
    var FieldToMatch: FieldToMatch
    var TextTransformation: TextTransformation
  }

  object XssMatchTuple {
    @inline
    def apply(
        FieldToMatch: FieldToMatch,
        TextTransformation: TextTransformation
    ): XssMatchTuple = {
      val __obj = js.Dynamic.literal(
        "FieldToMatch" -> FieldToMatch.asInstanceOf[js.Any],
        "TextTransformation" -> TextTransformation.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[XssMatchTuple]
    }
  }
}
