package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

package object lookoutvision {
  type AnomalyClassFilter = String
  type ClientToken = String
  type ContentType = String
  type DatasetChanges = js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type DatasetEntry = String
  type DatasetEntryList = js.Array[DatasetEntry]
  type DatasetMetadataList = js.Array[DatasetMetadata]
  type DatasetStatusMessage = String
  type DatasetType = String
  type DateTime = js.Date
  type ImageSourceType = String
  type InferenceUnits = Int
  type IsLabeled = Boolean
  type KmsKeyId = String
  type ModelArn = String
  type ModelDescriptionMessage = String
  type ModelMetadataList = js.Array[ModelMetadata]
  type ModelStatusMessage = String
  type ModelVersion = String
  type PageSize = Int
  type PaginationToken = String
  type ProjectArn = String
  type ProjectMetadataList = js.Array[ProjectMetadata]
  type ProjectName = String
  type QueryString = String
  type S3BucketName = String
  type S3KeyPrefix = String
  type S3ObjectKey = String
  type S3ObjectVersion = String
  type Stream = js.typedarray.TypedArray[_, _] | js.Array[Byte] | String

  implicit final class LookoutVisionOps(private val service: LookoutVision) extends AnyVal {

    @inline def createDatasetFuture(params: CreateDatasetRequest): Future[CreateDatasetResponse] = service.createDataset(params).promise().toFuture
    @inline def createModelFuture(params: CreateModelRequest): Future[CreateModelResponse] = service.createModel(params).promise().toFuture
    @inline def createProjectFuture(params: CreateProjectRequest): Future[CreateProjectResponse] = service.createProject(params).promise().toFuture
    @inline def deleteDatasetFuture(params: DeleteDatasetRequest): Future[DeleteDatasetResponse] = service.deleteDataset(params).promise().toFuture
    @inline def deleteModelFuture(params: DeleteModelRequest): Future[DeleteModelResponse] = service.deleteModel(params).promise().toFuture
    @inline def deleteProjectFuture(params: DeleteProjectRequest): Future[DeleteProjectResponse] = service.deleteProject(params).promise().toFuture
    @inline def describeDatasetFuture(params: DescribeDatasetRequest): Future[DescribeDatasetResponse] = service.describeDataset(params).promise().toFuture
    @inline def describeModelFuture(params: DescribeModelRequest): Future[DescribeModelResponse] = service.describeModel(params).promise().toFuture
    @inline def describeProjectFuture(params: DescribeProjectRequest): Future[DescribeProjectResponse] = service.describeProject(params).promise().toFuture
    @inline def detectAnomaliesFuture(params: DetectAnomaliesRequest): Future[DetectAnomaliesResponse] = service.detectAnomalies(params).promise().toFuture
    @inline def listDatasetEntriesFuture(params: ListDatasetEntriesRequest): Future[ListDatasetEntriesResponse] = service.listDatasetEntries(params).promise().toFuture
    @inline def listModelsFuture(params: ListModelsRequest): Future[ListModelsResponse] = service.listModels(params).promise().toFuture
    @inline def listProjectsFuture(params: ListProjectsRequest): Future[ListProjectsResponse] = service.listProjects(params).promise().toFuture
    @inline def startModelFuture(params: StartModelRequest): Future[StartModelResponse] = service.startModel(params).promise().toFuture
    @inline def stopModelFuture(params: StopModelRequest): Future[StopModelResponse] = service.stopModel(params).promise().toFuture
    @inline def updateDatasetEntriesFuture(params: UpdateDatasetEntriesRequest): Future[UpdateDatasetEntriesResponse] = service.updateDatasetEntries(params).promise().toFuture

  }
}

package lookoutvision {
  @js.native
  @JSImport("aws-sdk/clients/lookoutvision", JSImport.Namespace, "AWS.LookoutVision")
  class LookoutVision() extends js.Object {
    def this(config: AWSConfig) = this()

    def createDataset(params: CreateDatasetRequest): Request[CreateDatasetResponse] = js.native
    def createModel(params: CreateModelRequest): Request[CreateModelResponse] = js.native
    def createProject(params: CreateProjectRequest): Request[CreateProjectResponse] = js.native
    def deleteDataset(params: DeleteDatasetRequest): Request[DeleteDatasetResponse] = js.native
    def deleteModel(params: DeleteModelRequest): Request[DeleteModelResponse] = js.native
    def deleteProject(params: DeleteProjectRequest): Request[DeleteProjectResponse] = js.native
    def describeDataset(params: DescribeDatasetRequest): Request[DescribeDatasetResponse] = js.native
    def describeModel(params: DescribeModelRequest): Request[DescribeModelResponse] = js.native
    def describeProject(params: DescribeProjectRequest): Request[DescribeProjectResponse] = js.native
    def detectAnomalies(params: DetectAnomaliesRequest): Request[DetectAnomaliesResponse] = js.native
    def listDatasetEntries(params: ListDatasetEntriesRequest): Request[ListDatasetEntriesResponse] = js.native
    def listModels(params: ListModelsRequest): Request[ListModelsResponse] = js.native
    def listProjects(params: ListProjectsRequest): Request[ListProjectsResponse] = js.native
    def startModel(params: StartModelRequest): Request[StartModelResponse] = js.native
    def stopModel(params: StopModelRequest): Request[StopModelResponse] = js.native
    def updateDatasetEntries(params: UpdateDatasetEntriesRequest): Request[UpdateDatasetEntriesResponse] = js.native
  }

  @js.native
  trait CreateDatasetRequest extends js.Object {
    var DatasetType: DatasetType
    var ProjectName: ProjectName
    var ClientToken: js.UndefOr[ClientToken]
    var DatasetSource: js.UndefOr[DatasetSource]
  }

  object CreateDatasetRequest {
    @inline
    def apply(
        DatasetType: DatasetType,
        ProjectName: ProjectName,
        ClientToken: js.UndefOr[ClientToken] = js.undefined,
        DatasetSource: js.UndefOr[DatasetSource] = js.undefined
    ): CreateDatasetRequest = {
      val __obj = js.Dynamic.literal(
        "DatasetType" -> DatasetType.asInstanceOf[js.Any],
        "ProjectName" -> ProjectName.asInstanceOf[js.Any]
      )

      ClientToken.foreach(__v => __obj.updateDynamic("ClientToken")(__v.asInstanceOf[js.Any]))
      DatasetSource.foreach(__v => __obj.updateDynamic("DatasetSource")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDatasetRequest]
    }
  }

  @js.native
  trait CreateDatasetResponse extends js.Object {
    var DatasetMetadata: js.UndefOr[DatasetMetadata]
  }

  object CreateDatasetResponse {
    @inline
    def apply(
        DatasetMetadata: js.UndefOr[DatasetMetadata] = js.undefined
    ): CreateDatasetResponse = {
      val __obj = js.Dynamic.literal()
      DatasetMetadata.foreach(__v => __obj.updateDynamic("DatasetMetadata")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDatasetResponse]
    }
  }

  @js.native
  trait CreateModelRequest extends js.Object {
    var OutputConfig: OutputConfig
    var ProjectName: ProjectName
    var ClientToken: js.UndefOr[ClientToken]
    var Description: js.UndefOr[ModelDescription]
    var KmsKeyId: js.UndefOr[KmsKeyId]
  }

  object CreateModelRequest {
    @inline
    def apply(
        OutputConfig: OutputConfig,
        ProjectName: ProjectName,
        ClientToken: js.UndefOr[ClientToken] = js.undefined,
        Description: js.UndefOr[ModelDescription] = js.undefined,
        KmsKeyId: js.UndefOr[KmsKeyId] = js.undefined
    ): CreateModelRequest = {
      val __obj = js.Dynamic.literal(
        "OutputConfig" -> OutputConfig.asInstanceOf[js.Any],
        "ProjectName" -> ProjectName.asInstanceOf[js.Any]
      )

      ClientToken.foreach(__v => __obj.updateDynamic("ClientToken")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      KmsKeyId.foreach(__v => __obj.updateDynamic("KmsKeyId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateModelRequest]
    }
  }

  @js.native
  trait CreateModelResponse extends js.Object {
    var ModelMetadata: js.UndefOr[ModelMetadata]
  }

  object CreateModelResponse {
    @inline
    def apply(
        ModelMetadata: js.UndefOr[ModelMetadata] = js.undefined
    ): CreateModelResponse = {
      val __obj = js.Dynamic.literal()
      ModelMetadata.foreach(__v => __obj.updateDynamic("ModelMetadata")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateModelResponse]
    }
  }

  @js.native
  trait CreateProjectRequest extends js.Object {
    var ProjectName: ProjectName
    var ClientToken: js.UndefOr[ClientToken]
  }

  object CreateProjectRequest {
    @inline
    def apply(
        ProjectName: ProjectName,
        ClientToken: js.UndefOr[ClientToken] = js.undefined
    ): CreateProjectRequest = {
      val __obj = js.Dynamic.literal(
        "ProjectName" -> ProjectName.asInstanceOf[js.Any]
      )

      ClientToken.foreach(__v => __obj.updateDynamic("ClientToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateProjectRequest]
    }
  }

  @js.native
  trait CreateProjectResponse extends js.Object {
    var ProjectMetadata: js.UndefOr[ProjectMetadata]
  }

  object CreateProjectResponse {
    @inline
    def apply(
        ProjectMetadata: js.UndefOr[ProjectMetadata] = js.undefined
    ): CreateProjectResponse = {
      val __obj = js.Dynamic.literal()
      ProjectMetadata.foreach(__v => __obj.updateDynamic("ProjectMetadata")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateProjectResponse]
    }
  }

  /** The description for a dataset. For more information, see <a>DescribeDataset</a>.
    */
  @js.native
  trait DatasetDescription extends js.Object {
    var CreationTimestamp: js.UndefOr[DateTime]
    var DatasetType: js.UndefOr[DatasetType]
    var ImageStats: js.UndefOr[DatasetImageStats]
    var LastUpdatedTimestamp: js.UndefOr[DateTime]
    var ProjectName: js.UndefOr[ProjectName]
    var Status: js.UndefOr[DatasetStatus]
    var StatusMessage: js.UndefOr[DatasetStatusMessage]
  }

  object DatasetDescription {
    @inline
    def apply(
        CreationTimestamp: js.UndefOr[DateTime] = js.undefined,
        DatasetType: js.UndefOr[DatasetType] = js.undefined,
        ImageStats: js.UndefOr[DatasetImageStats] = js.undefined,
        LastUpdatedTimestamp: js.UndefOr[DateTime] = js.undefined,
        ProjectName: js.UndefOr[ProjectName] = js.undefined,
        Status: js.UndefOr[DatasetStatus] = js.undefined,
        StatusMessage: js.UndefOr[DatasetStatusMessage] = js.undefined
    ): DatasetDescription = {
      val __obj = js.Dynamic.literal()
      CreationTimestamp.foreach(__v => __obj.updateDynamic("CreationTimestamp")(__v.asInstanceOf[js.Any]))
      DatasetType.foreach(__v => __obj.updateDynamic("DatasetType")(__v.asInstanceOf[js.Any]))
      ImageStats.foreach(__v => __obj.updateDynamic("ImageStats")(__v.asInstanceOf[js.Any]))
      LastUpdatedTimestamp.foreach(__v => __obj.updateDynamic("LastUpdatedTimestamp")(__v.asInstanceOf[js.Any]))
      ProjectName.foreach(__v => __obj.updateDynamic("ProjectName")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      StatusMessage.foreach(__v => __obj.updateDynamic("StatusMessage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DatasetDescription]
    }
  }

  /** Location information about a manifest file. You can use a manifest file to create a dataset.
    */
  @js.native
  trait DatasetGroundTruthManifest extends js.Object {
    var S3Object: js.UndefOr[InputS3Object]
  }

  object DatasetGroundTruthManifest {
    @inline
    def apply(
        S3Object: js.UndefOr[InputS3Object] = js.undefined
    ): DatasetGroundTruthManifest = {
      val __obj = js.Dynamic.literal()
      S3Object.foreach(__v => __obj.updateDynamic("S3Object")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DatasetGroundTruthManifest]
    }
  }

  /** Statistics about the images in a dataset.
    */
  @js.native
  trait DatasetImageStats extends js.Object {
    var Anomaly: js.UndefOr[Int]
    var Labeled: js.UndefOr[Int]
    var Normal: js.UndefOr[Int]
    var Total: js.UndefOr[Int]
  }

  object DatasetImageStats {
    @inline
    def apply(
        Anomaly: js.UndefOr[Int] = js.undefined,
        Labeled: js.UndefOr[Int] = js.undefined,
        Normal: js.UndefOr[Int] = js.undefined,
        Total: js.UndefOr[Int] = js.undefined
    ): DatasetImageStats = {
      val __obj = js.Dynamic.literal()
      Anomaly.foreach(__v => __obj.updateDynamic("Anomaly")(__v.asInstanceOf[js.Any]))
      Labeled.foreach(__v => __obj.updateDynamic("Labeled")(__v.asInstanceOf[js.Any]))
      Normal.foreach(__v => __obj.updateDynamic("Normal")(__v.asInstanceOf[js.Any]))
      Total.foreach(__v => __obj.updateDynamic("Total")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DatasetImageStats]
    }
  }

  /** Sumary information for an Amazon Lookout for Vision dataset.
    */
  @js.native
  trait DatasetMetadata extends js.Object {
    var CreationTimestamp: js.UndefOr[DateTime]
    var DatasetType: js.UndefOr[DatasetType]
    var Status: js.UndefOr[DatasetStatus]
    var StatusMessage: js.UndefOr[DatasetStatusMessage]
  }

  object DatasetMetadata {
    @inline
    def apply(
        CreationTimestamp: js.UndefOr[DateTime] = js.undefined,
        DatasetType: js.UndefOr[DatasetType] = js.undefined,
        Status: js.UndefOr[DatasetStatus] = js.undefined,
        StatusMessage: js.UndefOr[DatasetStatusMessage] = js.undefined
    ): DatasetMetadata = {
      val __obj = js.Dynamic.literal()
      CreationTimestamp.foreach(__v => __obj.updateDynamic("CreationTimestamp")(__v.asInstanceOf[js.Any]))
      DatasetType.foreach(__v => __obj.updateDynamic("DatasetType")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      StatusMessage.foreach(__v => __obj.updateDynamic("StatusMessage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DatasetMetadata]
    }
  }

  /** Information about the location of a manifest file that Amazon Lookout for Vision uses to to create a dataset.
    */
  @js.native
  trait DatasetSource extends js.Object {
    var GroundTruthManifest: js.UndefOr[DatasetGroundTruthManifest]
  }

  object DatasetSource {
    @inline
    def apply(
        GroundTruthManifest: js.UndefOr[DatasetGroundTruthManifest] = js.undefined
    ): DatasetSource = {
      val __obj = js.Dynamic.literal()
      GroundTruthManifest.foreach(__v => __obj.updateDynamic("GroundTruthManifest")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DatasetSource]
    }
  }

  @js.native
  sealed trait DatasetStatus extends js.Any
  object DatasetStatus {
    val CREATE_IN_PROGRESS = "CREATE_IN_PROGRESS".asInstanceOf[DatasetStatus]
    val CREATE_COMPLETE = "CREATE_COMPLETE".asInstanceOf[DatasetStatus]
    val CREATE_FAILED = "CREATE_FAILED".asInstanceOf[DatasetStatus]
    val UPDATE_IN_PROGRESS = "UPDATE_IN_PROGRESS".asInstanceOf[DatasetStatus]
    val UPDATE_COMPLETE = "UPDATE_COMPLETE".asInstanceOf[DatasetStatus]
    val UPDATE_FAILED_ROLLBACK_IN_PROGRESS = "UPDATE_FAILED_ROLLBACK_IN_PROGRESS".asInstanceOf[DatasetStatus]
    val UPDATE_FAILED_ROLLBACK_COMPLETE = "UPDATE_FAILED_ROLLBACK_COMPLETE".asInstanceOf[DatasetStatus]
    val DELETE_IN_PROGRESS = "DELETE_IN_PROGRESS".asInstanceOf[DatasetStatus]
    val DELETE_COMPLETE = "DELETE_COMPLETE".asInstanceOf[DatasetStatus]
    val DELETE_FAILED = "DELETE_FAILED".asInstanceOf[DatasetStatus]

    @inline def values = js.Array(
      CREATE_IN_PROGRESS,
      CREATE_COMPLETE,
      CREATE_FAILED,
      UPDATE_IN_PROGRESS,
      UPDATE_COMPLETE,
      UPDATE_FAILED_ROLLBACK_IN_PROGRESS,
      UPDATE_FAILED_ROLLBACK_COMPLETE,
      DELETE_IN_PROGRESS,
      DELETE_COMPLETE,
      DELETE_FAILED
    )
  }

  @js.native
  trait DeleteDatasetRequest extends js.Object {
    var DatasetType: DatasetType
    var ProjectName: ProjectName
    var ClientToken: js.UndefOr[ClientToken]
  }

  object DeleteDatasetRequest {
    @inline
    def apply(
        DatasetType: DatasetType,
        ProjectName: ProjectName,
        ClientToken: js.UndefOr[ClientToken] = js.undefined
    ): DeleteDatasetRequest = {
      val __obj = js.Dynamic.literal(
        "DatasetType" -> DatasetType.asInstanceOf[js.Any],
        "ProjectName" -> ProjectName.asInstanceOf[js.Any]
      )

      ClientToken.foreach(__v => __obj.updateDynamic("ClientToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteDatasetRequest]
    }
  }

  @js.native
  trait DeleteDatasetResponse extends js.Object

  object DeleteDatasetResponse {
    @inline
    def apply(): DeleteDatasetResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteDatasetResponse]
    }
  }

  @js.native
  trait DeleteModelRequest extends js.Object {
    var ModelVersion: ModelVersion
    var ProjectName: ProjectName
    var ClientToken: js.UndefOr[ClientToken]
  }

  object DeleteModelRequest {
    @inline
    def apply(
        ModelVersion: ModelVersion,
        ProjectName: ProjectName,
        ClientToken: js.UndefOr[ClientToken] = js.undefined
    ): DeleteModelRequest = {
      val __obj = js.Dynamic.literal(
        "ModelVersion" -> ModelVersion.asInstanceOf[js.Any],
        "ProjectName" -> ProjectName.asInstanceOf[js.Any]
      )

      ClientToken.foreach(__v => __obj.updateDynamic("ClientToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteModelRequest]
    }
  }

  @js.native
  trait DeleteModelResponse extends js.Object {
    var ModelArn: js.UndefOr[ModelArn]
  }

  object DeleteModelResponse {
    @inline
    def apply(
        ModelArn: js.UndefOr[ModelArn] = js.undefined
    ): DeleteModelResponse = {
      val __obj = js.Dynamic.literal()
      ModelArn.foreach(__v => __obj.updateDynamic("ModelArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteModelResponse]
    }
  }

  @js.native
  trait DeleteProjectRequest extends js.Object {
    var ProjectName: ProjectName
    var ClientToken: js.UndefOr[ClientToken]
  }

  object DeleteProjectRequest {
    @inline
    def apply(
        ProjectName: ProjectName,
        ClientToken: js.UndefOr[ClientToken] = js.undefined
    ): DeleteProjectRequest = {
      val __obj = js.Dynamic.literal(
        "ProjectName" -> ProjectName.asInstanceOf[js.Any]
      )

      ClientToken.foreach(__v => __obj.updateDynamic("ClientToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteProjectRequest]
    }
  }

  @js.native
  trait DeleteProjectResponse extends js.Object {
    var ProjectArn: js.UndefOr[ProjectArn]
  }

  object DeleteProjectResponse {
    @inline
    def apply(
        ProjectArn: js.UndefOr[ProjectArn] = js.undefined
    ): DeleteProjectResponse = {
      val __obj = js.Dynamic.literal()
      ProjectArn.foreach(__v => __obj.updateDynamic("ProjectArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteProjectResponse]
    }
  }

  @js.native
  trait DescribeDatasetRequest extends js.Object {
    var DatasetType: DatasetType
    var ProjectName: ProjectName
  }

  object DescribeDatasetRequest {
    @inline
    def apply(
        DatasetType: DatasetType,
        ProjectName: ProjectName
    ): DescribeDatasetRequest = {
      val __obj = js.Dynamic.literal(
        "DatasetType" -> DatasetType.asInstanceOf[js.Any],
        "ProjectName" -> ProjectName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeDatasetRequest]
    }
  }

  @js.native
  trait DescribeDatasetResponse extends js.Object {
    var DatasetDescription: js.UndefOr[DatasetDescription]
  }

  object DescribeDatasetResponse {
    @inline
    def apply(
        DatasetDescription: js.UndefOr[DatasetDescription] = js.undefined
    ): DescribeDatasetResponse = {
      val __obj = js.Dynamic.literal()
      DatasetDescription.foreach(__v => __obj.updateDynamic("DatasetDescription")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeDatasetResponse]
    }
  }

  @js.native
  trait DescribeModelRequest extends js.Object {
    var ModelVersion: ModelVersion
    var ProjectName: ProjectName
  }

  object DescribeModelRequest {
    @inline
    def apply(
        ModelVersion: ModelVersion,
        ProjectName: ProjectName
    ): DescribeModelRequest = {
      val __obj = js.Dynamic.literal(
        "ModelVersion" -> ModelVersion.asInstanceOf[js.Any],
        "ProjectName" -> ProjectName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeModelRequest]
    }
  }

  @js.native
  trait DescribeModelResponse extends js.Object {
    var ModelDescription: js.UndefOr[ModelDescription]
  }

  object DescribeModelResponse {
    @inline
    def apply(
        ModelDescription: js.UndefOr[ModelDescription] = js.undefined
    ): DescribeModelResponse = {
      val __obj = js.Dynamic.literal()
      ModelDescription.foreach(__v => __obj.updateDynamic("ModelDescription")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeModelResponse]
    }
  }

  @js.native
  trait DescribeProjectRequest extends js.Object {
    var ProjectName: ProjectName
  }

  object DescribeProjectRequest {
    @inline
    def apply(
        ProjectName: ProjectName
    ): DescribeProjectRequest = {
      val __obj = js.Dynamic.literal(
        "ProjectName" -> ProjectName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeProjectRequest]
    }
  }

  @js.native
  trait DescribeProjectResponse extends js.Object {
    var ProjectDescription: js.UndefOr[ProjectDescription]
  }

  object DescribeProjectResponse {
    @inline
    def apply(
        ProjectDescription: js.UndefOr[ProjectDescription] = js.undefined
    ): DescribeProjectResponse = {
      val __obj = js.Dynamic.literal()
      ProjectDescription.foreach(__v => __obj.updateDynamic("ProjectDescription")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeProjectResponse]
    }
  }

  @js.native
  trait DetectAnomaliesRequest extends js.Object {
    var Body: Stream
    var ContentType: ContentType
    var ModelVersion: ModelVersion
    var ProjectName: ProjectName
  }

  object DetectAnomaliesRequest {
    @inline
    def apply(
        Body: Stream,
        ContentType: ContentType,
        ModelVersion: ModelVersion,
        ProjectName: ProjectName
    ): DetectAnomaliesRequest = {
      val __obj = js.Dynamic.literal(
        "Body" -> Body.asInstanceOf[js.Any],
        "ContentType" -> ContentType.asInstanceOf[js.Any],
        "ModelVersion" -> ModelVersion.asInstanceOf[js.Any],
        "ProjectName" -> ProjectName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DetectAnomaliesRequest]
    }
  }

  @js.native
  trait DetectAnomaliesResponse extends js.Object {
    var DetectAnomalyResult: js.UndefOr[DetectAnomalyResult]
  }

  object DetectAnomaliesResponse {
    @inline
    def apply(
        DetectAnomalyResult: js.UndefOr[DetectAnomalyResult] = js.undefined
    ): DetectAnomaliesResponse = {
      val __obj = js.Dynamic.literal()
      DetectAnomalyResult.foreach(__v => __obj.updateDynamic("DetectAnomalyResult")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DetectAnomaliesResponse]
    }
  }

  /** The prediction results from a call to <a>DetectAnomalies</a>.
    */
  @js.native
  trait DetectAnomalyResult extends js.Object {
    var Confidence: js.UndefOr[Float]
    var IsAnomalous: js.UndefOr[Boolean]
    var Source: js.UndefOr[ImageSource]
  }

  object DetectAnomalyResult {
    @inline
    def apply(
        Confidence: js.UndefOr[Float] = js.undefined,
        IsAnomalous: js.UndefOr[Boolean] = js.undefined,
        Source: js.UndefOr[ImageSource] = js.undefined
    ): DetectAnomalyResult = {
      val __obj = js.Dynamic.literal()
      Confidence.foreach(__v => __obj.updateDynamic("Confidence")(__v.asInstanceOf[js.Any]))
      IsAnomalous.foreach(__v => __obj.updateDynamic("IsAnomalous")(__v.asInstanceOf[js.Any]))
      Source.foreach(__v => __obj.updateDynamic("Source")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DetectAnomalyResult]
    }
  }

  /** The source for an image.
    */
  @js.native
  trait ImageSource extends js.Object {
    var Type: js.UndefOr[ImageSourceType]
  }

  object ImageSource {
    @inline
    def apply(
        Type: js.UndefOr[ImageSourceType] = js.undefined
    ): ImageSource = {
      val __obj = js.Dynamic.literal()
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ImageSource]
    }
  }

  /** Amazon S3 Location information for an input manifest file.
    */
  @js.native
  trait InputS3Object extends js.Object {
    var Bucket: S3BucketName
    var Key: S3ObjectKey
    var VersionId: js.UndefOr[S3ObjectVersion]
  }

  object InputS3Object {
    @inline
    def apply(
        Bucket: S3BucketName,
        Key: S3ObjectKey,
        VersionId: js.UndefOr[S3ObjectVersion] = js.undefined
    ): InputS3Object = {
      val __obj = js.Dynamic.literal(
        "Bucket" -> Bucket.asInstanceOf[js.Any],
        "Key" -> Key.asInstanceOf[js.Any]
      )

      VersionId.foreach(__v => __obj.updateDynamic("VersionId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InputS3Object]
    }
  }

  @js.native
  trait ListDatasetEntriesRequest extends js.Object {
    var DatasetType: DatasetType
    var ProjectName: ProjectName
    var AfterCreationDate: js.UndefOr[DateTime]
    var AnomalyClass: js.UndefOr[AnomalyClassFilter]
    var BeforeCreationDate: js.UndefOr[DateTime]
    var Labeled: js.UndefOr[IsLabeled]
    var MaxResults: js.UndefOr[PageSize]
    var NextToken: js.UndefOr[PaginationToken]
    var SourceRefContains: js.UndefOr[QueryString]
  }

  object ListDatasetEntriesRequest {
    @inline
    def apply(
        DatasetType: DatasetType,
        ProjectName: ProjectName,
        AfterCreationDate: js.UndefOr[DateTime] = js.undefined,
        AnomalyClass: js.UndefOr[AnomalyClassFilter] = js.undefined,
        BeforeCreationDate: js.UndefOr[DateTime] = js.undefined,
        Labeled: js.UndefOr[IsLabeled] = js.undefined,
        MaxResults: js.UndefOr[PageSize] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined,
        SourceRefContains: js.UndefOr[QueryString] = js.undefined
    ): ListDatasetEntriesRequest = {
      val __obj = js.Dynamic.literal(
        "DatasetType" -> DatasetType.asInstanceOf[js.Any],
        "ProjectName" -> ProjectName.asInstanceOf[js.Any]
      )

      AfterCreationDate.foreach(__v => __obj.updateDynamic("AfterCreationDate")(__v.asInstanceOf[js.Any]))
      AnomalyClass.foreach(__v => __obj.updateDynamic("AnomalyClass")(__v.asInstanceOf[js.Any]))
      BeforeCreationDate.foreach(__v => __obj.updateDynamic("BeforeCreationDate")(__v.asInstanceOf[js.Any]))
      Labeled.foreach(__v => __obj.updateDynamic("Labeled")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      SourceRefContains.foreach(__v => __obj.updateDynamic("SourceRefContains")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDatasetEntriesRequest]
    }
  }

  @js.native
  trait ListDatasetEntriesResponse extends js.Object {
    var DatasetEntries: js.UndefOr[DatasetEntryList]
    var NextToken: js.UndefOr[PaginationToken]
  }

  object ListDatasetEntriesResponse {
    @inline
    def apply(
        DatasetEntries: js.UndefOr[DatasetEntryList] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListDatasetEntriesResponse = {
      val __obj = js.Dynamic.literal()
      DatasetEntries.foreach(__v => __obj.updateDynamic("DatasetEntries")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDatasetEntriesResponse]
    }
  }

  @js.native
  trait ListModelsRequest extends js.Object {
    var ProjectName: ProjectName
    var MaxResults: js.UndefOr[PageSize]
    var NextToken: js.UndefOr[PaginationToken]
  }

  object ListModelsRequest {
    @inline
    def apply(
        ProjectName: ProjectName,
        MaxResults: js.UndefOr[PageSize] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListModelsRequest = {
      val __obj = js.Dynamic.literal(
        "ProjectName" -> ProjectName.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListModelsRequest]
    }
  }

  @js.native
  trait ListModelsResponse extends js.Object {
    var Models: js.UndefOr[ModelMetadataList]
    var NextToken: js.UndefOr[PaginationToken]
  }

  object ListModelsResponse {
    @inline
    def apply(
        Models: js.UndefOr[ModelMetadataList] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListModelsResponse = {
      val __obj = js.Dynamic.literal()
      Models.foreach(__v => __obj.updateDynamic("Models")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListModelsResponse]
    }
  }

  @js.native
  trait ListProjectsRequest extends js.Object {
    var MaxResults: js.UndefOr[PageSize]
    var NextToken: js.UndefOr[PaginationToken]
  }

  object ListProjectsRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[PageSize] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListProjectsRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListProjectsRequest]
    }
  }

  @js.native
  trait ListProjectsResponse extends js.Object {
    var NextToken: js.UndefOr[PaginationToken]
    var Projects: js.UndefOr[ProjectMetadataList]
  }

  object ListProjectsResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[PaginationToken] = js.undefined,
        Projects: js.UndefOr[ProjectMetadataList] = js.undefined
    ): ListProjectsResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Projects.foreach(__v => __obj.updateDynamic("Projects")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListProjectsResponse]
    }
  }

  /** Describes an Amazon Lookout for Vision model.
    */
  @js.native
  trait ModelDescription extends js.Object {
    var CreationTimestamp: js.UndefOr[DateTime]
    var Description: js.UndefOr[ModelDescriptionMessage]
    var EvaluationEndTimestamp: js.UndefOr[DateTime]
    var EvaluationManifest: js.UndefOr[OutputS3Object]
    var EvaluationResult: js.UndefOr[OutputS3Object]
    var KmsKeyId: js.UndefOr[KmsKeyId]
    var ModelArn: js.UndefOr[ModelArn]
    var ModelVersion: js.UndefOr[ModelVersion]
    var OutputConfig: js.UndefOr[OutputConfig]
    var Performance: js.UndefOr[ModelPerformance]
    var Status: js.UndefOr[ModelStatus]
    var StatusMessage: js.UndefOr[ModelStatusMessage]
  }

  object ModelDescription {
    @inline
    def apply(
        CreationTimestamp: js.UndefOr[DateTime] = js.undefined,
        Description: js.UndefOr[ModelDescriptionMessage] = js.undefined,
        EvaluationEndTimestamp: js.UndefOr[DateTime] = js.undefined,
        EvaluationManifest: js.UndefOr[OutputS3Object] = js.undefined,
        EvaluationResult: js.UndefOr[OutputS3Object] = js.undefined,
        KmsKeyId: js.UndefOr[KmsKeyId] = js.undefined,
        ModelArn: js.UndefOr[ModelArn] = js.undefined,
        ModelVersion: js.UndefOr[ModelVersion] = js.undefined,
        OutputConfig: js.UndefOr[OutputConfig] = js.undefined,
        Performance: js.UndefOr[ModelPerformance] = js.undefined,
        Status: js.UndefOr[ModelStatus] = js.undefined,
        StatusMessage: js.UndefOr[ModelStatusMessage] = js.undefined
    ): ModelDescription = {
      val __obj = js.Dynamic.literal()
      CreationTimestamp.foreach(__v => __obj.updateDynamic("CreationTimestamp")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      EvaluationEndTimestamp.foreach(__v => __obj.updateDynamic("EvaluationEndTimestamp")(__v.asInstanceOf[js.Any]))
      EvaluationManifest.foreach(__v => __obj.updateDynamic("EvaluationManifest")(__v.asInstanceOf[js.Any]))
      EvaluationResult.foreach(__v => __obj.updateDynamic("EvaluationResult")(__v.asInstanceOf[js.Any]))
      KmsKeyId.foreach(__v => __obj.updateDynamic("KmsKeyId")(__v.asInstanceOf[js.Any]))
      ModelArn.foreach(__v => __obj.updateDynamic("ModelArn")(__v.asInstanceOf[js.Any]))
      ModelVersion.foreach(__v => __obj.updateDynamic("ModelVersion")(__v.asInstanceOf[js.Any]))
      OutputConfig.foreach(__v => __obj.updateDynamic("OutputConfig")(__v.asInstanceOf[js.Any]))
      Performance.foreach(__v => __obj.updateDynamic("Performance")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      StatusMessage.foreach(__v => __obj.updateDynamic("StatusMessage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ModelDescription]
    }
  }

  @js.native
  sealed trait ModelHostingStatus extends js.Any
  object ModelHostingStatus {
    val RUNNING = "RUNNING".asInstanceOf[ModelHostingStatus]
    val STARTING = "STARTING".asInstanceOf[ModelHostingStatus]
    val STOPPED = "STOPPED".asInstanceOf[ModelHostingStatus]
    val FAILED = "FAILED".asInstanceOf[ModelHostingStatus]

    @inline def values = js.Array(RUNNING, STARTING, STOPPED, FAILED)
  }

  /** Describes an Amazon Lookout for Vision model.
    */
  @js.native
  trait ModelMetadata extends js.Object {
    var CreationTimestamp: js.UndefOr[DateTime]
    var Description: js.UndefOr[ModelDescriptionMessage]
    var ModelArn: js.UndefOr[ModelArn]
    var ModelVersion: js.UndefOr[ModelVersion]
    var Performance: js.UndefOr[ModelPerformance]
    var Status: js.UndefOr[ModelStatus]
    var StatusMessage: js.UndefOr[ModelStatusMessage]
  }

  object ModelMetadata {
    @inline
    def apply(
        CreationTimestamp: js.UndefOr[DateTime] = js.undefined,
        Description: js.UndefOr[ModelDescriptionMessage] = js.undefined,
        ModelArn: js.UndefOr[ModelArn] = js.undefined,
        ModelVersion: js.UndefOr[ModelVersion] = js.undefined,
        Performance: js.UndefOr[ModelPerformance] = js.undefined,
        Status: js.UndefOr[ModelStatus] = js.undefined,
        StatusMessage: js.UndefOr[ModelStatusMessage] = js.undefined
    ): ModelMetadata = {
      val __obj = js.Dynamic.literal()
      CreationTimestamp.foreach(__v => __obj.updateDynamic("CreationTimestamp")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      ModelArn.foreach(__v => __obj.updateDynamic("ModelArn")(__v.asInstanceOf[js.Any]))
      ModelVersion.foreach(__v => __obj.updateDynamic("ModelVersion")(__v.asInstanceOf[js.Any]))
      Performance.foreach(__v => __obj.updateDynamic("Performance")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      StatusMessage.foreach(__v => __obj.updateDynamic("StatusMessage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ModelMetadata]
    }
  }

  /** Information about the evaluation performance of a trained model.
    */
  @js.native
  trait ModelPerformance extends js.Object {
    var F1Score: js.UndefOr[Float]
    var Precision: js.UndefOr[Float]
    var Recall: js.UndefOr[Float]
  }

  object ModelPerformance {
    @inline
    def apply(
        F1Score: js.UndefOr[Float] = js.undefined,
        Precision: js.UndefOr[Float] = js.undefined,
        Recall: js.UndefOr[Float] = js.undefined
    ): ModelPerformance = {
      val __obj = js.Dynamic.literal()
      F1Score.foreach(__v => __obj.updateDynamic("F1Score")(__v.asInstanceOf[js.Any]))
      Precision.foreach(__v => __obj.updateDynamic("Precision")(__v.asInstanceOf[js.Any]))
      Recall.foreach(__v => __obj.updateDynamic("Recall")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ModelPerformance]
    }
  }

  @js.native
  sealed trait ModelStatus extends js.Any
  object ModelStatus {
    val TRAINING = "TRAINING".asInstanceOf[ModelStatus]
    val TRAINED = "TRAINED".asInstanceOf[ModelStatus]
    val TRAINING_FAILED = "TRAINING_FAILED".asInstanceOf[ModelStatus]
    val STARTING_HOSTING = "STARTING_HOSTING".asInstanceOf[ModelStatus]
    val HOSTED = "HOSTED".asInstanceOf[ModelStatus]
    val HOSTING_FAILED = "HOSTING_FAILED".asInstanceOf[ModelStatus]
    val STOPPING_HOSTING = "STOPPING_HOSTING".asInstanceOf[ModelStatus]
    val SYSTEM_UPDATING = "SYSTEM_UPDATING".asInstanceOf[ModelStatus]
    val DELETING = "DELETING".asInstanceOf[ModelStatus]

    @inline def values = js.Array(TRAINING, TRAINED, TRAINING_FAILED, STARTING_HOSTING, HOSTED, HOSTING_FAILED, STOPPING_HOSTING, SYSTEM_UPDATING, DELETING)
  }

  /** The S3 location where Amazon Lookout for Vision saves model training files.
    */
  @js.native
  trait OutputConfig extends js.Object {
    var S3Location: S3Location
  }

  object OutputConfig {
    @inline
    def apply(
        S3Location: S3Location
    ): OutputConfig = {
      val __obj = js.Dynamic.literal(
        "S3Location" -> S3Location.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[OutputConfig]
    }
  }

  /** The S3 location where Amazon Lookout for Vision saves training output.
    */
  @js.native
  trait OutputS3Object extends js.Object {
    var Bucket: S3BucketName
    var Key: S3ObjectKey
  }

  object OutputS3Object {
    @inline
    def apply(
        Bucket: S3BucketName,
        Key: S3ObjectKey
    ): OutputS3Object = {
      val __obj = js.Dynamic.literal(
        "Bucket" -> Bucket.asInstanceOf[js.Any],
        "Key" -> Key.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[OutputS3Object]
    }
  }

  /** Describe an Amazon Lookout for Vision project. For more information, see <a>DescribeProject</a>.
    */
  @js.native
  trait ProjectDescription extends js.Object {
    var CreationTimestamp: js.UndefOr[DateTime]
    var Datasets: js.UndefOr[DatasetMetadataList]
    var ProjectArn: js.UndefOr[ProjectArn]
    var ProjectName: js.UndefOr[ProjectName]
  }

  object ProjectDescription {
    @inline
    def apply(
        CreationTimestamp: js.UndefOr[DateTime] = js.undefined,
        Datasets: js.UndefOr[DatasetMetadataList] = js.undefined,
        ProjectArn: js.UndefOr[ProjectArn] = js.undefined,
        ProjectName: js.UndefOr[ProjectName] = js.undefined
    ): ProjectDescription = {
      val __obj = js.Dynamic.literal()
      CreationTimestamp.foreach(__v => __obj.updateDynamic("CreationTimestamp")(__v.asInstanceOf[js.Any]))
      Datasets.foreach(__v => __obj.updateDynamic("Datasets")(__v.asInstanceOf[js.Any]))
      ProjectArn.foreach(__v => __obj.updateDynamic("ProjectArn")(__v.asInstanceOf[js.Any]))
      ProjectName.foreach(__v => __obj.updateDynamic("ProjectName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ProjectDescription]
    }
  }

  /** Metadata about an Amazon Lookout for Vision project.
    */
  @js.native
  trait ProjectMetadata extends js.Object {
    var CreationTimestamp: js.UndefOr[DateTime]
    var ProjectArn: js.UndefOr[ProjectArn]
    var ProjectName: js.UndefOr[ProjectName]
  }

  object ProjectMetadata {
    @inline
    def apply(
        CreationTimestamp: js.UndefOr[DateTime] = js.undefined,
        ProjectArn: js.UndefOr[ProjectArn] = js.undefined,
        ProjectName: js.UndefOr[ProjectName] = js.undefined
    ): ProjectMetadata = {
      val __obj = js.Dynamic.literal()
      CreationTimestamp.foreach(__v => __obj.updateDynamic("CreationTimestamp")(__v.asInstanceOf[js.Any]))
      ProjectArn.foreach(__v => __obj.updateDynamic("ProjectArn")(__v.asInstanceOf[js.Any]))
      ProjectName.foreach(__v => __obj.updateDynamic("ProjectName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ProjectMetadata]
    }
  }

  /** Information about the location of a manifest file.
    */
  @js.native
  trait S3Location extends js.Object {
    var Bucket: S3BucketName
    var Prefix: js.UndefOr[S3KeyPrefix]
  }

  object S3Location {
    @inline
    def apply(
        Bucket: S3BucketName,
        Prefix: js.UndefOr[S3KeyPrefix] = js.undefined
    ): S3Location = {
      val __obj = js.Dynamic.literal(
        "Bucket" -> Bucket.asInstanceOf[js.Any]
      )

      Prefix.foreach(__v => __obj.updateDynamic("Prefix")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[S3Location]
    }
  }

  @js.native
  trait StartModelRequest extends js.Object {
    var MinInferenceUnits: InferenceUnits
    var ModelVersion: ModelVersion
    var ProjectName: ProjectName
    var ClientToken: js.UndefOr[ClientToken]
  }

  object StartModelRequest {
    @inline
    def apply(
        MinInferenceUnits: InferenceUnits,
        ModelVersion: ModelVersion,
        ProjectName: ProjectName,
        ClientToken: js.UndefOr[ClientToken] = js.undefined
    ): StartModelRequest = {
      val __obj = js.Dynamic.literal(
        "MinInferenceUnits" -> MinInferenceUnits.asInstanceOf[js.Any],
        "ModelVersion" -> ModelVersion.asInstanceOf[js.Any],
        "ProjectName" -> ProjectName.asInstanceOf[js.Any]
      )

      ClientToken.foreach(__v => __obj.updateDynamic("ClientToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartModelRequest]
    }
  }

  @js.native
  trait StartModelResponse extends js.Object {
    var Status: js.UndefOr[ModelHostingStatus]
  }

  object StartModelResponse {
    @inline
    def apply(
        Status: js.UndefOr[ModelHostingStatus] = js.undefined
    ): StartModelResponse = {
      val __obj = js.Dynamic.literal()
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartModelResponse]
    }
  }

  @js.native
  trait StopModelRequest extends js.Object {
    var ModelVersion: ModelVersion
    var ProjectName: ProjectName
    var ClientToken: js.UndefOr[ClientToken]
  }

  object StopModelRequest {
    @inline
    def apply(
        ModelVersion: ModelVersion,
        ProjectName: ProjectName,
        ClientToken: js.UndefOr[ClientToken] = js.undefined
    ): StopModelRequest = {
      val __obj = js.Dynamic.literal(
        "ModelVersion" -> ModelVersion.asInstanceOf[js.Any],
        "ProjectName" -> ProjectName.asInstanceOf[js.Any]
      )

      ClientToken.foreach(__v => __obj.updateDynamic("ClientToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StopModelRequest]
    }
  }

  @js.native
  trait StopModelResponse extends js.Object {
    var Status: js.UndefOr[ModelHostingStatus]
  }

  object StopModelResponse {
    @inline
    def apply(
        Status: js.UndefOr[ModelHostingStatus] = js.undefined
    ): StopModelResponse = {
      val __obj = js.Dynamic.literal()
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StopModelResponse]
    }
  }

  @js.native
  trait UpdateDatasetEntriesRequest extends js.Object {
    var Changes: DatasetChanges
    var DatasetType: DatasetType
    var ProjectName: ProjectName
    var ClientToken: js.UndefOr[ClientToken]
  }

  object UpdateDatasetEntriesRequest {
    @inline
    def apply(
        Changes: DatasetChanges,
        DatasetType: DatasetType,
        ProjectName: ProjectName,
        ClientToken: js.UndefOr[ClientToken] = js.undefined
    ): UpdateDatasetEntriesRequest = {
      val __obj = js.Dynamic.literal(
        "Changes" -> Changes.asInstanceOf[js.Any],
        "DatasetType" -> DatasetType.asInstanceOf[js.Any],
        "ProjectName" -> ProjectName.asInstanceOf[js.Any]
      )

      ClientToken.foreach(__v => __obj.updateDynamic("ClientToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateDatasetEntriesRequest]
    }
  }

  @js.native
  trait UpdateDatasetEntriesResponse extends js.Object {
    var Status: js.UndefOr[DatasetStatus]
  }

  object UpdateDatasetEntriesResponse {
    @inline
    def apply(
        Status: js.UndefOr[DatasetStatus] = js.undefined
    ): UpdateDatasetEntriesResponse = {
      val __obj = js.Dynamic.literal()
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateDatasetEntriesResponse]
    }
  }
}