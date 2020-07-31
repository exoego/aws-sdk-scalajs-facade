package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

package object codeguruprofiler {
  type AgentParameters = js.Dictionary[String]
  type AgentProfile = js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type AggregatedProfile = js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type Anomalies = js.Array[Anomaly]
  type AnomalyInstanceId = String
  type AnomalyInstances = js.Array[AnomalyInstance]
  type ChannelId = String
  type ChannelUri = String
  type Channels = js.Array[Channel]
  type ClientToken = String
  type EventPublishers = js.Array[EventPublisher]
  type FindingsReportId = String
  type FindingsReportSummaries = js.Array[FindingsReportSummary]
  type FleetInstanceId = String
  type FrameMetricData = js.Array[FrameMetricDatum]
  type FrameMetricValues = js.Array[Double]
  type FrameMetrics = js.Array[FrameMetric]
  type ListOfTimestamps = js.Array[TimestampStructure]
  type Locale = String
  type Matches = js.Array[Match]
  type MaxDepth = Int
  type MaxResults = Int
  type Metadata = js.Dictionary[String]
  type PaginationToken = String
  type Percentage = Double
  type Period = String
  type Principal = String
  type Principals = js.Array[Principal]
  type ProfileTimes = js.Array[ProfileTime]
  type ProfilingGroupArn = String
  type ProfilingGroupDescriptions = js.Array[ProfilingGroupDescription]
  type ProfilingGroupName = String
  type ProfilingGroupNames = js.Array[ProfilingGroupName]
  type Recommendations = js.Array[Recommendation]
  type RevisionId = String
  type Strings = js.Array[String]
  type TagKeys = js.Array[String]
  type TagsMap = js.Dictionary[String]
  type TargetFrame = js.Array[String]
  type TargetFrames = js.Array[TargetFrame]
  type ThreadStates = js.Array[String]
  type Timestamp = js.Date
  type UnprocessedEndTimeMap = js.Dictionary[ListOfTimestamps]

  implicit final class CodeGuruProfilerOps(private val service: CodeGuruProfiler) extends AnyVal {

    @inline def addNotificationChannelsFuture(params: AddNotificationChannelsRequest): Future[AddNotificationChannelsResponse] = service.addNotificationChannels(params).promise().toFuture
    @inline def batchGetFrameMetricDataFuture(params: BatchGetFrameMetricDataRequest): Future[BatchGetFrameMetricDataResponse] = service.batchGetFrameMetricData(params).promise().toFuture
    @inline def configureAgentFuture(params: ConfigureAgentRequest): Future[ConfigureAgentResponse] = service.configureAgent(params).promise().toFuture
    @inline def createProfilingGroupFuture(params: CreateProfilingGroupRequest): Future[CreateProfilingGroupResponse] = service.createProfilingGroup(params).promise().toFuture
    @inline def deleteProfilingGroupFuture(params: DeleteProfilingGroupRequest): Future[DeleteProfilingGroupResponse] = service.deleteProfilingGroup(params).promise().toFuture
    @inline def describeProfilingGroupFuture(params: DescribeProfilingGroupRequest): Future[DescribeProfilingGroupResponse] = service.describeProfilingGroup(params).promise().toFuture
    @inline def getFindingsReportAccountSummaryFuture(params: GetFindingsReportAccountSummaryRequest): Future[GetFindingsReportAccountSummaryResponse] = service.getFindingsReportAccountSummary(params).promise().toFuture
    @inline def getNotificationConfigurationFuture(params: GetNotificationConfigurationRequest): Future[GetNotificationConfigurationResponse] = service.getNotificationConfiguration(params).promise().toFuture
    @inline def getPolicyFuture(params: GetPolicyRequest): Future[GetPolicyResponse] = service.getPolicy(params).promise().toFuture
    @inline def getProfileFuture(params: GetProfileRequest): Future[GetProfileResponse] = service.getProfile(params).promise().toFuture
    @inline def getRecommendationsFuture(params: GetRecommendationsRequest): Future[GetRecommendationsResponse] = service.getRecommendations(params).promise().toFuture
    @inline def listFindingsReportsFuture(params: ListFindingsReportsRequest): Future[ListFindingsReportsResponse] = service.listFindingsReports(params).promise().toFuture
    @inline def listProfileTimesFuture(params: ListProfileTimesRequest): Future[ListProfileTimesResponse] = service.listProfileTimes(params).promise().toFuture
    @inline def listProfilingGroupsFuture(params: ListProfilingGroupsRequest): Future[ListProfilingGroupsResponse] = service.listProfilingGroups(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] = service.listTagsForResource(params).promise().toFuture
    @inline def postAgentProfileFuture(params: PostAgentProfileRequest): Future[PostAgentProfileResponse] = service.postAgentProfile(params).promise().toFuture
    @inline def putPermissionFuture(params: PutPermissionRequest): Future[PutPermissionResponse] = service.putPermission(params).promise().toFuture
    @inline def removeNotificationChannelFuture(params: RemoveNotificationChannelRequest): Future[RemoveNotificationChannelResponse] = service.removeNotificationChannel(params).promise().toFuture
    @inline def removePermissionFuture(params: RemovePermissionRequest): Future[RemovePermissionResponse] = service.removePermission(params).promise().toFuture
    @inline def submitFeedbackFuture(params: SubmitFeedbackRequest): Future[SubmitFeedbackResponse] = service.submitFeedback(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] = service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] = service.untagResource(params).promise().toFuture
    @inline def updateProfilingGroupFuture(params: UpdateProfilingGroupRequest): Future[UpdateProfilingGroupResponse] = service.updateProfilingGroup(params).promise().toFuture
  }
}

package codeguruprofiler {
  @js.native
  @JSImport("aws-sdk", "CodeGuruProfiler", "AWS.CodeGuruProfiler")
  class CodeGuruProfiler() extends js.Object {
    def this(config: AWSConfig) = this()

    def addNotificationChannels(params: AddNotificationChannelsRequest): Request[AddNotificationChannelsResponse] = js.native
    def batchGetFrameMetricData(params: BatchGetFrameMetricDataRequest): Request[BatchGetFrameMetricDataResponse] = js.native
    def configureAgent(params: ConfigureAgentRequest): Request[ConfigureAgentResponse] = js.native
    def createProfilingGroup(params: CreateProfilingGroupRequest): Request[CreateProfilingGroupResponse] = js.native
    def deleteProfilingGroup(params: DeleteProfilingGroupRequest): Request[DeleteProfilingGroupResponse] = js.native
    def describeProfilingGroup(params: DescribeProfilingGroupRequest): Request[DescribeProfilingGroupResponse] = js.native
    def getFindingsReportAccountSummary(params: GetFindingsReportAccountSummaryRequest): Request[GetFindingsReportAccountSummaryResponse] = js.native
    def getNotificationConfiguration(params: GetNotificationConfigurationRequest): Request[GetNotificationConfigurationResponse] = js.native
    def getPolicy(params: GetPolicyRequest): Request[GetPolicyResponse] = js.native
    def getProfile(params: GetProfileRequest): Request[GetProfileResponse] = js.native
    def getRecommendations(params: GetRecommendationsRequest): Request[GetRecommendationsResponse] = js.native
    def listFindingsReports(params: ListFindingsReportsRequest): Request[ListFindingsReportsResponse] = js.native
    def listProfileTimes(params: ListProfileTimesRequest): Request[ListProfileTimesResponse] = js.native
    def listProfilingGroups(params: ListProfilingGroupsRequest): Request[ListProfilingGroupsResponse] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def postAgentProfile(params: PostAgentProfileRequest): Request[PostAgentProfileResponse] = js.native
    def putPermission(params: PutPermissionRequest): Request[PutPermissionResponse] = js.native
    def removeNotificationChannel(params: RemoveNotificationChannelRequest): Request[RemoveNotificationChannelResponse] = js.native
    def removePermission(params: RemovePermissionRequest): Request[RemovePermissionResponse] = js.native
    def submitFeedback(params: SubmitFeedbackRequest): Request[SubmitFeedbackResponse] = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse] = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse] = js.native
    def updateProfilingGroup(params: UpdateProfilingGroupRequest): Request[UpdateProfilingGroupResponse] = js.native
  }

  @js.native
  sealed trait ActionGroup extends js.Any
  object ActionGroup {
    @inline def agentPermissions = "agentPermissions".asInstanceOf[ActionGroup]

    @inline def values = js.Object.freeze(js.Array(agentPermissions))
  }

  /**
    * The structure representing the AddNotificationChannelsRequest.
    */
  @js.native
  trait AddNotificationChannelsRequest extends js.Object {
    var channels: Channels
    var profilingGroupName: ProfilingGroupName
  }

  object AddNotificationChannelsRequest {
    @inline
    def apply(
        channels: Channels,
        profilingGroupName: ProfilingGroupName
    ): AddNotificationChannelsRequest = {
      val __obj = js.Dynamic.literal(
        "channels" -> channels.asInstanceOf[js.Any],
        "profilingGroupName" -> profilingGroupName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[AddNotificationChannelsRequest]
    }
  }

  /**
    * The structure representing the AddNotificationChannelsResponse.
    */
  @js.native
  trait AddNotificationChannelsResponse extends js.Object {
    var notificationConfiguration: js.UndefOr[NotificationConfiguration]
  }

  object AddNotificationChannelsResponse {
    @inline
    def apply(
        notificationConfiguration: js.UndefOr[NotificationConfiguration] = js.undefined
    ): AddNotificationChannelsResponse = {
      val __obj = js.Dynamic.literal()
      notificationConfiguration.foreach(__v => __obj.updateDynamic("notificationConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AddNotificationChannelsResponse]
    }
  }

  /**
    * The response of <a href="https://docs.aws.amazon.com/codeguru/latest/profiler-api/API_ConfigureAgent.html"> <code>ConfigureAgent</code> </a> that specifies if an agent profiles or not and for how long to return profiling data.
    */
  @js.native
  trait AgentConfiguration extends js.Object {
    var periodInSeconds: Int
    var shouldProfile: Boolean
    var agentParameters: js.UndefOr[AgentParameters]
  }

  object AgentConfiguration {
    @inline
    def apply(
        periodInSeconds: Int,
        shouldProfile: Boolean,
        agentParameters: js.UndefOr[AgentParameters] = js.undefined
    ): AgentConfiguration = {
      val __obj = js.Dynamic.literal(
        "periodInSeconds" -> periodInSeconds.asInstanceOf[js.Any],
        "shouldProfile" -> shouldProfile.asInstanceOf[js.Any]
      )

      agentParameters.foreach(__v => __obj.updateDynamic("agentParameters")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AgentConfiguration]
    }
  }

  /**
    * Specifies whether profiling is enabled or disabled for a profiling group. It is used by <a href="https://docs.aws.amazon.com/codeguru/latest/profiler-api/API_ConfigureAgent.html"> <code>ConfigureAgent</code> </a> to enable or disable profiling for a profiling group.
    */
  @js.native
  trait AgentOrchestrationConfig extends js.Object {
    var profilingEnabled: Boolean
  }

  object AgentOrchestrationConfig {
    @inline
    def apply(
        profilingEnabled: Boolean
    ): AgentOrchestrationConfig = {
      val __obj = js.Dynamic.literal(
        "profilingEnabled" -> profilingEnabled.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[AgentOrchestrationConfig]
    }
  }

  @js.native
  sealed trait AgentParameterField extends js.Any
  object AgentParameterField {
    @inline def MaxStackDepth = "MaxStackDepth".asInstanceOf[AgentParameterField]
    @inline def MemoryUsageLimitPercent = "MemoryUsageLimitPercent".asInstanceOf[AgentParameterField]
    @inline def MinimumTimeForReportingInMilliseconds = "MinimumTimeForReportingInMilliseconds".asInstanceOf[AgentParameterField]
    @inline def ReportingIntervalInMilliseconds = "ReportingIntervalInMilliseconds".asInstanceOf[AgentParameterField]
    @inline def SamplingIntervalInMilliseconds = "SamplingIntervalInMilliseconds".asInstanceOf[AgentParameterField]

    @inline def values = js.Object.freeze(js.Array(MaxStackDepth, MemoryUsageLimitPercent, MinimumTimeForReportingInMilliseconds, ReportingIntervalInMilliseconds, SamplingIntervalInMilliseconds))
  }

  /**
    * Specifies the aggregation period and aggregation start time for an aggregated profile. An aggregated profile is used to collect posted agent profiles during an aggregation period. There are three possible aggregation periods (1 day, 1 hour, or 5 minutes).
    */
  @js.native
  trait AggregatedProfileTime extends js.Object {
    var period: js.UndefOr[AggregationPeriod]
    var start: js.UndefOr[Timestamp]
  }

  object AggregatedProfileTime {
    @inline
    def apply(
        period: js.UndefOr[AggregationPeriod] = js.undefined,
        start: js.UndefOr[Timestamp] = js.undefined
    ): AggregatedProfileTime = {
      val __obj = js.Dynamic.literal()
      period.foreach(__v => __obj.updateDynamic("period")(__v.asInstanceOf[js.Any]))
      start.foreach(__v => __obj.updateDynamic("start")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AggregatedProfileTime]
    }
  }

  @js.native
  sealed trait AggregationPeriod extends js.Any
  object AggregationPeriod {
    @inline def P1D = "P1D".asInstanceOf[AggregationPeriod]
    @inline def PT1H = "PT1H".asInstanceOf[AggregationPeriod]
    @inline def PT5M = "PT5M".asInstanceOf[AggregationPeriod]

    @inline def values = js.Object.freeze(js.Array(P1D, PT1H, PT5M))
  }

  /**
    * Details about an anomaly in a specific metric of application profile. The anomaly is detected using analysis of the metric data over a period of time.
    */
  @js.native
  trait Anomaly extends js.Object {
    var instances: AnomalyInstances
    var metric: Metric
    var reason: String
  }

  object Anomaly {
    @inline
    def apply(
        instances: AnomalyInstances,
        metric: Metric,
        reason: String
    ): Anomaly = {
      val __obj = js.Dynamic.literal(
        "instances" -> instances.asInstanceOf[js.Any],
        "metric" -> metric.asInstanceOf[js.Any],
        "reason" -> reason.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[Anomaly]
    }
  }

  /**
    * The specific duration in which the metric is flagged as anomalous.
    */
  @js.native
  trait AnomalyInstance extends js.Object {
    var id: String
    var startTime: Timestamp
    var endTime: js.UndefOr[Timestamp]
    var userFeedback: js.UndefOr[UserFeedback]
  }

  object AnomalyInstance {
    @inline
    def apply(
        id: String,
        startTime: Timestamp,
        endTime: js.UndefOr[Timestamp] = js.undefined,
        userFeedback: js.UndefOr[UserFeedback] = js.undefined
    ): AnomalyInstance = {
      val __obj = js.Dynamic.literal(
        "id" -> id.asInstanceOf[js.Any],
        "startTime" -> startTime.asInstanceOf[js.Any]
      )

      endTime.foreach(__v => __obj.updateDynamic("endTime")(__v.asInstanceOf[js.Any]))
      userFeedback.foreach(__v => __obj.updateDynamic("userFeedback")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AnomalyInstance]
    }
  }

  /**
    * The structure representing the BatchGetFrameMetricDataRequest.
    */
  @js.native
  trait BatchGetFrameMetricDataRequest extends js.Object {
    var profilingGroupName: ProfilingGroupName
    var endTime: js.UndefOr[Timestamp]
    var frameMetrics: js.UndefOr[FrameMetrics]
    var period: js.UndefOr[Period]
    var startTime: js.UndefOr[Timestamp]
    var targetResolution: js.UndefOr[AggregationPeriod]
  }

  object BatchGetFrameMetricDataRequest {
    @inline
    def apply(
        profilingGroupName: ProfilingGroupName,
        endTime: js.UndefOr[Timestamp] = js.undefined,
        frameMetrics: js.UndefOr[FrameMetrics] = js.undefined,
        period: js.UndefOr[Period] = js.undefined,
        startTime: js.UndefOr[Timestamp] = js.undefined,
        targetResolution: js.UndefOr[AggregationPeriod] = js.undefined
    ): BatchGetFrameMetricDataRequest = {
      val __obj = js.Dynamic.literal(
        "profilingGroupName" -> profilingGroupName.asInstanceOf[js.Any]
      )

      endTime.foreach(__v => __obj.updateDynamic("endTime")(__v.asInstanceOf[js.Any]))
      frameMetrics.foreach(__v => __obj.updateDynamic("frameMetrics")(__v.asInstanceOf[js.Any]))
      period.foreach(__v => __obj.updateDynamic("period")(__v.asInstanceOf[js.Any]))
      startTime.foreach(__v => __obj.updateDynamic("startTime")(__v.asInstanceOf[js.Any]))
      targetResolution.foreach(__v => __obj.updateDynamic("targetResolution")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchGetFrameMetricDataRequest]
    }
  }

  /**
    * The structure representing the BatchGetFrameMetricDataResponse.
    */
  @js.native
  trait BatchGetFrameMetricDataResponse extends js.Object {
    var endTime: Timestamp
    var endTimes: ListOfTimestamps
    var frameMetricData: FrameMetricData
    var resolution: AggregationPeriod
    var startTime: Timestamp
    var unprocessedEndTimes: UnprocessedEndTimeMap
  }

  object BatchGetFrameMetricDataResponse {
    @inline
    def apply(
        endTime: Timestamp,
        endTimes: ListOfTimestamps,
        frameMetricData: FrameMetricData,
        resolution: AggregationPeriod,
        startTime: Timestamp,
        unprocessedEndTimes: UnprocessedEndTimeMap
    ): BatchGetFrameMetricDataResponse = {
      val __obj = js.Dynamic.literal(
        "endTime" -> endTime.asInstanceOf[js.Any],
        "endTimes" -> endTimes.asInstanceOf[js.Any],
        "frameMetricData" -> frameMetricData.asInstanceOf[js.Any],
        "resolution" -> resolution.asInstanceOf[js.Any],
        "startTime" -> startTime.asInstanceOf[js.Any],
        "unprocessedEndTimes" -> unprocessedEndTimes.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[BatchGetFrameMetricDataResponse]
    }
  }

  /**
    * Notification medium for users to get alerted for events that occur in application profile. We support SNS topic as a notification channel.
    */
  @js.native
  trait Channel extends js.Object {
    var eventPublishers: EventPublishers
    var uri: ChannelUri
    var id: js.UndefOr[ChannelId]
  }

  object Channel {
    @inline
    def apply(
        eventPublishers: EventPublishers,
        uri: ChannelUri,
        id: js.UndefOr[ChannelId] = js.undefined
    ): Channel = {
      val __obj = js.Dynamic.literal(
        "eventPublishers" -> eventPublishers.asInstanceOf[js.Any],
        "uri" -> uri.asInstanceOf[js.Any]
      )

      id.foreach(__v => __obj.updateDynamic("id")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Channel]
    }
  }

  @js.native
  sealed trait ComputePlatform extends js.Any
  object ComputePlatform {
    @inline def AWSLambda = "AWSLambda".asInstanceOf[ComputePlatform]
    @inline def Default = "Default".asInstanceOf[ComputePlatform]

    @inline def values = js.Object.freeze(js.Array(AWSLambda, Default))
  }

  /**
    * The structure representing the configureAgentRequest.
    */
  @js.native
  trait ConfigureAgentRequest extends js.Object {
    var profilingGroupName: ProfilingGroupName
    var fleetInstanceId: js.UndefOr[FleetInstanceId]
    var metadata: js.UndefOr[Metadata]
  }

  object ConfigureAgentRequest {
    @inline
    def apply(
        profilingGroupName: ProfilingGroupName,
        fleetInstanceId: js.UndefOr[FleetInstanceId] = js.undefined,
        metadata: js.UndefOr[Metadata] = js.undefined
    ): ConfigureAgentRequest = {
      val __obj = js.Dynamic.literal(
        "profilingGroupName" -> profilingGroupName.asInstanceOf[js.Any]
      )

      fleetInstanceId.foreach(__v => __obj.updateDynamic("fleetInstanceId")(__v.asInstanceOf[js.Any]))
      metadata.foreach(__v => __obj.updateDynamic("metadata")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ConfigureAgentRequest]
    }
  }

  /**
    * The structure representing the configureAgentResponse.
    */
  @js.native
  trait ConfigureAgentResponse extends js.Object {
    var configuration: AgentConfiguration
  }

  object ConfigureAgentResponse {
    @inline
    def apply(
        configuration: AgentConfiguration
    ): ConfigureAgentResponse = {
      val __obj = js.Dynamic.literal(
        "configuration" -> configuration.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ConfigureAgentResponse]
    }
  }

  /**
    * The structure representing the createProfiliingGroupRequest.
    */
  @js.native
  trait CreateProfilingGroupRequest extends js.Object {
    var clientToken: ClientToken
    var profilingGroupName: ProfilingGroupName
    var agentOrchestrationConfig: js.UndefOr[AgentOrchestrationConfig]
    var computePlatform: js.UndefOr[ComputePlatform]
    var tags: js.UndefOr[TagsMap]
  }

  object CreateProfilingGroupRequest {
    @inline
    def apply(
        clientToken: ClientToken,
        profilingGroupName: ProfilingGroupName,
        agentOrchestrationConfig: js.UndefOr[AgentOrchestrationConfig] = js.undefined,
        computePlatform: js.UndefOr[ComputePlatform] = js.undefined,
        tags: js.UndefOr[TagsMap] = js.undefined
    ): CreateProfilingGroupRequest = {
      val __obj = js.Dynamic.literal(
        "clientToken" -> clientToken.asInstanceOf[js.Any],
        "profilingGroupName" -> profilingGroupName.asInstanceOf[js.Any]
      )

      agentOrchestrationConfig.foreach(__v => __obj.updateDynamic("agentOrchestrationConfig")(__v.asInstanceOf[js.Any]))
      computePlatform.foreach(__v => __obj.updateDynamic("computePlatform")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateProfilingGroupRequest]
    }
  }

  /**
    * The structure representing the createProfilingGroupResponse.
    */
  @js.native
  trait CreateProfilingGroupResponse extends js.Object {
    var profilingGroup: ProfilingGroupDescription
  }

  object CreateProfilingGroupResponse {
    @inline
    def apply(
        profilingGroup: ProfilingGroupDescription
    ): CreateProfilingGroupResponse = {
      val __obj = js.Dynamic.literal(
        "profilingGroup" -> profilingGroup.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateProfilingGroupResponse]
    }
  }

  /**
    * The structure representing the deleteProfilingGroupRequest.
    */
  @js.native
  trait DeleteProfilingGroupRequest extends js.Object {
    var profilingGroupName: ProfilingGroupName
  }

  object DeleteProfilingGroupRequest {
    @inline
    def apply(
        profilingGroupName: ProfilingGroupName
    ): DeleteProfilingGroupRequest = {
      val __obj = js.Dynamic.literal(
        "profilingGroupName" -> profilingGroupName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteProfilingGroupRequest]
    }
  }

  /**
    * The structure representing the deleteProfilingGroupResponse.
    */
  @js.native
  trait DeleteProfilingGroupResponse extends js.Object {}

  object DeleteProfilingGroupResponse {
    @inline
    def apply(
    ): DeleteProfilingGroupResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DeleteProfilingGroupResponse]
    }
  }

  /**
    * The structure representing the describeProfilingGroupRequest.
    */
  @js.native
  trait DescribeProfilingGroupRequest extends js.Object {
    var profilingGroupName: ProfilingGroupName
  }

  object DescribeProfilingGroupRequest {
    @inline
    def apply(
        profilingGroupName: ProfilingGroupName
    ): DescribeProfilingGroupRequest = {
      val __obj = js.Dynamic.literal(
        "profilingGroupName" -> profilingGroupName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeProfilingGroupRequest]
    }
  }

  /**
    * The structure representing the describeProfilingGroupResponse.
    */
  @js.native
  trait DescribeProfilingGroupResponse extends js.Object {
    var profilingGroup: ProfilingGroupDescription
  }

  object DescribeProfilingGroupResponse {
    @inline
    def apply(
        profilingGroup: ProfilingGroupDescription
    ): DescribeProfilingGroupResponse = {
      val __obj = js.Dynamic.literal(
        "profilingGroup" -> profilingGroup.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeProfilingGroupResponse]
    }
  }

  @js.native
  sealed trait EventPublisher extends js.Any
  object EventPublisher {
    @inline def AnomalyDetection = "AnomalyDetection".asInstanceOf[EventPublisher]

    @inline def values = js.Object.freeze(js.Array(AnomalyDetection))
  }

  @js.native
  sealed trait FeedbackType extends js.Any
  object FeedbackType {
    @inline def Negative = "Negative".asInstanceOf[FeedbackType]
    @inline def Positive = "Positive".asInstanceOf[FeedbackType]

    @inline def values = js.Object.freeze(js.Array(Negative, Positive))
  }

  /**
    * Information about potential recommendations that might be created from the analysis of profiling data.
    */
  @js.native
  trait FindingsReportSummary extends js.Object {
    var id: js.UndefOr[FindingsReportId]
    var profileEndTime: js.UndefOr[Timestamp]
    var profileStartTime: js.UndefOr[Timestamp]
    var profilingGroupName: js.UndefOr[String]
    var totalNumberOfFindings: js.UndefOr[Int]
  }

  object FindingsReportSummary {
    @inline
    def apply(
        id: js.UndefOr[FindingsReportId] = js.undefined,
        profileEndTime: js.UndefOr[Timestamp] = js.undefined,
        profileStartTime: js.UndefOr[Timestamp] = js.undefined,
        profilingGroupName: js.UndefOr[String] = js.undefined,
        totalNumberOfFindings: js.UndefOr[Int] = js.undefined
    ): FindingsReportSummary = {
      val __obj = js.Dynamic.literal()
      id.foreach(__v => __obj.updateDynamic("id")(__v.asInstanceOf[js.Any]))
      profileEndTime.foreach(__v => __obj.updateDynamic("profileEndTime")(__v.asInstanceOf[js.Any]))
      profileStartTime.foreach(__v => __obj.updateDynamic("profileStartTime")(__v.asInstanceOf[js.Any]))
      profilingGroupName.foreach(__v => __obj.updateDynamic("profilingGroupName")(__v.asInstanceOf[js.Any]))
      totalNumberOfFindings.foreach(__v => __obj.updateDynamic("totalNumberOfFindings")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FindingsReportSummary]
    }
  }

  /**
    * The frame name, metric type, and thread states. These are used to derive the value of the metric for the frame.
    */
  @js.native
  trait FrameMetric extends js.Object {
    var frameName: String
    var threadStates: ThreadStates
    var `type`: MetricType
  }

  object FrameMetric {
    @inline
    def apply(
        frameName: String,
        threadStates: ThreadStates,
        `type`: MetricType
    ): FrameMetric = {
      val __obj = js.Dynamic.literal(
        "frameName" -> frameName.asInstanceOf[js.Any],
        "threadStates" -> threadStates.asInstanceOf[js.Any],
        "type" -> `type`.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[FrameMetric]
    }
  }

  /**
    * Information about a frame metric and its values.
    */
  @js.native
  trait FrameMetricDatum extends js.Object {
    var frameMetric: FrameMetric
    var values: FrameMetricValues
  }

  object FrameMetricDatum {
    @inline
    def apply(
        frameMetric: FrameMetric,
        values: FrameMetricValues
    ): FrameMetricDatum = {
      val __obj = js.Dynamic.literal(
        "frameMetric" -> frameMetric.asInstanceOf[js.Any],
        "values" -> values.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[FrameMetricDatum]
    }
  }

  /**
    * The structure representing the GetFindingsReportAccountSummaryRequest.
    */
  @js.native
  trait GetFindingsReportAccountSummaryRequest extends js.Object {
    var dailyReportsOnly: js.UndefOr[Boolean]
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object GetFindingsReportAccountSummaryRequest {
    @inline
    def apply(
        dailyReportsOnly: js.UndefOr[Boolean] = js.undefined,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): GetFindingsReportAccountSummaryRequest = {
      val __obj = js.Dynamic.literal()
      dailyReportsOnly.foreach(__v => __obj.updateDynamic("dailyReportsOnly")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetFindingsReportAccountSummaryRequest]
    }
  }

  /**
    * The structure representing the GetFindingsReportAccountSummaryResponse.
    */
  @js.native
  trait GetFindingsReportAccountSummaryResponse extends js.Object {
    var reportSummaries: FindingsReportSummaries
    var nextToken: js.UndefOr[PaginationToken]
  }

  object GetFindingsReportAccountSummaryResponse {
    @inline
    def apply(
        reportSummaries: FindingsReportSummaries,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): GetFindingsReportAccountSummaryResponse = {
      val __obj = js.Dynamic.literal(
        "reportSummaries" -> reportSummaries.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetFindingsReportAccountSummaryResponse]
    }
  }

  /**
    * The structure representing the GetNotificationConfigurationRequest.
    */
  @js.native
  trait GetNotificationConfigurationRequest extends js.Object {
    var profilingGroupName: ProfilingGroupName
  }

  object GetNotificationConfigurationRequest {
    @inline
    def apply(
        profilingGroupName: ProfilingGroupName
    ): GetNotificationConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "profilingGroupName" -> profilingGroupName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetNotificationConfigurationRequest]
    }
  }

  /**
    * The structure representing the GetNotificationConfigurationResponse.
    */
  @js.native
  trait GetNotificationConfigurationResponse extends js.Object {
    var notificationConfiguration: NotificationConfiguration
  }

  object GetNotificationConfigurationResponse {
    @inline
    def apply(
        notificationConfiguration: NotificationConfiguration
    ): GetNotificationConfigurationResponse = {
      val __obj = js.Dynamic.literal(
        "notificationConfiguration" -> notificationConfiguration.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetNotificationConfigurationResponse]
    }
  }

  /**
    * The structure representing the <code>getPolicyRequest</code>.
    */
  @js.native
  trait GetPolicyRequest extends js.Object {
    var profilingGroupName: ProfilingGroupName
  }

  object GetPolicyRequest {
    @inline
    def apply(
        profilingGroupName: ProfilingGroupName
    ): GetPolicyRequest = {
      val __obj = js.Dynamic.literal(
        "profilingGroupName" -> profilingGroupName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetPolicyRequest]
    }
  }

  /**
    * The structure representing the <code>getPolicyResponse</code>.
    */
  @js.native
  trait GetPolicyResponse extends js.Object {
    var policy: String
    var revisionId: RevisionId
  }

  object GetPolicyResponse {
    @inline
    def apply(
        policy: String,
        revisionId: RevisionId
    ): GetPolicyResponse = {
      val __obj = js.Dynamic.literal(
        "policy" -> policy.asInstanceOf[js.Any],
        "revisionId" -> revisionId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetPolicyResponse]
    }
  }

  /**
    * The structure representing the getProfileRequest.
    */
  @js.native
  trait GetProfileRequest extends js.Object {
    var profilingGroupName: ProfilingGroupName
    var accept: js.UndefOr[String]
    var endTime: js.UndefOr[Timestamp]
    var maxDepth: js.UndefOr[MaxDepth]
    var period: js.UndefOr[Period]
    var startTime: js.UndefOr[Timestamp]
  }

  object GetProfileRequest {
    @inline
    def apply(
        profilingGroupName: ProfilingGroupName,
        accept: js.UndefOr[String] = js.undefined,
        endTime: js.UndefOr[Timestamp] = js.undefined,
        maxDepth: js.UndefOr[MaxDepth] = js.undefined,
        period: js.UndefOr[Period] = js.undefined,
        startTime: js.UndefOr[Timestamp] = js.undefined
    ): GetProfileRequest = {
      val __obj = js.Dynamic.literal(
        "profilingGroupName" -> profilingGroupName.asInstanceOf[js.Any]
      )

      accept.foreach(__v => __obj.updateDynamic("accept")(__v.asInstanceOf[js.Any]))
      endTime.foreach(__v => __obj.updateDynamic("endTime")(__v.asInstanceOf[js.Any]))
      maxDepth.foreach(__v => __obj.updateDynamic("maxDepth")(__v.asInstanceOf[js.Any]))
      period.foreach(__v => __obj.updateDynamic("period")(__v.asInstanceOf[js.Any]))
      startTime.foreach(__v => __obj.updateDynamic("startTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetProfileRequest]
    }
  }

  /**
    * The structure representing the getProfileResponse.
    */
  @js.native
  trait GetProfileResponse extends js.Object {
    var contentType: String
    var profile: AggregatedProfile
    var contentEncoding: js.UndefOr[String]
  }

  object GetProfileResponse {
    @inline
    def apply(
        contentType: String,
        profile: AggregatedProfile,
        contentEncoding: js.UndefOr[String] = js.undefined
    ): GetProfileResponse = {
      val __obj = js.Dynamic.literal(
        "contentType" -> contentType.asInstanceOf[js.Any],
        "profile" -> profile.asInstanceOf[js.Any]
      )

      contentEncoding.foreach(__v => __obj.updateDynamic("contentEncoding")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetProfileResponse]
    }
  }

  /**
    * The structure representing the GetRecommendationsRequest.
    */
  @js.native
  trait GetRecommendationsRequest extends js.Object {
    var endTime: Timestamp
    var profilingGroupName: ProfilingGroupName
    var startTime: Timestamp
    var locale: js.UndefOr[Locale]
  }

  object GetRecommendationsRequest {
    @inline
    def apply(
        endTime: Timestamp,
        profilingGroupName: ProfilingGroupName,
        startTime: Timestamp,
        locale: js.UndefOr[Locale] = js.undefined
    ): GetRecommendationsRequest = {
      val __obj = js.Dynamic.literal(
        "endTime" -> endTime.asInstanceOf[js.Any],
        "profilingGroupName" -> profilingGroupName.asInstanceOf[js.Any],
        "startTime" -> startTime.asInstanceOf[js.Any]
      )

      locale.foreach(__v => __obj.updateDynamic("locale")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetRecommendationsRequest]
    }
  }

  /**
    * The structure representing the GetRecommendationsResponse.
    */
  @js.native
  trait GetRecommendationsResponse extends js.Object {
    var anomalies: Anomalies
    var profileEndTime: Timestamp
    var profileStartTime: Timestamp
    var profilingGroupName: ProfilingGroupName
    var recommendations: Recommendations
  }

  object GetRecommendationsResponse {
    @inline
    def apply(
        anomalies: Anomalies,
        profileEndTime: Timestamp,
        profileStartTime: Timestamp,
        profilingGroupName: ProfilingGroupName,
        recommendations: Recommendations
    ): GetRecommendationsResponse = {
      val __obj = js.Dynamic.literal(
        "anomalies" -> anomalies.asInstanceOf[js.Any],
        "profileEndTime" -> profileEndTime.asInstanceOf[js.Any],
        "profileStartTime" -> profileStartTime.asInstanceOf[js.Any],
        "profilingGroupName" -> profilingGroupName.asInstanceOf[js.Any],
        "recommendations" -> recommendations.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetRecommendationsResponse]
    }
  }

  /**
    * The structure representing the ListFindingsReportsRequest.
    */
  @js.native
  trait ListFindingsReportsRequest extends js.Object {
    var endTime: Timestamp
    var profilingGroupName: ProfilingGroupName
    var startTime: Timestamp
    var dailyReportsOnly: js.UndefOr[Boolean]
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListFindingsReportsRequest {
    @inline
    def apply(
        endTime: Timestamp,
        profilingGroupName: ProfilingGroupName,
        startTime: Timestamp,
        dailyReportsOnly: js.UndefOr[Boolean] = js.undefined,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListFindingsReportsRequest = {
      val __obj = js.Dynamic.literal(
        "endTime" -> endTime.asInstanceOf[js.Any],
        "profilingGroupName" -> profilingGroupName.asInstanceOf[js.Any],
        "startTime" -> startTime.asInstanceOf[js.Any]
      )

      dailyReportsOnly.foreach(__v => __obj.updateDynamic("dailyReportsOnly")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListFindingsReportsRequest]
    }
  }

  /**
    * The structure representing the ListFindingsReportsResponse.
    */
  @js.native
  trait ListFindingsReportsResponse extends js.Object {
    var findingsReportSummaries: FindingsReportSummaries
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListFindingsReportsResponse {
    @inline
    def apply(
        findingsReportSummaries: FindingsReportSummaries,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListFindingsReportsResponse = {
      val __obj = js.Dynamic.literal(
        "findingsReportSummaries" -> findingsReportSummaries.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListFindingsReportsResponse]
    }
  }

  /**
    * The structure representing the listProfileTimesRequest.
    */
  @js.native
  trait ListProfileTimesRequest extends js.Object {
    var endTime: Timestamp
    var period: AggregationPeriod
    var profilingGroupName: ProfilingGroupName
    var startTime: Timestamp
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[PaginationToken]
    var orderBy: js.UndefOr[OrderBy]
  }

  object ListProfileTimesRequest {
    @inline
    def apply(
        endTime: Timestamp,
        period: AggregationPeriod,
        profilingGroupName: ProfilingGroupName,
        startTime: Timestamp,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[PaginationToken] = js.undefined,
        orderBy: js.UndefOr[OrderBy] = js.undefined
    ): ListProfileTimesRequest = {
      val __obj = js.Dynamic.literal(
        "endTime" -> endTime.asInstanceOf[js.Any],
        "period" -> period.asInstanceOf[js.Any],
        "profilingGroupName" -> profilingGroupName.asInstanceOf[js.Any],
        "startTime" -> startTime.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      orderBy.foreach(__v => __obj.updateDynamic("orderBy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListProfileTimesRequest]
    }
  }

  /**
    * The structure representing the listProfileTimesResponse.
    */
  @js.native
  trait ListProfileTimesResponse extends js.Object {
    var profileTimes: ProfileTimes
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListProfileTimesResponse {
    @inline
    def apply(
        profileTimes: ProfileTimes,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListProfileTimesResponse = {
      val __obj = js.Dynamic.literal(
        "profileTimes" -> profileTimes.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListProfileTimesResponse]
    }
  }

  /**
    * The structure representing the listProfilingGroupsRequest.
    */
  @js.native
  trait ListProfilingGroupsRequest extends js.Object {
    var includeDescription: js.UndefOr[Boolean]
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListProfilingGroupsRequest {
    @inline
    def apply(
        includeDescription: js.UndefOr[Boolean] = js.undefined,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListProfilingGroupsRequest = {
      val __obj = js.Dynamic.literal()
      includeDescription.foreach(__v => __obj.updateDynamic("includeDescription")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListProfilingGroupsRequest]
    }
  }

  /**
    * The structure representing the listProfilingGroupsResponse.
    */
  @js.native
  trait ListProfilingGroupsResponse extends js.Object {
    var profilingGroupNames: ProfilingGroupNames
    var nextToken: js.UndefOr[PaginationToken]
    var profilingGroups: js.UndefOr[ProfilingGroupDescriptions]
  }

  object ListProfilingGroupsResponse {
    @inline
    def apply(
        profilingGroupNames: ProfilingGroupNames,
        nextToken: js.UndefOr[PaginationToken] = js.undefined,
        profilingGroups: js.UndefOr[ProfilingGroupDescriptions] = js.undefined
    ): ListProfilingGroupsResponse = {
      val __obj = js.Dynamic.literal(
        "profilingGroupNames" -> profilingGroupNames.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      profilingGroups.foreach(__v => __obj.updateDynamic("profilingGroups")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListProfilingGroupsResponse]
    }
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var resourceArn: ProfilingGroupArn
  }

  object ListTagsForResourceRequest {
    @inline
    def apply(
        resourceArn: ProfilingGroupArn
    ): ListTagsForResourceRequest = {
      val __obj = js.Dynamic.literal(
        "resourceArn" -> resourceArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ListTagsForResourceRequest]
    }
  }

  @js.native
  trait ListTagsForResourceResponse extends js.Object {
    var tags: js.UndefOr[TagsMap]
  }

  object ListTagsForResourceResponse {
    @inline
    def apply(
        tags: js.UndefOr[TagsMap] = js.undefined
    ): ListTagsForResourceResponse = {
      val __obj = js.Dynamic.literal()
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceResponse]
    }
  }

  /**
    * The part of a profile that contains a recommendation found during analysis.
    */
  @js.native
  trait Match extends js.Object {
    var frameAddress: js.UndefOr[String]
    var targetFramesIndex: js.UndefOr[Int]
    var thresholdBreachValue: js.UndefOr[Double]
  }

  object Match {
    @inline
    def apply(
        frameAddress: js.UndefOr[String] = js.undefined,
        targetFramesIndex: js.UndefOr[Int] = js.undefined,
        thresholdBreachValue: js.UndefOr[Double] = js.undefined
    ): Match = {
      val __obj = js.Dynamic.literal()
      frameAddress.foreach(__v => __obj.updateDynamic("frameAddress")(__v.asInstanceOf[js.Any]))
      targetFramesIndex.foreach(__v => __obj.updateDynamic("targetFramesIndex")(__v.asInstanceOf[js.Any]))
      thresholdBreachValue.foreach(__v => __obj.updateDynamic("thresholdBreachValue")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Match]
    }
  }

  @js.native
  sealed trait MetadataField extends js.Any
  object MetadataField {
    @inline def AgentId = "AgentId".asInstanceOf[MetadataField]
    @inline def AwsRequestId = "AwsRequestId".asInstanceOf[MetadataField]
    @inline def ComputePlatform = "ComputePlatform".asInstanceOf[MetadataField]
    @inline def ExecutionEnvironment = "ExecutionEnvironment".asInstanceOf[MetadataField]
    @inline def LambdaFunctionArn = "LambdaFunctionArn".asInstanceOf[MetadataField]
    @inline def LambdaMemoryLimitInMB = "LambdaMemoryLimitInMB".asInstanceOf[MetadataField]
    @inline def LambdaPreviousExecutionTimeInMilliseconds = "LambdaPreviousExecutionTimeInMilliseconds".asInstanceOf[MetadataField]
    @inline def LambdaRemainingTimeInMilliseconds = "LambdaRemainingTimeInMilliseconds".asInstanceOf[MetadataField]
    @inline def LambdaTimeGapBetweenInvokesInMilliseconds = "LambdaTimeGapBetweenInvokesInMilliseconds".asInstanceOf[MetadataField]

    @inline def values =
      js.Object.freeze(js.Array(
        AgentId,
        AwsRequestId,
        ComputePlatform,
        ExecutionEnvironment,
        LambdaFunctionArn,
        LambdaMemoryLimitInMB,
        LambdaPreviousExecutionTimeInMilliseconds,
        LambdaRemainingTimeInMilliseconds,
        LambdaTimeGapBetweenInvokesInMilliseconds
      ))
  }

  /**
    * Details about the metric that the analysis used when it detected the anomaly. The metric what is analyzed to create recommendations. It includes the name of the frame that was analyzed and the type and thread states used to derive the metric value for that frame.
    */
  @js.native
  trait Metric extends js.Object {
    var frameName: String
    var threadStates: Strings
    var `type`: MetricType
  }

  object Metric {
    @inline
    def apply(
        frameName: String,
        threadStates: Strings,
        `type`: MetricType
    ): Metric = {
      val __obj = js.Dynamic.literal(
        "frameName" -> frameName.asInstanceOf[js.Any],
        "threadStates" -> threadStates.asInstanceOf[js.Any],
        "type" -> `type`.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[Metric]
    }
  }

  @js.native
  sealed trait MetricType extends js.Any
  object MetricType {
    @inline def AggregatedRelativeTotalTime = "AggregatedRelativeTotalTime".asInstanceOf[MetricType]

    @inline def values = js.Object.freeze(js.Array(AggregatedRelativeTotalTime))
  }

  /**
    * The configuration for notifications stored for each profiling group. This includes up to to two channels and a list of event publishers associated with each channel.
    */
  @js.native
  trait NotificationConfiguration extends js.Object {
    var channels: js.UndefOr[Channels]
  }

  object NotificationConfiguration {
    @inline
    def apply(
        channels: js.UndefOr[Channels] = js.undefined
    ): NotificationConfiguration = {
      val __obj = js.Dynamic.literal()
      channels.foreach(__v => __obj.updateDynamic("channels")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NotificationConfiguration]
    }
  }

  @js.native
  sealed trait OrderBy extends js.Any
  object OrderBy {
    @inline def TimestampAscending = "TimestampAscending".asInstanceOf[OrderBy]
    @inline def TimestampDescending = "TimestampDescending".asInstanceOf[OrderBy]

    @inline def values = js.Object.freeze(js.Array(TimestampAscending, TimestampDescending))
  }

  /**
    * A set of rules used to make a recommendation during an analysis.
    */
  @js.native
  trait Pattern extends js.Object {
    var countersToAggregate: js.UndefOr[Strings]
    var description: js.UndefOr[String]
    var id: js.UndefOr[String]
    var name: js.UndefOr[String]
    var resolutionSteps: js.UndefOr[String]
    var targetFrames: js.UndefOr[TargetFrames]
    var thresholdPercent: js.UndefOr[Percentage]
  }

  object Pattern {
    @inline
    def apply(
        countersToAggregate: js.UndefOr[Strings] = js.undefined,
        description: js.UndefOr[String] = js.undefined,
        id: js.UndefOr[String] = js.undefined,
        name: js.UndefOr[String] = js.undefined,
        resolutionSteps: js.UndefOr[String] = js.undefined,
        targetFrames: js.UndefOr[TargetFrames] = js.undefined,
        thresholdPercent: js.UndefOr[Percentage] = js.undefined
    ): Pattern = {
      val __obj = js.Dynamic.literal()
      countersToAggregate.foreach(__v => __obj.updateDynamic("countersToAggregate")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      id.foreach(__v => __obj.updateDynamic("id")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      resolutionSteps.foreach(__v => __obj.updateDynamic("resolutionSteps")(__v.asInstanceOf[js.Any]))
      targetFrames.foreach(__v => __obj.updateDynamic("targetFrames")(__v.asInstanceOf[js.Any]))
      thresholdPercent.foreach(__v => __obj.updateDynamic("thresholdPercent")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Pattern]
    }
  }

  /**
    * The structure representing the postAgentProfileRequest.
    */
  @js.native
  trait PostAgentProfileRequest extends js.Object {
    var agentProfile: AgentProfile
    var contentType: String
    var profilingGroupName: ProfilingGroupName
    var profileToken: js.UndefOr[ClientToken]
  }

  object PostAgentProfileRequest {
    @inline
    def apply(
        agentProfile: AgentProfile,
        contentType: String,
        profilingGroupName: ProfilingGroupName,
        profileToken: js.UndefOr[ClientToken] = js.undefined
    ): PostAgentProfileRequest = {
      val __obj = js.Dynamic.literal(
        "agentProfile" -> agentProfile.asInstanceOf[js.Any],
        "contentType" -> contentType.asInstanceOf[js.Any],
        "profilingGroupName" -> profilingGroupName.asInstanceOf[js.Any]
      )

      profileToken.foreach(__v => __obj.updateDynamic("profileToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PostAgentProfileRequest]
    }
  }

  /**
    * The structure representing the postAgentProfileResponse.
    */
  @js.native
  trait PostAgentProfileResponse extends js.Object {}

  object PostAgentProfileResponse {
    @inline
    def apply(
    ): PostAgentProfileResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[PostAgentProfileResponse]
    }
  }

  /**
    * Contains the start time of a profile.
    */
  @js.native
  trait ProfileTime extends js.Object {
    var start: js.UndefOr[Timestamp]
  }

  object ProfileTime {
    @inline
    def apply(
        start: js.UndefOr[Timestamp] = js.undefined
    ): ProfileTime = {
      val __obj = js.Dynamic.literal()
      start.foreach(__v => __obj.updateDynamic("start")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ProfileTime]
    }
  }

  /**
    * Contains information about a profiling group.
    */
  @js.native
  trait ProfilingGroupDescription extends js.Object {
    var agentOrchestrationConfig: js.UndefOr[AgentOrchestrationConfig]
    var arn: js.UndefOr[ProfilingGroupArn]
    var computePlatform: js.UndefOr[ComputePlatform]
    var createdAt: js.UndefOr[Timestamp]
    var name: js.UndefOr[ProfilingGroupName]
    var profilingStatus: js.UndefOr[ProfilingStatus]
    var tags: js.UndefOr[TagsMap]
    var updatedAt: js.UndefOr[Timestamp]
  }

  object ProfilingGroupDescription {
    @inline
    def apply(
        agentOrchestrationConfig: js.UndefOr[AgentOrchestrationConfig] = js.undefined,
        arn: js.UndefOr[ProfilingGroupArn] = js.undefined,
        computePlatform: js.UndefOr[ComputePlatform] = js.undefined,
        createdAt: js.UndefOr[Timestamp] = js.undefined,
        name: js.UndefOr[ProfilingGroupName] = js.undefined,
        profilingStatus: js.UndefOr[ProfilingStatus] = js.undefined,
        tags: js.UndefOr[TagsMap] = js.undefined,
        updatedAt: js.UndefOr[Timestamp] = js.undefined
    ): ProfilingGroupDescription = {
      val __obj = js.Dynamic.literal()
      agentOrchestrationConfig.foreach(__v => __obj.updateDynamic("agentOrchestrationConfig")(__v.asInstanceOf[js.Any]))
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      computePlatform.foreach(__v => __obj.updateDynamic("computePlatform")(__v.asInstanceOf[js.Any]))
      createdAt.foreach(__v => __obj.updateDynamic("createdAt")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      profilingStatus.foreach(__v => __obj.updateDynamic("profilingStatus")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      updatedAt.foreach(__v => __obj.updateDynamic("updatedAt")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ProfilingGroupDescription]
    }
  }

  /**
    * Profiling status includes information about the last time a profile agent pinged back, the last time a profile was received, and the aggregation period and start time for the most recent aggregated profile.
    */
  @js.native
  trait ProfilingStatus extends js.Object {
    var latestAgentOrchestratedAt: js.UndefOr[Timestamp]
    var latestAgentProfileReportedAt: js.UndefOr[Timestamp]
    var latestAggregatedProfile: js.UndefOr[AggregatedProfileTime]
  }

  object ProfilingStatus {
    @inline
    def apply(
        latestAgentOrchestratedAt: js.UndefOr[Timestamp] = js.undefined,
        latestAgentProfileReportedAt: js.UndefOr[Timestamp] = js.undefined,
        latestAggregatedProfile: js.UndefOr[AggregatedProfileTime] = js.undefined
    ): ProfilingStatus = {
      val __obj = js.Dynamic.literal()
      latestAgentOrchestratedAt.foreach(__v => __obj.updateDynamic("latestAgentOrchestratedAt")(__v.asInstanceOf[js.Any]))
      latestAgentProfileReportedAt.foreach(__v => __obj.updateDynamic("latestAgentProfileReportedAt")(__v.asInstanceOf[js.Any]))
      latestAggregatedProfile.foreach(__v => __obj.updateDynamic("latestAggregatedProfile")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ProfilingStatus]
    }
  }

  /**
    * The structure representing the <code>putPermissionRequest</code>.
    */
  @js.native
  trait PutPermissionRequest extends js.Object {
    var actionGroup: ActionGroup
    var principals: Principals
    var profilingGroupName: ProfilingGroupName
    var revisionId: js.UndefOr[RevisionId]
  }

  object PutPermissionRequest {
    @inline
    def apply(
        actionGroup: ActionGroup,
        principals: Principals,
        profilingGroupName: ProfilingGroupName,
        revisionId: js.UndefOr[RevisionId] = js.undefined
    ): PutPermissionRequest = {
      val __obj = js.Dynamic.literal(
        "actionGroup" -> actionGroup.asInstanceOf[js.Any],
        "principals" -> principals.asInstanceOf[js.Any],
        "profilingGroupName" -> profilingGroupName.asInstanceOf[js.Any]
      )

      revisionId.foreach(__v => __obj.updateDynamic("revisionId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutPermissionRequest]
    }
  }

  /**
    * The structure representing the <code>putPermissionResponse</code>.
    */
  @js.native
  trait PutPermissionResponse extends js.Object {
    var policy: String
    var revisionId: RevisionId
  }

  object PutPermissionResponse {
    @inline
    def apply(
        policy: String,
        revisionId: RevisionId
    ): PutPermissionResponse = {
      val __obj = js.Dynamic.literal(
        "policy" -> policy.asInstanceOf[js.Any],
        "revisionId" -> revisionId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[PutPermissionResponse]
    }
  }

  /**
    * A potential improvement that was found from analyzing the profiling data.
    */
  @js.native
  trait Recommendation extends js.Object {
    var allMatchesCount: Int
    var allMatchesSum: Double
    var endTime: Timestamp
    var pattern: Pattern
    var startTime: Timestamp
    var topMatches: Matches
  }

  object Recommendation {
    @inline
    def apply(
        allMatchesCount: Int,
        allMatchesSum: Double,
        endTime: Timestamp,
        pattern: Pattern,
        startTime: Timestamp,
        topMatches: Matches
    ): Recommendation = {
      val __obj = js.Dynamic.literal(
        "allMatchesCount" -> allMatchesCount.asInstanceOf[js.Any],
        "allMatchesSum" -> allMatchesSum.asInstanceOf[js.Any],
        "endTime" -> endTime.asInstanceOf[js.Any],
        "pattern" -> pattern.asInstanceOf[js.Any],
        "startTime" -> startTime.asInstanceOf[js.Any],
        "topMatches" -> topMatches.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[Recommendation]
    }
  }

  /**
    * The structure representing the RemoveNotificationChannelRequest.
    */
  @js.native
  trait RemoveNotificationChannelRequest extends js.Object {
    var channelId: ChannelId
    var profilingGroupName: ProfilingGroupName
  }

  object RemoveNotificationChannelRequest {
    @inline
    def apply(
        channelId: ChannelId,
        profilingGroupName: ProfilingGroupName
    ): RemoveNotificationChannelRequest = {
      val __obj = js.Dynamic.literal(
        "channelId" -> channelId.asInstanceOf[js.Any],
        "profilingGroupName" -> profilingGroupName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[RemoveNotificationChannelRequest]
    }
  }

  /**
    * The structure representing the RemoveNotificationChannelResponse.
    */
  @js.native
  trait RemoveNotificationChannelResponse extends js.Object {
    var notificationConfiguration: js.UndefOr[NotificationConfiguration]
  }

  object RemoveNotificationChannelResponse {
    @inline
    def apply(
        notificationConfiguration: js.UndefOr[NotificationConfiguration] = js.undefined
    ): RemoveNotificationChannelResponse = {
      val __obj = js.Dynamic.literal()
      notificationConfiguration.foreach(__v => __obj.updateDynamic("notificationConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RemoveNotificationChannelResponse]
    }
  }

  /**
    * <p> {{{ The structure representing the &lt;code&gt;removePermissionRequest&lt;/code&gt;.&lt;/p&gt; }}}
    */
  @js.native
  trait RemovePermissionRequest extends js.Object {
    var actionGroup: ActionGroup
    var profilingGroupName: ProfilingGroupName
    var revisionId: RevisionId
  }

  object RemovePermissionRequest {
    @inline
    def apply(
        actionGroup: ActionGroup,
        profilingGroupName: ProfilingGroupName,
        revisionId: RevisionId
    ): RemovePermissionRequest = {
      val __obj = js.Dynamic.literal(
        "actionGroup" -> actionGroup.asInstanceOf[js.Any],
        "profilingGroupName" -> profilingGroupName.asInstanceOf[js.Any],
        "revisionId" -> revisionId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[RemovePermissionRequest]
    }
  }

  /**
    * The structure representing the <code>removePermissionResponse</code>.
    */
  @js.native
  trait RemovePermissionResponse extends js.Object {
    var policy: String
    var revisionId: RevisionId
  }

  object RemovePermissionResponse {
    @inline
    def apply(
        policy: String,
        revisionId: RevisionId
    ): RemovePermissionResponse = {
      val __obj = js.Dynamic.literal(
        "policy" -> policy.asInstanceOf[js.Any],
        "revisionId" -> revisionId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[RemovePermissionResponse]
    }
  }

  /**
    * The structure representing the SubmitFeedbackRequest.
    */
  @js.native
  trait SubmitFeedbackRequest extends js.Object {
    var anomalyInstanceId: AnomalyInstanceId
    var profilingGroupName: ProfilingGroupName
    var `type`: FeedbackType
    var comment: js.UndefOr[String]
  }

  object SubmitFeedbackRequest {
    @inline
    def apply(
        anomalyInstanceId: AnomalyInstanceId,
        profilingGroupName: ProfilingGroupName,
        `type`: FeedbackType,
        comment: js.UndefOr[String] = js.undefined
    ): SubmitFeedbackRequest = {
      val __obj = js.Dynamic.literal(
        "anomalyInstanceId" -> anomalyInstanceId.asInstanceOf[js.Any],
        "profilingGroupName" -> profilingGroupName.asInstanceOf[js.Any],
        "type" -> `type`.asInstanceOf[js.Any]
      )

      comment.foreach(__v => __obj.updateDynamic("comment")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SubmitFeedbackRequest]
    }
  }

  /**
    * The structure representing the SubmitFeedbackResponse.
    */
  @js.native
  trait SubmitFeedbackResponse extends js.Object {}

  object SubmitFeedbackResponse {
    @inline
    def apply(
    ): SubmitFeedbackResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[SubmitFeedbackResponse]
    }
  }

  @js.native
  trait TagResourceRequest extends js.Object {
    var resourceArn: ProfilingGroupArn
    var tags: TagsMap
  }

  object TagResourceRequest {
    @inline
    def apply(
        resourceArn: ProfilingGroupArn,
        tags: TagsMap
    ): TagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "resourceArn" -> resourceArn.asInstanceOf[js.Any],
        "tags" -> tags.asInstanceOf[js.Any]
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

  /**
    * A data type that contains a <code>Timestamp</code> object. This is specified using the ISO 8601 format. For example, 2020-06-01T13:15:02.001Z represents 1 millisecond past June 1, 2020 1:15:02 PM UTC.
    */
  @js.native
  trait TimestampStructure extends js.Object {
    var value: Timestamp
  }

  object TimestampStructure {
    @inline
    def apply(
        value: Timestamp
    ): TimestampStructure = {
      val __obj = js.Dynamic.literal(
        "value" -> value.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[TimestampStructure]
    }
  }

  @js.native
  trait UntagResourceRequest extends js.Object {
    var resourceArn: ProfilingGroupArn
    var tagKeys: TagKeys
  }

  object UntagResourceRequest {
    @inline
    def apply(
        resourceArn: ProfilingGroupArn,
        tagKeys: TagKeys
    ): UntagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "resourceArn" -> resourceArn.asInstanceOf[js.Any],
        "tagKeys" -> tagKeys.asInstanceOf[js.Any]
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

  /**
    * The structure representing the updateProfilingGroupRequest.
    */
  @js.native
  trait UpdateProfilingGroupRequest extends js.Object {
    var agentOrchestrationConfig: AgentOrchestrationConfig
    var profilingGroupName: ProfilingGroupName
  }

  object UpdateProfilingGroupRequest {
    @inline
    def apply(
        agentOrchestrationConfig: AgentOrchestrationConfig,
        profilingGroupName: ProfilingGroupName
    ): UpdateProfilingGroupRequest = {
      val __obj = js.Dynamic.literal(
        "agentOrchestrationConfig" -> agentOrchestrationConfig.asInstanceOf[js.Any],
        "profilingGroupName" -> profilingGroupName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UpdateProfilingGroupRequest]
    }
  }

  /**
    * The structure representing the updateProfilingGroupResponse.
    */
  @js.native
  trait UpdateProfilingGroupResponse extends js.Object {
    var profilingGroup: ProfilingGroupDescription
  }

  object UpdateProfilingGroupResponse {
    @inline
    def apply(
        profilingGroup: ProfilingGroupDescription
    ): UpdateProfilingGroupResponse = {
      val __obj = js.Dynamic.literal(
        "profilingGroup" -> profilingGroup.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UpdateProfilingGroupResponse]
    }
  }

  /**
    * Feedback that can be submitted for each instance of an anomaly by the user. Feedback is be used for improvements in generating recommendations for the application.
    */
  @js.native
  trait UserFeedback extends js.Object {
    var `type`: FeedbackType
  }

  object UserFeedback {
    @inline
    def apply(
        `type`: FeedbackType
    ): UserFeedback = {
      val __obj = js.Dynamic.literal(
        "type" -> `type`.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UserFeedback]
    }
  }
}
