package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

package object inspector {
  type AddRemoveAttributesFindingArnList      = js.Array[Arn]
  type AgentHealth                            = String
  type AgentHealthCode                        = String
  type AgentHealthCodeList                    = js.Array[AgentHealthCode]
  type AgentHealthList                        = js.Array[AgentHealth]
  type AgentId                                = String
  type AgentIdList                            = js.Array[AgentId]
  type AgentPreviewList                       = js.Array[AgentPreview]
  type AgentVersion                           = String
  type AmiId                                  = String
  type Arn                                    = String
  type ArnCount                               = Int
  type AssessmentRulesPackageArnList          = js.Array[Arn]
  type AssessmentRunAgentList                 = js.Array[AssessmentRunAgent]
  type AssessmentRunDuration                  = Int
  type AssessmentRunFindingCounts             = js.Dictionary[FindingCount]
  type AssessmentRunList                      = js.Array[AssessmentRun]
  type AssessmentRunName                      = String
  type AssessmentRunNotificationList          = js.Array[AssessmentRunNotification]
  type AssessmentRunNotificationSnsStatusCode = String
  type AssessmentRunState                     = String
  type AssessmentRunStateChangeList           = js.Array[AssessmentRunStateChange]
  type AssessmentRunStateList                 = js.Array[AssessmentRunState]
  type AssessmentTargetList                   = js.Array[AssessmentTarget]
  type AssessmentTargetName                   = String
  type AssessmentTemplateList                 = js.Array[AssessmentTemplate]
  type AssessmentTemplateName                 = String
  type AssessmentTemplateRulesPackageArnList  = js.Array[Arn]
  type AssetType                              = String
  type AttributeKey                           = String
  type AttributeList                          = js.Array[Attribute]
  type AttributeValue                         = String
  type AutoScalingGroup                       = String
  type AutoScalingGroupList                   = js.Array[AutoScalingGroup]
  type BatchDescribeArnList                   = js.Array[Arn]
  type BatchDescribeExclusionsArnList         = js.Array[Arn]
  type EventSubscriptionList                  = js.Array[EventSubscription]
  type ExclusionMap                           = js.Dictionary[Exclusion]
  type ExclusionPreviewList                   = js.Array[ExclusionPreview]
  type FailedItemErrorCode                    = String
  type FailedItems                            = js.Dictionary[FailedItemDetails]
  type FilterRulesPackageArnList              = js.Array[Arn]
  type FindingCount                           = Int
  type FindingId                              = String
  type FindingList                            = js.Array[Finding]
  type Hostname                               = String
  type InspectorEvent                         = String
  type IocConfidence                          = Int
  type Ipv4Address                            = String
  type Ipv4AddressList                        = js.Array[Ipv4Address]
  type Ipv6Addresses                          = js.Array[Text]
  type KernelVersion                          = String
  type ListEventSubscriptionsMaxResults       = Int
  type ListMaxResults                         = Int
  type ListParentArnList                      = js.Array[Arn]
  type ListReturnedArnList                    = js.Array[Arn]
  type Locale                                 = String
  type Message                                = String
  type MessageType                            = String
  type NamePattern                            = String
  type NetworkInterfaces                      = js.Array[NetworkInterface]
  type NumericSeverity                        = Double
  type NumericVersion                         = Int
  type OperatingSystem                        = String
  type PaginationToken                        = String
  type PreviewAgentsMaxResults                = Int
  type PreviewStatus                          = String
  type PrivateIpAddresses                     = js.Array[PrivateIp]
  type ProviderName                           = String
  type ReportFileFormat                       = String
  type ReportStatus                           = String
  type ReportType                             = String
  type ResourceGroupList                      = js.Array[ResourceGroup]
  type ResourceGroupTags                      = js.Array[ResourceGroupTag]
  type RuleName                               = String
  type RuleNameList                           = js.Array[RuleName]
  type RulesPackageList                       = js.Array[RulesPackage]
  type RulesPackageName                       = String
  type ScopeList                              = js.Array[Scope]
  type ScopeType                              = String
  type ScopeValue                             = String
  type SecurityGroups                         = js.Array[SecurityGroup]
  type ServiceName                            = String
  type Severity                               = String
  type SeverityList                           = js.Array[Severity]
  type StopAction                             = String
  type SubscriptionList                       = js.Array[Subscription]
  type TagKey                                 = String
  type TagList                                = js.Array[Tag]
  type TagValue                               = String
  type Tags                                   = js.Array[Tag]
  type TelemetryMetadataList                  = js.Array[TelemetryMetadata]
  type Text                                   = String
  type Timestamp                              = js.Date
  type UUID                                   = String
  type Url                                    = String
  type UserAttributeKeyList                   = js.Array[AttributeKey]
  type UserAttributeList                      = js.Array[Attribute]
  type Version                                = String

  implicit final class InspectorOps(private val service: Inspector) extends AnyVal {

    @inline def addAttributesToFindingsFuture(
        params: AddAttributesToFindingsRequest
    ): Future[AddAttributesToFindingsResponse] = service.addAttributesToFindings(params).promise.toFuture
    @inline def createAssessmentTargetFuture(
        params: CreateAssessmentTargetRequest
    ): Future[CreateAssessmentTargetResponse] = service.createAssessmentTarget(params).promise.toFuture
    @inline def createAssessmentTemplateFuture(
        params: CreateAssessmentTemplateRequest
    ): Future[CreateAssessmentTemplateResponse] = service.createAssessmentTemplate(params).promise.toFuture
    @inline def createExclusionsPreviewFuture(
        params: CreateExclusionsPreviewRequest
    ): Future[CreateExclusionsPreviewResponse] = service.createExclusionsPreview(params).promise.toFuture
    @inline def createResourceGroupFuture(params: CreateResourceGroupRequest): Future[CreateResourceGroupResponse] =
      service.createResourceGroup(params).promise.toFuture
    @inline def deleteAssessmentRunFuture(params: DeleteAssessmentRunRequest): Future[js.Object] =
      service.deleteAssessmentRun(params).promise.toFuture
    @inline def deleteAssessmentTargetFuture(params: DeleteAssessmentTargetRequest): Future[js.Object] =
      service.deleteAssessmentTarget(params).promise.toFuture
    @inline def deleteAssessmentTemplateFuture(params: DeleteAssessmentTemplateRequest): Future[js.Object] =
      service.deleteAssessmentTemplate(params).promise.toFuture
    @inline def describeAssessmentRunsFuture(
        params: DescribeAssessmentRunsRequest
    ): Future[DescribeAssessmentRunsResponse] = service.describeAssessmentRuns(params).promise.toFuture
    @inline def describeAssessmentTargetsFuture(
        params: DescribeAssessmentTargetsRequest
    ): Future[DescribeAssessmentTargetsResponse] = service.describeAssessmentTargets(params).promise.toFuture
    @inline def describeAssessmentTemplatesFuture(
        params: DescribeAssessmentTemplatesRequest
    ): Future[DescribeAssessmentTemplatesResponse] = service.describeAssessmentTemplates(params).promise.toFuture
    @inline def describeCrossAccountAccessRoleFuture(): Future[DescribeCrossAccountAccessRoleResponse] =
      service.describeCrossAccountAccessRole().promise.toFuture
    @inline def describeExclusionsFuture(params: DescribeExclusionsRequest): Future[DescribeExclusionsResponse] =
      service.describeExclusions(params).promise.toFuture
    @inline def describeFindingsFuture(params: DescribeFindingsRequest): Future[DescribeFindingsResponse] =
      service.describeFindings(params).promise.toFuture
    @inline def describeResourceGroupsFuture(
        params: DescribeResourceGroupsRequest
    ): Future[DescribeResourceGroupsResponse] = service.describeResourceGroups(params).promise.toFuture
    @inline def describeRulesPackagesFuture(
        params: DescribeRulesPackagesRequest
    ): Future[DescribeRulesPackagesResponse] = service.describeRulesPackages(params).promise.toFuture
    @inline def getAssessmentReportFuture(params: GetAssessmentReportRequest): Future[GetAssessmentReportResponse] =
      service.getAssessmentReport(params).promise.toFuture
    @inline def getExclusionsPreviewFuture(params: GetExclusionsPreviewRequest): Future[GetExclusionsPreviewResponse] =
      service.getExclusionsPreview(params).promise.toFuture
    @inline def getTelemetryMetadataFuture(params: GetTelemetryMetadataRequest): Future[GetTelemetryMetadataResponse] =
      service.getTelemetryMetadata(params).promise.toFuture
    @inline def listAssessmentRunAgentsFuture(
        params: ListAssessmentRunAgentsRequest
    ): Future[ListAssessmentRunAgentsResponse] = service.listAssessmentRunAgents(params).promise.toFuture
    @inline def listAssessmentRunsFuture(params: ListAssessmentRunsRequest): Future[ListAssessmentRunsResponse] =
      service.listAssessmentRuns(params).promise.toFuture
    @inline def listAssessmentTargetsFuture(
        params: ListAssessmentTargetsRequest
    ): Future[ListAssessmentTargetsResponse] = service.listAssessmentTargets(params).promise.toFuture
    @inline def listAssessmentTemplatesFuture(
        params: ListAssessmentTemplatesRequest
    ): Future[ListAssessmentTemplatesResponse] = service.listAssessmentTemplates(params).promise.toFuture
    @inline def listEventSubscriptionsFuture(
        params: ListEventSubscriptionsRequest
    ): Future[ListEventSubscriptionsResponse] = service.listEventSubscriptions(params).promise.toFuture
    @inline def listExclusionsFuture(params: ListExclusionsRequest): Future[ListExclusionsResponse] =
      service.listExclusions(params).promise.toFuture
    @inline def listFindingsFuture(params: ListFindingsRequest): Future[ListFindingsResponse] =
      service.listFindings(params).promise.toFuture
    @inline def listRulesPackagesFuture(params: ListRulesPackagesRequest): Future[ListRulesPackagesResponse] =
      service.listRulesPackages(params).promise.toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] =
      service.listTagsForResource(params).promise.toFuture
    @inline def previewAgentsFuture(params: PreviewAgentsRequest): Future[PreviewAgentsResponse] =
      service.previewAgents(params).promise.toFuture
    @inline def registerCrossAccountAccessRoleFuture(params: RegisterCrossAccountAccessRoleRequest): Future[js.Object] =
      service.registerCrossAccountAccessRole(params).promise.toFuture
    @inline def removeAttributesFromFindingsFuture(
        params: RemoveAttributesFromFindingsRequest
    ): Future[RemoveAttributesFromFindingsResponse] = service.removeAttributesFromFindings(params).promise.toFuture
    @inline def setTagsForResourceFuture(params: SetTagsForResourceRequest): Future[js.Object] =
      service.setTagsForResource(params).promise.toFuture
    @inline def startAssessmentRunFuture(params: StartAssessmentRunRequest): Future[StartAssessmentRunResponse] =
      service.startAssessmentRun(params).promise.toFuture
    @inline def stopAssessmentRunFuture(params: StopAssessmentRunRequest): Future[js.Object] =
      service.stopAssessmentRun(params).promise.toFuture
    @inline def subscribeToEventFuture(params: SubscribeToEventRequest): Future[js.Object] =
      service.subscribeToEvent(params).promise.toFuture
    @inline def unsubscribeFromEventFuture(params: UnsubscribeFromEventRequest): Future[js.Object] =
      service.unsubscribeFromEvent(params).promise.toFuture
    @inline def updateAssessmentTargetFuture(params: UpdateAssessmentTargetRequest): Future[js.Object] =
      service.updateAssessmentTarget(params).promise.toFuture
  }
}

package inspector {
  @js.native
  @JSImport("aws-sdk", "Inspector")
  class Inspector() extends js.Object {
    def this(config: AWSConfig) = this()

    def addAttributesToFindings(params: AddAttributesToFindingsRequest): Request[AddAttributesToFindingsResponse] =
      js.native
    def createAssessmentTarget(params: CreateAssessmentTargetRequest): Request[CreateAssessmentTargetResponse] =
      js.native
    def createAssessmentTemplate(params: CreateAssessmentTemplateRequest): Request[CreateAssessmentTemplateResponse] =
      js.native
    def createExclusionsPreview(params: CreateExclusionsPreviewRequest): Request[CreateExclusionsPreviewResponse] =
      js.native
    def createResourceGroup(params: CreateResourceGroupRequest): Request[CreateResourceGroupResponse] = js.native
    def deleteAssessmentRun(params: DeleteAssessmentRunRequest): Request[js.Object]                   = js.native
    def deleteAssessmentTarget(params: DeleteAssessmentTargetRequest): Request[js.Object]             = js.native
    def deleteAssessmentTemplate(params: DeleteAssessmentTemplateRequest): Request[js.Object]         = js.native
    def describeAssessmentRuns(params: DescribeAssessmentRunsRequest): Request[DescribeAssessmentRunsResponse] =
      js.native
    def describeAssessmentTargets(
        params: DescribeAssessmentTargetsRequest
    ): Request[DescribeAssessmentTargetsResponse] = js.native
    def describeAssessmentTemplates(
        params: DescribeAssessmentTemplatesRequest
    ): Request[DescribeAssessmentTemplatesResponse]                                                = js.native
    def describeCrossAccountAccessRole(): Request[DescribeCrossAccountAccessRoleResponse]          = js.native
    def describeExclusions(params: DescribeExclusionsRequest): Request[DescribeExclusionsResponse] = js.native
    def describeFindings(params: DescribeFindingsRequest): Request[DescribeFindingsResponse]       = js.native
    def describeResourceGroups(params: DescribeResourceGroupsRequest): Request[DescribeResourceGroupsResponse] =
      js.native
    def describeRulesPackages(params: DescribeRulesPackagesRequest): Request[DescribeRulesPackagesResponse] = js.native
    def getAssessmentReport(params: GetAssessmentReportRequest): Request[GetAssessmentReportResponse]       = js.native
    def getExclusionsPreview(params: GetExclusionsPreviewRequest): Request[GetExclusionsPreviewResponse]    = js.native
    def getTelemetryMetadata(params: GetTelemetryMetadataRequest): Request[GetTelemetryMetadataResponse]    = js.native
    def listAssessmentRunAgents(params: ListAssessmentRunAgentsRequest): Request[ListAssessmentRunAgentsResponse] =
      js.native
    def listAssessmentRuns(params: ListAssessmentRunsRequest): Request[ListAssessmentRunsResponse]          = js.native
    def listAssessmentTargets(params: ListAssessmentTargetsRequest): Request[ListAssessmentTargetsResponse] = js.native
    def listAssessmentTemplates(params: ListAssessmentTemplatesRequest): Request[ListAssessmentTemplatesResponse] =
      js.native
    def listEventSubscriptions(params: ListEventSubscriptionsRequest): Request[ListEventSubscriptionsResponse] =
      js.native
    def listExclusions(params: ListExclusionsRequest): Request[ListExclusionsResponse]                    = js.native
    def listFindings(params: ListFindingsRequest): Request[ListFindingsResponse]                          = js.native
    def listRulesPackages(params: ListRulesPackagesRequest): Request[ListRulesPackagesResponse]           = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse]     = js.native
    def previewAgents(params: PreviewAgentsRequest): Request[PreviewAgentsResponse]                       = js.native
    def registerCrossAccountAccessRole(params: RegisterCrossAccountAccessRoleRequest): Request[js.Object] = js.native
    def removeAttributesFromFindings(
        params: RemoveAttributesFromFindingsRequest
    ): Request[RemoveAttributesFromFindingsResponse]                                               = js.native
    def setTagsForResource(params: SetTagsForResourceRequest): Request[js.Object]                  = js.native
    def startAssessmentRun(params: StartAssessmentRunRequest): Request[StartAssessmentRunResponse] = js.native
    def stopAssessmentRun(params: StopAssessmentRunRequest): Request[js.Object]                    = js.native
    def subscribeToEvent(params: SubscribeToEventRequest): Request[js.Object]                      = js.native
    def unsubscribeFromEvent(params: UnsubscribeFromEventRequest): Request[js.Object]              = js.native
    def updateAssessmentTarget(params: UpdateAssessmentTargetRequest): Request[js.Object]          = js.native
  }

  @js.native
  trait AddAttributesToFindingsRequest extends js.Object {
    var attributes: UserAttributeList
    var findingArns: AddRemoveAttributesFindingArnList
  }

  object AddAttributesToFindingsRequest {
    @inline
    def apply(
        attributes: UserAttributeList,
        findingArns: AddRemoveAttributesFindingArnList
    ): AddAttributesToFindingsRequest = {
      val __obj = js.Dynamic.literal(
        "attributes"  -> attributes.asInstanceOf[js.Any],
        "findingArns" -> findingArns.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[AddAttributesToFindingsRequest]
    }
  }

  @js.native
  trait AddAttributesToFindingsResponse extends js.Object {
    var failedItems: FailedItems
  }

  object AddAttributesToFindingsResponse {
    @inline
    def apply(
        failedItems: FailedItems
    ): AddAttributesToFindingsResponse = {
      val __obj = js.Dynamic.literal(
        "failedItems" -> failedItems.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[AddAttributesToFindingsResponse]
    }
  }

  /**
    * Contains information about an Amazon Inspector agent. This data type is used as a request parameter in the <a>ListAssessmentRunAgents</a> action.
    */
  @js.native
  trait AgentFilter extends js.Object {
    var agentHealthCodes: AgentHealthCodeList
    var agentHealths: AgentHealthList
  }

  object AgentFilter {
    @inline
    def apply(
        agentHealthCodes: AgentHealthCodeList,
        agentHealths: AgentHealthList
    ): AgentFilter = {
      val __obj = js.Dynamic.literal(
        "agentHealthCodes" -> agentHealthCodes.asInstanceOf[js.Any],
        "agentHealths"     -> agentHealths.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[AgentFilter]
    }
  }

  object AgentHealthEnum {
    val HEALTHY   = "HEALTHY"
    val UNHEALTHY = "UNHEALTHY"
    val UNKNOWN   = "UNKNOWN"

    val values = js.Object.freeze(js.Array(HEALTHY, UNHEALTHY, UNKNOWN))
  }

  object AgentHealthCodeEnum {
    val IDLE      = "IDLE"
    val RUNNING   = "RUNNING"
    val SHUTDOWN  = "SHUTDOWN"
    val UNHEALTHY = "UNHEALTHY"
    val THROTTLED = "THROTTLED"
    val UNKNOWN   = "UNKNOWN"

    val values = js.Object.freeze(js.Array(IDLE, RUNNING, SHUTDOWN, UNHEALTHY, THROTTLED, UNKNOWN))
  }

  /**
    * Used as a response element in the <a>PreviewAgents</a> action.
    */
  @js.native
  trait AgentPreview extends js.Object {
    var agentId: AgentId
    var agentHealth: js.UndefOr[AgentHealth]
    var agentVersion: js.UndefOr[AgentVersion]
    var autoScalingGroup: js.UndefOr[AutoScalingGroup]
    var hostname: js.UndefOr[Hostname]
    var ipv4Address: js.UndefOr[Ipv4Address]
    var kernelVersion: js.UndefOr[KernelVersion]
    var operatingSystem: js.UndefOr[OperatingSystem]
  }

  object AgentPreview {
    @inline
    def apply(
        agentId: AgentId,
        agentHealth: js.UndefOr[AgentHealth] = js.undefined,
        agentVersion: js.UndefOr[AgentVersion] = js.undefined,
        autoScalingGroup: js.UndefOr[AutoScalingGroup] = js.undefined,
        hostname: js.UndefOr[Hostname] = js.undefined,
        ipv4Address: js.UndefOr[Ipv4Address] = js.undefined,
        kernelVersion: js.UndefOr[KernelVersion] = js.undefined,
        operatingSystem: js.UndefOr[OperatingSystem] = js.undefined
    ): AgentPreview = {
      val __obj = js.Dynamic.literal(
        "agentId" -> agentId.asInstanceOf[js.Any]
      )

      agentHealth.foreach(__v => __obj.updateDynamic("agentHealth")(__v.asInstanceOf[js.Any]))
      agentVersion.foreach(__v => __obj.updateDynamic("agentVersion")(__v.asInstanceOf[js.Any]))
      autoScalingGroup.foreach(__v => __obj.updateDynamic("autoScalingGroup")(__v.asInstanceOf[js.Any]))
      hostname.foreach(__v => __obj.updateDynamic("hostname")(__v.asInstanceOf[js.Any]))
      ipv4Address.foreach(__v => __obj.updateDynamic("ipv4Address")(__v.asInstanceOf[js.Any]))
      kernelVersion.foreach(__v => __obj.updateDynamic("kernelVersion")(__v.asInstanceOf[js.Any]))
      operatingSystem.foreach(__v => __obj.updateDynamic("operatingSystem")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AgentPreview]
    }
  }

  /**
    * A snapshot of an Amazon Inspector assessment run that contains the findings of the assessment run .
    *  Used as the response element in the <a>DescribeAssessmentRuns</a> action.
    */
  @js.native
  trait AssessmentRun extends js.Object {
    var arn: Arn
    var assessmentTemplateArn: Arn
    var createdAt: Timestamp
    var dataCollected: Boolean
    var durationInSeconds: AssessmentRunDuration
    var findingCounts: AssessmentRunFindingCounts
    var name: AssessmentRunName
    var notifications: AssessmentRunNotificationList
    var rulesPackageArns: AssessmentRulesPackageArnList
    var state: AssessmentRunState
    var stateChangedAt: Timestamp
    var stateChanges: AssessmentRunStateChangeList
    var userAttributesForFindings: UserAttributeList
    var completedAt: js.UndefOr[Timestamp]
    var startedAt: js.UndefOr[Timestamp]
  }

  object AssessmentRun {
    @inline
    def apply(
        arn: Arn,
        assessmentTemplateArn: Arn,
        createdAt: Timestamp,
        dataCollected: Boolean,
        durationInSeconds: AssessmentRunDuration,
        findingCounts: AssessmentRunFindingCounts,
        name: AssessmentRunName,
        notifications: AssessmentRunNotificationList,
        rulesPackageArns: AssessmentRulesPackageArnList,
        state: AssessmentRunState,
        stateChangedAt: Timestamp,
        stateChanges: AssessmentRunStateChangeList,
        userAttributesForFindings: UserAttributeList,
        completedAt: js.UndefOr[Timestamp] = js.undefined,
        startedAt: js.UndefOr[Timestamp] = js.undefined
    ): AssessmentRun = {
      val __obj = js.Dynamic.literal(
        "arn"                       -> arn.asInstanceOf[js.Any],
        "assessmentTemplateArn"     -> assessmentTemplateArn.asInstanceOf[js.Any],
        "createdAt"                 -> createdAt.asInstanceOf[js.Any],
        "dataCollected"             -> dataCollected.asInstanceOf[js.Any],
        "durationInSeconds"         -> durationInSeconds.asInstanceOf[js.Any],
        "findingCounts"             -> findingCounts.asInstanceOf[js.Any],
        "name"                      -> name.asInstanceOf[js.Any],
        "notifications"             -> notifications.asInstanceOf[js.Any],
        "rulesPackageArns"          -> rulesPackageArns.asInstanceOf[js.Any],
        "state"                     -> state.asInstanceOf[js.Any],
        "stateChangedAt"            -> stateChangedAt.asInstanceOf[js.Any],
        "stateChanges"              -> stateChanges.asInstanceOf[js.Any],
        "userAttributesForFindings" -> userAttributesForFindings.asInstanceOf[js.Any]
      )

      completedAt.foreach(__v => __obj.updateDynamic("completedAt")(__v.asInstanceOf[js.Any]))
      startedAt.foreach(__v => __obj.updateDynamic("startedAt")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssessmentRun]
    }
  }

  /**
    * Contains information about an Amazon Inspector agent. This data type is used as a response element in the <a>ListAssessmentRunAgents</a> action.
    */
  @js.native
  trait AssessmentRunAgent extends js.Object {
    var agentHealth: AgentHealth
    var agentHealthCode: AgentHealthCode
    var agentId: AgentId
    var assessmentRunArn: Arn
    var telemetryMetadata: TelemetryMetadataList
    var agentHealthDetails: js.UndefOr[Message]
    var autoScalingGroup: js.UndefOr[AutoScalingGroup]
  }

  object AssessmentRunAgent {
    @inline
    def apply(
        agentHealth: AgentHealth,
        agentHealthCode: AgentHealthCode,
        agentId: AgentId,
        assessmentRunArn: Arn,
        telemetryMetadata: TelemetryMetadataList,
        agentHealthDetails: js.UndefOr[Message] = js.undefined,
        autoScalingGroup: js.UndefOr[AutoScalingGroup] = js.undefined
    ): AssessmentRunAgent = {
      val __obj = js.Dynamic.literal(
        "agentHealth"       -> agentHealth.asInstanceOf[js.Any],
        "agentHealthCode"   -> agentHealthCode.asInstanceOf[js.Any],
        "agentId"           -> agentId.asInstanceOf[js.Any],
        "assessmentRunArn"  -> assessmentRunArn.asInstanceOf[js.Any],
        "telemetryMetadata" -> telemetryMetadata.asInstanceOf[js.Any]
      )

      agentHealthDetails.foreach(__v => __obj.updateDynamic("agentHealthDetails")(__v.asInstanceOf[js.Any]))
      autoScalingGroup.foreach(__v => __obj.updateDynamic("autoScalingGroup")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssessmentRunAgent]
    }
  }

  /**
    * Used as the request parameter in the <a>ListAssessmentRuns</a> action.
    */
  @js.native
  trait AssessmentRunFilter extends js.Object {
    var completionTimeRange: js.UndefOr[TimestampRange]
    var durationRange: js.UndefOr[DurationRange]
    var namePattern: js.UndefOr[NamePattern]
    var rulesPackageArns: js.UndefOr[FilterRulesPackageArnList]
    var startTimeRange: js.UndefOr[TimestampRange]
    var stateChangeTimeRange: js.UndefOr[TimestampRange]
    var states: js.UndefOr[AssessmentRunStateList]
  }

  object AssessmentRunFilter {
    @inline
    def apply(
        completionTimeRange: js.UndefOr[TimestampRange] = js.undefined,
        durationRange: js.UndefOr[DurationRange] = js.undefined,
        namePattern: js.UndefOr[NamePattern] = js.undefined,
        rulesPackageArns: js.UndefOr[FilterRulesPackageArnList] = js.undefined,
        startTimeRange: js.UndefOr[TimestampRange] = js.undefined,
        stateChangeTimeRange: js.UndefOr[TimestampRange] = js.undefined,
        states: js.UndefOr[AssessmentRunStateList] = js.undefined
    ): AssessmentRunFilter = {
      val __obj = js.Dynamic.literal()
      completionTimeRange.foreach(__v => __obj.updateDynamic("completionTimeRange")(__v.asInstanceOf[js.Any]))
      durationRange.foreach(__v => __obj.updateDynamic("durationRange")(__v.asInstanceOf[js.Any]))
      namePattern.foreach(__v => __obj.updateDynamic("namePattern")(__v.asInstanceOf[js.Any]))
      rulesPackageArns.foreach(__v => __obj.updateDynamic("rulesPackageArns")(__v.asInstanceOf[js.Any]))
      startTimeRange.foreach(__v => __obj.updateDynamic("startTimeRange")(__v.asInstanceOf[js.Any]))
      stateChangeTimeRange.foreach(__v => __obj.updateDynamic("stateChangeTimeRange")(__v.asInstanceOf[js.Any]))
      states.foreach(__v => __obj.updateDynamic("states")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssessmentRunFilter]
    }
  }

  /**
    * Used as one of the elements of the <a>AssessmentRun</a> data type.
    */
  @js.native
  trait AssessmentRunNotification extends js.Object {
    var date: Timestamp
    var error: Boolean
    var event: InspectorEvent
    var message: js.UndefOr[Message]
    var snsPublishStatusCode: js.UndefOr[AssessmentRunNotificationSnsStatusCode]
    var snsTopicArn: js.UndefOr[Arn]
  }

  object AssessmentRunNotification {
    @inline
    def apply(
        date: Timestamp,
        error: Boolean,
        event: InspectorEvent,
        message: js.UndefOr[Message] = js.undefined,
        snsPublishStatusCode: js.UndefOr[AssessmentRunNotificationSnsStatusCode] = js.undefined,
        snsTopicArn: js.UndefOr[Arn] = js.undefined
    ): AssessmentRunNotification = {
      val __obj = js.Dynamic.literal(
        "date"  -> date.asInstanceOf[js.Any],
        "error" -> error.asInstanceOf[js.Any],
        "event" -> event.asInstanceOf[js.Any]
      )

      message.foreach(__v => __obj.updateDynamic("message")(__v.asInstanceOf[js.Any]))
      snsPublishStatusCode.foreach(__v => __obj.updateDynamic("snsPublishStatusCode")(__v.asInstanceOf[js.Any]))
      snsTopicArn.foreach(__v => __obj.updateDynamic("snsTopicArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssessmentRunNotification]
    }
  }

  object AssessmentRunNotificationSnsStatusCodeEnum {
    val SUCCESS              = "SUCCESS"
    val TOPIC_DOES_NOT_EXIST = "TOPIC_DOES_NOT_EXIST"
    val ACCESS_DENIED        = "ACCESS_DENIED"
    val INTERNAL_ERROR       = "INTERNAL_ERROR"

    val values = js.Object.freeze(js.Array(SUCCESS, TOPIC_DOES_NOT_EXIST, ACCESS_DENIED, INTERNAL_ERROR))
  }

  object AssessmentRunStateEnum {
    val CREATED                           = "CREATED"
    val START_DATA_COLLECTION_PENDING     = "START_DATA_COLLECTION_PENDING"
    val START_DATA_COLLECTION_IN_PROGRESS = "START_DATA_COLLECTION_IN_PROGRESS"
    val COLLECTING_DATA                   = "COLLECTING_DATA"
    val STOP_DATA_COLLECTION_PENDING      = "STOP_DATA_COLLECTION_PENDING"
    val DATA_COLLECTED                    = "DATA_COLLECTED"
    val START_EVALUATING_RULES_PENDING    = "START_EVALUATING_RULES_PENDING"
    val EVALUATING_RULES                  = "EVALUATING_RULES"
    val FAILED                            = "FAILED"
    val ERROR                             = "ERROR"
    val COMPLETED                         = "COMPLETED"
    val COMPLETED_WITH_ERRORS             = "COMPLETED_WITH_ERRORS"
    val CANCELED                          = "CANCELED"

    val values = js.Object.freeze(
      js.Array(
        CREATED,
        START_DATA_COLLECTION_PENDING,
        START_DATA_COLLECTION_IN_PROGRESS,
        COLLECTING_DATA,
        STOP_DATA_COLLECTION_PENDING,
        DATA_COLLECTED,
        START_EVALUATING_RULES_PENDING,
        EVALUATING_RULES,
        FAILED,
        ERROR,
        COMPLETED,
        COMPLETED_WITH_ERRORS,
        CANCELED
      )
    )
  }

  /**
    * Used as one of the elements of the <a>AssessmentRun</a> data type.
    */
  @js.native
  trait AssessmentRunStateChange extends js.Object {
    var state: AssessmentRunState
    var stateChangedAt: Timestamp
  }

  object AssessmentRunStateChange {
    @inline
    def apply(
        state: AssessmentRunState,
        stateChangedAt: Timestamp
    ): AssessmentRunStateChange = {
      val __obj = js.Dynamic.literal(
        "state"          -> state.asInstanceOf[js.Any],
        "stateChangedAt" -> stateChangedAt.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[AssessmentRunStateChange]
    }
  }

  /**
    * Contains information about an Amazon Inspector application. This data type is used as the response element in the <a>DescribeAssessmentTargets</a> action.
    */
  @js.native
  trait AssessmentTarget extends js.Object {
    var arn: Arn
    var createdAt: Timestamp
    var name: AssessmentTargetName
    var updatedAt: Timestamp
    var resourceGroupArn: js.UndefOr[Arn]
  }

  object AssessmentTarget {
    @inline
    def apply(
        arn: Arn,
        createdAt: Timestamp,
        name: AssessmentTargetName,
        updatedAt: Timestamp,
        resourceGroupArn: js.UndefOr[Arn] = js.undefined
    ): AssessmentTarget = {
      val __obj = js.Dynamic.literal(
        "arn"       -> arn.asInstanceOf[js.Any],
        "createdAt" -> createdAt.asInstanceOf[js.Any],
        "name"      -> name.asInstanceOf[js.Any],
        "updatedAt" -> updatedAt.asInstanceOf[js.Any]
      )

      resourceGroupArn.foreach(__v => __obj.updateDynamic("resourceGroupArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssessmentTarget]
    }
  }

  /**
    * Used as the request parameter in the <a>ListAssessmentTargets</a> action.
    */
  @js.native
  trait AssessmentTargetFilter extends js.Object {
    var assessmentTargetNamePattern: js.UndefOr[NamePattern]
  }

  object AssessmentTargetFilter {
    @inline
    def apply(
        assessmentTargetNamePattern: js.UndefOr[NamePattern] = js.undefined
    ): AssessmentTargetFilter = {
      val __obj = js.Dynamic.literal()
      assessmentTargetNamePattern.foreach(__v =>
        __obj.updateDynamic("assessmentTargetNamePattern")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[AssessmentTargetFilter]
    }
  }

  /**
    * Contains information about an Amazon Inspector assessment template. This data type is used as the response element in the <a>DescribeAssessmentTemplates</a> action.
    */
  @js.native
  trait AssessmentTemplate extends js.Object {
    var arn: Arn
    var assessmentRunCount: ArnCount
    var assessmentTargetArn: Arn
    var createdAt: Timestamp
    var durationInSeconds: AssessmentRunDuration
    var name: AssessmentTemplateName
    var rulesPackageArns: AssessmentTemplateRulesPackageArnList
    var userAttributesForFindings: UserAttributeList
    var lastAssessmentRunArn: js.UndefOr[Arn]
  }

  object AssessmentTemplate {
    @inline
    def apply(
        arn: Arn,
        assessmentRunCount: ArnCount,
        assessmentTargetArn: Arn,
        createdAt: Timestamp,
        durationInSeconds: AssessmentRunDuration,
        name: AssessmentTemplateName,
        rulesPackageArns: AssessmentTemplateRulesPackageArnList,
        userAttributesForFindings: UserAttributeList,
        lastAssessmentRunArn: js.UndefOr[Arn] = js.undefined
    ): AssessmentTemplate = {
      val __obj = js.Dynamic.literal(
        "arn"                       -> arn.asInstanceOf[js.Any],
        "assessmentRunCount"        -> assessmentRunCount.asInstanceOf[js.Any],
        "assessmentTargetArn"       -> assessmentTargetArn.asInstanceOf[js.Any],
        "createdAt"                 -> createdAt.asInstanceOf[js.Any],
        "durationInSeconds"         -> durationInSeconds.asInstanceOf[js.Any],
        "name"                      -> name.asInstanceOf[js.Any],
        "rulesPackageArns"          -> rulesPackageArns.asInstanceOf[js.Any],
        "userAttributesForFindings" -> userAttributesForFindings.asInstanceOf[js.Any]
      )

      lastAssessmentRunArn.foreach(__v => __obj.updateDynamic("lastAssessmentRunArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssessmentTemplate]
    }
  }

  /**
    * Used as the request parameter in the <a>ListAssessmentTemplates</a> action.
    */
  @js.native
  trait AssessmentTemplateFilter extends js.Object {
    var durationRange: js.UndefOr[DurationRange]
    var namePattern: js.UndefOr[NamePattern]
    var rulesPackageArns: js.UndefOr[FilterRulesPackageArnList]
  }

  object AssessmentTemplateFilter {
    @inline
    def apply(
        durationRange: js.UndefOr[DurationRange] = js.undefined,
        namePattern: js.UndefOr[NamePattern] = js.undefined,
        rulesPackageArns: js.UndefOr[FilterRulesPackageArnList] = js.undefined
    ): AssessmentTemplateFilter = {
      val __obj = js.Dynamic.literal()
      durationRange.foreach(__v => __obj.updateDynamic("durationRange")(__v.asInstanceOf[js.Any]))
      namePattern.foreach(__v => __obj.updateDynamic("namePattern")(__v.asInstanceOf[js.Any]))
      rulesPackageArns.foreach(__v => __obj.updateDynamic("rulesPackageArns")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssessmentTemplateFilter]
    }
  }

  /**
    * A collection of attributes of the host from which the finding is generated.
    */
  @js.native
  trait AssetAttributes extends js.Object {
    var schemaVersion: NumericVersion
    var agentId: js.UndefOr[AgentId]
    var amiId: js.UndefOr[AmiId]
    var autoScalingGroup: js.UndefOr[AutoScalingGroup]
    var hostname: js.UndefOr[Hostname]
    var ipv4Addresses: js.UndefOr[Ipv4AddressList]
    var networkInterfaces: js.UndefOr[NetworkInterfaces]
    var tags: js.UndefOr[Tags]
  }

  object AssetAttributes {
    @inline
    def apply(
        schemaVersion: NumericVersion,
        agentId: js.UndefOr[AgentId] = js.undefined,
        amiId: js.UndefOr[AmiId] = js.undefined,
        autoScalingGroup: js.UndefOr[AutoScalingGroup] = js.undefined,
        hostname: js.UndefOr[Hostname] = js.undefined,
        ipv4Addresses: js.UndefOr[Ipv4AddressList] = js.undefined,
        networkInterfaces: js.UndefOr[NetworkInterfaces] = js.undefined,
        tags: js.UndefOr[Tags] = js.undefined
    ): AssetAttributes = {
      val __obj = js.Dynamic.literal(
        "schemaVersion" -> schemaVersion.asInstanceOf[js.Any]
      )

      agentId.foreach(__v => __obj.updateDynamic("agentId")(__v.asInstanceOf[js.Any]))
      amiId.foreach(__v => __obj.updateDynamic("amiId")(__v.asInstanceOf[js.Any]))
      autoScalingGroup.foreach(__v => __obj.updateDynamic("autoScalingGroup")(__v.asInstanceOf[js.Any]))
      hostname.foreach(__v => __obj.updateDynamic("hostname")(__v.asInstanceOf[js.Any]))
      ipv4Addresses.foreach(__v => __obj.updateDynamic("ipv4Addresses")(__v.asInstanceOf[js.Any]))
      networkInterfaces.foreach(__v => __obj.updateDynamic("networkInterfaces")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssetAttributes]
    }
  }

  object AssetTypeEnum {
    val `ec2-instance` = "ec2-instance"

    val values = js.Object.freeze(js.Array(`ec2-instance`))
  }

  /**
    * This data type is used as a request parameter in the <a>AddAttributesToFindings</a> and <a>CreateAssessmentTemplate</a> actions.
    */
  @js.native
  trait Attribute extends js.Object {
    var key: AttributeKey
    var value: js.UndefOr[AttributeValue]
  }

  object Attribute {
    @inline
    def apply(
        key: AttributeKey,
        value: js.UndefOr[AttributeValue] = js.undefined
    ): Attribute = {
      val __obj = js.Dynamic.literal(
        "key" -> key.asInstanceOf[js.Any]
      )

      value.foreach(__v => __obj.updateDynamic("value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Attribute]
    }
  }

  @js.native
  trait CreateAssessmentTargetRequest extends js.Object {
    var assessmentTargetName: AssessmentTargetName
    var resourceGroupArn: js.UndefOr[Arn]
  }

  object CreateAssessmentTargetRequest {
    @inline
    def apply(
        assessmentTargetName: AssessmentTargetName,
        resourceGroupArn: js.UndefOr[Arn] = js.undefined
    ): CreateAssessmentTargetRequest = {
      val __obj = js.Dynamic.literal(
        "assessmentTargetName" -> assessmentTargetName.asInstanceOf[js.Any]
      )

      resourceGroupArn.foreach(__v => __obj.updateDynamic("resourceGroupArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateAssessmentTargetRequest]
    }
  }

  @js.native
  trait CreateAssessmentTargetResponse extends js.Object {
    var assessmentTargetArn: Arn
  }

  object CreateAssessmentTargetResponse {
    @inline
    def apply(
        assessmentTargetArn: Arn
    ): CreateAssessmentTargetResponse = {
      val __obj = js.Dynamic.literal(
        "assessmentTargetArn" -> assessmentTargetArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateAssessmentTargetResponse]
    }
  }

  @js.native
  trait CreateAssessmentTemplateRequest extends js.Object {
    var assessmentTargetArn: Arn
    var assessmentTemplateName: AssessmentTemplateName
    var durationInSeconds: AssessmentRunDuration
    var rulesPackageArns: AssessmentTemplateRulesPackageArnList
    var userAttributesForFindings: js.UndefOr[UserAttributeList]
  }

  object CreateAssessmentTemplateRequest {
    @inline
    def apply(
        assessmentTargetArn: Arn,
        assessmentTemplateName: AssessmentTemplateName,
        durationInSeconds: AssessmentRunDuration,
        rulesPackageArns: AssessmentTemplateRulesPackageArnList,
        userAttributesForFindings: js.UndefOr[UserAttributeList] = js.undefined
    ): CreateAssessmentTemplateRequest = {
      val __obj = js.Dynamic.literal(
        "assessmentTargetArn"    -> assessmentTargetArn.asInstanceOf[js.Any],
        "assessmentTemplateName" -> assessmentTemplateName.asInstanceOf[js.Any],
        "durationInSeconds"      -> durationInSeconds.asInstanceOf[js.Any],
        "rulesPackageArns"       -> rulesPackageArns.asInstanceOf[js.Any]
      )

      userAttributesForFindings.foreach(__v =>
        __obj.updateDynamic("userAttributesForFindings")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[CreateAssessmentTemplateRequest]
    }
  }

  @js.native
  trait CreateAssessmentTemplateResponse extends js.Object {
    var assessmentTemplateArn: Arn
  }

  object CreateAssessmentTemplateResponse {
    @inline
    def apply(
        assessmentTemplateArn: Arn
    ): CreateAssessmentTemplateResponse = {
      val __obj = js.Dynamic.literal(
        "assessmentTemplateArn" -> assessmentTemplateArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateAssessmentTemplateResponse]
    }
  }

  @js.native
  trait CreateExclusionsPreviewRequest extends js.Object {
    var assessmentTemplateArn: Arn
  }

  object CreateExclusionsPreviewRequest {
    @inline
    def apply(
        assessmentTemplateArn: Arn
    ): CreateExclusionsPreviewRequest = {
      val __obj = js.Dynamic.literal(
        "assessmentTemplateArn" -> assessmentTemplateArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateExclusionsPreviewRequest]
    }
  }

  @js.native
  trait CreateExclusionsPreviewResponse extends js.Object {
    var previewToken: UUID
  }

  object CreateExclusionsPreviewResponse {
    @inline
    def apply(
        previewToken: UUID
    ): CreateExclusionsPreviewResponse = {
      val __obj = js.Dynamic.literal(
        "previewToken" -> previewToken.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateExclusionsPreviewResponse]
    }
  }

  @js.native
  trait CreateResourceGroupRequest extends js.Object {
    var resourceGroupTags: ResourceGroupTags
  }

  object CreateResourceGroupRequest {
    @inline
    def apply(
        resourceGroupTags: ResourceGroupTags
    ): CreateResourceGroupRequest = {
      val __obj = js.Dynamic.literal(
        "resourceGroupTags" -> resourceGroupTags.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateResourceGroupRequest]
    }
  }

  @js.native
  trait CreateResourceGroupResponse extends js.Object {
    var resourceGroupArn: Arn
  }

  object CreateResourceGroupResponse {
    @inline
    def apply(
        resourceGroupArn: Arn
    ): CreateResourceGroupResponse = {
      val __obj = js.Dynamic.literal(
        "resourceGroupArn" -> resourceGroupArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateResourceGroupResponse]
    }
  }

  @js.native
  trait DeleteAssessmentRunRequest extends js.Object {
    var assessmentRunArn: Arn
  }

  object DeleteAssessmentRunRequest {
    @inline
    def apply(
        assessmentRunArn: Arn
    ): DeleteAssessmentRunRequest = {
      val __obj = js.Dynamic.literal(
        "assessmentRunArn" -> assessmentRunArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteAssessmentRunRequest]
    }
  }

  @js.native
  trait DeleteAssessmentTargetRequest extends js.Object {
    var assessmentTargetArn: Arn
  }

  object DeleteAssessmentTargetRequest {
    @inline
    def apply(
        assessmentTargetArn: Arn
    ): DeleteAssessmentTargetRequest = {
      val __obj = js.Dynamic.literal(
        "assessmentTargetArn" -> assessmentTargetArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteAssessmentTargetRequest]
    }
  }

  @js.native
  trait DeleteAssessmentTemplateRequest extends js.Object {
    var assessmentTemplateArn: Arn
  }

  object DeleteAssessmentTemplateRequest {
    @inline
    def apply(
        assessmentTemplateArn: Arn
    ): DeleteAssessmentTemplateRequest = {
      val __obj = js.Dynamic.literal(
        "assessmentTemplateArn" -> assessmentTemplateArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteAssessmentTemplateRequest]
    }
  }

  @js.native
  trait DescribeAssessmentRunsRequest extends js.Object {
    var assessmentRunArns: BatchDescribeArnList
  }

  object DescribeAssessmentRunsRequest {
    @inline
    def apply(
        assessmentRunArns: BatchDescribeArnList
    ): DescribeAssessmentRunsRequest = {
      val __obj = js.Dynamic.literal(
        "assessmentRunArns" -> assessmentRunArns.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeAssessmentRunsRequest]
    }
  }

  @js.native
  trait DescribeAssessmentRunsResponse extends js.Object {
    var assessmentRuns: AssessmentRunList
    var failedItems: FailedItems
  }

  object DescribeAssessmentRunsResponse {
    @inline
    def apply(
        assessmentRuns: AssessmentRunList,
        failedItems: FailedItems
    ): DescribeAssessmentRunsResponse = {
      val __obj = js.Dynamic.literal(
        "assessmentRuns" -> assessmentRuns.asInstanceOf[js.Any],
        "failedItems"    -> failedItems.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeAssessmentRunsResponse]
    }
  }

  @js.native
  trait DescribeAssessmentTargetsRequest extends js.Object {
    var assessmentTargetArns: BatchDescribeArnList
  }

  object DescribeAssessmentTargetsRequest {
    @inline
    def apply(
        assessmentTargetArns: BatchDescribeArnList
    ): DescribeAssessmentTargetsRequest = {
      val __obj = js.Dynamic.literal(
        "assessmentTargetArns" -> assessmentTargetArns.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeAssessmentTargetsRequest]
    }
  }

  @js.native
  trait DescribeAssessmentTargetsResponse extends js.Object {
    var assessmentTargets: AssessmentTargetList
    var failedItems: FailedItems
  }

  object DescribeAssessmentTargetsResponse {
    @inline
    def apply(
        assessmentTargets: AssessmentTargetList,
        failedItems: FailedItems
    ): DescribeAssessmentTargetsResponse = {
      val __obj = js.Dynamic.literal(
        "assessmentTargets" -> assessmentTargets.asInstanceOf[js.Any],
        "failedItems"       -> failedItems.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeAssessmentTargetsResponse]
    }
  }

  @js.native
  trait DescribeAssessmentTemplatesRequest extends js.Object {
    var assessmentTemplateArns: BatchDescribeArnList
  }

  object DescribeAssessmentTemplatesRequest {
    @inline
    def apply(
        assessmentTemplateArns: BatchDescribeArnList
    ): DescribeAssessmentTemplatesRequest = {
      val __obj = js.Dynamic.literal(
        "assessmentTemplateArns" -> assessmentTemplateArns.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeAssessmentTemplatesRequest]
    }
  }

  @js.native
  trait DescribeAssessmentTemplatesResponse extends js.Object {
    var assessmentTemplates: AssessmentTemplateList
    var failedItems: FailedItems
  }

  object DescribeAssessmentTemplatesResponse {
    @inline
    def apply(
        assessmentTemplates: AssessmentTemplateList,
        failedItems: FailedItems
    ): DescribeAssessmentTemplatesResponse = {
      val __obj = js.Dynamic.literal(
        "assessmentTemplates" -> assessmentTemplates.asInstanceOf[js.Any],
        "failedItems"         -> failedItems.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeAssessmentTemplatesResponse]
    }
  }

  @js.native
  trait DescribeCrossAccountAccessRoleResponse extends js.Object {
    var registeredAt: Timestamp
    var roleArn: Arn
    var valid: Boolean
  }

  object DescribeCrossAccountAccessRoleResponse {
    @inline
    def apply(
        registeredAt: Timestamp,
        roleArn: Arn,
        valid: Boolean
    ): DescribeCrossAccountAccessRoleResponse = {
      val __obj = js.Dynamic.literal(
        "registeredAt" -> registeredAt.asInstanceOf[js.Any],
        "roleArn"      -> roleArn.asInstanceOf[js.Any],
        "valid"        -> valid.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeCrossAccountAccessRoleResponse]
    }
  }

  @js.native
  trait DescribeExclusionsRequest extends js.Object {
    var exclusionArns: BatchDescribeExclusionsArnList
    var locale: js.UndefOr[Locale]
  }

  object DescribeExclusionsRequest {
    @inline
    def apply(
        exclusionArns: BatchDescribeExclusionsArnList,
        locale: js.UndefOr[Locale] = js.undefined
    ): DescribeExclusionsRequest = {
      val __obj = js.Dynamic.literal(
        "exclusionArns" -> exclusionArns.asInstanceOf[js.Any]
      )

      locale.foreach(__v => __obj.updateDynamic("locale")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeExclusionsRequest]
    }
  }

  @js.native
  trait DescribeExclusionsResponse extends js.Object {
    var exclusions: ExclusionMap
    var failedItems: FailedItems
  }

  object DescribeExclusionsResponse {
    @inline
    def apply(
        exclusions: ExclusionMap,
        failedItems: FailedItems
    ): DescribeExclusionsResponse = {
      val __obj = js.Dynamic.literal(
        "exclusions"  -> exclusions.asInstanceOf[js.Any],
        "failedItems" -> failedItems.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeExclusionsResponse]
    }
  }

  @js.native
  trait DescribeFindingsRequest extends js.Object {
    var findingArns: BatchDescribeArnList
    var locale: js.UndefOr[Locale]
  }

  object DescribeFindingsRequest {
    @inline
    def apply(
        findingArns: BatchDescribeArnList,
        locale: js.UndefOr[Locale] = js.undefined
    ): DescribeFindingsRequest = {
      val __obj = js.Dynamic.literal(
        "findingArns" -> findingArns.asInstanceOf[js.Any]
      )

      locale.foreach(__v => __obj.updateDynamic("locale")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeFindingsRequest]
    }
  }

  @js.native
  trait DescribeFindingsResponse extends js.Object {
    var failedItems: FailedItems
    var findings: FindingList
  }

  object DescribeFindingsResponse {
    @inline
    def apply(
        failedItems: FailedItems,
        findings: FindingList
    ): DescribeFindingsResponse = {
      val __obj = js.Dynamic.literal(
        "failedItems" -> failedItems.asInstanceOf[js.Any],
        "findings"    -> findings.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeFindingsResponse]
    }
  }

  @js.native
  trait DescribeResourceGroupsRequest extends js.Object {
    var resourceGroupArns: BatchDescribeArnList
  }

  object DescribeResourceGroupsRequest {
    @inline
    def apply(
        resourceGroupArns: BatchDescribeArnList
    ): DescribeResourceGroupsRequest = {
      val __obj = js.Dynamic.literal(
        "resourceGroupArns" -> resourceGroupArns.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeResourceGroupsRequest]
    }
  }

  @js.native
  trait DescribeResourceGroupsResponse extends js.Object {
    var failedItems: FailedItems
    var resourceGroups: ResourceGroupList
  }

  object DescribeResourceGroupsResponse {
    @inline
    def apply(
        failedItems: FailedItems,
        resourceGroups: ResourceGroupList
    ): DescribeResourceGroupsResponse = {
      val __obj = js.Dynamic.literal(
        "failedItems"    -> failedItems.asInstanceOf[js.Any],
        "resourceGroups" -> resourceGroups.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeResourceGroupsResponse]
    }
  }

  @js.native
  trait DescribeRulesPackagesRequest extends js.Object {
    var rulesPackageArns: BatchDescribeArnList
    var locale: js.UndefOr[Locale]
  }

  object DescribeRulesPackagesRequest {
    @inline
    def apply(
        rulesPackageArns: BatchDescribeArnList,
        locale: js.UndefOr[Locale] = js.undefined
    ): DescribeRulesPackagesRequest = {
      val __obj = js.Dynamic.literal(
        "rulesPackageArns" -> rulesPackageArns.asInstanceOf[js.Any]
      )

      locale.foreach(__v => __obj.updateDynamic("locale")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeRulesPackagesRequest]
    }
  }

  @js.native
  trait DescribeRulesPackagesResponse extends js.Object {
    var failedItems: FailedItems
    var rulesPackages: RulesPackageList
  }

  object DescribeRulesPackagesResponse {
    @inline
    def apply(
        failedItems: FailedItems,
        rulesPackages: RulesPackageList
    ): DescribeRulesPackagesResponse = {
      val __obj = js.Dynamic.literal(
        "failedItems"   -> failedItems.asInstanceOf[js.Any],
        "rulesPackages" -> rulesPackages.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeRulesPackagesResponse]
    }
  }

  /**
    * This data type is used in the <a>AssessmentTemplateFilter</a> data type.
    */
  @js.native
  trait DurationRange extends js.Object {
    var maxSeconds: js.UndefOr[AssessmentRunDuration]
    var minSeconds: js.UndefOr[AssessmentRunDuration]
  }

  object DurationRange {
    @inline
    def apply(
        maxSeconds: js.UndefOr[AssessmentRunDuration] = js.undefined,
        minSeconds: js.UndefOr[AssessmentRunDuration] = js.undefined
    ): DurationRange = {
      val __obj = js.Dynamic.literal()
      maxSeconds.foreach(__v => __obj.updateDynamic("maxSeconds")(__v.asInstanceOf[js.Any]))
      minSeconds.foreach(__v => __obj.updateDynamic("minSeconds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DurationRange]
    }
  }

  /**
    * This data type is used in the <a>Subscription</a> data type.
    */
  @js.native
  trait EventSubscription extends js.Object {
    var event: InspectorEvent
    var subscribedAt: Timestamp
  }

  object EventSubscription {
    @inline
    def apply(
        event: InspectorEvent,
        subscribedAt: Timestamp
    ): EventSubscription = {
      val __obj = js.Dynamic.literal(
        "event"        -> event.asInstanceOf[js.Any],
        "subscribedAt" -> subscribedAt.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[EventSubscription]
    }
  }

  /**
    * Contains information about what was excluded from an assessment run.
    */
  @js.native
  trait Exclusion extends js.Object {
    var arn: Arn
    var description: Text
    var recommendation: Text
    var scopes: ScopeList
    var title: Text
    var attributes: js.UndefOr[AttributeList]
  }

  object Exclusion {
    @inline
    def apply(
        arn: Arn,
        description: Text,
        recommendation: Text,
        scopes: ScopeList,
        title: Text,
        attributes: js.UndefOr[AttributeList] = js.undefined
    ): Exclusion = {
      val __obj = js.Dynamic.literal(
        "arn"            -> arn.asInstanceOf[js.Any],
        "description"    -> description.asInstanceOf[js.Any],
        "recommendation" -> recommendation.asInstanceOf[js.Any],
        "scopes"         -> scopes.asInstanceOf[js.Any],
        "title"          -> title.asInstanceOf[js.Any]
      )

      attributes.foreach(__v => __obj.updateDynamic("attributes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Exclusion]
    }
  }

  /**
    * Contains information about what is excluded from an assessment run given the current state of the assessment template.
    */
  @js.native
  trait ExclusionPreview extends js.Object {
    var description: Text
    var recommendation: Text
    var scopes: ScopeList
    var title: Text
    var attributes: js.UndefOr[AttributeList]
  }

  object ExclusionPreview {
    @inline
    def apply(
        description: Text,
        recommendation: Text,
        scopes: ScopeList,
        title: Text,
        attributes: js.UndefOr[AttributeList] = js.undefined
    ): ExclusionPreview = {
      val __obj = js.Dynamic.literal(
        "description"    -> description.asInstanceOf[js.Any],
        "recommendation" -> recommendation.asInstanceOf[js.Any],
        "scopes"         -> scopes.asInstanceOf[js.Any],
        "title"          -> title.asInstanceOf[js.Any]
      )

      attributes.foreach(__v => __obj.updateDynamic("attributes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ExclusionPreview]
    }
  }

  /**
    * Includes details about the failed items.
    */
  @js.native
  trait FailedItemDetails extends js.Object {
    var failureCode: FailedItemErrorCode
    var retryable: Boolean
  }

  object FailedItemDetails {
    @inline
    def apply(
        failureCode: FailedItemErrorCode,
        retryable: Boolean
    ): FailedItemDetails = {
      val __obj = js.Dynamic.literal(
        "failureCode" -> failureCode.asInstanceOf[js.Any],
        "retryable"   -> retryable.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[FailedItemDetails]
    }
  }

  object FailedItemErrorCodeEnum {
    val INVALID_ARN         = "INVALID_ARN"
    val DUPLICATE_ARN       = "DUPLICATE_ARN"
    val ITEM_DOES_NOT_EXIST = "ITEM_DOES_NOT_EXIST"
    val ACCESS_DENIED       = "ACCESS_DENIED"
    val LIMIT_EXCEEDED      = "LIMIT_EXCEEDED"
    val INTERNAL_ERROR      = "INTERNAL_ERROR"

    val values = js.Object.freeze(
      js.Array(INVALID_ARN, DUPLICATE_ARN, ITEM_DOES_NOT_EXIST, ACCESS_DENIED, LIMIT_EXCEEDED, INTERNAL_ERROR)
    )
  }

  /**
    * Contains information about an Amazon Inspector finding. This data type is used as the response element in the <a>DescribeFindings</a> action.
    */
  @js.native
  trait Finding extends js.Object {
    var arn: Arn
    var attributes: AttributeList
    var createdAt: Timestamp
    var updatedAt: Timestamp
    var userAttributes: UserAttributeList
    var assetAttributes: js.UndefOr[AssetAttributes]
    var assetType: js.UndefOr[AssetType]
    var confidence: js.UndefOr[IocConfidence]
    var description: js.UndefOr[Text]
    var id: js.UndefOr[FindingId]
    var indicatorOfCompromise: js.UndefOr[Boolean]
    var numericSeverity: js.UndefOr[NumericSeverity]
    var recommendation: js.UndefOr[Text]
    var schemaVersion: js.UndefOr[NumericVersion]
    var service: js.UndefOr[ServiceName]
    var serviceAttributes: js.UndefOr[InspectorServiceAttributes]
    var severity: js.UndefOr[Severity]
    var title: js.UndefOr[Text]
  }

  object Finding {
    @inline
    def apply(
        arn: Arn,
        attributes: AttributeList,
        createdAt: Timestamp,
        updatedAt: Timestamp,
        userAttributes: UserAttributeList,
        assetAttributes: js.UndefOr[AssetAttributes] = js.undefined,
        assetType: js.UndefOr[AssetType] = js.undefined,
        confidence: js.UndefOr[IocConfidence] = js.undefined,
        description: js.UndefOr[Text] = js.undefined,
        id: js.UndefOr[FindingId] = js.undefined,
        indicatorOfCompromise: js.UndefOr[Boolean] = js.undefined,
        numericSeverity: js.UndefOr[NumericSeverity] = js.undefined,
        recommendation: js.UndefOr[Text] = js.undefined,
        schemaVersion: js.UndefOr[NumericVersion] = js.undefined,
        service: js.UndefOr[ServiceName] = js.undefined,
        serviceAttributes: js.UndefOr[InspectorServiceAttributes] = js.undefined,
        severity: js.UndefOr[Severity] = js.undefined,
        title: js.UndefOr[Text] = js.undefined
    ): Finding = {
      val __obj = js.Dynamic.literal(
        "arn"            -> arn.asInstanceOf[js.Any],
        "attributes"     -> attributes.asInstanceOf[js.Any],
        "createdAt"      -> createdAt.asInstanceOf[js.Any],
        "updatedAt"      -> updatedAt.asInstanceOf[js.Any],
        "userAttributes" -> userAttributes.asInstanceOf[js.Any]
      )

      assetAttributes.foreach(__v => __obj.updateDynamic("assetAttributes")(__v.asInstanceOf[js.Any]))
      assetType.foreach(__v => __obj.updateDynamic("assetType")(__v.asInstanceOf[js.Any]))
      confidence.foreach(__v => __obj.updateDynamic("confidence")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      id.foreach(__v => __obj.updateDynamic("id")(__v.asInstanceOf[js.Any]))
      indicatorOfCompromise.foreach(__v => __obj.updateDynamic("indicatorOfCompromise")(__v.asInstanceOf[js.Any]))
      numericSeverity.foreach(__v => __obj.updateDynamic("numericSeverity")(__v.asInstanceOf[js.Any]))
      recommendation.foreach(__v => __obj.updateDynamic("recommendation")(__v.asInstanceOf[js.Any]))
      schemaVersion.foreach(__v => __obj.updateDynamic("schemaVersion")(__v.asInstanceOf[js.Any]))
      service.foreach(__v => __obj.updateDynamic("service")(__v.asInstanceOf[js.Any]))
      serviceAttributes.foreach(__v => __obj.updateDynamic("serviceAttributes")(__v.asInstanceOf[js.Any]))
      severity.foreach(__v => __obj.updateDynamic("severity")(__v.asInstanceOf[js.Any]))
      title.foreach(__v => __obj.updateDynamic("title")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Finding]
    }
  }

  /**
    * This data type is used as a request parameter in the <a>ListFindings</a> action.
    */
  @js.native
  trait FindingFilter extends js.Object {
    var agentIds: js.UndefOr[AgentIdList]
    var attributes: js.UndefOr[AttributeList]
    var autoScalingGroups: js.UndefOr[AutoScalingGroupList]
    var creationTimeRange: js.UndefOr[TimestampRange]
    var ruleNames: js.UndefOr[RuleNameList]
    var rulesPackageArns: js.UndefOr[FilterRulesPackageArnList]
    var severities: js.UndefOr[SeverityList]
    var userAttributes: js.UndefOr[AttributeList]
  }

  object FindingFilter {
    @inline
    def apply(
        agentIds: js.UndefOr[AgentIdList] = js.undefined,
        attributes: js.UndefOr[AttributeList] = js.undefined,
        autoScalingGroups: js.UndefOr[AutoScalingGroupList] = js.undefined,
        creationTimeRange: js.UndefOr[TimestampRange] = js.undefined,
        ruleNames: js.UndefOr[RuleNameList] = js.undefined,
        rulesPackageArns: js.UndefOr[FilterRulesPackageArnList] = js.undefined,
        severities: js.UndefOr[SeverityList] = js.undefined,
        userAttributes: js.UndefOr[AttributeList] = js.undefined
    ): FindingFilter = {
      val __obj = js.Dynamic.literal()
      agentIds.foreach(__v => __obj.updateDynamic("agentIds")(__v.asInstanceOf[js.Any]))
      attributes.foreach(__v => __obj.updateDynamic("attributes")(__v.asInstanceOf[js.Any]))
      autoScalingGroups.foreach(__v => __obj.updateDynamic("autoScalingGroups")(__v.asInstanceOf[js.Any]))
      creationTimeRange.foreach(__v => __obj.updateDynamic("creationTimeRange")(__v.asInstanceOf[js.Any]))
      ruleNames.foreach(__v => __obj.updateDynamic("ruleNames")(__v.asInstanceOf[js.Any]))
      rulesPackageArns.foreach(__v => __obj.updateDynamic("rulesPackageArns")(__v.asInstanceOf[js.Any]))
      severities.foreach(__v => __obj.updateDynamic("severities")(__v.asInstanceOf[js.Any]))
      userAttributes.foreach(__v => __obj.updateDynamic("userAttributes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FindingFilter]
    }
  }

  @js.native
  trait GetAssessmentReportRequest extends js.Object {
    var assessmentRunArn: Arn
    var reportFileFormat: ReportFileFormat
    var reportType: ReportType
  }

  object GetAssessmentReportRequest {
    @inline
    def apply(
        assessmentRunArn: Arn,
        reportFileFormat: ReportFileFormat,
        reportType: ReportType
    ): GetAssessmentReportRequest = {
      val __obj = js.Dynamic.literal(
        "assessmentRunArn" -> assessmentRunArn.asInstanceOf[js.Any],
        "reportFileFormat" -> reportFileFormat.asInstanceOf[js.Any],
        "reportType"       -> reportType.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetAssessmentReportRequest]
    }
  }

  @js.native
  trait GetAssessmentReportResponse extends js.Object {
    var status: ReportStatus
    var url: js.UndefOr[Url]
  }

  object GetAssessmentReportResponse {
    @inline
    def apply(
        status: ReportStatus,
        url: js.UndefOr[Url] = js.undefined
    ): GetAssessmentReportResponse = {
      val __obj = js.Dynamic.literal(
        "status" -> status.asInstanceOf[js.Any]
      )

      url.foreach(__v => __obj.updateDynamic("url")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetAssessmentReportResponse]
    }
  }

  @js.native
  trait GetExclusionsPreviewRequest extends js.Object {
    var assessmentTemplateArn: Arn
    var previewToken: UUID
    var locale: js.UndefOr[Locale]
    var maxResults: js.UndefOr[ListMaxResults]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object GetExclusionsPreviewRequest {
    @inline
    def apply(
        assessmentTemplateArn: Arn,
        previewToken: UUID,
        locale: js.UndefOr[Locale] = js.undefined,
        maxResults: js.UndefOr[ListMaxResults] = js.undefined,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): GetExclusionsPreviewRequest = {
      val __obj = js.Dynamic.literal(
        "assessmentTemplateArn" -> assessmentTemplateArn.asInstanceOf[js.Any],
        "previewToken"          -> previewToken.asInstanceOf[js.Any]
      )

      locale.foreach(__v => __obj.updateDynamic("locale")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetExclusionsPreviewRequest]
    }
  }

  @js.native
  trait GetExclusionsPreviewResponse extends js.Object {
    var previewStatus: PreviewStatus
    var exclusionPreviews: js.UndefOr[ExclusionPreviewList]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object GetExclusionsPreviewResponse {
    @inline
    def apply(
        previewStatus: PreviewStatus,
        exclusionPreviews: js.UndefOr[ExclusionPreviewList] = js.undefined,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): GetExclusionsPreviewResponse = {
      val __obj = js.Dynamic.literal(
        "previewStatus" -> previewStatus.asInstanceOf[js.Any]
      )

      exclusionPreviews.foreach(__v => __obj.updateDynamic("exclusionPreviews")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetExclusionsPreviewResponse]
    }
  }

  @js.native
  trait GetTelemetryMetadataRequest extends js.Object {
    var assessmentRunArn: Arn
  }

  object GetTelemetryMetadataRequest {
    @inline
    def apply(
        assessmentRunArn: Arn
    ): GetTelemetryMetadataRequest = {
      val __obj = js.Dynamic.literal(
        "assessmentRunArn" -> assessmentRunArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetTelemetryMetadataRequest]
    }
  }

  @js.native
  trait GetTelemetryMetadataResponse extends js.Object {
    var telemetryMetadata: TelemetryMetadataList
  }

  object GetTelemetryMetadataResponse {
    @inline
    def apply(
        telemetryMetadata: TelemetryMetadataList
    ): GetTelemetryMetadataResponse = {
      val __obj = js.Dynamic.literal(
        "telemetryMetadata" -> telemetryMetadata.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetTelemetryMetadataResponse]
    }
  }

  object InspectorEventEnum {
    val ASSESSMENT_RUN_STARTED       = "ASSESSMENT_RUN_STARTED"
    val ASSESSMENT_RUN_COMPLETED     = "ASSESSMENT_RUN_COMPLETED"
    val ASSESSMENT_RUN_STATE_CHANGED = "ASSESSMENT_RUN_STATE_CHANGED"
    val FINDING_REPORTED             = "FINDING_REPORTED"
    val OTHER                        = "OTHER"

    val values = js.Object.freeze(
      js.Array(ASSESSMENT_RUN_STARTED, ASSESSMENT_RUN_COMPLETED, ASSESSMENT_RUN_STATE_CHANGED, FINDING_REPORTED, OTHER)
    )
  }

  /**
    * This data type is used in the <a>Finding</a> data type.
    */
  @js.native
  trait InspectorServiceAttributes extends js.Object {
    var schemaVersion: NumericVersion
    var assessmentRunArn: js.UndefOr[Arn]
    var rulesPackageArn: js.UndefOr[Arn]
  }

  object InspectorServiceAttributes {
    @inline
    def apply(
        schemaVersion: NumericVersion,
        assessmentRunArn: js.UndefOr[Arn] = js.undefined,
        rulesPackageArn: js.UndefOr[Arn] = js.undefined
    ): InspectorServiceAttributes = {
      val __obj = js.Dynamic.literal(
        "schemaVersion" -> schemaVersion.asInstanceOf[js.Any]
      )

      assessmentRunArn.foreach(__v => __obj.updateDynamic("assessmentRunArn")(__v.asInstanceOf[js.Any]))
      rulesPackageArn.foreach(__v => __obj.updateDynamic("rulesPackageArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InspectorServiceAttributes]
    }
  }

  @js.native
  trait ListAssessmentRunAgentsRequest extends js.Object {
    var assessmentRunArn: Arn
    var filter: js.UndefOr[AgentFilter]
    var maxResults: js.UndefOr[ListMaxResults]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListAssessmentRunAgentsRequest {
    @inline
    def apply(
        assessmentRunArn: Arn,
        filter: js.UndefOr[AgentFilter] = js.undefined,
        maxResults: js.UndefOr[ListMaxResults] = js.undefined,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListAssessmentRunAgentsRequest = {
      val __obj = js.Dynamic.literal(
        "assessmentRunArn" -> assessmentRunArn.asInstanceOf[js.Any]
      )

      filter.foreach(__v => __obj.updateDynamic("filter")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAssessmentRunAgentsRequest]
    }
  }

  @js.native
  trait ListAssessmentRunAgentsResponse extends js.Object {
    var assessmentRunAgents: AssessmentRunAgentList
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListAssessmentRunAgentsResponse {
    @inline
    def apply(
        assessmentRunAgents: AssessmentRunAgentList,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListAssessmentRunAgentsResponse = {
      val __obj = js.Dynamic.literal(
        "assessmentRunAgents" -> assessmentRunAgents.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAssessmentRunAgentsResponse]
    }
  }

  @js.native
  trait ListAssessmentRunsRequest extends js.Object {
    var assessmentTemplateArns: js.UndefOr[ListParentArnList]
    var filter: js.UndefOr[AssessmentRunFilter]
    var maxResults: js.UndefOr[ListMaxResults]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListAssessmentRunsRequest {
    @inline
    def apply(
        assessmentTemplateArns: js.UndefOr[ListParentArnList] = js.undefined,
        filter: js.UndefOr[AssessmentRunFilter] = js.undefined,
        maxResults: js.UndefOr[ListMaxResults] = js.undefined,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListAssessmentRunsRequest = {
      val __obj = js.Dynamic.literal()
      assessmentTemplateArns.foreach(__v => __obj.updateDynamic("assessmentTemplateArns")(__v.asInstanceOf[js.Any]))
      filter.foreach(__v => __obj.updateDynamic("filter")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAssessmentRunsRequest]
    }
  }

  @js.native
  trait ListAssessmentRunsResponse extends js.Object {
    var assessmentRunArns: ListReturnedArnList
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListAssessmentRunsResponse {
    @inline
    def apply(
        assessmentRunArns: ListReturnedArnList,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListAssessmentRunsResponse = {
      val __obj = js.Dynamic.literal(
        "assessmentRunArns" -> assessmentRunArns.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAssessmentRunsResponse]
    }
  }

  @js.native
  trait ListAssessmentTargetsRequest extends js.Object {
    var filter: js.UndefOr[AssessmentTargetFilter]
    var maxResults: js.UndefOr[ListMaxResults]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListAssessmentTargetsRequest {
    @inline
    def apply(
        filter: js.UndefOr[AssessmentTargetFilter] = js.undefined,
        maxResults: js.UndefOr[ListMaxResults] = js.undefined,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListAssessmentTargetsRequest = {
      val __obj = js.Dynamic.literal()
      filter.foreach(__v => __obj.updateDynamic("filter")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAssessmentTargetsRequest]
    }
  }

  @js.native
  trait ListAssessmentTargetsResponse extends js.Object {
    var assessmentTargetArns: ListReturnedArnList
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListAssessmentTargetsResponse {
    @inline
    def apply(
        assessmentTargetArns: ListReturnedArnList,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListAssessmentTargetsResponse = {
      val __obj = js.Dynamic.literal(
        "assessmentTargetArns" -> assessmentTargetArns.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAssessmentTargetsResponse]
    }
  }

  @js.native
  trait ListAssessmentTemplatesRequest extends js.Object {
    var assessmentTargetArns: js.UndefOr[ListParentArnList]
    var filter: js.UndefOr[AssessmentTemplateFilter]
    var maxResults: js.UndefOr[ListMaxResults]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListAssessmentTemplatesRequest {
    @inline
    def apply(
        assessmentTargetArns: js.UndefOr[ListParentArnList] = js.undefined,
        filter: js.UndefOr[AssessmentTemplateFilter] = js.undefined,
        maxResults: js.UndefOr[ListMaxResults] = js.undefined,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListAssessmentTemplatesRequest = {
      val __obj = js.Dynamic.literal()
      assessmentTargetArns.foreach(__v => __obj.updateDynamic("assessmentTargetArns")(__v.asInstanceOf[js.Any]))
      filter.foreach(__v => __obj.updateDynamic("filter")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAssessmentTemplatesRequest]
    }
  }

  @js.native
  trait ListAssessmentTemplatesResponse extends js.Object {
    var assessmentTemplateArns: ListReturnedArnList
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListAssessmentTemplatesResponse {
    @inline
    def apply(
        assessmentTemplateArns: ListReturnedArnList,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListAssessmentTemplatesResponse = {
      val __obj = js.Dynamic.literal(
        "assessmentTemplateArns" -> assessmentTemplateArns.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAssessmentTemplatesResponse]
    }
  }

  @js.native
  trait ListEventSubscriptionsRequest extends js.Object {
    var maxResults: js.UndefOr[ListEventSubscriptionsMaxResults]
    var nextToken: js.UndefOr[PaginationToken]
    var resourceArn: js.UndefOr[Arn]
  }

  object ListEventSubscriptionsRequest {
    @inline
    def apply(
        maxResults: js.UndefOr[ListEventSubscriptionsMaxResults] = js.undefined,
        nextToken: js.UndefOr[PaginationToken] = js.undefined,
        resourceArn: js.UndefOr[Arn] = js.undefined
    ): ListEventSubscriptionsRequest = {
      val __obj = js.Dynamic.literal()
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      resourceArn.foreach(__v => __obj.updateDynamic("resourceArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListEventSubscriptionsRequest]
    }
  }

  @js.native
  trait ListEventSubscriptionsResponse extends js.Object {
    var subscriptions: SubscriptionList
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListEventSubscriptionsResponse {
    @inline
    def apply(
        subscriptions: SubscriptionList,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListEventSubscriptionsResponse = {
      val __obj = js.Dynamic.literal(
        "subscriptions" -> subscriptions.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListEventSubscriptionsResponse]
    }
  }

  @js.native
  trait ListExclusionsRequest extends js.Object {
    var assessmentRunArn: Arn
    var maxResults: js.UndefOr[ListMaxResults]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListExclusionsRequest {
    @inline
    def apply(
        assessmentRunArn: Arn,
        maxResults: js.UndefOr[ListMaxResults] = js.undefined,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListExclusionsRequest = {
      val __obj = js.Dynamic.literal(
        "assessmentRunArn" -> assessmentRunArn.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListExclusionsRequest]
    }
  }

  @js.native
  trait ListExclusionsResponse extends js.Object {
    var exclusionArns: ListReturnedArnList
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListExclusionsResponse {
    @inline
    def apply(
        exclusionArns: ListReturnedArnList,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListExclusionsResponse = {
      val __obj = js.Dynamic.literal(
        "exclusionArns" -> exclusionArns.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListExclusionsResponse]
    }
  }

  @js.native
  trait ListFindingsRequest extends js.Object {
    var assessmentRunArns: js.UndefOr[ListParentArnList]
    var filter: js.UndefOr[FindingFilter]
    var maxResults: js.UndefOr[ListMaxResults]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListFindingsRequest {
    @inline
    def apply(
        assessmentRunArns: js.UndefOr[ListParentArnList] = js.undefined,
        filter: js.UndefOr[FindingFilter] = js.undefined,
        maxResults: js.UndefOr[ListMaxResults] = js.undefined,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListFindingsRequest = {
      val __obj = js.Dynamic.literal()
      assessmentRunArns.foreach(__v => __obj.updateDynamic("assessmentRunArns")(__v.asInstanceOf[js.Any]))
      filter.foreach(__v => __obj.updateDynamic("filter")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListFindingsRequest]
    }
  }

  @js.native
  trait ListFindingsResponse extends js.Object {
    var findingArns: ListReturnedArnList
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListFindingsResponse {
    @inline
    def apply(
        findingArns: ListReturnedArnList,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListFindingsResponse = {
      val __obj = js.Dynamic.literal(
        "findingArns" -> findingArns.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListFindingsResponse]
    }
  }

  @js.native
  trait ListRulesPackagesRequest extends js.Object {
    var maxResults: js.UndefOr[ListMaxResults]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListRulesPackagesRequest {
    @inline
    def apply(
        maxResults: js.UndefOr[ListMaxResults] = js.undefined,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListRulesPackagesRequest = {
      val __obj = js.Dynamic.literal()
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListRulesPackagesRequest]
    }
  }

  @js.native
  trait ListRulesPackagesResponse extends js.Object {
    var rulesPackageArns: ListReturnedArnList
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListRulesPackagesResponse {
    @inline
    def apply(
        rulesPackageArns: ListReturnedArnList,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListRulesPackagesResponse = {
      val __obj = js.Dynamic.literal(
        "rulesPackageArns" -> rulesPackageArns.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListRulesPackagesResponse]
    }
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var resourceArn: Arn
  }

  object ListTagsForResourceRequest {
    @inline
    def apply(
        resourceArn: Arn
    ): ListTagsForResourceRequest = {
      val __obj = js.Dynamic.literal(
        "resourceArn" -> resourceArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ListTagsForResourceRequest]
    }
  }

  @js.native
  trait ListTagsForResourceResponse extends js.Object {
    var tags: TagList
  }

  object ListTagsForResourceResponse {
    @inline
    def apply(
        tags: TagList
    ): ListTagsForResourceResponse = {
      val __obj = js.Dynamic.literal(
        "tags" -> tags.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ListTagsForResourceResponse]
    }
  }

  object LocaleEnum {
    val EN_US = "EN_US"

    val values = js.Object.freeze(js.Array(EN_US))
  }

  /**
    * Contains information about the network interfaces interacting with an EC2 instance. This data type is used as one of the elements of the <a>AssetAttributes</a> data type.
    */
  @js.native
  trait NetworkInterface extends js.Object {
    var ipv6Addresses: js.UndefOr[Ipv6Addresses]
    var networkInterfaceId: js.UndefOr[Text]
    var privateDnsName: js.UndefOr[Text]
    var privateIpAddress: js.UndefOr[Text]
    var privateIpAddresses: js.UndefOr[PrivateIpAddresses]
    var publicDnsName: js.UndefOr[Text]
    var publicIp: js.UndefOr[Text]
    var securityGroups: js.UndefOr[SecurityGroups]
    var subnetId: js.UndefOr[Text]
    var vpcId: js.UndefOr[Text]
  }

  object NetworkInterface {
    @inline
    def apply(
        ipv6Addresses: js.UndefOr[Ipv6Addresses] = js.undefined,
        networkInterfaceId: js.UndefOr[Text] = js.undefined,
        privateDnsName: js.UndefOr[Text] = js.undefined,
        privateIpAddress: js.UndefOr[Text] = js.undefined,
        privateIpAddresses: js.UndefOr[PrivateIpAddresses] = js.undefined,
        publicDnsName: js.UndefOr[Text] = js.undefined,
        publicIp: js.UndefOr[Text] = js.undefined,
        securityGroups: js.UndefOr[SecurityGroups] = js.undefined,
        subnetId: js.UndefOr[Text] = js.undefined,
        vpcId: js.UndefOr[Text] = js.undefined
    ): NetworkInterface = {
      val __obj = js.Dynamic.literal()
      ipv6Addresses.foreach(__v => __obj.updateDynamic("ipv6Addresses")(__v.asInstanceOf[js.Any]))
      networkInterfaceId.foreach(__v => __obj.updateDynamic("networkInterfaceId")(__v.asInstanceOf[js.Any]))
      privateDnsName.foreach(__v => __obj.updateDynamic("privateDnsName")(__v.asInstanceOf[js.Any]))
      privateIpAddress.foreach(__v => __obj.updateDynamic("privateIpAddress")(__v.asInstanceOf[js.Any]))
      privateIpAddresses.foreach(__v => __obj.updateDynamic("privateIpAddresses")(__v.asInstanceOf[js.Any]))
      publicDnsName.foreach(__v => __obj.updateDynamic("publicDnsName")(__v.asInstanceOf[js.Any]))
      publicIp.foreach(__v => __obj.updateDynamic("publicIp")(__v.asInstanceOf[js.Any]))
      securityGroups.foreach(__v => __obj.updateDynamic("securityGroups")(__v.asInstanceOf[js.Any]))
      subnetId.foreach(__v => __obj.updateDynamic("subnetId")(__v.asInstanceOf[js.Any]))
      vpcId.foreach(__v => __obj.updateDynamic("vpcId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NetworkInterface]
    }
  }

  @js.native
  trait PreviewAgentsRequest extends js.Object {
    var previewAgentsArn: Arn
    var maxResults: js.UndefOr[PreviewAgentsMaxResults]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object PreviewAgentsRequest {
    @inline
    def apply(
        previewAgentsArn: Arn,
        maxResults: js.UndefOr[PreviewAgentsMaxResults] = js.undefined,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): PreviewAgentsRequest = {
      val __obj = js.Dynamic.literal(
        "previewAgentsArn" -> previewAgentsArn.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PreviewAgentsRequest]
    }
  }

  @js.native
  trait PreviewAgentsResponse extends js.Object {
    var agentPreviews: AgentPreviewList
    var nextToken: js.UndefOr[PaginationToken]
  }

  object PreviewAgentsResponse {
    @inline
    def apply(
        agentPreviews: AgentPreviewList,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): PreviewAgentsResponse = {
      val __obj = js.Dynamic.literal(
        "agentPreviews" -> agentPreviews.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PreviewAgentsResponse]
    }
  }

  object PreviewStatusEnum {
    val WORK_IN_PROGRESS = "WORK_IN_PROGRESS"
    val COMPLETED        = "COMPLETED"

    val values = js.Object.freeze(js.Array(WORK_IN_PROGRESS, COMPLETED))
  }

  /**
    * Contains information about a private IP address associated with a network interface. This data type is used as a response element in the <a>DescribeFindings</a> action.
    */
  @js.native
  trait PrivateIp extends js.Object {
    var privateDnsName: js.UndefOr[Text]
    var privateIpAddress: js.UndefOr[Text]
  }

  object PrivateIp {
    @inline
    def apply(
        privateDnsName: js.UndefOr[Text] = js.undefined,
        privateIpAddress: js.UndefOr[Text] = js.undefined
    ): PrivateIp = {
      val __obj = js.Dynamic.literal()
      privateDnsName.foreach(__v => __obj.updateDynamic("privateDnsName")(__v.asInstanceOf[js.Any]))
      privateIpAddress.foreach(__v => __obj.updateDynamic("privateIpAddress")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PrivateIp]
    }
  }

  @js.native
  trait RegisterCrossAccountAccessRoleRequest extends js.Object {
    var roleArn: Arn
  }

  object RegisterCrossAccountAccessRoleRequest {
    @inline
    def apply(
        roleArn: Arn
    ): RegisterCrossAccountAccessRoleRequest = {
      val __obj = js.Dynamic.literal(
        "roleArn" -> roleArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[RegisterCrossAccountAccessRoleRequest]
    }
  }

  @js.native
  trait RemoveAttributesFromFindingsRequest extends js.Object {
    var attributeKeys: UserAttributeKeyList
    var findingArns: AddRemoveAttributesFindingArnList
  }

  object RemoveAttributesFromFindingsRequest {
    @inline
    def apply(
        attributeKeys: UserAttributeKeyList,
        findingArns: AddRemoveAttributesFindingArnList
    ): RemoveAttributesFromFindingsRequest = {
      val __obj = js.Dynamic.literal(
        "attributeKeys" -> attributeKeys.asInstanceOf[js.Any],
        "findingArns"   -> findingArns.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[RemoveAttributesFromFindingsRequest]
    }
  }

  @js.native
  trait RemoveAttributesFromFindingsResponse extends js.Object {
    var failedItems: FailedItems
  }

  object RemoveAttributesFromFindingsResponse {
    @inline
    def apply(
        failedItems: FailedItems
    ): RemoveAttributesFromFindingsResponse = {
      val __obj = js.Dynamic.literal(
        "failedItems" -> failedItems.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[RemoveAttributesFromFindingsResponse]
    }
  }

  object ReportFileFormatEnum {
    val HTML = "HTML"
    val PDF  = "PDF"

    val values = js.Object.freeze(js.Array(HTML, PDF))
  }

  object ReportStatusEnum {
    val WORK_IN_PROGRESS = "WORK_IN_PROGRESS"
    val FAILED           = "FAILED"
    val COMPLETED        = "COMPLETED"

    val values = js.Object.freeze(js.Array(WORK_IN_PROGRESS, FAILED, COMPLETED))
  }

  object ReportTypeEnum {
    val FINDING = "FINDING"
    val FULL    = "FULL"

    val values = js.Object.freeze(js.Array(FINDING, FULL))
  }

  /**
    * Contains information about a resource group. The resource group defines a set of tags that, when queried, identify the AWS resources that make up the assessment target. This data type is used as the response element in the <a>DescribeResourceGroups</a> action.
    */
  @js.native
  trait ResourceGroup extends js.Object {
    var arn: Arn
    var createdAt: Timestamp
    var tags: ResourceGroupTags
  }

  object ResourceGroup {
    @inline
    def apply(
        arn: Arn,
        createdAt: Timestamp,
        tags: ResourceGroupTags
    ): ResourceGroup = {
      val __obj = js.Dynamic.literal(
        "arn"       -> arn.asInstanceOf[js.Any],
        "createdAt" -> createdAt.asInstanceOf[js.Any],
        "tags"      -> tags.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ResourceGroup]
    }
  }

  /**
    * This data type is used as one of the elements of the <a>ResourceGroup</a> data type.
    */
  @js.native
  trait ResourceGroupTag extends js.Object {
    var key: TagKey
    var value: js.UndefOr[TagValue]
  }

  object ResourceGroupTag {
    @inline
    def apply(
        key: TagKey,
        value: js.UndefOr[TagValue] = js.undefined
    ): ResourceGroupTag = {
      val __obj = js.Dynamic.literal(
        "key" -> key.asInstanceOf[js.Any]
      )

      value.foreach(__v => __obj.updateDynamic("value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResourceGroupTag]
    }
  }

  /**
    * Contains information about an Amazon Inspector rules package. This data type is used as the response element in the <a>DescribeRulesPackages</a> action.
    */
  @js.native
  trait RulesPackage extends js.Object {
    var arn: Arn
    var name: RulesPackageName
    var provider: ProviderName
    var version: Version
    var description: js.UndefOr[Text]
  }

  object RulesPackage {
    @inline
    def apply(
        arn: Arn,
        name: RulesPackageName,
        provider: ProviderName,
        version: Version,
        description: js.UndefOr[Text] = js.undefined
    ): RulesPackage = {
      val __obj = js.Dynamic.literal(
        "arn"      -> arn.asInstanceOf[js.Any],
        "name"     -> name.asInstanceOf[js.Any],
        "provider" -> provider.asInstanceOf[js.Any],
        "version"  -> version.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RulesPackage]
    }
  }

  /**
    * This data type contains key-value pairs that identify various Amazon resources.
    */
  @js.native
  trait Scope extends js.Object {
    var key: js.UndefOr[ScopeType]
    var value: js.UndefOr[ScopeValue]
  }

  object Scope {
    @inline
    def apply(
        key: js.UndefOr[ScopeType] = js.undefined,
        value: js.UndefOr[ScopeValue] = js.undefined
    ): Scope = {
      val __obj = js.Dynamic.literal()
      key.foreach(__v => __obj.updateDynamic("key")(__v.asInstanceOf[js.Any]))
      value.foreach(__v => __obj.updateDynamic("value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Scope]
    }
  }

  object ScopeTypeEnum {
    val INSTANCE_ID       = "INSTANCE_ID"
    val RULES_PACKAGE_ARN = "RULES_PACKAGE_ARN"

    val values = js.Object.freeze(js.Array(INSTANCE_ID, RULES_PACKAGE_ARN))
  }

  /**
    * Contains information about a security group associated with a network interface. This data type is used as one of the elements of the <a>NetworkInterface</a> data type.
    */
  @js.native
  trait SecurityGroup extends js.Object {
    var groupId: js.UndefOr[Text]
    var groupName: js.UndefOr[Text]
  }

  object SecurityGroup {
    @inline
    def apply(
        groupId: js.UndefOr[Text] = js.undefined,
        groupName: js.UndefOr[Text] = js.undefined
    ): SecurityGroup = {
      val __obj = js.Dynamic.literal()
      groupId.foreach(__v => __obj.updateDynamic("groupId")(__v.asInstanceOf[js.Any]))
      groupName.foreach(__v => __obj.updateDynamic("groupName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SecurityGroup]
    }
  }

  @js.native
  trait SetTagsForResourceRequest extends js.Object {
    var resourceArn: Arn
    var tags: js.UndefOr[TagList]
  }

  object SetTagsForResourceRequest {
    @inline
    def apply(
        resourceArn: Arn,
        tags: js.UndefOr[TagList] = js.undefined
    ): SetTagsForResourceRequest = {
      val __obj = js.Dynamic.literal(
        "resourceArn" -> resourceArn.asInstanceOf[js.Any]
      )

      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SetTagsForResourceRequest]
    }
  }

  object SeverityEnum {
    val Low           = "Low"
    val Medium        = "Medium"
    val High          = "High"
    val Informational = "Informational"
    val Undefined     = "Undefined"

    val values = js.Object.freeze(js.Array(Low, Medium, High, Informational, Undefined))
  }

  @js.native
  trait StartAssessmentRunRequest extends js.Object {
    var assessmentTemplateArn: Arn
    var assessmentRunName: js.UndefOr[AssessmentRunName]
  }

  object StartAssessmentRunRequest {
    @inline
    def apply(
        assessmentTemplateArn: Arn,
        assessmentRunName: js.UndefOr[AssessmentRunName] = js.undefined
    ): StartAssessmentRunRequest = {
      val __obj = js.Dynamic.literal(
        "assessmentTemplateArn" -> assessmentTemplateArn.asInstanceOf[js.Any]
      )

      assessmentRunName.foreach(__v => __obj.updateDynamic("assessmentRunName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartAssessmentRunRequest]
    }
  }

  @js.native
  trait StartAssessmentRunResponse extends js.Object {
    var assessmentRunArn: Arn
  }

  object StartAssessmentRunResponse {
    @inline
    def apply(
        assessmentRunArn: Arn
    ): StartAssessmentRunResponse = {
      val __obj = js.Dynamic.literal(
        "assessmentRunArn" -> assessmentRunArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[StartAssessmentRunResponse]
    }
  }

  object StopActionEnum {
    val START_EVALUATION = "START_EVALUATION"
    val SKIP_EVALUATION  = "SKIP_EVALUATION"

    val values = js.Object.freeze(js.Array(START_EVALUATION, SKIP_EVALUATION))
  }

  @js.native
  trait StopAssessmentRunRequest extends js.Object {
    var assessmentRunArn: Arn
    var stopAction: js.UndefOr[StopAction]
  }

  object StopAssessmentRunRequest {
    @inline
    def apply(
        assessmentRunArn: Arn,
        stopAction: js.UndefOr[StopAction] = js.undefined
    ): StopAssessmentRunRequest = {
      val __obj = js.Dynamic.literal(
        "assessmentRunArn" -> assessmentRunArn.asInstanceOf[js.Any]
      )

      stopAction.foreach(__v => __obj.updateDynamic("stopAction")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StopAssessmentRunRequest]
    }
  }

  @js.native
  trait SubscribeToEventRequest extends js.Object {
    var event: InspectorEvent
    var resourceArn: Arn
    var topicArn: Arn
  }

  object SubscribeToEventRequest {
    @inline
    def apply(
        event: InspectorEvent,
        resourceArn: Arn,
        topicArn: Arn
    ): SubscribeToEventRequest = {
      val __obj = js.Dynamic.literal(
        "event"       -> event.asInstanceOf[js.Any],
        "resourceArn" -> resourceArn.asInstanceOf[js.Any],
        "topicArn"    -> topicArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[SubscribeToEventRequest]
    }
  }

  /**
    * This data type is used as a response element in the <a>ListEventSubscriptions</a> action.
    */
  @js.native
  trait Subscription extends js.Object {
    var eventSubscriptions: EventSubscriptionList
    var resourceArn: Arn
    var topicArn: Arn
  }

  object Subscription {
    @inline
    def apply(
        eventSubscriptions: EventSubscriptionList,
        resourceArn: Arn,
        topicArn: Arn
    ): Subscription = {
      val __obj = js.Dynamic.literal(
        "eventSubscriptions" -> eventSubscriptions.asInstanceOf[js.Any],
        "resourceArn"        -> resourceArn.asInstanceOf[js.Any],
        "topicArn"           -> topicArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[Subscription]
    }
  }

  /**
    * A key and value pair. This data type is used as a request parameter in the <a>SetTagsForResource</a> action and a response element in the <a>ListTagsForResource</a> action.
    */
  @js.native
  trait Tag extends js.Object {
    var key: TagKey
    var value: js.UndefOr[TagValue]
  }

  object Tag {
    @inline
    def apply(
        key: TagKey,
        value: js.UndefOr[TagValue] = js.undefined
    ): Tag = {
      val __obj = js.Dynamic.literal(
        "key" -> key.asInstanceOf[js.Any]
      )

      value.foreach(__v => __obj.updateDynamic("value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Tag]
    }
  }

  /**
    * The metadata about the Amazon Inspector application data metrics collected by the agent. This data type is used as the response element in the <a>GetTelemetryMetadata</a> action.
    */
  @js.native
  trait TelemetryMetadata extends js.Object {
    var count: Double
    var messageType: MessageType
    var dataSize: js.UndefOr[Double]
  }

  object TelemetryMetadata {
    @inline
    def apply(
        count: Double,
        messageType: MessageType,
        dataSize: js.UndefOr[Double] = js.undefined
    ): TelemetryMetadata = {
      val __obj = js.Dynamic.literal(
        "count"       -> count.asInstanceOf[js.Any],
        "messageType" -> messageType.asInstanceOf[js.Any]
      )

      dataSize.foreach(__v => __obj.updateDynamic("dataSize")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TelemetryMetadata]
    }
  }

  /**
    * This data type is used in the <a>AssessmentRunFilter</a> data type.
    */
  @js.native
  trait TimestampRange extends js.Object {
    var beginDate: js.UndefOr[Timestamp]
    var endDate: js.UndefOr[Timestamp]
  }

  object TimestampRange {
    @inline
    def apply(
        beginDate: js.UndefOr[Timestamp] = js.undefined,
        endDate: js.UndefOr[Timestamp] = js.undefined
    ): TimestampRange = {
      val __obj = js.Dynamic.literal()
      beginDate.foreach(__v => __obj.updateDynamic("beginDate")(__v.asInstanceOf[js.Any]))
      endDate.foreach(__v => __obj.updateDynamic("endDate")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TimestampRange]
    }
  }

  @js.native
  trait UnsubscribeFromEventRequest extends js.Object {
    var event: InspectorEvent
    var resourceArn: Arn
    var topicArn: Arn
  }

  object UnsubscribeFromEventRequest {
    @inline
    def apply(
        event: InspectorEvent,
        resourceArn: Arn,
        topicArn: Arn
    ): UnsubscribeFromEventRequest = {
      val __obj = js.Dynamic.literal(
        "event"       -> event.asInstanceOf[js.Any],
        "resourceArn" -> resourceArn.asInstanceOf[js.Any],
        "topicArn"    -> topicArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UnsubscribeFromEventRequest]
    }
  }

  @js.native
  trait UpdateAssessmentTargetRequest extends js.Object {
    var assessmentTargetArn: Arn
    var assessmentTargetName: AssessmentTargetName
    var resourceGroupArn: js.UndefOr[Arn]
  }

  object UpdateAssessmentTargetRequest {
    @inline
    def apply(
        assessmentTargetArn: Arn,
        assessmentTargetName: AssessmentTargetName,
        resourceGroupArn: js.UndefOr[Arn] = js.undefined
    ): UpdateAssessmentTargetRequest = {
      val __obj = js.Dynamic.literal(
        "assessmentTargetArn"  -> assessmentTargetArn.asInstanceOf[js.Any],
        "assessmentTargetName" -> assessmentTargetName.asInstanceOf[js.Any]
      )

      resourceGroupArn.foreach(__v => __obj.updateDynamic("resourceGroupArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateAssessmentTargetRequest]
    }
  }
}
