package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import scala.language.implicitConversions
import facade.amazonaws._

package object lookoutequipment {
  type AmazonResourceArn = String
  type BoundedLengthString = String
  type ComponentTimestampDelimiter = String
  type DataDelayOffsetInMinutes = Double
  type DataIngestionJobSummaries = js.Array[DataIngestionJobSummary]
  type DatasetArn = String
  type DatasetIdentifier = String
  type DatasetName = String
  type DatasetSummaries = js.Array[DatasetSummary]
  type FileNameTimestampFormat = String
  type IamRoleArn = String
  type IdempotenceToken = String
  type InferenceExecutionSummaries = js.Array[InferenceExecutionSummary]
  type InferenceSchedulerArn = String
  type InferenceSchedulerIdentifier = String
  type InferenceSchedulerName = String
  type InferenceSchedulerSummaries = js.Array[InferenceSchedulerSummary]
  type IngestionJobId = String
  type InlineDataSchema = String
  type KmsKeyArn = String
  type MaxResults = Int
  type ModelArn = String
  type ModelMetrics = String
  type ModelName = String
  type ModelSummaries = js.Array[ModelSummary]
  type NameOrArn = String
  type NextToken = String
  type OffCondition = String
  type S3Bucket = String
  type S3Key = String
  type S3Prefix = String
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagList = js.Array[Tag]
  type TagValue = String
  type TimeZoneOffset = String
  type Timestamp = js.Date

  final class LookoutEquipmentOps(private val service: LookoutEquipment) extends AnyVal {

    @inline def createDatasetFuture(params: CreateDatasetRequest): Future[CreateDatasetResponse] = service.createDataset(params).promise().toFuture
    @inline def createInferenceSchedulerFuture(params: CreateInferenceSchedulerRequest): Future[CreateInferenceSchedulerResponse] = service.createInferenceScheduler(params).promise().toFuture
    @inline def createModelFuture(params: CreateModelRequest): Future[CreateModelResponse] = service.createModel(params).promise().toFuture
    @inline def deleteDatasetFuture(params: DeleteDatasetRequest): Future[js.Object] = service.deleteDataset(params).promise().toFuture
    @inline def deleteInferenceSchedulerFuture(params: DeleteInferenceSchedulerRequest): Future[js.Object] = service.deleteInferenceScheduler(params).promise().toFuture
    @inline def deleteModelFuture(params: DeleteModelRequest): Future[js.Object] = service.deleteModel(params).promise().toFuture
    @inline def describeDataIngestionJobFuture(params: DescribeDataIngestionJobRequest): Future[DescribeDataIngestionJobResponse] = service.describeDataIngestionJob(params).promise().toFuture
    @inline def describeDatasetFuture(params: DescribeDatasetRequest): Future[DescribeDatasetResponse] = service.describeDataset(params).promise().toFuture
    @inline def describeInferenceSchedulerFuture(params: DescribeInferenceSchedulerRequest): Future[DescribeInferenceSchedulerResponse] = service.describeInferenceScheduler(params).promise().toFuture
    @inline def describeModelFuture(params: DescribeModelRequest): Future[DescribeModelResponse] = service.describeModel(params).promise().toFuture
    @inline def listDataIngestionJobsFuture(params: ListDataIngestionJobsRequest): Future[ListDataIngestionJobsResponse] = service.listDataIngestionJobs(params).promise().toFuture
    @inline def listDatasetsFuture(params: ListDatasetsRequest): Future[ListDatasetsResponse] = service.listDatasets(params).promise().toFuture
    @inline def listInferenceExecutionsFuture(params: ListInferenceExecutionsRequest): Future[ListInferenceExecutionsResponse] = service.listInferenceExecutions(params).promise().toFuture
    @inline def listInferenceSchedulersFuture(params: ListInferenceSchedulersRequest): Future[ListInferenceSchedulersResponse] = service.listInferenceSchedulers(params).promise().toFuture
    @inline def listModelsFuture(params: ListModelsRequest): Future[ListModelsResponse] = service.listModels(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] = service.listTagsForResource(params).promise().toFuture
    @inline def startDataIngestionJobFuture(params: StartDataIngestionJobRequest): Future[StartDataIngestionJobResponse] = service.startDataIngestionJob(params).promise().toFuture
    @inline def startInferenceSchedulerFuture(params: StartInferenceSchedulerRequest): Future[StartInferenceSchedulerResponse] = service.startInferenceScheduler(params).promise().toFuture
    @inline def stopInferenceSchedulerFuture(params: StopInferenceSchedulerRequest): Future[StopInferenceSchedulerResponse] = service.stopInferenceScheduler(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] = service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] = service.untagResource(params).promise().toFuture
    @inline def updateInferenceSchedulerFuture(params: UpdateInferenceSchedulerRequest): Future[js.Object] = service.updateInferenceScheduler(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/lookoutequipment", JSImport.Namespace, "AWS.LookoutEquipment")
  class LookoutEquipment() extends js.Object {
    def this(config: AWSConfig) = this()

    def createDataset(params: CreateDatasetRequest): Request[CreateDatasetResponse] = js.native
    def createInferenceScheduler(params: CreateInferenceSchedulerRequest): Request[CreateInferenceSchedulerResponse] = js.native
    def createModel(params: CreateModelRequest): Request[CreateModelResponse] = js.native
    def deleteDataset(params: DeleteDatasetRequest): Request[js.Object] = js.native
    def deleteInferenceScheduler(params: DeleteInferenceSchedulerRequest): Request[js.Object] = js.native
    def deleteModel(params: DeleteModelRequest): Request[js.Object] = js.native
    def describeDataIngestionJob(params: DescribeDataIngestionJobRequest): Request[DescribeDataIngestionJobResponse] = js.native
    def describeDataset(params: DescribeDatasetRequest): Request[DescribeDatasetResponse] = js.native
    def describeInferenceScheduler(params: DescribeInferenceSchedulerRequest): Request[DescribeInferenceSchedulerResponse] = js.native
    def describeModel(params: DescribeModelRequest): Request[DescribeModelResponse] = js.native
    def listDataIngestionJobs(params: ListDataIngestionJobsRequest): Request[ListDataIngestionJobsResponse] = js.native
    def listDatasets(params: ListDatasetsRequest): Request[ListDatasetsResponse] = js.native
    def listInferenceExecutions(params: ListInferenceExecutionsRequest): Request[ListInferenceExecutionsResponse] = js.native
    def listInferenceSchedulers(params: ListInferenceSchedulersRequest): Request[ListInferenceSchedulersResponse] = js.native
    def listModels(params: ListModelsRequest): Request[ListModelsResponse] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def startDataIngestionJob(params: StartDataIngestionJobRequest): Request[StartDataIngestionJobResponse] = js.native
    def startInferenceScheduler(params: StartInferenceSchedulerRequest): Request[StartInferenceSchedulerResponse] = js.native
    def stopInferenceScheduler(params: StopInferenceSchedulerRequest): Request[StopInferenceSchedulerResponse] = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse] = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse] = js.native
    def updateInferenceScheduler(params: UpdateInferenceSchedulerRequest): Request[js.Object] = js.native
  }
  object LookoutEquipment {
    @inline implicit def toOps(service: LookoutEquipment): LookoutEquipmentOps = {
      new LookoutEquipmentOps(service)
    }
  }

  @js.native
  trait CreateDatasetRequest extends js.Object {
    var ClientToken: IdempotenceToken
    var DatasetName: DatasetName
    var DatasetSchema: DatasetSchema
    var ServerSideKmsKeyId: js.UndefOr[NameOrArn]
    var Tags: js.UndefOr[TagList]
  }

  object CreateDatasetRequest {
    @inline
    def apply(
        ClientToken: IdempotenceToken,
        DatasetName: DatasetName,
        DatasetSchema: DatasetSchema,
        ServerSideKmsKeyId: js.UndefOr[NameOrArn] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateDatasetRequest = {
      val __obj = js.Dynamic.literal(
        "ClientToken" -> ClientToken.asInstanceOf[js.Any],
        "DatasetName" -> DatasetName.asInstanceOf[js.Any],
        "DatasetSchema" -> DatasetSchema.asInstanceOf[js.Any]
      )

      ServerSideKmsKeyId.foreach(__v => __obj.updateDynamic("ServerSideKmsKeyId")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDatasetRequest]
    }
  }

  @js.native
  trait CreateDatasetResponse extends js.Object {
    var DatasetArn: js.UndefOr[DatasetArn]
    var DatasetName: js.UndefOr[DatasetName]
    var Status: js.UndefOr[DatasetStatus]
  }

  object CreateDatasetResponse {
    @inline
    def apply(
        DatasetArn: js.UndefOr[DatasetArn] = js.undefined,
        DatasetName: js.UndefOr[DatasetName] = js.undefined,
        Status: js.UndefOr[DatasetStatus] = js.undefined
    ): CreateDatasetResponse = {
      val __obj = js.Dynamic.literal()
      DatasetArn.foreach(__v => __obj.updateDynamic("DatasetArn")(__v.asInstanceOf[js.Any]))
      DatasetName.foreach(__v => __obj.updateDynamic("DatasetName")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDatasetResponse]
    }
  }

  @js.native
  trait CreateInferenceSchedulerRequest extends js.Object {
    var ClientToken: IdempotenceToken
    var DataInputConfiguration: InferenceInputConfiguration
    var DataOutputConfiguration: InferenceOutputConfiguration
    var DataUploadFrequency: DataUploadFrequency
    var InferenceSchedulerName: InferenceSchedulerName
    var ModelName: ModelName
    var RoleArn: IamRoleArn
    var DataDelayOffsetInMinutes: js.UndefOr[DataDelayOffsetInMinutes]
    var ServerSideKmsKeyId: js.UndefOr[NameOrArn]
    var Tags: js.UndefOr[TagList]
  }

  object CreateInferenceSchedulerRequest {
    @inline
    def apply(
        ClientToken: IdempotenceToken,
        DataInputConfiguration: InferenceInputConfiguration,
        DataOutputConfiguration: InferenceOutputConfiguration,
        DataUploadFrequency: DataUploadFrequency,
        InferenceSchedulerName: InferenceSchedulerName,
        ModelName: ModelName,
        RoleArn: IamRoleArn,
        DataDelayOffsetInMinutes: js.UndefOr[DataDelayOffsetInMinutes] = js.undefined,
        ServerSideKmsKeyId: js.UndefOr[NameOrArn] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateInferenceSchedulerRequest = {
      val __obj = js.Dynamic.literal(
        "ClientToken" -> ClientToken.asInstanceOf[js.Any],
        "DataInputConfiguration" -> DataInputConfiguration.asInstanceOf[js.Any],
        "DataOutputConfiguration" -> DataOutputConfiguration.asInstanceOf[js.Any],
        "DataUploadFrequency" -> DataUploadFrequency.asInstanceOf[js.Any],
        "InferenceSchedulerName" -> InferenceSchedulerName.asInstanceOf[js.Any],
        "ModelName" -> ModelName.asInstanceOf[js.Any],
        "RoleArn" -> RoleArn.asInstanceOf[js.Any]
      )

      DataDelayOffsetInMinutes.foreach(__v => __obj.updateDynamic("DataDelayOffsetInMinutes")(__v.asInstanceOf[js.Any]))
      ServerSideKmsKeyId.foreach(__v => __obj.updateDynamic("ServerSideKmsKeyId")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateInferenceSchedulerRequest]
    }
  }

  @js.native
  trait CreateInferenceSchedulerResponse extends js.Object {
    var InferenceSchedulerArn: js.UndefOr[InferenceSchedulerArn]
    var InferenceSchedulerName: js.UndefOr[InferenceSchedulerName]
    var Status: js.UndefOr[InferenceSchedulerStatus]
  }

  object CreateInferenceSchedulerResponse {
    @inline
    def apply(
        InferenceSchedulerArn: js.UndefOr[InferenceSchedulerArn] = js.undefined,
        InferenceSchedulerName: js.UndefOr[InferenceSchedulerName] = js.undefined,
        Status: js.UndefOr[InferenceSchedulerStatus] = js.undefined
    ): CreateInferenceSchedulerResponse = {
      val __obj = js.Dynamic.literal()
      InferenceSchedulerArn.foreach(__v => __obj.updateDynamic("InferenceSchedulerArn")(__v.asInstanceOf[js.Any]))
      InferenceSchedulerName.foreach(__v => __obj.updateDynamic("InferenceSchedulerName")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateInferenceSchedulerResponse]
    }
  }

  @js.native
  trait CreateModelRequest extends js.Object {
    var ClientToken: IdempotenceToken
    var DatasetName: DatasetIdentifier
    var ModelName: ModelName
    var DataPreProcessingConfiguration: js.UndefOr[DataPreProcessingConfiguration]
    var DatasetSchema: js.UndefOr[DatasetSchema]
    var EvaluationDataEndTime: js.UndefOr[Timestamp]
    var EvaluationDataStartTime: js.UndefOr[Timestamp]
    var LabelsInputConfiguration: js.UndefOr[LabelsInputConfiguration]
    var OffCondition: js.UndefOr[OffCondition]
    var RoleArn: js.UndefOr[IamRoleArn]
    var ServerSideKmsKeyId: js.UndefOr[NameOrArn]
    var Tags: js.UndefOr[TagList]
    var TrainingDataEndTime: js.UndefOr[Timestamp]
    var TrainingDataStartTime: js.UndefOr[Timestamp]
  }

  object CreateModelRequest {
    @inline
    def apply(
        ClientToken: IdempotenceToken,
        DatasetName: DatasetIdentifier,
        ModelName: ModelName,
        DataPreProcessingConfiguration: js.UndefOr[DataPreProcessingConfiguration] = js.undefined,
        DatasetSchema: js.UndefOr[DatasetSchema] = js.undefined,
        EvaluationDataEndTime: js.UndefOr[Timestamp] = js.undefined,
        EvaluationDataStartTime: js.UndefOr[Timestamp] = js.undefined,
        LabelsInputConfiguration: js.UndefOr[LabelsInputConfiguration] = js.undefined,
        OffCondition: js.UndefOr[OffCondition] = js.undefined,
        RoleArn: js.UndefOr[IamRoleArn] = js.undefined,
        ServerSideKmsKeyId: js.UndefOr[NameOrArn] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined,
        TrainingDataEndTime: js.UndefOr[Timestamp] = js.undefined,
        TrainingDataStartTime: js.UndefOr[Timestamp] = js.undefined
    ): CreateModelRequest = {
      val __obj = js.Dynamic.literal(
        "ClientToken" -> ClientToken.asInstanceOf[js.Any],
        "DatasetName" -> DatasetName.asInstanceOf[js.Any],
        "ModelName" -> ModelName.asInstanceOf[js.Any]
      )

      DataPreProcessingConfiguration.foreach(__v => __obj.updateDynamic("DataPreProcessingConfiguration")(__v.asInstanceOf[js.Any]))
      DatasetSchema.foreach(__v => __obj.updateDynamic("DatasetSchema")(__v.asInstanceOf[js.Any]))
      EvaluationDataEndTime.foreach(__v => __obj.updateDynamic("EvaluationDataEndTime")(__v.asInstanceOf[js.Any]))
      EvaluationDataStartTime.foreach(__v => __obj.updateDynamic("EvaluationDataStartTime")(__v.asInstanceOf[js.Any]))
      LabelsInputConfiguration.foreach(__v => __obj.updateDynamic("LabelsInputConfiguration")(__v.asInstanceOf[js.Any]))
      OffCondition.foreach(__v => __obj.updateDynamic("OffCondition")(__v.asInstanceOf[js.Any]))
      RoleArn.foreach(__v => __obj.updateDynamic("RoleArn")(__v.asInstanceOf[js.Any]))
      ServerSideKmsKeyId.foreach(__v => __obj.updateDynamic("ServerSideKmsKeyId")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      TrainingDataEndTime.foreach(__v => __obj.updateDynamic("TrainingDataEndTime")(__v.asInstanceOf[js.Any]))
      TrainingDataStartTime.foreach(__v => __obj.updateDynamic("TrainingDataStartTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateModelRequest]
    }
  }

  @js.native
  trait CreateModelResponse extends js.Object {
    var ModelArn: js.UndefOr[ModelArn]
    var Status: js.UndefOr[ModelStatus]
  }

  object CreateModelResponse {
    @inline
    def apply(
        ModelArn: js.UndefOr[ModelArn] = js.undefined,
        Status: js.UndefOr[ModelStatus] = js.undefined
    ): CreateModelResponse = {
      val __obj = js.Dynamic.literal()
      ModelArn.foreach(__v => __obj.updateDynamic("ModelArn")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateModelResponse]
    }
  }

  /** Provides information about a specified data ingestion job, including dataset information, data ingestion configuration, and status.
    */
  @js.native
  trait DataIngestionJobSummary extends js.Object {
    var DatasetArn: js.UndefOr[DatasetArn]
    var DatasetName: js.UndefOr[DatasetName]
    var IngestionInputConfiguration: js.UndefOr[IngestionInputConfiguration]
    var JobId: js.UndefOr[IngestionJobId]
    var Status: js.UndefOr[IngestionJobStatus]
  }

  object DataIngestionJobSummary {
    @inline
    def apply(
        DatasetArn: js.UndefOr[DatasetArn] = js.undefined,
        DatasetName: js.UndefOr[DatasetName] = js.undefined,
        IngestionInputConfiguration: js.UndefOr[IngestionInputConfiguration] = js.undefined,
        JobId: js.UndefOr[IngestionJobId] = js.undefined,
        Status: js.UndefOr[IngestionJobStatus] = js.undefined
    ): DataIngestionJobSummary = {
      val __obj = js.Dynamic.literal()
      DatasetArn.foreach(__v => __obj.updateDynamic("DatasetArn")(__v.asInstanceOf[js.Any]))
      DatasetName.foreach(__v => __obj.updateDynamic("DatasetName")(__v.asInstanceOf[js.Any]))
      IngestionInputConfiguration.foreach(__v => __obj.updateDynamic("IngestionInputConfiguration")(__v.asInstanceOf[js.Any]))
      JobId.foreach(__v => __obj.updateDynamic("JobId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DataIngestionJobSummary]
    }
  }

  /** The configuration is the <code>TargetSamplingRate</code>, which is the sampling rate of the data after post processing by Amazon Lookout for Equipment. For example, if you provide data that has been collected at a 1 second level and you want the system to resample the data at a 1 minute rate before training, the <code>TargetSamplingRate</code> is 1 minute. When providing a value for the <code>TargetSamplingRate</code>, you must attach the prefix "PT" to the rate you want. The value for a 1 second rate is therefore <i>PT1S</i>, the value for a 15 minute rate is <i>PT15M</i>, and the value for a 1 hour rate is <i>PT1H</i>
    */
  @js.native
  trait DataPreProcessingConfiguration extends js.Object {
    var TargetSamplingRate: js.UndefOr[TargetSamplingRate]
  }

  object DataPreProcessingConfiguration {
    @inline
    def apply(
        TargetSamplingRate: js.UndefOr[TargetSamplingRate] = js.undefined
    ): DataPreProcessingConfiguration = {
      val __obj = js.Dynamic.literal()
      TargetSamplingRate.foreach(__v => __obj.updateDynamic("TargetSamplingRate")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DataPreProcessingConfiguration]
    }
  }

  /** Provides information about the data schema used with the given dataset.
    */
  @js.native
  trait DatasetSchema extends js.Object {
    var InlineDataSchema: js.UndefOr[InlineDataSchema]
  }

  object DatasetSchema {
    @inline
    def apply(
        InlineDataSchema: js.UndefOr[InlineDataSchema] = js.undefined
    ): DatasetSchema = {
      val __obj = js.Dynamic.literal()
      InlineDataSchema.foreach(__v => __obj.updateDynamic("InlineDataSchema")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DatasetSchema]
    }
  }

  /** Contains information about the specific data set, including name, ARN, and status.
    */
  @js.native
  trait DatasetSummary extends js.Object {
    var CreatedAt: js.UndefOr[Timestamp]
    var DatasetArn: js.UndefOr[DatasetArn]
    var DatasetName: js.UndefOr[DatasetName]
    var Status: js.UndefOr[DatasetStatus]
  }

  object DatasetSummary {
    @inline
    def apply(
        CreatedAt: js.UndefOr[Timestamp] = js.undefined,
        DatasetArn: js.UndefOr[DatasetArn] = js.undefined,
        DatasetName: js.UndefOr[DatasetName] = js.undefined,
        Status: js.UndefOr[DatasetStatus] = js.undefined
    ): DatasetSummary = {
      val __obj = js.Dynamic.literal()
      CreatedAt.foreach(__v => __obj.updateDynamic("CreatedAt")(__v.asInstanceOf[js.Any]))
      DatasetArn.foreach(__v => __obj.updateDynamic("DatasetArn")(__v.asInstanceOf[js.Any]))
      DatasetName.foreach(__v => __obj.updateDynamic("DatasetName")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DatasetSummary]
    }
  }

  @js.native
  trait DeleteDatasetRequest extends js.Object {
    var DatasetName: DatasetIdentifier
  }

  object DeleteDatasetRequest {
    @inline
    def apply(
        DatasetName: DatasetIdentifier
    ): DeleteDatasetRequest = {
      val __obj = js.Dynamic.literal(
        "DatasetName" -> DatasetName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteDatasetRequest]
    }
  }

  @js.native
  trait DeleteInferenceSchedulerRequest extends js.Object {
    var InferenceSchedulerName: InferenceSchedulerIdentifier
  }

  object DeleteInferenceSchedulerRequest {
    @inline
    def apply(
        InferenceSchedulerName: InferenceSchedulerIdentifier
    ): DeleteInferenceSchedulerRequest = {
      val __obj = js.Dynamic.literal(
        "InferenceSchedulerName" -> InferenceSchedulerName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteInferenceSchedulerRequest]
    }
  }

  @js.native
  trait DeleteModelRequest extends js.Object {
    var ModelName: ModelName
  }

  object DeleteModelRequest {
    @inline
    def apply(
        ModelName: ModelName
    ): DeleteModelRequest = {
      val __obj = js.Dynamic.literal(
        "ModelName" -> ModelName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteModelRequest]
    }
  }

  @js.native
  trait DescribeDataIngestionJobRequest extends js.Object {
    var JobId: IngestionJobId
  }

  object DescribeDataIngestionJobRequest {
    @inline
    def apply(
        JobId: IngestionJobId
    ): DescribeDataIngestionJobRequest = {
      val __obj = js.Dynamic.literal(
        "JobId" -> JobId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeDataIngestionJobRequest]
    }
  }

  @js.native
  trait DescribeDataIngestionJobResponse extends js.Object {
    var CreatedAt: js.UndefOr[Timestamp]
    var DatasetArn: js.UndefOr[DatasetArn]
    var FailedReason: js.UndefOr[BoundedLengthString]
    var IngestionInputConfiguration: js.UndefOr[IngestionInputConfiguration]
    var JobId: js.UndefOr[IngestionJobId]
    var RoleArn: js.UndefOr[IamRoleArn]
    var Status: js.UndefOr[IngestionJobStatus]
  }

  object DescribeDataIngestionJobResponse {
    @inline
    def apply(
        CreatedAt: js.UndefOr[Timestamp] = js.undefined,
        DatasetArn: js.UndefOr[DatasetArn] = js.undefined,
        FailedReason: js.UndefOr[BoundedLengthString] = js.undefined,
        IngestionInputConfiguration: js.UndefOr[IngestionInputConfiguration] = js.undefined,
        JobId: js.UndefOr[IngestionJobId] = js.undefined,
        RoleArn: js.UndefOr[IamRoleArn] = js.undefined,
        Status: js.UndefOr[IngestionJobStatus] = js.undefined
    ): DescribeDataIngestionJobResponse = {
      val __obj = js.Dynamic.literal()
      CreatedAt.foreach(__v => __obj.updateDynamic("CreatedAt")(__v.asInstanceOf[js.Any]))
      DatasetArn.foreach(__v => __obj.updateDynamic("DatasetArn")(__v.asInstanceOf[js.Any]))
      FailedReason.foreach(__v => __obj.updateDynamic("FailedReason")(__v.asInstanceOf[js.Any]))
      IngestionInputConfiguration.foreach(__v => __obj.updateDynamic("IngestionInputConfiguration")(__v.asInstanceOf[js.Any]))
      JobId.foreach(__v => __obj.updateDynamic("JobId")(__v.asInstanceOf[js.Any]))
      RoleArn.foreach(__v => __obj.updateDynamic("RoleArn")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeDataIngestionJobResponse]
    }
  }

  @js.native
  trait DescribeDatasetRequest extends js.Object {
    var DatasetName: DatasetIdentifier
  }

  object DescribeDatasetRequest {
    @inline
    def apply(
        DatasetName: DatasetIdentifier
    ): DescribeDatasetRequest = {
      val __obj = js.Dynamic.literal(
        "DatasetName" -> DatasetName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeDatasetRequest]
    }
  }

  @js.native
  trait DescribeDatasetResponse extends js.Object {
    var CreatedAt: js.UndefOr[Timestamp]
    var DatasetArn: js.UndefOr[DatasetArn]
    var DatasetName: js.UndefOr[DatasetName]
    var IngestionInputConfiguration: js.UndefOr[IngestionInputConfiguration]
    var LastUpdatedAt: js.UndefOr[Timestamp]
    var Schema: js.UndefOr[InlineDataSchema]
    var ServerSideKmsKeyId: js.UndefOr[KmsKeyArn]
    var Status: js.UndefOr[DatasetStatus]
  }

  object DescribeDatasetResponse {
    @inline
    def apply(
        CreatedAt: js.UndefOr[Timestamp] = js.undefined,
        DatasetArn: js.UndefOr[DatasetArn] = js.undefined,
        DatasetName: js.UndefOr[DatasetName] = js.undefined,
        IngestionInputConfiguration: js.UndefOr[IngestionInputConfiguration] = js.undefined,
        LastUpdatedAt: js.UndefOr[Timestamp] = js.undefined,
        Schema: js.UndefOr[InlineDataSchema] = js.undefined,
        ServerSideKmsKeyId: js.UndefOr[KmsKeyArn] = js.undefined,
        Status: js.UndefOr[DatasetStatus] = js.undefined
    ): DescribeDatasetResponse = {
      val __obj = js.Dynamic.literal()
      CreatedAt.foreach(__v => __obj.updateDynamic("CreatedAt")(__v.asInstanceOf[js.Any]))
      DatasetArn.foreach(__v => __obj.updateDynamic("DatasetArn")(__v.asInstanceOf[js.Any]))
      DatasetName.foreach(__v => __obj.updateDynamic("DatasetName")(__v.asInstanceOf[js.Any]))
      IngestionInputConfiguration.foreach(__v => __obj.updateDynamic("IngestionInputConfiguration")(__v.asInstanceOf[js.Any]))
      LastUpdatedAt.foreach(__v => __obj.updateDynamic("LastUpdatedAt")(__v.asInstanceOf[js.Any]))
      Schema.foreach(__v => __obj.updateDynamic("Schema")(__v.asInstanceOf[js.Any]))
      ServerSideKmsKeyId.foreach(__v => __obj.updateDynamic("ServerSideKmsKeyId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeDatasetResponse]
    }
  }

  @js.native
  trait DescribeInferenceSchedulerRequest extends js.Object {
    var InferenceSchedulerName: InferenceSchedulerIdentifier
  }

  object DescribeInferenceSchedulerRequest {
    @inline
    def apply(
        InferenceSchedulerName: InferenceSchedulerIdentifier
    ): DescribeInferenceSchedulerRequest = {
      val __obj = js.Dynamic.literal(
        "InferenceSchedulerName" -> InferenceSchedulerName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeInferenceSchedulerRequest]
    }
  }

  @js.native
  trait DescribeInferenceSchedulerResponse extends js.Object {
    var CreatedAt: js.UndefOr[Timestamp]
    var DataDelayOffsetInMinutes: js.UndefOr[DataDelayOffsetInMinutes]
    var DataInputConfiguration: js.UndefOr[InferenceInputConfiguration]
    var DataOutputConfiguration: js.UndefOr[InferenceOutputConfiguration]
    var DataUploadFrequency: js.UndefOr[DataUploadFrequency]
    var InferenceSchedulerArn: js.UndefOr[InferenceSchedulerArn]
    var InferenceSchedulerName: js.UndefOr[InferenceSchedulerName]
    var ModelArn: js.UndefOr[ModelArn]
    var ModelName: js.UndefOr[ModelName]
    var RoleArn: js.UndefOr[IamRoleArn]
    var ServerSideKmsKeyId: js.UndefOr[KmsKeyArn]
    var Status: js.UndefOr[InferenceSchedulerStatus]
    var UpdatedAt: js.UndefOr[Timestamp]
  }

  object DescribeInferenceSchedulerResponse {
    @inline
    def apply(
        CreatedAt: js.UndefOr[Timestamp] = js.undefined,
        DataDelayOffsetInMinutes: js.UndefOr[DataDelayOffsetInMinutes] = js.undefined,
        DataInputConfiguration: js.UndefOr[InferenceInputConfiguration] = js.undefined,
        DataOutputConfiguration: js.UndefOr[InferenceOutputConfiguration] = js.undefined,
        DataUploadFrequency: js.UndefOr[DataUploadFrequency] = js.undefined,
        InferenceSchedulerArn: js.UndefOr[InferenceSchedulerArn] = js.undefined,
        InferenceSchedulerName: js.UndefOr[InferenceSchedulerName] = js.undefined,
        ModelArn: js.UndefOr[ModelArn] = js.undefined,
        ModelName: js.UndefOr[ModelName] = js.undefined,
        RoleArn: js.UndefOr[IamRoleArn] = js.undefined,
        ServerSideKmsKeyId: js.UndefOr[KmsKeyArn] = js.undefined,
        Status: js.UndefOr[InferenceSchedulerStatus] = js.undefined,
        UpdatedAt: js.UndefOr[Timestamp] = js.undefined
    ): DescribeInferenceSchedulerResponse = {
      val __obj = js.Dynamic.literal()
      CreatedAt.foreach(__v => __obj.updateDynamic("CreatedAt")(__v.asInstanceOf[js.Any]))
      DataDelayOffsetInMinutes.foreach(__v => __obj.updateDynamic("DataDelayOffsetInMinutes")(__v.asInstanceOf[js.Any]))
      DataInputConfiguration.foreach(__v => __obj.updateDynamic("DataInputConfiguration")(__v.asInstanceOf[js.Any]))
      DataOutputConfiguration.foreach(__v => __obj.updateDynamic("DataOutputConfiguration")(__v.asInstanceOf[js.Any]))
      DataUploadFrequency.foreach(__v => __obj.updateDynamic("DataUploadFrequency")(__v.asInstanceOf[js.Any]))
      InferenceSchedulerArn.foreach(__v => __obj.updateDynamic("InferenceSchedulerArn")(__v.asInstanceOf[js.Any]))
      InferenceSchedulerName.foreach(__v => __obj.updateDynamic("InferenceSchedulerName")(__v.asInstanceOf[js.Any]))
      ModelArn.foreach(__v => __obj.updateDynamic("ModelArn")(__v.asInstanceOf[js.Any]))
      ModelName.foreach(__v => __obj.updateDynamic("ModelName")(__v.asInstanceOf[js.Any]))
      RoleArn.foreach(__v => __obj.updateDynamic("RoleArn")(__v.asInstanceOf[js.Any]))
      ServerSideKmsKeyId.foreach(__v => __obj.updateDynamic("ServerSideKmsKeyId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      UpdatedAt.foreach(__v => __obj.updateDynamic("UpdatedAt")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeInferenceSchedulerResponse]
    }
  }

  @js.native
  trait DescribeModelRequest extends js.Object {
    var ModelName: ModelName
  }

  object DescribeModelRequest {
    @inline
    def apply(
        ModelName: ModelName
    ): DescribeModelRequest = {
      val __obj = js.Dynamic.literal(
        "ModelName" -> ModelName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeModelRequest]
    }
  }

  @js.native
  trait DescribeModelResponse extends js.Object {
    var CreatedAt: js.UndefOr[Timestamp]
    var DataPreProcessingConfiguration: js.UndefOr[DataPreProcessingConfiguration]
    var DatasetArn: js.UndefOr[DatasetArn]
    var DatasetName: js.UndefOr[DatasetName]
    var EvaluationDataEndTime: js.UndefOr[Timestamp]
    var EvaluationDataStartTime: js.UndefOr[Timestamp]
    var FailedReason: js.UndefOr[BoundedLengthString]
    var LabelsInputConfiguration: js.UndefOr[LabelsInputConfiguration]
    var LastUpdatedTime: js.UndefOr[Timestamp]
    var ModelArn: js.UndefOr[ModelArn]
    var ModelMetrics: js.UndefOr[ModelMetrics]
    var ModelName: js.UndefOr[ModelName]
    var OffCondition: js.UndefOr[OffCondition]
    var RoleArn: js.UndefOr[IamRoleArn]
    var Schema: js.UndefOr[InlineDataSchema]
    var ServerSideKmsKeyId: js.UndefOr[KmsKeyArn]
    var Status: js.UndefOr[ModelStatus]
    var TrainingDataEndTime: js.UndefOr[Timestamp]
    var TrainingDataStartTime: js.UndefOr[Timestamp]
    var TrainingExecutionEndTime: js.UndefOr[Timestamp]
    var TrainingExecutionStartTime: js.UndefOr[Timestamp]
  }

  object DescribeModelResponse {
    @inline
    def apply(
        CreatedAt: js.UndefOr[Timestamp] = js.undefined,
        DataPreProcessingConfiguration: js.UndefOr[DataPreProcessingConfiguration] = js.undefined,
        DatasetArn: js.UndefOr[DatasetArn] = js.undefined,
        DatasetName: js.UndefOr[DatasetName] = js.undefined,
        EvaluationDataEndTime: js.UndefOr[Timestamp] = js.undefined,
        EvaluationDataStartTime: js.UndefOr[Timestamp] = js.undefined,
        FailedReason: js.UndefOr[BoundedLengthString] = js.undefined,
        LabelsInputConfiguration: js.UndefOr[LabelsInputConfiguration] = js.undefined,
        LastUpdatedTime: js.UndefOr[Timestamp] = js.undefined,
        ModelArn: js.UndefOr[ModelArn] = js.undefined,
        ModelMetrics: js.UndefOr[ModelMetrics] = js.undefined,
        ModelName: js.UndefOr[ModelName] = js.undefined,
        OffCondition: js.UndefOr[OffCondition] = js.undefined,
        RoleArn: js.UndefOr[IamRoleArn] = js.undefined,
        Schema: js.UndefOr[InlineDataSchema] = js.undefined,
        ServerSideKmsKeyId: js.UndefOr[KmsKeyArn] = js.undefined,
        Status: js.UndefOr[ModelStatus] = js.undefined,
        TrainingDataEndTime: js.UndefOr[Timestamp] = js.undefined,
        TrainingDataStartTime: js.UndefOr[Timestamp] = js.undefined,
        TrainingExecutionEndTime: js.UndefOr[Timestamp] = js.undefined,
        TrainingExecutionStartTime: js.UndefOr[Timestamp] = js.undefined
    ): DescribeModelResponse = {
      val __obj = js.Dynamic.literal()
      CreatedAt.foreach(__v => __obj.updateDynamic("CreatedAt")(__v.asInstanceOf[js.Any]))
      DataPreProcessingConfiguration.foreach(__v => __obj.updateDynamic("DataPreProcessingConfiguration")(__v.asInstanceOf[js.Any]))
      DatasetArn.foreach(__v => __obj.updateDynamic("DatasetArn")(__v.asInstanceOf[js.Any]))
      DatasetName.foreach(__v => __obj.updateDynamic("DatasetName")(__v.asInstanceOf[js.Any]))
      EvaluationDataEndTime.foreach(__v => __obj.updateDynamic("EvaluationDataEndTime")(__v.asInstanceOf[js.Any]))
      EvaluationDataStartTime.foreach(__v => __obj.updateDynamic("EvaluationDataStartTime")(__v.asInstanceOf[js.Any]))
      FailedReason.foreach(__v => __obj.updateDynamic("FailedReason")(__v.asInstanceOf[js.Any]))
      LabelsInputConfiguration.foreach(__v => __obj.updateDynamic("LabelsInputConfiguration")(__v.asInstanceOf[js.Any]))
      LastUpdatedTime.foreach(__v => __obj.updateDynamic("LastUpdatedTime")(__v.asInstanceOf[js.Any]))
      ModelArn.foreach(__v => __obj.updateDynamic("ModelArn")(__v.asInstanceOf[js.Any]))
      ModelMetrics.foreach(__v => __obj.updateDynamic("ModelMetrics")(__v.asInstanceOf[js.Any]))
      ModelName.foreach(__v => __obj.updateDynamic("ModelName")(__v.asInstanceOf[js.Any]))
      OffCondition.foreach(__v => __obj.updateDynamic("OffCondition")(__v.asInstanceOf[js.Any]))
      RoleArn.foreach(__v => __obj.updateDynamic("RoleArn")(__v.asInstanceOf[js.Any]))
      Schema.foreach(__v => __obj.updateDynamic("Schema")(__v.asInstanceOf[js.Any]))
      ServerSideKmsKeyId.foreach(__v => __obj.updateDynamic("ServerSideKmsKeyId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      TrainingDataEndTime.foreach(__v => __obj.updateDynamic("TrainingDataEndTime")(__v.asInstanceOf[js.Any]))
      TrainingDataStartTime.foreach(__v => __obj.updateDynamic("TrainingDataStartTime")(__v.asInstanceOf[js.Any]))
      TrainingExecutionEndTime.foreach(__v => __obj.updateDynamic("TrainingExecutionEndTime")(__v.asInstanceOf[js.Any]))
      TrainingExecutionStartTime.foreach(__v => __obj.updateDynamic("TrainingExecutionStartTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeModelResponse]
    }
  }

  /** Contains information about the specific inference execution, including input and output data configuration, inference scheduling information, status, and so on.
    */
  @js.native
  trait InferenceExecutionSummary extends js.Object {
    var CustomerResultObject: js.UndefOr[S3Object]
    var DataEndTime: js.UndefOr[Timestamp]
    var DataInputConfiguration: js.UndefOr[InferenceInputConfiguration]
    var DataOutputConfiguration: js.UndefOr[InferenceOutputConfiguration]
    var DataStartTime: js.UndefOr[Timestamp]
    var FailedReason: js.UndefOr[BoundedLengthString]
    var InferenceSchedulerArn: js.UndefOr[InferenceSchedulerArn]
    var InferenceSchedulerName: js.UndefOr[InferenceSchedulerName]
    var ModelArn: js.UndefOr[ModelArn]
    var ModelName: js.UndefOr[ModelName]
    var ScheduledStartTime: js.UndefOr[Timestamp]
    var Status: js.UndefOr[InferenceExecutionStatus]
  }

  object InferenceExecutionSummary {
    @inline
    def apply(
        CustomerResultObject: js.UndefOr[S3Object] = js.undefined,
        DataEndTime: js.UndefOr[Timestamp] = js.undefined,
        DataInputConfiguration: js.UndefOr[InferenceInputConfiguration] = js.undefined,
        DataOutputConfiguration: js.UndefOr[InferenceOutputConfiguration] = js.undefined,
        DataStartTime: js.UndefOr[Timestamp] = js.undefined,
        FailedReason: js.UndefOr[BoundedLengthString] = js.undefined,
        InferenceSchedulerArn: js.UndefOr[InferenceSchedulerArn] = js.undefined,
        InferenceSchedulerName: js.UndefOr[InferenceSchedulerName] = js.undefined,
        ModelArn: js.UndefOr[ModelArn] = js.undefined,
        ModelName: js.UndefOr[ModelName] = js.undefined,
        ScheduledStartTime: js.UndefOr[Timestamp] = js.undefined,
        Status: js.UndefOr[InferenceExecutionStatus] = js.undefined
    ): InferenceExecutionSummary = {
      val __obj = js.Dynamic.literal()
      CustomerResultObject.foreach(__v => __obj.updateDynamic("CustomerResultObject")(__v.asInstanceOf[js.Any]))
      DataEndTime.foreach(__v => __obj.updateDynamic("DataEndTime")(__v.asInstanceOf[js.Any]))
      DataInputConfiguration.foreach(__v => __obj.updateDynamic("DataInputConfiguration")(__v.asInstanceOf[js.Any]))
      DataOutputConfiguration.foreach(__v => __obj.updateDynamic("DataOutputConfiguration")(__v.asInstanceOf[js.Any]))
      DataStartTime.foreach(__v => __obj.updateDynamic("DataStartTime")(__v.asInstanceOf[js.Any]))
      FailedReason.foreach(__v => __obj.updateDynamic("FailedReason")(__v.asInstanceOf[js.Any]))
      InferenceSchedulerArn.foreach(__v => __obj.updateDynamic("InferenceSchedulerArn")(__v.asInstanceOf[js.Any]))
      InferenceSchedulerName.foreach(__v => __obj.updateDynamic("InferenceSchedulerName")(__v.asInstanceOf[js.Any]))
      ModelArn.foreach(__v => __obj.updateDynamic("ModelArn")(__v.asInstanceOf[js.Any]))
      ModelName.foreach(__v => __obj.updateDynamic("ModelName")(__v.asInstanceOf[js.Any]))
      ScheduledStartTime.foreach(__v => __obj.updateDynamic("ScheduledStartTime")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InferenceExecutionSummary]
    }
  }

  /** Specifies configuration information for the input data for the inference, including S3 location of input data..
    */
  @js.native
  trait InferenceInputConfiguration extends js.Object {
    var InferenceInputNameConfiguration: js.UndefOr[InferenceInputNameConfiguration]
    var InputTimeZoneOffset: js.UndefOr[TimeZoneOffset]
    var S3InputConfiguration: js.UndefOr[InferenceS3InputConfiguration]
  }

  object InferenceInputConfiguration {
    @inline
    def apply(
        InferenceInputNameConfiguration: js.UndefOr[InferenceInputNameConfiguration] = js.undefined,
        InputTimeZoneOffset: js.UndefOr[TimeZoneOffset] = js.undefined,
        S3InputConfiguration: js.UndefOr[InferenceS3InputConfiguration] = js.undefined
    ): InferenceInputConfiguration = {
      val __obj = js.Dynamic.literal()
      InferenceInputNameConfiguration.foreach(__v => __obj.updateDynamic("InferenceInputNameConfiguration")(__v.asInstanceOf[js.Any]))
      InputTimeZoneOffset.foreach(__v => __obj.updateDynamic("InputTimeZoneOffset")(__v.asInstanceOf[js.Any]))
      S3InputConfiguration.foreach(__v => __obj.updateDynamic("S3InputConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InferenceInputConfiguration]
    }
  }

  /** Specifies configuration information for the input data for the inference, including timestamp format and delimiter.
    */
  @js.native
  trait InferenceInputNameConfiguration extends js.Object {
    var ComponentTimestampDelimiter: js.UndefOr[ComponentTimestampDelimiter]
    var TimestampFormat: js.UndefOr[FileNameTimestampFormat]
  }

  object InferenceInputNameConfiguration {
    @inline
    def apply(
        ComponentTimestampDelimiter: js.UndefOr[ComponentTimestampDelimiter] = js.undefined,
        TimestampFormat: js.UndefOr[FileNameTimestampFormat] = js.undefined
    ): InferenceInputNameConfiguration = {
      val __obj = js.Dynamic.literal()
      ComponentTimestampDelimiter.foreach(__v => __obj.updateDynamic("ComponentTimestampDelimiter")(__v.asInstanceOf[js.Any]))
      TimestampFormat.foreach(__v => __obj.updateDynamic("TimestampFormat")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InferenceInputNameConfiguration]
    }
  }

  /** Specifies configuration information for the output results from for the inference, including KMS key ID and output S3 location.
    */
  @js.native
  trait InferenceOutputConfiguration extends js.Object {
    var S3OutputConfiguration: InferenceS3OutputConfiguration
    var KmsKeyId: js.UndefOr[NameOrArn]
  }

  object InferenceOutputConfiguration {
    @inline
    def apply(
        S3OutputConfiguration: InferenceS3OutputConfiguration,
        KmsKeyId: js.UndefOr[NameOrArn] = js.undefined
    ): InferenceOutputConfiguration = {
      val __obj = js.Dynamic.literal(
        "S3OutputConfiguration" -> S3OutputConfiguration.asInstanceOf[js.Any]
      )

      KmsKeyId.foreach(__v => __obj.updateDynamic("KmsKeyId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InferenceOutputConfiguration]
    }
  }

  /** Specifies configuration information for the input data for the inference, including input data S3 location.
    */
  @js.native
  trait InferenceS3InputConfiguration extends js.Object {
    var Bucket: S3Bucket
    var Prefix: js.UndefOr[S3Prefix]
  }

  object InferenceS3InputConfiguration {
    @inline
    def apply(
        Bucket: S3Bucket,
        Prefix: js.UndefOr[S3Prefix] = js.undefined
    ): InferenceS3InputConfiguration = {
      val __obj = js.Dynamic.literal(
        "Bucket" -> Bucket.asInstanceOf[js.Any]
      )

      Prefix.foreach(__v => __obj.updateDynamic("Prefix")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InferenceS3InputConfiguration]
    }
  }

  /** Specifies configuration information for the output results from the inference, including output S3 location.
    */
  @js.native
  trait InferenceS3OutputConfiguration extends js.Object {
    var Bucket: S3Bucket
    var Prefix: js.UndefOr[S3Prefix]
  }

  object InferenceS3OutputConfiguration {
    @inline
    def apply(
        Bucket: S3Bucket,
        Prefix: js.UndefOr[S3Prefix] = js.undefined
    ): InferenceS3OutputConfiguration = {
      val __obj = js.Dynamic.literal(
        "Bucket" -> Bucket.asInstanceOf[js.Any]
      )

      Prefix.foreach(__v => __obj.updateDynamic("Prefix")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InferenceS3OutputConfiguration]
    }
  }

  /** Contains information about the specific inference scheduler, including data delay offset, model name and ARN, status, and so on.
    */
  @js.native
  trait InferenceSchedulerSummary extends js.Object {
    var DataDelayOffsetInMinutes: js.UndefOr[DataDelayOffsetInMinutes]
    var DataUploadFrequency: js.UndefOr[DataUploadFrequency]
    var InferenceSchedulerArn: js.UndefOr[InferenceSchedulerArn]
    var InferenceSchedulerName: js.UndefOr[InferenceSchedulerName]
    var ModelArn: js.UndefOr[ModelArn]
    var ModelName: js.UndefOr[ModelName]
    var Status: js.UndefOr[InferenceSchedulerStatus]
  }

  object InferenceSchedulerSummary {
    @inline
    def apply(
        DataDelayOffsetInMinutes: js.UndefOr[DataDelayOffsetInMinutes] = js.undefined,
        DataUploadFrequency: js.UndefOr[DataUploadFrequency] = js.undefined,
        InferenceSchedulerArn: js.UndefOr[InferenceSchedulerArn] = js.undefined,
        InferenceSchedulerName: js.UndefOr[InferenceSchedulerName] = js.undefined,
        ModelArn: js.UndefOr[ModelArn] = js.undefined,
        ModelName: js.UndefOr[ModelName] = js.undefined,
        Status: js.UndefOr[InferenceSchedulerStatus] = js.undefined
    ): InferenceSchedulerSummary = {
      val __obj = js.Dynamic.literal()
      DataDelayOffsetInMinutes.foreach(__v => __obj.updateDynamic("DataDelayOffsetInMinutes")(__v.asInstanceOf[js.Any]))
      DataUploadFrequency.foreach(__v => __obj.updateDynamic("DataUploadFrequency")(__v.asInstanceOf[js.Any]))
      InferenceSchedulerArn.foreach(__v => __obj.updateDynamic("InferenceSchedulerArn")(__v.asInstanceOf[js.Any]))
      InferenceSchedulerName.foreach(__v => __obj.updateDynamic("InferenceSchedulerName")(__v.asInstanceOf[js.Any]))
      ModelArn.foreach(__v => __obj.updateDynamic("ModelArn")(__v.asInstanceOf[js.Any]))
      ModelName.foreach(__v => __obj.updateDynamic("ModelName")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InferenceSchedulerSummary]
    }
  }

  /** Specifies configuration information for the input data for the data ingestion job, including input data S3 location.
    */
  @js.native
  trait IngestionInputConfiguration extends js.Object {
    var S3InputConfiguration: IngestionS3InputConfiguration
  }

  object IngestionInputConfiguration {
    @inline
    def apply(
        S3InputConfiguration: IngestionS3InputConfiguration
    ): IngestionInputConfiguration = {
      val __obj = js.Dynamic.literal(
        "S3InputConfiguration" -> S3InputConfiguration.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[IngestionInputConfiguration]
    }
  }

  /** Specifies S3 configuration information for the input data for the data ingestion job.
    */
  @js.native
  trait IngestionS3InputConfiguration extends js.Object {
    var Bucket: S3Bucket
    var Prefix: js.UndefOr[S3Prefix]
  }

  object IngestionS3InputConfiguration {
    @inline
    def apply(
        Bucket: S3Bucket,
        Prefix: js.UndefOr[S3Prefix] = js.undefined
    ): IngestionS3InputConfiguration = {
      val __obj = js.Dynamic.literal(
        "Bucket" -> Bucket.asInstanceOf[js.Any]
      )

      Prefix.foreach(__v => __obj.updateDynamic("Prefix")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[IngestionS3InputConfiguration]
    }
  }

  /** Contains the configuration information for the S3 location being used to hold label data.
    */
  @js.native
  trait LabelsInputConfiguration extends js.Object {
    var S3InputConfiguration: LabelsS3InputConfiguration
  }

  object LabelsInputConfiguration {
    @inline
    def apply(
        S3InputConfiguration: LabelsS3InputConfiguration
    ): LabelsInputConfiguration = {
      val __obj = js.Dynamic.literal(
        "S3InputConfiguration" -> S3InputConfiguration.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[LabelsInputConfiguration]
    }
  }

  /** The location information (prefix and bucket name) for the s3 location being used for label data.
    */
  @js.native
  trait LabelsS3InputConfiguration extends js.Object {
    var Bucket: S3Bucket
    var Prefix: js.UndefOr[S3Prefix]
  }

  object LabelsS3InputConfiguration {
    @inline
    def apply(
        Bucket: S3Bucket,
        Prefix: js.UndefOr[S3Prefix] = js.undefined
    ): LabelsS3InputConfiguration = {
      val __obj = js.Dynamic.literal(
        "Bucket" -> Bucket.asInstanceOf[js.Any]
      )

      Prefix.foreach(__v => __obj.updateDynamic("Prefix")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LabelsS3InputConfiguration]
    }
  }

  @js.native
  trait ListDataIngestionJobsRequest extends js.Object {
    var DatasetName: js.UndefOr[DatasetName]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var Status: js.UndefOr[IngestionJobStatus]
  }

  object ListDataIngestionJobsRequest {
    @inline
    def apply(
        DatasetName: js.UndefOr[DatasetName] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        Status: js.UndefOr[IngestionJobStatus] = js.undefined
    ): ListDataIngestionJobsRequest = {
      val __obj = js.Dynamic.literal()
      DatasetName.foreach(__v => __obj.updateDynamic("DatasetName")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDataIngestionJobsRequest]
    }
  }

  @js.native
  trait ListDataIngestionJobsResponse extends js.Object {
    var DataIngestionJobSummaries: js.UndefOr[DataIngestionJobSummaries]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListDataIngestionJobsResponse {
    @inline
    def apply(
        DataIngestionJobSummaries: js.UndefOr[DataIngestionJobSummaries] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListDataIngestionJobsResponse = {
      val __obj = js.Dynamic.literal()
      DataIngestionJobSummaries.foreach(__v => __obj.updateDynamic("DataIngestionJobSummaries")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDataIngestionJobsResponse]
    }
  }

  @js.native
  trait ListDatasetsRequest extends js.Object {
    var DatasetNameBeginsWith: js.UndefOr[DatasetName]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListDatasetsRequest {
    @inline
    def apply(
        DatasetNameBeginsWith: js.UndefOr[DatasetName] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListDatasetsRequest = {
      val __obj = js.Dynamic.literal()
      DatasetNameBeginsWith.foreach(__v => __obj.updateDynamic("DatasetNameBeginsWith")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDatasetsRequest]
    }
  }

  @js.native
  trait ListDatasetsResponse extends js.Object {
    var DatasetSummaries: js.UndefOr[DatasetSummaries]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListDatasetsResponse {
    @inline
    def apply(
        DatasetSummaries: js.UndefOr[DatasetSummaries] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListDatasetsResponse = {
      val __obj = js.Dynamic.literal()
      DatasetSummaries.foreach(__v => __obj.updateDynamic("DatasetSummaries")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDatasetsResponse]
    }
  }

  @js.native
  trait ListInferenceExecutionsRequest extends js.Object {
    var InferenceSchedulerName: InferenceSchedulerIdentifier
    var DataEndTimeBefore: js.UndefOr[Timestamp]
    var DataStartTimeAfter: js.UndefOr[Timestamp]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var Status: js.UndefOr[InferenceExecutionStatus]
  }

  object ListInferenceExecutionsRequest {
    @inline
    def apply(
        InferenceSchedulerName: InferenceSchedulerIdentifier,
        DataEndTimeBefore: js.UndefOr[Timestamp] = js.undefined,
        DataStartTimeAfter: js.UndefOr[Timestamp] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        Status: js.UndefOr[InferenceExecutionStatus] = js.undefined
    ): ListInferenceExecutionsRequest = {
      val __obj = js.Dynamic.literal(
        "InferenceSchedulerName" -> InferenceSchedulerName.asInstanceOf[js.Any]
      )

      DataEndTimeBefore.foreach(__v => __obj.updateDynamic("DataEndTimeBefore")(__v.asInstanceOf[js.Any]))
      DataStartTimeAfter.foreach(__v => __obj.updateDynamic("DataStartTimeAfter")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListInferenceExecutionsRequest]
    }
  }

  @js.native
  trait ListInferenceExecutionsResponse extends js.Object {
    var InferenceExecutionSummaries: js.UndefOr[InferenceExecutionSummaries]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListInferenceExecutionsResponse {
    @inline
    def apply(
        InferenceExecutionSummaries: js.UndefOr[InferenceExecutionSummaries] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListInferenceExecutionsResponse = {
      val __obj = js.Dynamic.literal()
      InferenceExecutionSummaries.foreach(__v => __obj.updateDynamic("InferenceExecutionSummaries")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListInferenceExecutionsResponse]
    }
  }

  @js.native
  trait ListInferenceSchedulersRequest extends js.Object {
    var InferenceSchedulerNameBeginsWith: js.UndefOr[InferenceSchedulerIdentifier]
    var MaxResults: js.UndefOr[MaxResults]
    var ModelName: js.UndefOr[ModelName]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListInferenceSchedulersRequest {
    @inline
    def apply(
        InferenceSchedulerNameBeginsWith: js.UndefOr[InferenceSchedulerIdentifier] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        ModelName: js.UndefOr[ModelName] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListInferenceSchedulersRequest = {
      val __obj = js.Dynamic.literal()
      InferenceSchedulerNameBeginsWith.foreach(__v => __obj.updateDynamic("InferenceSchedulerNameBeginsWith")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      ModelName.foreach(__v => __obj.updateDynamic("ModelName")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListInferenceSchedulersRequest]
    }
  }

  @js.native
  trait ListInferenceSchedulersResponse extends js.Object {
    var InferenceSchedulerSummaries: js.UndefOr[InferenceSchedulerSummaries]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListInferenceSchedulersResponse {
    @inline
    def apply(
        InferenceSchedulerSummaries: js.UndefOr[InferenceSchedulerSummaries] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListInferenceSchedulersResponse = {
      val __obj = js.Dynamic.literal()
      InferenceSchedulerSummaries.foreach(__v => __obj.updateDynamic("InferenceSchedulerSummaries")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListInferenceSchedulersResponse]
    }
  }

  @js.native
  trait ListModelsRequest extends js.Object {
    var DatasetNameBeginsWith: js.UndefOr[DatasetName]
    var MaxResults: js.UndefOr[MaxResults]
    var ModelNameBeginsWith: js.UndefOr[ModelName]
    var NextToken: js.UndefOr[NextToken]
    var Status: js.UndefOr[ModelStatus]
  }

  object ListModelsRequest {
    @inline
    def apply(
        DatasetNameBeginsWith: js.UndefOr[DatasetName] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        ModelNameBeginsWith: js.UndefOr[ModelName] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        Status: js.UndefOr[ModelStatus] = js.undefined
    ): ListModelsRequest = {
      val __obj = js.Dynamic.literal()
      DatasetNameBeginsWith.foreach(__v => __obj.updateDynamic("DatasetNameBeginsWith")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      ModelNameBeginsWith.foreach(__v => __obj.updateDynamic("ModelNameBeginsWith")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListModelsRequest]
    }
  }

  @js.native
  trait ListModelsResponse extends js.Object {
    var ModelSummaries: js.UndefOr[ModelSummaries]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListModelsResponse {
    @inline
    def apply(
        ModelSummaries: js.UndefOr[ModelSummaries] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListModelsResponse = {
      val __obj = js.Dynamic.literal()
      ModelSummaries.foreach(__v => __obj.updateDynamic("ModelSummaries")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListModelsResponse]
    }
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var ResourceArn: AmazonResourceArn
  }

  object ListTagsForResourceRequest {
    @inline
    def apply(
        ResourceArn: AmazonResourceArn
    ): ListTagsForResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any]
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

  /** Provides information about the specified ML model, including dataset and model names and ARNs, as well as status.
    */
  @js.native
  trait ModelSummary extends js.Object {
    var CreatedAt: js.UndefOr[Timestamp]
    var DatasetArn: js.UndefOr[DatasetArn]
    var DatasetName: js.UndefOr[DatasetName]
    var ModelArn: js.UndefOr[ModelArn]
    var ModelName: js.UndefOr[ModelName]
    var Status: js.UndefOr[ModelStatus]
  }

  object ModelSummary {
    @inline
    def apply(
        CreatedAt: js.UndefOr[Timestamp] = js.undefined,
        DatasetArn: js.UndefOr[DatasetArn] = js.undefined,
        DatasetName: js.UndefOr[DatasetName] = js.undefined,
        ModelArn: js.UndefOr[ModelArn] = js.undefined,
        ModelName: js.UndefOr[ModelName] = js.undefined,
        Status: js.UndefOr[ModelStatus] = js.undefined
    ): ModelSummary = {
      val __obj = js.Dynamic.literal()
      CreatedAt.foreach(__v => __obj.updateDynamic("CreatedAt")(__v.asInstanceOf[js.Any]))
      DatasetArn.foreach(__v => __obj.updateDynamic("DatasetArn")(__v.asInstanceOf[js.Any]))
      DatasetName.foreach(__v => __obj.updateDynamic("DatasetName")(__v.asInstanceOf[js.Any]))
      ModelArn.foreach(__v => __obj.updateDynamic("ModelArn")(__v.asInstanceOf[js.Any]))
      ModelName.foreach(__v => __obj.updateDynamic("ModelName")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ModelSummary]
    }
  }

  /** Contains information about an S3 bucket.
    */
  @js.native
  trait S3Object extends js.Object {
    var Bucket: S3Bucket
    var Key: S3Key
  }

  object S3Object {
    @inline
    def apply(
        Bucket: S3Bucket,
        Key: S3Key
    ): S3Object = {
      val __obj = js.Dynamic.literal(
        "Bucket" -> Bucket.asInstanceOf[js.Any],
        "Key" -> Key.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[S3Object]
    }
  }

  @js.native
  trait StartDataIngestionJobRequest extends js.Object {
    var ClientToken: IdempotenceToken
    var DatasetName: DatasetIdentifier
    var IngestionInputConfiguration: IngestionInputConfiguration
    var RoleArn: IamRoleArn
  }

  object StartDataIngestionJobRequest {
    @inline
    def apply(
        ClientToken: IdempotenceToken,
        DatasetName: DatasetIdentifier,
        IngestionInputConfiguration: IngestionInputConfiguration,
        RoleArn: IamRoleArn
    ): StartDataIngestionJobRequest = {
      val __obj = js.Dynamic.literal(
        "ClientToken" -> ClientToken.asInstanceOf[js.Any],
        "DatasetName" -> DatasetName.asInstanceOf[js.Any],
        "IngestionInputConfiguration" -> IngestionInputConfiguration.asInstanceOf[js.Any],
        "RoleArn" -> RoleArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[StartDataIngestionJobRequest]
    }
  }

  @js.native
  trait StartDataIngestionJobResponse extends js.Object {
    var JobId: js.UndefOr[IngestionJobId]
    var Status: js.UndefOr[IngestionJobStatus]
  }

  object StartDataIngestionJobResponse {
    @inline
    def apply(
        JobId: js.UndefOr[IngestionJobId] = js.undefined,
        Status: js.UndefOr[IngestionJobStatus] = js.undefined
    ): StartDataIngestionJobResponse = {
      val __obj = js.Dynamic.literal()
      JobId.foreach(__v => __obj.updateDynamic("JobId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartDataIngestionJobResponse]
    }
  }

  @js.native
  trait StartInferenceSchedulerRequest extends js.Object {
    var InferenceSchedulerName: InferenceSchedulerIdentifier
  }

  object StartInferenceSchedulerRequest {
    @inline
    def apply(
        InferenceSchedulerName: InferenceSchedulerIdentifier
    ): StartInferenceSchedulerRequest = {
      val __obj = js.Dynamic.literal(
        "InferenceSchedulerName" -> InferenceSchedulerName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[StartInferenceSchedulerRequest]
    }
  }

  @js.native
  trait StartInferenceSchedulerResponse extends js.Object {
    var InferenceSchedulerArn: js.UndefOr[InferenceSchedulerArn]
    var InferenceSchedulerName: js.UndefOr[InferenceSchedulerName]
    var ModelArn: js.UndefOr[ModelArn]
    var ModelName: js.UndefOr[ModelName]
    var Status: js.UndefOr[InferenceSchedulerStatus]
  }

  object StartInferenceSchedulerResponse {
    @inline
    def apply(
        InferenceSchedulerArn: js.UndefOr[InferenceSchedulerArn] = js.undefined,
        InferenceSchedulerName: js.UndefOr[InferenceSchedulerName] = js.undefined,
        ModelArn: js.UndefOr[ModelArn] = js.undefined,
        ModelName: js.UndefOr[ModelName] = js.undefined,
        Status: js.UndefOr[InferenceSchedulerStatus] = js.undefined
    ): StartInferenceSchedulerResponse = {
      val __obj = js.Dynamic.literal()
      InferenceSchedulerArn.foreach(__v => __obj.updateDynamic("InferenceSchedulerArn")(__v.asInstanceOf[js.Any]))
      InferenceSchedulerName.foreach(__v => __obj.updateDynamic("InferenceSchedulerName")(__v.asInstanceOf[js.Any]))
      ModelArn.foreach(__v => __obj.updateDynamic("ModelArn")(__v.asInstanceOf[js.Any]))
      ModelName.foreach(__v => __obj.updateDynamic("ModelName")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartInferenceSchedulerResponse]
    }
  }

  @js.native
  trait StopInferenceSchedulerRequest extends js.Object {
    var InferenceSchedulerName: InferenceSchedulerIdentifier
  }

  object StopInferenceSchedulerRequest {
    @inline
    def apply(
        InferenceSchedulerName: InferenceSchedulerIdentifier
    ): StopInferenceSchedulerRequest = {
      val __obj = js.Dynamic.literal(
        "InferenceSchedulerName" -> InferenceSchedulerName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[StopInferenceSchedulerRequest]
    }
  }

  @js.native
  trait StopInferenceSchedulerResponse extends js.Object {
    var InferenceSchedulerArn: js.UndefOr[InferenceSchedulerArn]
    var InferenceSchedulerName: js.UndefOr[InferenceSchedulerName]
    var ModelArn: js.UndefOr[ModelArn]
    var ModelName: js.UndefOr[ModelName]
    var Status: js.UndefOr[InferenceSchedulerStatus]
  }

  object StopInferenceSchedulerResponse {
    @inline
    def apply(
        InferenceSchedulerArn: js.UndefOr[InferenceSchedulerArn] = js.undefined,
        InferenceSchedulerName: js.UndefOr[InferenceSchedulerName] = js.undefined,
        ModelArn: js.UndefOr[ModelArn] = js.undefined,
        ModelName: js.UndefOr[ModelName] = js.undefined,
        Status: js.UndefOr[InferenceSchedulerStatus] = js.undefined
    ): StopInferenceSchedulerResponse = {
      val __obj = js.Dynamic.literal()
      InferenceSchedulerArn.foreach(__v => __obj.updateDynamic("InferenceSchedulerArn")(__v.asInstanceOf[js.Any]))
      InferenceSchedulerName.foreach(__v => __obj.updateDynamic("InferenceSchedulerName")(__v.asInstanceOf[js.Any]))
      ModelArn.foreach(__v => __obj.updateDynamic("ModelArn")(__v.asInstanceOf[js.Any]))
      ModelName.foreach(__v => __obj.updateDynamic("ModelName")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StopInferenceSchedulerResponse]
    }
  }

  /** A tag is a key-value pair that can be added to a resource as metadata.
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
    var ResourceArn: AmazonResourceArn
    var Tags: TagList
  }

  object TagResourceRequest {
    @inline
    def apply(
        ResourceArn: AmazonResourceArn,
        Tags: TagList
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

  @js.native
  trait UntagResourceRequest extends js.Object {
    var ResourceArn: AmazonResourceArn
    var TagKeys: TagKeyList
  }

  object UntagResourceRequest {
    @inline
    def apply(
        ResourceArn: AmazonResourceArn,
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
  trait UpdateInferenceSchedulerRequest extends js.Object {
    var InferenceSchedulerName: InferenceSchedulerIdentifier
    var DataDelayOffsetInMinutes: js.UndefOr[DataDelayOffsetInMinutes]
    var DataInputConfiguration: js.UndefOr[InferenceInputConfiguration]
    var DataOutputConfiguration: js.UndefOr[InferenceOutputConfiguration]
    var DataUploadFrequency: js.UndefOr[DataUploadFrequency]
    var RoleArn: js.UndefOr[IamRoleArn]
  }

  object UpdateInferenceSchedulerRequest {
    @inline
    def apply(
        InferenceSchedulerName: InferenceSchedulerIdentifier,
        DataDelayOffsetInMinutes: js.UndefOr[DataDelayOffsetInMinutes] = js.undefined,
        DataInputConfiguration: js.UndefOr[InferenceInputConfiguration] = js.undefined,
        DataOutputConfiguration: js.UndefOr[InferenceOutputConfiguration] = js.undefined,
        DataUploadFrequency: js.UndefOr[DataUploadFrequency] = js.undefined,
        RoleArn: js.UndefOr[IamRoleArn] = js.undefined
    ): UpdateInferenceSchedulerRequest = {
      val __obj = js.Dynamic.literal(
        "InferenceSchedulerName" -> InferenceSchedulerName.asInstanceOf[js.Any]
      )

      DataDelayOffsetInMinutes.foreach(__v => __obj.updateDynamic("DataDelayOffsetInMinutes")(__v.asInstanceOf[js.Any]))
      DataInputConfiguration.foreach(__v => __obj.updateDynamic("DataInputConfiguration")(__v.asInstanceOf[js.Any]))
      DataOutputConfiguration.foreach(__v => __obj.updateDynamic("DataOutputConfiguration")(__v.asInstanceOf[js.Any]))
      DataUploadFrequency.foreach(__v => __obj.updateDynamic("DataUploadFrequency")(__v.asInstanceOf[js.Any]))
      RoleArn.foreach(__v => __obj.updateDynamic("RoleArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateInferenceSchedulerRequest]
    }
  }
}
