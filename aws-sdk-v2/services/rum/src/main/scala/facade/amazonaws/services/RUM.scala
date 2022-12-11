package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import scala.language.implicitConversions
import facade.amazonaws._

package object rum {
  type AppMonitorDomain = String
  type AppMonitorId = String
  type AppMonitorName = String
  type AppMonitorSummaryList = js.Array[AppMonitorSummary]
  type Arn = String
  type BatchCreateRumMetricDefinitionsErrors = js.Array[BatchCreateRumMetricDefinitionsError]
  type BatchDeleteRumMetricDefinitionsErrors = js.Array[BatchDeleteRumMetricDefinitionsError]
  type DestinationArn = String
  type DimensionKey = String
  type DimensionKeysMap = js.Dictionary[DimensionName]
  type DimensionName = String
  type EventData = String
  type EventDataList = js.Array[EventData]
  type EventPattern = String
  type FavoritePages = js.Array[String]
  type ISOTimestampString = String
  type IamRoleArn = String
  type IdentityPoolId = String
  type JsonValue = String
  type MaxQueryResults = Int
  type MaxResultsInteger = Int
  type MetricDefinitionId = String
  type MetricDefinitionIds = js.Array[MetricDefinitionId]
  type MetricDefinitions = js.Array[MetricDefinition]
  type MetricDefinitionsRequest = js.Array[MetricDefinitionRequest]
  type MetricDestinationSummaryList = js.Array[MetricDestinationSummary]
  type MetricName = String
  type Pages = js.Array[Url]
  type QueryFilterKey = String
  type QueryFilterValue = String
  type QueryFilterValueList = js.Array[QueryFilterValue]
  type QueryFilters = js.Array[QueryFilter]
  type QueryTimestamp = Double
  type RumEventList = js.Array[RumEvent]
  type SessionSampleRate = Double
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagMap = js.Dictionary[TagValue]
  type TagValue = String
  type Telemetries = js.Array[Telemetry]
  type Timestamp = js.Date
  type Token = String
  type UnitLabel = String
  type Url = String
  type ValueKey = String

  final class RUMOps(private val service: RUM) extends AnyVal {

    @inline def batchCreateRumMetricDefinitionsFuture(params: BatchCreateRumMetricDefinitionsRequest): Future[BatchCreateRumMetricDefinitionsResponse] = service.batchCreateRumMetricDefinitions(params).promise().toFuture
    @inline def batchDeleteRumMetricDefinitionsFuture(params: BatchDeleteRumMetricDefinitionsRequest): Future[BatchDeleteRumMetricDefinitionsResponse] = service.batchDeleteRumMetricDefinitions(params).promise().toFuture
    @inline def batchGetRumMetricDefinitionsFuture(params: BatchGetRumMetricDefinitionsRequest): Future[BatchGetRumMetricDefinitionsResponse] = service.batchGetRumMetricDefinitions(params).promise().toFuture
    @inline def createAppMonitorFuture(params: CreateAppMonitorRequest): Future[CreateAppMonitorResponse] = service.createAppMonitor(params).promise().toFuture
    @inline def deleteAppMonitorFuture(params: DeleteAppMonitorRequest): Future[DeleteAppMonitorResponse] = service.deleteAppMonitor(params).promise().toFuture
    @inline def deleteRumMetricsDestinationFuture(params: DeleteRumMetricsDestinationRequest): Future[DeleteRumMetricsDestinationResponse] = service.deleteRumMetricsDestination(params).promise().toFuture
    @inline def getAppMonitorDataFuture(params: GetAppMonitorDataRequest): Future[GetAppMonitorDataResponse] = service.getAppMonitorData(params).promise().toFuture
    @inline def getAppMonitorFuture(params: GetAppMonitorRequest): Future[GetAppMonitorResponse] = service.getAppMonitor(params).promise().toFuture
    @inline def listAppMonitorsFuture(params: ListAppMonitorsRequest): Future[ListAppMonitorsResponse] = service.listAppMonitors(params).promise().toFuture
    @inline def listRumMetricsDestinationsFuture(params: ListRumMetricsDestinationsRequest): Future[ListRumMetricsDestinationsResponse] = service.listRumMetricsDestinations(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] = service.listTagsForResource(params).promise().toFuture
    @inline def putRumEventsFuture(params: PutRumEventsRequest): Future[PutRumEventsResponse] = service.putRumEvents(params).promise().toFuture
    @inline def putRumMetricsDestinationFuture(params: PutRumMetricsDestinationRequest): Future[PutRumMetricsDestinationResponse] = service.putRumMetricsDestination(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] = service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] = service.untagResource(params).promise().toFuture
    @inline def updateAppMonitorFuture(params: UpdateAppMonitorRequest): Future[UpdateAppMonitorResponse] = service.updateAppMonitor(params).promise().toFuture
    @inline def updateRumMetricDefinitionFuture(params: UpdateRumMetricDefinitionRequest): Future[UpdateRumMetricDefinitionResponse] = service.updateRumMetricDefinition(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/rum", JSImport.Namespace, "AWS.RUM")
  class RUM() extends js.Object {
    def this(config: AWSConfig) = this()

    def batchCreateRumMetricDefinitions(params: BatchCreateRumMetricDefinitionsRequest): Request[BatchCreateRumMetricDefinitionsResponse] = js.native
    def batchDeleteRumMetricDefinitions(params: BatchDeleteRumMetricDefinitionsRequest): Request[BatchDeleteRumMetricDefinitionsResponse] = js.native
    def batchGetRumMetricDefinitions(params: BatchGetRumMetricDefinitionsRequest): Request[BatchGetRumMetricDefinitionsResponse] = js.native
    def createAppMonitor(params: CreateAppMonitorRequest): Request[CreateAppMonitorResponse] = js.native
    def deleteAppMonitor(params: DeleteAppMonitorRequest): Request[DeleteAppMonitorResponse] = js.native
    def deleteRumMetricsDestination(params: DeleteRumMetricsDestinationRequest): Request[DeleteRumMetricsDestinationResponse] = js.native
    def getAppMonitor(params: GetAppMonitorRequest): Request[GetAppMonitorResponse] = js.native
    def getAppMonitorData(params: GetAppMonitorDataRequest): Request[GetAppMonitorDataResponse] = js.native
    def listAppMonitors(params: ListAppMonitorsRequest): Request[ListAppMonitorsResponse] = js.native
    def listRumMetricsDestinations(params: ListRumMetricsDestinationsRequest): Request[ListRumMetricsDestinationsResponse] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def putRumEvents(params: PutRumEventsRequest): Request[PutRumEventsResponse] = js.native
    def putRumMetricsDestination(params: PutRumMetricsDestinationRequest): Request[PutRumMetricsDestinationResponse] = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse] = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse] = js.native
    def updateAppMonitor(params: UpdateAppMonitorRequest): Request[UpdateAppMonitorResponse] = js.native
    def updateRumMetricDefinition(params: UpdateRumMetricDefinitionRequest): Request[UpdateRumMetricDefinitionResponse] = js.native
  }
  object RUM {
    @inline implicit def toOps(service: RUM): RUMOps = {
      new RUMOps(service)
    }
  }

  /** A RUM app monitor collects telemetry data from your application and sends that data to RUM. The data includes performance and reliability information such as page load time, client-side errors, and user behavior.
    */
  @js.native
  trait AppMonitor extends js.Object {
    var AppMonitorConfiguration: js.UndefOr[AppMonitorConfiguration]
    var Created: js.UndefOr[ISOTimestampString]
    var CustomEvents: js.UndefOr[CustomEvents]
    var DataStorage: js.UndefOr[DataStorage]
    var Domain: js.UndefOr[AppMonitorDomain]
    var Id: js.UndefOr[AppMonitorId]
    var LastModified: js.UndefOr[ISOTimestampString]
    var Name: js.UndefOr[AppMonitorName]
    var State: js.UndefOr[StateEnum]
    var Tags: js.UndefOr[TagMap]
  }

  object AppMonitor {
    @inline
    def apply(
        AppMonitorConfiguration: js.UndefOr[AppMonitorConfiguration] = js.undefined,
        Created: js.UndefOr[ISOTimestampString] = js.undefined,
        CustomEvents: js.UndefOr[CustomEvents] = js.undefined,
        DataStorage: js.UndefOr[DataStorage] = js.undefined,
        Domain: js.UndefOr[AppMonitorDomain] = js.undefined,
        Id: js.UndefOr[AppMonitorId] = js.undefined,
        LastModified: js.UndefOr[ISOTimestampString] = js.undefined,
        Name: js.UndefOr[AppMonitorName] = js.undefined,
        State: js.UndefOr[StateEnum] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined
    ): AppMonitor = {
      val __obj = js.Dynamic.literal()
      AppMonitorConfiguration.foreach(__v => __obj.updateDynamic("AppMonitorConfiguration")(__v.asInstanceOf[js.Any]))
      Created.foreach(__v => __obj.updateDynamic("Created")(__v.asInstanceOf[js.Any]))
      CustomEvents.foreach(__v => __obj.updateDynamic("CustomEvents")(__v.asInstanceOf[js.Any]))
      DataStorage.foreach(__v => __obj.updateDynamic("DataStorage")(__v.asInstanceOf[js.Any]))
      Domain.foreach(__v => __obj.updateDynamic("Domain")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      LastModified.foreach(__v => __obj.updateDynamic("LastModified")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AppMonitor]
    }
  }

  /** This structure contains much of the configuration data for the app monitor.
    */
  @js.native
  trait AppMonitorConfiguration extends js.Object {
    var AllowCookies: js.UndefOr[Boolean]
    var EnableXRay: js.UndefOr[Boolean]
    var ExcludedPages: js.UndefOr[Pages]
    var FavoritePages: js.UndefOr[FavoritePages]
    var GuestRoleArn: js.UndefOr[Arn]
    var IdentityPoolId: js.UndefOr[IdentityPoolId]
    var IncludedPages: js.UndefOr[Pages]
    var SessionSampleRate: js.UndefOr[SessionSampleRate]
    var Telemetries: js.UndefOr[Telemetries]
  }

  object AppMonitorConfiguration {
    @inline
    def apply(
        AllowCookies: js.UndefOr[Boolean] = js.undefined,
        EnableXRay: js.UndefOr[Boolean] = js.undefined,
        ExcludedPages: js.UndefOr[Pages] = js.undefined,
        FavoritePages: js.UndefOr[FavoritePages] = js.undefined,
        GuestRoleArn: js.UndefOr[Arn] = js.undefined,
        IdentityPoolId: js.UndefOr[IdentityPoolId] = js.undefined,
        IncludedPages: js.UndefOr[Pages] = js.undefined,
        SessionSampleRate: js.UndefOr[SessionSampleRate] = js.undefined,
        Telemetries: js.UndefOr[Telemetries] = js.undefined
    ): AppMonitorConfiguration = {
      val __obj = js.Dynamic.literal()
      AllowCookies.foreach(__v => __obj.updateDynamic("AllowCookies")(__v.asInstanceOf[js.Any]))
      EnableXRay.foreach(__v => __obj.updateDynamic("EnableXRay")(__v.asInstanceOf[js.Any]))
      ExcludedPages.foreach(__v => __obj.updateDynamic("ExcludedPages")(__v.asInstanceOf[js.Any]))
      FavoritePages.foreach(__v => __obj.updateDynamic("FavoritePages")(__v.asInstanceOf[js.Any]))
      GuestRoleArn.foreach(__v => __obj.updateDynamic("GuestRoleArn")(__v.asInstanceOf[js.Any]))
      IdentityPoolId.foreach(__v => __obj.updateDynamic("IdentityPoolId")(__v.asInstanceOf[js.Any]))
      IncludedPages.foreach(__v => __obj.updateDynamic("IncludedPages")(__v.asInstanceOf[js.Any]))
      SessionSampleRate.foreach(__v => __obj.updateDynamic("SessionSampleRate")(__v.asInstanceOf[js.Any]))
      Telemetries.foreach(__v => __obj.updateDynamic("Telemetries")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AppMonitorConfiguration]
    }
  }

  /** A structure that contains information about the RUM app monitor.
    */
  @js.native
  trait AppMonitorDetails extends js.Object {
    var id: js.UndefOr[String]
    var name: js.UndefOr[String]
    var version: js.UndefOr[String]
  }

  object AppMonitorDetails {
    @inline
    def apply(
        id: js.UndefOr[String] = js.undefined,
        name: js.UndefOr[String] = js.undefined,
        version: js.UndefOr[String] = js.undefined
    ): AppMonitorDetails = {
      val __obj = js.Dynamic.literal()
      id.foreach(__v => __obj.updateDynamic("id")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      version.foreach(__v => __obj.updateDynamic("version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AppMonitorDetails]
    }
  }

  /** A structure that includes some data about app monitors and their settings.
    */
  @js.native
  trait AppMonitorSummary extends js.Object {
    var Created: js.UndefOr[ISOTimestampString]
    var Id: js.UndefOr[AppMonitorId]
    var LastModified: js.UndefOr[ISOTimestampString]
    var Name: js.UndefOr[AppMonitorName]
    var State: js.UndefOr[StateEnum]
  }

  object AppMonitorSummary {
    @inline
    def apply(
        Created: js.UndefOr[ISOTimestampString] = js.undefined,
        Id: js.UndefOr[AppMonitorId] = js.undefined,
        LastModified: js.UndefOr[ISOTimestampString] = js.undefined,
        Name: js.UndefOr[AppMonitorName] = js.undefined,
        State: js.UndefOr[StateEnum] = js.undefined
    ): AppMonitorSummary = {
      val __obj = js.Dynamic.literal()
      Created.foreach(__v => __obj.updateDynamic("Created")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      LastModified.foreach(__v => __obj.updateDynamic("LastModified")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AppMonitorSummary]
    }
  }

  /** A structure that defines one error caused by a [[https://docs.aws.amazon.com/cloudwatchrum/latest/APIReference/API_BatchCreateRumMetricsDefinitions.html|BatchCreateRumMetricsDefinitions]] operation.
    */
  @js.native
  trait BatchCreateRumMetricDefinitionsError extends js.Object {
    var ErrorCode: String
    var ErrorMessage: String
    var MetricDefinition: MetricDefinitionRequest
  }

  object BatchCreateRumMetricDefinitionsError {
    @inline
    def apply(
        ErrorCode: String,
        ErrorMessage: String,
        MetricDefinition: MetricDefinitionRequest
    ): BatchCreateRumMetricDefinitionsError = {
      val __obj = js.Dynamic.literal(
        "ErrorCode" -> ErrorCode.asInstanceOf[js.Any],
        "ErrorMessage" -> ErrorMessage.asInstanceOf[js.Any],
        "MetricDefinition" -> MetricDefinition.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[BatchCreateRumMetricDefinitionsError]
    }
  }

  @js.native
  trait BatchCreateRumMetricDefinitionsRequest extends js.Object {
    var AppMonitorName: AppMonitorName
    var Destination: MetricDestination
    var MetricDefinitions: MetricDefinitionsRequest
    var DestinationArn: js.UndefOr[DestinationArn]
  }

  object BatchCreateRumMetricDefinitionsRequest {
    @inline
    def apply(
        AppMonitorName: AppMonitorName,
        Destination: MetricDestination,
        MetricDefinitions: MetricDefinitionsRequest,
        DestinationArn: js.UndefOr[DestinationArn] = js.undefined
    ): BatchCreateRumMetricDefinitionsRequest = {
      val __obj = js.Dynamic.literal(
        "AppMonitorName" -> AppMonitorName.asInstanceOf[js.Any],
        "Destination" -> Destination.asInstanceOf[js.Any],
        "MetricDefinitions" -> MetricDefinitions.asInstanceOf[js.Any]
      )

      DestinationArn.foreach(__v => __obj.updateDynamic("DestinationArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchCreateRumMetricDefinitionsRequest]
    }
  }

  @js.native
  trait BatchCreateRumMetricDefinitionsResponse extends js.Object {
    var Errors: BatchCreateRumMetricDefinitionsErrors
    var MetricDefinitions: js.UndefOr[MetricDefinitions]
  }

  object BatchCreateRumMetricDefinitionsResponse {
    @inline
    def apply(
        Errors: BatchCreateRumMetricDefinitionsErrors,
        MetricDefinitions: js.UndefOr[MetricDefinitions] = js.undefined
    ): BatchCreateRumMetricDefinitionsResponse = {
      val __obj = js.Dynamic.literal(
        "Errors" -> Errors.asInstanceOf[js.Any]
      )

      MetricDefinitions.foreach(__v => __obj.updateDynamic("MetricDefinitions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchCreateRumMetricDefinitionsResponse]
    }
  }

  /** A structure that defines one error caused by a [[https://docs.aws.amazon.com/cloudwatchrum/latest/APIReference/API_BatchDeleteRumMetricsDefinitions.html|BatchCreateRumMetricsDefinitions]] operation.
    */
  @js.native
  trait BatchDeleteRumMetricDefinitionsError extends js.Object {
    var ErrorCode: String
    var ErrorMessage: String
    var MetricDefinitionId: MetricDefinitionId
  }

  object BatchDeleteRumMetricDefinitionsError {
    @inline
    def apply(
        ErrorCode: String,
        ErrorMessage: String,
        MetricDefinitionId: MetricDefinitionId
    ): BatchDeleteRumMetricDefinitionsError = {
      val __obj = js.Dynamic.literal(
        "ErrorCode" -> ErrorCode.asInstanceOf[js.Any],
        "ErrorMessage" -> ErrorMessage.asInstanceOf[js.Any],
        "MetricDefinitionId" -> MetricDefinitionId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[BatchDeleteRumMetricDefinitionsError]
    }
  }

  @js.native
  trait BatchDeleteRumMetricDefinitionsRequest extends js.Object {
    var AppMonitorName: AppMonitorName
    var Destination: MetricDestination
    var MetricDefinitionIds: MetricDefinitionIds
    var DestinationArn: js.UndefOr[DestinationArn]
  }

  object BatchDeleteRumMetricDefinitionsRequest {
    @inline
    def apply(
        AppMonitorName: AppMonitorName,
        Destination: MetricDestination,
        MetricDefinitionIds: MetricDefinitionIds,
        DestinationArn: js.UndefOr[DestinationArn] = js.undefined
    ): BatchDeleteRumMetricDefinitionsRequest = {
      val __obj = js.Dynamic.literal(
        "AppMonitorName" -> AppMonitorName.asInstanceOf[js.Any],
        "Destination" -> Destination.asInstanceOf[js.Any],
        "MetricDefinitionIds" -> MetricDefinitionIds.asInstanceOf[js.Any]
      )

      DestinationArn.foreach(__v => __obj.updateDynamic("DestinationArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchDeleteRumMetricDefinitionsRequest]
    }
  }

  @js.native
  trait BatchDeleteRumMetricDefinitionsResponse extends js.Object {
    var Errors: BatchDeleteRumMetricDefinitionsErrors
    var MetricDefinitionIds: js.UndefOr[MetricDefinitionIds]
  }

  object BatchDeleteRumMetricDefinitionsResponse {
    @inline
    def apply(
        Errors: BatchDeleteRumMetricDefinitionsErrors,
        MetricDefinitionIds: js.UndefOr[MetricDefinitionIds] = js.undefined
    ): BatchDeleteRumMetricDefinitionsResponse = {
      val __obj = js.Dynamic.literal(
        "Errors" -> Errors.asInstanceOf[js.Any]
      )

      MetricDefinitionIds.foreach(__v => __obj.updateDynamic("MetricDefinitionIds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchDeleteRumMetricDefinitionsResponse]
    }
  }

  @js.native
  trait BatchGetRumMetricDefinitionsRequest extends js.Object {
    var AppMonitorName: AppMonitorName
    var Destination: MetricDestination
    var DestinationArn: js.UndefOr[DestinationArn]
    var MaxResults: js.UndefOr[MaxResultsInteger]
    var NextToken: js.UndefOr[String]
  }

  object BatchGetRumMetricDefinitionsRequest {
    @inline
    def apply(
        AppMonitorName: AppMonitorName,
        Destination: MetricDestination,
        DestinationArn: js.UndefOr[DestinationArn] = js.undefined,
        MaxResults: js.UndefOr[MaxResultsInteger] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): BatchGetRumMetricDefinitionsRequest = {
      val __obj = js.Dynamic.literal(
        "AppMonitorName" -> AppMonitorName.asInstanceOf[js.Any],
        "Destination" -> Destination.asInstanceOf[js.Any]
      )

      DestinationArn.foreach(__v => __obj.updateDynamic("DestinationArn")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchGetRumMetricDefinitionsRequest]
    }
  }

  @js.native
  trait BatchGetRumMetricDefinitionsResponse extends js.Object {
    var MetricDefinitions: js.UndefOr[MetricDefinitions]
    var NextToken: js.UndefOr[String]
  }

  object BatchGetRumMetricDefinitionsResponse {
    @inline
    def apply(
        MetricDefinitions: js.UndefOr[MetricDefinitions] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): BatchGetRumMetricDefinitionsResponse = {
      val __obj = js.Dynamic.literal()
      MetricDefinitions.foreach(__v => __obj.updateDynamic("MetricDefinitions")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchGetRumMetricDefinitionsResponse]
    }
  }

  @js.native
  trait CreateAppMonitorRequest extends js.Object {
    var Domain: AppMonitorDomain
    var Name: AppMonitorName
    var AppMonitorConfiguration: js.UndefOr[AppMonitorConfiguration]
    var CustomEvents: js.UndefOr[CustomEvents]
    var CwLogEnabled: js.UndefOr[Boolean]
    var Tags: js.UndefOr[TagMap]
  }

  object CreateAppMonitorRequest {
    @inline
    def apply(
        Domain: AppMonitorDomain,
        Name: AppMonitorName,
        AppMonitorConfiguration: js.UndefOr[AppMonitorConfiguration] = js.undefined,
        CustomEvents: js.UndefOr[CustomEvents] = js.undefined,
        CwLogEnabled: js.UndefOr[Boolean] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined
    ): CreateAppMonitorRequest = {
      val __obj = js.Dynamic.literal(
        "Domain" -> Domain.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]
      )

      AppMonitorConfiguration.foreach(__v => __obj.updateDynamic("AppMonitorConfiguration")(__v.asInstanceOf[js.Any]))
      CustomEvents.foreach(__v => __obj.updateDynamic("CustomEvents")(__v.asInstanceOf[js.Any]))
      CwLogEnabled.foreach(__v => __obj.updateDynamic("CwLogEnabled")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateAppMonitorRequest]
    }
  }

  @js.native
  trait CreateAppMonitorResponse extends js.Object {
    var Id: js.UndefOr[AppMonitorId]
  }

  object CreateAppMonitorResponse {
    @inline
    def apply(
        Id: js.UndefOr[AppMonitorId] = js.undefined
    ): CreateAppMonitorResponse = {
      val __obj = js.Dynamic.literal()
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateAppMonitorResponse]
    }
  }

  /** A structure that contains information about custom events for this app monitor.
    */
  @js.native
  trait CustomEvents extends js.Object {
    var Status: js.UndefOr[CustomEventsStatus]
  }

  object CustomEvents {
    @inline
    def apply(
        Status: js.UndefOr[CustomEventsStatus] = js.undefined
    ): CustomEvents = {
      val __obj = js.Dynamic.literal()
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CustomEvents]
    }
  }

  /** A structure that contains the information about whether the app monitor stores copies of the data that RUM collects in CloudWatch Logs. If it does, this structure also contains the name of the log group.
    */
  @js.native
  trait CwLog extends js.Object {
    var CwLogEnabled: js.UndefOr[Boolean]
    var CwLogGroup: js.UndefOr[String]
  }

  object CwLog {
    @inline
    def apply(
        CwLogEnabled: js.UndefOr[Boolean] = js.undefined,
        CwLogGroup: js.UndefOr[String] = js.undefined
    ): CwLog = {
      val __obj = js.Dynamic.literal()
      CwLogEnabled.foreach(__v => __obj.updateDynamic("CwLogEnabled")(__v.asInstanceOf[js.Any]))
      CwLogGroup.foreach(__v => __obj.updateDynamic("CwLogGroup")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CwLog]
    }
  }

  /** A structure that contains information about whether this app monitor stores a copy of the telemetry data that RUM collects using CloudWatch Logs.
    */
  @js.native
  trait DataStorage extends js.Object {
    var CwLog: js.UndefOr[CwLog]
  }

  object DataStorage {
    @inline
    def apply(
        CwLog: js.UndefOr[CwLog] = js.undefined
    ): DataStorage = {
      val __obj = js.Dynamic.literal()
      CwLog.foreach(__v => __obj.updateDynamic("CwLog")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DataStorage]
    }
  }

  @js.native
  trait DeleteAppMonitorRequest extends js.Object {
    var Name: AppMonitorName
  }

  object DeleteAppMonitorRequest {
    @inline
    def apply(
        Name: AppMonitorName
    ): DeleteAppMonitorRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteAppMonitorRequest]
    }
  }

  @js.native
  trait DeleteAppMonitorResponse extends js.Object

  object DeleteAppMonitorResponse {
    @inline
    def apply(): DeleteAppMonitorResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteAppMonitorResponse]
    }
  }

  @js.native
  trait DeleteRumMetricsDestinationRequest extends js.Object {
    var AppMonitorName: AppMonitorName
    var Destination: MetricDestination
    var DestinationArn: js.UndefOr[DestinationArn]
  }

  object DeleteRumMetricsDestinationRequest {
    @inline
    def apply(
        AppMonitorName: AppMonitorName,
        Destination: MetricDestination,
        DestinationArn: js.UndefOr[DestinationArn] = js.undefined
    ): DeleteRumMetricsDestinationRequest = {
      val __obj = js.Dynamic.literal(
        "AppMonitorName" -> AppMonitorName.asInstanceOf[js.Any],
        "Destination" -> Destination.asInstanceOf[js.Any]
      )

      DestinationArn.foreach(__v => __obj.updateDynamic("DestinationArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteRumMetricsDestinationRequest]
    }
  }

  @js.native
  trait DeleteRumMetricsDestinationResponse extends js.Object

  object DeleteRumMetricsDestinationResponse {
    @inline
    def apply(): DeleteRumMetricsDestinationResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteRumMetricsDestinationResponse]
    }
  }

  @js.native
  trait GetAppMonitorDataRequest extends js.Object {
    var Name: AppMonitorName
    var TimeRange: TimeRange
    var Filters: js.UndefOr[QueryFilters]
    var MaxResults: js.UndefOr[MaxQueryResults]
    var NextToken: js.UndefOr[Token]
  }

  object GetAppMonitorDataRequest {
    @inline
    def apply(
        Name: AppMonitorName,
        TimeRange: TimeRange,
        Filters: js.UndefOr[QueryFilters] = js.undefined,
        MaxResults: js.UndefOr[MaxQueryResults] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined
    ): GetAppMonitorDataRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "TimeRange" -> TimeRange.asInstanceOf[js.Any]
      )

      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetAppMonitorDataRequest]
    }
  }

  @js.native
  trait GetAppMonitorDataResponse extends js.Object {
    var Events: js.UndefOr[EventDataList]
    var NextToken: js.UndefOr[Token]
  }

  object GetAppMonitorDataResponse {
    @inline
    def apply(
        Events: js.UndefOr[EventDataList] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined
    ): GetAppMonitorDataResponse = {
      val __obj = js.Dynamic.literal()
      Events.foreach(__v => __obj.updateDynamic("Events")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetAppMonitorDataResponse]
    }
  }

  @js.native
  trait GetAppMonitorRequest extends js.Object {
    var Name: AppMonitorName
  }

  object GetAppMonitorRequest {
    @inline
    def apply(
        Name: AppMonitorName
    ): GetAppMonitorRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetAppMonitorRequest]
    }
  }

  @js.native
  trait GetAppMonitorResponse extends js.Object {
    var AppMonitor: js.UndefOr[AppMonitor]
  }

  object GetAppMonitorResponse {
    @inline
    def apply(
        AppMonitor: js.UndefOr[AppMonitor] = js.undefined
    ): GetAppMonitorResponse = {
      val __obj = js.Dynamic.literal()
      AppMonitor.foreach(__v => __obj.updateDynamic("AppMonitor")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetAppMonitorResponse]
    }
  }

  @js.native
  trait ListAppMonitorsRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResultsInteger]
    var NextToken: js.UndefOr[String]
  }

  object ListAppMonitorsRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[MaxResultsInteger] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListAppMonitorsRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAppMonitorsRequest]
    }
  }

  @js.native
  trait ListAppMonitorsResponse extends js.Object {
    var AppMonitorSummaries: js.UndefOr[AppMonitorSummaryList]
    var NextToken: js.UndefOr[String]
  }

  object ListAppMonitorsResponse {
    @inline
    def apply(
        AppMonitorSummaries: js.UndefOr[AppMonitorSummaryList] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListAppMonitorsResponse = {
      val __obj = js.Dynamic.literal()
      AppMonitorSummaries.foreach(__v => __obj.updateDynamic("AppMonitorSummaries")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAppMonitorsResponse]
    }
  }

  @js.native
  trait ListRumMetricsDestinationsRequest extends js.Object {
    var AppMonitorName: AppMonitorName
    var MaxResults: js.UndefOr[MaxResultsInteger]
    var NextToken: js.UndefOr[String]
  }

  object ListRumMetricsDestinationsRequest {
    @inline
    def apply(
        AppMonitorName: AppMonitorName,
        MaxResults: js.UndefOr[MaxResultsInteger] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListRumMetricsDestinationsRequest = {
      val __obj = js.Dynamic.literal(
        "AppMonitorName" -> AppMonitorName.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListRumMetricsDestinationsRequest]
    }
  }

  @js.native
  trait ListRumMetricsDestinationsResponse extends js.Object {
    var Destinations: js.UndefOr[MetricDestinationSummaryList]
    var NextToken: js.UndefOr[String]
  }

  object ListRumMetricsDestinationsResponse {
    @inline
    def apply(
        Destinations: js.UndefOr[MetricDestinationSummaryList] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListRumMetricsDestinationsResponse = {
      val __obj = js.Dynamic.literal()
      Destinations.foreach(__v => __obj.updateDynamic("Destinations")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListRumMetricsDestinationsResponse]
    }
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var ResourceArn: Arn
  }

  object ListTagsForResourceRequest {
    @inline
    def apply(
        ResourceArn: Arn
    ): ListTagsForResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ListTagsForResourceRequest]
    }
  }

  @js.native
  trait ListTagsForResourceResponse extends js.Object {
    var ResourceArn: Arn
    var Tags: TagMap
  }

  object ListTagsForResourceResponse {
    @inline
    def apply(
        ResourceArn: Arn,
        Tags: TagMap
    ): ListTagsForResourceResponse = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any],
        "Tags" -> Tags.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ListTagsForResourceResponse]
    }
  }

  /** A structure that displays the definition of one extended metric that RUM sends to CloudWatch or CloudWatch Evidently. For more information, see [[https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-RUM-vended-metrics.html| Additional metrics that you can send to CloudWatch and CloudWatch Evidently]].
    */
  @js.native
  trait MetricDefinition extends js.Object {
    var MetricDefinitionId: MetricDefinitionId
    var Name: MetricName
    var DimensionKeys: js.UndefOr[DimensionKeysMap]
    var EventPattern: js.UndefOr[EventPattern]
    var UnitLabel: js.UndefOr[UnitLabel]
    var ValueKey: js.UndefOr[ValueKey]
  }

  object MetricDefinition {
    @inline
    def apply(
        MetricDefinitionId: MetricDefinitionId,
        Name: MetricName,
        DimensionKeys: js.UndefOr[DimensionKeysMap] = js.undefined,
        EventPattern: js.UndefOr[EventPattern] = js.undefined,
        UnitLabel: js.UndefOr[UnitLabel] = js.undefined,
        ValueKey: js.UndefOr[ValueKey] = js.undefined
    ): MetricDefinition = {
      val __obj = js.Dynamic.literal(
        "MetricDefinitionId" -> MetricDefinitionId.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]
      )

      DimensionKeys.foreach(__v => __obj.updateDynamic("DimensionKeys")(__v.asInstanceOf[js.Any]))
      EventPattern.foreach(__v => __obj.updateDynamic("EventPattern")(__v.asInstanceOf[js.Any]))
      UnitLabel.foreach(__v => __obj.updateDynamic("UnitLabel")(__v.asInstanceOf[js.Any]))
      ValueKey.foreach(__v => __obj.updateDynamic("ValueKey")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MetricDefinition]
    }
  }

  /** Use this structure to define one extended metric that RUM will send to CloudWatch or CloudWatch Evidently. For more information, see [[https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-RUM-vended-metrics.html| Additional metrics that you can send to CloudWatch and CloudWatch Evidently]]. Only certain combinations of values for <code>Name</code>, <code>ValueKey</code>, and <code>EventPattern</code> are valid. In addition to what is displayed in the list below, the <code>EventPattern</code> can also include information used by the <code>DimensionKeys</code> field. * If <code>Name</code> is <code>PerformanceNavigationDuration</code>, then <code>ValueKey</code>must be <code>event_details.duration</code> and the <code>EventPattern</code> must include <code>{"event_type":["com.amazon.rum.performance_navigation_event"]}</code> * If <code>Name</code> is <code>PerformanceResourceDuration</code>, then <code>ValueKey</code>must be <code>event_details.duration</code>
    * and the <code>EventPattern</code> must include <code>{"event_type":["com.amazon.rum.performance_resource_event"]}</code> * If <code>Name</code> is <code>NavigationSatisfiedTransaction</code>, then <code>ValueKey</code>must be null and the <code>EventPattern</code> must include <code>{ "event_type": ["com.amazon.rum.performance_navigation_event"], "event_details": { "duration": [{ "numeric": ["&gt;",2000] }] } }</code> * If <code>Name</code> is <code>NavigationToleratedTransaction</code>, then <code>ValueKey</code>must be null and the <code>EventPattern</code> must include <code>{ "event_type": ["com.amazon.rum.performance_navigation_event"], "event_details": { "duration": [{ "numeric": ["&gt;=",2000,"&lt;"8000] }] } }</code> * If <code>Name</code> is <code>NavigationFrustratedTransaction</code>, then <code>ValueKey</code>must be null and the <code>EventPattern</code> must include <code>{ "event_type": ["com.amazon.rum.performance_navigation_event"], "event_details": { "duration":
    * [{ "numeric": ["&gt;=",8000] }] } }</code> * If <code>Name</code> is <code>WebVitalsCumulativeLayoutShift</code>, then <code>ValueKey</code>must be <code>event_details.value</code> and the <code>EventPattern</code> must include <code>{"event_type":["com.amazon.rum.cumulative_layout_shift_event"]}</code> * If <code>Name</code> is <code>WebVitalsFirstInputDelay</code>, then <code>ValueKey</code>must be <code>event_details.value</code> and the <code>EventPattern</code> must include <code>{"event_type":["com.amazon.rum.first_input_delay_event"]}</code> * If <code>Name</code> is <code>WebVitalsLargestContentfulPaint</code>, then <code>ValueKey</code>must be <code>event_details.value</code> and the <code>EventPattern</code> must include <code>{"event_type":["com.amazon.rum.largest_contentful_paint_event"]}</code> * If <code>Name</code> is <code>JsErrorCount</code>, then <code>ValueKey</code>must be null and the <code>EventPattern</code> must include
    * <code>{"event_type":["com.amazon.rum.js_error_event"]}</code> * If <code>Name</code> is <code>HttpErrorCount</code>, then <code>ValueKey</code>must be null and the <code>EventPattern</code> must include <code>{"event_type":["com.amazon.rum.http_event"]}</code> * If <code>Name</code> is <code>SessionCount</code>, then <code>ValueKey</code>must be null and the <code>EventPattern</code> must include <code>{"event_type":["com.amazon.rum.session_start_event"]}</code>
    */
  @js.native
  trait MetricDefinitionRequest extends js.Object {
    var Name: MetricName
    var DimensionKeys: js.UndefOr[DimensionKeysMap]
    var EventPattern: js.UndefOr[EventPattern]
    var UnitLabel: js.UndefOr[UnitLabel]
    var ValueKey: js.UndefOr[ValueKey]
  }

  object MetricDefinitionRequest {
    @inline
    def apply(
        Name: MetricName,
        DimensionKeys: js.UndefOr[DimensionKeysMap] = js.undefined,
        EventPattern: js.UndefOr[EventPattern] = js.undefined,
        UnitLabel: js.UndefOr[UnitLabel] = js.undefined,
        ValueKey: js.UndefOr[ValueKey] = js.undefined
    ): MetricDefinitionRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      DimensionKeys.foreach(__v => __obj.updateDynamic("DimensionKeys")(__v.asInstanceOf[js.Any]))
      EventPattern.foreach(__v => __obj.updateDynamic("EventPattern")(__v.asInstanceOf[js.Any]))
      UnitLabel.foreach(__v => __obj.updateDynamic("UnitLabel")(__v.asInstanceOf[js.Any]))
      ValueKey.foreach(__v => __obj.updateDynamic("ValueKey")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MetricDefinitionRequest]
    }
  }

  /** A structure that displays information about one destination that CloudWatch RUM sends extended metrics to.
    */
  @js.native
  trait MetricDestinationSummary extends js.Object {
    var Destination: js.UndefOr[MetricDestination]
    var DestinationArn: js.UndefOr[DestinationArn]
    var IamRoleArn: js.UndefOr[IamRoleArn]
  }

  object MetricDestinationSummary {
    @inline
    def apply(
        Destination: js.UndefOr[MetricDestination] = js.undefined,
        DestinationArn: js.UndefOr[DestinationArn] = js.undefined,
        IamRoleArn: js.UndefOr[IamRoleArn] = js.undefined
    ): MetricDestinationSummary = {
      val __obj = js.Dynamic.literal()
      Destination.foreach(__v => __obj.updateDynamic("Destination")(__v.asInstanceOf[js.Any]))
      DestinationArn.foreach(__v => __obj.updateDynamic("DestinationArn")(__v.asInstanceOf[js.Any]))
      IamRoleArn.foreach(__v => __obj.updateDynamic("IamRoleArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MetricDestinationSummary]
    }
  }

  @js.native
  trait PutRumEventsRequest extends js.Object {
    var AppMonitorDetails: AppMonitorDetails
    var BatchId: String
    var Id: AppMonitorId
    var RumEvents: RumEventList
    var UserDetails: UserDetails
  }

  object PutRumEventsRequest {
    @inline
    def apply(
        AppMonitorDetails: AppMonitorDetails,
        BatchId: String,
        Id: AppMonitorId,
        RumEvents: RumEventList,
        UserDetails: UserDetails
    ): PutRumEventsRequest = {
      val __obj = js.Dynamic.literal(
        "AppMonitorDetails" -> AppMonitorDetails.asInstanceOf[js.Any],
        "BatchId" -> BatchId.asInstanceOf[js.Any],
        "Id" -> Id.asInstanceOf[js.Any],
        "RumEvents" -> RumEvents.asInstanceOf[js.Any],
        "UserDetails" -> UserDetails.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[PutRumEventsRequest]
    }
  }

  @js.native
  trait PutRumEventsResponse extends js.Object

  object PutRumEventsResponse {
    @inline
    def apply(): PutRumEventsResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PutRumEventsResponse]
    }
  }

  @js.native
  trait PutRumMetricsDestinationRequest extends js.Object {
    var AppMonitorName: AppMonitorName
    var Destination: MetricDestination
    var DestinationArn: js.UndefOr[DestinationArn]
    var IamRoleArn: js.UndefOr[IamRoleArn]
  }

  object PutRumMetricsDestinationRequest {
    @inline
    def apply(
        AppMonitorName: AppMonitorName,
        Destination: MetricDestination,
        DestinationArn: js.UndefOr[DestinationArn] = js.undefined,
        IamRoleArn: js.UndefOr[IamRoleArn] = js.undefined
    ): PutRumMetricsDestinationRequest = {
      val __obj = js.Dynamic.literal(
        "AppMonitorName" -> AppMonitorName.asInstanceOf[js.Any],
        "Destination" -> Destination.asInstanceOf[js.Any]
      )

      DestinationArn.foreach(__v => __obj.updateDynamic("DestinationArn")(__v.asInstanceOf[js.Any]))
      IamRoleArn.foreach(__v => __obj.updateDynamic("IamRoleArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutRumMetricsDestinationRequest]
    }
  }

  @js.native
  trait PutRumMetricsDestinationResponse extends js.Object

  object PutRumMetricsDestinationResponse {
    @inline
    def apply(): PutRumMetricsDestinationResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PutRumMetricsDestinationResponse]
    }
  }

  /** A structure that defines a key and values that you can use to filter the results. The only performance events that are returned are those that have values matching the ones that you specify in one of your <code>QueryFilter</code> structures. For example, you could specify <code>Browser</code> as the <code>Name</code> and specify <code>Chrome,Firefox</code> as the <code>Values</code> to return events generated only from those browsers. Specifying <code>Invert</code> as the <code>Name</code> works as a "not equal to" filter. For example, specify <code>Invert</code> as the <code>Name</code> and specify <code>Chrome</code> as the value to return all events except events from user sessions with the Chrome browser.
    */
  @js.native
  trait QueryFilter extends js.Object {
    var Name: js.UndefOr[QueryFilterKey]
    var Values: js.UndefOr[QueryFilterValueList]
  }

  object QueryFilter {
    @inline
    def apply(
        Name: js.UndefOr[QueryFilterKey] = js.undefined,
        Values: js.UndefOr[QueryFilterValueList] = js.undefined
    ): QueryFilter = {
      val __obj = js.Dynamic.literal()
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Values.foreach(__v => __obj.updateDynamic("Values")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[QueryFilter]
    }
  }

  /** A structure that contains the information for one performance event that RUM collects from a user session with your application.
    */
  @js.native
  trait RumEvent extends js.Object {
    var details: JsonValue
    var id: String
    var timestamp: Timestamp
    var `type`: String
    var metadata: js.UndefOr[JsonValue]
  }

  object RumEvent {
    @inline
    def apply(
        details: JsonValue,
        id: String,
        timestamp: Timestamp,
        `type`: String,
        metadata: js.UndefOr[JsonValue] = js.undefined
    ): RumEvent = {
      val __obj = js.Dynamic.literal(
        "details" -> details.asInstanceOf[js.Any],
        "id" -> id.asInstanceOf[js.Any],
        "timestamp" -> timestamp.asInstanceOf[js.Any],
        "type" -> `type`.asInstanceOf[js.Any]
      )

      metadata.foreach(__v => __obj.updateDynamic("metadata")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RumEvent]
    }
  }

  @js.native
  trait TagResourceRequest extends js.Object {
    var ResourceArn: Arn
    var Tags: TagMap
  }

  object TagResourceRequest {
    @inline
    def apply(
        ResourceArn: Arn,
        Tags: TagMap
    ): TagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any],
        "Tags" -> Tags.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[TagResourceRequest]
    }
  }

  @js.native
  trait TagResourceResponse extends js.Object

  object TagResourceResponse {
    @inline
    def apply(): TagResourceResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TagResourceResponse]
    }
  }

  /** A structure that defines the time range that you want to retrieve results from.
    */
  @js.native
  trait TimeRange extends js.Object {
    var After: QueryTimestamp
    var Before: js.UndefOr[QueryTimestamp]
  }

  object TimeRange {
    @inline
    def apply(
        After: QueryTimestamp,
        Before: js.UndefOr[QueryTimestamp] = js.undefined
    ): TimeRange = {
      val __obj = js.Dynamic.literal(
        "After" -> After.asInstanceOf[js.Any]
      )

      Before.foreach(__v => __obj.updateDynamic("Before")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TimeRange]
    }
  }

  @js.native
  trait UntagResourceRequest extends js.Object {
    var ResourceArn: Arn
    var TagKeys: TagKeyList
  }

  object UntagResourceRequest {
    @inline
    def apply(
        ResourceArn: Arn,
        TagKeys: TagKeyList
    ): UntagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any],
        "TagKeys" -> TagKeys.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UntagResourceRequest]
    }
  }

  @js.native
  trait UntagResourceResponse extends js.Object

  object UntagResourceResponse {
    @inline
    def apply(): UntagResourceResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UntagResourceResponse]
    }
  }

  @js.native
  trait UpdateAppMonitorRequest extends js.Object {
    var Name: AppMonitorName
    var AppMonitorConfiguration: js.UndefOr[AppMonitorConfiguration]
    var CustomEvents: js.UndefOr[CustomEvents]
    var CwLogEnabled: js.UndefOr[Boolean]
    var Domain: js.UndefOr[AppMonitorDomain]
  }

  object UpdateAppMonitorRequest {
    @inline
    def apply(
        Name: AppMonitorName,
        AppMonitorConfiguration: js.UndefOr[AppMonitorConfiguration] = js.undefined,
        CustomEvents: js.UndefOr[CustomEvents] = js.undefined,
        CwLogEnabled: js.UndefOr[Boolean] = js.undefined,
        Domain: js.UndefOr[AppMonitorDomain] = js.undefined
    ): UpdateAppMonitorRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      AppMonitorConfiguration.foreach(__v => __obj.updateDynamic("AppMonitorConfiguration")(__v.asInstanceOf[js.Any]))
      CustomEvents.foreach(__v => __obj.updateDynamic("CustomEvents")(__v.asInstanceOf[js.Any]))
      CwLogEnabled.foreach(__v => __obj.updateDynamic("CwLogEnabled")(__v.asInstanceOf[js.Any]))
      Domain.foreach(__v => __obj.updateDynamic("Domain")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateAppMonitorRequest]
    }
  }

  @js.native
  trait UpdateAppMonitorResponse extends js.Object

  object UpdateAppMonitorResponse {
    @inline
    def apply(): UpdateAppMonitorResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateAppMonitorResponse]
    }
  }

  @js.native
  trait UpdateRumMetricDefinitionRequest extends js.Object {
    var AppMonitorName: AppMonitorName
    var Destination: MetricDestination
    var MetricDefinition: MetricDefinitionRequest
    var MetricDefinitionId: MetricDefinitionId
    var DestinationArn: js.UndefOr[DestinationArn]
  }

  object UpdateRumMetricDefinitionRequest {
    @inline
    def apply(
        AppMonitorName: AppMonitorName,
        Destination: MetricDestination,
        MetricDefinition: MetricDefinitionRequest,
        MetricDefinitionId: MetricDefinitionId,
        DestinationArn: js.UndefOr[DestinationArn] = js.undefined
    ): UpdateRumMetricDefinitionRequest = {
      val __obj = js.Dynamic.literal(
        "AppMonitorName" -> AppMonitorName.asInstanceOf[js.Any],
        "Destination" -> Destination.asInstanceOf[js.Any],
        "MetricDefinition" -> MetricDefinition.asInstanceOf[js.Any],
        "MetricDefinitionId" -> MetricDefinitionId.asInstanceOf[js.Any]
      )

      DestinationArn.foreach(__v => __obj.updateDynamic("DestinationArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateRumMetricDefinitionRequest]
    }
  }

  @js.native
  trait UpdateRumMetricDefinitionResponse extends js.Object

  object UpdateRumMetricDefinitionResponse {
    @inline
    def apply(): UpdateRumMetricDefinitionResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateRumMetricDefinitionResponse]
    }
  }

  /** A structure that contains information about the user session that this batch of events was collected from.
    */
  @js.native
  trait UserDetails extends js.Object {
    var sessionId: js.UndefOr[String]
    var userId: js.UndefOr[String]
  }

  object UserDetails {
    @inline
    def apply(
        sessionId: js.UndefOr[String] = js.undefined,
        userId: js.UndefOr[String] = js.undefined
    ): UserDetails = {
      val __obj = js.Dynamic.literal()
      sessionId.foreach(__v => __obj.updateDynamic("sessionId")(__v.asInstanceOf[js.Any]))
      userId.foreach(__v => __obj.updateDynamic("userId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UserDetails]
    }
  }
}
