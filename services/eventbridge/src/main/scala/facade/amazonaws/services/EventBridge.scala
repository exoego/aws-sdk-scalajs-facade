package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

package object eventbridge {
  type AccountId = String
  type Action = String
  type ApiDestinationArn = String
  type ApiDestinationDescription = String
  type ApiDestinationInvocationRateLimitPerSecond = Int
  type ApiDestinationName = String
  type ApiDestinationResponseList = js.Array[ApiDestination]
  type ArchiveArn = String
  type ArchiveDescription = String
  type ArchiveName = String
  type ArchiveResponseList = js.Array[Archive]
  type ArchiveStateReason = String
  type Arn = String
  type AuthHeaderParameters = String
  type ConnectionArn = String
  type ConnectionBodyParametersList = js.Array[ConnectionBodyParameter]
  type ConnectionDescription = String
  type ConnectionHeaderParametersList = js.Array[ConnectionHeaderParameter]
  type ConnectionName = String
  type ConnectionQueryStringParametersList = js.Array[ConnectionQueryStringParameter]
  type ConnectionResponseList = js.Array[Connection]
  type ConnectionStateReason = String
  type CreatedBy = String
  type Database = String
  type DbUser = String
  type ErrorCode = String
  type ErrorMessage = String
  type EventBusList = js.Array[EventBus]
  type EventBusName = String
  type EventBusNameOrArn = String
  type EventId = String
  type EventPattern = String
  type EventResource = String
  type EventResourceList = js.Array[EventResource]
  type EventSourceList = js.Array[EventSource]
  type EventSourceName = String
  type EventSourceNamePrefix = String
  type EventTime = js.Date
  type HeaderKey = String
  type HeaderParametersMap = js.Dictionary[HeaderValue]
  type HeaderValue = String
  type HttpsEndpoint = String
  type InputTransformerPathKey = String
  type LimitMax100 = Int
  type LimitMin1 = Int
  type ManagedBy = String
  type MaximumEventAgeInSeconds = Int
  type MaximumRetryAttempts = Int
  type MessageGroupId = String
  type NextToken = String
  type NonPartnerEventBusName = String
  type NonPartnerEventBusNameOrArn = String
  type PartnerEventSourceAccountList = js.Array[PartnerEventSourceAccount]
  type PartnerEventSourceList = js.Array[PartnerEventSource]
  type PartnerEventSourceNamePrefix = String
  type PathParameter = String
  type PathParameterList = js.Array[PathParameter]
  type Principal = String
  type PutEventsRequestEntryList = js.Array[PutEventsRequestEntry]
  type PutEventsResultEntryList = js.Array[PutEventsResultEntry]
  type PutPartnerEventsRequestEntryList = js.Array[PutPartnerEventsRequestEntry]
  type PutPartnerEventsResultEntryList = js.Array[PutPartnerEventsResultEntry]
  type PutTargetsResultEntryList = js.Array[PutTargetsResultEntry]
  type QueryStringKey = String
  type QueryStringParametersMap = js.Dictionary[QueryStringValue]
  type QueryStringValue = String
  type RedshiftSecretManagerArn = String
  type RemoveTargetsResultEntryList = js.Array[RemoveTargetsResultEntry]
  type ReplayArn = String
  type ReplayDescription = String
  type ReplayDestinationFilters = js.Array[Arn]
  type ReplayList = js.Array[Replay]
  type ReplayName = String
  type ReplayStateReason = String
  type ResourceArn = String
  type RetentionDays = Int
  type RoleArn = String
  type RuleArn = String
  type RuleDescription = String
  type RuleName = String
  type RuleNameList = js.Array[RuleName]
  type RuleResponseList = js.Array[Rule]
  type RunCommandTargetKey = String
  type RunCommandTargetValue = String
  type RunCommandTargetValues = js.Array[RunCommandTargetValue]
  type RunCommandTargets = js.Array[RunCommandTarget]
  type SageMakerPipelineParameterList = js.Array[SageMakerPipelineParameter]
  type SageMakerPipelineParameterName = String
  type SageMakerPipelineParameterValue = String
  type ScheduleExpression = String
  type SecretsManagerSecretArn = String
  type Sql = String
  type StatementId = String
  type StatementName = String
  type StringList = js.Array[String]
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagList = js.Array[Tag]
  type TagValue = String
  type TargetArn = String
  type TargetId = String
  type TargetIdList = js.Array[TargetId]
  type TargetInput = String
  type TargetInputPath = String
  type TargetList = js.Array[Target]
  type TargetPartitionKeyPath = String
  type Timestamp = js.Date
  type TraceHeader = String
  type TransformerInput = String
  type TransformerPaths = js.Dictionary[TargetInputPath]

  implicit final class EventBridgeOps(private val service: EventBridge) extends AnyVal {

    @inline def activateEventSourceFuture(params: ActivateEventSourceRequest): Future[js.Object] = service.activateEventSource(params).promise().toFuture
    @inline def cancelReplayFuture(params: CancelReplayRequest): Future[CancelReplayResponse] = service.cancelReplay(params).promise().toFuture
    @inline def createApiDestinationFuture(params: CreateApiDestinationRequest): Future[CreateApiDestinationResponse] = service.createApiDestination(params).promise().toFuture
    @inline def createArchiveFuture(params: CreateArchiveRequest): Future[CreateArchiveResponse] = service.createArchive(params).promise().toFuture
    @inline def createConnectionFuture(params: CreateConnectionRequest): Future[CreateConnectionResponse] = service.createConnection(params).promise().toFuture
    @inline def createEventBusFuture(params: CreateEventBusRequest): Future[CreateEventBusResponse] = service.createEventBus(params).promise().toFuture
    @inline def createPartnerEventSourceFuture(params: CreatePartnerEventSourceRequest): Future[CreatePartnerEventSourceResponse] = service.createPartnerEventSource(params).promise().toFuture
    @inline def deactivateEventSourceFuture(params: DeactivateEventSourceRequest): Future[js.Object] = service.deactivateEventSource(params).promise().toFuture
    @inline def deauthorizeConnectionFuture(params: DeauthorizeConnectionRequest): Future[DeauthorizeConnectionResponse] = service.deauthorizeConnection(params).promise().toFuture
    @inline def deleteApiDestinationFuture(params: DeleteApiDestinationRequest): Future[DeleteApiDestinationResponse] = service.deleteApiDestination(params).promise().toFuture
    @inline def deleteArchiveFuture(params: DeleteArchiveRequest): Future[DeleteArchiveResponse] = service.deleteArchive(params).promise().toFuture
    @inline def deleteConnectionFuture(params: DeleteConnectionRequest): Future[DeleteConnectionResponse] = service.deleteConnection(params).promise().toFuture
    @inline def deleteEventBusFuture(params: DeleteEventBusRequest): Future[js.Object] = service.deleteEventBus(params).promise().toFuture
    @inline def deletePartnerEventSourceFuture(params: DeletePartnerEventSourceRequest): Future[js.Object] = service.deletePartnerEventSource(params).promise().toFuture
    @inline def deleteRuleFuture(params: DeleteRuleRequest): Future[js.Object] = service.deleteRule(params).promise().toFuture
    @inline def describeApiDestinationFuture(params: DescribeApiDestinationRequest): Future[DescribeApiDestinationResponse] = service.describeApiDestination(params).promise().toFuture
    @inline def describeArchiveFuture(params: DescribeArchiveRequest): Future[DescribeArchiveResponse] = service.describeArchive(params).promise().toFuture
    @inline def describeConnectionFuture(params: DescribeConnectionRequest): Future[DescribeConnectionResponse] = service.describeConnection(params).promise().toFuture
    @inline def describeEventBusFuture(params: DescribeEventBusRequest): Future[DescribeEventBusResponse] = service.describeEventBus(params).promise().toFuture
    @inline def describeEventSourceFuture(params: DescribeEventSourceRequest): Future[DescribeEventSourceResponse] = service.describeEventSource(params).promise().toFuture
    @inline def describePartnerEventSourceFuture(params: DescribePartnerEventSourceRequest): Future[DescribePartnerEventSourceResponse] = service.describePartnerEventSource(params).promise().toFuture
    @inline def describeReplayFuture(params: DescribeReplayRequest): Future[DescribeReplayResponse] = service.describeReplay(params).promise().toFuture
    @inline def describeRuleFuture(params: DescribeRuleRequest): Future[DescribeRuleResponse] = service.describeRule(params).promise().toFuture
    @inline def disableRuleFuture(params: DisableRuleRequest): Future[js.Object] = service.disableRule(params).promise().toFuture
    @inline def enableRuleFuture(params: EnableRuleRequest): Future[js.Object] = service.enableRule(params).promise().toFuture
    @inline def listApiDestinationsFuture(params: ListApiDestinationsRequest): Future[ListApiDestinationsResponse] = service.listApiDestinations(params).promise().toFuture
    @inline def listArchivesFuture(params: ListArchivesRequest): Future[ListArchivesResponse] = service.listArchives(params).promise().toFuture
    @inline def listConnectionsFuture(params: ListConnectionsRequest): Future[ListConnectionsResponse] = service.listConnections(params).promise().toFuture
    @inline def listEventBusesFuture(params: ListEventBusesRequest): Future[ListEventBusesResponse] = service.listEventBuses(params).promise().toFuture
    @inline def listEventSourcesFuture(params: ListEventSourcesRequest): Future[ListEventSourcesResponse] = service.listEventSources(params).promise().toFuture
    @inline def listPartnerEventSourceAccountsFuture(params: ListPartnerEventSourceAccountsRequest): Future[ListPartnerEventSourceAccountsResponse] = service.listPartnerEventSourceAccounts(params).promise().toFuture
    @inline def listPartnerEventSourcesFuture(params: ListPartnerEventSourcesRequest): Future[ListPartnerEventSourcesResponse] = service.listPartnerEventSources(params).promise().toFuture
    @inline def listReplaysFuture(params: ListReplaysRequest): Future[ListReplaysResponse] = service.listReplays(params).promise().toFuture
    @inline def listRuleNamesByTargetFuture(params: ListRuleNamesByTargetRequest): Future[ListRuleNamesByTargetResponse] = service.listRuleNamesByTarget(params).promise().toFuture
    @inline def listRulesFuture(params: ListRulesRequest): Future[ListRulesResponse] = service.listRules(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] = service.listTagsForResource(params).promise().toFuture
    @inline def listTargetsByRuleFuture(params: ListTargetsByRuleRequest): Future[ListTargetsByRuleResponse] = service.listTargetsByRule(params).promise().toFuture
    @inline def putEventsFuture(params: PutEventsRequest): Future[PutEventsResponse] = service.putEvents(params).promise().toFuture
    @inline def putPartnerEventsFuture(params: PutPartnerEventsRequest): Future[PutPartnerEventsResponse] = service.putPartnerEvents(params).promise().toFuture
    @inline def putPermissionFuture(params: PutPermissionRequest): Future[js.Object] = service.putPermission(params).promise().toFuture
    @inline def putRuleFuture(params: PutRuleRequest): Future[PutRuleResponse] = service.putRule(params).promise().toFuture
    @inline def putTargetsFuture(params: PutTargetsRequest): Future[PutTargetsResponse] = service.putTargets(params).promise().toFuture
    @inline def removePermissionFuture(params: RemovePermissionRequest): Future[js.Object] = service.removePermission(params).promise().toFuture
    @inline def removeTargetsFuture(params: RemoveTargetsRequest): Future[RemoveTargetsResponse] = service.removeTargets(params).promise().toFuture
    @inline def startReplayFuture(params: StartReplayRequest): Future[StartReplayResponse] = service.startReplay(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] = service.tagResource(params).promise().toFuture
    @inline def testEventPatternFuture(params: TestEventPatternRequest): Future[TestEventPatternResponse] = service.testEventPattern(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] = service.untagResource(params).promise().toFuture
    @inline def updateApiDestinationFuture(params: UpdateApiDestinationRequest): Future[UpdateApiDestinationResponse] = service.updateApiDestination(params).promise().toFuture
    @inline def updateArchiveFuture(params: UpdateArchiveRequest): Future[UpdateArchiveResponse] = service.updateArchive(params).promise().toFuture
    @inline def updateConnectionFuture(params: UpdateConnectionRequest): Future[UpdateConnectionResponse] = service.updateConnection(params).promise().toFuture

  }
}

package eventbridge {
  @js.native
  @JSImport("aws-sdk/clients/eventbridge", JSImport.Namespace, "AWS.EventBridge")
  class EventBridge() extends js.Object {
    def this(config: AWSConfig) = this()

    def activateEventSource(params: ActivateEventSourceRequest): Request[js.Object] = js.native
    def cancelReplay(params: CancelReplayRequest): Request[CancelReplayResponse] = js.native
    def createApiDestination(params: CreateApiDestinationRequest): Request[CreateApiDestinationResponse] = js.native
    def createArchive(params: CreateArchiveRequest): Request[CreateArchiveResponse] = js.native
    def createConnection(params: CreateConnectionRequest): Request[CreateConnectionResponse] = js.native
    def createEventBus(params: CreateEventBusRequest): Request[CreateEventBusResponse] = js.native
    def createPartnerEventSource(params: CreatePartnerEventSourceRequest): Request[CreatePartnerEventSourceResponse] = js.native
    def deactivateEventSource(params: DeactivateEventSourceRequest): Request[js.Object] = js.native
    def deauthorizeConnection(params: DeauthorizeConnectionRequest): Request[DeauthorizeConnectionResponse] = js.native
    def deleteApiDestination(params: DeleteApiDestinationRequest): Request[DeleteApiDestinationResponse] = js.native
    def deleteArchive(params: DeleteArchiveRequest): Request[DeleteArchiveResponse] = js.native
    def deleteConnection(params: DeleteConnectionRequest): Request[DeleteConnectionResponse] = js.native
    def deleteEventBus(params: DeleteEventBusRequest): Request[js.Object] = js.native
    def deletePartnerEventSource(params: DeletePartnerEventSourceRequest): Request[js.Object] = js.native
    def deleteRule(params: DeleteRuleRequest): Request[js.Object] = js.native
    def describeApiDestination(params: DescribeApiDestinationRequest): Request[DescribeApiDestinationResponse] = js.native
    def describeArchive(params: DescribeArchiveRequest): Request[DescribeArchiveResponse] = js.native
    def describeConnection(params: DescribeConnectionRequest): Request[DescribeConnectionResponse] = js.native
    def describeEventBus(params: DescribeEventBusRequest): Request[DescribeEventBusResponse] = js.native
    def describeEventSource(params: DescribeEventSourceRequest): Request[DescribeEventSourceResponse] = js.native
    def describePartnerEventSource(params: DescribePartnerEventSourceRequest): Request[DescribePartnerEventSourceResponse] = js.native
    def describeReplay(params: DescribeReplayRequest): Request[DescribeReplayResponse] = js.native
    def describeRule(params: DescribeRuleRequest): Request[DescribeRuleResponse] = js.native
    def disableRule(params: DisableRuleRequest): Request[js.Object] = js.native
    def enableRule(params: EnableRuleRequest): Request[js.Object] = js.native
    def listApiDestinations(params: ListApiDestinationsRequest): Request[ListApiDestinationsResponse] = js.native
    def listArchives(params: ListArchivesRequest): Request[ListArchivesResponse] = js.native
    def listConnections(params: ListConnectionsRequest): Request[ListConnectionsResponse] = js.native
    def listEventBuses(params: ListEventBusesRequest): Request[ListEventBusesResponse] = js.native
    def listEventSources(params: ListEventSourcesRequest): Request[ListEventSourcesResponse] = js.native
    def listPartnerEventSourceAccounts(params: ListPartnerEventSourceAccountsRequest): Request[ListPartnerEventSourceAccountsResponse] = js.native
    def listPartnerEventSources(params: ListPartnerEventSourcesRequest): Request[ListPartnerEventSourcesResponse] = js.native
    def listReplays(params: ListReplaysRequest): Request[ListReplaysResponse] = js.native
    def listRuleNamesByTarget(params: ListRuleNamesByTargetRequest): Request[ListRuleNamesByTargetResponse] = js.native
    def listRules(params: ListRulesRequest): Request[ListRulesResponse] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def listTargetsByRule(params: ListTargetsByRuleRequest): Request[ListTargetsByRuleResponse] = js.native
    def putEvents(params: PutEventsRequest): Request[PutEventsResponse] = js.native
    def putPartnerEvents(params: PutPartnerEventsRequest): Request[PutPartnerEventsResponse] = js.native
    def putPermission(params: PutPermissionRequest): Request[js.Object] = js.native
    def putRule(params: PutRuleRequest): Request[PutRuleResponse] = js.native
    def putTargets(params: PutTargetsRequest): Request[PutTargetsResponse] = js.native
    def removePermission(params: RemovePermissionRequest): Request[js.Object] = js.native
    def removeTargets(params: RemoveTargetsRequest): Request[RemoveTargetsResponse] = js.native
    def startReplay(params: StartReplayRequest): Request[StartReplayResponse] = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse] = js.native
    def testEventPattern(params: TestEventPatternRequest): Request[TestEventPatternResponse] = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse] = js.native
    def updateApiDestination(params: UpdateApiDestinationRequest): Request[UpdateApiDestinationResponse] = js.native
    def updateArchive(params: UpdateArchiveRequest): Request[UpdateArchiveResponse] = js.native
    def updateConnection(params: UpdateConnectionRequest): Request[UpdateConnectionResponse] = js.native
  }

  @js.native
  trait ActivateEventSourceRequest extends js.Object {
    var Name: EventSourceName
  }

  object ActivateEventSourceRequest {
    @inline
    def apply(
        Name: EventSourceName
    ): ActivateEventSourceRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ActivateEventSourceRequest]
    }
  }

  /** Contains details about an API destination.
    */
  @js.native
  trait ApiDestination extends js.Object {
    var ApiDestinationArn: js.UndefOr[ApiDestinationArn]
    var ApiDestinationState: js.UndefOr[ApiDestinationState]
    var ConnectionArn: js.UndefOr[ConnectionArn]
    var CreationTime: js.UndefOr[Timestamp]
    var HttpMethod: js.UndefOr[ApiDestinationHttpMethod]
    var InvocationEndpoint: js.UndefOr[HttpsEndpoint]
    var InvocationRateLimitPerSecond: js.UndefOr[ApiDestinationInvocationRateLimitPerSecond]
    var LastModifiedTime: js.UndefOr[Timestamp]
    var Name: js.UndefOr[ApiDestinationName]
  }

  object ApiDestination {
    @inline
    def apply(
        ApiDestinationArn: js.UndefOr[ApiDestinationArn] = js.undefined,
        ApiDestinationState: js.UndefOr[ApiDestinationState] = js.undefined,
        ConnectionArn: js.UndefOr[ConnectionArn] = js.undefined,
        CreationTime: js.UndefOr[Timestamp] = js.undefined,
        HttpMethod: js.UndefOr[ApiDestinationHttpMethod] = js.undefined,
        InvocationEndpoint: js.UndefOr[HttpsEndpoint] = js.undefined,
        InvocationRateLimitPerSecond: js.UndefOr[ApiDestinationInvocationRateLimitPerSecond] = js.undefined,
        LastModifiedTime: js.UndefOr[Timestamp] = js.undefined,
        Name: js.UndefOr[ApiDestinationName] = js.undefined
    ): ApiDestination = {
      val __obj = js.Dynamic.literal()
      ApiDestinationArn.foreach(__v => __obj.updateDynamic("ApiDestinationArn")(__v.asInstanceOf[js.Any]))
      ApiDestinationState.foreach(__v => __obj.updateDynamic("ApiDestinationState")(__v.asInstanceOf[js.Any]))
      ConnectionArn.foreach(__v => __obj.updateDynamic("ConnectionArn")(__v.asInstanceOf[js.Any]))
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      HttpMethod.foreach(__v => __obj.updateDynamic("HttpMethod")(__v.asInstanceOf[js.Any]))
      InvocationEndpoint.foreach(__v => __obj.updateDynamic("InvocationEndpoint")(__v.asInstanceOf[js.Any]))
      InvocationRateLimitPerSecond.foreach(__v => __obj.updateDynamic("InvocationRateLimitPerSecond")(__v.asInstanceOf[js.Any]))
      LastModifiedTime.foreach(__v => __obj.updateDynamic("LastModifiedTime")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ApiDestination]
    }
  }

  @js.native
  sealed trait ApiDestinationHttpMethod extends js.Any
  object ApiDestinationHttpMethod {
    val POST = "POST".asInstanceOf[ApiDestinationHttpMethod]
    val GET = "GET".asInstanceOf[ApiDestinationHttpMethod]
    val HEAD = "HEAD".asInstanceOf[ApiDestinationHttpMethod]
    val OPTIONS = "OPTIONS".asInstanceOf[ApiDestinationHttpMethod]
    val PUT = "PUT".asInstanceOf[ApiDestinationHttpMethod]
    val PATCH = "PATCH".asInstanceOf[ApiDestinationHttpMethod]
    val DELETE = "DELETE".asInstanceOf[ApiDestinationHttpMethod]

    @inline def values = js.Array(POST, GET, HEAD, OPTIONS, PUT, PATCH, DELETE)
  }

  @js.native
  sealed trait ApiDestinationState extends js.Any
  object ApiDestinationState {
    val ACTIVE = "ACTIVE".asInstanceOf[ApiDestinationState]
    val INACTIVE = "INACTIVE".asInstanceOf[ApiDestinationState]

    @inline def values = js.Array(ACTIVE, INACTIVE)
  }

  /** An <code>Archive</code> object that contains details about an archive.
    */
  @js.native
  trait Archive extends js.Object {
    var ArchiveName: js.UndefOr[ArchiveName]
    var CreationTime: js.UndefOr[Timestamp]
    var EventCount: js.UndefOr[Double]
    var EventSourceArn: js.UndefOr[Arn]
    var RetentionDays: js.UndefOr[RetentionDays]
    var SizeBytes: js.UndefOr[Double]
    var State: js.UndefOr[ArchiveState]
    var StateReason: js.UndefOr[ArchiveStateReason]
  }

  object Archive {
    @inline
    def apply(
        ArchiveName: js.UndefOr[ArchiveName] = js.undefined,
        CreationTime: js.UndefOr[Timestamp] = js.undefined,
        EventCount: js.UndefOr[Double] = js.undefined,
        EventSourceArn: js.UndefOr[Arn] = js.undefined,
        RetentionDays: js.UndefOr[RetentionDays] = js.undefined,
        SizeBytes: js.UndefOr[Double] = js.undefined,
        State: js.UndefOr[ArchiveState] = js.undefined,
        StateReason: js.UndefOr[ArchiveStateReason] = js.undefined
    ): Archive = {
      val __obj = js.Dynamic.literal()
      ArchiveName.foreach(__v => __obj.updateDynamic("ArchiveName")(__v.asInstanceOf[js.Any]))
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      EventCount.foreach(__v => __obj.updateDynamic("EventCount")(__v.asInstanceOf[js.Any]))
      EventSourceArn.foreach(__v => __obj.updateDynamic("EventSourceArn")(__v.asInstanceOf[js.Any]))
      RetentionDays.foreach(__v => __obj.updateDynamic("RetentionDays")(__v.asInstanceOf[js.Any]))
      SizeBytes.foreach(__v => __obj.updateDynamic("SizeBytes")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      StateReason.foreach(__v => __obj.updateDynamic("StateReason")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Archive]
    }
  }

  @js.native
  sealed trait ArchiveState extends js.Any
  object ArchiveState {
    val ENABLED = "ENABLED".asInstanceOf[ArchiveState]
    val DISABLED = "DISABLED".asInstanceOf[ArchiveState]
    val CREATING = "CREATING".asInstanceOf[ArchiveState]
    val UPDATING = "UPDATING".asInstanceOf[ArchiveState]
    val CREATE_FAILED = "CREATE_FAILED".asInstanceOf[ArchiveState]
    val UPDATE_FAILED = "UPDATE_FAILED".asInstanceOf[ArchiveState]

    @inline def values = js.Array(ENABLED, DISABLED, CREATING, UPDATING, CREATE_FAILED, UPDATE_FAILED)
  }

  @js.native
  sealed trait AssignPublicIp extends js.Any
  object AssignPublicIp {
    val ENABLED = "ENABLED".asInstanceOf[AssignPublicIp]
    val DISABLED = "DISABLED".asInstanceOf[AssignPublicIp]

    @inline def values = js.Array(ENABLED, DISABLED)
  }

  /** This structure specifies the VPC subnets and security groups for the task, and whether a public IP address is to be used. This structure is relevant only for ECS tasks that use the <code>awsvpc</code> network mode.
    */
  @js.native
  trait AwsVpcConfiguration extends js.Object {
    var Subnets: StringList
    var AssignPublicIp: js.UndefOr[AssignPublicIp]
    var SecurityGroups: js.UndefOr[StringList]
  }

  object AwsVpcConfiguration {
    @inline
    def apply(
        Subnets: StringList,
        AssignPublicIp: js.UndefOr[AssignPublicIp] = js.undefined,
        SecurityGroups: js.UndefOr[StringList] = js.undefined
    ): AwsVpcConfiguration = {
      val __obj = js.Dynamic.literal(
        "Subnets" -> Subnets.asInstanceOf[js.Any]
      )

      AssignPublicIp.foreach(__v => __obj.updateDynamic("AssignPublicIp")(__v.asInstanceOf[js.Any]))
      SecurityGroups.foreach(__v => __obj.updateDynamic("SecurityGroups")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsVpcConfiguration]
    }
  }

  /** The array properties for the submitted job, such as the size of the array. The array size can be between 2 and 10,000. If you specify array properties for a job, it becomes an array job. This parameter is used only if the target is an AWS Batch job.
    */
  @js.native
  trait BatchArrayProperties extends js.Object {
    var Size: js.UndefOr[Int]
  }

  object BatchArrayProperties {
    @inline
    def apply(
        Size: js.UndefOr[Int] = js.undefined
    ): BatchArrayProperties = {
      val __obj = js.Dynamic.literal()
      Size.foreach(__v => __obj.updateDynamic("Size")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchArrayProperties]
    }
  }

  /** The custom parameters to be used when the target is an AWS Batch job.
    */
  @js.native
  trait BatchParameters extends js.Object {
    var JobDefinition: String
    var JobName: String
    var ArrayProperties: js.UndefOr[BatchArrayProperties]
    var RetryStrategy: js.UndefOr[BatchRetryStrategy]
  }

  object BatchParameters {
    @inline
    def apply(
        JobDefinition: String,
        JobName: String,
        ArrayProperties: js.UndefOr[BatchArrayProperties] = js.undefined,
        RetryStrategy: js.UndefOr[BatchRetryStrategy] = js.undefined
    ): BatchParameters = {
      val __obj = js.Dynamic.literal(
        "JobDefinition" -> JobDefinition.asInstanceOf[js.Any],
        "JobName" -> JobName.asInstanceOf[js.Any]
      )

      ArrayProperties.foreach(__v => __obj.updateDynamic("ArrayProperties")(__v.asInstanceOf[js.Any]))
      RetryStrategy.foreach(__v => __obj.updateDynamic("RetryStrategy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchParameters]
    }
  }

  /** The retry strategy to use for failed jobs, if the target is an AWS Batch job. If you specify a retry strategy here, it overrides the retry strategy defined in the job definition.
    */
  @js.native
  trait BatchRetryStrategy extends js.Object {
    var Attempts: js.UndefOr[Int]
  }

  object BatchRetryStrategy {
    @inline
    def apply(
        Attempts: js.UndefOr[Int] = js.undefined
    ): BatchRetryStrategy = {
      val __obj = js.Dynamic.literal()
      Attempts.foreach(__v => __obj.updateDynamic("Attempts")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchRetryStrategy]
    }
  }

  @js.native
  trait CancelReplayRequest extends js.Object {
    var ReplayName: ReplayName
  }

  object CancelReplayRequest {
    @inline
    def apply(
        ReplayName: ReplayName
    ): CancelReplayRequest = {
      val __obj = js.Dynamic.literal(
        "ReplayName" -> ReplayName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CancelReplayRequest]
    }
  }

  @js.native
  trait CancelReplayResponse extends js.Object {
    var ReplayArn: js.UndefOr[ReplayArn]
    var State: js.UndefOr[ReplayState]
    var StateReason: js.UndefOr[ReplayStateReason]
  }

  object CancelReplayResponse {
    @inline
    def apply(
        ReplayArn: js.UndefOr[ReplayArn] = js.undefined,
        State: js.UndefOr[ReplayState] = js.undefined,
        StateReason: js.UndefOr[ReplayStateReason] = js.undefined
    ): CancelReplayResponse = {
      val __obj = js.Dynamic.literal()
      ReplayArn.foreach(__v => __obj.updateDynamic("ReplayArn")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      StateReason.foreach(__v => __obj.updateDynamic("StateReason")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CancelReplayResponse]
    }
  }

  /** A JSON string which you can use to limit the event bus permissions you are granting to only accounts that fulfill the condition. Currently, the only supported condition is membership in a certain AWS organization. The string must contain <code>Type</code>, <code>Key</code>, and <code>Value</code> fields. The <code>Value</code> field specifies the ID of the AWS organization. Following is an example value for <code>Condition</code>: <code>'{"Type" : "StringEquals", "Key": "aws:PrincipalOrgID", "Value": "o-1234567890"}'</code>
    */
  @js.native
  trait Condition extends js.Object {
    var Key: String
    var Type: String
    var Value: String
  }

  object Condition {
    @inline
    def apply(
        Key: String,
        Type: String,
        Value: String
    ): Condition = {
      val __obj = js.Dynamic.literal(
        "Key" -> Key.asInstanceOf[js.Any],
        "Type" -> Type.asInstanceOf[js.Any],
        "Value" -> Value.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[Condition]
    }
  }

  /** Contains information about a connection.
    */
  @js.native
  trait Connection extends js.Object {
    var AuthorizationType: js.UndefOr[ConnectionAuthorizationType]
    var ConnectionArn: js.UndefOr[ConnectionArn]
    var ConnectionState: js.UndefOr[ConnectionState]
    var CreationTime: js.UndefOr[Timestamp]
    var LastAuthorizedTime: js.UndefOr[Timestamp]
    var LastModifiedTime: js.UndefOr[Timestamp]
    var Name: js.UndefOr[ConnectionName]
    var StateReason: js.UndefOr[ConnectionStateReason]
  }

  object Connection {
    @inline
    def apply(
        AuthorizationType: js.UndefOr[ConnectionAuthorizationType] = js.undefined,
        ConnectionArn: js.UndefOr[ConnectionArn] = js.undefined,
        ConnectionState: js.UndefOr[ConnectionState] = js.undefined,
        CreationTime: js.UndefOr[Timestamp] = js.undefined,
        LastAuthorizedTime: js.UndefOr[Timestamp] = js.undefined,
        LastModifiedTime: js.UndefOr[Timestamp] = js.undefined,
        Name: js.UndefOr[ConnectionName] = js.undefined,
        StateReason: js.UndefOr[ConnectionStateReason] = js.undefined
    ): Connection = {
      val __obj = js.Dynamic.literal()
      AuthorizationType.foreach(__v => __obj.updateDynamic("AuthorizationType")(__v.asInstanceOf[js.Any]))
      ConnectionArn.foreach(__v => __obj.updateDynamic("ConnectionArn")(__v.asInstanceOf[js.Any]))
      ConnectionState.foreach(__v => __obj.updateDynamic("ConnectionState")(__v.asInstanceOf[js.Any]))
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      LastAuthorizedTime.foreach(__v => __obj.updateDynamic("LastAuthorizedTime")(__v.asInstanceOf[js.Any]))
      LastModifiedTime.foreach(__v => __obj.updateDynamic("LastModifiedTime")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      StateReason.foreach(__v => __obj.updateDynamic("StateReason")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Connection]
    }
  }

  /** Contains the authorization parameters for the connection if API Key is specified as the authorization type.
    */
  @js.native
  trait ConnectionApiKeyAuthResponseParameters extends js.Object {
    var ApiKeyName: js.UndefOr[AuthHeaderParameters]
  }

  object ConnectionApiKeyAuthResponseParameters {
    @inline
    def apply(
        ApiKeyName: js.UndefOr[AuthHeaderParameters] = js.undefined
    ): ConnectionApiKeyAuthResponseParameters = {
      val __obj = js.Dynamic.literal()
      ApiKeyName.foreach(__v => __obj.updateDynamic("ApiKeyName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ConnectionApiKeyAuthResponseParameters]
    }
  }

  /** Contains the authorization parameters to use for the connection.
    */
  @js.native
  trait ConnectionAuthResponseParameters extends js.Object {
    var ApiKeyAuthParameters: js.UndefOr[ConnectionApiKeyAuthResponseParameters]
    var BasicAuthParameters: js.UndefOr[ConnectionBasicAuthResponseParameters]
    var InvocationHttpParameters: js.UndefOr[ConnectionHttpParameters]
    var OAuthParameters: js.UndefOr[ConnectionOAuthResponseParameters]
  }

  object ConnectionAuthResponseParameters {
    @inline
    def apply(
        ApiKeyAuthParameters: js.UndefOr[ConnectionApiKeyAuthResponseParameters] = js.undefined,
        BasicAuthParameters: js.UndefOr[ConnectionBasicAuthResponseParameters] = js.undefined,
        InvocationHttpParameters: js.UndefOr[ConnectionHttpParameters] = js.undefined,
        OAuthParameters: js.UndefOr[ConnectionOAuthResponseParameters] = js.undefined
    ): ConnectionAuthResponseParameters = {
      val __obj = js.Dynamic.literal()
      ApiKeyAuthParameters.foreach(__v => __obj.updateDynamic("ApiKeyAuthParameters")(__v.asInstanceOf[js.Any]))
      BasicAuthParameters.foreach(__v => __obj.updateDynamic("BasicAuthParameters")(__v.asInstanceOf[js.Any]))
      InvocationHttpParameters.foreach(__v => __obj.updateDynamic("InvocationHttpParameters")(__v.asInstanceOf[js.Any]))
      OAuthParameters.foreach(__v => __obj.updateDynamic("OAuthParameters")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ConnectionAuthResponseParameters]
    }
  }

  @js.native
  sealed trait ConnectionAuthorizationType extends js.Any
  object ConnectionAuthorizationType {
    val BASIC = "BASIC".asInstanceOf[ConnectionAuthorizationType]
    val OAUTH_CLIENT_CREDENTIALS = "OAUTH_CLIENT_CREDENTIALS".asInstanceOf[ConnectionAuthorizationType]
    val API_KEY = "API_KEY".asInstanceOf[ConnectionAuthorizationType]

    @inline def values = js.Array(BASIC, OAUTH_CLIENT_CREDENTIALS, API_KEY)
  }

  /** Contains the authorization parameters for the connection if Basic is specified as the authorization type.
    */
  @js.native
  trait ConnectionBasicAuthResponseParameters extends js.Object {
    var Username: js.UndefOr[AuthHeaderParameters]
  }

  object ConnectionBasicAuthResponseParameters {
    @inline
    def apply(
        Username: js.UndefOr[AuthHeaderParameters] = js.undefined
    ): ConnectionBasicAuthResponseParameters = {
      val __obj = js.Dynamic.literal()
      Username.foreach(__v => __obj.updateDynamic("Username")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ConnectionBasicAuthResponseParameters]
    }
  }

  /** Additional parameter included in the body. You can include up to 100 additional body parameters per request. An event payload cannot exceed 64 KB.
    */
  @js.native
  trait ConnectionBodyParameter extends js.Object {
    var IsValueSecret: js.UndefOr[Boolean]
    var Key: js.UndefOr[String]
    var Value: js.UndefOr[String]
  }

  object ConnectionBodyParameter {
    @inline
    def apply(
        IsValueSecret: js.UndefOr[Boolean] = js.undefined,
        Key: js.UndefOr[String] = js.undefined,
        Value: js.UndefOr[String] = js.undefined
    ): ConnectionBodyParameter = {
      val __obj = js.Dynamic.literal()
      IsValueSecret.foreach(__v => __obj.updateDynamic("IsValueSecret")(__v.asInstanceOf[js.Any]))
      Key.foreach(__v => __obj.updateDynamic("Key")(__v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ConnectionBodyParameter]
    }
  }

  /** Additional parameter included in the header. You can include up to 100 additional header parameters per request. An event payload cannot exceed 64 KB.
    */
  @js.native
  trait ConnectionHeaderParameter extends js.Object {
    var IsValueSecret: js.UndefOr[Boolean]
    var Key: js.UndefOr[HeaderKey]
    var Value: js.UndefOr[HeaderValue]
  }

  object ConnectionHeaderParameter {
    @inline
    def apply(
        IsValueSecret: js.UndefOr[Boolean] = js.undefined,
        Key: js.UndefOr[HeaderKey] = js.undefined,
        Value: js.UndefOr[HeaderValue] = js.undefined
    ): ConnectionHeaderParameter = {
      val __obj = js.Dynamic.literal()
      IsValueSecret.foreach(__v => __obj.updateDynamic("IsValueSecret")(__v.asInstanceOf[js.Any]))
      Key.foreach(__v => __obj.updateDynamic("Key")(__v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ConnectionHeaderParameter]
    }
  }

  /** Contains additional parameters for the connection.
    */
  @js.native
  trait ConnectionHttpParameters extends js.Object {
    var BodyParameters: js.UndefOr[ConnectionBodyParametersList]
    var HeaderParameters: js.UndefOr[ConnectionHeaderParametersList]
    var QueryStringParameters: js.UndefOr[ConnectionQueryStringParametersList]
  }

  object ConnectionHttpParameters {
    @inline
    def apply(
        BodyParameters: js.UndefOr[ConnectionBodyParametersList] = js.undefined,
        HeaderParameters: js.UndefOr[ConnectionHeaderParametersList] = js.undefined,
        QueryStringParameters: js.UndefOr[ConnectionQueryStringParametersList] = js.undefined
    ): ConnectionHttpParameters = {
      val __obj = js.Dynamic.literal()
      BodyParameters.foreach(__v => __obj.updateDynamic("BodyParameters")(__v.asInstanceOf[js.Any]))
      HeaderParameters.foreach(__v => __obj.updateDynamic("HeaderParameters")(__v.asInstanceOf[js.Any]))
      QueryStringParameters.foreach(__v => __obj.updateDynamic("QueryStringParameters")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ConnectionHttpParameters]
    }
  }

  /** Contains the client response parameters for the connection when OAuth is specified as the authorization type.
    */
  @js.native
  trait ConnectionOAuthClientResponseParameters extends js.Object {
    var ClientID: js.UndefOr[AuthHeaderParameters]
  }

  object ConnectionOAuthClientResponseParameters {
    @inline
    def apply(
        ClientID: js.UndefOr[AuthHeaderParameters] = js.undefined
    ): ConnectionOAuthClientResponseParameters = {
      val __obj = js.Dynamic.literal()
      ClientID.foreach(__v => __obj.updateDynamic("ClientID")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ConnectionOAuthClientResponseParameters]
    }
  }

  @js.native
  sealed trait ConnectionOAuthHttpMethod extends js.Any
  object ConnectionOAuthHttpMethod {
    val GET = "GET".asInstanceOf[ConnectionOAuthHttpMethod]
    val POST = "POST".asInstanceOf[ConnectionOAuthHttpMethod]
    val PUT = "PUT".asInstanceOf[ConnectionOAuthHttpMethod]

    @inline def values = js.Array(GET, POST, PUT)
  }

  /** Contains the response parameters when OAuth is specified as the authorization type.
    */
  @js.native
  trait ConnectionOAuthResponseParameters extends js.Object {
    var AuthorizationEndpoint: js.UndefOr[HttpsEndpoint]
    var ClientParameters: js.UndefOr[ConnectionOAuthClientResponseParameters]
    var HttpMethod: js.UndefOr[ConnectionOAuthHttpMethod]
    var OAuthHttpParameters: js.UndefOr[ConnectionHttpParameters]
  }

  object ConnectionOAuthResponseParameters {
    @inline
    def apply(
        AuthorizationEndpoint: js.UndefOr[HttpsEndpoint] = js.undefined,
        ClientParameters: js.UndefOr[ConnectionOAuthClientResponseParameters] = js.undefined,
        HttpMethod: js.UndefOr[ConnectionOAuthHttpMethod] = js.undefined,
        OAuthHttpParameters: js.UndefOr[ConnectionHttpParameters] = js.undefined
    ): ConnectionOAuthResponseParameters = {
      val __obj = js.Dynamic.literal()
      AuthorizationEndpoint.foreach(__v => __obj.updateDynamic("AuthorizationEndpoint")(__v.asInstanceOf[js.Any]))
      ClientParameters.foreach(__v => __obj.updateDynamic("ClientParameters")(__v.asInstanceOf[js.Any]))
      HttpMethod.foreach(__v => __obj.updateDynamic("HttpMethod")(__v.asInstanceOf[js.Any]))
      OAuthHttpParameters.foreach(__v => __obj.updateDynamic("OAuthHttpParameters")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ConnectionOAuthResponseParameters]
    }
  }

  /** Additional query string parameter for the connection. You can include up to 100 additional query string parameters per request. Each additional parameter counts towards the event payload size, which cannot exceed 64 KB.
    */
  @js.native
  trait ConnectionQueryStringParameter extends js.Object {
    var IsValueSecret: js.UndefOr[Boolean]
    var Key: js.UndefOr[QueryStringKey]
    var Value: js.UndefOr[QueryStringValue]
  }

  object ConnectionQueryStringParameter {
    @inline
    def apply(
        IsValueSecret: js.UndefOr[Boolean] = js.undefined,
        Key: js.UndefOr[QueryStringKey] = js.undefined,
        Value: js.UndefOr[QueryStringValue] = js.undefined
    ): ConnectionQueryStringParameter = {
      val __obj = js.Dynamic.literal()
      IsValueSecret.foreach(__v => __obj.updateDynamic("IsValueSecret")(__v.asInstanceOf[js.Any]))
      Key.foreach(__v => __obj.updateDynamic("Key")(__v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ConnectionQueryStringParameter]
    }
  }

  @js.native
  sealed trait ConnectionState extends js.Any
  object ConnectionState {
    val CREATING = "CREATING".asInstanceOf[ConnectionState]
    val UPDATING = "UPDATING".asInstanceOf[ConnectionState]
    val DELETING = "DELETING".asInstanceOf[ConnectionState]
    val AUTHORIZED = "AUTHORIZED".asInstanceOf[ConnectionState]
    val DEAUTHORIZED = "DEAUTHORIZED".asInstanceOf[ConnectionState]
    val AUTHORIZING = "AUTHORIZING".asInstanceOf[ConnectionState]
    val DEAUTHORIZING = "DEAUTHORIZING".asInstanceOf[ConnectionState]

    @inline def values = js.Array(CREATING, UPDATING, DELETING, AUTHORIZED, DEAUTHORIZED, AUTHORIZING, DEAUTHORIZING)
  }

  @js.native
  trait CreateApiDestinationRequest extends js.Object {
    var ConnectionArn: ConnectionArn
    var HttpMethod: ApiDestinationHttpMethod
    var InvocationEndpoint: HttpsEndpoint
    var Name: ApiDestinationName
    var Description: js.UndefOr[ApiDestinationDescription]
    var InvocationRateLimitPerSecond: js.UndefOr[ApiDestinationInvocationRateLimitPerSecond]
  }

  object CreateApiDestinationRequest {
    @inline
    def apply(
        ConnectionArn: ConnectionArn,
        HttpMethod: ApiDestinationHttpMethod,
        InvocationEndpoint: HttpsEndpoint,
        Name: ApiDestinationName,
        Description: js.UndefOr[ApiDestinationDescription] = js.undefined,
        InvocationRateLimitPerSecond: js.UndefOr[ApiDestinationInvocationRateLimitPerSecond] = js.undefined
    ): CreateApiDestinationRequest = {
      val __obj = js.Dynamic.literal(
        "ConnectionArn" -> ConnectionArn.asInstanceOf[js.Any],
        "HttpMethod" -> HttpMethod.asInstanceOf[js.Any],
        "InvocationEndpoint" -> InvocationEndpoint.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      InvocationRateLimitPerSecond.foreach(__v => __obj.updateDynamic("InvocationRateLimitPerSecond")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateApiDestinationRequest]
    }
  }

  @js.native
  trait CreateApiDestinationResponse extends js.Object {
    var ApiDestinationArn: js.UndefOr[ApiDestinationArn]
    var ApiDestinationState: js.UndefOr[ApiDestinationState]
    var CreationTime: js.UndefOr[Timestamp]
    var LastModifiedTime: js.UndefOr[Timestamp]
  }

  object CreateApiDestinationResponse {
    @inline
    def apply(
        ApiDestinationArn: js.UndefOr[ApiDestinationArn] = js.undefined,
        ApiDestinationState: js.UndefOr[ApiDestinationState] = js.undefined,
        CreationTime: js.UndefOr[Timestamp] = js.undefined,
        LastModifiedTime: js.UndefOr[Timestamp] = js.undefined
    ): CreateApiDestinationResponse = {
      val __obj = js.Dynamic.literal()
      ApiDestinationArn.foreach(__v => __obj.updateDynamic("ApiDestinationArn")(__v.asInstanceOf[js.Any]))
      ApiDestinationState.foreach(__v => __obj.updateDynamic("ApiDestinationState")(__v.asInstanceOf[js.Any]))
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      LastModifiedTime.foreach(__v => __obj.updateDynamic("LastModifiedTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateApiDestinationResponse]
    }
  }

  @js.native
  trait CreateArchiveRequest extends js.Object {
    var ArchiveName: ArchiveName
    var EventSourceArn: Arn
    var Description: js.UndefOr[ArchiveDescription]
    var EventPattern: js.UndefOr[EventPattern]
    var RetentionDays: js.UndefOr[RetentionDays]
  }

  object CreateArchiveRequest {
    @inline
    def apply(
        ArchiveName: ArchiveName,
        EventSourceArn: Arn,
        Description: js.UndefOr[ArchiveDescription] = js.undefined,
        EventPattern: js.UndefOr[EventPattern] = js.undefined,
        RetentionDays: js.UndefOr[RetentionDays] = js.undefined
    ): CreateArchiveRequest = {
      val __obj = js.Dynamic.literal(
        "ArchiveName" -> ArchiveName.asInstanceOf[js.Any],
        "EventSourceArn" -> EventSourceArn.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      EventPattern.foreach(__v => __obj.updateDynamic("EventPattern")(__v.asInstanceOf[js.Any]))
      RetentionDays.foreach(__v => __obj.updateDynamic("RetentionDays")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateArchiveRequest]
    }
  }

  @js.native
  trait CreateArchiveResponse extends js.Object {
    var ArchiveArn: js.UndefOr[ArchiveArn]
    var CreationTime: js.UndefOr[Timestamp]
    var State: js.UndefOr[ArchiveState]
    var StateReason: js.UndefOr[ArchiveStateReason]
  }

  object CreateArchiveResponse {
    @inline
    def apply(
        ArchiveArn: js.UndefOr[ArchiveArn] = js.undefined,
        CreationTime: js.UndefOr[Timestamp] = js.undefined,
        State: js.UndefOr[ArchiveState] = js.undefined,
        StateReason: js.UndefOr[ArchiveStateReason] = js.undefined
    ): CreateArchiveResponse = {
      val __obj = js.Dynamic.literal()
      ArchiveArn.foreach(__v => __obj.updateDynamic("ArchiveArn")(__v.asInstanceOf[js.Any]))
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      StateReason.foreach(__v => __obj.updateDynamic("StateReason")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateArchiveResponse]
    }
  }

  /** Contains the API key authorization parameters for the connection.
    */
  @js.native
  trait CreateConnectionApiKeyAuthRequestParameters extends js.Object {
    var ApiKeyName: AuthHeaderParameters
    var ApiKeyValue: AuthHeaderParameters
  }

  object CreateConnectionApiKeyAuthRequestParameters {
    @inline
    def apply(
        ApiKeyName: AuthHeaderParameters,
        ApiKeyValue: AuthHeaderParameters
    ): CreateConnectionApiKeyAuthRequestParameters = {
      val __obj = js.Dynamic.literal(
        "ApiKeyName" -> ApiKeyName.asInstanceOf[js.Any],
        "ApiKeyValue" -> ApiKeyValue.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateConnectionApiKeyAuthRequestParameters]
    }
  }

  /** Contains the authorization parameters for the connection.
    */
  @js.native
  trait CreateConnectionAuthRequestParameters extends js.Object {
    var ApiKeyAuthParameters: js.UndefOr[CreateConnectionApiKeyAuthRequestParameters]
    var BasicAuthParameters: js.UndefOr[CreateConnectionBasicAuthRequestParameters]
    var InvocationHttpParameters: js.UndefOr[ConnectionHttpParameters]
    var OAuthParameters: js.UndefOr[CreateConnectionOAuthRequestParameters]
  }

  object CreateConnectionAuthRequestParameters {
    @inline
    def apply(
        ApiKeyAuthParameters: js.UndefOr[CreateConnectionApiKeyAuthRequestParameters] = js.undefined,
        BasicAuthParameters: js.UndefOr[CreateConnectionBasicAuthRequestParameters] = js.undefined,
        InvocationHttpParameters: js.UndefOr[ConnectionHttpParameters] = js.undefined,
        OAuthParameters: js.UndefOr[CreateConnectionOAuthRequestParameters] = js.undefined
    ): CreateConnectionAuthRequestParameters = {
      val __obj = js.Dynamic.literal()
      ApiKeyAuthParameters.foreach(__v => __obj.updateDynamic("ApiKeyAuthParameters")(__v.asInstanceOf[js.Any]))
      BasicAuthParameters.foreach(__v => __obj.updateDynamic("BasicAuthParameters")(__v.asInstanceOf[js.Any]))
      InvocationHttpParameters.foreach(__v => __obj.updateDynamic("InvocationHttpParameters")(__v.asInstanceOf[js.Any]))
      OAuthParameters.foreach(__v => __obj.updateDynamic("OAuthParameters")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateConnectionAuthRequestParameters]
    }
  }

  /** Contains the Basic authorization parameters to use for the connection.
    */
  @js.native
  trait CreateConnectionBasicAuthRequestParameters extends js.Object {
    var Password: AuthHeaderParameters
    var Username: AuthHeaderParameters
  }

  object CreateConnectionBasicAuthRequestParameters {
    @inline
    def apply(
        Password: AuthHeaderParameters,
        Username: AuthHeaderParameters
    ): CreateConnectionBasicAuthRequestParameters = {
      val __obj = js.Dynamic.literal(
        "Password" -> Password.asInstanceOf[js.Any],
        "Username" -> Username.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateConnectionBasicAuthRequestParameters]
    }
  }

  /** Contains the Basic authorization parameters to use for the connection.
    */
  @js.native
  trait CreateConnectionOAuthClientRequestParameters extends js.Object {
    var ClientID: AuthHeaderParameters
    var ClientSecret: AuthHeaderParameters
  }

  object CreateConnectionOAuthClientRequestParameters {
    @inline
    def apply(
        ClientID: AuthHeaderParameters,
        ClientSecret: AuthHeaderParameters
    ): CreateConnectionOAuthClientRequestParameters = {
      val __obj = js.Dynamic.literal(
        "ClientID" -> ClientID.asInstanceOf[js.Any],
        "ClientSecret" -> ClientSecret.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateConnectionOAuthClientRequestParameters]
    }
  }

  /** Contains the OAuth authorization parameters to use for the connection.
    */
  @js.native
  trait CreateConnectionOAuthRequestParameters extends js.Object {
    var AuthorizationEndpoint: HttpsEndpoint
    var ClientParameters: CreateConnectionOAuthClientRequestParameters
    var HttpMethod: ConnectionOAuthHttpMethod
    var OAuthHttpParameters: js.UndefOr[ConnectionHttpParameters]
  }

  object CreateConnectionOAuthRequestParameters {
    @inline
    def apply(
        AuthorizationEndpoint: HttpsEndpoint,
        ClientParameters: CreateConnectionOAuthClientRequestParameters,
        HttpMethod: ConnectionOAuthHttpMethod,
        OAuthHttpParameters: js.UndefOr[ConnectionHttpParameters] = js.undefined
    ): CreateConnectionOAuthRequestParameters = {
      val __obj = js.Dynamic.literal(
        "AuthorizationEndpoint" -> AuthorizationEndpoint.asInstanceOf[js.Any],
        "ClientParameters" -> ClientParameters.asInstanceOf[js.Any],
        "HttpMethod" -> HttpMethod.asInstanceOf[js.Any]
      )

      OAuthHttpParameters.foreach(__v => __obj.updateDynamic("OAuthHttpParameters")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateConnectionOAuthRequestParameters]
    }
  }

  @js.native
  trait CreateConnectionRequest extends js.Object {
    var AuthParameters: CreateConnectionAuthRequestParameters
    var AuthorizationType: ConnectionAuthorizationType
    var Name: ConnectionName
    var Description: js.UndefOr[ConnectionDescription]
  }

  object CreateConnectionRequest {
    @inline
    def apply(
        AuthParameters: CreateConnectionAuthRequestParameters,
        AuthorizationType: ConnectionAuthorizationType,
        Name: ConnectionName,
        Description: js.UndefOr[ConnectionDescription] = js.undefined
    ): CreateConnectionRequest = {
      val __obj = js.Dynamic.literal(
        "AuthParameters" -> AuthParameters.asInstanceOf[js.Any],
        "AuthorizationType" -> AuthorizationType.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateConnectionRequest]
    }
  }

  @js.native
  trait CreateConnectionResponse extends js.Object {
    var ConnectionArn: js.UndefOr[ConnectionArn]
    var ConnectionState: js.UndefOr[ConnectionState]
    var CreationTime: js.UndefOr[Timestamp]
    var LastModifiedTime: js.UndefOr[Timestamp]
  }

  object CreateConnectionResponse {
    @inline
    def apply(
        ConnectionArn: js.UndefOr[ConnectionArn] = js.undefined,
        ConnectionState: js.UndefOr[ConnectionState] = js.undefined,
        CreationTime: js.UndefOr[Timestamp] = js.undefined,
        LastModifiedTime: js.UndefOr[Timestamp] = js.undefined
    ): CreateConnectionResponse = {
      val __obj = js.Dynamic.literal()
      ConnectionArn.foreach(__v => __obj.updateDynamic("ConnectionArn")(__v.asInstanceOf[js.Any]))
      ConnectionState.foreach(__v => __obj.updateDynamic("ConnectionState")(__v.asInstanceOf[js.Any]))
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      LastModifiedTime.foreach(__v => __obj.updateDynamic("LastModifiedTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateConnectionResponse]
    }
  }

  @js.native
  trait CreateEventBusRequest extends js.Object {
    var Name: EventBusName
    var EventSourceName: js.UndefOr[EventSourceName]
    var Tags: js.UndefOr[TagList]
  }

  object CreateEventBusRequest {
    @inline
    def apply(
        Name: EventBusName,
        EventSourceName: js.UndefOr[EventSourceName] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateEventBusRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      EventSourceName.foreach(__v => __obj.updateDynamic("EventSourceName")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateEventBusRequest]
    }
  }

  @js.native
  trait CreateEventBusResponse extends js.Object {
    var EventBusArn: js.UndefOr[String]
  }

  object CreateEventBusResponse {
    @inline
    def apply(
        EventBusArn: js.UndefOr[String] = js.undefined
    ): CreateEventBusResponse = {
      val __obj = js.Dynamic.literal()
      EventBusArn.foreach(__v => __obj.updateDynamic("EventBusArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateEventBusResponse]
    }
  }

  @js.native
  trait CreatePartnerEventSourceRequest extends js.Object {
    var Account: AccountId
    var Name: EventSourceName
  }

  object CreatePartnerEventSourceRequest {
    @inline
    def apply(
        Account: AccountId,
        Name: EventSourceName
    ): CreatePartnerEventSourceRequest = {
      val __obj = js.Dynamic.literal(
        "Account" -> Account.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreatePartnerEventSourceRequest]
    }
  }

  @js.native
  trait CreatePartnerEventSourceResponse extends js.Object {
    var EventSourceArn: js.UndefOr[String]
  }

  object CreatePartnerEventSourceResponse {
    @inline
    def apply(
        EventSourceArn: js.UndefOr[String] = js.undefined
    ): CreatePartnerEventSourceResponse = {
      val __obj = js.Dynamic.literal()
      EventSourceArn.foreach(__v => __obj.updateDynamic("EventSourceArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreatePartnerEventSourceResponse]
    }
  }

  @js.native
  trait DeactivateEventSourceRequest extends js.Object {
    var Name: EventSourceName
  }

  object DeactivateEventSourceRequest {
    @inline
    def apply(
        Name: EventSourceName
    ): DeactivateEventSourceRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeactivateEventSourceRequest]
    }
  }

  /** A <code>DeadLetterConfig</code> object that contains information about a dead-letter queue configuration.
    */
  @js.native
  trait DeadLetterConfig extends js.Object {
    var Arn: js.UndefOr[ResourceArn]
  }

  object DeadLetterConfig {
    @inline
    def apply(
        Arn: js.UndefOr[ResourceArn] = js.undefined
    ): DeadLetterConfig = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeadLetterConfig]
    }
  }

  @js.native
  trait DeauthorizeConnectionRequest extends js.Object {
    var Name: ConnectionName
  }

  object DeauthorizeConnectionRequest {
    @inline
    def apply(
        Name: ConnectionName
    ): DeauthorizeConnectionRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeauthorizeConnectionRequest]
    }
  }

  @js.native
  trait DeauthorizeConnectionResponse extends js.Object {
    var ConnectionArn: js.UndefOr[ConnectionArn]
    var ConnectionState: js.UndefOr[ConnectionState]
    var CreationTime: js.UndefOr[Timestamp]
    var LastAuthorizedTime: js.UndefOr[Timestamp]
    var LastModifiedTime: js.UndefOr[Timestamp]
  }

  object DeauthorizeConnectionResponse {
    @inline
    def apply(
        ConnectionArn: js.UndefOr[ConnectionArn] = js.undefined,
        ConnectionState: js.UndefOr[ConnectionState] = js.undefined,
        CreationTime: js.UndefOr[Timestamp] = js.undefined,
        LastAuthorizedTime: js.UndefOr[Timestamp] = js.undefined,
        LastModifiedTime: js.UndefOr[Timestamp] = js.undefined
    ): DeauthorizeConnectionResponse = {
      val __obj = js.Dynamic.literal()
      ConnectionArn.foreach(__v => __obj.updateDynamic("ConnectionArn")(__v.asInstanceOf[js.Any]))
      ConnectionState.foreach(__v => __obj.updateDynamic("ConnectionState")(__v.asInstanceOf[js.Any]))
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      LastAuthorizedTime.foreach(__v => __obj.updateDynamic("LastAuthorizedTime")(__v.asInstanceOf[js.Any]))
      LastModifiedTime.foreach(__v => __obj.updateDynamic("LastModifiedTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeauthorizeConnectionResponse]
    }
  }

  @js.native
  trait DeleteApiDestinationRequest extends js.Object {
    var Name: ApiDestinationName
  }

  object DeleteApiDestinationRequest {
    @inline
    def apply(
        Name: ApiDestinationName
    ): DeleteApiDestinationRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteApiDestinationRequest]
    }
  }

  @js.native
  trait DeleteApiDestinationResponse extends js.Object

  object DeleteApiDestinationResponse {
    @inline
    def apply(): DeleteApiDestinationResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteApiDestinationResponse]
    }
  }

  @js.native
  trait DeleteArchiveRequest extends js.Object {
    var ArchiveName: ArchiveName
  }

  object DeleteArchiveRequest {
    @inline
    def apply(
        ArchiveName: ArchiveName
    ): DeleteArchiveRequest = {
      val __obj = js.Dynamic.literal(
        "ArchiveName" -> ArchiveName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteArchiveRequest]
    }
  }

  @js.native
  trait DeleteArchiveResponse extends js.Object

  object DeleteArchiveResponse {
    @inline
    def apply(): DeleteArchiveResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteArchiveResponse]
    }
  }

  @js.native
  trait DeleteConnectionRequest extends js.Object {
    var Name: ConnectionName
  }

  object DeleteConnectionRequest {
    @inline
    def apply(
        Name: ConnectionName
    ): DeleteConnectionRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteConnectionRequest]
    }
  }

  @js.native
  trait DeleteConnectionResponse extends js.Object {
    var ConnectionArn: js.UndefOr[ConnectionArn]
    var ConnectionState: js.UndefOr[ConnectionState]
    var CreationTime: js.UndefOr[Timestamp]
    var LastAuthorizedTime: js.UndefOr[Timestamp]
    var LastModifiedTime: js.UndefOr[Timestamp]
  }

  object DeleteConnectionResponse {
    @inline
    def apply(
        ConnectionArn: js.UndefOr[ConnectionArn] = js.undefined,
        ConnectionState: js.UndefOr[ConnectionState] = js.undefined,
        CreationTime: js.UndefOr[Timestamp] = js.undefined,
        LastAuthorizedTime: js.UndefOr[Timestamp] = js.undefined,
        LastModifiedTime: js.UndefOr[Timestamp] = js.undefined
    ): DeleteConnectionResponse = {
      val __obj = js.Dynamic.literal()
      ConnectionArn.foreach(__v => __obj.updateDynamic("ConnectionArn")(__v.asInstanceOf[js.Any]))
      ConnectionState.foreach(__v => __obj.updateDynamic("ConnectionState")(__v.asInstanceOf[js.Any]))
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      LastAuthorizedTime.foreach(__v => __obj.updateDynamic("LastAuthorizedTime")(__v.asInstanceOf[js.Any]))
      LastModifiedTime.foreach(__v => __obj.updateDynamic("LastModifiedTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteConnectionResponse]
    }
  }

  @js.native
  trait DeleteEventBusRequest extends js.Object {
    var Name: EventBusName
  }

  object DeleteEventBusRequest {
    @inline
    def apply(
        Name: EventBusName
    ): DeleteEventBusRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteEventBusRequest]
    }
  }

  @js.native
  trait DeletePartnerEventSourceRequest extends js.Object {
    var Account: AccountId
    var Name: EventSourceName
  }

  object DeletePartnerEventSourceRequest {
    @inline
    def apply(
        Account: AccountId,
        Name: EventSourceName
    ): DeletePartnerEventSourceRequest = {
      val __obj = js.Dynamic.literal(
        "Account" -> Account.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeletePartnerEventSourceRequest]
    }
  }

  @js.native
  trait DeleteRuleRequest extends js.Object {
    var Name: RuleName
    var EventBusName: js.UndefOr[EventBusNameOrArn]
    var Force: js.UndefOr[Boolean]
  }

  object DeleteRuleRequest {
    @inline
    def apply(
        Name: RuleName,
        EventBusName: js.UndefOr[EventBusNameOrArn] = js.undefined,
        Force: js.UndefOr[Boolean] = js.undefined
    ): DeleteRuleRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      EventBusName.foreach(__v => __obj.updateDynamic("EventBusName")(__v.asInstanceOf[js.Any]))
      Force.foreach(__v => __obj.updateDynamic("Force")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteRuleRequest]
    }
  }

  @js.native
  trait DescribeApiDestinationRequest extends js.Object {
    var Name: ApiDestinationName
  }

  object DescribeApiDestinationRequest {
    @inline
    def apply(
        Name: ApiDestinationName
    ): DescribeApiDestinationRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeApiDestinationRequest]
    }
  }

  @js.native
  trait DescribeApiDestinationResponse extends js.Object {
    var ApiDestinationArn: js.UndefOr[ApiDestinationArn]
    var ApiDestinationState: js.UndefOr[ApiDestinationState]
    var ConnectionArn: js.UndefOr[ConnectionArn]
    var CreationTime: js.UndefOr[Timestamp]
    var Description: js.UndefOr[ApiDestinationDescription]
    var HttpMethod: js.UndefOr[ApiDestinationHttpMethod]
    var InvocationEndpoint: js.UndefOr[HttpsEndpoint]
    var InvocationRateLimitPerSecond: js.UndefOr[ApiDestinationInvocationRateLimitPerSecond]
    var LastModifiedTime: js.UndefOr[Timestamp]
    var Name: js.UndefOr[ApiDestinationName]
  }

  object DescribeApiDestinationResponse {
    @inline
    def apply(
        ApiDestinationArn: js.UndefOr[ApiDestinationArn] = js.undefined,
        ApiDestinationState: js.UndefOr[ApiDestinationState] = js.undefined,
        ConnectionArn: js.UndefOr[ConnectionArn] = js.undefined,
        CreationTime: js.UndefOr[Timestamp] = js.undefined,
        Description: js.UndefOr[ApiDestinationDescription] = js.undefined,
        HttpMethod: js.UndefOr[ApiDestinationHttpMethod] = js.undefined,
        InvocationEndpoint: js.UndefOr[HttpsEndpoint] = js.undefined,
        InvocationRateLimitPerSecond: js.UndefOr[ApiDestinationInvocationRateLimitPerSecond] = js.undefined,
        LastModifiedTime: js.UndefOr[Timestamp] = js.undefined,
        Name: js.UndefOr[ApiDestinationName] = js.undefined
    ): DescribeApiDestinationResponse = {
      val __obj = js.Dynamic.literal()
      ApiDestinationArn.foreach(__v => __obj.updateDynamic("ApiDestinationArn")(__v.asInstanceOf[js.Any]))
      ApiDestinationState.foreach(__v => __obj.updateDynamic("ApiDestinationState")(__v.asInstanceOf[js.Any]))
      ConnectionArn.foreach(__v => __obj.updateDynamic("ConnectionArn")(__v.asInstanceOf[js.Any]))
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      HttpMethod.foreach(__v => __obj.updateDynamic("HttpMethod")(__v.asInstanceOf[js.Any]))
      InvocationEndpoint.foreach(__v => __obj.updateDynamic("InvocationEndpoint")(__v.asInstanceOf[js.Any]))
      InvocationRateLimitPerSecond.foreach(__v => __obj.updateDynamic("InvocationRateLimitPerSecond")(__v.asInstanceOf[js.Any]))
      LastModifiedTime.foreach(__v => __obj.updateDynamic("LastModifiedTime")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeApiDestinationResponse]
    }
  }

  @js.native
  trait DescribeArchiveRequest extends js.Object {
    var ArchiveName: ArchiveName
  }

  object DescribeArchiveRequest {
    @inline
    def apply(
        ArchiveName: ArchiveName
    ): DescribeArchiveRequest = {
      val __obj = js.Dynamic.literal(
        "ArchiveName" -> ArchiveName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeArchiveRequest]
    }
  }

  @js.native
  trait DescribeArchiveResponse extends js.Object {
    var ArchiveArn: js.UndefOr[ArchiveArn]
    var ArchiveName: js.UndefOr[ArchiveName]
    var CreationTime: js.UndefOr[Timestamp]
    var Description: js.UndefOr[ArchiveDescription]
    var EventCount: js.UndefOr[Double]
    var EventPattern: js.UndefOr[EventPattern]
    var EventSourceArn: js.UndefOr[Arn]
    var RetentionDays: js.UndefOr[RetentionDays]
    var SizeBytes: js.UndefOr[Double]
    var State: js.UndefOr[ArchiveState]
    var StateReason: js.UndefOr[ArchiveStateReason]
  }

  object DescribeArchiveResponse {
    @inline
    def apply(
        ArchiveArn: js.UndefOr[ArchiveArn] = js.undefined,
        ArchiveName: js.UndefOr[ArchiveName] = js.undefined,
        CreationTime: js.UndefOr[Timestamp] = js.undefined,
        Description: js.UndefOr[ArchiveDescription] = js.undefined,
        EventCount: js.UndefOr[Double] = js.undefined,
        EventPattern: js.UndefOr[EventPattern] = js.undefined,
        EventSourceArn: js.UndefOr[Arn] = js.undefined,
        RetentionDays: js.UndefOr[RetentionDays] = js.undefined,
        SizeBytes: js.UndefOr[Double] = js.undefined,
        State: js.UndefOr[ArchiveState] = js.undefined,
        StateReason: js.UndefOr[ArchiveStateReason] = js.undefined
    ): DescribeArchiveResponse = {
      val __obj = js.Dynamic.literal()
      ArchiveArn.foreach(__v => __obj.updateDynamic("ArchiveArn")(__v.asInstanceOf[js.Any]))
      ArchiveName.foreach(__v => __obj.updateDynamic("ArchiveName")(__v.asInstanceOf[js.Any]))
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      EventCount.foreach(__v => __obj.updateDynamic("EventCount")(__v.asInstanceOf[js.Any]))
      EventPattern.foreach(__v => __obj.updateDynamic("EventPattern")(__v.asInstanceOf[js.Any]))
      EventSourceArn.foreach(__v => __obj.updateDynamic("EventSourceArn")(__v.asInstanceOf[js.Any]))
      RetentionDays.foreach(__v => __obj.updateDynamic("RetentionDays")(__v.asInstanceOf[js.Any]))
      SizeBytes.foreach(__v => __obj.updateDynamic("SizeBytes")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      StateReason.foreach(__v => __obj.updateDynamic("StateReason")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeArchiveResponse]
    }
  }

  @js.native
  trait DescribeConnectionRequest extends js.Object {
    var Name: ConnectionName
  }

  object DescribeConnectionRequest {
    @inline
    def apply(
        Name: ConnectionName
    ): DescribeConnectionRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeConnectionRequest]
    }
  }

  @js.native
  trait DescribeConnectionResponse extends js.Object {
    var AuthParameters: js.UndefOr[ConnectionAuthResponseParameters]
    var AuthorizationType: js.UndefOr[ConnectionAuthorizationType]
    var ConnectionArn: js.UndefOr[ConnectionArn]
    var ConnectionState: js.UndefOr[ConnectionState]
    var CreationTime: js.UndefOr[Timestamp]
    var Description: js.UndefOr[ConnectionDescription]
    var LastAuthorizedTime: js.UndefOr[Timestamp]
    var LastModifiedTime: js.UndefOr[Timestamp]
    var Name: js.UndefOr[ConnectionName]
    var SecretArn: js.UndefOr[SecretsManagerSecretArn]
    var StateReason: js.UndefOr[ConnectionStateReason]
  }

  object DescribeConnectionResponse {
    @inline
    def apply(
        AuthParameters: js.UndefOr[ConnectionAuthResponseParameters] = js.undefined,
        AuthorizationType: js.UndefOr[ConnectionAuthorizationType] = js.undefined,
        ConnectionArn: js.UndefOr[ConnectionArn] = js.undefined,
        ConnectionState: js.UndefOr[ConnectionState] = js.undefined,
        CreationTime: js.UndefOr[Timestamp] = js.undefined,
        Description: js.UndefOr[ConnectionDescription] = js.undefined,
        LastAuthorizedTime: js.UndefOr[Timestamp] = js.undefined,
        LastModifiedTime: js.UndefOr[Timestamp] = js.undefined,
        Name: js.UndefOr[ConnectionName] = js.undefined,
        SecretArn: js.UndefOr[SecretsManagerSecretArn] = js.undefined,
        StateReason: js.UndefOr[ConnectionStateReason] = js.undefined
    ): DescribeConnectionResponse = {
      val __obj = js.Dynamic.literal()
      AuthParameters.foreach(__v => __obj.updateDynamic("AuthParameters")(__v.asInstanceOf[js.Any]))
      AuthorizationType.foreach(__v => __obj.updateDynamic("AuthorizationType")(__v.asInstanceOf[js.Any]))
      ConnectionArn.foreach(__v => __obj.updateDynamic("ConnectionArn")(__v.asInstanceOf[js.Any]))
      ConnectionState.foreach(__v => __obj.updateDynamic("ConnectionState")(__v.asInstanceOf[js.Any]))
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      LastAuthorizedTime.foreach(__v => __obj.updateDynamic("LastAuthorizedTime")(__v.asInstanceOf[js.Any]))
      LastModifiedTime.foreach(__v => __obj.updateDynamic("LastModifiedTime")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      SecretArn.foreach(__v => __obj.updateDynamic("SecretArn")(__v.asInstanceOf[js.Any]))
      StateReason.foreach(__v => __obj.updateDynamic("StateReason")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeConnectionResponse]
    }
  }

  @js.native
  trait DescribeEventBusRequest extends js.Object {
    var Name: js.UndefOr[EventBusNameOrArn]
  }

  object DescribeEventBusRequest {
    @inline
    def apply(
        Name: js.UndefOr[EventBusNameOrArn] = js.undefined
    ): DescribeEventBusRequest = {
      val __obj = js.Dynamic.literal()
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeEventBusRequest]
    }
  }

  @js.native
  trait DescribeEventBusResponse extends js.Object {
    var Arn: js.UndefOr[String]
    var Name: js.UndefOr[String]
    var Policy: js.UndefOr[String]
  }

  object DescribeEventBusResponse {
    @inline
    def apply(
        Arn: js.UndefOr[String] = js.undefined,
        Name: js.UndefOr[String] = js.undefined,
        Policy: js.UndefOr[String] = js.undefined
    ): DescribeEventBusResponse = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Policy.foreach(__v => __obj.updateDynamic("Policy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeEventBusResponse]
    }
  }

  @js.native
  trait DescribeEventSourceRequest extends js.Object {
    var Name: EventSourceName
  }

  object DescribeEventSourceRequest {
    @inline
    def apply(
        Name: EventSourceName
    ): DescribeEventSourceRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeEventSourceRequest]
    }
  }

  @js.native
  trait DescribeEventSourceResponse extends js.Object {
    var Arn: js.UndefOr[String]
    var CreatedBy: js.UndefOr[String]
    var CreationTime: js.UndefOr[Timestamp]
    var ExpirationTime: js.UndefOr[Timestamp]
    var Name: js.UndefOr[String]
    var State: js.UndefOr[EventSourceState]
  }

  object DescribeEventSourceResponse {
    @inline
    def apply(
        Arn: js.UndefOr[String] = js.undefined,
        CreatedBy: js.UndefOr[String] = js.undefined,
        CreationTime: js.UndefOr[Timestamp] = js.undefined,
        ExpirationTime: js.UndefOr[Timestamp] = js.undefined,
        Name: js.UndefOr[String] = js.undefined,
        State: js.UndefOr[EventSourceState] = js.undefined
    ): DescribeEventSourceResponse = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      CreatedBy.foreach(__v => __obj.updateDynamic("CreatedBy")(__v.asInstanceOf[js.Any]))
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      ExpirationTime.foreach(__v => __obj.updateDynamic("ExpirationTime")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeEventSourceResponse]
    }
  }

  @js.native
  trait DescribePartnerEventSourceRequest extends js.Object {
    var Name: EventSourceName
  }

  object DescribePartnerEventSourceRequest {
    @inline
    def apply(
        Name: EventSourceName
    ): DescribePartnerEventSourceRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribePartnerEventSourceRequest]
    }
  }

  @js.native
  trait DescribePartnerEventSourceResponse extends js.Object {
    var Arn: js.UndefOr[String]
    var Name: js.UndefOr[String]
  }

  object DescribePartnerEventSourceResponse {
    @inline
    def apply(
        Arn: js.UndefOr[String] = js.undefined,
        Name: js.UndefOr[String] = js.undefined
    ): DescribePartnerEventSourceResponse = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribePartnerEventSourceResponse]
    }
  }

  @js.native
  trait DescribeReplayRequest extends js.Object {
    var ReplayName: ReplayName
  }

  object DescribeReplayRequest {
    @inline
    def apply(
        ReplayName: ReplayName
    ): DescribeReplayRequest = {
      val __obj = js.Dynamic.literal(
        "ReplayName" -> ReplayName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeReplayRequest]
    }
  }

  @js.native
  trait DescribeReplayResponse extends js.Object {
    var Description: js.UndefOr[ReplayDescription]
    var Destination: js.UndefOr[ReplayDestination]
    var EventEndTime: js.UndefOr[Timestamp]
    var EventLastReplayedTime: js.UndefOr[Timestamp]
    var EventSourceArn: js.UndefOr[Arn]
    var EventStartTime: js.UndefOr[Timestamp]
    var ReplayArn: js.UndefOr[ReplayArn]
    var ReplayEndTime: js.UndefOr[Timestamp]
    var ReplayName: js.UndefOr[ReplayName]
    var ReplayStartTime: js.UndefOr[Timestamp]
    var State: js.UndefOr[ReplayState]
    var StateReason: js.UndefOr[ReplayStateReason]
  }

  object DescribeReplayResponse {
    @inline
    def apply(
        Description: js.UndefOr[ReplayDescription] = js.undefined,
        Destination: js.UndefOr[ReplayDestination] = js.undefined,
        EventEndTime: js.UndefOr[Timestamp] = js.undefined,
        EventLastReplayedTime: js.UndefOr[Timestamp] = js.undefined,
        EventSourceArn: js.UndefOr[Arn] = js.undefined,
        EventStartTime: js.UndefOr[Timestamp] = js.undefined,
        ReplayArn: js.UndefOr[ReplayArn] = js.undefined,
        ReplayEndTime: js.UndefOr[Timestamp] = js.undefined,
        ReplayName: js.UndefOr[ReplayName] = js.undefined,
        ReplayStartTime: js.UndefOr[Timestamp] = js.undefined,
        State: js.UndefOr[ReplayState] = js.undefined,
        StateReason: js.UndefOr[ReplayStateReason] = js.undefined
    ): DescribeReplayResponse = {
      val __obj = js.Dynamic.literal()
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Destination.foreach(__v => __obj.updateDynamic("Destination")(__v.asInstanceOf[js.Any]))
      EventEndTime.foreach(__v => __obj.updateDynamic("EventEndTime")(__v.asInstanceOf[js.Any]))
      EventLastReplayedTime.foreach(__v => __obj.updateDynamic("EventLastReplayedTime")(__v.asInstanceOf[js.Any]))
      EventSourceArn.foreach(__v => __obj.updateDynamic("EventSourceArn")(__v.asInstanceOf[js.Any]))
      EventStartTime.foreach(__v => __obj.updateDynamic("EventStartTime")(__v.asInstanceOf[js.Any]))
      ReplayArn.foreach(__v => __obj.updateDynamic("ReplayArn")(__v.asInstanceOf[js.Any]))
      ReplayEndTime.foreach(__v => __obj.updateDynamic("ReplayEndTime")(__v.asInstanceOf[js.Any]))
      ReplayName.foreach(__v => __obj.updateDynamic("ReplayName")(__v.asInstanceOf[js.Any]))
      ReplayStartTime.foreach(__v => __obj.updateDynamic("ReplayStartTime")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      StateReason.foreach(__v => __obj.updateDynamic("StateReason")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeReplayResponse]
    }
  }

  @js.native
  trait DescribeRuleRequest extends js.Object {
    var Name: RuleName
    var EventBusName: js.UndefOr[EventBusNameOrArn]
  }

  object DescribeRuleRequest {
    @inline
    def apply(
        Name: RuleName,
        EventBusName: js.UndefOr[EventBusNameOrArn] = js.undefined
    ): DescribeRuleRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      EventBusName.foreach(__v => __obj.updateDynamic("EventBusName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeRuleRequest]
    }
  }

  @js.native
  trait DescribeRuleResponse extends js.Object {
    var Arn: js.UndefOr[RuleArn]
    var CreatedBy: js.UndefOr[CreatedBy]
    var Description: js.UndefOr[RuleDescription]
    var EventBusName: js.UndefOr[EventBusName]
    var EventPattern: js.UndefOr[EventPattern]
    var ManagedBy: js.UndefOr[ManagedBy]
    var Name: js.UndefOr[RuleName]
    var RoleArn: js.UndefOr[RoleArn]
    var ScheduleExpression: js.UndefOr[ScheduleExpression]
    var State: js.UndefOr[RuleState]
  }

  object DescribeRuleResponse {
    @inline
    def apply(
        Arn: js.UndefOr[RuleArn] = js.undefined,
        CreatedBy: js.UndefOr[CreatedBy] = js.undefined,
        Description: js.UndefOr[RuleDescription] = js.undefined,
        EventBusName: js.UndefOr[EventBusName] = js.undefined,
        EventPattern: js.UndefOr[EventPattern] = js.undefined,
        ManagedBy: js.UndefOr[ManagedBy] = js.undefined,
        Name: js.UndefOr[RuleName] = js.undefined,
        RoleArn: js.UndefOr[RoleArn] = js.undefined,
        ScheduleExpression: js.UndefOr[ScheduleExpression] = js.undefined,
        State: js.UndefOr[RuleState] = js.undefined
    ): DescribeRuleResponse = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      CreatedBy.foreach(__v => __obj.updateDynamic("CreatedBy")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      EventBusName.foreach(__v => __obj.updateDynamic("EventBusName")(__v.asInstanceOf[js.Any]))
      EventPattern.foreach(__v => __obj.updateDynamic("EventPattern")(__v.asInstanceOf[js.Any]))
      ManagedBy.foreach(__v => __obj.updateDynamic("ManagedBy")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      RoleArn.foreach(__v => __obj.updateDynamic("RoleArn")(__v.asInstanceOf[js.Any]))
      ScheduleExpression.foreach(__v => __obj.updateDynamic("ScheduleExpression")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeRuleResponse]
    }
  }

  @js.native
  trait DisableRuleRequest extends js.Object {
    var Name: RuleName
    var EventBusName: js.UndefOr[EventBusNameOrArn]
  }

  object DisableRuleRequest {
    @inline
    def apply(
        Name: RuleName,
        EventBusName: js.UndefOr[EventBusNameOrArn] = js.undefined
    ): DisableRuleRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      EventBusName.foreach(__v => __obj.updateDynamic("EventBusName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DisableRuleRequest]
    }
  }

  /** The custom parameters to be used when the target is an Amazon ECS task.
    */
  @js.native
  trait EcsParameters extends js.Object {
    var TaskDefinitionArn: Arn
    var Group: js.UndefOr[String]
    var LaunchType: js.UndefOr[LaunchType]
    var NetworkConfiguration: js.UndefOr[NetworkConfiguration]
    var PlatformVersion: js.UndefOr[String]
    var TaskCount: js.UndefOr[LimitMin1]
  }

  object EcsParameters {
    @inline
    def apply(
        TaskDefinitionArn: Arn,
        Group: js.UndefOr[String] = js.undefined,
        LaunchType: js.UndefOr[LaunchType] = js.undefined,
        NetworkConfiguration: js.UndefOr[NetworkConfiguration] = js.undefined,
        PlatformVersion: js.UndefOr[String] = js.undefined,
        TaskCount: js.UndefOr[LimitMin1] = js.undefined
    ): EcsParameters = {
      val __obj = js.Dynamic.literal(
        "TaskDefinitionArn" -> TaskDefinitionArn.asInstanceOf[js.Any]
      )

      Group.foreach(__v => __obj.updateDynamic("Group")(__v.asInstanceOf[js.Any]))
      LaunchType.foreach(__v => __obj.updateDynamic("LaunchType")(__v.asInstanceOf[js.Any]))
      NetworkConfiguration.foreach(__v => __obj.updateDynamic("NetworkConfiguration")(__v.asInstanceOf[js.Any]))
      PlatformVersion.foreach(__v => __obj.updateDynamic("PlatformVersion")(__v.asInstanceOf[js.Any]))
      TaskCount.foreach(__v => __obj.updateDynamic("TaskCount")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EcsParameters]
    }
  }

  @js.native
  trait EnableRuleRequest extends js.Object {
    var Name: RuleName
    var EventBusName: js.UndefOr[EventBusNameOrArn]
  }

  object EnableRuleRequest {
    @inline
    def apply(
        Name: RuleName,
        EventBusName: js.UndefOr[EventBusNameOrArn] = js.undefined
    ): EnableRuleRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      EventBusName.foreach(__v => __obj.updateDynamic("EventBusName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EnableRuleRequest]
    }
  }

  /** An event bus receives events from a source and routes them to rules associated with that event bus. Your account's default event bus receives rules from AWS services. A custom event bus can receive rules from AWS services as well as your custom applications and services. A partner event bus receives events from an event source created by an SaaS partner. These events come from the partners services or applications.
    */
  @js.native
  trait EventBus extends js.Object {
    var Arn: js.UndefOr[String]
    var Name: js.UndefOr[String]
    var Policy: js.UndefOr[String]
  }

  object EventBus {
    @inline
    def apply(
        Arn: js.UndefOr[String] = js.undefined,
        Name: js.UndefOr[String] = js.undefined,
        Policy: js.UndefOr[String] = js.undefined
    ): EventBus = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Policy.foreach(__v => __obj.updateDynamic("Policy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EventBus]
    }
  }

  /** A partner event source is created by an SaaS partner. If a customer creates a partner event bus that matches this event source, that AWS account can receive events from the partner's applications or services.
    */
  @js.native
  trait EventSource extends js.Object {
    var Arn: js.UndefOr[String]
    var CreatedBy: js.UndefOr[String]
    var CreationTime: js.UndefOr[Timestamp]
    var ExpirationTime: js.UndefOr[Timestamp]
    var Name: js.UndefOr[String]
    var State: js.UndefOr[EventSourceState]
  }

  object EventSource {
    @inline
    def apply(
        Arn: js.UndefOr[String] = js.undefined,
        CreatedBy: js.UndefOr[String] = js.undefined,
        CreationTime: js.UndefOr[Timestamp] = js.undefined,
        ExpirationTime: js.UndefOr[Timestamp] = js.undefined,
        Name: js.UndefOr[String] = js.undefined,
        State: js.UndefOr[EventSourceState] = js.undefined
    ): EventSource = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      CreatedBy.foreach(__v => __obj.updateDynamic("CreatedBy")(__v.asInstanceOf[js.Any]))
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      ExpirationTime.foreach(__v => __obj.updateDynamic("ExpirationTime")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EventSource]
    }
  }

  @js.native
  sealed trait EventSourceState extends js.Any
  object EventSourceState {
    val PENDING = "PENDING".asInstanceOf[EventSourceState]
    val ACTIVE = "ACTIVE".asInstanceOf[EventSourceState]
    val DELETED = "DELETED".asInstanceOf[EventSourceState]

    @inline def values = js.Array(PENDING, ACTIVE, DELETED)
  }

  /** These are custom parameter to be used when the target is an API Gateway REST APIs or EventBridge ApiDestinations. In the latter case, these are merged with any InvocationParameters specified on the Connection, with any values from the Connection taking precedence.
    */
  @js.native
  trait HttpParameters extends js.Object {
    var HeaderParameters: js.UndefOr[HeaderParametersMap]
    var PathParameterValues: js.UndefOr[PathParameterList]
    var QueryStringParameters: js.UndefOr[QueryStringParametersMap]
  }

  object HttpParameters {
    @inline
    def apply(
        HeaderParameters: js.UndefOr[HeaderParametersMap] = js.undefined,
        PathParameterValues: js.UndefOr[PathParameterList] = js.undefined,
        QueryStringParameters: js.UndefOr[QueryStringParametersMap] = js.undefined
    ): HttpParameters = {
      val __obj = js.Dynamic.literal()
      HeaderParameters.foreach(__v => __obj.updateDynamic("HeaderParameters")(__v.asInstanceOf[js.Any]))
      PathParameterValues.foreach(__v => __obj.updateDynamic("PathParameterValues")(__v.asInstanceOf[js.Any]))
      QueryStringParameters.foreach(__v => __obj.updateDynamic("QueryStringParameters")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HttpParameters]
    }
  }

  /** Contains the parameters needed for you to provide custom input to a target based on one or more pieces of data extracted from the event.
    */
  @js.native
  trait InputTransformer extends js.Object {
    var InputTemplate: TransformerInput
    var InputPathsMap: js.UndefOr[TransformerPaths]
  }

  object InputTransformer {
    @inline
    def apply(
        InputTemplate: TransformerInput,
        InputPathsMap: js.UndefOr[TransformerPaths] = js.undefined
    ): InputTransformer = {
      val __obj = js.Dynamic.literal(
        "InputTemplate" -> InputTemplate.asInstanceOf[js.Any]
      )

      InputPathsMap.foreach(__v => __obj.updateDynamic("InputPathsMap")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InputTransformer]
    }
  }

  /** This object enables you to specify a JSON path to extract from the event and use as the partition key for the Amazon Kinesis data stream, so that you can control the shard to which the event goes. If you do not include this parameter, the default is to use the <code>eventId</code> as the partition key.
    */
  @js.native
  trait KinesisParameters extends js.Object {
    var PartitionKeyPath: TargetPartitionKeyPath
  }

  object KinesisParameters {
    @inline
    def apply(
        PartitionKeyPath: TargetPartitionKeyPath
    ): KinesisParameters = {
      val __obj = js.Dynamic.literal(
        "PartitionKeyPath" -> PartitionKeyPath.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[KinesisParameters]
    }
  }

  @js.native
  sealed trait LaunchType extends js.Any
  object LaunchType {
    val EC2 = "EC2".asInstanceOf[LaunchType]
    val FARGATE = "FARGATE".asInstanceOf[LaunchType]

    @inline def values = js.Array(EC2, FARGATE)
  }

  @js.native
  trait ListApiDestinationsRequest extends js.Object {
    var ConnectionArn: js.UndefOr[ConnectionArn]
    var Limit: js.UndefOr[LimitMax100]
    var NamePrefix: js.UndefOr[ApiDestinationName]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListApiDestinationsRequest {
    @inline
    def apply(
        ConnectionArn: js.UndefOr[ConnectionArn] = js.undefined,
        Limit: js.UndefOr[LimitMax100] = js.undefined,
        NamePrefix: js.UndefOr[ApiDestinationName] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListApiDestinationsRequest = {
      val __obj = js.Dynamic.literal()
      ConnectionArn.foreach(__v => __obj.updateDynamic("ConnectionArn")(__v.asInstanceOf[js.Any]))
      Limit.foreach(__v => __obj.updateDynamic("Limit")(__v.asInstanceOf[js.Any]))
      NamePrefix.foreach(__v => __obj.updateDynamic("NamePrefix")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListApiDestinationsRequest]
    }
  }

  @js.native
  trait ListApiDestinationsResponse extends js.Object {
    var ApiDestinations: js.UndefOr[ApiDestinationResponseList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListApiDestinationsResponse {
    @inline
    def apply(
        ApiDestinations: js.UndefOr[ApiDestinationResponseList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListApiDestinationsResponse = {
      val __obj = js.Dynamic.literal()
      ApiDestinations.foreach(__v => __obj.updateDynamic("ApiDestinations")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListApiDestinationsResponse]
    }
  }

  @js.native
  trait ListArchivesRequest extends js.Object {
    var EventSourceArn: js.UndefOr[Arn]
    var Limit: js.UndefOr[LimitMax100]
    var NamePrefix: js.UndefOr[ArchiveName]
    var NextToken: js.UndefOr[NextToken]
    var State: js.UndefOr[ArchiveState]
  }

  object ListArchivesRequest {
    @inline
    def apply(
        EventSourceArn: js.UndefOr[Arn] = js.undefined,
        Limit: js.UndefOr[LimitMax100] = js.undefined,
        NamePrefix: js.UndefOr[ArchiveName] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        State: js.UndefOr[ArchiveState] = js.undefined
    ): ListArchivesRequest = {
      val __obj = js.Dynamic.literal()
      EventSourceArn.foreach(__v => __obj.updateDynamic("EventSourceArn")(__v.asInstanceOf[js.Any]))
      Limit.foreach(__v => __obj.updateDynamic("Limit")(__v.asInstanceOf[js.Any]))
      NamePrefix.foreach(__v => __obj.updateDynamic("NamePrefix")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListArchivesRequest]
    }
  }

  @js.native
  trait ListArchivesResponse extends js.Object {
    var Archives: js.UndefOr[ArchiveResponseList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListArchivesResponse {
    @inline
    def apply(
        Archives: js.UndefOr[ArchiveResponseList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListArchivesResponse = {
      val __obj = js.Dynamic.literal()
      Archives.foreach(__v => __obj.updateDynamic("Archives")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListArchivesResponse]
    }
  }

  @js.native
  trait ListConnectionsRequest extends js.Object {
    var ConnectionState: js.UndefOr[ConnectionState]
    var Limit: js.UndefOr[LimitMax100]
    var NamePrefix: js.UndefOr[ConnectionName]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListConnectionsRequest {
    @inline
    def apply(
        ConnectionState: js.UndefOr[ConnectionState] = js.undefined,
        Limit: js.UndefOr[LimitMax100] = js.undefined,
        NamePrefix: js.UndefOr[ConnectionName] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListConnectionsRequest = {
      val __obj = js.Dynamic.literal()
      ConnectionState.foreach(__v => __obj.updateDynamic("ConnectionState")(__v.asInstanceOf[js.Any]))
      Limit.foreach(__v => __obj.updateDynamic("Limit")(__v.asInstanceOf[js.Any]))
      NamePrefix.foreach(__v => __obj.updateDynamic("NamePrefix")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListConnectionsRequest]
    }
  }

  @js.native
  trait ListConnectionsResponse extends js.Object {
    var Connections: js.UndefOr[ConnectionResponseList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListConnectionsResponse {
    @inline
    def apply(
        Connections: js.UndefOr[ConnectionResponseList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListConnectionsResponse = {
      val __obj = js.Dynamic.literal()
      Connections.foreach(__v => __obj.updateDynamic("Connections")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListConnectionsResponse]
    }
  }

  @js.native
  trait ListEventBusesRequest extends js.Object {
    var Limit: js.UndefOr[LimitMax100]
    var NamePrefix: js.UndefOr[EventBusName]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListEventBusesRequest {
    @inline
    def apply(
        Limit: js.UndefOr[LimitMax100] = js.undefined,
        NamePrefix: js.UndefOr[EventBusName] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListEventBusesRequest = {
      val __obj = js.Dynamic.literal()
      Limit.foreach(__v => __obj.updateDynamic("Limit")(__v.asInstanceOf[js.Any]))
      NamePrefix.foreach(__v => __obj.updateDynamic("NamePrefix")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListEventBusesRequest]
    }
  }

  @js.native
  trait ListEventBusesResponse extends js.Object {
    var EventBuses: js.UndefOr[EventBusList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListEventBusesResponse {
    @inline
    def apply(
        EventBuses: js.UndefOr[EventBusList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListEventBusesResponse = {
      val __obj = js.Dynamic.literal()
      EventBuses.foreach(__v => __obj.updateDynamic("EventBuses")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListEventBusesResponse]
    }
  }

  @js.native
  trait ListEventSourcesRequest extends js.Object {
    var Limit: js.UndefOr[LimitMax100]
    var NamePrefix: js.UndefOr[EventSourceNamePrefix]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListEventSourcesRequest {
    @inline
    def apply(
        Limit: js.UndefOr[LimitMax100] = js.undefined,
        NamePrefix: js.UndefOr[EventSourceNamePrefix] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListEventSourcesRequest = {
      val __obj = js.Dynamic.literal()
      Limit.foreach(__v => __obj.updateDynamic("Limit")(__v.asInstanceOf[js.Any]))
      NamePrefix.foreach(__v => __obj.updateDynamic("NamePrefix")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListEventSourcesRequest]
    }
  }

  @js.native
  trait ListEventSourcesResponse extends js.Object {
    var EventSources: js.UndefOr[EventSourceList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListEventSourcesResponse {
    @inline
    def apply(
        EventSources: js.UndefOr[EventSourceList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListEventSourcesResponse = {
      val __obj = js.Dynamic.literal()
      EventSources.foreach(__v => __obj.updateDynamic("EventSources")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListEventSourcesResponse]
    }
  }

  @js.native
  trait ListPartnerEventSourceAccountsRequest extends js.Object {
    var EventSourceName: EventSourceName
    var Limit: js.UndefOr[LimitMax100]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListPartnerEventSourceAccountsRequest {
    @inline
    def apply(
        EventSourceName: EventSourceName,
        Limit: js.UndefOr[LimitMax100] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListPartnerEventSourceAccountsRequest = {
      val __obj = js.Dynamic.literal(
        "EventSourceName" -> EventSourceName.asInstanceOf[js.Any]
      )

      Limit.foreach(__v => __obj.updateDynamic("Limit")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPartnerEventSourceAccountsRequest]
    }
  }

  @js.native
  trait ListPartnerEventSourceAccountsResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var PartnerEventSourceAccounts: js.UndefOr[PartnerEventSourceAccountList]
  }

  object ListPartnerEventSourceAccountsResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        PartnerEventSourceAccounts: js.UndefOr[PartnerEventSourceAccountList] = js.undefined
    ): ListPartnerEventSourceAccountsResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      PartnerEventSourceAccounts.foreach(__v => __obj.updateDynamic("PartnerEventSourceAccounts")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPartnerEventSourceAccountsResponse]
    }
  }

  @js.native
  trait ListPartnerEventSourcesRequest extends js.Object {
    var NamePrefix: PartnerEventSourceNamePrefix
    var Limit: js.UndefOr[LimitMax100]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListPartnerEventSourcesRequest {
    @inline
    def apply(
        NamePrefix: PartnerEventSourceNamePrefix,
        Limit: js.UndefOr[LimitMax100] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListPartnerEventSourcesRequest = {
      val __obj = js.Dynamic.literal(
        "NamePrefix" -> NamePrefix.asInstanceOf[js.Any]
      )

      Limit.foreach(__v => __obj.updateDynamic("Limit")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPartnerEventSourcesRequest]
    }
  }

  @js.native
  trait ListPartnerEventSourcesResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var PartnerEventSources: js.UndefOr[PartnerEventSourceList]
  }

  object ListPartnerEventSourcesResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        PartnerEventSources: js.UndefOr[PartnerEventSourceList] = js.undefined
    ): ListPartnerEventSourcesResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      PartnerEventSources.foreach(__v => __obj.updateDynamic("PartnerEventSources")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPartnerEventSourcesResponse]
    }
  }

  @js.native
  trait ListReplaysRequest extends js.Object {
    var EventSourceArn: js.UndefOr[Arn]
    var Limit: js.UndefOr[LimitMax100]
    var NamePrefix: js.UndefOr[ReplayName]
    var NextToken: js.UndefOr[NextToken]
    var State: js.UndefOr[ReplayState]
  }

  object ListReplaysRequest {
    @inline
    def apply(
        EventSourceArn: js.UndefOr[Arn] = js.undefined,
        Limit: js.UndefOr[LimitMax100] = js.undefined,
        NamePrefix: js.UndefOr[ReplayName] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        State: js.UndefOr[ReplayState] = js.undefined
    ): ListReplaysRequest = {
      val __obj = js.Dynamic.literal()
      EventSourceArn.foreach(__v => __obj.updateDynamic("EventSourceArn")(__v.asInstanceOf[js.Any]))
      Limit.foreach(__v => __obj.updateDynamic("Limit")(__v.asInstanceOf[js.Any]))
      NamePrefix.foreach(__v => __obj.updateDynamic("NamePrefix")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListReplaysRequest]
    }
  }

  @js.native
  trait ListReplaysResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Replays: js.UndefOr[ReplayList]
  }

  object ListReplaysResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        Replays: js.UndefOr[ReplayList] = js.undefined
    ): ListReplaysResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Replays.foreach(__v => __obj.updateDynamic("Replays")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListReplaysResponse]
    }
  }

  @js.native
  trait ListRuleNamesByTargetRequest extends js.Object {
    var TargetArn: TargetArn
    var EventBusName: js.UndefOr[EventBusNameOrArn]
    var Limit: js.UndefOr[LimitMax100]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListRuleNamesByTargetRequest {
    @inline
    def apply(
        TargetArn: TargetArn,
        EventBusName: js.UndefOr[EventBusNameOrArn] = js.undefined,
        Limit: js.UndefOr[LimitMax100] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListRuleNamesByTargetRequest = {
      val __obj = js.Dynamic.literal(
        "TargetArn" -> TargetArn.asInstanceOf[js.Any]
      )

      EventBusName.foreach(__v => __obj.updateDynamic("EventBusName")(__v.asInstanceOf[js.Any]))
      Limit.foreach(__v => __obj.updateDynamic("Limit")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListRuleNamesByTargetRequest]
    }
  }

  @js.native
  trait ListRuleNamesByTargetResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var RuleNames: js.UndefOr[RuleNameList]
  }

  object ListRuleNamesByTargetResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        RuleNames: js.UndefOr[RuleNameList] = js.undefined
    ): ListRuleNamesByTargetResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      RuleNames.foreach(__v => __obj.updateDynamic("RuleNames")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListRuleNamesByTargetResponse]
    }
  }

  @js.native
  trait ListRulesRequest extends js.Object {
    var EventBusName: js.UndefOr[EventBusNameOrArn]
    var Limit: js.UndefOr[LimitMax100]
    var NamePrefix: js.UndefOr[RuleName]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListRulesRequest {
    @inline
    def apply(
        EventBusName: js.UndefOr[EventBusNameOrArn] = js.undefined,
        Limit: js.UndefOr[LimitMax100] = js.undefined,
        NamePrefix: js.UndefOr[RuleName] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListRulesRequest = {
      val __obj = js.Dynamic.literal()
      EventBusName.foreach(__v => __obj.updateDynamic("EventBusName")(__v.asInstanceOf[js.Any]))
      Limit.foreach(__v => __obj.updateDynamic("Limit")(__v.asInstanceOf[js.Any]))
      NamePrefix.foreach(__v => __obj.updateDynamic("NamePrefix")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListRulesRequest]
    }
  }

  @js.native
  trait ListRulesResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Rules: js.UndefOr[RuleResponseList]
  }

  object ListRulesResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        Rules: js.UndefOr[RuleResponseList] = js.undefined
    ): ListRulesResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Rules.foreach(__v => __obj.updateDynamic("Rules")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListRulesResponse]
    }
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var ResourceARN: Arn
  }

  object ListTagsForResourceRequest {
    @inline
    def apply(
        ResourceARN: Arn
    ): ListTagsForResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceARN" -> ResourceARN.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ListTagsForResourceRequest]
    }
  }

  @js.native
  trait ListTagsForResourceResponse extends js.Object {
    var Tags: js.UndefOr[TagList]
  }

  object ListTagsForResourceResponse {
    @inline
    def apply(
        Tags: js.UndefOr[TagList] = js.undefined
    ): ListTagsForResourceResponse = {
      val __obj = js.Dynamic.literal()
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceResponse]
    }
  }

  @js.native
  trait ListTargetsByRuleRequest extends js.Object {
    var Rule: RuleName
    var EventBusName: js.UndefOr[EventBusNameOrArn]
    var Limit: js.UndefOr[LimitMax100]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListTargetsByRuleRequest {
    @inline
    def apply(
        Rule: RuleName,
        EventBusName: js.UndefOr[EventBusNameOrArn] = js.undefined,
        Limit: js.UndefOr[LimitMax100] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListTargetsByRuleRequest = {
      val __obj = js.Dynamic.literal(
        "Rule" -> Rule.asInstanceOf[js.Any]
      )

      EventBusName.foreach(__v => __obj.updateDynamic("EventBusName")(__v.asInstanceOf[js.Any]))
      Limit.foreach(__v => __obj.updateDynamic("Limit")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTargetsByRuleRequest]
    }
  }

  @js.native
  trait ListTargetsByRuleResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Targets: js.UndefOr[TargetList]
  }

  object ListTargetsByRuleResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        Targets: js.UndefOr[TargetList] = js.undefined
    ): ListTargetsByRuleResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Targets.foreach(__v => __obj.updateDynamic("Targets")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTargetsByRuleResponse]
    }
  }

  /** This structure specifies the network configuration for an ECS task.
    */
  @js.native
  trait NetworkConfiguration extends js.Object {
    var awsvpcConfiguration: js.UndefOr[AwsVpcConfiguration]
  }

  object NetworkConfiguration {
    @inline
    def apply(
        awsvpcConfiguration: js.UndefOr[AwsVpcConfiguration] = js.undefined
    ): NetworkConfiguration = {
      val __obj = js.Dynamic.literal()
      awsvpcConfiguration.foreach(__v => __obj.updateDynamic("awsvpcConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NetworkConfiguration]
    }
  }

  /** A partner event source is created by an SaaS partner. If a customer creates a partner event bus that matches this event source, that AWS account can receive events from the partner's applications or services.
    */
  @js.native
  trait PartnerEventSource extends js.Object {
    var Arn: js.UndefOr[String]
    var Name: js.UndefOr[String]
  }

  object PartnerEventSource {
    @inline
    def apply(
        Arn: js.UndefOr[String] = js.undefined,
        Name: js.UndefOr[String] = js.undefined
    ): PartnerEventSource = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PartnerEventSource]
    }
  }

  /** The AWS account that a partner event source has been offered to.
    */
  @js.native
  trait PartnerEventSourceAccount extends js.Object {
    var Account: js.UndefOr[AccountId]
    var CreationTime: js.UndefOr[Timestamp]
    var ExpirationTime: js.UndefOr[Timestamp]
    var State: js.UndefOr[EventSourceState]
  }

  object PartnerEventSourceAccount {
    @inline
    def apply(
        Account: js.UndefOr[AccountId] = js.undefined,
        CreationTime: js.UndefOr[Timestamp] = js.undefined,
        ExpirationTime: js.UndefOr[Timestamp] = js.undefined,
        State: js.UndefOr[EventSourceState] = js.undefined
    ): PartnerEventSourceAccount = {
      val __obj = js.Dynamic.literal()
      Account.foreach(__v => __obj.updateDynamic("Account")(__v.asInstanceOf[js.Any]))
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      ExpirationTime.foreach(__v => __obj.updateDynamic("ExpirationTime")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PartnerEventSourceAccount]
    }
  }

  @js.native
  trait PutEventsRequest extends js.Object {
    var Entries: PutEventsRequestEntryList
  }

  object PutEventsRequest {
    @inline
    def apply(
        Entries: PutEventsRequestEntryList
    ): PutEventsRequest = {
      val __obj = js.Dynamic.literal(
        "Entries" -> Entries.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[PutEventsRequest]
    }
  }

  /** Represents an event to be submitted.
    */
  @js.native
  trait PutEventsRequestEntry extends js.Object {
    var Detail: js.UndefOr[String]
    var DetailType: js.UndefOr[String]
    var EventBusName: js.UndefOr[NonPartnerEventBusNameOrArn]
    var Resources: js.UndefOr[EventResourceList]
    var Source: js.UndefOr[String]
    var Time: js.UndefOr[EventTime]
    var TraceHeader: js.UndefOr[TraceHeader]
  }

  object PutEventsRequestEntry {
    @inline
    def apply(
        Detail: js.UndefOr[String] = js.undefined,
        DetailType: js.UndefOr[String] = js.undefined,
        EventBusName: js.UndefOr[NonPartnerEventBusNameOrArn] = js.undefined,
        Resources: js.UndefOr[EventResourceList] = js.undefined,
        Source: js.UndefOr[String] = js.undefined,
        Time: js.UndefOr[EventTime] = js.undefined,
        TraceHeader: js.UndefOr[TraceHeader] = js.undefined
    ): PutEventsRequestEntry = {
      val __obj = js.Dynamic.literal()
      Detail.foreach(__v => __obj.updateDynamic("Detail")(__v.asInstanceOf[js.Any]))
      DetailType.foreach(__v => __obj.updateDynamic("DetailType")(__v.asInstanceOf[js.Any]))
      EventBusName.foreach(__v => __obj.updateDynamic("EventBusName")(__v.asInstanceOf[js.Any]))
      Resources.foreach(__v => __obj.updateDynamic("Resources")(__v.asInstanceOf[js.Any]))
      Source.foreach(__v => __obj.updateDynamic("Source")(__v.asInstanceOf[js.Any]))
      Time.foreach(__v => __obj.updateDynamic("Time")(__v.asInstanceOf[js.Any]))
      TraceHeader.foreach(__v => __obj.updateDynamic("TraceHeader")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutEventsRequestEntry]
    }
  }

  @js.native
  trait PutEventsResponse extends js.Object {
    var Entries: js.UndefOr[PutEventsResultEntryList]
    var FailedEntryCount: js.UndefOr[Int]
  }

  object PutEventsResponse {
    @inline
    def apply(
        Entries: js.UndefOr[PutEventsResultEntryList] = js.undefined,
        FailedEntryCount: js.UndefOr[Int] = js.undefined
    ): PutEventsResponse = {
      val __obj = js.Dynamic.literal()
      Entries.foreach(__v => __obj.updateDynamic("Entries")(__v.asInstanceOf[js.Any]))
      FailedEntryCount.foreach(__v => __obj.updateDynamic("FailedEntryCount")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutEventsResponse]
    }
  }

  /** Represents an event that failed to be submitted.
    */
  @js.native
  trait PutEventsResultEntry extends js.Object {
    var ErrorCode: js.UndefOr[ErrorCode]
    var ErrorMessage: js.UndefOr[ErrorMessage]
    var EventId: js.UndefOr[EventId]
  }

  object PutEventsResultEntry {
    @inline
    def apply(
        ErrorCode: js.UndefOr[ErrorCode] = js.undefined,
        ErrorMessage: js.UndefOr[ErrorMessage] = js.undefined,
        EventId: js.UndefOr[EventId] = js.undefined
    ): PutEventsResultEntry = {
      val __obj = js.Dynamic.literal()
      ErrorCode.foreach(__v => __obj.updateDynamic("ErrorCode")(__v.asInstanceOf[js.Any]))
      ErrorMessage.foreach(__v => __obj.updateDynamic("ErrorMessage")(__v.asInstanceOf[js.Any]))
      EventId.foreach(__v => __obj.updateDynamic("EventId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutEventsResultEntry]
    }
  }

  @js.native
  trait PutPartnerEventsRequest extends js.Object {
    var Entries: PutPartnerEventsRequestEntryList
  }

  object PutPartnerEventsRequest {
    @inline
    def apply(
        Entries: PutPartnerEventsRequestEntryList
    ): PutPartnerEventsRequest = {
      val __obj = js.Dynamic.literal(
        "Entries" -> Entries.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[PutPartnerEventsRequest]
    }
  }

  /** The details about an event generated by an SaaS partner.
    */
  @js.native
  trait PutPartnerEventsRequestEntry extends js.Object {
    var Detail: js.UndefOr[String]
    var DetailType: js.UndefOr[String]
    var Resources: js.UndefOr[EventResourceList]
    var Source: js.UndefOr[EventSourceName]
    var Time: js.UndefOr[EventTime]
  }

  object PutPartnerEventsRequestEntry {
    @inline
    def apply(
        Detail: js.UndefOr[String] = js.undefined,
        DetailType: js.UndefOr[String] = js.undefined,
        Resources: js.UndefOr[EventResourceList] = js.undefined,
        Source: js.UndefOr[EventSourceName] = js.undefined,
        Time: js.UndefOr[EventTime] = js.undefined
    ): PutPartnerEventsRequestEntry = {
      val __obj = js.Dynamic.literal()
      Detail.foreach(__v => __obj.updateDynamic("Detail")(__v.asInstanceOf[js.Any]))
      DetailType.foreach(__v => __obj.updateDynamic("DetailType")(__v.asInstanceOf[js.Any]))
      Resources.foreach(__v => __obj.updateDynamic("Resources")(__v.asInstanceOf[js.Any]))
      Source.foreach(__v => __obj.updateDynamic("Source")(__v.asInstanceOf[js.Any]))
      Time.foreach(__v => __obj.updateDynamic("Time")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutPartnerEventsRequestEntry]
    }
  }

  @js.native
  trait PutPartnerEventsResponse extends js.Object {
    var Entries: js.UndefOr[PutPartnerEventsResultEntryList]
    var FailedEntryCount: js.UndefOr[Int]
  }

  object PutPartnerEventsResponse {
    @inline
    def apply(
        Entries: js.UndefOr[PutPartnerEventsResultEntryList] = js.undefined,
        FailedEntryCount: js.UndefOr[Int] = js.undefined
    ): PutPartnerEventsResponse = {
      val __obj = js.Dynamic.literal()
      Entries.foreach(__v => __obj.updateDynamic("Entries")(__v.asInstanceOf[js.Any]))
      FailedEntryCount.foreach(__v => __obj.updateDynamic("FailedEntryCount")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutPartnerEventsResponse]
    }
  }

  /** Represents an event that a partner tried to generate, but failed.
    */
  @js.native
  trait PutPartnerEventsResultEntry extends js.Object {
    var ErrorCode: js.UndefOr[ErrorCode]
    var ErrorMessage: js.UndefOr[ErrorMessage]
    var EventId: js.UndefOr[EventId]
  }

  object PutPartnerEventsResultEntry {
    @inline
    def apply(
        ErrorCode: js.UndefOr[ErrorCode] = js.undefined,
        ErrorMessage: js.UndefOr[ErrorMessage] = js.undefined,
        EventId: js.UndefOr[EventId] = js.undefined
    ): PutPartnerEventsResultEntry = {
      val __obj = js.Dynamic.literal()
      ErrorCode.foreach(__v => __obj.updateDynamic("ErrorCode")(__v.asInstanceOf[js.Any]))
      ErrorMessage.foreach(__v => __obj.updateDynamic("ErrorMessage")(__v.asInstanceOf[js.Any]))
      EventId.foreach(__v => __obj.updateDynamic("EventId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutPartnerEventsResultEntry]
    }
  }

  @js.native
  trait PutPermissionRequest extends js.Object {
    var Action: js.UndefOr[Action]
    var Condition: js.UndefOr[Condition]
    var EventBusName: js.UndefOr[NonPartnerEventBusName]
    var Policy: js.UndefOr[String]
    var Principal: js.UndefOr[Principal]
    var StatementId: js.UndefOr[StatementId]
  }

  object PutPermissionRequest {
    @inline
    def apply(
        Action: js.UndefOr[Action] = js.undefined,
        Condition: js.UndefOr[Condition] = js.undefined,
        EventBusName: js.UndefOr[NonPartnerEventBusName] = js.undefined,
        Policy: js.UndefOr[String] = js.undefined,
        Principal: js.UndefOr[Principal] = js.undefined,
        StatementId: js.UndefOr[StatementId] = js.undefined
    ): PutPermissionRequest = {
      val __obj = js.Dynamic.literal()
      Action.foreach(__v => __obj.updateDynamic("Action")(__v.asInstanceOf[js.Any]))
      Condition.foreach(__v => __obj.updateDynamic("Condition")(__v.asInstanceOf[js.Any]))
      EventBusName.foreach(__v => __obj.updateDynamic("EventBusName")(__v.asInstanceOf[js.Any]))
      Policy.foreach(__v => __obj.updateDynamic("Policy")(__v.asInstanceOf[js.Any]))
      Principal.foreach(__v => __obj.updateDynamic("Principal")(__v.asInstanceOf[js.Any]))
      StatementId.foreach(__v => __obj.updateDynamic("StatementId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutPermissionRequest]
    }
  }

  @js.native
  trait PutRuleRequest extends js.Object {
    var Name: RuleName
    var Description: js.UndefOr[RuleDescription]
    var EventBusName: js.UndefOr[EventBusNameOrArn]
    var EventPattern: js.UndefOr[EventPattern]
    var RoleArn: js.UndefOr[RoleArn]
    var ScheduleExpression: js.UndefOr[ScheduleExpression]
    var State: js.UndefOr[RuleState]
    var Tags: js.UndefOr[TagList]
  }

  object PutRuleRequest {
    @inline
    def apply(
        Name: RuleName,
        Description: js.UndefOr[RuleDescription] = js.undefined,
        EventBusName: js.UndefOr[EventBusNameOrArn] = js.undefined,
        EventPattern: js.UndefOr[EventPattern] = js.undefined,
        RoleArn: js.UndefOr[RoleArn] = js.undefined,
        ScheduleExpression: js.UndefOr[ScheduleExpression] = js.undefined,
        State: js.UndefOr[RuleState] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): PutRuleRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      EventBusName.foreach(__v => __obj.updateDynamic("EventBusName")(__v.asInstanceOf[js.Any]))
      EventPattern.foreach(__v => __obj.updateDynamic("EventPattern")(__v.asInstanceOf[js.Any]))
      RoleArn.foreach(__v => __obj.updateDynamic("RoleArn")(__v.asInstanceOf[js.Any]))
      ScheduleExpression.foreach(__v => __obj.updateDynamic("ScheduleExpression")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutRuleRequest]
    }
  }

  @js.native
  trait PutRuleResponse extends js.Object {
    var RuleArn: js.UndefOr[RuleArn]
  }

  object PutRuleResponse {
    @inline
    def apply(
        RuleArn: js.UndefOr[RuleArn] = js.undefined
    ): PutRuleResponse = {
      val __obj = js.Dynamic.literal()
      RuleArn.foreach(__v => __obj.updateDynamic("RuleArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutRuleResponse]
    }
  }

  @js.native
  trait PutTargetsRequest extends js.Object {
    var Rule: RuleName
    var Targets: TargetList
    var EventBusName: js.UndefOr[EventBusNameOrArn]
  }

  object PutTargetsRequest {
    @inline
    def apply(
        Rule: RuleName,
        Targets: TargetList,
        EventBusName: js.UndefOr[EventBusNameOrArn] = js.undefined
    ): PutTargetsRequest = {
      val __obj = js.Dynamic.literal(
        "Rule" -> Rule.asInstanceOf[js.Any],
        "Targets" -> Targets.asInstanceOf[js.Any]
      )

      EventBusName.foreach(__v => __obj.updateDynamic("EventBusName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutTargetsRequest]
    }
  }

  @js.native
  trait PutTargetsResponse extends js.Object {
    var FailedEntries: js.UndefOr[PutTargetsResultEntryList]
    var FailedEntryCount: js.UndefOr[Int]
  }

  object PutTargetsResponse {
    @inline
    def apply(
        FailedEntries: js.UndefOr[PutTargetsResultEntryList] = js.undefined,
        FailedEntryCount: js.UndefOr[Int] = js.undefined
    ): PutTargetsResponse = {
      val __obj = js.Dynamic.literal()
      FailedEntries.foreach(__v => __obj.updateDynamic("FailedEntries")(__v.asInstanceOf[js.Any]))
      FailedEntryCount.foreach(__v => __obj.updateDynamic("FailedEntryCount")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutTargetsResponse]
    }
  }

  /** Represents a target that failed to be added to a rule.
    */
  @js.native
  trait PutTargetsResultEntry extends js.Object {
    var ErrorCode: js.UndefOr[ErrorCode]
    var ErrorMessage: js.UndefOr[ErrorMessage]
    var TargetId: js.UndefOr[TargetId]
  }

  object PutTargetsResultEntry {
    @inline
    def apply(
        ErrorCode: js.UndefOr[ErrorCode] = js.undefined,
        ErrorMessage: js.UndefOr[ErrorMessage] = js.undefined,
        TargetId: js.UndefOr[TargetId] = js.undefined
    ): PutTargetsResultEntry = {
      val __obj = js.Dynamic.literal()
      ErrorCode.foreach(__v => __obj.updateDynamic("ErrorCode")(__v.asInstanceOf[js.Any]))
      ErrorMessage.foreach(__v => __obj.updateDynamic("ErrorMessage")(__v.asInstanceOf[js.Any]))
      TargetId.foreach(__v => __obj.updateDynamic("TargetId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutTargetsResultEntry]
    }
  }

  /** These are custom parameters to be used when the target is a Redshift cluster to invoke the Redshift Data API ExecuteStatement based on EventBridge events.
    */
  @js.native
  trait RedshiftDataParameters extends js.Object {
    var Database: Database
    var Sql: Sql
    var DbUser: js.UndefOr[DbUser]
    var SecretManagerArn: js.UndefOr[RedshiftSecretManagerArn]
    var StatementName: js.UndefOr[StatementName]
    var WithEvent: js.UndefOr[Boolean]
  }

  object RedshiftDataParameters {
    @inline
    def apply(
        Database: Database,
        Sql: Sql,
        DbUser: js.UndefOr[DbUser] = js.undefined,
        SecretManagerArn: js.UndefOr[RedshiftSecretManagerArn] = js.undefined,
        StatementName: js.UndefOr[StatementName] = js.undefined,
        WithEvent: js.UndefOr[Boolean] = js.undefined
    ): RedshiftDataParameters = {
      val __obj = js.Dynamic.literal(
        "Database" -> Database.asInstanceOf[js.Any],
        "Sql" -> Sql.asInstanceOf[js.Any]
      )

      DbUser.foreach(__v => __obj.updateDynamic("DbUser")(__v.asInstanceOf[js.Any]))
      SecretManagerArn.foreach(__v => __obj.updateDynamic("SecretManagerArn")(__v.asInstanceOf[js.Any]))
      StatementName.foreach(__v => __obj.updateDynamic("StatementName")(__v.asInstanceOf[js.Any]))
      WithEvent.foreach(__v => __obj.updateDynamic("WithEvent")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RedshiftDataParameters]
    }
  }

  @js.native
  trait RemovePermissionRequest extends js.Object {
    var EventBusName: js.UndefOr[NonPartnerEventBusName]
    var RemoveAllPermissions: js.UndefOr[Boolean]
    var StatementId: js.UndefOr[StatementId]
  }

  object RemovePermissionRequest {
    @inline
    def apply(
        EventBusName: js.UndefOr[NonPartnerEventBusName] = js.undefined,
        RemoveAllPermissions: js.UndefOr[Boolean] = js.undefined,
        StatementId: js.UndefOr[StatementId] = js.undefined
    ): RemovePermissionRequest = {
      val __obj = js.Dynamic.literal()
      EventBusName.foreach(__v => __obj.updateDynamic("EventBusName")(__v.asInstanceOf[js.Any]))
      RemoveAllPermissions.foreach(__v => __obj.updateDynamic("RemoveAllPermissions")(__v.asInstanceOf[js.Any]))
      StatementId.foreach(__v => __obj.updateDynamic("StatementId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RemovePermissionRequest]
    }
  }

  @js.native
  trait RemoveTargetsRequest extends js.Object {
    var Ids: TargetIdList
    var Rule: RuleName
    var EventBusName: js.UndefOr[EventBusNameOrArn]
    var Force: js.UndefOr[Boolean]
  }

  object RemoveTargetsRequest {
    @inline
    def apply(
        Ids: TargetIdList,
        Rule: RuleName,
        EventBusName: js.UndefOr[EventBusNameOrArn] = js.undefined,
        Force: js.UndefOr[Boolean] = js.undefined
    ): RemoveTargetsRequest = {
      val __obj = js.Dynamic.literal(
        "Ids" -> Ids.asInstanceOf[js.Any],
        "Rule" -> Rule.asInstanceOf[js.Any]
      )

      EventBusName.foreach(__v => __obj.updateDynamic("EventBusName")(__v.asInstanceOf[js.Any]))
      Force.foreach(__v => __obj.updateDynamic("Force")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RemoveTargetsRequest]
    }
  }

  @js.native
  trait RemoveTargetsResponse extends js.Object {
    var FailedEntries: js.UndefOr[RemoveTargetsResultEntryList]
    var FailedEntryCount: js.UndefOr[Int]
  }

  object RemoveTargetsResponse {
    @inline
    def apply(
        FailedEntries: js.UndefOr[RemoveTargetsResultEntryList] = js.undefined,
        FailedEntryCount: js.UndefOr[Int] = js.undefined
    ): RemoveTargetsResponse = {
      val __obj = js.Dynamic.literal()
      FailedEntries.foreach(__v => __obj.updateDynamic("FailedEntries")(__v.asInstanceOf[js.Any]))
      FailedEntryCount.foreach(__v => __obj.updateDynamic("FailedEntryCount")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RemoveTargetsResponse]
    }
  }

  /** Represents a target that failed to be removed from a rule.
    */
  @js.native
  trait RemoveTargetsResultEntry extends js.Object {
    var ErrorCode: js.UndefOr[ErrorCode]
    var ErrorMessage: js.UndefOr[ErrorMessage]
    var TargetId: js.UndefOr[TargetId]
  }

  object RemoveTargetsResultEntry {
    @inline
    def apply(
        ErrorCode: js.UndefOr[ErrorCode] = js.undefined,
        ErrorMessage: js.UndefOr[ErrorMessage] = js.undefined,
        TargetId: js.UndefOr[TargetId] = js.undefined
    ): RemoveTargetsResultEntry = {
      val __obj = js.Dynamic.literal()
      ErrorCode.foreach(__v => __obj.updateDynamic("ErrorCode")(__v.asInstanceOf[js.Any]))
      ErrorMessage.foreach(__v => __obj.updateDynamic("ErrorMessage")(__v.asInstanceOf[js.Any]))
      TargetId.foreach(__v => __obj.updateDynamic("TargetId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RemoveTargetsResultEntry]
    }
  }

  /** A <code>Replay</code> object that contains details about a replay.
    */
  @js.native
  trait Replay extends js.Object {
    var EventEndTime: js.UndefOr[Timestamp]
    var EventLastReplayedTime: js.UndefOr[Timestamp]
    var EventSourceArn: js.UndefOr[Arn]
    var EventStartTime: js.UndefOr[Timestamp]
    var ReplayEndTime: js.UndefOr[Timestamp]
    var ReplayName: js.UndefOr[ReplayName]
    var ReplayStartTime: js.UndefOr[Timestamp]
    var State: js.UndefOr[ReplayState]
    var StateReason: js.UndefOr[ReplayStateReason]
  }

  object Replay {
    @inline
    def apply(
        EventEndTime: js.UndefOr[Timestamp] = js.undefined,
        EventLastReplayedTime: js.UndefOr[Timestamp] = js.undefined,
        EventSourceArn: js.UndefOr[Arn] = js.undefined,
        EventStartTime: js.UndefOr[Timestamp] = js.undefined,
        ReplayEndTime: js.UndefOr[Timestamp] = js.undefined,
        ReplayName: js.UndefOr[ReplayName] = js.undefined,
        ReplayStartTime: js.UndefOr[Timestamp] = js.undefined,
        State: js.UndefOr[ReplayState] = js.undefined,
        StateReason: js.UndefOr[ReplayStateReason] = js.undefined
    ): Replay = {
      val __obj = js.Dynamic.literal()
      EventEndTime.foreach(__v => __obj.updateDynamic("EventEndTime")(__v.asInstanceOf[js.Any]))
      EventLastReplayedTime.foreach(__v => __obj.updateDynamic("EventLastReplayedTime")(__v.asInstanceOf[js.Any]))
      EventSourceArn.foreach(__v => __obj.updateDynamic("EventSourceArn")(__v.asInstanceOf[js.Any]))
      EventStartTime.foreach(__v => __obj.updateDynamic("EventStartTime")(__v.asInstanceOf[js.Any]))
      ReplayEndTime.foreach(__v => __obj.updateDynamic("ReplayEndTime")(__v.asInstanceOf[js.Any]))
      ReplayName.foreach(__v => __obj.updateDynamic("ReplayName")(__v.asInstanceOf[js.Any]))
      ReplayStartTime.foreach(__v => __obj.updateDynamic("ReplayStartTime")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      StateReason.foreach(__v => __obj.updateDynamic("StateReason")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Replay]
    }
  }

  /** A <code>ReplayDestination</code> object that contains details about a replay.
    */
  @js.native
  trait ReplayDestination extends js.Object {
    var Arn: Arn
    var FilterArns: js.UndefOr[ReplayDestinationFilters]
  }

  object ReplayDestination {
    @inline
    def apply(
        Arn: Arn,
        FilterArns: js.UndefOr[ReplayDestinationFilters] = js.undefined
    ): ReplayDestination = {
      val __obj = js.Dynamic.literal(
        "Arn" -> Arn.asInstanceOf[js.Any]
      )

      FilterArns.foreach(__v => __obj.updateDynamic("FilterArns")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ReplayDestination]
    }
  }

  @js.native
  sealed trait ReplayState extends js.Any
  object ReplayState {
    val STARTING = "STARTING".asInstanceOf[ReplayState]
    val RUNNING = "RUNNING".asInstanceOf[ReplayState]
    val CANCELLING = "CANCELLING".asInstanceOf[ReplayState]
    val COMPLETED = "COMPLETED".asInstanceOf[ReplayState]
    val CANCELLED = "CANCELLED".asInstanceOf[ReplayState]
    val FAILED = "FAILED".asInstanceOf[ReplayState]

    @inline def values = js.Array(STARTING, RUNNING, CANCELLING, COMPLETED, CANCELLED, FAILED)
  }

  /** A <code>RetryPolicy</code> object that includes information about the retry policy settings.
    */
  @js.native
  trait RetryPolicy extends js.Object {
    var MaximumEventAgeInSeconds: js.UndefOr[MaximumEventAgeInSeconds]
    var MaximumRetryAttempts: js.UndefOr[MaximumRetryAttempts]
  }

  object RetryPolicy {
    @inline
    def apply(
        MaximumEventAgeInSeconds: js.UndefOr[MaximumEventAgeInSeconds] = js.undefined,
        MaximumRetryAttempts: js.UndefOr[MaximumRetryAttempts] = js.undefined
    ): RetryPolicy = {
      val __obj = js.Dynamic.literal()
      MaximumEventAgeInSeconds.foreach(__v => __obj.updateDynamic("MaximumEventAgeInSeconds")(__v.asInstanceOf[js.Any]))
      MaximumRetryAttempts.foreach(__v => __obj.updateDynamic("MaximumRetryAttempts")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RetryPolicy]
    }
  }

  /** Contains information about a rule in Amazon EventBridge.
    */
  @js.native
  trait Rule extends js.Object {
    var Arn: js.UndefOr[RuleArn]
    var Description: js.UndefOr[RuleDescription]
    var EventBusName: js.UndefOr[EventBusName]
    var EventPattern: js.UndefOr[EventPattern]
    var ManagedBy: js.UndefOr[ManagedBy]
    var Name: js.UndefOr[RuleName]
    var RoleArn: js.UndefOr[RoleArn]
    var ScheduleExpression: js.UndefOr[ScheduleExpression]
    var State: js.UndefOr[RuleState]
  }

  object Rule {
    @inline
    def apply(
        Arn: js.UndefOr[RuleArn] = js.undefined,
        Description: js.UndefOr[RuleDescription] = js.undefined,
        EventBusName: js.UndefOr[EventBusName] = js.undefined,
        EventPattern: js.UndefOr[EventPattern] = js.undefined,
        ManagedBy: js.UndefOr[ManagedBy] = js.undefined,
        Name: js.UndefOr[RuleName] = js.undefined,
        RoleArn: js.UndefOr[RoleArn] = js.undefined,
        ScheduleExpression: js.UndefOr[ScheduleExpression] = js.undefined,
        State: js.UndefOr[RuleState] = js.undefined
    ): Rule = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      EventBusName.foreach(__v => __obj.updateDynamic("EventBusName")(__v.asInstanceOf[js.Any]))
      EventPattern.foreach(__v => __obj.updateDynamic("EventPattern")(__v.asInstanceOf[js.Any]))
      ManagedBy.foreach(__v => __obj.updateDynamic("ManagedBy")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      RoleArn.foreach(__v => __obj.updateDynamic("RoleArn")(__v.asInstanceOf[js.Any]))
      ScheduleExpression.foreach(__v => __obj.updateDynamic("ScheduleExpression")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Rule]
    }
  }

  @js.native
  sealed trait RuleState extends js.Any
  object RuleState {
    val ENABLED = "ENABLED".asInstanceOf[RuleState]
    val DISABLED = "DISABLED".asInstanceOf[RuleState]

    @inline def values = js.Array(ENABLED, DISABLED)
  }

  /** This parameter contains the criteria (either InstanceIds or a tag) used to specify which EC2 instances are to be sent the command.
    */
  @js.native
  trait RunCommandParameters extends js.Object {
    var RunCommandTargets: RunCommandTargets
  }

  object RunCommandParameters {
    @inline
    def apply(
        RunCommandTargets: RunCommandTargets
    ): RunCommandParameters = {
      val __obj = js.Dynamic.literal(
        "RunCommandTargets" -> RunCommandTargets.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[RunCommandParameters]
    }
  }

  /** Information about the EC2 instances that are to be sent the command, specified as key-value pairs. Each <code>RunCommandTarget</code> block can include only one key, but this key may specify multiple values.
    */
  @js.native
  trait RunCommandTarget extends js.Object {
    var Key: RunCommandTargetKey
    var Values: RunCommandTargetValues
  }

  object RunCommandTarget {
    @inline
    def apply(
        Key: RunCommandTargetKey,
        Values: RunCommandTargetValues
    ): RunCommandTarget = {
      val __obj = js.Dynamic.literal(
        "Key" -> Key.asInstanceOf[js.Any],
        "Values" -> Values.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[RunCommandTarget]
    }
  }

  /** Name/Value pair of a parameter to start execution of a SageMaker Model Building Pipeline.
    */
  @js.native
  trait SageMakerPipelineParameter extends js.Object {
    var Name: SageMakerPipelineParameterName
    var Value: SageMakerPipelineParameterValue
  }

  object SageMakerPipelineParameter {
    @inline
    def apply(
        Name: SageMakerPipelineParameterName,
        Value: SageMakerPipelineParameterValue
    ): SageMakerPipelineParameter = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "Value" -> Value.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[SageMakerPipelineParameter]
    }
  }

  /** These are custom parameters to use when the target is a SageMaker Model Building Pipeline that starts based on EventBridge events.
    */
  @js.native
  trait SageMakerPipelineParameters extends js.Object {
    var PipelineParameterList: js.UndefOr[SageMakerPipelineParameterList]
  }

  object SageMakerPipelineParameters {
    @inline
    def apply(
        PipelineParameterList: js.UndefOr[SageMakerPipelineParameterList] = js.undefined
    ): SageMakerPipelineParameters = {
      val __obj = js.Dynamic.literal()
      PipelineParameterList.foreach(__v => __obj.updateDynamic("PipelineParameterList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SageMakerPipelineParameters]
    }
  }

  /** This structure includes the custom parameter to be used when the target is an SQS FIFO queue.
    */
  @js.native
  trait SqsParameters extends js.Object {
    var MessageGroupId: js.UndefOr[MessageGroupId]
  }

  object SqsParameters {
    @inline
    def apply(
        MessageGroupId: js.UndefOr[MessageGroupId] = js.undefined
    ): SqsParameters = {
      val __obj = js.Dynamic.literal()
      MessageGroupId.foreach(__v => __obj.updateDynamic("MessageGroupId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SqsParameters]
    }
  }

  @js.native
  trait StartReplayRequest extends js.Object {
    var Destination: ReplayDestination
    var EventEndTime: Timestamp
    var EventSourceArn: Arn
    var EventStartTime: Timestamp
    var ReplayName: ReplayName
    var Description: js.UndefOr[ReplayDescription]
  }

  object StartReplayRequest {
    @inline
    def apply(
        Destination: ReplayDestination,
        EventEndTime: Timestamp,
        EventSourceArn: Arn,
        EventStartTime: Timestamp,
        ReplayName: ReplayName,
        Description: js.UndefOr[ReplayDescription] = js.undefined
    ): StartReplayRequest = {
      val __obj = js.Dynamic.literal(
        "Destination" -> Destination.asInstanceOf[js.Any],
        "EventEndTime" -> EventEndTime.asInstanceOf[js.Any],
        "EventSourceArn" -> EventSourceArn.asInstanceOf[js.Any],
        "EventStartTime" -> EventStartTime.asInstanceOf[js.Any],
        "ReplayName" -> ReplayName.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartReplayRequest]
    }
  }

  @js.native
  trait StartReplayResponse extends js.Object {
    var ReplayArn: js.UndefOr[ReplayArn]
    var ReplayStartTime: js.UndefOr[Timestamp]
    var State: js.UndefOr[ReplayState]
    var StateReason: js.UndefOr[ReplayStateReason]
  }

  object StartReplayResponse {
    @inline
    def apply(
        ReplayArn: js.UndefOr[ReplayArn] = js.undefined,
        ReplayStartTime: js.UndefOr[Timestamp] = js.undefined,
        State: js.UndefOr[ReplayState] = js.undefined,
        StateReason: js.UndefOr[ReplayStateReason] = js.undefined
    ): StartReplayResponse = {
      val __obj = js.Dynamic.literal()
      ReplayArn.foreach(__v => __obj.updateDynamic("ReplayArn")(__v.asInstanceOf[js.Any]))
      ReplayStartTime.foreach(__v => __obj.updateDynamic("ReplayStartTime")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      StateReason.foreach(__v => __obj.updateDynamic("StateReason")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartReplayResponse]
    }
  }

  /** A key-value pair associated with an AWS resource. In EventBridge, rules and event buses support tagging.
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

  @js.native
  trait TagResourceRequest extends js.Object {
    var ResourceARN: Arn
    var Tags: TagList
  }

  object TagResourceRequest {
    @inline
    def apply(
        ResourceARN: Arn,
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

  /** Targets are the resources to be invoked when a rule is triggered. For a complete list of services and resources that can be set as a target, see <a>PutTargets</a>. If you are setting the event bus of another account as the target, and that account granted permission to your account through an organization instead of directly by the account ID, then you must specify a <code>RoleArn</code> with proper permissions in the <code>Target</code> structure. For more information, see [[https://docs.aws.amazon.com/eventbridge/latest/userguide/eventbridge-cross-account-event-delivery.html|Sending and Receiving Events Between AWS Accounts]] in the <i>Amazon EventBridge User Guide</i>.
    */
  @js.native
  trait Target extends js.Object {
    var Arn: TargetArn
    var Id: TargetId
    var BatchParameters: js.UndefOr[BatchParameters]
    var DeadLetterConfig: js.UndefOr[DeadLetterConfig]
    var EcsParameters: js.UndefOr[EcsParameters]
    var HttpParameters: js.UndefOr[HttpParameters]
    var Input: js.UndefOr[TargetInput]
    var InputPath: js.UndefOr[TargetInputPath]
    var InputTransformer: js.UndefOr[InputTransformer]
    var KinesisParameters: js.UndefOr[KinesisParameters]
    var RedshiftDataParameters: js.UndefOr[RedshiftDataParameters]
    var RetryPolicy: js.UndefOr[RetryPolicy]
    var RoleArn: js.UndefOr[RoleArn]
    var RunCommandParameters: js.UndefOr[RunCommandParameters]
    var SageMakerPipelineParameters: js.UndefOr[SageMakerPipelineParameters]
    var SqsParameters: js.UndefOr[SqsParameters]
  }

  object Target {
    @inline
    def apply(
        Arn: TargetArn,
        Id: TargetId,
        BatchParameters: js.UndefOr[BatchParameters] = js.undefined,
        DeadLetterConfig: js.UndefOr[DeadLetterConfig] = js.undefined,
        EcsParameters: js.UndefOr[EcsParameters] = js.undefined,
        HttpParameters: js.UndefOr[HttpParameters] = js.undefined,
        Input: js.UndefOr[TargetInput] = js.undefined,
        InputPath: js.UndefOr[TargetInputPath] = js.undefined,
        InputTransformer: js.UndefOr[InputTransformer] = js.undefined,
        KinesisParameters: js.UndefOr[KinesisParameters] = js.undefined,
        RedshiftDataParameters: js.UndefOr[RedshiftDataParameters] = js.undefined,
        RetryPolicy: js.UndefOr[RetryPolicy] = js.undefined,
        RoleArn: js.UndefOr[RoleArn] = js.undefined,
        RunCommandParameters: js.UndefOr[RunCommandParameters] = js.undefined,
        SageMakerPipelineParameters: js.UndefOr[SageMakerPipelineParameters] = js.undefined,
        SqsParameters: js.UndefOr[SqsParameters] = js.undefined
    ): Target = {
      val __obj = js.Dynamic.literal(
        "Arn" -> Arn.asInstanceOf[js.Any],
        "Id" -> Id.asInstanceOf[js.Any]
      )

      BatchParameters.foreach(__v => __obj.updateDynamic("BatchParameters")(__v.asInstanceOf[js.Any]))
      DeadLetterConfig.foreach(__v => __obj.updateDynamic("DeadLetterConfig")(__v.asInstanceOf[js.Any]))
      EcsParameters.foreach(__v => __obj.updateDynamic("EcsParameters")(__v.asInstanceOf[js.Any]))
      HttpParameters.foreach(__v => __obj.updateDynamic("HttpParameters")(__v.asInstanceOf[js.Any]))
      Input.foreach(__v => __obj.updateDynamic("Input")(__v.asInstanceOf[js.Any]))
      InputPath.foreach(__v => __obj.updateDynamic("InputPath")(__v.asInstanceOf[js.Any]))
      InputTransformer.foreach(__v => __obj.updateDynamic("InputTransformer")(__v.asInstanceOf[js.Any]))
      KinesisParameters.foreach(__v => __obj.updateDynamic("KinesisParameters")(__v.asInstanceOf[js.Any]))
      RedshiftDataParameters.foreach(__v => __obj.updateDynamic("RedshiftDataParameters")(__v.asInstanceOf[js.Any]))
      RetryPolicy.foreach(__v => __obj.updateDynamic("RetryPolicy")(__v.asInstanceOf[js.Any]))
      RoleArn.foreach(__v => __obj.updateDynamic("RoleArn")(__v.asInstanceOf[js.Any]))
      RunCommandParameters.foreach(__v => __obj.updateDynamic("RunCommandParameters")(__v.asInstanceOf[js.Any]))
      SageMakerPipelineParameters.foreach(__v => __obj.updateDynamic("SageMakerPipelineParameters")(__v.asInstanceOf[js.Any]))
      SqsParameters.foreach(__v => __obj.updateDynamic("SqsParameters")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Target]
    }
  }

  @js.native
  trait TestEventPatternRequest extends js.Object {
    var Event: String
    var EventPattern: EventPattern
  }

  object TestEventPatternRequest {
    @inline
    def apply(
        Event: String,
        EventPattern: EventPattern
    ): TestEventPatternRequest = {
      val __obj = js.Dynamic.literal(
        "Event" -> Event.asInstanceOf[js.Any],
        "EventPattern" -> EventPattern.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[TestEventPatternRequest]
    }
  }

  @js.native
  trait TestEventPatternResponse extends js.Object {
    var Result: js.UndefOr[Boolean]
  }

  object TestEventPatternResponse {
    @inline
    def apply(
        Result: js.UndefOr[Boolean] = js.undefined
    ): TestEventPatternResponse = {
      val __obj = js.Dynamic.literal()
      Result.foreach(__v => __obj.updateDynamic("Result")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TestEventPatternResponse]
    }
  }

  @js.native
  trait UntagResourceRequest extends js.Object {
    var ResourceARN: Arn
    var TagKeys: TagKeyList
  }

  object UntagResourceRequest {
    @inline
    def apply(
        ResourceARN: Arn,
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
  trait UpdateApiDestinationRequest extends js.Object {
    var Name: ApiDestinationName
    var ConnectionArn: js.UndefOr[ConnectionArn]
    var Description: js.UndefOr[ApiDestinationDescription]
    var HttpMethod: js.UndefOr[ApiDestinationHttpMethod]
    var InvocationEndpoint: js.UndefOr[HttpsEndpoint]
    var InvocationRateLimitPerSecond: js.UndefOr[ApiDestinationInvocationRateLimitPerSecond]
  }

  object UpdateApiDestinationRequest {
    @inline
    def apply(
        Name: ApiDestinationName,
        ConnectionArn: js.UndefOr[ConnectionArn] = js.undefined,
        Description: js.UndefOr[ApiDestinationDescription] = js.undefined,
        HttpMethod: js.UndefOr[ApiDestinationHttpMethod] = js.undefined,
        InvocationEndpoint: js.UndefOr[HttpsEndpoint] = js.undefined,
        InvocationRateLimitPerSecond: js.UndefOr[ApiDestinationInvocationRateLimitPerSecond] = js.undefined
    ): UpdateApiDestinationRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      ConnectionArn.foreach(__v => __obj.updateDynamic("ConnectionArn")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      HttpMethod.foreach(__v => __obj.updateDynamic("HttpMethod")(__v.asInstanceOf[js.Any]))
      InvocationEndpoint.foreach(__v => __obj.updateDynamic("InvocationEndpoint")(__v.asInstanceOf[js.Any]))
      InvocationRateLimitPerSecond.foreach(__v => __obj.updateDynamic("InvocationRateLimitPerSecond")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateApiDestinationRequest]
    }
  }

  @js.native
  trait UpdateApiDestinationResponse extends js.Object {
    var ApiDestinationArn: js.UndefOr[ApiDestinationArn]
    var ApiDestinationState: js.UndefOr[ApiDestinationState]
    var CreationTime: js.UndefOr[Timestamp]
    var LastModifiedTime: js.UndefOr[Timestamp]
  }

  object UpdateApiDestinationResponse {
    @inline
    def apply(
        ApiDestinationArn: js.UndefOr[ApiDestinationArn] = js.undefined,
        ApiDestinationState: js.UndefOr[ApiDestinationState] = js.undefined,
        CreationTime: js.UndefOr[Timestamp] = js.undefined,
        LastModifiedTime: js.UndefOr[Timestamp] = js.undefined
    ): UpdateApiDestinationResponse = {
      val __obj = js.Dynamic.literal()
      ApiDestinationArn.foreach(__v => __obj.updateDynamic("ApiDestinationArn")(__v.asInstanceOf[js.Any]))
      ApiDestinationState.foreach(__v => __obj.updateDynamic("ApiDestinationState")(__v.asInstanceOf[js.Any]))
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      LastModifiedTime.foreach(__v => __obj.updateDynamic("LastModifiedTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateApiDestinationResponse]
    }
  }

  @js.native
  trait UpdateArchiveRequest extends js.Object {
    var ArchiveName: ArchiveName
    var Description: js.UndefOr[ArchiveDescription]
    var EventPattern: js.UndefOr[EventPattern]
    var RetentionDays: js.UndefOr[RetentionDays]
  }

  object UpdateArchiveRequest {
    @inline
    def apply(
        ArchiveName: ArchiveName,
        Description: js.UndefOr[ArchiveDescription] = js.undefined,
        EventPattern: js.UndefOr[EventPattern] = js.undefined,
        RetentionDays: js.UndefOr[RetentionDays] = js.undefined
    ): UpdateArchiveRequest = {
      val __obj = js.Dynamic.literal(
        "ArchiveName" -> ArchiveName.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      EventPattern.foreach(__v => __obj.updateDynamic("EventPattern")(__v.asInstanceOf[js.Any]))
      RetentionDays.foreach(__v => __obj.updateDynamic("RetentionDays")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateArchiveRequest]
    }
  }

  @js.native
  trait UpdateArchiveResponse extends js.Object {
    var ArchiveArn: js.UndefOr[ArchiveArn]
    var CreationTime: js.UndefOr[Timestamp]
    var State: js.UndefOr[ArchiveState]
    var StateReason: js.UndefOr[ArchiveStateReason]
  }

  object UpdateArchiveResponse {
    @inline
    def apply(
        ArchiveArn: js.UndefOr[ArchiveArn] = js.undefined,
        CreationTime: js.UndefOr[Timestamp] = js.undefined,
        State: js.UndefOr[ArchiveState] = js.undefined,
        StateReason: js.UndefOr[ArchiveStateReason] = js.undefined
    ): UpdateArchiveResponse = {
      val __obj = js.Dynamic.literal()
      ArchiveArn.foreach(__v => __obj.updateDynamic("ArchiveArn")(__v.asInstanceOf[js.Any]))
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      StateReason.foreach(__v => __obj.updateDynamic("StateReason")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateArchiveResponse]
    }
  }

  /** Contains the API key authorization parameters to use to update the connection.
    */
  @js.native
  trait UpdateConnectionApiKeyAuthRequestParameters extends js.Object {
    var ApiKeyName: js.UndefOr[AuthHeaderParameters]
    var ApiKeyValue: js.UndefOr[AuthHeaderParameters]
  }

  object UpdateConnectionApiKeyAuthRequestParameters {
    @inline
    def apply(
        ApiKeyName: js.UndefOr[AuthHeaderParameters] = js.undefined,
        ApiKeyValue: js.UndefOr[AuthHeaderParameters] = js.undefined
    ): UpdateConnectionApiKeyAuthRequestParameters = {
      val __obj = js.Dynamic.literal()
      ApiKeyName.foreach(__v => __obj.updateDynamic("ApiKeyName")(__v.asInstanceOf[js.Any]))
      ApiKeyValue.foreach(__v => __obj.updateDynamic("ApiKeyValue")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateConnectionApiKeyAuthRequestParameters]
    }
  }

  /** Contains the additional parameters to use for the connection.
    */
  @js.native
  trait UpdateConnectionAuthRequestParameters extends js.Object {
    var ApiKeyAuthParameters: js.UndefOr[UpdateConnectionApiKeyAuthRequestParameters]
    var BasicAuthParameters: js.UndefOr[UpdateConnectionBasicAuthRequestParameters]
    var InvocationHttpParameters: js.UndefOr[ConnectionHttpParameters]
    var OAuthParameters: js.UndefOr[UpdateConnectionOAuthRequestParameters]
  }

  object UpdateConnectionAuthRequestParameters {
    @inline
    def apply(
        ApiKeyAuthParameters: js.UndefOr[UpdateConnectionApiKeyAuthRequestParameters] = js.undefined,
        BasicAuthParameters: js.UndefOr[UpdateConnectionBasicAuthRequestParameters] = js.undefined,
        InvocationHttpParameters: js.UndefOr[ConnectionHttpParameters] = js.undefined,
        OAuthParameters: js.UndefOr[UpdateConnectionOAuthRequestParameters] = js.undefined
    ): UpdateConnectionAuthRequestParameters = {
      val __obj = js.Dynamic.literal()
      ApiKeyAuthParameters.foreach(__v => __obj.updateDynamic("ApiKeyAuthParameters")(__v.asInstanceOf[js.Any]))
      BasicAuthParameters.foreach(__v => __obj.updateDynamic("BasicAuthParameters")(__v.asInstanceOf[js.Any]))
      InvocationHttpParameters.foreach(__v => __obj.updateDynamic("InvocationHttpParameters")(__v.asInstanceOf[js.Any]))
      OAuthParameters.foreach(__v => __obj.updateDynamic("OAuthParameters")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateConnectionAuthRequestParameters]
    }
  }

  /** Contains the Basic authorization parameters for the connection.
    */
  @js.native
  trait UpdateConnectionBasicAuthRequestParameters extends js.Object {
    var Password: js.UndefOr[AuthHeaderParameters]
    var Username: js.UndefOr[AuthHeaderParameters]
  }

  object UpdateConnectionBasicAuthRequestParameters {
    @inline
    def apply(
        Password: js.UndefOr[AuthHeaderParameters] = js.undefined,
        Username: js.UndefOr[AuthHeaderParameters] = js.undefined
    ): UpdateConnectionBasicAuthRequestParameters = {
      val __obj = js.Dynamic.literal()
      Password.foreach(__v => __obj.updateDynamic("Password")(__v.asInstanceOf[js.Any]))
      Username.foreach(__v => __obj.updateDynamic("Username")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateConnectionBasicAuthRequestParameters]
    }
  }

  /** Contains the OAuth authorization parameters to use for the connection.
    */
  @js.native
  trait UpdateConnectionOAuthClientRequestParameters extends js.Object {
    var ClientID: js.UndefOr[AuthHeaderParameters]
    var ClientSecret: js.UndefOr[AuthHeaderParameters]
  }

  object UpdateConnectionOAuthClientRequestParameters {
    @inline
    def apply(
        ClientID: js.UndefOr[AuthHeaderParameters] = js.undefined,
        ClientSecret: js.UndefOr[AuthHeaderParameters] = js.undefined
    ): UpdateConnectionOAuthClientRequestParameters = {
      val __obj = js.Dynamic.literal()
      ClientID.foreach(__v => __obj.updateDynamic("ClientID")(__v.asInstanceOf[js.Any]))
      ClientSecret.foreach(__v => __obj.updateDynamic("ClientSecret")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateConnectionOAuthClientRequestParameters]
    }
  }

  /** Contains the OAuth request parameters to use for the connection.
    */
  @js.native
  trait UpdateConnectionOAuthRequestParameters extends js.Object {
    var AuthorizationEndpoint: js.UndefOr[HttpsEndpoint]
    var ClientParameters: js.UndefOr[UpdateConnectionOAuthClientRequestParameters]
    var HttpMethod: js.UndefOr[ConnectionOAuthHttpMethod]
    var OAuthHttpParameters: js.UndefOr[ConnectionHttpParameters]
  }

  object UpdateConnectionOAuthRequestParameters {
    @inline
    def apply(
        AuthorizationEndpoint: js.UndefOr[HttpsEndpoint] = js.undefined,
        ClientParameters: js.UndefOr[UpdateConnectionOAuthClientRequestParameters] = js.undefined,
        HttpMethod: js.UndefOr[ConnectionOAuthHttpMethod] = js.undefined,
        OAuthHttpParameters: js.UndefOr[ConnectionHttpParameters] = js.undefined
    ): UpdateConnectionOAuthRequestParameters = {
      val __obj = js.Dynamic.literal()
      AuthorizationEndpoint.foreach(__v => __obj.updateDynamic("AuthorizationEndpoint")(__v.asInstanceOf[js.Any]))
      ClientParameters.foreach(__v => __obj.updateDynamic("ClientParameters")(__v.asInstanceOf[js.Any]))
      HttpMethod.foreach(__v => __obj.updateDynamic("HttpMethod")(__v.asInstanceOf[js.Any]))
      OAuthHttpParameters.foreach(__v => __obj.updateDynamic("OAuthHttpParameters")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateConnectionOAuthRequestParameters]
    }
  }

  @js.native
  trait UpdateConnectionRequest extends js.Object {
    var Name: ConnectionName
    var AuthParameters: js.UndefOr[UpdateConnectionAuthRequestParameters]
    var AuthorizationType: js.UndefOr[ConnectionAuthorizationType]
    var Description: js.UndefOr[ConnectionDescription]
  }

  object UpdateConnectionRequest {
    @inline
    def apply(
        Name: ConnectionName,
        AuthParameters: js.UndefOr[UpdateConnectionAuthRequestParameters] = js.undefined,
        AuthorizationType: js.UndefOr[ConnectionAuthorizationType] = js.undefined,
        Description: js.UndefOr[ConnectionDescription] = js.undefined
    ): UpdateConnectionRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      AuthParameters.foreach(__v => __obj.updateDynamic("AuthParameters")(__v.asInstanceOf[js.Any]))
      AuthorizationType.foreach(__v => __obj.updateDynamic("AuthorizationType")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateConnectionRequest]
    }
  }

  @js.native
  trait UpdateConnectionResponse extends js.Object {
    var ConnectionArn: js.UndefOr[ConnectionArn]
    var ConnectionState: js.UndefOr[ConnectionState]
    var CreationTime: js.UndefOr[Timestamp]
    var LastAuthorizedTime: js.UndefOr[Timestamp]
    var LastModifiedTime: js.UndefOr[Timestamp]
  }

  object UpdateConnectionResponse {
    @inline
    def apply(
        ConnectionArn: js.UndefOr[ConnectionArn] = js.undefined,
        ConnectionState: js.UndefOr[ConnectionState] = js.undefined,
        CreationTime: js.UndefOr[Timestamp] = js.undefined,
        LastAuthorizedTime: js.UndefOr[Timestamp] = js.undefined,
        LastModifiedTime: js.UndefOr[Timestamp] = js.undefined
    ): UpdateConnectionResponse = {
      val __obj = js.Dynamic.literal()
      ConnectionArn.foreach(__v => __obj.updateDynamic("ConnectionArn")(__v.asInstanceOf[js.Any]))
      ConnectionState.foreach(__v => __obj.updateDynamic("ConnectionState")(__v.asInstanceOf[js.Any]))
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      LastAuthorizedTime.foreach(__v => __obj.updateDynamic("LastAuthorizedTime")(__v.asInstanceOf[js.Any]))
      LastModifiedTime.foreach(__v => __obj.updateDynamic("LastModifiedTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateConnectionResponse]
    }
  }
}
