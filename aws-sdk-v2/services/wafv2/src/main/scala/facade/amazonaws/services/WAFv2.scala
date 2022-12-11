package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import scala.language.implicitConversions
import facade.amazonaws._

package object wafv2 {
  type Action = String
  type CapacityUnit = Double
  type Conditions = js.Array[Condition]
  type ConsumedCapacity = Double
  type CookieNames = js.Array[SingleCookieName]
  type Country = String
  type CountryCodes = js.Array[CountryCode]
  type CustomHTTPHeaderName = String
  type CustomHTTPHeaderValue = String
  type CustomHTTPHeaders = js.Array[CustomHTTPHeader]
  type CustomResponseBodies = js.Dictionary[CustomResponseBody]
  type DownloadUrl = String
  type EntityDescription = String
  type EntityId = String
  type EntityName = String
  type ExcludedRules = js.Array[ExcludedRule]
  type FieldIdentifier = String
  type FieldToMatchData = String
  type Filters = js.Array[Filter]
  type FirewallManagerRuleGroups = js.Array[FirewallManagerRuleGroup]
  type ForwardedIPHeaderName = String
  type HTTPHeaders = js.Array[HTTPHeader]
  type HTTPMethod = String
  type HTTPVersion = String
  type HeaderName = String
  type HeaderNames = js.Array[FieldToMatchData]
  type HeaderValue = String
  type IPAddress = String
  type IPAddresses = js.Array[IPAddress]
  type IPSetSummaries = js.Array[IPSetSummary]
  type IPString = String
  type JsonPointerPath = String
  type JsonPointerPaths = js.Array[JsonPointerPath]
  type LabelMatchKey = String
  type LabelName = String
  type LabelSummaries = js.Array[LabelSummary]
  type Labels = js.Array[Label]
  type ListMaxItems = Double
  type LockToken = String
  type LogDestinationConfigs = js.Array[ResourceArn]
  type LoggingConfigurations = js.Array[LoggingConfiguration]
  type LoginPathString = String
  type ManagedRuleGroupConfigs = js.Array[ManagedRuleGroupConfig]
  type ManagedRuleGroupSummaries = js.Array[ManagedRuleGroupSummary]
  type ManagedRuleGroupVersions = js.Array[ManagedRuleGroupVersion]
  type ManagedRuleSetSummaries = js.Array[ManagedRuleSetSummary]
  type MetricName = String
  type NextMarker = String
  type OutputUrl = String
  type PaginationLimit = Int
  type PolicyString = String
  type PopulationSize = Double
  type PublishedVersions = js.Dictionary[ManagedRuleSetVersion]
  type RateLimit = Double
  type RedactedFields = js.Array[FieldToMatch]
  type RegexPatternSetSummaries = js.Array[RegexPatternSetSummary]
  type RegexPatternString = String
  type RegularExpressionList = js.Array[Regex]
  type ReleaseNotes = String
  type ReleaseSummaries = js.Array[ReleaseSummary]
  type ResourceArn = String
  type ResourceArns = js.Array[ResourceArn]
  type ResponseCode = Int
  type ResponseContent = String
  type ResponseStatusCode = Int
  type RuleActionOverrides = js.Array[RuleActionOverride]
  type RuleGroupSummaries = js.Array[RuleGroupSummary]
  type RulePriority = Int
  type RuleSummaries = js.Array[RuleSummary]
  type Rules = js.Array[Rule]
  type SampleWeight = Double
  type SampledHTTPRequests = js.Array[SampledHTTPRequest]
  type SearchString = js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type SingleCookieName = String
  type Size = Double
  type SolveTimestamp = Double
  type Statements = js.Array[Statement]
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagList = js.Array[Tag]
  type TagValue = String
  type TextTransformationPriority = Int
  type TextTransformations = js.Array[TextTransformation]
  type TimeWindowDay = Int
  type TimeWindowSecond = Double
  type Timestamp = js.Date
  type TokenDomain = String
  type TokenDomains = js.Array[TokenDomain]
  type URIString = String
  type VendorName = String
  type VersionKeyString = String
  type VersionsToPublish = js.Dictionary[VersionToPublish]
  type WebACLSummaries = js.Array[WebACLSummary]

  final class WAFv2Ops(private val service: WAFv2) extends AnyVal {

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
    @inline def generateMobileSdkReleaseUrlFuture(params: GenerateMobileSdkReleaseUrlRequest): Future[GenerateMobileSdkReleaseUrlResponse] = service.generateMobileSdkReleaseUrl(params).promise().toFuture
    @inline def getIPSetFuture(params: GetIPSetRequest): Future[GetIPSetResponse] = service.getIPSet(params).promise().toFuture
    @inline def getLoggingConfigurationFuture(params: GetLoggingConfigurationRequest): Future[GetLoggingConfigurationResponse] = service.getLoggingConfiguration(params).promise().toFuture
    @inline def getManagedRuleSetFuture(params: GetManagedRuleSetRequest): Future[GetManagedRuleSetResponse] = service.getManagedRuleSet(params).promise().toFuture
    @inline def getMobileSdkReleaseFuture(params: GetMobileSdkReleaseRequest): Future[GetMobileSdkReleaseResponse] = service.getMobileSdkRelease(params).promise().toFuture
    @inline def getPermissionPolicyFuture(params: GetPermissionPolicyRequest): Future[GetPermissionPolicyResponse] = service.getPermissionPolicy(params).promise().toFuture
    @inline def getRateBasedStatementManagedKeysFuture(params: GetRateBasedStatementManagedKeysRequest): Future[GetRateBasedStatementManagedKeysResponse] = service.getRateBasedStatementManagedKeys(params).promise().toFuture
    @inline def getRegexPatternSetFuture(params: GetRegexPatternSetRequest): Future[GetRegexPatternSetResponse] = service.getRegexPatternSet(params).promise().toFuture
    @inline def getRuleGroupFuture(params: GetRuleGroupRequest): Future[GetRuleGroupResponse] = service.getRuleGroup(params).promise().toFuture
    @inline def getSampledRequestsFuture(params: GetSampledRequestsRequest): Future[GetSampledRequestsResponse] = service.getSampledRequests(params).promise().toFuture
    @inline def getWebACLForResourceFuture(params: GetWebACLForResourceRequest): Future[GetWebACLForResourceResponse] = service.getWebACLForResource(params).promise().toFuture
    @inline def getWebACLFuture(params: GetWebACLRequest): Future[GetWebACLResponse] = service.getWebACL(params).promise().toFuture
    @inline def listAvailableManagedRuleGroupVersionsFuture(params: ListAvailableManagedRuleGroupVersionsRequest): Future[ListAvailableManagedRuleGroupVersionsResponse] = service.listAvailableManagedRuleGroupVersions(params).promise().toFuture
    @inline def listAvailableManagedRuleGroupsFuture(params: ListAvailableManagedRuleGroupsRequest): Future[ListAvailableManagedRuleGroupsResponse] = service.listAvailableManagedRuleGroups(params).promise().toFuture
    @inline def listIPSetsFuture(params: ListIPSetsRequest): Future[ListIPSetsResponse] = service.listIPSets(params).promise().toFuture
    @inline def listLoggingConfigurationsFuture(params: ListLoggingConfigurationsRequest): Future[ListLoggingConfigurationsResponse] = service.listLoggingConfigurations(params).promise().toFuture
    @inline def listManagedRuleSetsFuture(params: ListManagedRuleSetsRequest): Future[ListManagedRuleSetsResponse] = service.listManagedRuleSets(params).promise().toFuture
    @inline def listMobileSdkReleasesFuture(params: ListMobileSdkReleasesRequest): Future[ListMobileSdkReleasesResponse] = service.listMobileSdkReleases(params).promise().toFuture
    @inline def listRegexPatternSetsFuture(params: ListRegexPatternSetsRequest): Future[ListRegexPatternSetsResponse] = service.listRegexPatternSets(params).promise().toFuture
    @inline def listResourcesForWebACLFuture(params: ListResourcesForWebACLRequest): Future[ListResourcesForWebACLResponse] = service.listResourcesForWebACL(params).promise().toFuture
    @inline def listRuleGroupsFuture(params: ListRuleGroupsRequest): Future[ListRuleGroupsResponse] = service.listRuleGroups(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] = service.listTagsForResource(params).promise().toFuture
    @inline def listWebACLsFuture(params: ListWebACLsRequest): Future[ListWebACLsResponse] = service.listWebACLs(params).promise().toFuture
    @inline def putLoggingConfigurationFuture(params: PutLoggingConfigurationRequest): Future[PutLoggingConfigurationResponse] = service.putLoggingConfiguration(params).promise().toFuture
    @inline def putManagedRuleSetVersionsFuture(params: PutManagedRuleSetVersionsRequest): Future[PutManagedRuleSetVersionsResponse] = service.putManagedRuleSetVersions(params).promise().toFuture
    @inline def putPermissionPolicyFuture(params: PutPermissionPolicyRequest): Future[PutPermissionPolicyResponse] = service.putPermissionPolicy(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] = service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] = service.untagResource(params).promise().toFuture
    @inline def updateIPSetFuture(params: UpdateIPSetRequest): Future[UpdateIPSetResponse] = service.updateIPSet(params).promise().toFuture
    @inline def updateManagedRuleSetVersionExpiryDateFuture(params: UpdateManagedRuleSetVersionExpiryDateRequest): Future[UpdateManagedRuleSetVersionExpiryDateResponse] = service.updateManagedRuleSetVersionExpiryDate(params).promise().toFuture
    @inline def updateRegexPatternSetFuture(params: UpdateRegexPatternSetRequest): Future[UpdateRegexPatternSetResponse] = service.updateRegexPatternSet(params).promise().toFuture
    @inline def updateRuleGroupFuture(params: UpdateRuleGroupRequest): Future[UpdateRuleGroupResponse] = service.updateRuleGroup(params).promise().toFuture
    @inline def updateWebACLFuture(params: UpdateWebACLRequest): Future[UpdateWebACLResponse] = service.updateWebACL(params).promise().toFuture

  }

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
    def generateMobileSdkReleaseUrl(params: GenerateMobileSdkReleaseUrlRequest): Request[GenerateMobileSdkReleaseUrlResponse] = js.native
    def getIPSet(params: GetIPSetRequest): Request[GetIPSetResponse] = js.native
    def getLoggingConfiguration(params: GetLoggingConfigurationRequest): Request[GetLoggingConfigurationResponse] = js.native
    def getManagedRuleSet(params: GetManagedRuleSetRequest): Request[GetManagedRuleSetResponse] = js.native
    def getMobileSdkRelease(params: GetMobileSdkReleaseRequest): Request[GetMobileSdkReleaseResponse] = js.native
    def getPermissionPolicy(params: GetPermissionPolicyRequest): Request[GetPermissionPolicyResponse] = js.native
    def getRateBasedStatementManagedKeys(params: GetRateBasedStatementManagedKeysRequest): Request[GetRateBasedStatementManagedKeysResponse] = js.native
    def getRegexPatternSet(params: GetRegexPatternSetRequest): Request[GetRegexPatternSetResponse] = js.native
    def getRuleGroup(params: GetRuleGroupRequest): Request[GetRuleGroupResponse] = js.native
    def getSampledRequests(params: GetSampledRequestsRequest): Request[GetSampledRequestsResponse] = js.native
    def getWebACL(params: GetWebACLRequest): Request[GetWebACLResponse] = js.native
    def getWebACLForResource(params: GetWebACLForResourceRequest): Request[GetWebACLForResourceResponse] = js.native
    def listAvailableManagedRuleGroupVersions(params: ListAvailableManagedRuleGroupVersionsRequest): Request[ListAvailableManagedRuleGroupVersionsResponse] = js.native
    def listAvailableManagedRuleGroups(params: ListAvailableManagedRuleGroupsRequest): Request[ListAvailableManagedRuleGroupsResponse] = js.native
    def listIPSets(params: ListIPSetsRequest): Request[ListIPSetsResponse] = js.native
    def listLoggingConfigurations(params: ListLoggingConfigurationsRequest): Request[ListLoggingConfigurationsResponse] = js.native
    def listManagedRuleSets(params: ListManagedRuleSetsRequest): Request[ListManagedRuleSetsResponse] = js.native
    def listMobileSdkReleases(params: ListMobileSdkReleasesRequest): Request[ListMobileSdkReleasesResponse] = js.native
    def listRegexPatternSets(params: ListRegexPatternSetsRequest): Request[ListRegexPatternSetsResponse] = js.native
    def listResourcesForWebACL(params: ListResourcesForWebACLRequest): Request[ListResourcesForWebACLResponse] = js.native
    def listRuleGroups(params: ListRuleGroupsRequest): Request[ListRuleGroupsResponse] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def listWebACLs(params: ListWebACLsRequest): Request[ListWebACLsResponse] = js.native
    def putLoggingConfiguration(params: PutLoggingConfigurationRequest): Request[PutLoggingConfigurationResponse] = js.native
    def putManagedRuleSetVersions(params: PutManagedRuleSetVersionsRequest): Request[PutManagedRuleSetVersionsResponse] = js.native
    def putPermissionPolicy(params: PutPermissionPolicyRequest): Request[PutPermissionPolicyResponse] = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse] = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse] = js.native
    def updateIPSet(params: UpdateIPSetRequest): Request[UpdateIPSetResponse] = js.native
    def updateManagedRuleSetVersionExpiryDate(params: UpdateManagedRuleSetVersionExpiryDateRequest): Request[UpdateManagedRuleSetVersionExpiryDateResponse] = js.native
    def updateRegexPatternSet(params: UpdateRegexPatternSetRequest): Request[UpdateRegexPatternSetResponse] = js.native
    def updateRuleGroup(params: UpdateRuleGroupRequest): Request[UpdateRuleGroupResponse] = js.native
    def updateWebACL(params: UpdateWebACLRequest): Request[UpdateWebACLResponse] = js.native
  }
  object WAFv2 {
    @inline implicit def toOps(service: WAFv2): WAFv2Ops = {
      new WAFv2Ops(service)
    }
  }

  /** Details for your use of the Bot Control managed rule group, used in <code>ManagedRuleGroupConfig</code>.
    */
  @js.native
  trait AWSManagedRulesBotControlRuleSet extends js.Object {
    var InspectionLevel: InspectionLevel
  }

  object AWSManagedRulesBotControlRuleSet {
    @inline
    def apply(
        InspectionLevel: InspectionLevel
    ): AWSManagedRulesBotControlRuleSet = {
      val __obj = js.Dynamic.literal(
        "InspectionLevel" -> InspectionLevel.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AWSManagedRulesBotControlRuleSet]
    }
  }

  /** A single action condition for a <a>Condition</a> in a logging filter.
    */
  @js.native
  trait ActionCondition extends js.Object {
    var Action: ActionValue
  }

  object ActionCondition {
    @inline
    def apply(
        Action: ActionValue
    ): ActionCondition = {
      val __obj = js.Dynamic.literal(
        "Action" -> Action.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ActionCondition]
    }
  }

  /** Inspect all of the elements that WAF has parsed and extracted from the web request component that you've identified in your <a>FieldToMatch</a> specifications. This is used only in the <a>FieldToMatch</a> specification for some web request component types. JSON specification: <code>"All": {}</code>
    */
  @js.native
  trait All extends js.Object

  object All {
    @inline
    def apply(): All = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[All]
    }
  }

  /** Inspect all query arguments of the web request. This is used only in the <a>FieldToMatch</a> specification for some web request component types. JSON specification: <code>"AllQueryArguments": {}</code>
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

  /** Specifies that WAF should allow the request and optionally defines additional custom handling for the request. This is used in the context of other settings, for example to specify values for <a>RuleAction</a> and web ACL <a>DefaultAction</a>.
    */
  @js.native
  trait AllowAction extends js.Object {
    var CustomRequestHandling: js.UndefOr[CustomRequestHandling]
  }

  object AllowAction {
    @inline
    def apply(
        CustomRequestHandling: js.UndefOr[CustomRequestHandling] = js.undefined
    ): AllowAction = {
      val __obj = js.Dynamic.literal()
      CustomRequestHandling.foreach(__v => __obj.updateDynamic("CustomRequestHandling")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AllowAction]
    }
  }

  /** A logical rule statement used to combine other rule statements with AND logic. You provide more than one <a>Statement</a> within the <code>AndStatement</code>.
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

  /** Specifies that WAF should block the request and optionally defines additional custom handling for the response to the web request. This is used in the context of other settings, for example to specify values for <a>RuleAction</a> and web ACL <a>DefaultAction</a>.
    */
  @js.native
  trait BlockAction extends js.Object {
    var CustomResponse: js.UndefOr[CustomResponse]
  }

  object BlockAction {
    @inline
    def apply(
        CustomResponse: js.UndefOr[CustomResponse] = js.undefined
    ): BlockAction = {
      val __obj = js.Dynamic.literal()
      CustomResponse.foreach(__v => __obj.updateDynamic("CustomResponse")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BlockAction]
    }
  }

  /** Inspect the body of the web request. The body immediately follows the request headers. This is used to indicate the web request component to inspect, in the <a>FieldToMatch</a> specification.
    */
  @js.native
  trait Body extends js.Object {
    var OversizeHandling: js.UndefOr[OversizeHandling]
  }

  object Body {
    @inline
    def apply(
        OversizeHandling: js.UndefOr[OversizeHandling] = js.undefined
    ): Body = {
      val __obj = js.Dynamic.literal()
      OversizeHandling.foreach(__v => __obj.updateDynamic("OversizeHandling")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Body]
    }
  }

  /** A rule statement that defines a string match search for WAF to apply to web requests. The byte match statement provides the bytes to search for, the location in requests that you want WAF to search, and other settings. The bytes to search for are typically a string that corresponds with ASCII characters. In the WAF console and the developer guide, this is called a string match statement.
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

  /** Specifies that WAF should run a <code>CAPTCHA</code> check against the request: * If the request includes a valid, unexpired <code>CAPTCHA</code> token, WAF applies any custom request handling and labels that you've configured and then allows the web request inspection to proceed to the next rule, similar to a <code>CountAction</code>. * If the request doesn't include a valid, unexpired token, WAF discontinues the web ACL evaluation of the request and blocks it from going to its intended destination. WAF generates a response that it sends back to the client, which includes the following: <li> The header <code>x-amzn-waf-action</code> with a value of <code>captcha</code>. * The HTTP status code <code>405 Method Not Allowed</code>. * If the request contains an <code>Accept</code> header with a value of <code>text/html</code>, the response includes a <code>CAPTCHA</code> JavaScript page interstitial. </li>You can configure the expiration time in the <code>CaptchaConfig</code>
    * <code>ImmunityTimeProperty</code> setting at the rule and web ACL level. The rule setting overrides the web ACL setting. This action option is available for rules. It isn't available for web ACL default actions.
    */
  @js.native
  trait CaptchaAction extends js.Object {
    var CustomRequestHandling: js.UndefOr[CustomRequestHandling]
  }

  object CaptchaAction {
    @inline
    def apply(
        CustomRequestHandling: js.UndefOr[CustomRequestHandling] = js.undefined
    ): CaptchaAction = {
      val __obj = js.Dynamic.literal()
      CustomRequestHandling.foreach(__v => __obj.updateDynamic("CustomRequestHandling")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CaptchaAction]
    }
  }

  /** Specifies how WAF should handle <code>CAPTCHA</code> evaluations. This is available at the web ACL level and in each rule.
    */
  @js.native
  trait CaptchaConfig extends js.Object {
    var ImmunityTimeProperty: js.UndefOr[ImmunityTimeProperty]
  }

  object CaptchaConfig {
    @inline
    def apply(
        ImmunityTimeProperty: js.UndefOr[ImmunityTimeProperty] = js.undefined
    ): CaptchaConfig = {
      val __obj = js.Dynamic.literal()
      ImmunityTimeProperty.foreach(__v => __obj.updateDynamic("ImmunityTimeProperty")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CaptchaConfig]
    }
  }

  /** The result from the inspection of the web request for a valid <code>CAPTCHA</code> token.
    */
  @js.native
  trait CaptchaResponse extends js.Object {
    var FailureReason: js.UndefOr[FailureReason]
    var ResponseCode: js.UndefOr[ResponseCode]
    var SolveTimestamp: js.UndefOr[SolveTimestamp]
  }

  object CaptchaResponse {
    @inline
    def apply(
        FailureReason: js.UndefOr[FailureReason] = js.undefined,
        ResponseCode: js.UndefOr[ResponseCode] = js.undefined,
        SolveTimestamp: js.UndefOr[SolveTimestamp] = js.undefined
    ): CaptchaResponse = {
      val __obj = js.Dynamic.literal()
      FailureReason.foreach(__v => __obj.updateDynamic("FailureReason")(__v.asInstanceOf[js.Any]))
      ResponseCode.foreach(__v => __obj.updateDynamic("ResponseCode")(__v.asInstanceOf[js.Any]))
      SolveTimestamp.foreach(__v => __obj.updateDynamic("SolveTimestamp")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CaptchaResponse]
    }
  }

  /** Specifies that WAF should run a <code>Challenge</code> check against the request to verify that the request is coming from a legitimate client session: * If the request includes a valid, unexpired challenge token, WAF applies any custom request handling and labels that you've configured and then allows the web request inspection to proceed to the next rule, similar to a <code>CountAction</code>. * If the request doesn't include a valid, unexpired challenge token, WAF discontinues the web ACL evaluation of the request and blocks it from going to its intended destination. WAF then generates a challenge response that it sends back to the client, which includes the following: <li> The header <code>x-amzn-waf-action</code> with a value of <code>challenge</code>. * The HTTP status code <code>202 Request Accepted</code>. * If the request contains an <code>Accept</code> header with a value of <code>text/html</code>, the response includes a JavaScript page interstitial with a challenge
    * script. Challenges run silent browser interrogations in the background, and don't generally affect the end user experience. A challenge enforces token acquisition using an interstitial JavaScript challenge that inspects the client session for legitimate behavior. The challenge blocks bots or at least increases the cost of operating sophisticated bots. After the client session successfully responds to the challenge, it receives a new token from WAF, which the challenge script uses to resubmit the original request. </li>You can configure the expiration time in the <code>ChallengeConfig</code> <code>ImmunityTimeProperty</code> setting at the rule and web ACL level. The rule setting overrides the web ACL setting. This action option is available for rules. It isn't available for web ACL default actions.
    */
  @js.native
  trait ChallengeAction extends js.Object {
    var CustomRequestHandling: js.UndefOr[CustomRequestHandling]
  }

  object ChallengeAction {
    @inline
    def apply(
        CustomRequestHandling: js.UndefOr[CustomRequestHandling] = js.undefined
    ): ChallengeAction = {
      val __obj = js.Dynamic.literal()
      CustomRequestHandling.foreach(__v => __obj.updateDynamic("CustomRequestHandling")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ChallengeAction]
    }
  }

  /** Specifies how WAF should handle <code>Challenge</code> evaluations. This is available at the web ACL level and in each rule.
    */
  @js.native
  trait ChallengeConfig extends js.Object {
    var ImmunityTimeProperty: js.UndefOr[ImmunityTimeProperty]
  }

  object ChallengeConfig {
    @inline
    def apply(
        ImmunityTimeProperty: js.UndefOr[ImmunityTimeProperty] = js.undefined
    ): ChallengeConfig = {
      val __obj = js.Dynamic.literal()
      ImmunityTimeProperty.foreach(__v => __obj.updateDynamic("ImmunityTimeProperty")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ChallengeConfig]
    }
  }

  /** The result from the inspection of the web request for a valid challenge token.
    */
  @js.native
  trait ChallengeResponse extends js.Object {
    var FailureReason: js.UndefOr[FailureReason]
    var ResponseCode: js.UndefOr[ResponseCode]
    var SolveTimestamp: js.UndefOr[SolveTimestamp]
  }

  object ChallengeResponse {
    @inline
    def apply(
        FailureReason: js.UndefOr[FailureReason] = js.undefined,
        ResponseCode: js.UndefOr[ResponseCode] = js.undefined,
        SolveTimestamp: js.UndefOr[SolveTimestamp] = js.undefined
    ): ChallengeResponse = {
      val __obj = js.Dynamic.literal()
      FailureReason.foreach(__v => __obj.updateDynamic("FailureReason")(__v.asInstanceOf[js.Any]))
      ResponseCode.foreach(__v => __obj.updateDynamic("ResponseCode")(__v.asInstanceOf[js.Any]))
      SolveTimestamp.foreach(__v => __obj.updateDynamic("SolveTimestamp")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ChallengeResponse]
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

  /** A single match condition for a <a>Filter</a>.
    */
  @js.native
  trait Condition extends js.Object {
    var ActionCondition: js.UndefOr[ActionCondition]
    var LabelNameCondition: js.UndefOr[LabelNameCondition]
  }

  object Condition {
    @inline
    def apply(
        ActionCondition: js.UndefOr[ActionCondition] = js.undefined,
        LabelNameCondition: js.UndefOr[LabelNameCondition] = js.undefined
    ): Condition = {
      val __obj = js.Dynamic.literal()
      ActionCondition.foreach(__v => __obj.updateDynamic("ActionCondition")(__v.asInstanceOf[js.Any]))
      LabelNameCondition.foreach(__v => __obj.updateDynamic("LabelNameCondition")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Condition]
    }
  }

  /** The filter to use to identify the subset of cookies to inspect in a web request. You must specify exactly one setting: either <code>All</code>, <code>IncludedCookies</code>, or <code>ExcludedCookies</code>. Example JSON: <code>"MatchPattern": { "IncludedCookies": {"KeyToInclude1", "KeyToInclude2", "KeyToInclude3"} }</code>
    */
  @js.native
  trait CookieMatchPattern extends js.Object {
    var All: js.UndefOr[All]
    var ExcludedCookies: js.UndefOr[CookieNames]
    var IncludedCookies: js.UndefOr[CookieNames]
  }

  object CookieMatchPattern {
    @inline
    def apply(
        All: js.UndefOr[All] = js.undefined,
        ExcludedCookies: js.UndefOr[CookieNames] = js.undefined,
        IncludedCookies: js.UndefOr[CookieNames] = js.undefined
    ): CookieMatchPattern = {
      val __obj = js.Dynamic.literal()
      All.foreach(__v => __obj.updateDynamic("All")(__v.asInstanceOf[js.Any]))
      ExcludedCookies.foreach(__v => __obj.updateDynamic("ExcludedCookies")(__v.asInstanceOf[js.Any]))
      IncludedCookies.foreach(__v => __obj.updateDynamic("IncludedCookies")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CookieMatchPattern]
    }
  }

  /** Inspect the cookies in the web request. You can specify the parts of the cookies to inspect and you can narrow the set of cookies to inspect by including or excluding specific keys. This is used to indicate the web request component to inspect, in the <a>FieldToMatch</a> specification. Example JSON: <code>"Cookies": { "MatchPattern": { "All": {} }, "MatchScope": "KEY", "OversizeHandling": "MATCH" }</code>
    */
  @js.native
  trait Cookies extends js.Object {
    var MatchPattern: CookieMatchPattern
    var MatchScope: MapMatchScope
    var OversizeHandling: OversizeHandling
  }

  object Cookies {
    @inline
    def apply(
        MatchPattern: CookieMatchPattern,
        MatchScope: MapMatchScope,
        OversizeHandling: OversizeHandling
    ): Cookies = {
      val __obj = js.Dynamic.literal(
        "MatchPattern" -> MatchPattern.asInstanceOf[js.Any],
        "MatchScope" -> MatchScope.asInstanceOf[js.Any],
        "OversizeHandling" -> OversizeHandling.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[Cookies]
    }
  }

  /** Specifies that WAF should count the request. Optionally defines additional custom handling for the request. This is used in the context of other settings, for example to specify values for <a>RuleAction</a> and web ACL <a>DefaultAction</a>.
    */
  @js.native
  trait CountAction extends js.Object {
    var CustomRequestHandling: js.UndefOr[CustomRequestHandling]
  }

  object CountAction {
    @inline
    def apply(
        CustomRequestHandling: js.UndefOr[CustomRequestHandling] = js.undefined
    ): CountAction = {
      val __obj = js.Dynamic.literal()
      CustomRequestHandling.foreach(__v => __obj.updateDynamic("CustomRequestHandling")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CountAction]
    }
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
    var CustomResponseBodies: js.UndefOr[CustomResponseBodies]
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
        CustomResponseBodies: js.UndefOr[CustomResponseBodies] = js.undefined,
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

      CustomResponseBodies.foreach(__v => __obj.updateDynamic("CustomResponseBodies")(__v.asInstanceOf[js.Any]))
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
    var CaptchaConfig: js.UndefOr[CaptchaConfig]
    var ChallengeConfig: js.UndefOr[ChallengeConfig]
    var CustomResponseBodies: js.UndefOr[CustomResponseBodies]
    var Description: js.UndefOr[EntityDescription]
    var Rules: js.UndefOr[Rules]
    var Tags: js.UndefOr[TagList]
    var TokenDomains: js.UndefOr[TokenDomains]
  }

  object CreateWebACLRequest {
    @inline
    def apply(
        DefaultAction: DefaultAction,
        Name: EntityName,
        Scope: Scope,
        VisibilityConfig: VisibilityConfig,
        CaptchaConfig: js.UndefOr[CaptchaConfig] = js.undefined,
        ChallengeConfig: js.UndefOr[ChallengeConfig] = js.undefined,
        CustomResponseBodies: js.UndefOr[CustomResponseBodies] = js.undefined,
        Description: js.UndefOr[EntityDescription] = js.undefined,
        Rules: js.UndefOr[Rules] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined,
        TokenDomains: js.UndefOr[TokenDomains] = js.undefined
    ): CreateWebACLRequest = {
      val __obj = js.Dynamic.literal(
        "DefaultAction" -> DefaultAction.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
        "Scope" -> Scope.asInstanceOf[js.Any],
        "VisibilityConfig" -> VisibilityConfig.asInstanceOf[js.Any]
      )

      CaptchaConfig.foreach(__v => __obj.updateDynamic("CaptchaConfig")(__v.asInstanceOf[js.Any]))
      ChallengeConfig.foreach(__v => __obj.updateDynamic("ChallengeConfig")(__v.asInstanceOf[js.Any]))
      CustomResponseBodies.foreach(__v => __obj.updateDynamic("CustomResponseBodies")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Rules.foreach(__v => __obj.updateDynamic("Rules")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      TokenDomains.foreach(__v => __obj.updateDynamic("TokenDomains")(__v.asInstanceOf[js.Any]))
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

  /** A custom header for custom request and response handling. This is used in <a>CustomResponse</a> and <a>CustomRequestHandling</a>.
    */
  @js.native
  trait CustomHTTPHeader extends js.Object {
    var Name: CustomHTTPHeaderName
    var Value: CustomHTTPHeaderValue
  }

  object CustomHTTPHeader {
    @inline
    def apply(
        Name: CustomHTTPHeaderName,
        Value: CustomHTTPHeaderValue
    ): CustomHTTPHeader = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "Value" -> Value.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CustomHTTPHeader]
    }
  }

  /** Custom request handling behavior that inserts custom headers into a web request. You can add custom request handling for WAF to use when the rule action doesn't block the request. For example, <code>CaptchaAction</code> for requests with valid t okens, and <code>AllowAction</code>. For information about customizing web requests and responses, see [[https://docs.aws.amazon.com/waf/latest/developerguide/waf-custom-request-response.html|Customizing web requests and responses in WAF]] in the [[https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html|WAF Developer Guide]].
    */
  @js.native
  trait CustomRequestHandling extends js.Object {
    var InsertHeaders: CustomHTTPHeaders
  }

  object CustomRequestHandling {
    @inline
    def apply(
        InsertHeaders: CustomHTTPHeaders
    ): CustomRequestHandling = {
      val __obj = js.Dynamic.literal(
        "InsertHeaders" -> InsertHeaders.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CustomRequestHandling]
    }
  }

  /** A custom response to send to the client. You can define a custom response for rule actions and default web ACL actions that are set to <a>BlockAction</a>. For information about customizing web requests and responses, see [[https://docs.aws.amazon.com/waf/latest/developerguide/waf-custom-request-response.html|Customizing web requests and responses in WAF]] in the [[https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html|WAF Developer Guide]].
    */
  @js.native
  trait CustomResponse extends js.Object {
    var ResponseCode: ResponseStatusCode
    var CustomResponseBodyKey: js.UndefOr[EntityName]
    var ResponseHeaders: js.UndefOr[CustomHTTPHeaders]
  }

  object CustomResponse {
    @inline
    def apply(
        ResponseCode: ResponseStatusCode,
        CustomResponseBodyKey: js.UndefOr[EntityName] = js.undefined,
        ResponseHeaders: js.UndefOr[CustomHTTPHeaders] = js.undefined
    ): CustomResponse = {
      val __obj = js.Dynamic.literal(
        "ResponseCode" -> ResponseCode.asInstanceOf[js.Any]
      )

      CustomResponseBodyKey.foreach(__v => __obj.updateDynamic("CustomResponseBodyKey")(__v.asInstanceOf[js.Any]))
      ResponseHeaders.foreach(__v => __obj.updateDynamic("ResponseHeaders")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CustomResponse]
    }
  }

  /** The response body to use in a custom response to a web request. This is referenced by key from <a>CustomResponse</a> <code>CustomResponseBodyKey</code>.
    */
  @js.native
  trait CustomResponseBody extends js.Object {
    var Content: ResponseContent
    var ContentType: ResponseContentType
  }

  object CustomResponseBody {
    @inline
    def apply(
        Content: ResponseContent,
        ContentType: ResponseContentType
    ): CustomResponseBody = {
      val __obj = js.Dynamic.literal(
        "Content" -> Content.asInstanceOf[js.Any],
        "ContentType" -> ContentType.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CustomResponseBody]
    }
  }

  /** In a <a>WebACL</a>, this is the action that you want WAF to perform when a web request doesn't match any of the rules in the <code>WebACL</code>. The default action must be a terminating action.
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
    var VersionName: js.UndefOr[VersionKeyString]
  }

  object DescribeManagedRuleGroupRequest {
    @inline
    def apply(
        Name: EntityName,
        Scope: Scope,
        VendorName: VendorName,
        VersionName: js.UndefOr[VersionKeyString] = js.undefined
    ): DescribeManagedRuleGroupRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "Scope" -> Scope.asInstanceOf[js.Any],
        "VendorName" -> VendorName.asInstanceOf[js.Any]
      )

      VersionName.foreach(__v => __obj.updateDynamic("VersionName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeManagedRuleGroupRequest]
    }
  }

  @js.native
  trait DescribeManagedRuleGroupResponse extends js.Object {
    var AvailableLabels: js.UndefOr[LabelSummaries]
    var Capacity: js.UndefOr[CapacityUnit]
    var ConsumedLabels: js.UndefOr[LabelSummaries]
    var LabelNamespace: js.UndefOr[LabelName]
    var Rules: js.UndefOr[RuleSummaries]
    var SnsTopicArn: js.UndefOr[ResourceArn]
    var VersionName: js.UndefOr[VersionKeyString]
  }

  object DescribeManagedRuleGroupResponse {
    @inline
    def apply(
        AvailableLabels: js.UndefOr[LabelSummaries] = js.undefined,
        Capacity: js.UndefOr[CapacityUnit] = js.undefined,
        ConsumedLabels: js.UndefOr[LabelSummaries] = js.undefined,
        LabelNamespace: js.UndefOr[LabelName] = js.undefined,
        Rules: js.UndefOr[RuleSummaries] = js.undefined,
        SnsTopicArn: js.UndefOr[ResourceArn] = js.undefined,
        VersionName: js.UndefOr[VersionKeyString] = js.undefined
    ): DescribeManagedRuleGroupResponse = {
      val __obj = js.Dynamic.literal()
      AvailableLabels.foreach(__v => __obj.updateDynamic("AvailableLabels")(__v.asInstanceOf[js.Any]))
      Capacity.foreach(__v => __obj.updateDynamic("Capacity")(__v.asInstanceOf[js.Any]))
      ConsumedLabels.foreach(__v => __obj.updateDynamic("ConsumedLabels")(__v.asInstanceOf[js.Any]))
      LabelNamespace.foreach(__v => __obj.updateDynamic("LabelNamespace")(__v.asInstanceOf[js.Any]))
      Rules.foreach(__v => __obj.updateDynamic("Rules")(__v.asInstanceOf[js.Any]))
      SnsTopicArn.foreach(__v => __obj.updateDynamic("SnsTopicArn")(__v.asInstanceOf[js.Any]))
      VersionName.foreach(__v => __obj.updateDynamic("VersionName")(__v.asInstanceOf[js.Any]))
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

  /** Specifies a single rule in a rule group whose action you want to override to <code>Count</code>.
    *
    * '''Note:'''Instead of this option, use <code>RuleActionOverrides</code>. It accepts any valid action setting, including <code>Count</code>.
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

  /** The part of the web request that you want WAF to inspect. Include the single <code>FieldToMatch</code> type that you want to inspect, with additional specifications as needed, according to the type. You specify a single request component in <code>FieldToMatch</code> for each rule statement that requires it. To inspect more than one component of the web request, create a separate rule statement for each component. Example JSON for a <code>QueryString</code> field to match: <code> "FieldToMatch": { "QueryString": {} }</code> Example JSON for a <code>Method</code> field to match specification: <code> "FieldToMatch": { "Method": { "Name": "DELETE" } }</code>
    */
  @js.native
  trait FieldToMatch extends js.Object {
    var AllQueryArguments: js.UndefOr[AllQueryArguments]
    var Body: js.UndefOr[Body]
    var Cookies: js.UndefOr[Cookies]
    var Headers: js.UndefOr[Headers]
    var JsonBody: js.UndefOr[JsonBody]
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
        Cookies: js.UndefOr[Cookies] = js.undefined,
        Headers: js.UndefOr[Headers] = js.undefined,
        JsonBody: js.UndefOr[JsonBody] = js.undefined,
        Method: js.UndefOr[Method] = js.undefined,
        QueryString: js.UndefOr[QueryString] = js.undefined,
        SingleHeader: js.UndefOr[SingleHeader] = js.undefined,
        SingleQueryArgument: js.UndefOr[SingleQueryArgument] = js.undefined,
        UriPath: js.UndefOr[UriPath] = js.undefined
    ): FieldToMatch = {
      val __obj = js.Dynamic.literal()
      AllQueryArguments.foreach(__v => __obj.updateDynamic("AllQueryArguments")(__v.asInstanceOf[js.Any]))
      Body.foreach(__v => __obj.updateDynamic("Body")(__v.asInstanceOf[js.Any]))
      Cookies.foreach(__v => __obj.updateDynamic("Cookies")(__v.asInstanceOf[js.Any]))
      Headers.foreach(__v => __obj.updateDynamic("Headers")(__v.asInstanceOf[js.Any]))
      JsonBody.foreach(__v => __obj.updateDynamic("JsonBody")(__v.asInstanceOf[js.Any]))
      Method.foreach(__v => __obj.updateDynamic("Method")(__v.asInstanceOf[js.Any]))
      QueryString.foreach(__v => __obj.updateDynamic("QueryString")(__v.asInstanceOf[js.Any]))
      SingleHeader.foreach(__v => __obj.updateDynamic("SingleHeader")(__v.asInstanceOf[js.Any]))
      SingleQueryArgument.foreach(__v => __obj.updateDynamic("SingleQueryArgument")(__v.asInstanceOf[js.Any]))
      UriPath.foreach(__v => __obj.updateDynamic("UriPath")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FieldToMatch]
    }
  }

  /** A single logging filter, used in <a>LoggingFilter</a>.
    */
  @js.native
  trait Filter extends js.Object {
    var Behavior: FilterBehavior
    var Conditions: Conditions
    var Requirement: FilterRequirement
  }

  object Filter {
    @inline
    def apply(
        Behavior: FilterBehavior,
        Conditions: Conditions,
        Requirement: FilterRequirement
    ): Filter = {
      val __obj = js.Dynamic.literal(
        "Behavior" -> Behavior.asInstanceOf[js.Any],
        "Conditions" -> Conditions.asInstanceOf[js.Any],
        "Requirement" -> Requirement.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[Filter]
    }
  }

  /** A rule group that's defined for an Firewall Manager WAF policy.
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

  /** The processing guidance for an Firewall Manager rule. This is like a regular rule <a>Statement</a>, but it can only contain a rule group reference.
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
    * '''Note:'''If the specified header isn't present in the request, WAF doesn't apply the rule to the web request at all. This configuration is used for <a>GeoMatchStatement</a> and <a>RateBasedStatement</a>. For <a>IPSetReferenceStatement</a>, use <a>IPSetForwardedIPConfig</a> instead. WAF only evaluates the first IP address found in the specified HTTP header.
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
  trait GenerateMobileSdkReleaseUrlRequest extends js.Object {
    var Platform: Platform
    var ReleaseVersion: VersionKeyString
  }

  object GenerateMobileSdkReleaseUrlRequest {
    @inline
    def apply(
        Platform: Platform,
        ReleaseVersion: VersionKeyString
    ): GenerateMobileSdkReleaseUrlRequest = {
      val __obj = js.Dynamic.literal(
        "Platform" -> Platform.asInstanceOf[js.Any],
        "ReleaseVersion" -> ReleaseVersion.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GenerateMobileSdkReleaseUrlRequest]
    }
  }

  @js.native
  trait GenerateMobileSdkReleaseUrlResponse extends js.Object {
    var Url: js.UndefOr[DownloadUrl]
  }

  object GenerateMobileSdkReleaseUrlResponse {
    @inline
    def apply(
        Url: js.UndefOr[DownloadUrl] = js.undefined
    ): GenerateMobileSdkReleaseUrlResponse = {
      val __obj = js.Dynamic.literal()
      Url.foreach(__v => __obj.updateDynamic("Url")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GenerateMobileSdkReleaseUrlResponse]
    }
  }

  /** A rule statement that labels web requests by country and region and that matches against web requests based on country code. A geo match rule labels every request that it inspects regardless of whether it finds a match. * To manage requests only by country, you can use this statement by itself and specify the countries that you want to match against in the <code>CountryCodes</code> array. * Otherwise, configure your geo match rule with Count action so that it only labels requests. Then, add one or more label match rules to run after the geo match rule and configure them to match against the geographic labels and handle the requests as needed. WAF labels requests using the alpha-2 country and region codes from the International Organization for Standardization (ISO) 3166 standard. WAF determines the codes using either the IP address in the web request origin or, if you specify it, the address in the geo match <code>ForwardedIPConfig</code>. If you use the web request origin, the
    * label formats are <code>awswaf:clientip:geo:region:&lt;ISO country code&gt;-&lt;ISO region code&gt;</code> and <code>awswaf:clientip:geo:country:&lt;ISO country code&gt;</code>. If you use a forwarded IP address, the label formats are <code>awswaf:forwardedip:geo:region:&lt;ISO country code&gt;-&lt;ISO region code&gt;</code> and <code>awswaf:forwardedip:geo:country:&lt;ISO country code&gt;</code>. For additional details, see [[https://docs.aws.amazon.com/waf/latest/developerguide/waf-rule-statement-type-geo-match.html|Geographic match rule statement]] in the [[https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html|WAF Developer Guide]].
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
  trait GetManagedRuleSetRequest extends js.Object {
    var Id: EntityId
    var Name: EntityName
    var Scope: Scope
  }

  object GetManagedRuleSetRequest {
    @inline
    def apply(
        Id: EntityId,
        Name: EntityName,
        Scope: Scope
    ): GetManagedRuleSetRequest = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
        "Scope" -> Scope.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetManagedRuleSetRequest]
    }
  }

  @js.native
  trait GetManagedRuleSetResponse extends js.Object {
    var LockToken: js.UndefOr[LockToken]
    var ManagedRuleSet: js.UndefOr[ManagedRuleSet]
  }

  object GetManagedRuleSetResponse {
    @inline
    def apply(
        LockToken: js.UndefOr[LockToken] = js.undefined,
        ManagedRuleSet: js.UndefOr[ManagedRuleSet] = js.undefined
    ): GetManagedRuleSetResponse = {
      val __obj = js.Dynamic.literal()
      LockToken.foreach(__v => __obj.updateDynamic("LockToken")(__v.asInstanceOf[js.Any]))
      ManagedRuleSet.foreach(__v => __obj.updateDynamic("ManagedRuleSet")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetManagedRuleSetResponse]
    }
  }

  @js.native
  trait GetMobileSdkReleaseRequest extends js.Object {
    var Platform: Platform
    var ReleaseVersion: VersionKeyString
  }

  object GetMobileSdkReleaseRequest {
    @inline
    def apply(
        Platform: Platform,
        ReleaseVersion: VersionKeyString
    ): GetMobileSdkReleaseRequest = {
      val __obj = js.Dynamic.literal(
        "Platform" -> Platform.asInstanceOf[js.Any],
        "ReleaseVersion" -> ReleaseVersion.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetMobileSdkReleaseRequest]
    }
  }

  @js.native
  trait GetMobileSdkReleaseResponse extends js.Object {
    var MobileSdkRelease: js.UndefOr[MobileSdkRelease]
  }

  object GetMobileSdkReleaseResponse {
    @inline
    def apply(
        MobileSdkRelease: js.UndefOr[MobileSdkRelease] = js.undefined
    ): GetMobileSdkReleaseResponse = {
      val __obj = js.Dynamic.literal()
      MobileSdkRelease.foreach(__v => __obj.updateDynamic("MobileSdkRelease")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetMobileSdkReleaseResponse]
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
    var RuleGroupRuleName: js.UndefOr[EntityName]
  }

  object GetRateBasedStatementManagedKeysRequest {
    @inline
    def apply(
        RuleName: EntityName,
        Scope: Scope,
        WebACLId: EntityId,
        WebACLName: EntityName,
        RuleGroupRuleName: js.UndefOr[EntityName] = js.undefined
    ): GetRateBasedStatementManagedKeysRequest = {
      val __obj = js.Dynamic.literal(
        "RuleName" -> RuleName.asInstanceOf[js.Any],
        "Scope" -> Scope.asInstanceOf[js.Any],
        "WebACLId" -> WebACLId.asInstanceOf[js.Any],
        "WebACLName" -> WebACLName.asInstanceOf[js.Any]
      )

      RuleGroupRuleName.foreach(__v => __obj.updateDynamic("RuleGroupRuleName")(__v.asInstanceOf[js.Any]))
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
    var ARN: js.UndefOr[ResourceArn]
    var Id: js.UndefOr[EntityId]
    var Name: js.UndefOr[EntityName]
    var Scope: js.UndefOr[Scope]
  }

  object GetRuleGroupRequest {
    @inline
    def apply(
        ARN: js.UndefOr[ResourceArn] = js.undefined,
        Id: js.UndefOr[EntityId] = js.undefined,
        Name: js.UndefOr[EntityName] = js.undefined,
        Scope: js.UndefOr[Scope] = js.undefined
    ): GetRuleGroupRequest = {
      val __obj = js.Dynamic.literal()
      ARN.foreach(__v => __obj.updateDynamic("ARN")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Scope.foreach(__v => __obj.updateDynamic("Scope")(__v.asInstanceOf[js.Any]))
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
    var ApplicationIntegrationURL: js.UndefOr[OutputUrl]
    var LockToken: js.UndefOr[LockToken]
    var WebACL: js.UndefOr[WebACL]
  }

  object GetWebACLResponse {
    @inline
    def apply(
        ApplicationIntegrationURL: js.UndefOr[OutputUrl] = js.undefined,
        LockToken: js.UndefOr[LockToken] = js.undefined,
        WebACL: js.UndefOr[WebACL] = js.undefined
    ): GetWebACLResponse = {
      val __obj = js.Dynamic.literal()
      ApplicationIntegrationURL.foreach(__v => __obj.updateDynamic("ApplicationIntegrationURL")(__v.asInstanceOf[js.Any]))
      LockToken.foreach(__v => __obj.updateDynamic("LockToken")(__v.asInstanceOf[js.Any]))
      WebACL.foreach(__v => __obj.updateDynamic("WebACL")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetWebACLResponse]
    }
  }

  /** Part of the response from <a>GetSampledRequests</a>. This is a complex type that appears as <code>Headers</code> in the response syntax. <code>HTTPHeader</code> contains the names and values of all of the headers that appear in one of the web requests.
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

  /** Part of the response from <a>GetSampledRequests</a>. This is a complex type that appears as <code>Request</code> in the response syntax. <code>HTTPRequest</code> contains information about one of the web requests.
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

  /** The filter to use to identify the subset of headers to inspect in a web request. You must specify exactly one setting: either <code>All</code>, <code>IncludedHeaders</code>, or <code>ExcludedHeaders</code>. Example JSON: <code>"MatchPattern": { "ExcludedHeaders": {"KeyToExclude1", "KeyToExclude2"} }</code>
    */
  @js.native
  trait HeaderMatchPattern extends js.Object {
    var All: js.UndefOr[All]
    var ExcludedHeaders: js.UndefOr[HeaderNames]
    var IncludedHeaders: js.UndefOr[HeaderNames]
  }

  object HeaderMatchPattern {
    @inline
    def apply(
        All: js.UndefOr[All] = js.undefined,
        ExcludedHeaders: js.UndefOr[HeaderNames] = js.undefined,
        IncludedHeaders: js.UndefOr[HeaderNames] = js.undefined
    ): HeaderMatchPattern = {
      val __obj = js.Dynamic.literal()
      All.foreach(__v => __obj.updateDynamic("All")(__v.asInstanceOf[js.Any]))
      ExcludedHeaders.foreach(__v => __obj.updateDynamic("ExcludedHeaders")(__v.asInstanceOf[js.Any]))
      IncludedHeaders.foreach(__v => __obj.updateDynamic("IncludedHeaders")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HeaderMatchPattern]
    }
  }

  /** Inspect all headers in the web request. You can specify the parts of the headers to inspect and you can narrow the set of headers to inspect by including or excluding specific keys. This is used to indicate the web request component to inspect, in the <a>FieldToMatch</a> specification. If you want to inspect just the value of a single header, use the <code>SingleHeader</code> <code>FieldToMatch</code> setting instead. Example JSON: <code>"Headers": { "MatchPattern": { "All": {} }, "MatchScope": "KEY", "OversizeHandling": "MATCH" }</code>
    */
  @js.native
  trait Headers extends js.Object {
    var MatchPattern: HeaderMatchPattern
    var MatchScope: MapMatchScope
    var OversizeHandling: OversizeHandling
  }

  object Headers {
    @inline
    def apply(
        MatchPattern: HeaderMatchPattern,
        MatchScope: MapMatchScope,
        OversizeHandling: OversizeHandling
    ): Headers = {
      val __obj = js.Dynamic.literal(
        "MatchPattern" -> MatchPattern.asInstanceOf[js.Any],
        "MatchScope" -> MatchScope.asInstanceOf[js.Any],
        "OversizeHandling" -> OversizeHandling.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[Headers]
    }
  }

  /** Contains zero or more IP addresses or blocks of IP addresses specified in Classless Inter-Domain Routing (CIDR) notation. WAF supports all IPv4 and IPv6 CIDR ranges except for /0. For information about CIDR notation, see the Wikipedia entry [[https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing|Classless Inter-Domain Routing]]. WAF assigns an ARN to each <code>IPSet</code> that you create. To use an IP set in a rule, you provide the ARN to the <a>Rule</a> statement <a>IPSetReferenceStatement</a>.
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
    * '''Note:'''If the specified header isn't present in the request, WAF doesn't apply the rule to the web request at all. This configuration is used only for <a>IPSetReferenceStatement</a>. For <a>GeoMatchStatement</a> and <a>RateBasedStatement</a>, use <a>ForwardedIPConfig</a> instead.
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

  /** A rule statement used to detect web requests coming from particular IP addresses or address ranges. To use this, create an <a>IPSet</a> that specifies the addresses you want to detect, then use the ARN of that set in this statement. To create an IP set, see <a>CreateIPSet</a>. Each IP set rule statement references an IP set. You create and maintain the set independent of your rules. This allows you to use the single set in multiple rules. When you update the referenced set, WAF automatically updates all rules that reference it.
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

  /** High-level information about an <a>IPSet</a>, returned by operations like create and list. This provides information like the ID, that you can use to retrieve and manage an <code>IPSet</code>, and the ARN, that you provide to the <a>IPSetReferenceStatement</a> to use the address set in a <a>Rule</a>.
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

  /** Used for CAPTCHA and challenge token settings. Determines how long a <code>CAPTCHA</code> or challenge timestamp remains valid after WAF updates it for a successful <code>CAPTCHA</code> or challenge response.
    */
  @js.native
  trait ImmunityTimeProperty extends js.Object {
    var ImmunityTime: TimeWindowSecond
  }

  object ImmunityTimeProperty {
    @inline
    def apply(
        ImmunityTime: TimeWindowSecond
    ): ImmunityTimeProperty = {
      val __obj = js.Dynamic.literal(
        "ImmunityTime" -> ImmunityTime.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ImmunityTimeProperty]
    }
  }

  /** Inspect the body of the web request as JSON. The body immediately follows the request headers. This is used to indicate the web request component to inspect, in the <a>FieldToMatch</a> specification. Use the specifications in this object to indicate which parts of the JSON body to inspect using the rule's inspection criteria. WAF inspects only the parts of the JSON that result from the matches that you indicate. Example JSON: <code>"JsonBody": { "MatchPattern": { "All": {} }, "MatchScope": "ALL" }</code>
    */
  @js.native
  trait JsonBody extends js.Object {
    var MatchPattern: JsonMatchPattern
    var MatchScope: JsonMatchScope
    var InvalidFallbackBehavior: js.UndefOr[BodyParsingFallbackBehavior]
    var OversizeHandling: js.UndefOr[OversizeHandling]
  }

  object JsonBody {
    @inline
    def apply(
        MatchPattern: JsonMatchPattern,
        MatchScope: JsonMatchScope,
        InvalidFallbackBehavior: js.UndefOr[BodyParsingFallbackBehavior] = js.undefined,
        OversizeHandling: js.UndefOr[OversizeHandling] = js.undefined
    ): JsonBody = {
      val __obj = js.Dynamic.literal(
        "MatchPattern" -> MatchPattern.asInstanceOf[js.Any],
        "MatchScope" -> MatchScope.asInstanceOf[js.Any]
      )

      InvalidFallbackBehavior.foreach(__v => __obj.updateDynamic("InvalidFallbackBehavior")(__v.asInstanceOf[js.Any]))
      OversizeHandling.foreach(__v => __obj.updateDynamic("OversizeHandling")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[JsonBody]
    }
  }

  /** The patterns to look for in the JSON body. WAF inspects the results of these pattern matches against the rule inspection criteria. This is used with the <a>FieldToMatch</a> option <code>JsonBody</code>.
    */
  @js.native
  trait JsonMatchPattern extends js.Object {
    var All: js.UndefOr[All]
    var IncludedPaths: js.UndefOr[JsonPointerPaths]
  }

  object JsonMatchPattern {
    @inline
    def apply(
        All: js.UndefOr[All] = js.undefined,
        IncludedPaths: js.UndefOr[JsonPointerPaths] = js.undefined
    ): JsonMatchPattern = {
      val __obj = js.Dynamic.literal()
      All.foreach(__v => __obj.updateDynamic("All")(__v.asInstanceOf[js.Any]))
      IncludedPaths.foreach(__v => __obj.updateDynamic("IncludedPaths")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[JsonMatchPattern]
    }
  }

  /** A single label container. This is used as an element of a label array in multiple contexts, for example, in <code>RuleLabels</code> inside a <a>Rule</a> and in <code>Labels</code> inside a <a>SampledHTTPRequest</a>.
    */
  @js.native
  trait Label extends js.Object {
    var Name: LabelName
  }

  object Label {
    @inline
    def apply(
        Name: LabelName
    ): Label = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[Label]
    }
  }

  /** A rule statement to match against labels that have been added to the web request by rules that have already run in the web ACL. The label match statement provides the label or namespace string to search for. The label string can represent a part or all of the fully qualified label name that had been added to the web request. Fully qualified labels have a prefix, optional namespaces, and label name. The prefix identifies the rule group or web ACL context of the rule that added the label. If you do not provide the fully qualified name in your label match string, WAF performs the search for labels that were added in the same context as the label match statement.
    */
  @js.native
  trait LabelMatchStatement extends js.Object {
    var Key: LabelMatchKey
    var Scope: LabelMatchScope
  }

  object LabelMatchStatement {
    @inline
    def apply(
        Key: LabelMatchKey,
        Scope: LabelMatchScope
    ): LabelMatchStatement = {
      val __obj = js.Dynamic.literal(
        "Key" -> Key.asInstanceOf[js.Any],
        "Scope" -> Scope.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[LabelMatchStatement]
    }
  }

  /** A single label name condition for a <a>Condition</a> in a logging filter.
    */
  @js.native
  trait LabelNameCondition extends js.Object {
    var LabelName: LabelName
  }

  object LabelNameCondition {
    @inline
    def apply(
        LabelName: LabelName
    ): LabelNameCondition = {
      val __obj = js.Dynamic.literal(
        "LabelName" -> LabelName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[LabelNameCondition]
    }
  }

  /** List of labels used by one or more of the rules of a <a>RuleGroup</a>. This summary object is used for the following rule group lists: * <code>AvailableLabels</code> - Labels that rules add to matching requests. These labels are defined in the <code>RuleLabels</code> for a <a>Rule</a>. * <code>ConsumedLabels</code> - Labels that rules match against. These labels are defined in a <code>LabelMatchStatement</code> specification, in the <a>Statement</a> definition of a rule.
    */
  @js.native
  trait LabelSummary extends js.Object {
    var Name: js.UndefOr[LabelName]
  }

  object LabelSummary {
    @inline
    def apply(
        Name: js.UndefOr[LabelName] = js.undefined
    ): LabelSummary = {
      val __obj = js.Dynamic.literal()
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LabelSummary]
    }
  }

  @js.native
  trait ListAvailableManagedRuleGroupVersionsRequest extends js.Object {
    var Name: EntityName
    var Scope: Scope
    var VendorName: VendorName
    var Limit: js.UndefOr[PaginationLimit]
    var NextMarker: js.UndefOr[NextMarker]
  }

  object ListAvailableManagedRuleGroupVersionsRequest {
    @inline
    def apply(
        Name: EntityName,
        Scope: Scope,
        VendorName: VendorName,
        Limit: js.UndefOr[PaginationLimit] = js.undefined,
        NextMarker: js.UndefOr[NextMarker] = js.undefined
    ): ListAvailableManagedRuleGroupVersionsRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "Scope" -> Scope.asInstanceOf[js.Any],
        "VendorName" -> VendorName.asInstanceOf[js.Any]
      )

      Limit.foreach(__v => __obj.updateDynamic("Limit")(__v.asInstanceOf[js.Any]))
      NextMarker.foreach(__v => __obj.updateDynamic("NextMarker")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAvailableManagedRuleGroupVersionsRequest]
    }
  }

  @js.native
  trait ListAvailableManagedRuleGroupVersionsResponse extends js.Object {
    var CurrentDefaultVersion: js.UndefOr[VersionKeyString]
    var NextMarker: js.UndefOr[NextMarker]
    var Versions: js.UndefOr[ManagedRuleGroupVersions]
  }

  object ListAvailableManagedRuleGroupVersionsResponse {
    @inline
    def apply(
        CurrentDefaultVersion: js.UndefOr[VersionKeyString] = js.undefined,
        NextMarker: js.UndefOr[NextMarker] = js.undefined,
        Versions: js.UndefOr[ManagedRuleGroupVersions] = js.undefined
    ): ListAvailableManagedRuleGroupVersionsResponse = {
      val __obj = js.Dynamic.literal()
      CurrentDefaultVersion.foreach(__v => __obj.updateDynamic("CurrentDefaultVersion")(__v.asInstanceOf[js.Any]))
      NextMarker.foreach(__v => __obj.updateDynamic("NextMarker")(__v.asInstanceOf[js.Any]))
      Versions.foreach(__v => __obj.updateDynamic("Versions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAvailableManagedRuleGroupVersionsResponse]
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
    var Scope: Scope
    var Limit: js.UndefOr[PaginationLimit]
    var NextMarker: js.UndefOr[NextMarker]
  }

  object ListLoggingConfigurationsRequest {
    @inline
    def apply(
        Scope: Scope,
        Limit: js.UndefOr[PaginationLimit] = js.undefined,
        NextMarker: js.UndefOr[NextMarker] = js.undefined
    ): ListLoggingConfigurationsRequest = {
      val __obj = js.Dynamic.literal(
        "Scope" -> Scope.asInstanceOf[js.Any]
      )

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
  trait ListManagedRuleSetsRequest extends js.Object {
    var Scope: Scope
    var Limit: js.UndefOr[PaginationLimit]
    var NextMarker: js.UndefOr[NextMarker]
  }

  object ListManagedRuleSetsRequest {
    @inline
    def apply(
        Scope: Scope,
        Limit: js.UndefOr[PaginationLimit] = js.undefined,
        NextMarker: js.UndefOr[NextMarker] = js.undefined
    ): ListManagedRuleSetsRequest = {
      val __obj = js.Dynamic.literal(
        "Scope" -> Scope.asInstanceOf[js.Any]
      )

      Limit.foreach(__v => __obj.updateDynamic("Limit")(__v.asInstanceOf[js.Any]))
      NextMarker.foreach(__v => __obj.updateDynamic("NextMarker")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListManagedRuleSetsRequest]
    }
  }

  @js.native
  trait ListManagedRuleSetsResponse extends js.Object {
    var ManagedRuleSets: js.UndefOr[ManagedRuleSetSummaries]
    var NextMarker: js.UndefOr[NextMarker]
  }

  object ListManagedRuleSetsResponse {
    @inline
    def apply(
        ManagedRuleSets: js.UndefOr[ManagedRuleSetSummaries] = js.undefined,
        NextMarker: js.UndefOr[NextMarker] = js.undefined
    ): ListManagedRuleSetsResponse = {
      val __obj = js.Dynamic.literal()
      ManagedRuleSets.foreach(__v => __obj.updateDynamic("ManagedRuleSets")(__v.asInstanceOf[js.Any]))
      NextMarker.foreach(__v => __obj.updateDynamic("NextMarker")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListManagedRuleSetsResponse]
    }
  }

  @js.native
  trait ListMobileSdkReleasesRequest extends js.Object {
    var Platform: Platform
    var Limit: js.UndefOr[PaginationLimit]
    var NextMarker: js.UndefOr[NextMarker]
  }

  object ListMobileSdkReleasesRequest {
    @inline
    def apply(
        Platform: Platform,
        Limit: js.UndefOr[PaginationLimit] = js.undefined,
        NextMarker: js.UndefOr[NextMarker] = js.undefined
    ): ListMobileSdkReleasesRequest = {
      val __obj = js.Dynamic.literal(
        "Platform" -> Platform.asInstanceOf[js.Any]
      )

      Limit.foreach(__v => __obj.updateDynamic("Limit")(__v.asInstanceOf[js.Any]))
      NextMarker.foreach(__v => __obj.updateDynamic("NextMarker")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListMobileSdkReleasesRequest]
    }
  }

  @js.native
  trait ListMobileSdkReleasesResponse extends js.Object {
    var NextMarker: js.UndefOr[NextMarker]
    var ReleaseSummaries: js.UndefOr[ReleaseSummaries]
  }

  object ListMobileSdkReleasesResponse {
    @inline
    def apply(
        NextMarker: js.UndefOr[NextMarker] = js.undefined,
        ReleaseSummaries: js.UndefOr[ReleaseSummaries] = js.undefined
    ): ListMobileSdkReleasesResponse = {
      val __obj = js.Dynamic.literal()
      NextMarker.foreach(__v => __obj.updateDynamic("NextMarker")(__v.asInstanceOf[js.Any]))
      ReleaseSummaries.foreach(__v => __obj.updateDynamic("ReleaseSummaries")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListMobileSdkReleasesResponse]
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

  /** Defines an association between logging destinations and a web ACL resource, for logging from WAF. As part of the association, you can specify parts of the standard logging fields to keep out of the logs and you can specify filters so that you log only a subset of the logging records.
    *
    * '''Note:'''You can define one logging destination per web ACL. You can access information about the traffic that WAF inspects using the following steps: <ol> * Create your logging destination. You can use an Amazon CloudWatch Logs log group, an Amazon Simple Storage Service (Amazon S3) bucket, or an Amazon Kinesis Data Firehose. For information about configuring logging destinations and the permissions that are required for each, see [[https://docs.aws.amazon.com/waf/latest/developerguide/logging.html|Logging web ACL traffic information]] in the <i>WAF Developer Guide</i>. * Associate your logging destination to your web ACL using a <code>PutLoggingConfiguration</code> request. </ol> When you successfully enable logging using a <code>PutLoggingConfiguration</code> request, WAF creates an additional role or policy that is required to write logs to the logging destination. For an Amazon CloudWatch Logs log group, WAF creates a resource policy on the log group. For an Amazon S3
    * bucket, WAF creates a bucket policy. For an Amazon Kinesis Data Firehose, WAF creates a service-linked role. For additional information about web ACL logging, see [[https://docs.aws.amazon.com/waf/latest/developerguide/logging.html|Logging web ACL traffic information]] in the <i>WAF Developer Guide</i>.
    */
  @js.native
  trait LoggingConfiguration extends js.Object {
    var LogDestinationConfigs: LogDestinationConfigs
    var ResourceArn: ResourceArn
    var LoggingFilter: js.UndefOr[LoggingFilter]
    var ManagedByFirewallManager: js.UndefOr[Boolean]
    var RedactedFields: js.UndefOr[RedactedFields]
  }

  object LoggingConfiguration {
    @inline
    def apply(
        LogDestinationConfigs: LogDestinationConfigs,
        ResourceArn: ResourceArn,
        LoggingFilter: js.UndefOr[LoggingFilter] = js.undefined,
        ManagedByFirewallManager: js.UndefOr[Boolean] = js.undefined,
        RedactedFields: js.UndefOr[RedactedFields] = js.undefined
    ): LoggingConfiguration = {
      val __obj = js.Dynamic.literal(
        "LogDestinationConfigs" -> LogDestinationConfigs.asInstanceOf[js.Any],
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any]
      )

      LoggingFilter.foreach(__v => __obj.updateDynamic("LoggingFilter")(__v.asInstanceOf[js.Any]))
      ManagedByFirewallManager.foreach(__v => __obj.updateDynamic("ManagedByFirewallManager")(__v.asInstanceOf[js.Any]))
      RedactedFields.foreach(__v => __obj.updateDynamic("RedactedFields")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LoggingConfiguration]
    }
  }

  /** Filtering that specifies which web requests are kept in the logs and which are dropped, defined for a web ACL's <a>LoggingConfiguration</a>. You can filter on the rule action and on the web request labels that were applied by matching rules during web ACL evaluation.
    */
  @js.native
  trait LoggingFilter extends js.Object {
    var DefaultBehavior: FilterBehavior
    var Filters: Filters
  }

  object LoggingFilter {
    @inline
    def apply(
        DefaultBehavior: FilterBehavior,
        Filters: Filters
    ): LoggingFilter = {
      val __obj = js.Dynamic.literal(
        "DefaultBehavior" -> DefaultBehavior.asInstanceOf[js.Any],
        "Filters" -> Filters.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[LoggingFilter]
    }
  }

  /** Additional information that's used by a managed rule group. Many managed rule groups don't require this. Use the <code>AWSManagedRulesBotControlRuleSet</code> configuration object to configure the protection level that you want the Bot Control rule group to use. For example specifications, see the examples section of <a>CreateWebACL</a>.
    */
  @js.native
  trait ManagedRuleGroupConfig extends js.Object {
    var AWSManagedRulesBotControlRuleSet: js.UndefOr[AWSManagedRulesBotControlRuleSet]
    var LoginPath: js.UndefOr[LoginPathString]
    var PasswordField: js.UndefOr[PasswordField]
    var PayloadType: js.UndefOr[PayloadType]
    var UsernameField: js.UndefOr[UsernameField]
  }

  object ManagedRuleGroupConfig {
    @inline
    def apply(
        AWSManagedRulesBotControlRuleSet: js.UndefOr[AWSManagedRulesBotControlRuleSet] = js.undefined,
        LoginPath: js.UndefOr[LoginPathString] = js.undefined,
        PasswordField: js.UndefOr[PasswordField] = js.undefined,
        PayloadType: js.UndefOr[PayloadType] = js.undefined,
        UsernameField: js.UndefOr[UsernameField] = js.undefined
    ): ManagedRuleGroupConfig = {
      val __obj = js.Dynamic.literal()
      AWSManagedRulesBotControlRuleSet.foreach(__v => __obj.updateDynamic("AWSManagedRulesBotControlRuleSet")(__v.asInstanceOf[js.Any]))
      LoginPath.foreach(__v => __obj.updateDynamic("LoginPath")(__v.asInstanceOf[js.Any]))
      PasswordField.foreach(__v => __obj.updateDynamic("PasswordField")(__v.asInstanceOf[js.Any]))
      PayloadType.foreach(__v => __obj.updateDynamic("PayloadType")(__v.asInstanceOf[js.Any]))
      UsernameField.foreach(__v => __obj.updateDynamic("UsernameField")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ManagedRuleGroupConfig]
    }
  }

  /** A rule statement used to run the rules that are defined in a managed rule group. To use this, provide the vendor name and the name of the rule group in this statement. You can retrieve the required names by calling <a>ListAvailableManagedRuleGroups</a>. You cannot nest a <code>ManagedRuleGroupStatement</code>, for example for use inside a <code>NotStatement</code> or <code>OrStatement</code>. It can only be referenced as a top-level statement within a rule.
    *
    * '''Note:'''You are charged additional fees when you use the WAF Bot Control managed rule group <code>AWSManagedRulesBotControlRuleSet</code> or the WAF Fraud Control account takeover prevention (ATP) managed rule group <code>AWSManagedRulesATPRuleSet</code>. For more information, see [[http://aws.amazon.com/waf/pricing/|WAF Pricing]].
    */
  @js.native
  trait ManagedRuleGroupStatement extends js.Object {
    var Name: EntityName
    var VendorName: VendorName
    var ExcludedRules: js.UndefOr[ExcludedRules]
    var ManagedRuleGroupConfigs: js.UndefOr[ManagedRuleGroupConfigs]
    var RuleActionOverrides: js.UndefOr[RuleActionOverrides]
    var ScopeDownStatement: js.UndefOr[Statement]
    var Version: js.UndefOr[VersionKeyString]
  }

  object ManagedRuleGroupStatement {
    @inline
    def apply(
        Name: EntityName,
        VendorName: VendorName,
        ExcludedRules: js.UndefOr[ExcludedRules] = js.undefined,
        ManagedRuleGroupConfigs: js.UndefOr[ManagedRuleGroupConfigs] = js.undefined,
        RuleActionOverrides: js.UndefOr[RuleActionOverrides] = js.undefined,
        ScopeDownStatement: js.UndefOr[Statement] = js.undefined,
        Version: js.UndefOr[VersionKeyString] = js.undefined
    ): ManagedRuleGroupStatement = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "VendorName" -> VendorName.asInstanceOf[js.Any]
      )

      ExcludedRules.foreach(__v => __obj.updateDynamic("ExcludedRules")(__v.asInstanceOf[js.Any]))
      ManagedRuleGroupConfigs.foreach(__v => __obj.updateDynamic("ManagedRuleGroupConfigs")(__v.asInstanceOf[js.Any]))
      RuleActionOverrides.foreach(__v => __obj.updateDynamic("RuleActionOverrides")(__v.asInstanceOf[js.Any]))
      ScopeDownStatement.foreach(__v => __obj.updateDynamic("ScopeDownStatement")(__v.asInstanceOf[js.Any]))
      Version.foreach(__v => __obj.updateDynamic("Version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ManagedRuleGroupStatement]
    }
  }

  /** High-level information about a managed rule group, returned by <a>ListAvailableManagedRuleGroups</a>. This provides information like the name and vendor name, that you provide when you add a <a>ManagedRuleGroupStatement</a> to a web ACL. Managed rule groups include Amazon Web Services Managed Rules rule groups, which are free of charge to WAF customers, and Amazon Web Services Marketplace managed rule groups, which you can subscribe to through Amazon Web Services Marketplace.
    */
  @js.native
  trait ManagedRuleGroupSummary extends js.Object {
    var Description: js.UndefOr[EntityDescription]
    var Name: js.UndefOr[EntityName]
    var VendorName: js.UndefOr[VendorName]
    var VersioningSupported: js.UndefOr[Boolean]
  }

  object ManagedRuleGroupSummary {
    @inline
    def apply(
        Description: js.UndefOr[EntityDescription] = js.undefined,
        Name: js.UndefOr[EntityName] = js.undefined,
        VendorName: js.UndefOr[VendorName] = js.undefined,
        VersioningSupported: js.UndefOr[Boolean] = js.undefined
    ): ManagedRuleGroupSummary = {
      val __obj = js.Dynamic.literal()
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      VendorName.foreach(__v => __obj.updateDynamic("VendorName")(__v.asInstanceOf[js.Any]))
      VersioningSupported.foreach(__v => __obj.updateDynamic("VersioningSupported")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ManagedRuleGroupSummary]
    }
  }

  /** Describes a single version of a managed rule group.
    */
  @js.native
  trait ManagedRuleGroupVersion extends js.Object {
    var LastUpdateTimestamp: js.UndefOr[Timestamp]
    var Name: js.UndefOr[VersionKeyString]
  }

  object ManagedRuleGroupVersion {
    @inline
    def apply(
        LastUpdateTimestamp: js.UndefOr[Timestamp] = js.undefined,
        Name: js.UndefOr[VersionKeyString] = js.undefined
    ): ManagedRuleGroupVersion = {
      val __obj = js.Dynamic.literal()
      LastUpdateTimestamp.foreach(__v => __obj.updateDynamic("LastUpdateTimestamp")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ManagedRuleGroupVersion]
    }
  }

  /** A set of rules that is managed by Amazon Web Services and Amazon Web Services Marketplace sellers to provide versioned managed rule groups for customers of WAF.
    *
    * '''Note:'''This is intended for use only by vendors of managed rule sets. Vendors are Amazon Web Services and Amazon Web Services Marketplace sellers. Vendors, you can use the managed rule set APIs to provide controlled rollout of your versioned managed rule group offerings for your customers. The APIs are <code>ListManagedRuleSets</code>, <code>GetManagedRuleSet</code>, <code>PutManagedRuleSetVersions</code>, and <code>UpdateManagedRuleSetVersionExpiryDate</code>.
    */
  @js.native
  trait ManagedRuleSet extends js.Object {
    var ARN: ResourceArn
    var Id: EntityId
    var Name: EntityName
    var Description: js.UndefOr[EntityDescription]
    var LabelNamespace: js.UndefOr[LabelName]
    var PublishedVersions: js.UndefOr[PublishedVersions]
    var RecommendedVersion: js.UndefOr[VersionKeyString]
  }

  object ManagedRuleSet {
    @inline
    def apply(
        ARN: ResourceArn,
        Id: EntityId,
        Name: EntityName,
        Description: js.UndefOr[EntityDescription] = js.undefined,
        LabelNamespace: js.UndefOr[LabelName] = js.undefined,
        PublishedVersions: js.UndefOr[PublishedVersions] = js.undefined,
        RecommendedVersion: js.UndefOr[VersionKeyString] = js.undefined
    ): ManagedRuleSet = {
      val __obj = js.Dynamic.literal(
        "ARN" -> ARN.asInstanceOf[js.Any],
        "Id" -> Id.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      LabelNamespace.foreach(__v => __obj.updateDynamic("LabelNamespace")(__v.asInstanceOf[js.Any]))
      PublishedVersions.foreach(__v => __obj.updateDynamic("PublishedVersions")(__v.asInstanceOf[js.Any]))
      RecommendedVersion.foreach(__v => __obj.updateDynamic("RecommendedVersion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ManagedRuleSet]
    }
  }

  /** High-level information for a managed rule set.
    *
    * '''Note:'''This is intended for use only by vendors of managed rule sets. Vendors are Amazon Web Services and Amazon Web Services Marketplace sellers. Vendors, you can use the managed rule set APIs to provide controlled rollout of your versioned managed rule group offerings for your customers. The APIs are <code>ListManagedRuleSets</code>, <code>GetManagedRuleSet</code>, <code>PutManagedRuleSetVersions</code>, and <code>UpdateManagedRuleSetVersionExpiryDate</code>.
    */
  @js.native
  trait ManagedRuleSetSummary extends js.Object {
    var ARN: js.UndefOr[ResourceArn]
    var Description: js.UndefOr[EntityDescription]
    var Id: js.UndefOr[EntityId]
    var LabelNamespace: js.UndefOr[LabelName]
    var LockToken: js.UndefOr[LockToken]
    var Name: js.UndefOr[EntityName]
  }

  object ManagedRuleSetSummary {
    @inline
    def apply(
        ARN: js.UndefOr[ResourceArn] = js.undefined,
        Description: js.UndefOr[EntityDescription] = js.undefined,
        Id: js.UndefOr[EntityId] = js.undefined,
        LabelNamespace: js.UndefOr[LabelName] = js.undefined,
        LockToken: js.UndefOr[LockToken] = js.undefined,
        Name: js.UndefOr[EntityName] = js.undefined
    ): ManagedRuleSetSummary = {
      val __obj = js.Dynamic.literal()
      ARN.foreach(__v => __obj.updateDynamic("ARN")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      LabelNamespace.foreach(__v => __obj.updateDynamic("LabelNamespace")(__v.asInstanceOf[js.Any]))
      LockToken.foreach(__v => __obj.updateDynamic("LockToken")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ManagedRuleSetSummary]
    }
  }

  /** Information for a single version of a managed rule set.
    *
    * '''Note:'''This is intended for use only by vendors of managed rule sets. Vendors are Amazon Web Services and Amazon Web Services Marketplace sellers. Vendors, you can use the managed rule set APIs to provide controlled rollout of your versioned managed rule group offerings for your customers. The APIs are <code>ListManagedRuleSets</code>, <code>GetManagedRuleSet</code>, <code>PutManagedRuleSetVersions</code>, and <code>UpdateManagedRuleSetVersionExpiryDate</code>.
    */
  @js.native
  trait ManagedRuleSetVersion extends js.Object {
    var AssociatedRuleGroupArn: js.UndefOr[ResourceArn]
    var Capacity: js.UndefOr[CapacityUnit]
    var ExpiryTimestamp: js.UndefOr[Timestamp]
    var ForecastedLifetime: js.UndefOr[TimeWindowDay]
    var LastUpdateTimestamp: js.UndefOr[Timestamp]
    var PublishTimestamp: js.UndefOr[Timestamp]
  }

  object ManagedRuleSetVersion {
    @inline
    def apply(
        AssociatedRuleGroupArn: js.UndefOr[ResourceArn] = js.undefined,
        Capacity: js.UndefOr[CapacityUnit] = js.undefined,
        ExpiryTimestamp: js.UndefOr[Timestamp] = js.undefined,
        ForecastedLifetime: js.UndefOr[TimeWindowDay] = js.undefined,
        LastUpdateTimestamp: js.UndefOr[Timestamp] = js.undefined,
        PublishTimestamp: js.UndefOr[Timestamp] = js.undefined
    ): ManagedRuleSetVersion = {
      val __obj = js.Dynamic.literal()
      AssociatedRuleGroupArn.foreach(__v => __obj.updateDynamic("AssociatedRuleGroupArn")(__v.asInstanceOf[js.Any]))
      Capacity.foreach(__v => __obj.updateDynamic("Capacity")(__v.asInstanceOf[js.Any]))
      ExpiryTimestamp.foreach(__v => __obj.updateDynamic("ExpiryTimestamp")(__v.asInstanceOf[js.Any]))
      ForecastedLifetime.foreach(__v => __obj.updateDynamic("ForecastedLifetime")(__v.asInstanceOf[js.Any]))
      LastUpdateTimestamp.foreach(__v => __obj.updateDynamic("LastUpdateTimestamp")(__v.asInstanceOf[js.Any]))
      PublishTimestamp.foreach(__v => __obj.updateDynamic("PublishTimestamp")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ManagedRuleSetVersion]
    }
  }

  /** Inspect the HTTP method of the web request. The method indicates the type of operation that the request is asking the origin to perform. This is used only in the <a>FieldToMatch</a> specification for some web request component types. JSON specification: <code>"Method": {}</code>
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

  /** Information for a release of the mobile SDK, including release notes and tags. The mobile SDK is not generally available. Customers who have access to the mobile SDK can use it to establish and manage WAF tokens for use in HTTP(S) requests from a mobile device to WAF. For more information, see [[https://docs.aws.amazon.com/waf/latest/developerguide/waf-application-integration.html|WAF client application integration]] in the <i>WAF Developer Guide</i>.
    */
  @js.native
  trait MobileSdkRelease extends js.Object {
    var ReleaseNotes: js.UndefOr[ReleaseNotes]
    var ReleaseVersion: js.UndefOr[VersionKeyString]
    var Tags: js.UndefOr[TagList]
    var Timestamp: js.UndefOr[Timestamp]
  }

  object MobileSdkRelease {
    @inline
    def apply(
        ReleaseNotes: js.UndefOr[ReleaseNotes] = js.undefined,
        ReleaseVersion: js.UndefOr[VersionKeyString] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined,
        Timestamp: js.UndefOr[Timestamp] = js.undefined
    ): MobileSdkRelease = {
      val __obj = js.Dynamic.literal()
      ReleaseNotes.foreach(__v => __obj.updateDynamic("ReleaseNotes")(__v.asInstanceOf[js.Any]))
      ReleaseVersion.foreach(__v => __obj.updateDynamic("ReleaseVersion")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      Timestamp.foreach(__v => __obj.updateDynamic("Timestamp")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MobileSdkRelease]
    }
  }

  /** Specifies that WAF should do nothing. This is used for the <code>OverrideAction</code> setting on a <a>Rule</a> when the rule uses a rule group reference statement. This is used in the context of other settings, for example to specify values for <a>RuleAction</a> and web ACL <a>DefaultAction</a>. JSON specification: <code>"None": {}</code>
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

  /** A logical rule statement used to negate the results of another rule statement. You provide one <a>Statement</a> within the <code>NotStatement</code>.
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

  /** A logical rule statement used to combine other rule statements with OR logic. You provide more than one <a>Statement</a> within the <code>OrStatement</code>.
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

  /** The action to use in the place of the action that results from the rule group evaluation. Set the override action to none to leave the result of the rule group alone. Set it to count to override the result to count only. You can only use this for rule statements that reference a rule group, like <code>RuleGroupReferenceStatement</code> and <code>ManagedRuleGroupStatement</code>.
    *
    * '''Note:'''This option is usually set to none. It does not affect how the rules in the rule group are evaluated. If you want the rules in the rule group to only count matches, do not use this and instead use the rule action override option, with <code>Count</code> action, in your rule group reference statement settings.
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

  /** Details about your login page password field, used in a <code>ManagedRuleGroupConfig</code>.
    */
  @js.native
  trait PasswordField extends js.Object {
    var Identifier: FieldIdentifier
  }

  object PasswordField {
    @inline
    def apply(
        Identifier: FieldIdentifier
    ): PasswordField = {
      val __obj = js.Dynamic.literal(
        "Identifier" -> Identifier.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[PasswordField]
    }
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
  trait PutManagedRuleSetVersionsRequest extends js.Object {
    var Id: EntityId
    var LockToken: LockToken
    var Name: EntityName
    var Scope: Scope
    var RecommendedVersion: js.UndefOr[VersionKeyString]
    var VersionsToPublish: js.UndefOr[VersionsToPublish]
  }

  object PutManagedRuleSetVersionsRequest {
    @inline
    def apply(
        Id: EntityId,
        LockToken: LockToken,
        Name: EntityName,
        Scope: Scope,
        RecommendedVersion: js.UndefOr[VersionKeyString] = js.undefined,
        VersionsToPublish: js.UndefOr[VersionsToPublish] = js.undefined
    ): PutManagedRuleSetVersionsRequest = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any],
        "LockToken" -> LockToken.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
        "Scope" -> Scope.asInstanceOf[js.Any]
      )

      RecommendedVersion.foreach(__v => __obj.updateDynamic("RecommendedVersion")(__v.asInstanceOf[js.Any]))
      VersionsToPublish.foreach(__v => __obj.updateDynamic("VersionsToPublish")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutManagedRuleSetVersionsRequest]
    }
  }

  @js.native
  trait PutManagedRuleSetVersionsResponse extends js.Object {
    var NextLockToken: js.UndefOr[LockToken]
  }

  object PutManagedRuleSetVersionsResponse {
    @inline
    def apply(
        NextLockToken: js.UndefOr[LockToken] = js.undefined
    ): PutManagedRuleSetVersionsResponse = {
      val __obj = js.Dynamic.literal()
      NextLockToken.foreach(__v => __obj.updateDynamic("NextLockToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutManagedRuleSetVersionsResponse]
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

  /** Inspect the query string of the web request. This is the part of a URL that appears after a <code>?</code> character, if any. This is used only in the <a>FieldToMatch</a> specification for some web request component types. JSON specification: <code>"QueryString": {}</code>
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

  /** A rate-based rule tracks the rate of requests for each originating IP address, and triggers the rule action when the rate exceeds a limit that you specify on the number of requests in any 5-minute time span. You can use this to put a temporary block on requests from an IP address that is sending excessive requests. WAF tracks and manages web requests separately for each instance of a rate-based rule that you use. For example, if you provide the same rate-based rule settings in two web ACLs, each of the two rule statements represents a separate instance of the rate-based rule and gets its own tracking and management by WAF. If you define a rate-based rule inside a rule group, and then use that rule group in multiple places, each use creates a separate instance of the rate-based rule that gets its own tracking and management by WAF. When the rule action triggers, WAF blocks additional requests from the IP address until the request rate falls below the limit. You can optionally nest
    * another statement inside the rate-based statement, to narrow the scope of the rule so that it only counts requests that match the nested statement. For example, based on recent requests that you have seen from an attacker, you might create a rate-based rule with a nested AND rule statement that contains the following nested statements: * An IP match statement with an IP set that specified the address 192.0.2.44. * A string match statement that searches in the User-Agent header for the string BadBot. In this rate-based rule, you also define a rate limit. For this example, the rate limit is 1,000. Requests that meet the criteria of both of the nested statements are counted. If the count exceeds 1,000 requests per five minutes, the rule action triggers. Requests that do not meet the criteria of both of the nested statements are not counted towards the rate limit and are not affected by this rule. You cannot nest a <code>RateBasedStatement</code> inside another statement, for example
    * inside a <code>NotStatement</code> or <code>OrStatement</code>. You can define a <code>RateBasedStatement</code> inside a web ACL and inside a rule group.
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

  /** The set of IP addresses that are currently blocked for a <a>RateBasedStatement</a>.
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

  /** A single regular expression. This is used in a <a>RegexPatternSet</a>.
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

  /** A rule statement used to search web request components for a match against a single regular expression.
    */
  @js.native
  trait RegexMatchStatement extends js.Object {
    var FieldToMatch: FieldToMatch
    var RegexString: RegexPatternString
    var TextTransformations: TextTransformations
  }

  object RegexMatchStatement {
    @inline
    def apply(
        FieldToMatch: FieldToMatch,
        RegexString: RegexPatternString,
        TextTransformations: TextTransformations
    ): RegexMatchStatement = {
      val __obj = js.Dynamic.literal(
        "FieldToMatch" -> FieldToMatch.asInstanceOf[js.Any],
        "RegexString" -> RegexString.asInstanceOf[js.Any],
        "TextTransformations" -> TextTransformations.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[RegexMatchStatement]
    }
  }

  /** Contains one or more regular expressions. WAF assigns an ARN to each <code>RegexPatternSet</code> that you create. To use a set in a rule, you provide the ARN to the <a>Rule</a> statement <a>RegexPatternSetReferenceStatement</a>.
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

  /** A rule statement used to search web request components for matches with regular expressions. To use this, create a <a>RegexPatternSet</a> that specifies the expressions that you want to detect, then use the ARN of that set in this statement. A web request matches the pattern set rule statement if the request component matches any of the patterns in the set. To create a regex pattern set, see <a>CreateRegexPatternSet</a>. Each regex pattern set rule statement references a regex pattern set. You create and maintain the set independent of your rules. This allows you to use the single set in multiple rules. When you update the referenced set, WAF automatically updates all rules that reference it.
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

  /** High-level information about a <a>RegexPatternSet</a>, returned by operations like create and list. This provides information like the ID, that you can use to retrieve and manage a <code>RegexPatternSet</code>, and the ARN, that you provide to the <a>RegexPatternSetReferenceStatement</a> to use the pattern set in a <a>Rule</a>.
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

  /** High level information for an SDK release.
    */
  @js.native
  trait ReleaseSummary extends js.Object {
    var ReleaseVersion: js.UndefOr[VersionKeyString]
    var Timestamp: js.UndefOr[Timestamp]
  }

  object ReleaseSummary {
    @inline
    def apply(
        ReleaseVersion: js.UndefOr[VersionKeyString] = js.undefined,
        Timestamp: js.UndefOr[Timestamp] = js.undefined
    ): ReleaseSummary = {
      val __obj = js.Dynamic.literal()
      ReleaseVersion.foreach(__v => __obj.updateDynamic("ReleaseVersion")(__v.asInstanceOf[js.Any]))
      Timestamp.foreach(__v => __obj.updateDynamic("Timestamp")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ReleaseSummary]
    }
  }

  /** A single rule, which you can use in a <a>WebACL</a> or <a>RuleGroup</a> to identify web requests that you want to allow, block, or count. Each rule includes one top-level <a>Statement</a> that WAF uses to identify matching web requests, and parameters that govern how WAF handles them.
    */
  @js.native
  trait Rule extends js.Object {
    var Name: EntityName
    var Priority: RulePriority
    var Statement: Statement
    var VisibilityConfig: VisibilityConfig
    var Action: js.UndefOr[RuleAction]
    var CaptchaConfig: js.UndefOr[CaptchaConfig]
    var ChallengeConfig: js.UndefOr[ChallengeConfig]
    var OverrideAction: js.UndefOr[OverrideAction]
    var RuleLabels: js.UndefOr[Labels]
  }

  object Rule {
    @inline
    def apply(
        Name: EntityName,
        Priority: RulePriority,
        Statement: Statement,
        VisibilityConfig: VisibilityConfig,
        Action: js.UndefOr[RuleAction] = js.undefined,
        CaptchaConfig: js.UndefOr[CaptchaConfig] = js.undefined,
        ChallengeConfig: js.UndefOr[ChallengeConfig] = js.undefined,
        OverrideAction: js.UndefOr[OverrideAction] = js.undefined,
        RuleLabels: js.UndefOr[Labels] = js.undefined
    ): Rule = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "Priority" -> Priority.asInstanceOf[js.Any],
        "Statement" -> Statement.asInstanceOf[js.Any],
        "VisibilityConfig" -> VisibilityConfig.asInstanceOf[js.Any]
      )

      Action.foreach(__v => __obj.updateDynamic("Action")(__v.asInstanceOf[js.Any]))
      CaptchaConfig.foreach(__v => __obj.updateDynamic("CaptchaConfig")(__v.asInstanceOf[js.Any]))
      ChallengeConfig.foreach(__v => __obj.updateDynamic("ChallengeConfig")(__v.asInstanceOf[js.Any]))
      OverrideAction.foreach(__v => __obj.updateDynamic("OverrideAction")(__v.asInstanceOf[js.Any]))
      RuleLabels.foreach(__v => __obj.updateDynamic("RuleLabels")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Rule]
    }
  }

  /** The action that WAF should take on a web request when it matches a rule's statement. Settings at the web ACL level can override the rule action setting.
    */
  @js.native
  trait RuleAction extends js.Object {
    var Allow: js.UndefOr[AllowAction]
    var Block: js.UndefOr[BlockAction]
    var Captcha: js.UndefOr[CaptchaAction]
    var Challenge: js.UndefOr[ChallengeAction]
    var Count: js.UndefOr[CountAction]
  }

  object RuleAction {
    @inline
    def apply(
        Allow: js.UndefOr[AllowAction] = js.undefined,
        Block: js.UndefOr[BlockAction] = js.undefined,
        Captcha: js.UndefOr[CaptchaAction] = js.undefined,
        Challenge: js.UndefOr[ChallengeAction] = js.undefined,
        Count: js.UndefOr[CountAction] = js.undefined
    ): RuleAction = {
      val __obj = js.Dynamic.literal()
      Allow.foreach(__v => __obj.updateDynamic("Allow")(__v.asInstanceOf[js.Any]))
      Block.foreach(__v => __obj.updateDynamic("Block")(__v.asInstanceOf[js.Any]))
      Captcha.foreach(__v => __obj.updateDynamic("Captcha")(__v.asInstanceOf[js.Any]))
      Challenge.foreach(__v => __obj.updateDynamic("Challenge")(__v.asInstanceOf[js.Any]))
      Count.foreach(__v => __obj.updateDynamic("Count")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RuleAction]
    }
  }

  /** Action setting to use in the place of a rule action that is configured inside the rule group. You specify one override for each rule whose action you want to change. You can use overrides for testing, for example you can override all of rule actions to <code>Count</code> and then monitor the resulting count metrics to understand how the rule group would handle your web traffic. You can also permanently override some or all actions, to modify how the rule group manages your web traffic.
    */
  @js.native
  trait RuleActionOverride extends js.Object {
    var ActionToUse: RuleAction
    var Name: EntityName
  }

  object RuleActionOverride {
    @inline
    def apply(
        ActionToUse: RuleAction,
        Name: EntityName
    ): RuleActionOverride = {
      val __obj = js.Dynamic.literal(
        "ActionToUse" -> ActionToUse.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[RuleActionOverride]
    }
  }

  /** A rule group defines a collection of rules to inspect and control web requests that you can use in a <a>WebACL</a>. When you create a rule group, you define an immutable capacity limit. If you update a rule group, you must stay within the capacity. This allows others to reuse the rule group with confidence in its capacity requirements.
    */
  @js.native
  trait RuleGroup extends js.Object {
    var ARN: ResourceArn
    var Capacity: CapacityUnit
    var Id: EntityId
    var Name: EntityName
    var VisibilityConfig: VisibilityConfig
    var AvailableLabels: js.UndefOr[LabelSummaries]
    var ConsumedLabels: js.UndefOr[LabelSummaries]
    var CustomResponseBodies: js.UndefOr[CustomResponseBodies]
    var Description: js.UndefOr[EntityDescription]
    var LabelNamespace: js.UndefOr[LabelName]
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
        AvailableLabels: js.UndefOr[LabelSummaries] = js.undefined,
        ConsumedLabels: js.UndefOr[LabelSummaries] = js.undefined,
        CustomResponseBodies: js.UndefOr[CustomResponseBodies] = js.undefined,
        Description: js.UndefOr[EntityDescription] = js.undefined,
        LabelNamespace: js.UndefOr[LabelName] = js.undefined,
        Rules: js.UndefOr[Rules] = js.undefined
    ): RuleGroup = {
      val __obj = js.Dynamic.literal(
        "ARN" -> ARN.asInstanceOf[js.Any],
        "Capacity" -> Capacity.asInstanceOf[js.Any],
        "Id" -> Id.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
        "VisibilityConfig" -> VisibilityConfig.asInstanceOf[js.Any]
      )

      AvailableLabels.foreach(__v => __obj.updateDynamic("AvailableLabels")(__v.asInstanceOf[js.Any]))
      ConsumedLabels.foreach(__v => __obj.updateDynamic("ConsumedLabels")(__v.asInstanceOf[js.Any]))
      CustomResponseBodies.foreach(__v => __obj.updateDynamic("CustomResponseBodies")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      LabelNamespace.foreach(__v => __obj.updateDynamic("LabelNamespace")(__v.asInstanceOf[js.Any]))
      Rules.foreach(__v => __obj.updateDynamic("Rules")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RuleGroup]
    }
  }

  /** A rule statement used to run the rules that are defined in a <a>RuleGroup</a>. To use this, create a rule group with your rules, then provide the ARN of the rule group in this statement. You cannot nest a <code>RuleGroupReferenceStatement</code>, for example for use inside a <code>NotStatement</code> or <code>OrStatement</code>. You can only use a rule group reference statement at the top level inside a web ACL.
    */
  @js.native
  trait RuleGroupReferenceStatement extends js.Object {
    var ARN: ResourceArn
    var ExcludedRules: js.UndefOr[ExcludedRules]
    var RuleActionOverrides: js.UndefOr[RuleActionOverrides]
  }

  object RuleGroupReferenceStatement {
    @inline
    def apply(
        ARN: ResourceArn,
        ExcludedRules: js.UndefOr[ExcludedRules] = js.undefined,
        RuleActionOverrides: js.UndefOr[RuleActionOverrides] = js.undefined
    ): RuleGroupReferenceStatement = {
      val __obj = js.Dynamic.literal(
        "ARN" -> ARN.asInstanceOf[js.Any]
      )

      ExcludedRules.foreach(__v => __obj.updateDynamic("ExcludedRules")(__v.asInstanceOf[js.Any]))
      RuleActionOverrides.foreach(__v => __obj.updateDynamic("RuleActionOverrides")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RuleGroupReferenceStatement]
    }
  }

  /** High-level information about a <a>RuleGroup</a>, returned by operations like create and list. This provides information like the ID, that you can use to retrieve and manage a <code>RuleGroup</code>, and the ARN, that you provide to the <a>RuleGroupReferenceStatement</a> to use the rule group in a <a>Rule</a>.
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

  /** High-level information about a <a>Rule</a>, returned by operations like <a>DescribeManagedRuleGroup</a>. This provides information like the ID, that you can use to retrieve and manage a <code>RuleGroup</code>, and the ARN, that you provide to the <a>RuleGroupReferenceStatement</a> to use the rule group in a <a>Rule</a>.
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

  /** Represents a single sampled web request. The response from <a>GetSampledRequests</a> includes a <code>SampledHTTPRequests</code> complex type that appears as <code>SampledRequests</code> in the response syntax. <code>SampledHTTPRequests</code> contains an array of <code>SampledHTTPRequest</code> objects.
    */
  @js.native
  trait SampledHTTPRequest extends js.Object {
    var Request: HTTPRequest
    var Weight: SampleWeight
    var Action: js.UndefOr[Action]
    var CaptchaResponse: js.UndefOr[CaptchaResponse]
    var ChallengeResponse: js.UndefOr[ChallengeResponse]
    var Labels: js.UndefOr[Labels]
    var OverriddenAction: js.UndefOr[Action]
    var RequestHeadersInserted: js.UndefOr[HTTPHeaders]
    var ResponseCodeSent: js.UndefOr[ResponseStatusCode]
    var RuleNameWithinRuleGroup: js.UndefOr[EntityName]
    var Timestamp: js.UndefOr[Timestamp]
  }

  object SampledHTTPRequest {
    @inline
    def apply(
        Request: HTTPRequest,
        Weight: SampleWeight,
        Action: js.UndefOr[Action] = js.undefined,
        CaptchaResponse: js.UndefOr[CaptchaResponse] = js.undefined,
        ChallengeResponse: js.UndefOr[ChallengeResponse] = js.undefined,
        Labels: js.UndefOr[Labels] = js.undefined,
        OverriddenAction: js.UndefOr[Action] = js.undefined,
        RequestHeadersInserted: js.UndefOr[HTTPHeaders] = js.undefined,
        ResponseCodeSent: js.UndefOr[ResponseStatusCode] = js.undefined,
        RuleNameWithinRuleGroup: js.UndefOr[EntityName] = js.undefined,
        Timestamp: js.UndefOr[Timestamp] = js.undefined
    ): SampledHTTPRequest = {
      val __obj = js.Dynamic.literal(
        "Request" -> Request.asInstanceOf[js.Any],
        "Weight" -> Weight.asInstanceOf[js.Any]
      )

      Action.foreach(__v => __obj.updateDynamic("Action")(__v.asInstanceOf[js.Any]))
      CaptchaResponse.foreach(__v => __obj.updateDynamic("CaptchaResponse")(__v.asInstanceOf[js.Any]))
      ChallengeResponse.foreach(__v => __obj.updateDynamic("ChallengeResponse")(__v.asInstanceOf[js.Any]))
      Labels.foreach(__v => __obj.updateDynamic("Labels")(__v.asInstanceOf[js.Any]))
      OverriddenAction.foreach(__v => __obj.updateDynamic("OverriddenAction")(__v.asInstanceOf[js.Any]))
      RequestHeadersInserted.foreach(__v => __obj.updateDynamic("RequestHeadersInserted")(__v.asInstanceOf[js.Any]))
      ResponseCodeSent.foreach(__v => __obj.updateDynamic("ResponseCodeSent")(__v.asInstanceOf[js.Any]))
      RuleNameWithinRuleGroup.foreach(__v => __obj.updateDynamic("RuleNameWithinRuleGroup")(__v.asInstanceOf[js.Any]))
      Timestamp.foreach(__v => __obj.updateDynamic("Timestamp")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SampledHTTPRequest]
    }
  }

  /** Inspect one of the headers in the web request, identified by name, for example, <code>User-Agent</code> or <code>Referer</code>. The name isn't case sensitive. You can filter and inspect all headers with the <code>FieldToMatch</code> setting <code>Headers</code>. This is used to indicate the web request component to inspect, in the <a>FieldToMatch</a> specification. Example JSON: <code>"SingleHeader": { "Name": "haystack" }</code>
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

  /** Inspect one query argument in the web request, identified by name, for example <i>UserName</i> or <i>SalesRegion</i>. The name isn't case sensitive. This is used to indicate the web request component to inspect, in the <a>FieldToMatch</a> specification. Example JSON: <code>"SingleQueryArgument": { "Name": "myArgument" }</code>
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

  /** A rule statement that compares a number of bytes against the size of a request component, using a comparison operator, such as greater than (&gt;) or less than (&lt;). For example, you can use a size constraint statement to look for query strings that are longer than 100 bytes. If you configure WAF to inspect the request body, WAF inspects only the first 8192 bytes (8 KB). If the request body for your web requests never exceeds 8192 bytes, you could use a size constraint statement to block requests that have a request body greater than 8192 bytes. If you choose URI for the value of Part of the request to filter on, the slash (/) in the URI counts as one character. For example, the URI <code>/logo.jpg</code> is nine characters long.
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

  /** A rule statement that inspects for malicious SQL code. Attackers insert malicious SQL code into web requests to do things like modify your database or extract data from it.
    */
  @js.native
  trait SqliMatchStatement extends js.Object {
    var FieldToMatch: FieldToMatch
    var TextTransformations: TextTransformations
    var SensitivityLevel: js.UndefOr[SensitivityLevel]
  }

  object SqliMatchStatement {
    @inline
    def apply(
        FieldToMatch: FieldToMatch,
        TextTransformations: TextTransformations,
        SensitivityLevel: js.UndefOr[SensitivityLevel] = js.undefined
    ): SqliMatchStatement = {
      val __obj = js.Dynamic.literal(
        "FieldToMatch" -> FieldToMatch.asInstanceOf[js.Any],
        "TextTransformations" -> TextTransformations.asInstanceOf[js.Any]
      )

      SensitivityLevel.foreach(__v => __obj.updateDynamic("SensitivityLevel")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SqliMatchStatement]
    }
  }

  /** The processing guidance for a <a>Rule</a>, used by WAF to determine whether a web request matches the rule. For example specifications, see the examples section of <a>CreateWebACL</a>.
    */
  @js.native
  trait Statement extends js.Object {
    var AndStatement: js.UndefOr[AndStatement]
    var ByteMatchStatement: js.UndefOr[ByteMatchStatement]
    var GeoMatchStatement: js.UndefOr[GeoMatchStatement]
    var IPSetReferenceStatement: js.UndefOr[IPSetReferenceStatement]
    var LabelMatchStatement: js.UndefOr[LabelMatchStatement]
    var ManagedRuleGroupStatement: js.UndefOr[ManagedRuleGroupStatement]
    var NotStatement: js.UndefOr[NotStatement]
    var OrStatement: js.UndefOr[OrStatement]
    var RateBasedStatement: js.UndefOr[RateBasedStatement]
    var RegexMatchStatement: js.UndefOr[RegexMatchStatement]
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
        LabelMatchStatement: js.UndefOr[LabelMatchStatement] = js.undefined,
        ManagedRuleGroupStatement: js.UndefOr[ManagedRuleGroupStatement] = js.undefined,
        NotStatement: js.UndefOr[NotStatement] = js.undefined,
        OrStatement: js.UndefOr[OrStatement] = js.undefined,
        RateBasedStatement: js.UndefOr[RateBasedStatement] = js.undefined,
        RegexMatchStatement: js.UndefOr[RegexMatchStatement] = js.undefined,
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
      LabelMatchStatement.foreach(__v => __obj.updateDynamic("LabelMatchStatement")(__v.asInstanceOf[js.Any]))
      ManagedRuleGroupStatement.foreach(__v => __obj.updateDynamic("ManagedRuleGroupStatement")(__v.asInstanceOf[js.Any]))
      NotStatement.foreach(__v => __obj.updateDynamic("NotStatement")(__v.asInstanceOf[js.Any]))
      OrStatement.foreach(__v => __obj.updateDynamic("OrStatement")(__v.asInstanceOf[js.Any]))
      RateBasedStatement.foreach(__v => __obj.updateDynamic("RateBasedStatement")(__v.asInstanceOf[js.Any]))
      RegexMatchStatement.foreach(__v => __obj.updateDynamic("RegexMatchStatement")(__v.asInstanceOf[js.Any]))
      RegexPatternSetReferenceStatement.foreach(__v => __obj.updateDynamic("RegexPatternSetReferenceStatement")(__v.asInstanceOf[js.Any]))
      RuleGroupReferenceStatement.foreach(__v => __obj.updateDynamic("RuleGroupReferenceStatement")(__v.asInstanceOf[js.Any]))
      SizeConstraintStatement.foreach(__v => __obj.updateDynamic("SizeConstraintStatement")(__v.asInstanceOf[js.Any]))
      SqliMatchStatement.foreach(__v => __obj.updateDynamic("SqliMatchStatement")(__v.asInstanceOf[js.Any]))
      XssMatchStatement.foreach(__v => __obj.updateDynamic("XssMatchStatement")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Statement]
    }
  }

  /** A tag associated with an Amazon Web Services resource. Tags are key:value pairs that you can use to categorize and manage your resources, for purposes like billing or other management. Typically, the tag key represents a category, such as "environment", and the tag value represents a specific value within that category, such as "test," "development," or "production". Or you might set the tag key to "customer" and the value to the customer name or ID. You can specify one or more tags to add to each Amazon Web Services resource, up to 50 tags for a resource. You can tag the Amazon Web Services resources that you manage through WAF: web ACLs, rule groups, IP sets, and regex pattern sets. You can't manage or view tags through the WAF console.
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

  /** The collection of tagging definitions for an Amazon Web Services resource. Tags are key:value pairs that you can use to categorize and manage your resources, for purposes like billing or other management. Typically, the tag key represents a category, such as "environment", and the tag value represents a specific value within that category, such as "test," "development," or "production". Or you might set the tag key to "customer" and the value to the customer name or ID. You can specify one or more tags to add to each Amazon Web Services resource, up to 50 tags for a resource. You can tag the Amazon Web Services resources that you manage through WAF: web ACLs, rule groups, IP sets, and regex pattern sets. You can't manage or view tags through the WAF console.
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

  /** Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection.
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

  /** In a <a>GetSampledRequests</a> request, the <code>StartTime</code> and <code>EndTime</code> objects specify the time range for which you want WAF to return a sample of web requests. You must specify the times in Coordinated Universal Time (UTC) format. UTC format includes the special designator, <code>Z</code>. For example, <code>"2016-09-27T14:50Z"</code>. You can specify any time range in the previous three hours. In a <a>GetSampledRequests</a> response, the <code>StartTime</code> and <code>EndTime</code> objects specify the time range for which WAF actually returned a sample of web requests. WAF gets the specified number of requests from among the first 5,000 requests that your Amazon Web Services resource receives during the specified time period. If your resource receives more than 5,000 requests during that period, WAF stops sampling after the 5,000th request. In that case, <code>EndTime</code> is the time that WAF received the 5,000th request.
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
  trait UpdateManagedRuleSetVersionExpiryDateRequest extends js.Object {
    var ExpiryTimestamp: Timestamp
    var Id: EntityId
    var LockToken: LockToken
    var Name: EntityName
    var Scope: Scope
    var VersionToExpire: VersionKeyString
  }

  object UpdateManagedRuleSetVersionExpiryDateRequest {
    @inline
    def apply(
        ExpiryTimestamp: Timestamp,
        Id: EntityId,
        LockToken: LockToken,
        Name: EntityName,
        Scope: Scope,
        VersionToExpire: VersionKeyString
    ): UpdateManagedRuleSetVersionExpiryDateRequest = {
      val __obj = js.Dynamic.literal(
        "ExpiryTimestamp" -> ExpiryTimestamp.asInstanceOf[js.Any],
        "Id" -> Id.asInstanceOf[js.Any],
        "LockToken" -> LockToken.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
        "Scope" -> Scope.asInstanceOf[js.Any],
        "VersionToExpire" -> VersionToExpire.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateManagedRuleSetVersionExpiryDateRequest]
    }
  }

  @js.native
  trait UpdateManagedRuleSetVersionExpiryDateResponse extends js.Object {
    var ExpiringVersion: js.UndefOr[VersionKeyString]
    var ExpiryTimestamp: js.UndefOr[Timestamp]
    var NextLockToken: js.UndefOr[LockToken]
  }

  object UpdateManagedRuleSetVersionExpiryDateResponse {
    @inline
    def apply(
        ExpiringVersion: js.UndefOr[VersionKeyString] = js.undefined,
        ExpiryTimestamp: js.UndefOr[Timestamp] = js.undefined,
        NextLockToken: js.UndefOr[LockToken] = js.undefined
    ): UpdateManagedRuleSetVersionExpiryDateResponse = {
      val __obj = js.Dynamic.literal()
      ExpiringVersion.foreach(__v => __obj.updateDynamic("ExpiringVersion")(__v.asInstanceOf[js.Any]))
      ExpiryTimestamp.foreach(__v => __obj.updateDynamic("ExpiryTimestamp")(__v.asInstanceOf[js.Any]))
      NextLockToken.foreach(__v => __obj.updateDynamic("NextLockToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateManagedRuleSetVersionExpiryDateResponse]
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
    var CustomResponseBodies: js.UndefOr[CustomResponseBodies]
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
        CustomResponseBodies: js.UndefOr[CustomResponseBodies] = js.undefined,
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

      CustomResponseBodies.foreach(__v => __obj.updateDynamic("CustomResponseBodies")(__v.asInstanceOf[js.Any]))
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
    var CaptchaConfig: js.UndefOr[CaptchaConfig]
    var ChallengeConfig: js.UndefOr[ChallengeConfig]
    var CustomResponseBodies: js.UndefOr[CustomResponseBodies]
    var Description: js.UndefOr[EntityDescription]
    var Rules: js.UndefOr[Rules]
    var TokenDomains: js.UndefOr[TokenDomains]
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
        CaptchaConfig: js.UndefOr[CaptchaConfig] = js.undefined,
        ChallengeConfig: js.UndefOr[ChallengeConfig] = js.undefined,
        CustomResponseBodies: js.UndefOr[CustomResponseBodies] = js.undefined,
        Description: js.UndefOr[EntityDescription] = js.undefined,
        Rules: js.UndefOr[Rules] = js.undefined,
        TokenDomains: js.UndefOr[TokenDomains] = js.undefined
    ): UpdateWebACLRequest = {
      val __obj = js.Dynamic.literal(
        "DefaultAction" -> DefaultAction.asInstanceOf[js.Any],
        "Id" -> Id.asInstanceOf[js.Any],
        "LockToken" -> LockToken.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
        "Scope" -> Scope.asInstanceOf[js.Any],
        "VisibilityConfig" -> VisibilityConfig.asInstanceOf[js.Any]
      )

      CaptchaConfig.foreach(__v => __obj.updateDynamic("CaptchaConfig")(__v.asInstanceOf[js.Any]))
      ChallengeConfig.foreach(__v => __obj.updateDynamic("ChallengeConfig")(__v.asInstanceOf[js.Any]))
      CustomResponseBodies.foreach(__v => __obj.updateDynamic("CustomResponseBodies")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Rules.foreach(__v => __obj.updateDynamic("Rules")(__v.asInstanceOf[js.Any]))
      TokenDomains.foreach(__v => __obj.updateDynamic("TokenDomains")(__v.asInstanceOf[js.Any]))
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

  /** Inspect the path component of the URI of the web request. This is the part of the web request that identifies a resource. For example, <code>/images/daily-ad.jpg</code>. This is used only in the <a>FieldToMatch</a> specification for some web request component types. JSON specification: <code>"UriPath": {}</code>
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

  /** Details about your login page username field, used in a <code>ManagedRuleGroupConfig</code>.
    */
  @js.native
  trait UsernameField extends js.Object {
    var Identifier: FieldIdentifier
  }

  object UsernameField {
    @inline
    def apply(
        Identifier: FieldIdentifier
    ): UsernameField = {
      val __obj = js.Dynamic.literal(
        "Identifier" -> Identifier.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UsernameField]
    }
  }

  /** A version of the named managed rule group, that the rule group's vendor publishes for use by customers.
    *
    * '''Note:'''This is intended for use only by vendors of managed rule sets. Vendors are Amazon Web Services and Amazon Web Services Marketplace sellers. Vendors, you can use the managed rule set APIs to provide controlled rollout of your versioned managed rule group offerings for your customers. The APIs are <code>ListManagedRuleSets</code>, <code>GetManagedRuleSet</code>, <code>PutManagedRuleSetVersions</code>, and <code>UpdateManagedRuleSetVersionExpiryDate</code>.
    */
  @js.native
  trait VersionToPublish extends js.Object {
    var AssociatedRuleGroupArn: js.UndefOr[ResourceArn]
    var ForecastedLifetime: js.UndefOr[TimeWindowDay]
  }

  object VersionToPublish {
    @inline
    def apply(
        AssociatedRuleGroupArn: js.UndefOr[ResourceArn] = js.undefined,
        ForecastedLifetime: js.UndefOr[TimeWindowDay] = js.undefined
    ): VersionToPublish = {
      val __obj = js.Dynamic.literal()
      AssociatedRuleGroupArn.foreach(__v => __obj.updateDynamic("AssociatedRuleGroupArn")(__v.asInstanceOf[js.Any]))
      ForecastedLifetime.foreach(__v => __obj.updateDynamic("ForecastedLifetime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VersionToPublish]
    }
  }

  /** Defines and enables Amazon CloudWatch metrics and web request sample collection.
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

  /** A web ACL defines a collection of rules to use to inspect and control web requests. Each rule has an action defined (allow, block, or count) for requests that match the statement of the rule. In the web ACL, you assign a default action to take (allow, block) for any request that does not match any of the rules. The rules in a web ACL can be a combination of the types <a>Rule</a>, <a>RuleGroup</a>, and managed rule group. You can associate a web ACL with one or more Amazon Web Services resources to protect. The resources can be an Amazon CloudFront distribution, an Amazon API Gateway REST API, an Application Load Balancer, an AppSync GraphQL API, or an Amazon Cognito user pool.
    */
  @js.native
  trait WebACL extends js.Object {
    var ARN: ResourceArn
    var DefaultAction: DefaultAction
    var Id: EntityId
    var Name: EntityName
    var VisibilityConfig: VisibilityConfig
    var Capacity: js.UndefOr[ConsumedCapacity]
    var CaptchaConfig: js.UndefOr[CaptchaConfig]
    var ChallengeConfig: js.UndefOr[ChallengeConfig]
    var CustomResponseBodies: js.UndefOr[CustomResponseBodies]
    var Description: js.UndefOr[EntityDescription]
    var LabelNamespace: js.UndefOr[LabelName]
    var ManagedByFirewallManager: js.UndefOr[Boolean]
    var PostProcessFirewallManagerRuleGroups: js.UndefOr[FirewallManagerRuleGroups]
    var PreProcessFirewallManagerRuleGroups: js.UndefOr[FirewallManagerRuleGroups]
    var Rules: js.UndefOr[Rules]
    var TokenDomains: js.UndefOr[TokenDomains]
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
        CaptchaConfig: js.UndefOr[CaptchaConfig] = js.undefined,
        ChallengeConfig: js.UndefOr[ChallengeConfig] = js.undefined,
        CustomResponseBodies: js.UndefOr[CustomResponseBodies] = js.undefined,
        Description: js.UndefOr[EntityDescription] = js.undefined,
        LabelNamespace: js.UndefOr[LabelName] = js.undefined,
        ManagedByFirewallManager: js.UndefOr[Boolean] = js.undefined,
        PostProcessFirewallManagerRuleGroups: js.UndefOr[FirewallManagerRuleGroups] = js.undefined,
        PreProcessFirewallManagerRuleGroups: js.UndefOr[FirewallManagerRuleGroups] = js.undefined,
        Rules: js.UndefOr[Rules] = js.undefined,
        TokenDomains: js.UndefOr[TokenDomains] = js.undefined
    ): WebACL = {
      val __obj = js.Dynamic.literal(
        "ARN" -> ARN.asInstanceOf[js.Any],
        "DefaultAction" -> DefaultAction.asInstanceOf[js.Any],
        "Id" -> Id.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
        "VisibilityConfig" -> VisibilityConfig.asInstanceOf[js.Any]
      )

      Capacity.foreach(__v => __obj.updateDynamic("Capacity")(__v.asInstanceOf[js.Any]))
      CaptchaConfig.foreach(__v => __obj.updateDynamic("CaptchaConfig")(__v.asInstanceOf[js.Any]))
      ChallengeConfig.foreach(__v => __obj.updateDynamic("ChallengeConfig")(__v.asInstanceOf[js.Any]))
      CustomResponseBodies.foreach(__v => __obj.updateDynamic("CustomResponseBodies")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      LabelNamespace.foreach(__v => __obj.updateDynamic("LabelNamespace")(__v.asInstanceOf[js.Any]))
      ManagedByFirewallManager.foreach(__v => __obj.updateDynamic("ManagedByFirewallManager")(__v.asInstanceOf[js.Any]))
      PostProcessFirewallManagerRuleGroups.foreach(__v => __obj.updateDynamic("PostProcessFirewallManagerRuleGroups")(__v.asInstanceOf[js.Any]))
      PreProcessFirewallManagerRuleGroups.foreach(__v => __obj.updateDynamic("PreProcessFirewallManagerRuleGroups")(__v.asInstanceOf[js.Any]))
      Rules.foreach(__v => __obj.updateDynamic("Rules")(__v.asInstanceOf[js.Any]))
      TokenDomains.foreach(__v => __obj.updateDynamic("TokenDomains")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[WebACL]
    }
  }

  /** High-level information about a <a>WebACL</a>, returned by operations like create and list. This provides information like the ID, that you can use to retrieve and manage a <code>WebACL</code>, and the ARN, that you provide to operations like <a>AssociateWebACL</a>.
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

  /** A rule statement that inspects for cross-site scripting (XSS) attacks. In XSS attacks, the attacker uses vulnerabilities in a benign website as a vehicle to inject malicious client-site scripts into other legitimate web browsers.
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
