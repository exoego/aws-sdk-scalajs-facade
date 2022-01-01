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
  type EventData = String
  type EventDataList = js.Array[EventData]
  type FavoritePages = js.Array[String]
  type ISOTimestampString = String
  type IdentityPoolId = String
  type JsonValue = String
  type MaxQueryResults = Int
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
  type Url = String

  final class RUMOps(private val service: RUM) extends AnyVal {

    @inline def createAppMonitorFuture(params: CreateAppMonitorRequest): Future[CreateAppMonitorResponse] = service.createAppMonitor(params).promise().toFuture
    @inline def deleteAppMonitorFuture(params: DeleteAppMonitorRequest): Future[DeleteAppMonitorResponse] = service.deleteAppMonitor(params).promise().toFuture
    @inline def getAppMonitorDataFuture(params: GetAppMonitorDataRequest): Future[GetAppMonitorDataResponse] = service.getAppMonitorData(params).promise().toFuture
    @inline def getAppMonitorFuture(params: GetAppMonitorRequest): Future[GetAppMonitorResponse] = service.getAppMonitor(params).promise().toFuture
    @inline def listAppMonitorsFuture(params: ListAppMonitorsRequest): Future[ListAppMonitorsResponse] = service.listAppMonitors(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] = service.listTagsForResource(params).promise().toFuture
    @inline def putRumEventsFuture(params: PutRumEventsRequest): Future[PutRumEventsResponse] = service.putRumEvents(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] = service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] = service.untagResource(params).promise().toFuture
    @inline def updateAppMonitorFuture(params: UpdateAppMonitorRequest): Future[UpdateAppMonitorResponse] = service.updateAppMonitor(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/rum", JSImport.Namespace, "AWS.RUM")
  class RUM() extends js.Object {
    def this(config: AWSConfig) = this()

    def createAppMonitor(params: CreateAppMonitorRequest): Request[CreateAppMonitorResponse] = js.native
    def deleteAppMonitor(params: DeleteAppMonitorRequest): Request[DeleteAppMonitorResponse] = js.native
    def getAppMonitor(params: GetAppMonitorRequest): Request[GetAppMonitorResponse] = js.native
    def getAppMonitorData(params: GetAppMonitorDataRequest): Request[GetAppMonitorDataResponse] = js.native
    def listAppMonitors(params: ListAppMonitorsRequest): Request[ListAppMonitorsResponse] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def putRumEvents(params: PutRumEventsRequest): Request[PutRumEventsResponse] = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse] = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse] = js.native
    def updateAppMonitor(params: UpdateAppMonitorRequest): Request[UpdateAppMonitorResponse] = js.native
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

  @js.native
  trait CreateAppMonitorRequest extends js.Object {
    var Domain: AppMonitorDomain
    var Name: AppMonitorName
    var AppMonitorConfiguration: js.UndefOr[AppMonitorConfiguration]
    var CwLogEnabled: js.UndefOr[Boolean]
    var Tags: js.UndefOr[TagMap]
  }

  object CreateAppMonitorRequest {
    @inline
    def apply(
        Domain: AppMonitorDomain,
        Name: AppMonitorName,
        AppMonitorConfiguration: js.UndefOr[AppMonitorConfiguration] = js.undefined,
        CwLogEnabled: js.UndefOr[Boolean] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined
    ): CreateAppMonitorRequest = {
      val __obj = js.Dynamic.literal(
        "Domain" -> Domain.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]
      )

      AppMonitorConfiguration.foreach(__v => __obj.updateDynamic("AppMonitorConfiguration")(__v.asInstanceOf[js.Any]))
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
    var MaxResults: js.UndefOr[Int]
    var NextToken: js.UndefOr[String]
  }

  object ListAppMonitorsRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[Int] = js.undefined,
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
    var CwLogEnabled: js.UndefOr[Boolean]
    var Domain: js.UndefOr[AppMonitorDomain]
  }

  object UpdateAppMonitorRequest {
    @inline
    def apply(
        Name: AppMonitorName,
        AppMonitorConfiguration: js.UndefOr[AppMonitorConfiguration] = js.undefined,
        CwLogEnabled: js.UndefOr[Boolean] = js.undefined,
        Domain: js.UndefOr[AppMonitorDomain] = js.undefined
    ): UpdateAppMonitorRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      AppMonitorConfiguration.foreach(__v => __obj.updateDynamic("AppMonitorConfiguration")(__v.asInstanceOf[js.Any]))
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
