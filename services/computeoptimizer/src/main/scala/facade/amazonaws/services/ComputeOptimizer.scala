package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

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
      service.getAutoScalingGroupRecommendations(params).promise.toFuture
    @inline def getEC2InstanceRecommendationsFuture(
        params: GetEC2InstanceRecommendationsRequest
    ): Future[GetEC2InstanceRecommendationsResponse] = service.getEC2InstanceRecommendations(params).promise.toFuture
    @inline def getEC2RecommendationProjectedMetricsFuture(
        params: GetEC2RecommendationProjectedMetricsRequest
    ): Future[GetEC2RecommendationProjectedMetricsResponse] =
      service.getEC2RecommendationProjectedMetrics(params).promise.toFuture
    @inline def getEnrollmentStatusFuture(params: GetEnrollmentStatusRequest): Future[GetEnrollmentStatusResponse] =
      service.getEnrollmentStatus(params).promise.toFuture
    @inline def getRecommendationSummariesFuture(
        params: GetRecommendationSummariesRequest
    ): Future[GetRecommendationSummariesResponse] = service.getRecommendationSummaries(params).promise.toFuture
    @inline def updateEnrollmentStatusFuture(
        params: UpdateEnrollmentStatusRequest
    ): Future[UpdateEnrollmentStatusResponse] = service.updateEnrollmentStatus(params).promise.toFuture
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
  trait AutoScalingGroupConfiguration extends js.Object {
    var desiredCapacity: js.UndefOr[DesiredCapacity]
    var instanceType: js.UndefOr[InstanceType]
    var maxSize: js.UndefOr[MaxSize]
    var minSize: js.UndefOr[MinSize]
  }

  object AutoScalingGroupConfiguration {
    @inline
    def apply(
        desiredCapacity: js.UndefOr[DesiredCapacity] = js.undefined,
        instanceType: js.UndefOr[InstanceType] = js.undefined,
        maxSize: js.UndefOr[MaxSize] = js.undefined,
        minSize: js.UndefOr[MinSize] = js.undefined
    ): AutoScalingGroupConfiguration = {
      val __obj = js.Dynamic.literal()
      desiredCapacity.foreach(__v => __obj.updateDynamic("desiredCapacity")(__v.asInstanceOf[js.Any]))
      instanceType.foreach(__v => __obj.updateDynamic("instanceType")(__v.asInstanceOf[js.Any]))
      maxSize.foreach(__v => __obj.updateDynamic("maxSize")(__v.asInstanceOf[js.Any]))
      minSize.foreach(__v => __obj.updateDynamic("minSize")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AutoScalingGroupConfiguration]
    }
  }

  /**
    * Describes an Auto Scaling group recommendation.
    */
  @js.native
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

  object AutoScalingGroupRecommendation {
    @inline
    def apply(
        accountId: js.UndefOr[AccountId] = js.undefined,
        autoScalingGroupArn: js.UndefOr[AutoScalingGroupArn] = js.undefined,
        autoScalingGroupName: js.UndefOr[AutoScalingGroupName] = js.undefined,
        currentConfiguration: js.UndefOr[AutoScalingGroupConfiguration] = js.undefined,
        finding: js.UndefOr[Finding] = js.undefined,
        lastRefreshTimestamp: js.UndefOr[LastRefreshTimestamp] = js.undefined,
        lookBackPeriodInDays: js.UndefOr[LookBackPeriodInDays] = js.undefined,
        recommendationOptions: js.UndefOr[AutoScalingGroupRecommendationOptions] = js.undefined,
        utilizationMetrics: js.UndefOr[UtilizationMetrics] = js.undefined
    ): AutoScalingGroupRecommendation = {
      val __obj = js.Dynamic.literal()
      accountId.foreach(__v => __obj.updateDynamic("accountId")(__v.asInstanceOf[js.Any]))
      autoScalingGroupArn.foreach(__v => __obj.updateDynamic("autoScalingGroupArn")(__v.asInstanceOf[js.Any]))
      autoScalingGroupName.foreach(__v => __obj.updateDynamic("autoScalingGroupName")(__v.asInstanceOf[js.Any]))
      currentConfiguration.foreach(__v => __obj.updateDynamic("currentConfiguration")(__v.asInstanceOf[js.Any]))
      finding.foreach(__v => __obj.updateDynamic("finding")(__v.asInstanceOf[js.Any]))
      lastRefreshTimestamp.foreach(__v => __obj.updateDynamic("lastRefreshTimestamp")(__v.asInstanceOf[js.Any]))
      lookBackPeriodInDays.foreach(__v => __obj.updateDynamic("lookBackPeriodInDays")(__v.asInstanceOf[js.Any]))
      recommendationOptions.foreach(__v => __obj.updateDynamic("recommendationOptions")(__v.asInstanceOf[js.Any]))
      utilizationMetrics.foreach(__v => __obj.updateDynamic("utilizationMetrics")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AutoScalingGroupRecommendation]
    }
  }

  /**
    * Describes a recommendation option for an Auto Scaling group.
    */
  @js.native
  trait AutoScalingGroupRecommendationOption extends js.Object {
    var configuration: js.UndefOr[AutoScalingGroupConfiguration]
    var performanceRisk: js.UndefOr[PerformanceRisk]
    var projectedUtilizationMetrics: js.UndefOr[ProjectedUtilizationMetrics]
    var rank: js.UndefOr[Rank]
  }

  object AutoScalingGroupRecommendationOption {
    @inline
    def apply(
        configuration: js.UndefOr[AutoScalingGroupConfiguration] = js.undefined,
        performanceRisk: js.UndefOr[PerformanceRisk] = js.undefined,
        projectedUtilizationMetrics: js.UndefOr[ProjectedUtilizationMetrics] = js.undefined,
        rank: js.UndefOr[Rank] = js.undefined
    ): AutoScalingGroupRecommendationOption = {
      val __obj = js.Dynamic.literal()
      configuration.foreach(__v => __obj.updateDynamic("configuration")(__v.asInstanceOf[js.Any]))
      performanceRisk.foreach(__v => __obj.updateDynamic("performanceRisk")(__v.asInstanceOf[js.Any]))
      projectedUtilizationMetrics.foreach(__v =>
        __obj.updateDynamic("projectedUtilizationMetrics")(__v.asInstanceOf[js.Any])
      )
      rank.foreach(__v => __obj.updateDynamic("rank")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AutoScalingGroupRecommendationOption]
    }
  }

  /**
    * Describes a filter that returns a more specific list of recommendations.
    */
  @js.native
  trait Filter extends js.Object {
    var name: js.UndefOr[FilterName]
    var values: js.UndefOr[FilterValues]
  }

  object Filter {
    @inline
    def apply(
        name: js.UndefOr[FilterName] = js.undefined,
        values: js.UndefOr[FilterValues] = js.undefined
    ): Filter = {
      val __obj = js.Dynamic.literal()
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      values.foreach(__v => __obj.updateDynamic("values")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Filter]
    }
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
  trait GetAutoScalingGroupRecommendationsRequest extends js.Object {
    var accountIds: js.UndefOr[AccountIds]
    var autoScalingGroupArns: js.UndefOr[AutoScalingGroupArns]
    var filters: js.UndefOr[Filters]
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object GetAutoScalingGroupRecommendationsRequest {
    @inline
    def apply(
        accountIds: js.UndefOr[AccountIds] = js.undefined,
        autoScalingGroupArns: js.UndefOr[AutoScalingGroupArns] = js.undefined,
        filters: js.UndefOr[Filters] = js.undefined,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): GetAutoScalingGroupRecommendationsRequest = {
      val __obj = js.Dynamic.literal()
      accountIds.foreach(__v => __obj.updateDynamic("accountIds")(__v.asInstanceOf[js.Any]))
      autoScalingGroupArns.foreach(__v => __obj.updateDynamic("autoScalingGroupArns")(__v.asInstanceOf[js.Any]))
      filters.foreach(__v => __obj.updateDynamic("filters")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetAutoScalingGroupRecommendationsRequest]
    }
  }

  @js.native
  trait GetAutoScalingGroupRecommendationsResponse extends js.Object {
    var autoScalingGroupRecommendations: js.UndefOr[AutoScalingGroupRecommendations]
    var errors: js.UndefOr[GetRecommendationErrors]
    var nextToken: js.UndefOr[NextToken]
  }

  object GetAutoScalingGroupRecommendationsResponse {
    @inline
    def apply(
        autoScalingGroupRecommendations: js.UndefOr[AutoScalingGroupRecommendations] = js.undefined,
        errors: js.UndefOr[GetRecommendationErrors] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): GetAutoScalingGroupRecommendationsResponse = {
      val __obj = js.Dynamic.literal()
      autoScalingGroupRecommendations.foreach(__v =>
        __obj.updateDynamic("autoScalingGroupRecommendations")(__v.asInstanceOf[js.Any])
      )
      errors.foreach(__v => __obj.updateDynamic("errors")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetAutoScalingGroupRecommendationsResponse]
    }
  }

  @js.native
  trait GetEC2InstanceRecommendationsRequest extends js.Object {
    var accountIds: js.UndefOr[AccountIds]
    var filters: js.UndefOr[Filters]
    var instanceArns: js.UndefOr[InstanceArns]
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object GetEC2InstanceRecommendationsRequest {
    @inline
    def apply(
        accountIds: js.UndefOr[AccountIds] = js.undefined,
        filters: js.UndefOr[Filters] = js.undefined,
        instanceArns: js.UndefOr[InstanceArns] = js.undefined,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): GetEC2InstanceRecommendationsRequest = {
      val __obj = js.Dynamic.literal()
      accountIds.foreach(__v => __obj.updateDynamic("accountIds")(__v.asInstanceOf[js.Any]))
      filters.foreach(__v => __obj.updateDynamic("filters")(__v.asInstanceOf[js.Any]))
      instanceArns.foreach(__v => __obj.updateDynamic("instanceArns")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetEC2InstanceRecommendationsRequest]
    }
  }

  @js.native
  trait GetEC2InstanceRecommendationsResponse extends js.Object {
    var errors: js.UndefOr[GetRecommendationErrors]
    var instanceRecommendations: js.UndefOr[InstanceRecommendations]
    var nextToken: js.UndefOr[NextToken]
  }

  object GetEC2InstanceRecommendationsResponse {
    @inline
    def apply(
        errors: js.UndefOr[GetRecommendationErrors] = js.undefined,
        instanceRecommendations: js.UndefOr[InstanceRecommendations] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): GetEC2InstanceRecommendationsResponse = {
      val __obj = js.Dynamic.literal()
      errors.foreach(__v => __obj.updateDynamic("errors")(__v.asInstanceOf[js.Any]))
      instanceRecommendations.foreach(__v => __obj.updateDynamic("instanceRecommendations")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetEC2InstanceRecommendationsResponse]
    }
  }

  @js.native
  trait GetEC2RecommendationProjectedMetricsRequest extends js.Object {
    var endTime: Timestamp
    var instanceArn: InstanceArn
    var period: Period
    var startTime: Timestamp
    var stat: MetricStatistic
  }

  object GetEC2RecommendationProjectedMetricsRequest {
    @inline
    def apply(
        endTime: Timestamp,
        instanceArn: InstanceArn,
        period: Period,
        startTime: Timestamp,
        stat: MetricStatistic
    ): GetEC2RecommendationProjectedMetricsRequest = {
      val __obj = js.Dynamic.literal(
        "endTime"     -> endTime.asInstanceOf[js.Any],
        "instanceArn" -> instanceArn.asInstanceOf[js.Any],
        "period"      -> period.asInstanceOf[js.Any],
        "startTime"   -> startTime.asInstanceOf[js.Any],
        "stat"        -> stat.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetEC2RecommendationProjectedMetricsRequest]
    }
  }

  @js.native
  trait GetEC2RecommendationProjectedMetricsResponse extends js.Object {
    var recommendedOptionProjectedMetrics: js.UndefOr[RecommendedOptionProjectedMetrics]
  }

  object GetEC2RecommendationProjectedMetricsResponse {
    @inline
    def apply(
        recommendedOptionProjectedMetrics: js.UndefOr[RecommendedOptionProjectedMetrics] = js.undefined
    ): GetEC2RecommendationProjectedMetricsResponse = {
      val __obj = js.Dynamic.literal()
      recommendedOptionProjectedMetrics.foreach(__v =>
        __obj.updateDynamic("recommendedOptionProjectedMetrics")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[GetEC2RecommendationProjectedMetricsResponse]
    }
  }

  @js.native
  trait GetEnrollmentStatusRequest extends js.Object {}

  object GetEnrollmentStatusRequest {
    @inline
    def apply(
    ): GetEnrollmentStatusRequest = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[GetEnrollmentStatusRequest]
    }
  }

  @js.native
  trait GetEnrollmentStatusResponse extends js.Object {
    var memberAccountsEnrolled: js.UndefOr[MemberAccountsEnrolled]
    var status: js.UndefOr[Status]
    var statusReason: js.UndefOr[StatusReason]
  }

  object GetEnrollmentStatusResponse {
    @inline
    def apply(
        memberAccountsEnrolled: js.UndefOr[MemberAccountsEnrolled] = js.undefined,
        status: js.UndefOr[Status] = js.undefined,
        statusReason: js.UndefOr[StatusReason] = js.undefined
    ): GetEnrollmentStatusResponse = {
      val __obj = js.Dynamic.literal()
      memberAccountsEnrolled.foreach(__v => __obj.updateDynamic("memberAccountsEnrolled")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      statusReason.foreach(__v => __obj.updateDynamic("statusReason")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetEnrollmentStatusResponse]
    }
  }

  /**
    * Describes an error experienced when getting recommendations.
    *  For example, an error is returned if you request recommendations for an unsupported Auto Scaling group, or if you request recommendations for an instance of an unsupported instance family.
    */
  @js.native
  trait GetRecommendationError extends js.Object {
    var code: js.UndefOr[Code]
    var identifier: js.UndefOr[Identifier]
    var message: js.UndefOr[Message]
  }

  object GetRecommendationError {
    @inline
    def apply(
        code: js.UndefOr[Code] = js.undefined,
        identifier: js.UndefOr[Identifier] = js.undefined,
        message: js.UndefOr[Message] = js.undefined
    ): GetRecommendationError = {
      val __obj = js.Dynamic.literal()
      code.foreach(__v => __obj.updateDynamic("code")(__v.asInstanceOf[js.Any]))
      identifier.foreach(__v => __obj.updateDynamic("identifier")(__v.asInstanceOf[js.Any]))
      message.foreach(__v => __obj.updateDynamic("message")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetRecommendationError]
    }
  }

  @js.native
  trait GetRecommendationSummariesRequest extends js.Object {
    var accountIds: js.UndefOr[AccountIds]
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object GetRecommendationSummariesRequest {
    @inline
    def apply(
        accountIds: js.UndefOr[AccountIds] = js.undefined,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): GetRecommendationSummariesRequest = {
      val __obj = js.Dynamic.literal()
      accountIds.foreach(__v => __obj.updateDynamic("accountIds")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetRecommendationSummariesRequest]
    }
  }

  @js.native
  trait GetRecommendationSummariesResponse extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var recommendationSummaries: js.UndefOr[RecommendationSummaries]
  }

  object GetRecommendationSummariesResponse {
    @inline
    def apply(
        nextToken: js.UndefOr[NextToken] = js.undefined,
        recommendationSummaries: js.UndefOr[RecommendationSummaries] = js.undefined
    ): GetRecommendationSummariesResponse = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      recommendationSummaries.foreach(__v => __obj.updateDynamic("recommendationSummaries")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetRecommendationSummariesResponse]
    }
  }

  /**
    * Describes an Amazon EC2 instance recommendation.
    */
  @js.native
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

  object InstanceRecommendation {
    @inline
    def apply(
        accountId: js.UndefOr[AccountId] = js.undefined,
        currentInstanceType: js.UndefOr[CurrentInstanceType] = js.undefined,
        finding: js.UndefOr[Finding] = js.undefined,
        instanceArn: js.UndefOr[InstanceArn] = js.undefined,
        instanceName: js.UndefOr[InstanceName] = js.undefined,
        lastRefreshTimestamp: js.UndefOr[LastRefreshTimestamp] = js.undefined,
        lookBackPeriodInDays: js.UndefOr[LookBackPeriodInDays] = js.undefined,
        recommendationOptions: js.UndefOr[RecommendationOptions] = js.undefined,
        recommendationSources: js.UndefOr[RecommendationSources] = js.undefined,
        utilizationMetrics: js.UndefOr[UtilizationMetrics] = js.undefined
    ): InstanceRecommendation = {
      val __obj = js.Dynamic.literal()
      accountId.foreach(__v => __obj.updateDynamic("accountId")(__v.asInstanceOf[js.Any]))
      currentInstanceType.foreach(__v => __obj.updateDynamic("currentInstanceType")(__v.asInstanceOf[js.Any]))
      finding.foreach(__v => __obj.updateDynamic("finding")(__v.asInstanceOf[js.Any]))
      instanceArn.foreach(__v => __obj.updateDynamic("instanceArn")(__v.asInstanceOf[js.Any]))
      instanceName.foreach(__v => __obj.updateDynamic("instanceName")(__v.asInstanceOf[js.Any]))
      lastRefreshTimestamp.foreach(__v => __obj.updateDynamic("lastRefreshTimestamp")(__v.asInstanceOf[js.Any]))
      lookBackPeriodInDays.foreach(__v => __obj.updateDynamic("lookBackPeriodInDays")(__v.asInstanceOf[js.Any]))
      recommendationOptions.foreach(__v => __obj.updateDynamic("recommendationOptions")(__v.asInstanceOf[js.Any]))
      recommendationSources.foreach(__v => __obj.updateDynamic("recommendationSources")(__v.asInstanceOf[js.Any]))
      utilizationMetrics.foreach(__v => __obj.updateDynamic("utilizationMetrics")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InstanceRecommendation]
    }
  }

  /**
    * Describes a recommendation option for an Amazon EC2 instance.
    */
  @js.native
  trait InstanceRecommendationOption extends js.Object {
    var instanceType: js.UndefOr[InstanceType]
    var performanceRisk: js.UndefOr[PerformanceRisk]
    var projectedUtilizationMetrics: js.UndefOr[ProjectedUtilizationMetrics]
    var rank: js.UndefOr[Rank]
  }

  object InstanceRecommendationOption {
    @inline
    def apply(
        instanceType: js.UndefOr[InstanceType] = js.undefined,
        performanceRisk: js.UndefOr[PerformanceRisk] = js.undefined,
        projectedUtilizationMetrics: js.UndefOr[ProjectedUtilizationMetrics] = js.undefined,
        rank: js.UndefOr[Rank] = js.undefined
    ): InstanceRecommendationOption = {
      val __obj = js.Dynamic.literal()
      instanceType.foreach(__v => __obj.updateDynamic("instanceType")(__v.asInstanceOf[js.Any]))
      performanceRisk.foreach(__v => __obj.updateDynamic("performanceRisk")(__v.asInstanceOf[js.Any]))
      projectedUtilizationMetrics.foreach(__v =>
        __obj.updateDynamic("projectedUtilizationMetrics")(__v.asInstanceOf[js.Any])
      )
      rank.foreach(__v => __obj.updateDynamic("rank")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InstanceRecommendationOption]
    }
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
  trait ProjectedMetric extends js.Object {
    var name: js.UndefOr[MetricName]
    var timestamps: js.UndefOr[Timestamps]
    var values: js.UndefOr[MetricValues]
  }

  object ProjectedMetric {
    @inline
    def apply(
        name: js.UndefOr[MetricName] = js.undefined,
        timestamps: js.UndefOr[Timestamps] = js.undefined,
        values: js.UndefOr[MetricValues] = js.undefined
    ): ProjectedMetric = {
      val __obj = js.Dynamic.literal()
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      timestamps.foreach(__v => __obj.updateDynamic("timestamps")(__v.asInstanceOf[js.Any]))
      values.foreach(__v => __obj.updateDynamic("values")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ProjectedMetric]
    }
  }

  /**
    * Describes the source of a recommendation, such as an Amazon EC2 instance or Auto Scaling group.
    */
  @js.native
  trait RecommendationSource extends js.Object {
    var recommendationSourceArn: js.UndefOr[RecommendationSourceArn]
    var recommendationSourceType: js.UndefOr[RecommendationSourceType]
  }

  object RecommendationSource {
    @inline
    def apply(
        recommendationSourceArn: js.UndefOr[RecommendationSourceArn] = js.undefined,
        recommendationSourceType: js.UndefOr[RecommendationSourceType] = js.undefined
    ): RecommendationSource = {
      val __obj = js.Dynamic.literal()
      recommendationSourceArn.foreach(__v => __obj.updateDynamic("recommendationSourceArn")(__v.asInstanceOf[js.Any]))
      recommendationSourceType.foreach(__v => __obj.updateDynamic("recommendationSourceType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RecommendationSource]
    }
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
  trait RecommendationSummary extends js.Object {
    var accountId: js.UndefOr[AccountId]
    var recommendationResourceType: js.UndefOr[RecommendationSourceType]
    var summaries: js.UndefOr[Summaries]
  }

  object RecommendationSummary {
    @inline
    def apply(
        accountId: js.UndefOr[AccountId] = js.undefined,
        recommendationResourceType: js.UndefOr[RecommendationSourceType] = js.undefined,
        summaries: js.UndefOr[Summaries] = js.undefined
    ): RecommendationSummary = {
      val __obj = js.Dynamic.literal()
      accountId.foreach(__v => __obj.updateDynamic("accountId")(__v.asInstanceOf[js.Any]))
      recommendationResourceType.foreach(__v =>
        __obj.updateDynamic("recommendationResourceType")(__v.asInstanceOf[js.Any])
      )
      summaries.foreach(__v => __obj.updateDynamic("summaries")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RecommendationSummary]
    }
  }

  /**
    * Describes a projected utilization metric of a recommendation option.
    */
  @js.native
  trait RecommendedOptionProjectedMetric extends js.Object {
    var projectedMetrics: js.UndefOr[ProjectedMetrics]
    var rank: js.UndefOr[Rank]
    var recommendedInstanceType: js.UndefOr[RecommendedInstanceType]
  }

  object RecommendedOptionProjectedMetric {
    @inline
    def apply(
        projectedMetrics: js.UndefOr[ProjectedMetrics] = js.undefined,
        rank: js.UndefOr[Rank] = js.undefined,
        recommendedInstanceType: js.UndefOr[RecommendedInstanceType] = js.undefined
    ): RecommendedOptionProjectedMetric = {
      val __obj = js.Dynamic.literal()
      projectedMetrics.foreach(__v => __obj.updateDynamic("projectedMetrics")(__v.asInstanceOf[js.Any]))
      rank.foreach(__v => __obj.updateDynamic("rank")(__v.asInstanceOf[js.Any]))
      recommendedInstanceType.foreach(__v => __obj.updateDynamic("recommendedInstanceType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RecommendedOptionProjectedMetric]
    }
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
  trait Summary extends js.Object {
    var name: js.UndefOr[Finding]
    var value: js.UndefOr[SummaryValue]
  }

  object Summary {
    @inline
    def apply(
        name: js.UndefOr[Finding] = js.undefined,
        value: js.UndefOr[SummaryValue] = js.undefined
    ): Summary = {
      val __obj = js.Dynamic.literal()
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      value.foreach(__v => __obj.updateDynamic("value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Summary]
    }
  }

  @js.native
  trait UpdateEnrollmentStatusRequest extends js.Object {
    var status: Status
    var includeMemberAccounts: js.UndefOr[IncludeMemberAccounts]
  }

  object UpdateEnrollmentStatusRequest {
    @inline
    def apply(
        status: Status,
        includeMemberAccounts: js.UndefOr[IncludeMemberAccounts] = js.undefined
    ): UpdateEnrollmentStatusRequest = {
      val __obj = js.Dynamic.literal(
        "status" -> status.asInstanceOf[js.Any]
      )

      includeMemberAccounts.foreach(__v => __obj.updateDynamic("includeMemberAccounts")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateEnrollmentStatusRequest]
    }
  }

  @js.native
  trait UpdateEnrollmentStatusResponse extends js.Object {
    var status: js.UndefOr[Status]
    var statusReason: js.UndefOr[StatusReason]
  }

  object UpdateEnrollmentStatusResponse {
    @inline
    def apply(
        status: js.UndefOr[Status] = js.undefined,
        statusReason: js.UndefOr[StatusReason] = js.undefined
    ): UpdateEnrollmentStatusResponse = {
      val __obj = js.Dynamic.literal()
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      statusReason.foreach(__v => __obj.updateDynamic("statusReason")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateEnrollmentStatusResponse]
    }
  }

  /**
    * Describes a utilization metric of a resource, such as an Amazon EC2 instance.
    */
  @js.native
  trait UtilizationMetric extends js.Object {
    var name: js.UndefOr[MetricName]
    var statistic: js.UndefOr[MetricStatistic]
    var value: js.UndefOr[MetricValue]
  }

  object UtilizationMetric {
    @inline
    def apply(
        name: js.UndefOr[MetricName] = js.undefined,
        statistic: js.UndefOr[MetricStatistic] = js.undefined,
        value: js.UndefOr[MetricValue] = js.undefined
    ): UtilizationMetric = {
      val __obj = js.Dynamic.literal()
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      statistic.foreach(__v => __obj.updateDynamic("statistic")(__v.asInstanceOf[js.Any]))
      value.foreach(__v => __obj.updateDynamic("value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UtilizationMetric]
    }
  }
}
