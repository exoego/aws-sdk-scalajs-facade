package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import io.scalajs.nodejs
import facade.amazonaws._

package object wafregional {
  type Action = String
  type ActivatedRules = js.Array[ActivatedRule]
  type ByteMatchSetSummaries = js.Array[ByteMatchSetSummary]
  type ByteMatchSetUpdates = js.Array[ByteMatchSetUpdate]
  type ByteMatchTargetString = nodejs.buffer.Buffer | nodejs.stream.Readable | js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type ByteMatchTuples = js.Array[ByteMatchTuple]
  type ChangeAction = String
  type ChangeToken = String
  type ChangeTokenStatus = String
  type ComparisonOperator = String
  type Country = String
  type GeoMatchConstraintType = String
  type GeoMatchConstraintValue = String
  type GeoMatchConstraints = js.Array[GeoMatchConstraint]
  type GeoMatchSetSummaries = js.Array[GeoMatchSetSummary]
  type GeoMatchSetUpdates = js.Array[GeoMatchSetUpdate]
  type GetSampledRequestsMaxItems = Double
  type HTTPHeaders = js.Array[HTTPHeader]
  type HTTPMethod = String
  type HTTPVersion = String
  type HeaderName = String
  type HeaderValue = String
  type IPSetDescriptorType = String
  type IPSetDescriptorValue = String
  type IPSetDescriptors = js.Array[IPSetDescriptor]
  type IPSetSummaries = js.Array[IPSetSummary]
  type IPSetUpdates = js.Array[IPSetUpdate]
  type IPString = String
  type LogDestinationConfigs = js.Array[ResourceArn]
  type LoggingConfigurations = js.Array[LoggingConfiguration]
  type ManagedKey = String
  type ManagedKeys = js.Array[ManagedKey]
  type MatchFieldData = String
  type MatchFieldType = String
  type MetricName = String
  type Negated = Boolean
  type NextMarker = String
  type PaginationLimit = Int
  type PolicyString = String
  type PopulationSize = Double
  type PositionalConstraint = String
  type PredicateType = String
  type Predicates = js.Array[Predicate]
  type RateKey = String
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
  type ResourceArns = js.Array[ResourceArn]
  type ResourceId = String
  type ResourceName = String
  type ResourceType = String
  type RuleGroupSummaries = js.Array[RuleGroupSummary]
  type RuleGroupUpdates = js.Array[RuleGroupUpdate]
  type RulePriority = Int
  type RuleSummaries = js.Array[RuleSummary]
  type RuleUpdates = js.Array[RuleUpdate]
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
  type TextTransformation = String
  type Timestamp = js.Date
  type URIString = String
  type WafActionType = String
  type WafOverrideActionType = String
  type WafRuleType = String
  type WebACLSummaries = js.Array[WebACLSummary]
  type WebACLUpdates = js.Array[WebACLUpdate]
  type XssMatchSetSummaries = js.Array[XssMatchSetSummary]
  type XssMatchSetUpdates = js.Array[XssMatchSetUpdate]
  type XssMatchTuples = js.Array[XssMatchTuple]
}

package wafregional {
  @js.native
  @JSImport("aws-sdk", "WAFRegional")
  class WAFRegional(config: AWSConfig) extends js.Object {
    def associateWebACL(params: AssociateWebACLRequest): Request[AssociateWebACLResponse] = js.native
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
    def disassociateWebACL(params: DisassociateWebACLRequest): Request[DisassociateWebACLResponse] = js.native
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
    def getWebACLForResource(params: GetWebACLForResourceRequest): Request[GetWebACLForResourceResponse] = js.native
    def getXssMatchSet(params: GetXssMatchSetRequest): Request[GetXssMatchSetResponse] = js.native
    def listActivatedRulesInRuleGroup(params: ListActivatedRulesInRuleGroupRequest): Request[ListActivatedRulesInRuleGroupResponse] = js.native
    def listByteMatchSets(params: ListByteMatchSetsRequest): Request[ListByteMatchSetsResponse] = js.native
    def listGeoMatchSets(params: ListGeoMatchSetsRequest): Request[ListGeoMatchSetsResponse] = js.native
    def listIPSets(params: ListIPSetsRequest): Request[ListIPSetsResponse] = js.native
    def listLoggingConfigurations(params: ListLoggingConfigurationsRequest): Request[ListLoggingConfigurationsResponse] = js.native
    def listRateBasedRules(params: ListRateBasedRulesRequest): Request[ListRateBasedRulesResponse] = js.native
    def listRegexMatchSets(params: ListRegexMatchSetsRequest): Request[ListRegexMatchSetsResponse] = js.native
    def listRegexPatternSets(params: ListRegexPatternSetsRequest): Request[ListRegexPatternSetsResponse] = js.native
    def listResourcesForWebACL(params: ListResourcesForWebACLRequest): Request[ListResourcesForWebACLResponse] = js.native
    def listRuleGroups(params: ListRuleGroupsRequest): Request[ListRuleGroupsResponse] = js.native
    def listRules(params: ListRulesRequest): Request[ListRulesResponse] = js.native
    def listSizeConstraintSets(params: ListSizeConstraintSetsRequest): Request[ListSizeConstraintSetsResponse] = js.native
    def listSqlInjectionMatchSets(params: ListSqlInjectionMatchSetsRequest): Request[ListSqlInjectionMatchSetsResponse] = js.native
    def listSubscribedRuleGroups(params: ListSubscribedRuleGroupsRequest): Request[ListSubscribedRuleGroupsResponse] = js.native
    def listWebACLs(params: ListWebACLsRequest): Request[ListWebACLsResponse] = js.native
    def listXssMatchSets(params: ListXssMatchSetsRequest): Request[ListXssMatchSetsResponse] = js.native
    def putLoggingConfiguration(params: PutLoggingConfigurationRequest): Request[PutLoggingConfigurationResponse] = js.native
    def putPermissionPolicy(params: PutPermissionPolicyRequest): Request[PutPermissionPolicyResponse] = js.native
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

  /**
   * The <code>ActivatedRule</code> object in an '''UpdateWebACL''' request specifies a <code>Rule</code> that you want to insert or delete, the priority of the <code>Rule</code> in the <code>WebACL</code>, and the action that you want AWS WAF to take when a web request matches the <code>Rule</code> (<code>ALLOW</code>, <code>BLOCK</code>, or <code>COUNT</code>).
   *  To specify whether to insert or delete a <code>Rule</code>, use the <code>Action</code> parameter in the '''WebACLUpdate''' data type.
   */
  @js.native
  trait ActivatedRule extends js.Object {
    var Priority: RulePriority
    var RuleId: ResourceId
    var Action: js.UndefOr[WafAction]
    var OverrideAction: js.UndefOr[WafOverrideAction]
    var Type: js.UndefOr[WafRuleType]
  }

  object ActivatedRule {
    def apply(
      Priority: RulePriority,
      RuleId: ResourceId,
      Action: js.UndefOr[WafAction] = js.undefined,
      OverrideAction: js.UndefOr[WafOverrideAction] = js.undefined,
      Type: js.UndefOr[WafRuleType] = js.undefined): ActivatedRule = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Priority" -> Priority.asInstanceOf[js.Any],
        "RuleId" -> RuleId.asInstanceOf[js.Any],
        "Action" -> Action.map { x => x.asInstanceOf[js.Any] },
        "OverrideAction" -> OverrideAction.map { x => x.asInstanceOf[js.Any] },
        "Type" -> Type.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ActivatedRule]
    }
  }

  @js.native
  trait AssociateWebACLRequest extends js.Object {
    var ResourceArn: ResourceArn
    var WebACLId: ResourceId
  }

  object AssociateWebACLRequest {
    def apply(
      ResourceArn: ResourceArn,
      WebACLId: ResourceId): AssociateWebACLRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any],
        "WebACLId" -> WebACLId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssociateWebACLRequest]
    }
  }

  @js.native
  trait AssociateWebACLResponse extends js.Object {

  }

  object AssociateWebACLResponse {
    def apply(): AssociateWebACLResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssociateWebACLResponse]
    }
  }

  /**
   * In a '''GetByteMatchSet''' request, <code>ByteMatchSet</code> is a complex type that contains the <code>ByteMatchSetId</code> and <code>Name</code> of a <code>ByteMatchSet</code>, and the values that you specified when you updated the <code>ByteMatchSet</code>.
   *  A complex type that contains <code>ByteMatchTuple</code> objects, which specify the parts of web requests that you want AWS WAF to inspect and the values that you want AWS WAF to search for. If a <code>ByteMatchSet</code> contains more than one <code>ByteMatchTuple</code> object, a request needs to match the settings in only one <code>ByteMatchTuple</code> to be considered a match.
   */
  @js.native
  trait ByteMatchSet extends js.Object {
    var ByteMatchSetId: ResourceId
    var ByteMatchTuples: ByteMatchTuples
    var Name: js.UndefOr[ResourceName]
  }

  object ByteMatchSet {
    def apply(
      ByteMatchSetId: ResourceId,
      ByteMatchTuples: ByteMatchTuples,
      Name: js.UndefOr[ResourceName] = js.undefined): ByteMatchSet = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ByteMatchSetId" -> ByteMatchSetId.asInstanceOf[js.Any],
        "ByteMatchTuples" -> ByteMatchTuples.asInstanceOf[js.Any],
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ByteMatchSet]
    }
  }

  /**
   * Returned by '''ListByteMatchSets'''. Each <code>ByteMatchSetSummary</code> object includes the <code>Name</code> and <code>ByteMatchSetId</code> for one '''ByteMatchSet'''.
   */
  @js.native
  trait ByteMatchSetSummary extends js.Object {
    var ByteMatchSetId: ResourceId
    var Name: ResourceName
  }

  object ByteMatchSetSummary {
    def apply(
      ByteMatchSetId: ResourceId,
      Name: ResourceName): ByteMatchSetSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ByteMatchSetId" -> ByteMatchSetId.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ByteMatchSetSummary]
    }
  }

  /**
   * In an '''UpdateByteMatchSet''' request, <code>ByteMatchSetUpdate</code> specifies whether to insert or delete a '''ByteMatchTuple''' and includes the settings for the <code>ByteMatchTuple</code>.
   */
  @js.native
  trait ByteMatchSetUpdate extends js.Object {
    var Action: ChangeAction
    var ByteMatchTuple: ByteMatchTuple
  }

  object ByteMatchSetUpdate {
    def apply(
      Action: ChangeAction,
      ByteMatchTuple: ByteMatchTuple): ByteMatchSetUpdate = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Action" -> Action.asInstanceOf[js.Any],
        "ByteMatchTuple" -> ByteMatchTuple.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ByteMatchSetUpdate]
    }
  }

  /**
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
    def apply(
      FieldToMatch: FieldToMatch,
      PositionalConstraint: PositionalConstraint,
      TargetString: ByteMatchTargetString,
      TextTransformation: TextTransformation): ByteMatchTuple = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FieldToMatch" -> FieldToMatch.asInstanceOf[js.Any],
        "PositionalConstraint" -> PositionalConstraint.asInstanceOf[js.Any],
        "TargetString" -> TargetString.asInstanceOf[js.Any],
        "TextTransformation" -> TextTransformation.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ByteMatchTuple]
    }
  }

  object ChangeActionEnum {
    val INSERT = "INSERT"
    val DELETE = "DELETE"

    val values = IndexedSeq(INSERT, DELETE)
  }

  object ChangeTokenStatusEnum {
    val PROVISIONED = "PROVISIONED"
    val PENDING = "PENDING"
    val INSYNC = "INSYNC"

    val values = IndexedSeq(PROVISIONED, PENDING, INSYNC)
  }

  object ComparisonOperatorEnum {
    val EQ = "EQ"
    val NE = "NE"
    val LE = "LE"
    val LT = "LT"
    val GE = "GE"
    val GT = "GT"

    val values = IndexedSeq(EQ, NE, LE, LT, GE, GT)
  }

  @js.native
  trait CreateByteMatchSetRequest extends js.Object {
    var ChangeToken: ChangeToken
    var Name: ResourceName
  }

  object CreateByteMatchSetRequest {
    def apply(
      ChangeToken: ChangeToken,
      Name: ResourceName): CreateByteMatchSetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ChangeToken" -> ChangeToken.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateByteMatchSetRequest]
    }
  }

  @js.native
  trait CreateByteMatchSetResponse extends js.Object {
    var ByteMatchSet: js.UndefOr[ByteMatchSet]
    var ChangeToken: js.UndefOr[ChangeToken]
  }

  object CreateByteMatchSetResponse {
    def apply(
      ByteMatchSet: js.UndefOr[ByteMatchSet] = js.undefined,
      ChangeToken: js.UndefOr[ChangeToken] = js.undefined): CreateByteMatchSetResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ByteMatchSet" -> ByteMatchSet.map { x => x.asInstanceOf[js.Any] },
        "ChangeToken" -> ChangeToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateByteMatchSetResponse]
    }
  }

  @js.native
  trait CreateGeoMatchSetRequest extends js.Object {
    var ChangeToken: ChangeToken
    var Name: ResourceName
  }

  object CreateGeoMatchSetRequest {
    def apply(
      ChangeToken: ChangeToken,
      Name: ResourceName): CreateGeoMatchSetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ChangeToken" -> ChangeToken.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateGeoMatchSetRequest]
    }
  }

  @js.native
  trait CreateGeoMatchSetResponse extends js.Object {
    var ChangeToken: js.UndefOr[ChangeToken]
    var GeoMatchSet: js.UndefOr[GeoMatchSet]
  }

  object CreateGeoMatchSetResponse {
    def apply(
      ChangeToken: js.UndefOr[ChangeToken] = js.undefined,
      GeoMatchSet: js.UndefOr[GeoMatchSet] = js.undefined): CreateGeoMatchSetResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ChangeToken" -> ChangeToken.map { x => x.asInstanceOf[js.Any] },
        "GeoMatchSet" -> GeoMatchSet.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateGeoMatchSetResponse]
    }
  }

  @js.native
  trait CreateIPSetRequest extends js.Object {
    var ChangeToken: ChangeToken
    var Name: ResourceName
  }

  object CreateIPSetRequest {
    def apply(
      ChangeToken: ChangeToken,
      Name: ResourceName): CreateIPSetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ChangeToken" -> ChangeToken.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateIPSetRequest]
    }
  }

  @js.native
  trait CreateIPSetResponse extends js.Object {
    var ChangeToken: js.UndefOr[ChangeToken]
    var IPSet: js.UndefOr[IPSet]
  }

  object CreateIPSetResponse {
    def apply(
      ChangeToken: js.UndefOr[ChangeToken] = js.undefined,
      IPSet: js.UndefOr[IPSet] = js.undefined): CreateIPSetResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ChangeToken" -> ChangeToken.map { x => x.asInstanceOf[js.Any] },
        "IPSet" -> IPSet.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateIPSetResponse]
    }
  }

  @js.native
  trait CreateRateBasedRuleRequest extends js.Object {
    var ChangeToken: ChangeToken
    var MetricName: MetricName
    var Name: ResourceName
    var RateKey: RateKey
    var RateLimit: RateLimit
  }

  object CreateRateBasedRuleRequest {
    def apply(
      ChangeToken: ChangeToken,
      MetricName: MetricName,
      Name: ResourceName,
      RateKey: RateKey,
      RateLimit: RateLimit): CreateRateBasedRuleRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ChangeToken" -> ChangeToken.asInstanceOf[js.Any],
        "MetricName" -> MetricName.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
        "RateKey" -> RateKey.asInstanceOf[js.Any],
        "RateLimit" -> RateLimit.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateRateBasedRuleRequest]
    }
  }

  @js.native
  trait CreateRateBasedRuleResponse extends js.Object {
    var ChangeToken: js.UndefOr[ChangeToken]
    var Rule: js.UndefOr[RateBasedRule]
  }

  object CreateRateBasedRuleResponse {
    def apply(
      ChangeToken: js.UndefOr[ChangeToken] = js.undefined,
      Rule: js.UndefOr[RateBasedRule] = js.undefined): CreateRateBasedRuleResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ChangeToken" -> ChangeToken.map { x => x.asInstanceOf[js.Any] },
        "Rule" -> Rule.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateRateBasedRuleResponse]
    }
  }

  @js.native
  trait CreateRegexMatchSetRequest extends js.Object {
    var ChangeToken: ChangeToken
    var Name: ResourceName
  }

  object CreateRegexMatchSetRequest {
    def apply(
      ChangeToken: ChangeToken,
      Name: ResourceName): CreateRegexMatchSetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ChangeToken" -> ChangeToken.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateRegexMatchSetRequest]
    }
  }

  @js.native
  trait CreateRegexMatchSetResponse extends js.Object {
    var ChangeToken: js.UndefOr[ChangeToken]
    var RegexMatchSet: js.UndefOr[RegexMatchSet]
  }

  object CreateRegexMatchSetResponse {
    def apply(
      ChangeToken: js.UndefOr[ChangeToken] = js.undefined,
      RegexMatchSet: js.UndefOr[RegexMatchSet] = js.undefined): CreateRegexMatchSetResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ChangeToken" -> ChangeToken.map { x => x.asInstanceOf[js.Any] },
        "RegexMatchSet" -> RegexMatchSet.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateRegexMatchSetResponse]
    }
  }

  @js.native
  trait CreateRegexPatternSetRequest extends js.Object {
    var ChangeToken: ChangeToken
    var Name: ResourceName
  }

  object CreateRegexPatternSetRequest {
    def apply(
      ChangeToken: ChangeToken,
      Name: ResourceName): CreateRegexPatternSetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ChangeToken" -> ChangeToken.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateRegexPatternSetRequest]
    }
  }

  @js.native
  trait CreateRegexPatternSetResponse extends js.Object {
    var ChangeToken: js.UndefOr[ChangeToken]
    var RegexPatternSet: js.UndefOr[RegexPatternSet]
  }

  object CreateRegexPatternSetResponse {
    def apply(
      ChangeToken: js.UndefOr[ChangeToken] = js.undefined,
      RegexPatternSet: js.UndefOr[RegexPatternSet] = js.undefined): CreateRegexPatternSetResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ChangeToken" -> ChangeToken.map { x => x.asInstanceOf[js.Any] },
        "RegexPatternSet" -> RegexPatternSet.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateRegexPatternSetResponse]
    }
  }

  @js.native
  trait CreateRuleGroupRequest extends js.Object {
    var ChangeToken: ChangeToken
    var MetricName: MetricName
    var Name: ResourceName
  }

  object CreateRuleGroupRequest {
    def apply(
      ChangeToken: ChangeToken,
      MetricName: MetricName,
      Name: ResourceName): CreateRuleGroupRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ChangeToken" -> ChangeToken.asInstanceOf[js.Any],
        "MetricName" -> MetricName.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateRuleGroupRequest]
    }
  }

  @js.native
  trait CreateRuleGroupResponse extends js.Object {
    var ChangeToken: js.UndefOr[ChangeToken]
    var RuleGroup: js.UndefOr[RuleGroup]
  }

  object CreateRuleGroupResponse {
    def apply(
      ChangeToken: js.UndefOr[ChangeToken] = js.undefined,
      RuleGroup: js.UndefOr[RuleGroup] = js.undefined): CreateRuleGroupResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ChangeToken" -> ChangeToken.map { x => x.asInstanceOf[js.Any] },
        "RuleGroup" -> RuleGroup.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateRuleGroupResponse]
    }
  }

  @js.native
  trait CreateRuleRequest extends js.Object {
    var ChangeToken: ChangeToken
    var MetricName: MetricName
    var Name: ResourceName
  }

  object CreateRuleRequest {
    def apply(
      ChangeToken: ChangeToken,
      MetricName: MetricName,
      Name: ResourceName): CreateRuleRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ChangeToken" -> ChangeToken.asInstanceOf[js.Any],
        "MetricName" -> MetricName.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateRuleRequest]
    }
  }

  @js.native
  trait CreateRuleResponse extends js.Object {
    var ChangeToken: js.UndefOr[ChangeToken]
    var Rule: js.UndefOr[Rule]
  }

  object CreateRuleResponse {
    def apply(
      ChangeToken: js.UndefOr[ChangeToken] = js.undefined,
      Rule: js.UndefOr[Rule] = js.undefined): CreateRuleResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ChangeToken" -> ChangeToken.map { x => x.asInstanceOf[js.Any] },
        "Rule" -> Rule.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateRuleResponse]
    }
  }

  @js.native
  trait CreateSizeConstraintSetRequest extends js.Object {
    var ChangeToken: ChangeToken
    var Name: ResourceName
  }

  object CreateSizeConstraintSetRequest {
    def apply(
      ChangeToken: ChangeToken,
      Name: ResourceName): CreateSizeConstraintSetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ChangeToken" -> ChangeToken.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateSizeConstraintSetRequest]
    }
  }

  @js.native
  trait CreateSizeConstraintSetResponse extends js.Object {
    var ChangeToken: js.UndefOr[ChangeToken]
    var SizeConstraintSet: js.UndefOr[SizeConstraintSet]
  }

  object CreateSizeConstraintSetResponse {
    def apply(
      ChangeToken: js.UndefOr[ChangeToken] = js.undefined,
      SizeConstraintSet: js.UndefOr[SizeConstraintSet] = js.undefined): CreateSizeConstraintSetResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ChangeToken" -> ChangeToken.map { x => x.asInstanceOf[js.Any] },
        "SizeConstraintSet" -> SizeConstraintSet.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateSizeConstraintSetResponse]
    }
  }

  /**
   * A request to create a '''SqlInjectionMatchSet'''.
   */
  @js.native
  trait CreateSqlInjectionMatchSetRequest extends js.Object {
    var ChangeToken: ChangeToken
    var Name: ResourceName
  }

  object CreateSqlInjectionMatchSetRequest {
    def apply(
      ChangeToken: ChangeToken,
      Name: ResourceName): CreateSqlInjectionMatchSetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ChangeToken" -> ChangeToken.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateSqlInjectionMatchSetRequest]
    }
  }

  /**
   * The response to a <code>CreateSqlInjectionMatchSet</code> request.
   */
  @js.native
  trait CreateSqlInjectionMatchSetResponse extends js.Object {
    var ChangeToken: js.UndefOr[ChangeToken]
    var SqlInjectionMatchSet: js.UndefOr[SqlInjectionMatchSet]
  }

  object CreateSqlInjectionMatchSetResponse {
    def apply(
      ChangeToken: js.UndefOr[ChangeToken] = js.undefined,
      SqlInjectionMatchSet: js.UndefOr[SqlInjectionMatchSet] = js.undefined): CreateSqlInjectionMatchSetResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ChangeToken" -> ChangeToken.map { x => x.asInstanceOf[js.Any] },
        "SqlInjectionMatchSet" -> SqlInjectionMatchSet.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateSqlInjectionMatchSetResponse]
    }
  }

  @js.native
  trait CreateWebACLRequest extends js.Object {
    var ChangeToken: ChangeToken
    var DefaultAction: WafAction
    var MetricName: MetricName
    var Name: ResourceName
  }

  object CreateWebACLRequest {
    def apply(
      ChangeToken: ChangeToken,
      DefaultAction: WafAction,
      MetricName: MetricName,
      Name: ResourceName): CreateWebACLRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ChangeToken" -> ChangeToken.asInstanceOf[js.Any],
        "DefaultAction" -> DefaultAction.asInstanceOf[js.Any],
        "MetricName" -> MetricName.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateWebACLRequest]
    }
  }

  @js.native
  trait CreateWebACLResponse extends js.Object {
    var ChangeToken: js.UndefOr[ChangeToken]
    var WebACL: js.UndefOr[WebACL]
  }

  object CreateWebACLResponse {
    def apply(
      ChangeToken: js.UndefOr[ChangeToken] = js.undefined,
      WebACL: js.UndefOr[WebACL] = js.undefined): CreateWebACLResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ChangeToken" -> ChangeToken.map { x => x.asInstanceOf[js.Any] },
        "WebACL" -> WebACL.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateWebACLResponse]
    }
  }

  /**
   * A request to create an '''XssMatchSet'''.
   */
  @js.native
  trait CreateXssMatchSetRequest extends js.Object {
    var ChangeToken: ChangeToken
    var Name: ResourceName
  }

  object CreateXssMatchSetRequest {
    def apply(
      ChangeToken: ChangeToken,
      Name: ResourceName): CreateXssMatchSetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ChangeToken" -> ChangeToken.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateXssMatchSetRequest]
    }
  }

  /**
   * The response to a <code>CreateXssMatchSet</code> request.
   */
  @js.native
  trait CreateXssMatchSetResponse extends js.Object {
    var ChangeToken: js.UndefOr[ChangeToken]
    var XssMatchSet: js.UndefOr[XssMatchSet]
  }

  object CreateXssMatchSetResponse {
    def apply(
      ChangeToken: js.UndefOr[ChangeToken] = js.undefined,
      XssMatchSet: js.UndefOr[XssMatchSet] = js.undefined): CreateXssMatchSetResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ChangeToken" -> ChangeToken.map { x => x.asInstanceOf[js.Any] },
        "XssMatchSet" -> XssMatchSet.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateXssMatchSetResponse]
    }
  }

  @js.native
  trait DeleteByteMatchSetRequest extends js.Object {
    var ByteMatchSetId: ResourceId
    var ChangeToken: ChangeToken
  }

  object DeleteByteMatchSetRequest {
    def apply(
      ByteMatchSetId: ResourceId,
      ChangeToken: ChangeToken): DeleteByteMatchSetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ByteMatchSetId" -> ByteMatchSetId.asInstanceOf[js.Any],
        "ChangeToken" -> ChangeToken.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteByteMatchSetRequest]
    }
  }

  @js.native
  trait DeleteByteMatchSetResponse extends js.Object {
    var ChangeToken: js.UndefOr[ChangeToken]
  }

  object DeleteByteMatchSetResponse {
    def apply(
      ChangeToken: js.UndefOr[ChangeToken] = js.undefined): DeleteByteMatchSetResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ChangeToken" -> ChangeToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteByteMatchSetResponse]
    }
  }

  @js.native
  trait DeleteGeoMatchSetRequest extends js.Object {
    var ChangeToken: ChangeToken
    var GeoMatchSetId: ResourceId
  }

  object DeleteGeoMatchSetRequest {
    def apply(
      ChangeToken: ChangeToken,
      GeoMatchSetId: ResourceId): DeleteGeoMatchSetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ChangeToken" -> ChangeToken.asInstanceOf[js.Any],
        "GeoMatchSetId" -> GeoMatchSetId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteGeoMatchSetRequest]
    }
  }

  @js.native
  trait DeleteGeoMatchSetResponse extends js.Object {
    var ChangeToken: js.UndefOr[ChangeToken]
  }

  object DeleteGeoMatchSetResponse {
    def apply(
      ChangeToken: js.UndefOr[ChangeToken] = js.undefined): DeleteGeoMatchSetResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ChangeToken" -> ChangeToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteGeoMatchSetResponse]
    }
  }

  @js.native
  trait DeleteIPSetRequest extends js.Object {
    var ChangeToken: ChangeToken
    var IPSetId: ResourceId
  }

  object DeleteIPSetRequest {
    def apply(
      ChangeToken: ChangeToken,
      IPSetId: ResourceId): DeleteIPSetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ChangeToken" -> ChangeToken.asInstanceOf[js.Any],
        "IPSetId" -> IPSetId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteIPSetRequest]
    }
  }

  @js.native
  trait DeleteIPSetResponse extends js.Object {
    var ChangeToken: js.UndefOr[ChangeToken]
  }

  object DeleteIPSetResponse {
    def apply(
      ChangeToken: js.UndefOr[ChangeToken] = js.undefined): DeleteIPSetResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ChangeToken" -> ChangeToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteIPSetResponse]
    }
  }

  @js.native
  trait DeleteLoggingConfigurationRequest extends js.Object {
    var ResourceArn: ResourceArn
  }

  object DeleteLoggingConfigurationRequest {
    def apply(
      ResourceArn: ResourceArn): DeleteLoggingConfigurationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteLoggingConfigurationRequest]
    }
  }

  @js.native
  trait DeleteLoggingConfigurationResponse extends js.Object {

  }

  object DeleteLoggingConfigurationResponse {
    def apply(): DeleteLoggingConfigurationResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteLoggingConfigurationResponse]
    }
  }

  @js.native
  trait DeletePermissionPolicyRequest extends js.Object {
    var ResourceArn: ResourceArn
  }

  object DeletePermissionPolicyRequest {
    def apply(
      ResourceArn: ResourceArn): DeletePermissionPolicyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeletePermissionPolicyRequest]
    }
  }

  @js.native
  trait DeletePermissionPolicyResponse extends js.Object {

  }

  object DeletePermissionPolicyResponse {
    def apply(): DeletePermissionPolicyResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeletePermissionPolicyResponse]
    }
  }

  @js.native
  trait DeleteRateBasedRuleRequest extends js.Object {
    var ChangeToken: ChangeToken
    var RuleId: ResourceId
  }

  object DeleteRateBasedRuleRequest {
    def apply(
      ChangeToken: ChangeToken,
      RuleId: ResourceId): DeleteRateBasedRuleRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ChangeToken" -> ChangeToken.asInstanceOf[js.Any],
        "RuleId" -> RuleId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteRateBasedRuleRequest]
    }
  }

  @js.native
  trait DeleteRateBasedRuleResponse extends js.Object {
    var ChangeToken: js.UndefOr[ChangeToken]
  }

  object DeleteRateBasedRuleResponse {
    def apply(
      ChangeToken: js.UndefOr[ChangeToken] = js.undefined): DeleteRateBasedRuleResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ChangeToken" -> ChangeToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteRateBasedRuleResponse]
    }
  }

  @js.native
  trait DeleteRegexMatchSetRequest extends js.Object {
    var ChangeToken: ChangeToken
    var RegexMatchSetId: ResourceId
  }

  object DeleteRegexMatchSetRequest {
    def apply(
      ChangeToken: ChangeToken,
      RegexMatchSetId: ResourceId): DeleteRegexMatchSetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ChangeToken" -> ChangeToken.asInstanceOf[js.Any],
        "RegexMatchSetId" -> RegexMatchSetId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteRegexMatchSetRequest]
    }
  }

  @js.native
  trait DeleteRegexMatchSetResponse extends js.Object {
    var ChangeToken: js.UndefOr[ChangeToken]
  }

  object DeleteRegexMatchSetResponse {
    def apply(
      ChangeToken: js.UndefOr[ChangeToken] = js.undefined): DeleteRegexMatchSetResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ChangeToken" -> ChangeToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteRegexMatchSetResponse]
    }
  }

  @js.native
  trait DeleteRegexPatternSetRequest extends js.Object {
    var ChangeToken: ChangeToken
    var RegexPatternSetId: ResourceId
  }

  object DeleteRegexPatternSetRequest {
    def apply(
      ChangeToken: ChangeToken,
      RegexPatternSetId: ResourceId): DeleteRegexPatternSetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ChangeToken" -> ChangeToken.asInstanceOf[js.Any],
        "RegexPatternSetId" -> RegexPatternSetId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteRegexPatternSetRequest]
    }
  }

  @js.native
  trait DeleteRegexPatternSetResponse extends js.Object {
    var ChangeToken: js.UndefOr[ChangeToken]
  }

  object DeleteRegexPatternSetResponse {
    def apply(
      ChangeToken: js.UndefOr[ChangeToken] = js.undefined): DeleteRegexPatternSetResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ChangeToken" -> ChangeToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteRegexPatternSetResponse]
    }
  }

  @js.native
  trait DeleteRuleGroupRequest extends js.Object {
    var ChangeToken: ChangeToken
    var RuleGroupId: ResourceId
  }

  object DeleteRuleGroupRequest {
    def apply(
      ChangeToken: ChangeToken,
      RuleGroupId: ResourceId): DeleteRuleGroupRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ChangeToken" -> ChangeToken.asInstanceOf[js.Any],
        "RuleGroupId" -> RuleGroupId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteRuleGroupRequest]
    }
  }

  @js.native
  trait DeleteRuleGroupResponse extends js.Object {
    var ChangeToken: js.UndefOr[ChangeToken]
  }

  object DeleteRuleGroupResponse {
    def apply(
      ChangeToken: js.UndefOr[ChangeToken] = js.undefined): DeleteRuleGroupResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ChangeToken" -> ChangeToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteRuleGroupResponse]
    }
  }

  @js.native
  trait DeleteRuleRequest extends js.Object {
    var ChangeToken: ChangeToken
    var RuleId: ResourceId
  }

  object DeleteRuleRequest {
    def apply(
      ChangeToken: ChangeToken,
      RuleId: ResourceId): DeleteRuleRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ChangeToken" -> ChangeToken.asInstanceOf[js.Any],
        "RuleId" -> RuleId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteRuleRequest]
    }
  }

  @js.native
  trait DeleteRuleResponse extends js.Object {
    var ChangeToken: js.UndefOr[ChangeToken]
  }

  object DeleteRuleResponse {
    def apply(
      ChangeToken: js.UndefOr[ChangeToken] = js.undefined): DeleteRuleResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ChangeToken" -> ChangeToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteRuleResponse]
    }
  }

  @js.native
  trait DeleteSizeConstraintSetRequest extends js.Object {
    var ChangeToken: ChangeToken
    var SizeConstraintSetId: ResourceId
  }

  object DeleteSizeConstraintSetRequest {
    def apply(
      ChangeToken: ChangeToken,
      SizeConstraintSetId: ResourceId): DeleteSizeConstraintSetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ChangeToken" -> ChangeToken.asInstanceOf[js.Any],
        "SizeConstraintSetId" -> SizeConstraintSetId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteSizeConstraintSetRequest]
    }
  }

  @js.native
  trait DeleteSizeConstraintSetResponse extends js.Object {
    var ChangeToken: js.UndefOr[ChangeToken]
  }

  object DeleteSizeConstraintSetResponse {
    def apply(
      ChangeToken: js.UndefOr[ChangeToken] = js.undefined): DeleteSizeConstraintSetResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ChangeToken" -> ChangeToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteSizeConstraintSetResponse]
    }
  }

  /**
   * A request to delete a '''SqlInjectionMatchSet''' from AWS WAF.
   */
  @js.native
  trait DeleteSqlInjectionMatchSetRequest extends js.Object {
    var ChangeToken: ChangeToken
    var SqlInjectionMatchSetId: ResourceId
  }

  object DeleteSqlInjectionMatchSetRequest {
    def apply(
      ChangeToken: ChangeToken,
      SqlInjectionMatchSetId: ResourceId): DeleteSqlInjectionMatchSetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ChangeToken" -> ChangeToken.asInstanceOf[js.Any],
        "SqlInjectionMatchSetId" -> SqlInjectionMatchSetId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteSqlInjectionMatchSetRequest]
    }
  }

  /**
   * The response to a request to delete a '''SqlInjectionMatchSet''' from AWS WAF.
   */
  @js.native
  trait DeleteSqlInjectionMatchSetResponse extends js.Object {
    var ChangeToken: js.UndefOr[ChangeToken]
  }

  object DeleteSqlInjectionMatchSetResponse {
    def apply(
      ChangeToken: js.UndefOr[ChangeToken] = js.undefined): DeleteSqlInjectionMatchSetResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ChangeToken" -> ChangeToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteSqlInjectionMatchSetResponse]
    }
  }

  @js.native
  trait DeleteWebACLRequest extends js.Object {
    var ChangeToken: ChangeToken
    var WebACLId: ResourceId
  }

  object DeleteWebACLRequest {
    def apply(
      ChangeToken: ChangeToken,
      WebACLId: ResourceId): DeleteWebACLRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ChangeToken" -> ChangeToken.asInstanceOf[js.Any],
        "WebACLId" -> WebACLId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteWebACLRequest]
    }
  }

  @js.native
  trait DeleteWebACLResponse extends js.Object {
    var ChangeToken: js.UndefOr[ChangeToken]
  }

  object DeleteWebACLResponse {
    def apply(
      ChangeToken: js.UndefOr[ChangeToken] = js.undefined): DeleteWebACLResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ChangeToken" -> ChangeToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteWebACLResponse]
    }
  }

  /**
   * A request to delete an '''XssMatchSet''' from AWS WAF.
   */
  @js.native
  trait DeleteXssMatchSetRequest extends js.Object {
    var ChangeToken: ChangeToken
    var XssMatchSetId: ResourceId
  }

  object DeleteXssMatchSetRequest {
    def apply(
      ChangeToken: ChangeToken,
      XssMatchSetId: ResourceId): DeleteXssMatchSetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ChangeToken" -> ChangeToken.asInstanceOf[js.Any],
        "XssMatchSetId" -> XssMatchSetId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteXssMatchSetRequest]
    }
  }

  /**
   * The response to a request to delete an '''XssMatchSet''' from AWS WAF.
   */
  @js.native
  trait DeleteXssMatchSetResponse extends js.Object {
    var ChangeToken: js.UndefOr[ChangeToken]
  }

  object DeleteXssMatchSetResponse {
    def apply(
      ChangeToken: js.UndefOr[ChangeToken] = js.undefined): DeleteXssMatchSetResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ChangeToken" -> ChangeToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteXssMatchSetResponse]
    }
  }

  @js.native
  trait DisassociateWebACLRequest extends js.Object {
    var ResourceArn: ResourceArn
  }

  object DisassociateWebACLRequest {
    def apply(
      ResourceArn: ResourceArn): DisassociateWebACLRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DisassociateWebACLRequest]
    }
  }

  @js.native
  trait DisassociateWebACLResponse extends js.Object {

  }

  object DisassociateWebACLResponse {
    def apply(): DisassociateWebACLResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DisassociateWebACLResponse]
    }
  }

  /**
   * Specifies where in a web request to look for <code>TargetString</code>.
   */
  @js.native
  trait FieldToMatch extends js.Object {
    var Type: MatchFieldType
    var Data: js.UndefOr[MatchFieldData]
  }

  object FieldToMatch {
    def apply(
      Type: MatchFieldType,
      Data: js.UndefOr[MatchFieldData] = js.undefined): FieldToMatch = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Type" -> Type.asInstanceOf[js.Any],
        "Data" -> Data.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[FieldToMatch]
    }
  }

  /**
   * The country from which web requests originate that you want AWS WAF to search for.
   */
  @js.native
  trait GeoMatchConstraint extends js.Object {
    var Type: GeoMatchConstraintType
    var Value: GeoMatchConstraintValue
  }

  object GeoMatchConstraint {
    def apply(
      Type: GeoMatchConstraintType,
      Value: GeoMatchConstraintValue): GeoMatchConstraint = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Type" -> Type.asInstanceOf[js.Any],
        "Value" -> Value.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GeoMatchConstraint]
    }
  }

  object GeoMatchConstraintTypeEnum {
    val Country = "Country"

    val values = IndexedSeq(Country)
  }

  object GeoMatchConstraintValueEnum {
    val AF = "AF"
    val AX = "AX"
    val AL = "AL"
    val DZ = "DZ"
    val AS = "AS"
    val AD = "AD"
    val AO = "AO"
    val AI = "AI"
    val AQ = "AQ"
    val AG = "AG"
    val AR = "AR"
    val AM = "AM"
    val AW = "AW"
    val AU = "AU"
    val AT = "AT"
    val AZ = "AZ"
    val BS = "BS"
    val BH = "BH"
    val BD = "BD"
    val BB = "BB"
    val BY = "BY"
    val BE = "BE"
    val BZ = "BZ"
    val BJ = "BJ"
    val BM = "BM"
    val BT = "BT"
    val BO = "BO"
    val BQ = "BQ"
    val BA = "BA"
    val BW = "BW"
    val BV = "BV"
    val BR = "BR"
    val IO = "IO"
    val BN = "BN"
    val BG = "BG"
    val BF = "BF"
    val BI = "BI"
    val KH = "KH"
    val CM = "CM"
    val CA = "CA"
    val CV = "CV"
    val KY = "KY"
    val CF = "CF"
    val TD = "TD"
    val CL = "CL"
    val CN = "CN"
    val CX = "CX"
    val CC = "CC"
    val CO = "CO"
    val KM = "KM"
    val CG = "CG"
    val CD = "CD"
    val CK = "CK"
    val CR = "CR"
    val CI = "CI"
    val HR = "HR"
    val CU = "CU"
    val CW = "CW"
    val CY = "CY"
    val CZ = "CZ"
    val DK = "DK"
    val DJ = "DJ"
    val DM = "DM"
    val DO = "DO"
    val EC = "EC"
    val EG = "EG"
    val SV = "SV"
    val GQ = "GQ"
    val ER = "ER"
    val EE = "EE"
    val ET = "ET"
    val FK = "FK"
    val FO = "FO"
    val FJ = "FJ"
    val FI = "FI"
    val FR = "FR"
    val GF = "GF"
    val PF = "PF"
    val TF = "TF"
    val GA = "GA"
    val GM = "GM"
    val GE = "GE"
    val DE = "DE"
    val GH = "GH"
    val GI = "GI"
    val GR = "GR"
    val GL = "GL"
    val GD = "GD"
    val GP = "GP"
    val GU = "GU"
    val GT = "GT"
    val GG = "GG"
    val GN = "GN"
    val GW = "GW"
    val GY = "GY"
    val HT = "HT"
    val HM = "HM"
    val VA = "VA"
    val HN = "HN"
    val HK = "HK"
    val HU = "HU"
    val IS = "IS"
    val IN = "IN"
    val ID = "ID"
    val IR = "IR"
    val IQ = "IQ"
    val IE = "IE"
    val IM = "IM"
    val IL = "IL"
    val IT = "IT"
    val JM = "JM"
    val JP = "JP"
    val JE = "JE"
    val JO = "JO"
    val KZ = "KZ"
    val KE = "KE"
    val KI = "KI"
    val KP = "KP"
    val KR = "KR"
    val KW = "KW"
    val KG = "KG"
    val LA = "LA"
    val LV = "LV"
    val LB = "LB"
    val LS = "LS"
    val LR = "LR"
    val LY = "LY"
    val LI = "LI"
    val LT = "LT"
    val LU = "LU"
    val MO = "MO"
    val MK = "MK"
    val MG = "MG"
    val MW = "MW"
    val MY = "MY"
    val MV = "MV"
    val ML = "ML"
    val MT = "MT"
    val MH = "MH"
    val MQ = "MQ"
    val MR = "MR"
    val MU = "MU"
    val YT = "YT"
    val MX = "MX"
    val FM = "FM"
    val MD = "MD"
    val MC = "MC"
    val MN = "MN"
    val ME = "ME"
    val MS = "MS"
    val MA = "MA"
    val MZ = "MZ"
    val MM = "MM"
    val NA = "NA"
    val NR = "NR"
    val NP = "NP"
    val NL = "NL"
    val NC = "NC"
    val NZ = "NZ"
    val NI = "NI"
    val NE = "NE"
    val NG = "NG"
    val NU = "NU"
    val NF = "NF"
    val MP = "MP"
    val NO = "NO"
    val OM = "OM"
    val PK = "PK"
    val PW = "PW"
    val PS = "PS"
    val PA = "PA"
    val PG = "PG"
    val PY = "PY"
    val PE = "PE"
    val PH = "PH"
    val PN = "PN"
    val PL = "PL"
    val PT = "PT"
    val PR = "PR"
    val QA = "QA"
    val RE = "RE"
    val RO = "RO"
    val RU = "RU"
    val RW = "RW"
    val BL = "BL"
    val SH = "SH"
    val KN = "KN"
    val LC = "LC"
    val MF = "MF"
    val PM = "PM"
    val VC = "VC"
    val WS = "WS"
    val SM = "SM"
    val ST = "ST"
    val SA = "SA"
    val SN = "SN"
    val RS = "RS"
    val SC = "SC"
    val SL = "SL"
    val SG = "SG"
    val SX = "SX"
    val SK = "SK"
    val SI = "SI"
    val SB = "SB"
    val SO = "SO"
    val ZA = "ZA"
    val GS = "GS"
    val SS = "SS"
    val ES = "ES"
    val LK = "LK"
    val SD = "SD"
    val SR = "SR"
    val SJ = "SJ"
    val SZ = "SZ"
    val SE = "SE"
    val CH = "CH"
    val SY = "SY"
    val TW = "TW"
    val TJ = "TJ"
    val TZ = "TZ"
    val TH = "TH"
    val TL = "TL"
    val TG = "TG"
    val TK = "TK"
    val TO = "TO"
    val TT = "TT"
    val TN = "TN"
    val TR = "TR"
    val TM = "TM"
    val TC = "TC"
    val TV = "TV"
    val UG = "UG"
    val UA = "UA"
    val AE = "AE"
    val GB = "GB"
    val US = "US"
    val UM = "UM"
    val UY = "UY"
    val UZ = "UZ"
    val VU = "VU"
    val VE = "VE"
    val VN = "VN"
    val VG = "VG"
    val VI = "VI"
    val WF = "WF"
    val EH = "EH"
    val YE = "YE"
    val ZM = "ZM"
    val ZW = "ZW"

    val values = IndexedSeq(AF, AX, AL, DZ, AS, AD, AO, AI, AQ, AG, AR, AM, AW, AU, AT, AZ, BS, BH, BD, BB, BY, BE, BZ, BJ, BM, BT, BO, BQ, BA, BW, BV, BR, IO, BN, BG, BF, BI, KH, CM, CA, CV, KY, CF, TD, CL, CN, CX, CC, CO, KM, CG, CD, CK, CR, CI, HR, CU, CW, CY, CZ, DK, DJ, DM, DO, EC, EG, SV, GQ, ER, EE, ET, FK, FO, FJ, FI, FR, GF, PF, TF, GA, GM, GE, DE, GH, GI, GR, GL, GD, GP, GU, GT, GG, GN, GW, GY, HT, HM, VA, HN, HK, HU, IS, IN, ID, IR, IQ, IE, IM, IL, IT, JM, JP, JE, JO, KZ, KE, KI, KP, KR, KW, KG, LA, LV, LB, LS, LR, LY, LI, LT, LU, MO, MK, MG, MW, MY, MV, ML, MT, MH, MQ, MR, MU, YT, MX, FM, MD, MC, MN, ME, MS, MA, MZ, MM, NA, NR, NP, NL, NC, NZ, NI, NE, NG, NU, NF, MP, NO, OM, PK, PW, PS, PA, PG, PY, PE, PH, PN, PL, PT, PR, QA, RE, RO, RU, RW, BL, SH, KN, LC, MF, PM, VC, WS, SM, ST, SA, SN, RS, SC, SL, SG, SX, SK, SI, SB, SO, ZA, GS, SS, ES, LK, SD, SR, SJ, SZ, SE, CH, SY, TW, TJ, TZ, TH, TL, TG, TK, TO, TT, TN, TR, TM, TC, TV, UG, UA, AE, GB, US, UM, UY, UZ, VU, VE, VN, VG, VI, WF, EH, YE, ZM, ZW)
  }

  /**
   * Contains one or more countries that AWS WAF will search for.
   */
  @js.native
  trait GeoMatchSet extends js.Object {
    var GeoMatchConstraints: GeoMatchConstraints
    var GeoMatchSetId: ResourceId
    var Name: js.UndefOr[ResourceName]
  }

  object GeoMatchSet {
    def apply(
      GeoMatchConstraints: GeoMatchConstraints,
      GeoMatchSetId: ResourceId,
      Name: js.UndefOr[ResourceName] = js.undefined): GeoMatchSet = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GeoMatchConstraints" -> GeoMatchConstraints.asInstanceOf[js.Any],
        "GeoMatchSetId" -> GeoMatchSetId.asInstanceOf[js.Any],
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GeoMatchSet]
    }
  }

  /**
   * Contains the identifier and the name of the <code>GeoMatchSet</code>.
   */
  @js.native
  trait GeoMatchSetSummary extends js.Object {
    var GeoMatchSetId: ResourceId
    var Name: ResourceName
  }

  object GeoMatchSetSummary {
    def apply(
      GeoMatchSetId: ResourceId,
      Name: ResourceName): GeoMatchSetSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GeoMatchSetId" -> GeoMatchSetId.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GeoMatchSetSummary]
    }
  }

  /**
   * Specifies the type of update to perform to an '''GeoMatchSet''' with '''UpdateGeoMatchSet'''.
   */
  @js.native
  trait GeoMatchSetUpdate extends js.Object {
    var Action: ChangeAction
    var GeoMatchConstraint: GeoMatchConstraint
  }

  object GeoMatchSetUpdate {
    def apply(
      Action: ChangeAction,
      GeoMatchConstraint: GeoMatchConstraint): GeoMatchSetUpdate = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Action" -> Action.asInstanceOf[js.Any],
        "GeoMatchConstraint" -> GeoMatchConstraint.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GeoMatchSetUpdate]
    }
  }

  @js.native
  trait GetByteMatchSetRequest extends js.Object {
    var ByteMatchSetId: ResourceId
  }

  object GetByteMatchSetRequest {
    def apply(
      ByteMatchSetId: ResourceId): GetByteMatchSetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ByteMatchSetId" -> ByteMatchSetId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetByteMatchSetRequest]
    }
  }

  @js.native
  trait GetByteMatchSetResponse extends js.Object {
    var ByteMatchSet: js.UndefOr[ByteMatchSet]
  }

  object GetByteMatchSetResponse {
    def apply(
      ByteMatchSet: js.UndefOr[ByteMatchSet] = js.undefined): GetByteMatchSetResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ByteMatchSet" -> ByteMatchSet.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetByteMatchSetResponse]
    }
  }

  @js.native
  trait GetChangeTokenRequest extends js.Object {

  }

  object GetChangeTokenRequest {
    def apply(): GetChangeTokenRequest = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetChangeTokenRequest]
    }
  }

  @js.native
  trait GetChangeTokenResponse extends js.Object {
    var ChangeToken: js.UndefOr[ChangeToken]
  }

  object GetChangeTokenResponse {
    def apply(
      ChangeToken: js.UndefOr[ChangeToken] = js.undefined): GetChangeTokenResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ChangeToken" -> ChangeToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetChangeTokenResponse]
    }
  }

  @js.native
  trait GetChangeTokenStatusRequest extends js.Object {
    var ChangeToken: ChangeToken
  }

  object GetChangeTokenStatusRequest {
    def apply(
      ChangeToken: ChangeToken): GetChangeTokenStatusRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ChangeToken" -> ChangeToken.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetChangeTokenStatusRequest]
    }
  }

  @js.native
  trait GetChangeTokenStatusResponse extends js.Object {
    var ChangeTokenStatus: js.UndefOr[ChangeTokenStatus]
  }

  object GetChangeTokenStatusResponse {
    def apply(
      ChangeTokenStatus: js.UndefOr[ChangeTokenStatus] = js.undefined): GetChangeTokenStatusResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ChangeTokenStatus" -> ChangeTokenStatus.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetChangeTokenStatusResponse]
    }
  }

  @js.native
  trait GetGeoMatchSetRequest extends js.Object {
    var GeoMatchSetId: ResourceId
  }

  object GetGeoMatchSetRequest {
    def apply(
      GeoMatchSetId: ResourceId): GetGeoMatchSetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GeoMatchSetId" -> GeoMatchSetId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetGeoMatchSetRequest]
    }
  }

  @js.native
  trait GetGeoMatchSetResponse extends js.Object {
    var GeoMatchSet: js.UndefOr[GeoMatchSet]
  }

  object GetGeoMatchSetResponse {
    def apply(
      GeoMatchSet: js.UndefOr[GeoMatchSet] = js.undefined): GetGeoMatchSetResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GeoMatchSet" -> GeoMatchSet.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetGeoMatchSetResponse]
    }
  }

  @js.native
  trait GetIPSetRequest extends js.Object {
    var IPSetId: ResourceId
  }

  object GetIPSetRequest {
    def apply(
      IPSetId: ResourceId): GetIPSetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IPSetId" -> IPSetId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetIPSetRequest]
    }
  }

  @js.native
  trait GetIPSetResponse extends js.Object {
    var IPSet: js.UndefOr[IPSet]
  }

  object GetIPSetResponse {
    def apply(
      IPSet: js.UndefOr[IPSet] = js.undefined): GetIPSetResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IPSet" -> IPSet.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetIPSetResponse]
    }
  }

  @js.native
  trait GetLoggingConfigurationRequest extends js.Object {
    var ResourceArn: ResourceArn
  }

  object GetLoggingConfigurationRequest {
    def apply(
      ResourceArn: ResourceArn): GetLoggingConfigurationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetLoggingConfigurationRequest]
    }
  }

  @js.native
  trait GetLoggingConfigurationResponse extends js.Object {
    var LoggingConfiguration: js.UndefOr[LoggingConfiguration]
  }

  object GetLoggingConfigurationResponse {
    def apply(
      LoggingConfiguration: js.UndefOr[LoggingConfiguration] = js.undefined): GetLoggingConfigurationResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LoggingConfiguration" -> LoggingConfiguration.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetLoggingConfigurationResponse]
    }
  }

  @js.native
  trait GetPermissionPolicyRequest extends js.Object {
    var ResourceArn: ResourceArn
  }

  object GetPermissionPolicyRequest {
    def apply(
      ResourceArn: ResourceArn): GetPermissionPolicyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetPermissionPolicyRequest]
    }
  }

  @js.native
  trait GetPermissionPolicyResponse extends js.Object {
    var Policy: js.UndefOr[PolicyString]
  }

  object GetPermissionPolicyResponse {
    def apply(
      Policy: js.UndefOr[PolicyString] = js.undefined): GetPermissionPolicyResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Policy" -> Policy.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetPermissionPolicyResponse]
    }
  }

  @js.native
  trait GetRateBasedRuleManagedKeysRequest extends js.Object {
    var RuleId: ResourceId
    var NextMarker: js.UndefOr[NextMarker]
  }

  object GetRateBasedRuleManagedKeysRequest {
    def apply(
      RuleId: ResourceId,
      NextMarker: js.UndefOr[NextMarker] = js.undefined): GetRateBasedRuleManagedKeysRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RuleId" -> RuleId.asInstanceOf[js.Any],
        "NextMarker" -> NextMarker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetRateBasedRuleManagedKeysRequest]
    }
  }

  @js.native
  trait GetRateBasedRuleManagedKeysResponse extends js.Object {
    var ManagedKeys: js.UndefOr[ManagedKeys]
    var NextMarker: js.UndefOr[NextMarker]
  }

  object GetRateBasedRuleManagedKeysResponse {
    def apply(
      ManagedKeys: js.UndefOr[ManagedKeys] = js.undefined,
      NextMarker: js.UndefOr[NextMarker] = js.undefined): GetRateBasedRuleManagedKeysResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ManagedKeys" -> ManagedKeys.map { x => x.asInstanceOf[js.Any] },
        "NextMarker" -> NextMarker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetRateBasedRuleManagedKeysResponse]
    }
  }

  @js.native
  trait GetRateBasedRuleRequest extends js.Object {
    var RuleId: ResourceId
  }

  object GetRateBasedRuleRequest {
    def apply(
      RuleId: ResourceId): GetRateBasedRuleRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RuleId" -> RuleId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetRateBasedRuleRequest]
    }
  }

  @js.native
  trait GetRateBasedRuleResponse extends js.Object {
    var Rule: js.UndefOr[RateBasedRule]
  }

  object GetRateBasedRuleResponse {
    def apply(
      Rule: js.UndefOr[RateBasedRule] = js.undefined): GetRateBasedRuleResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Rule" -> Rule.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetRateBasedRuleResponse]
    }
  }

  @js.native
  trait GetRegexMatchSetRequest extends js.Object {
    var RegexMatchSetId: ResourceId
  }

  object GetRegexMatchSetRequest {
    def apply(
      RegexMatchSetId: ResourceId): GetRegexMatchSetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RegexMatchSetId" -> RegexMatchSetId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetRegexMatchSetRequest]
    }
  }

  @js.native
  trait GetRegexMatchSetResponse extends js.Object {
    var RegexMatchSet: js.UndefOr[RegexMatchSet]
  }

  object GetRegexMatchSetResponse {
    def apply(
      RegexMatchSet: js.UndefOr[RegexMatchSet] = js.undefined): GetRegexMatchSetResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RegexMatchSet" -> RegexMatchSet.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetRegexMatchSetResponse]
    }
  }

  @js.native
  trait GetRegexPatternSetRequest extends js.Object {
    var RegexPatternSetId: ResourceId
  }

  object GetRegexPatternSetRequest {
    def apply(
      RegexPatternSetId: ResourceId): GetRegexPatternSetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RegexPatternSetId" -> RegexPatternSetId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetRegexPatternSetRequest]
    }
  }

  @js.native
  trait GetRegexPatternSetResponse extends js.Object {
    var RegexPatternSet: js.UndefOr[RegexPatternSet]
  }

  object GetRegexPatternSetResponse {
    def apply(
      RegexPatternSet: js.UndefOr[RegexPatternSet] = js.undefined): GetRegexPatternSetResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RegexPatternSet" -> RegexPatternSet.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetRegexPatternSetResponse]
    }
  }

  @js.native
  trait GetRuleGroupRequest extends js.Object {
    var RuleGroupId: ResourceId
  }

  object GetRuleGroupRequest {
    def apply(
      RuleGroupId: ResourceId): GetRuleGroupRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RuleGroupId" -> RuleGroupId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetRuleGroupRequest]
    }
  }

  @js.native
  trait GetRuleGroupResponse extends js.Object {
    var RuleGroup: js.UndefOr[RuleGroup]
  }

  object GetRuleGroupResponse {
    def apply(
      RuleGroup: js.UndefOr[RuleGroup] = js.undefined): GetRuleGroupResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RuleGroup" -> RuleGroup.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetRuleGroupResponse]
    }
  }

  @js.native
  trait GetRuleRequest extends js.Object {
    var RuleId: ResourceId
  }

  object GetRuleRequest {
    def apply(
      RuleId: ResourceId): GetRuleRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RuleId" -> RuleId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetRuleRequest]
    }
  }

  @js.native
  trait GetRuleResponse extends js.Object {
    var Rule: js.UndefOr[Rule]
  }

  object GetRuleResponse {
    def apply(
      Rule: js.UndefOr[Rule] = js.undefined): GetRuleResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Rule" -> Rule.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetRuleResponse]
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
    def apply(
      MaxItems: GetSampledRequestsMaxItems,
      RuleId: ResourceId,
      TimeWindow: TimeWindow,
      WebAclId: ResourceId): GetSampledRequestsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MaxItems" -> MaxItems.asInstanceOf[js.Any],
        "RuleId" -> RuleId.asInstanceOf[js.Any],
        "TimeWindow" -> TimeWindow.asInstanceOf[js.Any],
        "WebAclId" -> WebAclId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetSampledRequestsRequest]
    }
  }

  @js.native
  trait GetSampledRequestsResponse extends js.Object {
    var PopulationSize: js.UndefOr[PopulationSize]
    var SampledRequests: js.UndefOr[SampledHTTPRequests]
    var TimeWindow: js.UndefOr[TimeWindow]
  }

  object GetSampledRequestsResponse {
    def apply(
      PopulationSize: js.UndefOr[PopulationSize] = js.undefined,
      SampledRequests: js.UndefOr[SampledHTTPRequests] = js.undefined,
      TimeWindow: js.UndefOr[TimeWindow] = js.undefined): GetSampledRequestsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PopulationSize" -> PopulationSize.map { x => x.asInstanceOf[js.Any] },
        "SampledRequests" -> SampledRequests.map { x => x.asInstanceOf[js.Any] },
        "TimeWindow" -> TimeWindow.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetSampledRequestsResponse]
    }
  }

  @js.native
  trait GetSizeConstraintSetRequest extends js.Object {
    var SizeConstraintSetId: ResourceId
  }

  object GetSizeConstraintSetRequest {
    def apply(
      SizeConstraintSetId: ResourceId): GetSizeConstraintSetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SizeConstraintSetId" -> SizeConstraintSetId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetSizeConstraintSetRequest]
    }
  }

  @js.native
  trait GetSizeConstraintSetResponse extends js.Object {
    var SizeConstraintSet: js.UndefOr[SizeConstraintSet]
  }

  object GetSizeConstraintSetResponse {
    def apply(
      SizeConstraintSet: js.UndefOr[SizeConstraintSet] = js.undefined): GetSizeConstraintSetResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SizeConstraintSet" -> SizeConstraintSet.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetSizeConstraintSetResponse]
    }
  }

  /**
   * A request to get a '''SqlInjectionMatchSet'''.
   */
  @js.native
  trait GetSqlInjectionMatchSetRequest extends js.Object {
    var SqlInjectionMatchSetId: ResourceId
  }

  object GetSqlInjectionMatchSetRequest {
    def apply(
      SqlInjectionMatchSetId: ResourceId): GetSqlInjectionMatchSetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SqlInjectionMatchSetId" -> SqlInjectionMatchSetId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetSqlInjectionMatchSetRequest]
    }
  }

  /**
   * The response to a '''GetSqlInjectionMatchSet''' request.
   */
  @js.native
  trait GetSqlInjectionMatchSetResponse extends js.Object {
    var SqlInjectionMatchSet: js.UndefOr[SqlInjectionMatchSet]
  }

  object GetSqlInjectionMatchSetResponse {
    def apply(
      SqlInjectionMatchSet: js.UndefOr[SqlInjectionMatchSet] = js.undefined): GetSqlInjectionMatchSetResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SqlInjectionMatchSet" -> SqlInjectionMatchSet.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetSqlInjectionMatchSetResponse]
    }
  }

  @js.native
  trait GetWebACLForResourceRequest extends js.Object {
    var ResourceArn: ResourceArn
  }

  object GetWebACLForResourceRequest {
    def apply(
      ResourceArn: ResourceArn): GetWebACLForResourceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetWebACLForResourceRequest]
    }
  }

  @js.native
  trait GetWebACLForResourceResponse extends js.Object {
    var WebACLSummary: js.UndefOr[WebACLSummary]
  }

  object GetWebACLForResourceResponse {
    def apply(
      WebACLSummary: js.UndefOr[WebACLSummary] = js.undefined): GetWebACLForResourceResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "WebACLSummary" -> WebACLSummary.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetWebACLForResourceResponse]
    }
  }

  @js.native
  trait GetWebACLRequest extends js.Object {
    var WebACLId: ResourceId
  }

  object GetWebACLRequest {
    def apply(
      WebACLId: ResourceId): GetWebACLRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "WebACLId" -> WebACLId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetWebACLRequest]
    }
  }

  @js.native
  trait GetWebACLResponse extends js.Object {
    var WebACL: js.UndefOr[WebACL]
  }

  object GetWebACLResponse {
    def apply(
      WebACL: js.UndefOr[WebACL] = js.undefined): GetWebACLResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "WebACL" -> WebACL.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetWebACLResponse]
    }
  }

  /**
   * A request to get an '''XssMatchSet'''.
   */
  @js.native
  trait GetXssMatchSetRequest extends js.Object {
    var XssMatchSetId: ResourceId
  }

  object GetXssMatchSetRequest {
    def apply(
      XssMatchSetId: ResourceId): GetXssMatchSetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "XssMatchSetId" -> XssMatchSetId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetXssMatchSetRequest]
    }
  }

  /**
   * The response to a '''GetXssMatchSet''' request.
   */
  @js.native
  trait GetXssMatchSetResponse extends js.Object {
    var XssMatchSet: js.UndefOr[XssMatchSet]
  }

  object GetXssMatchSetResponse {
    def apply(
      XssMatchSet: js.UndefOr[XssMatchSet] = js.undefined): GetXssMatchSetResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "XssMatchSet" -> XssMatchSet.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetXssMatchSetResponse]
    }
  }

  /**
   * The response from a '''GetSampledRequests''' request includes an <code>HTTPHeader</code> complex type that appears as <code>Headers</code> in the response syntax. <code>HTTPHeader</code> contains the names and values of all of the headers that appear in one of the web requests that were returned by <code>GetSampledRequests</code>.
   */
  @js.native
  trait HTTPHeader extends js.Object {
    var Name: js.UndefOr[HeaderName]
    var Value: js.UndefOr[HeaderValue]
  }

  object HTTPHeader {
    def apply(
      Name: js.UndefOr[HeaderName] = js.undefined,
      Value: js.UndefOr[HeaderValue] = js.undefined): HTTPHeader = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "Value" -> Value.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[HTTPHeader]
    }
  }

  /**
   * The response from a '''GetSampledRequests''' request includes an <code>HTTPRequest</code> complex type that appears as <code>Request</code> in the response syntax. <code>HTTPRequest</code> contains information about one of the web requests that were returned by <code>GetSampledRequests</code>.
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
    def apply(
      ClientIP: js.UndefOr[IPString] = js.undefined,
      Country: js.UndefOr[Country] = js.undefined,
      HTTPVersion: js.UndefOr[HTTPVersion] = js.undefined,
      Headers: js.UndefOr[HTTPHeaders] = js.undefined,
      Method: js.UndefOr[HTTPMethod] = js.undefined,
      URI: js.UndefOr[URIString] = js.undefined): HTTPRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ClientIP" -> ClientIP.map { x => x.asInstanceOf[js.Any] },
        "Country" -> Country.map { x => x.asInstanceOf[js.Any] },
        "HTTPVersion" -> HTTPVersion.map { x => x.asInstanceOf[js.Any] },
        "Headers" -> Headers.map { x => x.asInstanceOf[js.Any] },
        "Method" -> Method.map { x => x.asInstanceOf[js.Any] },
        "URI" -> URI.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[HTTPRequest]
    }
  }

  /**
   * Contains one or more IP addresses or blocks of IP addresses specified in Classless Inter-Domain Routing (CIDR) notation. AWS WAF supports IPv4 address ranges: /8 and any range between /16 through /32. AWS WAF supports IPv6 address ranges: /16, /24, /32, /48, /56, /64, and /128.
   *  To specify an individual IP address, you specify the four-part IP address followed by a <code>/32</code>, for example, 192.0.2.0/31. To block a range of IP addresses, you can specify /8 or any range between /16 through /32 (for IPv4) or /16, /24, /32, /48, /56, /64, or /128 (for IPv6). For more information about CIDR notation, see the Wikipedia entry <a href="https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing">Classless Inter-Domain Routing</a>.
   */
  @js.native
  trait IPSet extends js.Object {
    var IPSetDescriptors: IPSetDescriptors
    var IPSetId: ResourceId
    var Name: js.UndefOr[ResourceName]
  }

  object IPSet {
    def apply(
      IPSetDescriptors: IPSetDescriptors,
      IPSetId: ResourceId,
      Name: js.UndefOr[ResourceName] = js.undefined): IPSet = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IPSetDescriptors" -> IPSetDescriptors.asInstanceOf[js.Any],
        "IPSetId" -> IPSetId.asInstanceOf[js.Any],
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[IPSet]
    }
  }

  /**
   * Specifies the IP address type (<code>IPV4</code> or <code>IPV6</code>) and the IP address range (in CIDR format) that web requests originate from.
   */
  @js.native
  trait IPSetDescriptor extends js.Object {
    var Type: IPSetDescriptorType
    var Value: IPSetDescriptorValue
  }

  object IPSetDescriptor {
    def apply(
      Type: IPSetDescriptorType,
      Value: IPSetDescriptorValue): IPSetDescriptor = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Type" -> Type.asInstanceOf[js.Any],
        "Value" -> Value.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[IPSetDescriptor]
    }
  }

  object IPSetDescriptorTypeEnum {
    val IPV4 = "IPV4"
    val IPV6 = "IPV6"

    val values = IndexedSeq(IPV4, IPV6)
  }

  /**
   * Contains the identifier and the name of the <code>IPSet</code>.
   */
  @js.native
  trait IPSetSummary extends js.Object {
    var IPSetId: ResourceId
    var Name: ResourceName
  }

  object IPSetSummary {
    def apply(
      IPSetId: ResourceId,
      Name: ResourceName): IPSetSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IPSetId" -> IPSetId.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[IPSetSummary]
    }
  }

  /**
   * Specifies the type of update to perform to an '''IPSet''' with '''UpdateIPSet'''.
   */
  @js.native
  trait IPSetUpdate extends js.Object {
    var Action: ChangeAction
    var IPSetDescriptor: IPSetDescriptor
  }

  object IPSetUpdate {
    def apply(
      Action: ChangeAction,
      IPSetDescriptor: IPSetDescriptor): IPSetUpdate = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Action" -> Action.asInstanceOf[js.Any],
        "IPSetDescriptor" -> IPSetDescriptor.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[IPSetUpdate]
    }
  }

  @js.native
  trait ListActivatedRulesInRuleGroupRequest extends js.Object {
    var Limit: js.UndefOr[PaginationLimit]
    var NextMarker: js.UndefOr[NextMarker]
    var RuleGroupId: js.UndefOr[ResourceId]
  }

  object ListActivatedRulesInRuleGroupRequest {
    def apply(
      Limit: js.UndefOr[PaginationLimit] = js.undefined,
      NextMarker: js.UndefOr[NextMarker] = js.undefined,
      RuleGroupId: js.UndefOr[ResourceId] = js.undefined): ListActivatedRulesInRuleGroupRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Limit" -> Limit.map { x => x.asInstanceOf[js.Any] },
        "NextMarker" -> NextMarker.map { x => x.asInstanceOf[js.Any] },
        "RuleGroupId" -> RuleGroupId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListActivatedRulesInRuleGroupRequest]
    }
  }

  @js.native
  trait ListActivatedRulesInRuleGroupResponse extends js.Object {
    var ActivatedRules: js.UndefOr[ActivatedRules]
    var NextMarker: js.UndefOr[NextMarker]
  }

  object ListActivatedRulesInRuleGroupResponse {
    def apply(
      ActivatedRules: js.UndefOr[ActivatedRules] = js.undefined,
      NextMarker: js.UndefOr[NextMarker] = js.undefined): ListActivatedRulesInRuleGroupResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ActivatedRules" -> ActivatedRules.map { x => x.asInstanceOf[js.Any] },
        "NextMarker" -> NextMarker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListActivatedRulesInRuleGroupResponse]
    }
  }

  @js.native
  trait ListByteMatchSetsRequest extends js.Object {
    var Limit: js.UndefOr[PaginationLimit]
    var NextMarker: js.UndefOr[NextMarker]
  }

  object ListByteMatchSetsRequest {
    def apply(
      Limit: js.UndefOr[PaginationLimit] = js.undefined,
      NextMarker: js.UndefOr[NextMarker] = js.undefined): ListByteMatchSetsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Limit" -> Limit.map { x => x.asInstanceOf[js.Any] },
        "NextMarker" -> NextMarker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListByteMatchSetsRequest]
    }
  }

  @js.native
  trait ListByteMatchSetsResponse extends js.Object {
    var ByteMatchSets: js.UndefOr[ByteMatchSetSummaries]
    var NextMarker: js.UndefOr[NextMarker]
  }

  object ListByteMatchSetsResponse {
    def apply(
      ByteMatchSets: js.UndefOr[ByteMatchSetSummaries] = js.undefined,
      NextMarker: js.UndefOr[NextMarker] = js.undefined): ListByteMatchSetsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ByteMatchSets" -> ByteMatchSets.map { x => x.asInstanceOf[js.Any] },
        "NextMarker" -> NextMarker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListByteMatchSetsResponse]
    }
  }

  @js.native
  trait ListGeoMatchSetsRequest extends js.Object {
    var Limit: js.UndefOr[PaginationLimit]
    var NextMarker: js.UndefOr[NextMarker]
  }

  object ListGeoMatchSetsRequest {
    def apply(
      Limit: js.UndefOr[PaginationLimit] = js.undefined,
      NextMarker: js.UndefOr[NextMarker] = js.undefined): ListGeoMatchSetsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Limit" -> Limit.map { x => x.asInstanceOf[js.Any] },
        "NextMarker" -> NextMarker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListGeoMatchSetsRequest]
    }
  }

  @js.native
  trait ListGeoMatchSetsResponse extends js.Object {
    var GeoMatchSets: js.UndefOr[GeoMatchSetSummaries]
    var NextMarker: js.UndefOr[NextMarker]
  }

  object ListGeoMatchSetsResponse {
    def apply(
      GeoMatchSets: js.UndefOr[GeoMatchSetSummaries] = js.undefined,
      NextMarker: js.UndefOr[NextMarker] = js.undefined): ListGeoMatchSetsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GeoMatchSets" -> GeoMatchSets.map { x => x.asInstanceOf[js.Any] },
        "NextMarker" -> NextMarker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListGeoMatchSetsResponse]
    }
  }

  @js.native
  trait ListIPSetsRequest extends js.Object {
    var Limit: js.UndefOr[PaginationLimit]
    var NextMarker: js.UndefOr[NextMarker]
  }

  object ListIPSetsRequest {
    def apply(
      Limit: js.UndefOr[PaginationLimit] = js.undefined,
      NextMarker: js.UndefOr[NextMarker] = js.undefined): ListIPSetsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Limit" -> Limit.map { x => x.asInstanceOf[js.Any] },
        "NextMarker" -> NextMarker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListIPSetsRequest]
    }
  }

  @js.native
  trait ListIPSetsResponse extends js.Object {
    var IPSets: js.UndefOr[IPSetSummaries]
    var NextMarker: js.UndefOr[NextMarker]
  }

  object ListIPSetsResponse {
    def apply(
      IPSets: js.UndefOr[IPSetSummaries] = js.undefined,
      NextMarker: js.UndefOr[NextMarker] = js.undefined): ListIPSetsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IPSets" -> IPSets.map { x => x.asInstanceOf[js.Any] },
        "NextMarker" -> NextMarker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListIPSetsResponse]
    }
  }

  @js.native
  trait ListLoggingConfigurationsRequest extends js.Object {
    var Limit: js.UndefOr[PaginationLimit]
    var NextMarker: js.UndefOr[NextMarker]
  }

  object ListLoggingConfigurationsRequest {
    def apply(
      Limit: js.UndefOr[PaginationLimit] = js.undefined,
      NextMarker: js.UndefOr[NextMarker] = js.undefined): ListLoggingConfigurationsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Limit" -> Limit.map { x => x.asInstanceOf[js.Any] },
        "NextMarker" -> NextMarker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListLoggingConfigurationsRequest]
    }
  }

  @js.native
  trait ListLoggingConfigurationsResponse extends js.Object {
    var LoggingConfigurations: js.UndefOr[LoggingConfigurations]
    var NextMarker: js.UndefOr[NextMarker]
  }

  object ListLoggingConfigurationsResponse {
    def apply(
      LoggingConfigurations: js.UndefOr[LoggingConfigurations] = js.undefined,
      NextMarker: js.UndefOr[NextMarker] = js.undefined): ListLoggingConfigurationsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LoggingConfigurations" -> LoggingConfigurations.map { x => x.asInstanceOf[js.Any] },
        "NextMarker" -> NextMarker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListLoggingConfigurationsResponse]
    }
  }

  @js.native
  trait ListRateBasedRulesRequest extends js.Object {
    var Limit: js.UndefOr[PaginationLimit]
    var NextMarker: js.UndefOr[NextMarker]
  }

  object ListRateBasedRulesRequest {
    def apply(
      Limit: js.UndefOr[PaginationLimit] = js.undefined,
      NextMarker: js.UndefOr[NextMarker] = js.undefined): ListRateBasedRulesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Limit" -> Limit.map { x => x.asInstanceOf[js.Any] },
        "NextMarker" -> NextMarker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListRateBasedRulesRequest]
    }
  }

  @js.native
  trait ListRateBasedRulesResponse extends js.Object {
    var NextMarker: js.UndefOr[NextMarker]
    var Rules: js.UndefOr[RuleSummaries]
  }

  object ListRateBasedRulesResponse {
    def apply(
      NextMarker: js.UndefOr[NextMarker] = js.undefined,
      Rules: js.UndefOr[RuleSummaries] = js.undefined): ListRateBasedRulesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextMarker" -> NextMarker.map { x => x.asInstanceOf[js.Any] },
        "Rules" -> Rules.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListRateBasedRulesResponse]
    }
  }

  @js.native
  trait ListRegexMatchSetsRequest extends js.Object {
    var Limit: js.UndefOr[PaginationLimit]
    var NextMarker: js.UndefOr[NextMarker]
  }

  object ListRegexMatchSetsRequest {
    def apply(
      Limit: js.UndefOr[PaginationLimit] = js.undefined,
      NextMarker: js.UndefOr[NextMarker] = js.undefined): ListRegexMatchSetsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Limit" -> Limit.map { x => x.asInstanceOf[js.Any] },
        "NextMarker" -> NextMarker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListRegexMatchSetsRequest]
    }
  }

  @js.native
  trait ListRegexMatchSetsResponse extends js.Object {
    var NextMarker: js.UndefOr[NextMarker]
    var RegexMatchSets: js.UndefOr[RegexMatchSetSummaries]
  }

  object ListRegexMatchSetsResponse {
    def apply(
      NextMarker: js.UndefOr[NextMarker] = js.undefined,
      RegexMatchSets: js.UndefOr[RegexMatchSetSummaries] = js.undefined): ListRegexMatchSetsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextMarker" -> NextMarker.map { x => x.asInstanceOf[js.Any] },
        "RegexMatchSets" -> RegexMatchSets.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListRegexMatchSetsResponse]
    }
  }

  @js.native
  trait ListRegexPatternSetsRequest extends js.Object {
    var Limit: js.UndefOr[PaginationLimit]
    var NextMarker: js.UndefOr[NextMarker]
  }

  object ListRegexPatternSetsRequest {
    def apply(
      Limit: js.UndefOr[PaginationLimit] = js.undefined,
      NextMarker: js.UndefOr[NextMarker] = js.undefined): ListRegexPatternSetsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Limit" -> Limit.map { x => x.asInstanceOf[js.Any] },
        "NextMarker" -> NextMarker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListRegexPatternSetsRequest]
    }
  }

  @js.native
  trait ListRegexPatternSetsResponse extends js.Object {
    var NextMarker: js.UndefOr[NextMarker]
    var RegexPatternSets: js.UndefOr[RegexPatternSetSummaries]
  }

  object ListRegexPatternSetsResponse {
    def apply(
      NextMarker: js.UndefOr[NextMarker] = js.undefined,
      RegexPatternSets: js.UndefOr[RegexPatternSetSummaries] = js.undefined): ListRegexPatternSetsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextMarker" -> NextMarker.map { x => x.asInstanceOf[js.Any] },
        "RegexPatternSets" -> RegexPatternSets.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListRegexPatternSetsResponse]
    }
  }

  @js.native
  trait ListResourcesForWebACLRequest extends js.Object {
    var WebACLId: ResourceId
    var ResourceType: js.UndefOr[ResourceType]
  }

  object ListResourcesForWebACLRequest {
    def apply(
      WebACLId: ResourceId,
      ResourceType: js.UndefOr[ResourceType] = js.undefined): ListResourcesForWebACLRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "WebACLId" -> WebACLId.asInstanceOf[js.Any],
        "ResourceType" -> ResourceType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListResourcesForWebACLRequest]
    }
  }

  @js.native
  trait ListResourcesForWebACLResponse extends js.Object {
    var ResourceArns: js.UndefOr[ResourceArns]
  }

  object ListResourcesForWebACLResponse {
    def apply(
      ResourceArns: js.UndefOr[ResourceArns] = js.undefined): ListResourcesForWebACLResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceArns" -> ResourceArns.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListResourcesForWebACLResponse]
    }
  }

  @js.native
  trait ListRuleGroupsRequest extends js.Object {
    var Limit: js.UndefOr[PaginationLimit]
    var NextMarker: js.UndefOr[NextMarker]
  }

  object ListRuleGroupsRequest {
    def apply(
      Limit: js.UndefOr[PaginationLimit] = js.undefined,
      NextMarker: js.UndefOr[NextMarker] = js.undefined): ListRuleGroupsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Limit" -> Limit.map { x => x.asInstanceOf[js.Any] },
        "NextMarker" -> NextMarker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListRuleGroupsRequest]
    }
  }

  @js.native
  trait ListRuleGroupsResponse extends js.Object {
    var NextMarker: js.UndefOr[NextMarker]
    var RuleGroups: js.UndefOr[RuleGroupSummaries]
  }

  object ListRuleGroupsResponse {
    def apply(
      NextMarker: js.UndefOr[NextMarker] = js.undefined,
      RuleGroups: js.UndefOr[RuleGroupSummaries] = js.undefined): ListRuleGroupsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextMarker" -> NextMarker.map { x => x.asInstanceOf[js.Any] },
        "RuleGroups" -> RuleGroups.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListRuleGroupsResponse]
    }
  }

  @js.native
  trait ListRulesRequest extends js.Object {
    var Limit: js.UndefOr[PaginationLimit]
    var NextMarker: js.UndefOr[NextMarker]
  }

  object ListRulesRequest {
    def apply(
      Limit: js.UndefOr[PaginationLimit] = js.undefined,
      NextMarker: js.UndefOr[NextMarker] = js.undefined): ListRulesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Limit" -> Limit.map { x => x.asInstanceOf[js.Any] },
        "NextMarker" -> NextMarker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListRulesRequest]
    }
  }

  @js.native
  trait ListRulesResponse extends js.Object {
    var NextMarker: js.UndefOr[NextMarker]
    var Rules: js.UndefOr[RuleSummaries]
  }

  object ListRulesResponse {
    def apply(
      NextMarker: js.UndefOr[NextMarker] = js.undefined,
      Rules: js.UndefOr[RuleSummaries] = js.undefined): ListRulesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextMarker" -> NextMarker.map { x => x.asInstanceOf[js.Any] },
        "Rules" -> Rules.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListRulesResponse]
    }
  }

  @js.native
  trait ListSizeConstraintSetsRequest extends js.Object {
    var Limit: js.UndefOr[PaginationLimit]
    var NextMarker: js.UndefOr[NextMarker]
  }

  object ListSizeConstraintSetsRequest {
    def apply(
      Limit: js.UndefOr[PaginationLimit] = js.undefined,
      NextMarker: js.UndefOr[NextMarker] = js.undefined): ListSizeConstraintSetsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Limit" -> Limit.map { x => x.asInstanceOf[js.Any] },
        "NextMarker" -> NextMarker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListSizeConstraintSetsRequest]
    }
  }

  @js.native
  trait ListSizeConstraintSetsResponse extends js.Object {
    var NextMarker: js.UndefOr[NextMarker]
    var SizeConstraintSets: js.UndefOr[SizeConstraintSetSummaries]
  }

  object ListSizeConstraintSetsResponse {
    def apply(
      NextMarker: js.UndefOr[NextMarker] = js.undefined,
      SizeConstraintSets: js.UndefOr[SizeConstraintSetSummaries] = js.undefined): ListSizeConstraintSetsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextMarker" -> NextMarker.map { x => x.asInstanceOf[js.Any] },
        "SizeConstraintSets" -> SizeConstraintSets.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListSizeConstraintSetsResponse]
    }
  }

  /**
   * A request to list the '''SqlInjectionMatchSet''' objects created by the current AWS account.
   */
  @js.native
  trait ListSqlInjectionMatchSetsRequest extends js.Object {
    var Limit: js.UndefOr[PaginationLimit]
    var NextMarker: js.UndefOr[NextMarker]
  }

  object ListSqlInjectionMatchSetsRequest {
    def apply(
      Limit: js.UndefOr[PaginationLimit] = js.undefined,
      NextMarker: js.UndefOr[NextMarker] = js.undefined): ListSqlInjectionMatchSetsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Limit" -> Limit.map { x => x.asInstanceOf[js.Any] },
        "NextMarker" -> NextMarker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListSqlInjectionMatchSetsRequest]
    }
  }

  /**
   * The response to a '''ListSqlInjectionMatchSets''' request.
   */
  @js.native
  trait ListSqlInjectionMatchSetsResponse extends js.Object {
    var NextMarker: js.UndefOr[NextMarker]
    var SqlInjectionMatchSets: js.UndefOr[SqlInjectionMatchSetSummaries]
  }

  object ListSqlInjectionMatchSetsResponse {
    def apply(
      NextMarker: js.UndefOr[NextMarker] = js.undefined,
      SqlInjectionMatchSets: js.UndefOr[SqlInjectionMatchSetSummaries] = js.undefined): ListSqlInjectionMatchSetsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextMarker" -> NextMarker.map { x => x.asInstanceOf[js.Any] },
        "SqlInjectionMatchSets" -> SqlInjectionMatchSets.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListSqlInjectionMatchSetsResponse]
    }
  }

  @js.native
  trait ListSubscribedRuleGroupsRequest extends js.Object {
    var Limit: js.UndefOr[PaginationLimit]
    var NextMarker: js.UndefOr[NextMarker]
  }

  object ListSubscribedRuleGroupsRequest {
    def apply(
      Limit: js.UndefOr[PaginationLimit] = js.undefined,
      NextMarker: js.UndefOr[NextMarker] = js.undefined): ListSubscribedRuleGroupsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Limit" -> Limit.map { x => x.asInstanceOf[js.Any] },
        "NextMarker" -> NextMarker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListSubscribedRuleGroupsRequest]
    }
  }

  @js.native
  trait ListSubscribedRuleGroupsResponse extends js.Object {
    var NextMarker: js.UndefOr[NextMarker]
    var RuleGroups: js.UndefOr[SubscribedRuleGroupSummaries]
  }

  object ListSubscribedRuleGroupsResponse {
    def apply(
      NextMarker: js.UndefOr[NextMarker] = js.undefined,
      RuleGroups: js.UndefOr[SubscribedRuleGroupSummaries] = js.undefined): ListSubscribedRuleGroupsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextMarker" -> NextMarker.map { x => x.asInstanceOf[js.Any] },
        "RuleGroups" -> RuleGroups.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListSubscribedRuleGroupsResponse]
    }
  }

  @js.native
  trait ListWebACLsRequest extends js.Object {
    var Limit: js.UndefOr[PaginationLimit]
    var NextMarker: js.UndefOr[NextMarker]
  }

  object ListWebACLsRequest {
    def apply(
      Limit: js.UndefOr[PaginationLimit] = js.undefined,
      NextMarker: js.UndefOr[NextMarker] = js.undefined): ListWebACLsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Limit" -> Limit.map { x => x.asInstanceOf[js.Any] },
        "NextMarker" -> NextMarker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListWebACLsRequest]
    }
  }

  @js.native
  trait ListWebACLsResponse extends js.Object {
    var NextMarker: js.UndefOr[NextMarker]
    var WebACLs: js.UndefOr[WebACLSummaries]
  }

  object ListWebACLsResponse {
    def apply(
      NextMarker: js.UndefOr[NextMarker] = js.undefined,
      WebACLs: js.UndefOr[WebACLSummaries] = js.undefined): ListWebACLsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextMarker" -> NextMarker.map { x => x.asInstanceOf[js.Any] },
        "WebACLs" -> WebACLs.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListWebACLsResponse]
    }
  }

  /**
   * A request to list the '''XssMatchSet''' objects created by the current AWS account.
   */
  @js.native
  trait ListXssMatchSetsRequest extends js.Object {
    var Limit: js.UndefOr[PaginationLimit]
    var NextMarker: js.UndefOr[NextMarker]
  }

  object ListXssMatchSetsRequest {
    def apply(
      Limit: js.UndefOr[PaginationLimit] = js.undefined,
      NextMarker: js.UndefOr[NextMarker] = js.undefined): ListXssMatchSetsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Limit" -> Limit.map { x => x.asInstanceOf[js.Any] },
        "NextMarker" -> NextMarker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListXssMatchSetsRequest]
    }
  }

  /**
   * The response to a '''ListXssMatchSets''' request.
   */
  @js.native
  trait ListXssMatchSetsResponse extends js.Object {
    var NextMarker: js.UndefOr[NextMarker]
    var XssMatchSets: js.UndefOr[XssMatchSetSummaries]
  }

  object ListXssMatchSetsResponse {
    def apply(
      NextMarker: js.UndefOr[NextMarker] = js.undefined,
      XssMatchSets: js.UndefOr[XssMatchSetSummaries] = js.undefined): ListXssMatchSetsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextMarker" -> NextMarker.map { x => x.asInstanceOf[js.Any] },
        "XssMatchSets" -> XssMatchSets.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListXssMatchSetsResponse]
    }
  }

  /**
   * The Amazon Kinesis Data Firehose, <code>RedactedFields</code> information, and the web ACL Amazon Resource Name (ARN).
   */
  @js.native
  trait LoggingConfiguration extends js.Object {
    var LogDestinationConfigs: LogDestinationConfigs
    var ResourceArn: ResourceArn
    var RedactedFields: js.UndefOr[RedactedFields]
  }

  object LoggingConfiguration {
    def apply(
      LogDestinationConfigs: LogDestinationConfigs,
      ResourceArn: ResourceArn,
      RedactedFields: js.UndefOr[RedactedFields] = js.undefined): LoggingConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LogDestinationConfigs" -> LogDestinationConfigs.asInstanceOf[js.Any],
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any],
        "RedactedFields" -> RedactedFields.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LoggingConfiguration]
    }
  }

  object MatchFieldTypeEnum {
    val URI = "URI"
    val QUERY_STRING = "QUERY_STRING"
    val HEADER = "HEADER"
    val METHOD = "METHOD"
    val BODY = "BODY"
    val SINGLE_QUERY_ARG = "SINGLE_QUERY_ARG"
    val ALL_QUERY_ARGS = "ALL_QUERY_ARGS"

    val values = IndexedSeq(URI, QUERY_STRING, HEADER, METHOD, BODY, SINGLE_QUERY_ARG, ALL_QUERY_ARGS)
  }

  object PositionalConstraintEnum {
    val EXACTLY = "EXACTLY"
    val STARTS_WITH = "STARTS_WITH"
    val ENDS_WITH = "ENDS_WITH"
    val CONTAINS = "CONTAINS"
    val CONTAINS_WORD = "CONTAINS_WORD"

    val values = IndexedSeq(EXACTLY, STARTS_WITH, ENDS_WITH, CONTAINS, CONTAINS_WORD)
  }

  /**
   * Specifies the '''ByteMatchSet''', '''IPSet''', '''SqlInjectionMatchSet''', '''XssMatchSet''', '''RegexMatchSet''', '''GeoMatchSet''', and '''SizeConstraintSet''' objects that you want to add to a <code>Rule</code> and, for each object, indicates whether you want to negate the settings, for example, requests that do NOT originate from the IP address 192.0.2.44.
   */
  @js.native
  trait Predicate extends js.Object {
    var DataId: ResourceId
    var Negated: Negated
    var Type: PredicateType
  }

  object Predicate {
    def apply(
      DataId: ResourceId,
      Negated: Negated,
      Type: PredicateType): Predicate = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DataId" -> DataId.asInstanceOf[js.Any],
        "Negated" -> Negated.asInstanceOf[js.Any],
        "Type" -> Type.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Predicate]
    }
  }

  object PredicateTypeEnum {
    val IPMatch = "IPMatch"
    val ByteMatch = "ByteMatch"
    val SqlInjectionMatch = "SqlInjectionMatch"
    val GeoMatch = "GeoMatch"
    val SizeConstraint = "SizeConstraint"
    val XssMatch = "XssMatch"
    val RegexMatch = "RegexMatch"

    val values = IndexedSeq(IPMatch, ByteMatch, SqlInjectionMatch, GeoMatch, SizeConstraint, XssMatch, RegexMatch)
  }

  @js.native
  trait PutLoggingConfigurationRequest extends js.Object {
    var LoggingConfiguration: LoggingConfiguration
  }

  object PutLoggingConfigurationRequest {
    def apply(
      LoggingConfiguration: LoggingConfiguration): PutLoggingConfigurationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LoggingConfiguration" -> LoggingConfiguration.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutLoggingConfigurationRequest]
    }
  }

  @js.native
  trait PutLoggingConfigurationResponse extends js.Object {
    var LoggingConfiguration: js.UndefOr[LoggingConfiguration]
  }

  object PutLoggingConfigurationResponse {
    def apply(
      LoggingConfiguration: js.UndefOr[LoggingConfiguration] = js.undefined): PutLoggingConfigurationResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LoggingConfiguration" -> LoggingConfiguration.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutLoggingConfigurationResponse]
    }
  }

  @js.native
  trait PutPermissionPolicyRequest extends js.Object {
    var Policy: PolicyString
    var ResourceArn: ResourceArn
  }

  object PutPermissionPolicyRequest {
    def apply(
      Policy: PolicyString,
      ResourceArn: ResourceArn): PutPermissionPolicyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Policy" -> Policy.asInstanceOf[js.Any],
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutPermissionPolicyRequest]
    }
  }

  @js.native
  trait PutPermissionPolicyResponse extends js.Object {

  }

  object PutPermissionPolicyResponse {
    def apply(): PutPermissionPolicyResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutPermissionPolicyResponse]
    }
  }

  /**
   * A <code>RateBasedRule</code> is identical to a regular '''Rule''', with one addition: a <code>RateBasedRule</code> counts the number of requests that arrive from a specified IP address every five minutes. For example, based on recent requests that you've seen from an attacker, you might create a <code>RateBasedRule</code> that includes the following conditions:
   * * The requests come from 192.0.2.44.
   *  * They contain the value <code>BadBot</code> in the <code>User-Agent</code> header.
   * In the rule, you also define the rate limit as 15,000.
   *  Requests that meet both of these conditions and exceed 15,000 requests every five minutes trigger the rule's action (block or count), which is defined in the web ACL.
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
    def apply(
      MatchPredicates: Predicates,
      RateKey: RateKey,
      RateLimit: RateLimit,
      RuleId: ResourceId,
      MetricName: js.UndefOr[MetricName] = js.undefined,
      Name: js.UndefOr[ResourceName] = js.undefined): RateBasedRule = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MatchPredicates" -> MatchPredicates.asInstanceOf[js.Any],
        "RateKey" -> RateKey.asInstanceOf[js.Any],
        "RateLimit" -> RateLimit.asInstanceOf[js.Any],
        "RuleId" -> RuleId.asInstanceOf[js.Any],
        "MetricName" -> MetricName.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RateBasedRule]
    }
  }

  object RateKeyEnum {
    val IP = "IP"

    val values = IndexedSeq(IP)
  }

  /**
   * In a '''GetRegexMatchSet''' request, <code>RegexMatchSet</code> is a complex type that contains the <code>RegexMatchSetId</code> and <code>Name</code> of a <code>RegexMatchSet</code>, and the values that you specified when you updated the <code>RegexMatchSet</code>.
   *  The values are contained in a <code>RegexMatchTuple</code> object, which specify the parts of web requests that you want AWS WAF to inspect and the values that you want AWS WAF to search for. If a <code>RegexMatchSet</code> contains more than one <code>RegexMatchTuple</code> object, a request needs to match the settings in only one <code>ByteMatchTuple</code> to be considered a match.
   */
  @js.native
  trait RegexMatchSet extends js.Object {
    var Name: js.UndefOr[ResourceName]
    var RegexMatchSetId: js.UndefOr[ResourceId]
    var RegexMatchTuples: js.UndefOr[RegexMatchTuples]
  }

  object RegexMatchSet {
    def apply(
      Name: js.UndefOr[ResourceName] = js.undefined,
      RegexMatchSetId: js.UndefOr[ResourceId] = js.undefined,
      RegexMatchTuples: js.UndefOr[RegexMatchTuples] = js.undefined): RegexMatchSet = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "RegexMatchSetId" -> RegexMatchSetId.map { x => x.asInstanceOf[js.Any] },
        "RegexMatchTuples" -> RegexMatchTuples.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RegexMatchSet]
    }
  }

  /**
   * Returned by '''ListRegexMatchSets'''. Each <code>RegexMatchSetSummary</code> object includes the <code>Name</code> and <code>RegexMatchSetId</code> for one '''RegexMatchSet'''.
   */
  @js.native
  trait RegexMatchSetSummary extends js.Object {
    var Name: ResourceName
    var RegexMatchSetId: ResourceId
  }

  object RegexMatchSetSummary {
    def apply(
      Name: ResourceName,
      RegexMatchSetId: ResourceId): RegexMatchSetSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.asInstanceOf[js.Any],
        "RegexMatchSetId" -> RegexMatchSetId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RegexMatchSetSummary]
    }
  }

  /**
   * In an '''UpdateRegexMatchSet''' request, <code>RegexMatchSetUpdate</code> specifies whether to insert or delete a '''RegexMatchTuple''' and includes the settings for the <code>RegexMatchTuple</code>.
   */
  @js.native
  trait RegexMatchSetUpdate extends js.Object {
    var Action: ChangeAction
    var RegexMatchTuple: RegexMatchTuple
  }

  object RegexMatchSetUpdate {
    def apply(
      Action: ChangeAction,
      RegexMatchTuple: RegexMatchTuple): RegexMatchSetUpdate = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Action" -> Action.asInstanceOf[js.Any],
        "RegexMatchTuple" -> RegexMatchTuple.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RegexMatchSetUpdate]
    }
  }

  /**
   * The regular expression pattern that you want AWS WAF to search for in web requests, the location in requests that you want AWS WAF to search, and other settings. Each <code>RegexMatchTuple</code> object contains:
   * * The part of a web request that you want AWS WAF to inspect, such as a query string or the value of the <code>User-Agent</code> header.
   *  * The identifier of the pattern (a regular expression) that you want AWS WAF to look for. For more information, see '''RegexPatternSet'''.
   *  * Whether to perform any conversions on the request, such as converting it to lowercase, before inspecting it for the specified string.
   */
  @js.native
  trait RegexMatchTuple extends js.Object {
    var FieldToMatch: FieldToMatch
    var RegexPatternSetId: ResourceId
    var TextTransformation: TextTransformation
  }

  object RegexMatchTuple {
    def apply(
      FieldToMatch: FieldToMatch,
      RegexPatternSetId: ResourceId,
      TextTransformation: TextTransformation): RegexMatchTuple = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FieldToMatch" -> FieldToMatch.asInstanceOf[js.Any],
        "RegexPatternSetId" -> RegexPatternSetId.asInstanceOf[js.Any],
        "TextTransformation" -> TextTransformation.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RegexMatchTuple]
    }
  }

  /**
   * The <code>RegexPatternSet</code> specifies the regular expression (regex) pattern that you want AWS WAF to search for, such as <code>B[a@]dB[o0]t</code>. You can then configure AWS WAF to reject those requests.
   */
  @js.native
  trait RegexPatternSet extends js.Object {
    var RegexPatternSetId: ResourceId
    var RegexPatternStrings: RegexPatternStrings
    var Name: js.UndefOr[ResourceName]
  }

  object RegexPatternSet {
    def apply(
      RegexPatternSetId: ResourceId,
      RegexPatternStrings: RegexPatternStrings,
      Name: js.UndefOr[ResourceName] = js.undefined): RegexPatternSet = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RegexPatternSetId" -> RegexPatternSetId.asInstanceOf[js.Any],
        "RegexPatternStrings" -> RegexPatternStrings.asInstanceOf[js.Any],
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RegexPatternSet]
    }
  }

  /**
   * Returned by '''ListRegexPatternSets'''. Each <code>RegexPatternSetSummary</code> object includes the <code>Name</code> and <code>RegexPatternSetId</code> for one '''RegexPatternSet'''.
   */
  @js.native
  trait RegexPatternSetSummary extends js.Object {
    var Name: ResourceName
    var RegexPatternSetId: ResourceId
  }

  object RegexPatternSetSummary {
    def apply(
      Name: ResourceName,
      RegexPatternSetId: ResourceId): RegexPatternSetSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.asInstanceOf[js.Any],
        "RegexPatternSetId" -> RegexPatternSetId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RegexPatternSetSummary]
    }
  }

  /**
   * In an '''UpdateRegexPatternSet''' request, <code>RegexPatternSetUpdate</code> specifies whether to insert or delete a <code>RegexPatternString</code> and includes the settings for the <code>RegexPatternString</code>.
   */
  @js.native
  trait RegexPatternSetUpdate extends js.Object {
    var Action: ChangeAction
    var RegexPatternString: RegexPatternString
  }

  object RegexPatternSetUpdate {
    def apply(
      Action: ChangeAction,
      RegexPatternString: RegexPatternString): RegexPatternSetUpdate = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Action" -> Action.asInstanceOf[js.Any],
        "RegexPatternString" -> RegexPatternString.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RegexPatternSetUpdate]
    }
  }

  object ResourceTypeEnum {
    val APPLICATION_LOAD_BALANCER = "APPLICATION_LOAD_BALANCER"
    val API_GATEWAY = "API_GATEWAY"

    val values = IndexedSeq(APPLICATION_LOAD_BALANCER, API_GATEWAY)
  }

  /**
   * A combination of '''ByteMatchSet''', '''IPSet''', and/or '''SqlInjectionMatchSet''' objects that identify the web requests that you want to allow, block, or count. For example, you might create a <code>Rule</code> that includes the following predicates:
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
    def apply(
      Predicates: Predicates,
      RuleId: ResourceId,
      MetricName: js.UndefOr[MetricName] = js.undefined,
      Name: js.UndefOr[ResourceName] = js.undefined): Rule = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Predicates" -> Predicates.asInstanceOf[js.Any],
        "RuleId" -> RuleId.asInstanceOf[js.Any],
        "MetricName" -> MetricName.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Rule]
    }
  }

  /**
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
    def apply(
      RuleGroupId: ResourceId,
      MetricName: js.UndefOr[MetricName] = js.undefined,
      Name: js.UndefOr[ResourceName] = js.undefined): RuleGroup = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RuleGroupId" -> RuleGroupId.asInstanceOf[js.Any],
        "MetricName" -> MetricName.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RuleGroup]
    }
  }

  /**
   * Contains the identifier and the friendly name or description of the <code>RuleGroup</code>.
   */
  @js.native
  trait RuleGroupSummary extends js.Object {
    var Name: ResourceName
    var RuleGroupId: ResourceId
  }

  object RuleGroupSummary {
    def apply(
      Name: ResourceName,
      RuleGroupId: ResourceId): RuleGroupSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.asInstanceOf[js.Any],
        "RuleGroupId" -> RuleGroupId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RuleGroupSummary]
    }
  }

  /**
   * Specifies an <code>ActivatedRule</code> and indicates whether you want to add it to a <code>RuleGroup</code> or delete it from a <code>RuleGroup</code>.
   */
  @js.native
  trait RuleGroupUpdate extends js.Object {
    var Action: ChangeAction
    var ActivatedRule: ActivatedRule
  }

  object RuleGroupUpdate {
    def apply(
      Action: ChangeAction,
      ActivatedRule: ActivatedRule): RuleGroupUpdate = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Action" -> Action.asInstanceOf[js.Any],
        "ActivatedRule" -> ActivatedRule.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RuleGroupUpdate]
    }
  }

  /**
   * Contains the identifier and the friendly name or description of the <code>Rule</code>.
   */
  @js.native
  trait RuleSummary extends js.Object {
    var Name: ResourceName
    var RuleId: ResourceId
  }

  object RuleSummary {
    def apply(
      Name: ResourceName,
      RuleId: ResourceId): RuleSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.asInstanceOf[js.Any],
        "RuleId" -> RuleId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RuleSummary]
    }
  }

  /**
   * Specifies a <code>Predicate</code> (such as an <code>IPSet</code>) and indicates whether you want to add it to a <code>Rule</code> or delete it from a <code>Rule</code>.
   */
  @js.native
  trait RuleUpdate extends js.Object {
    var Action: ChangeAction
    var Predicate: Predicate
  }

  object RuleUpdate {
    def apply(
      Action: ChangeAction,
      Predicate: Predicate): RuleUpdate = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Action" -> Action.asInstanceOf[js.Any],
        "Predicate" -> Predicate.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RuleUpdate]
    }
  }

  /**
   * The response from a '''GetSampledRequests''' request includes a <code>SampledHTTPRequests</code> complex type that appears as <code>SampledRequests</code> in the response syntax. <code>SampledHTTPRequests</code> contains one <code>SampledHTTPRequest</code> object for each web request that is returned by <code>GetSampledRequests</code>.
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
    def apply(
      Request: HTTPRequest,
      Weight: SampleWeight,
      Action: js.UndefOr[Action] = js.undefined,
      RuleWithinRuleGroup: js.UndefOr[ResourceId] = js.undefined,
      Timestamp: js.UndefOr[Timestamp] = js.undefined): SampledHTTPRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Request" -> Request.asInstanceOf[js.Any],
        "Weight" -> Weight.asInstanceOf[js.Any],
        "Action" -> Action.map { x => x.asInstanceOf[js.Any] },
        "RuleWithinRuleGroup" -> RuleWithinRuleGroup.map { x => x.asInstanceOf[js.Any] },
        "Timestamp" -> Timestamp.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SampledHTTPRequest]
    }
  }

  /**
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
    def apply(
      ComparisonOperator: ComparisonOperator,
      FieldToMatch: FieldToMatch,
      Size: Size,
      TextTransformation: TextTransformation): SizeConstraint = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ComparisonOperator" -> ComparisonOperator.asInstanceOf[js.Any],
        "FieldToMatch" -> FieldToMatch.asInstanceOf[js.Any],
        "Size" -> Size.asInstanceOf[js.Any],
        "TextTransformation" -> TextTransformation.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SizeConstraint]
    }
  }

  /**
   * A complex type that contains <code>SizeConstraint</code> objects, which specify the parts of web requests that you want AWS WAF to inspect the size of. If a <code>SizeConstraintSet</code> contains more than one <code>SizeConstraint</code> object, a request only needs to match one constraint to be considered a match.
   */
  @js.native
  trait SizeConstraintSet extends js.Object {
    var SizeConstraintSetId: ResourceId
    var SizeConstraints: SizeConstraints
    var Name: js.UndefOr[ResourceName]
  }

  object SizeConstraintSet {
    def apply(
      SizeConstraintSetId: ResourceId,
      SizeConstraints: SizeConstraints,
      Name: js.UndefOr[ResourceName] = js.undefined): SizeConstraintSet = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SizeConstraintSetId" -> SizeConstraintSetId.asInstanceOf[js.Any],
        "SizeConstraints" -> SizeConstraints.asInstanceOf[js.Any],
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SizeConstraintSet]
    }
  }

  /**
   * The <code>Id</code> and <code>Name</code> of a <code>SizeConstraintSet</code>.
   */
  @js.native
  trait SizeConstraintSetSummary extends js.Object {
    var Name: ResourceName
    var SizeConstraintSetId: ResourceId
  }

  object SizeConstraintSetSummary {
    def apply(
      Name: ResourceName,
      SizeConstraintSetId: ResourceId): SizeConstraintSetSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.asInstanceOf[js.Any],
        "SizeConstraintSetId" -> SizeConstraintSetId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SizeConstraintSetSummary]
    }
  }

  /**
   * Specifies the part of a web request that you want to inspect the size of and indicates whether you want to add the specification to a '''SizeConstraintSet''' or delete it from a <code>SizeConstraintSet</code>.
   */
  @js.native
  trait SizeConstraintSetUpdate extends js.Object {
    var Action: ChangeAction
    var SizeConstraint: SizeConstraint
  }

  object SizeConstraintSetUpdate {
    def apply(
      Action: ChangeAction,
      SizeConstraint: SizeConstraint): SizeConstraintSetUpdate = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Action" -> Action.asInstanceOf[js.Any],
        "SizeConstraint" -> SizeConstraint.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SizeConstraintSetUpdate]
    }
  }

  /**
   * A complex type that contains <code>SqlInjectionMatchTuple</code> objects, which specify the parts of web requests that you want AWS WAF to inspect for snippets of malicious SQL code and, if you want AWS WAF to inspect a header, the name of the header. If a <code>SqlInjectionMatchSet</code> contains more than one <code>SqlInjectionMatchTuple</code> object, a request needs to include snippets of SQL code in only one of the specified parts of the request to be considered a match.
   */
  @js.native
  trait SqlInjectionMatchSet extends js.Object {
    var SqlInjectionMatchSetId: ResourceId
    var SqlInjectionMatchTuples: SqlInjectionMatchTuples
    var Name: js.UndefOr[ResourceName]
  }

  object SqlInjectionMatchSet {
    def apply(
      SqlInjectionMatchSetId: ResourceId,
      SqlInjectionMatchTuples: SqlInjectionMatchTuples,
      Name: js.UndefOr[ResourceName] = js.undefined): SqlInjectionMatchSet = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SqlInjectionMatchSetId" -> SqlInjectionMatchSetId.asInstanceOf[js.Any],
        "SqlInjectionMatchTuples" -> SqlInjectionMatchTuples.asInstanceOf[js.Any],
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SqlInjectionMatchSet]
    }
  }

  /**
   * The <code>Id</code> and <code>Name</code> of a <code>SqlInjectionMatchSet</code>.
   */
  @js.native
  trait SqlInjectionMatchSetSummary extends js.Object {
    var Name: ResourceName
    var SqlInjectionMatchSetId: ResourceId
  }

  object SqlInjectionMatchSetSummary {
    def apply(
      Name: ResourceName,
      SqlInjectionMatchSetId: ResourceId): SqlInjectionMatchSetSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.asInstanceOf[js.Any],
        "SqlInjectionMatchSetId" -> SqlInjectionMatchSetId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SqlInjectionMatchSetSummary]
    }
  }

  /**
   * Specifies the part of a web request that you want to inspect for snippets of malicious SQL code and indicates whether you want to add the specification to a '''SqlInjectionMatchSet''' or delete it from a <code>SqlInjectionMatchSet</code>.
   */
  @js.native
  trait SqlInjectionMatchSetUpdate extends js.Object {
    var Action: ChangeAction
    var SqlInjectionMatchTuple: SqlInjectionMatchTuple
  }

  object SqlInjectionMatchSetUpdate {
    def apply(
      Action: ChangeAction,
      SqlInjectionMatchTuple: SqlInjectionMatchTuple): SqlInjectionMatchSetUpdate = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Action" -> Action.asInstanceOf[js.Any],
        "SqlInjectionMatchTuple" -> SqlInjectionMatchTuple.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SqlInjectionMatchSetUpdate]
    }
  }

  /**
   * Specifies the part of a web request that you want AWS WAF to inspect for snippets of malicious SQL code and, if you want AWS WAF to inspect a header, the name of the header.
   */
  @js.native
  trait SqlInjectionMatchTuple extends js.Object {
    var FieldToMatch: FieldToMatch
    var TextTransformation: TextTransformation
  }

  object SqlInjectionMatchTuple {
    def apply(
      FieldToMatch: FieldToMatch,
      TextTransformation: TextTransformation): SqlInjectionMatchTuple = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FieldToMatch" -> FieldToMatch.asInstanceOf[js.Any],
        "TextTransformation" -> TextTransformation.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SqlInjectionMatchTuple]
    }
  }

  /**
   * A summary of the rule groups you are subscribed to.
   */
  @js.native
  trait SubscribedRuleGroupSummary extends js.Object {
    var MetricName: MetricName
    var Name: ResourceName
    var RuleGroupId: ResourceId
  }

  object SubscribedRuleGroupSummary {
    def apply(
      MetricName: MetricName,
      Name: ResourceName,
      RuleGroupId: ResourceId): SubscribedRuleGroupSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MetricName" -> MetricName.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
        "RuleGroupId" -> RuleGroupId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SubscribedRuleGroupSummary]
    }
  }

  object TextTransformationEnum {
    val NONE = "NONE"
    val COMPRESS_WHITE_SPACE = "COMPRESS_WHITE_SPACE"
    val HTML_ENTITY_DECODE = "HTML_ENTITY_DECODE"
    val LOWERCASE = "LOWERCASE"
    val CMD_LINE = "CMD_LINE"
    val URL_DECODE = "URL_DECODE"

    val values = IndexedSeq(NONE, COMPRESS_WHITE_SPACE, HTML_ENTITY_DECODE, LOWERCASE, CMD_LINE, URL_DECODE)
  }

  /**
   * In a '''GetSampledRequests''' request, the <code>StartTime</code> and <code>EndTime</code> objects specify the time range for which you want AWS WAF to return a sample of web requests.
   *  In a '''GetSampledRequests''' response, the <code>StartTime</code> and <code>EndTime</code> objects specify the time range for which AWS WAF actually returned a sample of web requests. AWS WAF gets the specified number of requests from among the first 5,000 requests that your AWS resource receives during the specified time period. If your resource receives more than 5,000 requests during that period, AWS WAF stops sampling after the 5,000th request. In that case, <code>EndTime</code> is the time that AWS WAF received the 5,000th request.
   */
  @js.native
  trait TimeWindow extends js.Object {
    var EndTime: Timestamp
    var StartTime: Timestamp
  }

  object TimeWindow {
    def apply(
      EndTime: Timestamp,
      StartTime: Timestamp): TimeWindow = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EndTime" -> EndTime.asInstanceOf[js.Any],
        "StartTime" -> StartTime.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TimeWindow]
    }
  }

  @js.native
  trait UpdateByteMatchSetRequest extends js.Object {
    var ByteMatchSetId: ResourceId
    var ChangeToken: ChangeToken
    var Updates: ByteMatchSetUpdates
  }

  object UpdateByteMatchSetRequest {
    def apply(
      ByteMatchSetId: ResourceId,
      ChangeToken: ChangeToken,
      Updates: ByteMatchSetUpdates): UpdateByteMatchSetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ByteMatchSetId" -> ByteMatchSetId.asInstanceOf[js.Any],
        "ChangeToken" -> ChangeToken.asInstanceOf[js.Any],
        "Updates" -> Updates.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateByteMatchSetRequest]
    }
  }

  @js.native
  trait UpdateByteMatchSetResponse extends js.Object {
    var ChangeToken: js.UndefOr[ChangeToken]
  }

  object UpdateByteMatchSetResponse {
    def apply(
      ChangeToken: js.UndefOr[ChangeToken] = js.undefined): UpdateByteMatchSetResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ChangeToken" -> ChangeToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateByteMatchSetResponse]
    }
  }

  @js.native
  trait UpdateGeoMatchSetRequest extends js.Object {
    var ChangeToken: ChangeToken
    var GeoMatchSetId: ResourceId
    var Updates: GeoMatchSetUpdates
  }

  object UpdateGeoMatchSetRequest {
    def apply(
      ChangeToken: ChangeToken,
      GeoMatchSetId: ResourceId,
      Updates: GeoMatchSetUpdates): UpdateGeoMatchSetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ChangeToken" -> ChangeToken.asInstanceOf[js.Any],
        "GeoMatchSetId" -> GeoMatchSetId.asInstanceOf[js.Any],
        "Updates" -> Updates.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateGeoMatchSetRequest]
    }
  }

  @js.native
  trait UpdateGeoMatchSetResponse extends js.Object {
    var ChangeToken: js.UndefOr[ChangeToken]
  }

  object UpdateGeoMatchSetResponse {
    def apply(
      ChangeToken: js.UndefOr[ChangeToken] = js.undefined): UpdateGeoMatchSetResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ChangeToken" -> ChangeToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateGeoMatchSetResponse]
    }
  }

  @js.native
  trait UpdateIPSetRequest extends js.Object {
    var ChangeToken: ChangeToken
    var IPSetId: ResourceId
    var Updates: IPSetUpdates
  }

  object UpdateIPSetRequest {
    def apply(
      ChangeToken: ChangeToken,
      IPSetId: ResourceId,
      Updates: IPSetUpdates): UpdateIPSetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ChangeToken" -> ChangeToken.asInstanceOf[js.Any],
        "IPSetId" -> IPSetId.asInstanceOf[js.Any],
        "Updates" -> Updates.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateIPSetRequest]
    }
  }

  @js.native
  trait UpdateIPSetResponse extends js.Object {
    var ChangeToken: js.UndefOr[ChangeToken]
  }

  object UpdateIPSetResponse {
    def apply(
      ChangeToken: js.UndefOr[ChangeToken] = js.undefined): UpdateIPSetResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ChangeToken" -> ChangeToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateIPSetResponse]
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
    def apply(
      ChangeToken: ChangeToken,
      RateLimit: RateLimit,
      RuleId: ResourceId,
      Updates: RuleUpdates): UpdateRateBasedRuleRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ChangeToken" -> ChangeToken.asInstanceOf[js.Any],
        "RateLimit" -> RateLimit.asInstanceOf[js.Any],
        "RuleId" -> RuleId.asInstanceOf[js.Any],
        "Updates" -> Updates.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateRateBasedRuleRequest]
    }
  }

  @js.native
  trait UpdateRateBasedRuleResponse extends js.Object {
    var ChangeToken: js.UndefOr[ChangeToken]
  }

  object UpdateRateBasedRuleResponse {
    def apply(
      ChangeToken: js.UndefOr[ChangeToken] = js.undefined): UpdateRateBasedRuleResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ChangeToken" -> ChangeToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateRateBasedRuleResponse]
    }
  }

  @js.native
  trait UpdateRegexMatchSetRequest extends js.Object {
    var ChangeToken: ChangeToken
    var RegexMatchSetId: ResourceId
    var Updates: RegexMatchSetUpdates
  }

  object UpdateRegexMatchSetRequest {
    def apply(
      ChangeToken: ChangeToken,
      RegexMatchSetId: ResourceId,
      Updates: RegexMatchSetUpdates): UpdateRegexMatchSetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ChangeToken" -> ChangeToken.asInstanceOf[js.Any],
        "RegexMatchSetId" -> RegexMatchSetId.asInstanceOf[js.Any],
        "Updates" -> Updates.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateRegexMatchSetRequest]
    }
  }

  @js.native
  trait UpdateRegexMatchSetResponse extends js.Object {
    var ChangeToken: js.UndefOr[ChangeToken]
  }

  object UpdateRegexMatchSetResponse {
    def apply(
      ChangeToken: js.UndefOr[ChangeToken] = js.undefined): UpdateRegexMatchSetResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ChangeToken" -> ChangeToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateRegexMatchSetResponse]
    }
  }

  @js.native
  trait UpdateRegexPatternSetRequest extends js.Object {
    var ChangeToken: ChangeToken
    var RegexPatternSetId: ResourceId
    var Updates: RegexPatternSetUpdates
  }

  object UpdateRegexPatternSetRequest {
    def apply(
      ChangeToken: ChangeToken,
      RegexPatternSetId: ResourceId,
      Updates: RegexPatternSetUpdates): UpdateRegexPatternSetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ChangeToken" -> ChangeToken.asInstanceOf[js.Any],
        "RegexPatternSetId" -> RegexPatternSetId.asInstanceOf[js.Any],
        "Updates" -> Updates.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateRegexPatternSetRequest]
    }
  }

  @js.native
  trait UpdateRegexPatternSetResponse extends js.Object {
    var ChangeToken: js.UndefOr[ChangeToken]
  }

  object UpdateRegexPatternSetResponse {
    def apply(
      ChangeToken: js.UndefOr[ChangeToken] = js.undefined): UpdateRegexPatternSetResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ChangeToken" -> ChangeToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateRegexPatternSetResponse]
    }
  }

  @js.native
  trait UpdateRuleGroupRequest extends js.Object {
    var ChangeToken: ChangeToken
    var RuleGroupId: ResourceId
    var Updates: RuleGroupUpdates
  }

  object UpdateRuleGroupRequest {
    def apply(
      ChangeToken: ChangeToken,
      RuleGroupId: ResourceId,
      Updates: RuleGroupUpdates): UpdateRuleGroupRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ChangeToken" -> ChangeToken.asInstanceOf[js.Any],
        "RuleGroupId" -> RuleGroupId.asInstanceOf[js.Any],
        "Updates" -> Updates.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateRuleGroupRequest]
    }
  }

  @js.native
  trait UpdateRuleGroupResponse extends js.Object {
    var ChangeToken: js.UndefOr[ChangeToken]
  }

  object UpdateRuleGroupResponse {
    def apply(
      ChangeToken: js.UndefOr[ChangeToken] = js.undefined): UpdateRuleGroupResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ChangeToken" -> ChangeToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateRuleGroupResponse]
    }
  }

  @js.native
  trait UpdateRuleRequest extends js.Object {
    var ChangeToken: ChangeToken
    var RuleId: ResourceId
    var Updates: RuleUpdates
  }

  object UpdateRuleRequest {
    def apply(
      ChangeToken: ChangeToken,
      RuleId: ResourceId,
      Updates: RuleUpdates): UpdateRuleRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ChangeToken" -> ChangeToken.asInstanceOf[js.Any],
        "RuleId" -> RuleId.asInstanceOf[js.Any],
        "Updates" -> Updates.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateRuleRequest]
    }
  }

  @js.native
  trait UpdateRuleResponse extends js.Object {
    var ChangeToken: js.UndefOr[ChangeToken]
  }

  object UpdateRuleResponse {
    def apply(
      ChangeToken: js.UndefOr[ChangeToken] = js.undefined): UpdateRuleResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ChangeToken" -> ChangeToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateRuleResponse]
    }
  }

  @js.native
  trait UpdateSizeConstraintSetRequest extends js.Object {
    var ChangeToken: ChangeToken
    var SizeConstraintSetId: ResourceId
    var Updates: SizeConstraintSetUpdates
  }

  object UpdateSizeConstraintSetRequest {
    def apply(
      ChangeToken: ChangeToken,
      SizeConstraintSetId: ResourceId,
      Updates: SizeConstraintSetUpdates): UpdateSizeConstraintSetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ChangeToken" -> ChangeToken.asInstanceOf[js.Any],
        "SizeConstraintSetId" -> SizeConstraintSetId.asInstanceOf[js.Any],
        "Updates" -> Updates.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateSizeConstraintSetRequest]
    }
  }

  @js.native
  trait UpdateSizeConstraintSetResponse extends js.Object {
    var ChangeToken: js.UndefOr[ChangeToken]
  }

  object UpdateSizeConstraintSetResponse {
    def apply(
      ChangeToken: js.UndefOr[ChangeToken] = js.undefined): UpdateSizeConstraintSetResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ChangeToken" -> ChangeToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateSizeConstraintSetResponse]
    }
  }

  /**
   * A request to update a '''SqlInjectionMatchSet'''.
   */
  @js.native
  trait UpdateSqlInjectionMatchSetRequest extends js.Object {
    var ChangeToken: ChangeToken
    var SqlInjectionMatchSetId: ResourceId
    var Updates: SqlInjectionMatchSetUpdates
  }

  object UpdateSqlInjectionMatchSetRequest {
    def apply(
      ChangeToken: ChangeToken,
      SqlInjectionMatchSetId: ResourceId,
      Updates: SqlInjectionMatchSetUpdates): UpdateSqlInjectionMatchSetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ChangeToken" -> ChangeToken.asInstanceOf[js.Any],
        "SqlInjectionMatchSetId" -> SqlInjectionMatchSetId.asInstanceOf[js.Any],
        "Updates" -> Updates.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateSqlInjectionMatchSetRequest]
    }
  }

  /**
   * The response to an '''UpdateSqlInjectionMatchSets''' request.
   */
  @js.native
  trait UpdateSqlInjectionMatchSetResponse extends js.Object {
    var ChangeToken: js.UndefOr[ChangeToken]
  }

  object UpdateSqlInjectionMatchSetResponse {
    def apply(
      ChangeToken: js.UndefOr[ChangeToken] = js.undefined): UpdateSqlInjectionMatchSetResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ChangeToken" -> ChangeToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateSqlInjectionMatchSetResponse]
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
    def apply(
      ChangeToken: ChangeToken,
      WebACLId: ResourceId,
      DefaultAction: js.UndefOr[WafAction] = js.undefined,
      Updates: js.UndefOr[WebACLUpdates] = js.undefined): UpdateWebACLRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ChangeToken" -> ChangeToken.asInstanceOf[js.Any],
        "WebACLId" -> WebACLId.asInstanceOf[js.Any],
        "DefaultAction" -> DefaultAction.map { x => x.asInstanceOf[js.Any] },
        "Updates" -> Updates.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateWebACLRequest]
    }
  }

  @js.native
  trait UpdateWebACLResponse extends js.Object {
    var ChangeToken: js.UndefOr[ChangeToken]
  }

  object UpdateWebACLResponse {
    def apply(
      ChangeToken: js.UndefOr[ChangeToken] = js.undefined): UpdateWebACLResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ChangeToken" -> ChangeToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateWebACLResponse]
    }
  }

  /**
   * A request to update an '''XssMatchSet'''.
   */
  @js.native
  trait UpdateXssMatchSetRequest extends js.Object {
    var ChangeToken: ChangeToken
    var Updates: XssMatchSetUpdates
    var XssMatchSetId: ResourceId
  }

  object UpdateXssMatchSetRequest {
    def apply(
      ChangeToken: ChangeToken,
      Updates: XssMatchSetUpdates,
      XssMatchSetId: ResourceId): UpdateXssMatchSetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ChangeToken" -> ChangeToken.asInstanceOf[js.Any],
        "Updates" -> Updates.asInstanceOf[js.Any],
        "XssMatchSetId" -> XssMatchSetId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateXssMatchSetRequest]
    }
  }

  /**
   * The response to an '''UpdateXssMatchSets''' request.
   */
  @js.native
  trait UpdateXssMatchSetResponse extends js.Object {
    var ChangeToken: js.UndefOr[ChangeToken]
  }

  object UpdateXssMatchSetResponse {
    def apply(
      ChangeToken: js.UndefOr[ChangeToken] = js.undefined): UpdateXssMatchSetResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ChangeToken" -> ChangeToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateXssMatchSetResponse]
    }
  }

  /**
   * For the action that is associated with a rule in a <code>WebACL</code>, specifies the action that you want AWS WAF to perform when a web request matches all of the conditions in a rule. For the default action in a <code>WebACL</code>, specifies the action that you want AWS WAF to take when a web request doesn't match all of the conditions in any of the rules in a <code>WebACL</code>.
   */
  @js.native
  trait WafAction extends js.Object {
    var Type: WafActionType
  }

  object WafAction {
    def apply(
      Type: WafActionType): WafAction = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Type" -> Type.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[WafAction]
    }
  }

  object WafActionTypeEnum {
    val BLOCK = "BLOCK"
    val ALLOW = "ALLOW"
    val COUNT = "COUNT"

    val values = IndexedSeq(BLOCK, ALLOW, COUNT)
  }

  /**
   * The action to take if any rule within the <code>RuleGroup</code> matches a request.
   */
  @js.native
  trait WafOverrideAction extends js.Object {
    var Type: WafOverrideActionType
  }

  object WafOverrideAction {
    def apply(
      Type: WafOverrideActionType): WafOverrideAction = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Type" -> Type.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[WafOverrideAction]
    }
  }

  object WafOverrideActionTypeEnum {
    val NONE = "NONE"
    val COUNT = "COUNT"

    val values = IndexedSeq(NONE, COUNT)
  }

  object WafRuleTypeEnum {
    val REGULAR = "REGULAR"
    val RATE_BASED = "RATE_BASED"
    val GROUP = "GROUP"

    val values = IndexedSeq(REGULAR, RATE_BASED, GROUP)
  }

  /**
   * Contains the <code>Rules</code> that identify the requests that you want to allow, block, or count. In a <code>WebACL</code>, you also specify a default action (<code>ALLOW</code> or <code>BLOCK</code>), and the action for each <code>Rule</code> that you add to a <code>WebACL</code>, for example, block requests from specified IP addresses or block requests from specified referrers. You also associate the <code>WebACL</code> with a CloudFront distribution to identify the requests that you want AWS WAF to filter. If you add more than one <code>Rule</code> to a <code>WebACL</code>, a request needs to match only one of the specifications to be allowed, blocked, or counted. For more information, see '''UpdateWebACL'''.
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
    def apply(
      DefaultAction: WafAction,
      Rules: ActivatedRules,
      WebACLId: ResourceId,
      MetricName: js.UndefOr[MetricName] = js.undefined,
      Name: js.UndefOr[ResourceName] = js.undefined,
      WebACLArn: js.UndefOr[ResourceArn] = js.undefined): WebACL = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DefaultAction" -> DefaultAction.asInstanceOf[js.Any],
        "Rules" -> Rules.asInstanceOf[js.Any],
        "WebACLId" -> WebACLId.asInstanceOf[js.Any],
        "MetricName" -> MetricName.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "WebACLArn" -> WebACLArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[WebACL]
    }
  }

  /**
   * Contains the identifier and the name or description of the '''WebACL'''.
   */
  @js.native
  trait WebACLSummary extends js.Object {
    var Name: ResourceName
    var WebACLId: ResourceId
  }

  object WebACLSummary {
    def apply(
      Name: ResourceName,
      WebACLId: ResourceId): WebACLSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.asInstanceOf[js.Any],
        "WebACLId" -> WebACLId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[WebACLSummary]
    }
  }

  /**
   * Specifies whether to insert a <code>Rule</code> into or delete a <code>Rule</code> from a <code>WebACL</code>.
   */
  @js.native
  trait WebACLUpdate extends js.Object {
    var Action: ChangeAction
    var ActivatedRule: ActivatedRule
  }

  object WebACLUpdate {
    def apply(
      Action: ChangeAction,
      ActivatedRule: ActivatedRule): WebACLUpdate = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Action" -> Action.asInstanceOf[js.Any],
        "ActivatedRule" -> ActivatedRule.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[WebACLUpdate]
    }
  }

  /**
   * A complex type that contains <code>XssMatchTuple</code> objects, which specify the parts of web requests that you want AWS WAF to inspect for cross-site scripting attacks and, if you want AWS WAF to inspect a header, the name of the header. If a <code>XssMatchSet</code> contains more than one <code>XssMatchTuple</code> object, a request needs to include cross-site scripting attacks in only one of the specified parts of the request to be considered a match.
   */
  @js.native
  trait XssMatchSet extends js.Object {
    var XssMatchSetId: ResourceId
    var XssMatchTuples: XssMatchTuples
    var Name: js.UndefOr[ResourceName]
  }

  object XssMatchSet {
    def apply(
      XssMatchSetId: ResourceId,
      XssMatchTuples: XssMatchTuples,
      Name: js.UndefOr[ResourceName] = js.undefined): XssMatchSet = {
      val _fields = IndexedSeq[(String, js.Any)](
        "XssMatchSetId" -> XssMatchSetId.asInstanceOf[js.Any],
        "XssMatchTuples" -> XssMatchTuples.asInstanceOf[js.Any],
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[XssMatchSet]
    }
  }

  /**
   * The <code>Id</code> and <code>Name</code> of an <code>XssMatchSet</code>.
   */
  @js.native
  trait XssMatchSetSummary extends js.Object {
    var Name: ResourceName
    var XssMatchSetId: ResourceId
  }

  object XssMatchSetSummary {
    def apply(
      Name: ResourceName,
      XssMatchSetId: ResourceId): XssMatchSetSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.asInstanceOf[js.Any],
        "XssMatchSetId" -> XssMatchSetId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[XssMatchSetSummary]
    }
  }

  /**
   * Specifies the part of a web request that you want to inspect for cross-site scripting attacks and indicates whether you want to add the specification to an '''XssMatchSet''' or delete it from an <code>XssMatchSet</code>.
   */
  @js.native
  trait XssMatchSetUpdate extends js.Object {
    var Action: ChangeAction
    var XssMatchTuple: XssMatchTuple
  }

  object XssMatchSetUpdate {
    def apply(
      Action: ChangeAction,
      XssMatchTuple: XssMatchTuple): XssMatchSetUpdate = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Action" -> Action.asInstanceOf[js.Any],
        "XssMatchTuple" -> XssMatchTuple.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[XssMatchSetUpdate]
    }
  }

  /**
   * Specifies the part of a web request that you want AWS WAF to inspect for cross-site scripting attacks and, if you want AWS WAF to inspect a header, the name of the header.
   */
  @js.native
  trait XssMatchTuple extends js.Object {
    var FieldToMatch: FieldToMatch
    var TextTransformation: TextTransformation
  }

  object XssMatchTuple {
    def apply(
      FieldToMatch: FieldToMatch,
      TextTransformation: TextTransformation): XssMatchTuple = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FieldToMatch" -> FieldToMatch.asInstanceOf[js.Any],
        "TextTransformation" -> TextTransformation.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[XssMatchTuple]
    }
  }
}
