package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

package object devopsguru {
  type AnomalyId = String
  type AnomalyLimit = Double
  type Channels = js.Array[NotificationChannel]
  type CloudFormationHealths = js.Array[CloudFormationHealth]
  type CloudWatchMetricsDetails = js.Array[CloudWatchMetricsDetail]
  type CloudWatchMetricsDimensionName = String
  type CloudWatchMetricsDimensionValue = String
  type CloudWatchMetricsDimensions = js.Array[CloudWatchMetricsDimension]
  type CloudWatchMetricsMetricName = String
  type CloudWatchMetricsNamespace = String
  type CloudWatchMetricsPeriod = Int
  type CloudWatchMetricsUnit = String
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
  type ListInsightsMaxResults = Int
  type MeanTimeToRecoverInMilliseconds = Double
  type NotificationChannelId = String
  type NumMetricsAnalyzed = Int
  type NumOpenProactiveInsights = Int
  type NumOpenReactiveInsights = Int
  type NumProactiveInsights = Int
  type NumReactiveInsights = Int
  type ProactiveAnomalies = js.Array[ProactiveAnomalySummary]
  type ProactiveInsights = js.Array[ProactiveInsightSummary]
  type ReactiveAnomalies = js.Array[ReactiveAnomalySummary]
  type ReactiveInsights = js.Array[ReactiveInsightSummary]
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
  type SearchInsightsMaxResults = Int
  type SsmOpsItemId = String
  type StackName = String
  type StackNames = js.Array[StackName]
  type Timestamp = js.Date
  type TopicArn = String
  type UpdateStackNames = js.Array[StackName]
  type UuidNextToken = String

  implicit final class DevOpsGuruOps(private val service: DevOpsGuru) extends AnyVal {

    @inline def addNotificationChannelFuture(params: AddNotificationChannelRequest): Future[AddNotificationChannelResponse] = service.addNotificationChannel(params).promise().toFuture
    @inline def describeAccountHealthFuture(params: DescribeAccountHealthRequest): Future[DescribeAccountHealthResponse] = service.describeAccountHealth(params).promise().toFuture
    @inline def describeAccountOverviewFuture(params: DescribeAccountOverviewRequest): Future[DescribeAccountOverviewResponse] = service.describeAccountOverview(params).promise().toFuture
    @inline def describeAnomalyFuture(params: DescribeAnomalyRequest): Future[DescribeAnomalyResponse] = service.describeAnomaly(params).promise().toFuture
    @inline def describeInsightFuture(params: DescribeInsightRequest): Future[DescribeInsightResponse] = service.describeInsight(params).promise().toFuture
    @inline def describeResourceCollectionHealthFuture(params: DescribeResourceCollectionHealthRequest): Future[DescribeResourceCollectionHealthResponse] = service.describeResourceCollectionHealth(params).promise().toFuture
    @inline def describeServiceIntegrationFuture(params: DescribeServiceIntegrationRequest): Future[DescribeServiceIntegrationResponse] = service.describeServiceIntegration(params).promise().toFuture
    @inline def getResourceCollectionFuture(params: GetResourceCollectionRequest): Future[GetResourceCollectionResponse] = service.getResourceCollection(params).promise().toFuture
    @inline def listAnomaliesForInsightFuture(params: ListAnomaliesForInsightRequest): Future[ListAnomaliesForInsightResponse] = service.listAnomaliesForInsight(params).promise().toFuture
    @inline def listEventsFuture(params: ListEventsRequest): Future[ListEventsResponse] = service.listEvents(params).promise().toFuture
    @inline def listInsightsFuture(params: ListInsightsRequest): Future[ListInsightsResponse] = service.listInsights(params).promise().toFuture
    @inline def listNotificationChannelsFuture(params: ListNotificationChannelsRequest): Future[ListNotificationChannelsResponse] = service.listNotificationChannels(params).promise().toFuture
    @inline def listRecommendationsFuture(params: ListRecommendationsRequest): Future[ListRecommendationsResponse] = service.listRecommendations(params).promise().toFuture
    @inline def putFeedbackFuture(params: PutFeedbackRequest): Future[PutFeedbackResponse] = service.putFeedback(params).promise().toFuture
    @inline def removeNotificationChannelFuture(params: RemoveNotificationChannelRequest): Future[RemoveNotificationChannelResponse] = service.removeNotificationChannel(params).promise().toFuture
    @inline def searchInsightsFuture(params: SearchInsightsRequest): Future[SearchInsightsResponse] = service.searchInsights(params).promise().toFuture
    @inline def updateResourceCollectionFuture(params: UpdateResourceCollectionRequest): Future[UpdateResourceCollectionResponse] = service.updateResourceCollection(params).promise().toFuture
    @inline def updateServiceIntegrationFuture(params: UpdateServiceIntegrationRequest): Future[UpdateServiceIntegrationResponse] = service.updateServiceIntegration(params).promise().toFuture

  }
}

package devopsguru {
  @js.native
  @JSImport("aws-sdk/clients/devopsguru", JSImport.Namespace, "AWS.DevOpsGuru")
  class DevOpsGuru() extends js.Object {
    def this(config: AWSConfig) = this()

    def addNotificationChannel(params: AddNotificationChannelRequest): Request[AddNotificationChannelResponse] = js.native
    def describeAccountHealth(params: DescribeAccountHealthRequest): Request[DescribeAccountHealthResponse] = js.native
    def describeAccountOverview(params: DescribeAccountOverviewRequest): Request[DescribeAccountOverviewResponse] = js.native
    def describeAnomaly(params: DescribeAnomalyRequest): Request[DescribeAnomalyResponse] = js.native
    def describeInsight(params: DescribeInsightRequest): Request[DescribeInsightResponse] = js.native
    def describeResourceCollectionHealth(params: DescribeResourceCollectionHealthRequest): Request[DescribeResourceCollectionHealthResponse] = js.native
    def describeServiceIntegration(params: DescribeServiceIntegrationRequest): Request[DescribeServiceIntegrationResponse] = js.native
    def getResourceCollection(params: GetResourceCollectionRequest): Request[GetResourceCollectionResponse] = js.native
    def listAnomaliesForInsight(params: ListAnomaliesForInsightRequest): Request[ListAnomaliesForInsightResponse] = js.native
    def listEvents(params: ListEventsRequest): Request[ListEventsResponse] = js.native
    def listInsights(params: ListInsightsRequest): Request[ListInsightsResponse] = js.native
    def listNotificationChannels(params: ListNotificationChannelsRequest): Request[ListNotificationChannelsResponse] = js.native
    def listRecommendations(params: ListRecommendationsRequest): Request[ListRecommendationsResponse] = js.native
    def putFeedback(params: PutFeedbackRequest): Request[PutFeedbackResponse] = js.native
    def removeNotificationChannel(params: RemoveNotificationChannelRequest): Request[RemoveNotificationChannelResponse] = js.native
    def searchInsights(params: SearchInsightsRequest): Request[SearchInsightsResponse] = js.native
    def updateResourceCollection(params: UpdateResourceCollectionRequest): Request[UpdateResourceCollectionResponse] = js.native
    def updateServiceIntegration(params: UpdateServiceIntegrationRequest): Request[UpdateServiceIntegrationResponse] = js.native
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

  @js.native
  sealed trait AnomalySeverity extends js.Any
  object AnomalySeverity {
    val LOW = "LOW".asInstanceOf[AnomalySeverity]
    val MEDIUM = "MEDIUM".asInstanceOf[AnomalySeverity]
    val HIGH = "HIGH".asInstanceOf[AnomalySeverity]

    @inline def values = js.Array(LOW, MEDIUM, HIGH)
  }

  /** Details about the source of the anomalous operational data that triggered the anomaly. The one supported source is Amazon CloudWatch metrics.
    */
  @js.native
  trait AnomalySourceDetails extends js.Object {
    var CloudWatchMetrics: js.UndefOr[CloudWatchMetricsDetails]
  }

  object AnomalySourceDetails {
    @inline
    def apply(
        CloudWatchMetrics: js.UndefOr[CloudWatchMetricsDetails] = js.undefined
    ): AnomalySourceDetails = {
      val __obj = js.Dynamic.literal()
      CloudWatchMetrics.foreach(__v => __obj.updateDynamic("CloudWatchMetrics")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AnomalySourceDetails]
    }
  }

  @js.native
  sealed trait AnomalyStatus extends js.Any
  object AnomalyStatus {
    val ONGOING = "ONGOING".asInstanceOf[AnomalyStatus]
    val CLOSED = "CLOSED".asInstanceOf[AnomalyStatus]

    @inline def values = js.Array(ONGOING, CLOSED)
  }

  /** A time range that specifies when the observed unusual behavior in an anomaly started and ended.
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

  /** Information about AWS CloudFormation stacks. You can use stacks to specify which AWS resources in your account to analyze. For more information, see [[https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacks.html|Stacks]] in the <i>AWS CloudFormation User Guide</i>.
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

  /** Information about AWS CloudFormation stacks. You can use stacks to specify which AWS resources in your account to analyze. For more information, see [[https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacks.html|Stacks]] in the <i>AWS CloudFormation User Guide</i>.
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

  /** Information about the health of AWS resources in your account that are specified by an AWS CloudFormation stack.
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

  /** Information about an Amazon CloudWatch metric.
    */
  @js.native
  trait CloudWatchMetricsDetail extends js.Object {
    var Dimensions: js.UndefOr[CloudWatchMetricsDimensions]
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
        MetricName: js.UndefOr[CloudWatchMetricsMetricName] = js.undefined,
        Namespace: js.UndefOr[CloudWatchMetricsNamespace] = js.undefined,
        Period: js.UndefOr[CloudWatchMetricsPeriod] = js.undefined,
        Stat: js.UndefOr[CloudWatchMetricsStat] = js.undefined,
        Unit: js.UndefOr[CloudWatchMetricsUnit] = js.undefined
    ): CloudWatchMetricsDetail = {
      val __obj = js.Dynamic.literal()
      Dimensions.foreach(__v => __obj.updateDynamic("Dimensions")(__v.asInstanceOf[js.Any]))
      MetricName.foreach(__v => __obj.updateDynamic("MetricName")(__v.asInstanceOf[js.Any]))
      Namespace.foreach(__v => __obj.updateDynamic("Namespace")(__v.asInstanceOf[js.Any]))
      Period.foreach(__v => __obj.updateDynamic("Period")(__v.asInstanceOf[js.Any]))
      Stat.foreach(__v => __obj.updateDynamic("Stat")(__v.asInstanceOf[js.Any]))
      Unit.foreach(__v => __obj.updateDynamic("Unit")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CloudWatchMetricsDetail]
    }
  }

  /** The dimension of a Amazon CloudWatch metric that is used when DevOps Guru analyzes the resources in your account for operational problems and anomalous behaviour. A dimension is a name/value pair that is part of the identity of a metric. A metric can have up to 10 dimensions. For more information, see [[https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/cloudwatch_concepts.html#Dimension|Dimensions]] in the <i>Amazon CloudWatch User Guide</i>.
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

  @js.native
  sealed trait CloudWatchMetricsStat extends js.Any
  object CloudWatchMetricsStat {
    val Sum = "Sum".asInstanceOf[CloudWatchMetricsStat]
    val Average = "Average".asInstanceOf[CloudWatchMetricsStat]
    val SampleCount = "SampleCount".asInstanceOf[CloudWatchMetricsStat]
    val Minimum = "Minimum".asInstanceOf[CloudWatchMetricsStat]
    val Maximum = "Maximum".asInstanceOf[CloudWatchMetricsStat]
    val p99 = "p99".asInstanceOf[CloudWatchMetricsStat]
    val p90 = "p90".asInstanceOf[CloudWatchMetricsStat]
    val p50 = "p50".asInstanceOf[CloudWatchMetricsStat]

    @inline def values = js.Array(Sum, Average, SampleCount, Minimum, Maximum, p99, p90, p50)
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
  }

  object DescribeAccountHealthResponse {
    @inline
    def apply(
        MetricsAnalyzed: NumMetricsAnalyzed,
        OpenProactiveInsights: NumOpenProactiveInsights,
        OpenReactiveInsights: NumOpenReactiveInsights
    ): DescribeAccountHealthResponse = {
      val __obj = js.Dynamic.literal(
        "MetricsAnalyzed" -> MetricsAnalyzed.asInstanceOf[js.Any],
        "OpenProactiveInsights" -> OpenProactiveInsights.asInstanceOf[js.Any],
        "OpenReactiveInsights" -> OpenReactiveInsights.asInstanceOf[js.Any]
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
  }

  object DescribeAnomalyRequest {
    @inline
    def apply(
        Id: AnomalyId
    ): DescribeAnomalyRequest = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any]
      )
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
  trait DescribeInsightRequest extends js.Object {
    var Id: InsightId
  }

  object DescribeInsightRequest {
    @inline
    def apply(
        Id: InsightId
    ): DescribeInsightRequest = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any]
      )
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
    var CloudFormation: CloudFormationHealths
    var NextToken: js.UndefOr[UuidNextToken]
  }

  object DescribeResourceCollectionHealthResponse {
    @inline
    def apply(
        CloudFormation: CloudFormationHealths,
        NextToken: js.UndefOr[UuidNextToken] = js.undefined
    ): DescribeResourceCollectionHealthResponse = {
      val __obj = js.Dynamic.literal(
        "CloudFormation" -> CloudFormation.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
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

  /** An AWS resource event. AWS resource events and metrics are analyzed by DevOps Guru to find anomalous behavior and provide recommendations to improve your operational solutions.
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

  @js.native
  sealed trait EventClass extends js.Any
  object EventClass {
    val INFRASTRUCTURE = "INFRASTRUCTURE".asInstanceOf[EventClass]
    val DEPLOYMENT = "DEPLOYMENT".asInstanceOf[EventClass]
    val SECURITY_CHANGE = "SECURITY_CHANGE".asInstanceOf[EventClass]
    val CONFIG_CHANGE = "CONFIG_CHANGE".asInstanceOf[EventClass]
    val SCHEMA_CHANGE = "SCHEMA_CHANGE".asInstanceOf[EventClass]

    @inline def values = js.Array(INFRASTRUCTURE, DEPLOYMENT, SECURITY_CHANGE, CONFIG_CHANGE, SCHEMA_CHANGE)
  }

  @js.native
  sealed trait EventDataSource extends js.Any
  object EventDataSource {
    val AWS_CLOUD_TRAIL = "AWS_CLOUD_TRAIL".asInstanceOf[EventDataSource]
    val AWS_CODE_DEPLOY = "AWS_CODE_DEPLOY".asInstanceOf[EventDataSource]

    @inline def values = js.Array(AWS_CLOUD_TRAIL, AWS_CODE_DEPLOY)
  }

  /** The AWS resource that emitted an event. AWS resource events and metrics are analyzed by DevOps Guru to find anomalous behavior and provide recommendations to improve your operational solutions.
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

  /** The time range during which an AWS event occurred. AWS resource events and metrics are analyzed by DevOps Guru to find anomalous behavior and provide recommendations to improve your operational solutions.
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

  @js.native
  sealed trait InsightFeedbackOption extends js.Any
  object InsightFeedbackOption {
    val VALID_COLLECTION = "VALID_COLLECTION".asInstanceOf[InsightFeedbackOption]
    val RECOMMENDATION_USEFUL = "RECOMMENDATION_USEFUL".asInstanceOf[InsightFeedbackOption]
    val ALERT_TOO_SENSITIVE = "ALERT_TOO_SENSITIVE".asInstanceOf[InsightFeedbackOption]
    val DATA_NOISY_ANOMALY = "DATA_NOISY_ANOMALY".asInstanceOf[InsightFeedbackOption]
    val DATA_INCORRECT = "DATA_INCORRECT".asInstanceOf[InsightFeedbackOption]

    @inline def values = js.Array(VALID_COLLECTION, RECOMMENDATION_USEFUL, ALERT_TOO_SENSITIVE, DATA_NOISY_ANOMALY, DATA_INCORRECT)
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

  @js.native
  sealed trait InsightSeverity extends js.Any
  object InsightSeverity {
    val LOW = "LOW".asInstanceOf[InsightSeverity]
    val MEDIUM = "MEDIUM".asInstanceOf[InsightSeverity]
    val HIGH = "HIGH".asInstanceOf[InsightSeverity]

    @inline def values = js.Array(LOW, MEDIUM, HIGH)
  }

  @js.native
  sealed trait InsightStatus extends js.Any
  object InsightStatus {
    val ONGOING = "ONGOING".asInstanceOf[InsightStatus]
    val CLOSED = "CLOSED".asInstanceOf[InsightStatus]

    @inline def values = js.Array(ONGOING, CLOSED)
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
  sealed trait InsightType extends js.Any
  object InsightType {
    val REACTIVE = "REACTIVE".asInstanceOf[InsightType]
    val PROACTIVE = "PROACTIVE".asInstanceOf[InsightType]

    @inline def values = js.Array(REACTIVE, PROACTIVE)
  }

  @js.native
  trait ListAnomaliesForInsightRequest extends js.Object {
    var InsightId: InsightId
    var MaxResults: js.UndefOr[ListAnomaliesForInsightMaxResults]
    var NextToken: js.UndefOr[UuidNextToken]
    var StartTimeRange: js.UndefOr[StartTimeRange]
  }

  object ListAnomaliesForInsightRequest {
    @inline
    def apply(
        InsightId: InsightId,
        MaxResults: js.UndefOr[ListAnomaliesForInsightMaxResults] = js.undefined,
        NextToken: js.UndefOr[UuidNextToken] = js.undefined,
        StartTimeRange: js.UndefOr[StartTimeRange] = js.undefined
    ): ListAnomaliesForInsightRequest = {
      val __obj = js.Dynamic.literal(
        "InsightId" -> InsightId.asInstanceOf[js.Any]
      )

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
    var MaxResults: js.UndefOr[ListEventsMaxResults]
    var NextToken: js.UndefOr[UuidNextToken]
  }

  object ListEventsRequest {
    @inline
    def apply(
        Filters: ListEventsFilters,
        MaxResults: js.UndefOr[ListEventsMaxResults] = js.undefined,
        NextToken: js.UndefOr[UuidNextToken] = js.undefined
    ): ListEventsRequest = {
      val __obj = js.Dynamic.literal(
        "Filters" -> Filters.asInstanceOf[js.Any]
      )

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
  trait ListRecommendationsRequest extends js.Object {
    var InsightId: InsightId
    var NextToken: js.UndefOr[UuidNextToken]
  }

  object ListRecommendationsRequest {
    @inline
    def apply(
        InsightId: InsightId,
        NextToken: js.UndefOr[UuidNextToken] = js.undefined
    ): ListRecommendationsRequest = {
      val __obj = js.Dynamic.literal(
        "InsightId" -> InsightId.asInstanceOf[js.Any]
      )

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

  /** Information about a notification channel. A notification channel is used to notify you when DevOps Guru creates an insight. The one supported notification channel is Amazon Simple Notification Service (Amazon SNS).
    * If you use an Amazon SNS topic in another account, you must attach a policy to it that grants DevOps Guru permission to it notifications. DevOps Guru adds the required policy on your behalf to send notifications using Amazon SNS in your account. For more information, see [[https://docs.aws.amazon.com/devops-guru/latest/userguide/sns-required-permissions.html|Permissions for cross account Amazon SNS topics]].
    * If you use an Amazon SNS topic that is encrypted by an AWS Key Management Service customer-managed key (CMK), then you must add permissions to the CMK. For more information, see [[https://docs.aws.amazon.com/devops-guru/latest/userguide/sns-kms-permissions.html|Permissions for AWS KMS–encrypted Amazon SNS topics]].
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

  /** Information about whether DevOps Guru is configured to create an OpsItem in AWS Systems Manager OpsCenter for each created insight.
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

  /** Information about whether DevOps Guru is configured to create an OpsItem in AWS Systems Manager OpsCenter for each created insight.
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

  /** Specifies if DevOps Guru is enabled to create an AWS Systems Manager OpsItem for each created insight.
    */
  @js.native
  sealed trait OptInStatus extends js.Any
  object OptInStatus {
    val ENABLED = "ENABLED".asInstanceOf[OptInStatus]
    val DISABLED = "DISABLED".asInstanceOf[OptInStatus]

    @inline def values = js.Array(ENABLED, DISABLED)
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
    var Id: js.UndefOr[InsightId]
    var InsightTimeRange: js.UndefOr[InsightTimeRange]
    var Name: js.UndefOr[InsightName]
    var PredictionTimeRange: js.UndefOr[PredictionTimeRange]
    var ResourceCollection: js.UndefOr[ResourceCollection]
    var Severity: js.UndefOr[InsightSeverity]
    var Status: js.UndefOr[InsightStatus]
  }

  object ProactiveInsightSummary {
    @inline
    def apply(
        Id: js.UndefOr[InsightId] = js.undefined,
        InsightTimeRange: js.UndefOr[InsightTimeRange] = js.undefined,
        Name: js.UndefOr[InsightName] = js.undefined,
        PredictionTimeRange: js.UndefOr[PredictionTimeRange] = js.undefined,
        ResourceCollection: js.UndefOr[ResourceCollection] = js.undefined,
        Severity: js.UndefOr[InsightSeverity] = js.undefined,
        Status: js.UndefOr[InsightStatus] = js.undefined
    ): ProactiveInsightSummary = {
      val __obj = js.Dynamic.literal()
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      InsightTimeRange.foreach(__v => __obj.updateDynamic("InsightTimeRange")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      PredictionTimeRange.foreach(__v => __obj.updateDynamic("PredictionTimeRange")(__v.asInstanceOf[js.Any]))
      ResourceCollection.foreach(__v => __obj.updateDynamic("ResourceCollection")(__v.asInstanceOf[js.Any]))
      Severity.foreach(__v => __obj.updateDynamic("Severity")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ProactiveInsightSummary]
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
    var AnomalyTimeRange: js.UndefOr[AnomalyTimeRange]
    var AssociatedInsightId: js.UndefOr[InsightId]
    var Id: js.UndefOr[AnomalyId]
    var ResourceCollection: js.UndefOr[ResourceCollection]
    var Severity: js.UndefOr[AnomalySeverity]
    var SourceDetails: js.UndefOr[AnomalySourceDetails]
    var Status: js.UndefOr[AnomalyStatus]
  }

  object ReactiveAnomaly {
    @inline
    def apply(
        AnomalyTimeRange: js.UndefOr[AnomalyTimeRange] = js.undefined,
        AssociatedInsightId: js.UndefOr[InsightId] = js.undefined,
        Id: js.UndefOr[AnomalyId] = js.undefined,
        ResourceCollection: js.UndefOr[ResourceCollection] = js.undefined,
        Severity: js.UndefOr[AnomalySeverity] = js.undefined,
        SourceDetails: js.UndefOr[AnomalySourceDetails] = js.undefined,
        Status: js.UndefOr[AnomalyStatus] = js.undefined
    ): ReactiveAnomaly = {
      val __obj = js.Dynamic.literal()
      AnomalyTimeRange.foreach(__v => __obj.updateDynamic("AnomalyTimeRange")(__v.asInstanceOf[js.Any]))
      AssociatedInsightId.foreach(__v => __obj.updateDynamic("AssociatedInsightId")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      ResourceCollection.foreach(__v => __obj.updateDynamic("ResourceCollection")(__v.asInstanceOf[js.Any]))
      Severity.foreach(__v => __obj.updateDynamic("Severity")(__v.asInstanceOf[js.Any]))
      SourceDetails.foreach(__v => __obj.updateDynamic("SourceDetails")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ReactiveAnomaly]
    }
  }

  /** Details about a reactive anomaly. This object is returned by <code>DescribeAnomaly.</code>
    */
  @js.native
  trait ReactiveAnomalySummary extends js.Object {
    var AnomalyTimeRange: js.UndefOr[AnomalyTimeRange]
    var AssociatedInsightId: js.UndefOr[InsightId]
    var Id: js.UndefOr[AnomalyId]
    var ResourceCollection: js.UndefOr[ResourceCollection]
    var Severity: js.UndefOr[AnomalySeverity]
    var SourceDetails: js.UndefOr[AnomalySourceDetails]
    var Status: js.UndefOr[AnomalyStatus]
  }

  object ReactiveAnomalySummary {
    @inline
    def apply(
        AnomalyTimeRange: js.UndefOr[AnomalyTimeRange] = js.undefined,
        AssociatedInsightId: js.UndefOr[InsightId] = js.undefined,
        Id: js.UndefOr[AnomalyId] = js.undefined,
        ResourceCollection: js.UndefOr[ResourceCollection] = js.undefined,
        Severity: js.UndefOr[AnomalySeverity] = js.undefined,
        SourceDetails: js.UndefOr[AnomalySourceDetails] = js.undefined,
        Status: js.UndefOr[AnomalyStatus] = js.undefined
    ): ReactiveAnomalySummary = {
      val __obj = js.Dynamic.literal()
      AnomalyTimeRange.foreach(__v => __obj.updateDynamic("AnomalyTimeRange")(__v.asInstanceOf[js.Any]))
      AssociatedInsightId.foreach(__v => __obj.updateDynamic("AssociatedInsightId")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      ResourceCollection.foreach(__v => __obj.updateDynamic("ResourceCollection")(__v.asInstanceOf[js.Any]))
      Severity.foreach(__v => __obj.updateDynamic("Severity")(__v.asInstanceOf[js.Any]))
      SourceDetails.foreach(__v => __obj.updateDynamic("SourceDetails")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
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
    var Id: js.UndefOr[InsightId]
    var InsightTimeRange: js.UndefOr[InsightTimeRange]
    var Name: js.UndefOr[InsightName]
    var ResourceCollection: js.UndefOr[ResourceCollection]
    var Severity: js.UndefOr[InsightSeverity]
    var Status: js.UndefOr[InsightStatus]
  }

  object ReactiveInsightSummary {
    @inline
    def apply(
        Id: js.UndefOr[InsightId] = js.undefined,
        InsightTimeRange: js.UndefOr[InsightTimeRange] = js.undefined,
        Name: js.UndefOr[InsightName] = js.undefined,
        ResourceCollection: js.UndefOr[ResourceCollection] = js.undefined,
        Severity: js.UndefOr[InsightSeverity] = js.undefined,
        Status: js.UndefOr[InsightStatus] = js.undefined
    ): ReactiveInsightSummary = {
      val __obj = js.Dynamic.literal()
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      InsightTimeRange.foreach(__v => __obj.updateDynamic("InsightTimeRange")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      ResourceCollection.foreach(__v => __obj.updateDynamic("ResourceCollection")(__v.asInstanceOf[js.Any]))
      Severity.foreach(__v => __obj.updateDynamic("Severity")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ReactiveInsightSummary]
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
    var Resources: js.UndefOr[RecommendationRelatedAnomalyResources]
    var SourceDetails: js.UndefOr[RelatedAnomalySourceDetails]
  }

  object RecommendationRelatedAnomaly {
    @inline
    def apply(
        Resources: js.UndefOr[RecommendationRelatedAnomalyResources] = js.undefined,
        SourceDetails: js.UndefOr[RelatedAnomalySourceDetails] = js.undefined
    ): RecommendationRelatedAnomaly = {
      val __obj = js.Dynamic.literal()
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

  /** Information about an AWS resource that emitted and event that is related to a recommendation in an insight.
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

  /** A collection of AWS resources supported by DevOps Guru. The one type of AWS resource collection supported is AWS CloudFormation stacks. DevOps Guru can be configured to analyze only the AWS resources that are defined in the stacks.
    */
  @js.native
  trait ResourceCollection extends js.Object {
    var CloudFormation: js.UndefOr[CloudFormationCollection]
  }

  object ResourceCollection {
    @inline
    def apply(
        CloudFormation: js.UndefOr[CloudFormationCollection] = js.undefined
    ): ResourceCollection = {
      val __obj = js.Dynamic.literal()
      CloudFormation.foreach(__v => __obj.updateDynamic("CloudFormation")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResourceCollection]
    }
  }

  /** Information about a filter used to specify which AWS resources are analyzed for anomalous behavior by DevOps Guru.
    */
  @js.native
  trait ResourceCollectionFilter extends js.Object {
    var CloudFormation: js.UndefOr[CloudFormationCollectionFilter]
  }

  object ResourceCollectionFilter {
    @inline
    def apply(
        CloudFormation: js.UndefOr[CloudFormationCollectionFilter] = js.undefined
    ): ResourceCollectionFilter = {
      val __obj = js.Dynamic.literal()
      CloudFormation.foreach(__v => __obj.updateDynamic("CloudFormation")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResourceCollectionFilter]
    }
  }

  @js.native
  sealed trait ResourceCollectionType extends js.Any
  object ResourceCollectionType {
    val AWS_CLOUD_FORMATION = "AWS_CLOUD_FORMATION".asInstanceOf[ResourceCollectionType]

    @inline def values = js.Array(AWS_CLOUD_FORMATION)
  }

  /** Specifies one or more severity values and one or more status values that are used to search for insights.
    */
  @js.native
  trait SearchInsightsFilters extends js.Object {
    var ResourceCollection: js.UndefOr[ResourceCollection]
    var Severities: js.UndefOr[InsightSeverities]
    var Statuses: js.UndefOr[InsightStatuses]
  }

  object SearchInsightsFilters {
    @inline
    def apply(
        ResourceCollection: js.UndefOr[ResourceCollection] = js.undefined,
        Severities: js.UndefOr[InsightSeverities] = js.undefined,
        Statuses: js.UndefOr[InsightStatuses] = js.undefined
    ): SearchInsightsFilters = {
      val __obj = js.Dynamic.literal()
      ResourceCollection.foreach(__v => __obj.updateDynamic("ResourceCollection")(__v.asInstanceOf[js.Any]))
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

  /** Information about the integration of DevOps Guru with another AWS service, such as AWS Systems Manager.
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

  /** Contains the Amazon Resource Name (ARN) of an Amazon Simple Notification Service topic.
    * If you use an Amazon SNS topic in another account, you must attach a policy to it that grants DevOps Guru permission to it notifications. DevOps Guru adds the required policy on your behalf to send notifications using Amazon SNS in your account. For more information, see [[https://docs.aws.amazon.com/devops-guru/latest/userguide/sns-required-permissions.html|Permissions for cross account Amazon SNS topics]].
    * If you use an Amazon SNS topic that is encrypted by an AWS Key Management Service customer-managed key (CMK), then you must add permissions to the CMK. For more information, see [[https://docs.aws.amazon.com/devops-guru/latest/userguide/sns-kms-permissions.html|Permissions for AWS KMS–encrypted Amazon SNS topics]].
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

  /** Contains the names of AWS CloudFormation stacks used to update a collection of stacks.
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

  @js.native
  sealed trait UpdateResourceCollectionAction extends js.Any
  object UpdateResourceCollectionAction {
    val ADD = "ADD".asInstanceOf[UpdateResourceCollectionAction]
    val REMOVE = "REMOVE".asInstanceOf[UpdateResourceCollectionAction]

    @inline def values = js.Array(ADD, REMOVE)
  }

  /** Contains information used to update a collection of AWS resources.
    */
  @js.native
  trait UpdateResourceCollectionFilter extends js.Object {
    var CloudFormation: js.UndefOr[UpdateCloudFormationCollectionFilter]
  }

  object UpdateResourceCollectionFilter {
    @inline
    def apply(
        CloudFormation: js.UndefOr[UpdateCloudFormationCollectionFilter] = js.undefined
    ): UpdateResourceCollectionFilter = {
      val __obj = js.Dynamic.literal()
      CloudFormation.foreach(__v => __obj.updateDynamic("CloudFormation")(__v.asInstanceOf[js.Any]))
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

  /** Information about updating the integration status of an AWS service, such as AWS Systems Manager, with DevOps Guru.
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
}
