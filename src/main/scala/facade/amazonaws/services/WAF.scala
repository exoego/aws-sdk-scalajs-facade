package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import io.scalajs.nodejs
import facade.amazonaws._

package object waf {
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
  type ResourceId = String
  type ResourceName = String
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

package waf {
  @js.native
  @JSImport("aws-sdk", "WAF")
  class WAF(config: AWSConfig) extends js.Object {
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
   * <p>The <code>ActivatedRule</code> object in an <a>UpdateWebACL</a> request specifies a <code>Rule</code> that you want to insert or delete, the priority of the <code>Rule</code> in the <code>WebACL</code>, and the action that you want AWS WAF to take when a web request matches the <code>Rule</code> (<code>ALLOW</code>, <code>BLOCK</code>, or <code>COUNT</code>).</p> <p>To specify whether to insert or delete a <code>Rule</code>, use the <code>Action</code> parameter in the <a>WebACLUpdate</a> data type.</p>
   */
  @js.native
  trait ActivatedRule extends js.Object {
    var RuleId: js.UndefOr[ResourceId]
    var OverrideAction: js.UndefOr[WafOverrideAction]
    var Priority: js.UndefOr[RulePriority]
    var Action: js.UndefOr[WafAction]
    var Type: js.UndefOr[WafRuleType]
  }

  object ActivatedRule {
    def apply(
      RuleId: js.UndefOr[ResourceId] = js.undefined,
      OverrideAction: js.UndefOr[WafOverrideAction] = js.undefined,
      Priority: js.UndefOr[RulePriority] = js.undefined,
      Action: js.UndefOr[WafAction] = js.undefined,
      Type: js.UndefOr[WafRuleType] = js.undefined): ActivatedRule = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RuleId" -> RuleId.map { x => x.asInstanceOf[js.Any] },
        "OverrideAction" -> OverrideAction.map { x => x.asInstanceOf[js.Any] },
        "Priority" -> Priority.map { x => x.asInstanceOf[js.Any] },
        "Action" -> Action.map { x => x.asInstanceOf[js.Any] },
        "Type" -> Type.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ActivatedRule]
    }
  }

  /**
   * <p>In a <a>GetByteMatchSet</a> request, <code>ByteMatchSet</code> is a complex type that contains the <code>ByteMatchSetId</code> and <code>Name</code> of a <code>ByteMatchSet</code>, and the values that you specified when you updated the <code>ByteMatchSet</code>. </p> <p>A complex type that contains <code>ByteMatchTuple</code> objects, which specify the parts of web requests that you want AWS WAF to inspect and the values that you want AWS WAF to search for. If a <code>ByteMatchSet</code> contains more than one <code>ByteMatchTuple</code> object, a request needs to match the settings in only one <code>ByteMatchTuple</code> to be considered a match.</p>
   */
  @js.native
  trait ByteMatchSet extends js.Object {
    var ByteMatchSetId: js.UndefOr[ResourceId]
    var Name: js.UndefOr[ResourceName]
    var ByteMatchTuples: js.UndefOr[ByteMatchTuples]
  }

  object ByteMatchSet {
    def apply(
      ByteMatchSetId: js.UndefOr[ResourceId] = js.undefined,
      Name: js.UndefOr[ResourceName] = js.undefined,
      ByteMatchTuples: js.UndefOr[ByteMatchTuples] = js.undefined): ByteMatchSet = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ByteMatchSetId" -> ByteMatchSetId.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "ByteMatchTuples" -> ByteMatchTuples.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ByteMatchSet]
    }
  }

  /**
   * <p>Returned by <a>ListByteMatchSets</a>. Each <code>ByteMatchSetSummary</code> object includes the <code>Name</code> and <code>ByteMatchSetId</code> for one <a>ByteMatchSet</a>.</p>
   */
  @js.native
  trait ByteMatchSetSummary extends js.Object {
    var ByteMatchSetId: js.UndefOr[ResourceId]
    var Name: js.UndefOr[ResourceName]
  }

  object ByteMatchSetSummary {
    def apply(
      ByteMatchSetId: js.UndefOr[ResourceId] = js.undefined,
      Name: js.UndefOr[ResourceName] = js.undefined): ByteMatchSetSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ByteMatchSetId" -> ByteMatchSetId.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ByteMatchSetSummary]
    }
  }

  /**
   * <p>In an <a>UpdateByteMatchSet</a> request, <code>ByteMatchSetUpdate</code> specifies whether to insert or delete a <a>ByteMatchTuple</a> and includes the settings for the <code>ByteMatchTuple</code>.</p>
   */
  @js.native
  trait ByteMatchSetUpdate extends js.Object {
    var Action: js.UndefOr[ChangeAction]
    var ByteMatchTuple: js.UndefOr[ByteMatchTuple]
  }

  object ByteMatchSetUpdate {
    def apply(
      Action: js.UndefOr[ChangeAction] = js.undefined,
      ByteMatchTuple: js.UndefOr[ByteMatchTuple] = js.undefined): ByteMatchSetUpdate = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Action" -> Action.map { x => x.asInstanceOf[js.Any] },
        "ByteMatchTuple" -> ByteMatchTuple.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ByteMatchSetUpdate]
    }
  }

  /**
   * <p>The bytes (typically a string that corresponds with ASCII characters) that you want AWS WAF to search for in web requests, the location in requests that you want AWS WAF to search, and other settings.</p>
   */
  @js.native
  trait ByteMatchTuple extends js.Object {
    var FieldToMatch: js.UndefOr[FieldToMatch]
    var TargetString: js.UndefOr[ByteMatchTargetString]
    var TextTransformation: js.UndefOr[TextTransformation]
    var PositionalConstraint: js.UndefOr[PositionalConstraint]
  }

  object ByteMatchTuple {
    def apply(
      FieldToMatch: js.UndefOr[FieldToMatch] = js.undefined,
      TargetString: js.UndefOr[ByteMatchTargetString] = js.undefined,
      TextTransformation: js.UndefOr[TextTransformation] = js.undefined,
      PositionalConstraint: js.UndefOr[PositionalConstraint] = js.undefined): ByteMatchTuple = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FieldToMatch" -> FieldToMatch.map { x => x.asInstanceOf[js.Any] },
        "TargetString" -> TargetString.map { x => x.asInstanceOf[js.Any] },
        "TextTransformation" -> TextTransformation.map { x => x.asInstanceOf[js.Any] },
        "PositionalConstraint" -> PositionalConstraint.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var Name: js.UndefOr[ResourceName]
    var ChangeToken: js.UndefOr[ChangeToken]
  }

  object CreateByteMatchSetRequest {
    def apply(
      Name: js.UndefOr[ResourceName] = js.undefined,
      ChangeToken: js.UndefOr[ChangeToken] = js.undefined): CreateByteMatchSetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "ChangeToken" -> ChangeToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var Name: js.UndefOr[ResourceName]
    var ChangeToken: js.UndefOr[ChangeToken]
  }

  object CreateGeoMatchSetRequest {
    def apply(
      Name: js.UndefOr[ResourceName] = js.undefined,
      ChangeToken: js.UndefOr[ChangeToken] = js.undefined): CreateGeoMatchSetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "ChangeToken" -> ChangeToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateGeoMatchSetRequest]
    }
  }

  @js.native
  trait CreateGeoMatchSetResponse extends js.Object {
    var GeoMatchSet: js.UndefOr[GeoMatchSet]
    var ChangeToken: js.UndefOr[ChangeToken]
  }

  object CreateGeoMatchSetResponse {
    def apply(
      GeoMatchSet: js.UndefOr[GeoMatchSet] = js.undefined,
      ChangeToken: js.UndefOr[ChangeToken] = js.undefined): CreateGeoMatchSetResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GeoMatchSet" -> GeoMatchSet.map { x => x.asInstanceOf[js.Any] },
        "ChangeToken" -> ChangeToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateGeoMatchSetResponse]
    }
  }

  @js.native
  trait CreateIPSetRequest extends js.Object {
    var Name: js.UndefOr[ResourceName]
    var ChangeToken: js.UndefOr[ChangeToken]
  }

  object CreateIPSetRequest {
    def apply(
      Name: js.UndefOr[ResourceName] = js.undefined,
      ChangeToken: js.UndefOr[ChangeToken] = js.undefined): CreateIPSetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "ChangeToken" -> ChangeToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateIPSetRequest]
    }
  }

  @js.native
  trait CreateIPSetResponse extends js.Object {
    var IPSet: js.UndefOr[IPSet]
    var ChangeToken: js.UndefOr[ChangeToken]
  }

  object CreateIPSetResponse {
    def apply(
      IPSet: js.UndefOr[IPSet] = js.undefined,
      ChangeToken: js.UndefOr[ChangeToken] = js.undefined): CreateIPSetResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IPSet" -> IPSet.map { x => x.asInstanceOf[js.Any] },
        "ChangeToken" -> ChangeToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateIPSetResponse]
    }
  }

  @js.native
  trait CreateRateBasedRuleRequest extends js.Object {
    var RateLimit: js.UndefOr[RateLimit]
    var Name: js.UndefOr[ResourceName]
    var RateKey: js.UndefOr[RateKey]
    var ChangeToken: js.UndefOr[ChangeToken]
    var MetricName: js.UndefOr[MetricName]
  }

  object CreateRateBasedRuleRequest {
    def apply(
      RateLimit: js.UndefOr[RateLimit] = js.undefined,
      Name: js.UndefOr[ResourceName] = js.undefined,
      RateKey: js.UndefOr[RateKey] = js.undefined,
      ChangeToken: js.UndefOr[ChangeToken] = js.undefined,
      MetricName: js.UndefOr[MetricName] = js.undefined): CreateRateBasedRuleRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RateLimit" -> RateLimit.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "RateKey" -> RateKey.map { x => x.asInstanceOf[js.Any] },
        "ChangeToken" -> ChangeToken.map { x => x.asInstanceOf[js.Any] },
        "MetricName" -> MetricName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateRateBasedRuleRequest]
    }
  }

  @js.native
  trait CreateRateBasedRuleResponse extends js.Object {
    var Rule: js.UndefOr[RateBasedRule]
    var ChangeToken: js.UndefOr[ChangeToken]
  }

  object CreateRateBasedRuleResponse {
    def apply(
      Rule: js.UndefOr[RateBasedRule] = js.undefined,
      ChangeToken: js.UndefOr[ChangeToken] = js.undefined): CreateRateBasedRuleResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Rule" -> Rule.map { x => x.asInstanceOf[js.Any] },
        "ChangeToken" -> ChangeToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateRateBasedRuleResponse]
    }
  }

  @js.native
  trait CreateRegexMatchSetRequest extends js.Object {
    var Name: js.UndefOr[ResourceName]
    var ChangeToken: js.UndefOr[ChangeToken]
  }

  object CreateRegexMatchSetRequest {
    def apply(
      Name: js.UndefOr[ResourceName] = js.undefined,
      ChangeToken: js.UndefOr[ChangeToken] = js.undefined): CreateRegexMatchSetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "ChangeToken" -> ChangeToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateRegexMatchSetRequest]
    }
  }

  @js.native
  trait CreateRegexMatchSetResponse extends js.Object {
    var RegexMatchSet: js.UndefOr[RegexMatchSet]
    var ChangeToken: js.UndefOr[ChangeToken]
  }

  object CreateRegexMatchSetResponse {
    def apply(
      RegexMatchSet: js.UndefOr[RegexMatchSet] = js.undefined,
      ChangeToken: js.UndefOr[ChangeToken] = js.undefined): CreateRegexMatchSetResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RegexMatchSet" -> RegexMatchSet.map { x => x.asInstanceOf[js.Any] },
        "ChangeToken" -> ChangeToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateRegexMatchSetResponse]
    }
  }

  @js.native
  trait CreateRegexPatternSetRequest extends js.Object {
    var Name: js.UndefOr[ResourceName]
    var ChangeToken: js.UndefOr[ChangeToken]
  }

  object CreateRegexPatternSetRequest {
    def apply(
      Name: js.UndefOr[ResourceName] = js.undefined,
      ChangeToken: js.UndefOr[ChangeToken] = js.undefined): CreateRegexPatternSetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "ChangeToken" -> ChangeToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateRegexPatternSetRequest]
    }
  }

  @js.native
  trait CreateRegexPatternSetResponse extends js.Object {
    var RegexPatternSet: js.UndefOr[RegexPatternSet]
    var ChangeToken: js.UndefOr[ChangeToken]
  }

  object CreateRegexPatternSetResponse {
    def apply(
      RegexPatternSet: js.UndefOr[RegexPatternSet] = js.undefined,
      ChangeToken: js.UndefOr[ChangeToken] = js.undefined): CreateRegexPatternSetResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RegexPatternSet" -> RegexPatternSet.map { x => x.asInstanceOf[js.Any] },
        "ChangeToken" -> ChangeToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateRegexPatternSetResponse]
    }
  }

  @js.native
  trait CreateRuleGroupRequest extends js.Object {
    var Name: js.UndefOr[ResourceName]
    var MetricName: js.UndefOr[MetricName]
    var ChangeToken: js.UndefOr[ChangeToken]
  }

  object CreateRuleGroupRequest {
    def apply(
      Name: js.UndefOr[ResourceName] = js.undefined,
      MetricName: js.UndefOr[MetricName] = js.undefined,
      ChangeToken: js.UndefOr[ChangeToken] = js.undefined): CreateRuleGroupRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "MetricName" -> MetricName.map { x => x.asInstanceOf[js.Any] },
        "ChangeToken" -> ChangeToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateRuleGroupRequest]
    }
  }

  @js.native
  trait CreateRuleGroupResponse extends js.Object {
    var RuleGroup: js.UndefOr[RuleGroup]
    var ChangeToken: js.UndefOr[ChangeToken]
  }

  object CreateRuleGroupResponse {
    def apply(
      RuleGroup: js.UndefOr[RuleGroup] = js.undefined,
      ChangeToken: js.UndefOr[ChangeToken] = js.undefined): CreateRuleGroupResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RuleGroup" -> RuleGroup.map { x => x.asInstanceOf[js.Any] },
        "ChangeToken" -> ChangeToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateRuleGroupResponse]
    }
  }

  @js.native
  trait CreateRuleRequest extends js.Object {
    var Name: js.UndefOr[ResourceName]
    var MetricName: js.UndefOr[MetricName]
    var ChangeToken: js.UndefOr[ChangeToken]
  }

  object CreateRuleRequest {
    def apply(
      Name: js.UndefOr[ResourceName] = js.undefined,
      MetricName: js.UndefOr[MetricName] = js.undefined,
      ChangeToken: js.UndefOr[ChangeToken] = js.undefined): CreateRuleRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "MetricName" -> MetricName.map { x => x.asInstanceOf[js.Any] },
        "ChangeToken" -> ChangeToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateRuleRequest]
    }
  }

  @js.native
  trait CreateRuleResponse extends js.Object {
    var Rule: js.UndefOr[Rule]
    var ChangeToken: js.UndefOr[ChangeToken]
  }

  object CreateRuleResponse {
    def apply(
      Rule: js.UndefOr[Rule] = js.undefined,
      ChangeToken: js.UndefOr[ChangeToken] = js.undefined): CreateRuleResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Rule" -> Rule.map { x => x.asInstanceOf[js.Any] },
        "ChangeToken" -> ChangeToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateRuleResponse]
    }
  }

  @js.native
  trait CreateSizeConstraintSetRequest extends js.Object {
    var Name: js.UndefOr[ResourceName]
    var ChangeToken: js.UndefOr[ChangeToken]
  }

  object CreateSizeConstraintSetRequest {
    def apply(
      Name: js.UndefOr[ResourceName] = js.undefined,
      ChangeToken: js.UndefOr[ChangeToken] = js.undefined): CreateSizeConstraintSetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "ChangeToken" -> ChangeToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateSizeConstraintSetRequest]
    }
  }

  @js.native
  trait CreateSizeConstraintSetResponse extends js.Object {
    var SizeConstraintSet: js.UndefOr[SizeConstraintSet]
    var ChangeToken: js.UndefOr[ChangeToken]
  }

  object CreateSizeConstraintSetResponse {
    def apply(
      SizeConstraintSet: js.UndefOr[SizeConstraintSet] = js.undefined,
      ChangeToken: js.UndefOr[ChangeToken] = js.undefined): CreateSizeConstraintSetResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SizeConstraintSet" -> SizeConstraintSet.map { x => x.asInstanceOf[js.Any] },
        "ChangeToken" -> ChangeToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateSizeConstraintSetResponse]
    }
  }

  /**
   * <p>A request to create a <a>SqlInjectionMatchSet</a>.</p>
   */
  @js.native
  trait CreateSqlInjectionMatchSetRequest extends js.Object {
    var Name: js.UndefOr[ResourceName]
    var ChangeToken: js.UndefOr[ChangeToken]
  }

  object CreateSqlInjectionMatchSetRequest {
    def apply(
      Name: js.UndefOr[ResourceName] = js.undefined,
      ChangeToken: js.UndefOr[ChangeToken] = js.undefined): CreateSqlInjectionMatchSetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "ChangeToken" -> ChangeToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateSqlInjectionMatchSetRequest]
    }
  }

  /**
   * <p>The response to a <code>CreateSqlInjectionMatchSet</code> request.</p>
   */
  @js.native
  trait CreateSqlInjectionMatchSetResponse extends js.Object {
    var SqlInjectionMatchSet: js.UndefOr[SqlInjectionMatchSet]
    var ChangeToken: js.UndefOr[ChangeToken]
  }

  object CreateSqlInjectionMatchSetResponse {
    def apply(
      SqlInjectionMatchSet: js.UndefOr[SqlInjectionMatchSet] = js.undefined,
      ChangeToken: js.UndefOr[ChangeToken] = js.undefined): CreateSqlInjectionMatchSetResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SqlInjectionMatchSet" -> SqlInjectionMatchSet.map { x => x.asInstanceOf[js.Any] },
        "ChangeToken" -> ChangeToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateSqlInjectionMatchSetResponse]
    }
  }

  @js.native
  trait CreateWebACLRequest extends js.Object {
    var Name: js.UndefOr[ResourceName]
    var MetricName: js.UndefOr[MetricName]
    var DefaultAction: js.UndefOr[WafAction]
    var ChangeToken: js.UndefOr[ChangeToken]
  }

  object CreateWebACLRequest {
    def apply(
      Name: js.UndefOr[ResourceName] = js.undefined,
      MetricName: js.UndefOr[MetricName] = js.undefined,
      DefaultAction: js.UndefOr[WafAction] = js.undefined,
      ChangeToken: js.UndefOr[ChangeToken] = js.undefined): CreateWebACLRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "MetricName" -> MetricName.map { x => x.asInstanceOf[js.Any] },
        "DefaultAction" -> DefaultAction.map { x => x.asInstanceOf[js.Any] },
        "ChangeToken" -> ChangeToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateWebACLRequest]
    }
  }

  @js.native
  trait CreateWebACLResponse extends js.Object {
    var WebACL: js.UndefOr[WebACL]
    var ChangeToken: js.UndefOr[ChangeToken]
  }

  object CreateWebACLResponse {
    def apply(
      WebACL: js.UndefOr[WebACL] = js.undefined,
      ChangeToken: js.UndefOr[ChangeToken] = js.undefined): CreateWebACLResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "WebACL" -> WebACL.map { x => x.asInstanceOf[js.Any] },
        "ChangeToken" -> ChangeToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateWebACLResponse]
    }
  }

  /**
   * <p>A request to create an <a>XssMatchSet</a>.</p>
   */
  @js.native
  trait CreateXssMatchSetRequest extends js.Object {
    var Name: js.UndefOr[ResourceName]
    var ChangeToken: js.UndefOr[ChangeToken]
  }

  object CreateXssMatchSetRequest {
    def apply(
      Name: js.UndefOr[ResourceName] = js.undefined,
      ChangeToken: js.UndefOr[ChangeToken] = js.undefined): CreateXssMatchSetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "ChangeToken" -> ChangeToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateXssMatchSetRequest]
    }
  }

  /**
   * <p>The response to a <code>CreateXssMatchSet</code> request.</p>
   */
  @js.native
  trait CreateXssMatchSetResponse extends js.Object {
    var XssMatchSet: js.UndefOr[XssMatchSet]
    var ChangeToken: js.UndefOr[ChangeToken]
  }

  object CreateXssMatchSetResponse {
    def apply(
      XssMatchSet: js.UndefOr[XssMatchSet] = js.undefined,
      ChangeToken: js.UndefOr[ChangeToken] = js.undefined): CreateXssMatchSetResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "XssMatchSet" -> XssMatchSet.map { x => x.asInstanceOf[js.Any] },
        "ChangeToken" -> ChangeToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateXssMatchSetResponse]
    }
  }

  @js.native
  trait DeleteByteMatchSetRequest extends js.Object {
    var ByteMatchSetId: js.UndefOr[ResourceId]
    var ChangeToken: js.UndefOr[ChangeToken]
  }

  object DeleteByteMatchSetRequest {
    def apply(
      ByteMatchSetId: js.UndefOr[ResourceId] = js.undefined,
      ChangeToken: js.UndefOr[ChangeToken] = js.undefined): DeleteByteMatchSetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ByteMatchSetId" -> ByteMatchSetId.map { x => x.asInstanceOf[js.Any] },
        "ChangeToken" -> ChangeToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var GeoMatchSetId: js.UndefOr[ResourceId]
    var ChangeToken: js.UndefOr[ChangeToken]
  }

  object DeleteGeoMatchSetRequest {
    def apply(
      GeoMatchSetId: js.UndefOr[ResourceId] = js.undefined,
      ChangeToken: js.UndefOr[ChangeToken] = js.undefined): DeleteGeoMatchSetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GeoMatchSetId" -> GeoMatchSetId.map { x => x.asInstanceOf[js.Any] },
        "ChangeToken" -> ChangeToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var IPSetId: js.UndefOr[ResourceId]
    var ChangeToken: js.UndefOr[ChangeToken]
  }

  object DeleteIPSetRequest {
    def apply(
      IPSetId: js.UndefOr[ResourceId] = js.undefined,
      ChangeToken: js.UndefOr[ChangeToken] = js.undefined): DeleteIPSetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IPSetId" -> IPSetId.map { x => x.asInstanceOf[js.Any] },
        "ChangeToken" -> ChangeToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var ResourceArn: js.UndefOr[ResourceArn]
  }

  object DeleteLoggingConfigurationRequest {
    def apply(
      ResourceArn: js.UndefOr[ResourceArn] = js.undefined): DeleteLoggingConfigurationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceArn" -> ResourceArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var ResourceArn: js.UndefOr[ResourceArn]
  }

  object DeletePermissionPolicyRequest {
    def apply(
      ResourceArn: js.UndefOr[ResourceArn] = js.undefined): DeletePermissionPolicyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceArn" -> ResourceArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var RuleId: js.UndefOr[ResourceId]
    var ChangeToken: js.UndefOr[ChangeToken]
  }

  object DeleteRateBasedRuleRequest {
    def apply(
      RuleId: js.UndefOr[ResourceId] = js.undefined,
      ChangeToken: js.UndefOr[ChangeToken] = js.undefined): DeleteRateBasedRuleRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RuleId" -> RuleId.map { x => x.asInstanceOf[js.Any] },
        "ChangeToken" -> ChangeToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var RegexMatchSetId: js.UndefOr[ResourceId]
    var ChangeToken: js.UndefOr[ChangeToken]
  }

  object DeleteRegexMatchSetRequest {
    def apply(
      RegexMatchSetId: js.UndefOr[ResourceId] = js.undefined,
      ChangeToken: js.UndefOr[ChangeToken] = js.undefined): DeleteRegexMatchSetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RegexMatchSetId" -> RegexMatchSetId.map { x => x.asInstanceOf[js.Any] },
        "ChangeToken" -> ChangeToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var RegexPatternSetId: js.UndefOr[ResourceId]
    var ChangeToken: js.UndefOr[ChangeToken]
  }

  object DeleteRegexPatternSetRequest {
    def apply(
      RegexPatternSetId: js.UndefOr[ResourceId] = js.undefined,
      ChangeToken: js.UndefOr[ChangeToken] = js.undefined): DeleteRegexPatternSetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RegexPatternSetId" -> RegexPatternSetId.map { x => x.asInstanceOf[js.Any] },
        "ChangeToken" -> ChangeToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var RuleGroupId: js.UndefOr[ResourceId]
    var ChangeToken: js.UndefOr[ChangeToken]
  }

  object DeleteRuleGroupRequest {
    def apply(
      RuleGroupId: js.UndefOr[ResourceId] = js.undefined,
      ChangeToken: js.UndefOr[ChangeToken] = js.undefined): DeleteRuleGroupRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RuleGroupId" -> RuleGroupId.map { x => x.asInstanceOf[js.Any] },
        "ChangeToken" -> ChangeToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var RuleId: js.UndefOr[ResourceId]
    var ChangeToken: js.UndefOr[ChangeToken]
  }

  object DeleteRuleRequest {
    def apply(
      RuleId: js.UndefOr[ResourceId] = js.undefined,
      ChangeToken: js.UndefOr[ChangeToken] = js.undefined): DeleteRuleRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RuleId" -> RuleId.map { x => x.asInstanceOf[js.Any] },
        "ChangeToken" -> ChangeToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var SizeConstraintSetId: js.UndefOr[ResourceId]
    var ChangeToken: js.UndefOr[ChangeToken]
  }

  object DeleteSizeConstraintSetRequest {
    def apply(
      SizeConstraintSetId: js.UndefOr[ResourceId] = js.undefined,
      ChangeToken: js.UndefOr[ChangeToken] = js.undefined): DeleteSizeConstraintSetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SizeConstraintSetId" -> SizeConstraintSetId.map { x => x.asInstanceOf[js.Any] },
        "ChangeToken" -> ChangeToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
   * <p>A request to delete a <a>SqlInjectionMatchSet</a> from AWS WAF.</p>
   */
  @js.native
  trait DeleteSqlInjectionMatchSetRequest extends js.Object {
    var SqlInjectionMatchSetId: js.UndefOr[ResourceId]
    var ChangeToken: js.UndefOr[ChangeToken]
  }

  object DeleteSqlInjectionMatchSetRequest {
    def apply(
      SqlInjectionMatchSetId: js.UndefOr[ResourceId] = js.undefined,
      ChangeToken: js.UndefOr[ChangeToken] = js.undefined): DeleteSqlInjectionMatchSetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SqlInjectionMatchSetId" -> SqlInjectionMatchSetId.map { x => x.asInstanceOf[js.Any] },
        "ChangeToken" -> ChangeToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteSqlInjectionMatchSetRequest]
    }
  }

  /**
   * <p>The response to a request to delete a <a>SqlInjectionMatchSet</a> from AWS WAF.</p>
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
    var WebACLId: js.UndefOr[ResourceId]
    var ChangeToken: js.UndefOr[ChangeToken]
  }

  object DeleteWebACLRequest {
    def apply(
      WebACLId: js.UndefOr[ResourceId] = js.undefined,
      ChangeToken: js.UndefOr[ChangeToken] = js.undefined): DeleteWebACLRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "WebACLId" -> WebACLId.map { x => x.asInstanceOf[js.Any] },
        "ChangeToken" -> ChangeToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
   * <p>A request to delete an <a>XssMatchSet</a> from AWS WAF.</p>
   */
  @js.native
  trait DeleteXssMatchSetRequest extends js.Object {
    var XssMatchSetId: js.UndefOr[ResourceId]
    var ChangeToken: js.UndefOr[ChangeToken]
  }

  object DeleteXssMatchSetRequest {
    def apply(
      XssMatchSetId: js.UndefOr[ResourceId] = js.undefined,
      ChangeToken: js.UndefOr[ChangeToken] = js.undefined): DeleteXssMatchSetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "XssMatchSetId" -> XssMatchSetId.map { x => x.asInstanceOf[js.Any] },
        "ChangeToken" -> ChangeToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteXssMatchSetRequest]
    }
  }

  /**
   * <p>The response to a request to delete an <a>XssMatchSet</a> from AWS WAF.</p>
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

  /**
   * <p>Specifies where in a web request to look for <code>TargetString</code>.</p>
   */
  @js.native
  trait FieldToMatch extends js.Object {
    var Type: js.UndefOr[MatchFieldType]
    var Data: js.UndefOr[MatchFieldData]
  }

  object FieldToMatch {
    def apply(
      Type: js.UndefOr[MatchFieldType] = js.undefined,
      Data: js.UndefOr[MatchFieldData] = js.undefined): FieldToMatch = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Type" -> Type.map { x => x.asInstanceOf[js.Any] },
        "Data" -> Data.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[FieldToMatch]
    }
  }

  /**
   * <p>The country from which web requests originate that you want AWS WAF to search for.</p>
   */
  @js.native
  trait GeoMatchConstraint extends js.Object {
    var Type: js.UndefOr[GeoMatchConstraintType]
    var Value: js.UndefOr[GeoMatchConstraintValue]
  }

  object GeoMatchConstraint {
    def apply(
      Type: js.UndefOr[GeoMatchConstraintType] = js.undefined,
      Value: js.UndefOr[GeoMatchConstraintValue] = js.undefined): GeoMatchConstraint = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Type" -> Type.map { x => x.asInstanceOf[js.Any] },
        "Value" -> Value.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
   * <p>Contains one or more countries that AWS WAF will search for.</p>
   */
  @js.native
  trait GeoMatchSet extends js.Object {
    var GeoMatchSetId: js.UndefOr[ResourceId]
    var Name: js.UndefOr[ResourceName]
    var GeoMatchConstraints: js.UndefOr[GeoMatchConstraints]
  }

  object GeoMatchSet {
    def apply(
      GeoMatchSetId: js.UndefOr[ResourceId] = js.undefined,
      Name: js.UndefOr[ResourceName] = js.undefined,
      GeoMatchConstraints: js.UndefOr[GeoMatchConstraints] = js.undefined): GeoMatchSet = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GeoMatchSetId" -> GeoMatchSetId.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "GeoMatchConstraints" -> GeoMatchConstraints.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GeoMatchSet]
    }
  }

  /**
   * <p>Contains the identifier and the name of the <code>GeoMatchSet</code>.</p>
   */
  @js.native
  trait GeoMatchSetSummary extends js.Object {
    var GeoMatchSetId: js.UndefOr[ResourceId]
    var Name: js.UndefOr[ResourceName]
  }

  object GeoMatchSetSummary {
    def apply(
      GeoMatchSetId: js.UndefOr[ResourceId] = js.undefined,
      Name: js.UndefOr[ResourceName] = js.undefined): GeoMatchSetSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GeoMatchSetId" -> GeoMatchSetId.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GeoMatchSetSummary]
    }
  }

  /**
   * <p>Specifies the type of update to perform to an <a>GeoMatchSet</a> with <a>UpdateGeoMatchSet</a>.</p>
   */
  @js.native
  trait GeoMatchSetUpdate extends js.Object {
    var Action: js.UndefOr[ChangeAction]
    var GeoMatchConstraint: js.UndefOr[GeoMatchConstraint]
  }

  object GeoMatchSetUpdate {
    def apply(
      Action: js.UndefOr[ChangeAction] = js.undefined,
      GeoMatchConstraint: js.UndefOr[GeoMatchConstraint] = js.undefined): GeoMatchSetUpdate = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Action" -> Action.map { x => x.asInstanceOf[js.Any] },
        "GeoMatchConstraint" -> GeoMatchConstraint.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GeoMatchSetUpdate]
    }
  }

  @js.native
  trait GetByteMatchSetRequest extends js.Object {
    var ByteMatchSetId: js.UndefOr[ResourceId]
  }

  object GetByteMatchSetRequest {
    def apply(
      ByteMatchSetId: js.UndefOr[ResourceId] = js.undefined): GetByteMatchSetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ByteMatchSetId" -> ByteMatchSetId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var ChangeToken: js.UndefOr[ChangeToken]
  }

  object GetChangeTokenStatusRequest {
    def apply(
      ChangeToken: js.UndefOr[ChangeToken] = js.undefined): GetChangeTokenStatusRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ChangeToken" -> ChangeToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var GeoMatchSetId: js.UndefOr[ResourceId]
  }

  object GetGeoMatchSetRequest {
    def apply(
      GeoMatchSetId: js.UndefOr[ResourceId] = js.undefined): GetGeoMatchSetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GeoMatchSetId" -> GeoMatchSetId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var IPSetId: js.UndefOr[ResourceId]
  }

  object GetIPSetRequest {
    def apply(
      IPSetId: js.UndefOr[ResourceId] = js.undefined): GetIPSetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IPSetId" -> IPSetId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var ResourceArn: js.UndefOr[ResourceArn]
  }

  object GetLoggingConfigurationRequest {
    def apply(
      ResourceArn: js.UndefOr[ResourceArn] = js.undefined): GetLoggingConfigurationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceArn" -> ResourceArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var ResourceArn: js.UndefOr[ResourceArn]
  }

  object GetPermissionPolicyRequest {
    def apply(
      ResourceArn: js.UndefOr[ResourceArn] = js.undefined): GetPermissionPolicyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceArn" -> ResourceArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var RuleId: js.UndefOr[ResourceId]
    var NextMarker: js.UndefOr[NextMarker]
  }

  object GetRateBasedRuleManagedKeysRequest {
    def apply(
      RuleId: js.UndefOr[ResourceId] = js.undefined,
      NextMarker: js.UndefOr[NextMarker] = js.undefined): GetRateBasedRuleManagedKeysRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RuleId" -> RuleId.map { x => x.asInstanceOf[js.Any] },
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
    var RuleId: js.UndefOr[ResourceId]
  }

  object GetRateBasedRuleRequest {
    def apply(
      RuleId: js.UndefOr[ResourceId] = js.undefined): GetRateBasedRuleRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RuleId" -> RuleId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var RegexMatchSetId: js.UndefOr[ResourceId]
  }

  object GetRegexMatchSetRequest {
    def apply(
      RegexMatchSetId: js.UndefOr[ResourceId] = js.undefined): GetRegexMatchSetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RegexMatchSetId" -> RegexMatchSetId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var RegexPatternSetId: js.UndefOr[ResourceId]
  }

  object GetRegexPatternSetRequest {
    def apply(
      RegexPatternSetId: js.UndefOr[ResourceId] = js.undefined): GetRegexPatternSetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RegexPatternSetId" -> RegexPatternSetId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var RuleGroupId: js.UndefOr[ResourceId]
  }

  object GetRuleGroupRequest {
    def apply(
      RuleGroupId: js.UndefOr[ResourceId] = js.undefined): GetRuleGroupRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RuleGroupId" -> RuleGroupId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var RuleId: js.UndefOr[ResourceId]
  }

  object GetRuleRequest {
    def apply(
      RuleId: js.UndefOr[ResourceId] = js.undefined): GetRuleRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RuleId" -> RuleId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var WebAclId: js.UndefOr[ResourceId]
    var RuleId: js.UndefOr[ResourceId]
    var TimeWindow: js.UndefOr[TimeWindow]
    var MaxItems: js.UndefOr[GetSampledRequestsMaxItems]
  }

  object GetSampledRequestsRequest {
    def apply(
      WebAclId: js.UndefOr[ResourceId] = js.undefined,
      RuleId: js.UndefOr[ResourceId] = js.undefined,
      TimeWindow: js.UndefOr[TimeWindow] = js.undefined,
      MaxItems: js.UndefOr[GetSampledRequestsMaxItems] = js.undefined): GetSampledRequestsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "WebAclId" -> WebAclId.map { x => x.asInstanceOf[js.Any] },
        "RuleId" -> RuleId.map { x => x.asInstanceOf[js.Any] },
        "TimeWindow" -> TimeWindow.map { x => x.asInstanceOf[js.Any] },
        "MaxItems" -> MaxItems.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetSampledRequestsRequest]
    }
  }

  @js.native
  trait GetSampledRequestsResponse extends js.Object {
    var SampledRequests: js.UndefOr[SampledHTTPRequests]
    var PopulationSize: js.UndefOr[PopulationSize]
    var TimeWindow: js.UndefOr[TimeWindow]
  }

  object GetSampledRequestsResponse {
    def apply(
      SampledRequests: js.UndefOr[SampledHTTPRequests] = js.undefined,
      PopulationSize: js.UndefOr[PopulationSize] = js.undefined,
      TimeWindow: js.UndefOr[TimeWindow] = js.undefined): GetSampledRequestsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SampledRequests" -> SampledRequests.map { x => x.asInstanceOf[js.Any] },
        "PopulationSize" -> PopulationSize.map { x => x.asInstanceOf[js.Any] },
        "TimeWindow" -> TimeWindow.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetSampledRequestsResponse]
    }
  }

  @js.native
  trait GetSizeConstraintSetRequest extends js.Object {
    var SizeConstraintSetId: js.UndefOr[ResourceId]
  }

  object GetSizeConstraintSetRequest {
    def apply(
      SizeConstraintSetId: js.UndefOr[ResourceId] = js.undefined): GetSizeConstraintSetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SizeConstraintSetId" -> SizeConstraintSetId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
   * <p>A request to get a <a>SqlInjectionMatchSet</a>.</p>
   */
  @js.native
  trait GetSqlInjectionMatchSetRequest extends js.Object {
    var SqlInjectionMatchSetId: js.UndefOr[ResourceId]
  }

  object GetSqlInjectionMatchSetRequest {
    def apply(
      SqlInjectionMatchSetId: js.UndefOr[ResourceId] = js.undefined): GetSqlInjectionMatchSetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SqlInjectionMatchSetId" -> SqlInjectionMatchSetId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetSqlInjectionMatchSetRequest]
    }
  }

  /**
   * <p>The response to a <a>GetSqlInjectionMatchSet</a> request.</p>
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
  trait GetWebACLRequest extends js.Object {
    var WebACLId: js.UndefOr[ResourceId]
  }

  object GetWebACLRequest {
    def apply(
      WebACLId: js.UndefOr[ResourceId] = js.undefined): GetWebACLRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "WebACLId" -> WebACLId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
   * <p>A request to get an <a>XssMatchSet</a>.</p>
   */
  @js.native
  trait GetXssMatchSetRequest extends js.Object {
    var XssMatchSetId: js.UndefOr[ResourceId]
  }

  object GetXssMatchSetRequest {
    def apply(
      XssMatchSetId: js.UndefOr[ResourceId] = js.undefined): GetXssMatchSetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "XssMatchSetId" -> XssMatchSetId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetXssMatchSetRequest]
    }
  }

  /**
   * <p>The response to a <a>GetXssMatchSet</a> request.</p>
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
   * <p>The response from a <a>GetSampledRequests</a> request includes an <code>HTTPHeader</code> complex type that appears as <code>Headers</code> in the response syntax. <code>HTTPHeader</code> contains the names and values of all of the headers that appear in one of the web requests that were returned by <code>GetSampledRequests</code>. </p>
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
   * <p>The response from a <a>GetSampledRequests</a> request includes an <code>HTTPRequest</code> complex type that appears as <code>Request</code> in the response syntax. <code>HTTPRequest</code> contains information about one of the web requests that were returned by <code>GetSampledRequests</code>. </p>
   */
  @js.native
  trait HTTPRequest extends js.Object {
    var URI: js.UndefOr[URIString]
    var Country: js.UndefOr[Country]
    var ClientIP: js.UndefOr[IPString]
    var Headers: js.UndefOr[HTTPHeaders]
    var Method: js.UndefOr[HTTPMethod]
    var HTTPVersion: js.UndefOr[HTTPVersion]
  }

  object HTTPRequest {
    def apply(
      URI: js.UndefOr[URIString] = js.undefined,
      Country: js.UndefOr[Country] = js.undefined,
      ClientIP: js.UndefOr[IPString] = js.undefined,
      Headers: js.UndefOr[HTTPHeaders] = js.undefined,
      Method: js.UndefOr[HTTPMethod] = js.undefined,
      HTTPVersion: js.UndefOr[HTTPVersion] = js.undefined): HTTPRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "URI" -> URI.map { x => x.asInstanceOf[js.Any] },
        "Country" -> Country.map { x => x.asInstanceOf[js.Any] },
        "ClientIP" -> ClientIP.map { x => x.asInstanceOf[js.Any] },
        "Headers" -> Headers.map { x => x.asInstanceOf[js.Any] },
        "Method" -> Method.map { x => x.asInstanceOf[js.Any] },
        "HTTPVersion" -> HTTPVersion.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[HTTPRequest]
    }
  }

  /**
   * <p>Contains one or more IP addresses or blocks of IP addresses specified in Classless Inter-Domain Routing (CIDR) notation. AWS WAF supports IPv4 address ranges: /8 and any range between /16 through /32. AWS WAF supports IPv6 address ranges: /16, /24, /32, /48, /56, /64, and /128.</p> <p>To specify an individual IP address, you specify the four-part IP address followed by a <code>/32</code>, for example, 192.0.2.0/31. To block a range of IP addresses, you can specify /8 or any range between /16 through /32 (for IPv4) or /16, /24, /32, /48, /56, /64, or /128 (for IPv6). For more information about CIDR notation, see the Wikipedia entry <a href="https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing">Classless Inter-Domain Routing</a>. </p>
   */
  @js.native
  trait IPSet extends js.Object {
    var IPSetId: js.UndefOr[ResourceId]
    var Name: js.UndefOr[ResourceName]
    var IPSetDescriptors: js.UndefOr[IPSetDescriptors]
  }

  object IPSet {
    def apply(
      IPSetId: js.UndefOr[ResourceId] = js.undefined,
      Name: js.UndefOr[ResourceName] = js.undefined,
      IPSetDescriptors: js.UndefOr[IPSetDescriptors] = js.undefined): IPSet = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IPSetId" -> IPSetId.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "IPSetDescriptors" -> IPSetDescriptors.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[IPSet]
    }
  }

  /**
   * <p>Specifies the IP address type (<code>IPV4</code> or <code>IPV6</code>) and the IP address range (in CIDR format) that web requests originate from.</p>
   */
  @js.native
  trait IPSetDescriptor extends js.Object {
    var Type: js.UndefOr[IPSetDescriptorType]
    var Value: js.UndefOr[IPSetDescriptorValue]
  }

  object IPSetDescriptor {
    def apply(
      Type: js.UndefOr[IPSetDescriptorType] = js.undefined,
      Value: js.UndefOr[IPSetDescriptorValue] = js.undefined): IPSetDescriptor = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Type" -> Type.map { x => x.asInstanceOf[js.Any] },
        "Value" -> Value.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[IPSetDescriptor]
    }
  }

  object IPSetDescriptorTypeEnum {
    val IPV4 = "IPV4"
    val IPV6 = "IPV6"

    val values = IndexedSeq(IPV4, IPV6)
  }

  /**
   * <p>Contains the identifier and the name of the <code>IPSet</code>.</p>
   */
  @js.native
  trait IPSetSummary extends js.Object {
    var IPSetId: js.UndefOr[ResourceId]
    var Name: js.UndefOr[ResourceName]
  }

  object IPSetSummary {
    def apply(
      IPSetId: js.UndefOr[ResourceId] = js.undefined,
      Name: js.UndefOr[ResourceName] = js.undefined): IPSetSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IPSetId" -> IPSetId.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[IPSetSummary]
    }
  }

  /**
   * <p>Specifies the type of update to perform to an <a>IPSet</a> with <a>UpdateIPSet</a>.</p>
   */
  @js.native
  trait IPSetUpdate extends js.Object {
    var Action: js.UndefOr[ChangeAction]
    var IPSetDescriptor: js.UndefOr[IPSetDescriptor]
  }

  object IPSetUpdate {
    def apply(
      Action: js.UndefOr[ChangeAction] = js.undefined,
      IPSetDescriptor: js.UndefOr[IPSetDescriptor] = js.undefined): IPSetUpdate = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Action" -> Action.map { x => x.asInstanceOf[js.Any] },
        "IPSetDescriptor" -> IPSetDescriptor.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[IPSetUpdate]
    }
  }

  @js.native
  trait ListActivatedRulesInRuleGroupRequest extends js.Object {
    var RuleGroupId: js.UndefOr[ResourceId]
    var NextMarker: js.UndefOr[NextMarker]
    var Limit: js.UndefOr[PaginationLimit]
  }

  object ListActivatedRulesInRuleGroupRequest {
    def apply(
      RuleGroupId: js.UndefOr[ResourceId] = js.undefined,
      NextMarker: js.UndefOr[NextMarker] = js.undefined,
      Limit: js.UndefOr[PaginationLimit] = js.undefined): ListActivatedRulesInRuleGroupRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RuleGroupId" -> RuleGroupId.map { x => x.asInstanceOf[js.Any] },
        "NextMarker" -> NextMarker.map { x => x.asInstanceOf[js.Any] },
        "Limit" -> Limit.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListActivatedRulesInRuleGroupRequest]
    }
  }

  @js.native
  trait ListActivatedRulesInRuleGroupResponse extends js.Object {
    var NextMarker: js.UndefOr[NextMarker]
    var ActivatedRules: js.UndefOr[ActivatedRules]
  }

  object ListActivatedRulesInRuleGroupResponse {
    def apply(
      NextMarker: js.UndefOr[NextMarker] = js.undefined,
      ActivatedRules: js.UndefOr[ActivatedRules] = js.undefined): ListActivatedRulesInRuleGroupResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextMarker" -> NextMarker.map { x => x.asInstanceOf[js.Any] },
        "ActivatedRules" -> ActivatedRules.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListActivatedRulesInRuleGroupResponse]
    }
  }

  @js.native
  trait ListByteMatchSetsRequest extends js.Object {
    var NextMarker: js.UndefOr[NextMarker]
    var Limit: js.UndefOr[PaginationLimit]
  }

  object ListByteMatchSetsRequest {
    def apply(
      NextMarker: js.UndefOr[NextMarker] = js.undefined,
      Limit: js.UndefOr[PaginationLimit] = js.undefined): ListByteMatchSetsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextMarker" -> NextMarker.map { x => x.asInstanceOf[js.Any] },
        "Limit" -> Limit.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListByteMatchSetsRequest]
    }
  }

  @js.native
  trait ListByteMatchSetsResponse extends js.Object {
    var NextMarker: js.UndefOr[NextMarker]
    var ByteMatchSets: js.UndefOr[ByteMatchSetSummaries]
  }

  object ListByteMatchSetsResponse {
    def apply(
      NextMarker: js.UndefOr[NextMarker] = js.undefined,
      ByteMatchSets: js.UndefOr[ByteMatchSetSummaries] = js.undefined): ListByteMatchSetsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextMarker" -> NextMarker.map { x => x.asInstanceOf[js.Any] },
        "ByteMatchSets" -> ByteMatchSets.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListByteMatchSetsResponse]
    }
  }

  @js.native
  trait ListGeoMatchSetsRequest extends js.Object {
    var NextMarker: js.UndefOr[NextMarker]
    var Limit: js.UndefOr[PaginationLimit]
  }

  object ListGeoMatchSetsRequest {
    def apply(
      NextMarker: js.UndefOr[NextMarker] = js.undefined,
      Limit: js.UndefOr[PaginationLimit] = js.undefined): ListGeoMatchSetsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextMarker" -> NextMarker.map { x => x.asInstanceOf[js.Any] },
        "Limit" -> Limit.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListGeoMatchSetsRequest]
    }
  }

  @js.native
  trait ListGeoMatchSetsResponse extends js.Object {
    var NextMarker: js.UndefOr[NextMarker]
    var GeoMatchSets: js.UndefOr[GeoMatchSetSummaries]
  }

  object ListGeoMatchSetsResponse {
    def apply(
      NextMarker: js.UndefOr[NextMarker] = js.undefined,
      GeoMatchSets: js.UndefOr[GeoMatchSetSummaries] = js.undefined): ListGeoMatchSetsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextMarker" -> NextMarker.map { x => x.asInstanceOf[js.Any] },
        "GeoMatchSets" -> GeoMatchSets.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListGeoMatchSetsResponse]
    }
  }

  @js.native
  trait ListIPSetsRequest extends js.Object {
    var NextMarker: js.UndefOr[NextMarker]
    var Limit: js.UndefOr[PaginationLimit]
  }

  object ListIPSetsRequest {
    def apply(
      NextMarker: js.UndefOr[NextMarker] = js.undefined,
      Limit: js.UndefOr[PaginationLimit] = js.undefined): ListIPSetsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextMarker" -> NextMarker.map { x => x.asInstanceOf[js.Any] },
        "Limit" -> Limit.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListIPSetsRequest]
    }
  }

  @js.native
  trait ListIPSetsResponse extends js.Object {
    var NextMarker: js.UndefOr[NextMarker]
    var IPSets: js.UndefOr[IPSetSummaries]
  }

  object ListIPSetsResponse {
    def apply(
      NextMarker: js.UndefOr[NextMarker] = js.undefined,
      IPSets: js.UndefOr[IPSetSummaries] = js.undefined): ListIPSetsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextMarker" -> NextMarker.map { x => x.asInstanceOf[js.Any] },
        "IPSets" -> IPSets.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListIPSetsResponse]
    }
  }

  @js.native
  trait ListLoggingConfigurationsRequest extends js.Object {
    var NextMarker: js.UndefOr[NextMarker]
    var Limit: js.UndefOr[PaginationLimit]
  }

  object ListLoggingConfigurationsRequest {
    def apply(
      NextMarker: js.UndefOr[NextMarker] = js.undefined,
      Limit: js.UndefOr[PaginationLimit] = js.undefined): ListLoggingConfigurationsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextMarker" -> NextMarker.map { x => x.asInstanceOf[js.Any] },
        "Limit" -> Limit.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var NextMarker: js.UndefOr[NextMarker]
    var Limit: js.UndefOr[PaginationLimit]
  }

  object ListRateBasedRulesRequest {
    def apply(
      NextMarker: js.UndefOr[NextMarker] = js.undefined,
      Limit: js.UndefOr[PaginationLimit] = js.undefined): ListRateBasedRulesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextMarker" -> NextMarker.map { x => x.asInstanceOf[js.Any] },
        "Limit" -> Limit.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var NextMarker: js.UndefOr[NextMarker]
    var Limit: js.UndefOr[PaginationLimit]
  }

  object ListRegexMatchSetsRequest {
    def apply(
      NextMarker: js.UndefOr[NextMarker] = js.undefined,
      Limit: js.UndefOr[PaginationLimit] = js.undefined): ListRegexMatchSetsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextMarker" -> NextMarker.map { x => x.asInstanceOf[js.Any] },
        "Limit" -> Limit.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var NextMarker: js.UndefOr[NextMarker]
    var Limit: js.UndefOr[PaginationLimit]
  }

  object ListRegexPatternSetsRequest {
    def apply(
      NextMarker: js.UndefOr[NextMarker] = js.undefined,
      Limit: js.UndefOr[PaginationLimit] = js.undefined): ListRegexPatternSetsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextMarker" -> NextMarker.map { x => x.asInstanceOf[js.Any] },
        "Limit" -> Limit.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
  trait ListRuleGroupsRequest extends js.Object {
    var NextMarker: js.UndefOr[NextMarker]
    var Limit: js.UndefOr[PaginationLimit]
  }

  object ListRuleGroupsRequest {
    def apply(
      NextMarker: js.UndefOr[NextMarker] = js.undefined,
      Limit: js.UndefOr[PaginationLimit] = js.undefined): ListRuleGroupsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextMarker" -> NextMarker.map { x => x.asInstanceOf[js.Any] },
        "Limit" -> Limit.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var NextMarker: js.UndefOr[NextMarker]
    var Limit: js.UndefOr[PaginationLimit]
  }

  object ListRulesRequest {
    def apply(
      NextMarker: js.UndefOr[NextMarker] = js.undefined,
      Limit: js.UndefOr[PaginationLimit] = js.undefined): ListRulesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextMarker" -> NextMarker.map { x => x.asInstanceOf[js.Any] },
        "Limit" -> Limit.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var NextMarker: js.UndefOr[NextMarker]
    var Limit: js.UndefOr[PaginationLimit]
  }

  object ListSizeConstraintSetsRequest {
    def apply(
      NextMarker: js.UndefOr[NextMarker] = js.undefined,
      Limit: js.UndefOr[PaginationLimit] = js.undefined): ListSizeConstraintSetsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextMarker" -> NextMarker.map { x => x.asInstanceOf[js.Any] },
        "Limit" -> Limit.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
   * <p>A request to list the <a>SqlInjectionMatchSet</a> objects created by the current AWS account.</p>
   */
  @js.native
  trait ListSqlInjectionMatchSetsRequest extends js.Object {
    var NextMarker: js.UndefOr[NextMarker]
    var Limit: js.UndefOr[PaginationLimit]
  }

  object ListSqlInjectionMatchSetsRequest {
    def apply(
      NextMarker: js.UndefOr[NextMarker] = js.undefined,
      Limit: js.UndefOr[PaginationLimit] = js.undefined): ListSqlInjectionMatchSetsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextMarker" -> NextMarker.map { x => x.asInstanceOf[js.Any] },
        "Limit" -> Limit.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListSqlInjectionMatchSetsRequest]
    }
  }

  /**
   * <p>The response to a <a>ListSqlInjectionMatchSets</a> request.</p>
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
    var NextMarker: js.UndefOr[NextMarker]
    var Limit: js.UndefOr[PaginationLimit]
  }

  object ListSubscribedRuleGroupsRequest {
    def apply(
      NextMarker: js.UndefOr[NextMarker] = js.undefined,
      Limit: js.UndefOr[PaginationLimit] = js.undefined): ListSubscribedRuleGroupsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextMarker" -> NextMarker.map { x => x.asInstanceOf[js.Any] },
        "Limit" -> Limit.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var NextMarker: js.UndefOr[NextMarker]
    var Limit: js.UndefOr[PaginationLimit]
  }

  object ListWebACLsRequest {
    def apply(
      NextMarker: js.UndefOr[NextMarker] = js.undefined,
      Limit: js.UndefOr[PaginationLimit] = js.undefined): ListWebACLsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextMarker" -> NextMarker.map { x => x.asInstanceOf[js.Any] },
        "Limit" -> Limit.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
   * <p>A request to list the <a>XssMatchSet</a> objects created by the current AWS account.</p>
   */
  @js.native
  trait ListXssMatchSetsRequest extends js.Object {
    var NextMarker: js.UndefOr[NextMarker]
    var Limit: js.UndefOr[PaginationLimit]
  }

  object ListXssMatchSetsRequest {
    def apply(
      NextMarker: js.UndefOr[NextMarker] = js.undefined,
      Limit: js.UndefOr[PaginationLimit] = js.undefined): ListXssMatchSetsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextMarker" -> NextMarker.map { x => x.asInstanceOf[js.Any] },
        "Limit" -> Limit.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListXssMatchSetsRequest]
    }
  }

  /**
   * <p>The response to a <a>ListXssMatchSets</a> request.</p>
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
   * <p>The Amazon Kinesis Data Firehose delivery streams, <code>RedactedFields</code> information, and the web ACL Amazon Resource Name (ARN).</p>
   */
  @js.native
  trait LoggingConfiguration extends js.Object {
    var ResourceArn: js.UndefOr[ResourceArn]
    var LogDestinationConfigs: js.UndefOr[LogDestinationConfigs]
    var RedactedFields: js.UndefOr[RedactedFields]
  }

  object LoggingConfiguration {
    def apply(
      ResourceArn: js.UndefOr[ResourceArn] = js.undefined,
      LogDestinationConfigs: js.UndefOr[LogDestinationConfigs] = js.undefined,
      RedactedFields: js.UndefOr[RedactedFields] = js.undefined): LoggingConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceArn" -> ResourceArn.map { x => x.asInstanceOf[js.Any] },
        "LogDestinationConfigs" -> LogDestinationConfigs.map { x => x.asInstanceOf[js.Any] },
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
   * <p>Specifies the <a>ByteMatchSet</a>, <a>IPSet</a>, <a>SqlInjectionMatchSet</a>, <a>XssMatchSet</a>, <a>RegexMatchSet</a>, <a>GeoMatchSet</a>, and <a>SizeConstraintSet</a> objects that you want to add to a <code>Rule</code> and, for each object, indicates whether you want to negate the settings, for example, requests that do NOT originate from the IP address 192.0.2.44. </p>
   */
  @js.native
  trait Predicate extends js.Object {
    var Negated: js.UndefOr[Negated]
    var Type: js.UndefOr[PredicateType]
    var DataId: js.UndefOr[ResourceId]
  }

  object Predicate {
    def apply(
      Negated: js.UndefOr[Negated] = js.undefined,
      Type: js.UndefOr[PredicateType] = js.undefined,
      DataId: js.UndefOr[ResourceId] = js.undefined): Predicate = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Negated" -> Negated.map { x => x.asInstanceOf[js.Any] },
        "Type" -> Type.map { x => x.asInstanceOf[js.Any] },
        "DataId" -> DataId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var LoggingConfiguration: js.UndefOr[LoggingConfiguration]
  }

  object PutLoggingConfigurationRequest {
    def apply(
      LoggingConfiguration: js.UndefOr[LoggingConfiguration] = js.undefined): PutLoggingConfigurationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LoggingConfiguration" -> LoggingConfiguration.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var ResourceArn: js.UndefOr[ResourceArn]
    var Policy: js.UndefOr[PolicyString]
  }

  object PutPermissionPolicyRequest {
    def apply(
      ResourceArn: js.UndefOr[ResourceArn] = js.undefined,
      Policy: js.UndefOr[PolicyString] = js.undefined): PutPermissionPolicyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceArn" -> ResourceArn.map { x => x.asInstanceOf[js.Any] },
        "Policy" -> Policy.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
   * <p>A <code>RateBasedRule</code> is identical to a regular <a>Rule</a>, with one addition: a <code>RateBasedRule</code> counts the number of requests that arrive from a specified IP address every five minutes. For example, based on recent requests that you've seen from an attacker, you might create a <code>RateBasedRule</code> that includes the following conditions: </p> <ul> <li> <p>The requests come from 192.0.2.44.</p> </li> <li> <p>They contain the value <code>BadBot</code> in the <code>User-Agent</code> header.</p> </li> </ul> <p>In the rule, you also define the rate limit as 15,000.</p> <p>Requests that meet both of these conditions and exceed 15,000 requests every five minutes trigger the rule's action (block or count), which is defined in the web ACL.</p>
   */
  @js.native
  trait RateBasedRule extends js.Object {
    var RateLimit: js.UndefOr[RateLimit]
    var MatchPredicates: js.UndefOr[Predicates]
    var Name: js.UndefOr[ResourceName]
    var RateKey: js.UndefOr[RateKey]
    var RuleId: js.UndefOr[ResourceId]
    var MetricName: js.UndefOr[MetricName]
  }

  object RateBasedRule {
    def apply(
      RateLimit: js.UndefOr[RateLimit] = js.undefined,
      MatchPredicates: js.UndefOr[Predicates] = js.undefined,
      Name: js.UndefOr[ResourceName] = js.undefined,
      RateKey: js.UndefOr[RateKey] = js.undefined,
      RuleId: js.UndefOr[ResourceId] = js.undefined,
      MetricName: js.UndefOr[MetricName] = js.undefined): RateBasedRule = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RateLimit" -> RateLimit.map { x => x.asInstanceOf[js.Any] },
        "MatchPredicates" -> MatchPredicates.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "RateKey" -> RateKey.map { x => x.asInstanceOf[js.Any] },
        "RuleId" -> RuleId.map { x => x.asInstanceOf[js.Any] },
        "MetricName" -> MetricName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RateBasedRule]
    }
  }

  object RateKeyEnum {
    val IP = "IP"

    val values = IndexedSeq(IP)
  }

  /**
   * <p>In a <a>GetRegexMatchSet</a> request, <code>RegexMatchSet</code> is a complex type that contains the <code>RegexMatchSetId</code> and <code>Name</code> of a <code>RegexMatchSet</code>, and the values that you specified when you updated the <code>RegexMatchSet</code>.</p> <p> The values are contained in a <code>RegexMatchTuple</code> object, which specify the parts of web requests that you want AWS WAF to inspect and the values that you want AWS WAF to search for. If a <code>RegexMatchSet</code> contains more than one <code>RegexMatchTuple</code> object, a request needs to match the settings in only one <code>ByteMatchTuple</code> to be considered a match.</p>
   */
  @js.native
  trait RegexMatchSet extends js.Object {
    var RegexMatchSetId: js.UndefOr[ResourceId]
    var Name: js.UndefOr[ResourceName]
    var RegexMatchTuples: js.UndefOr[RegexMatchTuples]
  }

  object RegexMatchSet {
    def apply(
      RegexMatchSetId: js.UndefOr[ResourceId] = js.undefined,
      Name: js.UndefOr[ResourceName] = js.undefined,
      RegexMatchTuples: js.UndefOr[RegexMatchTuples] = js.undefined): RegexMatchSet = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RegexMatchSetId" -> RegexMatchSetId.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "RegexMatchTuples" -> RegexMatchTuples.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RegexMatchSet]
    }
  }

  /**
   * <p>Returned by <a>ListRegexMatchSets</a>. Each <code>RegexMatchSetSummary</code> object includes the <code>Name</code> and <code>RegexMatchSetId</code> for one <a>RegexMatchSet</a>.</p>
   */
  @js.native
  trait RegexMatchSetSummary extends js.Object {
    var RegexMatchSetId: js.UndefOr[ResourceId]
    var Name: js.UndefOr[ResourceName]
  }

  object RegexMatchSetSummary {
    def apply(
      RegexMatchSetId: js.UndefOr[ResourceId] = js.undefined,
      Name: js.UndefOr[ResourceName] = js.undefined): RegexMatchSetSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RegexMatchSetId" -> RegexMatchSetId.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RegexMatchSetSummary]
    }
  }

  /**
   * <p>In an <a>UpdateRegexMatchSet</a> request, <code>RegexMatchSetUpdate</code> specifies whether to insert or delete a <a>RegexMatchTuple</a> and includes the settings for the <code>RegexMatchTuple</code>.</p>
   */
  @js.native
  trait RegexMatchSetUpdate extends js.Object {
    var Action: js.UndefOr[ChangeAction]
    var RegexMatchTuple: js.UndefOr[RegexMatchTuple]
  }

  object RegexMatchSetUpdate {
    def apply(
      Action: js.UndefOr[ChangeAction] = js.undefined,
      RegexMatchTuple: js.UndefOr[RegexMatchTuple] = js.undefined): RegexMatchSetUpdate = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Action" -> Action.map { x => x.asInstanceOf[js.Any] },
        "RegexMatchTuple" -> RegexMatchTuple.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RegexMatchSetUpdate]
    }
  }

  /**
   * <p>The regular expression pattern that you want AWS WAF to search for in web requests, the location in requests that you want AWS WAF to search, and other settings. Each <code>RegexMatchTuple</code> object contains: </p> <ul> <li> <p>The part of a web request that you want AWS WAF to inspect, such as a query string or the value of the <code>User-Agent</code> header. </p> </li> <li> <p>The identifier of the pattern (a regular expression) that you want AWS WAF to look for. For more information, see <a>RegexPatternSet</a>. </p> </li> <li> <p>Whether to perform any conversions on the request, such as converting it to lowercase, before inspecting it for the specified string.</p> </li> </ul>
   */
  @js.native
  trait RegexMatchTuple extends js.Object {
    var FieldToMatch: js.UndefOr[FieldToMatch]
    var TextTransformation: js.UndefOr[TextTransformation]
    var RegexPatternSetId: js.UndefOr[ResourceId]
  }

  object RegexMatchTuple {
    def apply(
      FieldToMatch: js.UndefOr[FieldToMatch] = js.undefined,
      TextTransformation: js.UndefOr[TextTransformation] = js.undefined,
      RegexPatternSetId: js.UndefOr[ResourceId] = js.undefined): RegexMatchTuple = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FieldToMatch" -> FieldToMatch.map { x => x.asInstanceOf[js.Any] },
        "TextTransformation" -> TextTransformation.map { x => x.asInstanceOf[js.Any] },
        "RegexPatternSetId" -> RegexPatternSetId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RegexMatchTuple]
    }
  }

  /**
   * <p>The <code>RegexPatternSet</code> specifies the regular expression (regex) pattern that you want AWS WAF to search for, such as <code>B[a@]dB[o0]t</code>. You can then configure AWS WAF to reject those requests.</p>
   */
  @js.native
  trait RegexPatternSet extends js.Object {
    var RegexPatternSetId: js.UndefOr[ResourceId]
    var Name: js.UndefOr[ResourceName]
    var RegexPatternStrings: js.UndefOr[RegexPatternStrings]
  }

  object RegexPatternSet {
    def apply(
      RegexPatternSetId: js.UndefOr[ResourceId] = js.undefined,
      Name: js.UndefOr[ResourceName] = js.undefined,
      RegexPatternStrings: js.UndefOr[RegexPatternStrings] = js.undefined): RegexPatternSet = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RegexPatternSetId" -> RegexPatternSetId.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "RegexPatternStrings" -> RegexPatternStrings.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RegexPatternSet]
    }
  }

  /**
   * <p>Returned by <a>ListRegexPatternSets</a>. Each <code>RegexPatternSetSummary</code> object includes the <code>Name</code> and <code>RegexPatternSetId</code> for one <a>RegexPatternSet</a>.</p>
   */
  @js.native
  trait RegexPatternSetSummary extends js.Object {
    var RegexPatternSetId: js.UndefOr[ResourceId]
    var Name: js.UndefOr[ResourceName]
  }

  object RegexPatternSetSummary {
    def apply(
      RegexPatternSetId: js.UndefOr[ResourceId] = js.undefined,
      Name: js.UndefOr[ResourceName] = js.undefined): RegexPatternSetSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RegexPatternSetId" -> RegexPatternSetId.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RegexPatternSetSummary]
    }
  }

  /**
   * <p>In an <a>UpdateRegexPatternSet</a> request, <code>RegexPatternSetUpdate</code> specifies whether to insert or delete a <code>RegexPatternString</code> and includes the settings for the <code>RegexPatternString</code>.</p>
   */
  @js.native
  trait RegexPatternSetUpdate extends js.Object {
    var Action: js.UndefOr[ChangeAction]
    var RegexPatternString: js.UndefOr[RegexPatternString]
  }

  object RegexPatternSetUpdate {
    def apply(
      Action: js.UndefOr[ChangeAction] = js.undefined,
      RegexPatternString: js.UndefOr[RegexPatternString] = js.undefined): RegexPatternSetUpdate = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Action" -> Action.map { x => x.asInstanceOf[js.Any] },
        "RegexPatternString" -> RegexPatternString.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RegexPatternSetUpdate]
    }
  }

  /**
   * <p>A combination of <a>ByteMatchSet</a>, <a>IPSet</a>, and/or <a>SqlInjectionMatchSet</a> objects that identify the web requests that you want to allow, block, or count. For example, you might create a <code>Rule</code> that includes the following predicates:</p> <ul> <li> <p>An <code>IPSet</code> that causes AWS WAF to search for web requests that originate from the IP address <code>192.0.2.44</code> </p> </li> <li> <p>A <code>ByteMatchSet</code> that causes AWS WAF to search for web requests for which the value of the <code>User-Agent</code> header is <code>BadBot</code>.</p> </li> </ul> <p>To match the settings in this <code>Rule</code>, a request must originate from <code>192.0.2.44</code> AND include a <code>User-Agent</code> header for which the value is <code>BadBot</code>.</p>
   */
  @js.native
  trait Rule extends js.Object {
    var RuleId: js.UndefOr[ResourceId]
    var Name: js.UndefOr[ResourceName]
    var MetricName: js.UndefOr[MetricName]
    var Predicates: js.UndefOr[Predicates]
  }

  object Rule {
    def apply(
      RuleId: js.UndefOr[ResourceId] = js.undefined,
      Name: js.UndefOr[ResourceName] = js.undefined,
      MetricName: js.UndefOr[MetricName] = js.undefined,
      Predicates: js.UndefOr[Predicates] = js.undefined): Rule = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RuleId" -> RuleId.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "MetricName" -> MetricName.map { x => x.asInstanceOf[js.Any] },
        "Predicates" -> Predicates.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Rule]
    }
  }

  /**
   * <p>A collection of predefined rules that you can add to a web ACL.</p> <p>Rule groups are subject to the following limits:</p> <ul> <li> <p>Three rule groups per account. You can request an increase to this limit by contacting customer support.</p> </li> <li> <p>One rule group per web ACL.</p> </li> <li> <p>Ten rules per rule group.</p> </li> </ul>
   */
  @js.native
  trait RuleGroup extends js.Object {
    var RuleGroupId: js.UndefOr[ResourceId]
    var Name: js.UndefOr[ResourceName]
    var MetricName: js.UndefOr[MetricName]
  }

  object RuleGroup {
    def apply(
      RuleGroupId: js.UndefOr[ResourceId] = js.undefined,
      Name: js.UndefOr[ResourceName] = js.undefined,
      MetricName: js.UndefOr[MetricName] = js.undefined): RuleGroup = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RuleGroupId" -> RuleGroupId.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "MetricName" -> MetricName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RuleGroup]
    }
  }

  /**
   * <p>Contains the identifier and the friendly name or description of the <code>RuleGroup</code>.</p>
   */
  @js.native
  trait RuleGroupSummary extends js.Object {
    var RuleGroupId: js.UndefOr[ResourceId]
    var Name: js.UndefOr[ResourceName]
  }

  object RuleGroupSummary {
    def apply(
      RuleGroupId: js.UndefOr[ResourceId] = js.undefined,
      Name: js.UndefOr[ResourceName] = js.undefined): RuleGroupSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RuleGroupId" -> RuleGroupId.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RuleGroupSummary]
    }
  }

  /**
   * <p>Specifies an <code>ActivatedRule</code> and indicates whether you want to add it to a <code>RuleGroup</code> or delete it from a <code>RuleGroup</code>.</p>
   */
  @js.native
  trait RuleGroupUpdate extends js.Object {
    var Action: js.UndefOr[ChangeAction]
    var ActivatedRule: js.UndefOr[ActivatedRule]
  }

  object RuleGroupUpdate {
    def apply(
      Action: js.UndefOr[ChangeAction] = js.undefined,
      ActivatedRule: js.UndefOr[ActivatedRule] = js.undefined): RuleGroupUpdate = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Action" -> Action.map { x => x.asInstanceOf[js.Any] },
        "ActivatedRule" -> ActivatedRule.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RuleGroupUpdate]
    }
  }

  /**
   * <p>Contains the identifier and the friendly name or description of the <code>Rule</code>.</p>
   */
  @js.native
  trait RuleSummary extends js.Object {
    var RuleId: js.UndefOr[ResourceId]
    var Name: js.UndefOr[ResourceName]
  }

  object RuleSummary {
    def apply(
      RuleId: js.UndefOr[ResourceId] = js.undefined,
      Name: js.UndefOr[ResourceName] = js.undefined): RuleSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RuleId" -> RuleId.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RuleSummary]
    }
  }

  /**
   * <p>Specifies a <code>Predicate</code> (such as an <code>IPSet</code>) and indicates whether you want to add it to a <code>Rule</code> or delete it from a <code>Rule</code>.</p>
   */
  @js.native
  trait RuleUpdate extends js.Object {
    var Action: js.UndefOr[ChangeAction]
    var Predicate: js.UndefOr[Predicate]
  }

  object RuleUpdate {
    def apply(
      Action: js.UndefOr[ChangeAction] = js.undefined,
      Predicate: js.UndefOr[Predicate] = js.undefined): RuleUpdate = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Action" -> Action.map { x => x.asInstanceOf[js.Any] },
        "Predicate" -> Predicate.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RuleUpdate]
    }
  }

  /**
   * <p>The response from a <a>GetSampledRequests</a> request includes a <code>SampledHTTPRequests</code> complex type that appears as <code>SampledRequests</code> in the response syntax. <code>SampledHTTPRequests</code> contains one <code>SampledHTTPRequest</code> object for each web request that is returned by <code>GetSampledRequests</code>.</p>
   */
  @js.native
  trait SampledHTTPRequest extends js.Object {
    var Request: js.UndefOr[HTTPRequest]
    var Weight: js.UndefOr[SampleWeight]
    var Timestamp: js.UndefOr[Timestamp]
    var RuleWithinRuleGroup: js.UndefOr[ResourceId]
    var Action: js.UndefOr[Action]
  }

  object SampledHTTPRequest {
    def apply(
      Request: js.UndefOr[HTTPRequest] = js.undefined,
      Weight: js.UndefOr[SampleWeight] = js.undefined,
      Timestamp: js.UndefOr[Timestamp] = js.undefined,
      RuleWithinRuleGroup: js.UndefOr[ResourceId] = js.undefined,
      Action: js.UndefOr[Action] = js.undefined): SampledHTTPRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Request" -> Request.map { x => x.asInstanceOf[js.Any] },
        "Weight" -> Weight.map { x => x.asInstanceOf[js.Any] },
        "Timestamp" -> Timestamp.map { x => x.asInstanceOf[js.Any] },
        "RuleWithinRuleGroup" -> RuleWithinRuleGroup.map { x => x.asInstanceOf[js.Any] },
        "Action" -> Action.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SampledHTTPRequest]
    }
  }

  /**
   * <p>Specifies a constraint on the size of a part of the web request. AWS WAF uses the <code>Size</code>, <code>ComparisonOperator</code>, and <code>FieldToMatch</code> to build an expression in the form of "<code>Size</code> <code>ComparisonOperator</code> size in bytes of <code>FieldToMatch</code>". If that expression is true, the <code>SizeConstraint</code> is considered to match.</p>
   */
  @js.native
  trait SizeConstraint extends js.Object {
    var FieldToMatch: js.UndefOr[FieldToMatch]
    var TextTransformation: js.UndefOr[TextTransformation]
    var ComparisonOperator: js.UndefOr[ComparisonOperator]
    var Size: js.UndefOr[Size]
  }

  object SizeConstraint {
    def apply(
      FieldToMatch: js.UndefOr[FieldToMatch] = js.undefined,
      TextTransformation: js.UndefOr[TextTransformation] = js.undefined,
      ComparisonOperator: js.UndefOr[ComparisonOperator] = js.undefined,
      Size: js.UndefOr[Size] = js.undefined): SizeConstraint = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FieldToMatch" -> FieldToMatch.map { x => x.asInstanceOf[js.Any] },
        "TextTransformation" -> TextTransformation.map { x => x.asInstanceOf[js.Any] },
        "ComparisonOperator" -> ComparisonOperator.map { x => x.asInstanceOf[js.Any] },
        "Size" -> Size.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SizeConstraint]
    }
  }

  /**
   * <p>A complex type that contains <code>SizeConstraint</code> objects, which specify the parts of web requests that you want AWS WAF to inspect the size of. If a <code>SizeConstraintSet</code> contains more than one <code>SizeConstraint</code> object, a request only needs to match one constraint to be considered a match.</p>
   */
  @js.native
  trait SizeConstraintSet extends js.Object {
    var SizeConstraintSetId: js.UndefOr[ResourceId]
    var Name: js.UndefOr[ResourceName]
    var SizeConstraints: js.UndefOr[SizeConstraints]
  }

  object SizeConstraintSet {
    def apply(
      SizeConstraintSetId: js.UndefOr[ResourceId] = js.undefined,
      Name: js.UndefOr[ResourceName] = js.undefined,
      SizeConstraints: js.UndefOr[SizeConstraints] = js.undefined): SizeConstraintSet = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SizeConstraintSetId" -> SizeConstraintSetId.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "SizeConstraints" -> SizeConstraints.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SizeConstraintSet]
    }
  }

  /**
   * <p>The <code>Id</code> and <code>Name</code> of a <code>SizeConstraintSet</code>.</p>
   */
  @js.native
  trait SizeConstraintSetSummary extends js.Object {
    var SizeConstraintSetId: js.UndefOr[ResourceId]
    var Name: js.UndefOr[ResourceName]
  }

  object SizeConstraintSetSummary {
    def apply(
      SizeConstraintSetId: js.UndefOr[ResourceId] = js.undefined,
      Name: js.UndefOr[ResourceName] = js.undefined): SizeConstraintSetSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SizeConstraintSetId" -> SizeConstraintSetId.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SizeConstraintSetSummary]
    }
  }

  /**
   * <p>Specifies the part of a web request that you want to inspect the size of and indicates whether you want to add the specification to a <a>SizeConstraintSet</a> or delete it from a <code>SizeConstraintSet</code>.</p>
   */
  @js.native
  trait SizeConstraintSetUpdate extends js.Object {
    var Action: js.UndefOr[ChangeAction]
    var SizeConstraint: js.UndefOr[SizeConstraint]
  }

  object SizeConstraintSetUpdate {
    def apply(
      Action: js.UndefOr[ChangeAction] = js.undefined,
      SizeConstraint: js.UndefOr[SizeConstraint] = js.undefined): SizeConstraintSetUpdate = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Action" -> Action.map { x => x.asInstanceOf[js.Any] },
        "SizeConstraint" -> SizeConstraint.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SizeConstraintSetUpdate]
    }
  }

  /**
   * <p>A complex type that contains <code>SqlInjectionMatchTuple</code> objects, which specify the parts of web requests that you want AWS WAF to inspect for snippets of malicious SQL code and, if you want AWS WAF to inspect a header, the name of the header. If a <code>SqlInjectionMatchSet</code> contains more than one <code>SqlInjectionMatchTuple</code> object, a request needs to include snippets of SQL code in only one of the specified parts of the request to be considered a match.</p>
   */
  @js.native
  trait SqlInjectionMatchSet extends js.Object {
    var SqlInjectionMatchSetId: js.UndefOr[ResourceId]
    var Name: js.UndefOr[ResourceName]
    var SqlInjectionMatchTuples: js.UndefOr[SqlInjectionMatchTuples]
  }

  object SqlInjectionMatchSet {
    def apply(
      SqlInjectionMatchSetId: js.UndefOr[ResourceId] = js.undefined,
      Name: js.UndefOr[ResourceName] = js.undefined,
      SqlInjectionMatchTuples: js.UndefOr[SqlInjectionMatchTuples] = js.undefined): SqlInjectionMatchSet = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SqlInjectionMatchSetId" -> SqlInjectionMatchSetId.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "SqlInjectionMatchTuples" -> SqlInjectionMatchTuples.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SqlInjectionMatchSet]
    }
  }

  /**
   * <p>The <code>Id</code> and <code>Name</code> of a <code>SqlInjectionMatchSet</code>.</p>
   */
  @js.native
  trait SqlInjectionMatchSetSummary extends js.Object {
    var SqlInjectionMatchSetId: js.UndefOr[ResourceId]
    var Name: js.UndefOr[ResourceName]
  }

  object SqlInjectionMatchSetSummary {
    def apply(
      SqlInjectionMatchSetId: js.UndefOr[ResourceId] = js.undefined,
      Name: js.UndefOr[ResourceName] = js.undefined): SqlInjectionMatchSetSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SqlInjectionMatchSetId" -> SqlInjectionMatchSetId.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SqlInjectionMatchSetSummary]
    }
  }

  /**
   * <p>Specifies the part of a web request that you want to inspect for snippets of malicious SQL code and indicates whether you want to add the specification to a <a>SqlInjectionMatchSet</a> or delete it from a <code>SqlInjectionMatchSet</code>.</p>
   */
  @js.native
  trait SqlInjectionMatchSetUpdate extends js.Object {
    var Action: js.UndefOr[ChangeAction]
    var SqlInjectionMatchTuple: js.UndefOr[SqlInjectionMatchTuple]
  }

  object SqlInjectionMatchSetUpdate {
    def apply(
      Action: js.UndefOr[ChangeAction] = js.undefined,
      SqlInjectionMatchTuple: js.UndefOr[SqlInjectionMatchTuple] = js.undefined): SqlInjectionMatchSetUpdate = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Action" -> Action.map { x => x.asInstanceOf[js.Any] },
        "SqlInjectionMatchTuple" -> SqlInjectionMatchTuple.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SqlInjectionMatchSetUpdate]
    }
  }

  /**
   * <p>Specifies the part of a web request that you want AWS WAF to inspect for snippets of malicious SQL code and, if you want AWS WAF to inspect a header, the name of the header.</p>
   */
  @js.native
  trait SqlInjectionMatchTuple extends js.Object {
    var FieldToMatch: js.UndefOr[FieldToMatch]
    var TextTransformation: js.UndefOr[TextTransformation]
  }

  object SqlInjectionMatchTuple {
    def apply(
      FieldToMatch: js.UndefOr[FieldToMatch] = js.undefined,
      TextTransformation: js.UndefOr[TextTransformation] = js.undefined): SqlInjectionMatchTuple = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FieldToMatch" -> FieldToMatch.map { x => x.asInstanceOf[js.Any] },
        "TextTransformation" -> TextTransformation.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SqlInjectionMatchTuple]
    }
  }

  /**
   * <p>A summary of the rule groups you are subscribed to.</p>
   */
  @js.native
  trait SubscribedRuleGroupSummary extends js.Object {
    var RuleGroupId: js.UndefOr[ResourceId]
    var Name: js.UndefOr[ResourceName]
    var MetricName: js.UndefOr[MetricName]
  }

  object SubscribedRuleGroupSummary {
    def apply(
      RuleGroupId: js.UndefOr[ResourceId] = js.undefined,
      Name: js.UndefOr[ResourceName] = js.undefined,
      MetricName: js.UndefOr[MetricName] = js.undefined): SubscribedRuleGroupSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RuleGroupId" -> RuleGroupId.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "MetricName" -> MetricName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
   * <p>In a <a>GetSampledRequests</a> request, the <code>StartTime</code> and <code>EndTime</code> objects specify the time range for which you want AWS WAF to return a sample of web requests.</p> <p>In a <a>GetSampledRequests</a> response, the <code>StartTime</code> and <code>EndTime</code> objects specify the time range for which AWS WAF actually returned a sample of web requests. AWS WAF gets the specified number of requests from among the first 5,000 requests that your AWS resource receives during the specified time period. If your resource receives more than 5,000 requests during that period, AWS WAF stops sampling after the 5,000th request. In that case, <code>EndTime</code> is the time that AWS WAF received the 5,000th request. </p>
   */
  @js.native
  trait TimeWindow extends js.Object {
    var StartTime: js.UndefOr[Timestamp]
    var EndTime: js.UndefOr[Timestamp]
  }

  object TimeWindow {
    def apply(
      StartTime: js.UndefOr[Timestamp] = js.undefined,
      EndTime: js.UndefOr[Timestamp] = js.undefined): TimeWindow = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StartTime" -> StartTime.map { x => x.asInstanceOf[js.Any] },
        "EndTime" -> EndTime.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TimeWindow]
    }
  }

  @js.native
  trait UpdateByteMatchSetRequest extends js.Object {
    var ByteMatchSetId: js.UndefOr[ResourceId]
    var ChangeToken: js.UndefOr[ChangeToken]
    var Updates: js.UndefOr[ByteMatchSetUpdates]
  }

  object UpdateByteMatchSetRequest {
    def apply(
      ByteMatchSetId: js.UndefOr[ResourceId] = js.undefined,
      ChangeToken: js.UndefOr[ChangeToken] = js.undefined,
      Updates: js.UndefOr[ByteMatchSetUpdates] = js.undefined): UpdateByteMatchSetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ByteMatchSetId" -> ByteMatchSetId.map { x => x.asInstanceOf[js.Any] },
        "ChangeToken" -> ChangeToken.map { x => x.asInstanceOf[js.Any] },
        "Updates" -> Updates.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var GeoMatchSetId: js.UndefOr[ResourceId]
    var ChangeToken: js.UndefOr[ChangeToken]
    var Updates: js.UndefOr[GeoMatchSetUpdates]
  }

  object UpdateGeoMatchSetRequest {
    def apply(
      GeoMatchSetId: js.UndefOr[ResourceId] = js.undefined,
      ChangeToken: js.UndefOr[ChangeToken] = js.undefined,
      Updates: js.UndefOr[GeoMatchSetUpdates] = js.undefined): UpdateGeoMatchSetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GeoMatchSetId" -> GeoMatchSetId.map { x => x.asInstanceOf[js.Any] },
        "ChangeToken" -> ChangeToken.map { x => x.asInstanceOf[js.Any] },
        "Updates" -> Updates.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var IPSetId: js.UndefOr[ResourceId]
    var ChangeToken: js.UndefOr[ChangeToken]
    var Updates: js.UndefOr[IPSetUpdates]
  }

  object UpdateIPSetRequest {
    def apply(
      IPSetId: js.UndefOr[ResourceId] = js.undefined,
      ChangeToken: js.UndefOr[ChangeToken] = js.undefined,
      Updates: js.UndefOr[IPSetUpdates] = js.undefined): UpdateIPSetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IPSetId" -> IPSetId.map { x => x.asInstanceOf[js.Any] },
        "ChangeToken" -> ChangeToken.map { x => x.asInstanceOf[js.Any] },
        "Updates" -> Updates.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var RuleId: js.UndefOr[ResourceId]
    var ChangeToken: js.UndefOr[ChangeToken]
    var Updates: js.UndefOr[RuleUpdates]
    var RateLimit: js.UndefOr[RateLimit]
  }

  object UpdateRateBasedRuleRequest {
    def apply(
      RuleId: js.UndefOr[ResourceId] = js.undefined,
      ChangeToken: js.UndefOr[ChangeToken] = js.undefined,
      Updates: js.UndefOr[RuleUpdates] = js.undefined,
      RateLimit: js.UndefOr[RateLimit] = js.undefined): UpdateRateBasedRuleRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RuleId" -> RuleId.map { x => x.asInstanceOf[js.Any] },
        "ChangeToken" -> ChangeToken.map { x => x.asInstanceOf[js.Any] },
        "Updates" -> Updates.map { x => x.asInstanceOf[js.Any] },
        "RateLimit" -> RateLimit.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var RegexMatchSetId: js.UndefOr[ResourceId]
    var Updates: js.UndefOr[RegexMatchSetUpdates]
    var ChangeToken: js.UndefOr[ChangeToken]
  }

  object UpdateRegexMatchSetRequest {
    def apply(
      RegexMatchSetId: js.UndefOr[ResourceId] = js.undefined,
      Updates: js.UndefOr[RegexMatchSetUpdates] = js.undefined,
      ChangeToken: js.UndefOr[ChangeToken] = js.undefined): UpdateRegexMatchSetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RegexMatchSetId" -> RegexMatchSetId.map { x => x.asInstanceOf[js.Any] },
        "Updates" -> Updates.map { x => x.asInstanceOf[js.Any] },
        "ChangeToken" -> ChangeToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var RegexPatternSetId: js.UndefOr[ResourceId]
    var Updates: js.UndefOr[RegexPatternSetUpdates]
    var ChangeToken: js.UndefOr[ChangeToken]
  }

  object UpdateRegexPatternSetRequest {
    def apply(
      RegexPatternSetId: js.UndefOr[ResourceId] = js.undefined,
      Updates: js.UndefOr[RegexPatternSetUpdates] = js.undefined,
      ChangeToken: js.UndefOr[ChangeToken] = js.undefined): UpdateRegexPatternSetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RegexPatternSetId" -> RegexPatternSetId.map { x => x.asInstanceOf[js.Any] },
        "Updates" -> Updates.map { x => x.asInstanceOf[js.Any] },
        "ChangeToken" -> ChangeToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var RuleGroupId: js.UndefOr[ResourceId]
    var Updates: js.UndefOr[RuleGroupUpdates]
    var ChangeToken: js.UndefOr[ChangeToken]
  }

  object UpdateRuleGroupRequest {
    def apply(
      RuleGroupId: js.UndefOr[ResourceId] = js.undefined,
      Updates: js.UndefOr[RuleGroupUpdates] = js.undefined,
      ChangeToken: js.UndefOr[ChangeToken] = js.undefined): UpdateRuleGroupRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RuleGroupId" -> RuleGroupId.map { x => x.asInstanceOf[js.Any] },
        "Updates" -> Updates.map { x => x.asInstanceOf[js.Any] },
        "ChangeToken" -> ChangeToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var RuleId: js.UndefOr[ResourceId]
    var ChangeToken: js.UndefOr[ChangeToken]
    var Updates: js.UndefOr[RuleUpdates]
  }

  object UpdateRuleRequest {
    def apply(
      RuleId: js.UndefOr[ResourceId] = js.undefined,
      ChangeToken: js.UndefOr[ChangeToken] = js.undefined,
      Updates: js.UndefOr[RuleUpdates] = js.undefined): UpdateRuleRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RuleId" -> RuleId.map { x => x.asInstanceOf[js.Any] },
        "ChangeToken" -> ChangeToken.map { x => x.asInstanceOf[js.Any] },
        "Updates" -> Updates.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var SizeConstraintSetId: js.UndefOr[ResourceId]
    var ChangeToken: js.UndefOr[ChangeToken]
    var Updates: js.UndefOr[SizeConstraintSetUpdates]
  }

  object UpdateSizeConstraintSetRequest {
    def apply(
      SizeConstraintSetId: js.UndefOr[ResourceId] = js.undefined,
      ChangeToken: js.UndefOr[ChangeToken] = js.undefined,
      Updates: js.UndefOr[SizeConstraintSetUpdates] = js.undefined): UpdateSizeConstraintSetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SizeConstraintSetId" -> SizeConstraintSetId.map { x => x.asInstanceOf[js.Any] },
        "ChangeToken" -> ChangeToken.map { x => x.asInstanceOf[js.Any] },
        "Updates" -> Updates.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
   * <p>A request to update a <a>SqlInjectionMatchSet</a>.</p>
   */
  @js.native
  trait UpdateSqlInjectionMatchSetRequest extends js.Object {
    var SqlInjectionMatchSetId: js.UndefOr[ResourceId]
    var ChangeToken: js.UndefOr[ChangeToken]
    var Updates: js.UndefOr[SqlInjectionMatchSetUpdates]
  }

  object UpdateSqlInjectionMatchSetRequest {
    def apply(
      SqlInjectionMatchSetId: js.UndefOr[ResourceId] = js.undefined,
      ChangeToken: js.UndefOr[ChangeToken] = js.undefined,
      Updates: js.UndefOr[SqlInjectionMatchSetUpdates] = js.undefined): UpdateSqlInjectionMatchSetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SqlInjectionMatchSetId" -> SqlInjectionMatchSetId.map { x => x.asInstanceOf[js.Any] },
        "ChangeToken" -> ChangeToken.map { x => x.asInstanceOf[js.Any] },
        "Updates" -> Updates.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateSqlInjectionMatchSetRequest]
    }
  }

  /**
   * <p>The response to an <a>UpdateSqlInjectionMatchSets</a> request.</p>
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
    var WebACLId: js.UndefOr[ResourceId]
    var ChangeToken: js.UndefOr[ChangeToken]
    var Updates: js.UndefOr[WebACLUpdates]
    var DefaultAction: js.UndefOr[WafAction]
  }

  object UpdateWebACLRequest {
    def apply(
      WebACLId: js.UndefOr[ResourceId] = js.undefined,
      ChangeToken: js.UndefOr[ChangeToken] = js.undefined,
      Updates: js.UndefOr[WebACLUpdates] = js.undefined,
      DefaultAction: js.UndefOr[WafAction] = js.undefined): UpdateWebACLRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "WebACLId" -> WebACLId.map { x => x.asInstanceOf[js.Any] },
        "ChangeToken" -> ChangeToken.map { x => x.asInstanceOf[js.Any] },
        "Updates" -> Updates.map { x => x.asInstanceOf[js.Any] },
        "DefaultAction" -> DefaultAction.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
   * <p>A request to update an <a>XssMatchSet</a>.</p>
   */
  @js.native
  trait UpdateXssMatchSetRequest extends js.Object {
    var XssMatchSetId: js.UndefOr[ResourceId]
    var ChangeToken: js.UndefOr[ChangeToken]
    var Updates: js.UndefOr[XssMatchSetUpdates]
  }

  object UpdateXssMatchSetRequest {
    def apply(
      XssMatchSetId: js.UndefOr[ResourceId] = js.undefined,
      ChangeToken: js.UndefOr[ChangeToken] = js.undefined,
      Updates: js.UndefOr[XssMatchSetUpdates] = js.undefined): UpdateXssMatchSetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "XssMatchSetId" -> XssMatchSetId.map { x => x.asInstanceOf[js.Any] },
        "ChangeToken" -> ChangeToken.map { x => x.asInstanceOf[js.Any] },
        "Updates" -> Updates.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateXssMatchSetRequest]
    }
  }

  /**
   * <p>The response to an <a>UpdateXssMatchSets</a> request.</p>
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
   * <p>For the action that is associated with a rule in a <code>WebACL</code>, specifies the action that you want AWS WAF to perform when a web request matches all of the conditions in a rule. For the default action in a <code>WebACL</code>, specifies the action that you want AWS WAF to take when a web request doesn't match all of the conditions in any of the rules in a <code>WebACL</code>. </p>
   */
  @js.native
  trait WafAction extends js.Object {
    var Type: js.UndefOr[WafActionType]
  }

  object WafAction {
    def apply(
      Type: js.UndefOr[WafActionType] = js.undefined): WafAction = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Type" -> Type.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
   * <p>The action to take if any rule within the <code>RuleGroup</code> matches a request. </p>
   */
  @js.native
  trait WafOverrideAction extends js.Object {
    var Type: js.UndefOr[WafOverrideActionType]
  }

  object WafOverrideAction {
    def apply(
      Type: js.UndefOr[WafOverrideActionType] = js.undefined): WafOverrideAction = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Type" -> Type.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
   * <p>Contains the <code>Rules</code> that identify the requests that you want to allow, block, or count. In a <code>WebACL</code>, you also specify a default action (<code>ALLOW</code> or <code>BLOCK</code>), and the action for each <code>Rule</code> that you add to a <code>WebACL</code>, for example, block requests from specified IP addresses or block requests from specified referrers. You also associate the <code>WebACL</code> with a CloudFront distribution to identify the requests that you want AWS WAF to filter. If you add more than one <code>Rule</code> to a <code>WebACL</code>, a request needs to match only one of the specifications to be allowed, blocked, or counted. For more information, see <a>UpdateWebACL</a>.</p>
   */
  @js.native
  trait WebACL extends js.Object {
    var WebACLId: js.UndefOr[ResourceId]
    var Name: js.UndefOr[ResourceName]
    var Rules: js.UndefOr[ActivatedRules]
    var DefaultAction: js.UndefOr[WafAction]
    var MetricName: js.UndefOr[MetricName]
  }

  object WebACL {
    def apply(
      WebACLId: js.UndefOr[ResourceId] = js.undefined,
      Name: js.UndefOr[ResourceName] = js.undefined,
      Rules: js.UndefOr[ActivatedRules] = js.undefined,
      DefaultAction: js.UndefOr[WafAction] = js.undefined,
      MetricName: js.UndefOr[MetricName] = js.undefined): WebACL = {
      val _fields = IndexedSeq[(String, js.Any)](
        "WebACLId" -> WebACLId.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "Rules" -> Rules.map { x => x.asInstanceOf[js.Any] },
        "DefaultAction" -> DefaultAction.map { x => x.asInstanceOf[js.Any] },
        "MetricName" -> MetricName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[WebACL]
    }
  }

  /**
   * <p>Contains the identifier and the name or description of the <a>WebACL</a>.</p>
   */
  @js.native
  trait WebACLSummary extends js.Object {
    var WebACLId: js.UndefOr[ResourceId]
    var Name: js.UndefOr[ResourceName]
  }

  object WebACLSummary {
    def apply(
      WebACLId: js.UndefOr[ResourceId] = js.undefined,
      Name: js.UndefOr[ResourceName] = js.undefined): WebACLSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "WebACLId" -> WebACLId.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[WebACLSummary]
    }
  }

  /**
   * <p>Specifies whether to insert a <code>Rule</code> into or delete a <code>Rule</code> from a <code>WebACL</code>.</p>
   */
  @js.native
  trait WebACLUpdate extends js.Object {
    var Action: js.UndefOr[ChangeAction]
    var ActivatedRule: js.UndefOr[ActivatedRule]
  }

  object WebACLUpdate {
    def apply(
      Action: js.UndefOr[ChangeAction] = js.undefined,
      ActivatedRule: js.UndefOr[ActivatedRule] = js.undefined): WebACLUpdate = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Action" -> Action.map { x => x.asInstanceOf[js.Any] },
        "ActivatedRule" -> ActivatedRule.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[WebACLUpdate]
    }
  }

  /**
   * <p>A complex type that contains <code>XssMatchTuple</code> objects, which specify the parts of web requests that you want AWS WAF to inspect for cross-site scripting attacks and, if you want AWS WAF to inspect a header, the name of the header. If a <code>XssMatchSet</code> contains more than one <code>XssMatchTuple</code> object, a request needs to include cross-site scripting attacks in only one of the specified parts of the request to be considered a match.</p>
   */
  @js.native
  trait XssMatchSet extends js.Object {
    var XssMatchSetId: js.UndefOr[ResourceId]
    var Name: js.UndefOr[ResourceName]
    var XssMatchTuples: js.UndefOr[XssMatchTuples]
  }

  object XssMatchSet {
    def apply(
      XssMatchSetId: js.UndefOr[ResourceId] = js.undefined,
      Name: js.UndefOr[ResourceName] = js.undefined,
      XssMatchTuples: js.UndefOr[XssMatchTuples] = js.undefined): XssMatchSet = {
      val _fields = IndexedSeq[(String, js.Any)](
        "XssMatchSetId" -> XssMatchSetId.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "XssMatchTuples" -> XssMatchTuples.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[XssMatchSet]
    }
  }

  /**
   * <p>The <code>Id</code> and <code>Name</code> of an <code>XssMatchSet</code>.</p>
   */
  @js.native
  trait XssMatchSetSummary extends js.Object {
    var XssMatchSetId: js.UndefOr[ResourceId]
    var Name: js.UndefOr[ResourceName]
  }

  object XssMatchSetSummary {
    def apply(
      XssMatchSetId: js.UndefOr[ResourceId] = js.undefined,
      Name: js.UndefOr[ResourceName] = js.undefined): XssMatchSetSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "XssMatchSetId" -> XssMatchSetId.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[XssMatchSetSummary]
    }
  }

  /**
   * <p>Specifies the part of a web request that you want to inspect for cross-site scripting attacks and indicates whether you want to add the specification to an <a>XssMatchSet</a> or delete it from an <code>XssMatchSet</code>.</p>
   */
  @js.native
  trait XssMatchSetUpdate extends js.Object {
    var Action: js.UndefOr[ChangeAction]
    var XssMatchTuple: js.UndefOr[XssMatchTuple]
  }

  object XssMatchSetUpdate {
    def apply(
      Action: js.UndefOr[ChangeAction] = js.undefined,
      XssMatchTuple: js.UndefOr[XssMatchTuple] = js.undefined): XssMatchSetUpdate = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Action" -> Action.map { x => x.asInstanceOf[js.Any] },
        "XssMatchTuple" -> XssMatchTuple.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[XssMatchSetUpdate]
    }
  }

  /**
   * <p>Specifies the part of a web request that you want AWS WAF to inspect for cross-site scripting attacks and, if you want AWS WAF to inspect a header, the name of the header.</p>
   */
  @js.native
  trait XssMatchTuple extends js.Object {
    var FieldToMatch: js.UndefOr[FieldToMatch]
    var TextTransformation: js.UndefOr[TextTransformation]
  }

  object XssMatchTuple {
    def apply(
      FieldToMatch: js.UndefOr[FieldToMatch] = js.undefined,
      TextTransformation: js.UndefOr[TextTransformation] = js.undefined): XssMatchTuple = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FieldToMatch" -> FieldToMatch.map { x => x.asInstanceOf[js.Any] },
        "TextTransformation" -> TextTransformation.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[XssMatchTuple]
    }
  }
}
