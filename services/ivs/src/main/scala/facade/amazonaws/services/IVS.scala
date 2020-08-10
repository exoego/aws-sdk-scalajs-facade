package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

package object ivs {
  type BatchErrors = js.Array[BatchError]
  type ChannelArn = String
  type ChannelArnList = js.Array[ChannelArn]
  type ChannelList = js.Array[ChannelSummary]
  type ChannelName = String
  type Channels = js.Array[Channel]
  type IngestEndpoint = String
  type MaxChannelResults = Int
  type MaxStreamKeyResults = Int
  type MaxStreamResults = Int
  type MaxTagResults = Int
  type PaginationToken = String
  type PlaybackURL = String
  type ResourceArn = String
  type StreamKeyArn = String
  type StreamKeyArnList = js.Array[StreamKeyArn]
  type StreamKeyList = js.Array[StreamKeySummary]
  type StreamKeyValue = String
  type StreamKeys = js.Array[StreamKey]
  type StreamList = js.Array[StreamSummary]
  type StreamMetadata = String
  type StreamStartTime = js.Date
  type StreamViewerCount = Double
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagValue = String
  type Tags = js.Dictionary[TagValue]
  type errorCode = String
  type errorMessage = String

  implicit final class IVSOps(private val service: IVS) extends AnyVal {

    @inline def batchGetChannelFuture(params: BatchGetChannelRequest): Future[BatchGetChannelResponse] = service.batchGetChannel(params).promise().toFuture
    @inline def batchGetStreamKeyFuture(params: BatchGetStreamKeyRequest): Future[BatchGetStreamKeyResponse] = service.batchGetStreamKey(params).promise().toFuture
    @inline def createChannelFuture(params: CreateChannelRequest): Future[CreateChannelResponse] = service.createChannel(params).promise().toFuture
    @inline def createStreamKeyFuture(params: CreateStreamKeyRequest): Future[CreateStreamKeyResponse] = service.createStreamKey(params).promise().toFuture
    @inline def deleteChannelFuture(params: DeleteChannelRequest): Future[js.Object] = service.deleteChannel(params).promise().toFuture
    @inline def deleteStreamKeyFuture(params: DeleteStreamKeyRequest): Future[js.Object] = service.deleteStreamKey(params).promise().toFuture
    @inline def getChannelFuture(params: GetChannelRequest): Future[GetChannelResponse] = service.getChannel(params).promise().toFuture
    @inline def getStreamFuture(params: GetStreamRequest): Future[GetStreamResponse] = service.getStream(params).promise().toFuture
    @inline def getStreamKeyFuture(params: GetStreamKeyRequest): Future[GetStreamKeyResponse] = service.getStreamKey(params).promise().toFuture
    @inline def listChannelsFuture(params: ListChannelsRequest): Future[ListChannelsResponse] = service.listChannels(params).promise().toFuture
    @inline def listStreamKeysFuture(params: ListStreamKeysRequest): Future[ListStreamKeysResponse] = service.listStreamKeys(params).promise().toFuture
    @inline def listStreamsFuture(params: ListStreamsRequest): Future[ListStreamsResponse] = service.listStreams(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] = service.listTagsForResource(params).promise().toFuture
    @inline def putMetadataFuture(params: PutMetadataRequest): Future[js.Object] = service.putMetadata(params).promise().toFuture
    @inline def stopStreamFuture(params: StopStreamRequest): Future[StopStreamResponse] = service.stopStream(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] = service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] = service.untagResource(params).promise().toFuture
    @inline def updateChannelFuture(params: UpdateChannelRequest): Future[UpdateChannelResponse] = service.updateChannel(params).promise().toFuture

  }
}

package ivs {
  @js.native
  @JSImport("aws-sdk/clients/ivs", JSImport.Namespace, "AWS.IVS")
  class IVS() extends js.Object {
    def this(config: AWSConfig) = this()

    def batchGetChannel(params: BatchGetChannelRequest): Request[BatchGetChannelResponse] = js.native
    def batchGetStreamKey(params: BatchGetStreamKeyRequest): Request[BatchGetStreamKeyResponse] = js.native
    def createChannel(params: CreateChannelRequest): Request[CreateChannelResponse] = js.native
    def createStreamKey(params: CreateStreamKeyRequest): Request[CreateStreamKeyResponse] = js.native
    def deleteChannel(params: DeleteChannelRequest): Request[js.Object] = js.native
    def deleteStreamKey(params: DeleteStreamKeyRequest): Request[js.Object] = js.native
    def getChannel(params: GetChannelRequest): Request[GetChannelResponse] = js.native
    def getStream(params: GetStreamRequest): Request[GetStreamResponse] = js.native
    def getStreamKey(params: GetStreamKeyRequest): Request[GetStreamKeyResponse] = js.native
    def listChannels(params: ListChannelsRequest): Request[ListChannelsResponse] = js.native
    def listStreamKeys(params: ListStreamKeysRequest): Request[ListStreamKeysResponse] = js.native
    def listStreams(params: ListStreamsRequest): Request[ListStreamsResponse] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def putMetadata(params: PutMetadataRequest): Request[js.Object] = js.native
    def stopStream(params: StopStreamRequest): Request[StopStreamResponse] = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse] = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse] = js.native
    def updateChannel(params: UpdateChannelRequest): Request[UpdateChannelResponse] = js.native
  }

  /**
    * Error related to a specific channel, specified by its ARN.
    */
  @js.native
  trait BatchError extends js.Object {
    var arn: js.UndefOr[ResourceArn]
    var code: js.UndefOr[errorCode]
    var message: js.UndefOr[errorMessage]
  }

  object BatchError {
    @inline
    def apply(
        arn: js.UndefOr[ResourceArn] = js.undefined,
        code: js.UndefOr[errorCode] = js.undefined,
        message: js.UndefOr[errorMessage] = js.undefined
    ): BatchError = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      code.foreach(__v => __obj.updateDynamic("code")(__v.asInstanceOf[js.Any]))
      message.foreach(__v => __obj.updateDynamic("message")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchError]
    }
  }

  @js.native
  trait BatchGetChannelRequest extends js.Object {
    var arns: ChannelArnList
  }

  object BatchGetChannelRequest {
    @inline
    def apply(
        arns: ChannelArnList
    ): BatchGetChannelRequest = {
      val __obj = js.Dynamic.literal(
        "arns" -> arns.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[BatchGetChannelRequest]
    }
  }

  @js.native
  trait BatchGetChannelResponse extends js.Object {
    var channels: js.UndefOr[Channels]
    var errors: js.UndefOr[BatchErrors]
  }

  object BatchGetChannelResponse {
    @inline
    def apply(
        channels: js.UndefOr[Channels] = js.undefined,
        errors: js.UndefOr[BatchErrors] = js.undefined
    ): BatchGetChannelResponse = {
      val __obj = js.Dynamic.literal()
      channels.foreach(__v => __obj.updateDynamic("channels")(__v.asInstanceOf[js.Any]))
      errors.foreach(__v => __obj.updateDynamic("errors")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchGetChannelResponse]
    }
  }

  @js.native
  trait BatchGetStreamKeyRequest extends js.Object {
    var arns: StreamKeyArnList
  }

  object BatchGetStreamKeyRequest {
    @inline
    def apply(
        arns: StreamKeyArnList
    ): BatchGetStreamKeyRequest = {
      val __obj = js.Dynamic.literal(
        "arns" -> arns.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[BatchGetStreamKeyRequest]
    }
  }

  @js.native
  trait BatchGetStreamKeyResponse extends js.Object {
    var errors: js.UndefOr[BatchErrors]
    var streamKeys: js.UndefOr[StreamKeys]
  }

  object BatchGetStreamKeyResponse {
    @inline
    def apply(
        errors: js.UndefOr[BatchErrors] = js.undefined,
        streamKeys: js.UndefOr[StreamKeys] = js.undefined
    ): BatchGetStreamKeyResponse = {
      val __obj = js.Dynamic.literal()
      errors.foreach(__v => __obj.updateDynamic("errors")(__v.asInstanceOf[js.Any]))
      streamKeys.foreach(__v => __obj.updateDynamic("streamKeys")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchGetStreamKeyResponse]
    }
  }

  /**
    * Object specifying a channel.
    */
  @js.native
  trait Channel extends js.Object {
    var arn: js.UndefOr[ChannelArn]
    var ingestEndpoint: js.UndefOr[IngestEndpoint]
    var latencyMode: js.UndefOr[ChannelLatencyMode]
    var name: js.UndefOr[ChannelName]
    var playbackUrl: js.UndefOr[PlaybackURL]
    var tags: js.UndefOr[Tags]
    var `type`: js.UndefOr[ChannelType]
  }

  object Channel {
    @inline
    def apply(
        arn: js.UndefOr[ChannelArn] = js.undefined,
        ingestEndpoint: js.UndefOr[IngestEndpoint] = js.undefined,
        latencyMode: js.UndefOr[ChannelLatencyMode] = js.undefined,
        name: js.UndefOr[ChannelName] = js.undefined,
        playbackUrl: js.UndefOr[PlaybackURL] = js.undefined,
        tags: js.UndefOr[Tags] = js.undefined,
        `type`: js.UndefOr[ChannelType] = js.undefined
    ): Channel = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      ingestEndpoint.foreach(__v => __obj.updateDynamic("ingestEndpoint")(__v.asInstanceOf[js.Any]))
      latencyMode.foreach(__v => __obj.updateDynamic("latencyMode")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      playbackUrl.foreach(__v => __obj.updateDynamic("playbackUrl")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      `type`.foreach(__v => __obj.updateDynamic("type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Channel]
    }
  }

  @js.native
  sealed trait ChannelLatencyMode extends js.Any
  object ChannelLatencyMode {
    val NORMAL = "NORMAL".asInstanceOf[ChannelLatencyMode]
    val LOW = "LOW".asInstanceOf[ChannelLatencyMode]

    @inline def values = js.Array(NORMAL, LOW)
  }

  /**
    * Summary information about a channel.
    */
  @js.native
  trait ChannelSummary extends js.Object {
    var arn: js.UndefOr[ChannelArn]
    var latencyMode: js.UndefOr[ChannelLatencyMode]
    var name: js.UndefOr[ChannelName]
    var tags: js.UndefOr[Tags]
  }

  object ChannelSummary {
    @inline
    def apply(
        arn: js.UndefOr[ChannelArn] = js.undefined,
        latencyMode: js.UndefOr[ChannelLatencyMode] = js.undefined,
        name: js.UndefOr[ChannelName] = js.undefined,
        tags: js.UndefOr[Tags] = js.undefined
    ): ChannelSummary = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      latencyMode.foreach(__v => __obj.updateDynamic("latencyMode")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ChannelSummary]
    }
  }

  @js.native
  sealed trait ChannelType extends js.Any
  object ChannelType {
    val BASIC = "BASIC".asInstanceOf[ChannelType]
    val STANDARD = "STANDARD".asInstanceOf[ChannelType]

    @inline def values = js.Array(BASIC, STANDARD)
  }

  @js.native
  trait CreateChannelRequest extends js.Object {
    var latencyMode: js.UndefOr[ChannelLatencyMode]
    var name: js.UndefOr[ChannelName]
    var tags: js.UndefOr[Tags]
    var `type`: js.UndefOr[ChannelType]
  }

  object CreateChannelRequest {
    @inline
    def apply(
        latencyMode: js.UndefOr[ChannelLatencyMode] = js.undefined,
        name: js.UndefOr[ChannelName] = js.undefined,
        tags: js.UndefOr[Tags] = js.undefined,
        `type`: js.UndefOr[ChannelType] = js.undefined
    ): CreateChannelRequest = {
      val __obj = js.Dynamic.literal()
      latencyMode.foreach(__v => __obj.updateDynamic("latencyMode")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      `type`.foreach(__v => __obj.updateDynamic("type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateChannelRequest]
    }
  }

  @js.native
  trait CreateChannelResponse extends js.Object {
    var channel: js.UndefOr[Channel]
    var streamKey: js.UndefOr[StreamKey]
  }

  object CreateChannelResponse {
    @inline
    def apply(
        channel: js.UndefOr[Channel] = js.undefined,
        streamKey: js.UndefOr[StreamKey] = js.undefined
    ): CreateChannelResponse = {
      val __obj = js.Dynamic.literal()
      channel.foreach(__v => __obj.updateDynamic("channel")(__v.asInstanceOf[js.Any]))
      streamKey.foreach(__v => __obj.updateDynamic("streamKey")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateChannelResponse]
    }
  }

  @js.native
  trait CreateStreamKeyRequest extends js.Object {
    var channelArn: ChannelArn
    var tags: js.UndefOr[Tags]
  }

  object CreateStreamKeyRequest {
    @inline
    def apply(
        channelArn: ChannelArn,
        tags: js.UndefOr[Tags] = js.undefined
    ): CreateStreamKeyRequest = {
      val __obj = js.Dynamic.literal(
        "channelArn" -> channelArn.asInstanceOf[js.Any]
      )

      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateStreamKeyRequest]
    }
  }

  @js.native
  trait CreateStreamKeyResponse extends js.Object {
    var streamKey: js.UndefOr[StreamKey]
  }

  object CreateStreamKeyResponse {
    @inline
    def apply(
        streamKey: js.UndefOr[StreamKey] = js.undefined
    ): CreateStreamKeyResponse = {
      val __obj = js.Dynamic.literal()
      streamKey.foreach(__v => __obj.updateDynamic("streamKey")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateStreamKeyResponse]
    }
  }

  @js.native
  trait DeleteChannelRequest extends js.Object {
    var arn: ChannelArn
  }

  object DeleteChannelRequest {
    @inline
    def apply(
        arn: ChannelArn
    ): DeleteChannelRequest = {
      val __obj = js.Dynamic.literal(
        "arn" -> arn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteChannelRequest]
    }
  }

  @js.native
  trait DeleteStreamKeyRequest extends js.Object {
    var arn: StreamKeyArn
  }

  object DeleteStreamKeyRequest {
    @inline
    def apply(
        arn: StreamKeyArn
    ): DeleteStreamKeyRequest = {
      val __obj = js.Dynamic.literal(
        "arn" -> arn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteStreamKeyRequest]
    }
  }

  @js.native
  trait GetChannelRequest extends js.Object {
    var arn: ChannelArn
  }

  object GetChannelRequest {
    @inline
    def apply(
        arn: ChannelArn
    ): GetChannelRequest = {
      val __obj = js.Dynamic.literal(
        "arn" -> arn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetChannelRequest]
    }
  }

  @js.native
  trait GetChannelResponse extends js.Object {
    var channel: js.UndefOr[Channel]
  }

  object GetChannelResponse {
    @inline
    def apply(
        channel: js.UndefOr[Channel] = js.undefined
    ): GetChannelResponse = {
      val __obj = js.Dynamic.literal()
      channel.foreach(__v => __obj.updateDynamic("channel")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetChannelResponse]
    }
  }

  @js.native
  trait GetStreamKeyRequest extends js.Object {
    var arn: StreamKeyArn
  }

  object GetStreamKeyRequest {
    @inline
    def apply(
        arn: StreamKeyArn
    ): GetStreamKeyRequest = {
      val __obj = js.Dynamic.literal(
        "arn" -> arn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetStreamKeyRequest]
    }
  }

  @js.native
  trait GetStreamKeyResponse extends js.Object {
    var streamKey: js.UndefOr[StreamKey]
  }

  object GetStreamKeyResponse {
    @inline
    def apply(
        streamKey: js.UndefOr[StreamKey] = js.undefined
    ): GetStreamKeyResponse = {
      val __obj = js.Dynamic.literal()
      streamKey.foreach(__v => __obj.updateDynamic("streamKey")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetStreamKeyResponse]
    }
  }

  @js.native
  trait GetStreamRequest extends js.Object {
    var channelArn: ChannelArn
  }

  object GetStreamRequest {
    @inline
    def apply(
        channelArn: ChannelArn
    ): GetStreamRequest = {
      val __obj = js.Dynamic.literal(
        "channelArn" -> channelArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetStreamRequest]
    }
  }

  @js.native
  trait GetStreamResponse extends js.Object {
    var stream: js.UndefOr[Stream]
  }

  object GetStreamResponse {
    @inline
    def apply(
        stream: js.UndefOr[Stream] = js.undefined
    ): GetStreamResponse = {
      val __obj = js.Dynamic.literal()
      stream.foreach(__v => __obj.updateDynamic("stream")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetStreamResponse]
    }
  }

  @js.native
  trait ListChannelsRequest extends js.Object {
    var filterByName: js.UndefOr[ChannelName]
    var maxResults: js.UndefOr[MaxChannelResults]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListChannelsRequest {
    @inline
    def apply(
        filterByName: js.UndefOr[ChannelName] = js.undefined,
        maxResults: js.UndefOr[MaxChannelResults] = js.undefined,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListChannelsRequest = {
      val __obj = js.Dynamic.literal()
      filterByName.foreach(__v => __obj.updateDynamic("filterByName")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListChannelsRequest]
    }
  }

  @js.native
  trait ListChannelsResponse extends js.Object {
    var channels: ChannelList
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListChannelsResponse {
    @inline
    def apply(
        channels: ChannelList,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListChannelsResponse = {
      val __obj = js.Dynamic.literal(
        "channels" -> channels.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListChannelsResponse]
    }
  }

  @js.native
  trait ListStreamKeysRequest extends js.Object {
    var channelArn: ChannelArn
    var maxResults: js.UndefOr[MaxStreamKeyResults]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListStreamKeysRequest {
    @inline
    def apply(
        channelArn: ChannelArn,
        maxResults: js.UndefOr[MaxStreamKeyResults] = js.undefined,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListStreamKeysRequest = {
      val __obj = js.Dynamic.literal(
        "channelArn" -> channelArn.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListStreamKeysRequest]
    }
  }

  @js.native
  trait ListStreamKeysResponse extends js.Object {
    var streamKeys: StreamKeyList
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListStreamKeysResponse {
    @inline
    def apply(
        streamKeys: StreamKeyList,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListStreamKeysResponse = {
      val __obj = js.Dynamic.literal(
        "streamKeys" -> streamKeys.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListStreamKeysResponse]
    }
  }

  @js.native
  trait ListStreamsRequest extends js.Object {
    var maxResults: js.UndefOr[MaxStreamResults]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListStreamsRequest {
    @inline
    def apply(
        maxResults: js.UndefOr[MaxStreamResults] = js.undefined,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListStreamsRequest = {
      val __obj = js.Dynamic.literal()
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListStreamsRequest]
    }
  }

  @js.native
  trait ListStreamsResponse extends js.Object {
    var streams: StreamList
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListStreamsResponse {
    @inline
    def apply(
        streams: StreamList,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListStreamsResponse = {
      val __obj = js.Dynamic.literal(
        "streams" -> streams.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListStreamsResponse]
    }
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var resourceArn: ResourceArn
    var maxResults: js.UndefOr[MaxTagResults]
    var nextToken: js.UndefOr[String]
  }

  object ListTagsForResourceRequest {
    @inline
    def apply(
        resourceArn: ResourceArn,
        maxResults: js.UndefOr[MaxTagResults] = js.undefined,
        nextToken: js.UndefOr[String] = js.undefined
    ): ListTagsForResourceRequest = {
      val __obj = js.Dynamic.literal(
        "resourceArn" -> resourceArn.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceRequest]
    }
  }

  @js.native
  trait ListTagsForResourceResponse extends js.Object {
    var tags: Tags
    var nextToken: js.UndefOr[String]
  }

  object ListTagsForResourceResponse {
    @inline
    def apply(
        tags: Tags,
        nextToken: js.UndefOr[String] = js.undefined
    ): ListTagsForResourceResponse = {
      val __obj = js.Dynamic.literal(
        "tags" -> tags.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceResponse]
    }
  }

  @js.native
  trait PutMetadataRequest extends js.Object {
    var channelArn: ChannelArn
    var metadata: StreamMetadata
  }

  object PutMetadataRequest {
    @inline
    def apply(
        channelArn: ChannelArn,
        metadata: StreamMetadata
    ): PutMetadataRequest = {
      val __obj = js.Dynamic.literal(
        "channelArn" -> channelArn.asInstanceOf[js.Any],
        "metadata" -> metadata.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[PutMetadataRequest]
    }
  }

  @js.native
  trait StopStreamRequest extends js.Object {
    var channelArn: ChannelArn
  }

  object StopStreamRequest {
    @inline
    def apply(
        channelArn: ChannelArn
    ): StopStreamRequest = {
      val __obj = js.Dynamic.literal(
        "channelArn" -> channelArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[StopStreamRequest]
    }
  }

  @js.native
  trait StopStreamResponse extends js.Object {}

  object StopStreamResponse {
    @inline
    def apply(
    ): StopStreamResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[StopStreamResponse]
    }
  }

  /**
    * Specifies a live video stream that has been ingested and distributed.
    */
  @js.native
  trait Stream extends js.Object {
    var channelArn: js.UndefOr[ChannelArn]
    var health: js.UndefOr[StreamHealth]
    var playbackUrl: js.UndefOr[PlaybackURL]
    var startTime: js.UndefOr[StreamStartTime]
    var state: js.UndefOr[StreamState]
    var viewerCount: js.UndefOr[StreamViewerCount]
  }

  object Stream {
    @inline
    def apply(
        channelArn: js.UndefOr[ChannelArn] = js.undefined,
        health: js.UndefOr[StreamHealth] = js.undefined,
        playbackUrl: js.UndefOr[PlaybackURL] = js.undefined,
        startTime: js.UndefOr[StreamStartTime] = js.undefined,
        state: js.UndefOr[StreamState] = js.undefined,
        viewerCount: js.UndefOr[StreamViewerCount] = js.undefined
    ): Stream = {
      val __obj = js.Dynamic.literal()
      channelArn.foreach(__v => __obj.updateDynamic("channelArn")(__v.asInstanceOf[js.Any]))
      health.foreach(__v => __obj.updateDynamic("health")(__v.asInstanceOf[js.Any]))
      playbackUrl.foreach(__v => __obj.updateDynamic("playbackUrl")(__v.asInstanceOf[js.Any]))
      startTime.foreach(__v => __obj.updateDynamic("startTime")(__v.asInstanceOf[js.Any]))
      state.foreach(__v => __obj.updateDynamic("state")(__v.asInstanceOf[js.Any]))
      viewerCount.foreach(__v => __obj.updateDynamic("viewerCount")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Stream]
    }
  }

  @js.native
  sealed trait StreamHealth extends js.Any
  object StreamHealth {
    val HEALTHY = "HEALTHY".asInstanceOf[StreamHealth]
    val STARVING = "STARVING".asInstanceOf[StreamHealth]
    val UNKNOWN = "UNKNOWN".asInstanceOf[StreamHealth]

    @inline def values = js.Array(HEALTHY, STARVING, UNKNOWN)
  }

  /**
    * Object specifying a stream key.
    */
  @js.native
  trait StreamKey extends js.Object {
    var arn: js.UndefOr[StreamKeyArn]
    var channelArn: js.UndefOr[ChannelArn]
    var tags: js.UndefOr[Tags]
    var value: js.UndefOr[StreamKeyValue]
  }

  object StreamKey {
    @inline
    def apply(
        arn: js.UndefOr[StreamKeyArn] = js.undefined,
        channelArn: js.UndefOr[ChannelArn] = js.undefined,
        tags: js.UndefOr[Tags] = js.undefined,
        value: js.UndefOr[StreamKeyValue] = js.undefined
    ): StreamKey = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      channelArn.foreach(__v => __obj.updateDynamic("channelArn")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      value.foreach(__v => __obj.updateDynamic("value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StreamKey]
    }
  }

  /**
    * Summary information about a stream key.
    */
  @js.native
  trait StreamKeySummary extends js.Object {
    var arn: js.UndefOr[StreamKeyArn]
    var channelArn: js.UndefOr[ChannelArn]
    var tags: js.UndefOr[Tags]
  }

  object StreamKeySummary {
    @inline
    def apply(
        arn: js.UndefOr[StreamKeyArn] = js.undefined,
        channelArn: js.UndefOr[ChannelArn] = js.undefined,
        tags: js.UndefOr[Tags] = js.undefined
    ): StreamKeySummary = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      channelArn.foreach(__v => __obj.updateDynamic("channelArn")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StreamKeySummary]
    }
  }

  @js.native
  sealed trait StreamState extends js.Any
  object StreamState {
    val LIVE = "LIVE".asInstanceOf[StreamState]
    val OFFLINE = "OFFLINE".asInstanceOf[StreamState]

    @inline def values = js.Array(LIVE, OFFLINE)
  }

  /**
    * Summary information about a stream.
    */
  @js.native
  trait StreamSummary extends js.Object {
    var channelArn: js.UndefOr[ChannelArn]
    var health: js.UndefOr[StreamHealth]
    var startTime: js.UndefOr[StreamStartTime]
    var state: js.UndefOr[StreamState]
    var viewerCount: js.UndefOr[StreamViewerCount]
  }

  object StreamSummary {
    @inline
    def apply(
        channelArn: js.UndefOr[ChannelArn] = js.undefined,
        health: js.UndefOr[StreamHealth] = js.undefined,
        startTime: js.UndefOr[StreamStartTime] = js.undefined,
        state: js.UndefOr[StreamState] = js.undefined,
        viewerCount: js.UndefOr[StreamViewerCount] = js.undefined
    ): StreamSummary = {
      val __obj = js.Dynamic.literal()
      channelArn.foreach(__v => __obj.updateDynamic("channelArn")(__v.asInstanceOf[js.Any]))
      health.foreach(__v => __obj.updateDynamic("health")(__v.asInstanceOf[js.Any]))
      startTime.foreach(__v => __obj.updateDynamic("startTime")(__v.asInstanceOf[js.Any]))
      state.foreach(__v => __obj.updateDynamic("state")(__v.asInstanceOf[js.Any]))
      viewerCount.foreach(__v => __obj.updateDynamic("viewerCount")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StreamSummary]
    }
  }

  @js.native
  trait TagResourceRequest extends js.Object {
    var resourceArn: ResourceArn
    var tags: Tags
  }

  object TagResourceRequest {
    @inline
    def apply(
        resourceArn: ResourceArn,
        tags: Tags
    ): TagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "resourceArn" -> resourceArn.asInstanceOf[js.Any],
        "tags" -> tags.asInstanceOf[js.Any]
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
        "tagKeys" -> tagKeys.asInstanceOf[js.Any]
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
    var arn: ChannelArn
    var latencyMode: js.UndefOr[ChannelLatencyMode]
    var name: js.UndefOr[ChannelName]
    var `type`: js.UndefOr[ChannelType]
  }

  object UpdateChannelRequest {
    @inline
    def apply(
        arn: ChannelArn,
        latencyMode: js.UndefOr[ChannelLatencyMode] = js.undefined,
        name: js.UndefOr[ChannelName] = js.undefined,
        `type`: js.UndefOr[ChannelType] = js.undefined
    ): UpdateChannelRequest = {
      val __obj = js.Dynamic.literal(
        "arn" -> arn.asInstanceOf[js.Any]
      )

      latencyMode.foreach(__v => __obj.updateDynamic("latencyMode")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      `type`.foreach(__v => __obj.updateDynamic("type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateChannelRequest]
    }
  }

  @js.native
  trait UpdateChannelResponse extends js.Object {
    var channel: js.UndefOr[Channel]
  }

  object UpdateChannelResponse {
    @inline
    def apply(
        channel: js.UndefOr[Channel] = js.undefined
    ): UpdateChannelResponse = {
      val __obj = js.Dynamic.literal()
      channel.foreach(__v => __obj.updateDynamic("channel")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateChannelResponse]
    }
  }
}
