package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import io.scalajs.nodejs
import facade.amazonaws._

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
  type ChannelStatus               = String
  type ChannelSummaries            = js.Array[ChannelSummary]
  type ComputeType                 = String
  type DatasetActionName           = String
  type DatasetActionSummaries      = js.Array[DatasetActionSummary]
  type DatasetActionType           = String
  type DatasetActions              = js.Array[DatasetAction]
  type DatasetArn                  = String
  type DatasetContentDeliveryRules = js.Array[DatasetContentDeliveryRule]
  type DatasetContentState         = String
  type DatasetContentSummaries     = js.Array[DatasetContentSummary]
  type DatasetContentVersion       = String
  type DatasetEntries              = js.Array[DatasetEntry]
  type DatasetName                 = String
  type DatasetStatus               = String
  type DatasetSummaries            = js.Array[DatasetSummary]
  type DatasetTriggers             = js.Array[DatasetTrigger]
  type DatastoreArn                = String
  type DatastoreName               = String
  type DatastoreStatus             = String
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
  type LoggingLevel                = String
  type MathExpression              = String
  type MaxMessages                 = Int
  type MaxResults                  = Int
  type MaxVersions                 = Int
  type MessageId                   = String
  type MessagePayload =
    nodejs.buffer.Buffer | nodejs.stream.Readable | js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type MessagePayloads          = js.Array[MessagePayload]
  type Messages                 = js.Array[Message]
  type NextToken                = String
  type OffsetSeconds            = Int
  type OutputFileName           = String
  type PipelineActivities       = js.Array[PipelineActivity]
  type PipelineArn              = String
  type PipelineName             = String
  type PipelineSummaries        = js.Array[PipelineSummary]
  type PresignedURI             = String
  type QueryFilters             = js.Array[QueryFilter]
  type Reason                   = String
  type ReprocessingId           = String
  type ReprocessingStatus       = String
  type ReprocessingSummaries    = js.Array[ReprocessingSummary]
  type ResourceArn              = String
  type RetentionPeriodInDays    = Int
  type RoleArn                  = String
  type S3KeyPrefix              = String
  type ScheduleExpression       = String
  type SizeInBytes              = Double
  type SqlQuery                 = String
  type StartTime                = js.Date
  type StringValue              = String
  type TagKey                   = String
  type TagKeyList               = js.Array[TagKey]
  type TagList                  = js.Array[Tag]
  type TagValue                 = String
  type TimeExpression           = String
  type Timestamp                = js.Date
  type UnlimitedRetentionPeriod = Boolean
  type UnlimitedVersioning      = Boolean
  type VariableName             = String
  type Variables                = js.Array[Variable]
  type VolumeSizeInGB           = Int

  implicit final class IoTAnalyticsOps(private val service: IoTAnalytics) extends AnyVal {
    @inline def batchPutMessageFuture(params: BatchPutMessageRequest): Future[BatchPutMessageResponse] =
      service.batchPutMessage(params).promise.toFuture
    @inline def cancelPipelineReprocessingFuture(
        params: CancelPipelineReprocessingRequest
    ): Future[CancelPipelineReprocessingResponse] = service.cancelPipelineReprocessing(params).promise.toFuture
    @inline def createChannelFuture(params: CreateChannelRequest): Future[CreateChannelResponse] =
      service.createChannel(params).promise.toFuture
    @inline def createDatasetContentFuture(params: CreateDatasetContentRequest): Future[CreateDatasetContentResponse] =
      service.createDatasetContent(params).promise.toFuture
    @inline def createDatasetFuture(params: CreateDatasetRequest): Future[CreateDatasetResponse] =
      service.createDataset(params).promise.toFuture
    @inline def createDatastoreFuture(params: CreateDatastoreRequest): Future[CreateDatastoreResponse] =
      service.createDatastore(params).promise.toFuture
    @inline def createPipelineFuture(params: CreatePipelineRequest): Future[CreatePipelineResponse] =
      service.createPipeline(params).promise.toFuture
    @inline def deleteChannelFuture(params: DeleteChannelRequest): Future[js.Object] =
      service.deleteChannel(params).promise.toFuture
    @inline def deleteDatasetContentFuture(params: DeleteDatasetContentRequest): Future[js.Object] =
      service.deleteDatasetContent(params).promise.toFuture
    @inline def deleteDatasetFuture(params: DeleteDatasetRequest): Future[js.Object] =
      service.deleteDataset(params).promise.toFuture
    @inline def deleteDatastoreFuture(params: DeleteDatastoreRequest): Future[js.Object] =
      service.deleteDatastore(params).promise.toFuture
    @inline def deletePipelineFuture(params: DeletePipelineRequest): Future[js.Object] =
      service.deletePipeline(params).promise.toFuture
    @inline def describeChannelFuture(params: DescribeChannelRequest): Future[DescribeChannelResponse] =
      service.describeChannel(params).promise.toFuture
    @inline def describeDatasetFuture(params: DescribeDatasetRequest): Future[DescribeDatasetResponse] =
      service.describeDataset(params).promise.toFuture
    @inline def describeDatastoreFuture(params: DescribeDatastoreRequest): Future[DescribeDatastoreResponse] =
      service.describeDatastore(params).promise.toFuture
    @inline def describeLoggingOptionsFuture(
        params: DescribeLoggingOptionsRequest
    ): Future[DescribeLoggingOptionsResponse] = service.describeLoggingOptions(params).promise.toFuture
    @inline def describePipelineFuture(params: DescribePipelineRequest): Future[DescribePipelineResponse] =
      service.describePipeline(params).promise.toFuture
    @inline def getDatasetContentFuture(params: GetDatasetContentRequest): Future[GetDatasetContentResponse] =
      service.getDatasetContent(params).promise.toFuture
    @inline def listChannelsFuture(params: ListChannelsRequest): Future[ListChannelsResponse] =
      service.listChannels(params).promise.toFuture
    @inline def listDatasetContentsFuture(params: ListDatasetContentsRequest): Future[ListDatasetContentsResponse] =
      service.listDatasetContents(params).promise.toFuture
    @inline def listDatasetsFuture(params: ListDatasetsRequest): Future[ListDatasetsResponse] =
      service.listDatasets(params).promise.toFuture
    @inline def listDatastoresFuture(params: ListDatastoresRequest): Future[ListDatastoresResponse] =
      service.listDatastores(params).promise.toFuture
    @inline def listPipelinesFuture(params: ListPipelinesRequest): Future[ListPipelinesResponse] =
      service.listPipelines(params).promise.toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] =
      service.listTagsForResource(params).promise.toFuture
    @inline def putLoggingOptionsFuture(params: PutLoggingOptionsRequest): Future[js.Object] =
      service.putLoggingOptions(params).promise.toFuture
    @inline def runPipelineActivityFuture(params: RunPipelineActivityRequest): Future[RunPipelineActivityResponse] =
      service.runPipelineActivity(params).promise.toFuture
    @inline def sampleChannelDataFuture(params: SampleChannelDataRequest): Future[SampleChannelDataResponse] =
      service.sampleChannelData(params).promise.toFuture
    @inline def startPipelineReprocessingFuture(
        params: StartPipelineReprocessingRequest
    ): Future[StartPipelineReprocessingResponse] = service.startPipelineReprocessing(params).promise.toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] =
      service.tagResource(params).promise.toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] =
      service.untagResource(params).promise.toFuture
    @inline def updateChannelFuture(params: UpdateChannelRequest): Future[js.Object] =
      service.updateChannel(params).promise.toFuture
    @inline def updateDatasetFuture(params: UpdateDatasetRequest): Future[js.Object] =
      service.updateDataset(params).promise.toFuture
    @inline def updateDatastoreFuture(params: UpdateDatastoreRequest): Future[js.Object] =
      service.updateDatastore(params).promise.toFuture
    @inline def updatePipelineFuture(params: UpdatePipelineRequest): Future[js.Object] =
      service.updatePipeline(params).promise.toFuture
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
  trait AddAttributesActivity extends js.Object {
    var attributes: AttributeNameMapping
    var name: ActivityName
    var next: js.UndefOr[ActivityName]
  }

  object AddAttributesActivity {
    @inline
    def apply(
        attributes: AttributeNameMapping,
        name: ActivityName,
        next: js.UndefOr[ActivityName] = js.undefined
    ): AddAttributesActivity = {
      val __obj = js.Dynamic.literal(
        "attributes" -> attributes.asInstanceOf[js.Any],
        "name"       -> name.asInstanceOf[js.Any]
      )

      next.foreach(__v => __obj.updateDynamic("next")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AddAttributesActivity]
    }
  }

  /**
    * Contains informations about errors.
    */
  @js.native
  trait BatchPutMessageErrorEntry extends js.Object {
    var errorCode: js.UndefOr[ErrorCode]
    var errorMessage: js.UndefOr[ErrorMessage]
    var messageId: js.UndefOr[MessageId]
  }

  object BatchPutMessageErrorEntry {
    @inline
    def apply(
        errorCode: js.UndefOr[ErrorCode] = js.undefined,
        errorMessage: js.UndefOr[ErrorMessage] = js.undefined,
        messageId: js.UndefOr[MessageId] = js.undefined
    ): BatchPutMessageErrorEntry = {
      val __obj = js.Dynamic.literal()
      errorCode.foreach(__v => __obj.updateDynamic("errorCode")(__v.asInstanceOf[js.Any]))
      errorMessage.foreach(__v => __obj.updateDynamic("errorMessage")(__v.asInstanceOf[js.Any]))
      messageId.foreach(__v => __obj.updateDynamic("messageId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchPutMessageErrorEntry]
    }
  }

  @js.native
  trait BatchPutMessageRequest extends js.Object {
    var channelName: ChannelName
    var messages: Messages
  }

  object BatchPutMessageRequest {
    @inline
    def apply(
        channelName: ChannelName,
        messages: Messages
    ): BatchPutMessageRequest = {
      val __obj = js.Dynamic.literal(
        "channelName" -> channelName.asInstanceOf[js.Any],
        "messages"    -> messages.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[BatchPutMessageRequest]
    }
  }

  @js.native
  trait BatchPutMessageResponse extends js.Object {
    var batchPutMessageErrorEntries: js.UndefOr[BatchPutMessageErrorEntries]
  }

  object BatchPutMessageResponse {
    @inline
    def apply(
        batchPutMessageErrorEntries: js.UndefOr[BatchPutMessageErrorEntries] = js.undefined
    ): BatchPutMessageResponse = {
      val __obj = js.Dynamic.literal()
      batchPutMessageErrorEntries.foreach(
        __v => __obj.updateDynamic("batchPutMessageErrorEntries")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[BatchPutMessageResponse]
    }
  }

  @js.native
  trait CancelPipelineReprocessingRequest extends js.Object {
    var pipelineName: PipelineName
    var reprocessingId: ReprocessingId
  }

  object CancelPipelineReprocessingRequest {
    @inline
    def apply(
        pipelineName: PipelineName,
        reprocessingId: ReprocessingId
    ): CancelPipelineReprocessingRequest = {
      val __obj = js.Dynamic.literal(
        "pipelineName"   -> pipelineName.asInstanceOf[js.Any],
        "reprocessingId" -> reprocessingId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CancelPipelineReprocessingRequest]
    }
  }

  @js.native
  trait CancelPipelineReprocessingResponse extends js.Object {}

  object CancelPipelineReprocessingResponse {
    @inline
    def apply(
        ): CancelPipelineReprocessingResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[CancelPipelineReprocessingResponse]
    }
  }

  /**
    * A collection of data from an MQTT topic. Channels archive the raw, unprocessed messages before publishing the data to a pipeline.
    */
  @js.native
  trait Channel extends js.Object {
    var arn: js.UndefOr[ChannelArn]
    var creationTime: js.UndefOr[Timestamp]
    var lastUpdateTime: js.UndefOr[Timestamp]
    var name: js.UndefOr[ChannelName]
    var retentionPeriod: js.UndefOr[RetentionPeriod]
    var status: js.UndefOr[ChannelStatus]
    var storage: js.UndefOr[ChannelStorage]
  }

  object Channel {
    @inline
    def apply(
        arn: js.UndefOr[ChannelArn] = js.undefined,
        creationTime: js.UndefOr[Timestamp] = js.undefined,
        lastUpdateTime: js.UndefOr[Timestamp] = js.undefined,
        name: js.UndefOr[ChannelName] = js.undefined,
        retentionPeriod: js.UndefOr[RetentionPeriod] = js.undefined,
        status: js.UndefOr[ChannelStatus] = js.undefined,
        storage: js.UndefOr[ChannelStorage] = js.undefined
    ): Channel = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      creationTime.foreach(__v => __obj.updateDynamic("creationTime")(__v.asInstanceOf[js.Any]))
      lastUpdateTime.foreach(__v => __obj.updateDynamic("lastUpdateTime")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      retentionPeriod.foreach(__v => __obj.updateDynamic("retentionPeriod")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      storage.foreach(__v => __obj.updateDynamic("storage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Channel]
    }
  }

  /**
    * The activity that determines the source of the messages to be processed.
    */
  @js.native
  trait ChannelActivity extends js.Object {
    var channelName: ChannelName
    var name: ActivityName
    var next: js.UndefOr[ActivityName]
  }

  object ChannelActivity {
    @inline
    def apply(
        channelName: ChannelName,
        name: ActivityName,
        next: js.UndefOr[ActivityName] = js.undefined
    ): ChannelActivity = {
      val __obj = js.Dynamic.literal(
        "channelName" -> channelName.asInstanceOf[js.Any],
        "name"        -> name.asInstanceOf[js.Any]
      )

      next.foreach(__v => __obj.updateDynamic("next")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ChannelActivity]
    }
  }

  /**
    * Statistics information about the channel.
    */
  @js.native
  trait ChannelStatistics extends js.Object {
    var size: js.UndefOr[EstimatedResourceSize]
  }

  object ChannelStatistics {
    @inline
    def apply(
        size: js.UndefOr[EstimatedResourceSize] = js.undefined
    ): ChannelStatistics = {
      val __obj = js.Dynamic.literal()
      size.foreach(__v => __obj.updateDynamic("size")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ChannelStatistics]
    }
  }

  object ChannelStatusEnum {
    val CREATING = "CREATING"
    val ACTIVE   = "ACTIVE"
    val DELETING = "DELETING"

    val values = js.Object.freeze(js.Array(CREATING, ACTIVE, DELETING))
  }

  /**
    * Where channel data is stored. You may choose one of "serviceManagedS3" or "customerManagedS3" storage. If not specified, the default is "serviceManagedS3". This cannot be changed after creation of the channel.
    */
  @js.native
  trait ChannelStorage extends js.Object {
    var customerManagedS3: js.UndefOr[CustomerManagedChannelS3Storage]
    var serviceManagedS3: js.UndefOr[ServiceManagedChannelS3Storage]
  }

  object ChannelStorage {
    @inline
    def apply(
        customerManagedS3: js.UndefOr[CustomerManagedChannelS3Storage] = js.undefined,
        serviceManagedS3: js.UndefOr[ServiceManagedChannelS3Storage] = js.undefined
    ): ChannelStorage = {
      val __obj = js.Dynamic.literal()
      customerManagedS3.foreach(__v => __obj.updateDynamic("customerManagedS3")(__v.asInstanceOf[js.Any]))
      serviceManagedS3.foreach(__v => __obj.updateDynamic("serviceManagedS3")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ChannelStorage]
    }
  }

  /**
    * Where channel data is stored.
    */
  @js.native
  trait ChannelStorageSummary extends js.Object {
    var customerManagedS3: js.UndefOr[CustomerManagedChannelS3StorageSummary]
    var serviceManagedS3: js.UndefOr[ServiceManagedChannelS3StorageSummary]
  }

  object ChannelStorageSummary {
    @inline
    def apply(
        customerManagedS3: js.UndefOr[CustomerManagedChannelS3StorageSummary] = js.undefined,
        serviceManagedS3: js.UndefOr[ServiceManagedChannelS3StorageSummary] = js.undefined
    ): ChannelStorageSummary = {
      val __obj = js.Dynamic.literal()
      customerManagedS3.foreach(__v => __obj.updateDynamic("customerManagedS3")(__v.asInstanceOf[js.Any]))
      serviceManagedS3.foreach(__v => __obj.updateDynamic("serviceManagedS3")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ChannelStorageSummary]
    }
  }

  /**
    * A summary of information about a channel.
    */
  @js.native
  trait ChannelSummary extends js.Object {
    var channelName: js.UndefOr[ChannelName]
    var channelStorage: js.UndefOr[ChannelStorageSummary]
    var creationTime: js.UndefOr[Timestamp]
    var lastUpdateTime: js.UndefOr[Timestamp]
    var status: js.UndefOr[ChannelStatus]
  }

  object ChannelSummary {
    @inline
    def apply(
        channelName: js.UndefOr[ChannelName] = js.undefined,
        channelStorage: js.UndefOr[ChannelStorageSummary] = js.undefined,
        creationTime: js.UndefOr[Timestamp] = js.undefined,
        lastUpdateTime: js.UndefOr[Timestamp] = js.undefined,
        status: js.UndefOr[ChannelStatus] = js.undefined
    ): ChannelSummary = {
      val __obj = js.Dynamic.literal()
      channelName.foreach(__v => __obj.updateDynamic("channelName")(__v.asInstanceOf[js.Any]))
      channelStorage.foreach(__v => __obj.updateDynamic("channelStorage")(__v.asInstanceOf[js.Any]))
      creationTime.foreach(__v => __obj.updateDynamic("creationTime")(__v.asInstanceOf[js.Any]))
      lastUpdateTime.foreach(__v => __obj.updateDynamic("lastUpdateTime")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ChannelSummary]
    }
  }

  object ComputeTypeEnum {
    val ACU_1 = "ACU_1"
    val ACU_2 = "ACU_2"

    val values = js.Object.freeze(js.Array(ACU_1, ACU_2))
  }

  /**
    * Information needed to run the "containerAction" to produce data set contents.
    */
  @js.native
  trait ContainerDatasetAction extends js.Object {
    var executionRoleArn: RoleArn
    var image: Image
    var resourceConfiguration: ResourceConfiguration
    var variables: js.UndefOr[Variables]
  }

  object ContainerDatasetAction {
    @inline
    def apply(
        executionRoleArn: RoleArn,
        image: Image,
        resourceConfiguration: ResourceConfiguration,
        variables: js.UndefOr[Variables] = js.undefined
    ): ContainerDatasetAction = {
      val __obj = js.Dynamic.literal(
        "executionRoleArn"      -> executionRoleArn.asInstanceOf[js.Any],
        "image"                 -> image.asInstanceOf[js.Any],
        "resourceConfiguration" -> resourceConfiguration.asInstanceOf[js.Any]
      )

      variables.foreach(__v => __obj.updateDynamic("variables")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ContainerDatasetAction]
    }
  }

  @js.native
  trait CreateChannelRequest extends js.Object {
    var channelName: ChannelName
    var channelStorage: js.UndefOr[ChannelStorage]
    var retentionPeriod: js.UndefOr[RetentionPeriod]
    var tags: js.UndefOr[TagList]
  }

  object CreateChannelRequest {
    @inline
    def apply(
        channelName: ChannelName,
        channelStorage: js.UndefOr[ChannelStorage] = js.undefined,
        retentionPeriod: js.UndefOr[RetentionPeriod] = js.undefined,
        tags: js.UndefOr[TagList] = js.undefined
    ): CreateChannelRequest = {
      val __obj = js.Dynamic.literal(
        "channelName" -> channelName.asInstanceOf[js.Any]
      )

      channelStorage.foreach(__v => __obj.updateDynamic("channelStorage")(__v.asInstanceOf[js.Any]))
      retentionPeriod.foreach(__v => __obj.updateDynamic("retentionPeriod")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateChannelRequest]
    }
  }

  @js.native
  trait CreateChannelResponse extends js.Object {
    var channelArn: js.UndefOr[ChannelArn]
    var channelName: js.UndefOr[ChannelName]
    var retentionPeriod: js.UndefOr[RetentionPeriod]
  }

  object CreateChannelResponse {
    @inline
    def apply(
        channelArn: js.UndefOr[ChannelArn] = js.undefined,
        channelName: js.UndefOr[ChannelName] = js.undefined,
        retentionPeriod: js.UndefOr[RetentionPeriod] = js.undefined
    ): CreateChannelResponse = {
      val __obj = js.Dynamic.literal()
      channelArn.foreach(__v => __obj.updateDynamic("channelArn")(__v.asInstanceOf[js.Any]))
      channelName.foreach(__v => __obj.updateDynamic("channelName")(__v.asInstanceOf[js.Any]))
      retentionPeriod.foreach(__v => __obj.updateDynamic("retentionPeriod")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateChannelResponse]
    }
  }

  @js.native
  trait CreateDatasetContentRequest extends js.Object {
    var datasetName: DatasetName
  }

  object CreateDatasetContentRequest {
    @inline
    def apply(
        datasetName: DatasetName
    ): CreateDatasetContentRequest = {
      val __obj = js.Dynamic.literal(
        "datasetName" -> datasetName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateDatasetContentRequest]
    }
  }

  @js.native
  trait CreateDatasetContentResponse extends js.Object {
    var versionId: js.UndefOr[DatasetContentVersion]
  }

  object CreateDatasetContentResponse {
    @inline
    def apply(
        versionId: js.UndefOr[DatasetContentVersion] = js.undefined
    ): CreateDatasetContentResponse = {
      val __obj = js.Dynamic.literal()
      versionId.foreach(__v => __obj.updateDynamic("versionId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDatasetContentResponse]
    }
  }

  @js.native
  trait CreateDatasetRequest extends js.Object {
    var actions: DatasetActions
    var datasetName: DatasetName
    var contentDeliveryRules: js.UndefOr[DatasetContentDeliveryRules]
    var retentionPeriod: js.UndefOr[RetentionPeriod]
    var tags: js.UndefOr[TagList]
    var triggers: js.UndefOr[DatasetTriggers]
    var versioningConfiguration: js.UndefOr[VersioningConfiguration]
  }

  object CreateDatasetRequest {
    @inline
    def apply(
        actions: DatasetActions,
        datasetName: DatasetName,
        contentDeliveryRules: js.UndefOr[DatasetContentDeliveryRules] = js.undefined,
        retentionPeriod: js.UndefOr[RetentionPeriod] = js.undefined,
        tags: js.UndefOr[TagList] = js.undefined,
        triggers: js.UndefOr[DatasetTriggers] = js.undefined,
        versioningConfiguration: js.UndefOr[VersioningConfiguration] = js.undefined
    ): CreateDatasetRequest = {
      val __obj = js.Dynamic.literal(
        "actions"     -> actions.asInstanceOf[js.Any],
        "datasetName" -> datasetName.asInstanceOf[js.Any]
      )

      contentDeliveryRules.foreach(__v => __obj.updateDynamic("contentDeliveryRules")(__v.asInstanceOf[js.Any]))
      retentionPeriod.foreach(__v => __obj.updateDynamic("retentionPeriod")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      triggers.foreach(__v => __obj.updateDynamic("triggers")(__v.asInstanceOf[js.Any]))
      versioningConfiguration.foreach(__v => __obj.updateDynamic("versioningConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDatasetRequest]
    }
  }

  @js.native
  trait CreateDatasetResponse extends js.Object {
    var datasetArn: js.UndefOr[DatasetArn]
    var datasetName: js.UndefOr[DatasetName]
    var retentionPeriod: js.UndefOr[RetentionPeriod]
  }

  object CreateDatasetResponse {
    @inline
    def apply(
        datasetArn: js.UndefOr[DatasetArn] = js.undefined,
        datasetName: js.UndefOr[DatasetName] = js.undefined,
        retentionPeriod: js.UndefOr[RetentionPeriod] = js.undefined
    ): CreateDatasetResponse = {
      val __obj = js.Dynamic.literal()
      datasetArn.foreach(__v => __obj.updateDynamic("datasetArn")(__v.asInstanceOf[js.Any]))
      datasetName.foreach(__v => __obj.updateDynamic("datasetName")(__v.asInstanceOf[js.Any]))
      retentionPeriod.foreach(__v => __obj.updateDynamic("retentionPeriod")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDatasetResponse]
    }
  }

  @js.native
  trait CreateDatastoreRequest extends js.Object {
    var datastoreName: DatastoreName
    var datastoreStorage: js.UndefOr[DatastoreStorage]
    var retentionPeriod: js.UndefOr[RetentionPeriod]
    var tags: js.UndefOr[TagList]
  }

  object CreateDatastoreRequest {
    @inline
    def apply(
        datastoreName: DatastoreName,
        datastoreStorage: js.UndefOr[DatastoreStorage] = js.undefined,
        retentionPeriod: js.UndefOr[RetentionPeriod] = js.undefined,
        tags: js.UndefOr[TagList] = js.undefined
    ): CreateDatastoreRequest = {
      val __obj = js.Dynamic.literal(
        "datastoreName" -> datastoreName.asInstanceOf[js.Any]
      )

      datastoreStorage.foreach(__v => __obj.updateDynamic("datastoreStorage")(__v.asInstanceOf[js.Any]))
      retentionPeriod.foreach(__v => __obj.updateDynamic("retentionPeriod")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDatastoreRequest]
    }
  }

  @js.native
  trait CreateDatastoreResponse extends js.Object {
    var datastoreArn: js.UndefOr[DatastoreArn]
    var datastoreName: js.UndefOr[DatastoreName]
    var retentionPeriod: js.UndefOr[RetentionPeriod]
  }

  object CreateDatastoreResponse {
    @inline
    def apply(
        datastoreArn: js.UndefOr[DatastoreArn] = js.undefined,
        datastoreName: js.UndefOr[DatastoreName] = js.undefined,
        retentionPeriod: js.UndefOr[RetentionPeriod] = js.undefined
    ): CreateDatastoreResponse = {
      val __obj = js.Dynamic.literal()
      datastoreArn.foreach(__v => __obj.updateDynamic("datastoreArn")(__v.asInstanceOf[js.Any]))
      datastoreName.foreach(__v => __obj.updateDynamic("datastoreName")(__v.asInstanceOf[js.Any]))
      retentionPeriod.foreach(__v => __obj.updateDynamic("retentionPeriod")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDatastoreResponse]
    }
  }

  @js.native
  trait CreatePipelineRequest extends js.Object {
    var pipelineActivities: PipelineActivities
    var pipelineName: PipelineName
    var tags: js.UndefOr[TagList]
  }

  object CreatePipelineRequest {
    @inline
    def apply(
        pipelineActivities: PipelineActivities,
        pipelineName: PipelineName,
        tags: js.UndefOr[TagList] = js.undefined
    ): CreatePipelineRequest = {
      val __obj = js.Dynamic.literal(
        "pipelineActivities" -> pipelineActivities.asInstanceOf[js.Any],
        "pipelineName"       -> pipelineName.asInstanceOf[js.Any]
      )

      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreatePipelineRequest]
    }
  }

  @js.native
  trait CreatePipelineResponse extends js.Object {
    var pipelineArn: js.UndefOr[PipelineArn]
    var pipelineName: js.UndefOr[PipelineName]
  }

  object CreatePipelineResponse {
    @inline
    def apply(
        pipelineArn: js.UndefOr[PipelineArn] = js.undefined,
        pipelineName: js.UndefOr[PipelineName] = js.undefined
    ): CreatePipelineResponse = {
      val __obj = js.Dynamic.literal()
      pipelineArn.foreach(__v => __obj.updateDynamic("pipelineArn")(__v.asInstanceOf[js.Any]))
      pipelineName.foreach(__v => __obj.updateDynamic("pipelineName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreatePipelineResponse]
    }
  }

  /**
    * Use this to store channel data in an S3 bucket that you manage. If customer managed storage is selected, the "retentionPeriod" parameter is ignored. The choice of service-managed or customer-managed S3 storage cannot be changed after creation of the channel.
    */
  @js.native
  trait CustomerManagedChannelS3Storage extends js.Object {
    var bucket: BucketName
    var roleArn: RoleArn
    var keyPrefix: js.UndefOr[S3KeyPrefix]
  }

  object CustomerManagedChannelS3Storage {
    @inline
    def apply(
        bucket: BucketName,
        roleArn: RoleArn,
        keyPrefix: js.UndefOr[S3KeyPrefix] = js.undefined
    ): CustomerManagedChannelS3Storage = {
      val __obj = js.Dynamic.literal(
        "bucket"  -> bucket.asInstanceOf[js.Any],
        "roleArn" -> roleArn.asInstanceOf[js.Any]
      )

      keyPrefix.foreach(__v => __obj.updateDynamic("keyPrefix")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CustomerManagedChannelS3Storage]
    }
  }

  /**
    * Used to store channel data in an S3 bucket that you manage.
    */
  @js.native
  trait CustomerManagedChannelS3StorageSummary extends js.Object {
    var bucket: js.UndefOr[BucketName]
    var keyPrefix: js.UndefOr[S3KeyPrefix]
    var roleArn: js.UndefOr[RoleArn]
  }

  object CustomerManagedChannelS3StorageSummary {
    @inline
    def apply(
        bucket: js.UndefOr[BucketName] = js.undefined,
        keyPrefix: js.UndefOr[S3KeyPrefix] = js.undefined,
        roleArn: js.UndefOr[RoleArn] = js.undefined
    ): CustomerManagedChannelS3StorageSummary = {
      val __obj = js.Dynamic.literal()
      bucket.foreach(__v => __obj.updateDynamic("bucket")(__v.asInstanceOf[js.Any]))
      keyPrefix.foreach(__v => __obj.updateDynamic("keyPrefix")(__v.asInstanceOf[js.Any]))
      roleArn.foreach(__v => __obj.updateDynamic("roleArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CustomerManagedChannelS3StorageSummary]
    }
  }

  /**
    * Use this to store data store data in an S3 bucket that you manage. When customer managed storage is selected, the "retentionPeriod" parameter is ignored. The choice of service-managed or customer-managed S3 storage cannot be changed after creation of the data store.
    */
  @js.native
  trait CustomerManagedDatastoreS3Storage extends js.Object {
    var bucket: BucketName
    var roleArn: RoleArn
    var keyPrefix: js.UndefOr[S3KeyPrefix]
  }

  object CustomerManagedDatastoreS3Storage {
    @inline
    def apply(
        bucket: BucketName,
        roleArn: RoleArn,
        keyPrefix: js.UndefOr[S3KeyPrefix] = js.undefined
    ): CustomerManagedDatastoreS3Storage = {
      val __obj = js.Dynamic.literal(
        "bucket"  -> bucket.asInstanceOf[js.Any],
        "roleArn" -> roleArn.asInstanceOf[js.Any]
      )

      keyPrefix.foreach(__v => __obj.updateDynamic("keyPrefix")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CustomerManagedDatastoreS3Storage]
    }
  }

  /**
    * Used to store data store data in an S3 bucket that you manage.
    */
  @js.native
  trait CustomerManagedDatastoreS3StorageSummary extends js.Object {
    var bucket: js.UndefOr[BucketName]
    var keyPrefix: js.UndefOr[S3KeyPrefix]
    var roleArn: js.UndefOr[RoleArn]
  }

  object CustomerManagedDatastoreS3StorageSummary {
    @inline
    def apply(
        bucket: js.UndefOr[BucketName] = js.undefined,
        keyPrefix: js.UndefOr[S3KeyPrefix] = js.undefined,
        roleArn: js.UndefOr[RoleArn] = js.undefined
    ): CustomerManagedDatastoreS3StorageSummary = {
      val __obj = js.Dynamic.literal()
      bucket.foreach(__v => __obj.updateDynamic("bucket")(__v.asInstanceOf[js.Any]))
      keyPrefix.foreach(__v => __obj.updateDynamic("keyPrefix")(__v.asInstanceOf[js.Any]))
      roleArn.foreach(__v => __obj.updateDynamic("roleArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CustomerManagedDatastoreS3StorageSummary]
    }
  }

  /**
    * Information about a data set.
    */
  @js.native
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

  object Dataset {
    @inline
    def apply(
        actions: js.UndefOr[DatasetActions] = js.undefined,
        arn: js.UndefOr[DatasetArn] = js.undefined,
        contentDeliveryRules: js.UndefOr[DatasetContentDeliveryRules] = js.undefined,
        creationTime: js.UndefOr[Timestamp] = js.undefined,
        lastUpdateTime: js.UndefOr[Timestamp] = js.undefined,
        name: js.UndefOr[DatasetName] = js.undefined,
        retentionPeriod: js.UndefOr[RetentionPeriod] = js.undefined,
        status: js.UndefOr[DatasetStatus] = js.undefined,
        triggers: js.UndefOr[DatasetTriggers] = js.undefined,
        versioningConfiguration: js.UndefOr[VersioningConfiguration] = js.undefined
    ): Dataset = {
      val __obj = js.Dynamic.literal()
      actions.foreach(__v => __obj.updateDynamic("actions")(__v.asInstanceOf[js.Any]))
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      contentDeliveryRules.foreach(__v => __obj.updateDynamic("contentDeliveryRules")(__v.asInstanceOf[js.Any]))
      creationTime.foreach(__v => __obj.updateDynamic("creationTime")(__v.asInstanceOf[js.Any]))
      lastUpdateTime.foreach(__v => __obj.updateDynamic("lastUpdateTime")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      retentionPeriod.foreach(__v => __obj.updateDynamic("retentionPeriod")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      triggers.foreach(__v => __obj.updateDynamic("triggers")(__v.asInstanceOf[js.Any]))
      versioningConfiguration.foreach(__v => __obj.updateDynamic("versioningConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Dataset]
    }
  }

  /**
    * A "DatasetAction" object that specifies how data set contents are automatically created.
    */
  @js.native
  trait DatasetAction extends js.Object {
    var actionName: js.UndefOr[DatasetActionName]
    var containerAction: js.UndefOr[ContainerDatasetAction]
    var queryAction: js.UndefOr[SqlQueryDatasetAction]
  }

  object DatasetAction {
    @inline
    def apply(
        actionName: js.UndefOr[DatasetActionName] = js.undefined,
        containerAction: js.UndefOr[ContainerDatasetAction] = js.undefined,
        queryAction: js.UndefOr[SqlQueryDatasetAction] = js.undefined
    ): DatasetAction = {
      val __obj = js.Dynamic.literal()
      actionName.foreach(__v => __obj.updateDynamic("actionName")(__v.asInstanceOf[js.Any]))
      containerAction.foreach(__v => __obj.updateDynamic("containerAction")(__v.asInstanceOf[js.Any]))
      queryAction.foreach(__v => __obj.updateDynamic("queryAction")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DatasetAction]
    }
  }

  /**
    * Information about the action which automatically creates the data set's contents.
    */
  @js.native
  trait DatasetActionSummary extends js.Object {
    var actionName: js.UndefOr[DatasetActionName]
    var actionType: js.UndefOr[DatasetActionType]
  }

  object DatasetActionSummary {
    @inline
    def apply(
        actionName: js.UndefOr[DatasetActionName] = js.undefined,
        actionType: js.UndefOr[DatasetActionType] = js.undefined
    ): DatasetActionSummary = {
      val __obj = js.Dynamic.literal()
      actionName.foreach(__v => __obj.updateDynamic("actionName")(__v.asInstanceOf[js.Any]))
      actionType.foreach(__v => __obj.updateDynamic("actionType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DatasetActionSummary]
    }
  }

  object DatasetActionTypeEnum {
    val QUERY     = "QUERY"
    val CONTAINER = "CONTAINER"

    val values = js.Object.freeze(js.Array(QUERY, CONTAINER))
  }

  /**
    * The destination to which data set contents are delivered.
    */
  @js.native
  trait DatasetContentDeliveryDestination extends js.Object {
    var iotEventsDestinationConfiguration: js.UndefOr[IotEventsDestinationConfiguration]
    var s3DestinationConfiguration: js.UndefOr[S3DestinationConfiguration]
  }

  object DatasetContentDeliveryDestination {
    @inline
    def apply(
        iotEventsDestinationConfiguration: js.UndefOr[IotEventsDestinationConfiguration] = js.undefined,
        s3DestinationConfiguration: js.UndefOr[S3DestinationConfiguration] = js.undefined
    ): DatasetContentDeliveryDestination = {
      val __obj = js.Dynamic.literal()
      iotEventsDestinationConfiguration.foreach(
        __v => __obj.updateDynamic("iotEventsDestinationConfiguration")(__v.asInstanceOf[js.Any])
      )
      s3DestinationConfiguration.foreach(
        __v => __obj.updateDynamic("s3DestinationConfiguration")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[DatasetContentDeliveryDestination]
    }
  }

  /**
    * When data set contents are created they are delivered to destination specified here.
    */
  @js.native
  trait DatasetContentDeliveryRule extends js.Object {
    var destination: DatasetContentDeliveryDestination
    var entryName: js.UndefOr[EntryName]
  }

  object DatasetContentDeliveryRule {
    @inline
    def apply(
        destination: DatasetContentDeliveryDestination,
        entryName: js.UndefOr[EntryName] = js.undefined
    ): DatasetContentDeliveryRule = {
      val __obj = js.Dynamic.literal(
        "destination" -> destination.asInstanceOf[js.Any]
      )

      entryName.foreach(__v => __obj.updateDynamic("entryName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DatasetContentDeliveryRule]
    }
  }

  object DatasetContentStateEnum {
    val CREATING  = "CREATING"
    val SUCCEEDED = "SUCCEEDED"
    val FAILED    = "FAILED"

    val values = js.Object.freeze(js.Array(CREATING, SUCCEEDED, FAILED))
  }

  /**
    * The state of the data set contents and the reason they are in this state.
    */
  @js.native
  trait DatasetContentStatus extends js.Object {
    var reason: js.UndefOr[Reason]
    var state: js.UndefOr[DatasetContentState]
  }

  object DatasetContentStatus {
    @inline
    def apply(
        reason: js.UndefOr[Reason] = js.undefined,
        state: js.UndefOr[DatasetContentState] = js.undefined
    ): DatasetContentStatus = {
      val __obj = js.Dynamic.literal()
      reason.foreach(__v => __obj.updateDynamic("reason")(__v.asInstanceOf[js.Any]))
      state.foreach(__v => __obj.updateDynamic("state")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DatasetContentStatus]
    }
  }

  /**
    * Summary information about data set contents.
    */
  @js.native
  trait DatasetContentSummary extends js.Object {
    var completionTime: js.UndefOr[Timestamp]
    var creationTime: js.UndefOr[Timestamp]
    var scheduleTime: js.UndefOr[Timestamp]
    var status: js.UndefOr[DatasetContentStatus]
    var version: js.UndefOr[DatasetContentVersion]
  }

  object DatasetContentSummary {
    @inline
    def apply(
        completionTime: js.UndefOr[Timestamp] = js.undefined,
        creationTime: js.UndefOr[Timestamp] = js.undefined,
        scheduleTime: js.UndefOr[Timestamp] = js.undefined,
        status: js.UndefOr[DatasetContentStatus] = js.undefined,
        version: js.UndefOr[DatasetContentVersion] = js.undefined
    ): DatasetContentSummary = {
      val __obj = js.Dynamic.literal()
      completionTime.foreach(__v => __obj.updateDynamic("completionTime")(__v.asInstanceOf[js.Any]))
      creationTime.foreach(__v => __obj.updateDynamic("creationTime")(__v.asInstanceOf[js.Any]))
      scheduleTime.foreach(__v => __obj.updateDynamic("scheduleTime")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      version.foreach(__v => __obj.updateDynamic("version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DatasetContentSummary]
    }
  }

  /**
    * The data set whose latest contents are used as input to the notebook or application.
    */
  @js.native
  trait DatasetContentVersionValue extends js.Object {
    var datasetName: DatasetName
  }

  object DatasetContentVersionValue {
    @inline
    def apply(
        datasetName: DatasetName
    ): DatasetContentVersionValue = {
      val __obj = js.Dynamic.literal(
        "datasetName" -> datasetName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DatasetContentVersionValue]
    }
  }

  /**
    * The reference to a data set entry.
    */
  @js.native
  trait DatasetEntry extends js.Object {
    var dataURI: js.UndefOr[PresignedURI]
    var entryName: js.UndefOr[EntryName]
  }

  object DatasetEntry {
    @inline
    def apply(
        dataURI: js.UndefOr[PresignedURI] = js.undefined,
        entryName: js.UndefOr[EntryName] = js.undefined
    ): DatasetEntry = {
      val __obj = js.Dynamic.literal()
      dataURI.foreach(__v => __obj.updateDynamic("dataURI")(__v.asInstanceOf[js.Any]))
      entryName.foreach(__v => __obj.updateDynamic("entryName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DatasetEntry]
    }
  }

  object DatasetStatusEnum {
    val CREATING = "CREATING"
    val ACTIVE   = "ACTIVE"
    val DELETING = "DELETING"

    val values = js.Object.freeze(js.Array(CREATING, ACTIVE, DELETING))
  }

  /**
    * A summary of information about a data set.
    */
  @js.native
  trait DatasetSummary extends js.Object {
    var actions: js.UndefOr[DatasetActionSummaries]
    var creationTime: js.UndefOr[Timestamp]
    var datasetName: js.UndefOr[DatasetName]
    var lastUpdateTime: js.UndefOr[Timestamp]
    var status: js.UndefOr[DatasetStatus]
    var triggers: js.UndefOr[DatasetTriggers]
  }

  object DatasetSummary {
    @inline
    def apply(
        actions: js.UndefOr[DatasetActionSummaries] = js.undefined,
        creationTime: js.UndefOr[Timestamp] = js.undefined,
        datasetName: js.UndefOr[DatasetName] = js.undefined,
        lastUpdateTime: js.UndefOr[Timestamp] = js.undefined,
        status: js.UndefOr[DatasetStatus] = js.undefined,
        triggers: js.UndefOr[DatasetTriggers] = js.undefined
    ): DatasetSummary = {
      val __obj = js.Dynamic.literal()
      actions.foreach(__v => __obj.updateDynamic("actions")(__v.asInstanceOf[js.Any]))
      creationTime.foreach(__v => __obj.updateDynamic("creationTime")(__v.asInstanceOf[js.Any]))
      datasetName.foreach(__v => __obj.updateDynamic("datasetName")(__v.asInstanceOf[js.Any]))
      lastUpdateTime.foreach(__v => __obj.updateDynamic("lastUpdateTime")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      triggers.foreach(__v => __obj.updateDynamic("triggers")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DatasetSummary]
    }
  }

  /**
    * The "DatasetTrigger" that specifies when the data set is automatically updated.
    */
  @js.native
  trait DatasetTrigger extends js.Object {
    var dataset: js.UndefOr[TriggeringDataset]
    var schedule: js.UndefOr[Schedule]
  }

  object DatasetTrigger {
    @inline
    def apply(
        dataset: js.UndefOr[TriggeringDataset] = js.undefined,
        schedule: js.UndefOr[Schedule] = js.undefined
    ): DatasetTrigger = {
      val __obj = js.Dynamic.literal()
      dataset.foreach(__v => __obj.updateDynamic("dataset")(__v.asInstanceOf[js.Any]))
      schedule.foreach(__v => __obj.updateDynamic("schedule")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DatasetTrigger]
    }
  }

  /**
    * Information about a data store.
    */
  @js.native
  trait Datastore extends js.Object {
    var arn: js.UndefOr[DatastoreArn]
    var creationTime: js.UndefOr[Timestamp]
    var lastUpdateTime: js.UndefOr[Timestamp]
    var name: js.UndefOr[DatastoreName]
    var retentionPeriod: js.UndefOr[RetentionPeriod]
    var status: js.UndefOr[DatastoreStatus]
    var storage: js.UndefOr[DatastoreStorage]
  }

  object Datastore {
    @inline
    def apply(
        arn: js.UndefOr[DatastoreArn] = js.undefined,
        creationTime: js.UndefOr[Timestamp] = js.undefined,
        lastUpdateTime: js.UndefOr[Timestamp] = js.undefined,
        name: js.UndefOr[DatastoreName] = js.undefined,
        retentionPeriod: js.UndefOr[RetentionPeriod] = js.undefined,
        status: js.UndefOr[DatastoreStatus] = js.undefined,
        storage: js.UndefOr[DatastoreStorage] = js.undefined
    ): Datastore = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      creationTime.foreach(__v => __obj.updateDynamic("creationTime")(__v.asInstanceOf[js.Any]))
      lastUpdateTime.foreach(__v => __obj.updateDynamic("lastUpdateTime")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      retentionPeriod.foreach(__v => __obj.updateDynamic("retentionPeriod")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      storage.foreach(__v => __obj.updateDynamic("storage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Datastore]
    }
  }

  /**
    * The 'datastore' activity that specifies where to store the processed data.
    */
  @js.native
  trait DatastoreActivity extends js.Object {
    var datastoreName: DatastoreName
    var name: ActivityName
  }

  object DatastoreActivity {
    @inline
    def apply(
        datastoreName: DatastoreName,
        name: ActivityName
    ): DatastoreActivity = {
      val __obj = js.Dynamic.literal(
        "datastoreName" -> datastoreName.asInstanceOf[js.Any],
        "name"          -> name.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DatastoreActivity]
    }
  }

  /**
    * Statistical information about the data store.
    */
  @js.native
  trait DatastoreStatistics extends js.Object {
    var size: js.UndefOr[EstimatedResourceSize]
  }

  object DatastoreStatistics {
    @inline
    def apply(
        size: js.UndefOr[EstimatedResourceSize] = js.undefined
    ): DatastoreStatistics = {
      val __obj = js.Dynamic.literal()
      size.foreach(__v => __obj.updateDynamic("size")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DatastoreStatistics]
    }
  }

  object DatastoreStatusEnum {
    val CREATING = "CREATING"
    val ACTIVE   = "ACTIVE"
    val DELETING = "DELETING"

    val values = js.Object.freeze(js.Array(CREATING, ACTIVE, DELETING))
  }

  /**
    * Where data store data is stored. You may choose one of "serviceManagedS3" or "customerManagedS3" storage. If not specified, the default is "serviceManagedS3". This cannot be changed after the data store is created.
    */
  @js.native
  trait DatastoreStorage extends js.Object {
    var customerManagedS3: js.UndefOr[CustomerManagedDatastoreS3Storage]
    var serviceManagedS3: js.UndefOr[ServiceManagedDatastoreS3Storage]
  }

  object DatastoreStorage {
    @inline
    def apply(
        customerManagedS3: js.UndefOr[CustomerManagedDatastoreS3Storage] = js.undefined,
        serviceManagedS3: js.UndefOr[ServiceManagedDatastoreS3Storage] = js.undefined
    ): DatastoreStorage = {
      val __obj = js.Dynamic.literal()
      customerManagedS3.foreach(__v => __obj.updateDynamic("customerManagedS3")(__v.asInstanceOf[js.Any]))
      serviceManagedS3.foreach(__v => __obj.updateDynamic("serviceManagedS3")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DatastoreStorage]
    }
  }

  /**
    * Where data store data is stored.
    */
  @js.native
  trait DatastoreStorageSummary extends js.Object {
    var customerManagedS3: js.UndefOr[CustomerManagedDatastoreS3StorageSummary]
    var serviceManagedS3: js.UndefOr[ServiceManagedDatastoreS3StorageSummary]
  }

  object DatastoreStorageSummary {
    @inline
    def apply(
        customerManagedS3: js.UndefOr[CustomerManagedDatastoreS3StorageSummary] = js.undefined,
        serviceManagedS3: js.UndefOr[ServiceManagedDatastoreS3StorageSummary] = js.undefined
    ): DatastoreStorageSummary = {
      val __obj = js.Dynamic.literal()
      customerManagedS3.foreach(__v => __obj.updateDynamic("customerManagedS3")(__v.asInstanceOf[js.Any]))
      serviceManagedS3.foreach(__v => __obj.updateDynamic("serviceManagedS3")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DatastoreStorageSummary]
    }
  }

  /**
    * A summary of information about a data store.
    */
  @js.native
  trait DatastoreSummary extends js.Object {
    var creationTime: js.UndefOr[Timestamp]
    var datastoreName: js.UndefOr[DatastoreName]
    var datastoreStorage: js.UndefOr[DatastoreStorageSummary]
    var lastUpdateTime: js.UndefOr[Timestamp]
    var status: js.UndefOr[DatastoreStatus]
  }

  object DatastoreSummary {
    @inline
    def apply(
        creationTime: js.UndefOr[Timestamp] = js.undefined,
        datastoreName: js.UndefOr[DatastoreName] = js.undefined,
        datastoreStorage: js.UndefOr[DatastoreStorageSummary] = js.undefined,
        lastUpdateTime: js.UndefOr[Timestamp] = js.undefined,
        status: js.UndefOr[DatastoreStatus] = js.undefined
    ): DatastoreSummary = {
      val __obj = js.Dynamic.literal()
      creationTime.foreach(__v => __obj.updateDynamic("creationTime")(__v.asInstanceOf[js.Any]))
      datastoreName.foreach(__v => __obj.updateDynamic("datastoreName")(__v.asInstanceOf[js.Any]))
      datastoreStorage.foreach(__v => __obj.updateDynamic("datastoreStorage")(__v.asInstanceOf[js.Any]))
      lastUpdateTime.foreach(__v => __obj.updateDynamic("lastUpdateTime")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DatastoreSummary]
    }
  }

  @js.native
  trait DeleteChannelRequest extends js.Object {
    var channelName: ChannelName
  }

  object DeleteChannelRequest {
    @inline
    def apply(
        channelName: ChannelName
    ): DeleteChannelRequest = {
      val __obj = js.Dynamic.literal(
        "channelName" -> channelName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteChannelRequest]
    }
  }

  @js.native
  trait DeleteDatasetContentRequest extends js.Object {
    var datasetName: DatasetName
    var versionId: js.UndefOr[DatasetContentVersion]
  }

  object DeleteDatasetContentRequest {
    @inline
    def apply(
        datasetName: DatasetName,
        versionId: js.UndefOr[DatasetContentVersion] = js.undefined
    ): DeleteDatasetContentRequest = {
      val __obj = js.Dynamic.literal(
        "datasetName" -> datasetName.asInstanceOf[js.Any]
      )

      versionId.foreach(__v => __obj.updateDynamic("versionId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteDatasetContentRequest]
    }
  }

  @js.native
  trait DeleteDatasetRequest extends js.Object {
    var datasetName: DatasetName
  }

  object DeleteDatasetRequest {
    @inline
    def apply(
        datasetName: DatasetName
    ): DeleteDatasetRequest = {
      val __obj = js.Dynamic.literal(
        "datasetName" -> datasetName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteDatasetRequest]
    }
  }

  @js.native
  trait DeleteDatastoreRequest extends js.Object {
    var datastoreName: DatastoreName
  }

  object DeleteDatastoreRequest {
    @inline
    def apply(
        datastoreName: DatastoreName
    ): DeleteDatastoreRequest = {
      val __obj = js.Dynamic.literal(
        "datastoreName" -> datastoreName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteDatastoreRequest]
    }
  }

  @js.native
  trait DeletePipelineRequest extends js.Object {
    var pipelineName: PipelineName
  }

  object DeletePipelineRequest {
    @inline
    def apply(
        pipelineName: PipelineName
    ): DeletePipelineRequest = {
      val __obj = js.Dynamic.literal(
        "pipelineName" -> pipelineName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeletePipelineRequest]
    }
  }

  /**
    * Used to limit data to that which has arrived since the last execution of the action.
    */
  @js.native
  trait DeltaTime extends js.Object {
    var offsetSeconds: OffsetSeconds
    var timeExpression: TimeExpression
  }

  object DeltaTime {
    @inline
    def apply(
        offsetSeconds: OffsetSeconds,
        timeExpression: TimeExpression
    ): DeltaTime = {
      val __obj = js.Dynamic.literal(
        "offsetSeconds"  -> offsetSeconds.asInstanceOf[js.Any],
        "timeExpression" -> timeExpression.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeltaTime]
    }
  }

  @js.native
  trait DescribeChannelRequest extends js.Object {
    var channelName: ChannelName
    var includeStatistics: js.UndefOr[IncludeStatisticsFlag]
  }

  object DescribeChannelRequest {
    @inline
    def apply(
        channelName: ChannelName,
        includeStatistics: js.UndefOr[IncludeStatisticsFlag] = js.undefined
    ): DescribeChannelRequest = {
      val __obj = js.Dynamic.literal(
        "channelName" -> channelName.asInstanceOf[js.Any]
      )

      includeStatistics.foreach(__v => __obj.updateDynamic("includeStatistics")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeChannelRequest]
    }
  }

  @js.native
  trait DescribeChannelResponse extends js.Object {
    var channel: js.UndefOr[Channel]
    var statistics: js.UndefOr[ChannelStatistics]
  }

  object DescribeChannelResponse {
    @inline
    def apply(
        channel: js.UndefOr[Channel] = js.undefined,
        statistics: js.UndefOr[ChannelStatistics] = js.undefined
    ): DescribeChannelResponse = {
      val __obj = js.Dynamic.literal()
      channel.foreach(__v => __obj.updateDynamic("channel")(__v.asInstanceOf[js.Any]))
      statistics.foreach(__v => __obj.updateDynamic("statistics")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeChannelResponse]
    }
  }

  @js.native
  trait DescribeDatasetRequest extends js.Object {
    var datasetName: DatasetName
  }

  object DescribeDatasetRequest {
    @inline
    def apply(
        datasetName: DatasetName
    ): DescribeDatasetRequest = {
      val __obj = js.Dynamic.literal(
        "datasetName" -> datasetName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeDatasetRequest]
    }
  }

  @js.native
  trait DescribeDatasetResponse extends js.Object {
    var dataset: js.UndefOr[Dataset]
  }

  object DescribeDatasetResponse {
    @inline
    def apply(
        dataset: js.UndefOr[Dataset] = js.undefined
    ): DescribeDatasetResponse = {
      val __obj = js.Dynamic.literal()
      dataset.foreach(__v => __obj.updateDynamic("dataset")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeDatasetResponse]
    }
  }

  @js.native
  trait DescribeDatastoreRequest extends js.Object {
    var datastoreName: DatastoreName
    var includeStatistics: js.UndefOr[IncludeStatisticsFlag]
  }

  object DescribeDatastoreRequest {
    @inline
    def apply(
        datastoreName: DatastoreName,
        includeStatistics: js.UndefOr[IncludeStatisticsFlag] = js.undefined
    ): DescribeDatastoreRequest = {
      val __obj = js.Dynamic.literal(
        "datastoreName" -> datastoreName.asInstanceOf[js.Any]
      )

      includeStatistics.foreach(__v => __obj.updateDynamic("includeStatistics")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeDatastoreRequest]
    }
  }

  @js.native
  trait DescribeDatastoreResponse extends js.Object {
    var datastore: js.UndefOr[Datastore]
    var statistics: js.UndefOr[DatastoreStatistics]
  }

  object DescribeDatastoreResponse {
    @inline
    def apply(
        datastore: js.UndefOr[Datastore] = js.undefined,
        statistics: js.UndefOr[DatastoreStatistics] = js.undefined
    ): DescribeDatastoreResponse = {
      val __obj = js.Dynamic.literal()
      datastore.foreach(__v => __obj.updateDynamic("datastore")(__v.asInstanceOf[js.Any]))
      statistics.foreach(__v => __obj.updateDynamic("statistics")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeDatastoreResponse]
    }
  }

  @js.native
  trait DescribeLoggingOptionsRequest extends js.Object {}

  object DescribeLoggingOptionsRequest {
    @inline
    def apply(
        ): DescribeLoggingOptionsRequest = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DescribeLoggingOptionsRequest]
    }
  }

  @js.native
  trait DescribeLoggingOptionsResponse extends js.Object {
    var loggingOptions: js.UndefOr[LoggingOptions]
  }

  object DescribeLoggingOptionsResponse {
    @inline
    def apply(
        loggingOptions: js.UndefOr[LoggingOptions] = js.undefined
    ): DescribeLoggingOptionsResponse = {
      val __obj = js.Dynamic.literal()
      loggingOptions.foreach(__v => __obj.updateDynamic("loggingOptions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeLoggingOptionsResponse]
    }
  }

  @js.native
  trait DescribePipelineRequest extends js.Object {
    var pipelineName: PipelineName
  }

  object DescribePipelineRequest {
    @inline
    def apply(
        pipelineName: PipelineName
    ): DescribePipelineRequest = {
      val __obj = js.Dynamic.literal(
        "pipelineName" -> pipelineName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribePipelineRequest]
    }
  }

  @js.native
  trait DescribePipelineResponse extends js.Object {
    var pipeline: js.UndefOr[Pipeline]
  }

  object DescribePipelineResponse {
    @inline
    def apply(
        pipeline: js.UndefOr[Pipeline] = js.undefined
    ): DescribePipelineResponse = {
      val __obj = js.Dynamic.literal()
      pipeline.foreach(__v => __obj.updateDynamic("pipeline")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribePipelineResponse]
    }
  }

  /**
    * An activity that adds data from the AWS IoT device registry to your message.
    */
  @js.native
  trait DeviceRegistryEnrichActivity extends js.Object {
    var attribute: AttributeName
    var name: ActivityName
    var roleArn: RoleArn
    var thingName: AttributeName
    var next: js.UndefOr[ActivityName]
  }

  object DeviceRegistryEnrichActivity {
    @inline
    def apply(
        attribute: AttributeName,
        name: ActivityName,
        roleArn: RoleArn,
        thingName: AttributeName,
        next: js.UndefOr[ActivityName] = js.undefined
    ): DeviceRegistryEnrichActivity = {
      val __obj = js.Dynamic.literal(
        "attribute" -> attribute.asInstanceOf[js.Any],
        "name"      -> name.asInstanceOf[js.Any],
        "roleArn"   -> roleArn.asInstanceOf[js.Any],
        "thingName" -> thingName.asInstanceOf[js.Any]
      )

      next.foreach(__v => __obj.updateDynamic("next")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeviceRegistryEnrichActivity]
    }
  }

  /**
    * An activity that adds information from the AWS IoT Device Shadows service to a message.
    */
  @js.native
  trait DeviceShadowEnrichActivity extends js.Object {
    var attribute: AttributeName
    var name: ActivityName
    var roleArn: RoleArn
    var thingName: AttributeName
    var next: js.UndefOr[ActivityName]
  }

  object DeviceShadowEnrichActivity {
    @inline
    def apply(
        attribute: AttributeName,
        name: ActivityName,
        roleArn: RoleArn,
        thingName: AttributeName,
        next: js.UndefOr[ActivityName] = js.undefined
    ): DeviceShadowEnrichActivity = {
      val __obj = js.Dynamic.literal(
        "attribute" -> attribute.asInstanceOf[js.Any],
        "name"      -> name.asInstanceOf[js.Any],
        "roleArn"   -> roleArn.asInstanceOf[js.Any],
        "thingName" -> thingName.asInstanceOf[js.Any]
      )

      next.foreach(__v => __obj.updateDynamic("next")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeviceShadowEnrichActivity]
    }
  }

  /**
    * The estimated size of the resource.
    */
  @js.native
  trait EstimatedResourceSize extends js.Object {
    var estimatedOn: js.UndefOr[Timestamp]
    var estimatedSizeInBytes: js.UndefOr[SizeInBytes]
  }

  object EstimatedResourceSize {
    @inline
    def apply(
        estimatedOn: js.UndefOr[Timestamp] = js.undefined,
        estimatedSizeInBytes: js.UndefOr[SizeInBytes] = js.undefined
    ): EstimatedResourceSize = {
      val __obj = js.Dynamic.literal()
      estimatedOn.foreach(__v => __obj.updateDynamic("estimatedOn")(__v.asInstanceOf[js.Any]))
      estimatedSizeInBytes.foreach(__v => __obj.updateDynamic("estimatedSizeInBytes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EstimatedResourceSize]
    }
  }

  /**
    * An activity that filters a message based on its attributes.
    */
  @js.native
  trait FilterActivity extends js.Object {
    var filter: FilterExpression
    var name: ActivityName
    var next: js.UndefOr[ActivityName]
  }

  object FilterActivity {
    @inline
    def apply(
        filter: FilterExpression,
        name: ActivityName,
        next: js.UndefOr[ActivityName] = js.undefined
    ): FilterActivity = {
      val __obj = js.Dynamic.literal(
        "filter" -> filter.asInstanceOf[js.Any],
        "name"   -> name.asInstanceOf[js.Any]
      )

      next.foreach(__v => __obj.updateDynamic("next")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FilterActivity]
    }
  }

  @js.native
  trait GetDatasetContentRequest extends js.Object {
    var datasetName: DatasetName
    var versionId: js.UndefOr[DatasetContentVersion]
  }

  object GetDatasetContentRequest {
    @inline
    def apply(
        datasetName: DatasetName,
        versionId: js.UndefOr[DatasetContentVersion] = js.undefined
    ): GetDatasetContentRequest = {
      val __obj = js.Dynamic.literal(
        "datasetName" -> datasetName.asInstanceOf[js.Any]
      )

      versionId.foreach(__v => __obj.updateDynamic("versionId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDatasetContentRequest]
    }
  }

  @js.native
  trait GetDatasetContentResponse extends js.Object {
    var entries: js.UndefOr[DatasetEntries]
    var status: js.UndefOr[DatasetContentStatus]
    var timestamp: js.UndefOr[Timestamp]
  }

  object GetDatasetContentResponse {
    @inline
    def apply(
        entries: js.UndefOr[DatasetEntries] = js.undefined,
        status: js.UndefOr[DatasetContentStatus] = js.undefined,
        timestamp: js.UndefOr[Timestamp] = js.undefined
    ): GetDatasetContentResponse = {
      val __obj = js.Dynamic.literal()
      entries.foreach(__v => __obj.updateDynamic("entries")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      timestamp.foreach(__v => __obj.updateDynamic("timestamp")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDatasetContentResponse]
    }
  }

  /**
    * Configuration information for coordination with the AWS Glue ETL (extract, transform and load) service.
    */
  @js.native
  trait GlueConfiguration extends js.Object {
    var databaseName: GlueDatabaseName
    var tableName: GlueTableName
  }

  object GlueConfiguration {
    @inline
    def apply(
        databaseName: GlueDatabaseName,
        tableName: GlueTableName
    ): GlueConfiguration = {
      val __obj = js.Dynamic.literal(
        "databaseName" -> databaseName.asInstanceOf[js.Any],
        "tableName"    -> tableName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GlueConfiguration]
    }
  }

  /**
    * Configuration information for delivery of data set contents to AWS IoT Events.
    */
  @js.native
  trait IotEventsDestinationConfiguration extends js.Object {
    var inputName: IotEventsInputName
    var roleArn: RoleArn
  }

  object IotEventsDestinationConfiguration {
    @inline
    def apply(
        inputName: IotEventsInputName,
        roleArn: RoleArn
    ): IotEventsDestinationConfiguration = {
      val __obj = js.Dynamic.literal(
        "inputName" -> inputName.asInstanceOf[js.Any],
        "roleArn"   -> roleArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[IotEventsDestinationConfiguration]
    }
  }

  /**
    * An activity that runs a Lambda function to modify the message.
    */
  @js.native
  trait LambdaActivity extends js.Object {
    var batchSize: ActivityBatchSize
    var lambdaName: LambdaName
    var name: ActivityName
    var next: js.UndefOr[ActivityName]
  }

  object LambdaActivity {
    @inline
    def apply(
        batchSize: ActivityBatchSize,
        lambdaName: LambdaName,
        name: ActivityName,
        next: js.UndefOr[ActivityName] = js.undefined
    ): LambdaActivity = {
      val __obj = js.Dynamic.literal(
        "batchSize"  -> batchSize.asInstanceOf[js.Any],
        "lambdaName" -> lambdaName.asInstanceOf[js.Any],
        "name"       -> name.asInstanceOf[js.Any]
      )

      next.foreach(__v => __obj.updateDynamic("next")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LambdaActivity]
    }
  }

  @js.native
  trait ListChannelsRequest extends js.Object {
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListChannelsRequest {
    @inline
    def apply(
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListChannelsRequest = {
      val __obj = js.Dynamic.literal()
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListChannelsRequest]
    }
  }

  @js.native
  trait ListChannelsResponse extends js.Object {
    var channelSummaries: js.UndefOr[ChannelSummaries]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListChannelsResponse {
    @inline
    def apply(
        channelSummaries: js.UndefOr[ChannelSummaries] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListChannelsResponse = {
      val __obj = js.Dynamic.literal()
      channelSummaries.foreach(__v => __obj.updateDynamic("channelSummaries")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListChannelsResponse]
    }
  }

  @js.native
  trait ListDatasetContentsRequest extends js.Object {
    var datasetName: DatasetName
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
    var scheduledBefore: js.UndefOr[Timestamp]
    var scheduledOnOrAfter: js.UndefOr[Timestamp]
  }

  object ListDatasetContentsRequest {
    @inline
    def apply(
        datasetName: DatasetName,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined,
        scheduledBefore: js.UndefOr[Timestamp] = js.undefined,
        scheduledOnOrAfter: js.UndefOr[Timestamp] = js.undefined
    ): ListDatasetContentsRequest = {
      val __obj = js.Dynamic.literal(
        "datasetName" -> datasetName.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      scheduledBefore.foreach(__v => __obj.updateDynamic("scheduledBefore")(__v.asInstanceOf[js.Any]))
      scheduledOnOrAfter.foreach(__v => __obj.updateDynamic("scheduledOnOrAfter")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDatasetContentsRequest]
    }
  }

  @js.native
  trait ListDatasetContentsResponse extends js.Object {
    var datasetContentSummaries: js.UndefOr[DatasetContentSummaries]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListDatasetContentsResponse {
    @inline
    def apply(
        datasetContentSummaries: js.UndefOr[DatasetContentSummaries] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListDatasetContentsResponse = {
      val __obj = js.Dynamic.literal()
      datasetContentSummaries.foreach(__v => __obj.updateDynamic("datasetContentSummaries")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDatasetContentsResponse]
    }
  }

  @js.native
  trait ListDatasetsRequest extends js.Object {
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListDatasetsRequest {
    @inline
    def apply(
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListDatasetsRequest = {
      val __obj = js.Dynamic.literal()
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDatasetsRequest]
    }
  }

  @js.native
  trait ListDatasetsResponse extends js.Object {
    var datasetSummaries: js.UndefOr[DatasetSummaries]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListDatasetsResponse {
    @inline
    def apply(
        datasetSummaries: js.UndefOr[DatasetSummaries] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListDatasetsResponse = {
      val __obj = js.Dynamic.literal()
      datasetSummaries.foreach(__v => __obj.updateDynamic("datasetSummaries")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDatasetsResponse]
    }
  }

  @js.native
  trait ListDatastoresRequest extends js.Object {
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListDatastoresRequest {
    @inline
    def apply(
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListDatastoresRequest = {
      val __obj = js.Dynamic.literal()
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDatastoresRequest]
    }
  }

  @js.native
  trait ListDatastoresResponse extends js.Object {
    var datastoreSummaries: js.UndefOr[DatastoreSummaries]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListDatastoresResponse {
    @inline
    def apply(
        datastoreSummaries: js.UndefOr[DatastoreSummaries] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListDatastoresResponse = {
      val __obj = js.Dynamic.literal()
      datastoreSummaries.foreach(__v => __obj.updateDynamic("datastoreSummaries")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDatastoresResponse]
    }
  }

  @js.native
  trait ListPipelinesRequest extends js.Object {
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListPipelinesRequest {
    @inline
    def apply(
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListPipelinesRequest = {
      val __obj = js.Dynamic.literal()
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPipelinesRequest]
    }
  }

  @js.native
  trait ListPipelinesResponse extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var pipelineSummaries: js.UndefOr[PipelineSummaries]
  }

  object ListPipelinesResponse {
    @inline
    def apply(
        nextToken: js.UndefOr[NextToken] = js.undefined,
        pipelineSummaries: js.UndefOr[PipelineSummaries] = js.undefined
    ): ListPipelinesResponse = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      pipelineSummaries.foreach(__v => __obj.updateDynamic("pipelineSummaries")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPipelinesResponse]
    }
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var resourceArn: ResourceArn
  }

  object ListTagsForResourceRequest {
    @inline
    def apply(
        resourceArn: ResourceArn
    ): ListTagsForResourceRequest = {
      val __obj = js.Dynamic.literal(
        "resourceArn" -> resourceArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ListTagsForResourceRequest]
    }
  }

  @js.native
  trait ListTagsForResourceResponse extends js.Object {
    var tags: js.UndefOr[TagList]
  }

  object ListTagsForResourceResponse {
    @inline
    def apply(
        tags: js.UndefOr[TagList] = js.undefined
    ): ListTagsForResourceResponse = {
      val __obj = js.Dynamic.literal()
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceResponse]
    }
  }

  object LoggingLevelEnum {
    val ERROR = "ERROR"

    val values = js.Object.freeze(js.Array(ERROR))
  }

  /**
    * Information about logging options.
    */
  @js.native
  trait LoggingOptions extends js.Object {
    var enabled: LoggingEnabled
    var level: LoggingLevel
    var roleArn: RoleArn
  }

  object LoggingOptions {
    @inline
    def apply(
        enabled: LoggingEnabled,
        level: LoggingLevel,
        roleArn: RoleArn
    ): LoggingOptions = {
      val __obj = js.Dynamic.literal(
        "enabled" -> enabled.asInstanceOf[js.Any],
        "level"   -> level.asInstanceOf[js.Any],
        "roleArn" -> roleArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[LoggingOptions]
    }
  }

  /**
    * An activity that computes an arithmetic expression using the message's attributes.
    */
  @js.native
  trait MathActivity extends js.Object {
    var attribute: AttributeName
    var math: MathExpression
    var name: ActivityName
    var next: js.UndefOr[ActivityName]
  }

  object MathActivity {
    @inline
    def apply(
        attribute: AttributeName,
        math: MathExpression,
        name: ActivityName,
        next: js.UndefOr[ActivityName] = js.undefined
    ): MathActivity = {
      val __obj = js.Dynamic.literal(
        "attribute" -> attribute.asInstanceOf[js.Any],
        "math"      -> math.asInstanceOf[js.Any],
        "name"      -> name.asInstanceOf[js.Any]
      )

      next.foreach(__v => __obj.updateDynamic("next")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MathActivity]
    }
  }

  /**
    * Information about a message.
    */
  @js.native
  trait Message extends js.Object {
    var messageId: MessageId
    var payload: MessagePayload
  }

  object Message {
    @inline
    def apply(
        messageId: MessageId,
        payload: MessagePayload
    ): Message = {
      val __obj = js.Dynamic.literal(
        "messageId" -> messageId.asInstanceOf[js.Any],
        "payload"   -> payload.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[Message]
    }
  }

  /**
    * The value of the variable as a structure that specifies an output file URI.
    */
  @js.native
  trait OutputFileUriValue extends js.Object {
    var fileName: OutputFileName
  }

  object OutputFileUriValue {
    @inline
    def apply(
        fileName: OutputFileName
    ): OutputFileUriValue = {
      val __obj = js.Dynamic.literal(
        "fileName" -> fileName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[OutputFileUriValue]
    }
  }

  /**
    * Contains information about a pipeline.
    */
  @js.native
  trait Pipeline extends js.Object {
    var activities: js.UndefOr[PipelineActivities]
    var arn: js.UndefOr[PipelineArn]
    var creationTime: js.UndefOr[Timestamp]
    var lastUpdateTime: js.UndefOr[Timestamp]
    var name: js.UndefOr[PipelineName]
    var reprocessingSummaries: js.UndefOr[ReprocessingSummaries]
  }

  object Pipeline {
    @inline
    def apply(
        activities: js.UndefOr[PipelineActivities] = js.undefined,
        arn: js.UndefOr[PipelineArn] = js.undefined,
        creationTime: js.UndefOr[Timestamp] = js.undefined,
        lastUpdateTime: js.UndefOr[Timestamp] = js.undefined,
        name: js.UndefOr[PipelineName] = js.undefined,
        reprocessingSummaries: js.UndefOr[ReprocessingSummaries] = js.undefined
    ): Pipeline = {
      val __obj = js.Dynamic.literal()
      activities.foreach(__v => __obj.updateDynamic("activities")(__v.asInstanceOf[js.Any]))
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      creationTime.foreach(__v => __obj.updateDynamic("creationTime")(__v.asInstanceOf[js.Any]))
      lastUpdateTime.foreach(__v => __obj.updateDynamic("lastUpdateTime")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      reprocessingSummaries.foreach(__v => __obj.updateDynamic("reprocessingSummaries")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Pipeline]
    }
  }

  /**
    * An activity that performs a transformation on a message.
    */
  @js.native
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

  object PipelineActivity {
    @inline
    def apply(
        addAttributes: js.UndefOr[AddAttributesActivity] = js.undefined,
        channel: js.UndefOr[ChannelActivity] = js.undefined,
        datastore: js.UndefOr[DatastoreActivity] = js.undefined,
        deviceRegistryEnrich: js.UndefOr[DeviceRegistryEnrichActivity] = js.undefined,
        deviceShadowEnrich: js.UndefOr[DeviceShadowEnrichActivity] = js.undefined,
        filter: js.UndefOr[FilterActivity] = js.undefined,
        lambda: js.UndefOr[LambdaActivity] = js.undefined,
        math: js.UndefOr[MathActivity] = js.undefined,
        removeAttributes: js.UndefOr[RemoveAttributesActivity] = js.undefined,
        selectAttributes: js.UndefOr[SelectAttributesActivity] = js.undefined
    ): PipelineActivity = {
      val __obj = js.Dynamic.literal()
      addAttributes.foreach(__v => __obj.updateDynamic("addAttributes")(__v.asInstanceOf[js.Any]))
      channel.foreach(__v => __obj.updateDynamic("channel")(__v.asInstanceOf[js.Any]))
      datastore.foreach(__v => __obj.updateDynamic("datastore")(__v.asInstanceOf[js.Any]))
      deviceRegistryEnrich.foreach(__v => __obj.updateDynamic("deviceRegistryEnrich")(__v.asInstanceOf[js.Any]))
      deviceShadowEnrich.foreach(__v => __obj.updateDynamic("deviceShadowEnrich")(__v.asInstanceOf[js.Any]))
      filter.foreach(__v => __obj.updateDynamic("filter")(__v.asInstanceOf[js.Any]))
      lambda.foreach(__v => __obj.updateDynamic("lambda")(__v.asInstanceOf[js.Any]))
      math.foreach(__v => __obj.updateDynamic("math")(__v.asInstanceOf[js.Any]))
      removeAttributes.foreach(__v => __obj.updateDynamic("removeAttributes")(__v.asInstanceOf[js.Any]))
      selectAttributes.foreach(__v => __obj.updateDynamic("selectAttributes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PipelineActivity]
    }
  }

  /**
    * A summary of information about a pipeline.
    */
  @js.native
  trait PipelineSummary extends js.Object {
    var creationTime: js.UndefOr[Timestamp]
    var lastUpdateTime: js.UndefOr[Timestamp]
    var pipelineName: js.UndefOr[PipelineName]
    var reprocessingSummaries: js.UndefOr[ReprocessingSummaries]
  }

  object PipelineSummary {
    @inline
    def apply(
        creationTime: js.UndefOr[Timestamp] = js.undefined,
        lastUpdateTime: js.UndefOr[Timestamp] = js.undefined,
        pipelineName: js.UndefOr[PipelineName] = js.undefined,
        reprocessingSummaries: js.UndefOr[ReprocessingSummaries] = js.undefined
    ): PipelineSummary = {
      val __obj = js.Dynamic.literal()
      creationTime.foreach(__v => __obj.updateDynamic("creationTime")(__v.asInstanceOf[js.Any]))
      lastUpdateTime.foreach(__v => __obj.updateDynamic("lastUpdateTime")(__v.asInstanceOf[js.Any]))
      pipelineName.foreach(__v => __obj.updateDynamic("pipelineName")(__v.asInstanceOf[js.Any]))
      reprocessingSummaries.foreach(__v => __obj.updateDynamic("reprocessingSummaries")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PipelineSummary]
    }
  }

  @js.native
  trait PutLoggingOptionsRequest extends js.Object {
    var loggingOptions: LoggingOptions
  }

  object PutLoggingOptionsRequest {
    @inline
    def apply(
        loggingOptions: LoggingOptions
    ): PutLoggingOptionsRequest = {
      val __obj = js.Dynamic.literal(
        "loggingOptions" -> loggingOptions.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[PutLoggingOptionsRequest]
    }
  }

  /**
    * Information which is used to filter message data, to segregate it according to the time frame in which it arrives.
    */
  @js.native
  trait QueryFilter extends js.Object {
    var deltaTime: js.UndefOr[DeltaTime]
  }

  object QueryFilter {
    @inline
    def apply(
        deltaTime: js.UndefOr[DeltaTime] = js.undefined
    ): QueryFilter = {
      val __obj = js.Dynamic.literal()
      deltaTime.foreach(__v => __obj.updateDynamic("deltaTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[QueryFilter]
    }
  }

  /**
    * An activity that removes attributes from a message.
    */
  @js.native
  trait RemoveAttributesActivity extends js.Object {
    var attributes: AttributeNames
    var name: ActivityName
    var next: js.UndefOr[ActivityName]
  }

  object RemoveAttributesActivity {
    @inline
    def apply(
        attributes: AttributeNames,
        name: ActivityName,
        next: js.UndefOr[ActivityName] = js.undefined
    ): RemoveAttributesActivity = {
      val __obj = js.Dynamic.literal(
        "attributes" -> attributes.asInstanceOf[js.Any],
        "name"       -> name.asInstanceOf[js.Any]
      )

      next.foreach(__v => __obj.updateDynamic("next")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RemoveAttributesActivity]
    }
  }

  object ReprocessingStatusEnum {
    val RUNNING   = "RUNNING"
    val SUCCEEDED = "SUCCEEDED"
    val CANCELLED = "CANCELLED"
    val FAILED    = "FAILED"

    val values = js.Object.freeze(js.Array(RUNNING, SUCCEEDED, CANCELLED, FAILED))
  }

  /**
    * Information about pipeline reprocessing.
    */
  @js.native
  trait ReprocessingSummary extends js.Object {
    var creationTime: js.UndefOr[Timestamp]
    var id: js.UndefOr[ReprocessingId]
    var status: js.UndefOr[ReprocessingStatus]
  }

  object ReprocessingSummary {
    @inline
    def apply(
        creationTime: js.UndefOr[Timestamp] = js.undefined,
        id: js.UndefOr[ReprocessingId] = js.undefined,
        status: js.UndefOr[ReprocessingStatus] = js.undefined
    ): ReprocessingSummary = {
      val __obj = js.Dynamic.literal()
      creationTime.foreach(__v => __obj.updateDynamic("creationTime")(__v.asInstanceOf[js.Any]))
      id.foreach(__v => __obj.updateDynamic("id")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ReprocessingSummary]
    }
  }

  /**
    * The configuration of the resource used to execute the "containerAction".
    */
  @js.native
  trait ResourceConfiguration extends js.Object {
    var computeType: ComputeType
    var volumeSizeInGB: VolumeSizeInGB
  }

  object ResourceConfiguration {
    @inline
    def apply(
        computeType: ComputeType,
        volumeSizeInGB: VolumeSizeInGB
    ): ResourceConfiguration = {
      val __obj = js.Dynamic.literal(
        "computeType"    -> computeType.asInstanceOf[js.Any],
        "volumeSizeInGB" -> volumeSizeInGB.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ResourceConfiguration]
    }
  }

  /**
    * How long, in days, message data is kept.
    */
  @js.native
  trait RetentionPeriod extends js.Object {
    var numberOfDays: js.UndefOr[RetentionPeriodInDays]
    var unlimited: js.UndefOr[UnlimitedRetentionPeriod]
  }

  object RetentionPeriod {
    @inline
    def apply(
        numberOfDays: js.UndefOr[RetentionPeriodInDays] = js.undefined,
        unlimited: js.UndefOr[UnlimitedRetentionPeriod] = js.undefined
    ): RetentionPeriod = {
      val __obj = js.Dynamic.literal()
      numberOfDays.foreach(__v => __obj.updateDynamic("numberOfDays")(__v.asInstanceOf[js.Any]))
      unlimited.foreach(__v => __obj.updateDynamic("unlimited")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RetentionPeriod]
    }
  }

  @js.native
  trait RunPipelineActivityRequest extends js.Object {
    var payloads: MessagePayloads
    var pipelineActivity: PipelineActivity
  }

  object RunPipelineActivityRequest {
    @inline
    def apply(
        payloads: MessagePayloads,
        pipelineActivity: PipelineActivity
    ): RunPipelineActivityRequest = {
      val __obj = js.Dynamic.literal(
        "payloads"         -> payloads.asInstanceOf[js.Any],
        "pipelineActivity" -> pipelineActivity.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[RunPipelineActivityRequest]
    }
  }

  @js.native
  trait RunPipelineActivityResponse extends js.Object {
    var logResult: js.UndefOr[LogResult]
    var payloads: js.UndefOr[MessagePayloads]
  }

  object RunPipelineActivityResponse {
    @inline
    def apply(
        logResult: js.UndefOr[LogResult] = js.undefined,
        payloads: js.UndefOr[MessagePayloads] = js.undefined
    ): RunPipelineActivityResponse = {
      val __obj = js.Dynamic.literal()
      logResult.foreach(__v => __obj.updateDynamic("logResult")(__v.asInstanceOf[js.Any]))
      payloads.foreach(__v => __obj.updateDynamic("payloads")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RunPipelineActivityResponse]
    }
  }

  /**
    * Configuration information for delivery of data set contents to Amazon S3.
    */
  @js.native
  trait S3DestinationConfiguration extends js.Object {
    var bucket: BucketName
    var key: BucketKeyExpression
    var roleArn: RoleArn
    var glueConfiguration: js.UndefOr[GlueConfiguration]
  }

  object S3DestinationConfiguration {
    @inline
    def apply(
        bucket: BucketName,
        key: BucketKeyExpression,
        roleArn: RoleArn,
        glueConfiguration: js.UndefOr[GlueConfiguration] = js.undefined
    ): S3DestinationConfiguration = {
      val __obj = js.Dynamic.literal(
        "bucket"  -> bucket.asInstanceOf[js.Any],
        "key"     -> key.asInstanceOf[js.Any],
        "roleArn" -> roleArn.asInstanceOf[js.Any]
      )

      glueConfiguration.foreach(__v => __obj.updateDynamic("glueConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[S3DestinationConfiguration]
    }
  }

  @js.native
  trait SampleChannelDataRequest extends js.Object {
    var channelName: ChannelName
    var endTime: js.UndefOr[EndTime]
    var maxMessages: js.UndefOr[MaxMessages]
    var startTime: js.UndefOr[StartTime]
  }

  object SampleChannelDataRequest {
    @inline
    def apply(
        channelName: ChannelName,
        endTime: js.UndefOr[EndTime] = js.undefined,
        maxMessages: js.UndefOr[MaxMessages] = js.undefined,
        startTime: js.UndefOr[StartTime] = js.undefined
    ): SampleChannelDataRequest = {
      val __obj = js.Dynamic.literal(
        "channelName" -> channelName.asInstanceOf[js.Any]
      )

      endTime.foreach(__v => __obj.updateDynamic("endTime")(__v.asInstanceOf[js.Any]))
      maxMessages.foreach(__v => __obj.updateDynamic("maxMessages")(__v.asInstanceOf[js.Any]))
      startTime.foreach(__v => __obj.updateDynamic("startTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SampleChannelDataRequest]
    }
  }

  @js.native
  trait SampleChannelDataResponse extends js.Object {
    var payloads: js.UndefOr[MessagePayloads]
  }

  object SampleChannelDataResponse {
    @inline
    def apply(
        payloads: js.UndefOr[MessagePayloads] = js.undefined
    ): SampleChannelDataResponse = {
      val __obj = js.Dynamic.literal()
      payloads.foreach(__v => __obj.updateDynamic("payloads")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SampleChannelDataResponse]
    }
  }

  /**
    * The schedule for when to trigger an update.
    */
  @js.native
  trait Schedule extends js.Object {
    var expression: js.UndefOr[ScheduleExpression]
  }

  object Schedule {
    @inline
    def apply(
        expression: js.UndefOr[ScheduleExpression] = js.undefined
    ): Schedule = {
      val __obj = js.Dynamic.literal()
      expression.foreach(__v => __obj.updateDynamic("expression")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Schedule]
    }
  }

  /**
    * Creates a new message using only the specified attributes from the original message.
    */
  @js.native
  trait SelectAttributesActivity extends js.Object {
    var attributes: AttributeNames
    var name: ActivityName
    var next: js.UndefOr[ActivityName]
  }

  object SelectAttributesActivity {
    @inline
    def apply(
        attributes: AttributeNames,
        name: ActivityName,
        next: js.UndefOr[ActivityName] = js.undefined
    ): SelectAttributesActivity = {
      val __obj = js.Dynamic.literal(
        "attributes" -> attributes.asInstanceOf[js.Any],
        "name"       -> name.asInstanceOf[js.Any]
      )

      next.foreach(__v => __obj.updateDynamic("next")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SelectAttributesActivity]
    }
  }

  /**
    * Use this to store channel data in an S3 bucket managed by the AWS IoT Analytics service. The choice of service-managed or customer-managed S3 storage cannot be changed after creation of the channel.
    */
  @js.native
  trait ServiceManagedChannelS3Storage extends js.Object {}

  object ServiceManagedChannelS3Storage {
    @inline
    def apply(
        ): ServiceManagedChannelS3Storage = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[ServiceManagedChannelS3Storage]
    }
  }

  /**
    * Used to store channel data in an S3 bucket managed by the AWS IoT Analytics service.
    */
  @js.native
  trait ServiceManagedChannelS3StorageSummary extends js.Object {}

  object ServiceManagedChannelS3StorageSummary {
    @inline
    def apply(
        ): ServiceManagedChannelS3StorageSummary = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[ServiceManagedChannelS3StorageSummary]
    }
  }

  /**
    * Use this to store data store data in an S3 bucket managed by the AWS IoT Analytics service. The choice of service-managed or customer-managed S3 storage cannot be changed after creation of the data store.
    */
  @js.native
  trait ServiceManagedDatastoreS3Storage extends js.Object {}

  object ServiceManagedDatastoreS3Storage {
    @inline
    def apply(
        ): ServiceManagedDatastoreS3Storage = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[ServiceManagedDatastoreS3Storage]
    }
  }

  /**
    * Used to store data store data in an S3 bucket managed by the AWS IoT Analytics service.
    */
  @js.native
  trait ServiceManagedDatastoreS3StorageSummary extends js.Object {}

  object ServiceManagedDatastoreS3StorageSummary {
    @inline
    def apply(
        ): ServiceManagedDatastoreS3StorageSummary = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[ServiceManagedDatastoreS3StorageSummary]
    }
  }

  /**
    * The SQL query to modify the message.
    */
  @js.native
  trait SqlQueryDatasetAction extends js.Object {
    var sqlQuery: SqlQuery
    var filters: js.UndefOr[QueryFilters]
  }

  object SqlQueryDatasetAction {
    @inline
    def apply(
        sqlQuery: SqlQuery,
        filters: js.UndefOr[QueryFilters] = js.undefined
    ): SqlQueryDatasetAction = {
      val __obj = js.Dynamic.literal(
        "sqlQuery" -> sqlQuery.asInstanceOf[js.Any]
      )

      filters.foreach(__v => __obj.updateDynamic("filters")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SqlQueryDatasetAction]
    }
  }

  @js.native
  trait StartPipelineReprocessingRequest extends js.Object {
    var pipelineName: PipelineName
    var endTime: js.UndefOr[EndTime]
    var startTime: js.UndefOr[StartTime]
  }

  object StartPipelineReprocessingRequest {
    @inline
    def apply(
        pipelineName: PipelineName,
        endTime: js.UndefOr[EndTime] = js.undefined,
        startTime: js.UndefOr[StartTime] = js.undefined
    ): StartPipelineReprocessingRequest = {
      val __obj = js.Dynamic.literal(
        "pipelineName" -> pipelineName.asInstanceOf[js.Any]
      )

      endTime.foreach(__v => __obj.updateDynamic("endTime")(__v.asInstanceOf[js.Any]))
      startTime.foreach(__v => __obj.updateDynamic("startTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartPipelineReprocessingRequest]
    }
  }

  @js.native
  trait StartPipelineReprocessingResponse extends js.Object {
    var reprocessingId: js.UndefOr[ReprocessingId]
  }

  object StartPipelineReprocessingResponse {
    @inline
    def apply(
        reprocessingId: js.UndefOr[ReprocessingId] = js.undefined
    ): StartPipelineReprocessingResponse = {
      val __obj = js.Dynamic.literal()
      reprocessingId.foreach(__v => __obj.updateDynamic("reprocessingId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartPipelineReprocessingResponse]
    }
  }

  /**
    * A set of key/value pairs which are used to manage the resource.
    */
  @js.native
  trait Tag extends js.Object {
    var key: TagKey
    var value: TagValue
  }

  object Tag {
    @inline
    def apply(
        key: TagKey,
        value: TagValue
    ): Tag = {
      val __obj = js.Dynamic.literal(
        "key"   -> key.asInstanceOf[js.Any],
        "value" -> value.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[Tag]
    }
  }

  @js.native
  trait TagResourceRequest extends js.Object {
    var resourceArn: ResourceArn
    var tags: TagList
  }

  object TagResourceRequest {
    @inline
    def apply(
        resourceArn: ResourceArn,
        tags: TagList
    ): TagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "resourceArn" -> resourceArn.asInstanceOf[js.Any],
        "tags"        -> tags.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[TagResourceRequest]
    }
  }

  @js.native
  trait TagResourceResponse extends js.Object {}

  object TagResourceResponse {
    @inline
    def apply(
        ): TagResourceResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[TagResourceResponse]
    }
  }

  /**
    * Information about the data set whose content generation triggers the new data set content generation.
    */
  @js.native
  trait TriggeringDataset extends js.Object {
    var name: DatasetName
  }

  object TriggeringDataset {
    @inline
    def apply(
        name: DatasetName
    ): TriggeringDataset = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[TriggeringDataset]
    }
  }

  @js.native
  trait UntagResourceRequest extends js.Object {
    var resourceArn: ResourceArn
    var tagKeys: TagKeyList
  }

  object UntagResourceRequest {
    @inline
    def apply(
        resourceArn: ResourceArn,
        tagKeys: TagKeyList
    ): UntagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "resourceArn" -> resourceArn.asInstanceOf[js.Any],
        "tagKeys"     -> tagKeys.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UntagResourceRequest]
    }
  }

  @js.native
  trait UntagResourceResponse extends js.Object {}

  object UntagResourceResponse {
    @inline
    def apply(
        ): UntagResourceResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[UntagResourceResponse]
    }
  }

  @js.native
  trait UpdateChannelRequest extends js.Object {
    var channelName: ChannelName
    var channelStorage: js.UndefOr[ChannelStorage]
    var retentionPeriod: js.UndefOr[RetentionPeriod]
  }

  object UpdateChannelRequest {
    @inline
    def apply(
        channelName: ChannelName,
        channelStorage: js.UndefOr[ChannelStorage] = js.undefined,
        retentionPeriod: js.UndefOr[RetentionPeriod] = js.undefined
    ): UpdateChannelRequest = {
      val __obj = js.Dynamic.literal(
        "channelName" -> channelName.asInstanceOf[js.Any]
      )

      channelStorage.foreach(__v => __obj.updateDynamic("channelStorage")(__v.asInstanceOf[js.Any]))
      retentionPeriod.foreach(__v => __obj.updateDynamic("retentionPeriod")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateChannelRequest]
    }
  }

  @js.native
  trait UpdateDatasetRequest extends js.Object {
    var actions: DatasetActions
    var datasetName: DatasetName
    var contentDeliveryRules: js.UndefOr[DatasetContentDeliveryRules]
    var retentionPeriod: js.UndefOr[RetentionPeriod]
    var triggers: js.UndefOr[DatasetTriggers]
    var versioningConfiguration: js.UndefOr[VersioningConfiguration]
  }

  object UpdateDatasetRequest {
    @inline
    def apply(
        actions: DatasetActions,
        datasetName: DatasetName,
        contentDeliveryRules: js.UndefOr[DatasetContentDeliveryRules] = js.undefined,
        retentionPeriod: js.UndefOr[RetentionPeriod] = js.undefined,
        triggers: js.UndefOr[DatasetTriggers] = js.undefined,
        versioningConfiguration: js.UndefOr[VersioningConfiguration] = js.undefined
    ): UpdateDatasetRequest = {
      val __obj = js.Dynamic.literal(
        "actions"     -> actions.asInstanceOf[js.Any],
        "datasetName" -> datasetName.asInstanceOf[js.Any]
      )

      contentDeliveryRules.foreach(__v => __obj.updateDynamic("contentDeliveryRules")(__v.asInstanceOf[js.Any]))
      retentionPeriod.foreach(__v => __obj.updateDynamic("retentionPeriod")(__v.asInstanceOf[js.Any]))
      triggers.foreach(__v => __obj.updateDynamic("triggers")(__v.asInstanceOf[js.Any]))
      versioningConfiguration.foreach(__v => __obj.updateDynamic("versioningConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateDatasetRequest]
    }
  }

  @js.native
  trait UpdateDatastoreRequest extends js.Object {
    var datastoreName: DatastoreName
    var datastoreStorage: js.UndefOr[DatastoreStorage]
    var retentionPeriod: js.UndefOr[RetentionPeriod]
  }

  object UpdateDatastoreRequest {
    @inline
    def apply(
        datastoreName: DatastoreName,
        datastoreStorage: js.UndefOr[DatastoreStorage] = js.undefined,
        retentionPeriod: js.UndefOr[RetentionPeriod] = js.undefined
    ): UpdateDatastoreRequest = {
      val __obj = js.Dynamic.literal(
        "datastoreName" -> datastoreName.asInstanceOf[js.Any]
      )

      datastoreStorage.foreach(__v => __obj.updateDynamic("datastoreStorage")(__v.asInstanceOf[js.Any]))
      retentionPeriod.foreach(__v => __obj.updateDynamic("retentionPeriod")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateDatastoreRequest]
    }
  }

  @js.native
  trait UpdatePipelineRequest extends js.Object {
    var pipelineActivities: PipelineActivities
    var pipelineName: PipelineName
  }

  object UpdatePipelineRequest {
    @inline
    def apply(
        pipelineActivities: PipelineActivities,
        pipelineName: PipelineName
    ): UpdatePipelineRequest = {
      val __obj = js.Dynamic.literal(
        "pipelineActivities" -> pipelineActivities.asInstanceOf[js.Any],
        "pipelineName"       -> pipelineName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UpdatePipelineRequest]
    }
  }

  /**
    * An instance of a variable to be passed to the "containerAction" execution. Each variable must have a name and a value given by one of "stringValue", "datasetContentVersionValue", or "outputFileUriValue".
    */
  @js.native
  trait Variable extends js.Object {
    var name: VariableName
    var datasetContentVersionValue: js.UndefOr[DatasetContentVersionValue]
    var doubleValue: js.UndefOr[DoubleValue]
    var outputFileUriValue: js.UndefOr[OutputFileUriValue]
    var stringValue: js.UndefOr[StringValue]
  }

  object Variable {
    @inline
    def apply(
        name: VariableName,
        datasetContentVersionValue: js.UndefOr[DatasetContentVersionValue] = js.undefined,
        doubleValue: js.UndefOr[DoubleValue] = js.undefined,
        outputFileUriValue: js.UndefOr[OutputFileUriValue] = js.undefined,
        stringValue: js.UndefOr[StringValue] = js.undefined
    ): Variable = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any]
      )

      datasetContentVersionValue.foreach(
        __v => __obj.updateDynamic("datasetContentVersionValue")(__v.asInstanceOf[js.Any])
      )
      doubleValue.foreach(__v => __obj.updateDynamic("doubleValue")(__v.asInstanceOf[js.Any]))
      outputFileUriValue.foreach(__v => __obj.updateDynamic("outputFileUriValue")(__v.asInstanceOf[js.Any]))
      stringValue.foreach(__v => __obj.updateDynamic("stringValue")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Variable]
    }
  }

  /**
    * Information about the versioning of data set contents.
    */
  @js.native
  trait VersioningConfiguration extends js.Object {
    var maxVersions: js.UndefOr[MaxVersions]
    var unlimited: js.UndefOr[UnlimitedVersioning]
  }

  object VersioningConfiguration {
    @inline
    def apply(
        maxVersions: js.UndefOr[MaxVersions] = js.undefined,
        unlimited: js.UndefOr[UnlimitedVersioning] = js.undefined
    ): VersioningConfiguration = {
      val __obj = js.Dynamic.literal()
      maxVersions.foreach(__v => __obj.updateDynamic("maxVersions")(__v.asInstanceOf[js.Any]))
      unlimited.foreach(__v => __obj.updateDynamic("unlimited")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VersioningConfiguration]
    }
  }
}
