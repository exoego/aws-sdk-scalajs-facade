package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import scala.language.implicitConversions
import facade.amazonaws._

package object sagemakergeospatial {
  type Arn = String
  type AssetsMap = js.Dictionary[AssetValue]
  type BinaryFile = js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type DataCollectionArn = String
  type DataCollectionsList = js.Array[RasterDataCollectionMetadata]
  type EarthObservationJobArn = String
  type EarthObservationJobList = js.Array[ListEarthObservationJobOutputConfig]
  type EarthObservationJobOutputBands = js.Array[OutputBand]
  type FilterList = js.Array[Filter]
  type ImageSourceBandList = js.Array[String]
  type ItemSourceList = js.Array[ItemSource]
  type LinearRing = js.Array[Position]
  type LinearRings = js.Array[LinearRing]
  type LinearRingsList = js.Array[LinearRings]
  type ListEarthObservationJobInputMaxResultsInteger = Int
  type ListRasterDataCollectionsInputMaxResultsInteger = Int
  type ListVectorEnrichmentJobInputMaxResultsInteger = Int
  type NextToken = String
  type OperationsListInput = js.Array[Operation]
  type Position = js.Array[Double]
  type PropertyFiltersList = js.Array[PropertyFilter]
  type StringListInput = js.Array[String]
  type TagKeyList = js.Array[String]
  type Tags = js.Dictionary[String]
  type TemporalStatisticsListInput = js.Array[TemporalStatistics]
  type Timestamp = js.Date
  type VectorEnrichmentJobArn = String
  type VectorEnrichmentJobList = js.Array[ListVectorEnrichmentJobOutputConfig]
  type ZonalStatisticsListInput = js.Array[ZonalStatistics]

  final class SageMakerGeospatialOps(private val service: SageMakerGeospatial) extends AnyVal {

    @inline def deleteEarthObservationJobFuture(params: DeleteEarthObservationJobInput): Future[DeleteEarthObservationJobOutput] = service.deleteEarthObservationJob(params).promise().toFuture
    @inline def deleteVectorEnrichmentJobFuture(params: DeleteVectorEnrichmentJobInput): Future[DeleteVectorEnrichmentJobOutput] = service.deleteVectorEnrichmentJob(params).promise().toFuture
    @inline def exportEarthObservationJobFuture(params: ExportEarthObservationJobInput): Future[ExportEarthObservationJobOutput] = service.exportEarthObservationJob(params).promise().toFuture
    @inline def exportVectorEnrichmentJobFuture(params: ExportVectorEnrichmentJobInput): Future[ExportVectorEnrichmentJobOutput] = service.exportVectorEnrichmentJob(params).promise().toFuture
    @inline def getEarthObservationJobFuture(params: GetEarthObservationJobInput): Future[GetEarthObservationJobOutput] = service.getEarthObservationJob(params).promise().toFuture
    @inline def getRasterDataCollectionFuture(params: GetRasterDataCollectionInput): Future[GetRasterDataCollectionOutput] = service.getRasterDataCollection(params).promise().toFuture
    @inline def getTileFuture(params: GetTileInput): Future[GetTileOutput] = service.getTile(params).promise().toFuture
    @inline def getVectorEnrichmentJobFuture(params: GetVectorEnrichmentJobInput): Future[GetVectorEnrichmentJobOutput] = service.getVectorEnrichmentJob(params).promise().toFuture
    @inline def listEarthObservationJobsFuture(params: ListEarthObservationJobInput): Future[ListEarthObservationJobOutput] = service.listEarthObservationJobs(params).promise().toFuture
    @inline def listRasterDataCollectionsFuture(params: ListRasterDataCollectionsInput): Future[ListRasterDataCollectionsOutput] = service.listRasterDataCollections(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] = service.listTagsForResource(params).promise().toFuture
    @inline def listVectorEnrichmentJobsFuture(params: ListVectorEnrichmentJobInput): Future[ListVectorEnrichmentJobOutput] = service.listVectorEnrichmentJobs(params).promise().toFuture
    @inline def searchRasterDataCollectionFuture(params: SearchRasterDataCollectionInput): Future[SearchRasterDataCollectionOutput] = service.searchRasterDataCollection(params).promise().toFuture
    @inline def startEarthObservationJobFuture(params: StartEarthObservationJobInput): Future[StartEarthObservationJobOutput] = service.startEarthObservationJob(params).promise().toFuture
    @inline def startVectorEnrichmentJobFuture(params: StartVectorEnrichmentJobInput): Future[StartVectorEnrichmentJobOutput] = service.startVectorEnrichmentJob(params).promise().toFuture
    @inline def stopEarthObservationJobFuture(params: StopEarthObservationJobInput): Future[StopEarthObservationJobOutput] = service.stopEarthObservationJob(params).promise().toFuture
    @inline def stopVectorEnrichmentJobFuture(params: StopVectorEnrichmentJobInput): Future[StopVectorEnrichmentJobOutput] = service.stopVectorEnrichmentJob(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] = service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] = service.untagResource(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/sagemakergeospatial", JSImport.Namespace, "AWS.SageMakerGeospatial")
  class SageMakerGeospatial() extends js.Object {
    def this(config: AWSConfig) = this()

    def deleteEarthObservationJob(params: DeleteEarthObservationJobInput): Request[DeleteEarthObservationJobOutput] = js.native
    def deleteVectorEnrichmentJob(params: DeleteVectorEnrichmentJobInput): Request[DeleteVectorEnrichmentJobOutput] = js.native
    def exportEarthObservationJob(params: ExportEarthObservationJobInput): Request[ExportEarthObservationJobOutput] = js.native
    def exportVectorEnrichmentJob(params: ExportVectorEnrichmentJobInput): Request[ExportVectorEnrichmentJobOutput] = js.native
    def getEarthObservationJob(params: GetEarthObservationJobInput): Request[GetEarthObservationJobOutput] = js.native
    def getRasterDataCollection(params: GetRasterDataCollectionInput): Request[GetRasterDataCollectionOutput] = js.native
    def getTile(params: GetTileInput): Request[GetTileOutput] = js.native
    def getVectorEnrichmentJob(params: GetVectorEnrichmentJobInput): Request[GetVectorEnrichmentJobOutput] = js.native
    def listEarthObservationJobs(params: ListEarthObservationJobInput): Request[ListEarthObservationJobOutput] = js.native
    def listRasterDataCollections(params: ListRasterDataCollectionsInput): Request[ListRasterDataCollectionsOutput] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def listVectorEnrichmentJobs(params: ListVectorEnrichmentJobInput): Request[ListVectorEnrichmentJobOutput] = js.native
    def searchRasterDataCollection(params: SearchRasterDataCollectionInput): Request[SearchRasterDataCollectionOutput] = js.native
    def startEarthObservationJob(params: StartEarthObservationJobInput): Request[StartEarthObservationJobOutput] = js.native
    def startVectorEnrichmentJob(params: StartVectorEnrichmentJobInput): Request[StartVectorEnrichmentJobOutput] = js.native
    def stopEarthObservationJob(params: StopEarthObservationJobInput): Request[StopEarthObservationJobOutput] = js.native
    def stopVectorEnrichmentJob(params: StopVectorEnrichmentJobInput): Request[StopVectorEnrichmentJobOutput] = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse] = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse] = js.native
  }
  object SageMakerGeospatial {
    @inline implicit def toOps(service: SageMakerGeospatial): SageMakerGeospatialOps = {
      new SageMakerGeospatialOps(service)
    }
  }

  /** <p/>
    */
  @js.native
  trait AreaOfInterest extends js.Object {
    var AreaOfInterestGeometry: js.UndefOr[AreaOfInterestGeometry]
  }

  object AreaOfInterest {
    @inline
    def apply(
        AreaOfInterestGeometry: js.UndefOr[AreaOfInterestGeometry] = js.undefined
    ): AreaOfInterest = {
      val __obj = js.Dynamic.literal()
      AreaOfInterestGeometry.foreach(__v => __obj.updateDynamic("AreaOfInterestGeometry")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AreaOfInterest]
    }
  }

  /** <p/>
    */
  @js.native
  trait AreaOfInterestGeometry extends js.Object {
    var MultiPolygonGeometry: js.UndefOr[MultiPolygonGeometryInput]
    var PolygonGeometry: js.UndefOr[PolygonGeometryInput]
  }

  object AreaOfInterestGeometry {
    @inline
    def apply(
        MultiPolygonGeometry: js.UndefOr[MultiPolygonGeometryInput] = js.undefined,
        PolygonGeometry: js.UndefOr[PolygonGeometryInput] = js.undefined
    ): AreaOfInterestGeometry = {
      val __obj = js.Dynamic.literal()
      MultiPolygonGeometry.foreach(__v => __obj.updateDynamic("MultiPolygonGeometry")(__v.asInstanceOf[js.Any]))
      PolygonGeometry.foreach(__v => __obj.updateDynamic("PolygonGeometry")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AreaOfInterestGeometry]
    }
  }

  /** <p/>
    */
  @js.native
  trait AssetValue extends js.Object {
    var Href: js.UndefOr[String]
  }

  object AssetValue {
    @inline
    def apply(
        Href: js.UndefOr[String] = js.undefined
    ): AssetValue = {
      val __obj = js.Dynamic.literal()
      Href.foreach(__v => __obj.updateDynamic("Href")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssetValue]
    }
  }

  /** <p/>
    */
  @js.native
  trait BandMathConfigInput extends js.Object {
    var CustomIndices: js.UndefOr[CustomIndicesInput]
    var PredefinedIndices: js.UndefOr[StringListInput]
  }

  object BandMathConfigInput {
    @inline
    def apply(
        CustomIndices: js.UndefOr[CustomIndicesInput] = js.undefined,
        PredefinedIndices: js.UndefOr[StringListInput] = js.undefined
    ): BandMathConfigInput = {
      val __obj = js.Dynamic.literal()
      CustomIndices.foreach(__v => __obj.updateDynamic("CustomIndices")(__v.asInstanceOf[js.Any]))
      PredefinedIndices.foreach(__v => __obj.updateDynamic("PredefinedIndices")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BandMathConfigInput]
    }
  }

  /** <p/>
    */
  @js.native
  trait CloudMaskingConfigInput extends js.Object

  object CloudMaskingConfigInput {
    @inline
    def apply(): CloudMaskingConfigInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CloudMaskingConfigInput]
    }
  }

  /** <p/>
    */
  @js.native
  trait CloudRemovalConfigInput extends js.Object {
    var AlgorithmName: js.UndefOr[AlgorithmNameCloudRemoval]
    var InterpolationValue: js.UndefOr[String]
    var TargetBands: js.UndefOr[StringListInput]
  }

  object CloudRemovalConfigInput {
    @inline
    def apply(
        AlgorithmName: js.UndefOr[AlgorithmNameCloudRemoval] = js.undefined,
        InterpolationValue: js.UndefOr[String] = js.undefined,
        TargetBands: js.UndefOr[StringListInput] = js.undefined
    ): CloudRemovalConfigInput = {
      val __obj = js.Dynamic.literal()
      AlgorithmName.foreach(__v => __obj.updateDynamic("AlgorithmName")(__v.asInstanceOf[js.Any]))
      InterpolationValue.foreach(__v => __obj.updateDynamic("InterpolationValue")(__v.asInstanceOf[js.Any]))
      TargetBands.foreach(__v => __obj.updateDynamic("TargetBands")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CloudRemovalConfigInput]
    }
  }

  /** <p/>
    */
  @js.native
  trait CustomIndicesInput extends js.Object {
    var Operations: js.UndefOr[OperationsListInput]
  }

  object CustomIndicesInput {
    @inline
    def apply(
        Operations: js.UndefOr[OperationsListInput] = js.undefined
    ): CustomIndicesInput = {
      val __obj = js.Dynamic.literal()
      Operations.foreach(__v => __obj.updateDynamic("Operations")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CustomIndicesInput]
    }
  }

  @js.native
  trait DeleteEarthObservationJobInput extends js.Object {
    var Arn: EarthObservationJobArn
  }

  object DeleteEarthObservationJobInput {
    @inline
    def apply(
        Arn: EarthObservationJobArn
    ): DeleteEarthObservationJobInput = {
      val __obj = js.Dynamic.literal(
        "Arn" -> Arn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteEarthObservationJobInput]
    }
  }

  @js.native
  trait DeleteEarthObservationJobOutput extends js.Object

  object DeleteEarthObservationJobOutput {
    @inline
    def apply(): DeleteEarthObservationJobOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteEarthObservationJobOutput]
    }
  }

  @js.native
  trait DeleteVectorEnrichmentJobInput extends js.Object {
    var Arn: VectorEnrichmentJobArn
  }

  object DeleteVectorEnrichmentJobInput {
    @inline
    def apply(
        Arn: VectorEnrichmentJobArn
    ): DeleteVectorEnrichmentJobInput = {
      val __obj = js.Dynamic.literal(
        "Arn" -> Arn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteVectorEnrichmentJobInput]
    }
  }

  @js.native
  trait DeleteVectorEnrichmentJobOutput extends js.Object

  object DeleteVectorEnrichmentJobOutput {
    @inline
    def apply(): DeleteVectorEnrichmentJobOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteVectorEnrichmentJobOutput]
    }
  }

  /** The structure representing the errors in an EarthObservationJob.
    */
  @js.native
  trait EarthObservationJobErrorDetails extends js.Object {
    var Message: js.UndefOr[String]
    var Type: js.UndefOr[EarthObservationJobErrorType]
  }

  object EarthObservationJobErrorDetails {
    @inline
    def apply(
        Message: js.UndefOr[String] = js.undefined,
        Type: js.UndefOr[EarthObservationJobErrorType] = js.undefined
    ): EarthObservationJobErrorDetails = {
      val __obj = js.Dynamic.literal()
      Message.foreach(__v => __obj.updateDynamic("Message")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EarthObservationJobErrorDetails]
    }
  }

  /** <p/>
    */
  @js.native
  trait EoCloudCoverInput extends js.Object {
    var LowerBound: Float
    var UpperBound: Float
  }

  object EoCloudCoverInput {
    @inline
    def apply(
        LowerBound: Float,
        UpperBound: Float
    ): EoCloudCoverInput = {
      val __obj = js.Dynamic.literal(
        "LowerBound" -> LowerBound.asInstanceOf[js.Any],
        "UpperBound" -> UpperBound.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[EoCloudCoverInput]
    }
  }

  /** <p/>
    */
  @js.native
  trait EojDataSourceConfigInput extends js.Object {
    var S3Data: js.UndefOr[S3DataInput]
  }

  object EojDataSourceConfigInput {
    @inline
    def apply(
        S3Data: js.UndefOr[S3DataInput] = js.undefined
    ): EojDataSourceConfigInput = {
      val __obj = js.Dynamic.literal()
      S3Data.foreach(__v => __obj.updateDynamic("S3Data")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EojDataSourceConfigInput]
    }
  }

  @js.native
  trait ExportEarthObservationJobInput extends js.Object {
    var Arn: EarthObservationJobArn
    var ExecutionRoleArn: String
    var OutputConfig: OutputConfigInput
    var ExportSourceImages: js.UndefOr[Boolean]
  }

  object ExportEarthObservationJobInput {
    @inline
    def apply(
        Arn: EarthObservationJobArn,
        ExecutionRoleArn: String,
        OutputConfig: OutputConfigInput,
        ExportSourceImages: js.UndefOr[Boolean] = js.undefined
    ): ExportEarthObservationJobInput = {
      val __obj = js.Dynamic.literal(
        "Arn" -> Arn.asInstanceOf[js.Any],
        "ExecutionRoleArn" -> ExecutionRoleArn.asInstanceOf[js.Any],
        "OutputConfig" -> OutputConfig.asInstanceOf[js.Any]
      )

      ExportSourceImages.foreach(__v => __obj.updateDynamic("ExportSourceImages")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ExportEarthObservationJobInput]
    }
  }

  @js.native
  trait ExportEarthObservationJobOutput extends js.Object {
    var Arn: EarthObservationJobArn
    var CreationTime: Timestamp
    var ExecutionRoleArn: String
    var ExportStatus: EarthObservationJobExportStatus
    var OutputConfig: OutputConfigInput
    var ExportSourceImages: js.UndefOr[Boolean]
  }

  object ExportEarthObservationJobOutput {
    @inline
    def apply(
        Arn: EarthObservationJobArn,
        CreationTime: Timestamp,
        ExecutionRoleArn: String,
        ExportStatus: EarthObservationJobExportStatus,
        OutputConfig: OutputConfigInput,
        ExportSourceImages: js.UndefOr[Boolean] = js.undefined
    ): ExportEarthObservationJobOutput = {
      val __obj = js.Dynamic.literal(
        "Arn" -> Arn.asInstanceOf[js.Any],
        "CreationTime" -> CreationTime.asInstanceOf[js.Any],
        "ExecutionRoleArn" -> ExecutionRoleArn.asInstanceOf[js.Any],
        "ExportStatus" -> ExportStatus.asInstanceOf[js.Any],
        "OutputConfig" -> OutputConfig.asInstanceOf[js.Any]
      )

      ExportSourceImages.foreach(__v => __obj.updateDynamic("ExportSourceImages")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ExportEarthObservationJobOutput]
    }
  }

  /** The structure for returning the export error details in a GetEarthObservationJob.
    */
  @js.native
  trait ExportErrorDetails extends js.Object {
    var ExportResults: js.UndefOr[ExportErrorDetailsOutput]
    var ExportSourceImages: js.UndefOr[ExportErrorDetailsOutput]
  }

  object ExportErrorDetails {
    @inline
    def apply(
        ExportResults: js.UndefOr[ExportErrorDetailsOutput] = js.undefined,
        ExportSourceImages: js.UndefOr[ExportErrorDetailsOutput] = js.undefined
    ): ExportErrorDetails = {
      val __obj = js.Dynamic.literal()
      ExportResults.foreach(__v => __obj.updateDynamic("ExportResults")(__v.asInstanceOf[js.Any]))
      ExportSourceImages.foreach(__v => __obj.updateDynamic("ExportSourceImages")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ExportErrorDetails]
    }
  }

  /** <p/>
    */
  @js.native
  trait ExportErrorDetailsOutput extends js.Object {
    var Message: js.UndefOr[String]
    var Type: js.UndefOr[ExportErrorType]
  }

  object ExportErrorDetailsOutput {
    @inline
    def apply(
        Message: js.UndefOr[String] = js.undefined,
        Type: js.UndefOr[ExportErrorType] = js.undefined
    ): ExportErrorDetailsOutput = {
      val __obj = js.Dynamic.literal()
      Message.foreach(__v => __obj.updateDynamic("Message")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ExportErrorDetailsOutput]
    }
  }

  /** <p/>
    */
  @js.native
  trait ExportS3DataInput extends js.Object {
    var S3Uri: String
    var KmsKeyId: js.UndefOr[String]
  }

  object ExportS3DataInput {
    @inline
    def apply(
        S3Uri: String,
        KmsKeyId: js.UndefOr[String] = js.undefined
    ): ExportS3DataInput = {
      val __obj = js.Dynamic.literal(
        "S3Uri" -> S3Uri.asInstanceOf[js.Any]
      )

      KmsKeyId.foreach(__v => __obj.updateDynamic("KmsKeyId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ExportS3DataInput]
    }
  }

  @js.native
  trait ExportVectorEnrichmentJobInput extends js.Object {
    var Arn: VectorEnrichmentJobArn
    var ExecutionRoleArn: String
    var OutputConfig: ExportVectorEnrichmentJobOutputConfig
  }

  object ExportVectorEnrichmentJobInput {
    @inline
    def apply(
        Arn: VectorEnrichmentJobArn,
        ExecutionRoleArn: String,
        OutputConfig: ExportVectorEnrichmentJobOutputConfig
    ): ExportVectorEnrichmentJobInput = {
      val __obj = js.Dynamic.literal(
        "Arn" -> Arn.asInstanceOf[js.Any],
        "ExecutionRoleArn" -> ExecutionRoleArn.asInstanceOf[js.Any],
        "OutputConfig" -> OutputConfig.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ExportVectorEnrichmentJobInput]
    }
  }

  @js.native
  trait ExportVectorEnrichmentJobOutput extends js.Object {
    var Arn: VectorEnrichmentJobArn
    var CreationTime: Timestamp
    var ExecutionRoleArn: String
    var ExportStatus: VectorEnrichmentJobExportStatus
    var OutputConfig: ExportVectorEnrichmentJobOutputConfig
  }

  object ExportVectorEnrichmentJobOutput {
    @inline
    def apply(
        Arn: VectorEnrichmentJobArn,
        CreationTime: Timestamp,
        ExecutionRoleArn: String,
        ExportStatus: VectorEnrichmentJobExportStatus,
        OutputConfig: ExportVectorEnrichmentJobOutputConfig
    ): ExportVectorEnrichmentJobOutput = {
      val __obj = js.Dynamic.literal(
        "Arn" -> Arn.asInstanceOf[js.Any],
        "CreationTime" -> CreationTime.asInstanceOf[js.Any],
        "ExecutionRoleArn" -> ExecutionRoleArn.asInstanceOf[js.Any],
        "ExportStatus" -> ExportStatus.asInstanceOf[js.Any],
        "OutputConfig" -> OutputConfig.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ExportVectorEnrichmentJobOutput]
    }
  }

  /** An object containing information about the output file.
    */
  @js.native
  trait ExportVectorEnrichmentJobOutputConfig extends js.Object {
    var S3Data: VectorEnrichmentJobS3Data
  }

  object ExportVectorEnrichmentJobOutputConfig {
    @inline
    def apply(
        S3Data: VectorEnrichmentJobS3Data
    ): ExportVectorEnrichmentJobOutputConfig = {
      val __obj = js.Dynamic.literal(
        "S3Data" -> S3Data.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ExportVectorEnrichmentJobOutputConfig]
    }
  }

  /** The structure representing the filters supported by a RasterDataCollection.
    */
  @js.native
  trait Filter extends js.Object {
    var Name: String
    var Type: String
    var Maximum: js.UndefOr[Float]
    var Minimum: js.UndefOr[Float]
  }

  object Filter {
    @inline
    def apply(
        Name: String,
        Type: String,
        Maximum: js.UndefOr[Float] = js.undefined,
        Minimum: js.UndefOr[Float] = js.undefined
    ): Filter = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "Type" -> Type.asInstanceOf[js.Any]
      )

      Maximum.foreach(__v => __obj.updateDynamic("Maximum")(__v.asInstanceOf[js.Any]))
      Minimum.foreach(__v => __obj.updateDynamic("Minimum")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Filter]
    }
  }

  /** Input configuration information for the geomosaic.
    */
  @js.native
  trait GeoMosaicConfigInput extends js.Object {
    var AlgorithmName: js.UndefOr[AlgorithmNameGeoMosaic]
    var TargetBands: js.UndefOr[StringListInput]
  }

  object GeoMosaicConfigInput {
    @inline
    def apply(
        AlgorithmName: js.UndefOr[AlgorithmNameGeoMosaic] = js.undefined,
        TargetBands: js.UndefOr[StringListInput] = js.undefined
    ): GeoMosaicConfigInput = {
      val __obj = js.Dynamic.literal()
      AlgorithmName.foreach(__v => __obj.updateDynamic("AlgorithmName")(__v.asInstanceOf[js.Any]))
      TargetBands.foreach(__v => __obj.updateDynamic("TargetBands")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GeoMosaicConfigInput]
    }
  }

  /** <p/>
    */
  @js.native
  trait Geometry extends js.Object {
    var Coordinates: LinearRings
    var Type: String
  }

  object Geometry {
    @inline
    def apply(
        Coordinates: LinearRings,
        Type: String
    ): Geometry = {
      val __obj = js.Dynamic.literal(
        "Coordinates" -> Coordinates.asInstanceOf[js.Any],
        "Type" -> Type.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[Geometry]
    }
  }

  @js.native
  trait GetEarthObservationJobInput extends js.Object {
    var Arn: EarthObservationJobArn
  }

  object GetEarthObservationJobInput {
    @inline
    def apply(
        Arn: EarthObservationJobArn
    ): GetEarthObservationJobInput = {
      val __obj = js.Dynamic.literal(
        "Arn" -> Arn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetEarthObservationJobInput]
    }
  }

  @js.native
  trait GetEarthObservationJobOutput extends js.Object {
    var Arn: String
    var CreationTime: Timestamp
    var DurationInSeconds: Int
    var InputConfig: InputConfigOutput
    var JobConfig: JobConfigInput
    var Name: String
    var Status: EarthObservationJobStatus
    var ErrorDetails: js.UndefOr[EarthObservationJobErrorDetails]
    var ExecutionRoleArn: js.UndefOr[String]
    var ExportErrorDetails: js.UndefOr[ExportErrorDetails]
    var ExportStatus: js.UndefOr[EarthObservationJobExportStatus]
    var KmsKeyId: js.UndefOr[String]
    var OutputBands: js.UndefOr[EarthObservationJobOutputBands]
    var Tags: js.UndefOr[Tags]
  }

  object GetEarthObservationJobOutput {
    @inline
    def apply(
        Arn: String,
        CreationTime: Timestamp,
        DurationInSeconds: Int,
        InputConfig: InputConfigOutput,
        JobConfig: JobConfigInput,
        Name: String,
        Status: EarthObservationJobStatus,
        ErrorDetails: js.UndefOr[EarthObservationJobErrorDetails] = js.undefined,
        ExecutionRoleArn: js.UndefOr[String] = js.undefined,
        ExportErrorDetails: js.UndefOr[ExportErrorDetails] = js.undefined,
        ExportStatus: js.UndefOr[EarthObservationJobExportStatus] = js.undefined,
        KmsKeyId: js.UndefOr[String] = js.undefined,
        OutputBands: js.UndefOr[EarthObservationJobOutputBands] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): GetEarthObservationJobOutput = {
      val __obj = js.Dynamic.literal(
        "Arn" -> Arn.asInstanceOf[js.Any],
        "CreationTime" -> CreationTime.asInstanceOf[js.Any],
        "DurationInSeconds" -> DurationInSeconds.asInstanceOf[js.Any],
        "InputConfig" -> InputConfig.asInstanceOf[js.Any],
        "JobConfig" -> JobConfig.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
        "Status" -> Status.asInstanceOf[js.Any]
      )

      ErrorDetails.foreach(__v => __obj.updateDynamic("ErrorDetails")(__v.asInstanceOf[js.Any]))
      ExecutionRoleArn.foreach(__v => __obj.updateDynamic("ExecutionRoleArn")(__v.asInstanceOf[js.Any]))
      ExportErrorDetails.foreach(__v => __obj.updateDynamic("ExportErrorDetails")(__v.asInstanceOf[js.Any]))
      ExportStatus.foreach(__v => __obj.updateDynamic("ExportStatus")(__v.asInstanceOf[js.Any]))
      KmsKeyId.foreach(__v => __obj.updateDynamic("KmsKeyId")(__v.asInstanceOf[js.Any]))
      OutputBands.foreach(__v => __obj.updateDynamic("OutputBands")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetEarthObservationJobOutput]
    }
  }

  @js.native
  trait GetRasterDataCollectionInput extends js.Object {
    var Arn: DataCollectionArn
  }

  object GetRasterDataCollectionInput {
    @inline
    def apply(
        Arn: DataCollectionArn
    ): GetRasterDataCollectionInput = {
      val __obj = js.Dynamic.literal(
        "Arn" -> Arn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetRasterDataCollectionInput]
    }
  }

  @js.native
  trait GetRasterDataCollectionOutput extends js.Object {
    var Arn: DataCollectionArn
    var Description: String
    var DescriptionPageUrl: String
    var ImageSourceBands: ImageSourceBandList
    var Name: String
    var SupportedFilters: FilterList
    var Type: DataCollectionType
    var Tags: js.UndefOr[Tags]
  }

  object GetRasterDataCollectionOutput {
    @inline
    def apply(
        Arn: DataCollectionArn,
        Description: String,
        DescriptionPageUrl: String,
        ImageSourceBands: ImageSourceBandList,
        Name: String,
        SupportedFilters: FilterList,
        Type: DataCollectionType,
        Tags: js.UndefOr[Tags] = js.undefined
    ): GetRasterDataCollectionOutput = {
      val __obj = js.Dynamic.literal(
        "Arn" -> Arn.asInstanceOf[js.Any],
        "Description" -> Description.asInstanceOf[js.Any],
        "DescriptionPageUrl" -> DescriptionPageUrl.asInstanceOf[js.Any],
        "ImageSourceBands" -> ImageSourceBands.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
        "SupportedFilters" -> SupportedFilters.asInstanceOf[js.Any],
        "Type" -> Type.asInstanceOf[js.Any]
      )

      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetRasterDataCollectionOutput]
    }
  }

  @js.native
  trait GetTileInput extends js.Object {
    var Arn: EarthObservationJobArn
    var ImageAssets: StringListInput
    var Target: TargetOptions
    var x: Int
    var y: Int
    var z: Int
    var ImageMask: js.UndefOr[Boolean]
    var OutputDataType: js.UndefOr[OutputType]
    var OutputFormat: js.UndefOr[String]
    var PropertyFilters: js.UndefOr[String]
    var TimeRangeFilter: js.UndefOr[String]
  }

  object GetTileInput {
    @inline
    def apply(
        Arn: EarthObservationJobArn,
        ImageAssets: StringListInput,
        Target: TargetOptions,
        x: Int,
        y: Int,
        z: Int,
        ImageMask: js.UndefOr[Boolean] = js.undefined,
        OutputDataType: js.UndefOr[OutputType] = js.undefined,
        OutputFormat: js.UndefOr[String] = js.undefined,
        PropertyFilters: js.UndefOr[String] = js.undefined,
        TimeRangeFilter: js.UndefOr[String] = js.undefined
    ): GetTileInput = {
      val __obj = js.Dynamic.literal(
        "Arn" -> Arn.asInstanceOf[js.Any],
        "ImageAssets" -> ImageAssets.asInstanceOf[js.Any],
        "Target" -> Target.asInstanceOf[js.Any],
        "x" -> x.asInstanceOf[js.Any],
        "y" -> y.asInstanceOf[js.Any],
        "z" -> z.asInstanceOf[js.Any]
      )

      ImageMask.foreach(__v => __obj.updateDynamic("ImageMask")(__v.asInstanceOf[js.Any]))
      OutputDataType.foreach(__v => __obj.updateDynamic("OutputDataType")(__v.asInstanceOf[js.Any]))
      OutputFormat.foreach(__v => __obj.updateDynamic("OutputFormat")(__v.asInstanceOf[js.Any]))
      PropertyFilters.foreach(__v => __obj.updateDynamic("PropertyFilters")(__v.asInstanceOf[js.Any]))
      TimeRangeFilter.foreach(__v => __obj.updateDynamic("TimeRangeFilter")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetTileInput]
    }
  }

  @js.native
  trait GetTileOutput extends js.Object {
    var BinaryFile: js.UndefOr[BinaryFile]
  }

  object GetTileOutput {
    @inline
    def apply(
        BinaryFile: js.UndefOr[BinaryFile] = js.undefined
    ): GetTileOutput = {
      val __obj = js.Dynamic.literal()
      BinaryFile.foreach(__v => __obj.updateDynamic("BinaryFile")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetTileOutput]
    }
  }

  @js.native
  trait GetVectorEnrichmentJobInput extends js.Object {
    var Arn: VectorEnrichmentJobArn
  }

  object GetVectorEnrichmentJobInput {
    @inline
    def apply(
        Arn: VectorEnrichmentJobArn
    ): GetVectorEnrichmentJobInput = {
      val __obj = js.Dynamic.literal(
        "Arn" -> Arn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetVectorEnrichmentJobInput]
    }
  }

  @js.native
  trait GetVectorEnrichmentJobOutput extends js.Object {
    var Arn: String
    var CreationTime: Timestamp
    var DurationInSeconds: Int
    var ExecutionRoleArn: String
    var InputConfig: VectorEnrichmentJobInputConfig
    var JobConfig: VectorEnrichmentJobConfig
    var Name: String
    var Status: VectorEnrichmentJobStatus
    var Type: VectorEnrichmentJobType
    var ErrorDetails: js.UndefOr[VectorEnrichmentJobErrorDetails]
    var ExportErrorDetails: js.UndefOr[VectorEnrichmentJobExportErrorDetails]
    var ExportStatus: js.UndefOr[VectorEnrichmentJobExportStatus]
    var KmsKeyId: js.UndefOr[String]
    var Tags: js.UndefOr[Tags]
  }

  object GetVectorEnrichmentJobOutput {
    @inline
    def apply(
        Arn: String,
        CreationTime: Timestamp,
        DurationInSeconds: Int,
        ExecutionRoleArn: String,
        InputConfig: VectorEnrichmentJobInputConfig,
        JobConfig: VectorEnrichmentJobConfig,
        Name: String,
        Status: VectorEnrichmentJobStatus,
        Type: VectorEnrichmentJobType,
        ErrorDetails: js.UndefOr[VectorEnrichmentJobErrorDetails] = js.undefined,
        ExportErrorDetails: js.UndefOr[VectorEnrichmentJobExportErrorDetails] = js.undefined,
        ExportStatus: js.UndefOr[VectorEnrichmentJobExportStatus] = js.undefined,
        KmsKeyId: js.UndefOr[String] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): GetVectorEnrichmentJobOutput = {
      val __obj = js.Dynamic.literal(
        "Arn" -> Arn.asInstanceOf[js.Any],
        "CreationTime" -> CreationTime.asInstanceOf[js.Any],
        "DurationInSeconds" -> DurationInSeconds.asInstanceOf[js.Any],
        "ExecutionRoleArn" -> ExecutionRoleArn.asInstanceOf[js.Any],
        "InputConfig" -> InputConfig.asInstanceOf[js.Any],
        "JobConfig" -> JobConfig.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
        "Status" -> Status.asInstanceOf[js.Any],
        "Type" -> Type.asInstanceOf[js.Any]
      )

      ErrorDetails.foreach(__v => __obj.updateDynamic("ErrorDetails")(__v.asInstanceOf[js.Any]))
      ExportErrorDetails.foreach(__v => __obj.updateDynamic("ExportErrorDetails")(__v.asInstanceOf[js.Any]))
      ExportStatus.foreach(__v => __obj.updateDynamic("ExportStatus")(__v.asInstanceOf[js.Any]))
      KmsKeyId.foreach(__v => __obj.updateDynamic("KmsKeyId")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetVectorEnrichmentJobOutput]
    }
  }

  /** Input configuration information.
    */
  @js.native
  trait InputConfigInput extends js.Object {
    var DataSourceConfig: js.UndefOr[EojDataSourceConfigInput]
    var PreviousEarthObservationJobArn: js.UndefOr[String]
    var RasterDataCollectionQuery: js.UndefOr[RasterDataCollectionQueryInput]
  }

  object InputConfigInput {
    @inline
    def apply(
        DataSourceConfig: js.UndefOr[EojDataSourceConfigInput] = js.undefined,
        PreviousEarthObservationJobArn: js.UndefOr[String] = js.undefined,
        RasterDataCollectionQuery: js.UndefOr[RasterDataCollectionQueryInput] = js.undefined
    ): InputConfigInput = {
      val __obj = js.Dynamic.literal()
      DataSourceConfig.foreach(__v => __obj.updateDynamic("DataSourceConfig")(__v.asInstanceOf[js.Any]))
      PreviousEarthObservationJobArn.foreach(__v => __obj.updateDynamic("PreviousEarthObservationJobArn")(__v.asInstanceOf[js.Any]))
      RasterDataCollectionQuery.foreach(__v => __obj.updateDynamic("RasterDataCollectionQuery")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InputConfigInput]
    }
  }

  /** The InputConfig for an EarthObservationJob response.
    */
  @js.native
  trait InputConfigOutput extends js.Object {
    var DataSourceConfig: js.UndefOr[EojDataSourceConfigInput]
    var PreviousEarthObservationJobArn: js.UndefOr[String]
    var RasterDataCollectionQuery: js.UndefOr[RasterDataCollectionQueryOutput]
  }

  object InputConfigOutput {
    @inline
    def apply(
        DataSourceConfig: js.UndefOr[EojDataSourceConfigInput] = js.undefined,
        PreviousEarthObservationJobArn: js.UndefOr[String] = js.undefined,
        RasterDataCollectionQuery: js.UndefOr[RasterDataCollectionQueryOutput] = js.undefined
    ): InputConfigOutput = {
      val __obj = js.Dynamic.literal()
      DataSourceConfig.foreach(__v => __obj.updateDynamic("DataSourceConfig")(__v.asInstanceOf[js.Any]))
      PreviousEarthObservationJobArn.foreach(__v => __obj.updateDynamic("PreviousEarthObservationJobArn")(__v.asInstanceOf[js.Any]))
      RasterDataCollectionQuery.foreach(__v => __obj.updateDynamic("RasterDataCollectionQuery")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InputConfigOutput]
    }
  }

  /** Structure representing the items in the response for SearchRasterDataCollection.
    */
  @js.native
  trait ItemSource extends js.Object {
    var DateTime: Timestamp
    var Geometry: Geometry
    var Id: String
    var Assets: js.UndefOr[AssetsMap]
    var Properties: js.UndefOr[Properties]
  }

  object ItemSource {
    @inline
    def apply(
        DateTime: Timestamp,
        Geometry: Geometry,
        Id: String,
        Assets: js.UndefOr[AssetsMap] = js.undefined,
        Properties: js.UndefOr[Properties] = js.undefined
    ): ItemSource = {
      val __obj = js.Dynamic.literal(
        "DateTime" -> DateTime.asInstanceOf[js.Any],
        "Geometry" -> Geometry.asInstanceOf[js.Any],
        "Id" -> Id.asInstanceOf[js.Any]
      )

      Assets.foreach(__v => __obj.updateDynamic("Assets")(__v.asInstanceOf[js.Any]))
      Properties.foreach(__v => __obj.updateDynamic("Properties")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ItemSource]
    }
  }

  /** The input structure for the JobConfig in an EarthObservationJob.
    */
  @js.native
  trait JobConfigInput extends js.Object {
    var BandMathConfig: js.UndefOr[BandMathConfigInput]
    var CloudMaskingConfig: js.UndefOr[CloudMaskingConfigInput]
    var CloudRemovalConfig: js.UndefOr[CloudRemovalConfigInput]
    var GeoMosaicConfig: js.UndefOr[GeoMosaicConfigInput]
    var LandCoverSegmentationConfig: js.UndefOr[LandCoverSegmentationConfigInput]
    var ResamplingConfig: js.UndefOr[ResamplingConfigInput]
    var StackConfig: js.UndefOr[StackConfigInput]
    var TemporalStatisticsConfig: js.UndefOr[TemporalStatisticsConfigInput]
    var ZonalStatisticsConfig: js.UndefOr[ZonalStatisticsConfigInput]
  }

  object JobConfigInput {
    @inline
    def apply(
        BandMathConfig: js.UndefOr[BandMathConfigInput] = js.undefined,
        CloudMaskingConfig: js.UndefOr[CloudMaskingConfigInput] = js.undefined,
        CloudRemovalConfig: js.UndefOr[CloudRemovalConfigInput] = js.undefined,
        GeoMosaicConfig: js.UndefOr[GeoMosaicConfigInput] = js.undefined,
        LandCoverSegmentationConfig: js.UndefOr[LandCoverSegmentationConfigInput] = js.undefined,
        ResamplingConfig: js.UndefOr[ResamplingConfigInput] = js.undefined,
        StackConfig: js.UndefOr[StackConfigInput] = js.undefined,
        TemporalStatisticsConfig: js.UndefOr[TemporalStatisticsConfigInput] = js.undefined,
        ZonalStatisticsConfig: js.UndefOr[ZonalStatisticsConfigInput] = js.undefined
    ): JobConfigInput = {
      val __obj = js.Dynamic.literal()
      BandMathConfig.foreach(__v => __obj.updateDynamic("BandMathConfig")(__v.asInstanceOf[js.Any]))
      CloudMaskingConfig.foreach(__v => __obj.updateDynamic("CloudMaskingConfig")(__v.asInstanceOf[js.Any]))
      CloudRemovalConfig.foreach(__v => __obj.updateDynamic("CloudRemovalConfig")(__v.asInstanceOf[js.Any]))
      GeoMosaicConfig.foreach(__v => __obj.updateDynamic("GeoMosaicConfig")(__v.asInstanceOf[js.Any]))
      LandCoverSegmentationConfig.foreach(__v => __obj.updateDynamic("LandCoverSegmentationConfig")(__v.asInstanceOf[js.Any]))
      ResamplingConfig.foreach(__v => __obj.updateDynamic("ResamplingConfig")(__v.asInstanceOf[js.Any]))
      StackConfig.foreach(__v => __obj.updateDynamic("StackConfig")(__v.asInstanceOf[js.Any]))
      TemporalStatisticsConfig.foreach(__v => __obj.updateDynamic("TemporalStatisticsConfig")(__v.asInstanceOf[js.Any]))
      ZonalStatisticsConfig.foreach(__v => __obj.updateDynamic("ZonalStatisticsConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[JobConfigInput]
    }
  }

  /** <p/>
    */
  @js.native
  trait LandCoverSegmentationConfigInput extends js.Object

  object LandCoverSegmentationConfigInput {
    @inline
    def apply(): LandCoverSegmentationConfigInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LandCoverSegmentationConfigInput]
    }
  }

  /** <p/>
    */
  @js.native
  trait LandsatCloudCoverLandInput extends js.Object {
    var LowerBound: Float
    var UpperBound: Float
  }

  object LandsatCloudCoverLandInput {
    @inline
    def apply(
        LowerBound: Float,
        UpperBound: Float
    ): LandsatCloudCoverLandInput = {
      val __obj = js.Dynamic.literal(
        "LowerBound" -> LowerBound.asInstanceOf[js.Any],
        "UpperBound" -> UpperBound.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[LandsatCloudCoverLandInput]
    }
  }

  @js.native
  trait ListEarthObservationJobInput extends js.Object {
    var MaxResults: js.UndefOr[ListEarthObservationJobInputMaxResultsInteger]
    var NextToken: js.UndefOr[NextToken]
    var SortBy: js.UndefOr[String]
    var SortOrder: js.UndefOr[SortOrder]
    var StatusEquals: js.UndefOr[EarthObservationJobStatus]
  }

  object ListEarthObservationJobInput {
    @inline
    def apply(
        MaxResults: js.UndefOr[ListEarthObservationJobInputMaxResultsInteger] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        SortBy: js.UndefOr[String] = js.undefined,
        SortOrder: js.UndefOr[SortOrder] = js.undefined,
        StatusEquals: js.UndefOr[EarthObservationJobStatus] = js.undefined
    ): ListEarthObservationJobInput = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      SortBy.foreach(__v => __obj.updateDynamic("SortBy")(__v.asInstanceOf[js.Any]))
      SortOrder.foreach(__v => __obj.updateDynamic("SortOrder")(__v.asInstanceOf[js.Any]))
      StatusEquals.foreach(__v => __obj.updateDynamic("StatusEquals")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListEarthObservationJobInput]
    }
  }

  @js.native
  trait ListEarthObservationJobOutput extends js.Object {
    var EarthObservationJobSummaries: EarthObservationJobList
    var NextToken: js.UndefOr[NextToken]
  }

  object ListEarthObservationJobOutput {
    @inline
    def apply(
        EarthObservationJobSummaries: EarthObservationJobList,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListEarthObservationJobOutput = {
      val __obj = js.Dynamic.literal(
        "EarthObservationJobSummaries" -> EarthObservationJobSummaries.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListEarthObservationJobOutput]
    }
  }

  /** An object containing information about the output file.
    */
  @js.native
  trait ListEarthObservationJobOutputConfig extends js.Object {
    var Arn: String
    var CreationTime: Timestamp
    var DurationInSeconds: Int
    var Name: String
    var OperationType: String
    var Status: EarthObservationJobStatus
    var Tags: js.UndefOr[Tags]
  }

  object ListEarthObservationJobOutputConfig {
    @inline
    def apply(
        Arn: String,
        CreationTime: Timestamp,
        DurationInSeconds: Int,
        Name: String,
        OperationType: String,
        Status: EarthObservationJobStatus,
        Tags: js.UndefOr[Tags] = js.undefined
    ): ListEarthObservationJobOutputConfig = {
      val __obj = js.Dynamic.literal(
        "Arn" -> Arn.asInstanceOf[js.Any],
        "CreationTime" -> CreationTime.asInstanceOf[js.Any],
        "DurationInSeconds" -> DurationInSeconds.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
        "OperationType" -> OperationType.asInstanceOf[js.Any],
        "Status" -> Status.asInstanceOf[js.Any]
      )

      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListEarthObservationJobOutputConfig]
    }
  }

  @js.native
  trait ListRasterDataCollectionsInput extends js.Object {
    var MaxResults: js.UndefOr[ListRasterDataCollectionsInputMaxResultsInteger]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListRasterDataCollectionsInput {
    @inline
    def apply(
        MaxResults: js.UndefOr[ListRasterDataCollectionsInputMaxResultsInteger] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListRasterDataCollectionsInput = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListRasterDataCollectionsInput]
    }
  }

  @js.native
  trait ListRasterDataCollectionsOutput extends js.Object {
    var RasterDataCollectionSummaries: DataCollectionsList
    var NextToken: js.UndefOr[NextToken]
  }

  object ListRasterDataCollectionsOutput {
    @inline
    def apply(
        RasterDataCollectionSummaries: DataCollectionsList,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListRasterDataCollectionsOutput = {
      val __obj = js.Dynamic.literal(
        "RasterDataCollectionSummaries" -> RasterDataCollectionSummaries.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListRasterDataCollectionsOutput]
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
    var Tags: js.UndefOr[Tags]
  }

  object ListTagsForResourceResponse {
    @inline
    def apply(
        Tags: js.UndefOr[Tags] = js.undefined
    ): ListTagsForResourceResponse = {
      val __obj = js.Dynamic.literal()
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceResponse]
    }
  }

  @js.native
  trait ListVectorEnrichmentJobInput extends js.Object {
    var MaxResults: js.UndefOr[ListVectorEnrichmentJobInputMaxResultsInteger]
    var NextToken: js.UndefOr[NextToken]
    var SortBy: js.UndefOr[String]
    var SortOrder: js.UndefOr[SortOrder]
    var StatusEquals: js.UndefOr[String]
  }

  object ListVectorEnrichmentJobInput {
    @inline
    def apply(
        MaxResults: js.UndefOr[ListVectorEnrichmentJobInputMaxResultsInteger] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        SortBy: js.UndefOr[String] = js.undefined,
        SortOrder: js.UndefOr[SortOrder] = js.undefined,
        StatusEquals: js.UndefOr[String] = js.undefined
    ): ListVectorEnrichmentJobInput = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      SortBy.foreach(__v => __obj.updateDynamic("SortBy")(__v.asInstanceOf[js.Any]))
      SortOrder.foreach(__v => __obj.updateDynamic("SortOrder")(__v.asInstanceOf[js.Any]))
      StatusEquals.foreach(__v => __obj.updateDynamic("StatusEquals")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListVectorEnrichmentJobInput]
    }
  }

  @js.native
  trait ListVectorEnrichmentJobOutput extends js.Object {
    var VectorEnrichmentJobSummaries: VectorEnrichmentJobList
    var NextToken: js.UndefOr[NextToken]
  }

  object ListVectorEnrichmentJobOutput {
    @inline
    def apply(
        VectorEnrichmentJobSummaries: VectorEnrichmentJobList,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListVectorEnrichmentJobOutput = {
      val __obj = js.Dynamic.literal(
        "VectorEnrichmentJobSummaries" -> VectorEnrichmentJobSummaries.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListVectorEnrichmentJobOutput]
    }
  }

  /** An object containing information about the output file.
    */
  @js.native
  trait ListVectorEnrichmentJobOutputConfig extends js.Object {
    var Arn: VectorEnrichmentJobArn
    var CreationTime: Timestamp
    var DurationInSeconds: Int
    var Name: String
    var Status: VectorEnrichmentJobStatus
    var Type: VectorEnrichmentJobType
    var Tags: js.UndefOr[Tags]
  }

  object ListVectorEnrichmentJobOutputConfig {
    @inline
    def apply(
        Arn: VectorEnrichmentJobArn,
        CreationTime: Timestamp,
        DurationInSeconds: Int,
        Name: String,
        Status: VectorEnrichmentJobStatus,
        Type: VectorEnrichmentJobType,
        Tags: js.UndefOr[Tags] = js.undefined
    ): ListVectorEnrichmentJobOutputConfig = {
      val __obj = js.Dynamic.literal(
        "Arn" -> Arn.asInstanceOf[js.Any],
        "CreationTime" -> CreationTime.asInstanceOf[js.Any],
        "DurationInSeconds" -> DurationInSeconds.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
        "Status" -> Status.asInstanceOf[js.Any],
        "Type" -> Type.asInstanceOf[js.Any]
      )

      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListVectorEnrichmentJobOutputConfig]
    }
  }

  /** <p/>
    */
  @js.native
  trait MapMatchingConfig extends js.Object {
    var IdAttributeName: String
    var TimestampAttributeName: String
    var XAttributeName: String
    var YAttributeName: String
  }

  object MapMatchingConfig {
    @inline
    def apply(
        IdAttributeName: String,
        TimestampAttributeName: String,
        XAttributeName: String,
        YAttributeName: String
    ): MapMatchingConfig = {
      val __obj = js.Dynamic.literal(
        "IdAttributeName" -> IdAttributeName.asInstanceOf[js.Any],
        "TimestampAttributeName" -> TimestampAttributeName.asInstanceOf[js.Any],
        "XAttributeName" -> XAttributeName.asInstanceOf[js.Any],
        "YAttributeName" -> YAttributeName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[MapMatchingConfig]
    }
  }

  /** <p/>
    */
  @js.native
  trait MultiPolygonGeometryInput extends js.Object {
    var Coordinates: LinearRingsList
  }

  object MultiPolygonGeometryInput {
    @inline
    def apply(
        Coordinates: LinearRingsList
    ): MultiPolygonGeometryInput = {
      val __obj = js.Dynamic.literal(
        "Coordinates" -> Coordinates.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[MultiPolygonGeometryInput]
    }
  }

  /** <p/>
    */
  @js.native
  trait Operation extends js.Object {
    var Equation: String
    var Name: String
    var OutputType: js.UndefOr[OutputType]
  }

  object Operation {
    @inline
    def apply(
        Equation: String,
        Name: String,
        OutputType: js.UndefOr[OutputType] = js.undefined
    ): Operation = {
      val __obj = js.Dynamic.literal(
        "Equation" -> Equation.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]
      )

      OutputType.foreach(__v => __obj.updateDynamic("OutputType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Operation]
    }
  }

  /** A single EarthObservationJob output band.
    */
  @js.native
  trait OutputBand extends js.Object {
    var BandName: String
    var OutputDataType: OutputType
  }

  object OutputBand {
    @inline
    def apply(
        BandName: String,
        OutputDataType: OutputType
    ): OutputBand = {
      val __obj = js.Dynamic.literal(
        "BandName" -> BandName.asInstanceOf[js.Any],
        "OutputDataType" -> OutputDataType.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[OutputBand]
    }
  }

  /** The response structure for an OutputConfig returned by an ExportEarthObservationJob.
    */
  @js.native
  trait OutputConfigInput extends js.Object {
    var S3Data: ExportS3DataInput
  }

  object OutputConfigInput {
    @inline
    def apply(
        S3Data: ExportS3DataInput
    ): OutputConfigInput = {
      val __obj = js.Dynamic.literal(
        "S3Data" -> S3Data.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[OutputConfigInput]
    }
  }

  /** <p/>
    */
  @js.native
  trait OutputResolutionResamplingInput extends js.Object {
    var UserDefined: UserDefined
  }

  object OutputResolutionResamplingInput {
    @inline
    def apply(
        UserDefined: UserDefined
    ): OutputResolutionResamplingInput = {
      val __obj = js.Dynamic.literal(
        "UserDefined" -> UserDefined.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[OutputResolutionResamplingInput]
    }
  }

  /** <p/>
    */
  @js.native
  trait OutputResolutionStackInput extends js.Object {
    var Predefined: js.UndefOr[PredefinedResolution]
    var UserDefined: js.UndefOr[UserDefined]
  }

  object OutputResolutionStackInput {
    @inline
    def apply(
        Predefined: js.UndefOr[PredefinedResolution] = js.undefined,
        UserDefined: js.UndefOr[UserDefined] = js.undefined
    ): OutputResolutionStackInput = {
      val __obj = js.Dynamic.literal()
      Predefined.foreach(__v => __obj.updateDynamic("Predefined")(__v.asInstanceOf[js.Any]))
      UserDefined.foreach(__v => __obj.updateDynamic("UserDefined")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OutputResolutionStackInput]
    }
  }

  /** <p/>
    */
  @js.native
  trait PlatformInput extends js.Object {
    var Value: String
    var ComparisonOperator: js.UndefOr[ComparisonOperator]
  }

  object PlatformInput {
    @inline
    def apply(
        Value: String,
        ComparisonOperator: js.UndefOr[ComparisonOperator] = js.undefined
    ): PlatformInput = {
      val __obj = js.Dynamic.literal(
        "Value" -> Value.asInstanceOf[js.Any]
      )

      ComparisonOperator.foreach(__v => __obj.updateDynamic("ComparisonOperator")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PlatformInput]
    }
  }

  /** <p/>
    */
  @js.native
  trait PolygonGeometryInput extends js.Object {
    var Coordinates: LinearRings
  }

  object PolygonGeometryInput {
    @inline
    def apply(
        Coordinates: LinearRings
    ): PolygonGeometryInput = {
      val __obj = js.Dynamic.literal(
        "Coordinates" -> Coordinates.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[PolygonGeometryInput]
    }
  }

  /** <p/>
    */
  @js.native
  trait Properties extends js.Object {
    var EoCloudCover: js.UndefOr[Float]
    var LandsatCloudCoverLand: js.UndefOr[Float]
    var Platform: js.UndefOr[String]
    var ViewOffNadir: js.UndefOr[Float]
    var ViewSunAzimuth: js.UndefOr[Float]
    var ViewSunElevation: js.UndefOr[Float]
  }

  object Properties {
    @inline
    def apply(
        EoCloudCover: js.UndefOr[Float] = js.undefined,
        LandsatCloudCoverLand: js.UndefOr[Float] = js.undefined,
        Platform: js.UndefOr[String] = js.undefined,
        ViewOffNadir: js.UndefOr[Float] = js.undefined,
        ViewSunAzimuth: js.UndefOr[Float] = js.undefined,
        ViewSunElevation: js.UndefOr[Float] = js.undefined
    ): Properties = {
      val __obj = js.Dynamic.literal()
      EoCloudCover.foreach(__v => __obj.updateDynamic("EoCloudCover")(__v.asInstanceOf[js.Any]))
      LandsatCloudCoverLand.foreach(__v => __obj.updateDynamic("LandsatCloudCoverLand")(__v.asInstanceOf[js.Any]))
      Platform.foreach(__v => __obj.updateDynamic("Platform")(__v.asInstanceOf[js.Any]))
      ViewOffNadir.foreach(__v => __obj.updateDynamic("ViewOffNadir")(__v.asInstanceOf[js.Any]))
      ViewSunAzimuth.foreach(__v => __obj.updateDynamic("ViewSunAzimuth")(__v.asInstanceOf[js.Any]))
      ViewSunElevation.foreach(__v => __obj.updateDynamic("ViewSunElevation")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Properties]
    }
  }

  /** <p/>
    */
  @js.native
  trait Property extends js.Object {
    var EoCloudCover: js.UndefOr[EoCloudCoverInput]
    var LandsatCloudCoverLand: js.UndefOr[LandsatCloudCoverLandInput]
    var Platform: js.UndefOr[PlatformInput]
    var ViewOffNadir: js.UndefOr[ViewOffNadirInput]
    var ViewSunAzimuth: js.UndefOr[ViewSunAzimuthInput]
    var ViewSunElevation: js.UndefOr[ViewSunElevationInput]
  }

  object Property {
    @inline
    def apply(
        EoCloudCover: js.UndefOr[EoCloudCoverInput] = js.undefined,
        LandsatCloudCoverLand: js.UndefOr[LandsatCloudCoverLandInput] = js.undefined,
        Platform: js.UndefOr[PlatformInput] = js.undefined,
        ViewOffNadir: js.UndefOr[ViewOffNadirInput] = js.undefined,
        ViewSunAzimuth: js.UndefOr[ViewSunAzimuthInput] = js.undefined,
        ViewSunElevation: js.UndefOr[ViewSunElevationInput] = js.undefined
    ): Property = {
      val __obj = js.Dynamic.literal()
      EoCloudCover.foreach(__v => __obj.updateDynamic("EoCloudCover")(__v.asInstanceOf[js.Any]))
      LandsatCloudCoverLand.foreach(__v => __obj.updateDynamic("LandsatCloudCoverLand")(__v.asInstanceOf[js.Any]))
      Platform.foreach(__v => __obj.updateDynamic("Platform")(__v.asInstanceOf[js.Any]))
      ViewOffNadir.foreach(__v => __obj.updateDynamic("ViewOffNadir")(__v.asInstanceOf[js.Any]))
      ViewSunAzimuth.foreach(__v => __obj.updateDynamic("ViewSunAzimuth")(__v.asInstanceOf[js.Any]))
      ViewSunElevation.foreach(__v => __obj.updateDynamic("ViewSunElevation")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Property]
    }
  }

  /** <p/>
    */
  @js.native
  trait PropertyFilter extends js.Object {
    var Property: Property
  }

  object PropertyFilter {
    @inline
    def apply(
        Property: Property
    ): PropertyFilter = {
      val __obj = js.Dynamic.literal(
        "Property" -> Property.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[PropertyFilter]
    }
  }

  /** <p/>
    */
  @js.native
  trait PropertyFilters extends js.Object {
    var LogicalOperator: js.UndefOr[LogicalOperator]
    var Properties: js.UndefOr[PropertyFiltersList]
  }

  object PropertyFilters {
    @inline
    def apply(
        LogicalOperator: js.UndefOr[LogicalOperator] = js.undefined,
        Properties: js.UndefOr[PropertyFiltersList] = js.undefined
    ): PropertyFilters = {
      val __obj = js.Dynamic.literal()
      LogicalOperator.foreach(__v => __obj.updateDynamic("LogicalOperator")(__v.asInstanceOf[js.Any]))
      Properties.foreach(__v => __obj.updateDynamic("Properties")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PropertyFilters]
    }
  }

  /** Response object containing details for a specific RasterDataCollection.
    */
  @js.native
  trait RasterDataCollectionMetadata extends js.Object {
    var Arn: DataCollectionArn
    var Description: String
    var Name: String
    var SupportedFilters: FilterList
    var Type: DataCollectionType
    var DescriptionPageUrl: js.UndefOr[String]
    var Tags: js.UndefOr[Tags]
  }

  object RasterDataCollectionMetadata {
    @inline
    def apply(
        Arn: DataCollectionArn,
        Description: String,
        Name: String,
        SupportedFilters: FilterList,
        Type: DataCollectionType,
        DescriptionPageUrl: js.UndefOr[String] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): RasterDataCollectionMetadata = {
      val __obj = js.Dynamic.literal(
        "Arn" -> Arn.asInstanceOf[js.Any],
        "Description" -> Description.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
        "SupportedFilters" -> SupportedFilters.asInstanceOf[js.Any],
        "Type" -> Type.asInstanceOf[js.Any]
      )

      DescriptionPageUrl.foreach(__v => __obj.updateDynamic("DescriptionPageUrl")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RasterDataCollectionMetadata]
    }
  }

  /** <p/>
    */
  @js.native
  trait RasterDataCollectionQueryInput extends js.Object {
    var RasterDataCollectionArn: String
    var TimeRangeFilter: TimeRangeFilterInput
    var AreaOfInterest: js.UndefOr[AreaOfInterest]
    var PropertyFilters: js.UndefOr[PropertyFilters]
  }

  object RasterDataCollectionQueryInput {
    @inline
    def apply(
        RasterDataCollectionArn: String,
        TimeRangeFilter: TimeRangeFilterInput,
        AreaOfInterest: js.UndefOr[AreaOfInterest] = js.undefined,
        PropertyFilters: js.UndefOr[PropertyFilters] = js.undefined
    ): RasterDataCollectionQueryInput = {
      val __obj = js.Dynamic.literal(
        "RasterDataCollectionArn" -> RasterDataCollectionArn.asInstanceOf[js.Any],
        "TimeRangeFilter" -> TimeRangeFilter.asInstanceOf[js.Any]
      )

      AreaOfInterest.foreach(__v => __obj.updateDynamic("AreaOfInterest")(__v.asInstanceOf[js.Any]))
      PropertyFilters.foreach(__v => __obj.updateDynamic("PropertyFilters")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RasterDataCollectionQueryInput]
    }
  }

  /** <p/>
    */
  @js.native
  trait RasterDataCollectionQueryOutput extends js.Object {
    var RasterDataCollectionArn: String
    var RasterDataCollectionName: String
    var TimeRangeFilter: TimeRangeFilterInput
    var AreaOfInterest: js.UndefOr[AreaOfInterest]
    var PropertyFilters: js.UndefOr[PropertyFilters]
  }

  object RasterDataCollectionQueryOutput {
    @inline
    def apply(
        RasterDataCollectionArn: String,
        RasterDataCollectionName: String,
        TimeRangeFilter: TimeRangeFilterInput,
        AreaOfInterest: js.UndefOr[AreaOfInterest] = js.undefined,
        PropertyFilters: js.UndefOr[PropertyFilters] = js.undefined
    ): RasterDataCollectionQueryOutput = {
      val __obj = js.Dynamic.literal(
        "RasterDataCollectionArn" -> RasterDataCollectionArn.asInstanceOf[js.Any],
        "RasterDataCollectionName" -> RasterDataCollectionName.asInstanceOf[js.Any],
        "TimeRangeFilter" -> TimeRangeFilter.asInstanceOf[js.Any]
      )

      AreaOfInterest.foreach(__v => __obj.updateDynamic("AreaOfInterest")(__v.asInstanceOf[js.Any]))
      PropertyFilters.foreach(__v => __obj.updateDynamic("PropertyFilters")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RasterDataCollectionQueryOutput]
    }
  }

  /** This is a RasterDataCollectionQueryInput containing AreaOfInterest, Time Range filter and Property filters.
    */
  @js.native
  trait RasterDataCollectionQueryWithBandFilterInput extends js.Object {
    var TimeRangeFilter: TimeRangeFilterInput
    var AreaOfInterest: js.UndefOr[AreaOfInterest]
    var BandFilter: js.UndefOr[StringListInput]
    var PropertyFilters: js.UndefOr[PropertyFilters]
  }

  object RasterDataCollectionQueryWithBandFilterInput {
    @inline
    def apply(
        TimeRangeFilter: TimeRangeFilterInput,
        AreaOfInterest: js.UndefOr[AreaOfInterest] = js.undefined,
        BandFilter: js.UndefOr[StringListInput] = js.undefined,
        PropertyFilters: js.UndefOr[PropertyFilters] = js.undefined
    ): RasterDataCollectionQueryWithBandFilterInput = {
      val __obj = js.Dynamic.literal(
        "TimeRangeFilter" -> TimeRangeFilter.asInstanceOf[js.Any]
      )

      AreaOfInterest.foreach(__v => __obj.updateDynamic("AreaOfInterest")(__v.asInstanceOf[js.Any]))
      BandFilter.foreach(__v => __obj.updateDynamic("BandFilter")(__v.asInstanceOf[js.Any]))
      PropertyFilters.foreach(__v => __obj.updateDynamic("PropertyFilters")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RasterDataCollectionQueryWithBandFilterInput]
    }
  }

  /** <p/>
    */
  @js.native
  trait ResamplingConfigInput extends js.Object {
    var OutputResolution: OutputResolutionResamplingInput
    var AlgorithmName: js.UndefOr[AlgorithmNameResampling]
    var TargetBands: js.UndefOr[StringListInput]
  }

  object ResamplingConfigInput {
    @inline
    def apply(
        OutputResolution: OutputResolutionResamplingInput,
        AlgorithmName: js.UndefOr[AlgorithmNameResampling] = js.undefined,
        TargetBands: js.UndefOr[StringListInput] = js.undefined
    ): ResamplingConfigInput = {
      val __obj = js.Dynamic.literal(
        "OutputResolution" -> OutputResolution.asInstanceOf[js.Any]
      )

      AlgorithmName.foreach(__v => __obj.updateDynamic("AlgorithmName")(__v.asInstanceOf[js.Any]))
      TargetBands.foreach(__v => __obj.updateDynamic("TargetBands")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResamplingConfigInput]
    }
  }

  /** <p/>
    */
  @js.native
  trait ReverseGeocodingConfig extends js.Object {
    var XAttributeName: String
    var YAttributeName: String
  }

  object ReverseGeocodingConfig {
    @inline
    def apply(
        XAttributeName: String,
        YAttributeName: String
    ): ReverseGeocodingConfig = {
      val __obj = js.Dynamic.literal(
        "XAttributeName" -> XAttributeName.asInstanceOf[js.Any],
        "YAttributeName" -> YAttributeName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ReverseGeocodingConfig]
    }
  }

  /** Path to Amazon S3 storage location for input data.
    */
  @js.native
  trait S3DataInput extends js.Object {
    var MetadataProvider: MetadataProvider
    var S3Uri: String
    var KmsKeyId: js.UndefOr[String]
  }

  object S3DataInput {
    @inline
    def apply(
        MetadataProvider: MetadataProvider,
        S3Uri: String,
        KmsKeyId: js.UndefOr[String] = js.undefined
    ): S3DataInput = {
      val __obj = js.Dynamic.literal(
        "MetadataProvider" -> MetadataProvider.asInstanceOf[js.Any],
        "S3Uri" -> S3Uri.asInstanceOf[js.Any]
      )

      KmsKeyId.foreach(__v => __obj.updateDynamic("KmsKeyId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[S3DataInput]
    }
  }

  @js.native
  trait SearchRasterDataCollectionInput extends js.Object {
    var Arn: DataCollectionArn
    var RasterDataCollectionQuery: RasterDataCollectionQueryWithBandFilterInput
    var NextToken: js.UndefOr[NextToken]
  }

  object SearchRasterDataCollectionInput {
    @inline
    def apply(
        Arn: DataCollectionArn,
        RasterDataCollectionQuery: RasterDataCollectionQueryWithBandFilterInput,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): SearchRasterDataCollectionInput = {
      val __obj = js.Dynamic.literal(
        "Arn" -> Arn.asInstanceOf[js.Any],
        "RasterDataCollectionQuery" -> RasterDataCollectionQuery.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SearchRasterDataCollectionInput]
    }
  }

  @js.native
  trait SearchRasterDataCollectionOutput extends js.Object {
    var ApproximateResultCount: Int
    var Items: js.UndefOr[ItemSourceList]
    var NextToken: js.UndefOr[NextToken]
  }

  object SearchRasterDataCollectionOutput {
    @inline
    def apply(
        ApproximateResultCount: Int,
        Items: js.UndefOr[ItemSourceList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): SearchRasterDataCollectionOutput = {
      val __obj = js.Dynamic.literal(
        "ApproximateResultCount" -> ApproximateResultCount.asInstanceOf[js.Any]
      )

      Items.foreach(__v => __obj.updateDynamic("Items")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SearchRasterDataCollectionOutput]
    }
  }

  /** <p/>
    */
  @js.native
  trait StackConfigInput extends js.Object {
    var OutputResolution: js.UndefOr[OutputResolutionStackInput]
    var TargetBands: js.UndefOr[StringListInput]
  }

  object StackConfigInput {
    @inline
    def apply(
        OutputResolution: js.UndefOr[OutputResolutionStackInput] = js.undefined,
        TargetBands: js.UndefOr[StringListInput] = js.undefined
    ): StackConfigInput = {
      val __obj = js.Dynamic.literal()
      OutputResolution.foreach(__v => __obj.updateDynamic("OutputResolution")(__v.asInstanceOf[js.Any]))
      TargetBands.foreach(__v => __obj.updateDynamic("TargetBands")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StackConfigInput]
    }
  }

  @js.native
  trait StartEarthObservationJobInput extends js.Object {
    var InputConfig: InputConfigInput
    var JobConfig: JobConfigInput
    var Name: String
    var ClientToken: js.UndefOr[String]
    var ExecutionRoleArn: js.UndefOr[String]
    var KmsKeyId: js.UndefOr[String]
    var Tags: js.UndefOr[Tags]
  }

  object StartEarthObservationJobInput {
    @inline
    def apply(
        InputConfig: InputConfigInput,
        JobConfig: JobConfigInput,
        Name: String,
        ClientToken: js.UndefOr[String] = js.undefined,
        ExecutionRoleArn: js.UndefOr[String] = js.undefined,
        KmsKeyId: js.UndefOr[String] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): StartEarthObservationJobInput = {
      val __obj = js.Dynamic.literal(
        "InputConfig" -> InputConfig.asInstanceOf[js.Any],
        "JobConfig" -> JobConfig.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]
      )

      ClientToken.foreach(__v => __obj.updateDynamic("ClientToken")(__v.asInstanceOf[js.Any]))
      ExecutionRoleArn.foreach(__v => __obj.updateDynamic("ExecutionRoleArn")(__v.asInstanceOf[js.Any]))
      KmsKeyId.foreach(__v => __obj.updateDynamic("KmsKeyId")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartEarthObservationJobInput]
    }
  }

  @js.native
  trait StartEarthObservationJobOutput extends js.Object {
    var Arn: String
    var CreationTime: Timestamp
    var DurationInSeconds: Int
    var JobConfig: JobConfigInput
    var Name: String
    var Status: EarthObservationJobStatus
    var ExecutionRoleArn: js.UndefOr[String]
    var InputConfig: js.UndefOr[InputConfigOutput]
    var KmsKeyId: js.UndefOr[String]
    var Tags: js.UndefOr[Tags]
  }

  object StartEarthObservationJobOutput {
    @inline
    def apply(
        Arn: String,
        CreationTime: Timestamp,
        DurationInSeconds: Int,
        JobConfig: JobConfigInput,
        Name: String,
        Status: EarthObservationJobStatus,
        ExecutionRoleArn: js.UndefOr[String] = js.undefined,
        InputConfig: js.UndefOr[InputConfigOutput] = js.undefined,
        KmsKeyId: js.UndefOr[String] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): StartEarthObservationJobOutput = {
      val __obj = js.Dynamic.literal(
        "Arn" -> Arn.asInstanceOf[js.Any],
        "CreationTime" -> CreationTime.asInstanceOf[js.Any],
        "DurationInSeconds" -> DurationInSeconds.asInstanceOf[js.Any],
        "JobConfig" -> JobConfig.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
        "Status" -> Status.asInstanceOf[js.Any]
      )

      ExecutionRoleArn.foreach(__v => __obj.updateDynamic("ExecutionRoleArn")(__v.asInstanceOf[js.Any]))
      InputConfig.foreach(__v => __obj.updateDynamic("InputConfig")(__v.asInstanceOf[js.Any]))
      KmsKeyId.foreach(__v => __obj.updateDynamic("KmsKeyId")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartEarthObservationJobOutput]
    }
  }

  @js.native
  trait StartVectorEnrichmentJobInput extends js.Object {
    var ExecutionRoleArn: String
    var InputConfig: VectorEnrichmentJobInputConfig
    var JobConfig: VectorEnrichmentJobConfig
    var Name: String
    var ClientToken: js.UndefOr[String]
    var KmsKeyId: js.UndefOr[String]
    var Tags: js.UndefOr[Tags]
  }

  object StartVectorEnrichmentJobInput {
    @inline
    def apply(
        ExecutionRoleArn: String,
        InputConfig: VectorEnrichmentJobInputConfig,
        JobConfig: VectorEnrichmentJobConfig,
        Name: String,
        ClientToken: js.UndefOr[String] = js.undefined,
        KmsKeyId: js.UndefOr[String] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): StartVectorEnrichmentJobInput = {
      val __obj = js.Dynamic.literal(
        "ExecutionRoleArn" -> ExecutionRoleArn.asInstanceOf[js.Any],
        "InputConfig" -> InputConfig.asInstanceOf[js.Any],
        "JobConfig" -> JobConfig.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]
      )

      ClientToken.foreach(__v => __obj.updateDynamic("ClientToken")(__v.asInstanceOf[js.Any]))
      KmsKeyId.foreach(__v => __obj.updateDynamic("KmsKeyId")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartVectorEnrichmentJobInput]
    }
  }

  @js.native
  trait StartVectorEnrichmentJobOutput extends js.Object {
    var Arn: VectorEnrichmentJobArn
    var CreationTime: Timestamp
    var DurationInSeconds: Int
    var ExecutionRoleArn: String
    var InputConfig: VectorEnrichmentJobInputConfig
    var JobConfig: VectorEnrichmentJobConfig
    var Name: String
    var Status: VectorEnrichmentJobStatus
    var Type: VectorEnrichmentJobType
    var KmsKeyId: js.UndefOr[String]
    var Tags: js.UndefOr[Tags]
  }

  object StartVectorEnrichmentJobOutput {
    @inline
    def apply(
        Arn: VectorEnrichmentJobArn,
        CreationTime: Timestamp,
        DurationInSeconds: Int,
        ExecutionRoleArn: String,
        InputConfig: VectorEnrichmentJobInputConfig,
        JobConfig: VectorEnrichmentJobConfig,
        Name: String,
        Status: VectorEnrichmentJobStatus,
        Type: VectorEnrichmentJobType,
        KmsKeyId: js.UndefOr[String] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): StartVectorEnrichmentJobOutput = {
      val __obj = js.Dynamic.literal(
        "Arn" -> Arn.asInstanceOf[js.Any],
        "CreationTime" -> CreationTime.asInstanceOf[js.Any],
        "DurationInSeconds" -> DurationInSeconds.asInstanceOf[js.Any],
        "ExecutionRoleArn" -> ExecutionRoleArn.asInstanceOf[js.Any],
        "InputConfig" -> InputConfig.asInstanceOf[js.Any],
        "JobConfig" -> JobConfig.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
        "Status" -> Status.asInstanceOf[js.Any],
        "Type" -> Type.asInstanceOf[js.Any]
      )

      KmsKeyId.foreach(__v => __obj.updateDynamic("KmsKeyId")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartVectorEnrichmentJobOutput]
    }
  }

  @js.native
  trait StopEarthObservationJobInput extends js.Object {
    var Arn: EarthObservationJobArn
  }

  object StopEarthObservationJobInput {
    @inline
    def apply(
        Arn: EarthObservationJobArn
    ): StopEarthObservationJobInput = {
      val __obj = js.Dynamic.literal(
        "Arn" -> Arn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[StopEarthObservationJobInput]
    }
  }

  @js.native
  trait StopEarthObservationJobOutput extends js.Object

  object StopEarthObservationJobOutput {
    @inline
    def apply(): StopEarthObservationJobOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StopEarthObservationJobOutput]
    }
  }

  @js.native
  trait StopVectorEnrichmentJobInput extends js.Object {
    var Arn: VectorEnrichmentJobArn
  }

  object StopVectorEnrichmentJobInput {
    @inline
    def apply(
        Arn: VectorEnrichmentJobArn
    ): StopVectorEnrichmentJobInput = {
      val __obj = js.Dynamic.literal(
        "Arn" -> Arn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[StopVectorEnrichmentJobInput]
    }
  }

  @js.native
  trait StopVectorEnrichmentJobOutput extends js.Object

  object StopVectorEnrichmentJobOutput {
    @inline
    def apply(): StopVectorEnrichmentJobOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StopVectorEnrichmentJobOutput]
    }
  }

  @js.native
  trait TagResourceRequest extends js.Object {
    var ResourceArn: Arn
    var Tags: Tags
  }

  object TagResourceRequest {
    @inline
    def apply(
        ResourceArn: Arn,
        Tags: Tags
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

  /** <p/>
    */
  @js.native
  trait TemporalStatisticsConfigInput extends js.Object {
    var Statistics: TemporalStatisticsListInput
    var GroupBy: js.UndefOr[GroupBy]
    var TargetBands: js.UndefOr[StringListInput]
  }

  object TemporalStatisticsConfigInput {
    @inline
    def apply(
        Statistics: TemporalStatisticsListInput,
        GroupBy: js.UndefOr[GroupBy] = js.undefined,
        TargetBands: js.UndefOr[StringListInput] = js.undefined
    ): TemporalStatisticsConfigInput = {
      val __obj = js.Dynamic.literal(
        "Statistics" -> Statistics.asInstanceOf[js.Any]
      )

      GroupBy.foreach(__v => __obj.updateDynamic("GroupBy")(__v.asInstanceOf[js.Any]))
      TargetBands.foreach(__v => __obj.updateDynamic("TargetBands")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TemporalStatisticsConfigInput]
    }
  }

  /** The input for the time-range filter.
    */
  @js.native
  trait TimeRangeFilterInput extends js.Object {
    var EndTime: Timestamp
    var StartTime: Timestamp
  }

  object TimeRangeFilterInput {
    @inline
    def apply(
        EndTime: Timestamp,
        StartTime: Timestamp
    ): TimeRangeFilterInput = {
      val __obj = js.Dynamic.literal(
        "EndTime" -> EndTime.asInstanceOf[js.Any],
        "StartTime" -> StartTime.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[TimeRangeFilterInput]
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

  /** <p/>
    */
  @js.native
  trait UserDefined extends js.Object {
    var Unit: Unit
    var Value: Float
  }

  object UserDefined {
    @inline
    def apply(
        Unit: Unit,
        Value: Float
    ): UserDefined = {
      val __obj = js.Dynamic.literal(
        "Unit" -> Unit.asInstanceOf[js.Any],
        "Value" -> Value.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UserDefined]
    }
  }

  /** It contains configs such as ReverseGeocodingConfig and MapMatchingConfig.
    */
  @js.native
  trait VectorEnrichmentJobConfig extends js.Object {
    var MapMatchingConfig: js.UndefOr[MapMatchingConfig]
    var ReverseGeocodingConfig: js.UndefOr[ReverseGeocodingConfig]
  }

  object VectorEnrichmentJobConfig {
    @inline
    def apply(
        MapMatchingConfig: js.UndefOr[MapMatchingConfig] = js.undefined,
        ReverseGeocodingConfig: js.UndefOr[ReverseGeocodingConfig] = js.undefined
    ): VectorEnrichmentJobConfig = {
      val __obj = js.Dynamic.literal()
      MapMatchingConfig.foreach(__v => __obj.updateDynamic("MapMatchingConfig")(__v.asInstanceOf[js.Any]))
      ReverseGeocodingConfig.foreach(__v => __obj.updateDynamic("ReverseGeocodingConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VectorEnrichmentJobConfig]
    }
  }

  /** <p/>
    */
  @js.native
  trait VectorEnrichmentJobDataSourceConfigInput extends js.Object {
    var S3Data: js.UndefOr[VectorEnrichmentJobS3Data]
  }

  object VectorEnrichmentJobDataSourceConfigInput {
    @inline
    def apply(
        S3Data: js.UndefOr[VectorEnrichmentJobS3Data] = js.undefined
    ): VectorEnrichmentJobDataSourceConfigInput = {
      val __obj = js.Dynamic.literal()
      S3Data.foreach(__v => __obj.updateDynamic("S3Data")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VectorEnrichmentJobDataSourceConfigInput]
    }
  }

  /** VectorEnrichmentJob error details in response from GetVectorEnrichmentJob.
    */
  @js.native
  trait VectorEnrichmentJobErrorDetails extends js.Object {
    var ErrorMessage: js.UndefOr[String]
    var ErrorType: js.UndefOr[VectorEnrichmentJobErrorType]
  }

  object VectorEnrichmentJobErrorDetails {
    @inline
    def apply(
        ErrorMessage: js.UndefOr[String] = js.undefined,
        ErrorType: js.UndefOr[VectorEnrichmentJobErrorType] = js.undefined
    ): VectorEnrichmentJobErrorDetails = {
      val __obj = js.Dynamic.literal()
      ErrorMessage.foreach(__v => __obj.updateDynamic("ErrorMessage")(__v.asInstanceOf[js.Any]))
      ErrorType.foreach(__v => __obj.updateDynamic("ErrorType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VectorEnrichmentJobErrorDetails]
    }
  }

  /** VectorEnrichmentJob export error details in response from GetVectorEnrichmentJob.
    */
  @js.native
  trait VectorEnrichmentJobExportErrorDetails extends js.Object {
    var Message: js.UndefOr[String]
    var Type: js.UndefOr[VectorEnrichmentJobExportErrorType]
  }

  object VectorEnrichmentJobExportErrorDetails {
    @inline
    def apply(
        Message: js.UndefOr[String] = js.undefined,
        Type: js.UndefOr[VectorEnrichmentJobExportErrorType] = js.undefined
    ): VectorEnrichmentJobExportErrorDetails = {
      val __obj = js.Dynamic.literal()
      Message.foreach(__v => __obj.updateDynamic("Message")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VectorEnrichmentJobExportErrorDetails]
    }
  }

  /** The input structure for the InputConfig in a VectorEnrichmentJob.
    */
  @js.native
  trait VectorEnrichmentJobInputConfig extends js.Object {
    var DataSourceConfig: VectorEnrichmentJobDataSourceConfigInput
    var DocumentType: VectorEnrichmentJobDocumentType
  }

  object VectorEnrichmentJobInputConfig {
    @inline
    def apply(
        DataSourceConfig: VectorEnrichmentJobDataSourceConfigInput,
        DocumentType: VectorEnrichmentJobDocumentType
    ): VectorEnrichmentJobInputConfig = {
      val __obj = js.Dynamic.literal(
        "DataSourceConfig" -> DataSourceConfig.asInstanceOf[js.Any],
        "DocumentType" -> DocumentType.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[VectorEnrichmentJobInputConfig]
    }
  }

  /** The Amazon S3 data for the Vector Enrichment job.
    */
  @js.native
  trait VectorEnrichmentJobS3Data extends js.Object {
    var S3Uri: String
    var KmsKeyId: js.UndefOr[String]
  }

  object VectorEnrichmentJobS3Data {
    @inline
    def apply(
        S3Uri: String,
        KmsKeyId: js.UndefOr[String] = js.undefined
    ): VectorEnrichmentJobS3Data = {
      val __obj = js.Dynamic.literal(
        "S3Uri" -> S3Uri.asInstanceOf[js.Any]
      )

      KmsKeyId.foreach(__v => __obj.updateDynamic("KmsKeyId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VectorEnrichmentJobS3Data]
    }
  }

  /** <p/>
    */
  @js.native
  trait ViewOffNadirInput extends js.Object {
    var LowerBound: Float
    var UpperBound: Float
  }

  object ViewOffNadirInput {
    @inline
    def apply(
        LowerBound: Float,
        UpperBound: Float
    ): ViewOffNadirInput = {
      val __obj = js.Dynamic.literal(
        "LowerBound" -> LowerBound.asInstanceOf[js.Any],
        "UpperBound" -> UpperBound.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ViewOffNadirInput]
    }
  }

  /** <p/>
    */
  @js.native
  trait ViewSunAzimuthInput extends js.Object {
    var LowerBound: Float
    var UpperBound: Float
  }

  object ViewSunAzimuthInput {
    @inline
    def apply(
        LowerBound: Float,
        UpperBound: Float
    ): ViewSunAzimuthInput = {
      val __obj = js.Dynamic.literal(
        "LowerBound" -> LowerBound.asInstanceOf[js.Any],
        "UpperBound" -> UpperBound.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ViewSunAzimuthInput]
    }
  }

  /** <p/>
    */
  @js.native
  trait ViewSunElevationInput extends js.Object {
    var LowerBound: Float
    var UpperBound: Float
  }

  object ViewSunElevationInput {
    @inline
    def apply(
        LowerBound: Float,
        UpperBound: Float
    ): ViewSunElevationInput = {
      val __obj = js.Dynamic.literal(
        "LowerBound" -> LowerBound.asInstanceOf[js.Any],
        "UpperBound" -> UpperBound.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ViewSunElevationInput]
    }
  }

  /** <p/>
    */
  @js.native
  trait ZonalStatisticsConfigInput extends js.Object {
    var Statistics: ZonalStatisticsListInput
    var ZoneS3Path: String
    var TargetBands: js.UndefOr[StringListInput]
  }

  object ZonalStatisticsConfigInput {
    @inline
    def apply(
        Statistics: ZonalStatisticsListInput,
        ZoneS3Path: String,
        TargetBands: js.UndefOr[StringListInput] = js.undefined
    ): ZonalStatisticsConfigInput = {
      val __obj = js.Dynamic.literal(
        "Statistics" -> Statistics.asInstanceOf[js.Any],
        "ZoneS3Path" -> ZoneS3Path.asInstanceOf[js.Any]
      )

      TargetBands.foreach(__v => __obj.updateDynamic("TargetBands")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ZonalStatisticsConfigInput]
    }
  }
}
