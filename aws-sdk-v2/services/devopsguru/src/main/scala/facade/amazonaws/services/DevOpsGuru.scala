package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import scala.language.implicitConversions
import facade.amazonaws._

package object devopsguru {
  type AccountHealths = js.Array[AccountHealth]
  type AccountIdList = js.Array[AwsAccountId]
  type AnomalyDescription = String
  type AnomalyId = String
  type AnomalyLimit = Double
  type AnomalyName = String
  type AnomalyResources = js.Array[AnomalyResource]
  type AppBoundaryKey = String
  type AssociatedResourceArns = js.Array[ResourceArn]
  type AwsAccountId = String
  type Channels = js.Array[NotificationChannel]
  type ClientToken = String
  type CloudFormationHealths = js.Array[CloudFormationHealth]
  type CloudWatchMetricsDetails = js.Array[CloudWatchMetricsDetail]
  type CloudWatchMetricsDimensionName = String
  type CloudWatchMetricsDimensionValue = String
  type CloudWatchMetricsDimensions = js.Array[CloudWatchMetricsDimension]
  type CloudWatchMetricsMetricName = String
  type CloudWatchMetricsNamespace = String
  type CloudWatchMetricsPeriod = Int
  type CloudWatchMetricsUnit = String
  type Cost = Double
  type CostEstimationServiceResourceCount = Int
  type CostEstimationStackNames = js.Array[StackName]
  type CostEstimationTagValues = js.Array[TagValue]
  type EventId = String
  type EventName = String
  type EventResourceArn = String
  type EventResourceName = String
  type EventResourceType = String
  type EventResources = js.Array[EventResource]
  type EventSource = String
  type Events = js.Array[Event]
  type InsightId = String
  type InsightName = String
  type InsightSeverities = js.Array[InsightSeverity]
  type InsightStatuses = js.Array[InsightStatus]
  type ListAnomaliesForInsightMaxResults = Int
  type ListEventsMaxResults = Int
  type ListInsightsAccountIdList = js.Array[AwsAccountId]
  type ListInsightsMaxResults = Int
  type ListInsightsOrganizationalUnitIdList = js.Array[OrganizationalUnitId]
  type MeanTimeToRecoverInMilliseconds = Double
  type MetricValue = Double
  type NotificationChannelId = String
  type NumMetricsAnalyzed = Int
  type NumOpenProactiveInsights = Int
  type NumOpenReactiveInsights = Int
  type NumProactiveInsights = Int
  type NumReactiveInsights = Int
  type OrganizationResourceCollectionMaxResults = Int
  type OrganizationalUnitId = String
  type OrganizationalUnitIdList = js.Array[OrganizationalUnitId]
  type PerformanceInsightsMetricDimension = String
  type PerformanceInsightsMetricDimensions = js.Array[PerformanceInsightsMetricDimension]
  type PerformanceInsightsMetricDisplayName = String
  type PerformanceInsightsMetricFilterKey = String
  type PerformanceInsightsMetricFilterMap = js.Dictionary[PerformanceInsightsMetricFilterValue]
  type PerformanceInsightsMetricFilterValue = String
  type PerformanceInsightsMetricGroup = String
  type PerformanceInsightsMetricLimitInteger = Int
  type PerformanceInsightsMetricName = String
  type PerformanceInsightsMetricUnit = String
  type PerformanceInsightsMetricsDetails = js.Array[PerformanceInsightsMetricsDetail]
  type PerformanceInsightsReferenceDataList = js.Array[PerformanceInsightsReferenceData]
  type PerformanceInsightsReferenceName = String
  type PerformanceInsightsStatType = String
  type PerformanceInsightsStats = js.Array[PerformanceInsightsStat]
  type PerformanceInsightsValueDouble = Double
  type ProactiveAnomalies = js.Array[ProactiveAnomalySummary]
  type ProactiveInsights = js.Array[ProactiveInsightSummary]
  type ProactiveOrganizationInsights = js.Array[ProactiveOrganizationInsightSummary]
  type ReactiveAnomalies = js.Array[ReactiveAnomalySummary]
  type ReactiveInsights = js.Array[ReactiveInsightSummary]
  type ReactiveOrganizationInsights = js.Array[ReactiveOrganizationInsightSummary]
  type RecommendationDescription = String
  type RecommendationLink = String
  type RecommendationName = String
  type RecommendationReason = String
  type RecommendationRelatedAnomalies = js.Array[RecommendationRelatedAnomaly]
  type RecommendationRelatedAnomalyResourceName = String
  type RecommendationRelatedAnomalyResourceType = String
  type RecommendationRelatedAnomalyResources = js.Array[RecommendationRelatedAnomalyResource]
  type RecommendationRelatedCloudWatchMetricsSourceDetails = js.Array[RecommendationRelatedCloudWatchMetricsSourceDetail]
  type RecommendationRelatedCloudWatchMetricsSourceMetricName = String
  type RecommendationRelatedCloudWatchMetricsSourceNamespace = String
  type RecommendationRelatedEventName = String
  type RecommendationRelatedEventResourceName = String
  type RecommendationRelatedEventResourceType = String
  type RecommendationRelatedEventResources = js.Array[RecommendationRelatedEventResource]
  type RecommendationRelatedEvents = js.Array[RecommendationRelatedEvent]
  type Recommendations = js.Array[Recommendation]
  type RelatedAnomalySourceDetails = js.Array[RecommendationRelatedAnomalySourceDetail]
  type ResourceArn = String
  type ResourceHours = Double
  type ResourceName = String
  type ResourceType = String
  type SearchInsightsAccountIdList = js.Array[AwsAccountId]
  type SearchInsightsMaxResults = Int
  type SearchOrganizationInsightsMaxResults = Int
  type ServiceHealths = js.Array[ServiceHealth]
  type ServiceNames = js.Array[ServiceName]
  type ServiceResourceCosts = js.Array[ServiceResourceCost]
  type SsmOpsItemId = String
  type StackName = String
  type StackNames = js.Array[StackName]
  type TagCollectionFilters = js.Array[TagCollectionFilter]
  type TagCollections = js.Array[TagCollection]
  type TagCostEstimationResourceCollectionFilters = js.Array[TagCostEstimationResourceCollectionFilter]
  type TagHealths = js.Array[TagHealth]
  type TagValue = String
  type TagValues = js.Array[TagValue]
  type Timestamp = js.Date
  type TimestampMetricValuePairList = js.Array[TimestampMetricValuePair]
  type TopicArn = String
  type UpdateStackNames = js.Array[StackName]
  type UpdateTagCollectionFilters = js.Array[UpdateTagCollectionFilter]
  type UpdateTagValues = js.Array[TagValue]
  type UuidNextToken = String

  final class DevOpsGuruOps(private val service: DevOpsGuru) extends AnyVal {

    @inline def addNotificationChannelFuture(params: AddNotificationChannelRequest): Future[AddNotificationChannelResponse] = service.addNotificationChannel(params).promise().toFuture
    @inline def describeAccountHealthFuture(params: DescribeAccountHealthRequest): Future[DescribeAccountHealthResponse] = service.describeAccountHealth(params).promise().toFuture
    @inline def describeAccountOverviewFuture(params: DescribeAccountOverviewRequest): Future[DescribeAccountOverviewResponse] = service.describeAccountOverview(params).promise().toFuture
    @inline def describeAnomalyFuture(params: DescribeAnomalyRequest): Future[DescribeAnomalyResponse] = service.describeAnomaly(params).promise().toFuture
    @inline def describeFeedbackFuture(params: DescribeFeedbackRequest): Future[DescribeFeedbackResponse] = service.describeFeedback(params).promise().toFuture
    @inline def describeInsightFuture(params: DescribeInsightRequest): Future[DescribeInsightResponse] = service.describeInsight(params).promise().toFuture
    @inline def describeOrganizationHealthFuture(params: DescribeOrganizationHealthRequest): Future[DescribeOrganizationHealthResponse] = service.describeOrganizationHealth(params).promise().toFuture
    @inline def describeOrganizationOverviewFuture(params: DescribeOrganizationOverviewRequest): Future[DescribeOrganizationOverviewResponse] = service.describeOrganizationOverview(params).promise().toFuture
    @inline def describeOrganizationResourceCollectionHealthFuture(params: DescribeOrganizationResourceCollectionHealthRequest): Future[DescribeOrganizationResourceCollectionHealthResponse] = service.describeOrganizationResourceCollectionHealth(params).promise().toFuture
    @inline def describeResourceCollectionHealthFuture(params: DescribeResourceCollectionHealthRequest): Future[DescribeResourceCollectionHealthResponse] = service.describeResourceCollectionHealth(params).promise().toFuture
    @inline def describeServiceIntegrationFuture(params: DescribeServiceIntegrationRequest): Future[DescribeServiceIntegrationResponse] = service.describeServiceIntegration(params).promise().toFuture
    @inline def getCostEstimationFuture(params: GetCostEstimationRequest): Future[GetCostEstimationResponse] = service.getCostEstimation(params).promise().toFuture
    @inline def getResourceCollectionFuture(params: GetResourceCollectionRequest): Future[GetResourceCollectionResponse] = service.getResourceCollection(params).promise().toFuture
    @inline def listAnomaliesForInsightFuture(params: ListAnomaliesForInsightRequest): Future[ListAnomaliesForInsightResponse] = service.listAnomaliesForInsight(params).promise().toFuture
    @inline def listEventsFuture(params: ListEventsRequest): Future[ListEventsResponse] = service.listEvents(params).promise().toFuture
    @inline def listInsightsFuture(params: ListInsightsRequest): Future[ListInsightsResponse] = service.listInsights(params).promise().toFuture
    @inline def listNotificationChannelsFuture(params: ListNotificationChannelsRequest): Future[ListNotificationChannelsResponse] = service.listNotificationChannels(params).promise().toFuture
    @inline def listOrganizationInsightsFuture(params: ListOrganizationInsightsRequest): Future[ListOrganizationInsightsResponse] = service.listOrganizationInsights(params).promise().toFuture
    @inline def listRecommendationsFuture(params: ListRecommendationsRequest): Future[ListRecommendationsResponse] = service.listRecommendations(params).promise().toFuture
    @inline def putFeedbackFuture(params: PutFeedbackRequest): Future[PutFeedbackResponse] = service.putFeedback(params).promise().toFuture
    @inline def removeNotificationChannelFuture(params: RemoveNotificationChannelRequest): Future[RemoveNotificationChannelResponse] = service.removeNotificationChannel(params).promise().toFuture
    @inline def searchInsightsFuture(params: SearchInsightsRequest): Future[SearchInsightsResponse] = service.searchInsights(params).promise().toFuture
    @inline def searchOrganizationInsightsFuture(params: SearchOrganizationInsightsRequest): Future[SearchOrganizationInsightsResponse] = service.searchOrganizationInsights(params).promise().toFuture
    @inline def startCostEstimationFuture(params: StartCostEstimationRequest): Future[StartCostEstimationResponse] = service.startCostEstimation(params).promise().toFuture
    @inline def updateResourceCollectionFuture(params: UpdateResourceCollectionRequest): Future[UpdateResourceCollectionResponse] = service.updateResourceCollection(params).promise().toFuture
    @inline def updateServiceIntegrationFuture(params: UpdateServiceIntegrationRequest): Future[UpdateServiceIntegrationResponse] = service.updateServiceIntegration(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/devopsguru", JSImport.Namespace, "AWS.DevOpsGuru")
  class DevOpsGuru() extends js.Object {
    def this(config: AWSConfig) = this()

    def addNotificationChannel(params: AddNotificationChannelRequest): Request[AddNotificationChannelResponse] = js.native
    def describeAccountHealth(params: DescribeAccountHealthRequest): Request[DescribeAccountHealthResponse] = js.native
    def describeAccountOverview(params: DescribeAccountOverviewRequest): Request[DescribeAccountOverviewResponse] = js.native
    def describeAnomaly(params: DescribeAnomalyRequest): Request[DescribeAnomalyResponse] = js.native
    def describeFeedback(params: DescribeFeedbackRequest): Request[DescribeFeedbackResponse] = js.native
    def describeInsight(params: DescribeInsightRequest): Request[DescribeInsightResponse] = js.native
    def describeOrganizationHealth(params: DescribeOrganizationHealthRequest): Request[DescribeOrganizationHealthResponse] = js.native
    def describeOrganizationOverview(params: DescribeOrganizationOverviewRequest): Request[DescribeOrganizationOverviewResponse] = js.native
    def describeOrganizationResourceCollectionHealth(params: DescribeOrganizationResourceCollectionHealthRequest): Request[DescribeOrganizationResourceCollectionHealthResponse] = js.native
    def describeResourceCollectionHealth(params: DescribeResourceCollectionHealthRequest): Request[DescribeResourceCollectionHealthResponse] = js.native
    def describeServiceIntegration(params: DescribeServiceIntegrationRequest): Request[DescribeServiceIntegrationResponse] = js.native
    def getCostEstimation(params: GetCostEstimationRequest): Request[GetCostEstimationResponse] = js.native
    def getResourceCollection(params: GetResourceCollectionRequest): Request[GetResourceCollectionResponse] = js.native
    def listAnomaliesForInsight(params: ListAnomaliesForInsightRequest): Request[ListAnomaliesForInsightResponse] = js.native
    def listEvents(params: ListEventsRequest): Request[ListEventsResponse] = js.native
    def listInsights(params: ListInsightsRequest): Request[ListInsightsResponse] = js.native
    def listNotificationChannels(params: ListNotificationChannelsRequest): Request[ListNotificationChannelsResponse] = js.native
    def listOrganizationInsights(params: ListOrganizationInsightsRequest): Request[ListOrganizationInsightsResponse] = js.native
    def listRecommendations(params: ListRecommendationsRequest): Request[ListRecommendationsResponse] = js.native
    def putFeedback(params: PutFeedbackRequest): Request[PutFeedbackResponse] = js.native
    def removeNotificationChannel(params: RemoveNotificationChannelRequest): Request[RemoveNotificationChannelResponse] = js.native
    def searchInsights(params: SearchInsightsRequest): Request[SearchInsightsResponse] = js.native
    def searchOrganizationInsights(params: SearchOrganizationInsightsRequest): Request[SearchOrganizationInsightsResponse] = js.native
    def startCostEstimation(params: StartCostEstimationRequest): Request[StartCostEstimationResponse] = js.native
    def updateResourceCollection(params: UpdateResourceCollectionRequest): Request[UpdateResourceCollectionResponse] = js.native
    def updateServiceIntegration(params: UpdateServiceIntegrationRequest): Request[UpdateServiceIntegrationResponse] = js.native
  }
  object DevOpsGuru {
    @inline implicit def toOps(service: DevOpsGuru): DevOpsGuruOps = {
      new DevOpsGuruOps(service)
    }
  }

  /** Returns the number of open reactive insights, the number of open proactive insights, and the number of metrics analyzed in your Amazon Web Services account. Use these numbers to gauge the health of operations in your Amazon Web Services account.
    */
  @js.native
  trait AccountHealth extends js.Object {
    var AccountId: js.UndefOr[AwsAccountId]
    var Insight: js.UndefOr[AccountInsightHealth]
  }

  object AccountHealth {
    @inline
    def apply(
        AccountId: js.UndefOr[AwsAccountId] = js.undefined,
        Insight: js.UndefOr[AccountInsightHealth] = js.undefined
    ): AccountHealth = {
      val __obj = js.Dynamic.literal()
      AccountId.foreach(__v => __obj.updateDynamic("AccountId")(__v.asInstanceOf[js.Any]))
      Insight.foreach(__v => __obj.updateDynamic("Insight")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AccountHealth]
    }
  }

  /** Information about the number of open reactive and proactive insights that can be used to gauge the health of your system.
    */
  @js.native
  trait AccountInsightHealth extends js.Object {
    var OpenProactiveInsights: js.UndefOr[NumOpenProactiveInsights]
    var OpenReactiveInsights: js.UndefOr[NumOpenReactiveInsights]
  }

  object AccountInsightHealth {
    @inline
    def apply(
        OpenProactiveInsights: js.UndefOr[NumOpenProactiveInsights] = js.undefined,
        OpenReactiveInsights: js.UndefOr[NumOpenReactiveInsights] = js.undefined
    ): AccountInsightHealth = {
      val __obj = js.Dynamic.literal()
      OpenProactiveInsights.foreach(__v => __obj.updateDynamic("OpenProactiveInsights")(__v.asInstanceOf[js.Any]))
      OpenReactiveInsights.foreach(__v => __obj.updateDynamic("OpenReactiveInsights")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AccountInsightHealth]
    }
  }

  @js.native
  trait AddNotificationChannelRequest extends js.Object {
    var Config: NotificationChannelConfig
  }

  object AddNotificationChannelRequest {
    @inline
    def apply(
        Config: NotificationChannelConfig
    ): AddNotificationChannelRequest = {
      val __obj = js.Dynamic.literal(
        "Config" -> Config.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AddNotificationChannelRequest]
    }
  }

  @js.native
  trait AddNotificationChannelResponse extends js.Object {
    var Id: NotificationChannelId
  }

  object AddNotificationChannelResponse {
    @inline
    def apply(
        Id: NotificationChannelId
    ): AddNotificationChannelResponse = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AddNotificationChannelResponse]
    }
  }

  /** A time range that specifies when DevOps Guru opens and then closes an anomaly. This is different from <code>AnomalyTimeRange</code>, which specifies the time range when DevOps Guru actually observes the anomalous behavior.
    */
  @js.native
  trait AnomalyReportedTimeRange extends js.Object {
    var OpenTime: Timestamp
    var CloseTime: js.UndefOr[Timestamp]
  }

  object AnomalyReportedTimeRange {
    @inline
    def apply(
        OpenTime: Timestamp,
        CloseTime: js.UndefOr[Timestamp] = js.undefined
    ): AnomalyReportedTimeRange = {
      val __obj = js.Dynamic.literal(
        "OpenTime" -> OpenTime.asInstanceOf[js.Any]
      )

      CloseTime.foreach(__v => __obj.updateDynamic("CloseTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AnomalyReportedTimeRange]
    }
  }

  /** The Amazon Web Services resources in which DevOps Guru detected unusual behavior that resulted in the generation of an anomaly. When DevOps Guru detects multiple related anomalies, it creates and insight with details about the anomalous behavior and suggestions about how to correct the problem.
    */
  @js.native
  trait AnomalyResource extends js.Object {
    var Name: js.UndefOr[ResourceName]
    var Type: js.UndefOr[ResourceType]
  }

  object AnomalyResource {
    @inline
    def apply(
        Name: js.UndefOr[ResourceName] = js.undefined,
        Type: js.UndefOr[ResourceType] = js.undefined
    ): AnomalyResource = {
      val __obj = js.Dynamic.literal()
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AnomalyResource]
    }
  }

  /** Details about the source of the anomalous operational data that triggered the anomaly.
    */
  @js.native
  trait AnomalySourceDetails extends js.Object {
    var CloudWatchMetrics: js.UndefOr[CloudWatchMetricsDetails]
    var PerformanceInsightsMetrics: js.UndefOr[PerformanceInsightsMetricsDetails]
  }

  object AnomalySourceDetails {
    @inline
    def apply(
        CloudWatchMetrics: js.UndefOr[CloudWatchMetricsDetails] = js.undefined,
        PerformanceInsightsMetrics: js.UndefOr[PerformanceInsightsMetricsDetails] = js.undefined
    ): AnomalySourceDetails = {
      val __obj = js.Dynamic.literal()
      CloudWatchMetrics.foreach(__v => __obj.updateDynamic("CloudWatchMetrics")(__v.asInstanceOf[js.Any]))
      PerformanceInsightsMetrics.foreach(__v => __obj.updateDynamic("PerformanceInsightsMetrics")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AnomalySourceDetails]
    }
  }

  /** A time range that specifies when the observed unusual behavior in an anomaly started and ended. This is different from <code>AnomalyReportedTimeRange</code>, which specifies the time range when DevOps Guru opens and then closes an anomaly.
    */
  @js.native
  trait AnomalyTimeRange extends js.Object {
    var StartTime: Timestamp
    var EndTime: js.UndefOr[Timestamp]
  }

  object AnomalyTimeRange {
    @inline
    def apply(
        StartTime: Timestamp,
        EndTime: js.UndefOr[Timestamp] = js.undefined
    ): AnomalyTimeRange = {
      val __obj = js.Dynamic.literal(
        "StartTime" -> StartTime.asInstanceOf[js.Any]
      )

      EndTime.foreach(__v => __obj.updateDynamic("EndTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AnomalyTimeRange]
    }
  }

  /** Information about Amazon Web Services CloudFormation stacks. You can use up to 500 stacks to specify which Amazon Web Services resources in your account to analyze. For more information, see [[https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacks.html|Stacks]] in the <i>Amazon Web Services CloudFormation User Guide</i>.
    */
  @js.native
  trait CloudFormationCollection extends js.Object {
    var StackNames: js.UndefOr[StackNames]
  }

  object CloudFormationCollection {
    @inline
    def apply(
        StackNames: js.UndefOr[StackNames] = js.undefined
    ): CloudFormationCollection = {
      val __obj = js.Dynamic.literal()
      StackNames.foreach(__v => __obj.updateDynamic("StackNames")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CloudFormationCollection]
    }
  }

  /** Information about Amazon Web Services CloudFormation stacks. You can use up to 500 stacks to specify which Amazon Web Services resources in your account to analyze. For more information, see [[https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacks.html|Stacks]] in the <i>Amazon Web Services CloudFormation User Guide</i>.
    */
  @js.native
  trait CloudFormationCollectionFilter extends js.Object {
    var StackNames: js.UndefOr[StackNames]
  }

  object CloudFormationCollectionFilter {
    @inline
    def apply(
        StackNames: js.UndefOr[StackNames] = js.undefined
    ): CloudFormationCollectionFilter = {
      val __obj = js.Dynamic.literal()
      StackNames.foreach(__v => __obj.updateDynamic("StackNames")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CloudFormationCollectionFilter]
    }
  }

  /** Information about an Amazon Web Services CloudFormation stack used to create a monthly cost estimate for DevOps Guru to analyze Amazon Web Services resources. The maximum number of stacks you can specify for a cost estimate is one. The estimate created is for the cost to analyze the Amazon Web Services resources defined by the stack. For more information, see [[https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacks.html|Stacks]] in the <i>Amazon Web Services CloudFormation User Guide</i>.
    */
  @js.native
  trait CloudFormationCostEstimationResourceCollectionFilter extends js.Object {
    var StackNames: js.UndefOr[CostEstimationStackNames]
  }

  object CloudFormationCostEstimationResourceCollectionFilter {
    @inline
    def apply(
        StackNames: js.UndefOr[CostEstimationStackNames] = js.undefined
    ): CloudFormationCostEstimationResourceCollectionFilter = {
      val __obj = js.Dynamic.literal()
      StackNames.foreach(__v => __obj.updateDynamic("StackNames")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CloudFormationCostEstimationResourceCollectionFilter]
    }
  }

  /** Information about the health of Amazon Web Services resources in your account that are specified by an Amazon Web Services CloudFormation stack.
    */
  @js.native
  trait CloudFormationHealth extends js.Object {
    var Insight: js.UndefOr[InsightHealth]
    var StackName: js.UndefOr[StackName]
  }

  object CloudFormationHealth {
    @inline
    def apply(
        Insight: js.UndefOr[InsightHealth] = js.undefined,
        StackName: js.UndefOr[StackName] = js.undefined
    ): CloudFormationHealth = {
      val __obj = js.Dynamic.literal()
      Insight.foreach(__v => __obj.updateDynamic("Insight")(__v.asInstanceOf[js.Any]))
      StackName.foreach(__v => __obj.updateDynamic("StackName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CloudFormationHealth]
    }
  }

  /** Contains information about the analyzed metrics that displayed anomalous behavior.
    */
  @js.native
  trait CloudWatchMetricsDataSummary extends js.Object {
    var StatusCode: js.UndefOr[CloudWatchMetricDataStatusCode]
    var TimestampMetricValuePairList: js.UndefOr[TimestampMetricValuePairList]
  }

  object CloudWatchMetricsDataSummary {
    @inline
    def apply(
        StatusCode: js.UndefOr[CloudWatchMetricDataStatusCode] = js.undefined,
        TimestampMetricValuePairList: js.UndefOr[TimestampMetricValuePairList] = js.undefined
    ): CloudWatchMetricsDataSummary = {
      val __obj = js.Dynamic.literal()
      StatusCode.foreach(__v => __obj.updateDynamic("StatusCode")(__v.asInstanceOf[js.Any]))
      TimestampMetricValuePairList.foreach(__v => __obj.updateDynamic("TimestampMetricValuePairList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CloudWatchMetricsDataSummary]
    }
  }

  /** Information about an Amazon CloudWatch metric.
    */
  @js.native
  trait CloudWatchMetricsDetail extends js.Object {
    var Dimensions: js.UndefOr[CloudWatchMetricsDimensions]
    var MetricDataSummary: js.UndefOr[CloudWatchMetricsDataSummary]
    var MetricName: js.UndefOr[CloudWatchMetricsMetricName]
    var Namespace: js.UndefOr[CloudWatchMetricsNamespace]
    var Period: js.UndefOr[CloudWatchMetricsPeriod]
    var Stat: js.UndefOr[CloudWatchMetricsStat]
    var Unit: js.UndefOr[CloudWatchMetricsUnit]
  }

  object CloudWatchMetricsDetail {
    @inline
    def apply(
        Dimensions: js.UndefOr[CloudWatchMetricsDimensions] = js.undefined,
        MetricDataSummary: js.UndefOr[CloudWatchMetricsDataSummary] = js.undefined,
        MetricName: js.UndefOr[CloudWatchMetricsMetricName] = js.undefined,
        Namespace: js.UndefOr[CloudWatchMetricsNamespace] = js.undefined,
        Period: js.UndefOr[CloudWatchMetricsPeriod] = js.undefined,
        Stat: js.UndefOr[CloudWatchMetricsStat] = js.undefined,
        Unit: js.UndefOr[CloudWatchMetricsUnit] = js.undefined
    ): CloudWatchMetricsDetail = {
      val __obj = js.Dynamic.literal()
      Dimensions.foreach(__v => __obj.updateDynamic("Dimensions")(__v.asInstanceOf[js.Any]))
      MetricDataSummary.foreach(__v => __obj.updateDynamic("MetricDataSummary")(__v.asInstanceOf[js.Any]))
      MetricName.foreach(__v => __obj.updateDynamic("MetricName")(__v.asInstanceOf[js.Any]))
      Namespace.foreach(__v => __obj.updateDynamic("Namespace")(__v.asInstanceOf[js.Any]))
      Period.foreach(__v => __obj.updateDynamic("Period")(__v.asInstanceOf[js.Any]))
      Stat.foreach(__v => __obj.updateDynamic("Stat")(__v.asInstanceOf[js.Any]))
      Unit.foreach(__v => __obj.updateDynamic("Unit")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CloudWatchMetricsDetail]
    }
  }

  /** The dimension of am Amazon CloudWatch metric that is used when DevOps Guru analyzes the resources in your account for operational problems and anomalous behavior. A dimension is a name/value pair that is part of the identity of a metric. A metric can have up to 10 dimensions. For more information, see [[https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/cloudwatch_concepts.html#Dimension|Dimensions]] in the <i>Amazon CloudWatch User Guide</i>.
    */
  @js.native
  trait CloudWatchMetricsDimension extends js.Object {
    var Name: js.UndefOr[CloudWatchMetricsDimensionName]
    var Value: js.UndefOr[CloudWatchMetricsDimensionValue]
  }

  object CloudWatchMetricsDimension {
    @inline
    def apply(
        Name: js.UndefOr[CloudWatchMetricsDimensionName] = js.undefined,
        Value: js.UndefOr[CloudWatchMetricsDimensionValue] = js.undefined
    ): CloudWatchMetricsDimension = {
      val __obj = js.Dynamic.literal()
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CloudWatchMetricsDimension]
    }
  }

  /** Information about a filter used to specify which Amazon Web Services resources are analyzed to create a monthly DevOps Guru cost estimate. For more information, see [[https://docs.aws.amazon.com/devops-guru/latest/userguide/cost-estimate.html|Estimate your Amazon DevOps Guru costs]] and [[http://aws.amazon.com/devops-guru/pricing/|Amazon DevOps Guru pricing]].
    */
  @js.native
  trait CostEstimationResourceCollectionFilter extends js.Object {
    var CloudFormation: js.UndefOr[CloudFormationCostEstimationResourceCollectionFilter]
    var Tags: js.UndefOr[TagCostEstimationResourceCollectionFilters]
  }

  object CostEstimationResourceCollectionFilter {
    @inline
    def apply(
        CloudFormation: js.UndefOr[CloudFormationCostEstimationResourceCollectionFilter] = js.undefined,
        Tags: js.UndefOr[TagCostEstimationResourceCollectionFilters] = js.undefined
    ): CostEstimationResourceCollectionFilter = {
      val __obj = js.Dynamic.literal()
      CloudFormation.foreach(__v => __obj.updateDynamic("CloudFormation")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CostEstimationResourceCollectionFilter]
    }
  }

  /** The time range of a cost estimation.
    */
  @js.native
  trait CostEstimationTimeRange extends js.Object {
    var EndTime: js.UndefOr[Timestamp]
    var StartTime: js.UndefOr[Timestamp]
  }

  object CostEstimationTimeRange {
    @inline
    def apply(
        EndTime: js.UndefOr[Timestamp] = js.undefined,
        StartTime: js.UndefOr[Timestamp] = js.undefined
    ): CostEstimationTimeRange = {
      val __obj = js.Dynamic.literal()
      EndTime.foreach(__v => __obj.updateDynamic("EndTime")(__v.asInstanceOf[js.Any]))
      StartTime.foreach(__v => __obj.updateDynamic("StartTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CostEstimationTimeRange]
    }
  }

  @js.native
  trait DescribeAccountHealthRequest extends js.Object

  object DescribeAccountHealthRequest {
    @inline
    def apply(): DescribeAccountHealthRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DescribeAccountHealthRequest]
    }
  }

  @js.native
  trait DescribeAccountHealthResponse extends js.Object {
    var MetricsAnalyzed: NumMetricsAnalyzed
    var OpenProactiveInsights: NumOpenProactiveInsights
    var OpenReactiveInsights: NumOpenReactiveInsights
    var ResourceHours: ResourceHours
  }

  object DescribeAccountHealthResponse {
    @inline
    def apply(
        MetricsAnalyzed: NumMetricsAnalyzed,
        OpenProactiveInsights: NumOpenProactiveInsights,
        OpenReactiveInsights: NumOpenReactiveInsights,
        ResourceHours: ResourceHours
    ): DescribeAccountHealthResponse = {
      val __obj = js.Dynamic.literal(
        "MetricsAnalyzed" -> MetricsAnalyzed.asInstanceOf[js.Any],
        "OpenProactiveInsights" -> OpenProactiveInsights.asInstanceOf[js.Any],
        "OpenReactiveInsights" -> OpenReactiveInsights.asInstanceOf[js.Any],
        "ResourceHours" -> ResourceHours.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeAccountHealthResponse]
    }
  }

  @js.native
  trait DescribeAccountOverviewRequest extends js.Object {
    var FromTime: Timestamp
    var ToTime: js.UndefOr[Timestamp]
  }

  object DescribeAccountOverviewRequest {
    @inline
    def apply(
        FromTime: Timestamp,
        ToTime: js.UndefOr[Timestamp] = js.undefined
    ): DescribeAccountOverviewRequest = {
      val __obj = js.Dynamic.literal(
        "FromTime" -> FromTime.asInstanceOf[js.Any]
      )

      ToTime.foreach(__v => __obj.updateDynamic("ToTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeAccountOverviewRequest]
    }
  }

  @js.native
  trait DescribeAccountOverviewResponse extends js.Object {
    var MeanTimeToRecoverInMilliseconds: MeanTimeToRecoverInMilliseconds
    var ProactiveInsights: NumProactiveInsights
    var ReactiveInsights: NumReactiveInsights
  }

  object DescribeAccountOverviewResponse {
    @inline
    def apply(
        MeanTimeToRecoverInMilliseconds: MeanTimeToRecoverInMilliseconds,
        ProactiveInsights: NumProactiveInsights,
        ReactiveInsights: NumReactiveInsights
    ): DescribeAccountOverviewResponse = {
      val __obj = js.Dynamic.literal(
        "MeanTimeToRecoverInMilliseconds" -> MeanTimeToRecoverInMilliseconds.asInstanceOf[js.Any],
        "ProactiveInsights" -> ProactiveInsights.asInstanceOf[js.Any],
        "ReactiveInsights" -> ReactiveInsights.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeAccountOverviewResponse]
    }
  }

  @js.native
  trait DescribeAnomalyRequest extends js.Object {
    var Id: AnomalyId
    var AccountId: js.UndefOr[AwsAccountId]
  }

  object DescribeAnomalyRequest {
    @inline
    def apply(
        Id: AnomalyId,
        AccountId: js.UndefOr[AwsAccountId] = js.undefined
    ): DescribeAnomalyRequest = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any]
      )

      AccountId.foreach(__v => __obj.updateDynamic("AccountId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeAnomalyRequest]
    }
  }

  @js.native
  trait DescribeAnomalyResponse extends js.Object {
    var ProactiveAnomaly: js.UndefOr[ProactiveAnomaly]
    var ReactiveAnomaly: js.UndefOr[ReactiveAnomaly]
  }

  object DescribeAnomalyResponse {
    @inline
    def apply(
        ProactiveAnomaly: js.UndefOr[ProactiveAnomaly] = js.undefined,
        ReactiveAnomaly: js.UndefOr[ReactiveAnomaly] = js.undefined
    ): DescribeAnomalyResponse = {
      val __obj = js.Dynamic.literal()
      ProactiveAnomaly.foreach(__v => __obj.updateDynamic("ProactiveAnomaly")(__v.asInstanceOf[js.Any]))
      ReactiveAnomaly.foreach(__v => __obj.updateDynamic("ReactiveAnomaly")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeAnomalyResponse]
    }
  }

  @js.native
  trait DescribeFeedbackRequest extends js.Object {
    var InsightId: js.UndefOr[InsightId]
  }

  object DescribeFeedbackRequest {
    @inline
    def apply(
        InsightId: js.UndefOr[InsightId] = js.undefined
    ): DescribeFeedbackRequest = {
      val __obj = js.Dynamic.literal()
      InsightId.foreach(__v => __obj.updateDynamic("InsightId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeFeedbackRequest]
    }
  }

  @js.native
  trait DescribeFeedbackResponse extends js.Object {
    var InsightFeedback: js.UndefOr[InsightFeedback]
  }

  object DescribeFeedbackResponse {
    @inline
    def apply(
        InsightFeedback: js.UndefOr[InsightFeedback] = js.undefined
    ): DescribeFeedbackResponse = {
      val __obj = js.Dynamic.literal()
      InsightFeedback.foreach(__v => __obj.updateDynamic("InsightFeedback")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeFeedbackResponse]
    }
  }

  @js.native
  trait DescribeInsightRequest extends js.Object {
    var Id: InsightId
    var AccountId: js.UndefOr[AwsAccountId]
  }

  object DescribeInsightRequest {
    @inline
    def apply(
        Id: InsightId,
        AccountId: js.UndefOr[AwsAccountId] = js.undefined
    ): DescribeInsightRequest = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any]
      )

      AccountId.foreach(__v => __obj.updateDynamic("AccountId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeInsightRequest]
    }
  }

  @js.native
  trait DescribeInsightResponse extends js.Object {
    var ProactiveInsight: js.UndefOr[ProactiveInsight]
    var ReactiveInsight: js.UndefOr[ReactiveInsight]
  }

  object DescribeInsightResponse {
    @inline
    def apply(
        ProactiveInsight: js.UndefOr[ProactiveInsight] = js.undefined,
        ReactiveInsight: js.UndefOr[ReactiveInsight] = js.undefined
    ): DescribeInsightResponse = {
      val __obj = js.Dynamic.literal()
      ProactiveInsight.foreach(__v => __obj.updateDynamic("ProactiveInsight")(__v.asInstanceOf[js.Any]))
      ReactiveInsight.foreach(__v => __obj.updateDynamic("ReactiveInsight")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeInsightResponse]
    }
  }

  @js.native
  trait DescribeOrganizationHealthRequest extends js.Object {
    var AccountIds: js.UndefOr[AccountIdList]
    var OrganizationalUnitIds: js.UndefOr[OrganizationalUnitIdList]
  }

  object DescribeOrganizationHealthRequest {
    @inline
    def apply(
        AccountIds: js.UndefOr[AccountIdList] = js.undefined,
        OrganizationalUnitIds: js.UndefOr[OrganizationalUnitIdList] = js.undefined
    ): DescribeOrganizationHealthRequest = {
      val __obj = js.Dynamic.literal()
      AccountIds.foreach(__v => __obj.updateDynamic("AccountIds")(__v.asInstanceOf[js.Any]))
      OrganizationalUnitIds.foreach(__v => __obj.updateDynamic("OrganizationalUnitIds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeOrganizationHealthRequest]
    }
  }

  @js.native
  trait DescribeOrganizationHealthResponse extends js.Object {
    var MetricsAnalyzed: NumMetricsAnalyzed
    var OpenProactiveInsights: NumOpenProactiveInsights
    var OpenReactiveInsights: NumOpenReactiveInsights
    var ResourceHours: ResourceHours
  }

  object DescribeOrganizationHealthResponse {
    @inline
    def apply(
        MetricsAnalyzed: NumMetricsAnalyzed,
        OpenProactiveInsights: NumOpenProactiveInsights,
        OpenReactiveInsights: NumOpenReactiveInsights,
        ResourceHours: ResourceHours
    ): DescribeOrganizationHealthResponse = {
      val __obj = js.Dynamic.literal(
        "MetricsAnalyzed" -> MetricsAnalyzed.asInstanceOf[js.Any],
        "OpenProactiveInsights" -> OpenProactiveInsights.asInstanceOf[js.Any],
        "OpenReactiveInsights" -> OpenReactiveInsights.asInstanceOf[js.Any],
        "ResourceHours" -> ResourceHours.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeOrganizationHealthResponse]
    }
  }

  @js.native
  trait DescribeOrganizationOverviewRequest extends js.Object {
    var FromTime: Timestamp
    var AccountIds: js.UndefOr[AccountIdList]
    var OrganizationalUnitIds: js.UndefOr[OrganizationalUnitIdList]
    var ToTime: js.UndefOr[Timestamp]
  }

  object DescribeOrganizationOverviewRequest {
    @inline
    def apply(
        FromTime: Timestamp,
        AccountIds: js.UndefOr[AccountIdList] = js.undefined,
        OrganizationalUnitIds: js.UndefOr[OrganizationalUnitIdList] = js.undefined,
        ToTime: js.UndefOr[Timestamp] = js.undefined
    ): DescribeOrganizationOverviewRequest = {
      val __obj = js.Dynamic.literal(
        "FromTime" -> FromTime.asInstanceOf[js.Any]
      )

      AccountIds.foreach(__v => __obj.updateDynamic("AccountIds")(__v.asInstanceOf[js.Any]))
      OrganizationalUnitIds.foreach(__v => __obj.updateDynamic("OrganizationalUnitIds")(__v.asInstanceOf[js.Any]))
      ToTime.foreach(__v => __obj.updateDynamic("ToTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeOrganizationOverviewRequest]
    }
  }

  @js.native
  trait DescribeOrganizationOverviewResponse extends js.Object {
    var ProactiveInsights: NumProactiveInsights
    var ReactiveInsights: NumReactiveInsights
  }

  object DescribeOrganizationOverviewResponse {
    @inline
    def apply(
        ProactiveInsights: NumProactiveInsights,
        ReactiveInsights: NumReactiveInsights
    ): DescribeOrganizationOverviewResponse = {
      val __obj = js.Dynamic.literal(
        "ProactiveInsights" -> ProactiveInsights.asInstanceOf[js.Any],
        "ReactiveInsights" -> ReactiveInsights.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeOrganizationOverviewResponse]
    }
  }

  @js.native
  trait DescribeOrganizationResourceCollectionHealthRequest extends js.Object {
    var OrganizationResourceCollectionType: OrganizationResourceCollectionType
    var AccountIds: js.UndefOr[AccountIdList]
    var MaxResults: js.UndefOr[OrganizationResourceCollectionMaxResults]
    var NextToken: js.UndefOr[UuidNextToken]
    var OrganizationalUnitIds: js.UndefOr[OrganizationalUnitIdList]
  }

  object DescribeOrganizationResourceCollectionHealthRequest {
    @inline
    def apply(
        OrganizationResourceCollectionType: OrganizationResourceCollectionType,
        AccountIds: js.UndefOr[AccountIdList] = js.undefined,
        MaxResults: js.UndefOr[OrganizationResourceCollectionMaxResults] = js.undefined,
        NextToken: js.UndefOr[UuidNextToken] = js.undefined,
        OrganizationalUnitIds: js.UndefOr[OrganizationalUnitIdList] = js.undefined
    ): DescribeOrganizationResourceCollectionHealthRequest = {
      val __obj = js.Dynamic.literal(
        "OrganizationResourceCollectionType" -> OrganizationResourceCollectionType.asInstanceOf[js.Any]
      )

      AccountIds.foreach(__v => __obj.updateDynamic("AccountIds")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      OrganizationalUnitIds.foreach(__v => __obj.updateDynamic("OrganizationalUnitIds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeOrganizationResourceCollectionHealthRequest]
    }
  }

  @js.native
  trait DescribeOrganizationResourceCollectionHealthResponse extends js.Object {
    var Account: js.UndefOr[AccountHealths]
    var CloudFormation: js.UndefOr[CloudFormationHealths]
    var NextToken: js.UndefOr[UuidNextToken]
    var Service: js.UndefOr[ServiceHealths]
    var Tags: js.UndefOr[TagHealths]
  }

  object DescribeOrganizationResourceCollectionHealthResponse {
    @inline
    def apply(
        Account: js.UndefOr[AccountHealths] = js.undefined,
        CloudFormation: js.UndefOr[CloudFormationHealths] = js.undefined,
        NextToken: js.UndefOr[UuidNextToken] = js.undefined,
        Service: js.UndefOr[ServiceHealths] = js.undefined,
        Tags: js.UndefOr[TagHealths] = js.undefined
    ): DescribeOrganizationResourceCollectionHealthResponse = {
      val __obj = js.Dynamic.literal()
      Account.foreach(__v => __obj.updateDynamic("Account")(__v.asInstanceOf[js.Any]))
      CloudFormation.foreach(__v => __obj.updateDynamic("CloudFormation")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Service.foreach(__v => __obj.updateDynamic("Service")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeOrganizationResourceCollectionHealthResponse]
    }
  }

  @js.native
  trait DescribeResourceCollectionHealthRequest extends js.Object {
    var ResourceCollectionType: ResourceCollectionType
    var NextToken: js.UndefOr[UuidNextToken]
  }

  object DescribeResourceCollectionHealthRequest {
    @inline
    def apply(
        ResourceCollectionType: ResourceCollectionType,
        NextToken: js.UndefOr[UuidNextToken] = js.undefined
    ): DescribeResourceCollectionHealthRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceCollectionType" -> ResourceCollectionType.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeResourceCollectionHealthRequest]
    }
  }

  @js.native
  trait DescribeResourceCollectionHealthResponse extends js.Object {
    var CloudFormation: js.UndefOr[CloudFormationHealths]
    var NextToken: js.UndefOr[UuidNextToken]
    var Service: js.UndefOr[ServiceHealths]
    var Tags: js.UndefOr[TagHealths]
  }

  object DescribeResourceCollectionHealthResponse {
    @inline
    def apply(
        CloudFormation: js.UndefOr[CloudFormationHealths] = js.undefined,
        NextToken: js.UndefOr[UuidNextToken] = js.undefined,
        Service: js.UndefOr[ServiceHealths] = js.undefined,
        Tags: js.UndefOr[TagHealths] = js.undefined
    ): DescribeResourceCollectionHealthResponse = {
      val __obj = js.Dynamic.literal()
      CloudFormation.foreach(__v => __obj.updateDynamic("CloudFormation")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Service.foreach(__v => __obj.updateDynamic("Service")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeResourceCollectionHealthResponse]
    }
  }

  @js.native
  trait DescribeServiceIntegrationRequest extends js.Object

  object DescribeServiceIntegrationRequest {
    @inline
    def apply(): DescribeServiceIntegrationRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DescribeServiceIntegrationRequest]
    }
  }

  @js.native
  trait DescribeServiceIntegrationResponse extends js.Object {
    var ServiceIntegration: js.UndefOr[ServiceIntegrationConfig]
  }

  object DescribeServiceIntegrationResponse {
    @inline
    def apply(
        ServiceIntegration: js.UndefOr[ServiceIntegrationConfig] = js.undefined
    ): DescribeServiceIntegrationResponse = {
      val __obj = js.Dynamic.literal()
      ServiceIntegration.foreach(__v => __obj.updateDynamic("ServiceIntegration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeServiceIntegrationResponse]
    }
  }

  /** A range of time that specifies when anomalous behavior in an anomaly or insight ended.
    */
  @js.native
  trait EndTimeRange extends js.Object {
    var FromTime: js.UndefOr[Timestamp]
    var ToTime: js.UndefOr[Timestamp]
  }

  object EndTimeRange {
    @inline
    def apply(
        FromTime: js.UndefOr[Timestamp] = js.undefined,
        ToTime: js.UndefOr[Timestamp] = js.undefined
    ): EndTimeRange = {
      val __obj = js.Dynamic.literal()
      FromTime.foreach(__v => __obj.updateDynamic("FromTime")(__v.asInstanceOf[js.Any]))
      ToTime.foreach(__v => __obj.updateDynamic("ToTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EndTimeRange]
    }
  }

  /** An Amazon Web Services resource event. Amazon Web Services resource events and metrics are analyzed by DevOps Guru to find anomalous behavior and provide recommendations to improve your operational solutions.
    */
  @js.native
  trait Event extends js.Object {
    var DataSource: js.UndefOr[EventDataSource]
    var EventClass: js.UndefOr[EventClass]
    var EventSource: js.UndefOr[EventSource]
    var Id: js.UndefOr[EventId]
    var Name: js.UndefOr[EventName]
    var ResourceCollection: js.UndefOr[ResourceCollection]
    var Resources: js.UndefOr[EventResources]
    var Time: js.UndefOr[Timestamp]
  }

  object Event {
    @inline
    def apply(
        DataSource: js.UndefOr[EventDataSource] = js.undefined,
        EventClass: js.UndefOr[EventClass] = js.undefined,
        EventSource: js.UndefOr[EventSource] = js.undefined,
        Id: js.UndefOr[EventId] = js.undefined,
        Name: js.UndefOr[EventName] = js.undefined,
        ResourceCollection: js.UndefOr[ResourceCollection] = js.undefined,
        Resources: js.UndefOr[EventResources] = js.undefined,
        Time: js.UndefOr[Timestamp] = js.undefined
    ): Event = {
      val __obj = js.Dynamic.literal()
      DataSource.foreach(__v => __obj.updateDynamic("DataSource")(__v.asInstanceOf[js.Any]))
      EventClass.foreach(__v => __obj.updateDynamic("EventClass")(__v.asInstanceOf[js.Any]))
      EventSource.foreach(__v => __obj.updateDynamic("EventSource")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      ResourceCollection.foreach(__v => __obj.updateDynamic("ResourceCollection")(__v.asInstanceOf[js.Any]))
      Resources.foreach(__v => __obj.updateDynamic("Resources")(__v.asInstanceOf[js.Any]))
      Time.foreach(__v => __obj.updateDynamic("Time")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Event]
    }
  }

  /** The Amazon Web Services resource that emitted an event. Amazon Web Services resource events and metrics are analyzed by DevOps Guru to find anomalous behavior and provide recommendations to improve your operational solutions.
    */
  @js.native
  trait EventResource extends js.Object {
    var Arn: js.UndefOr[EventResourceArn]
    var Name: js.UndefOr[EventResourceName]
    var Type: js.UndefOr[EventResourceType]
  }

  object EventResource {
    @inline
    def apply(
        Arn: js.UndefOr[EventResourceArn] = js.undefined,
        Name: js.UndefOr[EventResourceName] = js.undefined,
        Type: js.UndefOr[EventResourceType] = js.undefined
    ): EventResource = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EventResource]
    }
  }

  /** The time range during which an Amazon Web Services event occurred. Amazon Web Services resource events and metrics are analyzed by DevOps Guru to find anomalous behavior and provide recommendations to improve your operational solutions.
    */
  @js.native
  trait EventTimeRange extends js.Object {
    var FromTime: Timestamp
    var ToTime: Timestamp
  }

  object EventTimeRange {
    @inline
    def apply(
        FromTime: Timestamp,
        ToTime: Timestamp
    ): EventTimeRange = {
      val __obj = js.Dynamic.literal(
        "FromTime" -> FromTime.asInstanceOf[js.Any],
        "ToTime" -> ToTime.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[EventTimeRange]
    }
  }

  @js.native
  trait GetCostEstimationRequest extends js.Object {
    var NextToken: js.UndefOr[UuidNextToken]
  }

  object GetCostEstimationRequest {
    @inline
    def apply(
        NextToken: js.UndefOr[UuidNextToken] = js.undefined
    ): GetCostEstimationRequest = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetCostEstimationRequest]
    }
  }

  @js.native
  trait GetCostEstimationResponse extends js.Object {
    var Costs: js.UndefOr[ServiceResourceCosts]
    var NextToken: js.UndefOr[UuidNextToken]
    var ResourceCollection: js.UndefOr[CostEstimationResourceCollectionFilter]
    var Status: js.UndefOr[CostEstimationStatus]
    var TimeRange: js.UndefOr[CostEstimationTimeRange]
    var TotalCost: js.UndefOr[Cost]
  }

  object GetCostEstimationResponse {
    @inline
    def apply(
        Costs: js.UndefOr[ServiceResourceCosts] = js.undefined,
        NextToken: js.UndefOr[UuidNextToken] = js.undefined,
        ResourceCollection: js.UndefOr[CostEstimationResourceCollectionFilter] = js.undefined,
        Status: js.UndefOr[CostEstimationStatus] = js.undefined,
        TimeRange: js.UndefOr[CostEstimationTimeRange] = js.undefined,
        TotalCost: js.UndefOr[Cost] = js.undefined
    ): GetCostEstimationResponse = {
      val __obj = js.Dynamic.literal()
      Costs.foreach(__v => __obj.updateDynamic("Costs")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      ResourceCollection.foreach(__v => __obj.updateDynamic("ResourceCollection")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      TimeRange.foreach(__v => __obj.updateDynamic("TimeRange")(__v.asInstanceOf[js.Any]))
      TotalCost.foreach(__v => __obj.updateDynamic("TotalCost")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetCostEstimationResponse]
    }
  }

  @js.native
  trait GetResourceCollectionRequest extends js.Object {
    var ResourceCollectionType: ResourceCollectionType
    var NextToken: js.UndefOr[UuidNextToken]
  }

  object GetResourceCollectionRequest {
    @inline
    def apply(
        ResourceCollectionType: ResourceCollectionType,
        NextToken: js.UndefOr[UuidNextToken] = js.undefined
    ): GetResourceCollectionRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceCollectionType" -> ResourceCollectionType.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetResourceCollectionRequest]
    }
  }

  @js.native
  trait GetResourceCollectionResponse extends js.Object {
    var NextToken: js.UndefOr[UuidNextToken]
    var ResourceCollection: js.UndefOr[ResourceCollectionFilter]
  }

  object GetResourceCollectionResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[UuidNextToken] = js.undefined,
        ResourceCollection: js.UndefOr[ResourceCollectionFilter] = js.undefined
    ): GetResourceCollectionResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      ResourceCollection.foreach(__v => __obj.updateDynamic("ResourceCollection")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetResourceCollectionResponse]
    }
  }

  /** Information about insight feedback received from a customer.
    */
  @js.native
  trait InsightFeedback extends js.Object {
    var Feedback: js.UndefOr[InsightFeedbackOption]
    var Id: js.UndefOr[InsightId]
  }

  object InsightFeedback {
    @inline
    def apply(
        Feedback: js.UndefOr[InsightFeedbackOption] = js.undefined,
        Id: js.UndefOr[InsightId] = js.undefined
    ): InsightFeedback = {
      val __obj = js.Dynamic.literal()
      Feedback.foreach(__v => __obj.updateDynamic("Feedback")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InsightFeedback]
    }
  }

  /** Information about the number of open reactive and proactive insights that can be used to gauge the health of your system.
    */
  @js.native
  trait InsightHealth extends js.Object {
    var MeanTimeToRecoverInMilliseconds: js.UndefOr[MeanTimeToRecoverInMilliseconds]
    var OpenProactiveInsights: js.UndefOr[NumOpenProactiveInsights]
    var OpenReactiveInsights: js.UndefOr[NumOpenReactiveInsights]
  }

  object InsightHealth {
    @inline
    def apply(
        MeanTimeToRecoverInMilliseconds: js.UndefOr[MeanTimeToRecoverInMilliseconds] = js.undefined,
        OpenProactiveInsights: js.UndefOr[NumOpenProactiveInsights] = js.undefined,
        OpenReactiveInsights: js.UndefOr[NumOpenReactiveInsights] = js.undefined
    ): InsightHealth = {
      val __obj = js.Dynamic.literal()
      MeanTimeToRecoverInMilliseconds.foreach(__v => __obj.updateDynamic("MeanTimeToRecoverInMilliseconds")(__v.asInstanceOf[js.Any]))
      OpenProactiveInsights.foreach(__v => __obj.updateDynamic("OpenProactiveInsights")(__v.asInstanceOf[js.Any]))
      OpenReactiveInsights.foreach(__v => __obj.updateDynamic("OpenReactiveInsights")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InsightHealth]
    }
  }

  /** A time ranged that specifies when the observed behavior in an insight started and ended.
    */
  @js.native
  trait InsightTimeRange extends js.Object {
    var StartTime: Timestamp
    var EndTime: js.UndefOr[Timestamp]
  }

  object InsightTimeRange {
    @inline
    def apply(
        StartTime: Timestamp,
        EndTime: js.UndefOr[Timestamp] = js.undefined
    ): InsightTimeRange = {
      val __obj = js.Dynamic.literal(
        "StartTime" -> StartTime.asInstanceOf[js.Any]
      )

      EndTime.foreach(__v => __obj.updateDynamic("EndTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InsightTimeRange]
    }
  }

  @js.native
  trait ListAnomaliesForInsightRequest extends js.Object {
    var InsightId: InsightId
    var AccountId: js.UndefOr[AwsAccountId]
    var MaxResults: js.UndefOr[ListAnomaliesForInsightMaxResults]
    var NextToken: js.UndefOr[UuidNextToken]
    var StartTimeRange: js.UndefOr[StartTimeRange]
  }

  object ListAnomaliesForInsightRequest {
    @inline
    def apply(
        InsightId: InsightId,
        AccountId: js.UndefOr[AwsAccountId] = js.undefined,
        MaxResults: js.UndefOr[ListAnomaliesForInsightMaxResults] = js.undefined,
        NextToken: js.UndefOr[UuidNextToken] = js.undefined,
        StartTimeRange: js.UndefOr[StartTimeRange] = js.undefined
    ): ListAnomaliesForInsightRequest = {
      val __obj = js.Dynamic.literal(
        "InsightId" -> InsightId.asInstanceOf[js.Any]
      )

      AccountId.foreach(__v => __obj.updateDynamic("AccountId")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      StartTimeRange.foreach(__v => __obj.updateDynamic("StartTimeRange")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAnomaliesForInsightRequest]
    }
  }

  @js.native
  trait ListAnomaliesForInsightResponse extends js.Object {
    var NextToken: js.UndefOr[UuidNextToken]
    var ProactiveAnomalies: js.UndefOr[ProactiveAnomalies]
    var ReactiveAnomalies: js.UndefOr[ReactiveAnomalies]
  }

  object ListAnomaliesForInsightResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[UuidNextToken] = js.undefined,
        ProactiveAnomalies: js.UndefOr[ProactiveAnomalies] = js.undefined,
        ReactiveAnomalies: js.UndefOr[ReactiveAnomalies] = js.undefined
    ): ListAnomaliesForInsightResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      ProactiveAnomalies.foreach(__v => __obj.updateDynamic("ProactiveAnomalies")(__v.asInstanceOf[js.Any]))
      ReactiveAnomalies.foreach(__v => __obj.updateDynamic("ReactiveAnomalies")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAnomaliesForInsightResponse]
    }
  }

  /** Filters you can use to specify which events are returned when <code>ListEvents</code> is called.
    */
  @js.native
  trait ListEventsFilters extends js.Object {
    var DataSource: js.UndefOr[EventDataSource]
    var EventClass: js.UndefOr[EventClass]
    var EventSource: js.UndefOr[EventSource]
    var EventTimeRange: js.UndefOr[EventTimeRange]
    var InsightId: js.UndefOr[InsightId]
    var ResourceCollection: js.UndefOr[ResourceCollection]
  }

  object ListEventsFilters {
    @inline
    def apply(
        DataSource: js.UndefOr[EventDataSource] = js.undefined,
        EventClass: js.UndefOr[EventClass] = js.undefined,
        EventSource: js.UndefOr[EventSource] = js.undefined,
        EventTimeRange: js.UndefOr[EventTimeRange] = js.undefined,
        InsightId: js.UndefOr[InsightId] = js.undefined,
        ResourceCollection: js.UndefOr[ResourceCollection] = js.undefined
    ): ListEventsFilters = {
      val __obj = js.Dynamic.literal()
      DataSource.foreach(__v => __obj.updateDynamic("DataSource")(__v.asInstanceOf[js.Any]))
      EventClass.foreach(__v => __obj.updateDynamic("EventClass")(__v.asInstanceOf[js.Any]))
      EventSource.foreach(__v => __obj.updateDynamic("EventSource")(__v.asInstanceOf[js.Any]))
      EventTimeRange.foreach(__v => __obj.updateDynamic("EventTimeRange")(__v.asInstanceOf[js.Any]))
      InsightId.foreach(__v => __obj.updateDynamic("InsightId")(__v.asInstanceOf[js.Any]))
      ResourceCollection.foreach(__v => __obj.updateDynamic("ResourceCollection")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListEventsFilters]
    }
  }

  @js.native
  trait ListEventsRequest extends js.Object {
    var Filters: ListEventsFilters
    var AccountId: js.UndefOr[AwsAccountId]
    var MaxResults: js.UndefOr[ListEventsMaxResults]
    var NextToken: js.UndefOr[UuidNextToken]
  }

  object ListEventsRequest {
    @inline
    def apply(
        Filters: ListEventsFilters,
        AccountId: js.UndefOr[AwsAccountId] = js.undefined,
        MaxResults: js.UndefOr[ListEventsMaxResults] = js.undefined,
        NextToken: js.UndefOr[UuidNextToken] = js.undefined
    ): ListEventsRequest = {
      val __obj = js.Dynamic.literal(
        "Filters" -> Filters.asInstanceOf[js.Any]
      )

      AccountId.foreach(__v => __obj.updateDynamic("AccountId")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListEventsRequest]
    }
  }

  @js.native
  trait ListEventsResponse extends js.Object {
    var Events: Events
    var NextToken: js.UndefOr[UuidNextToken]
  }

  object ListEventsResponse {
    @inline
    def apply(
        Events: Events,
        NextToken: js.UndefOr[UuidNextToken] = js.undefined
    ): ListEventsResponse = {
      val __obj = js.Dynamic.literal(
        "Events" -> Events.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListEventsResponse]
    }
  }

  /** Used to filter for insights that have any status.
    */
  @js.native
  trait ListInsightsAnyStatusFilter extends js.Object {
    var StartTimeRange: StartTimeRange
    var Type: InsightType
  }

  object ListInsightsAnyStatusFilter {
    @inline
    def apply(
        StartTimeRange: StartTimeRange,
        Type: InsightType
    ): ListInsightsAnyStatusFilter = {
      val __obj = js.Dynamic.literal(
        "StartTimeRange" -> StartTimeRange.asInstanceOf[js.Any],
        "Type" -> Type.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ListInsightsAnyStatusFilter]
    }
  }

  /** Used to filter for insights that have the status <code>CLOSED</code>.
    */
  @js.native
  trait ListInsightsClosedStatusFilter extends js.Object {
    var EndTimeRange: EndTimeRange
    var Type: InsightType
  }

  object ListInsightsClosedStatusFilter {
    @inline
    def apply(
        EndTimeRange: EndTimeRange,
        Type: InsightType
    ): ListInsightsClosedStatusFilter = {
      val __obj = js.Dynamic.literal(
        "EndTimeRange" -> EndTimeRange.asInstanceOf[js.Any],
        "Type" -> Type.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ListInsightsClosedStatusFilter]
    }
  }

  /** Used to filter for insights that have the status <code>ONGOING</code>.
    */
  @js.native
  trait ListInsightsOngoingStatusFilter extends js.Object {
    var Type: InsightType
  }

  object ListInsightsOngoingStatusFilter {
    @inline
    def apply(
        Type: InsightType
    ): ListInsightsOngoingStatusFilter = {
      val __obj = js.Dynamic.literal(
        "Type" -> Type.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ListInsightsOngoingStatusFilter]
    }
  }

  @js.native
  trait ListInsightsRequest extends js.Object {
    var StatusFilter: ListInsightsStatusFilter
    var MaxResults: js.UndefOr[ListInsightsMaxResults]
    var NextToken: js.UndefOr[UuidNextToken]
  }

  object ListInsightsRequest {
    @inline
    def apply(
        StatusFilter: ListInsightsStatusFilter,
        MaxResults: js.UndefOr[ListInsightsMaxResults] = js.undefined,
        NextToken: js.UndefOr[UuidNextToken] = js.undefined
    ): ListInsightsRequest = {
      val __obj = js.Dynamic.literal(
        "StatusFilter" -> StatusFilter.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListInsightsRequest]
    }
  }

  @js.native
  trait ListInsightsResponse extends js.Object {
    var NextToken: js.UndefOr[UuidNextToken]
    var ProactiveInsights: js.UndefOr[ProactiveInsights]
    var ReactiveInsights: js.UndefOr[ReactiveInsights]
  }

  object ListInsightsResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[UuidNextToken] = js.undefined,
        ProactiveInsights: js.UndefOr[ProactiveInsights] = js.undefined,
        ReactiveInsights: js.UndefOr[ReactiveInsights] = js.undefined
    ): ListInsightsResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      ProactiveInsights.foreach(__v => __obj.updateDynamic("ProactiveInsights")(__v.asInstanceOf[js.Any]))
      ReactiveInsights.foreach(__v => __obj.updateDynamic("ReactiveInsights")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListInsightsResponse]
    }
  }

  /** A filter used by <code>ListInsights</code> to specify which insights to return.
    */
  @js.native
  trait ListInsightsStatusFilter extends js.Object {
    var Any: js.UndefOr[ListInsightsAnyStatusFilter]
    var Closed: js.UndefOr[ListInsightsClosedStatusFilter]
    var Ongoing: js.UndefOr[ListInsightsOngoingStatusFilter]
  }

  object ListInsightsStatusFilter {
    @inline
    def apply(
        Any: js.UndefOr[ListInsightsAnyStatusFilter] = js.undefined,
        Closed: js.UndefOr[ListInsightsClosedStatusFilter] = js.undefined,
        Ongoing: js.UndefOr[ListInsightsOngoingStatusFilter] = js.undefined
    ): ListInsightsStatusFilter = {
      val __obj = js.Dynamic.literal()
      Any.foreach(__v => __obj.updateDynamic("Any")(__v.asInstanceOf[js.Any]))
      Closed.foreach(__v => __obj.updateDynamic("Closed")(__v.asInstanceOf[js.Any]))
      Ongoing.foreach(__v => __obj.updateDynamic("Ongoing")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListInsightsStatusFilter]
    }
  }

  @js.native
  trait ListNotificationChannelsRequest extends js.Object {
    var NextToken: js.UndefOr[UuidNextToken]
  }

  object ListNotificationChannelsRequest {
    @inline
    def apply(
        NextToken: js.UndefOr[UuidNextToken] = js.undefined
    ): ListNotificationChannelsRequest = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListNotificationChannelsRequest]
    }
  }

  @js.native
  trait ListNotificationChannelsResponse extends js.Object {
    var Channels: js.UndefOr[Channels]
    var NextToken: js.UndefOr[UuidNextToken]
  }

  object ListNotificationChannelsResponse {
    @inline
    def apply(
        Channels: js.UndefOr[Channels] = js.undefined,
        NextToken: js.UndefOr[UuidNextToken] = js.undefined
    ): ListNotificationChannelsResponse = {
      val __obj = js.Dynamic.literal()
      Channels.foreach(__v => __obj.updateDynamic("Channels")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListNotificationChannelsResponse]
    }
  }

  @js.native
  trait ListOrganizationInsightsRequest extends js.Object {
    var StatusFilter: ListInsightsStatusFilter
    var AccountIds: js.UndefOr[ListInsightsAccountIdList]
    var MaxResults: js.UndefOr[ListInsightsMaxResults]
    var NextToken: js.UndefOr[UuidNextToken]
    var OrganizationalUnitIds: js.UndefOr[ListInsightsOrganizationalUnitIdList]
  }

  object ListOrganizationInsightsRequest {
    @inline
    def apply(
        StatusFilter: ListInsightsStatusFilter,
        AccountIds: js.UndefOr[ListInsightsAccountIdList] = js.undefined,
        MaxResults: js.UndefOr[ListInsightsMaxResults] = js.undefined,
        NextToken: js.UndefOr[UuidNextToken] = js.undefined,
        OrganizationalUnitIds: js.UndefOr[ListInsightsOrganizationalUnitIdList] = js.undefined
    ): ListOrganizationInsightsRequest = {
      val __obj = js.Dynamic.literal(
        "StatusFilter" -> StatusFilter.asInstanceOf[js.Any]
      )

      AccountIds.foreach(__v => __obj.updateDynamic("AccountIds")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      OrganizationalUnitIds.foreach(__v => __obj.updateDynamic("OrganizationalUnitIds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListOrganizationInsightsRequest]
    }
  }

  @js.native
  trait ListOrganizationInsightsResponse extends js.Object {
    var NextToken: js.UndefOr[UuidNextToken]
    var ProactiveInsights: js.UndefOr[ProactiveOrganizationInsights]
    var ReactiveInsights: js.UndefOr[ReactiveOrganizationInsights]
  }

  object ListOrganizationInsightsResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[UuidNextToken] = js.undefined,
        ProactiveInsights: js.UndefOr[ProactiveOrganizationInsights] = js.undefined,
        ReactiveInsights: js.UndefOr[ReactiveOrganizationInsights] = js.undefined
    ): ListOrganizationInsightsResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      ProactiveInsights.foreach(__v => __obj.updateDynamic("ProactiveInsights")(__v.asInstanceOf[js.Any]))
      ReactiveInsights.foreach(__v => __obj.updateDynamic("ReactiveInsights")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListOrganizationInsightsResponse]
    }
  }

  @js.native
  trait ListRecommendationsRequest extends js.Object {
    var InsightId: InsightId
    var AccountId: js.UndefOr[AwsAccountId]
    var Locale: js.UndefOr[Locale]
    var NextToken: js.UndefOr[UuidNextToken]
  }

  object ListRecommendationsRequest {
    @inline
    def apply(
        InsightId: InsightId,
        AccountId: js.UndefOr[AwsAccountId] = js.undefined,
        Locale: js.UndefOr[Locale] = js.undefined,
        NextToken: js.UndefOr[UuidNextToken] = js.undefined
    ): ListRecommendationsRequest = {
      val __obj = js.Dynamic.literal(
        "InsightId" -> InsightId.asInstanceOf[js.Any]
      )

      AccountId.foreach(__v => __obj.updateDynamic("AccountId")(__v.asInstanceOf[js.Any]))
      Locale.foreach(__v => __obj.updateDynamic("Locale")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListRecommendationsRequest]
    }
  }

  @js.native
  trait ListRecommendationsResponse extends js.Object {
    var NextToken: js.UndefOr[UuidNextToken]
    var Recommendations: js.UndefOr[Recommendations]
  }

  object ListRecommendationsResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[UuidNextToken] = js.undefined,
        Recommendations: js.UndefOr[Recommendations] = js.undefined
    ): ListRecommendationsResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Recommendations.foreach(__v => __obj.updateDynamic("Recommendations")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListRecommendationsResponse]
    }
  }

  /** Information about a notification channel. A notification channel is used to notify you when DevOps Guru creates an insight. The one supported notification channel is Amazon Simple Notification Service (Amazon SNS). If you use an Amazon SNS topic in another account, you must attach a policy to it that grants DevOps Guru permission to it notifications. DevOps Guru adds the required policy on your behalf to send notifications using Amazon SNS in your account. For more information, see [[https://docs.aws.amazon.com/devops-guru/latest/userguide/sns-required-permissions.html|Permissions for cross account Amazon SNS topics]]. If you use an Amazon SNS topic that is encrypted by an Amazon Web Services Key Management Service customer-managed key (CMK), then you must add permissions to the CMK. For more information, see [[https://docs.aws.amazon.com/devops-guru/latest/userguide/sns-kms-permissions.html|Permissions for Amazon Web Services KMS–encrypted Amazon SNS topics]].
    */
  @js.native
  trait NotificationChannel extends js.Object {
    var Config: js.UndefOr[NotificationChannelConfig]
    var Id: js.UndefOr[NotificationChannelId]
  }

  object NotificationChannel {
    @inline
    def apply(
        Config: js.UndefOr[NotificationChannelConfig] = js.undefined,
        Id: js.UndefOr[NotificationChannelId] = js.undefined
    ): NotificationChannel = {
      val __obj = js.Dynamic.literal()
      Config.foreach(__v => __obj.updateDynamic("Config")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NotificationChannel]
    }
  }

  /** Information about notification channels you have configured with DevOps Guru. The one supported notification channel is Amazon Simple Notification Service (Amazon SNS).
    */
  @js.native
  trait NotificationChannelConfig extends js.Object {
    var Sns: SnsChannelConfig
  }

  object NotificationChannelConfig {
    @inline
    def apply(
        Sns: SnsChannelConfig
    ): NotificationChannelConfig = {
      val __obj = js.Dynamic.literal(
        "Sns" -> Sns.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[NotificationChannelConfig]
    }
  }

  /** Information about whether DevOps Guru is configured to create an OpsItem in Amazon Web Services Systems Manager OpsCenter for each created insight.
    */
  @js.native
  trait OpsCenterIntegration extends js.Object {
    var OptInStatus: js.UndefOr[OptInStatus]
  }

  object OpsCenterIntegration {
    @inline
    def apply(
        OptInStatus: js.UndefOr[OptInStatus] = js.undefined
    ): OpsCenterIntegration = {
      val __obj = js.Dynamic.literal()
      OptInStatus.foreach(__v => __obj.updateDynamic("OptInStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OpsCenterIntegration]
    }
  }

  /** Information about whether DevOps Guru is configured to create an OpsItem in Amazon Web Services Systems Manager OpsCenter for each created insight.
    */
  @js.native
  trait OpsCenterIntegrationConfig extends js.Object {
    var OptInStatus: js.UndefOr[OptInStatus]
  }

  object OpsCenterIntegrationConfig {
    @inline
    def apply(
        OptInStatus: js.UndefOr[OptInStatus] = js.undefined
    ): OpsCenterIntegrationConfig = {
      val __obj = js.Dynamic.literal()
      OptInStatus.foreach(__v => __obj.updateDynamic("OptInStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OpsCenterIntegrationConfig]
    }
  }

  /** A logical grouping of Performance Insights metrics for a related subject area. For example, the <code>db.sql</code> dimension group consists of the following dimensions: <code>db.sql.id</code>, <code>db.sql.db_id</code>, <code>db.sql.statement</code>, and <code>db.sql.tokenized_id</code>.
    *
    * '''Note:'''Each response element returns a maximum of 500 bytes. For larger elements, such as SQL statements, only the first 500 bytes are returned. Amazon RDS Performance Insights enables you to monitor and explore different dimensions of database load based on data captured from a running DB instance. DB load is measured as average active sessions. Performance Insights provides the data to API consumers as a two-dimensional time-series dataset. The time dimension provides DB load data for each time point in the queried time range. Each time point decomposes overall load in relation to the requested dimensions, measured at that time point. Examples include SQL, Wait event, User, and Host. * To learn more about Performance Insights and Amazon Aurora DB instances, go to the [[https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_PerfInsights.html| Amazon Aurora User Guide]]. * To learn more about Performance Insights and Amazon RDS DB instances, go to the
    * [[https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_PerfInsights.html| Amazon RDS User Guide]].
    */
  @js.native
  trait PerformanceInsightsMetricDimensionGroup extends js.Object {
    var Dimensions: js.UndefOr[PerformanceInsightsMetricDimensions]
    var Group: js.UndefOr[PerformanceInsightsMetricGroup]
    var Limit: js.UndefOr[PerformanceInsightsMetricLimitInteger]
  }

  object PerformanceInsightsMetricDimensionGroup {
    @inline
    def apply(
        Dimensions: js.UndefOr[PerformanceInsightsMetricDimensions] = js.undefined,
        Group: js.UndefOr[PerformanceInsightsMetricGroup] = js.undefined,
        Limit: js.UndefOr[PerformanceInsightsMetricLimitInteger] = js.undefined
    ): PerformanceInsightsMetricDimensionGroup = {
      val __obj = js.Dynamic.literal()
      Dimensions.foreach(__v => __obj.updateDynamic("Dimensions")(__v.asInstanceOf[js.Any]))
      Group.foreach(__v => __obj.updateDynamic("Group")(__v.asInstanceOf[js.Any]))
      Limit.foreach(__v => __obj.updateDynamic("Limit")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PerformanceInsightsMetricDimensionGroup]
    }
  }

  /** A single query to be processed. Use these parameters to query the Performance Insights <code>GetResourceMetrics</code> API to retrieve the metrics for an anomaly. For more information, see <code> [[https://docs.aws.amazon.com/performance-insights/latest/APIReference/API_GetResourceMetrics.html|GetResourceMetrics]] </code> in the <i>Amazon RDS Performance Insights API Reference</i>. Amazon RDS Performance Insights enables you to monitor and explore different dimensions of database load based on data captured from a running DB instance. DB load is measured as average active sessions. Performance Insights provides the data to API consumers as a two-dimensional time-series dataset. The time dimension provides DB load data for each time point in the queried time range. Each time point decomposes overall load in relation to the requested dimensions, measured at that time point. Examples include SQL, Wait event, User, and Host. * To learn more about Performance Insights and Amazon
    * Aurora DB instances, go to the [[https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_PerfInsights.html| Amazon Aurora User Guide]]. * To learn more about Performance Insights and Amazon RDS DB instances, go to the [[https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_PerfInsights.html| Amazon RDS User Guide]].
    */
  @js.native
  trait PerformanceInsightsMetricQuery extends js.Object {
    var Filter: js.UndefOr[PerformanceInsightsMetricFilterMap]
    var GroupBy: js.UndefOr[PerformanceInsightsMetricDimensionGroup]
    var Metric: js.UndefOr[PerformanceInsightsMetricName]
  }

  object PerformanceInsightsMetricQuery {
    @inline
    def apply(
        Filter: js.UndefOr[PerformanceInsightsMetricFilterMap] = js.undefined,
        GroupBy: js.UndefOr[PerformanceInsightsMetricDimensionGroup] = js.undefined,
        Metric: js.UndefOr[PerformanceInsightsMetricName] = js.undefined
    ): PerformanceInsightsMetricQuery = {
      val __obj = js.Dynamic.literal()
      Filter.foreach(__v => __obj.updateDynamic("Filter")(__v.asInstanceOf[js.Any]))
      GroupBy.foreach(__v => __obj.updateDynamic("GroupBy")(__v.asInstanceOf[js.Any]))
      Metric.foreach(__v => __obj.updateDynamic("Metric")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PerformanceInsightsMetricQuery]
    }
  }

  /** Details about Performance Insights metrics. Amazon RDS Performance Insights enables you to monitor and explore different dimensions of database load based on data captured from a running DB instance. DB load is measured as average active sessions. Performance Insights provides the data to API consumers as a two-dimensional time-series dataset. The time dimension provides DB load data for each time point in the queried time range. Each time point decomposes overall load in relation to the requested dimensions, measured at that time point. Examples include SQL, Wait event, User, and Host. * To learn more about Performance Insights and Amazon Aurora DB instances, go to the [[https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_PerfInsights.html| Amazon Aurora User Guide]]. * To learn more about Performance Insights and Amazon RDS DB instances, go to the [[https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_PerfInsights.html| Amazon RDS User Guide]].
    */
  @js.native
  trait PerformanceInsightsMetricsDetail extends js.Object {
    var MetricDisplayName: js.UndefOr[PerformanceInsightsMetricDisplayName]
    var MetricQuery: js.UndefOr[PerformanceInsightsMetricQuery]
    var ReferenceData: js.UndefOr[PerformanceInsightsReferenceDataList]
    var StatsAtAnomaly: js.UndefOr[PerformanceInsightsStats]
    var StatsAtBaseline: js.UndefOr[PerformanceInsightsStats]
    var Unit: js.UndefOr[PerformanceInsightsMetricUnit]
  }

  object PerformanceInsightsMetricsDetail {
    @inline
    def apply(
        MetricDisplayName: js.UndefOr[PerformanceInsightsMetricDisplayName] = js.undefined,
        MetricQuery: js.UndefOr[PerformanceInsightsMetricQuery] = js.undefined,
        ReferenceData: js.UndefOr[PerformanceInsightsReferenceDataList] = js.undefined,
        StatsAtAnomaly: js.UndefOr[PerformanceInsightsStats] = js.undefined,
        StatsAtBaseline: js.UndefOr[PerformanceInsightsStats] = js.undefined,
        Unit: js.UndefOr[PerformanceInsightsMetricUnit] = js.undefined
    ): PerformanceInsightsMetricsDetail = {
      val __obj = js.Dynamic.literal()
      MetricDisplayName.foreach(__v => __obj.updateDynamic("MetricDisplayName")(__v.asInstanceOf[js.Any]))
      MetricQuery.foreach(__v => __obj.updateDynamic("MetricQuery")(__v.asInstanceOf[js.Any]))
      ReferenceData.foreach(__v => __obj.updateDynamic("ReferenceData")(__v.asInstanceOf[js.Any]))
      StatsAtAnomaly.foreach(__v => __obj.updateDynamic("StatsAtAnomaly")(__v.asInstanceOf[js.Any]))
      StatsAtBaseline.foreach(__v => __obj.updateDynamic("StatsAtBaseline")(__v.asInstanceOf[js.Any]))
      Unit.foreach(__v => __obj.updateDynamic("Unit")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PerformanceInsightsMetricsDetail]
    }
  }

  /** Reference scalar values and other metrics that DevOps Guru displays on a graph in its console along with the actual metrics it analyzed. Compare these reference values to your actual metrics to help you understand anomalous behavior that DevOps Guru detected.
    */
  @js.native
  trait PerformanceInsightsReferenceComparisonValues extends js.Object {
    var ReferenceMetric: js.UndefOr[PerformanceInsightsReferenceMetric]
    var ReferenceScalar: js.UndefOr[PerformanceInsightsReferenceScalar]
  }

  object PerformanceInsightsReferenceComparisonValues {
    @inline
    def apply(
        ReferenceMetric: js.UndefOr[PerformanceInsightsReferenceMetric] = js.undefined,
        ReferenceScalar: js.UndefOr[PerformanceInsightsReferenceScalar] = js.undefined
    ): PerformanceInsightsReferenceComparisonValues = {
      val __obj = js.Dynamic.literal()
      ReferenceMetric.foreach(__v => __obj.updateDynamic("ReferenceMetric")(__v.asInstanceOf[js.Any]))
      ReferenceScalar.foreach(__v => __obj.updateDynamic("ReferenceScalar")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PerformanceInsightsReferenceComparisonValues]
    }
  }

  /** Reference data used to evaluate Performance Insights to determine if its performance is anomalous or not.
    */
  @js.native
  trait PerformanceInsightsReferenceData extends js.Object {
    var ComparisonValues: js.UndefOr[PerformanceInsightsReferenceComparisonValues]
    var Name: js.UndefOr[PerformanceInsightsReferenceName]
  }

  object PerformanceInsightsReferenceData {
    @inline
    def apply(
        ComparisonValues: js.UndefOr[PerformanceInsightsReferenceComparisonValues] = js.undefined,
        Name: js.UndefOr[PerformanceInsightsReferenceName] = js.undefined
    ): PerformanceInsightsReferenceData = {
      val __obj = js.Dynamic.literal()
      ComparisonValues.foreach(__v => __obj.updateDynamic("ComparisonValues")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PerformanceInsightsReferenceData]
    }
  }

  /** Information about a reference metric used to evaluate Performance Insights.
    */
  @js.native
  trait PerformanceInsightsReferenceMetric extends js.Object {
    var MetricQuery: js.UndefOr[PerformanceInsightsMetricQuery]
  }

  object PerformanceInsightsReferenceMetric {
    @inline
    def apply(
        MetricQuery: js.UndefOr[PerformanceInsightsMetricQuery] = js.undefined
    ): PerformanceInsightsReferenceMetric = {
      val __obj = js.Dynamic.literal()
      MetricQuery.foreach(__v => __obj.updateDynamic("MetricQuery")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PerformanceInsightsReferenceMetric]
    }
  }

  /** A reference value to compare Performance Insights metrics against to determine if the metrics demonstrate anomalous behavior.
    */
  @js.native
  trait PerformanceInsightsReferenceScalar extends js.Object {
    var Value: js.UndefOr[PerformanceInsightsValueDouble]
  }

  object PerformanceInsightsReferenceScalar {
    @inline
    def apply(
        Value: js.UndefOr[PerformanceInsightsValueDouble] = js.undefined
    ): PerformanceInsightsReferenceScalar = {
      val __obj = js.Dynamic.literal()
      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PerformanceInsightsReferenceScalar]
    }
  }

  /** A statistic in a Performance Insights collection.
    */
  @js.native
  trait PerformanceInsightsStat extends js.Object {
    var Type: js.UndefOr[PerformanceInsightsStatType]
    var Value: js.UndefOr[PerformanceInsightsValueDouble]
  }

  object PerformanceInsightsStat {
    @inline
    def apply(
        Type: js.UndefOr[PerformanceInsightsStatType] = js.undefined,
        Value: js.UndefOr[PerformanceInsightsValueDouble] = js.undefined
    ): PerformanceInsightsStat = {
      val __obj = js.Dynamic.literal()
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PerformanceInsightsStat]
    }
  }

  /** The time range during which anomalous behavior in a proactive anomaly or an insight is expected to occur.
    */
  @js.native
  trait PredictionTimeRange extends js.Object {
    var StartTime: Timestamp
    var EndTime: js.UndefOr[Timestamp]
  }

  object PredictionTimeRange {
    @inline
    def apply(
        StartTime: Timestamp,
        EndTime: js.UndefOr[Timestamp] = js.undefined
    ): PredictionTimeRange = {
      val __obj = js.Dynamic.literal(
        "StartTime" -> StartTime.asInstanceOf[js.Any]
      )

      EndTime.foreach(__v => __obj.updateDynamic("EndTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PredictionTimeRange]
    }
  }

  /** Information about an anomaly. This object is returned by <code>ListAnomalies</code>.
    */
  @js.native
  trait ProactiveAnomaly extends js.Object {
    var AnomalyReportedTimeRange: js.UndefOr[AnomalyReportedTimeRange]
    var AnomalyTimeRange: js.UndefOr[AnomalyTimeRange]
    var AssociatedInsightId: js.UndefOr[InsightId]
    var Id: js.UndefOr[AnomalyId]
    var Limit: js.UndefOr[AnomalyLimit]
    var PredictionTimeRange: js.UndefOr[PredictionTimeRange]
    var ResourceCollection: js.UndefOr[ResourceCollection]
    var Severity: js.UndefOr[AnomalySeverity]
    var SourceDetails: js.UndefOr[AnomalySourceDetails]
    var Status: js.UndefOr[AnomalyStatus]
    var UpdateTime: js.UndefOr[Timestamp]
  }

  object ProactiveAnomaly {
    @inline
    def apply(
        AnomalyReportedTimeRange: js.UndefOr[AnomalyReportedTimeRange] = js.undefined,
        AnomalyTimeRange: js.UndefOr[AnomalyTimeRange] = js.undefined,
        AssociatedInsightId: js.UndefOr[InsightId] = js.undefined,
        Id: js.UndefOr[AnomalyId] = js.undefined,
        Limit: js.UndefOr[AnomalyLimit] = js.undefined,
        PredictionTimeRange: js.UndefOr[PredictionTimeRange] = js.undefined,
        ResourceCollection: js.UndefOr[ResourceCollection] = js.undefined,
        Severity: js.UndefOr[AnomalySeverity] = js.undefined,
        SourceDetails: js.UndefOr[AnomalySourceDetails] = js.undefined,
        Status: js.UndefOr[AnomalyStatus] = js.undefined,
        UpdateTime: js.UndefOr[Timestamp] = js.undefined
    ): ProactiveAnomaly = {
      val __obj = js.Dynamic.literal()
      AnomalyReportedTimeRange.foreach(__v => __obj.updateDynamic("AnomalyReportedTimeRange")(__v.asInstanceOf[js.Any]))
      AnomalyTimeRange.foreach(__v => __obj.updateDynamic("AnomalyTimeRange")(__v.asInstanceOf[js.Any]))
      AssociatedInsightId.foreach(__v => __obj.updateDynamic("AssociatedInsightId")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      Limit.foreach(__v => __obj.updateDynamic("Limit")(__v.asInstanceOf[js.Any]))
      PredictionTimeRange.foreach(__v => __obj.updateDynamic("PredictionTimeRange")(__v.asInstanceOf[js.Any]))
      ResourceCollection.foreach(__v => __obj.updateDynamic("ResourceCollection")(__v.asInstanceOf[js.Any]))
      Severity.foreach(__v => __obj.updateDynamic("Severity")(__v.asInstanceOf[js.Any]))
      SourceDetails.foreach(__v => __obj.updateDynamic("SourceDetails")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      UpdateTime.foreach(__v => __obj.updateDynamic("UpdateTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ProactiveAnomaly]
    }
  }

  /** Details about a proactive anomaly. This object is returned by <code>DescribeAnomaly.</code>
    */
  @js.native
  trait ProactiveAnomalySummary extends js.Object {
    var AnomalyReportedTimeRange: js.UndefOr[AnomalyReportedTimeRange]
    var AnomalyTimeRange: js.UndefOr[AnomalyTimeRange]
    var AssociatedInsightId: js.UndefOr[InsightId]
    var Id: js.UndefOr[AnomalyId]
    var Limit: js.UndefOr[AnomalyLimit]
    var PredictionTimeRange: js.UndefOr[PredictionTimeRange]
    var ResourceCollection: js.UndefOr[ResourceCollection]
    var Severity: js.UndefOr[AnomalySeverity]
    var SourceDetails: js.UndefOr[AnomalySourceDetails]
    var Status: js.UndefOr[AnomalyStatus]
    var UpdateTime: js.UndefOr[Timestamp]
  }

  object ProactiveAnomalySummary {
    @inline
    def apply(
        AnomalyReportedTimeRange: js.UndefOr[AnomalyReportedTimeRange] = js.undefined,
        AnomalyTimeRange: js.UndefOr[AnomalyTimeRange] = js.undefined,
        AssociatedInsightId: js.UndefOr[InsightId] = js.undefined,
        Id: js.UndefOr[AnomalyId] = js.undefined,
        Limit: js.UndefOr[AnomalyLimit] = js.undefined,
        PredictionTimeRange: js.UndefOr[PredictionTimeRange] = js.undefined,
        ResourceCollection: js.UndefOr[ResourceCollection] = js.undefined,
        Severity: js.UndefOr[AnomalySeverity] = js.undefined,
        SourceDetails: js.UndefOr[AnomalySourceDetails] = js.undefined,
        Status: js.UndefOr[AnomalyStatus] = js.undefined,
        UpdateTime: js.UndefOr[Timestamp] = js.undefined
    ): ProactiveAnomalySummary = {
      val __obj = js.Dynamic.literal()
      AnomalyReportedTimeRange.foreach(__v => __obj.updateDynamic("AnomalyReportedTimeRange")(__v.asInstanceOf[js.Any]))
      AnomalyTimeRange.foreach(__v => __obj.updateDynamic("AnomalyTimeRange")(__v.asInstanceOf[js.Any]))
      AssociatedInsightId.foreach(__v => __obj.updateDynamic("AssociatedInsightId")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      Limit.foreach(__v => __obj.updateDynamic("Limit")(__v.asInstanceOf[js.Any]))
      PredictionTimeRange.foreach(__v => __obj.updateDynamic("PredictionTimeRange")(__v.asInstanceOf[js.Any]))
      ResourceCollection.foreach(__v => __obj.updateDynamic("ResourceCollection")(__v.asInstanceOf[js.Any]))
      Severity.foreach(__v => __obj.updateDynamic("Severity")(__v.asInstanceOf[js.Any]))
      SourceDetails.foreach(__v => __obj.updateDynamic("SourceDetails")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      UpdateTime.foreach(__v => __obj.updateDynamic("UpdateTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ProactiveAnomalySummary]
    }
  }

  /** Details about a proactive insight. This object is returned by <code>ListInsights</code>.
    */
  @js.native
  trait ProactiveInsight extends js.Object {
    var Id: js.UndefOr[InsightId]
    var InsightTimeRange: js.UndefOr[InsightTimeRange]
    var Name: js.UndefOr[InsightName]
    var PredictionTimeRange: js.UndefOr[PredictionTimeRange]
    var ResourceCollection: js.UndefOr[ResourceCollection]
    var Severity: js.UndefOr[InsightSeverity]
    var SsmOpsItemId: js.UndefOr[SsmOpsItemId]
    var Status: js.UndefOr[InsightStatus]
  }

  object ProactiveInsight {
    @inline
    def apply(
        Id: js.UndefOr[InsightId] = js.undefined,
        InsightTimeRange: js.UndefOr[InsightTimeRange] = js.undefined,
        Name: js.UndefOr[InsightName] = js.undefined,
        PredictionTimeRange: js.UndefOr[PredictionTimeRange] = js.undefined,
        ResourceCollection: js.UndefOr[ResourceCollection] = js.undefined,
        Severity: js.UndefOr[InsightSeverity] = js.undefined,
        SsmOpsItemId: js.UndefOr[SsmOpsItemId] = js.undefined,
        Status: js.UndefOr[InsightStatus] = js.undefined
    ): ProactiveInsight = {
      val __obj = js.Dynamic.literal()
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      InsightTimeRange.foreach(__v => __obj.updateDynamic("InsightTimeRange")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      PredictionTimeRange.foreach(__v => __obj.updateDynamic("PredictionTimeRange")(__v.asInstanceOf[js.Any]))
      ResourceCollection.foreach(__v => __obj.updateDynamic("ResourceCollection")(__v.asInstanceOf[js.Any]))
      Severity.foreach(__v => __obj.updateDynamic("Severity")(__v.asInstanceOf[js.Any]))
      SsmOpsItemId.foreach(__v => __obj.updateDynamic("SsmOpsItemId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ProactiveInsight]
    }
  }

  /** Details about a proactive insight. This object is returned by <code>DescribeInsight.</code>
    */
  @js.native
  trait ProactiveInsightSummary extends js.Object {
    var AssociatedResourceArns: js.UndefOr[AssociatedResourceArns]
    var Id: js.UndefOr[InsightId]
    var InsightTimeRange: js.UndefOr[InsightTimeRange]
    var Name: js.UndefOr[InsightName]
    var PredictionTimeRange: js.UndefOr[PredictionTimeRange]
    var ResourceCollection: js.UndefOr[ResourceCollection]
    var ServiceCollection: js.UndefOr[ServiceCollection]
    var Severity: js.UndefOr[InsightSeverity]
    var Status: js.UndefOr[InsightStatus]
  }

  object ProactiveInsightSummary {
    @inline
    def apply(
        AssociatedResourceArns: js.UndefOr[AssociatedResourceArns] = js.undefined,
        Id: js.UndefOr[InsightId] = js.undefined,
        InsightTimeRange: js.UndefOr[InsightTimeRange] = js.undefined,
        Name: js.UndefOr[InsightName] = js.undefined,
        PredictionTimeRange: js.UndefOr[PredictionTimeRange] = js.undefined,
        ResourceCollection: js.UndefOr[ResourceCollection] = js.undefined,
        ServiceCollection: js.UndefOr[ServiceCollection] = js.undefined,
        Severity: js.UndefOr[InsightSeverity] = js.undefined,
        Status: js.UndefOr[InsightStatus] = js.undefined
    ): ProactiveInsightSummary = {
      val __obj = js.Dynamic.literal()
      AssociatedResourceArns.foreach(__v => __obj.updateDynamic("AssociatedResourceArns")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      InsightTimeRange.foreach(__v => __obj.updateDynamic("InsightTimeRange")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      PredictionTimeRange.foreach(__v => __obj.updateDynamic("PredictionTimeRange")(__v.asInstanceOf[js.Any]))
      ResourceCollection.foreach(__v => __obj.updateDynamic("ResourceCollection")(__v.asInstanceOf[js.Any]))
      ServiceCollection.foreach(__v => __obj.updateDynamic("ServiceCollection")(__v.asInstanceOf[js.Any]))
      Severity.foreach(__v => __obj.updateDynamic("Severity")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ProactiveInsightSummary]
    }
  }

  /** Details about a proactive insight. This object is returned by <code>DescribeInsight</code>.
    */
  @js.native
  trait ProactiveOrganizationInsightSummary extends js.Object {
    var AccountId: js.UndefOr[AwsAccountId]
    var Id: js.UndefOr[InsightId]
    var InsightTimeRange: js.UndefOr[InsightTimeRange]
    var Name: js.UndefOr[InsightName]
    var OrganizationalUnitId: js.UndefOr[OrganizationalUnitId]
    var PredictionTimeRange: js.UndefOr[PredictionTimeRange]
    var ResourceCollection: js.UndefOr[ResourceCollection]
    var ServiceCollection: js.UndefOr[ServiceCollection]
    var Severity: js.UndefOr[InsightSeverity]
    var Status: js.UndefOr[InsightStatus]
  }

  object ProactiveOrganizationInsightSummary {
    @inline
    def apply(
        AccountId: js.UndefOr[AwsAccountId] = js.undefined,
        Id: js.UndefOr[InsightId] = js.undefined,
        InsightTimeRange: js.UndefOr[InsightTimeRange] = js.undefined,
        Name: js.UndefOr[InsightName] = js.undefined,
        OrganizationalUnitId: js.UndefOr[OrganizationalUnitId] = js.undefined,
        PredictionTimeRange: js.UndefOr[PredictionTimeRange] = js.undefined,
        ResourceCollection: js.UndefOr[ResourceCollection] = js.undefined,
        ServiceCollection: js.UndefOr[ServiceCollection] = js.undefined,
        Severity: js.UndefOr[InsightSeverity] = js.undefined,
        Status: js.UndefOr[InsightStatus] = js.undefined
    ): ProactiveOrganizationInsightSummary = {
      val __obj = js.Dynamic.literal()
      AccountId.foreach(__v => __obj.updateDynamic("AccountId")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      InsightTimeRange.foreach(__v => __obj.updateDynamic("InsightTimeRange")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      OrganizationalUnitId.foreach(__v => __obj.updateDynamic("OrganizationalUnitId")(__v.asInstanceOf[js.Any]))
      PredictionTimeRange.foreach(__v => __obj.updateDynamic("PredictionTimeRange")(__v.asInstanceOf[js.Any]))
      ResourceCollection.foreach(__v => __obj.updateDynamic("ResourceCollection")(__v.asInstanceOf[js.Any]))
      ServiceCollection.foreach(__v => __obj.updateDynamic("ServiceCollection")(__v.asInstanceOf[js.Any]))
      Severity.foreach(__v => __obj.updateDynamic("Severity")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ProactiveOrganizationInsightSummary]
    }
  }

  @js.native
  trait PutFeedbackRequest extends js.Object {
    var InsightFeedback: js.UndefOr[InsightFeedback]
  }

  object PutFeedbackRequest {
    @inline
    def apply(
        InsightFeedback: js.UndefOr[InsightFeedback] = js.undefined
    ): PutFeedbackRequest = {
      val __obj = js.Dynamic.literal()
      InsightFeedback.foreach(__v => __obj.updateDynamic("InsightFeedback")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutFeedbackRequest]
    }
  }

  @js.native
  trait PutFeedbackResponse extends js.Object

  object PutFeedbackResponse {
    @inline
    def apply(): PutFeedbackResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PutFeedbackResponse]
    }
  }

  /** Details about a reactive anomaly. This object is returned by <code>ListAnomalies</code>.
    */
  @js.native
  trait ReactiveAnomaly extends js.Object {
    var AnomalyReportedTimeRange: js.UndefOr[AnomalyReportedTimeRange]
    var AnomalyResources: js.UndefOr[AnomalyResources]
    var AnomalyTimeRange: js.UndefOr[AnomalyTimeRange]
    var AssociatedInsightId: js.UndefOr[InsightId]
    var CausalAnomalyId: js.UndefOr[AnomalyId]
    var Description: js.UndefOr[AnomalyDescription]
    var Id: js.UndefOr[AnomalyId]
    var Name: js.UndefOr[AnomalyName]
    var ResourceCollection: js.UndefOr[ResourceCollection]
    var Severity: js.UndefOr[AnomalySeverity]
    var SourceDetails: js.UndefOr[AnomalySourceDetails]
    var Status: js.UndefOr[AnomalyStatus]
    var Type: js.UndefOr[AnomalyType]
  }

  object ReactiveAnomaly {
    @inline
    def apply(
        AnomalyReportedTimeRange: js.UndefOr[AnomalyReportedTimeRange] = js.undefined,
        AnomalyResources: js.UndefOr[AnomalyResources] = js.undefined,
        AnomalyTimeRange: js.UndefOr[AnomalyTimeRange] = js.undefined,
        AssociatedInsightId: js.UndefOr[InsightId] = js.undefined,
        CausalAnomalyId: js.UndefOr[AnomalyId] = js.undefined,
        Description: js.UndefOr[AnomalyDescription] = js.undefined,
        Id: js.UndefOr[AnomalyId] = js.undefined,
        Name: js.UndefOr[AnomalyName] = js.undefined,
        ResourceCollection: js.UndefOr[ResourceCollection] = js.undefined,
        Severity: js.UndefOr[AnomalySeverity] = js.undefined,
        SourceDetails: js.UndefOr[AnomalySourceDetails] = js.undefined,
        Status: js.UndefOr[AnomalyStatus] = js.undefined,
        Type: js.UndefOr[AnomalyType] = js.undefined
    ): ReactiveAnomaly = {
      val __obj = js.Dynamic.literal()
      AnomalyReportedTimeRange.foreach(__v => __obj.updateDynamic("AnomalyReportedTimeRange")(__v.asInstanceOf[js.Any]))
      AnomalyResources.foreach(__v => __obj.updateDynamic("AnomalyResources")(__v.asInstanceOf[js.Any]))
      AnomalyTimeRange.foreach(__v => __obj.updateDynamic("AnomalyTimeRange")(__v.asInstanceOf[js.Any]))
      AssociatedInsightId.foreach(__v => __obj.updateDynamic("AssociatedInsightId")(__v.asInstanceOf[js.Any]))
      CausalAnomalyId.foreach(__v => __obj.updateDynamic("CausalAnomalyId")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      ResourceCollection.foreach(__v => __obj.updateDynamic("ResourceCollection")(__v.asInstanceOf[js.Any]))
      Severity.foreach(__v => __obj.updateDynamic("Severity")(__v.asInstanceOf[js.Any]))
      SourceDetails.foreach(__v => __obj.updateDynamic("SourceDetails")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ReactiveAnomaly]
    }
  }

  /** Details about a reactive anomaly. This object is returned by <code>DescribeAnomaly.</code>
    */
  @js.native
  trait ReactiveAnomalySummary extends js.Object {
    var AnomalyReportedTimeRange: js.UndefOr[AnomalyReportedTimeRange]
    var AnomalyResources: js.UndefOr[AnomalyResources]
    var AnomalyTimeRange: js.UndefOr[AnomalyTimeRange]
    var AssociatedInsightId: js.UndefOr[InsightId]
    var CausalAnomalyId: js.UndefOr[AnomalyId]
    var Description: js.UndefOr[AnomalyDescription]
    var Id: js.UndefOr[AnomalyId]
    var Name: js.UndefOr[AnomalyName]
    var ResourceCollection: js.UndefOr[ResourceCollection]
    var Severity: js.UndefOr[AnomalySeverity]
    var SourceDetails: js.UndefOr[AnomalySourceDetails]
    var Status: js.UndefOr[AnomalyStatus]
    var Type: js.UndefOr[AnomalyType]
  }

  object ReactiveAnomalySummary {
    @inline
    def apply(
        AnomalyReportedTimeRange: js.UndefOr[AnomalyReportedTimeRange] = js.undefined,
        AnomalyResources: js.UndefOr[AnomalyResources] = js.undefined,
        AnomalyTimeRange: js.UndefOr[AnomalyTimeRange] = js.undefined,
        AssociatedInsightId: js.UndefOr[InsightId] = js.undefined,
        CausalAnomalyId: js.UndefOr[AnomalyId] = js.undefined,
        Description: js.UndefOr[AnomalyDescription] = js.undefined,
        Id: js.UndefOr[AnomalyId] = js.undefined,
        Name: js.UndefOr[AnomalyName] = js.undefined,
        ResourceCollection: js.UndefOr[ResourceCollection] = js.undefined,
        Severity: js.UndefOr[AnomalySeverity] = js.undefined,
        SourceDetails: js.UndefOr[AnomalySourceDetails] = js.undefined,
        Status: js.UndefOr[AnomalyStatus] = js.undefined,
        Type: js.UndefOr[AnomalyType] = js.undefined
    ): ReactiveAnomalySummary = {
      val __obj = js.Dynamic.literal()
      AnomalyReportedTimeRange.foreach(__v => __obj.updateDynamic("AnomalyReportedTimeRange")(__v.asInstanceOf[js.Any]))
      AnomalyResources.foreach(__v => __obj.updateDynamic("AnomalyResources")(__v.asInstanceOf[js.Any]))
      AnomalyTimeRange.foreach(__v => __obj.updateDynamic("AnomalyTimeRange")(__v.asInstanceOf[js.Any]))
      AssociatedInsightId.foreach(__v => __obj.updateDynamic("AssociatedInsightId")(__v.asInstanceOf[js.Any]))
      CausalAnomalyId.foreach(__v => __obj.updateDynamic("CausalAnomalyId")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      ResourceCollection.foreach(__v => __obj.updateDynamic("ResourceCollection")(__v.asInstanceOf[js.Any]))
      Severity.foreach(__v => __obj.updateDynamic("Severity")(__v.asInstanceOf[js.Any]))
      SourceDetails.foreach(__v => __obj.updateDynamic("SourceDetails")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ReactiveAnomalySummary]
    }
  }

  /** Information about a reactive insight. This object is returned by <code>ListInsights</code>.
    */
  @js.native
  trait ReactiveInsight extends js.Object {
    var Id: js.UndefOr[InsightId]
    var InsightTimeRange: js.UndefOr[InsightTimeRange]
    var Name: js.UndefOr[InsightName]
    var ResourceCollection: js.UndefOr[ResourceCollection]
    var Severity: js.UndefOr[InsightSeverity]
    var SsmOpsItemId: js.UndefOr[SsmOpsItemId]
    var Status: js.UndefOr[InsightStatus]
  }

  object ReactiveInsight {
    @inline
    def apply(
        Id: js.UndefOr[InsightId] = js.undefined,
        InsightTimeRange: js.UndefOr[InsightTimeRange] = js.undefined,
        Name: js.UndefOr[InsightName] = js.undefined,
        ResourceCollection: js.UndefOr[ResourceCollection] = js.undefined,
        Severity: js.UndefOr[InsightSeverity] = js.undefined,
        SsmOpsItemId: js.UndefOr[SsmOpsItemId] = js.undefined,
        Status: js.UndefOr[InsightStatus] = js.undefined
    ): ReactiveInsight = {
      val __obj = js.Dynamic.literal()
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      InsightTimeRange.foreach(__v => __obj.updateDynamic("InsightTimeRange")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      ResourceCollection.foreach(__v => __obj.updateDynamic("ResourceCollection")(__v.asInstanceOf[js.Any]))
      Severity.foreach(__v => __obj.updateDynamic("Severity")(__v.asInstanceOf[js.Any]))
      SsmOpsItemId.foreach(__v => __obj.updateDynamic("SsmOpsItemId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ReactiveInsight]
    }
  }

  /** Information about a reactive insight. This object is returned by <code>DescribeInsight.</code>
    */
  @js.native
  trait ReactiveInsightSummary extends js.Object {
    var AssociatedResourceArns: js.UndefOr[AssociatedResourceArns]
    var Id: js.UndefOr[InsightId]
    var InsightTimeRange: js.UndefOr[InsightTimeRange]
    var Name: js.UndefOr[InsightName]
    var ResourceCollection: js.UndefOr[ResourceCollection]
    var ServiceCollection: js.UndefOr[ServiceCollection]
    var Severity: js.UndefOr[InsightSeverity]
    var Status: js.UndefOr[InsightStatus]
  }

  object ReactiveInsightSummary {
    @inline
    def apply(
        AssociatedResourceArns: js.UndefOr[AssociatedResourceArns] = js.undefined,
        Id: js.UndefOr[InsightId] = js.undefined,
        InsightTimeRange: js.UndefOr[InsightTimeRange] = js.undefined,
        Name: js.UndefOr[InsightName] = js.undefined,
        ResourceCollection: js.UndefOr[ResourceCollection] = js.undefined,
        ServiceCollection: js.UndefOr[ServiceCollection] = js.undefined,
        Severity: js.UndefOr[InsightSeverity] = js.undefined,
        Status: js.UndefOr[InsightStatus] = js.undefined
    ): ReactiveInsightSummary = {
      val __obj = js.Dynamic.literal()
      AssociatedResourceArns.foreach(__v => __obj.updateDynamic("AssociatedResourceArns")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      InsightTimeRange.foreach(__v => __obj.updateDynamic("InsightTimeRange")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      ResourceCollection.foreach(__v => __obj.updateDynamic("ResourceCollection")(__v.asInstanceOf[js.Any]))
      ServiceCollection.foreach(__v => __obj.updateDynamic("ServiceCollection")(__v.asInstanceOf[js.Any]))
      Severity.foreach(__v => __obj.updateDynamic("Severity")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ReactiveInsightSummary]
    }
  }

  /** Information about a reactive insight. This object is returned by <code>DescribeInsight</code>.
    */
  @js.native
  trait ReactiveOrganizationInsightSummary extends js.Object {
    var AccountId: js.UndefOr[AwsAccountId]
    var Id: js.UndefOr[InsightId]
    var InsightTimeRange: js.UndefOr[InsightTimeRange]
    var Name: js.UndefOr[InsightName]
    var OrganizationalUnitId: js.UndefOr[OrganizationalUnitId]
    var ResourceCollection: js.UndefOr[ResourceCollection]
    var ServiceCollection: js.UndefOr[ServiceCollection]
    var Severity: js.UndefOr[InsightSeverity]
    var Status: js.UndefOr[InsightStatus]
  }

  object ReactiveOrganizationInsightSummary {
    @inline
    def apply(
        AccountId: js.UndefOr[AwsAccountId] = js.undefined,
        Id: js.UndefOr[InsightId] = js.undefined,
        InsightTimeRange: js.UndefOr[InsightTimeRange] = js.undefined,
        Name: js.UndefOr[InsightName] = js.undefined,
        OrganizationalUnitId: js.UndefOr[OrganizationalUnitId] = js.undefined,
        ResourceCollection: js.UndefOr[ResourceCollection] = js.undefined,
        ServiceCollection: js.UndefOr[ServiceCollection] = js.undefined,
        Severity: js.UndefOr[InsightSeverity] = js.undefined,
        Status: js.UndefOr[InsightStatus] = js.undefined
    ): ReactiveOrganizationInsightSummary = {
      val __obj = js.Dynamic.literal()
      AccountId.foreach(__v => __obj.updateDynamic("AccountId")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      InsightTimeRange.foreach(__v => __obj.updateDynamic("InsightTimeRange")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      OrganizationalUnitId.foreach(__v => __obj.updateDynamic("OrganizationalUnitId")(__v.asInstanceOf[js.Any]))
      ResourceCollection.foreach(__v => __obj.updateDynamic("ResourceCollection")(__v.asInstanceOf[js.Any]))
      ServiceCollection.foreach(__v => __obj.updateDynamic("ServiceCollection")(__v.asInstanceOf[js.Any]))
      Severity.foreach(__v => __obj.updateDynamic("Severity")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ReactiveOrganizationInsightSummary]
    }
  }

  /** Recommendation information to help you remediate detected anomalous behavior that generated an insight.
    */
  @js.native
  trait Recommendation extends js.Object {
    var Description: js.UndefOr[RecommendationDescription]
    var Link: js.UndefOr[RecommendationLink]
    var Name: js.UndefOr[RecommendationName]
    var Reason: js.UndefOr[RecommendationReason]
    var RelatedAnomalies: js.UndefOr[RecommendationRelatedAnomalies]
    var RelatedEvents: js.UndefOr[RecommendationRelatedEvents]
  }

  object Recommendation {
    @inline
    def apply(
        Description: js.UndefOr[RecommendationDescription] = js.undefined,
        Link: js.UndefOr[RecommendationLink] = js.undefined,
        Name: js.UndefOr[RecommendationName] = js.undefined,
        Reason: js.UndefOr[RecommendationReason] = js.undefined,
        RelatedAnomalies: js.UndefOr[RecommendationRelatedAnomalies] = js.undefined,
        RelatedEvents: js.UndefOr[RecommendationRelatedEvents] = js.undefined
    ): Recommendation = {
      val __obj = js.Dynamic.literal()
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Link.foreach(__v => __obj.updateDynamic("Link")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Reason.foreach(__v => __obj.updateDynamic("Reason")(__v.asInstanceOf[js.Any]))
      RelatedAnomalies.foreach(__v => __obj.updateDynamic("RelatedAnomalies")(__v.asInstanceOf[js.Any]))
      RelatedEvents.foreach(__v => __obj.updateDynamic("RelatedEvents")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Recommendation]
    }
  }

  /** Information about an anomaly that is related to a recommendation.
    */
  @js.native
  trait RecommendationRelatedAnomaly extends js.Object {
    var AnomalyId: js.UndefOr[AnomalyId]
    var Resources: js.UndefOr[RecommendationRelatedAnomalyResources]
    var SourceDetails: js.UndefOr[RelatedAnomalySourceDetails]
  }

  object RecommendationRelatedAnomaly {
    @inline
    def apply(
        AnomalyId: js.UndefOr[AnomalyId] = js.undefined,
        Resources: js.UndefOr[RecommendationRelatedAnomalyResources] = js.undefined,
        SourceDetails: js.UndefOr[RelatedAnomalySourceDetails] = js.undefined
    ): RecommendationRelatedAnomaly = {
      val __obj = js.Dynamic.literal()
      AnomalyId.foreach(__v => __obj.updateDynamic("AnomalyId")(__v.asInstanceOf[js.Any]))
      Resources.foreach(__v => __obj.updateDynamic("Resources")(__v.asInstanceOf[js.Any]))
      SourceDetails.foreach(__v => __obj.updateDynamic("SourceDetails")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RecommendationRelatedAnomaly]
    }
  }

  /** Information about a resource in which DevOps Guru detected anomalous behavior.
    */
  @js.native
  trait RecommendationRelatedAnomalyResource extends js.Object {
    var Name: js.UndefOr[RecommendationRelatedAnomalyResourceName]
    var Type: js.UndefOr[RecommendationRelatedAnomalyResourceType]
  }

  object RecommendationRelatedAnomalyResource {
    @inline
    def apply(
        Name: js.UndefOr[RecommendationRelatedAnomalyResourceName] = js.undefined,
        Type: js.UndefOr[RecommendationRelatedAnomalyResourceType] = js.undefined
    ): RecommendationRelatedAnomalyResource = {
      val __obj = js.Dynamic.literal()
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RecommendationRelatedAnomalyResource]
    }
  }

  /** Contains an array of <code>RecommendationRelatedCloudWatchMetricsSourceDetail</code> objects that contain the name and namespace of an Amazon CloudWatch metric.
    */
  @js.native
  trait RecommendationRelatedAnomalySourceDetail extends js.Object {
    var CloudWatchMetrics: js.UndefOr[RecommendationRelatedCloudWatchMetricsSourceDetails]
  }

  object RecommendationRelatedAnomalySourceDetail {
    @inline
    def apply(
        CloudWatchMetrics: js.UndefOr[RecommendationRelatedCloudWatchMetricsSourceDetails] = js.undefined
    ): RecommendationRelatedAnomalySourceDetail = {
      val __obj = js.Dynamic.literal()
      CloudWatchMetrics.foreach(__v => __obj.updateDynamic("CloudWatchMetrics")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RecommendationRelatedAnomalySourceDetail]
    }
  }

  /** Information about an Amazon CloudWatch metric that is analyzed by DevOps Guru. It is one of many analyzed metrics that are used to generate insights.
    */
  @js.native
  trait RecommendationRelatedCloudWatchMetricsSourceDetail extends js.Object {
    var MetricName: js.UndefOr[RecommendationRelatedCloudWatchMetricsSourceMetricName]
    var Namespace: js.UndefOr[RecommendationRelatedCloudWatchMetricsSourceNamespace]
  }

  object RecommendationRelatedCloudWatchMetricsSourceDetail {
    @inline
    def apply(
        MetricName: js.UndefOr[RecommendationRelatedCloudWatchMetricsSourceMetricName] = js.undefined,
        Namespace: js.UndefOr[RecommendationRelatedCloudWatchMetricsSourceNamespace] = js.undefined
    ): RecommendationRelatedCloudWatchMetricsSourceDetail = {
      val __obj = js.Dynamic.literal()
      MetricName.foreach(__v => __obj.updateDynamic("MetricName")(__v.asInstanceOf[js.Any]))
      Namespace.foreach(__v => __obj.updateDynamic("Namespace")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RecommendationRelatedCloudWatchMetricsSourceDetail]
    }
  }

  /** Information about an event that is related to a recommendation.
    */
  @js.native
  trait RecommendationRelatedEvent extends js.Object {
    var Name: js.UndefOr[RecommendationRelatedEventName]
    var Resources: js.UndefOr[RecommendationRelatedEventResources]
  }

  object RecommendationRelatedEvent {
    @inline
    def apply(
        Name: js.UndefOr[RecommendationRelatedEventName] = js.undefined,
        Resources: js.UndefOr[RecommendationRelatedEventResources] = js.undefined
    ): RecommendationRelatedEvent = {
      val __obj = js.Dynamic.literal()
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Resources.foreach(__v => __obj.updateDynamic("Resources")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RecommendationRelatedEvent]
    }
  }

  /** Information about an Amazon Web Services resource that emitted and event that is related to a recommendation in an insight.
    */
  @js.native
  trait RecommendationRelatedEventResource extends js.Object {
    var Name: js.UndefOr[RecommendationRelatedEventResourceName]
    var Type: js.UndefOr[RecommendationRelatedEventResourceType]
  }

  object RecommendationRelatedEventResource {
    @inline
    def apply(
        Name: js.UndefOr[RecommendationRelatedEventResourceName] = js.undefined,
        Type: js.UndefOr[RecommendationRelatedEventResourceType] = js.undefined
    ): RecommendationRelatedEventResource = {
      val __obj = js.Dynamic.literal()
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RecommendationRelatedEventResource]
    }
  }

  @js.native
  trait RemoveNotificationChannelRequest extends js.Object {
    var Id: NotificationChannelId
  }

  object RemoveNotificationChannelRequest {
    @inline
    def apply(
        Id: NotificationChannelId
    ): RemoveNotificationChannelRequest = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[RemoveNotificationChannelRequest]
    }
  }

  @js.native
  trait RemoveNotificationChannelResponse extends js.Object

  object RemoveNotificationChannelResponse {
    @inline
    def apply(): RemoveNotificationChannelResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RemoveNotificationChannelResponse]
    }
  }

  /** A collection of Amazon Web Services resources supported by DevOps Guru. The two types of Amazon Web Services resource collections supported are Amazon Web Services CloudFormation stacks and Amazon Web Services resources that contain the same Amazon Web Services tag. DevOps Guru can be configured to analyze the Amazon Web Services resources that are defined in the stacks or that are tagged using the same tag <i>key</i>. You can specify up to 500 Amazon Web Services CloudFormation stacks.
    */
  @js.native
  trait ResourceCollection extends js.Object {
    var CloudFormation: js.UndefOr[CloudFormationCollection]
    var Tags: js.UndefOr[TagCollections]
  }

  object ResourceCollection {
    @inline
    def apply(
        CloudFormation: js.UndefOr[CloudFormationCollection] = js.undefined,
        Tags: js.UndefOr[TagCollections] = js.undefined
    ): ResourceCollection = {
      val __obj = js.Dynamic.literal()
      CloudFormation.foreach(__v => __obj.updateDynamic("CloudFormation")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResourceCollection]
    }
  }

  /** Information about a filter used to specify which Amazon Web Services resources are analyzed for anomalous behavior by DevOps Guru.
    */
  @js.native
  trait ResourceCollectionFilter extends js.Object {
    var CloudFormation: js.UndefOr[CloudFormationCollectionFilter]
    var Tags: js.UndefOr[TagCollectionFilters]
  }

  object ResourceCollectionFilter {
    @inline
    def apply(
        CloudFormation: js.UndefOr[CloudFormationCollectionFilter] = js.undefined,
        Tags: js.UndefOr[TagCollectionFilters] = js.undefined
    ): ResourceCollectionFilter = {
      val __obj = js.Dynamic.literal()
      CloudFormation.foreach(__v => __obj.updateDynamic("CloudFormation")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResourceCollectionFilter]
    }
  }

  /** Specifies one or more severity values and one or more status values that are used to search for insights.
    */
  @js.native
  trait SearchInsightsFilters extends js.Object {
    var ResourceCollection: js.UndefOr[ResourceCollection]
    var ServiceCollection: js.UndefOr[ServiceCollection]
    var Severities: js.UndefOr[InsightSeverities]
    var Statuses: js.UndefOr[InsightStatuses]
  }

  object SearchInsightsFilters {
    @inline
    def apply(
        ResourceCollection: js.UndefOr[ResourceCollection] = js.undefined,
        ServiceCollection: js.UndefOr[ServiceCollection] = js.undefined,
        Severities: js.UndefOr[InsightSeverities] = js.undefined,
        Statuses: js.UndefOr[InsightStatuses] = js.undefined
    ): SearchInsightsFilters = {
      val __obj = js.Dynamic.literal()
      ResourceCollection.foreach(__v => __obj.updateDynamic("ResourceCollection")(__v.asInstanceOf[js.Any]))
      ServiceCollection.foreach(__v => __obj.updateDynamic("ServiceCollection")(__v.asInstanceOf[js.Any]))
      Severities.foreach(__v => __obj.updateDynamic("Severities")(__v.asInstanceOf[js.Any]))
      Statuses.foreach(__v => __obj.updateDynamic("Statuses")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SearchInsightsFilters]
    }
  }

  @js.native
  trait SearchInsightsRequest extends js.Object {
    var StartTimeRange: StartTimeRange
    var Type: InsightType
    var Filters: js.UndefOr[SearchInsightsFilters]
    var MaxResults: js.UndefOr[SearchInsightsMaxResults]
    var NextToken: js.UndefOr[UuidNextToken]
  }

  object SearchInsightsRequest {
    @inline
    def apply(
        StartTimeRange: StartTimeRange,
        Type: InsightType,
        Filters: js.UndefOr[SearchInsightsFilters] = js.undefined,
        MaxResults: js.UndefOr[SearchInsightsMaxResults] = js.undefined,
        NextToken: js.UndefOr[UuidNextToken] = js.undefined
    ): SearchInsightsRequest = {
      val __obj = js.Dynamic.literal(
        "StartTimeRange" -> StartTimeRange.asInstanceOf[js.Any],
        "Type" -> Type.asInstanceOf[js.Any]
      )

      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SearchInsightsRequest]
    }
  }

  @js.native
  trait SearchInsightsResponse extends js.Object {
    var NextToken: js.UndefOr[UuidNextToken]
    var ProactiveInsights: js.UndefOr[ProactiveInsights]
    var ReactiveInsights: js.UndefOr[ReactiveInsights]
  }

  object SearchInsightsResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[UuidNextToken] = js.undefined,
        ProactiveInsights: js.UndefOr[ProactiveInsights] = js.undefined,
        ReactiveInsights: js.UndefOr[ReactiveInsights] = js.undefined
    ): SearchInsightsResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      ProactiveInsights.foreach(__v => __obj.updateDynamic("ProactiveInsights")(__v.asInstanceOf[js.Any]))
      ReactiveInsights.foreach(__v => __obj.updateDynamic("ReactiveInsights")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SearchInsightsResponse]
    }
  }

  /** Filters you can use to specify which events are returned when <code>ListEvents</code> is called.
    */
  @js.native
  trait SearchOrganizationInsightsFilters extends js.Object {
    var ResourceCollection: js.UndefOr[ResourceCollection]
    var ServiceCollection: js.UndefOr[ServiceCollection]
    var Severities: js.UndefOr[InsightSeverities]
    var Statuses: js.UndefOr[InsightStatuses]
  }

  object SearchOrganizationInsightsFilters {
    @inline
    def apply(
        ResourceCollection: js.UndefOr[ResourceCollection] = js.undefined,
        ServiceCollection: js.UndefOr[ServiceCollection] = js.undefined,
        Severities: js.UndefOr[InsightSeverities] = js.undefined,
        Statuses: js.UndefOr[InsightStatuses] = js.undefined
    ): SearchOrganizationInsightsFilters = {
      val __obj = js.Dynamic.literal()
      ResourceCollection.foreach(__v => __obj.updateDynamic("ResourceCollection")(__v.asInstanceOf[js.Any]))
      ServiceCollection.foreach(__v => __obj.updateDynamic("ServiceCollection")(__v.asInstanceOf[js.Any]))
      Severities.foreach(__v => __obj.updateDynamic("Severities")(__v.asInstanceOf[js.Any]))
      Statuses.foreach(__v => __obj.updateDynamic("Statuses")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SearchOrganizationInsightsFilters]
    }
  }

  @js.native
  trait SearchOrganizationInsightsRequest extends js.Object {
    var AccountIds: SearchInsightsAccountIdList
    var StartTimeRange: StartTimeRange
    var Type: InsightType
    var Filters: js.UndefOr[SearchOrganizationInsightsFilters]
    var MaxResults: js.UndefOr[SearchOrganizationInsightsMaxResults]
    var NextToken: js.UndefOr[UuidNextToken]
  }

  object SearchOrganizationInsightsRequest {
    @inline
    def apply(
        AccountIds: SearchInsightsAccountIdList,
        StartTimeRange: StartTimeRange,
        Type: InsightType,
        Filters: js.UndefOr[SearchOrganizationInsightsFilters] = js.undefined,
        MaxResults: js.UndefOr[SearchOrganizationInsightsMaxResults] = js.undefined,
        NextToken: js.UndefOr[UuidNextToken] = js.undefined
    ): SearchOrganizationInsightsRequest = {
      val __obj = js.Dynamic.literal(
        "AccountIds" -> AccountIds.asInstanceOf[js.Any],
        "StartTimeRange" -> StartTimeRange.asInstanceOf[js.Any],
        "Type" -> Type.asInstanceOf[js.Any]
      )

      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SearchOrganizationInsightsRequest]
    }
  }

  @js.native
  trait SearchOrganizationInsightsResponse extends js.Object {
    var NextToken: js.UndefOr[UuidNextToken]
    var ProactiveInsights: js.UndefOr[ProactiveInsights]
    var ReactiveInsights: js.UndefOr[ReactiveInsights]
  }

  object SearchOrganizationInsightsResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[UuidNextToken] = js.undefined,
        ProactiveInsights: js.UndefOr[ProactiveInsights] = js.undefined,
        ReactiveInsights: js.UndefOr[ReactiveInsights] = js.undefined
    ): SearchOrganizationInsightsResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      ProactiveInsights.foreach(__v => __obj.updateDynamic("ProactiveInsights")(__v.asInstanceOf[js.Any]))
      ReactiveInsights.foreach(__v => __obj.updateDynamic("ReactiveInsights")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SearchOrganizationInsightsResponse]
    }
  }

  /** A collection of the names of Amazon Web Services services.
    */
  @js.native
  trait ServiceCollection extends js.Object {
    var ServiceNames: js.UndefOr[ServiceNames]
  }

  object ServiceCollection {
    @inline
    def apply(
        ServiceNames: js.UndefOr[ServiceNames] = js.undefined
    ): ServiceCollection = {
      val __obj = js.Dynamic.literal()
      ServiceNames.foreach(__v => __obj.updateDynamic("ServiceNames")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ServiceCollection]
    }
  }

  /** Represents the health of an Amazon Web Services service.
    */
  @js.native
  trait ServiceHealth extends js.Object {
    var Insight: js.UndefOr[ServiceInsightHealth]
    var ServiceName: js.UndefOr[ServiceName]
  }

  object ServiceHealth {
    @inline
    def apply(
        Insight: js.UndefOr[ServiceInsightHealth] = js.undefined,
        ServiceName: js.UndefOr[ServiceName] = js.undefined
    ): ServiceHealth = {
      val __obj = js.Dynamic.literal()
      Insight.foreach(__v => __obj.updateDynamic("Insight")(__v.asInstanceOf[js.Any]))
      ServiceName.foreach(__v => __obj.updateDynamic("ServiceName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ServiceHealth]
    }
  }

  /** Contains the number of open proactive and reactive insights in an analyzed Amazon Web Services service.
    */
  @js.native
  trait ServiceInsightHealth extends js.Object {
    var OpenProactiveInsights: js.UndefOr[NumOpenProactiveInsights]
    var OpenReactiveInsights: js.UndefOr[NumOpenReactiveInsights]
  }

  object ServiceInsightHealth {
    @inline
    def apply(
        OpenProactiveInsights: js.UndefOr[NumOpenProactiveInsights] = js.undefined,
        OpenReactiveInsights: js.UndefOr[NumOpenReactiveInsights] = js.undefined
    ): ServiceInsightHealth = {
      val __obj = js.Dynamic.literal()
      OpenProactiveInsights.foreach(__v => __obj.updateDynamic("OpenProactiveInsights")(__v.asInstanceOf[js.Any]))
      OpenReactiveInsights.foreach(__v => __obj.updateDynamic("OpenReactiveInsights")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ServiceInsightHealth]
    }
  }

  /** Information about the integration of DevOps Guru with another Amazon Web Services service, such as Amazon Web Services Systems Manager.
    */
  @js.native
  trait ServiceIntegrationConfig extends js.Object {
    var OpsCenter: js.UndefOr[OpsCenterIntegration]
  }

  object ServiceIntegrationConfig {
    @inline
    def apply(
        OpsCenter: js.UndefOr[OpsCenterIntegration] = js.undefined
    ): ServiceIntegrationConfig = {
      val __obj = js.Dynamic.literal()
      OpsCenter.foreach(__v => __obj.updateDynamic("OpsCenter")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ServiceIntegrationConfig]
    }
  }

  /** An object that contains information about the estimated monthly cost to analyze an Amazon Web Services resource. For more information, see [[https://docs.aws.amazon.com/devops-guru/latest/userguide/cost-estimate.html|Estimate your Amazon DevOps Guru costs]] and [[http://aws.amazon.com/devops-guru/pricing/|Amazon DevOps Guru pricing]].
    */
  @js.native
  trait ServiceResourceCost extends js.Object {
    var Cost: js.UndefOr[Cost]
    var Count: js.UndefOr[CostEstimationServiceResourceCount]
    var State: js.UndefOr[CostEstimationServiceResourceState]
    var Type: js.UndefOr[ResourceType]
    var UnitCost: js.UndefOr[Cost]
  }

  object ServiceResourceCost {
    @inline
    def apply(
        Cost: js.UndefOr[Cost] = js.undefined,
        Count: js.UndefOr[CostEstimationServiceResourceCount] = js.undefined,
        State: js.UndefOr[CostEstimationServiceResourceState] = js.undefined,
        Type: js.UndefOr[ResourceType] = js.undefined,
        UnitCost: js.UndefOr[Cost] = js.undefined
    ): ServiceResourceCost = {
      val __obj = js.Dynamic.literal()
      Cost.foreach(__v => __obj.updateDynamic("Cost")(__v.asInstanceOf[js.Any]))
      Count.foreach(__v => __obj.updateDynamic("Count")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      UnitCost.foreach(__v => __obj.updateDynamic("UnitCost")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ServiceResourceCost]
    }
  }

  /** Contains the Amazon Resource Name (ARN) of an Amazon Simple Notification Service topic. If you use an Amazon SNS topic in another account, you must attach a policy to it that grants DevOps Guru permission to it notifications. DevOps Guru adds the required policy on your behalf to send notifications using Amazon SNS in your account. For more information, see [[https://docs.aws.amazon.com/devops-guru/latest/userguide/sns-required-permissions.html|Permissions for cross account Amazon SNS topics]]. If you use an Amazon SNS topic that is encrypted by an Amazon Web Services Key Management Service customer-managed key (CMK), then you must add permissions to the CMK. For more information, see [[https://docs.aws.amazon.com/devops-guru/latest/userguide/sns-kms-permissions.html|Permissions for Amazon Web Services KMS–encrypted Amazon SNS topics]].
    */
  @js.native
  trait SnsChannelConfig extends js.Object {
    var TopicArn: js.UndefOr[TopicArn]
  }

  object SnsChannelConfig {
    @inline
    def apply(
        TopicArn: js.UndefOr[TopicArn] = js.undefined
    ): SnsChannelConfig = {
      val __obj = js.Dynamic.literal()
      TopicArn.foreach(__v => __obj.updateDynamic("TopicArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SnsChannelConfig]
    }
  }

  @js.native
  trait StartCostEstimationRequest extends js.Object {
    var ResourceCollection: CostEstimationResourceCollectionFilter
    var ClientToken: js.UndefOr[ClientToken]
  }

  object StartCostEstimationRequest {
    @inline
    def apply(
        ResourceCollection: CostEstimationResourceCollectionFilter,
        ClientToken: js.UndefOr[ClientToken] = js.undefined
    ): StartCostEstimationRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceCollection" -> ResourceCollection.asInstanceOf[js.Any]
      )

      ClientToken.foreach(__v => __obj.updateDynamic("ClientToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartCostEstimationRequest]
    }
  }

  @js.native
  trait StartCostEstimationResponse extends js.Object

  object StartCostEstimationResponse {
    @inline
    def apply(): StartCostEstimationResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StartCostEstimationResponse]
    }
  }

  /** A time range used to specify when the behavior of an insight or anomaly started.
    */
  @js.native
  trait StartTimeRange extends js.Object {
    var FromTime: js.UndefOr[Timestamp]
    var ToTime: js.UndefOr[Timestamp]
  }

  object StartTimeRange {
    @inline
    def apply(
        FromTime: js.UndefOr[Timestamp] = js.undefined,
        ToTime: js.UndefOr[Timestamp] = js.undefined
    ): StartTimeRange = {
      val __obj = js.Dynamic.literal()
      FromTime.foreach(__v => __obj.updateDynamic("FromTime")(__v.asInstanceOf[js.Any]))
      ToTime.foreach(__v => __obj.updateDynamic("ToTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartTimeRange]
    }
  }

  /** A collection of Amazon Web Services stags. Tags help you identify and organize your Amazon Web Services resources. Many Amazon Web Services services support tagging, so you can assign the same tag to resources from different services to indicate that the resources are related. For example, you can assign the same tag to an Amazon DynamoDB table resource that you assign to an Lambda function. For more information about using tags, see the [[https://d1.awsstatic.com/whitepapers/aws-tagging-best-practices.pdf|Tagging best practices]] whitepaper. Each Amazon Web Services tag has two parts. * A tag <i>key</i> (for example, <code>CostCenter</code>, <code>Environment</code>, <code>Project</code>, or <code>Secret</code>). Tag <i>keys</i> are case-sensitive. * An optional field known as a tag <i>value</i> (for example, <code>111122223333</code>, <code>Production</code>, or a team name). Omitting the tag <i>value</i> is the same as using an empty string. Like tag <i>keys</i>, tag
    * <i>values</i> are case-sensitive. Together these are known as <i>key</i>-<i>value</i> pairs. <important> The string used for a <i>key</i> in a tag that you use to define your resource coverage must begin with the prefix <code>Devops-guru-</code>. The tag <i>key</i> might be <code>Devops-guru-deployment-application</code> or <code>Devops-guru-rds-application</code>. While <i>keys</i> are case-sensitive, the case of <i>key</i> characters don't matter to DevOps Guru. For example, DevOps Guru works with a <i>key</i> named <code>devops-guru-rds</code> and a <i>key</i> named <code>DevOps-Guru-RDS</code>. Possible <i>key</i>/<i>value</i> pairs in your application might be <code>Devops-Guru-production-application/RDS</code> or <code>Devops-Guru-production-application/containers</code>. </important>
    */
  @js.native
  trait TagCollection extends js.Object {
    var AppBoundaryKey: AppBoundaryKey
    var TagValues: TagValues
  }

  object TagCollection {
    @inline
    def apply(
        AppBoundaryKey: AppBoundaryKey,
        TagValues: TagValues
    ): TagCollection = {
      val __obj = js.Dynamic.literal(
        "AppBoundaryKey" -> AppBoundaryKey.asInstanceOf[js.Any],
        "TagValues" -> TagValues.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[TagCollection]
    }
  }

  /** A collection of Amazon Web Services tags used to filter insights. This is used to return insights generated from only resources that contain the tags in the tag collection.
    */
  @js.native
  trait TagCollectionFilter extends js.Object {
    var AppBoundaryKey: AppBoundaryKey
    var TagValues: TagValues
  }

  object TagCollectionFilter {
    @inline
    def apply(
        AppBoundaryKey: AppBoundaryKey,
        TagValues: TagValues
    ): TagCollectionFilter = {
      val __obj = js.Dynamic.literal(
        "AppBoundaryKey" -> AppBoundaryKey.asInstanceOf[js.Any],
        "TagValues" -> TagValues.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[TagCollectionFilter]
    }
  }

  /** Information about a collection of Amazon Web Services resources that are identified by an Amazon Web Services tag. This collection of resources is used to create a monthly cost estimate for DevOps Guru to analyze Amazon Web Services resources. The maximum number of tags you can specify for a cost estimate is one. The estimate created is for the cost to analyze the Amazon Web Services resources defined by the tag. For more information, see [[https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacks.html|Stacks]] in the <i>Amazon Web Services CloudFormation User Guide</i>.
    */
  @js.native
  trait TagCostEstimationResourceCollectionFilter extends js.Object {
    var AppBoundaryKey: AppBoundaryKey
    var TagValues: CostEstimationTagValues
  }

  object TagCostEstimationResourceCollectionFilter {
    @inline
    def apply(
        AppBoundaryKey: AppBoundaryKey,
        TagValues: CostEstimationTagValues
    ): TagCostEstimationResourceCollectionFilter = {
      val __obj = js.Dynamic.literal(
        "AppBoundaryKey" -> AppBoundaryKey.asInstanceOf[js.Any],
        "TagValues" -> TagValues.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[TagCostEstimationResourceCollectionFilter]
    }
  }

  /** Information about the health of Amazon Web Services resources in your account that are specified by an Amazon Web Services tag <i>key</i>.
    */
  @js.native
  trait TagHealth extends js.Object {
    var AppBoundaryKey: js.UndefOr[AppBoundaryKey]
    var Insight: js.UndefOr[InsightHealth]
    var TagValue: js.UndefOr[TagValue]
  }

  object TagHealth {
    @inline
    def apply(
        AppBoundaryKey: js.UndefOr[AppBoundaryKey] = js.undefined,
        Insight: js.UndefOr[InsightHealth] = js.undefined,
        TagValue: js.UndefOr[TagValue] = js.undefined
    ): TagHealth = {
      val __obj = js.Dynamic.literal()
      AppBoundaryKey.foreach(__v => __obj.updateDynamic("AppBoundaryKey")(__v.asInstanceOf[js.Any]))
      Insight.foreach(__v => __obj.updateDynamic("Insight")(__v.asInstanceOf[js.Any]))
      TagValue.foreach(__v => __obj.updateDynamic("TagValue")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TagHealth]
    }
  }

  /** A pair that contains metric values at the respective timestamp.
    */
  @js.native
  trait TimestampMetricValuePair extends js.Object {
    var MetricValue: js.UndefOr[MetricValue]
    var Timestamp: js.UndefOr[Timestamp]
  }

  object TimestampMetricValuePair {
    @inline
    def apply(
        MetricValue: js.UndefOr[MetricValue] = js.undefined,
        Timestamp: js.UndefOr[Timestamp] = js.undefined
    ): TimestampMetricValuePair = {
      val __obj = js.Dynamic.literal()
      MetricValue.foreach(__v => __obj.updateDynamic("MetricValue")(__v.asInstanceOf[js.Any]))
      Timestamp.foreach(__v => __obj.updateDynamic("Timestamp")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TimestampMetricValuePair]
    }
  }

  /** Contains the names of Amazon Web Services CloudFormation stacks used to update a collection of stacks. You can specify up to 500 Amazon Web Services CloudFormation stacks.
    */
  @js.native
  trait UpdateCloudFormationCollectionFilter extends js.Object {
    var StackNames: js.UndefOr[UpdateStackNames]
  }

  object UpdateCloudFormationCollectionFilter {
    @inline
    def apply(
        StackNames: js.UndefOr[UpdateStackNames] = js.undefined
    ): UpdateCloudFormationCollectionFilter = {
      val __obj = js.Dynamic.literal()
      StackNames.foreach(__v => __obj.updateDynamic("StackNames")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateCloudFormationCollectionFilter]
    }
  }

  /** Contains information used to update a collection of Amazon Web Services resources.
    */
  @js.native
  trait UpdateResourceCollectionFilter extends js.Object {
    var CloudFormation: js.UndefOr[UpdateCloudFormationCollectionFilter]
    var Tags: js.UndefOr[UpdateTagCollectionFilters]
  }

  object UpdateResourceCollectionFilter {
    @inline
    def apply(
        CloudFormation: js.UndefOr[UpdateCloudFormationCollectionFilter] = js.undefined,
        Tags: js.UndefOr[UpdateTagCollectionFilters] = js.undefined
    ): UpdateResourceCollectionFilter = {
      val __obj = js.Dynamic.literal()
      CloudFormation.foreach(__v => __obj.updateDynamic("CloudFormation")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateResourceCollectionFilter]
    }
  }

  @js.native
  trait UpdateResourceCollectionRequest extends js.Object {
    var Action: UpdateResourceCollectionAction
    var ResourceCollection: UpdateResourceCollectionFilter
  }

  object UpdateResourceCollectionRequest {
    @inline
    def apply(
        Action: UpdateResourceCollectionAction,
        ResourceCollection: UpdateResourceCollectionFilter
    ): UpdateResourceCollectionRequest = {
      val __obj = js.Dynamic.literal(
        "Action" -> Action.asInstanceOf[js.Any],
        "ResourceCollection" -> ResourceCollection.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateResourceCollectionRequest]
    }
  }

  @js.native
  trait UpdateResourceCollectionResponse extends js.Object

  object UpdateResourceCollectionResponse {
    @inline
    def apply(): UpdateResourceCollectionResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateResourceCollectionResponse]
    }
  }

  /** Information about updating the integration status of an Amazon Web Services service, such as Amazon Web Services Systems Manager, with DevOps Guru.
    */
  @js.native
  trait UpdateServiceIntegrationConfig extends js.Object {
    var OpsCenter: js.UndefOr[OpsCenterIntegrationConfig]
  }

  object UpdateServiceIntegrationConfig {
    @inline
    def apply(
        OpsCenter: js.UndefOr[OpsCenterIntegrationConfig] = js.undefined
    ): UpdateServiceIntegrationConfig = {
      val __obj = js.Dynamic.literal()
      OpsCenter.foreach(__v => __obj.updateDynamic("OpsCenter")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateServiceIntegrationConfig]
    }
  }

  @js.native
  trait UpdateServiceIntegrationRequest extends js.Object {
    var ServiceIntegration: UpdateServiceIntegrationConfig
  }

  object UpdateServiceIntegrationRequest {
    @inline
    def apply(
        ServiceIntegration: UpdateServiceIntegrationConfig
    ): UpdateServiceIntegrationRequest = {
      val __obj = js.Dynamic.literal(
        "ServiceIntegration" -> ServiceIntegration.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateServiceIntegrationRequest]
    }
  }

  @js.native
  trait UpdateServiceIntegrationResponse extends js.Object

  object UpdateServiceIntegrationResponse {
    @inline
    def apply(): UpdateServiceIntegrationResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateServiceIntegrationResponse]
    }
  }

  /** A new collection of Amazon Web Services resources that are defined by an Amazon Web Services tag or tag <i>key</i>/<i>value</i> pair.
    */
  @js.native
  trait UpdateTagCollectionFilter extends js.Object {
    var AppBoundaryKey: AppBoundaryKey
    var TagValues: UpdateTagValues
  }

  object UpdateTagCollectionFilter {
    @inline
    def apply(
        AppBoundaryKey: AppBoundaryKey,
        TagValues: UpdateTagValues
    ): UpdateTagCollectionFilter = {
      val __obj = js.Dynamic.literal(
        "AppBoundaryKey" -> AppBoundaryKey.asInstanceOf[js.Any],
        "TagValues" -> TagValues.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateTagCollectionFilter]
    }
  }
}
