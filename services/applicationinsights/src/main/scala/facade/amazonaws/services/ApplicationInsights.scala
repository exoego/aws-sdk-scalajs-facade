package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

package object applicationinsights {
  type AffectedResource = String
  type AmazonResourceName = String
  type ApplicationComponentList = js.Array[ApplicationComponent]
  type ApplicationInfoList = js.Array[ApplicationInfo]
  type CWEMonitorEnabled = Boolean
  type CloudWatchEventDetailType = String
  type CloudWatchEventId = String
  type CodeDeployApplication = String
  type CodeDeployDeploymentGroup = String
  type CodeDeployDeploymentId = String
  type CodeDeployInstanceGroupId = String
  type CodeDeployState = String
  type ComponentConfiguration = String
  type ComponentName = String
  type ConfigurationEventDetail = String
  type ConfigurationEventList = js.Array[ConfigurationEvent]
  type ConfigurationEventMonitoredResourceARN = String
  type ConfigurationEventResourceName = String
  type ConfigurationEventTime = js.Date
  type Ec2State = String
  type EndTime = js.Date
  type Feedback = js.Dictionary[FeedbackValue]
  type HealthEventArn = String
  type HealthEventDescription = String
  type HealthEventTypeCategory = String
  type HealthEventTypeCode = String
  type HealthService = String
  type Insights = String
  type LifeCycle = String
  type LineTime = js.Date
  type LogGroup = String
  type LogPatternList = js.Array[LogPattern]
  type LogPatternName = String
  type LogPatternRank = Int
  type LogPatternRegex = String
  type LogPatternSetList = js.Array[LogPatternSetName]
  type LogPatternSetName = String
  type LogText = String
  type MaxEntities = Int
  type MetricName = String
  type MetricNamespace = String
  type Monitor = Boolean
  type NewComponentName = String
  type ObservationId = String
  type ObservationList = js.Array[Observation]
  type OpsCenterEnabled = Boolean
  type OpsItemSNSTopicArn = String
  type PaginationToken = String
  type ProblemId = String
  type ProblemList = js.Array[Problem]
  type Remarks = String
  type RemoveSNSTopic = Boolean
  type ResourceARN = String
  type ResourceGroupName = String
  type ResourceList = js.Array[ResourceARN]
  type ResourceType = String
  type SourceARN = String
  type SourceType = String
  type StartTime = js.Date
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagList = js.Array[Tag]
  type TagValue = String
  type Title = String
  type Unit = String
  type Value = Double
  type XRayErrorPercent = Int
  type XRayFaultPercent = Int
  type XRayNodeName = String
  type XRayNodeType = String
  type XRayRequestAverageLatency = Double
  type XRayRequestCount = Int
  type XRayThrottlePercent = Int

  implicit final class ApplicationInsightsOps(private val service: ApplicationInsights) extends AnyVal {

    @inline def createApplicationFuture(params: CreateApplicationRequest): Future[CreateApplicationResponse] = service.createApplication(params).promise().toFuture
    @inline def createComponentFuture(params: CreateComponentRequest): Future[CreateComponentResponse] = service.createComponent(params).promise().toFuture
    @inline def createLogPatternFuture(params: CreateLogPatternRequest): Future[CreateLogPatternResponse] = service.createLogPattern(params).promise().toFuture
    @inline def deleteApplicationFuture(params: DeleteApplicationRequest): Future[DeleteApplicationResponse] = service.deleteApplication(params).promise().toFuture
    @inline def deleteComponentFuture(params: DeleteComponentRequest): Future[DeleteComponentResponse] = service.deleteComponent(params).promise().toFuture
    @inline def deleteLogPatternFuture(params: DeleteLogPatternRequest): Future[DeleteLogPatternResponse] = service.deleteLogPattern(params).promise().toFuture
    @inline def describeApplicationFuture(params: DescribeApplicationRequest): Future[DescribeApplicationResponse] = service.describeApplication(params).promise().toFuture
    @inline def describeComponentConfigurationFuture(params: DescribeComponentConfigurationRequest): Future[DescribeComponentConfigurationResponse] = service.describeComponentConfiguration(params).promise().toFuture
    @inline def describeComponentConfigurationRecommendationFuture(params: DescribeComponentConfigurationRecommendationRequest): Future[DescribeComponentConfigurationRecommendationResponse] = service.describeComponentConfigurationRecommendation(params).promise().toFuture
    @inline def describeComponentFuture(params: DescribeComponentRequest): Future[DescribeComponentResponse] = service.describeComponent(params).promise().toFuture
    @inline def describeLogPatternFuture(params: DescribeLogPatternRequest): Future[DescribeLogPatternResponse] = service.describeLogPattern(params).promise().toFuture
    @inline def describeObservationFuture(params: DescribeObservationRequest): Future[DescribeObservationResponse] = service.describeObservation(params).promise().toFuture
    @inline def describeProblemFuture(params: DescribeProblemRequest): Future[DescribeProblemResponse] = service.describeProblem(params).promise().toFuture
    @inline def describeProblemObservationsFuture(params: DescribeProblemObservationsRequest): Future[DescribeProblemObservationsResponse] = service.describeProblemObservations(params).promise().toFuture
    @inline def listApplicationsFuture(params: ListApplicationsRequest): Future[ListApplicationsResponse] = service.listApplications(params).promise().toFuture
    @inline def listComponentsFuture(params: ListComponentsRequest): Future[ListComponentsResponse] = service.listComponents(params).promise().toFuture
    @inline def listConfigurationHistoryFuture(params: ListConfigurationHistoryRequest): Future[ListConfigurationHistoryResponse] = service.listConfigurationHistory(params).promise().toFuture
    @inline def listLogPatternSetsFuture(params: ListLogPatternSetsRequest): Future[ListLogPatternSetsResponse] = service.listLogPatternSets(params).promise().toFuture
    @inline def listLogPatternsFuture(params: ListLogPatternsRequest): Future[ListLogPatternsResponse] = service.listLogPatterns(params).promise().toFuture
    @inline def listProblemsFuture(params: ListProblemsRequest): Future[ListProblemsResponse] = service.listProblems(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] = service.listTagsForResource(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] = service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] = service.untagResource(params).promise().toFuture
    @inline def updateApplicationFuture(params: UpdateApplicationRequest): Future[UpdateApplicationResponse] = service.updateApplication(params).promise().toFuture
    @inline def updateComponentConfigurationFuture(params: UpdateComponentConfigurationRequest): Future[UpdateComponentConfigurationResponse] = service.updateComponentConfiguration(params).promise().toFuture
    @inline def updateComponentFuture(params: UpdateComponentRequest): Future[UpdateComponentResponse] = service.updateComponent(params).promise().toFuture
    @inline def updateLogPatternFuture(params: UpdateLogPatternRequest): Future[UpdateLogPatternResponse] = service.updateLogPattern(params).promise().toFuture
  }
}

package applicationinsights {
  @js.native
  @JSImport("aws-sdk", "ApplicationInsights", "AWS.ApplicationInsights")
  class ApplicationInsights() extends js.Object {
    def this(config: AWSConfig) = this()

    def createApplication(params: CreateApplicationRequest): Request[CreateApplicationResponse] = js.native
    def createComponent(params: CreateComponentRequest): Request[CreateComponentResponse] = js.native
    def createLogPattern(params: CreateLogPatternRequest): Request[CreateLogPatternResponse] = js.native
    def deleteApplication(params: DeleteApplicationRequest): Request[DeleteApplicationResponse] = js.native
    def deleteComponent(params: DeleteComponentRequest): Request[DeleteComponentResponse] = js.native
    def deleteLogPattern(params: DeleteLogPatternRequest): Request[DeleteLogPatternResponse] = js.native
    def describeApplication(params: DescribeApplicationRequest): Request[DescribeApplicationResponse] = js.native
    def describeComponent(params: DescribeComponentRequest): Request[DescribeComponentResponse] = js.native
    def describeComponentConfiguration(params: DescribeComponentConfigurationRequest): Request[DescribeComponentConfigurationResponse] = js.native
    def describeComponentConfigurationRecommendation(params: DescribeComponentConfigurationRecommendationRequest): Request[DescribeComponentConfigurationRecommendationResponse] = js.native
    def describeLogPattern(params: DescribeLogPatternRequest): Request[DescribeLogPatternResponse] = js.native
    def describeObservation(params: DescribeObservationRequest): Request[DescribeObservationResponse] = js.native
    def describeProblem(params: DescribeProblemRequest): Request[DescribeProblemResponse] = js.native
    def describeProblemObservations(params: DescribeProblemObservationsRequest): Request[DescribeProblemObservationsResponse] = js.native
    def listApplications(params: ListApplicationsRequest): Request[ListApplicationsResponse] = js.native
    def listComponents(params: ListComponentsRequest): Request[ListComponentsResponse] = js.native
    def listConfigurationHistory(params: ListConfigurationHistoryRequest): Request[ListConfigurationHistoryResponse] = js.native
    def listLogPatternSets(params: ListLogPatternSetsRequest): Request[ListLogPatternSetsResponse] = js.native
    def listLogPatterns(params: ListLogPatternsRequest): Request[ListLogPatternsResponse] = js.native
    def listProblems(params: ListProblemsRequest): Request[ListProblemsResponse] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse] = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse] = js.native
    def updateApplication(params: UpdateApplicationRequest): Request[UpdateApplicationResponse] = js.native
    def updateComponent(params: UpdateComponentRequest): Request[UpdateComponentResponse] = js.native
    def updateComponentConfiguration(params: UpdateComponentConfigurationRequest): Request[UpdateComponentConfigurationResponse] = js.native
    def updateLogPattern(params: UpdateLogPatternRequest): Request[UpdateLogPatternResponse] = js.native
  }

  /**
    * Describes a standalone resource or similarly grouped resources that the application is made up of.
    */
  @js.native
  trait ApplicationComponent extends js.Object {
    var ComponentName: js.UndefOr[ComponentName]
    var Monitor: js.UndefOr[Monitor]
    var ResourceType: js.UndefOr[ResourceType]
    var Tier: js.UndefOr[Tier]
  }

  object ApplicationComponent {
    @inline
    def apply(
        ComponentName: js.UndefOr[ComponentName] = js.undefined,
        Monitor: js.UndefOr[Monitor] = js.undefined,
        ResourceType: js.UndefOr[ResourceType] = js.undefined,
        Tier: js.UndefOr[Tier] = js.undefined
    ): ApplicationComponent = {
      val __obj = js.Dynamic.literal()
      ComponentName.foreach(__v => __obj.updateDynamic("ComponentName")(__v.asInstanceOf[js.Any]))
      Monitor.foreach(__v => __obj.updateDynamic("Monitor")(__v.asInstanceOf[js.Any]))
      ResourceType.foreach(__v => __obj.updateDynamic("ResourceType")(__v.asInstanceOf[js.Any]))
      Tier.foreach(__v => __obj.updateDynamic("Tier")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ApplicationComponent]
    }
  }

  /**
    * Describes the status of the application.
    */
  @js.native
  trait ApplicationInfo extends js.Object {
    var CWEMonitorEnabled: js.UndefOr[CWEMonitorEnabled]
    var LifeCycle: js.UndefOr[LifeCycle]
    var OpsCenterEnabled: js.UndefOr[OpsCenterEnabled]
    var OpsItemSNSTopicArn: js.UndefOr[OpsItemSNSTopicArn]
    var Remarks: js.UndefOr[Remarks]
    var ResourceGroupName: js.UndefOr[ResourceGroupName]
  }

  object ApplicationInfo {
    @inline
    def apply(
        CWEMonitorEnabled: js.UndefOr[CWEMonitorEnabled] = js.undefined,
        LifeCycle: js.UndefOr[LifeCycle] = js.undefined,
        OpsCenterEnabled: js.UndefOr[OpsCenterEnabled] = js.undefined,
        OpsItemSNSTopicArn: js.UndefOr[OpsItemSNSTopicArn] = js.undefined,
        Remarks: js.UndefOr[Remarks] = js.undefined,
        ResourceGroupName: js.UndefOr[ResourceGroupName] = js.undefined
    ): ApplicationInfo = {
      val __obj = js.Dynamic.literal()
      CWEMonitorEnabled.foreach(__v => __obj.updateDynamic("CWEMonitorEnabled")(__v.asInstanceOf[js.Any]))
      LifeCycle.foreach(__v => __obj.updateDynamic("LifeCycle")(__v.asInstanceOf[js.Any]))
      OpsCenterEnabled.foreach(__v => __obj.updateDynamic("OpsCenterEnabled")(__v.asInstanceOf[js.Any]))
      OpsItemSNSTopicArn.foreach(__v => __obj.updateDynamic("OpsItemSNSTopicArn")(__v.asInstanceOf[js.Any]))
      Remarks.foreach(__v => __obj.updateDynamic("Remarks")(__v.asInstanceOf[js.Any]))
      ResourceGroupName.foreach(__v => __obj.updateDynamic("ResourceGroupName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ApplicationInfo]
    }
  }

  @js.native
  sealed trait CloudWatchEventSource extends js.Any
  object CloudWatchEventSource {
    @inline def EC2 = "EC2".asInstanceOf[CloudWatchEventSource]
    @inline def CODE_DEPLOY = "CODE_DEPLOY".asInstanceOf[CloudWatchEventSource]
    @inline def HEALTH = "HEALTH".asInstanceOf[CloudWatchEventSource]

    @inline def values = js.Object.freeze(js.Array(EC2, CODE_DEPLOY, HEALTH))
  }

  /**
    * The event information.
    */
  @js.native
  trait ConfigurationEvent extends js.Object {
    var EventDetail: js.UndefOr[ConfigurationEventDetail]
    var EventResourceName: js.UndefOr[ConfigurationEventResourceName]
    var EventResourceType: js.UndefOr[ConfigurationEventResourceType]
    var EventStatus: js.UndefOr[ConfigurationEventStatus]
    var EventTime: js.UndefOr[ConfigurationEventTime]
    var MonitoredResourceARN: js.UndefOr[ConfigurationEventMonitoredResourceARN]
  }

  object ConfigurationEvent {
    @inline
    def apply(
        EventDetail: js.UndefOr[ConfigurationEventDetail] = js.undefined,
        EventResourceName: js.UndefOr[ConfigurationEventResourceName] = js.undefined,
        EventResourceType: js.UndefOr[ConfigurationEventResourceType] = js.undefined,
        EventStatus: js.UndefOr[ConfigurationEventStatus] = js.undefined,
        EventTime: js.UndefOr[ConfigurationEventTime] = js.undefined,
        MonitoredResourceARN: js.UndefOr[ConfigurationEventMonitoredResourceARN] = js.undefined
    ): ConfigurationEvent = {
      val __obj = js.Dynamic.literal()
      EventDetail.foreach(__v => __obj.updateDynamic("EventDetail")(__v.asInstanceOf[js.Any]))
      EventResourceName.foreach(__v => __obj.updateDynamic("EventResourceName")(__v.asInstanceOf[js.Any]))
      EventResourceType.foreach(__v => __obj.updateDynamic("EventResourceType")(__v.asInstanceOf[js.Any]))
      EventStatus.foreach(__v => __obj.updateDynamic("EventStatus")(__v.asInstanceOf[js.Any]))
      EventTime.foreach(__v => __obj.updateDynamic("EventTime")(__v.asInstanceOf[js.Any]))
      MonitoredResourceARN.foreach(__v => __obj.updateDynamic("MonitoredResourceARN")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ConfigurationEvent]
    }
  }

  @js.native
  sealed trait ConfigurationEventResourceType extends js.Any
  object ConfigurationEventResourceType {
    @inline def CLOUDWATCH_ALARM = "CLOUDWATCH_ALARM".asInstanceOf[ConfigurationEventResourceType]
    @inline def CLOUDFORMATION = "CLOUDFORMATION".asInstanceOf[ConfigurationEventResourceType]
    @inline def SSM_ASSOCIATION = "SSM_ASSOCIATION".asInstanceOf[ConfigurationEventResourceType]

    @inline def values = js.Object.freeze(js.Array(CLOUDWATCH_ALARM, CLOUDFORMATION, SSM_ASSOCIATION))
  }

  @js.native
  sealed trait ConfigurationEventStatus extends js.Any
  object ConfigurationEventStatus {
    @inline def INFO = "INFO".asInstanceOf[ConfigurationEventStatus]
    @inline def WARN = "WARN".asInstanceOf[ConfigurationEventStatus]
    @inline def ERROR = "ERROR".asInstanceOf[ConfigurationEventStatus]

    @inline def values = js.Object.freeze(js.Array(INFO, WARN, ERROR))
  }

  @js.native
  trait CreateApplicationRequest extends js.Object {
    var ResourceGroupName: ResourceGroupName
    var CWEMonitorEnabled: js.UndefOr[CWEMonitorEnabled]
    var OpsCenterEnabled: js.UndefOr[OpsCenterEnabled]
    var OpsItemSNSTopicArn: js.UndefOr[OpsItemSNSTopicArn]
    var Tags: js.UndefOr[TagList]
  }

  object CreateApplicationRequest {
    @inline
    def apply(
        ResourceGroupName: ResourceGroupName,
        CWEMonitorEnabled: js.UndefOr[CWEMonitorEnabled] = js.undefined,
        OpsCenterEnabled: js.UndefOr[OpsCenterEnabled] = js.undefined,
        OpsItemSNSTopicArn: js.UndefOr[OpsItemSNSTopicArn] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateApplicationRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceGroupName" -> ResourceGroupName.asInstanceOf[js.Any]
      )

      CWEMonitorEnabled.foreach(__v => __obj.updateDynamic("CWEMonitorEnabled")(__v.asInstanceOf[js.Any]))
      OpsCenterEnabled.foreach(__v => __obj.updateDynamic("OpsCenterEnabled")(__v.asInstanceOf[js.Any]))
      OpsItemSNSTopicArn.foreach(__v => __obj.updateDynamic("OpsItemSNSTopicArn")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateApplicationRequest]
    }
  }

  @js.native
  trait CreateApplicationResponse extends js.Object {
    var ApplicationInfo: js.UndefOr[ApplicationInfo]
  }

  object CreateApplicationResponse {
    @inline
    def apply(
        ApplicationInfo: js.UndefOr[ApplicationInfo] = js.undefined
    ): CreateApplicationResponse = {
      val __obj = js.Dynamic.literal()
      ApplicationInfo.foreach(__v => __obj.updateDynamic("ApplicationInfo")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateApplicationResponse]
    }
  }

  @js.native
  trait CreateComponentRequest extends js.Object {
    var ComponentName: ComponentName
    var ResourceGroupName: ResourceGroupName
    var ResourceList: ResourceList
  }

  object CreateComponentRequest {
    @inline
    def apply(
        ComponentName: ComponentName,
        ResourceGroupName: ResourceGroupName,
        ResourceList: ResourceList
    ): CreateComponentRequest = {
      val __obj = js.Dynamic.literal(
        "ComponentName" -> ComponentName.asInstanceOf[js.Any],
        "ResourceGroupName" -> ResourceGroupName.asInstanceOf[js.Any],
        "ResourceList" -> ResourceList.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateComponentRequest]
    }
  }

  @js.native
  trait CreateComponentResponse extends js.Object {}

  object CreateComponentResponse {
    @inline
    def apply(
    ): CreateComponentResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[CreateComponentResponse]
    }
  }

  @js.native
  trait CreateLogPatternRequest extends js.Object {
    var Pattern: LogPatternRegex
    var PatternName: LogPatternName
    var PatternSetName: LogPatternSetName
    var Rank: LogPatternRank
    var ResourceGroupName: ResourceGroupName
  }

  object CreateLogPatternRequest {
    @inline
    def apply(
        Pattern: LogPatternRegex,
        PatternName: LogPatternName,
        PatternSetName: LogPatternSetName,
        Rank: LogPatternRank,
        ResourceGroupName: ResourceGroupName
    ): CreateLogPatternRequest = {
      val __obj = js.Dynamic.literal(
        "Pattern" -> Pattern.asInstanceOf[js.Any],
        "PatternName" -> PatternName.asInstanceOf[js.Any],
        "PatternSetName" -> PatternSetName.asInstanceOf[js.Any],
        "Rank" -> Rank.asInstanceOf[js.Any],
        "ResourceGroupName" -> ResourceGroupName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateLogPatternRequest]
    }
  }

  @js.native
  trait CreateLogPatternResponse extends js.Object {
    var LogPattern: js.UndefOr[LogPattern]
    var ResourceGroupName: js.UndefOr[ResourceGroupName]
  }

  object CreateLogPatternResponse {
    @inline
    def apply(
        LogPattern: js.UndefOr[LogPattern] = js.undefined,
        ResourceGroupName: js.UndefOr[ResourceGroupName] = js.undefined
    ): CreateLogPatternResponse = {
      val __obj = js.Dynamic.literal()
      LogPattern.foreach(__v => __obj.updateDynamic("LogPattern")(__v.asInstanceOf[js.Any]))
      ResourceGroupName.foreach(__v => __obj.updateDynamic("ResourceGroupName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateLogPatternResponse]
    }
  }

  @js.native
  trait DeleteApplicationRequest extends js.Object {
    var ResourceGroupName: ResourceGroupName
  }

  object DeleteApplicationRequest {
    @inline
    def apply(
        ResourceGroupName: ResourceGroupName
    ): DeleteApplicationRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceGroupName" -> ResourceGroupName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteApplicationRequest]
    }
  }

  @js.native
  trait DeleteApplicationResponse extends js.Object {}

  object DeleteApplicationResponse {
    @inline
    def apply(
    ): DeleteApplicationResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DeleteApplicationResponse]
    }
  }

  @js.native
  trait DeleteComponentRequest extends js.Object {
    var ComponentName: ComponentName
    var ResourceGroupName: ResourceGroupName
  }

  object DeleteComponentRequest {
    @inline
    def apply(
        ComponentName: ComponentName,
        ResourceGroupName: ResourceGroupName
    ): DeleteComponentRequest = {
      val __obj = js.Dynamic.literal(
        "ComponentName" -> ComponentName.asInstanceOf[js.Any],
        "ResourceGroupName" -> ResourceGroupName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteComponentRequest]
    }
  }

  @js.native
  trait DeleteComponentResponse extends js.Object {}

  object DeleteComponentResponse {
    @inline
    def apply(
    ): DeleteComponentResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DeleteComponentResponse]
    }
  }

  @js.native
  trait DeleteLogPatternRequest extends js.Object {
    var PatternName: LogPatternName
    var PatternSetName: LogPatternSetName
    var ResourceGroupName: ResourceGroupName
  }

  object DeleteLogPatternRequest {
    @inline
    def apply(
        PatternName: LogPatternName,
        PatternSetName: LogPatternSetName,
        ResourceGroupName: ResourceGroupName
    ): DeleteLogPatternRequest = {
      val __obj = js.Dynamic.literal(
        "PatternName" -> PatternName.asInstanceOf[js.Any],
        "PatternSetName" -> PatternSetName.asInstanceOf[js.Any],
        "ResourceGroupName" -> ResourceGroupName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteLogPatternRequest]
    }
  }

  @js.native
  trait DeleteLogPatternResponse extends js.Object {}

  object DeleteLogPatternResponse {
    @inline
    def apply(
    ): DeleteLogPatternResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DeleteLogPatternResponse]
    }
  }

  @js.native
  trait DescribeApplicationRequest extends js.Object {
    var ResourceGroupName: ResourceGroupName
  }

  object DescribeApplicationRequest {
    @inline
    def apply(
        ResourceGroupName: ResourceGroupName
    ): DescribeApplicationRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceGroupName" -> ResourceGroupName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeApplicationRequest]
    }
  }

  @js.native
  trait DescribeApplicationResponse extends js.Object {
    var ApplicationInfo: js.UndefOr[ApplicationInfo]
  }

  object DescribeApplicationResponse {
    @inline
    def apply(
        ApplicationInfo: js.UndefOr[ApplicationInfo] = js.undefined
    ): DescribeApplicationResponse = {
      val __obj = js.Dynamic.literal()
      ApplicationInfo.foreach(__v => __obj.updateDynamic("ApplicationInfo")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeApplicationResponse]
    }
  }

  @js.native
  trait DescribeComponentConfigurationRecommendationRequest extends js.Object {
    var ComponentName: ComponentName
    var ResourceGroupName: ResourceGroupName
    var Tier: Tier
  }

  object DescribeComponentConfigurationRecommendationRequest {
    @inline
    def apply(
        ComponentName: ComponentName,
        ResourceGroupName: ResourceGroupName,
        Tier: Tier
    ): DescribeComponentConfigurationRecommendationRequest = {
      val __obj = js.Dynamic.literal(
        "ComponentName" -> ComponentName.asInstanceOf[js.Any],
        "ResourceGroupName" -> ResourceGroupName.asInstanceOf[js.Any],
        "Tier" -> Tier.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeComponentConfigurationRecommendationRequest]
    }
  }

  @js.native
  trait DescribeComponentConfigurationRecommendationResponse extends js.Object {
    var ComponentConfiguration: js.UndefOr[ComponentConfiguration]
  }

  object DescribeComponentConfigurationRecommendationResponse {
    @inline
    def apply(
        ComponentConfiguration: js.UndefOr[ComponentConfiguration] = js.undefined
    ): DescribeComponentConfigurationRecommendationResponse = {
      val __obj = js.Dynamic.literal()
      ComponentConfiguration.foreach(__v => __obj.updateDynamic("ComponentConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeComponentConfigurationRecommendationResponse]
    }
  }

  @js.native
  trait DescribeComponentConfigurationRequest extends js.Object {
    var ComponentName: ComponentName
    var ResourceGroupName: ResourceGroupName
  }

  object DescribeComponentConfigurationRequest {
    @inline
    def apply(
        ComponentName: ComponentName,
        ResourceGroupName: ResourceGroupName
    ): DescribeComponentConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "ComponentName" -> ComponentName.asInstanceOf[js.Any],
        "ResourceGroupName" -> ResourceGroupName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeComponentConfigurationRequest]
    }
  }

  @js.native
  trait DescribeComponentConfigurationResponse extends js.Object {
    var ComponentConfiguration: js.UndefOr[ComponentConfiguration]
    var Monitor: js.UndefOr[Monitor]
    var Tier: js.UndefOr[Tier]
  }

  object DescribeComponentConfigurationResponse {
    @inline
    def apply(
        ComponentConfiguration: js.UndefOr[ComponentConfiguration] = js.undefined,
        Monitor: js.UndefOr[Monitor] = js.undefined,
        Tier: js.UndefOr[Tier] = js.undefined
    ): DescribeComponentConfigurationResponse = {
      val __obj = js.Dynamic.literal()
      ComponentConfiguration.foreach(__v => __obj.updateDynamic("ComponentConfiguration")(__v.asInstanceOf[js.Any]))
      Monitor.foreach(__v => __obj.updateDynamic("Monitor")(__v.asInstanceOf[js.Any]))
      Tier.foreach(__v => __obj.updateDynamic("Tier")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeComponentConfigurationResponse]
    }
  }

  @js.native
  trait DescribeComponentRequest extends js.Object {
    var ComponentName: ComponentName
    var ResourceGroupName: ResourceGroupName
  }

  object DescribeComponentRequest {
    @inline
    def apply(
        ComponentName: ComponentName,
        ResourceGroupName: ResourceGroupName
    ): DescribeComponentRequest = {
      val __obj = js.Dynamic.literal(
        "ComponentName" -> ComponentName.asInstanceOf[js.Any],
        "ResourceGroupName" -> ResourceGroupName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeComponentRequest]
    }
  }

  @js.native
  trait DescribeComponentResponse extends js.Object {
    var ApplicationComponent: js.UndefOr[ApplicationComponent]
    var ResourceList: js.UndefOr[ResourceList]
  }

  object DescribeComponentResponse {
    @inline
    def apply(
        ApplicationComponent: js.UndefOr[ApplicationComponent] = js.undefined,
        ResourceList: js.UndefOr[ResourceList] = js.undefined
    ): DescribeComponentResponse = {
      val __obj = js.Dynamic.literal()
      ApplicationComponent.foreach(__v => __obj.updateDynamic("ApplicationComponent")(__v.asInstanceOf[js.Any]))
      ResourceList.foreach(__v => __obj.updateDynamic("ResourceList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeComponentResponse]
    }
  }

  @js.native
  trait DescribeLogPatternRequest extends js.Object {
    var PatternName: LogPatternName
    var PatternSetName: LogPatternSetName
    var ResourceGroupName: ResourceGroupName
  }

  object DescribeLogPatternRequest {
    @inline
    def apply(
        PatternName: LogPatternName,
        PatternSetName: LogPatternSetName,
        ResourceGroupName: ResourceGroupName
    ): DescribeLogPatternRequest = {
      val __obj = js.Dynamic.literal(
        "PatternName" -> PatternName.asInstanceOf[js.Any],
        "PatternSetName" -> PatternSetName.asInstanceOf[js.Any],
        "ResourceGroupName" -> ResourceGroupName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeLogPatternRequest]
    }
  }

  @js.native
  trait DescribeLogPatternResponse extends js.Object {
    var LogPattern: js.UndefOr[LogPattern]
    var ResourceGroupName: js.UndefOr[ResourceGroupName]
  }

  object DescribeLogPatternResponse {
    @inline
    def apply(
        LogPattern: js.UndefOr[LogPattern] = js.undefined,
        ResourceGroupName: js.UndefOr[ResourceGroupName] = js.undefined
    ): DescribeLogPatternResponse = {
      val __obj = js.Dynamic.literal()
      LogPattern.foreach(__v => __obj.updateDynamic("LogPattern")(__v.asInstanceOf[js.Any]))
      ResourceGroupName.foreach(__v => __obj.updateDynamic("ResourceGroupName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeLogPatternResponse]
    }
  }

  @js.native
  trait DescribeObservationRequest extends js.Object {
    var ObservationId: ObservationId
  }

  object DescribeObservationRequest {
    @inline
    def apply(
        ObservationId: ObservationId
    ): DescribeObservationRequest = {
      val __obj = js.Dynamic.literal(
        "ObservationId" -> ObservationId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeObservationRequest]
    }
  }

  @js.native
  trait DescribeObservationResponse extends js.Object {
    var Observation: js.UndefOr[Observation]
  }

  object DescribeObservationResponse {
    @inline
    def apply(
        Observation: js.UndefOr[Observation] = js.undefined
    ): DescribeObservationResponse = {
      val __obj = js.Dynamic.literal()
      Observation.foreach(__v => __obj.updateDynamic("Observation")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeObservationResponse]
    }
  }

  @js.native
  trait DescribeProblemObservationsRequest extends js.Object {
    var ProblemId: ProblemId
  }

  object DescribeProblemObservationsRequest {
    @inline
    def apply(
        ProblemId: ProblemId
    ): DescribeProblemObservationsRequest = {
      val __obj = js.Dynamic.literal(
        "ProblemId" -> ProblemId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeProblemObservationsRequest]
    }
  }

  @js.native
  trait DescribeProblemObservationsResponse extends js.Object {
    var RelatedObservations: js.UndefOr[RelatedObservations]
  }

  object DescribeProblemObservationsResponse {
    @inline
    def apply(
        RelatedObservations: js.UndefOr[RelatedObservations] = js.undefined
    ): DescribeProblemObservationsResponse = {
      val __obj = js.Dynamic.literal()
      RelatedObservations.foreach(__v => __obj.updateDynamic("RelatedObservations")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeProblemObservationsResponse]
    }
  }

  @js.native
  trait DescribeProblemRequest extends js.Object {
    var ProblemId: ProblemId
  }

  object DescribeProblemRequest {
    @inline
    def apply(
        ProblemId: ProblemId
    ): DescribeProblemRequest = {
      val __obj = js.Dynamic.literal(
        "ProblemId" -> ProblemId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeProblemRequest]
    }
  }

  @js.native
  trait DescribeProblemResponse extends js.Object {
    var Problem: js.UndefOr[Problem]
  }

  object DescribeProblemResponse {
    @inline
    def apply(
        Problem: js.UndefOr[Problem] = js.undefined
    ): DescribeProblemResponse = {
      val __obj = js.Dynamic.literal()
      Problem.foreach(__v => __obj.updateDynamic("Problem")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeProblemResponse]
    }
  }

  @js.native
  sealed trait FeedbackKey extends js.Any
  object FeedbackKey {
    @inline def INSIGHTS_FEEDBACK = "INSIGHTS_FEEDBACK".asInstanceOf[FeedbackKey]

    @inline def values = js.Object.freeze(js.Array(INSIGHTS_FEEDBACK))
  }

  @js.native
  sealed trait FeedbackValue extends js.Any
  object FeedbackValue {
    @inline def NOT_SPECIFIED = "NOT_SPECIFIED".asInstanceOf[FeedbackValue]
    @inline def USEFUL = "USEFUL".asInstanceOf[FeedbackValue]
    @inline def NOT_USEFUL = "NOT_USEFUL".asInstanceOf[FeedbackValue]

    @inline def values = js.Object.freeze(js.Array(NOT_SPECIFIED, USEFUL, NOT_USEFUL))
  }

  @js.native
  trait ListApplicationsRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxEntities]
    var NextToken: js.UndefOr[PaginationToken]
  }

  object ListApplicationsRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[MaxEntities] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListApplicationsRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListApplicationsRequest]
    }
  }

  @js.native
  trait ListApplicationsResponse extends js.Object {
    var ApplicationInfoList: js.UndefOr[ApplicationInfoList]
    var NextToken: js.UndefOr[PaginationToken]
  }

  object ListApplicationsResponse {
    @inline
    def apply(
        ApplicationInfoList: js.UndefOr[ApplicationInfoList] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListApplicationsResponse = {
      val __obj = js.Dynamic.literal()
      ApplicationInfoList.foreach(__v => __obj.updateDynamic("ApplicationInfoList")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListApplicationsResponse]
    }
  }

  @js.native
  trait ListComponentsRequest extends js.Object {
    var ResourceGroupName: ResourceGroupName
    var MaxResults: js.UndefOr[MaxEntities]
    var NextToken: js.UndefOr[PaginationToken]
  }

  object ListComponentsRequest {
    @inline
    def apply(
        ResourceGroupName: ResourceGroupName,
        MaxResults: js.UndefOr[MaxEntities] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListComponentsRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceGroupName" -> ResourceGroupName.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListComponentsRequest]
    }
  }

  @js.native
  trait ListComponentsResponse extends js.Object {
    var ApplicationComponentList: js.UndefOr[ApplicationComponentList]
    var NextToken: js.UndefOr[PaginationToken]
  }

  object ListComponentsResponse {
    @inline
    def apply(
        ApplicationComponentList: js.UndefOr[ApplicationComponentList] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListComponentsResponse = {
      val __obj = js.Dynamic.literal()
      ApplicationComponentList.foreach(__v => __obj.updateDynamic("ApplicationComponentList")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListComponentsResponse]
    }
  }

  @js.native
  trait ListConfigurationHistoryRequest extends js.Object {
    var EndTime: js.UndefOr[EndTime]
    var EventStatus: js.UndefOr[ConfigurationEventStatus]
    var MaxResults: js.UndefOr[MaxEntities]
    var NextToken: js.UndefOr[PaginationToken]
    var ResourceGroupName: js.UndefOr[ResourceGroupName]
    var StartTime: js.UndefOr[StartTime]
  }

  object ListConfigurationHistoryRequest {
    @inline
    def apply(
        EndTime: js.UndefOr[EndTime] = js.undefined,
        EventStatus: js.UndefOr[ConfigurationEventStatus] = js.undefined,
        MaxResults: js.UndefOr[MaxEntities] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined,
        ResourceGroupName: js.UndefOr[ResourceGroupName] = js.undefined,
        StartTime: js.UndefOr[StartTime] = js.undefined
    ): ListConfigurationHistoryRequest = {
      val __obj = js.Dynamic.literal()
      EndTime.foreach(__v => __obj.updateDynamic("EndTime")(__v.asInstanceOf[js.Any]))
      EventStatus.foreach(__v => __obj.updateDynamic("EventStatus")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      ResourceGroupName.foreach(__v => __obj.updateDynamic("ResourceGroupName")(__v.asInstanceOf[js.Any]))
      StartTime.foreach(__v => __obj.updateDynamic("StartTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListConfigurationHistoryRequest]
    }
  }

  @js.native
  trait ListConfigurationHistoryResponse extends js.Object {
    var EventList: js.UndefOr[ConfigurationEventList]
    var NextToken: js.UndefOr[PaginationToken]
  }

  object ListConfigurationHistoryResponse {
    @inline
    def apply(
        EventList: js.UndefOr[ConfigurationEventList] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListConfigurationHistoryResponse = {
      val __obj = js.Dynamic.literal()
      EventList.foreach(__v => __obj.updateDynamic("EventList")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListConfigurationHistoryResponse]
    }
  }

  @js.native
  trait ListLogPatternSetsRequest extends js.Object {
    var ResourceGroupName: ResourceGroupName
    var MaxResults: js.UndefOr[MaxEntities]
    var NextToken: js.UndefOr[PaginationToken]
  }

  object ListLogPatternSetsRequest {
    @inline
    def apply(
        ResourceGroupName: ResourceGroupName,
        MaxResults: js.UndefOr[MaxEntities] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListLogPatternSetsRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceGroupName" -> ResourceGroupName.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListLogPatternSetsRequest]
    }
  }

  @js.native
  trait ListLogPatternSetsResponse extends js.Object {
    var LogPatternSets: js.UndefOr[LogPatternSetList]
    var NextToken: js.UndefOr[PaginationToken]
    var ResourceGroupName: js.UndefOr[ResourceGroupName]
  }

  object ListLogPatternSetsResponse {
    @inline
    def apply(
        LogPatternSets: js.UndefOr[LogPatternSetList] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined,
        ResourceGroupName: js.UndefOr[ResourceGroupName] = js.undefined
    ): ListLogPatternSetsResponse = {
      val __obj = js.Dynamic.literal()
      LogPatternSets.foreach(__v => __obj.updateDynamic("LogPatternSets")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      ResourceGroupName.foreach(__v => __obj.updateDynamic("ResourceGroupName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListLogPatternSetsResponse]
    }
  }

  @js.native
  trait ListLogPatternsRequest extends js.Object {
    var ResourceGroupName: ResourceGroupName
    var MaxResults: js.UndefOr[MaxEntities]
    var NextToken: js.UndefOr[PaginationToken]
    var PatternSetName: js.UndefOr[LogPatternSetName]
  }

  object ListLogPatternsRequest {
    @inline
    def apply(
        ResourceGroupName: ResourceGroupName,
        MaxResults: js.UndefOr[MaxEntities] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined,
        PatternSetName: js.UndefOr[LogPatternSetName] = js.undefined
    ): ListLogPatternsRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceGroupName" -> ResourceGroupName.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      PatternSetName.foreach(__v => __obj.updateDynamic("PatternSetName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListLogPatternsRequest]
    }
  }

  @js.native
  trait ListLogPatternsResponse extends js.Object {
    var LogPatterns: js.UndefOr[LogPatternList]
    var NextToken: js.UndefOr[PaginationToken]
    var ResourceGroupName: js.UndefOr[ResourceGroupName]
  }

  object ListLogPatternsResponse {
    @inline
    def apply(
        LogPatterns: js.UndefOr[LogPatternList] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined,
        ResourceGroupName: js.UndefOr[ResourceGroupName] = js.undefined
    ): ListLogPatternsResponse = {
      val __obj = js.Dynamic.literal()
      LogPatterns.foreach(__v => __obj.updateDynamic("LogPatterns")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      ResourceGroupName.foreach(__v => __obj.updateDynamic("ResourceGroupName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListLogPatternsResponse]
    }
  }

  @js.native
  trait ListProblemsRequest extends js.Object {
    var EndTime: js.UndefOr[EndTime]
    var MaxResults: js.UndefOr[MaxEntities]
    var NextToken: js.UndefOr[PaginationToken]
    var ResourceGroupName: js.UndefOr[ResourceGroupName]
    var StartTime: js.UndefOr[StartTime]
  }

  object ListProblemsRequest {
    @inline
    def apply(
        EndTime: js.UndefOr[EndTime] = js.undefined,
        MaxResults: js.UndefOr[MaxEntities] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined,
        ResourceGroupName: js.UndefOr[ResourceGroupName] = js.undefined,
        StartTime: js.UndefOr[StartTime] = js.undefined
    ): ListProblemsRequest = {
      val __obj = js.Dynamic.literal()
      EndTime.foreach(__v => __obj.updateDynamic("EndTime")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      ResourceGroupName.foreach(__v => __obj.updateDynamic("ResourceGroupName")(__v.asInstanceOf[js.Any]))
      StartTime.foreach(__v => __obj.updateDynamic("StartTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListProblemsRequest]
    }
  }

  @js.native
  trait ListProblemsResponse extends js.Object {
    var NextToken: js.UndefOr[PaginationToken]
    var ProblemList: js.UndefOr[ProblemList]
  }

  object ListProblemsResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[PaginationToken] = js.undefined,
        ProblemList: js.UndefOr[ProblemList] = js.undefined
    ): ListProblemsResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      ProblemList.foreach(__v => __obj.updateDynamic("ProblemList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListProblemsResponse]
    }
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var ResourceARN: AmazonResourceName
  }

  object ListTagsForResourceRequest {
    @inline
    def apply(
        ResourceARN: AmazonResourceName
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
  sealed trait LogFilter extends js.Any
  object LogFilter {
    @inline def ERROR = "ERROR".asInstanceOf[LogFilter]
    @inline def WARN = "WARN".asInstanceOf[LogFilter]
    @inline def INFO = "INFO".asInstanceOf[LogFilter]

    @inline def values = js.Object.freeze(js.Array(ERROR, WARN, INFO))
  }

  /**
    * An object that defines the log patterns that belongs to a <code>LogPatternSet</code>.
    */
  @js.native
  trait LogPattern extends js.Object {
    var Pattern: js.UndefOr[LogPatternRegex]
    var PatternName: js.UndefOr[LogPatternName]
    var PatternSetName: js.UndefOr[LogPatternSetName]
    var Rank: js.UndefOr[LogPatternRank]
  }

  object LogPattern {
    @inline
    def apply(
        Pattern: js.UndefOr[LogPatternRegex] = js.undefined,
        PatternName: js.UndefOr[LogPatternName] = js.undefined,
        PatternSetName: js.UndefOr[LogPatternSetName] = js.undefined,
        Rank: js.UndefOr[LogPatternRank] = js.undefined
    ): LogPattern = {
      val __obj = js.Dynamic.literal()
      Pattern.foreach(__v => __obj.updateDynamic("Pattern")(__v.asInstanceOf[js.Any]))
      PatternName.foreach(__v => __obj.updateDynamic("PatternName")(__v.asInstanceOf[js.Any]))
      PatternSetName.foreach(__v => __obj.updateDynamic("PatternSetName")(__v.asInstanceOf[js.Any]))
      Rank.foreach(__v => __obj.updateDynamic("Rank")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LogPattern]
    }
  }

  /**
    * Describes an anomaly or error with the application.
    */
  @js.native
  trait Observation extends js.Object {
    var CloudWatchEventDetailType: js.UndefOr[CloudWatchEventDetailType]
    var CloudWatchEventId: js.UndefOr[CloudWatchEventId]
    var CloudWatchEventSource: js.UndefOr[CloudWatchEventSource]
    var CodeDeployApplication: js.UndefOr[CodeDeployApplication]
    var CodeDeployDeploymentGroup: js.UndefOr[CodeDeployDeploymentGroup]
    var CodeDeployDeploymentId: js.UndefOr[CodeDeployDeploymentId]
    var CodeDeployInstanceGroupId: js.UndefOr[CodeDeployInstanceGroupId]
    var CodeDeployState: js.UndefOr[CodeDeployState]
    var Ec2State: js.UndefOr[Ec2State]
    var EndTime: js.UndefOr[EndTime]
    var HealthEventArn: js.UndefOr[HealthEventArn]
    var HealthEventDescription: js.UndefOr[HealthEventDescription]
    var HealthEventTypeCategory: js.UndefOr[HealthEventTypeCategory]
    var HealthEventTypeCode: js.UndefOr[HealthEventTypeCode]
    var HealthService: js.UndefOr[HealthService]
    var Id: js.UndefOr[ObservationId]
    var LineTime: js.UndefOr[LineTime]
    var LogFilter: js.UndefOr[LogFilter]
    var LogGroup: js.UndefOr[LogGroup]
    var LogText: js.UndefOr[LogText]
    var MetricName: js.UndefOr[MetricName]
    var MetricNamespace: js.UndefOr[MetricNamespace]
    var SourceARN: js.UndefOr[SourceARN]
    var SourceType: js.UndefOr[SourceType]
    var StartTime: js.UndefOr[StartTime]
    var Unit: js.UndefOr[Unit]
    var Value: js.UndefOr[Value]
    var XRayErrorPercent: js.UndefOr[XRayErrorPercent]
    var XRayFaultPercent: js.UndefOr[XRayFaultPercent]
    var XRayNodeName: js.UndefOr[XRayNodeName]
    var XRayNodeType: js.UndefOr[XRayNodeType]
    var XRayRequestAverageLatency: js.UndefOr[XRayRequestAverageLatency]
    var XRayRequestCount: js.UndefOr[XRayRequestCount]
    var XRayThrottlePercent: js.UndefOr[XRayThrottlePercent]
  }

  object Observation {
    @inline
    def apply(
        CloudWatchEventDetailType: js.UndefOr[CloudWatchEventDetailType] = js.undefined,
        CloudWatchEventId: js.UndefOr[CloudWatchEventId] = js.undefined,
        CloudWatchEventSource: js.UndefOr[CloudWatchEventSource] = js.undefined,
        CodeDeployApplication: js.UndefOr[CodeDeployApplication] = js.undefined,
        CodeDeployDeploymentGroup: js.UndefOr[CodeDeployDeploymentGroup] = js.undefined,
        CodeDeployDeploymentId: js.UndefOr[CodeDeployDeploymentId] = js.undefined,
        CodeDeployInstanceGroupId: js.UndefOr[CodeDeployInstanceGroupId] = js.undefined,
        CodeDeployState: js.UndefOr[CodeDeployState] = js.undefined,
        Ec2State: js.UndefOr[Ec2State] = js.undefined,
        EndTime: js.UndefOr[EndTime] = js.undefined,
        HealthEventArn: js.UndefOr[HealthEventArn] = js.undefined,
        HealthEventDescription: js.UndefOr[HealthEventDescription] = js.undefined,
        HealthEventTypeCategory: js.UndefOr[HealthEventTypeCategory] = js.undefined,
        HealthEventTypeCode: js.UndefOr[HealthEventTypeCode] = js.undefined,
        HealthService: js.UndefOr[HealthService] = js.undefined,
        Id: js.UndefOr[ObservationId] = js.undefined,
        LineTime: js.UndefOr[LineTime] = js.undefined,
        LogFilter: js.UndefOr[LogFilter] = js.undefined,
        LogGroup: js.UndefOr[LogGroup] = js.undefined,
        LogText: js.UndefOr[LogText] = js.undefined,
        MetricName: js.UndefOr[MetricName] = js.undefined,
        MetricNamespace: js.UndefOr[MetricNamespace] = js.undefined,
        SourceARN: js.UndefOr[SourceARN] = js.undefined,
        SourceType: js.UndefOr[SourceType] = js.undefined,
        StartTime: js.UndefOr[StartTime] = js.undefined,
        Unit: js.UndefOr[Unit] = js.undefined,
        Value: js.UndefOr[Value] = js.undefined,
        XRayErrorPercent: js.UndefOr[XRayErrorPercent] = js.undefined,
        XRayFaultPercent: js.UndefOr[XRayFaultPercent] = js.undefined,
        XRayNodeName: js.UndefOr[XRayNodeName] = js.undefined,
        XRayNodeType: js.UndefOr[XRayNodeType] = js.undefined,
        XRayRequestAverageLatency: js.UndefOr[XRayRequestAverageLatency] = js.undefined,
        XRayRequestCount: js.UndefOr[XRayRequestCount] = js.undefined,
        XRayThrottlePercent: js.UndefOr[XRayThrottlePercent] = js.undefined
    ): Observation = {
      val __obj = js.Dynamic.literal()
      CloudWatchEventDetailType.foreach(__v => __obj.updateDynamic("CloudWatchEventDetailType")(__v.asInstanceOf[js.Any]))
      CloudWatchEventId.foreach(__v => __obj.updateDynamic("CloudWatchEventId")(__v.asInstanceOf[js.Any]))
      CloudWatchEventSource.foreach(__v => __obj.updateDynamic("CloudWatchEventSource")(__v.asInstanceOf[js.Any]))
      CodeDeployApplication.foreach(__v => __obj.updateDynamic("CodeDeployApplication")(__v.asInstanceOf[js.Any]))
      CodeDeployDeploymentGroup.foreach(__v => __obj.updateDynamic("CodeDeployDeploymentGroup")(__v.asInstanceOf[js.Any]))
      CodeDeployDeploymentId.foreach(__v => __obj.updateDynamic("CodeDeployDeploymentId")(__v.asInstanceOf[js.Any]))
      CodeDeployInstanceGroupId.foreach(__v => __obj.updateDynamic("CodeDeployInstanceGroupId")(__v.asInstanceOf[js.Any]))
      CodeDeployState.foreach(__v => __obj.updateDynamic("CodeDeployState")(__v.asInstanceOf[js.Any]))
      Ec2State.foreach(__v => __obj.updateDynamic("Ec2State")(__v.asInstanceOf[js.Any]))
      EndTime.foreach(__v => __obj.updateDynamic("EndTime")(__v.asInstanceOf[js.Any]))
      HealthEventArn.foreach(__v => __obj.updateDynamic("HealthEventArn")(__v.asInstanceOf[js.Any]))
      HealthEventDescription.foreach(__v => __obj.updateDynamic("HealthEventDescription")(__v.asInstanceOf[js.Any]))
      HealthEventTypeCategory.foreach(__v => __obj.updateDynamic("HealthEventTypeCategory")(__v.asInstanceOf[js.Any]))
      HealthEventTypeCode.foreach(__v => __obj.updateDynamic("HealthEventTypeCode")(__v.asInstanceOf[js.Any]))
      HealthService.foreach(__v => __obj.updateDynamic("HealthService")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      LineTime.foreach(__v => __obj.updateDynamic("LineTime")(__v.asInstanceOf[js.Any]))
      LogFilter.foreach(__v => __obj.updateDynamic("LogFilter")(__v.asInstanceOf[js.Any]))
      LogGroup.foreach(__v => __obj.updateDynamic("LogGroup")(__v.asInstanceOf[js.Any]))
      LogText.foreach(__v => __obj.updateDynamic("LogText")(__v.asInstanceOf[js.Any]))
      MetricName.foreach(__v => __obj.updateDynamic("MetricName")(__v.asInstanceOf[js.Any]))
      MetricNamespace.foreach(__v => __obj.updateDynamic("MetricNamespace")(__v.asInstanceOf[js.Any]))
      SourceARN.foreach(__v => __obj.updateDynamic("SourceARN")(__v.asInstanceOf[js.Any]))
      SourceType.foreach(__v => __obj.updateDynamic("SourceType")(__v.asInstanceOf[js.Any]))
      StartTime.foreach(__v => __obj.updateDynamic("StartTime")(__v.asInstanceOf[js.Any]))
      Unit.foreach(__v => __obj.updateDynamic("Unit")(__v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      XRayErrorPercent.foreach(__v => __obj.updateDynamic("XRayErrorPercent")(__v.asInstanceOf[js.Any]))
      XRayFaultPercent.foreach(__v => __obj.updateDynamic("XRayFaultPercent")(__v.asInstanceOf[js.Any]))
      XRayNodeName.foreach(__v => __obj.updateDynamic("XRayNodeName")(__v.asInstanceOf[js.Any]))
      XRayNodeType.foreach(__v => __obj.updateDynamic("XRayNodeType")(__v.asInstanceOf[js.Any]))
      XRayRequestAverageLatency.foreach(__v => __obj.updateDynamic("XRayRequestAverageLatency")(__v.asInstanceOf[js.Any]))
      XRayRequestCount.foreach(__v => __obj.updateDynamic("XRayRequestCount")(__v.asInstanceOf[js.Any]))
      XRayThrottlePercent.foreach(__v => __obj.updateDynamic("XRayThrottlePercent")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Observation]
    }
  }

  /**
    * Describes a problem that is detected by correlating observations.
    */
  @js.native
  trait Problem extends js.Object {
    var AffectedResource: js.UndefOr[AffectedResource]
    var EndTime: js.UndefOr[EndTime]
    var Feedback: js.UndefOr[Feedback]
    var Id: js.UndefOr[ProblemId]
    var Insights: js.UndefOr[Insights]
    var ResourceGroupName: js.UndefOr[ResourceGroupName]
    var SeverityLevel: js.UndefOr[SeverityLevel]
    var StartTime: js.UndefOr[StartTime]
    var Status: js.UndefOr[Status]
    var Title: js.UndefOr[Title]
  }

  object Problem {
    @inline
    def apply(
        AffectedResource: js.UndefOr[AffectedResource] = js.undefined,
        EndTime: js.UndefOr[EndTime] = js.undefined,
        Feedback: js.UndefOr[Feedback] = js.undefined,
        Id: js.UndefOr[ProblemId] = js.undefined,
        Insights: js.UndefOr[Insights] = js.undefined,
        ResourceGroupName: js.UndefOr[ResourceGroupName] = js.undefined,
        SeverityLevel: js.UndefOr[SeverityLevel] = js.undefined,
        StartTime: js.UndefOr[StartTime] = js.undefined,
        Status: js.UndefOr[Status] = js.undefined,
        Title: js.UndefOr[Title] = js.undefined
    ): Problem = {
      val __obj = js.Dynamic.literal()
      AffectedResource.foreach(__v => __obj.updateDynamic("AffectedResource")(__v.asInstanceOf[js.Any]))
      EndTime.foreach(__v => __obj.updateDynamic("EndTime")(__v.asInstanceOf[js.Any]))
      Feedback.foreach(__v => __obj.updateDynamic("Feedback")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      Insights.foreach(__v => __obj.updateDynamic("Insights")(__v.asInstanceOf[js.Any]))
      ResourceGroupName.foreach(__v => __obj.updateDynamic("ResourceGroupName")(__v.asInstanceOf[js.Any]))
      SeverityLevel.foreach(__v => __obj.updateDynamic("SeverityLevel")(__v.asInstanceOf[js.Any]))
      StartTime.foreach(__v => __obj.updateDynamic("StartTime")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      Title.foreach(__v => __obj.updateDynamic("Title")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Problem]
    }
  }

  /**
    * Describes observations related to the problem.
    */
  @js.native
  trait RelatedObservations extends js.Object {
    var ObservationList: js.UndefOr[ObservationList]
  }

  object RelatedObservations {
    @inline
    def apply(
        ObservationList: js.UndefOr[ObservationList] = js.undefined
    ): RelatedObservations = {
      val __obj = js.Dynamic.literal()
      ObservationList.foreach(__v => __obj.updateDynamic("ObservationList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RelatedObservations]
    }
  }

  @js.native
  sealed trait SeverityLevel extends js.Any
  object SeverityLevel {
    @inline def Low = "Low".asInstanceOf[SeverityLevel]
    @inline def Medium = "Medium".asInstanceOf[SeverityLevel]
    @inline def High = "High".asInstanceOf[SeverityLevel]

    @inline def values = js.Object.freeze(js.Array(Low, Medium, High))
  }

  @js.native
  sealed trait Status extends js.Any
  object Status {
    @inline def IGNORE = "IGNORE".asInstanceOf[Status]
    @inline def RESOLVED = "RESOLVED".asInstanceOf[Status]
    @inline def PENDING = "PENDING".asInstanceOf[Status]

    @inline def values = js.Object.freeze(js.Array(IGNORE, RESOLVED, PENDING))
  }

  /**
    * An object that defines the tags associated with an application. A <i>tag</i> is a label that you optionally define and associate with an application. Tags can help you categorize and manage resources in different ways, such as by purpose, owner, environment, or other criteria.
    *  Each tag consists of a required <i>tag key</i> and an associated <i>tag value</i>, both of which you define. A tag key is a general label that acts as a category for a more specific tag value. A tag value acts as a descriptor within a tag key. A tag key can contain as many as 128 characters. A tag value can contain as many as 256 characters. The characters can be Unicode letters, digits, white space, or one of the following symbols: _ . : / = + -. The following additional restrictions apply to tags:
    * * Tag keys and values are case sensitive.
    *  * For each associated resource, each tag key must be unique and it can have only one value.
    *  * The <code>aws:</code> prefix is reserved for use by AWS; you can’t use it in any tag keys or values that you define. In addition, you can't edit or remove tag keys or values that use this prefix.
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
    var ResourceARN: AmazonResourceName
    var Tags: TagList
  }

  object TagResourceRequest {
    @inline
    def apply(
        ResourceARN: AmazonResourceName,
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
  trait TagResourceResponse extends js.Object {}

  object TagResourceResponse {
    @inline
    def apply(
    ): TagResourceResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[TagResourceResponse]
    }
  }

  @js.native
  sealed trait Tier extends js.Any
  object Tier {
    @inline def DEFAULT = "DEFAULT".asInstanceOf[Tier]
    @inline def DOT_NET_CORE = "DOT_NET_CORE".asInstanceOf[Tier]
    @inline def DOT_NET_WORKER = "DOT_NET_WORKER".asInstanceOf[Tier]
    @inline def DOT_NET_WEB = "DOT_NET_WEB".asInstanceOf[Tier]
    @inline def SQL_SERVER = "SQL_SERVER".asInstanceOf[Tier]

    @inline def values = js.Object.freeze(js.Array(DEFAULT, DOT_NET_CORE, DOT_NET_WORKER, DOT_NET_WEB, SQL_SERVER))
  }

  @js.native
  trait UntagResourceRequest extends js.Object {
    var ResourceARN: AmazonResourceName
    var TagKeys: TagKeyList
  }

  object UntagResourceRequest {
    @inline
    def apply(
        ResourceARN: AmazonResourceName,
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
  trait UntagResourceResponse extends js.Object {}

  object UntagResourceResponse {
    @inline
    def apply(
    ): UntagResourceResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[UntagResourceResponse]
    }
  }

  @js.native
  trait UpdateApplicationRequest extends js.Object {
    var ResourceGroupName: ResourceGroupName
    var CWEMonitorEnabled: js.UndefOr[CWEMonitorEnabled]
    var OpsCenterEnabled: js.UndefOr[OpsCenterEnabled]
    var OpsItemSNSTopicArn: js.UndefOr[OpsItemSNSTopicArn]
    var RemoveSNSTopic: js.UndefOr[RemoveSNSTopic]
  }

  object UpdateApplicationRequest {
    @inline
    def apply(
        ResourceGroupName: ResourceGroupName,
        CWEMonitorEnabled: js.UndefOr[CWEMonitorEnabled] = js.undefined,
        OpsCenterEnabled: js.UndefOr[OpsCenterEnabled] = js.undefined,
        OpsItemSNSTopicArn: js.UndefOr[OpsItemSNSTopicArn] = js.undefined,
        RemoveSNSTopic: js.UndefOr[RemoveSNSTopic] = js.undefined
    ): UpdateApplicationRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceGroupName" -> ResourceGroupName.asInstanceOf[js.Any]
      )

      CWEMonitorEnabled.foreach(__v => __obj.updateDynamic("CWEMonitorEnabled")(__v.asInstanceOf[js.Any]))
      OpsCenterEnabled.foreach(__v => __obj.updateDynamic("OpsCenterEnabled")(__v.asInstanceOf[js.Any]))
      OpsItemSNSTopicArn.foreach(__v => __obj.updateDynamic("OpsItemSNSTopicArn")(__v.asInstanceOf[js.Any]))
      RemoveSNSTopic.foreach(__v => __obj.updateDynamic("RemoveSNSTopic")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateApplicationRequest]
    }
  }

  @js.native
  trait UpdateApplicationResponse extends js.Object {
    var ApplicationInfo: js.UndefOr[ApplicationInfo]
  }

  object UpdateApplicationResponse {
    @inline
    def apply(
        ApplicationInfo: js.UndefOr[ApplicationInfo] = js.undefined
    ): UpdateApplicationResponse = {
      val __obj = js.Dynamic.literal()
      ApplicationInfo.foreach(__v => __obj.updateDynamic("ApplicationInfo")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateApplicationResponse]
    }
  }

  @js.native
  trait UpdateComponentConfigurationRequest extends js.Object {
    var ComponentName: ComponentName
    var ResourceGroupName: ResourceGroupName
    var ComponentConfiguration: js.UndefOr[ComponentConfiguration]
    var Monitor: js.UndefOr[Monitor]
    var Tier: js.UndefOr[Tier]
  }

  object UpdateComponentConfigurationRequest {
    @inline
    def apply(
        ComponentName: ComponentName,
        ResourceGroupName: ResourceGroupName,
        ComponentConfiguration: js.UndefOr[ComponentConfiguration] = js.undefined,
        Monitor: js.UndefOr[Monitor] = js.undefined,
        Tier: js.UndefOr[Tier] = js.undefined
    ): UpdateComponentConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "ComponentName" -> ComponentName.asInstanceOf[js.Any],
        "ResourceGroupName" -> ResourceGroupName.asInstanceOf[js.Any]
      )

      ComponentConfiguration.foreach(__v => __obj.updateDynamic("ComponentConfiguration")(__v.asInstanceOf[js.Any]))
      Monitor.foreach(__v => __obj.updateDynamic("Monitor")(__v.asInstanceOf[js.Any]))
      Tier.foreach(__v => __obj.updateDynamic("Tier")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateComponentConfigurationRequest]
    }
  }

  @js.native
  trait UpdateComponentConfigurationResponse extends js.Object {}

  object UpdateComponentConfigurationResponse {
    @inline
    def apply(
    ): UpdateComponentConfigurationResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[UpdateComponentConfigurationResponse]
    }
  }

  @js.native
  trait UpdateComponentRequest extends js.Object {
    var ComponentName: ComponentName
    var ResourceGroupName: ResourceGroupName
    var NewComponentName: js.UndefOr[NewComponentName]
    var ResourceList: js.UndefOr[ResourceList]
  }

  object UpdateComponentRequest {
    @inline
    def apply(
        ComponentName: ComponentName,
        ResourceGroupName: ResourceGroupName,
        NewComponentName: js.UndefOr[NewComponentName] = js.undefined,
        ResourceList: js.UndefOr[ResourceList] = js.undefined
    ): UpdateComponentRequest = {
      val __obj = js.Dynamic.literal(
        "ComponentName" -> ComponentName.asInstanceOf[js.Any],
        "ResourceGroupName" -> ResourceGroupName.asInstanceOf[js.Any]
      )

      NewComponentName.foreach(__v => __obj.updateDynamic("NewComponentName")(__v.asInstanceOf[js.Any]))
      ResourceList.foreach(__v => __obj.updateDynamic("ResourceList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateComponentRequest]
    }
  }

  @js.native
  trait UpdateComponentResponse extends js.Object {}

  object UpdateComponentResponse {
    @inline
    def apply(
    ): UpdateComponentResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[UpdateComponentResponse]
    }
  }

  @js.native
  trait UpdateLogPatternRequest extends js.Object {
    var PatternName: LogPatternName
    var PatternSetName: LogPatternSetName
    var ResourceGroupName: ResourceGroupName
    var Pattern: js.UndefOr[LogPatternRegex]
    var Rank: js.UndefOr[LogPatternRank]
  }

  object UpdateLogPatternRequest {
    @inline
    def apply(
        PatternName: LogPatternName,
        PatternSetName: LogPatternSetName,
        ResourceGroupName: ResourceGroupName,
        Pattern: js.UndefOr[LogPatternRegex] = js.undefined,
        Rank: js.UndefOr[LogPatternRank] = js.undefined
    ): UpdateLogPatternRequest = {
      val __obj = js.Dynamic.literal(
        "PatternName" -> PatternName.asInstanceOf[js.Any],
        "PatternSetName" -> PatternSetName.asInstanceOf[js.Any],
        "ResourceGroupName" -> ResourceGroupName.asInstanceOf[js.Any]
      )

      Pattern.foreach(__v => __obj.updateDynamic("Pattern")(__v.asInstanceOf[js.Any]))
      Rank.foreach(__v => __obj.updateDynamic("Rank")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateLogPatternRequest]
    }
  }

  @js.native
  trait UpdateLogPatternResponse extends js.Object {
    var LogPattern: js.UndefOr[LogPattern]
    var ResourceGroupName: js.UndefOr[ResourceGroupName]
  }

  object UpdateLogPatternResponse {
    @inline
    def apply(
        LogPattern: js.UndefOr[LogPattern] = js.undefined,
        ResourceGroupName: js.UndefOr[ResourceGroupName] = js.undefined
    ): UpdateLogPatternResponse = {
      val __obj = js.Dynamic.literal()
      LogPattern.foreach(__v => __obj.updateDynamic("LogPattern")(__v.asInstanceOf[js.Any]))
      ResourceGroupName.foreach(__v => __obj.updateDynamic("ResourceGroupName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateLogPatternResponse]
    }
  }
}
