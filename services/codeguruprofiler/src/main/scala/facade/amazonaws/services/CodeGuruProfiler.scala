package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

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
      service.configureAgent(params).promise().toFuture
    @inline def createProfilingGroupFuture(params: CreateProfilingGroupRequest): Future[CreateProfilingGroupResponse] =
      service.createProfilingGroup(params).promise().toFuture
    @inline def deleteProfilingGroupFuture(params: DeleteProfilingGroupRequest): Future[DeleteProfilingGroupResponse] =
      service.deleteProfilingGroup(params).promise().toFuture
    @inline def describeProfilingGroupFuture(
        params: DescribeProfilingGroupRequest
    ): Future[DescribeProfilingGroupResponse] = service.describeProfilingGroup(params).promise().toFuture
    @inline def getProfileFuture(params: GetProfileRequest): Future[GetProfileResponse] =
      service.getProfile(params).promise().toFuture
    @inline def listProfileTimesFuture(params: ListProfileTimesRequest): Future[ListProfileTimesResponse] =
      service.listProfileTimes(params).promise().toFuture
    @inline def listProfilingGroupsFuture(params: ListProfilingGroupsRequest): Future[ListProfilingGroupsResponse] =
      service.listProfilingGroups(params).promise().toFuture
    @inline def postAgentProfileFuture(params: PostAgentProfileRequest): Future[PostAgentProfileResponse] =
      service.postAgentProfile(params).promise().toFuture
    @inline def updateProfilingGroupFuture(params: UpdateProfilingGroupRequest): Future[UpdateProfilingGroupResponse] =
      service.updateProfilingGroup(params).promise().toFuture
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
  @Factory
  trait AgentConfiguration extends js.Object {
    var periodInSeconds: Int
    var shouldProfile: Boolean
  }

  /**
    * Configuration to orchestrate agents to create and report agent profiles of the profiling group. Agents are orchestrated if they follow the agent orchestration protocol.
    */
  @js.native
  @Factory
  trait AgentOrchestrationConfig extends js.Object {
    var profilingEnabled: Boolean
  }

  /**
    * The time range of an aggregated profile.
    */
  @js.native
  @Factory
  trait AggregatedProfileTime extends js.Object {
    var period: js.UndefOr[AggregationPeriod]
    var start: js.UndefOr[Timestamp]
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
  @Factory
  trait ConfigureAgentRequest extends js.Object {
    var profilingGroupName: ProfilingGroupName
    var fleetInstanceId: js.UndefOr[FleetInstanceId]
  }

  /**
    * Response for ConfigureAgent operation.
    */
  @js.native
  @Factory
  trait ConfigureAgentResponse extends js.Object {
    var configuration: AgentConfiguration
  }

  /**
    * Request for CreateProfilingGroup operation.
    */
  @js.native
  @Factory
  trait CreateProfilingGroupRequest extends js.Object {
    var clientToken: ClientToken
    var profilingGroupName: ProfilingGroupName
    var agentOrchestrationConfig: js.UndefOr[AgentOrchestrationConfig]
  }

  /**
    * Response for CreateProfilingGroup operation.
    */
  @js.native
  @Factory
  trait CreateProfilingGroupResponse extends js.Object {
    var profilingGroup: ProfilingGroupDescription
  }

  /**
    * Request for DeleteProfilingGroup operation.
    */
  @js.native
  @Factory
  trait DeleteProfilingGroupRequest extends js.Object {
    var profilingGroupName: ProfilingGroupName
  }

  /**
    * Response for DeleteProfilingGroup operation.
    */
  @js.native
  @Factory
  trait DeleteProfilingGroupResponse extends js.Object {}

  /**
    * Request for DescribeProfilingGroup operation.
    */
  @js.native
  @Factory
  trait DescribeProfilingGroupRequest extends js.Object {
    var profilingGroupName: ProfilingGroupName
  }

  /**
    * Response for DescribeProfilingGroup operation.
    */
  @js.native
  @Factory
  trait DescribeProfilingGroupResponse extends js.Object {
    var profilingGroup: ProfilingGroupDescription
  }

  /**
    * Request for GetProfile operation.
    */
  @js.native
  @Factory
  trait GetProfileRequest extends js.Object {
    var profilingGroupName: ProfilingGroupName
    var accept: js.UndefOr[String]
    var endTime: js.UndefOr[Timestamp]
    var maxDepth: js.UndefOr[MaxDepth]
    var period: js.UndefOr[Period]
    var startTime: js.UndefOr[Timestamp]
  }

  /**
    * Response for GetProfile operation.
    */
  @js.native
  @Factory
  trait GetProfileResponse extends js.Object {
    var contentType: String
    var profile: AggregatedProfile
    var contentEncoding: js.UndefOr[String]
  }

  /**
    * Request for ListProfileTimes operation.
    */
  @js.native
  @Factory
  trait ListProfileTimesRequest extends js.Object {
    var endTime: Timestamp
    var period: AggregationPeriod
    var profilingGroupName: ProfilingGroupName
    var startTime: Timestamp
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[PaginationToken]
    var orderBy: js.UndefOr[OrderBy]
  }

  /**
    * Response for ListProfileTimes operation.
    */
  @js.native
  @Factory
  trait ListProfileTimesResponse extends js.Object {
    var profileTimes: ProfileTimes
    var nextToken: js.UndefOr[PaginationToken]
  }

  /**
    * Request for ListProfilingGroups operation.
    */
  @js.native
  @Factory
  trait ListProfilingGroupsRequest extends js.Object {
    var includeDescription: js.UndefOr[Boolean]
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[PaginationToken]
  }

  /**
    * Response for ListProfilingGroups operation.
    */
  @js.native
  @Factory
  trait ListProfilingGroupsResponse extends js.Object {
    var profilingGroupNames: ProfilingGroupNames
    var nextToken: js.UndefOr[PaginationToken]
    var profilingGroups: js.UndefOr[ProfilingGroupDescriptions]
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
  @Factory
  trait PostAgentProfileRequest extends js.Object {
    var agentProfile: AgentProfile
    var contentType: String
    var profilingGroupName: ProfilingGroupName
    var profileToken: js.UndefOr[ClientToken]
  }

  /**
    * Response for PostAgentProfile operation.
    */
  @js.native
  @Factory
  trait PostAgentProfileResponse extends js.Object {}

  /**
    * Periods of time used for aggregation of profiles, represented using ISO 8601 format.
    */
  @js.native
  @Factory
  trait ProfileTime extends js.Object {
    var start: js.UndefOr[Timestamp]
  }

  /**
    * The description of a profiling group.
    */
  @js.native
  @Factory
  trait ProfilingGroupDescription extends js.Object {
    var agentOrchestrationConfig: js.UndefOr[AgentOrchestrationConfig]
    var arn: js.UndefOr[ProfilingGroupArn]
    var createdAt: js.UndefOr[Timestamp]
    var name: js.UndefOr[ProfilingGroupName]
    var profilingStatus: js.UndefOr[ProfilingStatus]
    var updatedAt: js.UndefOr[Timestamp]
  }

  /**
    * The status of profiling of a profiling group.
    */
  @js.native
  @Factory
  trait ProfilingStatus extends js.Object {
    var latestAgentOrchestratedAt: js.UndefOr[Timestamp]
    var latestAgentProfileReportedAt: js.UndefOr[Timestamp]
    var latestAggregatedProfile: js.UndefOr[AggregatedProfileTime]
  }

  /**
    * Request for UpdateProfilingGroup operation.
    */
  @js.native
  @Factory
  trait UpdateProfilingGroupRequest extends js.Object {
    var agentOrchestrationConfig: AgentOrchestrationConfig
    var profilingGroupName: ProfilingGroupName
  }

  /**
    * Response for UpdateProfilingGroup operation.
    */
  @js.native
  @Factory
  trait UpdateProfilingGroupResponse extends js.Object {
    var profilingGroup: ProfilingGroupDescription
  }
}
