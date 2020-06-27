package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object computeoptimizer {
  type AccountId                             = String
  type AccountIds                            = js.Array[AccountId]
  type AutoScalingGroupArn                   = String
  type AutoScalingGroupArns                  = js.Array[AutoScalingGroupArn]
  type AutoScalingGroupName                  = String
  type AutoScalingGroupRecommendationOptions = js.Array[AutoScalingGroupRecommendationOption]
  type AutoScalingGroupRecommendations       = js.Array[AutoScalingGroupRecommendation]
  type Code                                  = String
  type CurrentInstanceType                   = String
  type DesiredCapacity                       = Int
  type FilterValue                           = String
  type FilterValues                          = js.Array[FilterValue]
  type Filters                               = js.Array[Filter]
  type GetRecommendationErrors               = js.Array[GetRecommendationError]
  type Identifier                            = String
  type IncludeMemberAccounts                 = Boolean
  type InstanceArn                           = String
  type InstanceArns                          = js.Array[InstanceArn]
  type InstanceName                          = String
  type InstanceRecommendations               = js.Array[InstanceRecommendation]
  type InstanceType                          = String
  type LastRefreshTimestamp                  = js.Date
  type LookBackPeriodInDays                  = Double
  type MaxResults                            = Int
  type MaxSize                               = Int
  type MemberAccountsEnrolled                = Boolean
  type Message                               = String
  type MetricValue                           = Double
  type MetricValues                          = js.Array[MetricValue]
  type MinSize                               = Int
  type NextToken                             = String
  type PerformanceRisk                       = Double
  type Period                                = Int
  type ProjectedMetrics                      = js.Array[ProjectedMetric]
  type ProjectedUtilizationMetrics           = js.Array[UtilizationMetric]
  type Rank                                  = Int
  type RecommendationOptions                 = js.Array[InstanceRecommendationOption]
  type RecommendationSourceArn               = String
  type RecommendationSources                 = js.Array[RecommendationSource]
  type RecommendationSummaries               = js.Array[RecommendationSummary]
  type RecommendedInstanceType               = String
  type RecommendedOptionProjectedMetrics     = js.Array[RecommendedOptionProjectedMetric]
  type StatusReason                          = String
  type Summaries                             = js.Array[Summary]
  type SummaryValue                          = Double
  type Timestamp                             = js.Date
  type Timestamps                            = js.Array[Timestamp]
  type UtilizationMetrics                    = js.Array[UtilizationMetric]

  implicit final class ComputeOptimizerOps(private val service: ComputeOptimizer) extends AnyVal {

    @inline def getAutoScalingGroupRecommendationsFuture(
        params: GetAutoScalingGroupRecommendationsRequest
    ): Future[GetAutoScalingGroupRecommendationsResponse] =
      service.getAutoScalingGroupRecommendations(params).promise().toFuture
    @inline def getEC2InstanceRecommendationsFuture(
        params: GetEC2InstanceRecommendationsRequest
    ): Future[GetEC2InstanceRecommendationsResponse] = service.getEC2InstanceRecommendations(params).promise().toFuture
    @inline def getEC2RecommendationProjectedMetricsFuture(
        params: GetEC2RecommendationProjectedMetricsRequest
    ): Future[GetEC2RecommendationProjectedMetricsResponse] =
      service.getEC2RecommendationProjectedMetrics(params).promise().toFuture
    @inline def getEnrollmentStatusFuture(params: GetEnrollmentStatusRequest): Future[GetEnrollmentStatusResponse] =
      service.getEnrollmentStatus(params).promise().toFuture
    @inline def getRecommendationSummariesFuture(
        params: GetRecommendationSummariesRequest
    ): Future[GetRecommendationSummariesResponse] = service.getRecommendationSummaries(params).promise().toFuture
    @inline def updateEnrollmentStatusFuture(
        params: UpdateEnrollmentStatusRequest
    ): Future[UpdateEnrollmentStatusResponse] = service.updateEnrollmentStatus(params).promise().toFuture
  }
}

package computeoptimizer {
  @js.native
  @JSImport("aws-sdk", "ComputeOptimizer")
  class ComputeOptimizer() extends js.Object {
    def this(config: AWSConfig) = this()

    def getAutoScalingGroupRecommendations(
        params: GetAutoScalingGroupRecommendationsRequest
    ): Request[GetAutoScalingGroupRecommendationsResponse] = js.native
    def getEC2InstanceRecommendations(
        params: GetEC2InstanceRecommendationsRequest
    ): Request[GetEC2InstanceRecommendationsResponse] = js.native
    def getEC2RecommendationProjectedMetrics(
        params: GetEC2RecommendationProjectedMetricsRequest
    ): Request[GetEC2RecommendationProjectedMetricsResponse]                                          = js.native
    def getEnrollmentStatus(params: GetEnrollmentStatusRequest): Request[GetEnrollmentStatusResponse] = js.native
    def getRecommendationSummaries(
        params: GetRecommendationSummariesRequest
    ): Request[GetRecommendationSummariesResponse] = js.native
    def updateEnrollmentStatus(params: UpdateEnrollmentStatusRequest): Request[UpdateEnrollmentStatusResponse] =
      js.native
  }

  /**
    * Describes the configuration of an Auto Scaling group.
    */
  @js.native
  @Factory
  trait AutoScalingGroupConfiguration extends js.Object {
    var desiredCapacity: js.UndefOr[DesiredCapacity]
    var instanceType: js.UndefOr[InstanceType]
    var maxSize: js.UndefOr[MaxSize]
    var minSize: js.UndefOr[MinSize]
  }

  /**
    * Describes an Auto Scaling group recommendation.
    */
  @js.native
  @Factory
  trait AutoScalingGroupRecommendation extends js.Object {
    var accountId: js.UndefOr[AccountId]
    var autoScalingGroupArn: js.UndefOr[AutoScalingGroupArn]
    var autoScalingGroupName: js.UndefOr[AutoScalingGroupName]
    var currentConfiguration: js.UndefOr[AutoScalingGroupConfiguration]
    var finding: js.UndefOr[Finding]
    var lastRefreshTimestamp: js.UndefOr[LastRefreshTimestamp]
    var lookBackPeriodInDays: js.UndefOr[LookBackPeriodInDays]
    var recommendationOptions: js.UndefOr[AutoScalingGroupRecommendationOptions]
    var utilizationMetrics: js.UndefOr[UtilizationMetrics]
  }

  /**
    * Describes a recommendation option for an Auto Scaling group.
    */
  @js.native
  @Factory
  trait AutoScalingGroupRecommendationOption extends js.Object {
    var configuration: js.UndefOr[AutoScalingGroupConfiguration]
    var performanceRisk: js.UndefOr[PerformanceRisk]
    var projectedUtilizationMetrics: js.UndefOr[ProjectedUtilizationMetrics]
    var rank: js.UndefOr[Rank]
  }

  /**
    * Describes a filter that returns a more specific list of recommendations.
    */
  @js.native
  @Factory
  trait Filter extends js.Object {
    var name: js.UndefOr[FilterName]
    var values: js.UndefOr[FilterValues]
  }

  @js.native
  sealed trait FilterName extends js.Any
  object FilterName extends js.Object {
    val Finding                  = "Finding".asInstanceOf[FilterName]
    val RecommendationSourceType = "RecommendationSourceType".asInstanceOf[FilterName]

    val values = js.Object.freeze(js.Array(Finding, RecommendationSourceType))
  }

  @js.native
  sealed trait Finding extends js.Any
  object Finding extends js.Object {
    val Underprovisioned = "Underprovisioned".asInstanceOf[Finding]
    val Overprovisioned  = "Overprovisioned".asInstanceOf[Finding]
    val Optimized        = "Optimized".asInstanceOf[Finding]
    val NotOptimized     = "NotOptimized".asInstanceOf[Finding]

    val values = js.Object.freeze(js.Array(Underprovisioned, Overprovisioned, Optimized, NotOptimized))
  }

  @js.native
  @Factory
  trait GetAutoScalingGroupRecommendationsRequest extends js.Object {
    var accountIds: js.UndefOr[AccountIds]
    var autoScalingGroupArns: js.UndefOr[AutoScalingGroupArns]
    var filters: js.UndefOr[Filters]
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait GetAutoScalingGroupRecommendationsResponse extends js.Object {
    var autoScalingGroupRecommendations: js.UndefOr[AutoScalingGroupRecommendations]
    var errors: js.UndefOr[GetRecommendationErrors]
    var nextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait GetEC2InstanceRecommendationsRequest extends js.Object {
    var accountIds: js.UndefOr[AccountIds]
    var filters: js.UndefOr[Filters]
    var instanceArns: js.UndefOr[InstanceArns]
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait GetEC2InstanceRecommendationsResponse extends js.Object {
    var errors: js.UndefOr[GetRecommendationErrors]
    var instanceRecommendations: js.UndefOr[InstanceRecommendations]
    var nextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait GetEC2RecommendationProjectedMetricsRequest extends js.Object {
    var endTime: Timestamp
    var instanceArn: InstanceArn
    var period: Period
    var startTime: Timestamp
    var stat: MetricStatistic
  }

  @js.native
  @Factory
  trait GetEC2RecommendationProjectedMetricsResponse extends js.Object {
    var recommendedOptionProjectedMetrics: js.UndefOr[RecommendedOptionProjectedMetrics]
  }

  @js.native
  @Factory
  trait GetEnrollmentStatusRequest extends js.Object {}

  @js.native
  @Factory
  trait GetEnrollmentStatusResponse extends js.Object {
    var memberAccountsEnrolled: js.UndefOr[MemberAccountsEnrolled]
    var status: js.UndefOr[Status]
    var statusReason: js.UndefOr[StatusReason]
  }

  /**
    * Describes an error experienced when getting recommendations.
    *  For example, an error is returned if you request recommendations for an unsupported Auto Scaling group, or if you request recommendations for an instance of an unsupported instance family.
    */
  @js.native
  @Factory
  trait GetRecommendationError extends js.Object {
    var code: js.UndefOr[Code]
    var identifier: js.UndefOr[Identifier]
    var message: js.UndefOr[Message]
  }

  @js.native
  @Factory
  trait GetRecommendationSummariesRequest extends js.Object {
    var accountIds: js.UndefOr[AccountIds]
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait GetRecommendationSummariesResponse extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var recommendationSummaries: js.UndefOr[RecommendationSummaries]
  }

  /**
    * Describes an Amazon EC2 instance recommendation.
    */
  @js.native
  @Factory
  trait InstanceRecommendation extends js.Object {
    var accountId: js.UndefOr[AccountId]
    var currentInstanceType: js.UndefOr[CurrentInstanceType]
    var finding: js.UndefOr[Finding]
    var instanceArn: js.UndefOr[InstanceArn]
    var instanceName: js.UndefOr[InstanceName]
    var lastRefreshTimestamp: js.UndefOr[LastRefreshTimestamp]
    var lookBackPeriodInDays: js.UndefOr[LookBackPeriodInDays]
    var recommendationOptions: js.UndefOr[RecommendationOptions]
    var recommendationSources: js.UndefOr[RecommendationSources]
    var utilizationMetrics: js.UndefOr[UtilizationMetrics]
  }

  /**
    * Describes a recommendation option for an Amazon EC2 instance.
    */
  @js.native
  @Factory
  trait InstanceRecommendationOption extends js.Object {
    var instanceType: js.UndefOr[InstanceType]
    var performanceRisk: js.UndefOr[PerformanceRisk]
    var projectedUtilizationMetrics: js.UndefOr[ProjectedUtilizationMetrics]
    var rank: js.UndefOr[Rank]
  }

  @js.native
  sealed trait MetricName extends js.Any
  object MetricName extends js.Object {
    val Cpu    = "Cpu".asInstanceOf[MetricName]
    val Memory = "Memory".asInstanceOf[MetricName]

    val values = js.Object.freeze(js.Array(Cpu, Memory))
  }

  @js.native
  sealed trait MetricStatistic extends js.Any
  object MetricStatistic extends js.Object {
    val Maximum = "Maximum".asInstanceOf[MetricStatistic]
    val Average = "Average".asInstanceOf[MetricStatistic]

    val values = js.Object.freeze(js.Array(Maximum, Average))
  }

  /**
    * Describes a projected utilization metric of a recommendation option, such as an Amazon EC2 instance.
    */
  @js.native
  @Factory
  trait ProjectedMetric extends js.Object {
    var name: js.UndefOr[MetricName]
    var timestamps: js.UndefOr[Timestamps]
    var values: js.UndefOr[MetricValues]
  }

  /**
    * Describes the source of a recommendation, such as an Amazon EC2 instance or Auto Scaling group.
    */
  @js.native
  @Factory
  trait RecommendationSource extends js.Object {
    var recommendationSourceArn: js.UndefOr[RecommendationSourceArn]
    var recommendationSourceType: js.UndefOr[RecommendationSourceType]
  }

  @js.native
  sealed trait RecommendationSourceType extends js.Any
  object RecommendationSourceType extends js.Object {
    val Ec2Instance      = "Ec2Instance".asInstanceOf[RecommendationSourceType]
    val AutoScalingGroup = "AutoScalingGroup".asInstanceOf[RecommendationSourceType]

    val values = js.Object.freeze(js.Array(Ec2Instance, AutoScalingGroup))
  }

  /**
    * A summary of a recommendation.
    */
  @js.native
  @Factory
  trait RecommendationSummary extends js.Object {
    var accountId: js.UndefOr[AccountId]
    var recommendationResourceType: js.UndefOr[RecommendationSourceType]
    var summaries: js.UndefOr[Summaries]
  }

  /**
    * Describes a projected utilization metric of a recommendation option.
    */
  @js.native
  @Factory
  trait RecommendedOptionProjectedMetric extends js.Object {
    var projectedMetrics: js.UndefOr[ProjectedMetrics]
    var rank: js.UndefOr[Rank]
    var recommendedInstanceType: js.UndefOr[RecommendedInstanceType]
  }

  @js.native
  sealed trait Status extends js.Any
  object Status extends js.Object {
    val Active   = "Active".asInstanceOf[Status]
    val Inactive = "Inactive".asInstanceOf[Status]
    val Pending  = "Pending".asInstanceOf[Status]
    val Failed   = "Failed".asInstanceOf[Status]

    val values = js.Object.freeze(js.Array(Active, Inactive, Pending, Failed))
  }

  /**
    * The summary of a recommendation.
    */
  @js.native
  @Factory
  trait Summary extends js.Object {
    var name: js.UndefOr[Finding]
    var value: js.UndefOr[SummaryValue]
  }

  @js.native
  @Factory
  trait UpdateEnrollmentStatusRequest extends js.Object {
    var status: Status
    var includeMemberAccounts: js.UndefOr[IncludeMemberAccounts]
  }

  @js.native
  @Factory
  trait UpdateEnrollmentStatusResponse extends js.Object {
    var status: js.UndefOr[Status]
    var statusReason: js.UndefOr[StatusReason]
  }

  /**
    * Describes a utilization metric of a resource, such as an Amazon EC2 instance.
    */
  @js.native
  @Factory
  trait UtilizationMetric extends js.Object {
    var name: js.UndefOr[MetricName]
    var statistic: js.UndefOr[MetricStatistic]
    var value: js.UndefOr[MetricValue]
  }
}
