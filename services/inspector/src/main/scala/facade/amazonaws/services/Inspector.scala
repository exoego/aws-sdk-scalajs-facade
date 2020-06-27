package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object inspector {
  type AddRemoveAttributesFindingArnList     = js.Array[Arn]
  type AgentHealthCodeList                   = js.Array[AgentHealthCode]
  type AgentHealthList                       = js.Array[AgentHealth]
  type AgentId                               = String
  type AgentIdList                           = js.Array[AgentId]
  type AgentPreviewList                      = js.Array[AgentPreview]
  type AgentVersion                          = String
  type AmiId                                 = String
  type Arn                                   = String
  type ArnCount                              = Int
  type AssessmentRulesPackageArnList         = js.Array[Arn]
  type AssessmentRunAgentList                = js.Array[AssessmentRunAgent]
  type AssessmentRunDuration                 = Int
  type AssessmentRunFindingCounts            = js.Dictionary[FindingCount]
  type AssessmentRunList                     = js.Array[AssessmentRun]
  type AssessmentRunName                     = String
  type AssessmentRunNotificationList         = js.Array[AssessmentRunNotification]
  type AssessmentRunStateChangeList          = js.Array[AssessmentRunStateChange]
  type AssessmentRunStateList                = js.Array[AssessmentRunState]
  type AssessmentTargetList                  = js.Array[AssessmentTarget]
  type AssessmentTargetName                  = String
  type AssessmentTemplateList                = js.Array[AssessmentTemplate]
  type AssessmentTemplateName                = String
  type AssessmentTemplateRulesPackageArnList = js.Array[Arn]
  type AttributeKey                          = String
  type AttributeList                         = js.Array[Attribute]
  type AttributeValue                        = String
  type AutoScalingGroup                      = String
  type AutoScalingGroupList                  = js.Array[AutoScalingGroup]
  type BatchDescribeArnList                  = js.Array[Arn]
  type BatchDescribeExclusionsArnList        = js.Array[Arn]
  type EventSubscriptionList                 = js.Array[EventSubscription]
  type ExclusionMap                          = js.Dictionary[Exclusion]
  type ExclusionPreviewList                  = js.Array[ExclusionPreview]
  type FailedItems                           = js.Dictionary[FailedItemDetails]
  type FilterRulesPackageArnList             = js.Array[Arn]
  type FindingCount                          = Int
  type FindingId                             = String
  type FindingList                           = js.Array[Finding]
  type Hostname                              = String
  type IocConfidence                         = Int
  type Ipv4Address                           = String
  type Ipv4AddressList                       = js.Array[Ipv4Address]
  type Ipv6Addresses                         = js.Array[Text]
  type KernelVersion                         = String
  type ListEventSubscriptionsMaxResults      = Int
  type ListMaxResults                        = Int
  type ListParentArnList                     = js.Array[Arn]
  type ListReturnedArnList                   = js.Array[Arn]
  type Message                               = String
  type MessageType                           = String
  type NamePattern                           = String
  type NetworkInterfaces                     = js.Array[NetworkInterface]
  type NumericSeverity                       = Double
  type NumericVersion                        = Int
  type OperatingSystem                       = String
  type PaginationToken                       = String
  type PreviewAgentsMaxResults               = Int
  type PrivateIpAddresses                    = js.Array[PrivateIp]
  type ProviderName                          = String
  type ResourceGroupList                     = js.Array[ResourceGroup]
  type ResourceGroupTags                     = js.Array[ResourceGroupTag]
  type RuleName                              = String
  type RuleNameList                          = js.Array[RuleName]
  type RulesPackageList                      = js.Array[RulesPackage]
  type RulesPackageName                      = String
  type ScopeList                             = js.Array[Scope]
  type ScopeValue                            = String
  type SecurityGroups                        = js.Array[SecurityGroup]
  type ServiceName                           = String
  type SeverityList                          = js.Array[Severity]
  type SubscriptionList                      = js.Array[Subscription]
  type TagKey                                = String
  type TagList                               = js.Array[Tag]
  type TagValue                              = String
  type Tags                                  = js.Array[Tag]
  type TelemetryMetadataList                 = js.Array[TelemetryMetadata]
  type Text                                  = String
  type Timestamp                             = js.Date
  type UUID                                  = String
  type Url                                   = String
  type UserAttributeKeyList                  = js.Array[AttributeKey]
  type UserAttributeList                     = js.Array[Attribute]
  type Version                               = String

  implicit final class InspectorOps(private val service: Inspector) extends AnyVal {

    @inline def addAttributesToFindingsFuture(
        params: AddAttributesToFindingsRequest
    ): Future[AddAttributesToFindingsResponse] = service.addAttributesToFindings(params).promise().toFuture
    @inline def createAssessmentTargetFuture(
        params: CreateAssessmentTargetRequest
    ): Future[CreateAssessmentTargetResponse] = service.createAssessmentTarget(params).promise().toFuture
    @inline def createAssessmentTemplateFuture(
        params: CreateAssessmentTemplateRequest
    ): Future[CreateAssessmentTemplateResponse] = service.createAssessmentTemplate(params).promise().toFuture
    @inline def createExclusionsPreviewFuture(
        params: CreateExclusionsPreviewRequest
    ): Future[CreateExclusionsPreviewResponse] = service.createExclusionsPreview(params).promise().toFuture
    @inline def createResourceGroupFuture(params: CreateResourceGroupRequest): Future[CreateResourceGroupResponse] =
      service.createResourceGroup(params).promise().toFuture
    @inline def deleteAssessmentRunFuture(params: DeleteAssessmentRunRequest): Future[js.Object] =
      service.deleteAssessmentRun(params).promise().toFuture
    @inline def deleteAssessmentTargetFuture(params: DeleteAssessmentTargetRequest): Future[js.Object] =
      service.deleteAssessmentTarget(params).promise().toFuture
    @inline def deleteAssessmentTemplateFuture(params: DeleteAssessmentTemplateRequest): Future[js.Object] =
      service.deleteAssessmentTemplate(params).promise().toFuture
    @inline def describeAssessmentRunsFuture(
        params: DescribeAssessmentRunsRequest
    ): Future[DescribeAssessmentRunsResponse] = service.describeAssessmentRuns(params).promise().toFuture
    @inline def describeAssessmentTargetsFuture(
        params: DescribeAssessmentTargetsRequest
    ): Future[DescribeAssessmentTargetsResponse] = service.describeAssessmentTargets(params).promise().toFuture
    @inline def describeAssessmentTemplatesFuture(
        params: DescribeAssessmentTemplatesRequest
    ): Future[DescribeAssessmentTemplatesResponse] = service.describeAssessmentTemplates(params).promise().toFuture
    @inline def describeCrossAccountAccessRoleFuture(): Future[DescribeCrossAccountAccessRoleResponse] =
      service.describeCrossAccountAccessRole().promise().toFuture
    @inline def describeExclusionsFuture(params: DescribeExclusionsRequest): Future[DescribeExclusionsResponse] =
      service.describeExclusions(params).promise().toFuture
    @inline def describeFindingsFuture(params: DescribeFindingsRequest): Future[DescribeFindingsResponse] =
      service.describeFindings(params).promise().toFuture
    @inline def describeResourceGroupsFuture(
        params: DescribeResourceGroupsRequest
    ): Future[DescribeResourceGroupsResponse] = service.describeResourceGroups(params).promise().toFuture
    @inline def describeRulesPackagesFuture(
        params: DescribeRulesPackagesRequest
    ): Future[DescribeRulesPackagesResponse] = service.describeRulesPackages(params).promise().toFuture
    @inline def getAssessmentReportFuture(params: GetAssessmentReportRequest): Future[GetAssessmentReportResponse] =
      service.getAssessmentReport(params).promise().toFuture
    @inline def getExclusionsPreviewFuture(params: GetExclusionsPreviewRequest): Future[GetExclusionsPreviewResponse] =
      service.getExclusionsPreview(params).promise().toFuture
    @inline def getTelemetryMetadataFuture(params: GetTelemetryMetadataRequest): Future[GetTelemetryMetadataResponse] =
      service.getTelemetryMetadata(params).promise().toFuture
    @inline def listAssessmentRunAgentsFuture(
        params: ListAssessmentRunAgentsRequest
    ): Future[ListAssessmentRunAgentsResponse] = service.listAssessmentRunAgents(params).promise().toFuture
    @inline def listAssessmentRunsFuture(params: ListAssessmentRunsRequest): Future[ListAssessmentRunsResponse] =
      service.listAssessmentRuns(params).promise().toFuture
    @inline def listAssessmentTargetsFuture(
        params: ListAssessmentTargetsRequest
    ): Future[ListAssessmentTargetsResponse] = service.listAssessmentTargets(params).promise().toFuture
    @inline def listAssessmentTemplatesFuture(
        params: ListAssessmentTemplatesRequest
    ): Future[ListAssessmentTemplatesResponse] = service.listAssessmentTemplates(params).promise().toFuture
    @inline def listEventSubscriptionsFuture(
        params: ListEventSubscriptionsRequest
    ): Future[ListEventSubscriptionsResponse] = service.listEventSubscriptions(params).promise().toFuture
    @inline def listExclusionsFuture(params: ListExclusionsRequest): Future[ListExclusionsResponse] =
      service.listExclusions(params).promise().toFuture
    @inline def listFindingsFuture(params: ListFindingsRequest): Future[ListFindingsResponse] =
      service.listFindings(params).promise().toFuture
    @inline def listRulesPackagesFuture(params: ListRulesPackagesRequest): Future[ListRulesPackagesResponse] =
      service.listRulesPackages(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] =
      service.listTagsForResource(params).promise().toFuture
    @inline def previewAgentsFuture(params: PreviewAgentsRequest): Future[PreviewAgentsResponse] =
      service.previewAgents(params).promise().toFuture
    @inline def registerCrossAccountAccessRoleFuture(params: RegisterCrossAccountAccessRoleRequest): Future[js.Object] =
      service.registerCrossAccountAccessRole(params).promise().toFuture
    @inline def removeAttributesFromFindingsFuture(
        params: RemoveAttributesFromFindingsRequest
    ): Future[RemoveAttributesFromFindingsResponse] = service.removeAttributesFromFindings(params).promise().toFuture
    @inline def setTagsForResourceFuture(params: SetTagsForResourceRequest): Future[js.Object] =
      service.setTagsForResource(params).promise().toFuture
    @inline def startAssessmentRunFuture(params: StartAssessmentRunRequest): Future[StartAssessmentRunResponse] =
      service.startAssessmentRun(params).promise().toFuture
    @inline def stopAssessmentRunFuture(params: StopAssessmentRunRequest): Future[js.Object] =
      service.stopAssessmentRun(params).promise().toFuture
    @inline def subscribeToEventFuture(params: SubscribeToEventRequest): Future[js.Object] =
      service.subscribeToEvent(params).promise().toFuture
    @inline def unsubscribeFromEventFuture(params: UnsubscribeFromEventRequest): Future[js.Object] =
      service.unsubscribeFromEvent(params).promise().toFuture
    @inline def updateAssessmentTargetFuture(params: UpdateAssessmentTargetRequest): Future[js.Object] =
      service.updateAssessmentTarget(params).promise().toFuture
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
  @Factory
  trait AddAttributesToFindingsRequest extends js.Object {
    var attributes: UserAttributeList
    var findingArns: AddRemoveAttributesFindingArnList
  }

  @js.native
  @Factory
  trait AddAttributesToFindingsResponse extends js.Object {
    var failedItems: FailedItems
  }

  /**
    * Contains information about an Amazon Inspector agent. This data type is used as a request parameter in the <a>ListAssessmentRunAgents</a> action.
    */
  @js.native
  @Factory
  trait AgentFilter extends js.Object {
    var agentHealthCodes: AgentHealthCodeList
    var agentHealths: AgentHealthList
  }

  @js.native
  sealed trait AgentHealth extends js.Any
  object AgentHealth extends js.Object {
    val HEALTHY   = "HEALTHY".asInstanceOf[AgentHealth]
    val UNHEALTHY = "UNHEALTHY".asInstanceOf[AgentHealth]
    val UNKNOWN   = "UNKNOWN".asInstanceOf[AgentHealth]

    val values = js.Object.freeze(js.Array(HEALTHY, UNHEALTHY, UNKNOWN))
  }

  @js.native
  sealed trait AgentHealthCode extends js.Any
  object AgentHealthCode extends js.Object {
    val IDLE      = "IDLE".asInstanceOf[AgentHealthCode]
    val RUNNING   = "RUNNING".asInstanceOf[AgentHealthCode]
    val SHUTDOWN  = "SHUTDOWN".asInstanceOf[AgentHealthCode]
    val UNHEALTHY = "UNHEALTHY".asInstanceOf[AgentHealthCode]
    val THROTTLED = "THROTTLED".asInstanceOf[AgentHealthCode]
    val UNKNOWN   = "UNKNOWN".asInstanceOf[AgentHealthCode]

    val values = js.Object.freeze(js.Array(IDLE, RUNNING, SHUTDOWN, UNHEALTHY, THROTTLED, UNKNOWN))
  }

  /**
    * Used as a response element in the <a>PreviewAgents</a> action.
    */
  @js.native
  @Factory
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

  /**
    * A snapshot of an Amazon Inspector assessment run that contains the findings of the assessment run .
    *  Used as the response element in the <a>DescribeAssessmentRuns</a> action.
    */
  @js.native
  @Factory
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

  /**
    * Contains information about an Amazon Inspector agent. This data type is used as a response element in the <a>ListAssessmentRunAgents</a> action.
    */
  @js.native
  @Factory
  trait AssessmentRunAgent extends js.Object {
    var agentHealth: AgentHealth
    var agentHealthCode: AgentHealthCode
    var agentId: AgentId
    var assessmentRunArn: Arn
    var telemetryMetadata: TelemetryMetadataList
    var agentHealthDetails: js.UndefOr[Message]
    var autoScalingGroup: js.UndefOr[AutoScalingGroup]
  }

  /**
    * Used as the request parameter in the <a>ListAssessmentRuns</a> action.
    */
  @js.native
  @Factory
  trait AssessmentRunFilter extends js.Object {
    var completionTimeRange: js.UndefOr[TimestampRange]
    var durationRange: js.UndefOr[DurationRange]
    var namePattern: js.UndefOr[NamePattern]
    var rulesPackageArns: js.UndefOr[FilterRulesPackageArnList]
    var startTimeRange: js.UndefOr[TimestampRange]
    var stateChangeTimeRange: js.UndefOr[TimestampRange]
    var states: js.UndefOr[AssessmentRunStateList]
  }

  /**
    * Used as one of the elements of the <a>AssessmentRun</a> data type.
    */
  @js.native
  @Factory
  trait AssessmentRunNotification extends js.Object {
    var date: Timestamp
    var error: Boolean
    var event: InspectorEvent
    var message: js.UndefOr[Message]
    var snsPublishStatusCode: js.UndefOr[AssessmentRunNotificationSnsStatusCode]
    var snsTopicArn: js.UndefOr[Arn]
  }

  @js.native
  sealed trait AssessmentRunNotificationSnsStatusCode extends js.Any
  object AssessmentRunNotificationSnsStatusCode extends js.Object {
    val SUCCESS              = "SUCCESS".asInstanceOf[AssessmentRunNotificationSnsStatusCode]
    val TOPIC_DOES_NOT_EXIST = "TOPIC_DOES_NOT_EXIST".asInstanceOf[AssessmentRunNotificationSnsStatusCode]
    val ACCESS_DENIED        = "ACCESS_DENIED".asInstanceOf[AssessmentRunNotificationSnsStatusCode]
    val INTERNAL_ERROR       = "INTERNAL_ERROR".asInstanceOf[AssessmentRunNotificationSnsStatusCode]

    val values = js.Object.freeze(js.Array(SUCCESS, TOPIC_DOES_NOT_EXIST, ACCESS_DENIED, INTERNAL_ERROR))
  }

  @js.native
  sealed trait AssessmentRunState extends js.Any
  object AssessmentRunState extends js.Object {
    val CREATED                           = "CREATED".asInstanceOf[AssessmentRunState]
    val START_DATA_COLLECTION_PENDING     = "START_DATA_COLLECTION_PENDING".asInstanceOf[AssessmentRunState]
    val START_DATA_COLLECTION_IN_PROGRESS = "START_DATA_COLLECTION_IN_PROGRESS".asInstanceOf[AssessmentRunState]
    val COLLECTING_DATA                   = "COLLECTING_DATA".asInstanceOf[AssessmentRunState]
    val STOP_DATA_COLLECTION_PENDING      = "STOP_DATA_COLLECTION_PENDING".asInstanceOf[AssessmentRunState]
    val DATA_COLLECTED                    = "DATA_COLLECTED".asInstanceOf[AssessmentRunState]
    val START_EVALUATING_RULES_PENDING    = "START_EVALUATING_RULES_PENDING".asInstanceOf[AssessmentRunState]
    val EVALUATING_RULES                  = "EVALUATING_RULES".asInstanceOf[AssessmentRunState]
    val FAILED                            = "FAILED".asInstanceOf[AssessmentRunState]
    val ERROR                             = "ERROR".asInstanceOf[AssessmentRunState]
    val COMPLETED                         = "COMPLETED".asInstanceOf[AssessmentRunState]
    val COMPLETED_WITH_ERRORS             = "COMPLETED_WITH_ERRORS".asInstanceOf[AssessmentRunState]
    val CANCELED                          = "CANCELED".asInstanceOf[AssessmentRunState]

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
  @Factory
  trait AssessmentRunStateChange extends js.Object {
    var state: AssessmentRunState
    var stateChangedAt: Timestamp
  }

  /**
    * Contains information about an Amazon Inspector application. This data type is used as the response element in the <a>DescribeAssessmentTargets</a> action.
    */
  @js.native
  @Factory
  trait AssessmentTarget extends js.Object {
    var arn: Arn
    var createdAt: Timestamp
    var name: AssessmentTargetName
    var updatedAt: Timestamp
    var resourceGroupArn: js.UndefOr[Arn]
  }

  /**
    * Used as the request parameter in the <a>ListAssessmentTargets</a> action.
    */
  @js.native
  @Factory
  trait AssessmentTargetFilter extends js.Object {
    var assessmentTargetNamePattern: js.UndefOr[NamePattern]
  }

  /**
    * Contains information about an Amazon Inspector assessment template. This data type is used as the response element in the <a>DescribeAssessmentTemplates</a> action.
    */
  @js.native
  @Factory
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

  /**
    * Used as the request parameter in the <a>ListAssessmentTemplates</a> action.
    */
  @js.native
  @Factory
  trait AssessmentTemplateFilter extends js.Object {
    var durationRange: js.UndefOr[DurationRange]
    var namePattern: js.UndefOr[NamePattern]
    var rulesPackageArns: js.UndefOr[FilterRulesPackageArnList]
  }

  /**
    * A collection of attributes of the host from which the finding is generated.
    */
  @js.native
  @Factory
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

  @js.native
  sealed trait AssetType extends js.Any
  object AssetType extends js.Object {
    val `ec2-instance` = "ec2-instance".asInstanceOf[AssetType]

    val values = js.Object.freeze(js.Array(`ec2-instance`))
  }

  /**
    * This data type is used as a request parameter in the <a>AddAttributesToFindings</a> and <a>CreateAssessmentTemplate</a> actions.
    */
  @js.native
  @Factory
  trait Attribute extends js.Object {
    var key: AttributeKey
    var value: js.UndefOr[AttributeValue]
  }

  @js.native
  @Factory
  trait CreateAssessmentTargetRequest extends js.Object {
    var assessmentTargetName: AssessmentTargetName
    var resourceGroupArn: js.UndefOr[Arn]
  }

  @js.native
  @Factory
  trait CreateAssessmentTargetResponse extends js.Object {
    var assessmentTargetArn: Arn
  }

  @js.native
  @Factory
  trait CreateAssessmentTemplateRequest extends js.Object {
    var assessmentTargetArn: Arn
    var assessmentTemplateName: AssessmentTemplateName
    var durationInSeconds: AssessmentRunDuration
    var rulesPackageArns: AssessmentTemplateRulesPackageArnList
    var userAttributesForFindings: js.UndefOr[UserAttributeList]
  }

  @js.native
  @Factory
  trait CreateAssessmentTemplateResponse extends js.Object {
    var assessmentTemplateArn: Arn
  }

  @js.native
  @Factory
  trait CreateExclusionsPreviewRequest extends js.Object {
    var assessmentTemplateArn: Arn
  }

  @js.native
  @Factory
  trait CreateExclusionsPreviewResponse extends js.Object {
    var previewToken: UUID
  }

  @js.native
  @Factory
  trait CreateResourceGroupRequest extends js.Object {
    var resourceGroupTags: ResourceGroupTags
  }

  @js.native
  @Factory
  trait CreateResourceGroupResponse extends js.Object {
    var resourceGroupArn: Arn
  }

  @js.native
  @Factory
  trait DeleteAssessmentRunRequest extends js.Object {
    var assessmentRunArn: Arn
  }

  @js.native
  @Factory
  trait DeleteAssessmentTargetRequest extends js.Object {
    var assessmentTargetArn: Arn
  }

  @js.native
  @Factory
  trait DeleteAssessmentTemplateRequest extends js.Object {
    var assessmentTemplateArn: Arn
  }

  @js.native
  @Factory
  trait DescribeAssessmentRunsRequest extends js.Object {
    var assessmentRunArns: BatchDescribeArnList
  }

  @js.native
  @Factory
  trait DescribeAssessmentRunsResponse extends js.Object {
    var assessmentRuns: AssessmentRunList
    var failedItems: FailedItems
  }

  @js.native
  @Factory
  trait DescribeAssessmentTargetsRequest extends js.Object {
    var assessmentTargetArns: BatchDescribeArnList
  }

  @js.native
  @Factory
  trait DescribeAssessmentTargetsResponse extends js.Object {
    var assessmentTargets: AssessmentTargetList
    var failedItems: FailedItems
  }

  @js.native
  @Factory
  trait DescribeAssessmentTemplatesRequest extends js.Object {
    var assessmentTemplateArns: BatchDescribeArnList
  }

  @js.native
  @Factory
  trait DescribeAssessmentTemplatesResponse extends js.Object {
    var assessmentTemplates: AssessmentTemplateList
    var failedItems: FailedItems
  }

  @js.native
  @Factory
  trait DescribeCrossAccountAccessRoleResponse extends js.Object {
    var registeredAt: Timestamp
    var roleArn: Arn
    var valid: Boolean
  }

  @js.native
  @Factory
  trait DescribeExclusionsRequest extends js.Object {
    var exclusionArns: BatchDescribeExclusionsArnList
    var locale: js.UndefOr[Locale]
  }

  @js.native
  @Factory
  trait DescribeExclusionsResponse extends js.Object {
    var exclusions: ExclusionMap
    var failedItems: FailedItems
  }

  @js.native
  @Factory
  trait DescribeFindingsRequest extends js.Object {
    var findingArns: BatchDescribeArnList
    var locale: js.UndefOr[Locale]
  }

  @js.native
  @Factory
  trait DescribeFindingsResponse extends js.Object {
    var failedItems: FailedItems
    var findings: FindingList
  }

  @js.native
  @Factory
  trait DescribeResourceGroupsRequest extends js.Object {
    var resourceGroupArns: BatchDescribeArnList
  }

  @js.native
  @Factory
  trait DescribeResourceGroupsResponse extends js.Object {
    var failedItems: FailedItems
    var resourceGroups: ResourceGroupList
  }

  @js.native
  @Factory
  trait DescribeRulesPackagesRequest extends js.Object {
    var rulesPackageArns: BatchDescribeArnList
    var locale: js.UndefOr[Locale]
  }

  @js.native
  @Factory
  trait DescribeRulesPackagesResponse extends js.Object {
    var failedItems: FailedItems
    var rulesPackages: RulesPackageList
  }

  /**
    * This data type is used in the <a>AssessmentTemplateFilter</a> data type.
    */
  @js.native
  @Factory
  trait DurationRange extends js.Object {
    var maxSeconds: js.UndefOr[AssessmentRunDuration]
    var minSeconds: js.UndefOr[AssessmentRunDuration]
  }

  /**
    * This data type is used in the <a>Subscription</a> data type.
    */
  @js.native
  @Factory
  trait EventSubscription extends js.Object {
    var event: InspectorEvent
    var subscribedAt: Timestamp
  }

  /**
    * Contains information about what was excluded from an assessment run.
    */
  @js.native
  @Factory
  trait Exclusion extends js.Object {
    var arn: Arn
    var description: Text
    var recommendation: Text
    var scopes: ScopeList
    var title: Text
    var attributes: js.UndefOr[AttributeList]
  }

  /**
    * Contains information about what is excluded from an assessment run given the current state of the assessment template.
    */
  @js.native
  @Factory
  trait ExclusionPreview extends js.Object {
    var description: Text
    var recommendation: Text
    var scopes: ScopeList
    var title: Text
    var attributes: js.UndefOr[AttributeList]
  }

  /**
    * Includes details about the failed items.
    */
  @js.native
  @Factory
  trait FailedItemDetails extends js.Object {
    var failureCode: FailedItemErrorCode
    var retryable: Boolean
  }

  @js.native
  sealed trait FailedItemErrorCode extends js.Any
  object FailedItemErrorCode extends js.Object {
    val INVALID_ARN         = "INVALID_ARN".asInstanceOf[FailedItemErrorCode]
    val DUPLICATE_ARN       = "DUPLICATE_ARN".asInstanceOf[FailedItemErrorCode]
    val ITEM_DOES_NOT_EXIST = "ITEM_DOES_NOT_EXIST".asInstanceOf[FailedItemErrorCode]
    val ACCESS_DENIED       = "ACCESS_DENIED".asInstanceOf[FailedItemErrorCode]
    val LIMIT_EXCEEDED      = "LIMIT_EXCEEDED".asInstanceOf[FailedItemErrorCode]
    val INTERNAL_ERROR      = "INTERNAL_ERROR".asInstanceOf[FailedItemErrorCode]

    val values = js.Object.freeze(
      js.Array(INVALID_ARN, DUPLICATE_ARN, ITEM_DOES_NOT_EXIST, ACCESS_DENIED, LIMIT_EXCEEDED, INTERNAL_ERROR)
    )
  }

  /**
    * Contains information about an Amazon Inspector finding. This data type is used as the response element in the <a>DescribeFindings</a> action.
    */
  @js.native
  @Factory
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

  /**
    * This data type is used as a request parameter in the <a>ListFindings</a> action.
    */
  @js.native
  @Factory
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

  @js.native
  @Factory
  trait GetAssessmentReportRequest extends js.Object {
    var assessmentRunArn: Arn
    var reportFileFormat: ReportFileFormat
    var reportType: ReportType
  }

  @js.native
  @Factory
  trait GetAssessmentReportResponse extends js.Object {
    var status: ReportStatus
    var url: js.UndefOr[Url]
  }

  @js.native
  @Factory
  trait GetExclusionsPreviewRequest extends js.Object {
    var assessmentTemplateArn: Arn
    var previewToken: UUID
    var locale: js.UndefOr[Locale]
    var maxResults: js.UndefOr[ListMaxResults]
    var nextToken: js.UndefOr[PaginationToken]
  }

  @js.native
  @Factory
  trait GetExclusionsPreviewResponse extends js.Object {
    var previewStatus: PreviewStatus
    var exclusionPreviews: js.UndefOr[ExclusionPreviewList]
    var nextToken: js.UndefOr[PaginationToken]
  }

  @js.native
  @Factory
  trait GetTelemetryMetadataRequest extends js.Object {
    var assessmentRunArn: Arn
  }

  @js.native
  @Factory
  trait GetTelemetryMetadataResponse extends js.Object {
    var telemetryMetadata: TelemetryMetadataList
  }

  @js.native
  sealed trait InspectorEvent extends js.Any
  object InspectorEvent extends js.Object {
    val ASSESSMENT_RUN_STARTED       = "ASSESSMENT_RUN_STARTED".asInstanceOf[InspectorEvent]
    val ASSESSMENT_RUN_COMPLETED     = "ASSESSMENT_RUN_COMPLETED".asInstanceOf[InspectorEvent]
    val ASSESSMENT_RUN_STATE_CHANGED = "ASSESSMENT_RUN_STATE_CHANGED".asInstanceOf[InspectorEvent]
    val FINDING_REPORTED             = "FINDING_REPORTED".asInstanceOf[InspectorEvent]
    val OTHER                        = "OTHER".asInstanceOf[InspectorEvent]

    val values = js.Object.freeze(
      js.Array(ASSESSMENT_RUN_STARTED, ASSESSMENT_RUN_COMPLETED, ASSESSMENT_RUN_STATE_CHANGED, FINDING_REPORTED, OTHER)
    )
  }

  /**
    * This data type is used in the <a>Finding</a> data type.
    */
  @js.native
  @Factory
  trait InspectorServiceAttributes extends js.Object {
    var schemaVersion: NumericVersion
    var assessmentRunArn: js.UndefOr[Arn]
    var rulesPackageArn: js.UndefOr[Arn]
  }

  @js.native
  @Factory
  trait ListAssessmentRunAgentsRequest extends js.Object {
    var assessmentRunArn: Arn
    var filter: js.UndefOr[AgentFilter]
    var maxResults: js.UndefOr[ListMaxResults]
    var nextToken: js.UndefOr[PaginationToken]
  }

  @js.native
  @Factory
  trait ListAssessmentRunAgentsResponse extends js.Object {
    var assessmentRunAgents: AssessmentRunAgentList
    var nextToken: js.UndefOr[PaginationToken]
  }

  @js.native
  @Factory
  trait ListAssessmentRunsRequest extends js.Object {
    var assessmentTemplateArns: js.UndefOr[ListParentArnList]
    var filter: js.UndefOr[AssessmentRunFilter]
    var maxResults: js.UndefOr[ListMaxResults]
    var nextToken: js.UndefOr[PaginationToken]
  }

  @js.native
  @Factory
  trait ListAssessmentRunsResponse extends js.Object {
    var assessmentRunArns: ListReturnedArnList
    var nextToken: js.UndefOr[PaginationToken]
  }

  @js.native
  @Factory
  trait ListAssessmentTargetsRequest extends js.Object {
    var filter: js.UndefOr[AssessmentTargetFilter]
    var maxResults: js.UndefOr[ListMaxResults]
    var nextToken: js.UndefOr[PaginationToken]
  }

  @js.native
  @Factory
  trait ListAssessmentTargetsResponse extends js.Object {
    var assessmentTargetArns: ListReturnedArnList
    var nextToken: js.UndefOr[PaginationToken]
  }

  @js.native
  @Factory
  trait ListAssessmentTemplatesRequest extends js.Object {
    var assessmentTargetArns: js.UndefOr[ListParentArnList]
    var filter: js.UndefOr[AssessmentTemplateFilter]
    var maxResults: js.UndefOr[ListMaxResults]
    var nextToken: js.UndefOr[PaginationToken]
  }

  @js.native
  @Factory
  trait ListAssessmentTemplatesResponse extends js.Object {
    var assessmentTemplateArns: ListReturnedArnList
    var nextToken: js.UndefOr[PaginationToken]
  }

  @js.native
  @Factory
  trait ListEventSubscriptionsRequest extends js.Object {
    var maxResults: js.UndefOr[ListEventSubscriptionsMaxResults]
    var nextToken: js.UndefOr[PaginationToken]
    var resourceArn: js.UndefOr[Arn]
  }

  @js.native
  @Factory
  trait ListEventSubscriptionsResponse extends js.Object {
    var subscriptions: SubscriptionList
    var nextToken: js.UndefOr[PaginationToken]
  }

  @js.native
  @Factory
  trait ListExclusionsRequest extends js.Object {
    var assessmentRunArn: Arn
    var maxResults: js.UndefOr[ListMaxResults]
    var nextToken: js.UndefOr[PaginationToken]
  }

  @js.native
  @Factory
  trait ListExclusionsResponse extends js.Object {
    var exclusionArns: ListReturnedArnList
    var nextToken: js.UndefOr[PaginationToken]
  }

  @js.native
  @Factory
  trait ListFindingsRequest extends js.Object {
    var assessmentRunArns: js.UndefOr[ListParentArnList]
    var filter: js.UndefOr[FindingFilter]
    var maxResults: js.UndefOr[ListMaxResults]
    var nextToken: js.UndefOr[PaginationToken]
  }

  @js.native
  @Factory
  trait ListFindingsResponse extends js.Object {
    var findingArns: ListReturnedArnList
    var nextToken: js.UndefOr[PaginationToken]
  }

  @js.native
  @Factory
  trait ListRulesPackagesRequest extends js.Object {
    var maxResults: js.UndefOr[ListMaxResults]
    var nextToken: js.UndefOr[PaginationToken]
  }

  @js.native
  @Factory
  trait ListRulesPackagesResponse extends js.Object {
    var rulesPackageArns: ListReturnedArnList
    var nextToken: js.UndefOr[PaginationToken]
  }

  @js.native
  @Factory
  trait ListTagsForResourceRequest extends js.Object {
    var resourceArn: Arn
  }

  @js.native
  @Factory
  trait ListTagsForResourceResponse extends js.Object {
    var tags: TagList
  }

  @js.native
  sealed trait Locale extends js.Any
  object Locale extends js.Object {
    val EN_US = "EN_US".asInstanceOf[Locale]

    val values = js.Object.freeze(js.Array(EN_US))
  }

  /**
    * Contains information about the network interfaces interacting with an EC2 instance. This data type is used as one of the elements of the <a>AssetAttributes</a> data type.
    */
  @js.native
  @Factory
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

  @js.native
  @Factory
  trait PreviewAgentsRequest extends js.Object {
    var previewAgentsArn: Arn
    var maxResults: js.UndefOr[PreviewAgentsMaxResults]
    var nextToken: js.UndefOr[PaginationToken]
  }

  @js.native
  @Factory
  trait PreviewAgentsResponse extends js.Object {
    var agentPreviews: AgentPreviewList
    var nextToken: js.UndefOr[PaginationToken]
  }

  @js.native
  sealed trait PreviewStatus extends js.Any
  object PreviewStatus extends js.Object {
    val WORK_IN_PROGRESS = "WORK_IN_PROGRESS".asInstanceOf[PreviewStatus]
    val COMPLETED        = "COMPLETED".asInstanceOf[PreviewStatus]

    val values = js.Object.freeze(js.Array(WORK_IN_PROGRESS, COMPLETED))
  }

  /**
    * Contains information about a private IP address associated with a network interface. This data type is used as a response element in the <a>DescribeFindings</a> action.
    */
  @js.native
  @Factory
  trait PrivateIp extends js.Object {
    var privateDnsName: js.UndefOr[Text]
    var privateIpAddress: js.UndefOr[Text]
  }

  @js.native
  @Factory
  trait RegisterCrossAccountAccessRoleRequest extends js.Object {
    var roleArn: Arn
  }

  @js.native
  @Factory
  trait RemoveAttributesFromFindingsRequest extends js.Object {
    var attributeKeys: UserAttributeKeyList
    var findingArns: AddRemoveAttributesFindingArnList
  }

  @js.native
  @Factory
  trait RemoveAttributesFromFindingsResponse extends js.Object {
    var failedItems: FailedItems
  }

  @js.native
  sealed trait ReportFileFormat extends js.Any
  object ReportFileFormat extends js.Object {
    val HTML = "HTML".asInstanceOf[ReportFileFormat]
    val PDF  = "PDF".asInstanceOf[ReportFileFormat]

    val values = js.Object.freeze(js.Array(HTML, PDF))
  }

  @js.native
  sealed trait ReportStatus extends js.Any
  object ReportStatus extends js.Object {
    val WORK_IN_PROGRESS = "WORK_IN_PROGRESS".asInstanceOf[ReportStatus]
    val FAILED           = "FAILED".asInstanceOf[ReportStatus]
    val COMPLETED        = "COMPLETED".asInstanceOf[ReportStatus]

    val values = js.Object.freeze(js.Array(WORK_IN_PROGRESS, FAILED, COMPLETED))
  }

  @js.native
  sealed trait ReportType extends js.Any
  object ReportType extends js.Object {
    val FINDING = "FINDING".asInstanceOf[ReportType]
    val FULL    = "FULL".asInstanceOf[ReportType]

    val values = js.Object.freeze(js.Array(FINDING, FULL))
  }

  /**
    * Contains information about a resource group. The resource group defines a set of tags that, when queried, identify the AWS resources that make up the assessment target. This data type is used as the response element in the <a>DescribeResourceGroups</a> action.
    */
  @js.native
  @Factory
  trait ResourceGroup extends js.Object {
    var arn: Arn
    var createdAt: Timestamp
    var tags: ResourceGroupTags
  }

  /**
    * This data type is used as one of the elements of the <a>ResourceGroup</a> data type.
    */
  @js.native
  @Factory
  trait ResourceGroupTag extends js.Object {
    var key: TagKey
    var value: js.UndefOr[TagValue]
  }

  /**
    * Contains information about an Amazon Inspector rules package. This data type is used as the response element in the <a>DescribeRulesPackages</a> action.
    */
  @js.native
  @Factory
  trait RulesPackage extends js.Object {
    var arn: Arn
    var name: RulesPackageName
    var provider: ProviderName
    var version: Version
    var description: js.UndefOr[Text]
  }

  /**
    * This data type contains key-value pairs that identify various Amazon resources.
    */
  @js.native
  @Factory
  trait Scope extends js.Object {
    var key: js.UndefOr[ScopeType]
    var value: js.UndefOr[ScopeValue]
  }

  @js.native
  sealed trait ScopeType extends js.Any
  object ScopeType extends js.Object {
    val INSTANCE_ID       = "INSTANCE_ID".asInstanceOf[ScopeType]
    val RULES_PACKAGE_ARN = "RULES_PACKAGE_ARN".asInstanceOf[ScopeType]

    val values = js.Object.freeze(js.Array(INSTANCE_ID, RULES_PACKAGE_ARN))
  }

  /**
    * Contains information about a security group associated with a network interface. This data type is used as one of the elements of the <a>NetworkInterface</a> data type.
    */
  @js.native
  @Factory
  trait SecurityGroup extends js.Object {
    var groupId: js.UndefOr[Text]
    var groupName: js.UndefOr[Text]
  }

  @js.native
  @Factory
  trait SetTagsForResourceRequest extends js.Object {
    var resourceArn: Arn
    var tags: js.UndefOr[TagList]
  }

  @js.native
  sealed trait Severity extends js.Any
  object Severity extends js.Object {
    val Low           = "Low".asInstanceOf[Severity]
    val Medium        = "Medium".asInstanceOf[Severity]
    val High          = "High".asInstanceOf[Severity]
    val Informational = "Informational".asInstanceOf[Severity]
    val Undefined     = "Undefined".asInstanceOf[Severity]

    val values = js.Object.freeze(js.Array(Low, Medium, High, Informational, Undefined))
  }

  @js.native
  @Factory
  trait StartAssessmentRunRequest extends js.Object {
    var assessmentTemplateArn: Arn
    var assessmentRunName: js.UndefOr[AssessmentRunName]
  }

  @js.native
  @Factory
  trait StartAssessmentRunResponse extends js.Object {
    var assessmentRunArn: Arn
  }

  @js.native
  sealed trait StopAction extends js.Any
  object StopAction extends js.Object {
    val START_EVALUATION = "START_EVALUATION".asInstanceOf[StopAction]
    val SKIP_EVALUATION  = "SKIP_EVALUATION".asInstanceOf[StopAction]

    val values = js.Object.freeze(js.Array(START_EVALUATION, SKIP_EVALUATION))
  }

  @js.native
  @Factory
  trait StopAssessmentRunRequest extends js.Object {
    var assessmentRunArn: Arn
    var stopAction: js.UndefOr[StopAction]
  }

  @js.native
  @Factory
  trait SubscribeToEventRequest extends js.Object {
    var event: InspectorEvent
    var resourceArn: Arn
    var topicArn: Arn
  }

  /**
    * This data type is used as a response element in the <a>ListEventSubscriptions</a> action.
    */
  @js.native
  @Factory
  trait Subscription extends js.Object {
    var eventSubscriptions: EventSubscriptionList
    var resourceArn: Arn
    var topicArn: Arn
  }

  /**
    * A key and value pair. This data type is used as a request parameter in the <a>SetTagsForResource</a> action and a response element in the <a>ListTagsForResource</a> action.
    */
  @js.native
  @Factory
  trait Tag extends js.Object {
    var key: TagKey
    var value: js.UndefOr[TagValue]
  }

  /**
    * The metadata about the Amazon Inspector application data metrics collected by the agent. This data type is used as the response element in the <a>GetTelemetryMetadata</a> action.
    */
  @js.native
  @Factory
  trait TelemetryMetadata extends js.Object {
    var count: Double
    var messageType: MessageType
    var dataSize: js.UndefOr[Double]
  }

  /**
    * This data type is used in the <a>AssessmentRunFilter</a> data type.
    */
  @js.native
  @Factory
  trait TimestampRange extends js.Object {
    var beginDate: js.UndefOr[Timestamp]
    var endDate: js.UndefOr[Timestamp]
  }

  @js.native
  @Factory
  trait UnsubscribeFromEventRequest extends js.Object {
    var event: InspectorEvent
    var resourceArn: Arn
    var topicArn: Arn
  }

  @js.native
  @Factory
  trait UpdateAssessmentTargetRequest extends js.Object {
    var assessmentTargetArn: Arn
    var assessmentTargetName: AssessmentTargetName
    var resourceGroupArn: js.UndefOr[Arn]
  }
}
