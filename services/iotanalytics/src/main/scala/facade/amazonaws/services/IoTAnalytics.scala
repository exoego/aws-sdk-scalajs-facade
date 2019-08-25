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

  implicit final class IoTAnalyticsOps(val service: IoTAnalytics) extends AnyVal {

    def batchPutMessageFuture(params: BatchPutMessageRequest): Future[BatchPutMessageResponse] =
      service.batchPutMessage(params).promise.toFuture
    def cancelPipelineReprocessingFuture(
        params: CancelPipelineReprocessingRequest
    ): Future[CancelPipelineReprocessingResponse] = service.cancelPipelineReprocessing(params).promise.toFuture
    def createChannelFuture(params: CreateChannelRequest): Future[CreateChannelResponse] =
      service.createChannel(params).promise.toFuture
    def createDatasetContentFuture(params: CreateDatasetContentRequest): Future[CreateDatasetContentResponse] =
      service.createDatasetContent(params).promise.toFuture
    def createDatasetFuture(params: CreateDatasetRequest): Future[CreateDatasetResponse] =
      service.createDataset(params).promise.toFuture
    def createDatastoreFuture(params: CreateDatastoreRequest): Future[CreateDatastoreResponse] =
      service.createDatastore(params).promise.toFuture
    def createPipelineFuture(params: CreatePipelineRequest): Future[CreatePipelineResponse] =
      service.createPipeline(params).promise.toFuture
    def deleteChannelFuture(params: DeleteChannelRequest): Future[js.Object] =
      service.deleteChannel(params).promise.toFuture
    def deleteDatasetContentFuture(params: DeleteDatasetContentRequest): Future[js.Object] =
      service.deleteDatasetContent(params).promise.toFuture
    def deleteDatasetFuture(params: DeleteDatasetRequest): Future[js.Object] =
      service.deleteDataset(params).promise.toFuture
    def deleteDatastoreFuture(params: DeleteDatastoreRequest): Future[js.Object] =
      service.deleteDatastore(params).promise.toFuture
    def deletePipelineFuture(params: DeletePipelineRequest): Future[js.Object] =
      service.deletePipeline(params).promise.toFuture
    def describeChannelFuture(params: DescribeChannelRequest): Future[DescribeChannelResponse] =
      service.describeChannel(params).promise.toFuture
    def describeDatasetFuture(params: DescribeDatasetRequest): Future[DescribeDatasetResponse] =
      service.describeDataset(params).promise.toFuture
    def describeDatastoreFuture(params: DescribeDatastoreRequest): Future[DescribeDatastoreResponse] =
      service.describeDatastore(params).promise.toFuture
    def describeLoggingOptionsFuture(params: DescribeLoggingOptionsRequest): Future[DescribeLoggingOptionsResponse] =
      service.describeLoggingOptions(params).promise.toFuture
    def describePipelineFuture(params: DescribePipelineRequest): Future[DescribePipelineResponse] =
      service.describePipeline(params).promise.toFuture
    def getDatasetContentFuture(params: GetDatasetContentRequest): Future[GetDatasetContentResponse] =
      service.getDatasetContent(params).promise.toFuture
    def listChannelsFuture(params: ListChannelsRequest): Future[ListChannelsResponse] =
      service.listChannels(params).promise.toFuture
    def listDatasetContentsFuture(params: ListDatasetContentsRequest): Future[ListDatasetContentsResponse] =
      service.listDatasetContents(params).promise.toFuture
    def listDatasetsFuture(params: ListDatasetsRequest): Future[ListDatasetsResponse] =
      service.listDatasets(params).promise.toFuture
    def listDatastoresFuture(params: ListDatastoresRequest): Future[ListDatastoresResponse] =
      service.listDatastores(params).promise.toFuture
    def listPipelinesFuture(params: ListPipelinesRequest): Future[ListPipelinesResponse] =
      service.listPipelines(params).promise.toFuture
    def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] =
      service.listTagsForResource(params).promise.toFuture
    def putLoggingOptionsFuture(params: PutLoggingOptionsRequest): Future[js.Object] =
      service.putLoggingOptions(params).promise.toFuture
    def runPipelineActivityFuture(params: RunPipelineActivityRequest): Future[RunPipelineActivityResponse] =
      service.runPipelineActivity(params).promise.toFuture
    def sampleChannelDataFuture(params: SampleChannelDataRequest): Future[SampleChannelDataResponse] =
      service.sampleChannelData(params).promise.toFuture
    def startPipelineReprocessingFuture(
        params: StartPipelineReprocessingRequest
    ): Future[StartPipelineReprocessingResponse] = service.startPipelineReprocessing(params).promise.toFuture
    def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] =
      service.tagResource(params).promise.toFuture
    def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] =
      service.untagResource(params).promise.toFuture
    def updateChannelFuture(params: UpdateChannelRequest): Future[js.Object] =
      service.updateChannel(params).promise.toFuture
    def updateDatasetFuture(params: UpdateDatasetRequest): Future[js.Object] =
      service.updateDataset(params).promise.toFuture
    def updateDatastoreFuture(params: UpdateDatastoreRequest): Future[js.Object] =
      service.updateDatastore(params).promise.toFuture
    def updatePipelineFuture(params: UpdatePipelineRequest): Future[js.Object] =
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
    def apply(
        attributes: AttributeNameMapping,
        name: ActivityName,
        next: js.UndefOr[ActivityName] = js.undefined
    ): AddAttributesActivity = {
      val __obj = js.Dictionary[js.Any](
        "attributes" -> attributes.asInstanceOf[js.Any],
        "name"       -> name.asInstanceOf[js.Any]
      )

      next.foreach(__v => __obj.update("next", __v.asInstanceOf[js.Any]))
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
    def apply(
        errorCode: js.UndefOr[ErrorCode] = js.undefined,
        errorMessage: js.UndefOr[ErrorMessage] = js.undefined,
        messageId: js.UndefOr[MessageId] = js.undefined
    ): BatchPutMessageErrorEntry = {
      val __obj = js.Dictionary.empty[js.Any]
      errorCode.foreach(__v => __obj.update("errorCode", __v.asInstanceOf[js.Any]))
      errorMessage.foreach(__v => __obj.update("errorMessage", __v.asInstanceOf[js.Any]))
      messageId.foreach(__v => __obj.update("messageId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchPutMessageErrorEntry]
    }
  }

  @js.native
  trait BatchPutMessageRequest extends js.Object {
    var channelName: ChannelName
    var messages: Messages
  }

  object BatchPutMessageRequest {
    def apply(
        channelName: ChannelName,
        messages: Messages
    ): BatchPutMessageRequest = {
      val __obj = js.Dictionary[js.Any](
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
    def apply(
        batchPutMessageErrorEntries: js.UndefOr[BatchPutMessageErrorEntries] = js.undefined
    ): BatchPutMessageResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      batchPutMessageErrorEntries.foreach(__v => __obj.update("batchPutMessageErrorEntries", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchPutMessageResponse]
    }
  }

  @js.native
  trait CancelPipelineReprocessingRequest extends js.Object {
    var pipelineName: PipelineName
    var reprocessingId: ReprocessingId
  }

  object CancelPipelineReprocessingRequest {
    def apply(
        pipelineName: PipelineName,
        reprocessingId: ReprocessingId
    ): CancelPipelineReprocessingRequest = {
      val __obj = js.Dictionary[js.Any](
        "pipelineName"   -> pipelineName.asInstanceOf[js.Any],
        "reprocessingId" -> reprocessingId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CancelPipelineReprocessingRequest]
    }
  }

  @js.native
  trait CancelPipelineReprocessingResponse extends js.Object {}

  object CancelPipelineReprocessingResponse {
    def apply(
        ): CancelPipelineReprocessingResponse = {
      val __obj = js.Dictionary.empty[js.Any]

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
  }

  object Channel {
    def apply(
        arn: js.UndefOr[ChannelArn] = js.undefined,
        creationTime: js.UndefOr[Timestamp] = js.undefined,
        lastUpdateTime: js.UndefOr[Timestamp] = js.undefined,
        name: js.UndefOr[ChannelName] = js.undefined,
        retentionPeriod: js.UndefOr[RetentionPeriod] = js.undefined,
        status: js.UndefOr[ChannelStatus] = js.undefined
    ): Channel = {
      val __obj = js.Dictionary.empty[js.Any]
      arn.foreach(__v => __obj.update("arn", __v.asInstanceOf[js.Any]))
      creationTime.foreach(__v => __obj.update("creationTime", __v.asInstanceOf[js.Any]))
      lastUpdateTime.foreach(__v => __obj.update("lastUpdateTime", __v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.update("name", __v.asInstanceOf[js.Any]))
      retentionPeriod.foreach(__v => __obj.update("retentionPeriod", __v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.update("status", __v.asInstanceOf[js.Any]))
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
    def apply(
        channelName: ChannelName,
        name: ActivityName,
        next: js.UndefOr[ActivityName] = js.undefined
    ): ChannelActivity = {
      val __obj = js.Dictionary[js.Any](
        "channelName" -> channelName.asInstanceOf[js.Any],
        "name"        -> name.asInstanceOf[js.Any]
      )

      next.foreach(__v => __obj.update("next", __v.asInstanceOf[js.Any]))
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
    def apply(
        size: js.UndefOr[EstimatedResourceSize] = js.undefined
    ): ChannelStatistics = {
      val __obj = js.Dictionary.empty[js.Any]
      size.foreach(__v => __obj.update("size", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ChannelStatistics]
    }
  }

  object ChannelStatusEnum {
    val CREATING = "CREATING"
    val ACTIVE   = "ACTIVE"
    val DELETING = "DELETING"

    val values = IndexedSeq(CREATING, ACTIVE, DELETING)
  }

  /**
    * A summary of information about a channel.
    */
  @js.native
  trait ChannelSummary extends js.Object {
    var channelName: js.UndefOr[ChannelName]
    var creationTime: js.UndefOr[Timestamp]
    var lastUpdateTime: js.UndefOr[Timestamp]
    var status: js.UndefOr[ChannelStatus]
  }

  object ChannelSummary {
    def apply(
        channelName: js.UndefOr[ChannelName] = js.undefined,
        creationTime: js.UndefOr[Timestamp] = js.undefined,
        lastUpdateTime: js.UndefOr[Timestamp] = js.undefined,
        status: js.UndefOr[ChannelStatus] = js.undefined
    ): ChannelSummary = {
      val __obj = js.Dictionary.empty[js.Any]
      channelName.foreach(__v => __obj.update("channelName", __v.asInstanceOf[js.Any]))
      creationTime.foreach(__v => __obj.update("creationTime", __v.asInstanceOf[js.Any]))
      lastUpdateTime.foreach(__v => __obj.update("lastUpdateTime", __v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.update("status", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ChannelSummary]
    }
  }

  object ComputeTypeEnum {
    val ACU_1 = "ACU_1"
    val ACU_2 = "ACU_2"

    val values = IndexedSeq(ACU_1, ACU_2)
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
    def apply(
        executionRoleArn: RoleArn,
        image: Image,
        resourceConfiguration: ResourceConfiguration,
        variables: js.UndefOr[Variables] = js.undefined
    ): ContainerDatasetAction = {
      val __obj = js.Dictionary[js.Any](
        "executionRoleArn"      -> executionRoleArn.asInstanceOf[js.Any],
        "image"                 -> image.asInstanceOf[js.Any],
        "resourceConfiguration" -> resourceConfiguration.asInstanceOf[js.Any]
      )

      variables.foreach(__v => __obj.update("variables", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ContainerDatasetAction]
    }
  }

  @js.native
  trait CreateChannelRequest extends js.Object {
    var channelName: ChannelName
    var retentionPeriod: js.UndefOr[RetentionPeriod]
    var tags: js.UndefOr[TagList]
  }

  object CreateChannelRequest {
    def apply(
        channelName: ChannelName,
        retentionPeriod: js.UndefOr[RetentionPeriod] = js.undefined,
        tags: js.UndefOr[TagList] = js.undefined
    ): CreateChannelRequest = {
      val __obj = js.Dictionary[js.Any](
        "channelName" -> channelName.asInstanceOf[js.Any]
      )

      retentionPeriod.foreach(__v => __obj.update("retentionPeriod", __v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.update("tags", __v.asInstanceOf[js.Any]))
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
    def apply(
        channelArn: js.UndefOr[ChannelArn] = js.undefined,
        channelName: js.UndefOr[ChannelName] = js.undefined,
        retentionPeriod: js.UndefOr[RetentionPeriod] = js.undefined
    ): CreateChannelResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      channelArn.foreach(__v => __obj.update("channelArn", __v.asInstanceOf[js.Any]))
      channelName.foreach(__v => __obj.update("channelName", __v.asInstanceOf[js.Any]))
      retentionPeriod.foreach(__v => __obj.update("retentionPeriod", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateChannelResponse]
    }
  }

  @js.native
  trait CreateDatasetContentRequest extends js.Object {
    var datasetName: DatasetName
  }

  object CreateDatasetContentRequest {
    def apply(
        datasetName: DatasetName
    ): CreateDatasetContentRequest = {
      val __obj = js.Dictionary[js.Any](
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
    def apply(
        versionId: js.UndefOr[DatasetContentVersion] = js.undefined
    ): CreateDatasetContentResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      versionId.foreach(__v => __obj.update("versionId", __v.asInstanceOf[js.Any]))
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
    def apply(
        actions: DatasetActions,
        datasetName: DatasetName,
        contentDeliveryRules: js.UndefOr[DatasetContentDeliveryRules] = js.undefined,
        retentionPeriod: js.UndefOr[RetentionPeriod] = js.undefined,
        tags: js.UndefOr[TagList] = js.undefined,
        triggers: js.UndefOr[DatasetTriggers] = js.undefined,
        versioningConfiguration: js.UndefOr[VersioningConfiguration] = js.undefined
    ): CreateDatasetRequest = {
      val __obj = js.Dictionary[js.Any](
        "actions"     -> actions.asInstanceOf[js.Any],
        "datasetName" -> datasetName.asInstanceOf[js.Any]
      )

      contentDeliveryRules.foreach(__v => __obj.update("contentDeliveryRules", __v.asInstanceOf[js.Any]))
      retentionPeriod.foreach(__v => __obj.update("retentionPeriod", __v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.update("tags", __v.asInstanceOf[js.Any]))
      triggers.foreach(__v => __obj.update("triggers", __v.asInstanceOf[js.Any]))
      versioningConfiguration.foreach(__v => __obj.update("versioningConfiguration", __v.asInstanceOf[js.Any]))
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
    def apply(
        datasetArn: js.UndefOr[DatasetArn] = js.undefined,
        datasetName: js.UndefOr[DatasetName] = js.undefined,
        retentionPeriod: js.UndefOr[RetentionPeriod] = js.undefined
    ): CreateDatasetResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      datasetArn.foreach(__v => __obj.update("datasetArn", __v.asInstanceOf[js.Any]))
      datasetName.foreach(__v => __obj.update("datasetName", __v.asInstanceOf[js.Any]))
      retentionPeriod.foreach(__v => __obj.update("retentionPeriod", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDatasetResponse]
    }
  }

  @js.native
  trait CreateDatastoreRequest extends js.Object {
    var datastoreName: DatastoreName
    var retentionPeriod: js.UndefOr[RetentionPeriod]
    var tags: js.UndefOr[TagList]
  }

  object CreateDatastoreRequest {
    def apply(
        datastoreName: DatastoreName,
        retentionPeriod: js.UndefOr[RetentionPeriod] = js.undefined,
        tags: js.UndefOr[TagList] = js.undefined
    ): CreateDatastoreRequest = {
      val __obj = js.Dictionary[js.Any](
        "datastoreName" -> datastoreName.asInstanceOf[js.Any]
      )

      retentionPeriod.foreach(__v => __obj.update("retentionPeriod", __v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.update("tags", __v.asInstanceOf[js.Any]))
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
    def apply(
        datastoreArn: js.UndefOr[DatastoreArn] = js.undefined,
        datastoreName: js.UndefOr[DatastoreName] = js.undefined,
        retentionPeriod: js.UndefOr[RetentionPeriod] = js.undefined
    ): CreateDatastoreResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      datastoreArn.foreach(__v => __obj.update("datastoreArn", __v.asInstanceOf[js.Any]))
      datastoreName.foreach(__v => __obj.update("datastoreName", __v.asInstanceOf[js.Any]))
      retentionPeriod.foreach(__v => __obj.update("retentionPeriod", __v.asInstanceOf[js.Any]))
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
    def apply(
        pipelineActivities: PipelineActivities,
        pipelineName: PipelineName,
        tags: js.UndefOr[TagList] = js.undefined
    ): CreatePipelineRequest = {
      val __obj = js.Dictionary[js.Any](
        "pipelineActivities" -> pipelineActivities.asInstanceOf[js.Any],
        "pipelineName"       -> pipelineName.asInstanceOf[js.Any]
      )

      tags.foreach(__v => __obj.update("tags", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreatePipelineRequest]
    }
  }

  @js.native
  trait CreatePipelineResponse extends js.Object {
    var pipelineArn: js.UndefOr[PipelineArn]
    var pipelineName: js.UndefOr[PipelineName]
  }

  object CreatePipelineResponse {
    def apply(
        pipelineArn: js.UndefOr[PipelineArn] = js.undefined,
        pipelineName: js.UndefOr[PipelineName] = js.undefined
    ): CreatePipelineResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      pipelineArn.foreach(__v => __obj.update("pipelineArn", __v.asInstanceOf[js.Any]))
      pipelineName.foreach(__v => __obj.update("pipelineName", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreatePipelineResponse]
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
      val __obj = js.Dictionary.empty[js.Any]
      actions.foreach(__v => __obj.update("actions", __v.asInstanceOf[js.Any]))
      arn.foreach(__v => __obj.update("arn", __v.asInstanceOf[js.Any]))
      contentDeliveryRules.foreach(__v => __obj.update("contentDeliveryRules", __v.asInstanceOf[js.Any]))
      creationTime.foreach(__v => __obj.update("creationTime", __v.asInstanceOf[js.Any]))
      lastUpdateTime.foreach(__v => __obj.update("lastUpdateTime", __v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.update("name", __v.asInstanceOf[js.Any]))
      retentionPeriod.foreach(__v => __obj.update("retentionPeriod", __v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.update("status", __v.asInstanceOf[js.Any]))
      triggers.foreach(__v => __obj.update("triggers", __v.asInstanceOf[js.Any]))
      versioningConfiguration.foreach(__v => __obj.update("versioningConfiguration", __v.asInstanceOf[js.Any]))
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
    def apply(
        actionName: js.UndefOr[DatasetActionName] = js.undefined,
        containerAction: js.UndefOr[ContainerDatasetAction] = js.undefined,
        queryAction: js.UndefOr[SqlQueryDatasetAction] = js.undefined
    ): DatasetAction = {
      val __obj = js.Dictionary.empty[js.Any]
      actionName.foreach(__v => __obj.update("actionName", __v.asInstanceOf[js.Any]))
      containerAction.foreach(__v => __obj.update("containerAction", __v.asInstanceOf[js.Any]))
      queryAction.foreach(__v => __obj.update("queryAction", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DatasetAction]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait DatasetActionSummary extends js.Object {
    var actionName: js.UndefOr[DatasetActionName]
    var actionType: js.UndefOr[DatasetActionType]
  }

  object DatasetActionSummary {
    def apply(
        actionName: js.UndefOr[DatasetActionName] = js.undefined,
        actionType: js.UndefOr[DatasetActionType] = js.undefined
    ): DatasetActionSummary = {
      val __obj = js.Dictionary.empty[js.Any]
      actionName.foreach(__v => __obj.update("actionName", __v.asInstanceOf[js.Any]))
      actionType.foreach(__v => __obj.update("actionType", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DatasetActionSummary]
    }
  }

  object DatasetActionTypeEnum {
    val QUERY     = "QUERY"
    val CONTAINER = "CONTAINER"

    val values = IndexedSeq(QUERY, CONTAINER)
  }

  /**
    * The destination to which data set contents are delivered.
    */
  @js.native
  trait DatasetContentDeliveryDestination extends js.Object {
    var iotEventsDestinationConfiguration: js.UndefOr[IotEventsDestinationConfiguration]
  }

  object DatasetContentDeliveryDestination {
    def apply(
        iotEventsDestinationConfiguration: js.UndefOr[IotEventsDestinationConfiguration] = js.undefined
    ): DatasetContentDeliveryDestination = {
      val __obj = js.Dictionary.empty[js.Any]
      iotEventsDestinationConfiguration.foreach(
        __v => __obj.update("iotEventsDestinationConfiguration", __v.asInstanceOf[js.Any])
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
    def apply(
        destination: DatasetContentDeliveryDestination,
        entryName: js.UndefOr[EntryName] = js.undefined
    ): DatasetContentDeliveryRule = {
      val __obj = js.Dictionary[js.Any](
        "destination" -> destination.asInstanceOf[js.Any]
      )

      entryName.foreach(__v => __obj.update("entryName", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DatasetContentDeliveryRule]
    }
  }

  object DatasetContentStateEnum {
    val CREATING  = "CREATING"
    val SUCCEEDED = "SUCCEEDED"
    val FAILED    = "FAILED"

    val values = IndexedSeq(CREATING, SUCCEEDED, FAILED)
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
    def apply(
        reason: js.UndefOr[Reason] = js.undefined,
        state: js.UndefOr[DatasetContentState] = js.undefined
    ): DatasetContentStatus = {
      val __obj = js.Dictionary.empty[js.Any]
      reason.foreach(__v => __obj.update("reason", __v.asInstanceOf[js.Any]))
      state.foreach(__v => __obj.update("state", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DatasetContentStatus]
    }
  }

  /**
    * Summary information about data set contents.
    */
  @js.native
  trait DatasetContentSummary extends js.Object {
    var creationTime: js.UndefOr[Timestamp]
    var scheduleTime: js.UndefOr[Timestamp]
    var status: js.UndefOr[DatasetContentStatus]
    var version: js.UndefOr[DatasetContentVersion]
  }

  object DatasetContentSummary {
    def apply(
        creationTime: js.UndefOr[Timestamp] = js.undefined,
        scheduleTime: js.UndefOr[Timestamp] = js.undefined,
        status: js.UndefOr[DatasetContentStatus] = js.undefined,
        version: js.UndefOr[DatasetContentVersion] = js.undefined
    ): DatasetContentSummary = {
      val __obj = js.Dictionary.empty[js.Any]
      creationTime.foreach(__v => __obj.update("creationTime", __v.asInstanceOf[js.Any]))
      scheduleTime.foreach(__v => __obj.update("scheduleTime", __v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.update("status", __v.asInstanceOf[js.Any]))
      version.foreach(__v => __obj.update("version", __v.asInstanceOf[js.Any]))
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
    def apply(
        datasetName: DatasetName
    ): DatasetContentVersionValue = {
      val __obj = js.Dictionary[js.Any](
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
    def apply(
        dataURI: js.UndefOr[PresignedURI] = js.undefined,
        entryName: js.UndefOr[EntryName] = js.undefined
    ): DatasetEntry = {
      val __obj = js.Dictionary.empty[js.Any]
      dataURI.foreach(__v => __obj.update("dataURI", __v.asInstanceOf[js.Any]))
      entryName.foreach(__v => __obj.update("entryName", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DatasetEntry]
    }
  }

  object DatasetStatusEnum {
    val CREATING = "CREATING"
    val ACTIVE   = "ACTIVE"
    val DELETING = "DELETING"

    val values = IndexedSeq(CREATING, ACTIVE, DELETING)
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
    def apply(
        actions: js.UndefOr[DatasetActionSummaries] = js.undefined,
        creationTime: js.UndefOr[Timestamp] = js.undefined,
        datasetName: js.UndefOr[DatasetName] = js.undefined,
        lastUpdateTime: js.UndefOr[Timestamp] = js.undefined,
        status: js.UndefOr[DatasetStatus] = js.undefined,
        triggers: js.UndefOr[DatasetTriggers] = js.undefined
    ): DatasetSummary = {
      val __obj = js.Dictionary.empty[js.Any]
      actions.foreach(__v => __obj.update("actions", __v.asInstanceOf[js.Any]))
      creationTime.foreach(__v => __obj.update("creationTime", __v.asInstanceOf[js.Any]))
      datasetName.foreach(__v => __obj.update("datasetName", __v.asInstanceOf[js.Any]))
      lastUpdateTime.foreach(__v => __obj.update("lastUpdateTime", __v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.update("status", __v.asInstanceOf[js.Any]))
      triggers.foreach(__v => __obj.update("triggers", __v.asInstanceOf[js.Any]))
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
    def apply(
        dataset: js.UndefOr[TriggeringDataset] = js.undefined,
        schedule: js.UndefOr[Schedule] = js.undefined
    ): DatasetTrigger = {
      val __obj = js.Dictionary.empty[js.Any]
      dataset.foreach(__v => __obj.update("dataset", __v.asInstanceOf[js.Any]))
      schedule.foreach(__v => __obj.update("schedule", __v.asInstanceOf[js.Any]))
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
  }

  object Datastore {
    def apply(
        arn: js.UndefOr[DatastoreArn] = js.undefined,
        creationTime: js.UndefOr[Timestamp] = js.undefined,
        lastUpdateTime: js.UndefOr[Timestamp] = js.undefined,
        name: js.UndefOr[DatastoreName] = js.undefined,
        retentionPeriod: js.UndefOr[RetentionPeriod] = js.undefined,
        status: js.UndefOr[DatastoreStatus] = js.undefined
    ): Datastore = {
      val __obj = js.Dictionary.empty[js.Any]
      arn.foreach(__v => __obj.update("arn", __v.asInstanceOf[js.Any]))
      creationTime.foreach(__v => __obj.update("creationTime", __v.asInstanceOf[js.Any]))
      lastUpdateTime.foreach(__v => __obj.update("lastUpdateTime", __v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.update("name", __v.asInstanceOf[js.Any]))
      retentionPeriod.foreach(__v => __obj.update("retentionPeriod", __v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.update("status", __v.asInstanceOf[js.Any]))
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
    def apply(
        datastoreName: DatastoreName,
        name: ActivityName
    ): DatastoreActivity = {
      val __obj = js.Dictionary[js.Any](
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
    def apply(
        size: js.UndefOr[EstimatedResourceSize] = js.undefined
    ): DatastoreStatistics = {
      val __obj = js.Dictionary.empty[js.Any]
      size.foreach(__v => __obj.update("size", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DatastoreStatistics]
    }
  }

  object DatastoreStatusEnum {
    val CREATING = "CREATING"
    val ACTIVE   = "ACTIVE"
    val DELETING = "DELETING"

    val values = IndexedSeq(CREATING, ACTIVE, DELETING)
  }

  /**
    * A summary of information about a data store.
    */
  @js.native
  trait DatastoreSummary extends js.Object {
    var creationTime: js.UndefOr[Timestamp]
    var datastoreName: js.UndefOr[DatastoreName]
    var lastUpdateTime: js.UndefOr[Timestamp]
    var status: js.UndefOr[DatastoreStatus]
  }

  object DatastoreSummary {
    def apply(
        creationTime: js.UndefOr[Timestamp] = js.undefined,
        datastoreName: js.UndefOr[DatastoreName] = js.undefined,
        lastUpdateTime: js.UndefOr[Timestamp] = js.undefined,
        status: js.UndefOr[DatastoreStatus] = js.undefined
    ): DatastoreSummary = {
      val __obj = js.Dictionary.empty[js.Any]
      creationTime.foreach(__v => __obj.update("creationTime", __v.asInstanceOf[js.Any]))
      datastoreName.foreach(__v => __obj.update("datastoreName", __v.asInstanceOf[js.Any]))
      lastUpdateTime.foreach(__v => __obj.update("lastUpdateTime", __v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.update("status", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DatastoreSummary]
    }
  }

  @js.native
  trait DeleteChannelRequest extends js.Object {
    var channelName: ChannelName
  }

  object DeleteChannelRequest {
    def apply(
        channelName: ChannelName
    ): DeleteChannelRequest = {
      val __obj = js.Dictionary[js.Any](
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
    def apply(
        datasetName: DatasetName,
        versionId: js.UndefOr[DatasetContentVersion] = js.undefined
    ): DeleteDatasetContentRequest = {
      val __obj = js.Dictionary[js.Any](
        "datasetName" -> datasetName.asInstanceOf[js.Any]
      )

      versionId.foreach(__v => __obj.update("versionId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteDatasetContentRequest]
    }
  }

  @js.native
  trait DeleteDatasetRequest extends js.Object {
    var datasetName: DatasetName
  }

  object DeleteDatasetRequest {
    def apply(
        datasetName: DatasetName
    ): DeleteDatasetRequest = {
      val __obj = js.Dictionary[js.Any](
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
    def apply(
        datastoreName: DatastoreName
    ): DeleteDatastoreRequest = {
      val __obj = js.Dictionary[js.Any](
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
    def apply(
        pipelineName: PipelineName
    ): DeletePipelineRequest = {
      val __obj = js.Dictionary[js.Any](
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
    def apply(
        offsetSeconds: OffsetSeconds,
        timeExpression: TimeExpression
    ): DeltaTime = {
      val __obj = js.Dictionary[js.Any](
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
    def apply(
        channelName: ChannelName,
        includeStatistics: js.UndefOr[IncludeStatisticsFlag] = js.undefined
    ): DescribeChannelRequest = {
      val __obj = js.Dictionary[js.Any](
        "channelName" -> channelName.asInstanceOf[js.Any]
      )

      includeStatistics.foreach(__v => __obj.update("includeStatistics", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeChannelRequest]
    }
  }

  @js.native
  trait DescribeChannelResponse extends js.Object {
    var channel: js.UndefOr[Channel]
    var statistics: js.UndefOr[ChannelStatistics]
  }

  object DescribeChannelResponse {
    def apply(
        channel: js.UndefOr[Channel] = js.undefined,
        statistics: js.UndefOr[ChannelStatistics] = js.undefined
    ): DescribeChannelResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      channel.foreach(__v => __obj.update("channel", __v.asInstanceOf[js.Any]))
      statistics.foreach(__v => __obj.update("statistics", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeChannelResponse]
    }
  }

  @js.native
  trait DescribeDatasetRequest extends js.Object {
    var datasetName: DatasetName
  }

  object DescribeDatasetRequest {
    def apply(
        datasetName: DatasetName
    ): DescribeDatasetRequest = {
      val __obj = js.Dictionary[js.Any](
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
    def apply(
        dataset: js.UndefOr[Dataset] = js.undefined
    ): DescribeDatasetResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      dataset.foreach(__v => __obj.update("dataset", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeDatasetResponse]
    }
  }

  @js.native
  trait DescribeDatastoreRequest extends js.Object {
    var datastoreName: DatastoreName
    var includeStatistics: js.UndefOr[IncludeStatisticsFlag]
  }

  object DescribeDatastoreRequest {
    def apply(
        datastoreName: DatastoreName,
        includeStatistics: js.UndefOr[IncludeStatisticsFlag] = js.undefined
    ): DescribeDatastoreRequest = {
      val __obj = js.Dictionary[js.Any](
        "datastoreName" -> datastoreName.asInstanceOf[js.Any]
      )

      includeStatistics.foreach(__v => __obj.update("includeStatistics", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeDatastoreRequest]
    }
  }

  @js.native
  trait DescribeDatastoreResponse extends js.Object {
    var datastore: js.UndefOr[Datastore]
    var statistics: js.UndefOr[DatastoreStatistics]
  }

  object DescribeDatastoreResponse {
    def apply(
        datastore: js.UndefOr[Datastore] = js.undefined,
        statistics: js.UndefOr[DatastoreStatistics] = js.undefined
    ): DescribeDatastoreResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      datastore.foreach(__v => __obj.update("datastore", __v.asInstanceOf[js.Any]))
      statistics.foreach(__v => __obj.update("statistics", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeDatastoreResponse]
    }
  }

  @js.native
  trait DescribeLoggingOptionsRequest extends js.Object {}

  object DescribeLoggingOptionsRequest {
    def apply(
        ): DescribeLoggingOptionsRequest = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[DescribeLoggingOptionsRequest]
    }
  }

  @js.native
  trait DescribeLoggingOptionsResponse extends js.Object {
    var loggingOptions: js.UndefOr[LoggingOptions]
  }

  object DescribeLoggingOptionsResponse {
    def apply(
        loggingOptions: js.UndefOr[LoggingOptions] = js.undefined
    ): DescribeLoggingOptionsResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      loggingOptions.foreach(__v => __obj.update("loggingOptions", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeLoggingOptionsResponse]
    }
  }

  @js.native
  trait DescribePipelineRequest extends js.Object {
    var pipelineName: PipelineName
  }

  object DescribePipelineRequest {
    def apply(
        pipelineName: PipelineName
    ): DescribePipelineRequest = {
      val __obj = js.Dictionary[js.Any](
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
    def apply(
        pipeline: js.UndefOr[Pipeline] = js.undefined
    ): DescribePipelineResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      pipeline.foreach(__v => __obj.update("pipeline", __v.asInstanceOf[js.Any]))
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
    def apply(
        attribute: AttributeName,
        name: ActivityName,
        roleArn: RoleArn,
        thingName: AttributeName,
        next: js.UndefOr[ActivityName] = js.undefined
    ): DeviceRegistryEnrichActivity = {
      val __obj = js.Dictionary[js.Any](
        "attribute" -> attribute.asInstanceOf[js.Any],
        "name"      -> name.asInstanceOf[js.Any],
        "roleArn"   -> roleArn.asInstanceOf[js.Any],
        "thingName" -> thingName.asInstanceOf[js.Any]
      )

      next.foreach(__v => __obj.update("next", __v.asInstanceOf[js.Any]))
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
    def apply(
        attribute: AttributeName,
        name: ActivityName,
        roleArn: RoleArn,
        thingName: AttributeName,
        next: js.UndefOr[ActivityName] = js.undefined
    ): DeviceShadowEnrichActivity = {
      val __obj = js.Dictionary[js.Any](
        "attribute" -> attribute.asInstanceOf[js.Any],
        "name"      -> name.asInstanceOf[js.Any],
        "roleArn"   -> roleArn.asInstanceOf[js.Any],
        "thingName" -> thingName.asInstanceOf[js.Any]
      )

      next.foreach(__v => __obj.update("next", __v.asInstanceOf[js.Any]))
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
    def apply(
        estimatedOn: js.UndefOr[Timestamp] = js.undefined,
        estimatedSizeInBytes: js.UndefOr[SizeInBytes] = js.undefined
    ): EstimatedResourceSize = {
      val __obj = js.Dictionary.empty[js.Any]
      estimatedOn.foreach(__v => __obj.update("estimatedOn", __v.asInstanceOf[js.Any]))
      estimatedSizeInBytes.foreach(__v => __obj.update("estimatedSizeInBytes", __v.asInstanceOf[js.Any]))
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
    def apply(
        filter: FilterExpression,
        name: ActivityName,
        next: js.UndefOr[ActivityName] = js.undefined
    ): FilterActivity = {
      val __obj = js.Dictionary[js.Any](
        "filter" -> filter.asInstanceOf[js.Any],
        "name"   -> name.asInstanceOf[js.Any]
      )

      next.foreach(__v => __obj.update("next", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FilterActivity]
    }
  }

  @js.native
  trait GetDatasetContentRequest extends js.Object {
    var datasetName: DatasetName
    var versionId: js.UndefOr[DatasetContentVersion]
  }

  object GetDatasetContentRequest {
    def apply(
        datasetName: DatasetName,
        versionId: js.UndefOr[DatasetContentVersion] = js.undefined
    ): GetDatasetContentRequest = {
      val __obj = js.Dictionary[js.Any](
        "datasetName" -> datasetName.asInstanceOf[js.Any]
      )

      versionId.foreach(__v => __obj.update("versionId", __v.asInstanceOf[js.Any]))
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
    def apply(
        entries: js.UndefOr[DatasetEntries] = js.undefined,
        status: js.UndefOr[DatasetContentStatus] = js.undefined,
        timestamp: js.UndefOr[Timestamp] = js.undefined
    ): GetDatasetContentResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      entries.foreach(__v => __obj.update("entries", __v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.update("status", __v.asInstanceOf[js.Any]))
      timestamp.foreach(__v => __obj.update("timestamp", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDatasetContentResponse]
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
    def apply(
        inputName: IotEventsInputName,
        roleArn: RoleArn
    ): IotEventsDestinationConfiguration = {
      val __obj = js.Dictionary[js.Any](
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
    def apply(
        batchSize: ActivityBatchSize,
        lambdaName: LambdaName,
        name: ActivityName,
        next: js.UndefOr[ActivityName] = js.undefined
    ): LambdaActivity = {
      val __obj = js.Dictionary[js.Any](
        "batchSize"  -> batchSize.asInstanceOf[js.Any],
        "lambdaName" -> lambdaName.asInstanceOf[js.Any],
        "name"       -> name.asInstanceOf[js.Any]
      )

      next.foreach(__v => __obj.update("next", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LambdaActivity]
    }
  }

  @js.native
  trait ListChannelsRequest extends js.Object {
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListChannelsRequest {
    def apply(
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListChannelsRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      maxResults.foreach(__v => __obj.update("maxResults", __v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListChannelsRequest]
    }
  }

  @js.native
  trait ListChannelsResponse extends js.Object {
    var channelSummaries: js.UndefOr[ChannelSummaries]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListChannelsResponse {
    def apply(
        channelSummaries: js.UndefOr[ChannelSummaries] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListChannelsResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      channelSummaries.foreach(__v => __obj.update("channelSummaries", __v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
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
    def apply(
        datasetName: DatasetName,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined,
        scheduledBefore: js.UndefOr[Timestamp] = js.undefined,
        scheduledOnOrAfter: js.UndefOr[Timestamp] = js.undefined
    ): ListDatasetContentsRequest = {
      val __obj = js.Dictionary[js.Any](
        "datasetName" -> datasetName.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.update("maxResults", __v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      scheduledBefore.foreach(__v => __obj.update("scheduledBefore", __v.asInstanceOf[js.Any]))
      scheduledOnOrAfter.foreach(__v => __obj.update("scheduledOnOrAfter", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDatasetContentsRequest]
    }
  }

  @js.native
  trait ListDatasetContentsResponse extends js.Object {
    var datasetContentSummaries: js.UndefOr[DatasetContentSummaries]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListDatasetContentsResponse {
    def apply(
        datasetContentSummaries: js.UndefOr[DatasetContentSummaries] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListDatasetContentsResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      datasetContentSummaries.foreach(__v => __obj.update("datasetContentSummaries", __v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDatasetContentsResponse]
    }
  }

  @js.native
  trait ListDatasetsRequest extends js.Object {
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListDatasetsRequest {
    def apply(
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListDatasetsRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      maxResults.foreach(__v => __obj.update("maxResults", __v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDatasetsRequest]
    }
  }

  @js.native
  trait ListDatasetsResponse extends js.Object {
    var datasetSummaries: js.UndefOr[DatasetSummaries]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListDatasetsResponse {
    def apply(
        datasetSummaries: js.UndefOr[DatasetSummaries] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListDatasetsResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      datasetSummaries.foreach(__v => __obj.update("datasetSummaries", __v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDatasetsResponse]
    }
  }

  @js.native
  trait ListDatastoresRequest extends js.Object {
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListDatastoresRequest {
    def apply(
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListDatastoresRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      maxResults.foreach(__v => __obj.update("maxResults", __v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDatastoresRequest]
    }
  }

  @js.native
  trait ListDatastoresResponse extends js.Object {
    var datastoreSummaries: js.UndefOr[DatastoreSummaries]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListDatastoresResponse {
    def apply(
        datastoreSummaries: js.UndefOr[DatastoreSummaries] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListDatastoresResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      datastoreSummaries.foreach(__v => __obj.update("datastoreSummaries", __v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDatastoresResponse]
    }
  }

  @js.native
  trait ListPipelinesRequest extends js.Object {
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListPipelinesRequest {
    def apply(
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListPipelinesRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      maxResults.foreach(__v => __obj.update("maxResults", __v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPipelinesRequest]
    }
  }

  @js.native
  trait ListPipelinesResponse extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var pipelineSummaries: js.UndefOr[PipelineSummaries]
  }

  object ListPipelinesResponse {
    def apply(
        nextToken: js.UndefOr[NextToken] = js.undefined,
        pipelineSummaries: js.UndefOr[PipelineSummaries] = js.undefined
    ): ListPipelinesResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      pipelineSummaries.foreach(__v => __obj.update("pipelineSummaries", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPipelinesResponse]
    }
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var resourceArn: ResourceArn
  }

  object ListTagsForResourceRequest {
    def apply(
        resourceArn: ResourceArn
    ): ListTagsForResourceRequest = {
      val __obj = js.Dictionary[js.Any](
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
    def apply(
        tags: js.UndefOr[TagList] = js.undefined
    ): ListTagsForResourceResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      tags.foreach(__v => __obj.update("tags", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceResponse]
    }
  }

  object LoggingLevelEnum {
    val ERROR = "ERROR"

    val values = IndexedSeq(ERROR)
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
    def apply(
        enabled: LoggingEnabled,
        level: LoggingLevel,
        roleArn: RoleArn
    ): LoggingOptions = {
      val __obj = js.Dictionary[js.Any](
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
    def apply(
        attribute: AttributeName,
        math: MathExpression,
        name: ActivityName,
        next: js.UndefOr[ActivityName] = js.undefined
    ): MathActivity = {
      val __obj = js.Dictionary[js.Any](
        "attribute" -> attribute.asInstanceOf[js.Any],
        "math"      -> math.asInstanceOf[js.Any],
        "name"      -> name.asInstanceOf[js.Any]
      )

      next.foreach(__v => __obj.update("next", __v.asInstanceOf[js.Any]))
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
    def apply(
        messageId: MessageId,
        payload: MessagePayload
    ): Message = {
      val __obj = js.Dictionary[js.Any](
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
    def apply(
        fileName: OutputFileName
    ): OutputFileUriValue = {
      val __obj = js.Dictionary[js.Any](
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
    def apply(
        activities: js.UndefOr[PipelineActivities] = js.undefined,
        arn: js.UndefOr[PipelineArn] = js.undefined,
        creationTime: js.UndefOr[Timestamp] = js.undefined,
        lastUpdateTime: js.UndefOr[Timestamp] = js.undefined,
        name: js.UndefOr[PipelineName] = js.undefined,
        reprocessingSummaries: js.UndefOr[ReprocessingSummaries] = js.undefined
    ): Pipeline = {
      val __obj = js.Dictionary.empty[js.Any]
      activities.foreach(__v => __obj.update("activities", __v.asInstanceOf[js.Any]))
      arn.foreach(__v => __obj.update("arn", __v.asInstanceOf[js.Any]))
      creationTime.foreach(__v => __obj.update("creationTime", __v.asInstanceOf[js.Any]))
      lastUpdateTime.foreach(__v => __obj.update("lastUpdateTime", __v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.update("name", __v.asInstanceOf[js.Any]))
      reprocessingSummaries.foreach(__v => __obj.update("reprocessingSummaries", __v.asInstanceOf[js.Any]))
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
      val __obj = js.Dictionary.empty[js.Any]
      addAttributes.foreach(__v => __obj.update("addAttributes", __v.asInstanceOf[js.Any]))
      channel.foreach(__v => __obj.update("channel", __v.asInstanceOf[js.Any]))
      datastore.foreach(__v => __obj.update("datastore", __v.asInstanceOf[js.Any]))
      deviceRegistryEnrich.foreach(__v => __obj.update("deviceRegistryEnrich", __v.asInstanceOf[js.Any]))
      deviceShadowEnrich.foreach(__v => __obj.update("deviceShadowEnrich", __v.asInstanceOf[js.Any]))
      filter.foreach(__v => __obj.update("filter", __v.asInstanceOf[js.Any]))
      lambda.foreach(__v => __obj.update("lambda", __v.asInstanceOf[js.Any]))
      math.foreach(__v => __obj.update("math", __v.asInstanceOf[js.Any]))
      removeAttributes.foreach(__v => __obj.update("removeAttributes", __v.asInstanceOf[js.Any]))
      selectAttributes.foreach(__v => __obj.update("selectAttributes", __v.asInstanceOf[js.Any]))
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
    def apply(
        creationTime: js.UndefOr[Timestamp] = js.undefined,
        lastUpdateTime: js.UndefOr[Timestamp] = js.undefined,
        pipelineName: js.UndefOr[PipelineName] = js.undefined,
        reprocessingSummaries: js.UndefOr[ReprocessingSummaries] = js.undefined
    ): PipelineSummary = {
      val __obj = js.Dictionary.empty[js.Any]
      creationTime.foreach(__v => __obj.update("creationTime", __v.asInstanceOf[js.Any]))
      lastUpdateTime.foreach(__v => __obj.update("lastUpdateTime", __v.asInstanceOf[js.Any]))
      pipelineName.foreach(__v => __obj.update("pipelineName", __v.asInstanceOf[js.Any]))
      reprocessingSummaries.foreach(__v => __obj.update("reprocessingSummaries", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PipelineSummary]
    }
  }

  @js.native
  trait PutLoggingOptionsRequest extends js.Object {
    var loggingOptions: LoggingOptions
  }

  object PutLoggingOptionsRequest {
    def apply(
        loggingOptions: LoggingOptions
    ): PutLoggingOptionsRequest = {
      val __obj = js.Dictionary[js.Any](
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
    def apply(
        deltaTime: js.UndefOr[DeltaTime] = js.undefined
    ): QueryFilter = {
      val __obj = js.Dictionary.empty[js.Any]
      deltaTime.foreach(__v => __obj.update("deltaTime", __v.asInstanceOf[js.Any]))
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
    def apply(
        attributes: AttributeNames,
        name: ActivityName,
        next: js.UndefOr[ActivityName] = js.undefined
    ): RemoveAttributesActivity = {
      val __obj = js.Dictionary[js.Any](
        "attributes" -> attributes.asInstanceOf[js.Any],
        "name"       -> name.asInstanceOf[js.Any]
      )

      next.foreach(__v => __obj.update("next", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RemoveAttributesActivity]
    }
  }

  object ReprocessingStatusEnum {
    val RUNNING   = "RUNNING"
    val SUCCEEDED = "SUCCEEDED"
    val CANCELLED = "CANCELLED"
    val FAILED    = "FAILED"

    val values = IndexedSeq(RUNNING, SUCCEEDED, CANCELLED, FAILED)
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
    def apply(
        creationTime: js.UndefOr[Timestamp] = js.undefined,
        id: js.UndefOr[ReprocessingId] = js.undefined,
        status: js.UndefOr[ReprocessingStatus] = js.undefined
    ): ReprocessingSummary = {
      val __obj = js.Dictionary.empty[js.Any]
      creationTime.foreach(__v => __obj.update("creationTime", __v.asInstanceOf[js.Any]))
      id.foreach(__v => __obj.update("id", __v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.update("status", __v.asInstanceOf[js.Any]))
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
    def apply(
        computeType: ComputeType,
        volumeSizeInGB: VolumeSizeInGB
    ): ResourceConfiguration = {
      val __obj = js.Dictionary[js.Any](
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
    def apply(
        numberOfDays: js.UndefOr[RetentionPeriodInDays] = js.undefined,
        unlimited: js.UndefOr[UnlimitedRetentionPeriod] = js.undefined
    ): RetentionPeriod = {
      val __obj = js.Dictionary.empty[js.Any]
      numberOfDays.foreach(__v => __obj.update("numberOfDays", __v.asInstanceOf[js.Any]))
      unlimited.foreach(__v => __obj.update("unlimited", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RetentionPeriod]
    }
  }

  @js.native
  trait RunPipelineActivityRequest extends js.Object {
    var payloads: MessagePayloads
    var pipelineActivity: PipelineActivity
  }

  object RunPipelineActivityRequest {
    def apply(
        payloads: MessagePayloads,
        pipelineActivity: PipelineActivity
    ): RunPipelineActivityRequest = {
      val __obj = js.Dictionary[js.Any](
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
    def apply(
        logResult: js.UndefOr[LogResult] = js.undefined,
        payloads: js.UndefOr[MessagePayloads] = js.undefined
    ): RunPipelineActivityResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      logResult.foreach(__v => __obj.update("logResult", __v.asInstanceOf[js.Any]))
      payloads.foreach(__v => __obj.update("payloads", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RunPipelineActivityResponse]
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
    def apply(
        channelName: ChannelName,
        endTime: js.UndefOr[EndTime] = js.undefined,
        maxMessages: js.UndefOr[MaxMessages] = js.undefined,
        startTime: js.UndefOr[StartTime] = js.undefined
    ): SampleChannelDataRequest = {
      val __obj = js.Dictionary[js.Any](
        "channelName" -> channelName.asInstanceOf[js.Any]
      )

      endTime.foreach(__v => __obj.update("endTime", __v.asInstanceOf[js.Any]))
      maxMessages.foreach(__v => __obj.update("maxMessages", __v.asInstanceOf[js.Any]))
      startTime.foreach(__v => __obj.update("startTime", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SampleChannelDataRequest]
    }
  }

  @js.native
  trait SampleChannelDataResponse extends js.Object {
    var payloads: js.UndefOr[MessagePayloads]
  }

  object SampleChannelDataResponse {
    def apply(
        payloads: js.UndefOr[MessagePayloads] = js.undefined
    ): SampleChannelDataResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      payloads.foreach(__v => __obj.update("payloads", __v.asInstanceOf[js.Any]))
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
    def apply(
        expression: js.UndefOr[ScheduleExpression] = js.undefined
    ): Schedule = {
      val __obj = js.Dictionary.empty[js.Any]
      expression.foreach(__v => __obj.update("expression", __v.asInstanceOf[js.Any]))
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
    def apply(
        attributes: AttributeNames,
        name: ActivityName,
        next: js.UndefOr[ActivityName] = js.undefined
    ): SelectAttributesActivity = {
      val __obj = js.Dictionary[js.Any](
        "attributes" -> attributes.asInstanceOf[js.Any],
        "name"       -> name.asInstanceOf[js.Any]
      )

      next.foreach(__v => __obj.update("next", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SelectAttributesActivity]
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
    def apply(
        sqlQuery: SqlQuery,
        filters: js.UndefOr[QueryFilters] = js.undefined
    ): SqlQueryDatasetAction = {
      val __obj = js.Dictionary[js.Any](
        "sqlQuery" -> sqlQuery.asInstanceOf[js.Any]
      )

      filters.foreach(__v => __obj.update("filters", __v.asInstanceOf[js.Any]))
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
    def apply(
        pipelineName: PipelineName,
        endTime: js.UndefOr[EndTime] = js.undefined,
        startTime: js.UndefOr[StartTime] = js.undefined
    ): StartPipelineReprocessingRequest = {
      val __obj = js.Dictionary[js.Any](
        "pipelineName" -> pipelineName.asInstanceOf[js.Any]
      )

      endTime.foreach(__v => __obj.update("endTime", __v.asInstanceOf[js.Any]))
      startTime.foreach(__v => __obj.update("startTime", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartPipelineReprocessingRequest]
    }
  }

  @js.native
  trait StartPipelineReprocessingResponse extends js.Object {
    var reprocessingId: js.UndefOr[ReprocessingId]
  }

  object StartPipelineReprocessingResponse {
    def apply(
        reprocessingId: js.UndefOr[ReprocessingId] = js.undefined
    ): StartPipelineReprocessingResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      reprocessingId.foreach(__v => __obj.update("reprocessingId", __v.asInstanceOf[js.Any]))
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
    def apply(
        key: TagKey,
        value: TagValue
    ): Tag = {
      val __obj = js.Dictionary[js.Any](
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
    def apply(
        resourceArn: ResourceArn,
        tags: TagList
    ): TagResourceRequest = {
      val __obj = js.Dictionary[js.Any](
        "resourceArn" -> resourceArn.asInstanceOf[js.Any],
        "tags"        -> tags.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[TagResourceRequest]
    }
  }

  @js.native
  trait TagResourceResponse extends js.Object {}

  object TagResourceResponse {
    def apply(
        ): TagResourceResponse = {
      val __obj = js.Dictionary.empty[js.Any]

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
    def apply(
        name: DatasetName
    ): TriggeringDataset = {
      val __obj = js.Dictionary[js.Any](
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
    def apply(
        resourceArn: ResourceArn,
        tagKeys: TagKeyList
    ): UntagResourceRequest = {
      val __obj = js.Dictionary[js.Any](
        "resourceArn" -> resourceArn.asInstanceOf[js.Any],
        "tagKeys"     -> tagKeys.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UntagResourceRequest]
    }
  }

  @js.native
  trait UntagResourceResponse extends js.Object {}

  object UntagResourceResponse {
    def apply(
        ): UntagResourceResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[UntagResourceResponse]
    }
  }

  @js.native
  trait UpdateChannelRequest extends js.Object {
    var channelName: ChannelName
    var retentionPeriod: js.UndefOr[RetentionPeriod]
  }

  object UpdateChannelRequest {
    def apply(
        channelName: ChannelName,
        retentionPeriod: js.UndefOr[RetentionPeriod] = js.undefined
    ): UpdateChannelRequest = {
      val __obj = js.Dictionary[js.Any](
        "channelName" -> channelName.asInstanceOf[js.Any]
      )

      retentionPeriod.foreach(__v => __obj.update("retentionPeriod", __v.asInstanceOf[js.Any]))
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
    def apply(
        actions: DatasetActions,
        datasetName: DatasetName,
        contentDeliveryRules: js.UndefOr[DatasetContentDeliveryRules] = js.undefined,
        retentionPeriod: js.UndefOr[RetentionPeriod] = js.undefined,
        triggers: js.UndefOr[DatasetTriggers] = js.undefined,
        versioningConfiguration: js.UndefOr[VersioningConfiguration] = js.undefined
    ): UpdateDatasetRequest = {
      val __obj = js.Dictionary[js.Any](
        "actions"     -> actions.asInstanceOf[js.Any],
        "datasetName" -> datasetName.asInstanceOf[js.Any]
      )

      contentDeliveryRules.foreach(__v => __obj.update("contentDeliveryRules", __v.asInstanceOf[js.Any]))
      retentionPeriod.foreach(__v => __obj.update("retentionPeriod", __v.asInstanceOf[js.Any]))
      triggers.foreach(__v => __obj.update("triggers", __v.asInstanceOf[js.Any]))
      versioningConfiguration.foreach(__v => __obj.update("versioningConfiguration", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateDatasetRequest]
    }
  }

  @js.native
  trait UpdateDatastoreRequest extends js.Object {
    var datastoreName: DatastoreName
    var retentionPeriod: js.UndefOr[RetentionPeriod]
  }

  object UpdateDatastoreRequest {
    def apply(
        datastoreName: DatastoreName,
        retentionPeriod: js.UndefOr[RetentionPeriod] = js.undefined
    ): UpdateDatastoreRequest = {
      val __obj = js.Dictionary[js.Any](
        "datastoreName" -> datastoreName.asInstanceOf[js.Any]
      )

      retentionPeriod.foreach(__v => __obj.update("retentionPeriod", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateDatastoreRequest]
    }
  }

  @js.native
  trait UpdatePipelineRequest extends js.Object {
    var pipelineActivities: PipelineActivities
    var pipelineName: PipelineName
  }

  object UpdatePipelineRequest {
    def apply(
        pipelineActivities: PipelineActivities,
        pipelineName: PipelineName
    ): UpdatePipelineRequest = {
      val __obj = js.Dictionary[js.Any](
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
    def apply(
        name: VariableName,
        datasetContentVersionValue: js.UndefOr[DatasetContentVersionValue] = js.undefined,
        doubleValue: js.UndefOr[DoubleValue] = js.undefined,
        outputFileUriValue: js.UndefOr[OutputFileUriValue] = js.undefined,
        stringValue: js.UndefOr[StringValue] = js.undefined
    ): Variable = {
      val __obj = js.Dictionary[js.Any](
        "name" -> name.asInstanceOf[js.Any]
      )

      datasetContentVersionValue.foreach(__v => __obj.update("datasetContentVersionValue", __v.asInstanceOf[js.Any]))
      doubleValue.foreach(__v => __obj.update("doubleValue", __v.asInstanceOf[js.Any]))
      outputFileUriValue.foreach(__v => __obj.update("outputFileUriValue", __v.asInstanceOf[js.Any]))
      stringValue.foreach(__v => __obj.update("stringValue", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Variable]
    }
  }

  @js.native
  trait VersioningConfiguration extends js.Object {
    var maxVersions: js.UndefOr[MaxVersions]
    var unlimited: js.UndefOr[UnlimitedVersioning]
  }

  object VersioningConfiguration {
    def apply(
        maxVersions: js.UndefOr[MaxVersions] = js.undefined,
        unlimited: js.UndefOr[UnlimitedVersioning] = js.undefined
    ): VersioningConfiguration = {
      val __obj = js.Dictionary.empty[js.Any]
      maxVersions.foreach(__v => __obj.update("maxVersions", __v.asInstanceOf[js.Any]))
      unlimited.foreach(__v => __obj.update("unlimited", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VersioningConfiguration]
    }
  }
}
