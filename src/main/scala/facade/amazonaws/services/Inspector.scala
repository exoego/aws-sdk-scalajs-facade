package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import io.scalajs.nodejs
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
  type Bool                                   = Boolean
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
    def apply(attributes: UserAttributeList,
              findingArns: AddRemoveAttributesFindingArnList): AddAttributesToFindingsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "attributes"  -> attributes.asInstanceOf[js.Any],
        "findingArns" -> findingArns.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AddAttributesToFindingsRequest]
    }
  }

  @js.native
  trait AddAttributesToFindingsResponse extends js.Object {
    var failedItems: FailedItems
  }

  object AddAttributesToFindingsResponse {
    def apply(failedItems: FailedItems): AddAttributesToFindingsResponse = {
      val _fields = IndexedSeq[(String, js.Any)]("failedItems" -> failedItems.asInstanceOf[js.Any])
        .filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AddAttributesToFindingsResponse]
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
    def apply(agentHealthCodes: AgentHealthCodeList, agentHealths: AgentHealthList): AgentFilter = {
      val _fields = IndexedSeq[(String, js.Any)](
        "agentHealthCodes" -> agentHealthCodes.asInstanceOf[js.Any],
        "agentHealths"     -> agentHealths.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AgentFilter]
    }
  }

  object AgentHealthEnum {
    val HEALTHY   = "HEALTHY"
    val UNHEALTHY = "UNHEALTHY"
    val UNKNOWN   = "UNKNOWN"

    val values = IndexedSeq(HEALTHY, UNHEALTHY, UNKNOWN)
  }

  object AgentHealthCodeEnum {
    val IDLE      = "IDLE"
    val RUNNING   = "RUNNING"
    val SHUTDOWN  = "SHUTDOWN"
    val UNHEALTHY = "UNHEALTHY"
    val THROTTLED = "THROTTLED"
    val UNKNOWN   = "UNKNOWN"

    val values = IndexedSeq(IDLE, RUNNING, SHUTDOWN, UNHEALTHY, THROTTLED, UNKNOWN)
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
    def apply(agentId: AgentId,
              agentHealth: js.UndefOr[AgentHealth] = js.undefined,
              agentVersion: js.UndefOr[AgentVersion] = js.undefined,
              autoScalingGroup: js.UndefOr[AutoScalingGroup] = js.undefined,
              hostname: js.UndefOr[Hostname] = js.undefined,
              ipv4Address: js.UndefOr[Ipv4Address] = js.undefined,
              kernelVersion: js.UndefOr[KernelVersion] = js.undefined,
              operatingSystem: js.UndefOr[OperatingSystem] = js.undefined): AgentPreview = {
      val _fields = IndexedSeq[(String, js.Any)](
        "agentId" -> agentId.asInstanceOf[js.Any],
        "agentHealth" -> agentHealth.map { x =>
          x.asInstanceOf[js.Any]
        },
        "agentVersion" -> agentVersion.map { x =>
          x.asInstanceOf[js.Any]
        },
        "autoScalingGroup" -> autoScalingGroup.map { x =>
          x.asInstanceOf[js.Any]
        },
        "hostname" -> hostname.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ipv4Address" -> ipv4Address.map { x =>
          x.asInstanceOf[js.Any]
        },
        "kernelVersion" -> kernelVersion.map { x =>
          x.asInstanceOf[js.Any]
        },
        "operatingSystem" -> operatingSystem.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AgentPreview]
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
    var dataCollected: Bool
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
    def apply(arn: Arn,
              assessmentTemplateArn: Arn,
              createdAt: Timestamp,
              dataCollected: Bool,
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
              startedAt: js.UndefOr[Timestamp] = js.undefined): AssessmentRun = {
      val _fields = IndexedSeq[(String, js.Any)](
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
        "userAttributesForFindings" -> userAttributesForFindings.asInstanceOf[js.Any],
        "completedAt" -> completedAt.map { x =>
          x.asInstanceOf[js.Any]
        },
        "startedAt" -> startedAt.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssessmentRun]
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
    def apply(agentHealth: AgentHealth,
              agentHealthCode: AgentHealthCode,
              agentId: AgentId,
              assessmentRunArn: Arn,
              telemetryMetadata: TelemetryMetadataList,
              agentHealthDetails: js.UndefOr[Message] = js.undefined,
              autoScalingGroup: js.UndefOr[AutoScalingGroup] = js.undefined): AssessmentRunAgent = {
      val _fields = IndexedSeq[(String, js.Any)](
        "agentHealth"       -> agentHealth.asInstanceOf[js.Any],
        "agentHealthCode"   -> agentHealthCode.asInstanceOf[js.Any],
        "agentId"           -> agentId.asInstanceOf[js.Any],
        "assessmentRunArn"  -> assessmentRunArn.asInstanceOf[js.Any],
        "telemetryMetadata" -> telemetryMetadata.asInstanceOf[js.Any],
        "agentHealthDetails" -> agentHealthDetails.map { x =>
          x.asInstanceOf[js.Any]
        },
        "autoScalingGroup" -> autoScalingGroup.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssessmentRunAgent]
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
    def apply(completionTimeRange: js.UndefOr[TimestampRange] = js.undefined,
              durationRange: js.UndefOr[DurationRange] = js.undefined,
              namePattern: js.UndefOr[NamePattern] = js.undefined,
              rulesPackageArns: js.UndefOr[FilterRulesPackageArnList] = js.undefined,
              startTimeRange: js.UndefOr[TimestampRange] = js.undefined,
              stateChangeTimeRange: js.UndefOr[TimestampRange] = js.undefined,
              states: js.UndefOr[AssessmentRunStateList] = js.undefined): AssessmentRunFilter = {
      val _fields = IndexedSeq[(String, js.Any)](
        "completionTimeRange" -> completionTimeRange.map { x =>
          x.asInstanceOf[js.Any]
        },
        "durationRange" -> durationRange.map { x =>
          x.asInstanceOf[js.Any]
        },
        "namePattern" -> namePattern.map { x =>
          x.asInstanceOf[js.Any]
        },
        "rulesPackageArns" -> rulesPackageArns.map { x =>
          x.asInstanceOf[js.Any]
        },
        "startTimeRange" -> startTimeRange.map { x =>
          x.asInstanceOf[js.Any]
        },
        "stateChangeTimeRange" -> stateChangeTimeRange.map { x =>
          x.asInstanceOf[js.Any]
        },
        "states" -> states.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssessmentRunFilter]
    }
  }

  /**
    * Used as one of the elements of the <a>AssessmentRun</a> data type.
    */
  @js.native
  trait AssessmentRunNotification extends js.Object {
    var date: Timestamp
    var error: Bool
    var event: InspectorEvent
    var message: js.UndefOr[Message]
    var snsPublishStatusCode: js.UndefOr[AssessmentRunNotificationSnsStatusCode]
    var snsTopicArn: js.UndefOr[Arn]
  }

  object AssessmentRunNotification {
    def apply(date: Timestamp,
              error: Bool,
              event: InspectorEvent,
              message: js.UndefOr[Message] = js.undefined,
              snsPublishStatusCode: js.UndefOr[AssessmentRunNotificationSnsStatusCode] = js.undefined,
              snsTopicArn: js.UndefOr[Arn] = js.undefined): AssessmentRunNotification = {
      val _fields = IndexedSeq[(String, js.Any)](
        "date"  -> date.asInstanceOf[js.Any],
        "error" -> error.asInstanceOf[js.Any],
        "event" -> event.asInstanceOf[js.Any],
        "message" -> message.map { x =>
          x.asInstanceOf[js.Any]
        },
        "snsPublishStatusCode" -> snsPublishStatusCode.map { x =>
          x.asInstanceOf[js.Any]
        },
        "snsTopicArn" -> snsTopicArn.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssessmentRunNotification]
    }
  }

  object AssessmentRunNotificationSnsStatusCodeEnum {
    val SUCCESS              = "SUCCESS"
    val TOPIC_DOES_NOT_EXIST = "TOPIC_DOES_NOT_EXIST"
    val ACCESS_DENIED        = "ACCESS_DENIED"
    val INTERNAL_ERROR       = "INTERNAL_ERROR"

    val values = IndexedSeq(SUCCESS, TOPIC_DOES_NOT_EXIST, ACCESS_DENIED, INTERNAL_ERROR)
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

    val values = IndexedSeq(
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
    def apply(state: AssessmentRunState, stateChangedAt: Timestamp): AssessmentRunStateChange = {
      val _fields = IndexedSeq[(String, js.Any)](
        "state"          -> state.asInstanceOf[js.Any],
        "stateChangedAt" -> stateChangedAt.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssessmentRunStateChange]
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
    def apply(arn: Arn,
              createdAt: Timestamp,
              name: AssessmentTargetName,
              updatedAt: Timestamp,
              resourceGroupArn: js.UndefOr[Arn] = js.undefined): AssessmentTarget = {
      val _fields = IndexedSeq[(String, js.Any)](
        "arn"       -> arn.asInstanceOf[js.Any],
        "createdAt" -> createdAt.asInstanceOf[js.Any],
        "name"      -> name.asInstanceOf[js.Any],
        "updatedAt" -> updatedAt.asInstanceOf[js.Any],
        "resourceGroupArn" -> resourceGroupArn.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssessmentTarget]
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
    def apply(assessmentTargetNamePattern: js.UndefOr[NamePattern] = js.undefined): AssessmentTargetFilter = {
      val _fields = IndexedSeq[(String, js.Any)]("assessmentTargetNamePattern" -> assessmentTargetNamePattern.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssessmentTargetFilter]
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
    def apply(arn: Arn,
              assessmentRunCount: ArnCount,
              assessmentTargetArn: Arn,
              createdAt: Timestamp,
              durationInSeconds: AssessmentRunDuration,
              name: AssessmentTemplateName,
              rulesPackageArns: AssessmentTemplateRulesPackageArnList,
              userAttributesForFindings: UserAttributeList,
              lastAssessmentRunArn: js.UndefOr[Arn] = js.undefined): AssessmentTemplate = {
      val _fields = IndexedSeq[(String, js.Any)](
        "arn"                       -> arn.asInstanceOf[js.Any],
        "assessmentRunCount"        -> assessmentRunCount.asInstanceOf[js.Any],
        "assessmentTargetArn"       -> assessmentTargetArn.asInstanceOf[js.Any],
        "createdAt"                 -> createdAt.asInstanceOf[js.Any],
        "durationInSeconds"         -> durationInSeconds.asInstanceOf[js.Any],
        "name"                      -> name.asInstanceOf[js.Any],
        "rulesPackageArns"          -> rulesPackageArns.asInstanceOf[js.Any],
        "userAttributesForFindings" -> userAttributesForFindings.asInstanceOf[js.Any],
        "lastAssessmentRunArn" -> lastAssessmentRunArn.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssessmentTemplate]
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
    def apply(durationRange: js.UndefOr[DurationRange] = js.undefined,
              namePattern: js.UndefOr[NamePattern] = js.undefined,
              rulesPackageArns: js.UndefOr[FilterRulesPackageArnList] = js.undefined): AssessmentTemplateFilter = {
      val _fields = IndexedSeq[(String, js.Any)](
        "durationRange" -> durationRange.map { x =>
          x.asInstanceOf[js.Any]
        },
        "namePattern" -> namePattern.map { x =>
          x.asInstanceOf[js.Any]
        },
        "rulesPackageArns" -> rulesPackageArns.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssessmentTemplateFilter]
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
    def apply(schemaVersion: NumericVersion,
              agentId: js.UndefOr[AgentId] = js.undefined,
              amiId: js.UndefOr[AmiId] = js.undefined,
              autoScalingGroup: js.UndefOr[AutoScalingGroup] = js.undefined,
              hostname: js.UndefOr[Hostname] = js.undefined,
              ipv4Addresses: js.UndefOr[Ipv4AddressList] = js.undefined,
              networkInterfaces: js.UndefOr[NetworkInterfaces] = js.undefined,
              tags: js.UndefOr[Tags] = js.undefined): AssetAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        "schemaVersion" -> schemaVersion.asInstanceOf[js.Any],
        "agentId" -> agentId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "amiId" -> amiId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "autoScalingGroup" -> autoScalingGroup.map { x =>
          x.asInstanceOf[js.Any]
        },
        "hostname" -> hostname.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ipv4Addresses" -> ipv4Addresses.map { x =>
          x.asInstanceOf[js.Any]
        },
        "networkInterfaces" -> networkInterfaces.map { x =>
          x.asInstanceOf[js.Any]
        },
        "tags" -> tags.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssetAttributes]
    }
  }

  object AssetTypeEnum {
    val `ec2-instance` = "ec2-instance"

    val values = IndexedSeq(`ec2-instance`)
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
    def apply(key: AttributeKey, value: js.UndefOr[AttributeValue] = js.undefined): Attribute = {
      val _fields = IndexedSeq[(String, js.Any)]("key" -> key.asInstanceOf[js.Any], "value" -> value.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Attribute]
    }
  }

  @js.native
  trait CreateAssessmentTargetRequest extends js.Object {
    var assessmentTargetName: AssessmentTargetName
    var resourceGroupArn: js.UndefOr[Arn]
  }

  object CreateAssessmentTargetRequest {
    def apply(assessmentTargetName: AssessmentTargetName,
              resourceGroupArn: js.UndefOr[Arn] = js.undefined): CreateAssessmentTargetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "assessmentTargetName" -> assessmentTargetName.asInstanceOf[js.Any],
        "resourceGroupArn" -> resourceGroupArn.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateAssessmentTargetRequest]
    }
  }

  @js.native
  trait CreateAssessmentTargetResponse extends js.Object {
    var assessmentTargetArn: Arn
  }

  object CreateAssessmentTargetResponse {
    def apply(assessmentTargetArn: Arn): CreateAssessmentTargetResponse = {
      val _fields = IndexedSeq[(String, js.Any)]("assessmentTargetArn" -> assessmentTargetArn.asInstanceOf[js.Any])
        .filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateAssessmentTargetResponse]
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
    def apply(
        assessmentTargetArn: Arn,
        assessmentTemplateName: AssessmentTemplateName,
        durationInSeconds: AssessmentRunDuration,
        rulesPackageArns: AssessmentTemplateRulesPackageArnList,
        userAttributesForFindings: js.UndefOr[UserAttributeList] = js.undefined
    ): CreateAssessmentTemplateRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "assessmentTargetArn"    -> assessmentTargetArn.asInstanceOf[js.Any],
        "assessmentTemplateName" -> assessmentTemplateName.asInstanceOf[js.Any],
        "durationInSeconds"      -> durationInSeconds.asInstanceOf[js.Any],
        "rulesPackageArns"       -> rulesPackageArns.asInstanceOf[js.Any],
        "userAttributesForFindings" -> userAttributesForFindings.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateAssessmentTemplateRequest]
    }
  }

  @js.native
  trait CreateAssessmentTemplateResponse extends js.Object {
    var assessmentTemplateArn: Arn
  }

  object CreateAssessmentTemplateResponse {
    def apply(assessmentTemplateArn: Arn): CreateAssessmentTemplateResponse = {
      val _fields = IndexedSeq[(String, js.Any)]("assessmentTemplateArn" -> assessmentTemplateArn.asInstanceOf[js.Any])
        .filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateAssessmentTemplateResponse]
    }
  }

  @js.native
  trait CreateExclusionsPreviewRequest extends js.Object {
    var assessmentTemplateArn: Arn
  }

  object CreateExclusionsPreviewRequest {
    def apply(assessmentTemplateArn: Arn): CreateExclusionsPreviewRequest = {
      val _fields = IndexedSeq[(String, js.Any)]("assessmentTemplateArn" -> assessmentTemplateArn.asInstanceOf[js.Any])
        .filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateExclusionsPreviewRequest]
    }
  }

  @js.native
  trait CreateExclusionsPreviewResponse extends js.Object {
    var previewToken: UUID
  }

  object CreateExclusionsPreviewResponse {
    def apply(previewToken: UUID): CreateExclusionsPreviewResponse = {
      val _fields = IndexedSeq[(String, js.Any)]("previewToken" -> previewToken.asInstanceOf[js.Any])
        .filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateExclusionsPreviewResponse]
    }
  }

  @js.native
  trait CreateResourceGroupRequest extends js.Object {
    var resourceGroupTags: ResourceGroupTags
  }

  object CreateResourceGroupRequest {
    def apply(resourceGroupTags: ResourceGroupTags): CreateResourceGroupRequest = {
      val _fields = IndexedSeq[(String, js.Any)]("resourceGroupTags" -> resourceGroupTags.asInstanceOf[js.Any])
        .filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateResourceGroupRequest]
    }
  }

  @js.native
  trait CreateResourceGroupResponse extends js.Object {
    var resourceGroupArn: Arn
  }

  object CreateResourceGroupResponse {
    def apply(resourceGroupArn: Arn): CreateResourceGroupResponse = {
      val _fields = IndexedSeq[(String, js.Any)]("resourceGroupArn" -> resourceGroupArn.asInstanceOf[js.Any])
        .filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateResourceGroupResponse]
    }
  }

  @js.native
  trait DeleteAssessmentRunRequest extends js.Object {
    var assessmentRunArn: Arn
  }

  object DeleteAssessmentRunRequest {
    def apply(assessmentRunArn: Arn): DeleteAssessmentRunRequest = {
      val _fields = IndexedSeq[(String, js.Any)]("assessmentRunArn" -> assessmentRunArn.asInstanceOf[js.Any])
        .filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteAssessmentRunRequest]
    }
  }

  @js.native
  trait DeleteAssessmentTargetRequest extends js.Object {
    var assessmentTargetArn: Arn
  }

  object DeleteAssessmentTargetRequest {
    def apply(assessmentTargetArn: Arn): DeleteAssessmentTargetRequest = {
      val _fields = IndexedSeq[(String, js.Any)]("assessmentTargetArn" -> assessmentTargetArn.asInstanceOf[js.Any])
        .filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteAssessmentTargetRequest]
    }
  }

  @js.native
  trait DeleteAssessmentTemplateRequest extends js.Object {
    var assessmentTemplateArn: Arn
  }

  object DeleteAssessmentTemplateRequest {
    def apply(assessmentTemplateArn: Arn): DeleteAssessmentTemplateRequest = {
      val _fields = IndexedSeq[(String, js.Any)]("assessmentTemplateArn" -> assessmentTemplateArn.asInstanceOf[js.Any])
        .filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteAssessmentTemplateRequest]
    }
  }

  @js.native
  trait DescribeAssessmentRunsRequest extends js.Object {
    var assessmentRunArns: BatchDescribeArnList
  }

  object DescribeAssessmentRunsRequest {
    def apply(assessmentRunArns: BatchDescribeArnList): DescribeAssessmentRunsRequest = {
      val _fields = IndexedSeq[(String, js.Any)]("assessmentRunArns" -> assessmentRunArns.asInstanceOf[js.Any])
        .filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeAssessmentRunsRequest]
    }
  }

  @js.native
  trait DescribeAssessmentRunsResponse extends js.Object {
    var assessmentRuns: AssessmentRunList
    var failedItems: FailedItems
  }

  object DescribeAssessmentRunsResponse {
    def apply(assessmentRuns: AssessmentRunList, failedItems: FailedItems): DescribeAssessmentRunsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "assessmentRuns" -> assessmentRuns.asInstanceOf[js.Any],
        "failedItems"    -> failedItems.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeAssessmentRunsResponse]
    }
  }

  @js.native
  trait DescribeAssessmentTargetsRequest extends js.Object {
    var assessmentTargetArns: BatchDescribeArnList
  }

  object DescribeAssessmentTargetsRequest {
    def apply(assessmentTargetArns: BatchDescribeArnList): DescribeAssessmentTargetsRequest = {
      val _fields = IndexedSeq[(String, js.Any)]("assessmentTargetArns" -> assessmentTargetArns.asInstanceOf[js.Any])
        .filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeAssessmentTargetsRequest]
    }
  }

  @js.native
  trait DescribeAssessmentTargetsResponse extends js.Object {
    var assessmentTargets: AssessmentTargetList
    var failedItems: FailedItems
  }

  object DescribeAssessmentTargetsResponse {
    def apply(assessmentTargets: AssessmentTargetList, failedItems: FailedItems): DescribeAssessmentTargetsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "assessmentTargets" -> assessmentTargets.asInstanceOf[js.Any],
        "failedItems"       -> failedItems.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeAssessmentTargetsResponse]
    }
  }

  @js.native
  trait DescribeAssessmentTemplatesRequest extends js.Object {
    var assessmentTemplateArns: BatchDescribeArnList
  }

  object DescribeAssessmentTemplatesRequest {
    def apply(assessmentTemplateArns: BatchDescribeArnList): DescribeAssessmentTemplatesRequest = {
      val _fields =
        IndexedSeq[(String, js.Any)]("assessmentTemplateArns" -> assessmentTemplateArns.asInstanceOf[js.Any])
          .filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeAssessmentTemplatesRequest]
    }
  }

  @js.native
  trait DescribeAssessmentTemplatesResponse extends js.Object {
    var assessmentTemplates: AssessmentTemplateList
    var failedItems: FailedItems
  }

  object DescribeAssessmentTemplatesResponse {
    def apply(assessmentTemplates: AssessmentTemplateList,
              failedItems: FailedItems): DescribeAssessmentTemplatesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "assessmentTemplates" -> assessmentTemplates.asInstanceOf[js.Any],
        "failedItems"         -> failedItems.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeAssessmentTemplatesResponse]
    }
  }

  @js.native
  trait DescribeCrossAccountAccessRoleResponse extends js.Object {
    var registeredAt: Timestamp
    var roleArn: Arn
    var valid: Bool
  }

  object DescribeCrossAccountAccessRoleResponse {
    def apply(registeredAt: Timestamp, roleArn: Arn, valid: Bool): DescribeCrossAccountAccessRoleResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "registeredAt" -> registeredAt.asInstanceOf[js.Any],
        "roleArn"      -> roleArn.asInstanceOf[js.Any],
        "valid"        -> valid.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeCrossAccountAccessRoleResponse]
    }
  }

  @js.native
  trait DescribeExclusionsRequest extends js.Object {
    var exclusionArns: BatchDescribeExclusionsArnList
    var locale: js.UndefOr[Locale]
  }

  object DescribeExclusionsRequest {
    def apply(exclusionArns: BatchDescribeExclusionsArnList,
              locale: js.UndefOr[Locale] = js.undefined): DescribeExclusionsRequest = {
      val _fields =
        IndexedSeq[(String, js.Any)]("exclusionArns" -> exclusionArns.asInstanceOf[js.Any], "locale" -> locale.map {
          x =>
            x.asInstanceOf[js.Any]
        }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeExclusionsRequest]
    }
  }

  @js.native
  trait DescribeExclusionsResponse extends js.Object {
    var exclusions: ExclusionMap
    var failedItems: FailedItems
  }

  object DescribeExclusionsResponse {
    def apply(exclusions: ExclusionMap, failedItems: FailedItems): DescribeExclusionsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "exclusions"  -> exclusions.asInstanceOf[js.Any],
        "failedItems" -> failedItems.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeExclusionsResponse]
    }
  }

  @js.native
  trait DescribeFindingsRequest extends js.Object {
    var findingArns: BatchDescribeArnList
    var locale: js.UndefOr[Locale]
  }

  object DescribeFindingsRequest {
    def apply(findingArns: BatchDescribeArnList, locale: js.UndefOr[Locale] = js.undefined): DescribeFindingsRequest = {
      val _fields =
        IndexedSeq[(String, js.Any)]("findingArns" -> findingArns.asInstanceOf[js.Any], "locale" -> locale.map { x =>
          x.asInstanceOf[js.Any]
        }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeFindingsRequest]
    }
  }

  @js.native
  trait DescribeFindingsResponse extends js.Object {
    var failedItems: FailedItems
    var findings: FindingList
  }

  object DescribeFindingsResponse {
    def apply(failedItems: FailedItems, findings: FindingList): DescribeFindingsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "failedItems" -> failedItems.asInstanceOf[js.Any],
        "findings"    -> findings.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeFindingsResponse]
    }
  }

  @js.native
  trait DescribeResourceGroupsRequest extends js.Object {
    var resourceGroupArns: BatchDescribeArnList
  }

  object DescribeResourceGroupsRequest {
    def apply(resourceGroupArns: BatchDescribeArnList): DescribeResourceGroupsRequest = {
      val _fields = IndexedSeq[(String, js.Any)]("resourceGroupArns" -> resourceGroupArns.asInstanceOf[js.Any])
        .filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeResourceGroupsRequest]
    }
  }

  @js.native
  trait DescribeResourceGroupsResponse extends js.Object {
    var failedItems: FailedItems
    var resourceGroups: ResourceGroupList
  }

  object DescribeResourceGroupsResponse {
    def apply(failedItems: FailedItems, resourceGroups: ResourceGroupList): DescribeResourceGroupsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "failedItems"    -> failedItems.asInstanceOf[js.Any],
        "resourceGroups" -> resourceGroups.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeResourceGroupsResponse]
    }
  }

  @js.native
  trait DescribeRulesPackagesRequest extends js.Object {
    var rulesPackageArns: BatchDescribeArnList
    var locale: js.UndefOr[Locale]
  }

  object DescribeRulesPackagesRequest {
    def apply(rulesPackageArns: BatchDescribeArnList,
              locale: js.UndefOr[Locale] = js.undefined): DescribeRulesPackagesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "rulesPackageArns" -> rulesPackageArns.asInstanceOf[js.Any],
        "locale" -> locale.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeRulesPackagesRequest]
    }
  }

  @js.native
  trait DescribeRulesPackagesResponse extends js.Object {
    var failedItems: FailedItems
    var rulesPackages: RulesPackageList
  }

  object DescribeRulesPackagesResponse {
    def apply(failedItems: FailedItems, rulesPackages: RulesPackageList): DescribeRulesPackagesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "failedItems"   -> failedItems.asInstanceOf[js.Any],
        "rulesPackages" -> rulesPackages.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeRulesPackagesResponse]
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
    def apply(maxSeconds: js.UndefOr[AssessmentRunDuration] = js.undefined,
              minSeconds: js.UndefOr[AssessmentRunDuration] = js.undefined): DurationRange = {
      val _fields = IndexedSeq[(String, js.Any)]("maxSeconds" -> maxSeconds.map { x =>
        x.asInstanceOf[js.Any]
      }, "minSeconds" -> minSeconds.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DurationRange]
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
    def apply(event: InspectorEvent, subscribedAt: Timestamp): EventSubscription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "event"        -> event.asInstanceOf[js.Any],
        "subscribedAt" -> subscribedAt.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EventSubscription]
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
    def apply(arn: Arn,
              description: Text,
              recommendation: Text,
              scopes: ScopeList,
              title: Text,
              attributes: js.UndefOr[AttributeList] = js.undefined): Exclusion = {
      val _fields = IndexedSeq[(String, js.Any)](
        "arn"            -> arn.asInstanceOf[js.Any],
        "description"    -> description.asInstanceOf[js.Any],
        "recommendation" -> recommendation.asInstanceOf[js.Any],
        "scopes"         -> scopes.asInstanceOf[js.Any],
        "title"          -> title.asInstanceOf[js.Any],
        "attributes" -> attributes.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Exclusion]
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
    def apply(description: Text,
              recommendation: Text,
              scopes: ScopeList,
              title: Text,
              attributes: js.UndefOr[AttributeList] = js.undefined): ExclusionPreview = {
      val _fields = IndexedSeq[(String, js.Any)](
        "description"    -> description.asInstanceOf[js.Any],
        "recommendation" -> recommendation.asInstanceOf[js.Any],
        "scopes"         -> scopes.asInstanceOf[js.Any],
        "title"          -> title.asInstanceOf[js.Any],
        "attributes" -> attributes.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ExclusionPreview]
    }
  }

  /**
    * Includes details about the failed items.
    */
  @js.native
  trait FailedItemDetails extends js.Object {
    var failureCode: FailedItemErrorCode
    var retryable: Bool
  }

  object FailedItemDetails {
    def apply(failureCode: FailedItemErrorCode, retryable: Bool): FailedItemDetails = {
      val _fields = IndexedSeq[(String, js.Any)](
        "failureCode" -> failureCode.asInstanceOf[js.Any],
        "retryable"   -> retryable.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[FailedItemDetails]
    }
  }

  object FailedItemErrorCodeEnum {
    val INVALID_ARN         = "INVALID_ARN"
    val DUPLICATE_ARN       = "DUPLICATE_ARN"
    val ITEM_DOES_NOT_EXIST = "ITEM_DOES_NOT_EXIST"
    val ACCESS_DENIED       = "ACCESS_DENIED"
    val LIMIT_EXCEEDED      = "LIMIT_EXCEEDED"
    val INTERNAL_ERROR      = "INTERNAL_ERROR"

    val values =
      IndexedSeq(INVALID_ARN, DUPLICATE_ARN, ITEM_DOES_NOT_EXIST, ACCESS_DENIED, LIMIT_EXCEEDED, INTERNAL_ERROR)
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
    var indicatorOfCompromise: js.UndefOr[Bool]
    var numericSeverity: js.UndefOr[NumericSeverity]
    var recommendation: js.UndefOr[Text]
    var schemaVersion: js.UndefOr[NumericVersion]
    var service: js.UndefOr[ServiceName]
    var serviceAttributes: js.UndefOr[InspectorServiceAttributes]
    var severity: js.UndefOr[Severity]
    var title: js.UndefOr[Text]
  }

  object Finding {
    def apply(arn: Arn,
              attributes: AttributeList,
              createdAt: Timestamp,
              updatedAt: Timestamp,
              userAttributes: UserAttributeList,
              assetAttributes: js.UndefOr[AssetAttributes] = js.undefined,
              assetType: js.UndefOr[AssetType] = js.undefined,
              confidence: js.UndefOr[IocConfidence] = js.undefined,
              description: js.UndefOr[Text] = js.undefined,
              id: js.UndefOr[FindingId] = js.undefined,
              indicatorOfCompromise: js.UndefOr[Bool] = js.undefined,
              numericSeverity: js.UndefOr[NumericSeverity] = js.undefined,
              recommendation: js.UndefOr[Text] = js.undefined,
              schemaVersion: js.UndefOr[NumericVersion] = js.undefined,
              service: js.UndefOr[ServiceName] = js.undefined,
              serviceAttributes: js.UndefOr[InspectorServiceAttributes] = js.undefined,
              severity: js.UndefOr[Severity] = js.undefined,
              title: js.UndefOr[Text] = js.undefined): Finding = {
      val _fields = IndexedSeq[(String, js.Any)](
        "arn"            -> arn.asInstanceOf[js.Any],
        "attributes"     -> attributes.asInstanceOf[js.Any],
        "createdAt"      -> createdAt.asInstanceOf[js.Any],
        "updatedAt"      -> updatedAt.asInstanceOf[js.Any],
        "userAttributes" -> userAttributes.asInstanceOf[js.Any],
        "assetAttributes" -> assetAttributes.map { x =>
          x.asInstanceOf[js.Any]
        },
        "assetType" -> assetType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "confidence" -> confidence.map { x =>
          x.asInstanceOf[js.Any]
        },
        "description" -> description.map { x =>
          x.asInstanceOf[js.Any]
        },
        "id" -> id.map { x =>
          x.asInstanceOf[js.Any]
        },
        "indicatorOfCompromise" -> indicatorOfCompromise.map { x =>
          x.asInstanceOf[js.Any]
        },
        "numericSeverity" -> numericSeverity.map { x =>
          x.asInstanceOf[js.Any]
        },
        "recommendation" -> recommendation.map { x =>
          x.asInstanceOf[js.Any]
        },
        "schemaVersion" -> schemaVersion.map { x =>
          x.asInstanceOf[js.Any]
        },
        "service" -> service.map { x =>
          x.asInstanceOf[js.Any]
        },
        "serviceAttributes" -> serviceAttributes.map { x =>
          x.asInstanceOf[js.Any]
        },
        "severity" -> severity.map { x =>
          x.asInstanceOf[js.Any]
        },
        "title" -> title.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Finding]
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
    def apply(agentIds: js.UndefOr[AgentIdList] = js.undefined,
              attributes: js.UndefOr[AttributeList] = js.undefined,
              autoScalingGroups: js.UndefOr[AutoScalingGroupList] = js.undefined,
              creationTimeRange: js.UndefOr[TimestampRange] = js.undefined,
              ruleNames: js.UndefOr[RuleNameList] = js.undefined,
              rulesPackageArns: js.UndefOr[FilterRulesPackageArnList] = js.undefined,
              severities: js.UndefOr[SeverityList] = js.undefined,
              userAttributes: js.UndefOr[AttributeList] = js.undefined): FindingFilter = {
      val _fields = IndexedSeq[(String, js.Any)](
        "agentIds" -> agentIds.map { x =>
          x.asInstanceOf[js.Any]
        },
        "attributes" -> attributes.map { x =>
          x.asInstanceOf[js.Any]
        },
        "autoScalingGroups" -> autoScalingGroups.map { x =>
          x.asInstanceOf[js.Any]
        },
        "creationTimeRange" -> creationTimeRange.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ruleNames" -> ruleNames.map { x =>
          x.asInstanceOf[js.Any]
        },
        "rulesPackageArns" -> rulesPackageArns.map { x =>
          x.asInstanceOf[js.Any]
        },
        "severities" -> severities.map { x =>
          x.asInstanceOf[js.Any]
        },
        "userAttributes" -> userAttributes.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[FindingFilter]
    }
  }

  @js.native
  trait GetAssessmentReportRequest extends js.Object {
    var assessmentRunArn: Arn
    var reportFileFormat: ReportFileFormat
    var reportType: ReportType
  }

  object GetAssessmentReportRequest {
    def apply(assessmentRunArn: Arn,
              reportFileFormat: ReportFileFormat,
              reportType: ReportType): GetAssessmentReportRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "assessmentRunArn" -> assessmentRunArn.asInstanceOf[js.Any],
        "reportFileFormat" -> reportFileFormat.asInstanceOf[js.Any],
        "reportType"       -> reportType.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetAssessmentReportRequest]
    }
  }

  @js.native
  trait GetAssessmentReportResponse extends js.Object {
    var status: ReportStatus
    var url: js.UndefOr[Url]
  }

  object GetAssessmentReportResponse {
    def apply(status: ReportStatus, url: js.UndefOr[Url] = js.undefined): GetAssessmentReportResponse = {
      val _fields = IndexedSeq[(String, js.Any)]("status" -> status.asInstanceOf[js.Any], "url" -> url.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetAssessmentReportResponse]
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
    def apply(assessmentTemplateArn: Arn,
              previewToken: UUID,
              locale: js.UndefOr[Locale] = js.undefined,
              maxResults: js.UndefOr[ListMaxResults] = js.undefined,
              nextToken: js.UndefOr[PaginationToken] = js.undefined): GetExclusionsPreviewRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "assessmentTemplateArn" -> assessmentTemplateArn.asInstanceOf[js.Any],
        "previewToken"          -> previewToken.asInstanceOf[js.Any],
        "locale" -> locale.map { x =>
          x.asInstanceOf[js.Any]
        },
        "maxResults" -> maxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "nextToken" -> nextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetExclusionsPreviewRequest]
    }
  }

  @js.native
  trait GetExclusionsPreviewResponse extends js.Object {
    var previewStatus: PreviewStatus
    var exclusionPreviews: js.UndefOr[ExclusionPreviewList]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object GetExclusionsPreviewResponse {
    def apply(previewStatus: PreviewStatus,
              exclusionPreviews: js.UndefOr[ExclusionPreviewList] = js.undefined,
              nextToken: js.UndefOr[PaginationToken] = js.undefined): GetExclusionsPreviewResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "previewStatus" -> previewStatus.asInstanceOf[js.Any],
        "exclusionPreviews" -> exclusionPreviews.map { x =>
          x.asInstanceOf[js.Any]
        },
        "nextToken" -> nextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetExclusionsPreviewResponse]
    }
  }

  @js.native
  trait GetTelemetryMetadataRequest extends js.Object {
    var assessmentRunArn: Arn
  }

  object GetTelemetryMetadataRequest {
    def apply(assessmentRunArn: Arn): GetTelemetryMetadataRequest = {
      val _fields = IndexedSeq[(String, js.Any)]("assessmentRunArn" -> assessmentRunArn.asInstanceOf[js.Any])
        .filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetTelemetryMetadataRequest]
    }
  }

  @js.native
  trait GetTelemetryMetadataResponse extends js.Object {
    var telemetryMetadata: TelemetryMetadataList
  }

  object GetTelemetryMetadataResponse {
    def apply(telemetryMetadata: TelemetryMetadataList): GetTelemetryMetadataResponse = {
      val _fields = IndexedSeq[(String, js.Any)]("telemetryMetadata" -> telemetryMetadata.asInstanceOf[js.Any])
        .filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetTelemetryMetadataResponse]
    }
  }

  object InspectorEventEnum {
    val ASSESSMENT_RUN_STARTED       = "ASSESSMENT_RUN_STARTED"
    val ASSESSMENT_RUN_COMPLETED     = "ASSESSMENT_RUN_COMPLETED"
    val ASSESSMENT_RUN_STATE_CHANGED = "ASSESSMENT_RUN_STATE_CHANGED"
    val FINDING_REPORTED             = "FINDING_REPORTED"
    val OTHER                        = "OTHER"

    val values = IndexedSeq(
      ASSESSMENT_RUN_STARTED,
      ASSESSMENT_RUN_COMPLETED,
      ASSESSMENT_RUN_STATE_CHANGED,
      FINDING_REPORTED,
      OTHER
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
    def apply(schemaVersion: NumericVersion,
              assessmentRunArn: js.UndefOr[Arn] = js.undefined,
              rulesPackageArn: js.UndefOr[Arn] = js.undefined): InspectorServiceAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        "schemaVersion" -> schemaVersion.asInstanceOf[js.Any],
        "assessmentRunArn" -> assessmentRunArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "rulesPackageArn" -> rulesPackageArn.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InspectorServiceAttributes]
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
    def apply(assessmentRunArn: Arn,
              filter: js.UndefOr[AgentFilter] = js.undefined,
              maxResults: js.UndefOr[ListMaxResults] = js.undefined,
              nextToken: js.UndefOr[PaginationToken] = js.undefined): ListAssessmentRunAgentsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "assessmentRunArn" -> assessmentRunArn.asInstanceOf[js.Any],
        "filter" -> filter.map { x =>
          x.asInstanceOf[js.Any]
        },
        "maxResults" -> maxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "nextToken" -> nextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListAssessmentRunAgentsRequest]
    }
  }

  @js.native
  trait ListAssessmentRunAgentsResponse extends js.Object {
    var assessmentRunAgents: AssessmentRunAgentList
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListAssessmentRunAgentsResponse {
    def apply(assessmentRunAgents: AssessmentRunAgentList,
              nextToken: js.UndefOr[PaginationToken] = js.undefined): ListAssessmentRunAgentsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "assessmentRunAgents" -> assessmentRunAgents.asInstanceOf[js.Any],
        "nextToken" -> nextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListAssessmentRunAgentsResponse]
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
    def apply(assessmentTemplateArns: js.UndefOr[ListParentArnList] = js.undefined,
              filter: js.UndefOr[AssessmentRunFilter] = js.undefined,
              maxResults: js.UndefOr[ListMaxResults] = js.undefined,
              nextToken: js.UndefOr[PaginationToken] = js.undefined): ListAssessmentRunsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "assessmentTemplateArns" -> assessmentTemplateArns.map { x =>
          x.asInstanceOf[js.Any]
        },
        "filter" -> filter.map { x =>
          x.asInstanceOf[js.Any]
        },
        "maxResults" -> maxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "nextToken" -> nextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListAssessmentRunsRequest]
    }
  }

  @js.native
  trait ListAssessmentRunsResponse extends js.Object {
    var assessmentRunArns: ListReturnedArnList
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListAssessmentRunsResponse {
    def apply(assessmentRunArns: ListReturnedArnList,
              nextToken: js.UndefOr[PaginationToken] = js.undefined): ListAssessmentRunsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "assessmentRunArns" -> assessmentRunArns.asInstanceOf[js.Any],
        "nextToken" -> nextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListAssessmentRunsResponse]
    }
  }

  @js.native
  trait ListAssessmentTargetsRequest extends js.Object {
    var filter: js.UndefOr[AssessmentTargetFilter]
    var maxResults: js.UndefOr[ListMaxResults]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListAssessmentTargetsRequest {
    def apply(filter: js.UndefOr[AssessmentTargetFilter] = js.undefined,
              maxResults: js.UndefOr[ListMaxResults] = js.undefined,
              nextToken: js.UndefOr[PaginationToken] = js.undefined): ListAssessmentTargetsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "filter" -> filter.map { x =>
          x.asInstanceOf[js.Any]
        },
        "maxResults" -> maxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "nextToken" -> nextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListAssessmentTargetsRequest]
    }
  }

  @js.native
  trait ListAssessmentTargetsResponse extends js.Object {
    var assessmentTargetArns: ListReturnedArnList
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListAssessmentTargetsResponse {
    def apply(assessmentTargetArns: ListReturnedArnList,
              nextToken: js.UndefOr[PaginationToken] = js.undefined): ListAssessmentTargetsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "assessmentTargetArns" -> assessmentTargetArns.asInstanceOf[js.Any],
        "nextToken" -> nextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListAssessmentTargetsResponse]
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
    def apply(assessmentTargetArns: js.UndefOr[ListParentArnList] = js.undefined,
              filter: js.UndefOr[AssessmentTemplateFilter] = js.undefined,
              maxResults: js.UndefOr[ListMaxResults] = js.undefined,
              nextToken: js.UndefOr[PaginationToken] = js.undefined): ListAssessmentTemplatesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "assessmentTargetArns" -> assessmentTargetArns.map { x =>
          x.asInstanceOf[js.Any]
        },
        "filter" -> filter.map { x =>
          x.asInstanceOf[js.Any]
        },
        "maxResults" -> maxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "nextToken" -> nextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListAssessmentTemplatesRequest]
    }
  }

  @js.native
  trait ListAssessmentTemplatesResponse extends js.Object {
    var assessmentTemplateArns: ListReturnedArnList
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListAssessmentTemplatesResponse {
    def apply(assessmentTemplateArns: ListReturnedArnList,
              nextToken: js.UndefOr[PaginationToken] = js.undefined): ListAssessmentTemplatesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "assessmentTemplateArns" -> assessmentTemplateArns.asInstanceOf[js.Any],
        "nextToken" -> nextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListAssessmentTemplatesResponse]
    }
  }

  @js.native
  trait ListEventSubscriptionsRequest extends js.Object {
    var maxResults: js.UndefOr[ListEventSubscriptionsMaxResults]
    var nextToken: js.UndefOr[PaginationToken]
    var resourceArn: js.UndefOr[Arn]
  }

  object ListEventSubscriptionsRequest {
    def apply(maxResults: js.UndefOr[ListEventSubscriptionsMaxResults] = js.undefined,
              nextToken: js.UndefOr[PaginationToken] = js.undefined,
              resourceArn: js.UndefOr[Arn] = js.undefined): ListEventSubscriptionsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "maxResults" -> maxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "nextToken" -> nextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "resourceArn" -> resourceArn.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListEventSubscriptionsRequest]
    }
  }

  @js.native
  trait ListEventSubscriptionsResponse extends js.Object {
    var subscriptions: SubscriptionList
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListEventSubscriptionsResponse {
    def apply(subscriptions: SubscriptionList,
              nextToken: js.UndefOr[PaginationToken] = js.undefined): ListEventSubscriptionsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "subscriptions" -> subscriptions.asInstanceOf[js.Any],
        "nextToken" -> nextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListEventSubscriptionsResponse]
    }
  }

  @js.native
  trait ListExclusionsRequest extends js.Object {
    var assessmentRunArn: Arn
    var maxResults: js.UndefOr[ListMaxResults]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListExclusionsRequest {
    def apply(assessmentRunArn: Arn,
              maxResults: js.UndefOr[ListMaxResults] = js.undefined,
              nextToken: js.UndefOr[PaginationToken] = js.undefined): ListExclusionsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "assessmentRunArn" -> assessmentRunArn.asInstanceOf[js.Any],
        "maxResults" -> maxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "nextToken" -> nextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListExclusionsRequest]
    }
  }

  @js.native
  trait ListExclusionsResponse extends js.Object {
    var exclusionArns: ListReturnedArnList
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListExclusionsResponse {
    def apply(exclusionArns: ListReturnedArnList,
              nextToken: js.UndefOr[PaginationToken] = js.undefined): ListExclusionsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "exclusionArns" -> exclusionArns.asInstanceOf[js.Any],
        "nextToken" -> nextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListExclusionsResponse]
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
    def apply(assessmentRunArns: js.UndefOr[ListParentArnList] = js.undefined,
              filter: js.UndefOr[FindingFilter] = js.undefined,
              maxResults: js.UndefOr[ListMaxResults] = js.undefined,
              nextToken: js.UndefOr[PaginationToken] = js.undefined): ListFindingsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "assessmentRunArns" -> assessmentRunArns.map { x =>
          x.asInstanceOf[js.Any]
        },
        "filter" -> filter.map { x =>
          x.asInstanceOf[js.Any]
        },
        "maxResults" -> maxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "nextToken" -> nextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListFindingsRequest]
    }
  }

  @js.native
  trait ListFindingsResponse extends js.Object {
    var findingArns: ListReturnedArnList
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListFindingsResponse {
    def apply(findingArns: ListReturnedArnList,
              nextToken: js.UndefOr[PaginationToken] = js.undefined): ListFindingsResponse = {
      val _fields =
        IndexedSeq[(String, js.Any)]("findingArns" -> findingArns.asInstanceOf[js.Any], "nextToken" -> nextToken.map {
          x =>
            x.asInstanceOf[js.Any]
        }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListFindingsResponse]
    }
  }

  @js.native
  trait ListRulesPackagesRequest extends js.Object {
    var maxResults: js.UndefOr[ListMaxResults]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListRulesPackagesRequest {
    def apply(maxResults: js.UndefOr[ListMaxResults] = js.undefined,
              nextToken: js.UndefOr[PaginationToken] = js.undefined): ListRulesPackagesRequest = {
      val _fields = IndexedSeq[(String, js.Any)]("maxResults" -> maxResults.map { x =>
        x.asInstanceOf[js.Any]
      }, "nextToken" -> nextToken.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListRulesPackagesRequest]
    }
  }

  @js.native
  trait ListRulesPackagesResponse extends js.Object {
    var rulesPackageArns: ListReturnedArnList
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListRulesPackagesResponse {
    def apply(rulesPackageArns: ListReturnedArnList,
              nextToken: js.UndefOr[PaginationToken] = js.undefined): ListRulesPackagesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "rulesPackageArns" -> rulesPackageArns.asInstanceOf[js.Any],
        "nextToken" -> nextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListRulesPackagesResponse]
    }
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var resourceArn: Arn
  }

  object ListTagsForResourceRequest {
    def apply(resourceArn: Arn): ListTagsForResourceRequest = {
      val _fields = IndexedSeq[(String, js.Any)]("resourceArn" -> resourceArn.asInstanceOf[js.Any])
        .filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTagsForResourceRequest]
    }
  }

  @js.native
  trait ListTagsForResourceResponse extends js.Object {
    var tags: TagList
  }

  object ListTagsForResourceResponse {
    def apply(tags: TagList): ListTagsForResourceResponse = {
      val _fields =
        IndexedSeq[(String, js.Any)]("tags" -> tags.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTagsForResourceResponse]
    }
  }

  object LocaleEnum {
    val EN_US = "EN_US"

    val values = IndexedSeq(EN_US)
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
    def apply(ipv6Addresses: js.UndefOr[Ipv6Addresses] = js.undefined,
              networkInterfaceId: js.UndefOr[Text] = js.undefined,
              privateDnsName: js.UndefOr[Text] = js.undefined,
              privateIpAddress: js.UndefOr[Text] = js.undefined,
              privateIpAddresses: js.UndefOr[PrivateIpAddresses] = js.undefined,
              publicDnsName: js.UndefOr[Text] = js.undefined,
              publicIp: js.UndefOr[Text] = js.undefined,
              securityGroups: js.UndefOr[SecurityGroups] = js.undefined,
              subnetId: js.UndefOr[Text] = js.undefined,
              vpcId: js.UndefOr[Text] = js.undefined): NetworkInterface = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ipv6Addresses" -> ipv6Addresses.map { x =>
          x.asInstanceOf[js.Any]
        },
        "networkInterfaceId" -> networkInterfaceId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "privateDnsName" -> privateDnsName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "privateIpAddress" -> privateIpAddress.map { x =>
          x.asInstanceOf[js.Any]
        },
        "privateIpAddresses" -> privateIpAddresses.map { x =>
          x.asInstanceOf[js.Any]
        },
        "publicDnsName" -> publicDnsName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "publicIp" -> publicIp.map { x =>
          x.asInstanceOf[js.Any]
        },
        "securityGroups" -> securityGroups.map { x =>
          x.asInstanceOf[js.Any]
        },
        "subnetId" -> subnetId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "vpcId" -> vpcId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[NetworkInterface]
    }
  }

  @js.native
  trait PreviewAgentsRequest extends js.Object {
    var previewAgentsArn: Arn
    var maxResults: js.UndefOr[PreviewAgentsMaxResults]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object PreviewAgentsRequest {
    def apply(previewAgentsArn: Arn,
              maxResults: js.UndefOr[PreviewAgentsMaxResults] = js.undefined,
              nextToken: js.UndefOr[PaginationToken] = js.undefined): PreviewAgentsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "previewAgentsArn" -> previewAgentsArn.asInstanceOf[js.Any],
        "maxResults" -> maxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "nextToken" -> nextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PreviewAgentsRequest]
    }
  }

  @js.native
  trait PreviewAgentsResponse extends js.Object {
    var agentPreviews: AgentPreviewList
    var nextToken: js.UndefOr[PaginationToken]
  }

  object PreviewAgentsResponse {
    def apply(agentPreviews: AgentPreviewList,
              nextToken: js.UndefOr[PaginationToken] = js.undefined): PreviewAgentsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "agentPreviews" -> agentPreviews.asInstanceOf[js.Any],
        "nextToken" -> nextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PreviewAgentsResponse]
    }
  }

  object PreviewStatusEnum {
    val WORK_IN_PROGRESS = "WORK_IN_PROGRESS"
    val COMPLETED        = "COMPLETED"

    val values = IndexedSeq(WORK_IN_PROGRESS, COMPLETED)
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
    def apply(privateDnsName: js.UndefOr[Text] = js.undefined,
              privateIpAddress: js.UndefOr[Text] = js.undefined): PrivateIp = {
      val _fields = IndexedSeq[(String, js.Any)]("privateDnsName" -> privateDnsName.map { x =>
        x.asInstanceOf[js.Any]
      }, "privateIpAddress" -> privateIpAddress.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PrivateIp]
    }
  }

  @js.native
  trait RegisterCrossAccountAccessRoleRequest extends js.Object {
    var roleArn: Arn
  }

  object RegisterCrossAccountAccessRoleRequest {
    def apply(roleArn: Arn): RegisterCrossAccountAccessRoleRequest = {
      val _fields =
        IndexedSeq[(String, js.Any)]("roleArn" -> roleArn.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RegisterCrossAccountAccessRoleRequest]
    }
  }

  @js.native
  trait RemoveAttributesFromFindingsRequest extends js.Object {
    var attributeKeys: UserAttributeKeyList
    var findingArns: AddRemoveAttributesFindingArnList
  }

  object RemoveAttributesFromFindingsRequest {
    def apply(attributeKeys: UserAttributeKeyList,
              findingArns: AddRemoveAttributesFindingArnList): RemoveAttributesFromFindingsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "attributeKeys" -> attributeKeys.asInstanceOf[js.Any],
        "findingArns"   -> findingArns.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RemoveAttributesFromFindingsRequest]
    }
  }

  @js.native
  trait RemoveAttributesFromFindingsResponse extends js.Object {
    var failedItems: FailedItems
  }

  object RemoveAttributesFromFindingsResponse {
    def apply(failedItems: FailedItems): RemoveAttributesFromFindingsResponse = {
      val _fields = IndexedSeq[(String, js.Any)]("failedItems" -> failedItems.asInstanceOf[js.Any])
        .filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RemoveAttributesFromFindingsResponse]
    }
  }

  object ReportFileFormatEnum {
    val HTML = "HTML"
    val PDF  = "PDF"

    val values = IndexedSeq(HTML, PDF)
  }

  object ReportStatusEnum {
    val WORK_IN_PROGRESS = "WORK_IN_PROGRESS"
    val FAILED           = "FAILED"
    val COMPLETED        = "COMPLETED"

    val values = IndexedSeq(WORK_IN_PROGRESS, FAILED, COMPLETED)
  }

  object ReportTypeEnum {
    val FINDING = "FINDING"
    val FULL    = "FULL"

    val values = IndexedSeq(FINDING, FULL)
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
    def apply(arn: Arn, createdAt: Timestamp, tags: ResourceGroupTags): ResourceGroup = {
      val _fields = IndexedSeq[(String, js.Any)](
        "arn"       -> arn.asInstanceOf[js.Any],
        "createdAt" -> createdAt.asInstanceOf[js.Any],
        "tags"      -> tags.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResourceGroup]
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
    def apply(key: TagKey, value: js.UndefOr[TagValue] = js.undefined): ResourceGroupTag = {
      val _fields = IndexedSeq[(String, js.Any)]("key" -> key.asInstanceOf[js.Any], "value" -> value.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResourceGroupTag]
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
    def apply(arn: Arn,
              name: RulesPackageName,
              provider: ProviderName,
              version: Version,
              description: js.UndefOr[Text] = js.undefined): RulesPackage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "arn"      -> arn.asInstanceOf[js.Any],
        "name"     -> name.asInstanceOf[js.Any],
        "provider" -> provider.asInstanceOf[js.Any],
        "version"  -> version.asInstanceOf[js.Any],
        "description" -> description.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RulesPackage]
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
    def apply(key: js.UndefOr[ScopeType] = js.undefined, value: js.UndefOr[ScopeValue] = js.undefined): Scope = {
      val _fields = IndexedSeq[(String, js.Any)]("key" -> key.map { x =>
        x.asInstanceOf[js.Any]
      }, "value" -> value.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Scope]
    }
  }

  object ScopeTypeEnum {
    val INSTANCE_ID       = "INSTANCE_ID"
    val RULES_PACKAGE_ARN = "RULES_PACKAGE_ARN"

    val values = IndexedSeq(INSTANCE_ID, RULES_PACKAGE_ARN)
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
    def apply(groupId: js.UndefOr[Text] = js.undefined, groupName: js.UndefOr[Text] = js.undefined): SecurityGroup = {
      val _fields = IndexedSeq[(String, js.Any)]("groupId" -> groupId.map { x =>
        x.asInstanceOf[js.Any]
      }, "groupName" -> groupName.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SecurityGroup]
    }
  }

  @js.native
  trait SetTagsForResourceRequest extends js.Object {
    var resourceArn: Arn
    var tags: js.UndefOr[TagList]
  }

  object SetTagsForResourceRequest {
    def apply(resourceArn: Arn, tags: js.UndefOr[TagList] = js.undefined): SetTagsForResourceRequest = {
      val _fields = IndexedSeq[(String, js.Any)]("resourceArn" -> resourceArn.asInstanceOf[js.Any], "tags" -> tags.map {
        x =>
          x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SetTagsForResourceRequest]
    }
  }

  object SeverityEnum {
    val Low           = "Low"
    val Medium        = "Medium"
    val High          = "High"
    val Informational = "Informational"
    val Undefined     = "Undefined"

    val values = IndexedSeq(Low, Medium, High, Informational, Undefined)
  }

  @js.native
  trait StartAssessmentRunRequest extends js.Object {
    var assessmentTemplateArn: Arn
    var assessmentRunName: js.UndefOr[AssessmentRunName]
  }

  object StartAssessmentRunRequest {
    def apply(assessmentTemplateArn: Arn,
              assessmentRunName: js.UndefOr[AssessmentRunName] = js.undefined): StartAssessmentRunRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "assessmentTemplateArn" -> assessmentTemplateArn.asInstanceOf[js.Any],
        "assessmentRunName" -> assessmentRunName.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartAssessmentRunRequest]
    }
  }

  @js.native
  trait StartAssessmentRunResponse extends js.Object {
    var assessmentRunArn: Arn
  }

  object StartAssessmentRunResponse {
    def apply(assessmentRunArn: Arn): StartAssessmentRunResponse = {
      val _fields = IndexedSeq[(String, js.Any)]("assessmentRunArn" -> assessmentRunArn.asInstanceOf[js.Any])
        .filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartAssessmentRunResponse]
    }
  }

  object StopActionEnum {
    val START_EVALUATION = "START_EVALUATION"
    val SKIP_EVALUATION  = "SKIP_EVALUATION"

    val values = IndexedSeq(START_EVALUATION, SKIP_EVALUATION)
  }

  @js.native
  trait StopAssessmentRunRequest extends js.Object {
    var assessmentRunArn: Arn
    var stopAction: js.UndefOr[StopAction]
  }

  object StopAssessmentRunRequest {
    def apply(assessmentRunArn: Arn, stopAction: js.UndefOr[StopAction] = js.undefined): StopAssessmentRunRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "assessmentRunArn" -> assessmentRunArn.asInstanceOf[js.Any],
        "stopAction" -> stopAction.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StopAssessmentRunRequest]
    }
  }

  @js.native
  trait SubscribeToEventRequest extends js.Object {
    var event: InspectorEvent
    var resourceArn: Arn
    var topicArn: Arn
  }

  object SubscribeToEventRequest {
    def apply(event: InspectorEvent, resourceArn: Arn, topicArn: Arn): SubscribeToEventRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "event"       -> event.asInstanceOf[js.Any],
        "resourceArn" -> resourceArn.asInstanceOf[js.Any],
        "topicArn"    -> topicArn.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SubscribeToEventRequest]
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
    def apply(eventSubscriptions: EventSubscriptionList, resourceArn: Arn, topicArn: Arn): Subscription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "eventSubscriptions" -> eventSubscriptions.asInstanceOf[js.Any],
        "resourceArn"        -> resourceArn.asInstanceOf[js.Any],
        "topicArn"           -> topicArn.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Subscription]
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
    def apply(key: TagKey, value: js.UndefOr[TagValue] = js.undefined): Tag = {
      val _fields = IndexedSeq[(String, js.Any)]("key" -> key.asInstanceOf[js.Any], "value" -> value.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Tag]
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
    def apply(count: Double,
              messageType: MessageType,
              dataSize: js.UndefOr[Double] = js.undefined): TelemetryMetadata = {
      val _fields = IndexedSeq[(String, js.Any)](
        "count"       -> count.asInstanceOf[js.Any],
        "messageType" -> messageType.asInstanceOf[js.Any],
        "dataSize" -> dataSize.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TelemetryMetadata]
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
    def apply(beginDate: js.UndefOr[Timestamp] = js.undefined,
              endDate: js.UndefOr[Timestamp] = js.undefined): TimestampRange = {
      val _fields = IndexedSeq[(String, js.Any)]("beginDate" -> beginDate.map { x =>
        x.asInstanceOf[js.Any]
      }, "endDate" -> endDate.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TimestampRange]
    }
  }

  @js.native
  trait UnsubscribeFromEventRequest extends js.Object {
    var event: InspectorEvent
    var resourceArn: Arn
    var topicArn: Arn
  }

  object UnsubscribeFromEventRequest {
    def apply(event: InspectorEvent, resourceArn: Arn, topicArn: Arn): UnsubscribeFromEventRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "event"       -> event.asInstanceOf[js.Any],
        "resourceArn" -> resourceArn.asInstanceOf[js.Any],
        "topicArn"    -> topicArn.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UnsubscribeFromEventRequest]
    }
  }

  @js.native
  trait UpdateAssessmentTargetRequest extends js.Object {
    var assessmentTargetArn: Arn
    var assessmentTargetName: AssessmentTargetName
    var resourceGroupArn: js.UndefOr[Arn]
  }

  object UpdateAssessmentTargetRequest {
    def apply(assessmentTargetArn: Arn,
              assessmentTargetName: AssessmentTargetName,
              resourceGroupArn: js.UndefOr[Arn] = js.undefined): UpdateAssessmentTargetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "assessmentTargetArn"  -> assessmentTargetArn.asInstanceOf[js.Any],
        "assessmentTargetName" -> assessmentTargetName.asInstanceOf[js.Any],
        "resourceGroupArn" -> resourceGroupArn.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateAssessmentTargetRequest]
    }
  }
}
