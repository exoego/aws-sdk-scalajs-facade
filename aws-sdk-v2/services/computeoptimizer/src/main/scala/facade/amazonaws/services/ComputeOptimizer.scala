package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import scala.language.implicitConversions
import facade.amazonaws._

package object computeoptimizer {
  type AccountEnrollmentStatuses = js.Array[AccountEnrollmentStatus]
  type AccountId = String
  type AccountIds = js.Array[AccountId]
  type AutoScalingGroupArn = String
  type AutoScalingGroupArns = js.Array[AutoScalingGroupArn]
  type AutoScalingGroupName = String
  type AutoScalingGroupRecommendationOptions = js.Array[AutoScalingGroupRecommendationOption]
  type AutoScalingGroupRecommendations = js.Array[AutoScalingGroupRecommendation]
  type Code = String
  type CpuVendorArchitectures = js.Array[CpuVendorArchitecture]
  type CreationTimestamp = js.Date
  type CurrentInstanceType = String
  type DesiredCapacity = Int
  type DestinationBucket = String
  type DestinationKey = String
  type DestinationKeyPrefix = String
  type EBSFilters = js.Array[EBSFilter]
  type EBSUtilizationMetrics = js.Array[EBSUtilizationMetric]
  type EnrollmentFilters = js.Array[EnrollmentFilter]
  type ExportableAutoScalingGroupFields = js.Array[ExportableAutoScalingGroupField]
  type ExportableInstanceFields = js.Array[ExportableInstanceField]
  type ExportableLambdaFunctionFields = js.Array[ExportableLambdaFunctionField]
  type ExportableVolumeFields = js.Array[ExportableVolumeField]
  type FailureReason = String
  type FilterValue = String
  type FilterValues = js.Array[FilterValue]
  type Filters = js.Array[Filter]
  type FunctionArn = String
  type FunctionArns = js.Array[FunctionArn]
  type FunctionVersion = String
  type GetRecommendationErrors = js.Array[GetRecommendationError]
  type High = Double
  type Identifier = String
  type IncludeMemberAccounts = Boolean
  type InferredWorkloadTypes = js.Array[InferredWorkloadType]
  type InstanceArn = String
  type InstanceArns = js.Array[InstanceArn]
  type InstanceName = String
  type InstanceRecommendationFindingReasonCodes = js.Array[InstanceRecommendationFindingReasonCode]
  type InstanceRecommendations = js.Array[InstanceRecommendation]
  type InstanceType = String
  type JobFilters = js.Array[JobFilter]
  type JobId = String
  type JobIds = js.Array[JobId]
  type LambdaFunctionMemoryProjectedMetrics = js.Array[LambdaFunctionMemoryProjectedMetric]
  type LambdaFunctionMemoryRecommendationOptions = js.Array[LambdaFunctionMemoryRecommendationOption]
  type LambdaFunctionRecommendationFilters = js.Array[LambdaFunctionRecommendationFilter]
  type LambdaFunctionRecommendationFindingReasonCodes = js.Array[LambdaFunctionRecommendationFindingReasonCode]
  type LambdaFunctionRecommendations = js.Array[LambdaFunctionRecommendation]
  type LambdaFunctionUtilizationMetrics = js.Array[LambdaFunctionUtilizationMetric]
  type LastRefreshTimestamp = js.Date
  type LastUpdatedTimestamp = js.Date
  type LookBackPeriodInDays = Double
  type Low = Double
  type MaxResults = Int
  type MaxSize = Int
  type Medium = Double
  type MemberAccountsEnrolled = Boolean
  type MemorySize = Int
  type Message = String
  type MetadataKey = String
  type MetricValue = Double
  type MetricValues = js.Array[MetricValue]
  type MinSize = Int
  type NextToken = String
  type NumberOfInvocations = Double
  type NumberOfMemberAccountsOptedIn = Int
  type PerformanceRisk = Double
  type Period = Int
  type PlatformDifferences = js.Array[PlatformDifference]
  type ProjectedMetrics = js.Array[ProjectedMetric]
  type ProjectedUtilizationMetrics = js.Array[UtilizationMetric]
  type Rank = Int
  type ReasonCodeSummaries = js.Array[ReasonCodeSummary]
  type RecommendationExportJobs = js.Array[RecommendationExportJob]
  type RecommendationOptions = js.Array[InstanceRecommendationOption]
  type RecommendationPreferenceNames = js.Array[RecommendationPreferenceName]
  type RecommendationPreferencesDetails = js.Array[RecommendationPreferencesDetail]
  type RecommendationSourceArn = String
  type RecommendationSources = js.Array[RecommendationSource]
  type RecommendationSummaries = js.Array[RecommendationSummary]
  type RecommendedInstanceType = String
  type RecommendedOptionProjectedMetrics = js.Array[RecommendedOptionProjectedMetric]
  type ResourceArn = String
  type SavingsOpportunityPercentage = Double
  type ScopeValue = String
  type StatusReason = String
  type Summaries = js.Array[Summary]
  type SummaryValue = Double
  type Timestamp = js.Date
  type Timestamps = js.Array[Timestamp]
  type UtilizationMetrics = js.Array[UtilizationMetric]
  type Value = Double
  type VeryLow = Double
  type VolumeArn = String
  type VolumeArns = js.Array[VolumeArn]
  type VolumeBaselineIOPS = Int
  type VolumeBaselineThroughput = Int
  type VolumeBurstIOPS = Int
  type VolumeBurstThroughput = Int
  type VolumeRecommendationOptions = js.Array[VolumeRecommendationOption]
  type VolumeRecommendations = js.Array[VolumeRecommendation]
  type VolumeSize = Int
  type VolumeType = String

  final class ComputeOptimizerOps(private val service: ComputeOptimizer) extends AnyVal {

    @inline def deleteRecommendationPreferencesFuture(params: DeleteRecommendationPreferencesRequest): Future[DeleteRecommendationPreferencesResponse] = service.deleteRecommendationPreferences(params).promise().toFuture
    @inline def describeRecommendationExportJobsFuture(params: DescribeRecommendationExportJobsRequest): Future[DescribeRecommendationExportJobsResponse] = service.describeRecommendationExportJobs(params).promise().toFuture
    @inline def exportAutoScalingGroupRecommendationsFuture(params: ExportAutoScalingGroupRecommendationsRequest): Future[ExportAutoScalingGroupRecommendationsResponse] = service.exportAutoScalingGroupRecommendations(params).promise().toFuture
    @inline def exportEBSVolumeRecommendationsFuture(params: ExportEBSVolumeRecommendationsRequest): Future[ExportEBSVolumeRecommendationsResponse] = service.exportEBSVolumeRecommendations(params).promise().toFuture
    @inline def exportEC2InstanceRecommendationsFuture(params: ExportEC2InstanceRecommendationsRequest): Future[ExportEC2InstanceRecommendationsResponse] = service.exportEC2InstanceRecommendations(params).promise().toFuture
    @inline def exportLambdaFunctionRecommendationsFuture(params: ExportLambdaFunctionRecommendationsRequest): Future[ExportLambdaFunctionRecommendationsResponse] = service.exportLambdaFunctionRecommendations(params).promise().toFuture
    @inline def getAutoScalingGroupRecommendationsFuture(params: GetAutoScalingGroupRecommendationsRequest): Future[GetAutoScalingGroupRecommendationsResponse] = service.getAutoScalingGroupRecommendations(params).promise().toFuture
    @inline def getEBSVolumeRecommendationsFuture(params: GetEBSVolumeRecommendationsRequest): Future[GetEBSVolumeRecommendationsResponse] = service.getEBSVolumeRecommendations(params).promise().toFuture
    @inline def getEC2InstanceRecommendationsFuture(params: GetEC2InstanceRecommendationsRequest): Future[GetEC2InstanceRecommendationsResponse] = service.getEC2InstanceRecommendations(params).promise().toFuture
    @inline def getEC2RecommendationProjectedMetricsFuture(params: GetEC2RecommendationProjectedMetricsRequest): Future[GetEC2RecommendationProjectedMetricsResponse] = service.getEC2RecommendationProjectedMetrics(params).promise().toFuture
    @inline def getEffectiveRecommendationPreferencesFuture(params: GetEffectiveRecommendationPreferencesRequest): Future[GetEffectiveRecommendationPreferencesResponse] = service.getEffectiveRecommendationPreferences(params).promise().toFuture
    @inline def getEnrollmentStatusFuture(params: GetEnrollmentStatusRequest): Future[GetEnrollmentStatusResponse] = service.getEnrollmentStatus(params).promise().toFuture
    @inline def getEnrollmentStatusesForOrganizationFuture(params: GetEnrollmentStatusesForOrganizationRequest): Future[GetEnrollmentStatusesForOrganizationResponse] = service.getEnrollmentStatusesForOrganization(params).promise().toFuture
    @inline def getLambdaFunctionRecommendationsFuture(params: GetLambdaFunctionRecommendationsRequest): Future[GetLambdaFunctionRecommendationsResponse] = service.getLambdaFunctionRecommendations(params).promise().toFuture
    @inline def getRecommendationPreferencesFuture(params: GetRecommendationPreferencesRequest): Future[GetRecommendationPreferencesResponse] = service.getRecommendationPreferences(params).promise().toFuture
    @inline def getRecommendationSummariesFuture(params: GetRecommendationSummariesRequest): Future[GetRecommendationSummariesResponse] = service.getRecommendationSummaries(params).promise().toFuture
    @inline def putRecommendationPreferencesFuture(params: PutRecommendationPreferencesRequest): Future[PutRecommendationPreferencesResponse] = service.putRecommendationPreferences(params).promise().toFuture
    @inline def updateEnrollmentStatusFuture(params: UpdateEnrollmentStatusRequest): Future[UpdateEnrollmentStatusResponse] = service.updateEnrollmentStatus(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/computeoptimizer", JSImport.Namespace, "AWS.ComputeOptimizer")
  class ComputeOptimizer() extends js.Object {
    def this(config: AWSConfig) = this()

    def deleteRecommendationPreferences(params: DeleteRecommendationPreferencesRequest): Request[DeleteRecommendationPreferencesResponse] = js.native
    def describeRecommendationExportJobs(params: DescribeRecommendationExportJobsRequest): Request[DescribeRecommendationExportJobsResponse] = js.native
    def exportAutoScalingGroupRecommendations(params: ExportAutoScalingGroupRecommendationsRequest): Request[ExportAutoScalingGroupRecommendationsResponse] = js.native
    def exportEBSVolumeRecommendations(params: ExportEBSVolumeRecommendationsRequest): Request[ExportEBSVolumeRecommendationsResponse] = js.native
    def exportEC2InstanceRecommendations(params: ExportEC2InstanceRecommendationsRequest): Request[ExportEC2InstanceRecommendationsResponse] = js.native
    def exportLambdaFunctionRecommendations(params: ExportLambdaFunctionRecommendationsRequest): Request[ExportLambdaFunctionRecommendationsResponse] = js.native
    def getAutoScalingGroupRecommendations(params: GetAutoScalingGroupRecommendationsRequest): Request[GetAutoScalingGroupRecommendationsResponse] = js.native
    def getEBSVolumeRecommendations(params: GetEBSVolumeRecommendationsRequest): Request[GetEBSVolumeRecommendationsResponse] = js.native
    def getEC2InstanceRecommendations(params: GetEC2InstanceRecommendationsRequest): Request[GetEC2InstanceRecommendationsResponse] = js.native
    def getEC2RecommendationProjectedMetrics(params: GetEC2RecommendationProjectedMetricsRequest): Request[GetEC2RecommendationProjectedMetricsResponse] = js.native
    def getEffectiveRecommendationPreferences(params: GetEffectiveRecommendationPreferencesRequest): Request[GetEffectiveRecommendationPreferencesResponse] = js.native
    def getEnrollmentStatus(params: GetEnrollmentStatusRequest): Request[GetEnrollmentStatusResponse] = js.native
    def getEnrollmentStatusesForOrganization(params: GetEnrollmentStatusesForOrganizationRequest): Request[GetEnrollmentStatusesForOrganizationResponse] = js.native
    def getLambdaFunctionRecommendations(params: GetLambdaFunctionRecommendationsRequest): Request[GetLambdaFunctionRecommendationsResponse] = js.native
    def getRecommendationPreferences(params: GetRecommendationPreferencesRequest): Request[GetRecommendationPreferencesResponse] = js.native
    def getRecommendationSummaries(params: GetRecommendationSummariesRequest): Request[GetRecommendationSummariesResponse] = js.native
    def putRecommendationPreferences(params: PutRecommendationPreferencesRequest): Request[PutRecommendationPreferencesResponse] = js.native
    def updateEnrollmentStatus(params: UpdateEnrollmentStatusRequest): Request[UpdateEnrollmentStatusResponse] = js.native
  }
  object ComputeOptimizer {
    @inline implicit def toOps(service: ComputeOptimizer): ComputeOptimizerOps = {
      new ComputeOptimizerOps(service)
    }
  }

  /** Describes the enrollment status of an organization's member accounts in Compute Optimizer.
    */
  @js.native
  trait AccountEnrollmentStatus extends js.Object {
    var accountId: js.UndefOr[AccountId]
    var lastUpdatedTimestamp: js.UndefOr[LastUpdatedTimestamp]
    var status: js.UndefOr[Status]
    var statusReason: js.UndefOr[StatusReason]
  }

  object AccountEnrollmentStatus {
    @inline
    def apply(
        accountId: js.UndefOr[AccountId] = js.undefined,
        lastUpdatedTimestamp: js.UndefOr[LastUpdatedTimestamp] = js.undefined,
        status: js.UndefOr[Status] = js.undefined,
        statusReason: js.UndefOr[StatusReason] = js.undefined
    ): AccountEnrollmentStatus = {
      val __obj = js.Dynamic.literal()
      accountId.foreach(__v => __obj.updateDynamic("accountId")(__v.asInstanceOf[js.Any]))
      lastUpdatedTimestamp.foreach(__v => __obj.updateDynamic("lastUpdatedTimestamp")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      statusReason.foreach(__v => __obj.updateDynamic("statusReason")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AccountEnrollmentStatus]
    }
  }

  /** Describes the configuration of an Auto Scaling group.
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

  /** Describes an Auto Scaling group recommendation.
    */
  @js.native
  trait AutoScalingGroupRecommendation extends js.Object {
    var accountId: js.UndefOr[AccountId]
    var autoScalingGroupArn: js.UndefOr[AutoScalingGroupArn]
    var autoScalingGroupName: js.UndefOr[AutoScalingGroupName]
    var currentConfiguration: js.UndefOr[AutoScalingGroupConfiguration]
    var currentPerformanceRisk: js.UndefOr[CurrentPerformanceRisk]
    var effectiveRecommendationPreferences: js.UndefOr[EffectiveRecommendationPreferences]
    var finding: js.UndefOr[Finding]
    var inferredWorkloadTypes: js.UndefOr[InferredWorkloadTypes]
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
        currentPerformanceRisk: js.UndefOr[CurrentPerformanceRisk] = js.undefined,
        effectiveRecommendationPreferences: js.UndefOr[EffectiveRecommendationPreferences] = js.undefined,
        finding: js.UndefOr[Finding] = js.undefined,
        inferredWorkloadTypes: js.UndefOr[InferredWorkloadTypes] = js.undefined,
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
      currentPerformanceRisk.foreach(__v => __obj.updateDynamic("currentPerformanceRisk")(__v.asInstanceOf[js.Any]))
      effectiveRecommendationPreferences.foreach(__v => __obj.updateDynamic("effectiveRecommendationPreferences")(__v.asInstanceOf[js.Any]))
      finding.foreach(__v => __obj.updateDynamic("finding")(__v.asInstanceOf[js.Any]))
      inferredWorkloadTypes.foreach(__v => __obj.updateDynamic("inferredWorkloadTypes")(__v.asInstanceOf[js.Any]))
      lastRefreshTimestamp.foreach(__v => __obj.updateDynamic("lastRefreshTimestamp")(__v.asInstanceOf[js.Any]))
      lookBackPeriodInDays.foreach(__v => __obj.updateDynamic("lookBackPeriodInDays")(__v.asInstanceOf[js.Any]))
      recommendationOptions.foreach(__v => __obj.updateDynamic("recommendationOptions")(__v.asInstanceOf[js.Any]))
      utilizationMetrics.foreach(__v => __obj.updateDynamic("utilizationMetrics")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AutoScalingGroupRecommendation]
    }
  }

  /** Describes a recommendation option for an Auto Scaling group.
    */
  @js.native
  trait AutoScalingGroupRecommendationOption extends js.Object {
    var configuration: js.UndefOr[AutoScalingGroupConfiguration]
    var migrationEffort: js.UndefOr[MigrationEffort]
    var performanceRisk: js.UndefOr[PerformanceRisk]
    var projectedUtilizationMetrics: js.UndefOr[ProjectedUtilizationMetrics]
    var rank: js.UndefOr[Rank]
    var savingsOpportunity: js.UndefOr[SavingsOpportunity]
  }

  object AutoScalingGroupRecommendationOption {
    @inline
    def apply(
        configuration: js.UndefOr[AutoScalingGroupConfiguration] = js.undefined,
        migrationEffort: js.UndefOr[MigrationEffort] = js.undefined,
        performanceRisk: js.UndefOr[PerformanceRisk] = js.undefined,
        projectedUtilizationMetrics: js.UndefOr[ProjectedUtilizationMetrics] = js.undefined,
        rank: js.UndefOr[Rank] = js.undefined,
        savingsOpportunity: js.UndefOr[SavingsOpportunity] = js.undefined
    ): AutoScalingGroupRecommendationOption = {
      val __obj = js.Dynamic.literal()
      configuration.foreach(__v => __obj.updateDynamic("configuration")(__v.asInstanceOf[js.Any]))
      migrationEffort.foreach(__v => __obj.updateDynamic("migrationEffort")(__v.asInstanceOf[js.Any]))
      performanceRisk.foreach(__v => __obj.updateDynamic("performanceRisk")(__v.asInstanceOf[js.Any]))
      projectedUtilizationMetrics.foreach(__v => __obj.updateDynamic("projectedUtilizationMetrics")(__v.asInstanceOf[js.Any]))
      rank.foreach(__v => __obj.updateDynamic("rank")(__v.asInstanceOf[js.Any]))
      savingsOpportunity.foreach(__v => __obj.updateDynamic("savingsOpportunity")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AutoScalingGroupRecommendationOption]
    }
  }

  /** Describes the performance risk ratings for a given resource type. Resources with a <code>high</code> or <code>medium</code> rating are at risk of not meeting the performance needs of their workloads, while resources with a <code>low</code> rating are performing well in their workloads.
    */
  @js.native
  trait CurrentPerformanceRiskRatings extends js.Object {
    var high: js.UndefOr[High]
    var low: js.UndefOr[Low]
    var medium: js.UndefOr[Medium]
    var veryLow: js.UndefOr[VeryLow]
  }

  object CurrentPerformanceRiskRatings {
    @inline
    def apply(
        high: js.UndefOr[High] = js.undefined,
        low: js.UndefOr[Low] = js.undefined,
        medium: js.UndefOr[Medium] = js.undefined,
        veryLow: js.UndefOr[VeryLow] = js.undefined
    ): CurrentPerformanceRiskRatings = {
      val __obj = js.Dynamic.literal()
      high.foreach(__v => __obj.updateDynamic("high")(__v.asInstanceOf[js.Any]))
      low.foreach(__v => __obj.updateDynamic("low")(__v.asInstanceOf[js.Any]))
      medium.foreach(__v => __obj.updateDynamic("medium")(__v.asInstanceOf[js.Any]))
      veryLow.foreach(__v => __obj.updateDynamic("veryLow")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CurrentPerformanceRiskRatings]
    }
  }

  @js.native
  trait DeleteRecommendationPreferencesRequest extends js.Object {
    var recommendationPreferenceNames: RecommendationPreferenceNames
    var resourceType: ResourceType
    var scope: js.UndefOr[Scope]
  }

  object DeleteRecommendationPreferencesRequest {
    @inline
    def apply(
        recommendationPreferenceNames: RecommendationPreferenceNames,
        resourceType: ResourceType,
        scope: js.UndefOr[Scope] = js.undefined
    ): DeleteRecommendationPreferencesRequest = {
      val __obj = js.Dynamic.literal(
        "recommendationPreferenceNames" -> recommendationPreferenceNames.asInstanceOf[js.Any],
        "resourceType" -> resourceType.asInstanceOf[js.Any]
      )

      scope.foreach(__v => __obj.updateDynamic("scope")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteRecommendationPreferencesRequest]
    }
  }

  @js.native
  trait DeleteRecommendationPreferencesResponse extends js.Object

  object DeleteRecommendationPreferencesResponse {
    @inline
    def apply(): DeleteRecommendationPreferencesResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteRecommendationPreferencesResponse]
    }
  }

  @js.native
  trait DescribeRecommendationExportJobsRequest extends js.Object {
    var filters: js.UndefOr[JobFilters]
    var jobIds: js.UndefOr[JobIds]
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object DescribeRecommendationExportJobsRequest {
    @inline
    def apply(
        filters: js.UndefOr[JobFilters] = js.undefined,
        jobIds: js.UndefOr[JobIds] = js.undefined,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeRecommendationExportJobsRequest = {
      val __obj = js.Dynamic.literal()
      filters.foreach(__v => __obj.updateDynamic("filters")(__v.asInstanceOf[js.Any]))
      jobIds.foreach(__v => __obj.updateDynamic("jobIds")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeRecommendationExportJobsRequest]
    }
  }

  @js.native
  trait DescribeRecommendationExportJobsResponse extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var recommendationExportJobs: js.UndefOr[RecommendationExportJobs]
  }

  object DescribeRecommendationExportJobsResponse {
    @inline
    def apply(
        nextToken: js.UndefOr[NextToken] = js.undefined,
        recommendationExportJobs: js.UndefOr[RecommendationExportJobs] = js.undefined
    ): DescribeRecommendationExportJobsResponse = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      recommendationExportJobs.foreach(__v => __obj.updateDynamic("recommendationExportJobs")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeRecommendationExportJobsResponse]
    }
  }

  /** Describes a filter that returns a more specific list of Amazon Elastic Block Store (Amazon EBS) volume recommendations. Use this filter with the <a>GetEBSVolumeRecommendations</a> action. You can use <code>LambdaFunctionRecommendationFilter</code> with the <a>GetLambdaFunctionRecommendations</a> action, <code>JobFilter</code> with the <a>DescribeRecommendationExportJobs</a> action, and <code>Filter</code> with the <a>GetAutoScalingGroupRecommendations</a> and <a>GetEC2InstanceRecommendations</a> actions.
    */
  @js.native
  trait EBSFilter extends js.Object {
    var name: js.UndefOr[EBSFilterName]
    var values: js.UndefOr[FilterValues]
  }

  object EBSFilter {
    @inline
    def apply(
        name: js.UndefOr[EBSFilterName] = js.undefined,
        values: js.UndefOr[FilterValues] = js.undefined
    ): EBSFilter = {
      val __obj = js.Dynamic.literal()
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      values.foreach(__v => __obj.updateDynamic("values")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EBSFilter]
    }
  }

  /** Describes a utilization metric of an Amazon Elastic Block Store (Amazon EBS) volume. Compare the utilization metric data of your resource against its projected utilization metric data to determine the performance difference between your current resource and the recommended option.
    */
  @js.native
  trait EBSUtilizationMetric extends js.Object {
    var name: js.UndefOr[EBSMetricName]
    var statistic: js.UndefOr[MetricStatistic]
    var value: js.UndefOr[MetricValue]
  }

  object EBSUtilizationMetric {
    @inline
    def apply(
        name: js.UndefOr[EBSMetricName] = js.undefined,
        statistic: js.UndefOr[MetricStatistic] = js.undefined,
        value: js.UndefOr[MetricValue] = js.undefined
    ): EBSUtilizationMetric = {
      val __obj = js.Dynamic.literal()
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      statistic.foreach(__v => __obj.updateDynamic("statistic")(__v.asInstanceOf[js.Any]))
      value.foreach(__v => __obj.updateDynamic("value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EBSUtilizationMetric]
    }
  }

  /** Describes the effective recommendation preferences for a resource.
    */
  @js.native
  trait EffectiveRecommendationPreferences extends js.Object {
    var cpuVendorArchitectures: js.UndefOr[CpuVendorArchitectures]
    var enhancedInfrastructureMetrics: js.UndefOr[EnhancedInfrastructureMetrics]
    var externalMetricsPreference: js.UndefOr[ExternalMetricsPreference]
    var inferredWorkloadTypes: js.UndefOr[InferredWorkloadTypesPreference]
  }

  object EffectiveRecommendationPreferences {
    @inline
    def apply(
        cpuVendorArchitectures: js.UndefOr[CpuVendorArchitectures] = js.undefined,
        enhancedInfrastructureMetrics: js.UndefOr[EnhancedInfrastructureMetrics] = js.undefined,
        externalMetricsPreference: js.UndefOr[ExternalMetricsPreference] = js.undefined,
        inferredWorkloadTypes: js.UndefOr[InferredWorkloadTypesPreference] = js.undefined
    ): EffectiveRecommendationPreferences = {
      val __obj = js.Dynamic.literal()
      cpuVendorArchitectures.foreach(__v => __obj.updateDynamic("cpuVendorArchitectures")(__v.asInstanceOf[js.Any]))
      enhancedInfrastructureMetrics.foreach(__v => __obj.updateDynamic("enhancedInfrastructureMetrics")(__v.asInstanceOf[js.Any]))
      externalMetricsPreference.foreach(__v => __obj.updateDynamic("externalMetricsPreference")(__v.asInstanceOf[js.Any]))
      inferredWorkloadTypes.foreach(__v => __obj.updateDynamic("inferredWorkloadTypes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EffectiveRecommendationPreferences]
    }
  }

  /** Describes a filter that returns a more specific list of account enrollment statuses. Use this filter with the <a>GetEnrollmentStatusesForOrganization</a> action.
    */
  @js.native
  trait EnrollmentFilter extends js.Object {
    var name: js.UndefOr[EnrollmentFilterName]
    var values: js.UndefOr[FilterValues]
  }

  object EnrollmentFilter {
    @inline
    def apply(
        name: js.UndefOr[EnrollmentFilterName] = js.undefined,
        values: js.UndefOr[FilterValues] = js.undefined
    ): EnrollmentFilter = {
      val __obj = js.Dynamic.literal()
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      values.foreach(__v => __obj.updateDynamic("values")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EnrollmentFilter]
    }
  }

  /** Describes the estimated monthly savings amount possible, based on On-Demand instance pricing, by adopting Compute Optimizer recommendations for a given resource. For more information, see [[https://docs.aws.amazon.com/compute-optimizer/latest/ug/view-ec2-recommendations.html#ec2-savings-calculation|Estimated monthly savings and savings opportunities]] in the <i>Compute Optimizer User Guide</i>.
    */
  @js.native
  trait EstimatedMonthlySavings extends js.Object {
    var currency: js.UndefOr[Currency]
    var value: js.UndefOr[Value]
  }

  object EstimatedMonthlySavings {
    @inline
    def apply(
        currency: js.UndefOr[Currency] = js.undefined,
        value: js.UndefOr[Value] = js.undefined
    ): EstimatedMonthlySavings = {
      val __obj = js.Dynamic.literal()
      currency.foreach(__v => __obj.updateDynamic("currency")(__v.asInstanceOf[js.Any]))
      value.foreach(__v => __obj.updateDynamic("value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EstimatedMonthlySavings]
    }
  }

  @js.native
  trait ExportAutoScalingGroupRecommendationsRequest extends js.Object {
    var s3DestinationConfig: S3DestinationConfig
    var accountIds: js.UndefOr[AccountIds]
    var fieldsToExport: js.UndefOr[ExportableAutoScalingGroupFields]
    var fileFormat: js.UndefOr[FileFormat]
    var filters: js.UndefOr[Filters]
    var includeMemberAccounts: js.UndefOr[IncludeMemberAccounts]
    var recommendationPreferences: js.UndefOr[RecommendationPreferences]
  }

  object ExportAutoScalingGroupRecommendationsRequest {
    @inline
    def apply(
        s3DestinationConfig: S3DestinationConfig,
        accountIds: js.UndefOr[AccountIds] = js.undefined,
        fieldsToExport: js.UndefOr[ExportableAutoScalingGroupFields] = js.undefined,
        fileFormat: js.UndefOr[FileFormat] = js.undefined,
        filters: js.UndefOr[Filters] = js.undefined,
        includeMemberAccounts: js.UndefOr[IncludeMemberAccounts] = js.undefined,
        recommendationPreferences: js.UndefOr[RecommendationPreferences] = js.undefined
    ): ExportAutoScalingGroupRecommendationsRequest = {
      val __obj = js.Dynamic.literal(
        "s3DestinationConfig" -> s3DestinationConfig.asInstanceOf[js.Any]
      )

      accountIds.foreach(__v => __obj.updateDynamic("accountIds")(__v.asInstanceOf[js.Any]))
      fieldsToExport.foreach(__v => __obj.updateDynamic("fieldsToExport")(__v.asInstanceOf[js.Any]))
      fileFormat.foreach(__v => __obj.updateDynamic("fileFormat")(__v.asInstanceOf[js.Any]))
      filters.foreach(__v => __obj.updateDynamic("filters")(__v.asInstanceOf[js.Any]))
      includeMemberAccounts.foreach(__v => __obj.updateDynamic("includeMemberAccounts")(__v.asInstanceOf[js.Any]))
      recommendationPreferences.foreach(__v => __obj.updateDynamic("recommendationPreferences")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ExportAutoScalingGroupRecommendationsRequest]
    }
  }

  @js.native
  trait ExportAutoScalingGroupRecommendationsResponse extends js.Object {
    var jobId: js.UndefOr[JobId]
    var s3Destination: js.UndefOr[S3Destination]
  }

  object ExportAutoScalingGroupRecommendationsResponse {
    @inline
    def apply(
        jobId: js.UndefOr[JobId] = js.undefined,
        s3Destination: js.UndefOr[S3Destination] = js.undefined
    ): ExportAutoScalingGroupRecommendationsResponse = {
      val __obj = js.Dynamic.literal()
      jobId.foreach(__v => __obj.updateDynamic("jobId")(__v.asInstanceOf[js.Any]))
      s3Destination.foreach(__v => __obj.updateDynamic("s3Destination")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ExportAutoScalingGroupRecommendationsResponse]
    }
  }

  /** Describes the destination of the recommendations export and metadata files.
    */
  @js.native
  trait ExportDestination extends js.Object {
    var s3: js.UndefOr[S3Destination]
  }

  object ExportDestination {
    @inline
    def apply(
        s3: js.UndefOr[S3Destination] = js.undefined
    ): ExportDestination = {
      val __obj = js.Dynamic.literal()
      s3.foreach(__v => __obj.updateDynamic("s3")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ExportDestination]
    }
  }

  @js.native
  trait ExportEBSVolumeRecommendationsRequest extends js.Object {
    var s3DestinationConfig: S3DestinationConfig
    var accountIds: js.UndefOr[AccountIds]
    var fieldsToExport: js.UndefOr[ExportableVolumeFields]
    var fileFormat: js.UndefOr[FileFormat]
    var filters: js.UndefOr[EBSFilters]
    var includeMemberAccounts: js.UndefOr[IncludeMemberAccounts]
  }

  object ExportEBSVolumeRecommendationsRequest {
    @inline
    def apply(
        s3DestinationConfig: S3DestinationConfig,
        accountIds: js.UndefOr[AccountIds] = js.undefined,
        fieldsToExport: js.UndefOr[ExportableVolumeFields] = js.undefined,
        fileFormat: js.UndefOr[FileFormat] = js.undefined,
        filters: js.UndefOr[EBSFilters] = js.undefined,
        includeMemberAccounts: js.UndefOr[IncludeMemberAccounts] = js.undefined
    ): ExportEBSVolumeRecommendationsRequest = {
      val __obj = js.Dynamic.literal(
        "s3DestinationConfig" -> s3DestinationConfig.asInstanceOf[js.Any]
      )

      accountIds.foreach(__v => __obj.updateDynamic("accountIds")(__v.asInstanceOf[js.Any]))
      fieldsToExport.foreach(__v => __obj.updateDynamic("fieldsToExport")(__v.asInstanceOf[js.Any]))
      fileFormat.foreach(__v => __obj.updateDynamic("fileFormat")(__v.asInstanceOf[js.Any]))
      filters.foreach(__v => __obj.updateDynamic("filters")(__v.asInstanceOf[js.Any]))
      includeMemberAccounts.foreach(__v => __obj.updateDynamic("includeMemberAccounts")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ExportEBSVolumeRecommendationsRequest]
    }
  }

  @js.native
  trait ExportEBSVolumeRecommendationsResponse extends js.Object {
    var jobId: js.UndefOr[JobId]
    var s3Destination: js.UndefOr[S3Destination]
  }

  object ExportEBSVolumeRecommendationsResponse {
    @inline
    def apply(
        jobId: js.UndefOr[JobId] = js.undefined,
        s3Destination: js.UndefOr[S3Destination] = js.undefined
    ): ExportEBSVolumeRecommendationsResponse = {
      val __obj = js.Dynamic.literal()
      jobId.foreach(__v => __obj.updateDynamic("jobId")(__v.asInstanceOf[js.Any]))
      s3Destination.foreach(__v => __obj.updateDynamic("s3Destination")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ExportEBSVolumeRecommendationsResponse]
    }
  }

  @js.native
  trait ExportEC2InstanceRecommendationsRequest extends js.Object {
    var s3DestinationConfig: S3DestinationConfig
    var accountIds: js.UndefOr[AccountIds]
    var fieldsToExport: js.UndefOr[ExportableInstanceFields]
    var fileFormat: js.UndefOr[FileFormat]
    var filters: js.UndefOr[Filters]
    var includeMemberAccounts: js.UndefOr[IncludeMemberAccounts]
    var recommendationPreferences: js.UndefOr[RecommendationPreferences]
  }

  object ExportEC2InstanceRecommendationsRequest {
    @inline
    def apply(
        s3DestinationConfig: S3DestinationConfig,
        accountIds: js.UndefOr[AccountIds] = js.undefined,
        fieldsToExport: js.UndefOr[ExportableInstanceFields] = js.undefined,
        fileFormat: js.UndefOr[FileFormat] = js.undefined,
        filters: js.UndefOr[Filters] = js.undefined,
        includeMemberAccounts: js.UndefOr[IncludeMemberAccounts] = js.undefined,
        recommendationPreferences: js.UndefOr[RecommendationPreferences] = js.undefined
    ): ExportEC2InstanceRecommendationsRequest = {
      val __obj = js.Dynamic.literal(
        "s3DestinationConfig" -> s3DestinationConfig.asInstanceOf[js.Any]
      )

      accountIds.foreach(__v => __obj.updateDynamic("accountIds")(__v.asInstanceOf[js.Any]))
      fieldsToExport.foreach(__v => __obj.updateDynamic("fieldsToExport")(__v.asInstanceOf[js.Any]))
      fileFormat.foreach(__v => __obj.updateDynamic("fileFormat")(__v.asInstanceOf[js.Any]))
      filters.foreach(__v => __obj.updateDynamic("filters")(__v.asInstanceOf[js.Any]))
      includeMemberAccounts.foreach(__v => __obj.updateDynamic("includeMemberAccounts")(__v.asInstanceOf[js.Any]))
      recommendationPreferences.foreach(__v => __obj.updateDynamic("recommendationPreferences")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ExportEC2InstanceRecommendationsRequest]
    }
  }

  @js.native
  trait ExportEC2InstanceRecommendationsResponse extends js.Object {
    var jobId: js.UndefOr[JobId]
    var s3Destination: js.UndefOr[S3Destination]
  }

  object ExportEC2InstanceRecommendationsResponse {
    @inline
    def apply(
        jobId: js.UndefOr[JobId] = js.undefined,
        s3Destination: js.UndefOr[S3Destination] = js.undefined
    ): ExportEC2InstanceRecommendationsResponse = {
      val __obj = js.Dynamic.literal()
      jobId.foreach(__v => __obj.updateDynamic("jobId")(__v.asInstanceOf[js.Any]))
      s3Destination.foreach(__v => __obj.updateDynamic("s3Destination")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ExportEC2InstanceRecommendationsResponse]
    }
  }

  @js.native
  trait ExportLambdaFunctionRecommendationsRequest extends js.Object {
    var s3DestinationConfig: S3DestinationConfig
    var accountIds: js.UndefOr[AccountIds]
    var fieldsToExport: js.UndefOr[ExportableLambdaFunctionFields]
    var fileFormat: js.UndefOr[FileFormat]
    var filters: js.UndefOr[LambdaFunctionRecommendationFilters]
    var includeMemberAccounts: js.UndefOr[IncludeMemberAccounts]
  }

  object ExportLambdaFunctionRecommendationsRequest {
    @inline
    def apply(
        s3DestinationConfig: S3DestinationConfig,
        accountIds: js.UndefOr[AccountIds] = js.undefined,
        fieldsToExport: js.UndefOr[ExportableLambdaFunctionFields] = js.undefined,
        fileFormat: js.UndefOr[FileFormat] = js.undefined,
        filters: js.UndefOr[LambdaFunctionRecommendationFilters] = js.undefined,
        includeMemberAccounts: js.UndefOr[IncludeMemberAccounts] = js.undefined
    ): ExportLambdaFunctionRecommendationsRequest = {
      val __obj = js.Dynamic.literal(
        "s3DestinationConfig" -> s3DestinationConfig.asInstanceOf[js.Any]
      )

      accountIds.foreach(__v => __obj.updateDynamic("accountIds")(__v.asInstanceOf[js.Any]))
      fieldsToExport.foreach(__v => __obj.updateDynamic("fieldsToExport")(__v.asInstanceOf[js.Any]))
      fileFormat.foreach(__v => __obj.updateDynamic("fileFormat")(__v.asInstanceOf[js.Any]))
      filters.foreach(__v => __obj.updateDynamic("filters")(__v.asInstanceOf[js.Any]))
      includeMemberAccounts.foreach(__v => __obj.updateDynamic("includeMemberAccounts")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ExportLambdaFunctionRecommendationsRequest]
    }
  }

  @js.native
  trait ExportLambdaFunctionRecommendationsResponse extends js.Object {
    var jobId: js.UndefOr[JobId]
    var s3Destination: js.UndefOr[S3Destination]
  }

  object ExportLambdaFunctionRecommendationsResponse {
    @inline
    def apply(
        jobId: js.UndefOr[JobId] = js.undefined,
        s3Destination: js.UndefOr[S3Destination] = js.undefined
    ): ExportLambdaFunctionRecommendationsResponse = {
      val __obj = js.Dynamic.literal()
      jobId.foreach(__v => __obj.updateDynamic("jobId")(__v.asInstanceOf[js.Any]))
      s3Destination.foreach(__v => __obj.updateDynamic("s3Destination")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ExportLambdaFunctionRecommendationsResponse]
    }
  }

  /** Describes the external metrics preferences for EC2 rightsizing recommendations.
    */
  @js.native
  trait ExternalMetricsPreference extends js.Object {
    var source: js.UndefOr[ExternalMetricsSource]
  }

  object ExternalMetricsPreference {
    @inline
    def apply(
        source: js.UndefOr[ExternalMetricsSource] = js.undefined
    ): ExternalMetricsPreference = {
      val __obj = js.Dynamic.literal()
      source.foreach(__v => __obj.updateDynamic("source")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ExternalMetricsPreference]
    }
  }

  /** Describes a filter that returns a more specific list of recommendations. Use this filter with the <a>GetAutoScalingGroupRecommendations</a> and <a>GetEC2InstanceRecommendations</a> actions. You can use <code>EBSFilter</code> with the <a>GetEBSVolumeRecommendations</a> action, <code>LambdaFunctionRecommendationFilter</code> with the <a>GetLambdaFunctionRecommendations</a> action, and <code>JobFilter</code> with the <a>DescribeRecommendationExportJobs</a> action.
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
  trait GetAutoScalingGroupRecommendationsRequest extends js.Object {
    var accountIds: js.UndefOr[AccountIds]
    var autoScalingGroupArns: js.UndefOr[AutoScalingGroupArns]
    var filters: js.UndefOr[Filters]
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
    var recommendationPreferences: js.UndefOr[RecommendationPreferences]
  }

  object GetAutoScalingGroupRecommendationsRequest {
    @inline
    def apply(
        accountIds: js.UndefOr[AccountIds] = js.undefined,
        autoScalingGroupArns: js.UndefOr[AutoScalingGroupArns] = js.undefined,
        filters: js.UndefOr[Filters] = js.undefined,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined,
        recommendationPreferences: js.UndefOr[RecommendationPreferences] = js.undefined
    ): GetAutoScalingGroupRecommendationsRequest = {
      val __obj = js.Dynamic.literal()
      accountIds.foreach(__v => __obj.updateDynamic("accountIds")(__v.asInstanceOf[js.Any]))
      autoScalingGroupArns.foreach(__v => __obj.updateDynamic("autoScalingGroupArns")(__v.asInstanceOf[js.Any]))
      filters.foreach(__v => __obj.updateDynamic("filters")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      recommendationPreferences.foreach(__v => __obj.updateDynamic("recommendationPreferences")(__v.asInstanceOf[js.Any]))
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
      autoScalingGroupRecommendations.foreach(__v => __obj.updateDynamic("autoScalingGroupRecommendations")(__v.asInstanceOf[js.Any]))
      errors.foreach(__v => __obj.updateDynamic("errors")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetAutoScalingGroupRecommendationsResponse]
    }
  }

  @js.native
  trait GetEBSVolumeRecommendationsRequest extends js.Object {
    var accountIds: js.UndefOr[AccountIds]
    var filters: js.UndefOr[EBSFilters]
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
    var volumeArns: js.UndefOr[VolumeArns]
  }

  object GetEBSVolumeRecommendationsRequest {
    @inline
    def apply(
        accountIds: js.UndefOr[AccountIds] = js.undefined,
        filters: js.UndefOr[EBSFilters] = js.undefined,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined,
        volumeArns: js.UndefOr[VolumeArns] = js.undefined
    ): GetEBSVolumeRecommendationsRequest = {
      val __obj = js.Dynamic.literal()
      accountIds.foreach(__v => __obj.updateDynamic("accountIds")(__v.asInstanceOf[js.Any]))
      filters.foreach(__v => __obj.updateDynamic("filters")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      volumeArns.foreach(__v => __obj.updateDynamic("volumeArns")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetEBSVolumeRecommendationsRequest]
    }
  }

  @js.native
  trait GetEBSVolumeRecommendationsResponse extends js.Object {
    var errors: js.UndefOr[GetRecommendationErrors]
    var nextToken: js.UndefOr[NextToken]
    var volumeRecommendations: js.UndefOr[VolumeRecommendations]
  }

  object GetEBSVolumeRecommendationsResponse {
    @inline
    def apply(
        errors: js.UndefOr[GetRecommendationErrors] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined,
        volumeRecommendations: js.UndefOr[VolumeRecommendations] = js.undefined
    ): GetEBSVolumeRecommendationsResponse = {
      val __obj = js.Dynamic.literal()
      errors.foreach(__v => __obj.updateDynamic("errors")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      volumeRecommendations.foreach(__v => __obj.updateDynamic("volumeRecommendations")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetEBSVolumeRecommendationsResponse]
    }
  }

  @js.native
  trait GetEC2InstanceRecommendationsRequest extends js.Object {
    var accountIds: js.UndefOr[AccountIds]
    var filters: js.UndefOr[Filters]
    var instanceArns: js.UndefOr[InstanceArns]
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
    var recommendationPreferences: js.UndefOr[RecommendationPreferences]
  }

  object GetEC2InstanceRecommendationsRequest {
    @inline
    def apply(
        accountIds: js.UndefOr[AccountIds] = js.undefined,
        filters: js.UndefOr[Filters] = js.undefined,
        instanceArns: js.UndefOr[InstanceArns] = js.undefined,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined,
        recommendationPreferences: js.UndefOr[RecommendationPreferences] = js.undefined
    ): GetEC2InstanceRecommendationsRequest = {
      val __obj = js.Dynamic.literal()
      accountIds.foreach(__v => __obj.updateDynamic("accountIds")(__v.asInstanceOf[js.Any]))
      filters.foreach(__v => __obj.updateDynamic("filters")(__v.asInstanceOf[js.Any]))
      instanceArns.foreach(__v => __obj.updateDynamic("instanceArns")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      recommendationPreferences.foreach(__v => __obj.updateDynamic("recommendationPreferences")(__v.asInstanceOf[js.Any]))
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
    var recommendationPreferences: js.UndefOr[RecommendationPreferences]
  }

  object GetEC2RecommendationProjectedMetricsRequest {
    @inline
    def apply(
        endTime: Timestamp,
        instanceArn: InstanceArn,
        period: Period,
        startTime: Timestamp,
        stat: MetricStatistic,
        recommendationPreferences: js.UndefOr[RecommendationPreferences] = js.undefined
    ): GetEC2RecommendationProjectedMetricsRequest = {
      val __obj = js.Dynamic.literal(
        "endTime" -> endTime.asInstanceOf[js.Any],
        "instanceArn" -> instanceArn.asInstanceOf[js.Any],
        "period" -> period.asInstanceOf[js.Any],
        "startTime" -> startTime.asInstanceOf[js.Any],
        "stat" -> stat.asInstanceOf[js.Any]
      )

      recommendationPreferences.foreach(__v => __obj.updateDynamic("recommendationPreferences")(__v.asInstanceOf[js.Any]))
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
      recommendedOptionProjectedMetrics.foreach(__v => __obj.updateDynamic("recommendedOptionProjectedMetrics")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetEC2RecommendationProjectedMetricsResponse]
    }
  }

  @js.native
  trait GetEffectiveRecommendationPreferencesRequest extends js.Object {
    var resourceArn: ResourceArn
  }

  object GetEffectiveRecommendationPreferencesRequest {
    @inline
    def apply(
        resourceArn: ResourceArn
    ): GetEffectiveRecommendationPreferencesRequest = {
      val __obj = js.Dynamic.literal(
        "resourceArn" -> resourceArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetEffectiveRecommendationPreferencesRequest]
    }
  }

  @js.native
  trait GetEffectiveRecommendationPreferencesResponse extends js.Object {
    var enhancedInfrastructureMetrics: js.UndefOr[EnhancedInfrastructureMetrics]
    var externalMetricsPreference: js.UndefOr[ExternalMetricsPreference]
  }

  object GetEffectiveRecommendationPreferencesResponse {
    @inline
    def apply(
        enhancedInfrastructureMetrics: js.UndefOr[EnhancedInfrastructureMetrics] = js.undefined,
        externalMetricsPreference: js.UndefOr[ExternalMetricsPreference] = js.undefined
    ): GetEffectiveRecommendationPreferencesResponse = {
      val __obj = js.Dynamic.literal()
      enhancedInfrastructureMetrics.foreach(__v => __obj.updateDynamic("enhancedInfrastructureMetrics")(__v.asInstanceOf[js.Any]))
      externalMetricsPreference.foreach(__v => __obj.updateDynamic("externalMetricsPreference")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetEffectiveRecommendationPreferencesResponse]
    }
  }

  @js.native
  trait GetEnrollmentStatusRequest extends js.Object

  object GetEnrollmentStatusRequest {
    @inline
    def apply(): GetEnrollmentStatusRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetEnrollmentStatusRequest]
    }
  }

  @js.native
  trait GetEnrollmentStatusResponse extends js.Object {
    var lastUpdatedTimestamp: js.UndefOr[LastUpdatedTimestamp]
    var memberAccountsEnrolled: js.UndefOr[MemberAccountsEnrolled]
    var numberOfMemberAccountsOptedIn: js.UndefOr[NumberOfMemberAccountsOptedIn]
    var status: js.UndefOr[Status]
    var statusReason: js.UndefOr[StatusReason]
  }

  object GetEnrollmentStatusResponse {
    @inline
    def apply(
        lastUpdatedTimestamp: js.UndefOr[LastUpdatedTimestamp] = js.undefined,
        memberAccountsEnrolled: js.UndefOr[MemberAccountsEnrolled] = js.undefined,
        numberOfMemberAccountsOptedIn: js.UndefOr[NumberOfMemberAccountsOptedIn] = js.undefined,
        status: js.UndefOr[Status] = js.undefined,
        statusReason: js.UndefOr[StatusReason] = js.undefined
    ): GetEnrollmentStatusResponse = {
      val __obj = js.Dynamic.literal()
      lastUpdatedTimestamp.foreach(__v => __obj.updateDynamic("lastUpdatedTimestamp")(__v.asInstanceOf[js.Any]))
      memberAccountsEnrolled.foreach(__v => __obj.updateDynamic("memberAccountsEnrolled")(__v.asInstanceOf[js.Any]))
      numberOfMemberAccountsOptedIn.foreach(__v => __obj.updateDynamic("numberOfMemberAccountsOptedIn")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      statusReason.foreach(__v => __obj.updateDynamic("statusReason")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetEnrollmentStatusResponse]
    }
  }

  @js.native
  trait GetEnrollmentStatusesForOrganizationRequest extends js.Object {
    var filters: js.UndefOr[EnrollmentFilters]
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object GetEnrollmentStatusesForOrganizationRequest {
    @inline
    def apply(
        filters: js.UndefOr[EnrollmentFilters] = js.undefined,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): GetEnrollmentStatusesForOrganizationRequest = {
      val __obj = js.Dynamic.literal()
      filters.foreach(__v => __obj.updateDynamic("filters")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetEnrollmentStatusesForOrganizationRequest]
    }
  }

  @js.native
  trait GetEnrollmentStatusesForOrganizationResponse extends js.Object {
    var accountEnrollmentStatuses: js.UndefOr[AccountEnrollmentStatuses]
    var nextToken: js.UndefOr[NextToken]
  }

  object GetEnrollmentStatusesForOrganizationResponse {
    @inline
    def apply(
        accountEnrollmentStatuses: js.UndefOr[AccountEnrollmentStatuses] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): GetEnrollmentStatusesForOrganizationResponse = {
      val __obj = js.Dynamic.literal()
      accountEnrollmentStatuses.foreach(__v => __obj.updateDynamic("accountEnrollmentStatuses")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetEnrollmentStatusesForOrganizationResponse]
    }
  }

  @js.native
  trait GetLambdaFunctionRecommendationsRequest extends js.Object {
    var accountIds: js.UndefOr[AccountIds]
    var filters: js.UndefOr[LambdaFunctionRecommendationFilters]
    var functionArns: js.UndefOr[FunctionArns]
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object GetLambdaFunctionRecommendationsRequest {
    @inline
    def apply(
        accountIds: js.UndefOr[AccountIds] = js.undefined,
        filters: js.UndefOr[LambdaFunctionRecommendationFilters] = js.undefined,
        functionArns: js.UndefOr[FunctionArns] = js.undefined,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): GetLambdaFunctionRecommendationsRequest = {
      val __obj = js.Dynamic.literal()
      accountIds.foreach(__v => __obj.updateDynamic("accountIds")(__v.asInstanceOf[js.Any]))
      filters.foreach(__v => __obj.updateDynamic("filters")(__v.asInstanceOf[js.Any]))
      functionArns.foreach(__v => __obj.updateDynamic("functionArns")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetLambdaFunctionRecommendationsRequest]
    }
  }

  @js.native
  trait GetLambdaFunctionRecommendationsResponse extends js.Object {
    var lambdaFunctionRecommendations: js.UndefOr[LambdaFunctionRecommendations]
    var nextToken: js.UndefOr[NextToken]
  }

  object GetLambdaFunctionRecommendationsResponse {
    @inline
    def apply(
        lambdaFunctionRecommendations: js.UndefOr[LambdaFunctionRecommendations] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): GetLambdaFunctionRecommendationsResponse = {
      val __obj = js.Dynamic.literal()
      lambdaFunctionRecommendations.foreach(__v => __obj.updateDynamic("lambdaFunctionRecommendations")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetLambdaFunctionRecommendationsResponse]
    }
  }

  /** Describes an error experienced when getting recommendations. For example, an error is returned if you request recommendations for an unsupported Auto Scaling group, or if you request recommendations for an instance of an unsupported instance family.
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
  trait GetRecommendationPreferencesRequest extends js.Object {
    var resourceType: ResourceType
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
    var scope: js.UndefOr[Scope]
  }

  object GetRecommendationPreferencesRequest {
    @inline
    def apply(
        resourceType: ResourceType,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined,
        scope: js.UndefOr[Scope] = js.undefined
    ): GetRecommendationPreferencesRequest = {
      val __obj = js.Dynamic.literal(
        "resourceType" -> resourceType.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      scope.foreach(__v => __obj.updateDynamic("scope")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetRecommendationPreferencesRequest]
    }
  }

  @js.native
  trait GetRecommendationPreferencesResponse extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var recommendationPreferencesDetails: js.UndefOr[RecommendationPreferencesDetails]
  }

  object GetRecommendationPreferencesResponse {
    @inline
    def apply(
        nextToken: js.UndefOr[NextToken] = js.undefined,
        recommendationPreferencesDetails: js.UndefOr[RecommendationPreferencesDetails] = js.undefined
    ): GetRecommendationPreferencesResponse = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      recommendationPreferencesDetails.foreach(__v => __obj.updateDynamic("recommendationPreferencesDetails")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetRecommendationPreferencesResponse]
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

  /** Describes an Amazon EC2 instance recommendation.
    */
  @js.native
  trait InstanceRecommendation extends js.Object {
    var accountId: js.UndefOr[AccountId]
    var currentInstanceType: js.UndefOr[CurrentInstanceType]
    var currentPerformanceRisk: js.UndefOr[CurrentPerformanceRisk]
    var effectiveRecommendationPreferences: js.UndefOr[EffectiveRecommendationPreferences]
    var finding: js.UndefOr[Finding]
    var findingReasonCodes: js.UndefOr[InstanceRecommendationFindingReasonCodes]
    var inferredWorkloadTypes: js.UndefOr[InferredWorkloadTypes]
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
        currentPerformanceRisk: js.UndefOr[CurrentPerformanceRisk] = js.undefined,
        effectiveRecommendationPreferences: js.UndefOr[EffectiveRecommendationPreferences] = js.undefined,
        finding: js.UndefOr[Finding] = js.undefined,
        findingReasonCodes: js.UndefOr[InstanceRecommendationFindingReasonCodes] = js.undefined,
        inferredWorkloadTypes: js.UndefOr[InferredWorkloadTypes] = js.undefined,
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
      currentPerformanceRisk.foreach(__v => __obj.updateDynamic("currentPerformanceRisk")(__v.asInstanceOf[js.Any]))
      effectiveRecommendationPreferences.foreach(__v => __obj.updateDynamic("effectiveRecommendationPreferences")(__v.asInstanceOf[js.Any]))
      finding.foreach(__v => __obj.updateDynamic("finding")(__v.asInstanceOf[js.Any]))
      findingReasonCodes.foreach(__v => __obj.updateDynamic("findingReasonCodes")(__v.asInstanceOf[js.Any]))
      inferredWorkloadTypes.foreach(__v => __obj.updateDynamic("inferredWorkloadTypes")(__v.asInstanceOf[js.Any]))
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

  /** Describes a recommendation option for an Amazon EC2 instance.
    */
  @js.native
  trait InstanceRecommendationOption extends js.Object {
    var instanceType: js.UndefOr[InstanceType]
    var migrationEffort: js.UndefOr[MigrationEffort]
    var performanceRisk: js.UndefOr[PerformanceRisk]
    var platformDifferences: js.UndefOr[PlatformDifferences]
    var projectedUtilizationMetrics: js.UndefOr[ProjectedUtilizationMetrics]
    var rank: js.UndefOr[Rank]
    var savingsOpportunity: js.UndefOr[SavingsOpportunity]
  }

  object InstanceRecommendationOption {
    @inline
    def apply(
        instanceType: js.UndefOr[InstanceType] = js.undefined,
        migrationEffort: js.UndefOr[MigrationEffort] = js.undefined,
        performanceRisk: js.UndefOr[PerformanceRisk] = js.undefined,
        platformDifferences: js.UndefOr[PlatformDifferences] = js.undefined,
        projectedUtilizationMetrics: js.UndefOr[ProjectedUtilizationMetrics] = js.undefined,
        rank: js.UndefOr[Rank] = js.undefined,
        savingsOpportunity: js.UndefOr[SavingsOpportunity] = js.undefined
    ): InstanceRecommendationOption = {
      val __obj = js.Dynamic.literal()
      instanceType.foreach(__v => __obj.updateDynamic("instanceType")(__v.asInstanceOf[js.Any]))
      migrationEffort.foreach(__v => __obj.updateDynamic("migrationEffort")(__v.asInstanceOf[js.Any]))
      performanceRisk.foreach(__v => __obj.updateDynamic("performanceRisk")(__v.asInstanceOf[js.Any]))
      platformDifferences.foreach(__v => __obj.updateDynamic("platformDifferences")(__v.asInstanceOf[js.Any]))
      projectedUtilizationMetrics.foreach(__v => __obj.updateDynamic("projectedUtilizationMetrics")(__v.asInstanceOf[js.Any]))
      rank.foreach(__v => __obj.updateDynamic("rank")(__v.asInstanceOf[js.Any]))
      savingsOpportunity.foreach(__v => __obj.updateDynamic("savingsOpportunity")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InstanceRecommendationOption]
    }
  }

  /** Describes a filter that returns a more specific list of recommendation export jobs. Use this filter with the <a>DescribeRecommendationExportJobs</a> action. You can use <code>EBSFilter</code> with the <a>GetEBSVolumeRecommendations</a> action, <code>LambdaFunctionRecommendationFilter</code> with the <a>GetLambdaFunctionRecommendations</a> action, and <code>Filter</code> with the <a>GetAutoScalingGroupRecommendations</a> and <a>GetEC2InstanceRecommendations</a> actions.
    */
  @js.native
  trait JobFilter extends js.Object {
    var name: js.UndefOr[JobFilterName]
    var values: js.UndefOr[FilterValues]
  }

  object JobFilter {
    @inline
    def apply(
        name: js.UndefOr[JobFilterName] = js.undefined,
        values: js.UndefOr[FilterValues] = js.undefined
    ): JobFilter = {
      val __obj = js.Dynamic.literal()
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      values.foreach(__v => __obj.updateDynamic("values")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[JobFilter]
    }
  }

  /** Describes a projected utilization metric of an Lambda function recommendation option.
    */
  @js.native
  trait LambdaFunctionMemoryProjectedMetric extends js.Object {
    var name: js.UndefOr[LambdaFunctionMemoryMetricName]
    var statistic: js.UndefOr[LambdaFunctionMemoryMetricStatistic]
    var value: js.UndefOr[MetricValue]
  }

  object LambdaFunctionMemoryProjectedMetric {
    @inline
    def apply(
        name: js.UndefOr[LambdaFunctionMemoryMetricName] = js.undefined,
        statistic: js.UndefOr[LambdaFunctionMemoryMetricStatistic] = js.undefined,
        value: js.UndefOr[MetricValue] = js.undefined
    ): LambdaFunctionMemoryProjectedMetric = {
      val __obj = js.Dynamic.literal()
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      statistic.foreach(__v => __obj.updateDynamic("statistic")(__v.asInstanceOf[js.Any]))
      value.foreach(__v => __obj.updateDynamic("value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LambdaFunctionMemoryProjectedMetric]
    }
  }

  /** Describes a recommendation option for an Lambda function.
    */
  @js.native
  trait LambdaFunctionMemoryRecommendationOption extends js.Object {
    var memorySize: js.UndefOr[MemorySize]
    var projectedUtilizationMetrics: js.UndefOr[LambdaFunctionMemoryProjectedMetrics]
    var rank: js.UndefOr[Rank]
    var savingsOpportunity: js.UndefOr[SavingsOpportunity]
  }

  object LambdaFunctionMemoryRecommendationOption {
    @inline
    def apply(
        memorySize: js.UndefOr[MemorySize] = js.undefined,
        projectedUtilizationMetrics: js.UndefOr[LambdaFunctionMemoryProjectedMetrics] = js.undefined,
        rank: js.UndefOr[Rank] = js.undefined,
        savingsOpportunity: js.UndefOr[SavingsOpportunity] = js.undefined
    ): LambdaFunctionMemoryRecommendationOption = {
      val __obj = js.Dynamic.literal()
      memorySize.foreach(__v => __obj.updateDynamic("memorySize")(__v.asInstanceOf[js.Any]))
      projectedUtilizationMetrics.foreach(__v => __obj.updateDynamic("projectedUtilizationMetrics")(__v.asInstanceOf[js.Any]))
      rank.foreach(__v => __obj.updateDynamic("rank")(__v.asInstanceOf[js.Any]))
      savingsOpportunity.foreach(__v => __obj.updateDynamic("savingsOpportunity")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LambdaFunctionMemoryRecommendationOption]
    }
  }

  /** Describes an Lambda function recommendation.
    */
  @js.native
  trait LambdaFunctionRecommendation extends js.Object {
    var accountId: js.UndefOr[AccountId]
    var currentMemorySize: js.UndefOr[MemorySize]
    var currentPerformanceRisk: js.UndefOr[CurrentPerformanceRisk]
    var finding: js.UndefOr[LambdaFunctionRecommendationFinding]
    var findingReasonCodes: js.UndefOr[LambdaFunctionRecommendationFindingReasonCodes]
    var functionArn: js.UndefOr[FunctionArn]
    var functionVersion: js.UndefOr[FunctionVersion]
    var lastRefreshTimestamp: js.UndefOr[LastRefreshTimestamp]
    var lookbackPeriodInDays: js.UndefOr[LookBackPeriodInDays]
    var memorySizeRecommendationOptions: js.UndefOr[LambdaFunctionMemoryRecommendationOptions]
    var numberOfInvocations: js.UndefOr[NumberOfInvocations]
    var utilizationMetrics: js.UndefOr[LambdaFunctionUtilizationMetrics]
  }

  object LambdaFunctionRecommendation {
    @inline
    def apply(
        accountId: js.UndefOr[AccountId] = js.undefined,
        currentMemorySize: js.UndefOr[MemorySize] = js.undefined,
        currentPerformanceRisk: js.UndefOr[CurrentPerformanceRisk] = js.undefined,
        finding: js.UndefOr[LambdaFunctionRecommendationFinding] = js.undefined,
        findingReasonCodes: js.UndefOr[LambdaFunctionRecommendationFindingReasonCodes] = js.undefined,
        functionArn: js.UndefOr[FunctionArn] = js.undefined,
        functionVersion: js.UndefOr[FunctionVersion] = js.undefined,
        lastRefreshTimestamp: js.UndefOr[LastRefreshTimestamp] = js.undefined,
        lookbackPeriodInDays: js.UndefOr[LookBackPeriodInDays] = js.undefined,
        memorySizeRecommendationOptions: js.UndefOr[LambdaFunctionMemoryRecommendationOptions] = js.undefined,
        numberOfInvocations: js.UndefOr[NumberOfInvocations] = js.undefined,
        utilizationMetrics: js.UndefOr[LambdaFunctionUtilizationMetrics] = js.undefined
    ): LambdaFunctionRecommendation = {
      val __obj = js.Dynamic.literal()
      accountId.foreach(__v => __obj.updateDynamic("accountId")(__v.asInstanceOf[js.Any]))
      currentMemorySize.foreach(__v => __obj.updateDynamic("currentMemorySize")(__v.asInstanceOf[js.Any]))
      currentPerformanceRisk.foreach(__v => __obj.updateDynamic("currentPerformanceRisk")(__v.asInstanceOf[js.Any]))
      finding.foreach(__v => __obj.updateDynamic("finding")(__v.asInstanceOf[js.Any]))
      findingReasonCodes.foreach(__v => __obj.updateDynamic("findingReasonCodes")(__v.asInstanceOf[js.Any]))
      functionArn.foreach(__v => __obj.updateDynamic("functionArn")(__v.asInstanceOf[js.Any]))
      functionVersion.foreach(__v => __obj.updateDynamic("functionVersion")(__v.asInstanceOf[js.Any]))
      lastRefreshTimestamp.foreach(__v => __obj.updateDynamic("lastRefreshTimestamp")(__v.asInstanceOf[js.Any]))
      lookbackPeriodInDays.foreach(__v => __obj.updateDynamic("lookbackPeriodInDays")(__v.asInstanceOf[js.Any]))
      memorySizeRecommendationOptions.foreach(__v => __obj.updateDynamic("memorySizeRecommendationOptions")(__v.asInstanceOf[js.Any]))
      numberOfInvocations.foreach(__v => __obj.updateDynamic("numberOfInvocations")(__v.asInstanceOf[js.Any]))
      utilizationMetrics.foreach(__v => __obj.updateDynamic("utilizationMetrics")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LambdaFunctionRecommendation]
    }
  }

  /** Describes a filter that returns a more specific list of Lambda function recommendations. Use this filter with the <a>GetLambdaFunctionRecommendations</a> action. You can use <code>EBSFilter</code> with the <a>GetEBSVolumeRecommendations</a> action, <code>JobFilter</code> with the <a>DescribeRecommendationExportJobs</a> action, and <code>Filter</code> with the <a>GetAutoScalingGroupRecommendations</a> and <a>GetEC2InstanceRecommendations</a> actions.
    */
  @js.native
  trait LambdaFunctionRecommendationFilter extends js.Object {
    var name: js.UndefOr[LambdaFunctionRecommendationFilterName]
    var values: js.UndefOr[FilterValues]
  }

  object LambdaFunctionRecommendationFilter {
    @inline
    def apply(
        name: js.UndefOr[LambdaFunctionRecommendationFilterName] = js.undefined,
        values: js.UndefOr[FilterValues] = js.undefined
    ): LambdaFunctionRecommendationFilter = {
      val __obj = js.Dynamic.literal()
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      values.foreach(__v => __obj.updateDynamic("values")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LambdaFunctionRecommendationFilter]
    }
  }

  /** Describes a utilization metric of an Lambda function.
    */
  @js.native
  trait LambdaFunctionUtilizationMetric extends js.Object {
    var name: js.UndefOr[LambdaFunctionMetricName]
    var statistic: js.UndefOr[LambdaFunctionMetricStatistic]
    var value: js.UndefOr[MetricValue]
  }

  object LambdaFunctionUtilizationMetric {
    @inline
    def apply(
        name: js.UndefOr[LambdaFunctionMetricName] = js.undefined,
        statistic: js.UndefOr[LambdaFunctionMetricStatistic] = js.undefined,
        value: js.UndefOr[MetricValue] = js.undefined
    ): LambdaFunctionUtilizationMetric = {
      val __obj = js.Dynamic.literal()
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      statistic.foreach(__v => __obj.updateDynamic("statistic")(__v.asInstanceOf[js.Any]))
      value.foreach(__v => __obj.updateDynamic("value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LambdaFunctionUtilizationMetric]
    }
  }

  /** Describes a projected utilization metric of a recommendation option, such as an Amazon EC2 instance. This represents the projected utilization of a recommendation option had you used that resource during the analyzed period. Compare the utilization metric data of your resource against its projected utilization metric data to determine the performance difference between your current resource and the recommended option.
    *
    * '''Note:'''The <code>Cpu</code> and <code>Memory</code> metrics are the only projected utilization metrics returned when you run the <a>GetEC2RecommendationProjectedMetrics</a> action. Additionally, the <code>Memory</code> metric is returned only for resources that have the unified CloudWatch agent installed on them. For more information, see [[https://docs.aws.amazon.com/compute-optimizer/latest/ug/metrics.html#cw-agent|Enabling Memory Utilization with the CloudWatch Agent]].
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

  @js.native
  trait PutRecommendationPreferencesRequest extends js.Object {
    var resourceType: ResourceType
    var enhancedInfrastructureMetrics: js.UndefOr[EnhancedInfrastructureMetrics]
    var externalMetricsPreference: js.UndefOr[ExternalMetricsPreference]
    var inferredWorkloadTypes: js.UndefOr[InferredWorkloadTypesPreference]
    var scope: js.UndefOr[Scope]
  }

  object PutRecommendationPreferencesRequest {
    @inline
    def apply(
        resourceType: ResourceType,
        enhancedInfrastructureMetrics: js.UndefOr[EnhancedInfrastructureMetrics] = js.undefined,
        externalMetricsPreference: js.UndefOr[ExternalMetricsPreference] = js.undefined,
        inferredWorkloadTypes: js.UndefOr[InferredWorkloadTypesPreference] = js.undefined,
        scope: js.UndefOr[Scope] = js.undefined
    ): PutRecommendationPreferencesRequest = {
      val __obj = js.Dynamic.literal(
        "resourceType" -> resourceType.asInstanceOf[js.Any]
      )

      enhancedInfrastructureMetrics.foreach(__v => __obj.updateDynamic("enhancedInfrastructureMetrics")(__v.asInstanceOf[js.Any]))
      externalMetricsPreference.foreach(__v => __obj.updateDynamic("externalMetricsPreference")(__v.asInstanceOf[js.Any]))
      inferredWorkloadTypes.foreach(__v => __obj.updateDynamic("inferredWorkloadTypes")(__v.asInstanceOf[js.Any]))
      scope.foreach(__v => __obj.updateDynamic("scope")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutRecommendationPreferencesRequest]
    }
  }

  @js.native
  trait PutRecommendationPreferencesResponse extends js.Object

  object PutRecommendationPreferencesResponse {
    @inline
    def apply(): PutRecommendationPreferencesResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PutRecommendationPreferencesResponse]
    }
  }

  /** A summary of a finding reason code.
    */
  @js.native
  trait ReasonCodeSummary extends js.Object {
    var name: js.UndefOr[FindingReasonCode]
    var value: js.UndefOr[SummaryValue]
  }

  object ReasonCodeSummary {
    @inline
    def apply(
        name: js.UndefOr[FindingReasonCode] = js.undefined,
        value: js.UndefOr[SummaryValue] = js.undefined
    ): ReasonCodeSummary = {
      val __obj = js.Dynamic.literal()
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      value.foreach(__v => __obj.updateDynamic("value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ReasonCodeSummary]
    }
  }

  /** Describes a recommendation export job. Use the <a>DescribeRecommendationExportJobs</a> action to view your recommendation export jobs. Use the <a>ExportAutoScalingGroupRecommendations</a> or <a>ExportEC2InstanceRecommendations</a> actions to request an export of your recommendations.
    */
  @js.native
  trait RecommendationExportJob extends js.Object {
    var creationTimestamp: js.UndefOr[CreationTimestamp]
    var destination: js.UndefOr[ExportDestination]
    var failureReason: js.UndefOr[FailureReason]
    var jobId: js.UndefOr[JobId]
    var lastUpdatedTimestamp: js.UndefOr[LastUpdatedTimestamp]
    var resourceType: js.UndefOr[ResourceType]
    var status: js.UndefOr[JobStatus]
  }

  object RecommendationExportJob {
    @inline
    def apply(
        creationTimestamp: js.UndefOr[CreationTimestamp] = js.undefined,
        destination: js.UndefOr[ExportDestination] = js.undefined,
        failureReason: js.UndefOr[FailureReason] = js.undefined,
        jobId: js.UndefOr[JobId] = js.undefined,
        lastUpdatedTimestamp: js.UndefOr[LastUpdatedTimestamp] = js.undefined,
        resourceType: js.UndefOr[ResourceType] = js.undefined,
        status: js.UndefOr[JobStatus] = js.undefined
    ): RecommendationExportJob = {
      val __obj = js.Dynamic.literal()
      creationTimestamp.foreach(__v => __obj.updateDynamic("creationTimestamp")(__v.asInstanceOf[js.Any]))
      destination.foreach(__v => __obj.updateDynamic("destination")(__v.asInstanceOf[js.Any]))
      failureReason.foreach(__v => __obj.updateDynamic("failureReason")(__v.asInstanceOf[js.Any]))
      jobId.foreach(__v => __obj.updateDynamic("jobId")(__v.asInstanceOf[js.Any]))
      lastUpdatedTimestamp.foreach(__v => __obj.updateDynamic("lastUpdatedTimestamp")(__v.asInstanceOf[js.Any]))
      resourceType.foreach(__v => __obj.updateDynamic("resourceType")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RecommendationExportJob]
    }
  }

  /** Describes the recommendation preferences to return in the response of a <a>GetAutoScalingGroupRecommendations</a>, <a>GetEC2InstanceRecommendations</a>, and <a>GetEC2RecommendationProjectedMetrics</a> request.
    */
  @js.native
  trait RecommendationPreferences extends js.Object {
    var cpuVendorArchitectures: js.UndefOr[CpuVendorArchitectures]
  }

  object RecommendationPreferences {
    @inline
    def apply(
        cpuVendorArchitectures: js.UndefOr[CpuVendorArchitectures] = js.undefined
    ): RecommendationPreferences = {
      val __obj = js.Dynamic.literal()
      cpuVendorArchitectures.foreach(__v => __obj.updateDynamic("cpuVendorArchitectures")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RecommendationPreferences]
    }
  }

  /** Describes a recommendation preference.
    */
  @js.native
  trait RecommendationPreferencesDetail extends js.Object {
    var enhancedInfrastructureMetrics: js.UndefOr[EnhancedInfrastructureMetrics]
    var externalMetricsPreference: js.UndefOr[ExternalMetricsPreference]
    var inferredWorkloadTypes: js.UndefOr[InferredWorkloadTypesPreference]
    var resourceType: js.UndefOr[ResourceType]
    var scope: js.UndefOr[Scope]
  }

  object RecommendationPreferencesDetail {
    @inline
    def apply(
        enhancedInfrastructureMetrics: js.UndefOr[EnhancedInfrastructureMetrics] = js.undefined,
        externalMetricsPreference: js.UndefOr[ExternalMetricsPreference] = js.undefined,
        inferredWorkloadTypes: js.UndefOr[InferredWorkloadTypesPreference] = js.undefined,
        resourceType: js.UndefOr[ResourceType] = js.undefined,
        scope: js.UndefOr[Scope] = js.undefined
    ): RecommendationPreferencesDetail = {
      val __obj = js.Dynamic.literal()
      enhancedInfrastructureMetrics.foreach(__v => __obj.updateDynamic("enhancedInfrastructureMetrics")(__v.asInstanceOf[js.Any]))
      externalMetricsPreference.foreach(__v => __obj.updateDynamic("externalMetricsPreference")(__v.asInstanceOf[js.Any]))
      inferredWorkloadTypes.foreach(__v => __obj.updateDynamic("inferredWorkloadTypes")(__v.asInstanceOf[js.Any]))
      resourceType.foreach(__v => __obj.updateDynamic("resourceType")(__v.asInstanceOf[js.Any]))
      scope.foreach(__v => __obj.updateDynamic("scope")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RecommendationPreferencesDetail]
    }
  }

  /** Describes the source of a recommendation, such as an Amazon EC2 instance or Auto Scaling group.
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

  /** A summary of a recommendation.
    */
  @js.native
  trait RecommendationSummary extends js.Object {
    var accountId: js.UndefOr[AccountId]
    var currentPerformanceRiskRatings: js.UndefOr[CurrentPerformanceRiskRatings]
    var recommendationResourceType: js.UndefOr[RecommendationSourceType]
    var savingsOpportunity: js.UndefOr[SavingsOpportunity]
    var summaries: js.UndefOr[Summaries]
  }

  object RecommendationSummary {
    @inline
    def apply(
        accountId: js.UndefOr[AccountId] = js.undefined,
        currentPerformanceRiskRatings: js.UndefOr[CurrentPerformanceRiskRatings] = js.undefined,
        recommendationResourceType: js.UndefOr[RecommendationSourceType] = js.undefined,
        savingsOpportunity: js.UndefOr[SavingsOpportunity] = js.undefined,
        summaries: js.UndefOr[Summaries] = js.undefined
    ): RecommendationSummary = {
      val __obj = js.Dynamic.literal()
      accountId.foreach(__v => __obj.updateDynamic("accountId")(__v.asInstanceOf[js.Any]))
      currentPerformanceRiskRatings.foreach(__v => __obj.updateDynamic("currentPerformanceRiskRatings")(__v.asInstanceOf[js.Any]))
      recommendationResourceType.foreach(__v => __obj.updateDynamic("recommendationResourceType")(__v.asInstanceOf[js.Any]))
      savingsOpportunity.foreach(__v => __obj.updateDynamic("savingsOpportunity")(__v.asInstanceOf[js.Any]))
      summaries.foreach(__v => __obj.updateDynamic("summaries")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RecommendationSummary]
    }
  }

  /** Describes a projected utilization metric of a recommendation option.
    *
    * '''Note:'''The <code>Cpu</code> and <code>Memory</code> metrics are the only projected utilization metrics returned when you run the <a>GetEC2RecommendationProjectedMetrics</a> action. Additionally, the <code>Memory</code> metric is returned only for resources that have the unified CloudWatch agent installed on them. For more information, see [[https://docs.aws.amazon.com/compute-optimizer/latest/ug/metrics.html#cw-agent|Enabling Memory Utilization with the CloudWatch Agent]].
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

  /** Describes the destination Amazon Simple Storage Service (Amazon S3) bucket name and object keys of a recommendations export file, and its associated metadata file.
    */
  @js.native
  trait S3Destination extends js.Object {
    var bucket: js.UndefOr[DestinationBucket]
    var key: js.UndefOr[DestinationKey]
    var metadataKey: js.UndefOr[MetadataKey]
  }

  object S3Destination {
    @inline
    def apply(
        bucket: js.UndefOr[DestinationBucket] = js.undefined,
        key: js.UndefOr[DestinationKey] = js.undefined,
        metadataKey: js.UndefOr[MetadataKey] = js.undefined
    ): S3Destination = {
      val __obj = js.Dynamic.literal()
      bucket.foreach(__v => __obj.updateDynamic("bucket")(__v.asInstanceOf[js.Any]))
      key.foreach(__v => __obj.updateDynamic("key")(__v.asInstanceOf[js.Any]))
      metadataKey.foreach(__v => __obj.updateDynamic("metadataKey")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[S3Destination]
    }
  }

  /** Describes the destination Amazon Simple Storage Service (Amazon S3) bucket name and key prefix for a recommendations export job. You must create the destination Amazon S3 bucket for your recommendations export before you create the export job. Compute Optimizer does not create the S3 bucket for you. After you create the S3 bucket, ensure that it has the required permission policy to allow Compute Optimizer to write the export file to it. If you plan to specify an object prefix when you create the export job, you must include the object prefix in the policy that you add to the S3 bucket. For more information, see [[https://docs.aws.amazon.com/compute-optimizer/latest/ug/create-s3-bucket-policy-for-compute-optimizer.html|Amazon S3 Bucket Policy for Compute Optimizer]] in the <i>Compute Optimizer User Guide</i>.
    */
  @js.native
  trait S3DestinationConfig extends js.Object {
    var bucket: js.UndefOr[DestinationBucket]
    var keyPrefix: js.UndefOr[DestinationKeyPrefix]
  }

  object S3DestinationConfig {
    @inline
    def apply(
        bucket: js.UndefOr[DestinationBucket] = js.undefined,
        keyPrefix: js.UndefOr[DestinationKeyPrefix] = js.undefined
    ): S3DestinationConfig = {
      val __obj = js.Dynamic.literal()
      bucket.foreach(__v => __obj.updateDynamic("bucket")(__v.asInstanceOf[js.Any]))
      keyPrefix.foreach(__v => __obj.updateDynamic("keyPrefix")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[S3DestinationConfig]
    }
  }

  /** Describes the savings opportunity for recommendations of a given resource type or for the recommendation option of an individual resource. Savings opportunity represents the estimated monthly savings you can achieve by implementing a given Compute Optimizer recommendation. <important> Savings opportunity data requires that you opt in to Cost Explorer, as well as activate ```Receive Amazon EC2 resource recommendations``` in the Cost Explorer preferences page. That creates a connection between Cost Explorer and Compute Optimizer. With this connection, Cost Explorer generates savings estimates considering the price of existing resources, the price of recommended resources, and historical usage data. Estimated monthly savings reflects the projected dollar savings associated with each of the recommendations generated. For more information, see [[https://docs.aws.amazon.com/cost-management/latest/userguide/ce-enable.html|Enabling Cost Explorer]] and
    * [[https://docs.aws.amazon.com/cost-management/latest/userguide/ce-rightsizing.html|Optimizing your cost with Rightsizing Recommendations]] in the <i>Cost Management User Guide</i>. </important>
    */
  @js.native
  trait SavingsOpportunity extends js.Object {
    var estimatedMonthlySavings: js.UndefOr[EstimatedMonthlySavings]
    var savingsOpportunityPercentage: js.UndefOr[SavingsOpportunityPercentage]
  }

  object SavingsOpportunity {
    @inline
    def apply(
        estimatedMonthlySavings: js.UndefOr[EstimatedMonthlySavings] = js.undefined,
        savingsOpportunityPercentage: js.UndefOr[SavingsOpportunityPercentage] = js.undefined
    ): SavingsOpportunity = {
      val __obj = js.Dynamic.literal()
      estimatedMonthlySavings.foreach(__v => __obj.updateDynamic("estimatedMonthlySavings")(__v.asInstanceOf[js.Any]))
      savingsOpportunityPercentage.foreach(__v => __obj.updateDynamic("savingsOpportunityPercentage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SavingsOpportunity]
    }
  }

  /** Describes the scope of a recommendation preference. Recommendation preferences can be created at the organization level (for management accounts of an organization only), account level, and resource level. For more information, see [[https://docs.aws.amazon.com/compute-optimizer/latest/ug/enhanced-infrastructure-metrics.html|Activating enhanced infrastructure metrics]] in the <i>Compute Optimizer User Guide</i>.
    *
    * '''Note:'''You cannot create recommendation preferences for Auto Scaling groups at the organization and account levels. You can create recommendation preferences for Auto Scaling groups only at the resource level by specifying a scope name of <code>ResourceArn</code> and a scope value of the Auto Scaling group Amazon Resource Name (ARN). This will configure the preference for all instances that are part of the specified Auto Scaling group. You also cannot create recommendation preferences at the resource level for instances that are part of an Auto Scaling group. You can create recommendation preferences at the resource level only for standalone instances.
    */
  @js.native
  trait Scope extends js.Object {
    var name: js.UndefOr[ScopeName]
    var value: js.UndefOr[ScopeValue]
  }

  object Scope {
    @inline
    def apply(
        name: js.UndefOr[ScopeName] = js.undefined,
        value: js.UndefOr[ScopeValue] = js.undefined
    ): Scope = {
      val __obj = js.Dynamic.literal()
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      value.foreach(__v => __obj.updateDynamic("value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Scope]
    }
  }

  /** The summary of a recommendation.
    */
  @js.native
  trait Summary extends js.Object {
    var name: js.UndefOr[Finding]
    var reasonCodeSummaries: js.UndefOr[ReasonCodeSummaries]
    var value: js.UndefOr[SummaryValue]
  }

  object Summary {
    @inline
    def apply(
        name: js.UndefOr[Finding] = js.undefined,
        reasonCodeSummaries: js.UndefOr[ReasonCodeSummaries] = js.undefined,
        value: js.UndefOr[SummaryValue] = js.undefined
    ): Summary = {
      val __obj = js.Dynamic.literal()
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      reasonCodeSummaries.foreach(__v => __obj.updateDynamic("reasonCodeSummaries")(__v.asInstanceOf[js.Any]))
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

  /** Describes a utilization metric of a resource, such as an Amazon EC2 instance. Compare the utilization metric data of your resource against its projected utilization metric data to determine the performance difference between your current resource and the recommended option.
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

  /** Describes the configuration of an Amazon Elastic Block Store (Amazon EBS) volume.
    */
  @js.native
  trait VolumeConfiguration extends js.Object {
    var volumeBaselineIOPS: js.UndefOr[VolumeBaselineIOPS]
    var volumeBaselineThroughput: js.UndefOr[VolumeBaselineThroughput]
    var volumeBurstIOPS: js.UndefOr[VolumeBurstIOPS]
    var volumeBurstThroughput: js.UndefOr[VolumeBurstThroughput]
    var volumeSize: js.UndefOr[VolumeSize]
    var volumeType: js.UndefOr[VolumeType]
  }

  object VolumeConfiguration {
    @inline
    def apply(
        volumeBaselineIOPS: js.UndefOr[VolumeBaselineIOPS] = js.undefined,
        volumeBaselineThroughput: js.UndefOr[VolumeBaselineThroughput] = js.undefined,
        volumeBurstIOPS: js.UndefOr[VolumeBurstIOPS] = js.undefined,
        volumeBurstThroughput: js.UndefOr[VolumeBurstThroughput] = js.undefined,
        volumeSize: js.UndefOr[VolumeSize] = js.undefined,
        volumeType: js.UndefOr[VolumeType] = js.undefined
    ): VolumeConfiguration = {
      val __obj = js.Dynamic.literal()
      volumeBaselineIOPS.foreach(__v => __obj.updateDynamic("volumeBaselineIOPS")(__v.asInstanceOf[js.Any]))
      volumeBaselineThroughput.foreach(__v => __obj.updateDynamic("volumeBaselineThroughput")(__v.asInstanceOf[js.Any]))
      volumeBurstIOPS.foreach(__v => __obj.updateDynamic("volumeBurstIOPS")(__v.asInstanceOf[js.Any]))
      volumeBurstThroughput.foreach(__v => __obj.updateDynamic("volumeBurstThroughput")(__v.asInstanceOf[js.Any]))
      volumeSize.foreach(__v => __obj.updateDynamic("volumeSize")(__v.asInstanceOf[js.Any]))
      volumeType.foreach(__v => __obj.updateDynamic("volumeType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VolumeConfiguration]
    }
  }

  /** Describes an Amazon Elastic Block Store (Amazon EBS) volume recommendation.
    */
  @js.native
  trait VolumeRecommendation extends js.Object {
    var accountId: js.UndefOr[AccountId]
    var currentConfiguration: js.UndefOr[VolumeConfiguration]
    var currentPerformanceRisk: js.UndefOr[CurrentPerformanceRisk]
    var finding: js.UndefOr[EBSFinding]
    var lastRefreshTimestamp: js.UndefOr[LastRefreshTimestamp]
    var lookBackPeriodInDays: js.UndefOr[LookBackPeriodInDays]
    var utilizationMetrics: js.UndefOr[EBSUtilizationMetrics]
    var volumeArn: js.UndefOr[VolumeArn]
    var volumeRecommendationOptions: js.UndefOr[VolumeRecommendationOptions]
  }

  object VolumeRecommendation {
    @inline
    def apply(
        accountId: js.UndefOr[AccountId] = js.undefined,
        currentConfiguration: js.UndefOr[VolumeConfiguration] = js.undefined,
        currentPerformanceRisk: js.UndefOr[CurrentPerformanceRisk] = js.undefined,
        finding: js.UndefOr[EBSFinding] = js.undefined,
        lastRefreshTimestamp: js.UndefOr[LastRefreshTimestamp] = js.undefined,
        lookBackPeriodInDays: js.UndefOr[LookBackPeriodInDays] = js.undefined,
        utilizationMetrics: js.UndefOr[EBSUtilizationMetrics] = js.undefined,
        volumeArn: js.UndefOr[VolumeArn] = js.undefined,
        volumeRecommendationOptions: js.UndefOr[VolumeRecommendationOptions] = js.undefined
    ): VolumeRecommendation = {
      val __obj = js.Dynamic.literal()
      accountId.foreach(__v => __obj.updateDynamic("accountId")(__v.asInstanceOf[js.Any]))
      currentConfiguration.foreach(__v => __obj.updateDynamic("currentConfiguration")(__v.asInstanceOf[js.Any]))
      currentPerformanceRisk.foreach(__v => __obj.updateDynamic("currentPerformanceRisk")(__v.asInstanceOf[js.Any]))
      finding.foreach(__v => __obj.updateDynamic("finding")(__v.asInstanceOf[js.Any]))
      lastRefreshTimestamp.foreach(__v => __obj.updateDynamic("lastRefreshTimestamp")(__v.asInstanceOf[js.Any]))
      lookBackPeriodInDays.foreach(__v => __obj.updateDynamic("lookBackPeriodInDays")(__v.asInstanceOf[js.Any]))
      utilizationMetrics.foreach(__v => __obj.updateDynamic("utilizationMetrics")(__v.asInstanceOf[js.Any]))
      volumeArn.foreach(__v => __obj.updateDynamic("volumeArn")(__v.asInstanceOf[js.Any]))
      volumeRecommendationOptions.foreach(__v => __obj.updateDynamic("volumeRecommendationOptions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VolumeRecommendation]
    }
  }

  /** Describes a recommendation option for an Amazon Elastic Block Store (Amazon EBS) instance.
    */
  @js.native
  trait VolumeRecommendationOption extends js.Object {
    var configuration: js.UndefOr[VolumeConfiguration]
    var performanceRisk: js.UndefOr[PerformanceRisk]
    var rank: js.UndefOr[Rank]
    var savingsOpportunity: js.UndefOr[SavingsOpportunity]
  }

  object VolumeRecommendationOption {
    @inline
    def apply(
        configuration: js.UndefOr[VolumeConfiguration] = js.undefined,
        performanceRisk: js.UndefOr[PerformanceRisk] = js.undefined,
        rank: js.UndefOr[Rank] = js.undefined,
        savingsOpportunity: js.UndefOr[SavingsOpportunity] = js.undefined
    ): VolumeRecommendationOption = {
      val __obj = js.Dynamic.literal()
      configuration.foreach(__v => __obj.updateDynamic("configuration")(__v.asInstanceOf[js.Any]))
      performanceRisk.foreach(__v => __obj.updateDynamic("performanceRisk")(__v.asInstanceOf[js.Any]))
      rank.foreach(__v => __obj.updateDynamic("rank")(__v.asInstanceOf[js.Any]))
      savingsOpportunity.foreach(__v => __obj.updateDynamic("savingsOpportunity")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VolumeRecommendationOption]
    }
  }
}
