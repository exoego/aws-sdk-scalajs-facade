package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

package object location {
  type Arn = String
  type ArnList = js.Array[Arn]
  type BatchDeleteGeofenceErrorList = js.Array[BatchDeleteGeofenceError]
  type BatchDeleteGeofenceRequestGeofenceIdsList = js.Array[Id]
  type BatchEvaluateGeofencesErrorList = js.Array[BatchEvaluateGeofencesError]
  type BatchEvaluateGeofencesRequestDevicePositionUpdatesList = js.Array[DevicePositionUpdate]
  type BatchGetDevicePositionErrorList = js.Array[BatchGetDevicePositionError]
  type BatchGetDevicePositionRequestDeviceIdsList = js.Array[Id]
  type BatchGetDevicePositionRequestTrackerNameString = String
  type BatchPutGeofenceErrorList = js.Array[BatchPutGeofenceError]
  type BatchPutGeofenceRequestEntriesList = js.Array[BatchPutGeofenceRequestEntry]
  type BatchPutGeofenceSuccessList = js.Array[BatchPutGeofenceSuccess]
  type BatchUpdateDevicePositionErrorList = js.Array[BatchUpdateDevicePositionError]
  type BatchUpdateDevicePositionRequestUpdatesList = js.Array[DevicePositionUpdate]
  type Blob = js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type BoundingBox = js.Array[Double]
  type CountryCode = String
  type CountryCodeList = js.Array[CountryCode]
  type DevicePositionList = js.Array[DevicePosition]
  type GetMapGlyphsRequestFontUnicodeRangeString = String
  type GetMapSpritesRequestFileNameString = String
  type GetMapTileRequestXString = String
  type GetMapTileRequestYString = String
  type GetMapTileRequestZString = String
  type Id = String
  type LinearRing = js.Array[Position]
  type LinearRings = js.Array[LinearRing]
  type ListGeofenceCollectionsRequestMaxResultsInteger = Int
  type ListGeofenceCollectionsResponseEntryList = js.Array[ListGeofenceCollectionsResponseEntry]
  type ListGeofenceResponseEntryList = js.Array[ListGeofenceResponseEntry]
  type ListMapsRequestMaxResultsInteger = Int
  type ListMapsResponseEntryList = js.Array[ListMapsResponseEntry]
  type ListPlaceIndexesRequestMaxResultsInteger = Int
  type ListPlaceIndexesResponseEntryList = js.Array[ListPlaceIndexesResponseEntry]
  type ListTrackerConsumersRequestMaxResultsInteger = Int
  type ListTrackersRequestMaxResultsInteger = Int
  type ListTrackersResponseEntryList = js.Array[ListTrackersResponseEntry]
  type MapStyle = String
  type PlaceIndexSearchResultLimit = Int
  type Position = js.Array[Double]
  type ResourceDescription = String
  type ResourceName = String
  type SearchForPositionResultList = js.Array[SearchForPositionResult]
  type SearchForTextResultList = js.Array[SearchForTextResult]
  type SyntheticSearchPlaceIndexForTextRequestString = String
  type SyntheticSearchPlaceIndexForTextSummaryString = String
  type Timestamp = js.Date
  type Token = String

  final class LocationOps(private val service: Location) extends AnyVal {

    @inline def associateTrackerConsumerFuture(params: AssociateTrackerConsumerRequest): Future[AssociateTrackerConsumerResponse] = service.associateTrackerConsumer(params).promise().toFuture
    @inline def batchDeleteGeofenceFuture(params: BatchDeleteGeofenceRequest): Future[BatchDeleteGeofenceResponse] = service.batchDeleteGeofence(params).promise().toFuture
    @inline def batchEvaluateGeofencesFuture(params: BatchEvaluateGeofencesRequest): Future[BatchEvaluateGeofencesResponse] = service.batchEvaluateGeofences(params).promise().toFuture
    @inline def batchGetDevicePositionFuture(params: BatchGetDevicePositionRequest): Future[BatchGetDevicePositionResponse] = service.batchGetDevicePosition(params).promise().toFuture
    @inline def batchPutGeofenceFuture(params: BatchPutGeofenceRequest): Future[BatchPutGeofenceResponse] = service.batchPutGeofence(params).promise().toFuture
    @inline def batchUpdateDevicePositionFuture(params: BatchUpdateDevicePositionRequest): Future[BatchUpdateDevicePositionResponse] = service.batchUpdateDevicePosition(params).promise().toFuture
    @inline def createGeofenceCollectionFuture(params: CreateGeofenceCollectionRequest): Future[CreateGeofenceCollectionResponse] = service.createGeofenceCollection(params).promise().toFuture
    @inline def createMapFuture(params: CreateMapRequest): Future[CreateMapResponse] = service.createMap(params).promise().toFuture
    @inline def createPlaceIndexFuture(params: CreatePlaceIndexRequest): Future[CreatePlaceIndexResponse] = service.createPlaceIndex(params).promise().toFuture
    @inline def createTrackerFuture(params: CreateTrackerRequest): Future[CreateTrackerResponse] = service.createTracker(params).promise().toFuture
    @inline def deleteGeofenceCollectionFuture(params: DeleteGeofenceCollectionRequest): Future[DeleteGeofenceCollectionResponse] = service.deleteGeofenceCollection(params).promise().toFuture
    @inline def deleteMapFuture(params: DeleteMapRequest): Future[DeleteMapResponse] = service.deleteMap(params).promise().toFuture
    @inline def deletePlaceIndexFuture(params: DeletePlaceIndexRequest): Future[DeletePlaceIndexResponse] = service.deletePlaceIndex(params).promise().toFuture
    @inline def deleteTrackerFuture(params: DeleteTrackerRequest): Future[DeleteTrackerResponse] = service.deleteTracker(params).promise().toFuture
    @inline def describeGeofenceCollectionFuture(params: DescribeGeofenceCollectionRequest): Future[DescribeGeofenceCollectionResponse] = service.describeGeofenceCollection(params).promise().toFuture
    @inline def describeMapFuture(params: DescribeMapRequest): Future[DescribeMapResponse] = service.describeMap(params).promise().toFuture
    @inline def describePlaceIndexFuture(params: DescribePlaceIndexRequest): Future[DescribePlaceIndexResponse] = service.describePlaceIndex(params).promise().toFuture
    @inline def describeTrackerFuture(params: DescribeTrackerRequest): Future[DescribeTrackerResponse] = service.describeTracker(params).promise().toFuture
    @inline def disassociateTrackerConsumerFuture(params: DisassociateTrackerConsumerRequest): Future[DisassociateTrackerConsumerResponse] = service.disassociateTrackerConsumer(params).promise().toFuture
    @inline def getDevicePositionFuture(params: GetDevicePositionRequest): Future[GetDevicePositionResponse] = service.getDevicePosition(params).promise().toFuture
    @inline def getDevicePositionHistoryFuture(params: GetDevicePositionHistoryRequest): Future[GetDevicePositionHistoryResponse] = service.getDevicePositionHistory(params).promise().toFuture
    @inline def getGeofenceFuture(params: GetGeofenceRequest): Future[GetGeofenceResponse] = service.getGeofence(params).promise().toFuture
    @inline def getMapGlyphsFuture(params: GetMapGlyphsRequest): Future[GetMapGlyphsResponse] = service.getMapGlyphs(params).promise().toFuture
    @inline def getMapSpritesFuture(params: GetMapSpritesRequest): Future[GetMapSpritesResponse] = service.getMapSprites(params).promise().toFuture
    @inline def getMapStyleDescriptorFuture(params: GetMapStyleDescriptorRequest): Future[GetMapStyleDescriptorResponse] = service.getMapStyleDescriptor(params).promise().toFuture
    @inline def getMapTileFuture(params: GetMapTileRequest): Future[GetMapTileResponse] = service.getMapTile(params).promise().toFuture
    @inline def listGeofenceCollectionsFuture(params: ListGeofenceCollectionsRequest): Future[ListGeofenceCollectionsResponse] = service.listGeofenceCollections(params).promise().toFuture
    @inline def listGeofencesFuture(params: ListGeofencesRequest): Future[ListGeofencesResponse] = service.listGeofences(params).promise().toFuture
    @inline def listMapsFuture(params: ListMapsRequest): Future[ListMapsResponse] = service.listMaps(params).promise().toFuture
    @inline def listPlaceIndexesFuture(params: ListPlaceIndexesRequest): Future[ListPlaceIndexesResponse] = service.listPlaceIndexes(params).promise().toFuture
    @inline def listTrackerConsumersFuture(params: ListTrackerConsumersRequest): Future[ListTrackerConsumersResponse] = service.listTrackerConsumers(params).promise().toFuture
    @inline def listTrackersFuture(params: ListTrackersRequest): Future[ListTrackersResponse] = service.listTrackers(params).promise().toFuture
    @inline def putGeofenceFuture(params: PutGeofenceRequest): Future[PutGeofenceResponse] = service.putGeofence(params).promise().toFuture
    @inline def searchPlaceIndexForPositionFuture(params: SearchPlaceIndexForPositionRequest): Future[SearchPlaceIndexForPositionResponse] = service.searchPlaceIndexForPosition(params).promise().toFuture
    @inline def searchPlaceIndexForTextFuture(params: SearchPlaceIndexForTextRequest): Future[SearchPlaceIndexForTextResponse] = service.searchPlaceIndexForText(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/location", JSImport.Namespace, "AWS.Location")
  class Location() extends js.Object {
    def this(config: AWSConfig) = this()

    def associateTrackerConsumer(params: AssociateTrackerConsumerRequest): Request[AssociateTrackerConsumerResponse] = js.native
    def batchDeleteGeofence(params: BatchDeleteGeofenceRequest): Request[BatchDeleteGeofenceResponse] = js.native
    def batchEvaluateGeofences(params: BatchEvaluateGeofencesRequest): Request[BatchEvaluateGeofencesResponse] = js.native
    def batchGetDevicePosition(params: BatchGetDevicePositionRequest): Request[BatchGetDevicePositionResponse] = js.native
    def batchPutGeofence(params: BatchPutGeofenceRequest): Request[BatchPutGeofenceResponse] = js.native
    def batchUpdateDevicePosition(params: BatchUpdateDevicePositionRequest): Request[BatchUpdateDevicePositionResponse] = js.native
    def createGeofenceCollection(params: CreateGeofenceCollectionRequest): Request[CreateGeofenceCollectionResponse] = js.native
    def createMap(params: CreateMapRequest): Request[CreateMapResponse] = js.native
    def createPlaceIndex(params: CreatePlaceIndexRequest): Request[CreatePlaceIndexResponse] = js.native
    def createTracker(params: CreateTrackerRequest): Request[CreateTrackerResponse] = js.native
    def deleteGeofenceCollection(params: DeleteGeofenceCollectionRequest): Request[DeleteGeofenceCollectionResponse] = js.native
    def deleteMap(params: DeleteMapRequest): Request[DeleteMapResponse] = js.native
    def deletePlaceIndex(params: DeletePlaceIndexRequest): Request[DeletePlaceIndexResponse] = js.native
    def deleteTracker(params: DeleteTrackerRequest): Request[DeleteTrackerResponse] = js.native
    def describeGeofenceCollection(params: DescribeGeofenceCollectionRequest): Request[DescribeGeofenceCollectionResponse] = js.native
    def describeMap(params: DescribeMapRequest): Request[DescribeMapResponse] = js.native
    def describePlaceIndex(params: DescribePlaceIndexRequest): Request[DescribePlaceIndexResponse] = js.native
    def describeTracker(params: DescribeTrackerRequest): Request[DescribeTrackerResponse] = js.native
    def disassociateTrackerConsumer(params: DisassociateTrackerConsumerRequest): Request[DisassociateTrackerConsumerResponse] = js.native
    def getDevicePosition(params: GetDevicePositionRequest): Request[GetDevicePositionResponse] = js.native
    def getDevicePositionHistory(params: GetDevicePositionHistoryRequest): Request[GetDevicePositionHistoryResponse] = js.native
    def getGeofence(params: GetGeofenceRequest): Request[GetGeofenceResponse] = js.native
    def getMapGlyphs(params: GetMapGlyphsRequest): Request[GetMapGlyphsResponse] = js.native
    def getMapSprites(params: GetMapSpritesRequest): Request[GetMapSpritesResponse] = js.native
    def getMapStyleDescriptor(params: GetMapStyleDescriptorRequest): Request[GetMapStyleDescriptorResponse] = js.native
    def getMapTile(params: GetMapTileRequest): Request[GetMapTileResponse] = js.native
    def listGeofenceCollections(params: ListGeofenceCollectionsRequest): Request[ListGeofenceCollectionsResponse] = js.native
    def listGeofences(params: ListGeofencesRequest): Request[ListGeofencesResponse] = js.native
    def listMaps(params: ListMapsRequest): Request[ListMapsResponse] = js.native
    def listPlaceIndexes(params: ListPlaceIndexesRequest): Request[ListPlaceIndexesResponse] = js.native
    def listTrackerConsumers(params: ListTrackerConsumersRequest): Request[ListTrackerConsumersResponse] = js.native
    def listTrackers(params: ListTrackersRequest): Request[ListTrackersResponse] = js.native
    def putGeofence(params: PutGeofenceRequest): Request[PutGeofenceResponse] = js.native
    def searchPlaceIndexForPosition(params: SearchPlaceIndexForPositionRequest): Request[SearchPlaceIndexForPositionResponse] = js.native
    def searchPlaceIndexForText(params: SearchPlaceIndexForTextRequest): Request[SearchPlaceIndexForTextResponse] = js.native
  }
  object Location {
    @inline implicit def toOps(service: Location): LocationOps = {
      new LocationOps(service)
    }
  }

  @js.native
  trait AssociateTrackerConsumerRequest extends js.Object {
    var ConsumerArn: Arn
    var TrackerName: ResourceName
  }

  object AssociateTrackerConsumerRequest {
    @inline
    def apply(
        ConsumerArn: Arn,
        TrackerName: ResourceName
    ): AssociateTrackerConsumerRequest = {
      val __obj = js.Dynamic.literal(
        "ConsumerArn" -> ConsumerArn.asInstanceOf[js.Any],
        "TrackerName" -> TrackerName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AssociateTrackerConsumerRequest]
    }
  }

  @js.native
  trait AssociateTrackerConsumerResponse extends js.Object

  object AssociateTrackerConsumerResponse {
    @inline
    def apply(): AssociateTrackerConsumerResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AssociateTrackerConsumerResponse]
    }
  }

  /** Contains error details for each geofence that failed to delete from the geofence collection.
    */
  @js.native
  trait BatchDeleteGeofenceError extends js.Object {
    var Error: BatchItemError
    var GeofenceId: Id
  }

  object BatchDeleteGeofenceError {
    @inline
    def apply(
        Error: BatchItemError,
        GeofenceId: Id
    ): BatchDeleteGeofenceError = {
      val __obj = js.Dynamic.literal(
        "Error" -> Error.asInstanceOf[js.Any],
        "GeofenceId" -> GeofenceId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[BatchDeleteGeofenceError]
    }
  }

  @js.native
  trait BatchDeleteGeofenceRequest extends js.Object {
    var CollectionName: ResourceName
    var GeofenceIds: BatchDeleteGeofenceRequestGeofenceIdsList
  }

  object BatchDeleteGeofenceRequest {
    @inline
    def apply(
        CollectionName: ResourceName,
        GeofenceIds: BatchDeleteGeofenceRequestGeofenceIdsList
    ): BatchDeleteGeofenceRequest = {
      val __obj = js.Dynamic.literal(
        "CollectionName" -> CollectionName.asInstanceOf[js.Any],
        "GeofenceIds" -> GeofenceIds.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[BatchDeleteGeofenceRequest]
    }
  }

  @js.native
  trait BatchDeleteGeofenceResponse extends js.Object {
    var Errors: BatchDeleteGeofenceErrorList
  }

  object BatchDeleteGeofenceResponse {
    @inline
    def apply(
        Errors: BatchDeleteGeofenceErrorList
    ): BatchDeleteGeofenceResponse = {
      val __obj = js.Dynamic.literal(
        "Errors" -> Errors.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[BatchDeleteGeofenceResponse]
    }
  }

  /** Contains error details for each device that failed to evaluate its position against the geofences in a given geofence collection.
    */
  @js.native
  trait BatchEvaluateGeofencesError extends js.Object {
    var DeviceId: Id
    var Error: BatchItemError
    var SampleTime: Timestamp
  }

  object BatchEvaluateGeofencesError {
    @inline
    def apply(
        DeviceId: Id,
        Error: BatchItemError,
        SampleTime: Timestamp
    ): BatchEvaluateGeofencesError = {
      val __obj = js.Dynamic.literal(
        "DeviceId" -> DeviceId.asInstanceOf[js.Any],
        "Error" -> Error.asInstanceOf[js.Any],
        "SampleTime" -> SampleTime.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[BatchEvaluateGeofencesError]
    }
  }

  @js.native
  trait BatchEvaluateGeofencesRequest extends js.Object {
    var CollectionName: ResourceName
    var DevicePositionUpdates: BatchEvaluateGeofencesRequestDevicePositionUpdatesList
  }

  object BatchEvaluateGeofencesRequest {
    @inline
    def apply(
        CollectionName: ResourceName,
        DevicePositionUpdates: BatchEvaluateGeofencesRequestDevicePositionUpdatesList
    ): BatchEvaluateGeofencesRequest = {
      val __obj = js.Dynamic.literal(
        "CollectionName" -> CollectionName.asInstanceOf[js.Any],
        "DevicePositionUpdates" -> DevicePositionUpdates.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[BatchEvaluateGeofencesRequest]
    }
  }

  @js.native
  trait BatchEvaluateGeofencesResponse extends js.Object {
    var Errors: BatchEvaluateGeofencesErrorList
  }

  object BatchEvaluateGeofencesResponse {
    @inline
    def apply(
        Errors: BatchEvaluateGeofencesErrorList
    ): BatchEvaluateGeofencesResponse = {
      val __obj = js.Dynamic.literal(
        "Errors" -> Errors.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[BatchEvaluateGeofencesResponse]
    }
  }

  /** Contains error details for each device that didn't return a position.
    */
  @js.native
  trait BatchGetDevicePositionError extends js.Object {
    var DeviceId: Id
    var Error: BatchItemError
  }

  object BatchGetDevicePositionError {
    @inline
    def apply(
        DeviceId: Id,
        Error: BatchItemError
    ): BatchGetDevicePositionError = {
      val __obj = js.Dynamic.literal(
        "DeviceId" -> DeviceId.asInstanceOf[js.Any],
        "Error" -> Error.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[BatchGetDevicePositionError]
    }
  }

  @js.native
  trait BatchGetDevicePositionRequest extends js.Object {
    var DeviceIds: BatchGetDevicePositionRequestDeviceIdsList
    var TrackerName: BatchGetDevicePositionRequestTrackerNameString
  }

  object BatchGetDevicePositionRequest {
    @inline
    def apply(
        DeviceIds: BatchGetDevicePositionRequestDeviceIdsList,
        TrackerName: BatchGetDevicePositionRequestTrackerNameString
    ): BatchGetDevicePositionRequest = {
      val __obj = js.Dynamic.literal(
        "DeviceIds" -> DeviceIds.asInstanceOf[js.Any],
        "TrackerName" -> TrackerName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[BatchGetDevicePositionRequest]
    }
  }

  @js.native
  trait BatchGetDevicePositionResponse extends js.Object {
    var DevicePositions: DevicePositionList
    var Errors: BatchGetDevicePositionErrorList
  }

  object BatchGetDevicePositionResponse {
    @inline
    def apply(
        DevicePositions: DevicePositionList,
        Errors: BatchGetDevicePositionErrorList
    ): BatchGetDevicePositionResponse = {
      val __obj = js.Dynamic.literal(
        "DevicePositions" -> DevicePositions.asInstanceOf[js.Any],
        "Errors" -> Errors.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[BatchGetDevicePositionResponse]
    }
  }

  /** Contains the batch request error details associated with the request.
    */
  @js.native
  trait BatchItemError extends js.Object {
    var Code: js.UndefOr[BatchItemErrorCode]
    var Message: js.UndefOr[String]
  }

  object BatchItemError {
    @inline
    def apply(
        Code: js.UndefOr[BatchItemErrorCode] = js.undefined,
        Message: js.UndefOr[String] = js.undefined
    ): BatchItemError = {
      val __obj = js.Dynamic.literal()
      Code.foreach(__v => __obj.updateDynamic("Code")(__v.asInstanceOf[js.Any]))
      Message.foreach(__v => __obj.updateDynamic("Message")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchItemError]
    }
  }

  /** Contains error details for each geofence that failed to be stored in a given geofence collection.
    */
  @js.native
  trait BatchPutGeofenceError extends js.Object {
    var Error: BatchItemError
    var GeofenceId: Id
  }

  object BatchPutGeofenceError {
    @inline
    def apply(
        Error: BatchItemError,
        GeofenceId: Id
    ): BatchPutGeofenceError = {
      val __obj = js.Dynamic.literal(
        "Error" -> Error.asInstanceOf[js.Any],
        "GeofenceId" -> GeofenceId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[BatchPutGeofenceError]
    }
  }

  @js.native
  trait BatchPutGeofenceRequest extends js.Object {
    var CollectionName: ResourceName
    var Entries: BatchPutGeofenceRequestEntriesList
  }

  object BatchPutGeofenceRequest {
    @inline
    def apply(
        CollectionName: ResourceName,
        Entries: BatchPutGeofenceRequestEntriesList
    ): BatchPutGeofenceRequest = {
      val __obj = js.Dynamic.literal(
        "CollectionName" -> CollectionName.asInstanceOf[js.Any],
        "Entries" -> Entries.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[BatchPutGeofenceRequest]
    }
  }

  /** Contains geofence geometry details.
    */
  @js.native
  trait BatchPutGeofenceRequestEntry extends js.Object {
    var GeofenceId: Id
    var Geometry: GeofenceGeometry
  }

  object BatchPutGeofenceRequestEntry {
    @inline
    def apply(
        GeofenceId: Id,
        Geometry: GeofenceGeometry
    ): BatchPutGeofenceRequestEntry = {
      val __obj = js.Dynamic.literal(
        "GeofenceId" -> GeofenceId.asInstanceOf[js.Any],
        "Geometry" -> Geometry.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[BatchPutGeofenceRequestEntry]
    }
  }

  @js.native
  trait BatchPutGeofenceResponse extends js.Object {
    var Errors: BatchPutGeofenceErrorList
    var Successes: BatchPutGeofenceSuccessList
  }

  object BatchPutGeofenceResponse {
    @inline
    def apply(
        Errors: BatchPutGeofenceErrorList,
        Successes: BatchPutGeofenceSuccessList
    ): BatchPutGeofenceResponse = {
      val __obj = js.Dynamic.literal(
        "Errors" -> Errors.asInstanceOf[js.Any],
        "Successes" -> Successes.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[BatchPutGeofenceResponse]
    }
  }

  /** Contains a summary of each geofence that was successfully stored in a given geofence collection.
    */
  @js.native
  trait BatchPutGeofenceSuccess extends js.Object {
    var CreateTime: Timestamp
    var GeofenceId: Id
    var UpdateTime: Timestamp
  }

  object BatchPutGeofenceSuccess {
    @inline
    def apply(
        CreateTime: Timestamp,
        GeofenceId: Id,
        UpdateTime: Timestamp
    ): BatchPutGeofenceSuccess = {
      val __obj = js.Dynamic.literal(
        "CreateTime" -> CreateTime.asInstanceOf[js.Any],
        "GeofenceId" -> GeofenceId.asInstanceOf[js.Any],
        "UpdateTime" -> UpdateTime.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[BatchPutGeofenceSuccess]
    }
  }

  /** Contains error details for each device that failed to update its position.
    */
  @js.native
  trait BatchUpdateDevicePositionError extends js.Object {
    var DeviceId: Id
    var Error: BatchItemError
    var SampleTime: Timestamp
  }

  object BatchUpdateDevicePositionError {
    @inline
    def apply(
        DeviceId: Id,
        Error: BatchItemError,
        SampleTime: Timestamp
    ): BatchUpdateDevicePositionError = {
      val __obj = js.Dynamic.literal(
        "DeviceId" -> DeviceId.asInstanceOf[js.Any],
        "Error" -> Error.asInstanceOf[js.Any],
        "SampleTime" -> SampleTime.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[BatchUpdateDevicePositionError]
    }
  }

  @js.native
  trait BatchUpdateDevicePositionRequest extends js.Object {
    var TrackerName: ResourceName
    var Updates: BatchUpdateDevicePositionRequestUpdatesList
  }

  object BatchUpdateDevicePositionRequest {
    @inline
    def apply(
        TrackerName: ResourceName,
        Updates: BatchUpdateDevicePositionRequestUpdatesList
    ): BatchUpdateDevicePositionRequest = {
      val __obj = js.Dynamic.literal(
        "TrackerName" -> TrackerName.asInstanceOf[js.Any],
        "Updates" -> Updates.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[BatchUpdateDevicePositionRequest]
    }
  }

  @js.native
  trait BatchUpdateDevicePositionResponse extends js.Object {
    var Errors: BatchUpdateDevicePositionErrorList
  }

  object BatchUpdateDevicePositionResponse {
    @inline
    def apply(
        Errors: BatchUpdateDevicePositionErrorList
    ): BatchUpdateDevicePositionResponse = {
      val __obj = js.Dynamic.literal(
        "Errors" -> Errors.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[BatchUpdateDevicePositionResponse]
    }
  }

  @js.native
  trait CreateGeofenceCollectionRequest extends js.Object {
    var CollectionName: ResourceName
    var PricingPlan: PricingPlan
    var Description: js.UndefOr[ResourceDescription]
    var PricingPlanDataSource: js.UndefOr[String]
  }

  object CreateGeofenceCollectionRequest {
    @inline
    def apply(
        CollectionName: ResourceName,
        PricingPlan: PricingPlan,
        Description: js.UndefOr[ResourceDescription] = js.undefined,
        PricingPlanDataSource: js.UndefOr[String] = js.undefined
    ): CreateGeofenceCollectionRequest = {
      val __obj = js.Dynamic.literal(
        "CollectionName" -> CollectionName.asInstanceOf[js.Any],
        "PricingPlan" -> PricingPlan.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      PricingPlanDataSource.foreach(__v => __obj.updateDynamic("PricingPlanDataSource")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateGeofenceCollectionRequest]
    }
  }

  @js.native
  trait CreateGeofenceCollectionResponse extends js.Object {
    var CollectionArn: Arn
    var CollectionName: ResourceName
    var CreateTime: Timestamp
  }

  object CreateGeofenceCollectionResponse {
    @inline
    def apply(
        CollectionArn: Arn,
        CollectionName: ResourceName,
        CreateTime: Timestamp
    ): CreateGeofenceCollectionResponse = {
      val __obj = js.Dynamic.literal(
        "CollectionArn" -> CollectionArn.asInstanceOf[js.Any],
        "CollectionName" -> CollectionName.asInstanceOf[js.Any],
        "CreateTime" -> CreateTime.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateGeofenceCollectionResponse]
    }
  }

  @js.native
  trait CreateMapRequest extends js.Object {
    var Configuration: MapConfiguration
    var MapName: ResourceName
    var PricingPlan: PricingPlan
    var Description: js.UndefOr[ResourceDescription]
  }

  object CreateMapRequest {
    @inline
    def apply(
        Configuration: MapConfiguration,
        MapName: ResourceName,
        PricingPlan: PricingPlan,
        Description: js.UndefOr[ResourceDescription] = js.undefined
    ): CreateMapRequest = {
      val __obj = js.Dynamic.literal(
        "Configuration" -> Configuration.asInstanceOf[js.Any],
        "MapName" -> MapName.asInstanceOf[js.Any],
        "PricingPlan" -> PricingPlan.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateMapRequest]
    }
  }

  @js.native
  trait CreateMapResponse extends js.Object {
    var CreateTime: Timestamp
    var MapArn: Arn
    var MapName: ResourceName
  }

  object CreateMapResponse {
    @inline
    def apply(
        CreateTime: Timestamp,
        MapArn: Arn,
        MapName: ResourceName
    ): CreateMapResponse = {
      val __obj = js.Dynamic.literal(
        "CreateTime" -> CreateTime.asInstanceOf[js.Any],
        "MapArn" -> MapArn.asInstanceOf[js.Any],
        "MapName" -> MapName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateMapResponse]
    }
  }

  @js.native
  trait CreatePlaceIndexRequest extends js.Object {
    var DataSource: String
    var IndexName: ResourceName
    var PricingPlan: PricingPlan
    var DataSourceConfiguration: js.UndefOr[DataSourceConfiguration]
    var Description: js.UndefOr[ResourceDescription]
  }

  object CreatePlaceIndexRequest {
    @inline
    def apply(
        DataSource: String,
        IndexName: ResourceName,
        PricingPlan: PricingPlan,
        DataSourceConfiguration: js.UndefOr[DataSourceConfiguration] = js.undefined,
        Description: js.UndefOr[ResourceDescription] = js.undefined
    ): CreatePlaceIndexRequest = {
      val __obj = js.Dynamic.literal(
        "DataSource" -> DataSource.asInstanceOf[js.Any],
        "IndexName" -> IndexName.asInstanceOf[js.Any],
        "PricingPlan" -> PricingPlan.asInstanceOf[js.Any]
      )

      DataSourceConfiguration.foreach(__v => __obj.updateDynamic("DataSourceConfiguration")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreatePlaceIndexRequest]
    }
  }

  @js.native
  trait CreatePlaceIndexResponse extends js.Object {
    var CreateTime: Timestamp
    var IndexArn: Arn
    var IndexName: ResourceName
  }

  object CreatePlaceIndexResponse {
    @inline
    def apply(
        CreateTime: Timestamp,
        IndexArn: Arn,
        IndexName: ResourceName
    ): CreatePlaceIndexResponse = {
      val __obj = js.Dynamic.literal(
        "CreateTime" -> CreateTime.asInstanceOf[js.Any],
        "IndexArn" -> IndexArn.asInstanceOf[js.Any],
        "IndexName" -> IndexName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreatePlaceIndexResponse]
    }
  }

  @js.native
  trait CreateTrackerRequest extends js.Object {
    var PricingPlan: PricingPlan
    var TrackerName: ResourceName
    var Description: js.UndefOr[ResourceDescription]
    var PricingPlanDataSource: js.UndefOr[String]
  }

  object CreateTrackerRequest {
    @inline
    def apply(
        PricingPlan: PricingPlan,
        TrackerName: ResourceName,
        Description: js.UndefOr[ResourceDescription] = js.undefined,
        PricingPlanDataSource: js.UndefOr[String] = js.undefined
    ): CreateTrackerRequest = {
      val __obj = js.Dynamic.literal(
        "PricingPlan" -> PricingPlan.asInstanceOf[js.Any],
        "TrackerName" -> TrackerName.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      PricingPlanDataSource.foreach(__v => __obj.updateDynamic("PricingPlanDataSource")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateTrackerRequest]
    }
  }

  @js.native
  trait CreateTrackerResponse extends js.Object {
    var CreateTime: Timestamp
    var TrackerArn: Arn
    var TrackerName: ResourceName
  }

  object CreateTrackerResponse {
    @inline
    def apply(
        CreateTime: Timestamp,
        TrackerArn: Arn,
        TrackerName: ResourceName
    ): CreateTrackerResponse = {
      val __obj = js.Dynamic.literal(
        "CreateTime" -> CreateTime.asInstanceOf[js.Any],
        "TrackerArn" -> TrackerArn.asInstanceOf[js.Any],
        "TrackerName" -> TrackerName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateTrackerResponse]
    }
  }

  /** Specifies the data storage option chosen for requesting Places.
    *
    * '''Note:'''By using Places, you agree that AWS may transmit your API queries to your selected third party provider for processing, which may be outside the AWS region you are currently using. Also, when using HERE as your data provider, you may not (a) use HERE Places for Asset Management, or (b) select the <code>Storage</code> option for the <code>IntendedUse</code> parameter when requesting Places in Japan. For more information, see the [[https://aws.amazon.com/service-terms/|AWS Service Terms]] for Amazon Location Service.
    */
  @js.native
  trait DataSourceConfiguration extends js.Object {
    var IntendedUse: js.UndefOr[IntendedUse]
  }

  object DataSourceConfiguration {
    @inline
    def apply(
        IntendedUse: js.UndefOr[IntendedUse] = js.undefined
    ): DataSourceConfiguration = {
      val __obj = js.Dynamic.literal()
      IntendedUse.foreach(__v => __obj.updateDynamic("IntendedUse")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DataSourceConfiguration]
    }
  }

  @js.native
  trait DeleteGeofenceCollectionRequest extends js.Object {
    var CollectionName: ResourceName
  }

  object DeleteGeofenceCollectionRequest {
    @inline
    def apply(
        CollectionName: ResourceName
    ): DeleteGeofenceCollectionRequest = {
      val __obj = js.Dynamic.literal(
        "CollectionName" -> CollectionName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteGeofenceCollectionRequest]
    }
  }

  @js.native
  trait DeleteGeofenceCollectionResponse extends js.Object

  object DeleteGeofenceCollectionResponse {
    @inline
    def apply(): DeleteGeofenceCollectionResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteGeofenceCollectionResponse]
    }
  }

  @js.native
  trait DeleteMapRequest extends js.Object {
    var MapName: ResourceName
  }

  object DeleteMapRequest {
    @inline
    def apply(
        MapName: ResourceName
    ): DeleteMapRequest = {
      val __obj = js.Dynamic.literal(
        "MapName" -> MapName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteMapRequest]
    }
  }

  @js.native
  trait DeleteMapResponse extends js.Object

  object DeleteMapResponse {
    @inline
    def apply(): DeleteMapResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteMapResponse]
    }
  }

  @js.native
  trait DeletePlaceIndexRequest extends js.Object {
    var IndexName: ResourceName
  }

  object DeletePlaceIndexRequest {
    @inline
    def apply(
        IndexName: ResourceName
    ): DeletePlaceIndexRequest = {
      val __obj = js.Dynamic.literal(
        "IndexName" -> IndexName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeletePlaceIndexRequest]
    }
  }

  @js.native
  trait DeletePlaceIndexResponse extends js.Object

  object DeletePlaceIndexResponse {
    @inline
    def apply(): DeletePlaceIndexResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeletePlaceIndexResponse]
    }
  }

  @js.native
  trait DeleteTrackerRequest extends js.Object {
    var TrackerName: ResourceName
  }

  object DeleteTrackerRequest {
    @inline
    def apply(
        TrackerName: ResourceName
    ): DeleteTrackerRequest = {
      val __obj = js.Dynamic.literal(
        "TrackerName" -> TrackerName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteTrackerRequest]
    }
  }

  @js.native
  trait DeleteTrackerResponse extends js.Object

  object DeleteTrackerResponse {
    @inline
    def apply(): DeleteTrackerResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteTrackerResponse]
    }
  }

  @js.native
  trait DescribeGeofenceCollectionRequest extends js.Object {
    var CollectionName: ResourceName
  }

  object DescribeGeofenceCollectionRequest {
    @inline
    def apply(
        CollectionName: ResourceName
    ): DescribeGeofenceCollectionRequest = {
      val __obj = js.Dynamic.literal(
        "CollectionName" -> CollectionName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeGeofenceCollectionRequest]
    }
  }

  @js.native
  trait DescribeGeofenceCollectionResponse extends js.Object {
    var CollectionArn: Arn
    var CollectionName: ResourceName
    var CreateTime: Timestamp
    var Description: ResourceDescription
    var PricingPlan: PricingPlan
    var UpdateTime: Timestamp
    var PricingPlanDataSource: js.UndefOr[String]
  }

  object DescribeGeofenceCollectionResponse {
    @inline
    def apply(
        CollectionArn: Arn,
        CollectionName: ResourceName,
        CreateTime: Timestamp,
        Description: ResourceDescription,
        PricingPlan: PricingPlan,
        UpdateTime: Timestamp,
        PricingPlanDataSource: js.UndefOr[String] = js.undefined
    ): DescribeGeofenceCollectionResponse = {
      val __obj = js.Dynamic.literal(
        "CollectionArn" -> CollectionArn.asInstanceOf[js.Any],
        "CollectionName" -> CollectionName.asInstanceOf[js.Any],
        "CreateTime" -> CreateTime.asInstanceOf[js.Any],
        "Description" -> Description.asInstanceOf[js.Any],
        "PricingPlan" -> PricingPlan.asInstanceOf[js.Any],
        "UpdateTime" -> UpdateTime.asInstanceOf[js.Any]
      )

      PricingPlanDataSource.foreach(__v => __obj.updateDynamic("PricingPlanDataSource")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeGeofenceCollectionResponse]
    }
  }

  @js.native
  trait DescribeMapRequest extends js.Object {
    var MapName: ResourceName
  }

  object DescribeMapRequest {
    @inline
    def apply(
        MapName: ResourceName
    ): DescribeMapRequest = {
      val __obj = js.Dynamic.literal(
        "MapName" -> MapName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeMapRequest]
    }
  }

  @js.native
  trait DescribeMapResponse extends js.Object {
    var Configuration: MapConfiguration
    var CreateTime: Timestamp
    var DataSource: String
    var Description: ResourceDescription
    var MapArn: Arn
    var MapName: ResourceName
    var PricingPlan: PricingPlan
    var UpdateTime: Timestamp
  }

  object DescribeMapResponse {
    @inline
    def apply(
        Configuration: MapConfiguration,
        CreateTime: Timestamp,
        DataSource: String,
        Description: ResourceDescription,
        MapArn: Arn,
        MapName: ResourceName,
        PricingPlan: PricingPlan,
        UpdateTime: Timestamp
    ): DescribeMapResponse = {
      val __obj = js.Dynamic.literal(
        "Configuration" -> Configuration.asInstanceOf[js.Any],
        "CreateTime" -> CreateTime.asInstanceOf[js.Any],
        "DataSource" -> DataSource.asInstanceOf[js.Any],
        "Description" -> Description.asInstanceOf[js.Any],
        "MapArn" -> MapArn.asInstanceOf[js.Any],
        "MapName" -> MapName.asInstanceOf[js.Any],
        "PricingPlan" -> PricingPlan.asInstanceOf[js.Any],
        "UpdateTime" -> UpdateTime.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeMapResponse]
    }
  }

  @js.native
  trait DescribePlaceIndexRequest extends js.Object {
    var IndexName: ResourceName
  }

  object DescribePlaceIndexRequest {
    @inline
    def apply(
        IndexName: ResourceName
    ): DescribePlaceIndexRequest = {
      val __obj = js.Dynamic.literal(
        "IndexName" -> IndexName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribePlaceIndexRequest]
    }
  }

  @js.native
  trait DescribePlaceIndexResponse extends js.Object {
    var CreateTime: Timestamp
    var DataSource: String
    var DataSourceConfiguration: DataSourceConfiguration
    var Description: ResourceDescription
    var IndexArn: Arn
    var IndexName: ResourceName
    var PricingPlan: PricingPlan
    var UpdateTime: Timestamp
  }

  object DescribePlaceIndexResponse {
    @inline
    def apply(
        CreateTime: Timestamp,
        DataSource: String,
        DataSourceConfiguration: DataSourceConfiguration,
        Description: ResourceDescription,
        IndexArn: Arn,
        IndexName: ResourceName,
        PricingPlan: PricingPlan,
        UpdateTime: Timestamp
    ): DescribePlaceIndexResponse = {
      val __obj = js.Dynamic.literal(
        "CreateTime" -> CreateTime.asInstanceOf[js.Any],
        "DataSource" -> DataSource.asInstanceOf[js.Any],
        "DataSourceConfiguration" -> DataSourceConfiguration.asInstanceOf[js.Any],
        "Description" -> Description.asInstanceOf[js.Any],
        "IndexArn" -> IndexArn.asInstanceOf[js.Any],
        "IndexName" -> IndexName.asInstanceOf[js.Any],
        "PricingPlan" -> PricingPlan.asInstanceOf[js.Any],
        "UpdateTime" -> UpdateTime.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribePlaceIndexResponse]
    }
  }

  @js.native
  trait DescribeTrackerRequest extends js.Object {
    var TrackerName: ResourceName
  }

  object DescribeTrackerRequest {
    @inline
    def apply(
        TrackerName: ResourceName
    ): DescribeTrackerRequest = {
      val __obj = js.Dynamic.literal(
        "TrackerName" -> TrackerName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeTrackerRequest]
    }
  }

  @js.native
  trait DescribeTrackerResponse extends js.Object {
    var CreateTime: Timestamp
    var Description: ResourceDescription
    var PricingPlan: PricingPlan
    var TrackerArn: Arn
    var TrackerName: ResourceName
    var UpdateTime: Timestamp
    var PricingPlanDataSource: js.UndefOr[String]
  }

  object DescribeTrackerResponse {
    @inline
    def apply(
        CreateTime: Timestamp,
        Description: ResourceDescription,
        PricingPlan: PricingPlan,
        TrackerArn: Arn,
        TrackerName: ResourceName,
        UpdateTime: Timestamp,
        PricingPlanDataSource: js.UndefOr[String] = js.undefined
    ): DescribeTrackerResponse = {
      val __obj = js.Dynamic.literal(
        "CreateTime" -> CreateTime.asInstanceOf[js.Any],
        "Description" -> Description.asInstanceOf[js.Any],
        "PricingPlan" -> PricingPlan.asInstanceOf[js.Any],
        "TrackerArn" -> TrackerArn.asInstanceOf[js.Any],
        "TrackerName" -> TrackerName.asInstanceOf[js.Any],
        "UpdateTime" -> UpdateTime.asInstanceOf[js.Any]
      )

      PricingPlanDataSource.foreach(__v => __obj.updateDynamic("PricingPlanDataSource")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeTrackerResponse]
    }
  }

  /** Contains the device position details.
    */
  @js.native
  trait DevicePosition extends js.Object {
    var Position: Position
    var ReceivedTime: Timestamp
    var SampleTime: Timestamp
    var DeviceId: js.UndefOr[Id]
  }

  object DevicePosition {
    @inline
    def apply(
        Position: Position,
        ReceivedTime: Timestamp,
        SampleTime: Timestamp,
        DeviceId: js.UndefOr[Id] = js.undefined
    ): DevicePosition = {
      val __obj = js.Dynamic.literal(
        "Position" -> Position.asInstanceOf[js.Any],
        "ReceivedTime" -> ReceivedTime.asInstanceOf[js.Any],
        "SampleTime" -> SampleTime.asInstanceOf[js.Any]
      )

      DeviceId.foreach(__v => __obj.updateDynamic("DeviceId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DevicePosition]
    }
  }

  /** Contains the position update details for a device.
    */
  @js.native
  trait DevicePositionUpdate extends js.Object {
    var DeviceId: Id
    var Position: Position
    var SampleTime: Timestamp
  }

  object DevicePositionUpdate {
    @inline
    def apply(
        DeviceId: Id,
        Position: Position,
        SampleTime: Timestamp
    ): DevicePositionUpdate = {
      val __obj = js.Dynamic.literal(
        "DeviceId" -> DeviceId.asInstanceOf[js.Any],
        "Position" -> Position.asInstanceOf[js.Any],
        "SampleTime" -> SampleTime.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DevicePositionUpdate]
    }
  }

  @js.native
  trait DisassociateTrackerConsumerRequest extends js.Object {
    var ConsumerArn: Arn
    var TrackerName: ResourceName
  }

  object DisassociateTrackerConsumerRequest {
    @inline
    def apply(
        ConsumerArn: Arn,
        TrackerName: ResourceName
    ): DisassociateTrackerConsumerRequest = {
      val __obj = js.Dynamic.literal(
        "ConsumerArn" -> ConsumerArn.asInstanceOf[js.Any],
        "TrackerName" -> TrackerName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DisassociateTrackerConsumerRequest]
    }
  }

  @js.native
  trait DisassociateTrackerConsumerResponse extends js.Object

  object DisassociateTrackerConsumerResponse {
    @inline
    def apply(): DisassociateTrackerConsumerResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DisassociateTrackerConsumerResponse]
    }
  }

  /** Contains the geofence geometry details.
    *
    * '''Note:'''Amazon Location does not currently support polygons with holes, multipolygons, polygons that are wound clockwise, or that cross the antimeridian.
    */
  @js.native
  trait GeofenceGeometry extends js.Object {
    var Polygon: js.UndefOr[LinearRings]
  }

  object GeofenceGeometry {
    @inline
    def apply(
        Polygon: js.UndefOr[LinearRings] = js.undefined
    ): GeofenceGeometry = {
      val __obj = js.Dynamic.literal()
      Polygon.foreach(__v => __obj.updateDynamic("Polygon")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GeofenceGeometry]
    }
  }

  @js.native
  trait GetDevicePositionHistoryRequest extends js.Object {
    var DeviceId: Id
    var TrackerName: ResourceName
    var EndTimeExclusive: js.UndefOr[Timestamp]
    var NextToken: js.UndefOr[Token]
    var StartTimeInclusive: js.UndefOr[Timestamp]
  }

  object GetDevicePositionHistoryRequest {
    @inline
    def apply(
        DeviceId: Id,
        TrackerName: ResourceName,
        EndTimeExclusive: js.UndefOr[Timestamp] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined,
        StartTimeInclusive: js.UndefOr[Timestamp] = js.undefined
    ): GetDevicePositionHistoryRequest = {
      val __obj = js.Dynamic.literal(
        "DeviceId" -> DeviceId.asInstanceOf[js.Any],
        "TrackerName" -> TrackerName.asInstanceOf[js.Any]
      )

      EndTimeExclusive.foreach(__v => __obj.updateDynamic("EndTimeExclusive")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      StartTimeInclusive.foreach(__v => __obj.updateDynamic("StartTimeInclusive")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDevicePositionHistoryRequest]
    }
  }

  @js.native
  trait GetDevicePositionHistoryResponse extends js.Object {
    var DevicePositions: DevicePositionList
    var NextToken: js.UndefOr[Token]
  }

  object GetDevicePositionHistoryResponse {
    @inline
    def apply(
        DevicePositions: DevicePositionList,
        NextToken: js.UndefOr[Token] = js.undefined
    ): GetDevicePositionHistoryResponse = {
      val __obj = js.Dynamic.literal(
        "DevicePositions" -> DevicePositions.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDevicePositionHistoryResponse]
    }
  }

  @js.native
  trait GetDevicePositionRequest extends js.Object {
    var DeviceId: Id
    var TrackerName: ResourceName
  }

  object GetDevicePositionRequest {
    @inline
    def apply(
        DeviceId: Id,
        TrackerName: ResourceName
    ): GetDevicePositionRequest = {
      val __obj = js.Dynamic.literal(
        "DeviceId" -> DeviceId.asInstanceOf[js.Any],
        "TrackerName" -> TrackerName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetDevicePositionRequest]
    }
  }

  @js.native
  trait GetDevicePositionResponse extends js.Object {
    var Position: Position
    var ReceivedTime: Timestamp
    var SampleTime: Timestamp
    var DeviceId: js.UndefOr[Id]
  }

  object GetDevicePositionResponse {
    @inline
    def apply(
        Position: Position,
        ReceivedTime: Timestamp,
        SampleTime: Timestamp,
        DeviceId: js.UndefOr[Id] = js.undefined
    ): GetDevicePositionResponse = {
      val __obj = js.Dynamic.literal(
        "Position" -> Position.asInstanceOf[js.Any],
        "ReceivedTime" -> ReceivedTime.asInstanceOf[js.Any],
        "SampleTime" -> SampleTime.asInstanceOf[js.Any]
      )

      DeviceId.foreach(__v => __obj.updateDynamic("DeviceId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDevicePositionResponse]
    }
  }

  @js.native
  trait GetGeofenceRequest extends js.Object {
    var CollectionName: ResourceName
    var GeofenceId: Id
  }

  object GetGeofenceRequest {
    @inline
    def apply(
        CollectionName: ResourceName,
        GeofenceId: Id
    ): GetGeofenceRequest = {
      val __obj = js.Dynamic.literal(
        "CollectionName" -> CollectionName.asInstanceOf[js.Any],
        "GeofenceId" -> GeofenceId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetGeofenceRequest]
    }
  }

  @js.native
  trait GetGeofenceResponse extends js.Object {
    var CreateTime: Timestamp
    var GeofenceId: Id
    var Geometry: GeofenceGeometry
    var Status: String
    var UpdateTime: Timestamp
  }

  object GetGeofenceResponse {
    @inline
    def apply(
        CreateTime: Timestamp,
        GeofenceId: Id,
        Geometry: GeofenceGeometry,
        Status: String,
        UpdateTime: Timestamp
    ): GetGeofenceResponse = {
      val __obj = js.Dynamic.literal(
        "CreateTime" -> CreateTime.asInstanceOf[js.Any],
        "GeofenceId" -> GeofenceId.asInstanceOf[js.Any],
        "Geometry" -> Geometry.asInstanceOf[js.Any],
        "Status" -> Status.asInstanceOf[js.Any],
        "UpdateTime" -> UpdateTime.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetGeofenceResponse]
    }
  }

  @js.native
  trait GetMapGlyphsRequest extends js.Object {
    var FontStack: String
    var FontUnicodeRange: GetMapGlyphsRequestFontUnicodeRangeString
    var MapName: ResourceName
  }

  object GetMapGlyphsRequest {
    @inline
    def apply(
        FontStack: String,
        FontUnicodeRange: GetMapGlyphsRequestFontUnicodeRangeString,
        MapName: ResourceName
    ): GetMapGlyphsRequest = {
      val __obj = js.Dynamic.literal(
        "FontStack" -> FontStack.asInstanceOf[js.Any],
        "FontUnicodeRange" -> FontUnicodeRange.asInstanceOf[js.Any],
        "MapName" -> MapName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetMapGlyphsRequest]
    }
  }

  @js.native
  trait GetMapGlyphsResponse extends js.Object {
    var Blob: js.UndefOr[Blob]
    var ContentType: js.UndefOr[String]
  }

  object GetMapGlyphsResponse {
    @inline
    def apply(
        Blob: js.UndefOr[Blob] = js.undefined,
        ContentType: js.UndefOr[String] = js.undefined
    ): GetMapGlyphsResponse = {
      val __obj = js.Dynamic.literal()
      Blob.foreach(__v => __obj.updateDynamic("Blob")(__v.asInstanceOf[js.Any]))
      ContentType.foreach(__v => __obj.updateDynamic("ContentType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetMapGlyphsResponse]
    }
  }

  @js.native
  trait GetMapSpritesRequest extends js.Object {
    var FileName: GetMapSpritesRequestFileNameString
    var MapName: ResourceName
  }

  object GetMapSpritesRequest {
    @inline
    def apply(
        FileName: GetMapSpritesRequestFileNameString,
        MapName: ResourceName
    ): GetMapSpritesRequest = {
      val __obj = js.Dynamic.literal(
        "FileName" -> FileName.asInstanceOf[js.Any],
        "MapName" -> MapName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetMapSpritesRequest]
    }
  }

  @js.native
  trait GetMapSpritesResponse extends js.Object {
    var Blob: js.UndefOr[Blob]
    var ContentType: js.UndefOr[String]
  }

  object GetMapSpritesResponse {
    @inline
    def apply(
        Blob: js.UndefOr[Blob] = js.undefined,
        ContentType: js.UndefOr[String] = js.undefined
    ): GetMapSpritesResponse = {
      val __obj = js.Dynamic.literal()
      Blob.foreach(__v => __obj.updateDynamic("Blob")(__v.asInstanceOf[js.Any]))
      ContentType.foreach(__v => __obj.updateDynamic("ContentType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetMapSpritesResponse]
    }
  }

  @js.native
  trait GetMapStyleDescriptorRequest extends js.Object {
    var MapName: ResourceName
  }

  object GetMapStyleDescriptorRequest {
    @inline
    def apply(
        MapName: ResourceName
    ): GetMapStyleDescriptorRequest = {
      val __obj = js.Dynamic.literal(
        "MapName" -> MapName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetMapStyleDescriptorRequest]
    }
  }

  @js.native
  trait GetMapStyleDescriptorResponse extends js.Object {
    var Blob: js.UndefOr[Blob]
    var ContentType: js.UndefOr[String]
  }

  object GetMapStyleDescriptorResponse {
    @inline
    def apply(
        Blob: js.UndefOr[Blob] = js.undefined,
        ContentType: js.UndefOr[String] = js.undefined
    ): GetMapStyleDescriptorResponse = {
      val __obj = js.Dynamic.literal()
      Blob.foreach(__v => __obj.updateDynamic("Blob")(__v.asInstanceOf[js.Any]))
      ContentType.foreach(__v => __obj.updateDynamic("ContentType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetMapStyleDescriptorResponse]
    }
  }

  @js.native
  trait GetMapTileRequest extends js.Object {
    var MapName: ResourceName
    var X: GetMapTileRequestXString
    var Y: GetMapTileRequestYString
    var Z: GetMapTileRequestZString
  }

  object GetMapTileRequest {
    @inline
    def apply(
        MapName: ResourceName,
        X: GetMapTileRequestXString,
        Y: GetMapTileRequestYString,
        Z: GetMapTileRequestZString
    ): GetMapTileRequest = {
      val __obj = js.Dynamic.literal(
        "MapName" -> MapName.asInstanceOf[js.Any],
        "X" -> X.asInstanceOf[js.Any],
        "Y" -> Y.asInstanceOf[js.Any],
        "Z" -> Z.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetMapTileRequest]
    }
  }

  @js.native
  trait GetMapTileResponse extends js.Object {
    var Blob: js.UndefOr[Blob]
    var ContentType: js.UndefOr[String]
  }

  object GetMapTileResponse {
    @inline
    def apply(
        Blob: js.UndefOr[Blob] = js.undefined,
        ContentType: js.UndefOr[String] = js.undefined
    ): GetMapTileResponse = {
      val __obj = js.Dynamic.literal()
      Blob.foreach(__v => __obj.updateDynamic("Blob")(__v.asInstanceOf[js.Any]))
      ContentType.foreach(__v => __obj.updateDynamic("ContentType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetMapTileResponse]
    }
  }

  @js.native
  trait ListGeofenceCollectionsRequest extends js.Object {
    var MaxResults: js.UndefOr[ListGeofenceCollectionsRequestMaxResultsInteger]
    var NextToken: js.UndefOr[Token]
  }

  object ListGeofenceCollectionsRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[ListGeofenceCollectionsRequestMaxResultsInteger] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined
    ): ListGeofenceCollectionsRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListGeofenceCollectionsRequest]
    }
  }

  @js.native
  trait ListGeofenceCollectionsResponse extends js.Object {
    var Entries: ListGeofenceCollectionsResponseEntryList
    var NextToken: js.UndefOr[Token]
  }

  object ListGeofenceCollectionsResponse {
    @inline
    def apply(
        Entries: ListGeofenceCollectionsResponseEntryList,
        NextToken: js.UndefOr[Token] = js.undefined
    ): ListGeofenceCollectionsResponse = {
      val __obj = js.Dynamic.literal(
        "Entries" -> Entries.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListGeofenceCollectionsResponse]
    }
  }

  /** Contains the geofence collection details.
    */
  @js.native
  trait ListGeofenceCollectionsResponseEntry extends js.Object {
    var CollectionName: ResourceName
    var CreateTime: Timestamp
    var Description: ResourceDescription
    var PricingPlan: PricingPlan
    var UpdateTime: Timestamp
    var PricingPlanDataSource: js.UndefOr[String]
  }

  object ListGeofenceCollectionsResponseEntry {
    @inline
    def apply(
        CollectionName: ResourceName,
        CreateTime: Timestamp,
        Description: ResourceDescription,
        PricingPlan: PricingPlan,
        UpdateTime: Timestamp,
        PricingPlanDataSource: js.UndefOr[String] = js.undefined
    ): ListGeofenceCollectionsResponseEntry = {
      val __obj = js.Dynamic.literal(
        "CollectionName" -> CollectionName.asInstanceOf[js.Any],
        "CreateTime" -> CreateTime.asInstanceOf[js.Any],
        "Description" -> Description.asInstanceOf[js.Any],
        "PricingPlan" -> PricingPlan.asInstanceOf[js.Any],
        "UpdateTime" -> UpdateTime.asInstanceOf[js.Any]
      )

      PricingPlanDataSource.foreach(__v => __obj.updateDynamic("PricingPlanDataSource")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListGeofenceCollectionsResponseEntry]
    }
  }

  /** Contains a list of geofences stored in a given geofence collection.
    */
  @js.native
  trait ListGeofenceResponseEntry extends js.Object {
    var CreateTime: Timestamp
    var GeofenceId: Id
    var Geometry: GeofenceGeometry
    var Status: String
    var UpdateTime: Timestamp
  }

  object ListGeofenceResponseEntry {
    @inline
    def apply(
        CreateTime: Timestamp,
        GeofenceId: Id,
        Geometry: GeofenceGeometry,
        Status: String,
        UpdateTime: Timestamp
    ): ListGeofenceResponseEntry = {
      val __obj = js.Dynamic.literal(
        "CreateTime" -> CreateTime.asInstanceOf[js.Any],
        "GeofenceId" -> GeofenceId.asInstanceOf[js.Any],
        "Geometry" -> Geometry.asInstanceOf[js.Any],
        "Status" -> Status.asInstanceOf[js.Any],
        "UpdateTime" -> UpdateTime.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ListGeofenceResponseEntry]
    }
  }

  @js.native
  trait ListGeofencesRequest extends js.Object {
    var CollectionName: ResourceName
    var NextToken: js.UndefOr[Token]
  }

  object ListGeofencesRequest {
    @inline
    def apply(
        CollectionName: ResourceName,
        NextToken: js.UndefOr[Token] = js.undefined
    ): ListGeofencesRequest = {
      val __obj = js.Dynamic.literal(
        "CollectionName" -> CollectionName.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListGeofencesRequest]
    }
  }

  @js.native
  trait ListGeofencesResponse extends js.Object {
    var Entries: ListGeofenceResponseEntryList
    var NextToken: js.UndefOr[Token]
  }

  object ListGeofencesResponse {
    @inline
    def apply(
        Entries: ListGeofenceResponseEntryList,
        NextToken: js.UndefOr[Token] = js.undefined
    ): ListGeofencesResponse = {
      val __obj = js.Dynamic.literal(
        "Entries" -> Entries.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListGeofencesResponse]
    }
  }

  @js.native
  trait ListMapsRequest extends js.Object {
    var MaxResults: js.UndefOr[ListMapsRequestMaxResultsInteger]
    var NextToken: js.UndefOr[Token]
  }

  object ListMapsRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[ListMapsRequestMaxResultsInteger] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined
    ): ListMapsRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListMapsRequest]
    }
  }

  @js.native
  trait ListMapsResponse extends js.Object {
    var Entries: ListMapsResponseEntryList
    var NextToken: js.UndefOr[Token]
  }

  object ListMapsResponse {
    @inline
    def apply(
        Entries: ListMapsResponseEntryList,
        NextToken: js.UndefOr[Token] = js.undefined
    ): ListMapsResponse = {
      val __obj = js.Dynamic.literal(
        "Entries" -> Entries.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListMapsResponse]
    }
  }

  /** Contains details of an existing map resource in your AWS account.
    */
  @js.native
  trait ListMapsResponseEntry extends js.Object {
    var CreateTime: Timestamp
    var DataSource: String
    var Description: ResourceDescription
    var MapName: ResourceName
    var PricingPlan: PricingPlan
    var UpdateTime: Timestamp
  }

  object ListMapsResponseEntry {
    @inline
    def apply(
        CreateTime: Timestamp,
        DataSource: String,
        Description: ResourceDescription,
        MapName: ResourceName,
        PricingPlan: PricingPlan,
        UpdateTime: Timestamp
    ): ListMapsResponseEntry = {
      val __obj = js.Dynamic.literal(
        "CreateTime" -> CreateTime.asInstanceOf[js.Any],
        "DataSource" -> DataSource.asInstanceOf[js.Any],
        "Description" -> Description.asInstanceOf[js.Any],
        "MapName" -> MapName.asInstanceOf[js.Any],
        "PricingPlan" -> PricingPlan.asInstanceOf[js.Any],
        "UpdateTime" -> UpdateTime.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ListMapsResponseEntry]
    }
  }

  @js.native
  trait ListPlaceIndexesRequest extends js.Object {
    var MaxResults: js.UndefOr[ListPlaceIndexesRequestMaxResultsInteger]
    var NextToken: js.UndefOr[Token]
  }

  object ListPlaceIndexesRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[ListPlaceIndexesRequestMaxResultsInteger] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined
    ): ListPlaceIndexesRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPlaceIndexesRequest]
    }
  }

  @js.native
  trait ListPlaceIndexesResponse extends js.Object {
    var Entries: ListPlaceIndexesResponseEntryList
    var NextToken: js.UndefOr[Token]
  }

  object ListPlaceIndexesResponse {
    @inline
    def apply(
        Entries: ListPlaceIndexesResponseEntryList,
        NextToken: js.UndefOr[Token] = js.undefined
    ): ListPlaceIndexesResponse = {
      val __obj = js.Dynamic.literal(
        "Entries" -> Entries.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPlaceIndexesResponse]
    }
  }

  /** A Place index resource listed in your AWS account.
    */
  @js.native
  trait ListPlaceIndexesResponseEntry extends js.Object {
    var CreateTime: Timestamp
    var DataSource: String
    var Description: ResourceDescription
    var IndexName: ResourceName
    var PricingPlan: PricingPlan
    var UpdateTime: Timestamp
  }

  object ListPlaceIndexesResponseEntry {
    @inline
    def apply(
        CreateTime: Timestamp,
        DataSource: String,
        Description: ResourceDescription,
        IndexName: ResourceName,
        PricingPlan: PricingPlan,
        UpdateTime: Timestamp
    ): ListPlaceIndexesResponseEntry = {
      val __obj = js.Dynamic.literal(
        "CreateTime" -> CreateTime.asInstanceOf[js.Any],
        "DataSource" -> DataSource.asInstanceOf[js.Any],
        "Description" -> Description.asInstanceOf[js.Any],
        "IndexName" -> IndexName.asInstanceOf[js.Any],
        "PricingPlan" -> PricingPlan.asInstanceOf[js.Any],
        "UpdateTime" -> UpdateTime.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ListPlaceIndexesResponseEntry]
    }
  }

  @js.native
  trait ListTrackerConsumersRequest extends js.Object {
    var TrackerName: ResourceName
    var MaxResults: js.UndefOr[ListTrackerConsumersRequestMaxResultsInteger]
    var NextToken: js.UndefOr[Token]
  }

  object ListTrackerConsumersRequest {
    @inline
    def apply(
        TrackerName: ResourceName,
        MaxResults: js.UndefOr[ListTrackerConsumersRequestMaxResultsInteger] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined
    ): ListTrackerConsumersRequest = {
      val __obj = js.Dynamic.literal(
        "TrackerName" -> TrackerName.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTrackerConsumersRequest]
    }
  }

  @js.native
  trait ListTrackerConsumersResponse extends js.Object {
    var ConsumerArns: ArnList
    var NextToken: js.UndefOr[Token]
  }

  object ListTrackerConsumersResponse {
    @inline
    def apply(
        ConsumerArns: ArnList,
        NextToken: js.UndefOr[Token] = js.undefined
    ): ListTrackerConsumersResponse = {
      val __obj = js.Dynamic.literal(
        "ConsumerArns" -> ConsumerArns.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTrackerConsumersResponse]
    }
  }

  @js.native
  trait ListTrackersRequest extends js.Object {
    var MaxResults: js.UndefOr[ListTrackersRequestMaxResultsInteger]
    var NextToken: js.UndefOr[Token]
  }

  object ListTrackersRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[ListTrackersRequestMaxResultsInteger] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined
    ): ListTrackersRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTrackersRequest]
    }
  }

  @js.native
  trait ListTrackersResponse extends js.Object {
    var Entries: ListTrackersResponseEntryList
    var NextToken: js.UndefOr[Token]
  }

  object ListTrackersResponse {
    @inline
    def apply(
        Entries: ListTrackersResponseEntryList,
        NextToken: js.UndefOr[Token] = js.undefined
    ): ListTrackersResponse = {
      val __obj = js.Dynamic.literal(
        "Entries" -> Entries.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTrackersResponse]
    }
  }

  /** Contains the tracker resource details.
    */
  @js.native
  trait ListTrackersResponseEntry extends js.Object {
    var CreateTime: Timestamp
    var Description: ResourceDescription
    var PricingPlan: PricingPlan
    var TrackerName: ResourceName
    var UpdateTime: Timestamp
    var PricingPlanDataSource: js.UndefOr[String]
  }

  object ListTrackersResponseEntry {
    @inline
    def apply(
        CreateTime: Timestamp,
        Description: ResourceDescription,
        PricingPlan: PricingPlan,
        TrackerName: ResourceName,
        UpdateTime: Timestamp,
        PricingPlanDataSource: js.UndefOr[String] = js.undefined
    ): ListTrackersResponseEntry = {
      val __obj = js.Dynamic.literal(
        "CreateTime" -> CreateTime.asInstanceOf[js.Any],
        "Description" -> Description.asInstanceOf[js.Any],
        "PricingPlan" -> PricingPlan.asInstanceOf[js.Any],
        "TrackerName" -> TrackerName.asInstanceOf[js.Any],
        "UpdateTime" -> UpdateTime.asInstanceOf[js.Any]
      )

      PricingPlanDataSource.foreach(__v => __obj.updateDynamic("PricingPlanDataSource")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTrackersResponseEntry]
    }
  }

  /** Specifies the map tile style selected from an available provider.
    */
  @js.native
  trait MapConfiguration extends js.Object {
    var Style: MapStyle
  }

  object MapConfiguration {
    @inline
    def apply(
        Style: MapStyle
    ): MapConfiguration = {
      val __obj = js.Dynamic.literal(
        "Style" -> Style.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[MapConfiguration]
    }
  }

  /** Contains details about addresses or points of interest that match the search criteria.
    */
  @js.native
  trait Place extends js.Object {
    var Geometry: PlaceGeometry
    var AddressNumber: js.UndefOr[String]
    var Country: js.UndefOr[String]
    var Label: js.UndefOr[String]
    var Municipality: js.UndefOr[String]
    var Neighborhood: js.UndefOr[String]
    var PostalCode: js.UndefOr[String]
    var Region: js.UndefOr[String]
    var Street: js.UndefOr[String]
    var SubRegion: js.UndefOr[String]
  }

  object Place {
    @inline
    def apply(
        Geometry: PlaceGeometry,
        AddressNumber: js.UndefOr[String] = js.undefined,
        Country: js.UndefOr[String] = js.undefined,
        Label: js.UndefOr[String] = js.undefined,
        Municipality: js.UndefOr[String] = js.undefined,
        Neighborhood: js.UndefOr[String] = js.undefined,
        PostalCode: js.UndefOr[String] = js.undefined,
        Region: js.UndefOr[String] = js.undefined,
        Street: js.UndefOr[String] = js.undefined,
        SubRegion: js.UndefOr[String] = js.undefined
    ): Place = {
      val __obj = js.Dynamic.literal(
        "Geometry" -> Geometry.asInstanceOf[js.Any]
      )

      AddressNumber.foreach(__v => __obj.updateDynamic("AddressNumber")(__v.asInstanceOf[js.Any]))
      Country.foreach(__v => __obj.updateDynamic("Country")(__v.asInstanceOf[js.Any]))
      Label.foreach(__v => __obj.updateDynamic("Label")(__v.asInstanceOf[js.Any]))
      Municipality.foreach(__v => __obj.updateDynamic("Municipality")(__v.asInstanceOf[js.Any]))
      Neighborhood.foreach(__v => __obj.updateDynamic("Neighborhood")(__v.asInstanceOf[js.Any]))
      PostalCode.foreach(__v => __obj.updateDynamic("PostalCode")(__v.asInstanceOf[js.Any]))
      Region.foreach(__v => __obj.updateDynamic("Region")(__v.asInstanceOf[js.Any]))
      Street.foreach(__v => __obj.updateDynamic("Street")(__v.asInstanceOf[js.Any]))
      SubRegion.foreach(__v => __obj.updateDynamic("SubRegion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Place]
    }
  }

  /** Places uses a point geometry to specify a location or a Place.
    */
  @js.native
  trait PlaceGeometry extends js.Object {
    var Point: js.UndefOr[Position]
  }

  object PlaceGeometry {
    @inline
    def apply(
        Point: js.UndefOr[Position] = js.undefined
    ): PlaceGeometry = {
      val __obj = js.Dynamic.literal()
      Point.foreach(__v => __obj.updateDynamic("Point")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PlaceGeometry]
    }
  }

  @js.native
  trait PutGeofenceRequest extends js.Object {
    var CollectionName: ResourceName
    var GeofenceId: Id
    var Geometry: GeofenceGeometry
  }

  object PutGeofenceRequest {
    @inline
    def apply(
        CollectionName: ResourceName,
        GeofenceId: Id,
        Geometry: GeofenceGeometry
    ): PutGeofenceRequest = {
      val __obj = js.Dynamic.literal(
        "CollectionName" -> CollectionName.asInstanceOf[js.Any],
        "GeofenceId" -> GeofenceId.asInstanceOf[js.Any],
        "Geometry" -> Geometry.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[PutGeofenceRequest]
    }
  }

  @js.native
  trait PutGeofenceResponse extends js.Object {
    var CreateTime: Timestamp
    var GeofenceId: Id
    var UpdateTime: Timestamp
  }

  object PutGeofenceResponse {
    @inline
    def apply(
        CreateTime: Timestamp,
        GeofenceId: Id,
        UpdateTime: Timestamp
    ): PutGeofenceResponse = {
      val __obj = js.Dynamic.literal(
        "CreateTime" -> CreateTime.asInstanceOf[js.Any],
        "GeofenceId" -> GeofenceId.asInstanceOf[js.Any],
        "UpdateTime" -> UpdateTime.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[PutGeofenceResponse]
    }
  }

  /** Specifies a single point of interest, or Place as a result of a search query obtained from a dataset configured in the Place index Resource.
    */
  @js.native
  trait SearchForPositionResult extends js.Object {
    var Place: Place
  }

  object SearchForPositionResult {
    @inline
    def apply(
        Place: Place
    ): SearchForPositionResult = {
      val __obj = js.Dynamic.literal(
        "Place" -> Place.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[SearchForPositionResult]
    }
  }

  /** Contains relevant Places returned by calling <code>SearchPlaceIndexForText</code>.
    */
  @js.native
  trait SearchForTextResult extends js.Object {
    var Place: Place
  }

  object SearchForTextResult {
    @inline
    def apply(
        Place: Place
    ): SearchForTextResult = {
      val __obj = js.Dynamic.literal(
        "Place" -> Place.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[SearchForTextResult]
    }
  }

  @js.native
  trait SearchPlaceIndexForPositionRequest extends js.Object {
    var IndexName: ResourceName
    var Position: Position
    var MaxResults: js.UndefOr[PlaceIndexSearchResultLimit]
  }

  object SearchPlaceIndexForPositionRequest {
    @inline
    def apply(
        IndexName: ResourceName,
        Position: Position,
        MaxResults: js.UndefOr[PlaceIndexSearchResultLimit] = js.undefined
    ): SearchPlaceIndexForPositionRequest = {
      val __obj = js.Dynamic.literal(
        "IndexName" -> IndexName.asInstanceOf[js.Any],
        "Position" -> Position.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SearchPlaceIndexForPositionRequest]
    }
  }

  @js.native
  trait SearchPlaceIndexForPositionResponse extends js.Object {
    var Results: SearchForPositionResultList
    var Summary: SearchPlaceIndexForPositionSummary
  }

  object SearchPlaceIndexForPositionResponse {
    @inline
    def apply(
        Results: SearchForPositionResultList,
        Summary: SearchPlaceIndexForPositionSummary
    ): SearchPlaceIndexForPositionResponse = {
      val __obj = js.Dynamic.literal(
        "Results" -> Results.asInstanceOf[js.Any],
        "Summary" -> Summary.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[SearchPlaceIndexForPositionResponse]
    }
  }

  /** A summary of the reverse geocoding request sent using <code>SearchPlaceIndexForPosition</code>.
    */
  @js.native
  trait SearchPlaceIndexForPositionSummary extends js.Object {
    var DataSource: String
    var Position: Position
    var MaxResults: js.UndefOr[PlaceIndexSearchResultLimit]
  }

  object SearchPlaceIndexForPositionSummary {
    @inline
    def apply(
        DataSource: String,
        Position: Position,
        MaxResults: js.UndefOr[PlaceIndexSearchResultLimit] = js.undefined
    ): SearchPlaceIndexForPositionSummary = {
      val __obj = js.Dynamic.literal(
        "DataSource" -> DataSource.asInstanceOf[js.Any],
        "Position" -> Position.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SearchPlaceIndexForPositionSummary]
    }
  }

  @js.native
  trait SearchPlaceIndexForTextRequest extends js.Object {
    var IndexName: ResourceName
    var Text: SyntheticSearchPlaceIndexForTextRequestString
    var BiasPosition: js.UndefOr[Position]
    var FilterBBox: js.UndefOr[BoundingBox]
    var FilterCountries: js.UndefOr[CountryCodeList]
    var MaxResults: js.UndefOr[PlaceIndexSearchResultLimit]
  }

  object SearchPlaceIndexForTextRequest {
    @inline
    def apply(
        IndexName: ResourceName,
        Text: SyntheticSearchPlaceIndexForTextRequestString,
        BiasPosition: js.UndefOr[Position] = js.undefined,
        FilterBBox: js.UndefOr[BoundingBox] = js.undefined,
        FilterCountries: js.UndefOr[CountryCodeList] = js.undefined,
        MaxResults: js.UndefOr[PlaceIndexSearchResultLimit] = js.undefined
    ): SearchPlaceIndexForTextRequest = {
      val __obj = js.Dynamic.literal(
        "IndexName" -> IndexName.asInstanceOf[js.Any],
        "Text" -> Text.asInstanceOf[js.Any]
      )

      BiasPosition.foreach(__v => __obj.updateDynamic("BiasPosition")(__v.asInstanceOf[js.Any]))
      FilterBBox.foreach(__v => __obj.updateDynamic("FilterBBox")(__v.asInstanceOf[js.Any]))
      FilterCountries.foreach(__v => __obj.updateDynamic("FilterCountries")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SearchPlaceIndexForTextRequest]
    }
  }

  @js.native
  trait SearchPlaceIndexForTextResponse extends js.Object {
    var Results: SearchForTextResultList
    var Summary: SearchPlaceIndexForTextSummary
  }

  object SearchPlaceIndexForTextResponse {
    @inline
    def apply(
        Results: SearchForTextResultList,
        Summary: SearchPlaceIndexForTextSummary
    ): SearchPlaceIndexForTextResponse = {
      val __obj = js.Dynamic.literal(
        "Results" -> Results.asInstanceOf[js.Any],
        "Summary" -> Summary.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[SearchPlaceIndexForTextResponse]
    }
  }

  /** A summary of the geocoding request sent using <code>SearchPlaceIndexForText</code>.
    */
  @js.native
  trait SearchPlaceIndexForTextSummary extends js.Object {
    var DataSource: String
    var Text: SyntheticSearchPlaceIndexForTextSummaryString
    var BiasPosition: js.UndefOr[Position]
    var FilterBBox: js.UndefOr[BoundingBox]
    var FilterCountries: js.UndefOr[CountryCodeList]
    var MaxResults: js.UndefOr[PlaceIndexSearchResultLimit]
    var ResultBBox: js.UndefOr[BoundingBox]
  }

  object SearchPlaceIndexForTextSummary {
    @inline
    def apply(
        DataSource: String,
        Text: SyntheticSearchPlaceIndexForTextSummaryString,
        BiasPosition: js.UndefOr[Position] = js.undefined,
        FilterBBox: js.UndefOr[BoundingBox] = js.undefined,
        FilterCountries: js.UndefOr[CountryCodeList] = js.undefined,
        MaxResults: js.UndefOr[PlaceIndexSearchResultLimit] = js.undefined,
        ResultBBox: js.UndefOr[BoundingBox] = js.undefined
    ): SearchPlaceIndexForTextSummary = {
      val __obj = js.Dynamic.literal(
        "DataSource" -> DataSource.asInstanceOf[js.Any],
        "Text" -> Text.asInstanceOf[js.Any]
      )

      BiasPosition.foreach(__v => __obj.updateDynamic("BiasPosition")(__v.asInstanceOf[js.Any]))
      FilterBBox.foreach(__v => __obj.updateDynamic("FilterBBox")(__v.asInstanceOf[js.Any]))
      FilterCountries.foreach(__v => __obj.updateDynamic("FilterCountries")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      ResultBBox.foreach(__v => __obj.updateDynamic("ResultBBox")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SearchPlaceIndexForTextSummary]
    }
  }
}
