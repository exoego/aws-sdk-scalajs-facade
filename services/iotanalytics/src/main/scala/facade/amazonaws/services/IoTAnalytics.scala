package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object iotanalytics {
  type ActivityBatchSize           = Int
  type ActivityName                = String
  type AttributeName               = String
  type AttributeNameMapping        = js.Dictionary[AttributeName]
  type AttributeNames              = js.Array[AttributeName]
  type BatchPutMessageErrorEntries = js.Array[BatchPutMessageErrorEntry]
  type BucketKeyExpression         = String
  type BucketName                  = String
  type ChannelArn                  = String
  type ChannelName                 = String
  type ChannelSummaries            = js.Array[ChannelSummary]
  type DatasetActionName           = String
  type DatasetActionSummaries      = js.Array[DatasetActionSummary]
  type DatasetActions              = js.Array[DatasetAction]
  type DatasetArn                  = String
  type DatasetContentDeliveryRules = js.Array[DatasetContentDeliveryRule]
  type DatasetContentSummaries     = js.Array[DatasetContentSummary]
  type DatasetContentVersion       = String
  type DatasetEntries              = js.Array[DatasetEntry]
  type DatasetName                 = String
  type DatasetSummaries            = js.Array[DatasetSummary]
  type DatasetTriggers             = js.Array[DatasetTrigger]
  type DatastoreArn                = String
  type DatastoreName               = String
  type DatastoreSummaries          = js.Array[DatastoreSummary]
  type DoubleValue                 = Double
  type EndTime                     = js.Date
  type EntryName                   = String
  type ErrorCode                   = String
  type ErrorMessage                = String
  type FilterExpression            = String
  type GlueDatabaseName            = String
  type GlueTableName               = String
  type Image                       = String
  type IncludeStatisticsFlag       = Boolean
  type IotEventsInputName          = String
  type LambdaName                  = String
  type LogResult                   = String
  type LoggingEnabled              = Boolean
  type MathExpression              = String
  type MaxMessages                 = Int
  type MaxResults                  = Int
  type MaxVersions                 = Int
  type MessageId                   = String
  type MessagePayload              = js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type MessagePayloads             = js.Array[MessagePayload]
  type Messages                    = js.Array[Message]
  type NextToken                   = String
  type OffsetSeconds               = Int
  type OutputFileName              = String
  type PipelineActivities          = js.Array[PipelineActivity]
  type PipelineArn                 = String
  type PipelineName                = String
  type PipelineSummaries           = js.Array[PipelineSummary]
  type PresignedURI                = String
  type QueryFilters                = js.Array[QueryFilter]
  type Reason                      = String
  type ReprocessingId              = String
  type ReprocessingSummaries       = js.Array[ReprocessingSummary]
  type ResourceArn                 = String
  type RetentionPeriodInDays       = Int
  type RoleArn                     = String
  type S3KeyPrefix                 = String
  type ScheduleExpression          = String
  type SizeInBytes                 = Double
  type SqlQuery                    = String
  type StartTime                   = js.Date
  type StringValue                 = String
  type TagKey                      = String
  type TagKeyList                  = js.Array[TagKey]
  type TagList                     = js.Array[Tag]
  type TagValue                    = String
  type TimeExpression              = String
  type Timestamp                   = js.Date
  type UnlimitedRetentionPeriod    = Boolean
  type UnlimitedVersioning         = Boolean
  type VariableName                = String
  type Variables                   = js.Array[Variable]
  type VolumeSizeInGB              = Int

  implicit final class IoTAnalyticsOps(private val service: IoTAnalytics) extends AnyVal {

    @inline def batchPutMessageFuture(params: BatchPutMessageRequest): Future[BatchPutMessageResponse] =
      service.batchPutMessage(params).promise().toFuture
    @inline def cancelPipelineReprocessingFuture(
        params: CancelPipelineReprocessingRequest
    ): Future[CancelPipelineReprocessingResponse] = service.cancelPipelineReprocessing(params).promise().toFuture
    @inline def createChannelFuture(params: CreateChannelRequest): Future[CreateChannelResponse] =
      service.createChannel(params).promise().toFuture
    @inline def createDatasetContentFuture(params: CreateDatasetContentRequest): Future[CreateDatasetContentResponse] =
      service.createDatasetContent(params).promise().toFuture
    @inline def createDatasetFuture(params: CreateDatasetRequest): Future[CreateDatasetResponse] =
      service.createDataset(params).promise().toFuture
    @inline def createDatastoreFuture(params: CreateDatastoreRequest): Future[CreateDatastoreResponse] =
      service.createDatastore(params).promise().toFuture
    @inline def createPipelineFuture(params: CreatePipelineRequest): Future[CreatePipelineResponse] =
      service.createPipeline(params).promise().toFuture
    @inline def deleteChannelFuture(params: DeleteChannelRequest): Future[js.Object] =
      service.deleteChannel(params).promise().toFuture
    @inline def deleteDatasetContentFuture(params: DeleteDatasetContentRequest): Future[js.Object] =
      service.deleteDatasetContent(params).promise().toFuture
    @inline def deleteDatasetFuture(params: DeleteDatasetRequest): Future[js.Object] =
      service.deleteDataset(params).promise().toFuture
    @inline def deleteDatastoreFuture(params: DeleteDatastoreRequest): Future[js.Object] =
      service.deleteDatastore(params).promise().toFuture
    @inline def deletePipelineFuture(params: DeletePipelineRequest): Future[js.Object] =
      service.deletePipeline(params).promise().toFuture
    @inline def describeChannelFuture(params: DescribeChannelRequest): Future[DescribeChannelResponse] =
      service.describeChannel(params).promise().toFuture
    @inline def describeDatasetFuture(params: DescribeDatasetRequest): Future[DescribeDatasetResponse] =
      service.describeDataset(params).promise().toFuture
    @inline def describeDatastoreFuture(params: DescribeDatastoreRequest): Future[DescribeDatastoreResponse] =
      service.describeDatastore(params).promise().toFuture
    @inline def describeLoggingOptionsFuture(
        params: DescribeLoggingOptionsRequest
    ): Future[DescribeLoggingOptionsResponse] = service.describeLoggingOptions(params).promise().toFuture
    @inline def describePipelineFuture(params: DescribePipelineRequest): Future[DescribePipelineResponse] =
      service.describePipeline(params).promise().toFuture
    @inline def getDatasetContentFuture(params: GetDatasetContentRequest): Future[GetDatasetContentResponse] =
      service.getDatasetContent(params).promise().toFuture
    @inline def listChannelsFuture(params: ListChannelsRequest): Future[ListChannelsResponse] =
      service.listChannels(params).promise().toFuture
    @inline def listDatasetContentsFuture(params: ListDatasetContentsRequest): Future[ListDatasetContentsResponse] =
      service.listDatasetContents(params).promise().toFuture
    @inline def listDatasetsFuture(params: ListDatasetsRequest): Future[ListDatasetsResponse] =
      service.listDatasets(params).promise().toFuture
    @inline def listDatastoresFuture(params: ListDatastoresRequest): Future[ListDatastoresResponse] =
      service.listDatastores(params).promise().toFuture
    @inline def listPipelinesFuture(params: ListPipelinesRequest): Future[ListPipelinesResponse] =
      service.listPipelines(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] =
      service.listTagsForResource(params).promise().toFuture
    @inline def putLoggingOptionsFuture(params: PutLoggingOptionsRequest): Future[js.Object] =
      service.putLoggingOptions(params).promise().toFuture
    @inline def runPipelineActivityFuture(params: RunPipelineActivityRequest): Future[RunPipelineActivityResponse] =
      service.runPipelineActivity(params).promise().toFuture
    @inline def sampleChannelDataFuture(params: SampleChannelDataRequest): Future[SampleChannelDataResponse] =
      service.sampleChannelData(params).promise().toFuture
    @inline def startPipelineReprocessingFuture(
        params: StartPipelineReprocessingRequest
    ): Future[StartPipelineReprocessingResponse] = service.startPipelineReprocessing(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] =
      service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] =
      service.untagResource(params).promise().toFuture
    @inline def updateChannelFuture(params: UpdateChannelRequest): Future[js.Object] =
      service.updateChannel(params).promise().toFuture
    @inline def updateDatasetFuture(params: UpdateDatasetRequest): Future[js.Object] =
      service.updateDataset(params).promise().toFuture
    @inline def updateDatastoreFuture(params: UpdateDatastoreRequest): Future[js.Object] =
      service.updateDatastore(params).promise().toFuture
    @inline def updatePipelineFuture(params: UpdatePipelineRequest): Future[js.Object] =
      service.updatePipeline(params).promise().toFuture
  }
}

package iotanalytics {
  @js.native
  @JSImport("aws-sdk", "IoTAnalytics")
  class IoTAnalytics() extends js.Object {
    def this(config: AWSConfig) = this()

    def batchPutMessage(params: BatchPutMessageRequest): Request[BatchPutMessageResponse] = js.native
    def cancelPipelineReprocessing(
        params: CancelPipelineReprocessingRequest
    ): Request[CancelPipelineReprocessingResponse]                                                       = js.native
    def createChannel(params: CreateChannelRequest): Request[CreateChannelResponse]                      = js.native
    def createDataset(params: CreateDatasetRequest): Request[CreateDatasetResponse]                      = js.native
    def createDatasetContent(params: CreateDatasetContentRequest): Request[CreateDatasetContentResponse] = js.native
    def createDatastore(params: CreateDatastoreRequest): Request[CreateDatastoreResponse]                = js.native
    def createPipeline(params: CreatePipelineRequest): Request[CreatePipelineResponse]                   = js.native
    def deleteChannel(params: DeleteChannelRequest): Request[js.Object]                                  = js.native
    def deleteDataset(params: DeleteDatasetRequest): Request[js.Object]                                  = js.native
    def deleteDatasetContent(params: DeleteDatasetContentRequest): Request[js.Object]                    = js.native
    def deleteDatastore(params: DeleteDatastoreRequest): Request[js.Object]                              = js.native
    def deletePipeline(params: DeletePipelineRequest): Request[js.Object]                                = js.native
    def describeChannel(params: DescribeChannelRequest): Request[DescribeChannelResponse]                = js.native
    def describeDataset(params: DescribeDatasetRequest): Request[DescribeDatasetResponse]                = js.native
    def describeDatastore(params: DescribeDatastoreRequest): Request[DescribeDatastoreResponse]          = js.native
    def describeLoggingOptions(params: DescribeLoggingOptionsRequest): Request[DescribeLoggingOptionsResponse] =
      js.native
    def describePipeline(params: DescribePipelineRequest): Request[DescribePipelineResponse]          = js.native
    def getDatasetContent(params: GetDatasetContentRequest): Request[GetDatasetContentResponse]       = js.native
    def listChannels(params: ListChannelsRequest): Request[ListChannelsResponse]                      = js.native
    def listDatasetContents(params: ListDatasetContentsRequest): Request[ListDatasetContentsResponse] = js.native
    def listDatasets(params: ListDatasetsRequest): Request[ListDatasetsResponse]                      = js.native
    def listDatastores(params: ListDatastoresRequest): Request[ListDatastoresResponse]                = js.native
    def listPipelines(params: ListPipelinesRequest): Request[ListPipelinesResponse]                   = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def putLoggingOptions(params: PutLoggingOptionsRequest): Request[js.Object]                       = js.native
    def runPipelineActivity(params: RunPipelineActivityRequest): Request[RunPipelineActivityResponse] = js.native
    def sampleChannelData(params: SampleChannelDataRequest): Request[SampleChannelDataResponse]       = js.native
    def startPipelineReprocessing(
        params: StartPipelineReprocessingRequest
    ): Request[StartPipelineReprocessingResponse]                                   = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse]       = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse] = js.native
    def updateChannel(params: UpdateChannelRequest): Request[js.Object]             = js.native
    def updateDataset(params: UpdateDatasetRequest): Request[js.Object]             = js.native
    def updateDatastore(params: UpdateDatastoreRequest): Request[js.Object]         = js.native
    def updatePipeline(params: UpdatePipelineRequest): Request[js.Object]           = js.native
  }

  /**
    * An activity that adds other attributes based on existing attributes in the message.
    */
  @js.native
  @Factory
  trait AddAttributesActivity extends js.Object {
    var attributes: AttributeNameMapping
    var name: ActivityName
    var next: js.UndefOr[ActivityName]
  }

  /**
    * Contains informations about errors.
    */
  @js.native
  @Factory
  trait BatchPutMessageErrorEntry extends js.Object {
    var errorCode: js.UndefOr[ErrorCode]
    var errorMessage: js.UndefOr[ErrorMessage]
    var messageId: js.UndefOr[MessageId]
  }

  @js.native
  @Factory
  trait BatchPutMessageRequest extends js.Object {
    var channelName: ChannelName
    var messages: Messages
  }

  @js.native
  @Factory
  trait BatchPutMessageResponse extends js.Object {
    var batchPutMessageErrorEntries: js.UndefOr[BatchPutMessageErrorEntries]
  }

  @js.native
  @Factory
  trait CancelPipelineReprocessingRequest extends js.Object {
    var pipelineName: PipelineName
    var reprocessingId: ReprocessingId
  }

  @js.native
  @Factory
  trait CancelPipelineReprocessingResponse extends js.Object {}

  /**
    * A collection of data from an MQTT topic. Channels archive the raw, unprocessed messages before publishing the data to a pipeline.
    */
  @js.native
  @Factory
  trait Channel extends js.Object {
    var arn: js.UndefOr[ChannelArn]
    var creationTime: js.UndefOr[Timestamp]
    var lastUpdateTime: js.UndefOr[Timestamp]
    var name: js.UndefOr[ChannelName]
    var retentionPeriod: js.UndefOr[RetentionPeriod]
    var status: js.UndefOr[ChannelStatus]
    var storage: js.UndefOr[ChannelStorage]
  }

  /**
    * The activity that determines the source of the messages to be processed.
    */
  @js.native
  @Factory
  trait ChannelActivity extends js.Object {
    var channelName: ChannelName
    var name: ActivityName
    var next: js.UndefOr[ActivityName]
  }

  /**
    * Statistics information about the channel.
    */
  @js.native
  @Factory
  trait ChannelStatistics extends js.Object {
    var size: js.UndefOr[EstimatedResourceSize]
  }

  @js.native
  sealed trait ChannelStatus extends js.Any
  object ChannelStatus extends js.Object {
    val CREATING = "CREATING".asInstanceOf[ChannelStatus]
    val ACTIVE   = "ACTIVE".asInstanceOf[ChannelStatus]
    val DELETING = "DELETING".asInstanceOf[ChannelStatus]

    val values = js.Object.freeze(js.Array(CREATING, ACTIVE, DELETING))
  }

  /**
    * Where channel data is stored. You may choose one of "serviceManagedS3" or "customerManagedS3" storage. If not specified, the default is "serviceManagedS3". This cannot be changed after creation of the channel.
    */
  @js.native
  @Factory
  trait ChannelStorage extends js.Object {
    var customerManagedS3: js.UndefOr[CustomerManagedChannelS3Storage]
    var serviceManagedS3: js.UndefOr[ServiceManagedChannelS3Storage]
  }

  /**
    * Where channel data is stored.
    */
  @js.native
  @Factory
  trait ChannelStorageSummary extends js.Object {
    var customerManagedS3: js.UndefOr[CustomerManagedChannelS3StorageSummary]
    var serviceManagedS3: js.UndefOr[ServiceManagedChannelS3StorageSummary]
  }

  /**
    * A summary of information about a channel.
    */
  @js.native
  @Factory
  trait ChannelSummary extends js.Object {
    var channelName: js.UndefOr[ChannelName]
    var channelStorage: js.UndefOr[ChannelStorageSummary]
    var creationTime: js.UndefOr[Timestamp]
    var lastUpdateTime: js.UndefOr[Timestamp]
    var status: js.UndefOr[ChannelStatus]
  }

  @js.native
  sealed trait ComputeType extends js.Any
  object ComputeType extends js.Object {
    val ACU_1 = "ACU_1".asInstanceOf[ComputeType]
    val ACU_2 = "ACU_2".asInstanceOf[ComputeType]

    val values = js.Object.freeze(js.Array(ACU_1, ACU_2))
  }

  /**
    * Information needed to run the "containerAction" to produce data set contents.
    */
  @js.native
  @Factory
  trait ContainerDatasetAction extends js.Object {
    var executionRoleArn: RoleArn
    var image: Image
    var resourceConfiguration: ResourceConfiguration
    var variables: js.UndefOr[Variables]
  }

  @js.native
  @Factory
  trait CreateChannelRequest extends js.Object {
    var channelName: ChannelName
    var channelStorage: js.UndefOr[ChannelStorage]
    var retentionPeriod: js.UndefOr[RetentionPeriod]
    var tags: js.UndefOr[TagList]
  }

  @js.native
  @Factory
  trait CreateChannelResponse extends js.Object {
    var channelArn: js.UndefOr[ChannelArn]
    var channelName: js.UndefOr[ChannelName]
    var retentionPeriod: js.UndefOr[RetentionPeriod]
  }

  @js.native
  @Factory
  trait CreateDatasetContentRequest extends js.Object {
    var datasetName: DatasetName
  }

  @js.native
  @Factory
  trait CreateDatasetContentResponse extends js.Object {
    var versionId: js.UndefOr[DatasetContentVersion]
  }

  @js.native
  @Factory
  trait CreateDatasetRequest extends js.Object {
    var actions: DatasetActions
    var datasetName: DatasetName
    var contentDeliveryRules: js.UndefOr[DatasetContentDeliveryRules]
    var retentionPeriod: js.UndefOr[RetentionPeriod]
    var tags: js.UndefOr[TagList]
    var triggers: js.UndefOr[DatasetTriggers]
    var versioningConfiguration: js.UndefOr[VersioningConfiguration]
  }

  @js.native
  @Factory
  trait CreateDatasetResponse extends js.Object {
    var datasetArn: js.UndefOr[DatasetArn]
    var datasetName: js.UndefOr[DatasetName]
    var retentionPeriod: js.UndefOr[RetentionPeriod]
  }

  @js.native
  @Factory
  trait CreateDatastoreRequest extends js.Object {
    var datastoreName: DatastoreName
    var datastoreStorage: js.UndefOr[DatastoreStorage]
    var retentionPeriod: js.UndefOr[RetentionPeriod]
    var tags: js.UndefOr[TagList]
  }

  @js.native
  @Factory
  trait CreateDatastoreResponse extends js.Object {
    var datastoreArn: js.UndefOr[DatastoreArn]
    var datastoreName: js.UndefOr[DatastoreName]
    var retentionPeriod: js.UndefOr[RetentionPeriod]
  }

  @js.native
  @Factory
  trait CreatePipelineRequest extends js.Object {
    var pipelineActivities: PipelineActivities
    var pipelineName: PipelineName
    var tags: js.UndefOr[TagList]
  }

  @js.native
  @Factory
  trait CreatePipelineResponse extends js.Object {
    var pipelineArn: js.UndefOr[PipelineArn]
    var pipelineName: js.UndefOr[PipelineName]
  }

  /**
    * Use this to store channel data in an S3 bucket that you manage. If customer managed storage is selected, the "retentionPeriod" parameter is ignored. The choice of service-managed or customer-managed S3 storage cannot be changed after creation of the channel.
    */
  @js.native
  @Factory
  trait CustomerManagedChannelS3Storage extends js.Object {
    var bucket: BucketName
    var roleArn: RoleArn
    var keyPrefix: js.UndefOr[S3KeyPrefix]
  }

  /**
    * Used to store channel data in an S3 bucket that you manage.
    */
  @js.native
  @Factory
  trait CustomerManagedChannelS3StorageSummary extends js.Object {
    var bucket: js.UndefOr[BucketName]
    var keyPrefix: js.UndefOr[S3KeyPrefix]
    var roleArn: js.UndefOr[RoleArn]
  }

  /**
    * Use this to store data store data in an S3 bucket that you manage. When customer managed storage is selected, the "retentionPeriod" parameter is ignored. The choice of service-managed or customer-managed S3 storage cannot be changed after creation of the data store.
    */
  @js.native
  @Factory
  trait CustomerManagedDatastoreS3Storage extends js.Object {
    var bucket: BucketName
    var roleArn: RoleArn
    var keyPrefix: js.UndefOr[S3KeyPrefix]
  }

  /**
    * Used to store data store data in an S3 bucket that you manage.
    */
  @js.native
  @Factory
  trait CustomerManagedDatastoreS3StorageSummary extends js.Object {
    var bucket: js.UndefOr[BucketName]
    var keyPrefix: js.UndefOr[S3KeyPrefix]
    var roleArn: js.UndefOr[RoleArn]
  }

  /**
    * Information about a data set.
    */
  @js.native
  @Factory
  trait Dataset extends js.Object {
    var actions: js.UndefOr[DatasetActions]
    var arn: js.UndefOr[DatasetArn]
    var contentDeliveryRules: js.UndefOr[DatasetContentDeliveryRules]
    var creationTime: js.UndefOr[Timestamp]
    var lastUpdateTime: js.UndefOr[Timestamp]
    var name: js.UndefOr[DatasetName]
    var retentionPeriod: js.UndefOr[RetentionPeriod]
    var status: js.UndefOr[DatasetStatus]
    var triggers: js.UndefOr[DatasetTriggers]
    var versioningConfiguration: js.UndefOr[VersioningConfiguration]
  }

  /**
    * A "DatasetAction" object that specifies how data set contents are automatically created.
    */
  @js.native
  @Factory
  trait DatasetAction extends js.Object {
    var actionName: js.UndefOr[DatasetActionName]
    var containerAction: js.UndefOr[ContainerDatasetAction]
    var queryAction: js.UndefOr[SqlQueryDatasetAction]
  }

  /**
    * Information about the action which automatically creates the data set's contents.
    */
  @js.native
  @Factory
  trait DatasetActionSummary extends js.Object {
    var actionName: js.UndefOr[DatasetActionName]
    var actionType: js.UndefOr[DatasetActionType]
  }

  @js.native
  sealed trait DatasetActionType extends js.Any
  object DatasetActionType extends js.Object {
    val QUERY     = "QUERY".asInstanceOf[DatasetActionType]
    val CONTAINER = "CONTAINER".asInstanceOf[DatasetActionType]

    val values = js.Object.freeze(js.Array(QUERY, CONTAINER))
  }

  /**
    * The destination to which data set contents are delivered.
    */
  @js.native
  @Factory
  trait DatasetContentDeliveryDestination extends js.Object {
    var iotEventsDestinationConfiguration: js.UndefOr[IotEventsDestinationConfiguration]
    var s3DestinationConfiguration: js.UndefOr[S3DestinationConfiguration]
  }

  /**
    * When data set contents are created they are delivered to destination specified here.
    */
  @js.native
  @Factory
  trait DatasetContentDeliveryRule extends js.Object {
    var destination: DatasetContentDeliveryDestination
    var entryName: js.UndefOr[EntryName]
  }

  @js.native
  sealed trait DatasetContentState extends js.Any
  object DatasetContentState extends js.Object {
    val CREATING  = "CREATING".asInstanceOf[DatasetContentState]
    val SUCCEEDED = "SUCCEEDED".asInstanceOf[DatasetContentState]
    val FAILED    = "FAILED".asInstanceOf[DatasetContentState]

    val values = js.Object.freeze(js.Array(CREATING, SUCCEEDED, FAILED))
  }

  /**
    * The state of the data set contents and the reason they are in this state.
    */
  @js.native
  @Factory
  trait DatasetContentStatus extends js.Object {
    var reason: js.UndefOr[Reason]
    var state: js.UndefOr[DatasetContentState]
  }

  /**
    * Summary information about data set contents.
    */
  @js.native
  @Factory
  trait DatasetContentSummary extends js.Object {
    var completionTime: js.UndefOr[Timestamp]
    var creationTime: js.UndefOr[Timestamp]
    var scheduleTime: js.UndefOr[Timestamp]
    var status: js.UndefOr[DatasetContentStatus]
    var version: js.UndefOr[DatasetContentVersion]
  }

  /**
    * The data set whose latest contents are used as input to the notebook or application.
    */
  @js.native
  @Factory
  trait DatasetContentVersionValue extends js.Object {
    var datasetName: DatasetName
  }

  /**
    * The reference to a data set entry.
    */
  @js.native
  @Factory
  trait DatasetEntry extends js.Object {
    var dataURI: js.UndefOr[PresignedURI]
    var entryName: js.UndefOr[EntryName]
  }

  @js.native
  sealed trait DatasetStatus extends js.Any
  object DatasetStatus extends js.Object {
    val CREATING = "CREATING".asInstanceOf[DatasetStatus]
    val ACTIVE   = "ACTIVE".asInstanceOf[DatasetStatus]
    val DELETING = "DELETING".asInstanceOf[DatasetStatus]

    val values = js.Object.freeze(js.Array(CREATING, ACTIVE, DELETING))
  }

  /**
    * A summary of information about a data set.
    */
  @js.native
  @Factory
  trait DatasetSummary extends js.Object {
    var actions: js.UndefOr[DatasetActionSummaries]
    var creationTime: js.UndefOr[Timestamp]
    var datasetName: js.UndefOr[DatasetName]
    var lastUpdateTime: js.UndefOr[Timestamp]
    var status: js.UndefOr[DatasetStatus]
    var triggers: js.UndefOr[DatasetTriggers]
  }

  /**
    * The "DatasetTrigger" that specifies when the data set is automatically updated.
    */
  @js.native
  @Factory
  trait DatasetTrigger extends js.Object {
    var dataset: js.UndefOr[TriggeringDataset]
    var schedule: js.UndefOr[Schedule]
  }

  /**
    * Information about a data store.
    */
  @js.native
  @Factory
  trait Datastore extends js.Object {
    var arn: js.UndefOr[DatastoreArn]
    var creationTime: js.UndefOr[Timestamp]
    var lastUpdateTime: js.UndefOr[Timestamp]
    var name: js.UndefOr[DatastoreName]
    var retentionPeriod: js.UndefOr[RetentionPeriod]
    var status: js.UndefOr[DatastoreStatus]
    var storage: js.UndefOr[DatastoreStorage]
  }

  /**
    * The 'datastore' activity that specifies where to store the processed data.
    */
  @js.native
  @Factory
  trait DatastoreActivity extends js.Object {
    var datastoreName: DatastoreName
    var name: ActivityName
  }

  /**
    * Statistical information about the data store.
    */
  @js.native
  @Factory
  trait DatastoreStatistics extends js.Object {
    var size: js.UndefOr[EstimatedResourceSize]
  }

  @js.native
  sealed trait DatastoreStatus extends js.Any
  object DatastoreStatus extends js.Object {
    val CREATING = "CREATING".asInstanceOf[DatastoreStatus]
    val ACTIVE   = "ACTIVE".asInstanceOf[DatastoreStatus]
    val DELETING = "DELETING".asInstanceOf[DatastoreStatus]

    val values = js.Object.freeze(js.Array(CREATING, ACTIVE, DELETING))
  }

  /**
    * Where data store data is stored. You may choose one of "serviceManagedS3" or "customerManagedS3" storage. If not specified, the default is "serviceManagedS3". This cannot be changed after the data store is created.
    */
  @js.native
  @Factory
  trait DatastoreStorage extends js.Object {
    var customerManagedS3: js.UndefOr[CustomerManagedDatastoreS3Storage]
    var serviceManagedS3: js.UndefOr[ServiceManagedDatastoreS3Storage]
  }

  /**
    * Where data store data is stored.
    */
  @js.native
  @Factory
  trait DatastoreStorageSummary extends js.Object {
    var customerManagedS3: js.UndefOr[CustomerManagedDatastoreS3StorageSummary]
    var serviceManagedS3: js.UndefOr[ServiceManagedDatastoreS3StorageSummary]
  }

  /**
    * A summary of information about a data store.
    */
  @js.native
  @Factory
  trait DatastoreSummary extends js.Object {
    var creationTime: js.UndefOr[Timestamp]
    var datastoreName: js.UndefOr[DatastoreName]
    var datastoreStorage: js.UndefOr[DatastoreStorageSummary]
    var lastUpdateTime: js.UndefOr[Timestamp]
    var status: js.UndefOr[DatastoreStatus]
  }

  @js.native
  @Factory
  trait DeleteChannelRequest extends js.Object {
    var channelName: ChannelName
  }

  @js.native
  @Factory
  trait DeleteDatasetContentRequest extends js.Object {
    var datasetName: DatasetName
    var versionId: js.UndefOr[DatasetContentVersion]
  }

  @js.native
  @Factory
  trait DeleteDatasetRequest extends js.Object {
    var datasetName: DatasetName
  }

  @js.native
  @Factory
  trait DeleteDatastoreRequest extends js.Object {
    var datastoreName: DatastoreName
  }

  @js.native
  @Factory
  trait DeletePipelineRequest extends js.Object {
    var pipelineName: PipelineName
  }

  /**
    * Used to limit data to that which has arrived since the last execution of the action.
    */
  @js.native
  @Factory
  trait DeltaTime extends js.Object {
    var offsetSeconds: OffsetSeconds
    var timeExpression: TimeExpression
  }

  @js.native
  @Factory
  trait DescribeChannelRequest extends js.Object {
    var channelName: ChannelName
    var includeStatistics: js.UndefOr[IncludeStatisticsFlag]
  }

  @js.native
  @Factory
  trait DescribeChannelResponse extends js.Object {
    var channel: js.UndefOr[Channel]
    var statistics: js.UndefOr[ChannelStatistics]
  }

  @js.native
  @Factory
  trait DescribeDatasetRequest extends js.Object {
    var datasetName: DatasetName
  }

  @js.native
  @Factory
  trait DescribeDatasetResponse extends js.Object {
    var dataset: js.UndefOr[Dataset]
  }

  @js.native
  @Factory
  trait DescribeDatastoreRequest extends js.Object {
    var datastoreName: DatastoreName
    var includeStatistics: js.UndefOr[IncludeStatisticsFlag]
  }

  @js.native
  @Factory
  trait DescribeDatastoreResponse extends js.Object {
    var datastore: js.UndefOr[Datastore]
    var statistics: js.UndefOr[DatastoreStatistics]
  }

  @js.native
  @Factory
  trait DescribeLoggingOptionsRequest extends js.Object {}

  @js.native
  @Factory
  trait DescribeLoggingOptionsResponse extends js.Object {
    var loggingOptions: js.UndefOr[LoggingOptions]
  }

  @js.native
  @Factory
  trait DescribePipelineRequest extends js.Object {
    var pipelineName: PipelineName
  }

  @js.native
  @Factory
  trait DescribePipelineResponse extends js.Object {
    var pipeline: js.UndefOr[Pipeline]
  }

  /**
    * An activity that adds data from the AWS IoT device registry to your message.
    */
  @js.native
  @Factory
  trait DeviceRegistryEnrichActivity extends js.Object {
    var attribute: AttributeName
    var name: ActivityName
    var roleArn: RoleArn
    var thingName: AttributeName
    var next: js.UndefOr[ActivityName]
  }

  /**
    * An activity that adds information from the AWS IoT Device Shadows service to a message.
    */
  @js.native
  @Factory
  trait DeviceShadowEnrichActivity extends js.Object {
    var attribute: AttributeName
    var name: ActivityName
    var roleArn: RoleArn
    var thingName: AttributeName
    var next: js.UndefOr[ActivityName]
  }

  /**
    * The estimated size of the resource.
    */
  @js.native
  @Factory
  trait EstimatedResourceSize extends js.Object {
    var estimatedOn: js.UndefOr[Timestamp]
    var estimatedSizeInBytes: js.UndefOr[SizeInBytes]
  }

  /**
    * An activity that filters a message based on its attributes.
    */
  @js.native
  @Factory
  trait FilterActivity extends js.Object {
    var filter: FilterExpression
    var name: ActivityName
    var next: js.UndefOr[ActivityName]
  }

  @js.native
  @Factory
  trait GetDatasetContentRequest extends js.Object {
    var datasetName: DatasetName
    var versionId: js.UndefOr[DatasetContentVersion]
  }

  @js.native
  @Factory
  trait GetDatasetContentResponse extends js.Object {
    var entries: js.UndefOr[DatasetEntries]
    var status: js.UndefOr[DatasetContentStatus]
    var timestamp: js.UndefOr[Timestamp]
  }

  /**
    * Configuration information for coordination with the AWS Glue ETL (extract, transform and load) service.
    */
  @js.native
  @Factory
  trait GlueConfiguration extends js.Object {
    var databaseName: GlueDatabaseName
    var tableName: GlueTableName
  }

  /**
    * Configuration information for delivery of data set contents to AWS IoT Events.
    */
  @js.native
  @Factory
  trait IotEventsDestinationConfiguration extends js.Object {
    var inputName: IotEventsInputName
    var roleArn: RoleArn
  }

  /**
    * An activity that runs a Lambda function to modify the message.
    */
  @js.native
  @Factory
  trait LambdaActivity extends js.Object {
    var batchSize: ActivityBatchSize
    var lambdaName: LambdaName
    var name: ActivityName
    var next: js.UndefOr[ActivityName]
  }

  @js.native
  @Factory
  trait ListChannelsRequest extends js.Object {
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListChannelsResponse extends js.Object {
    var channelSummaries: js.UndefOr[ChannelSummaries]
    var nextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListDatasetContentsRequest extends js.Object {
    var datasetName: DatasetName
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
    var scheduledBefore: js.UndefOr[Timestamp]
    var scheduledOnOrAfter: js.UndefOr[Timestamp]
  }

  @js.native
  @Factory
  trait ListDatasetContentsResponse extends js.Object {
    var datasetContentSummaries: js.UndefOr[DatasetContentSummaries]
    var nextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListDatasetsRequest extends js.Object {
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListDatasetsResponse extends js.Object {
    var datasetSummaries: js.UndefOr[DatasetSummaries]
    var nextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListDatastoresRequest extends js.Object {
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListDatastoresResponse extends js.Object {
    var datastoreSummaries: js.UndefOr[DatastoreSummaries]
    var nextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListPipelinesRequest extends js.Object {
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListPipelinesResponse extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var pipelineSummaries: js.UndefOr[PipelineSummaries]
  }

  @js.native
  @Factory
  trait ListTagsForResourceRequest extends js.Object {
    var resourceArn: ResourceArn
  }

  @js.native
  @Factory
  trait ListTagsForResourceResponse extends js.Object {
    var tags: js.UndefOr[TagList]
  }

  @js.native
  sealed trait LoggingLevel extends js.Any
  object LoggingLevel extends js.Object {
    val ERROR = "ERROR".asInstanceOf[LoggingLevel]

    val values = js.Object.freeze(js.Array(ERROR))
  }

  /**
    * Information about logging options.
    */
  @js.native
  @Factory
  trait LoggingOptions extends js.Object {
    var enabled: LoggingEnabled
    var level: LoggingLevel
    var roleArn: RoleArn
  }

  /**
    * An activity that computes an arithmetic expression using the message's attributes.
    */
  @js.native
  @Factory
  trait MathActivity extends js.Object {
    var attribute: AttributeName
    var math: MathExpression
    var name: ActivityName
    var next: js.UndefOr[ActivityName]
  }

  /**
    * Information about a message.
    */
  @js.native
  @Factory
  trait Message extends js.Object {
    var messageId: MessageId
    var payload: MessagePayload
  }

  /**
    * The value of the variable as a structure that specifies an output file URI.
    */
  @js.native
  @Factory
  trait OutputFileUriValue extends js.Object {
    var fileName: OutputFileName
  }

  /**
    * Contains information about a pipeline.
    */
  @js.native
  @Factory
  trait Pipeline extends js.Object {
    var activities: js.UndefOr[PipelineActivities]
    var arn: js.UndefOr[PipelineArn]
    var creationTime: js.UndefOr[Timestamp]
    var lastUpdateTime: js.UndefOr[Timestamp]
    var name: js.UndefOr[PipelineName]
    var reprocessingSummaries: js.UndefOr[ReprocessingSummaries]
  }

  /**
    * An activity that performs a transformation on a message.
    */
  @js.native
  @Factory
  trait PipelineActivity extends js.Object {
    var addAttributes: js.UndefOr[AddAttributesActivity]
    var channel: js.UndefOr[ChannelActivity]
    var datastore: js.UndefOr[DatastoreActivity]
    var deviceRegistryEnrich: js.UndefOr[DeviceRegistryEnrichActivity]
    var deviceShadowEnrich: js.UndefOr[DeviceShadowEnrichActivity]
    var filter: js.UndefOr[FilterActivity]
    var lambda: js.UndefOr[LambdaActivity]
    var math: js.UndefOr[MathActivity]
    var removeAttributes: js.UndefOr[RemoveAttributesActivity]
    var selectAttributes: js.UndefOr[SelectAttributesActivity]
  }

  /**
    * A summary of information about a pipeline.
    */
  @js.native
  @Factory
  trait PipelineSummary extends js.Object {
    var creationTime: js.UndefOr[Timestamp]
    var lastUpdateTime: js.UndefOr[Timestamp]
    var pipelineName: js.UndefOr[PipelineName]
    var reprocessingSummaries: js.UndefOr[ReprocessingSummaries]
  }

  @js.native
  @Factory
  trait PutLoggingOptionsRequest extends js.Object {
    var loggingOptions: LoggingOptions
  }

  /**
    * Information which is used to filter message data, to segregate it according to the time frame in which it arrives.
    */
  @js.native
  @Factory
  trait QueryFilter extends js.Object {
    var deltaTime: js.UndefOr[DeltaTime]
  }

  /**
    * An activity that removes attributes from a message.
    */
  @js.native
  @Factory
  trait RemoveAttributesActivity extends js.Object {
    var attributes: AttributeNames
    var name: ActivityName
    var next: js.UndefOr[ActivityName]
  }

  @js.native
  sealed trait ReprocessingStatus extends js.Any
  object ReprocessingStatus extends js.Object {
    val RUNNING   = "RUNNING".asInstanceOf[ReprocessingStatus]
    val SUCCEEDED = "SUCCEEDED".asInstanceOf[ReprocessingStatus]
    val CANCELLED = "CANCELLED".asInstanceOf[ReprocessingStatus]
    val FAILED    = "FAILED".asInstanceOf[ReprocessingStatus]

    val values = js.Object.freeze(js.Array(RUNNING, SUCCEEDED, CANCELLED, FAILED))
  }

  /**
    * Information about pipeline reprocessing.
    */
  @js.native
  @Factory
  trait ReprocessingSummary extends js.Object {
    var creationTime: js.UndefOr[Timestamp]
    var id: js.UndefOr[ReprocessingId]
    var status: js.UndefOr[ReprocessingStatus]
  }

  /**
    * The configuration of the resource used to execute the "containerAction".
    */
  @js.native
  @Factory
  trait ResourceConfiguration extends js.Object {
    var computeType: ComputeType
    var volumeSizeInGB: VolumeSizeInGB
  }

  /**
    * How long, in days, message data is kept.
    */
  @js.native
  @Factory
  trait RetentionPeriod extends js.Object {
    var numberOfDays: js.UndefOr[RetentionPeriodInDays]
    var unlimited: js.UndefOr[UnlimitedRetentionPeriod]
  }

  @js.native
  @Factory
  trait RunPipelineActivityRequest extends js.Object {
    var payloads: MessagePayloads
    var pipelineActivity: PipelineActivity
  }

  @js.native
  @Factory
  trait RunPipelineActivityResponse extends js.Object {
    var logResult: js.UndefOr[LogResult]
    var payloads: js.UndefOr[MessagePayloads]
  }

  /**
    * Configuration information for delivery of data set contents to Amazon S3.
    */
  @js.native
  @Factory
  trait S3DestinationConfiguration extends js.Object {
    var bucket: BucketName
    var key: BucketKeyExpression
    var roleArn: RoleArn
    var glueConfiguration: js.UndefOr[GlueConfiguration]
  }

  @js.native
  @Factory
  trait SampleChannelDataRequest extends js.Object {
    var channelName: ChannelName
    var endTime: js.UndefOr[EndTime]
    var maxMessages: js.UndefOr[MaxMessages]
    var startTime: js.UndefOr[StartTime]
  }

  @js.native
  @Factory
  trait SampleChannelDataResponse extends js.Object {
    var payloads: js.UndefOr[MessagePayloads]
  }

  /**
    * The schedule for when to trigger an update.
    */
  @js.native
  @Factory
  trait Schedule extends js.Object {
    var expression: js.UndefOr[ScheduleExpression]
  }

  /**
    * Creates a new message using only the specified attributes from the original message.
    */
  @js.native
  @Factory
  trait SelectAttributesActivity extends js.Object {
    var attributes: AttributeNames
    var name: ActivityName
    var next: js.UndefOr[ActivityName]
  }

  /**
    * Use this to store channel data in an S3 bucket managed by the AWS IoT Analytics service. The choice of service-managed or customer-managed S3 storage cannot be changed after creation of the channel.
    */
  @js.native
  @Factory
  trait ServiceManagedChannelS3Storage extends js.Object {}

  /**
    * Used to store channel data in an S3 bucket managed by the AWS IoT Analytics service.
    */
  @js.native
  @Factory
  trait ServiceManagedChannelS3StorageSummary extends js.Object {}

  /**
    * Use this to store data store data in an S3 bucket managed by the AWS IoT Analytics service. The choice of service-managed or customer-managed S3 storage cannot be changed after creation of the data store.
    */
  @js.native
  @Factory
  trait ServiceManagedDatastoreS3Storage extends js.Object {}

  /**
    * Used to store data store data in an S3 bucket managed by the AWS IoT Analytics service.
    */
  @js.native
  @Factory
  trait ServiceManagedDatastoreS3StorageSummary extends js.Object {}

  /**
    * The SQL query to modify the message.
    */
  @js.native
  @Factory
  trait SqlQueryDatasetAction extends js.Object {
    var sqlQuery: SqlQuery
    var filters: js.UndefOr[QueryFilters]
  }

  @js.native
  @Factory
  trait StartPipelineReprocessingRequest extends js.Object {
    var pipelineName: PipelineName
    var endTime: js.UndefOr[EndTime]
    var startTime: js.UndefOr[StartTime]
  }

  @js.native
  @Factory
  trait StartPipelineReprocessingResponse extends js.Object {
    var reprocessingId: js.UndefOr[ReprocessingId]
  }

  /**
    * A set of key/value pairs which are used to manage the resource.
    */
  @js.native
  @Factory
  trait Tag extends js.Object {
    var key: TagKey
    var value: TagValue
  }

  @js.native
  @Factory
  trait TagResourceRequest extends js.Object {
    var resourceArn: ResourceArn
    var tags: TagList
  }

  @js.native
  @Factory
  trait TagResourceResponse extends js.Object {}

  /**
    * Information about the data set whose content generation triggers the new data set content generation.
    */
  @js.native
  @Factory
  trait TriggeringDataset extends js.Object {
    var name: DatasetName
  }

  @js.native
  @Factory
  trait UntagResourceRequest extends js.Object {
    var resourceArn: ResourceArn
    var tagKeys: TagKeyList
  }

  @js.native
  @Factory
  trait UntagResourceResponse extends js.Object {}

  @js.native
  @Factory
  trait UpdateChannelRequest extends js.Object {
    var channelName: ChannelName
    var channelStorage: js.UndefOr[ChannelStorage]
    var retentionPeriod: js.UndefOr[RetentionPeriod]
  }

  @js.native
  @Factory
  trait UpdateDatasetRequest extends js.Object {
    var actions: DatasetActions
    var datasetName: DatasetName
    var contentDeliveryRules: js.UndefOr[DatasetContentDeliveryRules]
    var retentionPeriod: js.UndefOr[RetentionPeriod]
    var triggers: js.UndefOr[DatasetTriggers]
    var versioningConfiguration: js.UndefOr[VersioningConfiguration]
  }

  @js.native
  @Factory
  trait UpdateDatastoreRequest extends js.Object {
    var datastoreName: DatastoreName
    var datastoreStorage: js.UndefOr[DatastoreStorage]
    var retentionPeriod: js.UndefOr[RetentionPeriod]
  }

  @js.native
  @Factory
  trait UpdatePipelineRequest extends js.Object {
    var pipelineActivities: PipelineActivities
    var pipelineName: PipelineName
  }

  /**
    * An instance of a variable to be passed to the "containerAction" execution. Each variable must have a name and a value given by one of "stringValue", "datasetContentVersionValue", or "outputFileUriValue".
    */
  @js.native
  @Factory
  trait Variable extends js.Object {
    var name: VariableName
    var datasetContentVersionValue: js.UndefOr[DatasetContentVersionValue]
    var doubleValue: js.UndefOr[DoubleValue]
    var outputFileUriValue: js.UndefOr[OutputFileUriValue]
    var stringValue: js.UndefOr[StringValue]
  }

  /**
    * Information about the versioning of data set contents.
    */
  @js.native
  @Factory
  trait VersioningConfiguration extends js.Object {
    var maxVersions: js.UndefOr[MaxVersions]
    var unlimited: js.UndefOr[UnlimitedVersioning]
  }
}
