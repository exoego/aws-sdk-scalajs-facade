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
  type Comments = String
  type ComponentName = String
  type ComponentTimestampDelimiter = String
  type DataDelayOffsetInMinutes = Double
  type DataIngestionJobSummaries = js.Array[DataIngestionJobSummary]
  type DataSizeInBytes = Double
  type DatasetArn = String
  type DatasetIdentifier = String
  type DatasetName = String
  type DatasetSummaries = js.Array[DatasetSummary]
  type Equipment = String
  type EventDurationInSeconds = Double
  type FaultCode = String
  type FaultCodes = js.Array[FaultCode]
  type FileNameTimestampFormat = String
  type IamRoleArn = String
  type IdempotenceToken = String
  type InferenceEventSummaries = js.Array[InferenceEventSummary]
  type InferenceExecutionSummaries = js.Array[InferenceExecutionSummary]
  type InferenceSchedulerArn = String
  type InferenceSchedulerIdentifier = String
  type InferenceSchedulerName = String
  type InferenceSchedulerSummaries = js.Array[InferenceSchedulerSummary]
  type IngestionJobId = String
  type InlineDataSchema = String
  type KeyPattern = String
  type KmsKeyArn = String
  type LabelGroupArn = String
  type LabelGroupName = String
  type LabelGroupSummaries = js.Array[LabelGroupSummary]
  type LabelId = String
  type LabelSummaries = js.Array[LabelSummary]
  type ListOfDiscardedFiles = js.Array[S3Object]
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
  type SensorName = String
  type SensorStatisticsSummaries = js.Array[SensorStatisticsSummary]
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagList = js.Array[Tag]
  type TagValue = String
  type TimeZoneOffset = String
  type Timestamp = js.Date

  final class LookoutEquipmentOps(private val service: LookoutEquipment) extends AnyVal {

    @inline def createDatasetFuture(params: CreateDatasetRequest): Future[CreateDatasetResponse] = service.createDataset(params).promise().toFuture
    @inline def createInferenceSchedulerFuture(params: CreateInferenceSchedulerRequest): Future[CreateInferenceSchedulerResponse] = service.createInferenceScheduler(params).promise().toFuture
    @inline def createLabelFuture(params: CreateLabelRequest): Future[CreateLabelResponse] = service.createLabel(params).promise().toFuture
    @inline def createLabelGroupFuture(params: CreateLabelGroupRequest): Future[CreateLabelGroupResponse] = service.createLabelGroup(params).promise().toFuture
    @inline def createModelFuture(params: CreateModelRequest): Future[CreateModelResponse] = service.createModel(params).promise().toFuture
    @inline def deleteDatasetFuture(params: DeleteDatasetRequest): Future[js.Object] = service.deleteDataset(params).promise().toFuture
    @inline def deleteInferenceSchedulerFuture(params: DeleteInferenceSchedulerRequest): Future[js.Object] = service.deleteInferenceScheduler(params).promise().toFuture
    @inline def deleteLabelFuture(params: DeleteLabelRequest): Future[js.Object] = service.deleteLabel(params).promise().toFuture
    @inline def deleteLabelGroupFuture(params: DeleteLabelGroupRequest): Future[js.Object] = service.deleteLabelGroup(params).promise().toFuture
    @inline def deleteModelFuture(params: DeleteModelRequest): Future[js.Object] = service.deleteModel(params).promise().toFuture
    @inline def describeDataIngestionJobFuture(params: DescribeDataIngestionJobRequest): Future[DescribeDataIngestionJobResponse] = service.describeDataIngestionJob(params).promise().toFuture
    @inline def describeDatasetFuture(params: DescribeDatasetRequest): Future[DescribeDatasetResponse] = service.describeDataset(params).promise().toFuture
    @inline def describeInferenceSchedulerFuture(params: DescribeInferenceSchedulerRequest): Future[DescribeInferenceSchedulerResponse] = service.describeInferenceScheduler(params).promise().toFuture
    @inline def describeLabelFuture(params: DescribeLabelRequest): Future[DescribeLabelResponse] = service.describeLabel(params).promise().toFuture
    @inline def describeLabelGroupFuture(params: DescribeLabelGroupRequest): Future[DescribeLabelGroupResponse] = service.describeLabelGroup(params).promise().toFuture
    @inline def describeModelFuture(params: DescribeModelRequest): Future[DescribeModelResponse] = service.describeModel(params).promise().toFuture
    @inline def listDataIngestionJobsFuture(params: ListDataIngestionJobsRequest): Future[ListDataIngestionJobsResponse] = service.listDataIngestionJobs(params).promise().toFuture
    @inline def listDatasetsFuture(params: ListDatasetsRequest): Future[ListDatasetsResponse] = service.listDatasets(params).promise().toFuture
    @inline def listInferenceEventsFuture(params: ListInferenceEventsRequest): Future[ListInferenceEventsResponse] = service.listInferenceEvents(params).promise().toFuture
    @inline def listInferenceExecutionsFuture(params: ListInferenceExecutionsRequest): Future[ListInferenceExecutionsResponse] = service.listInferenceExecutions(params).promise().toFuture
    @inline def listInferenceSchedulersFuture(params: ListInferenceSchedulersRequest): Future[ListInferenceSchedulersResponse] = service.listInferenceSchedulers(params).promise().toFuture
    @inline def listLabelGroupsFuture(params: ListLabelGroupsRequest): Future[ListLabelGroupsResponse] = service.listLabelGroups(params).promise().toFuture
    @inline def listLabelsFuture(params: ListLabelsRequest): Future[ListLabelsResponse] = service.listLabels(params).promise().toFuture
    @inline def listModelsFuture(params: ListModelsRequest): Future[ListModelsResponse] = service.listModels(params).promise().toFuture
    @inline def listSensorStatisticsFuture(params: ListSensorStatisticsRequest): Future[ListSensorStatisticsResponse] = service.listSensorStatistics(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] = service.listTagsForResource(params).promise().toFuture
    @inline def startDataIngestionJobFuture(params: StartDataIngestionJobRequest): Future[StartDataIngestionJobResponse] = service.startDataIngestionJob(params).promise().toFuture
    @inline def startInferenceSchedulerFuture(params: StartInferenceSchedulerRequest): Future[StartInferenceSchedulerResponse] = service.startInferenceScheduler(params).promise().toFuture
    @inline def stopInferenceSchedulerFuture(params: StopInferenceSchedulerRequest): Future[StopInferenceSchedulerResponse] = service.stopInferenceScheduler(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] = service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] = service.untagResource(params).promise().toFuture
    @inline def updateInferenceSchedulerFuture(params: UpdateInferenceSchedulerRequest): Future[js.Object] = service.updateInferenceScheduler(params).promise().toFuture
    @inline def updateLabelGroupFuture(params: UpdateLabelGroupRequest): Future[js.Object] = service.updateLabelGroup(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/lookoutequipment", JSImport.Namespace, "AWS.LookoutEquipment")
  class LookoutEquipment() extends js.Object {
    def this(config: AWSConfig) = this()

    def createDataset(params: CreateDatasetRequest): Request[CreateDatasetResponse] = js.native
    def createInferenceScheduler(params: CreateInferenceSchedulerRequest): Request[CreateInferenceSchedulerResponse] = js.native
    def createLabel(params: CreateLabelRequest): Request[CreateLabelResponse] = js.native
    def createLabelGroup(params: CreateLabelGroupRequest): Request[CreateLabelGroupResponse] = js.native
    def createModel(params: CreateModelRequest): Request[CreateModelResponse] = js.native
    def deleteDataset(params: DeleteDatasetRequest): Request[js.Object] = js.native
    def deleteInferenceScheduler(params: DeleteInferenceSchedulerRequest): Request[js.Object] = js.native
    def deleteLabel(params: DeleteLabelRequest): Request[js.Object] = js.native
    def deleteLabelGroup(params: DeleteLabelGroupRequest): Request[js.Object] = js.native
    def deleteModel(params: DeleteModelRequest): Request[js.Object] = js.native
    def describeDataIngestionJob(params: DescribeDataIngestionJobRequest): Request[DescribeDataIngestionJobResponse] = js.native
    def describeDataset(params: DescribeDatasetRequest): Request[DescribeDatasetResponse] = js.native
    def describeInferenceScheduler(params: DescribeInferenceSchedulerRequest): Request[DescribeInferenceSchedulerResponse] = js.native
    def describeLabel(params: DescribeLabelRequest): Request[DescribeLabelResponse] = js.native
    def describeLabelGroup(params: DescribeLabelGroupRequest): Request[DescribeLabelGroupResponse] = js.native
    def describeModel(params: DescribeModelRequest): Request[DescribeModelResponse] = js.native
    def listDataIngestionJobs(params: ListDataIngestionJobsRequest): Request[ListDataIngestionJobsResponse] = js.native
    def listDatasets(params: ListDatasetsRequest): Request[ListDatasetsResponse] = js.native
    def listInferenceEvents(params: ListInferenceEventsRequest): Request[ListInferenceEventsResponse] = js.native
    def listInferenceExecutions(params: ListInferenceExecutionsRequest): Request[ListInferenceExecutionsResponse] = js.native
    def listInferenceSchedulers(params: ListInferenceSchedulersRequest): Request[ListInferenceSchedulersResponse] = js.native
    def listLabelGroups(params: ListLabelGroupsRequest): Request[ListLabelGroupsResponse] = js.native
    def listLabels(params: ListLabelsRequest): Request[ListLabelsResponse] = js.native
    def listModels(params: ListModelsRequest): Request[ListModelsResponse] = js.native
    def listSensorStatistics(params: ListSensorStatisticsRequest): Request[ListSensorStatisticsResponse] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def startDataIngestionJob(params: StartDataIngestionJobRequest): Request[StartDataIngestionJobResponse] = js.native
    def startInferenceScheduler(params: StartInferenceSchedulerRequest): Request[StartInferenceSchedulerResponse] = js.native
    def stopInferenceScheduler(params: StopInferenceSchedulerRequest): Request[StopInferenceSchedulerResponse] = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse] = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse] = js.native
    def updateInferenceScheduler(params: UpdateInferenceSchedulerRequest): Request[js.Object] = js.native
    def updateLabelGroup(params: UpdateLabelGroupRequest): Request[js.Object] = js.native
  }
  object LookoutEquipment {
    @inline implicit def toOps(service: LookoutEquipment): LookoutEquipmentOps = {
      new LookoutEquipmentOps(service)
    }
  }

  /** Entity that comprises information on categorical values in data.
    */
  @js.native
  trait CategoricalValues extends js.Object {
    var Status: StatisticalIssueStatus
    var NumberOfCategory: js.UndefOr[Int]
  }

  object CategoricalValues {
    @inline
    def apply(
        Status: StatisticalIssueStatus,
        NumberOfCategory: js.UndefOr[Int] = js.undefined
    ): CategoricalValues = {
      val __obj = js.Dynamic.literal(
        "Status" -> Status.asInstanceOf[js.Any]
      )

      NumberOfCategory.foreach(__v => __obj.updateDynamic("NumberOfCategory")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CategoricalValues]
    }
  }

  /** Entity that comprises information of count and percentage.
    */
  @js.native
  trait CountPercent extends js.Object {
    var Count: Int
    var Percentage: Float
  }

  object CountPercent {
    @inline
    def apply(
        Count: Int,
        Percentage: Float
    ): CountPercent = {
      val __obj = js.Dynamic.literal(
        "Count" -> Count.asInstanceOf[js.Any],
        "Percentage" -> Percentage.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CountPercent]
    }
  }

  @js.native
  trait CreateDatasetRequest extends js.Object {
    var ClientToken: IdempotenceToken
    var DatasetName: DatasetName
    var DatasetSchema: js.UndefOr[DatasetSchema]
    var ServerSideKmsKeyId: js.UndefOr[NameOrArn]
    var Tags: js.UndefOr[TagList]
  }

  object CreateDatasetRequest {
    @inline
    def apply(
        ClientToken: IdempotenceToken,
        DatasetName: DatasetName,
        DatasetSchema: js.UndefOr[DatasetSchema] = js.undefined,
        ServerSideKmsKeyId: js.UndefOr[NameOrArn] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateDatasetRequest = {
      val __obj = js.Dynamic.literal(
        "ClientToken" -> ClientToken.asInstanceOf[js.Any],
        "DatasetName" -> DatasetName.asInstanceOf[js.Any]
      )

      DatasetSchema.foreach(__v => __obj.updateDynamic("DatasetSchema")(__v.asInstanceOf[js.Any]))
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
  trait CreateLabelGroupRequest extends js.Object {
    var ClientToken: IdempotenceToken
    var LabelGroupName: LabelGroupName
    var FaultCodes: js.UndefOr[FaultCodes]
    var Tags: js.UndefOr[TagList]
  }

  object CreateLabelGroupRequest {
    @inline
    def apply(
        ClientToken: IdempotenceToken,
        LabelGroupName: LabelGroupName,
        FaultCodes: js.UndefOr[FaultCodes] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateLabelGroupRequest = {
      val __obj = js.Dynamic.literal(
        "ClientToken" -> ClientToken.asInstanceOf[js.Any],
        "LabelGroupName" -> LabelGroupName.asInstanceOf[js.Any]
      )

      FaultCodes.foreach(__v => __obj.updateDynamic("FaultCodes")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateLabelGroupRequest]
    }
  }

  @js.native
  trait CreateLabelGroupResponse extends js.Object {
    var LabelGroupArn: js.UndefOr[LabelGroupArn]
    var LabelGroupName: js.UndefOr[LabelGroupName]
  }

  object CreateLabelGroupResponse {
    @inline
    def apply(
        LabelGroupArn: js.UndefOr[LabelGroupArn] = js.undefined,
        LabelGroupName: js.UndefOr[LabelGroupName] = js.undefined
    ): CreateLabelGroupResponse = {
      val __obj = js.Dynamic.literal()
      LabelGroupArn.foreach(__v => __obj.updateDynamic("LabelGroupArn")(__v.asInstanceOf[js.Any]))
      LabelGroupName.foreach(__v => __obj.updateDynamic("LabelGroupName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateLabelGroupResponse]
    }
  }

  @js.native
  trait CreateLabelRequest extends js.Object {
    var ClientToken: IdempotenceToken
    var EndTime: Timestamp
    var LabelGroupName: LabelGroupName
    var Rating: LabelRating
    var StartTime: Timestamp
    var Equipment: js.UndefOr[Equipment]
    var FaultCode: js.UndefOr[FaultCode]
    var Notes: js.UndefOr[Comments]
  }

  object CreateLabelRequest {
    @inline
    def apply(
        ClientToken: IdempotenceToken,
        EndTime: Timestamp,
        LabelGroupName: LabelGroupName,
        Rating: LabelRating,
        StartTime: Timestamp,
        Equipment: js.UndefOr[Equipment] = js.undefined,
        FaultCode: js.UndefOr[FaultCode] = js.undefined,
        Notes: js.UndefOr[Comments] = js.undefined
    ): CreateLabelRequest = {
      val __obj = js.Dynamic.literal(
        "ClientToken" -> ClientToken.asInstanceOf[js.Any],
        "EndTime" -> EndTime.asInstanceOf[js.Any],
        "LabelGroupName" -> LabelGroupName.asInstanceOf[js.Any],
        "Rating" -> Rating.asInstanceOf[js.Any],
        "StartTime" -> StartTime.asInstanceOf[js.Any]
      )

      Equipment.foreach(__v => __obj.updateDynamic("Equipment")(__v.asInstanceOf[js.Any]))
      FaultCode.foreach(__v => __obj.updateDynamic("FaultCode")(__v.asInstanceOf[js.Any]))
      Notes.foreach(__v => __obj.updateDynamic("Notes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateLabelRequest]
    }
  }

  @js.native
  trait CreateLabelResponse extends js.Object {
    var LabelId: js.UndefOr[LabelId]
  }

  object CreateLabelResponse {
    @inline
    def apply(
        LabelId: js.UndefOr[LabelId] = js.undefined
    ): CreateLabelResponse = {
      val __obj = js.Dynamic.literal()
      LabelId.foreach(__v => __obj.updateDynamic("LabelId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateLabelResponse]
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

  /** DataQualitySummary gives aggregated statistics over all the sensors about a completed ingestion job. It primarily gives more information about statistics over different incorrect data like MissingCompleteSensorData, MissingSensorData, UnsupportedDateFormats, InsufficientSensorData, DuplicateTimeStamps.
    */
  @js.native
  trait DataQualitySummary extends js.Object {
    var DuplicateTimestamps: DuplicateTimestamps
    var InsufficientSensorData: InsufficientSensorData
    var InvalidSensorData: InvalidSensorData
    var MissingSensorData: MissingSensorData
    var UnsupportedTimestamps: UnsupportedTimestamps
  }

  object DataQualitySummary {
    @inline
    def apply(
        DuplicateTimestamps: DuplicateTimestamps,
        InsufficientSensorData: InsufficientSensorData,
        InvalidSensorData: InvalidSensorData,
        MissingSensorData: MissingSensorData,
        UnsupportedTimestamps: UnsupportedTimestamps
    ): DataQualitySummary = {
      val __obj = js.Dynamic.literal(
        "DuplicateTimestamps" -> DuplicateTimestamps.asInstanceOf[js.Any],
        "InsufficientSensorData" -> InsufficientSensorData.asInstanceOf[js.Any],
        "InvalidSensorData" -> InvalidSensorData.asInstanceOf[js.Any],
        "MissingSensorData" -> MissingSensorData.asInstanceOf[js.Any],
        "UnsupportedTimestamps" -> UnsupportedTimestamps.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DataQualitySummary]
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
  trait DeleteLabelGroupRequest extends js.Object {
    var LabelGroupName: LabelGroupName
  }

  object DeleteLabelGroupRequest {
    @inline
    def apply(
        LabelGroupName: LabelGroupName
    ): DeleteLabelGroupRequest = {
      val __obj = js.Dynamic.literal(
        "LabelGroupName" -> LabelGroupName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteLabelGroupRequest]
    }
  }

  @js.native
  trait DeleteLabelRequest extends js.Object {
    var LabelGroupName: LabelGroupName
    var LabelId: LabelId
  }

  object DeleteLabelRequest {
    @inline
    def apply(
        LabelGroupName: LabelGroupName,
        LabelId: LabelId
    ): DeleteLabelRequest = {
      val __obj = js.Dynamic.literal(
        "LabelGroupName" -> LabelGroupName.asInstanceOf[js.Any],
        "LabelId" -> LabelId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteLabelRequest]
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
    var DataEndTime: js.UndefOr[Timestamp]
    var DataQualitySummary: js.UndefOr[DataQualitySummary]
    var DataStartTime: js.UndefOr[Timestamp]
    var DatasetArn: js.UndefOr[DatasetArn]
    var FailedReason: js.UndefOr[BoundedLengthString]
    var IngestedDataSize: js.UndefOr[DataSizeInBytes]
    var IngestedFilesSummary: js.UndefOr[IngestedFilesSummary]
    var IngestionInputConfiguration: js.UndefOr[IngestionInputConfiguration]
    var JobId: js.UndefOr[IngestionJobId]
    var RoleArn: js.UndefOr[IamRoleArn]
    var Status: js.UndefOr[IngestionJobStatus]
    var StatusDetail: js.UndefOr[BoundedLengthString]
  }

  object DescribeDataIngestionJobResponse {
    @inline
    def apply(
        CreatedAt: js.UndefOr[Timestamp] = js.undefined,
        DataEndTime: js.UndefOr[Timestamp] = js.undefined,
        DataQualitySummary: js.UndefOr[DataQualitySummary] = js.undefined,
        DataStartTime: js.UndefOr[Timestamp] = js.undefined,
        DatasetArn: js.UndefOr[DatasetArn] = js.undefined,
        FailedReason: js.UndefOr[BoundedLengthString] = js.undefined,
        IngestedDataSize: js.UndefOr[DataSizeInBytes] = js.undefined,
        IngestedFilesSummary: js.UndefOr[IngestedFilesSummary] = js.undefined,
        IngestionInputConfiguration: js.UndefOr[IngestionInputConfiguration] = js.undefined,
        JobId: js.UndefOr[IngestionJobId] = js.undefined,
        RoleArn: js.UndefOr[IamRoleArn] = js.undefined,
        Status: js.UndefOr[IngestionJobStatus] = js.undefined,
        StatusDetail: js.UndefOr[BoundedLengthString] = js.undefined
    ): DescribeDataIngestionJobResponse = {
      val __obj = js.Dynamic.literal()
      CreatedAt.foreach(__v => __obj.updateDynamic("CreatedAt")(__v.asInstanceOf[js.Any]))
      DataEndTime.foreach(__v => __obj.updateDynamic("DataEndTime")(__v.asInstanceOf[js.Any]))
      DataQualitySummary.foreach(__v => __obj.updateDynamic("DataQualitySummary")(__v.asInstanceOf[js.Any]))
      DataStartTime.foreach(__v => __obj.updateDynamic("DataStartTime")(__v.asInstanceOf[js.Any]))
      DatasetArn.foreach(__v => __obj.updateDynamic("DatasetArn")(__v.asInstanceOf[js.Any]))
      FailedReason.foreach(__v => __obj.updateDynamic("FailedReason")(__v.asInstanceOf[js.Any]))
      IngestedDataSize.foreach(__v => __obj.updateDynamic("IngestedDataSize")(__v.asInstanceOf[js.Any]))
      IngestedFilesSummary.foreach(__v => __obj.updateDynamic("IngestedFilesSummary")(__v.asInstanceOf[js.Any]))
      IngestionInputConfiguration.foreach(__v => __obj.updateDynamic("IngestionInputConfiguration")(__v.asInstanceOf[js.Any]))
      JobId.foreach(__v => __obj.updateDynamic("JobId")(__v.asInstanceOf[js.Any]))
      RoleArn.foreach(__v => __obj.updateDynamic("RoleArn")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      StatusDetail.foreach(__v => __obj.updateDynamic("StatusDetail")(__v.asInstanceOf[js.Any]))
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
    var DataEndTime: js.UndefOr[Timestamp]
    var DataQualitySummary: js.UndefOr[DataQualitySummary]
    var DataStartTime: js.UndefOr[Timestamp]
    var DatasetArn: js.UndefOr[DatasetArn]
    var DatasetName: js.UndefOr[DatasetName]
    var IngestedFilesSummary: js.UndefOr[IngestedFilesSummary]
    var IngestionInputConfiguration: js.UndefOr[IngestionInputConfiguration]
    var LastUpdatedAt: js.UndefOr[Timestamp]
    var RoleArn: js.UndefOr[IamRoleArn]
    var Schema: js.UndefOr[InlineDataSchema]
    var ServerSideKmsKeyId: js.UndefOr[KmsKeyArn]
    var Status: js.UndefOr[DatasetStatus]
  }

  object DescribeDatasetResponse {
    @inline
    def apply(
        CreatedAt: js.UndefOr[Timestamp] = js.undefined,
        DataEndTime: js.UndefOr[Timestamp] = js.undefined,
        DataQualitySummary: js.UndefOr[DataQualitySummary] = js.undefined,
        DataStartTime: js.UndefOr[Timestamp] = js.undefined,
        DatasetArn: js.UndefOr[DatasetArn] = js.undefined,
        DatasetName: js.UndefOr[DatasetName] = js.undefined,
        IngestedFilesSummary: js.UndefOr[IngestedFilesSummary] = js.undefined,
        IngestionInputConfiguration: js.UndefOr[IngestionInputConfiguration] = js.undefined,
        LastUpdatedAt: js.UndefOr[Timestamp] = js.undefined,
        RoleArn: js.UndefOr[IamRoleArn] = js.undefined,
        Schema: js.UndefOr[InlineDataSchema] = js.undefined,
        ServerSideKmsKeyId: js.UndefOr[KmsKeyArn] = js.undefined,
        Status: js.UndefOr[DatasetStatus] = js.undefined
    ): DescribeDatasetResponse = {
      val __obj = js.Dynamic.literal()
      CreatedAt.foreach(__v => __obj.updateDynamic("CreatedAt")(__v.asInstanceOf[js.Any]))
      DataEndTime.foreach(__v => __obj.updateDynamic("DataEndTime")(__v.asInstanceOf[js.Any]))
      DataQualitySummary.foreach(__v => __obj.updateDynamic("DataQualitySummary")(__v.asInstanceOf[js.Any]))
      DataStartTime.foreach(__v => __obj.updateDynamic("DataStartTime")(__v.asInstanceOf[js.Any]))
      DatasetArn.foreach(__v => __obj.updateDynamic("DatasetArn")(__v.asInstanceOf[js.Any]))
      DatasetName.foreach(__v => __obj.updateDynamic("DatasetName")(__v.asInstanceOf[js.Any]))
      IngestedFilesSummary.foreach(__v => __obj.updateDynamic("IngestedFilesSummary")(__v.asInstanceOf[js.Any]))
      IngestionInputConfiguration.foreach(__v => __obj.updateDynamic("IngestionInputConfiguration")(__v.asInstanceOf[js.Any]))
      LastUpdatedAt.foreach(__v => __obj.updateDynamic("LastUpdatedAt")(__v.asInstanceOf[js.Any]))
      RoleArn.foreach(__v => __obj.updateDynamic("RoleArn")(__v.asInstanceOf[js.Any]))
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
    var LatestInferenceResult: js.UndefOr[LatestInferenceResult]
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
        LatestInferenceResult: js.UndefOr[LatestInferenceResult] = js.undefined,
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
      LatestInferenceResult.foreach(__v => __obj.updateDynamic("LatestInferenceResult")(__v.asInstanceOf[js.Any]))
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
  trait DescribeLabelGroupRequest extends js.Object {
    var LabelGroupName: LabelGroupName
  }

  object DescribeLabelGroupRequest {
    @inline
    def apply(
        LabelGroupName: LabelGroupName
    ): DescribeLabelGroupRequest = {
      val __obj = js.Dynamic.literal(
        "LabelGroupName" -> LabelGroupName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeLabelGroupRequest]
    }
  }

  @js.native
  trait DescribeLabelGroupResponse extends js.Object {
    var CreatedAt: js.UndefOr[Timestamp]
    var FaultCodes: js.UndefOr[FaultCodes]
    var LabelGroupArn: js.UndefOr[LabelGroupArn]
    var LabelGroupName: js.UndefOr[LabelGroupName]
    var UpdatedAt: js.UndefOr[Timestamp]
  }

  object DescribeLabelGroupResponse {
    @inline
    def apply(
        CreatedAt: js.UndefOr[Timestamp] = js.undefined,
        FaultCodes: js.UndefOr[FaultCodes] = js.undefined,
        LabelGroupArn: js.UndefOr[LabelGroupArn] = js.undefined,
        LabelGroupName: js.UndefOr[LabelGroupName] = js.undefined,
        UpdatedAt: js.UndefOr[Timestamp] = js.undefined
    ): DescribeLabelGroupResponse = {
      val __obj = js.Dynamic.literal()
      CreatedAt.foreach(__v => __obj.updateDynamic("CreatedAt")(__v.asInstanceOf[js.Any]))
      FaultCodes.foreach(__v => __obj.updateDynamic("FaultCodes")(__v.asInstanceOf[js.Any]))
      LabelGroupArn.foreach(__v => __obj.updateDynamic("LabelGroupArn")(__v.asInstanceOf[js.Any]))
      LabelGroupName.foreach(__v => __obj.updateDynamic("LabelGroupName")(__v.asInstanceOf[js.Any]))
      UpdatedAt.foreach(__v => __obj.updateDynamic("UpdatedAt")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeLabelGroupResponse]
    }
  }

  @js.native
  trait DescribeLabelRequest extends js.Object {
    var LabelGroupName: LabelGroupName
    var LabelId: LabelId
  }

  object DescribeLabelRequest {
    @inline
    def apply(
        LabelGroupName: LabelGroupName,
        LabelId: LabelId
    ): DescribeLabelRequest = {
      val __obj = js.Dynamic.literal(
        "LabelGroupName" -> LabelGroupName.asInstanceOf[js.Any],
        "LabelId" -> LabelId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeLabelRequest]
    }
  }

  @js.native
  trait DescribeLabelResponse extends js.Object {
    var CreatedAt: js.UndefOr[Timestamp]
    var EndTime: js.UndefOr[Timestamp]
    var Equipment: js.UndefOr[Equipment]
    var FaultCode: js.UndefOr[FaultCode]
    var LabelGroupArn: js.UndefOr[LabelGroupArn]
    var LabelGroupName: js.UndefOr[LabelGroupName]
    var LabelId: js.UndefOr[LabelId]
    var Notes: js.UndefOr[Comments]
    var Rating: js.UndefOr[LabelRating]
    var StartTime: js.UndefOr[Timestamp]
  }

  object DescribeLabelResponse {
    @inline
    def apply(
        CreatedAt: js.UndefOr[Timestamp] = js.undefined,
        EndTime: js.UndefOr[Timestamp] = js.undefined,
        Equipment: js.UndefOr[Equipment] = js.undefined,
        FaultCode: js.UndefOr[FaultCode] = js.undefined,
        LabelGroupArn: js.UndefOr[LabelGroupArn] = js.undefined,
        LabelGroupName: js.UndefOr[LabelGroupName] = js.undefined,
        LabelId: js.UndefOr[LabelId] = js.undefined,
        Notes: js.UndefOr[Comments] = js.undefined,
        Rating: js.UndefOr[LabelRating] = js.undefined,
        StartTime: js.UndefOr[Timestamp] = js.undefined
    ): DescribeLabelResponse = {
      val __obj = js.Dynamic.literal()
      CreatedAt.foreach(__v => __obj.updateDynamic("CreatedAt")(__v.asInstanceOf[js.Any]))
      EndTime.foreach(__v => __obj.updateDynamic("EndTime")(__v.asInstanceOf[js.Any]))
      Equipment.foreach(__v => __obj.updateDynamic("Equipment")(__v.asInstanceOf[js.Any]))
      FaultCode.foreach(__v => __obj.updateDynamic("FaultCode")(__v.asInstanceOf[js.Any]))
      LabelGroupArn.foreach(__v => __obj.updateDynamic("LabelGroupArn")(__v.asInstanceOf[js.Any]))
      LabelGroupName.foreach(__v => __obj.updateDynamic("LabelGroupName")(__v.asInstanceOf[js.Any]))
      LabelId.foreach(__v => __obj.updateDynamic("LabelId")(__v.asInstanceOf[js.Any]))
      Notes.foreach(__v => __obj.updateDynamic("Notes")(__v.asInstanceOf[js.Any]))
      Rating.foreach(__v => __obj.updateDynamic("Rating")(__v.asInstanceOf[js.Any]))
      StartTime.foreach(__v => __obj.updateDynamic("StartTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeLabelResponse]
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

  /** Entity that comprises information abount duplicate timestamps in the dataset.
    */
  @js.native
  trait DuplicateTimestamps extends js.Object {
    var TotalNumberOfDuplicateTimestamps: Int
  }

  object DuplicateTimestamps {
    @inline
    def apply(
        TotalNumberOfDuplicateTimestamps: Int
    ): DuplicateTimestamps = {
      val __obj = js.Dynamic.literal(
        "TotalNumberOfDuplicateTimestamps" -> TotalNumberOfDuplicateTimestamps.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DuplicateTimestamps]
    }
  }

  /** Contains information about the specific inference event, including start and end time, diagnostics information, event duration and so on.
    */
  @js.native
  trait InferenceEventSummary extends js.Object {
    var Diagnostics: js.UndefOr[ModelMetrics]
    var EventDurationInSeconds: js.UndefOr[EventDurationInSeconds]
    var EventEndTime: js.UndefOr[Timestamp]
    var EventStartTime: js.UndefOr[Timestamp]
    var InferenceSchedulerArn: js.UndefOr[InferenceSchedulerArn]
    var InferenceSchedulerName: js.UndefOr[InferenceSchedulerName]
  }

  object InferenceEventSummary {
    @inline
    def apply(
        Diagnostics: js.UndefOr[ModelMetrics] = js.undefined,
        EventDurationInSeconds: js.UndefOr[EventDurationInSeconds] = js.undefined,
        EventEndTime: js.UndefOr[Timestamp] = js.undefined,
        EventStartTime: js.UndefOr[Timestamp] = js.undefined,
        InferenceSchedulerArn: js.UndefOr[InferenceSchedulerArn] = js.undefined,
        InferenceSchedulerName: js.UndefOr[InferenceSchedulerName] = js.undefined
    ): InferenceEventSummary = {
      val __obj = js.Dynamic.literal()
      Diagnostics.foreach(__v => __obj.updateDynamic("Diagnostics")(__v.asInstanceOf[js.Any]))
      EventDurationInSeconds.foreach(__v => __obj.updateDynamic("EventDurationInSeconds")(__v.asInstanceOf[js.Any]))
      EventEndTime.foreach(__v => __obj.updateDynamic("EventEndTime")(__v.asInstanceOf[js.Any]))
      EventStartTime.foreach(__v => __obj.updateDynamic("EventStartTime")(__v.asInstanceOf[js.Any]))
      InferenceSchedulerArn.foreach(__v => __obj.updateDynamic("InferenceSchedulerArn")(__v.asInstanceOf[js.Any]))
      InferenceSchedulerName.foreach(__v => __obj.updateDynamic("InferenceSchedulerName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InferenceEventSummary]
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

  /** Specifies configuration information for the input data for the inference, including Amazon S3 location of input data..
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
    var LatestInferenceResult: js.UndefOr[LatestInferenceResult]
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
        LatestInferenceResult: js.UndefOr[LatestInferenceResult] = js.undefined,
        ModelArn: js.UndefOr[ModelArn] = js.undefined,
        ModelName: js.UndefOr[ModelName] = js.undefined,
        Status: js.UndefOr[InferenceSchedulerStatus] = js.undefined
    ): InferenceSchedulerSummary = {
      val __obj = js.Dynamic.literal()
      DataDelayOffsetInMinutes.foreach(__v => __obj.updateDynamic("DataDelayOffsetInMinutes")(__v.asInstanceOf[js.Any]))
      DataUploadFrequency.foreach(__v => __obj.updateDynamic("DataUploadFrequency")(__v.asInstanceOf[js.Any]))
      InferenceSchedulerArn.foreach(__v => __obj.updateDynamic("InferenceSchedulerArn")(__v.asInstanceOf[js.Any]))
      InferenceSchedulerName.foreach(__v => __obj.updateDynamic("InferenceSchedulerName")(__v.asInstanceOf[js.Any]))
      LatestInferenceResult.foreach(__v => __obj.updateDynamic("LatestInferenceResult")(__v.asInstanceOf[js.Any]))
      ModelArn.foreach(__v => __obj.updateDynamic("ModelArn")(__v.asInstanceOf[js.Any]))
      ModelName.foreach(__v => __obj.updateDynamic("ModelName")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InferenceSchedulerSummary]
    }
  }

  /** Gives statistics about how many files have been ingested, and which files have not been ingested, for a particular ingestion job.
    */
  @js.native
  trait IngestedFilesSummary extends js.Object {
    var IngestedNumberOfFiles: Int
    var TotalNumberOfFiles: Int
    var DiscardedFiles: js.UndefOr[ListOfDiscardedFiles]
  }

  object IngestedFilesSummary {
    @inline
    def apply(
        IngestedNumberOfFiles: Int,
        TotalNumberOfFiles: Int,
        DiscardedFiles: js.UndefOr[ListOfDiscardedFiles] = js.undefined
    ): IngestedFilesSummary = {
      val __obj = js.Dynamic.literal(
        "IngestedNumberOfFiles" -> IngestedNumberOfFiles.asInstanceOf[js.Any],
        "TotalNumberOfFiles" -> TotalNumberOfFiles.asInstanceOf[js.Any]
      )

      DiscardedFiles.foreach(__v => __obj.updateDynamic("DiscardedFiles")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[IngestedFilesSummary]
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
    var KeyPattern: js.UndefOr[KeyPattern]
    var Prefix: js.UndefOr[S3Prefix]
  }

  object IngestionS3InputConfiguration {
    @inline
    def apply(
        Bucket: S3Bucket,
        KeyPattern: js.UndefOr[KeyPattern] = js.undefined,
        Prefix: js.UndefOr[S3Prefix] = js.undefined
    ): IngestionS3InputConfiguration = {
      val __obj = js.Dynamic.literal(
        "Bucket" -> Bucket.asInstanceOf[js.Any]
      )

      KeyPattern.foreach(__v => __obj.updateDynamic("KeyPattern")(__v.asInstanceOf[js.Any]))
      Prefix.foreach(__v => __obj.updateDynamic("Prefix")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[IngestionS3InputConfiguration]
    }
  }

  /** Entity that comprises aggregated information on sensors having insufficient data.
    */
  @js.native
  trait InsufficientSensorData extends js.Object {
    var MissingCompleteSensorData: MissingCompleteSensorData
    var SensorsWithShortDateRange: SensorsWithShortDateRange
  }

  object InsufficientSensorData {
    @inline
    def apply(
        MissingCompleteSensorData: MissingCompleteSensorData,
        SensorsWithShortDateRange: SensorsWithShortDateRange
    ): InsufficientSensorData = {
      val __obj = js.Dynamic.literal(
        "MissingCompleteSensorData" -> MissingCompleteSensorData.asInstanceOf[js.Any],
        "SensorsWithShortDateRange" -> SensorsWithShortDateRange.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[InsufficientSensorData]
    }
  }

  /** Entity that comprises aggregated information on sensors having insufficient data.
    */
  @js.native
  trait InvalidSensorData extends js.Object {
    var AffectedSensorCount: Int
    var TotalNumberOfInvalidValues: Int
  }

  object InvalidSensorData {
    @inline
    def apply(
        AffectedSensorCount: Int,
        TotalNumberOfInvalidValues: Int
    ): InvalidSensorData = {
      val __obj = js.Dynamic.literal(
        "AffectedSensorCount" -> AffectedSensorCount.asInstanceOf[js.Any],
        "TotalNumberOfInvalidValues" -> TotalNumberOfInvalidValues.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[InvalidSensorData]
    }
  }

  /** Contains information about the label group.
    */
  @js.native
  trait LabelGroupSummary extends js.Object {
    var CreatedAt: js.UndefOr[Timestamp]
    var LabelGroupArn: js.UndefOr[LabelGroupArn]
    var LabelGroupName: js.UndefOr[LabelGroupName]
    var UpdatedAt: js.UndefOr[Timestamp]
  }

  object LabelGroupSummary {
    @inline
    def apply(
        CreatedAt: js.UndefOr[Timestamp] = js.undefined,
        LabelGroupArn: js.UndefOr[LabelGroupArn] = js.undefined,
        LabelGroupName: js.UndefOr[LabelGroupName] = js.undefined,
        UpdatedAt: js.UndefOr[Timestamp] = js.undefined
    ): LabelGroupSummary = {
      val __obj = js.Dynamic.literal()
      CreatedAt.foreach(__v => __obj.updateDynamic("CreatedAt")(__v.asInstanceOf[js.Any]))
      LabelGroupArn.foreach(__v => __obj.updateDynamic("LabelGroupArn")(__v.asInstanceOf[js.Any]))
      LabelGroupName.foreach(__v => __obj.updateDynamic("LabelGroupName")(__v.asInstanceOf[js.Any]))
      UpdatedAt.foreach(__v => __obj.updateDynamic("UpdatedAt")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LabelGroupSummary]
    }
  }

  /** Information about the label.
    */
  @js.native
  trait LabelSummary extends js.Object {
    var CreatedAt: js.UndefOr[Timestamp]
    var EndTime: js.UndefOr[Timestamp]
    var Equipment: js.UndefOr[Equipment]
    var FaultCode: js.UndefOr[FaultCode]
    var LabelGroupArn: js.UndefOr[LabelGroupArn]
    var LabelGroupName: js.UndefOr[LabelGroupName]
    var LabelId: js.UndefOr[LabelId]
    var Rating: js.UndefOr[LabelRating]
    var StartTime: js.UndefOr[Timestamp]
  }

  object LabelSummary {
    @inline
    def apply(
        CreatedAt: js.UndefOr[Timestamp] = js.undefined,
        EndTime: js.UndefOr[Timestamp] = js.undefined,
        Equipment: js.UndefOr[Equipment] = js.undefined,
        FaultCode: js.UndefOr[FaultCode] = js.undefined,
        LabelGroupArn: js.UndefOr[LabelGroupArn] = js.undefined,
        LabelGroupName: js.UndefOr[LabelGroupName] = js.undefined,
        LabelId: js.UndefOr[LabelId] = js.undefined,
        Rating: js.UndefOr[LabelRating] = js.undefined,
        StartTime: js.UndefOr[Timestamp] = js.undefined
    ): LabelSummary = {
      val __obj = js.Dynamic.literal()
      CreatedAt.foreach(__v => __obj.updateDynamic("CreatedAt")(__v.asInstanceOf[js.Any]))
      EndTime.foreach(__v => __obj.updateDynamic("EndTime")(__v.asInstanceOf[js.Any]))
      Equipment.foreach(__v => __obj.updateDynamic("Equipment")(__v.asInstanceOf[js.Any]))
      FaultCode.foreach(__v => __obj.updateDynamic("FaultCode")(__v.asInstanceOf[js.Any]))
      LabelGroupArn.foreach(__v => __obj.updateDynamic("LabelGroupArn")(__v.asInstanceOf[js.Any]))
      LabelGroupName.foreach(__v => __obj.updateDynamic("LabelGroupName")(__v.asInstanceOf[js.Any]))
      LabelId.foreach(__v => __obj.updateDynamic("LabelId")(__v.asInstanceOf[js.Any]))
      Rating.foreach(__v => __obj.updateDynamic("Rating")(__v.asInstanceOf[js.Any]))
      StartTime.foreach(__v => __obj.updateDynamic("StartTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LabelSummary]
    }
  }

  /** Contains the configuration information for the S3 location being used to hold label data.
    */
  @js.native
  trait LabelsInputConfiguration extends js.Object {
    var LabelGroupName: js.UndefOr[LabelGroupName]
    var S3InputConfiguration: js.UndefOr[LabelsS3InputConfiguration]
  }

  object LabelsInputConfiguration {
    @inline
    def apply(
        LabelGroupName: js.UndefOr[LabelGroupName] = js.undefined,
        S3InputConfiguration: js.UndefOr[LabelsS3InputConfiguration] = js.undefined
    ): LabelsInputConfiguration = {
      val __obj = js.Dynamic.literal()
      LabelGroupName.foreach(__v => __obj.updateDynamic("LabelGroupName")(__v.asInstanceOf[js.Any]))
      S3InputConfiguration.foreach(__v => __obj.updateDynamic("S3InputConfiguration")(__v.asInstanceOf[js.Any]))
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

  /** Entity that comprises information on large gaps between consecutive timestamps in data.
    */
  @js.native
  trait LargeTimestampGaps extends js.Object {
    var Status: StatisticalIssueStatus
    var MaxTimestampGapInDays: js.UndefOr[Int]
    var NumberOfLargeTimestampGaps: js.UndefOr[Int]
  }

  object LargeTimestampGaps {
    @inline
    def apply(
        Status: StatisticalIssueStatus,
        MaxTimestampGapInDays: js.UndefOr[Int] = js.undefined,
        NumberOfLargeTimestampGaps: js.UndefOr[Int] = js.undefined
    ): LargeTimestampGaps = {
      val __obj = js.Dynamic.literal(
        "Status" -> Status.asInstanceOf[js.Any]
      )

      MaxTimestampGapInDays.foreach(__v => __obj.updateDynamic("MaxTimestampGapInDays")(__v.asInstanceOf[js.Any]))
      NumberOfLargeTimestampGaps.foreach(__v => __obj.updateDynamic("NumberOfLargeTimestampGaps")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LargeTimestampGaps]
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
  trait ListInferenceEventsRequest extends js.Object {
    var InferenceSchedulerName: InferenceSchedulerIdentifier
    var IntervalEndTime: Timestamp
    var IntervalStartTime: Timestamp
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListInferenceEventsRequest {
    @inline
    def apply(
        InferenceSchedulerName: InferenceSchedulerIdentifier,
        IntervalEndTime: Timestamp,
        IntervalStartTime: Timestamp,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListInferenceEventsRequest = {
      val __obj = js.Dynamic.literal(
        "InferenceSchedulerName" -> InferenceSchedulerName.asInstanceOf[js.Any],
        "IntervalEndTime" -> IntervalEndTime.asInstanceOf[js.Any],
        "IntervalStartTime" -> IntervalStartTime.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListInferenceEventsRequest]
    }
  }

  @js.native
  trait ListInferenceEventsResponse extends js.Object {
    var InferenceEventSummaries: js.UndefOr[InferenceEventSummaries]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListInferenceEventsResponse {
    @inline
    def apply(
        InferenceEventSummaries: js.UndefOr[InferenceEventSummaries] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListInferenceEventsResponse = {
      val __obj = js.Dynamic.literal()
      InferenceEventSummaries.foreach(__v => __obj.updateDynamic("InferenceEventSummaries")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListInferenceEventsResponse]
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
  trait ListLabelGroupsRequest extends js.Object {
    var LabelGroupNameBeginsWith: js.UndefOr[LabelGroupName]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListLabelGroupsRequest {
    @inline
    def apply(
        LabelGroupNameBeginsWith: js.UndefOr[LabelGroupName] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListLabelGroupsRequest = {
      val __obj = js.Dynamic.literal()
      LabelGroupNameBeginsWith.foreach(__v => __obj.updateDynamic("LabelGroupNameBeginsWith")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListLabelGroupsRequest]
    }
  }

  @js.native
  trait ListLabelGroupsResponse extends js.Object {
    var LabelGroupSummaries: js.UndefOr[LabelGroupSummaries]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListLabelGroupsResponse {
    @inline
    def apply(
        LabelGroupSummaries: js.UndefOr[LabelGroupSummaries] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListLabelGroupsResponse = {
      val __obj = js.Dynamic.literal()
      LabelGroupSummaries.foreach(__v => __obj.updateDynamic("LabelGroupSummaries")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListLabelGroupsResponse]
    }
  }

  @js.native
  trait ListLabelsRequest extends js.Object {
    var LabelGroupName: LabelGroupName
    var Equipment: js.UndefOr[Equipment]
    var FaultCode: js.UndefOr[FaultCode]
    var IntervalEndTime: js.UndefOr[Timestamp]
    var IntervalStartTime: js.UndefOr[Timestamp]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListLabelsRequest {
    @inline
    def apply(
        LabelGroupName: LabelGroupName,
        Equipment: js.UndefOr[Equipment] = js.undefined,
        FaultCode: js.UndefOr[FaultCode] = js.undefined,
        IntervalEndTime: js.UndefOr[Timestamp] = js.undefined,
        IntervalStartTime: js.UndefOr[Timestamp] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListLabelsRequest = {
      val __obj = js.Dynamic.literal(
        "LabelGroupName" -> LabelGroupName.asInstanceOf[js.Any]
      )

      Equipment.foreach(__v => __obj.updateDynamic("Equipment")(__v.asInstanceOf[js.Any]))
      FaultCode.foreach(__v => __obj.updateDynamic("FaultCode")(__v.asInstanceOf[js.Any]))
      IntervalEndTime.foreach(__v => __obj.updateDynamic("IntervalEndTime")(__v.asInstanceOf[js.Any]))
      IntervalStartTime.foreach(__v => __obj.updateDynamic("IntervalStartTime")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListLabelsRequest]
    }
  }

  @js.native
  trait ListLabelsResponse extends js.Object {
    var LabelSummaries: js.UndefOr[LabelSummaries]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListLabelsResponse {
    @inline
    def apply(
        LabelSummaries: js.UndefOr[LabelSummaries] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListLabelsResponse = {
      val __obj = js.Dynamic.literal()
      LabelSummaries.foreach(__v => __obj.updateDynamic("LabelSummaries")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListLabelsResponse]
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
  trait ListSensorStatisticsRequest extends js.Object {
    var DatasetName: DatasetName
    var IngestionJobId: js.UndefOr[IngestionJobId]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListSensorStatisticsRequest {
    @inline
    def apply(
        DatasetName: DatasetName,
        IngestionJobId: js.UndefOr[IngestionJobId] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListSensorStatisticsRequest = {
      val __obj = js.Dynamic.literal(
        "DatasetName" -> DatasetName.asInstanceOf[js.Any]
      )

      IngestionJobId.foreach(__v => __obj.updateDynamic("IngestionJobId")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSensorStatisticsRequest]
    }
  }

  @js.native
  trait ListSensorStatisticsResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var SensorStatisticsSummaries: js.UndefOr[SensorStatisticsSummaries]
  }

  object ListSensorStatisticsResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        SensorStatisticsSummaries: js.UndefOr[SensorStatisticsSummaries] = js.undefined
    ): ListSensorStatisticsResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      SensorStatisticsSummaries.foreach(__v => __obj.updateDynamic("SensorStatisticsSummaries")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSensorStatisticsResponse]
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

  /** Entity that comprises information on sensors that have sensor data completely missing.
    */
  @js.native
  trait MissingCompleteSensorData extends js.Object {
    var AffectedSensorCount: Int
  }

  object MissingCompleteSensorData {
    @inline
    def apply(
        AffectedSensorCount: Int
    ): MissingCompleteSensorData = {
      val __obj = js.Dynamic.literal(
        "AffectedSensorCount" -> AffectedSensorCount.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[MissingCompleteSensorData]
    }
  }

  /** Entity that comprises aggregated information on sensors having missing data.
    */
  @js.native
  trait MissingSensorData extends js.Object {
    var AffectedSensorCount: Int
    var TotalNumberOfMissingValues: Int
  }

  object MissingSensorData {
    @inline
    def apply(
        AffectedSensorCount: Int,
        TotalNumberOfMissingValues: Int
    ): MissingSensorData = {
      val __obj = js.Dynamic.literal(
        "AffectedSensorCount" -> AffectedSensorCount.asInstanceOf[js.Any],
        "TotalNumberOfMissingValues" -> TotalNumberOfMissingValues.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[MissingSensorData]
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

  /** Entity that comprises information on monotonic values in the data.
    */
  @js.native
  trait MonotonicValues extends js.Object {
    var Status: StatisticalIssueStatus
    var Monotonicity: js.UndefOr[Monotonicity]
  }

  object MonotonicValues {
    @inline
    def apply(
        Status: StatisticalIssueStatus,
        Monotonicity: js.UndefOr[Monotonicity] = js.undefined
    ): MonotonicValues = {
      val __obj = js.Dynamic.literal(
        "Status" -> Status.asInstanceOf[js.Any]
      )

      Monotonicity.foreach(__v => __obj.updateDynamic("Monotonicity")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MonotonicValues]
    }
  }

  /** Entity that comprises information on operating modes in data.
    */
  @js.native
  trait MultipleOperatingModes extends js.Object {
    var Status: StatisticalIssueStatus
  }

  object MultipleOperatingModes {
    @inline
    def apply(
        Status: StatisticalIssueStatus
    ): MultipleOperatingModes = {
      val __obj = js.Dynamic.literal(
        "Status" -> Status.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[MultipleOperatingModes]
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

  /** Summary of ingestion statistics like whether data exists, number of missing values, number of invalid values and so on related to the particular sensor.
    */
  @js.native
  trait SensorStatisticsSummary extends js.Object {
    var CategoricalValues: js.UndefOr[CategoricalValues]
    var ComponentName: js.UndefOr[ComponentName]
    var DataEndTime: js.UndefOr[Timestamp]
    var DataExists: js.UndefOr[Boolean]
    var DataStartTime: js.UndefOr[Timestamp]
    var DuplicateTimestamps: js.UndefOr[CountPercent]
    var InvalidDateEntries: js.UndefOr[CountPercent]
    var InvalidValues: js.UndefOr[CountPercent]
    var LargeTimestampGaps: js.UndefOr[LargeTimestampGaps]
    var MissingValues: js.UndefOr[CountPercent]
    var MonotonicValues: js.UndefOr[MonotonicValues]
    var MultipleOperatingModes: js.UndefOr[MultipleOperatingModes]
    var SensorName: js.UndefOr[SensorName]
  }

  object SensorStatisticsSummary {
    @inline
    def apply(
        CategoricalValues: js.UndefOr[CategoricalValues] = js.undefined,
        ComponentName: js.UndefOr[ComponentName] = js.undefined,
        DataEndTime: js.UndefOr[Timestamp] = js.undefined,
        DataExists: js.UndefOr[Boolean] = js.undefined,
        DataStartTime: js.UndefOr[Timestamp] = js.undefined,
        DuplicateTimestamps: js.UndefOr[CountPercent] = js.undefined,
        InvalidDateEntries: js.UndefOr[CountPercent] = js.undefined,
        InvalidValues: js.UndefOr[CountPercent] = js.undefined,
        LargeTimestampGaps: js.UndefOr[LargeTimestampGaps] = js.undefined,
        MissingValues: js.UndefOr[CountPercent] = js.undefined,
        MonotonicValues: js.UndefOr[MonotonicValues] = js.undefined,
        MultipleOperatingModes: js.UndefOr[MultipleOperatingModes] = js.undefined,
        SensorName: js.UndefOr[SensorName] = js.undefined
    ): SensorStatisticsSummary = {
      val __obj = js.Dynamic.literal()
      CategoricalValues.foreach(__v => __obj.updateDynamic("CategoricalValues")(__v.asInstanceOf[js.Any]))
      ComponentName.foreach(__v => __obj.updateDynamic("ComponentName")(__v.asInstanceOf[js.Any]))
      DataEndTime.foreach(__v => __obj.updateDynamic("DataEndTime")(__v.asInstanceOf[js.Any]))
      DataExists.foreach(__v => __obj.updateDynamic("DataExists")(__v.asInstanceOf[js.Any]))
      DataStartTime.foreach(__v => __obj.updateDynamic("DataStartTime")(__v.asInstanceOf[js.Any]))
      DuplicateTimestamps.foreach(__v => __obj.updateDynamic("DuplicateTimestamps")(__v.asInstanceOf[js.Any]))
      InvalidDateEntries.foreach(__v => __obj.updateDynamic("InvalidDateEntries")(__v.asInstanceOf[js.Any]))
      InvalidValues.foreach(__v => __obj.updateDynamic("InvalidValues")(__v.asInstanceOf[js.Any]))
      LargeTimestampGaps.foreach(__v => __obj.updateDynamic("LargeTimestampGaps")(__v.asInstanceOf[js.Any]))
      MissingValues.foreach(__v => __obj.updateDynamic("MissingValues")(__v.asInstanceOf[js.Any]))
      MonotonicValues.foreach(__v => __obj.updateDynamic("MonotonicValues")(__v.asInstanceOf[js.Any]))
      MultipleOperatingModes.foreach(__v => __obj.updateDynamic("MultipleOperatingModes")(__v.asInstanceOf[js.Any]))
      SensorName.foreach(__v => __obj.updateDynamic("SensorName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SensorStatisticsSummary]
    }
  }

  /** Entity that comprises information on sensors that have shorter date range.
    */
  @js.native
  trait SensorsWithShortDateRange extends js.Object {
    var AffectedSensorCount: Int
  }

  object SensorsWithShortDateRange {
    @inline
    def apply(
        AffectedSensorCount: Int
    ): SensorsWithShortDateRange = {
      val __obj = js.Dynamic.literal(
        "AffectedSensorCount" -> AffectedSensorCount.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[SensorsWithShortDateRange]
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

  /** Entity that comprises information abount unsupported timestamps in the dataset.
    */
  @js.native
  trait UnsupportedTimestamps extends js.Object {
    var TotalNumberOfUnsupportedTimestamps: Int
  }

  object UnsupportedTimestamps {
    @inline
    def apply(
        TotalNumberOfUnsupportedTimestamps: Int
    ): UnsupportedTimestamps = {
      val __obj = js.Dynamic.literal(
        "TotalNumberOfUnsupportedTimestamps" -> TotalNumberOfUnsupportedTimestamps.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UnsupportedTimestamps]
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

  @js.native
  trait UpdateLabelGroupRequest extends js.Object {
    var LabelGroupName: LabelGroupName
    var FaultCodes: js.UndefOr[FaultCodes]
  }

  object UpdateLabelGroupRequest {
    @inline
    def apply(
        LabelGroupName: LabelGroupName,
        FaultCodes: js.UndefOr[FaultCodes] = js.undefined
    ): UpdateLabelGroupRequest = {
      val __obj = js.Dynamic.literal(
        "LabelGroupName" -> LabelGroupName.asInstanceOf[js.Any]
      )

      FaultCodes.foreach(__v => __obj.updateDynamic("FaultCodes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateLabelGroupRequest]
    }
  }
}
