package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

package object codeguruprofiler {
  type AgentProfile               = js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type AggregatedProfile          = js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type ClientToken                = String
  type FleetInstanceId            = String
  type MaxDepth                   = Int
  type MaxResults                 = Int
  type PaginationToken            = String
  type Period                     = String
  type ProfileTimes               = js.Array[ProfileTime]
  type ProfilingGroupArn          = String
  type ProfilingGroupDescriptions = js.Array[ProfilingGroupDescription]
  type ProfilingGroupName         = String
  type ProfilingGroupNames        = js.Array[ProfilingGroupName]
  type Timestamp                  = js.Date

  implicit final class CodeGuruProfilerOps(private val service: CodeGuruProfiler) extends AnyVal {

    @inline def configureAgentFuture(params: ConfigureAgentRequest): Future[ConfigureAgentResponse] =
      service.configureAgent(params).promise.toFuture
    @inline def createProfilingGroupFuture(params: CreateProfilingGroupRequest): Future[CreateProfilingGroupResponse] =
      service.createProfilingGroup(params).promise.toFuture
    @inline def deleteProfilingGroupFuture(params: DeleteProfilingGroupRequest): Future[DeleteProfilingGroupResponse] =
      service.deleteProfilingGroup(params).promise.toFuture
    @inline def describeProfilingGroupFuture(
        params: DescribeProfilingGroupRequest
    ): Future[DescribeProfilingGroupResponse] = service.describeProfilingGroup(params).promise.toFuture
    @inline def getProfileFuture(params: GetProfileRequest): Future[GetProfileResponse] =
      service.getProfile(params).promise.toFuture
    @inline def listProfileTimesFuture(params: ListProfileTimesRequest): Future[ListProfileTimesResponse] =
      service.listProfileTimes(params).promise.toFuture
    @inline def listProfilingGroupsFuture(params: ListProfilingGroupsRequest): Future[ListProfilingGroupsResponse] =
      service.listProfilingGroups(params).promise.toFuture
    @inline def postAgentProfileFuture(params: PostAgentProfileRequest): Future[PostAgentProfileResponse] =
      service.postAgentProfile(params).promise.toFuture
    @inline def updateProfilingGroupFuture(params: UpdateProfilingGroupRequest): Future[UpdateProfilingGroupResponse] =
      service.updateProfilingGroup(params).promise.toFuture
  }
}

package codeguruprofiler {
  @js.native
  @JSImport("aws-sdk", "CodeGuruProfiler")
  class CodeGuruProfiler() extends js.Object {
    def this(config: AWSConfig) = this()

    def configureAgent(params: ConfigureAgentRequest): Request[ConfigureAgentResponse]                   = js.native
    def createProfilingGroup(params: CreateProfilingGroupRequest): Request[CreateProfilingGroupResponse] = js.native
    def deleteProfilingGroup(params: DeleteProfilingGroupRequest): Request[DeleteProfilingGroupResponse] = js.native
    def describeProfilingGroup(params: DescribeProfilingGroupRequest): Request[DescribeProfilingGroupResponse] =
      js.native
    def getProfile(params: GetProfileRequest): Request[GetProfileResponse]                               = js.native
    def listProfileTimes(params: ListProfileTimesRequest): Request[ListProfileTimesResponse]             = js.native
    def listProfilingGroups(params: ListProfilingGroupsRequest): Request[ListProfilingGroupsResponse]    = js.native
    def postAgentProfile(params: PostAgentProfileRequest): Request[PostAgentProfileResponse]             = js.native
    def updateProfilingGroup(params: UpdateProfilingGroupRequest): Request[UpdateProfilingGroupResponse] = js.native
  }

  /**
    * The configuration for the agent to use.
    */
  @js.native
  trait AgentConfiguration extends js.Object {
    var periodInSeconds: Int
    var shouldProfile: Boolean
  }

  object AgentConfiguration {
    @inline
    def apply(
        periodInSeconds: Int,
        shouldProfile: Boolean
    ): AgentConfiguration = {
      val __obj = js.Dynamic.literal(
        "periodInSeconds" -> periodInSeconds.asInstanceOf[js.Any],
        "shouldProfile"   -> shouldProfile.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[AgentConfiguration]
    }
  }

  /**
    * Configuration to orchestrate agents to create and report agent profiles of the profiling group. Agents are orchestrated if they follow the agent orchestration protocol.
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

  /**
    * The time range of an aggregated profile.
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

  /**
    * Periods of time used for aggregation of profiles, represented using ISO 8601 format.
    */
  @js.native
  sealed trait AggregationPeriod extends js.Any
  object AggregationPeriod extends js.Object {
    val P1D  = "P1D".asInstanceOf[AggregationPeriod]
    val PT1H = "PT1H".asInstanceOf[AggregationPeriod]
    val PT5M = "PT5M".asInstanceOf[AggregationPeriod]

    val values = js.Object.freeze(js.Array(P1D, PT1H, PT5M))
  }

  /**
    * Request for ConfigureAgent operation.
    */
  @js.native
  trait ConfigureAgentRequest extends js.Object {
    var profilingGroupName: ProfilingGroupName
    var fleetInstanceId: js.UndefOr[FleetInstanceId]
  }

  object ConfigureAgentRequest {
    @inline
    def apply(
        profilingGroupName: ProfilingGroupName,
        fleetInstanceId: js.UndefOr[FleetInstanceId] = js.undefined
    ): ConfigureAgentRequest = {
      val __obj = js.Dynamic.literal(
        "profilingGroupName" -> profilingGroupName.asInstanceOf[js.Any]
      )

      fleetInstanceId.foreach(__v => __obj.updateDynamic("fleetInstanceId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ConfigureAgentRequest]
    }
  }

  /**
    * Response for ConfigureAgent operation.
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
    * Request for CreateProfilingGroup operation.
    */
  @js.native
  trait CreateProfilingGroupRequest extends js.Object {
    var clientToken: ClientToken
    var profilingGroupName: ProfilingGroupName
    var agentOrchestrationConfig: js.UndefOr[AgentOrchestrationConfig]
  }

  object CreateProfilingGroupRequest {
    @inline
    def apply(
        clientToken: ClientToken,
        profilingGroupName: ProfilingGroupName,
        agentOrchestrationConfig: js.UndefOr[AgentOrchestrationConfig] = js.undefined
    ): CreateProfilingGroupRequest = {
      val __obj = js.Dynamic.literal(
        "clientToken"        -> clientToken.asInstanceOf[js.Any],
        "profilingGroupName" -> profilingGroupName.asInstanceOf[js.Any]
      )

      agentOrchestrationConfig.foreach(__v => __obj.updateDynamic("agentOrchestrationConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateProfilingGroupRequest]
    }
  }

  /**
    * Response for CreateProfilingGroup operation.
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
    * Request for DeleteProfilingGroup operation.
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
    * Response for DeleteProfilingGroup operation.
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
    * Request for DescribeProfilingGroup operation.
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
    * Response for DescribeProfilingGroup operation.
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

  /**
    * Request for GetProfile operation.
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
    * Response for GetProfile operation.
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
        "profile"     -> profile.asInstanceOf[js.Any]
      )

      contentEncoding.foreach(__v => __obj.updateDynamic("contentEncoding")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetProfileResponse]
    }
  }

  /**
    * Request for ListProfileTimes operation.
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
        "endTime"            -> endTime.asInstanceOf[js.Any],
        "period"             -> period.asInstanceOf[js.Any],
        "profilingGroupName" -> profilingGroupName.asInstanceOf[js.Any],
        "startTime"          -> startTime.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      orderBy.foreach(__v => __obj.updateDynamic("orderBy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListProfileTimesRequest]
    }
  }

  /**
    * Response for ListProfileTimes operation.
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
    * Request for ListProfilingGroups operation.
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
    * Response for ListProfilingGroups operation.
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
  sealed trait OrderBy extends js.Any
  object OrderBy extends js.Object {
    val TimestampAscending  = "TimestampAscending".asInstanceOf[OrderBy]
    val TimestampDescending = "TimestampDescending".asInstanceOf[OrderBy]

    val values = js.Object.freeze(js.Array(TimestampAscending, TimestampDescending))
  }

  /**
    * Request for PostAgentProfile operation.
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
        "agentProfile"       -> agentProfile.asInstanceOf[js.Any],
        "contentType"        -> contentType.asInstanceOf[js.Any],
        "profilingGroupName" -> profilingGroupName.asInstanceOf[js.Any]
      )

      profileToken.foreach(__v => __obj.updateDynamic("profileToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PostAgentProfileRequest]
    }
  }

  /**
    * Response for PostAgentProfile operation.
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
    * Periods of time used for aggregation of profiles, represented using ISO 8601 format.
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
    * The description of a profiling group.
    */
  @js.native
  trait ProfilingGroupDescription extends js.Object {
    var agentOrchestrationConfig: js.UndefOr[AgentOrchestrationConfig]
    var arn: js.UndefOr[ProfilingGroupArn]
    var createdAt: js.UndefOr[Timestamp]
    var name: js.UndefOr[ProfilingGroupName]
    var profilingStatus: js.UndefOr[ProfilingStatus]
    var updatedAt: js.UndefOr[Timestamp]
  }

  object ProfilingGroupDescription {
    @inline
    def apply(
        agentOrchestrationConfig: js.UndefOr[AgentOrchestrationConfig] = js.undefined,
        arn: js.UndefOr[ProfilingGroupArn] = js.undefined,
        createdAt: js.UndefOr[Timestamp] = js.undefined,
        name: js.UndefOr[ProfilingGroupName] = js.undefined,
        profilingStatus: js.UndefOr[ProfilingStatus] = js.undefined,
        updatedAt: js.UndefOr[Timestamp] = js.undefined
    ): ProfilingGroupDescription = {
      val __obj = js.Dynamic.literal()
      agentOrchestrationConfig.foreach(__v => __obj.updateDynamic("agentOrchestrationConfig")(__v.asInstanceOf[js.Any]))
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      createdAt.foreach(__v => __obj.updateDynamic("createdAt")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      profilingStatus.foreach(__v => __obj.updateDynamic("profilingStatus")(__v.asInstanceOf[js.Any]))
      updatedAt.foreach(__v => __obj.updateDynamic("updatedAt")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ProfilingGroupDescription]
    }
  }

  /**
    * The status of profiling of a profiling group.
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
      latestAgentOrchestratedAt.foreach(__v =>
        __obj.updateDynamic("latestAgentOrchestratedAt")(__v.asInstanceOf[js.Any])
      )
      latestAgentProfileReportedAt.foreach(__v =>
        __obj.updateDynamic("latestAgentProfileReportedAt")(__v.asInstanceOf[js.Any])
      )
      latestAggregatedProfile.foreach(__v => __obj.updateDynamic("latestAggregatedProfile")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ProfilingStatus]
    }
  }

  /**
    * Request for UpdateProfilingGroup operation.
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
        "profilingGroupName"       -> profilingGroupName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UpdateProfilingGroupRequest]
    }
  }

  /**
    * Response for UpdateProfilingGroup operation.
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
}
