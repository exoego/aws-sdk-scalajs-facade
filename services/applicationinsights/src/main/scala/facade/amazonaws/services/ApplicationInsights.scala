package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object applicationinsights {
  type AffectedResource                       = String
  type AmazonResourceName                     = String
  type ApplicationComponentList               = js.Array[ApplicationComponent]
  type ApplicationInfoList                    = js.Array[ApplicationInfo]
  type ComponentConfiguration                 = String
  type ComponentName                          = String
  type ConfigurationEventDetail               = String
  type ConfigurationEventList                 = js.Array[ConfigurationEvent]
  type ConfigurationEventMonitoredResourceARN = String
  type ConfigurationEventResourceName         = String
  type ConfigurationEventTime                 = js.Date
  type EndTime                                = js.Date
  type Feedback                               = js.Dictionary[FeedbackValue]
  type Insights                               = String
  type LifeCycle                              = String
  type LineTime                               = js.Date
  type LogGroup                               = String
  type LogPatternList                         = js.Array[LogPattern]
  type LogPatternName                         = String
  type LogPatternRank                         = Int
  type LogPatternRegex                        = String
  type LogPatternSetList                      = js.Array[LogPatternSetName]
  type LogPatternSetName                      = String
  type LogText                                = String
  type MaxEntities                            = Int
  type MetricName                             = String
  type MetricNamespace                        = String
  type Monitor                                = Boolean
  type NewComponentName                       = String
  type ObservationId                          = String
  type ObservationList                        = js.Array[Observation]
  type OpsCenterEnabled                       = Boolean
  type OpsItemSNSTopicArn                     = String
  type PaginationToken                        = String
  type ProblemId                              = String
  type ProblemList                            = js.Array[Problem]
  type Remarks                                = String
  type RemoveSNSTopic                         = Boolean
  type ResourceARN                            = String
  type ResourceGroupName                      = String
  type ResourceList                           = js.Array[ResourceARN]
  type ResourceType                           = String
  type SourceARN                              = String
  type SourceType                             = String
  type StartTime                              = js.Date
  type TagKey                                 = String
  type TagKeyList                             = js.Array[TagKey]
  type TagList                                = js.Array[Tag]
  type TagValue                               = String
  type Title                                  = String
  type Unit                                   = String
  type Value                                  = Double

  implicit final class ApplicationInsightsOps(private val service: ApplicationInsights) extends AnyVal {

    @inline def createApplicationFuture(params: CreateApplicationRequest): Future[CreateApplicationResponse] =
      service.createApplication(params).promise().toFuture
    @inline def createComponentFuture(params: CreateComponentRequest): Future[CreateComponentResponse] =
      service.createComponent(params).promise().toFuture
    @inline def createLogPatternFuture(params: CreateLogPatternRequest): Future[CreateLogPatternResponse] =
      service.createLogPattern(params).promise().toFuture
    @inline def deleteApplicationFuture(params: DeleteApplicationRequest): Future[DeleteApplicationResponse] =
      service.deleteApplication(params).promise().toFuture
    @inline def deleteComponentFuture(params: DeleteComponentRequest): Future[DeleteComponentResponse] =
      service.deleteComponent(params).promise().toFuture
    @inline def deleteLogPatternFuture(params: DeleteLogPatternRequest): Future[DeleteLogPatternResponse] =
      service.deleteLogPattern(params).promise().toFuture
    @inline def describeApplicationFuture(params: DescribeApplicationRequest): Future[DescribeApplicationResponse] =
      service.describeApplication(params).promise().toFuture
    @inline def describeComponentConfigurationFuture(
        params: DescribeComponentConfigurationRequest
    ): Future[DescribeComponentConfigurationResponse] =
      service.describeComponentConfiguration(params).promise().toFuture
    @inline def describeComponentConfigurationRecommendationFuture(
        params: DescribeComponentConfigurationRecommendationRequest
    ): Future[DescribeComponentConfigurationRecommendationResponse] =
      service.describeComponentConfigurationRecommendation(params).promise().toFuture
    @inline def describeComponentFuture(params: DescribeComponentRequest): Future[DescribeComponentResponse] =
      service.describeComponent(params).promise().toFuture
    @inline def describeLogPatternFuture(params: DescribeLogPatternRequest): Future[DescribeLogPatternResponse] =
      service.describeLogPattern(params).promise().toFuture
    @inline def describeObservationFuture(params: DescribeObservationRequest): Future[DescribeObservationResponse] =
      service.describeObservation(params).promise().toFuture
    @inline def describeProblemFuture(params: DescribeProblemRequest): Future[DescribeProblemResponse] =
      service.describeProblem(params).promise().toFuture
    @inline def describeProblemObservationsFuture(
        params: DescribeProblemObservationsRequest
    ): Future[DescribeProblemObservationsResponse] = service.describeProblemObservations(params).promise().toFuture
    @inline def listApplicationsFuture(params: ListApplicationsRequest): Future[ListApplicationsResponse] =
      service.listApplications(params).promise().toFuture
    @inline def listComponentsFuture(params: ListComponentsRequest): Future[ListComponentsResponse] =
      service.listComponents(params).promise().toFuture
    @inline def listConfigurationHistoryFuture(
        params: ListConfigurationHistoryRequest
    ): Future[ListConfigurationHistoryResponse] = service.listConfigurationHistory(params).promise().toFuture
    @inline def listLogPatternSetsFuture(params: ListLogPatternSetsRequest): Future[ListLogPatternSetsResponse] =
      service.listLogPatternSets(params).promise().toFuture
    @inline def listLogPatternsFuture(params: ListLogPatternsRequest): Future[ListLogPatternsResponse] =
      service.listLogPatterns(params).promise().toFuture
    @inline def listProblemsFuture(params: ListProblemsRequest): Future[ListProblemsResponse] =
      service.listProblems(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] =
      service.listTagsForResource(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] =
      service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] =
      service.untagResource(params).promise().toFuture
    @inline def updateApplicationFuture(params: UpdateApplicationRequest): Future[UpdateApplicationResponse] =
      service.updateApplication(params).promise().toFuture
    @inline def updateComponentConfigurationFuture(
        params: UpdateComponentConfigurationRequest
    ): Future[UpdateComponentConfigurationResponse] = service.updateComponentConfiguration(params).promise().toFuture
    @inline def updateComponentFuture(params: UpdateComponentRequest): Future[UpdateComponentResponse] =
      service.updateComponent(params).promise().toFuture
    @inline def updateLogPatternFuture(params: UpdateLogPatternRequest): Future[UpdateLogPatternResponse] =
      service.updateLogPattern(params).promise().toFuture
  }
}

package applicationinsights {
  @js.native
  @JSImport("aws-sdk", "ApplicationInsights")
  class ApplicationInsights() extends js.Object {
    def this(config: AWSConfig) = this()

    def createApplication(params: CreateApplicationRequest): Request[CreateApplicationResponse]       = js.native
    def createComponent(params: CreateComponentRequest): Request[CreateComponentResponse]             = js.native
    def createLogPattern(params: CreateLogPatternRequest): Request[CreateLogPatternResponse]          = js.native
    def deleteApplication(params: DeleteApplicationRequest): Request[DeleteApplicationResponse]       = js.native
    def deleteComponent(params: DeleteComponentRequest): Request[DeleteComponentResponse]             = js.native
    def deleteLogPattern(params: DeleteLogPatternRequest): Request[DeleteLogPatternResponse]          = js.native
    def describeApplication(params: DescribeApplicationRequest): Request[DescribeApplicationResponse] = js.native
    def describeComponent(params: DescribeComponentRequest): Request[DescribeComponentResponse]       = js.native
    def describeComponentConfiguration(
        params: DescribeComponentConfigurationRequest
    ): Request[DescribeComponentConfigurationResponse] = js.native
    def describeComponentConfigurationRecommendation(
        params: DescribeComponentConfigurationRecommendationRequest
    ): Request[DescribeComponentConfigurationRecommendationResponse]                                  = js.native
    def describeLogPattern(params: DescribeLogPatternRequest): Request[DescribeLogPatternResponse]    = js.native
    def describeObservation(params: DescribeObservationRequest): Request[DescribeObservationResponse] = js.native
    def describeProblem(params: DescribeProblemRequest): Request[DescribeProblemResponse]             = js.native
    def describeProblemObservations(
        params: DescribeProblemObservationsRequest
    ): Request[DescribeProblemObservationsResponse]                                          = js.native
    def listApplications(params: ListApplicationsRequest): Request[ListApplicationsResponse] = js.native
    def listComponents(params: ListComponentsRequest): Request[ListComponentsResponse]       = js.native
    def listConfigurationHistory(params: ListConfigurationHistoryRequest): Request[ListConfigurationHistoryResponse] =
      js.native
    def listLogPatternSets(params: ListLogPatternSetsRequest): Request[ListLogPatternSetsResponse]    = js.native
    def listLogPatterns(params: ListLogPatternsRequest): Request[ListLogPatternsResponse]             = js.native
    def listProblems(params: ListProblemsRequest): Request[ListProblemsResponse]                      = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse]                         = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse]                   = js.native
    def updateApplication(params: UpdateApplicationRequest): Request[UpdateApplicationResponse]       = js.native
    def updateComponent(params: UpdateComponentRequest): Request[UpdateComponentResponse]             = js.native
    def updateComponentConfiguration(
        params: UpdateComponentConfigurationRequest
    ): Request[UpdateComponentConfigurationResponse]                                         = js.native
    def updateLogPattern(params: UpdateLogPatternRequest): Request[UpdateLogPatternResponse] = js.native
  }

  /**
    * Describes a standalone resource or similarly grouped resources that the application is made up of.
    */
  @js.native
  @Factory
  trait ApplicationComponent extends js.Object {
    var ComponentName: js.UndefOr[ComponentName]
    var Monitor: js.UndefOr[Monitor]
    var ResourceType: js.UndefOr[ResourceType]
    var Tier: js.UndefOr[Tier]
  }

  /**
    * Describes the status of the application.
    */
  @js.native
  @Factory
  trait ApplicationInfo extends js.Object {
    var LifeCycle: js.UndefOr[LifeCycle]
    var OpsCenterEnabled: js.UndefOr[OpsCenterEnabled]
    var OpsItemSNSTopicArn: js.UndefOr[OpsItemSNSTopicArn]
    var Remarks: js.UndefOr[Remarks]
    var ResourceGroupName: js.UndefOr[ResourceGroupName]
  }

  /**
    * The event information.
    */
  @js.native
  @Factory
  trait ConfigurationEvent extends js.Object {
    var EventDetail: js.UndefOr[ConfigurationEventDetail]
    var EventResourceName: js.UndefOr[ConfigurationEventResourceName]
    var EventResourceType: js.UndefOr[ConfigurationEventResourceType]
    var EventStatus: js.UndefOr[ConfigurationEventStatus]
    var EventTime: js.UndefOr[ConfigurationEventTime]
    var MonitoredResourceARN: js.UndefOr[ConfigurationEventMonitoredResourceARN]
  }

  @js.native
  sealed trait ConfigurationEventResourceType extends js.Any
  object ConfigurationEventResourceType extends js.Object {
    val CLOUDWATCH_ALARM = "CLOUDWATCH_ALARM".asInstanceOf[ConfigurationEventResourceType]
    val CLOUDFORMATION   = "CLOUDFORMATION".asInstanceOf[ConfigurationEventResourceType]
    val SSM_ASSOCIATION  = "SSM_ASSOCIATION".asInstanceOf[ConfigurationEventResourceType]

    val values = js.Object.freeze(js.Array(CLOUDWATCH_ALARM, CLOUDFORMATION, SSM_ASSOCIATION))
  }

  @js.native
  sealed trait ConfigurationEventStatus extends js.Any
  object ConfigurationEventStatus extends js.Object {
    val INFO  = "INFO".asInstanceOf[ConfigurationEventStatus]
    val WARN  = "WARN".asInstanceOf[ConfigurationEventStatus]
    val ERROR = "ERROR".asInstanceOf[ConfigurationEventStatus]

    val values = js.Object.freeze(js.Array(INFO, WARN, ERROR))
  }

  @js.native
  @Factory
  trait CreateApplicationRequest extends js.Object {
    var ResourceGroupName: ResourceGroupName
    var OpsCenterEnabled: js.UndefOr[OpsCenterEnabled]
    var OpsItemSNSTopicArn: js.UndefOr[OpsItemSNSTopicArn]
    var Tags: js.UndefOr[TagList]
  }

  @js.native
  @Factory
  trait CreateApplicationResponse extends js.Object {
    var ApplicationInfo: js.UndefOr[ApplicationInfo]
  }

  @js.native
  @Factory
  trait CreateComponentRequest extends js.Object {
    var ComponentName: ComponentName
    var ResourceGroupName: ResourceGroupName
    var ResourceList: ResourceList
  }

  @js.native
  @Factory
  trait CreateComponentResponse extends js.Object {}

  @js.native
  @Factory
  trait CreateLogPatternRequest extends js.Object {
    var Pattern: LogPatternRegex
    var PatternName: LogPatternName
    var PatternSetName: LogPatternSetName
    var Rank: LogPatternRank
    var ResourceGroupName: ResourceGroupName
  }

  @js.native
  @Factory
  trait CreateLogPatternResponse extends js.Object {
    var LogPattern: js.UndefOr[LogPattern]
    var ResourceGroupName: js.UndefOr[ResourceGroupName]
  }

  @js.native
  @Factory
  trait DeleteApplicationRequest extends js.Object {
    var ResourceGroupName: ResourceGroupName
  }

  @js.native
  @Factory
  trait DeleteApplicationResponse extends js.Object {}

  @js.native
  @Factory
  trait DeleteComponentRequest extends js.Object {
    var ComponentName: ComponentName
    var ResourceGroupName: ResourceGroupName
  }

  @js.native
  @Factory
  trait DeleteComponentResponse extends js.Object {}

  @js.native
  @Factory
  trait DeleteLogPatternRequest extends js.Object {
    var PatternName: LogPatternName
    var PatternSetName: LogPatternSetName
    var ResourceGroupName: ResourceGroupName
  }

  @js.native
  @Factory
  trait DeleteLogPatternResponse extends js.Object {}

  @js.native
  @Factory
  trait DescribeApplicationRequest extends js.Object {
    var ResourceGroupName: ResourceGroupName
  }

  @js.native
  @Factory
  trait DescribeApplicationResponse extends js.Object {
    var ApplicationInfo: js.UndefOr[ApplicationInfo]
  }

  @js.native
  @Factory
  trait DescribeComponentConfigurationRecommendationRequest extends js.Object {
    var ComponentName: ComponentName
    var ResourceGroupName: ResourceGroupName
    var Tier: Tier
  }

  @js.native
  @Factory
  trait DescribeComponentConfigurationRecommendationResponse extends js.Object {
    var ComponentConfiguration: js.UndefOr[ComponentConfiguration]
  }

  @js.native
  @Factory
  trait DescribeComponentConfigurationRequest extends js.Object {
    var ComponentName: ComponentName
    var ResourceGroupName: ResourceGroupName
  }

  @js.native
  @Factory
  trait DescribeComponentConfigurationResponse extends js.Object {
    var ComponentConfiguration: js.UndefOr[ComponentConfiguration]
    var Monitor: js.UndefOr[Monitor]
    var Tier: js.UndefOr[Tier]
  }

  @js.native
  @Factory
  trait DescribeComponentRequest extends js.Object {
    var ComponentName: ComponentName
    var ResourceGroupName: ResourceGroupName
  }

  @js.native
  @Factory
  trait DescribeComponentResponse extends js.Object {
    var ApplicationComponent: js.UndefOr[ApplicationComponent]
    var ResourceList: js.UndefOr[ResourceList]
  }

  @js.native
  @Factory
  trait DescribeLogPatternRequest extends js.Object {
    var PatternName: LogPatternName
    var PatternSetName: LogPatternSetName
    var ResourceGroupName: ResourceGroupName
  }

  @js.native
  @Factory
  trait DescribeLogPatternResponse extends js.Object {
    var LogPattern: js.UndefOr[LogPattern]
    var ResourceGroupName: js.UndefOr[ResourceGroupName]
  }

  @js.native
  @Factory
  trait DescribeObservationRequest extends js.Object {
    var ObservationId: ObservationId
  }

  @js.native
  @Factory
  trait DescribeObservationResponse extends js.Object {
    var Observation: js.UndefOr[Observation]
  }

  @js.native
  @Factory
  trait DescribeProblemObservationsRequest extends js.Object {
    var ProblemId: ProblemId
  }

  @js.native
  @Factory
  trait DescribeProblemObservationsResponse extends js.Object {
    var RelatedObservations: js.UndefOr[RelatedObservations]
  }

  @js.native
  @Factory
  trait DescribeProblemRequest extends js.Object {
    var ProblemId: ProblemId
  }

  @js.native
  @Factory
  trait DescribeProblemResponse extends js.Object {
    var Problem: js.UndefOr[Problem]
  }

  @js.native
  sealed trait FeedbackKey extends js.Any
  object FeedbackKey extends js.Object {
    val INSIGHTS_FEEDBACK = "INSIGHTS_FEEDBACK".asInstanceOf[FeedbackKey]

    val values = js.Object.freeze(js.Array(INSIGHTS_FEEDBACK))
  }

  @js.native
  sealed trait FeedbackValue extends js.Any
  object FeedbackValue extends js.Object {
    val NOT_SPECIFIED = "NOT_SPECIFIED".asInstanceOf[FeedbackValue]
    val USEFUL        = "USEFUL".asInstanceOf[FeedbackValue]
    val NOT_USEFUL    = "NOT_USEFUL".asInstanceOf[FeedbackValue]

    val values = js.Object.freeze(js.Array(NOT_SPECIFIED, USEFUL, NOT_USEFUL))
  }

  @js.native
  @Factory
  trait ListApplicationsRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxEntities]
    var NextToken: js.UndefOr[PaginationToken]
  }

  @js.native
  @Factory
  trait ListApplicationsResponse extends js.Object {
    var ApplicationInfoList: js.UndefOr[ApplicationInfoList]
    var NextToken: js.UndefOr[PaginationToken]
  }

  @js.native
  @Factory
  trait ListComponentsRequest extends js.Object {
    var ResourceGroupName: ResourceGroupName
    var MaxResults: js.UndefOr[MaxEntities]
    var NextToken: js.UndefOr[PaginationToken]
  }

  @js.native
  @Factory
  trait ListComponentsResponse extends js.Object {
    var ApplicationComponentList: js.UndefOr[ApplicationComponentList]
    var NextToken: js.UndefOr[PaginationToken]
  }

  @js.native
  @Factory
  trait ListConfigurationHistoryRequest extends js.Object {
    var EndTime: js.UndefOr[EndTime]
    var EventStatus: js.UndefOr[ConfigurationEventStatus]
    var MaxResults: js.UndefOr[MaxEntities]
    var NextToken: js.UndefOr[PaginationToken]
    var ResourceGroupName: js.UndefOr[ResourceGroupName]
    var StartTime: js.UndefOr[StartTime]
  }

  @js.native
  @Factory
  trait ListConfigurationHistoryResponse extends js.Object {
    var EventList: js.UndefOr[ConfigurationEventList]
    var NextToken: js.UndefOr[PaginationToken]
  }

  @js.native
  @Factory
  trait ListLogPatternSetsRequest extends js.Object {
    var ResourceGroupName: ResourceGroupName
    var MaxResults: js.UndefOr[MaxEntities]
    var NextToken: js.UndefOr[PaginationToken]
  }

  @js.native
  @Factory
  trait ListLogPatternSetsResponse extends js.Object {
    var LogPatternSets: js.UndefOr[LogPatternSetList]
    var NextToken: js.UndefOr[PaginationToken]
    var ResourceGroupName: js.UndefOr[ResourceGroupName]
  }

  @js.native
  @Factory
  trait ListLogPatternsRequest extends js.Object {
    var ResourceGroupName: ResourceGroupName
    var MaxResults: js.UndefOr[MaxEntities]
    var NextToken: js.UndefOr[PaginationToken]
    var PatternSetName: js.UndefOr[LogPatternSetName]
  }

  @js.native
  @Factory
  trait ListLogPatternsResponse extends js.Object {
    var LogPatterns: js.UndefOr[LogPatternList]
    var NextToken: js.UndefOr[PaginationToken]
    var ResourceGroupName: js.UndefOr[ResourceGroupName]
  }

  @js.native
  @Factory
  trait ListProblemsRequest extends js.Object {
    var EndTime: js.UndefOr[EndTime]
    var MaxResults: js.UndefOr[MaxEntities]
    var NextToken: js.UndefOr[PaginationToken]
    var ResourceGroupName: js.UndefOr[ResourceGroupName]
    var StartTime: js.UndefOr[StartTime]
  }

  @js.native
  @Factory
  trait ListProblemsResponse extends js.Object {
    var NextToken: js.UndefOr[PaginationToken]
    var ProblemList: js.UndefOr[ProblemList]
  }

  @js.native
  @Factory
  trait ListTagsForResourceRequest extends js.Object {
    var ResourceARN: AmazonResourceName
  }

  @js.native
  @Factory
  trait ListTagsForResourceResponse extends js.Object {
    var Tags: js.UndefOr[TagList]
  }

  @js.native
  sealed trait LogFilter extends js.Any
  object LogFilter extends js.Object {
    val ERROR = "ERROR".asInstanceOf[LogFilter]
    val WARN  = "WARN".asInstanceOf[LogFilter]
    val INFO  = "INFO".asInstanceOf[LogFilter]

    val values = js.Object.freeze(js.Array(ERROR, WARN, INFO))
  }

  /**
    * An object that defines the log patterns that belongs to a <code>LogPatternSet</code>.
    */
  @js.native
  @Factory
  trait LogPattern extends js.Object {
    var Pattern: js.UndefOr[LogPatternRegex]
    var PatternName: js.UndefOr[LogPatternName]
    var PatternSetName: js.UndefOr[LogPatternSetName]
    var Rank: js.UndefOr[LogPatternRank]
  }

  /**
    * Describes an anomaly or error with the application.
    */
  @js.native
  @Factory
  trait Observation extends js.Object {
    var EndTime: js.UndefOr[EndTime]
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
  }

  /**
    * Describes a problem that is detected by correlating observations.
    */
  @js.native
  @Factory
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

  /**
    * Describes observations related to the problem.
    */
  @js.native
  @Factory
  trait RelatedObservations extends js.Object {
    var ObservationList: js.UndefOr[ObservationList]
  }

  @js.native
  sealed trait SeverityLevel extends js.Any
  object SeverityLevel extends js.Object {
    val Low    = "Low".asInstanceOf[SeverityLevel]
    val Medium = "Medium".asInstanceOf[SeverityLevel]
    val High   = "High".asInstanceOf[SeverityLevel]

    val values = js.Object.freeze(js.Array(Low, Medium, High))
  }

  @js.native
  sealed trait Status extends js.Any
  object Status extends js.Object {
    val IGNORE   = "IGNORE".asInstanceOf[Status]
    val RESOLVED = "RESOLVED".asInstanceOf[Status]
    val PENDING  = "PENDING".asInstanceOf[Status]

    val values = js.Object.freeze(js.Array(IGNORE, RESOLVED, PENDING))
  }

  /**
    * An object that defines the tags associated with an application. A <i>tag</i> is a label that you optionally define and associate with an application. Tags can help you categorize and manage resources in different ways, such as by purpose, owner, environment, or other criteria.
    *  Each tag consists of a required <i>tag key</i> and an associated <i>tag value</i>, both of which you define. A tag key is a general label that acts as a category for a more specific tag value. A tag value acts as a descriptor within a tag key. A tag key can contain as many as 128 characters. A tag value can contain as many as 256 characters. The characters can be Unicode letters, digits, white space, or one of the following symbols: _ . : / = + -. The following additional restrictions apply to tags:
    * * Tag keys and values are case sensitive.
    *  * For each associated resource, each tag key must be unique and it can have only one value.
    *  * The <code>aws:</code> prefix is reserved for use by AWS; you can’t use it in any tag keys or values that you define. In addition, you can't edit or remove tag keys or values that use this prefix.
    */
  @js.native
  @Factory
  trait Tag extends js.Object {
    var Key: TagKey
    var Value: TagValue
  }

  @js.native
  @Factory
  trait TagResourceRequest extends js.Object {
    var ResourceARN: AmazonResourceName
    var Tags: TagList
  }

  @js.native
  @Factory
  trait TagResourceResponse extends js.Object {}

  @js.native
  sealed trait Tier extends js.Any
  object Tier extends js.Object {
    val DEFAULT        = "DEFAULT".asInstanceOf[Tier]
    val DOT_NET_CORE   = "DOT_NET_CORE".asInstanceOf[Tier]
    val DOT_NET_WORKER = "DOT_NET_WORKER".asInstanceOf[Tier]
    val DOT_NET_WEB    = "DOT_NET_WEB".asInstanceOf[Tier]
    val SQL_SERVER     = "SQL_SERVER".asInstanceOf[Tier]

    val values = js.Object.freeze(js.Array(DEFAULT, DOT_NET_CORE, DOT_NET_WORKER, DOT_NET_WEB, SQL_SERVER))
  }

  @js.native
  @Factory
  trait UntagResourceRequest extends js.Object {
    var ResourceARN: AmazonResourceName
    var TagKeys: TagKeyList
  }

  @js.native
  @Factory
  trait UntagResourceResponse extends js.Object {}

  @js.native
  @Factory
  trait UpdateApplicationRequest extends js.Object {
    var ResourceGroupName: ResourceGroupName
    var OpsCenterEnabled: js.UndefOr[OpsCenterEnabled]
    var OpsItemSNSTopicArn: js.UndefOr[OpsItemSNSTopicArn]
    var RemoveSNSTopic: js.UndefOr[RemoveSNSTopic]
  }

  @js.native
  @Factory
  trait UpdateApplicationResponse extends js.Object {
    var ApplicationInfo: js.UndefOr[ApplicationInfo]
  }

  @js.native
  @Factory
  trait UpdateComponentConfigurationRequest extends js.Object {
    var ComponentName: ComponentName
    var ResourceGroupName: ResourceGroupName
    var ComponentConfiguration: js.UndefOr[ComponentConfiguration]
    var Monitor: js.UndefOr[Monitor]
    var Tier: js.UndefOr[Tier]
  }

  @js.native
  @Factory
  trait UpdateComponentConfigurationResponse extends js.Object {}

  @js.native
  @Factory
  trait UpdateComponentRequest extends js.Object {
    var ComponentName: ComponentName
    var ResourceGroupName: ResourceGroupName
    var NewComponentName: js.UndefOr[NewComponentName]
    var ResourceList: js.UndefOr[ResourceList]
  }

  @js.native
  @Factory
  trait UpdateComponentResponse extends js.Object {}

  @js.native
  @Factory
  trait UpdateLogPatternRequest extends js.Object {
    var PatternName: LogPatternName
    var PatternSetName: LogPatternSetName
    var ResourceGroupName: ResourceGroupName
    var Pattern: js.UndefOr[LogPatternRegex]
    var Rank: js.UndefOr[LogPatternRank]
  }

  @js.native
  @Factory
  trait UpdateLogPatternResponse extends js.Object {
    var LogPattern: js.UndefOr[LogPattern]
    var ResourceGroupName: js.UndefOr[ResourceGroupName]
  }
}
