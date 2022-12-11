package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import scala.language.implicitConversions
import facade.amazonaws._

package object cloudtrail {
  type AccountId = String
  type AdvancedEventSelectors = js.Array[AdvancedEventSelector]
  type AdvancedFieldSelectors = js.Array[AdvancedFieldSelector]
  type ByteBuffer = js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type ChannelArn = String
  type ChannelName = String
  type Channels = js.Array[Channel]
  type DataResourceValues = js.Array[String]
  type DataResources = js.Array[DataResource]
  type Date = js.Date
  type DeliveryS3Uri = String
  type Destinations = js.Array[Destination]
  type ErrorMessage = String
  type EventDataStoreArn = String
  type EventDataStoreKmsKeyId = String
  type EventDataStoreName = String
  type EventDataStores = js.Array[EventDataStore]
  type EventSelectors = js.Array[EventSelector]
  type EventsList = js.Array[Event]
  type ExcludeManagementEventSources = js.Array[String]
  type ImportDestinations = js.Array[EventDataStoreArn]
  type ImportFailureList = js.Array[ImportFailureListItem]
  type ImportsList = js.Array[ImportsListItem]
  type InsightSelectors = js.Array[InsightSelector]
  type ListChannelsMaxResultsCount = Int
  type ListEventDataStoresMaxResultsCount = Int
  type ListImportFailuresMaxResultsCount = Int
  type ListImportsMaxResultsCount = Int
  type ListQueriesMaxResultsCount = Int
  type Location = String
  type LookupAttributesList = js.Array[LookupAttribute]
  type MaxQueryResults = Int
  type MaxResults = Int
  type NextToken = String
  type Operator = js.Array[OperatorValue]
  type OperatorValue = String
  type PaginationToken = String
  type PublicKeyList = js.Array[PublicKey]
  type Queries = js.Array[Query]
  type QueryResultColumn = js.Dictionary[QueryResultValue]
  type QueryResultKey = String
  type QueryResultRow = js.Array[QueryResultColumn]
  type QueryResultRows = js.Array[QueryResultRow]
  type QueryResultValue = String
  type QueryStatement = String
  type ResourceIdList = js.Array[String]
  type ResourceList = js.Array[Resource]
  type ResourceTagList = js.Array[ResourceTag]
  type RetentionPeriod = Int
  type SelectorField = String
  type SelectorName = String
  type Source = String
  type TagKey = String
  type TagValue = String
  type TagsList = js.Array[Tag]
  type TerminationProtectionEnabled = Boolean
  type TrailList = js.Array[Trail]
  type TrailNameList = js.Array[String]
  type Trails = js.Array[TrailInfo]
  type UUID = String

  final class CloudTrailOps(private val service: CloudTrail) extends AnyVal {

    @inline def addTagsFuture(params: AddTagsRequest): Future[AddTagsResponse] = service.addTags(params).promise().toFuture
    @inline def cancelQueryFuture(params: CancelQueryRequest): Future[CancelQueryResponse] = service.cancelQuery(params).promise().toFuture
    @inline def createEventDataStoreFuture(params: CreateEventDataStoreRequest): Future[CreateEventDataStoreResponse] = service.createEventDataStore(params).promise().toFuture
    @inline def createTrailFuture(params: CreateTrailRequest): Future[CreateTrailResponse] = service.createTrail(params).promise().toFuture
    @inline def deleteEventDataStoreFuture(params: DeleteEventDataStoreRequest): Future[DeleteEventDataStoreResponse] = service.deleteEventDataStore(params).promise().toFuture
    @inline def deleteTrailFuture(params: DeleteTrailRequest): Future[DeleteTrailResponse] = service.deleteTrail(params).promise().toFuture
    @inline def deregisterOrganizationDelegatedAdminFuture(params: DeregisterOrganizationDelegatedAdminRequest): Future[DeregisterOrganizationDelegatedAdminResponse] = service.deregisterOrganizationDelegatedAdmin(params).promise().toFuture
    @inline def describeQueryFuture(params: DescribeQueryRequest): Future[DescribeQueryResponse] = service.describeQuery(params).promise().toFuture
    @inline def describeTrailsFuture(params: DescribeTrailsRequest): Future[DescribeTrailsResponse] = service.describeTrails(params).promise().toFuture
    @inline def getChannelFuture(params: GetChannelRequest): Future[GetChannelResponse] = service.getChannel(params).promise().toFuture
    @inline def getEventDataStoreFuture(params: GetEventDataStoreRequest): Future[GetEventDataStoreResponse] = service.getEventDataStore(params).promise().toFuture
    @inline def getEventSelectorsFuture(params: GetEventSelectorsRequest): Future[GetEventSelectorsResponse] = service.getEventSelectors(params).promise().toFuture
    @inline def getImportFuture(params: GetImportRequest): Future[GetImportResponse] = service.getImport(params).promise().toFuture
    @inline def getInsightSelectorsFuture(params: GetInsightSelectorsRequest): Future[GetInsightSelectorsResponse] = service.getInsightSelectors(params).promise().toFuture
    @inline def getQueryResultsFuture(params: GetQueryResultsRequest): Future[GetQueryResultsResponse] = service.getQueryResults(params).promise().toFuture
    @inline def getTrailFuture(params: GetTrailRequest): Future[GetTrailResponse] = service.getTrail(params).promise().toFuture
    @inline def getTrailStatusFuture(params: GetTrailStatusRequest): Future[GetTrailStatusResponse] = service.getTrailStatus(params).promise().toFuture
    @inline def listChannelsFuture(params: ListChannelsRequest): Future[ListChannelsResponse] = service.listChannels(params).promise().toFuture
    @inline def listEventDataStoresFuture(params: ListEventDataStoresRequest): Future[ListEventDataStoresResponse] = service.listEventDataStores(params).promise().toFuture
    @inline def listImportFailuresFuture(params: ListImportFailuresRequest): Future[ListImportFailuresResponse] = service.listImportFailures(params).promise().toFuture
    @inline def listImportsFuture(params: ListImportsRequest): Future[ListImportsResponse] = service.listImports(params).promise().toFuture
    @inline def listPublicKeysFuture(params: ListPublicKeysRequest): Future[ListPublicKeysResponse] = service.listPublicKeys(params).promise().toFuture
    @inline def listQueriesFuture(params: ListQueriesRequest): Future[ListQueriesResponse] = service.listQueries(params).promise().toFuture
    @inline def listTagsFuture(params: ListTagsRequest): Future[ListTagsResponse] = service.listTags(params).promise().toFuture
    @inline def listTrailsFuture(params: ListTrailsRequest): Future[ListTrailsResponse] = service.listTrails(params).promise().toFuture
    @inline def lookupEventsFuture(params: LookupEventsRequest): Future[LookupEventsResponse] = service.lookupEvents(params).promise().toFuture
    @inline def putEventSelectorsFuture(params: PutEventSelectorsRequest): Future[PutEventSelectorsResponse] = service.putEventSelectors(params).promise().toFuture
    @inline def putInsightSelectorsFuture(params: PutInsightSelectorsRequest): Future[PutInsightSelectorsResponse] = service.putInsightSelectors(params).promise().toFuture
    @inline def registerOrganizationDelegatedAdminFuture(params: RegisterOrganizationDelegatedAdminRequest): Future[RegisterOrganizationDelegatedAdminResponse] = service.registerOrganizationDelegatedAdmin(params).promise().toFuture
    @inline def removeTagsFuture(params: RemoveTagsRequest): Future[RemoveTagsResponse] = service.removeTags(params).promise().toFuture
    @inline def restoreEventDataStoreFuture(params: RestoreEventDataStoreRequest): Future[RestoreEventDataStoreResponse] = service.restoreEventDataStore(params).promise().toFuture
    @inline def startImportFuture(params: StartImportRequest): Future[StartImportResponse] = service.startImport(params).promise().toFuture
    @inline def startLoggingFuture(params: StartLoggingRequest): Future[StartLoggingResponse] = service.startLogging(params).promise().toFuture
    @inline def startQueryFuture(params: StartQueryRequest): Future[StartQueryResponse] = service.startQuery(params).promise().toFuture
    @inline def stopImportFuture(params: StopImportRequest): Future[StopImportResponse] = service.stopImport(params).promise().toFuture
    @inline def stopLoggingFuture(params: StopLoggingRequest): Future[StopLoggingResponse] = service.stopLogging(params).promise().toFuture
    @inline def updateEventDataStoreFuture(params: UpdateEventDataStoreRequest): Future[UpdateEventDataStoreResponse] = service.updateEventDataStore(params).promise().toFuture
    @inline def updateTrailFuture(params: UpdateTrailRequest): Future[UpdateTrailResponse] = service.updateTrail(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/cloudtrail", JSImport.Namespace, "AWS.CloudTrail")
  class CloudTrail() extends js.Object {
    def this(config: AWSConfig) = this()

    def addTags(params: AddTagsRequest): Request[AddTagsResponse] = js.native
    def cancelQuery(params: CancelQueryRequest): Request[CancelQueryResponse] = js.native
    def createEventDataStore(params: CreateEventDataStoreRequest): Request[CreateEventDataStoreResponse] = js.native
    def createTrail(params: CreateTrailRequest): Request[CreateTrailResponse] = js.native
    def deleteEventDataStore(params: DeleteEventDataStoreRequest): Request[DeleteEventDataStoreResponse] = js.native
    def deleteTrail(params: DeleteTrailRequest): Request[DeleteTrailResponse] = js.native
    def deregisterOrganizationDelegatedAdmin(params: DeregisterOrganizationDelegatedAdminRequest): Request[DeregisterOrganizationDelegatedAdminResponse] = js.native
    def describeQuery(params: DescribeQueryRequest): Request[DescribeQueryResponse] = js.native
    def describeTrails(params: DescribeTrailsRequest): Request[DescribeTrailsResponse] = js.native
    def getChannel(params: GetChannelRequest): Request[GetChannelResponse] = js.native
    def getEventDataStore(params: GetEventDataStoreRequest): Request[GetEventDataStoreResponse] = js.native
    def getEventSelectors(params: GetEventSelectorsRequest): Request[GetEventSelectorsResponse] = js.native
    def getImport(params: GetImportRequest): Request[GetImportResponse] = js.native
    def getInsightSelectors(params: GetInsightSelectorsRequest): Request[GetInsightSelectorsResponse] = js.native
    def getQueryResults(params: GetQueryResultsRequest): Request[GetQueryResultsResponse] = js.native
    def getTrail(params: GetTrailRequest): Request[GetTrailResponse] = js.native
    def getTrailStatus(params: GetTrailStatusRequest): Request[GetTrailStatusResponse] = js.native
    def listChannels(params: ListChannelsRequest): Request[ListChannelsResponse] = js.native
    def listEventDataStores(params: ListEventDataStoresRequest): Request[ListEventDataStoresResponse] = js.native
    def listImportFailures(params: ListImportFailuresRequest): Request[ListImportFailuresResponse] = js.native
    def listImports(params: ListImportsRequest): Request[ListImportsResponse] = js.native
    def listPublicKeys(params: ListPublicKeysRequest): Request[ListPublicKeysResponse] = js.native
    def listQueries(params: ListQueriesRequest): Request[ListQueriesResponse] = js.native
    def listTags(params: ListTagsRequest): Request[ListTagsResponse] = js.native
    def listTrails(params: ListTrailsRequest): Request[ListTrailsResponse] = js.native
    def lookupEvents(params: LookupEventsRequest): Request[LookupEventsResponse] = js.native
    def putEventSelectors(params: PutEventSelectorsRequest): Request[PutEventSelectorsResponse] = js.native
    def putInsightSelectors(params: PutInsightSelectorsRequest): Request[PutInsightSelectorsResponse] = js.native
    def registerOrganizationDelegatedAdmin(params: RegisterOrganizationDelegatedAdminRequest): Request[RegisterOrganizationDelegatedAdminResponse] = js.native
    def removeTags(params: RemoveTagsRequest): Request[RemoveTagsResponse] = js.native
    def restoreEventDataStore(params: RestoreEventDataStoreRequest): Request[RestoreEventDataStoreResponse] = js.native
    def startImport(params: StartImportRequest): Request[StartImportResponse] = js.native
    def startLogging(params: StartLoggingRequest): Request[StartLoggingResponse] = js.native
    def startQuery(params: StartQueryRequest): Request[StartQueryResponse] = js.native
    def stopImport(params: StopImportRequest): Request[StopImportResponse] = js.native
    def stopLogging(params: StopLoggingRequest): Request[StopLoggingResponse] = js.native
    def updateEventDataStore(params: UpdateEventDataStoreRequest): Request[UpdateEventDataStoreResponse] = js.native
    def updateTrail(params: UpdateTrailRequest): Request[UpdateTrailResponse] = js.native
  }
  object CloudTrail {
    @inline implicit def toOps(service: CloudTrail): CloudTrailOps = {
      new CloudTrailOps(service)
    }
  }

  /** Specifies the tags to add to a trail or event data store.
    */
  @js.native
  trait AddTagsRequest extends js.Object {
    var ResourceId: String
    var TagsList: TagsList
  }

  object AddTagsRequest {
    @inline
    def apply(
        ResourceId: String,
        TagsList: TagsList
    ): AddTagsRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceId" -> ResourceId.asInstanceOf[js.Any],
        "TagsList" -> TagsList.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AddTagsRequest]
    }
  }

  /** Returns the objects or data if successful. Otherwise, returns an error.
    */
  @js.native
  trait AddTagsResponse extends js.Object

  object AddTagsResponse {
    @inline
    def apply(): AddTagsResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AddTagsResponse]
    }
  }

  /** Advanced event selectors let you create fine-grained selectors for the following CloudTrail event record ﬁelds. They help you control costs by logging only those events that are important to you. For more information about advanced event selectors, see [[https://docs.aws.amazon.com/awscloudtrail/latest/userguide/logging-data-events-with-cloudtrail.html|Logging data events for trails]] in the <i>CloudTrail User Guide</i>. * <code>readOnly</code> * <code>eventSource</code> * <code>eventName</code> * <code>eventCategory</code> * <code>resources.type</code> * <code>resources.ARN</code> You cannot apply both event selectors and advanced event selectors to a trail.
    */
  @js.native
  trait AdvancedEventSelector extends js.Object {
    var FieldSelectors: AdvancedFieldSelectors
    var Name: js.UndefOr[SelectorName]
  }

  object AdvancedEventSelector {
    @inline
    def apply(
        FieldSelectors: AdvancedFieldSelectors,
        Name: js.UndefOr[SelectorName] = js.undefined
    ): AdvancedEventSelector = {
      val __obj = js.Dynamic.literal(
        "FieldSelectors" -> FieldSelectors.asInstanceOf[js.Any]
      )

      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AdvancedEventSelector]
    }
  }

  /** A single selector statement in an advanced event selector.
    */
  @js.native
  trait AdvancedFieldSelector extends js.Object {
    var Field: SelectorField
    var EndsWith: js.UndefOr[Operator]
    var Equals: js.UndefOr[Operator]
    var NotEndsWith: js.UndefOr[Operator]
    var NotEquals: js.UndefOr[Operator]
    var NotStartsWith: js.UndefOr[Operator]
    var StartsWith: js.UndefOr[Operator]
  }

  object AdvancedFieldSelector {
    @inline
    def apply(
        Field: SelectorField,
        EndsWith: js.UndefOr[Operator] = js.undefined,
        Equals: js.UndefOr[Operator] = js.undefined,
        NotEndsWith: js.UndefOr[Operator] = js.undefined,
        NotEquals: js.UndefOr[Operator] = js.undefined,
        NotStartsWith: js.UndefOr[Operator] = js.undefined,
        StartsWith: js.UndefOr[Operator] = js.undefined
    ): AdvancedFieldSelector = {
      val __obj = js.Dynamic.literal(
        "Field" -> Field.asInstanceOf[js.Any]
      )

      EndsWith.foreach(__v => __obj.updateDynamic("EndsWith")(__v.asInstanceOf[js.Any]))
      Equals.foreach(__v => __obj.updateDynamic("Equals")(__v.asInstanceOf[js.Any]))
      NotEndsWith.foreach(__v => __obj.updateDynamic("NotEndsWith")(__v.asInstanceOf[js.Any]))
      NotEquals.foreach(__v => __obj.updateDynamic("NotEquals")(__v.asInstanceOf[js.Any]))
      NotStartsWith.foreach(__v => __obj.updateDynamic("NotStartsWith")(__v.asInstanceOf[js.Any]))
      StartsWith.foreach(__v => __obj.updateDynamic("StartsWith")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AdvancedFieldSelector]
    }
  }

  @js.native
  trait CancelQueryRequest extends js.Object {
    var QueryId: UUID
    var EventDataStore: js.UndefOr[EventDataStoreArn]
  }

  object CancelQueryRequest {
    @inline
    def apply(
        QueryId: UUID,
        EventDataStore: js.UndefOr[EventDataStoreArn] = js.undefined
    ): CancelQueryRequest = {
      val __obj = js.Dynamic.literal(
        "QueryId" -> QueryId.asInstanceOf[js.Any]
      )

      EventDataStore.foreach(__v => __obj.updateDynamic("EventDataStore")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CancelQueryRequest]
    }
  }

  @js.native
  trait CancelQueryResponse extends js.Object {
    var QueryId: UUID
    var QueryStatus: QueryStatus
  }

  object CancelQueryResponse {
    @inline
    def apply(
        QueryId: UUID,
        QueryStatus: QueryStatus
    ): CancelQueryResponse = {
      val __obj = js.Dynamic.literal(
        "QueryId" -> QueryId.asInstanceOf[js.Any],
        "QueryStatus" -> QueryStatus.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CancelQueryResponse]
    }
  }

  /** Contains information about a returned CloudTrail channel.
    */
  @js.native
  trait Channel extends js.Object {
    var ChannelArn: js.UndefOr[ChannelArn]
    var Name: js.UndefOr[ChannelName]
  }

  object Channel {
    @inline
    def apply(
        ChannelArn: js.UndefOr[ChannelArn] = js.undefined,
        Name: js.UndefOr[ChannelName] = js.undefined
    ): Channel = {
      val __obj = js.Dynamic.literal()
      ChannelArn.foreach(__v => __obj.updateDynamic("ChannelArn")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Channel]
    }
  }

  @js.native
  trait CreateEventDataStoreRequest extends js.Object {
    var Name: EventDataStoreName
    var AdvancedEventSelectors: js.UndefOr[AdvancedEventSelectors]
    var KmsKeyId: js.UndefOr[EventDataStoreKmsKeyId]
    var MultiRegionEnabled: js.UndefOr[Boolean]
    var OrganizationEnabled: js.UndefOr[Boolean]
    var RetentionPeriod: js.UndefOr[RetentionPeriod]
    var TagsList: js.UndefOr[TagsList]
    var TerminationProtectionEnabled: js.UndefOr[TerminationProtectionEnabled]
  }

  object CreateEventDataStoreRequest {
    @inline
    def apply(
        Name: EventDataStoreName,
        AdvancedEventSelectors: js.UndefOr[AdvancedEventSelectors] = js.undefined,
        KmsKeyId: js.UndefOr[EventDataStoreKmsKeyId] = js.undefined,
        MultiRegionEnabled: js.UndefOr[Boolean] = js.undefined,
        OrganizationEnabled: js.UndefOr[Boolean] = js.undefined,
        RetentionPeriod: js.UndefOr[RetentionPeriod] = js.undefined,
        TagsList: js.UndefOr[TagsList] = js.undefined,
        TerminationProtectionEnabled: js.UndefOr[TerminationProtectionEnabled] = js.undefined
    ): CreateEventDataStoreRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      AdvancedEventSelectors.foreach(__v => __obj.updateDynamic("AdvancedEventSelectors")(__v.asInstanceOf[js.Any]))
      KmsKeyId.foreach(__v => __obj.updateDynamic("KmsKeyId")(__v.asInstanceOf[js.Any]))
      MultiRegionEnabled.foreach(__v => __obj.updateDynamic("MultiRegionEnabled")(__v.asInstanceOf[js.Any]))
      OrganizationEnabled.foreach(__v => __obj.updateDynamic("OrganizationEnabled")(__v.asInstanceOf[js.Any]))
      RetentionPeriod.foreach(__v => __obj.updateDynamic("RetentionPeriod")(__v.asInstanceOf[js.Any]))
      TagsList.foreach(__v => __obj.updateDynamic("TagsList")(__v.asInstanceOf[js.Any]))
      TerminationProtectionEnabled.foreach(__v => __obj.updateDynamic("TerminationProtectionEnabled")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateEventDataStoreRequest]
    }
  }

  @js.native
  trait CreateEventDataStoreResponse extends js.Object {
    var AdvancedEventSelectors: js.UndefOr[AdvancedEventSelectors]
    var CreatedTimestamp: js.UndefOr[Date]
    var EventDataStoreArn: js.UndefOr[EventDataStoreArn]
    var KmsKeyId: js.UndefOr[EventDataStoreKmsKeyId]
    var MultiRegionEnabled: js.UndefOr[Boolean]
    var Name: js.UndefOr[EventDataStoreName]
    var OrganizationEnabled: js.UndefOr[Boolean]
    var RetentionPeriod: js.UndefOr[RetentionPeriod]
    var Status: js.UndefOr[EventDataStoreStatus]
    var TagsList: js.UndefOr[TagsList]
    var TerminationProtectionEnabled: js.UndefOr[TerminationProtectionEnabled]
    var UpdatedTimestamp: js.UndefOr[Date]
  }

  object CreateEventDataStoreResponse {
    @inline
    def apply(
        AdvancedEventSelectors: js.UndefOr[AdvancedEventSelectors] = js.undefined,
        CreatedTimestamp: js.UndefOr[Date] = js.undefined,
        EventDataStoreArn: js.UndefOr[EventDataStoreArn] = js.undefined,
        KmsKeyId: js.UndefOr[EventDataStoreKmsKeyId] = js.undefined,
        MultiRegionEnabled: js.UndefOr[Boolean] = js.undefined,
        Name: js.UndefOr[EventDataStoreName] = js.undefined,
        OrganizationEnabled: js.UndefOr[Boolean] = js.undefined,
        RetentionPeriod: js.UndefOr[RetentionPeriod] = js.undefined,
        Status: js.UndefOr[EventDataStoreStatus] = js.undefined,
        TagsList: js.UndefOr[TagsList] = js.undefined,
        TerminationProtectionEnabled: js.UndefOr[TerminationProtectionEnabled] = js.undefined,
        UpdatedTimestamp: js.UndefOr[Date] = js.undefined
    ): CreateEventDataStoreResponse = {
      val __obj = js.Dynamic.literal()
      AdvancedEventSelectors.foreach(__v => __obj.updateDynamic("AdvancedEventSelectors")(__v.asInstanceOf[js.Any]))
      CreatedTimestamp.foreach(__v => __obj.updateDynamic("CreatedTimestamp")(__v.asInstanceOf[js.Any]))
      EventDataStoreArn.foreach(__v => __obj.updateDynamic("EventDataStoreArn")(__v.asInstanceOf[js.Any]))
      KmsKeyId.foreach(__v => __obj.updateDynamic("KmsKeyId")(__v.asInstanceOf[js.Any]))
      MultiRegionEnabled.foreach(__v => __obj.updateDynamic("MultiRegionEnabled")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      OrganizationEnabled.foreach(__v => __obj.updateDynamic("OrganizationEnabled")(__v.asInstanceOf[js.Any]))
      RetentionPeriod.foreach(__v => __obj.updateDynamic("RetentionPeriod")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      TagsList.foreach(__v => __obj.updateDynamic("TagsList")(__v.asInstanceOf[js.Any]))
      TerminationProtectionEnabled.foreach(__v => __obj.updateDynamic("TerminationProtectionEnabled")(__v.asInstanceOf[js.Any]))
      UpdatedTimestamp.foreach(__v => __obj.updateDynamic("UpdatedTimestamp")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateEventDataStoreResponse]
    }
  }

  /** Specifies the settings for each trail.
    */
  @js.native
  trait CreateTrailRequest extends js.Object {
    var Name: String
    var S3BucketName: String
    var CloudWatchLogsLogGroupArn: js.UndefOr[String]
    var CloudWatchLogsRoleArn: js.UndefOr[String]
    var EnableLogFileValidation: js.UndefOr[Boolean]
    var IncludeGlobalServiceEvents: js.UndefOr[Boolean]
    var IsMultiRegionTrail: js.UndefOr[Boolean]
    var IsOrganizationTrail: js.UndefOr[Boolean]
    var KmsKeyId: js.UndefOr[String]
    var S3KeyPrefix: js.UndefOr[String]
    var SnsTopicName: js.UndefOr[String]
    var TagsList: js.UndefOr[TagsList]
  }

  object CreateTrailRequest {
    @inline
    def apply(
        Name: String,
        S3BucketName: String,
        CloudWatchLogsLogGroupArn: js.UndefOr[String] = js.undefined,
        CloudWatchLogsRoleArn: js.UndefOr[String] = js.undefined,
        EnableLogFileValidation: js.UndefOr[Boolean] = js.undefined,
        IncludeGlobalServiceEvents: js.UndefOr[Boolean] = js.undefined,
        IsMultiRegionTrail: js.UndefOr[Boolean] = js.undefined,
        IsOrganizationTrail: js.UndefOr[Boolean] = js.undefined,
        KmsKeyId: js.UndefOr[String] = js.undefined,
        S3KeyPrefix: js.UndefOr[String] = js.undefined,
        SnsTopicName: js.UndefOr[String] = js.undefined,
        TagsList: js.UndefOr[TagsList] = js.undefined
    ): CreateTrailRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "S3BucketName" -> S3BucketName.asInstanceOf[js.Any]
      )

      CloudWatchLogsLogGroupArn.foreach(__v => __obj.updateDynamic("CloudWatchLogsLogGroupArn")(__v.asInstanceOf[js.Any]))
      CloudWatchLogsRoleArn.foreach(__v => __obj.updateDynamic("CloudWatchLogsRoleArn")(__v.asInstanceOf[js.Any]))
      EnableLogFileValidation.foreach(__v => __obj.updateDynamic("EnableLogFileValidation")(__v.asInstanceOf[js.Any]))
      IncludeGlobalServiceEvents.foreach(__v => __obj.updateDynamic("IncludeGlobalServiceEvents")(__v.asInstanceOf[js.Any]))
      IsMultiRegionTrail.foreach(__v => __obj.updateDynamic("IsMultiRegionTrail")(__v.asInstanceOf[js.Any]))
      IsOrganizationTrail.foreach(__v => __obj.updateDynamic("IsOrganizationTrail")(__v.asInstanceOf[js.Any]))
      KmsKeyId.foreach(__v => __obj.updateDynamic("KmsKeyId")(__v.asInstanceOf[js.Any]))
      S3KeyPrefix.foreach(__v => __obj.updateDynamic("S3KeyPrefix")(__v.asInstanceOf[js.Any]))
      SnsTopicName.foreach(__v => __obj.updateDynamic("SnsTopicName")(__v.asInstanceOf[js.Any]))
      TagsList.foreach(__v => __obj.updateDynamic("TagsList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateTrailRequest]
    }
  }

  /** Returns the objects or data listed below if successful. Otherwise, returns an error.
    */
  @js.native
  trait CreateTrailResponse extends js.Object {
    var CloudWatchLogsLogGroupArn: js.UndefOr[String]
    var CloudWatchLogsRoleArn: js.UndefOr[String]
    var IncludeGlobalServiceEvents: js.UndefOr[Boolean]
    var IsMultiRegionTrail: js.UndefOr[Boolean]
    var IsOrganizationTrail: js.UndefOr[Boolean]
    var KmsKeyId: js.UndefOr[String]
    var LogFileValidationEnabled: js.UndefOr[Boolean]
    var Name: js.UndefOr[String]
    var S3BucketName: js.UndefOr[String]
    var S3KeyPrefix: js.UndefOr[String]
    var SnsTopicARN: js.UndefOr[String]
    var SnsTopicName: js.UndefOr[String]
    var TrailARN: js.UndefOr[String]
  }

  object CreateTrailResponse {
    @inline
    def apply(
        CloudWatchLogsLogGroupArn: js.UndefOr[String] = js.undefined,
        CloudWatchLogsRoleArn: js.UndefOr[String] = js.undefined,
        IncludeGlobalServiceEvents: js.UndefOr[Boolean] = js.undefined,
        IsMultiRegionTrail: js.UndefOr[Boolean] = js.undefined,
        IsOrganizationTrail: js.UndefOr[Boolean] = js.undefined,
        KmsKeyId: js.UndefOr[String] = js.undefined,
        LogFileValidationEnabled: js.UndefOr[Boolean] = js.undefined,
        Name: js.UndefOr[String] = js.undefined,
        S3BucketName: js.UndefOr[String] = js.undefined,
        S3KeyPrefix: js.UndefOr[String] = js.undefined,
        SnsTopicARN: js.UndefOr[String] = js.undefined,
        SnsTopicName: js.UndefOr[String] = js.undefined,
        TrailARN: js.UndefOr[String] = js.undefined
    ): CreateTrailResponse = {
      val __obj = js.Dynamic.literal()
      CloudWatchLogsLogGroupArn.foreach(__v => __obj.updateDynamic("CloudWatchLogsLogGroupArn")(__v.asInstanceOf[js.Any]))
      CloudWatchLogsRoleArn.foreach(__v => __obj.updateDynamic("CloudWatchLogsRoleArn")(__v.asInstanceOf[js.Any]))
      IncludeGlobalServiceEvents.foreach(__v => __obj.updateDynamic("IncludeGlobalServiceEvents")(__v.asInstanceOf[js.Any]))
      IsMultiRegionTrail.foreach(__v => __obj.updateDynamic("IsMultiRegionTrail")(__v.asInstanceOf[js.Any]))
      IsOrganizationTrail.foreach(__v => __obj.updateDynamic("IsOrganizationTrail")(__v.asInstanceOf[js.Any]))
      KmsKeyId.foreach(__v => __obj.updateDynamic("KmsKeyId")(__v.asInstanceOf[js.Any]))
      LogFileValidationEnabled.foreach(__v => __obj.updateDynamic("LogFileValidationEnabled")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      S3BucketName.foreach(__v => __obj.updateDynamic("S3BucketName")(__v.asInstanceOf[js.Any]))
      S3KeyPrefix.foreach(__v => __obj.updateDynamic("S3KeyPrefix")(__v.asInstanceOf[js.Any]))
      SnsTopicARN.foreach(__v => __obj.updateDynamic("SnsTopicARN")(__v.asInstanceOf[js.Any]))
      SnsTopicName.foreach(__v => __obj.updateDynamic("SnsTopicName")(__v.asInstanceOf[js.Any]))
      TrailARN.foreach(__v => __obj.updateDynamic("TrailARN")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateTrailResponse]
    }
  }

  /** The Amazon S3 buckets, Lambda functions, or Amazon DynamoDB tables that you specify in your event selectors for your trail to log data events. Data events provide information about the resource operations performed on or within a resource itself. These are also known as data plane operations. You can specify up to 250 data resources for a trail.
    *
    * '''Note:'''The total number of allowed data resources is 250. This number can be distributed between 1 and 5 event selectors, but the total cannot exceed 250 across all selectors. If you are using advanced event selectors, the maximum total number of values for all conditions, across all advanced event selectors for the trail, is 500. The following example demonstrates how logging works when you configure logging of all data events for an S3 bucket named <code>bucket-1</code>. In this example, the CloudTrail user specified an empty prefix, and the option to log both <code>Read</code> and <code>Write</code> data events. <ol> * A user uploads an image file to <code>bucket-1</code>. * The <code>PutObject</code> API operation is an Amazon S3 object-level API. It is recorded as a data event in CloudTrail. Because the CloudTrail user specified an S3 bucket with an empty prefix, events that occur on any object in that bucket are logged. The trail processes and logs the event. * A user
    * uploads an object to an Amazon S3 bucket named <code>arn:aws:s3:::bucket-2</code>. * The <code>PutObject</code> API operation occurred for an object in an S3 bucket that the CloudTrail user didn't specify for the trail. The trail doesn’t log the event. </ol> The following example demonstrates how logging works when you configure logging of Lambda data events for a Lambda function named <i>MyLambdaFunction</i>, but not for all Lambda functions. <ol> * A user runs a script that includes a call to the <i>MyLambdaFunction</i> function and the <i>MyOtherLambdaFunction</i> function. * The <code>Invoke</code> API operation on <i>MyLambdaFunction</i> is an Lambda API. It is recorded as a data event in CloudTrail. Because the CloudTrail user specified logging data events for <i>MyLambdaFunction</i>, any invocations of that function are logged. The trail processes and logs the event. * The <code>Invoke</code> API operation on <i>MyOtherLambdaFunction</i> is an Lambda API. Because the
    * CloudTrail user did not specify logging data events for all Lambda functions, the <code>Invoke</code> operation for <i>MyOtherLambdaFunction</i> does not match the function specified for the trail. The trail doesn’t log the event. </ol>
    */
  @js.native
  trait DataResource extends js.Object {
    var Type: js.UndefOr[String]
    var Values: js.UndefOr[DataResourceValues]
  }

  object DataResource {
    @inline
    def apply(
        Type: js.UndefOr[String] = js.undefined,
        Values: js.UndefOr[DataResourceValues] = js.undefined
    ): DataResource = {
      val __obj = js.Dynamic.literal()
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      Values.foreach(__v => __obj.updateDynamic("Values")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DataResource]
    }
  }

  @js.native
  trait DeleteEventDataStoreRequest extends js.Object {
    var EventDataStore: EventDataStoreArn
  }

  object DeleteEventDataStoreRequest {
    @inline
    def apply(
        EventDataStore: EventDataStoreArn
    ): DeleteEventDataStoreRequest = {
      val __obj = js.Dynamic.literal(
        "EventDataStore" -> EventDataStore.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteEventDataStoreRequest]
    }
  }

  @js.native
  trait DeleteEventDataStoreResponse extends js.Object

  object DeleteEventDataStoreResponse {
    @inline
    def apply(): DeleteEventDataStoreResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteEventDataStoreResponse]
    }
  }

  /** The request that specifies the name of a trail to delete.
    */
  @js.native
  trait DeleteTrailRequest extends js.Object {
    var Name: String
  }

  object DeleteTrailRequest {
    @inline
    def apply(
        Name: String
    ): DeleteTrailRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteTrailRequest]
    }
  }

  /** Returns the objects or data listed below if successful. Otherwise, returns an error.
    */
  @js.native
  trait DeleteTrailResponse extends js.Object

  object DeleteTrailResponse {
    @inline
    def apply(): DeleteTrailResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteTrailResponse]
    }
  }

  /** Removes CloudTrail delegated administrator permissions from a specified member account in an organization that is currently designated as a delegated administrator.
    */
  @js.native
  trait DeregisterOrganizationDelegatedAdminRequest extends js.Object {
    var DelegatedAdminAccountId: AccountId
  }

  object DeregisterOrganizationDelegatedAdminRequest {
    @inline
    def apply(
        DelegatedAdminAccountId: AccountId
    ): DeregisterOrganizationDelegatedAdminRequest = {
      val __obj = js.Dynamic.literal(
        "DelegatedAdminAccountId" -> DelegatedAdminAccountId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeregisterOrganizationDelegatedAdminRequest]
    }
  }

  /** Returns the following response if successful. Otherwise, returns an error.
    */
  @js.native
  trait DeregisterOrganizationDelegatedAdminResponse extends js.Object

  object DeregisterOrganizationDelegatedAdminResponse {
    @inline
    def apply(): DeregisterOrganizationDelegatedAdminResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeregisterOrganizationDelegatedAdminResponse]
    }
  }

  @js.native
  trait DescribeQueryRequest extends js.Object {
    var QueryId: UUID
    var EventDataStore: js.UndefOr[EventDataStoreArn]
  }

  object DescribeQueryRequest {
    @inline
    def apply(
        QueryId: UUID,
        EventDataStore: js.UndefOr[EventDataStoreArn] = js.undefined
    ): DescribeQueryRequest = {
      val __obj = js.Dynamic.literal(
        "QueryId" -> QueryId.asInstanceOf[js.Any]
      )

      EventDataStore.foreach(__v => __obj.updateDynamic("EventDataStore")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeQueryRequest]
    }
  }

  @js.native
  trait DescribeQueryResponse extends js.Object {
    var DeliveryS3Uri: js.UndefOr[DeliveryS3Uri]
    var DeliveryStatus: js.UndefOr[DeliveryStatus]
    var ErrorMessage: js.UndefOr[ErrorMessage]
    var QueryId: js.UndefOr[UUID]
    var QueryStatistics: js.UndefOr[QueryStatisticsForDescribeQuery]
    var QueryStatus: js.UndefOr[QueryStatus]
    var QueryString: js.UndefOr[QueryStatement]
  }

  object DescribeQueryResponse {
    @inline
    def apply(
        DeliveryS3Uri: js.UndefOr[DeliveryS3Uri] = js.undefined,
        DeliveryStatus: js.UndefOr[DeliveryStatus] = js.undefined,
        ErrorMessage: js.UndefOr[ErrorMessage] = js.undefined,
        QueryId: js.UndefOr[UUID] = js.undefined,
        QueryStatistics: js.UndefOr[QueryStatisticsForDescribeQuery] = js.undefined,
        QueryStatus: js.UndefOr[QueryStatus] = js.undefined,
        QueryString: js.UndefOr[QueryStatement] = js.undefined
    ): DescribeQueryResponse = {
      val __obj = js.Dynamic.literal()
      DeliveryS3Uri.foreach(__v => __obj.updateDynamic("DeliveryS3Uri")(__v.asInstanceOf[js.Any]))
      DeliveryStatus.foreach(__v => __obj.updateDynamic("DeliveryStatus")(__v.asInstanceOf[js.Any]))
      ErrorMessage.foreach(__v => __obj.updateDynamic("ErrorMessage")(__v.asInstanceOf[js.Any]))
      QueryId.foreach(__v => __obj.updateDynamic("QueryId")(__v.asInstanceOf[js.Any]))
      QueryStatistics.foreach(__v => __obj.updateDynamic("QueryStatistics")(__v.asInstanceOf[js.Any]))
      QueryStatus.foreach(__v => __obj.updateDynamic("QueryStatus")(__v.asInstanceOf[js.Any]))
      QueryString.foreach(__v => __obj.updateDynamic("QueryString")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeQueryResponse]
    }
  }

  /** Returns information about the trail.
    */
  @js.native
  trait DescribeTrailsRequest extends js.Object {
    var includeShadowTrails: js.UndefOr[Boolean]
    var trailNameList: js.UndefOr[TrailNameList]
  }

  object DescribeTrailsRequest {
    @inline
    def apply(
        includeShadowTrails: js.UndefOr[Boolean] = js.undefined,
        trailNameList: js.UndefOr[TrailNameList] = js.undefined
    ): DescribeTrailsRequest = {
      val __obj = js.Dynamic.literal()
      includeShadowTrails.foreach(__v => __obj.updateDynamic("includeShadowTrails")(__v.asInstanceOf[js.Any]))
      trailNameList.foreach(__v => __obj.updateDynamic("trailNameList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeTrailsRequest]
    }
  }

  /** Returns the objects or data listed below if successful. Otherwise, returns an error.
    */
  @js.native
  trait DescribeTrailsResponse extends js.Object {
    var trailList: js.UndefOr[TrailList]
  }

  object DescribeTrailsResponse {
    @inline
    def apply(
        trailList: js.UndefOr[TrailList] = js.undefined
    ): DescribeTrailsResponse = {
      val __obj = js.Dynamic.literal()
      trailList.foreach(__v => __obj.updateDynamic("trailList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeTrailsResponse]
    }
  }

  /** Contains information about the service where CloudTrail delivers events.
    */
  @js.native
  trait Destination extends js.Object {
    var Location: Location
    var Type: DestinationType
  }

  object Destination {
    @inline
    def apply(
        Location: Location,
        Type: DestinationType
    ): Destination = {
      val __obj = js.Dynamic.literal(
        "Location" -> Location.asInstanceOf[js.Any],
        "Type" -> Type.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[Destination]
    }
  }

  /** Contains information about an event that was returned by a lookup request. The result includes a representation of a CloudTrail event.
    */
  @js.native
  trait Event extends js.Object {
    var AccessKeyId: js.UndefOr[String]
    var CloudTrailEvent: js.UndefOr[String]
    var EventId: js.UndefOr[String]
    var EventName: js.UndefOr[String]
    var EventSource: js.UndefOr[String]
    var EventTime: js.UndefOr[Date]
    var ReadOnly: js.UndefOr[String]
    var Resources: js.UndefOr[ResourceList]
    var Username: js.UndefOr[String]
  }

  object Event {
    @inline
    def apply(
        AccessKeyId: js.UndefOr[String] = js.undefined,
        CloudTrailEvent: js.UndefOr[String] = js.undefined,
        EventId: js.UndefOr[String] = js.undefined,
        EventName: js.UndefOr[String] = js.undefined,
        EventSource: js.UndefOr[String] = js.undefined,
        EventTime: js.UndefOr[Date] = js.undefined,
        ReadOnly: js.UndefOr[String] = js.undefined,
        Resources: js.UndefOr[ResourceList] = js.undefined,
        Username: js.UndefOr[String] = js.undefined
    ): Event = {
      val __obj = js.Dynamic.literal()
      AccessKeyId.foreach(__v => __obj.updateDynamic("AccessKeyId")(__v.asInstanceOf[js.Any]))
      CloudTrailEvent.foreach(__v => __obj.updateDynamic("CloudTrailEvent")(__v.asInstanceOf[js.Any]))
      EventId.foreach(__v => __obj.updateDynamic("EventId")(__v.asInstanceOf[js.Any]))
      EventName.foreach(__v => __obj.updateDynamic("EventName")(__v.asInstanceOf[js.Any]))
      EventSource.foreach(__v => __obj.updateDynamic("EventSource")(__v.asInstanceOf[js.Any]))
      EventTime.foreach(__v => __obj.updateDynamic("EventTime")(__v.asInstanceOf[js.Any]))
      ReadOnly.foreach(__v => __obj.updateDynamic("ReadOnly")(__v.asInstanceOf[js.Any]))
      Resources.foreach(__v => __obj.updateDynamic("Resources")(__v.asInstanceOf[js.Any]))
      Username.foreach(__v => __obj.updateDynamic("Username")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Event]
    }
  }

  /** A storage lake of event data against which you can run complex SQL-based queries. An event data store can include events that you have logged on your account from the last 90 to 2557 days (about three months to up to seven years). To select events for an event data store, use [[https://docs.aws.amazon.com/awscloudtrail/latest/userguide/logging-data-events-with-cloudtrail.html#creating-data-event-selectors-advanced|advanced event selectors]].
    */
  @js.native
  trait EventDataStore extends js.Object {
    var AdvancedEventSelectors: js.UndefOr[AdvancedEventSelectors]
    var CreatedTimestamp: js.UndefOr[Date]
    var EventDataStoreArn: js.UndefOr[EventDataStoreArn]
    var MultiRegionEnabled: js.UndefOr[Boolean]
    var Name: js.UndefOr[EventDataStoreName]
    var OrganizationEnabled: js.UndefOr[Boolean]
    var RetentionPeriod: js.UndefOr[RetentionPeriod]
    var Status: js.UndefOr[EventDataStoreStatus]
    var TerminationProtectionEnabled: js.UndefOr[TerminationProtectionEnabled]
    var UpdatedTimestamp: js.UndefOr[Date]
  }

  object EventDataStore {
    @inline
    def apply(
        AdvancedEventSelectors: js.UndefOr[AdvancedEventSelectors] = js.undefined,
        CreatedTimestamp: js.UndefOr[Date] = js.undefined,
        EventDataStoreArn: js.UndefOr[EventDataStoreArn] = js.undefined,
        MultiRegionEnabled: js.UndefOr[Boolean] = js.undefined,
        Name: js.UndefOr[EventDataStoreName] = js.undefined,
        OrganizationEnabled: js.UndefOr[Boolean] = js.undefined,
        RetentionPeriod: js.UndefOr[RetentionPeriod] = js.undefined,
        Status: js.UndefOr[EventDataStoreStatus] = js.undefined,
        TerminationProtectionEnabled: js.UndefOr[TerminationProtectionEnabled] = js.undefined,
        UpdatedTimestamp: js.UndefOr[Date] = js.undefined
    ): EventDataStore = {
      val __obj = js.Dynamic.literal()
      AdvancedEventSelectors.foreach(__v => __obj.updateDynamic("AdvancedEventSelectors")(__v.asInstanceOf[js.Any]))
      CreatedTimestamp.foreach(__v => __obj.updateDynamic("CreatedTimestamp")(__v.asInstanceOf[js.Any]))
      EventDataStoreArn.foreach(__v => __obj.updateDynamic("EventDataStoreArn")(__v.asInstanceOf[js.Any]))
      MultiRegionEnabled.foreach(__v => __obj.updateDynamic("MultiRegionEnabled")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      OrganizationEnabled.foreach(__v => __obj.updateDynamic("OrganizationEnabled")(__v.asInstanceOf[js.Any]))
      RetentionPeriod.foreach(__v => __obj.updateDynamic("RetentionPeriod")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      TerminationProtectionEnabled.foreach(__v => __obj.updateDynamic("TerminationProtectionEnabled")(__v.asInstanceOf[js.Any]))
      UpdatedTimestamp.foreach(__v => __obj.updateDynamic("UpdatedTimestamp")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EventDataStore]
    }
  }

  /** Use event selectors to further specify the management and data event settings for your trail. By default, trails created without specific event selectors will be configured to log all read and write management events, and no data events. When an event occurs in your account, CloudTrail evaluates the event selector for all trails. For each trail, if the event matches any event selector, the trail processes and logs the event. If the event doesn't match any event selector, the trail doesn't log the event. You can configure up to five event selectors for a trail. You cannot apply both event selectors and advanced event selectors to a trail.
    */
  @js.native
  trait EventSelector extends js.Object {
    var DataResources: js.UndefOr[DataResources]
    var ExcludeManagementEventSources: js.UndefOr[ExcludeManagementEventSources]
    var IncludeManagementEvents: js.UndefOr[Boolean]
    var ReadWriteType: js.UndefOr[ReadWriteType]
  }

  object EventSelector {
    @inline
    def apply(
        DataResources: js.UndefOr[DataResources] = js.undefined,
        ExcludeManagementEventSources: js.UndefOr[ExcludeManagementEventSources] = js.undefined,
        IncludeManagementEvents: js.UndefOr[Boolean] = js.undefined,
        ReadWriteType: js.UndefOr[ReadWriteType] = js.undefined
    ): EventSelector = {
      val __obj = js.Dynamic.literal()
      DataResources.foreach(__v => __obj.updateDynamic("DataResources")(__v.asInstanceOf[js.Any]))
      ExcludeManagementEventSources.foreach(__v => __obj.updateDynamic("ExcludeManagementEventSources")(__v.asInstanceOf[js.Any]))
      IncludeManagementEvents.foreach(__v => __obj.updateDynamic("IncludeManagementEvents")(__v.asInstanceOf[js.Any]))
      ReadWriteType.foreach(__v => __obj.updateDynamic("ReadWriteType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EventSelector]
    }
  }

  @js.native
  trait GetChannelRequest extends js.Object {
    var Channel: ChannelArn
  }

  object GetChannelRequest {
    @inline
    def apply(
        Channel: ChannelArn
    ): GetChannelRequest = {
      val __obj = js.Dynamic.literal(
        "Channel" -> Channel.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetChannelRequest]
    }
  }

  @js.native
  trait GetChannelResponse extends js.Object {
    var ChannelArn: js.UndefOr[ChannelArn]
    var Destinations: js.UndefOr[Destinations]
    var Name: js.UndefOr[ChannelName]
    var Source: js.UndefOr[Source]
    var SourceConfig: js.UndefOr[SourceConfig]
  }

  object GetChannelResponse {
    @inline
    def apply(
        ChannelArn: js.UndefOr[ChannelArn] = js.undefined,
        Destinations: js.UndefOr[Destinations] = js.undefined,
        Name: js.UndefOr[ChannelName] = js.undefined,
        Source: js.UndefOr[Source] = js.undefined,
        SourceConfig: js.UndefOr[SourceConfig] = js.undefined
    ): GetChannelResponse = {
      val __obj = js.Dynamic.literal()
      ChannelArn.foreach(__v => __obj.updateDynamic("ChannelArn")(__v.asInstanceOf[js.Any]))
      Destinations.foreach(__v => __obj.updateDynamic("Destinations")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Source.foreach(__v => __obj.updateDynamic("Source")(__v.asInstanceOf[js.Any]))
      SourceConfig.foreach(__v => __obj.updateDynamic("SourceConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetChannelResponse]
    }
  }

  @js.native
  trait GetEventDataStoreRequest extends js.Object {
    var EventDataStore: EventDataStoreArn
  }

  object GetEventDataStoreRequest {
    @inline
    def apply(
        EventDataStore: EventDataStoreArn
    ): GetEventDataStoreRequest = {
      val __obj = js.Dynamic.literal(
        "EventDataStore" -> EventDataStore.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetEventDataStoreRequest]
    }
  }

  @js.native
  trait GetEventDataStoreResponse extends js.Object {
    var AdvancedEventSelectors: js.UndefOr[AdvancedEventSelectors]
    var CreatedTimestamp: js.UndefOr[Date]
    var EventDataStoreArn: js.UndefOr[EventDataStoreArn]
    var KmsKeyId: js.UndefOr[EventDataStoreKmsKeyId]
    var MultiRegionEnabled: js.UndefOr[Boolean]
    var Name: js.UndefOr[EventDataStoreName]
    var OrganizationEnabled: js.UndefOr[Boolean]
    var RetentionPeriod: js.UndefOr[RetentionPeriod]
    var Status: js.UndefOr[EventDataStoreStatus]
    var TerminationProtectionEnabled: js.UndefOr[TerminationProtectionEnabled]
    var UpdatedTimestamp: js.UndefOr[Date]
  }

  object GetEventDataStoreResponse {
    @inline
    def apply(
        AdvancedEventSelectors: js.UndefOr[AdvancedEventSelectors] = js.undefined,
        CreatedTimestamp: js.UndefOr[Date] = js.undefined,
        EventDataStoreArn: js.UndefOr[EventDataStoreArn] = js.undefined,
        KmsKeyId: js.UndefOr[EventDataStoreKmsKeyId] = js.undefined,
        MultiRegionEnabled: js.UndefOr[Boolean] = js.undefined,
        Name: js.UndefOr[EventDataStoreName] = js.undefined,
        OrganizationEnabled: js.UndefOr[Boolean] = js.undefined,
        RetentionPeriod: js.UndefOr[RetentionPeriod] = js.undefined,
        Status: js.UndefOr[EventDataStoreStatus] = js.undefined,
        TerminationProtectionEnabled: js.UndefOr[TerminationProtectionEnabled] = js.undefined,
        UpdatedTimestamp: js.UndefOr[Date] = js.undefined
    ): GetEventDataStoreResponse = {
      val __obj = js.Dynamic.literal()
      AdvancedEventSelectors.foreach(__v => __obj.updateDynamic("AdvancedEventSelectors")(__v.asInstanceOf[js.Any]))
      CreatedTimestamp.foreach(__v => __obj.updateDynamic("CreatedTimestamp")(__v.asInstanceOf[js.Any]))
      EventDataStoreArn.foreach(__v => __obj.updateDynamic("EventDataStoreArn")(__v.asInstanceOf[js.Any]))
      KmsKeyId.foreach(__v => __obj.updateDynamic("KmsKeyId")(__v.asInstanceOf[js.Any]))
      MultiRegionEnabled.foreach(__v => __obj.updateDynamic("MultiRegionEnabled")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      OrganizationEnabled.foreach(__v => __obj.updateDynamic("OrganizationEnabled")(__v.asInstanceOf[js.Any]))
      RetentionPeriod.foreach(__v => __obj.updateDynamic("RetentionPeriod")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      TerminationProtectionEnabled.foreach(__v => __obj.updateDynamic("TerminationProtectionEnabled")(__v.asInstanceOf[js.Any]))
      UpdatedTimestamp.foreach(__v => __obj.updateDynamic("UpdatedTimestamp")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetEventDataStoreResponse]
    }
  }

  @js.native
  trait GetEventSelectorsRequest extends js.Object {
    var TrailName: String
  }

  object GetEventSelectorsRequest {
    @inline
    def apply(
        TrailName: String
    ): GetEventSelectorsRequest = {
      val __obj = js.Dynamic.literal(
        "TrailName" -> TrailName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetEventSelectorsRequest]
    }
  }

  @js.native
  trait GetEventSelectorsResponse extends js.Object {
    var AdvancedEventSelectors: js.UndefOr[AdvancedEventSelectors]
    var EventSelectors: js.UndefOr[EventSelectors]
    var TrailARN: js.UndefOr[String]
  }

  object GetEventSelectorsResponse {
    @inline
    def apply(
        AdvancedEventSelectors: js.UndefOr[AdvancedEventSelectors] = js.undefined,
        EventSelectors: js.UndefOr[EventSelectors] = js.undefined,
        TrailARN: js.UndefOr[String] = js.undefined
    ): GetEventSelectorsResponse = {
      val __obj = js.Dynamic.literal()
      AdvancedEventSelectors.foreach(__v => __obj.updateDynamic("AdvancedEventSelectors")(__v.asInstanceOf[js.Any]))
      EventSelectors.foreach(__v => __obj.updateDynamic("EventSelectors")(__v.asInstanceOf[js.Any]))
      TrailARN.foreach(__v => __obj.updateDynamic("TrailARN")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetEventSelectorsResponse]
    }
  }

  @js.native
  trait GetImportRequest extends js.Object {
    var ImportId: UUID
  }

  object GetImportRequest {
    @inline
    def apply(
        ImportId: UUID
    ): GetImportRequest = {
      val __obj = js.Dynamic.literal(
        "ImportId" -> ImportId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetImportRequest]
    }
  }

  @js.native
  trait GetImportResponse extends js.Object {
    var CreatedTimestamp: js.UndefOr[Date]
    var Destinations: js.UndefOr[ImportDestinations]
    var EndEventTime: js.UndefOr[Date]
    var ImportId: js.UndefOr[UUID]
    var ImportSource: js.UndefOr[ImportSource]
    var ImportStatistics: js.UndefOr[ImportStatistics]
    var ImportStatus: js.UndefOr[ImportStatus]
    var StartEventTime: js.UndefOr[Date]
    var UpdatedTimestamp: js.UndefOr[Date]
  }

  object GetImportResponse {
    @inline
    def apply(
        CreatedTimestamp: js.UndefOr[Date] = js.undefined,
        Destinations: js.UndefOr[ImportDestinations] = js.undefined,
        EndEventTime: js.UndefOr[Date] = js.undefined,
        ImportId: js.UndefOr[UUID] = js.undefined,
        ImportSource: js.UndefOr[ImportSource] = js.undefined,
        ImportStatistics: js.UndefOr[ImportStatistics] = js.undefined,
        ImportStatus: js.UndefOr[ImportStatus] = js.undefined,
        StartEventTime: js.UndefOr[Date] = js.undefined,
        UpdatedTimestamp: js.UndefOr[Date] = js.undefined
    ): GetImportResponse = {
      val __obj = js.Dynamic.literal()
      CreatedTimestamp.foreach(__v => __obj.updateDynamic("CreatedTimestamp")(__v.asInstanceOf[js.Any]))
      Destinations.foreach(__v => __obj.updateDynamic("Destinations")(__v.asInstanceOf[js.Any]))
      EndEventTime.foreach(__v => __obj.updateDynamic("EndEventTime")(__v.asInstanceOf[js.Any]))
      ImportId.foreach(__v => __obj.updateDynamic("ImportId")(__v.asInstanceOf[js.Any]))
      ImportSource.foreach(__v => __obj.updateDynamic("ImportSource")(__v.asInstanceOf[js.Any]))
      ImportStatistics.foreach(__v => __obj.updateDynamic("ImportStatistics")(__v.asInstanceOf[js.Any]))
      ImportStatus.foreach(__v => __obj.updateDynamic("ImportStatus")(__v.asInstanceOf[js.Any]))
      StartEventTime.foreach(__v => __obj.updateDynamic("StartEventTime")(__v.asInstanceOf[js.Any]))
      UpdatedTimestamp.foreach(__v => __obj.updateDynamic("UpdatedTimestamp")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetImportResponse]
    }
  }

  @js.native
  trait GetInsightSelectorsRequest extends js.Object {
    var TrailName: String
  }

  object GetInsightSelectorsRequest {
    @inline
    def apply(
        TrailName: String
    ): GetInsightSelectorsRequest = {
      val __obj = js.Dynamic.literal(
        "TrailName" -> TrailName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetInsightSelectorsRequest]
    }
  }

  @js.native
  trait GetInsightSelectorsResponse extends js.Object {
    var InsightSelectors: js.UndefOr[InsightSelectors]
    var TrailARN: js.UndefOr[String]
  }

  object GetInsightSelectorsResponse {
    @inline
    def apply(
        InsightSelectors: js.UndefOr[InsightSelectors] = js.undefined,
        TrailARN: js.UndefOr[String] = js.undefined
    ): GetInsightSelectorsResponse = {
      val __obj = js.Dynamic.literal()
      InsightSelectors.foreach(__v => __obj.updateDynamic("InsightSelectors")(__v.asInstanceOf[js.Any]))
      TrailARN.foreach(__v => __obj.updateDynamic("TrailARN")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetInsightSelectorsResponse]
    }
  }

  @js.native
  trait GetQueryResultsRequest extends js.Object {
    var QueryId: UUID
    var EventDataStore: js.UndefOr[EventDataStoreArn]
    var MaxQueryResults: js.UndefOr[MaxQueryResults]
    var NextToken: js.UndefOr[PaginationToken]
  }

  object GetQueryResultsRequest {
    @inline
    def apply(
        QueryId: UUID,
        EventDataStore: js.UndefOr[EventDataStoreArn] = js.undefined,
        MaxQueryResults: js.UndefOr[MaxQueryResults] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined
    ): GetQueryResultsRequest = {
      val __obj = js.Dynamic.literal(
        "QueryId" -> QueryId.asInstanceOf[js.Any]
      )

      EventDataStore.foreach(__v => __obj.updateDynamic("EventDataStore")(__v.asInstanceOf[js.Any]))
      MaxQueryResults.foreach(__v => __obj.updateDynamic("MaxQueryResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetQueryResultsRequest]
    }
  }

  @js.native
  trait GetQueryResultsResponse extends js.Object {
    var ErrorMessage: js.UndefOr[ErrorMessage]
    var NextToken: js.UndefOr[PaginationToken]
    var QueryResultRows: js.UndefOr[QueryResultRows]
    var QueryStatistics: js.UndefOr[QueryStatistics]
    var QueryStatus: js.UndefOr[QueryStatus]
  }

  object GetQueryResultsResponse {
    @inline
    def apply(
        ErrorMessage: js.UndefOr[ErrorMessage] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined,
        QueryResultRows: js.UndefOr[QueryResultRows] = js.undefined,
        QueryStatistics: js.UndefOr[QueryStatistics] = js.undefined,
        QueryStatus: js.UndefOr[QueryStatus] = js.undefined
    ): GetQueryResultsResponse = {
      val __obj = js.Dynamic.literal()
      ErrorMessage.foreach(__v => __obj.updateDynamic("ErrorMessage")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      QueryResultRows.foreach(__v => __obj.updateDynamic("QueryResultRows")(__v.asInstanceOf[js.Any]))
      QueryStatistics.foreach(__v => __obj.updateDynamic("QueryStatistics")(__v.asInstanceOf[js.Any]))
      QueryStatus.foreach(__v => __obj.updateDynamic("QueryStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetQueryResultsResponse]
    }
  }

  @js.native
  trait GetTrailRequest extends js.Object {
    var Name: String
  }

  object GetTrailRequest {
    @inline
    def apply(
        Name: String
    ): GetTrailRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetTrailRequest]
    }
  }

  @js.native
  trait GetTrailResponse extends js.Object {
    var Trail: js.UndefOr[Trail]
  }

  object GetTrailResponse {
    @inline
    def apply(
        Trail: js.UndefOr[Trail] = js.undefined
    ): GetTrailResponse = {
      val __obj = js.Dynamic.literal()
      Trail.foreach(__v => __obj.updateDynamic("Trail")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetTrailResponse]
    }
  }

  /** The name of a trail about which you want the current status.
    */
  @js.native
  trait GetTrailStatusRequest extends js.Object {
    var Name: String
  }

  object GetTrailStatusRequest {
    @inline
    def apply(
        Name: String
    ): GetTrailStatusRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetTrailStatusRequest]
    }
  }

  /** Returns the objects or data listed below if successful. Otherwise, returns an error.
    */
  @js.native
  trait GetTrailStatusResponse extends js.Object {
    var IsLogging: js.UndefOr[Boolean]
    var LatestCloudWatchLogsDeliveryError: js.UndefOr[String]
    var LatestCloudWatchLogsDeliveryTime: js.UndefOr[Date]
    var LatestDeliveryAttemptSucceeded: js.UndefOr[String]
    var LatestDeliveryAttemptTime: js.UndefOr[String]
    var LatestDeliveryError: js.UndefOr[String]
    var LatestDeliveryTime: js.UndefOr[Date]
    var LatestDigestDeliveryError: js.UndefOr[String]
    var LatestDigestDeliveryTime: js.UndefOr[Date]
    var LatestNotificationAttemptSucceeded: js.UndefOr[String]
    var LatestNotificationAttemptTime: js.UndefOr[String]
    var LatestNotificationError: js.UndefOr[String]
    var LatestNotificationTime: js.UndefOr[Date]
    var StartLoggingTime: js.UndefOr[Date]
    var StopLoggingTime: js.UndefOr[Date]
    var TimeLoggingStarted: js.UndefOr[String]
    var TimeLoggingStopped: js.UndefOr[String]
  }

  object GetTrailStatusResponse {
    @inline
    def apply(
        IsLogging: js.UndefOr[Boolean] = js.undefined,
        LatestCloudWatchLogsDeliveryError: js.UndefOr[String] = js.undefined,
        LatestCloudWatchLogsDeliveryTime: js.UndefOr[Date] = js.undefined,
        LatestDeliveryAttemptSucceeded: js.UndefOr[String] = js.undefined,
        LatestDeliveryAttemptTime: js.UndefOr[String] = js.undefined,
        LatestDeliveryError: js.UndefOr[String] = js.undefined,
        LatestDeliveryTime: js.UndefOr[Date] = js.undefined,
        LatestDigestDeliveryError: js.UndefOr[String] = js.undefined,
        LatestDigestDeliveryTime: js.UndefOr[Date] = js.undefined,
        LatestNotificationAttemptSucceeded: js.UndefOr[String] = js.undefined,
        LatestNotificationAttemptTime: js.UndefOr[String] = js.undefined,
        LatestNotificationError: js.UndefOr[String] = js.undefined,
        LatestNotificationTime: js.UndefOr[Date] = js.undefined,
        StartLoggingTime: js.UndefOr[Date] = js.undefined,
        StopLoggingTime: js.UndefOr[Date] = js.undefined,
        TimeLoggingStarted: js.UndefOr[String] = js.undefined,
        TimeLoggingStopped: js.UndefOr[String] = js.undefined
    ): GetTrailStatusResponse = {
      val __obj = js.Dynamic.literal()
      IsLogging.foreach(__v => __obj.updateDynamic("IsLogging")(__v.asInstanceOf[js.Any]))
      LatestCloudWatchLogsDeliveryError.foreach(__v => __obj.updateDynamic("LatestCloudWatchLogsDeliveryError")(__v.asInstanceOf[js.Any]))
      LatestCloudWatchLogsDeliveryTime.foreach(__v => __obj.updateDynamic("LatestCloudWatchLogsDeliveryTime")(__v.asInstanceOf[js.Any]))
      LatestDeliveryAttemptSucceeded.foreach(__v => __obj.updateDynamic("LatestDeliveryAttemptSucceeded")(__v.asInstanceOf[js.Any]))
      LatestDeliveryAttemptTime.foreach(__v => __obj.updateDynamic("LatestDeliveryAttemptTime")(__v.asInstanceOf[js.Any]))
      LatestDeliveryError.foreach(__v => __obj.updateDynamic("LatestDeliveryError")(__v.asInstanceOf[js.Any]))
      LatestDeliveryTime.foreach(__v => __obj.updateDynamic("LatestDeliveryTime")(__v.asInstanceOf[js.Any]))
      LatestDigestDeliveryError.foreach(__v => __obj.updateDynamic("LatestDigestDeliveryError")(__v.asInstanceOf[js.Any]))
      LatestDigestDeliveryTime.foreach(__v => __obj.updateDynamic("LatestDigestDeliveryTime")(__v.asInstanceOf[js.Any]))
      LatestNotificationAttemptSucceeded.foreach(__v => __obj.updateDynamic("LatestNotificationAttemptSucceeded")(__v.asInstanceOf[js.Any]))
      LatestNotificationAttemptTime.foreach(__v => __obj.updateDynamic("LatestNotificationAttemptTime")(__v.asInstanceOf[js.Any]))
      LatestNotificationError.foreach(__v => __obj.updateDynamic("LatestNotificationError")(__v.asInstanceOf[js.Any]))
      LatestNotificationTime.foreach(__v => __obj.updateDynamic("LatestNotificationTime")(__v.asInstanceOf[js.Any]))
      StartLoggingTime.foreach(__v => __obj.updateDynamic("StartLoggingTime")(__v.asInstanceOf[js.Any]))
      StopLoggingTime.foreach(__v => __obj.updateDynamic("StopLoggingTime")(__v.asInstanceOf[js.Any]))
      TimeLoggingStarted.foreach(__v => __obj.updateDynamic("TimeLoggingStarted")(__v.asInstanceOf[js.Any]))
      TimeLoggingStopped.foreach(__v => __obj.updateDynamic("TimeLoggingStopped")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetTrailStatusResponse]
    }
  }

  /** Provides information about an import failure.
    */
  @js.native
  trait ImportFailureListItem extends js.Object {
    var ErrorMessage: js.UndefOr[String]
    var ErrorType: js.UndefOr[String]
    var LastUpdatedTime: js.UndefOr[Date]
    var Location: js.UndefOr[String]
    var Status: js.UndefOr[ImportFailureStatus]
  }

  object ImportFailureListItem {
    @inline
    def apply(
        ErrorMessage: js.UndefOr[String] = js.undefined,
        ErrorType: js.UndefOr[String] = js.undefined,
        LastUpdatedTime: js.UndefOr[Date] = js.undefined,
        Location: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[ImportFailureStatus] = js.undefined
    ): ImportFailureListItem = {
      val __obj = js.Dynamic.literal()
      ErrorMessage.foreach(__v => __obj.updateDynamic("ErrorMessage")(__v.asInstanceOf[js.Any]))
      ErrorType.foreach(__v => __obj.updateDynamic("ErrorType")(__v.asInstanceOf[js.Any]))
      LastUpdatedTime.foreach(__v => __obj.updateDynamic("LastUpdatedTime")(__v.asInstanceOf[js.Any]))
      Location.foreach(__v => __obj.updateDynamic("Location")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ImportFailureListItem]
    }
  }

  /** The import source.
    */
  @js.native
  trait ImportSource extends js.Object {
    var S3: S3ImportSource
  }

  object ImportSource {
    @inline
    def apply(
        S3: S3ImportSource
    ): ImportSource = {
      val __obj = js.Dynamic.literal(
        "S3" -> S3.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ImportSource]
    }
  }

  /** Provides statistics for the specified <code>ImportID</code>. CloudTrail does not update import statistics in real-time. Returned values for parameters such as <code>EventsCompleted</code> may be lower than the actual value, because CloudTrail updates statistics incrementally over the course of the import.
    */
  @js.native
  trait ImportStatistics extends js.Object {
    var EventsCompleted: js.UndefOr[Double]
    var FailedEntries: js.UndefOr[Double]
    var FilesCompleted: js.UndefOr[Double]
    var PrefixesCompleted: js.UndefOr[Double]
    var PrefixesFound: js.UndefOr[Double]
  }

  object ImportStatistics {
    @inline
    def apply(
        EventsCompleted: js.UndefOr[Double] = js.undefined,
        FailedEntries: js.UndefOr[Double] = js.undefined,
        FilesCompleted: js.UndefOr[Double] = js.undefined,
        PrefixesCompleted: js.UndefOr[Double] = js.undefined,
        PrefixesFound: js.UndefOr[Double] = js.undefined
    ): ImportStatistics = {
      val __obj = js.Dynamic.literal()
      EventsCompleted.foreach(__v => __obj.updateDynamic("EventsCompleted")(__v.asInstanceOf[js.Any]))
      FailedEntries.foreach(__v => __obj.updateDynamic("FailedEntries")(__v.asInstanceOf[js.Any]))
      FilesCompleted.foreach(__v => __obj.updateDynamic("FilesCompleted")(__v.asInstanceOf[js.Any]))
      PrefixesCompleted.foreach(__v => __obj.updateDynamic("PrefixesCompleted")(__v.asInstanceOf[js.Any]))
      PrefixesFound.foreach(__v => __obj.updateDynamic("PrefixesFound")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ImportStatistics]
    }
  }

  /** Contains information about an import that was returned by a lookup request.
    */
  @js.native
  trait ImportsListItem extends js.Object {
    var CreatedTimestamp: js.UndefOr[Date]
    var Destinations: js.UndefOr[ImportDestinations]
    var ImportId: js.UndefOr[UUID]
    var ImportStatus: js.UndefOr[ImportStatus]
    var UpdatedTimestamp: js.UndefOr[Date]
  }

  object ImportsListItem {
    @inline
    def apply(
        CreatedTimestamp: js.UndefOr[Date] = js.undefined,
        Destinations: js.UndefOr[ImportDestinations] = js.undefined,
        ImportId: js.UndefOr[UUID] = js.undefined,
        ImportStatus: js.UndefOr[ImportStatus] = js.undefined,
        UpdatedTimestamp: js.UndefOr[Date] = js.undefined
    ): ImportsListItem = {
      val __obj = js.Dynamic.literal()
      CreatedTimestamp.foreach(__v => __obj.updateDynamic("CreatedTimestamp")(__v.asInstanceOf[js.Any]))
      Destinations.foreach(__v => __obj.updateDynamic("Destinations")(__v.asInstanceOf[js.Any]))
      ImportId.foreach(__v => __obj.updateDynamic("ImportId")(__v.asInstanceOf[js.Any]))
      ImportStatus.foreach(__v => __obj.updateDynamic("ImportStatus")(__v.asInstanceOf[js.Any]))
      UpdatedTimestamp.foreach(__v => __obj.updateDynamic("UpdatedTimestamp")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ImportsListItem]
    }
  }

  /** A JSON string that contains a list of insight types that are logged on a trail.
    */
  @js.native
  trait InsightSelector extends js.Object {
    var InsightType: js.UndefOr[InsightType]
  }

  object InsightSelector {
    @inline
    def apply(
        InsightType: js.UndefOr[InsightType] = js.undefined
    ): InsightSelector = {
      val __obj = js.Dynamic.literal()
      InsightType.foreach(__v => __obj.updateDynamic("InsightType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InsightSelector]
    }
  }

  @js.native
  trait ListChannelsRequest extends js.Object {
    var MaxResults: js.UndefOr[ListChannelsMaxResultsCount]
    var NextToken: js.UndefOr[PaginationToken]
  }

  object ListChannelsRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[ListChannelsMaxResultsCount] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListChannelsRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListChannelsRequest]
    }
  }

  @js.native
  trait ListChannelsResponse extends js.Object {
    var Channels: js.UndefOr[Channels]
    var NextToken: js.UndefOr[PaginationToken]
  }

  object ListChannelsResponse {
    @inline
    def apply(
        Channels: js.UndefOr[Channels] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListChannelsResponse = {
      val __obj = js.Dynamic.literal()
      Channels.foreach(__v => __obj.updateDynamic("Channels")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListChannelsResponse]
    }
  }

  @js.native
  trait ListEventDataStoresRequest extends js.Object {
    var MaxResults: js.UndefOr[ListEventDataStoresMaxResultsCount]
    var NextToken: js.UndefOr[PaginationToken]
  }

  object ListEventDataStoresRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[ListEventDataStoresMaxResultsCount] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListEventDataStoresRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListEventDataStoresRequest]
    }
  }

  @js.native
  trait ListEventDataStoresResponse extends js.Object {
    var EventDataStores: js.UndefOr[EventDataStores]
    var NextToken: js.UndefOr[PaginationToken]
  }

  object ListEventDataStoresResponse {
    @inline
    def apply(
        EventDataStores: js.UndefOr[EventDataStores] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListEventDataStoresResponse = {
      val __obj = js.Dynamic.literal()
      EventDataStores.foreach(__v => __obj.updateDynamic("EventDataStores")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListEventDataStoresResponse]
    }
  }

  @js.native
  trait ListImportFailuresRequest extends js.Object {
    var ImportId: UUID
    var MaxResults: js.UndefOr[ListImportFailuresMaxResultsCount]
    var NextToken: js.UndefOr[PaginationToken]
  }

  object ListImportFailuresRequest {
    @inline
    def apply(
        ImportId: UUID,
        MaxResults: js.UndefOr[ListImportFailuresMaxResultsCount] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListImportFailuresRequest = {
      val __obj = js.Dynamic.literal(
        "ImportId" -> ImportId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListImportFailuresRequest]
    }
  }

  @js.native
  trait ListImportFailuresResponse extends js.Object {
    var Failures: js.UndefOr[ImportFailureList]
    var NextToken: js.UndefOr[PaginationToken]
  }

  object ListImportFailuresResponse {
    @inline
    def apply(
        Failures: js.UndefOr[ImportFailureList] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListImportFailuresResponse = {
      val __obj = js.Dynamic.literal()
      Failures.foreach(__v => __obj.updateDynamic("Failures")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListImportFailuresResponse]
    }
  }

  @js.native
  trait ListImportsRequest extends js.Object {
    var Destination: js.UndefOr[EventDataStoreArn]
    var ImportStatus: js.UndefOr[ImportStatus]
    var MaxResults: js.UndefOr[ListImportsMaxResultsCount]
    var NextToken: js.UndefOr[PaginationToken]
  }

  object ListImportsRequest {
    @inline
    def apply(
        Destination: js.UndefOr[EventDataStoreArn] = js.undefined,
        ImportStatus: js.UndefOr[ImportStatus] = js.undefined,
        MaxResults: js.UndefOr[ListImportsMaxResultsCount] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListImportsRequest = {
      val __obj = js.Dynamic.literal()
      Destination.foreach(__v => __obj.updateDynamic("Destination")(__v.asInstanceOf[js.Any]))
      ImportStatus.foreach(__v => __obj.updateDynamic("ImportStatus")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListImportsRequest]
    }
  }

  @js.native
  trait ListImportsResponse extends js.Object {
    var Imports: js.UndefOr[ImportsList]
    var NextToken: js.UndefOr[PaginationToken]
  }

  object ListImportsResponse {
    @inline
    def apply(
        Imports: js.UndefOr[ImportsList] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListImportsResponse = {
      val __obj = js.Dynamic.literal()
      Imports.foreach(__v => __obj.updateDynamic("Imports")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListImportsResponse]
    }
  }

  /** Requests the public keys for a specified time range.
    */
  @js.native
  trait ListPublicKeysRequest extends js.Object {
    var EndTime: js.UndefOr[Date]
    var NextToken: js.UndefOr[String]
    var StartTime: js.UndefOr[Date]
  }

  object ListPublicKeysRequest {
    @inline
    def apply(
        EndTime: js.UndefOr[Date] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined,
        StartTime: js.UndefOr[Date] = js.undefined
    ): ListPublicKeysRequest = {
      val __obj = js.Dynamic.literal()
      EndTime.foreach(__v => __obj.updateDynamic("EndTime")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      StartTime.foreach(__v => __obj.updateDynamic("StartTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPublicKeysRequest]
    }
  }

  /** Returns the objects or data listed below if successful. Otherwise, returns an error.
    */
  @js.native
  trait ListPublicKeysResponse extends js.Object {
    var NextToken: js.UndefOr[String]
    var PublicKeyList: js.UndefOr[PublicKeyList]
  }

  object ListPublicKeysResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[String] = js.undefined,
        PublicKeyList: js.UndefOr[PublicKeyList] = js.undefined
    ): ListPublicKeysResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      PublicKeyList.foreach(__v => __obj.updateDynamic("PublicKeyList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPublicKeysResponse]
    }
  }

  @js.native
  trait ListQueriesRequest extends js.Object {
    var EventDataStore: EventDataStoreArn
    var EndTime: js.UndefOr[Date]
    var MaxResults: js.UndefOr[ListQueriesMaxResultsCount]
    var NextToken: js.UndefOr[PaginationToken]
    var QueryStatus: js.UndefOr[QueryStatus]
    var StartTime: js.UndefOr[Date]
  }

  object ListQueriesRequest {
    @inline
    def apply(
        EventDataStore: EventDataStoreArn,
        EndTime: js.UndefOr[Date] = js.undefined,
        MaxResults: js.UndefOr[ListQueriesMaxResultsCount] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined,
        QueryStatus: js.UndefOr[QueryStatus] = js.undefined,
        StartTime: js.UndefOr[Date] = js.undefined
    ): ListQueriesRequest = {
      val __obj = js.Dynamic.literal(
        "EventDataStore" -> EventDataStore.asInstanceOf[js.Any]
      )

      EndTime.foreach(__v => __obj.updateDynamic("EndTime")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      QueryStatus.foreach(__v => __obj.updateDynamic("QueryStatus")(__v.asInstanceOf[js.Any]))
      StartTime.foreach(__v => __obj.updateDynamic("StartTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListQueriesRequest]
    }
  }

  @js.native
  trait ListQueriesResponse extends js.Object {
    var NextToken: js.UndefOr[PaginationToken]
    var Queries: js.UndefOr[Queries]
  }

  object ListQueriesResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[PaginationToken] = js.undefined,
        Queries: js.UndefOr[Queries] = js.undefined
    ): ListQueriesResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Queries.foreach(__v => __obj.updateDynamic("Queries")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListQueriesResponse]
    }
  }

  /** Specifies a list of tags to return.
    */
  @js.native
  trait ListTagsRequest extends js.Object {
    var ResourceIdList: ResourceIdList
    var NextToken: js.UndefOr[String]
  }

  object ListTagsRequest {
    @inline
    def apply(
        ResourceIdList: ResourceIdList,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListTagsRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceIdList" -> ResourceIdList.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsRequest]
    }
  }

  /** Returns the objects or data listed below if successful. Otherwise, returns an error.
    */
  @js.native
  trait ListTagsResponse extends js.Object {
    var NextToken: js.UndefOr[String]
    var ResourceTagList: js.UndefOr[ResourceTagList]
  }

  object ListTagsResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[String] = js.undefined,
        ResourceTagList: js.UndefOr[ResourceTagList] = js.undefined
    ): ListTagsResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      ResourceTagList.foreach(__v => __obj.updateDynamic("ResourceTagList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsResponse]
    }
  }

  @js.native
  trait ListTrailsRequest extends js.Object {
    var NextToken: js.UndefOr[String]
  }

  object ListTrailsRequest {
    @inline
    def apply(
        NextToken: js.UndefOr[String] = js.undefined
    ): ListTrailsRequest = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTrailsRequest]
    }
  }

  @js.native
  trait ListTrailsResponse extends js.Object {
    var NextToken: js.UndefOr[String]
    var Trails: js.UndefOr[Trails]
  }

  object ListTrailsResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[String] = js.undefined,
        Trails: js.UndefOr[Trails] = js.undefined
    ): ListTrailsResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Trails.foreach(__v => __obj.updateDynamic("Trails")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTrailsResponse]
    }
  }

  /** Specifies an attribute and value that filter the events returned.
    */
  @js.native
  trait LookupAttribute extends js.Object {
    var AttributeKey: LookupAttributeKey
    var AttributeValue: String
  }

  object LookupAttribute {
    @inline
    def apply(
        AttributeKey: LookupAttributeKey,
        AttributeValue: String
    ): LookupAttribute = {
      val __obj = js.Dynamic.literal(
        "AttributeKey" -> AttributeKey.asInstanceOf[js.Any],
        "AttributeValue" -> AttributeValue.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[LookupAttribute]
    }
  }

  /** Contains a request for LookupEvents.
    */
  @js.native
  trait LookupEventsRequest extends js.Object {
    var EndTime: js.UndefOr[Date]
    var EventCategory: js.UndefOr[EventCategory]
    var LookupAttributes: js.UndefOr[LookupAttributesList]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var StartTime: js.UndefOr[Date]
  }

  object LookupEventsRequest {
    @inline
    def apply(
        EndTime: js.UndefOr[Date] = js.undefined,
        EventCategory: js.UndefOr[EventCategory] = js.undefined,
        LookupAttributes: js.UndefOr[LookupAttributesList] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        StartTime: js.UndefOr[Date] = js.undefined
    ): LookupEventsRequest = {
      val __obj = js.Dynamic.literal()
      EndTime.foreach(__v => __obj.updateDynamic("EndTime")(__v.asInstanceOf[js.Any]))
      EventCategory.foreach(__v => __obj.updateDynamic("EventCategory")(__v.asInstanceOf[js.Any]))
      LookupAttributes.foreach(__v => __obj.updateDynamic("LookupAttributes")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      StartTime.foreach(__v => __obj.updateDynamic("StartTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LookupEventsRequest]
    }
  }

  /** Contains a response to a LookupEvents action.
    */
  @js.native
  trait LookupEventsResponse extends js.Object {
    var Events: js.UndefOr[EventsList]
    var NextToken: js.UndefOr[NextToken]
  }

  object LookupEventsResponse {
    @inline
    def apply(
        Events: js.UndefOr[EventsList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): LookupEventsResponse = {
      val __obj = js.Dynamic.literal()
      Events.foreach(__v => __obj.updateDynamic("Events")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LookupEventsResponse]
    }
  }

  /** Contains information about a returned public key.
    */
  @js.native
  trait PublicKey extends js.Object {
    var Fingerprint: js.UndefOr[String]
    var ValidityEndTime: js.UndefOr[Date]
    var ValidityStartTime: js.UndefOr[Date]
    var Value: js.UndefOr[ByteBuffer]
  }

  object PublicKey {
    @inline
    def apply(
        Fingerprint: js.UndefOr[String] = js.undefined,
        ValidityEndTime: js.UndefOr[Date] = js.undefined,
        ValidityStartTime: js.UndefOr[Date] = js.undefined,
        Value: js.UndefOr[ByteBuffer] = js.undefined
    ): PublicKey = {
      val __obj = js.Dynamic.literal()
      Fingerprint.foreach(__v => __obj.updateDynamic("Fingerprint")(__v.asInstanceOf[js.Any]))
      ValidityEndTime.foreach(__v => __obj.updateDynamic("ValidityEndTime")(__v.asInstanceOf[js.Any]))
      ValidityStartTime.foreach(__v => __obj.updateDynamic("ValidityStartTime")(__v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PublicKey]
    }
  }

  @js.native
  trait PutEventSelectorsRequest extends js.Object {
    var TrailName: String
    var AdvancedEventSelectors: js.UndefOr[AdvancedEventSelectors]
    var EventSelectors: js.UndefOr[EventSelectors]
  }

  object PutEventSelectorsRequest {
    @inline
    def apply(
        TrailName: String,
        AdvancedEventSelectors: js.UndefOr[AdvancedEventSelectors] = js.undefined,
        EventSelectors: js.UndefOr[EventSelectors] = js.undefined
    ): PutEventSelectorsRequest = {
      val __obj = js.Dynamic.literal(
        "TrailName" -> TrailName.asInstanceOf[js.Any]
      )

      AdvancedEventSelectors.foreach(__v => __obj.updateDynamic("AdvancedEventSelectors")(__v.asInstanceOf[js.Any]))
      EventSelectors.foreach(__v => __obj.updateDynamic("EventSelectors")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutEventSelectorsRequest]
    }
  }

  @js.native
  trait PutEventSelectorsResponse extends js.Object {
    var AdvancedEventSelectors: js.UndefOr[AdvancedEventSelectors]
    var EventSelectors: js.UndefOr[EventSelectors]
    var TrailARN: js.UndefOr[String]
  }

  object PutEventSelectorsResponse {
    @inline
    def apply(
        AdvancedEventSelectors: js.UndefOr[AdvancedEventSelectors] = js.undefined,
        EventSelectors: js.UndefOr[EventSelectors] = js.undefined,
        TrailARN: js.UndefOr[String] = js.undefined
    ): PutEventSelectorsResponse = {
      val __obj = js.Dynamic.literal()
      AdvancedEventSelectors.foreach(__v => __obj.updateDynamic("AdvancedEventSelectors")(__v.asInstanceOf[js.Any]))
      EventSelectors.foreach(__v => __obj.updateDynamic("EventSelectors")(__v.asInstanceOf[js.Any]))
      TrailARN.foreach(__v => __obj.updateDynamic("TrailARN")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutEventSelectorsResponse]
    }
  }

  @js.native
  trait PutInsightSelectorsRequest extends js.Object {
    var InsightSelectors: InsightSelectors
    var TrailName: String
  }

  object PutInsightSelectorsRequest {
    @inline
    def apply(
        InsightSelectors: InsightSelectors,
        TrailName: String
    ): PutInsightSelectorsRequest = {
      val __obj = js.Dynamic.literal(
        "InsightSelectors" -> InsightSelectors.asInstanceOf[js.Any],
        "TrailName" -> TrailName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[PutInsightSelectorsRequest]
    }
  }

  @js.native
  trait PutInsightSelectorsResponse extends js.Object {
    var InsightSelectors: js.UndefOr[InsightSelectors]
    var TrailARN: js.UndefOr[String]
  }

  object PutInsightSelectorsResponse {
    @inline
    def apply(
        InsightSelectors: js.UndefOr[InsightSelectors] = js.undefined,
        TrailARN: js.UndefOr[String] = js.undefined
    ): PutInsightSelectorsResponse = {
      val __obj = js.Dynamic.literal()
      InsightSelectors.foreach(__v => __obj.updateDynamic("InsightSelectors")(__v.asInstanceOf[js.Any]))
      TrailARN.foreach(__v => __obj.updateDynamic("TrailARN")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutInsightSelectorsResponse]
    }
  }

  /** A SQL string of criteria about events that you want to collect in an event data store.
    */
  @js.native
  trait Query extends js.Object {
    var CreationTime: js.UndefOr[Date]
    var QueryId: js.UndefOr[UUID]
    var QueryStatus: js.UndefOr[QueryStatus]
  }

  object Query {
    @inline
    def apply(
        CreationTime: js.UndefOr[Date] = js.undefined,
        QueryId: js.UndefOr[UUID] = js.undefined,
        QueryStatus: js.UndefOr[QueryStatus] = js.undefined
    ): Query = {
      val __obj = js.Dynamic.literal()
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      QueryId.foreach(__v => __obj.updateDynamic("QueryId")(__v.asInstanceOf[js.Any]))
      QueryStatus.foreach(__v => __obj.updateDynamic("QueryStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Query]
    }
  }

  /** Metadata about a query, such as the number of results.
    */
  @js.native
  trait QueryStatistics extends js.Object {
    var BytesScanned: js.UndefOr[Double]
    var ResultsCount: js.UndefOr[Int]
    var TotalResultsCount: js.UndefOr[Int]
  }

  object QueryStatistics {
    @inline
    def apply(
        BytesScanned: js.UndefOr[Double] = js.undefined,
        ResultsCount: js.UndefOr[Int] = js.undefined,
        TotalResultsCount: js.UndefOr[Int] = js.undefined
    ): QueryStatistics = {
      val __obj = js.Dynamic.literal()
      BytesScanned.foreach(__v => __obj.updateDynamic("BytesScanned")(__v.asInstanceOf[js.Any]))
      ResultsCount.foreach(__v => __obj.updateDynamic("ResultsCount")(__v.asInstanceOf[js.Any]))
      TotalResultsCount.foreach(__v => __obj.updateDynamic("TotalResultsCount")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[QueryStatistics]
    }
  }

  /** Gets metadata about a query, including the number of events that were matched, the total number of events scanned, the query run time in milliseconds, and the query's creation time.
    */
  @js.native
  trait QueryStatisticsForDescribeQuery extends js.Object {
    var BytesScanned: js.UndefOr[Double]
    var CreationTime: js.UndefOr[Date]
    var EventsMatched: js.UndefOr[Double]
    var EventsScanned: js.UndefOr[Double]
    var ExecutionTimeInMillis: js.UndefOr[Int]
  }

  object QueryStatisticsForDescribeQuery {
    @inline
    def apply(
        BytesScanned: js.UndefOr[Double] = js.undefined,
        CreationTime: js.UndefOr[Date] = js.undefined,
        EventsMatched: js.UndefOr[Double] = js.undefined,
        EventsScanned: js.UndefOr[Double] = js.undefined,
        ExecutionTimeInMillis: js.UndefOr[Int] = js.undefined
    ): QueryStatisticsForDescribeQuery = {
      val __obj = js.Dynamic.literal()
      BytesScanned.foreach(__v => __obj.updateDynamic("BytesScanned")(__v.asInstanceOf[js.Any]))
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      EventsMatched.foreach(__v => __obj.updateDynamic("EventsMatched")(__v.asInstanceOf[js.Any]))
      EventsScanned.foreach(__v => __obj.updateDynamic("EventsScanned")(__v.asInstanceOf[js.Any]))
      ExecutionTimeInMillis.foreach(__v => __obj.updateDynamic("ExecutionTimeInMillis")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[QueryStatisticsForDescribeQuery]
    }
  }

  /** Specifies an organization member account ID as a CloudTrail delegated administrator.
    */
  @js.native
  trait RegisterOrganizationDelegatedAdminRequest extends js.Object {
    var MemberAccountId: AccountId
  }

  object RegisterOrganizationDelegatedAdminRequest {
    @inline
    def apply(
        MemberAccountId: AccountId
    ): RegisterOrganizationDelegatedAdminRequest = {
      val __obj = js.Dynamic.literal(
        "MemberAccountId" -> MemberAccountId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[RegisterOrganizationDelegatedAdminRequest]
    }
  }

  /** Returns the following response if successful. Otherwise, returns an error.
    */
  @js.native
  trait RegisterOrganizationDelegatedAdminResponse extends js.Object

  object RegisterOrganizationDelegatedAdminResponse {
    @inline
    def apply(): RegisterOrganizationDelegatedAdminResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RegisterOrganizationDelegatedAdminResponse]
    }
  }

  /** Specifies the tags to remove from a trail or event data store.
    */
  @js.native
  trait RemoveTagsRequest extends js.Object {
    var ResourceId: String
    var TagsList: TagsList
  }

  object RemoveTagsRequest {
    @inline
    def apply(
        ResourceId: String,
        TagsList: TagsList
    ): RemoveTagsRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceId" -> ResourceId.asInstanceOf[js.Any],
        "TagsList" -> TagsList.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[RemoveTagsRequest]
    }
  }

  /** Returns the objects or data listed below if successful. Otherwise, returns an error.
    */
  @js.native
  trait RemoveTagsResponse extends js.Object

  object RemoveTagsResponse {
    @inline
    def apply(): RemoveTagsResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RemoveTagsResponse]
    }
  }

  /** Specifies the type and name of a resource referenced by an event.
    */
  @js.native
  trait Resource extends js.Object {
    var ResourceName: js.UndefOr[String]
    var ResourceType: js.UndefOr[String]
  }

  object Resource {
    @inline
    def apply(
        ResourceName: js.UndefOr[String] = js.undefined,
        ResourceType: js.UndefOr[String] = js.undefined
    ): Resource = {
      val __obj = js.Dynamic.literal()
      ResourceName.foreach(__v => __obj.updateDynamic("ResourceName")(__v.asInstanceOf[js.Any]))
      ResourceType.foreach(__v => __obj.updateDynamic("ResourceType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Resource]
    }
  }

  /** A resource tag.
    */
  @js.native
  trait ResourceTag extends js.Object {
    var ResourceId: js.UndefOr[String]
    var TagsList: js.UndefOr[TagsList]
  }

  object ResourceTag {
    @inline
    def apply(
        ResourceId: js.UndefOr[String] = js.undefined,
        TagsList: js.UndefOr[TagsList] = js.undefined
    ): ResourceTag = {
      val __obj = js.Dynamic.literal()
      ResourceId.foreach(__v => __obj.updateDynamic("ResourceId")(__v.asInstanceOf[js.Any]))
      TagsList.foreach(__v => __obj.updateDynamic("TagsList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResourceTag]
    }
  }

  @js.native
  trait RestoreEventDataStoreRequest extends js.Object {
    var EventDataStore: EventDataStoreArn
  }

  object RestoreEventDataStoreRequest {
    @inline
    def apply(
        EventDataStore: EventDataStoreArn
    ): RestoreEventDataStoreRequest = {
      val __obj = js.Dynamic.literal(
        "EventDataStore" -> EventDataStore.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[RestoreEventDataStoreRequest]
    }
  }

  @js.native
  trait RestoreEventDataStoreResponse extends js.Object {
    var AdvancedEventSelectors: js.UndefOr[AdvancedEventSelectors]
    var CreatedTimestamp: js.UndefOr[Date]
    var EventDataStoreArn: js.UndefOr[EventDataStoreArn]
    var KmsKeyId: js.UndefOr[EventDataStoreKmsKeyId]
    var MultiRegionEnabled: js.UndefOr[Boolean]
    var Name: js.UndefOr[EventDataStoreName]
    var OrganizationEnabled: js.UndefOr[Boolean]
    var RetentionPeriod: js.UndefOr[RetentionPeriod]
    var Status: js.UndefOr[EventDataStoreStatus]
    var TerminationProtectionEnabled: js.UndefOr[TerminationProtectionEnabled]
    var UpdatedTimestamp: js.UndefOr[Date]
  }

  object RestoreEventDataStoreResponse {
    @inline
    def apply(
        AdvancedEventSelectors: js.UndefOr[AdvancedEventSelectors] = js.undefined,
        CreatedTimestamp: js.UndefOr[Date] = js.undefined,
        EventDataStoreArn: js.UndefOr[EventDataStoreArn] = js.undefined,
        KmsKeyId: js.UndefOr[EventDataStoreKmsKeyId] = js.undefined,
        MultiRegionEnabled: js.UndefOr[Boolean] = js.undefined,
        Name: js.UndefOr[EventDataStoreName] = js.undefined,
        OrganizationEnabled: js.UndefOr[Boolean] = js.undefined,
        RetentionPeriod: js.UndefOr[RetentionPeriod] = js.undefined,
        Status: js.UndefOr[EventDataStoreStatus] = js.undefined,
        TerminationProtectionEnabled: js.UndefOr[TerminationProtectionEnabled] = js.undefined,
        UpdatedTimestamp: js.UndefOr[Date] = js.undefined
    ): RestoreEventDataStoreResponse = {
      val __obj = js.Dynamic.literal()
      AdvancedEventSelectors.foreach(__v => __obj.updateDynamic("AdvancedEventSelectors")(__v.asInstanceOf[js.Any]))
      CreatedTimestamp.foreach(__v => __obj.updateDynamic("CreatedTimestamp")(__v.asInstanceOf[js.Any]))
      EventDataStoreArn.foreach(__v => __obj.updateDynamic("EventDataStoreArn")(__v.asInstanceOf[js.Any]))
      KmsKeyId.foreach(__v => __obj.updateDynamic("KmsKeyId")(__v.asInstanceOf[js.Any]))
      MultiRegionEnabled.foreach(__v => __obj.updateDynamic("MultiRegionEnabled")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      OrganizationEnabled.foreach(__v => __obj.updateDynamic("OrganizationEnabled")(__v.asInstanceOf[js.Any]))
      RetentionPeriod.foreach(__v => __obj.updateDynamic("RetentionPeriod")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      TerminationProtectionEnabled.foreach(__v => __obj.updateDynamic("TerminationProtectionEnabled")(__v.asInstanceOf[js.Any]))
      UpdatedTimestamp.foreach(__v => __obj.updateDynamic("UpdatedTimestamp")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RestoreEventDataStoreResponse]
    }
  }

  /** The settings for the source S3 bucket.
    */
  @js.native
  trait S3ImportSource extends js.Object {
    var S3BucketAccessRoleArn: String
    var S3BucketRegion: String
    var S3LocationUri: String
  }

  object S3ImportSource {
    @inline
    def apply(
        S3BucketAccessRoleArn: String,
        S3BucketRegion: String,
        S3LocationUri: String
    ): S3ImportSource = {
      val __obj = js.Dynamic.literal(
        "S3BucketAccessRoleArn" -> S3BucketAccessRoleArn.asInstanceOf[js.Any],
        "S3BucketRegion" -> S3BucketRegion.asInstanceOf[js.Any],
        "S3LocationUri" -> S3LocationUri.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[S3ImportSource]
    }
  }

  /** Contains configuration information about the channel.
    */
  @js.native
  trait SourceConfig extends js.Object {
    var AdvancedEventSelectors: js.UndefOr[AdvancedEventSelectors]
    var ApplyToAllRegions: js.UndefOr[Boolean]
  }

  object SourceConfig {
    @inline
    def apply(
        AdvancedEventSelectors: js.UndefOr[AdvancedEventSelectors] = js.undefined,
        ApplyToAllRegions: js.UndefOr[Boolean] = js.undefined
    ): SourceConfig = {
      val __obj = js.Dynamic.literal()
      AdvancedEventSelectors.foreach(__v => __obj.updateDynamic("AdvancedEventSelectors")(__v.asInstanceOf[js.Any]))
      ApplyToAllRegions.foreach(__v => __obj.updateDynamic("ApplyToAllRegions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SourceConfig]
    }
  }

  @js.native
  trait StartImportRequest extends js.Object {
    var Destinations: js.UndefOr[ImportDestinations]
    var EndEventTime: js.UndefOr[Date]
    var ImportId: js.UndefOr[UUID]
    var ImportSource: js.UndefOr[ImportSource]
    var StartEventTime: js.UndefOr[Date]
  }

  object StartImportRequest {
    @inline
    def apply(
        Destinations: js.UndefOr[ImportDestinations] = js.undefined,
        EndEventTime: js.UndefOr[Date] = js.undefined,
        ImportId: js.UndefOr[UUID] = js.undefined,
        ImportSource: js.UndefOr[ImportSource] = js.undefined,
        StartEventTime: js.UndefOr[Date] = js.undefined
    ): StartImportRequest = {
      val __obj = js.Dynamic.literal()
      Destinations.foreach(__v => __obj.updateDynamic("Destinations")(__v.asInstanceOf[js.Any]))
      EndEventTime.foreach(__v => __obj.updateDynamic("EndEventTime")(__v.asInstanceOf[js.Any]))
      ImportId.foreach(__v => __obj.updateDynamic("ImportId")(__v.asInstanceOf[js.Any]))
      ImportSource.foreach(__v => __obj.updateDynamic("ImportSource")(__v.asInstanceOf[js.Any]))
      StartEventTime.foreach(__v => __obj.updateDynamic("StartEventTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartImportRequest]
    }
  }

  @js.native
  trait StartImportResponse extends js.Object {
    var CreatedTimestamp: js.UndefOr[Date]
    var Destinations: js.UndefOr[ImportDestinations]
    var EndEventTime: js.UndefOr[Date]
    var ImportId: js.UndefOr[UUID]
    var ImportSource: js.UndefOr[ImportSource]
    var ImportStatus: js.UndefOr[ImportStatus]
    var StartEventTime: js.UndefOr[Date]
    var UpdatedTimestamp: js.UndefOr[Date]
  }

  object StartImportResponse {
    @inline
    def apply(
        CreatedTimestamp: js.UndefOr[Date] = js.undefined,
        Destinations: js.UndefOr[ImportDestinations] = js.undefined,
        EndEventTime: js.UndefOr[Date] = js.undefined,
        ImportId: js.UndefOr[UUID] = js.undefined,
        ImportSource: js.UndefOr[ImportSource] = js.undefined,
        ImportStatus: js.UndefOr[ImportStatus] = js.undefined,
        StartEventTime: js.UndefOr[Date] = js.undefined,
        UpdatedTimestamp: js.UndefOr[Date] = js.undefined
    ): StartImportResponse = {
      val __obj = js.Dynamic.literal()
      CreatedTimestamp.foreach(__v => __obj.updateDynamic("CreatedTimestamp")(__v.asInstanceOf[js.Any]))
      Destinations.foreach(__v => __obj.updateDynamic("Destinations")(__v.asInstanceOf[js.Any]))
      EndEventTime.foreach(__v => __obj.updateDynamic("EndEventTime")(__v.asInstanceOf[js.Any]))
      ImportId.foreach(__v => __obj.updateDynamic("ImportId")(__v.asInstanceOf[js.Any]))
      ImportSource.foreach(__v => __obj.updateDynamic("ImportSource")(__v.asInstanceOf[js.Any]))
      ImportStatus.foreach(__v => __obj.updateDynamic("ImportStatus")(__v.asInstanceOf[js.Any]))
      StartEventTime.foreach(__v => __obj.updateDynamic("StartEventTime")(__v.asInstanceOf[js.Any]))
      UpdatedTimestamp.foreach(__v => __obj.updateDynamic("UpdatedTimestamp")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartImportResponse]
    }
  }

  /** The request to CloudTrail to start logging Amazon Web Services API calls for an account.
    */
  @js.native
  trait StartLoggingRequest extends js.Object {
    var Name: String
  }

  object StartLoggingRequest {
    @inline
    def apply(
        Name: String
    ): StartLoggingRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[StartLoggingRequest]
    }
  }

  /** Returns the objects or data listed below if successful. Otherwise, returns an error.
    */
  @js.native
  trait StartLoggingResponse extends js.Object

  object StartLoggingResponse {
    @inline
    def apply(): StartLoggingResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StartLoggingResponse]
    }
  }

  @js.native
  trait StartQueryRequest extends js.Object {
    var QueryStatement: QueryStatement
    var DeliveryS3Uri: js.UndefOr[DeliveryS3Uri]
  }

  object StartQueryRequest {
    @inline
    def apply(
        QueryStatement: QueryStatement,
        DeliveryS3Uri: js.UndefOr[DeliveryS3Uri] = js.undefined
    ): StartQueryRequest = {
      val __obj = js.Dynamic.literal(
        "QueryStatement" -> QueryStatement.asInstanceOf[js.Any]
      )

      DeliveryS3Uri.foreach(__v => __obj.updateDynamic("DeliveryS3Uri")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartQueryRequest]
    }
  }

  @js.native
  trait StartQueryResponse extends js.Object {
    var QueryId: js.UndefOr[UUID]
  }

  object StartQueryResponse {
    @inline
    def apply(
        QueryId: js.UndefOr[UUID] = js.undefined
    ): StartQueryResponse = {
      val __obj = js.Dynamic.literal()
      QueryId.foreach(__v => __obj.updateDynamic("QueryId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartQueryResponse]
    }
  }

  @js.native
  trait StopImportRequest extends js.Object {
    var ImportId: UUID
  }

  object StopImportRequest {
    @inline
    def apply(
        ImportId: UUID
    ): StopImportRequest = {
      val __obj = js.Dynamic.literal(
        "ImportId" -> ImportId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[StopImportRequest]
    }
  }

  @js.native
  trait StopImportResponse extends js.Object {
    var CreatedTimestamp: js.UndefOr[Date]
    var Destinations: js.UndefOr[ImportDestinations]
    var EndEventTime: js.UndefOr[Date]
    var ImportId: js.UndefOr[UUID]
    var ImportSource: js.UndefOr[ImportSource]
    var ImportStatistics: js.UndefOr[ImportStatistics]
    var ImportStatus: js.UndefOr[ImportStatus]
    var StartEventTime: js.UndefOr[Date]
    var UpdatedTimestamp: js.UndefOr[Date]
  }

  object StopImportResponse {
    @inline
    def apply(
        CreatedTimestamp: js.UndefOr[Date] = js.undefined,
        Destinations: js.UndefOr[ImportDestinations] = js.undefined,
        EndEventTime: js.UndefOr[Date] = js.undefined,
        ImportId: js.UndefOr[UUID] = js.undefined,
        ImportSource: js.UndefOr[ImportSource] = js.undefined,
        ImportStatistics: js.UndefOr[ImportStatistics] = js.undefined,
        ImportStatus: js.UndefOr[ImportStatus] = js.undefined,
        StartEventTime: js.UndefOr[Date] = js.undefined,
        UpdatedTimestamp: js.UndefOr[Date] = js.undefined
    ): StopImportResponse = {
      val __obj = js.Dynamic.literal()
      CreatedTimestamp.foreach(__v => __obj.updateDynamic("CreatedTimestamp")(__v.asInstanceOf[js.Any]))
      Destinations.foreach(__v => __obj.updateDynamic("Destinations")(__v.asInstanceOf[js.Any]))
      EndEventTime.foreach(__v => __obj.updateDynamic("EndEventTime")(__v.asInstanceOf[js.Any]))
      ImportId.foreach(__v => __obj.updateDynamic("ImportId")(__v.asInstanceOf[js.Any]))
      ImportSource.foreach(__v => __obj.updateDynamic("ImportSource")(__v.asInstanceOf[js.Any]))
      ImportStatistics.foreach(__v => __obj.updateDynamic("ImportStatistics")(__v.asInstanceOf[js.Any]))
      ImportStatus.foreach(__v => __obj.updateDynamic("ImportStatus")(__v.asInstanceOf[js.Any]))
      StartEventTime.foreach(__v => __obj.updateDynamic("StartEventTime")(__v.asInstanceOf[js.Any]))
      UpdatedTimestamp.foreach(__v => __obj.updateDynamic("UpdatedTimestamp")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StopImportResponse]
    }
  }

  /** Passes the request to CloudTrail to stop logging Amazon Web Services API calls for the specified account.
    */
  @js.native
  trait StopLoggingRequest extends js.Object {
    var Name: String
  }

  object StopLoggingRequest {
    @inline
    def apply(
        Name: String
    ): StopLoggingRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[StopLoggingRequest]
    }
  }

  /** Returns the objects or data listed below if successful. Otherwise, returns an error.
    */
  @js.native
  trait StopLoggingResponse extends js.Object

  object StopLoggingResponse {
    @inline
    def apply(): StopLoggingResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StopLoggingResponse]
    }
  }

  /** A custom key-value pair associated with a resource such as a CloudTrail trail.
    */
  @js.native
  trait Tag extends js.Object {
    var Key: TagKey
    var Value: js.UndefOr[TagValue]
  }

  object Tag {
    @inline
    def apply(
        Key: TagKey,
        Value: js.UndefOr[TagValue] = js.undefined
    ): Tag = {
      val __obj = js.Dynamic.literal(
        "Key" -> Key.asInstanceOf[js.Any]
      )

      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Tag]
    }
  }

  /** The settings for a trail.
    */
  @js.native
  trait Trail extends js.Object {
    var CloudWatchLogsLogGroupArn: js.UndefOr[String]
    var CloudWatchLogsRoleArn: js.UndefOr[String]
    var HasCustomEventSelectors: js.UndefOr[Boolean]
    var HasInsightSelectors: js.UndefOr[Boolean]
    var HomeRegion: js.UndefOr[String]
    var IncludeGlobalServiceEvents: js.UndefOr[Boolean]
    var IsMultiRegionTrail: js.UndefOr[Boolean]
    var IsOrganizationTrail: js.UndefOr[Boolean]
    var KmsKeyId: js.UndefOr[String]
    var LogFileValidationEnabled: js.UndefOr[Boolean]
    var Name: js.UndefOr[String]
    var S3BucketName: js.UndefOr[String]
    var S3KeyPrefix: js.UndefOr[String]
    var SnsTopicARN: js.UndefOr[String]
    var SnsTopicName: js.UndefOr[String]
    var TrailARN: js.UndefOr[String]
  }

  object Trail {
    @inline
    def apply(
        CloudWatchLogsLogGroupArn: js.UndefOr[String] = js.undefined,
        CloudWatchLogsRoleArn: js.UndefOr[String] = js.undefined,
        HasCustomEventSelectors: js.UndefOr[Boolean] = js.undefined,
        HasInsightSelectors: js.UndefOr[Boolean] = js.undefined,
        HomeRegion: js.UndefOr[String] = js.undefined,
        IncludeGlobalServiceEvents: js.UndefOr[Boolean] = js.undefined,
        IsMultiRegionTrail: js.UndefOr[Boolean] = js.undefined,
        IsOrganizationTrail: js.UndefOr[Boolean] = js.undefined,
        KmsKeyId: js.UndefOr[String] = js.undefined,
        LogFileValidationEnabled: js.UndefOr[Boolean] = js.undefined,
        Name: js.UndefOr[String] = js.undefined,
        S3BucketName: js.UndefOr[String] = js.undefined,
        S3KeyPrefix: js.UndefOr[String] = js.undefined,
        SnsTopicARN: js.UndefOr[String] = js.undefined,
        SnsTopicName: js.UndefOr[String] = js.undefined,
        TrailARN: js.UndefOr[String] = js.undefined
    ): Trail = {
      val __obj = js.Dynamic.literal()
      CloudWatchLogsLogGroupArn.foreach(__v => __obj.updateDynamic("CloudWatchLogsLogGroupArn")(__v.asInstanceOf[js.Any]))
      CloudWatchLogsRoleArn.foreach(__v => __obj.updateDynamic("CloudWatchLogsRoleArn")(__v.asInstanceOf[js.Any]))
      HasCustomEventSelectors.foreach(__v => __obj.updateDynamic("HasCustomEventSelectors")(__v.asInstanceOf[js.Any]))
      HasInsightSelectors.foreach(__v => __obj.updateDynamic("HasInsightSelectors")(__v.asInstanceOf[js.Any]))
      HomeRegion.foreach(__v => __obj.updateDynamic("HomeRegion")(__v.asInstanceOf[js.Any]))
      IncludeGlobalServiceEvents.foreach(__v => __obj.updateDynamic("IncludeGlobalServiceEvents")(__v.asInstanceOf[js.Any]))
      IsMultiRegionTrail.foreach(__v => __obj.updateDynamic("IsMultiRegionTrail")(__v.asInstanceOf[js.Any]))
      IsOrganizationTrail.foreach(__v => __obj.updateDynamic("IsOrganizationTrail")(__v.asInstanceOf[js.Any]))
      KmsKeyId.foreach(__v => __obj.updateDynamic("KmsKeyId")(__v.asInstanceOf[js.Any]))
      LogFileValidationEnabled.foreach(__v => __obj.updateDynamic("LogFileValidationEnabled")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      S3BucketName.foreach(__v => __obj.updateDynamic("S3BucketName")(__v.asInstanceOf[js.Any]))
      S3KeyPrefix.foreach(__v => __obj.updateDynamic("S3KeyPrefix")(__v.asInstanceOf[js.Any]))
      SnsTopicARN.foreach(__v => __obj.updateDynamic("SnsTopicARN")(__v.asInstanceOf[js.Any]))
      SnsTopicName.foreach(__v => __obj.updateDynamic("SnsTopicName")(__v.asInstanceOf[js.Any]))
      TrailARN.foreach(__v => __obj.updateDynamic("TrailARN")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Trail]
    }
  }

  /** Information about a CloudTrail trail, including the trail's name, home region, and Amazon Resource Name (ARN).
    */
  @js.native
  trait TrailInfo extends js.Object {
    var HomeRegion: js.UndefOr[String]
    var Name: js.UndefOr[String]
    var TrailARN: js.UndefOr[String]
  }

  object TrailInfo {
    @inline
    def apply(
        HomeRegion: js.UndefOr[String] = js.undefined,
        Name: js.UndefOr[String] = js.undefined,
        TrailARN: js.UndefOr[String] = js.undefined
    ): TrailInfo = {
      val __obj = js.Dynamic.literal()
      HomeRegion.foreach(__v => __obj.updateDynamic("HomeRegion")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      TrailARN.foreach(__v => __obj.updateDynamic("TrailARN")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TrailInfo]
    }
  }

  @js.native
  trait UpdateEventDataStoreRequest extends js.Object {
    var EventDataStore: EventDataStoreArn
    var AdvancedEventSelectors: js.UndefOr[AdvancedEventSelectors]
    var KmsKeyId: js.UndefOr[EventDataStoreKmsKeyId]
    var MultiRegionEnabled: js.UndefOr[Boolean]
    var Name: js.UndefOr[EventDataStoreName]
    var OrganizationEnabled: js.UndefOr[Boolean]
    var RetentionPeriod: js.UndefOr[RetentionPeriod]
    var TerminationProtectionEnabled: js.UndefOr[TerminationProtectionEnabled]
  }

  object UpdateEventDataStoreRequest {
    @inline
    def apply(
        EventDataStore: EventDataStoreArn,
        AdvancedEventSelectors: js.UndefOr[AdvancedEventSelectors] = js.undefined,
        KmsKeyId: js.UndefOr[EventDataStoreKmsKeyId] = js.undefined,
        MultiRegionEnabled: js.UndefOr[Boolean] = js.undefined,
        Name: js.UndefOr[EventDataStoreName] = js.undefined,
        OrganizationEnabled: js.UndefOr[Boolean] = js.undefined,
        RetentionPeriod: js.UndefOr[RetentionPeriod] = js.undefined,
        TerminationProtectionEnabled: js.UndefOr[TerminationProtectionEnabled] = js.undefined
    ): UpdateEventDataStoreRequest = {
      val __obj = js.Dynamic.literal(
        "EventDataStore" -> EventDataStore.asInstanceOf[js.Any]
      )

      AdvancedEventSelectors.foreach(__v => __obj.updateDynamic("AdvancedEventSelectors")(__v.asInstanceOf[js.Any]))
      KmsKeyId.foreach(__v => __obj.updateDynamic("KmsKeyId")(__v.asInstanceOf[js.Any]))
      MultiRegionEnabled.foreach(__v => __obj.updateDynamic("MultiRegionEnabled")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      OrganizationEnabled.foreach(__v => __obj.updateDynamic("OrganizationEnabled")(__v.asInstanceOf[js.Any]))
      RetentionPeriod.foreach(__v => __obj.updateDynamic("RetentionPeriod")(__v.asInstanceOf[js.Any]))
      TerminationProtectionEnabled.foreach(__v => __obj.updateDynamic("TerminationProtectionEnabled")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateEventDataStoreRequest]
    }
  }

  @js.native
  trait UpdateEventDataStoreResponse extends js.Object {
    var AdvancedEventSelectors: js.UndefOr[AdvancedEventSelectors]
    var CreatedTimestamp: js.UndefOr[Date]
    var EventDataStoreArn: js.UndefOr[EventDataStoreArn]
    var KmsKeyId: js.UndefOr[EventDataStoreKmsKeyId]
    var MultiRegionEnabled: js.UndefOr[Boolean]
    var Name: js.UndefOr[EventDataStoreName]
    var OrganizationEnabled: js.UndefOr[Boolean]
    var RetentionPeriod: js.UndefOr[RetentionPeriod]
    var Status: js.UndefOr[EventDataStoreStatus]
    var TerminationProtectionEnabled: js.UndefOr[TerminationProtectionEnabled]
    var UpdatedTimestamp: js.UndefOr[Date]
  }

  object UpdateEventDataStoreResponse {
    @inline
    def apply(
        AdvancedEventSelectors: js.UndefOr[AdvancedEventSelectors] = js.undefined,
        CreatedTimestamp: js.UndefOr[Date] = js.undefined,
        EventDataStoreArn: js.UndefOr[EventDataStoreArn] = js.undefined,
        KmsKeyId: js.UndefOr[EventDataStoreKmsKeyId] = js.undefined,
        MultiRegionEnabled: js.UndefOr[Boolean] = js.undefined,
        Name: js.UndefOr[EventDataStoreName] = js.undefined,
        OrganizationEnabled: js.UndefOr[Boolean] = js.undefined,
        RetentionPeriod: js.UndefOr[RetentionPeriod] = js.undefined,
        Status: js.UndefOr[EventDataStoreStatus] = js.undefined,
        TerminationProtectionEnabled: js.UndefOr[TerminationProtectionEnabled] = js.undefined,
        UpdatedTimestamp: js.UndefOr[Date] = js.undefined
    ): UpdateEventDataStoreResponse = {
      val __obj = js.Dynamic.literal()
      AdvancedEventSelectors.foreach(__v => __obj.updateDynamic("AdvancedEventSelectors")(__v.asInstanceOf[js.Any]))
      CreatedTimestamp.foreach(__v => __obj.updateDynamic("CreatedTimestamp")(__v.asInstanceOf[js.Any]))
      EventDataStoreArn.foreach(__v => __obj.updateDynamic("EventDataStoreArn")(__v.asInstanceOf[js.Any]))
      KmsKeyId.foreach(__v => __obj.updateDynamic("KmsKeyId")(__v.asInstanceOf[js.Any]))
      MultiRegionEnabled.foreach(__v => __obj.updateDynamic("MultiRegionEnabled")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      OrganizationEnabled.foreach(__v => __obj.updateDynamic("OrganizationEnabled")(__v.asInstanceOf[js.Any]))
      RetentionPeriod.foreach(__v => __obj.updateDynamic("RetentionPeriod")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      TerminationProtectionEnabled.foreach(__v => __obj.updateDynamic("TerminationProtectionEnabled")(__v.asInstanceOf[js.Any]))
      UpdatedTimestamp.foreach(__v => __obj.updateDynamic("UpdatedTimestamp")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateEventDataStoreResponse]
    }
  }

  /** Specifies settings to update for the trail.
    */
  @js.native
  trait UpdateTrailRequest extends js.Object {
    var Name: String
    var CloudWatchLogsLogGroupArn: js.UndefOr[String]
    var CloudWatchLogsRoleArn: js.UndefOr[String]
    var EnableLogFileValidation: js.UndefOr[Boolean]
    var IncludeGlobalServiceEvents: js.UndefOr[Boolean]
    var IsMultiRegionTrail: js.UndefOr[Boolean]
    var IsOrganizationTrail: js.UndefOr[Boolean]
    var KmsKeyId: js.UndefOr[String]
    var S3BucketName: js.UndefOr[String]
    var S3KeyPrefix: js.UndefOr[String]
    var SnsTopicName: js.UndefOr[String]
  }

  object UpdateTrailRequest {
    @inline
    def apply(
        Name: String,
        CloudWatchLogsLogGroupArn: js.UndefOr[String] = js.undefined,
        CloudWatchLogsRoleArn: js.UndefOr[String] = js.undefined,
        EnableLogFileValidation: js.UndefOr[Boolean] = js.undefined,
        IncludeGlobalServiceEvents: js.UndefOr[Boolean] = js.undefined,
        IsMultiRegionTrail: js.UndefOr[Boolean] = js.undefined,
        IsOrganizationTrail: js.UndefOr[Boolean] = js.undefined,
        KmsKeyId: js.UndefOr[String] = js.undefined,
        S3BucketName: js.UndefOr[String] = js.undefined,
        S3KeyPrefix: js.UndefOr[String] = js.undefined,
        SnsTopicName: js.UndefOr[String] = js.undefined
    ): UpdateTrailRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      CloudWatchLogsLogGroupArn.foreach(__v => __obj.updateDynamic("CloudWatchLogsLogGroupArn")(__v.asInstanceOf[js.Any]))
      CloudWatchLogsRoleArn.foreach(__v => __obj.updateDynamic("CloudWatchLogsRoleArn")(__v.asInstanceOf[js.Any]))
      EnableLogFileValidation.foreach(__v => __obj.updateDynamic("EnableLogFileValidation")(__v.asInstanceOf[js.Any]))
      IncludeGlobalServiceEvents.foreach(__v => __obj.updateDynamic("IncludeGlobalServiceEvents")(__v.asInstanceOf[js.Any]))
      IsMultiRegionTrail.foreach(__v => __obj.updateDynamic("IsMultiRegionTrail")(__v.asInstanceOf[js.Any]))
      IsOrganizationTrail.foreach(__v => __obj.updateDynamic("IsOrganizationTrail")(__v.asInstanceOf[js.Any]))
      KmsKeyId.foreach(__v => __obj.updateDynamic("KmsKeyId")(__v.asInstanceOf[js.Any]))
      S3BucketName.foreach(__v => __obj.updateDynamic("S3BucketName")(__v.asInstanceOf[js.Any]))
      S3KeyPrefix.foreach(__v => __obj.updateDynamic("S3KeyPrefix")(__v.asInstanceOf[js.Any]))
      SnsTopicName.foreach(__v => __obj.updateDynamic("SnsTopicName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateTrailRequest]
    }
  }

  /** Returns the objects or data listed below if successful. Otherwise, returns an error.
    */
  @js.native
  trait UpdateTrailResponse extends js.Object {
    var CloudWatchLogsLogGroupArn: js.UndefOr[String]
    var CloudWatchLogsRoleArn: js.UndefOr[String]
    var IncludeGlobalServiceEvents: js.UndefOr[Boolean]
    var IsMultiRegionTrail: js.UndefOr[Boolean]
    var IsOrganizationTrail: js.UndefOr[Boolean]
    var KmsKeyId: js.UndefOr[String]
    var LogFileValidationEnabled: js.UndefOr[Boolean]
    var Name: js.UndefOr[String]
    var S3BucketName: js.UndefOr[String]
    var S3KeyPrefix: js.UndefOr[String]
    var SnsTopicARN: js.UndefOr[String]
    var SnsTopicName: js.UndefOr[String]
    var TrailARN: js.UndefOr[String]
  }

  object UpdateTrailResponse {
    @inline
    def apply(
        CloudWatchLogsLogGroupArn: js.UndefOr[String] = js.undefined,
        CloudWatchLogsRoleArn: js.UndefOr[String] = js.undefined,
        IncludeGlobalServiceEvents: js.UndefOr[Boolean] = js.undefined,
        IsMultiRegionTrail: js.UndefOr[Boolean] = js.undefined,
        IsOrganizationTrail: js.UndefOr[Boolean] = js.undefined,
        KmsKeyId: js.UndefOr[String] = js.undefined,
        LogFileValidationEnabled: js.UndefOr[Boolean] = js.undefined,
        Name: js.UndefOr[String] = js.undefined,
        S3BucketName: js.UndefOr[String] = js.undefined,
        S3KeyPrefix: js.UndefOr[String] = js.undefined,
        SnsTopicARN: js.UndefOr[String] = js.undefined,
        SnsTopicName: js.UndefOr[String] = js.undefined,
        TrailARN: js.UndefOr[String] = js.undefined
    ): UpdateTrailResponse = {
      val __obj = js.Dynamic.literal()
      CloudWatchLogsLogGroupArn.foreach(__v => __obj.updateDynamic("CloudWatchLogsLogGroupArn")(__v.asInstanceOf[js.Any]))
      CloudWatchLogsRoleArn.foreach(__v => __obj.updateDynamic("CloudWatchLogsRoleArn")(__v.asInstanceOf[js.Any]))
      IncludeGlobalServiceEvents.foreach(__v => __obj.updateDynamic("IncludeGlobalServiceEvents")(__v.asInstanceOf[js.Any]))
      IsMultiRegionTrail.foreach(__v => __obj.updateDynamic("IsMultiRegionTrail")(__v.asInstanceOf[js.Any]))
      IsOrganizationTrail.foreach(__v => __obj.updateDynamic("IsOrganizationTrail")(__v.asInstanceOf[js.Any]))
      KmsKeyId.foreach(__v => __obj.updateDynamic("KmsKeyId")(__v.asInstanceOf[js.Any]))
      LogFileValidationEnabled.foreach(__v => __obj.updateDynamic("LogFileValidationEnabled")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      S3BucketName.foreach(__v => __obj.updateDynamic("S3BucketName")(__v.asInstanceOf[js.Any]))
      S3KeyPrefix.foreach(__v => __obj.updateDynamic("S3KeyPrefix")(__v.asInstanceOf[js.Any]))
      SnsTopicARN.foreach(__v => __obj.updateDynamic("SnsTopicARN")(__v.asInstanceOf[js.Any]))
      SnsTopicName.foreach(__v => __obj.updateDynamic("SnsTopicName")(__v.asInstanceOf[js.Any]))
      TrailARN.foreach(__v => __obj.updateDynamic("TrailARN")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateTrailResponse]
    }
  }
}
