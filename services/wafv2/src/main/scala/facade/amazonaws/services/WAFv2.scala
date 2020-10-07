package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

package object wafv2 {
  type Action = String
  type CapacityUnit = Double
  type ConsumedCapacity = Double
  type Country = String
  type CountryCodes = js.Array[CountryCode]
  type EntityDescription = String
  type EntityId = String
  type EntityName = String
  type ExcludedRules = js.Array[ExcludedRule]
  type FieldToMatchData = String
  type FirewallManagerRuleGroups = js.Array[FirewallManagerRuleGroup]
  type ForwardedIPHeaderName = String
  type HTTPHeaders = js.Array[HTTPHeader]
  type HTTPMethod = String
  type HTTPVersion = String
  type HeaderName = String
  type HeaderValue = String
  type IPAddress = String
  type IPAddresses = js.Array[IPAddress]
  type IPSetSummaries = js.Array[IPSetSummary]
  type IPString = String
  type ListMaxItems = Double
  type LockToken = String
  type LogDestinationConfigs = js.Array[ResourceArn]
  type LoggingConfigurations = js.Array[LoggingConfiguration]
  type ManagedRuleGroupSummaries = js.Array[ManagedRuleGroupSummary]
  type MetricName = String
  type NextMarker = String
  type PaginationLimit = Int
  type PolicyString = String
  type PopulationSize = Double
  type RateLimit = Double
  type RedactedFields = js.Array[FieldToMatch]
  type RegexPatternSetSummaries = js.Array[RegexPatternSetSummary]
  type RegexPatternString = String
  type RegularExpressionList = js.Array[Regex]
  type ResourceArn = String
  type ResourceArns = js.Array[ResourceArn]
  type RuleGroupSummaries = js.Array[RuleGroupSummary]
  type RulePriority = Int
  type RuleSummaries = js.Array[RuleSummary]
  type Rules = js.Array[Rule]
  type SampleWeight = Double
  type SampledHTTPRequests = js.Array[SampledHTTPRequest]
  type SearchString = js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type Size = Double
  type Statements = js.Array[Statement]
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagList = js.Array[Tag]
  type TagValue = String
  type TextTransformationPriority = Int
  type TextTransformations = js.Array[TextTransformation]
  type Timestamp = js.Date
  type URIString = String
  type VendorName = String
  type WebACLSummaries = js.Array[WebACLSummary]

  implicit final class WAFv2Ops(private val service: WAFv2) extends AnyVal {

    @inline def associateWebACLFuture(params: AssociateWebACLRequest): Future[AssociateWebACLResponse] = service.associateWebACL(params).promise().toFuture
    @inline def checkCapacityFuture(params: CheckCapacityRequest): Future[CheckCapacityResponse] = service.checkCapacity(params).promise().toFuture
    @inline def createIPSetFuture(params: CreateIPSetRequest): Future[CreateIPSetResponse] = service.createIPSet(params).promise().toFuture
    @inline def createRegexPatternSetFuture(params: CreateRegexPatternSetRequest): Future[CreateRegexPatternSetResponse] = service.createRegexPatternSet(params).promise().toFuture
    @inline def createRuleGroupFuture(params: CreateRuleGroupRequest): Future[CreateRuleGroupResponse] = service.createRuleGroup(params).promise().toFuture
    @inline def createWebACLFuture(params: CreateWebACLRequest): Future[CreateWebACLResponse] = service.createWebACL(params).promise().toFuture
    @inline def deleteFirewallManagerRuleGroupsFuture(params: DeleteFirewallManagerRuleGroupsRequest): Future[DeleteFirewallManagerRuleGroupsResponse] = service.deleteFirewallManagerRuleGroups(params).promise().toFuture
    @inline def deleteIPSetFuture(params: DeleteIPSetRequest): Future[DeleteIPSetResponse] = service.deleteIPSet(params).promise().toFuture
    @inline def deleteLoggingConfigurationFuture(params: DeleteLoggingConfigurationRequest): Future[DeleteLoggingConfigurationResponse] = service.deleteLoggingConfiguration(params).promise().toFuture
    @inline def deletePermissionPolicyFuture(params: DeletePermissionPolicyRequest): Future[DeletePermissionPolicyResponse] = service.deletePermissionPolicy(params).promise().toFuture
    @inline def deleteRegexPatternSetFuture(params: DeleteRegexPatternSetRequest): Future[DeleteRegexPatternSetResponse] = service.deleteRegexPatternSet(params).promise().toFuture
    @inline def deleteRuleGroupFuture(params: DeleteRuleGroupRequest): Future[DeleteRuleGroupResponse] = service.deleteRuleGroup(params).promise().toFuture
    @inline def deleteWebACLFuture(params: DeleteWebACLRequest): Future[DeleteWebACLResponse] = service.deleteWebACL(params).promise().toFuture
    @inline def describeManagedRuleGroupFuture(params: DescribeManagedRuleGroupRequest): Future[DescribeManagedRuleGroupResponse] = service.describeManagedRuleGroup(params).promise().toFuture
    @inline def disassociateWebACLFuture(params: DisassociateWebACLRequest): Future[DisassociateWebACLResponse] = service.disassociateWebACL(params).promise().toFuture
    @inline def getIPSetFuture(params: GetIPSetRequest): Future[GetIPSetResponse] = service.getIPSet(params).promise().toFuture
    @inline def getLoggingConfigurationFuture(params: GetLoggingConfigurationRequest): Future[GetLoggingConfigurationResponse] = service.getLoggingConfiguration(params).promise().toFuture
    @inline def getPermissionPolicyFuture(params: GetPermissionPolicyRequest): Future[GetPermissionPolicyResponse] = service.getPermissionPolicy(params).promise().toFuture
    @inline def getRateBasedStatementManagedKeysFuture(params: GetRateBasedStatementManagedKeysRequest): Future[GetRateBasedStatementManagedKeysResponse] = service.getRateBasedStatementManagedKeys(params).promise().toFuture
    @inline def getRegexPatternSetFuture(params: GetRegexPatternSetRequest): Future[GetRegexPatternSetResponse] = service.getRegexPatternSet(params).promise().toFuture
    @inline def getRuleGroupFuture(params: GetRuleGroupRequest): Future[GetRuleGroupResponse] = service.getRuleGroup(params).promise().toFuture
    @inline def getSampledRequestsFuture(params: GetSampledRequestsRequest): Future[GetSampledRequestsResponse] = service.getSampledRequests(params).promise().toFuture
    @inline def getWebACLForResourceFuture(params: GetWebACLForResourceRequest): Future[GetWebACLForResourceResponse] = service.getWebACLForResource(params).promise().toFuture
    @inline def getWebACLFuture(params: GetWebACLRequest): Future[GetWebACLResponse] = service.getWebACL(params).promise().toFuture
    @inline def listAvailableManagedRuleGroupsFuture(params: ListAvailableManagedRuleGroupsRequest): Future[ListAvailableManagedRuleGroupsResponse] = service.listAvailableManagedRuleGroups(params).promise().toFuture
    @inline def listIPSetsFuture(params: ListIPSetsRequest): Future[ListIPSetsResponse] = service.listIPSets(params).promise().toFuture
    @inline def listLoggingConfigurationsFuture(params: ListLoggingConfigurationsRequest): Future[ListLoggingConfigurationsResponse] = service.listLoggingConfigurations(params).promise().toFuture
    @inline def listRegexPatternSetsFuture(params: ListRegexPatternSetsRequest): Future[ListRegexPatternSetsResponse] = service.listRegexPatternSets(params).promise().toFuture
    @inline def listResourcesForWebACLFuture(params: ListResourcesForWebACLRequest): Future[ListResourcesForWebACLResponse] = service.listResourcesForWebACL(params).promise().toFuture
    @inline def listRuleGroupsFuture(params: ListRuleGroupsRequest): Future[ListRuleGroupsResponse] = service.listRuleGroups(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] = service.listTagsForResource(params).promise().toFuture
    @inline def listWebACLsFuture(params: ListWebACLsRequest): Future[ListWebACLsResponse] = service.listWebACLs(params).promise().toFuture
    @inline def putLoggingConfigurationFuture(params: PutLoggingConfigurationRequest): Future[PutLoggingConfigurationResponse] = service.putLoggingConfiguration(params).promise().toFuture
    @inline def putPermissionPolicyFuture(params: PutPermissionPolicyRequest): Future[PutPermissionPolicyResponse] = service.putPermissionPolicy(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] = service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] = service.untagResource(params).promise().toFuture
    @inline def updateIPSetFuture(params: UpdateIPSetRequest): Future[UpdateIPSetResponse] = service.updateIPSet(params).promise().toFuture
    @inline def updateRegexPatternSetFuture(params: UpdateRegexPatternSetRequest): Future[UpdateRegexPatternSetResponse] = service.updateRegexPatternSet(params).promise().toFuture
    @inline def updateRuleGroupFuture(params: UpdateRuleGroupRequest): Future[UpdateRuleGroupResponse] = service.updateRuleGroup(params).promise().toFuture
    @inline def updateWebACLFuture(params: UpdateWebACLRequest): Future[UpdateWebACLResponse] = service.updateWebACL(params).promise().toFuture

  }
}

package wafv2 {
  @js.native
  @JSImport("aws-sdk/clients/wafv2", JSImport.Namespace, "AWS.WAFV2")
  class WAFv2() extends js.Object {
    def this(config: AWSConfig) = this()

    def associateWebACL(params: AssociateWebACLRequest): Request[AssociateWebACLResponse] = js.native
    def checkCapacity(params: CheckCapacityRequest): Request[CheckCapacityResponse] = js.native
    def createIPSet(params: CreateIPSetRequest): Request[CreateIPSetResponse] = js.native
    def createRegexPatternSet(params: CreateRegexPatternSetRequest): Request[CreateRegexPatternSetResponse] = js.native
    def createRuleGroup(params: CreateRuleGroupRequest): Request[CreateRuleGroupResponse] = js.native
    def createWebACL(params: CreateWebACLRequest): Request[CreateWebACLResponse] = js.native
    def deleteFirewallManagerRuleGroups(params: DeleteFirewallManagerRuleGroupsRequest): Request[DeleteFirewallManagerRuleGroupsResponse] = js.native
    def deleteIPSet(params: DeleteIPSetRequest): Request[DeleteIPSetResponse] = js.native
    def deleteLoggingConfiguration(params: DeleteLoggingConfigurationRequest): Request[DeleteLoggingConfigurationResponse] = js.native
    def deletePermissionPolicy(params: DeletePermissionPolicyRequest): Request[DeletePermissionPolicyResponse] = js.native
    def deleteRegexPatternSet(params: DeleteRegexPatternSetRequest): Request[DeleteRegexPatternSetResponse] = js.native
    def deleteRuleGroup(params: DeleteRuleGroupRequest): Request[DeleteRuleGroupResponse] = js.native
    def deleteWebACL(params: DeleteWebACLRequest): Request[DeleteWebACLResponse] = js.native
    def describeManagedRuleGroup(params: DescribeManagedRuleGroupRequest): Request[DescribeManagedRuleGroupResponse] = js.native
    def disassociateWebACL(params: DisassociateWebACLRequest): Request[DisassociateWebACLResponse] = js.native
    def getIPSet(params: GetIPSetRequest): Request[GetIPSetResponse] = js.native
    def getLoggingConfiguration(params: GetLoggingConfigurationRequest): Request[GetLoggingConfigurationResponse] = js.native
    def getPermissionPolicy(params: GetPermissionPolicyRequest): Request[GetPermissionPolicyResponse] = js.native
    def getRateBasedStatementManagedKeys(params: GetRateBasedStatementManagedKeysRequest): Request[GetRateBasedStatementManagedKeysResponse] = js.native
    def getRegexPatternSet(params: GetRegexPatternSetRequest): Request[GetRegexPatternSetResponse] = js.native
    def getRuleGroup(params: GetRuleGroupRequest): Request[GetRuleGroupResponse] = js.native
    def getSampledRequests(params: GetSampledRequestsRequest): Request[GetSampledRequestsResponse] = js.native
    def getWebACL(params: GetWebACLRequest): Request[GetWebACLResponse] = js.native
    def getWebACLForResource(params: GetWebACLForResourceRequest): Request[GetWebACLForResourceResponse] = js.native
    def listAvailableManagedRuleGroups(params: ListAvailableManagedRuleGroupsRequest): Request[ListAvailableManagedRuleGroupsResponse] = js.native
    def listIPSets(params: ListIPSetsRequest): Request[ListIPSetsResponse] = js.native
    def listLoggingConfigurations(params: ListLoggingConfigurationsRequest): Request[ListLoggingConfigurationsResponse] = js.native
    def listRegexPatternSets(params: ListRegexPatternSetsRequest): Request[ListRegexPatternSetsResponse] = js.native
    def listResourcesForWebACL(params: ListResourcesForWebACLRequest): Request[ListResourcesForWebACLResponse] = js.native
    def listRuleGroups(params: ListRuleGroupsRequest): Request[ListRuleGroupsResponse] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def listWebACLs(params: ListWebACLsRequest): Request[ListWebACLsResponse] = js.native
    def putLoggingConfiguration(params: PutLoggingConfigurationRequest): Request[PutLoggingConfigurationResponse] = js.native
    def putPermissionPolicy(params: PutPermissionPolicyRequest): Request[PutPermissionPolicyResponse] = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse] = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse] = js.native
    def updateIPSet(params: UpdateIPSetRequest): Request[UpdateIPSetResponse] = js.native
    def updateRegexPatternSet(params: UpdateRegexPatternSetRequest): Request[UpdateRegexPatternSetResponse] = js.native
    def updateRuleGroup(params: UpdateRuleGroupRequest): Request[UpdateRuleGroupResponse] = js.native
    def updateWebACL(params: UpdateWebACLRequest): Request[UpdateWebACLResponse] = js.native
  }

  /** '''Note:'''This is the latest version of ```AWS WAF```, named AWS WAFV2, released in November, 2019. For information, including how to migrate your AWS WAF resources from the prior release, see the [[https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html|AWS WAF Developer Guide]].
    * All query arguments of a web request.
    * This is used only to indicate the web request component for AWS WAF to inspect, in the <a>FieldToMatch</a> specification.
    */
  @js.native
  trait AllQueryArguments extends js.Object

  object AllQueryArguments {
    @inline
    def apply(): AllQueryArguments = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AllQueryArguments]
    }
  }

  /** '''Note:'''This is the latest version of ```AWS WAF```, named AWS WAFV2, released in November, 2019. For information, including how to migrate your AWS WAF resources from the prior release, see the [[https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html|AWS WAF Developer Guide]].
    * Specifies that AWS WAF should allow requests.
    * This is used only in the context of other settings, for example to specify values for <a>RuleAction</a> and web ACL <a>DefaultAction</a>.
    */
  @js.native
  trait AllowAction extends js.Object

  object AllowAction {
    @inline
    def apply(): AllowAction = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AllowAction]
    }
  }

  /** '''Note:'''This is the latest version of ```AWS WAF```, named AWS WAFV2, released in November, 2019. For information, including how to migrate your AWS WAF resources from the prior release, see the [[https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html|AWS WAF Developer Guide]].
    * A logical rule statement used to combine other rule statements with AND logic. You provide more than one <a>Statement</a> within the <code>AndStatement</code>.
    */
  @js.native
  trait AndStatement extends js.Object {
    var Statements: Statements
  }

  object AndStatement {
    @inline
    def apply(
        Statements: Statements
    ): AndStatement = {
      val __obj = js.Dynamic.literal(
        "Statements" -> Statements.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AndStatement]
    }
  }

  @js.native
  trait AssociateWebACLRequest extends js.Object {
    var ResourceArn: ResourceArn
    var WebACLArn: ResourceArn
  }

  object AssociateWebACLRequest {
    @inline
    def apply(
        ResourceArn: ResourceArn,
        WebACLArn: ResourceArn
    ): AssociateWebACLRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any],
        "WebACLArn" -> WebACLArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AssociateWebACLRequest]
    }
  }

  @js.native
  trait AssociateWebACLResponse extends js.Object

  object AssociateWebACLResponse {
    @inline
    def apply(): AssociateWebACLResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AssociateWebACLResponse]
    }
  }

  /** '''Note:'''This is the latest version of ```AWS WAF```, named AWS WAFV2, released in November, 2019. For information, including how to migrate your AWS WAF resources from the prior release, see the [[https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html|AWS WAF Developer Guide]].
    * Specifies that AWS WAF should block requests.
    * This is used only in the context of other settings, for example to specify values for <a>RuleAction</a> and web ACL <a>DefaultAction</a>.
    */
  @js.native
  trait BlockAction extends js.Object

  object BlockAction {
    @inline
    def apply(): BlockAction = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BlockAction]
    }
  }

  /** '''Note:'''This is the latest version of ```AWS WAF```, named AWS WAFV2, released in November, 2019. For information, including how to migrate your AWS WAF resources from the prior release, see the [[https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html|AWS WAF Developer Guide]].
    * The body of a web request. This immediately follows the request headers.
    * This is used only to indicate the web request component for AWS WAF to inspect, in the <a>FieldToMatch</a> specification.
    */
  @js.native
  trait Body extends js.Object

  object Body {
    @inline
    def apply(): Body = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Body]
    }
  }

  /** '''Note:'''This is the latest version of ```AWS WAF```, named AWS WAFV2, released in November, 2019. For information, including how to migrate your AWS WAF resources from the prior release, see the [[https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html|AWS WAF Developer Guide]].
    * A rule statement that defines a string match search for AWS WAF to apply to web requests. The byte match statement provides the bytes to search for, the location in requests that you want AWS WAF to search, and other settings. The bytes to search for are typically a string that corresponds with ASCII characters. In the AWS WAF console and the developer guide, this is refered to as a string match statement.
    */
  @js.native
  trait ByteMatchStatement extends js.Object {
    var FieldToMatch: FieldToMatch
    var PositionalConstraint: PositionalConstraint
    var SearchString: SearchString
    var TextTransformations: TextTransformations
  }

  object ByteMatchStatement {
    @inline
    def apply(
        FieldToMatch: FieldToMatch,
        PositionalConstraint: PositionalConstraint,
        SearchString: SearchString,
        TextTransformations: TextTransformations
    ): ByteMatchStatement = {
      val __obj = js.Dynamic.literal(
        "FieldToMatch" -> FieldToMatch.asInstanceOf[js.Any],
        "PositionalConstraint" -> PositionalConstraint.asInstanceOf[js.Any],
        "SearchString" -> SearchString.asInstanceOf[js.Any],
        "TextTransformations" -> TextTransformations.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ByteMatchStatement]
    }
  }

  @js.native
  trait CheckCapacityRequest extends js.Object {
    var Rules: Rules
    var Scope: Scope
  }

  object CheckCapacityRequest {
    @inline
    def apply(
        Rules: Rules,
        Scope: Scope
    ): CheckCapacityRequest = {
      val __obj = js.Dynamic.literal(
        "Rules" -> Rules.asInstanceOf[js.Any],
        "Scope" -> Scope.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CheckCapacityRequest]
    }
  }

  @js.native
  trait CheckCapacityResponse extends js.Object {
    var Capacity: js.UndefOr[ConsumedCapacity]
  }

  object CheckCapacityResponse {
    @inline
    def apply(
        Capacity: js.UndefOr[ConsumedCapacity] = js.undefined
    ): CheckCapacityResponse = {
      val __obj = js.Dynamic.literal()
      Capacity.foreach(__v => __obj.updateDynamic("Capacity")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CheckCapacityResponse]
    }
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

  /** '''Note:'''This is the latest version of ```AWS WAF```, named AWS WAFV2, released in November, 2019. For information, including how to migrate your AWS WAF resources from the prior release, see the [[https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html|AWS WAF Developer Guide]].
    * Specifies that AWS WAF should count requests.
    * This is used only in the context of other settings, for example to specify values for <a>RuleAction</a> and web ACL <a>DefaultAction</a>.
    */
  @js.native
  trait CountAction extends js.Object

  object CountAction {
    @inline
    def apply(): CountAction = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CountAction]
    }
  }

  @js.native
  sealed trait CountryCode extends js.Any
  object CountryCode {
    val AF = "AF".asInstanceOf[CountryCode]
    val AX = "AX".asInstanceOf[CountryCode]
    val AL = "AL".asInstanceOf[CountryCode]
    val DZ = "DZ".asInstanceOf[CountryCode]
    val AS = "AS".asInstanceOf[CountryCode]
    val AD = "AD".asInstanceOf[CountryCode]
    val AO = "AO".asInstanceOf[CountryCode]
    val AI = "AI".asInstanceOf[CountryCode]
    val AQ = "AQ".asInstanceOf[CountryCode]
    val AG = "AG".asInstanceOf[CountryCode]
    val AR = "AR".asInstanceOf[CountryCode]
    val AM = "AM".asInstanceOf[CountryCode]
    val AW = "AW".asInstanceOf[CountryCode]
    val AU = "AU".asInstanceOf[CountryCode]
    val AT = "AT".asInstanceOf[CountryCode]
    val AZ = "AZ".asInstanceOf[CountryCode]
    val BS = "BS".asInstanceOf[CountryCode]
    val BH = "BH".asInstanceOf[CountryCode]
    val BD = "BD".asInstanceOf[CountryCode]
    val BB = "BB".asInstanceOf[CountryCode]
    val BY = "BY".asInstanceOf[CountryCode]
    val BE = "BE".asInstanceOf[CountryCode]
    val BZ = "BZ".asInstanceOf[CountryCode]
    val BJ = "BJ".asInstanceOf[CountryCode]
    val BM = "BM".asInstanceOf[CountryCode]
    val BT = "BT".asInstanceOf[CountryCode]
    val BO = "BO".asInstanceOf[CountryCode]
    val BQ = "BQ".asInstanceOf[CountryCode]
    val BA = "BA".asInstanceOf[CountryCode]
    val BW = "BW".asInstanceOf[CountryCode]
    val BV = "BV".asInstanceOf[CountryCode]
    val BR = "BR".asInstanceOf[CountryCode]
    val IO = "IO".asInstanceOf[CountryCode]
    val BN = "BN".asInstanceOf[CountryCode]
    val BG = "BG".asInstanceOf[CountryCode]
    val BF = "BF".asInstanceOf[CountryCode]
    val BI = "BI".asInstanceOf[CountryCode]
    val KH = "KH".asInstanceOf[CountryCode]
    val CM = "CM".asInstanceOf[CountryCode]
    val CA = "CA".asInstanceOf[CountryCode]
    val CV = "CV".asInstanceOf[CountryCode]
    val KY = "KY".asInstanceOf[CountryCode]
    val CF = "CF".asInstanceOf[CountryCode]
    val TD = "TD".asInstanceOf[CountryCode]
    val CL = "CL".asInstanceOf[CountryCode]
    val CN = "CN".asInstanceOf[CountryCode]
    val CX = "CX".asInstanceOf[CountryCode]
    val CC = "CC".asInstanceOf[CountryCode]
    val CO = "CO".asInstanceOf[CountryCode]
    val KM = "KM".asInstanceOf[CountryCode]
    val CG = "CG".asInstanceOf[CountryCode]
    val CD = "CD".asInstanceOf[CountryCode]
    val CK = "CK".asInstanceOf[CountryCode]
    val CR = "CR".asInstanceOf[CountryCode]
    val CI = "CI".asInstanceOf[CountryCode]
    val HR = "HR".asInstanceOf[CountryCode]
    val CU = "CU".asInstanceOf[CountryCode]
    val CW = "CW".asInstanceOf[CountryCode]
    val CY = "CY".asInstanceOf[CountryCode]
    val CZ = "CZ".asInstanceOf[CountryCode]
    val DK = "DK".asInstanceOf[CountryCode]
    val DJ = "DJ".asInstanceOf[CountryCode]
    val DM = "DM".asInstanceOf[CountryCode]
    val DO = "DO".asInstanceOf[CountryCode]
    val EC = "EC".asInstanceOf[CountryCode]
    val EG = "EG".asInstanceOf[CountryCode]
    val SV = "SV".asInstanceOf[CountryCode]
    val GQ = "GQ".asInstanceOf[CountryCode]
    val ER = "ER".asInstanceOf[CountryCode]
    val EE = "EE".asInstanceOf[CountryCode]
    val ET = "ET".asInstanceOf[CountryCode]
    val FK = "FK".asInstanceOf[CountryCode]
    val FO = "FO".asInstanceOf[CountryCode]
    val FJ = "FJ".asInstanceOf[CountryCode]
    val FI = "FI".asInstanceOf[CountryCode]
    val FR = "FR".asInstanceOf[CountryCode]
    val GF = "GF".asInstanceOf[CountryCode]
    val PF = "PF".asInstanceOf[CountryCode]
    val TF = "TF".asInstanceOf[CountryCode]
    val GA = "GA".asInstanceOf[CountryCode]
    val GM = "GM".asInstanceOf[CountryCode]
    val GE = "GE".asInstanceOf[CountryCode]
    val DE = "DE".asInstanceOf[CountryCode]
    val GH = "GH".asInstanceOf[CountryCode]
    val GI = "GI".asInstanceOf[CountryCode]
    val GR = "GR".asInstanceOf[CountryCode]
    val GL = "GL".asInstanceOf[CountryCode]
    val GD = "GD".asInstanceOf[CountryCode]
    val GP = "GP".asInstanceOf[CountryCode]
    val GU = "GU".asInstanceOf[CountryCode]
    val GT = "GT".asInstanceOf[CountryCode]
    val GG = "GG".asInstanceOf[CountryCode]
    val GN = "GN".asInstanceOf[CountryCode]
    val GW = "GW".asInstanceOf[CountryCode]
    val GY = "GY".asInstanceOf[CountryCode]
    val HT = "HT".asInstanceOf[CountryCode]
    val HM = "HM".asInstanceOf[CountryCode]
    val VA = "VA".asInstanceOf[CountryCode]
    val HN = "HN".asInstanceOf[CountryCode]
    val HK = "HK".asInstanceOf[CountryCode]
    val HU = "HU".asInstanceOf[CountryCode]
    val IS = "IS".asInstanceOf[CountryCode]
    val IN = "IN".asInstanceOf[CountryCode]
    val ID = "ID".asInstanceOf[CountryCode]
    val IR = "IR".asInstanceOf[CountryCode]
    val IQ = "IQ".asInstanceOf[CountryCode]
    val IE = "IE".asInstanceOf[CountryCode]
    val IM = "IM".asInstanceOf[CountryCode]
    val IL = "IL".asInstanceOf[CountryCode]
    val IT = "IT".asInstanceOf[CountryCode]
    val JM = "JM".asInstanceOf[CountryCode]
    val JP = "JP".asInstanceOf[CountryCode]
    val JE = "JE".asInstanceOf[CountryCode]
    val JO = "JO".asInstanceOf[CountryCode]
    val KZ = "KZ".asInstanceOf[CountryCode]
    val KE = "KE".asInstanceOf[CountryCode]
    val KI = "KI".asInstanceOf[CountryCode]
    val KP = "KP".asInstanceOf[CountryCode]
    val KR = "KR".asInstanceOf[CountryCode]
    val KW = "KW".asInstanceOf[CountryCode]
    val KG = "KG".asInstanceOf[CountryCode]
    val LA = "LA".asInstanceOf[CountryCode]
    val LV = "LV".asInstanceOf[CountryCode]
    val LB = "LB".asInstanceOf[CountryCode]
    val LS = "LS".asInstanceOf[CountryCode]
    val LR = "LR".asInstanceOf[CountryCode]
    val LY = "LY".asInstanceOf[CountryCode]
    val LI = "LI".asInstanceOf[CountryCode]
    val LT = "LT".asInstanceOf[CountryCode]
    val LU = "LU".asInstanceOf[CountryCode]
    val MO = "MO".asInstanceOf[CountryCode]
    val MK = "MK".asInstanceOf[CountryCode]
    val MG = "MG".asInstanceOf[CountryCode]
    val MW = "MW".asInstanceOf[CountryCode]
    val MY = "MY".asInstanceOf[CountryCode]
    val MV = "MV".asInstanceOf[CountryCode]
    val ML = "ML".asInstanceOf[CountryCode]
    val MT = "MT".asInstanceOf[CountryCode]
    val MH = "MH".asInstanceOf[CountryCode]
    val MQ = "MQ".asInstanceOf[CountryCode]
    val MR = "MR".asInstanceOf[CountryCode]
    val MU = "MU".asInstanceOf[CountryCode]
    val YT = "YT".asInstanceOf[CountryCode]
    val MX = "MX".asInstanceOf[CountryCode]
    val FM = "FM".asInstanceOf[CountryCode]
    val MD = "MD".asInstanceOf[CountryCode]
    val MC = "MC".asInstanceOf[CountryCode]
    val MN = "MN".asInstanceOf[CountryCode]
    val ME = "ME".asInstanceOf[CountryCode]
    val MS = "MS".asInstanceOf[CountryCode]
    val MA = "MA".asInstanceOf[CountryCode]
    val MZ = "MZ".asInstanceOf[CountryCode]
    val MM = "MM".asInstanceOf[CountryCode]
    val NA = "NA".asInstanceOf[CountryCode]
    val NR = "NR".asInstanceOf[CountryCode]
    val NP = "NP".asInstanceOf[CountryCode]
    val NL = "NL".asInstanceOf[CountryCode]
    val NC = "NC".asInstanceOf[CountryCode]
    val NZ = "NZ".asInstanceOf[CountryCode]
    val NI = "NI".asInstanceOf[CountryCode]
    val NE = "NE".asInstanceOf[CountryCode]
    val NG = "NG".asInstanceOf[CountryCode]
    val NU = "NU".asInstanceOf[CountryCode]
    val NF = "NF".asInstanceOf[CountryCode]
    val MP = "MP".asInstanceOf[CountryCode]
    val NO = "NO".asInstanceOf[CountryCode]
    val OM = "OM".asInstanceOf[CountryCode]
    val PK = "PK".asInstanceOf[CountryCode]
    val PW = "PW".asInstanceOf[CountryCode]
    val PS = "PS".asInstanceOf[CountryCode]
    val PA = "PA".asInstanceOf[CountryCode]
    val PG = "PG".asInstanceOf[CountryCode]
    val PY = "PY".asInstanceOf[CountryCode]
    val PE = "PE".asInstanceOf[CountryCode]
    val PH = "PH".asInstanceOf[CountryCode]
    val PN = "PN".asInstanceOf[CountryCode]
    val PL = "PL".asInstanceOf[CountryCode]
    val PT = "PT".asInstanceOf[CountryCode]
    val PR = "PR".asInstanceOf[CountryCode]
    val QA = "QA".asInstanceOf[CountryCode]
    val RE = "RE".asInstanceOf[CountryCode]
    val RO = "RO".asInstanceOf[CountryCode]
    val RU = "RU".asInstanceOf[CountryCode]
    val RW = "RW".asInstanceOf[CountryCode]
    val BL = "BL".asInstanceOf[CountryCode]
    val SH = "SH".asInstanceOf[CountryCode]
    val KN = "KN".asInstanceOf[CountryCode]
    val LC = "LC".asInstanceOf[CountryCode]
    val MF = "MF".asInstanceOf[CountryCode]
    val PM = "PM".asInstanceOf[CountryCode]
    val VC = "VC".asInstanceOf[CountryCode]
    val WS = "WS".asInstanceOf[CountryCode]
    val SM = "SM".asInstanceOf[CountryCode]
    val ST = "ST".asInstanceOf[CountryCode]
    val SA = "SA".asInstanceOf[CountryCode]
    val SN = "SN".asInstanceOf[CountryCode]
    val RS = "RS".asInstanceOf[CountryCode]
    val SC = "SC".asInstanceOf[CountryCode]
    val SL = "SL".asInstanceOf[CountryCode]
    val SG = "SG".asInstanceOf[CountryCode]
    val SX = "SX".asInstanceOf[CountryCode]
    val SK = "SK".asInstanceOf[CountryCode]
    val SI = "SI".asInstanceOf[CountryCode]
    val SB = "SB".asInstanceOf[CountryCode]
    val SO = "SO".asInstanceOf[CountryCode]
    val ZA = "ZA".asInstanceOf[CountryCode]
    val GS = "GS".asInstanceOf[CountryCode]
    val SS = "SS".asInstanceOf[CountryCode]
    val ES = "ES".asInstanceOf[CountryCode]
    val LK = "LK".asInstanceOf[CountryCode]
    val SD = "SD".asInstanceOf[CountryCode]
    val SR = "SR".asInstanceOf[CountryCode]
    val SJ = "SJ".asInstanceOf[CountryCode]
    val SZ = "SZ".asInstanceOf[CountryCode]
    val SE = "SE".asInstanceOf[CountryCode]
    val CH = "CH".asInstanceOf[CountryCode]
    val SY = "SY".asInstanceOf[CountryCode]
    val TW = "TW".asInstanceOf[CountryCode]
    val TJ = "TJ".asInstanceOf[CountryCode]
    val TZ = "TZ".asInstanceOf[CountryCode]
    val TH = "TH".asInstanceOf[CountryCode]
    val TL = "TL".asInstanceOf[CountryCode]
    val TG = "TG".asInstanceOf[CountryCode]
    val TK = "TK".asInstanceOf[CountryCode]
    val TO = "TO".asInstanceOf[CountryCode]
    val TT = "TT".asInstanceOf[CountryCode]
    val TN = "TN".asInstanceOf[CountryCode]
    val TR = "TR".asInstanceOf[CountryCode]
    val TM = "TM".asInstanceOf[CountryCode]
    val TC = "TC".asInstanceOf[CountryCode]
    val TV = "TV".asInstanceOf[CountryCode]
    val UG = "UG".asInstanceOf[CountryCode]
    val UA = "UA".asInstanceOf[CountryCode]
    val AE = "AE".asInstanceOf[CountryCode]
    val GB = "GB".asInstanceOf[CountryCode]
    val US = "US".asInstanceOf[CountryCode]
    val UM = "UM".asInstanceOf[CountryCode]
    val UY = "UY".asInstanceOf[CountryCode]
    val UZ = "UZ".asInstanceOf[CountryCode]
    val VU = "VU".asInstanceOf[CountryCode]
    val VE = "VE".asInstanceOf[CountryCode]
    val VN = "VN".asInstanceOf[CountryCode]
    val VG = "VG".asInstanceOf[CountryCode]
    val VI = "VI".asInstanceOf[CountryCode]
    val WF = "WF".asInstanceOf[CountryCode]
    val EH = "EH".asInstanceOf[CountryCode]
    val YE = "YE".asInstanceOf[CountryCode]
    val ZM = "ZM".asInstanceOf[CountryCode]
    val ZW = "ZW".asInstanceOf[CountryCode]

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

  @js.native
  trait CreateIPSetRequest extends js.Object {
    var Addresses: IPAddresses
    var IPAddressVersion: IPAddressVersion
    var Name: EntityName
    var Scope: Scope
    var Description: js.UndefOr[EntityDescription]
    var Tags: js.UndefOr[TagList]
  }

  object CreateIPSetRequest {
    @inline
    def apply(
        Addresses: IPAddresses,
        IPAddressVersion: IPAddressVersion,
        Name: EntityName,
        Scope: Scope,
        Description: js.UndefOr[EntityDescription] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateIPSetRequest = {
      val __obj = js.Dynamic.literal(
        "Addresses" -> Addresses.asInstanceOf[js.Any],
        "IPAddressVersion" -> IPAddressVersion.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
        "Scope" -> Scope.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateIPSetRequest]
    }
  }

  @js.native
  trait CreateIPSetResponse extends js.Object {
    var Summary: js.UndefOr[IPSetSummary]
  }

  object CreateIPSetResponse {
    @inline
    def apply(
        Summary: js.UndefOr[IPSetSummary] = js.undefined
    ): CreateIPSetResponse = {
      val __obj = js.Dynamic.literal()
      Summary.foreach(__v => __obj.updateDynamic("Summary")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateIPSetResponse]
    }
  }

  @js.native
  trait CreateRegexPatternSetRequest extends js.Object {
    var Name: EntityName
    var RegularExpressionList: RegularExpressionList
    var Scope: Scope
    var Description: js.UndefOr[EntityDescription]
    var Tags: js.UndefOr[TagList]
  }

  object CreateRegexPatternSetRequest {
    @inline
    def apply(
        Name: EntityName,
        RegularExpressionList: RegularExpressionList,
        Scope: Scope,
        Description: js.UndefOr[EntityDescription] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateRegexPatternSetRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "RegularExpressionList" -> RegularExpressionList.asInstanceOf[js.Any],
        "Scope" -> Scope.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateRegexPatternSetRequest]
    }
  }

  @js.native
  trait CreateRegexPatternSetResponse extends js.Object {
    var Summary: js.UndefOr[RegexPatternSetSummary]
  }

  object CreateRegexPatternSetResponse {
    @inline
    def apply(
        Summary: js.UndefOr[RegexPatternSetSummary] = js.undefined
    ): CreateRegexPatternSetResponse = {
      val __obj = js.Dynamic.literal()
      Summary.foreach(__v => __obj.updateDynamic("Summary")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateRegexPatternSetResponse]
    }
  }

  @js.native
  trait CreateRuleGroupRequest extends js.Object {
    var Capacity: CapacityUnit
    var Name: EntityName
    var Scope: Scope
    var VisibilityConfig: VisibilityConfig
    var Description: js.UndefOr[EntityDescription]
    var Rules: js.UndefOr[Rules]
    var Tags: js.UndefOr[TagList]
  }

  object CreateRuleGroupRequest {
    @inline
    def apply(
        Capacity: CapacityUnit,
        Name: EntityName,
        Scope: Scope,
        VisibilityConfig: VisibilityConfig,
        Description: js.UndefOr[EntityDescription] = js.undefined,
        Rules: js.UndefOr[Rules] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateRuleGroupRequest = {
      val __obj = js.Dynamic.literal(
        "Capacity" -> Capacity.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
        "Scope" -> Scope.asInstanceOf[js.Any],
        "VisibilityConfig" -> VisibilityConfig.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Rules.foreach(__v => __obj.updateDynamic("Rules")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateRuleGroupRequest]
    }
  }

  @js.native
  trait CreateRuleGroupResponse extends js.Object {
    var Summary: js.UndefOr[RuleGroupSummary]
  }

  object CreateRuleGroupResponse {
    @inline
    def apply(
        Summary: js.UndefOr[RuleGroupSummary] = js.undefined
    ): CreateRuleGroupResponse = {
      val __obj = js.Dynamic.literal()
      Summary.foreach(__v => __obj.updateDynamic("Summary")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateRuleGroupResponse]
    }
  }

  @js.native
  trait CreateWebACLRequest extends js.Object {
    var DefaultAction: DefaultAction
    var Name: EntityName
    var Scope: Scope
    var VisibilityConfig: VisibilityConfig
    var Description: js.UndefOr[EntityDescription]
    var Rules: js.UndefOr[Rules]
    var Tags: js.UndefOr[TagList]
  }

  object CreateWebACLRequest {
    @inline
    def apply(
        DefaultAction: DefaultAction,
        Name: EntityName,
        Scope: Scope,
        VisibilityConfig: VisibilityConfig,
        Description: js.UndefOr[EntityDescription] = js.undefined,
        Rules: js.UndefOr[Rules] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateWebACLRequest = {
      val __obj = js.Dynamic.literal(
        "DefaultAction" -> DefaultAction.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
        "Scope" -> Scope.asInstanceOf[js.Any],
        "VisibilityConfig" -> VisibilityConfig.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Rules.foreach(__v => __obj.updateDynamic("Rules")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateWebACLRequest]
    }
  }

  @js.native
  trait CreateWebACLResponse extends js.Object {
    var Summary: js.UndefOr[WebACLSummary]
  }

  object CreateWebACLResponse {
    @inline
    def apply(
        Summary: js.UndefOr[WebACLSummary] = js.undefined
    ): CreateWebACLResponse = {
      val __obj = js.Dynamic.literal()
      Summary.foreach(__v => __obj.updateDynamic("Summary")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateWebACLResponse]
    }
  }

  /** '''Note:'''This is the latest version of ```AWS WAF```, named AWS WAFV2, released in November, 2019. For information, including how to migrate your AWS WAF resources from the prior release, see the [[https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html|AWS WAF Developer Guide]].
    * In a <a>WebACL</a>, this is the action that you want AWS WAF to perform when a web request doesn't match any of the rules in the <code>WebACL</code>. The default action must be a terminating action, so count is not allowed.
    */
  @js.native
  trait DefaultAction extends js.Object {
    var Allow: js.UndefOr[AllowAction]
    var Block: js.UndefOr[BlockAction]
  }

  object DefaultAction {
    @inline
    def apply(
        Allow: js.UndefOr[AllowAction] = js.undefined,
        Block: js.UndefOr[BlockAction] = js.undefined
    ): DefaultAction = {
      val __obj = js.Dynamic.literal()
      Allow.foreach(__v => __obj.updateDynamic("Allow")(__v.asInstanceOf[js.Any]))
      Block.foreach(__v => __obj.updateDynamic("Block")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DefaultAction]
    }
  }

  @js.native
  trait DeleteFirewallManagerRuleGroupsRequest extends js.Object {
    var WebACLArn: ResourceArn
    var WebACLLockToken: LockToken
  }

  object DeleteFirewallManagerRuleGroupsRequest {
    @inline
    def apply(
        WebACLArn: ResourceArn,
        WebACLLockToken: LockToken
    ): DeleteFirewallManagerRuleGroupsRequest = {
      val __obj = js.Dynamic.literal(
        "WebACLArn" -> WebACLArn.asInstanceOf[js.Any],
        "WebACLLockToken" -> WebACLLockToken.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteFirewallManagerRuleGroupsRequest]
    }
  }

  @js.native
  trait DeleteFirewallManagerRuleGroupsResponse extends js.Object {
    var NextWebACLLockToken: js.UndefOr[LockToken]
  }

  object DeleteFirewallManagerRuleGroupsResponse {
    @inline
    def apply(
        NextWebACLLockToken: js.UndefOr[LockToken] = js.undefined
    ): DeleteFirewallManagerRuleGroupsResponse = {
      val __obj = js.Dynamic.literal()
      NextWebACLLockToken.foreach(__v => __obj.updateDynamic("NextWebACLLockToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteFirewallManagerRuleGroupsResponse]
    }
  }

  @js.native
  trait DeleteIPSetRequest extends js.Object {
    var Id: EntityId
    var LockToken: LockToken
    var Name: EntityName
    var Scope: Scope
  }

  object DeleteIPSetRequest {
    @inline
    def apply(
        Id: EntityId,
        LockToken: LockToken,
        Name: EntityName,
        Scope: Scope
    ): DeleteIPSetRequest = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any],
        "LockToken" -> LockToken.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
        "Scope" -> Scope.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteIPSetRequest]
    }
  }

  @js.native
  trait DeleteIPSetResponse extends js.Object

  object DeleteIPSetResponse {
    @inline
    def apply(): DeleteIPSetResponse = {
      val __obj = js.Dynamic.literal()
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
  trait DeleteLoggingConfigurationResponse extends js.Object

  object DeleteLoggingConfigurationResponse {
    @inline
    def apply(): DeleteLoggingConfigurationResponse = {
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
  trait DeletePermissionPolicyResponse extends js.Object

  object DeletePermissionPolicyResponse {
    @inline
    def apply(): DeletePermissionPolicyResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeletePermissionPolicyResponse]
    }
  }

  @js.native
  trait DeleteRegexPatternSetRequest extends js.Object {
    var Id: EntityId
    var LockToken: LockToken
    var Name: EntityName
    var Scope: Scope
  }

  object DeleteRegexPatternSetRequest {
    @inline
    def apply(
        Id: EntityId,
        LockToken: LockToken,
        Name: EntityName,
        Scope: Scope
    ): DeleteRegexPatternSetRequest = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any],
        "LockToken" -> LockToken.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
        "Scope" -> Scope.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteRegexPatternSetRequest]
    }
  }

  @js.native
  trait DeleteRegexPatternSetResponse extends js.Object

  object DeleteRegexPatternSetResponse {
    @inline
    def apply(): DeleteRegexPatternSetResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteRegexPatternSetResponse]
    }
  }

  @js.native
  trait DeleteRuleGroupRequest extends js.Object {
    var Id: EntityId
    var LockToken: LockToken
    var Name: EntityName
    var Scope: Scope
  }

  object DeleteRuleGroupRequest {
    @inline
    def apply(
        Id: EntityId,
        LockToken: LockToken,
        Name: EntityName,
        Scope: Scope
    ): DeleteRuleGroupRequest = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any],
        "LockToken" -> LockToken.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
        "Scope" -> Scope.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteRuleGroupRequest]
    }
  }

  @js.native
  trait DeleteRuleGroupResponse extends js.Object

  object DeleteRuleGroupResponse {
    @inline
    def apply(): DeleteRuleGroupResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteRuleGroupResponse]
    }
  }

  @js.native
  trait DeleteWebACLRequest extends js.Object {
    var Id: EntityId
    var LockToken: LockToken
    var Name: EntityName
    var Scope: Scope
  }

  object DeleteWebACLRequest {
    @inline
    def apply(
        Id: EntityId,
        LockToken: LockToken,
        Name: EntityName,
        Scope: Scope
    ): DeleteWebACLRequest = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any],
        "LockToken" -> LockToken.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
        "Scope" -> Scope.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteWebACLRequest]
    }
  }

  @js.native
  trait DeleteWebACLResponse extends js.Object

  object DeleteWebACLResponse {
    @inline
    def apply(): DeleteWebACLResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteWebACLResponse]
    }
  }

  @js.native
  trait DescribeManagedRuleGroupRequest extends js.Object {
    var Name: EntityName
    var Scope: Scope
    var VendorName: VendorName
  }

  object DescribeManagedRuleGroupRequest {
    @inline
    def apply(
        Name: EntityName,
        Scope: Scope,
        VendorName: VendorName
    ): DescribeManagedRuleGroupRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "Scope" -> Scope.asInstanceOf[js.Any],
        "VendorName" -> VendorName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeManagedRuleGroupRequest]
    }
  }

  @js.native
  trait DescribeManagedRuleGroupResponse extends js.Object {
    var Capacity: js.UndefOr[CapacityUnit]
    var Rules: js.UndefOr[RuleSummaries]
  }

  object DescribeManagedRuleGroupResponse {
    @inline
    def apply(
        Capacity: js.UndefOr[CapacityUnit] = js.undefined,
        Rules: js.UndefOr[RuleSummaries] = js.undefined
    ): DescribeManagedRuleGroupResponse = {
      val __obj = js.Dynamic.literal()
      Capacity.foreach(__v => __obj.updateDynamic("Capacity")(__v.asInstanceOf[js.Any]))
      Rules.foreach(__v => __obj.updateDynamic("Rules")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeManagedRuleGroupResponse]
    }
  }

  @js.native
  trait DisassociateWebACLRequest extends js.Object {
    var ResourceArn: ResourceArn
  }

  object DisassociateWebACLRequest {
    @inline
    def apply(
        ResourceArn: ResourceArn
    ): DisassociateWebACLRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DisassociateWebACLRequest]
    }
  }

  @js.native
  trait DisassociateWebACLResponse extends js.Object

  object DisassociateWebACLResponse {
    @inline
    def apply(): DisassociateWebACLResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DisassociateWebACLResponse]
    }
  }

  /** '''Note:'''This is the latest version of ```AWS WAF```, named AWS WAFV2, released in November, 2019. For information, including how to migrate your AWS WAF resources from the prior release, see the [[https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html|AWS WAF Developer Guide]].
    * Specifies a single rule to exclude from the rule group. Excluding a rule overrides its action setting for the rule group in the web ACL, setting it to <code>COUNT</code>. This effectively excludes the rule from acting on web requests.
    */
  @js.native
  trait ExcludedRule extends js.Object {
    var Name: EntityName
  }

  object ExcludedRule {
    @inline
    def apply(
        Name: EntityName
    ): ExcludedRule = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ExcludedRule]
    }
  }

  @js.native
  sealed trait FallbackBehavior extends js.Any
  object FallbackBehavior {
    val MATCH = "MATCH".asInstanceOf[FallbackBehavior]
    val NO_MATCH = "NO_MATCH".asInstanceOf[FallbackBehavior]

    @inline def values = js.Array(MATCH, NO_MATCH)
  }

  /** '''Note:'''This is the latest version of ```AWS WAF```, named AWS WAFV2, released in November, 2019. For information, including how to migrate your AWS WAF resources from the prior release, see the [[https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html|AWS WAF Developer Guide]].
    * The part of a web request that you want AWS WAF to inspect. Include the single <code>FieldToMatch</code> type that you want to inspect, with additional specifications as needed, according to the type. You specify a single request component in <code>FieldToMatch</code> for each rule statement that requires it. To inspect more than one component of a web request, create a separate rule statement for each component.
    */
  @js.native
  trait FieldToMatch extends js.Object {
    var AllQueryArguments: js.UndefOr[AllQueryArguments]
    var Body: js.UndefOr[Body]
    var Method: js.UndefOr[Method]
    var QueryString: js.UndefOr[QueryString]
    var SingleHeader: js.UndefOr[SingleHeader]
    var SingleQueryArgument: js.UndefOr[SingleQueryArgument]
    var UriPath: js.UndefOr[UriPath]
  }

  object FieldToMatch {
    @inline
    def apply(
        AllQueryArguments: js.UndefOr[AllQueryArguments] = js.undefined,
        Body: js.UndefOr[Body] = js.undefined,
        Method: js.UndefOr[Method] = js.undefined,
        QueryString: js.UndefOr[QueryString] = js.undefined,
        SingleHeader: js.UndefOr[SingleHeader] = js.undefined,
        SingleQueryArgument: js.UndefOr[SingleQueryArgument] = js.undefined,
        UriPath: js.UndefOr[UriPath] = js.undefined
    ): FieldToMatch = {
      val __obj = js.Dynamic.literal()
      AllQueryArguments.foreach(__v => __obj.updateDynamic("AllQueryArguments")(__v.asInstanceOf[js.Any]))
      Body.foreach(__v => __obj.updateDynamic("Body")(__v.asInstanceOf[js.Any]))
      Method.foreach(__v => __obj.updateDynamic("Method")(__v.asInstanceOf[js.Any]))
      QueryString.foreach(__v => __obj.updateDynamic("QueryString")(__v.asInstanceOf[js.Any]))
      SingleHeader.foreach(__v => __obj.updateDynamic("SingleHeader")(__v.asInstanceOf[js.Any]))
      SingleQueryArgument.foreach(__v => __obj.updateDynamic("SingleQueryArgument")(__v.asInstanceOf[js.Any]))
      UriPath.foreach(__v => __obj.updateDynamic("UriPath")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FieldToMatch]
    }
  }

  /** A rule group that's defined for an AWS Firewall Manager WAF policy.
    */
  @js.native
  trait FirewallManagerRuleGroup extends js.Object {
    var FirewallManagerStatement: FirewallManagerStatement
    var Name: EntityName
    var OverrideAction: OverrideAction
    var Priority: RulePriority
    var VisibilityConfig: VisibilityConfig
  }

  object FirewallManagerRuleGroup {
    @inline
    def apply(
        FirewallManagerStatement: FirewallManagerStatement,
        Name: EntityName,
        OverrideAction: OverrideAction,
        Priority: RulePriority,
        VisibilityConfig: VisibilityConfig
    ): FirewallManagerRuleGroup = {
      val __obj = js.Dynamic.literal(
        "FirewallManagerStatement" -> FirewallManagerStatement.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
        "OverrideAction" -> OverrideAction.asInstanceOf[js.Any],
        "Priority" -> Priority.asInstanceOf[js.Any],
        "VisibilityConfig" -> VisibilityConfig.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[FirewallManagerRuleGroup]
    }
  }

  /** The processing guidance for an AWS Firewall Manager rule. This is like a regular rule <a>Statement</a>, but it can only contain a rule group reference.
    */
  @js.native
  trait FirewallManagerStatement extends js.Object {
    var ManagedRuleGroupStatement: js.UndefOr[ManagedRuleGroupStatement]
    var RuleGroupReferenceStatement: js.UndefOr[RuleGroupReferenceStatement]
  }

  object FirewallManagerStatement {
    @inline
    def apply(
        ManagedRuleGroupStatement: js.UndefOr[ManagedRuleGroupStatement] = js.undefined,
        RuleGroupReferenceStatement: js.UndefOr[RuleGroupReferenceStatement] = js.undefined
    ): FirewallManagerStatement = {
      val __obj = js.Dynamic.literal()
      ManagedRuleGroupStatement.foreach(__v => __obj.updateDynamic("ManagedRuleGroupStatement")(__v.asInstanceOf[js.Any]))
      RuleGroupReferenceStatement.foreach(__v => __obj.updateDynamic("RuleGroupReferenceStatement")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FirewallManagerStatement]
    }
  }

  /** The configuration for inspecting IP addresses in an HTTP header that you specify, instead of using the IP address that's reported by the web request origin. Commonly, this is the X-Forwarded-For (XFF) header, but you can specify any header name.
    *
    * '''Note:'''If the specified header isn't present in the request, AWS WAF doesn't apply the rule to the web request at all.
    * This configuration is used for <a>GeoMatchStatement</a> and <a>RateBasedStatement</a>. For <a>IPSetReferenceStatement</a>, use <a>IPSetForwardedIPConfig</a> instead.
    * AWS WAF only evaluates the first IP address found in the specified HTTP header.
    */
  @js.native
  trait ForwardedIPConfig extends js.Object {
    var FallbackBehavior: FallbackBehavior
    var HeaderName: ForwardedIPHeaderName
  }

  object ForwardedIPConfig {
    @inline
    def apply(
        FallbackBehavior: FallbackBehavior,
        HeaderName: ForwardedIPHeaderName
    ): ForwardedIPConfig = {
      val __obj = js.Dynamic.literal(
        "FallbackBehavior" -> FallbackBehavior.asInstanceOf[js.Any],
        "HeaderName" -> HeaderName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ForwardedIPConfig]
    }
  }

  @js.native
  sealed trait ForwardedIPPosition extends js.Any
  object ForwardedIPPosition {
    val FIRST = "FIRST".asInstanceOf[ForwardedIPPosition]
    val LAST = "LAST".asInstanceOf[ForwardedIPPosition]
    val ANY = "ANY".asInstanceOf[ForwardedIPPosition]

    @inline def values = js.Array(FIRST, LAST, ANY)
  }

  /** '''Note:'''This is the latest version of ```AWS WAF```, named AWS WAFV2, released in November, 2019. For information, including how to migrate your AWS WAF resources from the prior release, see the [[https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html|AWS WAF Developer Guide]].
    * A rule statement used to identify web requests based on country of origin.
    */
  @js.native
  trait GeoMatchStatement extends js.Object {
    var CountryCodes: js.UndefOr[CountryCodes]
    var ForwardedIPConfig: js.UndefOr[ForwardedIPConfig]
  }

  object GeoMatchStatement {
    @inline
    def apply(
        CountryCodes: js.UndefOr[CountryCodes] = js.undefined,
        ForwardedIPConfig: js.UndefOr[ForwardedIPConfig] = js.undefined
    ): GeoMatchStatement = {
      val __obj = js.Dynamic.literal()
      CountryCodes.foreach(__v => __obj.updateDynamic("CountryCodes")(__v.asInstanceOf[js.Any]))
      ForwardedIPConfig.foreach(__v => __obj.updateDynamic("ForwardedIPConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GeoMatchStatement]
    }
  }

  @js.native
  trait GetIPSetRequest extends js.Object {
    var Id: EntityId
    var Name: EntityName
    var Scope: Scope
  }

  object GetIPSetRequest {
    @inline
    def apply(
        Id: EntityId,
        Name: EntityName,
        Scope: Scope
    ): GetIPSetRequest = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
        "Scope" -> Scope.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetIPSetRequest]
    }
  }

  @js.native
  trait GetIPSetResponse extends js.Object {
    var IPSet: js.UndefOr[IPSet]
    var LockToken: js.UndefOr[LockToken]
  }

  object GetIPSetResponse {
    @inline
    def apply(
        IPSet: js.UndefOr[IPSet] = js.undefined,
        LockToken: js.UndefOr[LockToken] = js.undefined
    ): GetIPSetResponse = {
      val __obj = js.Dynamic.literal()
      IPSet.foreach(__v => __obj.updateDynamic("IPSet")(__v.asInstanceOf[js.Any]))
      LockToken.foreach(__v => __obj.updateDynamic("LockToken")(__v.asInstanceOf[js.Any]))
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
  trait GetRateBasedStatementManagedKeysRequest extends js.Object {
    var RuleName: EntityName
    var Scope: Scope
    var WebACLId: EntityId
    var WebACLName: EntityName
  }

  object GetRateBasedStatementManagedKeysRequest {
    @inline
    def apply(
        RuleName: EntityName,
        Scope: Scope,
        WebACLId: EntityId,
        WebACLName: EntityName
    ): GetRateBasedStatementManagedKeysRequest = {
      val __obj = js.Dynamic.literal(
        "RuleName" -> RuleName.asInstanceOf[js.Any],
        "Scope" -> Scope.asInstanceOf[js.Any],
        "WebACLId" -> WebACLId.asInstanceOf[js.Any],
        "WebACLName" -> WebACLName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetRateBasedStatementManagedKeysRequest]
    }
  }

  @js.native
  trait GetRateBasedStatementManagedKeysResponse extends js.Object {
    var ManagedKeysIPV4: js.UndefOr[RateBasedStatementManagedKeysIPSet]
    var ManagedKeysIPV6: js.UndefOr[RateBasedStatementManagedKeysIPSet]
  }

  object GetRateBasedStatementManagedKeysResponse {
    @inline
    def apply(
        ManagedKeysIPV4: js.UndefOr[RateBasedStatementManagedKeysIPSet] = js.undefined,
        ManagedKeysIPV6: js.UndefOr[RateBasedStatementManagedKeysIPSet] = js.undefined
    ): GetRateBasedStatementManagedKeysResponse = {
      val __obj = js.Dynamic.literal()
      ManagedKeysIPV4.foreach(__v => __obj.updateDynamic("ManagedKeysIPV4")(__v.asInstanceOf[js.Any]))
      ManagedKeysIPV6.foreach(__v => __obj.updateDynamic("ManagedKeysIPV6")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetRateBasedStatementManagedKeysResponse]
    }
  }

  @js.native
  trait GetRegexPatternSetRequest extends js.Object {
    var Id: EntityId
    var Name: EntityName
    var Scope: Scope
  }

  object GetRegexPatternSetRequest {
    @inline
    def apply(
        Id: EntityId,
        Name: EntityName,
        Scope: Scope
    ): GetRegexPatternSetRequest = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
        "Scope" -> Scope.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetRegexPatternSetRequest]
    }
  }

  @js.native
  trait GetRegexPatternSetResponse extends js.Object {
    var LockToken: js.UndefOr[LockToken]
    var RegexPatternSet: js.UndefOr[RegexPatternSet]
  }

  object GetRegexPatternSetResponse {
    @inline
    def apply(
        LockToken: js.UndefOr[LockToken] = js.undefined,
        RegexPatternSet: js.UndefOr[RegexPatternSet] = js.undefined
    ): GetRegexPatternSetResponse = {
      val __obj = js.Dynamic.literal()
      LockToken.foreach(__v => __obj.updateDynamic("LockToken")(__v.asInstanceOf[js.Any]))
      RegexPatternSet.foreach(__v => __obj.updateDynamic("RegexPatternSet")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetRegexPatternSetResponse]
    }
  }

  @js.native
  trait GetRuleGroupRequest extends js.Object {
    var Id: EntityId
    var Name: EntityName
    var Scope: Scope
  }

  object GetRuleGroupRequest {
    @inline
    def apply(
        Id: EntityId,
        Name: EntityName,
        Scope: Scope
    ): GetRuleGroupRequest = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
        "Scope" -> Scope.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetRuleGroupRequest]
    }
  }

  @js.native
  trait GetRuleGroupResponse extends js.Object {
    var LockToken: js.UndefOr[LockToken]
    var RuleGroup: js.UndefOr[RuleGroup]
  }

  object GetRuleGroupResponse {
    @inline
    def apply(
        LockToken: js.UndefOr[LockToken] = js.undefined,
        RuleGroup: js.UndefOr[RuleGroup] = js.undefined
    ): GetRuleGroupResponse = {
      val __obj = js.Dynamic.literal()
      LockToken.foreach(__v => __obj.updateDynamic("LockToken")(__v.asInstanceOf[js.Any]))
      RuleGroup.foreach(__v => __obj.updateDynamic("RuleGroup")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetRuleGroupResponse]
    }
  }

  @js.native
  trait GetSampledRequestsRequest extends js.Object {
    var MaxItems: ListMaxItems
    var RuleMetricName: MetricName
    var Scope: Scope
    var TimeWindow: TimeWindow
    var WebAclArn: ResourceArn
  }

  object GetSampledRequestsRequest {
    @inline
    def apply(
        MaxItems: ListMaxItems,
        RuleMetricName: MetricName,
        Scope: Scope,
        TimeWindow: TimeWindow,
        WebAclArn: ResourceArn
    ): GetSampledRequestsRequest = {
      val __obj = js.Dynamic.literal(
        "MaxItems" -> MaxItems.asInstanceOf[js.Any],
        "RuleMetricName" -> RuleMetricName.asInstanceOf[js.Any],
        "Scope" -> Scope.asInstanceOf[js.Any],
        "TimeWindow" -> TimeWindow.asInstanceOf[js.Any],
        "WebAclArn" -> WebAclArn.asInstanceOf[js.Any]
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
  trait GetWebACLForResourceRequest extends js.Object {
    var ResourceArn: ResourceArn
  }

  object GetWebACLForResourceRequest {
    @inline
    def apply(
        ResourceArn: ResourceArn
    ): GetWebACLForResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetWebACLForResourceRequest]
    }
  }

  @js.native
  trait GetWebACLForResourceResponse extends js.Object {
    var WebACL: js.UndefOr[WebACL]
  }

  object GetWebACLForResourceResponse {
    @inline
    def apply(
        WebACL: js.UndefOr[WebACL] = js.undefined
    ): GetWebACLForResourceResponse = {
      val __obj = js.Dynamic.literal()
      WebACL.foreach(__v => __obj.updateDynamic("WebACL")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetWebACLForResourceResponse]
    }
  }

  @js.native
  trait GetWebACLRequest extends js.Object {
    var Id: EntityId
    var Name: EntityName
    var Scope: Scope
  }

  object GetWebACLRequest {
    @inline
    def apply(
        Id: EntityId,
        Name: EntityName,
        Scope: Scope
    ): GetWebACLRequest = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
        "Scope" -> Scope.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetWebACLRequest]
    }
  }

  @js.native
  trait GetWebACLResponse extends js.Object {
    var LockToken: js.UndefOr[LockToken]
    var WebACL: js.UndefOr[WebACL]
  }

  object GetWebACLResponse {
    @inline
    def apply(
        LockToken: js.UndefOr[LockToken] = js.undefined,
        WebACL: js.UndefOr[WebACL] = js.undefined
    ): GetWebACLResponse = {
      val __obj = js.Dynamic.literal()
      LockToken.foreach(__v => __obj.updateDynamic("LockToken")(__v.asInstanceOf[js.Any]))
      WebACL.foreach(__v => __obj.updateDynamic("WebACL")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetWebACLResponse]
    }
  }

  /** '''Note:'''This is the latest version of ```AWS WAF```, named AWS WAFV2, released in November, 2019. For information, including how to migrate your AWS WAF resources from the prior release, see the [[https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html|AWS WAF Developer Guide]].
    * Part of the response from <a>GetSampledRequests</a>. This is a complex type that appears as <code>Headers</code> in the response syntax. <code>HTTPHeader</code> contains the names and values of all of the headers that appear in one of the web requests.
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

  /** '''Note:'''This is the latest version of ```AWS WAF```, named AWS WAFV2, released in November, 2019. For information, including how to migrate your AWS WAF resources from the prior release, see the [[https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html|AWS WAF Developer Guide]].
    * Part of the response from <a>GetSampledRequests</a>. This is a complex type that appears as <code>Request</code> in the response syntax. <code>HTTPRequest</code> contains information about one of the web requests.
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

  @js.native
  sealed trait IPAddressVersion extends js.Any
  object IPAddressVersion {
    val IPV4 = "IPV4".asInstanceOf[IPAddressVersion]
    val IPV6 = "IPV6".asInstanceOf[IPAddressVersion]

    @inline def values = js.Array(IPV4, IPV6)
  }

  /** '''Note:'''This is the latest version of ```AWS WAF```, named AWS WAFV2, released in November, 2019. For information, including how to migrate your AWS WAF resources from the prior release, see the [[https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html|AWS WAF Developer Guide]].
    * Contains one or more IP addresses or blocks of IP addresses specified in Classless Inter-Domain Routing (CIDR) notation. AWS WAF supports any CIDR range. For information about CIDR notation, see the Wikipedia entry [[https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing|Classless Inter-Domain Routing]].
    * AWS WAF assigns an ARN to each <code>IPSet</code> that you create. To use an IP set in a rule, you provide the ARN to the <a>Rule</a> statement <a>IPSetReferenceStatement</a>.
    */
  @js.native
  trait IPSet extends js.Object {
    var ARN: ResourceArn
    var Addresses: IPAddresses
    var IPAddressVersion: IPAddressVersion
    var Id: EntityId
    var Name: EntityName
    var Description: js.UndefOr[EntityDescription]
  }

  object IPSet {
    @inline
    def apply(
        ARN: ResourceArn,
        Addresses: IPAddresses,
        IPAddressVersion: IPAddressVersion,
        Id: EntityId,
        Name: EntityName,
        Description: js.UndefOr[EntityDescription] = js.undefined
    ): IPSet = {
      val __obj = js.Dynamic.literal(
        "ARN" -> ARN.asInstanceOf[js.Any],
        "Addresses" -> Addresses.asInstanceOf[js.Any],
        "IPAddressVersion" -> IPAddressVersion.asInstanceOf[js.Any],
        "Id" -> Id.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[IPSet]
    }
  }

  /** The configuration for inspecting IP addresses in an HTTP header that you specify, instead of using the IP address that's reported by the web request origin. Commonly, this is the X-Forwarded-For (XFF) header, but you can specify any header name.
    *
    * '''Note:'''If the specified header isn't present in the request, AWS WAF doesn't apply the rule to the web request at all.
    * This configuration is used only for <a>IPSetReferenceStatement</a>. For <a>GeoMatchStatement</a> and <a>RateBasedStatement</a>, use <a>ForwardedIPConfig</a> instead.
    */
  @js.native
  trait IPSetForwardedIPConfig extends js.Object {
    var FallbackBehavior: FallbackBehavior
    var HeaderName: ForwardedIPHeaderName
    var Position: ForwardedIPPosition
  }

  object IPSetForwardedIPConfig {
    @inline
    def apply(
        FallbackBehavior: FallbackBehavior,
        HeaderName: ForwardedIPHeaderName,
        Position: ForwardedIPPosition
    ): IPSetForwardedIPConfig = {
      val __obj = js.Dynamic.literal(
        "FallbackBehavior" -> FallbackBehavior.asInstanceOf[js.Any],
        "HeaderName" -> HeaderName.asInstanceOf[js.Any],
        "Position" -> Position.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[IPSetForwardedIPConfig]
    }
  }

  /** '''Note:'''This is the latest version of ```AWS WAF```, named AWS WAFV2, released in November, 2019. For information, including how to migrate your AWS WAF resources from the prior release, see the [[https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html|AWS WAF Developer Guide]].
    * A rule statement used to detect web requests coming from particular IP addresses or address ranges. To use this, create an <a>IPSet</a> that specifies the addresses you want to detect, then use the ARN of that set in this statement. To create an IP set, see <a>CreateIPSet</a>.
    * Each IP set rule statement references an IP set. You create and maintain the set independent of your rules. This allows you to use the single set in multiple rules. When you update the referenced set, AWS WAF automatically updates all rules that reference it.
    */
  @js.native
  trait IPSetReferenceStatement extends js.Object {
    var ARN: ResourceArn
    var IPSetForwardedIPConfig: js.UndefOr[IPSetForwardedIPConfig]
  }

  object IPSetReferenceStatement {
    @inline
    def apply(
        ARN: ResourceArn,
        IPSetForwardedIPConfig: js.UndefOr[IPSetForwardedIPConfig] = js.undefined
    ): IPSetReferenceStatement = {
      val __obj = js.Dynamic.literal(
        "ARN" -> ARN.asInstanceOf[js.Any]
      )

      IPSetForwardedIPConfig.foreach(__v => __obj.updateDynamic("IPSetForwardedIPConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[IPSetReferenceStatement]
    }
  }

  /** '''Note:'''This is the latest version of ```AWS WAF```, named AWS WAFV2, released in November, 2019. For information, including how to migrate your AWS WAF resources from the prior release, see the [[https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html|AWS WAF Developer Guide]].
    * High-level information about an <a>IPSet</a>, returned by operations like create and list. This provides information like the ID, that you can use to retrieve and manage an <code>IPSet</code>, and the ARN, that you provide to the <a>IPSetReferenceStatement</a> to use the address set in a <a>Rule</a>.
    */
  @js.native
  trait IPSetSummary extends js.Object {
    var ARN: js.UndefOr[ResourceArn]
    var Description: js.UndefOr[EntityDescription]
    var Id: js.UndefOr[EntityId]
    var LockToken: js.UndefOr[LockToken]
    var Name: js.UndefOr[EntityName]
  }

  object IPSetSummary {
    @inline
    def apply(
        ARN: js.UndefOr[ResourceArn] = js.undefined,
        Description: js.UndefOr[EntityDescription] = js.undefined,
        Id: js.UndefOr[EntityId] = js.undefined,
        LockToken: js.UndefOr[LockToken] = js.undefined,
        Name: js.UndefOr[EntityName] = js.undefined
    ): IPSetSummary = {
      val __obj = js.Dynamic.literal()
      ARN.foreach(__v => __obj.updateDynamic("ARN")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      LockToken.foreach(__v => __obj.updateDynamic("LockToken")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[IPSetSummary]
    }
  }

  @js.native
  trait ListAvailableManagedRuleGroupsRequest extends js.Object {
    var Scope: Scope
    var Limit: js.UndefOr[PaginationLimit]
    var NextMarker: js.UndefOr[NextMarker]
  }

  object ListAvailableManagedRuleGroupsRequest {
    @inline
    def apply(
        Scope: Scope,
        Limit: js.UndefOr[PaginationLimit] = js.undefined,
        NextMarker: js.UndefOr[NextMarker] = js.undefined
    ): ListAvailableManagedRuleGroupsRequest = {
      val __obj = js.Dynamic.literal(
        "Scope" -> Scope.asInstanceOf[js.Any]
      )

      Limit.foreach(__v => __obj.updateDynamic("Limit")(__v.asInstanceOf[js.Any]))
      NextMarker.foreach(__v => __obj.updateDynamic("NextMarker")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAvailableManagedRuleGroupsRequest]
    }
  }

  @js.native
  trait ListAvailableManagedRuleGroupsResponse extends js.Object {
    var ManagedRuleGroups: js.UndefOr[ManagedRuleGroupSummaries]
    var NextMarker: js.UndefOr[NextMarker]
  }

  object ListAvailableManagedRuleGroupsResponse {
    @inline
    def apply(
        ManagedRuleGroups: js.UndefOr[ManagedRuleGroupSummaries] = js.undefined,
        NextMarker: js.UndefOr[NextMarker] = js.undefined
    ): ListAvailableManagedRuleGroupsResponse = {
      val __obj = js.Dynamic.literal()
      ManagedRuleGroups.foreach(__v => __obj.updateDynamic("ManagedRuleGroups")(__v.asInstanceOf[js.Any]))
      NextMarker.foreach(__v => __obj.updateDynamic("NextMarker")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAvailableManagedRuleGroupsResponse]
    }
  }

  @js.native
  trait ListIPSetsRequest extends js.Object {
    var Scope: Scope
    var Limit: js.UndefOr[PaginationLimit]
    var NextMarker: js.UndefOr[NextMarker]
  }

  object ListIPSetsRequest {
    @inline
    def apply(
        Scope: Scope,
        Limit: js.UndefOr[PaginationLimit] = js.undefined,
        NextMarker: js.UndefOr[NextMarker] = js.undefined
    ): ListIPSetsRequest = {
      val __obj = js.Dynamic.literal(
        "Scope" -> Scope.asInstanceOf[js.Any]
      )

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
    var Scope: js.UndefOr[Scope]
  }

  object ListLoggingConfigurationsRequest {
    @inline
    def apply(
        Limit: js.UndefOr[PaginationLimit] = js.undefined,
        NextMarker: js.UndefOr[NextMarker] = js.undefined,
        Scope: js.UndefOr[Scope] = js.undefined
    ): ListLoggingConfigurationsRequest = {
      val __obj = js.Dynamic.literal()
      Limit.foreach(__v => __obj.updateDynamic("Limit")(__v.asInstanceOf[js.Any]))
      NextMarker.foreach(__v => __obj.updateDynamic("NextMarker")(__v.asInstanceOf[js.Any]))
      Scope.foreach(__v => __obj.updateDynamic("Scope")(__v.asInstanceOf[js.Any]))
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
  trait ListRegexPatternSetsRequest extends js.Object {
    var Scope: Scope
    var Limit: js.UndefOr[PaginationLimit]
    var NextMarker: js.UndefOr[NextMarker]
  }

  object ListRegexPatternSetsRequest {
    @inline
    def apply(
        Scope: Scope,
        Limit: js.UndefOr[PaginationLimit] = js.undefined,
        NextMarker: js.UndefOr[NextMarker] = js.undefined
    ): ListRegexPatternSetsRequest = {
      val __obj = js.Dynamic.literal(
        "Scope" -> Scope.asInstanceOf[js.Any]
      )

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
  trait ListResourcesForWebACLRequest extends js.Object {
    var WebACLArn: ResourceArn
    var ResourceType: js.UndefOr[ResourceType]
  }

  object ListResourcesForWebACLRequest {
    @inline
    def apply(
        WebACLArn: ResourceArn,
        ResourceType: js.UndefOr[ResourceType] = js.undefined
    ): ListResourcesForWebACLRequest = {
      val __obj = js.Dynamic.literal(
        "WebACLArn" -> WebACLArn.asInstanceOf[js.Any]
      )

      ResourceType.foreach(__v => __obj.updateDynamic("ResourceType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListResourcesForWebACLRequest]
    }
  }

  @js.native
  trait ListResourcesForWebACLResponse extends js.Object {
    var ResourceArns: js.UndefOr[ResourceArns]
  }

  object ListResourcesForWebACLResponse {
    @inline
    def apply(
        ResourceArns: js.UndefOr[ResourceArns] = js.undefined
    ): ListResourcesForWebACLResponse = {
      val __obj = js.Dynamic.literal()
      ResourceArns.foreach(__v => __obj.updateDynamic("ResourceArns")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListResourcesForWebACLResponse]
    }
  }

  @js.native
  trait ListRuleGroupsRequest extends js.Object {
    var Scope: Scope
    var Limit: js.UndefOr[PaginationLimit]
    var NextMarker: js.UndefOr[NextMarker]
  }

  object ListRuleGroupsRequest {
    @inline
    def apply(
        Scope: Scope,
        Limit: js.UndefOr[PaginationLimit] = js.undefined,
        NextMarker: js.UndefOr[NextMarker] = js.undefined
    ): ListRuleGroupsRequest = {
      val __obj = js.Dynamic.literal(
        "Scope" -> Scope.asInstanceOf[js.Any]
      )

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
    var Scope: Scope
    var Limit: js.UndefOr[PaginationLimit]
    var NextMarker: js.UndefOr[NextMarker]
  }

  object ListWebACLsRequest {
    @inline
    def apply(
        Scope: Scope,
        Limit: js.UndefOr[PaginationLimit] = js.undefined,
        NextMarker: js.UndefOr[NextMarker] = js.undefined
    ): ListWebACLsRequest = {
      val __obj = js.Dynamic.literal(
        "Scope" -> Scope.asInstanceOf[js.Any]
      )

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

  /** '''Note:'''This is the latest version of ```AWS WAF```, named AWS WAFV2, released in November, 2019. For information, including how to migrate your AWS WAF resources from the prior release, see the [[https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html|AWS WAF Developer Guide]].
    * Defines an association between Amazon Kinesis Data Firehose destinations and a web ACL resource, for logging from AWS WAF. As part of the association, you can specify parts of the standard logging fields to keep out of the logs.
    */
  @js.native
  trait LoggingConfiguration extends js.Object {
    var LogDestinationConfigs: LogDestinationConfigs
    var ResourceArn: ResourceArn
    var ManagedByFirewallManager: js.UndefOr[Boolean]
    var RedactedFields: js.UndefOr[RedactedFields]
  }

  object LoggingConfiguration {
    @inline
    def apply(
        LogDestinationConfigs: LogDestinationConfigs,
        ResourceArn: ResourceArn,
        ManagedByFirewallManager: js.UndefOr[Boolean] = js.undefined,
        RedactedFields: js.UndefOr[RedactedFields] = js.undefined
    ): LoggingConfiguration = {
      val __obj = js.Dynamic.literal(
        "LogDestinationConfigs" -> LogDestinationConfigs.asInstanceOf[js.Any],
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any]
      )

      ManagedByFirewallManager.foreach(__v => __obj.updateDynamic("ManagedByFirewallManager")(__v.asInstanceOf[js.Any]))
      RedactedFields.foreach(__v => __obj.updateDynamic("RedactedFields")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LoggingConfiguration]
    }
  }

  /** '''Note:'''This is the latest version of ```AWS WAF```, named AWS WAFV2, released in November, 2019. For information, including how to migrate your AWS WAF resources from the prior release, see the [[https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html|AWS WAF Developer Guide]].
    * A rule statement used to run the rules that are defined in a managed rule group. To use this, provide the vendor name and the name of the rule group in this statement. You can retrieve the required names by calling <a>ListAvailableManagedRuleGroups</a>.
    * You can't nest a <code>ManagedRuleGroupStatement</code>, for example for use inside a <code>NotStatement</code> or <code>OrStatement</code>. It can only be referenced as a top-level statement within a rule.
    */
  @js.native
  trait ManagedRuleGroupStatement extends js.Object {
    var Name: EntityName
    var VendorName: VendorName
    var ExcludedRules: js.UndefOr[ExcludedRules]
  }

  object ManagedRuleGroupStatement {
    @inline
    def apply(
        Name: EntityName,
        VendorName: VendorName,
        ExcludedRules: js.UndefOr[ExcludedRules] = js.undefined
    ): ManagedRuleGroupStatement = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "VendorName" -> VendorName.asInstanceOf[js.Any]
      )

      ExcludedRules.foreach(__v => __obj.updateDynamic("ExcludedRules")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ManagedRuleGroupStatement]
    }
  }

  /** '''Note:'''This is the latest version of ```AWS WAF```, named AWS WAFV2, released in November, 2019. For information, including how to migrate your AWS WAF resources from the prior release, see the [[https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html|AWS WAF Developer Guide]].
    * High-level information about a managed rule group, returned by <a>ListAvailableManagedRuleGroups</a>. This provides information like the name and vendor name, that you provide when you add a <a>ManagedRuleGroupStatement</a> to a web ACL. Managed rule groups include AWS Managed Rules rule groups, which are free of charge to AWS WAF customers, and AWS Marketplace managed rule groups, which you can subscribe to through AWS Marketplace.
    */
  @js.native
  trait ManagedRuleGroupSummary extends js.Object {
    var Description: js.UndefOr[EntityDescription]
    var Name: js.UndefOr[EntityName]
    var VendorName: js.UndefOr[VendorName]
  }

  object ManagedRuleGroupSummary {
    @inline
    def apply(
        Description: js.UndefOr[EntityDescription] = js.undefined,
        Name: js.UndefOr[EntityName] = js.undefined,
        VendorName: js.UndefOr[VendorName] = js.undefined
    ): ManagedRuleGroupSummary = {
      val __obj = js.Dynamic.literal()
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      VendorName.foreach(__v => __obj.updateDynamic("VendorName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ManagedRuleGroupSummary]
    }
  }

  /** '''Note:'''This is the latest version of ```AWS WAF```, named AWS WAFV2, released in November, 2019. For information, including how to migrate your AWS WAF resources from the prior release, see the [[https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html|AWS WAF Developer Guide]].
    * The HTTP method of a web request. The method indicates the type of operation that the request is asking the origin to perform.
    * This is used only to indicate the web request component for AWS WAF to inspect, in the <a>FieldToMatch</a> specification.
    */
  @js.native
  trait Method extends js.Object

  object Method {
    @inline
    def apply(): Method = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Method]
    }
  }

  /** '''Note:'''This is the latest version of ```AWS WAF```, named AWS WAFV2, released in November, 2019. For information, including how to migrate your AWS WAF resources from the prior release, see the [[https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html|AWS WAF Developer Guide]].
    * Specifies that AWS WAF should do nothing. This is generally used to try out a rule without performing any actions. You set the <code>OverrideAction</code> on the <a>Rule</a>.
    * This is used only in the context of other settings, for example to specify values for <a>RuleAction</a> and web ACL <a>DefaultAction</a>.
    */
  @js.native
  trait NoneAction extends js.Object

  object NoneAction {
    @inline
    def apply(): NoneAction = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NoneAction]
    }
  }

  /** '''Note:'''This is the latest version of ```AWS WAF```, named AWS WAFV2, released in November, 2019. For information, including how to migrate your AWS WAF resources from the prior release, see the [[https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html|AWS WAF Developer Guide]].
    * A logical rule statement used to negate the results of another rule statement. You provide one <a>Statement</a> within the <code>NotStatement</code>.
    */
  @js.native
  trait NotStatement extends js.Object {
    var Statement: Statement
  }

  object NotStatement {
    @inline
    def apply(
        Statement: Statement
    ): NotStatement = {
      val __obj = js.Dynamic.literal(
        "Statement" -> Statement.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[NotStatement]
    }
  }

  /** '''Note:'''This is the latest version of ```AWS WAF```, named AWS WAFV2, released in November, 2019. For information, including how to migrate your AWS WAF resources from the prior release, see the [[https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html|AWS WAF Developer Guide]].
    * A logical rule statement used to combine other rule statements with OR logic. You provide more than one <a>Statement</a> within the <code>OrStatement</code>.
    */
  @js.native
  trait OrStatement extends js.Object {
    var Statements: Statements
  }

  object OrStatement {
    @inline
    def apply(
        Statements: Statements
    ): OrStatement = {
      val __obj = js.Dynamic.literal(
        "Statements" -> Statements.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[OrStatement]
    }
  }

  /** The override action to apply to the rules in a rule group. Used only for rule statements that reference a rule group, like <code>RuleGroupReferenceStatement</code> and <code>ManagedRuleGroupStatement</code>.
    * Set the override action to none to leave the rule actions in effect. Set it to count to only count matches, regardless of the rule action settings.
    * In a <a>Rule</a>, you must specify either this <code>OverrideAction</code> setting or the rule <code>Action</code> setting, but not both:
    * * If the rule statement references a rule group, use this override action setting and not the action setting.
    * * If the rule statement does not reference a rule group, use the rule action setting and not this rule override action setting.
    */
  @js.native
  trait OverrideAction extends js.Object {
    var Count: js.UndefOr[CountAction]
    var None: js.UndefOr[NoneAction]
  }

  object OverrideAction {
    @inline
    def apply(
        Count: js.UndefOr[CountAction] = js.undefined,
        None: js.UndefOr[NoneAction] = js.undefined
    ): OverrideAction = {
      val __obj = js.Dynamic.literal()
      Count.foreach(__v => __obj.updateDynamic("Count")(__v.asInstanceOf[js.Any]))
      None.foreach(__v => __obj.updateDynamic("None")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OverrideAction]
    }
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
  trait PutPermissionPolicyResponse extends js.Object

  object PutPermissionPolicyResponse {
    @inline
    def apply(): PutPermissionPolicyResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PutPermissionPolicyResponse]
    }
  }

  /** '''Note:'''This is the latest version of ```AWS WAF```, named AWS WAFV2, released in November, 2019. For information, including how to migrate your AWS WAF resources from the prior release, see the [[https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html|AWS WAF Developer Guide]].
    * The query string of a web request. This is the part of a URL that appears after a <code>?</code> character, if any.
    * This is used only to indicate the web request component for AWS WAF to inspect, in the <a>FieldToMatch</a> specification.
    */
  @js.native
  trait QueryString extends js.Object

  object QueryString {
    @inline
    def apply(): QueryString = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[QueryString]
    }
  }

  /** '''Note:'''This is the latest version of ```AWS WAF```, named AWS WAFV2, released in November, 2019. For information, including how to migrate your AWS WAF resources from the prior release, see the [[https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html|AWS WAF Developer Guide]].
    * A rate-based rule tracks the rate of requests for each originating IP address, and triggers the rule action when the rate exceeds a limit that you specify on the number of requests in any 5-minute time span. You can use this to put a temporary block on requests from an IP address that is sending excessive requests.
    * When the rule action triggers, AWS WAF blocks additional requests from the IP address until the request rate falls below the limit.
    * You can optionally nest another statement inside the rate-based statement, to narrow the scope of the rule so that it only counts requests that match the nested statement. For example, based on recent requests that you have seen from an attacker, you might create a rate-based rule with a nested AND rule statement that contains the following nested statements:
    * * An IP match statement with an IP set that specified the address 192.0.2.44.
    * * A string match statement that searches in the User-Agent header for the string BadBot.
    * In this rate-based rule, you also define a rate limit. For this example, the rate limit is 1,000. Requests that meet both of the conditions in the statements are counted. If the count exceeds 1,000 requests per five minutes, the rule action triggers. Requests that do not meet both conditions are not counted towards the rate limit and are not affected by this rule.
    * You cannot nest a <code>RateBasedStatement</code>, for example for use inside a <code>NotStatement</code> or <code>OrStatement</code>. It can only be referenced as a top-level statement within a rule.
    */
  @js.native
  trait RateBasedStatement extends js.Object {
    var AggregateKeyType: RateBasedStatementAggregateKeyType
    var Limit: RateLimit
    var ForwardedIPConfig: js.UndefOr[ForwardedIPConfig]
    var ScopeDownStatement: js.UndefOr[Statement]
  }

  object RateBasedStatement {
    @inline
    def apply(
        AggregateKeyType: RateBasedStatementAggregateKeyType,
        Limit: RateLimit,
        ForwardedIPConfig: js.UndefOr[ForwardedIPConfig] = js.undefined,
        ScopeDownStatement: js.UndefOr[Statement] = js.undefined
    ): RateBasedStatement = {
      val __obj = js.Dynamic.literal(
        "AggregateKeyType" -> AggregateKeyType.asInstanceOf[js.Any],
        "Limit" -> Limit.asInstanceOf[js.Any]
      )

      ForwardedIPConfig.foreach(__v => __obj.updateDynamic("ForwardedIPConfig")(__v.asInstanceOf[js.Any]))
      ScopeDownStatement.foreach(__v => __obj.updateDynamic("ScopeDownStatement")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RateBasedStatement]
    }
  }

  @js.native
  sealed trait RateBasedStatementAggregateKeyType extends js.Any
  object RateBasedStatementAggregateKeyType {
    val IP = "IP".asInstanceOf[RateBasedStatementAggregateKeyType]
    val FORWARDED_IP = "FORWARDED_IP".asInstanceOf[RateBasedStatementAggregateKeyType]

    @inline def values = js.Array(IP, FORWARDED_IP)
  }

  /** '''Note:'''This is the latest version of ```AWS WAF```, named AWS WAFV2, released in November, 2019. For information, including how to migrate your AWS WAF resources from the prior release, see the [[https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html|AWS WAF Developer Guide]].
    * The set of IP addresses that are currently blocked for a rate-based statement.
    */
  @js.native
  trait RateBasedStatementManagedKeysIPSet extends js.Object {
    var Addresses: js.UndefOr[IPAddresses]
    var IPAddressVersion: js.UndefOr[IPAddressVersion]
  }

  object RateBasedStatementManagedKeysIPSet {
    @inline
    def apply(
        Addresses: js.UndefOr[IPAddresses] = js.undefined,
        IPAddressVersion: js.UndefOr[IPAddressVersion] = js.undefined
    ): RateBasedStatementManagedKeysIPSet = {
      val __obj = js.Dynamic.literal()
      Addresses.foreach(__v => __obj.updateDynamic("Addresses")(__v.asInstanceOf[js.Any]))
      IPAddressVersion.foreach(__v => __obj.updateDynamic("IPAddressVersion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RateBasedStatementManagedKeysIPSet]
    }
  }

  /** '''Note:'''This is the latest version of ```AWS WAF```, named AWS WAFV2, released in November, 2019. For information, including how to migrate your AWS WAF resources from the prior release, see the [[https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html|AWS WAF Developer Guide]].
    * A single regular expression. This is used in a <a>RegexPatternSet</a>.
    */
  @js.native
  trait Regex extends js.Object {
    var RegexString: js.UndefOr[RegexPatternString]
  }

  object Regex {
    @inline
    def apply(
        RegexString: js.UndefOr[RegexPatternString] = js.undefined
    ): Regex = {
      val __obj = js.Dynamic.literal()
      RegexString.foreach(__v => __obj.updateDynamic("RegexString")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Regex]
    }
  }

  /** '''Note:'''This is the latest version of ```AWS WAF```, named AWS WAFV2, released in November, 2019. For information, including how to migrate your AWS WAF resources from the prior release, see the [[https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html|AWS WAF Developer Guide]].
    * Contains one or more regular expressions.
    * AWS WAF assigns an ARN to each <code>RegexPatternSet</code> that you create. To use a set in a rule, you provide the ARN to the <a>Rule</a> statement <a>RegexPatternSetReferenceStatement</a>.
    */
  @js.native
  trait RegexPatternSet extends js.Object {
    var ARN: js.UndefOr[ResourceArn]
    var Description: js.UndefOr[EntityDescription]
    var Id: js.UndefOr[EntityId]
    var Name: js.UndefOr[EntityName]
    var RegularExpressionList: js.UndefOr[RegularExpressionList]
  }

  object RegexPatternSet {
    @inline
    def apply(
        ARN: js.UndefOr[ResourceArn] = js.undefined,
        Description: js.UndefOr[EntityDescription] = js.undefined,
        Id: js.UndefOr[EntityId] = js.undefined,
        Name: js.UndefOr[EntityName] = js.undefined,
        RegularExpressionList: js.UndefOr[RegularExpressionList] = js.undefined
    ): RegexPatternSet = {
      val __obj = js.Dynamic.literal()
      ARN.foreach(__v => __obj.updateDynamic("ARN")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      RegularExpressionList.foreach(__v => __obj.updateDynamic("RegularExpressionList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RegexPatternSet]
    }
  }

  /** '''Note:'''This is the latest version of ```AWS WAF```, named AWS WAFV2, released in November, 2019. For information, including how to migrate your AWS WAF resources from the prior release, see the [[https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html|AWS WAF Developer Guide]].
    * A rule statement used to search web request components for matches with regular expressions. To use this, create a <a>RegexPatternSet</a> that specifies the expressions that you want to detect, then use the ARN of that set in this statement. A web request matches the pattern set rule statement if the request component matches any of the patterns in the set. To create a regex pattern set, see <a>CreateRegexPatternSet</a>.
    * Each regex pattern set rule statement references a regex pattern set. You create and maintain the set independent of your rules. This allows you to use the single set in multiple rules. When you update the referenced set, AWS WAF automatically updates all rules that reference it.
    */
  @js.native
  trait RegexPatternSetReferenceStatement extends js.Object {
    var ARN: ResourceArn
    var FieldToMatch: FieldToMatch
    var TextTransformations: TextTransformations
  }

  object RegexPatternSetReferenceStatement {
    @inline
    def apply(
        ARN: ResourceArn,
        FieldToMatch: FieldToMatch,
        TextTransformations: TextTransformations
    ): RegexPatternSetReferenceStatement = {
      val __obj = js.Dynamic.literal(
        "ARN" -> ARN.asInstanceOf[js.Any],
        "FieldToMatch" -> FieldToMatch.asInstanceOf[js.Any],
        "TextTransformations" -> TextTransformations.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[RegexPatternSetReferenceStatement]
    }
  }

  /** '''Note:'''This is the latest version of ```AWS WAF```, named AWS WAFV2, released in November, 2019. For information, including how to migrate your AWS WAF resources from the prior release, see the [[https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html|AWS WAF Developer Guide]].
    * High-level information about a <a>RegexPatternSet</a>, returned by operations like create and list. This provides information like the ID, that you can use to retrieve and manage a <code>RegexPatternSet</code>, and the ARN, that you provide to the <a>RegexPatternSetReferenceStatement</a> to use the pattern set in a <a>Rule</a>.
    */
  @js.native
  trait RegexPatternSetSummary extends js.Object {
    var ARN: js.UndefOr[ResourceArn]
    var Description: js.UndefOr[EntityDescription]
    var Id: js.UndefOr[EntityId]
    var LockToken: js.UndefOr[LockToken]
    var Name: js.UndefOr[EntityName]
  }

  object RegexPatternSetSummary {
    @inline
    def apply(
        ARN: js.UndefOr[ResourceArn] = js.undefined,
        Description: js.UndefOr[EntityDescription] = js.undefined,
        Id: js.UndefOr[EntityId] = js.undefined,
        LockToken: js.UndefOr[LockToken] = js.undefined,
        Name: js.UndefOr[EntityName] = js.undefined
    ): RegexPatternSetSummary = {
      val __obj = js.Dynamic.literal()
      ARN.foreach(__v => __obj.updateDynamic("ARN")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      LockToken.foreach(__v => __obj.updateDynamic("LockToken")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RegexPatternSetSummary]
    }
  }

  @js.native
  sealed trait ResourceType extends js.Any
  object ResourceType {
    val APPLICATION_LOAD_BALANCER = "APPLICATION_LOAD_BALANCER".asInstanceOf[ResourceType]
    val API_GATEWAY = "API_GATEWAY".asInstanceOf[ResourceType]

    @inline def values = js.Array(APPLICATION_LOAD_BALANCER, API_GATEWAY)
  }

  /** '''Note:'''This is the latest version of ```AWS WAF```, named AWS WAFV2, released in November, 2019. For information, including how to migrate your AWS WAF resources from the prior release, see the [[https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html|AWS WAF Developer Guide]].
    * A single rule, which you can use in a <a>WebACL</a> or <a>RuleGroup</a> to identify web requests that you want to allow, block, or count. Each rule includes one top-level <a>Statement</a> that AWS WAF uses to identify matching web requests, and parameters that govern how AWS WAF handles them.
    */
  @js.native
  trait Rule extends js.Object {
    var Name: EntityName
    var Priority: RulePriority
    var Statement: Statement
    var VisibilityConfig: VisibilityConfig
    var Action: js.UndefOr[RuleAction]
    var OverrideAction: js.UndefOr[OverrideAction]
  }

  object Rule {
    @inline
    def apply(
        Name: EntityName,
        Priority: RulePriority,
        Statement: Statement,
        VisibilityConfig: VisibilityConfig,
        Action: js.UndefOr[RuleAction] = js.undefined,
        OverrideAction: js.UndefOr[OverrideAction] = js.undefined
    ): Rule = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "Priority" -> Priority.asInstanceOf[js.Any],
        "Statement" -> Statement.asInstanceOf[js.Any],
        "VisibilityConfig" -> VisibilityConfig.asInstanceOf[js.Any]
      )

      Action.foreach(__v => __obj.updateDynamic("Action")(__v.asInstanceOf[js.Any]))
      OverrideAction.foreach(__v => __obj.updateDynamic("OverrideAction")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Rule]
    }
  }

  /** '''Note:'''This is the latest version of ```AWS WAF```, named AWS WAFV2, released in November, 2019. For information, including how to migrate your AWS WAF resources from the prior release, see the [[https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html|AWS WAF Developer Guide]].
    * The action that AWS WAF should take on a web request when it matches a rule's statement. Settings at the web ACL level can override the rule action setting.
    */
  @js.native
  trait RuleAction extends js.Object {
    var Allow: js.UndefOr[AllowAction]
    var Block: js.UndefOr[BlockAction]
    var Count: js.UndefOr[CountAction]
  }

  object RuleAction {
    @inline
    def apply(
        Allow: js.UndefOr[AllowAction] = js.undefined,
        Block: js.UndefOr[BlockAction] = js.undefined,
        Count: js.UndefOr[CountAction] = js.undefined
    ): RuleAction = {
      val __obj = js.Dynamic.literal()
      Allow.foreach(__v => __obj.updateDynamic("Allow")(__v.asInstanceOf[js.Any]))
      Block.foreach(__v => __obj.updateDynamic("Block")(__v.asInstanceOf[js.Any]))
      Count.foreach(__v => __obj.updateDynamic("Count")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RuleAction]
    }
  }

  /** '''Note:'''This is the latest version of ```AWS WAF```, named AWS WAFV2, released in November, 2019. For information, including how to migrate your AWS WAF resources from the prior release, see the [[https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html|AWS WAF Developer Guide]].
    * A rule group defines a collection of rules to inspect and control web requests that you can use in a <a>WebACL</a>. When you create a rule group, you define an immutable capacity limit. If you update a rule group, you must stay within the capacity. This allows others to reuse the rule group with confidence in its capacity requirements.
    */
  @js.native
  trait RuleGroup extends js.Object {
    var ARN: ResourceArn
    var Capacity: CapacityUnit
    var Id: EntityId
    var Name: EntityName
    var VisibilityConfig: VisibilityConfig
    var Description: js.UndefOr[EntityDescription]
    var Rules: js.UndefOr[Rules]
  }

  object RuleGroup {
    @inline
    def apply(
        ARN: ResourceArn,
        Capacity: CapacityUnit,
        Id: EntityId,
        Name: EntityName,
        VisibilityConfig: VisibilityConfig,
        Description: js.UndefOr[EntityDescription] = js.undefined,
        Rules: js.UndefOr[Rules] = js.undefined
    ): RuleGroup = {
      val __obj = js.Dynamic.literal(
        "ARN" -> ARN.asInstanceOf[js.Any],
        "Capacity" -> Capacity.asInstanceOf[js.Any],
        "Id" -> Id.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
        "VisibilityConfig" -> VisibilityConfig.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Rules.foreach(__v => __obj.updateDynamic("Rules")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RuleGroup]
    }
  }

  /** '''Note:'''This is the latest version of ```AWS WAF```, named AWS WAFV2, released in November, 2019. For information, including how to migrate your AWS WAF resources from the prior release, see the [[https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html|AWS WAF Developer Guide]].
    * A rule statement used to run the rules that are defined in a <a>RuleGroup</a>. To use this, create a rule group with your rules, then provide the ARN of the rule group in this statement.
    * You cannot nest a <code>RuleGroupReferenceStatement</code>, for example for use inside a <code>NotStatement</code> or <code>OrStatement</code>. It can only be referenced as a top-level statement within a rule.
    */
  @js.native
  trait RuleGroupReferenceStatement extends js.Object {
    var ARN: ResourceArn
    var ExcludedRules: js.UndefOr[ExcludedRules]
  }

  object RuleGroupReferenceStatement {
    @inline
    def apply(
        ARN: ResourceArn,
        ExcludedRules: js.UndefOr[ExcludedRules] = js.undefined
    ): RuleGroupReferenceStatement = {
      val __obj = js.Dynamic.literal(
        "ARN" -> ARN.asInstanceOf[js.Any]
      )

      ExcludedRules.foreach(__v => __obj.updateDynamic("ExcludedRules")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RuleGroupReferenceStatement]
    }
  }

  /** '''Note:'''This is the latest version of ```AWS WAF```, named AWS WAFV2, released in November, 2019. For information, including how to migrate your AWS WAF resources from the prior release, see the [[https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html|AWS WAF Developer Guide]].
    * High-level information about a <a>RuleGroup</a>, returned by operations like create and list. This provides information like the ID, that you can use to retrieve and manage a <code>RuleGroup</code>, and the ARN, that you provide to the <a>RuleGroupReferenceStatement</a> to use the rule group in a <a>Rule</a>.
    */
  @js.native
  trait RuleGroupSummary extends js.Object {
    var ARN: js.UndefOr[ResourceArn]
    var Description: js.UndefOr[EntityDescription]
    var Id: js.UndefOr[EntityId]
    var LockToken: js.UndefOr[LockToken]
    var Name: js.UndefOr[EntityName]
  }

  object RuleGroupSummary {
    @inline
    def apply(
        ARN: js.UndefOr[ResourceArn] = js.undefined,
        Description: js.UndefOr[EntityDescription] = js.undefined,
        Id: js.UndefOr[EntityId] = js.undefined,
        LockToken: js.UndefOr[LockToken] = js.undefined,
        Name: js.UndefOr[EntityName] = js.undefined
    ): RuleGroupSummary = {
      val __obj = js.Dynamic.literal()
      ARN.foreach(__v => __obj.updateDynamic("ARN")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      LockToken.foreach(__v => __obj.updateDynamic("LockToken")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RuleGroupSummary]
    }
  }

  /** '''Note:'''This is the latest version of ```AWS WAF```, named AWS WAFV2, released in November, 2019. For information, including how to migrate your AWS WAF resources from the prior release, see the [[https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html|AWS WAF Developer Guide]].
    * High-level information about a <a>Rule</a>, returned by operations like <a>DescribeManagedRuleGroup</a>. This provides information like the ID, that you can use to retrieve and manage a <code>RuleGroup</code>, and the ARN, that you provide to the <a>RuleGroupReferenceStatement</a> to use the rule group in a <a>Rule</a>.
    */
  @js.native
  trait RuleSummary extends js.Object {
    var Action: js.UndefOr[RuleAction]
    var Name: js.UndefOr[EntityName]
  }

  object RuleSummary {
    @inline
    def apply(
        Action: js.UndefOr[RuleAction] = js.undefined,
        Name: js.UndefOr[EntityName] = js.undefined
    ): RuleSummary = {
      val __obj = js.Dynamic.literal()
      Action.foreach(__v => __obj.updateDynamic("Action")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RuleSummary]
    }
  }

  /** '''Note:'''This is the latest version of ```AWS WAF```, named AWS WAFV2, released in November, 2019. For information, including how to migrate your AWS WAF resources from the prior release, see the [[https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html|AWS WAF Developer Guide]].
    * Represents a single sampled web request. The response from <a>GetSampledRequests</a> includes a <code>SampledHTTPRequests</code> complex type that appears as <code>SampledRequests</code> in the response syntax. <code>SampledHTTPRequests</code> contains an array of <code>SampledHTTPRequest</code> objects.
    */
  @js.native
  trait SampledHTTPRequest extends js.Object {
    var Request: HTTPRequest
    var Weight: SampleWeight
    var Action: js.UndefOr[Action]
    var RuleNameWithinRuleGroup: js.UndefOr[EntityName]
    var Timestamp: js.UndefOr[Timestamp]
  }

  object SampledHTTPRequest {
    @inline
    def apply(
        Request: HTTPRequest,
        Weight: SampleWeight,
        Action: js.UndefOr[Action] = js.undefined,
        RuleNameWithinRuleGroup: js.UndefOr[EntityName] = js.undefined,
        Timestamp: js.UndefOr[Timestamp] = js.undefined
    ): SampledHTTPRequest = {
      val __obj = js.Dynamic.literal(
        "Request" -> Request.asInstanceOf[js.Any],
        "Weight" -> Weight.asInstanceOf[js.Any]
      )

      Action.foreach(__v => __obj.updateDynamic("Action")(__v.asInstanceOf[js.Any]))
      RuleNameWithinRuleGroup.foreach(__v => __obj.updateDynamic("RuleNameWithinRuleGroup")(__v.asInstanceOf[js.Any]))
      Timestamp.foreach(__v => __obj.updateDynamic("Timestamp")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SampledHTTPRequest]
    }
  }

  @js.native
  sealed trait Scope extends js.Any
  object Scope {
    val CLOUDFRONT = "CLOUDFRONT".asInstanceOf[Scope]
    val REGIONAL = "REGIONAL".asInstanceOf[Scope]

    @inline def values = js.Array(CLOUDFRONT, REGIONAL)
  }

  /** '''Note:'''This is the latest version of ```AWS WAF```, named AWS WAFV2, released in November, 2019. For information, including how to migrate your AWS WAF resources from the prior release, see the [[https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html|AWS WAF Developer Guide]].
    * One of the headers in a web request, identified by name, for example, <code>User-Agent</code> or <code>Referer</code>. This setting isn't case sensitive.
    * This is used only to indicate the web request component for AWS WAF to inspect, in the <a>FieldToMatch</a> specification.
    */
  @js.native
  trait SingleHeader extends js.Object {
    var Name: FieldToMatchData
  }

  object SingleHeader {
    @inline
    def apply(
        Name: FieldToMatchData
    ): SingleHeader = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[SingleHeader]
    }
  }

  /** '''Note:'''This is the latest version of ```AWS WAF```, named AWS WAFV2, released in November, 2019. For information, including how to migrate your AWS WAF resources from the prior release, see the [[https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html|AWS WAF Developer Guide]].
    * One query argument in a web request, identified by name, for example <i>UserName</i> or <i>SalesRegion</i>. The name can be up to 30 characters long and isn't case sensitive.
    */
  @js.native
  trait SingleQueryArgument extends js.Object {
    var Name: FieldToMatchData
  }

  object SingleQueryArgument {
    @inline
    def apply(
        Name: FieldToMatchData
    ): SingleQueryArgument = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[SingleQueryArgument]
    }
  }

  /** '''Note:'''This is the latest version of ```AWS WAF```, named AWS WAFV2, released in November, 2019. For information, including how to migrate your AWS WAF resources from the prior release, see the [[https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html|AWS WAF Developer Guide]].
    * A rule statement that compares a number of bytes against the size of a request component, using a comparison operator, such as greater than (&gt;) or less than (&lt;). For example, you can use a size constraint statement to look for query strings that are longer than 100 bytes.
    * If you configure AWS WAF to inspect the request body, AWS WAF inspects only the first 8192 bytes (8 KB). If the request body for your web requests never exceeds 8192 bytes, you can create a size constraint condition and block requests that have a request body greater than 8192 bytes.
    * If you choose URI for the value of Part of the request to filter on, the slash (/) in the URI counts as one character. For example, the URI <code>/logo.jpg</code> is nine characters long.
    */
  @js.native
  trait SizeConstraintStatement extends js.Object {
    var ComparisonOperator: ComparisonOperator
    var FieldToMatch: FieldToMatch
    var Size: Size
    var TextTransformations: TextTransformations
  }

  object SizeConstraintStatement {
    @inline
    def apply(
        ComparisonOperator: ComparisonOperator,
        FieldToMatch: FieldToMatch,
        Size: Size,
        TextTransformations: TextTransformations
    ): SizeConstraintStatement = {
      val __obj = js.Dynamic.literal(
        "ComparisonOperator" -> ComparisonOperator.asInstanceOf[js.Any],
        "FieldToMatch" -> FieldToMatch.asInstanceOf[js.Any],
        "Size" -> Size.asInstanceOf[js.Any],
        "TextTransformations" -> TextTransformations.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[SizeConstraintStatement]
    }
  }

  /** '''Note:'''This is the latest version of ```AWS WAF```, named AWS WAFV2, released in November, 2019. For information, including how to migrate your AWS WAF resources from the prior release, see the [[https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html|AWS WAF Developer Guide]].
    * Attackers sometimes insert malicious SQL code into web requests in an effort to extract data from your database. To allow or block web requests that appear to contain malicious SQL code, create one or more SQL injection match conditions. An SQL injection match condition identifies the part of web requests, such as the URI or the query string, that you want AWS WAF to inspect. Later in the process, when you create a web ACL, you specify whether to allow or block requests that appear to contain malicious SQL code.
    */
  @js.native
  trait SqliMatchStatement extends js.Object {
    var FieldToMatch: FieldToMatch
    var TextTransformations: TextTransformations
  }

  object SqliMatchStatement {
    @inline
    def apply(
        FieldToMatch: FieldToMatch,
        TextTransformations: TextTransformations
    ): SqliMatchStatement = {
      val __obj = js.Dynamic.literal(
        "FieldToMatch" -> FieldToMatch.asInstanceOf[js.Any],
        "TextTransformations" -> TextTransformations.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[SqliMatchStatement]
    }
  }

  /** '''Note:'''This is the latest version of ```AWS WAF```, named AWS WAFV2, released in November, 2019. For information, including how to migrate your AWS WAF resources from the prior release, see the [[https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html|AWS WAF Developer Guide]].
    * The processing guidance for a <a>Rule</a>, used by AWS WAF to determine whether a web request matches the rule.
    */
  @js.native
  trait Statement extends js.Object {
    var AndStatement: js.UndefOr[AndStatement]
    var ByteMatchStatement: js.UndefOr[ByteMatchStatement]
    var GeoMatchStatement: js.UndefOr[GeoMatchStatement]
    var IPSetReferenceStatement: js.UndefOr[IPSetReferenceStatement]
    var ManagedRuleGroupStatement: js.UndefOr[ManagedRuleGroupStatement]
    var NotStatement: js.UndefOr[NotStatement]
    var OrStatement: js.UndefOr[OrStatement]
    var RateBasedStatement: js.UndefOr[RateBasedStatement]
    var RegexPatternSetReferenceStatement: js.UndefOr[RegexPatternSetReferenceStatement]
    var RuleGroupReferenceStatement: js.UndefOr[RuleGroupReferenceStatement]
    var SizeConstraintStatement: js.UndefOr[SizeConstraintStatement]
    var SqliMatchStatement: js.UndefOr[SqliMatchStatement]
    var XssMatchStatement: js.UndefOr[XssMatchStatement]
  }

  object Statement {
    @inline
    def apply(
        AndStatement: js.UndefOr[AndStatement] = js.undefined,
        ByteMatchStatement: js.UndefOr[ByteMatchStatement] = js.undefined,
        GeoMatchStatement: js.UndefOr[GeoMatchStatement] = js.undefined,
        IPSetReferenceStatement: js.UndefOr[IPSetReferenceStatement] = js.undefined,
        ManagedRuleGroupStatement: js.UndefOr[ManagedRuleGroupStatement] = js.undefined,
        NotStatement: js.UndefOr[NotStatement] = js.undefined,
        OrStatement: js.UndefOr[OrStatement] = js.undefined,
        RateBasedStatement: js.UndefOr[RateBasedStatement] = js.undefined,
        RegexPatternSetReferenceStatement: js.UndefOr[RegexPatternSetReferenceStatement] = js.undefined,
        RuleGroupReferenceStatement: js.UndefOr[RuleGroupReferenceStatement] = js.undefined,
        SizeConstraintStatement: js.UndefOr[SizeConstraintStatement] = js.undefined,
        SqliMatchStatement: js.UndefOr[SqliMatchStatement] = js.undefined,
        XssMatchStatement: js.UndefOr[XssMatchStatement] = js.undefined
    ): Statement = {
      val __obj = js.Dynamic.literal()
      AndStatement.foreach(__v => __obj.updateDynamic("AndStatement")(__v.asInstanceOf[js.Any]))
      ByteMatchStatement.foreach(__v => __obj.updateDynamic("ByteMatchStatement")(__v.asInstanceOf[js.Any]))
      GeoMatchStatement.foreach(__v => __obj.updateDynamic("GeoMatchStatement")(__v.asInstanceOf[js.Any]))
      IPSetReferenceStatement.foreach(__v => __obj.updateDynamic("IPSetReferenceStatement")(__v.asInstanceOf[js.Any]))
      ManagedRuleGroupStatement.foreach(__v => __obj.updateDynamic("ManagedRuleGroupStatement")(__v.asInstanceOf[js.Any]))
      NotStatement.foreach(__v => __obj.updateDynamic("NotStatement")(__v.asInstanceOf[js.Any]))
      OrStatement.foreach(__v => __obj.updateDynamic("OrStatement")(__v.asInstanceOf[js.Any]))
      RateBasedStatement.foreach(__v => __obj.updateDynamic("RateBasedStatement")(__v.asInstanceOf[js.Any]))
      RegexPatternSetReferenceStatement.foreach(__v => __obj.updateDynamic("RegexPatternSetReferenceStatement")(__v.asInstanceOf[js.Any]))
      RuleGroupReferenceStatement.foreach(__v => __obj.updateDynamic("RuleGroupReferenceStatement")(__v.asInstanceOf[js.Any]))
      SizeConstraintStatement.foreach(__v => __obj.updateDynamic("SizeConstraintStatement")(__v.asInstanceOf[js.Any]))
      SqliMatchStatement.foreach(__v => __obj.updateDynamic("SqliMatchStatement")(__v.asInstanceOf[js.Any]))
      XssMatchStatement.foreach(__v => __obj.updateDynamic("XssMatchStatement")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Statement]
    }
  }

  /** '''Note:'''This is the latest version of ```AWS WAF```, named AWS WAFV2, released in November, 2019. For information, including how to migrate your AWS WAF resources from the prior release, see the [[https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html|AWS WAF Developer Guide]].
    * A tag associated with an AWS resource. Tags are key:value pairs that you can use to categorize and manage your resources, for purposes like billing or other management. Typically, the tag key represents a category, such as "environment", and the tag value represents a specific value within that category, such as "test," "development," or "production". Or you might set the tag key to "customer" and the value to the customer name or ID. You can specify one or more tags to add to each AWS resource, up to 50 tags for a resource.
    * You can tag the AWS resources that you manage through AWS WAF: web ACLs, rule groups, IP sets, and regex pattern sets. You can't manage or view tags through the AWS WAF console.
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

  /** '''Note:'''This is the latest version of ```AWS WAF```, named AWS WAFV2, released in November, 2019. For information, including how to migrate your AWS WAF resources from the prior release, see the [[https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html|AWS WAF Developer Guide]].
    * The collection of tagging definitions for an AWS resource. Tags are key:value pairs that you can use to categorize and manage your resources, for purposes like billing or other management. Typically, the tag key represents a category, such as "environment", and the tag value represents a specific value within that category, such as "test," "development," or "production". Or you might set the tag key to "customer" and the value to the customer name or ID. You can specify one or more tags to add to each AWS resource, up to 50 tags for a resource.
    * You can tag the AWS resources that you manage through AWS WAF: web ACLs, rule groups, IP sets, and regex pattern sets. You can't manage or view tags through the AWS WAF console.
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
  trait TagResourceResponse extends js.Object

  object TagResourceResponse {
    @inline
    def apply(): TagResourceResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TagResourceResponse]
    }
  }

  /** '''Note:'''This is the latest version of ```AWS WAF```, named AWS WAFV2, released in November, 2019. For information, including how to migrate your AWS WAF resources from the prior release, see the [[https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html|AWS WAF Developer Guide]].
    * Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection.
    */
  @js.native
  trait TextTransformation extends js.Object {
    var Priority: TextTransformationPriority
    var Type: TextTransformationType
  }

  object TextTransformation {
    @inline
    def apply(
        Priority: TextTransformationPriority,
        Type: TextTransformationType
    ): TextTransformation = {
      val __obj = js.Dynamic.literal(
        "Priority" -> Priority.asInstanceOf[js.Any],
        "Type" -> Type.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[TextTransformation]
    }
  }

  @js.native
  sealed trait TextTransformationType extends js.Any
  object TextTransformationType {
    val NONE = "NONE".asInstanceOf[TextTransformationType]
    val COMPRESS_WHITE_SPACE = "COMPRESS_WHITE_SPACE".asInstanceOf[TextTransformationType]
    val HTML_ENTITY_DECODE = "HTML_ENTITY_DECODE".asInstanceOf[TextTransformationType]
    val LOWERCASE = "LOWERCASE".asInstanceOf[TextTransformationType]
    val CMD_LINE = "CMD_LINE".asInstanceOf[TextTransformationType]
    val URL_DECODE = "URL_DECODE".asInstanceOf[TextTransformationType]

    @inline def values = js.Array(NONE, COMPRESS_WHITE_SPACE, HTML_ENTITY_DECODE, LOWERCASE, CMD_LINE, URL_DECODE)
  }

  /** '''Note:'''This is the latest version of ```AWS WAF```, named AWS WAFV2, released in November, 2019. For information, including how to migrate your AWS WAF resources from the prior release, see the [[https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html|AWS WAF Developer Guide]].
    * In a <a>GetSampledRequests</a> request, the <code>StartTime</code> and <code>EndTime</code> objects specify the time range for which you want AWS WAF to return a sample of web requests.
    * You must specify the times in Coordinated Universal Time (UTC) format. UTC format includes the special designator, <code>Z</code>. For example, <code>"2016-09-27T14:50Z"</code>. You can specify any time range in the previous three hours.
    * In a <a>GetSampledRequests</a> response, the <code>StartTime</code> and <code>EndTime</code> objects specify the time range for which AWS WAF actually returned a sample of web requests. AWS WAF gets the specified number of requests from among the first 5,000 requests that your AWS resource receives during the specified time period. If your resource receives more than 5,000 requests during that period, AWS WAF stops sampling after the 5,000th request. In that case, <code>EndTime</code> is the time that AWS WAF received the 5,000th request.
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
  trait UntagResourceResponse extends js.Object

  object UntagResourceResponse {
    @inline
    def apply(): UntagResourceResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UntagResourceResponse]
    }
  }

  @js.native
  trait UpdateIPSetRequest extends js.Object {
    var Addresses: IPAddresses
    var Id: EntityId
    var LockToken: LockToken
    var Name: EntityName
    var Scope: Scope
    var Description: js.UndefOr[EntityDescription]
  }

  object UpdateIPSetRequest {
    @inline
    def apply(
        Addresses: IPAddresses,
        Id: EntityId,
        LockToken: LockToken,
        Name: EntityName,
        Scope: Scope,
        Description: js.UndefOr[EntityDescription] = js.undefined
    ): UpdateIPSetRequest = {
      val __obj = js.Dynamic.literal(
        "Addresses" -> Addresses.asInstanceOf[js.Any],
        "Id" -> Id.asInstanceOf[js.Any],
        "LockToken" -> LockToken.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
        "Scope" -> Scope.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateIPSetRequest]
    }
  }

  @js.native
  trait UpdateIPSetResponse extends js.Object {
    var NextLockToken: js.UndefOr[LockToken]
  }

  object UpdateIPSetResponse {
    @inline
    def apply(
        NextLockToken: js.UndefOr[LockToken] = js.undefined
    ): UpdateIPSetResponse = {
      val __obj = js.Dynamic.literal()
      NextLockToken.foreach(__v => __obj.updateDynamic("NextLockToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateIPSetResponse]
    }
  }

  @js.native
  trait UpdateRegexPatternSetRequest extends js.Object {
    var Id: EntityId
    var LockToken: LockToken
    var Name: EntityName
    var RegularExpressionList: RegularExpressionList
    var Scope: Scope
    var Description: js.UndefOr[EntityDescription]
  }

  object UpdateRegexPatternSetRequest {
    @inline
    def apply(
        Id: EntityId,
        LockToken: LockToken,
        Name: EntityName,
        RegularExpressionList: RegularExpressionList,
        Scope: Scope,
        Description: js.UndefOr[EntityDescription] = js.undefined
    ): UpdateRegexPatternSetRequest = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any],
        "LockToken" -> LockToken.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
        "RegularExpressionList" -> RegularExpressionList.asInstanceOf[js.Any],
        "Scope" -> Scope.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateRegexPatternSetRequest]
    }
  }

  @js.native
  trait UpdateRegexPatternSetResponse extends js.Object {
    var NextLockToken: js.UndefOr[LockToken]
  }

  object UpdateRegexPatternSetResponse {
    @inline
    def apply(
        NextLockToken: js.UndefOr[LockToken] = js.undefined
    ): UpdateRegexPatternSetResponse = {
      val __obj = js.Dynamic.literal()
      NextLockToken.foreach(__v => __obj.updateDynamic("NextLockToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateRegexPatternSetResponse]
    }
  }

  @js.native
  trait UpdateRuleGroupRequest extends js.Object {
    var Id: EntityId
    var LockToken: LockToken
    var Name: EntityName
    var Scope: Scope
    var VisibilityConfig: VisibilityConfig
    var Description: js.UndefOr[EntityDescription]
    var Rules: js.UndefOr[Rules]
  }

  object UpdateRuleGroupRequest {
    @inline
    def apply(
        Id: EntityId,
        LockToken: LockToken,
        Name: EntityName,
        Scope: Scope,
        VisibilityConfig: VisibilityConfig,
        Description: js.UndefOr[EntityDescription] = js.undefined,
        Rules: js.UndefOr[Rules] = js.undefined
    ): UpdateRuleGroupRequest = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any],
        "LockToken" -> LockToken.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
        "Scope" -> Scope.asInstanceOf[js.Any],
        "VisibilityConfig" -> VisibilityConfig.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Rules.foreach(__v => __obj.updateDynamic("Rules")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateRuleGroupRequest]
    }
  }

  @js.native
  trait UpdateRuleGroupResponse extends js.Object {
    var NextLockToken: js.UndefOr[LockToken]
  }

  object UpdateRuleGroupResponse {
    @inline
    def apply(
        NextLockToken: js.UndefOr[LockToken] = js.undefined
    ): UpdateRuleGroupResponse = {
      val __obj = js.Dynamic.literal()
      NextLockToken.foreach(__v => __obj.updateDynamic("NextLockToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateRuleGroupResponse]
    }
  }

  @js.native
  trait UpdateWebACLRequest extends js.Object {
    var DefaultAction: DefaultAction
    var Id: EntityId
    var LockToken: LockToken
    var Name: EntityName
    var Scope: Scope
    var VisibilityConfig: VisibilityConfig
    var Description: js.UndefOr[EntityDescription]
    var Rules: js.UndefOr[Rules]
  }

  object UpdateWebACLRequest {
    @inline
    def apply(
        DefaultAction: DefaultAction,
        Id: EntityId,
        LockToken: LockToken,
        Name: EntityName,
        Scope: Scope,
        VisibilityConfig: VisibilityConfig,
        Description: js.UndefOr[EntityDescription] = js.undefined,
        Rules: js.UndefOr[Rules] = js.undefined
    ): UpdateWebACLRequest = {
      val __obj = js.Dynamic.literal(
        "DefaultAction" -> DefaultAction.asInstanceOf[js.Any],
        "Id" -> Id.asInstanceOf[js.Any],
        "LockToken" -> LockToken.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
        "Scope" -> Scope.asInstanceOf[js.Any],
        "VisibilityConfig" -> VisibilityConfig.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Rules.foreach(__v => __obj.updateDynamic("Rules")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateWebACLRequest]
    }
  }

  @js.native
  trait UpdateWebACLResponse extends js.Object {
    var NextLockToken: js.UndefOr[LockToken]
  }

  object UpdateWebACLResponse {
    @inline
    def apply(
        NextLockToken: js.UndefOr[LockToken] = js.undefined
    ): UpdateWebACLResponse = {
      val __obj = js.Dynamic.literal()
      NextLockToken.foreach(__v => __obj.updateDynamic("NextLockToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateWebACLResponse]
    }
  }

  /** '''Note:'''This is the latest version of ```AWS WAF```, named AWS WAFV2, released in November, 2019. For information, including how to migrate your AWS WAF resources from the prior release, see the [[https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html|AWS WAF Developer Guide]].
    * The path component of the URI of a web request. This is the part of a web request that identifies a resource, for example, <code>/images/daily-ad.jpg</code>.
    * This is used only to indicate the web request component for AWS WAF to inspect, in the <a>FieldToMatch</a> specification.
    */
  @js.native
  trait UriPath extends js.Object

  object UriPath {
    @inline
    def apply(): UriPath = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UriPath]
    }
  }

  /** '''Note:'''This is the latest version of ```AWS WAF```, named AWS WAFV2, released in November, 2019. For information, including how to migrate your AWS WAF resources from the prior release, see the [[https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html|AWS WAF Developer Guide]].
    * Defines and enables Amazon CloudWatch metrics and web request sample collection.
    */
  @js.native
  trait VisibilityConfig extends js.Object {
    var CloudWatchMetricsEnabled: Boolean
    var MetricName: MetricName
    var SampledRequestsEnabled: Boolean
  }

  object VisibilityConfig {
    @inline
    def apply(
        CloudWatchMetricsEnabled: Boolean,
        MetricName: MetricName,
        SampledRequestsEnabled: Boolean
    ): VisibilityConfig = {
      val __obj = js.Dynamic.literal(
        "CloudWatchMetricsEnabled" -> CloudWatchMetricsEnabled.asInstanceOf[js.Any],
        "MetricName" -> MetricName.asInstanceOf[js.Any],
        "SampledRequestsEnabled" -> SampledRequestsEnabled.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[VisibilityConfig]
    }
  }

  /** '''Note:'''This is the latest version of ```AWS WAF```, named AWS WAFV2, released in November, 2019. For information, including how to migrate your AWS WAF resources from the prior release, see the [[https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html|AWS WAF Developer Guide]].
    * A Web ACL defines a collection of rules to use to inspect and control web requests. Each rule has an action defined (allow, block, or count) for requests that match the statement of the rule. In the Web ACL, you assign a default action to take (allow, block) for any request that does not match any of the rules. The rules in a Web ACL can be a combination of the types <a>Rule</a>, <a>RuleGroup</a>, and managed rule group. You can associate a Web ACL with one or more AWS resources to protect. The resources can be Amazon CloudFront, an Amazon API Gateway API, or an Application Load Balancer.
    */
  @js.native
  trait WebACL extends js.Object {
    var ARN: ResourceArn
    var DefaultAction: DefaultAction
    var Id: EntityId
    var Name: EntityName
    var VisibilityConfig: VisibilityConfig
    var Capacity: js.UndefOr[ConsumedCapacity]
    var Description: js.UndefOr[EntityDescription]
    var ManagedByFirewallManager: js.UndefOr[Boolean]
    var PostProcessFirewallManagerRuleGroups: js.UndefOr[FirewallManagerRuleGroups]
    var PreProcessFirewallManagerRuleGroups: js.UndefOr[FirewallManagerRuleGroups]
    var Rules: js.UndefOr[Rules]
  }

  object WebACL {
    @inline
    def apply(
        ARN: ResourceArn,
        DefaultAction: DefaultAction,
        Id: EntityId,
        Name: EntityName,
        VisibilityConfig: VisibilityConfig,
        Capacity: js.UndefOr[ConsumedCapacity] = js.undefined,
        Description: js.UndefOr[EntityDescription] = js.undefined,
        ManagedByFirewallManager: js.UndefOr[Boolean] = js.undefined,
        PostProcessFirewallManagerRuleGroups: js.UndefOr[FirewallManagerRuleGroups] = js.undefined,
        PreProcessFirewallManagerRuleGroups: js.UndefOr[FirewallManagerRuleGroups] = js.undefined,
        Rules: js.UndefOr[Rules] = js.undefined
    ): WebACL = {
      val __obj = js.Dynamic.literal(
        "ARN" -> ARN.asInstanceOf[js.Any],
        "DefaultAction" -> DefaultAction.asInstanceOf[js.Any],
        "Id" -> Id.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
        "VisibilityConfig" -> VisibilityConfig.asInstanceOf[js.Any]
      )

      Capacity.foreach(__v => __obj.updateDynamic("Capacity")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      ManagedByFirewallManager.foreach(__v => __obj.updateDynamic("ManagedByFirewallManager")(__v.asInstanceOf[js.Any]))
      PostProcessFirewallManagerRuleGroups.foreach(__v => __obj.updateDynamic("PostProcessFirewallManagerRuleGroups")(__v.asInstanceOf[js.Any]))
      PreProcessFirewallManagerRuleGroups.foreach(__v => __obj.updateDynamic("PreProcessFirewallManagerRuleGroups")(__v.asInstanceOf[js.Any]))
      Rules.foreach(__v => __obj.updateDynamic("Rules")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[WebACL]
    }
  }

  /** '''Note:'''This is the latest version of ```AWS WAF```, named AWS WAFV2, released in November, 2019. For information, including how to migrate your AWS WAF resources from the prior release, see the [[https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html|AWS WAF Developer Guide]].
    * High-level information about a <a>WebACL</a>, returned by operations like create and list. This provides information like the ID, that you can use to retrieve and manage a <code>WebACL</code>, and the ARN, that you provide to operations like <a>AssociateWebACL</a>.
    */
  @js.native
  trait WebACLSummary extends js.Object {
    var ARN: js.UndefOr[ResourceArn]
    var Description: js.UndefOr[EntityDescription]
    var Id: js.UndefOr[EntityId]
    var LockToken: js.UndefOr[LockToken]
    var Name: js.UndefOr[EntityName]
  }

  object WebACLSummary {
    @inline
    def apply(
        ARN: js.UndefOr[ResourceArn] = js.undefined,
        Description: js.UndefOr[EntityDescription] = js.undefined,
        Id: js.UndefOr[EntityId] = js.undefined,
        LockToken: js.UndefOr[LockToken] = js.undefined,
        Name: js.UndefOr[EntityName] = js.undefined
    ): WebACLSummary = {
      val __obj = js.Dynamic.literal()
      ARN.foreach(__v => __obj.updateDynamic("ARN")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      LockToken.foreach(__v => __obj.updateDynamic("LockToken")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[WebACLSummary]
    }
  }

  /** '''Note:'''This is the latest version of ```AWS WAF```, named AWS WAFV2, released in November, 2019. For information, including how to migrate your AWS WAF resources from the prior release, see the [[https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html|AWS WAF Developer Guide]].
    * A rule statement that defines a cross-site scripting (XSS) match search for AWS WAF to apply to web requests. XSS attacks are those where the attacker uses vulnerabilities in a benign website as a vehicle to inject malicious client-site scripts into other legitimate web browsers. The XSS match statement provides the location in requests that you want AWS WAF to search and text transformations to use on the search area before AWS WAF searches for character sequences that are likely to be malicious strings.
    */
  @js.native
  trait XssMatchStatement extends js.Object {
    var FieldToMatch: FieldToMatch
    var TextTransformations: TextTransformations
  }

  object XssMatchStatement {
    @inline
    def apply(
        FieldToMatch: FieldToMatch,
        TextTransformations: TextTransformations
    ): XssMatchStatement = {
      val __obj = js.Dynamic.literal(
        "FieldToMatch" -> FieldToMatch.asInstanceOf[js.Any],
        "TextTransformations" -> TextTransformations.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[XssMatchStatement]
    }
  }
}
