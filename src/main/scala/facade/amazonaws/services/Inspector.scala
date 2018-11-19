package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import io.scalajs.nodejs
import facade.amazonaws._

package object inspector {
  type AddRemoveAttributesFindingArnList = js.Array[Arn]
  type AgentHealth = String
  type AgentHealthCode = String
  type AgentHealthCodeList = js.Array[AgentHealthCode]
  type AgentHealthList = js.Array[AgentHealth]
  type AgentId = String
  type AgentIdList = js.Array[AgentId]
  type AgentPreviewList = js.Array[AgentPreview]
  type AgentVersion = String
  type AmiId = String
  type Arn = String
  type ArnCount = Int
  type AssessmentRulesPackageArnList = js.Array[Arn]
  type AssessmentRunAgentList = js.Array[AssessmentRunAgent]
  type AssessmentRunDuration = Int
  type AssessmentRunFindingCounts = js.Dictionary[FindingCount]
  type AssessmentRunList = js.Array[AssessmentRun]
  type AssessmentRunName = String
  type AssessmentRunNotificationList = js.Array[AssessmentRunNotification]
  type AssessmentRunNotificationSnsStatusCode = String
  type AssessmentRunState = String
  type AssessmentRunStateChangeList = js.Array[AssessmentRunStateChange]
  type AssessmentRunStateList = js.Array[AssessmentRunState]
  type AssessmentTargetList = js.Array[AssessmentTarget]
  type AssessmentTargetName = String
  type AssessmentTemplateList = js.Array[AssessmentTemplate]
  type AssessmentTemplateName = String
  type AssessmentTemplateRulesPackageArnList = js.Array[Arn]
  type AssetType = String
  type AttributeKey = String
  type AttributeList = js.Array[Attribute]
  type AttributeValue = String
  type AutoScalingGroup = String
  type AutoScalingGroupList = js.Array[AutoScalingGroup]
  type BatchDescribeArnList = js.Array[Arn]
  type BatchDescribeExclusionsArnList = js.Array[Arn]
  type Bool = Boolean
  type EventSubscriptionList = js.Array[EventSubscription]
  type ExclusionMap = js.Dictionary[Exclusion]
  type ExclusionPreviewList = js.Array[ExclusionPreview]
  type FailedItemErrorCode = String
  type FailedItems = js.Dictionary[FailedItemDetails]
  type FilterRulesPackageArnList = js.Array[Arn]
  type FindingCount = Int
  type FindingId = String
  type FindingList = js.Array[Finding]
  type Hostname = String
  type InspectorEvent = String
  type IocConfidence = Int
  type Ipv4Address = String
  type Ipv4AddressList = js.Array[Ipv4Address]
  type Ipv6Addresses = js.Array[Text]
  type KernelVersion = String
  type ListEventSubscriptionsMaxResults = Int
  type ListMaxResults = Int
  type ListParentArnList = js.Array[Arn]
  type ListReturnedArnList = js.Array[Arn]
  type Locale = String
  type Message = String
  type MessageType = String
  type NamePattern = String
  type NetworkInterfaces = js.Array[NetworkInterface]
  type NumericSeverity = Double
  type NumericVersion = Int
  type OperatingSystem = String
  type PaginationToken = String
  type PreviewAgentsMaxResults = Int
  type PreviewStatus = String
  type PrivateIpAddresses = js.Array[PrivateIp]
  type ProviderName = String
  type ReportFileFormat = String
  type ReportStatus = String
  type ReportType = String
  type ResourceGroupList = js.Array[ResourceGroup]
  type ResourceGroupTags = js.Array[ResourceGroupTag]
  type RuleName = String
  type RuleNameList = js.Array[RuleName]
  type RulesPackageList = js.Array[RulesPackage]
  type RulesPackageName = String
  type ScopeList = js.Array[Scope]
  type ScopeType = String
  type ScopeValue = String
  type SecurityGroups = js.Array[SecurityGroup]
  type ServiceName = String
  type Severity = String
  type SeverityList = js.Array[Severity]
  type StopAction = String
  type SubscriptionList = js.Array[Subscription]
  type TagKey = String
  type TagList = js.Array[Tag]
  type TagValue = String
  type Tags = js.Array[Tag]
  type TelemetryMetadataList = js.Array[TelemetryMetadata]
  type Text = String
  type Timestamp = js.Date
  type UUID = String
  type Url = String
  type UserAttributeKeyList = js.Array[AttributeKey]
  type UserAttributeList = js.Array[Attribute]
  type Version = String
}

package inspector {
  @js.native
  @JSImport("aws-sdk", "Inspector")
  class Inspector(config: AWSConfig) extends js.Object {
    def addAttributesToFindings(params: AddAttributesToFindingsRequest): Request[AddAttributesToFindingsResponse] = js.native
    def createAssessmentTarget(params: CreateAssessmentTargetRequest): Request[CreateAssessmentTargetResponse] = js.native
    def createAssessmentTemplate(params: CreateAssessmentTemplateRequest): Request[CreateAssessmentTemplateResponse] = js.native
    def createExclusionsPreview(params: CreateExclusionsPreviewRequest): Request[CreateExclusionsPreviewResponse] = js.native
    def createResourceGroup(params: CreateResourceGroupRequest): Request[CreateResourceGroupResponse] = js.native
    def deleteAssessmentRun(params: DeleteAssessmentRunRequest): Request[js.Object] = js.native
    def deleteAssessmentTarget(params: DeleteAssessmentTargetRequest): Request[js.Object] = js.native
    def deleteAssessmentTemplate(params: DeleteAssessmentTemplateRequest): Request[js.Object] = js.native
    def describeAssessmentRuns(params: DescribeAssessmentRunsRequest): Request[DescribeAssessmentRunsResponse] = js.native
    def describeAssessmentTargets(params: DescribeAssessmentTargetsRequest): Request[DescribeAssessmentTargetsResponse] = js.native
    def describeAssessmentTemplates(params: DescribeAssessmentTemplatesRequest): Request[DescribeAssessmentTemplatesResponse] = js.native
    def describeCrossAccountAccessRole(): Request[DescribeCrossAccountAccessRoleResponse] = js.native
    def describeExclusions(params: DescribeExclusionsRequest): Request[DescribeExclusionsResponse] = js.native
    def describeFindings(params: DescribeFindingsRequest): Request[DescribeFindingsResponse] = js.native
    def describeResourceGroups(params: DescribeResourceGroupsRequest): Request[DescribeResourceGroupsResponse] = js.native
    def describeRulesPackages(params: DescribeRulesPackagesRequest): Request[DescribeRulesPackagesResponse] = js.native
    def getAssessmentReport(params: GetAssessmentReportRequest): Request[GetAssessmentReportResponse] = js.native
    def getExclusionsPreview(params: GetExclusionsPreviewRequest): Request[GetExclusionsPreviewResponse] = js.native
    def getTelemetryMetadata(params: GetTelemetryMetadataRequest): Request[GetTelemetryMetadataResponse] = js.native
    def listAssessmentRunAgents(params: ListAssessmentRunAgentsRequest): Request[ListAssessmentRunAgentsResponse] = js.native
    def listAssessmentRuns(params: ListAssessmentRunsRequest): Request[ListAssessmentRunsResponse] = js.native
    def listAssessmentTargets(params: ListAssessmentTargetsRequest): Request[ListAssessmentTargetsResponse] = js.native
    def listAssessmentTemplates(params: ListAssessmentTemplatesRequest): Request[ListAssessmentTemplatesResponse] = js.native
    def listEventSubscriptions(params: ListEventSubscriptionsRequest): Request[ListEventSubscriptionsResponse] = js.native
    def listExclusions(params: ListExclusionsRequest): Request[ListExclusionsResponse] = js.native
    def listFindings(params: ListFindingsRequest): Request[ListFindingsResponse] = js.native
    def listRulesPackages(params: ListRulesPackagesRequest): Request[ListRulesPackagesResponse] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def previewAgents(params: PreviewAgentsRequest): Request[PreviewAgentsResponse] = js.native
    def registerCrossAccountAccessRole(params: RegisterCrossAccountAccessRoleRequest): Request[js.Object] = js.native
    def removeAttributesFromFindings(params: RemoveAttributesFromFindingsRequest): Request[RemoveAttributesFromFindingsResponse] = js.native
    def setTagsForResource(params: SetTagsForResourceRequest): Request[js.Object] = js.native
    def startAssessmentRun(params: StartAssessmentRunRequest): Request[StartAssessmentRunResponse] = js.native
    def stopAssessmentRun(params: StopAssessmentRunRequest): Request[js.Object] = js.native
    def subscribeToEvent(params: SubscribeToEventRequest): Request[js.Object] = js.native
    def unsubscribeFromEvent(params: UnsubscribeFromEventRequest): Request[js.Object] = js.native
    def updateAssessmentTarget(params: UpdateAssessmentTargetRequest): Request[js.Object] = js.native
  }

  @js.native
  trait AddAttributesToFindingsRequest extends js.Object {
    var findingArns: js.UndefOr[AddRemoveAttributesFindingArnList]
    var attributes: js.UndefOr[UserAttributeList]
  }

  object AddAttributesToFindingsRequest {
    def apply(
      findingArns: js.UndefOr[AddRemoveAttributesFindingArnList] = js.undefined,
      attributes: js.UndefOr[UserAttributeList] = js.undefined): AddAttributesToFindingsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "findingArns" -> findingArns.map { x => x.asInstanceOf[js.Any] },
        "attributes" -> attributes.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AddAttributesToFindingsRequest]
    }
  }

  @js.native
  trait AddAttributesToFindingsResponse extends js.Object {
    var failedItems: js.UndefOr[FailedItems]
  }

  object AddAttributesToFindingsResponse {
    def apply(
      failedItems: js.UndefOr[FailedItems] = js.undefined): AddAttributesToFindingsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "failedItems" -> failedItems.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AddAttributesToFindingsResponse]
    }
  }

  /**
   * <p>Contains information about an Amazon Inspector agent. This data type is used as a request parameter in the <a>ListAssessmentRunAgents</a> action.</p>
   */
  @js.native
  trait AgentFilter extends js.Object {
    var agentHealths: js.UndefOr[AgentHealthList]
    var agentHealthCodes: js.UndefOr[AgentHealthCodeList]
  }

  object AgentFilter {
    def apply(
      agentHealths: js.UndefOr[AgentHealthList] = js.undefined,
      agentHealthCodes: js.UndefOr[AgentHealthCodeList] = js.undefined): AgentFilter = {
      val _fields = IndexedSeq[(String, js.Any)](
        "agentHealths" -> agentHealths.map { x => x.asInstanceOf[js.Any] },
        "agentHealthCodes" -> agentHealthCodes.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AgentFilter]
    }
  }

  object AgentHealthEnum {
    val HEALTHY = "HEALTHY"
    val UNHEALTHY = "UNHEALTHY"
    val UNKNOWN = "UNKNOWN"

    val values = IndexedSeq(HEALTHY, UNHEALTHY, UNKNOWN)
  }

  object AgentHealthCodeEnum {
    val IDLE = "IDLE"
    val RUNNING = "RUNNING"
    val SHUTDOWN = "SHUTDOWN"
    val UNHEALTHY = "UNHEALTHY"
    val THROTTLED = "THROTTLED"
    val UNKNOWN = "UNKNOWN"

    val values = IndexedSeq(IDLE, RUNNING, SHUTDOWN, UNHEALTHY, THROTTLED, UNKNOWN)
  }

  /**
   * <p>Used as a response element in the <a>PreviewAgents</a> action.</p>
   */
  @js.native
  trait AgentPreview extends js.Object {
    var agentId: js.UndefOr[AgentId]
    var hostname: js.UndefOr[Hostname]
    var autoScalingGroup: js.UndefOr[AutoScalingGroup]
    var operatingSystem: js.UndefOr[OperatingSystem]
    var agentVersion: js.UndefOr[AgentVersion]
    var ipv4Address: js.UndefOr[Ipv4Address]
    var kernelVersion: js.UndefOr[KernelVersion]
    var agentHealth: js.UndefOr[AgentHealth]
  }

  object AgentPreview {
    def apply(
      agentId: js.UndefOr[AgentId] = js.undefined,
      hostname: js.UndefOr[Hostname] = js.undefined,
      autoScalingGroup: js.UndefOr[AutoScalingGroup] = js.undefined,
      operatingSystem: js.UndefOr[OperatingSystem] = js.undefined,
      agentVersion: js.UndefOr[AgentVersion] = js.undefined,
      ipv4Address: js.UndefOr[Ipv4Address] = js.undefined,
      kernelVersion: js.UndefOr[KernelVersion] = js.undefined,
      agentHealth: js.UndefOr[AgentHealth] = js.undefined): AgentPreview = {
      val _fields = IndexedSeq[(String, js.Any)](
        "agentId" -> agentId.map { x => x.asInstanceOf[js.Any] },
        "hostname" -> hostname.map { x => x.asInstanceOf[js.Any] },
        "autoScalingGroup" -> autoScalingGroup.map { x => x.asInstanceOf[js.Any] },
        "operatingSystem" -> operatingSystem.map { x => x.asInstanceOf[js.Any] },
        "agentVersion" -> agentVersion.map { x => x.asInstanceOf[js.Any] },
        "ipv4Address" -> ipv4Address.map { x => x.asInstanceOf[js.Any] },
        "kernelVersion" -> kernelVersion.map { x => x.asInstanceOf[js.Any] },
        "agentHealth" -> agentHealth.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AgentPreview]
    }
  }

  /**
   * <p>A snapshot of an Amazon Inspector assessment run that contains the findings of the assessment run .</p> <p>Used as the response element in the <a>DescribeAssessmentRuns</a> action.</p>
   */
  @js.native
  trait AssessmentRun extends js.Object {
    var arn: js.UndefOr[Arn]
    var name: js.UndefOr[AssessmentRunName]
    var dataCollected: js.UndefOr[Bool]
    var findingCounts: js.UndefOr[AssessmentRunFindingCounts]
    var stateChangedAt: js.UndefOr[Timestamp]
    var state: js.UndefOr[AssessmentRunState]
    var completedAt: js.UndefOr[Timestamp]
    var assessmentTemplateArn: js.UndefOr[Arn]
    var durationInSeconds: js.UndefOr[AssessmentRunDuration]
    var rulesPackageArns: js.UndefOr[AssessmentRulesPackageArnList]
    var createdAt: js.UndefOr[Timestamp]
    var startedAt: js.UndefOr[Timestamp]
    var userAttributesForFindings: js.UndefOr[UserAttributeList]
    var notifications: js.UndefOr[AssessmentRunNotificationList]
    var stateChanges: js.UndefOr[AssessmentRunStateChangeList]
  }

  object AssessmentRun {
    def apply(
      arn: js.UndefOr[Arn] = js.undefined,
      name: js.UndefOr[AssessmentRunName] = js.undefined,
      dataCollected: js.UndefOr[Bool] = js.undefined,
      findingCounts: js.UndefOr[AssessmentRunFindingCounts] = js.undefined,
      stateChangedAt: js.UndefOr[Timestamp] = js.undefined,
      state: js.UndefOr[AssessmentRunState] = js.undefined,
      completedAt: js.UndefOr[Timestamp] = js.undefined,
      assessmentTemplateArn: js.UndefOr[Arn] = js.undefined,
      durationInSeconds: js.UndefOr[AssessmentRunDuration] = js.undefined,
      rulesPackageArns: js.UndefOr[AssessmentRulesPackageArnList] = js.undefined,
      createdAt: js.UndefOr[Timestamp] = js.undefined,
      startedAt: js.UndefOr[Timestamp] = js.undefined,
      userAttributesForFindings: js.UndefOr[UserAttributeList] = js.undefined,
      notifications: js.UndefOr[AssessmentRunNotificationList] = js.undefined,
      stateChanges: js.UndefOr[AssessmentRunStateChangeList] = js.undefined): AssessmentRun = {
      val _fields = IndexedSeq[(String, js.Any)](
        "arn" -> arn.map { x => x.asInstanceOf[js.Any] },
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "dataCollected" -> dataCollected.map { x => x.asInstanceOf[js.Any] },
        "findingCounts" -> findingCounts.map { x => x.asInstanceOf[js.Any] },
        "stateChangedAt" -> stateChangedAt.map { x => x.asInstanceOf[js.Any] },
        "state" -> state.map { x => x.asInstanceOf[js.Any] },
        "completedAt" -> completedAt.map { x => x.asInstanceOf[js.Any] },
        "assessmentTemplateArn" -> assessmentTemplateArn.map { x => x.asInstanceOf[js.Any] },
        "durationInSeconds" -> durationInSeconds.map { x => x.asInstanceOf[js.Any] },
        "rulesPackageArns" -> rulesPackageArns.map { x => x.asInstanceOf[js.Any] },
        "createdAt" -> createdAt.map { x => x.asInstanceOf[js.Any] },
        "startedAt" -> startedAt.map { x => x.asInstanceOf[js.Any] },
        "userAttributesForFindings" -> userAttributesForFindings.map { x => x.asInstanceOf[js.Any] },
        "notifications" -> notifications.map { x => x.asInstanceOf[js.Any] },
        "stateChanges" -> stateChanges.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssessmentRun]
    }
  }

  /**
   * <p>Contains information about an Amazon Inspector agent. This data type is used as a response element in the <a>ListAssessmentRunAgents</a> action.</p>
   */
  @js.native
  trait AssessmentRunAgent extends js.Object {
    var agentId: js.UndefOr[AgentId]
    var autoScalingGroup: js.UndefOr[AutoScalingGroup]
    var agentHealthDetails: js.UndefOr[Message]
    var assessmentRunArn: js.UndefOr[Arn]
    var telemetryMetadata: js.UndefOr[TelemetryMetadataList]
    var agentHealth: js.UndefOr[AgentHealth]
    var agentHealthCode: js.UndefOr[AgentHealthCode]
  }

  object AssessmentRunAgent {
    def apply(
      agentId: js.UndefOr[AgentId] = js.undefined,
      autoScalingGroup: js.UndefOr[AutoScalingGroup] = js.undefined,
      agentHealthDetails: js.UndefOr[Message] = js.undefined,
      assessmentRunArn: js.UndefOr[Arn] = js.undefined,
      telemetryMetadata: js.UndefOr[TelemetryMetadataList] = js.undefined,
      agentHealth: js.UndefOr[AgentHealth] = js.undefined,
      agentHealthCode: js.UndefOr[AgentHealthCode] = js.undefined): AssessmentRunAgent = {
      val _fields = IndexedSeq[(String, js.Any)](
        "agentId" -> agentId.map { x => x.asInstanceOf[js.Any] },
        "autoScalingGroup" -> autoScalingGroup.map { x => x.asInstanceOf[js.Any] },
        "agentHealthDetails" -> agentHealthDetails.map { x => x.asInstanceOf[js.Any] },
        "assessmentRunArn" -> assessmentRunArn.map { x => x.asInstanceOf[js.Any] },
        "telemetryMetadata" -> telemetryMetadata.map { x => x.asInstanceOf[js.Any] },
        "agentHealth" -> agentHealth.map { x => x.asInstanceOf[js.Any] },
        "agentHealthCode" -> agentHealthCode.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssessmentRunAgent]
    }
  }

  /**
   * <p>Used as the request parameter in the <a>ListAssessmentRuns</a> action.</p>
   */
  @js.native
  trait AssessmentRunFilter extends js.Object {
    var namePattern: js.UndefOr[NamePattern]
    var completionTimeRange: js.UndefOr[TimestampRange]
    var rulesPackageArns: js.UndefOr[FilterRulesPackageArnList]
    var durationRange: js.UndefOr[DurationRange]
    var startTimeRange: js.UndefOr[TimestampRange]
    var stateChangeTimeRange: js.UndefOr[TimestampRange]
    var states: js.UndefOr[AssessmentRunStateList]
  }

  object AssessmentRunFilter {
    def apply(
      namePattern: js.UndefOr[NamePattern] = js.undefined,
      completionTimeRange: js.UndefOr[TimestampRange] = js.undefined,
      rulesPackageArns: js.UndefOr[FilterRulesPackageArnList] = js.undefined,
      durationRange: js.UndefOr[DurationRange] = js.undefined,
      startTimeRange: js.UndefOr[TimestampRange] = js.undefined,
      stateChangeTimeRange: js.UndefOr[TimestampRange] = js.undefined,
      states: js.UndefOr[AssessmentRunStateList] = js.undefined): AssessmentRunFilter = {
      val _fields = IndexedSeq[(String, js.Any)](
        "namePattern" -> namePattern.map { x => x.asInstanceOf[js.Any] },
        "completionTimeRange" -> completionTimeRange.map { x => x.asInstanceOf[js.Any] },
        "rulesPackageArns" -> rulesPackageArns.map { x => x.asInstanceOf[js.Any] },
        "durationRange" -> durationRange.map { x => x.asInstanceOf[js.Any] },
        "startTimeRange" -> startTimeRange.map { x => x.asInstanceOf[js.Any] },
        "stateChangeTimeRange" -> stateChangeTimeRange.map { x => x.asInstanceOf[js.Any] },
        "states" -> states.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssessmentRunFilter]
    }
  }

  /**
   * <p>Used as one of the elements of the <a>AssessmentRun</a> data type.</p>
   */
  @js.native
  trait AssessmentRunNotification extends js.Object {
    var event: js.UndefOr[InspectorEvent]
    var error: js.UndefOr[Bool]
    var date: js.UndefOr[Timestamp]
    var snsPublishStatusCode: js.UndefOr[AssessmentRunNotificationSnsStatusCode]
    var message: js.UndefOr[Message]
    var snsTopicArn: js.UndefOr[Arn]
  }

  object AssessmentRunNotification {
    def apply(
      event: js.UndefOr[InspectorEvent] = js.undefined,
      error: js.UndefOr[Bool] = js.undefined,
      date: js.UndefOr[Timestamp] = js.undefined,
      snsPublishStatusCode: js.UndefOr[AssessmentRunNotificationSnsStatusCode] = js.undefined,
      message: js.UndefOr[Message] = js.undefined,
      snsTopicArn: js.UndefOr[Arn] = js.undefined): AssessmentRunNotification = {
      val _fields = IndexedSeq[(String, js.Any)](
        "event" -> event.map { x => x.asInstanceOf[js.Any] },
        "error" -> error.map { x => x.asInstanceOf[js.Any] },
        "date" -> date.map { x => x.asInstanceOf[js.Any] },
        "snsPublishStatusCode" -> snsPublishStatusCode.map { x => x.asInstanceOf[js.Any] },
        "message" -> message.map { x => x.asInstanceOf[js.Any] },
        "snsTopicArn" -> snsTopicArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssessmentRunNotification]
    }
  }

  object AssessmentRunNotificationSnsStatusCodeEnum {
    val SUCCESS = "SUCCESS"
    val TOPIC_DOES_NOT_EXIST = "TOPIC_DOES_NOT_EXIST"
    val ACCESS_DENIED = "ACCESS_DENIED"
    val INTERNAL_ERROR = "INTERNAL_ERROR"

    val values = IndexedSeq(SUCCESS, TOPIC_DOES_NOT_EXIST, ACCESS_DENIED, INTERNAL_ERROR)
  }

  object AssessmentRunStateEnum {
    val CREATED = "CREATED"
    val START_DATA_COLLECTION_PENDING = "START_DATA_COLLECTION_PENDING"
    val START_DATA_COLLECTION_IN_PROGRESS = "START_DATA_COLLECTION_IN_PROGRESS"
    val COLLECTING_DATA = "COLLECTING_DATA"
    val STOP_DATA_COLLECTION_PENDING = "STOP_DATA_COLLECTION_PENDING"
    val DATA_COLLECTED = "DATA_COLLECTED"
    val START_EVALUATING_RULES_PENDING = "START_EVALUATING_RULES_PENDING"
    val EVALUATING_RULES = "EVALUATING_RULES"
    val FAILED = "FAILED"
    val ERROR = "ERROR"
    val COMPLETED = "COMPLETED"
    val COMPLETED_WITH_ERRORS = "COMPLETED_WITH_ERRORS"
    val CANCELED = "CANCELED"

    val values = IndexedSeq(CREATED, START_DATA_COLLECTION_PENDING, START_DATA_COLLECTION_IN_PROGRESS, COLLECTING_DATA, STOP_DATA_COLLECTION_PENDING, DATA_COLLECTED, START_EVALUATING_RULES_PENDING, EVALUATING_RULES, FAILED, ERROR, COMPLETED, COMPLETED_WITH_ERRORS, CANCELED)
  }

  /**
   * <p>Used as one of the elements of the <a>AssessmentRun</a> data type.</p>
   */
  @js.native
  trait AssessmentRunStateChange extends js.Object {
    var stateChangedAt: js.UndefOr[Timestamp]
    var state: js.UndefOr[AssessmentRunState]
  }

  object AssessmentRunStateChange {
    def apply(
      stateChangedAt: js.UndefOr[Timestamp] = js.undefined,
      state: js.UndefOr[AssessmentRunState] = js.undefined): AssessmentRunStateChange = {
      val _fields = IndexedSeq[(String, js.Any)](
        "stateChangedAt" -> stateChangedAt.map { x => x.asInstanceOf[js.Any] },
        "state" -> state.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssessmentRunStateChange]
    }
  }

  /**
   * <p>Contains information about an Amazon Inspector application. This data type is used as the response element in the <a>DescribeAssessmentTargets</a> action.</p>
   */
  @js.native
  trait AssessmentTarget extends js.Object {
    var arn: js.UndefOr[Arn]
    var name: js.UndefOr[AssessmentTargetName]
    var updatedAt: js.UndefOr[Timestamp]
    var resourceGroupArn: js.UndefOr[Arn]
    var createdAt: js.UndefOr[Timestamp]
  }

  object AssessmentTarget {
    def apply(
      arn: js.UndefOr[Arn] = js.undefined,
      name: js.UndefOr[AssessmentTargetName] = js.undefined,
      updatedAt: js.UndefOr[Timestamp] = js.undefined,
      resourceGroupArn: js.UndefOr[Arn] = js.undefined,
      createdAt: js.UndefOr[Timestamp] = js.undefined): AssessmentTarget = {
      val _fields = IndexedSeq[(String, js.Any)](
        "arn" -> arn.map { x => x.asInstanceOf[js.Any] },
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "updatedAt" -> updatedAt.map { x => x.asInstanceOf[js.Any] },
        "resourceGroupArn" -> resourceGroupArn.map { x => x.asInstanceOf[js.Any] },
        "createdAt" -> createdAt.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssessmentTarget]
    }
  }

  /**
   * <p>Used as the request parameter in the <a>ListAssessmentTargets</a> action.</p>
   */
  @js.native
  trait AssessmentTargetFilter extends js.Object {
    var assessmentTargetNamePattern: js.UndefOr[NamePattern]
  }

  object AssessmentTargetFilter {
    def apply(
      assessmentTargetNamePattern: js.UndefOr[NamePattern] = js.undefined): AssessmentTargetFilter = {
      val _fields = IndexedSeq[(String, js.Any)](
        "assessmentTargetNamePattern" -> assessmentTargetNamePattern.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssessmentTargetFilter]
    }
  }

  /**
   * <p>Contains information about an Amazon Inspector assessment template. This data type is used as the response element in the <a>DescribeAssessmentTemplates</a> action.</p>
   */
  @js.native
  trait AssessmentTemplate extends js.Object {
    var arn: js.UndefOr[Arn]
    var name: js.UndefOr[AssessmentTemplateName]
    var lastAssessmentRunArn: js.UndefOr[Arn]
    var durationInSeconds: js.UndefOr[AssessmentRunDuration]
    var assessmentTargetArn: js.UndefOr[Arn]
    var assessmentRunCount: js.UndefOr[ArnCount]
    var rulesPackageArns: js.UndefOr[AssessmentTemplateRulesPackageArnList]
    var createdAt: js.UndefOr[Timestamp]
    var userAttributesForFindings: js.UndefOr[UserAttributeList]
  }

  object AssessmentTemplate {
    def apply(
      arn: js.UndefOr[Arn] = js.undefined,
      name: js.UndefOr[AssessmentTemplateName] = js.undefined,
      lastAssessmentRunArn: js.UndefOr[Arn] = js.undefined,
      durationInSeconds: js.UndefOr[AssessmentRunDuration] = js.undefined,
      assessmentTargetArn: js.UndefOr[Arn] = js.undefined,
      assessmentRunCount: js.UndefOr[ArnCount] = js.undefined,
      rulesPackageArns: js.UndefOr[AssessmentTemplateRulesPackageArnList] = js.undefined,
      createdAt: js.UndefOr[Timestamp] = js.undefined,
      userAttributesForFindings: js.UndefOr[UserAttributeList] = js.undefined): AssessmentTemplate = {
      val _fields = IndexedSeq[(String, js.Any)](
        "arn" -> arn.map { x => x.asInstanceOf[js.Any] },
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "lastAssessmentRunArn" -> lastAssessmentRunArn.map { x => x.asInstanceOf[js.Any] },
        "durationInSeconds" -> durationInSeconds.map { x => x.asInstanceOf[js.Any] },
        "assessmentTargetArn" -> assessmentTargetArn.map { x => x.asInstanceOf[js.Any] },
        "assessmentRunCount" -> assessmentRunCount.map { x => x.asInstanceOf[js.Any] },
        "rulesPackageArns" -> rulesPackageArns.map { x => x.asInstanceOf[js.Any] },
        "createdAt" -> createdAt.map { x => x.asInstanceOf[js.Any] },
        "userAttributesForFindings" -> userAttributesForFindings.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssessmentTemplate]
    }
  }

  /**
   * <p>Used as the request parameter in the <a>ListAssessmentTemplates</a> action.</p>
   */
  @js.native
  trait AssessmentTemplateFilter extends js.Object {
    var namePattern: js.UndefOr[NamePattern]
    var durationRange: js.UndefOr[DurationRange]
    var rulesPackageArns: js.UndefOr[FilterRulesPackageArnList]
  }

  object AssessmentTemplateFilter {
    def apply(
      namePattern: js.UndefOr[NamePattern] = js.undefined,
      durationRange: js.UndefOr[DurationRange] = js.undefined,
      rulesPackageArns: js.UndefOr[FilterRulesPackageArnList] = js.undefined): AssessmentTemplateFilter = {
      val _fields = IndexedSeq[(String, js.Any)](
        "namePattern" -> namePattern.map { x => x.asInstanceOf[js.Any] },
        "durationRange" -> durationRange.map { x => x.asInstanceOf[js.Any] },
        "rulesPackageArns" -> rulesPackageArns.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssessmentTemplateFilter]
    }
  }

  /**
   * <p>A collection of attributes of the host from which the finding is generated.</p>
   */
  @js.native
  trait AssetAttributes extends js.Object {
    var agentId: js.UndefOr[AgentId]
    var ipv4Addresses: js.UndefOr[Ipv4AddressList]
    var hostname: js.UndefOr[Hostname]
    var networkInterfaces: js.UndefOr[NetworkInterfaces]
    var tags: js.UndefOr[Tags]
    var autoScalingGroup: js.UndefOr[AutoScalingGroup]
    var amiId: js.UndefOr[AmiId]
    var schemaVersion: js.UndefOr[NumericVersion]
  }

  object AssetAttributes {
    def apply(
      agentId: js.UndefOr[AgentId] = js.undefined,
      ipv4Addresses: js.UndefOr[Ipv4AddressList] = js.undefined,
      hostname: js.UndefOr[Hostname] = js.undefined,
      networkInterfaces: js.UndefOr[NetworkInterfaces] = js.undefined,
      tags: js.UndefOr[Tags] = js.undefined,
      autoScalingGroup: js.UndefOr[AutoScalingGroup] = js.undefined,
      amiId: js.UndefOr[AmiId] = js.undefined,
      schemaVersion: js.UndefOr[NumericVersion] = js.undefined): AssetAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        "agentId" -> agentId.map { x => x.asInstanceOf[js.Any] },
        "ipv4Addresses" -> ipv4Addresses.map { x => x.asInstanceOf[js.Any] },
        "hostname" -> hostname.map { x => x.asInstanceOf[js.Any] },
        "networkInterfaces" -> networkInterfaces.map { x => x.asInstanceOf[js.Any] },
        "tags" -> tags.map { x => x.asInstanceOf[js.Any] },
        "autoScalingGroup" -> autoScalingGroup.map { x => x.asInstanceOf[js.Any] },
        "amiId" -> amiId.map { x => x.asInstanceOf[js.Any] },
        "schemaVersion" -> schemaVersion.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssetAttributes]
    }
  }

  object AssetTypeEnum {
    val `ec2-instance` = "ec2-instance"

    val values = IndexedSeq(`ec2-instance`)
  }

  /**
   * <p>This data type is used as a request parameter in the <a>AddAttributesToFindings</a> and <a>CreateAssessmentTemplate</a> actions.</p>
   */
  @js.native
  trait Attribute extends js.Object {
    var key: js.UndefOr[AttributeKey]
    var value: js.UndefOr[AttributeValue]
  }

  object Attribute {
    def apply(
      key: js.UndefOr[AttributeKey] = js.undefined,
      value: js.UndefOr[AttributeValue] = js.undefined): Attribute = {
      val _fields = IndexedSeq[(String, js.Any)](
        "key" -> key.map { x => x.asInstanceOf[js.Any] },
        "value" -> value.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Attribute]
    }
  }

  @js.native
  trait CreateAssessmentTargetRequest extends js.Object {
    var assessmentTargetName: js.UndefOr[AssessmentTargetName]
    var resourceGroupArn: js.UndefOr[Arn]
  }

  object CreateAssessmentTargetRequest {
    def apply(
      assessmentTargetName: js.UndefOr[AssessmentTargetName] = js.undefined,
      resourceGroupArn: js.UndefOr[Arn] = js.undefined): CreateAssessmentTargetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "assessmentTargetName" -> assessmentTargetName.map { x => x.asInstanceOf[js.Any] },
        "resourceGroupArn" -> resourceGroupArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateAssessmentTargetRequest]
    }
  }

  @js.native
  trait CreateAssessmentTargetResponse extends js.Object {
    var assessmentTargetArn: js.UndefOr[Arn]
  }

  object CreateAssessmentTargetResponse {
    def apply(
      assessmentTargetArn: js.UndefOr[Arn] = js.undefined): CreateAssessmentTargetResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "assessmentTargetArn" -> assessmentTargetArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateAssessmentTargetResponse]
    }
  }

  @js.native
  trait CreateAssessmentTemplateRequest extends js.Object {
    var assessmentTemplateName: js.UndefOr[AssessmentTemplateName]
    var durationInSeconds: js.UndefOr[AssessmentRunDuration]
    var assessmentTargetArn: js.UndefOr[Arn]
    var rulesPackageArns: js.UndefOr[AssessmentTemplateRulesPackageArnList]
    var userAttributesForFindings: js.UndefOr[UserAttributeList]
  }

  object CreateAssessmentTemplateRequest {
    def apply(
      assessmentTemplateName: js.UndefOr[AssessmentTemplateName] = js.undefined,
      durationInSeconds: js.UndefOr[AssessmentRunDuration] = js.undefined,
      assessmentTargetArn: js.UndefOr[Arn] = js.undefined,
      rulesPackageArns: js.UndefOr[AssessmentTemplateRulesPackageArnList] = js.undefined,
      userAttributesForFindings: js.UndefOr[UserAttributeList] = js.undefined): CreateAssessmentTemplateRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "assessmentTemplateName" -> assessmentTemplateName.map { x => x.asInstanceOf[js.Any] },
        "durationInSeconds" -> durationInSeconds.map { x => x.asInstanceOf[js.Any] },
        "assessmentTargetArn" -> assessmentTargetArn.map { x => x.asInstanceOf[js.Any] },
        "rulesPackageArns" -> rulesPackageArns.map { x => x.asInstanceOf[js.Any] },
        "userAttributesForFindings" -> userAttributesForFindings.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateAssessmentTemplateRequest]
    }
  }

  @js.native
  trait CreateAssessmentTemplateResponse extends js.Object {
    var assessmentTemplateArn: js.UndefOr[Arn]
  }

  object CreateAssessmentTemplateResponse {
    def apply(
      assessmentTemplateArn: js.UndefOr[Arn] = js.undefined): CreateAssessmentTemplateResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "assessmentTemplateArn" -> assessmentTemplateArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateAssessmentTemplateResponse]
    }
  }

  @js.native
  trait CreateExclusionsPreviewRequest extends js.Object {
    var assessmentTemplateArn: js.UndefOr[Arn]
  }

  object CreateExclusionsPreviewRequest {
    def apply(
      assessmentTemplateArn: js.UndefOr[Arn] = js.undefined): CreateExclusionsPreviewRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "assessmentTemplateArn" -> assessmentTemplateArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateExclusionsPreviewRequest]
    }
  }

  @js.native
  trait CreateExclusionsPreviewResponse extends js.Object {
    var previewToken: js.UndefOr[UUID]
  }

  object CreateExclusionsPreviewResponse {
    def apply(
      previewToken: js.UndefOr[UUID] = js.undefined): CreateExclusionsPreviewResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "previewToken" -> previewToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateExclusionsPreviewResponse]
    }
  }

  @js.native
  trait CreateResourceGroupRequest extends js.Object {
    var resourceGroupTags: js.UndefOr[ResourceGroupTags]
  }

  object CreateResourceGroupRequest {
    def apply(
      resourceGroupTags: js.UndefOr[ResourceGroupTags] = js.undefined): CreateResourceGroupRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "resourceGroupTags" -> resourceGroupTags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateResourceGroupRequest]
    }
  }

  @js.native
  trait CreateResourceGroupResponse extends js.Object {
    var resourceGroupArn: js.UndefOr[Arn]
  }

  object CreateResourceGroupResponse {
    def apply(
      resourceGroupArn: js.UndefOr[Arn] = js.undefined): CreateResourceGroupResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "resourceGroupArn" -> resourceGroupArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateResourceGroupResponse]
    }
  }

  @js.native
  trait DeleteAssessmentRunRequest extends js.Object {
    var assessmentRunArn: js.UndefOr[Arn]
  }

  object DeleteAssessmentRunRequest {
    def apply(
      assessmentRunArn: js.UndefOr[Arn] = js.undefined): DeleteAssessmentRunRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "assessmentRunArn" -> assessmentRunArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteAssessmentRunRequest]
    }
  }

  @js.native
  trait DeleteAssessmentTargetRequest extends js.Object {
    var assessmentTargetArn: js.UndefOr[Arn]
  }

  object DeleteAssessmentTargetRequest {
    def apply(
      assessmentTargetArn: js.UndefOr[Arn] = js.undefined): DeleteAssessmentTargetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "assessmentTargetArn" -> assessmentTargetArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteAssessmentTargetRequest]
    }
  }

  @js.native
  trait DeleteAssessmentTemplateRequest extends js.Object {
    var assessmentTemplateArn: js.UndefOr[Arn]
  }

  object DeleteAssessmentTemplateRequest {
    def apply(
      assessmentTemplateArn: js.UndefOr[Arn] = js.undefined): DeleteAssessmentTemplateRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "assessmentTemplateArn" -> assessmentTemplateArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteAssessmentTemplateRequest]
    }
  }

  @js.native
  trait DescribeAssessmentRunsRequest extends js.Object {
    var assessmentRunArns: js.UndefOr[BatchDescribeArnList]
  }

  object DescribeAssessmentRunsRequest {
    def apply(
      assessmentRunArns: js.UndefOr[BatchDescribeArnList] = js.undefined): DescribeAssessmentRunsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "assessmentRunArns" -> assessmentRunArns.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeAssessmentRunsRequest]
    }
  }

  @js.native
  trait DescribeAssessmentRunsResponse extends js.Object {
    var assessmentRuns: js.UndefOr[AssessmentRunList]
    var failedItems: js.UndefOr[FailedItems]
  }

  object DescribeAssessmentRunsResponse {
    def apply(
      assessmentRuns: js.UndefOr[AssessmentRunList] = js.undefined,
      failedItems: js.UndefOr[FailedItems] = js.undefined): DescribeAssessmentRunsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "assessmentRuns" -> assessmentRuns.map { x => x.asInstanceOf[js.Any] },
        "failedItems" -> failedItems.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeAssessmentRunsResponse]
    }
  }

  @js.native
  trait DescribeAssessmentTargetsRequest extends js.Object {
    var assessmentTargetArns: js.UndefOr[BatchDescribeArnList]
  }

  object DescribeAssessmentTargetsRequest {
    def apply(
      assessmentTargetArns: js.UndefOr[BatchDescribeArnList] = js.undefined): DescribeAssessmentTargetsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "assessmentTargetArns" -> assessmentTargetArns.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeAssessmentTargetsRequest]
    }
  }

  @js.native
  trait DescribeAssessmentTargetsResponse extends js.Object {
    var assessmentTargets: js.UndefOr[AssessmentTargetList]
    var failedItems: js.UndefOr[FailedItems]
  }

  object DescribeAssessmentTargetsResponse {
    def apply(
      assessmentTargets: js.UndefOr[AssessmentTargetList] = js.undefined,
      failedItems: js.UndefOr[FailedItems] = js.undefined): DescribeAssessmentTargetsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "assessmentTargets" -> assessmentTargets.map { x => x.asInstanceOf[js.Any] },
        "failedItems" -> failedItems.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeAssessmentTargetsResponse]
    }
  }

  @js.native
  trait DescribeAssessmentTemplatesRequest extends js.Object {
    var assessmentTemplateArns: js.UndefOr[BatchDescribeArnList]
  }

  object DescribeAssessmentTemplatesRequest {
    def apply(
      assessmentTemplateArns: js.UndefOr[BatchDescribeArnList] = js.undefined): DescribeAssessmentTemplatesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "assessmentTemplateArns" -> assessmentTemplateArns.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeAssessmentTemplatesRequest]
    }
  }

  @js.native
  trait DescribeAssessmentTemplatesResponse extends js.Object {
    var assessmentTemplates: js.UndefOr[AssessmentTemplateList]
    var failedItems: js.UndefOr[FailedItems]
  }

  object DescribeAssessmentTemplatesResponse {
    def apply(
      assessmentTemplates: js.UndefOr[AssessmentTemplateList] = js.undefined,
      failedItems: js.UndefOr[FailedItems] = js.undefined): DescribeAssessmentTemplatesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "assessmentTemplates" -> assessmentTemplates.map { x => x.asInstanceOf[js.Any] },
        "failedItems" -> failedItems.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeAssessmentTemplatesResponse]
    }
  }

  @js.native
  trait DescribeCrossAccountAccessRoleResponse extends js.Object {
    var roleArn: js.UndefOr[Arn]
    var valid: js.UndefOr[Bool]
    var registeredAt: js.UndefOr[Timestamp]
  }

  object DescribeCrossAccountAccessRoleResponse {
    def apply(
      roleArn: js.UndefOr[Arn] = js.undefined,
      valid: js.UndefOr[Bool] = js.undefined,
      registeredAt: js.UndefOr[Timestamp] = js.undefined): DescribeCrossAccountAccessRoleResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "roleArn" -> roleArn.map { x => x.asInstanceOf[js.Any] },
        "valid" -> valid.map { x => x.asInstanceOf[js.Any] },
        "registeredAt" -> registeredAt.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeCrossAccountAccessRoleResponse]
    }
  }

  @js.native
  trait DescribeExclusionsRequest extends js.Object {
    var exclusionArns: js.UndefOr[BatchDescribeExclusionsArnList]
    var locale: js.UndefOr[Locale]
  }

  object DescribeExclusionsRequest {
    def apply(
      exclusionArns: js.UndefOr[BatchDescribeExclusionsArnList] = js.undefined,
      locale: js.UndefOr[Locale] = js.undefined): DescribeExclusionsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "exclusionArns" -> exclusionArns.map { x => x.asInstanceOf[js.Any] },
        "locale" -> locale.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeExclusionsRequest]
    }
  }

  @js.native
  trait DescribeExclusionsResponse extends js.Object {
    var exclusions: js.UndefOr[ExclusionMap]
    var failedItems: js.UndefOr[FailedItems]
  }

  object DescribeExclusionsResponse {
    def apply(
      exclusions: js.UndefOr[ExclusionMap] = js.undefined,
      failedItems: js.UndefOr[FailedItems] = js.undefined): DescribeExclusionsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "exclusions" -> exclusions.map { x => x.asInstanceOf[js.Any] },
        "failedItems" -> failedItems.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeExclusionsResponse]
    }
  }

  @js.native
  trait DescribeFindingsRequest extends js.Object {
    var findingArns: js.UndefOr[BatchDescribeArnList]
    var locale: js.UndefOr[Locale]
  }

  object DescribeFindingsRequest {
    def apply(
      findingArns: js.UndefOr[BatchDescribeArnList] = js.undefined,
      locale: js.UndefOr[Locale] = js.undefined): DescribeFindingsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "findingArns" -> findingArns.map { x => x.asInstanceOf[js.Any] },
        "locale" -> locale.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeFindingsRequest]
    }
  }

  @js.native
  trait DescribeFindingsResponse extends js.Object {
    var findings: js.UndefOr[FindingList]
    var failedItems: js.UndefOr[FailedItems]
  }

  object DescribeFindingsResponse {
    def apply(
      findings: js.UndefOr[FindingList] = js.undefined,
      failedItems: js.UndefOr[FailedItems] = js.undefined): DescribeFindingsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "findings" -> findings.map { x => x.asInstanceOf[js.Any] },
        "failedItems" -> failedItems.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeFindingsResponse]
    }
  }

  @js.native
  trait DescribeResourceGroupsRequest extends js.Object {
    var resourceGroupArns: js.UndefOr[BatchDescribeArnList]
  }

  object DescribeResourceGroupsRequest {
    def apply(
      resourceGroupArns: js.UndefOr[BatchDescribeArnList] = js.undefined): DescribeResourceGroupsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "resourceGroupArns" -> resourceGroupArns.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeResourceGroupsRequest]
    }
  }

  @js.native
  trait DescribeResourceGroupsResponse extends js.Object {
    var resourceGroups: js.UndefOr[ResourceGroupList]
    var failedItems: js.UndefOr[FailedItems]
  }

  object DescribeResourceGroupsResponse {
    def apply(
      resourceGroups: js.UndefOr[ResourceGroupList] = js.undefined,
      failedItems: js.UndefOr[FailedItems] = js.undefined): DescribeResourceGroupsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "resourceGroups" -> resourceGroups.map { x => x.asInstanceOf[js.Any] },
        "failedItems" -> failedItems.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeResourceGroupsResponse]
    }
  }

  @js.native
  trait DescribeRulesPackagesRequest extends js.Object {
    var rulesPackageArns: js.UndefOr[BatchDescribeArnList]
    var locale: js.UndefOr[Locale]
  }

  object DescribeRulesPackagesRequest {
    def apply(
      rulesPackageArns: js.UndefOr[BatchDescribeArnList] = js.undefined,
      locale: js.UndefOr[Locale] = js.undefined): DescribeRulesPackagesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "rulesPackageArns" -> rulesPackageArns.map { x => x.asInstanceOf[js.Any] },
        "locale" -> locale.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeRulesPackagesRequest]
    }
  }

  @js.native
  trait DescribeRulesPackagesResponse extends js.Object {
    var rulesPackages: js.UndefOr[RulesPackageList]
    var failedItems: js.UndefOr[FailedItems]
  }

  object DescribeRulesPackagesResponse {
    def apply(
      rulesPackages: js.UndefOr[RulesPackageList] = js.undefined,
      failedItems: js.UndefOr[FailedItems] = js.undefined): DescribeRulesPackagesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "rulesPackages" -> rulesPackages.map { x => x.asInstanceOf[js.Any] },
        "failedItems" -> failedItems.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeRulesPackagesResponse]
    }
  }

  /**
   * <p>This data type is used in the <a>AssessmentTemplateFilter</a> data type.</p>
   */
  @js.native
  trait DurationRange extends js.Object {
    var minSeconds: js.UndefOr[AssessmentRunDuration]
    var maxSeconds: js.UndefOr[AssessmentRunDuration]
  }

  object DurationRange {
    def apply(
      minSeconds: js.UndefOr[AssessmentRunDuration] = js.undefined,
      maxSeconds: js.UndefOr[AssessmentRunDuration] = js.undefined): DurationRange = {
      val _fields = IndexedSeq[(String, js.Any)](
        "minSeconds" -> minSeconds.map { x => x.asInstanceOf[js.Any] },
        "maxSeconds" -> maxSeconds.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DurationRange]
    }
  }

  /**
   * <p>This data type is used in the <a>Subscription</a> data type.</p>
   */
  @js.native
  trait EventSubscription extends js.Object {
    var event: js.UndefOr[InspectorEvent]
    var subscribedAt: js.UndefOr[Timestamp]
  }

  object EventSubscription {
    def apply(
      event: js.UndefOr[InspectorEvent] = js.undefined,
      subscribedAt: js.UndefOr[Timestamp] = js.undefined): EventSubscription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "event" -> event.map { x => x.asInstanceOf[js.Any] },
        "subscribedAt" -> subscribedAt.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EventSubscription]
    }
  }

  /**
   * <p>Contains information about what was excluded from an assessment run.</p>
   */
  @js.native
  trait Exclusion extends js.Object {
    var arn: js.UndefOr[Arn]
    var description: js.UndefOr[Text]
    var scopes: js.UndefOr[ScopeList]
    var recommendation: js.UndefOr[Text]
    var attributes: js.UndefOr[AttributeList]
    var title: js.UndefOr[Text]
  }

  object Exclusion {
    def apply(
      arn: js.UndefOr[Arn] = js.undefined,
      description: js.UndefOr[Text] = js.undefined,
      scopes: js.UndefOr[ScopeList] = js.undefined,
      recommendation: js.UndefOr[Text] = js.undefined,
      attributes: js.UndefOr[AttributeList] = js.undefined,
      title: js.UndefOr[Text] = js.undefined): Exclusion = {
      val _fields = IndexedSeq[(String, js.Any)](
        "arn" -> arn.map { x => x.asInstanceOf[js.Any] },
        "description" -> description.map { x => x.asInstanceOf[js.Any] },
        "scopes" -> scopes.map { x => x.asInstanceOf[js.Any] },
        "recommendation" -> recommendation.map { x => x.asInstanceOf[js.Any] },
        "attributes" -> attributes.map { x => x.asInstanceOf[js.Any] },
        "title" -> title.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Exclusion]
    }
  }

  /**
   * <p>Contains information about what is excluded from an assessment run given the current state of the assessment template.</p>
   */
  @js.native
  trait ExclusionPreview extends js.Object {
    var description: js.UndefOr[Text]
    var scopes: js.UndefOr[ScopeList]
    var recommendation: js.UndefOr[Text]
    var attributes: js.UndefOr[AttributeList]
    var title: js.UndefOr[Text]
  }

  object ExclusionPreview {
    def apply(
      description: js.UndefOr[Text] = js.undefined,
      scopes: js.UndefOr[ScopeList] = js.undefined,
      recommendation: js.UndefOr[Text] = js.undefined,
      attributes: js.UndefOr[AttributeList] = js.undefined,
      title: js.UndefOr[Text] = js.undefined): ExclusionPreview = {
      val _fields = IndexedSeq[(String, js.Any)](
        "description" -> description.map { x => x.asInstanceOf[js.Any] },
        "scopes" -> scopes.map { x => x.asInstanceOf[js.Any] },
        "recommendation" -> recommendation.map { x => x.asInstanceOf[js.Any] },
        "attributes" -> attributes.map { x => x.asInstanceOf[js.Any] },
        "title" -> title.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ExclusionPreview]
    }
  }

  /**
   * <p>Includes details about the failed items.</p>
   */
  @js.native
  trait FailedItemDetails extends js.Object {
    var failureCode: js.UndefOr[FailedItemErrorCode]
    var retryable: js.UndefOr[Bool]
  }

  object FailedItemDetails {
    def apply(
      failureCode: js.UndefOr[FailedItemErrorCode] = js.undefined,
      retryable: js.UndefOr[Bool] = js.undefined): FailedItemDetails = {
      val _fields = IndexedSeq[(String, js.Any)](
        "failureCode" -> failureCode.map { x => x.asInstanceOf[js.Any] },
        "retryable" -> retryable.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[FailedItemDetails]
    }
  }

  object FailedItemErrorCodeEnum {
    val INVALID_ARN = "INVALID_ARN"
    val DUPLICATE_ARN = "DUPLICATE_ARN"
    val ITEM_DOES_NOT_EXIST = "ITEM_DOES_NOT_EXIST"
    val ACCESS_DENIED = "ACCESS_DENIED"
    val LIMIT_EXCEEDED = "LIMIT_EXCEEDED"
    val INTERNAL_ERROR = "INTERNAL_ERROR"

    val values = IndexedSeq(INVALID_ARN, DUPLICATE_ARN, ITEM_DOES_NOT_EXIST, ACCESS_DENIED, LIMIT_EXCEEDED, INTERNAL_ERROR)
  }

  /**
   * <p>Contains information about an Amazon Inspector finding. This data type is used as the response element in the <a>DescribeFindings</a> action.</p>
   */
  @js.native
  trait Finding extends js.Object {
    var serviceAttributes: js.UndefOr[InspectorServiceAttributes]
    var arn: js.UndefOr[Arn]
    var indicatorOfCompromise: js.UndefOr[Bool]
    var updatedAt: js.UndefOr[Timestamp]
    var assetType: js.UndefOr[AssetType]
    var description: js.UndefOr[Text]
    var recommendation: js.UndefOr[Text]
    var confidence: js.UndefOr[IocConfidence]
    var service: js.UndefOr[ServiceName]
    var attributes: js.UndefOr[AttributeList]
    var numericSeverity: js.UndefOr[NumericSeverity]
    var userAttributes: js.UndefOr[UserAttributeList]
    var id: js.UndefOr[FindingId]
    var createdAt: js.UndefOr[Timestamp]
    var severity: js.UndefOr[Severity]
    var title: js.UndefOr[Text]
    var schemaVersion: js.UndefOr[NumericVersion]
    var assetAttributes: js.UndefOr[AssetAttributes]
  }

  object Finding {
    def apply(
      serviceAttributes: js.UndefOr[InspectorServiceAttributes] = js.undefined,
      arn: js.UndefOr[Arn] = js.undefined,
      indicatorOfCompromise: js.UndefOr[Bool] = js.undefined,
      updatedAt: js.UndefOr[Timestamp] = js.undefined,
      assetType: js.UndefOr[AssetType] = js.undefined,
      description: js.UndefOr[Text] = js.undefined,
      recommendation: js.UndefOr[Text] = js.undefined,
      confidence: js.UndefOr[IocConfidence] = js.undefined,
      service: js.UndefOr[ServiceName] = js.undefined,
      attributes: js.UndefOr[AttributeList] = js.undefined,
      numericSeverity: js.UndefOr[NumericSeverity] = js.undefined,
      userAttributes: js.UndefOr[UserAttributeList] = js.undefined,
      id: js.UndefOr[FindingId] = js.undefined,
      createdAt: js.UndefOr[Timestamp] = js.undefined,
      severity: js.UndefOr[Severity] = js.undefined,
      title: js.UndefOr[Text] = js.undefined,
      schemaVersion: js.UndefOr[NumericVersion] = js.undefined,
      assetAttributes: js.UndefOr[AssetAttributes] = js.undefined): Finding = {
      val _fields = IndexedSeq[(String, js.Any)](
        "serviceAttributes" -> serviceAttributes.map { x => x.asInstanceOf[js.Any] },
        "arn" -> arn.map { x => x.asInstanceOf[js.Any] },
        "indicatorOfCompromise" -> indicatorOfCompromise.map { x => x.asInstanceOf[js.Any] },
        "updatedAt" -> updatedAt.map { x => x.asInstanceOf[js.Any] },
        "assetType" -> assetType.map { x => x.asInstanceOf[js.Any] },
        "description" -> description.map { x => x.asInstanceOf[js.Any] },
        "recommendation" -> recommendation.map { x => x.asInstanceOf[js.Any] },
        "confidence" -> confidence.map { x => x.asInstanceOf[js.Any] },
        "service" -> service.map { x => x.asInstanceOf[js.Any] },
        "attributes" -> attributes.map { x => x.asInstanceOf[js.Any] },
        "numericSeverity" -> numericSeverity.map { x => x.asInstanceOf[js.Any] },
        "userAttributes" -> userAttributes.map { x => x.asInstanceOf[js.Any] },
        "id" -> id.map { x => x.asInstanceOf[js.Any] },
        "createdAt" -> createdAt.map { x => x.asInstanceOf[js.Any] },
        "severity" -> severity.map { x => x.asInstanceOf[js.Any] },
        "title" -> title.map { x => x.asInstanceOf[js.Any] },
        "schemaVersion" -> schemaVersion.map { x => x.asInstanceOf[js.Any] },
        "assetAttributes" -> assetAttributes.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Finding]
    }
  }

  /**
   * <p>This data type is used as a request parameter in the <a>ListFindings</a> action.</p>
   */
  @js.native
  trait FindingFilter extends js.Object {
    var autoScalingGroups: js.UndefOr[AutoScalingGroupList]
    var severities: js.UndefOr[SeverityList]
    var attributes: js.UndefOr[AttributeList]
    var userAttributes: js.UndefOr[AttributeList]
    var rulesPackageArns: js.UndefOr[FilterRulesPackageArnList]
    var ruleNames: js.UndefOr[RuleNameList]
    var creationTimeRange: js.UndefOr[TimestampRange]
    var agentIds: js.UndefOr[AgentIdList]
  }

  object FindingFilter {
    def apply(
      autoScalingGroups: js.UndefOr[AutoScalingGroupList] = js.undefined,
      severities: js.UndefOr[SeverityList] = js.undefined,
      attributes: js.UndefOr[AttributeList] = js.undefined,
      userAttributes: js.UndefOr[AttributeList] = js.undefined,
      rulesPackageArns: js.UndefOr[FilterRulesPackageArnList] = js.undefined,
      ruleNames: js.UndefOr[RuleNameList] = js.undefined,
      creationTimeRange: js.UndefOr[TimestampRange] = js.undefined,
      agentIds: js.UndefOr[AgentIdList] = js.undefined): FindingFilter = {
      val _fields = IndexedSeq[(String, js.Any)](
        "autoScalingGroups" -> autoScalingGroups.map { x => x.asInstanceOf[js.Any] },
        "severities" -> severities.map { x => x.asInstanceOf[js.Any] },
        "attributes" -> attributes.map { x => x.asInstanceOf[js.Any] },
        "userAttributes" -> userAttributes.map { x => x.asInstanceOf[js.Any] },
        "rulesPackageArns" -> rulesPackageArns.map { x => x.asInstanceOf[js.Any] },
        "ruleNames" -> ruleNames.map { x => x.asInstanceOf[js.Any] },
        "creationTimeRange" -> creationTimeRange.map { x => x.asInstanceOf[js.Any] },
        "agentIds" -> agentIds.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[FindingFilter]
    }
  }

  @js.native
  trait GetAssessmentReportRequest extends js.Object {
    var assessmentRunArn: js.UndefOr[Arn]
    var reportFileFormat: js.UndefOr[ReportFileFormat]
    var reportType: js.UndefOr[ReportType]
  }

  object GetAssessmentReportRequest {
    def apply(
      assessmentRunArn: js.UndefOr[Arn] = js.undefined,
      reportFileFormat: js.UndefOr[ReportFileFormat] = js.undefined,
      reportType: js.UndefOr[ReportType] = js.undefined): GetAssessmentReportRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "assessmentRunArn" -> assessmentRunArn.map { x => x.asInstanceOf[js.Any] },
        "reportFileFormat" -> reportFileFormat.map { x => x.asInstanceOf[js.Any] },
        "reportType" -> reportType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetAssessmentReportRequest]
    }
  }

  @js.native
  trait GetAssessmentReportResponse extends js.Object {
    var status: js.UndefOr[ReportStatus]
    var url: js.UndefOr[Url]
  }

  object GetAssessmentReportResponse {
    def apply(
      status: js.UndefOr[ReportStatus] = js.undefined,
      url: js.UndefOr[Url] = js.undefined): GetAssessmentReportResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "status" -> status.map { x => x.asInstanceOf[js.Any] },
        "url" -> url.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetAssessmentReportResponse]
    }
  }

  @js.native
  trait GetExclusionsPreviewRequest extends js.Object {
    var maxResults: js.UndefOr[ListMaxResults]
    var previewToken: js.UndefOr[UUID]
    var assessmentTemplateArn: js.UndefOr[Arn]
    var nextToken: js.UndefOr[PaginationToken]
    var locale: js.UndefOr[Locale]
  }

  object GetExclusionsPreviewRequest {
    def apply(
      maxResults: js.UndefOr[ListMaxResults] = js.undefined,
      previewToken: js.UndefOr[UUID] = js.undefined,
      assessmentTemplateArn: js.UndefOr[Arn] = js.undefined,
      nextToken: js.UndefOr[PaginationToken] = js.undefined,
      locale: js.UndefOr[Locale] = js.undefined): GetExclusionsPreviewRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "maxResults" -> maxResults.map { x => x.asInstanceOf[js.Any] },
        "previewToken" -> previewToken.map { x => x.asInstanceOf[js.Any] },
        "assessmentTemplateArn" -> assessmentTemplateArn.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] },
        "locale" -> locale.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetExclusionsPreviewRequest]
    }
  }

  @js.native
  trait GetExclusionsPreviewResponse extends js.Object {
    var previewStatus: js.UndefOr[PreviewStatus]
    var exclusionPreviews: js.UndefOr[ExclusionPreviewList]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object GetExclusionsPreviewResponse {
    def apply(
      previewStatus: js.UndefOr[PreviewStatus] = js.undefined,
      exclusionPreviews: js.UndefOr[ExclusionPreviewList] = js.undefined,
      nextToken: js.UndefOr[PaginationToken] = js.undefined): GetExclusionsPreviewResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "previewStatus" -> previewStatus.map { x => x.asInstanceOf[js.Any] },
        "exclusionPreviews" -> exclusionPreviews.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetExclusionsPreviewResponse]
    }
  }

  @js.native
  trait GetTelemetryMetadataRequest extends js.Object {
    var assessmentRunArn: js.UndefOr[Arn]
  }

  object GetTelemetryMetadataRequest {
    def apply(
      assessmentRunArn: js.UndefOr[Arn] = js.undefined): GetTelemetryMetadataRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "assessmentRunArn" -> assessmentRunArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetTelemetryMetadataRequest]
    }
  }

  @js.native
  trait GetTelemetryMetadataResponse extends js.Object {
    var telemetryMetadata: js.UndefOr[TelemetryMetadataList]
  }

  object GetTelemetryMetadataResponse {
    def apply(
      telemetryMetadata: js.UndefOr[TelemetryMetadataList] = js.undefined): GetTelemetryMetadataResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "telemetryMetadata" -> telemetryMetadata.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetTelemetryMetadataResponse]
    }
  }

  object InspectorEventEnum {
    val ASSESSMENT_RUN_STARTED = "ASSESSMENT_RUN_STARTED"
    val ASSESSMENT_RUN_COMPLETED = "ASSESSMENT_RUN_COMPLETED"
    val ASSESSMENT_RUN_STATE_CHANGED = "ASSESSMENT_RUN_STATE_CHANGED"
    val FINDING_REPORTED = "FINDING_REPORTED"
    val OTHER = "OTHER"

    val values = IndexedSeq(ASSESSMENT_RUN_STARTED, ASSESSMENT_RUN_COMPLETED, ASSESSMENT_RUN_STATE_CHANGED, FINDING_REPORTED, OTHER)
  }

  /**
   * <p>This data type is used in the <a>Finding</a> data type.</p>
   */
  @js.native
  trait InspectorServiceAttributes extends js.Object {
    var schemaVersion: js.UndefOr[NumericVersion]
    var assessmentRunArn: js.UndefOr[Arn]
    var rulesPackageArn: js.UndefOr[Arn]
  }

  object InspectorServiceAttributes {
    def apply(
      schemaVersion: js.UndefOr[NumericVersion] = js.undefined,
      assessmentRunArn: js.UndefOr[Arn] = js.undefined,
      rulesPackageArn: js.UndefOr[Arn] = js.undefined): InspectorServiceAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        "schemaVersion" -> schemaVersion.map { x => x.asInstanceOf[js.Any] },
        "assessmentRunArn" -> assessmentRunArn.map { x => x.asInstanceOf[js.Any] },
        "rulesPackageArn" -> rulesPackageArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InspectorServiceAttributes]
    }
  }

  @js.native
  trait ListAssessmentRunAgentsRequest extends js.Object {
    var assessmentRunArn: js.UndefOr[Arn]
    var filter: js.UndefOr[AgentFilter]
    var nextToken: js.UndefOr[PaginationToken]
    var maxResults: js.UndefOr[ListMaxResults]
  }

  object ListAssessmentRunAgentsRequest {
    def apply(
      assessmentRunArn: js.UndefOr[Arn] = js.undefined,
      filter: js.UndefOr[AgentFilter] = js.undefined,
      nextToken: js.UndefOr[PaginationToken] = js.undefined,
      maxResults: js.UndefOr[ListMaxResults] = js.undefined): ListAssessmentRunAgentsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "assessmentRunArn" -> assessmentRunArn.map { x => x.asInstanceOf[js.Any] },
        "filter" -> filter.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] },
        "maxResults" -> maxResults.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListAssessmentRunAgentsRequest]
    }
  }

  @js.native
  trait ListAssessmentRunAgentsResponse extends js.Object {
    var assessmentRunAgents: js.UndefOr[AssessmentRunAgentList]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListAssessmentRunAgentsResponse {
    def apply(
      assessmentRunAgents: js.UndefOr[AssessmentRunAgentList] = js.undefined,
      nextToken: js.UndefOr[PaginationToken] = js.undefined): ListAssessmentRunAgentsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "assessmentRunAgents" -> assessmentRunAgents.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListAssessmentRunAgentsResponse]
    }
  }

  @js.native
  trait ListAssessmentRunsRequest extends js.Object {
    var assessmentTemplateArns: js.UndefOr[ListParentArnList]
    var filter: js.UndefOr[AssessmentRunFilter]
    var nextToken: js.UndefOr[PaginationToken]
    var maxResults: js.UndefOr[ListMaxResults]
  }

  object ListAssessmentRunsRequest {
    def apply(
      assessmentTemplateArns: js.UndefOr[ListParentArnList] = js.undefined,
      filter: js.UndefOr[AssessmentRunFilter] = js.undefined,
      nextToken: js.UndefOr[PaginationToken] = js.undefined,
      maxResults: js.UndefOr[ListMaxResults] = js.undefined): ListAssessmentRunsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "assessmentTemplateArns" -> assessmentTemplateArns.map { x => x.asInstanceOf[js.Any] },
        "filter" -> filter.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] },
        "maxResults" -> maxResults.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListAssessmentRunsRequest]
    }
  }

  @js.native
  trait ListAssessmentRunsResponse extends js.Object {
    var assessmentRunArns: js.UndefOr[ListReturnedArnList]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListAssessmentRunsResponse {
    def apply(
      assessmentRunArns: js.UndefOr[ListReturnedArnList] = js.undefined,
      nextToken: js.UndefOr[PaginationToken] = js.undefined): ListAssessmentRunsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "assessmentRunArns" -> assessmentRunArns.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListAssessmentRunsResponse]
    }
  }

  @js.native
  trait ListAssessmentTargetsRequest extends js.Object {
    var filter: js.UndefOr[AssessmentTargetFilter]
    var nextToken: js.UndefOr[PaginationToken]
    var maxResults: js.UndefOr[ListMaxResults]
  }

  object ListAssessmentTargetsRequest {
    def apply(
      filter: js.UndefOr[AssessmentTargetFilter] = js.undefined,
      nextToken: js.UndefOr[PaginationToken] = js.undefined,
      maxResults: js.UndefOr[ListMaxResults] = js.undefined): ListAssessmentTargetsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "filter" -> filter.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] },
        "maxResults" -> maxResults.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListAssessmentTargetsRequest]
    }
  }

  @js.native
  trait ListAssessmentTargetsResponse extends js.Object {
    var assessmentTargetArns: js.UndefOr[ListReturnedArnList]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListAssessmentTargetsResponse {
    def apply(
      assessmentTargetArns: js.UndefOr[ListReturnedArnList] = js.undefined,
      nextToken: js.UndefOr[PaginationToken] = js.undefined): ListAssessmentTargetsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "assessmentTargetArns" -> assessmentTargetArns.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListAssessmentTargetsResponse]
    }
  }

  @js.native
  trait ListAssessmentTemplatesRequest extends js.Object {
    var assessmentTargetArns: js.UndefOr[ListParentArnList]
    var filter: js.UndefOr[AssessmentTemplateFilter]
    var nextToken: js.UndefOr[PaginationToken]
    var maxResults: js.UndefOr[ListMaxResults]
  }

  object ListAssessmentTemplatesRequest {
    def apply(
      assessmentTargetArns: js.UndefOr[ListParentArnList] = js.undefined,
      filter: js.UndefOr[AssessmentTemplateFilter] = js.undefined,
      nextToken: js.UndefOr[PaginationToken] = js.undefined,
      maxResults: js.UndefOr[ListMaxResults] = js.undefined): ListAssessmentTemplatesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "assessmentTargetArns" -> assessmentTargetArns.map { x => x.asInstanceOf[js.Any] },
        "filter" -> filter.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] },
        "maxResults" -> maxResults.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListAssessmentTemplatesRequest]
    }
  }

  @js.native
  trait ListAssessmentTemplatesResponse extends js.Object {
    var assessmentTemplateArns: js.UndefOr[ListReturnedArnList]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListAssessmentTemplatesResponse {
    def apply(
      assessmentTemplateArns: js.UndefOr[ListReturnedArnList] = js.undefined,
      nextToken: js.UndefOr[PaginationToken] = js.undefined): ListAssessmentTemplatesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "assessmentTemplateArns" -> assessmentTemplateArns.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListAssessmentTemplatesResponse]
    }
  }

  @js.native
  trait ListEventSubscriptionsRequest extends js.Object {
    var resourceArn: js.UndefOr[Arn]
    var nextToken: js.UndefOr[PaginationToken]
    var maxResults: js.UndefOr[ListEventSubscriptionsMaxResults]
  }

  object ListEventSubscriptionsRequest {
    def apply(
      resourceArn: js.UndefOr[Arn] = js.undefined,
      nextToken: js.UndefOr[PaginationToken] = js.undefined,
      maxResults: js.UndefOr[ListEventSubscriptionsMaxResults] = js.undefined): ListEventSubscriptionsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "resourceArn" -> resourceArn.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] },
        "maxResults" -> maxResults.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListEventSubscriptionsRequest]
    }
  }

  @js.native
  trait ListEventSubscriptionsResponse extends js.Object {
    var subscriptions: js.UndefOr[SubscriptionList]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListEventSubscriptionsResponse {
    def apply(
      subscriptions: js.UndefOr[SubscriptionList] = js.undefined,
      nextToken: js.UndefOr[PaginationToken] = js.undefined): ListEventSubscriptionsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "subscriptions" -> subscriptions.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListEventSubscriptionsResponse]
    }
  }

  @js.native
  trait ListExclusionsRequest extends js.Object {
    var assessmentRunArn: js.UndefOr[Arn]
    var nextToken: js.UndefOr[PaginationToken]
    var maxResults: js.UndefOr[ListMaxResults]
  }

  object ListExclusionsRequest {
    def apply(
      assessmentRunArn: js.UndefOr[Arn] = js.undefined,
      nextToken: js.UndefOr[PaginationToken] = js.undefined,
      maxResults: js.UndefOr[ListMaxResults] = js.undefined): ListExclusionsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "assessmentRunArn" -> assessmentRunArn.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] },
        "maxResults" -> maxResults.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListExclusionsRequest]
    }
  }

  @js.native
  trait ListExclusionsResponse extends js.Object {
    var exclusionArns: js.UndefOr[ListReturnedArnList]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListExclusionsResponse {
    def apply(
      exclusionArns: js.UndefOr[ListReturnedArnList] = js.undefined,
      nextToken: js.UndefOr[PaginationToken] = js.undefined): ListExclusionsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "exclusionArns" -> exclusionArns.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListExclusionsResponse]
    }
  }

  @js.native
  trait ListFindingsRequest extends js.Object {
    var assessmentRunArns: js.UndefOr[ListParentArnList]
    var filter: js.UndefOr[FindingFilter]
    var nextToken: js.UndefOr[PaginationToken]
    var maxResults: js.UndefOr[ListMaxResults]
  }

  object ListFindingsRequest {
    def apply(
      assessmentRunArns: js.UndefOr[ListParentArnList] = js.undefined,
      filter: js.UndefOr[FindingFilter] = js.undefined,
      nextToken: js.UndefOr[PaginationToken] = js.undefined,
      maxResults: js.UndefOr[ListMaxResults] = js.undefined): ListFindingsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "assessmentRunArns" -> assessmentRunArns.map { x => x.asInstanceOf[js.Any] },
        "filter" -> filter.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] },
        "maxResults" -> maxResults.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListFindingsRequest]
    }
  }

  @js.native
  trait ListFindingsResponse extends js.Object {
    var findingArns: js.UndefOr[ListReturnedArnList]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListFindingsResponse {
    def apply(
      findingArns: js.UndefOr[ListReturnedArnList] = js.undefined,
      nextToken: js.UndefOr[PaginationToken] = js.undefined): ListFindingsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "findingArns" -> findingArns.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListFindingsResponse]
    }
  }

  @js.native
  trait ListRulesPackagesRequest extends js.Object {
    var nextToken: js.UndefOr[PaginationToken]
    var maxResults: js.UndefOr[ListMaxResults]
  }

  object ListRulesPackagesRequest {
    def apply(
      nextToken: js.UndefOr[PaginationToken] = js.undefined,
      maxResults: js.UndefOr[ListMaxResults] = js.undefined): ListRulesPackagesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] },
        "maxResults" -> maxResults.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListRulesPackagesRequest]
    }
  }

  @js.native
  trait ListRulesPackagesResponse extends js.Object {
    var rulesPackageArns: js.UndefOr[ListReturnedArnList]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListRulesPackagesResponse {
    def apply(
      rulesPackageArns: js.UndefOr[ListReturnedArnList] = js.undefined,
      nextToken: js.UndefOr[PaginationToken] = js.undefined): ListRulesPackagesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "rulesPackageArns" -> rulesPackageArns.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListRulesPackagesResponse]
    }
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var resourceArn: js.UndefOr[Arn]
  }

  object ListTagsForResourceRequest {
    def apply(
      resourceArn: js.UndefOr[Arn] = js.undefined): ListTagsForResourceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "resourceArn" -> resourceArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTagsForResourceRequest]
    }
  }

  @js.native
  trait ListTagsForResourceResponse extends js.Object {
    var tags: js.UndefOr[TagList]
  }

  object ListTagsForResourceResponse {
    def apply(
      tags: js.UndefOr[TagList] = js.undefined): ListTagsForResourceResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "tags" -> tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTagsForResourceResponse]
    }
  }

  object LocaleEnum {
    val EN_US = "EN_US"

    val values = IndexedSeq(EN_US)
  }

  /**
   * <p>Contains information about the network interfaces interacting with an EC2 instance. This data type is used as one of the elements of the <a>AssetAttributes</a> data type.</p>
   */
  @js.native
  trait NetworkInterface extends js.Object {
    var publicDnsName: js.UndefOr[Text]
    var vpcId: js.UndefOr[Text]
    var publicIp: js.UndefOr[Text]
    var subnetId: js.UndefOr[Text]
    var privateIpAddresses: js.UndefOr[PrivateIpAddresses]
    var privateDnsName: js.UndefOr[Text]
    var ipv6Addresses: js.UndefOr[Ipv6Addresses]
    var securityGroups: js.UndefOr[SecurityGroups]
    var privateIpAddress: js.UndefOr[Text]
    var networkInterfaceId: js.UndefOr[Text]
  }

  object NetworkInterface {
    def apply(
      publicDnsName: js.UndefOr[Text] = js.undefined,
      vpcId: js.UndefOr[Text] = js.undefined,
      publicIp: js.UndefOr[Text] = js.undefined,
      subnetId: js.UndefOr[Text] = js.undefined,
      privateIpAddresses: js.UndefOr[PrivateIpAddresses] = js.undefined,
      privateDnsName: js.UndefOr[Text] = js.undefined,
      ipv6Addresses: js.UndefOr[Ipv6Addresses] = js.undefined,
      securityGroups: js.UndefOr[SecurityGroups] = js.undefined,
      privateIpAddress: js.UndefOr[Text] = js.undefined,
      networkInterfaceId: js.UndefOr[Text] = js.undefined): NetworkInterface = {
      val _fields = IndexedSeq[(String, js.Any)](
        "publicDnsName" -> publicDnsName.map { x => x.asInstanceOf[js.Any] },
        "vpcId" -> vpcId.map { x => x.asInstanceOf[js.Any] },
        "publicIp" -> publicIp.map { x => x.asInstanceOf[js.Any] },
        "subnetId" -> subnetId.map { x => x.asInstanceOf[js.Any] },
        "privateIpAddresses" -> privateIpAddresses.map { x => x.asInstanceOf[js.Any] },
        "privateDnsName" -> privateDnsName.map { x => x.asInstanceOf[js.Any] },
        "ipv6Addresses" -> ipv6Addresses.map { x => x.asInstanceOf[js.Any] },
        "securityGroups" -> securityGroups.map { x => x.asInstanceOf[js.Any] },
        "privateIpAddress" -> privateIpAddress.map { x => x.asInstanceOf[js.Any] },
        "networkInterfaceId" -> networkInterfaceId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[NetworkInterface]
    }
  }

  @js.native
  trait PreviewAgentsRequest extends js.Object {
    var previewAgentsArn: js.UndefOr[Arn]
    var nextToken: js.UndefOr[PaginationToken]
    var maxResults: js.UndefOr[PreviewAgentsMaxResults]
  }

  object PreviewAgentsRequest {
    def apply(
      previewAgentsArn: js.UndefOr[Arn] = js.undefined,
      nextToken: js.UndefOr[PaginationToken] = js.undefined,
      maxResults: js.UndefOr[PreviewAgentsMaxResults] = js.undefined): PreviewAgentsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "previewAgentsArn" -> previewAgentsArn.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] },
        "maxResults" -> maxResults.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PreviewAgentsRequest]
    }
  }

  @js.native
  trait PreviewAgentsResponse extends js.Object {
    var agentPreviews: js.UndefOr[AgentPreviewList]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object PreviewAgentsResponse {
    def apply(
      agentPreviews: js.UndefOr[AgentPreviewList] = js.undefined,
      nextToken: js.UndefOr[PaginationToken] = js.undefined): PreviewAgentsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "agentPreviews" -> agentPreviews.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PreviewAgentsResponse]
    }
  }

  object PreviewStatusEnum {
    val WORK_IN_PROGRESS = "WORK_IN_PROGRESS"
    val COMPLETED = "COMPLETED"

    val values = IndexedSeq(WORK_IN_PROGRESS, COMPLETED)
  }

  /**
   * <p>Contains information about a private IP address associated with a network interface. This data type is used as a response element in the <a>DescribeFindings</a> action.</p>
   */
  @js.native
  trait PrivateIp extends js.Object {
    var privateDnsName: js.UndefOr[Text]
    var privateIpAddress: js.UndefOr[Text]
  }

  object PrivateIp {
    def apply(
      privateDnsName: js.UndefOr[Text] = js.undefined,
      privateIpAddress: js.UndefOr[Text] = js.undefined): PrivateIp = {
      val _fields = IndexedSeq[(String, js.Any)](
        "privateDnsName" -> privateDnsName.map { x => x.asInstanceOf[js.Any] },
        "privateIpAddress" -> privateIpAddress.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PrivateIp]
    }
  }

  @js.native
  trait RegisterCrossAccountAccessRoleRequest extends js.Object {
    var roleArn: js.UndefOr[Arn]
  }

  object RegisterCrossAccountAccessRoleRequest {
    def apply(
      roleArn: js.UndefOr[Arn] = js.undefined): RegisterCrossAccountAccessRoleRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "roleArn" -> roleArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RegisterCrossAccountAccessRoleRequest]
    }
  }

  @js.native
  trait RemoveAttributesFromFindingsRequest extends js.Object {
    var findingArns: js.UndefOr[AddRemoveAttributesFindingArnList]
    var attributeKeys: js.UndefOr[UserAttributeKeyList]
  }

  object RemoveAttributesFromFindingsRequest {
    def apply(
      findingArns: js.UndefOr[AddRemoveAttributesFindingArnList] = js.undefined,
      attributeKeys: js.UndefOr[UserAttributeKeyList] = js.undefined): RemoveAttributesFromFindingsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "findingArns" -> findingArns.map { x => x.asInstanceOf[js.Any] },
        "attributeKeys" -> attributeKeys.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RemoveAttributesFromFindingsRequest]
    }
  }

  @js.native
  trait RemoveAttributesFromFindingsResponse extends js.Object {
    var failedItems: js.UndefOr[FailedItems]
  }

  object RemoveAttributesFromFindingsResponse {
    def apply(
      failedItems: js.UndefOr[FailedItems] = js.undefined): RemoveAttributesFromFindingsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "failedItems" -> failedItems.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RemoveAttributesFromFindingsResponse]
    }
  }

  object ReportFileFormatEnum {
    val HTML = "HTML"
    val PDF = "PDF"

    val values = IndexedSeq(HTML, PDF)
  }

  object ReportStatusEnum {
    val WORK_IN_PROGRESS = "WORK_IN_PROGRESS"
    val FAILED = "FAILED"
    val COMPLETED = "COMPLETED"

    val values = IndexedSeq(WORK_IN_PROGRESS, FAILED, COMPLETED)
  }

  object ReportTypeEnum {
    val FINDING = "FINDING"
    val FULL = "FULL"

    val values = IndexedSeq(FINDING, FULL)
  }

  /**
   * <p>Contains information about a resource group. The resource group defines a set of tags that, when queried, identify the AWS resources that make up the assessment target. This data type is used as the response element in the <a>DescribeResourceGroups</a> action.</p>
   */
  @js.native
  trait ResourceGroup extends js.Object {
    var arn: js.UndefOr[Arn]
    var tags: js.UndefOr[ResourceGroupTags]
    var createdAt: js.UndefOr[Timestamp]
  }

  object ResourceGroup {
    def apply(
      arn: js.UndefOr[Arn] = js.undefined,
      tags: js.UndefOr[ResourceGroupTags] = js.undefined,
      createdAt: js.UndefOr[Timestamp] = js.undefined): ResourceGroup = {
      val _fields = IndexedSeq[(String, js.Any)](
        "arn" -> arn.map { x => x.asInstanceOf[js.Any] },
        "tags" -> tags.map { x => x.asInstanceOf[js.Any] },
        "createdAt" -> createdAt.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResourceGroup]
    }
  }

  /**
   * <p>This data type is used as one of the elements of the <a>ResourceGroup</a> data type.</p>
   */
  @js.native
  trait ResourceGroupTag extends js.Object {
    var key: js.UndefOr[TagKey]
    var value: js.UndefOr[TagValue]
  }

  object ResourceGroupTag {
    def apply(
      key: js.UndefOr[TagKey] = js.undefined,
      value: js.UndefOr[TagValue] = js.undefined): ResourceGroupTag = {
      val _fields = IndexedSeq[(String, js.Any)](
        "key" -> key.map { x => x.asInstanceOf[js.Any] },
        "value" -> value.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResourceGroupTag]
    }
  }

  /**
   * <p>Contains information about an Amazon Inspector rules package. This data type is used as the response element in the <a>DescribeRulesPackages</a> action.</p>
   */
  @js.native
  trait RulesPackage extends js.Object {
    var arn: js.UndefOr[Arn]
    var name: js.UndefOr[RulesPackageName]
    var provider: js.UndefOr[ProviderName]
    var description: js.UndefOr[Text]
    var version: js.UndefOr[Version]
  }

  object RulesPackage {
    def apply(
      arn: js.UndefOr[Arn] = js.undefined,
      name: js.UndefOr[RulesPackageName] = js.undefined,
      provider: js.UndefOr[ProviderName] = js.undefined,
      description: js.UndefOr[Text] = js.undefined,
      version: js.UndefOr[Version] = js.undefined): RulesPackage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "arn" -> arn.map { x => x.asInstanceOf[js.Any] },
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "provider" -> provider.map { x => x.asInstanceOf[js.Any] },
        "description" -> description.map { x => x.asInstanceOf[js.Any] },
        "version" -> version.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RulesPackage]
    }
  }

  /**
   * <p>This data type contains key-value pairs that identify various Amazon resources.</p>
   */
  @js.native
  trait Scope extends js.Object {
    var key: js.UndefOr[ScopeType]
    var value: js.UndefOr[ScopeValue]
  }

  object Scope {
    def apply(
      key: js.UndefOr[ScopeType] = js.undefined,
      value: js.UndefOr[ScopeValue] = js.undefined): Scope = {
      val _fields = IndexedSeq[(String, js.Any)](
        "key" -> key.map { x => x.asInstanceOf[js.Any] },
        "value" -> value.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Scope]
    }
  }

  object ScopeTypeEnum {
    val INSTANCE_ID = "INSTANCE_ID"
    val RULES_PACKAGE_ARN = "RULES_PACKAGE_ARN"

    val values = IndexedSeq(INSTANCE_ID, RULES_PACKAGE_ARN)
  }

  /**
   * <p>Contains information about a security group associated with a network interface. This data type is used as one of the elements of the <a>NetworkInterface</a> data type.</p>
   */
  @js.native
  trait SecurityGroup extends js.Object {
    var groupName: js.UndefOr[Text]
    var groupId: js.UndefOr[Text]
  }

  object SecurityGroup {
    def apply(
      groupName: js.UndefOr[Text] = js.undefined,
      groupId: js.UndefOr[Text] = js.undefined): SecurityGroup = {
      val _fields = IndexedSeq[(String, js.Any)](
        "groupName" -> groupName.map { x => x.asInstanceOf[js.Any] },
        "groupId" -> groupId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SecurityGroup]
    }
  }

  @js.native
  trait SetTagsForResourceRequest extends js.Object {
    var resourceArn: js.UndefOr[Arn]
    var tags: js.UndefOr[TagList]
  }

  object SetTagsForResourceRequest {
    def apply(
      resourceArn: js.UndefOr[Arn] = js.undefined,
      tags: js.UndefOr[TagList] = js.undefined): SetTagsForResourceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "resourceArn" -> resourceArn.map { x => x.asInstanceOf[js.Any] },
        "tags" -> tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SetTagsForResourceRequest]
    }
  }

  object SeverityEnum {
    val Low = "Low"
    val Medium = "Medium"
    val High = "High"
    val Informational = "Informational"
    val Undefined = "Undefined"

    val values = IndexedSeq(Low, Medium, High, Informational, Undefined)
  }

  @js.native
  trait StartAssessmentRunRequest extends js.Object {
    var assessmentTemplateArn: js.UndefOr[Arn]
    var assessmentRunName: js.UndefOr[AssessmentRunName]
  }

  object StartAssessmentRunRequest {
    def apply(
      assessmentTemplateArn: js.UndefOr[Arn] = js.undefined,
      assessmentRunName: js.UndefOr[AssessmentRunName] = js.undefined): StartAssessmentRunRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "assessmentTemplateArn" -> assessmentTemplateArn.map { x => x.asInstanceOf[js.Any] },
        "assessmentRunName" -> assessmentRunName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartAssessmentRunRequest]
    }
  }

  @js.native
  trait StartAssessmentRunResponse extends js.Object {
    var assessmentRunArn: js.UndefOr[Arn]
  }

  object StartAssessmentRunResponse {
    def apply(
      assessmentRunArn: js.UndefOr[Arn] = js.undefined): StartAssessmentRunResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "assessmentRunArn" -> assessmentRunArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartAssessmentRunResponse]
    }
  }

  object StopActionEnum {
    val START_EVALUATION = "START_EVALUATION"
    val SKIP_EVALUATION = "SKIP_EVALUATION"

    val values = IndexedSeq(START_EVALUATION, SKIP_EVALUATION)
  }

  @js.native
  trait StopAssessmentRunRequest extends js.Object {
    var assessmentRunArn: js.UndefOr[Arn]
    var stopAction: js.UndefOr[StopAction]
  }

  object StopAssessmentRunRequest {
    def apply(
      assessmentRunArn: js.UndefOr[Arn] = js.undefined,
      stopAction: js.UndefOr[StopAction] = js.undefined): StopAssessmentRunRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "assessmentRunArn" -> assessmentRunArn.map { x => x.asInstanceOf[js.Any] },
        "stopAction" -> stopAction.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StopAssessmentRunRequest]
    }
  }

  @js.native
  trait SubscribeToEventRequest extends js.Object {
    var resourceArn: js.UndefOr[Arn]
    var event: js.UndefOr[InspectorEvent]
    var topicArn: js.UndefOr[Arn]
  }

  object SubscribeToEventRequest {
    def apply(
      resourceArn: js.UndefOr[Arn] = js.undefined,
      event: js.UndefOr[InspectorEvent] = js.undefined,
      topicArn: js.UndefOr[Arn] = js.undefined): SubscribeToEventRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "resourceArn" -> resourceArn.map { x => x.asInstanceOf[js.Any] },
        "event" -> event.map { x => x.asInstanceOf[js.Any] },
        "topicArn" -> topicArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SubscribeToEventRequest]
    }
  }

  /**
   * <p>This data type is used as a response element in the <a>ListEventSubscriptions</a> action.</p>
   */
  @js.native
  trait Subscription extends js.Object {
    var resourceArn: js.UndefOr[Arn]
    var topicArn: js.UndefOr[Arn]
    var eventSubscriptions: js.UndefOr[EventSubscriptionList]
  }

  object Subscription {
    def apply(
      resourceArn: js.UndefOr[Arn] = js.undefined,
      topicArn: js.UndefOr[Arn] = js.undefined,
      eventSubscriptions: js.UndefOr[EventSubscriptionList] = js.undefined): Subscription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "resourceArn" -> resourceArn.map { x => x.asInstanceOf[js.Any] },
        "topicArn" -> topicArn.map { x => x.asInstanceOf[js.Any] },
        "eventSubscriptions" -> eventSubscriptions.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Subscription]
    }
  }

  /**
   * <p>A key and value pair. This data type is used as a request parameter in the <a>SetTagsForResource</a> action and a response element in the <a>ListTagsForResource</a> action.</p>
   */
  @js.native
  trait Tag extends js.Object {
    var key: js.UndefOr[TagKey]
    var value: js.UndefOr[TagValue]
  }

  object Tag {
    def apply(
      key: js.UndefOr[TagKey] = js.undefined,
      value: js.UndefOr[TagValue] = js.undefined): Tag = {
      val _fields = IndexedSeq[(String, js.Any)](
        "key" -> key.map { x => x.asInstanceOf[js.Any] },
        "value" -> value.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Tag]
    }
  }

  /**
   * <p>The metadata about the Amazon Inspector application data metrics collected by the agent. This data type is used as the response element in the <a>GetTelemetryMetadata</a> action.</p>
   */
  @js.native
  trait TelemetryMetadata extends js.Object {
    var messageType: js.UndefOr[MessageType]
    var count: js.UndefOr[Double]
    var dataSize: js.UndefOr[Double]
  }

  object TelemetryMetadata {
    def apply(
      messageType: js.UndefOr[MessageType] = js.undefined,
      count: js.UndefOr[Double] = js.undefined,
      dataSize: js.UndefOr[Double] = js.undefined): TelemetryMetadata = {
      val _fields = IndexedSeq[(String, js.Any)](
        "messageType" -> messageType.map { x => x.asInstanceOf[js.Any] },
        "count" -> count.map { x => x.asInstanceOf[js.Any] },
        "dataSize" -> dataSize.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TelemetryMetadata]
    }
  }

  /**
   * <p>This data type is used in the <a>AssessmentRunFilter</a> data type.</p>
   */
  @js.native
  trait TimestampRange extends js.Object {
    var beginDate: js.UndefOr[Timestamp]
    var endDate: js.UndefOr[Timestamp]
  }

  object TimestampRange {
    def apply(
      beginDate: js.UndefOr[Timestamp] = js.undefined,
      endDate: js.UndefOr[Timestamp] = js.undefined): TimestampRange = {
      val _fields = IndexedSeq[(String, js.Any)](
        "beginDate" -> beginDate.map { x => x.asInstanceOf[js.Any] },
        "endDate" -> endDate.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TimestampRange]
    }
  }

  @js.native
  trait UnsubscribeFromEventRequest extends js.Object {
    var resourceArn: js.UndefOr[Arn]
    var event: js.UndefOr[InspectorEvent]
    var topicArn: js.UndefOr[Arn]
  }

  object UnsubscribeFromEventRequest {
    def apply(
      resourceArn: js.UndefOr[Arn] = js.undefined,
      event: js.UndefOr[InspectorEvent] = js.undefined,
      topicArn: js.UndefOr[Arn] = js.undefined): UnsubscribeFromEventRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "resourceArn" -> resourceArn.map { x => x.asInstanceOf[js.Any] },
        "event" -> event.map { x => x.asInstanceOf[js.Any] },
        "topicArn" -> topicArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UnsubscribeFromEventRequest]
    }
  }

  @js.native
  trait UpdateAssessmentTargetRequest extends js.Object {
    var assessmentTargetArn: js.UndefOr[Arn]
    var assessmentTargetName: js.UndefOr[AssessmentTargetName]
    var resourceGroupArn: js.UndefOr[Arn]
  }

  object UpdateAssessmentTargetRequest {
    def apply(
      assessmentTargetArn: js.UndefOr[Arn] = js.undefined,
      assessmentTargetName: js.UndefOr[AssessmentTargetName] = js.undefined,
      resourceGroupArn: js.UndefOr[Arn] = js.undefined): UpdateAssessmentTargetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "assessmentTargetArn" -> assessmentTargetArn.map { x => x.asInstanceOf[js.Any] },
        "assessmentTargetName" -> assessmentTargetName.map { x => x.asInstanceOf[js.Any] },
        "resourceGroupArn" -> resourceGroupArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateAssessmentTargetRequest]
    }
  }
}
