package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import scala.language.implicitConversions
import facade.amazonaws._

package object location {
  type Arn = String
  type ArnList = js.Array[Arn]
  type BatchDeleteDevicePositionHistoryErrorList = js.Array[BatchDeleteDevicePositionHistoryError]
  type BatchDeleteDevicePositionHistoryRequestDeviceIdsList = js.Array[Id]
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
  type CalculateRouteRequestWaypointPositionsList = js.Array[Position]
  type CalculateRouteSummaryDistanceDouble = Double
  type CalculateRouteSummaryDurationSecondsDouble = Double
  type CountryCode = String
  type CountryCodeList = js.Array[CountryCode]
  type DevicePositionList = js.Array[DevicePosition]
  type GetMapGlyphsRequestFontUnicodeRangeString = String
  type GetMapSpritesRequestFileNameString = String
  type GetMapTileRequestXString = String
  type GetMapTileRequestYString = String
  type GetMapTileRequestZString = String
  type Id = String
  type KmsKeyId = String
  type LanguageTag = String
  type LegDistanceDouble = Double
  type LegDurationSecondsDouble = Double
  type LegList = js.Array[Leg]
  type LineString = js.Array[Position]
  type LinearRing = js.Array[Position]
  type LinearRings = js.Array[LinearRing]
  type ListDevicePositionsRequestMaxResultsInteger = Int
  type ListDevicePositionsResponseEntryList = js.Array[ListDevicePositionsResponseEntry]
  type ListGeofenceCollectionsRequestMaxResultsInteger = Int
  type ListGeofenceCollectionsResponseEntryList = js.Array[ListGeofenceCollectionsResponseEntry]
  type ListGeofenceResponseEntryList = js.Array[ListGeofenceResponseEntry]
  type ListMapsRequestMaxResultsInteger = Int
  type ListMapsResponseEntryList = js.Array[ListMapsResponseEntry]
  type ListPlaceIndexesRequestMaxResultsInteger = Int
  type ListPlaceIndexesResponseEntryList = js.Array[ListPlaceIndexesResponseEntry]
  type ListRouteCalculatorsRequestMaxResultsInteger = Int
  type ListRouteCalculatorsResponseEntryList = js.Array[ListRouteCalculatorsResponseEntry]
  type ListTrackerConsumersRequestMaxResultsInteger = Int
  type ListTrackersRequestMaxResultsInteger = Int
  type ListTrackersResponseEntryList = js.Array[ListTrackersResponseEntry]
  type MapStyle = String
  type PlaceIndexSearchResultLimit = Int
  type Position = js.Array[Double]
  type PositionalAccuracyHorizontalDouble = Double
  type PropertyMap = js.Dictionary[PropertyMapValueString]
  type PropertyMapKeyString = String
  type PropertyMapValueString = String
  type ResourceDescription = String
  type ResourceName = String
  type SearchForPositionResultDistanceDouble = Double
  type SearchForPositionResultList = js.Array[SearchForPositionResult]
  type SearchForSuggestionsResultList = js.Array[SearchForSuggestionsResult]
  type SearchForTextResultDistanceDouble = Double
  type SearchForTextResultList = js.Array[SearchForTextResult]
  type SearchForTextResultRelevanceDouble = Double
  type SearchPlaceIndexForSuggestionsRequestMaxResultsInteger = Int
  type StepDistanceDouble = Double
  type StepDurationSecondsDouble = Double
  type StepGeometryOffsetInteger = Int
  type StepList = js.Array[Step]
  type SyntheticSearchPlaceIndexForSuggestionsRequestString = String
  type SyntheticSearchPlaceIndexForSuggestionsSummaryString = String
  type SyntheticSearchPlaceIndexForTextRequestString = String
  type SyntheticSearchPlaceIndexForTextSummaryString = String
  type TagKey = String
  type TagKeys = js.Array[String]
  type TagMap = js.Dictionary[TagValue]
  type TagValue = String
  type Timestamp = js.Date
  type Token = String
  type TruckDimensionsHeightDouble = Double
  type TruckDimensionsLengthDouble = Double
  type TruckDimensionsWidthDouble = Double
  type TruckWeightTotalDouble = Double

  final class LocationOps(private val service: Location) extends AnyVal {

    @inline def associateTrackerConsumerFuture(params: AssociateTrackerConsumerRequest): Future[AssociateTrackerConsumerResponse] = service.associateTrackerConsumer(params).promise().toFuture
    @inline def batchDeleteDevicePositionHistoryFuture(params: BatchDeleteDevicePositionHistoryRequest): Future[BatchDeleteDevicePositionHistoryResponse] = service.batchDeleteDevicePositionHistory(params).promise().toFuture
    @inline def batchDeleteGeofenceFuture(params: BatchDeleteGeofenceRequest): Future[BatchDeleteGeofenceResponse] = service.batchDeleteGeofence(params).promise().toFuture
    @inline def batchEvaluateGeofencesFuture(params: BatchEvaluateGeofencesRequest): Future[BatchEvaluateGeofencesResponse] = service.batchEvaluateGeofences(params).promise().toFuture
    @inline def batchGetDevicePositionFuture(params: BatchGetDevicePositionRequest): Future[BatchGetDevicePositionResponse] = service.batchGetDevicePosition(params).promise().toFuture
    @inline def batchPutGeofenceFuture(params: BatchPutGeofenceRequest): Future[BatchPutGeofenceResponse] = service.batchPutGeofence(params).promise().toFuture
    @inline def batchUpdateDevicePositionFuture(params: BatchUpdateDevicePositionRequest): Future[BatchUpdateDevicePositionResponse] = service.batchUpdateDevicePosition(params).promise().toFuture
    @inline def calculateRouteFuture(params: CalculateRouteRequest): Future[CalculateRouteResponse] = service.calculateRoute(params).promise().toFuture
    @inline def createGeofenceCollectionFuture(params: CreateGeofenceCollectionRequest): Future[CreateGeofenceCollectionResponse] = service.createGeofenceCollection(params).promise().toFuture
    @inline def createMapFuture(params: CreateMapRequest): Future[CreateMapResponse] = service.createMap(params).promise().toFuture
    @inline def createPlaceIndexFuture(params: CreatePlaceIndexRequest): Future[CreatePlaceIndexResponse] = service.createPlaceIndex(params).promise().toFuture
    @inline def createRouteCalculatorFuture(params: CreateRouteCalculatorRequest): Future[CreateRouteCalculatorResponse] = service.createRouteCalculator(params).promise().toFuture
    @inline def createTrackerFuture(params: CreateTrackerRequest): Future[CreateTrackerResponse] = service.createTracker(params).promise().toFuture
    @inline def deleteGeofenceCollectionFuture(params: DeleteGeofenceCollectionRequest): Future[DeleteGeofenceCollectionResponse] = service.deleteGeofenceCollection(params).promise().toFuture
    @inline def deleteMapFuture(params: DeleteMapRequest): Future[DeleteMapResponse] = service.deleteMap(params).promise().toFuture
    @inline def deletePlaceIndexFuture(params: DeletePlaceIndexRequest): Future[DeletePlaceIndexResponse] = service.deletePlaceIndex(params).promise().toFuture
    @inline def deleteRouteCalculatorFuture(params: DeleteRouteCalculatorRequest): Future[DeleteRouteCalculatorResponse] = service.deleteRouteCalculator(params).promise().toFuture
    @inline def deleteTrackerFuture(params: DeleteTrackerRequest): Future[DeleteTrackerResponse] = service.deleteTracker(params).promise().toFuture
    @inline def describeGeofenceCollectionFuture(params: DescribeGeofenceCollectionRequest): Future[DescribeGeofenceCollectionResponse] = service.describeGeofenceCollection(params).promise().toFuture
    @inline def describeMapFuture(params: DescribeMapRequest): Future[DescribeMapResponse] = service.describeMap(params).promise().toFuture
    @inline def describePlaceIndexFuture(params: DescribePlaceIndexRequest): Future[DescribePlaceIndexResponse] = service.describePlaceIndex(params).promise().toFuture
    @inline def describeRouteCalculatorFuture(params: DescribeRouteCalculatorRequest): Future[DescribeRouteCalculatorResponse] = service.describeRouteCalculator(params).promise().toFuture
    @inline def describeTrackerFuture(params: DescribeTrackerRequest): Future[DescribeTrackerResponse] = service.describeTracker(params).promise().toFuture
    @inline def disassociateTrackerConsumerFuture(params: DisassociateTrackerConsumerRequest): Future[DisassociateTrackerConsumerResponse] = service.disassociateTrackerConsumer(params).promise().toFuture
    @inline def getDevicePositionFuture(params: GetDevicePositionRequest): Future[GetDevicePositionResponse] = service.getDevicePosition(params).promise().toFuture
    @inline def getDevicePositionHistoryFuture(params: GetDevicePositionHistoryRequest): Future[GetDevicePositionHistoryResponse] = service.getDevicePositionHistory(params).promise().toFuture
    @inline def getGeofenceFuture(params: GetGeofenceRequest): Future[GetGeofenceResponse] = service.getGeofence(params).promise().toFuture
    @inline def getMapGlyphsFuture(params: GetMapGlyphsRequest): Future[GetMapGlyphsResponse] = service.getMapGlyphs(params).promise().toFuture
    @inline def getMapSpritesFuture(params: GetMapSpritesRequest): Future[GetMapSpritesResponse] = service.getMapSprites(params).promise().toFuture
    @inline def getMapStyleDescriptorFuture(params: GetMapStyleDescriptorRequest): Future[GetMapStyleDescriptorResponse] = service.getMapStyleDescriptor(params).promise().toFuture
    @inline def getMapTileFuture(params: GetMapTileRequest): Future[GetMapTileResponse] = service.getMapTile(params).promise().toFuture
    @inline def listDevicePositionsFuture(params: ListDevicePositionsRequest): Future[ListDevicePositionsResponse] = service.listDevicePositions(params).promise().toFuture
    @inline def listGeofenceCollectionsFuture(params: ListGeofenceCollectionsRequest): Future[ListGeofenceCollectionsResponse] = service.listGeofenceCollections(params).promise().toFuture
    @inline def listGeofencesFuture(params: ListGeofencesRequest): Future[ListGeofencesResponse] = service.listGeofences(params).promise().toFuture
    @inline def listMapsFuture(params: ListMapsRequest): Future[ListMapsResponse] = service.listMaps(params).promise().toFuture
    @inline def listPlaceIndexesFuture(params: ListPlaceIndexesRequest): Future[ListPlaceIndexesResponse] = service.listPlaceIndexes(params).promise().toFuture
    @inline def listRouteCalculatorsFuture(params: ListRouteCalculatorsRequest): Future[ListRouteCalculatorsResponse] = service.listRouteCalculators(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] = service.listTagsForResource(params).promise().toFuture
    @inline def listTrackerConsumersFuture(params: ListTrackerConsumersRequest): Future[ListTrackerConsumersResponse] = service.listTrackerConsumers(params).promise().toFuture
    @inline def listTrackersFuture(params: ListTrackersRequest): Future[ListTrackersResponse] = service.listTrackers(params).promise().toFuture
    @inline def putGeofenceFuture(params: PutGeofenceRequest): Future[PutGeofenceResponse] = service.putGeofence(params).promise().toFuture
    @inline def searchPlaceIndexForPositionFuture(params: SearchPlaceIndexForPositionRequest): Future[SearchPlaceIndexForPositionResponse] = service.searchPlaceIndexForPosition(params).promise().toFuture
    @inline def searchPlaceIndexForSuggestionsFuture(params: SearchPlaceIndexForSuggestionsRequest): Future[SearchPlaceIndexForSuggestionsResponse] = service.searchPlaceIndexForSuggestions(params).promise().toFuture
    @inline def searchPlaceIndexForTextFuture(params: SearchPlaceIndexForTextRequest): Future[SearchPlaceIndexForTextResponse] = service.searchPlaceIndexForText(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] = service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] = service.untagResource(params).promise().toFuture
    @inline def updateGeofenceCollectionFuture(params: UpdateGeofenceCollectionRequest): Future[UpdateGeofenceCollectionResponse] = service.updateGeofenceCollection(params).promise().toFuture
    @inline def updateMapFuture(params: UpdateMapRequest): Future[UpdateMapResponse] = service.updateMap(params).promise().toFuture
    @inline def updatePlaceIndexFuture(params: UpdatePlaceIndexRequest): Future[UpdatePlaceIndexResponse] = service.updatePlaceIndex(params).promise().toFuture
    @inline def updateRouteCalculatorFuture(params: UpdateRouteCalculatorRequest): Future[UpdateRouteCalculatorResponse] = service.updateRouteCalculator(params).promise().toFuture
    @inline def updateTrackerFuture(params: UpdateTrackerRequest): Future[UpdateTrackerResponse] = service.updateTracker(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/location", JSImport.Namespace, "AWS.Location")
  class Location() extends js.Object {
    def this(config: AWSConfig) = this()

    def associateTrackerConsumer(params: AssociateTrackerConsumerRequest): Request[AssociateTrackerConsumerResponse] = js.native
    def batchDeleteDevicePositionHistory(params: BatchDeleteDevicePositionHistoryRequest): Request[BatchDeleteDevicePositionHistoryResponse] = js.native
    def batchDeleteGeofence(params: BatchDeleteGeofenceRequest): Request[BatchDeleteGeofenceResponse] = js.native
    def batchEvaluateGeofences(params: BatchEvaluateGeofencesRequest): Request[BatchEvaluateGeofencesResponse] = js.native
    def batchGetDevicePosition(params: BatchGetDevicePositionRequest): Request[BatchGetDevicePositionResponse] = js.native
    def batchPutGeofence(params: BatchPutGeofenceRequest): Request[BatchPutGeofenceResponse] = js.native
    def batchUpdateDevicePosition(params: BatchUpdateDevicePositionRequest): Request[BatchUpdateDevicePositionResponse] = js.native
    def calculateRoute(params: CalculateRouteRequest): Request[CalculateRouteResponse] = js.native
    def createGeofenceCollection(params: CreateGeofenceCollectionRequest): Request[CreateGeofenceCollectionResponse] = js.native
    def createMap(params: CreateMapRequest): Request[CreateMapResponse] = js.native
    def createPlaceIndex(params: CreatePlaceIndexRequest): Request[CreatePlaceIndexResponse] = js.native
    def createRouteCalculator(params: CreateRouteCalculatorRequest): Request[CreateRouteCalculatorResponse] = js.native
    def createTracker(params: CreateTrackerRequest): Request[CreateTrackerResponse] = js.native
    def deleteGeofenceCollection(params: DeleteGeofenceCollectionRequest): Request[DeleteGeofenceCollectionResponse] = js.native
    def deleteMap(params: DeleteMapRequest): Request[DeleteMapResponse] = js.native
    def deletePlaceIndex(params: DeletePlaceIndexRequest): Request[DeletePlaceIndexResponse] = js.native
    def deleteRouteCalculator(params: DeleteRouteCalculatorRequest): Request[DeleteRouteCalculatorResponse] = js.native
    def deleteTracker(params: DeleteTrackerRequest): Request[DeleteTrackerResponse] = js.native
    def describeGeofenceCollection(params: DescribeGeofenceCollectionRequest): Request[DescribeGeofenceCollectionResponse] = js.native
    def describeMap(params: DescribeMapRequest): Request[DescribeMapResponse] = js.native
    def describePlaceIndex(params: DescribePlaceIndexRequest): Request[DescribePlaceIndexResponse] = js.native
    def describeRouteCalculator(params: DescribeRouteCalculatorRequest): Request[DescribeRouteCalculatorResponse] = js.native
    def describeTracker(params: DescribeTrackerRequest): Request[DescribeTrackerResponse] = js.native
    def disassociateTrackerConsumer(params: DisassociateTrackerConsumerRequest): Request[DisassociateTrackerConsumerResponse] = js.native
    def getDevicePosition(params: GetDevicePositionRequest): Request[GetDevicePositionResponse] = js.native
    def getDevicePositionHistory(params: GetDevicePositionHistoryRequest): Request[GetDevicePositionHistoryResponse] = js.native
    def getGeofence(params: GetGeofenceRequest): Request[GetGeofenceResponse] = js.native
    def getMapGlyphs(params: GetMapGlyphsRequest): Request[GetMapGlyphsResponse] = js.native
    def getMapSprites(params: GetMapSpritesRequest): Request[GetMapSpritesResponse] = js.native
    def getMapStyleDescriptor(params: GetMapStyleDescriptorRequest): Request[GetMapStyleDescriptorResponse] = js.native
    def getMapTile(params: GetMapTileRequest): Request[GetMapTileResponse] = js.native
    def listDevicePositions(params: ListDevicePositionsRequest): Request[ListDevicePositionsResponse] = js.native
    def listGeofenceCollections(params: ListGeofenceCollectionsRequest): Request[ListGeofenceCollectionsResponse] = js.native
    def listGeofences(params: ListGeofencesRequest): Request[ListGeofencesResponse] = js.native
    def listMaps(params: ListMapsRequest): Request[ListMapsResponse] = js.native
    def listPlaceIndexes(params: ListPlaceIndexesRequest): Request[ListPlaceIndexesResponse] = js.native
    def listRouteCalculators(params: ListRouteCalculatorsRequest): Request[ListRouteCalculatorsResponse] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def listTrackerConsumers(params: ListTrackerConsumersRequest): Request[ListTrackerConsumersResponse] = js.native
    def listTrackers(params: ListTrackersRequest): Request[ListTrackersResponse] = js.native
    def putGeofence(params: PutGeofenceRequest): Request[PutGeofenceResponse] = js.native
    def searchPlaceIndexForPosition(params: SearchPlaceIndexForPositionRequest): Request[SearchPlaceIndexForPositionResponse] = js.native
    def searchPlaceIndexForSuggestions(params: SearchPlaceIndexForSuggestionsRequest): Request[SearchPlaceIndexForSuggestionsResponse] = js.native
    def searchPlaceIndexForText(params: SearchPlaceIndexForTextRequest): Request[SearchPlaceIndexForTextResponse] = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse] = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse] = js.native
    def updateGeofenceCollection(params: UpdateGeofenceCollectionRequest): Request[UpdateGeofenceCollectionResponse] = js.native
    def updateMap(params: UpdateMapRequest): Request[UpdateMapResponse] = js.native
    def updatePlaceIndex(params: UpdatePlaceIndexRequest): Request[UpdatePlaceIndexResponse] = js.native
    def updateRouteCalculator(params: UpdateRouteCalculatorRequest): Request[UpdateRouteCalculatorResponse] = js.native
    def updateTracker(params: UpdateTrackerRequest): Request[UpdateTrackerResponse] = js.native
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

  /** Contains the tracker resource details.
    */
  @js.native
  trait BatchDeleteDevicePositionHistoryError extends js.Object {
    var DeviceId: Id
    var Error: BatchItemError
  }

  object BatchDeleteDevicePositionHistoryError {
    @inline
    def apply(
        DeviceId: Id,
        Error: BatchItemError
    ): BatchDeleteDevicePositionHistoryError = {
      val __obj = js.Dynamic.literal(
        "DeviceId" -> DeviceId.asInstanceOf[js.Any],
        "Error" -> Error.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[BatchDeleteDevicePositionHistoryError]
    }
  }

  @js.native
  trait BatchDeleteDevicePositionHistoryRequest extends js.Object {
    var DeviceIds: BatchDeleteDevicePositionHistoryRequestDeviceIdsList
    var TrackerName: ResourceName
  }

  object BatchDeleteDevicePositionHistoryRequest {
    @inline
    def apply(
        DeviceIds: BatchDeleteDevicePositionHistoryRequestDeviceIdsList,
        TrackerName: ResourceName
    ): BatchDeleteDevicePositionHistoryRequest = {
      val __obj = js.Dynamic.literal(
        "DeviceIds" -> DeviceIds.asInstanceOf[js.Any],
        "TrackerName" -> TrackerName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[BatchDeleteDevicePositionHistoryRequest]
    }
  }

  @js.native
  trait BatchDeleteDevicePositionHistoryResponse extends js.Object {
    var Errors: BatchDeleteDevicePositionHistoryErrorList
  }

  object BatchDeleteDevicePositionHistoryResponse {
    @inline
    def apply(
        Errors: BatchDeleteDevicePositionHistoryErrorList
    ): BatchDeleteDevicePositionHistoryResponse = {
      val __obj = js.Dynamic.literal(
        "Errors" -> Errors.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[BatchDeleteDevicePositionHistoryResponse]
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

  /** Contains details about additional route preferences for requests that specify <code>TravelMode</code> as <code>Car</code>.
    */
  @js.native
  trait CalculateRouteCarModeOptions extends js.Object {
    var AvoidFerries: js.UndefOr[Boolean]
    var AvoidTolls: js.UndefOr[Boolean]
  }

  object CalculateRouteCarModeOptions {
    @inline
    def apply(
        AvoidFerries: js.UndefOr[Boolean] = js.undefined,
        AvoidTolls: js.UndefOr[Boolean] = js.undefined
    ): CalculateRouteCarModeOptions = {
      val __obj = js.Dynamic.literal()
      AvoidFerries.foreach(__v => __obj.updateDynamic("AvoidFerries")(__v.asInstanceOf[js.Any]))
      AvoidTolls.foreach(__v => __obj.updateDynamic("AvoidTolls")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CalculateRouteCarModeOptions]
    }
  }

  @js.native
  trait CalculateRouteRequest extends js.Object {
    var CalculatorName: ResourceName
    var DeparturePosition: Position
    var DestinationPosition: Position
    var CarModeOptions: js.UndefOr[CalculateRouteCarModeOptions]
    var DepartNow: js.UndefOr[Boolean]
    var DepartureTime: js.UndefOr[Timestamp]
    var DistanceUnit: js.UndefOr[DistanceUnit]
    var IncludeLegGeometry: js.UndefOr[Boolean]
    var TravelMode: js.UndefOr[TravelMode]
    var TruckModeOptions: js.UndefOr[CalculateRouteTruckModeOptions]
    var WaypointPositions: js.UndefOr[CalculateRouteRequestWaypointPositionsList]
  }

  object CalculateRouteRequest {
    @inline
    def apply(
        CalculatorName: ResourceName,
        DeparturePosition: Position,
        DestinationPosition: Position,
        CarModeOptions: js.UndefOr[CalculateRouteCarModeOptions] = js.undefined,
        DepartNow: js.UndefOr[Boolean] = js.undefined,
        DepartureTime: js.UndefOr[Timestamp] = js.undefined,
        DistanceUnit: js.UndefOr[DistanceUnit] = js.undefined,
        IncludeLegGeometry: js.UndefOr[Boolean] = js.undefined,
        TravelMode: js.UndefOr[TravelMode] = js.undefined,
        TruckModeOptions: js.UndefOr[CalculateRouteTruckModeOptions] = js.undefined,
        WaypointPositions: js.UndefOr[CalculateRouteRequestWaypointPositionsList] = js.undefined
    ): CalculateRouteRequest = {
      val __obj = js.Dynamic.literal(
        "CalculatorName" -> CalculatorName.asInstanceOf[js.Any],
        "DeparturePosition" -> DeparturePosition.asInstanceOf[js.Any],
        "DestinationPosition" -> DestinationPosition.asInstanceOf[js.Any]
      )

      CarModeOptions.foreach(__v => __obj.updateDynamic("CarModeOptions")(__v.asInstanceOf[js.Any]))
      DepartNow.foreach(__v => __obj.updateDynamic("DepartNow")(__v.asInstanceOf[js.Any]))
      DepartureTime.foreach(__v => __obj.updateDynamic("DepartureTime")(__v.asInstanceOf[js.Any]))
      DistanceUnit.foreach(__v => __obj.updateDynamic("DistanceUnit")(__v.asInstanceOf[js.Any]))
      IncludeLegGeometry.foreach(__v => __obj.updateDynamic("IncludeLegGeometry")(__v.asInstanceOf[js.Any]))
      TravelMode.foreach(__v => __obj.updateDynamic("TravelMode")(__v.asInstanceOf[js.Any]))
      TruckModeOptions.foreach(__v => __obj.updateDynamic("TruckModeOptions")(__v.asInstanceOf[js.Any]))
      WaypointPositions.foreach(__v => __obj.updateDynamic("WaypointPositions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CalculateRouteRequest]
    }
  }

  /** Returns the result of the route calculation. Metadata includes legs and route summary.
    */
  @js.native
  trait CalculateRouteResponse extends js.Object {
    var Legs: LegList
    var Summary: CalculateRouteSummary
  }

  object CalculateRouteResponse {
    @inline
    def apply(
        Legs: LegList,
        Summary: CalculateRouteSummary
    ): CalculateRouteResponse = {
      val __obj = js.Dynamic.literal(
        "Legs" -> Legs.asInstanceOf[js.Any],
        "Summary" -> Summary.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CalculateRouteResponse]
    }
  }

  /** A summary of the calculated route.
    */
  @js.native
  trait CalculateRouteSummary extends js.Object {
    var DataSource: String
    var Distance: CalculateRouteSummaryDistanceDouble
    var DistanceUnit: DistanceUnit
    var DurationSeconds: CalculateRouteSummaryDurationSecondsDouble
    var RouteBBox: BoundingBox
  }

  object CalculateRouteSummary {
    @inline
    def apply(
        DataSource: String,
        Distance: CalculateRouteSummaryDistanceDouble,
        DistanceUnit: DistanceUnit,
        DurationSeconds: CalculateRouteSummaryDurationSecondsDouble,
        RouteBBox: BoundingBox
    ): CalculateRouteSummary = {
      val __obj = js.Dynamic.literal(
        "DataSource" -> DataSource.asInstanceOf[js.Any],
        "Distance" -> Distance.asInstanceOf[js.Any],
        "DistanceUnit" -> DistanceUnit.asInstanceOf[js.Any],
        "DurationSeconds" -> DurationSeconds.asInstanceOf[js.Any],
        "RouteBBox" -> RouteBBox.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CalculateRouteSummary]
    }
  }

  /** Contains details about additional route preferences for requests that specify <code>TravelMode</code> as <code>Truck</code>.
    */
  @js.native
  trait CalculateRouteTruckModeOptions extends js.Object {
    var AvoidFerries: js.UndefOr[Boolean]
    var AvoidTolls: js.UndefOr[Boolean]
    var Dimensions: js.UndefOr[TruckDimensions]
    var Weight: js.UndefOr[TruckWeight]
  }

  object CalculateRouteTruckModeOptions {
    @inline
    def apply(
        AvoidFerries: js.UndefOr[Boolean] = js.undefined,
        AvoidTolls: js.UndefOr[Boolean] = js.undefined,
        Dimensions: js.UndefOr[TruckDimensions] = js.undefined,
        Weight: js.UndefOr[TruckWeight] = js.undefined
    ): CalculateRouteTruckModeOptions = {
      val __obj = js.Dynamic.literal()
      AvoidFerries.foreach(__v => __obj.updateDynamic("AvoidFerries")(__v.asInstanceOf[js.Any]))
      AvoidTolls.foreach(__v => __obj.updateDynamic("AvoidTolls")(__v.asInstanceOf[js.Any]))
      Dimensions.foreach(__v => __obj.updateDynamic("Dimensions")(__v.asInstanceOf[js.Any]))
      Weight.foreach(__v => __obj.updateDynamic("Weight")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CalculateRouteTruckModeOptions]
    }
  }

  @js.native
  trait CreateGeofenceCollectionRequest extends js.Object {
    var CollectionName: ResourceName
    var Description: js.UndefOr[ResourceDescription]
    var KmsKeyId: js.UndefOr[KmsKeyId]
    var PricingPlan: js.UndefOr[PricingPlan]
    var PricingPlanDataSource: js.UndefOr[String]
    var Tags: js.UndefOr[TagMap]
  }

  object CreateGeofenceCollectionRequest {
    @inline
    def apply(
        CollectionName: ResourceName,
        Description: js.UndefOr[ResourceDescription] = js.undefined,
        KmsKeyId: js.UndefOr[KmsKeyId] = js.undefined,
        PricingPlan: js.UndefOr[PricingPlan] = js.undefined,
        PricingPlanDataSource: js.UndefOr[String] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined
    ): CreateGeofenceCollectionRequest = {
      val __obj = js.Dynamic.literal(
        "CollectionName" -> CollectionName.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      KmsKeyId.foreach(__v => __obj.updateDynamic("KmsKeyId")(__v.asInstanceOf[js.Any]))
      PricingPlan.foreach(__v => __obj.updateDynamic("PricingPlan")(__v.asInstanceOf[js.Any]))
      PricingPlanDataSource.foreach(__v => __obj.updateDynamic("PricingPlanDataSource")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
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
    var Description: js.UndefOr[ResourceDescription]
    var PricingPlan: js.UndefOr[PricingPlan]
    var Tags: js.UndefOr[TagMap]
  }

  object CreateMapRequest {
    @inline
    def apply(
        Configuration: MapConfiguration,
        MapName: ResourceName,
        Description: js.UndefOr[ResourceDescription] = js.undefined,
        PricingPlan: js.UndefOr[PricingPlan] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined
    ): CreateMapRequest = {
      val __obj = js.Dynamic.literal(
        "Configuration" -> Configuration.asInstanceOf[js.Any],
        "MapName" -> MapName.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      PricingPlan.foreach(__v => __obj.updateDynamic("PricingPlan")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
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
    var DataSourceConfiguration: js.UndefOr[DataSourceConfiguration]
    var Description: js.UndefOr[ResourceDescription]
    var PricingPlan: js.UndefOr[PricingPlan]
    var Tags: js.UndefOr[TagMap]
  }

  object CreatePlaceIndexRequest {
    @inline
    def apply(
        DataSource: String,
        IndexName: ResourceName,
        DataSourceConfiguration: js.UndefOr[DataSourceConfiguration] = js.undefined,
        Description: js.UndefOr[ResourceDescription] = js.undefined,
        PricingPlan: js.UndefOr[PricingPlan] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined
    ): CreatePlaceIndexRequest = {
      val __obj = js.Dynamic.literal(
        "DataSource" -> DataSource.asInstanceOf[js.Any],
        "IndexName" -> IndexName.asInstanceOf[js.Any]
      )

      DataSourceConfiguration.foreach(__v => __obj.updateDynamic("DataSourceConfiguration")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      PricingPlan.foreach(__v => __obj.updateDynamic("PricingPlan")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
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
  trait CreateRouteCalculatorRequest extends js.Object {
    var CalculatorName: ResourceName
    var DataSource: String
    var Description: js.UndefOr[ResourceDescription]
    var PricingPlan: js.UndefOr[PricingPlan]
    var Tags: js.UndefOr[TagMap]
  }

  object CreateRouteCalculatorRequest {
    @inline
    def apply(
        CalculatorName: ResourceName,
        DataSource: String,
        Description: js.UndefOr[ResourceDescription] = js.undefined,
        PricingPlan: js.UndefOr[PricingPlan] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined
    ): CreateRouteCalculatorRequest = {
      val __obj = js.Dynamic.literal(
        "CalculatorName" -> CalculatorName.asInstanceOf[js.Any],
        "DataSource" -> DataSource.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      PricingPlan.foreach(__v => __obj.updateDynamic("PricingPlan")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateRouteCalculatorRequest]
    }
  }

  @js.native
  trait CreateRouteCalculatorResponse extends js.Object {
    var CalculatorArn: Arn
    var CalculatorName: ResourceName
    var CreateTime: Timestamp
  }

  object CreateRouteCalculatorResponse {
    @inline
    def apply(
        CalculatorArn: Arn,
        CalculatorName: ResourceName,
        CreateTime: Timestamp
    ): CreateRouteCalculatorResponse = {
      val __obj = js.Dynamic.literal(
        "CalculatorArn" -> CalculatorArn.asInstanceOf[js.Any],
        "CalculatorName" -> CalculatorName.asInstanceOf[js.Any],
        "CreateTime" -> CreateTime.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateRouteCalculatorResponse]
    }
  }

  @js.native
  trait CreateTrackerRequest extends js.Object {
    var TrackerName: ResourceName
    var Description: js.UndefOr[ResourceDescription]
    var KmsKeyId: js.UndefOr[KmsKeyId]
    var PositionFiltering: js.UndefOr[PositionFiltering]
    var PricingPlan: js.UndefOr[PricingPlan]
    var PricingPlanDataSource: js.UndefOr[String]
    var Tags: js.UndefOr[TagMap]
  }

  object CreateTrackerRequest {
    @inline
    def apply(
        TrackerName: ResourceName,
        Description: js.UndefOr[ResourceDescription] = js.undefined,
        KmsKeyId: js.UndefOr[KmsKeyId] = js.undefined,
        PositionFiltering: js.UndefOr[PositionFiltering] = js.undefined,
        PricingPlan: js.UndefOr[PricingPlan] = js.undefined,
        PricingPlanDataSource: js.UndefOr[String] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined
    ): CreateTrackerRequest = {
      val __obj = js.Dynamic.literal(
        "TrackerName" -> TrackerName.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      KmsKeyId.foreach(__v => __obj.updateDynamic("KmsKeyId")(__v.asInstanceOf[js.Any]))
      PositionFiltering.foreach(__v => __obj.updateDynamic("PositionFiltering")(__v.asInstanceOf[js.Any]))
      PricingPlan.foreach(__v => __obj.updateDynamic("PricingPlan")(__v.asInstanceOf[js.Any]))
      PricingPlanDataSource.foreach(__v => __obj.updateDynamic("PricingPlanDataSource")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
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

  /** Specifies the data storage option chosen for requesting Places. <important> When using Amazon Location Places: * If using HERE Technologies as a data provider, you can't store results for locations in Japan by setting <code>IntendedUse</code> to <code>Storage</code>. parameter. * Under the <code>MobileAssetTracking</code> or <code>MobilAssetManagement</code> pricing plan, you can't store results from your place index resources by setting <code>IntendedUse</code> to <code>Storage</code>. This returns a validation exception error. For more information, see the [[https://aws.amazon.com/service-terms/|AWS Service Terms]] for Amazon Location Service. </important>
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
  trait DeleteRouteCalculatorRequest extends js.Object {
    var CalculatorName: ResourceName
  }

  object DeleteRouteCalculatorRequest {
    @inline
    def apply(
        CalculatorName: ResourceName
    ): DeleteRouteCalculatorRequest = {
      val __obj = js.Dynamic.literal(
        "CalculatorName" -> CalculatorName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteRouteCalculatorRequest]
    }
  }

  @js.native
  trait DeleteRouteCalculatorResponse extends js.Object

  object DeleteRouteCalculatorResponse {
    @inline
    def apply(): DeleteRouteCalculatorResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteRouteCalculatorResponse]
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
    var KmsKeyId: js.UndefOr[KmsKeyId]
    var PricingPlanDataSource: js.UndefOr[String]
    var Tags: js.UndefOr[TagMap]
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
        KmsKeyId: js.UndefOr[KmsKeyId] = js.undefined,
        PricingPlanDataSource: js.UndefOr[String] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined
    ): DescribeGeofenceCollectionResponse = {
      val __obj = js.Dynamic.literal(
        "CollectionArn" -> CollectionArn.asInstanceOf[js.Any],
        "CollectionName" -> CollectionName.asInstanceOf[js.Any],
        "CreateTime" -> CreateTime.asInstanceOf[js.Any],
        "Description" -> Description.asInstanceOf[js.Any],
        "PricingPlan" -> PricingPlan.asInstanceOf[js.Any],
        "UpdateTime" -> UpdateTime.asInstanceOf[js.Any]
      )

      KmsKeyId.foreach(__v => __obj.updateDynamic("KmsKeyId")(__v.asInstanceOf[js.Any]))
      PricingPlanDataSource.foreach(__v => __obj.updateDynamic("PricingPlanDataSource")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
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
    var Tags: js.UndefOr[TagMap]
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
        UpdateTime: Timestamp,
        Tags: js.UndefOr[TagMap] = js.undefined
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

      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
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
    var Tags: js.UndefOr[TagMap]
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
        UpdateTime: Timestamp,
        Tags: js.UndefOr[TagMap] = js.undefined
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

      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribePlaceIndexResponse]
    }
  }

  @js.native
  trait DescribeRouteCalculatorRequest extends js.Object {
    var CalculatorName: ResourceName
  }

  object DescribeRouteCalculatorRequest {
    @inline
    def apply(
        CalculatorName: ResourceName
    ): DescribeRouteCalculatorRequest = {
      val __obj = js.Dynamic.literal(
        "CalculatorName" -> CalculatorName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeRouteCalculatorRequest]
    }
  }

  @js.native
  trait DescribeRouteCalculatorResponse extends js.Object {
    var CalculatorArn: Arn
    var CalculatorName: ResourceName
    var CreateTime: Timestamp
    var DataSource: String
    var Description: ResourceDescription
    var PricingPlan: PricingPlan
    var UpdateTime: Timestamp
    var Tags: js.UndefOr[TagMap]
  }

  object DescribeRouteCalculatorResponse {
    @inline
    def apply(
        CalculatorArn: Arn,
        CalculatorName: ResourceName,
        CreateTime: Timestamp,
        DataSource: String,
        Description: ResourceDescription,
        PricingPlan: PricingPlan,
        UpdateTime: Timestamp,
        Tags: js.UndefOr[TagMap] = js.undefined
    ): DescribeRouteCalculatorResponse = {
      val __obj = js.Dynamic.literal(
        "CalculatorArn" -> CalculatorArn.asInstanceOf[js.Any],
        "CalculatorName" -> CalculatorName.asInstanceOf[js.Any],
        "CreateTime" -> CreateTime.asInstanceOf[js.Any],
        "DataSource" -> DataSource.asInstanceOf[js.Any],
        "Description" -> Description.asInstanceOf[js.Any],
        "PricingPlan" -> PricingPlan.asInstanceOf[js.Any],
        "UpdateTime" -> UpdateTime.asInstanceOf[js.Any]
      )

      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeRouteCalculatorResponse]
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
    var KmsKeyId: js.UndefOr[KmsKeyId]
    var PositionFiltering: js.UndefOr[PositionFiltering]
    var PricingPlanDataSource: js.UndefOr[String]
    var Tags: js.UndefOr[TagMap]
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
        KmsKeyId: js.UndefOr[KmsKeyId] = js.undefined,
        PositionFiltering: js.UndefOr[PositionFiltering] = js.undefined,
        PricingPlanDataSource: js.UndefOr[String] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined
    ): DescribeTrackerResponse = {
      val __obj = js.Dynamic.literal(
        "CreateTime" -> CreateTime.asInstanceOf[js.Any],
        "Description" -> Description.asInstanceOf[js.Any],
        "PricingPlan" -> PricingPlan.asInstanceOf[js.Any],
        "TrackerArn" -> TrackerArn.asInstanceOf[js.Any],
        "TrackerName" -> TrackerName.asInstanceOf[js.Any],
        "UpdateTime" -> UpdateTime.asInstanceOf[js.Any]
      )

      KmsKeyId.foreach(__v => __obj.updateDynamic("KmsKeyId")(__v.asInstanceOf[js.Any]))
      PositionFiltering.foreach(__v => __obj.updateDynamic("PositionFiltering")(__v.asInstanceOf[js.Any]))
      PricingPlanDataSource.foreach(__v => __obj.updateDynamic("PricingPlanDataSource")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
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
    var Accuracy: js.UndefOr[PositionalAccuracy]
    var DeviceId: js.UndefOr[Id]
    var PositionProperties: js.UndefOr[PropertyMap]
  }

  object DevicePosition {
    @inline
    def apply(
        Position: Position,
        ReceivedTime: Timestamp,
        SampleTime: Timestamp,
        Accuracy: js.UndefOr[PositionalAccuracy] = js.undefined,
        DeviceId: js.UndefOr[Id] = js.undefined,
        PositionProperties: js.UndefOr[PropertyMap] = js.undefined
    ): DevicePosition = {
      val __obj = js.Dynamic.literal(
        "Position" -> Position.asInstanceOf[js.Any],
        "ReceivedTime" -> ReceivedTime.asInstanceOf[js.Any],
        "SampleTime" -> SampleTime.asInstanceOf[js.Any]
      )

      Accuracy.foreach(__v => __obj.updateDynamic("Accuracy")(__v.asInstanceOf[js.Any]))
      DeviceId.foreach(__v => __obj.updateDynamic("DeviceId")(__v.asInstanceOf[js.Any]))
      PositionProperties.foreach(__v => __obj.updateDynamic("PositionProperties")(__v.asInstanceOf[js.Any]))
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
    var Accuracy: js.UndefOr[PositionalAccuracy]
    var PositionProperties: js.UndefOr[PropertyMap]
  }

  object DevicePositionUpdate {
    @inline
    def apply(
        DeviceId: Id,
        Position: Position,
        SampleTime: Timestamp,
        Accuracy: js.UndefOr[PositionalAccuracy] = js.undefined,
        PositionProperties: js.UndefOr[PropertyMap] = js.undefined
    ): DevicePositionUpdate = {
      val __obj = js.Dynamic.literal(
        "DeviceId" -> DeviceId.asInstanceOf[js.Any],
        "Position" -> Position.asInstanceOf[js.Any],
        "SampleTime" -> SampleTime.asInstanceOf[js.Any]
      )

      Accuracy.foreach(__v => __obj.updateDynamic("Accuracy")(__v.asInstanceOf[js.Any]))
      PositionProperties.foreach(__v => __obj.updateDynamic("PositionProperties")(__v.asInstanceOf[js.Any]))
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
    * '''Note:'''Amazon Location doesn't currently support polygons with holes, multipolygons, polygons that are wound clockwise, or that cross the antimeridian.
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
    var Accuracy: js.UndefOr[PositionalAccuracy]
    var DeviceId: js.UndefOr[Id]
    var PositionProperties: js.UndefOr[PropertyMap]
  }

  object GetDevicePositionResponse {
    @inline
    def apply(
        Position: Position,
        ReceivedTime: Timestamp,
        SampleTime: Timestamp,
        Accuracy: js.UndefOr[PositionalAccuracy] = js.undefined,
        DeviceId: js.UndefOr[Id] = js.undefined,
        PositionProperties: js.UndefOr[PropertyMap] = js.undefined
    ): GetDevicePositionResponse = {
      val __obj = js.Dynamic.literal(
        "Position" -> Position.asInstanceOf[js.Any],
        "ReceivedTime" -> ReceivedTime.asInstanceOf[js.Any],
        "SampleTime" -> SampleTime.asInstanceOf[js.Any]
      )

      Accuracy.foreach(__v => __obj.updateDynamic("Accuracy")(__v.asInstanceOf[js.Any]))
      DeviceId.foreach(__v => __obj.updateDynamic("DeviceId")(__v.asInstanceOf[js.Any]))
      PositionProperties.foreach(__v => __obj.updateDynamic("PositionProperties")(__v.asInstanceOf[js.Any]))
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

  /** Contains the calculated route's details for each path between a pair of positions. The number of legs returned corresponds to one fewer than the total number of positions in the request. For example, a route with a departure position and destination position returns one leg with the positions [[https://docs.aws.amazon.com/location/latest/developerguide/calculate-route.html#snap-to-nearby-road|snapped to a nearby road]]: * The <code>StartPosition</code> is the departure position. * The <code>EndPosition</code> is the destination position. A route with a waypoint between the departure and destination position returns two legs with the positions snapped to a nearby road: * Leg 1: The <code>StartPosition</code> is the departure position . The <code>EndPosition</code> is the waypoint positon. * Leg 2: The <code>StartPosition</code> is the waypoint position. The <code>EndPosition</code> is the destination position.
    */
  @js.native
  trait Leg extends js.Object {
    var Distance: LegDistanceDouble
    var DurationSeconds: LegDurationSecondsDouble
    var EndPosition: Position
    var StartPosition: Position
    var Steps: StepList
    var Geometry: js.UndefOr[LegGeometry]
  }

  object Leg {
    @inline
    def apply(
        Distance: LegDistanceDouble,
        DurationSeconds: LegDurationSecondsDouble,
        EndPosition: Position,
        StartPosition: Position,
        Steps: StepList,
        Geometry: js.UndefOr[LegGeometry] = js.undefined
    ): Leg = {
      val __obj = js.Dynamic.literal(
        "Distance" -> Distance.asInstanceOf[js.Any],
        "DurationSeconds" -> DurationSeconds.asInstanceOf[js.Any],
        "EndPosition" -> EndPosition.asInstanceOf[js.Any],
        "StartPosition" -> StartPosition.asInstanceOf[js.Any],
        "Steps" -> Steps.asInstanceOf[js.Any]
      )

      Geometry.foreach(__v => __obj.updateDynamic("Geometry")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Leg]
    }
  }

  /** Contains the geometry details for each path between a pair of positions. Used in plotting a route leg on a map.
    */
  @js.native
  trait LegGeometry extends js.Object {
    var LineString: js.UndefOr[LineString]
  }

  object LegGeometry {
    @inline
    def apply(
        LineString: js.UndefOr[LineString] = js.undefined
    ): LegGeometry = {
      val __obj = js.Dynamic.literal()
      LineString.foreach(__v => __obj.updateDynamic("LineString")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LegGeometry]
    }
  }

  @js.native
  trait ListDevicePositionsRequest extends js.Object {
    var TrackerName: ResourceName
    var MaxResults: js.UndefOr[ListDevicePositionsRequestMaxResultsInteger]
    var NextToken: js.UndefOr[Token]
  }

  object ListDevicePositionsRequest {
    @inline
    def apply(
        TrackerName: ResourceName,
        MaxResults: js.UndefOr[ListDevicePositionsRequestMaxResultsInteger] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined
    ): ListDevicePositionsRequest = {
      val __obj = js.Dynamic.literal(
        "TrackerName" -> TrackerName.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDevicePositionsRequest]
    }
  }

  @js.native
  trait ListDevicePositionsResponse extends js.Object {
    var Entries: ListDevicePositionsResponseEntryList
    var NextToken: js.UndefOr[Token]
  }

  object ListDevicePositionsResponse {
    @inline
    def apply(
        Entries: ListDevicePositionsResponseEntryList,
        NextToken: js.UndefOr[Token] = js.undefined
    ): ListDevicePositionsResponse = {
      val __obj = js.Dynamic.literal(
        "Entries" -> Entries.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDevicePositionsResponse]
    }
  }

  /** Contains the tracker resource details.
    */
  @js.native
  trait ListDevicePositionsResponseEntry extends js.Object {
    var DeviceId: Id
    var Position: Position
    var SampleTime: Timestamp
    var Accuracy: js.UndefOr[PositionalAccuracy]
    var PositionProperties: js.UndefOr[PropertyMap]
  }

  object ListDevicePositionsResponseEntry {
    @inline
    def apply(
        DeviceId: Id,
        Position: Position,
        SampleTime: Timestamp,
        Accuracy: js.UndefOr[PositionalAccuracy] = js.undefined,
        PositionProperties: js.UndefOr[PropertyMap] = js.undefined
    ): ListDevicePositionsResponseEntry = {
      val __obj = js.Dynamic.literal(
        "DeviceId" -> DeviceId.asInstanceOf[js.Any],
        "Position" -> Position.asInstanceOf[js.Any],
        "SampleTime" -> SampleTime.asInstanceOf[js.Any]
      )

      Accuracy.foreach(__v => __obj.updateDynamic("Accuracy")(__v.asInstanceOf[js.Any]))
      PositionProperties.foreach(__v => __obj.updateDynamic("PositionProperties")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDevicePositionsResponseEntry]
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

  /** A place index resource listed in your AWS account.
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
  trait ListRouteCalculatorsRequest extends js.Object {
    var MaxResults: js.UndefOr[ListRouteCalculatorsRequestMaxResultsInteger]
    var NextToken: js.UndefOr[Token]
  }

  object ListRouteCalculatorsRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[ListRouteCalculatorsRequestMaxResultsInteger] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined
    ): ListRouteCalculatorsRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListRouteCalculatorsRequest]
    }
  }

  @js.native
  trait ListRouteCalculatorsResponse extends js.Object {
    var Entries: ListRouteCalculatorsResponseEntryList
    var NextToken: js.UndefOr[Token]
  }

  object ListRouteCalculatorsResponse {
    @inline
    def apply(
        Entries: ListRouteCalculatorsResponseEntryList,
        NextToken: js.UndefOr[Token] = js.undefined
    ): ListRouteCalculatorsResponse = {
      val __obj = js.Dynamic.literal(
        "Entries" -> Entries.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListRouteCalculatorsResponse]
    }
  }

  /** A route calculator resource listed in your AWS account.
    */
  @js.native
  trait ListRouteCalculatorsResponseEntry extends js.Object {
    var CalculatorName: ResourceName
    var CreateTime: Timestamp
    var DataSource: String
    var Description: ResourceDescription
    var PricingPlan: PricingPlan
    var UpdateTime: Timestamp
  }

  object ListRouteCalculatorsResponseEntry {
    @inline
    def apply(
        CalculatorName: ResourceName,
        CreateTime: Timestamp,
        DataSource: String,
        Description: ResourceDescription,
        PricingPlan: PricingPlan,
        UpdateTime: Timestamp
    ): ListRouteCalculatorsResponseEntry = {
      val __obj = js.Dynamic.literal(
        "CalculatorName" -> CalculatorName.asInstanceOf[js.Any],
        "CreateTime" -> CreateTime.asInstanceOf[js.Any],
        "DataSource" -> DataSource.asInstanceOf[js.Any],
        "Description" -> Description.asInstanceOf[js.Any],
        "PricingPlan" -> PricingPlan.asInstanceOf[js.Any],
        "UpdateTime" -> UpdateTime.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ListRouteCalculatorsResponseEntry]
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
    var Tags: js.UndefOr[TagMap]
  }

  object ListTagsForResourceResponse {
    @inline
    def apply(
        Tags: js.UndefOr[TagMap] = js.undefined
    ): ListTagsForResourceResponse = {
      val __obj = js.Dynamic.literal()
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceResponse]
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
    var Interpolated: js.UndefOr[Boolean]
    var Label: js.UndefOr[String]
    var Municipality: js.UndefOr[String]
    var Neighborhood: js.UndefOr[String]
    var PostalCode: js.UndefOr[String]
    var Region: js.UndefOr[String]
    var Street: js.UndefOr[String]
    var SubRegion: js.UndefOr[String]
    var TimeZone: js.UndefOr[TimeZone]
  }

  object Place {
    @inline
    def apply(
        Geometry: PlaceGeometry,
        AddressNumber: js.UndefOr[String] = js.undefined,
        Country: js.UndefOr[String] = js.undefined,
        Interpolated: js.UndefOr[Boolean] = js.undefined,
        Label: js.UndefOr[String] = js.undefined,
        Municipality: js.UndefOr[String] = js.undefined,
        Neighborhood: js.UndefOr[String] = js.undefined,
        PostalCode: js.UndefOr[String] = js.undefined,
        Region: js.UndefOr[String] = js.undefined,
        Street: js.UndefOr[String] = js.undefined,
        SubRegion: js.UndefOr[String] = js.undefined,
        TimeZone: js.UndefOr[TimeZone] = js.undefined
    ): Place = {
      val __obj = js.Dynamic.literal(
        "Geometry" -> Geometry.asInstanceOf[js.Any]
      )

      AddressNumber.foreach(__v => __obj.updateDynamic("AddressNumber")(__v.asInstanceOf[js.Any]))
      Country.foreach(__v => __obj.updateDynamic("Country")(__v.asInstanceOf[js.Any]))
      Interpolated.foreach(__v => __obj.updateDynamic("Interpolated")(__v.asInstanceOf[js.Any]))
      Label.foreach(__v => __obj.updateDynamic("Label")(__v.asInstanceOf[js.Any]))
      Municipality.foreach(__v => __obj.updateDynamic("Municipality")(__v.asInstanceOf[js.Any]))
      Neighborhood.foreach(__v => __obj.updateDynamic("Neighborhood")(__v.asInstanceOf[js.Any]))
      PostalCode.foreach(__v => __obj.updateDynamic("PostalCode")(__v.asInstanceOf[js.Any]))
      Region.foreach(__v => __obj.updateDynamic("Region")(__v.asInstanceOf[js.Any]))
      Street.foreach(__v => __obj.updateDynamic("Street")(__v.asInstanceOf[js.Any]))
      SubRegion.foreach(__v => __obj.updateDynamic("SubRegion")(__v.asInstanceOf[js.Any]))
      TimeZone.foreach(__v => __obj.updateDynamic("TimeZone")(__v.asInstanceOf[js.Any]))
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

  /** Defines the level of certainty of the position.
    */
  @js.native
  trait PositionalAccuracy extends js.Object {
    var Horizontal: PositionalAccuracyHorizontalDouble
  }

  object PositionalAccuracy {
    @inline
    def apply(
        Horizontal: PositionalAccuracyHorizontalDouble
    ): PositionalAccuracy = {
      val __obj = js.Dynamic.literal(
        "Horizontal" -> Horizontal.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[PositionalAccuracy]
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

  /** Contains a search result from a position search query that is run on a place index resource.
    */
  @js.native
  trait SearchForPositionResult extends js.Object {
    var Distance: SearchForPositionResultDistanceDouble
    var Place: Place
  }

  object SearchForPositionResult {
    @inline
    def apply(
        Distance: SearchForPositionResultDistanceDouble,
        Place: Place
    ): SearchForPositionResult = {
      val __obj = js.Dynamic.literal(
        "Distance" -> Distance.asInstanceOf[js.Any],
        "Place" -> Place.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[SearchForPositionResult]
    }
  }

  /** Contains a place suggestion resulting from a place suggestion query that is run on a place index resource.
    */
  @js.native
  trait SearchForSuggestionsResult extends js.Object {
    var Text: String
  }

  object SearchForSuggestionsResult {
    @inline
    def apply(
        Text: String
    ): SearchForSuggestionsResult = {
      val __obj = js.Dynamic.literal(
        "Text" -> Text.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[SearchForSuggestionsResult]
    }
  }

  /** Contains a search result from a text search query that is run on a place index resource.
    */
  @js.native
  trait SearchForTextResult extends js.Object {
    var Place: Place
    var Distance: js.UndefOr[SearchForTextResultDistanceDouble]
    var Relevance: js.UndefOr[SearchForTextResultRelevanceDouble]
  }

  object SearchForTextResult {
    @inline
    def apply(
        Place: Place,
        Distance: js.UndefOr[SearchForTextResultDistanceDouble] = js.undefined,
        Relevance: js.UndefOr[SearchForTextResultRelevanceDouble] = js.undefined
    ): SearchForTextResult = {
      val __obj = js.Dynamic.literal(
        "Place" -> Place.asInstanceOf[js.Any]
      )

      Distance.foreach(__v => __obj.updateDynamic("Distance")(__v.asInstanceOf[js.Any]))
      Relevance.foreach(__v => __obj.updateDynamic("Relevance")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SearchForTextResult]
    }
  }

  @js.native
  trait SearchPlaceIndexForPositionRequest extends js.Object {
    var IndexName: ResourceName
    var Position: Position
    var Language: js.UndefOr[LanguageTag]
    var MaxResults: js.UndefOr[PlaceIndexSearchResultLimit]
  }

  object SearchPlaceIndexForPositionRequest {
    @inline
    def apply(
        IndexName: ResourceName,
        Position: Position,
        Language: js.UndefOr[LanguageTag] = js.undefined,
        MaxResults: js.UndefOr[PlaceIndexSearchResultLimit] = js.undefined
    ): SearchPlaceIndexForPositionRequest = {
      val __obj = js.Dynamic.literal(
        "IndexName" -> IndexName.asInstanceOf[js.Any],
        "Position" -> Position.asInstanceOf[js.Any]
      )

      Language.foreach(__v => __obj.updateDynamic("Language")(__v.asInstanceOf[js.Any]))
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

  /** A summary of the request sent by using <code>SearchPlaceIndexForPosition</code>.
    */
  @js.native
  trait SearchPlaceIndexForPositionSummary extends js.Object {
    var DataSource: String
    var Position: Position
    var Language: js.UndefOr[LanguageTag]
    var MaxResults: js.UndefOr[PlaceIndexSearchResultLimit]
  }

  object SearchPlaceIndexForPositionSummary {
    @inline
    def apply(
        DataSource: String,
        Position: Position,
        Language: js.UndefOr[LanguageTag] = js.undefined,
        MaxResults: js.UndefOr[PlaceIndexSearchResultLimit] = js.undefined
    ): SearchPlaceIndexForPositionSummary = {
      val __obj = js.Dynamic.literal(
        "DataSource" -> DataSource.asInstanceOf[js.Any],
        "Position" -> Position.asInstanceOf[js.Any]
      )

      Language.foreach(__v => __obj.updateDynamic("Language")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SearchPlaceIndexForPositionSummary]
    }
  }

  @js.native
  trait SearchPlaceIndexForSuggestionsRequest extends js.Object {
    var IndexName: ResourceName
    var Text: SyntheticSearchPlaceIndexForSuggestionsRequestString
    var BiasPosition: js.UndefOr[Position]
    var FilterBBox: js.UndefOr[BoundingBox]
    var FilterCountries: js.UndefOr[CountryCodeList]
    var Language: js.UndefOr[LanguageTag]
    var MaxResults: js.UndefOr[SearchPlaceIndexForSuggestionsRequestMaxResultsInteger]
  }

  object SearchPlaceIndexForSuggestionsRequest {
    @inline
    def apply(
        IndexName: ResourceName,
        Text: SyntheticSearchPlaceIndexForSuggestionsRequestString,
        BiasPosition: js.UndefOr[Position] = js.undefined,
        FilterBBox: js.UndefOr[BoundingBox] = js.undefined,
        FilterCountries: js.UndefOr[CountryCodeList] = js.undefined,
        Language: js.UndefOr[LanguageTag] = js.undefined,
        MaxResults: js.UndefOr[SearchPlaceIndexForSuggestionsRequestMaxResultsInteger] = js.undefined
    ): SearchPlaceIndexForSuggestionsRequest = {
      val __obj = js.Dynamic.literal(
        "IndexName" -> IndexName.asInstanceOf[js.Any],
        "Text" -> Text.asInstanceOf[js.Any]
      )

      BiasPosition.foreach(__v => __obj.updateDynamic("BiasPosition")(__v.asInstanceOf[js.Any]))
      FilterBBox.foreach(__v => __obj.updateDynamic("FilterBBox")(__v.asInstanceOf[js.Any]))
      FilterCountries.foreach(__v => __obj.updateDynamic("FilterCountries")(__v.asInstanceOf[js.Any]))
      Language.foreach(__v => __obj.updateDynamic("Language")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SearchPlaceIndexForSuggestionsRequest]
    }
  }

  @js.native
  trait SearchPlaceIndexForSuggestionsResponse extends js.Object {
    var Results: SearchForSuggestionsResultList
    var Summary: SearchPlaceIndexForSuggestionsSummary
  }

  object SearchPlaceIndexForSuggestionsResponse {
    @inline
    def apply(
        Results: SearchForSuggestionsResultList,
        Summary: SearchPlaceIndexForSuggestionsSummary
    ): SearchPlaceIndexForSuggestionsResponse = {
      val __obj = js.Dynamic.literal(
        "Results" -> Results.asInstanceOf[js.Any],
        "Summary" -> Summary.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[SearchPlaceIndexForSuggestionsResponse]
    }
  }

  /** A summary of the request sent by using <code>SearchPlaceIndexForSuggestions</code>.
    */
  @js.native
  trait SearchPlaceIndexForSuggestionsSummary extends js.Object {
    var DataSource: String
    var Text: SyntheticSearchPlaceIndexForSuggestionsSummaryString
    var BiasPosition: js.UndefOr[Position]
    var FilterBBox: js.UndefOr[BoundingBox]
    var FilterCountries: js.UndefOr[CountryCodeList]
    var Language: js.UndefOr[LanguageTag]
    var MaxResults: js.UndefOr[Int]
  }

  object SearchPlaceIndexForSuggestionsSummary {
    @inline
    def apply(
        DataSource: String,
        Text: SyntheticSearchPlaceIndexForSuggestionsSummaryString,
        BiasPosition: js.UndefOr[Position] = js.undefined,
        FilterBBox: js.UndefOr[BoundingBox] = js.undefined,
        FilterCountries: js.UndefOr[CountryCodeList] = js.undefined,
        Language: js.UndefOr[LanguageTag] = js.undefined,
        MaxResults: js.UndefOr[Int] = js.undefined
    ): SearchPlaceIndexForSuggestionsSummary = {
      val __obj = js.Dynamic.literal(
        "DataSource" -> DataSource.asInstanceOf[js.Any],
        "Text" -> Text.asInstanceOf[js.Any]
      )

      BiasPosition.foreach(__v => __obj.updateDynamic("BiasPosition")(__v.asInstanceOf[js.Any]))
      FilterBBox.foreach(__v => __obj.updateDynamic("FilterBBox")(__v.asInstanceOf[js.Any]))
      FilterCountries.foreach(__v => __obj.updateDynamic("FilterCountries")(__v.asInstanceOf[js.Any]))
      Language.foreach(__v => __obj.updateDynamic("Language")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SearchPlaceIndexForSuggestionsSummary]
    }
  }

  @js.native
  trait SearchPlaceIndexForTextRequest extends js.Object {
    var IndexName: ResourceName
    var Text: SyntheticSearchPlaceIndexForTextRequestString
    var BiasPosition: js.UndefOr[Position]
    var FilterBBox: js.UndefOr[BoundingBox]
    var FilterCountries: js.UndefOr[CountryCodeList]
    var Language: js.UndefOr[LanguageTag]
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
        Language: js.UndefOr[LanguageTag] = js.undefined,
        MaxResults: js.UndefOr[PlaceIndexSearchResultLimit] = js.undefined
    ): SearchPlaceIndexForTextRequest = {
      val __obj = js.Dynamic.literal(
        "IndexName" -> IndexName.asInstanceOf[js.Any],
        "Text" -> Text.asInstanceOf[js.Any]
      )

      BiasPosition.foreach(__v => __obj.updateDynamic("BiasPosition")(__v.asInstanceOf[js.Any]))
      FilterBBox.foreach(__v => __obj.updateDynamic("FilterBBox")(__v.asInstanceOf[js.Any]))
      FilterCountries.foreach(__v => __obj.updateDynamic("FilterCountries")(__v.asInstanceOf[js.Any]))
      Language.foreach(__v => __obj.updateDynamic("Language")(__v.asInstanceOf[js.Any]))
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

  /** A summary of the request sent by using <code>SearchPlaceIndexForText</code>.
    */
  @js.native
  trait SearchPlaceIndexForTextSummary extends js.Object {
    var DataSource: String
    var Text: SyntheticSearchPlaceIndexForTextSummaryString
    var BiasPosition: js.UndefOr[Position]
    var FilterBBox: js.UndefOr[BoundingBox]
    var FilterCountries: js.UndefOr[CountryCodeList]
    var Language: js.UndefOr[LanguageTag]
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
        Language: js.UndefOr[LanguageTag] = js.undefined,
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
      Language.foreach(__v => __obj.updateDynamic("Language")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      ResultBBox.foreach(__v => __obj.updateDynamic("ResultBBox")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SearchPlaceIndexForTextSummary]
    }
  }

  /** Represents an element of a leg within a route. A step contains instructions for how to move to the next step in the leg.
    */
  @js.native
  trait Step extends js.Object {
    var Distance: StepDistanceDouble
    var DurationSeconds: StepDurationSecondsDouble
    var EndPosition: Position
    var StartPosition: Position
    var GeometryOffset: js.UndefOr[StepGeometryOffsetInteger]
  }

  object Step {
    @inline
    def apply(
        Distance: StepDistanceDouble,
        DurationSeconds: StepDurationSecondsDouble,
        EndPosition: Position,
        StartPosition: Position,
        GeometryOffset: js.UndefOr[StepGeometryOffsetInteger] = js.undefined
    ): Step = {
      val __obj = js.Dynamic.literal(
        "Distance" -> Distance.asInstanceOf[js.Any],
        "DurationSeconds" -> DurationSeconds.asInstanceOf[js.Any],
        "EndPosition" -> EndPosition.asInstanceOf[js.Any],
        "StartPosition" -> StartPosition.asInstanceOf[js.Any]
      )

      GeometryOffset.foreach(__v => __obj.updateDynamic("GeometryOffset")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Step]
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

  /** Information about a time zone. Includes the name of the time zone and the offset from UTC in seconds.
    */
  @js.native
  trait TimeZone extends js.Object {
    var Name: String
    var Offset: js.UndefOr[Int]
  }

  object TimeZone {
    @inline
    def apply(
        Name: String,
        Offset: js.UndefOr[Int] = js.undefined
    ): TimeZone = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      Offset.foreach(__v => __obj.updateDynamic("Offset")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TimeZone]
    }
  }

  /** Contains details about the truck dimensions in the unit of measurement that you specify. Used to filter out roads that can't support or allow the specified dimensions for requests that specify <code>TravelMode</code> as <code>Truck</code>.
    */
  @js.native
  trait TruckDimensions extends js.Object {
    var Height: js.UndefOr[TruckDimensionsHeightDouble]
    var Length: js.UndefOr[TruckDimensionsLengthDouble]
    var Unit: js.UndefOr[DimensionUnit]
    var Width: js.UndefOr[TruckDimensionsWidthDouble]
  }

  object TruckDimensions {
    @inline
    def apply(
        Height: js.UndefOr[TruckDimensionsHeightDouble] = js.undefined,
        Length: js.UndefOr[TruckDimensionsLengthDouble] = js.undefined,
        Unit: js.UndefOr[DimensionUnit] = js.undefined,
        Width: js.UndefOr[TruckDimensionsWidthDouble] = js.undefined
    ): TruckDimensions = {
      val __obj = js.Dynamic.literal()
      Height.foreach(__v => __obj.updateDynamic("Height")(__v.asInstanceOf[js.Any]))
      Length.foreach(__v => __obj.updateDynamic("Length")(__v.asInstanceOf[js.Any]))
      Unit.foreach(__v => __obj.updateDynamic("Unit")(__v.asInstanceOf[js.Any]))
      Width.foreach(__v => __obj.updateDynamic("Width")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TruckDimensions]
    }
  }

  /** Contains details about the truck's weight specifications. Used to avoid roads that can't support or allow the total weight for requests that specify <code>TravelMode</code> as <code>Truck</code>.
    */
  @js.native
  trait TruckWeight extends js.Object {
    var Total: js.UndefOr[TruckWeightTotalDouble]
    var Unit: js.UndefOr[VehicleWeightUnit]
  }

  object TruckWeight {
    @inline
    def apply(
        Total: js.UndefOr[TruckWeightTotalDouble] = js.undefined,
        Unit: js.UndefOr[VehicleWeightUnit] = js.undefined
    ): TruckWeight = {
      val __obj = js.Dynamic.literal()
      Total.foreach(__v => __obj.updateDynamic("Total")(__v.asInstanceOf[js.Any]))
      Unit.foreach(__v => __obj.updateDynamic("Unit")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TruckWeight]
    }
  }

  @js.native
  trait UntagResourceRequest extends js.Object {
    var ResourceArn: Arn
    var TagKeys: TagKeys
  }

  object UntagResourceRequest {
    @inline
    def apply(
        ResourceArn: Arn,
        TagKeys: TagKeys
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
  trait UpdateGeofenceCollectionRequest extends js.Object {
    var CollectionName: ResourceName
    var Description: js.UndefOr[ResourceDescription]
    var PricingPlan: js.UndefOr[PricingPlan]
    var PricingPlanDataSource: js.UndefOr[String]
  }

  object UpdateGeofenceCollectionRequest {
    @inline
    def apply(
        CollectionName: ResourceName,
        Description: js.UndefOr[ResourceDescription] = js.undefined,
        PricingPlan: js.UndefOr[PricingPlan] = js.undefined,
        PricingPlanDataSource: js.UndefOr[String] = js.undefined
    ): UpdateGeofenceCollectionRequest = {
      val __obj = js.Dynamic.literal(
        "CollectionName" -> CollectionName.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      PricingPlan.foreach(__v => __obj.updateDynamic("PricingPlan")(__v.asInstanceOf[js.Any]))
      PricingPlanDataSource.foreach(__v => __obj.updateDynamic("PricingPlanDataSource")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateGeofenceCollectionRequest]
    }
  }

  @js.native
  trait UpdateGeofenceCollectionResponse extends js.Object {
    var CollectionArn: Arn
    var CollectionName: ResourceName
    var UpdateTime: Timestamp
  }

  object UpdateGeofenceCollectionResponse {
    @inline
    def apply(
        CollectionArn: Arn,
        CollectionName: ResourceName,
        UpdateTime: Timestamp
    ): UpdateGeofenceCollectionResponse = {
      val __obj = js.Dynamic.literal(
        "CollectionArn" -> CollectionArn.asInstanceOf[js.Any],
        "CollectionName" -> CollectionName.asInstanceOf[js.Any],
        "UpdateTime" -> UpdateTime.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateGeofenceCollectionResponse]
    }
  }

  @js.native
  trait UpdateMapRequest extends js.Object {
    var MapName: ResourceName
    var Description: js.UndefOr[ResourceDescription]
    var PricingPlan: js.UndefOr[PricingPlan]
  }

  object UpdateMapRequest {
    @inline
    def apply(
        MapName: ResourceName,
        Description: js.UndefOr[ResourceDescription] = js.undefined,
        PricingPlan: js.UndefOr[PricingPlan] = js.undefined
    ): UpdateMapRequest = {
      val __obj = js.Dynamic.literal(
        "MapName" -> MapName.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      PricingPlan.foreach(__v => __obj.updateDynamic("PricingPlan")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateMapRequest]
    }
  }

  @js.native
  trait UpdateMapResponse extends js.Object {
    var MapArn: Arn
    var MapName: ResourceName
    var UpdateTime: Timestamp
  }

  object UpdateMapResponse {
    @inline
    def apply(
        MapArn: Arn,
        MapName: ResourceName,
        UpdateTime: Timestamp
    ): UpdateMapResponse = {
      val __obj = js.Dynamic.literal(
        "MapArn" -> MapArn.asInstanceOf[js.Any],
        "MapName" -> MapName.asInstanceOf[js.Any],
        "UpdateTime" -> UpdateTime.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateMapResponse]
    }
  }

  @js.native
  trait UpdatePlaceIndexRequest extends js.Object {
    var IndexName: ResourceName
    var DataSourceConfiguration: js.UndefOr[DataSourceConfiguration]
    var Description: js.UndefOr[ResourceDescription]
    var PricingPlan: js.UndefOr[PricingPlan]
  }

  object UpdatePlaceIndexRequest {
    @inline
    def apply(
        IndexName: ResourceName,
        DataSourceConfiguration: js.UndefOr[DataSourceConfiguration] = js.undefined,
        Description: js.UndefOr[ResourceDescription] = js.undefined,
        PricingPlan: js.UndefOr[PricingPlan] = js.undefined
    ): UpdatePlaceIndexRequest = {
      val __obj = js.Dynamic.literal(
        "IndexName" -> IndexName.asInstanceOf[js.Any]
      )

      DataSourceConfiguration.foreach(__v => __obj.updateDynamic("DataSourceConfiguration")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      PricingPlan.foreach(__v => __obj.updateDynamic("PricingPlan")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdatePlaceIndexRequest]
    }
  }

  @js.native
  trait UpdatePlaceIndexResponse extends js.Object {
    var IndexArn: Arn
    var IndexName: ResourceName
    var UpdateTime: Timestamp
  }

  object UpdatePlaceIndexResponse {
    @inline
    def apply(
        IndexArn: Arn,
        IndexName: ResourceName,
        UpdateTime: Timestamp
    ): UpdatePlaceIndexResponse = {
      val __obj = js.Dynamic.literal(
        "IndexArn" -> IndexArn.asInstanceOf[js.Any],
        "IndexName" -> IndexName.asInstanceOf[js.Any],
        "UpdateTime" -> UpdateTime.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdatePlaceIndexResponse]
    }
  }

  @js.native
  trait UpdateRouteCalculatorRequest extends js.Object {
    var CalculatorName: ResourceName
    var Description: js.UndefOr[ResourceDescription]
    var PricingPlan: js.UndefOr[PricingPlan]
  }

  object UpdateRouteCalculatorRequest {
    @inline
    def apply(
        CalculatorName: ResourceName,
        Description: js.UndefOr[ResourceDescription] = js.undefined,
        PricingPlan: js.UndefOr[PricingPlan] = js.undefined
    ): UpdateRouteCalculatorRequest = {
      val __obj = js.Dynamic.literal(
        "CalculatorName" -> CalculatorName.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      PricingPlan.foreach(__v => __obj.updateDynamic("PricingPlan")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateRouteCalculatorRequest]
    }
  }

  @js.native
  trait UpdateRouteCalculatorResponse extends js.Object {
    var CalculatorArn: Arn
    var CalculatorName: ResourceName
    var UpdateTime: Timestamp
  }

  object UpdateRouteCalculatorResponse {
    @inline
    def apply(
        CalculatorArn: Arn,
        CalculatorName: ResourceName,
        UpdateTime: Timestamp
    ): UpdateRouteCalculatorResponse = {
      val __obj = js.Dynamic.literal(
        "CalculatorArn" -> CalculatorArn.asInstanceOf[js.Any],
        "CalculatorName" -> CalculatorName.asInstanceOf[js.Any],
        "UpdateTime" -> UpdateTime.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateRouteCalculatorResponse]
    }
  }

  @js.native
  trait UpdateTrackerRequest extends js.Object {
    var TrackerName: ResourceName
    var Description: js.UndefOr[ResourceDescription]
    var PositionFiltering: js.UndefOr[PositionFiltering]
    var PricingPlan: js.UndefOr[PricingPlan]
    var PricingPlanDataSource: js.UndefOr[String]
  }

  object UpdateTrackerRequest {
    @inline
    def apply(
        TrackerName: ResourceName,
        Description: js.UndefOr[ResourceDescription] = js.undefined,
        PositionFiltering: js.UndefOr[PositionFiltering] = js.undefined,
        PricingPlan: js.UndefOr[PricingPlan] = js.undefined,
        PricingPlanDataSource: js.UndefOr[String] = js.undefined
    ): UpdateTrackerRequest = {
      val __obj = js.Dynamic.literal(
        "TrackerName" -> TrackerName.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      PositionFiltering.foreach(__v => __obj.updateDynamic("PositionFiltering")(__v.asInstanceOf[js.Any]))
      PricingPlan.foreach(__v => __obj.updateDynamic("PricingPlan")(__v.asInstanceOf[js.Any]))
      PricingPlanDataSource.foreach(__v => __obj.updateDynamic("PricingPlanDataSource")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateTrackerRequest]
    }
  }

  @js.native
  trait UpdateTrackerResponse extends js.Object {
    var TrackerArn: Arn
    var TrackerName: ResourceName
    var UpdateTime: Timestamp
  }

  object UpdateTrackerResponse {
    @inline
    def apply(
        TrackerArn: Arn,
        TrackerName: ResourceName,
        UpdateTime: Timestamp
    ): UpdateTrackerResponse = {
      val __obj = js.Dynamic.literal(
        "TrackerArn" -> TrackerArn.asInstanceOf[js.Any],
        "TrackerName" -> TrackerName.asInstanceOf[js.Any],
        "UpdateTime" -> UpdateTime.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateTrackerResponse]
    }
  }
}
